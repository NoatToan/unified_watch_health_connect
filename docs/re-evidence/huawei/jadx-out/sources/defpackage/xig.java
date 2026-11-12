package defpackage;

import androidx.media3.common.C;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pSendFileInterface;
import health.compact.a.LogUtil;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xig extends Thread {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f53041c = new d();
    private ExtendHandler e;

    public xig() {
        setName("WifiP2pSendTask");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        LogUtil.b("WifiP2pSendTask", "WifiP2pSendTask enter. : ", this);
        this.e = HandlerCenter.e("WifiP2pSendTask");
        while (true) {
            try {
                xia xiaVarTake = HwWifiP2pTransferManager.a().h().take();
                if (xiaVarTake == null) {
                    LogUtil.e("WifiP2pSendTask", "quit thread.");
                    this.e.quit(true);
                    return;
                }
                LogUtil.b("WifiP2pSendTask", "get task : ", xiaVarTake, "path : ", xiaVarTake.f(), " length : ", Long.valueOf(xiaVarTake.g()), " tag : ", Integer.valueOf(xiaVarTake.w()));
                if (b(xiaVarTake)) {
                    LogUtil.e("WifiP2pSendTask", "stop thread.");
                    HwWifiP2pTransferManager.a().h().clear();
                    this.e.quit(true);
                    return;
                } else if (xiaVarTake.u() == 2) {
                    c(xiaVarTake);
                } else {
                    e(xiaVarTake);
                }
            } catch (InterruptedException e) {
                LogUtil.d("WifiP2pSendTask", "WifiP2pSendTask take task wrong : ", cpc.c(e));
            }
        }
    }

    private boolean b(xia xiaVar) {
        return xiaVar.w() == 1;
    }

    private void c(xia xiaVar) throws Throwable {
        FileOutputStream fileOutputStream;
        if (xiaVar != null) {
            long j = 0;
            if (xiaVar.g() >= 0) {
                LogUtil.b("WifiP2pSendTask", "recvCommonFile path is:", xiaVar.f(), " size:", Long.valueOf(xiaVar.g()));
                byte[] bArr = new byte[new xic().getSocketBufferLength(xiaVar)];
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        File file = new File(xiaVar.f());
                        File file2 = new File(file.getParent());
                        if (!file2.exists()) {
                            LogUtil.b("WifiP2pSendTask", "recv file directory not exists, create related directory.");
                            if (file2.mkdir()) {
                                LogUtil.b("WifiP2pSendTask", "recv file directory create success");
                            }
                        }
                        d(file);
                        if (!file.createNewFile()) {
                            LogUtil.b("WifiP2pSendTask", "WifiP2pSendTask isFileCreate false");
                            cpm.d(null);
                            return;
                        }
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            DataInputStream dataInputStream = new DataInputStream(xii.d().e().getInputStream());
                            i(xiaVar);
                            int i = 0;
                            while (true) {
                                int i2 = dataInputStream.read(bArr);
                                if (i2 < 0) {
                                    cpm.d(fileOutputStream);
                                    break;
                                }
                                e();
                                HwWifiP2pTransferManager.a().q();
                                j += (long) i2;
                                LogUtil.b("WifiP2pSendTask", "recvLen:", Integer.valueOf(i2), " recvTotal: ", Long.valueOf(j));
                                int iG = (int) ((100 * j) / xiaVar.g());
                                b(xiaVar, iG, i);
                                LogUtil.b("WifiP2pSendTask", "writeLen :" + fileOutputStream.getChannel().write(ByteBuffer.wrap(bArr, 0, i2)));
                                if (j >= xiaVar.g()) {
                                    fileOutputStream.getChannel().close();
                                    a(xiaVar);
                                    LogUtil.b("WifiP2pSendTask", "recv file success.");
                                    cpm.d(fileOutputStream);
                                    return;
                                }
                                i(xiaVar);
                                i = iG;
                            }
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream2 = fileOutputStream;
                            LogUtil.d("WifiP2pSendTask", "recvCommonFile error is: ", e);
                            cpm.d(fileOutputStream2);
                        } catch (Throwable th) {
                            th = th;
                            cpm.d(fileOutputStream);
                            throw th;
                        }
                        e();
                        b(xiaVar, 1004, "recv file error");
                        LogUtil.b("WifiP2pSendTask", "recv file fail.");
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
        }
        b(xiaVar, 1001, "recvCommonFile params is wrong.");
    }

    private void d(File file) {
        if (file.exists() && file.delete()) {
            LogUtil.b("WifiP2pSendTask", "WifiP2pSendTask isFileDelete true");
        }
    }

    private void e(xia xiaVar) throws Throwable {
        IOException e;
        FileInputStream fileInputStreamC;
        if (xiaVar == null || xiaVar.k() < 0 || xiaVar.p() < 0) {
            b(xiaVar, 1001, "fileInfo params is wrong.");
            return;
        }
        LogUtil.b("WifiP2pSendTask", " filePath is: ", xiaVar.f(), " sendLength is: ", Long.valueOf(xiaVar.p()), "file length : ", Long.valueOf(xiaVar.g()));
        WifiP2pSendFileInterface wifiP2pSendFileInterfaceD = d(xiaVar);
        if (wifiP2pSendFileInterfaceD == null) {
            b(xiaVar, 1001, "special tag set wrong.");
            return;
        }
        HwWifiP2pTransferManager hwWifiP2pTransferManagerA = HwWifiP2pTransferManager.a();
        Socket socketE = xii.d().e();
        if (!a(socketE, xiaVar)) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(socketE.getOutputStream());
            fileInputStreamC = hwWifiP2pTransferManagerA.c(xiaVar.q(), xiaVar.f(), xiaVar.v());
            try {
                if (fileInputStreamC == null) {
                    LogUtil.e("WifiP2pSendTask", "file info is wrong, please check.");
                    b(xiaVar, 1017, "can not get inputStream, please check.");
                    LogUtil.b("WifiP2pSendTask", "close io");
                    cpm.d(fileInputStreamC);
                    return;
                }
                d(xiaVar, wifiP2pSendFileInterfaceD, dataOutputStream, fileInputStreamC, hwWifiP2pTransferManagerA);
                LogUtil.b("WifiP2pSendTask", "close io");
                cpm.d(fileInputStreamC);
                LogUtil.b("WifiP2pSendTask", "read file to outputStream over.");
            } catch (IOException e2) {
                e = e2;
                try {
                    LogUtil.d("WifiP2pSendTask", "sendCommonFile error is: ", cpc.c(e));
                    e(hwWifiP2pTransferManagerA, xiaVar);
                    LogUtil.b("WifiP2pSendTask", "close io");
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStreamC;
                    fileInputStreamC = fileInputStream;
                    LogUtil.b("WifiP2pSendTask", "close io");
                    cpm.d(fileInputStreamC);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                LogUtil.b("WifiP2pSendTask", "close io");
                cpm.d(fileInputStreamC);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStreamC = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStreamC = fileInputStream;
            LogUtil.b("WifiP2pSendTask", "close io");
            cpm.d(fileInputStreamC);
            throw th;
        }
    }

    private boolean a(Socket socket, xia xiaVar) {
        if (socket != null) {
            return true;
        }
        b(xiaVar, 1019, "socket is null. please check.");
        return false;
    }

    private void d(xia xiaVar, WifiP2pSendFileInterface wifiP2pSendFileInterface, DataOutputStream dataOutputStream, FileInputStream fileInputStream, HwWifiP2pTransferManager hwWifiP2pTransferManager) throws IOException {
        WifiP2pSendFileInterface wifiP2pSendFileInterface2 = wifiP2pSendFileInterface;
        FileInputStream fileInputStream2 = fileInputStream;
        long wantSendLength = wifiP2pSendFileInterface2.getWantSendLength(xiaVar);
        long jSkip = fileInputStream2.skip(xiaVar.k());
        long deviceReceived = wifiP2pSendFileInterface2.getDeviceReceived(xiaVar);
        long jK = xiaVar.k();
        int socketBufferLength = wifiP2pSendFileInterface2.getSocketBufferLength(xiaVar);
        LogUtil.b("WifiP2pSendTask", "readLength : ", Long.valueOf(wifiP2pSendFileInterface2.getReadLength(xiaVar)), "skipSize ", Long.valueOf(jSkip), "wantSendLength : ", Long.valueOf(wantSendLength), "totalSendSize : ", Long.valueOf(deviceReceived), "contentBufferSize : ", Integer.valueOf(socketBufferLength), "inputStream:", Integer.valueOf(fileInputStream.available()), " allOffset:", Long.valueOf(jK));
        List<Integer> listE = xiaVar.e();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(socketBufferLength);
        int i = -1;
        int i2 = 0;
        while (true) {
            int i3 = socketBufferLength;
            int file = wifiP2pSendFileInterface2.readFile(byteBufferAllocate, jK, fileInputStream2);
            if (file <= 0) {
                break;
            }
            if (!c(hwWifiP2pTransferManager, xiaVar)) {
                LogUtil.e("WifiP2pSendTask", "stop wifi P2p");
                break;
            }
            LogUtil.b("WifiP2pSendTask", "ready write data.");
            if (a(i2, listE)) {
                i(xiaVar);
                wifiP2pSendFileInterface2.writeSocket(dataOutputStream, wifiP2pSendFileInterface2.wrapSendData(byteBufferAllocate, jK, i2), file, i2);
                byteBufferAllocate.clear();
                LogUtil.b("WifiP2pSendTask", "close time out.");
                e();
            }
            long j = file;
            jK += j;
            deviceReceived += j;
            LogUtil.b("WifiP2pSendTask", "write over.", "send allOffset : ", Long.valueOf(jK));
            int iG = (int) ((100 * deviceReceived) / xiaVar.g());
            i2++;
            b(xiaVar, iG, i);
            dataOutputStream.flush();
            if (wantSendLength <= jK) {
                LogUtil.b("WifiP2pSendTask", "this wifi send all send.");
                break;
            }
            socketBufferLength = i3;
            long jMin = Math.min(wantSendLength - jK, socketBufferLength);
            byteBufferAllocate = ByteBuffer.allocate((int) jMin);
            LogUtil.b("WifiP2pSendTask", "readLength : ", Long.valueOf(jMin));
            wifiP2pSendFileInterface2 = wifiP2pSendFileInterface;
            fileInputStream2 = fileInputStream;
            i = iG;
            listE = listE;
        }
        c(deviceReceived, xiaVar);
    }

    private void i(xia xiaVar) {
        LogUtil.b("WifiP2pSendTask", "ready new timer.");
        d dVar = new d();
        this.f53041c = dVar;
        dVar.a(xiaVar);
        this.e.postTask(this.f53041c, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
    }

    private void e() {
        this.e.removeTasksAndMessages();
    }

    private void e(HwWifiP2pTransferManager hwWifiP2pTransferManager, xia xiaVar) {
        if (hwWifiP2pTransferManager.m() == 1) {
            b(xiaVar, 1004, "wifi socket ioException");
        } else {
            LogUtil.e("WifiP2pSendTask", "wifi socket exception. please check.");
        }
        e();
    }

    private boolean c(HwWifiP2pTransferManager hwWifiP2pTransferManager, xia xiaVar) {
        if (hwWifiP2pTransferManager.m() == 1) {
            return true;
        }
        if (hwWifiP2pTransferManager.m() == 2) {
            LogUtil.b("WifiP2pSendTask", "user stop send file.");
            b(xiaVar, 1014, "user stop wifi");
        }
        if (hwWifiP2pTransferManager.m() != 5) {
            return false;
        }
        LogUtil.b("WifiP2pSendTask", "watch post repeat ");
        hwWifiP2pTransferManager.s();
        return false;
    }

    private WifiP2pSendFileInterface d(xia xiaVar) {
        int iW = xiaVar.w();
        if ((iW & 2) == 2) {
            return new xic();
        }
        if ((iW & 4) == 4) {
            return new xhz();
        }
        LogUtil.e("WifiP2pSendTask", "unknown tag, please check : ", Integer.valueOf(iW));
        return null;
    }

    private boolean a(int i, List<Integer> list) {
        if (list == null) {
            return true;
        }
        if (i <= list.size() - 1) {
            return list.get(i).intValue() == 0;
        }
        LogUtil.e("WifiP2pSendTask", "psn > bitmap.size, please check 5.9.3");
        return true;
    }

    private void c(long j, xia xiaVar) {
        long jG = xiaVar.g();
        LogUtil.b("WifiP2pSendTask", "total : ", Long.valueOf(j), " fileLength : ", Long.valueOf(jG));
        if (j == jG) {
            a(xiaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(xia xiaVar, int i, String str) {
        if (xiaVar != null && xiaVar.n() != null) {
            xiaVar.n().onFail(i, str, xiaVar.l());
        } else {
            LogUtil.e("WifiP2pSendTask", "set params is wrong, please check fileInfo and listener");
        }
    }

    private void b(xia xiaVar, int i, int i2) {
        if (xiaVar == null || xiaVar.n() == null) {
            LogUtil.e("WifiP2pSendTask", "onProcess set params is wrong, please check fileInfo and listener");
            return;
        }
        LogUtil.b("WifiP2pSendTask", "wifi p2p file : process : ", Integer.valueOf(i));
        xiaVar.n().onProcess(i, xiaVar.l());
        HwWifiP2pTransferManager.a().ad();
    }

    private void a(xia xiaVar) {
        if (xiaVar == null || xiaVar.n() == null) {
            LogUtil.e("WifiP2pSendTask", "onSuccess set params is wrong, please check fileInfo and listener");
        } else {
            LogUtil.b("WifiP2pSendTask", "file send onSuccess");
            xiaVar.n().onSuccess(10000, "file send over.", xiaVar.l());
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private xia f53042b;
        private xig d;

        private d(xig xigVar) {
            this.d = xigVar;
        }

        void a(xia xiaVar) {
            this.f53042b = xiaVar;
            LogUtil.b("WifiP2pSendTask", "mWifiP2pFileInfo : ", xiaVar);
            xia xiaVar2 = this.f53042b;
            if (xiaVar2 != null) {
                if (xiaVar2.n() != null) {
                    LogUtil.b("WifiP2pSendTask", "listener : ", this.f53042b.n());
                    return;
                } else {
                    LogUtil.e("WifiP2pSendTask", "listener is null.");
                    return;
                }
            }
            LogUtil.e("WifiP2pSendTask", "file info is null.");
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.e("WifiP2pSendTask", "socket timeout, please check device, close wifi try again. direct:", Integer.valueOf(this.f53042b.u()));
            this.d.b(this.f53042b, 1018, "socket send data timeout. please check device, close wifi try again.");
        }
    }
}
