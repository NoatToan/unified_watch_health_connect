package com.beaglebuddy.mp3;

import com.beaglebuddy.ape.APETag;
import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.id3.enums.ID3TagVersion;
import com.beaglebuddy.id3.v1.ID3v1Tag;
import com.beaglebuddy.id3.v23.ID3v23Tag;
import com.beaglebuddy.id3.v23.ID3v23TagHeader;
import com.beaglebuddy.id3.v24.ID3v24Tag;
import com.beaglebuddy.id3.v24.ID3v24TagFooter;
import com.beaglebuddy.id3.v24.ID3v24TagHeader;
import com.beaglebuddy.lyrics3.Lyrics3v1Tag;
import com.beaglebuddy.lyrics3.Lyrics3v2Tag;
import com.beaglebuddy.mpeg.MPEGFrame;
import com.beaglebuddy.mpeg.enums.BitrateType;
import com.beaglebuddy.mpeg.enums.Layer;
import com.beaglebuddy.mpeg.enums.MPEGVersion;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class MP3Base extends MP3BaseID3v24 {
    public APETag apeTag;
    public int audioSize;
    public int bitrate;
    public BitrateType bitrateType;
    public int fileSize;
    public ID3v1Tag id3v1Tag;
    public Lyrics3v1Tag lyrics3v1Tag;
    public Lyrics3v2Tag lyrics3v2Tag;
    public File mp3File;
    public URL mp3Url;
    public MPEGFrame mpegFrame;
    public int tagSize;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ID3TagVersion.values().length];
            a = iArr;
            try {
                iArr[ID3TagVersion.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ID3TagVersion.ID3V2_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ID3TagVersion.ID3V2_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ID3TagVersion.ID3V2_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ID3TagVersion.ID3V2_4_FOOTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MP3Base(String str) throws IOException {
        this(new File(str));
    }

    private ID3v24TagFooter a() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        ID3v24TagFooter iD3v24TagFooter = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(this.mp3File));
                try {
                    long length = this.mp3File.length() - 10;
                    if (i(bufferedInputStream, length) == length) {
                        iD3v24TagFooter = new ID3v24TagFooter(bufferedInputStream);
                    }
                } catch (ParseException unused) {
                    if (bufferedInputStream != null) {
                    }
                    return iD3v24TagFooter;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (ParseException unused3) {
                bufferedInputStream = null;
            } catch (Throwable th3) {
                bufferedInputStream = null;
                th = th3;
            }
            bufferedInputStream.close();
        } catch (Exception unused4) {
        }
        return iD3v24TagFooter;
    }

    private void b() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(this.mp3File, "r");
                try {
                    this.apeTag = new APETag(randomAccessFile);
                    randomAccessFile.close();
                } catch (ParseException unused) {
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 == null) {
                        return;
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused2) {
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 == null) {
                        return;
                    }
                    randomAccessFile2.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
            }
        } catch (ParseException unused5) {
        } catch (FileNotFoundException unused6) {
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    private int c(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        int frameSize = this.tagSize;
        this.bitrateType = BitrateType.CBR;
        this.bitrate = -1;
        if (inputStream.read(bArr) != 4) {
            throw new IOException("Unable to read the 1st mpeg audio frame from the mp3 file.");
        }
        boolean z = false;
        do {
            try {
                MPEGFrame mPEGFrame = new MPEGFrame(bArr, inputStream);
                this.mpegFrame = mPEGFrame;
                mPEGFrame.setFilePosition(frameSize);
                frameSize += this.mpegFrame.getMPEGFrameHeader().getFrameSize();
                if ((this.mpegFrame.getXingHeader() != null && this.mpegFrame.getXingHeader().getBitrateType() == BitrateType.VBR) || this.mpegFrame.getVBRIHeader() != null) {
                    this.bitrateType = BitrateType.VBR;
                }
                new MPEGFrame(inputStream).setFilePosition(frameSize);
                try {
                    if (this.bitrateType == BitrateType.CBR) {
                        this.bitrate = this.mpegFrame.getMPEGFrameHeader().getBitrate();
                    }
                    z = true;
                } catch (ParseException unused) {
                    z = true;
                    byte[] bArr2 = new byte[1];
                    if (inputStream.read(bArr2) != 1) {
                        throw new IOException("Unable to read the 1st mpeg audio frame from the mp3 file.");
                    }
                    bArr[0] = bArr[1];
                    bArr[1] = bArr[2];
                    bArr[2] = bArr[3];
                    bArr[3] = bArr2[0];
                    frameSize++;
                }
            } catch (ParseException unused2) {
            }
        } while (!z);
        return frameSize - this.tagSize;
    }

    private boolean d(InputStream inputStream) throws IOException {
        this.id3v23Tag = null;
        this.id3v24Tag = null;
        int i = a.a[ID3TagVersion.readVersion(inputStream).ordinal()];
        if (i != 1) {
            if (i == 2) {
                throw new IOException("An ID3v2.2 tag was found in the mp3 file but that version is not currently supported.");
            }
            if (i == 3) {
                this.id3v23Tag = new ID3v23Tag(inputStream);
            } else if (i == 4) {
                this.id3v24Tag = new ID3v24Tag(inputStream);
            } else if (i == 5) {
                throw new IOException("An ID3v2.4 footer tag was found at the beginning of the mp3 file but that is not currently supported.");
            }
            return false;
        }
        ID3v23Tag iD3v23Tag = new ID3v23Tag();
        this.id3v23Tag = iD3v23Tag;
        this.tagSize = 0;
        iD3v23Tag.setPadding(0);
        File file = this.mp3File;
        if (file == null) {
            return true;
        }
        try {
            long length = (file.length() - 5) - 128;
            if (i(inputStream, length) == length) {
                ID3v1Tag iD3v1Tag = new ID3v1Tag(inputStream, (int) length, getPath());
                if (iD3v1Tag.getAlbum().length() != 0) {
                    setV23Album(iD3v1Tag.getAlbum());
                }
                if (iD3v1Tag.getArtist().length() != 0) {
                    setV23Band(iD3v1Tag.getArtist());
                }
                if (iD3v1Tag.getTitle().length() != 0) {
                    setV23Title(iD3v1Tag.getTitle());
                }
                if (iD3v1Tag.getTrack() != 0) {
                    setV23Track(iD3v1Tag.getTrack());
                }
                if (iD3v1Tag.getGenreAsString().length() != 0) {
                    setV23MusicType("(" + (iD3v1Tag.getGenre() & 255) + ")");
                }
                if (iD3v1Tag.getYear().length() == 4) {
                    setV23Year(Integer.parseInt(iD3v1Tag.getYear()));
                }
            }
        } catch (Exception unused) {
        }
        inputStream.close();
        this.audioSize = (int) this.mp3File.length();
        saveID3v23();
        return true;
    }

    private void e() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(this.mp3File, "r");
                try {
                    this.id3v1Tag = new ID3v1Tag(randomAccessFile);
                    randomAccessFile.close();
                } catch (ParseException unused) {
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 == null) {
                        return;
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused2) {
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 == null) {
                        return;
                    }
                    randomAccessFile2.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused4) {
            }
        } catch (ParseException unused5) {
        } catch (FileNotFoundException unused6) {
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r0 != 0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void f() throws Throwable {
        ?? r1;
        Throwable th;
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.mp3File, "r");
                    try {
                        Lyrics3v2Tag lyrics3v2Tag = new Lyrics3v2Tag(randomAccessFile);
                        this.lyrics3v2Tag = lyrics3v2Tag;
                        randomAccessFile.close();
                        r0 = lyrics3v2Tag;
                    } catch (ParseException unused) {
                        r0 = randomAccessFile;
                        try {
                            this.lyrics3v1Tag = new Lyrics3v1Tag(r0);
                        } catch (ParseException | FileNotFoundException unused2) {
                        }
                    } catch (FileNotFoundException unused3) {
                        r0 = randomAccessFile;
                        if (r0 == 0) {
                            return;
                        }
                        r0.close();
                        r0 = r0;
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = randomAccessFile;
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                }
            } catch (ParseException unused6) {
            } catch (FileNotFoundException unused7) {
            }
        } catch (Throwable th3) {
            r1 = r0;
            th = th3;
        }
    }

    private static void g(File file, File file2) throws IOException {
        if (!file2.delete()) {
            throw new IOException("Unable to delete the file " + file2.getPath());
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("Unable to rename the file " + file.getPath() + " to " + file2.getPath() + ".");
    }

    private void h(int i, int i2, int i3) throws IOException {
        File file = new File(this.mp3File.getPath() + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileInputStream fileInputStream = new FileInputStream(this.mp3File);
        byte[] bArr = new byte[2048];
        ID3v23Tag iD3v23Tag = this.id3v23Tag;
        if (iD3v23Tag != null) {
            iD3v23Tag.setPadding(i3);
            int i4 = i2 + i3;
            ID3v23TagHeader header = this.id3v23Tag.getHeader();
            header.setTagSize(i4 - 10);
            header.setBuffer();
            this.id3v23Tag.save(fileOutputStream);
        } else {
            ID3v24Tag iD3v24Tag = this.id3v24Tag;
            if (iD3v24Tag != null) {
                iD3v24Tag.setPadding(i3);
                int i5 = i2 + i3;
                ID3v24TagHeader header2 = this.id3v24Tag.getHeader();
                header2.setTagSize(i5 - 10);
                header2.setBuffer();
                this.id3v24Tag.save(fileOutputStream);
            }
        }
        i(fileInputStream, i);
        int i6 = 0;
        while (true) {
            int i7 = fileInputStream.read(bArr);
            if (i7 == -1) {
                break;
            }
            i6 += i7;
            fileOutputStream.write(bArr, 0, i7);
        }
        fileOutputStream.close();
        fileInputStream.close();
        if (i6 == this.audioSize) {
            g(file, this.mp3File);
            return;
        }
        throw new IOException("Error saving the audio portion.  Expected " + this.audioSize + " bytes, but saved " + i6 + " bytes.");
    }

    private static long i(InputStream inputStream, long j) throws IOException {
        long j2 = 0;
        while (j > 0) {
            long jSkip = inputStream.skip(j);
            if (jSkip <= 0) {
                if (jSkip != 0) {
                    throw new IOException("skip() returned a negative value, " + jSkip + ".");
                }
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j -= jSkip;
            j2 += jSkip;
        }
        return j2;
    }

    public int calculateAudioDuration() {
        if (this.bitrate == -1 && this.bitrateType == BitrateType.VBR) {
            try {
                validateMPEGFrames();
            } catch (IOException unused) {
            }
        }
        int i = this.bitrate;
        if (i == 0) {
            return 0;
        }
        return ((this.audioSize * 8) / 1000) / i;
    }

    public void displayErrors(PrintStream printStream) {
        List<String> errors = getErrors();
        if (errors.size() != 0) {
            printStream.println(getPath() + " had " + errors.size() + " invalid frames");
            Iterator<String> it2 = errors.iterator();
            while (it2.hasNext()) {
                printStream.println("   " + it2.next());
            }
        }
    }

    public APETag getAPETag() {
        return this.apeTag;
    }

    public List<String> getErrors() {
        return this.id3v23Tag != null ? getV23Errors() : getV24Errors();
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public MPEGFrame getFirstMpegFrame() {
        return this.mpegFrame;
    }

    public ID3v1Tag getID3v1Tag() {
        return this.id3v1Tag;
    }

    public ID3v24Tag getID3v24TagAtEnd() throws Throwable {
        ID3v24TagFooter iD3v24TagFooterA = a();
        BufferedInputStream bufferedInputStream = null;
        iD3v24Tag = null;
        ID3v24Tag iD3v24Tag = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(this.mp3File));
            try {
                long length = this.mp3File.length() - ((long) ((iD3v24TagFooterA.getTagSize() + 10) + 10));
                if (i(bufferedInputStream2, length) == length && ID3TagVersion.readVersion(bufferedInputStream2) == ID3TagVersion.ID3V2_4) {
                    iD3v24Tag = new ID3v24Tag(bufferedInputStream2);
                }
                try {
                    bufferedInputStream2.close();
                } catch (Exception unused) {
                }
                return iD3v24Tag;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public int getID3v2xPadding() {
        ID3v23Tag iD3v23Tag = this.id3v23Tag;
        return iD3v23Tag != null ? iD3v23Tag.getPadding().length : this.id3v24Tag.getPadding().length;
    }

    public Lyrics3v1Tag getLyrics3v1Tag() {
        return this.lyrics3v1Tag;
    }

    public Lyrics3v2Tag getLyrics3v2Tag() {
        return this.lyrics3v2Tag;
    }

    public String getPath() {
        File file = this.mp3File;
        if (file != null) {
            return file.getPath();
        }
        URL url = this.mp3Url;
        return url != null ? url.toExternalForm() : "input stream";
    }

    public String getReadOnlyErrorMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("The mp3 song ");
        sb.append(this.id3v23Tag != null ? getV23Title() : getV24Title());
        sb.append(" was loaded from a URL, ");
        sb.append(getPath());
        sb.append(", and is therefore read only.");
        return sb.toString();
    }

    public boolean hasAPETag() {
        return this.apeTag != null;
    }

    public boolean hasErrors() {
        return this.id3v23Tag != null ? hasV23Errors() : hasV24Errors();
    }

    public boolean hasID3v1Tag() {
        return this.id3v1Tag != null;
    }

    public boolean hasID3v24TagAtEnd() throws IllegalStateException, IOException {
        return a() != null;
    }

    public boolean hasLyrics3v1Tag() {
        return this.lyrics3v1Tag != null;
    }

    public boolean hasLyrics3v2Tag() {
        return this.lyrics3v2Tag != null;
    }

    public boolean isConstantBitRate() {
        return this.bitrateType == BitrateType.CBR;
    }

    public void readMP3File(File file) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                this.mp3File = file;
                boolean zD = d(bufferedInputStream2);
                this.fileSize = (int) file.length();
                ID3v23Tag iD3v23Tag = this.id3v23Tag;
                int size = iD3v23Tag != null ? iD3v23Tag.getSize() : this.id3v24Tag.getSize();
                this.tagSize = size;
                this.audioSize = this.fileSize - size;
                if (zD) {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    bufferedInputStream.skip(this.tagSize);
                } else {
                    bufferedInputStream = bufferedInputStream2;
                }
                c(bufferedInputStream);
                e();
                try {
                    bufferedInputStream.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void removeAPETag() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        File file = this.mp3File;
        if (file == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.apeTag == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("The mp3 song ");
            sb.append(this.id3v23Tag != null ? getV23Title() : getV24Title());
            sb.append(" does not contain an APE tag.");
            throw new IllegalStateException(sb.toString());
        }
        int length = (int) (file.length() - ((long) this.apeTag.getFilePosition()));
        try {
            randomAccessFile = new RandomAccessFile(this.mp3File, "rwd");
            try {
                randomAccessFile.setLength(this.apeTag.getFilePosition());
                Lyrics3v1Tag lyrics3v1Tag = this.lyrics3v1Tag;
                if (lyrics3v1Tag != null && lyrics3v1Tag.getFilePosition() > this.apeTag.getFilePosition()) {
                    this.lyrics3v1Tag = null;
                }
                Lyrics3v2Tag lyrics3v2Tag = this.lyrics3v2Tag;
                if (lyrics3v2Tag != null && lyrics3v2Tag.getFilePosition() > this.apeTag.getFilePosition()) {
                    this.lyrics3v2Tag = null;
                }
                this.audioSize -= length;
                this.fileSize = (int) this.mp3File.length();
                this.id3v1Tag = null;
                this.apeTag = null;
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    public void removeID3v1Tag() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v1Tag == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("The mp3 song ");
            sb.append(this.id3v23Tag != null ? getV23Title() : getV24Title());
            sb.append(" does not contain an ID3v1 tag.");
            throw new IllegalStateException(sb.toString());
        }
        try {
            randomAccessFile = new RandomAccessFile(this.mp3File, "rwd");
            try {
                randomAccessFile.setLength(this.fileSize + com.alipay.sdk.m.n.a.g);
                this.audioSize += com.alipay.sdk.m.n.a.g;
                this.fileSize = (int) this.mp3File.length();
                this.id3v1Tag = null;
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    public void removeID3v24TagAtEnd() throws Throwable {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        ID3v24TagFooter iD3v24TagFooterA = a();
        if (iD3v24TagFooterA == null) {
            return;
        }
        RandomAccessFile randomAccessFile = null;
        int tagSize = iD3v24TagFooterA.getTagSize() + 10 + 10;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.mp3File, "rwd");
            try {
                randomAccessFile2.setLength(this.fileSize - tagSize);
                this.audioSize -= tagSize;
                this.fileSize = (int) this.mp3File.length();
                try {
                    randomAccessFile2.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void removeLyrics3v1Tag() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        File file = this.mp3File;
        if (file == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.lyrics3v1Tag == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("The mp3 song ");
            sb.append(this.id3v23Tag != null ? getV23Title() : getV24Title());
            sb.append(" does not contain a Lyrics3v1 tag.");
            throw new IllegalStateException(sb.toString());
        }
        int length = (int) (file.length() - ((long) this.lyrics3v1Tag.getFilePosition()));
        try {
            randomAccessFile = new RandomAccessFile(this.mp3File, "rwd");
            try {
                randomAccessFile.setLength(this.lyrics3v1Tag.getFilePosition());
                APETag aPETag = this.apeTag;
                if (aPETag != null && aPETag.getFilePosition() > this.lyrics3v1Tag.getFilePosition()) {
                    this.apeTag = null;
                }
                this.audioSize -= length;
                this.fileSize = (int) this.mp3File.length();
                this.id3v1Tag = null;
                this.lyrics3v1Tag = null;
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    public void removeLyrics3v2Tag() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        File file = this.mp3File;
        if (file == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.lyrics3v2Tag == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("The mp3 song ");
            sb.append(this.id3v23Tag != null ? getV23Title() : getV24Title());
            sb.append(" does not contain a Lyrics3v2 tag.");
            throw new IllegalStateException(sb.toString());
        }
        int length = (int) (file.length() - ((long) this.lyrics3v2Tag.getFilePosition()));
        try {
            randomAccessFile = new RandomAccessFile(this.mp3File, "rwd");
            try {
                randomAccessFile.setLength(this.lyrics3v2Tag.getFilePosition());
                APETag aPETag = this.apeTag;
                if (aPETag != null && aPETag.getFilePosition() > this.lyrics3v2Tag.getFilePosition()) {
                    this.apeTag = null;
                }
                this.audioSize -= length;
                this.fileSize = (int) this.mp3File.length();
                this.id3v1Tag = null;
                this.lyrics3v2Tag = null;
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    public void saveID3v23() throws IOException {
        int i = this.audioSize;
        if (i != 0) {
            setV23AudioSize(i);
        }
        int i2 = this.tagSize;
        int length = this.id3v23Tag.getPadding().length;
        this.id3v23Tag.setBuffer();
        int size = this.id3v23Tag.getSize() - length;
        if (size < i2) {
            ID3v23TagHeader header = this.id3v23Tag.getHeader();
            this.id3v23Tag.setPadding(i2 - size);
            header.setTagSize(i2 - 10);
            header.setBuffer();
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.mp3File, "rwd");
            this.id3v23Tag.save(randomAccessFile);
            randomAccessFile.close();
        } else {
            h(i2, size, ID3v23Tag.DEFAULT_PADDING_SIZE);
        }
        this.tagSize = this.id3v23Tag.getSize();
        this.fileSize = (int) this.mp3File.length();
    }

    public void saveID3v24() throws IOException {
        ID3v24TagHeader header = this.id3v24Tag.getHeader();
        boolean zIsFooterPresent = header.isFooterPresent();
        int i = this.tagSize;
        int length = this.id3v24Tag.getPadding().length;
        this.id3v24Tag.setBuffer();
        int size = this.id3v24Tag.getSize();
        if (header.isFooterPresent()) {
            length = 0;
        }
        int i2 = size - length;
        if (i2 >= i || zIsFooterPresent) {
            h(i, i2, zIsFooterPresent ? 0 : ID3v24Tag.DEFAULT_PADDING_SIZE);
            return;
        }
        this.id3v24Tag.setPadding(i - i2);
        header.setTagSize(i - 10);
        header.setBuffer();
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.mp3File, "rwd");
        this.id3v24Tag.save(randomAccessFile);
        randomAccessFile.close();
    }

    public void setID3v2xPadding(int i) throws Throwable {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        ID3v23Tag iD3v23Tag = this.id3v23Tag;
        if (iD3v23Tag != null) {
            int length = iD3v23Tag.getPadding().length;
            this.id3v23Tag.setBuffer();
            h(this.tagSize, this.id3v23Tag.getSize() - length, i);
            readMP3File(this.mp3File);
            return;
        }
        if (this.id3v24Tag.getFooter() == null) {
            int length2 = this.id3v24Tag.getPadding().length;
            this.id3v24Tag.setBuffer();
            h(this.tagSize, this.id3v24Tag.getSize() - length2, i);
            readMP3File(this.mp3File);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("mp3 file.....: " + getPath() + "\n");
        stringBuffer.append("mp3 file size: " + this.fileSize + " bytes\n");
        stringBuffer.append("audio size...: " + this.audioSize + " bytes\n");
        stringBuffer.append("codec........: " + this.mpegFrame.getMPEGFrameHeader().getMPEGVersion() + " " + this.mpegFrame.getMPEGFrameHeader().getLayer() + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("bit rate.....: ");
        sb.append(this.bitrate);
        sb.append(" kbits/s\n");
        stringBuffer.append(sb.toString());
        stringBuffer.append("bit rate type: " + this.bitrateType + "\n");
        stringBuffer.append("frequency....: " + this.mpegFrame.getMPEGFrameHeader().getFrequency() + " hz\n");
        stringBuffer.append("channel mode.: " + this.mpegFrame.getMPEGFrameHeader().getChannelMode() + "\n");
        if (this.id3v23Tag != null) {
            stringBuffer.append("ID3v2.3 tag..: " + this.id3v23Tag + "\n");
        } else {
            stringBuffer.append("ID3v2.4 tag..: " + this.id3v24Tag + "\n");
        }
        stringBuffer.append(this.mpegFrame);
        if (this.lyrics3v2Tag != null) {
            stringBuffer.append("\n" + this.lyrics3v2Tag);
        }
        if (this.apeTag != null) {
            stringBuffer.append("\n" + this.apeTag);
        }
        if (this.id3v1Tag != null) {
            stringBuffer.append("\n" + this.id3v1Tag);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:142:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x025e  */
    public List<String> validateMPEGFrames() throws IOException {
        int bitrate;
        int i;
        boolean z;
        boolean z2;
        int i2;
        String str;
        String str2;
        String str3 = "MPEG audio frame ";
        Vector vector = new Vector();
        if (this.mp3File != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.mp3File));
            int filePosition = this.mpegFrame.getFilePosition();
            byte[] bArr = new byte[4];
            int bitrate2 = this.mpegFrame.getMPEGFrameHeader().getBitrate();
            long j = filePosition;
            try {
                try {
                    try {
                        if (bufferedInputStream.skip(j) != j) {
                            throw new IOException("Unable to skip to the 1st mpeg audio frame in the mp3 file.");
                        }
                        int size = filePosition;
                        bitrate = 0;
                        i = 1;
                        z2 = true;
                        int bitrate3 = bitrate2;
                        while (true) {
                            try {
                                try {
                                    MPEGFrame mPEGFrame = new MPEGFrame(bufferedInputStream);
                                    mPEGFrame.setFilePosition(size);
                                    size += mPEGFrame.getSize();
                                    if (mPEGFrame.getMPEGFrameHeader().getMPEGVersion() != MPEGVersion.MPEG_1 || mPEGFrame.getMPEGFrameHeader().getLayer() != Layer.III) {
                                        vector.add(str3 + i + " at file position " + size + " uses incorrect codec " + mPEGFrame.getMPEGFrameHeader().getCodec() + ".");
                                    }
                                    if (i != 1 && (mPEGFrame.getXingHeader() != null || mPEGFrame.getLAMEHeader() != null || mPEGFrame.getVBRIHeader() != null)) {
                                        vector.add(str3 + i + " at file position " + size + " contains VBR header(s).");
                                    }
                                    if (mPEGFrame.getMPEGFrameHeader().getBitrate() != bitrate3) {
                                        z2 = false;
                                    }
                                    if (mPEGFrame.getMPEGFrameHeader().getFrameSize() < 0) {
                                        throw new ParseException("Invalid MPEG audio frame size.");
                                    }
                                    bitrate3 = mPEGFrame.getMPEGFrameHeader().getBitrate();
                                    bitrate += mPEGFrame.getMPEGFrameHeader().getBitrate();
                                    str = str3;
                                } catch (Exception e) {
                                    e = e;
                                    filePosition = size;
                                    z = z2;
                                    e.printStackTrace();
                                    vector.add(getPath() + " - MPEG audio frame at file position " + filePosition + " has an error");
                                    bufferedInputStream.close();
                                    z2 = z;
                                    if (this.bitrateType == BitrateType.CBR) {
                                        i2 = -1;
                                    } else {
                                        i2 = -1;
                                    }
                                    if (this.bitrateType == BitrateType.VBR) {
                                        this.bitrate = Math.round(bitrate / i);
                                    }
                                    return vector;
                                }
                            } catch (ParseException e2) {
                                int i3 = bitrate3;
                                filePosition = size;
                                try {
                                    if (e2.getData() == null) {
                                        break;
                                    }
                                    if (!e2.getMessage().startsWith("EOF")) {
                                        String str4 = new String(e2.getData());
                                        if (str4.startsWith("TAG") || str4.equals("APET") || str4.equals("LYRI")) {
                                            break;
                                            break;
                                            break;
                                        }
                                        vector.add(str3 + i + " not found at expected file location " + filePosition + ".  Attempting to re-synch.");
                                        size = filePosition;
                                        boolean z3 = false;
                                        while (true) {
                                            if (z3) {
                                                str = str3;
                                                break;
                                            }
                                            int i4 = i3;
                                            byte[] bArr2 = new byte[1];
                                            int i5 = bufferedInputStream.read(bArr2);
                                            size++;
                                            str = str3;
                                            if (i5 == -1) {
                                                i3 = i4;
                                                break;
                                            }
                                            if (i5 != 1) {
                                                throw new IOException("Error reading MPEG audio frame " + i + " at file position " + size + ".");
                                            }
                                            bArr[0] = bArr[1];
                                            bArr[1] = bArr[2];
                                            bArr[2] = bArr[3];
                                            bArr[3] = bArr2[0];
                                            try {
                                                MPEGFrame mPEGFrame2 = new MPEGFrame(bArr, bufferedInputStream);
                                                vector.add("re-synched MPEG audio frame " + i + " at file location " + size + ".");
                                                try {
                                                    int frameSize = size + (mPEGFrame2.getMPEGFrameHeader().getFrameSize() - mPEGFrame2.getMPEGFrameHeader().getSize());
                                                    try {
                                                        int bitrate4 = mPEGFrame2.getMPEGFrameHeader().getBitrate();
                                                        try {
                                                            bitrate += mPEGFrame2.getMPEGFrameHeader().getBitrate();
                                                            i3 = bitrate4;
                                                            size = frameSize;
                                                            z3 = true;
                                                        } catch (ParseException unused) {
                                                            i3 = bitrate4;
                                                            size = frameSize;
                                                            z3 = true;
                                                            str2 = new String(e2.getData());
                                                            if (!str2.startsWith("TAG")) {
                                                                str3 = str;
                                                            }
                                                            if (!z3) {
                                                                vector.add("Unable to re-synch MPEG audio frame " + i + ".");
                                                                bufferedInputStream.close();
                                                                if (this.bitrateType == BitrateType.CBR) {
                                                                    i2 = -1;
                                                                } else {
                                                                    i2 = -1;
                                                                }
                                                                if (this.bitrateType == BitrateType.VBR) {
                                                                    this.bitrate = Math.round(bitrate / i);
                                                                }
                                                                return vector;
                                                            }
                                                            bitrate3 = i3;
                                                            i++;
                                                            str3 = str;
                                                        }
                                                    } catch (ParseException unused2) {
                                                        size = frameSize;
                                                        i3 = i4;
                                                        z3 = true;
                                                        str2 = new String(e2.getData());
                                                        if (!str2.startsWith("TAG") && !str2.equals("APET") && !str2.equals("LYRI")) {
                                                            str3 = str;
                                                        }
                                                        if (!z3) {
                                                            vector.add("Unable to re-synch MPEG audio frame " + i + ".");
                                                            bufferedInputStream.close();
                                                            if (this.bitrateType == BitrateType.CBR) {
                                                                i2 = -1;
                                                            } else {
                                                                i2 = -1;
                                                            }
                                                            if (this.bitrateType == BitrateType.VBR) {
                                                                this.bitrate = Math.round(bitrate / i);
                                                            }
                                                            return vector;
                                                        }
                                                        bitrate3 = i3;
                                                        i++;
                                                        str3 = str;
                                                    }
                                                } catch (ParseException unused3) {
                                                }
                                            } catch (ParseException unused4) {
                                                i3 = i4;
                                            }
                                            str3 = str;
                                        }
                                        if (!z3) {
                                            vector.add("Unable to re-synch MPEG audio frame " + i + ".");
                                            break;
                                        }
                                        bitrate3 = i3;
                                    } else {
                                        vector.add(str3 + i + " truncated at the end (" + filePosition + ") of the .mp3 file.");
                                        break;
                                    }
                                    bufferedInputStream.close();
                                } catch (Exception e3) {
                                    e = e3;
                                    z = z2;
                                    e.printStackTrace();
                                    vector.add(getPath() + " - MPEG audio frame at file position " + filePosition + " has an error");
                                    bufferedInputStream.close();
                                    z2 = z;
                                }
                                if (this.bitrateType == BitrateType.CBR) {
                                    i2 = -1;
                                } else {
                                    i2 = -1;
                                }
                                if (this.bitrateType == BitrateType.VBR) {
                                    this.bitrate = Math.round(bitrate / i);
                                }
                                return vector;
                            }
                            i++;
                            str3 = str;
                        }
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused5) {
                        }
                        if (this.bitrateType == BitrateType.CBR || z2) {
                            i2 = -1;
                        } else {
                            vector.add("VBR encoded .mp3 file does not contain any VBR headers.");
                            this.bitrateType = BitrateType.VBR;
                            i2 = -1;
                            this.bitrate = -1;
                        }
                        if (this.bitrateType == BitrateType.VBR && this.bitrate == i2) {
                            this.bitrate = Math.round(bitrate / i);
                        }
                        bufferedInputStream.close();
                    } catch (Exception unused6) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    bitrate = 0;
                    i = 0;
                    z = true;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Exception unused7) {
                }
                throw th;
            }
            e.printStackTrace();
            vector.add(getPath() + " - MPEG audio frame at file position " + filePosition + " has an error");
            z2 = z;
            if (this.bitrateType == BitrateType.CBR) {
                i2 = -1;
            } else {
                i2 = -1;
            }
            if (this.bitrateType == BitrateType.VBR) {
                this.bitrate = Math.round(bitrate / i);
            }
        }
        return vector;
    }

    public MP3Base(File file) throws Throwable {
        readMP3File(file);
    }

    public MP3Base(URL url) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            this.mp3Url = url;
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.connect();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(FirebasePerfUrlConnection.openStream(url));
            try {
                d(bufferedInputStream2);
                this.fileSize = httpURLConnection.getContentLength();
                ID3v23Tag iD3v23Tag = this.id3v23Tag;
                int size = iD3v23Tag != null ? iD3v23Tag.getSize() : this.id3v24Tag.getSize();
                this.tagSize = size;
                this.audioSize = this.fileSize - size;
                httpURLConnection.disconnect();
                c(bufferedInputStream2);
                try {
                    bufferedInputStream2.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public MP3Base(InputStream inputStream) throws IOException {
        d(inputStream);
        ID3v23Tag iD3v23Tag = this.id3v23Tag;
        this.tagSize = iD3v23Tag != null ? iD3v23Tag.getSize() : this.id3v24Tag.getSize();
        int iC = c(inputStream);
        this.audioSize = iC;
        this.fileSize = this.tagSize + iC;
    }
}
