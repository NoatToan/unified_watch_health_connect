package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class jvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39127a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39128c;
    private String e;

    public jvw(String str, String str2, String str3) {
        this.f39127a = str;
        this.f39128c = str2;
        this.e = str3;
    }

    public String c() {
        return this.f39128c;
    }

    public String d() {
        return this.f39127a;
    }

    public String e() {
        return this.e;
    }

    public int hashCode() {
        return Objects.hash(this.f39127a, this.f39128c, this.e);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvw) {
            jvw jvwVar = (jvw) obj;
            String str = this.f39128c;
            if (str != null && this.f39127a != null && this.e != null && str.equals(jvwVar.c()) && this.f39127a.equals(jvwVar.d()) && this.e.equals(jvwVar.e())) {
                return true;
            }
        }
        return false;
    }
}
