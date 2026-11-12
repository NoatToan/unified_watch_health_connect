package un1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.smartnotification.PartialTableView;
import com.garmin.android.apps.connectmobile.smartnotification.PartialTableView.b;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class b<T> extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PartialTableView f172047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<T> f172048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<a<T>> f172049c;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.table_fragment_layout, viewGroup, false);
        this.f172047a = (PartialTableView) viewInflate.findViewById(R.id.table);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        c<T> cVar = this.f172048b;
        if (cVar == null) {
            return;
        }
        if (this.f172049c == null) {
            this.f172049c = cVar.f172050d;
        }
        PartialTableView partialTableView = this.f172047a;
        List<a<T>> list = this.f172049c;
        PartialTableView.b<?> bVar = partialTableView.f44298c;
        if (bVar != null) {
            c<?> cVar2 = bVar.f44300a;
            cVar2.f172057c.unregisterObserver(PartialTableView.this.f44297b);
        }
        PartialTableView.b<?> bVar2 = partialTableView.new b<>(cVar, list);
        partialTableView.f44298c = bVar2;
        PartialTableView partialTableView2 = PartialTableView.this;
        bVar2.f44300a.f172057c.registerObserver(partialTableView2.f44297b);
        partialTableView2.f44296a.post(new com.garmin.android.apps.connectmobile.smartnotification.d(bVar2));
    }
}
