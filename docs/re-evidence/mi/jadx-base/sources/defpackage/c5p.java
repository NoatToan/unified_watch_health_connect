package defpackage;

import org.threeten.bp.Duration;

/* JADX INFO: loaded from: classes3.dex */
public interface c5p {
    <R extends s4p> R addTo(R r2, long j);

    long between(s4p s4pVar, s4p s4pVar2);

    Duration getDuration();

    boolean isDateBased();

    boolean isDurationEstimated();

    boolean isSupportedBy(s4p s4pVar);

    boolean isTimeBased();
}
