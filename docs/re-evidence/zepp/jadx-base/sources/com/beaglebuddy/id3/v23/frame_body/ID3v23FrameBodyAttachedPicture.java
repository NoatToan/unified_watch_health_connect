package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.PictureType;
import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.id3.pojo.AttachedPicture;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyAttachedPicture extends ID3v23FrameBody {
    private static final int f = 64;
    private Encoding a;
    private String b;
    private PictureType c;
    private String d;
    private byte[] e;

    public ID3v23FrameBodyAttachedPicture() {
        this(Encoding.ISO_8859_1, null, PictureType.OTHER, "picture", new byte[1]);
    }

    public AttachedPicture getAttachedPicture() {
        return new AttachedPicture(getPictureType(), getMimeType(), getDescription(), getImage());
    }

    public String getDescription() {
        return this.d;
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public byte[] getImage() {
        return this.e;
    }

    public String getMimeType() {
        return this.b;
    }

    public PictureType getPictureType() {
        return this.c;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        try {
            setEncoding(Encoding.valueOf(this.buffer[0]));
        } catch (IllegalArgumentException unused) {
            setEncoding(Encoding.ISO_8859_1);
        }
        Encoding encoding = Encoding.ISO_8859_1;
        int nextNullTerminator = getNextNullTerminator(1, encoding);
        this.nullTerminatorIndex = nextNullTerminator;
        setMimeType(new String(this.buffer, 1, nextNullTerminator - 1, encoding.getCharacterSet()).trim());
        try {
            setPictureType(PictureType.valueOf(this.buffer[this.nullTerminatorIndex + 1]));
        } catch (IllegalArgumentException unused2) {
            setPictureType(PictureType.OTHER);
        }
        int i = this.nullTerminatorIndex + 2;
        this.nullTerminatorIndex = i;
        int nextNullTerminator2 = getNextNullTerminator(i, this.a);
        this.nextNullTerminatorIndex = nextNullTerminator2;
        byte[] bArr = this.buffer;
        int i2 = this.nullTerminatorIndex;
        setDescription(new String(bArr, i2, nextNullTerminator2 - i2, this.a.getCharacterSet()).trim());
        int numBytesInNullTerminator = this.nextNullTerminatorIndex + this.a.getNumBytesInNullTerminator();
        this.nullTerminatorIndex = numBytesInNullTerminator;
        byte[] bArr2 = this.buffer;
        byte[] bArr3 = new byte[numBytesInNullTerminator >= bArr2.length ? 0 : bArr2.length - numBytesInNullTerminator];
        this.e = bArr3;
        System.arraycopy(bArr2, numBytesInNullTerminator, bArr3, 0, bArr3.length);
        setImage(this.e);
        this.dirty = false;
    }

    public void setAttachedPicture(AttachedPicture attachedPicture) {
        if (attachedPicture != null) {
            setMimeType(attachedPicture.getMimeType());
            setDescription(attachedPicture.getDescription());
            setImage(attachedPicture.getImage());
            setPictureType(attachedPicture.getPictureType());
            return;
        }
        throw new IllegalArgumentException("The attached picture in a " + this.frameType.getId() + " frame may not be empty.");
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(Encoding.ISO_8859_1, this.b);
            byte[] bArrStringToBytes2 = ID3v23FrameBodyUtility.stringToBytes(this.a, this.d);
            byte[] bArr = new byte[bArrStringToBytes.length + 1 + 1 + bArrStringToBytes2.length + this.e.length];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            System.arraycopy(bArrStringToBytes, 0, this.buffer, 1, bArrStringToBytes.length);
            int length = bArrStringToBytes.length + 1;
            this.buffer[length] = (byte) this.c.ordinal();
            int i = length + 1;
            System.arraycopy(bArrStringToBytes2, 0, this.buffer, i, bArrStringToBytes2.length);
            int length2 = i + bArrStringToBytes2.length;
            byte[] bArr2 = this.e;
            System.arraycopy(bArr2, 0, this.buffer, length2, bArr2.length);
            this.dirty = false;
        }
    }

    public void setDescription(String str) {
        if (str == null || str.trim().length() <= 64) {
            this.dirty = true;
            this.d = (str == null || str.trim().length() == 0) ? "" : str.trim();
            return;
        }
        throw new IllegalArgumentException("The description field in the " + this.frameType.getId() + " frame may not excede 64 characters in length.");
    }

    public void setEncoding(Encoding encoding) {
        if (encoding != null) {
            this.a = encoding;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The encoding field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public void setImage(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            this.dirty = true;
            this.e = bArr;
        } else {
            throw new IllegalArgumentException("The image field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public void setMimeType(String str) {
        this.dirty = true;
        if (str == null || str.trim().length() == 0) {
            str = "image/";
        }
        this.b = str;
    }

    public void setPictureType(PictureType pictureType) {
        if (pictureType != null) {
            this.dirty = true;
            this.c = pictureType;
        } else {
            throw new IllegalArgumentException("The picture type field in the " + this.frameType.getId() + " frame may not be empty.");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: attached picture\n");
        stringBuffer.append("   bytes..........: " + this.buffer.length + " bytes\n");
        stringBuffer.append("   encoding.......: " + this.a + "\n");
        stringBuffer.append("   image mime type: " + this.b + "\n");
        stringBuffer.append("   picture type...: " + this.c + "\n");
        stringBuffer.append("   description....: " + this.d + "\n");
        stringBuffer.append("   image..........: " + this.e.length + " bytes\n");
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyAttachedPicture(AttachedPicture attachedPicture) {
        this(Encoding.UTF_16, attachedPicture.getMimeType(), attachedPicture.getPictureType(), attachedPicture.getDescription(), attachedPicture.getImage());
    }

    public ID3v23FrameBodyAttachedPicture(Encoding encoding, String str, PictureType pictureType, String str2, byte[] bArr) {
        super(FrameType.ATTACHED_PICTURE);
        setEncoding(encoding);
        setMimeType(str);
        setPictureType(pictureType);
        setDescription(str2);
        setImage(bArr);
        this.dirty = true;
    }

    public void setImage(File file) throws IOException {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        int i = fileInputStream.read(bArr);
        fileInputStream.close();
        if (i == length) {
            this.dirty = true;
            this.e = bArr;
            return;
        }
        throw new IOException("An error occured while trying to read in " + length + " bytes from the image file " + file.getPath() + " for the " + this.frameType.getId() + " frame.");
    }

    public ID3v23FrameBodyAttachedPicture(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.ATTACHED_PICTURE, i);
    }
}
