package com.xiaomi.fitness.health.bloodglucose;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseItem;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager;
import com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingModel;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.BackgroundRestrictionUtil;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_eco.SportConstants;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u000bJ\u001e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020#2\u0006\u0010)\u001a\u00020*J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020-002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0018\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020*2\b\b\u0002\u00103\u001a\u00020(J\u0018\u00104\u001a\u00020#2\u0006\u00102\u001a\u00020*2\b\b\u0002\u00103\u001a\u00020(J\u0018\u00105\u001a\u00020#2\u0006\u00102\u001a\u00020*2\b\b\u0002\u00103\u001a\u00020(J\u0016\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020(R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0019\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0014¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IBloodSugarRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IBloodSugarRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "bloodSugarRemindSettingModel", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingModel;", "getBloodSugarRemindSettingModel", "()Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingModel;", "setBloodSugarRemindSettingModel", "(Lcom/xiaomi/fitness/blood_sugar/BloodSugarRemindSettingModel;)V", "bloodSugarGMIAndAGPResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "getBloodSugarGMIAndAGPResult", "()Landroidx/lifecycle/MutableLiveData;", "setBloodSugarGMIAndAGPResult", "(Landroidx/lifecycle/MutableLiveData;)V", "lowSettingValue", "", "getLowSettingValue", "()F", "setLowSettingValue", "(F)V", "highSettingValue", "getHighSettingValue", "setHighSettingValue", "isNoRestrictedLevelLiveData", "", "queryRestrictionLevel", "", "getBloodSugarRemindSettingFromLocal", "insertBloodGlucoseRecord", "bloodSugar", "measurePeriod", "", SportConstants.KEY_TIMESTAMP, "", "deleteBloodGlucoseRecord", "bloodSugarItem", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "getTheGMIAndAGP", "checkManualBloodSugarItem", "", "requestMonthManualGroupData", "endTimeSecond", "limit", "requestMonthHighGroupData", "requestMonthLowGroupData", "courseTrainRecord", "Lcom/mi/health/course/export/data/CourseInfoItem;", "getCourseTrainRecord", "getCourseInfo", "courseId", SDKConstants.SOURCE_TYPE, "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucoseViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "BloodGlucoseViewModel";

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: by2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BloodGlucoseViewModel.mDataRepo_delegate$lambda$0(this.f4716a);
        }
    });

    @NotNull
    private BloodSugarRemindSettingModel bloodSugarRemindSettingModel = new BloodSugarRemindSettingModel(false, false, 0, 0, 0, 0, 0.0d, 0.0d, 0, 511, null);

    @NotNull
    private MutableLiveData<BloodSugarGMIAndAGPResult> bloodSugarGMIAndAGPResult = new MutableLiveData<>();
    private float lowSettingValue = 3.9f;
    private float highSettingValue = 10.0f;

    @NotNull
    private final MutableLiveData<Boolean> isNoRestrictedLevelLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<CourseInfoItem> courseTrainRecord = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$deleteBloodGlucoseRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$deleteBloodGlucoseRecord$1", f = "BloodGlucoseViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BloodSugarItem $bloodSugarItem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BloodSugarItem bloodSugarItem, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bloodSugarItem = bloodSugarItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BloodGlucoseViewModel.this.new AnonymousClass1(this.$bloodSugarItem, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBloodSugarRepository mDataRepo = BloodGlucoseViewModel.this.getMDataRepo();
                DailyRecordItem[] dailyRecordItemArr = {this.$bloodSugarItem};
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$getCourseInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$getCourseInfo$1", f = "BloodGlucoseViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $courseId;
        final /* synthetic */ int $sourceType;
        int label;
        final /* synthetic */ BloodGlucoseViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24061(int i, long j, BloodGlucoseViewModel bloodGlucoseViewModel, Continuation<? super C24061> continuation) {
            super(2, continuation);
            this.$sourceType = i;
            this.$courseId = j;
            this.this$0 = bloodGlucoseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24061(this.$sourceType, this.$courseId, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseItem courseItem = new CourseItem(this.$sourceType, String.valueOf(this.$courseId));
                CourseApi courseApi = CourseApiKt.getCourseApi();
                this.label = 1;
                obj = courseApi.getCourseInfo(courseItem, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseInfoItem courseInfoItem = (CourseInfoItem) obj;
            this.this$0.getCourseTrainRecord().setValue(courseInfoItem);
            Logger.i("CoursePlayerResult", "getCourseInfo: " + courseInfoItem + ".  " + this.this$0.getCourseTrainRecord().getValue());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$getTheGMIAndAGP$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$getTheGMIAndAGP$1", f = "BloodGlucoseViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $timeStamp;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24071(long j, Continuation<? super C24071> continuation) {
            super(2, continuation);
            this.$timeStamp = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BloodGlucoseViewModel.this.new C24071(this.$timeStamp, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<BloodSugarGMIAndAGPResult> bloodSugarGMIAndAGPResult = BloodGlucoseViewModel.this.getBloodSugarGMIAndAGPResult();
                IBloodSugarRepository mDataRepo = BloodGlucoseViewModel.this.getMDataRepo();
                long j = this.$timeStamp;
                this.L$0 = bloodSugarGMIAndAGPResult;
                this.label = 1;
                Object theGMIAndAGP = mDataRepo.getTheGMIAndAGP(j, this);
                if (theGMIAndAGP == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = bloodSugarGMIAndAGPResult;
                obj = theGMIAndAGP;
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
            return ((C24071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$insertBloodGlucoseRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$insertBloodGlucoseRecord$1", f = "BloodGlucoseViewModel.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $bloodSugar;
        final /* synthetic */ int $measurePeriod;
        final /* synthetic */ long $timeStamp;
        int label;
        final /* synthetic */ BloodGlucoseViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24081(long j, float f, int i, BloodGlucoseViewModel bloodGlucoseViewModel, Continuation<? super C24081> continuation) {
            super(2, continuation);
            this.$timeStamp = j;
            this.$bloodSugar = f;
            this.$measurePeriod = i;
            this.this$0 = bloodGlucoseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24081(this.$timeStamp, this.$bloodSugar, this.$measurePeriod, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BloodSugarItem bloodSugarItem = new BloodSugarItem(this.$timeStamp, this.$bloodSugar, Boxing.boxInt(this.$measurePeriod));
                bloodSugarItem.setSid("xiaomiwear_app_manually");
                IBloodSugarRepository mDataRepo = this.this$0.getMDataRepo();
                this.label = 1;
                if (mDataRepo.addRecord(bloodSugarItem, this) == coroutine_suspended) {
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
            return ((C24081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$requestMonthHighGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$requestMonthHighGroupData$1", f = "BloodGlucoseViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24091(long j, int i, Continuation<? super C24091> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BloodGlucoseViewModel.this.new C24091(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBloodSugarRepository mDataRepo = BloodGlucoseViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IBloodSugarRepository.DefaultImpls.getHighBloodSugarByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            BloodGlucoseViewModel.this.setHasMore(!map.isEmpty());
            Logger.i(BloodGlucoseViewModel.TAG, "requestMonthHighGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            BloodGlucoseViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$requestMonthLowGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$requestMonthLowGroupData$1", f = "BloodGlucoseViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24101(long j, int i, Continuation<? super C24101> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BloodGlucoseViewModel.this.new C24101(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBloodSugarRepository mDataRepo = BloodGlucoseViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IBloodSugarRepository.DefaultImpls.getLowBloodSugarByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            BloodGlucoseViewModel.this.setHasMore(!map.isEmpty());
            Logger.i(BloodGlucoseViewModel.TAG, "requestMonthLowGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            BloodGlucoseViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$requestMonthManualGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel$requestMonthManualGroupData$1", f = "BloodGlucoseViewModel.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24111(long j, int i, Continuation<? super C24111> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BloodGlucoseViewModel.this.new C24111(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IBloodSugarRepository mDataRepo = BloodGlucoseViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = IBloodSugarRepository.DefaultImpls.getManualBloodSugarByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
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
            BloodGlucoseViewModel.this.setHasMore(!map.isEmpty());
            Logger.i(BloodGlucoseViewModel.TAG, "requestMonthManualGroupData endTime " + this.$endTimeSecond + ";size " + map.size());
            BloodGlucoseViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCourseInfo$lambda$2(BloodGlucoseViewModel this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("CoursePlayerResult", "getCourseInfo: " + it.getMessage() + ".");
        this$0.courseTrainRecord.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBloodSugarRepository getMDataRepo() {
        return (IBloodSugarRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IBloodSugarRepository mDataRepo_delegate$lambda$0(BloodGlucoseViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IBloodSugarRepository) this$0.getRepo(IBloodSugarRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRestrictionLevel$lambda$1(BloodGlucoseViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BackgroundRestrictionUtil backgroundRestrictionUtil = BackgroundRestrictionUtil.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this$0.isNoRestrictedLevelLiveData.postValue(backgroundRestrictionUtil.isNoRestrictedLevel(backgroundRestrictionUtil.queryRestrictionLevel(application, packageName)));
    }

    public static /* synthetic */ void requestMonthHighGroupData$default(BloodGlucoseViewModel bloodGlucoseViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        bloodGlucoseViewModel.requestMonthHighGroupData(j, i);
    }

    public static /* synthetic */ void requestMonthLowGroupData$default(BloodGlucoseViewModel bloodGlucoseViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        bloodGlucoseViewModel.requestMonthLowGroupData(j, i);
    }

    public static /* synthetic */ void requestMonthManualGroupData$default(BloodGlucoseViewModel bloodGlucoseViewModel, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 60;
        }
        bloodGlucoseViewModel.requestMonthManualGroupData(j, i);
    }

    @NotNull
    public final List<BloodSugarItem> checkManualBloodSugarItem(int measurePeriod, long timeStamp) {
        return getMDataRepo().getTheManualBloodSugarItem(timeStamp, measurePeriod);
    }

    public final void deleteBloodGlucoseRecord(@NotNull BloodSugarItem bloodSugarItem) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "bloodSugarItem");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(bloodSugarItem, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<BloodSugarGMIAndAGPResult> getBloodSugarGMIAndAGPResult() {
        return this.bloodSugarGMIAndAGPResult;
    }

    @NotNull
    public final BloodSugarRemindSettingModel getBloodSugarRemindSettingFromLocal() {
        BloodSugarRemindSettingModel bloodSugarRemindSettingFromLocal = BloodSugarExtKt.getInstance(BloodSugarRemindSettingManager.INSTANCE).getBloodSugarRemindSettingFromLocal();
        this.bloodSugarRemindSettingModel = bloodSugarRemindSettingFromLocal;
        this.highSettingValue = (float) bloodSugarRemindSettingFromLocal.getTargetRangeHigh();
        this.lowSettingValue = (float) this.bloodSugarRemindSettingModel.getTargetRangeLow();
        return this.bloodSugarRemindSettingModel;
    }

    @NotNull
    public final BloodSugarRemindSettingModel getBloodSugarRemindSettingModel() {
        return this.bloodSugarRemindSettingModel;
    }

    public final void getCourseInfo(long courseId, int sourceType) {
        ScopeExtKt.scopeNetLife$default(this, null, new C24061(sourceType, courseId, this, null), 1, null).m503catch(new Function2() { // from class: cy2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BloodGlucoseViewModel.getCourseInfo$lambda$2(this.f14851a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @NotNull
    public final MutableLiveData<CourseInfoItem> getCourseTrainRecord() {
        return this.courseTrainRecord;
    }

    public final float getHighSettingValue() {
        return this.highSettingValue;
    }

    public final float getLowSettingValue() {
        return this.lowSettingValue;
    }

    public final void getTheGMIAndAGP(long timeStamp) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24071(timeStamp, null), 2, null);
    }

    public final void insertBloodGlucoseRecord(float bloodSugar, int measurePeriod, long timeStamp) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24081(timeStamp, bloodSugar, measurePeriod, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> isNoRestrictedLevelLiveData() {
        return this.isNoRestrictedLevelLiveData;
    }

    public final void queryRestrictionLevel() {
        ExecutorHelper.runInBackground(new Runnable() { // from class: dy2
            @Override // java.lang.Runnable
            public final void run() {
                BloodGlucoseViewModel.queryRestrictionLevel$lambda$1(this.f16046a);
            }
        });
    }

    public final void requestMonthHighGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24091(endTimeSecond, limit, null), 2, null);
    }

    public final void requestMonthLowGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24101(endTimeSecond, limit, null), 2, null);
    }

    public final void requestMonthManualGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24111(endTimeSecond, limit, null), 2, null);
    }

    public final void setBloodSugarGMIAndAGPResult(@NotNull MutableLiveData<BloodSugarGMIAndAGPResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bloodSugarGMIAndAGPResult = mutableLiveData;
    }

    public final void setBloodSugarRemindSettingModel(@NotNull BloodSugarRemindSettingModel bloodSugarRemindSettingModel) {
        Intrinsics.checkNotNullParameter(bloodSugarRemindSettingModel, "<set-?>");
        this.bloodSugarRemindSettingModel = bloodSugarRemindSettingModel;
    }

    public final void setHighSettingValue(float f) {
        this.highSettingValue = f;
    }

    public final void setLowSettingValue(float f) {
        this.lowSettingValue = f;
    }
}
