由于作者最近频繁在迁移数据，因而基于 Spring Boot + MyBatis 写了两套模板：数据增删改查模板和数据迁移模板，辅之以两篇博客文章作为姊妹篇进行说明，前者可以说是后者的基础。本项目是数据增删改查模板，在下面第一篇博客文章里有介绍。

> 💬相关
>
> 博客文章《基于Spring Boot + MyBatis的数据增删改查模板》
>
> https://blog.csdn.net/weixin_42077074/article/details/128868655
>
> 博客文章《基于Spring Boot + MyBatis的数据迁移模板》
>
> https://blog.csdn.net/weixin_42077074/article/details/129802650

在下面的博客文章中有详细介绍 MyBatis 部分的实现。

> 💬相关
>
> 博客文章《基于MyBatis依次、批量、分页增删改查》
>
> https://blog.csdn.net/weixin_42077074/article/details/129405833

启动整个项目就是常规 Spring Boot 的操作，运行启动类 `StarterDataCenter.java`。

其中，如果嫌麻烦，可以借助 Python 根据 JSON 快速生成生成相关代码。

具体使用过程为：在 `script` 文件夹下，在 `config.properties` 里填写相应参数，随后在 `input.json` 里加上你的 JSON 数据（暂不支持嵌套），其后运行 `generate_template.py` 即可生成模板相关的代码段（目前是 6 个 txt 文件），将代码段替换项目中对应位置的示例代码即可。

注意，运行 `generate_template.py` 要求 Python 版本在 3.6 及以上，还要安装 json 和 configparser 模块

```shell
pip install json configparser
```

此外，还可以运行 `script` 文件夹下的 `generate_mock_data.py` 生成随机数据 `mock_data.json` 供测试。
