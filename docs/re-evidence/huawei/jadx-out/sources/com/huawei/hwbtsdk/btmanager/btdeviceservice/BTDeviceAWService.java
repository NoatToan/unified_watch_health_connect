package com.huawei.hwbtsdk.btmanager.btdeviceservice;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
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
import com.google.android.gms.wearable.CapabilityApi;
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
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btdatatype.callback.SmartWatchCallback;
import defpackage.cpb;
import defpackage.cpl;
import defpackage.lnn;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class BTDeviceAWService implements DataApi.DataListener, MessageClient.OnMessageReceivedListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, CapabilityApi.CapabilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static BTDeviceAWService f17013a;
    private static Map<String, SmartWatchCallback> e = new HashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f17015c;
    private OnGetMessageTask f;
    private GoogleApiClient h;
    private HandlerThread i;
    private Handler j;
    private MessageClient k;
    private WearableSwitchAdapter.ISmartWatchFoundCallback l;
    private Wearable.WearableOptions m;
    private SmartWatchCallback n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BtDeviceResponseCallback f17014b = null;
    private BtDeviceResponseCallback d = null;
    private int o = 0;
    private int g = 0;

    private String b(String str) {
        return str;
    }

    private BTDeviceAWService(Context context) {
        this.f17015c = null;
        HandlerThread handlerThread = new HandlerThread("BTDeviceAWServiceData");
        this.i = handlerThread;
        this.j = null;
        this.f17015c = context;
        handlerThread.start();
        this.j = new Handler(this.i.getLooper());
        Wearable.WearableOptions wearableOptionsBuild = new Wearable.WearableOptions.Builder().setLooper(this.i.getLooper()).build();
        this.m = wearableOptionsBuild;
        this.k = Wearable.getMessageClient(this.f17015c, wearableOptionsBuild);
    }

    public static BTDeviceAWService c(Context context) {
        BTDeviceAWService bTDeviceAWService;
        synchronized (BTDeviceAWService.class) {
            if (f17013a == null) {
                f17013a = new BTDeviceAWService(context);
            }
            bTDeviceAWService = f17013a;
        }
        return bTDeviceAWService;
    }

    public Map<String, SmartWatchCallback> b() {
        return e;
    }

    public void e(SmartWatchCallback smartWatchCallback) {
        this.n = smartWatchCallback;
    }

    public void a(Context context) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "Enter gmsConnect.");
        GoogleApiClient googleApiClient = this.h;
        if (googleApiClient != null) {
            googleApiClient.connect();
            return;
        }
        GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addApi(Wearable.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).setHandler(this.j).build();
        this.h = googleApiClientBuild;
        googleApiClientBuild.connect();
    }

    public GoogleApiClient d() {
        return this.h;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        LogUtil.b("DEVMGR_SETTING", "BTDeviceAWService", "onConnected");
        for (Map.Entry<String, SmartWatchCallback> entry : b().entrySet()) {
            SmartWatchCallback value = entry.getValue();
            if (value != null) {
                value.onDeviceConnectionStateChanged(entry.getKey(), 2);
            }
        }
        c();
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
        if (this.f17015c == null) {
            return;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onCapabilityChanged:" + capabilityInfo);
        Set<Node> nodes = capabilityInfo.getNodes();
        if (nodes == null || nodes.size() == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onCapabilityChanged nodeSet is null ");
            for (Map.Entry<String, SmartWatchCallback> entry : b().entrySet()) {
                if (entry != null && entry.getKey() != null && b().get(entry.getKey()) != null) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onCapabilityChanged callback");
                    b().get(entry.getKey()).onDeviceConnectionStateChanged(entry.getKey(), 3);
                }
            }
            return;
        }
        Iterator<Map.Entry<String, SmartWatchCallback>> it = b().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            SmartWatchCallback smartWatchCallback = b().get(key);
            if (smartWatchCallback != null) {
                boolean z = false;
                for (Node node : nodes) {
                    String strD = d(node);
                    if (strD.equals(key)) {
                        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onCapabilityChanged onPeerConnected,", key);
                        smartWatchCallback.onDeviceConnectionStateChanged(strD, 2);
                        e(node, 2);
                        z = true;
                    }
                }
                if (!z) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onCapabilityChanged onPeerDisConnected,", key);
                    smartWatchCallback.onDeviceConnectionStateChanged(key, 3);
                }
            }
        }
    }

    private String d(Node node) {
        return node.getId();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        LogUtil.b("DEVMGR_SETTING", "BTDeviceAWService", " onConnectionSuspended index=", Integer.valueOf(i));
    }

    @Override // com.google.android.gms.wearable.DataApi.DataListener
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
        ArrayList arrayListFreezeIterable = FreezableUtils.freezeIterable(dataEventBuffer);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "onDataChanged, rev_path = ", "/wear_request_data", ", key = ", "wear_request_data");
        c(arrayListFreezeIterable, "wear_request_data");
    }

    private void c(List<DataEvent> list, String str) {
        for (DataEvent dataEvent : list) {
            if (dataEvent.getType() == 1) {
                String path = dataEvent.getDataItem().getUri().getPath();
                if (path == null) {
                    return;
                }
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "onDataChanged, watch path = ", path);
                if (c(str, path, DataMapItem.fromDataItem(dataEvent.getDataItem()).getDataMap())) {
                    return;
                }
            } else if (dataEvent.getType() == 2) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "onDataChanged() DataItem Deleted: " + dataEvent.getDataItem().toString());
            } else {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onDataChanged(), no Support ");
            }
        }
    }

    private boolean c(String str, String str2, DataMap dataMap) throws Throwable {
        if (str2.startsWith("/wear_request_data")) {
            return b(str, dataMap);
        }
        if ("/wear".equals(str2)) {
            if (dataMap != null) {
                d(dataMap);
                return false;
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onDataChanged(), RECEIVE_PATH dataMap is null");
            return false;
        }
        if (!"/wear_request_asset".equals(str2)) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onDataChanged(), no Support ");
            return false;
        }
        if (dataMap != null) {
            c(dataMap);
            return false;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onDataChanged(), PATH_WEAR_REQUEST_ASSET dataMap is null");
        return false;
    }

    private boolean b(String str, DataMap dataMap) {
        if (dataMap != null) {
            return c(str, dataMap);
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onDataChanged(), dataMap is null");
        return false;
    }

    private void c(DataMap dataMap) throws Throwable {
        Asset asset = dataMap.getAsset("wear_request_asset");
        if (asset == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onDataChanged(), asset is null");
            return;
        }
        try {
            byte[] bArrB = b(asset);
            cpl.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, bArrB, 0, "BTDeviceAWService", "Asset Device-->SDK:");
            BtDeviceResponseCallback btDeviceResponseCallback = this.f17014b;
            if (btDeviceResponseCallback == null) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onDataChanged(), mBTDeviceFileCallback is null");
            } else {
                btDeviceResponseCallback.onResponse(0, bArrB);
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "onDataChanged() asset handle success");
            }
            if (this.d != null) {
                String string = dataMap.getString("wear_request_asset_name");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        d(bArrB, this.f17015c.getFilesDir().getCanonicalPath() + File.separator + "watchfaceAsset" + File.separator + string);
                        return;
                    } catch (IOException unused) {
                        LogUtil.d("BTDeviceAWService", "assetFile IOException");
                        return;
                    }
                }
                LogUtil.b("BTDeviceAWService", "can not report assetFile, name is null");
            }
        } catch (IllegalArgumentException unused2) {
            LogUtil.d("BTDeviceAWService", "checkAsset IllegalArgumentException");
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[SYNTHETIC] */
    private void d(byte[] bArr, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        fileOutputStream = null;
        try {
            if (!file.getParentFile().exists()) {
                LogUtil.b("BTDeviceAWService", "createFileWithByte file_mkdir is = ", Boolean.valueOf(file.getParentFile().mkdirs()), " createFileWithByte getParentFile is dir", Boolean.valueOf(file.getParentFile().isDirectory()));
            }
            if (!file.exists()) {
                LogUtil.b("BTDeviceAWService", "createFileWithByte file_create is = ", Boolean.valueOf(file.createNewFile()));
            }
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
            try {
                BufferedOutputStream bufferedOutputStream4 = new BufferedOutputStream(fileOutputStreamOpenOutputStream);
                try {
                    bufferedOutputStream4.write(bArr);
                    bufferedOutputStream4.flush();
                    try {
                        BtDeviceResponseCallback btDeviceResponseCallback = this.d;
                        if (btDeviceResponseCallback != null) {
                            btDeviceResponseCallback.onResponse(100, str);
                        }
                        if (fileOutputStreamOpenOutputStream != null) {
                            try {
                                fileOutputStreamOpenOutputStream.close();
                            } catch (IOException unused) {
                                LogUtil.d("BTDeviceAWService", "createFileWithByte error outputStream close ,", "IOException");
                            }
                        }
                        try {
                            bufferedOutputStream4.close();
                        } catch (IOException unused2) {
                            LogUtil.d("BTDeviceAWService", "createFileWithByte error bufferedOutputStream close ,", "IOException");
                        }
                    } catch (IOException unused3) {
                        bufferedOutputStream2 = bufferedOutputStream4;
                        BufferedOutputStream bufferedOutputStream5 = bufferedOutputStream2;
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                        bufferedOutputStream = bufferedOutputStream5;
                        try {
                            LogUtil.d("BTDeviceAWService", "createFileWithByte error ,", "IOException");
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused4) {
                                    LogUtil.d("BTDeviceAWService", "createFileWithByte error outputStream close ,", "IOException");
                                }
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused5) {
                                    LogUtil.d("BTDeviceAWService", "createFileWithByte error bufferedOutputStream close ,", "IOException");
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused6) {
                                    LogUtil.d("BTDeviceAWService", "createFileWithByte error outputStream close ,", "IOException");
                                }
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                    throw th;
                                } catch (IOException unused7) {
                                    LogUtil.d("BTDeviceAWService", "createFileWithByte error bufferedOutputStream close ,", "IOException");
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream3 = bufferedOutputStream4;
                        BufferedOutputStream bufferedOutputStream6 = bufferedOutputStream3;
                        fileOutputStream = fileOutputStreamOpenOutputStream;
                        bufferedOutputStream = bufferedOutputStream6;
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
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException unused10) {
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
        }
    }

    private void d(DataMap dataMap) {
        byte[] byteArray = dataMap.getByteArray("byte");
        if (byteArray != null) {
            cpl.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, byteArray, 0, "BTDeviceAWService", "Device-->SDK:");
        } else {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "checkByteTwo onDataChanged(), bytes is null");
        }
        for (Map.Entry<String, SmartWatchCallback> entry : b().entrySet()) {
            SmartWatchCallback value = entry.getValue();
            if (value != null && byteArray != null) {
                value.onDataReceived(entry.getKey(), byteArray.length, byteArray);
            }
        }
    }

    private boolean c(String str, DataMap dataMap) {
        byte[] byteArray = dataMap.getByteArray(str);
        if (byteArray != null) {
            cpl.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, byteArray, 0, "BTDeviceAWService", "Device-->SDK:");
        } else {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "checkByteOne onDataChanged(), bytes is null");
        }
        for (Map.Entry<String, SmartWatchCallback> entry : b().entrySet()) {
            SmartWatchCallback value = entry.getValue();
            if (value != null && byteArray != null) {
                value.onDataReceived(entry.getKey(), byteArray.length, byteArray);
            }
        }
        return false;
    }

    public void c(PutDataMapRequest putDataMapRequest) {
        PutDataRequest putDataRequestAsPutDataRequest = putDataMapRequest.asPutDataRequest();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "Generating DataItem: ", putDataRequestAsPutDataRequest, " isConnected : ", Boolean.valueOf(this.h.isConnected()));
        if (!this.h.isConnected()) {
            this.h.reconnect();
        } else {
            putDataRequestAsPutDataRequest.setUrgent();
            Wearable.DataApi.putDataItem(this.h, putDataRequestAsPutDataRequest).setResultCallback(new ResultCallback<DataApi.DataItemResult>() { // from class: com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceAWService.2
                @Override // com.google.android.gms.common.api.ResultCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onResult(DataApi.DataItemResult dataItemResult) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "syncDataItem() Sending image was successful:" + dataItemResult.getStatus().isSuccess());
                }
            });
        }
    }

    public boolean b(String str, byte[] bArr) {
        cpl.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, bArr, 0, "BTDeviceAWService", "sendBTDeviceData SDK-->Device : ");
        int i = this.o;
        String str2 = "/mobile_response_data";
        if (i > 0) {
            int i2 = this.g;
            if (i2 > 0 && i2 < i + 1) {
                str2 = "/mobile_response_data" + Integer.toString(this.g);
            } else {
                this.g = 0;
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "mCurrentChannel = ", Integer.valueOf(this.g));
            this.g++;
        }
        String str3 = str2;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "sendBTDeviceData,path = ", str3, ", key = ", "mobile_response_data");
        PutDataMapRequest putDataMapRequestCreate = PutDataMapRequest.create(str3);
        if (bArr != null && bArr.length > 0) {
            ReleaseLogUtil.c("R_BTDeviceAWService", "wearOs send data is not empty.");
        }
        putDataMapRequestCreate.getDataMap().putByteArray("mobile_response_data", bArr);
        putDataMapRequestCreate.getDataMap().putLong("current_time", System.currentTimeMillis());
        if (str != null) {
            putDataMapRequestCreate.getDataMap().putString("NODE", str);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", " NODE = ", str);
        } else {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "sendBTDeviceData NODE = null");
        }
        if (!e(this.k.sendMessage(str, str3, bArr))) {
            c(putDataMapRequestCreate);
        }
        return true;
    }

    private boolean e(Task<Integer> task) {
        try {
            Integer num = (Integer) Tasks.await(task, 1000L, TimeUnit.MILLISECONDS);
            num.intValue();
            LogUtil.b("BTDeviceAWService", "send isSuccess successful isSuccess ID is ", num);
            return true;
        } catch (InterruptedException e2) {
            LogUtil.d("BTDeviceAWService", "sendMessage ExecutionException, ", e2.getMessage());
            return false;
        } catch (ExecutionException e3) {
            LogUtil.d("BTDeviceAWService", "sendMessage ExecutionException, ", e3.getMessage());
            return false;
        } catch (TimeoutException e4) {
            LogUtil.d("BTDeviceAWService", "sendMessage TimeoutException, ", e4.getMessage());
            return false;
        } catch (Exception unused) {
            LogUtil.d("BTDeviceAWService", "sendMessage gms Exception");
            return false;
        }
    }

    private void c() {
        Collection<Node> collectionA = a();
        ArrayList arrayList = new ArrayList(16);
        if (collectionA != null) {
            for (Node node : collectionA) {
                arrayList.add(node);
                e(node, 2);
            }
        }
        WearableSwitchAdapter.ISmartWatchFoundCallback iSmartWatchFoundCallback = this.l;
        if (iSmartWatchFoundCallback != null) {
            iSmartWatchFoundCallback.onResponse(arrayList);
        }
    }

    private void e(Node node, int i) {
        if (this.n == null || TextUtils.isEmpty(e(node))) {
            return;
        }
        this.n.onDeviceConnectionStateChanged(node.getId(), i);
    }

    public String e(Node node) {
        return (node.getDisplayName().startsWith("Blacktip") || node.getDisplayName().startsWith("CSN-Temp")) ? "" : node.getId();
    }

    public Collection<Node> a() {
        ExecutionException e2;
        List<Node> list;
        InterruptedException e3;
        List list2 = null;
        try {
            list = (List) Tasks.await(Wearable.getNodeClient(BaseApplication.b(), this.m).getConnectedNodes(), 1000L, TimeUnit.MILLISECONDS);
            try {
                for (Node node : list) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "getNodes() already found watch：", node.getDisplayName(), ",ID = ", node.getId());
                }
                return list;
            } catch (InterruptedException e4) {
                e3 = e4;
                LogUtil.d("BTDeviceAWService", "get nodes ExecutionException, ", e3.getMessage());
                return list;
            } catch (ExecutionException e5) {
                e2 = e5;
                LogUtil.d("BTDeviceAWService", "get nodes ExecutionException, ", e2.getMessage());
                return list;
            } catch (TimeoutException e6) {
                e = e6;
                list2 = list;
                LogUtil.d("BTDeviceAWService", "get nodes TimeoutException, ", e.getMessage());
                return list2;
            }
        } catch (InterruptedException e7) {
            e3 = e7;
            list = null;
        } catch (ExecutionException e8) {
            e2 = e8;
            list = null;
        } catch (TimeoutException e9) {
            e = e9;
        }
    }

    @Override // com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener, com.google.android.gms.wearable.MessageApi.MessageListener
    public void onMessageReceived(MessageEvent messageEvent) {
        if (messageEvent == null || messageEvent.getPath() == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onMessageReceived messageEvent or path is null");
            return;
        }
        String sourceNodeId = messageEvent.getSourceNodeId();
        int requestId = messageEvent.getRequestId();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "Enter onMessageReceived() RequestId = ", Integer.valueOf(requestId), "Path = ", messageEvent.getPath(), ";nodeId:", sourceNodeId);
        String path = messageEvent.getPath();
        OnGetMessageTask onGetMessageTask = this.f;
        if (onGetMessageTask != null) {
            onGetMessageTask.execute(path);
        }
        if ("/wear_request_message".equalsIgnoreCase(path)) {
            byte[] data = messageEvent.getData();
            cpl.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, data, 0, "BTDeviceAWService", "onMessageReceived message bytes = ");
            if (data.length > 6 && data[4] == 1 && data[5] == 21) {
                e();
            }
        }
        if (path.startsWith("/wear_request_data")) {
            byte[] data2 = messageEvent.getData();
            if (data2 != null) {
                cpl.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, data2, 0, "BTDeviceAWService", "MessageAPI Device-->SDK: ");
                SmartWatchCallback smartWatchCallback = b().get(b(sourceNodeId));
                if (smartWatchCallback != null) {
                    smartWatchCallback.onDataReceived(b(sourceNodeId), data2.length, data2);
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onMessageReceived() handle success");
                    return;
                } else {
                    LogUtil.e("0xA0200009", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onMessageReceived(), mBTDeviceStateCallback is null");
                    return;
                }
            }
            LogUtil.e("0xA0200009", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "onMessageReceived(), bytes is null");
        }
    }

    public void e() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f17015c.getPackageManager().getPackageInfo("com.huawei.bone", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "NameNotFoundException e= ", "PackageManager.NameNotFoundException");
            packageInfo = null;
        }
        if (packageInfo == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "packageInfo is null");
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        List<ResolveInfo> listQueryIntentActivities = this.f17015c.getPackageManager().queryIntentActivities(intent, 0);
        if (CollectionUtils.a(listQueryIntentActivities)) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "resolveInfoList is null");
            return;
        }
        ResolveInfo next = listQueryIntentActivities.iterator().next();
        if (next != null) {
            String str = next.activityInfo.packageName;
            String str2 = next.activityInfo.name;
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.addFlags(268435456);
            intent2.setComponent(new ComponentName(str, str2));
            try {
                this.f17015c.startActivity(intent2);
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "startAPP ,startActivity intent = ", intent2);
            } catch (ActivityNotFoundException unused2) {
                LogUtil.d("startJumpActivity not find JumpActivity", new Object[0]);
            }
        }
    }

    public static abstract class OnGetMessageTask extends AsyncTask<String, Void, String> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public abstract void onPostExecute(String str);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strArr) {
            return strArr[0];
        }
    }

    public void c(Node node) {
        LogUtil.b("DEVMGR_SETTING", "BTDeviceAWService", "onPeerConnected, connected watch: ", node.getDisplayName(), ",ID = ", node.getId());
        String strD = d(node);
        SmartWatchCallback smartWatchCallback = b().get(strD);
        if (smartWatchCallback != null) {
            smartWatchCallback.onDeviceConnectionStateChanged(strD, 2);
        }
        e(node, 2);
        if (this.h.isConnected()) {
            return;
        }
        this.h.reconnect();
    }

    public void b(Node node) {
        LogUtil.b("DEVMGR_SETTING", "BTDeviceAWService", "aw device disconnected with displayName = ", node.getDisplayName(), " id = ", node.getId());
        String strD = d(node);
        SmartWatchCallback smartWatchCallback = b().get(strD);
        if (smartWatchCallback != null) {
            LogUtil.b("DEVMGR_SETTING", "BTDeviceAWService", " onPeerDisconnected lost");
            lnn.a(1003001);
            smartWatchCallback.onDeviceConnectionStateChanged(strD, 3);
        }
        e(node, 3);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        if (connectionResult != null) {
            LogUtil.b("DEVMGR_SETTING", "BTDeviceAWService", "onConnectionFailed errorCode :", Integer.valueOf(connectionResult.getErrorCode()));
            lnn.a(connectionResult.getErrorCode() + 1000000);
        }
        for (Map.Entry<String, SmartWatchCallback> entry : b().entrySet()) {
            SmartWatchCallback value = entry.getValue();
            if (value != null) {
                value.onDeviceConnectionStateChanged(entry.getKey(), 3);
            }
        }
    }

    public void d(String str, String str2) throws Throwable {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "sendBTDeviceAssetData,path = ", "/mobile_response_asset", " ; key : ", "mobile_response_asset", " assetPath = ", str2);
        byte[] bArrC = cpb.c(str2);
        PutDataMapRequest putDataMapRequestCreate = PutDataMapRequest.create("/mobile_response_asset");
        putDataMapRequestCreate.getDataMap().putAsset("mobile_response_asset", d(bArrC));
        putDataMapRequestCreate.getDataMap().putString("mobile_response_asset_name", str2);
        putDataMapRequestCreate.getDataMap().putLong("current_time", System.currentTimeMillis());
        if (str != null) {
            putDataMapRequestCreate.getDataMap().putString("NODE", str);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "NODE = ", str);
        } else {
            LogUtil.e("0xA0200009", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "sendBTFilePath NODE = null");
        }
        c(putDataMapRequestCreate);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceAWService", "SDK-->Device : Asset : ", putDataMapRequestCreate);
    }

    private static Asset d(byte[] bArr) {
        return Asset.createFromBytes(bArr);
    }

    public void c(BtDeviceResponseCallback btDeviceResponseCallback) {
        this.f17014b = btDeviceResponseCallback;
    }

    public void b(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b("BTDeviceAWService", " etFileCallback :", btDeviceResponseCallback);
        this.d = btDeviceResponseCallback;
    }

    public byte[] b(Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("Asset must be non-null");
        }
        InputStream inputStream = ((DataApi.GetFdForAssetResult) Wearable.DataApi.getFdForAsset(this.h, asset).await(5L, TimeUnit.SECONDS)).getInputStream();
        if (inputStream == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "transToByteArrayFromAsset,Requested an unknown Asset.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                int iAvailable = inputStream.available();
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "transToByteArrayFromAsset() length = ", Integer.valueOf(iAvailable));
                if (iAvailable == 0) {
                    try {
                        return null;
                    } catch (IOException unused) {
                        return null;
                    }
                }
                byte[] bArr = new byte[iAvailable];
                while (true) {
                    int i = inputStream.read(bArr, 0, iAvailable);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            return byteArray;
                        } catch (IOException unused2) {
                            return byteArray;
                        }
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (IOException unused3) {
                LogUtil.d("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "output stream write error");
                return null;
            } finally {
                inputStream.close();
                byteArrayOutputStream.close();
            }
            inputStream.close();
            byteArrayOutputStream.close();
        } catch (IOException unused4) {
            LogUtil.d("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "transToByteArrayFromAsset ,Stream close err");
        }
    }

    public void a(int i) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceAWService", "Enter setPathExtendNum with pathExtendNum = ", Integer.valueOf(i));
        this.o = i;
    }
}
