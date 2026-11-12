package j83;

import v83.s;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f97744b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f97745a;

    public static class a implements c {
        @Override // n83.b
        public final void call(j83.d dVar) {
            j83.d dVar2 = dVar;
            dVar2.b(y83.d.f195249a);
            dVar2.a();
        }
    }

    /* JADX INFO: renamed from: j83.b$b, reason: collision with other inner class name */
    public static class C1865b implements c {
        @Override // n83.b
        public final void call(j83.d dVar) {
            dVar.b(y83.d.f195249a);
        }
    }

    public interface c extends n83.b<j83.d> {
    }

    public interface d extends n83.d<j83.d, j83.d> {
    }

    static {
        new b(new a(), false);
        new b(new C1865b(), false);
    }

    public b(c cVar, boolean z14) {
        v83.i iVar;
        if (z14 && (iVar = s.f176259d) != null) {
            cVar = (c) iVar.call(cVar);
        }
        this.f97745a = cVar;
    }

    public b(c cVar) {
        v83.i iVar = s.f176259d;
        this.f97745a = iVar != null ? (c) iVar.call(cVar) : cVar;
    }
}
