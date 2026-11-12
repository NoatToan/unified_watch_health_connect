package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class rcp<T> implements dbi<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbi<T> f32419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final scp f32420b;

    public class a extends ddo<T> {
        public final /* synthetic */ hbi f;
        public final /* synthetic */ String g;
        public final /* synthetic */ cg4 h;
        public final /* synthetic */ ebi i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cg4 cg4Var, hbi hbiVar, String str, String str2, hbi hbiVar2, String str3, cg4 cg4Var2, ebi ebiVar) {
            super(cg4Var, hbiVar, str, str2);
            this.f = hbiVar2;
            this.g = str3;
            this.h = cg4Var2;
            this.i = ebiVar;
        }

        @Override // defpackage.edo
        public void b(T t) {
        }

        @Override // defpackage.edo
        public T c() throws Exception {
            return null;
        }

        @Override // defpackage.ddo, defpackage.edo
        public void f(T t) {
            this.f.g(this.g, "BackgroundThreadHandoffProducer", null);
            rcp.this.f32419a.a(this.h, this.i);
        }
    }

    public class b extends ea2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ddo f32421a;

        public b(ddo ddoVar) {
            this.f32421a = ddoVar;
        }

        @Override // defpackage.fbi
        public void b() {
            this.f32421a.a();
            rcp.this.f32420b.b(this.f32421a);
        }
    }

    public rcp(dbi<T> dbiVar, scp scpVar) {
        this.f32419a = (dbi) b6i.g(dbiVar);
        this.f32420b = scpVar;
    }

    @Override // defpackage.dbi
    public void a(cg4<T> cg4Var, ebi ebiVar) {
        hbi hbiVarF = ebiVar.f();
        String id = ebiVar.getId();
        a aVar = new a(cg4Var, hbiVarF, "BackgroundThreadHandoffProducer", id, hbiVarF, id, cg4Var, ebiVar);
        ebiVar.c(new b(aVar));
        this.f32420b.a(aVar);
    }
}
