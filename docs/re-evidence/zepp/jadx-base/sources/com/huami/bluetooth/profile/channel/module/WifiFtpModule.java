package com.huami.bluetooth.profile.channel.module;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.schedule.action.IDataCreator;
import com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor;
import com.huami.bluetooth.profile.channel.module.schedule.action.SimpleParseInterceptor;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xmlywind.sdk.common.mta.PointCategory;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteSpreadBuilder;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 6)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u000f\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000f\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rJ\u001e\u0010\u0011\u001a\u00020\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u0010J\u0013\u0010\u0014\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\fJ\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R,\u0010+\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u00100(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WifiFtpModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataCreator;", "Lcom/huami/bluetooth/profile/channel/module/FtpServerStatus;", "status", "", "e", PointCategory.INIT, "", "data", "onReceive", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFtpListener", "Lcom/huami/bluetooth/profile/channel/module/IFTPStatusListener;", "registerListener", "unregisterListener", "", "startServer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "path", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopServer", "sendCmd", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lkotlinx/coroutines/Job;", "g", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lkotlinx/coroutines/Job;", "job", "h", "Lkotlin/jvm/functions/Function1;", "mFtpListener", "", "i", "Ljava/util/List;", "ftpListeners", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", z.j, "c", "()Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "innerInterceptor", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WifiFtpModule extends BaseModule implements CoroutineScope, IDataCreator {

    @NotNull
    private static final String k = "WiFiFtpModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function1<? super FtpServerStatus, Unit> mFtpListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final List<Function1<FtpServerStatus, Unit>> ftpListeners;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy innerInterceptor;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WiFiFtpType.values().length];
            iArr[WiFiFtpType.SERVER_STATUS.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SimpleParseInterceptor> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleParseInterceptor invoke() {
            return new SimpleParseInterceptor(WifiFtpModule.k, null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Job> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WifiFtpModule", f = "WifiFtpModule.kt", i = {0, 0}, l = {103}, m = "sendCmd", n = {"this", "data"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return WifiFtpModule.this.sendCmd(null, this);
        }
    }

    public WifiFtpModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(b.a);
        this.ftpListeners = new ArrayList();
        this.innerInterceptor = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final SimpleParseInterceptor c() {
        return (SimpleParseInterceptor) this.innerInterceptor.getValue();
    }

    private final Job d() {
        return (Job) this.job.getValue();
    }

    private final void e(FtpServerStatus status) {
        Iterator<T> it2 = this.ftpListeners.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(status);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return d().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        super.init();
        Debug.fi(k, "Start wifi ftp module...");
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    @Nullable
    public Object onReceive(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        byte[] bytes;
        c().onReceive(bArr);
        WiFiFtpType wiFiFtpTypeFromValue = WiFiFtpType.INSTANCE.fromValue(ArraysKt___ArraysKt.first(bArr));
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(1, bArr.length - 1));
        if (WhenMappings.$EnumSwitchMapping$0[wiFiFtpTypeFromValue.ordinal()] == 1) {
            byte b2 = bArrSliceArray[0];
            String strSliceString = ModuleUtilsKt.sliceString(bArrSliceArray, 1);
            String strSliceString2 = null;
            if (strSliceString != null && (bytes = strSliceString.getBytes(Charsets.UTF_8)) != null) {
                strSliceString2 = ModuleUtilsKt.sliceString(bArrSliceArray, bytes.length + 2, (bArrSliceArray.length - bytes.length) - 3);
            }
            FtpServerStatus ftpServerStatus = new FtpServerStatus(b2, strSliceString, strSliceString2);
            Function1<? super FtpServerStatus, Unit> function1 = this.mFtpListener;
            if (function1 != null) {
                function1.invoke(ftpServerStatus);
            }
            e(ftpServerStatus);
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataCreator
    public void registerInterceptor(@NotNull IDataInterceptor interceptor) {
        c().registerInterceptor(interceptor);
    }

    public final void registerListener(@NotNull Function1<? super FtpServerStatus, Unit> listener) {
        if (this.ftpListeners.contains(listener)) {
            return;
        }
        this.ftpListeners.add(listener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendCmd(@NotNull byte[] bArr, @NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        WifiFtpModule wifiFtpModule;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.e = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object objSendDataWithResult$default = cVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar2.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            c().onSend(bArr);
            cVar2.a = this;
            cVar2.b = bArr;
            cVar2.e = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArr, 0, false, cVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            wifiFtpModule = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) cVar2.b;
            wifiFtpModule = (WifiFtpModule) cVar2.a;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        wifiFtpModule.c().onFinishSend(bArr, zBooleanValue);
        return Boxing.boxBoolean(zBooleanValue);
    }

    public final void setFtpListener(@Nullable Function1<? super FtpServerStatus, Unit> listener) {
        this.mFtpListener = listener;
    }

    @Nullable
    public final Object startServer(@NotNull Continuation<? super Boolean> continuation) {
        return sendCmd(new byte[]{(byte) WiFiFtpType.START_SERVER.getValue()}, continuation);
    }

    @Nullable
    public final Object stopServer(@NotNull Continuation<? super Boolean> continuation) {
        return sendCmd(new byte[]{(byte) WiFiFtpType.STOP_SERVER.getValue()}, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataCreator
    public void unregisterInterceptor(@NotNull IDataInterceptor interceptor) {
        c().unregisterInterceptor(interceptor);
    }

    public final void unregisterListener(@NotNull Function1<? super FtpServerStatus, Unit> listener) {
        this.ftpListeners.remove(listener);
    }

    @Nullable
    public final Object startServer(@Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        if (str == null) {
            return startServer(continuation);
        }
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        ByteSpreadBuilder byteSpreadBuilder = new ByteSpreadBuilder(3);
        byteSpreadBuilder.add((byte) WiFiFtpType.START_SERVER.getValue());
        byteSpreadBuilder.addSpread(bytes);
        byteSpreadBuilder.add((byte) 0);
        return sendCmd(byteSpreadBuilder.toArray(), continuation);
    }
}
