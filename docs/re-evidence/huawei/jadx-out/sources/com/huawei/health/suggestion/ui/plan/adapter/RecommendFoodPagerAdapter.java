package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.pluginoperation.util.DietKakaUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.hdc;
import defpackage.hdp;
import defpackage.hvq;
import defpackage.idy;
import defpackage.ieg;
import defpackage.iei;
import defpackage.ift;
import defpackage.iun;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qre;
import defpackage.vgo;
import defpackage.vgu;
import defpackage.vgw;
import health.compact.a.HiDateUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class RecommendFoodPagerAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9641c;
    private final SparseArray<List<hdc>> d;
    private String e;
    private IntPlan f;
    private boolean g;
    private AiPlanWeekDetailViewHolder h;
    private String i;
    private final boolean j;
    private vgo k;
    private final SparseIntArray l;
    private long o;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public RecommendFoodPagerAdapter() {
        Context contextB = BaseApplication.b();
        this.f9640b = contextB;
        this.d = new SparseArray<>();
        this.l = new SparseIntArray();
        this.j = qqs.e(contextB);
    }

    public void e(List<List<hdc>> list, vgo vgoVar, IntPlan intPlan, AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder, long j) {
        if (njy.e(list)) {
            LogUtil.e("RecommendFoodPagerAdapter", "setData list ", list);
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(Integer.valueOf(R.string.IDS_recipe_recommend_tip_1));
        arrayList.add(Integer.valueOf(R.string.IDS_recipe_recommend_tip_2));
        arrayList.add(Integer.valueOf(R.string.IDS_recipe_recommend_tip_3));
        Collections.shuffle(arrayList);
        int size = arrayList.size();
        this.l.clear();
        for (int i = 0; i < size; i++) {
            this.l.append(hvq.d(i), ((Integer) arrayList.get(i)).intValue());
        }
        this.d.clear();
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.d.append(hvq.d(i2), list.get(i2));
        }
        this.k = vgoVar;
        this.f = intPlan;
        this.h = aiPlanWeekDetailViewHolder;
        this.o = j;
        this.f9639a = HiDateUtil.d(j);
        this.e = ift.i(this.o);
        this.i = ift.i(HiDateUtil.h(this.o));
        this.f9641c = HiDateUtil.d(System.currentTimeMillis());
        this.g = hvq.c(this.k, this.o);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.d.size() * 900;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int size = this.d.size();
        if (size <= 0) {
            LogUtil.e("RecommendFoodPagerAdapter", "instantiateItem size ", Integer.valueOf(size), " index ", Integer.valueOf(i), " viewGroup ", viewGroup, " mArray ", this.d);
            return viewGroup;
        }
        View viewInflate = View.inflate(this.f9640b, R.layout.item_pager_recipe_recommend, null);
        int iKeyAt = this.d.keyAt(i % size);
        a(viewInflate, iKeyAt);
        List<hdc> list = this.d.get(iKeyAt);
        a(viewInflate, list);
        boolean zB = b(list, iKeyAt);
        a(viewInflate, zB, iKeyAt);
        b(viewInflate, zB, list, iKeyAt);
        c(viewInflate, iKeyAt);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    private void a(View view, int i) {
        int i2;
        if (i == 10) {
            i2 = R.string.IDS_ai_recommend_breakfast;
        } else if (i == 20) {
            i2 = R.string.IDS_ai_recommend_launch;
        } else if (i == 30) {
            i2 = R.string.IDS_ai_recommend_dinner;
        } else if (i == 40) {
            i2 = R.string.IDS_ai_recommend_breakfast_tomorrow;
        } else if (i == 50) {
            i2 = R.string.IDS_ai_recommend_launch_tomorrow;
        } else if (i != 60) {
            LogUtil.e("RecommendFoodPagerAdapter", "setTitle default mealType ", Integer.valueOf(i));
            i2 = 0;
        } else {
            i2 = R.string.IDS_ai_recommend_dinner_tomorrow;
        }
        String strF = qre.f(i2);
        if (TextUtils.isEmpty(strF)) {
            ReleaseLogUtil.d("RecommendFoodPagerAdapter", "setTitle titleString is empty resourceId ", Integer.valueOf(i2));
        } else {
            ((HealthTextView) view.findViewById(R.id.title)).setText(strF);
        }
    }

    private int a(List<hdc> list) {
        int iH = 0;
        if (njy.e(list)) {
            LogUtil.e("RecommendFoodPagerAdapter", "getHeat list ", list);
            return 0;
        }
        for (hdc hdcVar : list) {
            if (hdcVar != null) {
                iH = (int) (iH + hdcVar.h());
            }
        }
        return iH;
    }

    private void a(View view, List<hdc> list) {
        int iA = a(list);
        ((HealthTextView) view.findViewById(R.id.heat)).setText(qre.e(R.plurals.sug_chart_kcals, iA, UnitUtil.e(iA, 1, 0)));
    }

    private boolean b(List<hdc> list, int i) {
        if (njy.e(list) || !this.g || hvq.f(i)) {
            LogUtil.e("RecommendFoodPagerAdapter", "isAllRecord list ", list, " mealType ", Integer.valueOf(i), " mIsSameDay ", Boolean.valueOf(this.g));
            return false;
        }
        List<String> listA = hvq.a(this.k, i);
        for (hdc hdcVar : list) {
            if (hdcVar != null && !listA.contains(hdcVar.c())) {
                return false;
            }
        }
        return true;
    }

    private void a(View view, boolean z, final int i) {
        ImageView imageView = (ImageView) view.findViewById(R.id.do_change_button);
        if (z) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        Drawable drawable = ContextCompat.getDrawable(this.f9640b, R.drawable.ic_plan_rotate);
        if (drawable != null) {
            if (this.j) {
                drawable = qqf.c(drawable, ContextCompat.getColor(this.f9640b, R.color.common_color_black));
            }
            imageView.setImageDrawable(drawable);
        }
        final String str = hvq.f(i) ? this.i : this.e;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f37037a.d(str, i, view2);
            }
        });
    }

    public /* synthetic */ void d(final String str, final int i, View view) {
        new hdp().getReplaceList(str, hvq.e(i), hvq.a(this.k, i), new UiCallback<List<hdc>>() { // from class: com.huawei.health.suggestion.ui.plan.adapter.RecommendFoodPagerAdapter.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str2) {
                LogUtil.e("RecommendFoodPagerAdapter", "setRefresh onFailure errorCode ", Integer.valueOf(i2), " errorInfo ", str2);
                if (i2 == 15110) {
                    qpx.e(RecommendFoodPagerAdapter.this.f9640b, R.string.IDS_ai_recommend_already_best);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<hdc> list) {
                if (njy.e(list)) {
                    LogUtil.e("RecommendFoodPagerAdapter", "setRefresh data ", list);
                    return;
                }
                iei.b();
                if (RecommendFoodPagerAdapter.this.h != null) {
                    RecommendFoodPagerAdapter.this.h.a(list, hvq.b(i), str);
                } else {
                    LogUtil.e("RecommendFoodPagerAdapter", "setRefresh onSuccess mHolder is null");
                }
            }
        });
    }

    private void b(View view, boolean z, final List<hdc> list, final int i) {
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.do_all_record_button);
        if (z || hvq.f(i) || this.f9639a > this.f9641c) {
            healthButton.setVisibility(8);
            return;
        }
        healthButton.setVisibility(0);
        if (this.f9639a < this.f9641c) {
            healthButton.setText(R.string.IDS_make_up_record);
        }
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: hqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.b(i, list, view2);
            }
        });
    }

    public /* synthetic */ void b(int i, List list, View view) {
        long time = ieg.b(this.e + hvq.c(i), "yyyy-MM-dd HH:mm:ss").getTime();
        final vgw vgwVar = new vgw(hvq.a(i), time, a(list), hvq.e((List<hdc>) list));
        vgwVar.e(HiDateUtil.c(""));
        int iA = DateFormatUtil.a(time);
        ReleaseLogUtil.c("RecommendFoodPagerAdapter", "setRecord dayFormat ", Integer.valueOf(iA), " meal ", vgwVar);
        iun.a(iA, iA, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: hpx
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f37036a.a(vgwVar, i2, (List) obj);
            }
        });
    }

    public /* synthetic */ void a(vgw vgwVar, int i, List list) {
        LogUtil.b("RecommendFoodPagerAdapter", "setRecord errorCode ", Integer.valueOf(i), " dietRecordList ", list);
        d((List<vgo>) list, vgwVar, new ResponseCallback() { // from class: hqe
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f37047c.a(i2, (vgo) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, vgo vgoVar) {
        LogUtil.b("RecommendFoodPagerAdapter", "setRecord resultCode ", Integer.valueOf(i), " dietRecord ", vgoVar);
        if (vgoVar == null) {
            return;
        }
        idy.c(AnalyticsValue.INT_PLAN_2040151.value());
        HandlerExecutor.c(new Runnable() { // from class: hpw
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
    }

    public /* synthetic */ void a() {
        AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder = this.h;
        if (aiPlanWeekDetailViewHolder == null) {
            LogUtil.e("RecommendFoodPagerAdapter", "setRecord onSuccess mHolder is null");
        } else {
            aiPlanWeekDetailViewHolder.b(true, true);
        }
    }

    private void d(List<vgo> list, vgw vgwVar, ResponseCallback<vgo> responseCallback) {
        boolean z = this.f9639a < this.f9641c;
        if (njy.e(list)) {
            iun.a(vgwVar, responseCallback);
            iei.a(vgwVar.i(), z ? 2 : 1);
            return;
        }
        vgwVar.e(this.g ? this.k.g() : HiDateUtil.c(""));
        vgo vgoVar = list.get(0);
        vgw vgwVar2 = null;
        if (vgoVar != null) {
            for (vgw vgwVar3 : vgoVar.a()) {
                if (vgwVar3 != null && vgwVar3.i() == vgwVar.i()) {
                    vgwVar2 = vgwVar3;
                }
            }
        }
        if (vgwVar2 == null) {
            iun.a(vgwVar, responseCallback);
            DietKakaUtil.completeMeal(this.f9640b, this.k, vgwVar);
            iei.a(vgwVar.i(), z ? 2 : 1);
        } else {
            vgwVar.c(d(vgwVar2, vgwVar) + vgwVar.e());
            vgwVar.a(vgwVar2.d());
            vgwVar.c().addAll(vgwVar2.c());
            iun.e(vgwVar, responseCallback);
            iei.a(vgwVar.i(), z ? 2 : 3);
        }
    }

    private int d(vgw vgwVar, vgw vgwVar2) {
        List<vgu> listC = vgwVar2.c();
        List<vgu> listC2 = vgwVar.c();
        int iH = 0;
        if (!njy.e(listC) && !njy.e(listC2)) {
            Iterator<vgu> it = listC2.iterator();
            while (it.hasNext()) {
                vgu next = it.next();
                if (next != null) {
                    Iterator<vgu> it2 = listC.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            vgu next2 = it2.next();
                            if (next2 != null && next2.e().equals(next.e())) {
                                it.remove();
                                break;
                            }
                        } else {
                            iH = (int) (iH + next.h());
                            break;
                        }
                    }
                }
            }
        }
        return iH;
    }

    private void c(View view, int i) {
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.recycle_view);
        healthRecycleView.setIsScroll(false);
        healthRecycleView.setIsConsumption(true);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this.f9640b));
        RecommendFoodAdapter recommendFoodAdapter = new RecommendFoodAdapter(this.d, this.k, this.f, i, this.o);
        recommendFoodAdapter.b(this.l);
        healthRecycleView.setAdapter(recommendFoodAdapter);
    }
}
