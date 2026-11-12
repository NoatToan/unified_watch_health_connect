package defpackage;

import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class coa {
    private static final Map<Integer, Byte> d = new HashMap(1);
    private int h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1891b = 0;
    private byte[] e = null;
    private byte[] f = null;
    private byte[] g = null;
    private cmi i = new cmi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1890a = 255;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1892c = 10;
    private int j = 255;

    private static int d(int i, int i2) {
        return (i << 8) | i2;
    }

    static {
        ArrayList<int[]> arrayList = new ArrayList(1);
        arrayList.add(new int[]{49, 2});
        for (int[] iArr : arrayList) {
            d.put(Integer.valueOf(d(iArr[0], iArr[1])), (byte) 1);
        }
    }

    public void d(cml cmlVar) {
        if (cmlVar == null) {
            LogUtil.e("DataParserInitial5A", "paramete is empty use default parameter");
            return;
        }
        this.f1890a = cmlVar.c();
        this.f1892c = cmlVar.d();
        this.j = cmlVar.i();
    }

    public ArrayList<byte[]> d(byte[] bArr) {
        ArrayList<byte[]> arrayList = new ArrayList<>(16);
        if (bArr == null || bArr.length <= 0) {
            LogUtil.e("DataParserInitial5A", "dataContent is empty.");
            return arrayList;
        }
        int length = bArr.length;
        if (length + 6 <= this.f1890a) {
            d(length, bArr, arrayList);
            return arrayList;
        }
        a(length, bArr, arrayList);
        return arrayList;
    }

    public List<cmb> a(byte[] bArr) {
        int i;
        ArrayList arrayList = new ArrayList(16);
        if (bArr == null || (i = this.j) == 0) {
            LogUtil.e("DataParserInitial5A", "wrapCommandPackage frame is empty or mMaxTransmissionUnit is zero.");
            return arrayList;
        }
        int length = bArr.length;
        if (length <= i) {
            cmb cmbVar = new cmb();
            cmbVar.a(bArr);
            cmbVar.c(this.f1892c);
            arrayList.add(cmbVar);
            return arrayList;
        }
        int i2 = length % i > 0 ? (length / i) + 1 : length / i;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.j;
            int i5 = i2 - 1;
            int i6 = i3 == i5 ? length - (i3 * i4) : i4;
            int i7 = i4 * i3;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i6 + i7);
            cmb cmbVar2 = new cmb();
            cmbVar2.a(bArrCopyOfRange);
            if (i3 == i5) {
                cmbVar2.c(this.f1892c);
            }
            arrayList.add(cmbVar2);
            i3++;
        }
        return arrayList;
    }

    private void d(int i, byte[] bArr, ArrayList<byte[]> arrayList) {
        byte[] bArrD = cph.d(cph.d(i + 1));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 6);
        int i2 = i + 4;
        byte[] bArr2 = new byte[i2];
        if (i2 <= 3) {
            return;
        }
        byteBufferAllocate.put((byte) 90);
        bArr2[0] = 90;
        byteBufferAllocate.put(bArrD);
        System.arraycopy(bArrD, 0, bArr2, 1, bArrD.length);
        byteBufferAllocate.put((byte) 0);
        bArr2[3] = 0;
        byteBufferAllocate.put(bArr);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        byteBufferAllocate.put(cov.e(bArr2));
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate.array());
    }

    private void a(int i, byte[] bArr, ArrayList<byte[]> arrayList) {
        int i2 = this.f1890a - 7;
        if (i2 == 0) {
            LogUtil.e("DataParserInitial5A", "wrapSlicedFrames slicedDataMaxLen is zero");
            return;
        }
        int i3 = i % i2 > 0 ? (i / i2) + 1 : i / i2;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i3 - 1;
            int i6 = i4 == i5 ? i - (i4 * i2) : i2;
            byte[] bArrD = cph.d(cph.d(i6 + 2));
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i6 + 7);
            int i7 = i6 + 5;
            byte[] bArr2 = new byte[i7];
            if (i7 <= 0) {
                return;
            }
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
            int i8 = i4 * i2;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i8, i6 + i8);
            byteBufferAllocate.put(bArrCopyOfRange);
            d(5, byteBufferAllocate, arrayList, bArrCopyOfRange, bArr2);
            i4++;
        }
    }

    private void d(int i, ByteBuffer byteBuffer, ArrayList<byte[]> arrayList, byte[] bArr, byte[] bArr2) {
        if (!d(byteBuffer, arrayList, bArr, bArr2)) {
            LogUtil.d("DataParserInitial5A", "the input param is invalid");
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        byteBuffer.put(cov.e(bArr2));
        byteBuffer.flip();
        arrayList.add(byteBuffer.array());
    }

    private boolean d(ByteBuffer byteBuffer, ArrayList<byte[]> arrayList, byte[] bArr, byte[] bArr2) {
        if (byteBuffer == null) {
            LogUtil.e("DataParserInitial5A", "frameBuffer is null.");
            return false;
        }
        if (arrayList == null) {
            LogUtil.e("DataParserInitial5A", "frameList is null.");
            return false;
        }
        if (bArr == null) {
            LogUtil.e("DataParserInitial5A", "slicedData is null.");
            return false;
        }
        if (bArr2 != null) {
            return true;
        }
        LogUtil.e("DataParserInitial5A", "checkBytes is null.");
        return false;
    }

    public byte[] b(int i, byte[] bArr) {
        if (i <= 0 || bArr == null || b(bArr)) {
            return null;
        }
        byte[] bArrE = new cqj().a(this.g).a(bArr).e();
        this.g = null;
        LogUtil.b("DataParserInitial5A", "spliceMTUPackage: ", bArrE, " mTotalDataLen is: ", Integer.valueOf(this.h));
        if (bArrE.length <= 0) {
            return null;
        }
        if (bArrE[0] == 90 && this.h == 0) {
            this.f = null;
            if (bArrE.length < 3) {
                cpl.d("DataParserInitial5A", bArrE, "dataOriginal error is ");
                return this.f;
            }
            if (c(bArrE, 1, 3)) {
                return this.f;
            }
            return null;
        }
        return b(bArrE, i);
    }

    private boolean b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = this.g;
        int length2 = bArr2 != null ? bArr2.length : 0;
        byte[] bArr3 = this.e;
        int length3 = length + length2 + (bArr3 != null ? bArr3.length : 0);
        if (length3 < 102400) {
            return false;
        }
        LogUtil.d("DataParserInitial5A", "sumDataLen exceed is ", Integer.valueOf(length3));
        c();
        return true;
    }

    private boolean c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return false;
        }
        this.g = null;
        if (i2 > bArr.length) {
            LogUtil.b("DataParserInitial5A", "endPosition bigger than linkDataLen.");
            this.g = bArr;
            e();
            return false;
        }
        int iD = d(bArr, i, i2) + 5;
        if (iD > bArr.length) {
            this.e = bArr;
            this.h = iD;
            int length = iD - bArr.length;
            this.f1891b = length;
            LogUtil.b("DataParserInitial5A", "handleDataContent multi mLeftDataLen is ", Integer.valueOf(length), " mTotalDataLen is ", Integer.valueOf(iD));
            return false;
        }
        if (iD == bArr.length) {
            LogUtil.b("DataParserInitial5A", "handleDataContent equal = ", Integer.valueOf(bArr.length));
            this.f = bArr;
            e();
            return true;
        }
        return a(bArr, i, i2);
    }

    private void e() {
        this.e = null;
        this.h = 0;
        this.f1891b = 0;
    }

    private int d(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return cph.e(bArr2, 0);
    }

    private boolean a(byte[] bArr, int i, int i2) {
        cpl.d("DataParserInitial5A", bArr, "handleDataContentNeedSplit tempContent : ");
        if (bArr == null) {
            return false;
        }
        int length = bArr.length;
        int i3 = 0;
        int i4 = length;
        while (i3 < length) {
            this.g = null;
            if (i2 > length) {
                int i5 = (length - i) + 1;
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, i - 1, bArr2, 0, i5);
                this.g = bArr2;
                LogUtil.b("DataParserInitial5A", "endPosition bigger than dataLength.");
                e();
                return true;
            }
            int iD = d(bArr, i, i2);
            LogUtil.b("DataParserInitial5A", "handleDataContent linkDataLen = ", Integer.valueOf(iD));
            int i6 = iD + 5;
            cqj cqjVar = new cqj();
            if (i6 >= i4) {
                if (i6 == i4) {
                    byte[] bArr3 = new byte[i6];
                    System.arraycopy(bArr, i3, bArr3, 0, i6);
                    this.f = cqjVar.a(this.f).a(bArr3).e();
                    this.f1891b = 0;
                    return true;
                }
                byte[] bArr4 = new byte[i4];
                System.arraycopy(bArr, i3, bArr4, 0, i4);
                this.e = cqjVar.a(this.e).a(bArr4).e();
                this.f1891b = i6 - i4;
                this.h = i6;
                break;
            }
            byte[] bArr5 = new byte[i6];
            System.arraycopy(bArr, i3, bArr5, 0, i6);
            this.f = cqjVar.a(this.f).a(bArr5).e();
            i3 += i6;
            i4 -= i6;
            i = i3 + 1;
            i2 = i3 + 3;
        }
        return true;
    }

    private byte[] b(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        if (this.h <= 0) {
            this.f1891b = 0;
            this.h = 0;
            this.g = null;
            this.f = null;
            LogUtil.b("DataParserInitial5A", "mTotalDataLen result is 0 return.");
            return null;
        }
        cqj cqjVar = new cqj();
        if (this.h < 3) {
            LogUtil.b("DataParserInitial5A", "getPackageNotSof is not 5A");
            byte[] bArrE = cqjVar.a(this.e).a(bArr).e();
            this.e = bArrE;
            return bArrE;
        }
        int i2 = this.f1891b;
        if (i < i2) {
            this.e = cqjVar.a(this.e).a(bArr).e();
            LogUtil.b("DataParserInitial5A", "dataLen less than mLeftDataLen.");
            this.f1891b -= i;
            return null;
        }
        if (i == i2) {
            LogUtil.b("DataParserInitial5A", "dataLen equal mLeftDataLen.");
            this.f1891b = 0;
            this.h = 0;
            byte[] bArrE2 = cqjVar.a(this.e).a(bArr).e();
            this.e = bArrE2;
            b();
            return bArrE2;
        }
        return e(bArr);
    }

    private byte[] e(byte[] bArr) {
        LogUtil.b("DataParserInitial5A", "dealMultiPackage mLeftDataLen: ", Integer.valueOf(this.f1891b));
        int length = bArr.length;
        int i = this.f1891b;
        if (length <= i) {
            return null;
        }
        if (bArr[i] == 90) {
            byte[] bArrE = new cqj().a(this.e).a(Arrays.copyOfRange(bArr, 0, i)).e();
            this.e = null;
            this.f = null;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f1891b, bArr.length);
            b();
            return c(bArrCopyOfRange, 1, 3) ? new cqj().a(bArrE).a(this.f).e() : bArrE;
        }
        this.e = null;
        LogUtil.b("DataParserInitial5A", "dealMultiPackage data is invalid.");
        this.f1891b = 0;
        this.h = 0;
        return this.e;
    }

    public List<cmi> d(int i, byte[] bArr) {
        LogUtil.b("DataParserInitial5A", "parseResponsePacket dataLen: ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList(16);
        if (i <= 0 || bArr == null) {
            LogUtil.d("DataParserInitial5A", "dateLen and dateContent is invalid");
            return arrayList;
        }
        if (bArr.length < 3) {
            cpl.d("DataParserInitial5A", bArr, "strDataContentHex's length is invalid with data is ");
            return arrayList;
        }
        int iD = d(bArr, 1, 3);
        if (iD + 5 == i) {
            return d(bArr, i, iD, arrayList);
        }
        LogUtil.b("DataParserInitial5A", "Multi package.");
        ArrayList arrayList2 = new ArrayList(16);
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArrD = d(bArr, arrayList, arrayList2, new int[]{i2, length, i3});
            int i4 = iArrD[0];
            if (i4 == -1) {
                return arrayList;
            }
            i3 = iArrD[1];
            i2 = i4;
        }
        d(i3, arrayList2, arrayList);
        return arrayList;
    }

    private List<cmi> d(byte[] bArr, int i, int i2, List<cmi> list) {
        LogUtil.b("DataParserInitial5A", "Single package.");
        cmi cmiVar = new cmi();
        if (bArr[0] == 90) {
            if (bArr.length < 4) {
                cpl.d("DataParserInitial5A", bArr, "strDataContentHex length is invalid with data is ");
                return list;
            }
            int iD = d(bArr, 3, 4) & 3;
            if (iD == 0) {
                cmiVar.a(false);
                cmiVar.d(e(bArr, 4, i - 2));
                cmiVar.b(true);
                cmiVar.c(i2 - 1);
                cmiVar.d(true);
            } else {
                cmiVar.a(true);
                cmiVar.d(e(bArr, 5, i - 2));
                cmiVar.b(true);
                cmiVar.c(i2 - 2);
                if (iD == 3) {
                    cmiVar.d(true);
                } else {
                    cmiVar.d(false);
                }
            }
            list.add(cmiVar);
            return list;
        }
        cmiVar.b(false);
        return null;
    }

    private byte[] e(byte[] bArr, int i, int i2) {
        try {
            return Arrays.copyOfRange(bArr, i, i2);
        } catch (IllegalArgumentException unused) {
            LogUtil.d("DataParserInitial5A", "IllegalArgumentException");
            return null;
        }
    }

    private int[] d(byte[] bArr, List<cmi> list, List<byte[]> list2, int[] iArr) {
        int i;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = i2 + 3;
        int[] iArr2 = new int[2];
        if (i3 < i4) {
            return b(bArr, i2, i3, iArr2);
        }
        int iD = d(bArr, i2 + 1, i4);
        int i5 = i2 + 4;
        if (i3 < i5) {
            return d(bArr, i2, i3, iD, iArr2);
        }
        int iD2 = d(bArr, i4, i5) & 3;
        int length = iArr[2];
        if (iD2 == 0) {
            if (d(iArr2, d(list, bArr, i2, iD, i3))) {
                return iArr2;
            }
        } else {
            LogUtil.b("DataParserInitial5A", "controlFsnInfo is multi package.");
            int i6 = i2 + 5;
            int i7 = i4 + iD;
            if (i7 + 2 > i3) {
                LogUtil.b("DataParserInitial5A", "finally package.");
                d(i3, iD, i2, bArr);
                i = 3;
            } else {
                if (i3 < i7 || i6 > i7) {
                    return c(iArr2, bArr);
                }
                int i8 = i7 - i6;
                byte[] bArr2 = new byte[i8];
                System.arraycopy(bArr, i6, bArr2, 0, i8);
                list2.add(bArr2);
                length += list2.get(list2.size() - 1).length;
                i = 3;
            }
            if (iD2 == i) {
                LogUtil.b("DataParserInitial5A", "Receive all Tag.");
                length = b(list, list2, length, i7, i3);
            }
        }
        return c(iArr2, iD, i2, length);
    }

    private int[] c(int[] iArr, int i, int i2, int i3) {
        if (iArr.length <= 1) {
            return iArr;
        }
        iArr[0] = i + 5 + i2;
        iArr[1] = i3;
        return iArr;
    }

    private int[] c(int[] iArr, byte[] bArr) {
        cpl.d("DataParserInitial5A", bArr, "checkLegal data is ");
        c();
        if (iArr.length <= 0) {
            return iArr;
        }
        iArr[0] = -1;
        return iArr;
    }

    private int b(List<cmi> list, List<byte[]> list2, int i, int i2, int i3) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        Iterator<byte[]> it = list2.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next());
        }
        cmi cmiVar = new cmi();
        cmiVar.d(byteBufferAllocate.array());
        cmiVar.a(true);
        cmiVar.c(i);
        if (i2 > i3) {
            cmiVar.d(false);
        } else {
            cmiVar.d(true);
        }
        list.add(cmiVar);
        list2.clear();
        return 0;
    }

    private void d(int i, int i2, int i3, byte[] bArr) {
        this.h = i2 + 5;
        if (bArr.length < i) {
            return;
        }
        int i4 = i - i3;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i3, bArr2, 0, i4);
        this.e = bArr2;
        this.f1891b = this.h - i4;
    }

    private void d(int i, List<byte[]> list, List<cmi> list2) {
        if (i > 0) {
            LogUtil.b("DataParserInitial5A", "slicedPayloadSize greater than zero.");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            Iterator<byte[]> it = list.iterator();
            while (it.hasNext()) {
                byteBufferAllocate.put(it.next());
            }
            cmi cmiVar = new cmi();
            cmiVar.a(true);
            cmiVar.d(byteBufferAllocate.array());
            cmiVar.c(i);
            cmiVar.d(false);
            list2.add(cmiVar);
        }
    }

    private int[] b(byte[] bArr, int i, int i2, int[] iArr) {
        cpl.c("DataParserInitial5A", bArr, "checkLegalLast dataContentBytes is ");
        if (bArr.length < i2 || iArr.length <= 0) {
            return iArr;
        }
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        this.e = bArr2;
        this.h = i3;
        cpl.d("DataParserInitial5A", bArr2, "checkLegalLast mDataContentBytes is ");
        iArr[0] = -1;
        return iArr;
    }

    private int[] d(byte[] bArr, int i, int i2, int i3, int[] iArr) {
        LogUtil.e("DataParserInitial5A", "checkLessHeader dataContentBytes is ", bArr);
        if (bArr.length < i2 || iArr.length <= 0) {
            return iArr;
        }
        int i4 = i2 - i;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        this.e = bArr2;
        this.h = i3;
        cpl.d("DataParserInitial5A", bArr2, "checkLessHeader mDataContentBytes is ");
        iArr[0] = -1;
        return iArr;
    }

    private List<cmi> d(List<cmi> list, byte[] bArr, int i, int i2, int i3) {
        LogUtil.b("DataParserInitial5A", "dealWithZero enter.");
        cmi cmiVar = new cmi();
        cmiVar.a(false);
        int i4 = i + 4;
        int i5 = i + 3 + i2;
        if (i5 > i3) {
            d(i3, i2, i, bArr);
            return null;
        }
        if (i4 > i5) {
            LogUtil.e("DataParserInitial5A", "dealWithZero strDataContentHex is error, data is ", bArr);
            c();
            return list;
        }
        a(list, cmiVar, bArr, new int[]{i4, i5, i2});
        return null;
    }

    private void a(List<cmi> list, cmi cmiVar, byte[] bArr, int[] iArr) {
        if (iArr.length <= 2) {
            return;
        }
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        if (bArr.length < i2) {
            return;
        }
        int i4 = i2 - i;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        cmiVar.d(bArr2);
        cmiVar.b(true);
        cmiVar.c(i3 - 1);
        cmiVar.d(true);
        list.add(cmiVar);
    }

    private boolean d(int[] iArr, List<cmi> list) {
        if (list == null) {
            return false;
        }
        if (iArr.length <= 0) {
            return true;
        }
        iArr[0] = -1;
        return true;
    }

    private void c() {
        this.h = 0;
        this.f1891b = 0;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public void b() {
        this.e = null;
        this.f1891b = 0;
        this.h = 0;
        this.f = null;
        this.g = null;
    }

    public void d(DeviceInfo deviceInfo, String str, cml cmlVar, List<cmi> list, MessageReceiveCallback messageReceiveCallback) {
        byte[] bArrA;
        byte[] bArrA2;
        if (deviceInfo == null || coq.d(list) || messageReceiveCallback == null) {
            LogUtil.e("DataParserInitial5A", "dealWithOnDataReceivedForList deviceInfo parameter exception.");
            return;
        }
        for (cmi cmiVar : list) {
            LogUtil.b("DataParserInitial5A", "slice info : ", Boolean.valueOf(cmiVar.c()), ". success info : ", Boolean.valueOf(cmiVar.e()), ". receivedAll info : ", Boolean.valueOf(cmiVar.d()));
            if (!cmiVar.c() && cmiVar.e()) {
                cmm cmmVarC = c(str, cmiVar);
                if (cmlVar != null && (bArrA2 = cjy.a(cmmVarC.d(), deviceInfo.getDeviceMac(), cmlVar.b())) != null) {
                    cmmVarC.a(bArrA2);
                }
                c(cmmVarC);
                messageReceiveCallback.onDataReceived(deviceInfo, cmmVarC, 0);
            } else {
                if (this.i.a() != 0 && this.i.b() != null) {
                    int iA = cmiVar.a() + this.i.a();
                    LogUtil.b("DataParserInitial5A", "sumTotalLength: ", Integer.valueOf(iA));
                    if (iA >= 102400) {
                        d();
                        return;
                    }
                    byte[] bArr = new byte[this.i.b().length + cmiVar.b().length];
                    System.arraycopy(this.i.b(), 0, bArr, 0, this.i.b().length);
                    System.arraycopy(cmiVar.b(), 0, bArr, this.i.b().length, cmiVar.b().length);
                    this.i.d(bArr);
                } else {
                    this.i.d(cmiVar.b());
                }
                this.i.c(cmiVar.a() + this.i.a());
                this.i.b(cmiVar.e());
                this.i.d(cmiVar.d());
            }
            if (this.i.d()) {
                cmm cmmVarC2 = c(str, this.i);
                if (cmlVar != null && (bArrA = cjy.a(cmmVarC2.d(), deviceInfo.getDeviceMac(), cmlVar.b())) != null) {
                    cmmVarC2.a(bArrA);
                }
                c(cmmVarC2);
                cpl.d("DataParserInitial5A", cmmVarC2.d(), "on received multiple frames: ");
                messageReceiveCallback.onDataReceived(deviceInfo, cmmVarC2, 0);
                d();
            }
        }
    }

    private void c(cmm cmmVar) {
        byte[] bArrD = cmmVar.d();
        if (bArrD == null || bArrD.length < 2) {
            return;
        }
        byte b2 = bArrD[0];
        byte b3 = bArrD[1];
        if (!cop.h()) {
            if (d.get(Integer.valueOf(d(b2, b3))) != null) {
                LogUtil.b("DataParserInitial5A", "on received single frame serviceId: ", Integer.valueOf(b2), " commandId: ", Integer.valueOf(b3));
                return;
            } else {
                cpl.d("DataParserInitial5A", cmmVar.d(), "on received single frame:");
                return;
            }
        }
        if (b2 == 27 || b2 == 39) {
            ReleaseLogUtil.c("DEVMGR_DataParserInitial5A", "response sid: ", Integer.valueOf(b2), " cid: ", Integer.valueOf(b3));
        }
        if (b2 == 9 && b3 != 3) {
            ReleaseLogUtil.c("DEVMGR_DataParserInitial5A", "on received single frame: ", cpl.b(bArrD, true));
        }
        if (b2 == 8 && b3 == 8) {
            ReleaseLogUtil.c("DEVMGR_DataParserInitial5A", "on received single frame serviceId: ", Integer.valueOf(b2), " commandId: ", Integer.valueOf(b3));
        }
    }

    private cmm c(String str, cmi cmiVar) {
        cmm cmmVar = new cmm();
        if (cmiVar == null) {
            LogUtil.d("DataParserInitial5A", "sliceResponse is empty");
            return cmmVar;
        }
        cmmVar.c(str);
        cmmVar.a(cmiVar.b());
        return cmmVar;
    }

    public void d() {
        this.i.d(false);
        this.i.c(0);
        this.i.d((byte[]) null);
        this.i.a(false);
    }
}
