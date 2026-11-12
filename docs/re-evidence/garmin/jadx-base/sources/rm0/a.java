package rm0;

import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import p005kotlin.Unit;
import qm0.a0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f153512b;

    public /* synthetic */ a(d dVar, int i14) {
        this.f153511a = i14;
        this.f153512b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f153511a) {
            case 0:
                int i14 = d.X;
                d dVar = this.f153512b;
                a0 a0Var = new a0(dVar, dVar, dVar, null, 8, null);
                a0Var.f157383d = true;
                return a0Var;
            default:
                int i15 = d.X;
                m mVarRequireActivity = this.f153512b.requireActivity();
                GroupDetailActivity groupDetailActivity = mVarRequireActivity instanceof GroupDetailActivity ? (GroupDetailActivity) mVarRequireActivity : null;
                if (groupDetailActivity != null) {
                    groupDetailActivity.f36144g.a(groupDetailActivity.f36138a.n(groupDetailActivity, groupDetailActivity.fa().f119507c), null);
                }
                return Unit.INSTANCE;
        }
    }
}
