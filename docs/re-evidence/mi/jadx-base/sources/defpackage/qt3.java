package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class qt3 implements Iterable<Character>, Serializable {
    private static final long serialVersionUID = 8270183163158333422L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f31819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f31820b;
    public final boolean c;
    public transient String d;

    public static class b implements Iterator<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f31821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final qt3 f31822b;
        public boolean c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character next() {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            char c = this.f31821a;
            b();
            return Character.valueOf(c);
        }

        public final void b() {
            if (!this.f31822b.c) {
                if (this.f31821a < this.f31822b.f31820b) {
                    this.f31821a = (char) (this.f31821a + 1);
                    return;
                } else {
                    this.c = false;
                    return;
                }
            }
            char c = this.f31821a;
            if (c == 65535) {
                this.c = false;
                return;
            }
            if (c + 1 != this.f31822b.f31819a) {
                this.f31821a = (char) (this.f31821a + 1);
            } else if (this.f31822b.f31820b == 65535) {
                this.c = false;
            } else {
                this.f31821a = (char) (this.f31822b.f31820b + 1);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b(qt3 qt3Var) {
            this.f31822b = qt3Var;
            this.c = true;
            if (!qt3Var.c) {
                this.f31821a = qt3Var.f31819a;
                return;
            }
            if (qt3Var.f31819a != 0) {
                this.f31821a = (char) 0;
            } else if (qt3Var.f31820b == 65535) {
                this.c = false;
            } else {
                this.f31821a = (char) (qt3Var.f31820b + 1);
            }
        }
    }

    public qt3(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.f31819a = c;
        this.f31820b = c2;
        this.c = z;
    }

    public static qt3 i(char c) {
        return new qt3(c, c, false);
    }

    public static qt3 j(char c, char c2) {
        return new qt3(c, c2, false);
    }

    public static qt3 m(char c) {
        return new qt3(c, c, true);
    }

    public static qt3 o(char c, char c2) {
        return new qt3(c, c2, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qt3)) {
            return false;
        }
        qt3 qt3Var = (qt3) obj;
        return this.f31819a == qt3Var.f31819a && this.f31820b == qt3Var.f31820b && this.c == qt3Var.c;
    }

    public boolean h(char c) {
        return (c >= this.f31819a && c <= this.f31820b) != this.c;
    }

    public int hashCode() {
        return this.f31819a + 'S' + (this.f31820b * 7) + (this.c ? 1 : 0);
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new b();
    }

    public boolean k() {
        return this.c;
    }

    public String toString() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder(4);
            if (k()) {
                sb.append('^');
            }
            sb.append(this.f31819a);
            if (this.f31819a != this.f31820b) {
                sb.append('-');
                sb.append(this.f31820b);
            }
            this.d = sb.toString();
        }
        return this.d;
    }
}
