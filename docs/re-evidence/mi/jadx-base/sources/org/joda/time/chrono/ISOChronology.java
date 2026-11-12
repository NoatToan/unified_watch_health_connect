package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.k07;
import defpackage.uxc;
import defpackage.vik;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class ISOChronology extends AssembledChronology {
    private static final ISOChronology INSTANCE_UTC;
    private static final ConcurrentHashMap<DateTimeZone, ISOChronology> cCache;
    private static final long serialVersionUID = -6212696554273812441L;

    public static final class a implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient DateTimeZone f29546a;

        public a(DateTimeZone dateTimeZone) {
            this.f29546a = dateTimeZone;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f29546a = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.getInstance(this.f29546a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f29546a);
        }
    }

    static {
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = new ConcurrentHashMap<>();
        cCache = concurrentHashMap;
        ISOChronology iSOChronology = new ISOChronology(GregorianChronology.getInstanceUTC());
        INSTANCE_UTC = iSOChronology;
        concurrentHashMap.put(DateTimeZone.UTC, iSOChronology);
    }

    private ISOChronology(bw3 bw3Var) {
        super(bw3Var, null);
    }

    public static ISOChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static ISOChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object writeReplace() {
        return new a(getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.a aVar) {
        if (getBase().getZone() == DateTimeZone.UTC) {
            k07 k07Var = new k07(uxc.c, DateTimeFieldType.centuryOfEra(), 100);
            aVar.H = k07Var;
            aVar.f29542k = k07Var.getDurationField();
            aVar.G = new vik((k07) aVar.H, DateTimeFieldType.yearOfCentury());
            aVar.C = new vik((k07) aVar.H, aVar.h, DateTimeFieldType.weekyearOfCentury());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISOChronology) {
            return getZone().equals(((ISOChronology) obj).getZone());
        }
        return false;
    }

    public int hashCode() {
        return 800855 + getZone().hashCode();
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public String toString() {
        DateTimeZone zone = getZone();
        if (zone == null) {
            return "ISOChronology";
        }
        return "ISOChronology" + AbstractJsonLexerKt.BEGIN_LIST + zone.getID() + AbstractJsonLexerKt.END_LIST;
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

    public static ISOChronology getInstance(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = cCache;
        ISOChronology iSOChronology = concurrentHashMap.get(dateTimeZone);
        if (iSOChronology != null) {
            return iSOChronology;
        }
        ISOChronology iSOChronology2 = new ISOChronology(ZonedChronology.getInstance(INSTANCE_UTC, dateTimeZone));
        ISOChronology iSOChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, iSOChronology2);
        return iSOChronologyPutIfAbsent != null ? iSOChronologyPutIfAbsent : iSOChronology2;
    }
}
