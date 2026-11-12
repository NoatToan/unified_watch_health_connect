package defpackage;

import java.time.Instant;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0017¨\u0006\u0013"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "<init>", "()V", "sdkIsNullOrAtLeast", "", "version", "", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "defaultPlatformRandom", "Lkotlin/random/Random;", "getSystemClock", "Lkotlin/time/Clock;", "ReflectSdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class zbv extends zbu {

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "<init>", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class b {
        public static final b d = new b();
        public static final Integer e;

        private b() {
        }

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            e = num2;
        }
    }

    private final boolean d(int i) {
        return b.e == null || b.e.intValue() >= i;
    }

    @Override // defpackage.zbq
    public zep d(MatchResult matchResult, String str) {
        zcp.c(matchResult, "");
        zcp.c(str, "");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        zdl zdlVar = new zdl(matcher.start(str), matcher.end(str) - 1);
        if (zdlVar.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(str);
        zcp.b((Object) strGroup, "");
        return new zep(strGroup, zdlVar);
    }

    @Override // defpackage.zbq
    public Random b() {
        return d(34) ? new zdg() : super.b();
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/internal/jdk8/JDK8PlatformImplementations$getSystemClock$1", "Lkotlin/time/Clock;", "now", "Lkotlin/time/Instant;", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Clock {
        c() {
        }

        @Override // kotlin.time.Clock
        public zfq now() {
            Instant instantNow = Instant.now();
            zcp.b((Object) instantNow, "");
            return toJavaInstant.e(instantNow);
        }
    }

    @Override // defpackage.zbq
    public Clock e() {
        return d(26) ? new c() : new d();
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/internal/jdk8/JDK8PlatformImplementations$getSystemClock$2", "Lkotlin/time/Clock;", "now", "Lkotlin/time/Instant;", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Clock {
        d() {
        }

        @Override // kotlin.time.Clock
        public zfq now() {
            return zfq.d.c(System.currentTimeMillis());
        }
    }
}
