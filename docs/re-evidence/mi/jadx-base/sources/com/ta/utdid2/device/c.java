package com.ta.utdid2.device;

import android.content.Context;
import android.os.Binder;
import android.provider.Settings;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.ta.utdid2.a.a.f;
import com.ta.utdid2.a.a.g;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f10704a;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f10705k = ".UTSystemConfig" + File.separator + "Global";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.ta.utdid2.b.a.c f22a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private d f23a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.ta.utdid2.b.a.c f10706b;
    private String i;
    private String j;
    private Context mContext;
    private String h = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Pattern f24b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    private c(Context context) {
        this.mContext = null;
        this.f23a = null;
        this.i = "xx_utdid_key";
        this.j = "xx_utdid_domain";
        this.f22a = null;
        this.f10706b = null;
        this.mContext = context;
        this.f10706b = new com.ta.utdid2.b.a.c(context, f10705k, "Alvin2", false, true);
        this.f22a = new com.ta.utdid2.b.a.c(context, ".DataStorage", "ContextData", false, true);
        this.f23a = new d();
        this.i = String.format("K_%d", Integer.valueOf(g.a(this.i)));
        this.j = String.format("D_%d", Integer.valueOf(g.a(this.j)));
    }

    public static c a(Context context) {
        if (context != null && f10704a == null) {
            synchronized (e) {
                try {
                    if (f10704a == null) {
                        c cVar = new c(context);
                        f10704a = cVar;
                        cVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10704a;
    }

    private boolean b(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f24b.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private void c() throws Throwable {
        boolean z;
        com.ta.utdid2.b.a.c cVar = this.f10706b;
        if (cVar != null) {
            if (g.m204a(cVar.getString("UTDID2"))) {
                String string = this.f10706b.getString("UTDID");
                if (!g.m204a(string)) {
                    f(string);
                }
            }
            boolean z2 = true;
            if (g.m204a(this.f10706b.getString("DID"))) {
                z = false;
            } else {
                this.f10706b.remove("DID");
                z = true;
            }
            if (g.m204a(this.f10706b.getString("EI"))) {
                z2 = z;
            } else {
                this.f10706b.remove("EI");
            }
            if (!g.m204a(this.f10706b.getString("SI"))) {
                this.f10706b.remove("SI");
            } else if (!z2) {
                return;
            }
            this.f10706b.commit();
        }
    }

    private void f(String str) throws Throwable {
        com.ta.utdid2.b.a.c cVar;
        if (b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (cVar = this.f10706b) == null) {
                return;
            }
            cVar.putString("UTDID2", str);
            this.f10706b.commit();
        }
    }

    private void g(String str) throws Throwable {
        com.ta.utdid2.b.a.c cVar;
        if (str == null || (cVar = this.f22a) == null || str.equals(cVar.getString(this.i))) {
            return;
        }
        this.f22a.putString(this.i, str);
        this.f22a.commit();
    }

    private void h(String str) {
        String string;
        if (f() && b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length()) {
                try {
                    string = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
                } catch (Exception unused) {
                    string = null;
                }
                if (b(string)) {
                    return;
                }
                try {
                    Settings.System.putString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk", str);
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void i(String str) {
        String string;
        try {
            string = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused) {
            string = null;
        }
        if (str.equals(string)) {
            return;
        }
        try {
            Settings.System.putString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp", str);
        } catch (Exception unused2) {
        }
    }

    private void j(String str) {
        if (!f() || str == null) {
            return;
        }
        i(str);
    }

    public synchronized String getValue() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        return h();
    }

    public synchronized String i() {
        String string;
        boolean z;
        String string2 = "";
        try {
            string2 = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
        } catch (Exception unused) {
        }
        if (b(string2)) {
            return string2;
        }
        e eVar = new e();
        try {
            string = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused2) {
            string = null;
        }
        if (g.m204a(string)) {
            z = true;
        } else {
            String strE = eVar.e(string);
            if (b(strE)) {
                h(strE);
                return strE;
            }
            String strD = eVar.d(string);
            if (b(strD)) {
                String strC = this.f23a.c(strD);
                if (!g.m204a(strC)) {
                    j(strC);
                    try {
                        string = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
                    } catch (Exception unused3) {
                    }
                }
            }
            String strD2 = this.f23a.d(string);
            if (b(strD2)) {
                this.h = strD2;
                f(strD2);
                g(string);
                h(this.h);
                return this.h;
            }
            z = false;
        }
        String strG = g();
        if (b(strG)) {
            String strC2 = this.f23a.c(strG);
            if (z) {
                j(strC2);
            }
            h(strG);
            g(strC2);
            this.h = strG;
            return strG;
        }
        String string3 = this.f22a.getString(this.i);
        if (!g.m204a(string3)) {
            String strD3 = eVar.d(string3);
            if (!b(strD3)) {
                strD3 = this.f23a.d(string3);
            }
            if (b(strD3)) {
                String strC3 = this.f23a.c(strD3);
                if (!g.m204a(strD3)) {
                    this.h = strD3;
                    if (z) {
                        j(strC3);
                    }
                    f(this.h);
                    return this.h;
                }
            }
        }
        return null;
    }

    public static String b(byte[] bArr) throws Exception {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, DKFRequestService.o, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, SettingsModule.VALUE_TYPE_STRING_ENUM, -80, -68, -78, -117, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(f.a(bArr2), mac.getAlgorithm()));
        return com.ta.utdid2.a.a.b.encodeToString(mac.doFinal(bArr), 2);
    }

    private String g() throws Throwable {
        com.ta.utdid2.b.a.c cVar = this.f10706b;
        if (cVar == null) {
            return null;
        }
        String string = cVar.getString("UTDID2");
        if (g.m204a(string) || this.f23a.c(string) == null) {
            return null;
        }
        return string;
    }

    private boolean f() {
        return this.mContext.checkPermission("android.permission.WRITE_SETTINGS", Binder.getCallingPid(), Binder.getCallingUid()) == 0;
    }

    public synchronized String h() {
        String strI = i();
        this.h = strI;
        if (!TextUtils.isEmpty(strI)) {
            return this.h;
        }
        try {
            byte[] bArrM211c = m211c();
            if (bArrM211c != null) {
                String strEncodeToString = com.ta.utdid2.a.a.b.encodeToString(bArrM211c, 2);
                this.h = strEncodeToString;
                f(strEncodeToString);
                String strC = this.f23a.c(bArrM211c);
                if (strC != null) {
                    j(strC);
                    g(strC);
                }
                return this.h;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private byte[] m211c() throws Exception {
        String strA;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bytes = com.ta.utdid2.a.a.d.getBytes(iCurrentTimeMillis);
        byte[] bytes2 = com.ta.utdid2.a.a.d.getBytes(iNextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strA = com.ta.utdid2.a.a.e.a(this.mContext);
        } catch (Exception unused) {
            strA = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(com.ta.utdid2.a.a.d.getBytes(g.a(strA)), 0, 4);
        byteArrayOutputStream.write(com.ta.utdid2.a.a.d.getBytes(g.a(b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }
}
