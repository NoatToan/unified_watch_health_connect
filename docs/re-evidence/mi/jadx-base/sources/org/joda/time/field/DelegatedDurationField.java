package org.joda.time.field;

import defpackage.t67;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class DelegatedDurationField extends t67 implements Serializable {
    private static final long serialVersionUID = -5576443481242007829L;
    private final t67 iField;
    private final DurationFieldType iType;

    public DelegatedDurationField(t67 t67Var) {
        this(t67Var, null);
    }

    @Override // defpackage.t67
    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DelegatedDurationField) {
            return this.iField.equals(((DelegatedDurationField) obj).iField);
        }
        return false;
    }

    @Override // defpackage.t67
    public int getDifference(long j, long j2) {
        return this.iField.getDifference(j, j2);
    }

    @Override // defpackage.t67
    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    @Override // defpackage.t67
    public long getMillis(int i) {
        return this.iField.getMillis(i);
    }

    @Override // defpackage.t67
    public String getName() {
        return this.iType.getName();
    }

    @Override // defpackage.t67
    public DurationFieldType getType() {
        return this.iType;
    }

    @Override // defpackage.t67
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    @Override // defpackage.t67
    public int getValue(long j) {
        return this.iField.getValue(j);
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j) {
        return this.iField.getValueAsLong(j);
    }

    public final t67 getWrappedField() {
        return this.iField;
    }

    public int hashCode() {
        return this.iField.hashCode() ^ this.iType.hashCode();
    }

    @Override // defpackage.t67
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // defpackage.t67
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // defpackage.t67
    public String toString() {
        if (this.iType == null) {
            return this.iField.toString();
        }
        return "DurationField[" + this.iType + AbstractJsonLexerKt.END_LIST;
    }

    @Override // defpackage.t67
    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(t67 t67Var) {
        return this.iField.compareTo(t67Var);
    }

    @Override // defpackage.t67
    public long getMillis(long j) {
        return this.iField.getMillis(j);
    }

    @Override // defpackage.t67
    public int getValue(long j, long j2) {
        return this.iField.getValue(j, j2);
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j, long j2) {
        return this.iField.getValueAsLong(j, j2);
    }

    public DelegatedDurationField(t67 t67Var, DurationFieldType durationFieldType) {
        if (t67Var != null) {
            this.iField = t67Var;
            this.iType = durationFieldType == null ? t67Var.getType() : durationFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // defpackage.t67
    public long getMillis(int i, long j) {
        return this.iField.getMillis(i, j);
    }

    @Override // defpackage.t67
    public long getMillis(long j, long j2) {
        return this.iField.getMillis(j, j2);
    }
}
