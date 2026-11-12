package defpackage;

import com.huami.bluetooth.profile.channel.module.BuiltInModule;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J0\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001b\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0002R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lu3;", "Ld1;", "", "flag", "sessionId", "packetIndex", "totalSize", RnReportConst.ApiReport.PARAM_MODULE, "", "data", "Lz3;", PluginDeviceInfo.FMODEL, "byteArray", PluginDeviceInfo.FICONON, Constants.EXTRA_SESSION_ID, "code", "index", "j", "", "Ll4;", "request", "", "(Ll4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moduleId", PluginDeviceInfo.FDESC, "Lo4;", "version", "Lo4;", "getVersion", "()Lo4;", "Lh9;", "encryptApi$delegate", "Lkotlin/Lazy;", Constant.KeyValue.KEY_COLUMN, "()Lh9;", "encryptApi", "Lq3;", "channel", "Lw3;", "channelCallbackHolder", q.f13858b, "<init>", "(Lq3;Lw3;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class u3 extends d1 {

    @NotNull
    public static final a G = new a(null);

    @NotNull
    public final Lazy D;

    @NotNull
    public final ChannelVersion E;

    @NotNull
    public final Mutex F;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lu3$a;", "", "", "FIRST_PACKET_HEADER_SIZE", "I", "REPLY_BYTE_LEN", "SUBSEQUENT_PACKET_HEADER_SIZE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li9;", PluginDeviceInfo.FMODEL, "()Li9;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<i9> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i9 invoke() {
            return new i9(u3.this.a());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lgu;", "it", "", PluginDeviceInfo.FMODEL, "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function1<Map.Entry<? extends Integer, ? extends SupportModuleInfo>, CharSequence> {
        public static final c t = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke2(@NotNull Map.Entry<Integer, SupportModuleInfo> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue().toString();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.ChannelApiImpl2", f = "ChannelApiImpl2.kt", i = {0, 0, 0, 1}, l = {149, 102}, m = "transport", n = {"this", "request", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class d extends ContinuationImpl {
        public Object t;
        public Object u;
        public Object v;
        public /* synthetic */ Object w;
        public int y;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return u3.this.a((l4) null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(@NotNull q3 channel, @NotNull w3 channelCallbackHolder, int i) {
        super(channel, channelCallbackHolder, i);
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(channelCallbackHolder, "channelCallbackHolder");
        this.D = LazyKt__LazyJVMKt.lazy(new b());
        this.E = channel.c();
        this.F = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // defpackage.d1
    @NotNull
    public z3 a(int flag, int sessionId, int packetIndex, int totalSize, int module, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (flag & 1) > 0 ? new cb(flag, sessionId, packetIndex, totalSize, module, data, getV()) : new z3(flag, sessionId, packetIndex, data, getV());
    }

    public final boolean b(int moduleId) {
        SupportModuleInfo supportModuleInfo;
        Set<Map.Entry<Integer, SupportModuleInfo>> setEntrySet;
        if (!Intrinsics.areEqual(getE().getEncryptEnable(), Boolean.TRUE)) {
            return false;
        }
        Map<Integer, SupportModuleInfo> map = BuiltInModule.INSTANCE.a().get(a());
        StringBuilder sb = new StringBuilder();
        sb.append("Cached module list:");
        sb.append((map == null || (setEntrySet = map.entrySet()) == null) ? null : CollectionsKt___CollectionsKt.joinToString$default(setEntrySet, ", ", null, null, 0, null, c.t, 30, null));
        t5t.d("ChannelApi", sb.toString());
        if (map == null || map.isEmpty() || (supportModuleInfo = map.get(Integer.valueOf(moduleId))) == null) {
            return false;
        }
        return supportModuleInfo.getRequireEncryption();
    }

    @Override // defpackage.d1
    public int c() {
        return 11;
    }

    @Override // defpackage.d1, defpackage.r3
    @NotNull
    /* JADX INFO: renamed from: getVersion, reason: from getter */
    public ChannelVersion getE() {
        return this.E;
    }

    @Override // defpackage.d1
    public int j() {
        return 5;
    }

    public final h9 k() {
        return (h9) this.D.getValue();
    }

    @Override // defpackage.d1
    @NotNull
    public z3 c(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        try {
            Result.Companion companion = Result.Companion;
            int i = byteArray[2] & 255;
            if (i == getV()) {
                return z3.f.c(v3.b(byteArray, 2));
            }
            t5t.d("ChannelApi", "Packet(" + i + ") not for this app(" + getV() + ')');
            return z3.f.a();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
                objM886constructorimpl = z3.f.a();
            }
            return (z3) objM886constructorimpl;
        }
    }

    @Override // defpackage.d1
    @NotNull
    public byte[] a(int module, int sessionID, int code, int index) {
        return new byte[]{(byte) module, (byte) getV(), (byte) sessionID, (byte) code, (byte) index};
    }

    @Override // defpackage.d1
    public void a(int sessionID, int flag, int module, @NotNull byte[] data, int totalSize) throws InterruptedException {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(data, "data");
        if ((flag & 8) == 0) {
            super.a(sessionID, flag, module, data, totalSize);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            a(sessionID, module, ArraysKt___ArraysKt.sliceArray(k().a(sessionID, totalSize, data), new IntRange(0, totalSize - 1)));
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("ChannelApi", "Handle encrypt data failed:" + thM889exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.d1, defpackage.r3
    @Nullable
    public Object a(@NotNull l4 l4Var, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        d dVar;
        l4 l4Var2;
        Mutex mutex;
        u3 u3Var;
        Object objM886constructorimpl;
        Mutex mutex2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.y = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objA = dVar.w;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.y;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objA);
                    Mutex mutex3 = this.F;
                    dVar.t = this;
                    l4Var2 = l4Var;
                    dVar.u = l4Var2;
                    dVar.v = mutex3;
                    dVar.y = 1;
                    if (mutex3.lock(null, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex3;
                    u3Var = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) dVar.t;
                        try {
                            ResultKt.throwOnFailure(objA);
                            Boolean boolBoxBoolean = Boxing.boxBoolean(((Boolean) objA).booleanValue());
                            mutex2.unlock(null);
                            return boolBoxBoolean;
                        } catch (Throwable th) {
                            th = th;
                            mutex = mutex2;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    Mutex mutex4 = (Mutex) dVar.v;
                    l4 l4Var3 = (l4) dVar.u;
                    u3Var = (u3) dVar.t;
                    ResultKt.throwOnFailure(objA);
                    mutex = mutex4;
                    l4Var2 = l4Var3;
                }
                Result.Companion companion = Result.Companion;
                if (u3Var.b(l4Var2.getModule())) {
                    byte[] bArrA = u3Var.k().a(l4Var2.getSessionId(), l4Var2.getData());
                    u3Var.k().a();
                    l4Var2 = new l4(l4Var2.getModule(), bArrA, l4Var2.getReplyFreq(), l4Var2.getSessionId(), true, l4Var2.getDataSize(), l4Var2.getData(), false, 128, null);
                }
                objM886constructorimpl = Result.m886constructorimpl(l4Var2);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d("ChannelApi", "组装channel数据包发生异常:" + thM889exceptionOrNullimpl);
            }
            if (Result.m892isFailureimpl(objM886constructorimpl)) {
                objM886constructorimpl = null;
            }
            l4 l4Var4 = (l4) objM886constructorimpl;
            if (l4Var4 == null) {
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                mutex.unlock(null);
                return boolBoxBoolean2;
            }
            dVar.t = mutex;
            dVar.u = null;
            dVar.v = null;
            dVar.y = 2;
            objA = super.a(l4Var4, dVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            Boolean boolBoxBoolean3 = Boxing.boxBoolean(((Boolean) objA).booleanValue());
            mutex2.unlock(null);
            return boolBoxBoolean3;
        } catch (Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
    }
}
