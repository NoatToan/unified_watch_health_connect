package defpackage;

import com.xiaomi.push.jr;

/* JADX INFO: loaded from: classes11.dex */
public class m3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25729a = Integer.MAX_VALUE;

    public static void a(r2t r2tVar, byte b2) {
        b(r2tVar, b2, f25729a);
    }

    public static void b(r2t r2tVar, byte b2, int i) throws jr {
        if (i <= 0) {
            throw new jr("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b2) {
            case 2:
                r2tVar.y();
                return;
            case 3:
                r2tVar.a();
                return;
            case 4:
                r2tVar.b();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                r2tVar.l();
                return;
            case 8:
                r2tVar.c();
                return;
            case 10:
                r2tVar.d();
                return;
            case 11:
                r2tVar.f();
                return;
            case 12:
                r2tVar.k();
                while (true) {
                    byte b3 = r2tVar.g().f24589b;
                    if (b3 == 0) {
                        r2tVar.D();
                        return;
                    } else {
                        b(r2tVar, b3, i - 1);
                        r2tVar.E();
                    }
                }
                break;
            case 13:
                p2t p2tVarI = r2tVar.i();
                while (i2 < p2tVarI.c) {
                    int i3 = i - 1;
                    b(r2tVar, p2tVarI.f29949a, i3);
                    b(r2tVar, p2tVarI.f29950b, i3);
                    i2++;
                }
                r2tVar.F();
                return;
            case 14:
                t3t t3tVarJ = r2tVar.j();
                while (i2 < t3tVarJ.f34283b) {
                    b(r2tVar, t3tVarJ.f34282a, i - 1);
                    i2++;
                }
                r2tVar.H();
                return;
            case 15:
                n2t n2tVarH = r2tVar.h();
                while (i2 < n2tVarH.f27496b) {
                    b(r2tVar, n2tVarH.f27495a, i - 1);
                    i2++;
                }
                r2tVar.G();
                return;
        }
    }
}
