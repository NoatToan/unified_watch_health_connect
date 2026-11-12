package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.xms.wearable.Status;
import com.xiaomi.xms.wearable.amap.AmapConnectProvider;
import com.xiaomi.xms.wearable.auth.Permission;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppCapability;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.extensions.DeviceModelExtKt;
import com.xiaomi.xms.wearable.extensions.ExtensionsKt;
import com.xiaomi.xms.wearable.message.MessageListenerCookie;
import com.xiaomi.xms.wearable.node.DataItem;
import com.xiaomi.xms.wearable.node.DataStatusCookie;
import com.xiaomi.xms.wearable.node.Node;
import com.xiaomi.xms.wearable.notify.NotificationData;
import com.xiaomi.xms.wearable.ui.PermissionManagementFragment;
import com.xiaomi.xms.wearable.ui.TransparentActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class d8r extends w0d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f15222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RemoteCallbackList<zqc> f15223b = new RemoteCallbackList<>();
    public RemoteCallbackList<xvc> c = new RemoteCallbackList<>();
    public ArrayMap<String, ArrayList<DataItem>> d = new ArrayMap<>();
    public RemoteCallbackList<xtc> e = new RemoteCallbackList<>();
    public ArrayMap<String, Boolean> f = new ArrayMap<>();
    public RemoteCallbackList<gyc> g = new RemoteCallbackList<>();
    public SimpleDateFormat h = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);

    public class a implements eu6<List<WatchAppItemEntity>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0d f15225b;

        public a(String str, q0d q0dVar) {
            this.f15224a = str;
            this.f15225b = q0dVar;
        }

        @Override // defpackage.eu6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(List<WatchAppItemEntity> list) {
            try {
                this.f15225b.T2(d8r.this.D5(this.f15224a, list));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.eu6
        public void onError(int i) {
        }
    }

    public class b implements eu6<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0d f15226a;

        public b(r0d r0dVar) {
            this.f15226a = r0dVar;
        }

        @Override // defpackage.eu6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Unit unit) {
            try {
                this.f15226a.V4(Status.RESULT_SUCCESS);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.eu6
        public void onError(int i) {
            Status status = Status.RESULT_CANCELLED;
            if (i == -1) {
                status = Status.RESULT_TIMEOUT;
            } else if (i == -3) {
                status = Status.RESULT_DISCONNECTED;
            }
            try {
                this.f15226a.V4(status);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public class c implements eu6<mwo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DataItem f15228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yqc f15229b;

        public c(DataItem dataItem, yqc yqcVar) {
            this.f15228a = dataItem;
            this.f15229b = yqcVar;
        }

        @Override // defpackage.eu6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(mwo mwoVar) {
            xg1.d("query success status = " + mwoVar.toString());
            Bundle bundle = new Bundle();
            int iA = this.f15228a.a();
            if (iA == DataItem.ITEM_CHARGING.a()) {
                bundle.putBoolean(DataItem.KEY_CHARGING_STATUS, mwoVar.c);
            } else if (iA == DataItem.ITEM_SLEEP.a()) {
                bundle.putBoolean(DataItem.KEY_SLEEP_STATUS, mwoVar.f);
            } else if (iA == DataItem.ITEM_WEARING.a()) {
                bundle.putBoolean(DataItem.KEY_WEARING_STATUS, mwoVar.e);
            } else if (iA == DataItem.ITEM_BATTERY.a()) {
                bundle.putInt(DataItem.KEY_BATTERY_STATUS, mwoVar.d);
            }
            try {
                xg1.d("query callback.onResult type:" + iA);
                this.f15229b.I1(this.f15228a, bundle);
            } catch (RemoteException e) {
                e.printStackTrace();
                xg1.c("query callback.onResult", e);
            }
        }

        @Override // defpackage.eu6
        public void onError(int i) {
            xg1.d("query onError errorCode = " + i);
            Status status = Status.RESULT_CANCELLED;
            if (i == -1) {
                status = Status.RESULT_TIMEOUT;
            } else if (i == -3) {
                status = Status.RESULT_DISCONNECTED;
            }
            try {
                xg1.d("query callback.onFailure errorStatus:" + status);
                this.f15229b.a(status);
            } catch (RemoteException e) {
                e.printStackTrace();
                xg1.c("callback.onFailure", e);
            }
        }
    }

    public class d implements eu6<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wtc f15230a;

        public d(wtc wtcVar) {
            this.f15230a = wtcVar;
        }

        @Override // defpackage.eu6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Unit unit) {
            xg1.d("sendPhoneMessage onResult");
            try {
                this.f15230a.t3(Status.RESULT_SUCCESS);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.eu6
        public void onError(int i) {
            xg1.d("sendPhoneMessage onError errorCode:" + i);
            try {
                this.f15230a.t3(Status.RESULT_TIMEOUT);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public class e implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15232a;

        public e(String str) {
            this.f15232a = str;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            xg1.d("DeathRecipient dataItems before remove = " + d8r.this.d.get(this.f15232a));
            if (d8r.this.d.get(this.f15232a) != null) {
                d8r.this.d.get(this.f15232a).clear();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DeathRecipient dataItems after remove = ");
            d8r d8rVar = d8r.this;
            sb.append(d8rVar.d.get(d8rVar.u5()));
            xg1.d(sb.toString());
        }
    }

    public class f implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15234a;

        public f(String str) {
            this.f15234a = str;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            d8r.this.f.put(this.f15234a, Boolean.FALSE);
            d8r.this.E5(this.f15234a, false);
            xg1.d("appConnectedStatus:" + d8r.this.f.toString());
        }
    }

    public d8r(Context context) {
        this.f15222a = context;
    }

    public final WatchAppRepository A5() {
        return WatchAppRepository.INSTANCE.getInstance();
    }

    public void B5(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt(DataItem.KEY_CONNECTION_STATUS, z ? 1 : 2);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(str);
        if (wearableDeviceModel == null) {
            return;
        }
        boolean zIsSupportThirdPartyApp = DeviceModelExtKt.isSupportThirdPartyApp(wearableDeviceModel);
        xg1.d("onConnectedStatusChanged: " + str + " " + z + "  " + zIsSupportThirdPartyApp);
        if (zIsSupportThirdPartyApp) {
            p5(str, DataItem.ITEM_CONNECTION, bundle);
        }
        AmapConnectProvider.INSTANCE.getInstance().onConnectChanged();
    }

    public void C5() {
        int iBeginBroadcast = this.c.beginBroadcast();
        while (iBeginBroadcast > 0) {
            iBeginBroadcast--;
            try {
                xvc xvcVar = (xvc) this.c.getBroadcastItem(iBeginBroadcast);
                urh urhVar = (urh) this.c.getBroadcastCookie(iBeginBroadcast);
                Permission[] permissionArr = urhVar.f36055a;
                ArrayList arrayList = new ArrayList();
                for (Permission permission : permissionArr) {
                    if (WatchAppRepository.INSTANCE.getInstance().isPermissionGranted(urhVar.f36056b, permission)) {
                        arrayList.add(permission);
                    }
                }
                Permission[] permissionArr2 = new Permission[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    permissionArr2[i] = (Permission) arrayList.get(i);
                }
                xvcVar.D(permissionArr2);
                this.c.unregister(xvcVar);
            } catch (Exception e2) {
                e2.printStackTrace();
                xg1.d("iPermissionCallback onPermissionGranted failed exception:" + e2.getMessage());
            }
        }
        this.c.finishBroadcast();
    }

    @Override // defpackage.w0d
    public void D1(String str, Permission[] permissionArr, bwc bwcVar) throws RemoteException {
        xg1.d("checkPermissions permissions length:" + permissionArr.length);
        int iS5 = s5(str);
        if (iS5 != 1) {
            bwcVar.a(x5(iS5));
            return;
        }
        WatchAppRepository watchAppRepositoryA5 = A5();
        boolean[] zArr = new boolean[permissionArr.length];
        for (int i = 0; i < permissionArr.length; i++) {
            zArr[i] = watchAppRepositoryA5.isPermissionGranted(ExtensionsKt.getCallingPackage(), permissionArr[i]);
        }
        bwcVar.p2(zArr);
    }

    public final boolean D5(String str, List<WatchAppItemEntity> list) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strTrim = str.trim();
        Iterator<WatchAppItemEntity> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getPackageName().equals(strTrim)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.w0d
    public void E4(String str, String str2, r0d r0dVar) throws RemoteException {
        xg1.d("launchWearApp");
        int iS5 = s5(str);
        if (iS5 != 1) {
            r0dVar.V4(x5(iS5));
            return;
        }
        WearableDeviceModel wearableDeviceModelT5 = t5();
        if (wearableDeviceModelT5 == null) {
            return;
        }
        xg1.d("launchWearApp " + wearableDeviceModelT5.getDeviceInfo().getDid());
        DeviceModelExtKt.launchApp(wearableDeviceModelT5, ExtensionsKt.getCallingPackage(), str2, ExtensionsKt.getCurFingerPrint(), new b(r0dVar));
    }

    public void E5(String str, boolean z) {
        WearableDeviceModel wearableDeviceModelT5 = t5();
        if (wearableDeviceModelT5 == null) {
            Logger logger = Logger.INSTANCE;
            Logger.e("syncPhoneAppStatus " + str + " error: model is null", new Object[0]);
            return;
        }
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModelT5) && DeviceModelExtKt.isSupportThirdPartyApp(wearableDeviceModelT5)) {
            ccp ccpVar = new ccp();
            ccpVar.d = ExtensionsKt.getFingerPrintByPackage(str);
            ccpVar.c = str;
            DeviceModelExtKt.syncPhoneAppStatus(wearableDeviceModelT5, ccpVar, z);
        }
    }

    @Override // defpackage.w0d
    public void F3(gyc gycVar) throws RemoteException {
        String callingPackage = ExtensionsKt.getCallingPackage();
        gycVar.asBinder().linkToDeath(new f(callingPackage), 0);
        this.g.register(gycVar);
        this.f.put(callingPackage, Boolean.TRUE);
        gycVar.S0();
        E5(callingPackage, true);
        xg1.b("appConnectedStatus:" + this.f.toString());
    }

    public final void F5(String str, String str2) {
        int iBeginBroadcast = this.f15223b.beginBroadcast();
        while (iBeginBroadcast > 0) {
            iBeginBroadcast--;
            DataStatusCookie dataStatusCookie = (DataStatusCookie) this.f15223b.getBroadcastCookie(iBeginBroadcast);
            if (dataStatusCookie.getDataItemKey().equals(str2) && dataStatusCookie.getDid().equals(str)) {
                RemoteCallbackList<zqc> remoteCallbackList = this.f15223b;
                remoteCallbackList.unregister((zqc) remoteCallbackList.getBroadcastItem(iBeginBroadcast));
            }
        }
        this.f15223b.finishBroadcast();
    }

    public final void G5(String str, String str2) {
        int iBeginBroadcast = this.e.beginBroadcast();
        while (iBeginBroadcast > 0) {
            iBeginBroadcast--;
            MessageListenerCookie messageListenerCookie = (MessageListenerCookie) this.e.getBroadcastCookie(iBeginBroadcast);
            if (messageListenerCookie.getMessageKey().equals(str2) && messageListenerCookie.getDid().equals(str)) {
                RemoteCallbackList<xtc> remoteCallbackList = this.e;
                remoteCallbackList.unregister((xtc) remoteCallbackList.getBroadcastItem(iBeginBroadcast));
            }
        }
        this.e.finishBroadcast();
    }

    @Override // defpackage.w0d
    public void L3(vuc vucVar) throws RemoteException {
        xg1.d("getConnectedNodes");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        ArrayList arrayList = new ArrayList();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportThirdPartyApp(wearableDeviceModel)) {
            arrayList.add(new Node(wearableDeviceModel.getDeviceInfo().getDid(), wearableDeviceModel.getDeviceInfo().getName()));
        }
        try {
            vucVar.O1(arrayList);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.w0d
    public void O(String str, DataItem dataItem) throws RemoteException {
        xg1.d("unsubscribe did:" + str);
        if (y5(str) && z5(Permission.DEVICE_MANAGER, str)) {
            ArrayList<DataItem> arrayList = this.d.get(u5());
            if (arrayList != null) {
                arrayList.remove(dataItem);
                if (arrayList.isEmpty()) {
                    F5(str, u5());
                }
            }
            this.f15223b.beginBroadcast();
            xg1.d("unsubscribe dataListener size = " + this.f15223b.getRegisteredCallbackCount());
            this.f15223b.finishBroadcast();
        }
    }

    @Override // defpackage.w0d
    public void Q3(String str, wtc wtcVar) throws RemoteException {
        xg1.d("unregisterMessagelistener did:" + str);
        int iS5 = s5(str);
        if (iS5 != 1) {
            wtcVar.t3(x5(iS5));
            return;
        }
        if (!z5(Permission.DEVICE_MANAGER, str)) {
            wtcVar.t3(Status.RESULT_PERMISSION_DENIED);
            return;
        }
        String strV5 = v5(ExtensionsKt.getCallingPackage());
        G5(str, strV5);
        xg1.d("unregisterMessagelistener messageKey:" + strV5 + "  did:" + str + "  getRegisteredCallbackCount:" + this.e.getRegisteredCallbackCount());
        wtcVar.t3(Status.RESULT_SUCCESS);
    }

    @Override // defpackage.w0d
    public void X3(String str, xtc xtcVar, wtc wtcVar) throws RemoteException {
        xg1.d("registerMessageListener did:" + str);
        int iS5 = s5(str);
        if (iS5 != 1) {
            wtcVar.t3(x5(iS5));
            return;
        }
        if (!z5(Permission.DEVICE_MANAGER, str)) {
            wtcVar.t3(Status.RESULT_PERMISSION_DENIED);
            return;
        }
        String strV5 = v5(ExtensionsKt.getCallingPackage());
        this.e.register(xtcVar, new MessageListenerCookie(str, strV5));
        xg1.d("registerMessageListener messageKey:" + strV5 + "  did:" + str + "  getRegisteredCallbackCount:" + this.e.getRegisteredCallbackCount());
        wtcVar.t3(Status.RESULT_SUCCESS);
    }

    @Override // defpackage.w0d
    public void b0(String str, q0d q0dVar) throws RemoteException {
        xg1.d("isWearAppInstalled");
        if (!z5(Permission.DEVICE_MANAGER, str)) {
            q0dVar.a(Status.RESULT_PERMISSION_DENIED);
            return;
        }
        if (A5().hasWatchApps(ExtensionsKt.getCallingPackage(), str)) {
            q0dVar.T2(true);
            return;
        }
        WearableDeviceModel wearableDeviceModelT5 = t5();
        String callingPackage = ExtensionsKt.getCallingPackage();
        if (wearableDeviceModelT5 != null) {
            DeviceModelExtKt.isWearAppInstalled(wearableDeviceModelT5, new a(callingPackage, q0dVar));
            return;
        }
        xg1.b("isWearAppInstalled " + str + " error: deviceModel is null");
    }

    @Override // defpackage.w0d
    public void e1(String str, DataItem dataItem, yqc yqcVar) throws RemoteException {
        xg1.d(SearchIntents.EXTRA_QUERY);
        int iS5 = s5(str);
        if (iS5 != 1) {
            Status statusX5 = x5(iS5);
            xg1.d("query statusFromVerifyResult:" + statusX5);
            yqcVar.a(statusX5);
            return;
        }
        if (!z5(Permission.DEVICE_MANAGER, str)) {
            xg1.d("query !isPermissionGranted(Permission.DEVICE_MANAGER, did)");
            yqcVar.a(Status.RESULT_PERMISSION_DENIED);
            return;
        }
        WearableDeviceModel wearableDeviceModelT5 = t5();
        if (wearableDeviceModelT5 == null || !wearableDeviceModelT5.getDeviceInfo().getDid().equals(str)) {
            return;
        }
        int iA = dataItem.a();
        DataItem dataItem2 = DataItem.ITEM_CONNECTION;
        if (iA != dataItem2.a()) {
            WearableDeviceModel wearableDeviceModelT6 = t5();
            if (wearableDeviceModelT6 == null || !wearableDeviceModelT6.getIsDeviceConnected()) {
                yqcVar.a(Status.RESULT_DISCONNECTED);
                return;
            } else {
                DeviceModelExtKt.queryStatus(wearableDeviceModelT6, new c(dataItem, yqcVar));
                return;
            }
        }
        Bundle bundle = new Bundle();
        int i = wearableDeviceModelT5.getIsDeviceConnected() ? 1 : 2;
        bundle.putInt(DataItem.KEY_CONNECTION_STATUS, i);
        xg1.d("query   dataItem.getType() == DataItem.ITEM_CONNECTION.getType()  connectionStatus:" + i);
        yqcVar.I1(dataItem2, bundle);
    }

    @Override // defpackage.w0d
    public void j4(String str, byte[] bArr, wtc wtcVar) throws RemoteException {
        xg1.d("sendMessage did:" + str);
        int iS5 = s5(str);
        if (iS5 != 1) {
            xg1.d("sendMessage verifyCode != VERIFY_SUCCESS");
            wtcVar.t3(x5(iS5));
        } else {
            if (!z5(Permission.DEVICE_MANAGER, str)) {
                xg1.d("sendMessage !isPermissionGranted(Permission.DEVICE_MANAGER, did)");
                wtcVar.t3(Status.RESULT_PERMISSION_DENIED);
                return;
            }
            WearableDeviceModel wearableDeviceModelT5 = t5();
            byte[] curFingerPrint = ExtensionsKt.getCurFingerPrint();
            if (wearableDeviceModelT5 == null) {
                xg1.d("sendMessage deviceModel == null");
            } else {
                DeviceModelExtKt.sendPhoneMessage(wearableDeviceModelT5, ExtensionsKt.getCallingPackage(), curFingerPrint, bArr, new d(wtcVar));
            }
        }
    }

    @Override // defpackage.w0d
    public void j5(String str, NotificationData notificationData, wuc wucVar) throws RemoteException {
        xg1.d("sendNotification:notifyData = " + notificationData.c() + " : " + notificationData.a());
        int iS5 = s5(str);
        if (iS5 != 1) {
            wucVar.X4(x5(iS5));
            return;
        }
        if (!z5(Permission.NOTIFY, str)) {
            wucVar.X4(Status.RESULT_PERMISSION_DENIED);
            return;
        }
        WearableDeviceModel wearableDeviceModelT5 = t5();
        if (wearableDeviceModelT5 == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModelT5)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        rxg rxgVar = new rxg();
        rxgVar.c = ExtensionsKt.getCallingPackage();
        rxgVar.e = notificationData.c();
        rxgVar.g = notificationData.a();
        rxgVar.d = ExtensionsKt.getAppName(ExtensionsKt.getCallingPackage());
        rxgVar.h = this.h.format(new Date(System.currentTimeMillis()));
        rxgVar.l = 0;
        arrayList.add(rxgVar);
        rxg.d dVar = new rxg.d();
        dVar.c = (rxg[]) arrayList.toArray(new rxg[0]);
        DeviceModelExtKt.addNotifications(wearableDeviceModelT5, dVar);
        wucVar.X4(Status.RESULT_SUCCESS);
    }

    @Override // defpackage.w0d
    public int l4() throws RemoteException {
        return 0;
    }

    @Override // defpackage.w0d
    public void m1(String str, DataItem dataItem, zqc zqcVar) throws RemoteException {
        WearableDeviceModel wearableDeviceModelT5;
        xg1.d("subscribe did:" + str);
        if (s5(str) == 1 && z5(Permission.DEVICE_MANAGER, str) && (wearableDeviceModelT5 = t5()) != null && wearableDeviceModelT5.getDeviceInfo().getDid().equals(str)) {
            ArrayList<DataItem> arrayList = this.d.get(u5());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.d.put(u5(), arrayList);
            }
            if (arrayList.size() == 0) {
                zqcVar.asBinder().linkToDeath(new e(u5()), 0);
            }
            if (!arrayList.contains(dataItem)) {
                arrayList.add(dataItem);
            }
            this.f15223b.register(zqcVar, new DataStatusCookie(str, u5()));
            this.f15223b.beginBroadcast();
            xg1.d("subscribe dataListener size = " + this.f15223b.getRegisteredCallbackCount());
            this.f15223b.finishBroadcast();
        }
    }

    @Override // defpackage.w0d
    public void n0(String str, Permission[] permissionArr, xvc xvcVar) throws RemoteException {
        xg1.d("requestPermissions permissions length:" + permissionArr.length);
        int iS5 = s5(str);
        if (iS5 != 1) {
            xvcVar.a(x5(iS5));
            return;
        }
        WatchAppRepository watchAppRepositoryA5 = A5();
        if (!watchAppRepositoryA5.hasWatchAppCapability(ExtensionsKt.getCallingPackage())) {
            WatchAppItemEntity watchApp = watchAppRepositoryA5.getWatchApp(ExtensionsKt.getCallingPackage(), str);
            if (watchApp == null) {
                xvcVar.a(Status.RESULT_PACKAGE_NOT_INSTALLED);
                return;
            }
            xvcVar.D(permissionArr);
            WatchAppCapability watchAppCapability = new WatchAppCapability(watchApp.getPackageName(), watchApp.getAppName(), true, true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(watchAppCapability);
            watchAppRepositoryA5.insertWatchCapability(arrayList);
            return;
        }
        boolean z = true;
        for (Permission permission : permissionArr) {
            if (!z5(permission, str)) {
                z = false;
            }
        }
        if (z) {
            xvcVar.D(permissionArr);
            return;
        }
        this.c.register(xvcVar, new urh(permissionArr, ExtensionsKt.getCallingPackage(), str));
        Bundle bundle = new Bundle();
        bundle.putString(PermissionManagementFragment.KEY_PACKAGE_NAME, ExtensionsKt.getCallingPackage());
        bundle.putParcelableArray(PermissionManagementFragment.KEY_PERMISSIONS, permissionArr);
        bundle.putBoolean(PermissionManagementFragment.KEY_IS_REQUEST, true);
        Intent intent = new Intent(this.f15222a, (Class<?>) TransparentActivity.class);
        intent.addFlags(276889600);
        intent.putExtras(bundle);
        this.f15222a.startActivity(intent);
    }

    @Override // defpackage.w0d
    public void p1(String str, Permission permission, yvc yvcVar) throws RemoteException {
        xg1.d("checkPermission did:" + str);
        int iS5 = s5(str);
        if (iS5 != 1) {
            yvcVar.a(x5(iS5));
        } else {
            yvcVar.U4(A5().isPermissionGranted(ExtensionsKt.getCallingPackage(), permission));
        }
    }

    public void p5(String str, DataItem dataItem, Bundle bundle) {
        int iBeginBroadcast = this.f15223b.beginBroadcast();
        while (iBeginBroadcast > 0) {
            iBeginBroadcast--;
            try {
                zqc zqcVar = (zqc) this.f15223b.getBroadcastItem(iBeginBroadcast);
                DataStatusCookie dataStatusCookie = (DataStatusCookie) this.f15223b.getBroadcastCookie(iBeginBroadcast);
                ArrayList<DataItem> arrayList = this.d.get(dataStatusCookie.getDataItemKey());
                if (arrayList != null && arrayList.contains(dataItem) && str.equals(dataStatusCookie.getDid())) {
                    xg1.d("broadcastStatus:" + dataItem + " " + dataStatusCookie.getDid());
                    zqcVar.l5(str, dataItem, bundle);
                } else if (arrayList != null && arrayList.contains(dataItem) && dataItem.a() == DataItem.ITEM_CONNECTION.a()) {
                    xg1.d("broadcastStatus: item_connection: " + bundle.toString());
                    zqcVar.l5(str, dataItem, bundle);
                }
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
        this.f15223b.finishBroadcast();
    }

    public void q5(String str, String str2, byte[] bArr) throws RemoteException {
        int registeredCallbackCount = this.e.getRegisteredCallbackCount();
        int iBeginBroadcast = this.e.beginBroadcast();
        xg1.d("callBackMessageListener" + str2 + "  registeredCallbackCount:" + registeredCallbackCount + "   curIndex:" + iBeginBroadcast);
        while (iBeginBroadcast > 0) {
            iBeginBroadcast--;
            MessageListenerCookie messageListenerCookie = (MessageListenerCookie) this.e.getBroadcastCookie(iBeginBroadcast);
            String strV5 = v5(str2);
            String messageKey = messageListenerCookie.getMessageKey();
            String did = messageListenerCookie.getDid();
            xg1.d("callBackMessageListener messageKey:" + messageKey + "  pkgKey:" + strV5 + " cookieDid:" + did + "  did:" + str);
            if (messageKey.equals(strV5) && did.equals(str)) {
                xg1.d("send message to " + str2);
                ((xtc) this.e.getBroadcastItem(iBeginBroadcast)).M(str, bArr);
            }
        }
        this.e.finishBroadcast();
    }

    public void r5(String str, owo owoVar) {
        if (owoVar.c > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt(DataItem.KEY_CHARGING_STATUS, owoVar.c);
            p5(str, DataItem.ITEM_CHARGING, bundle);
        }
        if (owoVar.e > 0) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(DataItem.KEY_SLEEP_STATUS, owoVar.e);
            p5(str, DataItem.ITEM_SLEEP, bundle2);
        }
        if (owoVar.d > 0) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt(DataItem.KEY_WEARING_STATUS, owoVar.d);
            p5(str, DataItem.ITEM_WEARING, bundle3);
        }
        if (owoVar.f > 0) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt(DataItem.KEY_WARNING_STATUS, owoVar.f);
            p5(str, DataItem.ITEM_WARNING, bundle4);
        }
        if (owoVar.g != null) {
            new Bundle();
        }
    }

    public int s5(String str) {
        WatchAppRepository watchAppRepositoryA5 = A5();
        xg1.d("fingerPrintVerify package:" + ExtensionsKt.getCallingPackage() + " did:" + str);
        WatchAppItemEntity watchApp = watchAppRepositoryA5.getWatchApp(ExtensionsKt.getCallingPackage(), str);
        if (watchApp == null) {
            xg1.d("fingerPrintVerify app not installed");
            return -2;
        }
        byte[] curFingerPrint = ExtensionsKt.getCurFingerPrint();
        byte[] fingerprint = watchApp.getFingerprint();
        xg1.d("dbFingerprint:" + Arrays.toString(fingerprint) + "   curFingerPrint:" + Arrays.toString(curFingerPrint));
        if (Arrays.equals(fingerprint, curFingerPrint)) {
            xg1.d("fingerPrintVerify success");
            return 1;
        }
        xg1.d("fingerPrintVerify failed");
        return -1;
    }

    public final WearableDeviceModel t5() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @NotNull
    public final String u5() {
        return "key_data_" + Binder.getCallingPid();
    }

    public final String v5(String str) {
        return "key_message_" + str;
    }

    public boolean w5(String str) {
        if (!this.f.containsKey(str)) {
            return false;
        }
        xg1.d("getServiceConnected " + str + " is appConnectedStatus result:" + this.f.get(str));
        return this.f.get(str).booleanValue();
    }

    public final Status x5(int i) {
        Status status = Status.RESULT_CANCELLED;
        if (i != -2) {
            return i != -1 ? status : Status.RESULT_SIGNATURE_VERIFY_FAILED;
        }
        return Status.RESULT_PACKAGE_NOT_INSTALLED;
    }

    public boolean y5(String str) {
        return s5(str) == 1;
    }

    public final boolean z5(Permission permission, String str) {
        boolean zIsPermissionGranted = A5().isPermissionGranted(ExtensionsKt.getCallingPackage(), permission);
        xg1.d("is device:" + str + " Permission " + permission.a() + " Granted :" + zIsPermissionGranted);
        return zIsPermissionGranted;
    }
}
