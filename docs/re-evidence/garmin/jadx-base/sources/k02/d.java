package k02;

import e23.p;
import f2.m;
import f2.p0;
import g6.k;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import s1.e2;
import s1.j1;
import s1.l;
import s1.o;
import s1.u2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk02/d;", "", "Lf2/p0;", "lazyGridState", "Lo53/b0;", "coroutineScope", "Lkotlin/Function2;", "", "", "onItemMoved", "<init>", "(Lf2/p0;Lo53/b0;Le23/p;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f102106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f102107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<Integer, Integer, Unit> f102108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f102109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f102110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f102111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q53.b f102112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2 f102113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s1.b<n4.c, o> f102114i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.grid.GridDragAndDropState$onDragInterrupted$1", f = "GridDragAndDropState.kt", l = {80, 81}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102115a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (s1.b.c(r5, r6, r7, null, r11, 12) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f102115a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                s1.b<n4.c, o> bVar = dVar.f102114i;
                n4.c cVarA = n4.c.a(dVar.b());
                this.f102115a = 1;
                if (bVar.g(cVarA, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            dVar.f102113h.setValue(null);
            return Unit.INSTANCE;
            s1.b<n4.c, o> bVar2 = dVar.f102114i;
            n4.c.f123541b.getClass();
            n4.c cVarA2 = n4.c.a(0L);
            j1 j1VarC = l.c(1, 0.0f, 400.0f, n4.c.a(u2.b()));
            this.f102115a = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(p0 p0Var, b0 b0Var, p<? super Integer, ? super Integer, Unit> pVar) {
        p0Var.getClass();
        b0Var.getClass();
        pVar.getClass();
        this.f102106a = p0Var;
        this.f102107b = b0Var;
        this.f102108c = pVar;
        this.f102109d = p3.p0.n(null);
        n4.c.f123541b.getClass();
        this.f102110e = p3.p0.n(n4.c.a(0L));
        this.f102111f = p3.p0.n(n4.c.a(0L));
        this.f102112g = q53.l.a(0, 7, null);
        this.f102113h = p3.p0.n(null);
        this.f102114i = new s1.b<>(n4.c.a(0L), e2.f155573f, null, null, 12, null);
    }

    public static long c(m mVar) {
        long f68169v = mVar.getF68169v();
        long f68168u = mVar.getF68168u();
        k.a aVar = k.f76003b;
        return (((long) (((int) (f68169v >> 32)) + ((int) (f68168u >> 32)))) << 32) | (((long) (((int) (f68169v & 4294967295L)) + ((int) (f68168u & 4294967295L)))) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m a() {
        Object next;
        Iterator<T> it = this.f102106a.i().e().iterator();
        while (it.hasNext()) {
            next = it.next();
            int f62559a = ((m) next).getF62559a();
            Integer num = (Integer) this.f102109d.getF182175a();
            if (num != null && f62559a == num.intValue()) {
                return (m) next;
            }
        }
        next = null;
        return (m) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        m mVarA = a();
        if (mVarA == null) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        long j8 = n4.c.j(((n4.c) this.f102111f.getF182175a()).f123544a, ((n4.c) this.f102110e.getF182175a()).f123544a);
        long f68169v = mVarA.getF68169v();
        k.a aVar = k.f76003b;
        return n4.c.i(j8, (((long) Float.floatToRawIntBits((int) (f68169v >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (f68169v & 4294967295L))) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        c2 c2Var = this.f102109d;
        if (((Integer) c2Var.getF182175a()) != null) {
            this.f102113h.setValue((Integer) c2Var.getF182175a());
            ge1.b.T(this.f102107b, null, null, new a(null), 3);
        }
        n4.c.f123541b.getClass();
        this.f102110e.setValue(n4.c.a(0L));
        c2Var.setValue(null);
        this.f102111f.setValue(n4.c.a(0L));
    }
}
