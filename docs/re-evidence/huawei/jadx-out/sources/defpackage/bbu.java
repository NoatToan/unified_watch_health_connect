package defpackage;

/* JADX INFO: loaded from: classes22.dex */
public class bbu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f955b;
    protected final String d;

    public bbu(String str, String str2, boolean z) {
        this.d = str;
        this.f954a = str2;
        this.f955b = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("{");
        b(sb);
        sb.append("}");
        return sb.toString();
    }

    protected StringBuilder b(StringBuilder sb) {
        sb.append("moduleName:");
        sb.append(this.d);
        sb.append('_');
        sb.append(this.f954a);
        sb.append(", builtIn:");
        sb.append(this.f955b);
        return sb;
    }
}
