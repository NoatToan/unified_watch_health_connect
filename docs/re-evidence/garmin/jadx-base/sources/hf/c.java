package hf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013BÃ\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u00124\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhf/c;", "", "", "Lof/j;", "interceptors", "Lo13/p;", "Lqf/c;", "Lk23/d;", "mappers", "Lpf/c;", "keyers", "Lkotlin/Function0;", "Lnf/j$a;", "lazyFetcherFactories", "Llf/h$a;", "lazyDecoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<of.j> f83541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o13.p<qf.c<? extends Object, ? extends Object>, k23.d<? extends Object>>> f83542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o13.p<pf.c<? extends Object>, k23.d<? extends Object>>> f83543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<? extends e23.a<? extends List<? extends o13.p<? extends nf.j.a<? extends Object>, ? extends k23.d<? extends Object>>>>> f83544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<? extends e23.a<? extends List<? extends lf.h.a>>> f83545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f83546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f83547g;

    /* JADX WARN: Multi-variable type inference failed */
    private c(List<? extends of.j> list, List<? extends o13.p<? extends qf.c<? extends Object, ? extends Object>, ? extends k23.d<? extends Object>>> list2, List<? extends o13.p<? extends pf.c<? extends Object>, ? extends k23.d<? extends Object>>> list3, List<? extends e23.a<? extends List<? extends o13.p<? extends nf.j.a<? extends Object>, ? extends k23.d<? extends Object>>>>> list4, List<? extends e23.a<? extends List<? extends lf.h.a>>> list5) {
        this.f83541a = list;
        this.f83542b = list2;
        this.f83543c = list3;
        this.f83544d = list4;
        this.f83545e = list5;
        final int i14 = 0;
        this.f83546f = o13.m.b(new e23.a(this) { // from class: hf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f83540b;

            {
                this.f83540b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        c cVar = this.f83540b;
                        List<? extends e23.a<? extends List<? extends o13.p<? extends nf.j.a<? extends Object>, ? extends k23.d<? extends Object>>>>> list6 = cVar.f83544d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            d0.v(arrayList, list6.get(i15).invoke());
                        }
                        cVar.f83544d = j0.f134944a;
                        return arrayList;
                    default:
                        c cVar2 = this.f83540b;
                        List<? extends e23.a<? extends List<? extends lf.h.a>>> list7 = cVar2.f83545e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            d0.v(arrayList2, list7.get(i16).invoke());
                        }
                        cVar2.f83545e = j0.f134944a;
                        return arrayList2;
                }
            }
        });
        final int i15 = 1;
        this.f83547g = o13.m.b(new e23.a(this) { // from class: hf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f83540b;

            {
                this.f83540b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        c cVar = this.f83540b;
                        List<? extends e23.a<? extends List<? extends o13.p<? extends nf.j.a<? extends Object>, ? extends k23.d<? extends Object>>>>> list6 = cVar.f83544d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            d0.v(arrayList, list6.get(i16).invoke());
                        }
                        cVar.f83544d = j0.f134944a;
                        return arrayList;
                    default:
                        c cVar2 = this.f83540b;
                        List<? extends e23.a<? extends List<? extends lf.h.a>>> list7 = cVar2.f83545e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            d0.v(arrayList2, list7.get(i17).invoke());
                        }
                        cVar2.f83545e = j0.f134944a;
                        return arrayList2;
                }
            }
        });
    }

    public /* synthetic */ c(List list, List list2, List list3, List list4, List list5, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        j0 j0Var = j0.f134944a;
        this(j0Var, j0Var, j0Var, j0Var, j0Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhf/c$a;", "", "<init>", "()V", "Lhf/c;", "registry", "(Lhf/c;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f83548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f83549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f83550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f83551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f83552e;

        public a(c cVar) {
            this.f83548a = h0.d1(cVar.f83541a);
            this.f83549b = h0.d1(cVar.f83542b);
            this.f83550c = h0.d1(cVar.f83543c);
            List list = (List) cVar.f83546f.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new dg.r(1, (o13.p) it.next()));
            }
            this.f83551d = arrayList;
            List list2 = (List) cVar.f83547g.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new dg.s((lf.h.a) it3.next(), 1));
            }
            this.f83552e = arrayList2;
        }

        public final void a(nf.j.a aVar, k23.d dVar) {
            this.f83551d.add(new gp.f(17, aVar, dVar));
        }

        public final void b(qf.c cVar, k23.d dVar) {
            this.f83549b.add(new o13.p(cVar, dVar));
        }

        public final c c() {
            return new c(dg.b.a(this.f83548a), dg.b.a(this.f83549b), dg.b.a(this.f83550c), dg.b.a(this.f83551d), dg.b.a(this.f83552e), null);
        }

        public a() {
            this.f83548a = new ArrayList();
            this.f83549b = new ArrayList();
            this.f83550c = new ArrayList();
            this.f83551d = new ArrayList();
            this.f83552e = new ArrayList();
        }
    }
}
