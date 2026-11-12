package defpackage;

import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public interface t4p {
    int get(z4p z4pVar);

    long getLong(z4p z4pVar);

    boolean isSupported(z4p z4pVar);

    <R> R query(b5p<R> b5pVar);

    ValueRange range(z4p z4pVar);
}
