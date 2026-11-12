package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.BaseDurationField;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b7d extends o62 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3882b;
    public final t67 c;

    public final class a extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        public a(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        @Override // defpackage.t67
        public long add(long j, int i) {
            return b7d.this.add(j, i);
        }

        @Override // org.joda.time.field.BaseDurationField, defpackage.t67
        public int getDifference(long j, long j2) {
            return b7d.this.getDifference(j, j2);
        }

        @Override // defpackage.t67
        public long getDifferenceAsLong(long j, long j2) {
            return b7d.this.getDifferenceAsLong(j, j2);
        }

        @Override // defpackage.t67
        public long getMillis(int i, long j) {
            return b7d.this.add(j, i) - j;
        }

        @Override // defpackage.t67
        public long getUnitMillis() {
            return b7d.this.f3882b;
        }

        @Override // org.joda.time.field.BaseDurationField, defpackage.t67
        public int getValue(long j, long j2) {
            return b7d.this.getDifference(j + j2, j2);
        }

        @Override // defpackage.t67
        public long getValueAsLong(long j, long j2) {
            return b7d.this.getDifferenceAsLong(j + j2, j2);
        }

        @Override // defpackage.t67
        public boolean isPrecise() {
            return false;
        }

        @Override // defpackage.t67
        public long add(long j, long j2) {
            return b7d.this.add(j, j2);
        }

        @Override // defpackage.t67
        public long getMillis(long j, long j2) {
            return b7d.this.add(j2, j) - j2;
        }
    }

    public b7d(DateTimeFieldType dateTimeFieldType, long j) {
        super(dateTimeFieldType);
        this.f3882b = j;
        this.c = new a(dateTimeFieldType.getDurationType());
    }

    @Override // defpackage.o62, defpackage.gq5
    public abstract long add(long j, int i);

    @Override // defpackage.o62, defpackage.gq5
    public abstract long add(long j, long j2);

    @Override // defpackage.o62, defpackage.gq5
    public int getDifference(long j, long j2) {
        return fl9.m(getDifferenceAsLong(j, j2));
    }

    @Override // defpackage.o62, defpackage.gq5
    public abstract long getDifferenceAsLong(long j, long j2);

    @Override // defpackage.o62, defpackage.gq5
    public final t67 getDurationField() {
        return this.c;
    }
}
