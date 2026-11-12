package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.manager.IGetPoiByLocationName;
import com.huawei.healthcloud.plugintrack.ui.adapter.RunningRouteSearchSuggestAdapter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import defpackage.ezi;
import defpackage.jdf;
import defpackage.jpg;
import defpackage.qqt;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RunningRouteLocationSearchActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSearchView f10871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10872c;
    private RunningRouteSearchSuggestAdapter d;
    private ConstraintLayout e;
    private View i;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("RunningRouteLocationSearchActivity", "onCreate");
        this.f10870a = this;
        setContentView(R.layout.activity_running_route_location_search);
        this.f10872c = getIntent().getStringExtra(DistrictSearchQuery.KEYWORDS_CITY);
        j();
        e();
        c();
        b();
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        LogUtil.a("RunningRouteLocationSearchActivity", "onConfigurationChanged");
        super.onConfigurationChanged(configuration);
        i();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HealthSearchView healthSearchView = this.f10871b;
        if (healthSearchView != null) {
            healthSearchView.setOnQueryTextListener(null);
        }
    }

    private void j() {
        qrs.j(this, R.color.colorSubBackground);
        this.i = findViewById(R.id.statusbar_panel);
        i();
        this.e = (ConstraintLayout) findViewById(R.id.search_result_empty_layout);
    }

    private void b() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.running_route_location_search_suggest_recycler_view);
        healthRecycleView.b(false);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this));
        RunningRouteSearchSuggestAdapter runningRouteSearchSuggestAdapter = new RunningRouteSearchSuggestAdapter(this, new ArrayList(), new ArrayList());
        this.d = runningRouteSearchSuggestAdapter;
        healthRecycleView.setAdapter(runningRouteSearchSuggestAdapter);
        healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteLocationSearchActivity.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                RunningRouteLocationSearchActivity.this.f10871b.clearFocus();
            }
        });
    }

    private void c() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.running_route_location_search_button);
        if (qrs.v()) {
            healthTextView.setTextSize(1, getResources().getDimension(R.dimen.health_common_12dp));
        }
        qsp.b(healthTextView, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteLocationSearchActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!TextUtils.isEmpty(RunningRouteLocationSearchActivity.this.f10871b.getQuery())) {
                    RunningRouteLocationSearchActivity runningRouteLocationSearchActivity = RunningRouteLocationSearchActivity.this;
                    runningRouteLocationSearchActivity.e(runningRouteLocationSearchActivity.f10871b.getQuery());
                } else {
                    LogUtil.a("RunningRouteLocationSearchActivity", "queryText is empty");
                }
            }
        });
    }

    private void e(HealthSearchView healthSearchView) {
        healthSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteLocationSearchActivity.4
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                qsp.c((View) RunningRouteLocationSearchActivity.this.e, 8);
                if (!TextUtils.isEmpty(str)) {
                    jdf jdfVarA = jdf.a();
                    RunningRouteLocationSearchActivity runningRouteLocationSearchActivity = RunningRouteLocationSearchActivity.this;
                    jdfVarA.e(runningRouteLocationSearchActivity, str, runningRouteLocationSearchActivity.f10872c, new a(RunningRouteLocationSearchActivity.this, str));
                    return true;
                }
                RunningRouteLocationSearchActivity.this.d.a();
                return false;
            }
        });
    }

    private void e() {
        this.f10871b = (HealthSearchView) findViewById(R.id.running_route_location_search_view);
        if (qrs.ac()) {
            this.f10871b.getLayoutParams().width = -2;
        }
        this.f10871b.setQueryHint(getString(R.string.IDS_track_runing_route_search_hint));
        this.f10871b.requestFocus();
        ezi.d(this.f10871b, new TextView.OnEditorActionListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteLocationSearchActivity.5
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                RunningRouteLocationSearchActivity.this.e(RunningRouteLocationSearchActivity.this.f10871b.getQuery());
                return true;
            }
        });
        e(this.f10871b);
    }

    private void i() {
        RelativeLayout.LayoutParams layoutParamsU = qrs.u(this.f10870a);
        View view = this.i;
        if (view == null || layoutParamsU == null) {
            return;
        }
        view.setLayoutParams(layoutParamsU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && !this.d.d()) {
            qsp.c((View) this.e, 0);
        }
        this.f10871b.clearFocus();
    }

    private void d() {
        ImageView imageView = (ImageView) findViewById(R.id.running_route_location_search_back);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            imageView.setImageDrawable(qqz.e(this, ContextCompat.getDrawable(getApplicationContext(), R.drawable.health_navbar_back_selector)));
        } else {
            imageView.setImageResource(R.drawable.health_navbar_back_selector);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: jkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38684c.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a();
    }

    private void a() {
        super.onBackPressed();
    }

    public void a(HotPathCityInfo hotPathCityInfo) {
        Intent intent = new Intent();
        intent.putExtra("SEARCH_JUMP_CITY_INFO", qqt.b(hotPathCityInfo));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: loaded from: classes33.dex */
    static class a implements IGetPoiByLocationName {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<RunningRouteLocationSearchActivity> f10875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10876c;

        public a(RunningRouteLocationSearchActivity runningRouteLocationSearchActivity, String str) {
            this.f10875b = new WeakReference<>(runningRouteLocationSearchActivity);
            this.f10876c = str;
        }

        @Override // com.huawei.healthcloud.plugintrack.runningroute.manager.IGetPoiByLocationName
        public void onPoiListBack(final List<String> list, final List<jpg> list2, final List<String> list3) {
            WeakReference<RunningRouteLocationSearchActivity> weakReference = this.f10875b;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("RunningRouteLocationSearchActivity", "GetPoiByLocationNameCallBack: mWeakRef is null");
            }
            final RunningRouteLocationSearchActivity runningRouteLocationSearchActivity = this.f10875b.get();
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteLocationSearchActivity.a.1
                @Override // java.lang.Runnable
                public void run() {
                    runningRouteLocationSearchActivity.d.e(a.this.f10876c);
                    runningRouteLocationSearchActivity.d.a(list, list3, list2);
                }
            });
        }
    }
}
