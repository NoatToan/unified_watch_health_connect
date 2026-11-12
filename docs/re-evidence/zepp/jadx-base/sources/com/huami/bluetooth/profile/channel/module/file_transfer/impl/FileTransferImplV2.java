package com.huami.bluetooth.profile.channel.module.file_transfer.impl;

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
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.CRCUtilsKt;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0016H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0019\u0010#\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160%0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/impl/FileTransferImplV2;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApi;", "", "data", "", "c", HTTP.CONTENT_RANGE_BYTES, "b", "a", "Lcom/huami/bluetooth/feature/file_transfer/FileInfo;", "fileInfo", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/PushListener;", "transferListener", "", "withCompress", "sendFile", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/TransferResponse;", AbstractJSONTokenResponse.RESPONSE, "startReceiveFile", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FilePacketResponse;", "ack", "fileDataPacketAck", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/IFileTransfer;", "registerTransferListener", "unregisterTransferListener", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;", "version", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "getDeviceRequestHandler", "()Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "deviceRequestHandler", "", "Ljava/lang/ref/WeakReference;", GoogleApiAvailabilityLight.a, "Ljava/util/Set;", "transferListeners", "", "e", "B", SDKConstants.PARAM_SESSION_ID, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileTransferImplV2 implements FileTransferApi {

    @NotNull
    private static final String f = "FileTransferImplV2";

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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(FileTransferImplV2 fileTransferImplV2) {
            super(1, fileTransferImplV2, FileTransferImplV2.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((FileTransferImplV2) this.receiver).c(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV2$fileDataPacketAck$1", f = "FileTransferImplV2.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
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
            return FileTransferImplV2.this.new b(this.c, continuation);
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
                FileTransferModule fileTransferModule = FileTransferImplV2.this.module;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV2$startReceiveFile$1", f = "FileTransferImplV2.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
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
            return FileTransferImplV2.this.new c(this.c, continuation);
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
                FileTransferModule fileTransferModule = FileTransferImplV2.this.module;
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

    public FileTransferImplV2(@NotNull FileTransferModule fileTransferModule, @NotNull FileTransferProtocolVersion fileTransferProtocolVersion) {
        this.module = fileTransferModule;
        this.version = fileTransferProtocolVersion;
        DeviceRequestHandler deviceRequestHandler = new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV2$deviceRequestHandler$2
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
        Iterator<T> it2 = this.transferListeners.iterator();
        while (it2.hasNext()) {
            IFileTransfer iFileTransfer = (IFileTransfer) ((WeakReference) it2.next()).get();
            if (iFileTransfer != null) {
                iFileTransfer.onDataPacket(FileTransferPacket.INSTANCE.parseV2(bytes));
            }
        }
    }

    private final void b(byte[] bytes) {
        FileRequestInfo v2 = FileRequestInfo.INSTANCE.parseV2(bytes);
        Iterator<T> it2 = this.transferListeners.iterator();
        while (it2.hasNext()) {
            IFileTransfer iFileTransfer = (IFileTransfer) ((WeakReference) it2.next()).get();
            if (iFileTransfer != null) {
                iFileTransfer.onRequest(v2);
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

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    public void sendFile(@NotNull FileInfo fileInfo, @NotNull PushListener transferListener, boolean withCompress) throws IOException {
        byte[] bArrNumberToBytes;
        int i;
        byte b2 = this.sessionID;
        this.sessionID = (byte) (b2 + 1);
        File file = new File(fileInfo.getFilePath());
        if (!file.exists()) {
            transferListener.onFailed(new Exception("File not exist"));
            return;
        }
        String url = fileInfo.getUrl();
        String name = file.getName();
        long length = file.length();
        TransferResponse transferResponse = (TransferResponse) ModuleResultKt.peel(new FileTransferResponseCodec().decode(this.module.sendRequest(new ModuleRequest(FileTransferCommand.TransferRequestCommand.INSTANCE.withByte(AuthModuleKt.toUnSignInt(b2)).withString(url).withString(name).withInt((int) length).withInt((int) CRCUtilsKt.getCrc32(fileInfo.getFilePath())), IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
        if (transferResponse == null) {
            transferListener.onFailed(new Exception("Start transfer no response"));
            return;
        }
        Debug.fi(f, Intrinsics.stringPlus("Start transfer response:", transferResponse));
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
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        bufferedInputStream.skip(alreadyTransferSize);
        int i2 = -1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            byte[] bArr = new byte[chunkSize];
            int i5 = bufferedInputStream.read(bArr, 0, chunkSize);
            if (i5 < i3) {
                Debug.fi(f, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i5)));
                transferListener.onCompleted();
                return;
            }
            int i6 = i4;
            long j = ((long) i5) + alreadyTransferSize;
            i2 = (i2 + 1) % 256;
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            Request.Command commandWithByte = FileTransferCommand.TransferDataCommand.INSTANCE.withByte(j == length ? i6 | 2 : i6).withByte(b2);
            if (i6 != 0) {
                bArrNumberToBytes = GattUtils.numberToBytes(alreadyTransferSize, 4);
                i = 0;
            } else {
                bArrNumberToBytes = new byte[0];
                i = i6;
            }
            AckResponse ackResponse = (AckResponse) ModuleResultKt.peel(new AckCodec().decode(this.module.sendRequest(new ModuleRequest(commandWithByte.withBytes(bArrNumberToBytes).withByte(i2).withShort(i5).withBytes(bArr), IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
            Debug.fi(f, Intrinsics.stringPlus("ack:", ackResponse));
            if (ackResponse == null) {
                transferListener.onFailed(new Exception("Send file data failed"));
                return;
            }
            if (ackResponse.getSessionID() != AuthModuleKt.toUnSignInt(b2)) {
                transferListener.onFailed(new Exception("Session id not match"));
                return;
            } else {
                if (ackResponse.getCode() != 0) {
                    transferListener.onFailed(new Exception(Intrinsics.stringPlus("Send data error:", Integer.valueOf(ackResponse.getCode()))));
                    return;
                }
                bufferedInputStream = bufferedInputStream2;
                alreadyTransferSize = j;
                i4 = i;
                i3 = 1;
            }
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
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
