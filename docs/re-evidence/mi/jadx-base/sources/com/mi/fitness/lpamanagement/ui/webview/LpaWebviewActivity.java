package com.mi.fitness.lpamanagement.ui.webview;

import android.content.Intent;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mi.fitness.lpamanagement.ui.LpaManagementFragmentKt;
import com.mi.fitness.lpamanagement.ui.download.DownloadProfileFragment;
import com.mi.fitness.lpamanagement.ui.webview.LpaWebviewActivity;
import com.mi.health.qrcode.QRCodeExportKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.azi;
import defpackage.kad;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/webview/LpaWebviewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "Lcom/mi/fitness/lpamanagement/ui/webview/LpaScanHelper;", "", "scanResult", "", "handleQRScanResult", "(Ljava/lang/String;)V", "requestCameraPermission", "()V", "Landroid/content/Intent;", "intent", "initDataFromIntent", "(Landroid/content/Intent;)V", "Lkad;", "getJavaScriptInterface", "()Lkad;", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "goScan", "<init>", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLpaWebviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpaWebviewActivity.kt\ncom/mi/fitness/lpamanagement/ui/webview/LpaWebviewActivity\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,110:1\n29#2:111\n*S KotlinDebug\n*F\n+ 1 LpaWebviewActivity.kt\ncom/mi/fitness/lpamanagement/ui/webview/LpaWebviewActivity\n*L\n49#1:111\n*E\n"})
public final class LpaWebviewActivity extends WebViewActivity implements LpaScanHelper {

    /* JADX INFO: renamed from: com.mi.fitness.lpamanagement.ui.webview.LpaWebviewActivity$goScan$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.lpamanagement.ui.webview.LpaWebviewActivity$goScan$1", f = "LpaWebviewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LpaWebviewActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LpaWebviewActivity.this.requestCameraPermission();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void handleQRScanResult(String scanResult) {
        Logger.i(LpaManagementFragmentKt.LPA_TAG, "handleQRScanResult " + scanResult);
        DownloadProfileFragment.INSTANCE.startDownloadProfile(scanResult, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestCameraPermission() {
        if (!PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.CAMERA"})) {
            QRCodeExportKt.launchToQRCodeScan$default(this, null, null, false, false, null, 31, null);
            return;
        }
        final Function0 function0 = new Function0() { // from class: ove
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LpaWebviewActivity.requestCameraPermission$lambda$4(this.f29729a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
        } else {
            PermissionsUtil.INSTANCE.showCameraPermissionDialog(this, "android.permission.CAMERA", new PermissionsUtil.PermissionAuthDialogAgreeListener() { // from class: com.mi.fitness.lpamanagement.ui.webview.LpaWebviewActivity.requestCameraPermission.1
                @Override // com.xiaomi.fitness.baseui.utils.PermissionsUtil.PermissionAuthDialogAgreeListener
                public void onAuthDialogAgree(String permission) {
                    Intrinsics.checkNotNullParameter(permission, "permission");
                    function0.invoke();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$4(final LpaWebviewActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionExtKt.permission(this$0, "android.permission.CAMERA", ResourceExtKt.getString(azi.t), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: pve
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaWebviewActivity.requestCameraPermission$lambda$4$lambda$3(this.f30825a, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$4$lambda$3(final LpaWebviewActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: qve
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaWebviewActivity.requestCameraPermission$lambda$4$lambda$3$lambda$0(this.f31882a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: rve
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaWebviewActivity.requestCameraPermission$lambda$4$lambda$3$lambda$2(this.f32946a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$4$lambda$3$lambda$0(LpaWebviewActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        QRCodeExportKt.launchToQRCodeScan$default(this$0, null, null, false, false, null, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$4$lambda$3$lambda$2(final LpaWebviewActivity this$0, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, this$0, null, null, null, new Function0() { // from class: sve
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LpaWebviewActivity.requestCameraPermission$lambda$4$lambda$3$lambda$2$lambda$1(this.f34023a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCameraPermission$lambda$4$lambda$3$lambda$2$lambda$1(LpaWebviewActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.INSTANCE.showSettingDialog(this$0, it, false, null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    @NotNull
    public kad getJavaScriptInterface() {
        return new LpaJavscriptImpl(this, this, this);
    }

    @Override // com.mi.fitness.lpamanagement.ui.webview.LpaScanHelper
    public void goScan() {
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initDataFromIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.initDataFromIntent(intent);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String stringExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 666 && data != null && (stringExtra = data.getStringExtra("scan_result")) != null) {
            boolean z = false;
            for (String str : (List) new Gson().fromJson(ConfigPreference.INSTANCE.getCARRIER_HOST_BLACK_LIST(), new TypeToken<List<? extends String>>() { // from class: com.mi.fitness.lpamanagement.ui.webview.LpaWebviewActivity$onActivityResult$$inlined$fromJson$1
            }.getType())) {
                String lowerCase = stringExtra.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null)) {
                    z = true;
                }
            }
            if (z) {
                ToastExtKt.toastShort(this, azi.o);
            } else {
                handleQRScanResult(stringExtra);
            }
        }
    }
}
