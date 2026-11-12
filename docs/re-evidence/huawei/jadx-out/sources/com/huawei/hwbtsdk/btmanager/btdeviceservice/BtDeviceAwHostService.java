package com.huawei.hwbtsdk.btmanager.btdeviceservice;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.WearableListenerService;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.xgx;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BtDeviceAwHostService extends WearableListenerService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BTDeviceAWService f17016c = null;

    @Override // com.google.android.gms.wearable.WearableListenerService, android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "BTDeviceAWHostService onCreate");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "BTDeviceAWHostService onStart");
        if (!xgx.d().getAuthorizationStatus(BaseApplication.b())) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "aw start connect, but not authorize, so return");
            return;
        }
        BTDeviceAWService bTDeviceAWServiceC = BTDeviceAWService.c(this);
        this.f17016c = bTDeviceAWServiceC;
        bTDeviceAWServiceC.a(this);
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "BTDeviceAWHostService onDestroy");
    }

    @Override // com.google.android.gms.wearable.WearableListenerService
    public void onConnectedNodes(List<Node> list) {
        super.onConnectedNodes(list);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "onConnectedNodes:", Integer.valueOf(list.size()));
    }

    @Override // com.google.android.gms.wearable.WearableListenerService
    public void onPeerConnected(Node node) {
        super.onPeerConnected(node);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "onPeerConnected:", node);
        BTDeviceAWService bTDeviceAWService = this.f17016c;
        if (bTDeviceAWService != null) {
            bTDeviceAWService.c(node);
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService
    public void onPeerDisconnected(Node node) {
        super.onPeerDisconnected(node);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "onPeerDisconnected:", node);
        BTDeviceAWService bTDeviceAWService = this.f17016c;
        if (bTDeviceAWService != null) {
            bTDeviceAWService.b(node);
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, com.google.android.gms.wearable.DataApi.DataListener
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BtDeviceAwHostService", "onDataChanged:", dataEventBuffer);
        BTDeviceAWService bTDeviceAWService = this.f17016c;
        if (bTDeviceAWService != null) {
            bTDeviceAWService.onDataChanged(dataEventBuffer);
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BtDeviceAwHostService", "onCapabilityChanged:", capabilityInfo);
        BTDeviceAWService bTDeviceAWService = this.f17016c;
        if (bTDeviceAWService != null) {
            bTDeviceAWService.onCapabilityChanged(capabilityInfo);
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, com.google.android.gms.wearable.MessageApi.MessageListener
    public void onMessageReceived(MessageEvent messageEvent) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BtDeviceAwHostService", "onMessageReceived: ", messageEvent);
        BTDeviceAWService bTDeviceAWService = this.f17016c;
        if (bTDeviceAWService != null) {
            bTDeviceAWService.onMessageReceived(messageEvent);
        }
    }

    public static void d(Context context) {
        if (context != null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "BTDeviceAWHostService start");
            try {
                context.startService(new Intent(context, (Class<?>) BtDeviceAwHostService.class));
            } catch (Exception e) {
                LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDeviceAwHostService", "BTDeviceAWHostService error", "Exception", ExceptionUtils.c(e));
            }
        }
    }
}
