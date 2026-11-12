package k53;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lk53/d;", "K", "V", "Lp13/d;", "Li53/g;", "Lk53/t;", "node", "", "size", "<init>", "(Lk53/t;I)V", "a", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<K, V> extends p13.d<K, V> implements i53.g<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f102962d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f102963e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t<K, V> f102964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f102965c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e23.p<V, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f102966a = new b();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj2;
            aVar.getClass();
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj, aVar.f110395a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements e23.p<V, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f102967a = new c();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            l53.a aVar = (l53.a) obj2;
            aVar.getClass();
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj, aVar.f110395a));
        }
    }

    /* JADX INFO: renamed from: k53.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C1976d implements e23.p<V, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1976d f102968a = new C1976d();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj, obj2));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements e23.p<V, ?, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f102969a = new e();

        @Override // e23.p
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(p005kotlin.jvm.internal.s.g(obj, obj2));
        }
    }

    static {
        t.f102994e.getClass();
        f102963e = new d(t.f102995f, 0);
    }

    public d(t<K, V> tVar, int i14) {
        tVar.getClass();
        this.f102964b = tVar;
        this.f102965c = i14;
    }

    @Override // p13.d
    public final Set<Map.Entry<K, V>> b() {
        return new n(this);
    }

    @Override // p13.d
    public final Set c() {
        return new p(this);
    }

    @Override // p13.d, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f102964b.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // p13.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF181788c() {
        return this.f102965c;
    }

    @Override // p13.d
    public final Collection e() {
        return new r(this);
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
        if (getF181788c() != map.size()) {
            return false;
        }
        boolean z14 = map instanceof l53.c;
        t<K, V> tVar = this.f102964b;
        if (z14) {
            return tVar.g(((l53.c) obj).f110404d.f102964b, b.f102966a);
        }
        if (map instanceof l53.d) {
            return tVar.g(((l53.d) obj).f110412d.f102975c, c.f102967a);
        }
        if (map instanceof d) {
            return tVar.g(((d) obj).f102964b, C1976d.f102968a);
        }
        return map instanceof f ? tVar.g(((f) obj).f102975c, e.f102969a) : super.equals(obj);
    }

    @Override // p13.d, java.util.Map
    public final V get(Object obj) {
        return (V) this.f102964b.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk53/d$a;", "", "<init>", "()V", "Lk53/d;", "", "EMPTY", "Lk53/d;", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
