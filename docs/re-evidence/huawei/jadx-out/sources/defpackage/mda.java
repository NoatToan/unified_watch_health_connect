package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class mda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41451a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41453c;
    private int d;
    private String e;

    public int d() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public String a() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public String c() {
        return this.f41452b;
    }

    public void d(String str) {
        this.f41452b = str;
    }

    public String b() {
        return this.f41453c;
    }

    public void a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            LogUtil.j("ApduCommand", "setChecker checkers is null or length is 0");
            this.f41453c = null;
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i].toUpperCase(Locale.getDefault()));
            if (i != strArr.length - 1) {
                sb.append("|");
            }
        }
        this.f41453c = sb.toString();
    }

    public String e() {
        return this.f41451a;
    }

    public void c(String str) {
        this.f41451a = str;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 4) {
            LogUtil.j("ApduCommand", "setChecker responseString length is 0 or less SW_LENGTH");
            this.f41452b = str;
        } else {
            this.f41452b = str.substring(0, str.length() - 4);
            this.f41451a = str.substring(str.length() - 4, str.length());
        }
    }

    public String toString() {
        return "ApduCommand{index=" + this.d + ", apdu='" + this.e + "', rapdu='" + this.f41452b + "', checker='" + this.f41453c + "', sw='" + this.f41451a + "'}";
    }
}
