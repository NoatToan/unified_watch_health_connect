package com.huami.account.utils;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLogoutManager;
import com.huami.account.bean.LogoutResult;
import com.huami.account.ui.R;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.utils.LogoutDialogHelper;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.util.net.NetUtil;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.manager.UnitManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001,B\u001b\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0006R\u00020\u0000H\u0002J\u0006\u0010\n\u001a\u00020\bR\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R.\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/huami/account/utils/LogoutDialogHelper;", "", "Lcom/huami/account/bean/LogoutResult$Failed;", "result", "", "f", "Lcom/huami/account/utils/LogoutDialogHelper$SimpleLogoutListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/appcompat/app/AppCompatActivity;", "c", "showLogout", "a", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "b", "Z", "getSupportForceLogout", "()Z", "supportForceLogout", "Lcom/huami/account/ui/common/LoadingDialogHelper;", "Lcom/huami/account/ui/common/LoadingDialogHelper;", "dialogHelper", "Lkotlin/Function1;", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "getDialogBuilder", "()Lkotlin/jvm/functions/Function1;", "setDialogBuilder", "(Lkotlin/jvm/functions/Function1;)V", "dialogBuilder", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getAfterLogoutSuccess", "()Lkotlin/jvm/functions/Function0;", "setAfterLogoutSuccess", "(Lkotlin/jvm/functions/Function0;)V", "afterLogoutSuccess", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Z)V", "SimpleLogoutListener", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LogoutDialogHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean supportForceLogout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LoadingDialogHelper dialogHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Function1<? super AlertDialogFragment.Builder, Unit> dialogBuilder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private Function0<Unit> afterLogoutSuccess;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/account/utils/LogoutDialogHelper$SimpleLogoutListener;", "Lcom/huami/account/HMLogoutManager$OnLogoutListener;", "Lcom/huami/account/bean/LogoutResult$Failed;", "result", "", "a", "onSyncDataWhenLogout", "Lcom/huami/account/bean/LogoutResult;", "onStartLogout", "onLogoutSuccess", "<init>", "(Lcom/huami/account/utils/LogoutDialogHelper;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public final class SimpleLogoutListener implements HMLogoutManager.OnLogoutListener {
        public SimpleLogoutListener() {
        }

        private final void a(LogoutResult.Failed result) {
            if (LogoutDialogHelper.this.getActivity().isFinishing()) {
                return;
            }
            LoadingDialog loadingDialog = LogoutDialogHelper.this.dialogHelper.getLoadingDialog();
            if (loadingDialog != null) {
                loadingDialog.hide();
            }
            if (LogoutDialogHelper.this.getSupportForceLogout()) {
                LogoutDialogHelper.this.c(result, this);
            } else {
                LogoutDialogHelper.this.f(result);
            }
        }

        @Override // com.huami.account.HMLogoutManager.OnLogoutListener
        public void onLogoutSuccess() {
            if (LogoutDialogHelper.this.getActivity().isFinishing()) {
                return;
            }
            LoadingDialog loadingDialog = LogoutDialogHelper.this.dialogHelper.getLoadingDialog();
            if (loadingDialog != null) {
                String string = LogoutDialogHelper.this.getActivity().getString(R.string.account_ui_logout_success);
                final LogoutDialogHelper logoutDialogHelper = LogoutDialogHelper.this;
                loadingDialog.setSuccess(string, 500, new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.utils.LogoutDialogHelper$SimpleLogoutListener$onLogoutSuccess$1
                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onAnimEnd(@NotNull LoadingDialog dialog) {
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onDismiss(@NotNull LoadingDialog dialog) {
                        UnitManager.getInstance().clear();
                        HMLogoutManager.logout(1);
                        logoutDialogHelper.getAfterLogoutSuccess().invoke();
                        logoutDialogHelper.getActivity().finish();
                    }
                });
            }
            Analytics.recordEvent(new CountEventBuilder("Setting_Out").setValue("LogOut"));
        }

        @Override // com.huami.account.HMLogoutManager.OnLogoutListener
        public void onStartLogout(@NotNull LogoutResult result) {
            if (LogoutDialogHelper.this.getActivity().isFinishing()) {
                return;
            }
            if (result.isSuccess()) {
                LogoutDialogHelper.this.dialogHelper.showLoadingDialog(LogoutDialogHelper.this.getActivity().getString(R.string.account_ui_logout_ongoing));
            } else if (result instanceof LogoutResult.Failed) {
                a((LogoutResult.Failed) result);
            }
        }

        @Override // com.huami.account.HMLogoutManager.OnLogoutListener
        public void onSyncDataWhenLogout() {
            if (LogoutDialogHelper.this.getActivity().isFinishing()) {
                return;
            }
            LogoutDialogHelper.this.dialogHelper.showLoadingDialog(LogoutDialogHelper.this.getActivity().getString(R.string.account_ui_logout_saving));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<AlertDialogFragment.Builder, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull AlertDialogFragment.Builder builder) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AlertDialogFragment.Builder builder) {
            a(builder);
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    public LogoutDialogHelper(@NotNull AppCompatActivity appCompatActivity) {
        this(appCompatActivity, false, 2, null);
    }

    @JvmOverloads
    public LogoutDialogHelper(@NotNull AppCompatActivity appCompatActivity, boolean z) {
        this.activity = appCompatActivity;
        this.supportForceLogout = z;
        this.dialogHelper = new LoadingDialogHelper(appCompatActivity);
        this.dialogBuilder = b.a;
        this.afterLogoutSuccess = a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatActivity c(LogoutResult.Failed result, final SimpleLogoutListener listener) {
        final AppCompatActivity appCompatActivity = this.activity;
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(appCompatActivity);
        builder.setTitle(R.string.account_ui_logout_error_title);
        StringBuilder sb = new StringBuilder(appCompatActivity.getString(R.string.account_ui_logout_error_content));
        if (AccountExternalsKt.getConfigDelegate().debug()) {
            sb.append("\n");
            sb.append(result.getReasonCodes().toString());
        }
        builder.setParagraph(sb.toString());
        builder.setPositiveButton(R.string.account_ui_logout_error_force, new DialogInterface.OnClickListener() { // from class: com.huami.account.utils.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogoutDialogHelper.d(this.a, appCompatActivity, listener, dialogInterface, i);
            }
        });
        builder.setNegativeButton(R.string.account_ui_cancel, (DialogInterface.OnClickListener) null);
        builder.show(appCompatActivity.getSupportFragmentManager());
        return appCompatActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LogoutDialogHelper logoutDialogHelper, AppCompatActivity appCompatActivity, SimpleLogoutListener simpleLogoutListener, DialogInterface dialogInterface, int i) {
        logoutDialogHelper.dialogHelper.showLoadingDialog(appCompatActivity.getString(R.string.account_ui_logout_ongoing));
        HMLogoutManager.saveLocalData(appCompatActivity, simpleLogoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AppCompatActivity appCompatActivity, LogoutDialogHelper logoutDialogHelper, DialogInterface dialogInterface, int i) {
        HMLogoutManager.processDataWhenLogout(appCompatActivity, logoutDialogHelper.new SimpleLogoutListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(LogoutResult.Failed result) {
        StringBuilder sb = new StringBuilder(this.activity.getString(R.string.account_ui_logout_failed));
        if (GlobalUtil.isInnerFlavor()) {
            sb.append("\n");
            sb.append(result.getReasonCodes().toString());
        }
        IconToast.showError(this.activity, sb.toString());
        Analytics.event(this.activity, "Setting_Out", "LogOut");
    }

    @NotNull
    public final AppCompatActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Function0<Unit> getAfterLogoutSuccess() {
        return this.afterLogoutSuccess;
    }

    @NotNull
    public final Function1<AlertDialogFragment.Builder, Unit> getDialogBuilder() {
        return this.dialogBuilder;
    }

    public final boolean getSupportForceLogout() {
        return this.supportForceLogout;
    }

    public final void setAfterLogoutSuccess(@NotNull Function0<Unit> function0) {
        this.afterLogoutSuccess = function0;
    }

    public final void setDialogBuilder(@NotNull Function1<? super AlertDialogFragment.Builder, Unit> function1) {
        this.dialogBuilder = function1;
    }

    @NotNull
    public final AppCompatActivity showLogout() {
        final AppCompatActivity appCompatActivity = this.activity;
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(appCompatActivity);
            builder.setTitle(R.string.account_ui_logout_title_2);
            builder.setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: zs4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LogoutDialogHelper.e(appCompatActivity, this, dialogInterface, i);
                }
            });
            builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
            getDialogBuilder().invoke(builder);
            builder.show(appCompatActivity.getSupportFragmentManager());
            Analytics.recordEvent(new CountEventBuilder("Setting_Out").setValue("LogOut"));
        } else {
            IconToast.showError(appCompatActivity, appCompatActivity.getString(R.string.no_network_connection));
        }
        return appCompatActivity;
    }

    public /* synthetic */ LogoutDialogHelper(AppCompatActivity appCompatActivity, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appCompatActivity, (i & 2) != 0 ? true : z);
    }
}
