package org.joda.time.base;

import defpackage.acd;
import defpackage.bw3;
import defpackage.fk4;
import defpackage.ggj;
import defpackage.k00;
import defpackage.wq5;
import java.io.Serializable;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDateTime extends k00 implements ggj, Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile bw3 iChronology;
    private volatile long iMillis;

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, bw3 bw3Var) {
        this.iChronology = checkChronology(bw3Var);
        this.iMillis = checkInstant(this.iChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7), this.iChronology);
        adjustForMinMax();
    }

    private void adjustForMinMax() {
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.withUTC();
        }
    }

    public bw3 checkChronology(bw3 bw3Var) {
        return wq5.c(bw3Var);
    }

    public long checkInstant(long j, bw3 bw3Var) {
        return j;
    }

    @Override // defpackage.kgj
    public bw3 getChronology() {
        return this.iChronology;
    }

    @Override // defpackage.kgj
    public long getMillis() {
        return this.iMillis;
    }

    public void setChronology(bw3 bw3Var) {
        this.iChronology = checkChronology(bw3Var);
    }

    public void setMillis(long j) {
        this.iMillis = checkInstant(j, this.iChronology);
    }

    public BaseDateTime() {
        this(wq5.b(), ISOChronology.getInstance());
    }

    public BaseDateTime(DateTimeZone dateTimeZone) {
        this(wq5.b(), ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(bw3 bw3Var) {
        this(wq5.b(), bw3Var);
    }

    public BaseDateTime(long j) {
        this(j, ISOChronology.getInstance());
    }

    public BaseDateTime(long j, DateTimeZone dateTimeZone) {
        this(j, ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(long j, bw3 bw3Var) {
        this.iChronology = checkChronology(bw3Var);
        this.iMillis = checkInstant(j, this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Object obj, DateTimeZone dateTimeZone) {
        acd acdVarC = fk4.b().c(obj);
        bw3 bw3VarCheckChronology = checkChronology(acdVarC.a(obj, dateTimeZone));
        this.iChronology = bw3VarCheckChronology;
        this.iMillis = checkInstant(acdVarC.i(obj, bw3VarCheckChronology), bw3VarCheckChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Object obj, bw3 bw3Var) {
        acd acdVarC = fk4.b().c(obj);
        this.iChronology = checkChronology(acdVarC.b(obj, bw3Var));
        this.iMillis = checkInstant(acdVarC.i(obj, bw3Var), this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, ISOChronology.getInstance());
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        this(i, i2, i3, i4, i5, i6, i7, ISOChronology.getInstance(dateTimeZone));
    }
}
