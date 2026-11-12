package com.huawei.maps.offlinedata.service.device;

import android.text.TextUtils;
import com.huawei.maps.offlinedata.handler.dto.device.DeleteMapInfoRequest;
import com.huawei.maps.offlinedata.handler.dto.device.TransmitRequest;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapP2pMessage;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSampleCallback;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback;
import com.huawei.maps.offlinedata.health.sample.SampleBase;
import com.huawei.maps.offlinedata.health.sample.SampleConfig;
import com.huawei.maps.offlinedata.health.sample.SampleConfigInfo;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes12.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile d f17906c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f17907a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17908b;

    class a implements IOfflineMapSendCallback {
        a() {
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendNetworkHandShake onFileTransferReport. transferWay is " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendNetworkHandShake onSendProgress. count is " + j);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendNetworkHandShake onSendResult. errCode is " + i);
        }
    }

    class b implements IOfflineMapSendCallback {
        b() {
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapSizeToDevice onFileTransferReport. transferWay is " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapSizeToDevice onSendProgress. count is " + j);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapSizeToDevice onSendResult. errCode is " + i);
        }
    }

    class c implements IOfflineMapSampleCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f17911a;

        c(long j) {
            this.f17911a = j;
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSampleCallback
        public void onSampleResult(int i, SampleBase sampleBase) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "onSampleResult courseLinkage");
            if (sampleBase == null) {
                com.huawei.maps.offlinedata.utils.g.d("DeviceSenderService", "onSampleResult device or message is null.");
                return;
            }
            int iA = d.this.a(sampleBase);
            com.huawei.maps.offlinedata.jsbridge.a.a().a(Integer.valueOf(iA), this.f17911a);
            com.huawei.maps.offlinedata.utils.j.b("autoDownloadStatus" + com.huawei.maps.offlinedata.utils.a.c(), iA, com.huawei.maps.offlinedata.utils.a.b());
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "onSampleResult status is " + iA);
        }
    }

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.service.device.d$d, reason: collision with other inner class name */
    class C0188d implements IOfflineMapSendCallback {
        C0188d() {
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "queryDeviceAvailableStorage onFileTransferReport. transferWay is " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "queryDeviceAvailableStorage onSendProgress. count is " + j);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "queryDeviceAvailableStorage onSendResult. errCode is " + i);
        }
    }

    class e implements IOfflineMapSendCallback {
        e() {
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "syncPoliticalPerspective onFileTransferReport. transferWay is " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "syncPoliticalPerspective onSendProgress. count is " + j);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "syncPoliticalPerspective onSendResult. errCode is " + i);
        }
    }

    class f implements IOfflineMapSendCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17916b;

        f(int i, long j) {
            this.f17915a = i;
            this.f17916b = j;
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "queryDeviceDownloadedMapInfo onFileTransferReport. transferWay is " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "queryDeviceDownloadedMapInfo onSendProgress. count is " + j);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "queryDeviceDownloadedMapInfo onSendResult. errCode is " + i);
            if (i != 207) {
                if (this.f17915a >= 10000) {
                    com.huawei.maps.offlinedata.service.device.b.a().downLoadInfo(new ArrayList(), this.f17915a);
                } else {
                    com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "send failed.", this.f17916b);
                }
                com.huawei.maps.offlinedata.service.device.e.a().b(this.f17915a);
            }
        }
    }

    class g implements IOfflineMapSendCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17919b;

        g(int i, long j) {
            this.f17918a = i;
            this.f17919b = j;
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendDeleteMapIds onFileTransferReport. transferWay is " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendDeleteMapIds onSendProgress. count is " + j);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendDeleteMapIds onSendResult. errCode is " + i);
            if (i == 206) {
                com.huawei.maps.offlinedata.service.device.e.a().b(this.f17918a);
                com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "send failed.", this.f17919b);
            }
        }
    }

    class h implements IOfflineMapSendCallback {
        h() {
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapHandShake onFileTransferReport. transferWay is " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapHandShake onSendProgress. count is " + j);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapHandShake onSendResult. errCode is " + i);
        }
    }

    class i implements IOfflineMapSendCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f17922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17923b;

        i(File file, long j) {
            this.f17922a = file;
            this.f17923b = j;
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapFile onFileTransferReport. transferWay is " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapFile onSendProgress. count is " + j);
            com.huawei.maps.offlinedata.service.device.f.b().a(String.valueOf(this.f17923b), String.valueOf(j));
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "transmitMap onSendResult. errCode is " + i);
            if (i != 207) {
                com.huawei.maps.offlinedata.service.device.f.b().b(String.valueOf(this.f17923b));
                return;
            }
            File parentFile = this.f17922a.getParentFile();
            if (com.huawei.maps.offlinedata.utils.c.b(parentFile)) {
                com.huawei.maps.offlinedata.utils.c.c(parentFile);
            }
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapFile onSendResult. requestId is " + this.f17923b);
            d.this.f17907a.remove(Long.valueOf(this.f17923b));
            com.huawei.maps.offlinedata.service.device.f.b().c(String.valueOf(this.f17923b));
        }
    }

    class j extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f17925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17927c;
        final /* synthetic */ int d;
        final /* synthetic */ Timer e;

        j(long j, long j2, boolean z, int i, Timer timer) {
            this.f17925a = j;
            this.f17926b = j2;
            this.f17927c = z;
            this.d = i;
            this.e = timer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            d.this.a(this.f17925a, this.f17926b, this.f17927c, this.d + 1);
            this.e.cancel();
        }
    }

    class k implements IOfflineMapSendCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f17928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f17930c;
        final /* synthetic */ long d;

        k(boolean z, long j, File file, long j2) {
            this.f17928a = z;
            this.f17929b = j;
            this.f17930c = file;
            this.d = j2;
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onFileTransferReport(String str) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "receive transfer report " + str);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendProgress(long j) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "receive cancel progress " + j);
        }

        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback
        public void onSendResult(int i) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "receive cancel result " + i);
            d dVar = d.this;
            dVar.f17908b = true;
            if (i == 20003) {
                if (!this.f17928a) {
                    dVar.f17907a.remove(Long.valueOf(this.f17929b));
                    if (this.f17930c.exists()) {
                        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "mapFile delete ".concat(this.f17930c.delete() ? "success" : ParamConstants.CallbackMethod.ON_FAIL));
                    }
                }
                OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) com.huawei.maps.offlinedata.service.device.f.b().c().get();
                if (offlineDataTaskEntity != null && TextUtils.equals(offlineDataTaskEntity.getTaskId(), String.valueOf(this.f17929b))) {
                    com.huawei.maps.offlinedata.service.device.f.b().c().set(null);
                }
                com.huawei.maps.offlinedata.jsbridge.a.a().a(Boolean.TRUE, this.d);
            }
            if (i == 20004) {
                com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "cancel failed.", this.d);
            }
        }
    }

    class l extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f17931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17933c;
        final /* synthetic */ int d;
        final /* synthetic */ Timer e;

        l(long j, long j2, boolean z, int i, Timer timer) {
            this.f17931a = j;
            this.f17932b = j2;
            this.f17933c = z;
            this.d = i;
            this.e = timer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            d dVar = d.this;
            if (!dVar.f17908b) {
                dVar.b(this.f17931a, this.f17932b, this.f17933c, this.d + 1);
            }
            this.e.cancel();
        }
    }

    private d() {
    }

    public static d a() {
        if (f17906c == null) {
            synchronized (d.class) {
                if (f17906c == null) {
                    f17906c = new d();
                }
            }
        }
        return f17906c;
    }

    public void b() {
        OfflineMapP2pMessage.Builder builder = new OfflineMapP2pMessage.Builder();
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.consts.b.QUERY_DEVICE_REMAIN_SPACE.b());
        String strD = com.huawei.maps.offlinedata.service.device.tlvtools.a.d(0);
        String strB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(strD.length() / 2);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.d(1));
        stringBuffer.append(strB);
        stringBuffer.append(strD);
        builder.setPayload(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(stringBuffer.toString()));
        C0188d c0188d = new C0188d();
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send queryDeviceAvailableStorage.");
        a(builder.build(), com.huawei.maps.offlinedata.service.device.tlvtools.b.a(), c0188d);
    }

    public void c() {
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendNetworkHandShake");
        OfflineMapP2pMessage.Builder builder = new OfflineMapP2pMessage.Builder();
        int iA = com.huawei.maps.offlinedata.service.device.tlvtools.b.a();
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.consts.b.TRANSMIT_MAP_HANDSHAKE.b());
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(new com.huawei.maps.offlinedata.service.device.tlvtools.c().c(19, iA).d(12, 5).d(22, 1).b()));
        builder.setPayload(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(stringBuffer.toString()));
        a aVar = new a();
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send sendNetworkHandShake.");
        a(builder.build(), iA, aVar);
    }

    public void a(int i2, int i3) {
        OfflineMapP2pMessage.Builder builder = new OfflineMapP2pMessage.Builder();
        if (i2 == -1) {
            i2 = com.huawei.maps.offlinedata.service.device.tlvtools.b.a();
        }
        int i4 = i2;
        StringBuffer stringBuffer = new StringBuffer(16);
        com.huawei.maps.offlinedata.service.device.consts.b bVar = com.huawei.maps.offlinedata.service.device.consts.b.SYNC_POLITICAL_PERSPECTIVE;
        stringBuffer.append(bVar.b());
        if ((TextUtils.isEmpty(com.huawei.maps.offlinedata.service.cloud.a.c().e()) || TextUtils.isEmpty(com.huawei.maps.offlinedata.service.cloud.a.c().f())) && !com.huawei.maps.offlinedata.service.cloud.a.c().a()) {
            com.huawei.maps.offlinedata.utils.g.b("DeviceSenderService", "syncPoliticalPerspective authenticate fail.");
            return;
        }
        String strB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(com.huawei.maps.offlinedata.service.cloud.a.c().e());
        String strB2 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(strB.length() / 2);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.d(2));
        stringBuffer.append(strB2);
        stringBuffer.append(strB);
        String strF = com.huawei.maps.offlinedata.service.cloud.a.c().f();
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", strF);
        String strB3 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(strF);
        String strB4 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(strB3.length() / 2);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.d(20));
        stringBuffer.append(strB4);
        stringBuffer.append(strB3);
        String strD = com.huawei.maps.offlinedata.service.device.tlvtools.a.d(i4);
        String strB5 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(strD.length() / 2);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.d(19));
        stringBuffer.append(strB5);
        stringBuffer.append(strD);
        builder.setPayload(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(stringBuffer.toString()));
        e eVar = new e();
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send syncPoliticalPerspective.");
        a(builder.build(), bVar.c(), i4, new com.huawei.maps.offlinedata.service.device.receivers.i(i4, i3), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j2, long j3, boolean z, int i2) {
        this.f17908b = false;
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start cancel requestId: " + j2 + ", isContinueTransmit:" + z);
        String str = (String) this.f17907a.get(Long.valueOf(j2));
        k kVar = new k(z, j2, new File(str), j3);
        int iA = com.huawei.maps.offlinedata.service.device.tlvtools.b.a();
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send cancelTransmitMap, msgId is " + iA + ", requestId is " + j2);
        OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().sendCancelCommand(str, iA, kVar);
        Timer timer = new Timer();
        l lVar = new l(j2, j3, z, i2, timer);
        if (i2 < 3) {
            timer.schedule(lVar, 1000L);
            return;
        }
        com.huawei.maps.offlinedata.utils.g.b("DeviceSenderService", "send cancel command failed after retry, retryTimes is " + i2);
    }

    public void a(long j2, Integer num) {
        OfflineMapP2pMessage.Builder builder = new OfflineMapP2pMessage.Builder();
        int iA = num == null ? com.huawei.maps.offlinedata.service.device.tlvtools.b.a() : num.intValue();
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.consts.b.QUERY_DEVICE_DOWNLOADED_MAP_INFO.b());
        String strD = com.huawei.maps.offlinedata.service.device.tlvtools.a.d(iA);
        String strB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(strD.length() / 2);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.d(19));
        stringBuffer.append(strB);
        stringBuffer.append(strD);
        builder.setPayload(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(stringBuffer.toString()));
        f fVar = new f(iA, j2);
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send queryDeviceDownloadedMapInfo.");
        com.huawei.maps.offlinedata.service.device.e.a().a(iA, j2);
        a(builder.build(), iA, fVar);
    }

    public void a(List list, int i2, int i3, int i4, long j2, int i5) {
        OfflineMapP2pMessage.Builder builder = new OfflineMapP2pMessage.Builder();
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.consts.b.DELETE_DEVICE_MAP.b());
        com.huawei.maps.offlinedata.service.device.tlvtools.c cVar = new com.huawei.maps.offlinedata.service.device.tlvtools.c();
        cVar.d(4, i2).d(5, i3).c(6, i5).c(19, i4);
        cVar.a(16);
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeleteMapInfoRequest deleteMapInfoRequest = (DeleteMapInfoRequest) it.next();
                cVar.b(cVar.b(17).a(9, deleteMapInfoRequest.getCityId()).a(10, deleteMapInfoRequest.getMapType()).a(11, com.huawei.maps.offlinedata.service.device.consts.a.MAP_ERROR_DEVICE_ERROR.b()).d());
            }
        }
        cVar.a(cVar.c());
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(cVar.b()));
        builder.setPayload(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(stringBuffer.toString()));
        g gVar = new g(i4, j2);
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send sendDeleteMapIds.");
        com.huawei.maps.offlinedata.service.device.e.a().a(i4, j2);
        a(builder.build(), i4, gVar);
    }

    public void a(TransmitRequest transmitRequest) {
        String strE;
        OfflineMapP2pMessage.Builder builder = new OfflineMapP2pMessage.Builder();
        int iA = com.huawei.maps.offlinedata.service.device.tlvtools.b.a();
        StringBuffer stringBuffer = new StringBuffer(16);
        com.huawei.maps.offlinedata.service.device.consts.b bVar = com.huawei.maps.offlinedata.service.device.consts.b.TRANSMIT_MAP_HANDSHAKE;
        stringBuffer.append(bVar.b());
        com.huawei.maps.offlinedata.service.device.tlvtools.c cVar = new com.huawei.maps.offlinedata.service.device.tlvtools.c();
        if (TextUtils.isEmpty(com.huawei.maps.offlinedata.service.cloud.a.c().e())) {
            strE = "CN";
        } else {
            strE = com.huawei.maps.offlinedata.service.cloud.a.c().e();
        }
        String strF = com.huawei.maps.offlinedata.service.cloud.a.c().f();
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapHandShake reviewNumberOfWatchMap is " + strF);
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapHandShake downloadType is " + transmitRequest.getDownloadType());
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(cVar.a(2, strE).a(20, strF).b(13, transmitRequest.getMapSize()).d(10, transmitRequest.getMapType()).d(14, transmitRequest.getSyncType()).c(19, iA).d(22, transmitRequest.getDownloadType().intValue()).b()));
        builder.setPayload(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(stringBuffer.toString()));
        h hVar = new h();
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send sendMapHandShake.");
        a(builder.build(), bVar.c(), iA, new com.huawei.maps.offlinedata.service.device.receivers.e(transmitRequest.getFileDecompressDir() + File.separator + transmitRequest.getFileName(), transmitRequest.getRequestId()), hVar);
    }

    public void a(String str, long j2) {
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "transmitMap requestId is " + j2);
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            i iVar = new i(file, j2);
            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send transmitMap " + j2);
            this.f17907a.put(Long.valueOf(j2), str);
            a(new OfflineMapP2pMessage.Builder().setPayload(file).build(), com.huawei.maps.offlinedata.service.device.tlvtools.b.a(), iVar);
            return;
        }
        com.huawei.maps.offlinedata.utils.g.d("DeviceSenderService", j2 + "transmitMap file not exist or not file. ");
        com.huawei.maps.offlinedata.service.device.f.b().b(String.valueOf(j2));
    }

    public void a(long j2, long j3, boolean z, int i2) {
        if (!this.f17907a.containsKey(Long.valueOf(j2))) {
            com.huawei.maps.offlinedata.utils.g.d("DeviceSenderService", "requestId " + j2 + " is not sending!");
            Timer timer = new Timer();
            j jVar = new j(j2, j3, z, i2, timer);
            if (i2 < 3) {
                timer.schedule(jVar, 1000L);
                return;
            }
            com.huawei.maps.offlinedata.utils.g.b("DeviceSenderService", "cancel transmitMap failed after retry, retryTimes is " + i2);
            com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "requestId error.", j3);
            return;
        }
        b(j2, j3, z, 0);
    }

    public void a(IOfflineMapPingCallback iOfflineMapPingCallback) {
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendPingToDevice.");
        OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().sendPingToDevice(iOfflineMapPingCallback, OfflineMapWearEngineManager.WEAR_PACKAGE_NAME);
    }

    private void a(OfflineMapP2pMessage offlineMapP2pMessage, int i2, IOfflineMapSendCallback iOfflineMapSendCallback) {
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMsgToDevice, msgId is " + i2);
        OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().sendMsgToDevice(offlineMapP2pMessage, i2, iOfflineMapSendCallback);
    }

    private void a(OfflineMapP2pMessage offlineMapP2pMessage, int i2, int i3, com.huawei.maps.offlinedata.service.device.receivers.f fVar, IOfflineMapSendCallback iOfflineMapSendCallback) {
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMsgToDevice with receiver, msgId is " + i3);
        com.huawei.maps.offlinedata.service.device.receivers.g.a().a(fVar, i2, i3);
        OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().sendMsgToDevice(offlineMapP2pMessage, i3, iOfflineMapSendCallback);
    }

    public void a(int i2) {
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "sendMapSizeToDevice mapSize is " + i2);
        OfflineMapP2pMessage.Builder builder = new OfflineMapP2pMessage.Builder();
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.consts.b.MAP_SIZE_BY_WEAR.b());
        String strD = com.huawei.maps.offlinedata.service.device.tlvtools.a.d(i2);
        String strB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(strD.length() / 2);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.d(13));
        stringBuffer.append(strB);
        stringBuffer.append(strD);
        builder.setPayload(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(stringBuffer.toString()));
        b bVar = new b();
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "start send sendMapSizeToDevice");
        a(builder.build(), com.huawei.maps.offlinedata.service.device.tlvtools.b.a(), bVar);
    }

    public void a(long j2, int i2, int i3) {
        OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().registerDeviceSampleListener(OfflineMapWearEngineManager.MAPKIT_PACKAGE_NAME, new c(j2));
        com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "getOrSetDeviceDownloadType type " + i2 + ", status " + i3);
        StringBuffer stringBuffer = new StringBuffer(16);
        String strD = com.huawei.maps.offlinedata.service.device.tlvtools.a.d(i3);
        String strB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(strD.length() / 2);
        stringBuffer.append(com.huawei.maps.offlinedata.service.device.tlvtools.a.d(25));
        stringBuffer.append(strB);
        stringBuffer.append(strD);
        SampleConfigInfo sampleConfigInfo = new SampleConfigInfo();
        sampleConfigInfo.setConfigId(OfflineMapWearEngineManager.AUTO_DOWNLOAD_SWITCH);
        sampleConfigInfo.setConfigAction(i2);
        sampleConfigInfo.setByteConfigData(com.huawei.maps.offlinedata.service.device.tlvtools.a.a(stringBuffer.toString()));
        sampleConfigInfo.setConfigModifyTime(Long.valueOf(System.currentTimeMillis()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(sampleConfigInfo);
        SampleConfig sampleConfig = new SampleConfig();
        sampleConfig.setSrcPkgName(OfflineMapWearEngineManager.MAPKIT_PACKAGE_NAME);
        sampleConfig.setWearPkgName(OfflineMapWearEngineManager.WEAR_PACKAGE_NAME);
        sampleConfig.setConfigInfoList(arrayList);
        OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().sendSampleConfigCommand(OfflineMapWearEngineManager.MAPKIT_PACKAGE_NAME, OfflineMapWearEngineManager.WEAR_PACKAGE_NAME, sampleConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(SampleBase sampleBase) {
        if (sampleBase instanceof SampleConfig) {
            List<SampleConfigInfo> configInfoList = ((SampleConfig) sampleBase).getConfigInfoList();
            if (configInfoList.isEmpty()) {
                com.huawei.maps.offlinedata.utils.g.d("DeviceSenderService", "getConfigData sampleConfigList is empty");
                return -2;
            }
            int i2 = 0;
            SampleConfigInfo sampleConfigInfo = configInfoList.get(0);
            if (sampleConfigInfo == null) {
                return -2;
            }
            try {
                com.huawei.maps.offlinedata.service.device.tlvtools.d dVarB = com.huawei.maps.offlinedata.service.device.tlvtools.e.b(sampleConfigInfo.getByteConfigData());
                if (dVarB == null) {
                    com.huawei.maps.offlinedata.utils.g.d("DeviceSenderService", "configData TlvByteFather is null");
                    return -2;
                }
                int iB = 0;
                for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : dVarB.b()) {
                    try {
                        if (fVar.a() == 25) {
                            iB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), 0);
                            com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "configData autoDownload:" + iB);
                        } else {
                            com.huawei.maps.offlinedata.utils.g.d("DeviceSenderService", "configData type error:" + ((int) fVar.a()));
                        }
                    } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused) {
                        i2 = iB;
                        com.huawei.maps.offlinedata.utils.g.b("DeviceSenderService", "configData catch TlvException");
                        iB = i2;
                    }
                }
                com.huawei.maps.offlinedata.utils.g.c("DeviceSenderService", "getConfigData autoDownload: " + iB);
                return iB;
            } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused2) {
            }
        } else {
            com.huawei.maps.offlinedata.utils.g.d("DeviceSenderService", "getConfigData message is error.");
            return -2;
        }
    }
}
