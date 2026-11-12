package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.UnsupportedDurationField;

/* JADX INFO: loaded from: classes3.dex */
public final class ug2 extends o62 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35728b;

    public ug2(String str) {
        super(DateTimeFieldType.era());
        this.f35728b = str;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public String getAsText(int i, Locale locale) {
        return this.f35728b;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumTextLength(Locale locale) {
        return this.f35728b.length();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return null;
    }

    @Override // defpackage.gq5
    public boolean isLenient() {
        return false;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundCeiling(long j) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundFloor(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfCeiling(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfEven(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfFloor(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, 1, 1);
        return j;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, String str, Locale locale) {
        if (this.f35728b.equals(str) || "1".equals(str)) {
            return j;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }
}
