package com.google.crypto.tink.shaded.protobuf;

import defpackage.o73;
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
public final class j0 extends ByteString {
    public static final int[] f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f9398b;
    public final ByteString c;
    public final int d;
    public final int e;

    public class a extends ByteString.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f9399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.g f9400b = b();

        public a() {
            this.f9399a = new c(j0.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.crypto.tink.shaded.protobuf.ByteString$g] */
        public final ByteString.g b() {
            if (this.f9399a.hasNext()) {
                return this.f9399a.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9400b != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g
        public byte nextByte() {
            ByteString.g gVar = this.f9400b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.f9400b.hasNext()) {
                this.f9400b = b();
            }
            return bNextByte;
        }
    }

    public static final class c implements Iterator<ByteString.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<j0> f9402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.i f9403b;

        public /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        public final ByteString.i a(ByteString byteString) {
            while (byteString instanceof j0) {
                j0 j0Var = (j0) byteString;
                this.f9402a.push(j0Var);
                byteString = j0Var.f9398b;
            }
            return (ByteString.i) byteString;
        }

        public final ByteString.i b() {
            ByteString.i iVarA;
            do {
                ArrayDeque<j0> arrayDeque = this.f9402a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                iVarA = a(this.f9402a.pop().c);
            } while (iVarA.isEmpty());
            return iVarA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.i next() {
            ByteString.i iVar = this.f9403b;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f9403b = b();
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9403b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(ByteString byteString) {
            if (!(byteString instanceof j0)) {
                this.f9402a = null;
                this.f9403b = (ByteString.i) byteString;
                return;
            }
            j0 j0Var = (j0) byteString;
            ArrayDeque<j0> arrayDeque = new ArrayDeque<>(j0Var.getTreeDepth());
            this.f9402a = arrayDeque;
            arrayDeque.push(j0Var);
            this.f9403b = a(j0Var.f9398b);
        }
    }

    public /* synthetic */ j0(ByteString byteString, ByteString byteString2, a aVar) {
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
        if (byteString instanceof j0) {
            j0 j0Var = (j0) byteString;
            if (j0Var.c.size() + byteString2.size() < 128) {
                return new j0(j0Var.f9398b, h(j0Var.c, byteString2));
            }
            if (j0Var.f9398b.getTreeDepth() > j0Var.c.getTreeDepth() && j0Var.getTreeDepth() > byteString2.getTreeDepth()) {
                return new j0(j0Var.f9398b, new j0(j0Var.c, byteString2));
            }
        }
        return size >= j(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1) ? new j0(byteString, byteString2) : new b(null).b(byteString, byteString2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.f9397a);
        return internalByteAt(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.f9398b.copyTo(byteBuffer);
        this.c.copyTo(byteBuffer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.d;
        if (i4 <= i5) {
            this.f9398b.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.c.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.f9398b.copyToInternal(bArr, i, i2, i6);
            this.c.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f9397a != byteString.size()) {
            return false;
        }
        if (this.f9397a == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return i(byteString);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
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
            int i4 = this.f9397a;
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

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.d;
        return i < i2 ? this.f9398b.internalByteAt(i) : this.c.internalByteAt(i - i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isBalanced() {
        return this.f9397a >= j(this.e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f9398b.partialIsValidUtf8(0, 0, this.d);
        ByteString byteString = this.c;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public g newCodedInput() {
        return g.f(new d());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public InputStream newInput() {
        return new d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.d;
        if (i4 <= i5) {
            return this.f9398b.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.c.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.c.partialHash(this.f9398b.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.d;
        if (i4 <= i5) {
            return this.f9398b.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.c.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.c.partialIsValidUtf8(this.f9398b.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int size() {
        return this.f9397a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, this.f9397a);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.f9397a) {
            return this;
        }
        int i3 = this.d;
        if (i2 <= i3) {
            return this.f9398b.substring(i, i2);
        }
        return i >= i3 ? this.c.substring(i - i3, i2 - i3) : new j0(this.f9398b.substring(i), this.c.substring(0, i2 - this.d));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f9398b.writeTo(outputStream);
        this.c.writeTo(outputStream);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.d;
        if (i3 <= i4) {
            this.f9398b.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.c.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.f9398b.writeToInternal(outputStream, i, i5);
            this.c.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeToReverse(o73 o73Var) throws IOException {
        this.c.writeToReverse(o73Var);
        this.f9398b.writeToReverse(o73Var);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<ByteString> f9401a;

        public b() {
            this.f9401a = new ArrayDeque<>();
        }

        public final ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteStringPop = this.f9401a.pop();
            while (!this.f9401a.isEmpty()) {
                byteStringPop = new j0(this.f9401a.pop(), byteStringPop, null);
            }
            return byteStringPop;
        }

        public final void c(ByteString byteString) {
            if (byteString.isBalanced()) {
                e(byteString);
                return;
            }
            if (byteString instanceof j0) {
                j0 j0Var = (j0) byteString;
                c(j0Var.f9398b);
                c(j0Var.c);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        public final int d(int i) {
            int iBinarySearch = Arrays.binarySearch(j0.f, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public final void e(ByteString byteString) {
            a aVar;
            int iD = d(byteString.size());
            int iJ = j0.j(iD + 1);
            if (this.f9401a.isEmpty() || this.f9401a.peek().size() >= iJ) {
                this.f9401a.push(byteString);
                return;
            }
            int iJ2 = j0.j(iD);
            ByteString byteStringPop = this.f9401a.pop();
            while (true) {
                aVar = null;
                if (this.f9401a.isEmpty() || this.f9401a.peek().size() >= iJ2) {
                    break;
                } else {
                    byteStringPop = new j0(this.f9401a.pop(), byteStringPop, aVar);
                }
            }
            j0 j0Var = new j0(byteStringPop, byteString, aVar);
            while (!this.f9401a.isEmpty()) {
                if (this.f9401a.peek().size() >= j0.j(d(j0Var.size()) + 1)) {
                    break;
                } else {
                    j0Var = new j0(this.f9401a.pop(), j0Var, aVar);
                }
            }
            this.f9401a.push(j0Var);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public j0(ByteString byteString, ByteString byteString2) {
        this.f9398b = byteString;
        this.c = byteString2;
        int size = byteString.size();
        this.d = size;
        this.f9397a = size + byteString2.size();
        this.e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(o73 o73Var) throws IOException {
        this.f9398b.writeTo(o73Var);
        this.c.writeTo(o73Var);
    }

    public class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f9404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.i f9405b;
        public int c;
        public int d;
        public int e;
        public int f;

        public d() {
            b();
        }

        public final void a() {
            if (this.f9405b != null) {
                int i = this.d;
                int i2 = this.c;
                if (i == i2) {
                    this.e += i2;
                    this.d = 0;
                    if (!this.f9404a.hasNext()) {
                        this.f9405b = null;
                        this.c = 0;
                    } else {
                        ByteString.i next = this.f9404a.next();
                        this.f9405b = next;
                        this.c = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return j0.this.size() - (this.e + this.d);
        }

        public final void b() {
            c cVar = new c(j0.this, null);
            this.f9404a = cVar;
            ByteString.i next = cVar.next();
            this.f9405b = next;
            this.c = next.size();
            this.d = 0;
            this.e = 0;
        }

        public final int c(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                a();
                if (this.f9405b == null) {
                    break;
                }
                int iMin = Math.min(this.c - this.d, i3);
                if (bArr != null) {
                    this.f9405b.copyTo(bArr, this.d, i, iMin);
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
            int iC = c(bArr, i, i2);
            if (iC == 0) {
                return -1;
            }
            return iC;
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
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return c(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            ByteString.i iVar = this.f9405b;
            if (iVar == null) {
                return -1;
            }
            int i = this.d;
            this.d = i + 1;
            return iVar.byteAt(i) & 255;
        }
    }
}
