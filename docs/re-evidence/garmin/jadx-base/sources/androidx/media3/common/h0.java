package androidx.media3.common;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f8301b = new h0(ImmutableList.of());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<a> f8302a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f8304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f8305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f8306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean[] f8307e;

        static {
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(3);
            fa.z.H(4);
        }

        public a(e0 e0Var, boolean z14, int[] iArr, boolean[] zArr) {
            int i14 = e0Var.f8214a;
            this.f8303a = i14;
            boolean z15 = false;
            fa.a.a(i14 == iArr.length && i14 == zArr.length);
            this.f8304b = e0Var;
            if (z14 && i14 > 1) {
                z15 = true;
            }
            this.f8305c = z15;
            this.f8306d = (int[]) iArr.clone();
            this.f8307e = (boolean[]) zArr.clone();
        }

        public final boolean a(int i14) {
            return this.f8306d[i14] == 4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8305c == aVar.f8305c && this.f8304b.equals(aVar.f8304b) && Arrays.equals(this.f8306d, aVar.f8306d) && Arrays.equals(this.f8307e, aVar.f8307e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f8307e) + ((Arrays.hashCode(this.f8306d) + (((this.f8304b.hashCode() * 31) + (this.f8305c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        fa.z.H(0);
    }

    public h0(List<a> list) {
        this.f8302a = ImmutableList.copyOf((Collection) list);
    }

    public final boolean a(int i14) {
        int i15 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f8302a;
            if (i15 >= immutableList.size()) {
                return false;
            }
            if (immutableList.get(i15).f8304b.f8216c == i14) {
                return true;
            }
            i15++;
        }
    }

    public final boolean b(int i14) {
        int i15 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f8302a;
            if (i15 >= immutableList.size()) {
                return false;
            }
            a aVar = immutableList.get(i15);
            if (Booleans.contains(aVar.f8307e, true) && aVar.f8304b.f8216c == i14) {
                return true;
            }
            i15++;
        }
    }

    public final boolean c(int i14) {
        int i15 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f8302a;
            if (i15 >= immutableList.size()) {
                return false;
            }
            if (immutableList.get(i15).f8304b.f8216c == i14) {
                a aVar = immutableList.get(i15);
                for (int i16 = 0; i16 < aVar.f8306d.length; i16++) {
                    if (aVar.a(i16)) {
                        return true;
                    }
                }
            }
            i15++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return this.f8302a.equals(((h0) obj).f8302a);
    }

    public final int hashCode() {
        return this.f8302a.hashCode();
    }
}
