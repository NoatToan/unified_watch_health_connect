package org.joda.time;

import defpackage.bw3;
import defpackage.fk4;
import defpackage.fl9;
import defpackage.hgj;
import defpackage.jq5;
import defpackage.kgj;
import defpackage.sxc;
import defpackage.wq5;
import defpackage.y00;
import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant extends y00 implements kgj, Serializable {
    public static final Instant EPOCH = new Instant(0);
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    public Instant() {
        this.iMillis = wq5.b();
    }

    public static Instant now() {
        return new Instant();
    }

    public static Instant ofEpochMilli(long j) {
        return new Instant(j);
    }

    public static Instant ofEpochSecond(long j) {
        return new Instant(fl9.i(j, 1000));
    }

    @FromString
    public static Instant parse(String str) {
        return parse(str, sxc.i());
    }

    @Override // defpackage.kgj
    public bw3 getChronology() {
        return ISOChronology.getInstanceUTC();
    }

    @Override // defpackage.kgj
    public long getMillis() {
        return this.iMillis;
    }

    public Instant minus(hgj hgjVar) {
        return withDurationAdded(hgjVar, -1);
    }

    public Instant plus(hgj hgjVar) {
        return withDurationAdded(hgjVar, 1);
    }

    @Override // defpackage.y00, defpackage.ggj
    public DateTime toDateTime() {
        return new DateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // defpackage.y00
    @Deprecated
    public DateTime toDateTimeISO() {
        return toDateTime();
    }

    @Override // defpackage.y00, defpackage.kgj
    public Instant toInstant() {
        return this;
    }

    @Override // defpackage.y00
    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // defpackage.y00
    @Deprecated
    public MutableDateTime toMutableDateTimeISO() {
        return toMutableDateTime();
    }

    public Instant withDurationAdded(hgj hgjVar, int i) {
        return (hgjVar == null || i == 0) ? this : withDurationAdded(hgjVar.getMillis(), i);
    }

    public Instant withMillis(long j) {
        return j == this.iMillis ? this : new Instant(j);
    }

    public static Instant parse(String str, jq5 jq5Var) {
        return jq5Var.f(str).toInstant();
    }

    public Instant(long j) {
        this.iMillis = j;
    }

    public Instant minus(long j) {
        return withDurationAdded(j, -1);
    }

    public Instant plus(long j) {
        return withDurationAdded(j, 1);
    }

    public Instant withDurationAdded(long j, int i) {
        return (j == 0 || i == 0) ? this : withMillis(getChronology().add(getMillis(), j, i));
    }

    public Instant(Object obj) {
        this.iMillis = fk4.b().c(obj).i(obj, ISOChronology.getInstanceUTC());
    }
}
