package com.huawei.ui.main.stories.soical.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.marketing.request.CustomConfigValue;
import com.huawei.health.marketing.request.IFavoriteCallBack;
import com.huawei.health.operationbundle.R;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.soical.activity.FunctionMenuActivity;
import com.huawei.ui.main.stories.soical.views.FunctionMenuAdapter;
import defpackage.fxl;
import defpackage.njy;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class FunctionMenuActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f28868a = new Handler() { // from class: com.huawei.ui.main.stories.soical.activity.FunctionMenuActivity.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("FunctionMenuActivity", "message is null!");
                return;
            }
            super.handleMessage(message);
            if (message.what == 12289 && (message.obj instanceof List)) {
                List<CustomConfigValue> list = (List) message.obj;
                FunctionMenuActivity.this.d.setVisibility(8);
                FunctionMenuActivity.this.i.setVisibility(0);
                FunctionMenuActivity.this.f28870c.e(FunctionMenuActivity.this.e, list);
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FunctionMenuAdapter f28870c;
    private ViewGroup d;
    private List<SingleGridContent> e;
    private ResourceBriefInfo h;
    private HealthRecycleView i;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("FunctionMenuActivity", "enter onCreate.");
        setContentView(R.layout.activity_function_menu);
        this.d = (ViewGroup) findViewById(R.id.layout_loading);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.rv_function_menu);
        this.i = healthRecycleView;
        healthRecycleView.setVisibility(8);
        this.i.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        this.i.setLayoutManager(linearLayoutManager);
        this.i.setNestedScrollingEnabled(false);
        FunctionMenuAdapter functionMenuAdapter = new FunctionMenuAdapter(this);
        this.f28870c = functionMenuAdapter;
        this.i.setAdapter(functionMenuAdapter);
        ((CustomTitleBar) findViewById(R.id.ctb_function_menu)).setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.activity.FunctionMenuActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FunctionMenuActivity.this.finish();
            }
        });
        this.d.setVisibility(0);
        d();
        b();
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("FunctionMenuActivity", "intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("contentType", 0);
        this.f28869b = intExtra;
        LogUtil.j("FunctionMenuActivity", "intent mContentType: ", Integer.valueOf(intExtra));
    }

    private void b() {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(4001);
            resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: won
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.d.e(marketingApi, (Map) obj);
                }
            });
            resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: woj
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    this.f52264b.b(exc);
                }
            });
        }
    }

    public /* synthetic */ void e(MarketingApi marketingApi, Map map) {
        ResourceResultInfo resourceResultInfo = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map).get(4001);
        if (resourceResultInfo == null || njy.e(resourceResultInfo.getResources())) {
            LogUtil.a("FunctionMenuActivity", "resultInfo or resourceList is null");
            return;
        }
        for (ResourceBriefInfo resourceBriefInfo : resourceResultInfo.getResources()) {
            if (resourceBriefInfo.getContentType() == this.f28869b) {
                this.h = resourceBriefInfo;
                break;
            }
        }
        ResourceBriefInfo resourceBriefInfo2 = this.h;
        if (resourceBriefInfo2 == null || resourceBriefInfo2.getContent() == null || TextUtils.isEmpty(this.h.getContent().getContent())) {
            LogUtil.a("FunctionMenuActivity", "mResultBriefInfo or Content is null");
            return;
        }
        LogUtil.a("FunctionMenuActivity", "data:", this.h.getContent().getContent());
        try {
            GridTemplate gridTemplate = (GridTemplate) new Gson().fromJson(this.h.getContent().getContent(), GridTemplate.class);
            if (gridTemplate == null) {
                LogUtil.j("FunctionMenuActivity", "gridTemplate is null.");
                return;
            }
            GridTemplate gridTemplateB = b(gridTemplate);
            if (!gridTemplateB.isIntelligentFlag()) {
                Collections.sort(gridTemplateB.getGridContents(), new Comparator() { // from class: wof
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return FunctionMenuActivity.d((SingleGridContent) obj, (SingleGridContent) obj2);
                    }
                });
            }
            List<SingleGridContent> gridContents = gridTemplateB.getGridContents();
            this.e = gridContents;
            gridContents.remove(gridContents.size() - 1);
            ColumnRequestUtils.getFavoriteData(new IFavoriteCallBack() { // from class: woe
                @Override // com.huawei.health.marketing.request.IFavoriteCallBack
                public final void onResult(List list) {
                    this.f52259a.c(list);
                }
            });
        } catch (JsonSyntaxException unused) {
            LogUtil.j("FunctionMenuActivity", "gridTemplate exception");
        }
    }

    public static /* synthetic */ int d(SingleGridContent singleGridContent, SingleGridContent singleGridContent2) {
        return singleGridContent2.getPriority() - singleGridContent.getPriority();
    }

    public /* synthetic */ void c(List list) {
        this.f28868a.obtainMessage(12289, list).sendToTarget();
    }

    public /* synthetic */ void b(Exception exc) {
        this.d.setVisibility(8);
    }

    private GridTemplate b(GridTemplate gridTemplate) {
        ArrayList arrayList = new ArrayList();
        List<SingleGridContent> gridContents = gridTemplate.getGridContents();
        if (!njy.e(gridContents)) {
            for (SingleGridContent singleGridContent : gridContents) {
                if (fxl.d(singleGridContent.getItemEffectiveTime(), singleGridContent.getItemExpirationTime())) {
                    arrayList.add(singleGridContent);
                }
            }
            gridTemplate.setGridContents(arrayList);
        }
        return gridTemplate;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
