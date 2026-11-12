package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TextAppearanceSpan;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btw;
import defpackage.ezn;
import defpackage.hdc;
import defpackage.hvq;
import defpackage.njy;
import defpackage.qli;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import defpackage.vgo;
import defpackage.vgw;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class AiDietRecordAdapter extends BaseRecyclerAdapter<List<hdc>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f9598c;
    private boolean d;
    private final boolean e;
    private vgo f;
    private List<List<hdc>> g;
    private OnItemClickListener i;

    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    private int c(double d) {
        if (d < 0.0d) {
            return 2;
        }
        return d == 0.0d ? 0 : 1;
    }

    public AiDietRecordAdapter() {
        super(new ArrayList(), R.layout.item_recycler_dietary_records);
        Context contextB = BaseApplication.b();
        this.f9598c = contextB;
        this.g = new ArrayList(3);
        this.e = LanguageUtil.ba(contextB);
    }

    public void e(List<List<hdc>> list, vgo vgoVar, long j) {
        if (njy.e(list)) {
            LogUtil.d("AiDietRecordAdapter", "setData list ", list);
            return;
        }
        if (list.size() > 3) {
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(list.get(i));
            }
            this.g = arrayList;
        } else {
            this.g = list;
        }
        this.f = vgoVar;
        this.d = hvq.c(vgoVar, j);
        this.f9597b = DateFormatUtil.a(j);
        this.f9596a = DateFormatUtil.a(System.currentTimeMillis());
        refreshDataChange(this.g);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.g)) {
            return 0;
        }
        return this.g.size();
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, List<hdc> list) {
        int i2;
        String strF;
        int i3;
        int i4;
        if (recyclerHolder == null || njy.e(list) || njy.e(this.g, i)) {
            LogUtil.d("AiDietRecordAdapter", "convert holder ", recyclerHolder, " itemData ", list, " position ", Integer.valueOf(i), " mList ", this.g);
            return;
        }
        int iD = hvq.d(i);
        float fC = c(iD);
        boolean z = Float.compare(fC, 0.0f) == 1;
        if (iD == 10) {
            if (z) {
                i2 = R.string.IDS_ai_record_breakfast_done;
            } else {
                i2 = R.string.IDS_ai_record_breakfast;
            }
            strF = qre.f(i2);
        } else if (iD == 20) {
            if (z) {
                i3 = R.string.IDS_ai_record_launch_done;
            } else {
                i3 = R.string.IDS_ai_record_launch;
            }
            strF = qre.f(i3);
        } else if (iD == 30) {
            if (z) {
                i4 = R.string.IDS_ai_record_dinner_done;
            } else {
                i4 = R.string.IDS_ai_record_dinner;
            }
            strF = qre.f(i4);
        } else {
            strF = "";
        }
        recyclerHolder.a(R.id.title, strF);
        d(recyclerHolder, list, fC, iD);
        recyclerHolder.a(R.id.arrow, this.e ? qqz.e(this.f9598c, R.drawable.ic_plan_arrow_right) : ContextCompat.getDrawable(this.f9598c, R.drawable.ic_plan_arrow_right));
        recyclerHolder.e(R.id.divider, iD == 30 ? 8 : 0);
        setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: hpe
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder2, int i5, Object obj) {
                this.e.d(recyclerHolder2, i5, obj);
            }
        });
    }

    public /* synthetic */ void d(RecyclerHolder recyclerHolder, int i, Object obj) {
        OnItemClickListener onItemClickListener = this.i;
        if (onItemClickListener == null || this.f9597b > this.f9596a) {
            LogUtil.d("AiDietRecordAdapter", "convert mOnItemClickListener ", onItemClickListener, " mDay ", Integer.valueOf(this.f9597b), " mCurrentDay ", Integer.valueOf(this.f9596a));
            return;
        }
        onItemClickListener.onItemClick(hvq.d(i));
    }

    private void d(RecyclerHolder recyclerHolder, List<hdc> list, float f, int i) {
        if (btw.c()) {
            d(recyclerHolder, list, f);
        } else {
            d(recyclerHolder, f, i);
        }
    }

    private void d(RecyclerHolder recyclerHolder, float f, int i) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.heat);
        HealthTextView healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.heatRefer);
        if (healthTextView == null || healthTextView2 == null) {
            ReleaseLogUtil.d("R_AiDietRecordAdapter", "setHeat textView is null");
            return;
        }
        int[] iArrB = ezn.b(ezn.b(this.f), this.f.d().e(), i, c(this.f.d().j()), ezn.c());
        if (iArrB.length == 0) {
            ReleaseLogUtil.d("R_AiDietRecordAdapter", "setHeat range is empty");
            healthTextView.setVisibility(8);
            healthTextView2.setVisibility(8);
            return;
        }
        healthTextView2.setVisibility(0);
        healthTextView.setVisibility(0);
        double d = f;
        String strE = qre.e(R.plurals.IDS_kcalories_unit, UnitUtil.b(d, Locale.getDefault()), UnitUtil.e(d, 1, 0));
        SpannableString spannableString = new SpannableString(strE);
        spannableString.setSpan(new TextAppearanceSpan(this.f9598c, R.style.list_text_title_primary), 0, strE.length(), 17);
        spannableString.setSpan(new qli(qrr.e()), 0, strE.length(), 17);
        spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, strE.length(), 17);
        healthTextView.setText(spannableString);
        healthTextView2.setText(qre.a(R.string.IDS_record_recommend_calories, UnitUtil.e(iArrB[0], 1, 0), qre.e(R.plurals.IDS_kcalories_unit, UnitUtil.b(iArrB[1], Locale.getDefault()), UnitUtil.e(iArrB[1], 1, 0))));
    }

    private void d(RecyclerHolder recyclerHolder, List<hdc> list, float f) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.heat);
        if (healthTextView == null) {
            ReleaseLogUtil.d("R_AiDietRecordAdapter", "setHeat textView is null");
            return;
        }
        double dA = a(list);
        String strA = qre.a(R.string.IDS_current_total_time, UnitUtil.e(f, 1, 0), qre.e(R.plurals.sug_chart_kcals, UnitUtil.e(dA), UnitUtil.e(dA, 1, 0)));
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_AiDietRecordAdapter", "setHeat source ", strA, " kcal ", Float.valueOf(f), " list ", list);
            healthTextView.setVisibility(8);
            return;
        }
        healthTextView.setVisibility(0);
        String[] strArrSplit = strA.split("/");
        if (njy.e(strArrSplit, 0)) {
            ReleaseLogUtil.d("R_AiDietRecordAdapter", "setHeat array ", strArrSplit, " source ", strA, " kcal ", Float.valueOf(f), " list ", list);
            healthTextView.setText(strA);
            return;
        }
        String str = strArrSplit[0];
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_AiDietRecordAdapter", "setHeat resultHeat ", str, " array ", strArrSplit, " source ", strA, " kcal ", Float.valueOf(f), " list ", list);
            healthTextView.setText(strA);
            return;
        }
        int length = str.length();
        if (length >= strA.length()) {
            ReleaseLogUtil.d("R_AiDietRecordAdapter", "setHeat resultLength ", Integer.valueOf(length), " resultHeat ", str, " array ", strArrSplit, " source ", strA, " kcal ", Float.valueOf(f), " list ", list);
            healthTextView.setText(strA);
            return;
        }
        SpannableString spannableString = new SpannableString(strA);
        spannableString.setSpan(new TextAppearanceSpan(this.f9598c, R.style.list_text_title_primary), 0, length, 17);
        spannableString.setSpan(new qli(qrr.e()), 0, length, 17);
        spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, length, 17);
        healthTextView.setText(spannableString);
    }

    private float c(int i) {
        vgo vgoVar = this.f;
        if (vgoVar == null) {
            LogUtil.a("AiDietRecordAdapter", "getKcal mRecord is null mealType ", Integer.valueOf(i));
            return 0.0f;
        }
        if (!this.d) {
            LogUtil.d("AiDietRecordAdapter", "getKcal mIsSameDay false");
            return 0.0f;
        }
        List<vgw> listA = vgoVar.a();
        if (njy.e(listA)) {
            LogUtil.d("AiDietRecordAdapter", "getKcal list ", listA);
            return 0.0f;
        }
        for (vgw vgwVar : listA) {
            if (vgwVar != null && vgwVar.i() == i) {
                return vgwVar.e();
            }
        }
        return 0.0f;
    }

    private float a(List<hdc> list) {
        float fH = 0.0f;
        if (njy.e(list)) {
            LogUtil.d("AiDietRecordAdapter", "getHeat list ", list);
            return 0.0f;
        }
        for (hdc hdcVar : list) {
            if (hdcVar != null) {
                fH += hdcVar.h();
            }
        }
        return fH;
    }

    public void d(OnItemClickListener onItemClickListener) {
        this.i = onItemClickListener;
    }
}
