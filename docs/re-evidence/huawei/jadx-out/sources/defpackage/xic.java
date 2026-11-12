package defpackage;

import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface;
import health.compact.a.LogUtil;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes20.dex */
class xic implements WifiP2pSendFileInterface {
    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public ByteBuffer wrapSendData(ByteBuffer byteBuffer, long j, int i) {
        return byteBuffer;
    }

    xic() {
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public int getSocketBufferLength(xia xiaVar) {
        if (xiaVar == null) {
            return 1024;
        }
        return getReadLength(xiaVar);
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public int readFile(ByteBuffer byteBuffer, long j, FileInputStream fileInputStream) throws IOException {
        if (byteBuffer == null || fileInputStream == null) {
            return 0;
        }
        FileChannel channel = fileInputStream.getChannel();
        int i = channel.read(byteBuffer, j);
        LogUtil.b("NormalWifiP2pSendFileImp", "read length : ", Integer.valueOf(i), "read size : ", Long.valueOf(channel.size()));
        return i;
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public void writeSocket(DataOutputStream dataOutputStream, ByteBuffer byteBuffer, int i, int i2) throws IOException {
        if (dataOutputStream == null || byteBuffer == null) {
            return;
        }
        dataOutputStream.write(byteBuffer.array(), 0, i);
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public int getReadLength(xia xiaVar) {
        if (xiaVar == null) {
            return 1024;
        }
        long jG = xiaVar.g();
        int iA = a(xiaVar.h());
        return jG > ((long) iA) ? iA : (int) jG;
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public long getWantSendLength(xia xiaVar) {
        if (xiaVar == null) {
            return 0L;
        }
        return xiaVar.g();
    }

    private int a(int i) {
        if (i >= 65536 || i == 0) {
            return 65536;
        }
        return (65536 / i) * i;
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public long getDeviceReceived(xia xiaVar) {
        if (xiaVar == null) {
            return 0L;
        }
        return xiaVar.k();
    }
}
