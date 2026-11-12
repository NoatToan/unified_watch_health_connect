package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.media3.common.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.todo.activity.OnItemClickListener;
import com.huawei.featureuserprofile.todo.activity.TodoSettingActivity;
import com.huawei.featureuserprofile.todo.adapter.RecyclerViewAdpater;
import com.huawei.featureuserprofile.todo.datatype.TodoSwitchSync;
import com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.todo.api.TodoDataApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cyv extends BaseDialog implements View.OnClickListener, OnItemClickListener<ikw> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f31509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f31510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f31511c;
    private Activity d;
    private HealthTextView e;
    private long f;
    private RelativeLayout g;
    private final Handler h;
    private boolean i;
    private OperationInteractorsApi j;
    private View k;
    private RecyclerViewAdpater l;
    private HealthRecycleView m;
    private View n;
    private ImageView o;
    private HealthButton p;

    static class d extends BaseHandler<cyv> {
        private d(cyv cyvVar) {
            super(cyvVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(cyv cyvVar, Message message) {
            if (message.what == 17) {
                Object obj = message.obj;
                cyvVar.c(!((obj instanceof List) && njy.b((List) obj) && njy.b(obj, ikw.class)), (List) obj);
            } else {
                if (message.what == 18) {
                    if (czv.b(BaseApplication.b())) {
                        cyvVar.g();
                        return;
                    } else {
                        cyvVar.a(true);
                        return;
                    }
                }
                LogUtil.a("TodoListDialog", "other MSG_CODE");
            }
        }
    }

    public cyv(Activity activity) {
        super(activity, R.style.DialogFullScreen, 0);
        this.i = false;
        this.f31510b = new a(this);
        this.h = new d();
        this.d = activity;
        setContentView(R.layout.activity_todo_list_layout);
        h();
        i();
        j();
    }

    /* synthetic */ void a() {
        a(true);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        TodoAnimatorUtil.d(this.m, new TodoAnimatorUtil.AnimatorFinishCallback() { // from class: czc
            @Override // com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil.AnimatorFinishCallback
            public final void dismissAll() {
                this.e.a();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.e(view)) {
            return;
        }
        int id = view.getId();
        if (id == R.id.todolist_main_layout || id == R.id.todolist_recyclerview || id == R.id.todolist_icon_clickable) {
            if (id == R.id.todolist_icon_clickable) {
                TodoAnimatorUtil.e(false, this.f31511c, null);
            }
            if (this.m.getVisibility() == 0) {
                TodoAnimatorUtil.d(this.m, new TodoAnimatorUtil.AnimatorFinishCallback() { // from class: czd
                    @Override // com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil.AnimatorFinishCallback
                    public final void dismissAll() {
                        this.f31520c.b();
                    }
                });
                return;
            } else {
                a(true);
                return;
            }
        }
        if (id == R.id.todolist_to_todo_setting) {
            czv.c(BaseApplication.b(), AnalyticsValue.HEALTH_LIFE_TODO_SETTINGS_ENTER_2040174, null, 0, 1);
            iov.d(this.d, new Intent(this.d, (Class<?>) TodoSettingActivity.class));
            return;
        }
        LogUtil.a("TodoListDialog", "Other view was clicked!");
    }

    /* synthetic */ void b() {
        a(true);
    }

    @Override // com.huawei.featureuserprofile.todo.activity.OnItemClickListener
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onItemClick(View view, int i, final ikw ikwVar) {
        if (ikwVar == null || qrs.e(view)) {
            return;
        }
        LogUtil.a("TodoListDialog", "onItemClicked, position = ", Integer.valueOf(i), ", toDoModel.getType = ", Integer.valueOf(ikwVar.l()));
        if (qrs.ab(this.d)) {
            RelativeLayout relativeLayout = this.g;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            dismiss();
        }
        if (ikwVar.l() == 1536) {
            czv.a(ikwVar);
        } else if (ikwVar.l() == 1792) {
            dlp dlpVar = (dlp) ikwVar.n();
            if (dlpVar != null) {
                d(dlpVar);
            }
        } else if (ikwVar.l() == 512) {
            a(ikwVar);
        } else if (ikwVar.l() == 768) {
            czv.a(ikwVar.c());
        } else {
            e(ikwVar);
        }
        czv.c(BaseApplication.b(), AnalyticsValue.HEALTH_LIFE_TODO_TASK_CLICK_2040172, ikwVar.o(), 0, ikwVar.l());
        if (ikwVar.l() != 512) {
            TodoAnimatorUtil.d(this.m, new TodoAnimatorUtil.AnimatorFinishCallback() { // from class: czb
                @Override // com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil.AnimatorFinishCallback
                public final void dismissAll() {
                    this.d.b(ikwVar);
                }
            });
        }
    }

    /* synthetic */ void b(ikw ikwVar) {
        a(ikwVar.l() != 1536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            ((TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class)).hideOrShowTodoFloatView(this.d, true);
        }
        dismiss();
    }

    private void e(ikw ikwVar) {
        HealthLifeTaskBean healthLifeTaskBean = ikwVar.n() instanceof HealthLifeTaskBean ? (HealthLifeTaskBean) ikwVar.n() : null;
        LogUtil.a("TodoListDialog", "Health life type todoTask ", healthLifeTaskBean);
        ffv.a(this.d, healthLifeTaskBean != null ? Uri.parse("").buildUpon().appendQueryParameter("id", String.valueOf(healthLifeTaskBean.getId())).appendQueryParameter("from", "/todoTask/TodoListActivity").build() : null);
    }

    private void a(ikw ikwVar) {
        HealthLifeTaskBean healthLifeTaskBean = ikwVar.n() instanceof HealthLifeTaskBean ? (HealthLifeTaskBean) ikwVar.n() : null;
        if (healthLifeTaskBean == null) {
            LogUtil.j("TodoListDialog", "onMeasureTaskClick healthLifeTaskBean is null ");
        } else {
            LogUtil.a("TodoListDialog", "onMeasureTaskClick todoTask ", healthLifeTaskBean.getName());
            b(healthLifeTaskBean);
        }
    }

    private void b(HealthLifeTaskBean healthLifeTaskBean) {
        TodoAnimatorUtil.d(this.m, new TodoAnimatorUtil.AnimatorFinishCallback() { // from class: cyw
            @Override // com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil.AnimatorFinishCallback
            public final void dismissAll() {
                this.e.c();
            }
        });
        ffv.b(this.d, healthLifeTaskBean, "/todoTask/TodoListActivity", (ResponseCallback<HealthLifeTaskBean>) new ResponseCallback() { // from class: cyz
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f31518a.e(i, (HealthLifeTaskBean) obj);
            }
        });
    }

    /* synthetic */ void c() {
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* synthetic */ void e(int i, HealthLifeTaskBean healthLifeTaskBean) {
        a(true);
    }

    /* synthetic */ void e() {
        a(true);
    }

    @Override // com.huawei.featureuserprofile.todo.activity.OnItemClickListener
    public void onOtherClick() {
        TodoAnimatorUtil.d(this.m, new TodoAnimatorUtil.AnimatorFinishCallback() { // from class: cza
            @Override // com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil.AnimatorFinishCallback
            public final void dismissAll() {
                this.f31519b.e();
            }
        });
    }

    private void d(final dlp dlpVar) {
        GRSManager.c(BaseApplication.b()).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: cyv.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("TodoListDialog", "GRSManager onCallBackSuccess ACTIVITY_KEY url = " + str);
                if (cyv.this.d != null && !cyv.this.d.isDestroyed() && !cyv.this.d.isFinishing()) {
                    cyv.this.j.gotoOperationActivityDetail(cyv.this.d, str, dlpVar, null);
                    czv.c(AnalyticsValue.HEALTH_HOME_TODO_CARD_DATA_2010084.value(), dlpVar);
                } else {
                    LogUtil.j("TodoListDialog", "mActivity can not use");
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("TodoListDialog", "GRSManager onCallBackFail ACTIVITY_KEY error = " + i);
            }
        });
    }

    private void h() {
        this.g = (RelativeLayout) findViewById(R.id.todolist_main_layout);
        this.m = (HealthRecycleView) findViewById(R.id.todolist_recyclerview);
        ImageView imageView = (ImageView) findViewById(R.id.todolist_icon_close);
        this.f31511c = imageView;
        TodoAnimatorUtil.e(true, imageView, null);
        View viewFindViewById = findViewById(R.id.todolist_icon_clickable);
        this.k = viewFindViewById;
        lrd.a(viewFindViewById, qre.f(R.string.accessibility_close), (Class<?>) Button.class);
        this.p = (HealthButton) findViewById(R.id.todolist_to_todo_setting);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d, 1, false);
        linearLayoutManager.setStackFromEnd(true);
        this.m.setLayoutManager(linearLayoutManager);
        this.m.b(false);
        TodoAnimatorUtil.d(this.m);
        RecyclerViewAdpater recyclerViewAdpater = new RecyclerViewAdpater();
        this.l = recyclerViewAdpater;
        this.m.setAdapter(recyclerViewAdpater);
        if (LanguageUtil.ba(BaseApplication.b())) {
            this.m.setLayoutDirection(0);
        }
        this.n = findViewById(R.id.todolist_finined_layout);
        this.f31509a = (HealthTextView) findViewById(R.id.todolist_finish_title);
        this.e = (HealthTextView) findViewById(R.id.todolist_finish_content);
        ImageView imageView2 = (ImageView) findViewById(R.id.todolist_done_anim_img);
        this.o = imageView2;
        imageView2.setAnimation(d());
    }

    private AnimationSet d() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.setDuration(1000L);
        animationSet.setInterpolator(new BounceInterpolator());
        animationSet.addAnimation(new ScaleAnimation(0.3f, 1.0f, 0.3f, 1.0f, 1, 0.5f, 1, 0.5f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        return animationSet;
    }

    private void i() {
        this.j = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        this.g.setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.l.c(this);
        this.k.setOnClickListener(this);
        this.m.addOnItemTouchListener(this.l);
    }

    private void j() {
        List<ikw> listC = czq.b().c();
        if (njy.e(listC)) {
            listC = czq.b().e();
        }
        ArrayList arrayList = new ArrayList();
        if (njy.b(listC)) {
            arrayList.addAll(listC);
        }
        TodoSwitchSync todoSwitchSyncD = czv.d(BaseApplication.b());
        czv.b(arrayList, todoSwitchSyncD, false);
        if (njy.b(arrayList) && czv.b(BaseApplication.b())) {
            int size = arrayList.size();
            czv.b(arrayList, todoSwitchSyncD, true);
            Collections.sort(arrayList, new czx(true));
            boolean zB = njy.b(arrayList);
            c(!zB, arrayList);
            if (zB) {
                return;
            }
            d(size);
            return;
        }
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        czv.c(BaseApplication.b(), AnalyticsValue.HEALTH_LIFE_TODO_TASK_CLICK_2040173, null, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (SystemClock.elapsedRealtime() - C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS > this.f) {
            czq.b().b(this.f31510b);
            this.f = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, List<ikw> list) {
        if (!z) {
            z = !czv.b(BaseApplication.b());
        }
        LogUtil.a("TodoListDialog", "showUiByStatus:", Boolean.valueOf(z));
        this.m.setVisibility(z ? 8 : 0);
        this.n.setVisibility(z ? 0 : 8);
        if (z) {
            fya.b(this.f31509a, false, false);
            fya.b(this.e, false, true);
            ImageView imageView = this.o;
            if (imageView == null || this.i == z) {
                return;
            }
            imageView.setVisibility(0);
            ImageView imageView2 = this.o;
            imageView2.startAnimation(imageView2.getAnimation());
            czv.c(BaseApplication.b(), AnalyticsValue.HEALTH_LIFE_TODO_TASK_CLICK_2040173, null, njy.b(list) ? list.size() : 0, 0);
        } else {
            this.l.b(list);
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            Iterator<ikw> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().o());
            }
            HashMap map = new HashMap(3);
            map.put(ParsedFieldTag.TASK_NAME, arrayList);
            map.put("taskNumber", Integer.valueOf(size));
            map.put("click", 1);
            lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_LIFE_TODO_LIST_EXPOSE_2040178.value(), map, 0);
        }
        this.i = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        Activity activity = this.d;
        if (activity == null) {
            return activity.isFinishing() || this.d.isDestroyed();
        }
        return false;
    }

    static class a implements IBaseResponseCallback {
        private final WeakReference<cyv> d;

        a(cyv cyvVar) {
            this.d = new WeakReference<>(cyvVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            cyv cyvVar = this.d.get();
            if (cyvVar == null || !cyvVar.f()) {
                return;
            }
            TodoSwitchSync todoSwitchSyncE = czv.e(BaseApplication.b());
            ArrayList arrayList = new ArrayList();
            List list = (List) obj;
            if (njy.b(list)) {
                arrayList.addAll(list);
            }
            czv.b(arrayList, todoSwitchSyncE, false);
            if (!njy.b(arrayList)) {
                cyvVar.a(true);
                return;
            }
            int size = arrayList.size();
            czv.b(arrayList, todoSwitchSyncE, true);
            Collections.sort(arrayList, new czx(true));
            boolean zB = njy.b(arrayList);
            cyvVar.h.obtainMessage(17, arrayList).sendToTarget();
            if (zB) {
                return;
            }
            cyvVar.d(size);
        }
    }
}
