package org.apache.commons.fileupload;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.apache.commons.fileupload.util.Closeable;
import org.apache.commons.fileupload.util.Streams;

/* JADX INFO: loaded from: classes23.dex */
public class MultipartStream {
    public static final byte CR = 13;
    public static final byte DASH = 45;
    public static final int DEFAULT_BUFSIZE = 4096;
    public static final int HEADER_PART_SIZE_MAX = 10240;
    public static final byte LF = 10;
    private final InputStream a;
    private int b;
    private int c;
    private byte[] d;
    private final int e;
    private final byte[] f;
    private int g;
    private int h;
    private String i;
    private final ProgressNotifier j;
    public static final byte[] HEADER_SEPARATOR = {13, 10, 13, 10};
    public static final byte[] FIELD_SEPARATOR = {13, 10};
    public static final byte[] STREAM_TERMINATOR = {45, 45};
    public static final byte[] BOUNDARY_PREFIX = {13, 10, 45, 45};

    public static class IllegalBoundaryException extends IOException {
        private static final long serialVersionUID = -161533165102632918L;

        public IllegalBoundaryException() {
        }

        public IllegalBoundaryException(String str) {
            super(str);
        }
    }

    public class ItemInputStream extends InputStream implements Closeable {
        private static final int f = 256;
        private long a;
        private int b;
        private int c;
        private boolean d;

        public ItemInputStream() {
            a();
        }

        private void a() {
            int iFindSeparator = MultipartStream.this.findSeparator();
            this.c = iFindSeparator;
            if (iFindSeparator == -1) {
                if (MultipartStream.this.h - MultipartStream.this.g > MultipartStream.this.c) {
                    this.b = MultipartStream.this.c;
                } else {
                    this.b = MultipartStream.this.h - MultipartStream.this.g;
                }
            }
        }

        private int b() throws IOException {
            int iAvailable;
            if (this.c != -1) {
                return 0;
            }
            this.a += (long) ((MultipartStream.this.h - MultipartStream.this.g) - this.b);
            System.arraycopy(MultipartStream.this.f, MultipartStream.this.h - this.b, MultipartStream.this.f, 0, this.b);
            MultipartStream.this.g = 0;
            MultipartStream.this.h = this.b;
            do {
                int i = MultipartStream.this.a.read(MultipartStream.this.f, MultipartStream.this.h, MultipartStream.this.e - MultipartStream.this.h);
                if (i == -1) {
                    throw new MalformedStreamException("Stream ended unexpectedly");
                }
                if (MultipartStream.this.j != null) {
                    MultipartStream.this.j.a(i);
                }
                MultipartStream.this.h += i;
                a();
                iAvailable = available();
                if (iAvailable > 0) {
                    break;
                }
            } while (this.c == -1);
            return iAvailable;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            int i;
            int i2 = this.c;
            if (i2 == -1) {
                i2 = MultipartStream.this.h - MultipartStream.this.g;
                i = this.b;
            } else {
                i = MultipartStream.this.g;
            }
            return i2 - i;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable, org.apache.commons.fileupload.util.Closeable
        public void close() throws IOException {
            close(false);
        }

        public long getBytesRead() {
            return this.a;
        }

        @Override // org.apache.commons.fileupload.util.Closeable
        public boolean isClosed() {
            return this.d;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.d) {
                throw new FileItemStream.ItemSkippedException();
            }
            if (available() == 0 && b() == 0) {
                return -1;
            }
            this.a++;
            byte b = MultipartStream.this.f[MultipartStream.e(MultipartStream.this)];
            return b >= 0 ? b : b + 256;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            if (this.d) {
                throw new FileItemStream.ItemSkippedException();
            }
            int iAvailable = available();
            if (iAvailable == 0 && (iAvailable = b()) == 0) {
                return 0L;
            }
            long jMin = Math.min(iAvailable, j);
            MultipartStream multipartStream = MultipartStream.this;
            multipartStream.g = (int) (((long) multipartStream.g) + jMin);
            return jMin;
        }

        public void close(boolean z) throws IOException {
            if (this.d) {
                return;
            }
            if (!z) {
                while (true) {
                    int iAvailable = available();
                    if (iAvailable == 0 && (iAvailable = b()) == 0) {
                        break;
                    } else {
                        skip(iAvailable);
                    }
                }
            } else {
                this.d = true;
                MultipartStream.this.a.close();
            }
            this.d = true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.d) {
                throw new FileItemStream.ItemSkippedException();
            }
            if (i2 == 0) {
                return 0;
            }
            int iAvailable = available();
            if (iAvailable == 0 && (iAvailable = b()) == 0) {
                return -1;
            }
            int iMin = Math.min(iAvailable, i2);
            System.arraycopy(MultipartStream.this.f, MultipartStream.this.g, bArr, i, iMin);
            MultipartStream.this.g += iMin;
            this.a += (long) iMin;
            return iMin;
        }
    }

    public static class MalformedStreamException extends IOException {
        private static final long serialVersionUID = 6466926458059796677L;

        public MalformedStreamException() {
        }

        public MalformedStreamException(String str) {
            super(str);
        }
    }

    public static class ProgressNotifier {
        private final ProgressListener a;
        private final long b;
        private long c;
        private int d;

        public ProgressNotifier(ProgressListener progressListener, long j) {
            this.a = progressListener;
            this.b = j;
        }

        private void c() {
            ProgressListener progressListener = this.a;
            if (progressListener != null) {
                progressListener.update(this.c, this.b, this.d);
            }
        }

        public void a(int i) {
            this.c += (long) i;
            c();
        }

        public void b() {
            this.d++;
            c();
        }
    }

    @Deprecated
    public MultipartStream() {
        this((InputStream) null, (byte[]) null, (ProgressNotifier) null);
    }

    public static boolean arrayequals(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int e(MultipartStream multipartStream) {
        int i = multipartStream.g;
        multipartStream.g = i + 1;
        return i;
    }

    public int discardBodyData() throws IOException {
        return readBodyData(null);
    }

    public int findByte(byte b, int i) {
        while (i < this.h) {
            if (this.f[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int findSeparator() {
        int i = this.h - this.b;
        int i2 = this.g;
        int i3 = 0;
        while (i2 <= i && i3 != this.b) {
            int iFindByte = findByte(this.d[0], i2);
            if (iFindByte == -1 || iFindByte > i) {
                return -1;
            }
            i3 = 1;
            while (i3 < this.b && this.f[iFindByte + i3] == this.d[i3]) {
                i3++;
            }
            i2 = iFindByte + 1;
        }
        if (i3 == this.b) {
            return i2 - 1;
        }
        return -1;
    }

    public String getHeaderEncoding() {
        return this.i;
    }

    public ItemInputStream k() {
        return new ItemInputStream();
    }

    public int readBodyData(OutputStream outputStream) throws IOException {
        return (int) Streams.copy(k(), outputStream, false);
    }

    public boolean readBoundary() throws MalformedStreamException, FileUploadBase.FileUploadIOException {
        byte[] bArr = new byte[2];
        this.g += this.b;
        try {
            bArr[0] = readByte();
            if (bArr[0] == 10) {
                return true;
            }
            bArr[1] = readByte();
            if (arrayequals(bArr, STREAM_TERMINATOR, 2)) {
                return false;
            }
            if (arrayequals(bArr, FIELD_SEPARATOR, 2)) {
                return true;
            }
            throw new MalformedStreamException("Unexpected characters follow a boundary");
        } catch (FileUploadBase.FileUploadIOException e) {
            throw e;
        } catch (IOException unused) {
            throw new MalformedStreamException("Stream ended unexpectedly");
        }
    }

    public byte readByte() throws IOException {
        if (this.g == this.h) {
            this.g = 0;
            int i = this.a.read(this.f, 0, this.e);
            this.h = i;
            if (i == -1) {
                throw new IOException("No more data is available");
            }
            ProgressNotifier progressNotifier = this.j;
            if (progressNotifier != null) {
                progressNotifier.a(i);
            }
        }
        byte[] bArr = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        return bArr[i2];
    }

    public String readHeaders() throws MalformedStreamException, FileUploadBase.FileUploadIOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = HEADER_SEPARATOR;
            if (i >= bArr.length) {
                String str = this.i;
                if (str == null) {
                    return byteArrayOutputStream.toString();
                }
                try {
                    return byteArrayOutputStream.toString(str);
                } catch (UnsupportedEncodingException unused) {
                    return byteArrayOutputStream.toString();
                }
            }
            try {
                byte b = readByte();
                i2++;
                if (i2 > 10240) {
                    throw new MalformedStreamException(String.format("Header section has more than %s bytes (maybe it is not properly terminated)", 10240));
                }
                i = b == bArr[i] ? i + 1 : 0;
                byteArrayOutputStream.write(b);
            } catch (FileUploadBase.FileUploadIOException e) {
                throw e;
            } catch (IOException unused2) {
                throw new MalformedStreamException("Stream ended unexpectedly");
            }
        }
    }

    public void setBoundary(byte[] bArr) throws IllegalBoundaryException {
        int length = bArr.length;
        int i = this.b;
        byte[] bArr2 = BOUNDARY_PREFIX;
        if (length != i - bArr2.length) {
            throw new IllegalBoundaryException("The length of a boundary token can not be changed");
        }
        System.arraycopy(bArr, 0, this.d, bArr2.length, bArr.length);
    }

    public void setHeaderEncoding(String str) {
        this.i = str;
    }

    public boolean skipPreamble() throws IOException {
        byte[] bArr = this.d;
        System.arraycopy(bArr, 2, bArr, 0, bArr.length - 2);
        this.b = this.d.length - 2;
        try {
            discardBodyData();
            return readBoundary();
        } catch (MalformedStreamException unused) {
            return false;
        } finally {
            byte[] bArr2 = this.d;
            System.arraycopy(bArr2, 0, bArr2, 2, bArr2.length - 2);
            byte[] bArr3 = this.d;
            this.b = bArr3.length;
            bArr3[0] = 13;
            bArr3[1] = 10;
        }
    }

    @Deprecated
    public MultipartStream(InputStream inputStream, byte[] bArr, int i) {
        this(inputStream, bArr, i, null);
    }

    public MultipartStream(InputStream inputStream, byte[] bArr, int i, ProgressNotifier progressNotifier) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = BOUNDARY_PREFIX;
            int length2 = length + bArr2.length;
            this.b = length2;
            if (i >= length2 + 1) {
                this.a = inputStream;
                int iMax = Math.max(i, length2 * 2);
                this.e = iMax;
                this.f = new byte[iMax];
                this.j = progressNotifier;
                byte[] bArr3 = new byte[this.b];
                this.d = bArr3;
                this.c = bArr3.length;
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, 0, this.d, bArr2.length, bArr.length);
                this.g = 0;
                this.h = 0;
                return;
            }
            throw new IllegalArgumentException("The buffer size specified for the MultipartStream is too small");
        }
        throw new IllegalArgumentException("boundary may not be null");
    }

    public MultipartStream(InputStream inputStream, byte[] bArr, ProgressNotifier progressNotifier) {
        this(inputStream, bArr, 4096, progressNotifier);
    }

    @Deprecated
    public MultipartStream(InputStream inputStream, byte[] bArr) {
        this(inputStream, bArr, 4096, null);
    }
}
