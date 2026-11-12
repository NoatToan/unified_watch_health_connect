package l3;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll3/e1;", "T", "Ll3/o0;", "", "", "anchors", "<init>", "(Ljava/util/Map;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1<T> implements o0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<T, Float> f109228a;

    public e1(Map<T, Float> map) {
        this.f109228a = map;
    }

    @Override // l3.o0
    public final T a(float f14) {
        T next;
        Iterator<T> it = this.f109228a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f14 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f14 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // l3.o0
    public final T b(float f14, boolean z14) {
        T next;
        Iterator<T> it = this.f109228a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f15 = z14 ? fFloatValue - f14 : f14 - fFloatValue;
                if (f15 < 0.0f) {
                    f15 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f16 = z14 ? fFloatValue2 - f14 : f14 - fFloatValue2;
                    if (f16 < 0.0f) {
                        f16 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f15, f16) > 0) {
                        next = next2;
                        f15 = f16;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // l3.o0
    public final float c(T t7) {
        Float f14 = this.f109228a.get(t7);
        if (f14 != null) {
            return f14.floatValue();
        }
        return Float.NaN;
    }

    @Override // l3.o0
    public final boolean d(T t7) {
        return this.f109228a.containsKey(t7);
    }

    @Override // l3.o0
    public final float e() {
        Float fV0 = p13.h0.v0(this.f109228a.values());
        if (fV0 != null) {
            return fV0.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f109228a, ((e1) obj).f109228a);
    }

    @Override // l3.o0
    public final float f() {
        Float fQ0 = p13.h0.q0(this.f109228a.values());
        if (fQ0 != null) {
            return fQ0.floatValue();
        }
        return Float.NaN;
    }

    @Override // l3.o0
    public final int getSize() {
        return this.f109228a.size();
    }

    public final int hashCode() {
        return this.f109228a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f109228a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
