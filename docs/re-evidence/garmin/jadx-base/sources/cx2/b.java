package cx2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcx2/b;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56665a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f56666b = new h("Conversions", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcx2/b$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static long a(String str) {
            str.getClass();
            try {
                return (long) Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                h hVar = b.f56666b;
                str.concat(" cannot be converted to Long");
                hVar.getClass();
                return -1L;
            }
        }

        public static double b(String str) {
            try {
                String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    return Double.parseDouble(str2);
                }
                return -1.0d;
            } catch (NumberFormatException unused) {
                h hVar = b.f56666b;
                "Number format exception ".concat(str);
                hVar.getClass();
                return -1.0d;
            }
        }

        public static int c(String str) {
            if (str != null) {
                try {
                    String str2 = str.length() > 0 ? str : null;
                    if (str2 != null) {
                        a aVar = b.f56665a;
                        double d14 = Double.parseDouble(str2);
                        aVar.getClass();
                        return (int) d14;
                    }
                } catch (NumberFormatException unused) {
                    h hVar = b.f56666b;
                    "Number format exception ".concat(str);
                    hVar.getClass();
                }
            }
            return -1;
        }

        private a() {
        }
    }
}
