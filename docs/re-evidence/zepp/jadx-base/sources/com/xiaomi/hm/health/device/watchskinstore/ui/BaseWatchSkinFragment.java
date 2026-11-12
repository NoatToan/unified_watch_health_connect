package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig;
import com.xiaomi.hm.health.device.watchskinstore.config.DialsConfigManager;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseWatchSkinFragment extends Fragment {
    public static final String ARG_PARAM1 = "param1";
    public static final String ARG_PARAM2 = "param2";
    public static final String TAG = "BaseWatchSkinFragment";
    private String a;
    private TextView b;
    private LoadingDialog c;
    public DeviceDialsConfig dialsConfig;
    public BaseQuickAdapter mAdapter;
    public Context mContext;
    public HMDeviceSource mDeviceSource;
    public View mErrorContainer;
    public TextView mErrorTipsTv;
    public int mPage = 1;
    public RecyclerView mRecyclerView;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        retryLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        retryLoad();
    }

    private void retryLoad() {
        if (NetUtil.isNetworkConnected(this.mContext)) {
            loadData(true);
        } else {
            IconToast.showError(this.mContext, R.string.amazfit_watch_query_failed);
            showTipsView(1);
        }
    }

    public abstract int createLayout();

    public void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.c;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.c.dismiss();
        this.c = null;
    }

    public void initData() {
        if (NetUtil.isNetworkConnected(getContext())) {
            loadData(true);
        } else {
            showTipsView(1);
        }
    }

    public void initLoadMoreView() {
        this.mAdapter.setLoadMoreView(new WatchSkinLoadMoreView());
    }

    public abstract void initRecycleView();

    public void initView(View view) {
        this.mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
        this.mErrorContainer = view.findViewById(R.id.error_container);
        this.mErrorTipsTv = (TextView) view.findViewById(R.id.error_tips_tv);
        this.b = (TextView) view.findViewById(R.id.refresh_tv);
        initRecycleView();
    }

    public abstract void loadData(boolean z);

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            HMDeviceSource hMDeviceSource = (HMDeviceSource) getArguments().getSerializable(ARG_PARAM1);
            this.mDeviceSource = hMDeviceSource;
            this.dialsConfig = DialsConfigManager.INSTANCE.getDialsConfig(hMDeviceSource);
            this.a = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(createLayout(), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
        if (this.mDeviceSource == null) {
            HMLog.i(TAG, "DeviceSource is NULL!!!", new Object[0]);
        } else {
            initData();
        }
    }

    public void setData(boolean z, boolean z2, List list) {
        boolean z3 = list == null || list.size() == 0;
        if (z && z3) {
            showTipsView(!NetUtil.isNetworkConnected(getContext()) ? 1 : 0);
            return;
        }
        this.mErrorContainer.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
        if (z) {
            this.mAdapter.setNewData(list);
        } else {
            this.mAdapter.addData((Collection) list);
        }
        if (z2) {
            this.mAdapter.loadMoreEnd();
        } else {
            this.mAdapter.loadMoreComplete();
        }
    }

    public void setErrorView(boolean z) {
        if (z) {
            showTipsView(2);
        } else {
            this.mAdapter.loadMoreFail();
        }
    }

    public void showLoadingDialog() {
        if (this.c == null) {
            this.c = LoadingDialog.showDialog(this.mContext, getString(R.string.loading));
        }
        this.c.setMessage(getString(R.string.loading));
        this.c.setCancelable(true);
        this.c.show();
    }

    public void showTipsView(int i) {
        this.mRecyclerView.setVisibility(8);
        this.mErrorContainer.setVisibility(0);
        this.b.setVisibility(0);
        if (i == 1) {
            this.mErrorTipsTv.setText(R.string.discovery_status_retry);
            this.b.setOnClickListener(new View.OnClickListener() { // from class: js
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d(view);
                }
            });
        } else if (i != 2) {
            this.mErrorTipsTv.setText(R.string.watch_skin_empty);
            this.b.setVisibility(8);
        } else {
            this.mErrorTipsTv.setText(R.string.discovery_status_error);
            this.b.setOnClickListener(new View.OnClickListener() { // from class: ks
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c(view);
                }
            });
        }
    }
}
