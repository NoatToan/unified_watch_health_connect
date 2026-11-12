package com.huami.bluetooth.profile.channel.module.file_transfer.impl;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.feature.file_transfer.FileInfo;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
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
import java.util.Iterator;
import java.util.LinkedHashSet;
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
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0016H\u0016R\u0019\u0010\u001d\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/impl/FileTransferImplV1;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApi;", "", "data", "", "c", HTTP.CONTENT_RANGE_BYTES, "b", "a", "Lcom/huami/bluetooth/feature/file_transfer/FileInfo;", "fileInfo", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/PushListener;", "transferListener", "", "withCompress", "sendFile", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/TransferResponse;", AbstractJSONTokenResponse.RESPONSE, "startReceiveFile", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FilePacketResponse;", "ack", "fileDataPacketAck", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/IFileTransfer;", "registerTransferListener", "unregisterTransferListener", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "getModule", "()Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", "module", "", "Ljava/util/Set;", "transferListeners", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileTransferImplV1 implements FileTransferApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FileTransferModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Set<IFileTransfer> transferListeners;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(FileTransferImplV1 fileTransferImplV1) {
            super(1, fileTransferImplV1, FileTransferImplV1.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) throws Exception {
            ((FileTransferImplV1) this.receiver).c(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) throws Exception {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV1$fileDataPacketAck$1", f = "FileTransferImplV1.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
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
            return FileTransferImplV1.this.new b(this.c, continuation);
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
                FileTransferModule module = FileTransferImplV1.this.getModule();
                byte[] bArr = this.c.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(module, bArr, 0, false, this, 6, null);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV1$startReceiveFile$1", f = "FileTransferImplV1.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
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
            return FileTransferImplV1.this.new c(this.c, continuation);
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
                FileTransferModule module = FileTransferImplV1.this.getModule();
                byte[] bArr = this.c.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(module, bArr, 0, false, this, 6, null);
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

    public FileTransferImplV1(@NotNull FileTransferModule fileTransferModule) {
        this.module = fileTransferModule;
        fileTransferModule.registerDeviceRequestHandler(new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV1.2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return true;
            }
        }));
        this.transferListeners = new LinkedHashSet();
    }

    private final void a(byte[] bytes) {
        Iterator<T> it2 = this.transferListeners.iterator();
        while (it2.hasNext()) {
            ((IFileTransfer) it2.next()).onDataPacket(FileTransferPacket.INSTANCE.parse(bytes));
        }
    }

    private final void b(byte[] bytes) throws Exception {
        FileRequestInfo v1 = FileRequestInfo.INSTANCE.parseV1(bytes);
        Iterator<T> it2 = this.transferListeners.iterator();
        while (it2.hasNext()) {
            ((IFileTransfer) it2.next()).onRequest(v1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(byte[] data) throws Exception {
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
    public final FileTransferModule getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    public void registerTransferListener(@NotNull IFileTransfer transferListener) {
        this.transferListeners.add(transferListener);
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    public void sendFile(@NotNull FileInfo fileInfo, @NotNull PushListener transferListener, boolean withCompress) {
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    public boolean startReceiveFile(@NotNull TransferResponse response) {
        return ((Boolean) d.b(null, new c(FileTransferCommand.TransferResponseCommand.INSTANCE.withByte(response.getSessionID()).withByte(response.getErrorCode()), null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferApi
    public void unregisterTransferListener(@NotNull IFileTransfer transferListener) {
        this.transferListeners.remove(transferListener);
    }
}
