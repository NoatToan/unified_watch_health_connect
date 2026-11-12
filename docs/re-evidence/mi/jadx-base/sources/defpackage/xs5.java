package defpackage;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xs5 extends o62 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gq5 f39407b;

    public xs5(gq5 gq5Var, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (gq5Var == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!gq5Var.isSupported()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.f39407b = gq5Var;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.f39407b.get(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getDurationField() {
        return this.f39407b.getDurationField();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.f39407b.getMaximumValue();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return this.f39407b.getMinimumValue();
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.f39407b.getRangeDurationField();
    }

    public final gq5 getWrappedField() {
        return this.f39407b;
    }

    @Override // defpackage.gq5
    public boolean isLenient() {
        return this.f39407b.isLenient();
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        return this.f39407b.set(j, i);
    }
}
