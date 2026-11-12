package com.xiaomi.xms.wearable;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.xms.wearable.WearableXmsService;
import com.xiaomi.xms.wearable.amap.AmapConnectProvider;
import com.xiaomi.xms.wearable.extensions.DeviceModelExtKt;
import com.xiaomi.xms.wearable.utils.UtilsKt;
import defpackage.ccp;
import defpackage.d8r;
import defpackage.owo;
import defpackage.xg1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b2\u0010\u0013J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/xiaomi/xms/wearable/WearableXmsService;", "Landroid/app/Service;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "currentDeviceModel", "Landroid/content/Intent;", "intent", "", "packetId", "", "handlePacket", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Landroid/content/Intent;I)V", "handleAction", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Landroid/content/Intent;)V", "", "did", "doRegisterPacketReceiver", "(Ljava/lang/String;)V", "unRegisterPacketReceiver", "onCreate", "()V", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", LifecycleConstantKt.ON_DESTROY, "onRebind", "(Landroid/content/Intent;)V", "packageName", "", "isServiceConnected", "(Ljava/lang/String;)Z", "Ld8r;", "binder", "Ld8r;", "Landroid/os/HandlerThread;", "xmsHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "xmsHandler", "Landroid/os/Handler;", "Landroid/content/BroadcastReceiver;", "receiver", "Landroid/content/BroadcastReceiver;", "getReceiver", "()Landroid/content/BroadcastReceiver;", "setReceiver", "(Landroid/content/BroadcastReceiver;)V", "<init>", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWearableXmsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableXmsService.kt\ncom/xiaomi/xms/wearable/WearableXmsService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public final class WearableXmsService extends Service {

    @NotNull
    public static final String ACTION_CONNECTED_STATUS_CHANGED = "action_connected_status_changed";

    @NotNull
    public static final String ACTION_REQUEST_PERMISSION_EVENT = "action_request_permission_event";

    @NotNull
    public static final String PARAM_ACTION = "param_action";

    @NotNull
    public static final String PARAM_BASIC_REPORT = "param_basic_report";

    @NotNull
    public static final String PARAM_CONNECTED = "param_connected";

    @NotNull
    public static final String PARAM_CONTENT = "param_basic_info_content";

    @NotNull
    public static final String PARAM_DID = "param_did";

    @NotNull
    public static final String PARAM_FINGERPRINT = "param_basic_info_fingerprint";

    @NotNull
    public static final String PARAM_PACKAGE_NAME = "param_basic_info_package_name";

    @NotNull
    public static final String PARAM_PACKET_ID = "param_basic_info_packet_id";

    @NotNull
    public static final String XMS_WEARABLE_ACTION = "com.xiaomi.wearable.XMS_WEARABLE_SERVICE";

    @Nullable
    private d8r binder;

    @NotNull
    private BroadcastReceiver receiver = new BroadcastReceiver() { // from class: com.xiaomi.xms.wearable.WearableXmsService$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !Intrinsics.areEqual(intent.getAction(), WearableXmsService.XMS_WEARABLE_ACTION)) {
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("amap_connected", false);
            String stringExtra = intent.getStringExtra("amap_pkgname");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            AnyExtKt.io$default(null, new WearableXmsService$receiver$1$onReceive$1(this.this$0, stringExtra, booleanExtra, null), 1, null);
        }
    };

    @Nullable
    private Handler xmsHandler;

    @Nullable
    private HandlerThread xmsHandlerThread;

    private final void doRegisterPacketReceiver(String did) {
    }

    private final void handleAction(WearableDeviceModel currentDeviceModel, Intent intent) {
        d8r d8rVar;
        String stringExtra = intent.getStringExtra(PARAM_ACTION);
        xg1.d("handleAction " + stringExtra);
        if (Intrinsics.areEqual(ACTION_REQUEST_PERMISSION_EVENT, stringExtra)) {
            d8r d8rVar2 = this.binder;
            if (d8rVar2 != null) {
                d8rVar2.C5();
            }
            AmapConnectProvider.INSTANCE.getInstance().backFromPermissionPage();
            return;
        }
        if (Intrinsics.areEqual(ACTION_CONNECTED_STATUS_CHANGED, stringExtra)) {
            String stringExtra2 = intent.getStringExtra(PARAM_DID);
            boolean booleanExtra = intent.getBooleanExtra(PARAM_CONNECTED, false);
            xg1.a("onConnectStatusChanged " + stringExtra2 + ", " + booleanExtra);
            if (TextUtils.isEmpty(stringExtra2) || (d8rVar = this.binder) == null) {
                return;
            }
            d8rVar.B5(stringExtra2, booleanExtra);
        }
    }

    private final void handlePacket(WearableDeviceModel currentDeviceModel, Intent intent, int packetId) {
        xg1.d("WearableXmsService handlePacket:" + packetId);
        if (packetId == 6) {
            xg1.d("WearableXmsService request app status");
            ccp ccpVar = new ccp();
            ccpVar.c = intent.getStringExtra(PARAM_PACKAGE_NAME);
            ccpVar.d = intent.getByteArrayExtra(PARAM_FINGERPRINT);
            DeviceModelExtKt.syncPhoneAppStatus(currentDeviceModel, ccpVar, isServiceConnected(ccpVar.c));
            return;
        }
        if (packetId != 9) {
            if (packetId != 79) {
                return;
            }
            xg1.d("WearableXmsService report basic status");
            owo owoVar = (owo) new Gson().fromJson(intent.getStringExtra(PARAM_BASIC_REPORT), owo.class);
            d8r d8rVar = this.binder;
            if (d8rVar != null) {
                d8rVar.r5(currentDeviceModel.getDeviceInfo().getDid(), owoVar);
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra(PARAM_PACKAGE_NAME);
        byte[] byteArrayExtra = intent.getByteArrayExtra(PARAM_CONTENT);
        xg1.d("WearableXmsService send wear message");
        AmapConnectProvider companion = AmapConnectProvider.INSTANCE.getInstance();
        Intrinsics.checkNotNull(byteArrayExtra);
        companion.onReceiveMsg(stringExtra, new String(byteArrayExtra, Charsets.UTF_8));
        try {
            d8r d8rVar2 = this.binder;
            if (d8rVar2 != null) {
                d8rVar2.q5(currentDeviceModel.getDeviceInfo().getDid(), stringExtra, byteArrayExtra);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
            e.printStackTrace();
            xg1.b("callBackMessageListener " + e.getMessage());
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStartCommand$lambda$1(int i, WearableXmsService this$0, WearableDeviceModel wearableDeviceModel, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i >= 0) {
            this$0.handlePacket(wearableDeviceModel, intent, i);
        } else {
            this$0.handleAction(wearableDeviceModel, intent);
        }
        return Unit.INSTANCE;
    }

    private final void unRegisterPacketReceiver(String did) {
    }

    @NotNull
    public final BroadcastReceiver getReceiver() {
        return this.receiver;
    }

    public final boolean isServiceConnected(@Nullable String packageName) {
        xg1.d(packageName + " isServiceConnected binder is " + this.binder);
        d8r d8rVar = this.binder;
        if (d8rVar == null) {
            return false;
        }
        Intrinsics.checkNotNull(d8rVar);
        return d8rVar.w5(packageName);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        xg1.a("onBind");
        if (intent != null) {
            doRegisterPacketReceiver(intent.getStringExtra("key_device_id"));
        }
        Intrinsics.checkNotNull(intent);
        if (Intrinsics.areEqual(XMS_WEARABLE_ACTION, intent.getAction())) {
            return this.binder;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.binder = new d8r(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(XMS_WEARABLE_ACTION);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.receiver, intentFilter, 2);
        } else {
            registerReceiver(this.receiver, intentFilter);
        }
        HandlerThread handlerThread = new HandlerThread("WearableXmsService");
        handlerThread.start();
        this.xmsHandlerThread = handlerThread;
        HandlerThread handlerThread2 = this.xmsHandlerThread;
        Intrinsics.checkNotNull(handlerThread2);
        this.xmsHandler = new Handler(handlerThread2.getLooper());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.receiver);
        HandlerThread handlerThread = this.xmsHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        Handler handler = this.xmsHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.app.Service
    public void onRebind(@Nullable Intent intent) {
        super.onRebind(intent);
        xg1.a("onReBind");
        if (intent == null) {
            return;
        }
        doRegisterPacketReceiver(intent.getStringExtra("key_device_id"));
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable final Intent intent, int flags, int startId) {
        if (intent == null) {
            xg1.b("onStartCommand error intent is null");
            return 1;
        }
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        final int intExtra = intent.getIntExtra(PARAM_PACKET_ID, -1);
        xg1.d("onStartCommand packetId:" + intExtra + ", " + (wearableDeviceModel != null));
        if (wearableDeviceModel != null) {
            try {
                Handler handler = this.xmsHandler;
                if (handler != null) {
                    UtilsKt.safePost(handler, new Function0() { // from class: o8r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WearableXmsService.onStartCommand$lambda$1(intExtra, this, wearableDeviceModel, intent);
                        }
                    });
                }
            } catch (Exception e) {
                xg1.c("handleAction error:", e);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    public final void setReceiver(@NotNull BroadcastReceiver broadcastReceiver) {
        Intrinsics.checkNotNullParameter(broadcastReceiver, "<set-?>");
        this.receiver = broadcastReceiver;
    }
}
