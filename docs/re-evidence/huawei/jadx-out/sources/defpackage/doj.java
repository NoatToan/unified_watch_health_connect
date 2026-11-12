package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class doj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f32124b = new Object();
    private static doj e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f32126c;
    private byte[] d;
    private List<byte[]> i;
    private byte[] p;
    private byte[] t;
    private long q = 0;
    private int m = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32125a = 0;
    private int j = 0;
    private int s = 0;
    private int l = 0;
    private int n = 0;
    private byte o = 0;
    private byte k = 0;
    private int h = 0;
    private boolean f = false;
    private Handler g = new Handler(Looper.getMainLooper()) { // from class: doj.4
        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            LogUtil.a("WeightScalesUpdate", "msg what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                doj.this.b(message);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LogUtil.a("WeightScalesUpdate", "OTA upgrade power is too low...");
                return;
            }
            if (message.arg1 == 0) {
                LogUtil.a("WeightScalesUpdate", "update success.");
            } else if (message.arg1 == 1) {
                LogUtil.a("WeightScalesUpdate", "update fail. timeout");
            } else if (message.arg1 == 2) {
                LogUtil.a("WeightScalesUpdate", "update fail. CS error");
            } else if (message.arg1 == 4) {
                LogUtil.a("WeightScalesUpdate", "update fail. power low");
            } else {
                LogUtil.a("WeightScalesUpdate", "update fail");
            }
            doj.this.d(message.arg1);
        }
    };

    private doj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        float f;
        if (this.s <= 0 || message == null || !(message.obj instanceof String)) {
            return;
        }
        try {
            f = Float.parseFloat((String) message.obj);
        } catch (NumberFormatException e2) {
            LogUtil.e("WeightScalesUpdate", "updateProgress exception = ", e2.getMessage());
            f = 0.0f;
        }
        int i = (int) ((f / this.s) * 100.0f);
        this.f32125a = i;
        if (i <= this.j) {
            LogUtil.a("WeightScalesUpdate", "mFirmwarePro <= mNowPro");
        } else {
            this.j = i;
        }
        LogUtil.a("WeightScalesUpdate", "mProSize: ", Integer.valueOf(this.s), ", OTA progress: ", Float.valueOf(f), ", mFirmwarePro: ", Integer.valueOf(this.f32125a));
        e(this.f32125a);
    }

    public static doj c() {
        doj dojVar;
        synchronized (doj.class) {
            synchronized (f32124b) {
                if (e == null) {
                    e = new doj();
                }
                dojVar = e;
            }
        }
        return dojVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("WeightScalesUpdate", "Enter sendUpdateStatus!");
        Intent intent = new Intent();
        intent.putExtra("update_status", i);
        EventBus.a(new EventBus.d("upgrade_update_status", intent));
    }

    private void e(int i) {
        LogUtil.a("WeightScalesUpdate", "Enter sendUpdateProgress!");
        Intent intent = new Intent();
        intent.putExtra("update_progress", i);
        EventBus.a(new EventBus.d("upgrade_update_progress", intent));
    }

    public void c(String str, String str2) throws Throwable {
        LogUtil.a("WeightScalesUpdate", "update scalePath:", str, ",blePath:", str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f32125a = 0;
            this.j = 0;
            this.s = 0;
            this.h = 0;
            this.f = false;
            String strD = d(str);
            if (TextUtils.isEmpty(strD)) {
                Message messageObtainMessage = this.g.obtainMessage();
                messageObtainMessage.what = 2;
                messageObtainMessage.arg1 = 2;
                this.g.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("WeightScalesUpdate", "no TextUtils.isEmpty(strScale) ");
            this.d = doh.d(strD);
            this.p = doh.d(strD.substring(32));
            String strD2 = d(str2);
            if (TextUtils.isEmpty(strD2)) {
                Message messageObtainMessage2 = this.g.obtainMessage();
                messageObtainMessage2.what = 2;
                messageObtainMessage2.arg1 = 2;
                this.g.sendMessage(messageObtainMessage2);
                return;
            }
            LogUtil.a("WeightScalesUpdate", "bleScale is not empty");
            this.f32126c = doh.d(strD2);
            this.t = doh.d(strD2.substring(32));
            this.m = 2;
            a(str, str2);
            this.f = true;
            if (dof.d().e()) {
                LogUtil.a("WeightScalesUpdate", "ota is connect");
                dof.d().b(dog.c(this.m, this.l, this.o));
                return;
            } else {
                LogUtil.j("WeightScalesUpdate", "no connect");
                return;
            }
        }
        LogUtil.j("WeightScalesUpdate", "scalePath or blePath is null");
    }

    public void e(boolean z) {
        LogUtil.a("WeightScalesUpdate", "------onOtaUpgradeReady------- result: ", Boolean.valueOf(z), ", ", "mFirstPkgDataIdx: ", Integer.valueOf(this.h), ", mOtaByteList size: ", Integer.valueOf(this.i.size()));
        this.q = System.currentTimeMillis();
        if (this.f) {
            LogUtil.a("WeightScalesUpdate", "start scale");
            dof.d().b(dog.a(this.d));
        } else {
            LogUtil.a("WeightScalesUpdate", "start ble ");
            dof.d().b(dog.a(this.f32126c));
        }
    }

    public void b() {
        LogUtil.a("WeightScalesUpdate", "------onReceiveShaPackageOne-------");
        if (this.f) {
            LogUtil.a("WeightScalesUpdate", "start scale");
            dof.d().b(dog.e(this.p));
        } else {
            LogUtil.a("WeightScalesUpdate", "start ble");
            dof.d().b(dog.e(this.t));
        }
    }

    public void d() {
        LogUtil.a("WeightScalesUpdate", "------onReceiveShaPackageTwo-------");
        this.q = System.currentTimeMillis();
        int i = this.h;
        if (i >= 0 && i < this.i.size()) {
            dof.d().b(dog.e(this.i.get(this.h), 0));
        } else {
            LogUtil.a("WeightScalesUpdate", "onReceiveSha256PkgTwo false");
        }
    }

    public void d(int i, int i2) {
        LogUtil.a("WeightScalesUpdate", "------onUpgradeResult-------result： ", Integer.valueOf(i), ", type: ", Integer.valueOf(i2), ", mIsUpgradeOtaAndBle: ", Boolean.valueOf(this.f));
        this.h = 0;
        LogUtil.a("WeightScalesUpdate", "upgrade type is : ", Integer.valueOf(this.m), " times:", Long.valueOf(System.currentTimeMillis() - this.q), "ms");
        if (this.f && i == 0) {
            this.h = this.l;
            this.f = false;
            dof.d().b(dog.c(1, this.n, this.k));
        } else {
            dof.d().b(dog.a());
            Message messageObtainMessage = this.g.obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.arg1 = i;
            this.g.sendMessage(messageObtainMessage);
        }
    }

    public void b(int i, boolean z) {
        int i2;
        int i3 = this.s;
        int i4 = this.l;
        if (i3 <= i4 || this.h != i4) {
            LogUtil.a("WeightScalesUpdate", "onUpgradeResponse false");
            i2 = i;
        } else {
            i2 = i4 + i;
        }
        Message messageObtainMessage = this.g.obtainMessage();
        messageObtainMessage.obj = String.valueOf(i2);
        messageObtainMessage.what = 1;
        messageObtainMessage.arg1 = i2;
        this.g.sendMessage(messageObtainMessage);
        LogUtil.a("WeightScalesUpdate", "------onUpgradeResponse-------pkgNo: ", Integer.valueOf(i), ", result: ", Boolean.valueOf(z), ", currProgress: ", Integer.valueOf(i2), ", mOtaByteList size: ", Integer.valueOf(this.i.size()));
        int i5 = i2 + 1;
        if (i5 < this.i.size()) {
            if (z) {
                dof.d().b(dog.e(this.i.get(i5), i + 1));
            } else {
                dof.d().b(dog.e(this.i.get(i2), i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v9 */
    private void a(String str, String str2) throws Throwable {
        ?? r9;
        ?? r3;
        Throwable th;
        ?? r4 = " setScaleOtaByte 3 ";
        LogUtil.a("WeightScalesUpdate", "------setScaleOtaByte------- name1: ", str, ", name2: ", str2);
        this.l = 0;
        this.n = 0;
        this.o = (byte) 0;
        this.k = (byte) 0;
        this.i = new ArrayList(16);
        Object objValueOf = null;
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[16];
                    while (fileInputStream2.read(bArr) != -1) {
                        byte[] bArr2 = (byte[]) bArr.clone();
                        this.o = b(bArr2, this.o);
                        this.i.add(bArr2);
                        this.l++;
                    }
                    a(fileInputStream2);
                    FileInputStream fileInputStream3 = fileInputStream2;
                    if (str2 != null && !"".equals(str2)) {
                        fileInputStream3 = fileInputStream2;
                        FileInputStream fileInputStream4 = new FileInputStream(str2);
                        while (fileInputStream4.read(bArr) != -1) {
                            try {
                                byte[] bArr3 = (byte[]) bArr.clone();
                                this.k = b(bArr3, this.k);
                                this.i.add(bArr3);
                                this.n++;
                            } catch (IOException e2) {
                                e = e2;
                                fileInputStream = fileInputStream4;
                                LogUtil.e("WeightScalesUpdate", " setScaleOtaByte 2 ", e.getMessage());
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e3) {
                                        LogUtil.e("WeightScalesUpdate", " setScaleOtaByte 3 ", e3.getMessage());
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objValueOf = fileInputStream4;
                                th = th;
                                r9 = objValueOf;
                                r3 = r4;
                                if (r9 != 0) {
                                    try {
                                        r9.close();
                                        throw th;
                                    } catch (IOException e4) {
                                        LogUtil.e("WeightScalesUpdate", r3, e4.getMessage());
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        }
                        fileInputStream3 = fileInputStream4;
                    }
                    try {
                        fileInputStream3 = fileInputStream2;
                        fileInputStream3.close();
                    } catch (IOException e5) {
                        LogUtil.e("WeightScalesUpdate", " setScaleOtaByte 3 ", e5.getMessage());
                    }
                } catch (IOException e6) {
                    e = e6;
                    fileInputStream = fileInputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    r3 = r4;
                    r9 = fileInputStream2;
                    if (r9 != 0) {
                        r9.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e7) {
            e = e7;
        }
        int size = this.i.size();
        byte b2 = this.o;
        r4 = this.k;
        int i = this.l;
        int i2 = this.n;
        objValueOf = Integer.valueOf(size);
        LogUtil.a("WeightScalesUpdate", "ota byte list size: ", objValueOf, "mOtaFirstPackageCheckCrc: ", Byte.valueOf(b2), ", mOtaSecondPackageCheckCrc: ", Byte.valueOf((byte) r4), ", mOtaFirstPkgLen: ", Integer.valueOf(i), ", mOtaSecondPkgLen: ", Integer.valueOf(i2));
        this.s = this.i.size();
    }

    private void a(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e2) {
            LogUtil.e("WeightScalesUpdate", " setScaleOtaByte 1 ", e2.getMessage());
        }
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
                    do {
                        int i2 = fileInputStream.read(bArr);
                        if (-1 == i2) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                        i += i2;
                    } while (i <= 10485760);
                    String strE = eeq.e(messageDigest.digest());
                    try {
                        fileInputStream.close();
                        return strE;
                    } catch (IOException e2) {
                        LogUtil.e("WeightScalesUpdate", " setScaleOtaByte 3 ", e2.getMessage());
                        return strE;
                    }
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("WeightScalesUpdate", "update IOException");
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e3) {
                            LogUtil.e("WeightScalesUpdate", " setScaleOtaByte 3 ", e3.getMessage());
                        }
                    }
                    return "";
                } catch (NoSuchAlgorithmException e4) {
                    e = e4;
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("WeightScalesUpdate", "update NoSuchAlgorithmException ", e.getMessage());
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e5) {
                            LogUtil.e("WeightScalesUpdate", " setScaleOtaByte 3 ", e5.getMessage());
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            LogUtil.e("WeightScalesUpdate", " setScaleOtaByte 3 ", e6.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (IOException unused2) {
        } catch (NoSuchAlgorithmException e7) {
            e = e7;
        }
    }

    private byte b(byte[] bArr, byte b2) {
        for (byte b3 : bArr) {
            b2 = (byte) (b2 ^ b3);
            for (int i = 0; i < 8; i++) {
                int i2 = b2 & 128;
                int i3 = b2 << 1;
                if (i2 > 0) {
                    i3 = ((byte) i3) ^ 7;
                }
                b2 = (byte) i3;
            }
        }
        return b2;
    }

    public void b(int i, byte[] bArr, Object obj) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("WeightScalesUpdate", "sendOtaType data is null");
            return;
        }
        if (obj == null) {
            LogUtil.j("WeightScalesUpdate", "sendOtaType resultObject is null");
            return;
        }
        if (i == 9) {
            c(obj);
            return;
        }
        if (i == 10) {
            LogUtil.a("WeightScalesUpdate", "ota result...");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                int i2 = jSONObject.getInt("type");
                int i3 = jSONObject.getInt("result");
                LogUtil.a("WeightScalesUpdate", "-----------ota update result ----------- type: ", Integer.valueOf(i2), ", result: ", Integer.valueOf(i3));
                d(i3, i2);
                return;
            } catch (JSONException e2) {
                LogUtil.a("WeightScalesUpdate", "json analysis fail. error msg: ", e2.toString());
                return;
            }
        }
        if (i == 15) {
            LogUtil.a("WeightScalesUpdate", "---OTA readied---");
            e(bArr[3] == 0);
        } else if (i == 20) {
            LogUtil.a("WeightScalesUpdate", "---TYPE_SHA256PKG1--- ", obj);
            b();
        } else if (i != 21) {
            LogUtil.a("WeightScalesUpdate", "parseType: ", Integer.valueOf(i));
        } else {
            LogUtil.a("WeightScalesUpdate", "---TYPE_SHA256PKG2--- ", obj);
            d();
        }
    }

    private void c(Object obj) {
        LogUtil.a("WeightScalesUpdate", "----ota pkg response----");
        try {
            JSONObject jSONObject = new JSONObject(obj.toString());
            int i = jSONObject.getInt("pkgNo");
            boolean z = jSONObject.getBoolean("result");
            LogUtil.a("WeightScalesUpdate", "json object pkgNo: ", Integer.valueOf(i), ", result: ", Boolean.valueOf(z));
            b(i, z);
        } catch (JSONException e2) {
            LogUtil.a("WeightScalesUpdate", "json analysis fail. error msg: ", e2.toString());
        }
    }
}
