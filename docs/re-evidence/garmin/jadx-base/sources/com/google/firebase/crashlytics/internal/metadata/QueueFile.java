package com.google.firebase.crashlytics.internal.metadata;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import j20.x;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
class QueueFile implements Closeable {
    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger(QueueFile.class.getName());
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;

    public static class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final int position;

        public Element(int i14, int i15) {
            this.position = i14;
            this.length = i15;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getClass().getSimpleName());
            sb3.append("[position = ");
            sb3.append(this.position);
            sb3.append(", length = ");
            return j.q(sb3, this.length, "]");
        }
    }

    public interface ElementReader {
        void read(InputStream inputStream, int i14);
    }

    public QueueFile(File file) throws IOException {
        this.buffer = new byte[16];
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        readHeader();
    }

    private void expandIfNecessary(int i14) throws IOException {
        int i15 = i14 + 4;
        int iRemainingBytes = remainingBytes();
        if (iRemainingBytes >= i15) {
            return;
        }
        int i16 = this.fileLength;
        do {
            iRemainingBytes += i16;
            i16 <<= 1;
        } while (iRemainingBytes < i15);
        setLength(i16);
        Element element = this.last;
        int iWrapPosition = wrapPosition(element.position + 4 + element.length);
        if (iWrapPosition < this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            long j8 = iWrapPosition - 4;
            if (channel.transferTo(16L, j8, channel) != j8) {
                h.q("Copied insufficient number of bytes!");
                return;
            }
        }
        int i17 = this.last.position;
        int i18 = this.first.position;
        if (i17 < i18) {
            int i19 = (this.fileLength + i17) - 16;
            writeHeader(i16, this.elementCount, i18, i19);
            this.last = new Element(i19, this.last.length);
        } else {
            writeHeader(i16, this.elementCount, i18, i17);
        }
        this.fileLength = i16;
    }

    private static void initialize(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileOpen = open(file2);
        try {
            randomAccessFileOpen.setLength(4096L);
            randomAccessFileOpen.seek(0L);
            byte[] bArr = new byte[16];
            writeInts(bArr, 4096, 0, 0, 0);
            randomAccessFileOpen.write(bArr);
            randomAccessFileOpen.close();
            if (file2.renameTo(file)) {
                return;
            }
            h.C("Rename failed!");
        } catch (Throwable th3) {
            randomAccessFileOpen.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T nonNull(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        x.l(str);
        return null;
    }

    private static RandomAccessFile open(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private Element readElement(int i14) throws IOException {
        if (i14 == 0) {
            return Element.NULL;
        }
        this.raf.seek(i14);
        return new Element(i14, this.raf.readInt());
    }

    private void readHeader() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        int i14 = readInt(this.buffer, 0);
        this.fileLength = i14;
        if (i14 <= this.raf.length()) {
            this.elementCount = readInt(this.buffer, 4);
            int i15 = readInt(this.buffer, 8);
            int i16 = readInt(this.buffer, 12);
            this.first = readElement(i15);
            this.last = readElement(i16);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
    }

    private static int readInt(byte[] bArr, int i14) {
        return ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 24) + ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[i14 + 3] & UnsignedBytes.MAX_VALUE);
    }

    private int remainingBytes() {
        return this.fileLength - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ringRead(int i14, byte[] bArr, int i15, int i16) throws IOException {
        int iWrapPosition = wrapPosition(i14);
        int i17 = iWrapPosition + i16;
        int i18 = this.fileLength;
        RandomAccessFile randomAccessFile = this.raf;
        if (i17 <= i18) {
            randomAccessFile.seek(iWrapPosition);
            this.raf.readFully(bArr, i15, i16);
            return;
        }
        int i19 = i18 - iWrapPosition;
        randomAccessFile.seek(iWrapPosition);
        this.raf.readFully(bArr, i15, i19);
        this.raf.seek(16L);
        this.raf.readFully(bArr, i15 + i19, i16 - i19);
    }

    private void ringWrite(int i14, byte[] bArr, int i15, int i16) throws IOException {
        int iWrapPosition = wrapPosition(i14);
        int i17 = iWrapPosition + i16;
        int i18 = this.fileLength;
        RandomAccessFile randomAccessFile = this.raf;
        if (i17 <= i18) {
            randomAccessFile.seek(iWrapPosition);
            this.raf.write(bArr, i15, i16);
            return;
        }
        int i19 = i18 - iWrapPosition;
        randomAccessFile.seek(iWrapPosition);
        this.raf.write(bArr, i15, i19);
        this.raf.seek(16L);
        this.raf.write(bArr, i15 + i19, i16 - i19);
    }

    private void setLength(int i14) throws IOException {
        this.raf.setLength(i14);
        this.raf.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int wrapPosition(int i14) {
        int i15 = this.fileLength;
        return i14 < i15 ? i14 : (i14 + 16) - i15;
    }

    private void writeHeader(int i14, int i15, int i16, int i17) throws IOException {
        writeInts(this.buffer, i14, i15, i16, i17);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
    }

    private static void writeInt(byte[] bArr, int i14, int i15) {
        bArr[i14] = (byte) (i15 >> 24);
        bArr[i14 + 1] = (byte) (i15 >> 16);
        bArr[i14 + 2] = (byte) (i15 >> 8);
        bArr[i14 + 3] = (byte) i15;
    }

    private static void writeInts(byte[] bArr, int... iArr) {
        int i14 = 0;
        for (int i15 : iArr) {
            writeInt(bArr, i14, i15);
            i14 += 4;
        }
    }

    public synchronized void add(byte[] bArr, int i14, int i15) {
        int iWrapPosition;
        try {
            nonNull(bArr, "buffer");
            if ((i14 | i15) < 0 || i15 > bArr.length - i14) {
                throw new IndexOutOfBoundsException();
            }
            expandIfNecessary(i15);
            boolean zIsEmpty = isEmpty();
            if (zIsEmpty) {
                iWrapPosition = 16;
            } else {
                Element element = this.last;
                iWrapPosition = wrapPosition(element.position + 4 + element.length);
            }
            Element element2 = new Element(iWrapPosition, i15);
            writeInt(this.buffer, 0, i15);
            ringWrite(element2.position, this.buffer, 0, 4);
            ringWrite(element2.position + 4, bArr, i14, i15);
            writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element2.position : this.first.position, element2.position);
            this.last = element2;
            this.elementCount++;
            if (zIsEmpty) {
                this.first = element2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void clear() {
        try {
            writeHeader(4096, 0, 0, 0);
            this.elementCount = 0;
            Element element = Element.NULL;
            this.first = element;
            this.last = element;
            if (this.fileLength > 4096) {
                setLength(4096);
            }
            this.fileLength = 4096;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.raf.close();
    }

    public synchronized void forEach(ElementReader elementReader) {
        int iWrapPosition = this.first.position;
        for (int i14 = 0; i14 < this.elementCount; i14++) {
            Element element = readElement(iWrapPosition);
            elementReader.read(new ElementInputStream(element), element.length);
            iWrapPosition = wrapPosition(element.position + 4 + element.length);
        }
    }

    public boolean hasSpaceFor(int i14, int i15) {
        return (usedBytes() + 4) + i14 <= i15;
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    public synchronized byte[] peek() {
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i14 = element.length;
        byte[] bArr = new byte[i14];
        ringRead(element.position + 4, bArr, 0, i14);
        return bArr;
    }

    public synchronized void remove() {
        try {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.elementCount == 1) {
                clear();
            } else {
                Element element = this.first;
                int iWrapPosition = wrapPosition(element.position + 4 + element.length);
                ringRead(iWrapPosition, this.buffer, 0, 4);
                int i14 = readInt(this.buffer, 0);
                writeHeader(this.fileLength, this.elementCount - 1, iWrapPosition, this.last.position);
                this.elementCount--;
                this.first = new Element(iWrapPosition, i14);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized int size() {
        return this.elementCount;
    }

    public String toString() {
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append("[fileLength=");
        sb3.append(this.fileLength);
        sb3.append(", size=");
        sb3.append(this.elementCount);
        sb3.append(", first=");
        sb3.append(this.first);
        sb3.append(", last=");
        sb3.append(this.last);
        sb3.append(", element lengths=[");
        try {
            forEach(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1
                boolean first = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i14) {
                    if (this.first) {
                        this.first = false;
                    } else {
                        sb3.append(", ");
                    }
                    sb3.append(i14);
                }
            });
        } catch (IOException e4) {
            LOGGER.log(Level.WARNING, "read error", (Throwable) e4);
        }
        sb3.append("]]");
        return sb3.toString();
    }

    public int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        Element element = this.last;
        int i14 = element.position;
        int i15 = this.first.position;
        return i14 >= i15 ? (i14 - i15) + 4 + element.length + 16 : (((i14 + 4) + element.length) + this.fileLength) - i15;
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.buffer = new byte[16];
        this.raf = randomAccessFile;
        readHeader();
    }

    public synchronized void peek(ElementReader elementReader) {
        if (this.elementCount > 0) {
            elementReader.read(new ElementInputStream(this.first), this.first.length);
        }
    }

    public final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;

        private ElementInputStream(Element element) {
            this.position = QueueFile.this.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i14, int i15) throws IOException {
            QueueFile.nonNull(bArr, "buffer");
            if ((i14 | i15) < 0 || i15 > bArr.length - i14) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i16 = this.remaining;
            if (i16 <= 0) {
                return -1;
            }
            if (i15 > i16) {
                i15 = i16;
            }
            QueueFile.this.ringRead(this.position, bArr, i14, i15);
            this.position = QueueFile.this.wrapPosition(this.position + i15);
            this.remaining -= i15;
            return i15;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.this.raf.seek(this.position);
            int i14 = QueueFile.this.raf.read();
            this.position = QueueFile.this.wrapPosition(this.position + 1);
            this.remaining--;
            return i14;
        }
    }

    public void add(byte[] bArr) {
        add(bArr, 0, bArr.length);
    }
}
