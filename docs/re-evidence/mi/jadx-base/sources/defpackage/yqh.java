package defpackage;

import java.util.Locale;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/* JADX INFO: loaded from: classes3.dex */
public class yqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final brh f40429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final arh f40430b;
    public final Locale c;
    public final PeriodType d;

    public yqh(brh brhVar, arh arhVar) {
        this.f40429a = brhVar;
        this.f40430b = arhVar;
        this.c = null;
        this.d = null;
    }

    public final void a() {
        if (this.f40430b == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
    }

    public final void b(qgj qgjVar) {
        if (qgjVar == null) {
            throw new IllegalArgumentException("Period must not be null");
        }
    }

    public final void c() {
        if (this.f40429a == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
    }

    public arh d() {
        return this.f40430b;
    }

    public brh e() {
        return this.f40429a;
    }

    public int f(fgj fgjVar, String str, int i) {
        a();
        b(fgjVar);
        return d().c(fgjVar, str, i, this.c);
    }

    public MutablePeriod g(String str) {
        a();
        MutablePeriod mutablePeriod = new MutablePeriod(0L, this.d);
        int iC = d().c(mutablePeriod, str, 0, this.c);
        if (iC < 0) {
            iC = ~iC;
        } else if (iC >= str.length()) {
            return mutablePeriod;
        }
        throw new IllegalArgumentException(d1a.h(str, iC));
    }

    public Period h(String str) {
        a();
        return g(str).toPeriod();
    }

    public String i(qgj qgjVar) {
        c();
        b(qgjVar);
        brh brhVarE = e();
        StringBuffer stringBuffer = new StringBuffer(brhVarE.d(qgjVar, this.c));
        brhVarE.b(stringBuffer, qgjVar, this.c);
        return stringBuffer.toString();
    }

    public yqh j(PeriodType periodType) {
        return periodType == this.d ? this : new yqh(this.f40429a, this.f40430b, this.c, periodType);
    }

    public yqh(brh brhVar, arh arhVar, Locale locale, PeriodType periodType) {
        this.f40429a = brhVar;
        this.f40430b = arhVar;
        this.c = locale;
        this.d = periodType;
    }
}
