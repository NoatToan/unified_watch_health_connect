package defpackage;

import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¨\u0006\u001a"}, d2 = {"Lka;", "Lea;", "Laa;", "fileInfo", "Lqp;", "transferListener", "", "withCompress", "", PluginDeviceInfo.FMODEL, "Lfv;", com.xiaomi.onetrack.api.b.I, "Lba;", Packet.ACK, "Lth;", PluginDeviceInfo.FDESC, "", "data", PluginDeviceInfo.FICONON, "bytes", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", RnReportConst.ApiReport.PARAM_MODULE, "Lna;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;Lna;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ka implements ea {

    @NotNull
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FileTransferModule f23646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FileTransferProtocolVersion f23647b;

    @NotNull
    public final g7 c;

    @NotNull
    public final Set<WeakReference<th>> d;
    public byte e;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lka$a;", "", "", "SEND_PACKET_TIMEOUT", "J", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public b(Object obj) {
            super(1, obj, ka.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ka) this.receiver).c(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ka$c", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV2$fileDataPacketAck$1", f = "FileTransferImplV2.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ jq.a v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(jq.a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.v = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ka.this.new d(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileTransferModule fileTransferModule = ka.this.f23646a;
                byte[] f34884a = this.v.getF34884a();
                this.t = 1;
                obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(fileTransferModule, f34884a, 0, false, this, 6, null);
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV2$startReceiveFile$1", f = "FileTransferImplV2.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ jq.a v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(jq.a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.v = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ka.this.new e(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileTransferModule fileTransferModule = ka.this.f23646a;
                byte[] f34884a = this.v.getF34884a();
                this.t = 1;
                obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(fileTransferModule, f34884a, 0, false, this, 6, null);
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

    public ka(@NotNull FileTransferModule module, @NotNull FileTransferProtocolVersion version) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f23646a = module;
        this.f23647b = version;
        g7 g7Var = new g7(new b(this), new c());
        this.c = g7Var;
        module.registerDeviceRequestHandler(g7Var);
        this.d = new LinkedHashSet();
    }

    public final void b(byte[] bytes) {
        FileRequestInfo fileRequestInfoA = FileRequestInfo.h.a(bytes);
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            th thVar = (th) ((WeakReference) it.next()).get();
            if (thVar != null) {
                thVar.a(fileRequestInfoA);
            }
        }
    }

    public final void c(byte[] data) {
        byte bFirst = ArraysKt___ArraysKt.first(data);
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(data, new IntRange(1, data.length - 1));
        if (bFirst == ia.d.f20925b.getF20921a()) {
            b(bArrSliceArray);
        } else if (bFirst == ia.c.f20924b.getF20921a()) {
            a(bArrSliceArray);
        }
    }

    public final void a(byte[] bytes) {
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            th thVar = (th) ((WeakReference) it.next()).get();
            if (thVar != null) {
                thVar.a(FileTransferPacket.h.a(bytes));
            }
        }
    }

    @Override // defpackage.ea
    public void b(@NotNull th transferListener) {
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        for (Object obj : this.d) {
            if (Intrinsics.areEqual(((WeakReference) obj).get(), transferListener)) {
                TypeIntrinsics.asMutableCollection(this.d).remove((WeakReference) obj);
                this.f23646a.unregisterDeviceRequestHandler(this.c);
            }
        }
        obj = null;
        TypeIntrinsics.asMutableCollection(this.d).remove((WeakReference) obj);
        this.f23646a.unregisterDeviceRequestHandler(this.c);
    }

    @Override // defpackage.ea
    public void a(@NotNull FileInfo fileInfo, @NotNull qp transferListener, boolean withCompress) throws IOException {
        byte[] bArrR;
        Intrinsics.checkNotNullParameter(fileInfo, "fileInfo");
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        byte b2 = this.e;
        this.e = (byte) (b2 + 1);
        File file = new File(fileInfo.getFilePath());
        if (!file.exists()) {
            transferListener.a(new Exception("File not exist"));
            transferListener.a(-2);
            return;
        }
        String url = fileInfo.getUrl();
        String fileName = file.getName();
        long length = file.length();
        long jA = f3.a(fileInfo.getFilePath());
        jq.a aVarWithString = ia.d.f20925b.withByte(r0.a(b2)).withString(url);
        Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
        TransferResponse transferResponse = (TransferResponse) C3621pl.a(new oa().a(this.f23646a.sendRequest(new nl(aVarWithString.withString(fileName).withInt((int) length).withInt((int) jA), mj.t, 0L, null, false, 28, null))));
        if (transferResponse == null) {
            transferListener.a(new Exception("Start transfer no response"));
            transferListener.a(-3);
            return;
        }
        t5t.d("FileTransferImplV2", "Start transfer response:" + transferResponse);
        if (transferResponse.getErrorCode() != 0) {
            transferListener.a(new Exception("Start transfer error with code:" + transferResponse.getErrorCode()));
            transferListener.a(transferResponse.getErrorCode());
            return;
        }
        int chunkSize = this.f23647b.getChunkSize();
        long alreadyTransferSize = transferResponse.getAlreadyTransferSize();
        transferListener.onStart();
        if (alreadyTransferSize == length) {
            transferListener.a();
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        bufferedInputStream.skip(alreadyTransferSize);
        int i = 1;
        int i2 = -1;
        int i3 = 1;
        while (true) {
            byte[] bArr = new byte[chunkSize];
            int i4 = bufferedInputStream.read(bArr, 0, chunkSize);
            if (i4 < i) {
                t5t.d("FileTransferImplV2", "read firmware data size:" + i4);
                transferListener.a();
                return;
            }
            int i5 = chunkSize;
            long j = ((long) i4) + alreadyTransferSize;
            i2 = (i2 + 1) % 256;
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            jq.a aVarWithByte = ia.c.f20924b.withByte(j == length ? i3 | 2 : i3).withByte(b2);
            if (i3 != 0) {
                bArrR = tet.r(alreadyTransferSize, 4);
                i3 = 0;
            } else {
                bArrR = new byte[0];
            }
            Intrinsics.checkNotNullExpressionValue(bArrR, "if (isFirst) {\n         …f()\n                    }");
            AckResponse ackResponse = (AckResponse) C3621pl.a(new g().a(this.f23646a.sendRequest(new nl(aVarWithByte.withBytes(bArrR).withByte(i2).withShort(i4).withBytes(bArr), mj.t, CreateRouteLoadingFragment.ROUTE_LOADING_DURATION, null, false, 24, null))));
            t5t.d("FileTransferImplV2", "ack:" + ackResponse);
            if (ackResponse == null) {
                transferListener.a(new Exception("Send file data failed"));
                transferListener.a(-4);
                return;
            }
            if (ackResponse.getSessionID() != r0.a(b2)) {
                transferListener.a(new Exception("Session id not match"));
                transferListener.a(4);
                return;
            } else {
                if (ackResponse.getCode() != 0) {
                    transferListener.a(new Exception("Send data error:" + ackResponse.getCode()));
                    transferListener.a(ackResponse.getCode());
                    return;
                }
                bufferedInputStream = bufferedInputStream2;
                alreadyTransferSize = j;
                i = 1;
                chunkSize = i5;
            }
        }
    }

    @Override // defpackage.ea
    public boolean a(@NotNull TransferResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new e(ia.e.f20926b.withByte(response.getSessionID()).withByte(response.getErrorCode()).withInt(response.getAlreadyTransferSize()), null), 1, null)).booleanValue();
    }

    @Override // defpackage.ea
    public boolean a(@NotNull FilePacketResponse ack) {
        Intrinsics.checkNotNullParameter(ack, "ack");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new d(ia.b.f20923b.withByte(ack.getSessionID()).withByte(ack.getErrorCode()), null), 1, null)).booleanValue();
    }

    @Override // defpackage.ea
    public void a(@NotNull th transferListener) {
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        this.d.clear();
        this.d.add(new WeakReference<>(transferListener));
    }
}
