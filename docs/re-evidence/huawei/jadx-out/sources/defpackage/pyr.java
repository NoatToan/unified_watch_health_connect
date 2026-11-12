package defpackage;

/* JADX INFO: loaded from: classes43.dex */
public class pyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45987c;
    private int d;
    private int e;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof pyr)) {
            return false;
        }
        pyr pyrVar = (pyr) obj;
        return this.f45987c.equals(pyrVar.f45987c) && this.f45985a.equals(pyrVar.f45985a) && this.e == pyrVar.e && this.f45986b == pyrVar.f45986b && this.d == pyrVar.d;
    }
}
