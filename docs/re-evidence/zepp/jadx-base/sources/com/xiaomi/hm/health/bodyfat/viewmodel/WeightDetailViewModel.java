package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel;
import com.xiaomi.hm.health.bodyfat.worker.SyncWeightInfoWorker;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR'\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011Ru\u0010\u0018\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00050\u0013 \u0015*.\u0012(\u0012&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00050\u0013\u0018\u00010\u00040\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R'\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "uid", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "getWeightInfos", "getBodyFatInfos", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getUid", "()Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/LiveData;", "getWeightinfos", "()Landroidx/lifecycle/LiveData;", "weightinfos", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "kotlin.jvm.PlatformType", "c", "getUserInfos", "userInfos", GoogleApiAvailabilityLight.a, "getBodyfatInfos", "bodyfatInfos", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> uid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<WeightInfos>> weightinfos;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LiveData<List<UserInfos>> userInfos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<WeightInfos>> bodyfatInfos;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel$1", f = "WeightDetailViewModel.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowAsFlow = FlowKt.asFlow(CollectionsKt___CollectionsKt.reversed(UserInfoManager.getManager().getAllInfos()));
                Flow<Object> flow = new Flow<Object>() { // from class: com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                    public static final class AnonymousClass2 implements FlowCollector<UserInfos> {
                        public final /* synthetic */ FlowCollector a;
                        public final /* synthetic */ WeightDetailViewModel$1$invokeSuspend$$inlined$map$1 b;

                        /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel$1$invokeSuspend$$inlined$map$1$2", f = "WeightDetailViewModel.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
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

                        public AnonymousClass2(FlowCollector flowCollector, WeightDetailViewModel$1$invokeSuspend$$inlined$map$1 weightDetailViewModel$1$invokeSuspend$$inlined$map$1) {
                            this.a = flowCollector;
                            this.b = weightDetailViewModel$1$invokeSuspend$$inlined$map$1;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(UserInfos userInfos, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Object obj;
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
                            Object obj2 = anonymousClass1.a;
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.b;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.a;
                                UserInfos userInfos2 = userInfos;
                                WeightInfos latestInfoFromDevice = WeightInfoRepository.INSTANCE.getInstance().getLatestInfoFromDevice(Utils.INSTANCE.toLongValue(userInfos2.getUserId(), 0L));
                                if (latestInfoFromDevice != null) {
                                    obj = userInfos2;
                                    obj = latestInfoFromDevice;
                                }
                                obj = userInfos2;
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                FlowCollector<? super Object> flowCollector = new FlowCollector<Object>() { // from class: com.xiaomi.hm.health.bodyfat.viewmodel.WeightDetailViewModel$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Object obj2, @NotNull Continuation continuation) {
                        int i2 = 0;
                        if (obj2 instanceof UserInfos) {
                            Pair[] pairArr = {TuplesKt.to("userId", Boxing.boxLong(Utils.INSTANCE.toLongValue(((UserInfos) obj2).getUserId(), 0L))), TuplesKt.to("startTime", Boxing.boxInt(-1))};
                            Data.Builder builder = new Data.Builder();
                            while (i2 < 2) {
                                Pair pair = pairArr[i2];
                                builder.put((String) pair.getFirst(), pair.getSecond());
                                i2++;
                            }
                            WorkManager.getInstance().enqueue(new OneTimeWorkRequest.Builder(SyncWeightInfoWorker.class).setInputData(builder.build()).build());
                        } else if (obj2 instanceof WeightInfos) {
                            WeightInfos weightInfos = (WeightInfos) obj2;
                            Pair[] pairArr2 = {TuplesKt.to("userId", weightInfos.getUserId()), TuplesKt.to("startTime", weightInfos.getTimestamp())};
                            Data.Builder builder2 = new Data.Builder();
                            while (i2 < 2) {
                                Pair pair2 = pairArr2[i2];
                                builder2.put((String) pair2.getFirst(), pair2.getSecond());
                                i2++;
                            }
                            WorkManager.getInstance().enqueue(new OneTimeWorkRequest.Builder(SyncWeightInfoWorker.class).setInputData(builder2.build()).build());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    public WeightDetailViewModel() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.uid = mutableLiveData;
        this.weightinfos = Transformations.switchMap(mutableLiveData, new Function() { // from class: zr8
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WeightDetailViewModel.e(this.a, (Long) obj);
            }
        });
        this.userInfos = UserInfoManager.getManager().getAllUserInfos();
        this.bodyfatInfos = Transformations.switchMap(mutableLiveData, new Function() { // from class: as8
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WeightDetailViewModel.c(this.a, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData c(WeightDetailViewModel weightDetailViewModel, Long l) {
        return weightDetailViewModel.getBodyFatInfos(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(WeightDetailViewModel weightDetailViewModel, Long l) {
        return weightDetailViewModel.getWeightInfos(l.longValue());
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getBodyFatInfos(long uid) {
        return WeightInfoRepository.INSTANCE.getInstance().getBodyFatInfosAsLiveData(uid);
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getBodyfatInfos() {
        return this.bodyfatInfos;
    }

    @NotNull
    public final MutableLiveData<Long> getUid() {
        return this.uid;
    }

    public final LiveData<List<UserInfos>> getUserInfos() {
        return this.userInfos;
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getWeightInfos(long uid) {
        return WeightInfoRepository.INSTANCE.getInstance().getWeightInfosAsc(uid);
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getWeightinfos() {
        return this.weightinfos;
    }
}
