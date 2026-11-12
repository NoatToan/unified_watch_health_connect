package defpackage;

import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferModule;
import com.huami.core.device.feature.compress.impl.ZipCompress;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0017J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¨\u0006\u001a"}, d2 = {"Lja;", "Lea;", "Laa;", "fileInfo", "Lqp;", "transferListener", "", "withCompress", "", PluginDeviceInfo.FMODEL, "Lfv;", com.xiaomi.onetrack.api.b.I, "Lba;", Packet.ACK, "Lth;", PluginDeviceInfo.FDESC, "", "data", PluginDeviceInfo.FICONON, "bytes", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;", RnReportConst.ApiReport.PARAM_MODULE, "Lna;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferModule;Lna;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ja implements ea {

    @NotNull
    public static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FileTransferModule f22570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FileTransferProtocolVersion f22571b;

    @NotNull
    public final g7 c;

    @NotNull
    public final Set<WeakReference<th>> d;
    public byte e;

    @Nullable
    public FileRequestInfo f;

    @Nullable
    public c5 g;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lja$a;", "", "", "COMPRESS_THRESHOLD_SIZE", "I", "FLAG_COMPRESS", "FLAG_NO_COMPRESS", "PIPE_SIZE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
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
            super(1, obj, ja.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ja) this.receiver).c(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ja$c", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferCompressImpl$fileDataPacketAck$1", f = "FileTransferCompressImpl.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
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
            return ja.this.new d(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileTransferModule fileTransferModule = ja.this.f22570a;
                byte[] f34884a = this.v.getF34884a();
                this.t = 1;
                obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(fileTransferModule, f34884a, 0, false, this, 2, null);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferCompressImpl$startReceiveFile$1", f = "FileTransferCompressImpl.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
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
            return ja.this.new e(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FileTransferModule fileTransferModule = ja.this.f22570a;
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

    public ja(@NotNull FileTransferModule module, @NotNull FileTransferProtocolVersion version) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f22570a = module;
        this.f22571b = version;
        g7 g7Var = new g7(new b(this), new c());
        this.c = g7Var;
        module.registerDeviceRequestHandler(g7Var);
        this.d = new LinkedHashSet();
    }

    public final void b(byte[] bytes) {
        FileRequestInfo fileRequestInfoA = FileRequestInfo.h.a(bytes);
        this.f = fileRequestInfoA;
        if (fileRequestInfoA != null && fileRequestInfoA.getF() == 1) {
            FileRequestInfo fileRequestInfo = this.f;
            this.g = new ZipCompress(fileRequestInfo != null ? fileRequestInfo.getG() : 8096);
        }
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            th thVar = (th) ((WeakReference) it.next()).get();
            if (thVar != null) {
                FileRequestInfo fileRequestInfo2 = this.f;
                Intrinsics.checkNotNull(fileRequestInfo2);
                thVar.a(fileRequestInfo2);
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
        c5 c5Var;
        w2 w2Var = new w2(null, 0, 3, null);
        w2Var.a(bytes);
        int iC = w2Var.c();
        int iC2 = w2Var.c();
        int i = iC & 1;
        int iB = i > 0 ? w2.b(w2Var, 0, 1, null) : 0;
        int iC3 = w2Var.c();
        int iC4 = w2Var.c(2);
        boolean z = ((iC >> 1) & 1) > 0;
        byte[] bArrA = w2Var.a(iC4);
        t5t.d("FileTransferImplV2", "Raw:" + bArrA.length);
        FileRequestInfo fileRequestInfo = this.f;
        if (fileRequestInfo != null && fileRequestInfo.getF() == 1 && ((c5Var = this.g) == null || (bArrA = c5Var.a(bArrA, z)) == null)) {
            bArrA = new byte[0];
        }
        byte[] bArr = bArrA;
        t5t.d("FileTransferImplV2", "Raw decode:" + bArr.length);
        FileTransferPacket fileTransferPacket = new FileTransferPacket(iC2, iC3, bArr, z, i > 0, 0, iB);
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            th thVar = (th) ((WeakReference) it.next()).get();
            if (thVar != null) {
                thVar.a(fileTransferPacket);
            }
        }
    }

    @Override // defpackage.ea
    public void b(@NotNull th transferListener) {
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        for (Object obj : this.d) {
            if (Intrinsics.areEqual(((WeakReference) obj).get(), transferListener)) {
                TypeIntrinsics.asMutableCollection(this.d).remove((WeakReference) obj);
                this.f22570a.unregisterDeviceRequestHandler(this.c);
            }
        }
        obj = null;
        TypeIntrinsics.asMutableCollection(this.d).remove((WeakReference) obj);
        this.f22570a.unregisterDeviceRequestHandler(this.c);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0329 A[Catch: all -> 0x02df, TRY_ENTER, TryCatch #8 {all -> 0x02df, blocks: (B:85:0x02a9, B:87:0x02b3, B:95:0x02e1, B:97:0x02e7, B:103:0x0329, B:105:0x0333), top: B:136:0x02a9 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x019d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d8 A[Catch: all -> 0x029f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x029f, blocks: (B:48:0x019f, B:54:0x01b2, B:59:0x01d8, B:66:0x01eb, B:73:0x020c, B:75:0x0273, B:72:0x020a), top: B:137:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa A[Catch: all -> 0x0164, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0164, blocks: (B:31:0x0145, B:33:0x014c, B:38:0x016c, B:42:0x0181, B:50:0x01a5, B:57:0x01c3, B:61:0x01de, B:69:0x01fa, B:43:0x0189), top: B:123:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0207  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02e1 A[Catch: all -> 0x02df, TRY_ENTER, TryCatch #8 {all -> 0x02df, blocks: (B:85:0x02a9, B:87:0x02b3, B:95:0x02e1, B:97:0x02e7, B:103:0x0329, B:105:0x0333), top: B:136:0x02a9 }] */
    @Override // defpackage.ea
    public void a(@NotNull FileInfo fileInfo, @NotNull qp transferListener, boolean withCompress) throws Throwable {
        String str;
        Throwable th;
        String str2;
        byte[] bArr;
        Ref.IntRef intRef;
        int i;
        int i2;
        int i3;
        byte[] bArrR;
        AckResponse ackResponse;
        String str3 = "Clean up exception:";
        Intrinsics.checkNotNullParameter(fileInfo, "fileInfo");
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        byte b2 = this.e;
        this.e = (byte) (b2 + 1);
        File file = new File(fileInfo.getFilePath());
        if (!file.exists()) {
            transferListener.a(new Exception("File not exist"));
            return;
        }
        int i4 = (!withCompress || file.length() < 204800) ? 0 : 1;
        String url = fileInfo.getUrl();
        String fileName = file.getName();
        long length = file.length();
        long jA = f3.a(fileInfo.getFilePath());
        jq.a aVarWithString = ia.d.f20925b.withByte(r0.a(b2)).withString(url);
        Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
        int i5 = 4096;
        TransferResponse transferResponse = (TransferResponse) C3621pl.a(new oa().a(this.f22570a.sendRequest(new nl(aVarWithString.withString(fileName).withInt((int) length).withInt((int) jA).withByte(i4).withInt(4096), mj.t, 0L, null, false, 28, null))));
        if (transferResponse == null) {
            transferListener.a(new Exception("Start transfer no response"));
            return;
        }
        t5t.d("FileTransferImplV2", "Start transfer response:" + transferResponse);
        if (transferResponse.getErrorCode() != 0) {
            transferListener.a(new Exception("Start transfer error with code:" + transferResponse.getErrorCode()));
            transferListener.a(transferResponse.getErrorCode());
            return;
        }
        int chunkSize = this.f22571b.getChunkSize();
        long alreadyTransferSize = transferResponse.getAlreadyTransferSize();
        transferListener.onStart();
        if (alreadyTransferSize == length) {
            transferListener.a();
            return;
        }
        ZipCompress zipCompress = new ZipCompress(4096);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        bufferedInputStream.skip(alreadyTransferSize);
        PipedInputStream pipedInputStream = new PipedInputStream(65536);
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        pipedOutputStream.connect(pipedInputStream);
        int i6 = -1;
        int i7 = 1;
        while (true) {
            try {
                if (pipedInputStream.available() < chunkSize) {
                    try {
                        if (bufferedInputStream.available() > 0) {
                            byte[] bArr2 = new byte[i5];
                            str2 = str3;
                            try {
                                int i8 = bufferedInputStream.read(bArr2, 0, i5);
                                if (i8 < 1) {
                                    t5t.d("FileTransferImplV2", "read firmware data size:" + i8);
                                } else if (i4 == 0) {
                                    pipedOutputStream.write(ArraysKt___ArraysKt.sliceArray(bArr2, new IntRange(0, i8 - 1)));
                                } else {
                                    pipedOutputStream.write(zipCompress.compress(ArraysKt___ArraysKt.sliceArray(bArr2, new IntRange(0, i8 - 1)), bufferedInputStream.available() <= 0));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                str = str2;
                                try {
                                    bufferedInputStream.close();
                                    pipedInputStream.close();
                                    pipedOutputStream.close();
                                    throw th;
                                } catch (Throwable th3) {
                                    t5t.d("FileTransferImplV2", str + th3);
                                    throw th;
                                }
                            }
                        } else {
                            str2 = str3;
                        }
                        try {
                            if (pipedInputStream.available() < chunkSize || bufferedInputStream.available() <= 0) {
                                bArr = new byte[chunkSize];
                                intRef = new Ref.IntRef();
                                i = pipedInputStream.read(bArr, 0, chunkSize);
                                intRef.element = i;
                                if (i < 1) {
                                    t5t.d("FileTransferImplV2", "read firmware data size:" + intRef.element);
                                } else {
                                    if (pipedInputStream.available() <= 0 || bufferedInputStream.available() > 0) {
                                        i2 = i7;
                                    } else {
                                        i2 = i7 | 2;
                                    }
                                    i3 = (i6 + 1) % 256;
                                    jq.a aVarWithByte = ia.c.f20924b.withByte(i2).withByte(b2);
                                    if (i7 != 0) {
                                        i7 = 0;
                                        bArrR = tet.r(alreadyTransferSize, 4);
                                    } else {
                                        bArrR = new byte[0];
                                    }
                                    Intrinsics.checkNotNullExpressionValue(bArrR, "if (isFirst) {\n         …                        }");
                                    ackResponse = (AckResponse) C3621pl.a(new g().a(this.f22570a.sendRequest(new nl(aVarWithByte.withBytes(bArrR).withByte(i3).withShort(intRef.element).withBytes(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, intRef.element - 1))), mj.t, CreateRouteLoadingFragment.ROUTE_LOADING_DURATION, null, false, 8, null))));
                                    t5t.d("FileTransferImplV2", "ack:" + ackResponse);
                                    if (ackResponse == null) {
                                        transferListener.a(new Exception("Send file data failed"));
                                        try {
                                            bufferedInputStream.close();
                                            pipedInputStream.close();
                                            pipedOutputStream.close();
                                            return;
                                        } catch (Throwable th4) {
                                            t5t.d("FileTransferImplV2", str2 + th4);
                                            return;
                                        }
                                    }
                                    str = str2;
                                    try {
                                        if (ackResponse.getSessionID() != r0.a(b2)) {
                                            transferListener.a(new Exception("Session id not match"));
                                            transferListener.a(4);
                                            try {
                                                bufferedInputStream.close();
                                                pipedInputStream.close();
                                                pipedOutputStream.close();
                                                return;
                                            } catch (Throwable th5) {
                                                t5t.d("FileTransferImplV2", str + th5);
                                                return;
                                            }
                                        }
                                        if (ackResponse.getCode() != 0) {
                                            transferListener.a(new Exception("Send data error:" + ackResponse.getCode()));
                                            transferListener.a(ackResponse.getCode());
                                            try {
                                                bufferedInputStream.close();
                                                pipedInputStream.close();
                                                pipedOutputStream.close();
                                                return;
                                            } catch (Throwable th6) {
                                                t5t.d("FileTransferImplV2", str + th6);
                                                return;
                                            }
                                        }
                                        alreadyTransferSize += (long) intRef.element;
                                        if (pipedInputStream.available() != 0 && bufferedInputStream.available() == 0) {
                                            break;
                                        }
                                        str3 = str;
                                        zipCompress = zipCompress;
                                        i6 = i3;
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                    th = th;
                                    bufferedInputStream.close();
                                    pipedInputStream.close();
                                    pipedOutputStream.close();
                                    throw th;
                                }
                            } else {
                                str3 = str2;
                            }
                            i5 = 4096;
                        } catch (Throwable th8) {
                            th = th8;
                            str = str2;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str2 = str3;
                    }
                } else {
                    str2 = str3;
                    if (pipedInputStream.available() < chunkSize) {
                    }
                    bArr = new byte[chunkSize];
                    intRef = new Ref.IntRef();
                    i = pipedInputStream.read(bArr, 0, chunkSize);
                    intRef.element = i;
                    if (i < 1) {
                        t5t.d("FileTransferImplV2", "read firmware data size:" + intRef.element);
                    } else {
                        if (pipedInputStream.available() <= 0) {
                            i2 = i7;
                        } else {
                            i2 = i7;
                        }
                        i3 = (i6 + 1) % 256;
                        jq.a aVarWithByte2 = ia.c.f20924b.withByte(i2).withByte(b2);
                        if (i7 != 0) {
                            i7 = 0;
                            bArrR = tet.r(alreadyTransferSize, 4);
                        } else {
                            bArrR = new byte[0];
                        }
                        Intrinsics.checkNotNullExpressionValue(bArrR, "if (isFirst) {\n         …                        }");
                        ackResponse = (AckResponse) C3621pl.a(new g().a(this.f22570a.sendRequest(new nl(aVarWithByte2.withBytes(bArrR).withByte(i3).withShort(intRef.element).withBytes(ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, intRef.element - 1))), mj.t, CreateRouteLoadingFragment.ROUTE_LOADING_DURATION, null, false, 8, null))));
                        t5t.d("FileTransferImplV2", "ack:" + ackResponse);
                        if (ackResponse == null) {
                            transferListener.a(new Exception("Send file data failed"));
                            bufferedInputStream.close();
                            pipedInputStream.close();
                            pipedOutputStream.close();
                            return;
                        }
                        str = str2;
                        if (ackResponse.getSessionID() != r0.a(b2)) {
                            transferListener.a(new Exception("Session id not match"));
                            transferListener.a(4);
                            bufferedInputStream.close();
                            pipedInputStream.close();
                            pipedOutputStream.close();
                            return;
                        }
                        if (ackResponse.getCode() != 0) {
                            transferListener.a(new Exception("Send data error:" + ackResponse.getCode()));
                            transferListener.a(ackResponse.getCode());
                            bufferedInputStream.close();
                            pipedInputStream.close();
                            pipedOutputStream.close();
                            return;
                        }
                        alreadyTransferSize += (long) intRef.element;
                        if (pipedInputStream.available() != 0) {
                        }
                        str3 = str;
                        zipCompress = zipCompress;
                        i6 = i3;
                        i5 = 4096;
                        th = th;
                        bufferedInputStream.close();
                        pipedInputStream.close();
                        pipedOutputStream.close();
                        throw th;
                    }
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
            t5t.d("FileTransferImplV2", str + th11);
        }
        t5t.d("FileTransferImplV2", "transfer finished");
        transferListener.a();
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
