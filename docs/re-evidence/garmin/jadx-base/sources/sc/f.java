package sc;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import f4.g0;
import f4.i0;
import f4.s;
import f4.z;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p005kotlin.Metadata;
import p13.u;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0011*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00060\u0005j\u0002`\u0006:\u0001\u0012B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bB\u001d\b\u0016\u0012\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000¢\u0006\u0004\b\t\u0010\u000eR\u000b\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0005¨\u0006\u0013"}, d2 = {"Lsc/f;", "Lsc/j;", "T", "", "Lf4/g0;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lf4/s;", TtmlNode.RUBY_BASE, "<init>", "(Lf4/s;)V", "()V", "", "elements", "([Lsc/j;)V", "", "size", "Companion", "a", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i63.h(with = tc.a.class)
public final class f<T extends j> implements List<T>, g0, RandomAccess, f23.c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s<T> f158448a;

    public f(T... tArr) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        s sVar = new s();
        sVar.addAll(u.i0(objArrCopyOf));
        this(sVar);
    }

    public final void a(j jVar) {
        this.f158448a.add(jVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f158448a.add((T) ((j) obj));
    }

    @Override // java.util.List
    public final boolean addAll(int i14, Collection<? extends T> collection) {
        return this.f158448a.addAll(i14, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f158448a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return this.f158448a.contains((j) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f158448a.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i14) {
        return this.f158448a.get(i14);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        return this.f158448a.indexOf((j) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f158448a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.f158448a.listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        return this.f158448a.lastIndexOf((j) obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i14) {
        s<T> sVar = this.f158448a;
        sVar.getClass();
        return new z(sVar, i14);
    }

    @Override // f4.g0
    public final i0 m() {
        return this.f158448a.f68804a;
    }

    @Override // f4.g0
    public final i0 o(i0 i0Var, i0 i0Var2, i0 i0Var3) {
        this.f158448a.getClass();
        return null;
    }

    @Override // f4.g0
    public final void q(i0 i0Var) {
        this.f158448a.q(i0Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return this.f158448a.remove((j) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f158448a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f158448a.retainAll(collection);
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
    @Override // java.util.List
    public final Object set(int i14, Object obj) {
        return (j) this.f158448a.set(i14, (j) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f158448a.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i14, int i15) {
        return this.f158448a.subList(i14, i15);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }

    /* JADX INFO: renamed from: sc.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsc/f$a;", "", "<init>", "()V", "T", "Li63/c;", "typeSerial0", "Lsc/f;", "serializer", "(Li63/c;)Li63/c;", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final <T> i63.c<f<T>> serializer(i63.c<T> typeSerial0) {
            return new tc.a(typeSerial0);
        }

        private Companion() {
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return this.f158448a.addAll(collection);
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
    @Override // java.util.List
    public final void add(int i14, Object obj) {
        this.f158448a.add(i14, (j) obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return this.f158448a.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i14) {
        return this.f158448a.remove(i14);
    }

    public f(s<T> sVar) {
        this.f158448a = sVar;
    }

    public f() {
        this(new s());
    }
}
