package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes7.dex */
public class dns {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32087c = new Object();
    private static dns e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExtendHandler f32088a;
    private WspFileTransferCallback f;
    private dnu g = new dnu();
    private dnt h = new dnt();
    private ConcurrentHashMap<Integer, dno> d = new ConcurrentHashMap<>(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<Integer, dob> f32089b = new ConcurrentHashMap<>(20);

    private dns() {
    }

    public static dns c() {
        dns dnsVar;
        synchronized (f32087c) {
            if (e == null) {
                e = new dns();
            }
            dnsVar = e;
        }
        return dnsVar;
    }

    public void e(WspFileTransferCallback wspFileTransferCallback) {
        this.f = wspFileTransferCallback;
    }

    public void c(byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            LogUtil.j("WspFileCommandHandler", "onHandleUploadBleFileData() dataBytes is error.");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 2) {
            LogUtil.a("WspFileCommandHandler", "get 5.44.2 command");
            e(bArr);
            return;
        }
        if (b2 == 3) {
            LogUtil.a("WspFileCommandHandler", "get 5.44.3 command");
            d(bArr);
            return;
        }
        if (b2 == 5) {
            LogUtil.a("WspFileCommandHandler", "get 5.44.5 command");
            b(bArr);
            return;
        }
        if (b2 == 6) {
            LogUtil.a("WspFileCommandHandler", "get 5.44.6 command");
            i(bArr);
        } else if (b2 == 7) {
            LogUtil.a("WspFileCommandHandler", "get 5.44.7 command");
            j(bArr);
        } else if (b2 != 8) {
            LogUtil.a("WspFileCommandHandler", "onHandleUploadBleFileData() default");
        } else {
            LogUtil.a("WspFileCommandHandler", "get 5.44.8 command");
            a(bArr);
        }
    }

    private void a(byte[] bArr) {
        LogUtil.a("WspFileCommandHandler", "onHandleFileInfoRequestCommand enter.");
        dnx dnxVarC = this.g.c(bArr);
        if (dnxVarC == null) {
            LogUtil.j("WspFileCommandHandler", "onHandleFileSendCommand wspFileRequestCommand is null");
            return;
        }
        WspFileTransferCallback wspFileTransferCallback = this.f;
        if (wspFileTransferCallback != null) {
            wspFileTransferCallback.onStart(dnxVarC.i().size());
        } else {
            LogUtil.e("WspFileCommandHandler", "onHandleFileInfoRequestCommand callback is null");
        }
    }

    private void j(byte[] bArr) {
        e(330005);
        dnv dnvVarD = this.g.d(bArr);
        if (dnvVarD == null) {
            LogUtil.j("WspFileCommandHandler", "onHandleFileSendCommand wspFileInfoCommand is null");
            return;
        }
        dno dnoVar = new dno();
        dnoVar.c(dnvVarD.j());
        dnoVar.e(dnvVarD.i());
        dnoVar.d(dnvVarD.f());
        dnoVar.e(dnvVarD.g());
        int iJ = dnvVarD.j();
        LogUtil.a("WspFileCommandHandler", "File info ", Integer.valueOf(iJ), "|", dnvVarD.i(), "|", Integer.valueOf(dnvVarD.g()));
        this.d.put(Integer.valueOf(dnoVar.b()), dnoVar);
        if (dnoVar.g() == 0) {
            int iJ2 = dnvVarD.j();
            this.h.d(iJ2, 1);
            this.f.onSuccess(iJ2, 30004, dnoVar.i());
        } else {
            this.h.a(dnvVarD.j(), 1);
        }
    }

    private void e(byte[] bArr) {
        dnw dnwVarA = this.g.a(bArr);
        if (dnwVarA == null) {
            LogUtil.j("WspFileCommandHandler", "onHandleFileCheckCommand wspFileCheckCommand is null");
            return;
        }
        int iH = dnwVarA.h();
        LogUtil.a("WspFileCommandHandler", "wspFileInfo is ", this.d.get(Integer.valueOf(iH)) == null ? Constants.NULL : "not null", "file id is ", Integer.valueOf(iH), "mTransferringFileMap size:", Integer.valueOf(this.d.size()));
        dno dnoVar = this.d.get(Integer.valueOf(iH));
        if (dnoVar != null) {
            dnoVar.b(dnwVarA.f());
            this.h.c(iH);
        }
    }

    private void d(byte[] bArr) {
        dob dobVarE = this.g.e(bArr);
        if (dobVarE == null) {
            LogUtil.j("WspFileCommandHandler", "onHandleFileParameterCommand wspFileTransferParameterCommand is null");
            return;
        }
        dobVarE.c(dobVarE.e() + 5);
        int iC = dobVarE.c();
        this.f32089b.put(Integer.valueOf(iC), dobVarE);
        if (this.d.get(Integer.valueOf(iC)) != null) {
            dno dnoVar = this.d.get(Integer.valueOf(iC));
            int iB = dnoVar.b();
            LogUtil.a("WspFileCommandHandler", "get file log for id:", Integer.valueOf(iB), " get file log for file name:", dnoVar.a());
            dnoVar.e(ByteBuffer.allocate(dnoVar.g()));
            this.h.e(iC, dnoVar.e(), dnoVar.c());
            if (this.f32089b.get(Integer.valueOf(iC)) != null) {
                c(iC, this.f32089b.get(Integer.valueOf(iC)).e());
            }
        }
    }

    private void b(byte[] bArr) throws Throwable {
        doc docVarA;
        String strA;
        String strE = eeq.e(bArr);
        LogUtil.d("WspFileCommandHandler", "data all package:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 16 || (docVarA = this.g.a(strE)) == null) {
            return;
        }
        int iH = docVarA.h();
        dno dnoVar = this.d.get(Integer.valueOf(iH));
        if (dnoVar == null) {
            ReleaseLogUtil.e("R_Weight_WspFileCommandHandler", "onHandleFileReceivedCommand fileId error");
            return;
        }
        LogUtil.a("WspFileCommandHandler", "for 5.44.4 return data fileid:", Integer.valueOf(iH), " filename:", dnoVar.a());
        int iJ = docVarA.j();
        int iF = docVarA.f();
        if (dnoVar.e() != iJ || dnoVar.f() != iF) {
            ReleaseLogUtil.e("R_Weight_WspFileCommandHandler", "handleDeviceDataReceived fileOffset or psn error");
            return;
        }
        WspFileTransferCallback wspFileTransferCallback = this.f;
        if (wspFileTransferCallback != null && !TextUtils.isEmpty(wspFileTransferCallback.getFilePath())) {
            strA = a(this.f.getFilePath(), dnoVar.a());
        } else {
            strA = "";
        }
        dnoVar.c(strA);
        LogUtil.a("WspFileCommandHandler", "save log file in:", strA);
        int iG = dnoVar.g() > 0 ? (iJ * 100) / dnoVar.g() : 0;
        LogUtil.a("WspFileCommandHandler", "reportProgressForUi progress:", Integer.valueOf(iG));
        WspFileTransferCallback wspFileTransferCallback2 = this.f;
        if (wspFileTransferCallback2 != null) {
            wspFileTransferCallback2.onProgress(iH, iG, dnoVar.a());
        }
        e(docVarA.g(), iH, iF, dnoVar);
    }

    private void e(String str, int i, int i2, dno dnoVar) throws Throwable {
        e(i);
        LogUtil.a("WspFileCommandHandler", "save file package:", str);
        byte[] bArrC = eeq.c(str);
        ReleaseLogUtil.d("R_Weight_WspFileCommandHandler", "init handleFileReceivedRequest", Integer.valueOf(i2), "|", Integer.valueOf(bArrC.length));
        LogUtil.a("WspFileCommandHandler", "handleFileReceivedRequest put bytes");
        ByteBuffer byteBufferD = dnoVar.d();
        if (byteBufferD == null) {
            LogUtil.j("WspFileCommandHandler", "handleFileReceivedRequest getByteAll is null");
            return;
        }
        ReleaseLogUtil.d("R_Weight_WspFileCommandHandler", "fileId:", Integer.valueOf(i), ", bytes size:", Integer.valueOf(byteBufferD.limit()), "|", Integer.valueOf(byteBufferD.position()));
        if (byteBufferD.position() + bArrC.length <= dnoVar.g()) {
            byteBufferD.put(bArrC);
            dnoVar.a(dnoVar.e() + bArrC.length);
        } else {
            int iG = dnoVar.g() - byteBufferD.position();
            LogUtil.a("WspFileCommandHandler", "last size:", Integer.valueOf(iG));
            byte[] bArr = new byte[iG];
            ByteBuffer.wrap(bArrC).get(bArr);
            byteBufferD.put(bArr);
            dnoVar.a(dnoVar.e() + iG);
        }
        LogUtil.a("WspFileCommandHandler", "bytes size:", Integer.valueOf(byteBufferD.limit()), "|", Integer.valueOf(byteBufferD.position()));
        ReleaseLogUtil.d("R_Weight_WspFileCommandHandler", "out handleFileReceivedRequest, ", Integer.valueOf(dnoVar.e()), "|", Integer.valueOf(dnoVar.g()));
        if (dnoVar.e() < dnoVar.g()) {
            LogUtil.a("WspFileCommandHandler", "go to next");
            this.h.e(i, dnoVar.e(), dnoVar.c());
        } else {
            e(i);
            this.h.d(i, 1);
            b(dnoVar);
            ReleaseLogUtil.d("R_Weight_WspFileCommandHandler", "log file saved");
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.FileOutputStream] */
    private void b(dno dnoVar) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        if (TextUtils.isEmpty(dnoVar.i())) {
            ReleaseLogUtil.e("R_Weight_WspFileCommandHandler", "file path is empty");
            return;
        }
        ?? file = new File(dnoVar.i());
        ?? r4 = 0;
        bufferedOutputStream = null;
        ?? r5 = 0;
        BufferedOutputStream bufferedOutputStream3 = null;
        BufferedOutputStream bufferedOutputStream4 = null;
        try {
            try {
                if (file.getParentFile() != null) {
                    file = FileUtils.openOutputStream(file);
                    try {
                        bufferedOutputStream2 = new BufferedOutputStream(file);
                        try {
                            bufferedOutputStream2.write(dnoVar.d().array());
                            bufferedOutputStream2.flush();
                            e(dnoVar);
                            r5 = file;
                        } catch (IOException unused) {
                            bufferedOutputStream4 = bufferedOutputStream2;
                            LogUtil.e("WspFileCommandHandler", "createFileWithByte File IOException");
                            if (file != 0) {
                                try {
                                    file.close();
                                } catch (IOException unused2) {
                                    LogUtil.e("WspFileCommandHandler", "createFileWithByte outputStream close error");
                                }
                            }
                            if (bufferedOutputStream4 != null) {
                                try {
                                    bufferedOutputStream4.close();
                                    return;
                                } catch (IOException unused3) {
                                    LogUtil.e("WspFileCommandHandler", "createFileWithByte bufferedOutputStream close error");
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream3 = bufferedOutputStream2;
                            BufferedOutputStream bufferedOutputStream5 = bufferedOutputStream3;
                            r4 = file;
                            bufferedOutputStream = bufferedOutputStream5;
                            if (r4 != 0) {
                                try {
                                    r4.close();
                                } catch (IOException unused4) {
                                    LogUtil.e("WspFileCommandHandler", "createFileWithByte outputStream close error");
                                }
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                    throw th;
                                } catch (IOException unused5) {
                                    LogUtil.e("WspFileCommandHandler", "createFileWithByte bufferedOutputStream close error");
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused6) {
                    }
                } else {
                    bufferedOutputStream2 = null;
                }
                if (r5 != 0) {
                    try {
                        r5.close();
                    } catch (IOException unused7) {
                        LogUtil.e("WspFileCommandHandler", "createFileWithByte outputStream close error");
                    }
                }
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused8) {
                        LogUtil.e("WspFileCommandHandler", "createFileWithByte bufferedOutputStream close error");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused9) {
            file = 0;
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
            if (r4 != 0) {
                r4.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
                throw th;
            }
            throw th;
        }
    }

    private String a(String str, String str2) {
        return CommonUtil.c(str + File.separator + str2);
    }

    private void e(dno dnoVar) {
        int iB = dnoVar.b();
        if (this.d.get(Integer.valueOf(iB)) != null) {
            this.d.remove(Integer.valueOf(iB));
        }
        if (this.f32089b.get(Integer.valueOf(iB)) != null) {
            this.f32089b.remove(Integer.valueOf(iB));
        }
        boolean zIsEmpty = this.d.isEmpty();
        WspFileTransferCallback wspFileTransferCallback = this.f;
        if (wspFileTransferCallback != null) {
            wspFileTransferCallback.onSuccess(iB, zIsEmpty ? 30000 : 30004, dnoVar.i());
        }
    }

    private void i(byte[] bArr) {
        Optional<dny> optionalB = this.g.b(bArr);
        if (!optionalB.isPresent()) {
            LogUtil.j("WspFileCommandHandler", "onHandleFileResultNotifyCommand wspFileResultNotifyCommand is null");
            return;
        }
        if (optionalB.get().e() != 100000) {
            WspFileTransferCallback wspFileTransferCallback = this.f;
            if (wspFileTransferCallback != null) {
                wspFileTransferCallback.onFailure(30001, null);
                return;
            }
            return;
        }
        c(330005, 10);
    }

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.a("WspFileCommandHandler", "msg is ", Integer.valueOf(message.arg1));
            if (message.arg1 != 100) {
                return false;
            }
            int i = message.what;
            LogUtil.a("WspFileCommandHandler", "wait timeout! file id:", Integer.valueOf(i));
            if (i == 10) {
                if (dns.this.f != null) {
                    dns.this.f.onSuccess(i, 30004, null);
                }
            } else {
                if (dns.this.f != null) {
                    dns.this.f.onFailure(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, null);
                }
                dns.this.h.d(i, 3);
            }
            dns.this.e(i);
            return true;
        }
    }

    private void c(int i, int i2) {
        if (this.f32088a == null) {
            this.f32088a = HandlerCenter.b(new c(), "WspFileCommandHandler");
        }
        if (i2 != 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 100;
            this.f32088a.sendMessage(messageObtain, ((long) i2) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        ExtendHandler extendHandler = this.f32088a;
        if (extendHandler != null) {
            extendHandler.removeMessages(i);
        }
    }
}
