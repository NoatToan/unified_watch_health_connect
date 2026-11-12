package h33;

import w52.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f81409a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x33.c f81410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x33.b f81411c;

    static {
        x33.c cVar = new x33.c("kotlin.jvm.JvmField");
        f81410b = cVar;
        x33.b.f188590d.getClass();
        x33.b.a.b(cVar);
        x33.b.a.b(new x33.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f81411c = x33.b.a.a("kotlin/jvm/internal/RepeatableContainer", false);
    }

    private b0() {
    }

    public static final String a(String str) {
        str.getClass();
        return b(str) ? str : "get".concat(u0.h(str));
    }

    public static final boolean b(String str) {
        str.getClass();
        if (d53.u.y(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (p005kotlin.jvm.internal.s.h(97, cCharAt) > 0 || p005kotlin.jvm.internal.s.h(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
