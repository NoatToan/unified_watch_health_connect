package pq;

import am.j;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpq/c;", "Header", "Row", "Landroidx/recyclerview/widget/x;", "Lrq/a;", "Lpq/e;", "", "Lpq/h;", "userActionStrategy", "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c<Header, Row> extends x<rq.a, e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f139543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f139544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<? extends rq.a> f139545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends h> list) {
        super(a.f139541a);
        list.getClass();
        this.f139543b = list;
        this.f139545d = j0.f134944a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        rq.a aVarR = r(i14);
        if (aVarR instanceof rq.a.C2917a) {
            return -1;
        }
        if (aVarR instanceof rq.a.b) {
            return -2;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onAttachedToRecyclerView(recyclerView);
        this.f139544c = recyclerView;
        new d(this, this.f139543b).e(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        e eVar = (e) f0Var;
        eVar.getClass();
        rq.a aVarR = r(i14);
        if (aVarR instanceof rq.a.C2917a) {
            ((e.a) eVar).f(((rq.a.C2917a) aVarR).f154106a);
        } else if (aVarR instanceof rq.a.b) {
            ((e.b) eVar).f(((rq.a.b) aVarR).f154107a);
        } else {
            u0.r();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        int i15;
        viewGroup.getClass();
        if (i14 == -2) {
            i15 = R.layout.item_activity_exercise;
        } else {
            if (i14 != -1) {
                throw new ClassCastException(j.h(i14, "Unknown viewType "));
            }
            i15 = R.layout.item_activity_round;
        }
        View viewD = a0.d(viewGroup, i15, viewGroup, false);
        if (i14 == -2) {
            viewD.getClass();
            return x(viewD);
        }
        if (i14 != -1) {
            throw new ClassCastException(j.h(i14, "Unknown viewType "));
        }
        viewD.getClass();
        return u(viewD);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.f139544c = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.x
    public final void t(List<rq.a> list) {
        List<? extends rq.a> list2 = this.f139545d;
        super.t(oc.b.e((ArrayList) list, !(list2 == null || list2.isEmpty())));
    }

    public abstract nq.f u(View view2);

    public abstract nq.d x(View view2);
}
