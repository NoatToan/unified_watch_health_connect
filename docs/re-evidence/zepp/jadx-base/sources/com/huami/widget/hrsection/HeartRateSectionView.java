package com.huami.widget.hrsection;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class HeartRateSectionView extends FrameLayout {
    private a a;

    public HeartRateSectionView(Context context) {
        super(context);
        b();
    }

    private static int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private void b() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        a aVar = new a();
        this.a = aVar;
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        int color = ContextCompat.getColor(getContext(), R.color.hr_divider);
        recyclerView.addItemDecoration(new DividerDecoration(new DividerDecoration.Style().setDividerColor(color).setDividerPadding(a(getContext(), 20.0f)).setDividerSize(1).setShowHorizontal(true)));
        recyclerView.addItemDecoration(new DividerDecoration(new DividerDecoration.Style().setDividerColor(color).setDividerPadding(a(getContext(), 24.0f)).setDividerSize(1).setShowHorizontal(false)));
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -2));
    }

    public void setSections(List<HeartRateSectionItem> list) {
        this.a.setDataList(list);
        this.a.notifyDataSetChanged();
    }

    public HeartRateSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public HeartRateSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
