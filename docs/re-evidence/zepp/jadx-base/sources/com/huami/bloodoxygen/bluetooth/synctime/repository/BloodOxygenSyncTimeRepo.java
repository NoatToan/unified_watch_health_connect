package com.huami.bloodoxygen.bluetooth.synctime.repository;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.bluetooth.synctime.local.BloodOxygenSyncTimeKey;
import com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.BloodOxygenSyncTime;
import com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.PropertyApi;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0010J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0006R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR%\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;", "", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "syncTime", "", "c", "", "g", "b", "f", "e", "", "value", "newValue", "currentTime", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/flow/Flow;", "getBleSyncTimeFlow", "getRemoteBleSyncTime", "readBleSyncTime", "updateBleSyncTime", "initBleSyncTime", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/PropertyApi;", "a", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/PropertyApi;", "propertyApi", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "scope", "Lcom/huami/bloodoxygen/bluetooth/synctime/local/BloodOxygenSyncTimeKey;", "Lcom/huami/bloodoxygen/bluetooth/synctime/local/BloodOxygenSyncTimeKey;", "syncTimeKvKey", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "syncTimeFlow", "<init>", "(Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/PropertyApi;Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;Lcom/huami/bloodoxygen/bluetooth/synctime/local/BloodOxygenSyncTimeKey;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenSyncTimeRepo {

    @NotNull
    private static final String e = "BloodOxygenSyncTimeRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PropertyApi propertyApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenCoroutineScope scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenSyncTimeKey syncTimeKvKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncTimeFlow = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.bluetooth.synctime.repository.BloodOxygenSyncTimeRepo$initBleSyncTime$1", f = "BloodOxygenSyncTimeRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.bloodoxygen.bluetooth.synctime.repository.BloodOxygenSyncTimeRepo$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0291a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0291a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "initBleSyncTime error " + this.a.getMessage();
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodOxygenSyncTimeRepo.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BloodOxygenSyncTimeRepo bloodOxygenSyncTimeRepo = BloodOxygenSyncTimeRepo.this;
            try {
                Result.Companion companion = Result.Companion;
                BloodOxygenSyncTime remoteBleSyncTime = bloodOxygenSyncTimeRepo.getRemoteBleSyncTime();
                if (remoteBleSyncTime == null) {
                    return Unit.INSTANCE;
                }
                if (bloodOxygenSyncTimeRepo.b()) {
                    BloodOxygenSyncTime bleSyncTime = bloodOxygenSyncTimeRepo.readBleSyncTime();
                    if (bleSyncTime.getMax() > remoteBleSyncTime.getMax()) {
                        bloodOxygenSyncTimeRepo.c(bleSyncTime);
                        remoteBleSyncTime = bleSyncTime;
                    }
                }
                bloodOxygenSyncTimeRepo.f(remoteBleSyncTime);
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info(BloodOxygenSyncTimeRepo.e, new C0291a(thM3848exceptionOrNullimpl));
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Lkotlinx/coroutines/flow/MutableStateFlow;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableStateFlow<Long>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableStateFlow<Long> invoke() {
            MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
            BloodOxygenSyncTimeRepo bloodOxygenSyncTimeRepo = BloodOxygenSyncTimeRepo.this;
            if (bloodOxygenSyncTimeRepo.b()) {
                MutableStateFlow.setValue(Long.valueOf(bloodOxygenSyncTimeRepo.readBleSyncTime().getMax()));
            }
            return MutableStateFlow;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodOxygenSyncTime a;
        public final /* synthetic */ BloodOxygenSyncTime b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BloodOxygenSyncTime bloodOxygenSyncTime, BloodOxygenSyncTime bloodOxygenSyncTime2, long j) {
            super(0);
            this.a = bloodOxygenSyncTime;
            this.b = bloodOxygenSyncTime2;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeAndPostSyncTime spo2SyncSecondTime invalid " + this.a.getClickSpo2Time() + " " + this.b.getClickSpo2Time() + " " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodOxygenSyncTime a;
        public final /* synthetic */ BloodOxygenSyncTime b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BloodOxygenSyncTime bloodOxygenSyncTime, BloodOxygenSyncTime bloodOxygenSyncTime2, long j) {
            super(0);
            this.a = bloodOxygenSyncTime;
            this.b = bloodOxygenSyncTime2;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeAndPostSyncTime osaSpo2SyncSecondTime invalid " + this.a.getOsaProcessTime() + " " + this.b.getOsaProcessTime() + " " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodOxygenSyncTime a;
        public final /* synthetic */ BloodOxygenSyncTime b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BloodOxygenSyncTime bloodOxygenSyncTime, BloodOxygenSyncTime bloodOxygenSyncTime2, long j) {
            super(0);
            this.a = bloodOxygenSyncTime;
            this.b = bloodOxygenSyncTime2;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeAndPostSyncTime osaEventSyncSecondTime invalid " + this.a.getOsaEventTime() + " " + this.b.getOsaEventTime() + " " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodOxygenSyncTime a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BloodOxygenSyncTime bloodOxygenSyncTime) {
            super(0);
            this.a = bloodOxygenSyncTime;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateBleSyncTime " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.bluetooth.synctime.repository.BloodOxygenSyncTimeRepo$updateBleSyncTime$2", f = "BloodOxygenSyncTimeRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BloodOxygenSyncTime c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "postBloodOxygenSyncTime error " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BloodOxygenSyncTime bloodOxygenSyncTime, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = bloodOxygenSyncTime;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodOxygenSyncTimeRepo.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BloodOxygenSyncTimeRepo bloodOxygenSyncTimeRepo = BloodOxygenSyncTimeRepo.this;
            BloodOxygenSyncTime bloodOxygenSyncTime = this.c;
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(bloodOxygenSyncTimeRepo.c(bloodOxygenSyncTime)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(BloodOxygenSyncTimeRepo.e, new a(thM3848exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodOxygenSyncTime a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BloodOxygenSyncTime bloodOxygenSyncTime) {
            super(0);
            this.a = bloodOxygenSyncTime;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeAndPostSyncTime syncTime is same as local " + this.a;
        }
    }

    public BloodOxygenSyncTimeRepo(@NotNull PropertyApi propertyApi, @NotNull BloodOxygenCoroutineScope bloodOxygenCoroutineScope, @NotNull BloodOxygenSyncTimeKey bloodOxygenSyncTimeKey) {
        this.propertyApi = propertyApi;
        this.scope = bloodOxygenCoroutineScope;
        this.syncTimeKvKey = bloodOxygenSyncTimeKey;
    }

    private final MutableStateFlow<Long> a() {
        return (MutableStateFlow) this.syncTimeFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        return this.syncTimeKvKey.getBleSyncTime() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(BloodOxygenSyncTime syncTime) {
        return this.propertyApi.postBloodOxygenSyncTime(syncTime);
    }

    private final boolean d(long value, long newValue, long currentTime) {
        return value > currentTime || newValue <= 0 || newValue < value || newValue > currentTime;
    }

    private final BloodOxygenSyncTime e(BloodOxygenSyncTime bloodOxygenSyncTime) {
        long clickSpo2Time;
        BloodOxygenSyncTime bleSyncTime = readBleSyncTime();
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        BloodOxygenSyncTime bloodOxygenSyncTime2 = BloodOxygenSyncTime.INSTANCE.getDefault();
        if (d(bleSyncTime.getClickSpo2Time(), bloodOxygenSyncTime.getClickSpo2Time(), jCurrentTimeMillis)) {
            HMLog.info(e, new c(bleSyncTime, bloodOxygenSyncTime, jCurrentTimeMillis));
            clickSpo2Time = bloodOxygenSyncTime2.getClickSpo2Time();
        } else {
            clickSpo2Time = bloodOxygenSyncTime.getClickSpo2Time();
        }
        bleSyncTime.setClickSpo2Time(clickSpo2Time);
        boolean z = false;
        boolean z2 = true;
        if (d(bleSyncTime.getOsaProcessTime(), bloodOxygenSyncTime.getOsaProcessTime(), jCurrentTimeMillis)) {
            HMLog.info(e, new d(bleSyncTime, bloodOxygenSyncTime, jCurrentTimeMillis));
            z = true;
        } else {
            bleSyncTime.setOsaProcessTime(bloodOxygenSyncTime.getOsaProcessTime());
        }
        if (d(bleSyncTime.getOsaEventTime(), bloodOxygenSyncTime.getOsaEventTime(), jCurrentTimeMillis)) {
            HMLog.info(e, new e(bleSyncTime, bloodOxygenSyncTime, jCurrentTimeMillis));
        } else {
            bleSyncTime.setOsaEventTime(bloodOxygenSyncTime.getOsaEventTime());
            z2 = z;
        }
        if (z2) {
            bleSyncTime.setOsaProcessTime(bloodOxygenSyncTime2.getOsaProcessTime());
            bleSyncTime.setOsaEventTime(bloodOxygenSyncTime2.getOsaEventTime());
        }
        return bleSyncTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(BloodOxygenSyncTime syncTime) {
        BloodOxygenSyncTime bleSyncTime = this.syncTimeKvKey.getBleSyncTime();
        if (bleSyncTime != null && bleSyncTime.getClickSpo2Time() == syncTime.getClickSpo2Time() && bleSyncTime.getOsaProcessTime() == syncTime.getOsaProcessTime() && bleSyncTime.getOsaEventTime() == syncTime.getOsaEventTime()) {
            HMLog.info(e, new h(syncTime));
            return;
        }
        BloodOxygenSyncTime bloodOxygenSyncTimeE = e(syncTime);
        a().setValue(Long.valueOf(bloodOxygenSyncTimeE.getMax() * ((long) 1000)));
        g(bloodOxygenSyncTimeE);
    }

    private final void g(BloodOxygenSyncTime syncTime) {
        this.syncTimeKvKey.setBleSyncTime(syncTime);
    }

    @NotNull
    public final Flow<Long> getBleSyncTimeFlow() {
        return a();
    }

    @Nullable
    public final BloodOxygenSyncTime getRemoteBleSyncTime() {
        return this.propertyApi.getBloodOxygenSyncTime();
    }

    public final void initBleSyncTime() {
        kotlinx.coroutines.e.f(this.scope, null, null, new a(null), 3, null);
    }

    @NotNull
    public final BloodOxygenSyncTime readBleSyncTime() {
        BloodOxygenSyncTime bleSyncTime = this.syncTimeKvKey.getBleSyncTime();
        return bleSyncTime == null ? BloodOxygenSyncTime.INSTANCE.getDefault() : bleSyncTime;
    }

    public final void updateBleSyncTime(@NotNull BloodOxygenSyncTime syncTime) {
        HMLog.info(e, new f(syncTime));
        f(syncTime);
        kotlinx.coroutines.e.f(this.scope, null, null, new g(syncTime, null), 3, null);
    }
}
