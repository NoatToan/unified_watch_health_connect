package defpackage;

import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class elj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33135c;
    private boolean d = false;
    private String e;

    public elj(String str, String str2, String str3, String str4) {
        this.e = str;
        this.f33135c = str2;
        this.f33133a = str3;
        this.f33134b = str4;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        elj eljVar = obj instanceof elj ? (elj) obj : null;
        String str = this.e;
        return (str == null || this.f33135c == null || eljVar == null || !str.equals(eljVar.a()) || !this.f33135c.equals(eljVar.e())) ? false : true;
    }

    public int hashCode() {
        return CommonUtil.j(a());
    }

    public String a() {
        return (String) dym.d(this.e);
    }

    public String c() {
        return (String) dym.d(this.f33134b);
    }

    public String e() {
        return (String) dym.d(this.f33135c);
    }

    public String d() {
        return (String) dym.d(this.f33133a);
    }

    public boolean b() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }
}
