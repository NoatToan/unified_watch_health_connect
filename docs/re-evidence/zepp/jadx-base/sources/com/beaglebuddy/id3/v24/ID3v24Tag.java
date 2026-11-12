package com.beaglebuddy.id3.v24;

import com.beaglebuddy.exception.ParseException;
import com.beaglebuddy.id3.enums.ID3TagVersion;
import com.beaglebuddy.id3.enums.v24.FrameType;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24Tag {
    public static int DEFAULT_PADDING_SIZE = 256;
    private ID3v24TagHeader a;
    private ID3v24TagExtendedHeader b;
    private List<ID3v24Frame> c;
    private List<ID3v24Frame> d;
    private byte[] e;
    private ID3v24TagFooter f;

    public ID3v24Tag() {
        this.a = new ID3v24TagHeader();
        this.b = null;
        this.c = new Vector();
        this.d = new Vector();
        this.e = new byte[DEFAULT_PADDING_SIZE];
        this.f = null;
    }

    public ID3v24Frame addFrame(FrameType frameType) {
        return addFrame(new ID3v24Frame(frameType));
    }

    public ID3v24TagExtendedHeader getExtendedHeader() throws IllegalStateException {
        if (this.a.isExtendedHeaderPresent()) {
            return this.b;
        }
        throw new IllegalStateException("The extended header may not be read from the ID3v2.4 tag when the extendedHeaderPresent flag is false.");
    }

    public ID3v24TagFooter getFooter() throws IllegalStateException {
        if (this.a.isFooterPresent()) {
            return this.f;
        }
        throw new IllegalStateException("The footer may not be read from the ID3v2.4 tag when the footerPresent flag is false.");
    }

    public ID3v24Frame getFrame(FrameType frameType) {
        for (ID3v24Frame iD3v24Frame : this.c) {
            if (iD3v24Frame.getHeader().getFrameType() == frameType) {
                return iD3v24Frame;
            }
        }
        return null;
    }

    public List<ID3v24Frame> getFrames() {
        return this.c;
    }

    public ID3v24TagHeader getHeader() {
        return this.a;
    }

    public List<ID3v24Frame> getInvalidFrames() {
        return this.d;
    }

    public byte[] getPadding() {
        return this.e;
    }

    public int getSize() {
        return this.a.getSize() + this.a.getTagSize() + (this.a.isFooterPresent() ? this.f.getSize() : 0);
    }

    public ID3TagVersion getVersion() {
        return ID3TagVersion.ID3V2_4;
    }

    public boolean isDirty() {
        boolean zIsDirty = this.a.isDirty();
        if (this.a.isExtendedHeaderPresent()) {
            zIsDirty = zIsDirty || this.b.isDirty();
        }
        if (!zIsDirty) {
            Iterator<ID3v24Frame> it2 = this.c.iterator();
            while (it2.hasNext()) {
                if (it2.next().isDirty()) {
                    zIsDirty = true;
                }
            }
        }
        return zIsDirty;
    }

    public ID3v24Frame removeFrame(FrameType frameType) {
        ID3v24Frame next;
        Iterator<ID3v24Frame> it2 = this.c.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (next.getHeader().getFrameType() != frameType);
        if (next != null) {
            this.c.remove(next);
        }
        return next;
    }

    public List<ID3v24Frame> removeFrames(FrameType frameType) {
        Vector vector = new Vector();
        for (ID3v24Frame iD3v24Frame : this.c) {
            if (iD3v24Frame.getHeader().getFrameType() == frameType) {
                vector.add(iD3v24Frame);
            }
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            this.c.remove((ID3v24Frame) it2.next());
        }
        return vector;
    }

    public void save(OutputStream outputStream) throws IOException {
        setBuffer();
        this.a.save(outputStream);
        if (this.a.isExtendedHeaderPresent()) {
            this.b.save(outputStream);
        }
        Iterator<ID3v24Frame> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().save(outputStream);
        }
        if (this.a.isFooterPresent()) {
            this.f.save(outputStream);
        } else {
            outputStream.write(this.e);
        }
    }

    public void setBuffer() {
        this.a.setBuffer();
        int size = this.a.getSize() + 0;
        if (this.a.isExtendedHeaderPresent()) {
            this.b.setBuffer();
            size += this.b.getSize();
        }
        for (ID3v24Frame iD3v24Frame : this.c) {
            iD3v24Frame.setBuffer();
            size += iD3v24Frame.getSize();
        }
        if (!this.a.isFooterPresent()) {
            int length = size + getPadding().length;
            ID3v24TagHeader iD3v24TagHeader = this.a;
            iD3v24TagHeader.setTagSize(length - iD3v24TagHeader.getSize());
            this.a.setBuffer();
            return;
        }
        this.f.setBuffer();
        int size2 = size + this.f.getSize();
        setPadding(0);
        ID3v24TagHeader iD3v24TagHeader2 = this.a;
        iD3v24TagHeader2.setTagSize((size2 - iD3v24TagHeader2.getSize()) - this.f.getSize());
        this.a.setBuffer();
        this.f.setTagSize((size2 - this.a.getSize()) - this.f.getSize());
        this.f.setBuffer();
    }

    public void setExtendedHeader(ID3v24TagExtendedHeader iD3v24TagExtendedHeader) {
        this.b = iD3v24TagExtendedHeader;
        this.a.setExtendedHeaderPresent(iD3v24TagExtendedHeader != null);
    }

    public void setFooter(ID3v24TagFooter iD3v24TagFooter) {
        this.f = iD3v24TagFooter;
    }

    public void setFrames(List<ID3v24Frame> list) {
        this.c = list;
    }

    public void setHeader(ID3v24TagHeader iD3v24TagHeader) {
        this.a = iD3v24TagHeader;
    }

    public void setPadding(int i) {
        this.e = new byte[i];
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ID3v2.4 tag\n");
        stringBuffer.append("   num frames: " + this.c.size() + "\n");
        stringBuffer.append("   tag size..: " + (getSize() - this.e.length) + " bytes\n");
        stringBuffer.append("   padding...: " + this.e.length + " bytes\n");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        if (this.a.isExtendedHeaderPresent()) {
            stringBuffer.append(this.b.toString() + "\n");
        }
        Iterator<ID3v24Frame> it2 = this.c.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(it2.next().toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ID3v2.4 tag footer: ");
        Object obj = this.f;
        if (obj == null) {
            obj = "none";
        }
        sb2.append(obj);
        stringBuffer.append(sb2.toString());
        return stringBuffer.toString();
    }

    public ID3v24Frame addFrame(ID3v24Frame iD3v24Frame) {
        this.c.add(iD3v24Frame);
        return iD3v24Frame;
    }

    public List<ID3v24Frame> getFrames(FrameType frameType) {
        Vector vector = new Vector();
        for (ID3v24Frame iD3v24Frame : this.c) {
            if (iD3v24Frame.getHeader().getFrameType() == frameType) {
                vector.add(iD3v24Frame);
            }
        }
        return vector;
    }

    public void removeFrames() {
        this.c = new Vector();
    }

    public ID3v24Tag(InputStream inputStream) throws IOException {
        int i;
        ID3v24TagHeader iD3v24TagHeader = new ID3v24TagHeader(inputStream);
        this.a = iD3v24TagHeader;
        if (iD3v24TagHeader.isExtendedHeaderPresent()) {
            this.b = new ID3v24TagExtendedHeader(inputStream);
        }
        this.c = new Vector();
        this.d = new Vector();
        int tagSize = this.a.getTagSize() + 10;
        int size = this.a.getSize();
        int size2 = this.a.isExtendedHeaderPresent() ? this.b.getSize() : 0;
        while (true) {
            i = size + size2;
            if (i >= tagSize) {
                break;
            }
            ID3v24FrameHeader iD3v24FrameHeader = new ID3v24FrameHeader(inputStream);
            if (iD3v24FrameHeader.isPadding()) {
                break;
            }
            ID3v24Frame iD3v24Frame = new ID3v24Frame(iD3v24FrameHeader, inputStream);
            if (iD3v24Frame.isValid()) {
                this.c.add(iD3v24Frame);
            } else {
                this.d.add(iD3v24Frame);
            }
            size = i + iD3v24Frame.getHeader().getSize();
            size2 = iD3v24Frame.getBody().getSize();
        }
        if (this.a.isFooterPresent()) {
            try {
                this.f = new ID3v24TagFooter(inputStream);
                this.e = new byte[0];
                return;
            } catch (ParseException e) {
                throw new IOException(e.getMessage());
            }
        }
        int i2 = tagSize - i;
        this.e = new byte[i2];
        if (i < tagSize) {
            int i3 = i2 - 1;
            byte[] bArr = new byte[i3];
            inputStream.read(bArr);
            System.arraycopy(bArr, 0, this.e, 1, i3);
        }
        this.f = null;
    }

    public void save(RandomAccessFile randomAccessFile) throws IOException {
        setBuffer();
        this.a.save(randomAccessFile);
        if (this.a.isExtendedHeaderPresent()) {
            this.b.save(randomAccessFile);
        }
        Iterator<ID3v24Frame> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().save(randomAccessFile);
        }
        if (this.a.isFooterPresent()) {
            this.f.save(randomAccessFile);
        } else {
            randomAccessFile.write(this.e);
        }
    }
}
