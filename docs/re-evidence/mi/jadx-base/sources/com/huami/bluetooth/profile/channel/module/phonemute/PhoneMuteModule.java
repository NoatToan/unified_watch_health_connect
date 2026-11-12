package com.huami.bluetooth.profile.channel.module.phonemute;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.bp;
import defpackage.c3;
import defpackage.d4;
import defpackage.fu;
import defpackage.jq;
import defpackage.nl;
import defpackage.ol;
import defpackage.qq;
import defpackage.r3;
import defpackage.t5t;
import defpackage.xo;
import defpackage.zo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\nR\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010)\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00060"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "bytes", "", "responseCode", "Lol;", "send", "queryVersion", "", "init", "Lxo;", "loadApi", "Lbp;", "state", "", "setPhoneMuteStatus", "isMute", "returnQueryPhoneStateResult", "(Ljava/lang/Boolean;)V", "returnChangePhoneMuteStateResult", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "version$delegate", "getVersion", "()Ljava/lang/Integer;", "version", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "getPhoneMuteApi", "()Lxo;", "phoneMuteApi", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 59)
public final class PhoneMuteModule extends a implements CoroutineScope {
    public static final int CMD_CHANGE_PHONE_MUTE_STATUS = 7;
    public static final int CMD_QUERY_PHONE_STATUS = 5;
    public static final int CMD_QUERY_VERSION_CMD = 1;
    public static final int CMD_RETURN_CHANGE_PHONE_MUTE_STATUS_RESULT = 8;
    public static final int CMD_RETURN_QUERY_PHONE_STATE_RESULT = 6;
    public static final int CMD_RETURN_QUERY_VERSION_CMD = 2;
    public static final int CMD_RETURN_SET_PHONE_MUTE_STATUS = 4;
    public static final int CMD_SET_PHONE_MUTE_STATUS = 3;
    public static final int INVALID_PARAMETER = 2;
    public static final int NOT_SUPPORT_CMD = 3;
    public static final int PHONE_MUTE = 59;
    public static final int RESULT_OK = 1;

    @NotNull
    private static final String TAG = "PhoneMuteModule";
    public static final int VERSION_1 = 1;
    public static final int VERSION_ERROR = -1;

    @Nullable
    private xo api;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: version$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<CompletableJob> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteModule$returnChangePhoneMuteStateResult$1", f = "PhoneMuteModule.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
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
            return PhoneMuteModule.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.t = 1;
                obj = a.sendDataWithResult$default(PhoneMuteModule.this, new byte[]{8, 1}, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            t5t.d(PhoneMuteModule.TAG, "returnChangePhoneMuteStateResult:response=" + ((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteModule$returnQueryPhoneStateResult$1", f = "PhoneMuteModule.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ byte v;
        public final /* synthetic */ Boolean w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte b2, Boolean bool, Continuation<? super d> continuation) {
            super(2, continuation);
            this.v = b2;
            this.w = bool;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PhoneMuteModule.this.new d(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PhoneMuteModule phoneMuteModule = PhoneMuteModule.this;
                byte[] bArr = {6, 1, this.v};
                this.t = 1;
                obj = a.sendDataWithResult$default(phoneMuteModule, bArr, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            t5t.d(PhoneMuteModule.TAG, "returnQueryPhoneStateResult:isMute=" + this.w + ";state=" + ((int) this.v) + ";response=" + ((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteModule$e", "Lqq;", "Lnl;", "request", "", com.xiaomi.onetrack.api.b.I, "", "predict", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e implements qq {
        public final /* synthetic */ int t;

        public e(int i) {
            this.t = i;
        }

        @Override // defpackage.qq
        public boolean predict(@NotNull nl request, @NotNull byte[] response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return response[0] == ((byte) this.t);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<Integer> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(PhoneMuteModule.this.queryVersion());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneMuteModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(b.t);
        this.version = LazyKt__LazyJVMKt.lazy(new f());
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int queryVersion() {
        ol<byte[]> olVarSend = send(new byte[]{1}, 2);
        if (!(olVarSend instanceof fu)) {
            t5t.d(TAG, "Query version failed");
            return -1;
        }
        int iA = c3.a((byte[]) ((fu) olVarSend).a(), 1, 1);
        t5t.d(TAG, "Query version version(" + iA + ')');
        return iA;
    }

    private final ol<byte[]> send(byte[] bytes, int responseCode) {
        return sendRequest(new nl(new jq.a(bytes), new e(responseCode), 0L, null, false, 28, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 59;
    }

    @Nullable
    public final xo getPhoneMuteApi() {
        xo xoVar = this.api;
        if (xoVar != null) {
            return xoVar;
        }
        xo xoVarLoadApi = loadApi();
        this.api = xoVarLoadApi;
        return xoVarLoadApi;
    }

    @Nullable
    public final Integer getVersion() {
        return (Integer) this.version.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        this.api = null;
    }

    @Nullable
    public final xo loadApi() {
        int iQueryVersion = queryVersion();
        t5t.d(TAG, String.valueOf(iQueryVersion));
        if (iQueryVersion == -1) {
            return null;
        }
        if (iQueryVersion == 1) {
            return new zo(this);
        }
        t5t.d(TAG, "UnSupport phone mute protocol version");
        return null;
    }

    public final void returnChangePhoneMuteStateResult() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(null), 3, null);
    }

    public final void returnQueryPhoneStateResult(@Nullable Boolean isMute) {
        int t;
        if (isMute == null) {
            t = bp.PHONE_MUTE_STATE_PERMISSION.getT();
        } else {
            t = isMute.booleanValue() ? bp.PHONE_MUTE_STATE_MUTE.getT() : bp.PHONE_MUTE_STATE_RING.getT();
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d((byte) t, isMute, null), 3, null);
    }

    public final boolean setPhoneMuteStatus(@NotNull bp state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ol<byte[]> olVarSend = send(new byte[]{3, (byte) state.getT()}, 4);
        if (!(olVarSend instanceof fu)) {
            t5t.d(TAG, "setPhoneMuteStatus false");
            return false;
        }
        int iA = c3.a((byte[]) ((fu) olVarSend).a(), 1, 1);
        t5t.d(TAG, "setPhoneMuteStatus:" + iA);
        return iA == 1;
    }
}
