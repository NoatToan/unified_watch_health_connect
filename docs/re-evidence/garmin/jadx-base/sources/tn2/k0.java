package tn2;

import b21.a5;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k0 implements u03.f, q03.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165588b;

    public /* synthetic */ k0(Object obj, int i14) {
        this.f165587a = i14;
        this.f165588b = obj;
    }

    @Override // u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        int i14 = this.f165587a;
        Object obj2 = this.f165588b;
        switch (i14) {
            case 0:
                Logger logger = r0.f165631n;
                obj.getClass();
                return (q03.v) ((cw1.k0) obj2).invoke(obj);
            case 1:
                Logger logger2 = r0.f165631n;
                obj.getClass();
                return (q03.f) ((h0) obj2).invoke(obj);
            case 2:
                Logger logger3 = r0.f165631n;
                obj.getClass();
                return (q03.f) ((m) obj2).invoke(obj);
            case 3:
            default:
                Logger logger4 = r0.f165631n;
                obj.getClass();
                return (q03.f) ((a5) obj2).invoke(obj);
            case 4:
                Logger logger5 = r0.f165631n;
                obj.getClass();
                return (q03.k) ((m) obj2).invoke(obj);
            case 5:
                Logger logger6 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((i0) obj2).invoke(obj);
            case 6:
                Logger logger7 = r0.f165631n;
                obj.getClass();
                return (rn2.v) ((m) obj2).invoke(obj);
            case 7:
                Logger logger8 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((l0) obj2).invoke(obj);
            case 8:
                Logger logger9 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((h0) obj2).invoke(obj);
            case 9:
                Logger logger10 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((h0) obj2).invoke(obj);
            case 10:
                Logger logger11 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((i0) obj2).invoke(obj);
            case 11:
                Logger logger12 = r0.f165631n;
                obj.getClass();
                return (q03.f) ((m) obj2).invoke(obj);
            case 12:
                Logger logger13 = r0.f165631n;
                obj.getClass();
                return (q03.f) ((h0) obj2).invoke(obj);
            case 13:
                Logger logger14 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((i0) obj2).invoke(obj);
            case 14:
                Logger logger15 = r0.f165631n;
                obj.getClass();
                return (q03.f) ((rp.b) obj2).invoke(obj);
            case 15:
                Logger logger16 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((b82.l0) obj2).invoke(obj);
            case 16:
                Logger logger17 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((m) obj2).invoke(obj);
            case 17:
                Logger logger18 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((l0) obj2).invoke(obj);
            case 18:
                Logger logger19 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((h0) obj2).invoke(obj);
            case 19:
                Logger logger20 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((l0) obj2).invoke(obj);
            case 20:
                Logger logger21 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((h0) obj2).invoke(obj);
            case 21:
                Logger logger22 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((sy.i) obj2).invoke(obj);
            case 22:
                Logger logger23 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((bt1.t) obj2).invoke(obj);
            case 23:
                Logger logger24 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((h0) obj2).invoke(obj);
            case 24:
                Logger logger25 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((h0) obj2).invoke(obj);
            case 25:
                Logger logger26 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((m) obj2).invoke(obj);
            case 26:
                Logger logger27 = r0.f165631n;
                obj.getClass();
                return (rn2.j) ((n0) obj2).invoke(obj);
            case 27:
                Logger logger28 = r0.f165631n;
                obj.getClass();
                return (q03.v) ((n0) obj2).invoke(obj);
            case 28:
                Logger logger29 = r0.f165631n;
                obj.getClass();
                return (q03.f) ((rp.b) obj2).invoke(obj);
        }
    }

    @Override // q03.u
    public void c(e13.a.C1312a c1312a) {
        w wVar = (w) this.f165588b;
        Logger logger = r0.f165631n;
        c cVar = c.f165530a;
        k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(rd2.f.class);
        cVar.getClass();
        Object obj = c.f165531b.get(dVarB);
        obj.getClass();
        rd2.j jVar = ((rd2.f) obj).f152045a;
        long j8 = wVar.f165682c;
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            c1312a.c(fVarI);
        } else {
            kg.f.n("Cannot find device record which unit id is [$123456L]");
        }
    }
}
