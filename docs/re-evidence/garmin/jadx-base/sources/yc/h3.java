package yc;

import ch.qos.logback.core.joran.action.Action;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lyc/h3;", "", "Key", "Value", "<init>", "()V", "a", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class h3<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0<e23.a<Unit>> f196005a = new q0<>(c.f196021a, null, 2, 0 == true ? 1 : 0);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lyc/h3$b;", "", "Key", "Value", "<init>", "()V", "a", "b", "c", "Lyc/h3$b$a;", "Lyc/h3$b$b;", "Lyc/h3$b$c;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b<Key, Value> {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyc/h3$b$a;", "", "Key", "Value", "Lyc/h3$b;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class a<Key, Value> extends b<Key, Value> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f196013a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th3) {
                super(null);
                th3.getClass();
                this.f196013a = th3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f196013a, ((a) obj).f196013a);
            }

            public final int hashCode() {
                return this.f196013a.hashCode();
            }

            public final String toString() {
                return d53.n.d("LoadResult.Error(\n                    |   throwable: " + this.f196013a + "\n                    |) ");
            }
        }

        /* JADX INFO: renamed from: yc.h3$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/h3$b$b;", "", "Key", "Value", "Lyc/h3$b;", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C3657b<Key, Value> extends b<Key, Value> {
            public C3657b() {
                super(null);
            }

            public final String toString() {
                return "LoadResult.Invalid";
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00042\b\u0012\u0004\u0012\u00028\u00050\u0005:\u0001\u0010B=\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB+\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0004¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lyc/h3$b$c;", "", "Key", "Value", "Lyc/h3$b;", "", "", "data", "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class c<Key, Value> extends b<Key, Value> implements Iterable<Value>, f23.a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f196014f = new a(null);

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final c f196015g = new c(p13.j0.f134944a, null, null, 0, 0);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<Value> f196016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Key f196017b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Key f196018c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f196019d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f196020e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends Value> list, Key key, Key key2, int i14, int i15) {
                super(null);
                list.getClass();
                this.f196016a = list;
                this.f196017b = key;
                this.f196018c = key2;
                this.f196019d = i14;
                this.f196020e = i15;
                if (i14 != Integer.MIN_VALUE && i14 < 0) {
                    vb.h.s("itemsBefore cannot be negative");
                    throw null;
                }
                if (i15 == Integer.MIN_VALUE || i15 >= 0) {
                    return;
                }
                vb.h.s("itemsAfter cannot be negative");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p005kotlin.jvm.internal.s.g(this.f196016a, cVar.f196016a) && p005kotlin.jvm.internal.s.g(this.f196017b, cVar.f196017b) && p005kotlin.jvm.internal.s.g(this.f196018c, cVar.f196018c) && this.f196019d == cVar.f196019d && this.f196020e == cVar.f196020e;
            }

            public final int hashCode() {
                int iHashCode = this.f196016a.hashCode() * 31;
                Key key = this.f196017b;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f196018c;
                return Integer.hashCode(this.f196020e) + r1.q2.d(this.f196019d, (iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator<Value> iterator() {
                return this.f196016a.listIterator();
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List<Value> list = this.f196016a;
                sb3.append(list.size());
                sb3.append("\n                    |   first Item: ");
                sb3.append(p13.h0.d0(list));
                sb3.append("\n                    |   last Item: ");
                sb3.append(p13.h0.n0(list));
                sb3.append("\n                    |   nextKey: ");
                sb3.append(this.f196018c);
                sb3.append("\n                    |   prevKey: ");
                sb3.append(this.f196017b);
                sb3.append("\n                    |   itemsBefore: ");
                sb3.append(this.f196019d);
                sb3.append("\n                    |   itemsAfter: ");
                sb3.append(this.f196020e);
                sb3.append("\n                    |) ");
                return d53.n.d(sb3.toString());
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/h3$b$c$a;", "", "<init>", "()V", "", "COUNT_UNDEFINED", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                    this();
                }

                private a() {
                }
            }

            public /* synthetic */ c(List list, Object obj, Object obj2, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
                this(list, obj, obj2, (i16 & 8) != 0 ? Integer.MIN_VALUE : i14, (i16 & 16) != 0 ? Integer.MIN_VALUE : i15);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public c(List<? extends Value> list, Key key, Key key2) {
                this(list, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                list.getClass();
            }
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlin/Function0;", "", "it", "invoke", "(Le23/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<e23.a<? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f196021a = new c();

        public c() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(e23.a<? extends Unit> aVar) {
            e23.a<? extends Unit> aVar2 = aVar;
            aVar2.getClass();
            aVar2.invoke();
            return Unit.INSTANCE;
        }
    }

    public boolean b() {
        return this instanceof ad.a;
    }

    public abstract Key c(i3<Key, Value> i3Var);

    public final void d() {
        if (this.f196005a.a()) {
            g3.f195987a.getClass();
            if (g3.a(3)) {
                toString();
            }
        }
    }

    public abstract Object e(a aVar, v13.c cVar);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\t\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lyc/h3$a;", "", "Key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(IZ)V", "a", "b", "c", "d", "Lyc/h3$a$a;", "Lyc/h3$a$c;", "Lyc/h3$a$d;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a<Key> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f196006c = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f196007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f196008b;

        /* JADX INFO: renamed from: yc.h3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/h3$a$a;", "", "Key", "Lyc/h3$a;", Action.KEY_ATTRIBUTE, "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C3655a<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Key f196009d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3655a(Key key, int i14, boolean z14) {
                super(i14, z14, null);
                key.getClass();
                this.f196009d = key;
            }

            @Override // yc.h3.a
            public final Key a() {
                return this.f196009d;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/h3$a$c;", "", "Key", "Lyc/h3$a;", Action.KEY_ATTRIBUTE, "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Key f196011d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Key key, int i14, boolean z14) {
                super(i14, z14, null);
                key.getClass();
                this.f196011d = key;
            }

            @Override // yc.h3.a
            public final Key a() {
                return this.f196011d;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/h3$a$d;", "", "Key", "Lyc/h3$a;", Action.KEY_ATTRIBUTE, "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class d<Key> extends a<Key> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Key f196012d;

            public d(Key key, int i14, boolean z14) {
                super(i14, z14, null);
                this.f196012d = key;
            }

            @Override // yc.h3.a
            public final Key a() {
                return this.f196012d;
            }
        }

        private a(int i14, boolean z14) {
            this.f196007a = i14;
            this.f196008b = z14;
        }

        public abstract Key a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/h3$a$b;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b {

            /* JADX INFO: renamed from: yc.h3$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C3656a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f196010a;

                static {
                    int[] iArr = new int[c1.values().length];
                    try {
                        iArr[c1.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[c1.PREPEND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[c1.APPEND.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f196010a = iArr;
                }
            }

            public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ a(int i14, boolean z14, p005kotlin.jvm.internal.j jVar) {
            this(i14, z14);
        }
    }
}
