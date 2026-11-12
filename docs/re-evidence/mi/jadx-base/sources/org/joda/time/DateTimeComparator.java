package org.joda.time;

import defpackage.acd;
import defpackage.bw3;
import defpackage.fk4;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeComparator implements Comparator<Object>, Serializable {
    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator(null, null);
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), null);
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator(null, DateTimeFieldType.dayOfYear());
    private static final long serialVersionUID = -6097339773320178364L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    public DateTimeComparator(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        this.iLowerLimit = dateTimeFieldType;
        this.iUpperLimit = dateTimeFieldType2;
    }

    public static DateTimeComparator getDateOnlyInstance() {
        return DATE_INSTANCE;
    }

    public static DateTimeComparator getInstance() {
        return ALL_INSTANCE;
    }

    public static DateTimeComparator getTimeOnlyInstance() {
        return TIME_INSTANCE;
    }

    private Object readResolve() {
        return getInstance(this.iLowerLimit, this.iUpperLimit);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        acd acdVarC = fk4.b().c(obj);
        bw3 bw3VarB = acdVarC.b(obj, null);
        long jI = acdVarC.i(obj, bw3VarB);
        if (obj == obj2) {
            return 0;
        }
        acd acdVarC2 = fk4.b().c(obj2);
        bw3 bw3VarB2 = acdVarC2.b(obj2, null);
        long jI2 = acdVarC2.i(obj2, bw3VarB2);
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        if (dateTimeFieldType != null) {
            jI = dateTimeFieldType.getField(bw3VarB).roundFloor(jI);
            jI2 = this.iLowerLimit.getField(bw3VarB2).roundFloor(jI2);
        }
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            jI = dateTimeFieldType2.getField(bw3VarB).remainder(jI);
            jI2 = this.iUpperLimit.getField(bw3VarB2).remainder(jI2);
        }
        if (jI < jI2) {
            return -1;
        }
        return jI > jI2 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        DateTimeFieldType dateTimeFieldType;
        DateTimeFieldType dateTimeFieldType2;
        if (!(obj instanceof DateTimeComparator)) {
            return false;
        }
        DateTimeComparator dateTimeComparator = (DateTimeComparator) obj;
        if (this.iLowerLimit == dateTimeComparator.getLowerLimit() || ((dateTimeFieldType2 = this.iLowerLimit) != null && dateTimeFieldType2.equals(dateTimeComparator.getLowerLimit()))) {
            return this.iUpperLimit == dateTimeComparator.getUpperLimit() || ((dateTimeFieldType = this.iUpperLimit) != null && dateTimeFieldType.equals(dateTimeComparator.getUpperLimit()));
        }
        return false;
    }

    public DateTimeFieldType getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTimeFieldType getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        int iHashCode = dateTimeFieldType == null ? 0 : dateTimeFieldType.hashCode();
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        return iHashCode + ((dateTimeFieldType2 != null ? dateTimeFieldType2.hashCode() : 0) * 123);
    }

    public String toString() {
        if (this.iLowerLimit == this.iUpperLimit) {
            StringBuilder sb = new StringBuilder();
            sb.append("DateTimeComparator[");
            DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
            sb.append(dateTimeFieldType != null ? dateTimeFieldType.getName() : "");
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DateTimeComparator[");
        DateTimeFieldType dateTimeFieldType2 = this.iLowerLimit;
        sb2.append(dateTimeFieldType2 == null ? "" : dateTimeFieldType2.getName());
        sb2.append("-");
        DateTimeFieldType dateTimeFieldType3 = this.iUpperLimit;
        sb2.append(dateTimeFieldType3 != null ? dateTimeFieldType3.getName() : "");
        sb2.append("]");
        return sb2.toString();
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType) {
        return getInstance(dateTimeFieldType, null);
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        if (dateTimeFieldType == null && dateTimeFieldType2 == null) {
            return ALL_INSTANCE;
        }
        if (dateTimeFieldType == DateTimeFieldType.dayOfYear() && dateTimeFieldType2 == null) {
            return DATE_INSTANCE;
        }
        if (dateTimeFieldType == null && dateTimeFieldType2 == DateTimeFieldType.dayOfYear()) {
            return TIME_INSTANCE;
        }
        return new DateTimeComparator(dateTimeFieldType, dateTimeFieldType2);
    }
}
