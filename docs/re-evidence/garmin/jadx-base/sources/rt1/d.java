package rt1;

import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.training.CompletedTrainingPlansActivity;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CompletedTrainingPlansActivity f154518b;

    public /* synthetic */ d(CompletedTrainingPlansActivity completedTrainingPlansActivity, int i14) {
        this.f154517a = i14;
        this.f154518b = completedTrainingPlansActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f154517a;
        CompletedTrainingPlansActivity completedTrainingPlansActivity = this.f154518b;
        switch (i14) {
            case 0:
                ww1.r rVar = (ww1.r) obj;
                CompletedTrainingPlansActivity.a aVar = CompletedTrainingPlansActivity.f45088h;
                rVar.getClass();
                completedTrainingPlansActivity.fa(rVar);
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                CompletedTrainingPlansActivity.a aVar2 = CompletedTrainingPlansActivity.f45088h;
                if (g3Var != null) {
                    int i15 = CompletedTrainingPlansActivity.b.f45096a[g3Var.f35300a.ordinal()];
                    if (i15 == 1) {
                        completedTrainingPlansActivity.f45095g = true;
                        RecyclerView recyclerView = completedTrainingPlansActivity.f45090b;
                        if (recyclerView == null) {
                            s.m("recyclerView");
                            throw null;
                        }
                        recyclerView.setVisibility(8);
                        wt1.b bVar = completedTrainingPlansActivity.f45091c;
                        if (bVar == null) {
                            s.m("errorViewHolder");
                            throw null;
                        }
                        bVar.e();
                        completedTrainingPlansActivity.showProgressOverlay();
                    } else if (i15 == 2) {
                        completedTrainingPlansActivity.f45095g = false;
                        completedTrainingPlansActivity.hideProgressOverlay();
                        List<? extends ww1.r> list = (List) g3Var.f35301b;
                        if (list == null || list.isEmpty()) {
                            completedTrainingPlansActivity.ea(false);
                        } else if (!completedTrainingPlansActivity.f45093e || completedTrainingPlansActivity.f45094f) {
                            completedTrainingPlansActivity.ca(list);
                        } else {
                            completedTrainingPlansActivity.f45094f = true;
                            completedTrainingPlansActivity.fa((ww1.r) h0.b0(list));
                            RecyclerView recyclerView2 = completedTrainingPlansActivity.f45090b;
                            if (recyclerView2 == null) {
                                s.m("recyclerView");
                                throw null;
                            }
                            recyclerView2.postDelayed(new r0.h(6, completedTrainingPlansActivity, list), 500L);
                        }
                    } else {
                        if (i15 != 3) {
                            u0.r();
                            return null;
                        }
                        completedTrainingPlansActivity.f45095g = false;
                        completedTrainingPlansActivity.hideProgressOverlay();
                        wt1.b bVar2 = completedTrainingPlansActivity.f45091c;
                        if (bVar2 == null) {
                            s.m("errorViewHolder");
                            throw null;
                        }
                        bVar2.g();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
