package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a0p implements cj1 {
    public static final a0p[] w = new a0p[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f491b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public byte i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f492k;
    public String l;
    public String m;
    public String n;
    public int o;
    public int p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f493r;
    public boolean s;
    public boolean t;
    public final File u;
    public final Map<String, String> v;

    public a0p(byte[] bArr, b1s b1sVar, boolean z) throws IOException {
        this(false);
        q(bArr, b1sVar, false, z);
    }

    public static String o(String str, boolean z) {
        String lowerCase;
        int iIndexOf;
        if (!z && (lowerCase = System.getProperty("os.name").toLowerCase(Locale.ENGLISH)) != null) {
            if (lowerCase.startsWith("windows")) {
                if (str.length() > 2) {
                    char cCharAt = str.charAt(0);
                    if (str.charAt(1) == ':' && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                        str = str.substring(2);
                    }
                }
            } else if (lowerCase.contains("netware") && (iIndexOf = str.indexOf(58)) != -1) {
                str = str.substring(iIndexOf + 1);
            }
        }
        String strReplace = str.replace(File.separatorChar, '/');
        while (!z && strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        return strReplace;
    }

    public void A(long j) {
        this.d = j;
    }

    public void B(String str) {
        this.m = str;
    }

    public void C(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            r(entry.getKey(), entry.getValue(), map);
        }
    }

    public boolean a(a0p a0pVar) {
        return a0pVar != null && f().equals(a0pVar.f());
    }

    public final int b(byte[] bArr) {
        if (ej1.c("ustar ", bArr, 257, 6)) {
            return 2;
        }
        if (ej1.c("ustar\u0000", bArr, 257, 6)) {
            return ej1.c("tar\u0000", bArr, 508, 4) ? 4 : 3;
        }
        return 0;
    }

    public void c(Map<String, String> map) {
        this.s = true;
        this.f493r = Integer.parseInt(map.get("GNU.sparse.size"));
        if (map.containsKey("GNU.sparse.name")) {
            this.f490a = map.get("GNU.sparse.name");
        }
    }

    public void d(Map<String, String> map) {
        this.s = true;
        this.f493r = Integer.parseInt(map.get("GNU.sparse.realsize"));
        this.f490a = map.get("GNU.sparse.name");
    }

    public void e(Map<String, String> map) {
        this.t = true;
        if (map.containsKey("SCHILY.realsize")) {
            this.f493r = Long.parseLong(map.get("SCHILY.realsize"));
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a((a0p) obj);
    }

    public String f() {
        return this.f490a;
    }

    public long g() {
        return this.f;
    }

    public boolean h() {
        File file = this.u;
        if (file != null) {
            return file.isDirectory();
        }
        if (this.i == 53) {
            return true;
        }
        return (n() || l() || !f().endsWith("/")) ? false : true;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public boolean i() {
        return this.q;
    }

    public boolean j() {
        return this.i == 75;
    }

    public boolean k() {
        return this.i == 76;
    }

    public boolean l() {
        return this.i == 103;
    }

    public boolean m() {
        return this.i == 83;
    }

    public boolean n() {
        byte b2 = this.i;
        return b2 == 120 || b2 == 88;
    }

    public final long p(byte[] bArr, int i, int i2, boolean z) {
        if (!z) {
            return d0p.h(bArr, i, i2);
        }
        try {
            return d0p.h(bArr, i, i2);
        } catch (IllegalArgumentException unused) {
            return -1L;
        }
    }

    public final void q(byte[] bArr, b1s b1sVar, boolean z, boolean z2) throws IOException {
        this.f490a = z ? d0p.e(bArr, 0, 100) : d0p.f(bArr, 0, 100, b1sVar);
        this.c = (int) p(bArr, 100, 8, z2);
        this.d = (int) p(bArr, 108, 8, z2);
        this.e = (int) p(bArr, 116, 8, z2);
        this.f = d0p.h(bArr, 124, 12);
        this.g = p(bArr, 136, 12, z2);
        this.h = d0p.i(bArr);
        this.i = bArr[156];
        this.j = z ? d0p.e(bArr, 157, 100) : d0p.f(bArr, 157, 100, b1sVar);
        this.f492k = d0p.e(bArr, 257, 6);
        this.l = d0p.e(bArr, 263, 2);
        this.m = z ? d0p.e(bArr, 265, 32) : d0p.f(bArr, 265, 32, b1sVar);
        this.n = z ? d0p.e(bArr, 297, 32) : d0p.f(bArr, 297, 32, b1sVar);
        byte b2 = this.i;
        if (b2 == 51 || b2 == 52) {
            this.o = (int) p(bArr, 329, 8, z2);
            this.p = (int) p(bArr, 337, 8, z2);
        }
        int iB = b(bArr);
        if (iB == 2) {
            this.q = d0p.d(bArr, 482);
            this.f493r = d0p.g(bArr, 483, 12);
            return;
        }
        if (iB == 4) {
            String strE = z ? d0p.e(bArr, 345, 131) : d0p.f(bArr, 345, 131, b1sVar);
            if (strE.length() > 0) {
                this.f490a = strE + "/" + this.f490a;
                return;
            }
            return;
        }
        String strE2 = z ? d0p.e(bArr, 345, 155) : d0p.f(bArr, 345, 155, b1sVar);
        if (h() && !this.f490a.endsWith("/")) {
            this.f490a += "/";
        }
        if (strE2.length() > 0) {
            this.f490a = strE2 + "/" + this.f490a;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void r(String str, String str2, Map<String, String> map) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1916861932:
                if (str.equals("SCHILY.devmajor")) {
                    b2 = 0;
                }
                break;
            case -1916619760:
                if (str.equals("SCHILY.devminor")) {
                    b2 = 1;
                }
                break;
            case -277496563:
                if (str.equals("GNU.sparse.realsize")) {
                    b2 = 2;
                }
                break;
            case -160380561:
                if (str.equals("GNU.sparse.size")) {
                    b2 = 3;
                }
                break;
            case 102338:
                if (str.equals("gid")) {
                    b2 = 4;
                }
                break;
            case 115792:
                if (str.equals("uid")) {
                    b2 = 5;
                }
                break;
            case 3433509:
                if (str.equals("path")) {
                    b2 = 6;
                }
                break;
            case 3530753:
                if (str.equals(MediaStoreUtil.MediaInfo.SIZE)) {
                    b2 = 7;
                }
                break;
            case 98496370:
                if (str.equals("gname")) {
                    b2 = 8;
                }
                break;
            case 104223930:
                if (str.equals("mtime")) {
                    b2 = 9;
                }
                break;
            case 111425664:
                if (str.equals("uname")) {
                    b2 = 10;
                }
                break;
            case 530706950:
                if (str.equals("SCHILY.filetype")) {
                    b2 = 11;
                }
                break;
            case 1195018015:
                if (str.equals("linkpath")) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
        }
        switch (b2) {
            case 0:
                s(Integer.parseInt(str2));
                break;
            case 1:
                t(Integer.parseInt(str2));
                break;
            case 2:
                d(map);
                break;
            case 3:
                c(map);
                break;
            case 4:
                u(Long.parseLong(str2));
                break;
            case 5:
                A(Long.parseLong(str2));
                break;
            case 6:
                y(str2);
                break;
            case 7:
                z(Long.parseLong(str2));
                break;
            case 8:
                v(str2);
                break;
            case 9:
                x((long) (Double.parseDouble(str2) * 1000.0d));
                break;
            case 10:
                B(str2);
                break;
            case 11:
                if ("sparse".equals(str2)) {
                    e(map);
                }
                break;
            case 12:
                w(str2);
                break;
            default:
                this.v.put(str, str2);
                break;
        }
    }

    public void s(int i) {
        if (i >= 0) {
            this.o = i;
            return;
        }
        throw new IllegalArgumentException("Major device number is out of range: " + i);
    }

    public void t(int i) {
        if (i >= 0) {
            this.p = i;
            return;
        }
        throw new IllegalArgumentException("Minor device number is out of range: " + i);
    }

    public void u(long j) {
        this.e = j;
    }

    public void v(String str) {
        this.n = str;
    }

    public void w(String str) {
        this.j = str;
    }

    public void x(long j) {
        this.g = j / 1000;
    }

    public void y(String str) {
        this.f490a = o(str, this.f491b);
    }

    public void z(long j) {
        if (j >= 0) {
            this.f = j;
            return;
        }
        throw new IllegalArgumentException("Size is out of range: " + j);
    }

    public a0p(boolean z) {
        this.f490a = "";
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.j = "";
        this.f492k = "ustar\u0000";
        this.l = "00";
        this.n = "";
        this.o = 0;
        this.p = 0;
        this.v = new HashMap();
        String property = System.getProperty("user.name", "");
        this.m = property.length() > 31 ? property.substring(0, 31) : property;
        this.u = null;
        this.f491b = z;
    }
}
