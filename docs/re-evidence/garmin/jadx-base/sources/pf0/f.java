package pf0;

import androidx.lifecycle.v1;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivitiesListFragment;
import java.util.ArrayList;
import mt0.b2;
import p005kotlin.Unit;
import yc.m2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EcgActivitiesListFragment f137479b;

    public /* synthetic */ f(EcgActivitiesListFragment ecgActivitiesListFragment, int i14) {
        this.f137478a = i14;
        this.f137479b = ecgActivitiesListFragment;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f137478a) {
            case 0:
                rf0.a aVar = (rf0.a) obj;
                aVar.getClass();
                EcgActivitiesListFragment ecgActivitiesListFragment = this.f137479b;
                y yVarU6 = ecgActivitiesListFragment.u6();
                ArrayList arrayList = yVarU6.f137545c;
                arrayList.clear();
                s51.a<gf0.a> aVarC = new ff0.b(aVar, v1.a(yVarU6), yVarU6.f137546d, arrayList).c(20);
                yVarU6.f137547e = aVarC;
                aVarC.f157370a.f(ecgActivitiesListFragment.getViewLifecycleOwner(), new EcgActivitiesListFragment.b(new f(ecgActivitiesListFragment, 1)));
                aVarC.f157371b.f(ecgActivitiesListFragment.getViewLifecycleOwner(), new EcgActivitiesListFragment.b(new f(ecgActivitiesListFragment, 2)));
                aVarC.f157372c.f(ecgActivitiesListFragment.getViewLifecycleOwner(), new EcgActivitiesListFragment.b(new f(ecgActivitiesListFragment, 3)));
                aVarC.f157376g.f(ecgActivitiesListFragment.getViewLifecycleOwner(), new EcgActivitiesListFragment.b(new o50.a(27, ecgActivitiesListFragment, aVar)));
                SwipeRefreshLayout swipeRefreshLayout = ecgActivitiesListFragment.f34838d;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setOnRefreshListener(new b2(ecgActivitiesListFragment, 28));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("swipeRefreshView");
                throw null;
            case 1:
                m2 m2Var = (m2) obj;
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.c cVar = this.f137479b.f34836b;
                if (cVar != null) {
                    cVar.t(m2Var);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("listAdapter");
                throw null;
            case 2:
                s51.e eVar = (s51.e) obj;
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.c cVar2 = this.f137479b.f34836b;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("listAdapter");
                    throw null;
                }
                s51.e eVar2 = cVar2.f34900c;
                boolean z14 = false;
                boolean z15 = (eVar2 == null || eVar2 == s51.e.LOADED) ? false : true;
                cVar2.f34900c = eVar;
                if (eVar != null && eVar != s51.e.LOADED) {
                    z14 = true;
                }
                if (z15 != z14) {
                    yc.e<T> eVar3 = cVar2.f196366a;
                    if (z15) {
                        cVar2.notifyItemRemoved(eVar3.a());
                    } else {
                        cVar2.notifyItemInserted(eVar3.a());
                    }
                }
                return Unit.INSTANCE;
            default:
                s51.e eVar4 = (s51.e) obj;
                SwipeRefreshLayout swipeRefreshLayout2 = this.f137479b.f34838d;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(eVar4 == s51.e.LOADING);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("swipeRefreshView");
                throw null;
        }
    }
}
