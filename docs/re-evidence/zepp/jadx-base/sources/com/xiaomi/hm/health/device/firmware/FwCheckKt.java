package com.xiaomi.hm.health.device.firmware;

import com.huami.bluetooth.profile.channel.module.OtaModule;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.bt.profile.dfu.OtaResult;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatus;
import com.xiaomi.hm.health.bt.utils.CRCUtilsKt;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a+\u0010\u0007\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000\u001aJ\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2:\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\n\u001a\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000e\u001a,\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u001a\u0016\u0010\u001c\u001a\u00020\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a\"\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\"\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "Lkotlin/ParameterName;", "name", "otaResult", "", "action", "getDeviceOtaResult", "Lcom/xiaomi/hm/health/device/firmware/HMFwOnlineUpgradeInfo;", "fwInfo", "Lkotlin/Function2;", "", "crc", "check", "", "supportPresetFirmwareInformation", "supportAutoOtaAtNight", "()Ljava/lang/Boolean;", "open", "setAutoOtaAtNight", "info", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "isForce", "Lkotlin/Function0;", "shouldStartUpgrade", "", "list", "isFirmwaresContainsForce", "", "a", "Ljava/lang/String;", "TAG", "b", "Z", "isChecking", "()Z", "setChecking", "(Z)V", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class FwCheckKt {

    @NotNull
    private static final String a = "FwCheck";
    private static boolean b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwCheckKt$check$1", f = "FwCheck.kt", i = {0}, l = {68, 72}, m = "invokeSuspend", n = {"appCrc32"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HMFwOnlineUpgradeInfo c;
        public final /* synthetic */ Function2<Long, OtaResult, Unit> d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.firmware.FwCheckKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0819a extends Lambda implements Function0<String> {
            public final /* synthetic */ OtaResult a;
            public final /* synthetic */ Long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0819a(OtaResult otaResult, Long l) {
                super(0);
                this.a = otaResult;
                this.b = l;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "otaResult: " + this.a + ", appCrc: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwCheckKt$check$1$2", f = "FwCheck.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Long b;
            public final /* synthetic */ OtaResult c;
            public final /* synthetic */ Function2<Long, OtaResult, Unit> d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.firmware.FwCheckKt$a$b$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0820a extends Lambda implements Function0<String> {
                public static final C0820a a = new C0820a();

                public C0820a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "文件已经传输过，无需再次传输";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Long l, OtaResult otaResult, Function2<? super Long, ? super OtaResult, Unit> function2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = l;
                this.c = otaResult;
                this.d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Long l = this.b;
                OtaResult otaResult = this.c;
                if (Intrinsics.areEqual(l, otaResult == null ? null : otaResult.getCrc())) {
                    HMLog.info(FwCheckKt.a, C0820a.a);
                }
                this.d.invoke(this.b, this.c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "getCrc32 error:" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, Function2<? super Long, ? super OtaResult, Unit> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = hMFwOnlineUpgradeInfo;
            this.d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0096 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Long lBoxLong;
            Long l;
            OtaModule otaModule;
            OtaResult otaResult;
            MainCoroutineDispatcher main;
            b bVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    l = (Long) this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String fwFilePath = this.c.getFwFilePath();
            if (fwFilePath == null || m.isBlank(fwFilePath)) {
                l = null;
            } else {
                try {
                    lBoxLong = Boxing.boxLong(CRCUtilsKt.getCrc32(fwFilePath));
                } catch (Exception e) {
                    HMLog.info(FwCheckKt.a, new c(e));
                    lBoxLong = null;
                }
                l = lBoxLong;
            }
            HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
            if (device == null || (otaModule = (OtaModule) device.getChannelModule(OtaModule.class)) == null) {
                otaResult = null;
            } else {
                this.a = l;
                this.b = 1;
                obj = otaModule.getOtaInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            HMLog.info(FwCheckKt.a, new C0819a(otaResult, l));
            main = Dispatchers.getMain();
            bVar = new b(l, otaResult, this.d, null);
            this.a = null;
            this.b = 2;
            if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            otaResult = (OtaResult) obj;
            HMLog.info(FwCheckKt.a, new C0819a(otaResult, l));
            main = Dispatchers.getMain();
            bVar = new b(l, otaResult, this.d, null);
            this.a = null;
            this.b = 2;
            if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwCheckKt$getDeviceOtaResult$1", f = "FwCheck.kt", i = {}, l = {42, 43}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<OtaResult, Unit> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwCheckKt$getDeviceOtaResult$1$1", f = "FwCheck.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<OtaResult, Unit> b;
            public final /* synthetic */ OtaResult c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super OtaResult, Unit> function1, OtaResult otaResult, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = otaResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.invoke(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super OtaResult, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OtaModule otaModule;
            OtaResult otaResult;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
            if (device == null || (otaModule = (OtaModule) device.getChannelModule(OtaModule.class)) == null) {
                otaResult = null;
            } else {
                this.a = 1;
                obj = otaModule.getOtaInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            main = Dispatchers.getMain();
            aVar = new a(this.b, otaResult, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            otaResult = (OtaResult) obj;
            main = Dispatchers.getMain();
            aVar = new a(this.b, otaResult, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwCheckKt$shouldStartUpgrade$1", f = "FwCheck.kt", i = {}, l = {119, DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ HMFwOnlineUpgradeInfo c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ HMDeviceSource e;
        public final /* synthetic */ Function0<Unit> f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwCheckKt$shouldStartUpgrade$1$1", f = "FwCheck.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function0<Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function0<Unit> function0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.getA();
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "supportPresetFirmwareInformation:" + this.a;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.firmware.FwCheckKt$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0821c extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0821c(Boolean bool) {
                super(0);
                this.a = bool;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "getWritePresetFirmwareInfoResponse:" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public static final d a = new d();

            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "not upgrade when sport";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ UpgradeStatus a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(UpgradeStatus upgradeStatus) {
                super(0);
                this.a = upgradeStatus;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "return for upgradeStatus: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.firmware.FwCheckKt$shouldStartUpgrade$1$6", f = "FwCheck.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function0<Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Function0<Unit> function0, Continuation<? super f> continuation) {
                super(2, continuation);
                this.b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new f(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.getA();
                FwCheckKt.setChecking(false);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "getCrc32 error:" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, boolean z, HMDeviceSource hMDeviceSource, Function0<Unit> function0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = hMFwOnlineUpgradeInfo;
            this.d = z;
            this.e = hMDeviceSource;
            this.f = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.c, this.d, this.e, this.f, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UpgradeStatus dfuV5UpgradeStatusSync;
            File file;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    FwCheckKt.setChecking(false);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            DeviceManagerApi deviceManagerApi = ManagerFunctionsKt.getDeviceManagerApi();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            HMBaseDevice device = deviceManagerApi.getDevice(hMDeviceType);
            if (!(device instanceof HMMiLiProDevice)) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.f, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                FwCheckKt.setChecking(false);
                return Unit.INSTANCE;
            }
            boolean zSupportPresetFirmwareInformation = FwCheckKt.supportPresetFirmwareInformation();
            HMLog.info(FwCheckKt.a, new b(zSupportPresetFirmwareInformation));
            if (zSupportPresetFirmwareInformation) {
                String fwFilePath = this.c.getFwFilePath();
                if (fwFilePath == null) {
                    file = null;
                } else {
                    file = new File(fwFilePath);
                    if (!file.exists()) {
                        FwCheckKt.setChecking(false);
                        return Unit.INSTANCE;
                    }
                }
                if (file == null) {
                    FwCheckKt.setChecking(false);
                    return Unit.INSTANCE;
                }
                try {
                    long jLongValue = Boxing.boxLong(CRCUtilsKt.getCrc32(fwFilePath)).longValue();
                    String changeLogForDevice = this.c.getChangeLogForDevice();
                    if (changeLogForDevice == null) {
                        changeLogForDevice = "";
                    }
                    String str = changeLogForDevice;
                    HMBaseDevice device2 = ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
                    OtaModule otaModule = device2 == null ? null : (OtaModule) device2.getChannelModule(OtaModule.class);
                    HMLog.info(FwCheckKt.a, new C0821c(otaModule == null ? null : Boxing.boxBoolean(otaModule.getWritePresetFirmwareInfoResponse(this.c.getFwVersionName(), file.length(), jLongValue, str))));
                } catch (Exception e2) {
                    HMLog.info(FwCheckKt.a, new g(e2));
                    FwCheckKt.setChecking(false);
                    return Unit.INSTANCE;
                }
            }
            if (!this.d && HMDeviceConfig.hasFeatureSportOrTimer(this.e)) {
                DfuState dfuStateSync = ((HMMiLiProDevice) device).getDfuStateSync();
                if (dfuStateSync.getState() == 32 || dfuStateSync.getState() == 33 || dfuStateSync.getState() == 48) {
                    HMLog.info(FwCheckKt.a, d.a);
                    FwCheckKt.setChecking(false);
                    return Unit.INSTANCE;
                }
            }
            if (FwUpgradeFeature.INSTANCE.supportSilentUpgrade(hMDeviceType) && (dfuV5UpgradeStatusSync = ((HMMiLiProDevice) device).getDfuV5UpgradeStatusSync()) != UpgradeStatus.IDLE) {
                HMLog.info(FwCheckKt.a, new e(dfuV5UpgradeStatusSync));
                FwCheckKt.setChecking(false);
                return Unit.INSTANCE;
            }
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            f fVar = new f(this.f, null);
            this.a = 2;
            if (BuildersKt.withContext(main2, fVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final void check(@NotNull HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, @NotNull Function2<? super Long, ? super OtaResult, Unit> function2) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(hMFwOnlineUpgradeInfo, function2, null), 2, null);
    }

    public static final void getDeviceOtaResult(@NotNull Function1<? super OtaResult, Unit> function1) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(function1, null), 2, null);
    }

    public static final boolean isChecking() {
        return b;
    }

    public static final boolean isFirmwaresContainsForce(@Nullable List<? extends HMFwOnlineUpgradeInfo> list) {
        if (list == null || list.isEmpty() || list.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (((HMFwOnlineUpgradeInfo) it2.next()).isForceUpgrade()) {
                return true;
            }
        }
        return false;
    }

    public static final void setAutoOtaAtNight(boolean z) {
        HMMiLiProDevice hMMiLiProDevice;
        if (supportAutoOtaAtNight() == null || (hMMiLiProDevice = (HMMiLiProDevice) ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI)) == null) {
            return;
        }
        hMMiLiProDevice.setAutoOtaAtNightSwitch(z);
    }

    public static final void setChecking(boolean z) {
        b = z;
    }

    public static final void shouldStartUpgrade(@NotNull HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, @NotNull HMDeviceSource hMDeviceSource, boolean z, @NotNull Function0<Unit> function0) {
        b = true;
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new c(hMFwOnlineUpgradeInfo, z, hMDeviceSource, function0, null), 2, null);
    }

    @Nullable
    public static final Boolean supportAutoOtaAtNight() {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice == null) {
            return null;
        }
        return hMMiLiProDevice.getAutoOtaAtNightSwitch();
    }

    public static final boolean supportPresetFirmwareInformation() {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        OtaModule otaModule = device == null ? null : (OtaModule) device.getChannelModule(OtaModule.class);
        return Intrinsics.areEqual(otaModule != null ? Boolean.valueOf(otaModule.supportPresetFirmwareInformation()) : null, Boolean.TRUE);
    }
}
