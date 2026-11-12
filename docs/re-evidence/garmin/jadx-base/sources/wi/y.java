package wi;

/* JADX INFO: loaded from: classes7.dex */
public class y implements com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aj.o.a f185470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f185471b;

    public y(z zVar, aj.o.a aVar) {
        this.f185471b = zVar;
        this.f185470a = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Object obj) {
        z zVar = this.f185471b;
        aj.o.a<?> aVar = this.f185470a;
        aj.o.a<?> aVar2 = zVar.f185477f;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        z zVar2 = this.f185471b;
        aj.o.a aVar3 = this.f185470a;
        j jVar = zVar2.f185472a.f185310p;
        if (obj != null && jVar.c(aVar3.f3372c.b())) {
            zVar2.f185476e = obj;
            zVar2.f185473b.b();
        } else {
            f.a aVar4 = zVar2.f185473b;
            ui.e eVar = aVar3.f3370a;
            com.bumptech.glide.load.data.d<Data> dVar = aVar3.f3372c;
            aVar4.d(eVar, obj, dVar, dVar.b(), zVar2.f185478g);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bumptech.glide.load.data.d.a
    public final void e(Exception exc) {
        z zVar = this.f185471b;
        aj.o.a<?> aVar = this.f185470a;
        aj.o.a<?> aVar2 = zVar.f185477f;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        z zVar2 = this.f185471b;
        aj.o.a aVar3 = this.f185470a;
        f.a aVar4 = zVar2.f185473b;
        ui.e eVar = zVar2.f185478g;
        com.bumptech.glide.load.data.d<Data> dVar = aVar3.f3372c;
        aVar4.c(eVar, exc, dVar, dVar.b());
    }
}
