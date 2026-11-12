package com.huami.pai.service;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.db.PaiDb;
import com.huami.pai.dc.PaiWebConst;
import com.huami.pai.ext.DateExKt;
import com.huami.pai.ext.PaiDataVoMinExKt;
import com.huami.pai.ui.sporthint.PaiSportGoalUtil;
import com.huami.pai.vo.PAIDataVoMin;
import com.huami.pai_service.PaiInfo;
import com.huami.pai_service.PaiService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/pai/service/PaiServiceImp;", "Lcom/huami/pai_service/PaiService;", "", GoogleApiAvailabilityLight.b, "defaultCount", "Ljava/util/Date;", "nowDate", "Lkotlinx/coroutines/flow/Flow;", "", "", "", "loadRecentPaiList", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/pai_service/PaiInfo;", "loadTodayPaiStatu", "Lcom/huami/pai/db/PaiDb;", "a", "Lcom/huami/pai/db/PaiDb;", "getDbRepo", "()Lcom/huami/pai/db/PaiDb;", "dbRepo", "<init>", "(Lcom/huami/pai/db/PaiDb;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiServiceImp implements PaiService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PaiDb dbRepo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Map.Entry<Long, Float> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map.Entry<Long, Float> entry) {
            super(0);
            this.a = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "PaiService key " + this.a.getKey() + " value " + this.a.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ PaiInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PaiInfo paiInfo) {
            super(0);
            this.a = paiInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "PaiService " + this.a;
        }
    }

    public PaiServiceImp(@NotNull PaiDb paiDb) {
        this.dbRepo = paiDb;
    }

    @NotNull
    public final PaiDb getDbRepo() {
        return this.dbRepo;
    }

    @Override // com.huami.pai_service.PaiService
    @NotNull
    public Flow<Map<Long, Float>> loadRecentPaiList(final int n, int defaultCount, @NotNull final Date nowDate) {
        final Flow<Map<String, PAIDataVoMin>> flowMapWithPai = PaiDataVoMinExKt.mapWithPai(this.dbRepo.paiUserDB().getLimitUserDataFlowMin(defaultCount));
        return new Flow<Map<Long, Float>>() { // from class: com.huami.pai.service.PaiServiceImp$loadRecentPaiList$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.pai.service.PaiServiceImp$loadRecentPaiList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<Map<String, PAIDataVoMin>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ PaiServiceImp$loadRecentPaiList$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.pai.service.PaiServiceImp$loadRecentPaiList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.pai.service.PaiServiceImp$loadRecentPaiList$$inlined$map$1$2", f = "PaiService.kt", i = {}, l = {140}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, PaiServiceImp$loadRecentPaiList$$inlined$map$1 paiServiceImp$loadRecentPaiList$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = paiServiceImp$loadRecentPaiList$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Map<String, PAIDataVoMin> map, @NotNull Continuation continuation) {
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
                        Map<String, PAIDataVoMin> map2 = map;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int i3 = 0;
                        int iMax = Math.max(1, n);
                        if (iMax >= 0) {
                            while (true) {
                                int i4 = i3 + 1;
                                Date dateNextDay = DateExKt.nextDay(nowDate, -i3);
                                linkedHashMap.put(Boxing.boxLong(DateExKt.getDateTimestamp(dateNextDay)), PaiDataVoMinExKt.getRealOrPredictData(dateNextDay, map2));
                                if (i3 == iMax) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            HMLog.info(PaiWebConst.Tag.HTTP_TAG, new PaiServiceImp.a((Map.Entry) it2.next()));
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Map<Long, Float>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowMapWithPai.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.pai_service.PaiService
    @NotNull
    public Flow<PaiInfo> loadTodayPaiStatu(@NotNull final Context context, int defaultCount, @NotNull final Date nowDate) {
        final Flow<Map<String, PAIDataVoMin>> flowMapWithPai = PaiDataVoMinExKt.mapWithPai(this.dbRepo.paiUserDB().getLimitUserDataFlowMin(defaultCount));
        return new Flow<PaiInfo>() { // from class: com.huami.pai.service.PaiServiceImp$loadTodayPaiStatu$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.pai.service.PaiServiceImp$loadTodayPaiStatu$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<Map<String, PAIDataVoMin>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ PaiServiceImp$loadTodayPaiStatu$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.pai.service.PaiServiceImp$loadTodayPaiStatu$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.pai.service.PaiServiceImp$loadTodayPaiStatu$$inlined$map$1$2", f = "PaiService.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, PaiServiceImp$loadTodayPaiStatu$$inlined$map$1 paiServiceImp$loadTodayPaiStatu$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = paiServiceImp$loadTodayPaiStatu$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Map<String, PAIDataVoMin> map, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    PaiInfo paiInfo;
                    Float fBoxFloat;
                    Float fBoxFloat2;
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
                        Map<String, PAIDataVoMin> map2 = map;
                        float fFloatValue = 0.0f;
                        if (PaiDataVoMinExKt.hasReal(nowDate, map2)) {
                            PAIDataVoMin dataByMap = PaiDataVoMinExKt.getDataByMap(nowDate, map2);
                            float fFloatValue2 = (dataByMap == null || (fBoxFloat = Boxing.boxFloat(dataByMap.getTp())) == null) ? 0.0f : fBoxFloat.floatValue();
                            PAIDataVoMin dataByMap2 = PaiDataVoMinExKt.getDataByMap(nowDate, map2);
                            if (dataByMap2 != null && (fBoxFloat2 = Boxing.boxFloat(dataByMap2.getDp())) != null) {
                                fFloatValue = fBoxFloat2.floatValue();
                            }
                            paiInfo = new PaiInfo(fFloatValue2, fFloatValue, PaiSportGoalUtil.INSTANCE.getPaiStatusInfo(context, (int) fFloatValue, (int) fFloatValue2), false);
                            HMLog.info(PaiWebConst.Tag.HTTP_TAG, new PaiServiceImp.b(paiInfo));
                        } else {
                            Float predictDataByMap = PaiDataVoMinExKt.getPredictDataByMap(nowDate, map2);
                            if (predictDataByMap == null) {
                                paiInfo = null;
                            } else {
                                float fFloatValue3 = predictDataByMap.floatValue();
                                paiInfo = new PaiInfo(fFloatValue3, 0.0f, PaiSportGoalUtil.INSTANCE.getPaiStatusInfo(context, 0, (int) fFloatValue3), true);
                            }
                            if (paiInfo == null) {
                                paiInfo = new PaiInfo(0.0f, 0.0f, PaiSportGoalUtil.INSTANCE.getPaiStatusInfo(context, 0, 0), true);
                            }
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(paiInfo, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super PaiInfo> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowMapWithPai.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
