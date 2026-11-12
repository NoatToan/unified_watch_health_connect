package com.huami.bluetooth.profile.channel.module.file_transfer.impl;

import androidx.annotation.WorkerThread;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.feature.file_transfer.FileInfo;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.bluetooth.profile.channel.module.file_transfer.FilePacketResponse;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileRequestInfo;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferCommand;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferModule;
import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferPacket;
import com.huami.bluetooth.profile.channel.module.file_transfer.IFileTransfer;
import com.huami.bluetooth.profile.channel.module.file_transfer.PushListener;
import com.huami.bluetooth.profile.channel.module.file_transfer.TransferResponse;
import com.huami.bluetooth.profile.channel.module.file_transfer.codec.AckCodec;
import com.huami.bluetooth.profile.channel.module.file_transfer.codec.FileTransferResponseCodec;
import com.huami.bluetooth.profile.channel.module.file_transfer.model.AckResponse;
import com.huami.bluetooth.profile.channel.module.file_transfer.model.FileTransferProtocolVersion;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.core.device.feature.compress.CompressApi;
import com.huami.core.device.feature.compress.impl.ZipCompress;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.CRCUtilsKt;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0016H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0019\u0010#\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160%0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/impl/FileTransferCompressImpl;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApi;", "", "data", "", "c", HTTP.CONTENT_RANGE_BYTES, "b", "a", "Lcom/huami/bluetooth/feature/file_transfer/FileInfo;", "fileInfo", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/PushListener;", "transferListener", "", "withCompress", "sendFile", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/TransferResponse;", AbstractJSONTokenResponse.RESPONSE, "startReceiveFile", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FilePacketResponse;", "ack", "fileDataPacketAck", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/IFileTransfer;", "registerTransferListener", "unregisterTransferListener", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;", "version", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "getDeviceRequestHandler", "()Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "deviceRequestHandler", "", "Ljava/lang/ref/WeakReference;", GoogleApiAvailabilityLight.a, "Ljava/util/Set;", "transferListeners", "", "e", "B", SDKConstants.PARAM_SESSION_ID, "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileRequestInfo;", "f", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileRequestInfo;", "fileTransferRequest", "Lcom/huami/core/device/feature/compress/CompressApi;", "g", "Lcom/huami/core/device/feature/compress/CompressApi;", "compressApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileTransferCompressImpl implements FileTransferApi {

    @NotNull
    private static final String h = "FileTransferImplV2";
    private static final int i = 204800;
    private static final int j = 65536;
    private static final int k = 1;
    private static final int l = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FileTransferModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FileTransferProtocolVersion version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DeviceRequestHandler deviceRequestHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Set<WeakReference<IFileTransfer>> transferListeners;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private byte sessionID;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private FileRequestInfo fileTransferRequest;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private CompressApi compressApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(FileTransferCompressImpl fileTransferCompressImpl) {
            super(1, fileTransferCompressImpl, FileTransferCompressImpl.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((FileTransferCompressImpl) this.receiver).c(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferCompressImpl$fileDataPacketAck$1", f = "FileTransferCompressImpl.kt", i = {}, l = {WeightingState.state_bodyfat_detail}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ Request.Command c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Request.Command command, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = command;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FileTransferCompressImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileTransferModule fileTransferModule = FileTransferCompressImpl.this.module;
                byte[] bArr = this.c.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(fileTransferModule, bArr, 0, false, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferCompressImpl$startReceiveFile$1", f = "FileTransferCompressImpl.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ Request.Command c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Request.Command command, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = command;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FileTransferCompressImpl.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileTransferModule fileTransferModule = FileTransferCompressImpl.this.module;
                byte[] bArr = this.c.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(fileTransferModule, bArr, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public FileTransferCompressImpl(@NotNull FileTransferModule fileTransferModule, @NotNull FileTransferProtocolVersion fileTransferProtocolVersion) {
        this.module = fileTransferModule;
        this.version = fileTransferProtocolVersion;
        DeviceRequestHandler deviceRequestHandler = new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferCompressImpl$deviceRequestHandler$2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return true;
            }
        });
        this.deviceRequestHandler = deviceRequestHandler;
        fileTransferModule.registerDeviceRequestHandler(deviceRequestHandler);
        this.transferListeners = new LinkedHashSet();
    }

    private final void a(byte[] bytes) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
        bufByteDecoder.append(bytes);
        int i2 = bufByteDecoder.readByte();
        int i3 = bufByteDecoder.readByte();
        int i4 = i2 & 1;
        int int$default = i4 > 0 ? BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null) : 0;
        int i5 = bufByteDecoder.readByte();
        int i6 = bufByteDecoder.readInt(2);
        boolean z = ((i2 >> 1) & 1) > 0;
        byte[] bytes2 = bufByteDecoder.readBytes(i6);
        Debug.fi(h, Intrinsics.stringPlus("Raw:", Integer.valueOf(bytes2.length)));
        FileRequestInfo fileRequestInfo = this.fileTransferRequest;
        if (fileRequestInfo != null && fileRequestInfo.getCompressType() == 1) {
            CompressApi compressApi = this.compressApi;
            byte[] bArrDecompress = compressApi != null ? compressApi.decompress(bytes2, z) : null;
            bytes2 = bArrDecompress == null ? new byte[0] : bArrDecompress;
        }
        Debug.fi(h, Intrinsics.stringPlus("Raw decode:", Integer.valueOf(bytes2.length)));
        FileTransferPacket fileTransferPacket = new FileTransferPacket(i3, i5, bytes2, z, i4 > 0, 0, int$default);
        Iterator<T> it2 = this.transferListeners.iterator();
        while (it2.hasNext()) {
            IFileTransfer iFileTransfer = (IFileTransfer) ((WeakReference) it2.next()).get();
            if (iFileTransfer != null) {
                iFileTransfer.onDataPacket(fileTransferPacket);
            }
        }
    }

    private final void b(byte[] bytes) {
        FileRequestInfo v2 = FileRequestInfo.INSTANCE.parseV2(bytes);
        this.fileTransferRequest = v2;
        boolean z = false;
        if (v2 != null && v2.getCompressType() == 1) {
            z = true;
        }
        if (z) {
            FileRequestInfo fileRequestInfo = this.fileTransferRequest;
            this.compressApi = new ZipCompress(fileRequestInfo == null ? 8096 : fileRequestInfo.getCompressBufSize());
        }
        Iterator<T> it2 = this.transferListeners.iterator();
        while (it2.hasNext()) {
            IFileTransfer iFileTransfer = (IFileTransfer) ((WeakReference) it2.next()).get();
            if (iFileTransfer != null) {
                iFileTransfer.onRequest(this.fileTransferRequest);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(byte[] data) {
        byte bFirst = ArraysKt___ArraysKt.first(data);
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(data, new IntRange(1, data.length - 1));
        if (bFirst == FileTransferCommand.TransferRequestCommand.INSTANCE.getCmd()) {
            b(bArrSliceArray);
        } else if (bFirst == FileTransferCommand.TransferDataCommand.INSTANCE.getCmd()) {
            a(bArrSliceArray);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    @WorkerThread
    public boolean fileDataPacketAck(@NotNull FilePacketResponse ack) {
        return ((Boolean) d.b(null, new b(FileTransferCommand.TransferAckCommand.INSTANCE.withByte(ack.getSessionID()).withByte(ack.getErrorCode()), null), 1, null)).booleanValue();
    }

    @NotNull
    public final DeviceRequestHandler getDeviceRequestHandler() {
        return this.deviceRequestHandler;
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    public void registerTransferListener(@NotNull IFileTransfer transferListener) {
        this.transferListeners.clear();
        this.transferListeners.add(new WeakReference<>(transferListener));
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a3 A[Catch: all -> 0x02d9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x02d9, blocks: (B:45:0x016b, B:53:0x0186, B:58:0x01a3, B:65:0x01b6, B:72:0x01d0, B:74:0x0229, B:71:0x01cd), top: B:124:0x016b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x024a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0275 A[Catch: all -> 0x02d7, TRY_ENTER, TryCatch #2 {all -> 0x02d7, blocks: (B:81:0x024e, B:83:0x0258, B:89:0x0275, B:91:0x027b, B:97:0x02a4, B:99:0x02ae), top: B:123:0x024e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02a4 A[Catch: all -> 0x02d7, TRY_ENTER, TryCatch #2 {all -> 0x02d7, blocks: (B:81:0x024e, B:83:0x0258, B:89:0x0275, B:91:0x027b, B:97:0x02a4, B:99:0x02ae), top: B:123:0x024e }] */
    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    @WorkerThread
    public void sendFile(@NotNull FileInfo fileInfo, @NotNull PushListener transferListener, boolean withCompress) throws Throwable {
        String str;
        Throwable th;
        String str2;
        byte[] bArr;
        Ref.IntRef intRef;
        int i2;
        int i3;
        byte[] bArrNumberToBytes;
        ZipCompress zipCompress;
        AckResponse ackResponse;
        String str3 = "Clean up exception:";
        byte b2 = this.sessionID;
        this.sessionID = (byte) (b2 + 1);
        File file = new File(fileInfo.getFilePath());
        if (!file.exists()) {
            transferListener.onFailed(new Exception("File not exist"));
            return;
        }
        int i4 = (!withCompress || file.length() < 204800) ? 0 : 1;
        String url = fileInfo.getUrl();
        String name = file.getName();
        long length = file.length();
        TransferResponse transferResponse = (TransferResponse) ModuleResultKt.peel(new FileTransferResponseCodec().decode(this.module.sendRequest(new ModuleRequest(FileTransferCommand.TransferRequestCommand.INSTANCE.withByte(AuthModuleKt.toUnSignInt(b2)).withString(url).withString(name).withInt((int) length).withInt((int) CRCUtilsKt.getCrc32(fileInfo.getFilePath())).withByte(i4).withInt(4096), IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
        if (transferResponse == null) {
            transferListener.onFailed(new Exception("Start transfer no response"));
            return;
        }
        Debug.fi(h, Intrinsics.stringPlus("Start transfer response:", transferResponse));
        if (transferResponse.getErrorCode() != 0) {
            transferListener.onFailed(new Exception(Intrinsics.stringPlus("Start transfer error with code:", Integer.valueOf(transferResponse.getErrorCode()))));
            return;
        }
        int chunkSize = this.version.getChunkSize();
        long alreadyTransferSize = transferResponse.getAlreadyTransferSize();
        transferListener.onStart();
        if (alreadyTransferSize == length) {
            transferListener.onCompleted();
            return;
        }
        ZipCompress zipCompress2 = new ZipCompress(4096);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        bufferedInputStream.skip(alreadyTransferSize);
        PipedInputStream pipedInputStream = new PipedInputStream(65536);
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        pipedOutputStream.connect(pipedInputStream);
        int i5 = -1;
        int i6 = 1;
        while (true) {
            try {
                if (pipedInputStream.available() < chunkSize) {
                    try {
                        if (bufferedInputStream.available() > 0) {
                            str2 = str3;
                            try {
                                byte[] bArr2 = new byte[4096];
                                int i7 = bufferedInputStream.read(bArr2, 0, 4096);
                                if (i7 < 1) {
                                    Debug.fi(h, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i7)));
                                } else if (i4 != 0) {
                                    pipedOutputStream.write(zipCompress2.compress(ArraysKt___ArraysKt.sliceArray(bArr2, new IntRange(0, i7 - 1)), bufferedInputStream.available() <= 0));
                                } else {
                                    pipedOutputStream.write(ArraysKt___ArraysKt.sliceArray(bArr2, new IntRange(0, i7 - 1)));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str = str2;
                            }
                        } else {
                            str2 = str3;
                        }
                        try {
                            if (pipedInputStream.available() < chunkSize || bufferedInputStream.available() <= 0) {
                                bArr = new byte[chunkSize];
                                intRef = new Ref.IntRef();
                                i2 = pipedInputStream.read(bArr, 0, chunkSize);
                                intRef.element = i2;
                                if (i2 < 1) {
                                    if (pipedInputStream.available() <= 0 || bufferedInputStream.available() > 0) {
                                        i3 = i6;
                                    } else {
                                        i3 = i6 | 2;
                                    }
                                    i5 = (i5 + 1) % 256;
                                    Request.Command commandWithByte = FileTransferCommand.TransferDataCommand.INSTANCE.withByte(i3).withByte(b2);
                                    if (i6 != 0) {
                                        bArrNumberToBytes = GattUtils.numberToBytes(alreadyTransferSize, 4);
                                        i6 = 0;
                                    } else {
                                        bArrNumberToBytes = new byte[0];
                                    }
                                    zipCompress = zipCompress2;
                                    ackResponse = (AckResponse) ModuleResultKt.peel(new AckCodec().decode(this.module.sendRequest(new ModuleRequest(commandWithByte.withBytes(bArrNumberToBytes).withByte(i5).withShort(intRef.element).withBytes(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, intRef.element - 1))), IncreasePredict.INSTANCE, 0L, null, false, 12, null))));
                                    Debug.fi(h, Intrinsics.stringPlus("ack:", ackResponse));
                                    if (ackResponse == null) {
                                        transferListener.onFailed(new Exception("Send file data failed"));
                                        try {
                                            bufferedInputStream.close();
                                            pipedInputStream.close();
                                            pipedOutputStream.close();
                                            return;
                                        } catch (Throwable th3) {
                                            Debug.fi(h, Intrinsics.stringPlus(str2, th3));
                                            return;
                                        }
                                    }
                                    str = str2;
                                    try {
                                        if (ackResponse.getSessionID() == AuthModuleKt.toUnSignInt(b2)) {
                                            if (ackResponse.getCode() == 0) {
                                                alreadyTransferSize += (long) intRef.element;
                                                if (pipedInputStream.available() != 0 && bufferedInputStream.available() == 0) {
                                                    break;
                                                }
                                                zipCompress2 = zipCompress;
                                                str3 = str;
                                            } else {
                                                transferListener.onFailed(new Exception(Intrinsics.stringPlus("Send data error:", Integer.valueOf(ackResponse.getCode()))));
                                                try {
                                                    bufferedInputStream.close();
                                                    pipedInputStream.close();
                                                    pipedOutputStream.close();
                                                    return;
                                                } catch (Throwable th4) {
                                                    Debug.fi(h, Intrinsics.stringPlus(str, th4));
                                                    return;
                                                }
                                            }
                                        } else {
                                            transferListener.onFailed(new Exception("Session id not match"));
                                            try {
                                                bufferedInputStream.close();
                                                pipedInputStream.close();
                                                pipedOutputStream.close();
                                                return;
                                            } catch (Throwable th5) {
                                                Debug.fi(h, Intrinsics.stringPlus(str, th5));
                                                return;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                    th = th;
                                    try {
                                        bufferedInputStream.close();
                                        pipedInputStream.close();
                                        pipedOutputStream.close();
                                        throw th;
                                    } catch (Throwable th7) {
                                        Debug.fi(h, Intrinsics.stringPlus(str, th7));
                                        throw th;
                                    }
                                }
                                Debug.fi(h, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i2)));
                            } else {
                                str3 = str2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str = str2;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str = str3;
                    }
                } else {
                    str2 = str3;
                    if (pipedInputStream.available() < chunkSize) {
                    }
                    bArr = new byte[chunkSize];
                    intRef = new Ref.IntRef();
                    i2 = pipedInputStream.read(bArr, 0, chunkSize);
                    intRef.element = i2;
                    if (i2 < 1) {
                        if (pipedInputStream.available() <= 0) {
                            i3 = i6;
                        } else {
                            i3 = i6;
                        }
                        i5 = (i5 + 1) % 256;
                        Request.Command commandWithByte2 = FileTransferCommand.TransferDataCommand.INSTANCE.withByte(i3).withByte(b2);
                        if (i6 != 0) {
                            bArrNumberToBytes = GattUtils.numberToBytes(alreadyTransferSize, 4);
                            i6 = 0;
                        } else {
                            bArrNumberToBytes = new byte[0];
                        }
                        zipCompress = zipCompress2;
                        ackResponse = (AckResponse) ModuleResultKt.peel(new AckCodec().decode(this.module.sendRequest(new ModuleRequest(commandWithByte2.withBytes(bArrNumberToBytes).withByte(i5).withShort(intRef.element).withBytes(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, intRef.element - 1))), IncreasePredict.INSTANCE, 0L, null, false, 12, null))));
                        Debug.fi(h, Intrinsics.stringPlus("ack:", ackResponse));
                        if (ackResponse == null) {
                            transferListener.onFailed(new Exception("Send file data failed"));
                            bufferedInputStream.close();
                            pipedInputStream.close();
                            pipedOutputStream.close();
                            return;
                        }
                        str = str2;
                        if (ackResponse.getSessionID() == AuthModuleKt.toUnSignInt(b2)) {
                            transferListener.onFailed(new Exception("Session id not match"));
                            bufferedInputStream.close();
                            pipedInputStream.close();
                            pipedOutputStream.close();
                            return;
                        }
                        if (ackResponse.getCode() == 0) {
                            transferListener.onFailed(new Exception(Intrinsics.stringPlus("Send data error:", Integer.valueOf(ackResponse.getCode()))));
                            bufferedInputStream.close();
                            pipedInputStream.close();
                            pipedOutputStream.close();
                            return;
                        }
                        alreadyTransferSize += (long) intRef.element;
                        if (pipedInputStream.available() != 0) {
                        }
                        zipCompress2 = zipCompress;
                        str3 = str;
                        th = th;
                        bufferedInputStream.close();
                        pipedInputStream.close();
                        pipedOutputStream.close();
                        throw th;
                    }
                    Debug.fi(h, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i2)));
                }
                str = str2;
                break;
            } catch (Throwable th10) {
                th = th10;
                str = str3;
            }
        }
        try {
            bufferedInputStream.close();
            pipedInputStream.close();
            pipedOutputStream.close();
        } catch (Throwable th11) {
            Debug.fi(h, Intrinsics.stringPlus(str, th11));
        }
        Debug.fi(h, "transfer finished");
        transferListener.onCompleted();
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    @WorkerThread
    public boolean startReceiveFile(@NotNull TransferResponse response) {
        return ((Boolean) d.b(null, new c(FileTransferCommand.TransferResponseCommand.INSTANCE.withByte(response.getSessionID()).withByte(response.getErrorCode()).withInt(response.getAlreadyTransferSize()), null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    public void unregisterTransferListener(@NotNull IFileTransfer transferListener) {
        for (Object obj : this.transferListeners) {
            if (Intrinsics.areEqual(((WeakReference) obj).get(), transferListener)) {
                Set<WeakReference<IFileTransfer>> set = this.transferListeners;
                Objects.requireNonNull(set, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                TypeIntrinsics.asMutableCollection(set).remove((WeakReference) obj);
                this.module.unregisterDeviceRequestHandler(this.deviceRequestHandler);
            }
        }
        obj = null;
        Set<WeakReference<IFileTransfer>> set2 = this.transferListeners;
        Objects.requireNonNull(set2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        TypeIntrinsics.asMutableCollection(set2).remove((WeakReference) obj);
        this.module.unregisterDeviceRequestHandler(this.deviceRequestHandler);
    }
}
