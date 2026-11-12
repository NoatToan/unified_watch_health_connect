package m53;

import i53.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import lr2.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lm53/b;", "E", "Lp13/i;", "Li53/h;", "", "firstElement", "lastElement", "Lk53/d;", "Lm53/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lk53/d;)V", "a", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<E> extends i<E> implements h<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f116784e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f116785f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f116786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f116787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k53.d<E, m53.a> f116788d;

    static {
        n53.b bVar = n53.b.f123788a;
        k53.d.f102962d.getClass();
        k53.d dVar = k53.d.f102963e;
        dVar.getClass();
        f116785f = new b(bVar, bVar, dVar);
    }

    public b(Object obj, Object obj2, k53.d<E, m53.a> dVar) {
        dVar.getClass();
        this.f116786b = obj;
        this.f116787c = obj2;
        this.f116788d = dVar;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF134922d() {
        return this.f116788d.getF102965c();
    }

    public final h<E> b(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return this;
        }
        c cVar = new c(this);
        cVar.addAll(collection);
        return cVar.build();
    }

    public final c c() {
        return new c(this);
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f116788d.containsKey(obj);
    }

    @Override // p13.i, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (getF134922d() != set.size()) {
            return false;
        }
        boolean z14 = set instanceof b;
        k53.d<E, m53.a> dVar = this.f116788d;
        if (z14) {
            return dVar.f102964b.g(((b) obj).f116788d.f102964b, new o(15));
        }
        return set instanceof c ? dVar.f102964b.g(((c) obj).f116793d.f102975c, new o(16)) : super.equals(obj);
    }

    @Override // p13.i, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new d(this.f116786b, this.f116788d);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm53/b$a;", "", "<init>", "()V", "Lm53/b;", "", "EMPTY", "Lm53/b;", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
