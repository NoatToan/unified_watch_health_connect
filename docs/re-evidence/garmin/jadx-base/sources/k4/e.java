package k4;

import e23.l;
import e23.p;
import g6.m;
import h4.r;
import h5.b0;
import h5.d2;
import h5.e2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u000fB?\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lk4/e;", "Lh4/r$c;", "Lh5/e2;", "", "Lk4/j;", "Lk4/i;", "Lkotlin/Function2;", "Ln4/c;", "", "onStartTransfer", "Lkotlin/Function1;", "Lk4/c;", "onDropTargetValidate", "<init>", "(Le23/p;Le23/l;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends r.c implements e2, i, b0, j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f102806g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<Object, ? super n4.c, Unit> f102807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<k4.c, i> f102808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.C1970a f102809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f102810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f102811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f102812f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk4/e;", "currentNode", "Lh5/d2;", "invoke", "(Lk4/e;)Lh5/d2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends w implements l<e, d2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k4.c f102814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k4.c cVar) {
            super(1);
            this.f102814a = cVar;
        }

        @Override // e23.l
        public final d2 invoke(e eVar) {
            e eVar2 = eVar;
            if (!eVar2.getNode().getIsAttached()) {
                return d2.SkipSubtreeAndContinueTraversal;
            }
            i iVar = eVar2.f102811e;
            if (iVar != null) {
                iVar.f1(this.f102814a);
            }
            eVar2.f102811e = null;
            eVar2.f102810d = null;
            return d2.ContinueTraversal;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh5/e2;", "T", "child", "Lh5/d2;", "invoke", "(Lh5/e2;)Lh5/d2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends w implements l<e, d2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f102815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f102816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k4.c f102817c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0 r0Var, e eVar, k4.c cVar) {
            super(1);
            this.f102815a = r0Var;
            this.f102816b = eVar;
            this.f102817c = cVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, h5.e2] */
        @Override // e23.l
        public final d2 invoke(e eVar) {
            e eVar2 = eVar;
            e eVar3 = eVar2;
            int i14 = e.f102806g;
            e eVar4 = this.f102816b;
            eVar4.getClass();
            if (!h5.k.h(eVar4).getDragAndDropManager().a(eVar3) || !h.a(eVar3, gl.b.C(this.f102817c))) {
                return d2.ContinueTraversal;
            }
            this.f102815a.f105810a = eVar2;
            return d2.CancelTraversal;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(p<Object, ? super n4.c, Unit> pVar, l<? super k4.c, ? extends i> lVar) {
        this.f102807a = pVar;
        this.f102808b = lVar;
        this.f102809c = a.C1970a.f102813a;
        m.f76012b.getClass();
        this.f102812f = 0L;
    }

    @Override // k4.i
    public final void E1(k4.c cVar) {
        i iVar = this.f102811e;
        if (iVar != null) {
            iVar.E1(cVar);
        }
        e eVar = this.f102810d;
        if (eVar != null) {
            eVar.E1(cVar);
        }
        this.f102810d = null;
    }

    @Override // k4.i
    public final void F1(k4.c cVar) {
        i iVar = this.f102811e;
        if (iVar != null) {
            iVar.F1(cVar);
            return;
        }
        e eVar = this.f102810d;
        if (eVar != null) {
            eVar.F1(cVar);
        }
    }

    @Override // k4.i
    public final boolean G0(k4.c cVar) {
        e eVar = this.f102810d;
        if (eVar != null) {
            return eVar.G0(cVar);
        }
        i iVar = this.f102811e;
        if (iVar != null) {
            return iVar.G0(cVar);
        }
        return false;
    }

    @Override // k4.i
    public final void K(k4.c cVar) {
        e2 e2Var;
        e eVar;
        e eVar2 = this.f102810d;
        if (eVar2 == null || !h.a(eVar2, gl.b.C(cVar))) {
            if (getNode().getIsAttached()) {
                r0 r0Var = new r0();
                gl1.d.k0(this, new c(r0Var, this, cVar));
                e2Var = (e2) r0Var.f105810a;
            } else {
                e2Var = null;
            }
            eVar = (e) e2Var;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            eVar.F1(cVar);
            eVar.K(cVar);
            i iVar = this.f102811e;
            if (iVar != null) {
                iVar.E1(cVar);
            }
        } else if (eVar == null && eVar2 != null) {
            i iVar2 = this.f102811e;
            if (iVar2 != null) {
                iVar2.F1(cVar);
                iVar2.K(cVar);
            }
            eVar2.E1(cVar);
        } else if (!s.g(eVar, eVar2)) {
            if (eVar != null) {
                eVar.F1(cVar);
                eVar.K(cVar);
            }
            if (eVar2 != null) {
                eVar2.E1(cVar);
            }
        } else if (eVar != null) {
            eVar.K(cVar);
        } else {
            i iVar3 = this.f102811e;
            if (iVar3 != null) {
                iVar3.K(cVar);
            }
        }
        this.f102810d = eVar;
    }

    @Override // h5.e2
    public final Object X() {
        return this.f102809c;
    }

    @Override // h5.b0, h5.w0
    public final void e(long j8) {
        this.f102812f = j8;
    }

    @Override // k4.i
    public final void f1(k4.c cVar) {
        b bVar = new b(cVar);
        if (bVar.invoke(this) != d2.ContinueTraversal) {
            return;
        }
        gl1.d.k0(this, bVar);
    }

    @Override // k4.i
    public final void j0(k4.c cVar) {
        i iVar = this.f102811e;
        if (iVar != null) {
            iVar.j0(cVar);
            return;
        }
        e eVar = this.f102810d;
        if (eVar != null) {
            eVar.j0(cVar);
        }
    }

    @Override // h4.r.c
    public final void onDetach() {
        this.f102811e = null;
        this.f102810d = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lk4/e$a;", "", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: k4.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk4/e$a$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1970a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1970a f102813a = new C1970a();

            private C1970a() {
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ e(p pVar, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : pVar, (i14 & 2) != 0 ? null : lVar);
    }
}
