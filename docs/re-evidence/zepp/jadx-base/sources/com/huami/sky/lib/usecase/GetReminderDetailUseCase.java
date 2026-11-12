package com.huami.sky.lib.usecase;

import com.huami.sky.lib.constant.DayOfWeek;
import com.huami.sky.lib.entity.DaysType;
import com.huami.sky.lib.entity.SleepReminderInfo;
import com.huami.sky.lib.entity.SleepReminderSettingInfo;
import com.huami.sky.lib.repo.reminder.ISleepReminderRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0086Bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/lib/usecase/GetReminderDetailUseCase;", "", "", "totalMinutes", "", "b", "Lcom/huami/sky/lib/entity/SleepReminderInfo;", "Lcom/huami/sky/lib/entity/SleepReminderSettingInfo;", "a", "", "daysArr", "Lcom/huami/sky/lib/entity/DaysType;", "c", "Lkotlinx/coroutines/flow/Flow;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", "Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", "getRepo", "()Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;Lkotlinx/coroutines/CoroutineDispatcher;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class GetReminderDetailUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepReminderRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    /* JADX INFO: renamed from: com.huami.sky.lib.usecase.GetReminderDetailUseCase$invoke$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/lib/entity/SleepReminderSettingInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.usecase.GetReminderDetailUseCase$invoke$2", f = "GetReminderDetailUseCase.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends SleepReminderSettingInfo>>, Object> {
        public int a;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetReminderDetailUseCase.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends SleepReminderSettingInfo>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Flow<SleepReminderSettingInfo>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Flow<SleepReminderSettingInfo>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ISleepReminderRepo repo = GetReminderDetailUseCase.this.getRepo();
                this.a = 1;
                obj = repo.sleepReminderInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final Flow flow = (Flow) obj;
            final GetReminderDetailUseCase getReminderDetailUseCase = GetReminderDetailUseCase.this;
            return new Flow<SleepReminderSettingInfo>() { // from class: com.huami.sky.lib.usecase.GetReminderDetailUseCase$invoke$2$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.huami.sky.lib.usecase.GetReminderDetailUseCase$invoke$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                public static final class AnonymousClass2 implements FlowCollector<SleepReminderInfo> {
                    public final /* synthetic */ FlowCollector a;
                    public final /* synthetic */ GetReminderDetailUseCase b;

                    /* JADX INFO: renamed from: com.huami.sky.lib.usecase.GetReminderDetailUseCase$invoke$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.sky.lib.usecase.GetReminderDetailUseCase$invoke$2$invokeSuspend$$inlined$map$1$2", f = "GetReminderDetailUseCase.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object a;
                        public int b;
                        public Object c;

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

                    public AnonymousClass2(FlowCollector flowCollector, GetReminderDetailUseCase getReminderDetailUseCase) {
                        this.a = flowCollector;
                        this.b = getReminderDetailUseCase;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(SleepReminderInfo sleepReminderInfo, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
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
                            SleepReminderSettingInfo sleepReminderSettingInfoA = this.b.a(sleepReminderInfo);
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(sleepReminderSettingInfoA, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(@NotNull FlowCollector<? super SleepReminderSettingInfo> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector, getReminderDetailUseCase), continuation);
                    return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
    }

    public GetReminderDetailUseCase(@NotNull ISleepReminderRepo iSleepReminderRepo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.repo = iSleepReminderRepo;
        this.defaultDispatcher = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepReminderSettingInfo a(SleepReminderInfo sleepReminderInfo) {
        return new SleepReminderSettingInfo(sleepReminderInfo.getSwitch() == 1, sleepReminderInfo.getDays(), c(CollectionsKt___CollectionsKt.toIntArray(sleepReminderInfo.getDays())), b(sleepReminderInfo.getTime()));
    }

    private final String b(int totalMinutes) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(totalMinutes / 60), Integer.valueOf(totalMinutes % 60)}, 2));
    }

    private final DaysType c(int[] daysArr) {
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        int length = dayOfWeekArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            arrayList.add(Integer.valueOf(dayOfWeekArrValues[i].ordinal() + 1));
            i++;
        }
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        if (daysArr.length == 0) {
            return null;
        }
        if (Arrays.equals(daysArr, ArraysKt___ArraysKt.sliceArray(intArray, new IntRange(0, 4)))) {
            return DaysType.WorkDay;
        }
        if (Arrays.equals(daysArr, ArraysKt___ArraysKt.sliceArray(intArray, new IntRange(5, 6)))) {
            return DaysType.RestDay;
        }
        return Arrays.equals(daysArr, intArray) ? DaysType.EveryDay : DaysType.Other;
    }

    @NotNull
    public final ISleepReminderRepo getRepo() {
        return this.repo;
    }

    @Nullable
    public final Object invoke(@NotNull Continuation<? super Flow<SleepReminderSettingInfo>> continuation) {
        return BuildersKt.withContext(this.defaultDispatcher, new AnonymousClass2(null), continuation);
    }

    public /* synthetic */ GetReminderDetailUseCase(ISleepReminderRepo iSleepReminderRepo, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iSleepReminderRepo, (i & 2) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }
}
