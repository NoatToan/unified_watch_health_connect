package lp1;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llp1/h;", "", "Landroid/view/View;", "view", "Le32/l;", "Lep1/g;", "navigator", "<init>", "(Landroid/view/View;Le32/l;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f114151a;

    public h(View view2, e32.l<ep1.g> lVar) {
        view2.getClass();
        lVar.getClass();
        Context context = view2.getContext();
        context.getClass();
        g gVar = new g(context, lVar);
        this.f114151a = gVar;
        new e32.g(null, view2, null, 5, null).a(gVar);
    }

    public final void a(ArrayList arrayList) {
        Collection collection = arrayList;
        if (arrayList == null) {
            collection = j0.f134944a;
        }
        g gVar = this.f114151a;
        gVar.getClass();
        collection.getClass();
        ArrayList arrayList2 = gVar.f114146e;
        arrayList2.clear();
        if (!collection.isEmpty()) {
            arrayList2.addAll(collection);
        }
        gVar.notifyDataSetChanged();
    }
}
