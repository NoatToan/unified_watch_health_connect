package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class bbs implements kbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4038b;

    public bbs(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f4037a = str;
        this.f4038b = str2;
    }

    @Override // defpackage.kbs
    public String a() {
        return this.f4037a;
    }

    @Override // defpackage.kbs
    public String b() {
        return this.f4038b;
    }
}
