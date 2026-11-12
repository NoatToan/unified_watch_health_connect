package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.health.suggestion.ui.view.FilterFlowLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.AchieveDataApi;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.timepicker.HealthHourSecondNumberPicker;
import com.huawei.ui.commonui.togglebutton.HealthToggleButton;
import defpackage.btt;
import defpackage.dek;
import defpackage.gzx;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.osc;
import defpackage.ose;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class SetBestRecordFragment extends BaseFragment implements View.OnClickListener {
    private osc aa;
    private ImageView ab;
    private HealthProgressBar ad;
    private HealthButton d;
    private FilterFlowLayout e;
    private Context f;
    private RelativeLayout k;
    private int l;
    private HealthColumnLinearLayout m;
    private HealthColumnLinearLayout o;
    private HealthColumnRelativeLayout r;
    private HealthColumnLinearLayout s;
    private HealthColumnRelativeLayout t;
    private RunPlanCreateActivity.OnNextPageListener u;
    private int v;
    private int w;
    private HealthHourSecondNumberPicker x;
    private HealthTextView y;
    private String z;
    private int q = 18000;
    private int p = 180;
    private int h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Attribute> f9901b = new ArrayList();
    private List<Attribute> i = new ArrayList();
    private int n = 0;
    private List<View> g = new ArrayList();
    private List<View> j = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9902c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FilterFlowLayout.OnCheckChangeListener f9900a = new FilterFlowLayout.OnCheckChangeListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.SetBestRecordFragment.5
        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onChecked(int i) {
            int i2 = i - SetBestRecordFragment.this.l;
            if (i2 <= SetBestRecordFragment.this.e.getChildCount() - 1) {
                if (i2 != SetBestRecordFragment.this.n) {
                    SetBestRecordFragment.this.v = i;
                    if (SetBestRecordFragment.this.e.getChildAt(i2) instanceof ToggleButton) {
                        ToggleButton toggleButton = (ToggleButton) SetBestRecordFragment.this.e.getChildAt(i2);
                        SetBestRecordFragment.this.z = toggleButton.getText().toString();
                        ibe.d(SetBestRecordFragment.this.f, toggleButton, 0, 0);
                        if (!(SetBestRecordFragment.this.e.getChildAt(SetBestRecordFragment.this.n) instanceof ToggleButton)) {
                            LogUtil.e("Suggestion_SetDistanceFragment", "lastBtn ", Integer.valueOf(SetBestRecordFragment.this.n), " is not ToggleButton.");
                            return;
                        }
                        ibe.c(SetBestRecordFragment.this.f, (ToggleButton) SetBestRecordFragment.this.e.getChildAt(SetBestRecordFragment.this.n), 0, 0);
                        SetBestRecordFragment.this.n = i2;
                        SetBestRecordFragment.this.d(i);
                        SetBestRecordFragment.this.k();
                        return;
                    }
                    LogUtil.e("Suggestion_SetDistanceFragment", "curBtn ", Integer.valueOf(i2), " is not ToggleButton.");
                    return;
                }
                LogUtil.a("Suggestion_SetDistanceFragment", "button is selected.");
                return;
            }
            LogUtil.e("Suggestion_SetDistanceFragment", "onChecked curBtnIndex > childCount.");
        }

        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onCancelCheck(int i) {
            onChecked(i);
        }
    };

    public static SetBestRecordFragment e(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("planType", i);
        SetBestRecordFragment setBestRecordFragment = new SetBestRecordFragment();
        setBestRecordFragment.setArguments(bundle);
        return setBestRecordFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.w = arguments.getInt("planType");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_set_best_record, viewGroup, false);
        b(viewInflate);
        btt.d().c(new Runnable() { // from class: ial
            @Override // java.lang.Runnable
            public final void run() {
                this.f37406b.d();
            }
        });
        return viewInflate;
    }

    public /* synthetic */ void d() {
        AchieveDataApi achieveDataApi = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
        if (achieveDataApi == null) {
            LogUtil.e("Suggestion_SetDistanceFragment", "onCreateView achieveDataApi is null.");
            return;
        }
        osc singleDayData = achieveDataApi.getSingleDayData();
        if (singleDayData == null) {
            LogUtil.j("Suggestion_SetDistanceFragment", "getSingleDayData dayData is null.");
            return;
        }
        this.aa = singleDayData;
        d(this.n + this.l);
        k();
    }

    private void b(View view) {
        if (view == null) {
            LogUtil.e("Suggestion_SetDistanceFragment", "initView view is null.");
            return;
        }
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.r = healthColumnRelativeLayout;
        this.k = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        this.ad = (HealthProgressBar) this.r.findViewById(R.id.tips_image_progress);
        this.ab = (ImageView) this.r.findViewById(R.id.tips_image);
        HealthTextView healthTextView = (HealthTextView) this.r.findViewById(R.id.tips_question);
        healthTextView.setText(R.string.IDS_best_record);
        this.g.add(healthTextView);
        this.s = (HealthColumnLinearLayout) this.r.findViewById(R.id.layout_summary);
        this.y = (HealthTextView) this.r.findViewById(R.id.tips_summary);
        HealthTextView healthTextView2 = (HealthTextView) this.r.findViewById(R.id.tips_comments);
        healthTextView2.setText(R.string.IDS_best_record_description);
        healthTextView2.setVisibility(0);
        this.g.add(healthTextView2);
        this.j.add(healthTextView2);
        HealthColumnLinearLayout healthColumnLinearLayout = (HealthColumnLinearLayout) view.findViewById(R.id.layout_best_record);
        this.m = healthColumnLinearLayout;
        this.g.add(healthColumnLinearLayout);
        this.j.add(this.m);
        ((HealthSubHeader) view.findViewById(R.id.set_best_record_distance)).setSubHeaderBackgroundColor(ContextCompat.getColor(this.f, R.color.common_transparent));
        ((HealthSubHeader) view.findViewById(R.id.set_best_record_achievement)).setSubHeaderBackgroundColor(ContextCompat.getColor(this.f, R.color.common_transparent));
        j();
        this.e = (FilterFlowLayout) view.findViewById(R.id.btn_group_best_record);
        h();
        s();
        this.t = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_multi_num_picker);
        i();
        HealthColumnLinearLayout healthColumnLinearLayout2 = (HealthColumnLinearLayout) view.findViewById(R.id.sug_layout_btn);
        this.o = healthColumnLinearLayout2;
        this.g.add(healthColumnLinearLayout2);
        this.j.add(this.o);
        BaseActivity.setViewSafeRegion(true, healthTextView2, this.m, this.o);
        HealthButton healthButton = (HealthButton) this.o.findViewById(R.id.btn_ok);
        this.d = healthButton;
        healthButton.setOnClickListener(this);
        ((HealthButton) this.o.findViewById(R.id.btn_forget)).setOnClickListener(this);
        this.f9902c = true;
        a(view);
        ibe.a(true, this.g);
        ibl.a(this.f, 30, this.ad, this.ab);
    }

    private void a(final View view) {
        if (view == null) {
            LogUtil.e("Suggestion_SetDistanceFragment", "setSpringViewHeight view is null.");
        } else {
            final View viewFindViewById = view.findViewById(R.id.spring_view);
            viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: iam
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.d.b(view, viewFindViewById);
                }
            });
        }
    }

    public /* synthetic */ void b(View view, View view2) {
        if (this.f9902c) {
            this.f9902c = false;
            int iMax = Math.max(view.getHeight() - (this.m.getHeight() + this.o.getHeight()), this.r.getHeight());
            view2.setLayoutParams(new RelativeLayout.LayoutParams(-1, iMax));
            if (iMax > 0) {
                ((HealthScrollView) view.findViewById(R.id.best_record_scroll_view)).setOverScrollable(false);
            }
        }
    }

    private void h() {
        this.e.setPadding((int) getResources().getDimension(R.dimen.cardMarginStart), (int) getResources().getDimension(R.dimen.elementsMarginHorizontalL), (int) (getResources().getDimension(R.dimen.cardMarginEnd) - getResources().getDimension(R.dimen.cardMarginMiddle)), (int) getResources().getDimension(R.dimen.elementsMarginHorizontalL));
        this.e.setToggleButtonSourceId(R.layout.item_btn_create_plan);
        this.e.d(this.f, this.i);
        this.e.setOnCheckedChangeListener(this.f9900a);
    }

    private void i() {
        d(this.n + this.l);
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        FragmentActivity activity = getActivity();
        if (activity == null || !isAdded()) {
            LogUtil.e("Suggestion_SetDistanceFragment", "resetMultiNumberPicker activity is null.");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.SetBestRecordFragment.4
                @Override // java.lang.Runnable
                public void run() {
                    SetBestRecordFragment.this.x = new HealthHourSecondNumberPicker(SetBestRecordFragment.this.f, SetBestRecordFragment.this.p, SetBestRecordFragment.this.q, SetBestRecordFragment.this.h);
                    SetBestRecordFragment.this.t.removeAllViews();
                    SetBestRecordFragment.this.t.addView(SetBestRecordFragment.this.x);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        switch (i) {
            case 1:
                LogUtil.a("Suggestion_SetDistanceFragment", "button is 1km.");
                n();
                break;
            case 2:
                LogUtil.a("Suggestion_SetDistanceFragment", "button is 3km.");
                t();
                break;
            case 3:
                LogUtil.a("Suggestion_SetDistanceFragment", "button is 5km.");
                l();
                break;
            case 4:
                LogUtil.a("Suggestion_SetDistanceFragment", "button is 10km.");
                p();
                break;
            case 5:
                LogUtil.a("Suggestion_SetDistanceFragment", "button is half marathon.");
                o();
                break;
            case 6:
                LogUtil.a("Suggestion_SetDistanceFragment", "button is marathon.");
                m();
                break;
        }
    }

    private void s() {
        String str;
        int childCount = this.e.getChildCount();
        if (childCount == 0) {
            LogUtil.e("Suggestion_SetDistanceFragment", "initSelectedBtn mBtnFlowLayout item is null.");
            return;
        }
        if (this.e.getChildAt(0) instanceof HealthToggleButton) {
            HealthToggleButton healthToggleButton = (HealthToggleButton) this.e.getChildAt(0);
            if (healthToggleButton.getTag() instanceof String) {
                this.l = CommonUtils.j((String) healthToggleButton.getTag());
                if (this.w == 12) {
                    if (!(this.e.getChildAt(2) instanceof HealthToggleButton)) {
                        return;
                    }
                    HealthToggleButton healthToggleButton2 = (HealthToggleButton) this.e.getChildAt(2);
                    if (!(healthToggleButton2.getTag() instanceof String)) {
                        return;
                    } else {
                        str = (String) healthToggleButton2.getTag();
                    }
                } else {
                    int i = childCount - 2;
                    if (!(this.e.getChildAt(i) instanceof HealthToggleButton)) {
                        return;
                    }
                    HealthToggleButton healthToggleButton3 = (HealthToggleButton) this.e.getChildAt(i);
                    if (!(healthToggleButton3.getTag() instanceof String)) {
                        return;
                    } else {
                        str = (String) healthToggleButton3.getTag();
                    }
                }
                int iJ = CommonUtils.j(str);
                int i2 = iJ - this.l;
                this.n = i2;
                this.v = iJ;
                if (i2 > childCount - 1 || !(this.e.getChildAt(i2) instanceof ToggleButton)) {
                    LogUtil.e("Suggestion_SetDistanceFragment", "setSelectedBtnStyle mBtnFlowLayout.getChildAt = ", Integer.valueOf(this.n), " is not ToggleButton.");
                    return;
                }
                ToggleButton toggleButton = (ToggleButton) this.e.getChildAt(this.n);
                ibe.d(this.f, toggleButton, 0, 0);
                this.z = toggleButton.getText().toString();
            }
        }
    }

    private void m() {
        ose oseVarB;
        a(36000, 7299);
        osc oscVar = this.aa;
        int iB = 16200;
        if (oscVar != null && (oseVarB = oscVar.b()) != null) {
            iB = b((int) oseVarB.b(), 16200);
        }
        this.h = iB;
    }

    private void o() {
        ose oseVarE;
        a(18000, 3452);
        osc oscVar = this.aa;
        int iB = 8400;
        if (oscVar != null && (oseVarE = oscVar.e()) != null) {
            iB = b((int) oseVarE.b(), 8400);
        }
        this.h = iB;
    }

    private void p() {
        ose oseVarD;
        a(9000, 1584);
        osc oscVar = this.aa;
        int iB = 4200;
        if (oscVar != null && (oseVarD = oscVar.d()) != null) {
            iB = b((int) oseVarD.b(), 4200);
        }
        this.h = iB;
    }

    private void l() {
        ose oseVarC;
        a(4500, 771);
        osc oscVar = this.aa;
        int iB = 2100;
        if (oscVar != null && (oseVarC = oscVar.c()) != null) {
            iB = b((int) oseVarC.b(), 2100);
        }
        this.h = iB;
    }

    private void t() {
        ose oseVarA;
        a(2700, 440);
        osc oscVar = this.aa;
        int iB = 1200;
        if (oscVar != null && (oseVarA = oscVar.a()) != null) {
            iB = b((int) oseVarA.b(), 1200);
        }
        this.h = iB;
    }

    private void n() {
        a(900, 131);
        this.h = 420;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_SetDistanceFragment", "isHidden fragment.");
        } else {
            this.k.setVisibility(0);
            ibe.a(true, this.g);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.r()) {
            LogUtil.j("Suggestion_SetDistanceFragment", "click too fast.");
        } else if (view == this.d) {
            q();
            d(true);
        } else {
            d(false);
        }
    }

    private void q() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: iai
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        });
    }

    public /* synthetic */ void a() {
        int iF = f();
        dek.b(this.f, g(), iF, new Date().getTime());
        double dE = dek.e(b(), iF);
        dek.b(new int[]{dek.b(dE), dek.a(dE), dek.e(dE), dek.d(dE), dek.i(dE), dek.c(dE)});
    }

    private int f() {
        double dC;
        double dC2;
        double d;
        int iC = c();
        int i = this.v;
        if (i == 5 || i == 6) {
            return iC;
        }
        if (!UnitUtil.f()) {
            return this.v == 1 ? (int) (((double) iC) * Math.pow(3.0d, 1.06d)) : iC;
        }
        int i2 = this.v;
        if (i2 == 1) {
            dC = UnitUtil.c(1.0d, 3);
        } else if (i2 != 2) {
            if (i2 == 3) {
                dC2 = UnitUtil.c(2.0d, 3);
                d = 5.0d;
            } else {
                dC2 = UnitUtil.c(2.0d, 3);
                d = 10.0d;
            }
            dC = dC2 / d;
        } else {
            dC = UnitUtil.c(2.0d, 3) / 3.0d;
        }
        return (int) (((double) iC) * Math.pow(dC, 1.06d));
    }

    private int g() {
        int i = this.v;
        if (i == 5) {
            return 5;
        }
        if (i == 6) {
            return 6;
        }
        if (UnitUtil.f()) {
            return this.v == 1 ? 3 : 4;
        }
        int i2 = this.v;
        if (i2 != 3) {
            return i2 != 4 ? 0 : 2;
        }
        return 1;
    }

    private double b() {
        double dC;
        int i = this.v;
        if (i == 5) {
            return 21097.5d;
        }
        if (i == 6) {
            return 42195.0d;
        }
        if (UnitUtil.f()) {
            if (this.v == 1) {
                dC = UnitUtil.c(1.0d, 3);
            } else {
                dC = UnitUtil.c(2.0d, 3);
            }
            return dC * 1000.0d;
        }
        int i2 = this.v;
        if (i2 != 3) {
            return i2 != 4 ? 3000.0d : 10000.0d;
        }
        return 5000.0d;
    }

    private void d(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.j("Suggestion_SetDistanceFragment", "setNextPage activity is null.");
            return;
        }
        RunPlanCreateActivity.OnNextPageListener onNextPageListener = this.u;
        if (onNextPageListener == null) {
            activity.finish();
            return;
        }
        onNextPageListener.backLock();
        ibe.a(false, this.j);
        e(z);
        ibe.a(this.k, this.s, this.u, z);
    }

    private void j() {
        this.f9901b.add(new Attribute(1, gzx.c(this.f, R.string.IDS_hw_show_sport_kms_string, b(1))));
        this.f9901b.add(new Attribute(2, gzx.c(this.f, R.string.IDS_hw_show_sport_kms_string, b(3))));
        this.f9901b.add(new Attribute(3, gzx.c(this.f, R.string.IDS_hw_show_sport_kms_string, b(5))));
        this.f9901b.add(new Attribute(4, gzx.c(this.f, R.string.IDS_hw_show_sport_kms_string, b(10))));
        this.f9901b.add(new Attribute(5, getString(R.string.IDS_start_track_show_distance_half_marathon)));
        this.f9901b.add(new Attribute(6, getString(R.string.IDS_start_track_show_distance_marathon)));
        int i = this.w;
        if (i != 11) {
            if (i != 12) {
                switch (i) {
                    case 3:
                        d(0, 3);
                        break;
                    case 4:
                        d(1, 4);
                        break;
                    case 5:
                        d(2, 5);
                        break;
                    case 6:
                        d(3, 6);
                        break;
                }
                return;
            }
            this.i.addAll(this.f9901b);
            return;
        }
        d(0, 2);
    }

    private String b(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    private void d(int i, int i2) {
        while (i < i2) {
            this.i.add(this.f9901b.get(i));
            i++;
        }
    }

    public void a(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.u = onNextPageListener;
    }

    private void a(int i, int i2) {
        this.q = i - 1;
        this.p = i2;
    }

    private int b(int i, int i2) {
        return (i >= this.q || i <= this.p) ? i2 : i;
    }

    private void e(boolean z) {
        if (z) {
            this.y.setText(gzx.c(this.f, R.string.IDS_sug_min_sec, this.z, UnitUtil.b(c())));
            return;
        }
        this.y.setText(getString(R.string.IDS_do_not_remember));
    }

    public int c() {
        return this.x.getSelectedTime();
    }

    public int e() {
        return this.v;
    }
}
