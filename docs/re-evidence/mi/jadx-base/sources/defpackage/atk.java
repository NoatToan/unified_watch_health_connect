package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class atk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3439b;

    public atk(float f, float f2) {
        this.f3438a = f;
        this.f3439b = f2;
    }

    public static float a(atk atkVar, atk atkVar2, atk atkVar3) {
        float f = atkVar2.f3438a;
        float f2 = atkVar2.f3439b;
        return ((atkVar3.f3438a - f) * (atkVar.f3439b - f2)) - ((atkVar3.f3439b - f2) * (atkVar.f3438a - f));
    }

    public static float b(atk atkVar, atk atkVar2) {
        return q8f.a(atkVar.f3438a, atkVar.f3439b, atkVar2.f3438a, atkVar2.f3439b);
    }

    public static void e(atk[] atkVarArr) {
        atk atkVar;
        atk atkVar2;
        atk atkVar3;
        float fB = b(atkVarArr[0], atkVarArr[1]);
        float fB2 = b(atkVarArr[1], atkVarArr[2]);
        float fB3 = b(atkVarArr[0], atkVarArr[2]);
        if (fB2 >= fB && fB2 >= fB3) {
            atkVar = atkVarArr[0];
            atkVar2 = atkVarArr[1];
            atkVar3 = atkVarArr[2];
        } else if (fB3 < fB2 || fB3 < fB) {
            atkVar = atkVarArr[2];
            atkVar2 = atkVarArr[0];
            atkVar3 = atkVarArr[1];
        } else {
            atkVar = atkVarArr[1];
            atkVar2 = atkVarArr[0];
            atkVar3 = atkVarArr[2];
        }
        if (a(atkVar2, atkVar, atkVar3) < 0.0f) {
            atk atkVar4 = atkVar3;
            atkVar3 = atkVar2;
            atkVar2 = atkVar4;
        }
        atkVarArr[0] = atkVar2;
        atkVarArr[1] = atkVar;
        atkVarArr[2] = atkVar3;
    }

    public final float c() {
        return this.f3438a;
    }

    public final float d() {
        return this.f3439b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atk) {
            atk atkVar = (atk) obj;
            if (this.f3438a == atkVar.f3438a && this.f3439b == atkVar.f3439b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f3438a) * 31) + Float.floatToIntBits(this.f3439b);
    }

    public final String toString() {
        return "(" + this.f3438a + ',' + this.f3439b + ')';
    }
}
