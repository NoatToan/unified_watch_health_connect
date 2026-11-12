package n70;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class v3 implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<List<pb2.e.z>> f124691a;

    /* JADX WARN: Multi-variable type inference failed */
    public v3(List<? extends List<pb2.e.z>> list) {
        this.f124691a = list;
    }

    @Override // e23.a
    public final Boolean invoke() {
        boolean z14 = true;
        List<List<pb2.e.z>> list = this.f124691a;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((List) it.next()) == null) {
                    z14 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z14);
    }
}
