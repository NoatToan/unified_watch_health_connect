package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class tq5 implements dfd {
    public tq5(sq5 sq5Var) {
    }

    public static dfd a(sq5 sq5Var) {
        if (sq5Var == null) {
            return null;
        }
        return new tq5(sq5Var);
    }

    @Override // defpackage.dfd
    public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            throw null;
        }
        if (appendable instanceof Writer) {
            throw null;
        }
        new StringBuffer(d());
        throw null;
    }

    @Override // defpackage.dfd
    public int d() {
        throw null;
    }

    @Override // defpackage.dfd
    public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            throw null;
        }
        if (appendable instanceof Writer) {
            throw null;
        }
        new StringBuffer(d());
        throw null;
    }
}
