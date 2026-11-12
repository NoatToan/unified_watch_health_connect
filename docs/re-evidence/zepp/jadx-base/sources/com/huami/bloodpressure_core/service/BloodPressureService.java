package com.huami.bloodpressure_core.service;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bloodpressure.service.BloodPressureEntry;
import com.huami.bloodpressure.service.IBloodPressureService;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.local.ILocalDelegate;
import com.huami.bloodpressure_core.ext.UserEx;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/bloodpressure_core/service/BloodPressureService;", "Lcom/huami/bloodpressure/service/IBloodPressureService;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/bloodpressure/service/BloodPressureEntry;", "loadLatestBloodPressure", "", "supportDeviceMeasure", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "a", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "localDataRepo", "Lcom/huami/bloodpressure_core/service/IDeviceSwitch;", "b", "Lcom/huami/bloodpressure_core/service/IDeviceSwitch;", "iDeviceSwitch", "<init>", "(Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;Lcom/huami/bloodpressure_core/service/IDeviceSwitch;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureService implements IBloodPressureService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ILocalDelegate localDataRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private IDeviceSwitch iDeviceSwitch;

    public BloodPressureService(@NotNull ILocalDelegate iLocalDelegate, @Nullable IDeviceSwitch iDeviceSwitch) {
        this.localDataRepo = iLocalDelegate;
        this.iDeviceSwitch = iDeviceSwitch;
    }

    @Override // com.huami.bloodpressure.service.IBloodPressureService
    @NotNull
    public Flow<BloodPressureEntry> loadLatestBloodPressure() {
        final Flow<List<BloodPressureDbVo>> dataByUserId = this.localDataRepo.getDataByUserId(UserEx.getUserId());
        final Flow<List<? extends BloodPressureDbVo>> flow = new Flow<List<? extends BloodPressureDbVo>>() { // from class: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BloodPressureDbVo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ BloodPressureService$loadLatestBloodPressure$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$map$1$2", f = "BloodPressureService.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, BloodPressureService$loadLatestBloodPressure$$inlined$map$1 bloodPressureService$loadLatestBloodPressure$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = bloodPressureService$loadLatestBloodPressure$$inlined$map$1;
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
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (list2 == null) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (Boxing.boxBoolean(((BloodPressureDbVo) obj2).getMeasureTime() <= jCurrentTimeMillis).booleanValue()) {
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
        final Flow<BloodPressureDbVo> flow2 = new Flow<BloodPressureDbVo>() { // from class: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$mapNotNull$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BloodPressureDbVo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ BloodPressureService$loadLatestBloodPressure$$inlined$mapNotNull$1 b;

                /* JADX INFO: renamed from: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$mapNotNull$1$2", f = "BloodPressureService.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, BloodPressureService$loadLatestBloodPressure$$inlined$mapNotNull$1 bloodPressureService$loadLatestBloodPressure$$inlined$mapNotNull$1) {
                    this.a = flowCollector;
                    this.b = bloodPressureService$loadLatestBloodPressure$$inlined$mapNotNull$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends BloodPressureDbVo> list, @NotNull Continuation continuation) {
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
                        List<? extends BloodPressureDbVo> list2 = list;
                        BloodPressureDbVo bloodPressureDbVo = list2 == null ? null : (BloodPressureDbVo) CollectionsKt.firstOrNull((List) list2);
                        if (bloodPressureDbVo == null) {
                            return Unit.INSTANCE;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(bloodPressureDbVo, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super BloodPressureDbVo> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new Flow<BloodPressureEntry>() { // from class: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$map$2

            /* JADX INFO: renamed from: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$map$2$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<BloodPressureDbVo> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ BloodPressureService$loadLatestBloodPressure$$inlined$map$2 b;

                /* JADX INFO: renamed from: com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodpressure_core.service.BloodPressureService$loadLatestBloodPressure$$inlined$map$2$2", f = "BloodPressureService.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, BloodPressureService$loadLatestBloodPressure$$inlined$map$2 bloodPressureService$loadLatestBloodPressure$$inlined$map$2) {
                    this.a = flowCollector;
                    this.b = bloodPressureService$loadLatestBloodPressure$$inlined$map$2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(BloodPressureDbVo bloodPressureDbVo, @NotNull Continuation continuation) {
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
                        BloodPressureDbVo bloodPressureDbVo2 = bloodPressureDbVo;
                        BloodPressureEntry bloodPressureEntry = new BloodPressureEntry(bloodPressureDbVo2.getMeasureTime(), bloodPressureDbVo2.getSbp(), bloodPressureDbVo2.getDbp());
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(bloodPressureEntry, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super BloodPressureEntry> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow2.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.bloodpressure.service.IBloodPressureService
    public boolean supportDeviceMeasure() {
        IDeviceSwitch iDeviceSwitch = this.iDeviceSwitch;
        Boolean boolValueOf = iDeviceSwitch == null ? null : Boolean.valueOf(iDeviceSwitch.supportDeviceMeasureBP());
        return boolValueOf == null ? IBloodPressureService.DefaultImpls.supportDeviceMeasure(this) : boolValueOf.booleanValue();
    }

    public /* synthetic */ BloodPressureService(ILocalDelegate iLocalDelegate, IDeviceSwitch iDeviceSwitch, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iLocalDelegate, (i & 2) != 0 ? null : iDeviceSwitch);
    }
}
