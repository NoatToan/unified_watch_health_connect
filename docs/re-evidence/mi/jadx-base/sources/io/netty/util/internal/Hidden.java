package io.netty.util.internal;

import io.netty.util.concurrent.FastThreadLocalThread;
import java.util.function.Function;
import java.util.function.Predicate;
import reactor.blockhound.BlockHound;
import reactor.blockhound.integration.BlockHoundIntegration;

/* JADX INFO: loaded from: classes2.dex */
class Hidden {

    @SuppressJava6Requirement(reason = "BlockHound is Java 8+, but this class is only loaded by it's SPI")
    public static final class NettyBlockHoundIntegration implements BlockHoundIntegration {
        public void applyTo(BlockHound.Builder builder) {
            builder.allowBlockingCallsInside("io.netty.channel.nio.NioEventLoop", "handleLoopException");
            builder.allowBlockingCallsInside("io.netty.channel.kqueue.KQueueEventLoop", "handleLoopException");
            builder.allowBlockingCallsInside("io.netty.channel.epoll.EpollEventLoop", "handleLoopException");
            builder.allowBlockingCallsInside("io.netty.util.HashedWheelTimer$Worker", "waitForNextTick");
            builder.allowBlockingCallsInside("io.netty.util.concurrent.SingleThreadEventExecutor", "confirmShutdown");
            builder.nonBlockingThreadPredicate(new Function<Predicate<Thread>, Predicate<Thread>>() { // from class: io.netty.util.internal.Hidden.NettyBlockHoundIntegration.1
                @Override // java.util.function.Function
                public Predicate<Thread> apply(final Predicate<Thread> predicate) {
                    return new Predicate<Thread>() { // from class: io.netty.util.internal.Hidden.NettyBlockHoundIntegration.1.1
                        @Override // java.util.function.Predicate
                        @SuppressJava6Requirement(reason = "Predicate#test")
                        public boolean test(Thread thread) {
                            return predicate.test(thread) || (thread instanceof FastThreadLocalThread);
                        }
                    };
                }
            });
        }

        public int compareTo(BlockHoundIntegration blockHoundIntegration) {
            return 0;
        }
    }
}
