package zg2;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg2/c;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f204692a = new c();

    private c() {
    }

    public static void a(String str, String str2) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.h("LiveActivity").debug(e(str, str2));
    }

    public static void b(String str, String str2) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.h("LiveActivity").error(e(str, str2));
    }

    public static void c(String str, Throwable th3) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.h("LiveActivity").error(e(str, th3.toString()));
    }

    public static void d(String str, String str2) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.h("LiveActivity").info(e(str, str2));
    }

    public static String e(String str, String str2) {
        return e5.g(str, " - ", str2);
    }
}
