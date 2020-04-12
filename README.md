# Skywalking的webhook演示项目

Skywalking发送告警的基本原理是每隔一段时间轮询skywalking-collector收集到的链路追踪的数据，再根据所配置的告警规则（如服务响应时间、服务响应时间百分比）等，如果达到阈值则发送相应的告警信息。

在Skywalking中通过配置webhook来定制化实现钉钉、微信、邮件告警。



# SkyWalking分布式链路追踪和监控

技术专栏的文章链接

https://learning.snssdk.com/feoffline/toutiao_wallet_bundles/toutiao_learning_wap/online/album_detail.html?content_id=6749520901240258819

