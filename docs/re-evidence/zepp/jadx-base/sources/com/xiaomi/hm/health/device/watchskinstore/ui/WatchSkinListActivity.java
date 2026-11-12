package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper;
import com.xiaomi.hm.health.device.watchskinstore.adapter.WatchSkinSectionMultiAdapter;
import com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi;
import com.xiaomi.hm.health.device.watchskinstore.bean.ReLoadEvent;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchResult;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinPage;
import com.xiaomi.hm.health.device.watchskinstore.ui.WatchSkinListActivity;
import de.greenrobot.event.EventBus;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class WatchSkinListActivity extends BaseWatchSkinActivity {
    private static final String C = "WatchSkinListActivity";
    public static final int CATE_COLLECT = -1;
    public static final int CATE_LOCAL = -2;
    public static final String KEY_CATE_ID = "categoryId";
    public static final String KEY_CATE_NAME = "categoryName";
    public static final String KEY_DEVICE = "device";
    private int A;
    private BaseQuickAdapter B;
    public HMDeviceSource mDeviceSource;
    public int mPage = 1;
    private RecyclerView z;

    public class a extends Subscriber<WatchResult<Boolean>> {
        public final /* synthetic */ int f;

        public a(int i) {
            this.f = i;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(WatchResult<Boolean> watchResult) {
            WatchSkinListActivity.this.hideLoadingDialog();
            HMLog.d(WatchSkinListActivity.C, "deleteRecord:" + watchResult, new Object[0]);
            if (!watchResult.isSuccessful() || !watchResult.getData().booleanValue()) {
                WatchSkinListActivity.this.V();
            } else {
                HMLog.d(WatchSkinListActivity.C, "deleteRecord:SUCCESS!!!", new Object[0]);
                WatchSkinListActivity.this.B.remove(this.f);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            WatchSkinListActivity.this.hideLoadingDialog();
            HMLog.d(WatchSkinListActivity.C, "deleteRecord:ERROR!!!" + th, new Object[0]);
            WatchSkinListActivity.this.V();
        }
    }

    private void E(int i) {
        final WatchSkinBean watchSkinBean = (WatchSkinBean) this.B.getItem(i);
        if (watchSkinBean.getIsHeader()) {
            return;
        }
        Observable.fromCallable(new Callable() { // from class: qk8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.I(watchSkinBean);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: ek8
            @Override // rx.functions.Action0
            public final void call() {
                this.a.J();
            }
        }).subscribe((Subscriber) new a(i));
    }

    private void F() {
        WatchSkinSectionMultiAdapter watchSkinSectionMultiAdapter = new WatchSkinSectionMultiAdapter(this, R.layout.watch_skin_grid_item, null);
        this.B = watchSkinSectionMultiAdapter;
        watchSkinSectionMultiAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: ok8
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
            public final void onLoadMoreRequested() {
                this.a.K();
            }
        }, this.z);
        this.B.setLoadMoreView(new WatchSkinLoadMoreView());
        this.z.setAdapter(this.B);
        this.B.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: mk8
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.L(baseQuickAdapter, view, i);
            }
        });
        this.B.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: nk8
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                return this.a.M(baseQuickAdapter, view, i);
            }
        });
    }

    private View G() {
        return getLayoutInflater().inflate(R.layout.watch_skin_collect_header, (ViewGroup) this.z, false);
    }

    private void H() {
        this.z.setLayoutManager(new GridLayoutManager(this, 3));
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult I(WatchSkinBean watchSkinBean) throws Exception {
        return WatchSkinHelper.deleteDownloadRecord(this, watchSkinBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        showLoadingDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Object item = baseQuickAdapter.getItem(i);
        if (item instanceof WatchSkinBean) {
            WatchSkinBean watchSkinBean = (WatchSkinBean) item;
            boolean isLocal = watchSkinBean.getIsLocal();
            WatchSkinDetailActivity.launchDetailActivity(this, this.mDeviceSource, isLocal ? watchSkinBean.getDownloadUrl() : String.valueOf(watchSkinBean.getId()), watchSkinBean.getName(), isLocal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult N() throws Exception {
        int i = this.A;
        if (i == -2) {
            return WatchSkinHelper.loadLocalWatchSkinPage(this, this.mPage);
        }
        return i == -1 ? WatchSkinApi.loadCollectWatchSkin(String.valueOf(this.mDeviceSource.getValue()), this.mPage) : WatchSkinApi.loadWatchSkinByCategory(String.valueOf(this.mDeviceSource.getValue()), String.valueOf(this.A), this.mPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(boolean z) {
        if (z) {
            showLoadingDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(boolean z, WatchResult watchResult) {
        hideLoadingDialog();
        WatchSkinPage watchSkinPage = (WatchSkinPage) watchResult.getData();
        if (!watchResult.isSuccessful() || watchSkinPage == null) {
            setErrorView(z);
        } else {
            setData(z, watchResult.isMoreEnd(), watchSkinPage.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(Throwable th) {
        HMLog.error(C, "", th, new Function0() { // from class: dk8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchSkinListActivity.Q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(int i, DialogInterface dialogInterface, int i2) {
        E(i);
        dialogInterface.dismiss();
    }

    private void U(final int i) {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.running_delete_record_title).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: lk8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: kk8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.T(i, dialogInterface, i2);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        IconToast.showError(getApplicationContext(), getApplicationContext().getString(R.string.watch_skin_delete_record_failed));
    }

    public static void launchListActivity(Activity activity, HMDeviceSource hMDeviceSource, int i, String str) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) WatchSkinListActivity.class);
        intent.putExtra("device", hMDeviceSource);
        intent.putExtra("categoryName", str);
        intent.putExtra("categoryId", i);
        intent.putExtra("checkNetwork", i != -2);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int containerId() {
        return R.id.rv_list;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int createLayout() {
        return R.layout.activity_skin_list;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int errorContainerId() {
        return R.id.error_container;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void initData() {
        Intent intent = getIntent();
        HMDeviceSource hMDeviceSource = intent == null ? null : (HMDeviceSource) intent.getSerializableExtra("device");
        this.mDeviceSource = hMDeviceSource;
        if (hMDeviceSource == null) {
            finish();
            return;
        }
        this.A = intent.getIntExtra("categoryId", -1);
        setTitleText(intent.getStringExtra("categoryName"));
        if (this.A == -2) {
            this.B.addHeaderView(G());
        }
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void initView() {
        this.z = (RecyclerView) findViewById(R.id.rv_list);
        H();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void loadData(final boolean z) {
        if (z) {
            this.mPage = 1;
        } else {
            this.mPage++;
        }
        Observable.fromCallable(new Callable() { // from class: pk8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.N();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: fk8
            @Override // rx.functions.Action0
            public final void call() {
                this.a.O(z);
            }
        }).subscribe(new Action1() { // from class: gk8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.P(z, (WatchResult) obj);
            }
        }, new Action1() { // from class: hk8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinListActivity.R((Throwable) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.getDefault().registerSticky(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(ReLoadEvent reLoadEvent) {
        loadData(reLoadEvent.isRefresh());
    }

    public void setData(boolean z, boolean z2, List list) {
        boolean z3 = list == null || list.size() == 0;
        if (z && z3) {
            showTipsView(0);
            return;
        }
        super.setData();
        if (z) {
            this.B.setNewData(list);
        } else {
            this.B.addData((Collection) list);
        }
        if (z2) {
            this.B.loadMoreEnd();
        } else {
            this.B.loadMoreComplete();
        }
    }
}
