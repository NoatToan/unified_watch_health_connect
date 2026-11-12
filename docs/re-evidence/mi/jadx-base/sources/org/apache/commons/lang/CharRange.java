package org.apache.commons.lang;

import defpackage.eio;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class CharRange implements Serializable {
    private static final long serialVersionUID = 8270183163158333422L;
    private final char end;
    private transient String iToString;
    private final boolean negated;
    private final char start;

    public static class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f29434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharRange f29435b;
        public boolean c;

        public final void a() {
            if (!this.f29435b.negated) {
                if (this.f29434a < this.f29435b.end) {
                    this.f29434a = (char) (this.f29434a + 1);
                    return;
                } else {
                    this.c = false;
                    return;
                }
            }
            char c = this.f29434a;
            if (c == 65535) {
                this.c = false;
                return;
            }
            if (c + 1 != this.f29435b.start) {
                this.f29434a = (char) (this.f29434a + 1);
            } else if (this.f29435b.end == 65535) {
                this.c = false;
            } else {
                this.f29434a = (char) (this.f29435b.end + 1);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            char c = this.f29434a;
            a();
            return new Character(c);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public a(CharRange charRange) {
            this.f29435b = charRange;
            this.c = true;
            if (!charRange.negated) {
                this.f29434a = charRange.start;
                return;
            }
            if (charRange.start != 0) {
                this.f29434a = (char) 0;
            } else if (charRange.end == 65535) {
                this.c = false;
            } else {
                this.f29434a = (char) (charRange.end + 1);
            }
        }
    }

    public CharRange(char c) {
        this(c, c, false);
    }

    public static CharRange is(char c) {
        return new CharRange(c, c, false);
    }

    public static CharRange isIn(char c, char c2) {
        return new CharRange(c, c2, false);
    }

    public static CharRange isNot(char c) {
        return new CharRange(c, c, true);
    }

    public static CharRange isNotIn(char c, char c2) {
        return new CharRange(c, c2, true);
    }

    public boolean contains(char c) {
        return (c >= this.start && c <= this.end) != this.negated;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CharRange)) {
            return false;
        }
        CharRange charRange = (CharRange) obj;
        return this.start == charRange.start && this.end == charRange.end && this.negated == charRange.negated;
    }

    public char getEnd() {
        return this.end;
    }

    public char getStart() {
        return this.start;
    }

    public int hashCode() {
        return this.start + 'S' + (this.end * 7) + (this.negated ? 1 : 0);
    }

    public boolean isNegated() {
        return this.negated;
    }

    public Iterator iterator() {
        return new a();
    }

    public String toString() {
        if (this.iToString == null) {
            eio eioVar = new eio(4);
            if (isNegated()) {
                eioVar.a('^');
            }
            eioVar.a(this.start);
            if (this.start != this.end) {
                eioVar.a('-');
                eioVar.a(this.end);
            }
            this.iToString = eioVar.toString();
        }
        return this.iToString;
    }

    public CharRange(char c, boolean z) {
        this(c, c, z);
    }

    public boolean contains(CharRange charRange) {
        if (charRange == null) {
            throw new IllegalArgumentException("The Range must not be null");
        }
        if (this.negated) {
            if (charRange.negated) {
                return this.start >= charRange.start && this.end <= charRange.end;
            }
            return charRange.end < this.start || charRange.start > this.end;
        }
        if (charRange.negated) {
            return this.start == 0 && this.end == 65535;
        }
        return this.start <= charRange.start && this.end >= charRange.end;
    }

    public CharRange(char c, char c2) {
        this(c, c2, false);
    }

    public CharRange(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.start = c;
        this.end = c2;
        this.negated = z;
    }
}
