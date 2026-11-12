package com.huami.third.googlefit;

import com.google.android.gms.fitness.FitnessOptions;
import com.google.android.gms.fitness.data.DataType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0005\u001a\u00020\u00008@@\u0000X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/google/android/gms/fitness/FitnessOptions;", "a", "Lkotlin/Lazy;", "getFitnessOptions", "()Lcom/google/android/gms/fitness/FitnessOptions;", "fitnessOptions", "googlefit_release"}, k = 2, mv = {1, 4, 1})
public final class GoogleFitAuthKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gms/fitness/FitnessOptions;", "kotlin.jvm.PlatformType", "a", "()Lcom/google/android/gms/fitness/FitnessOptions;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<FitnessOptions> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FitnessOptions invoke() {
            FitnessOptions.Builder builder = FitnessOptions.builder();
            DataType dataType = DataType.TYPE_STEP_COUNT_DELTA;
            return builder.addDataType(dataType, 1).addDataType(DataType.AGGREGATE_STEP_COUNT_DELTA, 1).addDataType(DataType.TYPE_ACTIVITY_SEGMENT, 1).addDataType(dataType, 1).addDataType(DataType.TYPE_CALORIES_EXPENDED, 1).addDataType(DataType.TYPE_DISTANCE_DELTA, 1).addDataType(DataType.TYPE_HEART_RATE_BPM, 1).addDataType(DataType.TYPE_WEIGHT, 1).addDataType(DataType.TYPE_SLEEP_SEGMENT, 1).build();
        }
    }

    @NotNull
    public static final FitnessOptions getFitnessOptions() {
        return (FitnessOptions) a.getValue();
    }
}
