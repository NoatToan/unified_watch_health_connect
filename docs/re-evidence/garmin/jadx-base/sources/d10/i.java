package d10;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter.EcgFilterResultFragment;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i<T> extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b<T> f57036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ComposeView f57037b;

    public class a extends LinearLayoutManager {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public final boolean canScrollVertically() {
            return i.this.w6() && super.canScrollVertically();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f57036a = (b) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.selection_filter_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        this.f57037b = (ComposeView) view2.findViewById(R.id.compose_view);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.selection_items);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new a(recyclerView.getContext()));
        recyclerView.setAdapter(u6());
        if (v6()) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
        }
    }

    public abstract RecyclerView.h u6();

    public boolean v6() {
        return false;
    }

    public boolean w6() {
        return this instanceof EcgFilterResultFragment;
    }
}
