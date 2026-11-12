package d10;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h extends RecyclerView.h<a> {

    public static class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMCheckableRow f57035a;

        public a(View view2) {
            super(view2);
            GCMCheckableRow gCMCheckableRow = (GCMCheckableRow) view2.findViewById(R.id.selection_filter_item);
            this.f57035a = gCMCheckableRow;
            gCMCheckableRow.setDefaultTextAppearance(R.style.Text_Body1_Primary);
            gCMCheckableRow.f47747h.setVisibility(8);
            gCMCheckableRow.b(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        return new a(a0.d(viewGroup, R.layout.selection_filter_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract void onBindViewHolder(a aVar, int i14);
}
