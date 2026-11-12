package com.huami.bluetooth.feature.file_transfer.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.business.IDeviceLifeCycle;
import com.huami.bluetooth.feature.file_transfer.FileInfo;
import com.huami.bluetooth.feature.file_transfer.FileReceiveTask;
import com.huami.bluetooth.feature.file_transfer.FileTransferAppletApi;
import com.huami.bluetooth.profile.channel.module.file_transfer.FilePacketResponse;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileRequestInfo;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApiFactory;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferPacket;
import com.huami.bluetooth.profile.channel.module.file_transfer.IFileTransfer;
import com.huami.bluetooth.profile.channel.module.file_transfer.PushListener;
import com.huami.bluetooth.profile.channel.module.file_transfer.ReceiveListener;
import com.huami.bluetooth.profile.channel.module.file_transfer.TransferListener;
import com.huami.bluetooth.profile.channel.module.file_transfer.TransferResponse;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\"\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%¨\u0006-"}, d2 = {"Lcom/huami/bluetooth/feature/file_transfer/impl/FileTransferAppletApiImpl;", "Lcom/huami/bluetooth/feature/file_transfer/FileTransferAppletApi;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/IFileTransfer;", "Lcom/huami/bluetooth/business/IDeviceLifeCycle;", "", "path", "", "b", "c", "a", "Lcom/huami/bluetooth/feature/file_transfer/FileInfo;", "fileInfo", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/TransferListener;", "transferListener", "pushFileToDevice", "addReceiveFileListener", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileRequestInfo;", "onRequest", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferPacket;", "fileTransferPacket", "onDataPacket", "onConnected", "onDisConnect", "onDestroy", "onConnecting", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Ljava/lang/String;", "fileSaveDir", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApi;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApi;", "fileTransferApi", "", "", "Lcom/huami/bluetooth/feature/file_transfer/FileReceiveTask;", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "fileTransferTask", "Lcom/huami/bluetooth/feature/file_transfer/impl/ReceiveListenerWrapper;", "e", "receiveListeners", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileTransferAppletApiImpl implements FileTransferAppletApi, IFileTransfer, IDeviceLifeCycle {

    @NotNull
    private static final String f = "FileTransferAppletApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String fileSaveDir;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private FileTransferApi fileTransferApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, FileReceiveTask> fileTransferTask = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Map<String, ReceiveListenerWrapper> receiveListeners = new LinkedHashMap();

    public FileTransferAppletApiImpl(@NotNull HMBaseDevice hMBaseDevice, @NotNull String str) throws Exception {
        this.device = hMBaseDevice;
        this.fileSaveDir = str;
        c();
        hMBaseDevice.registerLifeCycleListener(this);
    }

    private final void a() throws Exception {
        if (!this.device.isConnected()) {
            throw new Exception("Device is not connected!");
        }
        if (this.fileTransferApi == null) {
            throw new Exception("File transfer is null");
        }
    }

    private final void b(String path) {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
    }

    private final void c() throws Exception {
        FileTransferApi fileTransferApiCreateApi = FileTransferApiFactory.INSTANCE.createApi(this.device);
        if (fileTransferApiCreateApi == null) {
            return;
        }
        fileTransferApiCreateApi.registerTransferListener(this);
        this.fileTransferApi = fileTransferApiCreateApi;
        this.fileTransferTask.clear();
    }

    @Override // com.huami.bluetooth.feature.file_transfer.FileTransferAppletApi
    public void addReceiveFileListener(@NotNull FileInfo fileInfo, @NotNull TransferListener transferListener) throws Exception {
        a();
        this.receiveListeners.put(fileInfo.getUrl(), new ReceiveListenerWrapper(fileInfo.getUrl(), (ReceiveListener) transferListener, 0));
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnectFailed() {
        IDeviceLifeCycle.DefaultImpls.onConnectFailed(this);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnectTimeout() {
        IDeviceLifeCycle.DefaultImpls.onConnectTimeout(this);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnected() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            c();
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(f, Intrinsics.stringPlus("Init file transfer api failed while device reconnect,case:", thM3848exceptionOrNullimpl));
        }
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnecting() {
        FileTransferApi fileTransferApi = this.fileTransferApi;
        if (fileTransferApi == null) {
            return;
        }
        fileTransferApi.unregisterTransferListener(this);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onCreate(boolean z) {
        IDeviceLifeCycle.DefaultImpls.onCreate(this, z);
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.IFileTransfer
    public void onDataPacket(@NotNull FileTransferPacket fileTransferPacket) {
        Debug.fi(f, fileTransferPacket.toString());
        FileReceiveTask fileReceiveTask = this.fileTransferTask.get(Integer.valueOf(fileTransferPacket.getSessionID()));
        if (fileReceiveTask == null) {
            Debug.fi(f, "SessionID not match");
            FileTransferApi fileTransferApi = this.fileTransferApi;
            if (fileTransferApi == null) {
                return;
            }
            fileTransferApi.fileDataPacketAck(new FilePacketResponse(fileTransferPacket.getSessionID(), 4));
            return;
        }
        if (fileReceiveTask.isPacketLost(fileTransferPacket.getChunkSize())) {
            Debug.fi(f, "Packet lost");
            FileTransferApi fileTransferApi2 = this.fileTransferApi;
            if (fileTransferApi2 != null) {
                fileTransferApi2.fileDataPacketAck(new FilePacketResponse(fileTransferPacket.getSessionID(), 10));
            }
            this.fileTransferTask.remove(Integer.valueOf(fileTransferPacket.getSessionID()));
            Map<String, ReceiveListenerWrapper> map = this.receiveListeners;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ReceiveListenerWrapper> entry : map.entrySet()) {
                if (m.startsWith$default(fileReceiveTask.getUrl(), entry.getKey(), false, 2, null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                ((ReceiveListenerWrapper) ((Map.Entry) it2.next()).getValue()).getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().onFailed(new Exception("Packet lost"));
            }
            this.receiveListeners.remove(fileReceiveTask.getUrl());
            return;
        }
        int iAppendPacket$default = FileReceiveTask.appendPacket$default(fileReceiveTask, fileTransferPacket, 0L, 2, null);
        Debug.fi(f, Intrinsics.stringPlus("Write file result:", Integer.valueOf(iAppendPacket$default)));
        if (iAppendPacket$default == -1) {
            FileTransferApi fileTransferApi3 = this.fileTransferApi;
            if (fileTransferApi3 != null) {
                fileTransferApi3.fileDataPacketAck(new FilePacketResponse(fileTransferPacket.getSessionID(), 0));
            }
            Map<String, ReceiveListenerWrapper> map2 = this.receiveListeners;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, ReceiveListenerWrapper> entry2 : map2.entrySet()) {
                if (m.startsWith$default(fileReceiveTask.getUrl(), entry2.getKey(), false, 2, null)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                if (((ReceiveListenerWrapper) entry3.getValue()).getLastProgress() != fileReceiveTask.getProgress()) {
                    ((ReceiveListenerWrapper) entry3.getValue()).getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().onProgress(fileReceiveTask.getProgress());
                }
            }
        } else if (iAppendPacket$default == 0) {
            FileTransferApi fileTransferApi4 = this.fileTransferApi;
            if (fileTransferApi4 != null) {
                fileTransferApi4.fileDataPacketAck(new FilePacketResponse(fileTransferPacket.getSessionID(), 0));
            }
            Map<String, ReceiveListenerWrapper> map3 = this.receiveListeners;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry<String, ReceiveListenerWrapper> entry4 : map3.entrySet()) {
                if (m.startsWith$default(fileReceiveTask.getUrl(), entry4.getKey(), false, 2, null)) {
                    linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                }
            }
            for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                ((ReceiveListenerWrapper) entry5.getValue()).getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().onProgress(100);
                ((ReceiveListenerWrapper) entry5.getValue()).getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().onCompleted(fileReceiveTask.getFilePath(), fileReceiveTask.getUrl());
            }
        } else if (iAppendPacket$default == 7) {
            Map<String, ReceiveListenerWrapper> map4 = this.receiveListeners;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry<String, ReceiveListenerWrapper> entry6 : map4.entrySet()) {
                if (m.startsWith$default(fileReceiveTask.getUrl(), entry6.getKey(), false, 2, null)) {
                    linkedHashMap4.put(entry6.getKey(), entry6.getValue());
                }
            }
            Iterator it3 = linkedHashMap4.entrySet().iterator();
            while (it3.hasNext()) {
                ((ReceiveListenerWrapper) ((Map.Entry) it3.next()).getValue()).getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().onFailed(new Exception("Write file to disk failed"));
            }
            FileTransferApi fileTransferApi5 = this.fileTransferApi;
            if (fileTransferApi5 != null) {
                fileTransferApi5.fileDataPacketAck(new FilePacketResponse(fileTransferPacket.getSessionID(), 7));
            }
        } else if (iAppendPacket$default == 11) {
            FileTransferApi fileTransferApi6 = this.fileTransferApi;
            if (fileTransferApi6 != null) {
                fileTransferApi6.fileDataPacketAck(new FilePacketResponse(fileTransferPacket.getSessionID(), 11));
            }
            Map<String, ReceiveListenerWrapper> map5 = this.receiveListeners;
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry<String, ReceiveListenerWrapper> entry7 : map5.entrySet()) {
                if (m.startsWith$default(fileReceiveTask.getUrl(), entry7.getKey(), false, 2, null)) {
                    linkedHashMap5.put(entry7.getKey(), entry7.getValue());
                }
            }
            Iterator it4 = linkedHashMap5.entrySet().iterator();
            while (it4.hasNext()) {
                ((ReceiveListenerWrapper) ((Map.Entry) it4.next()).getValue()).getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().onFailed(new Exception("CRC not match, something wrong during transfer"));
            }
        }
        if (iAppendPacket$default != -1) {
            this.fileTransferTask.remove(Integer.valueOf(fileTransferPacket.getSessionID()));
            this.receiveListeners.remove(fileReceiveTask.getUrl());
        }
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onDestroy() {
        FileTransferApi fileTransferApi = this.fileTransferApi;
        if (fileTransferApi == null) {
            return;
        }
        fileTransferApi.unregisterTransferListener(this);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onDisConnect() {
        FileTransferApi fileTransferApi = this.fileTransferApi;
        if (fileTransferApi == null) {
            return;
        }
        fileTransferApi.unregisterTransferListener(this);
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.IFileTransfer
    public void onRequest(@NotNull FileRequestInfo fileInfo) {
        long j;
        Debug.fi(f, fileInfo.toString());
        String str = this.fileSaveDir + ((Object) File.separator) + fileInfo.getFileName() + ".tmp";
        File file = new File(str);
        long length = file.exists() ? file.length() : 0L;
        if (length >= fileInfo.getFileSize()) {
            b(str);
            j = 0;
        } else {
            j = length;
        }
        FileReceiveTask fileReceiveTask = new FileReceiveTask(fileInfo.getSessionID(), fileInfo.getUrl(), str, fileInfo.getFileSize(), fileInfo.getFileCRC32());
        if (!new File(file.getParent()).exists()) {
            new File(file.getParent()).mkdirs();
        }
        if (this.fileTransferTask.containsKey(Integer.valueOf(fileReceiveTask.getSessionID()))) {
            FileTransferApi fileTransferApi = this.fileTransferApi;
            if (fileTransferApi == null) {
                return;
            }
            fileTransferApi.startReceiveFile(new TransferResponse(fileInfo.getSessionID(), 9, 0, 4, null));
            return;
        }
        this.fileTransferTask.put(Integer.valueOf(fileReceiveTask.getSessionID()), fileReceiveTask);
        FileTransferApi fileTransferApi2 = this.fileTransferApi;
        if (fileTransferApi2 != null) {
            fileTransferApi2.startReceiveFile(new TransferResponse(fileInfo.getSessionID(), 0, (int) j));
        }
        Map<String, ReceiveListenerWrapper> map = this.receiveListeners;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ReceiveListenerWrapper> entry : map.entrySet()) {
            if (m.startsWith$default(fileReceiveTask.getUrl(), entry.getKey(), false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((ReceiveListenerWrapper) ((Map.Entry) it2.next()).getValue()).getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String().onStart();
        }
    }

    @Override // com.huami.bluetooth.feature.file_transfer.FileTransferAppletApi
    public void pushFileToDevice(@NotNull FileInfo fileInfo, @NotNull TransferListener transferListener) throws Exception {
        a();
        if (!(transferListener instanceof PushListener)) {
            throw new Exception("Please input right listener");
        }
        FileTransferApi fileTransferApi = this.fileTransferApi;
        if (fileTransferApi == null) {
            return;
        }
        fileTransferApi.sendFile(fileInfo, (PushListener) transferListener, true);
    }
}
