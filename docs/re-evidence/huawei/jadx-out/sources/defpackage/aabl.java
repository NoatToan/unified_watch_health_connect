package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class aabl implements Comparable<aabl>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aabl f90a = new aabl(HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE, 253);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aabl f91b = new aabl(HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE, 255);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f92c;
    private final int d;

    private aabl(int i, int i2) {
        this.d = i2;
        this.f92c = i;
    }

    public int d() {
        return this.d;
    }

    public int c() {
        return this.f92c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(aabl aablVar) {
        if (this == aablVar) {
            return 0;
        }
        if (this.f92c != aablVar.c()) {
            return this.f92c < aablVar.c() ? 1 : -1;
        }
        if (this.d < aablVar.d()) {
            return 1;
        }
        return this.d > aablVar.d() ? -1 : 0;
    }

    public int hashCode() {
        return ((this.f92c + 31) * 31) + this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aabl)) {
            return false;
        }
        aabl aablVar = (aabl) obj;
        return this.f92c == aablVar.f92c && this.d == aablVar.d;
    }

    public String toString() {
        return Integer.toString(255 - this.f92c) + "." + Integer.toString(255 - this.d);
    }

    public static aabl a(int i, int i2) {
        if (i == 254 && i2 == 253) {
            return f90a;
        }
        if (i == 254 && i2 == 255) {
            return f91b;
        }
        return new aabl(i, i2);
    }
}
