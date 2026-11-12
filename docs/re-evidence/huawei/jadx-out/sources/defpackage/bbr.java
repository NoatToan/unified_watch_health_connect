package defpackage;

/* JADX INFO: loaded from: classes22.dex */
public final class bbr extends bbu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f952c;
    private final int e;

    public bbr(bbu bbuVar, int i, Throwable th) {
        super(bbuVar.d, bbuVar.f954a, bbuVar.f955b);
        this.e = i;
        this.f952c = th;
    }

    public int d() {
        return this.e;
    }

    @Override // defpackage.bbu
    protected StringBuilder b(StringBuilder sb) {
        super.b(sb);
        sb.append(", errorCode:");
        sb.append(this.e);
        sb.append(", errorMsg:");
        sb.append(this.f952c.getMessage());
        return sb;
    }
}
