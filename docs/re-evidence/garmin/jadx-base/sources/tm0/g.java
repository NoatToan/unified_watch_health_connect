package tm0;

import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltm0/g;", "Lef0/d;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements ef0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f165368a;

    public g(c cVar) {
        this.f165368a = cVar;
    }

    @Override // ef0.d
    public final void a(List<ef0.b> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ef0.b) obj).f63940b == ef0.e.SUCCESS) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        c cVar = this.f165368a;
        cVar.f165351b = size;
        MenuItem menuItem = cVar.f165356g;
        if (menuItem != null) {
            menuItem.setEnabled(c.u6(cVar));
        }
    }
}
