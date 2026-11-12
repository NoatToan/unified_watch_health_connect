package com.xiaomi.hm.health.lab.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.LabAction;
import com.xiaomi.hm.health.databases.model.LabActionDao;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.activity.BehaviorTagsHistoryActivity;
import com.xiaomi.hm.health.lab.adapter.BehaviorTagsHistoryAdapter;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.model.BehaviorTagHistory;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import com.xiaomi.hm.health.lab.utils.StatEvent;
import de.greenrobot.event.EventBus;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTagsHistoryActivity extends BaseTitleActivity implements BehaviorTaggingWebApi.OnDeleteItemListener {
    private static final String J = "BehaviorTagsHistoryActivity";
    private static final int K = 20;
    private ListView A;
    private SmartRefreshLayout B;
    private BehaviorTagsHistoryAdapter C;
    private List<LabAction> E;
    private LoadingDialog G;
    private Disposable H;
    private LoadingDialog I;
    private ImageView x;
    private TextView y;
    private View z;
    private long D = 0;
    private boolean F = false;

    public class a implements OnRefreshLoadmoreListener {
        public a() {
        }

        @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
        public void onLoadmore(RefreshLayout refreshLayout) {
            BehaviorTagsHistoryActivity.this.i0(20, false);
        }

        @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
        public void onRefresh(RefreshLayout refreshLayout) {
            refreshLayout.setLoadmoreFinished(false);
            BehaviorTagsHistoryActivity.this.E.clear();
            BehaviorTagsHistoryActivity.this.E.addAll(BehaviorTagsHistoryActivity.this.k0());
            BehaviorTagsHistoryActivity.this.D = 0L;
            BehaviorTagsHistoryActivity.this.i0(20, true);
        }
    }

    public class b implements BehaviorTagsHistoryAdapter.OnItemClickListener {
        public b() {
        }

        @Override // com.xiaomi.hm.health.lab.adapter.BehaviorTagsHistoryAdapter.OnItemClickListener
        public void onItemLongClick(View view, LabAction labAction, int i) {
            BehaviorTagsHistoryActivity.this.o0(labAction);
        }

        @Override // com.xiaomi.hm.health.lab.adapter.BehaviorTagsHistoryAdapter.OnItemClickListener
        public void onItemUploadClick(View view, LabAction labAction, int i) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.LAB_ACTION_LAB_UPLOAD));
            NetUtil netUtil = NetUtil.INSTANCE;
            if (!netUtil.networkInfo().isNetworkConnect()) {
                IconToast.showError(BehaviorTagsHistoryActivity.this, R.string.no_network_connection);
            } else if (netUtil.networkInfo().isWifiConnected()) {
                new BehaviorTaggingWebApi().behaviorTaggingDataUpload(BehaviorTagsHistoryActivity.this, labAction);
            } else {
                BehaviorTagsHistoryActivity.this.q0(labAction);
            }
        }
    }

    private void K(List<LabAction> list, boolean z) {
        this.H = Flowable.fromIterable(list).doOnNext(new Consumer() { // from class: au
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BehaviorTagsHistoryActivity.P((LabAction) obj);
            }
        }).doOnComplete(new Action() { // from class: nu
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.Q();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: zt
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BehaviorTagsHistoryActivity.R((LabAction) obj);
            }
        }, new Consumer() { // from class: ou
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.T((Throwable) obj);
            }
        }, new Action() { // from class: mu
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.U();
            }
        });
    }

    private void L(final LabAction labAction) {
        final QueryBuilder<LabAction> queryBuilder = HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder();
        Flowable.just(queryBuilder).map(new Function() { // from class: cu
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BehaviorTagsHistoryActivity.V(labAction, (QueryBuilder) obj);
            }
        }).subscribeOn(Schedulers.io()).doOnNext(new Consumer() { // from class: yt
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BehaviorTagsHistoryActivity.W(queryBuilder, (LabAction) obj);
            }
        }).doOnComplete(new Action() { // from class: lu
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.X();
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: bu
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BehaviorTagsHistoryActivity.Y((LabAction) obj);
            }
        }, new Consumer() { // from class: xt
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.a0((Throwable) obj);
            }
        }, new Action() { // from class: ku
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.b0();
            }
        });
    }

    private void M() {
        l0();
        m0();
    }

    private void N() {
        UIHelper.setUnifyTitleStyle(this, getString(R.string.history), null);
        this.x = (ImageView) findViewById(R.id.imv_history_result_icon);
        this.y = (TextView) findViewById(R.id.tx_history_result_tip);
        this.z = findViewById(R.id.empty_layout);
        this.A = (ListView) findViewById(R.id.list_view);
        this.B = (SmartRefreshLayout) findViewById(R.id.refresh_layout);
        this.E = k0();
        O();
        if (this.E.size() > 0) {
            m0();
        }
    }

    private void O() {
        this.B.setEnableRefresh(true);
        this.B.setEnableLoadmore(true);
        this.B.setEnableLoadmoreWhenContentNotFull(true);
        this.B.setOnRefreshLoadmoreListener((OnRefreshLoadmoreListener) new a());
        this.A.setFadingEdgeLength(0);
        BehaviorTagsHistoryAdapter behaviorTagsHistoryAdapter = new BehaviorTagsHistoryAdapter(this, null);
        this.C = behaviorTagsHistoryAdapter;
        this.A.setAdapter((ListAdapter) behaviorTagsHistoryAdapter);
        this.C.setOnItemClickListener(new b());
        this.B.autoRefresh(500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(LabAction labAction) throws Exception {
        QueryBuilder<LabAction> queryBuilder = HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder();
        Property property = LabActionDao.Properties.StartBehaviorTime;
        WhereCondition whereConditionEq = property.eq(labAction.getStartBehaviorTime());
        Property property2 = LabActionDao.Properties.EndBehaviorTime;
        Property property3 = LabActionDao.Properties.DeviceId;
        Property property4 = LabActionDao.Properties.UserId;
        Property property5 = LabActionDao.Properties.UploadStatus;
        if (queryBuilder.where(whereConditionEq, property2.eq(labAction.getEndBehaviorTime()), property3.eq(labAction.getDeviceId()), property4.eq(labAction.getUserId()), property5.notEq(3)).count() == 0) {
            HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(property.eq(labAction.getStartBehaviorTime()), property2.eq(labAction.getEndBehaviorTime()), property3.eq(labAction.getDeviceId()), property4.eq(labAction.getUserId()), property5.eq(3)).buildDelete().executeDeleteWithoutDetachingEntities();
            HMDaoManager.getInstance().getDaoSession().getLabActionDao().insertOrReplace(labAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() throws Exception {
        this.E = k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(LabAction labAction) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S(Throwable th) {
        return "dealLabActionsFromWeb error:" + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(final Throwable th) throws Exception {
        HMLog.info(J, new Function0() { // from class: du
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BehaviorTagsHistoryActivity.S(th);
            }
        });
        n0();
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() throws Exception {
        n0();
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LabAction V(LabAction labAction, QueryBuilder queryBuilder) throws Exception {
        return (LabAction) queryBuilder.where(LabActionDao.Properties.StartBehaviorTime.eq(labAction.getStartBehaviorTime()), LabActionDao.Properties.EndBehaviorTime.eq(labAction.getEndBehaviorTime()), LabActionDao.Properties.DeviceId.eq(labAction.getDeviceId()), LabActionDao.Properties.UserId.eq(labAction.getUserId())).unique();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(QueryBuilder queryBuilder, LabAction labAction) throws Exception {
        queryBuilder.buildDelete().executeDeleteWithoutDetachingEntities();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() throws Exception {
        List<LabAction> listK0 = k0();
        this.E = listK0;
        BehaviorTaggingTools.resetBehaviorTaggingCountInSpf(this, listK0);
        new BehaviorTaggingWebApi().postBehaviorCount(BehaviorTaggingTools.getBehaviorTagCountJson(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(LabAction labAction) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Z(Throwable th) {
        return "deleteLocalLabAction error:" + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(final Throwable th) throws Exception {
        HMLog.info(J, new Function0() { // from class: eu
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BehaviorTagsHistoryActivity.Z(th);
            }
        });
        hideProgressDialog();
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0() throws Exception {
        hideProgressDialog();
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c0() {
        return "labs 从网络加载更多数据";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(LabAction labAction, DialogInterface dialogInterface, int i) {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            p0("");
        }
        BehaviorTaggingWebApi behaviorTaggingWebApi = new BehaviorTaggingWebApi();
        behaviorTaggingWebApi.setOnDeleteItemListener(this);
        behaviorTaggingWebApi.deleteBehaviorTaggingHistory(this, labAction);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(LabAction labAction, DialogInterface dialogInterface, int i) {
        new BehaviorTaggingWebApi().behaviorTaggingDataUpload(this, labAction);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(DialogInterface dialogInterface) {
    }

    private void hideProgressDialog() {
        LoadingDialog loadingDialog = this.I;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.I.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i, boolean z) {
        HMLog.info(J, new Function0() { // from class: fu
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BehaviorTagsHistoryActivity.c0();
            }
        });
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            new BehaviorTaggingWebApi().queryBehaviorTaggingHistory(LabCallbackInit.getInitCallBack().getUserId(), i, this.D, z);
            return;
        }
        this.F = true;
        IconToast.showError(this, R.string.no_network_connection);
        M();
    }

    private void j0(int i) {
        LoadingDialog loadingDialog = this.G;
        if (loadingDialog != null) {
            loadingDialog.setFailed(getString(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<LabAction> k0() {
        List<LabAction> list = HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(LabActionDao.Properties.UploadStatus.notIn(21, -2), LabActionDao.Properties.UserId.eq(LabCallbackInit.getInitCallBack().getUserId())).orderDesc(LabActionDao.Properties.StartBehaviorTime).list();
        if (list == null || list.size() == 0) {
            return new ArrayList();
        }
        LabAction labAction = list.get(list.size() - 1);
        if (labAction.getStartBehaviorTime() == null) {
            return list;
        }
        this.D = labAction.getStartBehaviorTime().longValue();
        return list;
    }

    private void l0() {
        this.B.finishRefresh();
        this.B.finishLoadmore();
    }

    private void m0() {
        if (this.E.size() > 0) {
            this.z.setVisibility(8);
            this.A.setVisibility(0);
            this.C.setLabActions(this.E);
            return;
        }
        this.z.setVisibility(0);
        this.A.setVisibility(8);
        if (this.F) {
            this.y.setText(R.string.get_history_error_refresh_please);
            this.x.setImageResource(R.drawable.img_query_behavior_history_fail);
        } else {
            this.x.setImageResource(R.drawable.img_mark_history_none);
            this.y.setText(R.string.no_behavior_tagging_history);
        }
    }

    private void n0() {
        BehaviorTaggingTools.resetBehaviorTaggingCountInSpf(this, this.E);
        new BehaviorTaggingWebApi().postBehaviorCount(BehaviorTaggingTools.getBehaviorTagCountJson(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(final LabAction labAction) {
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.delete_verify).setPositiveButton(R.string.btn_confirm, new DialogInterface.OnClickListener() { // from class: wt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.d0(labAction, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: hu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show(getSupportFragmentManager());
    }

    private void p0(String str) {
        LoadingDialog loadingDialog = this.I;
        if (loadingDialog == null) {
            this.I = LoadingDialog.showDialog(this);
        } else {
            loadingDialog.show();
        }
        this.I.setCancelable(false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.I.setMessage(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(final LabAction labAction) {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.upload_force_marking_wifi_status).setPositiveButton(R.string.btn_confirm, new DialogInterface.OnClickListener() { // from class: gu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.f0(labAction, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: iu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ju
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                BehaviorTagsHistoryActivity.h0(dialogInterface);
            }
        }).show(getSupportFragmentManager());
    }

    private void r0() {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(getApplicationContext(), getApplicationContext().getString(R.string.running_delete_record_server_result_fail));
        } else {
            IconToast.showError(getApplicationContext(), getApplicationContext().getString(R.string.no_network_connection));
        }
    }

    private void s0(int i) {
        if (this.G == null) {
            this.G = LoadingDialog.showDialog(this, getString(i));
        }
        this.G.setCancelable(false);
        this.G.setMessage(getString(i));
        this.G.show();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_action_mark_history);
        N();
    }

    @Override // com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi.OnDeleteItemListener
    public void onDeleteFailure() {
        hideProgressDialog();
        r0();
    }

    @Override // com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi.OnDeleteItemListener
    public void onDeleteSuccess(LabAction labAction) {
        L(labAction);
        this.B.setLoadmoreFinished(true);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Disposable disposable = this.H;
        if (disposable != null && !disposable.isDisposed()) {
            this.H.dispose();
        }
        super.onDestroy();
    }

    public void onEventMainThread(BehaviorTagHistory behaviorTagHistory) {
        int restCode = behaviorTagHistory.getRestCode();
        if (restCode != 1) {
            if (restCode == 2 || restCode == 4) {
                this.F = true;
                CustomToast.makeText(this, R.string.load_fail, 0).show();
                M();
                return;
            }
            return;
        }
        this.F = false;
        List<LabAction> labActionList = behaviorTagHistory.getLabActionList();
        K(labActionList, behaviorTagHistory.isRefresh());
        if (labActionList.size() >= 20 || this.E.size() <= 0) {
            return;
        }
        this.B.setLoadmoreFinished(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        EventBus.getDefault().register(this);
    }

    public void updateStatus(LabAction labAction, int i) {
        if (3 == labAction.getUploadStatus().intValue()) {
            for (LabAction labAction2 : this.E) {
                Long labActionId = labAction.getLabActionId();
                Long labActionId2 = labAction2.getLabActionId();
                if (labActionId != null && labActionId2 != null && labActionId.longValue() == labActionId2.longValue()) {
                    labAction2.setUploadStatus(labAction.getUploadStatus());
                }
            }
        }
        this.C.notifyDataSetChanged();
        labAction.setUploadStatus(Integer.valueOf(i));
        HMDaoManager.getInstance().getDaoSession().getLabActionDao().insertOrReplace(labAction);
    }

    public void onEventMainThread(LabAction labAction) {
        int iIntValue = labAction.getUploadStatus().intValue();
        if (iIntValue == 1) {
            s0(R.string.lab_uploading);
            return;
        }
        if (iIntValue == 2) {
            updateStatus(labAction, 2);
            j0(R.string.lab_upload_fail);
            return;
        }
        if (iIntValue == 3) {
            updateStatus(labAction, 3);
            this.G.setSuccess(getString(R.string.lab_upload_success));
        } else if (iIntValue == 5) {
            j0(R.string.lab_upload_cancel);
        } else {
            if (iIntValue != 21) {
                return;
            }
            updateStatus(labAction, 21);
            j0(R.string.lab_data_missing);
        }
    }
}
