package org.joda.time.field;

import defpackage.gq5;
import defpackage.ogj;
import defpackage.t67;
import java.io.Serializable;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class DelegatedDateTimeField extends gq5 implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    private final gq5 iField;
    private final t67 iRangeDurationField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(gq5 gq5Var) {
        this(gq5Var, null);
    }

    @Override // defpackage.gq5
    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    @Override // defpackage.gq5
    public long addWrapField(long j, int i) {
        return this.iField.addWrapField(j, i);
    }

    @Override // defpackage.gq5
    public int[] addWrapPartial(ogj ogjVar, int i, int[] iArr, int i2) {
        return this.iField.addWrapPartial(ogjVar, i, iArr, i2);
    }

    @Override // defpackage.gq5
    public int get(long j) {
        return this.iField.get(j);
    }

    @Override // defpackage.gq5
    public String getAsShortText(long j, Locale locale) {
        return this.iField.getAsShortText(j, locale);
    }

    @Override // defpackage.gq5
    public String getAsText(long j, Locale locale) {
        return this.iField.getAsText(j, locale);
    }

    @Override // defpackage.gq5
    public int getDifference(long j, long j2) {
        return this.iField.getDifference(j, j2);
    }

    @Override // defpackage.gq5
    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    @Override // defpackage.gq5
    public t67 getDurationField() {
        return this.iField.getDurationField();
    }

    @Override // defpackage.gq5
    public int getLeapAmount(long j) {
        return this.iField.getLeapAmount(j);
    }

    @Override // defpackage.gq5
    public t67 getLeapDurationField() {
        return this.iField.getLeapDurationField();
    }

    @Override // defpackage.gq5
    public int getMaximumShortTextLength(Locale locale) {
        return this.iField.getMaximumShortTextLength(locale);
    }

    @Override // defpackage.gq5
    public int getMaximumTextLength(Locale locale) {
        return this.iField.getMaximumTextLength(locale);
    }

    @Override // defpackage.gq5
    public int getMaximumValue() {
        return this.iField.getMaximumValue();
    }

    @Override // defpackage.gq5
    public int getMinimumValue() {
        return this.iField.getMinimumValue();
    }

    @Override // defpackage.gq5
    public String getName() {
        return this.iType.getName();
    }

    @Override // defpackage.gq5
    public t67 getRangeDurationField() {
        t67 t67Var = this.iRangeDurationField;
        return t67Var != null ? t67Var : this.iField.getRangeDurationField();
    }

    @Override // defpackage.gq5
    public DateTimeFieldType getType() {
        return this.iType;
    }

    public final gq5 getWrappedField() {
        return this.iField;
    }

    @Override // defpackage.gq5
    public boolean isLeap(long j) {
        return this.iField.isLeap(j);
    }

    @Override // defpackage.gq5
    public boolean isLenient() {
        return this.iField.isLenient();
    }

    @Override // defpackage.gq5
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // defpackage.gq5
    public long remainder(long j) {
        return this.iField.remainder(j);
    }

    @Override // defpackage.gq5
    public long roundCeiling(long j) {
        return this.iField.roundCeiling(j);
    }

    @Override // defpackage.gq5
    public long roundFloor(long j) {
        return this.iField.roundFloor(j);
    }

    @Override // defpackage.gq5
    public long roundHalfCeiling(long j) {
        return this.iField.roundHalfCeiling(j);
    }

    @Override // defpackage.gq5
    public long roundHalfEven(long j) {
        return this.iField.roundHalfEven(j);
    }

    @Override // defpackage.gq5
    public long roundHalfFloor(long j) {
        return this.iField.roundHalfFloor(j);
    }

    @Override // defpackage.gq5
    public long set(long j, int i) {
        return this.iField.set(j, i);
    }

    @Override // defpackage.gq5
    public String toString() {
        return "DateTimeField[" + getName() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // defpackage.gq5
    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    @Override // defpackage.gq5
    public int[] addWrapField(ogj ogjVar, int i, int[] iArr, int i2) {
        return this.iField.addWrapField(ogjVar, i, iArr, i2);
    }

    @Override // defpackage.gq5
    public String getAsShortText(long j) {
        return this.iField.getAsShortText(j);
    }

    @Override // defpackage.gq5
    public String getAsText(long j) {
        return this.iField.getAsText(j);
    }

    @Override // defpackage.gq5
    public int getMaximumValue(long j) {
        return this.iField.getMaximumValue(j);
    }

    @Override // defpackage.gq5
    public int getMinimumValue(long j) {
        return this.iField.getMinimumValue(j);
    }

    @Override // defpackage.gq5
    public long set(long j, String str, Locale locale) {
        return this.iField.set(j, str, locale);
    }

    public DelegatedDateTimeField(gq5 gq5Var, DateTimeFieldType dateTimeFieldType) {
        this(gq5Var, null, dateTimeFieldType);
    }

    @Override // defpackage.gq5
    public int[] add(ogj ogjVar, int i, int[] iArr, int i2) {
        return this.iField.add(ogjVar, i, iArr, i2);
    }

    @Override // defpackage.gq5
    public String getAsShortText(ogj ogjVar, int i, Locale locale) {
        return this.iField.getAsShortText(ogjVar, i, locale);
    }

    @Override // defpackage.gq5
    public String getAsText(ogj ogjVar, int i, Locale locale) {
        return this.iField.getAsText(ogjVar, i, locale);
    }

    @Override // defpackage.gq5
    public int getMaximumValue(ogj ogjVar) {
        return this.iField.getMaximumValue(ogjVar);
    }

    @Override // defpackage.gq5
    public int getMinimumValue(ogj ogjVar) {
        return this.iField.getMinimumValue(ogjVar);
    }

    @Override // defpackage.gq5
    public long set(long j, String str) {
        return this.iField.set(j, str);
    }

    @Override // defpackage.gq5
    public String getAsShortText(ogj ogjVar, Locale locale) {
        return this.iField.getAsShortText(ogjVar, locale);
    }

    @Override // defpackage.gq5
    public String getAsText(ogj ogjVar, Locale locale) {
        return this.iField.getAsText(ogjVar, locale);
    }

    @Override // defpackage.gq5
    public int getMaximumValue(ogj ogjVar, int[] iArr) {
        return this.iField.getMaximumValue(ogjVar, iArr);
    }

    @Override // defpackage.gq5
    public int getMinimumValue(ogj ogjVar, int[] iArr) {
        return this.iField.getMinimumValue(ogjVar, iArr);
    }

    @Override // defpackage.gq5
    public int[] set(ogj ogjVar, int i, int[] iArr, int i2) {
        return this.iField.set(ogjVar, i, iArr, i2);
    }

    public DelegatedDateTimeField(gq5 gq5Var, t67 t67Var, DateTimeFieldType dateTimeFieldType) {
        if (gq5Var != null) {
            this.iField = gq5Var;
            this.iRangeDurationField = t67Var;
            this.iType = dateTimeFieldType == null ? gq5Var.getType() : dateTimeFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // defpackage.gq5
    public String getAsShortText(int i, Locale locale) {
        return this.iField.getAsShortText(i, locale);
    }

    @Override // defpackage.gq5
    public String getAsText(int i, Locale locale) {
        return this.iField.getAsText(i, locale);
    }

    @Override // defpackage.gq5
    public int[] set(ogj ogjVar, int i, int[] iArr, String str, Locale locale) {
        return this.iField.set(ogjVar, i, iArr, str, locale);
    }
}
