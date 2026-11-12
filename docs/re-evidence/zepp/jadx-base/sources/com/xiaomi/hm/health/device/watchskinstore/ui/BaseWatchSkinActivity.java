package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.utils.UIStandardUtilKt;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseWatchSkinActivity extends BaseTitleActivity {
    public static final String KEY_CHECKNET = "checkNetwork";
    public boolean checkNetwork;
    public View mContainer;
    public View mErrorContainer;
    public TextView mErrorTipsTv;
    private TextView x;
    private LoadingDialog y;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        p();
    }

    private void p() {
        if (!this.checkNetwork || NetUtil.isNetworkConnected(this)) {
            loadData(true);
        } else {
            IconToast.showError(this, R.string.amazfit_watch_query_failed);
            showTipsView(1);
        }
    }

    public abstract int containerId();

    public abstract int createLayout();

    public abstract int errorContainerId();

    public void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.y;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.y.dismiss();
        this.y = null;
    }

    public abstract void initData();

    public void initTipsView() {
        this.mContainer = findViewById(containerId());
        View viewFindViewById = findViewById(errorContainerId());
        this.mErrorContainer = viewFindViewById;
        if (viewFindViewById == null) {
            return;
        }
        this.mErrorTipsTv = (TextView) viewFindViewById.findViewById(R.id.error_tips_tv);
        this.x = (TextView) this.mErrorContainer.findViewById(R.id.refresh_tv);
    }

    public abstract void initView();

    public abstract void loadData(boolean z);

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(createLayout());
        UIStandardUtilKt.setUnifyTitleStyle(this, "");
        initTipsView();
        initView();
        initData();
        boolean z = getIntent() != null && getIntent().getBooleanExtra("checkNetwork", true);
        this.checkNetwork = z;
        if (!z || NetUtil.isNetworkConnected(this)) {
            loadData(true);
        } else {
            showTipsView(1);
        }
    }

    public void setData() {
        View view = this.mContainer;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.mErrorContainer;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public void setErrorView(boolean z) {
        if (z) {
            showTipsView(2);
        }
    }

    public void showLoadingDialog() {
        showLoadingDialog(true);
    }

    public void showTipsView(int i) {
        View view = this.mContainer;
        if (view == null || this.mErrorTipsTv == null || this.mErrorContainer == null) {
            return;
        }
        view.setVisibility(8);
        this.mErrorContainer.setVisibility(0);
        this.x.setVisibility(0);
        if (i == 1) {
            this.mErrorTipsTv.setText(R.string.discovery_status_retry);
            this.x.setOnClickListener(new View.OnClickListener() { // from class: hs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.o(view2);
                }
            });
        } else if (i != 2) {
            this.mErrorTipsTv.setText(R.string.watch_skin_empty);
            this.x.setVisibility(8);
        } else {
            this.mErrorTipsTv.setText(R.string.discovery_status_error);
            this.x.setOnClickListener(new View.OnClickListener() { // from class: is
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.n(view2);
                }
            });
        }
    }

    public void setErrorView() {
        setErrorView(true);
    }

    public void showLoadingDialog(boolean z) {
        showLoadingDialog(getString(R.string.loading), z);
    }

    public void showLoadingDialog(String str, boolean z) {
        if (this.y == null) {
            this.y = LoadingDialog.showDialog(this, str);
        }
        this.y.setMessage(str);
        this.y.setCancelable(z);
        this.y.show();
    }
}
