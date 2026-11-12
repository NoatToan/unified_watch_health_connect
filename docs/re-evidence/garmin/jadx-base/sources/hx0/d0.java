package hx0;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0010BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lhx0/d0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lhx0/d0$a;", "", "mIsMultiSelect", "", "iconWidth", "Ljava/util/ArrayList;", "Lhx0/b0;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.ITEMS, "exclusiveSelection", "Lhx0/n0;", "onSymptomsSelectedListener", "<init>", "(ZDLjava/util/ArrayList;Lhx0/b0;Lhx0/n0;)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class d0 extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f86035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f86036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f86037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f86038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<b0> f86039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<ex0.a> f86040f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhx0/d0$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lhx0/d0;Landroid/view/View;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f86041c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ex0.a f86042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f86043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f86043b = d0Var;
            ex0.a aVar = (ex0.a) view2;
            this.f86042a = aVar;
            aVar.setOnClickListener(new k(2, d0Var, this));
        }
    }

    public d0(boolean z14, double d14, ArrayList<b0> arrayList, b0 b0Var, n0 n0Var) {
        this.f86035a = z14;
        this.f86036b = d14;
        this.f86037c = b0Var;
        this.f86038d = n0Var;
        this.f86039e = arrayList == null ? new ArrayList<>() : arrayList;
        this.f86040f = new SparseArray<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(d0 d0Var, int i14) {
        ex0.a aVar;
        Iterator it = p13.h0.j1(d0Var.f86039e).iterator();
        while (true) {
            p13.o0 o0Var = (p13.o0) it;
            if (!o0Var.f134956a.hasNext()) {
                return;
            }
            p13.m0 m0Var = (p13.m0) o0Var.next();
            int i15 = m0Var.f134951a;
            if (i15 != i14 && ((b0) m0Var.f134952b).f86024b && (aVar = d0Var.f86040f.get(i15)) != null) {
                aVar.b(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f86039e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        b0 b0Var = this.f86039e.get(i14);
        b0Var.getClass();
        b0 b0Var2 = b0Var;
        ex0.a aVar2 = aVar.f86042a;
        aVar2.a(b0Var2);
        d0 d0Var = aVar.f86043b;
        d0Var.f86040f.append(aVar.getBindingAdapterPosition(), aVar2);
        androidx.core.view.s0.r(aVar.itemView, new c0(d0Var, b0Var2));
        this.f86040f.append(i14, aVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        return new a(this, new ex0.a(context, null, 0, Double.valueOf(this.f86036b), 6, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(RecyclerView.f0 f0Var) {
        a aVar = (a) f0Var;
        aVar.getClass();
        this.f86040f.remove(aVar.getBindingAdapterPosition());
        super.onViewRecycled(aVar);
    }

    public final HashSet<Integer> t() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f86039e) {
            if (((b0) obj).f86024b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((b0) it.next()).f86023a));
        }
        return p13.h0.Z0(arrayList2);
    }

    public /* synthetic */ d0(boolean z14, double d14, ArrayList arrayList, b0 b0Var, n0 n0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, d14, arrayList, (i14 & 8) != 0 ? null : b0Var, (i14 & 16) != 0 ? null : n0Var);
    }
}
