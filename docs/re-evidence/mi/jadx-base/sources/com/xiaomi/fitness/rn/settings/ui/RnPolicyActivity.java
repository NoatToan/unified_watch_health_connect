package com.xiaomi.fitness.rn.settings.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.sdk.RnPersistManager;
import com.xiaomi.fitness.rn.settings.ui.RnPolicyActivity;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import defpackage.av6;
import defpackage.eci;
import defpackage.sri;
import defpackage.v0j;
import defpackage.zui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\tH\u0002J\u001c\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0002J\b\u0010\u0013\u001a\u00020\tH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/ui/RnPolicyActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showRevokePrivacyDialog", "revokePrivacyContent", "", "revokePrivacy", "callback", "Lkotlin/Function1;", "", "setRevokeSuccessResult", "Companion", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnPolicyActivity extends BaseActivity {

    @NotNull
    private static final String ARGS_RESULT_REMOVE_LICENSE = "removedLicense";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_AGREEMENT_URL = "agreement_url";

    @NotNull
    private static final String KEY_DID = "did";

    @NotNull
    private static final String KEY_PID = "pid";

    @NotNull
    private static final String KEY_PRIVACY_ID = "privacy_id";

    @NotNull
    private static final String KEY_PRIVACY_URL = "privacy_url";

    @NotNull
    private static final String KEY_REVOKE_CONTENT = "revoke_content";

    @NotNull
    private static final String RESULT_KEY_FINISH = "result_data";

    @NotNull
    private static final String TAG = "RnPolicyActivity";

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/ui/RnPolicyActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_DID", "KEY_PID", "KEY_AGREEMENT_URL", "KEY_PRIVACY_URL", "KEY_REVOKE_CONTENT", "KEY_PRIVACY_ID", "ARGS_RESULT_REMOVE_LICENSE", "RESULT_KEY_FINISH", "launch", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "did", "pid", "", "agreementUrl", "privacyUrl", "revokePrivacyContent", AccountInteractActivity.KEY_REQUEST_CODE, "privacyId", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Activity activity, @NotNull String did, int pid, @Nullable String agreementUrl, @NotNull String privacyUrl, @Nullable String revokePrivacyContent, int requestCode, int privacyId) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(privacyUrl, "privacyUrl");
            Intent intent = new Intent(activity, (Class<?>) RnPolicyActivity.class);
            intent.putExtra("did", did);
            intent.putExtra("pid", pid);
            intent.putExtra(RnPolicyActivity.KEY_AGREEMENT_URL, agreementUrl);
            intent.putExtra(RnPolicyActivity.KEY_PRIVACY_URL, privacyUrl);
            intent.putExtra(RnPolicyActivity.KEY_REVOKE_CONTENT, revokePrivacyContent);
            intent.putExtra("privacy_id", privacyId);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(String str, RnPolicyActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            WebViewUtilKt.starWebViewSupportPDFDownload$default(str, this$0.getString(v0j.e), false, false, null, null, null, 124, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(String str, RnPolicyActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            WebViewUtilKt.starWebViewSupportPDFDownload$default(str, this$0.getString(v0j.y), false, false, null, null, null, 124, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(String str, RnPolicyActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "click revoke privacy btn(" + str + ")");
        this$0.showRevokePrivacyDialog(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void revokePrivacy() {
        final eci eciVarT = eci.T(this, null, getString(v0j.p), false, true);
        revokePrivacy(new Function1() { // from class: cvk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RnPolicyActivity.revokePrivacy$lambda$5(eciVarT, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit revokePrivacy$lambda$5(eci eciVar, RnPolicyActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new RnPolicyActivity$revokePrivacy$1$1(eciVar, z, this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit revokePrivacy$lambda$6(String str, Function1 callback, boolean z) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Logger.i(TAG, "revokePrivacy(" + str + "): onSuccess(" + z + ")");
        callback.invoke2(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit revokePrivacy$lambda$7(String str, Function1 callback, ApiException it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.w(TAG, "revokePrivacy(" + str + "): onFail(code=" + it.getErrorCode() + ")", it);
        callback.invoke2(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRevokeSuccessResult() {
        Logger.i(TAG, "setRevokeSuccessResult");
        Intent intent = new Intent();
        intent.putExtra("result_data", "removedLicense");
        intent.putExtra("finish", true);
        setResult(-1, intent);
        Intent intent2 = new Intent();
        intent2.putExtra("result_data", "removedLicense");
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).revokeSuccessResult(-1, 100, intent2);
    }

    private final void showRevokePrivacyDialog(String revokePrivacyContent) {
        String string = getString(v0j.E);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("revoke_privacy").setDialogTitle(v0j.G).setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(v0j.C).setNegativeText(v0j.f36350b).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.rn.settings.ui.RnPolicyActivity.showRevokePrivacyDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -1) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    Logger.i(RnPolicyActivity.TAG, "confirm revoke privacy");
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    RnPolicyActivity.this.revokePrivacy();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return zui.f41691a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(v0j.w);
        final String stringExtra = getIntent().getStringExtra(KEY_AGREEMENT_URL);
        final String stringExtra2 = getIntent().getStringExtra(KEY_PRIVACY_URL);
        final String stringExtra3 = getIntent().getStringExtra(KEY_REVOKE_CONTENT);
        RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView = (RightArrowBindingTwoLineTextView) findViewById(sri.f33916a);
        RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView2 = (RightArrowBindingTwoLineTextView) findViewById(sri.g);
        Intrinsics.checkNotNull(rightArrowBindingTwoLineTextView);
        ViewExtKt.setVisible(rightArrowBindingTwoLineTextView, stringExtra != null && stringExtra.length() > 0);
        Intrinsics.checkNotNull(rightArrowBindingTwoLineTextView2);
        ViewExtKt.setVisible(rightArrowBindingTwoLineTextView2, stringExtra2 != null && stringExtra2.length() > 0);
        rightArrowBindingTwoLineTextView.setOnClickListener(new View.OnClickListener() { // from class: zuk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RnPolicyActivity.onCreate$lambda$1(stringExtra, this, view);
            }
        });
        rightArrowBindingTwoLineTextView2.setOnClickListener(new View.OnClickListener() { // from class: avk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RnPolicyActivity.onCreate$lambda$3(stringExtra2, this, view);
            }
        });
        ((Button) findViewById(sri.c)).setOnClickListener(new View.OnClickListener() { // from class: bvk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RnPolicyActivity.onCreate$lambda$4(stringExtra3, this, view);
            }
        });
    }

    private final void revokePrivacy(final Function1<? super Boolean, Unit> callback) {
        final String stringExtra = getIntent().getStringExtra("did");
        if (stringExtra != null && stringExtra.length() != 0) {
            int intExtra = getIntent().getIntExtra("privacy_id", 0);
            String nativePrivacyConfirmationVersion = RnPersistManager.INSTANCE.getNativePrivacyConfirmationVersion(stringExtra);
            RNDeviceManager rNDeviceManagerExtKt = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE);
            if (nativePrivacyConfirmationVersion == null) {
                nativePrivacyConfirmationVersion = "";
            }
            rNDeviceManagerExtKt.revokePrivacy(stringExtra, intExtra, nativePrivacyConfirmationVersion, new Function1() { // from class: dvk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RnPolicyActivity.revokePrivacy$lambda$6(stringExtra, callback, ((Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: evk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RnPolicyActivity.revokePrivacy$lambda$7(stringExtra, callback, (ApiException) obj);
                }
            });
            return;
        }
        callback.invoke2(Boolean.FALSE);
    }
}
