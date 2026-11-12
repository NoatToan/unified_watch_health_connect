package m0;

import org.apache.commons.text.StringSubstitutor;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f115487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f115488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f115489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f115490d;

    public a(float f14, float f15, float f16, float f17) {
        this.f115487a = f14;
        this.f115488b = f15;
        this.f115489c = f16;
        this.f115490d = f17;
    }

    @Override // b0.l1
    public final float a() {
        return this.f115490d;
    }

    @Override // b0.l1
    public final float b() {
        return this.f115487a;
    }

    @Override // b0.l1
    public final float c() {
        return this.f115488b;
    }

    @Override // b0.l1
    public final float d() {
        return this.f115489c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            a aVar = (a) ((e) obj);
            if (Float.floatToIntBits(this.f115487a) == Float.floatToIntBits(aVar.f115487a) && Float.floatToIntBits(this.f115488b) == Float.floatToIntBits(aVar.f115488b) && Float.floatToIntBits(this.f115489c) == Float.floatToIntBits(aVar.f115489c) && Float.floatToIntBits(this.f115490d) == Float.floatToIntBits(aVar.f115490d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f115487a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f115488b)) * 1000003) ^ Float.floatToIntBits(this.f115489c)) * 1000003) ^ Float.floatToIntBits(this.f115490d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb3.append(this.f115487a);
        sb3.append(", maxZoomRatio=");
        sb3.append(this.f115488b);
        sb3.append(", minZoomRatio=");
        sb3.append(this.f115489c);
        sb3.append(", linearZoom=");
        return e0.e(this.f115490d, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
