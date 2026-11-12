package com.beaglebuddy.ape;

import com.beaglebuddy.exception.ParseException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class APETag {
    private int a;
    private int b;
    private int c;
    private APEHeader d;
    private Vector<APEItem> e;
    private APEFooter f;

    public APETag(RandomAccessFile randomAccessFile) throws ParseException, IOException {
        int numItems;
        try {
            byte[] bArr = new byte[32];
            if (randomAccessFile.read(bArr) != 32) {
                throw new IOException("Unable to read the APEv2 tag header.");
            }
            this.d = new APEHeader(bArr);
            this.a = 0;
            APEHeader aPEHeader = this.d;
            if (aPEHeader != null) {
                this.c = aPEHeader.getVersion();
                this.b = this.d.getTagSize() + this.d.getSize();
                numItems = this.d.getNumItems();
            } else {
                this.c = this.f.getVersion();
                this.b = this.f.getTagSize() + ((this.c == 2 && this.f.getFlags().isTagContainsHeader()) ? 32 : 0);
                numItems = this.f.getNumItems();
            }
            APEFooter aPEFooter = this.d;
            int tagSize = (aPEFooter == null ? this.f : aPEFooter).getTagSize();
            byte[] bArr2 = new byte[tagSize];
            if (randomAccessFile.read(bArr2) != tagSize) {
                throw new IOException("Unable to read the APE tag items.");
            }
            this.e = new Vector<>();
            int size = 0;
            for (int i = 0; i < numItems; i++) {
                APEItem aPEItem = new APEItem(bArr2, size);
                this.e.add(aPEItem);
                size += aPEItem.getSize();
            }
            int i2 = this.b;
            if (size >= i2 || this.f != null || i2 - size < 32) {
                return;
            }
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr2, size, bArr3, 0, 32);
            this.f = new APEFooter(bArr3);
        } catch (ParseException unused) {
            a(randomAccessFile);
        }
    }

    private void a(RandomAccessFile randomAccessFile) throws ParseException, IOException {
        byte[] bArr = new byte[32];
        try {
            randomAccessFile.seek(randomAccessFile.length() - 32);
            if (randomAccessFile.read(bArr) != 32) {
                throw new IOException("Unable to read the APE tag footer.");
            }
            this.f = new APEFooter(bArr);
            randomAccessFile.seek(randomAccessFile.length() - ((long) this.f.getTagSize()));
            this.a = (int) randomAccessFile.getFilePointer();
            if (this.f.getFlags().isTagContainsHeader()) {
                randomAccessFile.seek(randomAccessFile.getFilePointer() - 32);
                this.a = (int) randomAccessFile.getFilePointer();
                if (randomAccessFile.read(bArr) != 32) {
                    throw new IOException("Unable to read the APE tag header.");
                }
                this.d = new APEHeader(bArr);
            }
        } catch (ParseException unused) {
            randomAccessFile.seek((randomAccessFile.length() - 128) - 32);
            if (randomAccessFile.read(bArr) != 32) {
                throw new IOException("Unable to read the APE tag footer.");
            }
            this.f = new APEFooter(bArr);
            randomAccessFile.seek((randomAccessFile.length() - 128) - ((long) this.f.getTagSize()));
        }
    }

    public int getFilePosition() {
        return this.a;
    }

    public APEFooter getFooter() {
        return this.f;
    }

    public APEHeader getHeader() {
        return this.d;
    }

    public List<APEItem> getItems() {
        return this.e;
    }

    public int getSize() {
        return this.b;
    }

    public int getVersion() {
        APEFooter aPEFooter = this.d;
        if (aPEFooter == null) {
            aPEFooter = this.f;
        }
        return aPEFooter.getVersion();
    }

    public String getVersionString() {
        return "APEv" + getVersion();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("APEv" + getVersion() + " tag\n");
        stringBuffer.append("   file position: " + this.a + "\n");
        stringBuffer.append("   size.........: " + this.b + " bytes\n");
        stringBuffer.append("   header.......: " + this.d + "\n");
        stringBuffer.append("   items........: " + this.e.size() + "\n");
        Iterator<APEItem> it2 = this.e.iterator();
        while (it2.hasNext()) {
            stringBuffer.append("      " + it2.next() + "\n");
        }
        stringBuffer.append("   footer.......: " + this.f);
        return stringBuffer.toString();
    }
}
