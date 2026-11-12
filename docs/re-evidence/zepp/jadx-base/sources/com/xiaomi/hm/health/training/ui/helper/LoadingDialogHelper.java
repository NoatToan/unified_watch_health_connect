package com.xiaomi.hm.health.training.ui.helper;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.training.utils.UiErrorMsgParser;

/* JADX INFO: loaded from: classes21.dex */
public class LoadingDialogHelper {
    private Activity a;
    private LoadingDialog b;

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
        this.a = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        return this.a.getString(R.string.loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String f(Resource resource) {
        return UiErrorMsgParser.parseMessage(this.a, resource.getCode(), resource.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(String str) {
        return str;
    }

    private void i(@NonNull String str) {
        if (this.b == null) {
            LoadingDialog loadingDialog = new LoadingDialog(this.a);
            this.b = loadingDialog;
            loadingDialog.setCancelable(false);
        }
        this.b.setMessage(str);
        if (this.b.isShowing()) {
            return;
        }
        this.b.show();
    }

    public void hideLoading() {
        LoadingDialog loadingDialog = this.b;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.b.dismiss();
    }

    public void setFail(@StringRes int i) {
        setFail(this.a.getString(i));
    }

    public void setSuccess(@StringRes int i) {
        setSuccess(this.a.getString(i));
    }

    public void showLoading() {
        i(e());
    }

    public void showOrError(@Nullable final Resource<?> resource) {
        if (resource == null) {
            return;
        }
        showOrError(resource.getStatus(), new Supplier() { // from class: zp4
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return this.a.e();
            }
        }, new Supplier() { // from class: aq4
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return this.a.f(resource);
            }
        });
    }

    public void showOrHide(@Nullable Status status) {
        showOrHide(status, e());
    }

    public void setFail(@NonNull String str) {
        LoadingDialog loadingDialog = this.b;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.b.setFailed(str);
    }

    public void setSuccess(@NonNull String str) {
        LoadingDialog loadingDialog = this.b;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.b.setSuccess(str);
    }

    public void showLoading(@StringRes int i) {
        i(this.a.getString(i));
    }

    public void showOrHide(@Nullable Status status, @NonNull String str) {
        if (status == null) {
            return;
        }
        int i = a.a[status.ordinal()];
        if (i == 1) {
            i(str);
        } else if (i == 2 || i == 3) {
            hideLoading();
        }
    }

    public void showOrError(@Nullable Status status, @NonNull String str) {
        showOrError(status, e(), str);
    }

    public void showOrError(@Nullable Status status, @NonNull final String str, @NonNull final String str2) {
        showOrError(status, new Supplier() { // from class: cq4
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return LoadingDialogHelper.g(str);
            }
        }, new Supplier() { // from class: bq4
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return LoadingDialogHelper.h(str2);
            }
        });
    }

    public void showOrError(@Nullable Status status, @NonNull Supplier<String> supplier, @NonNull Supplier<String> supplier2) {
        if (status == null) {
            return;
        }
        int i = a.a[status.ordinal()];
        if (i == 1) {
            i(supplier.get());
        } else if (i == 2) {
            hideLoading();
        } else {
            if (i != 3) {
                return;
            }
            setFail(supplier2.get());
        }
    }
}
