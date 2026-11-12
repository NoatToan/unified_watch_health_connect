package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class asq {
    public static Comparator<asq> c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3423b;

    public class a implements Comparator<asq> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(asq asqVar, asq asqVar2) {
            return asqVar.f3423b - asqVar2.f3423b;
        }
    }

    public asq(int i, int i2) {
        this.f3422a = i;
        this.f3423b = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        asq asqVar = (asq) obj;
        return this.f3423b == asqVar.f3423b && this.f3422a == asqVar.f3422a;
    }

    public String toString() {
        return "[" + this.f3422a + ", " + this.f3423b + "]";
    }
}
