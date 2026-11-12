package n70;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g4 implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<String> f124239a;

    public g4(List<String> list) {
        this.f124239a = list;
    }

    @Override // e23.a
    public final Boolean invoke() {
        boolean z14 = true;
        List<String> list = this.f124239a;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((String) it.next()) == null) {
                    z14 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z14);
    }
}
