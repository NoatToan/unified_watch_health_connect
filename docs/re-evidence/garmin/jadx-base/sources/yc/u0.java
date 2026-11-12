package yc;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005:\u0001\fB#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lyc/u0;", "", "Key", "Value", "Lyc/h3;", "Lyc/t;", "Lt13/g;", "fetchContext", "Lyc/x;", "dataSource", "<init>", "(Lt13/g;Lyc/x;)V", "c", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u0<Key, Value> extends h3<Key, Value> implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.g f196501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x<Key, Value> f196502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196503d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a implements x.d, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0<Key, Value> f196504a;

        public a(u0<Key, Value> u0Var) {
            this.f196504a = u0Var;
        }

        @Override // yc.x.d
        public final void a() {
            this.f196504a.d();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x.d) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return getFunctionDelegate().equals(((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return new p005kotlin.jvm.internal.q(0, this.f196504a, u0.class, "invalidate", "invalidate()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0<Key, Value> f196505a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u0<Key, Value> u0Var) {
            super(0);
            this.f196505a = u0Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            u0<Key, Value> u0Var = this.f196505a;
            x<Key, Value> xVar = u0Var.f196502c;
            v0 v0Var = new v0(u0Var);
            xVar.getClass();
            xVar.f196574b.c(v0Var);
            u0Var.f196502c.b();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196506a;

        static {
            int[] iArr = new int[x.e.values().length];
            try {
                iArr[x.e.POSITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.e.PAGE_KEYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.e.ITEM_KEYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f196506a = iArr;
        }
    }

    static {
        new c(null);
    }

    public u0(t13.g gVar, x<Key, Value> xVar) {
        gVar.getClass();
        xVar.getClass();
        this.f196501b = gVar;
        this.f196502c = xVar;
        this.f196503d = Integer.MIN_VALUE;
        xVar.f196574b.b(new a(this));
        this.f196005a.b(new b(this));
    }

    @Override // yc.t
    public final void a(int i14) {
        int i15 = this.f196503d;
        if (i15 == Integer.MIN_VALUE || i14 == i15) {
            this.f196503d = i14;
        } else {
            v.e0.n(ds.e0.j(new StringBuilder("Page size is already set to "), this.f196503d, '.'));
        }
    }

    @Override // yc.h3
    public final boolean b() {
        return this.f196502c.f196573a == x.e.POSITIONAL;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // yc.h3
    public final Key c(i3<Key, Value> i3Var) {
        Object obj;
        Object objM0;
        h3.b.c cVar;
        h3.b.c<Key, Value> cVarPrevious;
        int i14 = i3Var.f196064d;
        Integer num = i3Var.f196062b;
        List<h3.b.c<Key, Value>> list = i3Var.f196061a;
        x<Key, Value> xVar = this.f196502c;
        int i15 = d.f196506a[xVar.f196573a.ordinal()];
        int i16 = 0;
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    lc.u0.r();
                    return null;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (list.isEmpty()) {
                        objM0 = null;
                        break;
                    }
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            objM0 = null;
                            break;
                        }
                        if (!((h3.b.c) it.next()).f196016a.isEmpty()) {
                            int size = iIntValue - i14;
                            while (i16 < list.size() - 1 && size > p13.x.j(list.get(i16).f196016a)) {
                                size -= list.get(i16).f196016a.size();
                                i16++;
                            }
                            Iterator<T> it3 = list.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    n23.j.s("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                cVar = (h3.b.c) it3.next();
                            } while (cVar.f196016a.isEmpty());
                            ListIterator<h3.b.c<Key, Value>> listIterator = list.listIterator(list.size());
                            do {
                                if (!listIterator.hasPrevious()) {
                                    n23.j.s("List contains no element matching the predicate.");
                                    return null;
                                }
                                cVarPrevious = listIterator.previous();
                            } while (cVarPrevious.f196016a.isEmpty());
                            if (size >= 0) {
                                if (i16 == list.size() - 1 && size > p13.x.j(((h3.b.c) p13.h0.m0(list)).f196016a)) {
                                    objM0 = p13.h0.m0(cVarPrevious.f196016a);
                                    break;
                                }
                                objM0 = list.get(i16).f196016a.get(size);
                                break;
                            }
                            objM0 = p13.h0.b0(cVar.f196016a);
                            break;
                        }
                    }
                    if (objM0 != null) {
                        xVar.a((Value) objM0);
                        throw null;
                    }
                }
            }
        } else if (num != null) {
            int iIntValue2 = num.intValue();
            int size2 = iIntValue2 - i14;
            for (int i17 = 0; i17 < list.size() - 1 && size2 > p13.x.j(list.get(i17).f196016a); i17++) {
                size2 -= list.get(i17).f196016a.size();
            }
            h3.b.c<Key, Value> cVarA = i3Var.a(iIntValue2);
            if (cVarA == null || (obj = cVarA.f196017b) == null) {
                obj = (Key) 0;
            }
            return (Key) wr.g.m(size2, (Integer) obj);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        c1 c1Var;
        int i14;
        boolean z14 = aVar instanceof h3.a.d;
        if (z14) {
            c1Var = c1.REFRESH;
        } else if (aVar instanceof h3.a.C3655a) {
            c1Var = c1.APPEND;
        } else {
            if (!(aVar instanceof h3.a.c)) {
                lc.u0.r();
                return null;
            }
            c1Var = c1.PREPEND;
        }
        c1 c1Var2 = c1Var;
        if (this.f196503d == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z14) {
                int i15 = aVar.f196007a;
                if (i15 % 3 == 0) {
                    i14 = i15 / 3;
                } else {
                    i14 = aVar.f196007a;
                }
            } else {
                i14 = aVar.f196007a;
            }
            this.f196503d = i14;
        }
        return ge1.b.e0(this.f196501b, new w0(this, new x.f(c1Var2, aVar.a(), aVar.f196007a, aVar.f196008b, this.f196503d), aVar, null), cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/u0$c;", "", "<init>", "()V", "", "PAGE_SIZE_NOT_SET", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
