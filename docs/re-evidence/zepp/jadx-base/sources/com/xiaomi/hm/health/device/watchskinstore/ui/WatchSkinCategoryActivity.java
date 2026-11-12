package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.watchskinstore.adapter.WatchSkinSectionMultiAdapter;
import com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchResult;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinPage;
import com.xiaomi.hm.health.device.watchskinstore.ui.WatchSkinCategoryActivity;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class WatchSkinCategoryActivity extends BaseWatchSkinActivity {
    private static final String C = "WatchSkinListActivity";
    public static final String KEY_CATE_ID = "categoryId";
    public static final String KEY_CATE_NAME = "categoryName";
    public static final String KEY_DEVICE = "device";
    private String A;
    private BaseQuickAdapter B;
    public int mCategoriesPage = 1;
    public HMDeviceSource mDeviceSource;
    private RecyclerView z;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult B() throws Exception {
        return WatchSkinApi.loadWatchSkinByCategory(String.valueOf(this.mDeviceSource.getValue()), this.A, this.mCategoriesPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(boolean z) {
        if (z) {
            showLoadingDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(boolean z, WatchResult watchResult) {
        hideLoadingDialog();
        WatchSkinPage watchSkinPage = (WatchSkinPage) watchResult.getData();
        if (!watchResult.isSuccessful() || watchSkinPage == null) {
            setErrorView(z);
        } else {
            setData(z, watchResult.isMoreEnd(), watchSkinPage.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Throwable th) {
        HMLog.error(C, "", th, new Function0() { // from class: qh8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WatchSkinCategoryActivity.E();
            }
        });
    }

    public static void launchListActivity(Activity activity, HMDeviceSource hMDeviceSource, int i, String str) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) WatchSkinCategoryActivity.class);
        intent.putExtra("device", hMDeviceSource);
        intent.putExtra("categoryName", str);
        intent.putExtra("categoryId", String.valueOf(i));
        activity.startActivity(intent);
    }

    private void x() {
        this.z.setAdapter(this.B);
        this.B.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: nh8
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.z(baseQuickAdapter, view, i);
            }
        });
    }

    private void y() {
        this.z.setLayoutManager(new GridLayoutManager(this, 3));
        WatchSkinSectionMultiAdapter watchSkinSectionMultiAdapter = new WatchSkinSectionMultiAdapter(this, R.layout.watch_skin_grid_item, null);
        this.B = watchSkinSectionMultiAdapter;
        watchSkinSectionMultiAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: oh8
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
            public final void onLoadMoreRequested() {
                this.a.A();
            }
        }, this.z);
        this.B.setLoadMoreView(new WatchSkinLoadMoreView());
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Object item = baseQuickAdapter.getItem(i);
        if (item instanceof WatchSkinBean) {
            WatchSkinBean watchSkinBean = (WatchSkinBean) item;
            WatchSkinDetailActivity.launchDetailActivity(this, this.mDeviceSource, watchSkinBean.getId(), watchSkinBean.getName());
        }
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int containerId() {
        return R.id.rv_list;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int createLayout() {
        return R.layout.activity_watch_skin_cate;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public int errorContainerId() {
        return R.id.error_container;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void initData() {
        Intent intent = getIntent();
        String stringExtra = intent == null ? null : intent.getStringExtra("categoryId");
        this.A = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        } else {
            this.mDeviceSource = (HMDeviceSource) intent.getSerializableExtra("device");
            setTitleText(intent.getStringExtra("categoryName"));
        }
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void initView() {
        this.z = (RecyclerView) findViewById(R.id.rv_list);
        y();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void loadData(final boolean z) {
        if (z) {
            this.mCategoriesPage = 1;
        } else {
            this.mCategoriesPage++;
        }
        Observable.fromCallable(new Callable() { // from class: ph8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.B();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: rh8
            @Override // rx.functions.Action0
            public final void call() {
                this.a.C(z);
            }
        }).subscribe(new Action1() { // from class: sh8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.D(z, (WatchResult) obj);
            }
        }, new Action1() { // from class: th8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatchSkinCategoryActivity.F((Throwable) obj);
            }
        });
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

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinActivity
    public void setErrorView(boolean z) {
        if (z) {
            super.setErrorView();
        } else {
            this.B.loadMoreFail();
        }
    }
}
