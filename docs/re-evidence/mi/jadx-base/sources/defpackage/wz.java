package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f38487a;

    public interface a {
        void a(String str, byte[] bArr);
    }

    public void a(String str, byte[] bArr) {
        a aVar = this.f38487a;
        if (aVar != null) {
            aVar.a(str, bArr);
        }
    }

    public void b(a aVar) {
        this.f38487a = aVar;
    }
}
