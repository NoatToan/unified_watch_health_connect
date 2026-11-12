package o72;

import p005kotlin.Unit;
import v62.s6;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements e23.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130689a;

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, Integer num) {
        int i14;
        h4.r rVar = (h4.r) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ((Boolean) obj5).getClass();
        e23.a aVar = (e23.a) obj6;
        int iIntValue = num.intValue();
        z zVar = z.f130696a;
        ((String) obj2).getClass();
        rVar.getClass();
        aVar.getClass();
        if ((iIntValue & 384) == 0) {
            i14 = (mVar.B(rVar) ? 256 : 128) | iIntValue;
        } else {
            i14 = iIntValue;
        }
        if ((iIntValue & 3072) == 0) {
            i14 |= mVar.h(zBooleanValue) ? 2048 : 1024;
        }
        if ((iIntValue & 196608) == 0) {
            i14 |= mVar.r(aVar) ? 131072 : 65536;
        }
        if (mVar.n(i14 & 1, (590977 & i14) != 590976)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f0.f110999a.a(z.f130709n, null, rVar, zBooleanValue, aVar, mVar, ((i14 >> 6) & 14) | 48 | (i14 & 7168) | ((i14 >> 3) & 57344), 4);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, Integer num) {
        int i14;
        u4.d dVar = (u4.d) obj;
        String str = (String) obj2;
        h4.r rVar = (h4.r) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        e23.a aVar = (e23.a) obj6;
        int iIntValue = num.intValue();
        z zVar = z.f130696a;
        str.getClass();
        rVar.getClass();
        aVar.getClass();
        if ((iIntValue & 6) == 0) {
            i14 = (mVar.B(dVar) ? 4 : 2) | iIntValue;
        } else {
            i14 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i14 |= mVar.B(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i14 |= mVar.B(rVar) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i14 |= mVar.h(zBooleanValue) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i14 |= mVar.h(zBooleanValue2) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i14 |= mVar.r(aVar) ? 131072 : 65536;
        }
        byte b14 = 0;
        if (mVar.n(i14 & 1, (599187 & i14) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (zBooleanValue2) {
                mVar.C(-370710279);
                l72.f0.a.f111000a.l(z3.f.c(-390218576, new j30.d(zBooleanValue, 25, b14), mVar), str, rVar, zBooleanValue, aVar, mVar, (i14 & 112) | 6 | (i14 & 896) | (i14 & 7168) | (57344 & (i14 >> 3)));
                mVar.f();
            } else {
                mVar.C(-370995138);
                l72.f0.a.f111000a.k((i14 & 8190) | (57344 & (i14 >> 3)), 0, aVar, rVar, str, mVar, dVar, zBooleanValue);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, Integer num) {
        int i14;
        u4.d dVar = (u4.d) obj;
        String str = (String) obj2;
        h4.r rVar = (h4.r) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        e23.a aVar = (e23.a) obj6;
        int iIntValue = num.intValue();
        z zVar = z.f130696a;
        str.getClass();
        rVar.getClass();
        aVar.getClass();
        if ((iIntValue & 6) == 0) {
            i14 = (mVar.B(dVar) ? 4 : 2) | iIntValue;
        } else {
            i14 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i14 |= mVar.B(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i14 |= mVar.B(rVar) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i14 |= mVar.h(zBooleanValue) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i14 |= mVar.h(zBooleanValue2) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i14 |= mVar.r(aVar) ? 131072 : 65536;
        }
        byte b14 = 0;
        if (mVar.n(i14 & 1, (599187 & i14) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (zBooleanValue2) {
                mVar.C(-1456761038);
                l72.f0.a.f111000a.b(z3.f.c(-1800480364, new j30.d(zBooleanValue, 26, b14), mVar), str, rVar, zBooleanValue, aVar, mVar, (57344 & (i14 >> 3)) | (i14 & 112) | 6 | (i14 & 896) | (i14 & 7168));
                mVar.f();
            } else {
                mVar.C(-1457048811);
                l72.f0.a.f111000a.a((i14 & 8190) | (57344 & (i14 >> 3)), aVar, rVar, str, mVar, dVar, zBooleanValue);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, Integer num) {
        int i14;
        h4.r rVar = (h4.r) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ((Boolean) obj5).getClass();
        e23.a aVar = (e23.a) obj6;
        int iIntValue = num.intValue();
        z zVar = z.f130696a;
        ((String) obj2).getClass();
        rVar.getClass();
        aVar.getClass();
        if ((iIntValue & 384) == 0) {
            i14 = (mVar.B(rVar) ? 256 : 128) | iIntValue;
        } else {
            i14 = iIntValue;
        }
        if ((iIntValue & 3072) == 0) {
            i14 |= mVar.h(zBooleanValue) ? 2048 : 1024;
        }
        if ((iIntValue & 196608) == 0) {
            i14 |= mVar.r(aVar) ? 131072 : 65536;
        }
        if (mVar.n(i14 & 1, (590977 & i14) != 590976)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f0.a.f111000a.b(z.f130713r, "", rVar, zBooleanValue, aVar, mVar, (i14 & 896) | 54 | (i14 & 7168) | ((i14 >> 3) & 57344));
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, Integer num) {
        int i14;
        u4.d dVar = (u4.d) obj;
        String str = (String) obj2;
        h4.r rVar = (h4.r) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        e23.a<Unit> aVar = (e23.a) obj6;
        int iIntValue = num.intValue();
        z zVar = z.f130696a;
        str.getClass();
        rVar.getClass();
        aVar.getClass();
        if ((iIntValue & 6) == 0) {
            i14 = (mVar.B(dVar) ? 4 : 2) | iIntValue;
        } else {
            i14 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i14 |= mVar.B(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i14 |= mVar.B(rVar) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i14 |= mVar.h(zBooleanValue) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i14 |= mVar.h(zBooleanValue2) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i14 |= mVar.r(aVar) ? 131072 : 65536;
        }
        byte b14 = 0;
        if (mVar.n(i14 & 1, (599187 & i14) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (zBooleanValue2) {
                mVar.C(-524640476);
                l72.f0.a.f111000a.i(z3.f.c(-1035127084, new j30.d(zBooleanValue, 28, b14), mVar), str, rVar, zBooleanValue, aVar, mVar, (i14 & 112) | 6 | (i14 & 896) | (i14 & 7168) | (57344 & (i14 >> 3)), 0);
                mVar.f();
            } else {
                mVar.C(-524926327);
                l72.f0.a.f111000a.h((i14 & 8190) | (57344 & (i14 >> 3)), 0, aVar, rVar, str, mVar, dVar, zBooleanValue);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    @Override // e23.v
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p3.m mVar, Integer num) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36 = 3;
        byte b14 = 0;
        switch (this.f130689a) {
            case 0:
                int i37 = 16;
                String str = (String) obj2;
                h4.r rVar = (h4.r) obj3;
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a aVar = (e23.a) obj6;
                int iIntValue = num.intValue();
                z zVar = z.f130696a;
                str.getClass();
                rVar.getClass();
                aVar.getClass();
                if ((iIntValue & 48) == 0) {
                    if (mVar.B(str)) {
                        i37 = 32;
                    }
                    i14 = iIntValue | i37;
                } else {
                    i14 = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    i14 |= mVar.B(rVar) ? 256 : 128;
                }
                if ((iIntValue & 3072) == 0) {
                    i14 |= mVar.h(zBooleanValue) ? 2048 : 1024;
                }
                if ((iIntValue & 196608) == 0) {
                    i14 |= mVar.r(aVar) ? 131072 : 65536;
                }
                if (mVar.n(i14 & 1, (i14 & 590993) != 590992)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l72.f0.f110999a.d((i14 & 8176) | ((i14 >> 3) & 57344), 1, aVar, rVar, str, mVar, null, zBooleanValue);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                int i38 = 16;
                String str2 = (String) obj2;
                h4.r rVar2 = (h4.r) obj3;
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a aVar2 = (e23.a) obj6;
                int iIntValue2 = num.intValue();
                z zVar2 = z.f130696a;
                str2.getClass();
                rVar2.getClass();
                aVar2.getClass();
                if ((iIntValue2 & 48) == 0) {
                    if (mVar.B(str2)) {
                        i38 = 32;
                    }
                    i15 = iIntValue2 | i38;
                } else {
                    i15 = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i15 |= mVar.B(rVar2) ? 256 : 128;
                }
                if ((iIntValue2 & 3072) == 0) {
                    i15 |= mVar.h(zBooleanValue2) ? 2048 : 1024;
                }
                if ((iIntValue2 & 196608) == 0) {
                    i15 |= mVar.r(aVar2) ? 131072 : 65536;
                }
                if (mVar.n(i15 & 1, (i15 & 590993) != 590992)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    s62.a.f157643a.getClass();
                    f0Var.d((i15 & 8176) | ((i15 >> 3) & 57344), 0, aVar2, rVar2, str2, mVar, s6.a(t62.b.f162798a), zBooleanValue2);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                h4.r rVar3 = (h4.r) obj3;
                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a aVar3 = (e23.a) obj6;
                int iIntValue3 = num.intValue();
                z zVar3 = z.f130696a;
                ((String) obj2).getClass();
                rVar3.getClass();
                aVar3.getClass();
                if ((iIntValue3 & 384) == 0) {
                    i16 = iIntValue3 | (mVar.B(rVar3) ? 256 : 128);
                } else {
                    i16 = iIntValue3;
                }
                if ((iIntValue3 & 3072) == 0) {
                    i16 |= mVar.h(zBooleanValue3) ? 2048 : 1024;
                }
                if ((iIntValue3 & 196608) == 0) {
                    i16 |= mVar.r(aVar3) ? 131072 : 65536;
                }
                if (mVar.n(i16 & 1, (590977 & i16) != 590976)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i39 = i16 >> 3;
                    l72.f0.a.f111000a.g(((i16 >> 6) & 7168) | (i39 & 896) | (i39 & 112) | 6, 0, aVar3, z.f130716u, rVar3, mVar, zBooleanValue3);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                int i44 = 16;
                String str3 = (String) obj2;
                h4.r rVar4 = (h4.r) obj3;
                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a aVar4 = (e23.a) obj6;
                int iIntValue4 = num.intValue();
                z zVar4 = z.f130696a;
                str3.getClass();
                rVar4.getClass();
                aVar4.getClass();
                if ((iIntValue4 & 48) == 0) {
                    if (mVar.B(str3)) {
                        i44 = 32;
                    }
                    i17 = iIntValue4 | i44;
                } else {
                    i17 = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    i17 |= mVar.B(rVar4) ? 256 : 128;
                }
                if ((iIntValue4 & 3072) == 0) {
                    i17 |= mVar.h(zBooleanValue4) ? 2048 : 1024;
                }
                if ((iIntValue4 & 196608) == 0) {
                    i17 |= mVar.r(aVar4) ? 131072 : 65536;
                }
                if (mVar.n(i17 & 1, (i17 & 590993) != 590992)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    l72.f0.a aVar5 = l72.f0.a.f111000a;
                    z3.e eVarC = z3.f.c(-412459480, new b82.g0(zBooleanValue4, str3, i36, b14), mVar);
                    int i45 = i17 >> 3;
                    aVar5.g((i45 & 896) | (i45 & 112) | 6 | ((i17 >> 6) & 7168), 0, aVar4, eVarC, rVar4, mVar, zBooleanValue4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                int i46 = 16;
                u4.d dVar = (u4.d) obj;
                String str4 = (String) obj2;
                h4.r rVar5 = (h4.r) obj3;
                boolean zBooleanValue5 = ((Boolean) obj4).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj5).booleanValue();
                e23.a aVar6 = (e23.a) obj6;
                int iIntValue5 = num.intValue();
                z zVar5 = z.f130696a;
                str4.getClass();
                rVar5.getClass();
                aVar6.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i18 = (mVar.B(dVar) ? 4 : 2) | iIntValue5;
                } else {
                    i18 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    if (mVar.B(str4)) {
                        i46 = 32;
                    }
                    i18 |= i46;
                }
                if ((iIntValue5 & 384) == 0) {
                    i18 |= mVar.B(rVar5) ? 256 : 128;
                }
                if ((iIntValue5 & 3072) == 0) {
                    i18 |= mVar.h(zBooleanValue5) ? 2048 : 1024;
                }
                if ((iIntValue5 & 24576) == 0) {
                    i18 |= mVar.h(zBooleanValue6) ? 16384 : 8192;
                }
                if ((iIntValue5 & 196608) == 0) {
                    i18 |= mVar.r(aVar6) ? 131072 : 65536;
                }
                if (mVar.n(i18 & 1, (599187 & i18) != 599186)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    if (zBooleanValue6) {
                        mVar.C(1574396532);
                        l72.f0.a.f111000a.e(z3.f.c(1021836948, new j30.d(zBooleanValue5, 24, b14), mVar), str4, rVar5, zBooleanValue5, aVar6, mVar, (i18 & 112) | 6 | (i18 & 896) | (i18 & 7168) | ((i18 >> 3) & 57344));
                        mVar.f();
                    } else {
                        mVar.C(1574112665);
                        l72.f0.a.f111000a.c((i18 & 8190) | ((i18 >> 3) & 57344), 0, aVar6, rVar5, str4, mVar, dVar, zBooleanValue5);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 5:
                h4.r rVar6 = (h4.r) obj3;
                boolean zBooleanValue7 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a aVar7 = (e23.a) obj6;
                int iIntValue6 = num.intValue();
                z zVar6 = z.f130696a;
                ((String) obj2).getClass();
                rVar6.getClass();
                aVar7.getClass();
                if ((iIntValue6 & 384) == 0) {
                    i19 = iIntValue6 | (mVar.B(rVar6) ? 256 : 128);
                } else {
                    i19 = iIntValue6;
                }
                if ((iIntValue6 & 3072) == 0) {
                    i19 |= mVar.h(zBooleanValue7) ? 2048 : 1024;
                }
                if ((iIntValue6 & 196608) == 0) {
                    i19 |= mVar.r(aVar7) ? 131072 : 65536;
                }
                if (mVar.n(i19 & 1, (590977 & i19) != 590976)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    int i47 = i19;
                    int i48 = i47 >> 3;
                    l72.f0.a.f111000a.d(z.f130720y, rVar6, zBooleanValue7, aVar7, mVar, ((i47 >> 6) & 7168) | (i48 & 896) | (i48 & 112) | 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 6:
                int i49 = 16;
                String str5 = (String) obj2;
                h4.r rVar7 = (h4.r) obj3;
                boolean zBooleanValue8 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a aVar8 = (e23.a) obj6;
                int iIntValue7 = num.intValue();
                z zVar7 = z.f130696a;
                str5.getClass();
                rVar7.getClass();
                aVar8.getClass();
                if ((iIntValue7 & 48) == 0) {
                    if (mVar.B(str5)) {
                        i49 = 32;
                    }
                    i24 = iIntValue7 | i49;
                } else {
                    i24 = iIntValue7;
                }
                if ((iIntValue7 & 384) == 0) {
                    i24 |= mVar.B(rVar7) ? 256 : 128;
                }
                if ((iIntValue7 & 3072) == 0) {
                    i24 |= mVar.h(zBooleanValue8) ? 2048 : 1024;
                }
                if ((iIntValue7 & 196608) == 0) {
                    i24 |= mVar.r(aVar8) ? 131072 : 65536;
                }
                if (mVar.n(i24 & 1, (i24 & 590993) != 590992)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    l72.f0.a aVar9 = l72.f0.a.f111000a;
                    z3.e eVarC2 = z3.f.c(1759923560, new b82.g0(zBooleanValue8, str5, 4, b14), mVar);
                    int i54 = i24 >> 3;
                    aVar9.d(eVarC2, rVar7, zBooleanValue8, aVar8, mVar, (i54 & 896) | (i54 & 112) | 6 | ((i24 >> 6) & 7168));
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 7:
                int i55 = 16;
                String str6 = (String) obj2;
                h4.r rVar8 = (h4.r) obj3;
                boolean zBooleanValue9 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a<Unit> aVar10 = (e23.a) obj6;
                int iIntValue8 = num.intValue();
                z zVar8 = z.f130696a;
                str6.getClass();
                rVar8.getClass();
                aVar10.getClass();
                if ((iIntValue8 & 48) == 0) {
                    if (mVar.B(str6)) {
                        i55 = 32;
                    }
                    i25 = iIntValue8 | i55;
                } else {
                    i25 = iIntValue8;
                }
                if ((iIntValue8 & 384) == 0) {
                    i25 |= mVar.B(rVar8) ? 256 : 128;
                }
                if ((iIntValue8 & 3072) == 0) {
                    i25 |= mVar.h(zBooleanValue9) ? 2048 : 1024;
                }
                if ((iIntValue8 & 196608) == 0) {
                    i25 |= mVar.r(aVar10) ? 131072 : 65536;
                }
                if (mVar.n(i25 & 1, (i25 & 590993) != 590992)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    l72.f0.f110999a.e(z3.f.c(2021142672, new j30.d(zBooleanValue9, 27, b14), mVar), str6, rVar8, zBooleanValue9, aVar10, mVar, ((i25 >> 3) & 57344) | (i25 & 112) | 6 | (i25 & 896) | (i25 & 7168), 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 8:
                h4.r rVar9 = (h4.r) obj3;
                boolean zBooleanValue10 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a aVar11 = (e23.a) obj6;
                int iIntValue9 = num.intValue();
                z zVar9 = z.f130696a;
                ((String) obj2).getClass();
                rVar9.getClass();
                aVar11.getClass();
                if ((iIntValue9 & 384) == 0) {
                    i26 = iIntValue9 | (mVar.B(rVar9) ? 256 : 128);
                } else {
                    i26 = iIntValue9;
                }
                if ((iIntValue9 & 3072) == 0) {
                    i26 |= mVar.h(zBooleanValue10) ? 2048 : 1024;
                }
                if ((iIntValue9 & 196608) == 0) {
                    i26 |= mVar.r(aVar11) ? 131072 : 65536;
                }
                if (mVar.n(i26 & 1, (590977 & i26) != 590976)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    l72.f0.f110999a.j(z.f130706k, null, rVar9, zBooleanValue10, aVar11, mVar, ((i26 >> 6) & 14) | 48 | (i26 & 7168) | ((i26 >> 3) & 57344), 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 9:
                h4.r rVar10 = (h4.r) obj3;
                boolean zBooleanValue11 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a<Unit> aVar12 = (e23.a) obj6;
                int iIntValue10 = num.intValue();
                z zVar10 = z.f130696a;
                ((String) obj2).getClass();
                rVar10.getClass();
                aVar12.getClass();
                if ((iIntValue10 & 384) == 0) {
                    i27 = iIntValue10 | (mVar.B(rVar10) ? 256 : 128);
                } else {
                    i27 = iIntValue10;
                }
                if ((iIntValue10 & 3072) == 0) {
                    i27 |= mVar.h(zBooleanValue11) ? 2048 : 1024;
                }
                if ((iIntValue10 & 196608) == 0) {
                    i27 |= mVar.r(aVar12) ? 131072 : 65536;
                }
                if (mVar.n(i27 & 1, (590977 & i27) != 590976)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    l72.f0.f110999a.f(rVar10, z.f130700e, null, zBooleanValue11, aVar12, mVar, ((i27 >> 6) & 14) | 48 | (i27 & 7168) | ((i27 >> 3) & 57344), 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 10:
                int i56 = 16;
                String str7 = (String) obj2;
                h4.r rVar11 = (h4.r) obj3;
                boolean zBooleanValue12 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a<Unit> aVar13 = (e23.a) obj6;
                int iIntValue11 = num.intValue();
                z zVar11 = z.f130696a;
                str7.getClass();
                rVar11.getClass();
                aVar13.getClass();
                if ((iIntValue11 & 48) == 0) {
                    if (mVar.B(str7)) {
                        i56 = 32;
                    }
                    i28 = iIntValue11 | i56;
                } else {
                    i28 = iIntValue11;
                }
                if ((iIntValue11 & 384) == 0) {
                    i28 |= mVar.B(rVar11) ? 256 : 128;
                }
                if ((iIntValue11 & 3072) == 0) {
                    i28 |= mVar.h(zBooleanValue12) ? 2048 : 1024;
                }
                if ((iIntValue11 & 196608) == 0) {
                    i28 |= mVar.r(aVar13) ? 131072 : 65536;
                }
                if (mVar.n(i28 & 1, (i28 & 590993) != 590992)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    l72.f0.f110999a.i(str7, rVar11, zBooleanValue12, aVar13, mVar, ((i28 >> 3) & 1022) | ((i28 >> 6) & 7168), 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 11:
                h4.r rVar12 = (h4.r) obj3;
                boolean zBooleanValue13 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a aVar14 = (e23.a) obj6;
                int iIntValue12 = num.intValue();
                z zVar12 = z.f130696a;
                ((String) obj2).getClass();
                rVar12.getClass();
                aVar14.getClass();
                if ((iIntValue12 & 384) == 0) {
                    i29 = iIntValue12 | (mVar.B(rVar12) ? 256 : 128);
                } else {
                    i29 = iIntValue12;
                }
                if ((iIntValue12 & 3072) == 0) {
                    i29 |= mVar.h(zBooleanValue13) ? 2048 : 1024;
                }
                if ((iIntValue12 & 196608) == 0) {
                    i29 |= mVar.r(aVar14) ? 131072 : 65536;
                }
                if (mVar.n(i29 & 1, (590977 & i29) != 590976)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    l72.f0.f110999a.h(z.f130703h, null, rVar12, zBooleanValue13, aVar14, mVar, ((i29 >> 3) & 57344) | ((i29 >> 6) & 14) | 48 | (i29 & 7168), 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 12:
                int i57 = 16;
                String str8 = (String) obj2;
                h4.r rVar13 = (h4.r) obj3;
                boolean zBooleanValue14 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a<Unit> aVar15 = (e23.a) obj6;
                int iIntValue13 = num.intValue();
                z zVar13 = z.f130696a;
                str8.getClass();
                rVar13.getClass();
                aVar15.getClass();
                if ((iIntValue13 & 48) == 0) {
                    if (mVar.B(str8)) {
                        i57 = 32;
                    }
                    i30 = iIntValue13 | i57;
                } else {
                    i30 = iIntValue13;
                }
                if ((iIntValue13 & 384) == 0) {
                    i30 |= mVar.B(rVar13) ? 256 : 128;
                }
                if ((iIntValue13 & 3072) == 0) {
                    i30 |= mVar.h(zBooleanValue14) ? 2048 : 1024;
                }
                if ((iIntValue13 & 196608) == 0) {
                    i30 |= mVar.r(aVar15) ? 131072 : 65536;
                }
                if (mVar.n(i30 & 1, (i30 & 590993) != 590992)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    l72.f0.f110999a.k(str8, rVar13, zBooleanValue14, aVar15, mVar, ((i30 >> 3) & 1022) | ((i30 >> 6) & 7168), 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 13:
                int i58 = 16;
                String str9 = (String) obj2;
                h4.r rVar14 = (h4.r) obj3;
                boolean zBooleanValue15 = ((Boolean) obj4).booleanValue();
                ((Boolean) obj5).getClass();
                e23.a<Unit> aVar16 = (e23.a) obj6;
                int iIntValue14 = num.intValue();
                z zVar14 = z.f130696a;
                str9.getClass();
                rVar14.getClass();
                aVar16.getClass();
                if ((iIntValue14 & 48) == 0) {
                    if (mVar.B(str9)) {
                        i58 = 32;
                    }
                    i34 = iIntValue14 | i58;
                } else {
                    i34 = iIntValue14;
                }
                if ((iIntValue14 & 384) == 0) {
                    i34 |= mVar.B(rVar14) ? 256 : 128;
                }
                if ((iIntValue14 & 3072) == 0) {
                    i34 |= mVar.h(zBooleanValue15) ? 2048 : 1024;
                }
                if ((iIntValue14 & 196608) == 0) {
                    i34 |= mVar.r(aVar16) ? 131072 : 65536;
                }
                if (mVar.n(i34 & 1, (i34 & 590993) != 590992)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    l72.f0.f110999a.b(str9, rVar14, zBooleanValue15, aVar16, mVar, ((i34 >> 3) & 1022) | ((i34 >> 6) & 7168), 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 14:
                return a(obj, obj2, obj3, obj4, obj5, obj6, mVar, num);
            case 15:
                return b(obj, obj2, obj3, obj4, obj5, obj6, mVar, num);
            case 16:
                return c(obj, obj2, obj3, obj4, obj5, obj6, mVar, num);
            case 17:
                return d(obj, obj2, obj3, obj4, obj5, obj6, mVar, num);
            case 18:
                return e(obj, obj2, obj3, obj4, obj5, obj6, mVar, num);
            default:
                h4.r rVar15 = (h4.r) obj;
                String str10 = (String) obj2;
                boolean zBooleanValue16 = ((Boolean) obj3).booleanValue();
                x1.e eVar = (x1.e) obj4;
                int i59 = 16;
                e23.q qVar = (e23.q) obj5;
                e23.a aVar17 = (e23.a) obj6;
                int iIntValue15 = num.intValue();
                x1.a aVar18 = x1.a.f188327a;
                if ((iIntValue15 & 6) == 0) {
                    i35 = iIntValue15 | (mVar.B(rVar15) ? 4 : 2);
                } else {
                    i35 = iIntValue15;
                }
                if ((iIntValue15 & 48) == 0) {
                    if (mVar.B(str10)) {
                        i59 = 32;
                    }
                    i35 |= i59;
                }
                if ((iIntValue15 & 384) == 0) {
                    i35 |= mVar.h(zBooleanValue16) ? 256 : 128;
                }
                if ((iIntValue15 & 3072) == 0) {
                    i35 |= mVar.B(eVar) ? 2048 : 1024;
                }
                if ((iIntValue15 & 24576) == 0) {
                    i35 |= mVar.r(qVar) ? 16384 : 8192;
                }
                if ((iIntValue15 & 196608) == 0) {
                    i35 |= mVar.r(aVar17) ? 131072 : 65536;
                }
                if (mVar.n(i35 & 1, (i35 & 599187) != 599186)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    x1.l.c(str10, zBooleanValue16, eVar, rVar15, qVar, aVar17, mVar, ((i35 >> 3) & 1022) | ((i35 << 9) & 7168) | (i35 & 57344) | (i35 & 458752));
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
