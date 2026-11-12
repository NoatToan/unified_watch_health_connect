package defpackage;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class loh extends BTDeviceDataWrapBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40553a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40555c;
    private int d;
    private int i = 0;
    private int j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40554b = "";
    private String e = "";

    public loh(Context context, int i) {
        this.f40553a = null;
        this.d = -1;
        if (context != null) {
            this.f40553a = context;
        }
        this.d = i;
    }

    private void d(int i, byte[] bArr, ArrayList<byte[]> arrayList) {
        byte[] bArrD = cph.d(cph.d(i + 1));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 6);
        byte[] bArr2 = new byte[i + 4];
        byteBufferAllocate.put((byte) 90);
        bArr2[0] = 90;
        byteBufferAllocate.put(bArrD);
        System.arraycopy(bArrD, 0, bArr2, 1, bArrD.length);
        byteBufferAllocate.put((byte) 0);
        bArr2[3] = 0;
        byteBufferAllocate.put(bArr);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        byteBufferAllocate.put(lnb.e(this.f40553a).e(bArr2));
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate.array());
    }

    private void b(int i, byte[] bArr, ArrayList<byte[]> arrayList) {
        int i2 = this.d - 7;
        int i3 = i % i2 > 0 ? (i / i2) + 1 : i / i2;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i3 - 1;
            int i6 = i4 == i5 ? i - (i4 * i2) : i2;
            byte[] bArrD = cph.d(cph.d(i6 + 2));
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i6 + 7);
            byte[] bArr2 = new byte[i6 + 5];
            byteBufferAllocate.put((byte) 90);
            bArr2[0] = 90;
            byteBufferAllocate.put(bArrD);
            System.arraycopy(bArrD, 0, bArr2, 1, bArrD.length);
            if (i4 == 0) {
                byteBufferAllocate.put((byte) 1);
                bArr2[3] = 1;
            } else if (i4 == i5) {
                byteBufferAllocate.put((byte) 3);
                bArr2[3] = 3;
            } else {
                byteBufferAllocate.put((byte) 2);
                bArr2[3] = 2;
            }
            byte b2 = (byte) i4;
            byteBufferAllocate.put(b2);
            bArr2[4] = b2;
            int i7 = i4 * i2;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i6 + i7);
            byteBufferAllocate.put(bArrCopyOfRange);
            copyByHead(5, byteBufferAllocate, arrayList, this.f40553a, bArrCopyOfRange, bArr2);
            i4++;
        }
    }

    @Override // com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase
    public ArrayList<byte[]> wrapCommandPackets(int i, byte[] bArr) {
        ArrayList<byte[]> arrayList = new ArrayList<>(12);
        if (i > 0 && bArr != null) {
            if (i + 6 <= this.d) {
                d(i, bArr, arrayList);
                return arrayList;
            }
            b(i, bArr, arrayList);
        }
        return arrayList;
    }

    @Override // com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase
    public List<lnq> parseResponsePacket(int i, byte[] bArr) {
        LogUtil.b("BTDeviceV2ProtocolDataWrap", "packet dataLen: ", Integer.valueOf(i));
        if (i <= 0 || bArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(12);
        String strD = cph.d(bArr);
        if (strD.length() < 6) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "strDataContentHex length is invalid with data is ", strD);
            return arrayList;
        }
        int iC = cpb.c(strD.substring(2, 6), 16);
        if (iC + 5 == i) {
            return b(bArr, strD, i, iC, arrayList);
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "Multi package.");
        ArrayList arrayList2 = new ArrayList(12);
        int length = strD.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArrC = c(strD, arrayList, arrayList2, i2, length, i3);
            int i4 = iArrC[0];
            if (i4 == -1) {
                return arrayList;
            }
            i3 = iArrC[1];
            i2 = i4;
        }
        b(i3, arrayList2, arrayList);
        return arrayList;
    }

    private int[] c(String str, List<lnq> list, List<byte[]> list2, int... iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = i + 6;
        int[] iArr2 = new int[2];
        if (i2 < i3) {
            return b(str, i, i2, iArr2);
        }
        int iC = cpb.c(str.substring(i + 2, i3), 16);
        int i4 = i + 8;
        if (i2 < i4) {
            return c(str, i, i2, iC, iArr2);
        }
        int iC2 = cpb.c(str.substring(i3, i4), 16) & 3;
        int length = iArr[2];
        if (iC2 == 0) {
            if (d(iArr2, c(list, str, i, iC, i2))) {
                return iArr2;
            }
        } else {
            int i5 = i + 10;
            int i6 = ((iC + 3) * 2) + i;
            boolean z = i6 + 4 > i2;
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "controlFSNInfo is multi package isLess: ", Boolean.valueOf(z));
            if (z) {
                e(i2, iC, i, str);
            } else {
                if (i2 < i6 || i5 > i6) {
                    return a(iArr2, str);
                }
                list2.add(cph.d(str.substring(i5, i6)));
                length += list2.get(list2.size() - 1).length;
            }
            if (iC2 == 3) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "Receive all Tag.");
                if (length > 0) {
                    length = a(list, list2, length, i6, i2);
                }
            }
        }
        return b(iArr2, iC, i, length);
    }

    private boolean d(int[] iArr, List<lnq> list) {
        if (list == null) {
            return false;
        }
        iArr[0] = -1;
        return true;
    }

    private int[] a(int[] iArr, String str) {
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "strDataContentHex length is invalid for copy common data content with data is ", str);
        a();
        iArr[0] = -1;
        return iArr;
    }

    private int[] b(int[] iArr, int i, int i2, int i3) {
        iArr[0] = ((i + 5) * 2) + i2;
        iArr[1] = i3;
        return iArr;
    }

    private List<lnq> c(List<lnq> list, String str, int i, int i2, int i3) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "controlFSNInfo is single package.");
        lnq lnqVar = new lnq();
        lnqVar.a(false);
        int i4 = i + 8;
        int i5 = ((i2 + 3) * 2) + i;
        if (i5 > i3) {
            e(i3, i2, i, str);
            return null;
        }
        if (i3 < i5 || i4 > i5) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "strDataContentHex length is invalid for copy common data content with data is ", str);
            a();
            ArrayList arrayList = new ArrayList(16);
            arrayList.addAll(list);
            return arrayList;
        }
        b(list, lnqVar, str, i4, i5, i2);
        return null;
    }

    private void e(int i, int i2, int i3, String str) {
        this.i = i2 + 5;
        String strSubstring = str.substring(i3, i);
        this.f40555c = strSubstring;
        this.j = this.i - (strSubstring.length() / 2);
    }

    private int a(List<lnq> list, List<byte[]> list2, int i, int i2, int i3) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        Iterator<byte[]> it = list2.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next());
        }
        lnq lnqVar = new lnq();
        lnqVar.b(byteBufferAllocate.array());
        lnqVar.a(true);
        lnqVar.b(i);
        if (i2 > i3) {
            lnqVar.d(false);
        } else {
            lnqVar.d(true);
        }
        list.add(lnqVar);
        list2.clear();
        return 0;
    }

    private void b(List<lnq> list, lnq lnqVar, String str, int... iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        lnqVar.b(cph.d(str.substring(i, i2)));
        lnqVar.b(true);
        lnqVar.b(i3 - 1);
        lnqVar.d(true);
        list.add(lnqVar);
    }

    private int[] b(String str, int i, int i2, int[] iArr) {
        String strSubstring = str.substring(i, i2);
        this.f40555c = strSubstring;
        this.i = strSubstring.length() / 2;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "The left data len less then header length with left data is ", this.f40555c, " strDataContentHex:", str);
        iArr[0] = -1;
        return iArr;
    }

    private List<lnq> b(byte[] bArr, String str, int i, int i2, List<lnq> list) {
        lnq lnqVar = new lnq();
        if (bArr[0] == 90) {
            ArrayList arrayList = new ArrayList(16);
            if (str.length() < 8) {
                arrayList.addAll(list);
                return arrayList;
            }
            int iC = cpb.c(str.substring(6, 8), 16) & 3;
            if (iC == 0) {
                lnqVar.a(false);
                lnqVar.b(Arrays.copyOfRange(bArr, 4, i - 2));
                lnqVar.b(true);
                lnqVar.b(i2 - 1);
                lnqVar.d(true);
            } else {
                lnqVar.a(true);
                if (i - 7 < 0) {
                    LogUtil.e("BTDeviceV2ProtocolDataWrap", "data is error, return");
                    return null;
                }
                lnqVar.b(Arrays.copyOfRange(bArr, 5, i - 2));
                lnqVar.b(true);
                lnqVar.b(i2 - 2);
                if (3 == iC) {
                    lnqVar.d(true);
                } else {
                    lnqVar.d(false);
                }
            }
            list.add(lnqVar);
            arrayList.addAll(list);
            return arrayList;
        }
        lnqVar.b(false);
        return null;
    }

    private int[] c(String str, int i, int i2, int i3, int[] iArr) {
        String strSubstring = str.substring(i, i2);
        this.f40555c = strSubstring;
        this.i = i3;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "The left data len less then header length with left data is ", strSubstring, " strDataContentHex: ", str);
        iArr[0] = -1;
        return iArr;
    }

    private void b(int i, List<byte[]> list, List<lnq> list2) {
        if (i > 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "Exist sliced package and not receive last package.");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            Iterator<byte[]> it = list.iterator();
            while (it.hasNext()) {
                byteBufferAllocate.put(it.next());
            }
            lnq lnqVar = new lnq();
            lnqVar.a(true);
            lnqVar.b(byteBufferAllocate.array());
            lnqVar.b(i);
            lnqVar.d(false);
            list2.add(lnqVar);
        }
    }

    private void a() {
        this.i = 0;
        this.j = 0;
        this.f40555c = "";
        this.f40554b = "";
        this.e = "";
    }

    @Override // com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase
    public String spliceMTUPackage(int i, byte[] bArr) {
        if (i <= 0 || bArr == null) {
            return null;
        }
        String str = this.e + cph.d(bArr);
        this.e = "";
        LogUtil.b("BTDeviceV2ProtocolDataWrap", "package: ", new byte[str.length() / 2], "mV2DataLen: ", Integer.valueOf(this.i));
        byte[] bArrD = cph.d(str);
        if (bArrD[0] == 90 && this.i == 0) {
            this.f40554b = "";
            if (str.length() < 6) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "strDataContentHex length is invalid with data is ", str);
                return "";
            }
            if (!d(bArrD, str, 2, 6)) {
                return "";
            }
            return this.f40554b;
        }
        int i2 = this.i;
        if (i2 <= 0) {
            e();
            return "";
        }
        if (i2 < 6) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV2ProtocolDataWrap", "mV2TotalDataLenlessthanlinkheaderlength.");
            String str2 = this.f40555c + cph.d(bArrD);
            this.f40555c = str2;
            return str2;
        }
        return e(i, bArrD);
    }

    private void e() {
        this.j = 0;
        this.i = 0;
        this.e = "";
        this.f40554b = "";
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV2ProtocolDataWrap", "mV2TotalDataLen result is 0 return.");
    }

    private String e(int i, byte[] bArr) {
        int i2 = this.j;
        if (i < i2) {
            this.f40555c += cph.d(bArr);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV2ProtocolDataWrap", "data content len less than mV2LeftDataLen.");
            this.j -= i;
            return "";
        }
        if (i == i2) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV2ProtocolDataWrap", "data content len equal mV2LeftDataLen.");
            this.j = 0;
            this.i = 0;
            String str = this.f40555c + cph.d(bArr);
            this.f40555c = str;
            resetPackageInfo();
            return str;
        }
        return a(bArr);
    }

    private boolean d(byte[] bArr, String str, int i, int i2) {
        this.e = "";
        if (i2 > bArr.length * 2) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV2ProtocolDataWrap", "endPosition bigger than linkDataLen.");
            this.e = cph.d(bArr);
            d();
            return false;
        }
        int iC = cpb.c(str.substring(i, i2), 16) + 5;
        if (iC > bArr.length) {
            this.f40555c = cph.d(bArr);
            this.i = iC;
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceV2ProtocolDataWrap", "mV2TotalDataLen is ", Integer.valueOf(iC), " dataContent.length:", Integer.valueOf(bArr.length));
            this.j = this.i - bArr.length;
            return false;
        }
        if (iC == bArr.length) {
            LogUtil.b("BTDeviceV2ProtocolDataWrap", "dataContentLen: ", Integer.valueOf(bArr.length));
            this.f40554b = cph.d(bArr);
            d();
            return true;
        }
        return c(bArr, str, i, i2);
    }

    private boolean c(byte[] bArr, String str, int i, int i2) {
        String strD = cph.d(bArr);
        int length = bArr.length;
        int i3 = length;
        int i4 = 0;
        while (i4 < length) {
            this.e = "";
            if (i2 > length * 2) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV2ProtocolDataWrap", "endPosition bigger than dataLength.");
                this.e = str.substring(i - 2);
                d();
                return true;
            }
            int iC = cpb.c(str.substring(i, i2), 16);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV2ProtocolDataWrap", "handleDataContent linkDataLen = ", Integer.valueOf(iC));
            int i5 = iC + 5;
            if (i5 >= i3) {
                if (i5 == i3) {
                    this.f40554b += strD.substring(i4 * 2, (i4 + i5) * 2);
                    this.j = 0;
                    return true;
                }
                this.f40555c += strD.substring(i4 * 2, (i4 + i3) * 2);
                this.j = i5 - i3;
                this.i = i5;
                break;
            }
            int i6 = i4 + i5;
            int i7 = i6 * 2;
            this.f40554b += strD.substring(i4 * 2, i7);
            i3 -= i5;
            i = i7 + 2;
            i4 = i6;
            i2 = i7 + 6;
        }
        return true;
    }

    private void d() {
        this.f40555c = "";
        this.i = 0;
        this.j = 0;
    }

    private String a(byte[] bArr) {
        int i = this.j;
        boolean z = bArr[i] == 90;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceV2ProtocolDataWrap", "data content len more than dealMultiPackage mV2LeftDataLen:", Integer.valueOf(i), " isEqualsSof:", Boolean.valueOf(z));
        if (z) {
            String str = this.f40555c + cph.d(Arrays.copyOfRange(bArr, 0, this.j));
            this.f40555c = "";
            this.f40554b = "";
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.j, bArr.length);
            resetPackageInfo();
            if (!d(bArrCopyOfRange, cph.d(bArrCopyOfRange), 2, 6)) {
                return str;
            }
            return str + this.f40554b;
        }
        this.f40555c = "";
        this.j = 0;
        this.i = 0;
        return "";
    }

    @Override // com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase
    public void resetPackageInfo() {
        this.f40555c = "";
        this.j = 0;
        this.i = 0;
        this.f40554b = "";
        this.e = "";
    }

    @Override // com.huawei.hwbtsdk.btmanager.btlinklayerwrap.BTDeviceDataWrapBase
    public void setDeviceMaxFrameSize(int i) {
        this.d = i;
    }
}
