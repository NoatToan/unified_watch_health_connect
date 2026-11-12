package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nlq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28053b;

    public nlq(String str, String str2) {
        this.f28052a = str;
        this.f28053b = str2;
    }

    public String toString() {
        String str = this.f28052a;
        String str2 = this.f28053b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
