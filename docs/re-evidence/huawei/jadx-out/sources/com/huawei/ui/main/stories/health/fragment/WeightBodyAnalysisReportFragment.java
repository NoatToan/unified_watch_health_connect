package com.huawei.ui.main.stories.health.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.BodyAnalysisReportViewAdapter;
import com.huawei.ui.main.stories.health.interactors.healthdata.BodyReportRecycleItem;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.gxt;
import defpackage.lsv;
import defpackage.qpx;
import defpackage.vcp;
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class WeightBodyAnalysisReportFragment extends BaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BodyReportRecycleItem.BodyReportType[] f27914c = {BodyReportRecycleItem.BodyReportType.BODY_ANALYSIS, BodyReportRecycleItem.BodyReportType.PEER_COMPARISON, BodyReportRecycleItem.BodyReportType.MUSCLE_ANALYSIS, BodyReportRecycleItem.BodyReportType.FAT_ANALYSIS, BodyReportRecycleItem.BodyReportType.PHYSIQUE_PREDICTION, BodyReportRecycleItem.BodyReportType.OTHER_INDICATORS};
    private static final BodyReportRecycleItem.BodyReportType[] d = {BodyReportRecycleItem.BodyReportType.BODY_ANALYSIS, BodyReportRecycleItem.BodyReportType.MUSCLE_ANALYSIS, BodyReportRecycleItem.BodyReportType.FAT_ANALYSIS, BodyReportRecycleItem.BodyReportType.IMPORTANT_INDICATORS, BodyReportRecycleItem.BodyReportType.OTHER_INDICATORS};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f27916b;
    private Context e;
    private double f;
    private View g;
    private int h;
    private byte i;
    private dnb k = new dnb();
    private boolean j = false;

    public void d(Activity activity, boolean z) {
        if (activity == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "initViewInActivity Activity is null");
            return;
        }
        this.j = z;
        this.e = activity;
        this.g = LayoutInflater.from(activity).inflate(R.layout.fragment_body_analysis_report, (ViewGroup) null);
    }

    public void a(dnb dnbVar) {
        if (dnbVar == null || this.g == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "fillScrollViewDataByBean input parameters is null");
            return;
        }
        this.k = dnbVar;
        g();
        d();
        b();
        a();
        if (this.j) {
            return;
        }
        h();
    }

    private void h() {
        MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: uuz
            @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.b(i, (dnj) obj);
            }
        });
    }

    public /* synthetic */ void b(final int i, final dnj dnjVar) {
        Context context = this.e;
        if (!(context instanceof Activity)) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "mContext is null or mContext is not Activity");
        } else {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: uvb
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(dnjVar, i);
                }
            });
        }
    }

    public /* synthetic */ void d(dnj dnjVar, int i) {
        if (dnjVar != null && i == 0) {
            b(dnjVar);
        } else {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "WeightBodyAnalysisReportFragment initCurrentUser getCurrentUser fail");
        }
    }

    private void b(dnj dnjVar) {
        if (this.h <= 0 && dnjVar != null) {
            this.h = dnjVar.e();
        }
        e();
    }

    private void g() {
        dnb dnbVar = this.k;
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "initData WeightBean is null");
            return;
        }
        this.i = dnbVar.an();
        this.f27915a = this.k.c();
        this.h = this.k.r();
        this.f = this.k.av();
        this.f27916b = this.k.h();
    }

    private void d() {
        String string;
        View view = this.g;
        if (view == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "fillHeadView mShareView is null");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.body_report_head_name);
        if (this.j) {
            healthTextView.setVisibility(8);
        } else {
            dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
            String strH = currentUser == null ? null : currentUser.h();
            if (TextUtils.isEmpty(strH)) {
                healthTextView.setVisibility(8);
            } else {
                healthTextView.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_weight_report_head_name, strH));
            }
        }
        if (this.i == 0) {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_sns_girl);
        } else {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_sns_boy);
        }
        ((HealthTextView) this.g.findViewById(R.id.body_report_head_gender)).setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_weight_report_head_gendar, string));
        Resources resources = BaseApplication.getContext().getResources();
        int i = R.string.IDS_weight_report_head_age;
        Resources resources2 = BaseApplication.getContext().getResources();
        int i2 = R.plurals.IDS_hw_show_bodyage_unit_years_old;
        int i3 = this.f27915a;
        String string2 = resources.getString(i, resources2.getQuantityString(i2, i3, Integer.valueOf(i3)));
        if (LanguageUtil.bd(this.e)) {
            Resources resources3 = BaseApplication.getContext().getResources();
            int i4 = R.plurals.IDS_hw_show_bodyage_unit_years_old;
            int i5 = this.f27915a;
            string2 = resources3.getQuantityString(i4, i5, Integer.valueOf(i5));
        }
        ((HealthTextView) this.g.findViewById(R.id.body_report_head_age)).setText(string2);
        i();
        if (this.h > 0) {
            e();
        }
    }

    private void i() {
        if (this.g == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "fillHeadViewForHeightWeight mShareView is null");
            return;
        }
        int fractionDigitByType = this.k.getFractionDigitByType(0);
        LogUtil.a("HealthWeight_WeightBodyAnalysisReportFragment", "fillHeadViewForHeightWeight fractionDigitNew = ", Integer.valueOf(fractionDigitByType));
        ((HealthTextView) this.g.findViewById(R.id.body_report_head_weight)).setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_weight_report_head_weight, vei.b(UnitUtil.c(this.f), fractionDigitByType)));
    }

    private void e() {
        String string;
        if (UnitUtil.f()) {
            int[] iArrG = UnitUtil.g(((double) this.h) / 100.0d);
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_ft_string, UnitUtil.e(iArrG[0], 1, 0)) + " " + BaseApplication.getContext().getResources().getString(R.string.IDS_ins_string, UnitUtil.e(iArrG[1], 1, 0));
        } else {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(this.h, 1, 0));
        }
        ((HealthTextView) this.g.findViewById(R.id.body_report_head_height)).setText(BaseApplication.getContext().getResources().getString(R.string.IDS_weight_report_head_height, string));
    }

    private void b() {
        BodyReportRecycleItem.BodyReportType[] bodyReportTypeArr;
        if (this.g == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "fillAllItem mShareView is null");
            return;
        }
        if (Utils.o()) {
            bodyReportTypeArr = d;
        } else {
            bodyReportTypeArr = f27914c;
        }
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.g.findViewById(R.id.report_item_recycle_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.e, 2, 1, false) { // from class: com.huawei.ui.main.stories.health.fragment.WeightBodyAnalysisReportFragment.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        ArrayList arrayList = new ArrayList(10);
        for (BodyReportRecycleItem.BodyReportType bodyReportType : bodyReportTypeArr) {
            arrayList.add(new BodyReportRecycleItem(bodyReportType, this.k));
        }
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.huawei.ui.main.stories.health.fragment.WeightBodyAnalysisReportFragment.4
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                return (Utils.o() && i == 0) ? 2 : 1;
            }
        });
        healthRecycleView.setLayoutManager(gridLayoutManager);
        BodyAnalysisReportViewAdapter bodyAnalysisReportViewAdapter = new BodyAnalysisReportViewAdapter(this.e, arrayList);
        healthRecycleView.setAdapter(bodyAnalysisReportViewAdapter);
        healthRecycleView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.ui.main.stories.health.fragment.WeightBodyAnalysisReportFragment.3
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (rect == null) {
                    LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "fillAllItem getItemOffsets outRect is null");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                int iB = vdo.b(WeightBodyAnalysisReportFragment.this.e, 4.0f);
                rect.set(iB, iB, iB, iB);
            }
        });
        bodyAnalysisReportViewAdapter.notifyDataSetChanged();
    }

    private void a() {
        View view = this.g;
        if (view == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "fillBodyScoreAndOverallAnalysis mShareView is null");
            return;
        }
        ((HealthTextView) view.findViewById(R.id.body_show_weight_score)).setText(UnitUtil.e(this.f27916b, 1, 0));
        ((HealthTextView) this.g.findViewById(R.id.body_show_fit_score_analysis)).setText(vcp.a(this.k));
        LinearLayout linearLayout = (LinearLayout) this.g.findViewById(R.id.report_body_show_weight_score_layout);
        if (this.k.isVisible(31, Utils.o())) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void c() {
        Context context;
        if (this.g == null || (context = this.e) == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "shareWeightFragment has no parent Activity or view null");
            qpx.b(this.e, R.string.IDS_motiontrack_share_fail_tip);
            return;
        }
        this.g.measure(View.MeasureSpec.makeMeasureSpec((int) context.getResources().getDimension(R.dimen.report_a4_width), 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.e.getResources().getDimension(R.dimen.report_a4_height), Integer.MIN_VALUE));
        View view = this.g;
        view.layout(0, 0, view.getMeasuredWidth(), this.g.getMeasuredHeight());
        Bitmap bitmapE = lsv.e(this.g);
        if (bitmapE == null) {
            LogUtil.j("HealthWeight_WeightBodyAnalysisReportFragment", "shareWeightFragment screenCut is null");
            qpx.b(this.e, R.string.IDS_motiontrack_share_fail_tip);
        } else {
            gxt gxtVar = new gxt(7);
            gxtVar.d(bitmapE);
            CardConstants.a(gxtVar, this.e, AnalyticsValue.BI_TRACK_WEIGHT_DATA_SHARE_BUTTON_2100012);
        }
    }
}
