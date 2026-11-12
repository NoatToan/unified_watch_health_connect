package om0;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import com.garmin.android.apps.connectmobile.l2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f132911b;

    public /* synthetic */ f(zc.d dVar, int i14) {
        this.f132910a = i14;
        this.f132911b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Intent intent;
        int i14 = this.f132910a;
        zc.d dVar = this.f132911b;
        switch (i14) {
            case 0:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                GroupManageMembersActivity.a aVar = GroupManageMembersActivity.f36194d;
                com.garmin.android.apps.connectmobile.group.details.about.member.a aVar2 = (com.garmin.android.apps.connectmobile.group.details.about.member.a) dVar.a(iIntValue);
                if (aVar2 instanceof com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a) {
                    return Integer.valueOf(Integer.hashCode(((com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a) aVar2).f36220a));
                }
                if (!(aVar2 instanceof com.garmin.android.apps.connectmobile.group.details.about.member.a.b)) {
                    return num;
                }
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = ((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar2).f36221a;
                String displayName = bVar.getDisplayName();
                return displayName == null ? Integer.valueOf(bVar.hashCode()) : displayName;
            default:
                f.a aVar3 = (f.a) obj;
                aVar3.getClass();
                if (aVar3.f67585a == -1 && (intent = aVar3.f67586b) != null) {
                    l2.f37135b.getClass();
                    Bundle bundleA = l2.a.a(intent);
                    if (bundleA != null ? bundleA.getBoolean("GCM_extra_activity_updated") : false) {
                        dVar.e();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
