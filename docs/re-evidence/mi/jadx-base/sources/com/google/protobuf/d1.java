package com.google.protobuf;

import defpackage.p73;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class d1 extends ByteString {
    public static final int[] f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f9621b;
    public final ByteString c;
    public final int d;
    public final int e;

    public class a extends ByteString.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f9622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.g f9623b = b();

        public a() {
            this.f9622a = new c(d1.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$g] */
        public final ByteString.g b() {
            if (this.f9622a.hasNext()) {
                return this.f9622a.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9623b != null;
        }

        @Override // com.google.protobuf.ByteString.g
        public byte nextByte() {
            ByteString.g gVar = this.f9623b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.f9623b.hasNext()) {
                this.f9623b = b();
            }
            return bNextByte;
        }
    }

    public static final class c implements Iterator<ByteString.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<d1> f9625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.i f9626b;

        public /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        public final ByteString.i a(ByteString byteString) {
            while (byteString instanceof d1) {
                d1 d1Var = (d1) byteString;
                this.f9625a.push(d1Var);
                byteString = d1Var.f9621b;
            }
            return (ByteString.i) byteString;
        }

        public final ByteString.i b() {
            ByteString.i iVarA;
            do {
                ArrayDeque<d1> arrayDeque = this.f9625a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                iVarA = a(this.f9625a.pop().c);
            } while (iVarA.isEmpty());
            return iVarA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.i next() {
            ByteString.i iVar = this.f9626b;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f9626b = b();
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9626b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(ByteString byteString) {
            if (!(byteString instanceof d1)) {
                this.f9625a = null;
                this.f9626b = (ByteString.i) byteString;
                return;
            }
            d1 d1Var = (d1) byteString;
            ArrayDeque<d1> arrayDeque = new ArrayDeque<>(d1Var.getTreeDepth());
            this.f9625a = arrayDeque;
            arrayDeque.push(d1Var);
            this.f9626b = a(d1Var.f9621b);
        }
    }

    public /* synthetic */ d1(ByteString byteString, ByteString byteString2, a aVar) {
        this(byteString, byteString2);
    }

    public static ByteString g(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return h(byteString, byteString2);
        }
        if (byteString instanceof d1) {
            d1 d1Var = (d1) byteString;
            if (d1Var.c.size() + byteString2.size() < 128) {
                return new d1(d1Var.f9621b, h(d1Var.c, byteString2));
            }
            if (d1Var.f9621b.getTreeDepth() > d1Var.c.getTreeDepth() && d1Var.getTreeDepth() > byteString2.getTreeDepth()) {
                return new d1(d1Var.f9621b, new d1(d1Var.c, byteString2));
            }
        }
        return size >= j(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1) ? new d1(byteString, byteString2) : new b(null).b(byteString, byteString2);
    }

    public static ByteString h(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    public static int j(int i) {
        int[] iArr = f;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.f9620a);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.f9621b.copyTo(byteBuffer);
        this.c.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.d;
        if (i4 <= i5) {
            this.f9621b.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.c.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.f9621b.copyToInternal(bArr, i, i2, i6);
            this.c.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f9620a != byteString.size()) {
            return false;
        }
        if (this.f9620a == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return i(byteString);
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.e;
    }

    public final boolean i(ByteString byteString) {
        ByteString.i next;
        a aVar = null;
        c cVar = new c(this, aVar);
        ByteString.i next2 = cVar.next();
        c cVar2 = new c(byteString, aVar);
        ByteString.i next3 = cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next2.size() - i;
            int size2 = next3.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next2.e(next3, i2, iMin) : next3.e(next2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.f9620a;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = cVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = cVar2.next();
                i2 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.d;
        return i < i2 ? this.f9621b.internalByteAt(i) : this.c.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        return this.f9620a >= j(this.e);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f9621b.partialIsValidUtf8(0, 0, this.d);
        ByteString byteString = this.c;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public j newCodedInput() {
        return j.g(new d());
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new d();
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.d;
        if (i4 <= i5) {
            return this.f9621b.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.c.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.c.partialHash(this.f9621b.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.d;
        if (i4 <= i5) {
            return this.f9621b.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.c.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.c.partialIsValidUtf8(this.f9621b.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f9620a;
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, this.f9620a);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.f9620a) {
            return this;
        }
        int i3 = this.d;
        if (i2 <= i3) {
            return this.f9621b.substring(i, i2);
        }
        return i >= i3 ? this.c.substring(i - i3, i2 - i3) : new d1(this.f9621b.substring(i), this.c.substring(0, i2 - this.d));
    }

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f9621b.writeTo(outputStream);
        this.c.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.d;
        if (i3 <= i4) {
            this.f9621b.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.c.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.f9621b.writeToInternal(outputStream, i, i5);
            this.c.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void writeToReverse(p73 p73Var) throws IOException {
        this.c.writeToReverse(p73Var);
        this.f9621b.writeToReverse(p73Var);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<ByteString> f9624a;

        public b() {
            this.f9624a = new ArrayDeque<>();
        }

        public final ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteStringPop = this.f9624a.pop();
            while (!this.f9624a.isEmpty()) {
                byteStringPop = new d1(this.f9624a.pop(), byteStringPop, null);
            }
            return byteStringPop;
        }

        public final void c(ByteString byteString) {
            if (byteString.isBalanced()) {
                e(byteString);
                return;
            }
            if (byteString instanceof d1) {
                d1 d1Var = (d1) byteString;
                c(d1Var.f9621b);
                c(d1Var.c);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        public final int d(int i) {
            int iBinarySearch = Arrays.binarySearch(d1.f, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public final void e(ByteString byteString) {
            a aVar;
            int iD = d(byteString.size());
            int iJ = d1.j(iD + 1);
            if (this.f9624a.isEmpty() || this.f9624a.peek().size() >= iJ) {
                this.f9624a.push(byteString);
                return;
            }
            int iJ2 = d1.j(iD);
            ByteString byteStringPop = this.f9624a.pop();
            while (true) {
                aVar = null;
                if (this.f9624a.isEmpty() || this.f9624a.peek().size() >= iJ2) {
                    break;
                } else {
                    byteStringPop = new d1(this.f9624a.pop(), byteStringPop, aVar);
                }
            }
            d1 d1Var = new d1(byteStringPop, byteString, aVar);
            while (!this.f9624a.isEmpty()) {
                if (this.f9624a.peek().size() >= d1.j(d(d1Var.size()) + 1)) {
                    break;
                } else {
                    d1Var = new d1(this.f9624a.pop(), d1Var, aVar);
                }
            }
            this.f9624a.push(d1Var);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d1(ByteString byteString, ByteString byteString2) {
        this.f9621b = byteString;
        this.c = byteString2;
        int size = byteString.size();
        this.d = size;
        this.f9620a = size + byteString2.size();
        this.e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(p73 p73Var) throws IOException {
        this.f9621b.writeTo(p73Var);
        this.c.writeTo(p73Var);
    }

    public class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f9627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.i f9628b;
        public int c;
        public int d;
        public int e;
        public int f;

        public d() {
            c();
        }

        public final void a() {
            if (this.f9628b != null) {
                int i = this.d;
                int i2 = this.c;
                if (i == i2) {
                    this.e += i2;
                    this.d = 0;
                    if (!this.f9627a.hasNext()) {
                        this.f9628b = null;
                        this.c = 0;
                    } else {
                        ByteString.i next = this.f9627a.next();
                        this.f9628b = next;
                        this.c = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return b();
        }

        public final int b() {
            return d1.this.size() - (this.e + this.d);
        }

        public final void c() {
            c cVar = new c(d1.this, null);
            this.f9627a = cVar;
            ByteString.i next = cVar.next();
            this.f9628b = next;
            this.c = next.size();
            this.d = 0;
            this.e = 0;
        }

        public final int d(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                a();
                if (this.f9628b == null) {
                    break;
                }
                int iMin = Math.min(this.c - this.d, i3);
                if (bArr != null) {
                    this.f9628b.copyTo(bArr, this.d, i, iMin);
                    i += iMin;
                }
                this.d += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
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
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int iD = d(bArr, i, i2);
            if (iD != 0) {
                return iD;
            }
            if (i2 > 0 || b() == 0) {
                return -1;
            }
            return iD;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            c();
            d(null, 0, this.f);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return d(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            ByteString.i iVar = this.f9628b;
            if (iVar == null) {
                return -1;
            }
            int i = this.d;
            this.d = i + 1;
            return iVar.byteAt(i) & 255;
        }
    }
}
