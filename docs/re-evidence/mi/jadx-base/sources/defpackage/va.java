package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.smarthome.homeroom.model.Home;
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
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u001b\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0005\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0005\u0010\u0012J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0007\u0010\u0012¨\u0006\u001b"}, d2 = {"Lva;", "Lqft;", "Lbb;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FDESC, "(Lbb;)V", PluginDeviceInfo.FMODEL, "", "()Z", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", PluginDeviceInfo.FICONON, "(Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "Lol;", "", "()Lol;", "byteArray", "([B)V", "", Home.JSON_KEY_ADDRESS, "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule;", RnReportConst.ApiReport.PARAM_MODULE, "", "version", "<init>", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class va implements qft {

    @NotNull
    public static final c y = new c(null);

    @NotNull
    public final String t;

    @NotNull
    public final FindDeviceModule u;
    public final int v;

    @Nullable
    public bb w;

    @Nullable
    public vh x;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, va.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((va) this.receiver).b(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"va$b", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            int iA = r0.a(ArraysKt___ArraysKt.first(byteArray));
            return iA == wa.a.f37750b.getF37749a() || iA == wa.f.f37755b.getF37749a() || iA == ya.f39972b.getF37749a() || iA == xa.f38903b.getF37749a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lva$c;", "", "", "tag", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.find.impl.FindDeviceApiImpl$confirmFindPhone$result$1", f = "FindDeviceApiImpl.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
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
            return va.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindDeviceModule findDeviceModule = va.this.u;
                byte[] f34884a = wa.b.f37751b.withByte(1).getF34884a();
                this.t = 1;
                obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(findDeviceModule, f34884a, 0, false, this, 6, null);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.find.impl.FindDeviceApiImpl$stopFindPhone$result$1", f = "FindDeviceApiImpl.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
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
            return va.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindDeviceModule findDeviceModule = va.this.u;
                byte[] f34884a = wa.c.f37752b.getF34884a();
                this.t = 1;
                obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(findDeviceModule, f34884a, 0, false, this, 6, null);
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

    public va(@NotNull String address, @NotNull FindDeviceModule module, int i) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = address;
        this.u = module;
        this.v = i;
        module.registerDeviceRequestHandler(new g7(new a(this), new b()));
    }

    @Override // defpackage.ta
    public void b(@NotNull bb listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.w = listener;
    }

    @Override // defpackage.ta
    public void c(@NotNull HMCallback<?> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFinish(((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new d(null), 1, null)).booleanValue());
    }

    public final ol<byte[]> b() {
        ol<byte[]> olVarSendRequest = this.u.sendRequest(new nl(wa.d.f37753b, mj.t, 0L, null, false, 28, null));
        t5t.d("FindDeviceImpl", "Find wearable device result:" + olVarSendRequest);
        return olVarSendRequest;
    }

    @Override // defpackage.ta
    public void a(@NotNull bb listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.w = null;
    }

    @Override // defpackage.ta
    public boolean a() {
        ol<l9> olVarA = new t4().a(b());
        t5t.d("FindDeviceImpl", "Find wearable device result:" + olVarA);
        l9 l9Var = (l9) C3621pl.a(olVarA);
        return l9Var != null && l9Var.getF24791a() == za.c.d.getF24791a();
    }

    public final void b(byte[] byteArray) {
        int iA = r0.a(ArraysKt___ArraysKt.first(byteArray));
        if (iA == wa.a.f37750b.getF37749a()) {
            bb bbVar = this.w;
            if (bbVar != null) {
                bbVar.b(this.t);
                return;
            }
            return;
        }
        if (iA == wa.f.f37755b.getF37749a()) {
            bb bbVar2 = this.w;
            if (bbVar2 != null) {
                bbVar2.a(this.t);
                return;
            }
            return;
        }
        if (iA == ya.f39972b.getF37749a()) {
            vh vhVar = this.x;
            if (vhVar != null) {
                vhVar.a();
                return;
            }
            return;
        }
        if (iA == xa.f38903b.getF37749a()) {
            a(y2.a(byteArray));
        }
    }

    @Override // defpackage.ta
    public void a(@NotNull HMCallback<?> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onFinish(((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new e(null), 1, null)).booleanValue());
    }

    public final void a(byte[] byteArray) {
        if (byteArray.length == 0) {
            return;
        }
        boolean z = ArraysKt___ArraysKt.first(byteArray) == 1;
        bb bbVar = this.w;
        if (bbVar instanceof wh) {
            ((wh) bbVar).a(this.t, z);
        }
    }
}
