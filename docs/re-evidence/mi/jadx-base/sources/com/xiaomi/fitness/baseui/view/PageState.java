package com.xiaomi.fitness.baseui.view;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.widget.state.StatusPage;
import com.xiaomi.fitness.widget.state.adapter.TextIconAdapter;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.mvi;
import defpackage.n1j;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH\u0017J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u001c\u0010\u0019\u001a\u00020\u000e2\b\b\u0003\u0010\u001a\u001a\u00020\u00102\b\b\u0003\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/PageState;", "", "mStatusPage", "Lcom/xiaomi/fitness/widget/state/StatusPage;", "getMStatusPage", "()Lcom/xiaomi/fitness/widget/state/StatusPage;", "mLoadingDialog", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "getMLoadingDialog", "()Ljava/lang/ref/WeakReference;", "setMLoadingDialog", "(Ljava/lang/ref/WeakReference;)V", "showLoading", "", "resId", "", "isCancelable", "", "msg", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "hideLoading", "dismissDialog", "dismissDialogForce", "showEmpty", "textRes", "iconRes", "showError", "showNoNetwork", "showContent", "onRetry", "isLoadingShowing", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PageState {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dismissDialog(@NotNull PageState pageState) {
            WeakReference<CircleProgressDialog> mLoadingDialog;
            CircleProgressDialog circleProgressDialog;
            if (!pageState.isLoadingShowing() || (mLoadingDialog = pageState.getMLoadingDialog()) == null || (circleProgressDialog = mLoadingDialog.get()) == null) {
                return;
            }
            circleProgressDialog.dismissAllowingStateLoss();
        }

        public static void dismissDialogForce(@NotNull PageState pageState) {
            CircleProgressDialog circleProgressDialog;
            WeakReference<CircleProgressDialog> mLoadingDialog = pageState.getMLoadingDialog();
            if (mLoadingDialog != null && (circleProgressDialog = mLoadingDialog.get()) != null) {
                circleProgressDialog.dismissAllowingStateLoss();
            }
            pageState.setMLoadingDialog(null);
        }

        public static void hideLoading(@NotNull PageState pageState) {
            pageState.dismissDialog();
        }

        public static boolean isLoadingShowing(@NotNull PageState pageState) {
            CircleProgressDialog circleProgressDialog;
            WeakReference<CircleProgressDialog> mLoadingDialog = pageState.getMLoadingDialog();
            return (mLoadingDialog == null || (circleProgressDialog = mLoadingDialog.get()) == null || !circleProgressDialog.isShowing()) ? false : true;
        }

        public static void onRetry(@NotNull PageState pageState) {
        }

        public static void showContent(@NotNull PageState pageState) {
            StatusPage.showContentView$default(pageState.getMStatusPage(), null, 1, null);
        }

        public static void showEmpty(@NotNull PageState pageState, int i, int i2) {
            if (i != -1 || i2 != -1) {
                TextIconAdapter textIconAdapter = (TextIconAdapter) pageState.getMStatusPage().getAdapter(4);
                if (i != -1) {
                    textIconAdapter.setTextRes(i);
                }
                if (i2 != -1) {
                    textIconAdapter.setIconRes(i2);
                }
            }
            StatusPage.showEmptyView$default(pageState.getMStatusPage(), null, 1, null);
            pageState.getMStatusPage().setOnReloadListener(pageState.new AnonymousClass1());
        }

        public static /* synthetic */ void showEmpty$default(PageState pageState, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmpty");
            }
            if ((i3 & 1) != 0) {
                i = -1;
            }
            if ((i3 & 2) != 0) {
                i2 = -1;
            }
            pageState.showEmpty(i, i2);
        }

        public static void showError(@NotNull PageState pageState) {
            StatusPage.showErrorView$default(pageState.getMStatusPage(), null, 1, null);
        }

        @Deprecated(message = "尽快修改成kotlin，直接使用带有默认参数的方法", replaceWith = @ReplaceWith(expression = "showLoading(msg : String = getString(R.string.dialog_loanding), progress : Int = 0, isCancelable: Boolean = true)", imports = {}))
        public static void showLoading(@NotNull PageState pageState) {
            showLoading$default(pageState, null, 0, false, 5, null);
        }

        public static /* synthetic */ void showLoading$default(PageState pageState, int i, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            pageState.showLoading(i, z);
        }

        public static void showNoNetwork(@NotNull PageState pageState) {
            StatusPage.showNoNetworkView$default(pageState.getMStatusPage(), null, 1, null);
            pageState.getMStatusPage().setOnReloadListener(pageState.new C18291());
        }

        public static void showLoading(@NotNull PageState pageState, int i, boolean z) {
            pageState.showLoading(ResourceExtKt.getString(i), 0, z);
        }

        public static /* synthetic */ void showLoading$default(PageState pageState, String str, int i, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
            }
            if ((i2 & 1) != 0) {
                str = ResourceExtKt.getString(n1j.f);
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                z = true;
            }
            pageState.showLoading(str, i, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void showLoading(@NotNull PageState pageState, @NotNull String msg, int i, boolean z) {
            FragmentManager supportFragmentManager;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (pageState instanceof Fragment) {
                Fragment fragment = (Fragment) pageState;
                if (!fragment.isAdded()) {
                    return;
                } else {
                    supportFragmentManager = fragment.getChildFragmentManager();
                }
            } else {
                supportFragmentManager = pageState instanceof FragmentActivity ? ((FragmentActivity) pageState).getSupportFragmentManager() : null;
            }
            CircleProgressDialog circleProgressDialogCreate = (CircleProgressDialog) (supportFragmentManager != null ? supportFragmentManager.l0("circle_progress") : null);
            if (circleProgressDialogCreate == null) {
                CircleProgressDialog.a aVar = new CircleProgressDialog.a("circle_progress");
                if (i != 0) {
                    aVar.setCustomLayoutId(mvi.n);
                } else {
                    aVar.setCustomLayoutId(mvi.c);
                }
                circleProgressDialogCreate = aVar.setCanceledOnTouchOutside(z).setCanceledOnBackPressed(z).create();
            }
            pageState.setMLoadingDialog(new WeakReference(circleProgressDialogCreate));
            if (pageState.getMLoadingDialog() != null) {
                if (i > 0) {
                    WeakReference<CircleProgressDialog> mLoadingDialog = pageState.getMLoadingDialog();
                    Intrinsics.checkNotNull(mLoadingDialog);
                    CircleProgressDialog circleProgressDialog = mLoadingDialog.get();
                    if (circleProgressDialog != null) {
                        circleProgressDialog.setProgress(i);
                    }
                } else {
                    WeakReference<CircleProgressDialog> mLoadingDialog2 = pageState.getMLoadingDialog();
                    Intrinsics.checkNotNull(mLoadingDialog2);
                    CircleProgressDialog circleProgressDialog2 = mLoadingDialog2.get();
                    if (circleProgressDialog2 != null) {
                        circleProgressDialog2.setPickerHintText(msg);
                    }
                }
                if (pageState.isLoadingShowing()) {
                    return;
                }
                WeakReference<CircleProgressDialog> mLoadingDialog3 = pageState.getMLoadingDialog();
                Intrinsics.checkNotNull(mLoadingDialog3);
                CircleProgressDialog circleProgressDialog3 = mLoadingDialog3.get();
                if (circleProgressDialog3 != null) {
                    circleProgressDialog3.showIfNeed(supportFragmentManager);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.view.PageState$showEmpty$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 implements StatusPage.OnReloadListener, FunctionAdapter {
        public AnonymousClass1() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof StatusPage.OnReloadListener) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, PageState.this, PageState.class, "onRetry", "onRetry()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.xiaomi.fitness.widget.state.StatusPage.OnReloadListener
        public final void onReload() {
            PageState.this.onRetry();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.view.PageState$showNoNetwork$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C18291 implements StatusPage.OnReloadListener, FunctionAdapter {
        public C18291() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof StatusPage.OnReloadListener) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, PageState.this, PageState.class, "onRetry", "onRetry()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.xiaomi.fitness.widget.state.StatusPage.OnReloadListener
        public final void onReload() {
            PageState.this.onRetry();
        }
    }

    void dismissDialog();

    void dismissDialogForce();

    @Nullable
    WeakReference<CircleProgressDialog> getMLoadingDialog();

    @NotNull
    StatusPage getMStatusPage();

    void hideLoading();

    boolean isLoadingShowing();

    void onRetry();

    void setMLoadingDialog(@Nullable WeakReference<CircleProgressDialog> weakReference);

    void showContent();

    void showEmpty(int textRes, int iconRes);

    void showError();

    @Deprecated(message = "尽快修改成kotlin，直接使用带有默认参数的方法", replaceWith = @ReplaceWith(expression = "showLoading(msg : String = getString(R.string.dialog_loanding), progress : Int = 0, isCancelable: Boolean = true)", imports = {}))
    void showLoading();

    void showLoading(int resId, boolean isCancelable);

    void showLoading(@NotNull String msg, int progress, boolean isCancelable);

    void showNoNetwork();
}
