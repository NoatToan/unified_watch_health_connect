package com.huawei.unitedevice.hwwifip2ptransfermgr;

import defpackage.xia;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public interface WifiP2pSendFileInterface {
    long getDeviceReceived(xia xiaVar);

    int getReadLength(xia xiaVar);

    int getSocketBufferLength(xia xiaVar);

    long getWantSendLength(xia xiaVar);

    int readFile(ByteBuffer byteBuffer, long j, FileInputStream fileInputStream) throws IOException;

    ByteBuffer wrapSendData(ByteBuffer byteBuffer, long j, int i);

    void writeSocket(DataOutputStream dataOutputStream, ByteBuffer byteBuffer, int i, int i2) throws IOException;
}
