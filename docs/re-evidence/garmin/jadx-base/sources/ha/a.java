package ha;

import fa.z;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<n> f82542b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f82544d;

    public a(boolean z14) {
        this.f82541a = z14;
    }

    @Override // ha.d
    public final void a(n nVar) {
        nVar.getClass();
        ArrayList<n> arrayList = this.f82542b;
        if (arrayList.contains(nVar)) {
            return;
        }
        arrayList.add(nVar);
        this.f82543c++;
    }

    public final void c(int i14) {
        g gVar = this.f82544d;
        int i15 = z.f70071a;
        for (int i16 = 0; i16 < this.f82543c; i16++) {
            this.f82542b.get(i16).a(gVar, this.f82541a, i14);
        }
    }

    public final void d() {
        g gVar = this.f82544d;
        int i14 = z.f70071a;
        for (int i15 = 0; i15 < this.f82543c; i15++) {
            this.f82542b.get(i15).c(gVar, this.f82541a);
        }
        this.f82544d = null;
    }

    public final void e(g gVar) {
        for (int i14 = 0; i14 < this.f82543c; i14++) {
            this.f82542b.get(i14).getClass();
        }
    }

    public final void f(g gVar) {
        this.f82544d = gVar;
        for (int i14 = 0; i14 < this.f82543c; i14++) {
            this.f82542b.get(i14).e(gVar, this.f82541a);
        }
    }
}
