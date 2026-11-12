package kotlin.time;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
@ExperimentalTime
public abstract class TimeMark {
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public abstract long mo4315elapsedNowUwyO8pc();

    public final boolean hasNotPassedNow() {
        return Duration.m4347isNegativeimpl(mo4315elapsedNowUwyO8pc());
    }

    public final boolean hasPassedNow() {
        return !Duration.m4347isNegativeimpl(mo4315elapsedNowUwyO8pc());
    }

    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public TimeMark m4419minusLRDsOJo(long j) {
        return mo4316plusLRDsOJo(Duration.m4366unaryMinusUwyO8pc(j));
    }

    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public TimeMark mo4316plusLRDsOJo(long j) {
        return new a(this, j, null);
    }
}
