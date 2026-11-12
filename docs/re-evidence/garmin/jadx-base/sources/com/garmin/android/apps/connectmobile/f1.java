package com.garmin.android.apps.connectmobile;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f1 extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f34942a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f34943b = new ArrayList();

    public static class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FrameLayout f34944a;

        public a(View view2) {
            super(view2);
            this.f34944a = (FrameLayout) view2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f34943b.size() + u() + this.f34942a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i14) {
        ArrayList arrayList = this.f34942a;
        if (i14 < arrayList.size()) {
            return 0;
        }
        return i14 >= u() + arrayList.size() ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        ArrayList arrayList = this.f34942a;
        if (i14 < arrayList.size()) {
            View view2 = (View) arrayList.get(i14);
            FrameLayout frameLayout = ((a) f0Var).f34944a;
            frameLayout.removeAllViews();
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            frameLayout.setImportantForAccessibility(2);
            frameLayout.addView(view2);
            return;
        }
        if (i14 < u() + arrayList.size()) {
            x(i14 - arrayList.size(), f0Var);
            return;
        }
        View view3 = (View) this.f34943b.get((i14 - u()) - arrayList.size());
        FrameLayout frameLayout2 = ((a) f0Var).f34944a;
        frameLayout2.removeAllViews();
        if (view3.getParent() != null) {
            ((ViewGroup) view3.getParent()).removeView(view3);
        }
        frameLayout2.setImportantForAccessibility(2);
        frameLayout2.addView(view3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        if (i14 != 0 && i14 != 2) {
            return z(viewGroup, i14);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(frameLayout);
    }

    public final void r(View view2) {
        ArrayList arrayList = this.f34943b;
        if (arrayList.contains(view2)) {
            return;
        }
        arrayList.add(view2);
        notifyItemInserted((arrayList.size() + (u() + this.f34942a.size())) - 1);
    }

    public final void t(View view2) {
        ArrayList arrayList = this.f34942a;
        if (arrayList.contains(view2)) {
            return;
        }
        arrayList.add(view2);
        notifyItemInserted(arrayList.size() - 1);
    }

    public abstract int u();

    public abstract void x(int i14, RecyclerView.f0 f0Var);

    public abstract RecyclerView.f0 z(ViewGroup viewGroup, int i14);
}
