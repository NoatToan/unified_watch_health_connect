package rf;

import dg.m;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lrf/e;", "Lrf/g;", "", "initialMaxSize", "Lrf/h;", "weakMemoryCache", "<init>", "(JLrf/h;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f152377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f152378c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrf/e$a;", "", "Lhf/h;", "image", "", "", "extras", "", "size", "<init>", "(Lhf/h;Ljava/util/Map;J)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hf.h f152379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f152380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f152381c;

        public a(hf.h hVar, Map<String, ? extends Object> map, long j8) {
            this.f152379a = hVar;
            this.f152380b = map;
            this.f152381c = j8;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"rf/e$b", "Ldg/m;", "Lrf/b$b;", "Lrf/e$a;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends m<rf.b.C2864b, a> {
        public b(long j8) {
            super(j8);
        }

        @Override // dg.m
        public final void a(rf.b.C2864b c2864b, a aVar, a aVar2) {
            a aVar3 = aVar;
            e.this.f152377b.f(c2864b, aVar3.f152379a, aVar3.f152380b, aVar3.f152381c);
        }

        @Override // dg.m
        public final long d(rf.b.C2864b c2864b, a aVar) {
            return aVar.f152381c;
        }
    }

    public e(long j8, h hVar) {
        this.f152376a = j8;
        this.f152377b = hVar;
        this.f152378c = new b(j8);
    }

    @Override // rf.g
    public final rf.b.c a(rf.b.C2864b c2864b) {
        a aVar = (a) this.f152378c.f59489a.get(c2864b);
        if (aVar != null) {
            return new rf.b.c(aVar.f152379a, aVar.f152380b);
        }
        return null;
    }

    @Override // rf.g
    public final void b(long j8) {
        b bVar = this.f152378c;
        bVar.f59490b = j8;
        bVar.e(j8);
    }

    @Override // rf.g
    public final void c(long j8) {
        this.f152378c.e(j8);
    }

    @Override // rf.g
    public final void clear() {
        this.f152378c.e(-1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rf.g
    public final boolean d(rf.b.C2864b c2864b) {
        b bVar = this.f152378c;
        Object objRemove = bVar.f59489a.remove(c2864b);
        if (objRemove != null) {
            bVar.f59491c = bVar.b() - bVar.c(c2864b, objRemove);
            bVar.a(c2864b, objRemove, null);
        }
        return objRemove != null;
    }

    @Override // rf.g
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getF152376a() {
        return this.f152376a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // rf.g
    public final void f(rf.b.C2864b c2864b, hf.h hVar, Map<String, ? extends Object> map, long j8) {
        b bVar = this.f152378c;
        long j14 = bVar.f59490b;
        LinkedHashMap linkedHashMap = bVar.f59489a;
        if (j8 > j14) {
            Object objRemove = linkedHashMap.remove(c2864b);
            if (objRemove != null) {
                bVar.f59491c = bVar.b() - bVar.c(c2864b, objRemove);
                bVar.a(c2864b, objRemove, null);
            }
            this.f152377b.f(c2864b, hVar, map, j8);
            return;
        }
        a aVar = new a(hVar, map, j8);
        Object objPut = linkedHashMap.put(c2864b, aVar);
        bVar.f59491c = bVar.c(c2864b, aVar) + bVar.b();
        if (objPut != null) {
            bVar.f59491c = bVar.b() - bVar.c(c2864b, objPut);
            bVar.a(c2864b, objPut, aVar);
        }
        bVar.e(bVar.f59490b);
    }

    @Override // rf.g
    public final long getMaxSize() {
        return this.f152378c.f59490b;
    }

    @Override // rf.g
    public final long getSize() {
        return this.f152378c.b();
    }
}
