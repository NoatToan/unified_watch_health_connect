package org.cybergarage.upnp.std.av.server.object.format;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatObject;
import org.cybergarage.util.Debug;
import org.cybergarage.xml.Attribute;
import org.cybergarage.xml.AttributeList;

/* JADX INFO: loaded from: classes23.dex */
public class ID3Format extends Header implements Format, FormatObject {
    public static final int FRAME_HEADER_SIZE = 10;
    public static final String HEADER_ID = "ID3";
    public static final int HEADER_SIZE = 10;
    private byte[] extHeader;
    private byte[] frameHeader;
    private ID3FrameList frameList;
    private byte[] header;
    private File mp3File;

    public ID3Format() {
        this.header = new byte[10];
        this.extHeader = new byte[4];
        this.frameHeader = new byte[10];
        this.frameList = new ID3FrameList();
        this.mp3File = null;
    }

    private int getFrameFlag(byte[] bArr) {
        return ((bArr[8] & 255) << 8) + (bArr[9] & 255);
    }

    private String getFrameID(byte[] bArr) {
        return new String(bArr, 0, 4);
    }

    private int getFrameSize(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += (bArr[7 - i2] & 255) << i2;
        }
        return i;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public FormatObject createObject(File file) {
        return new ID3Format(file);
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public boolean equals(File file) {
        return Header.getIDString(file, 3).startsWith(HEADER_ID);
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public AttributeList getAttributeList() {
        AttributeList attributeList = new AttributeList();
        attributeList.add(new Attribute("size", Long.toString(this.mp3File.length())));
        return attributeList;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getCreator() {
        String frameStringData = getFrameStringData(ID3Frame.TPE1);
        if (frameStringData.length() > 0) {
            return frameStringData;
        }
        String frameStringData2 = getFrameStringData(ID3Frame.TPE2);
        if (frameStringData2.length() > 0) {
            return frameStringData2;
        }
        String frameStringData3 = getFrameStringData(ID3Frame.TPE3);
        return frameStringData3.length() > 0 ? frameStringData3 : getFrameStringData(ID3Frame.TPE4);
    }

    public int getExtHeaderSize() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += (this.extHeader[3 - i2] & 255) << i2;
        }
        return i;
    }

    public int getFlag() {
        return this.header[5] & 255;
    }

    public byte[] getFrameData(String str) {
        return this.frameList.getFrameData(str);
    }

    public String getFrameStringData(String str) {
        return this.frameList.getFrameStringData(str);
    }

    public String getHeaderID() {
        return new String(this.header, 0, 3);
    }

    public int getHeaderSize() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += (this.header[9 - i2] & 255) << i2;
        }
        return i;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMediaClass() {
        return "object.item.audioItem.musicTrack";
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMimeType() {
        return MimeTypes.AUDIO_MPEG;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getTitle() {
        String frameStringData = getFrameStringData(ID3Frame.TIT2);
        if (frameStringData.length() > 0) {
            return frameStringData;
        }
        String frameStringData2 = getFrameStringData(ID3Frame.TIT1);
        return frameStringData2.length() > 0 ? frameStringData2 : getFrameStringData(ID3Frame.TIT2);
    }

    public boolean hasExtendedHeader() {
        return (getFlag() & 64) == 1;
    }

    public boolean hasFooter() {
        return (getFlag() & 16) == 1;
    }

    public boolean hasHeader() {
        String headerID = getHeaderID();
        if (headerID == null) {
            return false;
        }
        return headerID.equals(HEADER_ID);
    }

    public boolean isExperimental() {
        return (getFlag() & 32) == 1;
    }

    public boolean isUnsynchronisation() {
        return (getFlag() & 128) == 1;
    }

    public boolean loadHeader(InputStream inputStream) {
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            for (int i = 0; i < 10; i++) {
                this.header[i] = dataInputStream.readByte();
            }
            if (hasExtendedHeader()) {
                for (int i2 = 0; i2 < 4; i2++) {
                    this.header[i2] = dataInputStream.readByte();
                }
                int extHeaderSize = getExtHeaderSize();
                for (int i3 = 0; i3 < extHeaderSize - 4; i3++) {
                    dataInputStream.readByte();
                }
            }
            this.frameList.clear();
            int headerSize = getHeaderSize() - 10;
            if (hasExtendedHeader()) {
                headerSize -= getExtHeaderSize();
            }
            int i4 = 0;
            while (i4 < headerSize) {
                for (int i5 = 0; i5 < 10; i5++) {
                    this.frameHeader[i5] = dataInputStream.readByte();
                }
                String frameID = getFrameID(this.frameHeader);
                int frameSize = getFrameSize(this.frameHeader);
                int frameFlag = getFrameFlag(this.frameHeader);
                byte[] bArr = new byte[frameSize];
                for (int i6 = 0; i6 < frameSize; i6++) {
                    bArr[i6] = dataInputStream.readByte();
                }
                ID3Frame iD3Frame = new ID3Frame();
                iD3Frame.setID(frameID);
                iD3Frame.setSize(frameSize);
                iD3Frame.setFlag(frameFlag);
                iD3Frame.setData(bArr);
                this.frameList.add(iD3Frame);
                i4 += frameSize + 10;
            }
            dataInputStream.close();
        } catch (EOFException unused) {
        } catch (Exception e) {
            Debug.warning(e);
            return false;
        }
        return true;
    }

    public void print() {
        String str = new String(this.header);
        System.out.println("header = " + str);
        System.out.println("ID = " + getHeaderID());
        System.out.println("Size = " + getHeaderSize());
        System.out.println("isUnsynchronisation = " + isUnsynchronisation());
        System.out.println("hasExtendedHeader = " + hasExtendedHeader());
        System.out.println("isExperimental = " + isExperimental());
        System.out.println("hasFooter = " + hasFooter());
        int size = this.frameList.size();
        for (int i = 0; i < size; i++) {
            ID3Frame frame = this.frameList.getFrame(i);
            System.out.println("[" + i + "] : " + frame.getID());
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("     ");
            sb.append(frame.getData());
            printStream.println(sb.toString());
        }
    }

    public ID3Format(File file) {
        this.header = new byte[10];
        this.extHeader = new byte[4];
        this.frameHeader = new byte[10];
        this.frameList = new ID3FrameList();
        this.mp3File = file;
        loadHeader(file);
    }

    public boolean loadHeader(File file) {
        try {
            return loadHeader(new FileInputStream(file));
        } catch (Exception e) {
            Debug.warning(e);
            return false;
        }
    }
}
