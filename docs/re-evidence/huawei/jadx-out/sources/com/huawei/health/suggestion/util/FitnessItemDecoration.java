package com.huawei.health.suggestion.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10214b;
    private int e;

    public FitnessItemDecoration(Context context, int i, int i2) {
        this.f10214b = context;
        this.f10213a = i;
        this.e = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int iD;
        if (rect == null || recyclerView == null) {
            LogUtil.j("Suggestion_FitnessItemDecoration", "getItemOffsets, outRect or parent is null");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view) % 2;
        int iD2 = 0;
        if (childAdapterPosition != 0) {
            iD = qrs.d(this.f10214b, this.f10213a / 2.0f);
        } else {
            iD2 = qrs.d(this.f10214b, this.f10213a / 2.0f);
            iD = 0;
        }
        if (!LanguageUtil.ba(this.f10214b)) {
            int i = iD2;
            iD2 = iD;
            iD = i;
        }
        rect.set(iD2, qrs.d(this.f10214b, this.e / 2.0f), iD, qrs.d(this.f10214b, this.e / 2.0f));
    }
}
