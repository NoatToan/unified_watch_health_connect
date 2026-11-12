package com.huami.bloodpressure_ui.history;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.dc.local.ILocalDelegate;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteEntity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteV2Entity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRequestEntity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRequestV2Entity;
import com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate;
import com.huami.bloodpressure_core.ext.UserEx;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u000e\u0012\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u000e¢\u0006\u0004\b(\u0010)J\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R(\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "getHistoryData", "Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryEntity;", "item", "", "delData", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "a", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "localDataRepo", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestEntity;", "b", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "eventApiV1", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "c", "eventApiV2", GoogleApiAvailabilityLight.a, "deviceApi", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/android/vo/Resource;", "", "e", "Landroidx/lifecycle/MutableLiveData;", "_deleteLiveData", "f", "getDeleteLiveData", "()Landroidx/lifecycle/MutableLiveData;", "deleteLiveData", "g", "J", "currentTimeStamp", "<init>", "(Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureHistoryViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ILocalDelegate localDataRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureDelegate<BloodPressureRemoteEntity, BloodPressureRequestEntity> eventApiV1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> eventApiV2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> deviceApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Long>> _deleteLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Long>> deleteLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long currentTimeStamp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$delData$1$1", f = "BloodPressureHistoryViewModel.kt", i = {}, l = {59, 60, 66, 67, 75, 76}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BloodPressureHistoryEntity b;
        public final /* synthetic */ BloodPressureHistoryViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BloodPressureHistoryEntity bloodPressureHistoryEntity, BloodPressureHistoryViewModel bloodPressureHistoryViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = bloodPressureHistoryEntity;
            this.c = bloodPressureHistoryViewModel;
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

        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0077 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0093  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:35:0x00db A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:43:0x0123  */
        /* JADX WARN: Code duplicated, block: B:45:0x013c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x0157  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ILocalDelegate iLocalDelegate;
            String userId;
            long measureTime;
            ILocalDelegate iLocalDelegate2;
            String userId2;
            long measureTime2;
            ILocalDelegate iLocalDelegate3;
            String userId3;
            long measureTime3;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            switch (this.a) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    int dataSource = this.b.getDataSource();
                    if (dataSource == 0) {
                        IBloodPressureDelegate iBloodPressureDelegate = this.c.eventApiV2;
                        long measureTime4 = this.b.getMeasureTime();
                        this.a = 3;
                        obj = iBloodPressureDelegate.delData(measureTime4, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            iLocalDelegate2 = this.c.localDataRepo;
                            userId2 = UserEx.getUserId();
                            measureTime2 = this.b.getMeasureTime();
                            this.a = 4;
                            if (iLocalDelegate2.delDataByUserId(userId2, measureTime2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                        } else {
                            this.c._deleteLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                        }
                    } else if (dataSource == 1) {
                        IBloodPressureDelegate iBloodPressureDelegate2 = this.c.deviceApi;
                        long measureTime5 = this.b.getMeasureTime();
                        this.a = 5;
                        obj = iBloodPressureDelegate2.delData(measureTime5, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            iLocalDelegate3 = this.c.localDataRepo;
                            userId3 = UserEx.getUserId();
                            measureTime3 = this.b.getMeasureTime();
                            this.a = 6;
                            if (iLocalDelegate3.delDataByUserId(userId3, measureTime3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                        } else {
                            this.c._deleteLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                        }
                    } else if (dataSource == 2) {
                        IBloodPressureDelegate iBloodPressureDelegate3 = this.c.eventApiV1;
                        long measureTime6 = this.b.getMeasureTime();
                        this.a = 1;
                        obj = iBloodPressureDelegate3.delData(measureTime6, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            iLocalDelegate = this.c.localDataRepo;
                            userId = UserEx.getUserId();
                            measureTime = this.b.getMeasureTime();
                            this.a = 2;
                            if (iLocalDelegate.delDataByUserId(userId, measureTime, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                        } else {
                            this.c._deleteLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        iLocalDelegate = this.c.localDataRepo;
                        userId = UserEx.getUserId();
                        measureTime = this.b.getMeasureTime();
                        this.a = 2;
                        if (iLocalDelegate.delDataByUserId(userId, measureTime, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                    } else {
                        this.c._deleteLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        iLocalDelegate2 = this.c.localDataRepo;
                        userId2 = UserEx.getUserId();
                        measureTime2 = this.b.getMeasureTime();
                        this.a = 4;
                        if (iLocalDelegate2.delDataByUserId(userId2, measureTime2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                    } else {
                        this.c._deleteLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                    }
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                    return Unit.INSTANCE;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        iLocalDelegate3 = this.c.localDataRepo;
                        userId3 = UserEx.getUserId();
                        measureTime3 = this.b.getMeasureTime();
                        this.a = 6;
                        if (iLocalDelegate3.delDataByUserId(userId3, measureTime3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                    } else {
                        this.c._deleteLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    this.c._deleteLiveData.postValue(Resource.INSTANCE.success(Boxing.boxLong(this.b.getMeasureTime())));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public BloodPressureHistoryViewModel(@NotNull ILocalDelegate iLocalDelegate, @NotNull IBloodPressureDelegate<BloodPressureRemoteEntity, BloodPressureRequestEntity> iBloodPressureDelegate, @NotNull IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> iBloodPressureDelegate2, @NotNull IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> iBloodPressureDelegate3) {
        this.localDataRepo = iLocalDelegate;
        this.eventApiV1 = iBloodPressureDelegate;
        this.eventApiV2 = iBloodPressureDelegate2;
        this.deviceApi = iBloodPressureDelegate3;
        MutableLiveData<Resource<Long>> mutableLiveData = new MutableLiveData<>();
        this._deleteLiveData = mutableLiveData;
        this.deleteLiveData = mutableLiveData;
        this.currentTimeStamp = System.currentTimeMillis();
    }

    public final void delData(@Nullable BloodPressureHistoryEntity item) {
        if (item == null) {
            return;
        }
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(item, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Resource<Long>> getDeleteLiveData() {
        return this.deleteLiveData;
    }

    @NotNull
    public final LiveData<List<BloodPressureDbVo>> getHistoryData() {
        final Flow<List<BloodPressureDbVo>> dataByUserId = this.localDataRepo.getDataByUserId(UserEx.getUserId());
        final Flow<List<? extends BloodPressureDbVo>> flow = new Flow<List<? extends BloodPressureDbVo>>() { // from class: com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$getHistoryData$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$getHistoryData$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BloodPressureDbVo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ BloodPressureHistoryViewModel$getHistoryData$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$getHistoryData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$getHistoryData$$inlined$map$1$2", f = "BloodPressureHistoryViewModel.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, BloodPressureHistoryViewModel$getHistoryData$$inlined$map$1 bloodPressureHistoryViewModel$getHistoryData$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = bloodPressureHistoryViewModel$getHistoryData$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends BloodPressureDbVo> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends BloodPressureDbVo> list2 = list;
                        if (list2 == null) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (!Boxing.boxBoolean(((BloodPressureDbVo) obj2).getDataSource() == 3).booleanValue()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends BloodPressureDbVo>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = dataByUserId.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return FlowLiveDataConversions.asLiveData$default(new Flow<List<? extends BloodPressureDbVo>>() { // from class: com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$getHistoryData$$inlined$map$2

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$getHistoryData$$inlined$map$2$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BloodPressureDbVo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ BloodPressureHistoryViewModel$getHistoryData$$inlined$map$2 b;

                /* JADX INFO: renamed from: com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$getHistoryData$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodpressure_ui.history.BloodPressureHistoryViewModel$getHistoryData$$inlined$map$2$2", f = "BloodPressureHistoryViewModel.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, BloodPressureHistoryViewModel$getHistoryData$$inlined$map$2 bloodPressureHistoryViewModel$getHistoryData$$inlined$map$2) {
                    this.a = flowCollector;
                    this.b = bloodPressureHistoryViewModel$getHistoryData$$inlined$map$2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends BloodPressureDbVo> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends BloodPressureDbVo> list2 = list;
                        if (list2 == null) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (Boxing.boxBoolean(((BloodPressureDbVo) obj2).getMeasureTime() <= this.currentTimeStamp).booleanValue()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends BloodPressureDbVo>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }
}
