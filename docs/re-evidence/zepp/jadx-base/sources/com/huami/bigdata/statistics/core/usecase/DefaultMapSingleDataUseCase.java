package com.huami.bigdata.statistics.core.usecase;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.entity.AbstractDateData;
import com.huami.bigdata.statistics.core.entity.AbstractSingleData;
import com.huami.bigdata.statistics.core.entity.AbstractStatistics;
import com.huami.bigdata.statistics.core.utils.TimeUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¤@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0002H$¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0002H$¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/huami/bigdata/statistics/core/usecase/DefaultMapSingleDataUseCase;", "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bigdata/statistics/core/entity/AbstractSingleData;", "SD", "Lcom/huami/bigdata/statistics/core/usecase/DefaultMergeBigDataUseCase;", "", "from", "to", "", "getLocalDataList", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "singleData", "mapSingleDataToStatisticsData", "(Lcom/huami/bigdata/statistics/core/entity/AbstractSingleData;)Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "mapSingleDataToDateData", "(Lcom/huami/bigdata/statistics/core/entity/AbstractSingleData;)Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "", "dateFormat", "getLocal", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class DefaultMapSingleDataUseCase<DT extends AbstractDateData, T extends AbstractStatistics<DT>, SD extends AbstractSingleData> extends DefaultMergeBigDataUseCase<DT, T> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase", f = "DefaultMapSingleDataUseCase.kt", i = {0, 0}, l = {36}, m = "getLocal$suspendImpl", n = {"this", "dateFormat"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public final /* synthetic */ DefaultMapSingleDataUseCase<DT, T, SD> d;
        public int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DefaultMapSingleDataUseCase<DT, T, SD> defaultMapSingleDataUseCase, Continuation<? super a> continuation) {
            super(continuation);
            this.d = defaultMapSingleDataUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return DefaultMapSingleDataUseCase.d(this.d, 0L, 0L, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0002\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bigdata/statistics/core/entity/AbstractSingleData;", "SD", "Ljava/lang/reflect/Field;", "field", "Lcom/huami/bigdata/statistics/core/annotation/ActionType;", "actionType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Field, ActionType, Unit> {
        public final /* synthetic */ DefaultMapSingleDataUseCase<DT, T, SD> a;
        public final /* synthetic */ Ref.ObjectRef<T> b;
        public final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DefaultMapSingleDataUseCase<DT, T, SD> defaultMapSingleDataUseCase, Ref.ObjectRef<T> objectRef, T t) {
            super(2);
            this.a = defaultMapSingleDataUseCase;
            this.b = objectRef;
            this.c = t;
        }

        public final void a(@NotNull Field field, @Nullable ActionType actionType) throws Exception {
            if (actionType == null) {
                return;
            }
            DefaultMapSingleDataUseCase<DT, T, SD> defaultMapSingleDataUseCase = this.a;
            T t = this.b.element;
            Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.Any");
            defaultMapSingleDataUseCase.mergeWithAction$core_release(t, this.c, actionType, field);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Field field, ActionType actionType) throws Exception {
            a(field, actionType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0002\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bigdata/statistics/core/entity/AbstractSingleData;", "SD", "Ljava/lang/reflect/Field;", "field", "Lcom/huami/bigdata/statistics/core/annotation/ActionType;", "actionType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Field, ActionType, Unit> {
        public final /* synthetic */ DefaultMapSingleDataUseCase<DT, T, SD> a;
        public final /* synthetic */ HashMap<String, DT> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ DT d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DefaultMapSingleDataUseCase<DT, T, SD> defaultMapSingleDataUseCase, HashMap<String, DT> map, String str, DT dt) {
            super(2);
            this.a = defaultMapSingleDataUseCase;
            this.b = map;
            this.c = str;
            this.d = dt;
        }

        public final void a(@NotNull Field field, @Nullable ActionType actionType) throws Exception {
            if (actionType == null) {
                return;
            }
            DefaultMapSingleDataUseCase<DT, T, SD> defaultMapSingleDataUseCase = this.a;
            DT dt = this.b.get(this.c);
            Objects.requireNonNull(dt, "null cannot be cast to non-null type kotlin.Any");
            defaultMapSingleDataUseCase.mergeWithAction$core_release(dt, this.d, actionType, field);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Field field, ActionType actionType) throws Exception {
            a(field, actionType);
            return Unit.INSTANCE;
        }
    }

    public DefaultMapSingleDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi) {
        super(iBigDataExportedApi);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [T, com.huami.bigdata.statistics.core.entity.AbstractStatistics] */
    public static /* synthetic */ Object d(DefaultMapSingleDataUseCase defaultMapSingleDataUseCase, long j, long j2, String str, Continuation continuation) {
        a aVar;
        DefaultMapSingleDataUseCase defaultMapSingleDataUseCase2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(defaultMapSingleDataUseCase, continuation);
            }
        } else {
            aVar = new a(defaultMapSingleDataUseCase, continuation);
        }
        a aVar2 = aVar;
        Object localDataList = aVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(localDataList);
            aVar2.a = defaultMapSingleDataUseCase;
            aVar2.b = str;
            aVar2.e = 1;
            localDataList = defaultMapSingleDataUseCase.getLocalDataList(j, j2, aVar2);
            if (localDataList == coroutine_suspended) {
                defaultMapSingleDataUseCase2 = defaultMapSingleDataUseCase;
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.b;
            DefaultMapSingleDataUseCase defaultMapSingleDataUseCase3 = (DefaultMapSingleDataUseCase) aVar2.a;
            ResultKt.throwOnFailure(localDataList);
            defaultMapSingleDataUseCase2 = defaultMapSingleDataUseCase3;
        }
        defaultMapSingleDataUseCase2 = defaultMapSingleDataUseCase;
        List<AbstractSingleData> list = (List) localDataList;
        if (list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (AbstractSingleData abstractSingleData : list) {
            ?? MapSingleDataToStatisticsData = defaultMapSingleDataUseCase2.mapSingleDataToStatisticsData(abstractSingleData);
            T t = objectRef.element;
            if (t == 0) {
                objectRef.element = MapSingleDataToStatisticsData;
            } else {
                defaultMapSingleDataUseCase2.forEachAnnotation$core_release(t, new b(defaultMapSingleDataUseCase2, objectRef, MapSingleDataToStatisticsData));
            }
            String strTimestampToFormat = TimeUtils.INSTANCE.timestampToFormat(abstractSingleData.getInnerTimestamp(), str, TimeZone.getTimeZone(abstractSingleData.getInnerTimezoneId()));
            AbstractDateData abstractDateDataMapSingleDataToDateData = defaultMapSingleDataUseCase2.mapSingleDataToDateData(abstractSingleData);
            abstractDateDataMapSingleDataToDateData.setDate(strTimestampToFormat);
            if (map.containsKey(strTimestampToFormat)) {
                defaultMapSingleDataUseCase2.forEachAnnotation$core_release(map.get(strTimestampToFormat), new c(defaultMapSingleDataUseCase2, map, strTimestampToFormat, abstractDateDataMapSingleDataToDateData));
            } else {
                map.put(strTimestampToFormat, abstractDateDataMapSingleDataToDateData);
            }
        }
        T t2 = objectRef.element;
        AbstractStatistics abstractStatistics = (AbstractStatistics) t2;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((AbstractDateData) ((Map.Entry) it2.next()).getValue());
        }
        abstractStatistics.setDataArray(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator<T>() { // from class: com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase$getLocal$lambda-4$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t3, T t4) {
                return ComparisonsKt__ComparisonsKt.compareValues(((AbstractDateData) t3).getDate(), ((AbstractDateData) t4).getDate());
            }
        }));
        return t2;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @Nullable
    public Object getLocal(long j, long j2, @NotNull String str, @NotNull Continuation<? super T> continuation) {
        return d(this, j, j2, str, continuation);
    }

    @Nullable
    public abstract Object getLocalDataList(long j, long j2, @NotNull Continuation<? super List<? extends SD>> continuation);

    @NotNull
    public abstract DT mapSingleDataToDateData(@NotNull SD singleData);

    @NotNull
    public abstract T mapSingleDataToStatisticsData(@NotNull SD singleData);
}
