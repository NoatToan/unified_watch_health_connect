package com.huawei.devicesdk.connect.physical.smartwatch;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.WearableListenerService;
import com.huawei.haf.application.BaseApplication;
import defpackage.clo;
import defpackage.xgx;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SmartWatchHostPhysicalService extends WearableListenerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private clo f5436a = null;

    @Override // com.google.android.gms.wearable.WearableListenerService, android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.b("SmartWatchHostPhysicalService", " onCreate");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        LogUtil.b("SmartWatchHostPhysicalService", "onStart");
        if (!xgx.d().getAuthorizationStatus(BaseApplication.b())) {
            LogUtil.b("SmartWatchHostPhysicalService", "aw start connect, but not authorize, so return");
            return;
        }
        clo cloVarA = clo.a();
        this.f5436a = cloVarA;
        cloVarA.b();
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.b("SmartWatchHostPhysicalService", " onDestroy");
    }

    @Override // com.google.android.gms.wearable.WearableListenerService
    public void onConnectedNodes(List<Node> list) {
        super.onConnectedNodes(list);
        LogUtil.b("SmartWatchHostPhysicalService", "onConnectedNodes:" + list.size());
    }

    @Override // com.google.android.gms.wearable.WearableListenerService
    public void onPeerConnected(Node node) {
        super.onPeerConnected(node);
        LogUtil.b("SmartWatchHostPhysicalService", "onPeerConnected:" + node);
        clo cloVar = this.f5436a;
        if (cloVar != null) {
            cloVar.a(node);
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService
    public void onPeerDisconnected(Node node) {
        super.onPeerDisconnected(node);
        LogUtil.b("SmartWatchHostPhysicalService", "onPeerDisconnected:" + node);
        clo cloVar = this.f5436a;
        if (cloVar != null) {
            cloVar.d(node);
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, com.google.android.gms.wearable.DataApi.DataListener
    public void onDataChanged(DataEventBuffer dataEventBuffer) throws Throwable {
        LogUtil.b("SmartWatchHostPhysicalService", "onDataChanged:" + dataEventBuffer);
        clo cloVar = this.f5436a;
        if (cloVar != null) {
            cloVar.b(dataEventBuffer);
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
        LogUtil.b("SmartWatchHostPhysicalService", "onCapabilityChanged:" + capabilityInfo);
        clo cloVar = this.f5436a;
        if (cloVar != null) {
            cloVar.e(capabilityInfo);
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, com.google.android.gms.wearable.MessageApi.MessageListener
    public void onMessageReceived(MessageEvent messageEvent) {
        LogUtil.b("SmartWatchHostPhysicalService", "onMessageReceived: " + messageEvent);
        clo cloVar = this.f5436a;
        if (cloVar != null) {
            cloVar.a(messageEvent);
        }
    }

    public static void b(Context context) {
        if (context != null) {
            LogUtil.b("SmartWatchHostPhysicalService", "start service");
            try {
                context.startService(new Intent(context, (Class<?>) SmartWatchHostPhysicalService.class));
            } catch (IllegalStateException unused) {
                LogUtil.d("SmartWatchHostPhysicalService", " start error IllegalStateException");
            }
        }
    }
}
