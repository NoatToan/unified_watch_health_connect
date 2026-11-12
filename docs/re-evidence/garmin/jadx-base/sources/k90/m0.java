package k90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lk90/m0;", "", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 {
    static {
        new a(null);
    }

    public static boolean a(yl2.b bVar, l90.b bVar2, String str) {
        if (!yl2.b.b(p13.w.c(bVar)).contains(bVar2.f111522g)) {
            return false;
        }
        if ((d53.w.z(bVar2.f111516a, "fenix", true) || d53.w.z(bVar2.f111521f, "fenix", true)) && c(bVar2) && d53.w.z(str, "fenix", true)) {
            return d53.w.z(str, "solar", true) || d53.w.z(str, "dualpower", true);
        }
        return false;
    }

    public static boolean b(l90.b bVar) {
        return d53.w.z(bVar.f111516a, "quatix", true) || d53.w.z(bVar.f111521f, "quatix", true);
    }

    public static boolean c(l90.b bVar) {
        String str = bVar.f111516a;
        String str2 = bVar.f111521f;
        return d53.w.z(str, "solar", true) || d53.w.z(str2, "solar", true) || d53.w.z(str, "dualpower", true) || d53.w.z(str2, "dualpower", true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lk90/m0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "FENIX_IDENTIFIER", "QUATIX_IDENTIFIER", "TACTIX_IDENTIFIER", "SOLAR_IDENTIFIER", "DUAL_POWER_IDENTIFIER", "BALLISTIC_IDENTIFIER", "TACTIX_DELTA_IDENTIFIER", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
