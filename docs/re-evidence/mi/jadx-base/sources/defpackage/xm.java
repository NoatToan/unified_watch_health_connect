package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lxm;", "Lwm;", "Lfn;", "info", "Lkotlin/Function1;", "", "", "action", PluginDeviceInfo.FMODEL, "Le7;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "byteArray", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", RnReportConst.ApiReport.PARAM_MODULE, "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "()Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "Lhn;", "version", "Lhn;", PluginDeviceInfo.FDESC, "()Lhn;", "protocolVersion", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;Lhn;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class xm implements wm {

    @NotNull
    public static final b d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NotificationModule f39252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public e7 f39253b;

    @NotNull
    public final NotificationVersion c;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, xm.class, "onDeviceCommand", "onDeviceCommand([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((xm) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lxm$b;", "", "", "logTag", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImpl$notify$1", f = "NotificationApiImpl.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;
        public final /* synthetic */ Function1<Boolean, Unit> v;
        public final /* synthetic */ xm w;
        public final /* synthetic */ Ref.ObjectRef<jq.a> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super Boolean, Unit> function1, xm xmVar, Ref.ObjectRef<jq.a> objectRef, Continuation<? super c> continuation) {
            super(2, continuation);
            this.v = function1;
            this.w = xmVar;
            this.x = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.u;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Boolean, Unit> function2 = this.v;
                NotificationModule f39252a = this.w.getF39252a();
                byte[] f34884a = this.x.element.getF34884a();
                this.t = function2;
                this.u = 1;
                Object objSendDataWithResult$default = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(f39252a, f34884a, 0, false, this, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objSendDataWithResult$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.t;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke2(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ cn t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(cn cnVar) {
            super(0);
            this.t = cnVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "received command: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;
        public final /* synthetic */ int u;
        public final /* synthetic */ String v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, int i2, String str) {
            super(0);
            this.t = i;
            this.u = i2;
            this.v = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "type: " + this.t + " uniqueId: " + this.u + " content:" + this.v;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;
        public final /* synthetic */ int u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, int i2) {
            super(0);
            this.t = i;
            this.u = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "type " + this.t + " received eventType " + this.u;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;
        public final /* synthetic */ int u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, int i2) {
            super(0);
            this.t = i;
            this.u = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "type " + this.t + " received uniqueId " + this.u;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function0<String> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "not support version: " + xm.this.getC().getVersion();
        }
    }

    public xm(@NotNull NotificationModule module, @NotNull NotificationVersion protocolVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        this.f39252a = module;
        this.c = protocolVersion;
        module.registerNotify(new a(this));
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public NotificationVersion getC() {
        return this.c;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final NotificationModule getF39252a() {
        return this.f39252a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, jq$a] */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, jq$a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, jq$a] */
    @Override // defpackage.wm
    public void a(@NotNull fn info, @NotNull Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(action, "action");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = cn.g.c.withBytes(c3.a(info.getF17943a(), 0, 1, null)).withByte(info.getCategoryId()).withByte(info.getEventId()).withString(info.getPkgName()).withString(info.getTitle()).withString(info.getMsg()).withString(info.getAppName());
        if (info.getCategoryId() == 3) {
            objectRef.element = ((jq.a) objectRef.element).withString(info.getPhone());
        }
        objectRef.element = ((jq.a) objectRef.element).withByte(info.getSupportReply());
        new nl((jq.a) objectRef.element, mj.t, 0L, null, false, 28, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(action, this, objectRef, null), 3, null);
    }

    @Override // defpackage.wm
    public void a(@NotNull e7 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39253b = listener;
    }

    public final void a(byte[] byteArray) {
        e7 e7Var;
        w2 w2Var = new w2(byteArray, 0, 2, null);
        cn cnVarDecode = new y4().decode(byteArray);
        le.c("NotificationHuamiOS", new d(cnVarDecode));
        int f5491a = cnVarDecode.getF5491a();
        if (f5491a == cn.f.c.getF5491a()) {
            int iC = w2Var.c();
            int iB = w2.b(w2Var, 0, 1, null);
            String strF = w2Var.f();
            le.c("NotificationHuamiOS", new e(iC, iB, strF));
            e7 e7Var2 = this.f39253b;
            if (e7Var2 != null) {
                e7Var2.a(iB, strF);
                return;
            }
            return;
        }
        if (f5491a == cn.d.c.getF5491a()) {
            int iC2 = w2Var.c();
            int iC3 = w2Var.c();
            le.c("NotificationHuamiOS", new f(iC2, iC3));
            if (iC3 == 1) {
                e7 e7Var3 = this.f39253b;
                if (e7Var3 != null) {
                    e7Var3.d();
                    return;
                }
                return;
            }
            if (iC3 == 2) {
                e7 e7Var4 = this.f39253b;
                if (e7Var4 != null) {
                    e7Var4.c();
                    return;
                }
                return;
            }
            if (iC3 == 3) {
                int iB2 = w2.b(w2Var, 0, 1, null);
                le.c("NotificationHuamiOS", new g(iC2, iB2));
                e7 e7Var5 = this.f39253b;
                if (e7Var5 != null) {
                    e7Var5.a(iB2);
                    return;
                }
                return;
            }
            if (iC3 != 4) {
                if (iC3 == 5 && (e7Var = this.f39253b) != null) {
                    e7Var.onAlarmCancel();
                    return;
                }
                return;
            }
            e7 e7Var6 = this.f39253b;
            if (e7Var6 != null) {
                e7Var6.onAlarmDelay();
                return;
            }
            return;
        }
        if (f5491a == cn.b.c.getF5491a()) {
            if (getC().getVersion() < 2) {
                le.c("NotificationHuamiOS", new h());
                return;
            }
            w2Var.c();
            String strF2 = w2Var.f();
            int iC4 = w2Var.c();
            int iC5 = w2Var.c(2);
            int iC6 = w2Var.c(2);
            e7 e7Var7 = this.f39253b;
            if (e7Var7 != null) {
                e7Var7.a(new LogoRequest(strF2, rk.u.a(iC4), iC5, iC6));
            }
        }
    }
}
