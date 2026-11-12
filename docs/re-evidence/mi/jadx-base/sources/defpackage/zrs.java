package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class zrs extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h3s f41614a;

    public zrs(h3s h3sVar) {
        this.f41614a = h3sVar;
    }

    @Override // k5s.a
    public String a() {
        return "100889";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f41614a.q() > 0) {
            this.f41614a.f19662a.execute(new tus(this));
        }
    }
}
