package defpackage;

import com.huawei.ads.fund.util.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class axf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f737b;
    private int d;
    private int e;

    public void b() {
        this.f736a++;
    }

    public void e() {
        this.e++;
    }

    public void b(String str) {
        this.f737b = str;
    }

    public void d(int i) {
        this.d = i;
    }

    public String a() {
        if (StringUtils.isBlank(this.f737b)) {
            return null;
        }
        return this.f737b + "," + this.e + "," + this.f736a + "," + this.d;
    }
}
