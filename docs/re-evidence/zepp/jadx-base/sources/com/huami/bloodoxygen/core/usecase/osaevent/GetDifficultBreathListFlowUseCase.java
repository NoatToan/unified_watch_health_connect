package com.huami.bloodoxygen.core.usecase.osaevent;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.huami.bloodoxygen.service.osaevent.DifficultBreath;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/osaevent/GetDifficultBreathListFlowUseCase;", "", "", "from", "to", "splitIntervalTimeMillis", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/bloodoxygen/service/osaevent/DifficultBreath;", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "a", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetDifficultBreathListFlowUseCase {

    @NotNull
    private static final String b = "GetDifficultBreathListFlowUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, long j3) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetDifficultBreathListFlowUseCase execute " + this.a + " " + this.b + " " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.usecase.osaevent.GetDifficultBreathListFlowUseCase$execute$3", f = "GetDifficultBreathListFlowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetDifficultBreathListFlowUseCase.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IDataCacheDelegate.DefaultImpls.fetchOsaEvent$default(GetDifficultBreathListFlowUseCase.this.repo, this.c, this.d, 0, false, false, false, false, 124, null);
            return Unit.INSTANCE;
        }
    }

    public GetDifficultBreathListFlowUseCase(@NotNull IBloodOxygenRepo iBloodOxygenRepo) {
        this.repo = iBloodOxygenRepo;
    }

    public static /* synthetic */ Flow execute$default(GetDifficultBreathListFlowUseCase getDifficultBreathListFlowUseCase, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j3 = 3600000;
        }
        return getDifficultBreathListFlowUseCase.execute(j, j2, j3);
    }

    @NotNull
    public final Flow<List<DifficultBreath>> execute(final long from, final long to, final long splitIntervalTimeMillis) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, new a(from, to, splitIntervalTimeMillis), 1, null);
        final Flow<List<OsaEvent>> localOsaEventsFlow = this.repo.getLocalOsaEventsFlow(from, to);
        return ExtensionKt.onStartInScope(new Flow<ArrayList<DifficultBreath>>() { // from class: com.huami.bloodoxygen.core.usecase.osaevent.GetDifficultBreathListFlowUseCase$execute$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bloodoxygen.core.usecase.osaevent.GetDifficultBreathListFlowUseCase$execute$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends OsaEvent>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ GetDifficultBreathListFlowUseCase$execute$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bloodoxygen.core.usecase.osaevent.GetDifficultBreathListFlowUseCase$execute$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodoxygen.core.usecase.osaevent.GetDifficultBreathListFlowUseCase$execute$$inlined$map$1$2", f = "GetDifficultBreathListFlowUseCase.kt", i = {}, l = {160}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, GetDifficultBreathListFlowUseCase$execute$$inlined$map$1 getDifficultBreathListFlowUseCase$execute$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = getDifficultBreathListFlowUseCase$execute$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends OsaEvent> list, @NotNull Continuation continuation) {
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
                    int i3 = 1;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends OsaEvent> list2 = list;
                        ArrayList arrayList = new ArrayList();
                        long hourTime = from;
                        long j = hourTime;
                        while (true) {
                            GetDifficultBreathListFlowUseCase$execute$$inlined$map$1 getDifficultBreathListFlowUseCase$execute$$inlined$map$1 = this.b;
                            if (hourTime > to) {
                                break;
                            }
                            long jMin = Math.min(BloodOxygenUtils.INSTANCE.getHourTime(j + splitIntervalTimeMillis), to);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                long timestamp = ((OsaEvent) obj2).getTimestamp();
                                boolean z = false;
                                if (hourTime <= timestamp && timestamp <= jMin) {
                                    z = true;
                                }
                                if (Boxing.boxBoolean(z).booleanValue()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            int size = arrayList2.size();
                            if (size > 0) {
                                arrayList.add(new DifficultBreath(hourTime, jMin, size, ((OsaEvent) CollectionsKt.first((List) list2)).getVersion()));
                            }
                            hourTime = BloodOxygenUtils.INSTANCE.getHourTime(hourTime + splitIntervalTimeMillis);
                            j = jMin;
                            i3 = 1;
                        }
                        anonymousClass1.b = i3;
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
            public Object collect(@NotNull FlowCollector<? super ArrayList<DifficultBreath>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = localOsaEventsFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new b(from, to, null));
    }
}
