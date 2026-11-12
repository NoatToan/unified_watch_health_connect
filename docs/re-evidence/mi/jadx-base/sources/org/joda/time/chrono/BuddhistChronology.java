package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.gq5;
import defpackage.k07;
import defpackage.ug2;
import defpackage.vik;
import defpackage.w6h;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/* JADX INFO: loaded from: classes3.dex */
public final class BuddhistChronology extends AssembledChronology {
    public static final int BE = 1;
    private static final int BUDDHIST_OFFSET = 543;
    private static final long serialVersionUID = -3474595157769370126L;
    private static final gq5 ERA_FIELD = new ug2("BE");
    private static final ConcurrentHashMap<DateTimeZone, BuddhistChronology> cCache = new ConcurrentHashMap<>();
    private static final BuddhistChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    private BuddhistChronology(bw3 bw3Var, Object obj) {
        super(bw3Var, obj);
    }

    public static BuddhistChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static BuddhistChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        bw3 base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.a aVar) {
        if (getParam() == null) {
            aVar.l = UnsupportedDurationField.getInstance(DurationFieldType.eras());
            w6h w6hVar = new w6h(new SkipUndoDateTimeField(this, aVar.E), BUDDHIST_OFFSET);
            aVar.E = w6hVar;
            aVar.F = new DelegatedDateTimeField(w6hVar, aVar.l, DateTimeFieldType.yearOfEra());
            aVar.B = new w6h(new SkipUndoDateTimeField(this, aVar.B), BUDDHIST_OFFSET);
            k07 k07Var = new k07(new w6h(aVar.F, 99), aVar.l, DateTimeFieldType.centuryOfEra(), 100);
            aVar.H = k07Var;
            aVar.f29542k = k07Var.getDurationField();
            aVar.G = new w6h(new vik((k07) aVar.H), DateTimeFieldType.yearOfCentury(), 1);
            aVar.C = new w6h(new vik(aVar.B, aVar.f29542k, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
            aVar.I = ERA_FIELD;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuddhistChronology) {
            return getZone().equals(((BuddhistChronology) obj).getZone());
        }
        return false;
    }

    public int hashCode() {
        return 499287079 + getZone().hashCode();
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public String toString() {
        DateTimeZone zone = getZone();
        if (zone == null) {
            return "BuddhistChronology";
        }
        return "BuddhistChronology" + AbstractJsonLexerKt.BEGIN_LIST + zone.getID() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone);
    }

    public static BuddhistChronology getInstance(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, BuddhistChronology> concurrentHashMap = cCache;
        BuddhistChronology buddhistChronology = concurrentHashMap.get(dateTimeZone);
        if (buddhistChronology != null) {
            return buddhistChronology;
        }
        BuddhistChronology buddhistChronology2 = new BuddhistChronology(GJChronology.getInstance(dateTimeZone, null), null);
        BuddhistChronology buddhistChronology3 = new BuddhistChronology(LimitChronology.getInstance(buddhistChronology2, new DateTime(1, 1, 1, 0, 0, 0, 0, buddhistChronology2), null), "");
        BuddhistChronology buddhistChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, buddhistChronology3);
        return buddhistChronologyPutIfAbsent != null ? buddhistChronologyPutIfAbsent : buddhistChronology3;
    }
}
