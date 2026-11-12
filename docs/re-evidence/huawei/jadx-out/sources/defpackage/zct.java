package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes46.dex */
public class zct {
    private final ArrayList<Object> e;

    public zct(int i) {
        this.e = new ArrayList<>(i);
    }

    public void a(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.e;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.e, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.e.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.e.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.e.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int d() {
        return this.e.size();
    }

    public void c(Object obj) {
        this.e.add(obj);
    }

    public Object[] b(Object[] objArr) {
        return this.e.toArray(objArr);
    }
}
