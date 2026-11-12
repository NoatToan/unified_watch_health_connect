package com.beaglebuddy.mpeg;

import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class VBRIHeader {
    public static final int HEADER_MIN_SIZE = 26;
    private static final int m = 4;
    private static final int n = 2;
    private static final int o = 2;
    private static final int p = 2;
    private static final int q = 4;
    private static final int r = 4;
    private static final int s = 2;
    private static final int t = 2;
    private static final int u = 2;
    private static final int v = 2;
    private static final int w = 26;
    private static final String x = "VBRI";
    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private byte[][] k;
    private int l;

    public VBRIHeader() {
        this.a = x;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.k = null;
        this.l = 0;
    }

    public int getDelay() {
        return this.c;
    }

    public String getId() {
        return this.a;
    }

    public int getNumBytes() {
        return this.e;
    }

    public int getNumFrames() {
        return this.f;
    }

    public int getNumTOCEntries() {
        return this.g;
    }

    public int getQuality() {
        return this.d;
    }

    public int getSize() {
        return this.l;
    }

    public int getTOCEntryNumFrames() {
        return this.j;
    }

    public int getTOCEntryScaleFactor() {
        return this.h;
    }

    public int getTOCEntrySize() {
        return this.i;
    }

    public byte[][] getTableOfContents() {
        return this.k;
    }

    public int getVersion() {
        return this.b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("VBRI header\n");
        stringBuffer.append("size..................: " + this.l + "\n");
        stringBuffer.append("id....................: " + this.a + "\n");
        stringBuffer.append("version...............: " + this.b + "\n");
        stringBuffer.append("delay.................: " + this.c + "\n");
        stringBuffer.append("quality...............: " + this.d + "\n");
        stringBuffer.append("num bytes.............: " + this.e + "\n");
        stringBuffer.append("num frames............: " + this.f + "\n");
        stringBuffer.append("num TOC entries.......: " + this.g + "\n");
        stringBuffer.append("TOC entry scale factor: " + this.h + "\n");
        stringBuffer.append("TOC entry size........: " + this.i + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("TOC entry frames......: ");
        sb.append(this.j);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public VBRIHeader(byte[] bArr, int i) throws ParseException {
        int i2;
        try {
            String str = new String(bArr, i, 4);
            this.a = str;
            if (str.equals(x)) {
                int length = this.l + this.a.length();
                this.l = length;
                byte[] bArr2 = new byte[2];
                System.arraycopy(bArr, length + i, bArr2, 0, 2);
                this.b = Utility.bytesToShort(bArr2);
                int i3 = this.l + 2;
                this.l = i3;
                byte[] bArr3 = new byte[2];
                System.arraycopy(bArr, i3 + i, bArr3, 0, 2);
                this.c = Utility.bytesToShort(bArr3);
                int i4 = this.l + 2;
                this.l = i4;
                byte[] bArr4 = new byte[2];
                System.arraycopy(bArr, i4 + i, bArr4, 0, 2);
                this.d = Utility.bytesToShort(bArr4);
                int i5 = this.l + 2;
                this.l = i5;
                byte[] bArr5 = new byte[4];
                System.arraycopy(bArr, i5 + i, bArr5, 0, 4);
                this.e = Utility.bytesToInt(bArr5);
                int i6 = this.l + 4;
                this.l = i6;
                byte[] bArr6 = new byte[4];
                System.arraycopy(bArr, i6 + i, bArr6, 0, 4);
                this.f = Utility.bytesToInt(bArr6);
                int i7 = this.l + 4;
                this.l = i7;
                byte[] bArr7 = new byte[2];
                System.arraycopy(bArr, i7 + i, bArr7, 0, 2);
                this.g = Utility.bytesToShort(bArr7);
                int i8 = this.l + 2;
                this.l = i8;
                byte[] bArr8 = new byte[2];
                System.arraycopy(bArr, i8 + i, bArr8, 0, 2);
                this.h = Utility.bytesToShort(bArr8);
                int i9 = this.l + 2;
                this.l = i9;
                byte[] bArr9 = new byte[2];
                System.arraycopy(bArr, i9 + i, bArr9, 0, 2);
                this.i = Utility.bytesToShort(bArr9);
                int i10 = this.l + 2;
                this.l = i10;
                byte[] bArr10 = new byte[2];
                System.arraycopy(bArr, i10 + i, bArr10, 0, 2);
                this.j = Utility.bytesToShort(bArr10);
                this.l += 2;
                this.k = new byte[this.g][];
                int i11 = 0;
                while (true) {
                    i2 = this.g;
                    if (i11 >= i2) {
                        break;
                    }
                    int i12 = this.i;
                    byte[] bArr11 = new byte[i12];
                    System.arraycopy(bArr, this.l + i, bArr11, 0, i12);
                    this.k[i11] = bArr11;
                    this.l += i12;
                    i11++;
                }
                if (this.l != (i2 * this.i) + 26) {
                    throw new ParseException("Something went wrong parsing the VBRI header.  Fix:  TODO");
                }
                return;
            }
            throw new ParseException("Invalid id, " + this.a + ", in VBRI header.  It must be " + x + ".");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ParseException("Insufficient bytes to parse the VBRI header.", bArr);
        }
    }

    public VBRIHeader(byte[] bArr, InputStream inputStream) throws ParseException, IOException {
        if (bArr.length == 4) {
            String str = new String(bArr);
            this.a = str;
            if (str.equals(x)) {
                byte[] bArr2 = new byte[2];
                if (inputStream.read(bArr2) == 2) {
                    this.b = Utility.bytesToShort(bArr2);
                    byte[] bArr3 = new byte[2];
                    if (inputStream.read(bArr3) == 2) {
                        this.c = Utility.bytesToShort(bArr3);
                        byte[] bArr4 = new byte[2];
                        if (inputStream.read(bArr4) == 2) {
                            this.d = Utility.bytesToShort(bArr4);
                            byte[] bArr5 = new byte[4];
                            if (inputStream.read(bArr5) == 4) {
                                this.e = Utility.bytesToInt(bArr5);
                                byte[] bArr6 = new byte[4];
                                if (inputStream.read(bArr6) == 4) {
                                    this.f = Utility.bytesToInt(bArr6);
                                    byte[] bArr7 = new byte[2];
                                    if (inputStream.read(bArr7) == 2) {
                                        this.g = Utility.bytesToShort(bArr7);
                                        byte[] bArr8 = new byte[2];
                                        if (inputStream.read(bArr8) == 2) {
                                            this.h = Utility.bytesToShort(bArr8);
                                            byte[] bArr9 = new byte[2];
                                            if (inputStream.read(bArr9) == 2) {
                                                this.i = Utility.bytesToShort(bArr9);
                                                byte[] bArr10 = new byte[2];
                                                if (inputStream.read(bArr10) == 2) {
                                                    this.j = Utility.bytesToShort(bArr10);
                                                    this.k = new byte[this.g][];
                                                    int i = 0;
                                                    while (true) {
                                                        int i2 = this.g;
                                                        if (i < i2) {
                                                            int i3 = this.i;
                                                            byte[] bArr11 = new byte[i3];
                                                            if (inputStream.read(bArr11) == i3) {
                                                                this.k[i] = bArr11;
                                                                i++;
                                                            } else {
                                                                throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                                                            }
                                                        } else {
                                                            this.l = (i2 * this.i) + 26;
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                                                }
                                            } else {
                                                throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                                            }
                                        } else {
                                            throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                                        }
                                    } else {
                                        throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                                    }
                                } else {
                                    throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                                }
                            } else {
                                throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                            }
                        } else {
                            throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                        }
                    } else {
                        throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                    }
                } else {
                    throw new IOException("Unable to read the VBRI header from the mpeg audio frame in the mp3 file.");
                }
            } else {
                throw new ParseException("Invalid id, " + this.a + ", in VBRI header.  It must be " + x + ".");
            }
        } else {
            throw new ParseException("Invalid number of id bytes in VBRIHeader constructor");
        }
    }
}
