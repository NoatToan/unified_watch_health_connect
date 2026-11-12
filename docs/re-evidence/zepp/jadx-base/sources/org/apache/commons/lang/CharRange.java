package org.apache.commons.lang;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.lang.text.StrBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class CharRange implements Serializable {
    private static final long serialVersionUID = 8270183163158333422L;
    private final char a;
    private final char b;
    private final boolean c;
    private transient String d;

    public static class a implements Iterator {
        private char a;
        private final CharRange b;
        private boolean c;

        private void a() {
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
        public boolean hasNext() {
            return this.c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            char c = this.a;
            a();
            return new Character(c);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private a(CharRange charRange) {
            this.b = charRange;
            this.c = true;
            if (!charRange.c) {
                this.a = charRange.a;
                return;
            }
            if (charRange.a != 0) {
                this.a = (char) 0;
            } else if (charRange.b == 65535) {
                this.c = false;
            } else {
                this.a = (char) (charRange.b + 1);
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
        return (c >= this.a && c <= this.b) != this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CharRange)) {
            return false;
        }
        CharRange charRange = (CharRange) obj;
        return this.a == charRange.a && this.b == charRange.b && this.c == charRange.c;
    }

    public char getEnd() {
        return this.b;
    }

    public char getStart() {
        return this.a;
    }

    public int hashCode() {
        return this.a + 'S' + (this.b * 7) + (this.c ? 1 : 0);
    }

    public boolean isNegated() {
        return this.c;
    }

    public Iterator iterator() {
        return new a();
    }

    public String toString() {
        if (this.d == null) {
            StrBuilder strBuilder = new StrBuilder(4);
            if (isNegated()) {
                strBuilder.append('^');
            }
            strBuilder.append(this.a);
            if (this.a != this.b) {
                strBuilder.append('-');
                strBuilder.append(this.b);
            }
            this.d = strBuilder.toString();
        }
        return this.d;
    }

    public CharRange(char c, boolean z) {
        this(c, c, z);
    }

    public boolean contains(CharRange charRange) {
        if (charRange == null) {
            throw new IllegalArgumentException("The Range must not be null");
        }
        if (this.c) {
            if (charRange.c) {
                return this.a >= charRange.a && this.b <= charRange.b;
            }
            return charRange.b < this.a || charRange.a > this.b;
        }
        if (charRange.c) {
            return this.a == 0 && this.b == 65535;
        }
        return this.a <= charRange.a && this.b >= charRange.b;
    }

    public CharRange(char c, char c2) {
        this(c, c2, false);
    }

    public CharRange(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.a = c;
        this.b = c2;
        this.c = z;
    }
}
