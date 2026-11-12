package io.netty.util;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.InjectAccessors;
import com.oracle.svm.core.annotate.TargetClass;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes22.dex */
@TargetClass(NetUtil.class)
final class NetUtilSubstitutions {

    @Alias
    @InjectAccessors(NetUtilLocalhostAccessor.class)
    public static InetAddress LOCALHOST;

    @Alias
    @InjectAccessors(NetUtilLocalhost4Accessor.class)
    public static Inet4Address LOCALHOST4;

    @Alias
    @InjectAccessors(NetUtilLocalhost6Accessor.class)
    public static Inet6Address LOCALHOST6;

    public static final class NetUtilLocalhost4Accessor {
        private NetUtilLocalhost4Accessor() {
        }

        public static Inet4Address get() {
            return NetUtilLocalhost4LazyHolder.LOCALHOST4;
        }

        public static void set(Inet4Address inet4Address) {
        }
    }

    public static final class NetUtilLocalhost4LazyHolder {
        private static final Inet4Address LOCALHOST4 = NetUtilInitializations.createLocalhost4();

        private NetUtilLocalhost4LazyHolder() {
        }
    }

    public static final class NetUtilLocalhost6Accessor {
        private NetUtilLocalhost6Accessor() {
        }

        public static Inet6Address get() {
            return NetUtilLocalhost6LazyHolder.LOCALHOST6;
        }

        public static void set(Inet6Address inet6Address) {
        }
    }

    public static final class NetUtilLocalhost6LazyHolder {
        private static final Inet6Address LOCALHOST6 = NetUtilInitializations.createLocalhost6();

        private NetUtilLocalhost6LazyHolder() {
        }
    }

    public static final class NetUtilLocalhostAccessor {
        private NetUtilLocalhostAccessor() {
        }

        public static InetAddress get() {
            return NetUtilLocalhostLazyHolder.LOCALHOST;
        }

        public static void set(InetAddress inetAddress) {
        }
    }

    public static final class NetUtilLocalhostLazyHolder {
        private static final InetAddress LOCALHOST = NetUtilInitializations.determineLoopback(NetUtilLocalhost4LazyHolder.LOCALHOST4, NetUtilLocalhost6LazyHolder.LOCALHOST6).address();

        private NetUtilLocalhostLazyHolder() {
        }
    }

    private NetUtilSubstitutions() {
    }
}
