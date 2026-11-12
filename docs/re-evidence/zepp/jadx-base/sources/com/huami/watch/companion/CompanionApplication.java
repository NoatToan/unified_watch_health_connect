package com.huami.watch.companion;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.multidex.MultiDex;
import com.activeandroid.ActiveAndroid;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huami.lib.v2.ZeppPermissionManagerKt;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.agps.AGpsSyncService;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.watch.companion.cloud.HostManager;
import com.huami.watch.companion.components.bluetoothproxyserver.HttpProxyServer;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.datacollection.DataCollection;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.device.brand.BrandNameService;
import com.huami.watch.companion.device.config.FeatureConfig;
import com.huami.watch.companion.event.ConnectTimeoutEvent;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceResetEvent;
import com.huami.watch.companion.event.DeviceUnboundEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.event.NotificationBlacklistChangedEvent;
import com.huami.watch.companion.file.FileDownloadHelper;
import com.huami.watch.companion.findphone.AskAndAnswer;
import com.huami.watch.companion.hci.NfcTradeInfoRaw;
import com.huami.watch.companion.hci.NfcTradeInfoRawKt;
import com.huami.watch.companion.miot.SmartHomeServer;
import com.huami.watch.companion.notification.NotificationApp;
import com.huami.watch.companion.notification.NotificationManager;
import com.huami.watch.companion.otaphone.InputPasswordActivity;
import com.huami.watch.companion.otaphone.service.OtaService;
import com.huami.watch.companion.otaphone.service.OtaTransportCmd;
import com.huami.watch.companion.service.AppInitService;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.companion.sync.SyncTokenHelper;
import com.huami.watch.companion.sync.SyncUserSettingsHelper;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.sync.ble.SyncBleDeviceInfoHelper;
import com.huami.watch.companion.sync.ble.SyncNfcTradeHelper;
import com.huami.watch.companion.sync.throttle.SyncThrottler;
import com.huami.watch.companion.sync.throttle.bean.SyncTag;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.util.AppEnterForegroundCallBack;
import com.huami.watch.companion.util.BitmapUtil;
import com.huami.watch.companion.wearcalling.CallingWearHelper;
import com.huami.watch.companion.weather.WeatherService;
import com.huami.watch.companion.wifi.AddWifiActivity;
import com.huami.watch.componentlinker.service.impl.ComponentLinkerCmdServer;
import com.huami.watch.connect.Connectable;
import com.huami.watch.connect.ConnectionUtil;
import com.huami.watch.connect.PhoneConnection;
import com.huami.watch.hmwatchmanager.bt_connect.ArrivedDataUnpackingManager;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.notification.data.NotificationKeyData;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.DataTransportService;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.transport.TransporterModules;
import com.huami.watch.transport.ble.connection.BleConnection;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.BTUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.huami.watch.util.StorageUtil;
import com.huami.watch.wifi.WifiTransportHandler;
import com.huami.watch.wififtp.WatchWifiFtpUtil;
import com.ingenic.iwds.DeviceDescriptor;
import com.liulishuo.filedownloader.FileDownloader;
import com.liulishuo.filedownloader.connection.FileDownloadUrlConnection;
import com.liulishuo.filedownloader.services.DownloadMgrInitialParams;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.ximalaya.ting.android.opensdk.httputil.httpswitch.IDCGroupManager;
import de.greenrobot.event.EventBus;
import io.reactivex.functions.Consumer;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public abstract class CompanionApplication extends Application implements Connectable, BleConnection.BleConnectable {
    public static boolean isOverSea = true;
    private static final String s = "CompanionApp";
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 30000;
    private static final int w = 5;
    private static final int x = 120000;
    private static Context y;
    private int a;
    private InputPasswordActivity b;
    private AddWifiActivity c;
    private HttpProxyServer d;
    private AskAndAnswer e;
    private CallingWearHelper f;
    private SyncNfcTradeHelper g;
    private DataCollection h;
    private Transporter k;
    private Transporter p;
    public PhoneConnection mConnection = new PhoneConnection(this);
    public BleConnection mBleConnection = new BleConnection(this);
    private boolean i = false;

    @SuppressLint({"HandlerLeak"})
    private Handler j = new c();
    private Transporter.ChannelListener l = new d();
    private Transporter.DataListener m = new e();
    private Transporter.DataListener n = new f();
    private Transporter.DataListener o = new g();
    private Transporter.DataListener q = new h();
    private Transporter.DataListener r = new Transporter.DataListener() { // from class: nx0
        @Override // com.huami.watch.transport.Transporter.DataListener
        public final void onDataReceived(TransportDataItem transportDataItem) {
            this.a.y(transportDataItem);
        }
    };

    public class a extends SimpleTarget<Bitmap> {
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public a(String str, String str2) {
            this.d = str;
            this.e = str2;
        }

        @Override // com.bumptech.glide.request.target.Target
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) throws Throwable {
            onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) throws Throwable {
            byte[] bArrBitmapToBase64 = BitmapUtil.bitmapToBase64(bitmap, Bitmap.CompressFormat.JPEG, 60);
            if (bArrBitmapToBase64 != null) {
                DataBundle dataBundle = new DataBundle();
                dataBundle.putString("aid", this.d);
                dataBundle.putString("url", this.e);
                dataBundle.putByteArray("union_image", bArrBitmapToBase64);
                CompanionApplication.this.k.send(CompanionModule.ACTION_RESPONSE_CARD_IMAGE, dataBundle);
                Log.d(CompanionApplication.s, "onRequestSyncCardImage Success and send to watch", new Object[0]);
            }
        }
    }

    public class b extends TypeToken<ArrayList<JsonObject>> {
    }

    public class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                CompanionApplication.this.W((SyncTag) message.obj);
            } else {
                if (i != 2) {
                    return;
                }
                String str = (String) message.obj;
                Log.w(CompanionApplication.s, "Connect Device, Check Connected[" + str + "], Timeout!!", new Object[0]);
                RxBus.get().post(new ConnectTimeoutEvent(str));
            }
        }
    }

    public class d implements Transporter.ChannelListener {
        public d() {
        }

        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public void onChannelChanged(boolean z) {
            Log.d(CompanionApplication.s, "OnChannelChanged : " + DeviceUtil.UNKNOWN_DID + ", Available : " + z, new Object[0]);
            CompanionApplication companionApplication = CompanionApplication.this;
            DeviceManager.getManager(companionApplication).channelChanged(DeviceUtil.UNKNOWN_DID, z);
            if (z) {
                SyncTag syncTag = new SyncTag(SyncThrottler.SYNC_SYSTEM_TIME, System.currentTimeMillis(), SyncThrottler.FROM_TRANS_CHANNEL_AVAILABLE);
                if (SyncThrottler.isThrough(syncTag)) {
                    CompanionApplication.this.syncSystemTimeWithRetry(syncTag);
                }
                if (!BindHelper.getHelper().isBinding()) {
                    SyncUtil.syncWidgetSortToWatch(companionApplication, CompanionApplication.this.k);
                    SyncUtil.syncUserSavedSelectedWatchFace(companionApplication);
                }
                CompanionApplication companionApplication2 = CompanionApplication.this;
                companionApplication2.N(companionApplication2.k);
                CompanionApplication companionApplication3 = CompanionApplication.this;
                companionApplication3.O(companionApplication3.k);
                SyncUtil.syncUserInfoToWatchClassic(companionApplication, CompanionApplication.this.k);
                SyncUtil.syncUnitToWatch(companionApplication, CompanionApplication.this.k);
                SyncUtil.syncUnlockStatusToWatch(companionApplication, CompanionApplication.this.k);
                CompanionApplication.this.onNetworkOrChannelChanged(false);
                SyncUtil.syncXiaoMiTokenToWatch(companionApplication);
                SyncUtil.syncWeatherConfigToWatch(companionApplication);
                SyncUtil.syncLoginTokenToWatch(companionApplication);
                SyncUtil.syncWeatherCityToWatch(companionApplication);
            }
        }
    }

    public class e implements Transporter.DataListener {
        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Context context, DataBundle dataBundle) {
            CompanionApplication.this.H(context, dataBundle);
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            final CompanionApplication companionApplication = CompanionApplication.this;
            String action = transportDataItem.getAction();
            final DataBundle data = transportDataItem.getData();
            if (CompanionModule.ACTION_NFC_TRADE_HCI.equals(action)) {
                CompanionApplication.this.F(companionApplication);
                return;
            }
            if (CompanionModule.ACTION_NFC_TRADE_HCI_REQUEST_RESPONSE.equals(action)) {
                CompanionApplication.this.G(data);
                return;
            }
            if (CompanionModule.ACTION_SYNC_USER_SETTINGS.equals(action)) {
                CompanionApplication.this.L(companionApplication, data);
                return;
            }
            if (CompanionModule.ACTION_QUERY_TOKEN.equals(action)) {
                Log.d(CompanionApplication.s, "receive token query request!", new Object[0]);
                SyncTokenHelper.syncTokenToWatch(companionApplication, CompanionApplication.this.k, true);
                return;
            }
            if (CompanionModule.ACTION_SYNC_NOTIFICATION_PENDING_BLOCKLIST.equals(action)) {
                CompanionApplication.this.K(companionApplication, data);
                return;
            }
            if (CompanionModule.ACTION_DEVICE_RESET.equals(action)) {
                CompanionApplication.this.D(companionApplication, DeviceUtil.UNKNOWN_DID);
                return;
            }
            if (CompanionModule.ACTION_SYNC_WATCH_FACE.equals(action)) {
                CompanionApplication.this.M(companionApplication, data);
                return;
            }
            if (CompanionModule.ACTION_REQUEST_SYNC_DATA.equals(action)) {
                CompanionApplication.this.I(companionApplication, data);
            } else if (CompanionModule.ACTION_REQUEST_CARD_IMAGE.equals(action)) {
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(companionApplication, data);
                    }
                });
            } else if (CompanionModule.ACTION_REQUEST_FILE_DOWNLOAD.equals(action)) {
                CompanionApplication.this.E(companionApplication, data);
            }
        }
    }

    public class f implements Transporter.DataListener {
        public f() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            CompanionApplication companionApplication = CompanionApplication.this;
            String action = transportDataItem.getAction();
            DataBundle data = transportDataItem.getData();
            if (CompanionModule.ACTION_REQUEST_SYNC_DATA.equals(action)) {
                CompanionApplication.this.I(companionApplication, data);
            }
        }
    }

    public class g implements Transporter.DataListener {
        public g() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            String action = transportDataItem.getAction();
            DataBundle data = transportDataItem.getData();
            if (TransportUri.ACTION_BLOCK.equals(action)) {
                CompanionApplication companionApplication = CompanionApplication.this;
                companionApplication.J(companionApplication, data);
            }
        }
    }

    public class h implements Transporter.DataListener {
        public h() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
        }
    }

    public class i implements Consumer<Object> {
        public i() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) throws Exception {
            if (obj instanceof DeviceUnboundEvent) {
                DeviceUnboundEvent deviceUnboundEvent = (DeviceUnboundEvent) obj;
                CompanionApplication companionApplication = CompanionApplication.this;
                companionApplication.C(companionApplication, deviceUnboundEvent.did, deviceUnboundEvent.address, deviceUnboundEvent.isActive, deviceUnboundEvent.isBLE);
            }
        }
    }

    public class j implements Transporter.DataSendResultCallback {
        public final /* synthetic */ SyncTag a;

        public j(SyncTag syncTag) {
            this.a = syncTag;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            if (dataTransportResult.getResultCode() == 0) {
                Log.d(CompanionApplication.s, "On SyncSystemTime Success!!", new Object[0]);
                SyncThrottler.updateSyncTag(this.a);
            } else if (CompanionApplication.this.a <= 5) {
                Log.d(CompanionApplication.s, "On SyncSystemTime Fail, Retry : " + CompanionApplication.this.a, new Object[0]);
                CompanionApplication.this.j.removeMessages(1);
                CompanionApplication.this.j.sendMessageDelayed(CompanionApplication.this.j.obtainMessage(1, this.a), 30000L);
            }
        }
    }

    public class k implements Runnable {
        public final /* synthetic */ Context a;

        public k(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Device currentDevice = DeviceManager.getManager(this.a).getCurrentDevice();
            if (currentDevice != null) {
                RxBus.get().post(new DeviceResetEvent(currentDevice));
                BindUtil.unbindDeviceWithCloud(this.a, currentDevice.address());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(Throwable th) throws Exception {
        HMLog.warn(s, th, new Function0() { // from class: qx0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CompanionApplication.A();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Context context, String str, String str2, boolean z, boolean z2) {
        Log.i(s, "OnDeviceUnbound : " + str + ", " + str2 + ", IsActiveDevice : " + z + ", IsBLE: " + z2, new Object[0]);
        if (z) {
            V(context, str, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Context context, String str) {
        Log.d(s, "On receive WatchReset, to unbind current device!!", new Object[0]);
        Rx.mainThread(new k(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(Context context, DataBundle dataBundle) {
        if (dataBundle == null) {
            return;
        }
        String string = dataBundle.getString(FileDownloadHelper.KEY_URL);
        String string2 = dataBundle.getString(FileDownloadHelper.KEY_FILE_SUFFIX_NAME);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (!GlobalConfig.get().isBuildPlay() || !string.contains("cn.mi-ae.net")) {
            FileDownloadHelper.getHelper().syncFileToWatch(context, string, string2);
            return;
        }
        Log.w(s, "Play version, avoid access CN Host: " + string, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Context context) {
        Log.w(s, "onReceiveHciEvent", new Object[0]);
        Transporter.get(context, "com.huami.watch.companion").send(CompanionModule.ACTION_NFC_TRADE_HCI_REQUEST, new DataBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(DataBundle dataBundle) {
        Log.w(s, "onReceiveHciInfo " + dataBundle.toString(), new Object[0]);
        ArrayList arrayListJsonToArrayList = jsonToArrayList(dataBundle.getString("key_hci_json"), NfcTradeInfoRaw.class);
        if (arrayListJsonToArrayList.isEmpty()) {
            return;
        }
        EventBus.getDefault().post(NfcTradeInfoRawKt.toHMNFCTradeInfos(arrayListJsonToArrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(Context context, DataBundle dataBundle) {
        String string = dataBundle.getString("url", "");
        String string2 = dataBundle.getString("aid", "");
        Log.d(s, "onRequestSyncCardImage  url=" + string + ",aid=" + string2, new Object[0]);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.override(228, 142);
        Glide.with(context).asBitmap().load(string).apply(requestOptions).into(new a(string2, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(Context context, DataBundle dataBundle) {
        String[] stringArray = dataBundle.getStringArray("TargetPackages");
        Log.d(s, "OnRequestSyncData : " + Arrays.toString(stringArray), new Object[0]);
        if (stringArray == null || stringArray.length <= 0) {
            return;
        }
        int i2 = 0;
        for (String str : stringArray) {
            if (!"com.huami.watch.health".equals(str) && ("com.huami.watch.sport".equals(str) || "com.huami.watch.newsport".equals(str))) {
                i2 |= 1;
            }
        }
        SyncCenter center = SyncCenter.getCenter(context);
        if (center.isSyncing()) {
            Log.w(s, "SyncData : Already Syncing...Abort!!", new Object[0]);
        } else if (i2 == 0) {
            Log.w(s, "SyncData : SyncTypes is none...Abort!!", new Object[0]);
        } else {
            center.types(i2).silent(true).transporter(this.k).startAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(Context context, DataBundle dataBundle) {
        NotificationKeyData notificationKeyData = (NotificationKeyData) dataBundle.getParcelable(TransportUri.KEY_NOTI);
        Log.d(s, "OnSyncNotificationBlockApp, Key : " + notificationKeyData, new Object[0]);
        if (notificationKeyData == null || TextUtils.isEmpty(notificationKeyData.pkg)) {
            return;
        }
        NotificationApp notificationApp = new NotificationApp();
        if (TextUtils.isEmpty(notificationKeyData.targetPkg)) {
            notificationApp.packageName = notificationKeyData.pkg;
        } else {
            notificationApp.packageName = notificationKeyData.targetPkg;
        }
        NotificationManager.getManager(context).addApp(notificationApp);
        RxBus.get().post(new NotificationBlacklistChangedEvent(notificationKeyData.pkg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(Context context, DataBundle dataBundle) {
        String string = dataBundle.getString(CompanionModule.KEY_NOTIFICATION_BLOCKLIST);
        Log.d(s, "OnSyncNotificationBlockList : " + string, new Object[0]);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String[] strArrSplit = string.split(",");
        if (strArrSplit.length > 0) {
            for (String str : strArrSplit) {
                NotificationApp notificationApp = new NotificationApp();
                notificationApp.packageName = str;
                NotificationManager.getManager(context).addApp(notificationApp);
            }
            RxBus.get().post(new NotificationBlacklistChangedEvent(""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(Context context, DataBundle dataBundle) {
        if (dataBundle == null) {
            return;
        }
        String string = dataBundle.getString(CompanionModule.KEY_USER_SETTINGS);
        Log.d(s, "OnSync Receive UserSettings : " + string, new Object[0]);
        SyncUserSettingsHelper.getHelper(context).syncToCloudAsync(string, this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(Context context, DataBundle dataBundle) {
        Bundle bundleX = (Bundle) dataBundle.getParcelable("bd");
        String string = dataBundle.getString("url");
        if (string != null) {
            if (bundleX == null) {
                bundleX = X(dataBundle);
            }
            try {
                ArrivedDataUnpackingManager.unpacking(context, string, bundleX);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(Transporter transporter) {
        transporter.send(CompanionModule.ACTION_REQUEST_NOTIFICATION_PENDING_BLOCKLIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(Transporter transporter) {
        transporter.send(CompanionModule.ACTION_REQUEST_USER_SETTINGS);
    }

    private void P(Device device, JSONObject jSONObject) {
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("cpuId", null);
            if (!TextUtils.isEmpty(strOptString)) {
                device.setCpuId(strOptString);
            }
            Log.d(s, "Retrieve CpuId : " + strOptString, new Object[0]);
        }
    }

    private void Q(Device device, DeviceDescriptor deviceDescriptor) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(deviceDescriptor.extraInfo)) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(deviceDescriptor.extraInfo);
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject = null;
            }
        }
        P(device, jSONObject);
        S(device, deviceDescriptor, jSONObject);
        R(device, jSONObject);
    }

    private void R(Device device, JSONObject jSONObject) {
        FeatureConfig featureConfig = FeatureConfig.get();
        featureConfig.save(device, null);
        if (jSONObject != null) {
            featureConfig.save(device, jSONObject.optJSONObject("config"));
        }
        featureConfig.load(device);
    }

    private void S(Device device, DeviceDescriptor deviceDescriptor, JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("v", 0);
            String strOptString = jSONObject.optString("hmModel", null);
            device.info().setVersion(iOptInt);
            if (!TextUtils.isEmpty(strOptString)) {
                device.info().setHuamiModel(strOptString);
            }
        }
        device.info().setModelNumber(deviceDescriptor.model);
        device.info().setBuildNumber(deviceDescriptor.displayID);
        Log.d(s, "Retrieve DeviceInfo : " + device.info(), new Object[0]);
    }

    private void T(Context context, boolean z, String str, boolean z2) {
        U(context, z || DeviceManager.getManager(context).hasBoundDevice(), z, false, str, z2);
    }

    private void U(Context context, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        String strGenerateUUIDFromCpuId;
        Device currentDevice;
        String string = context.getString(z2 ? R.string.connect_status_connect : R.string.connect_status_disconnect);
        boolean zIsMcuMode = false;
        if (DeviceUtil.UNKNOWN_DID.equals(str)) {
            Log.i(s, "Device with UnknownDID!!", new Object[0]);
            strGenerateUUIDFromCpuId = DataTransportService.TRANSACTOR_UUID;
        } else {
            strGenerateUUIDFromCpuId = DeviceUtil.generateUUIDFromCpuId(str);
        }
        if (z4 && (currentDevice = DeviceManager.getManager(context).getCurrentDevice()) != null) {
            zIsMcuMode = currentDevice.isMcuMode();
        }
        Intent intent = new Intent(context, (Class<?>) DataTransportService.class);
        intent.putExtra("IsForeground", z);
        intent.putExtra("IsDeviceConnected", z2);
        intent.putExtra("IsDeviceUnbound", z3);
        intent.putExtra("ContentText", string);
        intent.putExtra("DeviceId", str);
        intent.putExtra("UUID", strGenerateUUIDFromCpuId);
        intent.putExtra("IsBLE", z4);
        intent.putExtra("IsBLEMcu", zIsMcuMode);
        try {
            startService(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void V(Context context, String str, boolean z) {
        U(context, DeviceManager.getManager(context).hasBoundDevice(), false, true, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(SyncTag syncTag) {
        this.a++;
        SyncUtil.syncSystemTimeToWatch(this.k, new j(syncTag));
    }

    private Bundle X(DataBundle dataBundle) {
        Bundle bundle = new Bundle();
        for (String str : dataBundle.keySet()) {
            bundle.putSerializable(str, dataBundle.getSerializable(str));
        }
        return bundle;
    }

    public static CompanionApplication get() {
        return (CompanionApplication) y;
    }

    public static Context getContext() {
        return y;
    }

    public static <T> ArrayList<T> jsonToArrayList(String str, Class<T> cls) {
        ArrayList arrayList = (ArrayList) new Gson().fromJson(str, new b().getType());
        IDCGroupManager.AnonymousClass1.C10481 c10481 = (ArrayList<T>) new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c10481.add(new Gson().fromJson((JsonElement) it2.next(), (Class) cls));
        }
        return c10481;
    }

    private void w() {
        initCompanionCloudCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x() {
        return "已授予BLUETOOTH_CONNECT权限，开始初始化手助连接操作";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(TransportDataItem transportDataItem) {
        String action = transportDataItem.getAction();
        Log.d(s, "OTAService Action: " + action, new Object[0]);
        Handler handler = OtaTransportCmd.getInstance(this).getHandler();
        if (WifiTransportHandler.ACTION_SEND_SSID.equals(action)) {
            handler.obtainMessage(1, WifiTransportHandler.OnSendSsidHandler(transportDataItem).ssid).sendToTarget();
        } else if (WifiTransportHandler.ACTION_CHECK_UPDATE.equals(action)) {
            handler.obtainMessage(2).sendToTarget();
        } else if (WifiTransportHandler.ACTION_CANCEL_WIFI_PASSWORD.equals(action)) {
            handler.obtainMessage(3).sendToTarget();
        } else if (WifiTransportHandler.ACTION_ADD_WIFI.equals(action)) {
            handler.obtainMessage(4).sendToTarget();
        } else if (WifiTransportHandler.ACTION_CANCEL_WIFI_ADD.equals(action)) {
            handler.obtainMessage(5).sendToTarget();
        } else if (WifiTransportHandler.ACTION_ADD_EAP_WIFI.equals(action)) {
            handler.obtainMessage(6, WifiTransportHandler.onAddEapWifi(transportDataItem)).sendToTarget();
        }
        try {
            startService(new Intent(this, (Class<?>) OtaService.class));
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        Log.e(s, "Crash(" + thread + ")", th, new Object[0]);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    public void cancelCheckConnected(@NonNull String str) {
        this.j.removeMessages(2);
        Log.d(s, "Connect Device, Cancel Check Connected[" + str + "]!!", new Object[0]);
    }

    public void checkConnected(String str) {
        if (BTUtil.isBluetoothOn()) {
            Message message = new Message();
            message.what = 2;
            message.obj = str;
            this.j.removeMessages(2);
            this.j.sendMessageDelayed(message, 120000L);
            Log.d(s, "Connect Device, To Check Connected[" + str + "] with Timeout[2min]...", new Object[0]);
        }
    }

    public abstract BrandNameService getBrandNameService();

    public CallingWearHelper getCallingWearHelper() {
        return this.f;
    }

    public InputPasswordActivity getPasswordActivity() {
        return this.b;
    }

    public AddWifiActivity getWifiActivity() {
        return this.c;
    }

    public abstract void initCompanionCloudCallback();

    public void initPhoneConnection() {
        if (this.i) {
            return;
        }
        HMLog.info(s, new Function0() { // from class: rx0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CompanionApplication.x();
            }
        });
        this.mConnection.init(this);
        this.i = true;
    }

    @Override // com.huami.watch.transport.ble.connection.BleConnection.BleConnectable
    public void onConnectedBleDevice(BluetoothDevice bluetoothDevice) {
        Log.d(s, "OnConnectedBleDevice: " + bluetoothDevice, new Object[0]);
        String address = bluetoothDevice.getAddress();
        if (TextUtils.isEmpty(address)) {
            Log.w(s, "OnConnectedDevice : Address is Empty, Abort!!", new Object[0]);
            return;
        }
        boolean zEquals = address.equals(BindHelper.getHelper().getBindingDevice());
        DeviceManager manager = DeviceManager.getManager(this);
        Device deviceFind = manager.find(address);
        if (!zEquals && deviceFind == null) {
            Log.d(s, "OnConnectedDevice, BindingDevice: " + BindHelper.getHelper().getBindingDevice(), new Object[0]);
            Log.w(s, "OnConnectedDevice : None BindingDevice nor ExistDevice, Abort!!", new Object[0]);
            return;
        }
        if (deviceFind == null) {
            deviceFind = new Device(address, System.currentTimeMillis());
        }
        String key = this.mBleConnection.mBleDevice.getAuthInfo().getKey();
        Log.d(s, "ConnectedBleDevice AuthKey: " + key, new Object[0]);
        if (!TextUtils.isEmpty(key)) {
            deviceFind.info().bleAuthKey = key;
            if (zEquals) {
                deviceFind.info().bleAuthAppIdMiFit = true;
            }
        }
        deviceFind.setConnected(true);
        manager.save(deviceFind, true);
        manager.channelChanged(DeviceUtil.UNKNOWN_DID, true);
        if (!BindHelper.getHelper().isBinding()) {
            Log.d(s, "Start Sync BleDeviceInfo...", new Object[0]);
            SyncBleDeviceInfoHelper.getHelper(this).start();
        }
        T(this, true, DeviceUtil.UNKNOWN_DID, true);
        cancelCheckConnected(address);
        RxBus.get().postMainThread(new ConnectedEvent(address));
    }

    @Override // com.huami.watch.connect.Connectable
    public void onConnectedDevice(DeviceDescriptor deviceDescriptor) {
        if (deviceDescriptor == null) {
            Log.w(s, "DeviceDescriptor is Null, Abort!!", new Object[0]);
            return;
        }
        String str = deviceDescriptor.devAddress;
        if (TextUtils.isEmpty(str)) {
            Log.w(s, "OnConnectedDevice : Address is Empty, Abort!!", new Object[0]);
            return;
        }
        boolean zEquals = str.equals(BindHelper.getHelper().getBindingDevice());
        DeviceManager manager = DeviceManager.getManager(this);
        Device deviceFind = manager.find(str);
        if (!zEquals && deviceFind == null) {
            Log.d(s, "OnConnectedDevice, BindingDevice: " + BindHelper.getHelper().getBindingDevice(), new Object[0]);
            Log.w(s, "OnConnectedDevice : None BindingDevice nor ExistDevice, Abort!!", new Object[0]);
            return;
        }
        if (deviceFind == null) {
            deviceFind = new Device(str, System.currentTimeMillis());
        }
        Q(deviceFind, deviceDescriptor);
        deviceFind.setConnected(true);
        manager.save(deviceFind, true);
        RxBus.get().post(new ConnectedEvent(str));
        T(this, true, DeviceUtil.UNKNOWN_DID, false);
        cancelCheckConnected(str);
    }

    @Override // android.app.Application
    @SuppressLint({"CheckResult"})
    public void onCreate() {
        super.onCreate();
        y = this;
        Box.initDefault(this);
        w();
        FileDownloader.init(getContext(), new DownloadMgrInitialParams.InitCustomMaker().connectionCreator(new FileDownloadUrlConnection.Creator(new FileDownloadUrlConnection.Configuration().connectTimeout(15000).readTimeout(15000).proxy(Proxy.NO_PROXY))));
        boolean zIsDebug = Config.isDebug();
        Log.settings().setLogLevel(zIsDebug ? Log.LogLevel.FULL : Log.LogLevel.FILE_ONLY).setLogFile(StorageUtil.getLogFile(this, zIsDebug));
        Log.d(s, "OnAppCreate : " + AppUtil.getVersionNameAndCode(this), new Object[0]);
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: px0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                CompanionApplication.z(defaultUncaughtExceptionHandler, thread, th);
            }
        });
        Configs.ID_SERVER_INDEX_PRODUCT = HostManager.getAccountIdServer();
        Configs.USER_SERVER_PRODUCT = HostManager.getAccountUserServer();
        SyncThrottler.init(this);
        Transporter transporter = Transporter.get(this, "com.huami.watch.companion");
        this.k = transporter;
        transporter.addChannelListener(this.l);
        this.k.addDataListener(this.m);
        this.k.connectTransportService();
        Transporter transporter2 = Transporter.get(this, TransporterModules.MOUDLE_COMPANION_SYNC_DATA);
        transporter2.addDataListener(this.n);
        transporter2.connectTransportService();
        Transporter transporter3 = Transporter.get(this, TransporterModules.MODULE_NOTIFICAION);
        transporter3.addDataListener(this.o);
        transporter3.connectTransportService();
        Transporter transporter4 = Transporter.get(this, "com.huami.watch.health");
        this.p = transporter4;
        transporter4.addDataListener(this.q);
        this.p.connectTransportService();
        Transporter.get(this, "com.huami.watchface").connectTransportService();
        Transporter transporter5 = Transporter.get(this, TransporterModules.MODULE_OTA_SERVICE);
        transporter5.addDataListener(this.r);
        transporter5.connectTransportService();
        if (this.e == null) {
            this.e = new AskAndAnswer(this);
        }
        if (this.f == null) {
            this.f = new CallingWearHelper(this);
        }
        if (this.g == null) {
            this.g = new SyncNfcTradeHelper();
        }
        if (this.h == null) {
            this.h = new DataCollection(this);
        }
        RxBus.get().toObservable().subscribe(new i(), new Consumer() { // from class: ox0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CompanionApplication.B((Throwable) obj);
            }
        });
        HttpProxyServer httpProxyServer = new HttpProxyServer(getApplicationContext());
        this.d = httpProxyServer;
        httpProxyServer.init();
        registerActivityLifecycleCallbacks(new AppEnterForegroundCallBack());
        FeatureConfig.get().load(DeviceManager.getManager(this).getCurrentDevice());
        if (Build.VERSION.SDK_INT <= 30 || ZeppPermissionManagerKt.hasPermission(this, "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN")) {
            this.mConnection.init(this);
            this.i = true;
        }
        AppInitService.start(this);
    }

    @Override // com.huami.watch.connect.Connectable
    public void onCreateDeviceDescription(DeviceDescriptor deviceDescriptor) {
        deviceDescriptor.extraInfo = ConnectionUtil.getPhoneExtraInfo(getResources().getStringArray(R.array.support_features));
    }

    @Override // com.huami.watch.transport.ble.connection.BleConnection.BleConnectable
    public void onDisconnectedBleDevice(BluetoothDevice bluetoothDevice) {
        Log.d(s, "OnDisconnectedBleDevice: " + bluetoothDevice, new Object[0]);
        String address = bluetoothDevice.getAddress();
        if (TextUtils.isEmpty(address)) {
            Log.w(s, "OnConnectedDevice : Address is Empty, Abort!!", new Object[0]);
            return;
        }
        DeviceManager manager = DeviceManager.getManager(this);
        manager.disconnected(address);
        manager.channelChanged(DeviceUtil.UNKNOWN_DID, false);
        T(this, false, DeviceUtil.UNKNOWN_DID, true);
        RxBus.get().postMainThread(new DisconnectedEvent(address));
    }

    @Override // com.huami.watch.connect.Connectable
    public void onDisconnectedDevice(DeviceDescriptor deviceDescriptor) {
        String str = deviceDescriptor.devAddress;
        if (TextUtils.isEmpty(str)) {
            Log.w(s, "OnConnectedDevice : Address is Empty, Abort!!", new Object[0]);
            return;
        }
        DeviceManager.getManager(this).disconnected(str);
        RxBus.get().post(new DisconnectedEvent(str));
        T(this, false, DeviceUtil.UNKNOWN_DID, false);
    }

    public void onNetworkOrChannelChanged(boolean z) {
        if (!BindHelper.getHelper().isBinding() && DeviceManager.getManager(this).isBoundDeviceConnected()) {
            AGpsSyncService.scheduleSync(this, z ? "NetworkChanged" : "ChannelAvailable");
            WeatherService.start(this);
            SyncTokenHelper.syncTokenToWatch(this, this.k, false);
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        ActiveAndroid.dispose();
        ComponentLinkerCmdServer.release();
        SmartHomeServer.release();
        WatchWifiFtpUtil.release();
    }

    public void setPasswordActivity(InputPasswordActivity inputPasswordActivity) {
        this.b = inputPasswordActivity;
    }

    public void setWifiActivity(AddWifiActivity addWifiActivity) {
        this.c = addWifiActivity;
    }

    public void syncSystemTimeWithRetry(SyncTag syncTag) {
        this.a = 0;
        this.j.removeMessages(1);
        W(syncTag);
    }
}
