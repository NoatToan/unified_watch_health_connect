package com.xiaomi.fitness.device.manager.ui.scan;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mi.health.uri_parser.UriParserExportKt;
import com.mi.health.uri_parser.links.HttpLinkActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridItemSpace;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.extensions.DeviceWebUrlsKt;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManagerExtKt;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import com.xiaomi.fitness.medal.export.AboutManagerExtKt;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.state.StatusPage;
import defpackage.av6;
import defpackage.bji;
import defpackage.dui;
import defpackage.eli;
import defpackage.fai;
import defpackage.nrd;
import defpackage.q16;
import defpackage.s69;
import defpackage.sk5;
import defpackage.uzi;
import defpackage.wcl;
import defpackage.zv1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = DeviceManagerExtKt.SCAN_PATH)
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f*\u0001O\b\u0007\u0018\u0000 `2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001`B\u0007¢\u0006\u0004\b_\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ/\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00152\b\b\u0001\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u000eJ\u001d\u0010%\u001a\u00020\u0006*\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b0\u00101J)\u00105\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0014¢\u0006\u0004\b;\u0010\u000eR\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010AR/\u0010F\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\u00060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010@R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010IR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010JR\"\u0010M\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010#0#0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[¨\u0006a"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceViewModel;", "Lq16;", "Lcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;", "scannedDeviceInfo", "", "bindAfterLogin", "(Lcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;)V", "", "available", "search", "(Z)V", "doSearchAnim", "()V", "", "from", "info", "launchToBind", "(ILcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;)V", "device", "", "to", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;ILjava/lang/String;)V", "searchWithPermission", "permission", "desc", "Lkotlin/Function0;", "callback", "permissionFromSetting", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;)V", "searchWithLocation", "searchWithLocationOrFinish", "searchWithBluetooth", "Landroid/content/Intent;", "intent", "initByExtra", "(Lq16;Landroid/content/Intent;)V", "scanResult", "handleQRScanResult", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "(Landroid/content/Intent;)V", "bindView", "(Lq16;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "mDeviceInfo", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "mShowList", "Z", "Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isConnect", "mListener", "Lkotlin/jvm/functions/Function1;", "isSearching", "Lcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;", "I", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "activityForResult", "Landroidx/activity/result/ActivityResultLauncher;", "com/xiaomi/fitness/device/manager/ui/scan/ScanDeviceActivity$mLookup$2$1", "mLookup$delegate", "Lkotlin/Lazy;", "getMLookup", "()Lcom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceActivity$mLookup$2$1;", "mLookup", "Lcom/xiaomi/fitness/widget/state/StatusPage;", "mStatusPage$delegate", "getMStatusPage", "()Lcom/xiaomi/fitness/widget/state/StatusPage;", "mStatusPage", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nScanDeviceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanDeviceActivity.kt\ncom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,576:1\n326#2,4:577\n326#2,4:581\n1#3:585\n*S KotlinDebug\n*F\n+ 1 ScanDeviceActivity.kt\ncom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceActivity\n*L\n558#1:577,4\n562#1:581,4\n*E\n"})
public final class ScanDeviceActivity extends Hilt_ScanDeviceActivity<ScanDeviceViewModel, q16> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String TAG = "ScanDevice";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    @NotNull
    private final ActivityResultLauncher<Intent> activityForResult;
    private int from;

    @Nullable
    private ScannedDeviceInfo info;
    private boolean isSearching;

    @Nullable
    private DeviceInfo mDeviceInfo;

    @NotNull
    private final Function1<Boolean, Unit> mListener = new Function1() { // from class: acl
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return ScanDeviceActivity.mListener$lambda$0(this.f881a, ((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: mLookup$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLookup;
    private boolean mShowList;

    /* JADX INFO: renamed from: mStatusPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStatusPage;

    @Nullable
    private String to;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceActivity$Companion;", "", "<init>", "()V", "TAG", "", "launch", "", "context", "Landroid/content/Context;", "device", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "showList", "", "launch$device_manager_chinaProductRelease", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit launch$lambda$0(DeviceInfo deviceInfo, boolean z, Intent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.putExtra(DeviceManagerExtKt.PARAM_DEVICE, deviceInfo);
            it.putExtra(DeviceManagerExtKt.PARAM_SHOW_LIST, z);
            it.setFlags(603979776);
            return Unit.INSTANCE;
        }

        public final void launch$device_manager_chinaProductRelease(@NotNull Context context, @Nullable final DeviceInfo device, final boolean showList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Logger.i(ScanDeviceActivity.TAG, "launch() called with: context = " + context + ", device = " + device + ", showList = " + showList);
            LaunchExtensionKt.startActivity(context, (Class<?>) ScanDeviceActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: xcl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ScanDeviceActivity.Companion.launch$lambda$0(device, showList, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity$permissionFromSetting$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/device/manager/ui/scan/ScanDeviceActivity$permissionFromSetting$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C19701 extends av6 {
        final /* synthetic */ Function0<Unit> $callback;
        final /* synthetic */ String $permission;

        public C19701(String str, Function0<Unit> function0) {
            this.$permission = str;
            this.$callback = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(Function0 callback, int i, Intent intent) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            callback.invoke();
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (dialog != null) {
                dialog.dismiss();
            }
            if (which == -1) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ScanDeviceActivity.this.getPackageName(), null));
                ScanDeviceActivity scanDeviceActivity = ScanDeviceActivity.this;
                final Function0<Unit> function0 = this.$callback;
                scanDeviceActivity.startForActivityResult(intent, new Function2() { // from class: ycl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScanDeviceActivity.C19701.onDialogClick$lambda$0(function0, ((Integer) obj).intValue(), (Intent) obj2);
                    }
                });
                return;
            }
            DeviceModelExtKt.logi("Request permission " + this.$permission + " is cancel, finish");
            ScanDeviceActivity.this.finish();
        }
    }

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    public ScanDeviceActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: bcl
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                ScanDeviceActivity.activityForResult$lambda$2(this.f4061a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.activityForResult = activityResultLauncherRegisterForActivityResult;
        this.mLookup = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ccl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.mLookup_delegate$lambda$22(this.f5189a);
            }
        });
        this.mStatusPage = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dcl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.mStatusPage_delegate$lambda$32(this.f15373a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ScanDeviceViewModel access$getMViewModel(ScanDeviceActivity scanDeviceActivity) {
        return (ScanDeviceViewModel) scanDeviceActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activityForResult$lambda$2(ScanDeviceActivity this$0, ActivityResult activityResult) {
        ScannedDeviceInfo scannedDeviceInfo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!RegionPreference.INSTANCE.getHEALTH_DEVICE_ACCESS_SWITCH() || (scannedDeviceInfo = this$0.info) == null) {
            return;
        }
        bindDevice$default(this$0, scannedDeviceInfo, this$0.from, null, 4, null);
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("ScanDeviceActivity.kt", ScanDeviceActivity.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("12", "bindAfterLogin", "com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity", "com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo", "scannedDeviceInfo", "", "void"), SportReportBaseParser.ReportType.divingOTU);
    }

    @NeedLogin
    private final void bindAfterLogin(ScannedDeviceInfo scannedDeviceInfo) throws Throwable {
        nrd nrdVarC = s69.c(ajc$tjp_0, this, this, scannedDeviceInfo);
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new wcl(new Object[]{this, scannedDeviceInfo, nrdVarC}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = ScanDeviceActivity.class.getDeclaredMethod("bindAfterLogin", ScannedDeviceInfo.class).getAnnotation(NeedLogin.class);
            ajc$anno$0 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindDevice(ScannedDeviceInfo device, int from, String to) {
        if (!EcoBindDeviceManagerExtKt.getInstance(EcoBindDeviceManager.INSTANCE).shouldEcoDeviceBindActivity(this, device.getBleMac(), device.getModel(), device.getBleName(), device.getOob(), device.getDeviceinfo().getBigIcon(), device.getDeviceinfo().getName(), device.getDeviceinfo().isSportMachine(), device.getBleDevice().getPacket(), from)) {
            BindDeviceActivity.INSTANCE.launch$device_manager_chinaProductRelease(this, device, from, to);
        }
        ((ScanDeviceViewModel) getMViewModel()).stopSearch();
        if (this.mShowList) {
            return;
        }
        finish();
    }

    public static /* synthetic */ void bindDevice$default(ScanDeviceActivity scanDeviceActivity, ScannedDeviceInfo scannedDeviceInfo, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        scanDeviceActivity.bindDevice(scannedDeviceInfo, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$23(q16 this_bindView, ScanDeviceActivity this$0, View view) {
        DeviceInfo deviceInfo;
        DeviceInfo deviceInfo2;
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScanDeviceViewModel scanDeviceViewModelA0 = this_bindView.A0();
        String model = null;
        if (!Intrinsics.areEqual((scanDeviceViewModelA0 == null || (deviceInfo2 = scanDeviceViewModelA0.getDeviceInfo()) == null) ? null : deviceInfo2.getModel(), "runmi.exbike.jscrm1")) {
            ScanDeviceViewModel scanDeviceViewModelA1 = this_bindView.A0();
            if (scanDeviceViewModelA1 != null && (deviceInfo = scanDeviceViewModelA1.getDeviceInfo()) != null) {
                model = deviceInfo.getModel();
            }
            if (!Intrinsics.areEqual(model, "yesoul.exbike.jsc01y")) {
                WebViewUtilKt.startWebView$default(DeviceWebUrlsKt.getScanHelpUrl(), this$0.getString(uzi.C1), false, false, null, false, null, false, 252, null);
                return;
            }
        }
        WebViewUtilKt.startWebView$default(DeviceWebUrlsKt.getBikeScanHelpUrl("ksmb.treadmill.m1v1"), this$0.getString(uzi.C1), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$24(ScanDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchExtensionKt.startActivity$default(this$0, AddDeviceActivity.class, (Function1) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$25(ScanDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        search$default(this$0, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$26(ScanDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        search$default(this$0, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void doSearchAnim() {
        if (this.mShowList) {
            ((q16) getMBinding()).E.startScan();
        }
    }

    private final ScanDeviceActivity$mLookup$2$1 getMLookup() {
        return (ScanDeviceActivity$mLookup$2$1) this.mLookup.getValue();
    }

    private final void handleQRScanResult(final String scanResult) {
        Logger.i(TAG, "handleQRScanResult: " + scanResult);
        if (TextUtils.isEmpty(scanResult)) {
            return;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(scanResult, "https:", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(scanResult, "http:", false, 2, null)) {
            LaunchExtensionKt.startActivity(this, (Class<?>) HttpLinkActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: tcl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ScanDeviceActivity.handleQRScanResult$lambda$29(scanResult, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleQRScanResult$lambda$29(String scanResult, Intent it) {
        Intrinsics.checkNotNullParameter(scanResult, "$scanResult");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra(UriParserExportKt.KEY_LINK_URI, scanResult);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initByExtra(q16 q16Var, Intent intent) {
        ViewStub viewStubH;
        DeviceInfo deviceInfo = intent != null ? (DeviceInfo) intent.getParcelableExtra(DeviceManagerExtKt.PARAM_DEVICE) : null;
        this.mDeviceInfo = deviceInfo;
        if (deviceInfo == null) {
            Product product = intent != null ? (Product) intent.getParcelableExtra(DeviceManagerExtKt.PARAM_PRODUCT) : null;
            this.mDeviceInfo = product != null ? DeviceExtKt.toDeviceInfo(product) : null;
        }
        boolean booleanExtra = intent != null ? intent.getBooleanExtra(DeviceManagerExtKt.PARAM_SHOW_LIST, false) : false;
        this.mShowList = booleanExtra;
        DeviceInfo deviceInfo2 = this.mDeviceInfo;
        Logger.d(TAG, "bindView: showList " + booleanExtra + ", info = " + (deviceInfo2 != null ? deviceInfo2.getModel() : null));
        ((ScanDeviceViewModel) getMViewModel()).getIsShowList().set(this.mShowList);
        ((ScanDeviceViewModel) getMViewModel()).setDeviceInfo(this.mDeviceInfo);
        if (this.mShowList) {
            setTitleBackground(bji.e);
            q16Var.A.setBackgroundColor(getColor(bji.e));
        }
        DeviceInfo deviceInfo3 = this.mDeviceInfo;
        if (deviceInfo3 == null || deviceInfo3.getScanMode() == 1) {
            return;
        }
        q16Var.J.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: fcl
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                ScanDeviceActivity.initByExtra$lambda$28$lambda$27(this.f17653a, viewStub, view);
            }
        });
        if (q16Var.J.i() || (viewStubH = q16Var.J.h()) == null) {
            return;
        }
        viewStubH.inflate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initByExtra$lambda$28$lambda$27(ScanDeviceActivity this$0, ViewStub viewStub, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewDataBinding viewDataBindingC = sk5.c(view);
        if (viewDataBindingC != null) {
            viewDataBindingC.q0(zv1.f41707k, this$0.getMViewModel());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchToBind(final int from, final ScannedDeviceInfo info) {
        RNProduct productByModel;
        if (!info.getDeviceinfo().isVersionSupport()) {
            ToastExtKt.toastShort(this, uzi.a2);
            return;
        }
        try {
            productByModel = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(info.getModel());
        } catch (Exception e) {
            DeviceModelExtKt.logi("RN getProductByModel error: " + e);
            productByModel = null;
        }
        if (productByModel != null && productByModel.getAccessType() != 2 && !Intrinsics.areEqual("yunmai.scales.ms3001", productByModel.getModel())) {
            ToastExtKt.toastShort(this, uzi.a2);
            return;
        }
        if (info.isWearOs() && WearOsExtKt.getInstance(WearOSUtil.INSTANCE).isWearosRequirementNotPass()) {
            ToastExtKt.toastLong(this, "Please upgrade Google GMS version first");
            return;
        }
        if (productByModel != null) {
            if (RegionPreference.INSTANCE.getHEALTH_DEVICE_ACCESS_SWITCH()) {
                bindDevice$default(this, info, from, null, 4, null);
                return;
            }
            this.info = info;
            this.from = from;
            AboutManagerExtKt.getInstance(AboutManager.INSTANCE).showHealthDeviceAccessSwitchDialog(this, this.activityForResult);
            return;
        }
        if (EcoBindDeviceManagerExtKt.getInstance(EcoBindDeviceManager.INSTANCE).isNotShowDisconnectTipDevices(info.getModel()) || !DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected()) {
            bindDevice(info, from, this.to);
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogDescriptionString(new DialogParams.DialogDescriptionString(uzi.c0, info.getBleDevice().getName())).setNegativeText(uzi.c).setPositiveText(uzi.d).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity.launchToBind.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    ScanDeviceActivity.bindDevice$default(ScanDeviceActivity.this, info, from, null, 4, null);
                    ScanDeviceActivity.access$getMViewModel(ScanDeviceActivity.this).stopSearch();
                } else {
                    if (ScanDeviceActivity.this.mShowList) {
                        return;
                    }
                    DeviceModelExtKt.logi("Finish because of cancel bind device when don't show list");
                    ScanDeviceActivity.this.finish();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mListener$lambda$0(ScanDeviceActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.search(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanDeviceActivity$mLookup$2$1 mLookup_delegate$lambda$22(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new ScanDeviceActivity$mLookup$2$1(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final StatusPage mStatusPage_delegate$lambda$32(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RecyclerView deviceRvScanDeviceList = ((q16) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(deviceRvScanDeviceList, "deviceRvScanDeviceList");
        return new StatusPage(deviceRvScanDeviceList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(ScanDeviceActivity this$0, ScannedDeviceInfo scannedDeviceInfo, int i, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(scannedDeviceInfo, "scannedDeviceInfo");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() || scannedDeviceInfo.isWearOs()) {
            this$0.launchToBind(1, scannedDeviceInfo);
        } else {
            this$0.bindAfterLogin(scannedDeviceInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(ScanDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceModelExtKt.logi("search status is " + num);
        boolean z = false;
        if (num != null && num.intValue() == 2) {
            DeviceInfo deviceInfo = this$0.mDeviceInfo;
            if (deviceInfo == null || !deviceInfo.isBand()) {
                ((q16) this$0.getMBinding()).E.stopScan();
            } else {
                ScannedDeviceInfo scannedDeviceInfo = ((ScanDeviceViewModel) this$0.getMViewModel()).getScannedDeviceList().get(0);
                Intrinsics.checkNotNullExpressionValue(scannedDeviceInfo, "get(...)");
                this$0.launchToBind(2, scannedDeviceInfo);
            }
        } else if (num != null && num.intValue() == 3) {
            ((q16) this$0.getMBinding()).E.empty();
        } else if (num != null && num.intValue() == 1) {
            this$0.doSearchAnim();
        } else if (num != null && num.intValue() == 4) {
            ((q16) this$0.getMBinding()).E.stopScan();
        }
        if (num != null && num.intValue() == 1) {
            z = true;
        }
        this$0.isSearching = z;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(Boolean bool) {
        RegionPreference.INSTANCE.setHEALTH_DEVICE_ACCESS_SWITCH(bool.booleanValue());
        return Unit.INSTANCE;
    }

    private final void permissionFromSetting(String permission, int desc, Function0<Unit> callback) {
        if (!PermissionExtKt.isPermissionDeniedForever(this, permission)) {
            CommonDialog commonDialogCreate = new CommonDialog.c("setting_permission").setDialogTitle(uzi.m2).setDialogDescription(desc).setPositiveText(uzi.n2).setNegativeText(uzi.c).create();
            commonDialogCreate.setCancelable(false);
            commonDialogCreate.addDialogCallback(new C19701(permission, callback));
            commonDialogCreate.showIfNeed(getSupportFragmentManager());
            return;
        }
        DeviceModelExtKt.logi("Permission " + permission + " is denied forever, finish!");
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void search(boolean available) {
        DeviceModelExtKt.logi("ScanDeviceActivity", "search: " + available + ">>>" + this.isSearching);
        if (!available) {
            this.isSearching = false;
            ((ScanDeviceViewModel) getMViewModel()).stopSearch();
            ((q16) getMBinding()).E.stopScan();
            showNoNetwork();
            return;
        }
        if (this.isSearching) {
            return;
        }
        this.isSearching = true;
        showContent();
        ((ScanDeviceViewModel) getMViewModel()).clearCollect();
        BluetoothPermissionUtil.INSTANCE.showBluetoothSyncDataDialogIfNeed(this, new Function1() { // from class: zbl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceActivity.search$lambda$6(this.f41101a, ((Boolean) obj).booleanValue());
            }
        });
    }

    public static /* synthetic */ void search$default(ScanDeviceActivity scanDeviceActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = NetworkExtKt.isNetworkAvailable();
        }
        scanDeviceActivity.search(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit search$lambda$6(ScanDeviceActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.searchWithPermission();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    private final void searchWithBluetooth() {
        BluetoothExtKt.openBluetooth(this, new Function0() { // from class: gcl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithBluetooth$lambda$20(this.f18837a);
            }
        }, new Function1() { // from class: hcl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceActivity.searchWithBluetooth$lambda$21(this.f19937a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit searchWithBluetooth$lambda$20(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doSearchAnim();
        ((ScanDeviceViewModel) this$0.getMViewModel()).startSearch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithBluetooth$lambda$21(ScanDeviceActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceModelExtKt.logi("Can't open bluetooth, finish!");
        this$0.finish();
        return Unit.INSTANCE;
    }

    private final void searchWithLocation() {
        if (LocationExtKt.isLocationEnable(this)) {
            searchWithBluetooth();
        } else {
            BluetoothPermissionUtil.INSTANCE.turnOnPermissionSetting(this, uzi.D1, "android.settings.LOCATION_SOURCE_SETTINGS", new Function2() { // from class: ncl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScanDeviceActivity.searchWithLocation$lambda$19(this.f27787a, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithLocation$lambda$19(ScanDeviceActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.searchWithLocationOrFinish();
        return Unit.INSTANCE;
    }

    private final void searchWithLocationOrFinish() {
        if (LocationExtKt.isLocationEnable(this)) {
            searchWithBluetooth();
        } else {
            DeviceModelExtKt.logi("location is disable, finish!");
            finish();
        }
    }

    private final void searchWithPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            BluetoothPermissionUtil.requestBluetoothPermission$default(BluetoothPermissionUtil.INSTANCE, this, false, new Function1() { // from class: ucl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ScanDeviceActivity.searchWithPermission$lambda$12(this.f35624a, (MultiplePermissionsBuilder) obj);
                }
            }, 2, null);
        } else {
            BluetoothPermissionUtil.requestLocationPermission$default(BluetoothPermissionUtil.INSTANCE, this, false, new Function1() { // from class: vcl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ScanDeviceActivity.searchWithPermission$lambda$18(this.f36750a, (MultiplePermissionsBuilder) obj);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$12(final ScanDeviceActivity this$0, MultiplePermissionsBuilder requestBluetoothPermission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestBluetoothPermission, "$this$requestBluetoothPermission");
        requestBluetoothPermission.allGranted(new Function0() { // from class: icl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithPermission$lambda$12$lambda$7(this.f21001a);
            }
        });
        requestBluetoothPermission.denied(new Function1() { // from class: jcl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceActivity.searchWithPermission$lambda$12$lambda$11(this.f22649a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$12$lambda$11(final ScanDeviceActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.BLUETOOTH_SCAN", this$0, it, null, new Function0() { // from class: xbl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithPermission$lambda$12$lambda$11$lambda$8(this.f38946a);
            }
        }, new Function0() { // from class: ybl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithPermission$lambda$12$lambda$11$lambda$10(this.f40019a);
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$12$lambda$11$lambda$10(final ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.permissionFromSetting("android.permission.BLUETOOTH_SCAN", uzi.j1, new Function0() { // from class: qcl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithPermission$lambda$12$lambda$11$lambda$10$lambda$9(this.f31374a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$12$lambda$11$lambda$10$lambda$9(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (PermissionExtKt.isPermissionGranted(this$0, "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT")) {
            this$0.searchWithBluetooth();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$12$lambda$11$lambda$8(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$12$lambda$7(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (PermissionExtKt.isPermissionGranted(this$0, "android.permission.BLUETOOTH_SCAN")) {
            this$0.searchWithBluetooth();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$18(final ScanDeviceActivity this$0, MultiplePermissionsBuilder requestLocationPermission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestLocationPermission, "$this$requestLocationPermission");
        requestLocationPermission.allGranted(new Function0() { // from class: rcl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithPermission$lambda$18$lambda$13(this.f32413a);
            }
        });
        requestLocationPermission.denied(new Function1() { // from class: scl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceActivity.searchWithPermission$lambda$18$lambda$17(this.f33509a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$18$lambda$13(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.searchWithLocation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$18$lambda$17(final ScanDeviceActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.ACCESS_FINE_LOCATION", this$0, it, null, new Function0() { // from class: vbl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithPermission$lambda$18$lambda$17$lambda$14(this.f36718a);
            }
        }, new Function0() { // from class: wbl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithPermission$lambda$18$lambda$17$lambda$16(this.f37812a);
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$18$lambda$17$lambda$14(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$18$lambda$17$lambda$16(final ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.permissionFromSetting("android.permission.ACCESS_FINE_LOCATION", uzi.m1, new Function0() { // from class: ubl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceActivity.searchWithPermission$lambda$18$lambda$17$lambda$16$lambda$15(this.f35602a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit searchWithPermission$lambda$18$lambda$17$lambda$16$lambda$15(ScanDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (PermissionExtKt.isPermissionGranted(this$0, "android.permission.ACCESS_FINE_LOCATION")) {
            this$0.searchWithLocationOrFinish();
        } else {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final q16 q16Var) {
        Intrinsics.checkNotNullParameter(q16Var, "<this>");
        initByExtra(q16Var, getIntent());
        q16Var.H.setOnClickListener(new View.OnClickListener() { // from class: tbl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanDeviceActivity.bindView$lambda$23(q16Var, this, view);
            }
        });
        q16Var.F.setOnClickListener(new View.OnClickListener() { // from class: ecl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanDeviceActivity.bindView$lambda$24(this.f16502a, view);
            }
        });
        q16Var.E.setOnRetryListener(new View.OnClickListener() { // from class: ocl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanDeviceActivity.bindView$lambda$25(this.f29006a, view);
            }
        });
        q16Var.G.setOnClickListener(new View.OnClickListener() { // from class: pcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanDeviceActivity.bindView$lambda$26(this.f30249a, view);
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.D(getMLookup());
        q16Var.D.setLayoutManager(gridLayoutManager);
        float dimen = ResourceExtKt.getDimen(this, eli.e);
        q16Var.D.addItemDecoration(new GridItemSpace(dimen, dimen, true));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dui.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, com.xiaomi.fitness.baseui.view.PageState
    @NotNull
    public StatusPage getMStatusPage() {
        return (StatusPage) this.mStatusPage.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return zv1.f41707k;
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
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (SettingsPropertiesUtil.INSTANCE.isFolded(this)) {
            getMLookup().setSpanSize(2);
        } else {
            getMLookup().setSpanSize(1);
        }
        int dimen = (int) ResourceExtKt.getDimen(this, eli.f16776b);
        int dimen2 = (int) ResourceExtKt.getDimen(this, eli.f16775a);
        FrameLayout deviceFlScanContent = ((q16) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(deviceFlScanContent, "deviceFlScanContent");
        ViewGroup.LayoutParams layoutParams = deviceFlScanContent.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(dimen);
        marginLayoutParams.setMarginEnd(dimen2);
        deviceFlScanContent.setLayoutParams(marginLayoutParams);
        ScanningView deviceSvScanning = ((q16) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(deviceSvScanning, "deviceSvScanning");
        ViewGroup.LayoutParams layoutParams2 = deviceSvScanning.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(dimen);
        marginLayoutParams2.setMarginEnd(dimen);
        deviceSvScanning.setLayoutParams(marginLayoutParams2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.manager.ui.scan.Hilt_ScanDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(uzi.q);
        Intent intent = getIntent();
        this.to = intent != null ? intent.getStringExtra("to") : null;
        ((ScanDeviceViewModel) getMViewModel()).getAdapter().setOnItemClickListener(new Function3() { // from class: kcl
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ScanDeviceActivity.onCreate$lambda$3(this.f23722a, (ScannedDeviceInfo) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        ((ScanDeviceViewModel) getMViewModel()).getSearchStatus$device_manager_chinaProductRelease().observe(this, new ScanDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lcl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceActivity.onCreate$lambda$4(this.f24906a, (Integer) obj);
            }
        }));
        ((ScanDeviceViewModel) getMViewModel()).getHealthDeviceAccessSwitch().observe(this, new ScanDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mcl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceActivity.onCreate$lambda$5((Boolean) obj);
            }
        }));
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            ((ScanDeviceViewModel) getMViewModel()).getCommonConfig();
        }
        search$default(this, false, 1, null);
        NetworkExtKt.registerConnectChangeListener(this.mListener);
    }

    @Override // com.xiaomi.fitness.device.manager.ui.scan.Hilt_ScanDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        NetworkExtKt.unregisterConnectChangeListener(this.mListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        initByExtra((q16) getMBinding(), intent);
        this.isSearching = false;
        search$default(this, false, 1, null);
    }
}
