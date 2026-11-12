package com.github.mikephil.charting.matrix;

/* JADX INFO: loaded from: classes13.dex */
public final class Vector3 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f52823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f52824y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f52825z;
    public static final Vector3 ZERO = new Vector3(0.0f, 0.0f, 0.0f);
    public static final Vector3 UNIT_X = new Vector3(1.0f, 0.0f, 0.0f);
    public static final Vector3 UNIT_Y = new Vector3(0.0f, 1.0f, 0.0f);
    public static final Vector3 UNIT_Z = new Vector3(0.0f, 0.0f, 1.0f);

    public Vector3(float[] fArr) {
        set(fArr[0], fArr[1], fArr[2]);
    }

    public final void add(Vector3 vector3) {
        this.f52823x += vector3.f52823x;
        this.f52824y += vector3.f52824y;
        this.f52825z += vector3.f52825z;
    }

    public final Vector3 cross(Vector3 vector3) {
        float f14 = this.f52824y;
        float f15 = vector3.f52825z;
        float f16 = this.f52825z;
        float f17 = vector3.f52824y;
        float f18 = (f14 * f15) - (f16 * f17);
        float f19 = vector3.f52823x;
        float f22 = this.f52823x;
        return new Vector3(f18, (f16 * f19) - (f15 * f22), (f22 * f17) - (f14 * f19));
    }

    public final float distance2(Vector3 vector3) {
        float f14 = this.f52823x - vector3.f52823x;
        float f15 = this.f52824y - vector3.f52824y;
        float f16 = this.f52825z - vector3.f52825z;
        return (f16 * f16) + (f15 * f15) + (f14 * f14);
    }

    public final void divide(float f14) {
        if (f14 != 0.0f) {
            this.f52823x /= f14;
            this.f52824y /= f14;
            this.f52825z /= f14;
        }
    }

    public final float dot(Vector3 vector3) {
        return (this.f52825z * vector3.f52825z) + (this.f52824y * vector3.f52824y) + (this.f52823x * vector3.f52823x);
    }

    public final float length() {
        return (float) Math.sqrt(length2());
    }

    public final float length2() {
        float f14 = this.f52823x;
        float f15 = this.f52824y;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = this.f52825z;
        return (f17 * f17) + f16;
    }

    public final void multiply(Vector3 vector3) {
        this.f52823x *= vector3.f52823x;
        this.f52824y *= vector3.f52824y;
        this.f52825z *= vector3.f52825z;
    }

    public final float normalize() {
        float length = length();
        if (length != 0.0f) {
            this.f52823x /= length;
            this.f52824y /= length;
            this.f52825z /= length;
        }
        return length;
    }

    public final boolean pointsInSameDirection(Vector3 vector3) {
        return dot(vector3) > 0.0f;
    }

    public final void set(Vector3 vector3) {
        this.f52823x = vector3.f52823x;
        this.f52824y = vector3.f52824y;
        this.f52825z = vector3.f52825z;
    }

    public final void subtract(Vector3 vector3) {
        this.f52823x -= vector3.f52823x;
        this.f52824y -= vector3.f52824y;
        this.f52825z -= vector3.f52825z;
    }

    public final void subtractMultiple(Vector3 vector3, float f14) {
        this.f52823x -= vector3.f52823x * f14;
        this.f52824y -= vector3.f52824y * f14;
        this.f52825z -= vector3.f52825z * f14;
    }

    public final void zero() {
        set(0.0f, 0.0f, 0.0f);
    }

    public final void set(float f14, float f15, float f16) {
        this.f52823x = f14;
        this.f52824y = f15;
        this.f52825z = f16;
    }

    public Vector3() {
    }

    public Vector3(float f14, float f15, float f16) {
        set(f14, f15, f16);
    }

    public Vector3(Vector3 vector3) {
        set(vector3);
    }

    public final void add(float f14, float f15, float f16) {
        this.f52823x += f14;
        this.f52824y += f15;
        this.f52825z += f16;
    }

    public final void multiply(float f14) {
        this.f52823x *= f14;
        this.f52824y *= f14;
        this.f52825z *= f14;
    }
}
