package g80;

import com.garmin.android.apps.connectmobile.developer.ManageCampaignsDeveloperActivity;
import e23.l;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005kotlin.Unit;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageCampaignsDeveloperActivity f76253b;

    public /* synthetic */ g(ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity, int i14) {
        this.f76252a = i14;
        this.f76253b = manageCampaignsDeveloperActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f76252a;
        ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76253b;
        switch (i14) {
            case 0:
                ff2.a aVar = (ff2.a) obj;
                int i15 = ManageCampaignsDeveloperActivity.f33618e;
                manageCampaignsDeveloperActivity.f33620b = aVar != null ? w.c(aVar) : j0.f134944a;
                manageCampaignsDeveloperActivity.runOnUiThread(new eh2.b(manageCampaignsDeveloperActivity, 13));
                break;
            default:
                List<ff2.a> list = (List) obj;
                int i16 = ManageCampaignsDeveloperActivity.f33618e;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Objects.toString((ff2.a) it.next());
                    }
                }
                manageCampaignsDeveloperActivity.f33620b = list;
                manageCampaignsDeveloperActivity.runOnUiThread(new eh2.b(manageCampaignsDeveloperActivity, 13));
                break;
        }
        return Unit.INSTANCE;
    }
}
