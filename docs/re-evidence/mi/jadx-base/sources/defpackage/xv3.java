package defpackage;

import java.util.Iterator;
import java.util.List;
import org.threeten.bp.chrono.a;
import org.threeten.bp.chrono.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xv3 implements y4p {
    public static xv3 between(a aVar, a aVar2) {
        crd.i(aVar, "startDateInclusive");
        crd.i(aVar2, "endDateExclusive");
        return aVar.until(aVar2);
    }

    @Override // defpackage.y4p
    public abstract s4p addTo(s4p s4pVar);

    public abstract boolean equals(Object obj);

    @Override // defpackage.y4p
    public abstract long get(c5p c5pVar);

    public abstract b getChronology();

    @Override // defpackage.y4p
    public abstract List<c5p> getUnits();

    public abstract int hashCode();

    public boolean isNegative() {
        Iterator<c5p> it = getUnits().iterator();
        while (it.hasNext()) {
            if (get(it.next()) < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isZero() {
        Iterator<c5p> it = getUnits().iterator();
        while (it.hasNext()) {
            if (get(it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public abstract xv3 minus(y4p y4pVar);

    public abstract xv3 multipliedBy(int i);

    public xv3 negated() {
        return multipliedBy(-1);
    }

    public abstract xv3 normalized();

    public abstract xv3 plus(y4p y4pVar);

    @Override // defpackage.y4p
    public abstract s4p subtractFrom(s4p s4pVar);

    public abstract String toString();
}
