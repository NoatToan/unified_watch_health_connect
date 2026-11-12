package com.huawei.health.suggestion.ui.fitness.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.view.FilterFlowLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.bottomsheet.HealthBottomSheet;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class CourseMoreFilterActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthBottomSheet f9061b;
    private List<Attribute> d;
    private FilterFlowLayout e;
    private List<Attribute> g;
    private Intent h;
    private FilterFlowLayout i;
    private FilterFlowLayout l;
    private List<Attribute> n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f9062c = new ArrayList(10);
    private List<Integer> k = new ArrayList(10);
    private List<Integer> j = new ArrayList(10);
    private FilterFlowLayout.OnCheckChangeListener o = new FilterFlowLayout.OnCheckChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CourseMoreFilterActivity.4
        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onChecked(int i) {
            CourseMoreFilterActivity.this.f9062c.add(Integer.valueOf(i));
        }

        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onCancelCheck(int i) {
            CourseMoreFilterActivity courseMoreFilterActivity = CourseMoreFilterActivity.this;
            courseMoreFilterActivity.e(i, courseMoreFilterActivity.f9062c);
        }
    };
    private FilterFlowLayout.OnCheckChangeListener f = new FilterFlowLayout.OnCheckChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CourseMoreFilterActivity.3
        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onChecked(int i) {
            CourseMoreFilterActivity.this.k.add(Integer.valueOf(i));
        }

        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onCancelCheck(int i) {
            CourseMoreFilterActivity courseMoreFilterActivity = CourseMoreFilterActivity.this;
            courseMoreFilterActivity.e(i, courseMoreFilterActivity.k);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FilterFlowLayout.OnCheckChangeListener f9060a = new FilterFlowLayout.OnCheckChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CourseMoreFilterActivity.1
        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onChecked(int i) {
            CourseMoreFilterActivity.this.j.add(Integer.valueOf(i));
        }

        @Override // com.huawei.health.suggestion.ui.view.FilterFlowLayout.OnCheckChangeListener
        public void onCancelCheck(int i) {
            CourseMoreFilterActivity courseMoreFilterActivity = CourseMoreFilterActivity.this;
            courseMoreFilterActivity.e(i, courseMoreFilterActivity.j);
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseActivity.setDisplaySideMode(this);
        setContentView(R.layout.activity_course_more_filter);
        a();
        c();
    }

    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_CourseMoreFilterActivity", "initData() getIntent is null");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("RESULT_KEY_SELECTED_DATA");
        if (bundleExtra == null) {
            LogUtil.j("Suggestion_CourseMoreFilterActivity", "initData() bundle is null");
            return;
        }
        try {
            this.d = bundleExtra.getParcelableArrayList("more_filter_hot");
            this.n = bundleExtra.getParcelableArrayList("more_filter_parts");
            this.g = bundleExtra.getParcelableArrayList("more_filter_equipments");
            ArrayList<Integer> integerArrayList = bundleExtra.getIntegerArrayList("more_filter_hot_selected");
            if (njy.b(integerArrayList)) {
                this.f9062c.addAll(integerArrayList);
            }
            ArrayList<Integer> integerArrayList2 = bundleExtra.getIntegerArrayList("more_filter_parts_selected");
            if (njy.b(integerArrayList2)) {
                this.k.addAll(integerArrayList2);
            }
            ArrayList<Integer> integerArrayList3 = bundleExtra.getIntegerArrayList("more_filter_equipments_selected");
            if (njy.b(integerArrayList3)) {
                this.j.addAll(integerArrayList3);
            }
        } catch (BadParcelableException e) {
            LogUtil.e("Suggestion_CourseMoreFilterActivity", "get intent data failed with BadParcelableException", LogAnonymous.b(e));
        }
        i();
    }

    private void a() {
        HealthBottomSheet healthBottomSheet = (HealthBottomSheet) findViewById(R.id.sliding_layout);
        this.f9061b = healthBottomSheet;
        healthBottomSheet.setIndicateSafeInsetsEnabled(true);
        this.f9061b.setForceShowIndicateEnabled(false);
        this.f9061b.setSheetHeight(0);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.title);
        healthTextView.setText(R.string.IDS_hwh_sug_fitness_recom_more);
        if (qrs.v()) {
            healthTextView.setTextSize(0, getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_28dp));
        }
        findViewById(R.id.content).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CourseMoreFilterActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CourseMoreFilterActivity.this.d();
            }
        });
        this.f9061b.b(new HwBottomSheet.SheetSlideListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CourseMoreFilterActivity.5
            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetSlide(View view, float f) {
            }

            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetStateChanged(View view, HwBottomSheet.SheetState sheetState, HwBottomSheet.SheetState sheetState2) {
                if (sheetState2 == HwBottomSheet.SheetState.COLLAPSED || sheetState2 == HwBottomSheet.SheetState.HIDDEN) {
                    CourseMoreFilterActivity courseMoreFilterActivity = CourseMoreFilterActivity.this;
                    courseMoreFilterActivity.setResult(-1, courseMoreFilterActivity.h);
                    CourseMoreFilterActivity.this.finish();
                }
            }
        });
        ((HealthScrollView) findViewById(R.id.health_dialog_scrollview)).setScrollViewVerticalDirectionEvent(true);
        this.e = (FilterFlowLayout) findViewById(R.id.workout_filter_classify_group);
        this.l = (FilterFlowLayout) findViewById(R.id.workout_filter_training_points_group);
        this.i = (FilterFlowLayout) findViewById(R.id.workout_filter_equipments_group);
        ((HealthButton) findViewById(R.id.recom_popu_dialog_confirm)).setOnClickListener(this);
        ((HealthButton) findViewById(R.id.recom_popu_dialog_reset)).setOnClickListener(this);
        findViewById(R.id.content).setOnClickListener(this);
        int iE = e();
        this.f9061b.setHeightGap(iE);
        ViewGroup viewGroup = (ViewGroup) findViewById(com.huawei.ui.commonui.R.id.drag_View);
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), iE);
    }

    private int e() {
        int iM = qrs.m();
        int iS = qrs.s(this);
        return (int) ((iM - ((iM - iS) * 0.8f)) - iS);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f9061b.getSheetState() == HwBottomSheet.SheetState.EXPANDED) {
            d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(500)) {
            LogUtil.j("Suggestion_CourseMoreFilterActivity", "onClick() view click too fast.");
            return;
        }
        int id = view.getId();
        if (id == R.id.content || id == R.id.recom_popup_dialog_space) {
            d();
        }
        if (id == R.id.recom_popu_dialog_reset) {
            LogUtil.d("Suggestion_CourseMoreFilterActivity", " click reset");
            this.f9062c.clear();
            this.k.clear();
            this.j.clear();
            i();
        }
        if (id == R.id.recom_popu_dialog_confirm) {
            d();
        }
    }

    private void b() {
        this.h = new Intent();
        Bundle bundle = new Bundle();
        bundle.putIntegerArrayList("more_filter_hot", new ArrayList<>(this.f9062c));
        bundle.putIntegerArrayList("more_filter_parts", new ArrayList<>(this.k));
        bundle.putIntegerArrayList("more_filter_equipments", new ArrayList<>(this.j));
        this.h.putExtra("RESULT_KEY_SELECTED_DATA", bundle);
    }

    private void i() {
        this.e.c(this, this.d, this.f9062c);
        this.e.setOnCheckedChangeListener(this.o);
        this.l.c(this, this.n, this.k);
        this.l.setOnCheckedChangeListener(this.f);
        this.i.c(this, this.g, this.j);
        this.i.setOnCheckedChangeListener(this.f9060a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, List<Integer> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_CourseMoreFilterActivity", "setCancelCheck() status is null");
            return;
        }
        int iIndexOf = list.indexOf(Integer.valueOf(i));
        LogUtil.d("Suggestion_CourseMoreFilterActivity", "setCancelCheck() => index : ", Integer.valueOf(iIndexOf));
        if (njy.c(list, iIndexOf)) {
            list.remove(iIndexOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        b();
        setResult(-1, this.h);
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
