package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i1 extends j1<t.b<Object>, Object> {
    public i1() {
        super(null);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void g() {
        if (!this.f6758c) {
            for (int i14 = 0; i14 < this.f6756a.size(); i14++) {
                Map.Entry<t.b<Object>, Object> entryC = c(i14);
                if (entryC.getKey().isRepeated()) {
                    entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((t.b) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.g();
    }

    @Override // androidx.datastore.preferences.protobuf.j1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
