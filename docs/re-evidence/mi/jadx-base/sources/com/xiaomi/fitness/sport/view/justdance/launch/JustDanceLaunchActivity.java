package com.xiaomi.fitness.sport.view.justdance.launch;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mi.health.qrcode.QRCodeExportKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.view.justdance.JustDanceImpl;
import com.xiaomi.fitness.sport.view.justdance.launch.JustDanceLaunchActivity;
import com.xiaomi.fitness.sport_export.IJustDanceApi;
import com.xiaomi.fitness.sport_export.JustDanceExtKt;
import com.xiaomi.onetrack.api.b;
import defpackage.av6;
import defpackage.c1j;
import defpackage.clb;
import defpackage.d2m;
import defpackage.dvi;
import defpackage.gv5;
import defpackage.nv1;
import defpackage.v9n;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/launch/JustDanceLaunchActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/view/justdance/launch/JustDanceLaunchViewModel;", "Lv9n;", "", "showPowerGuideDialog", "()V", "gotoScan", "openCamera", "", "scanResult", "handleQRScanResult", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nJustDanceLaunchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JustDanceLaunchActivity.kt\ncom/xiaomi/fitness/sport/view/justdance/launch/JustDanceLaunchActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,175:1\n54#2,3:176\n24#2:179\n57#2,6:180\n63#2,2:187\n57#3:186\n*S KotlinDebug\n*F\n+ 1 JustDanceLaunchActivity.kt\ncom/xiaomi/fitness/sport/view/justdance/launch/JustDanceLaunchActivity\n*L\n46#1:176,3\n46#1:179\n46#1:180,6\n46#1:187,2\n46#1:186\n*E\n"})
public final class JustDanceLaunchActivity extends Hilt_JustDanceLaunchActivity<JustDanceLaunchViewModel, v9n> {

    @NotNull
    private static final String JD_LOGO = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/justdance/FakeParticles.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=arbgdamByIELxxTvmCjJ/OcYeHo=";

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoScan() {
        clb.a(this);
        openCamera();
    }

    private final void handleQRScanResult(String scanResult) {
        List listEmptyList;
        if (!StringsKt__StringsJVMKt.startsWith$default(scanResult, "https://jd.ubicdn.com", false, 2, null)) {
            ToastExtKt.toastShort(this, c1j.common_not_support);
            return;
        }
        String query = new URL(scanResult).getQuery();
        if (query == null || (listEmptyList = StringsKt__StringsKt.split$default((CharSequence) query, new String[]{gv5.CONNECT_STR}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator it = listEmptyList.iterator();
        String str = "";
        String str2 = str;
        while (it.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null);
            if (Intrinsics.areEqual(listSplit$default.get(0), DeviceInfo.Builder.PrivateDataKey.IP) && (str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1)) == null) {
                str = "";
            }
            if (Intrinsics.areEqual(listSplit$default.get(0), b.F) && (str2 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1)) == null) {
                str2 = "";
            }
        }
        IJustDanceApi justDanceExtKt = JustDanceExtKt.getInstance(IJustDanceApi.INSTANCE);
        Intrinsics.checkNotNull(justDanceExtKt, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.justdance.JustDanceImpl");
        ((JustDanceImpl) justDanceExtKt).gotoControlActivity(this, str, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(JustDanceLaunchActivity this$0, View view) {
        String model;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.96.0.1.37441");
        Object[] objArr = new Object[2];
        objArr[0] = "device_model";
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[1] = model;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        SportPreference sportPreference = SportPreference.INSTANCE;
        if (!sportPreference.getSHOW_JD_POWER_GUIDE()) {
            this$0.gotoScan();
        } else {
            sportPreference.setSHOW_JD_POWER_GUIDE(false);
            this$0.showPowerGuideDialog();
        }
    }

    private final void openCamera() {
        if (!PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.CAMERA"})) {
            QRCodeExportKt.launchToQRCodeScan$default(this, null, null, false, false, null, 31, null);
            return;
        }
        final Function0 function0 = new Function0() { // from class: ayd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceLaunchActivity.openCamera$lambda$5(this.f3571a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
        } else {
            PermissionsUtil.INSTANCE.showCameraPermissionDialog(this, "android.permission.CAMERA", new PermissionsUtil.PermissionAuthDialogAgreeListener() { // from class: com.xiaomi.fitness.sport.view.justdance.launch.JustDanceLaunchActivity.openCamera.1
                @Override // com.xiaomi.fitness.baseui.utils.PermissionsUtil.PermissionAuthDialogAgreeListener
                public void onAuthDialogAgree(String permission) {
                    Intrinsics.checkNotNullParameter(permission, "permission");
                    function0.invoke();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCamera$lambda$5(final JustDanceLaunchActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionExtKt.permission(this$0, "android.permission.CAMERA", ResourceExtKt.getString(c1j.N), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: byd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceLaunchActivity.openCamera$lambda$5$lambda$4(this.f4722a, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCamera$lambda$5$lambda$4(final JustDanceLaunchActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: yxd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceLaunchActivity.openCamera$lambda$5$lambda$4$lambda$1(this.f40662a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: zxd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceLaunchActivity.openCamera$lambda$5$lambda$4$lambda$3(this.f41773a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCamera$lambda$5$lambda$4$lambda$1(JustDanceLaunchActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        QRCodeExportKt.launchToQRCodeScan$default(this$0, null, null, false, false, null, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCamera$lambda$5$lambda$4$lambda$3(final JustDanceLaunchActivity this$0, final String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, this$0, null, null, null, new Function0() { // from class: dyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceLaunchActivity.openCamera$lambda$5$lambda$4$lambda$3$lambda$2(this.f16058a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCamera$lambda$5$lambda$4$lambda$3$lambda$2(JustDanceLaunchActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.INSTANCE.showSettingDialog(this$0, it, false, null);
        return Unit.INSTANCE;
    }

    private final void showPowerGuideDialog() {
        new CommonDialog.c("").setDialogTitle(c1j.f2).setDialogDescription(c1j.d2).setPositiveText(c1j.D0).setNegativeText(c1j.e2).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.justdance.launch.JustDanceLaunchActivity.showPowerGuideDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    JustDanceLaunchActivity.this.gotoScan();
                } else if (which == -1) {
                    d2m.r(JustDanceLaunchActivity.this);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.M;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return nv1.l;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String stringExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 666 && data != null && (stringExtra = data.getStringExtra("scan_result")) != null) {
            handleQRScanResult(stringExtra);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.justdance.launch.Hilt_JustDanceLaunchActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarNormalTitleMode();
        setTitle(c1j.l2);
        ImageView logo = ((v9n) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(logo, "logo");
        Coil.imageLoader(logo.getContext()).enqueue(new ImageRequest.Builder(logo.getContext()).data(JD_LOGO).target(logo).build());
        ((v9n) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: cyd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceLaunchActivity.onCreate$lambda$0(this.f14860a, view);
            }
        });
    }
}
