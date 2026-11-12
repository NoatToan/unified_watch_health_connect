package com.facebook.drawee.generic;

import defpackage.b6i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class RoundingParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RoundingMethod f7105a = RoundingMethod.BITMAP_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7106b = false;
    public float[] c = null;
    public int d = 0;
    public float e = 0.0f;
    public int f = 0;
    public float g = 0.0f;
    public boolean h = false;
    public boolean i = false;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static RoundingParams a(float f) {
        return new RoundingParams().p(f);
    }

    public int b() {
        return this.f;
    }

    public float c() {
        return this.e;
    }

    public float[] d() {
        return this.c;
    }

    public final float[] e() {
        if (this.c == null) {
            this.c = new float[8];
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f7106b == roundingParams.f7106b && this.d == roundingParams.d && Float.compare(roundingParams.e, this.e) == 0 && this.f == roundingParams.f && Float.compare(roundingParams.g, this.g) == 0 && this.f7105a == roundingParams.f7105a && this.h == roundingParams.h && this.i == roundingParams.i) {
            return Arrays.equals(this.c, roundingParams.c);
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public float g() {
        return this.g;
    }

    public boolean h() {
        return this.i;
    }

    public int hashCode() {
        RoundingMethod roundingMethod = this.f7105a;
        int iHashCode = (((roundingMethod != null ? roundingMethod.hashCode() : 0) * 31) + (this.f7106b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f = this.e;
        int iFloatToIntBits = (((iHashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f) * 31;
        float f2 = this.g;
        return ((((iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public boolean i() {
        return this.f7106b;
    }

    public RoundingMethod j() {
        return this.f7105a;
    }

    public boolean k() {
        return this.h;
    }

    public RoundingParams l(int i, float f) {
        b6i.c(f >= 0.0f, "the border width cannot be < 0");
        this.e = f;
        this.f = i;
        return this;
    }

    public RoundingParams m(int i) {
        this.f = i;
        return this;
    }

    public RoundingParams n(float f) {
        b6i.c(f >= 0.0f, "the border width cannot be < 0");
        this.e = f;
        return this;
    }

    public RoundingParams o(float f, float f2, float f3, float f4) {
        float[] fArrE = e();
        fArrE[1] = f;
        fArrE[0] = f;
        fArrE[3] = f2;
        fArrE[2] = f2;
        fArrE[5] = f3;
        fArrE[4] = f3;
        fArrE[7] = f4;
        fArrE[6] = f4;
        return this;
    }

    public RoundingParams p(float f) {
        Arrays.fill(e(), f);
        return this;
    }

    public RoundingParams q(int i) {
        this.d = i;
        this.f7105a = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    public RoundingParams r(float f) {
        b6i.c(f >= 0.0f, "the padding cannot be < 0");
        this.g = f;
        return this;
    }

    public RoundingParams s(boolean z) {
        this.f7106b = z;
        return this;
    }

    public RoundingParams t(RoundingMethod roundingMethod) {
        this.f7105a = roundingMethod;
        return this;
    }
}
