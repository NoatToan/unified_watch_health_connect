package com.ximalaya.ting.android.player.liveflv;

import com.ximalaya.ting.android.player.StaticConfig;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class FlvAacParser {
    public static FileOutputStream outputStream;
    private int aacProfile;
    private int channelConfig;
    private DataInputStream dataInputStream;
    private int sampleRateIndex;
    private int FLV_FILE_HEAD_SIZE = 9;
    private int FLV_PREVIOUS_TAG_SIZE = 4;
    private int FLV_TAG_HEAD_SIZE = 11;
    private int FLV_HEAD_SIZE = 7;
    private int ADTS_HEAD_SIZE = 7;
    private int FLV_SIGN_HEAD_SIZE = 2;
    private int TYPE_AUDIO = 8;
    private byte MASK_VIDEO = 1;
    private byte MASK_AUDIO = 4;
    private String TAG = "FLVPARSER";
    private boolean isFlvDataCallbackEnable = true;
    public int tagNum = 0;

    public FlvAacParser(InputStream inputStream) throws IOException {
        this.dataInputStream = null;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.dataInputStream = dataInputStream;
        if (((char) dataInputStream.readByte()) != 'F' || ((char) this.dataInputStream.readByte()) != 'L' || ((char) this.dataInputStream.readByte()) != 'V') {
            throw new IOException("The file is not a FLV file.");
        }
        this.dataInputStream.readUnsignedByte();
        if (!((this.dataInputStream.readUnsignedByte() & this.MASK_AUDIO) != 0)) {
            throw new IOException("No Audio Stream");
        }
        int i = this.dataInputStream.readInt();
        if (i == this.FLV_FILE_HEAD_SIZE) {
            return;
        }
        throw new IOException("Unpexpected FLV header length: " + i);
    }

    public static void dumpHeaders(URLConnection uRLConnection) {
        Iterator<Map.Entry<String, List<String>>> it2 = uRLConnection.getHeaderFields().entrySet().iterator();
        while (it2.hasNext()) {
            for (String str : it2.next().getValue()) {
            }
        }
    }

    private byte[] fillBuffer(int i) throws IOException {
        if (readAACHeader(i)) {
            return null;
        }
        int i2 = i - this.FLV_SIGN_HEAD_SIZE;
        byte[] bArr = new byte[this.ADTS_HEAD_SIZE + i2];
        long jWriteBits = writeBits(writeBits(writeBits(0L, 12, 4095), 3, 0), 1, 1);
        bArr[0] = (byte) (jWriteBits >> 8);
        bArr[1] = (byte) jWriteBits;
        int i3 = i2 + 7;
        long jWriteBits2 = writeBits(writeBits(writeBits(writeBits(writeBits(writeBits(0L, 2, this.aacProfile - 1), 4, this.sampleRateIndex), 1, 0), 3, this.channelConfig), 4, 0), 2, i3 & 6144);
        bArr[2] = (byte) (jWriteBits2 >> 8);
        bArr[3] = (byte) jWriteBits2;
        long jWriteBits3 = writeBits(writeBits(writeBits(0L, 11, i3 & 2047), 11, 2047), 2, 0);
        bArr[4] = (byte) (jWriteBits3 >> 16);
        bArr[5] = (byte) (jWriteBits3 >> 8);
        bArr[6] = (byte) jWriteBits3;
        this.dataInputStream.readFully(bArr, this.ADTS_HEAD_SIZE, i2);
        return bArr;
    }

    public static void main(String[] strArr) {
        try {
            FlvAacParser flvAacParser = new FlvAacParser(new FileInputStream("/Users/roc/Desktop/ktv-101010.flv"));
            outputStream = new FileOutputStream(new File("/Users/roc/Desktop/ktv-101010-out2.data"));
            int length = 0;
            while (true) {
                try {
                    length = flvAacParser.readFrame(length).length;
                } catch (EOFException e) {
                    e.printStackTrace();
                    flvAacParser.close();
                    outputStream.close();
                    return;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean readAACHeader(int i) throws IOException {
        this.dataInputStream.readUnsignedByte();
        if (this.dataInputStream.readUnsignedByte() != 0) {
            return false;
        }
        int i2 = (((this.dataInputStream.readByte() & 255) * 256) + (this.dataInputStream.readByte() & 255)) << 16;
        if (i > 4) {
            this.dataInputStream.skipBytes(i - 4);
        }
        this.aacProfile = readBits(i2, 5);
        int i3 = i2 << 5;
        this.sampleRateIndex = readBits(i3, 4);
        int bits = readBits(i3 << 4, 4);
        this.channelConfig = bits;
        int i4 = this.aacProfile;
        if (i4 < 0 || i4 > 3) {
            throw new IOException("Unsupported AAC profile.");
        }
        if (this.sampleRateIndex > 12) {
            throw new IOException("Invalid AAC sample rate index.");
        }
        if (bits <= 6) {
            return true;
        }
        throw new IOException("Invalid AAC channel configuration.");
    }

    private int readBits(int i, int i2) {
        return i >> (32 - i2);
    }

    private int readNext3Bytes() throws IOException {
        return (this.dataInputStream.read() << 16) + (this.dataInputStream.read() << 8) + this.dataInputStream.read();
    }

    public void close() throws IOException {
        DataInputStream dataInputStream = this.dataInputStream;
        if (dataInputStream != null) {
            dataInputStream.close();
        }
    }

    public byte[] readFrame(int i) throws IOException {
        IFlvDataCallback iFlvDataCallback;
        int i2 = this.dataInputStream.readInt();
        if (i != 0 && i2 != (i - this.FLV_HEAD_SIZE) + this.FLV_SIGN_HEAD_SIZE + this.FLV_TAG_HEAD_SIZE) {
            throw new IOException("previousTagSize not equal previousReadBytes");
        }
        int unsignedByte = this.dataInputStream.readUnsignedByte();
        while (unsignedByte != this.TYPE_AUDIO) {
            int next3Bytes = readNext3Bytes();
            this.dataInputStream.skipBytes(3);
            this.dataInputStream.skipBytes(1);
            this.dataInputStream.skipBytes(3);
            if (next3Bytes != 0) {
                byte[] bArr = new byte[next3Bytes];
                this.dataInputStream.readFully(bArr);
                if (this.isFlvDataCallbackEnable && (iFlvDataCallback = StaticConfig.mIFlvDataCallback) != null) {
                    iFlvDataCallback.dataOutput(unsignedByte, bArr);
                }
            }
            int i3 = this.dataInputStream.readInt();
            if (i3 != 0 && i3 != this.FLV_TAG_HEAD_SIZE + next3Bytes) {
                throw new IOException("previousOtherTagSize not equal nextDataSize previousOtherTagSize:" + i3 + " nextDataSize:" + next3Bytes);
            }
            unsignedByte = this.dataInputStream.readUnsignedByte();
        }
        int next3Bytes2 = readNext3Bytes();
        this.dataInputStream.readInt();
        readNext3Bytes();
        if (next3Bytes2 == 0) {
            return readFrame(0);
        }
        byte[] bArrFillBuffer = fillBuffer(next3Bytes2);
        return bArrFillBuffer == null ? readFrame(0) : bArrFillBuffer;
    }

    public void setFlvDataCallbackIsEnable(boolean z) {
        this.isFlvDataCallbackEnable = z;
    }

    public long writeBits(long j, int i, int i2) {
        return (j << i) | (((long) i2) & (4294967295 >> (32 - i)));
    }
}
