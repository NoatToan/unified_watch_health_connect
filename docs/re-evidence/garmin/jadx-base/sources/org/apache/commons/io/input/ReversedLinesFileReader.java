package org.apache.commons.io.input;

import am.j;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ReversedLinesFileReader implements Closeable {
    private static final int DEFAULT_BLOCK_SIZE = 8192;
    private static final String EMPTY_STRING = "";
    private final int avoidNewlineSplitBufferSize;
    private final int blockSize;
    private final int byteDecrement;
    private final SeekableByteChannel channel;
    private FilePart currentFilePart;
    private final Charset encoding;
    private final byte[][] newLineSequences;
    private final long totalBlockCount;
    private final long totalByteLength;
    private boolean trailingNewlineOfFileSkipped;

    public class FilePart {
        private int currentLastBytePos;
        private final byte[] data;
        private byte[] leftOver;

        /* JADX INFO: renamed from: no, reason: collision with root package name */
        private final long f133447no;

        private FilePart(long j8, int i14, byte[] bArr) throws IOException {
            this.f133447no = j8;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i14];
            this.data = bArr2;
            long j14 = (j8 - 1) * ((long) ReversedLinesFileReader.this.blockSize);
            if (j8 > 0) {
                ReversedLinesFileReader.this.channel.position(j14);
                if (ReversedLinesFileReader.this.channel.read(ByteBuffer.wrap(bArr2, 0, i14)) != i14) {
                    h.z("Count of requested bytes and actually read bytes don't match");
                    throw null;
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i14, bArr.length);
            }
            this.currentLastBytePos = bArr2.length - 1;
            this.leftOver = null;
        }

        private void createLeftOver() {
            int i14 = this.currentLastBytePos + 1;
            if (i14 > 0) {
                byte[] bArr = new byte[i14];
                this.leftOver = bArr;
                System.arraycopy(this.data, 0, bArr, 0, i14);
            } else {
                this.leftOver = null;
            }
            this.currentLastBytePos = -1;
        }

        private int getNewLineMatchByteCount(byte[] bArr, int i14) {
            for (byte[] bArr2 : ReversedLinesFileReader.this.newLineSequences) {
                boolean z14 = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i14 + length) - (bArr2.length - 1);
                    z14 &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z14) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String readLine() {
            String str;
            byte[] bArr;
            boolean z14 = this.f133447no == 1;
            int i14 = this.currentLastBytePos;
            while (true) {
                if (i14 > -1) {
                    if (z14 || i14 >= ReversedLinesFileReader.this.avoidNewlineSplitBufferSize) {
                        int newLineMatchByteCount = getNewLineMatchByteCount(this.data, i14);
                        if (newLineMatchByteCount > 0) {
                            int i15 = i14 + 1;
                            int i16 = (this.currentLastBytePos - i15) + 1;
                            if (i16 < 0) {
                                h.z(j.h(i16, "Unexpected negative line length="));
                                return null;
                            }
                            byte[] bArr2 = new byte[i16];
                            System.arraycopy(this.data, i15, bArr2, 0, i16);
                            str = new String(bArr2, ReversedLinesFileReader.this.encoding);
                            this.currentLastBytePos = i14 - newLineMatchByteCount;
                            break;
                        }
                        i14 -= ReversedLinesFileReader.this.byteDecrement;
                        if (i14 < 0) {
                            createLeftOver();
                        }
                    } else {
                        createLeftOver();
                    }
                }
                str = null;
                break;
            }
            if (!z14 || (bArr = this.leftOver) == null) {
                return str;
            }
            String str2 = new String(bArr, ReversedLinesFileReader.this.encoding);
            this.leftOver = null;
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FilePart rollOver() {
            if (this.currentLastBytePos > -1) {
                e.i(this.currentLastBytePos, "Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=");
                return null;
            }
            long j8 = this.f133447no;
            if (j8 > 1) {
                ReversedLinesFileReader reversedLinesFileReader = ReversedLinesFileReader.this;
                return reversedLinesFileReader.new FilePart(j8 - 1, reversedLinesFileReader.blockSize, this.leftOver);
            }
            byte[] bArr = this.leftOver;
            if (bArr == null) {
                return null;
            }
            h.z("Unexpected leftover of the last block: leftOverOfThisFilePart=".concat(new String(bArr, ReversedLinesFileReader.this.encoding)));
            return null;
        }
    }

    public ReversedLinesFileReader(Path path, int i14, Charset charset) throws IOException {
        int i15;
        this.blockSize = i14;
        Charset charset2 = Charsets.toCharset(charset);
        this.encoding = charset2;
        if (charset2.newEncoder().maxBytesPerChar() == 1.0f || charset2 == StandardCharsets.UTF_8 || charset2 == Charset.forName("Shift_JIS") || charset2 == Charset.forName("windows-31j") || charset2 == Charset.forName("x-windows-949") || charset2 == Charset.forName("gbk") || charset2 == Charset.forName("x-windows-950")) {
            this.byteDecrement = 1;
        } else {
            if (charset2 != StandardCharsets.UTF_16BE && charset2 != StandardCharsets.UTF_16LE) {
                if (charset2 == StandardCharsets.UTF_16) {
                    throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                }
                throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
            }
            this.byteDecrement = 2;
        }
        byte[][] bArr = {IOUtils.LINE_SEPARATOR_WINDOWS.getBytes(charset2), "\n".getBytes(charset2), StringUtils.CR.getBytes(charset2)};
        this.newLineSequences = bArr;
        this.avoidNewlineSplitBufferSize = bArr[0].length;
        SeekableByteChannel seekableByteChannelNewByteChannel = Files.newByteChannel(path, StandardOpenOption.READ);
        this.channel = seekableByteChannelNewByteChannel;
        long size = seekableByteChannelNewByteChannel.size();
        this.totalByteLength = size;
        long j8 = i14;
        int i16 = (int) (size % j8);
        if (i16 <= 0) {
            this.totalBlockCount = size / j8;
            i15 = size > 0 ? i14 : i15;
            this.currentFilePart = new FilePart(this.totalBlockCount, i15, null);
        }
        this.totalBlockCount = (size / j8) + 1;
        i15 = i16;
        this.currentFilePart = new FilePart(this.totalBlockCount, i15, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    public String readLine() {
        String line = this.currentFilePart.readLine();
        while (line == null) {
            FilePart filePartRollOver = this.currentFilePart.rollOver();
            this.currentFilePart = filePartRollOver;
            if (filePartRollOver == null) {
                break;
            }
            line = filePartRollOver.readLine();
        }
        if (!"".equals(line) || this.trailingNewlineOfFileSkipped) {
            return line;
        }
        this.trailingNewlineOfFileSkipped = true;
        return readLine();
    }

    public List<String> readLines(int i14) {
        if (i14 < 0) {
            h.s("lineCount < 0");
            return null;
        }
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            String line = readLine();
            if (line == null) {
                break;
            }
            arrayList.add(line);
        }
        return arrayList;
    }

    public String toString(int i14) {
        List<String> lines = readLines(i14);
        Collections.reverse(lines);
        if (lines.isEmpty()) {
            return "";
        }
        return String.join(System.lineSeparator(), lines) + System.lineSeparator();
    }

    public ReversedLinesFileReader(File file, Charset charset) {
        this(file.toPath(), charset);
    }

    public ReversedLinesFileReader(File file, int i14, Charset charset) {
        this(file.toPath(), i14, charset);
    }

    public ReversedLinesFileReader(File file, int i14, String str) {
        this(file.toPath(), i14, str);
    }

    public ReversedLinesFileReader(Path path, Charset charset) {
        this(path, 8192, charset);
    }

    @Deprecated
    public ReversedLinesFileReader(File file) {
        this(file, 8192, Charset.defaultCharset());
    }

    public ReversedLinesFileReader(Path path, int i14, String str) {
        this(path, i14, Charsets.toCharset(str));
    }
}
