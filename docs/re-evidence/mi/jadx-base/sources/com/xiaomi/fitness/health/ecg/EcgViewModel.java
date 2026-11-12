package com.xiaomi.fitness.health.ecg;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.IEcgRepository;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.ecg.EcgViewModel;
import com.xiaomi.fitness.health.ecg.net.GetVipInfoResult;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\b\b\u0002\u0010 \u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017J&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\b\b\u0002\u0010 \u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017J&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\b\b\u0002\u0010 \u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017J&\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u001d2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fJ\u000e\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fJ\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u001dJ\u000e\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u001dJ\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001dJ\u0018\u00105\u001a\u00020*2\u0006\u00106\u001a\u0002012\b\b\u0002\u00107\u001a\u00020\u0017J\u0018\u00108\u001a\u00020*2\u0006\u00106\u001a\u0002012\b\b\u0002\u00107\u001a\u00020\u0017J\u0018\u00109\u001a\u00020*2\u0006\u00106\u001a\u0002012\b\b\u0002\u00107\u001a\u00020\u0017J\u000e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u001dR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IEcgRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IEcgRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "mEcgAnalyzeRepository", "Lcom/xiaomi/fitness/health/ecg/EcgAnalyzeRepository;", "getMEcgAnalyzeRepository", "()Lcom/xiaomi/fitness/health/ecg/EcgAnalyzeRepository;", "setMEcgAnalyzeRepository", "(Lcom/xiaomi/fitness/health/ecg/EcgAnalyzeRepository;)V", "mSupportDevice", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMSupportDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setMSupportDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "dataSourceChoice", "", "getDataSourceChoice", "()I", "setDataSourceChoice", "(I)V", "queryAllRecords", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "pageSize", "prefetchDistance", "queryInterpretedRecords", "queryNotInterpretedRecords", "queryEcgRecordData", "", "ecgMedicalItemReport", "timeInSec", "sparsePoints", "deleteEcgReport", "", "report", "updateEcgReport", "getAccountCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "updateAnalyzeStatusTime", EcgSchemaHandler.PARAM_MEASURE_TIME, "", "queryShowPrivacyStatusLiveData", "", "setEcgPrivacyLivaData", "requestMonthAllGroupData", "endTimeSecond", "limit", "requestMonthInterpretedGroupData", "requestMonthNotInterpretedGroupData", "queryVipInfo", "Lcom/xiaomi/fitness/health/ecg/net/GetVipInfoResult;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgViewModel extends BasicDataViewModel {
    public EcgAnalyzeRepository mEcgAnalyzeRepository;

    @Nullable
    private WearableDeviceModel mSupportDevice;

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pc7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcgViewModel.mDataRepo_delegate$lambda$0(this.f30232a);
        }
    });
    private int dataSourceChoice = 600;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$deleteEcgReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$deleteEcgReport$1", f = "EcgViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcgMedicalItemReport $report;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EcgMedicalItemReport ecgMedicalItemReport, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$report = ecgMedicalItemReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcgViewModel.this.new AnonymousClass1(this.$report, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IEcgRepository mDataRepo = EcgViewModel.this.getMDataRepo();
                DailyRecordItem[] dailyRecordItemArr = {this.$report};
                this.label = 1;
                if (mDataRepo.deleteRecord(dailyRecordItemArr, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$getAccountCoreInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$getAccountCoreInfo$1", f = "EcgViewModel.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24521 extends SuspendLambda implements Function2<LiveDataScope<AccountCoreInfo>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$getAccountCoreInfo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$getAccountCoreInfo$1$1", f = "EcgViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LiveDataScope<AccountCoreInfo> $$this$liveData;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$getAccountCoreInfo$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$getAccountCoreInfo$1$1$1", f = "EcgViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
            public static final class C05931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LiveDataScope<AccountCoreInfo> $$this$liveData;
                final /* synthetic */ AccountCoreInfo $loadAccountCoreInfo;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05931(LiveDataScope<AccountCoreInfo> liveDataScope, AccountCoreInfo accountCoreInfo, Continuation<? super C05931> continuation) {
                    super(2, continuation);
                    this.$$this$liveData = liveDataScope;
                    this.$loadAccountCoreInfo = accountCoreInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C05931(this.$$this$liveData, this.$loadAccountCoreInfo, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        LiveDataScope<AccountCoreInfo> liveDataScope = this.$$this$liveData;
                        AccountCoreInfo accountCoreInfo = this.$loadAccountCoreInfo;
                        this.label = 1;
                        if (liveDataScope.emit(accountCoreInfo, this) == coroutine_suspended) {
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
                    return ((C05931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05921(LiveDataScope<AccountCoreInfo> liveDataScope, Continuation<? super C05921> continuation) {
                super(2, continuation);
                this.$$this$liveData = liveDataScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05921(this.$$this$liveData, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AccountCoreInfo accountCoreInfoLoadAccountCoreInfo = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).loadAccountCoreInfo();
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C05931 c05931 = new C05931(this.$$this$liveData, accountCoreInfoLoadAccountCoreInfo, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, c05931, this) == coroutine_suspended) {
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
                return ((C05921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C24521(Continuation<? super C24521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24521 c24521 = new C24521(continuation);
            c24521.L$0 = obj;
            return c24521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<AccountCoreInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C24521) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05921 c05921 = new C05921(liveDataScope, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05921, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$queryEcgRecordData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$queryEcgRecordData$1", f = "EcgViewModel.kt", i = {}, l = {92, 92}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24531 extends SuspendLambda implements Function2<LiveDataScope<float[]>, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcgMedicalItemReport $ecgMedicalItemReport;
        final /* synthetic */ int $sparsePoints;
        final /* synthetic */ int $timeInSec;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24531(EcgMedicalItemReport ecgMedicalItemReport, int i, int i2, Continuation<? super C24531> continuation) {
            super(2, continuation);
            this.$ecgMedicalItemReport = ecgMedicalItemReport;
            this.$timeInSec = i;
            this.$sparsePoints = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24531 c24531 = new C24531(this.$ecgMedicalItemReport, this.$timeInSec, this.$sparsePoints, continuation);
            c24531.L$0 = obj;
            return c24531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<float[]> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C24531) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            EcgMedicalItemReport ecgMedicalItemReport = this.$ecgMedicalItemReport;
            int i2 = this.$timeInSec;
            int i3 = this.$sparsePoints;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = ecgMedicalItemReport.getRecordData(i2, i3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$queryShowPrivacyStatusLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$queryShowPrivacyStatusLiveData$1", f = "EcgViewModel.kt", i = {}, l = {125, 125}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24541 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C24541(Continuation<? super C24541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24541 c24541 = EcgViewModel.this.new C24541(continuation);
            c24541.L$0 = obj;
            return c24541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C24541) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            EcgAnalyzeRepository mEcgAnalyzeRepository = EcgViewModel.this.getMEcgAnalyzeRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = mEcgAnalyzeRepository.getShowPrivacyStatus(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$queryVipInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/health/ecg/net/GetVipInfoResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$queryVipInfo$1", f = "EcgViewModel.kt", i = {}, l = {176, 176}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24551 extends SuspendLambda implements Function2<LiveDataScope<GetVipInfoResult>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C24551(Continuation<? super C24551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24551 c24551 = EcgViewModel.this.new C24551(continuation);
            c24551.L$0 = obj;
            return c24551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<GetVipInfoResult> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C24551) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            EcgAnalyzeRepository mEcgAnalyzeRepository = EcgViewModel.this.getMEcgAnalyzeRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = mEcgAnalyzeRepository.getVipInfo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$requestMonthAllGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$requestMonthAllGroupData$1", f = "EcgViewModel.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24561(long j, int i, Continuation<? super C24561> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcgViewModel.this.new C24561(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IEcgRepository mDataRepo = EcgViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IEcgRepository.DefaultImpls.getAllEcgByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map<Long, List<DailyRecordItem>> map = (Map) obj;
            EcgViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("HrmViewModel", "requestMonthManualGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            EcgViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$requestMonthInterpretedGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$requestMonthInterpretedGroupData$1", f = "EcgViewModel.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24571(long j, int i, Continuation<? super C24571> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcgViewModel.this.new C24571(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IEcgRepository mDataRepo = EcgViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IEcgRepository.DefaultImpls.getInterpretedEcgByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map<Long, List<DailyRecordItem>> map = (Map) obj;
            EcgViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("HrmViewModel", "requestMonthManualGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            EcgViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$requestMonthNotInterpretedGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$requestMonthNotInterpretedGroupData$1", f = "EcgViewModel.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24581(long j, int i, Continuation<? super C24581> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcgViewModel.this.new C24581(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IEcgRepository mDataRepo = EcgViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IEcgRepository.DefaultImpls.getNotInterpretedEcgByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map<Long, List<DailyRecordItem>> map = (Map) obj;
            EcgViewModel.this.setHasMore(!map.isEmpty());
            Logger.i("HrmViewModel", "requestMonthManualGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            EcgViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$setEcgPrivacyLivaData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$setEcgPrivacyLivaData$1", f = "EcgViewModel.kt", i = {}, l = {131, 131}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24591 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C24591(Continuation<? super C24591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24591 c24591 = EcgViewModel.this.new C24591(continuation);
            c24591.L$0 = obj;
            return c24591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C24591) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            EcgAnalyzeRepository mEcgAnalyzeRepository = EcgViewModel.this.getMEcgAnalyzeRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = mEcgAnalyzeRepository.setEcgDataPrivacyAgree(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$updateAnalyzeStatusTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$updateAnalyzeStatusTime$1", f = "EcgViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $measureTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24601(long j, Continuation<? super C24601> continuation) {
            super(2, continuation);
            this.$measureTime = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24601(this.$measureTime, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcgAnalyzePreference.INSTANCE.addAnalyzingReport(this.$measureTime, System.currentTimeMillis() / ((long) 1000));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgViewModel$updateEcgReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgViewModel$updateEcgReport$1", f = "EcgViewModel.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EcgMedicalItemReport $report;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24611(EcgMedicalItemReport ecgMedicalItemReport, Continuation<? super C24611> continuation) {
            super(2, continuation);
            this.$report = ecgMedicalItemReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcgViewModel.this.new C24611(this.$report, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IEcgRepository mDataRepo = EcgViewModel.this.getMDataRepo();
                EcgMedicalItemReport ecgMedicalItemReport = this.$report;
                this.label = 1;
                if (mDataRepo.addRecord(ecgMedicalItemReport, this) == coroutine_suspended) {
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
            return ((C24611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IEcgRepository getMDataRepo() {
        return (IEcgRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IEcgRepository mDataRepo_delegate$lambda$0(EcgViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IEcgRepository) this$0.getRepo(IEcgRepository.class);
    }

    public static /* synthetic */ LiveData queryAllRecords$default(EcgViewModel ecgViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 20;
        }
        if ((i3 & 2) != 0) {
            i2 = 5;
        }
        return ecgViewModel.queryAllRecords(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllRecords$lambda$1(EcgViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getAllEcgReport(null);
    }

    public static /* synthetic */ LiveData queryInterpretedRecords$default(EcgViewModel ecgViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 20;
        }
        if ((i3 & 2) != 0) {
            i2 = 5;
        }
        return ecgViewModel.queryInterpretedRecords(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryInterpretedRecords$lambda$2(EcgViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getInterpretedEcgReport(null);
    }

    public static /* synthetic */ LiveData queryNotInterpretedRecords$default(EcgViewModel ecgViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 20;
        }
        if ((i3 & 2) != 0) {
            i2 = 5;
        }
        return ecgViewModel.queryNotInterpretedRecords(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryNotInterpretedRecords$lambda$3(EcgViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMDataRepo().getNotInterpretedEcgReport(null);
    }

    public static /* synthetic */ void requestMonthAllGroupData$default(EcgViewModel ecgViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        ecgViewModel.requestMonthAllGroupData(j, i);
    }

    public static /* synthetic */ void requestMonthInterpretedGroupData$default(EcgViewModel ecgViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        ecgViewModel.requestMonthInterpretedGroupData(j, i);
    }

    public static /* synthetic */ void requestMonthNotInterpretedGroupData$default(EcgViewModel ecgViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        ecgViewModel.requestMonthNotInterpretedGroupData(j, i);
    }

    public final void deleteEcgReport(@NotNull EcgMedicalItemReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(report, null), 2, null);
    }

    @NotNull
    public final LiveData<AccountCoreInfo> getAccountCoreInfo() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C24521(null), 3, (Object) null);
    }

    public final int getDataSourceChoice() {
        return this.dataSourceChoice;
    }

    @NotNull
    public final EcgAnalyzeRepository getMEcgAnalyzeRepository() {
        EcgAnalyzeRepository ecgAnalyzeRepository = this.mEcgAnalyzeRepository;
        if (ecgAnalyzeRepository != null) {
            return ecgAnalyzeRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEcgAnalyzeRepository");
        return null;
    }

    @Nullable
    public final WearableDeviceModel getMSupportDevice() {
        return this.mSupportDevice;
    }

    @NotNull
    public final LiveData<PagingData<EcgMedicalItemReport>> queryAllRecords(int pageSize, int prefetchDistance) {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(pageSize, prefetchDistance, false, 0, 0, 0, 56, null), null, new Function0() { // from class: nc7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcgViewModel.queryAllRecords$lambda$1(this.f27771a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<float[]> queryEcgRecordData(@NotNull EcgMedicalItemReport ecgMedicalItemReport, int timeInSec, int sparsePoints) {
        Intrinsics.checkNotNullParameter(ecgMedicalItemReport, "ecgMedicalItemReport");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C24531(ecgMedicalItemReport, timeInSec, sparsePoints, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<EcgMedicalItemReport>> queryInterpretedRecords(int pageSize, int prefetchDistance) {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(pageSize, prefetchDistance, false, 0, 0, 0, 56, null), null, new Function0() { // from class: oc7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcgViewModel.queryInterpretedRecords$lambda$2(this.f28991a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<EcgMedicalItemReport>> queryNotInterpretedRecords(int pageSize, int prefetchDistance) {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(pageSize, prefetchDistance, false, 0, 0, 0, 56, null), null, new Function0() { // from class: mc7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcgViewModel.queryNotInterpretedRecords$lambda$3(this.f26002a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<Boolean> queryShowPrivacyStatusLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C24541(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<GetVipInfoResult> queryVipInfo() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C24551(null), 3, (Object) null);
    }

    public final void requestMonthAllGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24561(endTimeSecond, limit, null), 2, null);
    }

    public final void requestMonthInterpretedGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24571(endTimeSecond, limit, null), 2, null);
    }

    public final void requestMonthNotInterpretedGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24581(endTimeSecond, limit, null), 2, null);
    }

    public final void setDataSourceChoice(int i) {
        this.dataSourceChoice = i;
    }

    @NotNull
    public final LiveData<Boolean> setEcgPrivacyLivaData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C24591(null), 3, (Object) null);
    }

    public final void setMEcgAnalyzeRepository(@NotNull EcgAnalyzeRepository ecgAnalyzeRepository) {
        Intrinsics.checkNotNullParameter(ecgAnalyzeRepository, "<set-?>");
        this.mEcgAnalyzeRepository = ecgAnalyzeRepository;
    }

    public final void setMSupportDevice(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.mSupportDevice = wearableDeviceModel;
    }

    public final void updateAnalyzeStatusTime(long measureTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C24601(measureTime, null), 3, null);
    }

    public final void updateEcgReport(@NotNull EcgMedicalItemReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24611(report, null), 2, null);
    }
}
