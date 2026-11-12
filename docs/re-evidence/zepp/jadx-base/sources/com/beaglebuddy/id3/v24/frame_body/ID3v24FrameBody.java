package com.beaglebuddy.id3.v24.frame_body;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.beaglebuddy.id3.enums.v24.FrameType;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v24FrameBody extends ID3v24FrameBodyUtility {
    public byte[] buffer;
    public boolean dirty;
    public FrameType frameType;

    public ID3v24FrameBody(FrameType frameType) {
        this.frameType = frameType;
        this.buffer = new byte[0];
    }

    public FrameType getFrameType() {
        return this.frameType;
    }

    public int getNextNullTerminator(int i, Encoding encoding) {
        return ID3v24FrameBodyUtility.getNextNullTerminator(this.buffer, i, encoding);
    }

    public int getSize() {
        return this.buffer.length;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public void parse() throws IllegalArgumentException {
    }

    public void save(OutputStream outputStream) throws IllegalStateException, IOException {
        if (!this.dirty) {
            outputStream.write(this.buffer);
            return;
        }
        throw new IllegalStateException("The ID3v2.4 frame " + this.frameType.getId() + " has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public void setBuffer() {
        throw new IllegalArgumentException("The ID3v24FrameBody.setBuffer() method should be abstract and never called directly.");
    }

    public ID3v24FrameBody(InputStream inputStream, FrameType frameType, int i) throws IOException {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.frameType = frameType;
        int i2 = inputStream.read(bArr, 0, i);
        int i3 = i2;
        while (i2 != i && i3 != -1) {
            i3 = inputStream.read(this.buffer, i2, i - i2);
            i2 += i3;
        }
        if (i2 == i) {
            return;
        }
        throw new IOException("Error reading the body (" + i + " bytes) of a " + frameType.getId() + " frame.  " + i2 + " bytes were read.");
    }

    public void save(RandomAccessFile randomAccessFile) throws IllegalStateException, IOException {
        if (!this.dirty) {
            randomAccessFile.write(this.buffer);
            return;
        }
        throw new IllegalStateException("The ID3v2.4 frame " + this.frameType.getId() + "  has been modified and requires setBuffer() to be called before it can be saved.");
    }

    public ID3v24FrameBody(InputStream inputStream, String str, int i) throws IOException {
        if (Character.isLetter(str.charAt(0)) && Character.isLetter(str.charAt(1)) && ((Character.isLetter(str.charAt(2)) || Character.isDigit(str.charAt(2)) || Character.isSpaceChar(str.charAt(2))) && ((Character.isLetter(str.charAt(3)) || Character.isDigit(str.charAt(3)) || Character.isSpaceChar(str.charAt(3)) || str.charAt(3) == 0) && i > 0 && i < 200000))) {
            byte[] bArr = new byte[i];
            this.buffer = bArr;
            if (inputStream.read(bArr) == this.buffer.length) {
                return;
            }
            throw new IOException("Error reading the body of an invalid ID3v2.4 frame with id " + str + ".");
        }
        throw new IOException("The mp3 file contains a corrupt ID3v2.4 tag with an invalid frame (" + str + ") which is not readable.");
    }
}
