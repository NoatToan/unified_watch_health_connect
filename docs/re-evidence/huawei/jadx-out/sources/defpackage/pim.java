package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class pim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45441a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45442c;

    public String a() {
        return (String) lst.d(this.f45441a);
    }

    public void c(String str) {
        this.f45441a = (String) lst.d(str);
    }

    public String b() {
        return (String) lst.d(this.f45442c);
    }

    public void a(String str) {
        this.f45442c = (String) lst.d(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("EzPluginFileApplyRule{minAppVersion='");
        stringBuffer.append(this.f45441a);
        stringBuffer.append("', minIndexVersion='").append(this.f45442c).append("'}");
        return stringBuffer.toString();
    }
}
