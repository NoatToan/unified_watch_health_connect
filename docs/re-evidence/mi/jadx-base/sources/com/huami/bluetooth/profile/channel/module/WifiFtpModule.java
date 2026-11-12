package com.huami.bluetooth.profile.channel.module;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.FtpServerStatus;
import defpackage.d4;
import defpackage.jh;
import defpackage.ks;
import defpackage.lx;
import defpackage.ql;
import defpackage.r3;
import defpackage.t5t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteSpreadBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u000f\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000f\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rJ\u001e\u0010\u0011\u001a\u00020\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u0010J\u0013\u0010\u0014\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\fJ\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010(\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WifiFtpModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "Ldb;", "status", "", "notifyListeners", "init", "", "data", "onReceive", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFtpListener", "Lcom/huami/bluetooth/profile/channel/module/IFTPStatusListener;", "registerListener", "unregisterListener", "", "startServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "path", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopServer", "sendCmd", "Ljh;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "mFtpListener", "Lkotlin/jvm/functions/Function1;", "", "ftpListeners", "Ljava/util/List;", "Lks;", "innerInterceptor$delegate", "getInnerInterceptor", "()Lks;", "innerInterceptor", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 6)
public final class WifiFtpModule extends a implements CoroutineScope {

    @NotNull
    private static final String TAG = "WiFiFtpModule";

    @NotNull
    private final List<Function1<FtpServerStatus, Unit>> ftpListeners;

    /* JADX INFO: renamed from: innerInterceptor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy innerInterceptor;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private Function1<? super FtpServerStatus, Unit> mFtpListener;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9859a;

        static {
            int[] iArr = new int[lx.values().length];
            try {
                iArr[lx.SERVER_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9859a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lks;", PluginDeviceInfo.FMODEL, "()Lks;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<ks> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ks invoke() {
            return new ks(WifiFtpModule.TAG, null, 2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<CompletableJob> {
        public static final d t = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WifiFtpModule", f = "WifiFtpModule.kt", i = {0, 0}, l = {103}, m = "sendCmd", n = {"this", "data"}, s = {"L$0", "L$1"})
    public static final class e extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return WifiFtpModule.this.sendCmd(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiFtpModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.job = LazyKt__LazyJVMKt.lazy(d.t);
        this.ftpListeners = new ArrayList();
        this.innerInterceptor = LazyKt__LazyJVMKt.lazy(c.t);
    }

    private final ks getInnerInterceptor() {
        return (ks) this.innerInterceptor.getValue();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final void notifyListeners(FtpServerStatus status) {
        Iterator<T> it = this.ftpListeners.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(status);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        t5t.d(TAG, "Start wifi ftp module...");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    @Override // com.huami.bluetooth.profile.channel.module.a
    @Nullable
    public Object onReceive(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        String strA;
        getInnerInterceptor().a(bArr);
        lx lxVarA = lx.u.a(ArraysKt___ArraysKt.first(bArr));
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(1, bArr.length - 1));
        if (b.f9859a[lxVarA.ordinal()] == 1) {
            byte b2 = bArrSliceArray[0];
            String strB = ql.b(bArrSliceArray, 1);
            if (strB != null) {
                byte[] bytes = strB.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                if (bytes != null) {
                    strA = ql.a(bArrSliceArray, bytes.length + 2, (bArrSliceArray.length - bytes.length) - 3);
                } else {
                    strA = null;
                }
            } else {
                strA = null;
            }
            FtpServerStatus ftpServerStatus = new FtpServerStatus(b2, strB, strA);
            Function1<? super FtpServerStatus, Unit> function1 = this.mFtpListener;
            if (function1 != null) {
                function1.invoke2(ftpServerStatus);
            }
            notifyListeners(ftpServerStatus);
        }
        return Unit.INSTANCE;
    }

    public void registerInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        getInnerInterceptor().a(interceptor);
    }

    public final void registerListener(@NotNull Function1<? super FtpServerStatus, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.ftpListeners.contains(listener)) {
            return;
        }
        this.ftpListeners.add(listener);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object sendCmd(@NotNull byte[] bArr, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        WifiFtpModule wifiFtpModule;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.x = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objSendDataWithResult$default = eVar2.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar2.x;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            getInnerInterceptor().b(bArr);
            eVar2.t = this;
            eVar2.u = bArr;
            eVar2.x = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArr, 0, false, eVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            wifiFtpModule = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) eVar2.u;
            wifiFtpModule = (WifiFtpModule) eVar2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        wifiFtpModule.getInnerInterceptor().a(bArr, zBooleanValue);
        return Boxing.boxBoolean(zBooleanValue);
    }

    public final void setFtpListener(@Nullable Function1<? super FtpServerStatus, Unit> listener) {
        this.mFtpListener = listener;
    }

    @Nullable
    public final Object startServer(@NotNull Continuation<? super Boolean> continuation) {
        return sendCmd(new byte[]{(byte) lx.START_SERVER.getT()}, continuation);
    }

    @Nullable
    public final Object stopServer(@NotNull Continuation<? super Boolean> continuation) {
        return sendCmd(new byte[]{(byte) lx.STOP_SERVER.getT()}, continuation);
    }

    public void unregisterInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        getInnerInterceptor().b(interceptor);
    }

    public final void unregisterListener(@NotNull Function1<? super FtpServerStatus, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.ftpListeners.remove(listener);
    }

    @Nullable
    public final Object startServer(@Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        if (str == null) {
            return startServer(continuation);
        }
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset()");
        byte[] bytes = str.getBytes(charsetDefaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ByteSpreadBuilder byteSpreadBuilder = new ByteSpreadBuilder(3);
        byteSpreadBuilder.add((byte) lx.START_SERVER.getT());
        byteSpreadBuilder.addSpread(bytes);
        byteSpreadBuilder.add((byte) 0);
        return sendCmd(byteSpreadBuilder.toArray(), continuation);
    }
}
