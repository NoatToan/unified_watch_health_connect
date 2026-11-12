package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dre {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f32228b = new Object();
    private static dre d;
    private int g;
    private List<byte[]> h;
    private boolean i;
    private long k;
    private int j = 0;
    private int f = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32230c = 0;
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f32229a = new Handler(Looper.getMainLooper()) { // from class: dre.1
        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            LogUtil.a("WspOtaUpdate", "msg what:", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                LogUtil.a("WspOtaUpdate", "update progress.");
                return;
            }
            if (i == 2) {
                dre.this.i = false;
                if (message.arg1 == 0) {
                    LogUtil.a("WspOtaUpdate", "update success.");
                } else if (message.arg1 == 1) {
                    LogUtil.j("WspOtaUpdate", "update fail timeout");
                } else if (message.arg1 == 2) {
                    LogUtil.j("WspOtaUpdate", "update fail CS error");
                } else if (message.arg1 == 4) {
                    LogUtil.j("WspOtaUpdate", "update fail power low");
                } else {
                    LogUtil.j("WspOtaUpdate", "update fail");
                }
                dre.this.e(message.arg1);
                return;
            }
            if (i == 5) {
                dre.this.d();
                return;
            }
            if (i == 6) {
                dre.this.b();
                return;
            }
            if (i == 101) {
                doq.e().h();
                return;
            }
            if (i == 102) {
                int i2 = message.arg1;
                if (message.obj instanceof byte[]) {
                    dre.this.e(i2, (byte[]) message.obj);
                    return;
                }
                return;
            }
            LogUtil.j("WspOtaUpdate", "mHandler msg default");
        }
    };

    static /* synthetic */ int a(dre dreVar) {
        int i = dreVar.f;
        dreVar.f = i - 1;
        return i;
    }

    private dre() {
    }

    public void b(boolean z) {
        this.e = z;
    }

    public void c(byte[] bArr) {
        LogUtil.a("WspOtaUpdate", "upgrade time:", Long.valueOf(System.currentTimeMillis() - this.k));
        Message messageObtainMessage = this.f32229a.obtainMessage();
        if (bArr == null || bArr.length <= 3) {
            LogUtil.j("WspOtaUpdate", "receiverOtaComplete invalid parameter");
            return;
        }
        int i = bArr[3] & 255;
        if (i == 1) {
            LogUtil.a("WspOtaUpdate", "receiver MCU upgrade");
        } else if (i == 2) {
            LogUtil.a("WspOtaUpdate", "receiver BLE upgrade");
        } else if (i == 3) {
            LogUtil.a("WspOtaUpdate", "receiver MCU and BLE upgrade");
        } else {
            LogUtil.j("WspOtaUpdate", "receiver default");
        }
        if (bArr.length <= 4) {
            LogUtil.j("WspOtaUpdate", "receiverOtaComplete invalid parameter caused by constant START_TRANSFER_INDEX");
            return;
        }
        int i2 = bArr[4] & 255;
        if (i2 == 0) {
            messageObtainMessage.arg1 = 0;
        } else if (i2 == 1) {
            messageObtainMessage.arg1 = 1;
        } else if (i2 == 2) {
            messageObtainMessage.arg1 = 2;
        } else if (i2 != 3) {
            if (i2 == 4) {
                messageObtainMessage.arg1 = 4;
            } else {
                LogUtil.j("WspOtaUpdate", "receiverOtaComplete default");
            }
        }
        messageObtainMessage.what = 2;
        this.f32229a.sendMessage(messageObtainMessage);
    }

    public static dre a() {
        dre dreVar;
        synchronized (f32228b) {
            if (d == null) {
                d = new dre();
            }
            dreVar = d;
        }
        return dreVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        Intent intent = new Intent();
        intent.putExtra("update_status", i);
        EventBus.a(new EventBus.d("upgrade_update_status", intent));
    }

    private void a(int i) {
        Intent intent = new Intent();
        intent.putExtra("update_progress", i);
        EventBus.a(new EventBus.d("upgrade_update_progress", intent));
    }

    public boolean c() {
        return this.i;
    }

    public void e(boolean z) {
        this.i = z;
    }

    public void a(String str) {
        if (this.e) {
            this.f32230c = 0;
            this.k = System.currentTimeMillis();
            LogUtil.a("WspOtaUpdate", "updateFilePath is:", str);
            this.j = 0;
            this.i = false;
            if (TextUtils.isEmpty(d(str))) {
                Message messageObtainMessage = this.f32229a.obtainMessage();
                messageObtainMessage.what = 2;
                messageObtainMessage.arg1 = 2;
                this.f32229a.sendMessage(messageObtainMessage);
                return;
            }
            this.f = 4;
            this.g = 0;
            c(str);
            if (doq.e().l() != 2 || this.h.size() <= 0) {
                return;
            }
            LogUtil.a("WspOtaUpdate", "ota is connect");
            doq.e().b(BleTaskQueueUtil.TaskType.REQUEST_OTA_UPGRADE, dow.c(this.h));
        }
    }

    private void c(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    fileInputStream = new FileInputStream(str);
                    try {
                        List<byte[]> listB = b(fileInputStream);
                        this.h = listB;
                        int size = listB.size() - 4;
                        this.j = size;
                        LogUtil.a("WspOtaUpdate", "total size:", Integer.valueOf(size));
                        fileInputStream2 = fileInputStream;
                    } catch (IOException unused) {
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("WspOtaUpdate", "getLoadScaleOta IOException");
                        cpm.d(fileInputStream2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        cpm.d(fileInputStream);
                        throw th;
                    }
                }
                cpm.d(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        } catch (IOException unused2) {
        }
    }

    public List<byte[]> b(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList(16);
        byte[] bArr = new byte[16];
        while (inputStream.read(bArr) != -1) {
            arrayList.add((byte[]) bArr.clone());
            if (arrayList.size() >= 4) {
                break;
            }
        }
        for (byte[] bArr2 = new byte[13]; inputStream.read(bArr2) != -1; bArr2 = new byte[13]) {
            arrayList.add((byte[]) bArr2.clone());
        }
        return arrayList;
    }

    private static String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    int i = 0;
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                        i += i2;
                        if (i > 5242880) {
                            LogUtil.e("WspOtaUpdate", "buildVerificString exceed max size: ", Integer.valueOf(i));
                            break;
                        }
                    }
                    String strE = eeq.e(messageDigest.digest());
                    cpm.d(fileInputStream);
                    return strE;
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("WspOtaUpdate", "createChecksum IOException");
                    cpm.d(fileInputStream2);
                    return "";
                } catch (NoSuchAlgorithmException e) {
                    e = e;
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("WspOtaUpdate", "createChecksum NoSuchAlgorithmException:", e.getMessage());
                    cpm.d(fileInputStream2);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    cpm.d(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (IOException unused2) {
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
        }
    }

    public void e(byte[] bArr) {
        Message messageObtainMessage = this.f32229a.obtainMessage();
        messageObtainMessage.what = 2;
        if (bArr == null || bArr.length <= 3) {
            LogUtil.j("WspOtaUpdate", "parseOtaRequest invalid parameter caused by constant DATA_START_INDEX");
            return;
        }
        byte b2 = bArr[3];
        if (b2 == 0) {
            this.f32229a.sendEmptyMessage(5);
            return;
        }
        if (b2 == 1) {
            messageObtainMessage.arg1 = 4;
            this.f32229a.sendMessage(messageObtainMessage);
        } else if (b2 == 2) {
            e(0);
        } else if (b2 != 3) {
            LogUtil.j("WspOtaUpdate", "parseOtaRequest default.");
        } else {
            LogUtil.a("WspOtaUpdate", "parseOtaRequest is measuring.");
        }
    }

    public void d() {
        if (this.e) {
            if (njy.e(this.h, 2)) {
                LogUtil.e("WspOtaUpdate", "sendOtaCheck out of mOtaByteList bound:", 2);
                return;
            }
            byte[] bArr = this.h.get(2);
            if (njy.e(this.h, 3)) {
                LogUtil.e("WspOtaUpdate", "sendOtaCheck out of mOtaByteList bound:", 3);
                return;
            }
            byte[] bArr2 = this.h.get(3);
            int length = bArr.length + bArr2.length;
            byte[] bArr3 = new byte[length];
            int i = 0;
            int i2 = 0;
            while (i2 < bArr.length) {
                bArr3[i2] = bArr[i2];
                i2++;
            }
            LogUtil.a("WspOtaUpdate", "stitching sha256 first package result:", Integer.valueOf(i2), "; bytes length:", Integer.valueOf(length));
            while (i2 < length && i < bArr2.length) {
                bArr3[i2] = bArr2[i];
                i++;
                i2++;
            }
            LogUtil.a("WspOtaUpdate", "sha256 data to be send value:", eeq.e(bArr3));
            doq.e().b(BleTaskQueueUtil.TaskType.OTA_UPGRADE_SHA_CHECK, bArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] e(int i, byte[] bArr) {
        doq.e().v();
        int i2 = 2;
        int length = bArr.length + 2;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) (i & 255);
        bArr2[1] = (byte) ((i >> 8) & 255);
        for (byte b2 : bArr) {
            if (i2 < length) {
                bArr2[i2] = b2;
                i2++;
            }
        }
        doq.e().write(new dro(BleTaskQueueUtil.TaskType.SEND_OTA_PACKAGE_DATA, bArr2), new IAsynBleTaskCallback() { // from class: dre.5
            @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
            public void success(Object obj) {
                dre.this.f();
            }

            @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
            public void failed() {
                dre.a(dre.this);
                dre.this.f();
            }
        });
        return bArr2;
    }

    public void d(byte[] bArr) {
        if (this.e) {
            if (bArr == null || bArr.length <= 3) {
                LogUtil.j("WspOtaUpdate", "parseOtaCheckResult invalid parameter caused by constant DATA_START_INDEX");
            } else {
                if (bArr[3] == 0) {
                    LogUtil.a("WspOtaUpdate", "receiver sha 256 success");
                    this.i = true;
                    this.f32229a.sendEmptyMessage(6);
                    return;
                }
                LogUtil.j("WspOtaUpdate", "receiver sha 256 fail");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        doq.e().enable(new dro(BleTaskQueueUtil.TaskType.SEND_OTA_PACKAGE_DATA, new byte[0]), new IAsynBleTaskCallback() { // from class: dre.3
            @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
            public void failed() {
            }

            @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
            public void success(Object obj) {
            }
        });
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.e) {
            if (this.f >= this.h.size()) {
                this.f32229a.sendEmptyMessageDelayed(101, 3200L);
                return;
            }
            if (doq.e().l() != 2) {
                return;
            }
            byte[] bArr = this.h.get(this.f);
            int i = this.f;
            this.g = i - 4;
            int i2 = i + 1;
            this.f = i2;
            if (i2 == this.h.size() - 1) {
                int length = bArr.length;
                System.arraycopy(bArr, 0, new byte[length], 0, length);
                Message messageObtainMessage = this.f32229a.obtainMessage();
                messageObtainMessage.what = 102;
                messageObtainMessage.arg1 = this.g;
                messageObtainMessage.obj = bArr;
                this.f32229a.sendMessage(messageObtainMessage);
                LogUtil.a("WspOtaUpdate", "receiver success last package");
                this.f32229a.removeMessages(101);
                this.f32229a.sendEmptyMessageDelayed(101, 3200L);
            } else {
                Message messageObtainMessage2 = this.f32229a.obtainMessage();
                messageObtainMessage2.what = 102;
                messageObtainMessage2.arg1 = this.g;
                messageObtainMessage2.obj = bArr;
                this.f32229a.sendMessage(messageObtainMessage2);
            }
            i();
        }
    }

    private void j() {
        if (!njy.c(this.h, this.f)) {
            LogUtil.e("WspOtaUpdate", "sendErrorPackage out of mOtaByteList bound:", Integer.valueOf(this.f), " byteSize:", Integer.valueOf(this.h.size()));
            return;
        }
        byte[] bArr = this.h.get(this.f);
        this.g = this.f - 4;
        doq.e().v();
        int i = 2;
        int length = bArr.length + 2;
        byte[] bArr2 = new byte[length];
        int i2 = this.g;
        bArr2[0] = (byte) (i2 & 255);
        bArr2[1] = (byte) ((i2 >> 8) & 255);
        for (byte b2 : bArr) {
            if (i < length) {
                bArr2[i] = b2;
                i++;
            }
        }
        doq.e().write(new dro(BleTaskQueueUtil.TaskType.SEND_OTA_PACKAGE_DATA, bArr2), new IAsynBleTaskCallback() { // from class: dre.2
            @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
            public void success(Object obj) {
                LogUtil.a("WspOtaUpdate", "sendErrorPackage write data success");
                dre.this.f();
            }

            @Override // com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback
            public void failed() {
                dre.a(dre.this);
                dre.this.f();
            }
        });
    }

    public void a(byte[] bArr) {
        if (bArr == null || bArr.length <= 3) {
            LogUtil.j("WspOtaUpdate", "receiverOtaPackage invalid parameter caused by constant DATA_START_INDEX");
            return;
        }
        int i = bArr[3] & 255;
        if (i == 0) {
            LogUtil.a("WspOtaUpdate", "PackgeIndex packageNo ");
            return;
        }
        if (i != 1) {
            return;
        }
        this.f32229a.removeMessages(101);
        int iB = dow.b(bArr[5], bArr[4]);
        LogUtil.a("WspOtaUpdate", "errorPackgeIndex packageNo:", Integer.valueOf(iB));
        this.f = iB + 4;
        j();
    }

    private void i() {
        int i = this.g;
        if (i >= this.f32230c) {
            int iRound = (int) (Math.round(((((((double) i) * 1.0d) / ((double) this.j)) * 1.0d) * 100.0d) * 10.0d) / 10.0f);
            LogUtil.a("WspOtaUpdate", "progress:", Integer.valueOf(iRound), "; otaIndex:", Integer.valueOf(this.g), "; packageLength:", Integer.valueOf(this.j));
            a(iRound);
            this.f32230c = this.g;
        }
    }

    public byte[] e() {
        return new byte[0];
    }
}
