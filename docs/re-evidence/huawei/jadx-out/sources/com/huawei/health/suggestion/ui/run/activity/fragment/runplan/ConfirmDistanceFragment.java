package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.health.suggestion.ui.view.FilterFlowLayout;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.share.HiHealthError;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.togglebutton.HealthToggleButton;
import defpackage.btt;
import defpackage.bug;
import defpackage.gzx;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.njy;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class ConfirmDistanceFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9887a;
    private FilterFlowLayout d;
    private HealthTextView e;
    private HealthColumnLinearLayout g;
    private RelativeLayout i;
    private int l;
    private RunPlanCreateActivity.OnNextPageListener m;
    private HealthTextView n;
    private ImageView o;
    private HealthProgressBar q;
    private int k = 0;
    private List<View> j = new ArrayList();
    private List<View> h = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Attribute> f9888b = new ArrayList();
    private int f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FilterFlowLayout.OnCheckChangeListener f9889c = new FilterFlowLayout.OnCheckChangeListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.ConfirmDistanceFragment.5
        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onChecked(int i) {
            FragmentActivity activity = ConfirmDistanceFragment.this.getActivity();
            if (activity != null) {
                if (i == 0) {
                    ConfirmDistanceFragment.this.k = 25;
                } else if (i == 1) {
                    ConfirmDistanceFragment.this.k = 75;
                } else if (i == 2) {
                    ConfirmDistanceFragment.this.k = 125;
                } else if (i == 3) {
                    ConfirmDistanceFragment.this.k = 175;
                } else if (i == 4) {
                    ConfirmDistanceFragment.this.k = 250;
                } else {
                    ConfirmDistanceFragment.this.k = 350;
                }
                if (ConfirmDistanceFragment.this.d.getChildAt(i) instanceof HealthToggleButton) {
                    HealthToggleButton healthToggleButton = (HealthToggleButton) ConfirmDistanceFragment.this.d.getChildAt(i);
                    ibe.d(ConfirmDistanceFragment.this.f9887a, healthToggleButton, R.drawable.item_button_selected_bg, 0);
                    if (ConfirmDistanceFragment.this.f != -1 && ConfirmDistanceFragment.this.f != i && (ConfirmDistanceFragment.this.d.getChildAt(ConfirmDistanceFragment.this.f) instanceof HealthToggleButton)) {
                        ibe.c(ConfirmDistanceFragment.this.f9887a, (HealthToggleButton) ConfirmDistanceFragment.this.d.getChildAt(ConfirmDistanceFragment.this.f), R.drawable.item_button_unselect_bg, R.color.textColorSecondary);
                    }
                    ConfirmDistanceFragment.this.f = i;
                    ConfirmDistanceFragment.this.n.setText(gzx.c(ConfirmDistanceFragment.this.f9887a, ConfirmDistanceFragment.this.l, healthToggleButton.getText().toString()));
                    if (ConfirmDistanceFragment.this.m != null) {
                        ConfirmDistanceFragment.this.m.backLock();
                        ibe.a(false, ConfirmDistanceFragment.this.h);
                        ibe.a(ConfirmDistanceFragment.this.i, ConfirmDistanceFragment.this.g, ConfirmDistanceFragment.this.m, true);
                        return;
                    }
                    activity.finish();
                    return;
                }
                LogUtil.e("Suggestion_ConfirmDistanceFragment", "onChecked mRunDayFlowLayout curButtonIndex is invalid.");
                return;
            }
            LogUtil.j("Suggestion_ConfirmDistanceFragment", "mBtnGroupListener onChecked activity is null.");
        }

        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onCancelCheck(int i) {
            onChecked(i);
        }
    };

    public static ConfirmDistanceFragment c() {
        return new ConfirmDistanceFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9887a = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_confirm_distance, viewGroup, false);
        e(viewInflate);
        return viewInflate;
    }

    private void e(View view) {
        if (view == null) {
            return;
        }
        this.e = (HealthTextView) view.findViewById(R.id.tips_comments);
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.i = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        this.q = (HealthProgressBar) healthColumnRelativeLayout.findViewById(R.id.tips_image_progress);
        this.o = (ImageView) healthColumnRelativeLayout.findViewById(R.id.tips_image);
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_question);
        healthTextView.setText(R.string.IDS_run_distance_in_last_month);
        this.j.add(healthTextView);
        this.n = (HealthTextView) view.findViewById(R.id.tips_summary);
        a();
        this.g = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_summary);
        View viewFindViewById = view.findViewById(R.id.body_view);
        BaseActivity.setViewSafeRegion(true, viewFindViewById);
        this.j.add(viewFindViewById);
        this.h.add(viewFindViewById);
        a(view);
        this.d = (FilterFlowLayout) view.findViewById(R.id.btn_group_confirm_distance);
        b();
        ibe.b(view, healthColumnRelativeLayout, viewFindViewById, null, getResources().getDimensionPixelSize(R.dimen.health_common_12dp));
        ibe.a(true, this.j);
        ibl.a(this.f9887a, 15, this.q, this.o);
    }

    private void a(View view) {
        String[] strArr;
        if (view == null) {
            return;
        }
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.tv_distance);
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f9887a, R.color.common_transparent));
        if (UnitUtil.f()) {
            strArr = new String[]{gzx.c(this.f9887a, R.string.IDS_less_than, d(30)), gzx.c(this.f9887a, R.string.sug_his_time_formart, d(31), d(60)), gzx.c(this.f9887a, R.string.sug_his_time_formart, d(61), d(90)), gzx.c(this.f9887a, R.string.sug_his_time_formart, d(91), d(120)), gzx.c(this.f9887a, R.string.sug_his_time_formart, d(121), d(180)), gzx.c(this.f9887a, R.string.IDS_more_than, d(180))};
            healthSubHeader.setHeadTitleText(getString(R.string.IDS_hwh_motiontrack_sport_data_mi));
            this.l = R.string.IDS_hw_show_sport_kms_string_en;
        } else {
            strArr = new String[]{gzx.c(this.f9887a, R.string.IDS_less_than, d(50)), gzx.c(this.f9887a, R.string.sug_his_time_formart, d(51), d(100)), gzx.c(this.f9887a, R.string.sug_his_time_formart, d(101), d(150)), gzx.c(this.f9887a, R.string.sug_his_time_formart, d(HiHealthError.ERR_WRONG_DEVICE), d(200)), gzx.c(this.f9887a, R.string.sug_his_time_formart, d(201), d(300)), gzx.c(this.f9887a, R.string.IDS_more_than, d(300))};
            healthSubHeader.setHeadTitleText(getString(R.string.IDS_hwh_motiontrack_sport_data_km));
            this.l = R.string.IDS_hw_show_sport_kms_string;
        }
        for (int i = 0; i < strArr.length; i++) {
            this.f9888b.add(new Attribute(i, strArr[i]));
        }
    }

    private void b() {
        this.d.setPadding((int) getResources().getDimension(R.dimen.cardMarginStart), (int) getResources().getDimension(R.dimen.elementsMarginHorizontalL), (int) (getResources().getDimension(R.dimen.cardMarginEnd) - getResources().getDimension(R.dimen.cardMarginMiddle)), (int) getResources().getDimension(R.dimen.elementsMarginHorizontalL));
        this.d.setToggleButtonSourceId(R.layout.item_confirm_distance_button);
        this.d.d(this.f9887a, this.f9888b);
        this.d.setOnCheckedChangeListener(this.f9889c);
    }

    private void a() {
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.ConfirmDistanceFragment.2
            @Override // java.lang.Runnable
            public void run() {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
                calendar.set(14, 0);
                long timeInMillis = calendar.getTimeInMillis();
                calendar.set(5, calendar.get(5) - 30);
                bug.c().b(calendar.getTimeInMillis(), timeInMillis - 1, new int[]{2}, new String[]{"Track_Run_Distance_Sum"}, new d(ConfirmDistanceFragment.this));
            }
        });
    }

    static class d implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<ConfirmDistanceFragment> f9892b;

        d(ConfirmDistanceFragment confirmDistanceFragment) {
            this.f9892b = new WeakReference<>(confirmDistanceFragment);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ConfirmDistanceFragment confirmDistanceFragment = this.f9892b.get();
            if (confirmDistanceFragment == null) {
                LogUtil.e("Suggestion_ConfirmDistanceFragment", "LastThirtyDaysRunDistanceCallback onResult fragment is null.");
                return;
            }
            if (njy.e(list, 0)) {
                LogUtil.e("Suggestion_ConfirmDistanceFragment", "onResult datas is null. errCode = ", Integer.valueOf(i), ", anchor= ", Integer.valueOf(i2));
                confirmDistanceFragment.e(0.0f);
                return;
            }
            HiHealthData hiHealthData = list.get(0);
            if (hiHealthData != null) {
                confirmDistanceFragment.e(hiHealthData.getFloat("Track_Run_Distance_Sum"));
            } else {
                LogUtil.e("Suggestion_ConfirmDistanceFragment", "onResult hiHealthData is null.");
                confirmDistanceFragment.e(0.0f);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("Suggestion_ConfirmDistanceFragment", "onResultIntent:", Integer.valueOf(i), "errorCode:", Integer.valueOf(i2), "anchor:", Integer.valueOf(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(float f) {
        String strD;
        FragmentActivity activity = getActivity();
        if (activity == null || !isAdded()) {
            LogUtil.e("Suggestion_ConfirmDistanceFragment", "setComments activity is null.");
            return;
        }
        if (UnitUtil.f()) {
            int iE = (int) UnitUtil.e(f / 1000.0f, 3);
            strD = gzx.d(R.plurals.sug_mile, iE, UnitUtil.e(iE, 1, 0));
        } else {
            int i = (int) (f / 1000.0f);
            strD = gzx.d(R.plurals.sug_km, i, UnitUtil.e(i, 1, 0));
        }
        String strC = gzx.c(this.f9887a, R.string.IDS_tip_last_month_run_distance, strD);
        int iE2 = e(strC);
        int length = strC.length() - e(new StringBuffer(strC).reverse().toString());
        final SpannableString spannableString = new SpannableString(strC);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f9887a, R.color.textColorSecondary)), iE2, length, 34);
        spannableString.setSpan(new TypefaceSpan(getString(R.string.textFontFamilyMedium)), iE2, length, 34);
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.textSizeHeadline8)), iE2, length, 34);
        activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.ConfirmDistanceFragment.1
            @Override // java.lang.Runnable
            public void run() {
                ConfirmDistanceFragment.this.e.setText(spannableString);
                ConfirmDistanceFragment.this.e.setVisibility(0);
            }
        });
    }

    private int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Matcher matcher = Pattern.compile("\\d").matcher(str);
        if (matcher.find()) {
            return matcher.start();
        }
        return -1;
    }

    private String d(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_ConfirmDistanceFragment", "isHidden fragment.");
        } else {
            this.i.setVisibility(0);
            ibe.a(true, this.j);
        }
    }

    public void d(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.m = onNextPageListener;
    }

    public int d() {
        return this.k;
    }
}
