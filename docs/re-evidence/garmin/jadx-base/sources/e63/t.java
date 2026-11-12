package e63;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\tB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le63/t;", "T", "Le63/s;", "", "onZero", "Le63/o;", "format", "<init>", "(Ljava/lang/String;Le63/o;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<T> f63269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f63270c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<T, Boolean> {
        public b(Object obj) {
            super(1, obj, v.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((v) this.receiver).test(obj));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Object, Boolean> {
        public c(Object obj) {
            super(1, obj, a0.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            ((a0) this.receiver).getClass();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(String str, o<? super T> oVar) {
        str.getClass();
        oVar.getClass();
        this.f63268a = str;
        this.f63269b = oVar;
        q13.b bVarB = p13.w.b();
        lg.d.l(bVarB, oVar);
        q13.b bVarA = p13.w.a(bVarB);
        ArrayList arrayList = new ArrayList(p13.y.r(bVarA, 10));
        ListIterator listIterator = bVarA.listIterator(0);
        while (true) {
            q13.b.c cVar = (q13.b.c) listIterator;
            if (!cVar.hasNext()) {
                break;
            } else {
                arrayList.add(((l) cVar.next()).c());
            }
        }
        List<n> listB1 = h0.b1(h0.f1(arrayList));
        ArrayList arrayList2 = new ArrayList(p13.y.r(listB1, 10));
        for (n nVar : listB1) {
            a.f63271c.getClass();
            nVar.getClass();
            Object defaultValue = nVar.getDefaultValue();
            if (defaultValue == null) {
                androidx.core.view.j.s("The field '", nVar.getF63256b(), "' does not define a default value");
                throw null;
            }
            arrayList2.add(new a(nVar.a(), defaultValue, null));
        }
        this.f63270c = arrayList2;
    }

    @Override // e63.o
    public final f63.e<T> a() {
        f63.e<T> eVarA = this.f63269b.a();
        ArrayList<a> arrayList = this.f63270c;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (a aVar : arrayList) {
            arrayList2.add(new g(aVar.f63273b, new u(aVar.f63272a)));
        }
        Object iVar = arrayList2.isEmpty() ? a0.f63228a : arrayList2.size() == 1 ? (v) h0.I0(arrayList2) : new i(arrayList2);
        boolean z14 = iVar instanceof a0;
        String str = this.f63268a;
        return z14 ? new f63.c(str) : new f63.b(p13.x.k(new o13.p(new b(iVar), new f63.c(str)), new o13.p(new c(a0.f63228a), eVarA)));
    }

    @Override // e63.o
    public final g63.o<T> b() {
        j0 j0Var = j0.f134944a;
        return new g63.o<>(j0Var, p13.x.k(this.f63269b.b(), zf.b.j(p13.x.k(new j(this.f63268a).b(), new g63.o(this.f63270c.isEmpty() ? j0Var : p13.w.c(new g63.w(new ds0.g(this, 6))), j0Var)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f63268a.equals(tVar.f63268a) && this.f63269b.equals(tVar.f63269b);
    }

    public final int hashCode() {
        return this.f63269b.hashCode() + (this.f63268a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.f63268a + ", " + this.f63269b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0000*\u0004\b\u0002\u0010\u00022\u00020\u0003:\u0001\tB%\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le63/t$a;", "T", "E", "", "Le63/b;", "accessor", "defaultValue", "<init>", "(Le63/b;Ljava/lang/Object;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T, E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1334a f63271c = new C1334a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e63.b<T, E> f63272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f63273b;

        /* JADX WARN: Multi-variable type inference failed */
        private a(e63.b<? super T, E> bVar, E e4) {
            this.f63272a = bVar;
            this.f63273b = e4;
        }

        /* JADX INFO: renamed from: e63.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le63/t$a$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1334a {
            public /* synthetic */ C1334a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C1334a() {
            }
        }

        public /* synthetic */ a(e63.b bVar, Object obj, p005kotlin.jvm.internal.j jVar) {
            this(bVar, obj);
        }
    }
}
