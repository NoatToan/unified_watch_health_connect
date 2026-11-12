package df;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f59392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f59393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f59394d;

    public /* synthetic */ b(WorkDatabase workDatabase, String str, t0 t0Var, int i14) {
        this.f59391a = i14;
        this.f59392b = workDatabase;
        this.f59393c = str;
        this.f59394d = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59391a) {
            case 0:
                Iterator<String> it = this.f59392b.j().n(this.f59393c).iterator();
                while (it.hasNext()) {
                    e.a(it.next(), this.f59394d);
                }
                break;
            default:
                Iterator<String> it3 = this.f59392b.j().o(this.f59393c).iterator();
                while (it3.hasNext()) {
                    e.a(it3.next(), this.f59394d);
                }
                break;
        }
    }
}
