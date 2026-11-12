package com.beaglebuddy.id3.v23;

import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23Frame {
    private ID3v23FrameHeader a;
    private ID3v23FrameBody b;
    private String c;

    public ID3v23Frame(FrameType frameType) {
        try {
            this.a = new ID3v23FrameHeader(frameType);
            Class<?> frameBodyClass = frameType.getFrameBodyClass();
            if (frameBodyClass.getName().endsWith("ID3v23FrameBodyTextInformation") || frameBodyClass.getName().endsWith("ID3v23FrameBodyURLLink")) {
                this.b = (ID3v23FrameBody) frameBodyClass.getConstructor(FrameType.class).newInstance(frameType);
            } else {
                this.b = (ID3v23FrameBody) frameBodyClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    public ID3v23FrameBody getBody() {
        return this.b;
    }

    public String getDescription() {
        return this.a.getFrameType().getName();
    }

    public ID3v23FrameHeader getHeader() {
        return this.a;
    }

    public String getInvalidMessage() {
        return this.c;
    }

    public int getSize() {
        return this.a.getSize() + this.b.getSize();
    }

    public boolean isDirty() {
        return this.a.isDirty() || this.b.isDirty();
    }

    public boolean isValid() {
        return this.c == null;
    }

    public void save(OutputStream outputStream) throws IllegalStateException, IOException {
        if (isDirty()) {
            throw new IllegalStateException("The frame " + this.a.getFrameType().getId() + "'s save() method has been called before the frame's setBuffer() method.");
        }
        this.a.setFrameBodySize(this.b.getSize());
        this.a.setBuffer();
        this.a.save(outputStream);
        this.b.save(outputStream);
    }

    public void setBody(ID3v23FrameBody iD3v23FrameBody) {
        this.b = iD3v23FrameBody;
    }

    public void setBuffer() {
        this.b.setBuffer();
        this.a.setFrameBodySize(this.b.getSize());
        this.a.setBuffer();
    }

    public void setHeader(ID3v23FrameHeader iD3v23FrameHeader) {
        this.a = iD3v23FrameHeader;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ID3v2.3 frame: " + getDescription() + "\n");
        stringBuffer.append(this.a);
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }

    public void save(RandomAccessFile randomAccessFile) throws IOException {
        if (!isDirty()) {
            this.a.setFrameBodySize(this.b.getSize());
            this.a.setBuffer();
            this.a.save(randomAccessFile);
            this.b.save(randomAccessFile);
            return;
        }
        throw new IllegalStateException("The frame " + this.a.getFrameType().getId() + "'s save() method has been called before the frame's saveBuffer() method.");
    }

    public ID3v23Frame(FrameType frameType, ID3v23FrameBody iD3v23FrameBody) throws IllegalArgumentException {
        Class<?> frameBodyClass = frameType.getFrameBodyClass();
        if (frameBodyClass.equals(iD3v23FrameBody.getClass())) {
            this.a = new ID3v23FrameHeader(frameType);
            this.b = iD3v23FrameBody;
            setBuffer();
        } else {
            throw new IllegalArgumentException("Invalid frame body type, " + iD3v23FrameBody.getClass().getName() + " specified.  ID3v2.3 frame id requires a frame body of type " + frameBodyClass.getName() + ".");
        }
    }

    public ID3v23Frame(ID3v23FrameHeader iD3v23FrameHeader, InputStream inputStream) throws IOException, IllegalArgumentException {
        this.a = iD3v23FrameHeader;
        Class<?> frameBodyClass = null;
        try {
            frameBodyClass = iD3v23FrameHeader.getFrameType().getFrameBodyClass();
            Constructor<?> frameBodyConstructor = iD3v23FrameHeader.getFrameType().getFrameBodyConstructor();
            ID3v23FrameBody iD3v23FrameBody = (ID3v23FrameBody) (frameBodyConstructor.getParameterTypes().length == 2 ? frameBodyConstructor.newInstance(inputStream, Integer.valueOf(iD3v23FrameHeader.getFrameBodySize())) : frameBodyConstructor.newInstance(inputStream, iD3v23FrameHeader.getFrameType(), Integer.valueOf(iD3v23FrameHeader.getFrameBodySize())));
            this.b = iD3v23FrameBody;
            iD3v23FrameBody.parse();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            this.c = e2.getMessage();
        } catch (IndexOutOfBoundsException unused) {
            this.c = "The frame body of an ID3v2.3 frame " + iD3v23FrameHeader.getFrameType().getId() + " has an insufficient size, " + iD3v23FrameHeader.getFrameBodySize() + ".";
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (NullPointerException e4) {
            if (frameBodyClass == null) {
                this.b = new ID3v23FrameBody(inputStream, iD3v23FrameHeader.getInvalidFrameId(), iD3v23FrameHeader.getFrameBodySize());
                this.c = "Invalid ID3v2.3 frame id " + iD3v23FrameHeader.getInvalidFrameId();
                return;
            }
            this.c = e4.getMessage();
            throw e4;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
    }
}
