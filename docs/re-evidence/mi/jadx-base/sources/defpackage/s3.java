package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0004B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0005\u001a\u00020\u0003J,\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\nH\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001b\u0010\u0004\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0011H\u0016R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Ls3;", "Lr3;", "channelApi", "", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FICONON, "", "moduleId", "", "isOneTime", "Lkotlin/Function1;", "Lm4;", "callback", "Ll4;", "request", "(Ll4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PluginDeviceInfo.FDESC, "", "Lo4;", "getVersion", "()Lo4;", "version", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class s3 implements r3 {

    @NotNull
    public static final a u = new a(null);

    @Nullable
    public r3 t;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ls3$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.base.ChannelApiDecorate", f = "ChannelApiDecorate.kt", i = {}, l = {58}, m = "transport", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object t;
        public int v;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return s3.this.a(null, this);
        }
    }

    public s3(@Nullable r3 r3Var) {
        this.t = r3Var;
    }

    public final void a(@Nullable r3 channelApi) {
        this.t = channelApi;
    }

    @Override // defpackage.r3
    public void b() {
        if (this.t == null) {
            t5t.d("ChannelApiDecorate", "Channel api decorate is null while close channel");
        }
        r3 r3Var = this.t;
        if (r3Var != null) {
            r3Var.b();
        }
    }

    public final void c() {
        r3 r3Var = this.t;
        if (r3Var != null) {
            r3Var.b();
        }
        this.t = null;
    }

    @Override // defpackage.r3
    @NotNull
    /* JADX INFO: renamed from: getVersion */
    public ChannelVersion getE() {
        ChannelVersion e;
        r3 r3Var = this.t;
        return (r3Var == null || (e = r3Var.getE()) == null) ? new ChannelVersion(0, null, 3, null) : e;
    }

    @Override // defpackage.r3
    public void a(int moduleId, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.t == null) {
            t5t.d("ChannelApiDecorate", "Channel api decorate is null while register");
        }
        r3 r3Var = this.t;
        if (r3Var != null) {
            r3Var.a(moduleId, isOneTime, callback);
        }
    }

    @Override // defpackage.r3
    public void a(int moduleId) {
        if (this.t == null) {
            t5t.d("ChannelApiDecorate", "Channel api decorate is null while unregister");
        }
        r3 r3Var = this.t;
        if (r3Var != null) {
            r3Var.a(moduleId);
        }
    }

    @Override // defpackage.r3
    public void a(@NotNull l4 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.t == null) {
            t5t.d("ChannelApiDecorate", "Channel api decorate is null while send data");
        }
        r3 r3Var = this.t;
        if (r3Var != null) {
            r3Var.a(request);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.r3
    @Nullable
    public Object a(@NotNull l4 l4Var, @NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.v = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objA = bVar.t;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.v;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            if (this.t == null) {
                t5t.d("ChannelApiDecorate", "Channel api decorate is null while transport");
            }
            r3 r3Var = this.t;
            if (r3Var != null) {
                bVar.v = 1;
                objA = r3Var.a(l4Var, bVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objA);
        boolean z = ((Boolean) objA).booleanValue();
        return Boxing.boxBoolean(z);
    }

    @Override // defpackage.r3
    @NotNull
    public String a() {
        String strA;
        if (this.t == null) {
            t5t.d("ChannelApiDecorate", "Channel api decorate is null while get address");
        }
        r3 r3Var = this.t;
        return (r3Var == null || (strA = r3Var.a()) == null) ? "" : strA;
    }
}
