package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.wifi.control.logic.AccessNetWorkTask;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public class ebf {
    private static boolean e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f32666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32667c;
    private BaseCallbackInterface d;
    private String f;
    private int[] h;
    private byte[] j;
    private AccessNetWorkTask k;
    private byte[] l;
    private ebd o;
    private String i = "";
    private Handler g = new Handler() { // from class: ebf.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("MulticastMessage", "mHandler msg is null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                ebb ebbVar = new ebb();
                ebbVar.d(ecj.e(ebf.this.f32666b));
                ebbVar.a(ebf.this.h);
                ebbVar.a(ebf.this.o.b());
                ebbVar.a(ebf.this.o.g());
                ebf ebfVar = ebf.this;
                ebfVar.d(ebfVar.f32665a, ebbVar);
                ebf.this.k.startTask();
                return;
            }
            if (i == 1) {
                if (ebf.this.k != null) {
                    ebf.this.k.pauseTask();
                }
            } else {
                if (i == 2) {
                    if (ebf.this.k != null) {
                        ebf.this.k.stopTask();
                        return;
                    }
                    return;
                }
                LogUtil.j("mHandler msg is other ", Integer.valueOf(message.what));
            }
        }
    };

    public static int a(int i, int i2) {
        return (i - 1) | (((i2 >> 4) - 1) << 5);
    }

    public ebf(Context context, ebd ebdVar, BaseCallbackInterface baseCallbackInterface) {
        this.f = "";
        this.f32666b = context;
        this.d = baseCallbackInterface;
        this.o = ebdVar;
        if (ebdVar != null) {
            this.f = ebdVar.a();
        }
    }

    public void c(int i) {
        this.f32665a = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, ebb ebbVar) {
        if (i == 1) {
            this.k = new ebe(this.f32666b, ebbVar, this.d);
            return;
        }
        if (i == 2) {
            this.k = new ebj(this.f32666b, ebbVar, this.d);
            return;
        }
        eba ebaVar = new eba(this.f32666b, ebbVar, this.d);
        this.k = ebaVar;
        int i2 = this.f32667c;
        if (i2 == 4) {
            if (ebaVar instanceof eba) {
                ebaVar.d(i2);
            } else {
                LogUtil.j("MulticastMessage", "mMulticastManager not instanceof CombinationTask");
            }
        }
    }

    public void e() {
        if (!e) {
            LogUtil.j("MulticastMessage", "startMulticast: multicast failed");
        } else {
            ThreadPoolManager.c().a("MulticastMessage", new c());
        }
    }

    class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ebf.this.o.e(ecs.d(ebf.this.f32666b));
            ebf.this.o.b(ecn.e());
            ebf.this.o.h(ecn.a(8));
            ebf.this.o.e(ecn.b());
            ebf.this.o.a(ecn.a());
            ebf.this.j();
            ebd ebdVar = ebf.this.o;
            ebf ebfVar = ebf.this;
            ebdVar.b(ebfVar.e(ebfVar.l));
            ebf.this.a();
            ebf.this.g();
            LogUtil.d("MulticastMessage", "multicastInfo : ", ebf.this.o);
            ebf.this.g.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.d("MulticastMessage", "generateIpData: in");
        if (this.j == null || this.l.length == 0) {
            e = false;
            this.d.onFailure(2103);
            return;
        }
        String strF = this.o.f();
        if (strF == null) {
            return;
        }
        int length = strF.getBytes(Charset.forName("UTF-8")).length;
        LogUtil.a("MulticastMessage", "ssidStr =", strF, " String.length =", Integer.valueOf(strF.length()), "  byte[].length =", Integer.valueOf(length));
        d(strF, length);
    }

    private void d(String str, int i) {
        byte[] bytes;
        int length = this.l.length;
        int i2 = i + 20;
        int i3 = i2 + length;
        if (i3 % 2 != 0) {
            int[] iArr = new int[i3 + 1];
            this.h = iArr;
            iArr[i3] = 0;
        } else {
            this.h = new int[i3];
        }
        f();
        int i4 = 0;
        while (true) {
            byte[] bArr = this.j;
            if (i4 >= bArr.length) {
                break;
            }
            this.h[i4 + 3] = bArr[i4];
            i4++;
        }
        this.h[19] = a(i, length);
        int i5 = 20;
        if (b() > 0) {
            i5 = length + 20;
            i2 = 20;
        }
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("MulticastMessage", "generateIpDataDetails catch UnsupportedEncodingException");
            bytes = null;
        }
        if (bytes != null && bytes.length > 0) {
            for (int i6 = 0; i6 < i; i6++) {
                this.h[i5 + i6] = bytes[i6];
            }
        }
        for (int i7 = 0; i7 < length; i7++) {
            this.h[i2 + i7] = this.l[i7];
        }
        b(i + 18 + length);
    }

    private void f() {
        byte[] bytes;
        String strD = d(this.f);
        this.i = strD;
        try {
            bytes = strD.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("MulticastMessage", "initIpData catch UnsupportedEncodingException");
            bytes = null;
        }
        LogUtil.d("MulticastMessage", "info :", ecj.b(bytes));
        this.h[0] = ecn.e(bytes);
        int[] iArr = this.h;
        iArr[1] = 0;
        if (iArr.length > 2) {
            if (this.f32667c == 4) {
                LogUtil.a("MulticastMessage", "generateIpData HAND_ADD_WIFIAP_MODE");
                this.h[2] = 15;
            } else {
                iArr[2] = i();
            }
        }
    }

    private void b(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) this.h[i2 + 2];
        }
        this.h[1] = ecn.e(bArr);
        int[] iArrB = ecj.b(this.h);
        this.h = iArrB;
        LogUtil.a("MulticastMessage", "generateIpData Hex : ", ecj.b(ecj.e(iArrB)));
    }

    private String d(String str) {
        StringBuilder sb = new StringBuilder(16);
        String strSubstring = "";
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MulticastMessage", "ssid is null");
            return "";
        }
        if (str.length() - 5 >= 0) {
            strSubstring = str.substring(str.length() - 5);
        } else {
            LogUtil.j("MulticastMessage", "ssid length error");
        }
        sb.append(strSubstring);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.d("MulticastMessage", "encryptKeyData: in mode ", Integer.valueOf(this.o.c()));
        byte[] bArrA = ecj.a(this.o.c(), this.o.i(), this.o.d());
        this.j = bArrA;
        if (bArrA == null) {
            LogUtil.j("MulticastMessage", "encryptKeyData: out mKeyEncodeData is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        if (bArr != null && bArr.length >= 16) {
            for (int i = 0; i < 16; i++) {
                bArr2[i] = bArr[i];
            }
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("MulticastMessage", "encryptValueData: in");
        String strJ = this.o.j();
        if (strJ == null) {
            return;
        }
        byte[] bArrD = ecg.d(strJ.getBytes(Charset.forName("UTF-8")), this.o.d(), this.o.e());
        this.l = bArrD;
        LogUtil.d("MulticastMessage", "encryptValueData mValueEncodeData :", ecj.b(bArrD));
    }

    private int i() {
        int i;
        int iB = b();
        int iC = this.o.c();
        if (iC == 100) {
            i = 1;
        } else if (iC == 101) {
            i = 2;
        } else if (iC != 110) {
            LogUtil.j("MulticastMessage", "getVersion2Mode mEncryptMode ", Integer.valueOf(iC));
            i = 1;
        } else {
            i = 3;
        }
        return (iB & 15) | ((i & 15) << 4);
    }

    public void c() {
        this.g.sendEmptyMessage(1);
    }

    public void d() {
        this.g.sendEmptyMessage(2);
    }

    public int b() {
        int i = 0;
        if (this.f.length() > 4) {
            LogUtil.d("MulticastMessage", "getSsidVersion char ", Character.valueOf(this.f.charAt(2)));
            String strValueOf = String.valueOf(this.f.charAt(2));
            LogUtil.d("MulticastMessage", "getSsidVersion str ", strValueOf);
            try {
                i = Integer.parseInt(strValueOf);
            } catch (NumberFormatException unused) {
                LogUtil.e("MulticastMessage", "getSsidVersion catch NumberFormatException");
            }
            LogUtil.a("MulticastMessage", "getSsidVersion version ", Integer.valueOf(i));
        }
        return i;
    }

    public void e(int i) {
        this.f32667c = i;
    }
}
