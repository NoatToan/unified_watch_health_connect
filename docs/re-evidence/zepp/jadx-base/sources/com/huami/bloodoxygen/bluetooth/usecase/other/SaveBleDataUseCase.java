package com.huami.bloodoxygen.bluetooth.usecase.other;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.BloodOxygenSyncTime;
import com.huami.bloodoxygen.bluetooth.synctime.repository.BloodOxygenSyncTimeRepo;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.bloodoxygen.core.local.process.OdiFactory;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!Jf\u0010\u000f\u001a\u00020\f2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/usecase/other/SaveBleDataUseCase;", "", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "spo2s", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "osaProcesses", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "osaEvents", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "bleSyncTime", "Lkotlin/Function0;", "", "onSuccess", "onFailed", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;", "a", "Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;", "syncTimeRepo", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "b", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "c", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "scope", "Lcom/huami/bloodoxygen/core/local/process/OdiFactory;", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodoxygen/core/local/process/OdiFactory;", "odiFactory", "<init>", "(Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;Lcom/huami/bloodoxygen/core/local/process/OdiFactory;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SaveBleDataUseCase {

    @NotNull
    private static final String e = "SaveBleDataUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenSyncTimeRepo syncTimeRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenCoroutineScope scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final OdiFactory odiFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.bluetooth.usecase.other.SaveBleDataUseCase$execute$1$1", f = "SaveBleDataUseCase.kt", i = {}, l = {60, 64}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<ClickMeasuredSpo2> c;
        public final /* synthetic */ List<OriginOsaProcess> d;
        public final /* synthetic */ List<OriginOsaEvent> e;
        public final /* synthetic */ BloodOxygenSyncTime f;
        public final /* synthetic */ Function0<Unit> g;
        public final /* synthetic */ Function0<Unit> h;

        /* JADX INFO: renamed from: com.huami.bloodoxygen.bluetooth.usecase.other.SaveBleDataUseCase$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0292a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<ClickMeasuredSpo2> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0292a(List<ClickMeasuredSpo2> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                int size = this.a.size();
                ClickMeasuredSpo2 clickMeasuredSpo2 = (ClickMeasuredSpo2) CollectionsKt.firstOrNull((List) this.a);
                Long lValueOf = clickMeasuredSpo2 == null ? null : Long.valueOf(clickMeasuredSpo2.getTimestamp());
                ClickMeasuredSpo2 clickMeasuredSpo3 = (ClickMeasuredSpo2) CollectionsKt.lastOrNull((List) this.a);
                return "SaveBleDataUseCase clickSpo2s " + size + " " + lValueOf + " " + (clickMeasuredSpo3 != null ? Long.valueOf(clickMeasuredSpo3.getTimestamp()) : null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ List<OriginOsaProcess> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List<OriginOsaProcess> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                int size = this.a.size();
                OriginOsaProcess originOsaProcess = (OriginOsaProcess) CollectionsKt.firstOrNull((List) this.a);
                Long lValueOf = originOsaProcess == null ? null : Long.valueOf(originOsaProcess.getTimestamp());
                OriginOsaProcess originOsaProcess2 = (OriginOsaProcess) CollectionsKt.lastOrNull((List) this.a);
                return "SaveBleDataUseCase osaProcesses " + size + " " + lValueOf + " " + (originOsaProcess2 != null ? Long.valueOf(originOsaProcess2.getTimestamp()) : null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ List<OriginOsaEvent> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List<OriginOsaEvent> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                int size = this.a.size();
                OriginOsaEvent originOsaEvent = (OriginOsaEvent) CollectionsKt.firstOrNull((List) this.a);
                Long lValueOf = originOsaEvent == null ? null : Long.valueOf(originOsaEvent.getTimestamp());
                OriginOsaEvent originOsaEvent2 = (OriginOsaEvent) CollectionsKt.lastOrNull((List) this.a);
                return "SaveBleDataUseCase osaEvents " + size + " " + lValueOf + " " + (originOsaEvent2 != null ? Long.valueOf(originOsaEvent2.getTimestamp()) : null);
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
            public final String invoke() {
                return "SaveBleDataUseCase add success";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bloodoxygen.bluetooth.usecase.other.SaveBleDataUseCase$execute$1$1$6", f = "SaveBleDataUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function0<Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Function0<Unit> function0, Continuation<? super e> continuation) {
                super(2, continuation);
                this.b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new e(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function0<Unit> function0 = this.b;
                if (function0 == null) {
                    return null;
                }
                function0.invoke();
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bloodoxygen.bluetooth.usecase.other.SaveBleDataUseCase$execute$1$1$7", f = "SaveBleDataUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
                Function0<Unit> function0 = this.b;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<ClickMeasuredSpo2> list, List<OriginOsaProcess> list2, List<OriginOsaEvent> list3, BloodOxygenSyncTime bloodOxygenSyncTime, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = list2;
            this.e = list3;
            this.f = bloodOxygenSyncTime;
            this.g = function0;
            this.h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SaveBleDataUseCase.this.new a(this.c, this.d, this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
            HMLog.info$default(null, new C0292a(this.c), 1, null);
            HMLog.info$default(null, new b(this.d), 1, null);
            HMLog.info$default(null, new c(this.e), 1, null);
            if (SaveBleDataUseCase.this.repo.add(this.c, this.d, this.e)) {
                HMLog.info$default(null, d.a, 1, null);
                BloodOxygenSyncTime bloodOxygenSyncTime = this.f;
                if (bloodOxygenSyncTime != null) {
                    SaveBleDataUseCase.this.syncTimeRepo.updateBleSyncTime(bloodOxygenSyncTime);
                }
                SaveBleDataUseCase.this.odiFactory.filterToProduce(this.d);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                e eVar = new e(this.g, null);
                this.a = 1;
                if (BuildersKt.withContext(main, eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            f fVar = new f(this.h, null);
            this.a = 2;
            if (BuildersKt.withContext(main2, fVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "error " + this.a.getMessage();
        }
    }

    public SaveBleDataUseCase(@NotNull BloodOxygenSyncTimeRepo bloodOxygenSyncTimeRepo, @NotNull IBloodOxygenRepo iBloodOxygenRepo, @NotNull BloodOxygenCoroutineScope bloodOxygenCoroutineScope, @NotNull OdiFactory odiFactory) {
        this.syncTimeRepo = bloodOxygenSyncTimeRepo;
        this.repo = iBloodOxygenRepo;
        this.scope = bloodOxygenCoroutineScope;
        this.odiFactory = odiFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void execute$default(SaveBleDataUseCase saveBleDataUseCase, List list, List list2, List list3, BloodOxygenSyncTime bloodOxygenSyncTime, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            list3 = CollectionsKt__CollectionsKt.emptyList();
        }
        saveBleDataUseCase.execute(list, list4, list3, (i & 8) != 0 ? null : bloodOxygenSyncTime, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : function1);
    }

    public final void execute(@NotNull List<ClickMeasuredSpo2> spo2s, @NotNull List<OriginOsaProcess> osaProcesses, @NotNull List<OriginOsaEvent> osaEvents, @Nullable BloodOxygenSyncTime bleSyncTime, @Nullable Function0<Unit> onSuccess, @Nullable Function0<Unit> onFailed) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            try {
                objM3845constructorimpl = Result.m3845constructorimpl(e.f(this.scope, null, null, new a(spo2s, osaProcesses, osaEvents, bleSyncTime, onSuccess, onFailed, null), 3, null));
            } catch (Throwable th) {
                th = th;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(e, new b(thM3848exceptionOrNullimpl));
            if (onFailed == null) {
                return;
            }
            onFailed.invoke();
        }
    }
}
