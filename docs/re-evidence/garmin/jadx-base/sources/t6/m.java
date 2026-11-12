package t6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList<e> f162695w0;

    public m() {
        this.f162695w0 = new ArrayList<>();
    }

    @Override // t6.e
    public void E() {
        this.f162695w0.clear();
        super.E();
    }

    @Override // t6.e
    public final void H(m6.c cVar) {
        super.H(cVar);
        int size = this.f162695w0.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f162695w0.get(i14).H(cVar);
        }
    }

    public final void W(e eVar) {
        this.f162695w0.add(eVar);
        e eVar2 = eVar.X;
        if (eVar2 != null) {
            ((m) eVar2).f162695w0.remove(eVar);
            eVar.E();
        }
        eVar.X = this;
    }

    public void X() {
        ArrayList<e> arrayList = this.f162695w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            e eVar = this.f162695w0.get(i14);
            if (eVar instanceof m) {
                ((m) eVar).X();
            }
        }
    }

    public m(int i14, int i15, int i16, int i17) {
        super(i14, i15, i16, i17);
        this.f162695w0 = new ArrayList<>();
    }

    public m(int i14, int i15) {
        super(i14, i15);
        this.f162695w0 = new ArrayList<>();
    }
}
