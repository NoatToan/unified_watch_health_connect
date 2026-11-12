package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.hdc;
import defpackage.hdd;
import defpackage.hvq;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import defpackage.vfy;
import defpackage.vgo;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class RecommendFoodAdapter extends BaseRecyclerAdapter<hdc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntPlan f9636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9637c;
    private final boolean d;
    private final Context e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private vgo k;
    private List<hdc> l;
    private String m;
    private int n;
    private final Resources o;
    private int p;
    private int r;
    private SparseIntArray s;

    public RecommendFoodAdapter(SparseArray<List<hdc>> sparseArray, vgo vgoVar, IntPlan intPlan, int i, long j) {
        int i2;
        super(new ArrayList(), R.layout.item_recycler_recommend_food);
        Context contextB = BaseApplication.b();
        this.e = contextB;
        Resources resources = contextB.getResources();
        this.o = resources;
        this.d = LanguageUtil.f(contextB);
        this.l = new ArrayList(3);
        this.s = new SparseIntArray();
        if (sparseArray == null) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "RecommendFoodAdapter sparseArray is null");
            return;
        }
        this.p = i;
        List<hdc> list = sparseArray.get(i);
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "RecommendFoodAdapter list ", list);
            return;
        }
        int size = list.size();
        this.r = size;
        this.i = size - 1;
        boolean z = size > 3;
        this.j = z;
        if (z) {
            i2 = R.dimen.health_common_54dp;
        } else {
            i2 = R.dimen.health_common_72dp;
        }
        this.f9635a = resources.getDimensionPixelSize(i2);
        int iC = c(sparseArray);
        int iAbs = Math.abs((resources.getDimensionPixelSize(iC > 3 ? R.dimen.health_common_54dp : R.dimen.health_common_72dp) * iC) - (this.f9635a * this.r));
        this.n = iAbs;
        if (iAbs <= resources.getDimensionPixelSize(R.dimen.health_common_1dp)) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "RecommendFoodAdapter mOtherHeight ", Integer.valueOf(this.n), " mHeight ", Integer.valueOf(this.f9635a), " mSize ", Integer.valueOf(this.r), " maxCount ", Integer.valueOf(iC));
            this.n = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (hdc hdcVar : list) {
            if (hdcVar != null) {
                arrayList.add(hdcVar);
            }
        }
        if (arrayList.size() < iC) {
            arrayList.add(new hdc());
        }
        this.h = qrs.a(3.1f);
        this.l = arrayList;
        this.k = vgoVar;
        this.f9636b = intPlan;
        this.f9637c = DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        boolean zF = hvq.f(this.p);
        this.f = zF;
        if (zF) {
            this.m = DateFormatUtil.e(lsl.w(j), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        }
        this.g = hvq.c(this.k, j);
        refreshDataChange(this.l);
    }

    public void b(SparseIntArray sparseIntArray) {
        if (sparseIntArray != null) {
            this.s = sparseIntArray;
        }
    }

    private int c(SparseArray<List<hdc>> sparseArray) {
        if (sparseArray == null) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "getMaxFoodCount sparseArray is null");
            return 0;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "getMaxFoodCount sparseArray ", sparseArray);
            return 0;
        }
        int iMax = 0;
        for (int i = 0; i < size; i++) {
            List<hdc> list = sparseArray.get(sparseArray.keyAt(i));
            if (!njy.e(list)) {
                iMax = Math.max(iMax, list.size());
            }
        }
        return iMax;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.l)) {
            return 0;
        }
        return this.l.size();
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, hdc hdcVar) {
        if (recyclerHolder == null || hdcVar == null) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "convert holder ", recyclerHolder, " itemData ", hdcVar, " position ", Integer.valueOf(i), " mList ", this.l);
            return;
        }
        boolean z = i >= this.r;
        ViewGroup.LayoutParams layoutParams = recyclerHolder.itemView.getLayoutParams();
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            layoutParams2.height = z ? this.n : this.f9635a;
            recyclerHolder.itemView.setLayoutParams(layoutParams2);
        }
        String strC = hdcVar.c();
        boolean z2 = !this.f && this.g && hvq.a(this.k, this.p).contains(strC);
        b(recyclerHolder, hdcVar, z2);
        d(recyclerHolder, hdcVar, z2);
        e(recyclerHolder, hdcVar, z2);
        recyclerHolder.e(R.id.divider, (TextUtils.isEmpty(strC) || i == this.i || i == getItemCount() - 1) ? 8 : 0);
        d(recyclerHolder, z);
    }

    private void b(RecyclerHolder recyclerHolder, final hdc hdcVar, final boolean z) {
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.food_image);
        String strG = hdcVar.g();
        if (TextUtils.isEmpty(strG)) {
            imageView.setVisibility(8);
            return;
        }
        String strTrim = strG.trim();
        if (TextUtils.isEmpty(strTrim)) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "initFoodImage url ", strTrim);
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int dimensionPixelSize = this.o.getDimensionPixelSize(this.j ? R.dimen.health_common_36dp : R.dimen.health_common_48dp);
            layoutParams2.width = dimensionPixelSize;
            layoutParams2.height = dimensionPixelSize;
            imageView.setLayoutParams(layoutParams2);
        }
        qqf.b(imageView, strTrim, qqf.f46647a, 0, R.drawable.blank_1008);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hpr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37030b.c(hdcVar, z, view);
            }
        });
    }

    public /* synthetic */ void c(hdc hdcVar, boolean z, View view) {
        c(hdcVar, z);
    }

    private void d(RecyclerHolder recyclerHolder, final hdc hdcVar, final boolean z) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.food_name);
        HealthTextView healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.food_content);
        HealthTextView healthTextView3 = (HealthTextView) recyclerHolder.d(R.id.food_heat);
        HealthTextView healthTextView4 = (HealthTextView) recyclerHolder.d(R.id.food_heat_large_mode);
        int dimensionPixelSize = this.o.getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_14dp);
        if (this.j) {
            int dimensionPixelSize2 = this.o.getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_12dp);
            healthTextView.setTextSize(0, dimensionPixelSize);
            float f = dimensionPixelSize2;
            healthTextView2.setTextSize(0, f);
            healthTextView3.setTextSize(0, f);
            healthTextView4.setTextSize(0, f);
        } else {
            healthTextView.setTextSize(0, this.o.getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_16dp));
            float f2 = dimensionPixelSize;
            healthTextView2.setTextSize(0, f2);
            healthTextView3.setTextSize(0, f2);
            healthTextView4.setTextSize(0, f2);
        }
        String strB = hdcVar.b();
        healthTextView.setText(strB);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: hpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37040c.a(hdcVar, z, view);
            }
        });
        healthTextView.setVisibility(TextUtils.isEmpty(strB) ? 8 : 0);
        int iH = (int) hdcVar.h();
        String strE = qre.e(R.plurals.sug_chart_kcals, iH, UnitUtil.e(iH, 1, 0));
        int i = iH <= 0 ? 8 : 0;
        if (!this.j && this.h) {
            healthTextView4.setVisibility(i);
            healthTextView4.setText(strE);
            healthTextView3.setVisibility(8);
            healthTextView3.setText("");
        } else {
            healthTextView3.setVisibility(i);
            healthTextView3.setText(strE);
            healthTextView4.setVisibility(8);
            healthTextView4.setText("");
        }
        b(healthTextView2, hdcVar, z);
    }

    public /* synthetic */ void a(hdc hdcVar, boolean z, View view) {
        c(hdcVar, z);
    }

    private void b(HealthTextView healthTextView, final hdc hdcVar, final boolean z) {
        int iL = hdcVar.l();
        if (iL <= 0) {
            healthTextView.setVisibility(8);
            return;
        }
        healthTextView.setVisibility(0);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: hpv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37034a.d(hdcVar, z, view);
            }
        });
        hdd hddVarA = hvq.a(hdcVar);
        double dE = hvq.e(hddVarA, iL);
        String strE = UnitUtil.e(iL, 1, 0);
        String strM = hdcVar.m();
        if (Double.compare(dE, 0.0d) != 1) {
            healthTextView.setText(qre.a(R.string.IDS_food_content_about, strE, strM));
        } else {
            healthTextView.setText(qre.a(R.string.IDS_food_content_all_about, UnitUtil.e(dE, 1, 1), hddVarA == null ? "" : hddVarA.b(), strE, strM));
        }
    }

    public /* synthetic */ void d(hdc hdcVar, boolean z, View view) {
        c(hdcVar, z);
    }

    private void e(RecyclerHolder recyclerHolder, final hdc hdcVar, final boolean z) {
        Drawable drawable;
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.food_refresh);
        imageView.setVisibility(TextUtils.isEmpty(hdcVar.c()) ? 8 : 0);
        if (z) {
            drawable = ContextCompat.getDrawable(this.e, R.drawable.ic_plan_curriculum_completed_orange);
        } else {
            drawable = ContextCompat.getDrawable(this.e, R.drawable.ic_plan_rotate);
        }
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(z, hdcVar, view);
            }
        });
    }

    public /* synthetic */ void e(boolean z, hdc hdcVar, View view) {
        if (z) {
            c(hdcVar, true);
        } else {
            e(hdcVar);
        }
    }

    private void b() {
        HandlerExecutor.c(new Runnable() { // from class: hps
            @Override // java.lang.Runnable
            public final void run() {
                btq.e().e("PLAN_UPDATE");
            }
        }, 1000L);
    }

    private void c(hdc hdcVar, boolean z) {
        hdcVar.c(hvq.e(this.p));
        hvq.a(this.e, hdcVar, z, this.f ? this.m : this.f9637c, this.f9636b);
        b();
    }

    private void e(hdc hdcVar) {
        vfy vfyVarD;
        vgo vgoVar = this.k;
        int iMin = 1000;
        if (vgoVar != null && (vfyVarD = vgoVar.d()) != null) {
            iMin = Math.min(Math.max(1000, Math.round(vfyVarD.e())), 10000);
        }
        hdcVar.c(hvq.e(this.p));
        hvq.a(this.e, hdcVar, this.f ? this.m : this.f9637c, this.f9636b, String.valueOf(iMin));
        b();
    }

    private void d(RecyclerHolder recyclerHolder, boolean z) {
        LinearLayout linearLayout = (LinearLayout) recyclerHolder.d(R.id.food_tip);
        if (!z || this.n <= 0) {
            linearLayout.setVisibility(8);
            return;
        }
        CharSequence charSequenceI = qre.i(this.s.get(hvq.a(this.p)));
        int i = this.r;
        int i2 = this.f9635a;
        int i3 = this.n;
        int i4 = this.p;
        ReleaseLogUtil.c("R_RecommendFoodAdapter", "setFoodTip mSize ", Integer.valueOf(i), " mHeight ", Integer.valueOf(i2), " mOtherHeight ", Integer.valueOf(i3), " mWhichMeal ", Integer.valueOf(i4), " mList ", this.l, " text ", charSequenceI);
        if (TextUtils.isEmpty(charSequenceI)) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ((HealthTextView) recyclerHolder.d(R.id.food_tip_text)).setText(String.valueOf(charSequenceI));
        if (!this.d) {
            recyclerHolder.e(R.id.food_tip_left, 8);
            recyclerHolder.e(R.id.food_tip_left_oval, 8);
            recyclerHolder.e(R.id.food_tip_right_oval, 8);
            recyclerHolder.e(R.id.food_tip_right, 8);
            return;
        }
        recyclerHolder.e(R.id.food_tip_left, 0);
        recyclerHolder.e(R.id.food_tip_left_oval, 0);
        recyclerHolder.e(R.id.food_tip_right_oval, 0);
        recyclerHolder.e(R.id.food_tip_right, 0);
        ViewTreeObserver viewTreeObserver = linearLayout.getViewTreeObserver();
        if (viewTreeObserver == null) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "setFoodTip viewTreeObserver is null");
        } else {
            viewTreeObserver.addOnGlobalLayoutListener(new c(this, recyclerHolder));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view, float f) {
        if (view == null) {
            ReleaseLogUtil.d("R_RecommendFoodAdapter", "setFoodTipViewLayoutParams view is null weight ", Float.valueOf(f));
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = f;
            view.setLayoutParams(layoutParams2);
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<RecyclerHolder> f9638c;
        private final WeakReference<RecommendFoodAdapter> d;

        c(RecommendFoodAdapter recommendFoodAdapter, RecyclerHolder recyclerHolder) {
            this.d = new WeakReference<>(recommendFoodAdapter);
            this.f9638c = new WeakReference<>(recyclerHolder);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecommendFoodAdapter recommendFoodAdapter = this.d.get();
            if (recommendFoodAdapter == null) {
                ReleaseLogUtil.d("R_RecommendFoodAdapter", "InnerViewTreeObserver onGlobalLayout recommendFoodAdapter is null");
                return;
            }
            RecyclerHolder recyclerHolder = this.f9638c.get();
            if (recyclerHolder == null) {
                ReleaseLogUtil.d("R_RecommendFoodAdapter", "InnerViewTreeObserver onGlobalLayout recyclerHolder is null");
                return;
            }
            LinearLayout linearLayout = (LinearLayout) recyclerHolder.d(R.id.food_tip);
            float width = 0.0f;
            if (linearLayout != null) {
                ViewTreeObserver viewTreeObserver = linearLayout.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.food_tip_text);
                width = (linearLayout.getWidth() - (healthTextView != null ? healthTextView.getTextWidth() : 0.0f)) - qre.b(R.dimen.health_common_44dp);
            }
            float f = width / 2.0f;
            recommendFoodAdapter.d(recyclerHolder.d(R.id.food_tip_left), f);
            recommendFoodAdapter.d(recyclerHolder.d(R.id.food_tip_right), f);
        }
    }
}
