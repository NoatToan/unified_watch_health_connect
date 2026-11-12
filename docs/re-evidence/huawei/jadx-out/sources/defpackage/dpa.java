package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.kit.hwwsp.TlvDeviceCommand;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes7.dex */
public class dpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f32172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32173c;
    private List<doz> d;
    private int e;
    private String f;
    private int g;
    private boolean h;
    private int i;
    private FileInputStream j;
    private double k;
    private dov l;
    private int m;
    private int n;
    private dzv o;

    private dpa() {
        this.i = 0;
        this.j = null;
        this.d = new ArrayList(16);
        this.g = 0;
        this.e = 0;
        this.f32173c = 0;
        this.k = 1.0d;
        this.h = false;
        this.m = 0;
        this.o = new dzv();
        this.f32172b = new Handler(Looper.getMainLooper()) { // from class: dpa.2
            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                super.dispatchMessage(message);
                LogUtil.a("TlvOtaUpdate", "msg what:", Integer.valueOf(message.what));
                int i = message.what;
                if (i != 1) {
                    switch (i) {
                        case 257:
                            dpa.this.e(message.arg1);
                            break;
                        case 258:
                            dpa.this.b(message.arg1);
                            break;
                        case 259:
                            Object obj = message.obj;
                            if (obj != null && (obj instanceof byte[])) {
                                try {
                                    dpa.this.a((byte[]) obj);
                                } catch (eeu unused) {
                                    LogUtil.e("TlvOtaUpdate", "dealWithResultData exception");
                                    return;
                                }
                            } else {
                                LogUtil.j("TlvOtaUpdate", "result data is not legal");
                                dpa.this.b(109001, 0L);
                            }
                            break;
                        default:
                            LogUtil.j("TlvOtaUpdate", "dispatchMessage default");
                            break;
                    }
                    return;
                }
                dpa.this.b(1);
            }
        };
    }

    public static dpa b() {
        return a.f32175c;
    }

    public void e(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            LogUtil.j("TlvOtaUpdate", "update filePath is null");
            b(5, 0L);
            return;
        }
        File file = new File(str3);
        if (!file.exists()) {
            LogUtil.j("TlvOtaUpdate", "update file is not exist");
            b(5, 0L);
            return;
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            this.f = canonicalPath;
            this.i = this.o.c(canonicalPath);
            this.n = 0;
            this.f32171a = str;
            b(this.f32171a, str2, (int) this.o.e(str3), this.n);
        } catch (IOException unused) {
            LogUtil.e("TlvOtaUpdate", "update file get path IOException");
            b(5, 0L);
        }
    }

    private void b(String str, String str2, int i, int i2) {
        TlvDeviceCommand tlvDeviceCommand = new TlvDeviceCommand();
        tlvDeviceCommand.setServiceId(9);
        tlvDeviceCommand.setCommandId(1);
        String strA = eeq.a(str2);
        byte[] bArrC = eeq.c((eeq.d(1) + eeq.d(strA.length() / 2) + strA) + (eeq.d(2) + eeq.d(2) + eeq.e((int) ((short) i))) + (eeq.d(3) + eeq.d(1) + eeq.d(i2)));
        tlvDeviceCommand.setDataContent(bArrC);
        tlvDeviceCommand.setDataLength(bArrC.length);
        tlvDeviceCommand.setIdentify(str);
        LogUtil.a("TlvOtaUpdate", "5.9.1 sending");
        c(tlvDeviceCommand, false);
    }

    private void c(dpb dpbVar) {
        if (dpbVar == null) {
            LogUtil.j("TlvOtaUpdate", "5.9.1 result: queryAllow == null");
            b(109001, 0L);
            return;
        }
        int iD = dpbVar.d();
        int iE = dpbVar.e();
        LogUtil.a("TlvOtaUpdate", "5.9.1 result: errorCode=", Integer.valueOf(iD), ", batteryThreshold=", Integer.valueOf(iE));
        if (iE <= -1) {
            b(513, 0L);
            return;
        }
        if (iE <= 20) {
            b(4, 0L);
        } else if (iD == 100000) {
            d();
        } else {
            b(513, 0L);
        }
    }

    private void d() {
        TlvDeviceCommand tlvDeviceCommand = new TlvDeviceCommand();
        tlvDeviceCommand.setServiceId(9);
        tlvDeviceCommand.setCommandId(2);
        tlvDeviceCommand.setIdentify(this.f32171a);
        LogUtil.a("TlvOtaUpdate", "5.9.2 sending");
        c(tlvDeviceCommand, false);
    }

    private void b(dov dovVar) {
        if (dovVar == null) {
            LogUtil.j("TlvOtaUpdate", "5.9.2 result: parameters is null");
            b(109001, 0L);
            return;
        }
        LogUtil.a("TlvOtaUpdate", "5.9.2 result: mAppWaitTimeout=", Integer.valueOf(dovVar.e()), ", restartTimeout=", Integer.valueOf(dovVar.a()), ", unitSize=", Integer.valueOf(dovVar.f()), ", interval=", Long.valueOf(dovVar.g()), ", isAckEnable=", Boolean.valueOf(dovVar.c()), ", isOffsetEnable=", Boolean.valueOf(dovVar.d()));
        this.l = dovVar;
        this.g = 0;
        this.e = 0;
        this.f32173c = 0;
        this.h = false;
        this.m = 0;
        c();
        this.f32172b.sendEmptyMessageDelayed(1, this.l.b());
    }

    private void d(byte[] bArr) {
        LogUtil.a("TlvOtaUpdate", "5.9.3 sending");
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        TlvDeviceCommand tlvDeviceCommand = new TlvDeviceCommand();
        tlvDeviceCommand.setServiceId(9);
        tlvDeviceCommand.setCommandId(3);
        tlvDeviceCommand.setDataContent(bArr2);
        tlvDeviceCommand.setDataLength(length);
        c(tlvDeviceCommand, false);
    }

    private void e(dou douVar) {
        if (this.f32172b.hasMessages(1)) {
            this.f32172b.removeMessages(1);
        }
        if (douVar == null) {
            LogUtil.j("TlvOtaUpdate", "5.9.3 result: applyReport == null");
            b(109001, 0L);
            return;
        }
        int iA = (int) douVar.a();
        int iC = (int) douVar.c();
        LogUtil.a("TlvOtaUpdate", "5.9.3 result: file_offset=", Integer.valueOf(iA), ", file_length=", Integer.valueOf(iC));
        c(iA, iA - this.g, iC);
        this.g = iA + iC;
        e(iA, iC, douVar.b());
        if (this.h) {
            double d = this.k;
            if (d != 0.0d) {
                int i = (int) ((((double) (this.e + this.f32173c)) / d) * 100.0d);
                c(i);
                Message messageObtainMessage = this.f32172b.obtainMessage();
                messageObtainMessage.what = 257;
                messageObtainMessage.arg1 = i;
                this.f32172b.sendMessage(messageObtainMessage);
            }
        }
    }

    private void e(int i, int i2, List<Integer> list) {
        dov dovVar = this.l;
        long j = 0;
        if (dovVar == null) {
            LogUtil.j("TlvOtaUpdate", "5.9.4 mParameters is null");
            b(109001, 0L);
            return;
        }
        int iF = dovVar.f() - 9;
        int iC = c(i2, iF);
        int i3 = i;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < iC) {
            int iA = a(i2, iF, i3, i5);
            if (iA < 0) {
                LogUtil.j("TlvOtaUpdate", "5.9.4 outof sendlength");
                b(513, j);
                return;
            }
            byte[] bArrD = d(i3 - i, i, iA);
            if (i6 > 255) {
                i6 = 0;
            }
            if (list != null && i4 < list.size()) {
                if (list.get(i4).intValue() == 0) {
                    this.e -= iA;
                    e(i6, bArrD, i3);
                    this.e += iA;
                }
            } else {
                e(i6, bArrD, i3);
                this.e += iA;
            }
            i5 += iA;
            i3 += iF;
            i6++;
            i4++;
            j = 0;
        }
        int iB = this.l.b();
        LogUtil.a("TlvOtaUpdate", "5.9.4 sendMessage Delayed ", Integer.valueOf(iB));
        this.f32172b.sendEmptyMessageDelayed(1, iB);
    }

    private void e(int i, byte[] bArr, int i2) {
        String strD = eeq.d(i);
        String strE = eeq.e(bArr);
        StringBuilder sb = new StringBuilder(16);
        if (this.l.d()) {
            sb.append(eeq.c(i2));
            sb.append(strD);
            sb.append(strE);
        } else {
            sb.append(strD);
            sb.append(strE);
        }
        TlvDeviceCommand tlvDeviceCommand = new TlvDeviceCommand();
        tlvDeviceCommand.setServiceId(9);
        tlvDeviceCommand.setCommandId(4);
        tlvDeviceCommand.setDataContent(eeq.c(sb.toString()));
        tlvDeviceCommand.setDataLength(eeq.c(sb.toString()).length);
        c(tlvDeviceCommand, false);
    }

    private void e(dot dotVar) {
        if (dotVar == null) {
            LogUtil.j("TlvOtaUpdate", "5.9.5 result: pkgSizeReport == null");
            b(109001, 0L);
            return;
        }
        this.h = true;
        this.k = dotVar.c();
        int iE = (int) dotVar.e();
        this.f32173c = iE;
        LogUtil.a("TlvOtaUpdate", "5.9.5 result: mOtaFileSizeV2=", Double.valueOf(this.k), ", mDeviceReceived=", Integer.valueOf(iE));
    }

    private void d(int i) {
        this.h = false;
        this.f32172b.removeMessages(1);
        if (i == 0) {
            LogUtil.a("TlvOtaUpdate", "5.9.6 result: ota check failed");
            b(2, 0L);
        } else if (i == 1) {
            LogUtil.a("TlvOtaUpdate", "5.9.6 result: ota check success");
            b(0, 0L);
        } else {
            LogUtil.j("TlvOtaUpdate", "\"5.9.6 result: ota check default");
            b(513, 0L);
        }
        e();
    }

    private void e() {
        TlvDeviceCommand tlvDeviceCommand = new TlvDeviceCommand();
        tlvDeviceCommand.setServiceId(9);
        tlvDeviceCommand.setCommandId(6);
        tlvDeviceCommand.setDataContent(null);
        tlvDeviceCommand.setDataLength(0);
        c(tlvDeviceCommand, false);
    }

    private void c() {
        String str = eeq.d(1) + eeq.d(1) + eeq.d(1);
        LogUtil.a("TlvOtaUpdate", "5.9.9 otaStatus : ", str);
        TlvDeviceCommand tlvDeviceCommand = new TlvDeviceCommand();
        tlvDeviceCommand.setServiceId(9);
        tlvDeviceCommand.setCommandId(9);
        tlvDeviceCommand.setDataContent(eeq.c(str));
        tlvDeviceCommand.setDataLength(eeq.c(str).length);
        tlvDeviceCommand.setIdentify(this.f32171a);
        c(tlvDeviceCommand, false);
    }

    public boolean c(byte[] bArr) {
        Message messageObtainMessage = this.f32172b.obtainMessage();
        messageObtainMessage.what = 259;
        messageObtainMessage.obj = bArr;
        return this.f32172b.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i, long j) {
        Message messageObtainMessage = this.f32172b.obtainMessage();
        messageObtainMessage.what = 258;
        messageObtainMessage.arg1 = i;
        if (j > 0) {
            return this.f32172b.sendMessageDelayed(messageObtainMessage, j);
        }
        return this.f32172b.sendMessage(messageObtainMessage);
    }

    private void c(TlvDeviceCommand tlvDeviceCommand, boolean z) {
        if (doq.e().l() != 2) {
            LogUtil.j("TlvOtaUpdate", "HwWspMeasureController not connected");
            b(104007, 0L);
        } else {
            doq.e().b(this.o.b(tlvDeviceCommand), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Intent intent = new Intent();
        intent.putExtra("update_status", i);
        EventBus.a(new EventBus.d("upgrade_update_status", intent));
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        Intent intent = new Intent();
        intent.putExtra("update_progress", i);
        EventBus.a(new EventBus.d("upgrade_update_progress", intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr) throws eeu {
        LogUtil.d("TlvOtaUpdate", "result data:", eeq.e(bArr));
        if (bArr.length < 2) {
            LogUtil.j("TlvOtaUpdate", "result data is invalid");
            b(109001, 0L);
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 1) {
            c(this.o.b(bArr));
            return;
        }
        if (b2 == 2) {
            b(this.o.e(bArr));
            return;
        }
        if (b2 == 3) {
            if (this.l.c()) {
                d(bArr);
            }
            e(this.o.a(bArr));
        } else if (b2 == 5) {
            e(this.o.c(bArr));
        } else if (b2 == 6) {
            d(this.o.d(bArr));
        } else {
            LogUtil.j("TlvOtaUpdate", "dealWithResultData default");
        }
    }

    private void c(int i, int i2, int i3) {
        if (a(i).length <= 0) {
            if (d(i, i3)) {
                return;
            }
            e(i, i2, i3);
            return;
        }
        LogUtil.j("TlvOtaUpdate", "getTransferDataBuffer dataPackage.length > 0");
    }

    private byte[] a(int i) {
        for (doz dozVar : this.d) {
            if (dozVar != null && dozVar.b() == i) {
                return dozVar.d();
            }
        }
        return new byte[0];
    }

    private boolean d(int i, int i2) {
        FileInputStream fileInputStream = this.j;
        if (fileInputStream != null && fileInputStream.getChannel() != null) {
            try {
                if (i < this.j.getChannel().position()) {
                    LogUtil.j("TlvOtaUpdate", "getFileCache offset < mInputStream.getChannel().position()");
                    a();
                    e(i, i, i2);
                    return true;
                }
            } catch (IOException unused) {
                LogUtil.e("TlvOtaUpdate", "IOException mInputStream.getChannel().position()");
            }
        }
        return false;
    }

    private void a() {
        FileInputStream fileInputStream = this.j;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
                this.j = null;
            } catch (IOException unused) {
                LogUtil.e("TlvOtaUpdate", "IOException closeStream exception");
            }
        }
        this.d.clear();
    }

    private void e(int i, int i2, int i3) {
        long jSkip;
        int i4;
        if (TextUtils.isEmpty(this.f)) {
            LogUtil.j("TlvOtaUpdate", "getTransferDataBuffer info is null");
        }
        if (this.j == null) {
            try {
                File file = new File(CommonUtil.c(this.f));
                if (!file.exists() && !file.createNewFile()) {
                    LogUtil.j("TlvOtaUpdate", "getTransferDataBuffer, The file already exists continue");
                }
                LogUtil.a("TlvOtaUpdate", "openInputStream");
                this.j = FileUtils.openInputStream(file);
            } catch (IOException unused) {
                LogUtil.e("TlvOtaUpdate", "IOException getTransferDataBuffer() exception");
            }
        }
        FileInputStream fileInputStream = this.j;
        if (fileInputStream == null) {
            LogUtil.j("TlvOtaUpdate", "mInputStream == null");
            return;
        }
        byte[] bArr = new byte[i3];
        try {
            jSkip = fileInputStream.skip(i2);
            try {
                i4 = this.j.read(bArr);
            } catch (IOException unused2) {
                LogUtil.e("TlvOtaUpdate", "getTransferDataBuffer IOException");
                i4 = 0;
            }
        } catch (IOException unused3) {
            jSkip = 0;
        }
        if (jSkip == -1 || i4 == -1) {
            LogUtil.j("TlvOtaUpdate", "getTransferDataBuffer set read position occur error or readSize error");
            return;
        }
        if (this.d.size() > 4) {
            this.d.remove(0);
        }
        this.d.add(new doz(i, bArr));
    }

    private int c(int i, int i2) {
        if (i % i2 == 0) {
            return i / i2;
        }
        return (i / i2) + 1;
    }

    private int a(int i, int i2, int i3, int i4) {
        if ((i - i4) / i2 == 0) {
            i2 = i % i2;
        }
        if ((i + i3) - i4 <= this.i) {
            return i2;
        }
        LogUtil.a("TlvOtaUpdate", "out of Index");
        return this.i - i3;
    }

    private byte[] d(int i, int i2, int i3) {
        byte[] bArr = new byte[i3];
        byte[] bArrA = a(i2);
        if (bArrA.length <= 0) {
            return new byte[0];
        }
        System.arraycopy(bArrA, i, bArr, 0, i3);
        return bArr;
    }

    private void c(int i) {
        if (i % 5 == 0 && i != this.m) {
            this.m = i;
            LogUtil.a("TlvOtaUpdate", 1, "ota count : ", Integer.valueOf(i));
        }
        if (i == 100) {
            this.m = 0;
        }
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static dpa f32175c = new dpa();
    }
}
