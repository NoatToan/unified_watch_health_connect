package i3;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/pb;", "Lf5/e1;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Ls1/k;", "", "animationSpec", "<init>", "(Lo53/b0;Ls1/k;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pb implements f5.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f89303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.k<Integer> f89304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1.b<Integer, s1.n> f89305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f89306d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$1", f = "SegmentedButton.kt", l = {442}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f89307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1.b<Integer, s1.n> f89308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f89309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ pb f89310d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s1.b<Integer, s1.n> bVar, int i14, pb pbVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f89308b = bVar;
            this.f89309c = i14;
            this.f89310d = pbVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f89308b, this.f89309c, this.f89310d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f89307a;
            if (i14 == 0) {
                o13.r.b(obj);
                Integer num = new Integer(this.f89309c);
                s1.k<Integer> kVar = this.f89310d.f89304b;
                this.f89307a = 1;
                if (s1.b.c(this.f89308b, num, kVar, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public pb(o53.b0 b0Var, s1.k<Integer> kVar) {
        this.f89303a = b0Var;
        this.f89304b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f5.e1
    public final f5.a1 f(f5.b1 b1Var, List<? extends List<? extends f5.y0>> list, long j8) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i14 = 1;
        List list3 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList2.add(((f5.y0) list2.get(i15)).Q(j8));
        }
        if (!arrayList2.isEmpty()) {
            obj = arrayList2.get(0);
            int i16 = ((f5.v1) obj).f69144a;
            int size2 = arrayList2.size() - 1;
            if (1 <= size2) {
                int i17 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i17);
                    int i18 = ((f5.v1) obj4).f69144a;
                    if (i16 < i18) {
                        obj = obj4;
                        i16 = i18;
                    }
                    if (i17 == size2) {
                        break;
                    }
                    i17++;
                }
            }
        } else {
            obj = null;
        }
        f5.v1 v1Var = (f5.v1) obj;
        int i19 = v1Var != null ? v1Var.f69144a : 0;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i24 = 0; i24 < size3; i24++) {
            arrayList3.add(((f5.y0) list3.get(i24)).Q(j8));
        }
        if (!arrayList3.isEmpty()) {
            obj2 = arrayList3.get(0);
            int i25 = ((f5.v1) obj2).f69144a;
            int size4 = arrayList3.size() - 1;
            if (1 <= size4) {
                int i26 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i26);
                    int i27 = ((f5.v1) obj5).f69144a;
                    if (i25 < i27) {
                        obj2 = obj5;
                        i25 = i27;
                    }
                    if (i26 == size4) {
                        break;
                    }
                    i26++;
                }
            }
        } else {
            obj2 = null;
        }
        f5.v1 v1Var2 = (f5.v1) obj2;
        Integer numValueOf = v1Var2 != null ? Integer.valueOf(v1Var2.f69144a) : null;
        if (!arrayList3.isEmpty()) {
            obj3 = arrayList3.get(0);
            int i28 = ((f5.v1) obj3).f69145b;
            int size5 = arrayList3.size() - 1;
            if (1 <= size5) {
                while (true) {
                    Object obj6 = arrayList3.get(i14);
                    int i29 = ((f5.v1) obj6).f69145b;
                    if (i28 < i29) {
                        obj3 = obj6;
                        i28 = i29;
                    }
                    if (i14 == size5) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            obj3 = null;
        }
        f5.v1 v1Var3 = (f5.v1) obj3;
        int i30 = v1Var3 != null ? v1Var3.f69145b : 0;
        qb.f89432a.getClass();
        float f14 = qb.f89434c;
        int iMax = Math.max(b1Var.f0(f14), i19);
        float f15 = vb.f90008a;
        int iF0 = b1Var.f0(f15) + iMax + (numValueOf != null ? numValueOf.intValue() : 0);
        int i34 = i19 == 0 ? (-(b1Var.f0(f15) + b1Var.f0(f14))) / 2 : 0;
        Integer num = this.f89306d;
        if (num == null) {
            this.f89306d = Integer.valueOf(i34);
        } else {
            s1.b<Integer, s1.n> bVar = this.f89305c;
            if (bVar == null) {
                p005kotlin.jvm.internal.r rVar = p005kotlin.jvm.internal.r.f105809a;
                s1.b<Integer, s1.n> bVar2 = new s1.b<>(num, s1.e2.f155569b, null, null, 12, null);
                this.f89305c = bVar2;
                bVar = bVar2;
            }
            if (((Number) bVar.f155491e.getF182175a()).intValue() != i34) {
                ge1.b.T(this.f89303a, null, null, new a(bVar, i34, this, null), 3);
            }
        }
        int i35 = i30;
        return f5.b1.h0(b1Var, iF0, i35, new c2.r(arrayList2, b1Var, this, i34, arrayList3, i35));
    }
}
