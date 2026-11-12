package com.xiaomi.fitness.health.sleep.rhythm.diary;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fit.fitness.export.data.project.SleepNapSituation;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\tJ\"\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0082@¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "repo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "getRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "updateSleepDiaryInfo", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "getUpdateSleepDiaryInfo", "()Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "setUpdateSleepDiaryInfo", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;)V", "localSleepDiaryInfo", "Landroidx/lifecycle/MutableLiveData;", "getLocalSleepDiaryInfo", "()Landroidx/lifecycle/MutableLiveData;", "getSleepDiaryReport", "", "time", "", "addSleepDiaryReportResult", "", "getAddSleepDiaryReportResult", "addSleepDiaryReport", "remoteData", "getSleepDiaryReportFromRemote", "sid", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepDiaryUpdateViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "SleepDiaryUpdateViewModel";

    @NotNull
    private final MutableLiveData<Boolean> addSleepDiaryReportResult;

    @NotNull
    private final MutableLiveData<SleepDiaryReport> localSleepDiaryInfo;

    @NotNull
    private final ISleepRepository repo = (ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class);

    @NotNull
    private SleepDiaryReport updateSleepDiaryInfo;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateViewModel$addSleepDiaryReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateViewModel$addSleepDiaryReport$1", f = "SleepDiaryUpdateViewModel.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SleepDiaryReport $remoteData;
        int label;
        final /* synthetic */ SleepDiaryUpdateViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SleepDiaryReport sleepDiaryReport, SleepDiaryUpdateViewModel sleepDiaryUpdateViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$remoteData = sleepDiaryReport;
            this.this$0 = sleepDiaryUpdateViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$remoteData, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long time = this.$remoteData.getTime();
                SleepDiaryReport sleepDiaryReport = this.$remoteData;
                List<SleepNapSituation> napSituation = sleepDiaryReport != null ? sleepDiaryReport.getNapSituation() : null;
                SleepDiaryReport sleepDiaryReport2 = this.$remoteData;
                List<SleepMedicationDetail> medicationBeforeBedtime = sleepDiaryReport2 != null ? sleepDiaryReport2.getMedicationBeforeBedtime() : null;
                SleepDiaryReport sleepDiaryReport3 = this.$remoteData;
                Long preSleepRoutineTime = sleepDiaryReport3 != null ? sleepDiaryReport3.getPreSleepRoutineTime() : null;
                SleepDiaryReport sleepDiaryReport4 = this.$remoteData;
                Integer fallAsleepDuration = sleepDiaryReport4 != null ? sleepDiaryReport4.getFallAsleepDuration() : null;
                SleepDiaryReport sleepDiaryReport5 = this.$remoteData;
                Integer awakeCount = sleepDiaryReport5 != null ? sleepDiaryReport5.getAwakeCount() : null;
                SleepDiaryReport sleepDiaryReport6 = this.$remoteData;
                List<Integer> fallAsleepAgainDuration = sleepDiaryReport6 != null ? sleepDiaryReport6.getFallAsleepAgainDuration() : null;
                SleepDiaryReport sleepDiaryReport7 = this.$remoteData;
                Long morningWakeUpTime = sleepDiaryReport7 != null ? sleepDiaryReport7.getMorningWakeUpTime() : null;
                SleepDiaryReport sleepDiaryReport8 = this.$remoteData;
                Long morningGettingUpTime = sleepDiaryReport8 != null ? sleepDiaryReport8.getMorningGettingUpTime() : null;
                SleepDiaryReport sleepDiaryReport9 = this.$remoteData;
                Integer insomniaDifficulty = sleepDiaryReport9 != null ? sleepDiaryReport9.getInsomniaDifficulty() : null;
                SleepDiaryReport sleepDiaryReport10 = this.$remoteData;
                Integer sleepQuality = sleepDiaryReport10 != null ? sleepDiaryReport10.getSleepQuality() : null;
                SleepDiaryReport sleepDiaryReport11 = this.$remoteData;
                Logger.i(SleepDiaryUpdateViewModel.TAG, "addSleepDiaryReport = " + time + " napSituation " + napSituation + " medicationBeforeBedtime " + medicationBeforeBedtime + " preSleepRoutineTime" + preSleepRoutineTime + " fallAsleepDuration" + fallAsleepDuration + " awakeCount" + awakeCount + " fallAsleepAgainDuration" + fallAsleepAgainDuration + " morningWakeUpTime" + morningWakeUpTime + " morningGettingUpTime" + morningGettingUpTime + " insomniaDifficulty" + insomniaDifficulty + " sleepQuality" + sleepQuality + " sid" + (sleepDiaryReport11 != null ? sleepDiaryReport11.getSid() : null));
                ISleepRepository repo = this.this$0.getRepo();
                String sid = this.$remoteData.getSid();
                if (sid == null) {
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
                    sid = did == null ? "" : did;
                }
                SleepDiaryReport sleepDiaryReport12 = this.$remoteData;
                this.label = 1;
                if (repo.addSleepDiaryReport(sid, sleepDiaryReport12, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateViewModel$getSleepDiaryReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateViewModel$getSleepDiaryReport$1", f = "SleepDiaryUpdateViewModel.kt", i = {}, l = {40, 57}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSleepDiaryUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDiaryUpdateViewModel.kt\ncom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateViewModel$getSleepDiaryReport$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1863#2,2:125\n*S KotlinDebug\n*F\n+ 1 SleepDiaryUpdateViewModel.kt\ncom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateViewModel$getSleepDiaryReport$1\n*L\n74#1:125,2\n*E\n"})
    public static final class C25091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $time;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25091(long j, Continuation<? super C25091> continuation) {
            super(2, continuation);
            this.$time = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepDiaryUpdateViewModel.this.new C25091(this.$time, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x0146  */
        /* JADX WARN: Code duplicated, block: B:55:0x014b  */
        /* JADX WARN: Code duplicated, block: B:58:0x0169  */
        /* JADX WARN: Code duplicated, block: B:59:0x0177  */
        /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:70:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:78:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:91:0x01ce A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x01bb A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object sleepDiaryReportFromRemote;
            SleepDiaryReport sleepDiaryReport;
            Object sleepProjectReport;
            SleepProjectReport sleepProjectReport2;
            Map<Long, List<SleepSegmentReport>> sleepReport;
            SleepDiaryReport sleepDiaryReport2;
            List<SleepSegmentReport> list;
            List<SleepSegmentReport> list2;
            List<SleepMedicationDetail> medicationBeforeBedtime;
            ArrayList arrayList;
            List<SleepStateItem> sleepItems;
            C25091 c25091 = this;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = c25091.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    sleepDiaryReportFromRemote = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    sleepProjectReport = obj;
                }
                sleepProjectReport2 = (SleepProjectReport) sleepProjectReport;
                if (sleepProjectReport2 != null) {
                    sleepReport = sleepProjectReport2.getSleepReport();
                } else {
                    sleepReport = null;
                }
                sleepDiaryReport2 = new SleepDiaryReport(c25091.$time);
                Logger.i(SleepDiaryUpdateViewModel.TAG, "sleepDiaryList = " + sleepReport);
                if (sleepReport != null) {
                    list = sleepReport.get(Boxing.boxLong(c25091.$time));
                } else {
                    list = null;
                }
                Logger.i(SleepDiaryUpdateViewModel.TAG, "getSleepDiaryReport = " + list);
                list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    sleepDiaryReport2.setAwakeCount(list.get(0).getWakeCount());
                    arrayList = new ArrayList();
                    sleepItems = list.get(0).getSleepItems();
                    if (sleepItems != null) {
                        for (SleepStateItem sleepStateItem : sleepItems) {
                            if (sleepStateItem.getSleepState() == 5) {
                                arrayList.add(Boxing.boxInt((int) TimeUnit.SECONDS.toMinutes(sleepStateItem.getEndTime() - sleepStateItem.getStartTime())));
                            }
                        }
                    }
                    sleepDiaryReport2.setFallAsleepAgainDuration(arrayList);
                }
                medicationBeforeBedtime = sleepDiaryReport2.getMedicationBeforeBedtime();
                if (medicationBeforeBedtime != null || medicationBeforeBedtime.isEmpty()) {
                    sleepDiaryReport2.setMedicationBeforeBedtime(sleepDiaryReport2.getLastMedicationBeforeBedtime());
                }
                SleepDiaryUpdateViewModel.this.getLocalSleepDiaryInfo().postValue(sleepDiaryReport2);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SleepDiaryUpdateViewModel sleepDiaryUpdateViewModel = SleepDiaryUpdateViewModel.this;
            long j = c25091.$time;
            String sid = sleepDiaryUpdateViewModel.getUpdateSleepDiaryInfo().getSid();
            c25091.label = 1;
            sleepDiaryReportFromRemote = sleepDiaryUpdateViewModel.getSleepDiaryReportFromRemote(j, sid, c25091);
            if (sleepDiaryReportFromRemote == coroutine_suspended) {
                return coroutine_suspended;
            }
            SleepDiaryReport sleepDiaryReport3 = (SleepDiaryReport) sleepDiaryReportFromRemote;
            Logger.i(SleepDiaryUpdateViewModel.TAG, "getSleepDiaryReport = " + c25091.$time + " napSituation " + (sleepDiaryReport3 != null ? sleepDiaryReport3.getNapSituation() : null) + " medicationBeforeBedtime " + (sleepDiaryReport3 != null ? sleepDiaryReport3.getMedicationBeforeBedtime() : null) + " preSleepRoutineTime" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getPreSleepRoutineTime() : null) + " fallAsleepDuration" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getFallAsleepDuration() : null) + " awakeCount" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getAwakeCount() : null) + " fallAsleepAgainDuration" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getFallAsleepAgainDuration() : null) + " morningWakeUpTime" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getMorningWakeUpTime() : null) + " morningGettingUpTime" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getMorningGettingUpTime() : null) + " insomniaDifficulty" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getInsomniaDifficulty() : null) + " sleepQuality" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getSleepQuality() : null) + " sid" + (sleepDiaryReport3 != null ? sleepDiaryReport3.getSid() : null));
            if (sleepDiaryReport3 == 0) {
                c25091 = this;
                ISleepRepository repo = SleepDiaryUpdateViewModel.this.getRepo();
                long j2 = c25091.$time;
                long j3 = ((long) RepositoryManager.GAP_A_DAY) + j2;
                String sid2 = SleepDiaryUpdateViewModel.this.getUpdateSleepDiaryInfo().getSid();
                c25091.label = 2;
                sleepProjectReport = repo.getSleepProjectReport(j2, j3, sid2, this);
                if (sleepProjectReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepProjectReport2 = (SleepProjectReport) sleepProjectReport;
                if (sleepProjectReport2 != null) {
                    sleepReport = sleepProjectReport2.getSleepReport();
                } else {
                    sleepReport = null;
                }
                sleepDiaryReport2 = new SleepDiaryReport(c25091.$time);
                Logger.i(SleepDiaryUpdateViewModel.TAG, "sleepDiaryList = " + sleepReport);
                if (sleepReport != null) {
                    list = sleepReport.get(Boxing.boxLong(c25091.$time));
                } else {
                    list = null;
                }
                Logger.i(SleepDiaryUpdateViewModel.TAG, "getSleepDiaryReport = " + list);
                list2 = list;
                if (list2 != null) {
                    sleepDiaryReport2.setAwakeCount(list.get(0).getWakeCount());
                    arrayList = new ArrayList();
                    sleepItems = list.get(0).getSleepItems();
                    if (sleepItems != null) {
                        while (r0.hasNext()) {
                            if (sleepStateItem.getSleepState() == 5) {
                                arrayList.add(Boxing.boxInt((int) TimeUnit.SECONDS.toMinutes(sleepStateItem.getEndTime() - sleepStateItem.getStartTime())));
                            }
                        }
                    }
                    sleepDiaryReport2.setFallAsleepAgainDuration(arrayList);
                }
                medicationBeforeBedtime = sleepDiaryReport2.getMedicationBeforeBedtime();
                if (medicationBeforeBedtime != null) {
                    sleepDiaryReport2.setMedicationBeforeBedtime(sleepDiaryReport2.getLastMedicationBeforeBedtime());
                } else {
                    sleepDiaryReport2.setMedicationBeforeBedtime(sleepDiaryReport2.getLastMedicationBeforeBedtime());
                }
                SleepDiaryUpdateViewModel.this.getLocalSleepDiaryInfo().postValue(sleepDiaryReport2);
            } else {
                List<SleepMedicationDetail> medicationBeforeBedtime2 = sleepDiaryReport3.getMedicationBeforeBedtime();
                if (medicationBeforeBedtime2 == null || medicationBeforeBedtime2.isEmpty()) {
                    sleepDiaryReport = sleepDiaryReport3;
                    sleepDiaryReport.setMedicationBeforeBedtime(sleepDiaryReport3.getLastMedicationBeforeBedtime());
                } else {
                    sleepDiaryReport = sleepDiaryReport3;
                }
                SleepDiaryUpdateViewModel.this.getLocalSleepDiaryInfo().postValue(sleepDiaryReport);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateViewModel$getSleepDiaryReportFromRemote$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateViewModel$getSleepDiaryReportFromRemote$2", f = "SleepDiaryUpdateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SleepDiaryReport>, Object> {
        final /* synthetic */ String $sid;
        final /* synthetic */ long $time;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$time = j;
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepDiaryUpdateViewModel.this.new AnonymousClass2(this.$time, this.$sid, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SleepDiaryUpdateViewModel.this.getRepo().getSleepDiaryReport(this.$time, this.$sid);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SleepDiaryReport> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SleepDiaryUpdateViewModel() {
        SleepDiaryReport sleepDiaryReport = new SleepDiaryReport(System.currentTimeMillis() / ((long) 1000));
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        sleepDiaryReport.setSid(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null);
        this.updateSleepDiaryInfo = sleepDiaryReport;
        this.localSleepDiaryInfo = new MutableLiveData<>();
        this.addSleepDiaryReportResult = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSleepDiaryReportFromRemote(long j, String str, Continuation<? super SleepDiaryReport> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(j, str, null), continuation);
    }

    public final void addSleepDiaryReport(@NotNull SleepDiaryReport remoteData) {
        Intrinsics.checkNotNullParameter(remoteData, "remoteData");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(remoteData, this, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getAddSleepDiaryReportResult() {
        return this.addSleepDiaryReportResult;
    }

    @NotNull
    public final MutableLiveData<SleepDiaryReport> getLocalSleepDiaryInfo() {
        return this.localSleepDiaryInfo;
    }

    @NotNull
    public final ISleepRepository getRepo() {
        return this.repo;
    }

    public final void getSleepDiaryReport(long time) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25091(time, null), 3, null);
    }

    @NotNull
    public final SleepDiaryReport getUpdateSleepDiaryInfo() {
        return this.updateSleepDiaryInfo;
    }

    public final void setUpdateSleepDiaryInfo(@NotNull SleepDiaryReport sleepDiaryReport) {
        Intrinsics.checkNotNullParameter(sleepDiaryReport, "<set-?>");
        this.updateSleepDiaryInfo = sleepDiaryReport;
    }
}
