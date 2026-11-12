package com.huawei.hwbtsdk.btmanager.btlinklayerwrap;

import android.content.Context;
import defpackage.lnb;
import defpackage.lnq;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BTDeviceDataWrapBase {
    public abstract List<lnq> parseResponsePacket(int i, byte[] bArr);

    public abstract ArrayList<byte[]> wrapCommandPackets(int i, byte[] bArr);

    public String spliceMTUPackage(int i, byte[] bArr) {
        if (bArr == null) {
            LogUtil.b("BTDeviceDataWrapBase", "dataContent is null");
            return "";
        }
        return "";
    }

    public void resetPackageInfo() {
        LogUtil.b("BTDeviceDataWrapBase", "resetPackageInfo");
    }

    public void setDeviceMaxFrameSize(int i) {
        LogUtil.b("BTDeviceDataWrapBase", "setDeviceMaxFrameSize");
    }

    protected void copyByHead(int i, ByteBuffer byteBuffer, ArrayList<byte[]> arrayList, Context context, byte[]... bArr) {
        if (byteBuffer == null || arrayList == null || context == null || bArr == null) {
            return;
        }
        byte[] bArr2 = bArr[0];
        byte[] bArr3 = bArr[1];
        System.arraycopy(bArr2, 0, bArr3, i, bArr2.length);
        byteBuffer.put(lnb.e(context).e(bArr3));
        byteBuffer.flip();
        arrayList.add(byteBuffer.array());
    }
}
