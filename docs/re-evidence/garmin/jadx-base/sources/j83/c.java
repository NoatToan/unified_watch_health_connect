package j83;

/* JADX INFO: loaded from: classes11.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y83.c f97746a;

    public c(b bVar, y83.c cVar) {
        this.f97746a = cVar;
    }

    @Override // j83.d
    public final void a() {
        this.f97746a.f();
    }

    @Override // j83.d
    public final void b(o oVar) {
        o oVar2;
        y83.c cVar = this.f97746a;
        if (oVar == null) {
            cVar.getClass();
            vb.h.s("Subscription can not be null");
            return;
        }
        r83.a aVar = cVar.f195248a;
        do {
            oVar2 = aVar.get();
            if (oVar2 == r83.b.INSTANCE) {
                oVar.f();
                return;
            }
        } while (!aVar.compareAndSet(oVar2, oVar));
    }
}
