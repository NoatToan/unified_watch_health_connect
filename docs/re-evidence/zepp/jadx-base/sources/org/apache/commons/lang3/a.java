package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes23.dex */
final class a implements Iterable<Character>, Serializable {
    private static final long serialVersionUID = 8270183163158333422L;
    private final char a;
    private final char b;
    private final boolean c;
    private transient String d;

    public static class b implements Iterator<Character> {
        private char a;
        private final a b;
        private boolean c;

        private void b() {
            if (!this.b.c) {
                if (this.a < this.b.b) {
                    this.a = (char) (this.a + 1);
                    return;
                } else {
                    this.c = false;
                    return;
                }
            }
            char c = this.a;
            if (c == 65535) {
                this.c = false;
                return;
            }
            if (c + 1 != this.b.a) {
                this.a = (char) (this.a + 1);
            } else if (this.b.b == 65535) {
                this.c = false;
            } else {
                this.a = (char) (this.b.b + 1);
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character next() {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            char c = this.a;
            b();
            return Character.valueOf(c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(a aVar) {
            this.b = aVar;
            this.c = true;
            if (!aVar.c) {
                this.a = aVar.a;
                return;
            }
            if (aVar.a != 0) {
                this.a = (char) 0;
            } else if (aVar.b == 65535) {
                this.c = false;
            } else {
                this.a = (char) (aVar.b + 1);
            }
        }
    }

    private a(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.a = c;
        this.b = c2;
        this.c = z;
    }

    public static a i(char c) {
        return new a(c, c, false);
    }

    public static a j(char c, char c2) {
        return new a(c, c2, false);
    }

    public static a m(char c) {
        return new a(c, c, true);
    }

    public static a n(char c, char c2) {
        return new a(c, c2, true);
    }

    public boolean e(char c) {
        return (c >= this.a && c <= this.b) != this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public boolean f(a aVar) {
        Validate.isTrue(aVar != null, "The Range must not be null", new Object[0]);
        if (this.c) {
            if (aVar.c) {
                return this.a >= aVar.a && this.b <= aVar.b;
            }
            return aVar.b < this.a || aVar.a > this.b;
        }
        if (aVar.c) {
            return this.a == 0 && this.b == 65535;
        }
        return this.a <= aVar.a && this.b >= aVar.b;
    }

    public char g() {
        return this.b;
    }

    public char h() {
        return this.a;
    }

    public int hashCode() {
        return this.a + 'S' + (this.b * 7) + (this.c ? 1 : 0);
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
            sb.append(this.a);
            if (this.a != this.b) {
                sb.append('-');
                sb.append(this.b);
            }
            this.d = sb.toString();
        }
        return this.d;
    }
}
