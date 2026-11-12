package defpackage;

import java.util.Map;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public interface z4p {
    <R extends s4p> R adjustInto(R r2, long j);

    long getFrom(t4p t4pVar);

    boolean isDateBased();

    boolean isSupportedBy(t4p t4pVar);

    boolean isTimeBased();

    ValueRange range();

    ValueRange rangeRefinedBy(t4p t4pVar);

    t4p resolve(Map<z4p, Long> map, t4p t4pVar, ResolverStyle resolverStyle);
}
