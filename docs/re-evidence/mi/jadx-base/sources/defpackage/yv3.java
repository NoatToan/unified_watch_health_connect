package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.b;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class yv3 extends xv3 implements Serializable {
    private static final long serialVersionUID = 275618735781L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f40600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40601b;
    public final int c;
    public final int d;

    public yv3(b bVar, int i, int i2, int i3) {
        this.f40600a = bVar;
        this.f40601b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.xv3, defpackage.y4p
    public s4p addTo(s4p s4pVar) {
        crd.i(s4pVar, "temporal");
        b bVar = (b) s4pVar.query(a5p.a());
        if (bVar != null && !this.f40600a.equals(bVar)) {
            throw new DateTimeException("Invalid chronology, required: " + this.f40600a.getId() + ", but was: " + bVar.getId());
        }
        int i = this.f40601b;
        if (i != 0) {
            s4pVar = s4pVar.plus(i, ChronoUnit.YEARS);
        }
        int i2 = this.c;
        if (i2 != 0) {
            s4pVar = s4pVar.plus(i2, ChronoUnit.MONTHS);
        }
        int i3 = this.d;
        return i3 != 0 ? s4pVar.plus(i3, ChronoUnit.DAYS) : s4pVar;
    }

    @Override // defpackage.xv3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv3)) {
            return false;
        }
        yv3 yv3Var = (yv3) obj;
        return this.f40601b == yv3Var.f40601b && this.c == yv3Var.c && this.d == yv3Var.d && this.f40600a.equals(yv3Var.f40600a);
    }

    @Override // defpackage.xv3, defpackage.y4p
    public long get(c5p c5pVar) {
        int i;
        if (c5pVar == ChronoUnit.YEARS) {
            i = this.f40601b;
        } else if (c5pVar == ChronoUnit.MONTHS) {
            i = this.c;
        } else {
            if (c5pVar != ChronoUnit.DAYS) {
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
            }
            i = this.d;
        }
        return i;
    }

    @Override // defpackage.xv3
    public b getChronology() {
        return this.f40600a;
    }

    @Override // defpackage.xv3, defpackage.y4p
    public List<c5p> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS));
    }

    @Override // defpackage.xv3
    public int hashCode() {
        return this.f40600a.hashCode() + Integer.rotateLeft(this.f40601b, 16) + Integer.rotateLeft(this.c, 8) + this.d;
    }

    @Override // defpackage.xv3
    public xv3 minus(y4p y4pVar) {
        if (y4pVar instanceof yv3) {
            yv3 yv3Var = (yv3) y4pVar;
            if (yv3Var.getChronology().equals(getChronology())) {
                return new yv3(this.f40600a, crd.o(this.f40601b, yv3Var.f40601b), crd.o(this.c, yv3Var.c), crd.o(this.d, yv3Var.d));
            }
        }
        throw new DateTimeException("Unable to subtract amount: " + y4pVar);
    }

    @Override // defpackage.xv3
    public xv3 multipliedBy(int i) {
        return new yv3(this.f40600a, crd.l(this.f40601b, i), crd.l(this.c, i), crd.l(this.d, i));
    }

    @Override // defpackage.xv3
    public xv3 normalized() {
        b bVar = this.f40600a;
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        if (!bVar.range(chronoField).isFixed()) {
            return this;
        }
        long maximum = (this.f40600a.range(chronoField).getMaximum() - this.f40600a.range(chronoField).getMinimum()) + 1;
        long j = (((long) this.f40601b) * maximum) + ((long) this.c);
        return new yv3(this.f40600a, crd.q(j / maximum), crd.q(j % maximum), this.d);
    }

    @Override // defpackage.xv3
    public xv3 plus(y4p y4pVar) {
        if (y4pVar instanceof yv3) {
            yv3 yv3Var = (yv3) y4pVar;
            if (yv3Var.getChronology().equals(getChronology())) {
                return new yv3(this.f40600a, crd.j(this.f40601b, yv3Var.f40601b), crd.j(this.c, yv3Var.c), crd.j(this.d, yv3Var.d));
            }
        }
        throw new DateTimeException("Unable to add amount: " + y4pVar);
    }

    @Override // defpackage.xv3, defpackage.y4p
    public s4p subtractFrom(s4p s4pVar) {
        crd.i(s4pVar, "temporal");
        b bVar = (b) s4pVar.query(a5p.a());
        if (bVar != null && !this.f40600a.equals(bVar)) {
            throw new DateTimeException("Invalid chronology, required: " + this.f40600a.getId() + ", but was: " + bVar.getId());
        }
        int i = this.f40601b;
        if (i != 0) {
            s4pVar = s4pVar.minus(i, ChronoUnit.YEARS);
        }
        int i2 = this.c;
        if (i2 != 0) {
            s4pVar = s4pVar.minus(i2, ChronoUnit.MONTHS);
        }
        int i3 = this.d;
        return i3 != 0 ? s4pVar.minus(i3, ChronoUnit.DAYS) : s4pVar;
    }

    @Override // defpackage.xv3
    public String toString() {
        if (isZero()) {
            return this.f40600a + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40600a);
        sb.append(' ');
        sb.append('P');
        int i = this.f40601b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
