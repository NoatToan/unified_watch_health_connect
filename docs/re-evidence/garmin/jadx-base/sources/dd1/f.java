package dd1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bt1.k;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import l72.j0;
import m92.o;
import p005kotlin.Unit;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4 A[LOOP:0: B:63:0x00ce->B:65:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:78:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void a(fd1.e eVar, i53.c<? extends ad1.b> cVar, String str, boolean z14, l<? super Integer, Unit> lVar, m mVar, int i14, int i15) {
        String str2;
        int i16;
        int i17;
        l<? super Integer, Unit> lVar2;
        int i18;
        int i19;
        boolean z15;
        boolean z16;
        String str3;
        l<? super Integer, Unit> lVar3;
        p2 p2VarI0;
        String str4;
        boolean z17;
        Context context;
        boolean z18;
        Object objQ;
        i53.c cVarE;
        ArrayList arrayList;
        p1 p1Var;
        cVar.getClass();
        o0 o0VarE = mVar.E(517975171);
        int i24 = (o0VarE.B(eVar) ? 4 : 2) | i14 | (o0VarE.B(cVar) ? 32 : 16);
        int i25 = i15 & 4;
        if (i25 != 0) {
            i16 = i24 | 384;
            str2 = str;
        } else {
            str2 = str;
            i16 = i24 | (o0VarE.B(str2) ? 256 : 128);
        }
        int i26 = i15 & 8;
        if (i26 == 0) {
            if ((i14 & 3072) == 0) {
                i16 |= o0VarE.h(z14) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                i19 = i16 | 24576;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i19 = i16 | i18;
            }
            if ((i19 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                z3.e eVarC = null;
                if (i25 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i26 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i17 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var = n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                if ((i19 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ = o0VarE.q();
                if (z18) {
                    if (z17) {
                        ad1.a.f2756a.getClass();
                        List<ad1.b> list = ad1.a.f2757b;
                        arrayList = new ArrayList(y.r(list, 10));
                        for (ad1.b bVar : list) {
                            String string = context.getString(bVar.f2764a);
                            string.getClass();
                            arrayList.add(new j0(string, null, null, false, cVar.contains(bVar), 14, null));
                        }
                        cVarE = i53.a.e(arrayList);
                    } else {
                        cVarE = null;
                    }
                    objQ = p0.n(cVarE);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        if (z17) {
                            ad1.a.f2756a.getClass();
                            List<ad1.b> list2 = ad1.a.f2757b;
                            arrayList = new ArrayList(y.r(list2, 10));
                            while (r4.hasNext()) {
                                String string2 = context.getString(bVar.f2764a);
                                string2.getClass();
                                arrayList.add(new j0(string2, null, null, false, cVar.contains(bVar), 14, null));
                            }
                            cVarE = i53.a.e(arrayList);
                        } else {
                            cVarE = null;
                        }
                        objQ = p0.n(cVarE);
                        o0VarE.K(objQ);
                    }
                }
                p1Var = (p1) objQ;
                z3.e eVarC2 = z3.f.c(-1728425725, new c50.f(str4, 24, eVar, cVar), o0VarE);
                if (((i53.c) p1Var.getF182175a()) == null && eVar != null && eVar.f70496g) {
                    o0VarE.C(-817004583);
                    eVarC = z3.f.c(-934898969, new k(lVar3, p1Var, 5), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-816622973);
                    o0VarE.g0(false);
                }
                o.a(null, str4, null, null, eVarC2, eVarC, null, o0VarE, ((i19 >> 3) & 112) | 24576, 77);
                x1 x1Var2 = n.f135158a;
                z16 = z17;
                str3 = str4;
            } else {
                o0VarE.e();
                z16 = z14;
                str3 = str2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(eVar, cVar, str3, z16, lVar3, i14, i15);
            }
        }
        i16 |= 3072;
        i17 = i15 & 16;
        if (i17 != 0) {
            i19 = i16 | 24576;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if (o0VarE.r(lVar2)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i19 = i16 | i18;
        }
        if ((i19 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            z3.e eVarC3 = null;
            if (i25 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i26 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            if (i17 != 0) {
                lVar3 = null;
            } else {
                lVar3 = lVar2;
            }
            x1 x1Var3 = n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if ((i19 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            objQ = o0VarE.q();
            if (z18) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    if (z17) {
                        ad1.a.f2756a.getClass();
                        List<ad1.b> list3 = ad1.a.f2757b;
                        arrayList = new ArrayList(y.r(list3, 10));
                        while (r4.hasNext()) {
                            String string3 = context.getString(bVar.f2764a);
                            string3.getClass();
                            arrayList.add(new j0(string3, null, null, false, cVar.contains(bVar), 14, null));
                        }
                        cVarE = i53.a.e(arrayList);
                    } else {
                        cVarE = null;
                    }
                    objQ = p0.n(cVarE);
                    o0VarE.K(objQ);
                }
            } else {
                if (z17) {
                    ad1.a.f2756a.getClass();
                    List<ad1.b> list4 = ad1.a.f2757b;
                    arrayList = new ArrayList(y.r(list4, 10));
                    while (r4.hasNext()) {
                        String string4 = context.getString(bVar.f2764a);
                        string4.getClass();
                        arrayList.add(new j0(string4, null, null, false, cVar.contains(bVar), 14, null));
                    }
                    cVarE = i53.a.e(arrayList);
                } else {
                    cVarE = null;
                }
                objQ = p0.n(cVarE);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            z3.e eVarC4 = z3.f.c(-1728425725, new c50.f(str4, 24, eVar, cVar), o0VarE);
            if (((i53.c) p1Var.getF182175a()) == null) {
                o0VarE.C(-816622973);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-816622973);
                o0VarE.g0(false);
            }
            o.a(null, str4, null, null, eVarC4, eVarC3, null, o0VarE, ((i19 >> 3) & 112) | 24576, 77);
            x1 x1Var4 = n.f135158a;
            z16 = z17;
            str3 = str4;
        } else {
            o0VarE.e();
            z16 = z14;
            str3 = str2;
            lVar3 = lVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(eVar, cVar, str3, z16, lVar3, i14, i15);
        }
    }
}
