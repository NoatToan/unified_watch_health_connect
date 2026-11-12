package ot2;

import i3.e5;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import lc.u0;
import o72.t;
import o73.u;
import o73.v;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f133854b;

        static {
            int[] iArr = new int[mt2.c.values().length];
            try {
                iArr[mt2.c.CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mt2.c.HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mt2.c.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mt2.c.TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mt2.c.FIXED_REST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mt2.c.FIXED_REPETITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mt2.c.POWER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mt2.c.REPS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mt2.c.LAP_BUTTON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mt2.c.INVALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f133853a = iArr;
            int[] iArr2 = new int[mt2.a.values().length];
            try {
                iArr2[mt2.a.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[mt2.a.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[mt2.a.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[mt2.a.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f133854b = iArr2;
        }
    }

    public static final Object a(boolean z14, String str, mt2.a aVar, g gVar) {
        if (aVar == mt2.a.METER) {
            if (z14) {
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                return v.b((u) kt2.e.f106530y.getValue(), new Object[]{str}, gVar);
            }
            kt2.f.f106534a.getClass();
            kt2.e.f106460a.getClass();
            return v.b((u) kt2.e.f106511r.getValue(), new Object[]{str}, gVar);
        }
        if (z14) {
            kt2.f.f106534a.getClass();
            kt2.e.f106460a.getClass();
            return v.b((u) kt2.e.f106532z.getValue(), new Object[]{str}, gVar);
        }
        kt2.f.f106534a.getClass();
        kt2.e.f106460a.getClass();
        return v.b((u) kt2.e.f106514s.getValue(), new Object[]{str}, gVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(boolean z14, double d14, v13.c cVar) {
        c cVar2;
        String str;
        String str2;
        Object objB;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f133857c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f133857c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(cVar);
            }
        } else {
            cVar2 = new c(cVar);
        }
        Object objA = cVar2.f133856b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f133857c;
        if (i15 == 0) {
            o13.r.b(objA);
            if (Double.isNaN(d14)) {
                return "";
            }
            double dB = MathKt.b(d14);
            ot2.a.f133852a.getClass();
            String strA = ot2.a.a(dB, "#,###,###");
            if (z14) {
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                u uVar = (u) kt2.e.T.getValue();
                cVar2.f133855a = strA;
                cVar2.f133857c = 1;
                objA = v.a(uVar, cVar2);
                if (objA != aVar) {
                    str = strA;
                    str2 = (String) objA;
                    cVar2.f133855a = null;
                    cVar2.f133857c = 3;
                    objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str2}, cVar2);
                    if (objB == aVar) {
                        return objB;
                    }
                }
            } else {
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                u uVar2 = (u) kt2.e.f106502o.getValue();
                cVar2.f133855a = strA;
                cVar2.f133857c = 2;
                objA = v.a(uVar2, cVar2);
                if (objA != aVar) {
                    str = strA;
                    str2 = (String) objA;
                    cVar2.f133855a = null;
                    cVar2.f133857c = 3;
                    objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str2}, cVar2);
                    if (objB == aVar) {
                        return objB;
                    }
                }
            }
        } else if (i15 == 1) {
            str = cVar2.f133855a;
            o13.r.b(objA);
            str2 = (String) objA;
            cVar2.f133855a = null;
            cVar2.f133857c = 3;
            objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str2}, cVar2);
            if (objB == aVar) {
                return objB;
            }
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    o13.r.b(objA);
                    return objA;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cVar2.f133855a;
            o13.r.b(objA);
            str2 = (String) objA;
            cVar2.f133855a = null;
            cVar2.f133857c = 3;
            objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str2}, cVar2);
            if (objB == aVar) {
                return objB;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(boolean z14, mt2.f fVar, double d14, mt2.a aVar, v13.c cVar) {
        d dVar;
        u uVar;
        u uVar2;
        double d15;
        String str;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f133860c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f133860c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object objA = dVar.f133859b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f133860c;
        if (i15 == 0) {
            o13.r.b(objA);
            if (Double.isNaN(d14)) {
                return "";
            }
            if (aVar == null) {
                aVar = fVar == mt2.f.METRIC ? mt2.a.KILOMETER : mt2.a.MILE;
            }
            int i16 = aVar == null ? -1 : a.f133854b[aVar.ordinal()];
            if (i16 == 1) {
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                uVar = (u) kt2.e.f106482h0.getValue();
                uVar2 = (u) kt2.e.f106526w.getValue();
            } else if (i16 == 2) {
                d14 /= 1000.0d;
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                uVar = (u) kt2.e.f106470d0.getValue();
                uVar2 = (u) kt2.e.f106520u.getValue();
            } else if (i16 == 3) {
                d14 /= 1609.344d;
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                uVar = (u) kt2.e.f106485i0.getValue();
                uVar2 = (u) kt2.e.f106523v.getValue();
            } else {
                if (i16 != 4) {
                    u0.r();
                    return null;
                }
                d14 /= 0.9144d;
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                uVar = (u) kt2.e.M0.getValue();
                uVar2 = (u) kt2.e.B.getValue();
            }
            if (z14) {
                dVar.f133858a = d14;
                dVar.f133860c = 1;
                objA = v.a(uVar2, dVar);
                if (objA != aVar2) {
                    d15 = d14;
                    str = (String) objA;
                }
            } else {
                dVar.f133858a = d14;
                dVar.f133860c = 2;
                objA = v.a(uVar, dVar);
                if (objA != aVar2) {
                    d15 = d14;
                    str = (String) objA;
                }
            }
            return aVar2;
        }
        if (i15 == 1) {
            d15 = dVar.f133858a;
            o13.r.b(objA);
            str = (String) objA;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d15 = dVar.f133858a;
            o13.r.b(objA);
            str = (String) objA;
        }
        ot2.a.f133852a.getClass();
        return e5.g(ot2.a.a(d15, "#.##"), StringUtils.SPACE, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (r10 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(boolean z14, double d14, mt2.b bVar, v13.c cVar) {
        e eVar;
        String str;
        String str2;
        String str3;
        String str4;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f133864d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f133864d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar);
            }
        } else {
            eVar = new e(cVar);
        }
        Object objA = eVar.f133863c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f133864d;
        if (i15 != 0) {
            if (i15 == 1) {
                str = eVar.f133862b;
                bVar = (mt2.b) eVar.f133861a;
                o13.r.b(objA);
                str2 = (String) objA;
            } else if (i15 == 2) {
                str = eVar.f133862b;
                bVar = (mt2.b) eVar.f133861a;
                o13.r.b(objA);
                str2 = (String) objA;
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = eVar.f133862b;
                str3 = (String) eVar.f133861a;
                o13.r.b(objA);
            }
            return objA + StringUtils.SPACE + str3 + StringUtils.SPACE + str4;
        }
        o13.r.b(objA);
        ot2.a.f133852a.getClass();
        String strA = ot2.a.a(d14, "#,###,###");
        if (z14) {
            kt2.f.f106534a.getClass();
            kt2.e.f106460a.getClass();
            u uVar = (u) kt2.e.Y.getValue();
            eVar.f133861a = bVar;
            eVar.f133862b = strA;
            eVar.f133864d = 1;
            objA = v.a(uVar, eVar);
            if (objA != aVar) {
                str = strA;
                str2 = (String) objA;
            }
        } else {
            kt2.f.f106534a.getClass();
            kt2.e.f106460a.getClass();
            u uVar2 = (u) kt2.e.Q.getValue();
            eVar.f133861a = bVar;
            eVar.f133862b = strA;
            eVar.f133864d = 2;
            objA = v.a(uVar2, eVar);
            if (objA != aVar) {
                str = strA;
                str2 = (String) objA;
            }
        }
        return aVar;
        str3 = str;
        str4 = str2;
        if (bVar == null) {
            return str3;
        }
        eVar.f133861a = str3;
        eVar.f133862b = str4;
        eVar.f133864d = 3;
        objA = bVar.a(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(boolean z14, double d14, mt2.b bVar, v13.c cVar) {
        f fVar;
        double d15;
        String str;
        String str2;
        String str3;
        String str4;
        Object objB;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f133869e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f133869e = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(cVar);
            }
        } else {
            fVar = new f(cVar);
        }
        Object objA = fVar.f133868d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f133869e;
        if (i15 == 0) {
            o13.r.b(objA);
            if (bVar != null) {
                fVar.f133865a = z14;
                fVar.f133866b = d14;
                fVar.f133869e = 1;
                objA = bVar.a(fVar);
                if (objA != obj) {
                }
                return obj;
            }
            return null;
        }
        if (i15 == 1) {
            d14 = fVar.f133866b;
            z14 = fVar.f133865a;
            o13.r.b(objA);
        } else {
            if (i15 == 2) {
                d15 = fVar.f133866b;
                str = fVar.f133867c;
                o13.r.b(objA);
                str2 = (String) objA;
                if (Double.isNaN(d15)) {
                    str4 = "";
                    fVar.f133867c = null;
                    fVar.f133869e = 5;
                    objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str4}, fVar);
                    if (objB == obj) {
                        return objB;
                    }
                } else {
                    u uVarF = gg.b.F(kt2.f.f106534a);
                    ot2.a.f133852a.getClass();
                    Object[] objArr = {ot2.a.a(d15, "#,###,###"), str2};
                    fVar.f133867c = str;
                    fVar.f133869e = 4;
                    objA = v.b(uVarF, objArr, fVar);
                    if (objA != obj) {
                        str3 = str;
                    }
                }
                return obj;
            }
            if (i15 == 3) {
                d15 = fVar.f133866b;
                str = fVar.f133867c;
                o13.r.b(objA);
                str2 = (String) objA;
                if (Double.isNaN(d15)) {
                    str4 = "";
                    fVar.f133867c = null;
                    fVar.f133869e = 5;
                    objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str4}, fVar);
                    if (objB == obj) {
                        return objB;
                    }
                } else {
                    u uVarF2 = gg.b.F(kt2.f.f106534a);
                    ot2.a.f133852a.getClass();
                    Object[] objArr2 = {ot2.a.a(d15, "#,###,###"), str2};
                    fVar.f133867c = str;
                    fVar.f133869e = 4;
                    objA = v.b(uVarF2, objArr2, fVar);
                    if (objA != obj) {
                        str3 = str;
                    }
                }
                return obj;
            }
            if (i15 != 4) {
                if (i15 == 5) {
                    o13.r.b(objA);
                    return objA;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = fVar.f133867c;
            o13.r.b(objA);
        }
        str = str3;
        str4 = (String) objA;
        fVar.f133867c = null;
        fVar.f133869e = 5;
        objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str4}, fVar);
        if (objB == obj) {
            return obj;
        }
        return objB;
        String str5 = (String) objA;
        if (str5 != null) {
            if (z14) {
                u uVarR = gg.b.r(kt2.f.f106534a);
                fVar.f133867c = str5;
                fVar.f133866b = d14;
                fVar.f133869e = 2;
                objA = v.a(uVarR, fVar);
                if (objA != obj) {
                    d15 = d14;
                    str = str5;
                    str2 = (String) objA;
                    if (Double.isNaN(d15)) {
                        str4 = "";
                        fVar.f133867c = null;
                        fVar.f133869e = 5;
                        objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str4}, fVar);
                        if (objB == obj) {
                            return objB;
                        }
                    } else {
                        u uVarF3 = gg.b.F(kt2.f.f106534a);
                        ot2.a.f133852a.getClass();
                        Object[] objArr3 = {ot2.a.a(d15, "#,###,###"), str2};
                        fVar.f133867c = str;
                        fVar.f133869e = 4;
                        objA = v.b(uVarF3, objArr3, fVar);
                        if (objA != obj) {
                            str3 = str;
                            str = str3;
                            str4 = (String) objA;
                            fVar.f133867c = null;
                            fVar.f133869e = 5;
                            objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str4}, fVar);
                            if (objB == obj) {
                                return objB;
                            }
                        }
                    }
                }
            } else {
                u uVarY = gg.b.y(kt2.f.f106534a);
                fVar.f133867c = str5;
                fVar.f133866b = d14;
                fVar.f133869e = 3;
                objA = v.a(uVarY, fVar);
                if (objA != obj) {
                    d15 = d14;
                    str = str5;
                    str2 = (String) objA;
                    if (Double.isNaN(d15)) {
                        str4 = "";
                        fVar.f133867c = null;
                        fVar.f133869e = 5;
                        objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str4}, fVar);
                        if (objB == obj) {
                            return objB;
                        }
                    } else {
                        u uVarF4 = gg.b.F(kt2.f.f106534a);
                        ot2.a.f133852a.getClass();
                        Object[] objArr4 = {ot2.a.a(d15, "#,###,###"), str2};
                        fVar.f133867c = str;
                        fVar.f133869e = 4;
                        objA = v.b(uVarF4, objArr4, fVar);
                        if (objA != obj) {
                            str3 = str;
                            str = str3;
                            str4 = (String) objA;
                            fVar.f133867c = null;
                            fVar.f133869e = 5;
                            objB = v.b(gg.b.F(kt2.f.f106534a), new Object[]{str, str4}, fVar);
                            if (objB == obj) {
                                return objB;
                            }
                        }
                    }
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f7, code lost:
    
        if (r3 == r7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0205, code lost:
    
        if (r3 == r7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0213, code lost:
    
        if (r3 == r7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r3 == r7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r3 == r7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01de, code lost:
    
        if (r3 == r7) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(boolean z14, boolean z15, mt2.f fVar, mt2.k kVar, mt2.a aVar, boolean z16, lt2.a aVar2, lt2.e eVar, v13.c cVar) {
        g gVar;
        Collection collectionS0;
        Object objA;
        mt2.c cVar2;
        String str;
        String str2;
        boolean z17 = z15;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f133873d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f133873d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar);
            }
        } else {
            gVar = new g(cVar);
        }
        g gVar2 = gVar;
        Object objB = gVar2.f133872c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        switch (gVar2.f133873d) {
            case 0:
                o13.r.b(objB);
                mt2.c cVar3 = aVar2.f114866a;
                mt2.b bVar = aVar2.f114868c;
                double d14 = aVar2.f114867b;
                if (cVar3 == null) {
                    return null;
                }
                int i15 = 2;
                switch (a.f133853a[cVar3.ordinal()]) {
                    case 1:
                        gVar2.f133873d = 1;
                        objB = b(z14, d14, gVar2);
                        break;
                    case 2:
                        gVar2.f133873d = 2;
                        objB = d(z14, d14, bVar, gVar2);
                        break;
                    case 3:
                        mt2.k kVar2 = mt2.k.SWIMMING;
                        double d15 = aVar2.f114867b;
                        if (kVar != kVar2) {
                            mt2.a aVar4 = aVar2.f114869d;
                            gVar2.f133873d = 4;
                            objB = c(z14, fVar, d15, aVar4, gVar2);
                        } else {
                            gVar2.f133873d = 3;
                            List listG = new d53.k("\\.").g(0, String.valueOf(d15));
                            if (listG.isEmpty()) {
                                collectionS0 = j0.f134944a;
                            } else {
                                ListIterator listIterator = listG.listIterator(listG.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        collectionS0 = j0.f134944a;
                                    } else if (((String) listIterator.previous()).length() != 0) {
                                        collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                                    }
                                }
                            }
                            String[] strArr = (String[]) collectionS0.toArray(new String[0]);
                            if (strArr.length == 0 || p005kotlin.jvm.internal.s.g(strArr[1], "0") || !p005kotlin.jvm.internal.s.g(strArr[1].subSequence(0, 2).toString(), "99")) {
                                StringBuilder sb3 = new StringBuilder();
                                if (d15 < 0.0d) {
                                    sb3.append('-');
                                    d15 = -d15;
                                }
                                long j8 = (long) d15;
                                if (j8 != 0) {
                                    sb3.append(j8);
                                }
                                double d16 = d15 - j8;
                                double dAbs = Math.abs(d16);
                                int i16 = 1;
                                while (true) {
                                    double d17 = i15;
                                    double dAbs2 = Math.abs(d16 - (((double) MathKt.b(d16 * d17)) / d17));
                                    if (dAbs2 < dAbs) {
                                        i16 = i15;
                                        dAbs = dAbs2;
                                    }
                                    if (i15 != 100) {
                                        i15++;
                                    } else {
                                        if (i16 > 1) {
                                            sb3.append(' ');
                                            sb3.append(MathKt.b(d16 * ((double) i16)));
                                            sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
                                            sb3.append(i16);
                                        }
                                        objA = a(z14, sb3.toString(), aVar, gVar2);
                                    }
                                }
                            } else {
                                objA = a(z14, String.valueOf(MathKt.b(d15)), aVar, gVar2);
                            }
                            objB = objA;
                        }
                        break;
                    case 4:
                        if (d14 >= 0.0d) {
                            return t.y(MathKt.d(d14));
                        }
                        return null;
                    case 5:
                    case 6:
                        long jD = MathKt.d(d14);
                        gVar2.f133871b = cVar3;
                        gVar2.f133870a = z17;
                        gVar2.f133873d = 5;
                        Object objX = t.x(jD, gVar2, z14);
                        if (objX != aVar3) {
                            objB = objX;
                            cVar2 = cVar3;
                            str = (String) objB;
                            gVar2.f133871b = str;
                            gVar2.f133873d = 6;
                            objB = cVar2.a(z17, gVar2);
                            if (objB != aVar3) {
                                str2 = str;
                                return e5.g((String) objB, " - ", str2);
                            }
                        }
                    case 7:
                        gVar2.f133873d = 7;
                        Object objE = e(z14, d14, bVar, gVar2);
                        return objE == aVar3 ? aVar3 : objE;
                    case 8:
                        double d18 = aVar2.f114867b;
                        gVar2.f133873d = 8;
                        objB = oi0.c.t(z14, fVar, z16, d18, eVar, gVar2);
                        break;
                    case 9:
                    case 10:
                        gVar2.f133873d = 9;
                        objB = cVar3.a(z17, gVar2);
                        break;
                    default:
                        u0.r();
                        return null;
                }
                break;
            case 1:
                o13.r.b(objB);
                return (String) objB;
            case 2:
                o13.r.b(objB);
                return (String) objB;
            case 3:
                o13.r.b(objB);
                return (String) objB;
            case 4:
                o13.r.b(objB);
                return (String) objB;
            case 5:
                z17 = gVar2.f133870a;
                cVar2 = (mt2.c) gVar2.f133871b;
                o13.r.b(objB);
                str = (String) objB;
                gVar2.f133871b = str;
                gVar2.f133873d = 6;
                objB = cVar2.a(z17, gVar2);
                if (objB != aVar3) {
                    str2 = str;
                    return e5.g((String) objB, " - ", str2);
                }
            case 6:
                str2 = (String) gVar2.f133871b;
                o13.r.b(objB);
                return e5.g((String) objB, " - ", str2);
            case 7:
                o13.r.b(objB);
                return objB;
            case 8:
                o13.r.b(objB);
                return (String) objB;
            case 9:
                o13.r.b(objB);
                return (String) objB;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
