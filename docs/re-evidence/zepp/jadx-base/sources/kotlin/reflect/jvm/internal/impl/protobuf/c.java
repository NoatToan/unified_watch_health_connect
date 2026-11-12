package kotlin.reflect.jvm.internal.impl.protobuf;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;

/* JADX INFO: loaded from: classes23.dex */
class c extends ByteString {
    private static final int[] h;
    private final int b;
    private final ByteString c;
    private final ByteString d;
    private final int e;
    private final int f;
    private int g;

    public static class b {
        private final Stack<ByteString> a;

        private b() {
            this.a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteStringPop = this.a.pop();
            while (!this.a.isEmpty()) {
                byteStringPop = new c(this.a.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        private void c(ByteString byteString) {
            if (byteString.isBalanced()) {
                e(byteString);
                return;
            }
            if (byteString instanceof c) {
                c cVar = (c) byteString;
                c(cVar.c);
                c(cVar.d);
            } else {
                String strValueOf = String.valueOf(byteString.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private int d(int i) {
            int iBinarySearch = Arrays.binarySearch(c.h, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(ByteString byteString) {
            int iD = d(byteString.size());
            int i = c.h[iD + 1];
            if (this.a.isEmpty() || this.a.peek().size() >= i) {
                this.a.push(byteString);
                return;
            }
            int i2 = c.h[iD];
            ByteString byteStringPop = this.a.pop();
            while (true) {
                if (this.a.isEmpty() || this.a.peek().size() >= i2) {
                    break;
                } else {
                    byteStringPop = new c(this.a.pop(), byteStringPop);
                }
            }
            c cVar = new c(byteStringPop, byteString);
            while (!this.a.isEmpty()) {
                if (this.a.peek().size() >= c.h[d(cVar.size()) + 1]) {
                    break;
                } else {
                    cVar = new c(this.a.pop(), cVar);
                }
            }
            this.a.push(cVar);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$c, reason: collision with other inner class name */
    public static class C1171c implements Iterator<kotlin.reflect.jvm.internal.impl.protobuf.b> {
        private final Stack<c> a;
        private kotlin.reflect.jvm.internal.impl.protobuf.b b;

        private kotlin.reflect.jvm.internal.impl.protobuf.b a(ByteString byteString) {
            while (byteString instanceof c) {
                c cVar = (c) byteString;
                this.a.push(cVar);
                byteString = cVar.c;
            }
            return (kotlin.reflect.jvm.internal.impl.protobuf.b) byteString;
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.b b() {
            while (!this.a.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.protobuf.b bVarA = a(this.a.pop().d);
                if (!bVarA.isEmpty()) {
                    return bVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.protobuf.b next() {
            kotlin.reflect.jvm.internal.impl.protobuf.b bVar = this.b;
            if (bVar == null) {
                throw new NoSuchElementException();
            }
            this.b = b();
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C1171c(ByteString byteString) {
            this.a = new Stack<>();
            this.b = a(byteString);
        }
    }

    public class d implements ByteString.ByteIterator {
        private final C1171c a;
        private ByteString.ByteIterator b;
        public int c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c > 0;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.b.hasNext()) {
                this.b = this.a.next().iterator();
            }
            this.c--;
            return this.b.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        private d() {
            C1171c c1171c = new C1171c(c.this);
            this.a = c1171c;
            this.b = c1171c.next().iterator();
            this.c = c.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        h = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = h;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public static ByteString g(ByteString byteString, ByteString byteString2) {
        c cVar = byteString instanceof c ? (c) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() != 0) {
            int size = byteString.size() + byteString2.size();
            if (size < 128) {
                return h(byteString, byteString2);
            }
            if (cVar != null && cVar.d.size() + byteString2.size() < 128) {
                byteString2 = new c(cVar.c, h(cVar.d, byteString2));
            } else {
                if (cVar == null || cVar.c.getTreeDepth() <= cVar.d.getTreeDepth() || cVar.getTreeDepth() <= byteString2.getTreeDepth()) {
                    return size >= h[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1] ? new c(byteString, byteString2) : new b().b(byteString, byteString2);
                }
                byteString2 = new c(cVar.c, new c(cVar.d, byteString2));
            }
        }
        return byteString2;
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.b h(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new kotlin.reflect.jvm.internal.impl.protobuf.b(bArr);
    }

    private boolean i(ByteString byteString) {
        C1171c c1171c = new C1171c(this);
        kotlin.reflect.jvm.internal.impl.protobuf.b next = c1171c.next();
        C1171c c1171c2 = new C1171c(byteString);
        kotlin.reflect.jvm.internal.impl.protobuf.b next2 = c1171c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next.e(next2, i2, iMin) : next2.e(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.b;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = c1171c.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = c1171c2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void c(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.e;
        if (i3 <= i4) {
            this.c.c(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.d.c(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.c.c(outputStream, i, i5);
            this.d.c(outputStream, 0, i2 - i5);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.e;
        if (i4 <= i5) {
            this.c.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.d.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.c.copyToInternal(bArr, i, i2, i6);
            this.d.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        int iPeekCachedHashCode;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.b != byteString.size()) {
            return false;
        }
        if (this.b == 0) {
            return true;
        }
        if (this.g == 0 || (iPeekCachedHashCode = byteString.peekCachedHashCode()) == 0 || this.g == iPeekCachedHashCode) {
            return i(byteString);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int getTreeDepth() {
        return this.f;
    }

    public int hashCode() {
        int iPartialHash = this.g;
        if (iPartialHash == 0) {
            int i = this.b;
            iPartialHash = partialHash(i, 0, i);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.g = iPartialHash;
        }
        return iPartialHash;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isBalanced() {
        return this.b >= h[this.f];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.c.partialIsValidUtf8(0, 0, this.e);
        ByteString byteString = this.d;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.e;
        if (i4 <= i5) {
            return this.c.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.d.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.d.partialHash(this.c.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.e;
        if (i4 <= i5) {
            return this.c.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.d.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.d.partialIsValidUtf8(this.c.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int peekCachedHashCode() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    private c(ByteString byteString, ByteString byteString2) {
        this.g = 0;
        this.c = byteString;
        this.d = byteString2;
        int size = byteString.size();
        this.e = size;
        this.b = size + byteString2.size();
        this.f = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new d();
    }

    public class e extends InputStream {
        private C1171c a;
        private kotlin.reflect.jvm.internal.impl.protobuf.b b;
        private int c;
        private int d;
        private int e;
        private int f;

        public e() {
            b();
        }

        private void a() {
            if (this.b != null) {
                int i = this.d;
                int i2 = this.c;
                if (i == i2) {
                    this.e += i2;
                    this.d = 0;
                    if (!this.a.hasNext()) {
                        this.b = null;
                        this.c = 0;
                    } else {
                        kotlin.reflect.jvm.internal.impl.protobuf.b next = this.a.next();
                        this.b = next;
                        this.c = next.size();
                    }
                }
            }
        }

        private void b() {
            C1171c c1171c = new C1171c(c.this);
            this.a = c1171c;
            kotlin.reflect.jvm.internal.impl.protobuf.b next = c1171c.next();
            this.b = next;
            this.c = next.size();
            this.d = 0;
            this.e = 0;
        }

        private int c(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                a();
                if (this.b == null) {
                    if (i3 != i2) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.c - this.d, i3);
                if (bArr != null) {
                    this.b.copyTo(bArr, this.d, i, iMin);
                    i += iMin;
                }
                this.d += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return c.this.size() - (this.e + this.d);
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f = this.e + this.d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr);
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            return c(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            b();
            c(null, 0, this.f);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > ParserMinimalBase.MAX_INT_L) {
                j = 2147483647L;
            }
            return c(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            kotlin.reflect.jvm.internal.impl.protobuf.b bVar = this.b;
            if (bVar == null) {
                return -1;
            }
            int i = this.d;
            this.d = i + 1;
            return bVar.d(i) & 255;
        }
    }
}
