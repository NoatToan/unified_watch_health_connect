package defpackage;

import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0017¨\u0006\u0016"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "<init>", "()V", "addSuppressed", "", "cause", "", TrackConstants$Events.EXCEPTION, "getSuppressed", "", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "defaultPlatformRandom", "Lkotlin/random/Random;", "getSystemClock", "Lkotlin/time/Clock;", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class zbq {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "<init>", "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f53968a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f53969c;
        public static final c d = new c();

        private c() {
        }

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            zcp.e(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i];
                if (zcp.b((Object) method2.getName(), (Object) "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    zcp.b((Object) parameterTypes, "");
                    if (zcp.b(yzk.b(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i++;
            }
            f53969c = method2;
            for (Method method3 : methods) {
                if (zcp.b((Object) method3.getName(), (Object) "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f53968a = method;
        }
    }

    public void c(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        zcp.c(th, "");
        zcp.c(th2, "");
        Method method = c.f53969c;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public zep d(MatchResult matchResult, String str) {
        zcp.c(matchResult, "");
        zcp.c(str, "");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public Random b() {
        return new zdc();
    }

    public Clock e() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
