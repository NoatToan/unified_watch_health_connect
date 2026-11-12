package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class nl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28036b;
    public String c;

    public nl9(String str, String str2, String str3) {
        this.f28035a = str;
        this.f28036b = str3 == null ? "" : str3;
        this.c = str2;
    }

    public String a() {
        return this.f28036b + "/" + yxf.b(this.f28035a, this.c);
    }
}
