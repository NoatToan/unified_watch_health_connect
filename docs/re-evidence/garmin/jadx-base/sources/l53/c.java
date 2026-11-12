package l53;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\rB5\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ll53/c;", "K", "V", "Lp13/d;", "Li53/g;", "", "firstKey", "lastKey", "Lk53/d;", "Ll53/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lk53/d;)V", "a", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<K, V> extends p13.d<K, V> implements i53.g<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f110400e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f110401f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f110403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k53.d<K, l53.a<V>> f110404d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e23.p<l53.a<V>, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f110405a = new b();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj;
            l53.a aVar2 = (l53.a) obj2;
            aVar.getClass();
            aVar2.getClass();
            return Boolean.valueOf(s.g(aVar.f110395a, aVar2.f110395a));
        }
    }

    /* JADX INFO: renamed from: l53.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C2108c implements e23.p<l53.a<V>, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2108c f110406a = new C2108c();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj;
            l53.a aVar2 = (l53.a) obj2;
            aVar.getClass();
            aVar2.getClass();
            return Boolean.valueOf(s.g(aVar.f110395a, aVar2.f110395a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements e23.p<l53.a<V>, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f110407a = new d();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj;
            aVar.getClass();
            return Boolean.valueOf(s.g(aVar.f110395a, obj2));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements e23.p<l53.a<V>, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f110408a = new e();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj;
            aVar.getClass();
            return Boolean.valueOf(s.g(aVar.f110395a, obj2));
        }
    }

    static {
        n53.b bVar = n53.b.f123788a;
        k53.d.f102962d.getClass();
        k53.d dVar = k53.d.f102963e;
        dVar.getClass();
        f110401f = new c(bVar, bVar, dVar);
    }

    public c(Object obj, Object obj2, k53.d<K, l53.a<V>> dVar) {
        dVar.getClass();
        this.f110402b = obj;
        this.f110403c = obj2;
        this.f110404d = dVar;
    }

    @Override // p13.d
    public final Set<Map.Entry<K, V>> b() {
        return new l(this);
    }

    @Override // p13.d
    public final Set c() {
        return new n(this);
    }

    @Override // p13.d, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f110404d.containsKey(obj);
    }

    @Override // p13.d
    /* JADX INFO: renamed from: d */
    public final int getF102965c() {
        return this.f110404d.size();
    }

    @Override // p13.d
    public final Collection e() {
        return new q(this);
    }

    @Override // p13.d, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getF102965c() != map.size()) {
            return false;
        }
        boolean z14 = map instanceof c;
        k53.d<K, l53.a<V>> dVar = this.f110404d;
        if (z14) {
            return dVar.f102964b.g(((c) obj).f110404d.f102964b, b.f110405a);
        }
        if (map instanceof l53.d) {
            return dVar.f102964b.g(((l53.d) obj).f110412d.f102975c, C2108c.f110406a);
        }
        if (map instanceof k53.d) {
            return dVar.f102964b.g(((k53.d) obj).f102964b, d.f110407a);
        }
        return map instanceof k53.f ? dVar.f102964b.g(((k53.f) obj).f102975c, e.f110408a) : super.equals(obj);
    }

    @Override // p13.d, java.util.Map
    public final V get(Object obj) {
        l53.a<V> aVar = this.f110404d.get(obj);
        if (aVar != null) {
            return aVar.f110395a;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll53/c$a;", "", "<init>", "()V", "Ll53/c;", "", "EMPTY", "Ll53/c;", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
