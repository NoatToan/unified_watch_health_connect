package com.huami.bigdata.statistics.core.usecase;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bigdata.statistics.core.annotation.Action;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.entity.AbstractDateData;
import com.huami.bigdata.statistics.core.entity.AbstractStatistics;
import com.huami.bigdata.statistics.core.utils.ExtensionsKt;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J=\u0010\r\u001a\u00020\b\"\b\b\u0002\u0010\u0004*\u00020\u0006*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u00022\u0006\u0010\f\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\u0004\u0018\u00018\u00012\b\u0010\u000b\u001a\u0004\u0018\u00018\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010 \u001a\u00020\u001c\"\b\b\u0002\u0010\u0004*\u00020\u0006*\u00028\u000228\u0010\u001d\u001a4\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0016H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010#\u001a\u00020\u001c\"\b\b\u0002\u0010\u0004*\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00022\u0006\u0010\f\u001a\u00028\u00022\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/huami/bigdata/statistics/core/usecase/DefaultMergeBigDataUseCase;", "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase;", "", "Lcom/huami/bigdata/statistics/core/annotation/ActionType;", "", "remoteValue", "localValue", "remote", "local", "c", "(Lcom/huami/bigdata/statistics/core/annotation/ActionType;DDLjava/lang/Object;Ljava/lang/Object;)D", "", "getFrom", "(Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;)Ljava/lang/Long;", "Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase$TimeMode;", SleepAnalysisFragment.TIME_MODE, "merge", "(Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase$TimeMode;)Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "Lkotlin/Function2;", "Ljava/lang/reflect/Field;", "Lkotlin/ParameterName;", "name", "field", "actionType", "", "action", "forEachAnnotation$core_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "forEachAnnotation", "mergeWithAction$core_release", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/huami/bigdata/statistics/core/annotation/ActionType;Ljava/lang/reflect/Field;)V", "mergeWithAction", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class DefaultMergeBigDataUseCase<DT extends AbstractDateData, T extends AbstractStatistics<DT>> extends AbstractBigDataUseCase<DT, T> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionType.values().length];
            iArr[ActionType.MIN.ordinal()] = 1;
            iArr[ActionType.MAX.ordinal()] = 2;
            iArr[ActionType.PLUS.ordinal()] = 3;
            iArr[ActionType.AVG.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "Ljava/lang/reflect/Field;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Field, Unit> {
        public final /* synthetic */ Function2<Field, ActionType, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Field, ? super ActionType, Unit> function2) {
            super(1);
            this.a = function2;
        }

        public final void a(@NotNull Field field) {
            Action action;
            ActionType actionTypeType = null;
            if (field.isAnnotationPresent(Action.class) && (action = (Action) field.getAnnotation(Action.class)) != null) {
                actionTypeType = action.type();
            }
            this.a.invoke(field, actionTypeType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Field field) {
            a(field);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Field;", "field", "Lcom/huami/bigdata/statistics/core/annotation/ActionType;", "actionType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Field, ActionType, Unit> {
        public final /* synthetic */ DefaultMergeBigDataUseCase<DT, T> a;
        public final /* synthetic */ T b;
        public final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DefaultMergeBigDataUseCase<DT, T> defaultMergeBigDataUseCase, T t, T t2) {
            super(2);
            this.a = defaultMergeBigDataUseCase;
            this.b = t;
            this.c = t2;
        }

        public final void a(@NotNull Field field, @Nullable ActionType actionType) throws Exception {
            if (actionType != null) {
                this.a.mergeWithAction$core_release(this.b, this.c, actionType, field);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Field field, ActionType actionType) throws Exception {
            a(field, actionType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Field;", "field", "Lcom/huami/bigdata/statistics/core/annotation/ActionType;", "actionType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Field, ActionType, Unit> {
        public final /* synthetic */ DefaultMergeBigDataUseCase<DT, T> a;
        public final /* synthetic */ HashMap<String, DT> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ DT d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DefaultMergeBigDataUseCase<DT, T> defaultMergeBigDataUseCase, HashMap<String, DT> map, String str, DT dt) {
            super(2);
            this.a = defaultMergeBigDataUseCase;
            this.b = map;
            this.c = str;
            this.d = dt;
        }

        public final void a(@NotNull Field field, @Nullable ActionType actionType) throws Exception {
            if (actionType == null) {
                return;
            }
            DefaultMergeBigDataUseCase<DT, T> defaultMergeBigDataUseCase = this.a;
            DT dt = this.b.get(this.c);
            Objects.requireNonNull(dt, "null cannot be cast to non-null type kotlin.Any");
            defaultMergeBigDataUseCase.mergeWithAction$core_release(dt, this.d, actionType, field);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Field field, ActionType actionType) throws Exception {
            a(field, actionType);
            return Unit.INSTANCE;
        }
    }

    public DefaultMergeBigDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi) {
        super(iBigDataExportedApi);
    }

    private final <T> double c(ActionType actionType, double d, double d2, T t, T t2) throws IllegalAccessException, NoSuchFieldException {
        int i = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        if (i == 1) {
            return e.coerceAtMost(d, d2);
        }
        if (i == 2) {
            return e.coerceAtLeast(d, d2);
        }
        if (i == 3) {
            return d + d2;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Field declaredField = t.getClass().getDeclaredField("totalSize");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(t);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = declaredField.get(t2);
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj2).intValue();
        return ((((double) iIntValue) * d) + (((double) iIntValue2) * d2)) / ((double) (iIntValue + iIntValue2));
    }

    public final <T> void forEachAnnotation$core_release(@NotNull T t, @NotNull Function2<? super Field, ? super ActionType, Unit> function2) {
        ExtensionsKt.forEachField(t, new a(function2));
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @Nullable
    public Long getFrom(@Nullable T remote) {
        Long lValueOf = remote == null ? null : Long.valueOf(remote.getMaxTime());
        if (lValueOf == null) {
            return null;
        }
        lValueOf.longValue();
        return Long.valueOf(ExtensionsKt.yMDHMSToTimestamp(ExtensionsKt.toYMDHMS(remote.getMaxTime(), TimeZone.getTimeZone(remote.getTimezoneId()))));
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @Nullable
    public T merge(@Nullable T remote, @Nullable T local, @NotNull AbstractBigDataUseCase.TimeMode timeMode) {
        if (remote == null && local == null) {
            return null;
        }
        if (remote == null) {
            return local;
        }
        if (local == null) {
            return remote;
        }
        forEachAnnotation$core_release(remote, new b(this, remote, local));
        List<AbstractDateData> dataArray = remote.getDataArray();
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(dataArray, 10)), 16));
        for (AbstractDateData abstractDateData : dataArray) {
            linkedHashMap.put(abstractDateData.getDate(), abstractDateData);
        }
        for (AbstractDateData abstractDateData2 : local.getDataArray()) {
            String date = abstractDateData2.getDate();
            if (linkedHashMap.get(date) == null) {
                linkedHashMap.put(date, abstractDateData2);
            } else {
                forEachAnnotation$core_release(abstractDateData2, new c(this, linkedHashMap, date, abstractDateData2));
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((AbstractDateData) ((Map.Entry) it2.next()).getValue());
        }
        remote.setDataArray(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator<T>() { // from class: com.huami.bigdata.statistics.core.usecase.DefaultMergeBigDataUseCase$merge$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((AbstractDateData) t).getDate(), ((AbstractDateData) t2).getDate());
            }
        }));
        return remote;
    }

    public final <T> void mergeWithAction$core_release(@NotNull T remote, @NotNull T local, @NotNull ActionType actionType, @NotNull Field field) throws Exception {
        Object intArray;
        Object obj = field.get(remote);
        Object obj2 = field.get(local);
        Class<?> type = field.getType();
        if (Intrinsics.areEqual(type, Integer.TYPE)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            double dIntValue = ((Integer) obj).intValue();
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            intArray = Integer.valueOf((int) c(actionType, dIntValue, ((Integer) obj2).intValue(), remote, local));
        } else if (Intrinsics.areEqual(type, Long.TYPE)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
            double dLongValue = ((Long) obj).longValue();
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            intArray = Long.valueOf((long) c(actionType, dLongValue, ((Long) obj2).longValue(), remote, local));
        } else if (Intrinsics.areEqual(type, Float.TYPE)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
            double dFloatValue = ((Float) obj).floatValue();
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            intArray = Float.valueOf((float) c(actionType, dFloatValue, ((Float) obj2).floatValue(), remote, local));
        } else if (Intrinsics.areEqual(type, Double.TYPE)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj).doubleValue();
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Double");
            intArray = Double.valueOf(c(actionType, dDoubleValue, ((Double) obj2).doubleValue(), remote, local));
        } else {
            if (!Intrinsics.areEqual(type, int[].class)) {
                throw new Exception("type of Field not supported!!! " + field.getType());
            }
            if (actionType != ActionType.PLUS) {
                throw new Exception("IntArray not support this action " + actionType);
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.IntArray");
            intArray = CollectionsKt___CollectionsKt.toIntArray(CollectionsKt___CollectionsKt.sorted(ArraysKt___ArraysKt.distinct(ArraysKt___ArraysJvmKt.plus((int[]) obj, (int[]) obj2))));
        }
        field.set(remote, intArray);
    }
}
