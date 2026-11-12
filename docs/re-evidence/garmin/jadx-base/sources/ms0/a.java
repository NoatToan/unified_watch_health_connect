package ms0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yr0.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lms0/a;", "Lcom/garmin/android/apps/connectmobile/f1;", "Lkotlin/Function1;", "", "", "onItemSelected", "<init>", "(Le23/l;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<Integer, Unit> f120452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f120453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f120454e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(l<? super Integer, Unit> lVar) {
        lVar.getClass();
        this.f120452c = lVar;
        this.f120453d = new ArrayList();
        this.f120454e = new ArrayList();
    }

    public final void A(List<Integer> list) {
        ArrayList arrayList = this.f120454e;
        arrayList.clear();
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            notifyItemChanged(((Number) it.next()).intValue());
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f120453d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (f0Var instanceof b) {
            b bVar = (b) f0Var;
            k32.l lVar = bVar.f120456a;
            j jVar = (j) this.f120453d.get(i14);
            jVar.getClass();
            ks0.c cVar = bVar.f120457b;
            String originLocation = jVar.getOriginLocation();
            String destinationLocation = jVar.getDestinationLocation();
            cVar.getClass();
            lVar.b(originLocation + " - " + destinationLocation, cVar.a(jVar.k("yyyy-MM-dd'T'HH:mm:ss.S"), jVar.d("yyyy-MM-dd'T'HH:mm:ss.S")));
            boolean zContains = this.f120454e.contains(Integer.valueOf(i14));
            k32.l.d(lVar, R.drawable.icon_danger, null, 16, 10);
            lVar.e(null);
            lVar.f(zContains);
            bVar.itemView.setOnClickListener(new b0(this, i14, 13));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        b.f120455c.getClass();
        View viewInflate = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(R.layout.gcm_row_item, viewGroup, false);
        viewInflate.getClass();
        return new b(viewInflate, new k32.l(viewInflate));
    }
}
