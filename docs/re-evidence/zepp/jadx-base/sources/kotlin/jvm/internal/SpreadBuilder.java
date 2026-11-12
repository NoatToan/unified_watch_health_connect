package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public class SpreadBuilder {
    private final ArrayList<Object> a;

    public SpreadBuilder(int i) {
        this.a = new ArrayList<>(i);
    }

    public void add(Object obj) {
        this.a.add(obj);
    }

    public void addSpread(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                this.a.add(it2.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it3 = (Iterator) obj;
            while (it3.hasNext()) {
                this.a.add(it3.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int size() {
        return this.a.size();
    }

    public Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }
}
