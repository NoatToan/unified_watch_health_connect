package com.xiaomi.hm.health.device.bind;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.CaptureQRApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.dsl.RequestMultiplePermissionDsl;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.account.AccountCheckAgeHelper;
import com.huami.watch.companion.account.Country;
import com.huami.watch.companion.account.CountryManager;
import com.huami.watch.companion.account.UserInfo;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.bind.BindBleHelper;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.event.SearchWatchErrorEvent;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.ui.activity.SearchBindDeviceActivity;
import com.huami.watch.companion.ui.adapter.BleDeviceBindEvent;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.qr.QRUtil;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.huami.web.service.WebViewService;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMBindDeviceActivity;
import com.xiaomi.hm.health.device.amazfit_watch.BindWatchUtils;
import com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity;
import com.xiaomi.hm.health.device.capturedevice.DeviceQRInfo;
import com.xiaomi.hm.health.device.permission.BindDevicePermissionManager;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Z2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001ZB\u0007¢\u0006\u0004\bX\u0010YJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0003J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J!\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0002J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0002J\u001c\u0010\u0018\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002JJ\u0010'\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020!H\u0002J\u0012\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(H\u0014J\u0019\u0010+\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b+\u0010,J\"\u00101\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010/H\u0014J\b\u00102\u001a\u00020\u0005H\u0014R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010@\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010DR\u001d\u0010J\u001a\u00020F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bH\u0010IR\u001d\u0010O\u001a\u00020K8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010=\u001a\u0004\bM\u0010NR\u001d\u0010T\u001a\u00020P8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010=\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006["}, d2 = {"Lcom/xiaomi/hm/health/device/bind/UnifyBindWaySelectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lio/reactivex/functions/Consumer;", "", "Lorg/koin/core/component/KoinComponent;", "", SOAP.XMLNS, "", "K", "J", "V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "state", "L", "(Landroid/content/Context;Ljava/lang/Integer;)V", "F", "", "result", "B", "z", ExifInterface.GPS_DIRECTION_TRUE, "version", "model", "t", "Landroid/app/Activity;", "activity", "deviceModel", "W", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "from", "messageResId", "linkResId", "Ljava/lang/Runnable;", "linkRun", "positive", "positiveRun", "negative", "negativeRun", "P", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "accept", "(Ljava/lang/Integer;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onDestroy", "Lio/reactivex/disposables/Disposable;", "a", "Lio/reactivex/disposables/Disposable;", "mSubscription", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "b", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "myFailureDlg", "Lcom/huami/web/service/WebViewService;", "c", "Lkotlin/Lazy;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/web/service/WebViewService;", "service", "Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", GoogleApiAvailabilityLight.a, "v", "()Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "bindServiceApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "e", "x", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsActivity", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "f", "y", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/huami/devicex/injection/basic/CaptureQRApi;", "g", "w", "()Lcom/huami/devicex/injection/basic/CaptureQRApi;", "captureQRApi", "h", "Z", "isBand", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class UnifyBindWaySelectActivity extends AppCompatActivity implements Consumer<Integer>, KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "UnifyBindWaySelectActivity";

    @NotNull
    private static final String i = "is_band";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Disposable mSubscription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment myFailureDlg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy service;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy bindServiceApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsActivity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy captureQRApi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isBand;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/UnifyBindWaySelectActivity$Companion;", "", "Landroid/app/Activity;", "from", "", "band", "", WebConstant.QueryParam.LAUNCH, "", "KEY_IS_BAND", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Activity from, boolean band) {
            Intent intent = new Intent(from, (Class<?>) UnifyBindWaySelectActivity.class);
            intent.putExtra(UnifyBindWaySelectActivity.i, band);
            from.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleDecode: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UnifyBindWaySelectActivity.this.V();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ UnifyBindWaySelectActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UnifyBindWaySelectActivity unifyBindWaySelectActivity) {
                super(1);
                this.a = unifyBindWaySelectActivity;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                Application application = this.a.getApplication();
                CompanionApplication companionApplication = application instanceof CompanionApplication ? (CompanionApplication) application : null;
                if (companionApplication != null) {
                    companionApplication.initPhoneConnection();
                }
                this.a.s();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(1);
        }

        public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            requestMultiplePermissionDsl.onPermissionsGranted(new a(UnifyBindWaySelectActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            a(requestMultiplePermissionDsl);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnifyBindWaySelectActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.service = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WebViewService>() { // from class: com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.web.service.WebViewService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewService invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WebViewService.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.bindServiceApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<BindServiceApi>() { // from class: com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.bind.BindServiceApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BindServiceApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BindServiceApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceUtilsActivity = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceXNavigator invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.captureQRApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<CaptureQRApi>() { // from class: com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.CaptureQRApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CaptureQRApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(CaptureQRApi.class), objArr8, objArr9);
            }
        });
    }

    private final WebViewService A() {
        return (WebViewService) this.service.getValue();
    }

    private final void B(String result) {
        Object objM3845constructorimpl;
        HMLog.info(TAG, new a(result));
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(BindHelper.decodeAddress(result));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.i(TAG, "e: " + thM3848exceptionOrNullimpl, new Object[0]);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        String str = (String) objM3845constructorimpl;
        boolean zCheckBluetoothAddress = BluetoothAdapter.checkBluetoothAddress(str);
        DeviceQRInfo deviceQRInfo = w().getDeviceQRInfo(result);
        if (zCheckBluetoothAddress) {
            String strDecodeModel = BindHelper.decodeModel(result);
            if (TextUtils.isEmpty(strDecodeModel)) {
                strDecodeModel = !Config.isLocaleOversea(this) ? DeviceSource.MODEL_HUANGHE : DeviceSource.MODEL_HUANGHE_PACE;
            }
            if (!DeviceSource.isAvailableWatchModel(strDecodeModel)) {
                T();
                BindHelper.getHelper().notifyStateChanged(-2);
                return;
            }
            if (DeviceSource.isSeriesEverest2(strDecodeModel)) {
                BindHelper.getHelper().release();
                BindBleHelper.newHelper().init(this, this);
            }
            BindHelper.getHelper().saveBindingDevice(str);
            BindHelper.getHelper().notifyStateChanged(3);
            t(BindHelper.decodeVersion(result), strDecodeModel);
        } else if (Intrinsics.areEqual("openbluetooth", str)) {
            BindHelper.getHelper().notifyStateChanged(-2);
            new AlertDialogFragment.Builder(this).setTitle(R.string.qr_invalid).setMessage(R.string.watch_bluetooth_off).setPositiveButton(R.string.btn_known, new DialogInterface.OnClickListener() { // from class: h28
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    UnifyBindWaySelectActivity.D(dialogInterface, i2);
                }
            }).setNegativeButton(R.string.quit, new DialogInterface.OnClickListener() { // from class: g28
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    UnifyBindWaySelectActivity.E(dialogInterface, i2);
                }
            }).show(getSupportFragmentManager());
        } else if (deviceQRInfo != null) {
            HMDeviceSource hMDeviceSourceFromPnP = HMDeviceSource.fromPnP(deviceQRInfo.getPnpNum(), deviceQRInfo.getPnpVersion());
            int iSourceToBandType = this.isBand ? v().sourceToBandType(hMDeviceSourceFromPnP) : v().sourceToWatchType(hMDeviceSourceFromPnP);
            if (iSourceToBandType != 24) {
                y().startBindDeviceActivityByQrCode(this, iSourceToBandType, deviceQRInfo);
                finish();
            } else {
                T();
                BindHelper.getHelper().notifyStateChanged(-2);
            }
        } else {
            BindHelper.getHelper().notifyStateChanged(-2);
            Analytics.event(this, AnalyticsEvents.EVENT_SCAN_QR_FAILED, 1);
            new AlertDialogFragment.Builder(this).setTitle(R.string.qr_invalid).setMessage(z()).setNeutralButton(R.string.btn_known, new DialogInterface.OnClickListener() { // from class: u18
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    UnifyBindWaySelectActivity.C(this.a, dialogInterface, i2);
                }
            }).show(getSupportFragmentManager());
        }
        Analytics.event(this, AnalyticsEvents.EVENT_SCAN_QR, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(UnifyBindWaySelectActivity unifyBindWaySelectActivity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        Analytics.event(unifyBindWaySelectActivity, AnalyticsEvents.EVENT_BIND_FAILED_CONFIRM, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void F() {
        this.mSubscription = RxBus.get().toObservable().subscribe(new Consumer() { // from class: x18
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifyBindWaySelectActivity.G(this.a, obj);
            }
        }, new Consumer() { // from class: z18
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifyBindWaySelectActivity.I((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(final UnifyBindWaySelectActivity unifyBindWaySelectActivity, Object obj) {
        if (!(obj instanceof BleDeviceBindEvent)) {
            if (obj instanceof SearchWatchErrorEvent) {
                SearchWatchErrorEvent searchWatchErrorEvent = (SearchWatchErrorEvent) obj;
                final BaseFragmentActivity activity = searchWatchErrorEvent.getActivity();
                unifyBindWaySelectActivity.P(activity, R.string.bind_chaohu_not_found_tips, R.string.bind_get_help, new Runnable() { // from class: a28
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnifyBindWaySelectActivity.H(this.a, activity);
                    }
                }, R.string.bind_try_again, searchWatchErrorEvent.getPositiveRun(), R.string.not_bind_now, searchWatchErrorEvent.getNegativeRun());
                return;
            }
            return;
        }
        BleDeviceBindEvent bleDeviceBindEvent = (BleDeviceBindEvent) obj;
        Activity activity2 = bleDeviceBindEvent.getActivity();
        SearchBindDeviceActivity.DeviceState deviceState = bleDeviceBindEvent.getDeviceState();
        HMDeviceSource hMDeviceSourceComponent1 = deviceState.getSource();
        BluetoothDevice bluetoothDeviceComponent3 = deviceState.getDevice();
        if (unifyBindWaySelectActivity.v().sourceToWatchType(hMDeviceSourceComponent1) == 24) {
            activity2.finish();
            unifyBindWaySelectActivity.T();
        } else {
            unifyBindWaySelectActivity.y().startBindWatchByScanAdv(activity2, bluetoothDeviceComponent3, hMDeviceSourceComponent1);
            activity2.finish();
            unifyBindWaySelectActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(UnifyBindWaySelectActivity unifyBindWaySelectActivity, BaseFragmentActivity baseFragmentActivity) {
        unifyBindWaySelectActivity.y().showDeviceHelperActivity(baseFragmentActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    private final void J() {
        startActivity(new Intent(this, (Class<?>) SearchBindDeviceActivity.class));
    }

    @SuppressLint({"MissingPermission"})
    private final boolean K() {
        return BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    private final void L(Context context, Integer state) {
        if (state != null && state.intValue() == -6) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(UnifyBindWaySelectActivity unifyBindWaySelectActivity, View view) {
        unifyBindWaySelectActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(final UnifyBindWaySelectActivity unifyBindWaySelectActivity, View view) {
        if (Build.VERSION.SDK_INT > 30) {
            BindDevicePermissionManager.INSTANCE.requestBlueAndCameraPermission(unifyBindWaySelectActivity, unifyBindWaySelectActivity.new c());
        } else {
            BindWatchUtils.INSTANCE.requestForNeededPermission(unifyBindWaySelectActivity, new BindWatchUtils.IUserAction() { // from class: com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity$onCreate$2$2
                @Override // com.xiaomi.hm.health.device.amazfit_watch.BindWatchUtils.IUserAction
                public void onUserAllow(boolean allow) {
                    if (allow) {
                        this.a.V();
                        return;
                    }
                    DeviceUtilsApi deviceUtilsApiX = this.a.x();
                    UnifyBindWaySelectActivity unifyBindWaySelectActivity2 = this.a;
                    deviceUtilsApiX.showPermissionDenieDialog(unifyBindWaySelectActivity2, unifyBindWaySelectActivity2.getString(R.string.open_loaction_msg));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(UnifyBindWaySelectActivity unifyBindWaySelectActivity, View view) {
        if (!unifyBindWaySelectActivity.K()) {
            InitialState.toBluetoothOnTip(unifyBindWaySelectActivity);
        } else if (Build.VERSION.SDK_INT > 30) {
            BindDevicePermissionManager.INSTANCE.requestBluePermission(unifyBindWaySelectActivity, unifyBindWaySelectActivity.new d());
        } else {
            unifyBindWaySelectActivity.s();
        }
    }

    private final void P(BaseFragmentActivity from, int messageResId, int linkResId, final Runnable linkRun, int positive, final Runnable positiveRun, int negative, final Runnable negativeRun) {
        if (from == null) {
            return;
        }
        AlertDialogFragment alertDialogFragment = this.myFailureDlg;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            String string = getString(linkResId);
            AlertDialogFragment.Builder negativeButton = new AlertDialogFragment.Builder(from).setMessage(getString(messageResId, new Object[]{string})).setPositiveButton(positive, new DialogInterface.OnClickListener() { // from class: d28
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    UnifyBindWaySelectActivity.Q(positiveRun, dialogInterface, i2);
                }
            }).setNegativeButton(negative, new DialogInterface.OnClickListener() { // from class: e28
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    UnifyBindWaySelectActivity.R(negativeRun, dialogInterface, i2);
                }
            });
            if (!TextUtils.isEmpty(string)) {
                negativeButton.setLink(string, new View.OnClickListener() { // from class: w18
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UnifyBindWaySelectActivity.S(linkRun, view);
                    }
                });
            }
            if (isFinishing() || isDestroyed()) {
                return;
            }
            AlertDialogFragment alertDialogFragmentCreate = negativeButton.create();
            this.myFailureDlg = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(from.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Runnable runnable, DialogInterface dialogInterface, int i2) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Runnable runnable, DialogInterface dialogInterface, int i2) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Runnable runnable, View view) {
        runnable.run();
    }

    private final void T() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.can_not_bind).setMessage(R.string.unavailable_model_upgrade_tips).setNeutralButton(R.string.btn_known, new DialogInterface.OnClickListener() { // from class: f28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UnifyBindWaySelectActivity.U(dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        Log.i(TAG, "Start Bind!!", new Object[0]);
        BindHelper.getHelper().release();
        BindHelper.newHelper().start(this, this);
        Analytics.event(this, AnalyticsEvents.EVENT_GUILD_START_BIND);
    }

    private final void W(Activity activity, String deviceModel) {
        final String strUrlDisneyGuardian;
        String string = activity.getString(R.string.device_name_default);
        if (DeviceSource.isSeriesXihu(deviceModel)) {
            string = activity.getString(R.string.device_name_xihu_disney);
            strUrlDisneyGuardian = Cloud.urlDisneyGuardian();
        } else if (DeviceSource.isSeriesEverest2(deviceModel)) {
            string = activity.getString(R.string.device_name_everest2_starwar);
            strUrlDisneyGuardian = Cloud.get().getHost() + "/t/reconfirmation_star_wars";
        } else {
            strUrlDisneyGuardian = null;
        }
        if (strUrlDisneyGuardian == null) {
            return;
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.device_bind_guardian_auth).setMessage(getString(R.string.device_bind_guardian_auth_info, new Object[]{string})).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: b28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UnifyBindWaySelectActivity.X(this.a, dialogInterface, i2);
            }
        }).setPositiveButton(R.string.account_age_get_authorization, new DialogInterface.OnClickListener() { // from class: c28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                UnifyBindWaySelectActivity.Y(this.a, strUrlDisneyGuardian, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(UnifyBindWaySelectActivity unifyBindWaySelectActivity, DialogInterface dialogInterface, int i2) {
        unifyBindWaySelectActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(UnifyBindWaySelectActivity unifyBindWaySelectActivity, String str, DialogInterface dialogInterface, int i2) {
        unifyBindWaySelectActivity.A().launch(str);
        unifyBindWaySelectActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (!this.isBand) {
            J();
        } else {
            HMBindDeviceActivity.startBindMiLi(this);
            finish();
        }
    }

    private final void t(String version, final String model) {
        if (!m.equals("disney", version, true)) {
            BindHelper.getHelper().notifyStateChanged(4);
            return;
        }
        UserInfo userInfo = UserInfoManager.get();
        String country = userInfo == null ? "" : userInfo.getCountry();
        if (TextUtils.isEmpty(country) || m.equals(country, "unknown", true)) {
            country = "CN";
        }
        final Country country2 = CountryManager.get(this, country);
        int age = HMPersonInfo.getInstance().getUserInfo().getAge();
        if (country2 == null || age >= country2.getDisneyAge()) {
            BindHelper.getHelper().notifyStateChanged(4);
        } else {
            AccountCheckAgeHelper.checkBindAge(this, new Consumer() { // from class: y18
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    UnifyBindWaySelectActivity.u(this.a, country2, model, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(UnifyBindWaySelectActivity unifyBindWaySelectActivity, Country country, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            BindHelper.getHelper().notifyStateChanged(-2);
            Toast.makeText(unifyBindWaySelectActivity, R.string.device_bind_guardian_auth_check_fail, 0).show();
        } else {
            if (Intrinsics.areEqual(HMAccountWebAPI.STATE_NOTHING, str2)) {
                BindHelper.getHelper().notifyStateChanged(4);
                return;
            }
            Log.i(TAG, "Start Guardion!!", new Object[0]);
            if (HMPersonInfo.getInstance().getUserInfo().getAge() >= country.getDisneyAge()) {
                BindHelper.getHelper().notifyStateChanged(4);
            } else {
                BindHelper.getHelper().notifyStateChanged(-2);
                unifyBindWaySelectActivity.W(unifyBindWaySelectActivity, str);
            }
        }
    }

    private final BindServiceApi v() {
        return (BindServiceApi) this.bindServiceApi.getValue();
    }

    private final CaptureQRApi w() {
        return (CaptureQRApi) this.captureQRApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi x() {
        return (DeviceUtilsApi) this.deviceUtilsActivity.getValue();
    }

    private final DeviceXNavigator y() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    private final String z() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(getString(R.string.scan_qr_code_tips), Arrays.copyOf(new Object[]{getString(R.string.app_name)}, 1));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (4096 == requestCode || 8192 == requestCode) {
            BindHelper.onRequestEnableBluetoothOrNetworkResult(-1 == resultCode);
            return;
        }
        if (QRUtil.REQUEST_QR != requestCode) {
            if (4096 == requestCode && resultCode == -1) {
                J();
                return;
            }
            return;
        }
        if (!(-1 == resultCode && data != null)) {
            Log.d(TAG, "ScanQR Fail!!", new Object[0]);
            BindHelper.getHelper().notifyStateChanged(-2);
            Analytics.event(this, AnalyticsEvents.EVENT_CANCEL_SCAN, 1);
        } else {
            String stringExtra = data.getStringExtra("SCAN_RESULT");
            Log.d(TAG, "ScanQR Result: " + stringExtra, new Object[0]);
            B(stringExtra);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        int i2;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unify_bind_way_select);
        boolean booleanExtra = getIntent().getBooleanExtra(i, false);
        this.isBand = booleanExtra;
        if (booleanExtra) {
            ((TextView) findViewById(R.id.qr_code)).setText(R.string.band_with_qr);
            ((ImageView) findViewById(R.id.has_qr_code_img)).setImageResource(R.drawable.qr_code_band);
            ((ImageView) findViewById(R.id.no_qr_code_img)).setImageResource(R.drawable.no_qr_code_band);
            ((TextView) findViewById(R.id.no_qr_code)).setText(R.string.band_without_qr);
            i2 = R.string.choose_band_type;
        } else {
            i2 = R.string.choose_watch_type;
        }
        int i3 = R.id.titleBar;
        ((RainbowTitleBar) findViewById(i3)).setTitle(getString(i2));
        ((RainbowTitleBar) findViewById(i3)).setNavigationOnClickListener(new View.OnClickListener() { // from class: i28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnifyBindWaySelectActivity.M(this.a, view);
            }
        });
        ((CardView) findViewById(R.id.cardBindByQr)).setOnClickListener(new View.OnClickListener() { // from class: v18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnifyBindWaySelectActivity.N(this.a, view);
            }
        });
        ((CardView) findViewById(R.id.cardBindByBlueTooth)).setOnClickListener(new View.OnClickListener() { // from class: j28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnifyBindWaySelectActivity.O(this.a, view);
            }
        });
        F();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.mSubscription;
        if (disposable != null) {
            disposable.dispose();
        }
        this.mSubscription = null;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(@Nullable Integer state) {
        L(this, state);
    }
}
