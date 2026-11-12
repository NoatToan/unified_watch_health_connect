package com.huami.wallet.ui.helper;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.StringRes;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.WalletConfig;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.function.Supplier;
import com.huami.wallet.ui.utils.ErrorMsgUtils;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes16.dex */
public class LoadingDialogHelper {
    private final WeakReference<Activity> a;
    private LoadingDialog b;
    private Lazy<WalletDataSource> c = KoinJavaComponent.inject(WalletDataSource.class);
    private boolean d = false;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LoadingDialogHelper(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    private String c() {
        return this.a.get() == null ? "" : this.a.get().getString(R.string.wl_loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d(Resource resource) {
        return ErrorMsgUtils.parseErrorMsg(isForMi(), this.a.get(), resource, this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String e(Resource resource) {
        return ErrorMsgUtils.parseErrorMsg(isForMi(), this.a.get(), resource, this.d);
    }

    private void f(String str) {
        LoadingDialog loadingDialog = this.b;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.b.setFailed(str);
    }

    public static LoadingDialogHelper newInstance(Activity activity) {
        LoadingDialogHelper loadingDialogHelper = new LoadingDialogHelper(activity);
        loadingDialogHelper.setShowRawErrorMessage(WalletConfig.isShowMessage().invoke().booleanValue());
        return loadingDialogHelper;
    }

    public void hideLoading() {
        LoadingDialog loadingDialog = this.b;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.b.dismiss();
    }

    public boolean isForMi() {
        return this.c.getValue().isForMi();
    }

    public boolean isShowRawErrorMessage() {
        return this.d;
    }

    public void setFail(@StringRes int i) {
        if (this.a.get() == null) {
            return;
        }
        f(this.a.get().getString(i));
    }

    public void setShowRawErrorMessage(boolean z) {
        this.d = z;
    }

    public void setSuccess(@StringRes int i) {
        if (this.a.get() != null) {
            setSuccess(this.a.get().getString(i));
        }
    }

    public void showByStatus(Status status, String str, String str2, String str3) {
        if (status != null) {
            int i = a.a[status.ordinal()];
            if (i == 1) {
                showLoading(str);
            } else if (i == 2) {
                setSuccess(str2);
            } else {
                if (i != 3) {
                    return;
                }
                f(str3);
            }
        }
    }

    public void showLoading() {
        showLoading(c());
    }

    public void showOrError(Resource resource, String str, Supplier<String> supplier) {
        if (resource != null) {
            if (!TextUtils.isEmpty(resource.code) && resource.code.startsWith("http401")) {
                hideLoading();
                return;
            }
            int i = a.a[resource.status.ordinal()];
            if (i == 1) {
                showLoading(str);
            } else if (i == 2) {
                hideLoading();
            } else {
                if (i != 3) {
                    return;
                }
                f(supplier.get());
            }
        }
    }

    public void showOrErrorWithLoadingTips(final Resource resource, String str) {
        if (this.a.get() == null) {
            return;
        }
        if (resource == null) {
            hideLoading();
        } else if (TextUtils.isEmpty(resource.code) || !(resource.code.startsWith("http401") || resource.code.equals("c0007"))) {
            showOrError(resource, str, new Supplier() { // from class: xp4
                @Override // com.huami.wallet.ui.function.Supplier
                public final Object get() {
                    return this.a.e(resource);
                }
            });
        } else {
            hideLoading();
        }
    }

    public void showOrHide(Status status, String str) {
        if (status != null) {
            int i = a.a[status.ordinal()];
            if (i == 1) {
                showLoading(str);
            } else if (i == 2 || i == 3) {
                hideLoading();
            }
        }
    }

    public void showLoading(@StringRes int i) {
        showLoading(this.a.get().getString(i));
    }

    public void setSuccess(String str) {
        LoadingDialog loadingDialog = this.b;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.b.setSuccess(str);
    }

    public void showLoading(String str) {
        if (this.a.get() == null) {
            return;
        }
        if (this.b == null) {
            LoadingDialog loadingDialog = new LoadingDialog(this.a.get());
            this.b = loadingDialog;
            loadingDialog.setCancelable(false);
        }
        this.b.setMessage(str);
        if (this.b.isShowing()) {
            return;
        }
        this.b.show();
    }

    public void showOrError(final Resource resource) {
        if (this.a.get() == null) {
            return;
        }
        if (resource != null) {
            if (!TextUtils.isEmpty(resource.code) && (resource.code.startsWith("http401") || resource.code.equals("c0007"))) {
                hideLoading();
                return;
            } else {
                showOrError(resource, c(), new Supplier() { // from class: yp4
                    @Override // com.huami.wallet.ui.function.Supplier
                    public final Object get() {
                        return this.a.d(resource);
                    }
                });
                return;
            }
        }
        hideLoading();
    }
}
