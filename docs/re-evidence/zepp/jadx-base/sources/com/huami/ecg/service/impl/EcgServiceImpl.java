package com.huami.ecg.service.impl;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.AdditionalInfo;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.ecg.core.model.ProbeGroupItem;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.ecg.service.CurveChartPoint;
import com.huami.ecg.service.EcgEntity;
import com.huami.ecg.service.EcgService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0016R\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/ecg/service/impl/EcgServiceImpl;", "Lcom/huami/ecg/service/EcgService;", "Lcom/huami/ecg/core/db/entity/EcgData;", "", "c", "", GoogleApiAvailabilityLight.a, ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/flow/Flow;", "a", "Lcom/huami/ecg/service/EcgEntity;", "loadLatestEcg", "Lcom/huami/ecg/EcgDataRepo;", "Lkotlin/Lazy;", "b", "()Lcom/huami/ecg/EcgDataRepo;", "mDataRepo", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgServiceImpl implements EcgService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    @DebugMetadata(c = "com.huami.ecg.service.impl.EcgServiceImpl$asFlow$1", f = "EcgServiceImpl.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2}, l = {63, 67, 68}, m = "invokeSuspend", n = {"$this$flow", "channel", "observer", "$this$flow", "channel", "observer", "$this$flow", "channel", "observer", "value"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class a<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        private FlowCollector a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public int g;
        public final /* synthetic */ LiveData h;

        /* JADX INFO: renamed from: com.huami.ecg.service.impl.EcgServiceImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        @DebugMetadata(c = "com.huami.ecg.service.impl.EcgServiceImpl$asFlow$1$1", f = "EcgServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0376a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private CoroutineScope a;
            public int b;
            public final /* synthetic */ Observer d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0376a(Observer observer, Continuation continuation) {
                super(2, continuation);
                this.d = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0376a c0376a = new C0376a(this.d, continuation);
                c0376a.a = (CoroutineScope) obj;
                return c0376a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0376a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a.this.h.observeForever(this.d);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        @DebugMetadata(c = "com.huami.ecg.service.impl.EcgServiceImpl$asFlow$1$2", f = "EcgServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private CoroutineScope a;
            public int b;
            public final /* synthetic */ Observer d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Observer observer, Continuation continuation) {
                super(2, continuation);
                this.d = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.d, continuation);
                bVar.a = (CoroutineScope) obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a.this.h.removeObserver(this.d);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "it", "", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class c<T> implements Observer<T> {
            public final /* synthetic */ Channel a;

            public c(Channel channel) {
                this.a = channel;
            }

            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(@Nullable T t) {
                this.a.offer(t);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveData liveData, Continuation continuation) {
            super(2, continuation);
            this.h = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.h, continuation);
            aVar.a = (FlowCollector) obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b5 A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #0 {all -> 0x00e4, blocks: (B:29:0x00ad, B:31:0x00b5), top: B:45:0x00ad }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00cb A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v17 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r5v5, types: [androidx.lifecycle.Observer, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.ecg.service.impl.EcgServiceImpl.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ecg/EcgDataRepo;", "a", "()Lcom/huami/ecg/EcgDataRepo;"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<EcgDataRepo> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgDataRepo getA() {
            return new EcgDataRepo();
        }
    }

    private final <T> Flow<T> a(@NotNull LiveData<T> liveData) {
        return FlowKt.flow(new a(liveData, null));
    }

    private final EcgDataRepo b() {
        return (EcgDataRepo) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float c(@NotNull EcgData ecgData) {
        ProbeGroupItem probeGroupItemValueByEcg = ProbeGroupItem.INSTANCE.valueByEcg(ecgData);
        float f = (probeGroupItemValueByEcg == null || !d(ecgData)) ? ecgData.getEcgResultData().getHealthRecord().getCom.huami.ecg.core.model.EcgHealthRecord.z java.lang.String() : probeGroupItemValueByEcg.getFatigue();
        if (f < 1) {
            return 0.0f;
        }
        return f;
    }

    private final boolean d(@NotNull EcgData ecgData) {
        return Intrinsics.areEqual(MeasureContentType.CHEST_HEART, ecgData.getMeasureContentType());
    }

    @Override // com.huami.ecg.service.EcgService
    @NotNull
    public Flow<EcgEntity> loadLatestEcg() {
        final Flow flowA = a(b().getLatestEcgData(EcgCore.INSTANCE.getWebSetting().userId()));
        return new Flow<EcgEntity>() { // from class: com.huami.ecg.service.impl.EcgServiceImpl$loadLatestEcg$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull final FlowCollector<? super EcgEntity> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowA.collect(new FlowCollector<EcgData>() { // from class: com.huami.ecg.service.impl.EcgServiceImpl$loadLatestEcg$$inlined$map$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(EcgData ecgData, @NotNull Continuation continuation2) {
                        EcgEntity ecgEntity;
                        List listEmptyList;
                        Integer numBoxInt;
                        List<Float> filterData;
                        FlowCollector flowCollector2 = flowCollector;
                        EcgData ecgData2 = ecgData;
                        if (ecgData2 != null) {
                            long timestamp = ecgData2.getTimestamp();
                            int hr = ecgData2.getEcgResultData().getHealthRecord().getHr();
                            float fC = this.c(ecgData2);
                            FilterRecord filterRecord = new EcgDataRepo().getFilterRecord(ecgData2, true, true);
                            int iIntValue = 0;
                            if (filterRecord == null || (filterData = filterRecord.getFilterData()) == null) {
                                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                            } else {
                                ArrayList arrayList = new ArrayList();
                                int i = 0;
                                for (Object obj : filterData) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    }
                                    Integer numBoxInt2 = Boxing.boxInt(i);
                                    ((Number) obj).floatValue();
                                    if (Boxing.boxBoolean(numBoxInt2.intValue() <= 650).booleanValue()) {
                                        arrayList.add(obj);
                                    }
                                    i = i2;
                                }
                                listEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                int i3 = 0;
                                for (Object obj2 : arrayList) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    }
                                    listEmptyList.add(new CurveChartPoint(Boxing.boxInt(i3).intValue(), ((Number) obj2).floatValue()));
                                    i3 = i4;
                                }
                            }
                            List list = listEmptyList;
                            AdditionalInfo additionalInfo = ecgData2.getEcgResultData().getCom.huami.ecg.core.model.EcgResultData.j java.lang.String();
                            if (additionalInfo != null && (numBoxInt = Boxing.boxInt(additionalInfo.getAFibResult())) != null) {
                                iIntValue = numBoxInt.intValue();
                            }
                            ecgEntity = new EcgEntity(timestamp, fC, hr, list, iIntValue, ecgData2.getEcgResultData().getHealthRecord().getHr());
                        } else {
                            ecgEntity = null;
                        }
                        Object objEmit = flowCollector2.emit(ecgEntity, continuation2);
                        return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                }, continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
