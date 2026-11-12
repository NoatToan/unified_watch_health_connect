package com.google.crypto.tink.shaded.protobuf;

import defpackage.o73;
import defpackage.u91;
import defpackage.z7p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new j(s.c);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final f byteArrayCopier;
    private int hash = 0;

    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9346a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9347b;

        public a() {
            this.f9347b = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9346a < this.f9347b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g
        public byte nextByte() {
            int i = this.f9346a;
            if (i >= this.f9347b) {
                throw new NoSuchElementException();
            }
            this.f9346a = i + 1;
            return ByteString.this.internalByteAt(i);
        }
    }

    public class b implements Comparator<ByteString> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.ByteString$g, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.crypto.tink.shaded.protobuf.ByteString$g, java.util.Iterator] */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            ?? Iterator2 = byteString.iterator2();
            ?? Iterator3 = byteString2.iterator2();
            while (Iterator2.hasNext() && Iterator3.hasNext()) {
                int iCompare = Integer.compare(ByteString.toInt(Iterator2.nextByte()), ByteString.toInt(Iterator3.nextByte()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements f {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.f
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9348b;
        public final int c;

        public e(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.f9348b = i;
            this.c = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.j, com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.f9351a[this.f9348b + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.j, com.google.crypto.tink.shaded.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f9351a, f() + i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.j
        public int f() {
            return this.f9348b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.j, com.google.crypto.tink.shaded.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.f9351a[this.f9348b + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.j, com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.c;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    public interface f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    public interface g extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f9349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f9350b;

        public /* synthetic */ h(int i, a aVar) {
            this(i);
        }

        public ByteString a() {
            this.f9349a.d();
            return new j(this.f9350b);
        }

        public CodedOutputStream b() {
            return this.f9349a;
        }

        public h(int i) {
            byte[] bArr = new byte[i];
            this.f9350b = bArr;
            this.f9349a = CodedOutputStream.e0(bArr);
        }
    }

    public static abstract class i extends ByteString {
        public abstract boolean e(ByteString byteString, int i, int i2);

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void writeToReverse(o73 o73Var) throws IOException {
            writeTo(o73Var);
        }
    }

    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f9351a;

        public j(byte[] bArr) {
            bArr.getClass();
            this.f9351a = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f9351a, f(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int i) {
            return this.f9351a[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f9351a, f(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f9351a, i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.i
        public final boolean e(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
            }
            if (!(byteString instanceof j)) {
                return byteString.substring(i, i3).equals(substring(0, i2));
            }
            j jVar = (j) byteString;
            byte[] bArr = this.f9351a;
            byte[] bArr2 = jVar.f9351a;
            int iF = f() + i2;
            int iF2 = f();
            int iF3 = jVar.f() + i;
            while (iF2 < iF) {
                if (bArr[iF2] != bArr2[iF3]) {
                    return false;
                }
                iF2++;
                iF3++;
            }
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = jVar.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return e(jVar, 0, size());
            }
            return false;
        }

        public int f() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.f9351a[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean isValidUtf8() {
            int iF = f();
            return q0.t(this.f9351a, iF, size() + iF);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final com.google.crypto.tink.shaded.protobuf.g newCodedInput() {
            return com.google.crypto.tink.shaded.protobuf.g.k(this.f9351a, f(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f9351a, f(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int partialHash(int i, int i2, int i3) {
            return s.i(i, this.f9351a, f() + i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int iF = f() + i2;
            return q0.v(i, this.f9351a, iF, i3 + iF);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.f9351a.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteString substring(int i, int i2) {
            int iCheckRange = ByteString.checkRange(i, i2, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new e(this.f9351a, f() + i, iCheckRange);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.f9351a, f(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.f9351a, f() + i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void writeTo(o73 o73Var) throws IOException {
            o73Var.b(this.f9351a, f(), size());
        }
    }

    public static final class l implements f {
        public l() {
        }

        public /* synthetic */ l(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        byteArrayCopier = u91.c() ? new l(aVar) : new d(aVar);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new b();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return it.next();
        }
        int i3 = i2 >>> 1;
        return balancedConcat(it, i3).concat(balancedConcat(it, i2 - i3));
    }

    public static void checkIndex(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    public static int checkRange(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static ByteString copyFrom(byte[] bArr, int i2, int i3) {
        checkRange(i2, i2 + i3, bArr.length);
        return new j(byteArrayCopier.a(bArr, i2, i3));
    }

    public static ByteString copyFromUtf8(String str) {
        return new j(str.getBytes(s.f9434a));
    }

    public static h newCodedBuilder(int i2) {
        return new h(i2, null);
    }

    public static k newOutput(int i2) {
        return new k(i2);
    }

    private static ByteString readChunk(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        if (i3 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i3);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b2) {
        return b2 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return z7p.b(this);
        }
        return z7p.b(substring(0, 47)) + "...";
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new g0(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i2);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return j0.g(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + Marker.ANY_NON_NULL_MARKER + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i2) {
        copyTo(bArr, 0, i2, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i2, int i3, int i4);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i2);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract com.google.crypto.tink.shaded.protobuf.g newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i2, int i3, int i4);

    public abstract int partialIsValidUtf8(int i2, int i3, int i4);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i2) {
        return substring(i2, size());
    }

    public abstract ByteString substring(int i2, int i3);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return s.c;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e2) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e2);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(s.f9434a);
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i2, int i3) throws IOException {
        checkRange(i2, i2 + i3, size());
        if (i3 > 0) {
            writeToInternal(outputStream, i2, i3);
        }
    }

    public abstract void writeTo(o73 o73Var) throws IOException;

    public abstract void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException;

    public abstract void writeToReverse(o73 o73Var) throws IOException;

    public static k newOutput() {
        return new k(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i2) throws IOException {
        return readFrom(inputStream, i2, i2);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i2, int i3, int i4) {
        checkRange(i2, i2 + i4, size());
        checkRange(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            copyToInternal(bArr, i2, i3, i4);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i2, int i3) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString chunk = readChunk(inputStream, i2);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i2 = Math.min(i2 * 2, i3);
        }
    }

    public static final class k extends OutputStream {
        public static final byte[] f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<ByteString> f9353b;
        public int c;
        public byte[] d;
        public int e;

        public k(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f9352a = i;
            this.f9353b = new ArrayList<>();
            this.d = new byte[i];
        }

        public final void a(int i) {
            this.f9353b.add(new j(this.d));
            int length = this.c + this.d.length;
            this.c = length;
            this.d = new byte[Math.max(this.f9352a, Math.max(i, length >>> 1))];
            this.e = 0;
        }

        public synchronized int size() {
            return this.c + this.e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.e == this.d.length) {
                    a(1);
                }
                byte[] bArr = this.d;
                int i2 = this.e;
                this.e = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i3 = this.e;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.e += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    a(i4);
                    System.arraycopy(bArr, i + length2, this.d, 0, i4);
                    this.e = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i2) {
        checkRange(0, i2, byteBuffer.remaining());
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return new j(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new j(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new j(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new j(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
