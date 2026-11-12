package androidx.navigation;

import android.os.Bundle;
import defpackage.kig;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kig f2664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2665b;
    public final boolean c;
    public final Object d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public kig<?> f2666a;
        public Object c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2667b = false;
        public boolean d = false;

        public b a() {
            if (this.f2666a == null) {
                this.f2666a = kig.e(this.c);
            }
            return new b(this.f2666a, this.f2667b, this.c, this.d);
        }

        public a b(Object obj) {
            this.c = obj;
            this.d = true;
            return this;
        }

        public a c(boolean z) {
            this.f2667b = z;
            return this;
        }

        public a d(kig<?> kigVar) {
            this.f2666a = kigVar;
            return this;
        }
    }

    public b(kig<?> kigVar, boolean z, Object obj, boolean z2) {
        if (!kigVar.f() && z) {
            throw new IllegalArgumentException(kigVar.c() + " does not allow nullable values");
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + kigVar.c() + " has null value but is not nullable.");
        }
        this.f2664a = kigVar;
        this.f2665b = z;
        this.d = obj;
        this.c = z2;
    }

    public kig<?> a() {
        return this.f2664a;
    }

    public boolean b() {
        return this.c;
    }

    public void c(String str, Bundle bundle) {
        if (this.c) {
            this.f2664a.i(bundle, str, this.d);
        }
    }

    public boolean d(String str, Bundle bundle) {
        if (!this.f2665b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f2664a.b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2665b != bVar.f2665b || this.c != bVar.c || !this.f2664a.equals(bVar.f2664a)) {
            return false;
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            return obj2.equals(bVar.d);
        }
        return bVar.d == null;
    }

    public int hashCode() {
        int iHashCode = ((((this.f2664a.hashCode() * 31) + (this.f2665b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
