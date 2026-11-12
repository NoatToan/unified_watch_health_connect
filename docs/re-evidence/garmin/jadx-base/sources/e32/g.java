package e32;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import com.garmin.android.apps.connectmobile.m0;
import p005kotlin.Metadata;
import r22.z0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Le32/g;", "", "Lcom/garmin/android/apps/connectmobile/m0;", "swipeFragment", "Landroid/view/View;", "rootView", "Landroidx/recyclerview/widget/RecyclerView$o;", "itemDecorator", "<init>", "(Lcom/garmin/android/apps/connectmobile/m0;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$o;)V", "b", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f62781b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f62782a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e32/g$a", "Landroidx/recyclerview/widget/RecyclerView$u;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f62783a;

        public a(m0 m0Var) {
            this.f62783a = m0Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, i14, i15);
            this.f62783a.F6((recyclerView.getChildCount() == 0 ? 0 : recyclerView.getChildAt(0).getTop()) >= 0);
        }
    }

    public g(m0 m0Var, View view2, RecyclerView.o oVar) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.simple_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f62782a = recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        if (m0Var != null) {
            recyclerView.addOnScrollListener(new a(m0Var));
        }
        if (oVar != null) {
            recyclerView.addItemDecoration(oVar);
        }
    }

    public final void a(f1 f1Var) {
        f1Var.getClass();
        RecyclerView recyclerView = this.f62782a;
        recyclerView.setAdapter(f1Var);
        g22.p.a(recyclerView, f1Var);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le32/g$b;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public g(m0 m0Var, View view2, RecyclerView.o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        m0Var = (i14 & 1) != 0 ? null : m0Var;
        if ((i14 & 4) != 0) {
            Context context = view2.getContext();
            context.getClass();
            f62781b.getClass();
            Integer numValueOf = Integer.valueOf(R.dimen.spacing_normal);
            Integer numValueOf2 = Integer.valueOf(R.dimen.spacing_small);
            oVar = new z0(context, numValueOf, numValueOf2, numValueOf, numValueOf2);
        }
        this(m0Var, view2, oVar);
    }
}
