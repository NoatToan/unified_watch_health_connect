package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class ys1 extends u6d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzo f40479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40480b;
    public final int c;
    public final Matrix d;

    public ys1(uzo uzoVar, long j, int i, Matrix matrix) {
        if (uzoVar == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f40479a = uzoVar;
        this.f40480b = j;
        this.c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.d = matrix;
    }

    @Override // defpackage.u6d, defpackage.q4d
    public uzo a() {
        return this.f40479a;
    }

    @Override // defpackage.u6d, defpackage.q4d
    public Matrix c() {
        return this.d;
    }

    @Override // defpackage.u6d, defpackage.q4d
    public int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u6d)) {
            return false;
        }
        u6d u6dVar = (u6d) obj;
        return this.f40479a.equals(u6dVar.a()) && this.f40480b == u6dVar.getTimestamp() && this.c == u6dVar.d() && this.d.equals(u6dVar.c());
    }

    @Override // defpackage.u6d, defpackage.q4d
    public long getTimestamp() {
        return this.f40480b;
    }

    public int hashCode() {
        int iHashCode = (this.f40479a.hashCode() ^ 1000003) * 1000003;
        long j = this.f40480b;
        return ((((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f40479a + ", timestamp=" + this.f40480b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
