package defpackage;

import com.facebook.yoga.YogaUnit;

/* JADX INFO: loaded from: classes4.dex */
public class o0s {
    public static final o0s c = new o0s(Float.NaN, YogaUnit.UNDEFINED);
    public static final o0s d = new o0s(0.0f, YogaUnit.POINT);
    public static final o0s e = new o0s(Float.NaN, YogaUnit.AUTO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YogaUnit f28628b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28629a;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            f28629a = iArr;
            try {
                iArr[YogaUnit.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28629a[YogaUnit.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28629a[YogaUnit.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28629a[YogaUnit.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public o0s(float f, YogaUnit yogaUnit) {
        this.f28627a = f;
        this.f28628b = yogaUnit;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o0s)) {
            return false;
        }
        o0s o0sVar = (o0s) obj;
        YogaUnit yogaUnit = this.f28628b;
        if (yogaUnit == o0sVar.f28628b) {
            return yogaUnit == YogaUnit.UNDEFINED || yogaUnit == YogaUnit.AUTO || Float.compare(this.f28627a, o0sVar.f28627a) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f28627a) + this.f28628b.intValue();
    }

    public String toString() {
        int i = a.f28629a[this.f28628b.ordinal()];
        if (i == 1) {
            return "undefined";
        }
        if (i == 2) {
            return Float.toString(this.f28627a);
        }
        if (i != 3) {
            if (i == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f28627a + "%";
    }

    public o0s(float f, int i) {
        this(f, YogaUnit.fromInt(i));
    }
}
