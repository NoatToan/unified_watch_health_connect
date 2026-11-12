package com.huami.xiaopeng.ui.amazfit.view;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.tools.analytics.DbUtils;
import com.huami.xiaopeng.repo.config.XpConfig;
import com.huami.xiaopeng.repo.exception.XpException;
import com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi;
import com.huami.xiaopeng.ui.amazfit.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/view/XpLoadingWidgetImpl;", "Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "", "showLoading", "", "message", "", "e", "showError", "dismiss", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Z", "showDetailError", "", "c", LogUtil.I, "showCount", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loading", "<init>", "(Landroid/content/Context;Z)V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class XpLoadingWidgetImpl implements XpLoadingWidgetApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showDetailError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int showCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy loading;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialog> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            LoadingDialog loadingDialog = new LoadingDialog(XpLoadingWidgetImpl.this.context);
            loadingDialog.setCancelable(false);
            return loadingDialog;
        }
    }

    public XpLoadingWidgetImpl(@NotNull Context context, boolean z) {
        this.context = context;
        this.showDetailError = z;
        this.loading = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final LoadingDialog a() {
        return (LoadingDialog) this.loading.getValue();
    }

    @Override // com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi
    public void dismiss() {
        int i = this.showCount - 1;
        this.showCount = i;
        if (i > 0) {
            return;
        }
        a().dismiss();
    }

    @Override // com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi
    public void showError(@NotNull Throwable e) {
        String code;
        this.showCount = 0;
        if (this.showDetailError) {
            code = String.valueOf(e);
        } else if (e instanceof XpException) {
            XpException xpException = (XpException) e;
            String msgForUi = xpException.getMsgForUi();
            code = msgForUi == null ? xpException.getCode() : msgForUi;
        } else {
            code = null;
        }
        LoadingDialog loadingDialogA = a();
        if (code == null) {
            code = this.context.getString(R.string.car_s_load_fail);
        }
        loadingDialogA.setFailed(code);
    }

    @Override // com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi
    public void showLoading() {
        int i = this.showCount;
        if (i > 0) {
            this.showCount = i + 1;
            return;
        }
        this.showCount = i + 1;
        a().setMessage(this.context.getString(R.string.car_s_loading));
        a().show();
    }

    public /* synthetic */ XpLoadingWidgetImpl(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? XpConfig.INSTANCE.getShowErrorDetail().invoke().booleanValue() : z);
    }

    @Override // com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi
    public void showLoading(@NotNull CharSequence message) {
        int i = this.showCount;
        if (i > 0) {
            this.showCount = i + 1;
            return;
        }
        this.showCount = i + 1;
        a().setMessage(message);
        a().show();
    }
}
