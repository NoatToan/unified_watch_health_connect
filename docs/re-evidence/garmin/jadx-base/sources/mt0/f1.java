package mt0;

import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.q f120593b;

    public /* synthetic */ f1(com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar, int i14) {
        this.f120592a = i14;
        this.f120593b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x011c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        pt0.p.b bVar;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
        String string;
        String str;
        switch (this.f120592a) {
            case 0:
                com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) ((com.garmin.android.apps.connectmobile.y) obj).a();
                Object obj2 = null;
                if ((g3Var != null ? g3Var.f35300a : null) == fw.p.SUCCESS && (bVar = (pt0.p.b) g3Var.f35301b) != null) {
                    String str2 = bVar.f140765a;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar = this.f120593b;
                    qVar.w6().y4(str2, true);
                    for (Object obj3 : qVar.w6().f140743b) {
                        if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.leaderboard.model.p) obj3).getUuid(), str2)) {
                            obj2 = obj3;
                            pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) obj2;
                            if (pVar != null) {
                                string = pVar.k();
                            } else {
                                string = qVar.getString(R.string.challenge_title);
                                string.getClass();
                            }
                            String string2 = qVar.getString(R.string.social_challenge_joined_msg, string);
                            string2.getClass();
                            w5.r.w(qVar, bVar.f140767c, bVar.f140768d, new kk1.a(qVar, 20, string2, bVar));
                        }
                    }
                    pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) obj2;
                    if (pVar != null) {
                        string = pVar.k();
                    } else {
                        string = qVar.getString(R.string.challenge_title);
                        string.getClass();
                    }
                    String string3 = qVar.getString(R.string.social_challenge_joined_msg, string);
                    string3.getClass();
                    w5.r.w(qVar, bVar.f140767c, bVar.f140768d, new kk1.a(qVar, 20, string3, bVar));
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) obj;
                if (g3Var2.f35300a == fw.p.SUCCESS && (str = (String) g3Var2.f35301b) != null) {
                    this.f120593b.w6().y4(str, false);
                }
                return Unit.INSTANCE;
            case 2:
                yc.m2 m2Var = (yc.m2) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var = this.f120593b.f37768f;
                if (l0Var != null) {
                    l0Var.t(m2Var);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("challengesAdapter");
                throw null;
            case 3:
                s51.e eVar = (s51.e) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var2 = this.f120593b.f37768f;
                if (l0Var2 != null) {
                    l0Var2.u(eVar);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("challengesAdapter");
                throw null;
            case 4:
                s51.e eVar2 = (s51.e) obj;
                SwipeRefreshLayout swipeRefreshLayout = this.f120593b.f37769g;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(eVar2 == s51.e.LOADING);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("swipeRefreshView");
                throw null;
            default:
                Boolean bool = (Boolean) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar2 = this.f120593b;
                TextView textView = qVar2.f37770h;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("emptyText");
                    throw null;
                }
                bool.getClass();
                textView.setVisibility(bool.booleanValue() ? 0 : 8);
                RecyclerView recyclerView = qVar2.f37767e;
                if (recyclerView == null) {
                    p005kotlin.jvm.internal.s.m("recyclerView");
                    throw null;
                }
                recyclerView.setVisibility(!bool.booleanValue() ? 0 : 8);
                ComposeView composeView = qVar2.f37766d;
                if (composeView == null) {
                    p005kotlin.jvm.internal.s.m("composeView");
                    throw null;
                }
                List<ot0.g> listD = qVar2.w6().f140744c.f120665a.d();
                composeView.setVisibility((listD != null ? listD.size() : 0) > 1 && !bool.booleanValue() ? 0 : 8);
                return Unit.INSTANCE;
        }
    }
}
