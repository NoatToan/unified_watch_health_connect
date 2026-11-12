package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class uma extends RecyclerView.d0 {
    public uma(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public static uma a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new uma(frameLayout);
    }

    public FrameLayout getContainer() {
        return (FrameLayout) this.itemView;
    }
}
