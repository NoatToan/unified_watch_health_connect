package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.common.SearchShowMode;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.BaseFitnessSearchActivity;
import com.huawei.health.suggestion.ui.fitness.adapter.FitnessActionRecyAdapter;
import com.huawei.health.suggestion.ui.view.PullRecyclerViewGroup;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btx;
import defpackage.hjv;
import defpackage.hkv;
import defpackage.ien;
import defpackage.qqz;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessActionLibraryActivity extends BaseFitnessSearchActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<hkv> f9074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FitnessActionRecyAdapter f9075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hjv f9076c;
    private int d = 0;
    private Context e;
    private HealthRecycleView h;
    private PullRecyclerViewGroup j;

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity
    public void initNormalModeLayout() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity
    public void initNormalViewController() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = getApplicationContext();
        BaseActivity.setViewSafeRegion(true, this.j);
        FitnessActionRecyAdapter fitnessActionRecyAdapter = new FitnessActionRecyAdapter(this.h, this);
        this.f9075b = fitnessActionRecyAdapter;
        this.h.setAdapter(fitnessActionRecyAdapter);
        this.h.setLayoutManager(new LinearLayoutManager(btx.c()));
        ien.e(this, this.h, ien.a(this.e));
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        a();
    }

    private void a() {
        this.f9074a = new ArrayList(10);
        int[] iArr = {R.string.sug_action_whole_body, R.string.sug_action_chest, R.string.sug_action_shoulder, R.string.sug_action_back, R.string.sug_action_arm, R.string.sug_action_abdomen, R.string.sug_action_waist, R.string.sug_action_hips, R.string.sug_action_leg, R.string.sug_action_neck};
        int[] iArr2 = {R.drawable.fitness_action_body, R.drawable.fitness_action_chest, R.drawable.fitness_action_shoulder, R.drawable.fitness_action_back, R.drawable.fitness_action_arm, R.drawable.fitness_action_abdomen, R.drawable.fitness_action_waist, R.drawable.fitness_action_hips, R.drawable.fitness_action_foot, R.drawable.fitness_action_neck};
        int[] iArr3 = {1, 2, 16, 4, 128, 256, 32, 64, 8, 512};
        for (int i = 0; i < 10; i++) {
            hkv hkvVar = new hkv();
            hkvVar.b(iArr[i]);
            hkvVar.a(iArr2[i]);
            hkvVar.e(iArr3[i]);
            this.f9074a.add(hkvVar);
        }
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionLibraryActivity.3
            @Override // java.lang.Runnable
            public void run() {
                FitnessActionLibraryActivity.this.f9075b.c(FitnessActionLibraryActivity.this.f9074a);
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity, com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_action_library);
        super.initLayout();
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity, com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        super.initViewController();
        this.j = (PullRecyclerViewGroup) findViewById(R.id.normal_content_layout);
        this.h = (HealthRecycleView) findViewById(R.id.recyclerview_action_library);
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity
    public void initTitleBarSearchController() {
        if (this.mTitleBar == null) {
            LogUtil.j("FitnessActionLibraryActivity", "initTitleBarSearchController TitleBar can not be null");
            return;
        }
        this.mTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionLibraryActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchShowMode.NORMAL.equals(FitnessActionLibraryActivity.this.mShowModeStatus)) {
                    FitnessActionLibraryActivity.this.switchToSearchMode();
                }
            }
        });
        this.mTitleBar.setTitleBarBackgroundColor(getResources().getColor(com.huawei.ui.commonui.R.color.fitness_action_library_normal));
        if (LanguageUtil.ba(this)) {
            this.mTitleBar.setRightButtonDrawable(qqz.e(this, R.drawable.search_bar_icon), qre.f(R.string.IDS_global_search_button));
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity
    public void initSearchViewController() {
        super.initSearchViewController();
        hjv hjvVar = new hjv(this);
        this.f9076c = hjvVar;
        hjvVar.c(this.d);
        setOnQueryTextListener(this.f9076c);
        setLoadMoreListener(this.f9076c);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        HealthRecycleView healthRecycleView = this.h;
        if (healthRecycleView == null || this.f9075b == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.h.setLayoutManager(null);
        this.h.setAdapter(this.f9075b);
        ien.e(this, this.h, ien.a(this.e));
        this.f9075b.notifyDataSetChanged();
    }
}
