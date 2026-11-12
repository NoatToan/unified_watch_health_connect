package n40;

import a11.b0;
import b82.r0;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import e23.p;
import ew1.y1;
import gl1.y;
import h4.r;
import i3.mh;
import java.util.List;
import l72.p2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import qw0.v;
import u1.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123572a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m40.a f123573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f123574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f123575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f123576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f123577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f123578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a f123579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a f123580i;

    public /* synthetic */ e(m40.a aVar, p pVar, e23.a aVar2, e23.l lVar, e23.l lVar2, e23.l lVar3, p pVar2, e23.a aVar3) {
        this.f123573b = aVar;
        this.f123574c = pVar;
        this.f123579h = aVar2;
        this.f123575d = lVar;
        this.f123576e = lVar2;
        this.f123577f = lVar3;
        this.f123578g = pVar2;
        this.f123580i = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0351  */
    /* JADX WARN: Code duplicated, block: B:109:0x0376  */
    /* JADX WARN: Code duplicated, block: B:114:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:121:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x041d  */
    /* JADX WARN: Code duplicated, block: B:131:0x045b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x0169  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x021f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0276  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:94:0x0309  */
    /* JADX WARN: Code duplicated, block: B:99:0x032c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Class cls;
        p pVar;
        int i14;
        p pVar2;
        final int i15;
        final int i16;
        String strW;
        switch (this.f123572a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    v vVar = v.MILE_MARKERS;
                    final m40.a aVar = this.f123573b;
                    boolean z14 = aVar.f116560a;
                    boolean z15 = aVar.f116561b;
                    p pVar3 = this.f123574c;
                    boolean zB = mVar.B(pVar3);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zB) {
                        objQ = new r0(pVar3, 6);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r0(pVar3, 6);
                            mVar.K(objQ);
                        }
                    }
                    gg.b.i(vVar, z14, z15, (e23.l) objQ, mVar, 6, 0);
                    if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                        mVar.C(635841309);
                        if (aVar.f116562c) {
                            mVar.C(635894815);
                            boolean z16 = aVar.f116563d;
                            e23.a aVar3 = this.f123579h;
                            if (z16) {
                                mVar.C(635942989);
                                p2 p2Var = p2.f111205a;
                                x0.f23314a.getClass();
                                String strW2 = gl1.d.W(x0.Hc);
                                int size = aVar.f116564e.size();
                                if (size > 1) {
                                    mVar.C(94341627);
                                    strW = gl1.d.V(x0.f23561oc, new Object[]{Integer.valueOf(size)});
                                    mVar.f();
                                } else if (size == 1) {
                                    mVar.C(94344685);
                                    strW = gl1.d.W(x0.f23578pc);
                                    mVar.f();
                                } else {
                                    mVar.C(94347117);
                                    strW = gl1.d.W(x0.f23545nc);
                                    mVar.f();
                                }
                                boolean zB2 = mVar.B(aVar3);
                                Object objQ2 = mVar.q();
                                if (zB2) {
                                    objQ2 = new ll0.a(aVar3, 25);
                                    mVar.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new ll0.a(aVar3, 25);
                                        mVar.K(objQ2);
                                    }
                                }
                                cls = s20.h.class;
                                pVar = pVar3;
                                i14 = 23;
                                p2Var.h(strW2, strW, null, null, null, false, false, null, null, null, (e23.a) objQ2, mVar, 0, 0, 1020);
                                mVar = mVar;
                                mVar.f();
                            } else {
                                cls = s20.h.class;
                                pVar = pVar3;
                                i14 = 23;
                                mVar.C(636275898);
                                p2 p2Var2 = p2.f111205a;
                                x0.f23314a.getClass();
                                String strW3 = gl1.d.W(x0.Hc);
                                boolean zB3 = mVar.B(aVar3);
                                Object objQ3 = mVar.q();
                                if (zB3) {
                                    objQ3 = new ll0.a(aVar3, 23);
                                    mVar.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new ll0.a(aVar3, 23);
                                        mVar.K(objQ3);
                                    }
                                }
                                p2Var2.g(strW3, null, null, null, null, false, false, (e23.a) objQ3, mVar, 0, 254);
                                mVar = mVar;
                                mVar.f();
                            }
                            mVar.f();
                        } else {
                            cls = s20.h.class;
                            pVar = pVar3;
                            i14 = 23;
                            mVar.C(636505050);
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        cls = s20.h.class;
                        pVar = pVar3;
                        i14 = 23;
                        mVar.C(636514970);
                        mVar.f();
                    }
                    if (aVar.f116565f) {
                        mVar.C(636608466);
                        i15 = 0;
                        Object[] objArr = new Object[0];
                        boolean zR = mVar.r(aVar);
                        Object objQ4 = mVar.q();
                        if (zR) {
                            objQ4 = new e23.a() { // from class: n40.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            return p0.n(Boolean.valueOf(aVar.f116566g));
                                        case 1:
                                            return p0.n(aVar.f116567h);
                                        case 2:
                                            return p0.n(Boolean.valueOf(aVar.f116571l));
                                        case 3:
                                            return p0.n(aVar.f116572m);
                                        case 4:
                                            return p0.n(aVar.f116573n);
                                        default:
                                            return p0.n(aVar.f116574o);
                                    }
                                }
                            };
                            mVar.K(objQ4);
                        } else {
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new e23.a() { // from class: n40.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                return p0.n(Boolean.valueOf(aVar.f116566g));
                                            case 1:
                                                return p0.n(aVar.f116567h);
                                            case 2:
                                                return p0.n(Boolean.valueOf(aVar.f116571l));
                                            case 3:
                                                return p0.n(aVar.f116572m);
                                            case 4:
                                                return p0.n(aVar.f116573n);
                                            default:
                                                return p0.n(aVar.f116574o);
                                        }
                                    }
                                };
                                mVar.K(objQ4);
                            }
                        }
                        p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ4, mVar, 0);
                        Object[] objArr2 = new Object[0];
                        boolean zR2 = mVar.r(aVar);
                        Object objQ5 = mVar.q();
                        if (zR2) {
                            final int i17 = 1;
                            objQ5 = new e23.a() { // from class: n40.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            return p0.n(Boolean.valueOf(aVar.f116566g));
                                        case 1:
                                            return p0.n(aVar.f116567h);
                                        case 2:
                                            return p0.n(Boolean.valueOf(aVar.f116571l));
                                        case 3:
                                            return p0.n(aVar.f116572m);
                                        case 4:
                                            return p0.n(aVar.f116573n);
                                        default:
                                            return p0.n(aVar.f116574o);
                                    }
                                }
                            };
                            mVar.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                final int i18 = 1;
                                objQ5 = new e23.a() { // from class: n40.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                return p0.n(Boolean.valueOf(aVar.f116566g));
                                            case 1:
                                                return p0.n(aVar.f116567h);
                                            case 2:
                                                return p0.n(Boolean.valueOf(aVar.f116571l));
                                            case 3:
                                                return p0.n(aVar.f116572m);
                                            case 4:
                                                return p0.n(aVar.f116573n);
                                            default:
                                                return p0.n(aVar.f116574o);
                                        }
                                    }
                                };
                                mVar.K(objQ5);
                            }
                        }
                        p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ5, mVar, 0);
                        v vVar2 = v.HAZARDS;
                        boolean z17 = aVar.f116566g;
                        pVar2 = pVar;
                        boolean zB4 = mVar.B(p1Var) | mVar.B(pVar2);
                        Object objQ6 = mVar.q();
                        if (zB4) {
                            i16 = 2;
                            objQ6 = new et1.i(pVar2, p1Var, 2);
                            mVar.K(objQ6);
                        } else {
                            aVar2.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                i16 = 2;
                                objQ6 = new et1.i(pVar2, p1Var, 2);
                                mVar.K(objQ6);
                            } else {
                                i16 = 2;
                            }
                        }
                        gg.b.i(vVar2, false, z17, (e23.l) objQ6, mVar, 6, 2);
                        if (((s20.h) KoinJavaComponent.get$default(cls, null, null, 6, null)).c()) {
                            mVar.C(637180912);
                            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                                mVar.C(637218918);
                                List list = (List) p1Var2.getF182175a();
                                boolean zB5 = mVar.B(p1Var2);
                                e23.l lVar = this.f123575d;
                                boolean zB6 = zB5 | mVar.B(lVar);
                                Object objQ7 = mVar.q();
                                if (zB6) {
                                    objQ7 = new b0(lVar, p1Var2, i14);
                                    mVar.K(objQ7);
                                } else {
                                    aVar2.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new b0(lVar, p1Var2, i14);
                                        mVar.K(objQ7);
                                    }
                                }
                                i.a(list, (e23.l) objQ7, mVar, 0);
                                mVar.f();
                            } else {
                                mVar.C(637545658);
                                mVar.f();
                            }
                            mVar.f();
                        } else {
                            mVar.C(637559546);
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        pVar2 = pVar;
                        i15 = 0;
                        i16 = 2;
                        mVar.C(637569466);
                        mVar.f();
                    }
                    final int i19 = 5;
                    if (aVar.f116568i) {
                        mVar.C(637658467);
                        v vVar3 = v.HAZARDS_ON_COURSE;
                        boolean z18 = aVar.f116569j;
                        boolean zB7 = mVar.B(pVar2);
                        Object objQ8 = mVar.q();
                        if (zB7) {
                            objQ8 = new r0(pVar2, 5);
                            mVar.K(objQ8);
                        } else {
                            aVar2.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new r0(pVar2, 5);
                                mVar.K(objQ8);
                            }
                        }
                        gg.b.i(vVar3, false, z18, (e23.l) objQ8, mVar, 6, 2);
                        mVar.f();
                    } else {
                        mVar.C(637926586);
                        mVar.f();
                    }
                    if (aVar.f116570k) {
                        mVar.C(638047610);
                        Object[] objArr3 = new Object[i15];
                        boolean zR3 = mVar.r(aVar);
                        Object objQ9 = mVar.q();
                        if (zR3) {
                            objQ9 = new e23.a() { // from class: n40.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            return p0.n(Boolean.valueOf(aVar.f116566g));
                                        case 1:
                                            return p0.n(aVar.f116567h);
                                        case 2:
                                            return p0.n(Boolean.valueOf(aVar.f116571l));
                                        case 3:
                                            return p0.n(aVar.f116572m);
                                        case 4:
                                            return p0.n(aVar.f116573n);
                                        default:
                                            return p0.n(aVar.f116574o);
                                    }
                                }
                            };
                            mVar.K(objQ9);
                        } else {
                            aVar2.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new e23.a() { // from class: n40.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i16) {
                                            case 0:
                                                return p0.n(Boolean.valueOf(aVar.f116566g));
                                            case 1:
                                                return p0.n(aVar.f116567h);
                                            case 2:
                                                return p0.n(Boolean.valueOf(aVar.f116571l));
                                            case 3:
                                                return p0.n(aVar.f116572m);
                                            case 4:
                                                return p0.n(aVar.f116573n);
                                            default:
                                                return p0.n(aVar.f116574o);
                                        }
                                    }
                                };
                                mVar.K(objQ9);
                            }
                        }
                        p1 p1Var3 = (p1) d4.a.e(objArr3, (e23.a) objQ9, mVar, i15);
                        Object[] objArr4 = new Object[i15];
                        boolean zR4 = mVar.r(aVar);
                        Object objQ10 = mVar.q();
                        if (zR4) {
                            final int i24 = 3;
                            objQ10 = new e23.a() { // from class: n40.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            return p0.n(Boolean.valueOf(aVar.f116566g));
                                        case 1:
                                            return p0.n(aVar.f116567h);
                                        case 2:
                                            return p0.n(Boolean.valueOf(aVar.f116571l));
                                        case 3:
                                            return p0.n(aVar.f116572m);
                                        case 4:
                                            return p0.n(aVar.f116573n);
                                        default:
                                            return p0.n(aVar.f116574o);
                                    }
                                }
                            };
                            mVar.K(objQ10);
                        } else {
                            aVar2.getClass();
                            if (objQ10 == p3.m.a.f135155b) {
                                final int i25 = 3;
                                objQ10 = new e23.a() { // from class: n40.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i25) {
                                            case 0:
                                                return p0.n(Boolean.valueOf(aVar.f116566g));
                                            case 1:
                                                return p0.n(aVar.f116567h);
                                            case 2:
                                                return p0.n(Boolean.valueOf(aVar.f116571l));
                                            case 3:
                                                return p0.n(aVar.f116572m);
                                            case 4:
                                                return p0.n(aVar.f116573n);
                                            default:
                                                return p0.n(aVar.f116574o);
                                        }
                                    }
                                };
                                mVar.K(objQ10);
                            }
                        }
                        p1 p1Var4 = (p1) d4.a.e(objArr4, (e23.a) objQ10, mVar, i15);
                        Object[] objArr5 = new Object[i15];
                        boolean zR5 = mVar.r(aVar);
                        Object objQ11 = mVar.q();
                        if (zR5) {
                            final int i26 = 4;
                            objQ11 = new e23.a() { // from class: n40.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return p0.n(Boolean.valueOf(aVar.f116566g));
                                        case 1:
                                            return p0.n(aVar.f116567h);
                                        case 2:
                                            return p0.n(Boolean.valueOf(aVar.f116571l));
                                        case 3:
                                            return p0.n(aVar.f116572m);
                                        case 4:
                                            return p0.n(aVar.f116573n);
                                        default:
                                            return p0.n(aVar.f116574o);
                                    }
                                }
                            };
                            mVar.K(objQ11);
                        } else {
                            aVar2.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                final int i27 = 4;
                                objQ11 = new e23.a() { // from class: n40.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i27) {
                                            case 0:
                                                return p0.n(Boolean.valueOf(aVar.f116566g));
                                            case 1:
                                                return p0.n(aVar.f116567h);
                                            case 2:
                                                return p0.n(Boolean.valueOf(aVar.f116571l));
                                            case 3:
                                                return p0.n(aVar.f116572m);
                                            case 4:
                                                return p0.n(aVar.f116573n);
                                            default:
                                                return p0.n(aVar.f116574o);
                                        }
                                    }
                                };
                                mVar.K(objQ11);
                            }
                        }
                        p1 p1Var5 = (p1) d4.a.e(objArr5, (e23.a) objQ11, mVar, i15);
                        Object[] objArr6 = new Object[i15];
                        boolean zR6 = mVar.r(aVar);
                        Object objQ12 = mVar.q();
                        if (zR6) {
                            objQ12 = new e23.a() { // from class: n40.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            return p0.n(Boolean.valueOf(aVar.f116566g));
                                        case 1:
                                            return p0.n(aVar.f116567h);
                                        case 2:
                                            return p0.n(Boolean.valueOf(aVar.f116571l));
                                        case 3:
                                            return p0.n(aVar.f116572m);
                                        case 4:
                                            return p0.n(aVar.f116573n);
                                        default:
                                            return p0.n(aVar.f116574o);
                                    }
                                }
                            };
                            mVar.K(objQ12);
                        } else {
                            aVar2.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                objQ12 = new e23.a() { // from class: n40.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i19) {
                                            case 0:
                                                return p0.n(Boolean.valueOf(aVar.f116566g));
                                            case 1:
                                                return p0.n(aVar.f116567h);
                                            case 2:
                                                return p0.n(Boolean.valueOf(aVar.f116571l));
                                            case 3:
                                                return p0.n(aVar.f116572m);
                                            case 4:
                                                return p0.n(aVar.f116573n);
                                            default:
                                                return p0.n(aVar.f116574o);
                                        }
                                    }
                                };
                                mVar.K(objQ12);
                            }
                        }
                        p1 p1Var6 = (p1) d4.a.e(objArr6, (e23.a) objQ12, mVar, i15);
                        v vVar4 = v.CLIMBS;
                        boolean z19 = aVar.f116571l;
                        boolean zB8 = mVar.B(p1Var3);
                        e23.l lVar2 = this.f123576e;
                        boolean zB9 = zB8 | mVar.B(lVar2);
                        Object objQ13 = mVar.q();
                        if (zB9) {
                            objQ13 = new b0(lVar2, p1Var3, 24);
                            mVar.K(objQ13);
                        } else {
                            aVar2.getClass();
                            if (objQ13 == p3.m.a.f135155b) {
                                objQ13 = new b0(lVar2, p1Var3, 24);
                                mVar.K(objQ13);
                            }
                        }
                        gg.b.i(vVar4, false, z19, (e23.l) objQ13, mVar, 6, 2);
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            mVar.C(638770933);
                            com.garmin.android.apps.connectmobile.courses.model.c cVar = (com.garmin.android.apps.connectmobile.courses.model.c) p1Var4.getF182175a();
                            boolean zB10 = mVar.B(p1Var4);
                            e23.l lVar3 = this.f123577f;
                            boolean zB11 = zB10 | mVar.B(lVar3);
                            Object objQ14 = mVar.q();
                            if (zB11) {
                                objQ14 = new b0(lVar3, p1Var4, 25);
                                mVar.K(objQ14);
                            } else {
                                aVar2.getClass();
                                if (objQ14 == p3.m.a.f135155b) {
                                    objQ14 = new b0(lVar3, p1Var4, 25);
                                    mVar.K(objQ14);
                                }
                            }
                            d.a(cVar, (e23.l) objQ14, mVar, i15);
                            com.garmin.android.apps.connectmobile.courses.model.b bVar = (com.garmin.android.apps.connectmobile.courses.model.b) p1Var5.getF182175a();
                            com.garmin.android.apps.connectmobile.courses.model.b bVar2 = (com.garmin.android.apps.connectmobile.courses.model.b) p1Var6.getF182175a();
                            boolean zB12 = mVar.B(p1Var5) | mVar.B(p1Var6);
                            p pVar4 = this.f123578g;
                            boolean zB13 = zB12 | mVar.B(pVar4);
                            Object objQ15 = mVar.q();
                            if (zB13) {
                                objQ15 = new y1(pVar4, p1Var5, p1Var6, 1);
                                mVar.K(objQ15);
                            } else {
                                aVar2.getClass();
                                if (objQ15 == p3.m.a.f135155b) {
                                    objQ15 = new y1(pVar4, p1Var5, p1Var6, 1);
                                    mVar.K(objQ15);
                                }
                            }
                            a.a(bVar, bVar2, (p) objQ15, mVar, i15);
                            String strQ = y.Q(mVar, R.string.climb_categories_help_button_title);
                            r.a aVar4 = r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar = j92.b.f97899b;
                            r rVarZ = c2.l.z(aVar4, eVar.f97920e, eVar.f97917b);
                            e23.a aVar5 = this.f123580i;
                            boolean zB14 = mVar.B(aVar5);
                            Object objQ16 = mVar.q();
                            if (zB14) {
                                objQ16 = new ll0.a(aVar5, 24);
                                mVar.K(objQ16);
                            } else {
                                aVar2.getClass();
                                if (objQ16 == p3.m.a.f135155b) {
                                    objQ16 = new ll0.a(aVar5, 24);
                                    mVar.K(objQ16);
                                }
                            }
                            r rVarD = w.d(rVarZ, false, null, null, (e23.a) objQ16, 15);
                            d92.b.f58624b.getClass();
                            p3.m mVar2 = mVar;
                            mh.c(strQ, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97933j, e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar2, 0, 0, 131068);
                            mVar = mVar2;
                            mVar.f();
                        } else {
                            mVar.C(639913562);
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        mVar.C(639923482);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                g.a(this.f123573b, this.f123574c, this.f123575d, this.f123576e, this.f123577f, this.f123578g, this.f123579h, this.f123580i, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(m40.a aVar, p pVar, e23.l lVar, e23.l lVar2, e23.l lVar3, p pVar2, e23.a aVar2, e23.a aVar3, int i14) {
        this.f123573b = aVar;
        this.f123574c = pVar;
        this.f123575d = lVar;
        this.f123576e = lVar2;
        this.f123577f = lVar3;
        this.f123578g = pVar2;
        this.f123579h = aVar2;
        this.f123580i = aVar3;
    }
}
