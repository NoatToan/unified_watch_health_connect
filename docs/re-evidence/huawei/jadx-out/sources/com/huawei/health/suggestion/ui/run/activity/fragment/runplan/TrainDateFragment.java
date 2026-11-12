package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.health.suggestion.ui.view.FilterFlowLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.togglebutton.HealthToggleButton;
import defpackage.gzx;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class TrainDateFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9919a;
    private HealthProgressBar ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f9921c;
    private HealthButton e;
    private HealthColumnLinearLayout f;
    private boolean[] g;
    private RelativeLayout h;
    private boolean[] j;
    private FilterFlowLayout k;
    private HealthSubHeader m;
    private RunPlanCreateActivity.OnNextPageListener n;
    private HealthCardView o;
    private FilterFlowLayout p;
    private List<Integer> q;
    private HealthTextView r;
    private HealthSubHeader s;
    private RelativeLayout u;
    private int v;
    private HealthTextView w;
    private int[] x;
    private ImageView y;
    private List<View> d = new ArrayList();
    private List<View> i = new ArrayList();
    private FilterFlowLayout.OnCheckChangeListener t = new FilterFlowLayout.OnCheckChangeListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TrainDateFragment.4
        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onChecked(int i) {
            int childCount = TrainDateFragment.this.p.getChildCount();
            if (i >= 0 && i <= TrainDateFragment.this.g.length - 1 && i <= childCount - 1) {
                boolean[] zArr = (boolean[]) TrainDateFragment.this.g.clone();
                TrainDateFragment.this.g[i] = !TrainDateFragment.this.g[i];
                TrainDateFragment trainDateFragment = TrainDateFragment.this;
                int iA = trainDateFragment.a(trainDateFragment.g);
                if (iA > 6 || iA < 2) {
                    TrainDateFragment.this.g = (boolean[]) zArr.clone();
                    qpx.e(TrainDateFragment.this.f9919a, gzx.c(TrainDateFragment.this.f9919a, R.string.IDS_run_day_out_of_bounds_tips, UnitUtil.e(2.0d, 1, 0), UnitUtil.e(6.0d, 1, 0)));
                }
                if (TrainDateFragment.this.p.getChildAt(i) instanceof HealthToggleButton) {
                    HealthToggleButton healthToggleButton = (HealthToggleButton) TrainDateFragment.this.p.getChildAt(i);
                    boolean z = TrainDateFragment.this.g[i];
                    if (z) {
                        ibe.d(TrainDateFragment.this.f9919a, healthToggleButton, R.drawable.sug_circular_btn_selected, 0);
                    } else {
                        ibe.c(TrainDateFragment.this.f9919a, healthToggleButton, R.drawable.sug_circular_btn_default, 0);
                    }
                    TrainDateFragment.this.e(healthToggleButton, i, z);
                    return;
                }
                LogUtil.e("Suggestion_TrainDateFragment", "onChecked mRunDayFlowLayout curButtonIndex is invalid.");
                return;
            }
            LogUtil.e("Suggestion_TrainDateFragment", "RunDay onChecked curButtonIndex is invalid.");
        }

        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onCancelCheck(int i) {
            onChecked(i);
        }
    };
    private FilterFlowLayout.OnCheckChangeListener l = new FilterFlowLayout.OnCheckChangeListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TrainDateFragment.3
        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onChecked(int i) {
            int childCount = TrainDateFragment.this.k.getChildCount();
            if (i >= 0 && i <= TrainDateFragment.this.j.length - 1 && i <= childCount - 1) {
                boolean[] zArr = (boolean[]) TrainDateFragment.this.j.clone();
                TrainDateFragment.this.j[i] = !TrainDateFragment.this.j[i];
                TrainDateFragment trainDateFragment = TrainDateFragment.this;
                int iA = trainDateFragment.a(trainDateFragment.j);
                if (iA > 5 || iA < 0) {
                    TrainDateFragment.this.j = (boolean[]) zArr.clone();
                    qpx.e(TrainDateFragment.this.f9919a, gzx.c(TrainDateFragment.this.f9919a, R.string.IDS_power_day_out_of_bounds_tips, UnitUtil.e(0.0d, 1, 0), UnitUtil.e(5.0d, 1, 0)));
                }
                if (TrainDateFragment.this.k.getChildAt(i) instanceof HealthToggleButton) {
                    HealthToggleButton healthToggleButton = (HealthToggleButton) TrainDateFragment.this.k.getChildAt(i);
                    boolean z = TrainDateFragment.this.j[i];
                    if (z) {
                        ibe.d(TrainDateFragment.this.f9919a, healthToggleButton, R.drawable.sug_circular_btn_selected, 0);
                    } else {
                        ibe.c(TrainDateFragment.this.f9919a, healthToggleButton, R.drawable.sug_circular_btn_default, 0);
                    }
                    TrainDateFragment.this.e(healthToggleButton, i, z);
                    return;
                }
                LogUtil.e("Suggestion_TrainDateFragment", "onChecked mRunDayFlowLayout curButtonIndex is invalid.");
                return;
            }
            LogUtil.e("Suggestion_TrainDateFragment", "PowerDay onChecked curButtonIndex is invalid.");
        }

        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onCancelCheck(int i) {
            onChecked(i);
        }
    };

    public static TrainDateFragment e(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        TrainDateFragment trainDateFragment = new TrainDateFragment();
        trainDateFragment.setArguments(bundle);
        return trainDateFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f9920b = arguments.getInt("type", 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9919a = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_train_date, viewGroup, false);
        b(viewInflate);
        return viewInflate;
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.h = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        this.ad = (HealthProgressBar) healthColumnRelativeLayout.findViewById(R.id.tips_image_progress);
        this.y = (ImageView) healthColumnRelativeLayout.findViewById(R.id.tips_image);
        RelativeLayout relativeLayout = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.tips_layout);
        this.u = relativeLayout;
        this.i.add(relativeLayout);
        this.i.add(this.y);
        this.i.add(this.ad);
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_question);
        healthTextView.setText(getString(R.string.IDS_sug_train_date));
        this.d.add(healthTextView);
        LogUtil.a("Suggestion_TrainDateFragment", "mEditTrainType:", Integer.valueOf(this.f9920b));
        this.f = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_summary);
        this.r = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_summary);
        this.w = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_summary_comments);
        healthColumnRelativeLayout.findViewById(R.id.tips_explain).setVisibility(0);
        HealthColumnLinearLayout healthColumnLinearLayout = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_comments);
        this.d.add(healthColumnLinearLayout);
        this.i.add(healthColumnLinearLayout);
        c(healthColumnRelativeLayout);
        HealthColumnLinearLayout healthColumnLinearLayout2 = (HealthColumnLinearLayout) view.findViewById(R.id.train_date_layout);
        d(view, healthColumnLinearLayout2);
        b();
        f();
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.layout_bottom_btn);
        this.e = (HealthButton) relativeLayout2.findViewById(R.id.sug_btn_next);
        if (this.f9920b == 1) {
            healthTextView.setText(R.string.IDS_sug_edit_train);
            this.e.setText(R.string.IDS_sug_sure_modification);
        }
        c();
        ibe.b(view, healthColumnRelativeLayout, healthColumnLinearLayout2, relativeLayout2, 0);
        this.d.add(relativeLayout2);
        this.i.add(relativeLayout2);
        BaseActivity.setViewSafeRegion(true, healthColumnLinearLayout, healthColumnLinearLayout2);
        ibe.a(true, this.d);
        ibl.a(this.f9919a, 100, this.ad, this.y);
    }

    private void d(View view, HealthColumnLinearLayout healthColumnLinearLayout) {
        this.d.add(healthColumnLinearLayout);
        this.i.add(healthColumnLinearLayout);
        this.s = (HealthSubHeader) view.findViewById(R.id.subHeader_run_day_tips);
        this.p = (FilterFlowLayout) view.findViewById(R.id.layout_btn_group_run_day);
        this.m = (HealthSubHeader) view.findViewById(R.id.subHeader_power_day_tips);
        this.o = (HealthCardView) view.findViewById(R.id.power_day_cardview);
        if (Utils.o()) {
            this.m.setVisibility(8);
            this.o.setVisibility(8);
        }
        this.k = (FilterFlowLayout) view.findViewById(R.id.layout_btn_group_power_day);
    }

    private void c(HealthColumnRelativeLayout healthColumnRelativeLayout) {
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_explain_one);
        healthTextView.setVisibility(0);
        healthTextView.setText(gzx.c(this.f9919a, R.string.IDS_sug_train_tips_one, 1));
        HealthTextView healthTextView2 = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_explain_two);
        healthTextView2.setVisibility(0);
        healthTextView2.setText(gzx.c(this.f9919a, R.string.IDS_sug_train_tips_two, 2));
    }

    private void b() {
        String[] strArr = {this.f9919a.getString(R.string.IDS_run_restday_monday), this.f9919a.getString(R.string.IDS_run_restday_thuesday), this.f9919a.getString(R.string.IDS_run_restday_wedesday), this.f9919a.getString(R.string.IDS_run_restday_thursday), this.f9919a.getString(R.string.IDS_run_restday_friday), this.f9919a.getString(R.string.IDS_run_restday_saturday), this.f9919a.getString(R.string.IDS_run_restday_sunday)};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            arrayList.add(new Attribute(i, strArr[i]));
        }
        this.g = new boolean[7];
        this.j = new boolean[7];
        int dimension = (int) getResources().getDimension(R.dimen.cardMarginStart);
        int dimension2 = (int) getResources().getDimension(R.dimen.elementsMarginVerticalL);
        int dimension3 = (int) (getResources().getDimension(R.dimen.cardMarginEnd) - getResources().getDimension(R.dimen.health_switch_button_text_padding));
        int dimension4 = (int) getResources().getDimension(R.dimen.elementsMarginVerticalL);
        this.p.setPadding(dimension, dimension2, dimension3, dimension4);
        this.p.setToggleButtonSourceId(R.layout.item_circular_btn);
        this.p.d(BaseApplication.b(), arrayList);
        this.p.setOnCheckedChangeListener(this.t);
        this.k.setPadding(dimension, dimension2, dimension3, dimension4);
        this.k.setToggleButtonSourceId(R.layout.item_circular_btn);
        this.k.d(BaseApplication.b(), arrayList);
        this.k.setOnCheckedChangeListener(this.l);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_TrainDateFragment", "isHidden fragment.");
        } else {
            this.h.setVisibility(0);
            ibe.a(true, this.d);
        }
    }

    private void c() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TrainDateFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FragmentActivity activity = TrainDateFragment.this.getActivity();
                if (activity != null && !qrs.c(500)) {
                    if (TrainDateFragment.this.n != null) {
                        TrainDateFragment.this.n.backLock();
                        ibe.a(false, TrainDateFragment.this.i);
                        TrainDateFragment.this.g();
                        ibe.a(TrainDateFragment.this.h, TrainDateFragment.this.f, TrainDateFragment.this.n, true);
                        return;
                    }
                    activity.finish();
                    return;
                }
                LogUtil.j("Suggestion_TrainDateFragment", "mBtnNext onClick activity is null or click too fast.");
            }
        });
    }

    public void d(List<Integer> list, List<Integer> list2, int i) {
        this.q = list;
        this.f9921c = list2;
        this.v = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Arrays.fill(this.g, false);
        Arrays.fill(this.j, false);
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= 7) {
                break;
            }
            this.g[i] = i == 0 || i == 2 || i == 5;
            boolean[] zArr = this.j;
            if (i != 1 && i != 3) {
                z = false;
            }
            zArr[i] = z;
            i++;
        }
        int i2 = this.v;
        if (i2 == 2) {
            this.g[4] = true;
        } else if (i2 == 3) {
            boolean[] zArr2 = this.g;
            zArr2[1] = true;
            zArr2[4] = true;
            this.j[6] = true;
        }
        int iA = a(this.g);
        int iA2 = a(this.j);
        this.s.setHeadTitleText(getResources().getQuantityString(R.plurals.IDS_sug_run_day_tips, iA, Integer.valueOf(iA)));
        this.s.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f9919a, R.color.common_transparent));
        this.m.setHeadTitleText(getResources().getQuantityString(R.plurals.IDS_sug_power_day_tips, iA2, Integer.valueOf(iA2)));
        this.m.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f9919a, R.color.common_transparent));
        if (this.f9920b == 1) {
            e();
        }
        if (Utils.o()) {
            Arrays.fill(this.j, false);
        }
        j();
    }

    private void e() {
        if (njy.b(this.q)) {
            Arrays.fill(this.g, false);
            for (Integer num : this.q) {
                int iIntValue = num.intValue();
                boolean[] zArr = this.g;
                if (iIntValue - 1 < zArr.length) {
                    zArr[num.intValue() - 1] = true;
                }
            }
        }
        Arrays.fill(this.j, false);
        if (njy.b(this.f9921c)) {
            for (Integer num2 : this.f9921c) {
                int iIntValue2 = num2.intValue();
                boolean[] zArr2 = this.j;
                if (iIntValue2 - 1 < zArr2.length) {
                    zArr2[num2.intValue() - 1] = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(boolean[] zArr) {
        if (zArr == null) {
            return 0;
        }
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    private void j() {
        int childCount = this.p.getChildCount();
        for (int i = 0; i <= childCount - 1; i++) {
            if (!(this.p.getChildAt(i) instanceof HealthToggleButton)) {
                LogUtil.e("Suggestion_TrainDateFragment", "mRunDayFlowLayout curBtnIndex is not HealthToggleButton.");
                return;
            }
            HealthToggleButton healthToggleButton = (HealthToggleButton) this.p.getChildAt(i);
            boolean[] zArr = this.g;
            if (i > zArr.length - 1) {
                LogUtil.e("Suggestion_TrainDateFragment", "curBtnIndex is out of mIsTrainRunSelectArrays.");
                return;
            }
            boolean z = zArr[i];
            if (z) {
                ibe.d(this.f9919a, healthToggleButton, R.drawable.sug_circular_btn_selected, 0);
            } else {
                ibe.c(this.f9919a, healthToggleButton, R.drawable.sug_circular_btn_default, 0);
            }
            e(healthToggleButton, i, z);
        }
        int childCount2 = this.k.getChildCount();
        for (int i2 = 0; i2 <= childCount2 - 1; i2++) {
            if (!(this.k.getChildAt(i2) instanceof HealthToggleButton)) {
                LogUtil.e("Suggestion_TrainDateFragment", "mPowerDayFlowLayout curBtnIndex is not HealthToggleButton.");
                return;
            }
            HealthToggleButton healthToggleButton2 = (HealthToggleButton) this.k.getChildAt(i2);
            boolean[] zArr2 = this.j;
            if (i2 > zArr2.length - 1) {
                LogUtil.e("Suggestion_TrainDateFragment", "curBtnIndex is out of mIsPowerRunSelectArrays.");
                return;
            }
            boolean z2 = zArr2[i2];
            if (z2) {
                ibe.d(this.f9919a, healthToggleButton2, R.drawable.sug_circular_btn_selected, 0);
            } else {
                ibe.c(this.f9919a, healthToggleButton2, R.drawable.sug_circular_btn_default, 0);
            }
            e(healthToggleButton2, i2, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthToggleButton healthToggleButton, int i, boolean z) {
        if (this.x == null) {
            ReleaseLogUtil.c("Suggestion_TrainDateFragment", "setCheckedContentDescription mWeekArray is null");
            this.x = new int[]{R.string.IDS_monday, R.string.IDS_tuesday, R.string.IDS_wednesday, R.string.IDS_thursday, R.string.IDS_friday, R.string.IDS_saturday, R.string.IDS_sunday};
        }
        if (i >= 0) {
            int[] iArr = this.x;
            if (i < iArr.length) {
                lrd.c(healthToggleButton, qre.f(iArr[i]), z, (Class<?>) CheckBox.class);
                return;
            }
        }
        ReleaseLogUtil.d("Suggestion_TrainDateFragment", "setCheckedContentDescription mWeekArray ", this.x, " index ", Integer.valueOf(i));
    }

    public List<Integer> d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            if (this.g[i]) {
                arrayList.add(Integer.valueOf(i + 1));
            }
        }
        return arrayList;
    }

    public List<Integer> a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            if (this.j[i]) {
                arrayList.add(Integer.valueOf(i + 1));
            }
        }
        return arrayList;
    }

    public void b(int i) {
        this.v = i;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.e("Suggestion_TrainDateFragment", "update activity is null.");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TrainDateFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    TrainDateFragment.this.f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        String[] strArr = {this.f9919a.getString(R.string.IDS_monday), this.f9919a.getString(R.string.IDS_tuesday), this.f9919a.getString(R.string.IDS_wednesday), this.f9919a.getString(R.string.IDS_thursday), this.f9919a.getString(R.string.IDS_friday), this.f9919a.getString(R.string.IDS_saturday), this.f9919a.getString(R.string.IDS_sunday)};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            if (this.g[i]) {
                arrayList.add(strArr[i]);
            }
        }
        this.r.setText(gzx.c(this.f9919a, R.string.IDS_sug_link_content, getString(R.string.IDS_sug_run_day), d(arrayList)));
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 7; i2++) {
            if (this.j[i2]) {
                arrayList2.add(strArr[i2]);
            }
        }
        if (arrayList2.size() == 0) {
            this.w.setVisibility(8);
            return;
        }
        this.w.setVisibility(0);
        this.w.setText(gzx.c(this.f9919a, R.string.IDS_sug_link_content, getString(R.string.IDS_sug_power_day), d(arrayList2)));
    }

    private String d(List<String> list) {
        int i = 0;
        if (njy.e(list, 0)) {
            LogUtil.e("Suggestion_TrainDateFragment", "selectConcatenatedString selectedDay is invalid.");
            return "";
        }
        int size = list.size();
        String strC = list.get(0);
        if (size > 1) {
            while (i < size - 1) {
                i++;
                strC = gzx.c(this.f9919a, R.string.IDS_music_format_split2, strC, list.get(i));
            }
        }
        return strC;
    }

    public void a(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.n = onNextPageListener;
    }
}
