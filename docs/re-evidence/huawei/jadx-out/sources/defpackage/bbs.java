package defpackage;

/* JADX INFO: loaded from: classes22.dex */
public class bbs extends bbu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f953c;
    private final Throwable e;

    public bbs(bbu bbuVar, int i, Throwable th) {
        super(bbuVar.d, bbuVar.f954a, bbuVar.f955b);
        this.f953c = i;
        this.e = th;
    }

    public int b() {
        return this.f953c;
    }

    @Override // defpackage.bbu
    protected StringBuilder b(StringBuilder sb) {
        super.b(sb);
        sb.append(", errorCode:");
        sb.append(this.f953c);
        sb.append(", errorMsg:");
        sb.append(this.e.getMessage());
        return sb;
    }
}
