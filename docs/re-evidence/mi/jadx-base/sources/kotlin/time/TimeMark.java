package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeMark {

    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(@NotNull TimeMark timeMark) {
            return Duration.m2267isNegativeimpl(timeMark.mo2231elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(@NotNull TimeMark timeMark) {
            return !Duration.m2267isNegativeimpl(timeMark.mo2231elapsedNowUwyO8pc());
        }

        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static TimeMark m2348minusLRDsOJo(@NotNull TimeMark timeMark, long j) {
            return timeMark.mo2234plusLRDsOJo(Duration.m2285unaryMinusUwyO8pc(j));
        }

        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public static TimeMark m2349plusLRDsOJo(@NotNull TimeMark timeMark, long j) {
            return new AdjustedTimeMark(timeMark, j, null);
        }
    }

    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    long mo2231elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    TimeMark mo2232minusLRDsOJo(long j);

    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    TimeMark mo2234plusLRDsOJo(long j);
}
