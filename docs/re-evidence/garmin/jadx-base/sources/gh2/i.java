package gh2;

/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f77458c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f77459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f77460b;

    public static abstract class a {
        public final void a() {
            i iVar = i.f77458c;
            iVar.getClass();
            iVar.f77459a = b();
            o oVar = iVar.f77460b;
            if (oVar == null) {
                iVar.f77460b = new o(c());
            } else {
                n nVarC = c();
                o.a aVar = oVar.f77478c;
                n nVar = oVar.f77477b;
                if (nVar != null) {
                    nVar.deleteObserver(aVar);
                }
                oVar.f77477b = nVarC;
                nVarC.addObserver(aVar);
            }
            iVar.f77460b.i();
        }

        public abstract c b();

        public abstract n c();
    }

    public static class b {
    }

    public enum c {
        Firebase,
        GarminConnect,
        Local,
        /* JADX INFO: Fake field, exist only in values array */
        Custom
    }

    private i() {
    }

    public final o a() {
        o oVar = this.f77460b;
        if (oVar != null) {
            return oVar;
        }
        vb.h.z("RemoteConfigManager has not initialized. Call config() for initialization.");
        return null;
    }
}
