package pq;

import android.app.PendingIntent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p13.h0;
import p13.j0;
import p13.w;
import p40.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpq/d;", "Header", "Row", "Landroidx/recyclerview/widget/s;", "Lpq/c;", "adapter", "", "Lpq/h;", "userActionStrategy", "<init>", "(Lpq/c;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d<Header, Row> extends s {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"pq/d$a", "Landroidx/recyclerview/widget/s$g;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends s.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f139546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f139547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ c<Header, Row> f139548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List<h> f139549i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c<Header, Row> cVar, List<? extends h> list) {
            super(3, 0);
            this.f139548h = cVar;
            this.f139549i = list;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.s.d
        public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) throws PendingIntent.CanceledException {
            recyclerView.getClass();
            f0Var.getClass();
            super.b(recyclerView, f0Var);
            Integer num = this.f139547g;
            if (num != null) {
                int iIntValue = num.intValue();
                c<Header, Row> cVar = this.f139548h;
                cVar.getClass();
                androidx.recyclerview.widget.d<T> dVar = cVar.f10698a;
                List<T> list = dVar.f10426f;
                list.getClass();
                if (oc.b.z(iIntValue, list)) {
                    List<T> list2 = dVar.f10426f;
                    list2.getClass();
                    p pVarF = oc.b.F(iIntValue - 1, list2);
                    p0 p0Var = new p0();
                    p0Var.f105807a = ((Number) pVarF.f128594a).intValue();
                    List<T> list3 = dVar.f10426f;
                    list3.getClass();
                    if (iIntValue >= 0 && iIntValue < list3.size() && (oc.b.z(iIntValue + 1, list3) || iIntValue >= list3.size() - 1)) {
                        p0Var.f105807a = iIntValue;
                    }
                    if (p0Var.f105807a < 0) {
                        p0Var.f105807a = 0;
                    }
                    rq.a aVar = (rq.a) dVar.f10426f.get(iIntValue);
                    List<T> list4 = dVar.f10426f;
                    list4.getClass();
                    ArrayList arrayList = new ArrayList(list4);
                    arrayList.remove(aVar);
                    arrayList.addAll(p0Var.f105807a, h0.C0(w.c(aVar), cVar.f139545d));
                    cVar.f139545d = j0.f134944a;
                    l0.e eVar = new l0.e(22, recyclerView, p0Var);
                    List<? extends rq.a> list5 = cVar.f139545d;
                    cVar.f10698a.b(oc.b.e(arrayList, !(list5 == null || list5.isEmpty())), eVar);
                }
                ((e) f0Var).d();
                final o0 o0Var = new o0(13, recyclerView, cVar);
                RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    RecyclerView.m.a aVar2 = new RecyclerView.m.a() { // from class: pq.b
                        @Override // androidx.recyclerview.widget.RecyclerView.m.a
                        public final void a() {
                            o0Var.invoke();
                        }
                    };
                    if (itemAnimator.k()) {
                        itemAnimator.f10315b.add(aVar2);
                    } else {
                        aVar2.a();
                    }
                } else {
                    o0Var.invoke();
                }
            }
            this.f139546f = null;
            this.f139547g = null;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.s.d
        public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            recyclerView.getClass();
            f0Var.getClass();
            int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            int bindingAdapterPosition2 = f0Var2.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
                return false;
            }
            c<Header, Row> cVar = this.f139548h;
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            List<T> list = cVar.f10698a.f10426f;
            list.getClass();
            arrayList.addAll(list);
            Collections.swap(arrayList, bindingAdapterPosition, bindingAdapterPosition2);
            cVar.t(arrayList);
            if (this.f139546f == null) {
                this.f139546f = Integer.valueOf(bindingAdapterPosition);
            }
            this.f139547g = Integer.valueOf(bindingAdapterPosition2);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.s.d
        public final void n(int i14, RecyclerView.f0 f0Var) {
            super.n(i14, f0Var);
            if (i14 != 2 || f0Var == null) {
                return;
            }
            this.f139547g = f0Var.getBindingAdapterPosition() == -1 ? null : Integer.valueOf(f0Var.getBindingAdapterPosition());
            Integer numValueOf = f0Var.getBindingAdapterPosition() != -1 ? Integer.valueOf(f0Var.getBindingAdapterPosition()) : null;
            this.f139546f = numValueOf;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                c<Header, Row> cVar = this.f139548h;
                cVar.getClass();
                androidx.recyclerview.widget.d<T> dVar = cVar.f10698a;
                List<T> list = dVar.f10426f;
                list.getClass();
                if (oc.b.z(iIntValue, list)) {
                    List<T> list2 = dVar.f10426f;
                    list2.getClass();
                    p pVarF = oc.b.F(iIntValue, list2);
                    int iIntValue2 = ((Number) pVarF.f128594a).intValue() + 1;
                    int iIntValue3 = ((Number) pVarF.f128595b).intValue() + 1;
                    cVar.f139545d = dVar.f10426f.subList(iIntValue2, iIntValue3);
                    List listSubList = dVar.f10426f.subList(0, iIntValue2);
                    List<T> list3 = dVar.f10426f;
                    list3.getClass();
                    cVar.t(h0.C0(listSubList, list3.subList(iIntValue3, list3.size())));
                }
                ((e) f0Var).e();
                RecyclerView recyclerView = cVar.f139544c;
                if (recyclerView != null) {
                    recyclerView.invalidateItemDecorations();
                }
            }
        }

        @Override // androidx.recyclerview.widget.s.d
        public final void o(int i14, RecyclerView.f0 f0Var) {
            f0Var.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.s.g
        public final int p(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            recyclerView.getClass();
            f0Var.getClass();
            int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            c<Header, Row> cVar = this.f139548h;
            int itemViewType = cVar.getItemViewType(bindingAdapterPosition);
            int i14 = this.f10684e;
            List<h> list = this.f139549i;
            if (itemViewType == -1 && list.contains(f.f139550a)) {
                return i14;
            }
            if (cVar.getItemViewType(bindingAdapterPosition) != -2 || !list.contains(g.f139551a)) {
                return 0;
            }
            List<T> list2 = cVar.f10698a.f10426f;
            list2.getClass();
            p pVarF = oc.b.F(bindingAdapterPosition, list2);
            if (((Number) pVarF.f128594a).intValue() == ((Number) pVarF.f128595b).intValue() - 1) {
                return 0;
            }
            return i14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c<Header, Row> cVar, List<? extends h> list) {
        super(new a(cVar, list));
        cVar.getClass();
        list.getClass();
    }
}
