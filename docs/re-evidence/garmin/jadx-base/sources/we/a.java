package we;

import cf.t;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f184700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f184701b;

    public a(b bVar, t tVar) {
        this.f184701b = bVar;
        this.f184700a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVarA = u.a();
        int i14 = b.f184702e;
        t tVar = this.f184700a;
        String str = tVar.f26941a;
        uVarA.getClass();
        this.f184701b.f184703a.e(tVar);
    }
}
