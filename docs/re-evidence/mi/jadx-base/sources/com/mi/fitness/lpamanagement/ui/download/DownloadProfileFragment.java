package com.mi.fitness.lpamanagement.ui.download;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mi.fitness.lpamanagement.exception.InvalidActivationCodeException;
import com.mi.fitness.lpamanagement.ui.download.DownloadProfileFragment;
import com.mi.fitness.lpamanagement.util.LpaManagementUtil;
import com.mi.health.qrcode.QRCodeExportKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.ConfigPreference;
import defpackage.azi;
import defpackage.dih;
import defpackage.l5a;
import defpackage.pti;
import defpackage.s7r;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000232B\u0007¢\u0006\u0004\b1\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u0018\u0010'\u001a\u00060&R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/download/DownloadProfileFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/lpamanagement/ui/download/DownloadProfileViewModel;", "Ll5a;", "", "analyseActivationCode", "()V", "", "activationCode", "confirmationCode", "startDownload", "(Ljava/lang/String;Ljava/lang/String;)V", "showProgressView", "showConfirmSuccessView", "showConfirmationView", "showConfirmFailedView", "showDownloadFailedView", "showDownloadSuccessView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "setListener", "", "onBackPressed", "()Z", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/mi/fitness/lpamanagement/ui/download/DownloadProfileFragment$DataHandlerImpl;", "curDataHandler", "Lcom/mi/fitness/lpamanagement/ui/download/DownloadProfileFragment$DataHandlerImpl;", "Ljava/lang/String;", "getActivationCode", "()Ljava/lang/String;", "setActivationCode", "(Ljava/lang/String;)V", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "DataHandlerImpl", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDownloadProfileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadProfileFragment.kt\ncom/mi/fitness/lpamanagement/ui/download/DownloadProfileFragment\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,257:1\n29#2:258\n*S KotlinDebug\n*F\n+ 1 DownloadProfileFragment.kt\ncom/mi/fitness/lpamanagement/ui/download/DownloadProfileFragment\n*L\n161#1:258\n*E\n"})
public final class DownloadProfileFragment extends BaseBindingFragment<DownloadProfileViewModel, l5a> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_ACTIVATION_CODE = "key_activation_code";

    @NotNull
    public static final String TAG = "DownloadProfileFragment";
    public String activationCode;

    @NotNull
    private final DataHandlerImpl curDataHandler = new DataHandlerImpl();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/download/DownloadProfileFragment$Companion;", "", "<init>", "()V", "KEY_ACTIVATION_CODE", "", "TAG", "startDownloadProfile", "", "activationCode", "context", "Landroid/content/Context;", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startDownloadProfile(@NotNull String activationCode, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(activationCode, "activationCode");
            Intrinsics.checkNotNullParameter(context, "context");
            String rawActivationCode = LpaManagementUtil.INSTANCE.getRawActivationCode(activationCode);
            Bundle bundle = new Bundle();
            bundle.putString(DownloadProfileFragment.KEY_ACTIVATION_CODE, rawActivationCode);
            Intent intentB = dih.a().b(context, new FragmentParams.b().e(DownloadProfileFragment.class).c(bundle).b(), true);
            Intrinsics.checkNotNullExpressionValue(intentB, "getGoCommonActivityIntent(...)");
            intentB.addFlags(268435456);
            context.startActivity(intentB);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/download/DownloadProfileFragment$DataHandlerImpl;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "(Lcom/mi/fitness/lpamanagement/ui/download/DownloadProfileFragment;)V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DataHandlerImpl extends DataHandlerWrapper {
        public DataHandlerImpl() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet == null || packet.e != 9 || packet.f != 7) {
                return false;
            }
            int i = packet.x().o().c;
            Logger.i(DownloadProfileFragment.TAG, "report download progress:" + i);
            if (i == -1) {
                AnyExtKt.main$default(null, new DownloadProfileFragment$DataHandlerImpl$handlePacket$1(DownloadProfileFragment.this, null), 1, null);
            } else if (i != 100) {
                AnyExtKt.main$default(null, new DownloadProfileFragment$DataHandlerImpl$handlePacket$3(DownloadProfileFragment.this, i, null), 1, null);
            } else {
                AnyExtKt.main$default(null, new DownloadProfileFragment$DataHandlerImpl$handlePacket$2(DownloadProfileFragment.this, null), 1, null);
            }
            return true;
        }
    }

    private final void analyseActivationCode() {
        List<String> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        try {
            listEmptyList = LpaManagementUtil.INSTANCE.parseActivationCodeElements(getActivationCode());
        } catch (InvalidActivationCodeException e) {
            Logger.i(TAG, "InvalidActivationCodeException:" + e.getMessage());
            showConfirmFailedView();
        }
        if (!listEmptyList.isEmpty()) {
            if (LpaManagementUtil.INSTANCE.isRetryDownLoad(listEmptyList)) {
                showConfirmationView();
            } else {
                showConfirmSuccessView();
                startDownload(getActivationCode(), "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(DownloadProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strValueOf = String.valueOf(this$0.getMBinding().J.getText());
        if (strValueOf.length() == 0) {
            Logger.i(TAG, "confirmationCode is null");
        } else {
            this$0.startDownload(this$0.getActivationCode(), strValueOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(final DownloadProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionExtKt.permission(this$0, "android.permission.CAMERA", this$0.getString(azi.t), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: j37
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DownloadProfileFragment.setListener$lambda$4$lambda$3(this.f22374a, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4$lambda$3(final DownloadProfileFragment this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: p37
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DownloadProfileFragment.setListener$lambda$4$lambda$3$lambda$1(this.f29956a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: q37
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DownloadProfileFragment.setListener$lambda$4$lambda$3$lambda$2((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4$lambda$3$lambda$1(DownloadProfileFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            QRCodeExportKt.launchToQRCodeScan$default(activity, null, null, false, false, null, 31, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4$lambda$3$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "request permission denied");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(DownloadProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(DownloadProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(DownloadProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void showConfirmFailedView() {
        ConstraintLayout confirmContainer = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(confirmContainer, "confirmContainer");
        ViewExtKt.gone(confirmContainer);
        ConstraintLayout scanSuccessContainer = getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(scanSuccessContainer, "scanSuccessContainer");
        ViewExtKt.gone(scanSuccessContainer);
        ConstraintLayout downloadProgressContainer = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(downloadProgressContainer, "downloadProgressContainer");
        ViewExtKt.gone(downloadProgressContainer);
        ConstraintLayout scanFailContainer = getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(scanFailContainer, "scanFailContainer");
        ViewExtKt.visible(scanFailContainer);
        ConstraintLayout downloadSuccessContainer = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(downloadSuccessContainer, "downloadSuccessContainer");
        ViewExtKt.gone(downloadSuccessContainer);
        ConstraintLayout downloadFailContainer = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(downloadFailContainer, "downloadFailContainer");
        ViewExtKt.gone(downloadFailContainer);
    }

    private final void showConfirmSuccessView() {
        ConstraintLayout confirmContainer = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(confirmContainer, "confirmContainer");
        ViewExtKt.gone(confirmContainer);
        ConstraintLayout scanSuccessContainer = getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(scanSuccessContainer, "scanSuccessContainer");
        ViewExtKt.visible(scanSuccessContainer);
        ConstraintLayout downloadProgressContainer = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(downloadProgressContainer, "downloadProgressContainer");
        ViewExtKt.gone(downloadProgressContainer);
        ConstraintLayout scanFailContainer = getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(scanFailContainer, "scanFailContainer");
        ViewExtKt.gone(scanFailContainer);
        ConstraintLayout downloadSuccessContainer = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(downloadSuccessContainer, "downloadSuccessContainer");
        ViewExtKt.gone(downloadSuccessContainer);
        ConstraintLayout downloadFailContainer = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(downloadFailContainer, "downloadFailContainer");
        ViewExtKt.gone(downloadFailContainer);
    }

    private final void showConfirmationView() {
        ConstraintLayout confirmContainer = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(confirmContainer, "confirmContainer");
        ViewExtKt.visible(confirmContainer);
        ConstraintLayout scanSuccessContainer = getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(scanSuccessContainer, "scanSuccessContainer");
        ViewExtKt.gone(scanSuccessContainer);
        ConstraintLayout downloadProgressContainer = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(downloadProgressContainer, "downloadProgressContainer");
        ViewExtKt.gone(downloadProgressContainer);
        ConstraintLayout scanFailContainer = getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(scanFailContainer, "scanFailContainer");
        ViewExtKt.gone(scanFailContainer);
        ConstraintLayout downloadSuccessContainer = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(downloadSuccessContainer, "downloadSuccessContainer");
        ViewExtKt.gone(downloadSuccessContainer);
        ConstraintLayout downloadFailContainer = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(downloadFailContainer, "downloadFailContainer");
        ViewExtKt.gone(downloadFailContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDownloadFailedView() {
        ConstraintLayout confirmContainer = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(confirmContainer, "confirmContainer");
        ViewExtKt.gone(confirmContainer);
        ConstraintLayout scanSuccessContainer = getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(scanSuccessContainer, "scanSuccessContainer");
        ViewExtKt.gone(scanSuccessContainer);
        ConstraintLayout downloadProgressContainer = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(downloadProgressContainer, "downloadProgressContainer");
        ViewExtKt.gone(downloadProgressContainer);
        ConstraintLayout scanFailContainer = getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(scanFailContainer, "scanFailContainer");
        ViewExtKt.gone(scanFailContainer);
        ConstraintLayout downloadSuccessContainer = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(downloadSuccessContainer, "downloadSuccessContainer");
        ViewExtKt.gone(downloadSuccessContainer);
        ConstraintLayout downloadFailContainer = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(downloadFailContainer, "downloadFailContainer");
        ViewExtKt.visible(downloadFailContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDownloadSuccessView() {
        ConstraintLayout confirmContainer = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(confirmContainer, "confirmContainer");
        ViewExtKt.gone(confirmContainer);
        ConstraintLayout scanSuccessContainer = getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(scanSuccessContainer, "scanSuccessContainer");
        ViewExtKt.gone(scanSuccessContainer);
        ConstraintLayout downloadProgressContainer = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(downloadProgressContainer, "downloadProgressContainer");
        ViewExtKt.gone(downloadProgressContainer);
        ConstraintLayout scanFailContainer = getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(scanFailContainer, "scanFailContainer");
        ViewExtKt.gone(scanFailContainer);
        ConstraintLayout downloadSuccessContainer = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(downloadSuccessContainer, "downloadSuccessContainer");
        ViewExtKt.visible(downloadSuccessContainer);
        ConstraintLayout downloadFailContainer = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(downloadFailContainer, "downloadFailContainer");
        ViewExtKt.gone(downloadFailContainer);
    }

    private final void showProgressView() {
        ConstraintLayout confirmContainer = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(confirmContainer, "confirmContainer");
        ViewExtKt.gone(confirmContainer);
        ConstraintLayout scanSuccessContainer = getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(scanSuccessContainer, "scanSuccessContainer");
        ViewExtKt.gone(scanSuccessContainer);
        ConstraintLayout downloadProgressContainer = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(downloadProgressContainer, "downloadProgressContainer");
        ViewExtKt.visible(downloadProgressContainer);
        ConstraintLayout scanFailContainer = getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(scanFailContainer, "scanFailContainer");
        ViewExtKt.gone(scanFailContainer);
        ConstraintLayout downloadSuccessContainer = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(downloadSuccessContainer, "downloadSuccessContainer");
        ViewExtKt.gone(downloadSuccessContainer);
        ConstraintLayout downloadFailContainer = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(downloadFailContainer, "downloadFailContainer");
        ViewExtKt.gone(downloadFailContainer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startDownload(String activationCode, String confirmationCode) {
        ((DownloadProfileViewModel) getMViewModel()).profileDownload(activationCode, confirmationCode, new Function1() { // from class: i37
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DownloadProfileFragment.startDownload$lambda$8(this.f20731a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownload$lambda$8(DownloadProfileFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.showProgressView();
        } else {
            ToastUtil.INSTANCE.showToast(azi.common_set_error);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final String getActivationCode() {
        String str = this.activationCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activationCode");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pti.f30757a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String stringExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 666 && data != null && (stringExtra = data.getStringExtra("scan_result")) != null) {
            boolean z = false;
            for (String str : (List) new Gson().fromJson(ConfigPreference.INSTANCE.getCARRIER_HOST_BLACK_LIST(), new TypeToken<List<? extends String>>() { // from class: com.mi.fitness.lpamanagement.ui.download.DownloadProfileFragment$onActivityResult$$inlined$fromJson$1
            }.getType())) {
                String lowerCase = stringExtra.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null)) {
                    z = true;
                }
            }
            if (z) {
                ToastUtil.INSTANCE.showToast(azi.o);
            } else {
                setActivationCode(LpaManagementUtil.INSTANCE.getRawActivationCode(stringExtra));
                analyseActivationCode();
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        ConstraintLayout downloadProgressContainer = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(downloadProgressContainer, "downloadProgressContainer");
        return ExtUtilsKt.isVisible(downloadProgressContainer);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(KEY_ACTIVATION_CODE)) == null) {
            string = "";
        }
        setActivationCode(string);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(9, this.curDataHandler);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        analyseActivationCode();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(9, this.curDataHandler);
    }

    public final void setActivationCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activationCode = str;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().I.setOnClickListener(new View.OnClickListener() { // from class: k37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadProfileFragment.setListener$lambda$0(this.f23382a, view);
            }
        });
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: l37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadProfileFragment.setListener$lambda$4(this.f24594a, view);
            }
        });
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: m37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadProfileFragment.setListener$lambda$5(this.f25705a, view);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: n37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadProfileFragment.setListener$lambda$6(this.f27504a, view);
            }
        });
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: o37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadProfileFragment.setListener$lambda$7(this.f28690a, view);
            }
        });
    }
}
