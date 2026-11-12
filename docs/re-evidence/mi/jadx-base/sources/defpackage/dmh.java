package defpackage;

import android.graphics.PointF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class dmh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f15692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15693b;
    public final PointF c;
    public final float d;

    public dmh(PointF pointF, float f, PointF pointF2, float f2) {
        this.f15692a = (PointF) g6i.h(pointF, "start == null");
        this.f15693b = f;
        this.c = (PointF) g6i.h(pointF2, "end == null");
        this.d = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmh)) {
            return false;
        }
        dmh dmhVar = (dmh) obj;
        return Float.compare(this.f15693b, dmhVar.f15693b) == 0 && Float.compare(this.d, dmhVar.d) == 0 && this.f15692a.equals(dmhVar.f15692a) && this.c.equals(dmhVar.c);
    }

    public int hashCode() {
        int iHashCode = this.f15692a.hashCode() * 31;
        float f = this.f15693b;
        int iFloatToIntBits = (((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.c.hashCode()) * 31;
        float f2 = this.d;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f15692a + ", startFraction=" + this.f15693b + ", end=" + this.c + ", endFraction=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }
}
