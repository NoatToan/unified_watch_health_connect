package com.xiaomi.fitness.milink.screencast;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import com.amap.api.maps.model.MyLocationStyle;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackConstant;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.milink.sdk.Constants;
import com.milink.sdk.cast.MiLinkDevice;
import com.milink.sdk.client.MiLinkCastCallback;
import com.milink.sdk.client.MiLinkCastClient;
import com.milink.sdk.client.MiLinkDataCallback;
import com.milink.sdk.client.MiLinkDeviceListener;
import com.miui.circulate.api.exception.CirculateException;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.milink.export.CastBizManager;
import com.xiaomi.fitness.milink.screencast.ScreenCastHandler;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import com.xiaomi.fitness.milink_sdk.CastScreenCMD;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import defpackage.ded;
import defpackage.eed;
import defpackage.eu6;
import defpackage.hed;
import defpackage.ied;
import defpackage.ogl;
import defpackage.s7r;
import defpackage.u3r;
import defpackage.udd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u000e*\u0002Z]\u0018\u0000 i2\u00020\u0001:\u0001iB\t\b\u0016¢\u0006\u0004\bh\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u0007J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020 H\u0002¢\u0006\u0004\b.\u0010/J/\u00101\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020 2\u0006\u00100\u001a\u00020 H\u0002¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0005¢\u0006\u0004\b3\u0010\u0007J)\u00108\u001a\u00020\u00022\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109R\u0016\u0010:\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R#\u0010E\u001a\n @*\u0004\u0018\u00010?0?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\r0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010;R\u0016\u0010R\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010;R\u001c\u0010U\u001a\b\u0018\u00010SR\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010`\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010J\u001a\u0004\ba\u0010b\"\u0004\bc\u0010'R\u0016\u0010d\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010;R\u0016\u0010e\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010;R\u0016\u0010f\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010;R\u0016\u0010g\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010;¨\u0006j"}, d2 = {"Lcom/xiaomi/fitness/milink/screencast/ScreenCastHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "isSupportSendData", "()Z", "", "registerSportStateChange", "()V", "unRegisterSportStateChange", "registerDeviceConnectedListener", "unRegisterDeviceConnectedListener", "initMiLinkClient", "connectFailed", "Lcom/milink/sdk/cast/MiLinkDevice;", "miLinkDevice", "", "state", "sendConnectStateToDevice", "(Lcom/milink/sdk/cast/MiLinkDevice;I)V", "stopCastConnect", "releaseWakeLock", "stopCast", "clearDeviceList", "sendMiLinkDeviceListToDevice", "isDataCasting", "device", "handDeviceAdd", "(Lcom/milink/sdk/cast/MiLinkDevice;)V", "sendListToDevice", "handDeviceUpdate", "(Lcom/milink/sdk/cast/MiLinkDevice;Z)V", "handDeviceLost", "", "deviceId", "startConnect", "(Ljava/lang/String;)V", "stopDiscoveryAndStopConnect", "statue", "sendCmdToTV", "(I)V", "Lded;", "projectionData", "sendDataToTV", "(Lded;)V", "resultCode", MyLocationStyle.ERROR_INFO, "oneTrack", "(Ljava/lang/String;ZLjava/lang/String;)V", "deviceName", "onTrackInner", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "startCustomCast", "did", "type", "Ls7r;", "packet", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "mUid", "Ljava/lang/String;", "Lcom/milink/sdk/client/MiLinkCastClient;", "mCastClient", "Lcom/milink/sdk/client/MiLinkCastClient;", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "mGson$delegate", "Lkotlin/Lazy;", "getMGson", "()Lcom/google/gson/Gson;", "mGson", "mPendingCustomCast", "Z", "isSupportFloatCast", "mState", "I", "", "mDeviceMap", "Ljava/util/Map;", "Ljava/util/ArrayList;", "mDeviceList", "Ljava/util/ArrayList;", "mConnectedKey", "mPreConnectedKey", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "mWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/Handler;", "mDeviceHandler", "Landroid/os/Handler;", "com/xiaomi/fitness/milink/screencast/ScreenCastHandler$sportStateChangedListener$1", "sportStateChangedListener", "Lcom/xiaomi/fitness/milink/screencast/ScreenCastHandler$sportStateChangedListener$1;", "com/xiaomi/fitness/milink/screencast/ScreenCastHandler$onDeviceStatusListener$1", "onDeviceStatusListener", "Lcom/xiaomi/fitness/milink/screencast/ScreenCastHandler$onDeviceStatusListener$1;", "retryCount", "getRetryCount", "()I", "setRetryCount", "deviceModelStr", "deviceVision", "wearableId", "serialNumber", "<init>", "Companion", "milink_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nScreenCastHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenCastHandler.kt\ncom/xiaomi/fitness/milink/screencast/ScreenCastHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,690:1\n1863#2,2:691\n*S KotlinDebug\n*F\n+ 1 ScreenCastHandler.kt\ncom/xiaomi/fitness/milink/screencast/ScreenCastHandler\n*L\n399#1:691,2\n*E\n"})
public final class ScreenCastHandler extends DataHandlerWrapper {
    private static final long CONST_TIMEOUT_CAST_CONNECT = 10000;
    private static final long CONST_TIMEOUT_CAST_DISCOVER = 10000;

    @NotNull
    public static final String MILINK_CALLER_SUFFIX = "remote_processor";
    private static final int MSG_CAST_DEVICES_DISCOVER = 2;
    private static final int MSG_CAST_DEVICE_CONNECT = 1;
    private static final int MSG_DEVICES_DISCONNECT = 0;
    private static final int STATE_CASTING = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_INIT = 2;
    private static final int STATE_INIT_ING = 1;

    @NotNull
    public static final String TAG = "MiLinkComponent";
    private static final int sInitRetNeedRelease = -2;
    private static final int sInitRetSuccess = 0;
    private static final int sMaxRetryInitCount = 3;
    private boolean isSupportFloatCast;

    @NotNull
    private String mConnectedKey;
    private boolean mPendingCustomCast;

    @Nullable
    private PowerManager.WakeLock mWakeLock;

    @NotNull
    private String mUid = "";

    @NotNull
    private MiLinkCastClient mCastClient = new MiLinkCastClient(ApplicationExtKt.getApplication(), true, MILINK_CALLER_SUFFIX);

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lgl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScreenCastHandler.mGson_delegate$lambda$0();
        }
    });

    @NotNull
    private final Map<String, MiLinkDevice> mDeviceMap = new LinkedHashMap();

    @NotNull
    private final ArrayList<MiLinkDevice> mDeviceList = new ArrayList<>();

    @NotNull
    private String mPreConnectedKey = "";

    @NotNull
    private final Handler mDeviceHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: mgl
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return ScreenCastHandler.mDeviceHandler$lambda$1(this.f26162a, message);
        }
    });

    @NotNull
    private final ScreenCastHandler$sportStateChangedListener$1 sportStateChangedListener = new ISportStateChangedListener() { // from class: com.xiaomi.fitness.milink.screencast.ScreenCastHandler$sportStateChangedListener$1
        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportFinished(boolean validSport, byte[] ids, FinishSportData finishSportData) {
            ogl.b("onSportFinished");
            this.this$0.stopDiscoveryAndStopConnect();
            this.this$0.sendCmdToTV(4);
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportPaused() {
            ogl.b("onSportPaused");
            this.this$0.sendCmdToTV(2);
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportRestarted() {
            ogl.b("RESTART");
            this.this$0.sendCmdToTV(3);
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportSegment(int i, int i2) {
            ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
            ogl.b("onSportStarted , sportTime:" + startTime);
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
        public void preSport() {
            ISportStateChangedListener.DefaultImpls.preSport(this);
        }
    };

    @NotNull
    private final ScreenCastHandler$onDeviceStatusListener$1 onDeviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.milink.screencast.ScreenCastHandler$onDeviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            this.this$0.mDeviceHandler.removeMessages(0);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            this.this$0.mDeviceHandler.sendEmptyMessageDelayed(0, 10000L);
            this.this$0.deviceModelStr = "";
        }
    };

    @NotNull
    private String deviceModelStr = "";

    @NotNull
    private String deviceVision = "";

    @NotNull
    private String wearableId = "";

    @NotNull
    private String serialNumber = "";
    private int retryCount = 0;
    private int mState = 0;

    /* JADX WARN: Type inference failed for: r1v6, types: [com.xiaomi.fitness.milink.screencast.ScreenCastHandler$sportStateChangedListener$1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.xiaomi.fitness.milink.screencast.ScreenCastHandler$onDeviceStatusListener$1] */
    public ScreenCastHandler() {
        this.mConnectedKey = "";
        this.mConnectedKey = "";
        if (!isSupportSendData()) {
            ogl.b("milink and miplay version is low, please update current new version!!");
            return;
        }
        try {
            initMiLinkClient();
            this.isSupportFloatCast = true;
            ogl.b("check the milink version is Okawy.");
        } catch (Exception e) {
            ogl.b("initMiLinkClient failed: " + e.getMessage());
        }
    }

    private final void clearDeviceList() {
        this.mDeviceList.clear();
        this.mDeviceMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connectFailed() {
        MiLinkDevice miLinkDevice;
        if (this.mDeviceMap.containsKey(this.mPreConnectedKey) && (miLinkDevice = this.mDeviceMap.get(this.mPreConnectedKey)) != null) {
            sendConnectStateToDevice(miLinkDevice, 1);
        }
        this.mPreConnectedKey = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handDeviceAdd(MiLinkDevice device) {
        String key = device.getKey();
        if (this.mDeviceMap.containsKey(key)) {
            return;
        }
        device.setState(Intrinsics.areEqual(this.mConnectedKey, key) ? 1 : 0);
        this.mDeviceMap.put(key, device);
        this.mDeviceList.add(device);
        sendMiLinkDeviceListToDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handDeviceLost(MiLinkDevice device) {
        String key = device.getKey();
        if (this.mDeviceMap.containsKey(key)) {
            this.mDeviceMap.remove(key);
            for (int size = this.mDeviceList.size() - 1; size >= 0; size--) {
                MiLinkDevice miLinkDevice = this.mDeviceList.get(size);
                Intrinsics.checkNotNullExpressionValue(miLinkDevice, "get(...)");
                MiLinkDevice miLinkDevice2 = miLinkDevice;
                if (Intrinsics.areEqual(miLinkDevice2.getKey(), key)) {
                    this.mDeviceList.remove(miLinkDevice2);
                }
            }
            sendMiLinkDeviceListToDevice();
        }
    }

    private final void handDeviceUpdate(MiLinkDevice device, boolean sendListToDevice) {
        String key = device.getKey();
        if (this.mDeviceMap.containsKey(key)) {
            this.mDeviceMap.put(key, device);
            for (int size = this.mDeviceList.size() - 1; size >= 0; size--) {
                MiLinkDevice miLinkDevice = this.mDeviceList.get(size);
                Intrinsics.checkNotNullExpressionValue(miLinkDevice, "get(...)");
                MiLinkDevice miLinkDevice2 = miLinkDevice;
                if (Intrinsics.areEqual(miLinkDevice2.getKey(), key)) {
                    miLinkDevice2.setName(device.getName());
                    miLinkDevice2.setType(device.getType());
                    miLinkDevice2.setIp(device.getIp());
                    miLinkDevice2.setBleMac(device.getBleMac());
                    miLinkDevice2.setP2pMac(device.getP2pMac());
                    miLinkDevice2.setWifiMac(device.getWifiMac());
                    miLinkDevice2.setState(Intrinsics.areEqual(this.mConnectedKey, key) ? 1 : 0);
                    if (sendListToDevice) {
                        sendMiLinkDeviceListToDevice();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void handDeviceUpdate$default(ScreenCastHandler screenCastHandler, MiLinkDevice miLinkDevice, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        screenCastHandler.handDeviceUpdate(miLinkDevice, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initMiLinkClient() {
        ogl.b("milink init start  initMiLinkClient start retryCount:" + this.retryCount);
        int i = this.retryCount;
        if (i >= 3) {
            ogl.b("milink init max retryCount");
            if (this.mState == 1) {
                this.mState = 0;
                return;
            }
            return;
        }
        this.mState = 1;
        this.retryCount = i + 1;
        int iInit = this.mCastClient.init(new MiLinkCastCallback() { // from class: com.xiaomi.fitness.milink.screencast.ScreenCastHandler$initMiLinkClient$initRet$1
            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onConnected(MiLinkDevice p0, int p1) {
                this.this$0.mDeviceHandler.removeMessages(1);
                this.this$0.mState = 3;
                this.this$0.mPreConnectedKey = "";
                ogl.b("milink connected " + (p0 != null ? p0.getName() : null) + " success! ");
                if (p0 != null) {
                    ScreenCastHandler screenCastHandler = this.this$0;
                    String key = p0.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "getKey(...)");
                    screenCastHandler.oneTrack(key, true, "");
                    screenCastHandler.sendConnectStateToDevice(p0, 0);
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onConnectionChange(int p0, MiLinkDevice p1, int p2) {
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onDisconnected(MiLinkDevice p0, int p1) {
                ogl.b("milink onDisconnected " + (p0 != null ? p0.getName() : null));
                this.this$0.mState = 2;
                this.this$0.mConnectedKey = "";
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onFailure(int code, int p1) {
                ogl.b("milink onFailure code==" + code + "  *** flag==" + p1);
                this.this$0.mDeviceHandler.removeMessages(1);
                ScreenCastHandler screenCastHandler = this.this$0;
                screenCastHandler.oneTrack(screenCastHandler.mPreConnectedKey, false, "connect failed");
                this.this$0.connectFailed();
                ogl.b("milink onFailure initMiLinkClient");
                if (code == -3 || code == -2) {
                    this.this$0.mState = 1;
                    this.this$0.mCastClient.release();
                    this.this$0.mConnectedKey = "";
                    this.this$0.initMiLinkClient();
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onInit() throws CirculateException {
                ogl.b("milink init success");
                this.this$0.mState = 2;
                if (this.this$0.mPendingCustomCast) {
                    this.this$0.startCustomCast();
                    this.this$0.mPendingCustomCast = false;
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onPrivateProtectChange(int p0, int p1) {
            }
        });
        this.mCastClient.setDataCallback(new MiLinkDataCallback() { // from class: com.xiaomi.fitness.milink.screencast.ScreenCastHandler.initMiLinkClient.1
            @Override // com.milink.sdk.cast.IMiLinkDataCallback
            public void onReceived(byte[] p0) {
                if (p0 == null) {
                    return;
                }
                CastScreenCMD.GetVideoDataFromTV getVideoDataFromTV = (CastScreenCMD.GetVideoDataFromTV) ScreenCastHandler.this.getMGson().fromJson(new String(p0, Charsets.UTF_8), CastScreenCMD.GetVideoDataFromTV.class);
                ogl.b("milink onReceived status==" + getVideoDataFromTV.status + "***progress==" + getVideoDataFromTV.progress + "***clarity==" + getVideoDataFromTV.clarity);
            }
        });
        ogl.b("milink init start  initMiLinkClient start initRet:" + iInit);
        if (iInit == -2) {
            this.mCastClient.release();
            initMiLinkClient();
        } else if (iInit != 0) {
            initMiLinkClient();
        }
    }

    private final boolean isDataCasting() {
        return this.mState == 3;
    }

    private final boolean isSupportSendData() {
        return this.mCastClient.support(Constants.FEATURE_DATA_FLOAT_WINDIW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mDeviceHandler$lambda$1(ScreenCastHandler this$0, Message msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i == 0) {
            ogl.b("watch disconnect phone 10 seconds, stopDiscoveryAndStopConnect cast device!");
            this$0.stopDiscoveryAndStopConnect();
            this$0.deviceModelStr = "";
        } else if (i == 1) {
            ogl.b("watch connect cast Devices " + this$0.mPreConnectedKey + ", timeout, handle as failed!");
            this$0.connectFailed();
            this$0.oneTrack(this$0.mPreConnectedKey, false, "connect television timeout");
        } else if (i == 2) {
            ogl.b("Discover screen cast devices time out!!");
            this$0.sendMiLinkDeviceListToDevice();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new GsonBuilder().disableHtmlEscaping().create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTrackInner(String deviceId, boolean resultCode, String errorInfo, String deviceName) {
        MiLinkDevice miLinkDevice = this.mDeviceMap.get(deviceId);
        String wifiMac = miLinkDevice != null ? miLinkDevice.getWifiMac() : null;
        if (wifiMac == null) {
            wifiMac = "";
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(OneTrackConstant.EVENT_NAME_CONNECTIVITY, "56.53.1.1.22972"), "name", "data_projection_command", "target_type", "television", "action", "data_command", "device_did", MD5Util.MD5(wifiMac), "result", Boolean.valueOf(resultCode), "error_info", errorInfo, "device_model", this.deviceModelStr, "device_name", deviceName, "device_version", this.deviceVision, CirculateDeviceInfo.DEVICE_SN, this.serialNumber, "wearable_id", this.wearableId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oneTrack(final String deviceId, final boolean resultCode, final String errorInfo) {
        String name;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
            name = "";
        }
        final String str = name;
        if (!TextUtils.isEmpty(this.deviceModelStr)) {
            onTrackInner(deviceId, resultCode, errorInfo, str);
        } else if (wearableDeviceModel != null) {
            this.deviceModelStr = DeviceModelExtKt.getModel(wearableDeviceModel);
            wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.milink.screencast.ScreenCastHandler$oneTrack$1$1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    ogl.a("readWatchInfo error:" + errorCode);
                }

                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    if (result != null) {
                        ScreenCastHandler screenCastHandler = this.this$0;
                        String str2 = deviceId;
                        boolean z = resultCode;
                        String str3 = errorInfo;
                        String str4 = str;
                        String firmwareVersion = result.getFirmwareVersion();
                        if (firmwareVersion == null) {
                            firmwareVersion = "";
                        }
                        screenCastHandler.deviceVision = firmwareVersion;
                        screenCastHandler.wearableId = result.getDid();
                        screenCastHandler.serialNumber = result.getSerialNumber();
                        screenCastHandler.onTrackInner(str2, z, str3, str4);
                    }
                }
            });
        }
    }

    private final void registerDeviceConnectedListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.onDeviceStatusListener);
    }

    private final void registerSportStateChange() {
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).addAppAndDeviceSportStateListener(ScreenCastHandler.class, this.sportStateChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseWakeLock() {
        if (this.mWakeLock != null) {
            ogl.b("release WakeLock!!");
            u3r.c(this.mWakeLock);
            this.mWakeLock = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCmdToTV(int statue) {
        if (isDataCasting()) {
            CastScreenCMD.SendVideoCMD sendVideoCMD = new CastScreenCMD.SendVideoCMD();
            sendVideoCMD.type = 2;
            sendVideoCMD.uid = this.mUid;
            sendVideoCMD.operation = statue;
            String json = getMGson().toJson(sendVideoCMD);
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            Intrinsics.checkNotNull(json);
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            ogl.b("sendCmdToTV== ret:" + miLinkCastClient.send(bytes) + " cmdData:" + json);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendConnectStateToDevice(MiLinkDevice miLinkDevice, int state) {
        String key;
        ied iedVar = new ied();
        iedVar.c = miLinkDevice.getKey();
        iedVar.d = state;
        ogl.b("sendConnectStateToDevice  begin to send ConnectState " + state + ", TV is in casting: " + miLinkDevice.getState());
        s7r s7rVar = new s7r();
        s7rVar.e = 23;
        s7rVar.f = 12;
        s7rVar.U(new udd());
        s7rVar.w().B(iedVar);
        ogl.b("mCastClient.stopDiscovery  stopDisvovery:" + this.mCastClient.stopDiscovery(36));
        if (state == 0) {
            key = miLinkDevice.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "getKey(...)");
        } else {
            key = "";
        }
        this.mConnectedKey = key;
        handDeviceUpdate(miLinkDevice, false);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.milink.screencast.ScreenCastHandler.sendConnectStateToDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                ogl.b("sendConnectStateToDevice  OnSyncCallback onError code: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ogl.b("sendConnectStateToDevice  OnSyncCallback onSuccess code: " + (result != null ? Integer.valueOf(result.getCode()) : null));
            }
        }, 0, 8, null);
    }

    private final void sendDataToTV(ded projectionData) {
        if (isDataCasting()) {
            CastScreenCMD.FloatWindowData floatWindowData = new CastScreenCMD.FloatWindowData();
            ScreenCastMockUtil.INSTANCE.builderFloatWindowData(floatWindowData, projectionData);
            CastScreenCMD.SendVideoData sendVideoData = new CastScreenCMD.SendVideoData();
            sendVideoData.type = 1;
            sendVideoData.uid = this.mUid;
            sendVideoData.currentTime = projectionData.d;
            sendVideoData.maxHr = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false).getMaxHrOrDefault();
            sendVideoData.dataType = 1;
            sendVideoData.floatWindowData = floatWindowData;
            String json = getMGson().toJson(sendVideoData);
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            Intrinsics.checkNotNull(json);
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            ogl.b("sendDataToTV== ret:" + miLinkCastClient.send(bytes) + " data:" + json);
        }
    }

    private final void sendMiLinkDeviceListToDevice() {
        eed[] eedVarArr = new eed[this.mDeviceList.size()];
        int i = 0;
        if (this.mDeviceList.isEmpty()) {
            oneTrack("", false, "no_search");
        }
        for (MiLinkDevice miLinkDevice : this.mDeviceList) {
            eed eedVar = new eed();
            eedVar.c = miLinkDevice.getKey();
            eedVar.d = miLinkDevice.getName();
            eedVar.e = Intrinsics.areEqual(this.mConnectedKey, miLinkDevice.getKey()) ? 1 : 0;
            eedVarArr[i] = eedVar;
            i++;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 23;
        s7rVar.f = 10;
        s7rVar.U(new udd());
        eed.a aVar = new eed.a();
        aVar.c = eedVarArr;
        s7rVar.w().z(aVar);
        ogl.b("sendMiLinkDeviceListToDevice  begin to send deviceList to Watch!! " + s7rVar.w());
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.milink.screencast.ScreenCastHandler.sendMiLinkDeviceListToDevice.3
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                ogl.b("sendMiLinkDeviceListToDevice  OnSyncCallback onError code: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ogl.b("sendMiLinkDeviceListToDevice  OnSyncCallback onSuccess code: " + (result != null ? Integer.valueOf(result.getCode()) : null));
            }
        }, 0, 8, null);
    }

    private final void startConnect(String deviceId) {
        if (!isDataCasting()) {
            MiLinkDevice miLinkDevice = this.mDeviceMap.get(deviceId);
            if (miLinkDevice != null) {
                ogl.b("Screen cast start to Connect.");
                this.mPreConnectedKey = miLinkDevice.getKey();
                this.mDeviceHandler.sendEmptyMessageDelayed(1, 10000L);
                ogl.b("mCastClient.startConnect  startRet:" + this.mCastClient.startConnect(miLinkDevice, 36));
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(this.mConnectedKey, deviceId)) {
            ogl.b("Screen cast has connected!! please not connect again.");
            return;
        }
        ogl.b("Screen cast exchange devices " + this.mConnectedKey + " to " + deviceId);
        stopCastConnect();
        MiLinkDevice miLinkDevice2 = this.mDeviceMap.get(deviceId);
        if (miLinkDevice2 != null) {
            ogl.b("Screen cast start to Connect.");
            this.mPreConnectedKey = miLinkDevice2.getKey();
            this.mDeviceHandler.sendEmptyMessageDelayed(1, 10000L);
            ogl.b("mCastClient.startConnect  startRet:" + this.mCastClient.startConnect(miLinkDevice2, 36));
        }
    }

    private final void stopCast() {
        if (this.mState == 0) {
            ogl.b("stopCast not init, ignore");
            return;
        }
        stopDiscoveryAndStopConnect();
        clearDeviceList();
        unRegisterSportStateChange();
    }

    private final void stopCastConnect() {
        if (this.mState == 0) {
            ogl.b("stopCast not init, ignore");
            return;
        }
        ogl.b("stopConnect, stopCast!!");
        if (isDataCasting()) {
            ogl.b("mCastClient.stopConnect  stopRet:" + this.mCastClient.stopConnect(36));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopDiscoveryAndStopConnect() {
        if (this.mState == 0) {
            ogl.b("stopDiscoveryAndStopConnect not init, ignore");
            return;
        }
        ogl.b("stopDiscovery");
        ogl.b("mCastClient.stopDiscovery  stopDisvovery:" + this.mCastClient.stopDiscovery(36));
        if (this.mState == 3) {
            ogl.b("stopConnect");
            ogl.b("mCastClient.stopConnect  stopRet:" + this.mCastClient.stopConnect(36));
        } else {
            ogl.b("stopConnect not casting, ignore");
        }
        clearDeviceList();
        unRegisterSportStateChange();
        unRegisterDeviceConnectedListener();
        releaseWakeLock();
        this.mDeviceHandler.removeCallbacksAndMessages(null);
    }

    private final void unRegisterDeviceConnectedListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceChangeListener(new Function1() { // from class: kgl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScreenCastHandler.unRegisterDeviceConnectedListener$lambda$2(this.f23829a, (WearableDeviceModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unRegisterDeviceConnectedListener$lambda$2(ScreenCastHandler this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScreenCastHandler$onDeviceStatusListener$1 screenCastHandler$onDeviceStatusListener$1 = this$0.onDeviceStatusListener;
        return Unit.INSTANCE;
    }

    private final void unRegisterSportStateChange() {
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).removeAppAndDeviceSportStateListener(ScreenCastHandler.class, this.sportStateChangedListener);
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) throws CirculateException {
        Intrinsics.checkNotNullParameter(did, "did");
        if (packet != null && packet.e == 23) {
            ogl.b("ScreenCastHandler handlePacket! " + packet.f);
            int i = packet.f;
            if (i == 9) {
                ogl.b("request miLinkDevices from the device " + did + " ");
                this.mUid = did;
                startCustomCast();
                return true;
            }
            if (i != 11) {
                if (i != 13 || CastBizManager.isOtherCasting$default(CastBizManager.INSTANCE, false, null, 2, null)) {
                    return false;
                }
                ded dedVarQ = packet.w().q();
                Intrinsics.checkNotNullExpressionValue(dedVarQ, "getProjectionData(...)");
                ogl.b("receive projection data from device!");
                sendDataToTV(dedVarQ);
                return true;
            }
            hed hedVarR = packet.w().r();
            String str = hedVarR.c;
            CastBizManager castBizManager = CastBizManager.INSTANCE;
            Intrinsics.checkNotNull(str);
            if (castBizManager.isOtherCasting(true, str)) {
                return false;
            }
            int i2 = hedVarR.d;
            ogl.b("receive projection miLink device " + str + " to cast cmd action: " + i2);
            if (i2 == 0) {
                startConnect(str);
            } else {
                stopCastConnect();
            }
            return true;
        }
        return false;
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public final void startCustomCast() throws CirculateException {
        if (!this.isSupportFloatCast) {
            oneTrack("", false, "milink version low");
            return;
        }
        int i = this.mState;
        if (i == 0) {
            ogl.b("startDiscovery wait init STATE_IDLE");
            this.mPendingCustomCast = true;
            this.retryCount = 0;
            this.mCastClient.release();
            initMiLinkClient();
            return;
        }
        if (i == 1) {
            ogl.b("startDiscovery wait init STATE_INIT_ING");
            this.mPendingCustomCast = true;
            return;
        }
        ogl.b("startDiscovery");
        if (isDataCasting()) {
            sendMiLinkDeviceListToDevice();
            ogl.b("startDiscovery invoke, but is casting now!");
            return;
        }
        MilinkHelper.INSTANCE.stopDiscovery();
        registerDeviceConnectedListener();
        registerSportStateChange();
        clearDeviceList();
        ogl.b("startDiscovery has clear Device List!");
        this.mDeviceHandler.sendEmptyMessageDelayed(2, 10000L);
        ogl.b("startDiscovery has sent discover timeout!");
        if (!u3r.b(AppUtil.getApp())) {
            ogl.b("WakeLockUtil invoke pre");
            this.mWakeLock = u3r.a(AppUtil.getApp(), 20000L);
        }
        ogl.b("WakeLockUtil invoke end " + u3r.b(AppUtil.getApp()));
        ogl.b("mCastClient.startDiscovery discoveryRet:" + this.mCastClient.startDiscovery(36, new MiLinkDeviceListener() { // from class: com.xiaomi.fitness.milink.screencast.ScreenCastHandler$startCustomCast$discoveryRet$1
            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onFound(MiLinkDevice miLinkDevice) {
                Intrinsics.checkNotNullParameter(miLinkDevice, "miLinkDevice");
                ogl.b("startCustomCast  startDiscovery onFound!! " + miLinkDevice);
                this.this$0.mDeviceHandler.removeMessages(2);
                this.this$0.handDeviceAdd(miLinkDevice);
                this.this$0.releaseWakeLock();
            }

            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onLost(MiLinkDevice miLinkDevice) {
                Intrinsics.checkNotNullParameter(miLinkDevice, "miLinkDevice");
                ogl.b("startCustomCast  startDiscovery onLost!! " + miLinkDevice);
                this.this$0.mDeviceHandler.removeMessages(2);
                this.this$0.handDeviceLost(miLinkDevice);
                this.this$0.releaseWakeLock();
            }

            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onUpdate(MiLinkDevice miLinkDevice) {
                Intrinsics.checkNotNullParameter(miLinkDevice, "miLinkDevice");
                ogl.b("startCustomCast  startDiscovery onUpdate!! " + miLinkDevice);
                this.this$0.mDeviceHandler.removeMessages(2);
                ScreenCastHandler.handDeviceUpdate$default(this.this$0, miLinkDevice, false, 2, null);
                this.this$0.releaseWakeLock();
            }
        }));
    }
}
