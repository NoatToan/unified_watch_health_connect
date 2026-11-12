package defpackage;

import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sv5 implements t4p {
    @Override // defpackage.t4p
    public int get(z4p z4pVar) {
        return range(z4pVar).checkValidIntValue(getLong(z4pVar), z4pVar);
    }

    @Override // defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.g() || b5pVar == a5p.a() || b5pVar == a5p.e()) {
            return null;
        }
        return b5pVar.a(this);
    }

    @Override // defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.rangeRefinedBy(this);
        }
        if (isSupported(z4pVar)) {
            return z4pVar.range();
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
    }
}
