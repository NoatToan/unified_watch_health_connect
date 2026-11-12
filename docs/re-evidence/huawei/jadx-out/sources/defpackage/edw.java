package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class edw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32820c;
    private String d;

    public String a() {
        return (String) lst.d(this.f32820c);
    }

    public void b(String str) {
        this.f32820c = (String) lst.d(str);
    }

    public String e() {
        return (String) lst.d(this.d);
    }

    public void a(String str) {
        this.d = (String) lst.d(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("EzPluginFileApplyRule{minAppVersion='");
        stringBuffer.append(this.f32820c);
        stringBuffer.append("', minIndexVersion='").append(this.d).append("'}");
        return stringBuffer.toString();
    }
}
