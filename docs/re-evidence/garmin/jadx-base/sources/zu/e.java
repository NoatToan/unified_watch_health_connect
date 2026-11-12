package zu;

import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.badges.service.model.v;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2.b f207029b;

    public /* synthetic */ e(v2.b bVar, int i14) {
        this.f207028a = i14;
        this.f207029b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        List<com.garmin.android.apps.connectmobile.badges.service.model.m> listD;
        List<com.garmin.android.apps.connectmobile.badges.service.model.m> listD2;
        wu.a aVar = (wu.a) obj;
        switch (this.f207028a) {
            case 0:
                aVar.getClass();
                T t7 = this.f207029b.f47386a;
                v userProfile = ((com.garmin.android.apps.connectmobile.badges.service.model.l) t7).getUserProfile();
                if (userProfile != null && (listD2 = userProfile.d()) != null && !listD2.isEmpty()) {
                    Iterator<com.garmin.android.apps.connectmobile.badges.service.model.m> it = listD2.iterator();
                    while (it.hasNext()) {
                        aVar.a(it.next(), false);
                    }
                }
                v connectionProfile = ((com.garmin.android.apps.connectmobile.badges.service.model.l) t7).getConnectionProfile();
                if (connectionProfile != null && (listD = connectionProfile.d()) != null && !listD.isEmpty()) {
                    Iterator<com.garmin.android.apps.connectmobile.badges.service.model.m> it3 = listD.iterator();
                    while (it3.hasNext()) {
                        aVar.a(it3.next(), false);
                    }
                }
                break;
            case 1:
                aVar.getClass();
                aVar.a((com.garmin.android.apps.connectmobile.badges.service.model.m) this.f207029b.f47386a, true);
                break;
            default:
                aVar.getClass();
                List<SimpleBadgeDTO> list = (List) this.f207029b.f47386a;
                if (list != null && !list.isEmpty()) {
                    for (SimpleBadgeDTO simpleBadgeDTO : list) {
                        com.garmin.android.apps.connectmobile.badges.service.model.i iVar = aVar.f187234a;
                        if (simpleBadgeDTO != null && iVar != null) {
                            simpleBadgeDTO.g(iVar.b(simpleBadgeDTO.getBadgeKey()));
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
