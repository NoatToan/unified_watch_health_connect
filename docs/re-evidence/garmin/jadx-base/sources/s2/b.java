package s2;

import e23.p;
import e23.s;
import f5.c0;
import o2.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import q53.l;
import u1.k1;
import u1.l1;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB-\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ls2/b;", "Ls2/f;", "Lkotlin/Function3;", "Lo2/h;", "Ls2/e;", "Lkotlin/Function0;", "Lf5/c0;", "", "contextMenuBlock", "<init>", "(Le23/s;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s<h, e, e23.a<? extends c0>, m, Integer, Unit> f155993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f155994b = new l1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f155995c = p0.n(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls2/b$a;", "Lo2/h;", "Ls2/e;", "dataProvider", "<init>", "(Ls2/b;Ls2/e;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f155996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q53.b f155997b = l.a(0, 7, null);

        public a(b bVar, e eVar) {
            this.f155996a = eVar;
        }

        @Override // o2.h
        public final void close() {
            this.f155997b.i(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(s<? super h, ? super e, ? super e23.a<? extends c0>, ? super m, ? super Integer, Unit> sVar) {
        this.f155993a = sVar;
    }

    @Override // s2.f
    public final Object a(e eVar, i iVar) {
        Object objB = this.f155994b.b(k1.Default, new c(this, new a(this, eVar), null), iVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final e23.a<? extends c0> aVar, m mVar, final int i14) {
        final e23.a<? extends c0> aVar2;
        o0 o0VarE = mVar.E(723898654);
        int i15 = (o0VarE.B(this) ? 32 : 16) | i14;
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            a aVar3 = (a) this.f155995c.getF182175a();
            if (aVar3 == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(this, aVar, i14, i16) { // from class: s2.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f155990a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f155991b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ e23.a f155992c;

                        {
                            this.f155990a = i16;
                            this.f155991b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = this.f155990a;
                            m mVar2 = (m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    this.f155991b.b(this.f155992c, mVar2, p0.t(7));
                                    break;
                                default:
                                    this.f155991b.b(this.f155992c, mVar2, p0.t(7));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            this.f155993a.invoke(aVar3, aVar3.f155996a, aVar2, o0VarE, 384);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new p(this, aVar2, i14, i17) { // from class: s2.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f155990a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f155991b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e23.a f155992c;

                {
                    this.f155990a = i17;
                    this.f155991b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f155990a;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            this.f155991b.b(this.f155992c, mVar2, p0.t(7));
                            break;
                        default:
                            this.f155991b.b(this.f155992c, mVar2, p0.t(7));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
