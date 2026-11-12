package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    public static final class DefaultImpls {
        public static int compareTo(@NotNull ComparableTimeMark comparableTimeMark, @NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m2240compareToLRDsOJo(comparableTimeMark.mo2233minusUwyO8pc(other), Duration.Companion.m2332getZEROUwyO8pc());
        }

        public static boolean hasNotPassedNow(@NotNull ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasNotPassedNow(comparableTimeMark);
        }

        public static boolean hasPassedNow(@NotNull ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasPassedNow(comparableTimeMark);
        }

        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static ComparableTimeMark m2236minusLRDsOJo(@NotNull ComparableTimeMark comparableTimeMark, long j) {
            return comparableTimeMark.mo2234plusLRDsOJo(Duration.m2285unaryMinusUwyO8pc(j));
        }
    }

    int compareTo(@NotNull ComparableTimeMark comparableTimeMark);

    boolean equals(@Nullable Object obj);

    int hashCode();

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    ComparableTimeMark mo2232minusLRDsOJo(long j);

    /* JADX INFO: renamed from: minus-UwyO8pc */
    long mo2233minusUwyO8pc(@NotNull ComparableTimeMark comparableTimeMark);

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    ComparableTimeMark mo2234plusLRDsOJo(long j);
}
