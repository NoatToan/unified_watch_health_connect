package bs2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class n4 implements aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4 f20325a = new m4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<o4> f20326b = new ArrayList<>();

    @Override // bs2.aq
    public final void a(zp zpVar) {
        m4 m4Var = this.f20325a;
        m4Var.getClass();
        if (zpVar.f19751a == m4Var.f19751a) {
            for (rc rcVar : zpVar.f19753c) {
                ArrayList<rc> arrayList = m4Var.f19753c;
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        arrayList.add(rcVar);
                        break;
                    } else {
                        if (arrayList.get(i14).f20454c == rcVar.f20454c) {
                            arrayList.set(i14, rcVar);
                            break;
                        }
                        i14++;
                    }
                }
            }
        }
        Iterator<o4> it = this.f20326b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
