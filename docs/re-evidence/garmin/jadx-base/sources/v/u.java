package v;

/* JADX INFO: loaded from: classes.dex */
public class u implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f174084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f174085b;

    public u(s sVar, d1 d1Var) {
        this.f174085b = sVar;
        this.f174084a = d1Var;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
    }

    @Override // l0.c
    public final void onSuccess(Void r14) {
        this.f174085b.f174023q.remove(this.f174084a);
        int iOrdinal = this.f174085b.f174010e.ordinal();
        if (iOrdinal != 1 && iOrdinal != 5) {
            if (iOrdinal != 6 && (iOrdinal != 7 || this.f174085b.f174018l == 0)) {
                return;
            } else {
                this.f174085b.toString();
            }
        }
        if (this.f174085b.f174023q.isEmpty()) {
            s sVar = this.f174085b;
            if (sVar.f174016k != null) {
                sVar.toString();
                this.f174085b.f174016k.close();
                this.f174085b.f174016k = null;
            }
        }
    }
}
