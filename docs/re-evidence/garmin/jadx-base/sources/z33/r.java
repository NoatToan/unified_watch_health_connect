package z33;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends s<Object, Object> {
    public r(int i14) {
        super(i14, null);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    @Override // z33.s
    public final void e() {
        if (!this.f202233d) {
            for (int i14 = 0; i14 < this.f202231b.size(); i14++) {
                s<K, V>.b bVar = this.f202231b.get(i14);
                if (((f.b) bVar.getKey()).isRepeated()) {
                    bVar.setValue(Collections.unmodifiableList((List) bVar.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : c()) {
                if (((f.b) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }

    @Override // z33.s, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((f.b) obj, obj2);
    }
}
