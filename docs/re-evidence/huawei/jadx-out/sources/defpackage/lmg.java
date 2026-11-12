package defpackage;

import android.text.TextUtils;
import com.huawei.utils.FoundationCommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lmg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40442c;
    private String d;
    private String e;
    private String i;
    private String j;

    public String a() {
        return this.f40441b;
    }

    public void a(String str) {
        this.f40441b = str;
    }

    public String e() {
        return this.f40442c;
    }

    public void c(String str) {
        this.f40442c = str;
    }

    public String b() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public void i(String str) {
        this.j = str;
    }

    public void b(String str) {
        this.i = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public void c(int i) {
        this.f40440a = i;
    }

    public int hashCode() {
        String str = this.f40442c;
        return (str == null ? 0 : str.hashCode()) + 527;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lmg) {
            return !TextUtils.isEmpty(e()) && e().equals(((lmg) obj).e());
        }
        return false;
    }

    public String d() {
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        return FoundationCommonUtil.getEncryptionLogMark(this.i, this.e, this.f40440a);
    }
}
