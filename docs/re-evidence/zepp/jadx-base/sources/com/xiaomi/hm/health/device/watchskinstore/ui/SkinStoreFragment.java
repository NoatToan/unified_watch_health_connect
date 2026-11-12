package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper;
import com.xiaomi.hm.health.device.watchskinstore.adapter.WatchSkinCategoryAdapter;
import com.xiaomi.hm.health.device.watchskinstore.adapter.WatchSkinSectionMultiAdapter;
import com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchResult;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinCategory;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinPage;
import com.xiaomi.hm.health.device.watchskinstore.ui.SkinStoreFragment;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class SkinStoreFragment extends BaseWatchSkinFragment {
    public static final String TAG = "SkinStoreFragment";
    public int mCategoriesPage = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(Throwable th) {
        HMLog.error(TAG, "", th, new Function0() { // from class: iw6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return SkinStoreFragment.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(boolean z, WatchResult watchResult) {
        hideLoadingDialog();
        WatchSkinPage watchSkinPage = (WatchSkinPage) watchResult.getData();
        if (!watchResult.isSuccessful() || watchSkinPage == null) {
            setErrorView(z);
        } else {
            setData(z, watchResult.isMoreEnd(), watchSkinPage.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(Throwable th) {
        HMLog.error(TAG, "", th, new Function0() { // from class: jw6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return SkinStoreFragment.C();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult E(int i) throws Exception {
        return WatchSkinApi.loadWatchSkinByCategory(String.valueOf(this.mDeviceSource.getValue()), String.valueOf(i), this.mCategoriesPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(boolean z) {
        if (z) {
            showLoadingDialog();
        }
    }

    private void G(final boolean z, final int i) {
        if (z) {
            this.mCategoriesPage = 1;
        } else {
            this.mCategoriesPage++;
        }
        Observable.fromCallable(new Callable() { // from class: hw6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.E(i);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: lw6
            @Override // rx.functions.Action0
            public final void call() {
                this.a.F(z);
            }
        }).subscribe(new Action1() { // from class: mw6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.B(z, (WatchResult) obj);
            }
        }, new Action1() { // from class: ow6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SkinStoreFragment.D((Throwable) obj);
            }
        });
    }

    public static SkinStoreFragment newInstance(HMDeviceSource hMDeviceSource) {
        return newInstance(hMDeviceSource, null);
    }

    private void r(final int i) {
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 3));
        WatchSkinSectionMultiAdapter watchSkinSectionMultiAdapter = new WatchSkinSectionMultiAdapter(this.mContext, R.layout.watch_skin_grid_item, null);
        this.mAdapter = watchSkinSectionMultiAdapter;
        watchSkinSectionMultiAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: fw6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
            public final void onLoadMoreRequested() {
                this.a.t(i);
            }
        }, this.mRecyclerView);
        s();
    }

    private void s() {
        initLoadMoreView();
        this.mRecyclerView.setAdapter(this.mAdapter);
        this.mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: xw6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.u(baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(int i) {
        G(false, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Object item = baseQuickAdapter.getItem(i);
        if (item instanceof WatchSkinBean) {
            WatchSkinBean watchSkinBean = (WatchSkinBean) item;
            if (watchSkinBean.getItemType() != 2) {
                WatchSkinDetailActivity.launchDetailActivity(getActivity(), this.mDeviceSource, watchSkinBean.getId(), watchSkinBean.getName());
                return;
            }
            WatchSkinListActivity.launchListActivity(getActivity(), this.mDeviceSource, watchSkinBean.getId(), watchSkinBean.getName());
            HashMap map = new HashMap();
            map.put("Type", watchSkinBean.getName());
            WatchSkinHelper.analyticCount("WF_More_Click", this.mDeviceSource.getValue(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult w() throws Exception {
        return WatchSkinApi.loadAllWatchSkin(String.valueOf(this.mDeviceSource.getValue()), this.mPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(boolean z) {
        if (z) {
            showLoadingDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(boolean z, WatchResult watchResult) {
        hideLoadingDialog();
        if (!watchResult.isSuccessful()) {
            setErrorView(z);
            return;
        }
        List list = (List) watchResult.getData();
        if ((list == null ? 0 : list.size()) != 1) {
            setData(z, watchResult.isMoreEnd(), list);
            return;
        }
        WatchSkinCategory watchSkinCategory = (WatchSkinCategory) list.get(0);
        List<WatchSkinBean> data = watchSkinCategory.getData();
        r(watchSkinCategory.getCategoryId());
        setData(z, watchResult.isMoreEnd(), data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "";
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment
    public int createLayout() {
        return R.layout.fragment_skin_store;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment
    public void initRecycleView() {
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        WatchSkinCategoryAdapter watchSkinCategoryAdapter = new WatchSkinCategoryAdapter(this.mContext, R.layout.watch_skin_store_item, (int) ViewUtils.dp2px(this.mContext, 10.0f));
        this.mAdapter = watchSkinCategoryAdapter;
        watchSkinCategoryAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: yw6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
            public final void onLoadMoreRequested() {
                this.a.v();
            }
        }, this.mRecyclerView);
        s();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment
    public void loadData(final boolean z) {
        this.mRecyclerView.setVisibility(0);
        this.mErrorContainer.setVisibility(8);
        if (z) {
            this.mPage = 1;
        } else {
            this.mPage++;
        }
        Observable.fromCallable(new Callable() { // from class: gw6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.w();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: kw6
            @Override // rx.functions.Action0
            public final void call() {
                this.a.x(z);
            }
        }).subscribe(new Action1() { // from class: nw6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.y(z, (WatchResult) obj);
            }
        }, new Action1() { // from class: qw6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SkinStoreFragment.A((Throwable) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WatchSkinHelper.analyticCount("WF_Store_ViewNum", this.mDeviceSource.getValue());
    }

    public static SkinStoreFragment newInstance(HMDeviceSource hMDeviceSource, String str) {
        SkinStoreFragment skinStoreFragment = new SkinStoreFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(BaseWatchSkinFragment.ARG_PARAM1, hMDeviceSource);
        bundle.putString(BaseWatchSkinFragment.ARG_PARAM2, str);
        skinStoreFragment.setArguments(bundle);
        return skinStoreFragment;
    }
}
