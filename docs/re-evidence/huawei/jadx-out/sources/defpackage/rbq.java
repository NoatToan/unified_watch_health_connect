package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes16.dex */
public class rbq extends rbn {
    private static final long serialVersionUID = 8455537364539177810L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47097a;
    private rbo e;
    private rbr h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47098b = "";
    private String g = "";
    private String d = "";
    private String f = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47099c = "";

    public String h() {
        return this.f47098b;
    }

    public void c(String str) {
        this.f47098b = str;
    }

    public String g() {
        return this.g;
    }

    public void d(String str) {
        this.g = str;
    }

    public String a() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public int f() {
        return this.f47097a;
    }

    public void a(int i) {
        this.f47097a = i;
    }

    public String n() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public String e() {
        return this.f47099c;
    }

    public void b(String str) {
        this.f47099c = str;
    }

    public String d() {
        return b(0);
    }

    public String i() {
        return b(1);
    }

    public String j() {
        return b(3);
    }

    public String b() {
        return b(2);
    }

    public rbr o() {
        return this.h;
    }

    public void a(rbr rbrVar) {
        this.h = rbrVar;
    }

    public rbo c() {
        return this.e;
    }

    public void c(rbo rboVar) {
        this.e = rboVar;
    }

    private String b(int i) {
        if (TextUtils.isEmpty(this.f47099c)) {
            LogUtil.j("Declaration", "getOobeVersions: content version is null or empty.");
            return "";
        }
        String[] strArrSplit = this.f47099c.split(Constants.LINK);
        if (strArrSplit.length != 4 || i < 0 || i > 3) {
            LogUtil.j("Declaration", "getOobeVersions: content version is invalid. contentVersion: ", this.f47099c, ", index: ", Integer.valueOf(i));
            return "";
        }
        return strArrSplit[i];
    }

    public String toString() {
        return "Declaration{productType='" + this.f47098b + "', scope='" + this.g + "', featureId='" + this.d + "', index=" + this.f47097a + ", xmlVersion='" + this.f + "', contentVersion='" + this.f47099c + "', title=" + this.h + ", content=" + this.e + '}';
    }
}
