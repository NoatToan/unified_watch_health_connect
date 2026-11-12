package l73;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f111450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f111451b;

    public final synchronized void a(i iVar) {
        try {
            i iVar2 = this.f111451b;
            if (iVar2 != null) {
                iVar2.f111449c = iVar;
                this.f111451b = iVar;
            } else {
                if (this.f111450a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f111451b = iVar;
                this.f111450a = iVar;
            }
            notifyAll();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized i b() {
        i iVar;
        iVar = this.f111450a;
        if (iVar != null) {
            i iVar2 = iVar.f111449c;
            this.f111450a = iVar2;
            if (iVar2 == null) {
                this.f111451b = null;
            }
        }
        return iVar;
    }
}
