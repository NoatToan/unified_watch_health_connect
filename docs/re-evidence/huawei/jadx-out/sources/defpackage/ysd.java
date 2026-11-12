package defpackage;

import com.iabtcf.utils.IntIterable;
import com.iabtcf.utils.IntIterator;
import java.util.BitSet;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes20.dex */
public class ysd extends IntIterable {
    public static final ysd d = new ysd(new BitSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BitSet f53800c;

    public static ysd e(BitSet bitSet) {
        return new ysd((BitSet) bitSet.clone());
    }

    public static a c() {
        return new a();
    }

    private ysd(BitSet bitSet) {
        this.f53800c = bitSet;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ysd clone() {
        return new ysd((BitSet) this.f53800c.clone());
    }

    @Override // com.iabtcf.utils.IntIterable
    public boolean contains(int i) {
        if (i < 0) {
            return false;
        }
        return this.f53800c.get(i);
    }

    @Override // com.iabtcf.utils.IntIterable
    public IntIterator intIterator() {
        return new IntIterator() { // from class: ysd.2
            int d = b();

            public int b() {
                if (ysd.this.f53800c.isEmpty()) {
                    return -1;
                }
                return ysd.this.f53800c.nextSetBit(0);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.d != -1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator, java.util.PrimitiveIterator.OfInt
            public Integer next() {
                return Integer.valueOf(nextInt());
            }

            @Override // java.util.PrimitiveIterator.OfInt
            public int nextInt() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.d;
                this.d = ysd.this.f53800c.nextSetBit(this.d + 1);
                return i;
            }
        };
    }

    public int hashCode() {
        BitSet bitSet = this.f53800c;
        return (bitSet == null ? 0 : bitSet.hashCode()) + 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ysd ysdVar = (ysd) obj;
        BitSet bitSet = this.f53800c;
        if (bitSet == null) {
            return ysdVar.f53800c == null;
        }
        return bitSet.equals(ysdVar.f53800c);
    }

    public String toString() {
        return this.f53800c.toString();
    }

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BitSet f53802c;

        private a() {
            this(new BitSet());
        }

        private a(BitSet bitSet) {
            this.f53802c = bitSet;
        }

        public a a(int i) {
            this.f53802c.set(i);
            return this;
        }

        public ysd b() {
            return new ysd((BitSet) this.f53802c.clone());
        }
    }
}
