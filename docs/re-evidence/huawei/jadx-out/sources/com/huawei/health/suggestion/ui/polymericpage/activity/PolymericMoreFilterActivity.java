package com.huawei.health.suggestion.ui.polymericpage.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericFilterMoreAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.bottomsheet.HealthBottomSheet;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet;
import defpackage.njy;
import defpackage.peh;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PolymericMoreFilterActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PolymericFilterMoreAdapter f9809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthBottomSheet f9810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f9811c;
    private HealthRecycleView d;
    private List<FilterCondition> e = new ArrayList();
    private Map<Long, List<Long>> i = new HashMap();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseActivity.setDisplaySideMode(this);
        setContentView(R.layout.activity_more_filter_course);
        d();
        b();
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_AggregateMoreFilterActivity", "initData() getIntent is null");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("RESULT_KEY_SELECTED_DATA");
        if (bundleExtra == null) {
            LogUtil.e("Suggestion_AggregateMoreFilterActivity", "bundle null.", "RESULT_KEY_SELECTED_DATA");
            return;
        }
        this.e = bundleExtra.getParcelableArrayList("MORE_FILTER_CONDITIONS");
        String string = bundleExtra.getString("MORE_FILTER_SELECTED_DATA");
        if (njy.e(this.e)) {
            LogUtil.j("Suggestion_AggregateMoreFilterActivity", "mFilterConditions size: 0 selectedString:", string);
        } else {
            LogUtil.a("Suggestion_AggregateMoreFilterActivity", "mFilterConditions size:", Integer.valueOf(this.e.size()), "selectedString: ", string);
        }
        Map<Long, List<Long>> map = (Map) peh.d(string, new TypeToken<Map<Long, List<Long>>>() { // from class: com.huawei.health.suggestion.ui.polymericpage.activity.PolymericMoreFilterActivity.1
        }.getType());
        if (map != null) {
            this.i = map;
        } else {
            this.i = new HashMap();
        }
    }

    private void b() {
        HealthBottomSheet healthBottomSheet = (HealthBottomSheet) findViewById(R.id.sliding_layout);
        this.f9810b = healthBottomSheet;
        healthBottomSheet.setIndicateSafeInsetsEnabled(true);
        this.f9810b.setForceShowIndicateEnabled(false);
        this.f9810b.setSheetHeight(0);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.title);
        healthTextView.setText(R.string.IDS_hwh_sug_fitness_recom_more);
        if (qrs.v()) {
            healthTextView.setTextSize(0, getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_28dp));
        }
        findViewById(R.id.content).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.polymericpage.activity.PolymericMoreFilterActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PolymericMoreFilterActivity.this.e();
            }
        });
        this.f9810b.b(new HwBottomSheet.SheetSlideListener() { // from class: com.huawei.health.suggestion.ui.polymericpage.activity.PolymericMoreFilterActivity.2
            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetSlide(View view, float f) {
            }

            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetStateChanged(View view, HwBottomSheet.SheetState sheetState, HwBottomSheet.SheetState sheetState2) {
                if (sheetState2 == HwBottomSheet.SheetState.COLLAPSED || sheetState2 == HwBottomSheet.SheetState.HIDDEN) {
                    PolymericMoreFilterActivity polymericMoreFilterActivity = PolymericMoreFilterActivity.this;
                    polymericMoreFilterActivity.setResult(-1, polymericMoreFilterActivity.f9811c);
                    PolymericMoreFilterActivity.this.finish();
                }
            }
        });
        this.d = (HealthRecycleView) findViewById(R.id.recycleview_filter_more);
        this.d.setLayoutManager(new HealthLinearLayoutManager(this, 1, false));
        PolymericFilterMoreAdapter polymericFilterMoreAdapter = new PolymericFilterMoreAdapter(this, this.e, this.i);
        this.f9809a = polymericFilterMoreAdapter;
        this.d.setAdapter(polymericFilterMoreAdapter);
        this.d.setNestedScrollingEnabled(false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.d.setItemAnimator(defaultItemAnimator);
        ((HealthButton) findViewById(R.id.recom_popu_dialog_confirm)).setOnClickListener(this);
        ((HealthButton) findViewById(R.id.recom_popu_dialog_reset)).setOnClickListener(this);
        findViewById(R.id.content).setOnClickListener(this);
        int iA = a();
        this.f9810b.setHeightGap(iA);
        ViewGroup viewGroup = (ViewGroup) findViewById(com.huawei.ui.commonui.R.id.drag_View);
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), iA);
    }

    private int a() {
        int iM = qrs.m();
        int iS = qrs.s(this);
        return (int) ((iM - ((iM - iS) * 0.8f)) - iS);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f9810b.getSheetState() == HwBottomSheet.SheetState.EXPANDED) {
            e();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(500)) {
            LogUtil.j("Suggestion_AggregateMoreFilterActivity", "onClick() view click too fast.");
            return;
        }
        int id = view.getId();
        if (id == R.id.content || id == R.id.recom_popup_dialog_space) {
            e();
        }
        if (id == R.id.recom_popu_dialog_reset) {
            LogUtil.d("Suggestion_AggregateMoreFilterActivity", " click reset");
            this.i.clear();
            this.f9809a.e();
            this.f9809a.notifyDataSetChanged();
        }
        if (id == R.id.recom_popu_dialog_confirm) {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f9811c = new Intent();
        Map<Long, List<Long>> mapB = this.f9809a.b();
        this.i = mapB;
        LogUtil.a("Suggestion_AggregateMoreFilterActivity", "mSelectedIdMap:", peh.c(mapB));
        this.f9811c.putExtra("MORE_FILTER_SELECTED_DATA", peh.c(this.i));
        setResult(-1, this.f9811c);
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
