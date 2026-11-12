package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36328a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f36329c;

    public String a() {
        return this.f36328a;
    }

    public void d(String str) {
        this.f36328a = str;
    }

    public List<String> e() {
        return this.f36329c;
    }

    public void e(List<String> list) {
        this.f36329c = list;
    }

    public int hashCode() {
        String str = this.f36328a;
        int iHashCode = str != null ? str.hashCode() : 0;
        List<String> list = this.f36329c;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hau)) {
            return false;
        }
        hau hauVar = (hau) obj;
        String str = this.f36328a;
        return str != null && this.f36329c != null && str.equals(hauVar.a()) && this.f36329c.equals(hauVar.e());
    }
}
