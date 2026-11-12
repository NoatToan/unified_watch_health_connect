package com.huami.bodymeasurements.temperature.model.service;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.health.bodymeasurements.p014temperatureservice.Temperature;
import com.huami.health.bodymeasurements.p014temperatureservice.TemperatureService;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/service/TemperatureServiceImpl;", "Lcom/huami/health/bodymeasurements/temperatureservice/TemperatureService;", "Lorg/koin/core/component/KoinComponent;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/bodymeasurements/temperatureservice/Temperature;", "loadLatestTemperature", "", "supportWristTempDevice", "", "Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository;", "a", "Ljava/util/List;", "repoList", "", "b", "Ljava/lang/String;", "tag", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "c", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "tempExternalApi", "<init>", "(Ljava/util/List;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class TemperatureServiceImpl implements TemperatureService, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<TempBaseRepository> repoList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "TemperatureServiceImpl";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final TempExternalApi tempExternalApi = (TempExternalApi) ScopesKt.temperatureScope(getKoin()).getOrNull(Reflection.getOrCreateKotlinClass(TempExternalApi.class), null, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ TemperatureVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TemperatureVo temperatureVo) {
            super(0);
            this.a = temperatureVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("latestTemp:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadLatestTemperature is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "tempExternalApi is null";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureServiceImpl(@NotNull List<? extends TempBaseRepository> list) {
        this.repoList = list;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.health.bodymeasurements.p014temperatureservice.TemperatureService
    @NotNull
    public Flow<Temperature> loadLatestTemperature() {
        List<TempBaseRepository> list = this.repoList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TempBaseRepository) it2.next()).getLatestTempFlow());
        }
        Object[] array = CollectionsKt___CollectionsKt.toList(arrayList).toArray(new Flow[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        final Flow[] flowArr = (Flow[]) array;
        return FlowKt.distinctUntilChanged(new Flow<Temperature>() { // from class: com.huami.bodymeasurements.temperature.model.service.TemperatureServiceImpl$loadLatestTemperature$$inlined$combine$1

            /* JADX INFO: renamed from: com.huami.bodymeasurements.temperature.model.service.TemperatureServiceImpl$loadLatestTemperature$$inlined$combine$1$3, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$4$lambda$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.service.TemperatureServiceImpl$loadLatestTemperature$$inlined$combine$1$3", f = "TemperatureServiceImpl.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Temperature>, TemperatureVo[], Continuation<? super Unit>, Object> {
                private FlowCollector a;
                private Object[] b;
                public Object c;
                public Object d;
                public Object e;
                public int f;
                public final /* synthetic */ TemperatureServiceImpl$loadLatestTemperature$$inlined$combine$1 g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, TemperatureServiceImpl$loadLatestTemperature$$inlined$combine$1 temperatureServiceImpl$loadLatestTemperature$$inlined$combine$1) {
                    super(3, continuation);
                    this.g = temperatureServiceImpl$loadLatestTemperature$$inlined$combine$1;
                }

                @NotNull
                public final Continuation<Unit> create(@NotNull FlowCollector<? super Temperature> flowCollector, @NotNull TemperatureVo[] temperatureVoArr, @NotNull Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation, this.g);
                    anonymousClass3.a = flowCollector;
                    anonymousClass3.b = temperatureVoArr;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super Temperature> flowCollector, TemperatureVo[] temperatureVoArr, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(flowCollector, temperatureVoArr, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object next;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.f;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        TemperatureVo[] temperatureVoArr = (TemperatureVo[]) this.b;
                        for (TemperatureVo temperatureVo : temperatureVoArr) {
                            HMLog.info(this.tag, new TemperatureServiceImpl.a(temperatureVo));
                        }
                        Temperature temperature = null;
                        if (temperatureVoArr.length == 0) {
                            HMLog.info(this.tag, TemperatureServiceImpl.b.a);
                        } else if (this.tempExternalApi == null) {
                            HMLog.info(this.tag, TemperatureServiceImpl.c.a);
                        } else {
                            int tempUnit = this.tempExternalApi.getTempUnit();
                            Iterator it2 = ArraysKt___ArraysKt.filterNotNull(temperatureVoArr).iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    Long lBoxLong = Boxing.boxLong(((TemperatureVo) next).getTimestamp());
                                    do {
                                        Object next2 = it2.next();
                                        Long lBoxLong2 = Boxing.boxLong(((TemperatureVo) next2).getTimestamp());
                                        if (lBoxLong.compareTo(lBoxLong2) < 0) {
                                            next = next2;
                                            lBoxLong = lBoxLong2;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            TemperatureVo temperatureVo2 = (TemperatureVo) next;
                            if (temperatureVo2 != null) {
                                temperature = TemperatureServiceImplKt.toTemperature(temperatureVo2, tempUnit);
                            }
                        }
                        this.f = 1;
                        if (flowCollector.emit(temperature, this) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Temperature> flowCollector, @NotNull Continuation continuation) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new Function0<TemperatureVo[]>() { // from class: com.huami.bodymeasurements.temperature.model.service.TemperatureServiceImpl$loadLatestTemperature$$inlined$combine$1.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final TemperatureVo[] invoke() {
                        return new TemperatureVo[flowArr.length];
                    }
                }, new AnonymousClass3(null, this), continuation);
                return objCombineInternal == a.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        });
    }

    @Override // com.huami.health.bodymeasurements.p014temperatureservice.TemperatureService
    public boolean supportWristTempDevice() {
        TempExternalApi tempExternalApi = this.tempExternalApi;
        if (tempExternalApi == null) {
            return false;
        }
        return tempExternalApi.supportWristTempDevice();
    }
}
