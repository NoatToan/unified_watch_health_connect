package mz0;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v.h;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.newsfeed.filter.b f121643b;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.newsfeed.filter.b bVar, int i14) {
        this.f121642a = i14;
        this.f121643b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f121642a;
        final com.garmin.android.apps.connectmobile.newsfeed.filter.b bVar = this.f121643b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.newsfeed.filter.b.a aVar = com.garmin.android.apps.connectmobile.newsfeed.filter.b.f39532e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-1547829627, new b(bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.newsfeed.filter.b.a aVar2 = com.garmin.android.apps.connectmobile.newsfeed.filter.b.f39532e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    d.f81522a.getClass();
                    z zVarA = y.a(kVar, d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(aVar3, mVar2);
                    g.V.getClass();
                    e0.a aVar4 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    boolean zB = s3.b();
                    m.a aVar5 = m.f135153a;
                    if (zB) {
                        mVar2.C(436444231);
                        mVar2.f();
                    } else {
                        mVar2.C(436093466);
                        String strQ = gl1.y.Q(mVar2, R.string.connections_people_search);
                        nz0.b bVarV6 = bVar.v6();
                        Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                        context.getClass();
                        List listM0 = h0.M0(bVarV6.f128379a);
                        ArrayList arrayList = new ArrayList(p13.y.r(listM0, 10));
                        Iterator it = listM0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(context.getString(((nz0.a) it.next()).f128377b));
                        }
                        String strB = nz0.b.b(context, arrayList);
                        boolean zR = mVar2.r(bVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: mz0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (objArr2) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b interfaceC0709b = bVar.f39533d;
                                            if (interfaceC0709b != null) {
                                                interfaceC0709b.q5();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b interfaceC0709b2 = bVar.f39533d;
                                            if (interfaceC0709b2 != null) {
                                                interfaceC0709b2.v2();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        } else {
                            aVar5.getClass();
                            if (objQ == m.a.f135155b) {
                                final int objArr3 = objArr == true ? 1 : 0;
                                objQ = new e23.a() { // from class: mz0.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (objArr3) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b interfaceC0709b = bVar.f39533d;
                                                if (interfaceC0709b != null) {
                                                    interfaceC0709b.q5();
                                                }
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b interfaceC0709b2 = bVar.f39533d;
                                                if (interfaceC0709b2 != null) {
                                                    interfaceC0709b2.v2();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ);
                            }
                        }
                        d10.d.u6(strQ, strB, (e23.a) objQ, mVar2);
                        mVar2.f();
                    }
                    String strQ2 = gl1.y.Q(mVar2, R.string.txt_activity_type);
                    nz0.b bVarV7 = bVar.v6();
                    Context context2 = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    context2.getClass();
                    List listM1 = h0.M0(bVarV7.f128380b);
                    ArrayList arrayList2 = new ArrayList(p13.y.r(listM1, 10));
                    Iterator it3 = listM1.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(dh.b.A(context2, ((x0) it3.next()).f4360c));
                    }
                    String strB2 = nz0.b.b(context2, arrayList2);
                    boolean zR2 = mVar2.r(bVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: mz0.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b interfaceC0709b = bVar.f39533d;
                                        if (interfaceC0709b != null) {
                                            interfaceC0709b.q5();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b interfaceC0709b2 = bVar.f39533d;
                                        if (interfaceC0709b2 != null) {
                                            interfaceC0709b2.v2();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: mz0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b interfaceC0709b = bVar.f39533d;
                                            if (interfaceC0709b != null) {
                                                interfaceC0709b.q5();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b interfaceC0709b2 = bVar.f39533d;
                                            if (interfaceC0709b2 != null) {
                                                interfaceC0709b2.v2();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    d10.d.u6(strQ2, strB2, (e23.a) objQ2, mVar2);
                    mVar2.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
