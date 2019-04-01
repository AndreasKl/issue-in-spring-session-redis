### Steps to reproduce
- Start the application
- Navigate to http://localhost:8080/login
- Login with user: user pw: 123456
- Navigate to http://localhost:8080/logout
- Press "Log Out"
- Observe the error page and the following stacktrace in your log:

```
java.lang.IllegalStateException: Session was invalidated
	at org.springframework.session.data.redis.ReactiveRedisOperationsSessionRepository.lambda$save$2(ReactiveRedisOperationsSessionRepository.java:159) ~[spring-session-data-redis-2.1.3.RELEASE.jar:2.1.3.RELEASE]
	at reactor.core.publisher.MonoFlatMap$FlatMapMain.onNext(MonoFlatMap.java:118) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.MonoNext$NextSubscriber.onNext(MonoNext.java:76) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxDoFinally$DoFinallySubscriber.onNext(FluxDoFinally.java:123) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxMapFuseable$MapFuseableSubscriber.onNext(FluxMapFuseable.java:121) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.MonoNext$NextSubscriber.onNext(MonoNext.java:76) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnErrorResume$ResumeSubscriber.onNext(FluxOnErrorResume.java:73) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.MonoFlatMapMany$FlatMapManyInner.onNext(MonoFlatMapMany.java:238) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxConcatMap$ConcatMapImmediate.innerNext(FluxConcatMap.java:275) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxConcatMap$ConcatMapInner.onNext(FluxConcatMap.java:849) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxMapFuseable$MapFuseableSubscriber.onNext(FluxMapFuseable.java:121) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxMapFuseable$MapFuseableSubscriber.onNext(FluxMapFuseable.java:121) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.FluxOnAssembly$OnAssemblySubscriber.onNext(FluxOnAssembly.java:353) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at reactor.core.publisher.MonoNext$NextSubscriber.onNext(MonoNext.java:76) ~[reactor-core-3.2.5.RELEASE.jar:3.2.5.RELEASE]
	at io.lettuce.core.RedisPublisher$RedisSubscription.onNext(RedisPublisher.java:270) ~[lettuce-core-5.1.3.RELEASE.jar:na]
	at io.lettuce.core.RedisPublisher$SubscriptionCommand.complete(RedisPublisher.java:754) ~[lettuce-core-5.1.3.RELEASE.jar:na]
	at io.lettuce.core.protocol.CommandHandler.complete(CommandHandler.java:646) ~[lettuce-core-5.1.3.RELEASE.jar:na]
	at io.lettuce.core.protocol.CommandHandler.decode(CommandHandler.java:604) ~[lettuce-core-5.1.3.RELEASE.jar:na]
	at io.lettuce.core.protocol.CommandHandler.channelRead(CommandHandler.java:556) ~[lettuce-core-5.1.3.RELEASE.jar:na]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.ChannelInboundHandlerAdapter.channelRead(ChannelInboundHandlerAdapter.java:86) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.ChannelInboundHandlerAdapter.channelRead(ChannelInboundHandlerAdapter.java:86) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1434) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:965) ~[netty-transport-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:799) ~[netty-transport-native-epoll-4.1.31.Final-linux-x86_64.jar:4.1.31.Final]
	at io.netty.channel.epoll.EpollEventLoop.processReady(EpollEventLoop.java:433) ~[netty-transport-native-epoll-4.1.31.Final-linux-x86_64.jar:4.1.31.Final]
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:330) ~[netty-transport-native-epoll-4.1.31.Final-linux-x86_64.jar:4.1.31.Final]
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:897) ~[netty-common-4.1.31.Final.jar:4.1.31.Final]
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.31.Final.jar:4.1.31.Final]
	at java.base/java.lang.Thread.run(Thread.java:834) ~[na:na]
	Suppressed: reactor.core.publisher.FluxOnAssembly$OnAssemblyException: 
Assembly trace from producer [reactor.core.publisher.MonoFlatMap] :
	reactor.core.publisher.Mono.flatMap(Mono.java:2491)
	org.springframework.session.data.redis.ReactiveRedisOperationsSessionRepository.save(ReactiveRedisOperationsSessionRepository.java:159)
Error has been observed by the following operator(s):
	|_	Mono.flatMap ⇢ org.springframework.session.data.redis.ReactiveRedisOperationsSessionRepository.save(ReactiveRedisOperationsSessionRepository.java:159)
	|_	Flux.concat ⇢ org.springframework.http.server.reactive.AbstractServerHttpResponse.doCommit(AbstractServerHttpResponse.java:234)
	|_	Flux.then ⇢ org.springframework.http.server.reactive.AbstractServerHttpResponse.doCommit(AbstractServerHttpResponse.java:234)
	|_	Mono.doOnError ⇢ org.springframework.http.server.reactive.AbstractServerHttpResponse.writeWith(AbstractServerHttpResponse.java:179)
	|_	Mono.flatMap ⇢ org.springframework.http.codec.EncoderHttpMessageWriter.write(EncoderHttpMessageWriter.java:126)
	|_	Mono.flatMap ⇢ org.springframework.boot.autoconfigure.web.reactive.error.AbstractErrorWebExceptionHandler.handle(AbstractErrorWebExceptionHandler.java:247)
	|_	Mono.onErrorResume ⇢ org.springframework.web.server.handler.ExceptionHandlingWebHandler.handle(ExceptionHandlingWebHandler.java:68)
	|_	Mono.error ⇢ org.springframework.web.server.handler.ResponseStatusExceptionHandler.handle(ResponseStatusExceptionHandler.java:67)
	|_	Mono.onErrorResume ⇢ org.springframework.web.server.handler.ExceptionHandlingWebHandler.handle(ExceptionHandlingWebHandler.java:68)
	|_	Mono.doOnSuccess ⇢ org.springframework.web.server.adapter.HttpWebHandlerAdapter.handle(HttpWebHandlerAdapter.java:247)
```
