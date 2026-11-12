package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.profile.ecf.data.Sn;
import com.huami.bluetooth.profile.ecf.data.SnType;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.LullabyDevice;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMBindHeadsetLogic;
import com.xiaomi.hm.health.device.bind.DeviceBindLogicApi;
import com.xiaomi.hm.health.device.bind.HMBindBaseLogic;
import com.xiaomi.hm.health.device.classic_scan.ClassicScanCenter;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.headset.PairedDevice;
import com.xiaomi.hm.health.device.headset.help.HeadSetConnectHelp;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¿\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001W\u0018\u0000 l2\u00020\u00012\u00020\u0002:\u0002mnB?\u0012\u0006\u0010>\u001a\u000209\u0012\u0006\u0010)\u001a\u00020(\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u0002030\t\u0012\u0018\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\t0B¢\u0006\u0004\bh\u0010iB\u0019\b\u0016\u0012\u0006\u0010>\u001a\u000209\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bh\u0010jB3\b\u0016\u0012\u0006\u0010>\u001a\u000209\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0018\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\t0B¢\u0006\u0004\bh\u0010kJ\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\f\u001a\u00020\u0006*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0017H\u0002J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\u0016\u0010'\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001cJ \u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016J\u0006\u0010-\u001a\u00020\u0006J$\u00101\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010 \u001a\u0004\u0018\u00010\u00172\u0006\u00100\u001a\u00020\u0013H\u0014J\u0016\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020#J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001cH\u0007J\u0012\u00105\u001a\u0004\u0018\u00010\u00172\b\u00104\u001a\u0004\u0018\u000103J\u0014\u00108\u001a\u00020\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\tR\u0019\u0010>\u001a\u0002098\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u0002030\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R(\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\t0B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010K\u001a\u00020F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR#\u0010T\u001a\b\u0012\u0004\u0012\u00020P0O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010H\u001a\u0004\bR\u0010SR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010@R\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u0012R\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010f¨\u0006o"}, d2 = {"Lcom/xiaomi/hm/health/device/HMBindHeadsetLogic;", "Lcom/xiaomi/hm/health/device/bind/HMBindBaseLogic;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/webapi/device/HMWebBindInfo;", "Lcom/huami/bluetooth/device/HeadsetDevice;", "device", "", "Q", "Lorg/json/JSONObject;", "", "Lcom/huami/bluetooth/profile/ecf/data/Sn;", "snList", "R", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/device/HMBindHeadsetLogic$BindListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", ExifInterface.LATITUDE_SOUTH, "Z", "", "duration", "g0", "h0", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "e0", "X", "c0", "Landroid/bluetooth/BluetoothDevice;", "f0", "count", "b0", "deviceSource", "d0", "retry", "Lcom/xiaomi/hm/health/device/bind/HMBindBaseLogic$IBindListener;", "startBind", "stopBind", "bluetoothDevice", "onBoundedDeviceBind", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/Status;", "status", "onDeviceConnected", "doBind", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_ACTIVE_STATUS, "getBindInfo", "bind", "", "name", "getDeviceSource", "Lcom/xiaomi/hm/health/device/headset/PairedDevice;", "pairs", "setPairedDevice", "Landroid/content/Context;", "l", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "m", "Ljava/util/List;", "regexNameList", "", GoogleApiAvailabilityLight.b, "Ljava/util/Map;", "deviceRegexMap", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "o", "Lkotlin/Lazy;", "V", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "hmDeviceSource", "", "Lcom/xiaomi/hm/health/bt/scan/AdvData;", DTransferConstants.SEARCH_KEY, "W", "()Ljava/util/List;", "resultList", "r", "pairedDevice", "com/xiaomi/hm/health/device/HMBindHeadsetLogic$scanCallback$1", SOAP.XMLNS, "Lcom/xiaomi/hm/health/device/HMBindHeadsetLogic$scanCallback$1;", "scanCallback", "t", LogUtil.I, "scanDuration", "Lcom/xiaomi/hm/health/bt/scan/BleScanOption;", "u", "Lcom/xiaomi/hm/health/bt/scan/BleScanOption;", "scanOption", "v", "externalScan", "Ljava/util/concurrent/atomic/AtomicInteger;", "w", "Ljava/util/concurrent/atomic/AtomicInteger;", "pauseScanCount", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMDeviceType;Ljava/util/List;Ljava/util/Map;)V", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/util/Map;)V", "x", "BindListener", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMBindHeadsetLogic extends HMBindBaseLogic implements KoinComponent {

    @Deprecated
    public static final int BASE_SCAN_DURATION = 10000;

    @Deprecated
    @NotNull
    public static final String DEVICE_ADDITIONAL_INFO_BOX_SN = "boxSN";

    @Deprecated
    @NotNull
    public static final String DEVICE_ADDITIONAL_INFO_LEFT_SN = "leftSN";

    @Deprecated
    @NotNull
    public static final String DEVICE_ADDITIONAL_INFO_RIGHT_SN = "rightSN";

    @Deprecated
    public static final int MAX_SCAN_DURATION = 60000;

    @Deprecated
    public static final int SCAN_DURATION_INCREASE = 10000;

    @Deprecated
    @NotNull
    public static final String TAG = "HMBindHeadsetLogic";

    @NotNull
    private static final a x = new a(null);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final List<String> regexNameList;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Map<HMDeviceSource, List<String>> deviceRegexMap;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryApi;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource hmDeviceSource;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultList;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private List<PairedDevice> pairedDevice;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final HMBindHeadsetLogic$scanCallback$1 scanCallback;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int scanDuration;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    private BleScanOption scanOption;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean externalScan;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private AtomicInteger pauseScanCount;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/HMBindHeadsetLogic$BindListener;", "Lcom/xiaomi/hm/health/device/bind/HMBindBaseLogic$IBindListener;", "Landroid/bluetooth/BluetoothDevice;", "device", "", "onDeviceFound", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "onSingleBind", "onVersionDiverseBind", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface BindListener extends HMBindBaseLogic.IBindListener {
        void onDeviceFound(@NotNull BluetoothDevice device);

        void onSingleBind(@NotNull HMBaseDevice device);

        void onVersionDiverseBind(@NotNull HMBaseDevice device);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.OTHER_MOZART.ordinal()] = 1;
            iArr[HMDeviceSource.OTHER_HAYDN.ordinal()] = 2;
            iArr[HMDeviceSource.OTHER_LULLABY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"com/xiaomi/hm/health/device/HMBindHeadsetLogic$a", "", "", "BASE_SCAN_DURATION", LogUtil.I, "", "DEVICE_ADDITIONAL_INFO_BOX_SN", "Ljava/lang/String;", "DEVICE_ADDITIONAL_INFO_LEFT_SN", "DEVICE_ADDITIONAL_INFO_RIGHT_SN", "MAX_SCAN_DURATION", "SCAN_DURATION_INCREASE", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Bind single headset!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Bind headset version diverse!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "bleDevice null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onDeviceConnected: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/scan/AdvData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<List<AdvData>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<AdvData> getA() {
            return new ArrayList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "startBind headSet";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.xiaomi.hm.health.device.HMBindHeadsetLogic$scanCallback$1] */
    public HMBindHeadsetLogic(@NotNull Context context, @NotNull HMDeviceType hMDeviceType, @NotNull List<String> list, @NotNull Map<HMDeviceSource, ? extends List<String>> map) {
        super(context, hMDeviceType);
        this.context = context;
        this.regexNameList = list;
        this.deviceRegexMap = map;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceRepositoryApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryApi>() { // from class: com.xiaomi.hm.health.device.HMBindHeadsetLogic$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceRepositoryApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), qualifier, objArr);
            }
        });
        ClassicScanCenter.init(context);
        this.hmDeviceSource = HMDeviceSource.VDEVICE;
        this.resultList = LazyKt__LazyJVMKt.lazy(f.a);
        this.scanCallback = new IBleScanCallback() { // from class: com.xiaomi.hm.health.device.HMBindHeadsetLogic$scanCallback$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ BleScanOption a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(BleScanOption bleScanOption) {
                    super(0);
                    this.a = bleScanOption;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "onScanError: " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ BleScanOption a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(BleScanOption bleScanOption) {
                    super(0);
                    this.a = bleScanOption;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "onScanStart: " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public static final c a = new c();

                public c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "onScanStop";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ AdvData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(AdvData advData) {
                    super(0);
                    this.a = advData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "onScanedDevice: " + this.a.getDeviceName() + " - " + this.a.device.getAddress();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<String> {
                public static final e a = new e();

                public e() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "Skip conflicting device!";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function0<String> {
                public static final f a = new f();

                public f() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "device is bound , Skip bounded device";
                }
            }

            @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
            public void onScanError(@NotNull BleScanOption option) {
                HMLog.debug(HMBindHeadsetLogic.TAG, new a(option));
                this.a.handleBindFailed(HMBindBaseLogic.BindError.SCAN_ERROR);
            }

            @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
            public void onScanStart(@NotNull BleScanOption option) {
                HMLog.debug(HMBindHeadsetLogic.TAG, new b(option));
            }

            @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
            public void onScanStop(@NotNull BleScanOption option) {
                HMLog.debug(HMBindHeadsetLogic.TAG, c.a);
                if (this.a.mHasStop.get()) {
                    return;
                }
                this.a.Z();
            }

            @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
            public void onScanedDevice(@NotNull AdvData data, @NotNull BleScanOption option) {
                HMLog.info(HMBindHeadsetLogic.TAG, new d(data));
                List listW = this.a.W();
                boolean z = false;
                if (!(listW instanceof Collection) || !listW.isEmpty()) {
                    Iterator it2 = listW.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((AdvData) it2.next()).device.getAddress(), data.device.getAddress())) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    HMLog.info(HMBindHeadsetLogic.TAG, e.a);
                } else if (this.a.f0(data.device)) {
                    HMLog.info(HMBindHeadsetLogic.TAG, f.a);
                } else {
                    this.a.W().add(data);
                }
            }
        };
        this.scanDuration = 10000;
        this.pauseScanCount = new AtomicInteger(0);
    }

    private final void Q(HMWebBindInfo hMWebBindInfo, HeadsetDevice headsetDevice) throws JSONException {
        List<Sn> snList = headsetDevice.getSnList();
        if (snList.isEmpty()) {
            return;
        }
        if (hMWebBindInfo.additionalInfo == null) {
            hMWebBindInfo.additionalInfo = new JSONObject();
        }
        R(hMWebBindInfo.additionalInfo, snList);
    }

    private final void R(JSONObject jSONObject, List<Sn> list) throws JSONException {
        String str;
        for (Sn sn : list) {
            SnType type = sn.getType();
            if (Intrinsics.areEqual(type, SnType.Left.INSTANCE)) {
                str = DEVICE_ADDITIONAL_INFO_LEFT_SN;
            } else if (Intrinsics.areEqual(type, SnType.Right.INSTANCE)) {
                str = DEVICE_ADDITIONAL_INFO_RIGHT_SN;
            } else {
                str = Intrinsics.areEqual(type, SnType.Case.INSTANCE) ? DEVICE_ADDITIONAL_INFO_BOX_SN : null;
            }
            if (str != null) {
                jSONObject.put(str, sn.getSn());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean S(final HMBaseDevice device, final BindListener listener) {
        if (!(device instanceof HeadsetDevice) || !e0(device.getMDeviceSource())) {
            return true;
        }
        HeadsetDevice headsetDevice = (HeadsetDevice) device;
        HeadsetDevice.HeadsetDeviceState headsetState = headsetDevice.getHeadsetState();
        if (headsetState == null ? false : !headsetState.isDualConnected()) {
            HMLog.info(TAG, b.a);
            this.mHandler.post(new Runnable() { // from class: wn2
                @Override // java.lang.Runnable
                public final void run() {
                    HMBindHeadsetLogic.T(listener, device);
                }
            });
            return false;
        }
        if (!(!Intrinsics.areEqual(device.getDeviceInfo().getFirmwareVersionStr(), headsetDevice.getSecondEarVer()))) {
            return true;
        }
        HMLog.info(TAG, c.a);
        this.mHandler.post(new Runnable() { // from class: vn2
            @Override // java.lang.Runnable
            public final void run() {
                HMBindHeadsetLogic.U(listener, device);
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(BindListener bindListener, HMBaseDevice hMBaseDevice) {
        bindListener.onSingleBind(hMBaseDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(BindListener bindListener, HMBaseDevice hMBaseDevice) {
        bindListener.onVersionDiverseBind(hMBaseDevice);
    }

    private final DeviceRepositoryApi V() {
        return (DeviceRepositoryApi) this.deviceRepositoryApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AdvData> W() {
        return (List) this.resultList.getValue();
    }

    private final void X() {
        if (c0()) {
            this.mHandler.post(new Runnable() { // from class: yn2
                @Override // java.lang.Runnable
                public final void run() {
                    HMBindHeadsetLogic.Y(this.a);
                }
            });
        } else {
            handleBindFailed(HMBindBaseLogic.BindError.MORE_DEVICES);
            W().clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(HMBindHeadsetLogic hMBindHeadsetLogic) {
        HMBindBaseLogic.IBindListener iBindListener = hMBindHeadsetLogic.mListener;
        Objects.requireNonNull(iBindListener, "null cannot be cast to non-null type com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener");
        ((BindListener) iBindListener).onDeviceFound(((AdvData) CollectionsKt.first((List) hMBindHeadsetLogic.W())).device);
        hMBindHeadsetLogic.W().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        int size = W().size();
        if (size != 0) {
            if (size != 1) {
                X();
                return;
            } else {
                this.mHandler.post(new Runnable() { // from class: xn2
                    @Override // java.lang.Runnable
                    public final void run() {
                        HMBindHeadsetLogic.a0(this.a);
                    }
                });
                return;
            }
        }
        int i = c0() ? 10000 : 60000 - this.scanDuration;
        if (!(!b0(1) && i > 0) || this.externalScan) {
            this.externalScan = false;
            handleBindFailed(HMBindBaseLogic.BindError.NO_DEVICE);
        } else {
            this.externalScan = true ^ c0();
            g0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(HMBindHeadsetLogic hMBindHeadsetLogic) {
        HMBindBaseLogic.IBindListener iBindListener = hMBindHeadsetLogic.mListener;
        Objects.requireNonNull(iBindListener, "null cannot be cast to non-null type com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener");
        ((BindListener) iBindListener).onDeviceFound(((AdvData) CollectionsKt.first((List) hMBindHeadsetLogic.W())).device);
        hMBindHeadsetLogic.W().clear();
    }

    private final boolean b0(int count) {
        return d0(this.hmDeviceSource) && this.pauseScanCount.getAndIncrement() < count;
    }

    private final boolean c0() {
        return ConfigHelperKt.hasFeature(this.hmDeviceSource, Feature.CLASSIC_BLUETOOTH_CYCLE_SCAN);
    }

    private final boolean d0(HMDeviceSource deviceSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()];
        return i == 2 || i == 3;
    }

    private final boolean e0(HMDeviceSource source) {
        return WhenMappings.$EnumSwitchMapping$0[source.ordinal()] == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f0(BluetoothDevice device) {
        List<PairedDevice> list = this.pairedDevice;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(((PairedDevice) it2.next()).getDevice().getAddress(), device.getAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void g0(int duration) {
        this.scanOption = new BleScanOption.Builder().scanTimeout(duration).needConnectedDevices(false).filterNames(this.regexNameList).callback(this.scanCallback).build();
        ClassicScanCenter.getInstance().startScan(this.scanOption);
    }

    private final void h0() {
        BleScanOption bleScanOption = this.scanOption;
        if (bleScanOption == null) {
            return;
        }
        this.externalScan = false;
        ClassicScanCenter.getInstance().stopScan(bleScanOption);
    }

    public final void bind(@NotNull BluetoothDevice device, @NotNull HMBindBaseLogic.IBindListener listener) {
        super.startBind(listener);
        bind(device);
    }

    public final void doBind() {
        HMBaseDevice hMBaseDevice = this.mBleDevice;
        if (hMBaseDevice == null) {
            HMLog.error$default(TAG, null, null, d.a, 6, null);
            handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
            return;
        }
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        int defaultActiveStatus = ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, deviceSource) ? 0 : getDefaultActiveStatus(deviceSource);
        boolean zIsUploadDeviceStatistics = DeviceBindLogicApi.INSTANCE.isUploadDeviceStatistics(deviceSource);
        if (!zIsUploadDeviceStatistics && !bindDeviceToWeb(deviceInfo)) {
            handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
            return;
        }
        Device deviceCreateDbDevice = HMBindBaseLogic.createDbDevice(hMBaseDevice, defaultActiveStatus, getBrandType());
        Device deviceFindDeviceById = V().findDeviceById(deviceCreateDbDevice.getDevice_id());
        if (deviceFindDeviceById != null) {
            deviceCreateDbDevice.setGps_sync_time(deviceFindDeviceById.getGps_sync_time());
            deviceCreateDbDevice.setGps_sync_timezone(deviceFindDeviceById.getGps_sync_timezone());
        }
        V().insertOrReplace(deviceCreateDbDevice);
        handleBindSuccess(hMBaseDevice, deviceCreateDbDevice);
        if (zIsUploadDeviceStatistics) {
            bindDeviceToWeb(deviceInfo);
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    @NotNull
    public HMWebBindInfo getBindInfo(@Nullable DeviceInfo deviceInfo, @Nullable HMDeviceSource deviceSource, int activeStatus) throws JSONException {
        HMWebBindInfo bindInfo = super.getBindInfo(deviceInfo, deviceSource, activeStatus);
        IHMAuthCallback iHMAuthCallback = this.mBleDevice;
        if (iHMAuthCallback != null && (iHMAuthCallback instanceof HeadsetDevice)) {
            Q(bindInfo, (HeadsetDevice) iHMAuthCallback);
        }
        return bindInfo;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final HMDeviceSource getDeviceSource(@Nullable String name) {
        if (name == null) {
            return null;
        }
        for (Map.Entry<HMDeviceSource, List<String>> entry : this.deviceRegexMap.entrySet()) {
            HMDeviceSource key = entry.getKey();
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                if (Pattern.matches(it2.next(), name)) {
                    return key;
                }
            }
        }
        return null;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void onBoundedDeviceBind(@NotNull HMBindBaseLogic.IBindListener listener, @NotNull BluetoothDevice bluetoothDevice) {
        super.startBind(listener);
        W().clear();
        this.scanDuration = 10000;
        HMBindBaseLogic.IBindListener iBindListener = this.mListener;
        Objects.requireNonNull(iBindListener, "null cannot be cast to non-null type com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener");
        ((BindListener) iBindListener).onDeviceFound(bluetoothDevice);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void onDeviceConnected(@NotNull BluetoothDevice device, @NotNull HMDeviceType type, @NotNull Status status) {
        HMLog.info(TAG, new e(type));
        if (this.mHasStop.get()) {
            return;
        }
        if (this.mListener instanceof BindListener) {
            HMBaseDevice hMBaseDevice = this.mBleDevice;
            HMBindBaseLogic.IBindListener iBindListener = this.mListener;
            Objects.requireNonNull(iBindListener, "null cannot be cast to non-null type com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener");
            if (!S(hMBaseDevice, (BindListener) iBindListener)) {
                return;
            }
        }
        doBind();
    }

    public final void retry(@NotNull BindListener listener) {
        super.startBind(listener);
        W().clear();
        int i = this.scanDuration + 10000;
        this.scanDuration = i;
        g0(i);
    }

    public final void setPairedDevice(@NotNull List<PairedDevice> pairs) {
        this.pairedDevice = pairs;
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void startBind(@NotNull HMBindBaseLogic.IBindListener listener) {
        super.startBind(listener);
        HMLog.info(HMBindBaseLogic.TAG_BIND, g.a);
        W().clear();
        this.scanDuration = 10000;
        g0(10000);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void stopBind() {
        super.stopBind();
        h0();
        destroyBleDevice();
    }

    @SuppressLint({"MissingPermission"})
    public final void bind(@NotNull BluetoothDevice device) {
        HMBaseDevice mozartDevice;
        String name = device.getName();
        if (name == null) {
            handleBindFailed(HMBindBaseLogic.BindError.NULL_DEVICE_NAME);
            return;
        }
        HMDeviceSource deviceSource = getDeviceSource(name);
        Unit unit = null;
        if (deviceSource != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                handleBindFailed(HMBindBaseLogic.BindError.UNKNOW_DEVICE_TYPE);
            } else {
                new HeadSetConnectHelp(getContext()).connectHeadset(device);
                if (deviceSource == HMDeviceSource.OTHER_LULLABY) {
                    mozartDevice = new LullabyDevice(device);
                } else {
                    mozartDevice = new MozartDevice(device);
                }
                AuthInfo authInfo = new AuthInfo(null, false);
                authInfo.setUserInfo(getUserInfo());
                mozartDevice.setAuthInfo(authInfo);
                mozartDevice.setConnectionCallback(this);
                mozartDevice.setAutoReconnect(false);
                mozartDevice.create(true);
                Unit unit2 = Unit.INSTANCE;
                this.mBleDevice = mozartDevice;
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            handleBindFailed(HMBindBaseLogic.BindError.UNKNOW_DEVICE_TYPE);
        }
    }

    public HMBindHeadsetLogic(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource) {
        this(context, hMDeviceSource, DeviceNameConfig.getDEVICE_REGEX_MAP());
        this.hmDeviceSource = hMDeviceSource;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HMBindHeadsetLogic(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource, @NotNull Map<HMDeviceSource, ? extends List<String>> map) {
        HMDeviceType type = hMDeviceSource.getType();
        List<String> list = map.get(hMDeviceSource);
        this(context, type, list == null ? CollectionsKt__CollectionsKt.emptyList() : list, map);
    }
}
