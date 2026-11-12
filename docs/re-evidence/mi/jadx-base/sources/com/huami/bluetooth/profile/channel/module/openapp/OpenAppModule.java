package com.huami.bluetooth.profile.channel.module.openapp;

import com.huami.bluetooth.profile.channel.module.a;
import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.CalorieData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.FatBurningData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.SitWalkRun;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StandData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StepsData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.a0;
import defpackage.aq;
import defpackage.d4;
import defpackage.jq;
import defpackage.mj;
import defpackage.nl;
import defpackage.o6;
import defpackage.qs;
import defpackage.r0;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.vn;
import defpackage.w2;
import defpackage.y2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B\u000f\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u001aJ(\u0010\u001f\u001a\u00020\u00062 \u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001d\u0018\u00010\u001aJ\u001a\u0010!\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00060\u001aJ\u000e\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"J2\u0010)\u001a\u00020\u00062\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u001aR\u001a\u0010*\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R0\u0010.\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001d\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R*\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u00106\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010/R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/¨\u0006>"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "isSuccess", "La0;", "page", "", "sendOpenPageResult", "", "byteArray", "onSleepStateChanged", "data", "openAppPage", "", "parsePageType", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;", "defaultStepsData", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "defaultCalorieData", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", "defaultFatBurningData", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;", "defaultSitWalkRun", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;", "defaultStandData", "init", "Lkotlin/Function1;", "onResult", "queryVersion", "Lkotlin/Pair;", "callback", "listenOpenAppPage", "Lqs;", "registerSleepStateListener", "Laq;", "state", "sendRealtimeHrState", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "Lkotlin/collections/ArrayList;", "activityData", "writeActivityData", RnReportConst.ApiReport.PARAM_MODULE, "I", "getModule", "()I", "openAppCallback", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/ref/WeakReference;", "sleepStateCallback", "Ljava/lang/ref/WeakReference;", "Lkotlinx/coroutines/channels/Channel;", "rtHrChannel", "Lkotlinx/coroutines/channels/Channel;", "writeActivityDataResult", "queryVersionResult", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 29)
public final class OpenAppModule extends a {
    private static final int CODE_FAIL = 2;
    private static final int CODE_SUCCESS = 0;
    public static final int OPEN_APP_MODULE = 29;
    private static final int VALUE_DEFAULT = 0;
    public static final int VERSION_1 = 1;
    private static final int VERSION_INVALID = -1;
    private final int module;

    @Nullable
    private Function1<? super a0, ? extends Pair<Boolean, ? extends a0>> openAppCallback;

    @Nullable
    private Function1<? super Integer, Unit> queryVersionResult;

    @Nullable
    private Channel<Boolean> rtHrChannel;

    @NotNull
    private WeakReference<Function1<qs, Unit>> sleepStateCallback;

    @Nullable
    private Function1<? super Integer, Unit> writeActivityDataResult;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$init$1$1", f = "OpenAppModule.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ OpenAppModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, OpenAppModule openAppModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = openAppModule;
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
                        t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "open app module response:" + this.u.d());
                    int iA = r0.a(ArraysKt___ArraysKt.first(this.u.getData()));
                    if (iA == vn.c.f37043b.getF37040a()) {
                        this.v.openAppPage(y2.a(this.u.getData()));
                    } else if (iA == vn.g.f37047b.getF37040a()) {
                        this.v.onSleepStateChanged(y2.a(this.u.getData()));
                    } else {
                        boolean z = false;
                        if (iA == vn.f.f37046b.getF37040a()) {
                            Channel channel = this.v.rtHrChannel;
                            if (channel != null) {
                                Byte bFirstOrNull = ArraysKt___ArraysKt.firstOrNull(y2.a(this.u.getData()));
                                if (bFirstOrNull != null && (bFirstOrNull.byteValue() & 255) == 0) {
                                    z = true;
                                }
                                Boolean boolBoxBoolean = Boxing.boxBoolean(z);
                                this.t = 1;
                                if (channel.send(boolBoxBoolean, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else if (iA == vn.b.f37042b.getF37040a()) {
                            w2 w2Var = new w2(this.u.getData(), 0, 2, null);
                            w2Var.c();
                            int iC = w2Var.c();
                            Function1 function1 = this.v.writeActivityDataResult;
                            if (function1 != null) {
                                function1.invoke2(Boxing.boxInt(iC));
                            }
                        } else if (iA == vn.i.f37049b.getF37040a()) {
                            w2 w2Var2 = new w2(this.u.getData(), 0, 2, null);
                            w2Var2.c();
                            int iC2 = w2Var2.c() == 0 ? w2Var2.c() : -1;
                            Function1 function2 = this.v.queryVersionResult;
                            if (function2 != null) {
                                function2.invoke2(Boxing.boxInt(iC2));
                            }
                        }
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
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, OpenAppModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$openAppPage$1$1", f = "OpenAppModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ a0 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.v = a0Var;
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
            return OpenAppModule.this.new c(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Pair pair;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = OpenAppModule.this.openAppCallback;
            if (function1 != null && (pair = (Pair) function1.invoke2(this.v)) != null) {
                OpenAppModule.this.sendOpenPageResult(((Boolean) pair.getFirst()).booleanValue(), (a0) pair.getSecond());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$queryVersion$1", f = "OpenAppModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ Function1<Integer, Unit> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Integer, Unit> function1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.v = function1;
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
            return OpenAppModule.this.new d(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OpenAppModule.this.queryVersionResult = this.v;
            OpenAppModule.this.sendRequest(new nl(vn.h.f37048b, mj.t, 0L, null, false, 28, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$sendOpenPageResult$1", f = "OpenAppModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ a0 v;
        public final /* synthetic */ OpenAppModule w;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {
            public final /* synthetic */ a0 t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var) {
                super(1);
                this.t = a0Var;
            }

            public final void a(@NotNull ChannelResponse response) {
                String f456b;
                Intrinsics.checkNotNullParameter(response, "response");
                StringBuilder sb = new StringBuilder();
                sb.append("send open page:");
                a0 a0Var = this.t;
                if (a0Var == null || (f456b = a0Var.getF456b()) == null) {
                    f456b = "unkownpage";
                }
                sb.append(f456b);
                sb.append("  result:");
                sb.append(response);
                t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, sb.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
                a(channelResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, a0 a0Var, OpenAppModule openAppModule, Continuation<? super e> continuation) {
            super(2, continuation);
            this.u = z;
            this.v = a0Var;
            this.w = openAppModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Boxing.boxByte(this.u ? (byte) 0 : (byte) 2));
            a0 a0Var = this.v;
            if (a0Var != null) {
                Boxing.boxBoolean(arrayList.add(Boxing.boxByte((byte) a0Var.getF455a())));
            }
            this.w.sendWithoutDataResponse(new nl(vn.d.f37044b.withBytes(CollectionsKt___CollectionsKt.toByteArray(arrayList)), o6.t, 0L, null, false, 28, null).a(), new a(this.v));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$sendRealtimeHrState$1", f = "OpenAppModule.kt", i = {}, l = {153, 154}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ aq u;
        public final /* synthetic */ OpenAppModule v;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$sendRealtimeHrState$1$1", f = "OpenAppModule.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int t;
            public final /* synthetic */ OpenAppModule u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OpenAppModule openAppModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = openAppModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objMo2391receiveCatchingJP2dKIU;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = this.u.rtHrChannel;
                    if (channel != null) {
                        this.t = 1;
                        objMo2391receiveCatchingJP2dKIU = channel.mo2391receiveCatchingJP2dKIU(this);
                        if (objMo2391receiveCatchingJP2dKIU == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo2391receiveCatchingJP2dKIU = ((ChannelResult) obj).getHolder();
                Boolean bool = (Boolean) ChannelResult.m2402getOrNullimpl(objMo2391receiveCatchingJP2dKIU);
                if (bool != null) {
                    t5t.d("realtime hr", "send realtime state to device, result:" + bool.booleanValue());
                    return bool;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(aq aqVar, OpenAppModule openAppModule, Continuation<? super f> continuation) {
            super(2, continuation);
            this.u = aqVar;
            this.v = openAppModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean bool;
            boolean z = false;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
            ResultKt.throwOnFailure(obj);
            t5t.d("realtime hr", "send realtime state to device, state:" + this.u.getT());
            byte[] bArr = {(byte) vn.e.f37045b.getF37040a(), (byte) this.u.getT()};
            this.v.rtHrChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            OpenAppModule openAppModule = this.v;
            this.t = 1;
            obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(openAppModule, bArr, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                a aVar = new a(this.v, null);
                this.t = 2;
                obj = TimeoutKt.withTimeoutOrNull(15000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bool = (Boolean) obj;
                if (bool != null) {
                    z = true;
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$writeActivityData$1", f = "OpenAppModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ Function1<Integer, Unit> v;
        public final /* synthetic */ ArrayList<ActivityData> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Integer, Unit> function1, ArrayList<ActivityData> arrayList, Continuation<? super g> continuation) {
            super(2, continuation);
            this.v = function1;
            this.w = arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OpenAppModule.this.new g(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OpenAppModule.this.writeActivityDataResult = this.v;
            t5t.d("ActivityTodayProfile", "write activity data: " + this.w);
            jq.a aVarWithByte = vn.a.f37041b.withByte(this.w.size());
            ArrayList<ActivityData> arrayList = this.w;
            OpenAppModule openAppModule = OpenAppModule.this;
            jq.a aVarWithShort = aVarWithByte;
            for (ActivityData activityData : arrayList) {
                jq.a aVarWithInt = aVarWithShort.withInt(activityData.getTime());
                StepsData dataSteps = activityData.getDataSteps();
                if (dataSteps == null) {
                    dataSteps = openAppModule.defaultStepsData();
                }
                jq.a aVarWithInt2 = aVarWithInt.withInt(dataSteps.getTotal());
                Iterator<T> it = dataSteps.getStepsHalfHour().iterator();
                while (it.hasNext()) {
                    aVarWithInt2 = aVarWithInt2.withShort(((Number) it.next()).intValue());
                }
                jq.a aVarWithInt3 = aVarWithInt2.withInt(dataSteps.getGoal()).withInt(dataSteps.getLastTotal());
                CalorieData dataCalorie = activityData.getDataCalorie();
                if (dataCalorie == null) {
                    dataCalorie = openAppModule.defaultCalorieData();
                }
                jq.a aVarWithShort2 = aVarWithInt3.withShort(dataCalorie.getTotal());
                Iterator<T> it2 = dataCalorie.getCaloriesPerHalfHour().iterator();
                while (it2.hasNext()) {
                    aVarWithShort2 = aVarWithShort2.withShort(((Number) it2.next()).intValue());
                }
                jq.a aVarWithShort3 = aVarWithShort2.withShort(dataCalorie.getGoal()).withShort(dataCalorie.getLastTotal()).withShort(dataCalorie.getBasicCalorie());
                FatBurningData dataFatBurning = activityData.getDataFatBurning();
                if (dataFatBurning == null) {
                    dataFatBurning = openAppModule.defaultFatBurningData();
                }
                jq.a aVarWithShort4 = aVarWithShort3.withShort(dataFatBurning.getTotal());
                Iterator<T> it3 = dataFatBurning.getBurningPerHalfHour().iterator();
                while (it3.hasNext()) {
                    aVarWithShort4 = aVarWithShort4.withByte(((Number) it3.next()).intValue());
                }
                jq.a aVarWithShort5 = aVarWithShort4.withShort(dataFatBurning.getGoal()).withShort(dataFatBurning.getLastTotal());
                SitWalkRun dataSitWalkRun = activityData.getDataSitWalkRun();
                if (dataSitWalkRun == null) {
                    dataSitWalkRun = openAppModule.defaultSitWalkRun();
                }
                jq.a aVarWithInt4 = aVarWithShort5.withInt(dataSitWalkRun.getTimeRun()).withInt(dataSitWalkRun.getTimeFastWalk()).withInt(dataSitWalkRun.getTimeSit());
                StandData dataStand = activityData.getDataStand();
                if (dataStand == null) {
                    dataStand = openAppModule.defaultStandData();
                }
                jq.a aVarWithByte2 = aVarWithInt4.withByte(dataStand.getTotal());
                Iterator<T> it4 = dataStand.getStandPerHour().iterator();
                while (it4.hasNext()) {
                    aVarWithByte2 = aVarWithByte2.withByte(((Number) it4.next()).intValue());
                }
                jq.a aVarWithInt5 = aVarWithByte2.withByte(dataStand.getGoal()).withInt(dataStand.getTimeSit()).withInt(dataStand.getTimeStand());
                byte[] distance = tet.r((long) activityData.getDistance(), 4);
                Intrinsics.checkNotNullExpressionValue(distance, "distance");
                aVarWithShort = aVarWithInt5.withBytes(distance).withShort(activityData.getFloor()).withByte(activityData.getGoalType()).withShort(activityData.getStandOrBurn());
            }
            OpenAppModule.this.sendRequest(new nl(aVarWithShort, mj.t, 0L, null, false, 28, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAppModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.module = 29;
        this.sleepStateCallback = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CalorieData defaultCalorieData() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 48; i++) {
            arrayList.add(0);
        }
        return new CalorieData(0, arrayList, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FatBurningData defaultFatBurningData() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 48; i++) {
            arrayList.add(0);
        }
        return new FatBurningData(0, arrayList, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SitWalkRun defaultSitWalkRun() {
        return new SitWalkRun(0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StandData defaultStandData() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 24; i++) {
            arrayList.add(0);
        }
        return new StandData(0, arrayList, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StepsData defaultStepsData() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 48; i++) {
            arrayList.add(0);
        }
        return new StepsData(0, arrayList, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSleepStateChanged(byte[] byteArray) {
        if (byteArray.length == 0) {
            t5t.d(a.TAG, "Sleep state changed but no state");
        }
        byte bFirst = ArraysKt___ArraysKt.first(byteArray);
        qs qsVar = qs.b.c;
        if (bFirst != qsVar.getF31787a()) {
            qsVar = qs.a.c;
            if (bFirst != qsVar.getF31787a()) {
                qsVar = null;
            }
        }
        if (qsVar == null) {
            t5t.d(a.TAG, "Unrecognized sleep code：" + ((int) bFirst));
            return;
        }
        Function1<qs, Unit> function1 = this.sleepStateCallback.get();
        if (function1 != null) {
            function1.invoke2(qsVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAppPage(byte[] data) {
        if (!(!(data.length == 0))) {
            data = null;
        }
        a0 pageType = data != null ? parsePageType(data[0] & 255) : null;
        if (pageType != null) {
            t5t.d(a.TAG, "open app page type:" + pageType.getF456b());
            if (BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new c(pageType, null), 2, null) != null) {
                return;
            }
        }
        openAppPage$lambda$3(this);
        Unit unit = Unit.INSTANCE;
    }

    private static final void openAppPage$lambda$3(OpenAppModule openAppModule) {
        t5t.d(a.TAG, "parse page type fail");
        sendOpenPageResult$default(openAppModule, false, null, 2, null);
    }

    private final a0 parsePageType(int i) {
        a0.e eVar = a0.e.c;
        if (i == eVar.getF455a()) {
            return eVar;
        }
        a0.j jVar = a0.j.c;
        if (i == jVar.getF455a()) {
            return jVar;
        }
        a0.h hVar = a0.h.c;
        if (i == hVar.getF455a()) {
            return hVar;
        }
        a0.k kVar = a0.k.c;
        if (i == kVar.getF455a()) {
            return kVar;
        }
        a0.i iVar = a0.i.c;
        if (i == iVar.getF455a()) {
            return iVar;
        }
        a0.g gVar = a0.g.c;
        if (i == gVar.getF455a()) {
            return gVar;
        }
        a0.f fVar = a0.f.c;
        if (i == fVar.getF455a()) {
            return fVar;
        }
        a0.a aVar = a0.a.c;
        if (i == aVar.getF455a()) {
            return aVar;
        }
        a0.d dVar = a0.d.c;
        if (i == dVar.getF455a()) {
            return dVar;
        }
        a0.b bVar = a0.b.c;
        if (i == bVar.getF455a()) {
            return bVar;
        }
        a0.c cVar = a0.c.c;
        if (i == cVar.getF455a()) {
            return cVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendOpenPageResult(boolean isSuccess, a0 page) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new e(isSuccess, page, this, null), 2, null);
    }

    public static /* synthetic */ void sendOpenPageResult$default(OpenAppModule openAppModule, boolean z, a0 a0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            a0Var = null;
        }
        openAppModule.sendOpenPageResult(z, a0Var);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    public final void listenOpenAppPage(@Nullable Function1<? super a0, ? extends Pair<Boolean, ? extends a0>> callback) {
        this.openAppCallback = callback;
    }

    public final void queryVersion(@NotNull Function1<? super Integer, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(onResult, null), 3, null);
    }

    public final void registerSleepStateListener(@NotNull Function1<? super qs, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.sleepStateCallback = new WeakReference<>(callback);
    }

    public final boolean sendRealtimeHrState(@NotNull aq state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new f(state, this, null), 1, null)).booleanValue();
    }

    public final void writeActivityData(@NotNull ArrayList<ActivityData> activityData, @NotNull Function1<? super Integer, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activityData, "activityData");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new g(onResult, activityData, null), 3, null);
    }
}
