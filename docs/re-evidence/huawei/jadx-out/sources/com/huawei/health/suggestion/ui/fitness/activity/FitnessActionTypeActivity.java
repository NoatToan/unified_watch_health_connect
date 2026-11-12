package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.common.SearchShowMode;
import com.huawei.health.suggestion.ui.BaseFitnessSearchActivity;
import com.huawei.health.suggestion.ui.fitness.adapter.FitnessActionTypeRecyAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.LoadMoreInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btx;
import defpackage.hjv;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessActionTypeActivity extends BaseFitnessSearchActivity implements LoadMoreInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9079b;
    private String d;
    private FitnessActionTypeRecyAdapter e;
    private View f;
    private HealthButton g;
    private HealthRecycleView h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9080c = 0;
    private final int j = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9078a = 1;
    private boolean i = false;

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity
    public void initNormalModeLayout() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity
    public void initNormalViewController() {
    }

    static /* synthetic */ int d(FitnessActionTypeActivity fitnessActionTypeActivity, int i) {
        int i2 = fitnessActionTypeActivity.f9080c + i;
        fitnessActionTypeActivity.f9080c = i2;
        return i2;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FitnessActionTypeRecyAdapter fitnessActionTypeRecyAdapter = new FitnessActionTypeRecyAdapter(this.h, this);
        this.e = fitnessActionTypeRecyAdapter;
        fitnessActionTypeRecyAdapter.a(this);
        this.h.setAdapter(this.e);
        this.h.setLayoutManager(new LinearLayoutManager(btx.c()));
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        b();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!CommonUtil.ab(getApplicationContext())) {
            this.f.setVisibility(0);
            this.i = true;
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionTypeActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CommonUtil.t(FitnessActionTypeActivity.this);
                }
            });
            return;
        }
        this.f.setVisibility(8);
        if (!this.f9079b && this.f9080c == 0 && this.i) {
            b();
            this.i = false;
        }
    }

    private void b() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("FitnessActionTypeActivity", "getActionDatas : courseApi is null.");
        } else {
            courseApi.getCourseActionList(this.f9080c, 50, 0, this.f9078a, new UiCallback<List<AtomicAction>>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionTypeActivity.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("FitnessActionTypeActivity", "getActonDatas get data failure");
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(Handler handler, int i, String str) {
                    FitnessActionTypeActivity.this.f9079b = false;
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<AtomicAction> list) {
                    LogUtil.j("FitnessActionTypeActivity", "getActonDatas get data success");
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Handler handler, final List<AtomicAction> list) {
                    FitnessActionTypeActivity.this.f9079b = njy.b(list) && list.size() >= 50;
                    if (FitnessActionTypeActivity.this.f9079b) {
                        FitnessActionTypeActivity.d(FitnessActionTypeActivity.this, list.size());
                    }
                    FitnessActionTypeActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionTypeActivity.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            FitnessActionTypeActivity.this.e.b(list);
                        }
                    });
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity, com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_action_type);
        super.initLayout();
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity, com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        super.initViewController();
        this.h = (HealthRecycleView) findViewById(R.id.recyclerview_action_type);
        this.f = findViewById(R.id.sug_action_no_data_set_network);
        this.g = (HealthButton) findViewById(R.id.btn_no_net_work);
        Intent intent = getIntent();
        if (intent != null) {
            this.d = intent.getStringExtra("body_title");
            this.mTitleBar.setTitleText(this.d);
            this.f9078a = intent.getIntExtra("body_title_type", this.f9078a);
            if (this.mFitSearchAllHelper instanceof hjv) {
                ((hjv) this.mFitSearchAllHelper).c(this.f9078a);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity
    public void initTitleBarSearchController() {
        if (this.mTitleBar == null) {
            LogUtil.j("FitnessActionTypeActivity", "initTitleBarSearchController TitleBar can not null");
        } else {
            this.mTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionTypeActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (SearchShowMode.NORMAL.equals(FitnessActionTypeActivity.this.mShowModeStatus)) {
                        FitnessActionTypeActivity.this.switchToSearchMode();
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.LoadMoreInterface
    public void loadMore() {
        if (this.f9079b) {
            b();
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseFitnessSearchActivity
    public void initSearchViewController() {
        super.initSearchViewController();
        this.mFitSearchAllHelper = new hjv(this);
        setOnQueryTextListener(this.mFitSearchAllHelper);
        setLoadMoreListener(this.mFitSearchAllHelper);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
