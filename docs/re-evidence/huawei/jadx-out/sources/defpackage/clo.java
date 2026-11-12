package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.data.FreezableUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import health.compact.a.LogUtil;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes4.dex */
public class clo implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static clo f1738b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1739a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BtDeviceResponseCallback f1740c;
    private BtDeviceResponseCallback e;
    private HandlerThread f;
    private Handler g;
    private DeviceInfo h;
    private GoogleApiClient i;
    private String l;
    private DeviceStatusChangeCallback m;
    private MessageReceiveCallback n;
    private MessageClient o;
    private Wearable.WearableOptions t;
    private int k = 0;
    private int j = 0;

    private clo() {
        HandlerThread handlerThread = new HandlerThread("SmartWatchPhysicalService");
        this.f = handlerThread;
        this.g = null;
        this.f1740c = null;
        this.e = null;
        handlerThread.start();
        this.g = new Handler(this.f.getLooper());
        this.t = new Wearable.WearableOptions.Builder().setLooper(this.f.getLooper()).build();
        this.o = Wearable.getMessageClient(BaseApplication.b(), this.t);
    }

    public static clo a() {
        clo cloVar;
        synchronized (clo.class) {
            if (f1738b == null) {
                f1738b = new clo();
            }
            cloVar = f1738b;
        }
        return cloVar;
    }

    public void b() {
        LogUtil.b("SmartWatchPhysicalService", "Enter gmsConnect.");
        GoogleApiClient googleApiClient = this.i;
        if (googleApiClient != null) {
            googleApiClient.connect();
            return;
        }
        GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(BaseApplication.b()).addApi(Wearable.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).setHandler(this.g).build();
        this.i = googleApiClientBuild;
        googleApiClientBuild.connect();
    }

    public void a(Node node) {
        if (node == null) {
            LogUtil.d("SmartWatchPhysicalService", "onPeerConnected node is null");
            return;
        }
        LogUtil.b("SmartWatchPhysicalService", "onPeerConnected, connected watch: ", node.getDisplayName(), ",ID = ", node.getId());
        e(node, 2, 100000);
        if (this.i.isConnected()) {
            return;
        }
        this.i.reconnect();
    }

    public void d(Node node) {
        if (node == null) {
            LogUtil.d("SmartWatchPhysicalService", "onPeerDisconnected node is null");
        } else {
            LogUtil.b("SmartWatchPhysicalService", "onPeerDisconnected:", "aw device disconnected with displayName = ", node.getDisplayName(), " id = ", node.getId());
            e(node, 0, 100000);
        }
    }

    public void b(DataEventBuffer dataEventBuffer) throws Throwable {
        LogUtil.b("SmartWatchPhysicalService", "onDataChanged:" + dataEventBuffer);
        ArrayList arrayListFreezeIterable = FreezableUtils.freezeIterable(dataEventBuffer);
        LogUtil.b("SmartWatchPhysicalService", "onDataChanged, rev_path = ", "/wear_request_data", ", key = ", "wear_request_data");
        d(arrayListFreezeIterable);
    }

    public void e(CapabilityInfo capabilityInfo) {
        if (capabilityInfo == null) {
            LogUtil.b("SmartWatchPhysicalService", "onCapabilityChanged, capabilityInfo is null");
            return;
        }
        LogUtil.b("SmartWatchPhysicalService", "onCapabilityChanged:", capabilityInfo);
        Set<Node> nodes = capabilityInfo.getNodes();
        if (nodes == null || nodes.size() == 0) {
            LogUtil.b("SmartWatchPhysicalService", "onCapabilityChanged nodeSet is null ");
            DeviceStatusChangeCallback deviceStatusChangeCallback = this.m;
            if (deviceStatusChangeCallback != null) {
                deviceStatusChangeCallback.onConnectStatusChanged(this.h, 0, cpi.c(2, 303));
                return;
            }
            return;
        }
        Iterator<Node> it = nodes.iterator();
        while (it.hasNext()) {
            e(it.next(), 2, 100000);
        }
    }

    public void a(MessageEvent messageEvent) {
        LogUtil.b("SmartWatchPhysicalService", "onMessageReceived: ", messageEvent);
        if (messageEvent == null || messageEvent.getPath() == null) {
            LogUtil.e("SmartWatchPhysicalService", "onMessageReceived messageEvent or path is null");
            return;
        }
        String sourceNodeId = messageEvent.getSourceNodeId();
        int requestId = messageEvent.getRequestId();
        LogUtil.b("SmartWatchPhysicalService", "Enter onMessageReceived() RequestId = ", Integer.valueOf(requestId), "Path = ", messageEvent.getPath(), ";nodeId:", sourceNodeId);
        String path = messageEvent.getPath();
        if ("/wear_request_message".equalsIgnoreCase(path)) {
            byte[] data = messageEvent.getData();
            LogUtil.b("SmartWatchPhysicalService", "onMessageReceived message bytes = ", cph.d(data));
            if (data.length > 6 && data[4] == 1 && data[5] == 21) {
                f();
            }
        }
        if (path.startsWith("/wear_request_data")) {
            byte[] data2 = messageEvent.getData();
            if (data2 != null) {
                cpl.d("SmartWatchPhysicalService", data2, "MessageAPI Device-->SDK: ");
                if (this.n != null && this.h != null) {
                    d(data2, 0);
                    LogUtil.b("SmartWatchPhysicalService", "onMessageReceived() handle success");
                    return;
                } else {
                    LogUtil.d("SmartWatchPhysicalService", "onMessageReceived(), mBTDeviceStateCallback is null");
                    return;
                }
            }
            LogUtil.e("SmartWatchPhysicalService", "onMessageReceived(), bytes is null");
        }
    }

    private void d(List<DataEvent> list) throws Throwable {
        for (DataEvent dataEvent : list) {
            if (dataEvent.getType() == 1) {
                String path = dataEvent.getDataItem().getUri().getPath();
                LogUtil.b("SmartWatchPhysicalService", "onDataChanged, watch path = ", path);
                DataMap dataMap = DataMapItem.fromDataItem(dataEvent.getDataItem()).getDataMap();
                if (path != null && path.startsWith("/wear_request_data")) {
                    e(dataMap, "wear_request_data");
                } else if ("/wear".equals(path)) {
                    e(dataMap, "byte");
                } else if ("/wear_request_asset".equals(path)) {
                    b(dataMap);
                } else {
                    LogUtil.b("SmartWatchPhysicalService", "onDataChanged(), no Support ");
                }
            } else if (dataEvent.getType() == 2) {
                LogUtil.b("SmartWatchPhysicalService", "onDataChanged() DataItem Deleted: ", dataEvent.getDataItem().toString());
            } else {
                LogUtil.e("SmartWatchPhysicalService", "onDataChanged(), no Support ");
            }
        }
    }

    private void e(DataMap dataMap, String str) {
        if (dataMap == null) {
            LogUtil.e("SmartWatchPhysicalService", "onDataChanged(), dataMap is null");
            return;
        }
        byte[] byteArray = dataMap.getByteArray(str);
        if (byteArray != null) {
            cpl.d("SmartWatchPhysicalService", byteArray, "Device-->SDK: ");
            d(byteArray, 100000);
        } else {
            LogUtil.e("SmartWatchPhysicalService", "checkByteOne onDataChanged(), bytes is null");
        }
    }

    private void b(DataMap dataMap) throws Throwable {
        if (dataMap == null) {
            LogUtil.b("SmartWatchPhysicalService", "onDataChanged(), PATH_WEAR_REQUEST_ASSET dataMap is null");
            return;
        }
        Asset asset = dataMap.getAsset("wear_request_asset");
        if (asset != null) {
            try {
                byte[] bArrC = c(asset);
                cpl.d("SmartWatchPhysicalService", bArrC, "Asset Device-->SDK: ");
                BtDeviceResponseCallback btDeviceResponseCallback = this.f1740c;
                if (btDeviceResponseCallback == null) {
                    LogUtil.e("SmartWatchPhysicalService", "onDataChanged(), mBTDeviceFileCallback is null");
                } else {
                    btDeviceResponseCallback.onResponse(0, bArrC);
                    LogUtil.b("SmartWatchPhysicalService", "onDataChanged() asset handle success");
                }
                if (this.e != null) {
                    String string = dataMap.getString("wear_request_asset_name");
                    if (TextUtils.isEmpty(string)) {
                        LogUtil.e("SmartWatchPhysicalService", "can not report assetFile, name is null");
                        return;
                    }
                    try {
                        String str = BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "watchfaceAsset" + File.separator + string;
                        if (bArrC != null) {
                            d(bArrC, str);
                        }
                    } catch (IOException unused) {
                        LogUtil.d("SmartWatchPhysicalService", "assetFile IOException");
                    }
                }
            } catch (IllegalArgumentException unused2) {
                LogUtil.d("SmartWatchPhysicalService", "checkAsset IllegalArgumentException");
            }
        }
    }

    public byte[] c(Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("Asset must be non-null");
        }
        InputStream inputStream = ((DataApi.GetFdForAssetResult) Wearable.DataApi.getFdForAsset(this.i, asset).await(5L, TimeUnit.SECONDS)).getInputStream();
        if (inputStream == null) {
            LogUtil.e("SmartWatchPhysicalService", "transToByteArrayFromAsset,Requested an unknown Asset.");
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = null;
        try {
            int iAvailable = inputStream.available();
            LogUtil.b("SmartWatchPhysicalService", "transToByteArrayFromAsset() length = ", Integer.valueOf(iAvailable));
            if (iAvailable == 0) {
                try {
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            }
            byte[] bArr = new byte[iAvailable];
            for (int i = inputStream.read(bArr, 0, iAvailable); i != -1; i = inputStream.read(bArr, 0, iAvailable)) {
                byteArrayOutputStream.write(bArr, 0, i);
            }
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused2) {
            LogUtil.d("SmartWatchPhysicalService", "output stream write error");
        } finally {
            try {
                inputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
                LogUtil.d("SmartWatchPhysicalService", "transToByteArrayFromAsset ,Stream close err");
            }
        }
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[SYNTHETIC] */
    private void d(byte[] bArr, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        File file = new File(str);
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        BufferedOutputStream bufferedOutputStream4 = null;
        fileOutputStream = null;
        try {
            if (!file.getParentFile().exists()) {
                LogUtil.b("SmartWatchPhysicalService", "createFileWithByte file_mkdir is = ", Boolean.valueOf(file.getParentFile().mkdirs()), " createFileWithByte getParentFile is dir", Boolean.valueOf(file.getParentFile().isDirectory()));
            }
            if (!file.exists()) {
                LogUtil.b("SmartWatchPhysicalService", "createFileWithByte file_create is = ", Boolean.valueOf(file.createNewFile()));
            }
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
            try {
                BufferedOutputStream bufferedOutputStream5 = new BufferedOutputStream(fileOutputStreamOpenOutputStream);
                try {
                    bufferedOutputStream5.write(bArr);
                    bufferedOutputStream5.flush();
                    BtDeviceResponseCallback btDeviceResponseCallback = this.e;
                    if (btDeviceResponseCallback != null) {
                        btDeviceResponseCallback.onResponse(100, str);
                    }
                    if (fileOutputStreamOpenOutputStream != null) {
                        try {
                            fileOutputStreamOpenOutputStream.close();
                        } catch (IOException unused) {
                            LogUtil.d("SmartWatchPhysicalService", "createFileWithByte error outputStream close , IOException");
                        }
                    }
                    try {
                        bufferedOutputStream5.close();
                    } catch (IOException unused2) {
                        LogUtil.d("SmartWatchPhysicalService", "createFileWithByte error bufferedOutputStream close , IOException");
                    }
                } catch (IOException unused3) {
                    bufferedOutputStream3 = bufferedOutputStream5;
                    bufferedOutputStream2 = bufferedOutputStream3;
                    fileOutputStream = fileOutputStreamOpenOutputStream;
                    try {
                        LogUtil.d("SmartWatchPhysicalService", "createFileWithByte error , IOException");
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused4) {
                                LogUtil.d("SmartWatchPhysicalService", "createFileWithByte error outputStream close , IOException");
                            }
                        }
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException unused5) {
                                LogUtil.d("SmartWatchPhysicalService", "createFileWithByte error bufferedOutputStream close , IOException");
                            }
                        }
                    } catch (Throwable th) {
                        bufferedOutputStream = bufferedOutputStream2;
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                                LogUtil.d("SmartWatchPhysicalService", "createFileWithByte error outputStream close , IOException");
                            }
                        }
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                                throw th;
                            } catch (IOException unused7) {
                                LogUtil.d("SmartWatchPhysicalService", "createFileWithByte error bufferedOutputStream close , IOException");
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream4 = bufferedOutputStream5;
                    bufferedOutputStream = bufferedOutputStream4;
                    fileOutputStream = fileOutputStreamOpenOutputStream;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException unused8) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused9) {
            bufferedOutputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    private void e(Node node, int i, int i2) {
        DeviceInfo deviceInfo;
        synchronized (d) {
            if (i == this.f1739a) {
                LogUtil.b("SmartWatchPhysicalService", "connectState no change");
                return;
            }
            this.f1739a = i;
            if (node != null && !TextUtils.isEmpty(b(node))) {
                this.l = node.getId();
            }
            DeviceStatusChangeCallback deviceStatusChangeCallback = this.m;
            if (deviceStatusChangeCallback == null || (deviceInfo = this.h) == null) {
                return;
            }
            deviceStatusChangeCallback.onConnectStatusChanged(deviceInfo, i, i2);
        }
    }

    private void d(byte[] bArr, int i) {
        cmm cmmVar = new cmm();
        cmmVar.a(bArr);
        MessageReceiveCallback messageReceiveCallback = this.n;
        if (messageReceiveCallback != null) {
            messageReceiveCallback.onDataReceived(this.h, cmmVar, i);
        }
    }

    public void f() {
        PackageInfo packageInfo;
        try {
            packageInfo = BaseApplication.b().getPackageManager().getPackageInfo("com.huawei.bone", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.b("SmartWatchPhysicalService", "NameNotFoundException e= ", "PackageManager.NameNotFoundException");
            packageInfo = null;
        }
        if (packageInfo == null) {
            LogUtil.b("SmartWatchPhysicalService", "packageInfo is null");
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        ResolveInfo next = BaseApplication.b().getPackageManager().queryIntentActivities(intent, 0).iterator().next();
        if (next != null) {
            String str = next.activityInfo.packageName;
            String str2 = next.activityInfo.name;
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.addFlags(268435456);
            intent2.setComponent(new ComponentName(str, str2));
            try {
                BaseApplication.b().startActivity(intent2);
                LogUtil.b("SmartWatchPhysicalService", "startAPP ,startActivity intent = ", intent2);
            } catch (ActivityNotFoundException unused2) {
                LogUtil.d("startJumpActivity not find JumpActivity", new Object[0]);
            }
        }
    }

    public void b(MessageReceiveCallback messageReceiveCallback) {
        this.n = messageReceiveCallback;
    }

    public void d(DeviceStatusChangeCallback deviceStatusChangeCallback) {
        this.m = deviceStatusChangeCallback;
    }

    public void a(DeviceInfo deviceInfo) {
        this.h = deviceInfo;
    }

    public String c() {
        return this.l;
    }

    public GoogleApiClient d() {
        return this.i;
    }

    public Collection<Node> e() {
        ExecutionException e;
        List<Node> list;
        InterruptedException e2;
        List list2 = null;
        try {
            list = (List) Tasks.await(Wearable.getNodeClient(BaseApplication.b(), this.t).getConnectedNodes(), 1000L, TimeUnit.MILLISECONDS);
            try {
                for (Node node : list) {
                    LogUtil.b("SmartWatchPhysicalService", "getNodes() already found watch：", node.getDisplayName(), ",ID = ", node.getId());
                }
                return list;
            } catch (InterruptedException e3) {
                e2 = e3;
                LogUtil.d("SmartWatchPhysicalService", "get nodes ExecutionException, ", ExceptionUtils.c(e2));
                return list;
            } catch (ExecutionException e4) {
                e = e4;
                LogUtil.d("SmartWatchPhysicalService", "get nodes ExecutionException, ", ExceptionUtils.c(e));
                return list;
            } catch (TimeoutException e5) {
                e = e5;
                list2 = list;
                LogUtil.d("SmartWatchPhysicalService", "get nodes TimeoutException, ", ExceptionUtils.c(e));
                return list2;
            }
        } catch (InterruptedException e6) {
            e2 = e6;
            list = null;
        } catch (ExecutionException e7) {
            e = e7;
            list = null;
        } catch (TimeoutException e8) {
            e = e8;
        }
    }

    public String b(Node node) {
        if (node == null) {
            LogUtil.d("SmartWatchPhysicalService", "getLeoNodeId node is null");
            return "";
        }
        if (node.getDisplayName().startsWith("Blacktip") || node.getDisplayName().startsWith("CSN-Temp")) {
            return "";
        }
        return node.getId();
    }

    public boolean d(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str)) {
            this.l = str;
        }
        cpl.d("SmartWatchPhysicalService", bArr, "sendBTDeviceData SDK-->Device : ");
        int i = this.k;
        String str2 = "/mobile_response_data";
        if (i > 0) {
            int i2 = this.j;
            if (i2 > 0 && i2 < i + 1) {
                str2 = "/mobile_response_data" + this.j;
            } else {
                this.j = 0;
            }
            LogUtil.b("SmartWatchPhysicalService", "mCurrentChannel = ", Integer.valueOf(this.j));
            this.j++;
        }
        LogUtil.b("SmartWatchPhysicalService", "sendBTDeviceData, path = ", str2, ", dataKey = ", "mobile_response_data");
        PutDataMapRequest putDataMapRequestCreate = PutDataMapRequest.create(str2);
        putDataMapRequestCreate.getDataMap().putByteArray("mobile_response_data", bArr);
        putDataMapRequestCreate.getDataMap().putLong("current_time", System.currentTimeMillis());
        if (!TextUtils.isEmpty(this.l)) {
            putDataMapRequestCreate.getDataMap().putString("NODE", this.l);
            LogUtil.b("SmartWatchPhysicalService", " NODE = ", this.l);
        } else {
            LogUtil.e("SmartWatchPhysicalService", "sendBTDeviceData NODE = null");
        }
        if (!e(this.o.sendMessage(this.l, str2, bArr))) {
            d(putDataMapRequestCreate);
        }
        return true;
    }

    public void e(String str, String str2) {
        LogUtil.b("SmartWatchPhysicalService", "sendBTDeviceAssetData,path = ", "/mobile_response_asset", " ; key : ", "mobile_response_asset", " assetPath = ", str2);
        byte[] bArrC = cpb.c(str2);
        PutDataMapRequest putDataMapRequestCreate = PutDataMapRequest.create("/mobile_response_asset");
        putDataMapRequestCreate.getDataMap().putAsset("mobile_response_asset", c(bArrC));
        putDataMapRequestCreate.getDataMap().putString("mobile_response_asset_name", str2);
        putDataMapRequestCreate.getDataMap().putLong("current_time", System.currentTimeMillis());
        if (str != null) {
            putDataMapRequestCreate.getDataMap().putString("NODE", str);
            LogUtil.b("SmartWatchPhysicalService", "NODE = ", str);
        } else {
            LogUtil.d("SmartWatchPhysicalService", "sendBTFilePath NODE = null");
        }
        d(putDataMapRequestCreate);
        LogUtil.b("SmartWatchPhysicalService", "SDK-->Device : Asset : ", putDataMapRequestCreate);
    }

    public void b(BtDeviceResponseCallback btDeviceResponseCallback) {
        this.f1740c = btDeviceResponseCallback;
    }

    public void c(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b("SmartWatchPhysicalService", " etFileCallback :", btDeviceResponseCallback);
        this.e = btDeviceResponseCallback;
    }

    public void c(int i) {
        LogUtil.b("SmartWatchPhysicalService", "Enter setPathExtendNum with pathExtendNum = ", Integer.valueOf(i));
        this.k = i;
    }

    private boolean e(Task<Integer> task) {
        try {
            Integer num = (Integer) Tasks.await(task, 1000L, TimeUnit.MILLISECONDS);
            num.intValue();
            LogUtil.b("SmartWatchPhysicalService", "send isSuccess successful isSuccess ID is ", num);
            return true;
        } catch (InterruptedException e) {
            LogUtil.d("SmartWatchPhysicalService", "sendMessage ExecutionException, ", ExceptionUtils.c(e));
            return false;
        } catch (ExecutionException e2) {
            LogUtil.d("SmartWatchPhysicalService", "sendMessage ExecutionException, ", ExceptionUtils.c(e2));
            return false;
        } catch (TimeoutException e3) {
            LogUtil.d("SmartWatchPhysicalService", "sendMessage TimeoutException, ", ExceptionUtils.c(e3));
            return false;
        }
    }

    private void d(PutDataMapRequest putDataMapRequest) {
        PutDataRequest putDataRequestAsPutDataRequest = putDataMapRequest.asPutDataRequest();
        LogUtil.b("SmartWatchPhysicalService", "Generating DataItem: ", putDataRequestAsPutDataRequest, " isConnected : ", Boolean.valueOf(this.i.isConnected()));
        if (!this.i.isConnected()) {
            this.i.reconnect();
        } else {
            putDataRequestAsPutDataRequest.setUrgent();
            Wearable.DataApi.putDataItem(this.i, putDataRequestAsPutDataRequest).setResultCallback(new ResultCallback<DataApi.DataItemResult>() { // from class: clo.2
                @Override // com.google.android.gms.common.api.ResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onResult(DataApi.DataItemResult dataItemResult) {
                    LogUtil.b("SmartWatchPhysicalService", "syncDataItem() Sending image was successful: ", Boolean.valueOf(dataItemResult.getStatus().isSuccess()));
                }
            });
        }
    }

    private static Asset c(byte[] bArr) {
        return Asset.createFromBytes(bArr);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        LogUtil.b("SmartWatchPhysicalService", "onConnected");
        Collection<Node> collectionE = e();
        if (collectionE != null) {
            Iterator<Node> it = collectionE.iterator();
            while (it.hasNext()) {
                e(it.next(), 2, 100000);
            }
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        LogUtil.b("SmartWatchPhysicalService", " onConnectionSuspended index=", Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        if (connectionResult == null || this.m == null) {
            return;
        }
        int errorCode = connectionResult.getErrorCode();
        LogUtil.b("SmartWatchPhysicalService", "onConnectionFailed errorCode :", Integer.valueOf(errorCode), "errorMessage :", connectionResult.getErrorMessage());
        this.m.onConnectStatusChanged(this.h, 3, cpi.c(3, connectionResult.getErrorCode()));
    }
}
