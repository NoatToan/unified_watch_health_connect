package p43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h2 extends n0 {
    public h2() {
        super(null);
    }

    @Override // p43.n0
    public final List<t1> D0() {
        return J0().D0();
    }

    @Override // p43.n0
    public final k1 E0() {
        return J0().E0();
    }

    @Override // p43.n0
    public final m1 F0() {
        return J0().F0();
    }

    @Override // p43.n0
    public final boolean G0() {
        return J0().G0();
    }

    @Override // p43.n0
    public final f2 I0() {
        n0 n0VarJ0 = J0();
        while (n0VarJ0 instanceof h2) {
            n0VarJ0 = ((h2) n0VarJ0).J0();
        }
        n0VarJ0.getClass();
        return (f2) n0VarJ0;
    }

    public abstract n0 J0();

    public boolean K0() {
        return true;
    }

    @Override // p43.n0
    public final i43.l i() {
        return J0().i();
    }

    public final String toString() {
        return K0() ? J0().toString() : "<Not computed yet>";
    }
}
