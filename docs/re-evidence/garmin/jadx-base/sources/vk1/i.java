package vk1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvk1/i;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f178635a = new i();

    private i() {
    }

    public static final int a(int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        return Math.round((i14 * 100) / i15);
    }

    public static int b(int i14, int i15) {
        return Math.round((i14 / 100) * i15);
    }

    public static void c(f fVar) {
        fVar.getClass();
        int iB = b(fVar.f178623m, fVar.f178621k);
        fVar.f178615e = iB;
        if (iB < 30) {
            fVar.f178615e = 30;
        }
        int iB2 = b(fVar.f178624n, fVar.f178621k);
        fVar.f178616f = iB2;
        int i14 = fVar.f178615e;
        if (iB2 <= i14) {
            fVar.f178616f = i14 + 1;
        }
        int iB3 = b(fVar.f178625o, fVar.f178621k);
        fVar.f178617g = iB3;
        int i15 = fVar.f178616f;
        if (iB3 <= i15) {
            fVar.f178617g = i15 + 1;
        }
        int iB4 = b(fVar.f178626p, fVar.f178621k);
        fVar.f178618h = iB4;
        int i16 = fVar.f178617g;
        if (iB4 <= i16) {
            fVar.f178618h = i16 + 1;
        }
        int iB5 = b(fVar.f178627q, fVar.f178621k);
        fVar.f178619i = iB5;
        int i17 = fVar.f178618h;
        if (iB5 <= i17) {
            fVar.f178619i = i17 + 1;
        }
        fVar.f178628r = 100;
    }

    public static void d(f fVar) {
        fVar.getClass();
        fVar.f178623m = a(fVar.f178615e, fVar.f178621k);
        fVar.f178624n = a(fVar.f178616f, fVar.f178621k);
        fVar.f178625o = a(fVar.f178617g, fVar.f178621k);
        fVar.f178626p = a(fVar.f178618h, fVar.f178621k);
        fVar.f178627q = a(fVar.f178619i, fVar.f178621k);
        fVar.f178628r = 100;
    }
}
