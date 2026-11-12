package com.xiaomi.fitness.health.curse.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.DayData;
import com.xiaomi.fitness.health.curse.vm.CurseEditVM;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rJ\u001e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0018J\"\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020%0$J\u0012\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001d\u0010\u0013¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseEditVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "repo", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "getRepo", "()Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "setRepo", "(Lcom/xiaomi/fit/fitness/export/api/CurseApi;)V", "calendarRecord", "", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "deleteEmitter", "Landroidx/lifecycle/MutableLiveData;", "", "getDeleteEmitter", "()Landroidx/lifecycle/MutableLiveData;", "deleteEmitter$delegate", "Lkotlin/Lazy;", "delete", "record", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "addFromEditAct", "startMills", "endMills", "retObserver", "getRetObserver", "retObserver$delegate", "updateFromEditAct", "preRecord", "dealMarkAction", "mills", "records", "", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseEditVM extends AbsViewModel {
    public CurseApi repo;

    /* JADX INFO: renamed from: deleteEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: d65
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CurseEditVM.deleteEmitter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: retObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy retObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e65
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CurseEditVM.retObserver_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseEditVM$addFromEditAct$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseEditVM$addFromEditAct$1", f = "CurseEditVM.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endMills;
        final /* synthetic */ long $startMills;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseEditVM$addFromEditAct$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseEditVM$addFromEditAct$1$1", f = "CurseEditVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ long $endMills;
            final /* synthetic */ long $startMills;
            int label;
            final /* synthetic */ CurseEditVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05811(long j, long j2, CurseEditVM curseEditVM, Continuation<? super C05811> continuation) {
                super(2, continuation);
                this.$startMills = j;
                this.$endMills = j2;
                this.this$0 = curseEditVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05811(this.$startMills, this.$endMills, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Record record;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long j = this.$startMills - CurseRecordKt.SPACE_MIN_MILLS;
                long j2 = this.$endMills + CurseRecordKt.SPACE_MIN_MILLS;
                Logger.i("CurseEditVM", "addFromEditAct: startMills = " + new LocalDate(this.$startMills) + "; endMills = " + new LocalDate(this.$endMills));
                List<Record> period = this.this$0.getRepo().getPeriod(j, j2);
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                if (period.isEmpty()) {
                    record = new Record(this.$startMills, this.$endMills, jCurrentTimeMillis, CurseManager.INSTANCE.getInstance().getInterval(), 0, 16, null);
                } else {
                    record = new Record(Math.min(((Record) CollectionsKt___CollectionsKt.first((List) period)).getStartMills(), this.$startMills), Math.max(((Record) CollectionsKt___CollectionsKt.last((List) period)).getEndMills(), this.$endMills), jCurrentTimeMillis, CurseManager.INSTANCE.getInstance().getInterval(), 0, 16, null);
                }
                ArrayList arrayList = new ArrayList();
                Record beforePeriod = this.this$0.getRepo().getBeforePeriod(this.$startMills);
                if (beforePeriod != null) {
                    beforePeriod.setInterval(TimeDateUtil.getIntervalDay(beforePeriod.getStartMills(), this.$startMills));
                    arrayList.add(beforePeriod);
                }
                Record firstAfter = this.this$0.getRepo().getFirstAfter(this.$endMills);
                record.setInterval(firstAfter != null ? TimeDateUtil.getIntervalDay(record.getStartMills(), firstAfter.getStartMills()) : CurseManager.INSTANCE.getInstance().getInterval());
                Logger.i("CurseEditVM", "addFromEditAct: final = " + record);
                CurseApi.DefaultImpls.batchActionRecord$default(this.this$0.getRepo(), arrayList, period, CollectionsKt__CollectionsJVMKt.listOf(record), null, null, 24, null);
                this.this$0.getRepo().updateLastModify(jCurrentTimeMillis);
                FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "add_or_delete", null, 4, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$startMills = j;
            this.$endMills = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseEditVM.this.new AnonymousClass1(this.$startMills, this.$endMills, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05811 c05811 = new C05811(this.$startMills, this.$endMills, CurseEditVM.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05811, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CurseEditVM.this.getRetObserver().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseEditVM$calendarRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseEditVM$calendarRecord$1", f = "CurseEditVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $end;
        final /* synthetic */ long $start;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24221(long j, long j2, Continuation<? super C24221> continuation) {
            super(2, continuation);
            this.$start = j;
            this.$end = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24221(this.$start, this.$end, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseEditVMKt.calendarActionRecord(this.$start, this.$end);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseEditVM$dealMarkAction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseEditVM$dealMarkAction$1", f = "CurseEditVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $mills;
        final /* synthetic */ Map<Long, DayData> $records;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24231(long j, Map<Long, DayData> map, Continuation<? super C24231> continuation) {
            super(2, continuation);
            this.$mills = j;
            this.$records = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24231(this.$mills, this.$records, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseEditVMKt.dealCurseMarkAction(this.$mills, this.$records);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseEditVM$delete$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseEditVM$delete$1", f = "CurseEditVM.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Record $record;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseEditVM$delete$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseEditVM$delete$1$1", f = "CurseEditVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Record $record;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05821(Record record, Continuation<? super C05821> continuation) {
                super(2, continuation);
                this.$record = record;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05821(this.$record, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CurseEditVMKt.actionDelete(this.$record);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24241(Record record, Continuation<? super C24241> continuation) {
            super(2, continuation);
            this.$record = record;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseEditVM.this.new C24241(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05821 c05821 = new C05821(this.$record, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05821, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CurseEditVM.this.getDeleteEmitter().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseEditVM$updateFromEditAct$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseEditVM$updateFromEditAct$1", f = "CurseEditVM.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endMills;
        final /* synthetic */ Record $preRecord;
        final /* synthetic */ long $startMills;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseEditVM$updateFromEditAct$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseEditVM$updateFromEditAct$1$1", f = "CurseEditVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCurseEditVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseEditVM.kt\ncom/xiaomi/fitness/health/curse/vm/CurseEditVM$updateFromEditAct$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,313:1\n774#2:314\n865#2,2:315\n1#3:317\n*S KotlinDebug\n*F\n+ 1 CurseEditVM.kt\ncom/xiaomi/fitness/health/curse/vm/CurseEditVM$updateFromEditAct$1$1\n*L\n205#1:314\n205#1:315,2\n*E\n"})
        public static final class C05831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ long $endMills;
            final /* synthetic */ Record $preRecord;
            final /* synthetic */ long $startMills;
            int label;
            final /* synthetic */ CurseEditVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05831(long j, long j2, Record record, CurseEditVM curseEditVM, Continuation<? super C05831> continuation) {
                super(2, continuation);
                this.$startMills = j;
                this.$endMills = j2;
                this.$preRecord = record;
                this.this$0 = curseEditVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05831(this.$startMills, this.$endMills, this.$preRecord, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long j = this.$startMills;
                long j2 = j - CurseRecordKt.SPACE_MIN_MILLS;
                long j3 = this.$endMills;
                long j4 = CurseRecordKt.SPACE_MIN_MILLS + j3;
                Logger.i("CurseEditVM", "updateFromEditAct: startMills = " + j + "; endMills = " + j3 + "; " + this.$preRecord);
                List<Record> period = this.this$0.getRepo().getPeriod(j2, j4);
                Record record = this.$preRecord;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : period) {
                    if (((Record) obj2).getId() != record.getId()) {
                        arrayList.add(obj2);
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                Record record2 = arrayList.isEmpty() ? new Record(this.$startMills, this.$endMills, jCurrentTimeMillis, CurseManager.INSTANCE.getInstance().getInterval(), 0, 16, null) : new Record(Math.min(((Record) CollectionsKt___CollectionsKt.first((List) arrayList)).getStartMills(), this.$startMills), Math.max(((Record) CollectionsKt___CollectionsKt.last((List) arrayList)).getEndMills(), this.$endMills), jCurrentTimeMillis, CurseManager.INSTANCE.getInstance().getInterval(), 0, 16, null);
                ArrayList arrayList2 = new ArrayList();
                Record beforePeriod = this.this$0.getRepo().getBeforePeriod(this.$startMills);
                if (beforePeriod != null) {
                    beforePeriod.setInterval(TimeDateUtil.getIntervalDay(beforePeriod.getStartMills(), this.$startMills));
                    arrayList2.add(beforePeriod);
                }
                Record firstAfter = this.this$0.getRepo().getFirstAfter(this.$endMills);
                record2.setInterval(firstAfter != null ? TimeDateUtil.getIntervalDay(record2.getStartMills(), firstAfter.getStartMills()) : CurseManager.INSTANCE.getInstance().getInterval());
                long startMills = this.$preRecord.getStartMills();
                long endMills = this.$preRecord.getEndMills();
                long startMills2 = record2.getStartMills();
                long endMills2 = record2.getEndMills();
                ArrayList arrayList3 = new ArrayList();
                if (endMills2 < startMills || startMills2 > endMills) {
                    arrayList3.addAll(CurseExtKt.genSymptomKeys(this.$preRecord.getStartMills(), this.$preRecord.getEndMills()));
                } else if (startMills2 <= startMills && endMills2 >= endMills) {
                    Logger.d("CurseEditVM", "update: larger");
                } else if (startMills2 >= startMills && endMills2 <= endMills) {
                    arrayList3.addAll(CurseExtKt.genSymptomKeys(startMills, startMills2 - 86400000));
                    arrayList3.addAll(CurseExtKt.genSymptomKeys(endMills2 + 86400000, endMills));
                } else if (startMills2 <= startMills && startMills <= endMills2) {
                    arrayList3.addAll(CurseExtKt.genSymptomKeys(endMills2 + 86400000, endMills));
                } else if (startMills2 <= endMills && endMills <= endMills2) {
                    arrayList3.addAll(CurseExtKt.genSymptomKeys(startMills, startMills2 - 86400000));
                }
                Logger.i("CurseEditVM", "addOrUpdate: final = " + record2);
                ArrayList arrayList4 = new ArrayList(arrayList);
                arrayList4.add(this.$preRecord);
                CurseApi.DefaultImpls.batchActionRecord$default(this.this$0.getRepo(), arrayList2, arrayList4, CollectionsKt__CollectionsJVMKt.listOf(record2), null, arrayList3, 8, null);
                this.this$0.getRepo().updateLastModify(jCurrentTimeMillis);
                FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "add_or_delete", null, 4, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24251(long j, long j2, Record record, Continuation<? super C24251> continuation) {
            super(2, continuation);
            this.$startMills = j;
            this.$endMills = j2;
            this.$preRecord = record;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseEditVM.this.new C24251(this.$startMills, this.$endMills, this.$preRecord, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C05831 c05831 = new C05831(this.$startMills, this.$endMills, this.$preRecord, CurseEditVM.this, null);
                    this.label = 1;
                    if (BuildersKt.withContext(io2, c05831, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CurseEditVM.this.getRetObserver().setValue(Boxing.boxBoolean(true));
            } catch (Exception e) {
                Logger.e("CurseEditVM", "update: " + e.getMessage());
                CurseEditVM.this.getRetObserver().setValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData deleteEmitter_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData retObserver_delegate$lambda$1() {
        return new MutableLiveData();
    }

    public final void addFromEditAct(long startMills, long endMills) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(startMills, endMills, null), 3, null);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void calendarRecord(long start, long end) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24221(start, end, null), 2, null);
    }

    public final void dealMarkAction(long mills, @NotNull Map<Long, DayData> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24231(mills, records, null), 2, null);
    }

    public final void delete(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "record");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C24241(record, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteEmitter() {
        return (MutableLiveData) this.deleteEmitter.getValue();
    }

    @NotNull
    public final CurseApi getRepo() {
        CurseApi curseApi = this.repo;
        if (curseApi != null) {
            return curseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repo");
        return null;
    }

    @NotNull
    public final MutableLiveData<Boolean> getRetObserver() {
        return (MutableLiveData) this.retObserver.getValue();
    }

    public final void setRepo(@NotNull CurseApi curseApi) {
        Intrinsics.checkNotNullParameter(curseApi, "<set-?>");
        this.repo = curseApi;
    }

    public final void updateFromEditAct(long startMills, long endMills, @NotNull Record preRecord) {
        Intrinsics.checkNotNullParameter(preRecord, "preRecord");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C24251(startMills, endMills, preRecord, null), 3, null);
    }
}
