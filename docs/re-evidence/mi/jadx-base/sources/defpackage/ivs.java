package defpackage;

import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class ivs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fd f22152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22153b;
    public String c;
    public String d;
    public int e;
    public byte f;
    public int g;
    public boolean h;
    public boolean i;
    public HMAlertApp j;

    public ivs(fd fdVar) {
        this(fdVar, (String) null, (String) null);
    }

    public HMAlertApp a() {
        return this.j;
    }

    public void b(int i) {
        this.g = i;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(boolean z) {
        this.i = z;
    }

    public String e() {
        return this.d;
    }

    public int f() {
        return this.g;
    }

    public String g() {
        if (this.f22152a != fd.ALERT_INCALL) {
            return this.c;
        }
        return null;
    }

    public fd h() {
        return this.f22152a;
    }

    public String i() {
        if (this.f22152a == fd.ALERT_INCALL) {
            return this.c;
        }
        return null;
    }

    public String j() {
        return this.f22153b;
    }

    public byte k() {
        return this.f;
    }

    public int l() {
        return this.e;
    }

    public boolean m() {
        return this.i;
    }

    public boolean n() {
        return this.h;
    }

    @NotNull
    public String toString() {
        return "HMAlertModeExt{mode=" + this.f22152a + ", mTitle='" + this.f22153b + "', message='" + this.c + "', appName='" + this.d + "', data=" + this.e + ", id=" + this.g + ", type=" + ((int) this.f) + ", mApp=" + this.j + ", supportHangUp=" + this.h + ", isAlterMaxLength" + this.i + AbstractJsonLexerKt.END_OBJ;
    }

    public ivs(HMAlertApp hMAlertApp) {
        this.f22152a = fd.ALERT_FIND;
        this.f22153b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        this.j = HMAlertApp.GENERIC;
        this.f22152a = fd.ALERT_THIRD_APP;
        this.j = hMAlertApp;
    }

    public ivs(int i, byte b2) {
        this.f22152a = fd.ALERT_FIND;
        this.f22153b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        HMAlertApp hMAlertApp = HMAlertApp.GENERIC;
        this.j = hMAlertApp;
        this.f22152a = fd.ALERT_THIRD_APP;
        this.j = hMAlertApp;
        this.g = i;
        this.f = b2;
    }

    public ivs(HMAlertApp hMAlertApp, String str, String str2) {
        this.f22152a = fd.ALERT_FIND;
        this.f22153b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        this.j = HMAlertApp.GENERIC;
        this.f22152a = fd.ALERT_THIRD_APP;
        this.j = hMAlertApp;
        this.f22153b = str;
        this.c = str2;
    }

    public ivs(fd fdVar, String str, byte b2) {
        this(fdVar, str, null, b2);
    }

    public ivs(fd fdVar, String str) {
        this(fdVar, str, (String) null);
    }

    public ivs(fd fdVar, String str, String str2) {
        this(fdVar, str, str2, (byte) 1);
    }

    public ivs(fd fdVar, String str, String str2, byte b2) {
        this.f22152a = fd.ALERT_FIND;
        this.f22153b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        this.j = HMAlertApp.GENERIC;
        this.f22152a = fdVar;
        this.f22153b = str;
        this.c = str2;
        this.f = b2;
    }
}
