package com.ximalaya.ting.android.opensdk.player.flv;

import com.ximalaya.ting.android.player.StaticConfig;
import com.ximalaya.ting.android.player.liveflv.IFlvDataCallback;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class FlvBufferParser {
    private String mUrl;
    private int FLV_FILE_HEAD_SIZE = 9;
    private int FLV_PREVIOUS_TAG_SIZE = 4;
    private int FLV_TAG_HEAD_ATTRIBUTE_SIZE = 4;
    private int FLV_TAG_HEAD_SIZE = 11;
    private int FLV_ALL_TAG_HEAD_SIZE = 11 + 4;
    private int TYPE_AUDIO = 8;
    private byte MASK_VIDEO = 1;
    private byte MASK_AUDIO = 4;
    private String TAG = "FLVPARSER";
    private int totalParseLen = 0;
    private List<FlvBufItem> byteCacheList = new ArrayList();
    private int byteCacheSize = 0;
    private int tagDataSize = 0;
    private boolean isReadTag = true;
    private int tagType = this.TYPE_AUDIO;
    public int tagNum = 0;
    private boolean isFlvDataCallbackEnable = true;

    public class FlvBufItem {
        public byte[] buf;
        public int bufLen;
        public int readStartPosition = 0;

        public FlvBufItem(byte[] bArr, int i) {
            this.buf = bArr;
            this.bufLen = i;
        }

        public int getvailableLen() {
            return this.bufLen - this.readStartPosition;
        }
    }

    public static void dumpHeaders(URLConnection uRLConnection) {
        Iterator<Map.Entry<String, List<String>>> it2 = uRLConnection.getHeaderFields().entrySet().iterator();
        while (it2.hasNext()) {
            for (String str : it2.next().getValue()) {
            }
        }
    }

    private byte[] getByteFromList(int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (this.byteCacheList.size() > 0) {
            FlvBufItem flvBufItem = this.byteCacheList.get(0);
            int i3 = i - i2;
            if (flvBufItem.getvailableLen() > i3) {
                byteArrayOutputStream.write(flvBufItem.buf, flvBufItem.readStartPosition, i3);
                flvBufItem.readStartPosition += i3;
                break;
            }
            i2 += flvBufItem.getvailableLen();
            this.byteCacheList.remove(flvBufItem);
            byteArrayOutputStream.write(flvBufItem.buf, flvBufItem.readStartPosition, flvBufItem.getvailableLen());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        this.byteCacheSize -= byteArray.length;
        this.totalParseLen += byteArray.length;
        if (i == byteArray.length) {
            return byteArray;
        }
        throw new IOException("needSize!=needData.length needSize:" + i + " needData.length:" + byteArray.length);
    }

    public static void main(String[] strArr) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/roc/Desktop/ktv-101010.flv");
            FlvBufferParser flvBufferParser = new FlvBufferParser();
            FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/roc/Desktop/ktv-101010-out.data"));
            byte[] bArr = new byte[4096];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
                flvBufferParser.parseFlv(bArr, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void parseFlvFrame() throws IOException {
        IFlvDataCallback iFlvDataCallback;
        byte[] byteFromList = getByteFromList(this.tagDataSize + (this.FLV_TAG_HEAD_SIZE - this.FLV_TAG_HEAD_ATTRIBUTE_SIZE));
        if (!this.isFlvDataCallbackEnable || (iFlvDataCallback = StaticConfig.mIFlvDataCallback) == null) {
            return;
        }
        iFlvDataCallback.dataOutput(this.tagType, byteFromList);
    }

    private void parseFlvFrameTag() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(getByteFromList(this.FLV_PREVIOUS_TAG_SIZE + this.FLV_TAG_HEAD_ATTRIBUTE_SIZE)));
        int i = dataInputStream.readInt();
        int i2 = this.tagDataSize;
        if (i2 == 0 || i == i2 + this.FLV_TAG_HEAD_SIZE) {
            this.tagType = dataInputStream.readUnsignedByte();
            this.tagDataSize = readNext3Bytes(dataInputStream);
            dataInputStream.close();
        } else {
            throw new IOException("previousTagSize not equal previousReadBytes previousTagSize=" + i + " previousReadBytes=" + this.tagDataSize);
        }
    }

    private void parseFlvHead() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(getByteFromList(this.FLV_FILE_HEAD_SIZE)));
        if (((char) dataInputStream.readByte()) != 'F' || ((char) dataInputStream.readByte()) != 'L' || ((char) dataInputStream.readByte()) != 'V') {
            throw new IOException("The file is not a FLV file.");
        }
        dataInputStream.readUnsignedByte();
        if (!((dataInputStream.readUnsignedByte() & this.MASK_AUDIO) != 0)) {
            throw new IOException("No Audio Stream");
        }
        int i = dataInputStream.readInt();
        if (i == this.FLV_FILE_HEAD_SIZE) {
            dataInputStream.close();
            return;
        }
        throw new IOException("Unpexpected FLV header length: " + i);
    }

    private int readBits(int i, int i2) {
        return i >> (32 - i2);
    }

    private int readNext3Bytes(DataInputStream dataInputStream) throws IOException {
        return (dataInputStream.read() << 16) + (dataInputStream.read() << 8) + dataInputStream.read();
    }

    public void parseFlv(byte[] bArr, int i) throws IOException {
        FlvBufItem flvBufItem = new FlvBufItem(bArr, i);
        this.byteCacheList.add(flvBufItem);
        int i2 = this.byteCacheSize + flvBufItem.getvailableLen();
        this.byteCacheSize = i2;
        if (this.totalParseLen == 0 && i2 >= this.FLV_FILE_HEAD_SIZE) {
            parseFlvHead();
        }
        while (true) {
            boolean z = this.isReadTag;
            if ((!z || this.byteCacheSize < this.FLV_ALL_TAG_HEAD_SIZE) && (z || this.byteCacheSize < this.tagDataSize)) {
                break;
            }
            if (z) {
                this.isReadTag = false;
                parseFlvFrameTag();
            } else {
                this.isReadTag = true;
                if (this.tagDataSize > 0) {
                    parseFlvFrame();
                }
            }
        }
        if (this.byteCacheList.size() > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (FlvBufItem flvBufItem2 : this.byteCacheList) {
                byteArrayOutputStream.write(flvBufItem2.buf, flvBufItem2.readStartPosition, flvBufItem2.getvailableLen());
            }
            FlvBufItem flvBufItem3 = this.byteCacheList.get(0);
            flvBufItem3.buf = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            flvBufItem3.readStartPosition = 0;
            flvBufItem3.bufLen = flvBufItem3.buf.length;
            this.byteCacheList.clear();
            this.byteCacheList.add(flvBufItem3);
        }
    }

    public void setFlvDataCallbackIsEnable(boolean z) {
        this.isFlvDataCallbackEnable = z;
    }

    public void setUrl(String str) {
        if (str.equals(this.mUrl)) {
            return;
        }
        this.totalParseLen = 0;
        this.byteCacheList.clear();
        this.byteCacheSize = 0;
        this.tagDataSize = 0;
        this.isReadTag = true;
        this.tagType = this.TYPE_AUDIO;
        this.tagNum = 0;
        this.mUrl = str;
        this.isFlvDataCallbackEnable = true;
    }

    public long writeBits(long j, int i, int i2) {
        return (j << i) | (((long) i2) & (4294967295 >> (32 - i)));
    }
}
