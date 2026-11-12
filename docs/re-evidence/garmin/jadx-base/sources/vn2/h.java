package vn2;

import org.slf4j.Logger;
import ty1.g2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements u03.f, u03.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f178886b;

    public /* synthetic */ h(e23.l lVar, int i14) {
        this.f178885a = i14;
        this.f178886b = lVar;
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f178885a;
        e23.l lVar = this.f178886b;
        switch (i14) {
            case 2:
                Logger logger = m.f178912c;
                ((j) lVar).invoke(obj);
                break;
            case 3:
                Logger logger2 = m.f178912c;
                ((j) lVar).invoke(obj);
                break;
            case 4:
                Logger logger3 = m.f178912c;
                ((j) lVar).invoke(obj);
                break;
            case 5:
                Logger logger4 = m.f178912c;
                ((j) lVar).invoke(obj);
                break;
            case 6:
                Logger logger5 = m.f178912c;
                ((j) lVar).invoke(obj);
                break;
            case 7:
                Logger logger6 = m.f178912c;
                ((j) lVar).invoke(obj);
                break;
            case 8:
                Logger logger7 = m.f178912c;
                ((j) lVar).invoke(obj);
                break;
            case 9:
                Logger logger8 = m.f178912c;
                ((j) lVar).invoke(obj);
                break;
            case 10:
                Logger logger9 = m.f178912c;
                ((ad0.f) lVar).invoke(obj);
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                Logger logger10 = b0.f178864c;
                ((g2) lVar).invoke(obj);
                break;
            case 21:
                Logger logger11 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 22:
                Logger logger12 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 23:
                Logger logger13 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 24:
                Logger logger14 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 25:
                Logger logger15 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 26:
                Logger logger16 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
            case 27:
                Logger logger17 = b0.f178864c;
                ((g2) lVar).invoke(obj);
                break;
            case 28:
                Logger logger18 = b0.f178864c;
                ((t) lVar).invoke(obj);
                break;
        }
    }

    @Override // u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        switch (this.f178885a) {
            case 0:
                return i.d1((vb1.d) this.f178886b, obj);
            case 1:
                return i.a1((uo1.a) this.f178886b, obj);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return s.R1((q) this.f178886b, obj);
            case 11:
                return s.X1((o) this.f178886b, obj);
            case 12:
                return s.Z1((o) this.f178886b, obj);
            case 13:
                return s.E1((q) this.f178886b, obj);
            case 14:
                return s.G1((q) this.f178886b, obj);
            case 15:
                return s.M1((aq1.d0) this.f178886b, obj);
            case 16:
                return s.a2((g2) this.f178886b, obj);
            case 17:
                return s.N1((q) this.f178886b, obj);
            case 18:
                return s.A1((cf.a0) this.f178886b, obj);
            case 19:
                return s.B1((q) this.f178886b, obj);
        }
    }
}
