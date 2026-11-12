package androidx.health.platform.client.proto;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p2 extends q2<f0.b<Object>, Object> {
    public p2() {
        super(null);
    }

    @Override // androidx.health.platform.client.proto.q2
    public final void g() {
        if (!this.f7751c) {
            for (int i14 = 0; i14 < this.f7749a.size(); i14++) {
                Map.Entry<f0.b<Object>, Object> entryC = c(i14);
                if (entryC.getKey().isRepeated()) {
                    entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((f0.b) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.g();
    }

    @Override // androidx.health.platform.client.proto.q2, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
