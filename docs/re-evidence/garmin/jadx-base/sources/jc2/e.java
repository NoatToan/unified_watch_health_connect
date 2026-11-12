package jc2;

import android.os.Build;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljc2/e;", "", "<init>", "()V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f98177a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f98178b = m.b(a.f98180a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f98179c = m.b(b.f98181a);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends w implements e23.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f98180a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final String invoke() {
            e.f98177a.getClass();
            try {
                ClassLoader classLoader = Class.forName("ohos.utils.system.SystemCapability").getClassLoader();
                return (classLoader != null && classLoader.getParent() == null) ? "Harmony" : "Android";
            } catch (Throwable unused) {
                return "Android";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends w implements e23.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f98181a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final String invoke() {
            String string;
            String string2;
            e.f98177a.getClass();
            try {
                ClassLoader classLoader = Class.forName("ohos.utils.system.SystemCapability").getClassLoader();
                if (classLoader != null && classLoader.getParent() == null) {
                    try {
                        Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "hw_sc.build.platform.version");
                        string = objInvoke != null ? objInvoke.toString() : null;
                        if (string != null && d53.w.J(string)) {
                            string = null;
                        }
                    } catch (Throwable unused) {
                    }
                    if (string != null) {
                        return string;
                    }
                    e.f98177a.getClass();
                    try {
                        Object objInvoke2 = Class.forName("ohos.system.version.SystemVersion").getDeclaredMethod("getVersion", null).invoke(null, null);
                        if (objInvoke2 == null || (string2 = objInvoke2.toString()) == null) {
                            string2 = Build.VERSION.RELEASE;
                        }
                        string2.getClass();
                    } catch (Throwable unused2) {
                        string2 = Build.VERSION.RELEASE;
                        string2.getClass();
                    }
                    return string2;
                }
            } catch (Throwable unused3) {
            }
            return Build.VERSION.RELEASE;
        }
    }

    private e() {
    }

    public static String a() {
        Object value = f98179c.getValue();
        value.getClass();
        return (String) value;
    }
}
