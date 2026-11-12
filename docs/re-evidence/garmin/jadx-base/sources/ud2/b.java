package ud2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lud2/b;", "", "<init>", "()V", "geolocation-rest-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f170019a = new b();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170020a;

        static {
            int[] iArr = new int[ve2.e.values().length];
            try {
                iArr[ve2.e.f177704d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.e.f177705e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve2.e.f177706f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f170020a = iArr;
        }
    }

    private b() {
    }

    public static String a(Context context, String str) {
        context.getClass();
        return context.getSharedPreferences("geolocation_settings", 0).getString("keyCountry", str);
    }

    public static String b(ve2.e eVar) {
        eVar.getClass();
        int i14 = a.f170020a[eVar.ordinal()];
        if (i14 != 1) {
            return (i14 == 2 || i14 == 3) ? "https://geolocation.garmin.cn" : "https://geolocation-test.garmin.com";
        }
        return "https://geolocation.garmin.com";
    }

    public static void c(Context context, String str) {
        context.getClass();
        context.getSharedPreferences("geolocation_settings", 0).edit().putString("keyCountry", str).commit();
    }
}
