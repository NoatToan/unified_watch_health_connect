package androidx.health.platform.client.proto;

import defpackage.n73;
import defpackage.t91;
import defpackage.y7p;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new j(f0.d);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final f byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2444a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2445b;

        public a() {
            this.f2445b = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2444a < this.f2445b;
        }

        @Override // androidx.health.platform.client.proto.ByteString.g
        public byte nextByte() {
            int i = this.f2444a;
            if (i >= this.f2445b) {
                throw new NoSuchElementException();
            }
            this.f2444a = i + 1;
            return ByteString.this.internalByteAt(i);
        }
    }

    public class b implements Comparator<ByteString> {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.health.platform.client.proto.ByteString$g, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.health.platform.client.proto.ByteString$g, java.util.Iterator] */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            ?? Iterator2 = byteString.iterator2();
            ?? Iterator3 = byteString2.iterator2();
            while (Iterator2.hasNext() && Iterator3.hasNext()) {
                int iCompareTo = Integer.valueOf(ByteString.toInt(Iterator2.nextByte())).compareTo(Integer.valueOf(ByteString.toInt(Iterator3.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
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

        @Override // androidx.health.platform.client.proto.ByteString.f
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2446b;
        public final int c;

        public e(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.f2446b = i;
            this.c = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.health.platform.client.proto.ByteString.j, androidx.health.platform.client.proto.ByteString
        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.f2449a[this.f2446b + i];
        }

        @Override // androidx.health.platform.client.proto.ByteString.j, androidx.health.platform.client.proto.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f2449a, f() + i, bArr, i2, i3);
        }

        @Override // androidx.health.platform.client.proto.ByteString.j
        public int f() {
            return this.f2446b;
        }

        @Override // androidx.health.platform.client.proto.ByteString.j, androidx.health.platform.client.proto.ByteString
        public byte internalByteAt(int i) {
            return this.f2449a[this.f2446b + i];
        }

        @Override // androidx.health.platform.client.proto.ByteString.j, androidx.health.platform.client.proto.ByteString
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
        public final CodedOutputStream f2447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f2448b;

        public /* synthetic */ h(int i, a aVar) {
            this(i);
        }

        public ByteString a() {
            this.f2447a.d();
            return new j(this.f2448b);
        }

        public CodedOutputStream b() {
            return this.f2447a;
        }

        public h(int i) {
            byte[] bArr = new byte[i];
            this.f2448b = bArr;
            this.f2447a = CodedOutputStream.d0(bArr);
        }
    }

    public static abstract class i extends ByteString {
        private static final long serialVersionUID = 1;

        public abstract boolean e(ByteString byteString, int i, int i2);

        @Override // androidx.health.platform.client.proto.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public void writeToReverse(n73 n73Var) throws IOException {
            writeTo(n73Var);
        }
    }

    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f2449a;

        public j(byte[] bArr) {
            bArr.getClass();
            this.f2449a = bArr;
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f2449a, f(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public byte byteAt(int i) {
            return this.f2449a[i];
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f2449a, f(), size());
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f2449a, i, bArr, i2, i3);
        }

        @Override // androidx.health.platform.client.proto.ByteString.i
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
            byte[] bArr = this.f2449a;
            byte[] bArr2 = jVar.f2449a;
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

        @Override // androidx.health.platform.client.proto.ByteString
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

        @Override // androidx.health.platform.client.proto.ByteString
        public byte internalByteAt(int i) {
            return this.f2449a[i];
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final boolean isValidUtf8() {
            int iF = f();
            return e2.t(this.f2449a, iF, size() + iF);
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final androidx.health.platform.client.proto.h newCodedInput() {
            return androidx.health.platform.client.proto.h.l(this.f2449a, f(), size(), true);
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f2449a, f(), size());
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final int partialHash(int i, int i2, int i3) {
            return f0.i(i, this.f2449a, f() + i2, i3);
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int iF = f() + i2;
            return e2.v(i, this.f2449a, iF, i3 + iF);
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public int size() {
            return this.f2449a.length;
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final ByteString substring(int i, int i2) {
            int iCheckRange = ByteString.checkRange(i, i2, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new e(this.f2449a, f() + i, iCheckRange);
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.f2449a, f(), size(), charset);
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.f2449a, f() + i, i2);
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final void writeTo(n73 n73Var) throws IOException {
            n73Var.b(this.f2449a, f(), size());
        }
    }

    public static final class l implements f {
        public l() {
        }

        public /* synthetic */ l(a aVar) {
            this();
        }

        @Override // androidx.health.platform.client.proto.ByteString.f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        byteArrayCopier = t91.c() ? new l(aVar) : new d(aVar);
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
        return new j(str.getBytes(f0.f2490b));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i2) {
        int iHexDigit = hexDigit(str.charAt(i2));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i2) + " at index " + i2);
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (extractHexDigit(str, i3 + 1) | (extractHexDigit(str, i3) << 4));
        }
        return new j(bArr);
    }

    private static int hexDigit(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 < 'a' || c2 > 'f') {
            return -1;
        }
        return c2 - 'W';
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
            return y7p.b(this);
        }
        return y7p.b(substring(0, 47)) + "...";
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new s0(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i2);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return v1.g(this, byteString);
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

    public abstract androidx.health.platform.client.proto.h newCodedInput();

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
            return f0.d;
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
        return toString(f0.f2490b);
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i2, int i3) throws IOException {
        checkRange(i2, i2 + i3, size());
        if (i3 > 0) {
            writeToInternal(outputStream, i2, i3);
        }
    }

    public abstract void writeTo(n73 n73Var) throws IOException;

    public abstract void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException;

    public abstract void writeToReverse(n73 n73Var) throws IOException;

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
        public final int f2450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<ByteString> f2451b;
        public int c;
        public byte[] d;
        public int e;

        public k(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f2450a = i;
            this.f2451b = new ArrayList<>();
            this.d = new byte[i];
        }

        public final void a(int i) {
            this.f2451b.add(new j(this.d));
            int length = this.c + this.d.length;
            this.c = length;
            this.d = new byte[Math.max(this.f2450a, Math.max(i, length >>> 1))];
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
