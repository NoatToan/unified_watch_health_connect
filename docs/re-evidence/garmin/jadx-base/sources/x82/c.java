package x82;

import ch.qos.logback.core.joran.action.Action;
import e23.l;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v13.i;
import vn2.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000fB=\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rB3\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lx82/c;", "", "PageKeyType", "PageDataType", "Lv82/b;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "Lx82/c$a;", "initialStateConfig", "Lx82/h;", "dataFetcherFactory", "<init>", "(Lo53/b0;Le23/l;Lx82/h;)V", "(Lo53/b0;Lx82/c$a;Lx82/h;)V", "a", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c<PageKeyType, PageDataType> implements v82.b<PageKeyType, PageDataType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f189566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<PageKeyType, a<PageDataType>> f189567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<PageKeyType, PageDataType> f189568c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(b0 b0Var, a<PageDataType> aVar, h<PageKeyType, PageDataType> hVar) {
        this(b0Var, new vu1.b(aVar, 28), hVar);
        b0Var.getClass();
        aVar.getClass();
        hVar.getClass();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [e23.p, v13.i] */
    @Override // v82.b
    public final x82.a a(o82.a aVar) {
        a<PageDataType> aVarInvoke = this.f189567b.invoke(aVar);
        PageDataType pagedatatype = aVarInvoke.f189569a;
        boolean z14 = aVarInvoke.f189570b;
        ?? r14 = (i) ((t0) this.f189568c).f178952b;
        h.a aVar2 = h.a.f189578a;
        return new x82.a(this.f189566a, pagedatatype, z14, new e(new g(r14, aVar, null)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx82/c$a;", "PageDataType", "", "initialData", "", "initialRefresh", "<init>", "(Ljava/lang/Object;Z)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a<PageDataType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PageDataType f189569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f189570b;

        public /* synthetic */ a(Object obj, boolean z14, int i14, j jVar) {
            this(obj, (i14 & 2) != 0 ? true : z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f189569a, aVar.f189569a) && this.f189570b == aVar.f189570b;
        }

        public final int hashCode() {
            PageDataType pagedatatype = this.f189569a;
            return Boolean.hashCode(this.f189570b) + ((pagedatatype == null ? 0 : pagedatatype.hashCode()) * 31);
        }

        public final String toString() {
            return "StateConfig(initialData=" + this.f189569a + ", initialRefresh=" + this.f189570b + ")";
        }

        public a(PageDataType pagedatatype, boolean z14) {
            this.f189569a = pagedatatype;
            this.f189570b = z14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(b0 b0Var, l<? super PageKeyType, a<PageDataType>> lVar, h<PageKeyType, PageDataType> hVar) {
        b0Var.getClass();
        lVar.getClass();
        hVar.getClass();
        this.f189566a = b0Var;
        this.f189567b = lVar;
        this.f189568c = hVar;
    }
}
