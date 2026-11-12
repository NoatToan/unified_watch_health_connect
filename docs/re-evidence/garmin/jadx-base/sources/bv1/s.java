package bv1;

import android.app.Activity;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f21434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f21436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f21437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f21438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0 f21439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f21440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ jv1.n f21441j;

    public /* synthetic */ s(List list, u uVar, boolean z14, List list2, m0 m0Var, boolean z15, m0 m0Var2, ArrayList arrayList, jv1.n nVar, int i14) {
        this.f21432a = i14;
        this.f21433b = list;
        this.f21434c = uVar;
        this.f21435d = z14;
        this.f21436e = list2;
        this.f21437f = m0Var;
        this.f21438g = z15;
        this.f21439h = m0Var2;
        this.f21440i = arrayList;
        this.f21441j = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x020d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strA;
        float f14;
        Object[] objArr = 0;
        final int i14 = 1;
        switch (this.f21432a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1774408248, new s(this.f21433b, this.f21434c, this.f21435d, this.f21436e, this.f21437f, this.f21438g, this.f21439h, this.f21440i, this.f21441j, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarA2 = c2.l.A(aVar, 0.0f, eVar.f97920e, 1);
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_todays_activity);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar2), mVar2, 0, 0, 131068);
                    p3.m mVar3 = mVar2;
                    mVar3.C(-441779449);
                    ?? r14 = this.f21433b;
                    int i15 = 0;
                    for (Object obj3 : r14) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        iw1.a aVar3 = (iw1.a) obj3;
                        boolean z14 = aVar3.f95320h;
                        fg0.k kVar2 = aVar3.E;
                        final u uVar = this.f21434c;
                        if (z14) {
                            mVar3.C(-2106333919);
                            String str = aVar3.Y;
                            if (str != null) {
                                hv1.k.a aVar4 = hv1.k.f85893b;
                                Activity activity = uVar.f21444b;
                                aVar4.getClass();
                                strA = hv1.k.a.a(activity, str);
                            } else {
                                strA = null;
                            }
                            if (strA == null || strA.length() == 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f14 = j92.b.f97899b.f97920e;
                            } else {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f14 = j92.b.f97899b.f97918c;
                            }
                            hw1.j.a(null, gl1.y.Q(mVar3, R.string.lbl_rest_day), null, c2.l.e(0.0f, 0.0f, 0.0f, f14, 7), mVar3, 0, 5);
                            if (strA == null) {
                                mVar3.C(-2105323041);
                                mVar3.f();
                            } else {
                                mVar3.C(-2105323040);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                p3.m mVar4 = mVar3;
                                mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar4, 0, 0, 131070);
                                mVar3 = mVar4;
                                Unit unit = Unit.INSTANCE;
                                mVar3.f();
                            }
                            mVar3.f();
                        } else if (aVar3.f95319g && kVar2 != null) {
                            mVar3.C(-2104905222);
                            Long l14 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            fg0.t tVar = l14 != null ? this.f21441j.f101090l.get(Long.valueOf(l14.longValue())) : null;
                            String str2 = aVar3.Y;
                            boolean z15 = i15 < r14.size() - 1;
                            boolean zR = mVar3.r(uVar);
                            Object objQ = mVar3.q();
                            p3.m.a aVar5 = p3.m.f135153a;
                            if (zR) {
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                objQ = new e23.a() { // from class: bv1.t
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (objArr2) {
                                            case 0:
                                                uVar.f21445c.E5();
                                                break;
                                            default:
                                                uVar.f21445c.f4();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(objQ);
                            } else {
                                aVar5.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    final int objArr3 = objArr == true ? 1 : 0;
                                    objQ = new e23.a() { // from class: bv1.t
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (objArr3) {
                                                case 0:
                                                    uVar.f21445c.E5();
                                                    break;
                                                default:
                                                    uVar.f21445c.f4();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar3.K(objQ);
                                }
                            }
                            e23.a aVar6 = (e23.a) objQ;
                            boolean zR2 = mVar3.r(uVar);
                            Object objQ2 = mVar3.q();
                            if (zR2) {
                                objQ2 = new e23.a() { // from class: bv1.t
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i14) {
                                            case 0:
                                                uVar.f21445c.E5();
                                                break;
                                            default:
                                                uVar.f21445c.f4();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(objQ2);
                            } else {
                                aVar5.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new e23.a() { // from class: bv1.t
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    uVar.f21445c.E5();
                                                    break;
                                                default:
                                                    uVar.f21445c.f4();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar3.K(objQ2);
                                }
                            }
                            p3.m mVar5 = mVar3;
                            y.e(kVar2, tVar, str2, z15, aVar6, (e23.a) objQ2, mVar5, fg0.k.X | (fg0.t.f71346c << 3));
                            mVar3 = mVar5;
                            mVar3.f();
                        } else if (aVar3.f95318f) {
                            mVar3.C(-2104005757);
                            if (aVar3.f95316d != null) {
                                mVar3.C(-2103973424);
                                if (this.f21435d) {
                                    mVar3.C(-2103918709);
                                    List list = this.f21436e;
                                    if (list.contains(aVar3)) {
                                        mVar3.C(-2103861018);
                                        m0 m0Var = this.f21437f;
                                        if (m0Var.f105804a) {
                                            mVar3.C(-2103340993);
                                            mVar3.f();
                                        } else {
                                            mVar3.C(-2103793624);
                                            m0Var.f105804a = true;
                                            y.a(list, i15 < r14.size() - 1, mVar3, 0);
                                            mVar3.f();
                                        }
                                        mVar3.f();
                                    } else {
                                        mVar3.C(-2103163704);
                                        y.c(aVar3, i15 < r14.size() - 1, mVar3, 0);
                                        mVar3.f();
                                    }
                                    mVar3.f();
                                } else {
                                    mVar3.C(-2102437963);
                                    y.c(aVar3, i15 < r14.size() - 1, mVar3, 0);
                                    mVar3.f();
                                }
                                mVar3.f();
                            } else {
                                mVar3.C(-2102036761);
                                if (this.f21438g) {
                                    mVar3.C(-2101940103);
                                    m0 m0Var2 = this.f21439h;
                                    if (m0Var2.f105804a) {
                                        mVar3.C(-2101499841);
                                        mVar3.f();
                                    } else {
                                        mVar3.C(-2101878475);
                                        m0Var2.f105804a = true;
                                        y.b(this.f21440i, uVar.f21444b, mVar3, 0);
                                        mVar3.f();
                                    }
                                    mVar3.f();
                                } else {
                                    mVar3.C(-2101297969);
                                    y.d(aVar3, i15 < r14.size() - 1, uVar.f21444b, mVar3, 0);
                                    mVar3.f();
                                }
                                mVar3.f();
                            }
                            mVar3.f();
                        } else {
                            mVar3.C(-2100720129);
                            mVar3.f();
                        }
                        i15 = i16;
                    }
                    mVar3.f();
                    mVar3.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
