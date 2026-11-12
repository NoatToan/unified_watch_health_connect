package z3;

import p005kotlin.Metadata;
import p3.c4;
import p3.i2;
import p3.t;
import p3.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\f\rB3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lz3/i;", "Lw3/d;", "Lp3/t;", "", "Lp3/c4;", "Lp3/i2;", "Lw3/t;", "node", "", "size", "<init>", "(Lw3/t;I)V", "a", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends w3.d<t<Object>, c4<Object>> implements i2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f202102f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f202103g;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz3/i$a;", "Lw3/f;", "Lp3/t;", "", "Lp3/c4;", "Lz3/i;", "map", "<init>", "(Lz3/i;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w3.f<t<Object>, c4<Object>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public i f202104g;

        public a(i iVar) {
            super(iVar);
            this.f202104g = iVar;
        }

        @Override // w3.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof t) {
                return super.containsKey((t) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof c4) {
                return super.containsValue((c4) obj);
            }
            return false;
        }

        @Override // w3.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof t) {
                return (c4) super.get((t) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof t) ? obj2 : (c4) super.getOrDefault((t) obj, (c4) obj2);
        }

        @Override // w3.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final i e() {
            Object obj = this.f181794c;
            i iVar = this.f202104g;
            if (obj != iVar.f181787b) {
                this.f181793b = new y3.d();
                iVar = new i(this.f181794c, getF181797f());
            }
            this.f202104g = iVar;
            return iVar;
        }

        @Override // w3.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof t) {
                return (c4) super.remove((t) obj);
            }
            return null;
        }
    }

    static {
        w3.t.f181809e.getClass();
        w3.t tVar = w3.t.f181810f;
        tVar.getClass();
        f202103g = new i(tVar, 0);
    }

    public i(w3.t<t<Object>, c4<Object>> tVar, int i14) {
        super(tVar, i14);
    }

    @Override // p3.w
    public final <T> T a(t<T> tVar) {
        return (T) x.a(this, tVar);
    }

    @Override // w3.d, u3.d
    public final u3.d.a<t<Object>, c4<Object>> builder() {
        return new a(this);
    }

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
    @Override // p3.i2
    public final i c0(t tVar, c4 c4Var) {
        w3.t.b bVarU = this.f181787b.u(tVar.hashCode(), tVar, c4Var, 0);
        return bVarU == null ? this : new i(bVarU.f181815a, this.f181788c + bVarU.f181816b);
    }

    @Override // w3.d, p13.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof t) {
            return super.containsKey((t) obj);
        }
        return false;
    }

    @Override // p13.d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof c4) {
            return super.containsValue((c4) obj);
        }
        return false;
    }

    @Override // w3.d, p13.d, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof t) {
            return (c4) super.get((t) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof t) ? obj2 : (c4) super.getOrDefault((t) obj, (c4) obj2);
    }

    @Override // w3.d
    /* JADX INFO: renamed from: h */
    public final w3.f<t<Object>, c4<Object>> builder() {
        return new a(this);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz3/i$b;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Override // w3.d, u3.d
    /* JADX INFO: renamed from: builder, reason: avoid collision after fix types in other method */
    public final u3.d.a<t<Object>, c4<Object>> builder2() {
        return new a(this);
    }
}
