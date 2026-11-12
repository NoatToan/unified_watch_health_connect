package defpackage;

import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
class xhz implements WifiP2pSendFileInterface {
    xhz() {
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public int getSocketBufferLength(xia xiaVar) {
        return getReadLength(xiaVar);
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public ByteBuffer wrapSendData(ByteBuffer byteBuffer, long j, int i) {
        if (byteBuffer == null || i != 0) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.array().length + 5);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(cph.d(cph.b(j)));
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(cph.f(i));
        System.arraycopy(byteBufferWrap.array(), 0, byteBufferAllocate.array(), 0, 4);
        System.arraycopy(byteBufferWrap2.array(), 0, byteBufferAllocate.array(), 4, 1);
        System.arraycopy(byteBuffer.array(), 0, byteBufferAllocate.array(), 5, byteBuffer.array().length);
        return byteBufferAllocate;
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public int readFile(ByteBuffer byteBuffer, long j, FileInputStream fileInputStream) throws IOException {
        if (byteBuffer == null || fileInputStream == null) {
            return 0;
        }
        return fileInputStream.getChannel().read(byteBuffer, j);
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public void writeSocket(DataOutputStream dataOutputStream, ByteBuffer byteBuffer, int i, int i2) throws IOException {
        if (dataOutputStream == null || byteBuffer == null) {
            return;
        }
        if (i2 == 0) {
            dataOutputStream.write(byteBuffer.array(), 0, i + 5);
        } else {
            dataOutputStream.write(byteBuffer.array(), 0, i);
        }
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public int getReadLength(xia xiaVar) {
        if (xiaVar == null) {
            return 147456;
        }
        return (int) Math.min(xiaVar.p(), 147456L);
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public long getWantSendLength(xia xiaVar) {
        if (xiaVar == null) {
            return 0L;
        }
        return xiaVar.p() + xiaVar.k();
    }

    @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface
    public long getDeviceReceived(xia xiaVar) {
        if (xiaVar == null) {
            return 0L;
        }
        return xiaVar.r() + xiaVar.s();
    }
}
