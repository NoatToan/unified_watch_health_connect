package com.xiaomi.hm.health.device.capturedevice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.zxing.Result;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\rH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0014R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/xiaomi/hm/health/device/capturedevice/HMCaptureWatchQRActivity;", "Lcom/xiaomi/hm/health/device/capturedevice/HMCaptureDeviceBaseActivity;", "Lorg/koin/core/component/KoinComponent;", "", "G", "Landroid/os/Bundle;", "savedInstanceState", PointCategory.INIT, "Lcom/google/zxing/Result;", "rawResult", "handleCaptureResult", "", "checkCaptureResult", "", "getInvalidQrInfo", "getTitleString", "getTipString", "getNoQrCodeString", "onNoQRCodeClick", "Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;", "P", "Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;", "getDeviceQRInfo", "()Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;", "setDeviceQRInfo", "(Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;)V", "deviceQRInfo", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Q", "Ljava/util/List;", "allowBindSource", "Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "R", "Lkotlin/Lazy;", "E", "()Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "bindServiceApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", ExifInterface.LATITUDE_SOUTH, "F", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "", ExifInterface.GPS_DIRECTION_TRUE, LogUtil.I, "getBindType", "()I", "setBindType", "(I)V", PhoneBindActivity.EXTRA_BIND_TYPE, "U", "Ljava/lang/String;", "getWatchName", "()Ljava/lang/String;", "setWatchName", "(Ljava/lang/String;)V", "watchName", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMCaptureWatchQRActivity extends HMCaptureDeviceBaseActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "HMCaptureWatchQRActivity";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    private DeviceQRInfo deviceQRInfo;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    private final List<HMDeviceSource> allowBindSource = new ArrayList();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    private final Lazy bindServiceApi;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private int bindType;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    private String watchName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/capturedevice/HMCaptureWatchQRActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PhoneBindActivity.EXTRA_BIND_TYPE, "", "startCapture", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startCapture(@NotNull Context context, int bindType) {
            Intent intent = new Intent(context, (Class<?>) HMCaptureWatchQRActivity.class);
            intent.putExtra("bind_type", bindType);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "scan source: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<HMDeviceSource, CharSequence> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull HMDeviceSource hMDeviceSource) {
                return hMDeviceSource.toString();
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "allSource: " + CollectionsKt___CollectionsKt.joinToString$default(HMCaptureWatchQRActivity.this.allowBindSource, null, null, null, 0, null, a.a, 31, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMCaptureWatchQRActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.bindServiceApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<BindServiceApi>() { // from class: com.xiaomi.hm.health.device.capturedevice.HMCaptureWatchQRActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.bind.BindServiceApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BindServiceApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BindServiceApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.capturedevice.HMCaptureWatchQRActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceXNavigator invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
        this.bindType = -1;
        this.watchName = "";
    }

    private final BindServiceApi E() {
        return (BindServiceApi) this.bindServiceApi.getValue();
    }

    private final DeviceXNavigator F() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    private final void G() {
        this.allowBindSource.addAll(E().getAllowBindSources(this.bindType));
        HMLog.info(TAG, new b());
    }

    @JvmStatic
    public static final void startCapture(@NotNull Context context, int i) {
        INSTANCE.startCapture(context, i);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.capturedevice.HMCaptureDeviceBaseActivity
    public boolean checkCaptureResult(@Nullable Result rawResult) {
        DeviceQRInfo deviceQRInfo = CaptureQRResultKt.getDeviceQRInfo(rawResult == null ? null : rawResult.getText());
        this.deviceQRInfo = deviceQRInfo;
        if (deviceQRInfo == null) {
            return false;
        }
        HMDeviceSource hMDeviceSourceFromPnP = HMDeviceSource.fromPnP(deviceQRInfo.getPnpNum(), this.deviceQRInfo.getPnpVersion());
        HMLog.info(TAG, new a(hMDeviceSourceFromPnP));
        return this.allowBindSource.contains(hMDeviceSourceFromPnP);
    }

    public final int getBindType() {
        return this.bindType;
    }

    @Nullable
    public final DeviceQRInfo getDeviceQRInfo() {
        return this.deviceQRInfo;
    }

    @Override // com.xiaomi.hm.health.device.capturedevice.HMCaptureDeviceBaseActivity
    @NotNull
    public String getInvalidQrInfo() {
        return getString(R.string.bind_shoes_invalid_qr_help, new Object[]{this.watchName});
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.capturedevice.HMCaptureDeviceBaseActivity
    @NotNull
    public String getNoQrCodeString() {
        return getString(R.string.no_qr_code_on_watch);
    }

    @Override // com.xiaomi.hm.health.device.capturedevice.HMCaptureDeviceBaseActivity
    @NotNull
    public String getTipString() {
        return getString(R.string.bind_shoes_capture_tips, new Object[]{getString(R.string.device_watch)});
    }

    @Override // com.xiaomi.hm.health.device.capturedevice.HMCaptureDeviceBaseActivity
    @NotNull
    public String getTitleString() {
        return getString(R.string.bind_watch_title, new Object[]{this.watchName});
    }

    @NotNull
    public final String getWatchName() {
        return this.watchName;
    }

    @Override // com.xiaomi.hm.health.device.capturedevice.HMCaptureDeviceBaseActivity
    public void handleCaptureResult(@Nullable Result rawResult) {
        DeviceQRInfo deviceQRInfo = this.deviceQRInfo;
        if (deviceQRInfo == null || deviceQRInfo == null) {
            return;
        }
        F().startBindDeviceActivityByQrCode(this, getBindType(), deviceQRInfo);
    }

    @Override // com.xiaomi.hm.health.device.capturedevice.HMCaptureDeviceBaseActivity
    public void init(@Nullable Bundle savedInstanceState) {
        this.bindType = getIntent().getIntExtra("bind_type", -1);
        String watchName = E().getWatchName(this.bindType);
        if (watchName == null) {
            watchName = "";
        }
        this.watchName = watchName;
        G();
    }

    @Override // com.xiaomi.hm.health.device.capturedevice.HMCaptureDeviceBaseActivity
    public void onNoQRCodeClick() {
        F().startBindWatch(this, null, this.bindType);
        finish();
    }

    public final void setBindType(int i) {
        this.bindType = i;
    }

    public final void setDeviceQRInfo(@Nullable DeviceQRInfo deviceQRInfo) {
        this.deviceQRInfo = deviceQRInfo;
    }

    public final void setWatchName(@NotNull String str) {
        this.watchName = str;
    }
}
