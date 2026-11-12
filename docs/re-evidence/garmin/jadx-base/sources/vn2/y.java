package vn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y implements u03.d, u03.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f178968b;

    public /* synthetic */ y(e23.l lVar, int i14) {
        this.f178967a = i14;
        this.f178968b = lVar;
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f178967a;
        e23.l lVar = this.f178968b;
        switch (i14) {
            case 0:
                Logger logger = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 1:
                Logger logger2 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 2:
            case 6:
            case 7:
            case 13:
            case 17:
            case 18:
            case 19:
            default:
                Logger logger3 = v0.f178959c;
                ((r0) lVar).invoke(obj);
                break;
            case 3:
                Logger logger4 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 4:
                Logger logger5 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 5:
                Logger logger6 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 8:
                Logger logger7 = b0.f178864c;
                ((w) lVar).invoke(obj);
                break;
            case 9:
                Logger logger8 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 10:
                Logger logger9 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 11:
                Logger logger10 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 12:
                Logger logger11 = b0.f178864c;
                ((vb1.d) lVar).invoke(obj);
                break;
            case 14:
                Logger logger12 = b0.f178864c;
                ((a0) lVar).invoke(obj);
                break;
            case 15:
                Logger logger13 = b0.f178864c;
                ((a0) lVar).invoke(obj);
                break;
            case 16:
                Logger logger14 = b0.f178864c;
                ((a0) lVar).invoke(obj);
                break;
            case 20:
                Logger logger15 = k0.f178905d;
                ((h0) lVar).invoke(obj);
                break;
            case 21:
                Logger logger16 = k0.f178905d;
                ((h0) lVar).invoke(obj);
                break;
            case 22:
                Logger logger17 = k0.f178905d;
                ((h0) lVar).invoke(obj);
                break;
            case 23:
                Logger logger18 = k0.f178905d;
                ((h0) lVar).invoke(obj);
                break;
            case 24:
                Logger logger19 = k0.f178905d;
                ((h0) lVar).invoke(obj);
                break;
            case 25:
                Logger logger20 = k0.f178905d;
                ((h0) lVar).invoke(obj);
                break;
            case 26:
                Logger logger21 = k0.f178905d;
                ((ap.b) lVar).invoke(obj);
                break;
            case 27:
                Logger logger22 = k0.f178905d;
                ((vb1.d) lVar).invoke(obj);
                break;
        }
    }

    @Override // u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        int i14 = this.f178967a;
        e23.l lVar = this.f178968b;
        switch (i14) {
            case 2:
                Logger logger = b0.f178864c;
                obj.getClass();
                return (q03.v) ((t) lVar).invoke(obj);
            case 6:
                Logger logger2 = b0.f178864c;
                obj.getClass();
                return (q03.f) ((t) lVar).invoke(obj);
            case 7:
                Logger logger3 = b0.f178864c;
                obj.getClass();
                return (q03.f) ((t) lVar).invoke(obj);
            case 13:
                Logger logger4 = b0.f178864c;
                obj.getClass();
                return (q03.f) ((t) lVar).invoke(obj);
            case 17:
                return g0.c1((vb1.d) lVar, obj);
            case 18:
                return g0.f1((ap.b) lVar, obj);
            case 19:
                return g0.a1((vb1.d) lVar, obj);
            default:
                return q0.W0((ot.c) lVar, obj);
        }
    }
}
