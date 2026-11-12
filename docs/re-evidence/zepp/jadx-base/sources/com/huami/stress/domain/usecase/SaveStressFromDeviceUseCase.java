package com.huami.stress.domain.usecase;

import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJm\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/stress/domain/usecase/SaveStressFromDeviceUseCase;", "", "", "userId", "", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "Ljava/util/Calendar;", "singleCalendar", "allDayCalendar", "Lkotlin/Function2;", "", "", "", "saveSyncTime", Constant.METHOD_EXECUTE, "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "a", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "b", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository", "<init>", "(Lcom/huami/stress/domain/repository/SingleStressRepository;Lcom/huami/stress/domain/repository/AllDayStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class SaveStressFromDeviceUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository singleStressRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressRepository allDayStressRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.usecase.SaveStressFromDeviceUseCase$execute$2", f = "SaveStressFromDeviceUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ Calendar j;
        public final /* synthetic */ Function2<Long, Boolean, Unit> k;
        public final /* synthetic */ Calendar l;

        /* JADX INFO: renamed from: com.huami.stress.domain.usecase.SaveStressFromDeviceUseCase$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.stress.domain.usecase.SaveStressFromDeviceUseCase$execute$2$1", f = "SaveStressFromDeviceUseCase.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0607a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SaveStressFromDeviceUseCase b;
            public final /* synthetic */ String c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;
            public final /* synthetic */ String f;
            public final /* synthetic */ String g;
            public final /* synthetic */ String h;
            public final /* synthetic */ Calendar i;
            public final /* synthetic */ Function2<Long, Boolean, Unit> j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0607a(SaveStressFromDeviceUseCase saveStressFromDeviceUseCase, String str, int i, int i2, String str2, String str3, String str4, Calendar calendar, Function2<? super Long, ? super Boolean, Unit> function2, Continuation<? super C0607a> continuation) {
                super(2, continuation);
                this.b = saveStressFromDeviceUseCase;
                this.c = str;
                this.d = i;
                this.e = i2;
                this.f = str2;
                this.g = str3;
                this.h = str4;
                this.i = calendar;
                this.j = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0607a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0607a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SingleStressRepository singleStressRepository = this.b.singleStressRepository;
                    String str = this.c;
                    int i2 = this.d;
                    int i3 = this.e;
                    String str2 = this.f;
                    String str3 = this.g;
                    String str4 = this.h;
                    Calendar calendar = this.i;
                    Function2<Long, Boolean, Unit> function2 = this.j;
                    this.a = 1;
                    if (singleStressRepository.saveSingleStressFromDevice(str, i2, i3, str2, str3, str4, calendar, function2, this) == coroutine_suspended) {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.stress.domain.usecase.SaveStressFromDeviceUseCase$execute$2$2", f = "SaveStressFromDeviceUseCase.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SaveStressFromDeviceUseCase b;
            public final /* synthetic */ String c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;
            public final /* synthetic */ String f;
            public final /* synthetic */ String g;
            public final /* synthetic */ String h;
            public final /* synthetic */ Calendar i;
            public final /* synthetic */ Function2<Long, Boolean, Unit> j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(SaveStressFromDeviceUseCase saveStressFromDeviceUseCase, String str, int i, int i2, String str2, String str3, String str4, Calendar calendar, Function2<? super Long, ? super Boolean, Unit> function2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = saveStressFromDeviceUseCase;
                this.c = str;
                this.d = i;
                this.e = i2;
                this.f = str2;
                this.g = str3;
                this.h = str4;
                this.i = calendar;
                this.j = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, continuation);
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
                    AllDayStressRepository allDayStressRepository = this.b.allDayStressRepository;
                    String str = this.c;
                    int i2 = this.d;
                    int i3 = this.e;
                    String str2 = this.f;
                    String str3 = this.g;
                    String str4 = this.h;
                    Calendar calendar = this.i;
                    Function2<Long, Boolean, Unit> function2 = this.j;
                    this.a = 1;
                    if (allDayStressRepository.saveAllDayStressFromDevice(str, i2, i3, str2, str3, str4, calendar, function2, this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, int i, int i2, String str2, String str3, String str4, Calendar calendar, Function2<? super Long, ? super Boolean, Unit> function2, Calendar calendar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = str;
            this.e = i;
            this.f = i2;
            this.g = str2;
            this.h = str3;
            this.i = str4;
            this.j = calendar;
            this.k = function2;
            this.l = calendar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = SaveStressFromDeviceUseCase.this.new a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
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
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            e.f(coroutineScope, null, null, new C0607a(SaveStressFromDeviceUseCase.this, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null), 3, null);
            return e.f(coroutineScope, null, null, new b(SaveStressFromDeviceUseCase.this, this.d, this.e, this.f, this.g, this.h, this.i, this.l, this.k, null), 3, null);
        }
    }

    public SaveStressFromDeviceUseCase(@NotNull SingleStressRepository singleStressRepository, @NotNull AllDayStressRepository allDayStressRepository) {
        this.singleStressRepository = singleStressRepository;
        this.allDayStressRepository = allDayStressRepository;
    }

    @Nullable
    public final Object execute(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Calendar calendar, @NotNull Calendar calendar2, @NotNull Function2<? super Long, ? super Boolean, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        HMLog.i(LogTagUtilsKt.getTAG(this), "SaveStressFromDeviceUseCase execute", new Object[0]);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(str, i, i2, str2, str3, str4, calendar, function2, calendar2, null), continuation);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
