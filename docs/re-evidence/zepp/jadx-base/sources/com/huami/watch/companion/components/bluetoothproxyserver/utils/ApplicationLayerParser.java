package com.huami.watch.companion.components.bluetoothproxyserver.utils;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes16.dex */
public class ApplicationLayerParser {
    private static final String c = "AppLayParser";
    private a a;
    private long b;

    public static class DNSPackage {
        public static final int CONTENT_OFFSET = 12;
        private static final String a = "DNSPackage";
        public short mAuthResRecNum;
        public short mExtraResNum;
        public short mFlag;
        public short mIdentity;
        public short mQueryClass;
        public String mQueryQuestion;
        public int mQueryQuestionBytesLen;
        public short mQueryType;
        public short mQuestionNumber;
        public short mResourceRecordNumber;

        public DNSPackage(byte[] bArr) {
            b(bArr);
        }

        private void b(byte[] bArr) {
            this.mIdentity = (short) Utils.unsigned2ByteToInt(Utils.getBytes(bArr, 0, 1));
            this.mFlag = (short) Utils.unsigned2ByteToInt(Utils.getBytes(bArr, 2, 3));
            this.mQuestionNumber = (short) Utils.unsigned2ByteToInt(Utils.getBytes(bArr, 4, 5));
            this.mResourceRecordNumber = (short) Utils.unsigned2ByteToInt(Utils.getBytes(bArr, 6, 7));
            this.mAuthResRecNum = (short) Utils.unsigned2ByteToInt(Utils.getBytes(bArr, 8, 9));
            this.mExtraResNum = (short) Utils.unsigned2ByteToInt(Utils.getBytes(bArr, 10, 11));
            this.mQueryQuestion = parseQueryQuestion(bArr, 12);
            int i = this.mQueryQuestionBytesLen;
            this.mQueryType = (short) Utils.unsigned2ByteToInt(Utils.getBytes(bArr, i + 12, i + 13));
            int i2 = this.mQueryQuestionBytesLen;
            this.mQueryClass = (short) Utils.unsigned2ByteToInt(Utils.getBytes(bArr, i2 + 14, i2 + 15));
        }

        public String a(int i) {
            if (i == 1) {
                return ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
            }
            if (i == 2) {
                return "NS";
            }
            if (i == 5) {
                return "CNAME";
            }
            if (i == 6) {
                return "SOA";
            }
            if (i == 15) {
                return HTTP.MX;
            }
            if (i == 28) {
                return "AAAA";
            }
            if (i == 252) {
                return "AXFR";
            }
            if (i == 255) {
                return "ANY";
            }
            switch (i) {
                case 11:
                    return "WKS";
                case 12:
                    return "PTR";
                case 13:
                    return "HINFQ";
                default:
                    return "unknown:" + i;
            }
        }

        public String parseQueryQuestion(byte[] bArr, int i) {
            int i2 = i + 1;
            int iUnsignedByteToInt = Utils.unsignedByteToInt(bArr[i]);
            int i3 = (i2 + iUnsignedByteToInt) - 1;
            String str = "";
            while (iUnsignedByteToInt != 0) {
                String str2 = str + new String(Utils.getBytes(bArr, i2, i3));
                int i4 = i3 + 1;
                this.mQueryQuestionBytesLen = (i4 - i) + 1;
                int i5 = i4 + 1;
                int iUnsignedByteToInt2 = Utils.unsignedByteToInt(bArr[i4]);
                if (iUnsignedByteToInt2 != 0) {
                    str2 = str2 + ".";
                }
                str = str2;
                i3 = (i5 + iUnsignedByteToInt2) - 1;
                i2 = i5;
                iUnsignedByteToInt = iUnsignedByteToInt2;
            }
            return str;
        }

        public String toString() {
            return "DNSPackage{mIdentity=" + ((int) this.mIdentity) + ", mFlag=" + Integer.toHexString(this.mFlag) + ", mQuestionNumber=" + ((int) this.mQuestionNumber) + ", mResourceRecordNumber=" + ((int) this.mResourceRecordNumber) + ", mAuthResRecNum=" + ((int) this.mAuthResRecNum) + ", mExtraResNum=" + ((int) this.mExtraResNum) + ", mQueryQuestion='" + this.mQueryQuestion + "', mQueryQuestionBytesLen=" + this.mQueryQuestionBytesLen + ", mQueryType=" + ((int) this.mQueryType) + ", mQueryClass=" + ((int) this.mQueryClass) + '}';
        }
    }

    public static class TLSPackage implements a {
        public static final int CLIENT_HELLO = 1;
        public static final int CONTENT_TYPE_APPLICATION_DATA = 23;
        public static final int CONTENT_TYPE_CHANGE_CLIPHER_SPEC = 20;
        public static final int CONTENT_TYPE_HANDSHAKE = 22;
        public static final int SERVER_HELLO = 2;
        private static final String j = "TLSPackage";
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private byte[] g;
        private byte[] h = new byte[5];
        private String i;

        public static String codeToString(int i) {
            if (i == 1) {
                return "CLIENT_HELLO";
            }
            if (i == 2) {
                return "SERVER_HELLO";
            }
            if (i == 20) {
                return "CONTENT_TYPE_CHANGE_CLIPHER_SPEC";
            }
            if (i == 22) {
                return "CONTENT_TYPE_HANDSHAKE";
            }
            if (i == 23) {
                return "CONTENT_TYPE_APPLICATION_DATA";
            }
            return "NOT_DEFINE Protocol:" + Integer.toHexString(i);
        }

        public static String findDestHost(byte[] bArr) {
            if (Utils.unsignedByteToInt(bArr[5]) != 1) {
                ProxyLog.D(j, "不是 Client Hello 消息！");
                return null;
            }
            int iUnsignedByteToInt = 43 + Utils.unsignedByteToInt(bArr[43]) + 1;
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, iUnsignedByteToInt, bArr2, 0, 2);
            int iUnsigned2ByteToInt = iUnsignedByteToInt + Utils.unsigned2ByteToInt(bArr2) + 2;
            int iUnsignedByteToInt2 = iUnsigned2ByteToInt + Utils.unsignedByteToInt(bArr[iUnsigned2ByteToInt]) + 1 + 2;
            byte b = bArr[iUnsignedByteToInt2];
            int i = iUnsignedByteToInt2 + 1;
            byte b2 = bArr[i];
            int iUnsigned2ByteToInt2 = i + 1;
            if (b == -1 && b2 == 1) {
                Log.i(j, "handshake for a initial connection", new Object[0]);
                byte[] bArr3 = new byte[2];
                System.arraycopy(bArr, iUnsigned2ByteToInt2, bArr3, 0, 2);
                iUnsigned2ByteToInt2 += Utils.unsigned2ByteToInt(bArr3) + 2 + 2;
            }
            int i2 = iUnsigned2ByteToInt2 + 5;
            try {
                byte[] bArr4 = new byte[2];
                System.arraycopy(bArr, i2, bArr4, 0, 2);
                int iUnsigned2ByteToInt3 = Utils.unsigned2ByteToInt(bArr4);
                byte[] bArr5 = new byte[iUnsigned2ByteToInt3];
                System.arraycopy(bArr, i2 + 2, bArr5, 0, iUnsigned2ByteToInt3);
                return new String(bArr5);
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        @Override // com.huami.watch.companion.components.bluetoothproxyserver.utils.ApplicationLayerParser.a
        public byte[] getApplicationData() {
            return this.g;
        }

        public int getHandShakeProtocol() {
            return this.c;
        }

        @Override // com.huami.watch.companion.components.bluetoothproxyserver.utils.ApplicationLayerParser.a
        public int getType() {
            return 1543;
        }

        public void parsePackageData(InputStream inputStream) {
            byte[] bArr = this.h;
            bArr[0] = (byte) (this.b & 255);
            try {
                readTLSVersion(inputStream, bArr);
                int contentLenght = readContentLenght(inputStream, this.h);
                ProxyLog.D(j, "TLS 包内容长度:" + contentLenght);
                byte[] bArr2 = new byte[contentLenght + 5];
                this.g = bArr2;
                System.arraycopy(this.h, 0, bArr2, 0, 5);
                for (int i = 0; i < contentLenght; i++) {
                    int i2 = i + 5;
                    this.g[i2] = (byte) inputStream.read();
                    if (i == 0) {
                        this.c = this.g[i2];
                    }
                }
                if (this.b == 22) {
                    int i3 = this.c;
                    if (i3 == 1) {
                        ProxyLog.D(j, "Client Hello 准备就绪！");
                    } else {
                        if (i3 != 2) {
                            return;
                        }
                        ProxyLog.D(j, "收到了 Server Hello!!!");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public int readContentLenght(InputStream inputStream, byte[] bArr) {
            try {
                bArr[3] = (byte) inputStream.read();
                bArr[4] = (byte) inputStream.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Utils.unsigned2ByteToInt(new byte[]{bArr[3], bArr[4]});
        }

        public void readTLSVersion(InputStream inputStream, byte[] bArr) {
            try {
                bArr[1] = (byte) inputStream.read();
                bArr[2] = (byte) inputStream.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void setContentType(int i) {
            this.b = i;
        }

        public void setInfo(int i) {
            this.a = i;
        }
    }

    public interface a {
        byte[] getApplicationData();

        int getType();
    }

    public ApplicationLayerParser(long j) {
        this.b = j;
    }

    public byte[] getApplicationData() {
        a aVar = this.a;
        if (aVar == null) {
            return null;
        }
        return aVar.getApplicationData();
    }

    public int getDataLength() {
        a aVar = this.a;
        if (aVar == null || aVar.getApplicationData() == null) {
            return 0;
        }
        return this.a.getApplicationData().length;
    }

    public void onConnected(InputStream inputStream) throws IOException {
    }

    public void setApplicationPackage(a aVar) {
        this.a = aVar;
    }
}
