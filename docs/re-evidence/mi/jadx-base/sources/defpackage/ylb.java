package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class ylb {
    public static final Comparator<ylb> h = new a();
    public static final Comparator<ylb> i = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40295b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final long f;
    public final boolean g;

    public class a implements Comparator<ylb> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ylb ylbVar, ylb ylbVar2) {
            return ylbVar.f40295b - ylbVar2.f40295b;
        }
    }

    public class b implements Comparator<ylb> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ylb ylbVar, ylb ylbVar2) {
            return ylbVar.f40294a - ylbVar2.f40294a;
        }
    }

    public ylb(int i2, long j, int i3, int i4) {
        this.f40294a = i2;
        this.f = j;
        this.g = true;
        this.f40295b = i3;
        this.c = true;
        this.d = i4;
        this.e = true;
    }

    public long c() {
        return this.f;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.f40295b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ylb) && ((ylb) obj).f40294a == this.f40294a;
    }

    public int f() {
        return this.f40294a;
    }

    public int hashCode() {
        return this.f40294a;
    }

    public String toString() {
        return "[" + tzo.e(this.f40294a) + ", " + Long.toHexString(this.f) + ", " + Integer.toHexString(this.f40295b) + ", " + Integer.toHexString(this.d) + "]";
    }

    public ylb(int i2, int i3) {
        this.f40294a = i2;
        this.f = 0L;
        this.g = false;
        this.f40295b = 0;
        this.c = false;
        this.d = i3;
        this.e = true;
    }

    public ylb(int i2) {
        this.f40294a = i2;
        this.f = 0L;
        this.g = false;
        this.f40295b = 0;
        this.c = false;
        this.d = 0;
        this.e = true;
    }
}
