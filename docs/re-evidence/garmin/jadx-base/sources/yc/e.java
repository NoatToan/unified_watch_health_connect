package yc;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u000e\u000fB#\b\u0017\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"Lyc/e;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Landroidx/recyclerview/widget/o$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$h;Landroidx/recyclerview/widget/o$f;)V", "Landroidx/recyclerview/widget/y;", "listUpdateCallback", "Landroidx/recyclerview/widget/c;", "config", "(Landroidx/recyclerview/widget/y;Landroidx/recyclerview/widget/c;)V", "a", "b", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.y f195859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.c<T> f195860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<b<T>> f195861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m2<T> f195862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m2<T> f195863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f195864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f195865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f195866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f195867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3648e f195868j;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B1\u0012(\u0010\u0007\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyc/e$a;", "", "T", "Lyc/e$b;", "Lkotlin/Function2;", "Lyc/m2;", "", "callback", "<init>", "(Le23/p;)V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.p<m2<T>, m2<T>, Unit> f195869a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super m2<T>, ? super m2<T>, Unit> pVar) {
            pVar.getClass();
            this.f195869a = pVar;
        }

        @Override // yc.e.b
        public final void a(m2<T> m2Var, m2<T> m2Var2) {
            this.f195869a.invoke(m2Var, m2Var2);
        }
    }

    @o13.e
    public interface b<T> {
        void a(m2<T> m2Var, m2<T> m2Var2);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.p<c1, z0, Unit> {
        public c(Object obj) {
            super(2, obj, m2.e.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(c1 c1Var, z0 z0Var) {
            c1 c1Var2 = c1Var;
            z0 z0Var2 = z0Var;
            c1Var2.getClass();
            z0Var2.getClass();
            ((m2.e) this.receiver).b(c1Var2, z0Var2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yc/e$d", "Lyc/m2$e;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends m2.e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e<T> f195870d;

        public d(e<T> eVar) {
            this.f195870d = eVar;
        }

        @Override // yc.m2.e
        public final void a(c1 c1Var, z0 z0Var) {
            c1Var.getClass();
            z0Var.getClass();
            Iterator it = this.f195870d.f195867i.iterator();
            while (it.hasNext()) {
                ((e23.p) it.next()).invoke(c1Var, z0Var);
            }
        }
    }

    /* JADX INFO: renamed from: yc.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yc/e$e", "Lyc/m2$b;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C3648e extends m2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f195871a;

        public C3648e(e<T> eVar) {
            this.f195871a = eVar;
        }

        @Override // yc.m2.b
        public final void a(int i14, int i15) {
            this.f195871a.b().b(i14, i15, null);
        }

        @Override // yc.m2.b
        public final void b(int i14, int i15) {
            this.f195871a.b().c(i14, i15);
        }

        @Override // yc.m2.b
        public final void c(int i14, int i15) {
            this.f195871a.b().a(i14, i15);
        }
    }

    @o13.e
    public e(RecyclerView.h<?> hVar, androidx.recyclerview.widget.o.f<T> fVar) {
        hVar.getClass();
        fVar.getClass();
        this.f195861c = new CopyOnWriteArrayList<>();
        d dVar = new d(this);
        this.f195865g = dVar;
        this.f195866h = new c(dVar);
        this.f195867i = new CopyOnWriteArrayList();
        this.f195868j = new C3648e(this);
        this.f195859a = new androidx.recyclerview.widget.b(hVar);
        this.f195860b = new androidx.recyclerview.widget.c.a(fVar).a();
    }

    public final int a() {
        m2<T> m2Var = this.f195863e;
        if (m2Var == null) {
            m2Var = this.f195862d;
        }
        if (m2Var != null) {
            return m2Var.f196223d.getSize();
        }
        return 0;
    }

    public final androidx.recyclerview.widget.y b() {
        androidx.recyclerview.widget.y yVar = this.f195859a;
        if (yVar != null) {
            return yVar;
        }
        p005kotlin.jvm.internal.s.m("updateCallback");
        throw null;
    }

    public final void c(m2 m2Var, m2 m2Var2) {
        Iterator<b<T>> it = this.f195861c.iterator();
        while (it.hasNext()) {
            it.next().a(m2Var, m2Var2);
        }
    }

    @o13.e
    public e(androidx.recyclerview.widget.y yVar, androidx.recyclerview.widget.c<T> cVar) {
        yVar.getClass();
        cVar.getClass();
        this.f195861c = new CopyOnWriteArrayList<>();
        d dVar = new d(this);
        this.f195865g = dVar;
        this.f195866h = new c(dVar);
        this.f195867i = new CopyOnWriteArrayList();
        this.f195868j = new C3648e(this);
        this.f195859a = yVar;
        this.f195860b = cVar;
    }
}
