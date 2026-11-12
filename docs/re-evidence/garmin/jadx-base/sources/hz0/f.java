package hz0;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedListFragment f86429b;

    public /* synthetic */ f(NewsFeedListFragment newsFeedListFragment, int i14) {
        this.f86428a = i14;
        this.f86429b = newsFeedListFragment;
    }

    @Override // f.b
    public final void a(Object obj) {
        int i14 = this.f86428a;
        NewsFeedListFragment newsFeedListFragment = this.f86429b;
        switch (i14) {
            case 0:
                am.l lVar = (am.l) obj;
                int i15 = NewsFeedListFragment.Y;
                wg0.a aVar = newsFeedListFragment.c7().f39456b;
                Long l14 = aVar != null ? aVar.f185042a : null;
                if (lVar != null && aVar != null && l14 != null) {
                    g22.e.l(newsFeedListFragment);
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
                    hVar.f29448a = l14.longValue();
                    hVar.Z(lVar);
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = new com.garmin.android.apps.connectmobile.activities.newmodel.i0();
                    DateTime dateTime = aVar.f185048g;
                    i0Var.f29488b = dateTime != null ? dateTime.toString() : null;
                    hVar.f29460m = i0Var;
                    newsFeedListFragment.Y6().w(hVar, new j(newsFeedListFragment, aVar, lVar, l14));
                    break;
                }
                break;
            case 1:
                List<? extends Uri> list = (List) obj;
                int i16 = NewsFeedListFragment.Y;
                list.getClass();
                newsFeedListFragment.g7(list);
                break;
            case 2:
                Uri uri = (Uri) obj;
                int i17 = NewsFeedListFragment.Y;
                if (uri != null) {
                    newsFeedListFragment.g7(p13.w.c(uri));
                }
                break;
            default:
                Map map = (Map) obj;
                int i18 = NewsFeedListFragment.Y;
                map.getClass();
                if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                    newsFeedListFragment.d7(newsFeedListFragment.B);
                }
                break;
        }
    }
}
