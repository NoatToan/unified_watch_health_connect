package com.huami.bluetooth.profile.channel.module.morningnews;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.MorningGreetingItem;
import defpackage.d4;
import defpackage.r0;
import defpackage.r3;
import defpackage.t5t;
import defpackage.y2;
import defpackage.zc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0004\u0018\u00010\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/morningnews/MorningGreetingModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "init", "", "queryVersion", "()Ljava/lang/Integer;", "", "queryEnable", "()Ljava/lang/Boolean;", "", "Lrl;", "queryList", "enable", "saveEnable", "(Z)Ljava/lang/Boolean;", "list", "saveList", "(Ljava/util/List;)Ljava/lang/Boolean;", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 63)
public final class MorningGreetingModule extends a implements CoroutineScope {
    private static final int CMD_QUERY_ENABLE = 3;
    private static final int CMD_QUERY_LIST = 5;
    private static final int CMD_QUERY_VERSION = 1;
    private static final int CMD_RETURN_ENABLE = 4;
    private static final int CMD_RETURN_LIST = 6;
    private static final int CMD_RETURN_SAVE_ENABLE = 8;
    private static final int CMD_RETURN_VERSION = 2;
    private static final int CMD_SAVE_ENABLE = 7;
    private static final int CMD_SAVE_LIST = 9;
    private static final int CMD_SAVE_REPLY = 10;
    private static final int CODE_SUCCESS = 1;

    @NotNull
    private static final String TAG = "MorningGreetingModule";

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.morningnews.MorningGreetingModule$init$1$1", f = "MorningGreetingModule.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ MorningGreetingModule v;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.morningnews.MorningGreetingModule$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.morningnews.MorningGreetingModule$init$1$1$1", f = "MorningGreetingModule.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0282a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ MorningGreetingModule u;
                public final /* synthetic */ int v;
                public final /* synthetic */ byte[] w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0282a(MorningGreetingModule morningGreetingModule, int i, byte[] bArr, Continuation<? super C0282a> continuation) {
                    super(2, continuation);
                    this.u = morningGreetingModule;
                    this.v = i;
                    this.w = bArr;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0282a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0282a(this.u, this.v, this.w, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.t;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) this.u.getMsgChannels().get(Boxing.boxInt(this.v));
                        if (channel == null) {
                            return null;
                        }
                        byte[] bArr = this.w;
                        this.t = 1;
                        if (channel.send(bArr, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, MorningGreetingModule morningGreetingModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = morningGreetingModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.u.getData().length == 0) {
                        t5t.d(MorningGreetingModule.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    C0282a c0282a = new C0282a(this.v, r0.a(ArraysKt___ArraysKt.first(this.u.getData())), y2.a(this.u.getData()), null);
                    this.t = 1;
                    if (TimeoutKt.withTimeoutOrNull(1000L, c0282a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) throws InterruptedException {
            Intrinsics.checkNotNullParameter(response, "response");
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, MorningGreetingModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<CompletableJob> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorningGreetingModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(c.t);
        this.channels = new LinkedHashMap();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    @NotNull
    public final Map<Integer, Channel<ChannelResponse>> getChannels() {
        return this.channels;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 63;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    @Nullable
    public final Boolean queryEnable() {
        byte[] bArrSendCommand$default = a.sendCommand$default(this, 3, 4, 0L, 4, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "queryEnable response null");
            return null;
        }
        int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
        if (iFirst == 1 && bArrSendCommand$default.length >= 2) {
            return Boolean.valueOf((bArrSendCommand$default[1] & 255) == 1);
        }
        t5t.d(TAG, "queryEnable failed(" + iFirst + ')');
        return Boolean.FALSE;
    }

    @Nullable
    public final List<MorningGreetingItem> queryList() {
        byte[] bArrSendCommand$default = a.sendCommand$default(this, 5, 6, 0L, 4, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "queryList response null");
            return null;
        }
        int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
        int length = bArrSendCommand$default.length;
        if (iFirst != 1 || length < 2) {
            t5t.d(TAG, "queryList failed(" + iFirst + ')');
            return null;
        }
        int i = bArrSendCommand$default[1] & 255;
        if (i < (length - 2) / 3) {
            t5t.d(TAG, "queryList size not equals count:" + i + " responseSize:" + length);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(2, length), 3);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                arrayList.add(new MorningGreetingItem(bArrSendCommand$default[first] & 255, bArrSendCommand$default[first + 1] & 255, zc.u.a(bArrSendCommand$default[first + 2] & 255)));
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        return arrayList;
    }

    @Nullable
    public final Integer queryVersion() {
        byte[] bArrSendCommand$default = a.sendCommand$default(this, 1, 2, 0L, 4, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "queryVersion response null");
            return null;
        }
        int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
        if (iFirst == 1 && bArrSendCommand$default.length >= 2) {
            return Integer.valueOf(bArrSendCommand$default[1] & 255);
        }
        t5t.d(TAG, "queryVersion failed(" + iFirst + ')');
        return -1;
    }

    @Nullable
    public final Boolean saveEnable(boolean enable) {
        byte[] bArrSendCommand$default = a.sendCommand$default(this, new byte[]{7, enable ? (byte) 1 : (byte) 0}, 8, 0L, 4, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "saveEnable response null");
            return null;
        }
        int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
        if (iFirst == 1) {
            return Boolean.TRUE;
        }
        t5t.d(TAG, "saveEnable failed(" + iFirst + ')');
        return Boolean.FALSE;
    }

    @Nullable
    public final Boolean saveList(@NotNull List<MorningGreetingItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        byte[] bArrPlus = {(byte) list.size()};
        for (MorningGreetingItem morningGreetingItem : list) {
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, new byte[]{(byte) morningGreetingItem.getUid(), (byte) morningGreetingItem.getSuid(), (byte) morningGreetingItem.getEnable().getT()});
        }
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(new byte[]{9}, bArrPlus), 10, 0L, 4, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            t5t.d(TAG, "saveList response null");
            return null;
        }
        int iFirst = ArraysKt___ArraysKt.first(bArrSendCommand$default) & 255;
        if (iFirst == 1) {
            return Boolean.TRUE;
        }
        t5t.d(TAG, "saveList failed(" + iFirst + ')');
        return Boolean.FALSE;
    }
}
