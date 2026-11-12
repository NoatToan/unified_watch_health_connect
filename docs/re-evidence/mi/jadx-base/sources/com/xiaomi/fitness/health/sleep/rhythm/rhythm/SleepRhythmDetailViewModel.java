package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.rhythm.data.ResearchPresignedUrlResponse;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmAuthConfig;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmAuthConfigKt;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmProjectUserInfo;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel;
import com.xiaomi.fitness.mine.export.MineSettingManager;
import com.xiaomi.fitness.mine.export.MineSettingManagerExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.request.HealthHttpRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130$J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130$J=\u0010&\u001a\u00020\u001a2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001a0*j\b\u0012\u0004\u0012\u00020)`(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0*¢\u0006\u0002\u0010,Je\u0010-\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001f2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0*j\b\u0012\u0004\u0012\u00020\u0013`(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0*¢\u0006\u0002\u00102J<\u00103\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u00104\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001c2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020\u001a06J\u0006\u00108\u001a\u00020\u001aJ.\u0010=\u001a\b\u0012\u0004\u0012\u00020;0:2\b\u0010>\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0018R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "repo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "getRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "localSleepRhythmDiaryInfoData", "Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;", "getLocalSleepRhythmDiaryInfoData", "()Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;", "setLocalSleepRhythmDiaryInfoData", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;)V", "localSleepRhythmDiaryInfo", "Landroidx/lifecycle/MutableLiveData;", "getLocalSleepRhythmDiaryInfo", "()Landroidx/lifecycle/MutableLiveData;", "hasPullAllData", "", "getHasPullAllData", "deleteDataSuccess", "getDeleteDataSuccess", "setDeleteDataSuccess", "(Landroidx/lifecycle/MutableLiveData;)V", "requestRhythmData", "", "startTime", "", "endTime", "sid", "", "deleteSleepRhythmReport", "report", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "querySleepRhythmThirdAuthStatus", "Landroidx/lifecycle/LiveData;", "setThirdPartyAuthStatus", "getUserInfo", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfo;", "Lkotlin/Function1;", "fail", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setUserInfo", "timestamp", "url", "name", "phone_num", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getPDFUploadUrl", "file", "uploadResult", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/ResearchPresignedUrlResponse;", "getPullRecentOneYearDataStatus", "allSleepRecordItem", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;", "outShowSleepRecordItem", "convertBasicSleepData", "sleepRhythmReports", "cycleDay", "", "showOut", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmDetailViewModel.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n774#2:193\n865#2,2:194\n*S KotlinDebug\n*F\n+ 1 SleepRhythmDetailViewModel.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel\n*L\n187#1:193\n187#1:194,2\n*E\n"})
public final class SleepRhythmDetailViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "SleepRhythmDetailViewModel";

    @NotNull
    private final List<SleepRhythmChatListAdapter.SleepRhythmChartValue> allSleepRecordItem;

    @NotNull
    private MutableLiveData<Boolean> deleteDataSuccess;

    @NotNull
    private final MutableLiveData<Boolean> hasPullAllData;

    @Nullable
    private SleepProjectReport localSleepRhythmDiaryInfoData;

    @NotNull
    private final List<SleepRhythmChatListAdapter.SleepRhythmChartValue> outShowSleepRecordItem;

    @NotNull
    private final ISleepRepository repo = (ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class);

    @NotNull
    private final MutableLiveData<SleepProjectReport> localSleepRhythmDiaryInfo = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$deleteSleepRhythmReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$deleteSleepRhythmReport$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SleepRhythmReport $report;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$deleteSleepRhythmReport$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$deleteSleepRhythmReport$1$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SleepRhythmReport $report;
            Object L$0;
            int label;
            final /* synthetic */ SleepRhythmDetailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06111(SleepRhythmDetailViewModel sleepRhythmDetailViewModel, SleepRhythmReport sleepRhythmReport, Continuation<? super C06111> continuation) {
                super(2, continuation);
                this.this$0 = sleepRhythmDetailViewModel;
                this.$report = sleepRhythmReport;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06111(this.this$0, this.$report, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableLiveData mutableLiveData;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableLiveData<Boolean> deleteDataSuccess = this.this$0.getDeleteDataSuccess();
                    ISleepRepository repo = this.this$0.getRepo();
                    List<SleepRhythmReport> listListOf = CollectionsKt__CollectionsJVMKt.listOf(this.$report);
                    this.L$0 = deleteDataSuccess;
                    this.label = 1;
                    Object objDeleteSleepRhyThmReport = repo.deleteSleepRhyThmReport(listListOf, this);
                    if (objDeleteSleepRhyThmReport == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = deleteDataSuccess;
                    obj = objDeleteSleepRhyThmReport;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SleepRhythmReport sleepRhythmReport, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$report = sleepRhythmReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepRhythmDetailViewModel.this.new AnonymousClass1(this.$report, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06111 c06111 = new C06111(SleepRhythmDetailViewModel.this, this.$report, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06111, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$getPDFUploadUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$getPDFUploadUrl$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $file;
        final /* synthetic */ String $sid;
        final /* synthetic */ long $timestamp;
        final /* synthetic */ Function2<Boolean, ResearchPresignedUrlResponse, Unit> $uploadResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25111(String str, long j, String str2, Function2<? super Boolean, ? super ResearchPresignedUrlResponse, Unit> function2, Continuation<? super C25111> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$timestamp = j;
            this.$file = str2;
            this.$uploadResult = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ResearchPresignedUrlResponse researchPresignedUrlResponse, String str, Function2 function2, boolean z) {
            Logger.i("SleepRhythmDetailViewModel", "getPDFUploadUrl = " + researchPresignedUrlResponse + " upResult = " + z + " file:" + str);
            function2.invoke(Boolean.valueOf(z), researchPresignedUrlResponse);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25111(this.$sid, this.$timestamp, this.$file, this.$uploadResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthHttpRequest healthHttpRequest = new HealthHttpRequest();
                String str = this.$sid;
                Intrinsics.checkNotNull(str);
                long j = this.$timestamp;
                this.label = 1;
                obj = healthHttpRequest.getSleepRhythmReportUploadUrl(str, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                final ResearchPresignedUrlResponse researchPresignedUrlResponse = (ResearchPresignedUrlResponse) list.get(0);
                SleepRhythmPDFUploader sleepRhythmPDFUploader = SleepRhythmPDFUploader.INSTANCE;
                final String str2 = this.$file;
                final Function2<Boolean, ResearchPresignedUrlResponse, Unit> function2 = this.$uploadResult;
                sleepRhythmPDFUploader.uploadPdf(str2, researchPresignedUrlResponse, new Function1() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SleepRhythmDetailViewModel.C25111.invokeSuspend$lambda$0(researchPresignedUrlResponse, str2, function2, ((Boolean) obj2).booleanValue());
                    }
                });
            } else {
                this.$uploadResult.invoke(Boxing.boxBoolean(false), null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$getPullRecentOneYearDataStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$getPullRecentOneYearDataStatus$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {161, 162}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C25121(Continuation<? super C25121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepRhythmDetailViewModel.this.new C25121(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MutableLiveData<Boolean> hasPullAllData = SleepRhythmDetailViewModel.this.getHasPullAllData();
            FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
            this.L$0 = hasPullAllData;
            this.label = 2;
            Object pullRecentOneYearDataResult = fitnessDataExtKt.getPullRecentOneYearDataResult(this);
            if (pullRecentOneYearDataResult == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = hasPullAllData;
            obj = pullRecentOneYearDataResult;
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$getUserInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$getUserInfo$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function1<SleepRhythmProjectUserInfo, Unit> $onSuccess;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$getUserInfo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$getUserInfo$1$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function1<SleepRhythmProjectUserInfo, Unit> $onSuccess;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06121(Function1<? super SleepRhythmProjectUserInfo, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C06121> continuation) {
                super(2, continuation);
                this.$onSuccess = function1;
                this.$fail = function2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function1 function1, SleepRhythmProjectUserInfo sleepRhythmProjectUserInfo) {
                AnyExtKt.main$default(null, new SleepRhythmDetailViewModel$getUserInfo$1$1$1$1(function1, sleepRhythmProjectUserInfo, null), 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(Function1 function1, String str) {
                AnyExtKt.main$default(null, new SleepRhythmDetailViewModel$getUserInfo$1$1$2$1(function1, str, null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06121(this.$onSuccess, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HealthHttpRequest healthHttpRequest = new HealthHttpRequest();
                final Function1<SleepRhythmProjectUserInfo, Unit> function1 = this.$onSuccess;
                Function1<? super SleepRhythmProjectUserInfo, Unit> function2 = new Function1() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SleepRhythmDetailViewModel.C25131.C06121.invokeSuspend$lambda$0(function1, (SleepRhythmProjectUserInfo) obj2);
                    }
                };
                final Function1<String, Unit> function3 = this.$fail;
                healthHttpRequest.getProjectUserInfo(function2, new Function1() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.c
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SleepRhythmDetailViewModel.C25131.C06121.invokeSuspend$lambda$1(function3, (String) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25131(Function1<? super SleepRhythmProjectUserInfo, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C25131> continuation) {
            super(2, continuation);
            this.$onSuccess = function1;
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25131(this.$onSuccess, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06121 c06121 = new C06121(this.$onSuccess, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06121, this) == coroutine_suspended) {
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
            return ((C25131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$querySleepRhythmThirdAuthStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$querySleepRhythmThirdAuthStatus$1", f = "SleepRhythmDetailViewModel.kt", i = {0}, l = {74, 78}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    public static final class C25141 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C25141(Continuation<? super C25141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25141 c25141 = new C25141(continuation);
            c25141.L$0 = obj;
            return c25141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C25141) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            SleepRhythmAuthConfig rhythmAuthConfig = SleepRhythmAuthConfigKt.getRhythmAuthConfig();
            MineSettingManager mineSettingManagerExtKt = MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE);
            int thirdPartyType = rhythmAuthConfig.getThirdPartyType();
            long appId = rhythmAuthConfig.getAppId();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = mineSettingManagerExtKt.getThirdPartyAuthStatus(thirdPartyType, appId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(((Boolean) obj).booleanValue());
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$requestRhythmData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$requestRhythmData$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ String $sid;
        final /* synthetic */ long $startTime;
        int label;
        final /* synthetic */ SleepRhythmDetailViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$requestRhythmData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$requestRhythmData$1$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ long $endTime;
            final /* synthetic */ String $sid;
            final /* synthetic */ long $startTime;
            int label;
            final /* synthetic */ SleepRhythmDetailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06131(long j, long j2, SleepRhythmDetailViewModel sleepRhythmDetailViewModel, String str, Continuation<? super C06131> continuation) {
                super(2, continuation);
                this.$startTime = j;
                this.$endTime = j2;
                this.this$0 = sleepRhythmDetailViewModel;
                this.$sid = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06131(this.$startTime, this.$endTime, this.this$0, this.$sid, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Logger.i("SleepRhythmDetailViewModel", "requestRhythmData = " + this.$startTime + ", endTime = " + this.$endTime);
                    ISleepRepository repo = this.this$0.getRepo();
                    long j = this.$startTime;
                    long j2 = this.$endTime;
                    String str = this.$sid;
                    this.label = 1;
                    obj = repo.getSleepProjectReport(j, j2, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SleepProjectReport sleepProjectReport = (SleepProjectReport) obj;
                this.this$0.setLocalSleepRhythmDiaryInfoData(sleepProjectReport);
                this.this$0.getLocalSleepRhythmDiaryInfo().postValue(sleepProjectReport);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25151(long j, long j2, SleepRhythmDetailViewModel sleepRhythmDetailViewModel, String str, Continuation<? super C25151> continuation) {
            super(2, continuation);
            this.$startTime = j;
            this.$endTime = j2;
            this.this$0 = sleepRhythmDetailViewModel;
            this.$sid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25151(this.$startTime, this.$endTime, this.this$0, this.$sid, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06131 c06131 = new C06131(this.$startTime, this.$endTime, this.this$0, this.$sid, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06131, this) == coroutine_suspended) {
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
            return ((C25151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$setThirdPartyAuthStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$setThirdPartyAuthStatus$1", f = "SleepRhythmDetailViewModel.kt", i = {0}, l = {85, 90}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    public static final class C25161 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C25161(Continuation<? super C25161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25161 c25161 = new C25161(continuation);
            c25161.L$0 = obj;
            return c25161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C25161) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            SleepRhythmAuthConfig rhythmAuthConfig = SleepRhythmAuthConfigKt.getRhythmAuthConfig();
            MineSettingManager mineSettingManagerExtKt = MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE);
            int thirdPartyType = rhythmAuthConfig.getThirdPartyType();
            long appId = rhythmAuthConfig.getAppId();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = mineSettingManagerExtKt.setThirdPartyAuth(thirdPartyType, appId, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(((Boolean) obj).booleanValue());
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$setUserInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$setUserInfo$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
        final /* synthetic */ String $phone_num;
        final /* synthetic */ String $sid;
        final /* synthetic */ long $timestamp;
        final /* synthetic */ String $url;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$setUserInfo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel$setUserInfo$1$1", f = "SleepRhythmDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ String $name;
            final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
            final /* synthetic */ String $phone_num;
            final /* synthetic */ String $sid;
            final /* synthetic */ long $timestamp;
            final /* synthetic */ String $url;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06141(String str, long j, String str2, String str3, String str4, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C06141> continuation) {
                super(2, continuation);
                this.$sid = str;
                this.$timestamp = j;
                this.$url = str2;
                this.$name = str3;
                this.$phone_num = str4;
                this.$onSuccess = function1;
                this.$fail = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06141(this.$sid, this.$timestamp, this.$url, this.$name, this.$phone_num, this.$onSuccess, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                new HealthHttpRequest().setProjectUserInfo(this.$sid, this.$timestamp, this.$url, this.$name, this.$phone_num, this.$onSuccess, this.$fail);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25171(String str, long j, String str2, String str3, String str4, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C25171> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$timestamp = j;
            this.$url = str2;
            this.$name = str3;
            this.$phone_num = str4;
            this.$onSuccess = function1;
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25171(this.$sid, this.$timestamp, this.$url, this.$name, this.$phone_num, this.$onSuccess, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06141 c06141 = new C06141(this.$sid, this.$timestamp, this.$url, this.$name, this.$phone_num, this.$onSuccess, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06141, this) == coroutine_suspended) {
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
            return ((C25171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SleepRhythmDetailViewModel() {
        Boolean bool = Boolean.FALSE;
        this.hasPullAllData = new MutableLiveData<>(bool);
        this.deleteDataSuccess = new MutableLiveData<>(bool);
        this.allSleepRecordItem = new ArrayList();
        this.outShowSleepRecordItem = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPDFUploadUrl$lambda$0(Function2 uploadResult, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(uploadResult, "$uploadResult");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        uploadResult.invoke(Boolean.FALSE, null);
        return Unit.INSTANCE;
    }

    @NotNull
    public final List<SleepRhythmChatListAdapter.SleepRhythmChartValue> convertBasicSleepData(@Nullable SleepProjectReport sleepRhythmReports, long startTime, int cycleDay, boolean showOut) {
        if (sleepRhythmReports == null) {
            return this.allSleepRecordItem;
        }
        if (showOut && (!this.outShowSleepRecordItem.isEmpty())) {
            return this.outShowSleepRecordItem;
        }
        if (!this.allSleepRecordItem.isEmpty()) {
            return this.allSleepRecordItem;
        }
        List<SleepRhythmChatListAdapter.SleepRhythmChartValue> listConvertBasicSleepData = SleepRhythmHandle.INSTANCE.convertBasicSleepData(sleepRhythmReports, startTime, cycleDay, showOut);
        if (showOut) {
            this.outShowSleepRecordItem.clear();
            this.outShowSleepRecordItem.addAll(listConvertBasicSleepData);
        } else {
            this.allSleepRecordItem.clear();
            this.allSleepRecordItem.addAll(listConvertBasicSleepData);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listConvertBasicSleepData) {
            SleepRhythmChatListAdapter.SleepRhythmChartValue sleepRhythmChartValue = (SleepRhythmChatListAdapter.SleepRhythmChartValue) obj;
            if (sleepRhythmChartValue.getTime() != (((long) (cycleDay + 1)) * 86400) + startTime && sleepRhythmChartValue.getTime() != (((long) cycleDay) * 86400) + startTime) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
    }

    public final void deleteSleepRhythmReport(@NotNull SleepRhythmReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(report, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteDataSuccess() {
        return this.deleteDataSuccess;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHasPullAllData() {
        return this.hasPullAllData;
    }

    @NotNull
    public final MutableLiveData<SleepProjectReport> getLocalSleepRhythmDiaryInfo() {
        return this.localSleepRhythmDiaryInfo;
    }

    @Nullable
    public final SleepProjectReport getLocalSleepRhythmDiaryInfoData() {
        return this.localSleepRhythmDiaryInfoData;
    }

    public final void getPDFUploadUrl(@Nullable String sid, @NotNull String file, long timestamp, @NotNull final Function2<? super Boolean, ? super ResearchPresignedUrlResponse, Unit> uploadResult) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(uploadResult, "uploadResult");
        ScopeExtKt.scopeNetLife$default(this, null, new C25111(sid, timestamp, file, uploadResult, null), 1, null).m503catch(new Function2() { // from class: qtm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepRhythmDetailViewModel.getPDFUploadUrl$lambda$0(uploadResult, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void getPullRecentOneYearDataStatus() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25121(null), 3, null);
    }

    @NotNull
    public final ISleepRepository getRepo() {
        return this.repo;
    }

    public final void getUserInfo(@NotNull Function1<? super SleepRhythmProjectUserInfo, Unit> onSuccess, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25131(onSuccess, fail, null), 3, null);
    }

    @NotNull
    public final LiveData<Boolean> querySleepRhythmThirdAuthStatus() {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C25141(null), 2, (Object) null);
    }

    public final void requestRhythmData(long startTime, long endTime, @Nullable String sid) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25151(startTime, endTime, this, sid, null), 3, null);
    }

    public final void setDeleteDataSuccess(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.deleteDataSuccess = mutableLiveData;
    }

    public final void setLocalSleepRhythmDiaryInfoData(@Nullable SleepProjectReport sleepProjectReport) {
        this.localSleepRhythmDiaryInfoData = sleepProjectReport;
    }

    @NotNull
    public final LiveData<Boolean> setThirdPartyAuthStatus() {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C25161(null), 2, (Object) null);
    }

    public final void setUserInfo(@NotNull String sid, long timestamp, @NotNull String url, @NotNull String name, @NotNull String phone_num, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone_num, "phone_num");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25171(sid, timestamp, url, name, phone_num, onSuccess, fail, null), 3, null);
    }
}
