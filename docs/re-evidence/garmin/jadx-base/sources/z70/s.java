package z70;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz70/s;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lz70/j;", "Lz70/i;", "exclusiveOffersApi", "<init>", "(Lz70/i;)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements com.garmin.android.apps.connectmobile.f0, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f202859d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f202860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f202861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f202862c;

    public s(i iVar) {
        iVar.getClass();
        this.f202860a = iVar;
        p2 p2VarA = q2.a(null);
        this.f202861b = p2VarA;
        this.f202862c = p2VarA;
    }

    @Override // z70.j
    public final void a() {
        this.f202861b.setValue(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f202847c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f202847c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objC = oVar.f202845a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f202847c;
        if (i15 == 0) {
            o13.r.b(objC);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            oVar.f202847c = 1;
            objC = bVar.C(oVar);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objC);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            v2.b bVar2 = (v2.b) v2Var;
            return new v2.b(Boolean.valueOf(((c80.k) bVar2.f47386a).f25398a), bVar2.f47387b, bVar2.f47388c, bVar2.f47389d);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        u0.r();
        return null;
        p pVar = new p(this, (String) objC, null);
        oVar.f202847c = 2;
        objC = com.garmin.android.apps.connectmobile.f0.J(this, pVar, oVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z70.j
    public final Object c(c80.l lVar, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f202854d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f202854d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objC = qVar.f202852b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f202854d;
        if (i15 == 0) {
            o13.r.b(objC);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            qVar.f202851a = lVar;
            qVar.f202854d = 1;
            objC = bVar.C(qVar);
            if (objC != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objC);
                return objC;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar = qVar.f202851a;
        o13.r.b(objC);
        r rVar = new r(this, (String) objC, new c80.m(p13.w.c(lVar)), null);
        qVar.f202851a = null;
        qVar.f202854d = 2;
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(this, rVar, qVar);
        return objJ == aVar ? aVar : objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f202833c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f202833c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objC = kVar.f202831a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f202833c;
        if (i15 == 0) {
            o13.r.b(objC);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            kVar.f202833c = 1;
            objC = bVar.C(kVar);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objC);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            this.f202861b.setValue((c80.o) ((v2.b) v2Var).f47386a);
            return v2Var;
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        u0.r();
        return null;
        l lVar = new l(this, (String) objC, null);
        kVar.f202833c = 2;
        objC = com.garmin.android.apps.connectmobile.f0.J(this, lVar, kVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, v13.c cVar) {
        m mVar;
        Set<Map.Entry<String, c80.e>> setEntrySet;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f202840d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f202840d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objC = mVar.f202838b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f202840d;
        int i16 = 6;
        c80.o oVar = null;
        LinkedHashMap linkedHashMap = null;
        if (i15 == 0) {
            o13.r.b(objC);
            f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            mVar.f202837a = str;
            mVar.f202840d = 1;
            objC = bVar.C(mVar);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            str = mVar.f202837a;
            o13.r.b(objC);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        p2 p2Var = this.f202861b;
        c80.o oVar2 = (c80.o) p2Var.getValue();
        c80.z zVar = (c80.z) ((v2.b) v2Var).f47386a;
        c80.n nVar = zVar.f25652a;
        if (oVar2 != null) {
            ArrayList arrayListD1 = p13.h0.d1(oVar2.f25501a);
            arrayListD1.remove(zf.b.o(new yw2.h(nVar, i16), arrayListD1));
            arrayListD1.add(nVar);
            Map<String, c80.e> map = oVar2.f25503c;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
                Map<String, c80.e> map2 = zVar.f25653b;
                if (map2 != null && (setEntrySet = map2.entrySet()) != null) {
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            oVar = new c80.o(arrayListD1, oVar2.f25502b, linkedHashMap);
        }
        p2Var.setValue(oVar);
        return v2Var;
        n nVar2 = new n(this, (String) objC, new c80.y(str), null);
        mVar.f202837a = null;
        mVar.f202840d = 2;
        objC = com.garmin.android.apps.connectmobile.f0.J(this, nVar2, mVar);
    }

    @Override // z70.j
    /* JADX INFO: renamed from: g, reason: from getter */
    public final p2 getF202862c() {
        return this.f202862c;
    }
}
