package hz0;

import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhz0/j;", "Ld80/b;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewsFeedListFragment f86448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg0.a f86449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.l f86450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f86451d;

    public j(NewsFeedListFragment newsFeedListFragment, wg0.a aVar, am.l lVar, Long l14) {
        this.f86448a = newsFeedListFragment;
        this.f86449b = aVar;
        this.f86450c = lVar;
        this.f86451d = l14;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        NewsFeedListFragment newsFeedListFragment = this.f86448a;
        g22.e.f(newsFeedListFragment);
        g22.e.c(newsFeedListFragment);
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        wg0.a aVarB = wg0.a.b(this.f86449b, this.f86450c, null, null, null, null, 536870655);
        int i14 = NewsFeedListFragment.Y;
        NewsFeedListFragment newsFeedListFragment = this.f86448a;
        newsFeedListFragment.f7(aVarB);
        newsFeedListFragment.c7().f39456b = null;
        qd2.a aVarB2 = qd2.a.b();
        if (aVarB2 != null) {
            aVarB2.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, this.f86451d.longValue());
        }
        g22.e.f(newsFeedListFragment);
    }
}
