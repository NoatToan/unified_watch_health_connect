package hz0;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedListFragment f86456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f86457c;

    public /* synthetic */ k(NewsFeedListFragment newsFeedListFragment, String str, int i14) {
        this.f86455a = i14;
        this.f86456b = newsFeedListFragment;
        this.f86457c = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f86455a;
        String str = this.f86457c;
        NewsFeedListFragment newsFeedListFragment = this.f86456b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = NewsFeedListFragment.e.a.f39443a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    g22.e.l(newsFeedListFragment);
                } else if (i15 == 2) {
                    g22.e.f(newsFeedListFragment);
                    g22.e.c(newsFeedListFragment);
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(newsFeedListFragment);
                    int i16 = NewsFeedListFragment.Y;
                    NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
                    str.getClass();
                    newsFeedViewModelC7.f39461g.a(new gp.j(str, 28));
                    newsFeedViewModelC7.A4();
                    com.garmin.android.apps.connectmobile.e0.b.a aVar = newsFeedViewModelC7.f34755a;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                int i17 = NewsFeedListFragment.e.a.f39443a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    g22.e.l(newsFeedListFragment);
                } else if (i17 == 2) {
                    g22.e.f(newsFeedListFragment);
                    g22.e.c(newsFeedListFragment);
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(newsFeedListFragment);
                    int i18 = NewsFeedListFragment.Y;
                    NewsFeedViewModel newsFeedViewModelC8 = newsFeedListFragment.c7();
                    str.getClass();
                    newsFeedViewModelC8.f39461g.c(str, false);
                    newsFeedViewModelC8.A4();
                    com.garmin.android.apps.connectmobile.e0.b.a aVar2 = newsFeedViewModelC8.f34755a;
                    if (aVar2 != null) {
                        aVar2.a(true);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                int i19 = NewsFeedListFragment.e.a.f39443a[g3Var.f35300a.ordinal()];
                if (i19 == 1) {
                    g22.e.l(newsFeedListFragment);
                } else if (i19 == 2) {
                    g22.e.f(newsFeedListFragment);
                    g22.e.c(newsFeedListFragment);
                } else {
                    if (i19 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(newsFeedListFragment);
                    int i24 = NewsFeedListFragment.Y;
                    NewsFeedViewModel newsFeedViewModelC9 = newsFeedListFragment.c7();
                    str.getClass();
                    newsFeedViewModelC9.f39461g.c(str, true);
                    newsFeedViewModelC9.A4();
                    com.garmin.android.apps.connectmobile.e0.b.a aVar3 = newsFeedViewModelC9.f34755a;
                    if (aVar3 != null) {
                        aVar3.a(true);
                    }
                }
                return Unit.INSTANCE;
            default:
                int i25 = NewsFeedListFragment.e.a.f39443a[g3Var.f35300a.ordinal()];
                if (i25 == 1) {
                    g22.e.l(newsFeedListFragment);
                } else if (i25 == 2) {
                    g22.e.f(newsFeedListFragment);
                    g22.e.c(newsFeedListFragment);
                } else {
                    if (i25 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(newsFeedListFragment);
                    int i26 = NewsFeedListFragment.Y;
                    NewsFeedViewModel newsFeedViewModelC10 = newsFeedListFragment.c7();
                    str.getClass();
                    newsFeedViewModelC10.f39461g.a(new gp.j(str, 28));
                    newsFeedViewModelC10.A4();
                    com.garmin.android.apps.connectmobile.e0.b.a aVar4 = newsFeedViewModelC10.f34755a;
                    if (aVar4 != null) {
                        aVar4.a(true);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
