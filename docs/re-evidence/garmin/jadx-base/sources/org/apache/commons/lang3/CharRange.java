package org.apache.commons.lang3;

import c22.t;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class CharRange implements Iterable<Character>, Serializable {
    static final CharRange[] EMPTY_ARRAY = new CharRange[0];
    private static final long serialVersionUID = 8270183163158333422L;
    private final char end;
    private transient String iToString;
    private final boolean negated;
    private final char start;

    public static class CharacterIterator implements Iterator<Character> {
        private char current;
        private boolean hasNext;
        private final CharRange range;

        private CharacterIterator(CharRange charRange) {
            this.range = charRange;
            this.hasNext = true;
            if (!charRange.negated) {
                this.current = charRange.start;
                return;
            }
            if (charRange.start != 0) {
                this.current = (char) 0;
            } else if (charRange.end == 65535) {
                this.hasNext = false;
            } else {
                this.current = (char) (charRange.end + 1);
            }
        }

        private void prepareNext() {
            boolean z14 = this.range.negated;
            char c14 = this.current;
            if (!z14) {
                if (c14 < this.range.end) {
                    this.current = (char) (this.current + 1);
                    return;
                } else {
                    this.hasNext = false;
                    return;
                }
            }
            if (c14 == 65535) {
                this.hasNext = false;
                return;
            }
            if (c14 + 1 != this.range.start) {
                this.current = (char) (this.current + 1);
            } else if (this.range.end == 65535) {
                this.hasNext = false;
            } else {
                this.current = (char) (this.range.end + 1);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Character next() {
            if (!this.hasNext) {
                t.g();
                return null;
            }
            char c14 = this.current;
            prepareNext();
            return Character.valueOf(c14);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private CharRange(char c14, char c15, boolean z14) {
        if (c14 > c15) {
            c15 = c14;
            c14 = c15;
        }
        this.start = c14;
        this.end = c15;
        this.negated = z14;
    }

    public static CharRange is(char c14) {
        return new CharRange(c14, c14, false);
    }

    public static CharRange isIn(char c14, char c15) {
        return new CharRange(c14, c15, false);
    }

    public static CharRange isNot(char c14) {
        return new CharRange(c14, c14, true);
    }

    public static CharRange isNotIn(char c14, char c15) {
        return new CharRange(c14, c15, true);
    }

    public boolean contains(CharRange charRange) {
        Validate.notNull(charRange, "range", new Object[0]);
        if (this.negated) {
            if (charRange.negated) {
                return this.start >= charRange.start && this.end <= charRange.end;
            }
            return charRange.end < this.start || charRange.start > this.end;
        }
        boolean z14 = charRange.negated;
        char c14 = this.start;
        if (z14) {
            return c14 == 0 && this.end == 65535;
        }
        return c14 <= charRange.start && this.end >= charRange.end;
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
        return (this.end * 7) + this.start + 'S' + (this.negated ? 1 : 0);
    }

    public boolean isNegated() {
        return this.negated;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new CharacterIterator();
    }

    public String toString() {
        if (this.iToString == null) {
            StringBuilder sb3 = new StringBuilder(4);
            if (isNegated()) {
                sb3.append('^');
            }
            sb3.append(this.start);
            if (this.start != this.end) {
                sb3.append('-');
                sb3.append(this.end);
            }
            this.iToString = sb3.toString();
        }
        return this.iToString;
    }

    public boolean contains(char c14) {
        return (c14 >= this.start && c14 <= this.end) != this.negated;
    }
}
