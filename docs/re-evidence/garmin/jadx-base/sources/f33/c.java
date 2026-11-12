package f33;

import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68700c;

    static {
        new a(null);
        new c(u33.c.f168324g.f168290a);
        new c(u33.c.f168325h.f168290a);
    }

    public c(int i14, int i15, int i16) {
        this.f68698a = i14;
        this.f68699b = i15;
        this.f68700c = i16;
        if (i14 < 0) {
            h.s("Major version should be not less than 0");
            throw null;
        }
        if (i15 < 0) {
            h.s("Minor version should be not less than 0");
            throw null;
        }
        if (i16 >= 0) {
            return;
        }
        h.s("Patch version should be not less than 0");
        throw null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(c cVar) {
        cVar.getClass();
        int iH = s.h(this.f68698a, cVar.f68698a);
        if (iH != 0) {
            return iH;
        }
        int iH2 = s.h(this.f68699b, cVar.f68699b);
        return iH2 != 0 ? iH2 : s.h(this.f68700c, cVar.f68700c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c cVar = (c) obj;
        return this.f68698a == cVar.f68698a && this.f68699b == cVar.f68699b && this.f68700c == cVar.f68700c;
    }

    public final int hashCode() {
        return (((this.f68698a * 31) + this.f68699b) * 31) + this.f68700c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f68698a);
        sb3.append('.');
        sb3.append(this.f68699b);
        sb3.append('.');
        sb3.append(this.f68700c);
        return sb3.toString();
    }

    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
