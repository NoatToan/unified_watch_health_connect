package g22;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public final class p {
    public static final void a(RecyclerView recyclerView, RecyclerView.h<?> hVar) {
        if (hVar == null || recyclerView == null) {
            return;
        }
        recyclerView.setTag(R.id.adapter_name, hVar.getClass().getName());
    }

    public static final void b(View view2, Object obj) {
        if (view2 != null) {
            view2.setTag(R.id.view_holder_name, obj.getClass().getName());
        }
    }
}
