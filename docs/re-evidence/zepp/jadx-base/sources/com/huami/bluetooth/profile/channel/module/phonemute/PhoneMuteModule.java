package com.huami.bluetooth.profile.channel.module.phonemute;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.phonemute.impl.PhoneMuteApiImpl;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.e;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 59)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u000f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\nR\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010\"\u001a\u0004\u0018\u00010\u00058F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0015\u0010,\u001a\u0004\u0018\u00010\f8F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00062"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", HTTP.CONTENT_RANGE_BYTES, "", "responseCode", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", GoogleApiAvailabilityLight.a, "queryVersion", "", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteApi;", "loadApi", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteState;", "state", "", "setPhoneMuteStatus", "isMute", "returnQueryPhoneStateResult", "(Ljava/lang/Boolean;)V", "returnChangePhoneMuteStateResult", "Lkotlinx/coroutines/Job;", "g", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "h", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteApi;", "api", "i", "getVersion", "()Ljava/lang/Integer;", "version", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "getPhoneMuteApi", "()Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteApi;", "phoneMuteApi", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneMuteModule extends BaseModule implements CoroutineScope {
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
    public static final int VERSION_1 = 1;
    public static final int VERSION_ERROR = -1;

    @NotNull
    private static final String j = "PhoneMuteModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private PhoneMuteApi api;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Job> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteModule$returnChangePhoneMuteStateResult$1", f = "PhoneMuteModule.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PhoneMuteModule.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(PhoneMuteModule.this, new byte[]{8, 1}, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Debug.fi(PhoneMuteModule.j, Intrinsics.stringPlus("returnChangePhoneMuteStateResult:response=", Boxing.boxBoolean(((Boolean) obj).booleanValue())));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteModule$returnQueryPhoneStateResult$1", f = "PhoneMuteModule.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ byte c;
        public final /* synthetic */ Boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte b, Boolean bool, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = b;
            this.d = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PhoneMuteModule.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PhoneMuteModule phoneMuteModule = PhoneMuteModule.this;
                byte[] bArr = {6, 1, this.c};
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(phoneMuteModule, bArr, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Debug.fi(PhoneMuteModule.j, "returnQueryPhoneStateResult:isMute=" + this.d + ";state=" + ((int) this.c) + ";response=" + ((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return PhoneMuteModule.this.queryVersion();
        }
    }

    public PhoneMuteModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(a.a);
        this.version = LazyKt__LazyJVMKt.lazy(new d());
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    private final ModuleResult<byte[]> d(byte[] bytes, final int responseCode) {
        return sendRequest(new ModuleRequest(new Request.Command(bytes), new ResponsePredict() { // from class: com.huami.bluetooth.profile.channel.module.phonemute.PhoneMuteModule$send$1
            @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
            public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
                return response[0] == ((byte) responseCode);
            }
        }, 0L, null, false, 28, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int queryVersion() {
        ModuleResult<byte[]> moduleResultD = d(new byte[]{1}, 2);
        if (!(moduleResultD instanceof Success)) {
            Debug.fi(j, "Query version failed");
            return -1;
        }
        int i = ByteUtilsKt.toInt((byte[]) ((Success) moduleResultD).getData(), 1, 1);
        Debug.fi(j, "Query version version(" + i + ')');
        return i;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 59;
    }

    @Nullable
    public final PhoneMuteApi getPhoneMuteApi() {
        PhoneMuteApi phoneMuteApi = this.api;
        if (phoneMuteApi != null) {
            return phoneMuteApi;
        }
        PhoneMuteApi phoneMuteApiLoadApi = loadApi();
        this.api = phoneMuteApiLoadApi;
        return phoneMuteApiLoadApi;
    }

    @Nullable
    public final Integer getVersion() {
        return (Integer) this.version.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        super.init();
        this.api = null;
    }

    @Nullable
    public final PhoneMuteApi loadApi() {
        int iQueryVersion = queryVersion();
        Debug.fi(j, String.valueOf(iQueryVersion));
        if (iQueryVersion == -1) {
            return null;
        }
        if (iQueryVersion == 1) {
            return new PhoneMuteApiImpl(this);
        }
        Debug.fi(j, "UnSupport phone mute protocol version");
        return null;
    }

    public final void returnChangePhoneMuteStateResult() {
        e.f(this, null, null, new b(null), 3, null);
    }

    public final void returnQueryPhoneStateResult(@Nullable Boolean isMute) {
        int value;
        if (isMute == null) {
            value = PhoneMuteState.PHONE_MUTE_STATE_PERMISSION.getValue();
        } else {
            value = isMute.booleanValue() ? PhoneMuteState.PHONE_MUTE_STATE_MUTE.getValue() : PhoneMuteState.PHONE_MUTE_STATE_RING.getValue();
        }
        e.f(this, null, null, new c((byte) value, isMute, null), 3, null);
    }

    public final boolean setPhoneMuteStatus(@NotNull PhoneMuteState state) {
        ModuleResult<byte[]> moduleResultD = d(new byte[]{3, (byte) state.getValue()}, 4);
        if (!(moduleResultD instanceof Success)) {
            Debug.fi(j, "setPhoneMuteStatus false");
            return false;
        }
        int i = ByteUtilsKt.toInt((byte[]) ((Success) moduleResultD).getData(), 1, 1);
        Debug.fi(j, Intrinsics.stringPlus("setPhoneMuteStatus:", Integer.valueOf(i)));
        return i == 1;
    }
}
