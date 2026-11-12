package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class bps implements dqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dqe f4472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dqe f4473b;

    public bps(dqe dqeVar, dqe dqeVar2) {
        this.f4472a = dqeVar;
        this.f4473b = dqeVar2;
    }

    @Override // defpackage.dqe
    public void log(String str) {
        dqe dqeVar = this.f4472a;
        if (dqeVar != null) {
            dqeVar.log(str);
        }
        dqe dqeVar2 = this.f4473b;
        if (dqeVar2 != null) {
            dqeVar2.log(str);
        }
    }

    @Override // defpackage.dqe
    public void log(String str, Throwable th) {
        dqe dqeVar = this.f4472a;
        if (dqeVar != null) {
            dqeVar.log(str, th);
        }
        dqe dqeVar2 = this.f4473b;
        if (dqeVar2 != null) {
            dqeVar2.log(str, th);
        }
    }
}
