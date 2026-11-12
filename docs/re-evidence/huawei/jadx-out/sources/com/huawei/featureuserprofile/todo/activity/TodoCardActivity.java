package com.huawei.featureuserprofile.todo.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.todo.adapter.TodoCardRecyAdapter;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.nps.api.NpsExternalApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.TodoTaskInterface;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.soical.interactor.OperationDetailActivityStartCallback;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import defpackage.czq;
import defpackage.czv;
import defpackage.dlp;
import defpackage.ikw;
import defpackage.njy;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TodoCardActivity extends BaseActivity implements TodoCardRecyAdapter.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f5739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f5740c;
    private RelativeLayout d;
    private TodoCardRecyAdapter e;
    private HealthRecycleView f;
    private CustomTitleBar h;
    private OperationInteractorsApi j;
    private List<ikw> g = new ArrayList(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5738a = null;

    /* JADX INFO: loaded from: classes6.dex */
    static class a extends BaseHandler<TodoCardActivity> {
        private a(TodoCardActivity todoCardActivity) {
            super(todoCardActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TodoCardActivity todoCardActivity, Message message) {
            int i = message.what;
            if (i == 1) {
                if (message.obj instanceof List) {
                    todoCardActivity.d(czq.b().b((List<ikw>) message.obj));
                    return;
                }
                return;
            }
            LogUtil.j("TodoCardActivity", "handleMessageWhenReferenceNotNull what ", Integer.valueOf(i));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("TodoCardActivity", "onCreate");
        setContentView(R.layout.activity_todo_card);
        clearBackgroundDrawable();
        this.f5738a = this;
        this.f5740c = new c(this);
        this.f5739b = new a();
        this.j = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        d();
        a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        czq.b().b(this.f5740c);
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.me_todoCard_titlebar);
        this.h = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.sug_fitness_today_todo));
        this.h.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.todo.activity.TodoCardActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TodoCardActivity.this.finish();
            }
        });
        this.d = (RelativeLayout) findViewById(R.id.no_todo_data);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.rv_todoActivity);
        this.f = healthRecycleView;
        healthRecycleView.setFocusableInTouchMode(false);
        this.f.b(false);
        this.f.e(false);
    }

    private void a() {
        this.e = new TodoCardRecyAdapter(this.f5738a, this.g);
        this.f.setLayoutManager(new LinearLayoutManager(this.f5738a));
        this.e.d(this);
        this.f.setAdapter(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<ikw> list) {
        if (njy.e(list)) {
            LogUtil.j("TodoCardActivity", "models is empty.");
            this.d.setVisibility(0);
            this.f.setVisibility(8);
            return;
        }
        this.g.clear();
        this.g.addAll(list);
        LogUtil.a("TodoCardActivity", "mTodoCardDataLists.size  = ", Integer.valueOf(this.g.size()));
        this.d.setVisibility(8);
        this.f.setVisibility(0);
        this.e.d(this.g.size());
        this.e.b(this.g);
        this.f.getRecycledViewPool().clear();
        this.e.notifyDataSetChanged();
    }

    private void e() {
        this.e = null;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e();
        HealthRecycleView healthRecycleView = this.f;
        if (healthRecycleView != null) {
            healthRecycleView.setOnScrollListener(null);
            this.f = null;
        }
    }

    @Override // com.huawei.featureuserprofile.todo.adapter.TodoCardRecyAdapter.OnItemClickListener
    public void onItemClicked(int i) {
        List<ikw> list = this.g;
        if (list == null || list.size() <= i) {
            LogUtil.j("TodoCardActivity", "mTodoCardRecyModels is null or position is error");
            return;
        }
        NpsExternalApi npsExternalApi = (NpsExternalApi) Services.b("Main", NpsExternalApi.class);
        ikw ikwVar = this.g.get(i);
        LogUtil.a("TodoCardActivity", "onItemClicked, position = ", Integer.valueOf(i), ", toDoModel.getType = ", Integer.valueOf(ikwVar.l()));
        int iL = ikwVar.l();
        if (iL == 768) {
            czv.a(ikwVar.c());
            return;
        }
        if (iL == 1536) {
            czv.a(ikwVar);
            return;
        }
        if (iL == 1792) {
            TodoTaskInterface todoTaskInterfaceN = ikwVar.n();
            if (todoTaskInterfaceN == null || !(todoTaskInterfaceN instanceof dlp)) {
                return;
            }
            d((dlp) todoTaskInterfaceN);
            return;
        }
        if (iL == 2048) {
            npsExternalApi.showNpsPage(this.f5738a);
        } else if (iL == 2304) {
            npsExternalApi.showDeviceNpsPage(this.f5738a);
        } else {
            LogUtil.a("TodoCardActivity", "error type");
        }
    }

    public void d(final dlp dlpVar) {
        GRSManager.c(this.f5738a).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.featureuserprofile.todo.activity.TodoCardActivity.3
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("TodoCardActivity", "GRSManager onCallBackSuccess ACTIVITY_KEY url = " + str);
                TodoCardActivity.this.j.gotoOperationActivityDetail(TodoCardActivity.this.f5738a, str, dlpVar, new OperationDetailActivityStartCallback() { // from class: com.huawei.featureuserprofile.todo.activity.TodoCardActivity.3.3
                    @Override // com.huawei.ui.main.stories.soical.interactor.OperationDetailActivityStartCallback
                    public void beforeDetailStart(dlp dlpVar2) {
                    }

                    @Override // com.huawei.ui.main.stories.soical.interactor.OperationDetailActivityStartCallback
                    public void afterDetailStart(dlp dlpVar2) {
                        czv.c(AnalyticsValue.HEALTH_HOME_TODO_CARD_DATA_2010084.value(), dlpVar2);
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("TodoCardActivity", "GRSManager onCallBackFail ACTIVITY_KEY i = " + i);
            }
        });
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class c implements IBaseResponseCallback {
        private WeakReference<TodoCardActivity> d;

        c(TodoCardActivity todoCardActivity) {
            this.d = new WeakReference<>(todoCardActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            TodoCardActivity todoCardActivity = this.d.get();
            if (todoCardActivity == null) {
                LogUtil.j("TodoCardActivity", "mTodoCardActivity is null");
                return;
            }
            if (i == 0 && (obj instanceof List)) {
                Message messageObtainMessage = todoCardActivity.f5739b.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = obj;
                todoCardActivity.f5739b.sendMessage(messageObtainMessage);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
