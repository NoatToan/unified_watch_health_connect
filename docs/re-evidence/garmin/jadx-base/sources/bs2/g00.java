package bs2;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class g00 implements ao {
    @Override // bs2.ao
    public final boolean a(fk fkVar) {
        if (fkVar.f20137e.size() > 0) {
            return false;
        }
        Iterator<wc> it = fkVar.f20136d.iterator();
        while (it.hasNext()) {
            if ((it.next().f20645c & 31) > 13) {
                return false;
            }
        }
        return true;
    }

    @Override // bs2.ao
    public final boolean b(bk bkVar) {
        if (new fk(bkVar).f20137e.size() > 0) {
            return false;
        }
        Iterator it = Collections.unmodifiableCollection(bkVar.f19753c).iterator();
        while (it.hasNext()) {
            if ((((rc) it.next()).f20455d & 31) > 13) {
                return false;
            }
        }
        return true;
    }
}
