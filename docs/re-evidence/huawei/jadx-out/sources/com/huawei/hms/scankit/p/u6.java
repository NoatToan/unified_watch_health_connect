package com.huawei.hms.scankit.p;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes34.dex */
public class u6 implements Parcelable {
    public static final Parcelable.Creator<u6> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f16356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16358c;
    private boolean d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String toString() {
        return Constants.LEFT_BRACKET_ONLY + this.f16356a + ',' + this.f16357b + com.huawei.hms.network.embedded.g4.l;
    }

    public u6(float f, float f2) {
        this.f16358c = 0;
        this.d = false;
        this.f16356a = f;
        this.f16357b = f2;
    }

    public final float b() {
        return this.f16356a;
    }

    public final float c() {
        return this.f16357b;
    }

    public boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return ((double) Math.abs(this.f16356a - u6Var.f16356a)) < 1.0E-4d && ((double) Math.abs(this.f16357b - u6Var.f16357b)) < 1.0E-4d;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f16356a) * 31) + Float.floatToIntBits(this.f16357b);
    }

    public u6(float f, float f2, int i) {
        this.d = false;
        this.f16356a = f;
        this.f16357b = f2;
        this.f16358c = i;
    }

    public u6(float f, float f2, boolean z) {
        this.f16358c = 0;
        this.f16356a = f;
        this.f16357b = f2;
        this.d = z;
    }

    private static float a(u6 u6Var, u6 u6Var2, u6 u6Var3) {
        float f = u6Var2.f16356a;
        float f2 = u6Var2.f16357b;
        return ((u6Var3.f16356a - f) * (u6Var.f16357b - f2)) - ((u6Var3.f16357b - f2) * (u6Var.f16356a - f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f16356a);
        parcel.writeFloat(this.f16357b);
    }

    class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u6[] newArray(int i) {
            return new u6[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u6 createFromParcel(Parcel parcel) {
            return new u6(parcel);
        }

        a() {
        }
    }

    public static float a(u6 u6Var, u6 u6Var2) {
        return s4.a(u6Var.f16356a, u6Var.f16357b, u6Var2.f16356a, u6Var2.f16357b);
    }

    protected u6(Parcel parcel) {
        this.f16358c = 0;
        this.d = false;
        this.f16356a = parcel.readFloat();
        this.f16357b = parcel.readFloat();
    }

    public int a() {
        return this.f16358c;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e A[PHI: r1 r2
      0x001e: PHI (r1v3 int) = (r1v0 int), (r1v5 int) binds: [B:13:0x001b, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r2v2 int) = (r2v0 int), (r2v5 int) binds: [B:13:0x001b, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    private static int[] a(float f, float f2, float f3) {
        int i = 1;
        int i2 = 0;
        int i3 = 2;
        if (f >= f2 && f >= f3) {
            i2 = 1;
            i = 0;
            if (f2 > f3) {
                i3 = i2;
                i2 = 2;
            }
        } else if (f3 < f || f3 < f2) {
            if (f > f) {
                i3 = 1;
                i = 2;
            } else {
                i2 = 1;
                i = 2;
                i3 = 0;
            }
        } else if (f <= f2) {
            i3 = i2;
            i2 = 2;
        }
        return new int[]{i, i2, i3};
    }

    public static void a(u6[] u6VarArr) {
        float fA = a(u6VarArr[0], u6VarArr[1]);
        float fA2 = a(u6VarArr[1], u6VarArr[2]);
        float fA3 = a(u6VarArr[0], u6VarArr[2]);
        int[] iArrA = a(fA2, fA, fA3);
        int i = iArrA[0];
        int i2 = iArrA[1];
        int i3 = iArrA[2];
        u6 u6Var = u6VarArr[i];
        u6 u6Var2 = u6VarArr[i2];
        u6 u6Var3 = u6VarArr[i3];
        float[] fArr = {fA2, fA3, fA};
        if (r3.j % 2 == 0) {
            float f = fArr[i2];
            float f2 = fArr[i];
        }
        if (a(u6Var2, u6Var, u6Var3) < 0.0f) {
            u6Var2 = u6Var3;
            u6Var3 = u6Var2;
        }
        u6VarArr[0] = u6Var2;
        u6VarArr[1] = u6Var;
        u6VarArr[2] = u6Var3;
    }
}
