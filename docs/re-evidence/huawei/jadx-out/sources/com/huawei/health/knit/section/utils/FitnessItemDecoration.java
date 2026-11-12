package com.huawei.health.knit.section.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dkf;

/* JADX INFO: loaded from: classes7.dex */
public class FitnessItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7553b;
    private int e;

    public FitnessItemDecoration(Context context, int i, int i2) {
        this.f7553b = context;
        this.e = i;
        this.f7552a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (rect == null || recyclerView == null) {
            LogUtil.j("Section_FitnessItemDecoration", "getItemOffsets, outRect or parent is null");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        Context context = this.f7553b;
        int i = this.e;
        dkf.b(rect, view, recyclerView, 2, context, i, i, 2, false);
    }
}
