package di1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.proto.generated.WifiSetup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f59799b;

    public /* synthetic */ z(a0 a0Var, int i14) {
        this.f59798a = i14;
        this.f59799b = a0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f59798a) {
            case 0:
                WifiSetup.StoredAccessPoint storedAccessPoint = (WifiSetup.StoredAccessPoint) obj;
                storedAccessPoint.getClass();
                hd0.b bVar = (hd0.b) this.f59799b.f59727e.getValue();
                bVar.getClass();
                bVar.f83309b.j(new hd0.h.c(storedAccessPoint));
                return Unit.INSTANCE;
            default:
                hd0.h hVar = (hd0.h) obj;
                if (hVar instanceof hd0.h.C1643h) {
                    gn2.c.d dVar = ((hd0.h.C1643h) hVar).f83362a;
                    a0 a0Var = this.f59799b;
                    if (dVar != null) {
                        List<WifiSetup.StoredAccessPoint> list = dVar.f78108c;
                        TextView textView = a0Var.f59724b;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("networksHeaderView");
                            throw null;
                        }
                        textView.setVisibility(!list.isEmpty() ? 0 : 8);
                        TextView textView2 = a0Var.f59725c;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("networksNoDataView");
                            throw null;
                        }
                        textView2.setVisibility(list.isEmpty() ? 0 : 8);
                        RecyclerView recyclerView = a0Var.f59726d;
                        if (recyclerView == null) {
                            p005kotlin.jvm.internal.s.m("networksRecyclerView");
                            throw null;
                        }
                        recyclerView.setImportantForAccessibility(list.isEmpty() ? 2 : 1);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new k.b((WifiSetup.StoredAccessPoint) it.next()));
                        }
                        arrayList.addAll(arrayList2);
                        if (!arrayList.isEmpty()) {
                            arrayList.add(new k.a(dVar.f78106a));
                        }
                        a0Var.f59728f.t(arrayList);
                    } else {
                        g22.e.c(a0Var);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
