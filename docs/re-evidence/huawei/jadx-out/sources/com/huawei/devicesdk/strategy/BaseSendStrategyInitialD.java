package com.huawei.devicesdk.strategy;

import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SimpleDataHead;
import defpackage.cjz;
import defpackage.cmb;
import defpackage.cmd;
import defpackage.cmg;
import defpackage.cmm;
import defpackage.cmp;
import defpackage.cmt;
import defpackage.cmw;
import defpackage.cmx;
import defpackage.coo;
import defpackage.cov;
import defpackage.cpl;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseSendStrategyInitialD extends SendStrategy {
    private static final int DEFAULT_SINGLE_PACKAGE_INFO_LENGTH = 5;
    private static final int HIGH_4BIT = 240;
    private static final int INDEX_DATA_HEAD = 0;
    private static final int INDEX_PACKAGE_INFO = 2;
    private static final int INDEX_PACKAGE_LENGTH = 1;
    private static final byte LEN_PACKAGE_CHECK_CODE = 2;
    private static final byte LEN_PACKAGE_LENGTH = 1;
    private static final int LOW_4BIT = 15;
    private static final int MAX_SINGLE_PACKAGE_DATA_LENGTH = 15;
    private static final int PACKAGE_SEND_INTERVAL = 10;
    private static final String TAG = "BaseSendStrategyInitialD";
    private static final int TOTAL_PACKAGE_BIT_COUNT = 4;

    private byte getPackageInfo(int i, int i2) {
        return (byte) ((((i - 1) & 15) << 4) | (i2 & 15));
    }

    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public void destroy(String str) {
    }

    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public void parseReceiveFrames(DeviceInfo deviceInfo, cmm cmmVar, MessageReceiveCallback messageReceiveCallback) {
        if (deviceInfo == null || cmmVar == null || messageReceiveCallback == null) {
            LogUtil.e(TAG, "parseReceiveFrames device frame or callback parameter exception.");
            return;
        }
        byte[] bArrD = cmmVar.d();
        if (!isResponseDataValid(bArrD)) {
            LogUtil.d(TAG, "response data is invalid");
            messageReceiveCallback.onDataReceived(deviceInfo, getReceiveFrame(deviceInfo, cmmVar.b()), 0);
        }
        cmt.b().b(deviceInfo.getDeviceMac(), cmx.a());
        cmw cmwVar = parse(bArrD);
        boolean zIsFrameReceiveFinish = isFrameReceiveFinish(cmwVar);
        boolean zIsEncryptedDataHead = SimpleDataHead.isEncryptedDataHead(cmwVar.a().getDataHead());
        cmx.a().d(deviceInfo.getDeviceMac(), cmmVar.b(), cmwVar.c(), zIsEncryptedDataHead);
        if (!zIsFrameReceiveFinish) {
            LogUtil.b(TAG, "parseReceiveFrames is not finish.");
        } else {
            messageReceiveCallback.onDataReceived(deviceInfo, getReceiveFrame(deviceInfo, cmmVar.b()), 0);
        }
    }

    public boolean isInputDataValid(byte[] bArr) {
        if (bArr != null) {
            return true;
        }
        LogUtil.d(TAG, "input data is empty.");
        return false;
    }

    protected ArrayList<cmd> constructBluetoothFrame(boolean z, byte[] bArr, cmg cmgVar) {
        if (bArr == null || cmgVar == null) {
            LogUtil.e(TAG, "constructBluetoothFrame content or message exception.");
            return new ArrayList<>(0);
        }
        ArrayList<cmd> arrayList = new ArrayList<>();
        List<byte[]> listSeparateFramePackages = separateFramePackages((z ? SimpleDataHead.DC : SimpleDataHead.DB).getDataHead(), bArr);
        ArrayList arrayList2 = new ArrayList();
        for (byte[] bArr2 : listSeparateFramePackages) {
            cmb cmbVar = new cmb();
            cmbVar.a(bArr2);
            cmbVar.c(10);
            arrayList2.add(cmbVar);
        }
        arrayList.add(coo.b(cmgVar, arrayList2));
        return arrayList;
    }

    private List<byte[]> separateFramePackages(byte b2, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        List<byte[]> listSeparateToGroup = separateToGroup(bArr, 15);
        int size = listSeparateToGroup.size();
        int i = 0;
        for (byte[] bArr2 : listSeparateToGroup) {
            int length = bArr2.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 5);
            byteBufferAllocate.put(b2);
            byteBufferAllocate.put((byte) (length + 3));
            byteBufferAllocate.put(getPackageInfo(size, i));
            byteBufferAllocate.put(bArr2, 0, length);
            byte[] checkCode = getCheckCode(byteBufferAllocate.array());
            byteBufferAllocate.put(checkCode[1]);
            byteBufferAllocate.put(checkCode[0]);
            arrayList.add(byteBufferAllocate.array());
            i++;
        }
        return arrayList;
    }

    private List<byte[]> separateToGroup(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0 || bArr.length == 0) {
            arrayList.add(bArr);
            return arrayList;
        }
        int length = bArr.length / i;
        int i2 = bArr.length % i != 0 ? 1 : 0;
        int i3 = 0;
        while (i3 < length + i2) {
            int i4 = i3 * i;
            i3++;
            int iMin = Math.min(i3 * i, bArr.length) - i4;
            byte[] bArr2 = new byte[iMin];
            System.arraycopy(bArr, i4, bArr2, 0, iMin);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    private byte[] getCheckCode(byte[] bArr) {
        cpl.d(TAG, bArr, "getCheckCode data: ");
        return cov.e(bArr);
    }

    private cmm getReceiveFrame(DeviceInfo deviceInfo, String str) {
        cmm cmmVar = new cmm();
        cmmVar.c(str);
        cmp cmpVarC = cmx.a().c(deviceInfo.getDeviceMac(), str, true);
        byte[] bArrB = cmpVarC.b();
        if (cmpVarC.a()) {
            bArrB = new cjz().decrypt(bArrB, deviceInfo.getDeviceMac());
        }
        cpl.d(TAG, bArrB, "uuid is " + str + "On Received Frame: ");
        cmmVar.a(bArrB);
        return cmmVar;
    }

    private boolean isResponseDataValid(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.d(TAG, "[isDataFrameValid]input data is empty.");
            return false;
        }
        if (SimpleDataHead.get(bArr[0]) == SimpleDataHead.INVALID) {
            LogUtil.d(TAG, "[isDataFrameValid]data head is not expected. data head is null.");
            return false;
        }
        if (bArr.length >= 5) {
            return true;
        }
        LogUtil.d(TAG, "[isDataFrameValid]data frame length is less than min data length.");
        return false;
    }

    private cmw parse(byte[] bArr) {
        cmw cmwVar = new cmw();
        try {
            cmwVar.c(SimpleDataHead.get(bArr[0]));
            byte b2 = bArr[1];
            cmwVar.a(b2);
            cmwVar.d(bArr[2]);
            int i = b2 - 3;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 3, bArr2, 0, i);
            cmwVar.a(bArr2);
            byte[] bArr3 = new byte[2];
            System.arraycopy(bArr, b2 - 2, bArr3, 0, 2);
            cmwVar.b(bArr3);
            return cmwVar;
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.d(TAG, "parse ArrayIndexOutOfBoundsException");
            return cmwVar;
        }
    }

    private boolean isFrameReceiveFinish(cmw cmwVar) {
        byte bE = cmwVar.e();
        byte b2 = (byte) ((bE & 240) >> 4);
        return b2 == 0 || b2 == ((byte) (bE & 15));
    }
}
