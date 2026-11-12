package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i00 implements ck4 {
    public bw3 a(Object obj, DateTimeZone dateTimeZone) {
        return ISOChronology.getInstance(dateTimeZone);
    }

    public bw3 b(Object obj, bw3 bw3Var) {
        return wq5.c(bw3Var);
    }

    public int[] c(ogj ogjVar, Object obj, bw3 bw3Var) {
        return bw3Var.get(ogjVar, i(obj, bw3Var));
    }

    public PeriodType g(Object obj) {
        return PeriodType.standard();
    }

    public boolean h(Object obj, bw3 bw3Var) {
        return false;
    }

    public long i(Object obj, bw3 bw3Var) {
        return wq5.b();
    }

    public int[] k(ogj ogjVar, Object obj, bw3 bw3Var, jq5 jq5Var) {
        return c(ogjVar, obj, bw3Var);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Converter[");
        sb.append(e() == null ? AbstractJsonLexerKt.NULL : e().getName());
        sb.append("]");
        return sb.toString();
    }
}
