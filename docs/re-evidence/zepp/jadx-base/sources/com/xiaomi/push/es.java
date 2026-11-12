package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
public class es {
    private static int a = Integer.MAX_VALUE;

    public static void a(ep epVar, byte b) throws ej {
        a(epVar, b, a);
    }

    public static void a(ep epVar, byte b, int i) throws ej {
        if (i <= 0) {
            throw new ej("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                epVar.mo3783a();
                return;
            case 3:
                epVar.a();
                return;
            case 4:
                epVar.mo3770a();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                epVar.mo3780a();
                return;
            case 8:
                epVar.mo3771a();
                return;
            case 10:
                epVar.mo3772a();
                return;
            case 11:
                epVar.mo3779a();
                return;
            case 12:
                epVar.mo3777a();
                while (true) {
                    byte b2 = epVar.mo3773a().a;
                    if (b2 == 0) {
                        epVar.f();
                        return;
                    } else {
                        a(epVar, b2, i - 1);
                        epVar.g();
                    }
                }
                break;
            case 13:
                eo eoVarMo3775a = epVar.mo3775a();
                while (i2 < eoVarMo3775a.f175a) {
                    int i3 = i - 1;
                    a(epVar, eoVarMo3775a.a, i3);
                    a(epVar, eoVarMo3775a.b, i3);
                    i2++;
                }
                epVar.h();
                return;
            case 14:
                et etVarMo3776a = epVar.mo3776a();
                while (i2 < etVarMo3776a.f176a) {
                    a(epVar, etVarMo3776a.a, i - 1);
                    i2++;
                }
                epVar.j();
                return;
            case 15:
                en enVarMo3774a = epVar.mo3774a();
                while (i2 < enVarMo3774a.f174a) {
                    a(epVar, enVarMo3774a.a, i - 1);
                    i2++;
                }
                epVar.i();
                return;
        }
    }
}
