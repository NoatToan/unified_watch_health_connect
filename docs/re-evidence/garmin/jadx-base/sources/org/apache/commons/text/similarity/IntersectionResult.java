package org.apache.commons.text.similarity;

import am.j;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class IntersectionResult {
    private final int intersection;
    private final int sizeA;
    private final int sizeB;

    public IntersectionResult(int i14, int i15, int i16) {
        if (i14 < 0) {
            h.s(j.h(i14, "Set size |A| is not positive: "));
            throw null;
        }
        if (i15 < 0) {
            h.s(j.h(i15, "Set size |B| is not positive: "));
            throw null;
        }
        if (i16 < 0 || i16 > Math.min(i14, i15)) {
            h.s(j.h(i16, "Invalid intersection of |A| and |B|: "));
            throw null;
        }
        this.sizeA = i14;
        this.sizeB = i15;
        this.intersection = i16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IntersectionResult intersectionResult = (IntersectionResult) obj;
            if (this.sizeA == intersectionResult.sizeA && this.sizeB == intersectionResult.sizeB && this.intersection == intersectionResult.intersection) {
                return true;
            }
        }
        return false;
    }

    public int getIntersection() {
        return this.intersection;
    }

    public int getSizeA() {
        return this.sizeA;
    }

    public int getSizeB() {
        return this.sizeB;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.sizeA), Integer.valueOf(this.sizeB), Integer.valueOf(this.intersection));
    }

    public String toString() {
        return "Size A: " + this.sizeA + ", Size B: " + this.sizeB + ", Intersection: " + this.intersection;
    }
}
