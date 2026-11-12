package com.huami.watch.companion.watchface.manager;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.watchface.WatchFaceModule;
import com.huami.watch.companion.watchface.manager.SyncWatchFaceManager;
import com.huami.watch.photodial.WatchInfo;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.datatransactor.FileInfo;
import com.ingenic.iwds.datatransactor.FileTransactionModel;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.device.Status;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.upnp.device.ST;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 92\u00020\u0001:\u00069:;<=>B\u000f\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R!\u0010-\u001a\u00060(R\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u0006?"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager;", "Lcom/huami/watch/companion/watchface/manager/BasicDeviceController;", "", "o", "", "url", "m", "Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$SyncWatchFaceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSyncWatchFaceListener", "Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchDiySkinListener;", "addWatchDiySkinListener", "queryDiyWatchSkinFromWatch", "startTransaction", Constant.h, "sendCmd", "Lcom/huami/watch/photodial/WatchInfo;", "watchInfo", "sendWatchInfo", "filePath", "sendFile", "getTakePhotoPath", "skinBin", "getDownloadBinPath", "imageUrl", "getDownloadImagePath", "getZipPath", "onConnected", "onDisconnected", "onClear", "Lcom/huami/watch/transport/TransportDataItem;", "transportDataItem", "dataReceived", "", "available", "channelListener", "Landroid/content/Context;", "i", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchFaceTransactionModel;", z.j, "Lkotlin/Lazy;", "l", "()Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchFaceTransactionModel;", "mWatchFaceTransactionModel", hl.k, "Z", "mChannelAvailable", "isTransactionStarted", "Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$SyncWatchFaceListener;", "mSyncWatchFaceListener", GoogleApiAvailabilityLight.b, "Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchDiySkinListener;", "mWatchDiySkinListener", "<init>", "(Landroid/content/Context;)V", "Companion", "SyncWatchFaceListener", "WatchDiySkinListener", "WatchFaceTransactionInterruptCallback", "WatchFaceTransactionModel", "WatchFaceTransactionModelCallback", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class SyncWatchFaceManager extends BasicDeviceController {

    @NotNull
    private static final String o = "SyncWatchManager";

    @NotNull
    private static final String p = "01b0df1c-7fdf-4c56-a14d-e0d230699ae9";

    @NotNull
    private static final String q = "watch_skin";

    @NotNull
    private static final String r = "zip";

    @NotNull
    private static final String s = "image";

    @NotNull
    private static final String t = "tack_photo_image";

    @NotNull
    private static final String u = "bin";

    @NotNull
    private static final String v = ".zip";

    @NotNull
    private static final String w = ".bin";

    @NotNull
    private static final String x = ".png";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy mWatchFaceTransactionModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean mChannelAvailable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isTransactionStarted;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private SyncWatchFaceListener mSyncWatchFaceListener;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private WatchDiySkinListener mWatchDiySkinListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$SyncWatchFaceListener;", "", "", "data", "", "onDataArrivedCallback", "", "progress", "onSendFileProgressCallback", "", Status.PRE_CONNECT_STATE_CONNECTED, "connectCallback", b.r, "interruptedCallback", "companion_release"}, k = 1, mv = {1, 5, 1})
    public interface SyncWatchFaceListener {
        void connectCallback(boolean connected);

        void interruptedCallback(int p);

        void onDataArrivedCallback(@NotNull String data);

        void onSendFileProgressCallback(int progress);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchDiySkinListener;", "", "", "Lcom/huami/watch/companion/watchface/manager/LocalWatchFaceResponse;", "data", "", "onDataCallback", "([Lcom/huami/watch/companion/watchface/manager/LocalWatchFaceResponse;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public interface WatchDiySkinListener {
        void onDataCallback(@Nullable LocalWatchFaceResponse[] data);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchFaceTransactionInterruptCallback;", "Lcom/ingenic/iwds/datatransactor/FileTransactionModel$FileTransactionInterruptCallback;", "", "p0", "", "onFileTransferError", "onRecvFileInterrupted", "onSendFileInterrupted", "<init>", "(Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public final class WatchFaceTransactionInterruptCallback implements FileTransactionModel.FileTransactionInterruptCallback {
        public WatchFaceTransactionInterruptCallback() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
        public void onFileTransferError(int p0) {
            SyncWatchFaceListener syncWatchFaceListener = SyncWatchFaceManager.this.mSyncWatchFaceListener;
            if (syncWatchFaceListener == null) {
                return;
            }
            syncWatchFaceListener.interruptedCallback(p0);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
        public void onRecvFileInterrupted(int p0) {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
        public void onSendFileInterrupted(int p0) {
            SyncWatchFaceListener syncWatchFaceListener = SyncWatchFaceManager.this.mSyncWatchFaceListener;
            if (syncWatchFaceListener == null) {
                return;
            }
            syncWatchFaceListener.interruptedCallback(p0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchFaceTransactionModel;", "Lcom/ingenic/iwds/datatransactor/FileTransactionModel;", "", Constant.h, "", "sendCmd", "Lcom/huami/watch/photodial/WatchInfo;", "watchInfo", "sendWatchInfo", "", "data", "onDataArrived", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/ingenic/iwds/datatransactor/FileTransactionModel$FileTransactionModelCallback;", "fileTransactionModelCallback", "Lcom/ingenic/iwds/datatransactor/FileTransactionModel$FileTransactionInterruptCallback;", "interruptCallback", ST.UUID_DEVICE, "<init>", "(Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager;Landroid/content/Context;Lcom/ingenic/iwds/datatransactor/FileTransactionModel$FileTransactionModelCallback;Lcom/ingenic/iwds/datatransactor/FileTransactionModel$FileTransactionInterruptCallback;Ljava/lang/String;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public final class WatchFaceTransactionModel extends FileTransactionModel {
        public WatchFaceTransactionModel(@NotNull Context context, @NotNull FileTransactionModel.FileTransactionModelCallback fileTransactionModelCallback, @NotNull FileTransactionModel.FileTransactionInterruptCallback fileTransactionInterruptCallback, String str) {
            super(context, fileTransactionModelCallback, fileTransactionInterruptCallback, str);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel, com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onDataArrived(@Nullable Object data) {
            SyncWatchFaceListener syncWatchFaceListener;
            try {
                super.onDataArrived(data);
                if (!(data instanceof String) || (syncWatchFaceListener = SyncWatchFaceManager.this.mSyncWatchFaceListener) == null) {
                    return;
                }
                syncWatchFaceListener.onDataArrivedCallback((String) data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void sendCmd(@NotNull String cmd) {
            this.m_transactor.send(cmd);
        }

        public final void sendWatchInfo(@NotNull WatchInfo watchInfo) {
            this.m_transactor.send(watchInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0018\u00010\fR\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¨\u0006\u0018"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchFaceTransactionModelCallback;", "Lcom/ingenic/iwds/datatransactor/FileTransactionModel$FileTransactionModelCallback;", "Lcom/ingenic/iwds/datatransactor/FileInfo;", "p0", "", "onRequestSendFile", "Ljava/io/File;", "onFileArrived", "", "onSendFileProgress", "onConfirmForReceiveFile", "onRecvFileProgress", "Lcom/ingenic/iwds/datatransactor/DataTransactor$DataTransactResult;", "Lcom/ingenic/iwds/datatransactor/DataTransactor;", "onSendResult", "onCancelForReceiveFile", "", "available", "onChannelAvailable", "Lcom/ingenic/iwds/DeviceDescriptor;", "p1", "onLinkConnected", "<init>", "(Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public final class WatchFaceTransactionModelCallback implements FileTransactionModel.FileTransactionModelCallback {
        public WatchFaceTransactionModelCallback() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onCancelForReceiveFile() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onChannelAvailable(boolean available) {
            SyncWatchFaceManager.this.mChannelAvailable = available;
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onConfirmForReceiveFile() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onFileArrived(@Nullable File p0) {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onLinkConnected(@Nullable DeviceDescriptor p0, boolean p1) {
            Log.d(SyncWatchFaceManager.o, "SyncWatchManager onLinkConnected model: " + (p0 == null ? null : p0.model) + " display: " + (p0 != null ? p0.displayID : null) + " isConnected: " + p1, new Object[0]);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onRecvFileProgress(int p0) {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onRequestSendFile(@Nullable FileInfo p0) {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onSendFileProgress(int p0) {
            Log.i(SyncWatchFaceManager.o, "onSendFileProgress command:" + p0, new Object[0]);
            SyncWatchFaceListener syncWatchFaceListener = SyncWatchFaceManager.this.mSyncWatchFaceListener;
            if (syncWatchFaceListener == null) {
                return;
            }
            syncWatchFaceListener.onSendFileProgressCallback(p0);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onSendResult(@Nullable DataTransactor.DataTransactResult p0) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager$WatchFaceTransactionModel;", "Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WatchFaceTransactionModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceTransactionModel invoke() {
            SyncWatchFaceManager syncWatchFaceManager = SyncWatchFaceManager.this;
            return syncWatchFaceManager.new WatchFaceTransactionModel(syncWatchFaceManager.context, SyncWatchFaceManager.this.new WatchFaceTransactionModelCallback(), SyncWatchFaceManager.this.new WatchFaceTransactionInterruptCallback(), SyncWatchFaceManager.p);
        }
    }

    public SyncWatchFaceManager(@NotNull Context context) {
        super(context);
        this.context = context;
        this.mWatchFaceTransactionModel = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final WatchFaceTransactionModel l() {
        return (WatchFaceTransactionModel) this.mWatchFaceTransactionModel.getValue();
    }

    private final String m(String url) {
        try {
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) url, new String[]{FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            Object[] array2 = StringsKt__StringsKt.split$default((CharSequence) strArr[strArr.length - 1], new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array2 != null) {
                return ((String[]) array2)[0];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(DataTransportResult dataTransportResult) {
        Log.d(o, "send Action query_photo_watchface result: " + dataTransportResult + ";currentTimeMillis: " + System.currentTimeMillis(), new Object[0]);
    }

    private final void o() {
        if (this.isTransactionStarted) {
            l().stop();
            this.isTransactionStarted = false;
        }
    }

    public final void addSyncWatchFaceListener(@NotNull SyncWatchFaceListener listener) {
        this.mSyncWatchFaceListener = listener;
    }

    public final void addWatchDiySkinListener(@NotNull WatchDiySkinListener listener) {
        this.mWatchDiySkinListener = listener;
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void channelListener(boolean available) {
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void dataReceived(@NotNull TransportDataItem transportDataItem) {
        DataBundle data = transportDataItem.getData();
        if (data != null && Intrinsics.areEqual(transportDataItem.getAction(), WatchFaceModule.ACTION_WATCHFACE_QUERY_PHOTO_RESPONSE)) {
            Log.d(o, "currentTimeMillis: " + System.currentTimeMillis(), new Object[0]);
            LocalWatchFaceResponse[] localWatchFaceResponseArr = (LocalWatchFaceResponse[]) new GsonBuilder().create().fromJson(data.getString("data"), new TypeToken<LocalWatchFaceResponse[]>() { // from class: com.huami.watch.companion.watchface.manager.SyncWatchFaceManager$dataReceived$1$result$1
            }.getType());
            Log.d(o, "QueryAll : onReceiveData :" + localWatchFaceResponseArr, new Object[0]);
            WatchDiySkinListener watchDiySkinListener = this.mWatchDiySkinListener;
            if (watchDiySkinListener == null) {
                return;
            }
            watchDiySkinListener.onDataCallback(localWatchFaceResponseArr);
        }
    }

    @NotNull
    public final String getDownloadBinPath(@Nullable String skinBin) {
        if (TextUtils.isEmpty(skinBin)) {
            return System.currentTimeMillis() + w;
        }
        String string = FileUtils.getAppFileDir(this.context, "watch_skin").toString();
        String strM = m(skinBin);
        String str = File.separator;
        return string + str + u + str + strM + w;
    }

    @NotNull
    public final String getDownloadImagePath(@Nullable String imageUrl) {
        if (TextUtils.isEmpty(imageUrl)) {
            return System.currentTimeMillis() + w;
        }
        String string = FileUtils.getAppFileDir(this.context, "watch_skin").toString();
        String strM = m(imageUrl);
        String str = File.separator;
        return string + str + "image" + str + strM + x;
    }

    @NotNull
    public final String getTakePhotoPath() {
        String string = FileUtils.getAppFileDir(this.context, "watch_skin").toString();
        String str = File.separator;
        return string + str + t + str + System.currentTimeMillis() + x;
    }

    @NotNull
    public final String getZipPath() {
        String string = FileUtils.getAppFileDir(this.context, "watch_skin").toString();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String str = File.separator;
        return string + str + r + str + strValueOf + ".zip";
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void onClear() {
        super.onClear();
        o();
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void onConnected() {
        super.onConnected();
        SyncWatchFaceListener syncWatchFaceListener = this.mSyncWatchFaceListener;
        if (syncWatchFaceListener == null) {
            return;
        }
        syncWatchFaceListener.connectCallback(true);
    }

    @Override // com.huami.watch.companion.watchface.manager.BasicDeviceController
    public void onDisconnected() {
        super.onDisconnected();
        SyncWatchFaceListener syncWatchFaceListener = this.mSyncWatchFaceListener;
        if (syncWatchFaceListener == null) {
            return;
        }
        syncWatchFaceListener.connectCallback(false);
    }

    public final void queryDiyWatchSkinFromWatch() {
        if (getIsConnect()) {
            getMTransporter().send(WatchFaceModule.ACTION_WATCHFACE_QUERY_PHOTO, new Transporter.DataSendResultCallback() { // from class: ak7
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    SyncWatchFaceManager.n(dataTransportResult);
                }
            });
        }
    }

    public final void sendCmd(@NotNull String cmd) {
        if (this.mChannelAvailable) {
            l().sendCmd(cmd);
        }
    }

    public final void sendFile(@NotNull String filePath) {
        Log.i(o, "sendFile command", new Object[0]);
        File file = new File(filePath);
        if (!file.exists()) {
            Log.d(o, "zip file is not exists", new Object[0]);
            return;
        }
        try {
            Log.d(o, "send request file = " + file.getAbsolutePath() + " to watch", new Object[0]);
            l().requestSendFile(file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public final void sendWatchInfo(@NotNull WatchInfo watchInfo) {
        l().sendWatchInfo(watchInfo);
    }

    public final void startTransaction() {
        if (this.isTransactionStarted) {
            return;
        }
        l().start();
        this.isTransactionStarted = true;
    }
}
