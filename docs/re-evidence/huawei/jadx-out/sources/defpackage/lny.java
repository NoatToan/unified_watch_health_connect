package defpackage;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lny extends BTDeviceDataWrapBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40523b;
    private Context e;

    private int a(int i, int i2, int i3, int i4) {
        int i5;
        if (2 == i4) {
            i5 = (i * 16384) + (i2 * 128);
        } else {
            if (1 != i4) {
                return i3;
            }
            i5 = i * 128;
        }
        return i5 + i3;
    }

    public lny(Context context, int i) {
        this.e = null;
        this.f40523b = -1;
        if (context != null) {
            this.e = context;
        }
        this.f40523b = i;
    }

    private byte[] a(int i) {
        String strB;
        int i2 = i + 3;
        if (16384 <= i2) {
            strB = cph.b((i2 >> 14) + 128) + cph.b((i2 >> 7) + 128) + cph.b(i2 & 127);
        } else if (128 <= i2) {
            strB = cph.b((i2 >> 7) + 128) + cph.b(i2 & 127);
        } else {
            strB = cph.b(i2);
        }
        return cph.d(strB);
    }

    private void e(int i, byte[] bArr, ArrayList<byte[]> arrayList) {
        byte[] bArrA = a(i);
        int length = bArrA.length;
        int i2 = length + 4;
        int i3 = i + i2 + 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i3);
        byte[] bArrE = e(i3, bArrA, length, byteBufferAllocate);
        byteBufferAllocate.put((byte) 1);
        bArrE[length + 2] = 1;
        byteBufferAllocate.put((byte) 1);
        bArrE[length + 3] = 1;
        byteBufferAllocate.put(bArr);
        for (byte b2 : bArr) {
            bArrE[i2] = b2;
            i2++;
        }
        byteBufferAllocate.put(lnb.e(this.e).e(bArrE));
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate.array());
    }

    private void a(int i, byte[] bArr, ArrayList<byte[]> arrayList) {
        int i2;
        if (i <= 127) {
            i2 = 1;
        } else if (i <= 16383) {
            i2 = 2;
        } else if (i > 2080641) {
            return;
        } else {
            i2 = 3;
        }
        int i3 = ((this.f40523b - 1) - i2) - 5;
        int i4 = i % i3 > 0 ? (i / i3) + 1 : i / i3;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 * i3;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i6, (i5 == i4 + (-1) ? i - (i5 * i3) : i3) + i6);
            byte[] bArrA = a(bArrCopyOfRange.length);
            int length = bArrA.length;
            int i7 = length + 4;
            int length2 = bArrCopyOfRange.length + i7 + 2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byte[] bArrE = e(length2, bArrA, length, byteBufferAllocate);
            byte b2 = (byte) i4;
            byteBufferAllocate.put(b2);
            bArrE[length + 2] = b2;
            int i8 = i5 + 1;
            byte b3 = (byte) i8;
            byteBufferAllocate.put(b3);
            bArrE[length + 3] = b3;
            byteBufferAllocate.put(bArrCopyOfRange);
            copyByHead(i7, byteBufferAllocate, arrayList, this.e, bArrCopyOfRange, bArrE);
            i5 = i8;
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase
    public ArrayList<byte[]> wrapCommandPackets(int i, byte[] bArr) {
        if (i <= 0 || bArr == null) {
            return null;
        }
        ArrayList<byte[]> arrayList = new ArrayList<>(1);
        if (a(i).length + 4 + i + 2 <= this.f40523b) {
            e(i, bArr, arrayList);
            return arrayList;
        }
        a(i, bArr, arrayList);
        return arrayList;
    }

    private int e(byte[] bArr) {
        String strD = cph.d(bArr);
        if (strD.length() < 4) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV1ProtocolDataWrap", "start responseHex len is incorrect.");
            return 0;
        }
        int i = 2;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i + 2;
            if (e(strD.substring(i, i6)) > 127) {
                try {
                    i4 = Integer.parseInt(strD.substring(i, i6), 16);
                } catch (NumberFormatException unused) {
                    LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV1ProtocolDataWrap", "number format error.");
                }
                if (i5 == 0) {
                    i2 = i4 - 128;
                } else if (i5 == 1) {
                    i3 = i4 - 128;
                }
                i5++;
                if (strD.length() < i + 4) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV1ProtocolDataWrap", "parse responseHex len is incorrect.");
                    return 0;
                }
                i = i6;
            } else {
                try {
                    i4 = Integer.parseInt(strD.substring(i, i6), 16);
                } catch (NumberFormatException unused2) {
                    LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV1ProtocolDataWrap", "num number format error.");
                }
                return a(i2, i3, i4, i5);
            }
        }
    }

    private int e(String str) {
        if (str == null) {
            return 128;
        }
        try {
            return Integer.parseInt(str, 16);
        } catch (NumberFormatException e) {
            LogUtil.d("BTDeviceV1ProtocolDataWrap", "parseInt errorcode fail,msg=", e.getMessage());
            return 128;
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase
    public List<lnq> parseResponsePacket(int i, byte[] bArr) {
        int i2;
        byte[] bArrCopyOfRange;
        if (i <= 0 || bArr == null) {
            return null;
        }
        int iE = e(bArr);
        if (iE == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV1ProtocolDataWrap", "dataTotalLen : 0.");
            return null;
        }
        int i3 = 5;
        int i4 = 3;
        if (16384 <= iE) {
            i2 = 6;
        } else if (128 <= iE) {
            i4 = 2;
            i2 = 5;
            i3 = 4;
        } else {
            i3 = 3;
            i2 = 4;
            i4 = 1;
        }
        if (-86 == bArr[0]) {
            int i5 = i4 + 4;
            int i6 = i - 2;
            if (i6 <= i5 || bArr.length <= i6) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV1ProtocolDataWrap", "dataTotalLen : 0.");
                return null;
            }
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i6);
        } else {
            bArrCopyOfRange = null;
        }
        if (bArr.length <= i3) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV1ProtocolDataWrap", "dataContent.length less than pack_total_position so return null.");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c(bArr, i3, bArrCopyOfRange, i2, iE));
        return arrayList;
    }

    private lnq c(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        byte b2 = bArr[i];
        lnq lnqVar = new lnq();
        if (1 == b2) {
            lnqVar.a(false);
            lnqVar.b(bArr2);
            return lnqVar;
        }
        lnqVar.a(true);
        if (bArr.length <= i2) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV1ProtocolDataWrap", "dataContent length less than pack_index_position.");
            return null;
        }
        byte b3 = bArr[i2];
        lnqVar.b(i3);
        lnqVar.b(bArr2);
        if (b2 == b3) {
            lnqVar.d(true);
            return lnqVar;
        }
        lnqVar.d(false);
        return lnqVar;
    }

    private byte[] e(int i, byte[] bArr, int i2, ByteBuffer byteBuffer) {
        byte[] bArr2 = new byte[i - 2];
        byteBuffer.put((byte) -86);
        bArr2[0] = -86;
        byteBuffer.put(bArr);
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = i3 + 1;
            bArr2[i4] = bArr[i3];
            i3 = i4;
        }
        byteBuffer.put((byte) 0);
        bArr2[i2 + 1] = 0;
        return bArr2;
    }
}
