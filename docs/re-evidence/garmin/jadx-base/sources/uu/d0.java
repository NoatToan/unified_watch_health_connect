package uu;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.e f172665b;

    public /* synthetic */ d0(com.garmin.android.apps.connectmobile.badges.redesign.e eVar, int i14) {
        this.f172664a = i14;
        this.f172665b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        String connectionDisplayName;
        String assocDataId;
        int i14 = this.f172664a;
        com.garmin.android.apps.connectmobile.badges.redesign.e eVar = this.f172665b;
        switch (i14) {
            case 0:
                ru.d dVar = eVar.f30462o;
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar = eVar.f30448a;
                mVar.getClass();
                if (com.garmin.android.apps.connectmobile.badges.service.model.a.a(mVar.getAssocTypeId()) == com.garmin.android.apps.connectmobile.badges.service.model.a.ACTIVITY) {
                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar2 = eVar.f30448a;
                    mVar2.getClass();
                    int badgeEarnedNumber = mVar2.getBadgeEarnedNumber();
                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar3 = eVar.f30448a;
                    if (badgeEarnedNumber == 1) {
                        mVar3.getClass();
                        if (mVar3.getAssocDataId() != null) {
                            com.garmin.android.apps.connectmobile.badges.service.model.m mVar4 = eVar.f30448a;
                            Long lValueOf = (mVar4 == null || (assocDataId = mVar4.getAssocDataId()) == null) ? null : Long.valueOf(Long.parseLong(assocDataId));
                            if (lValueOf != null) {
                                long jLongValue = lValueOf.longValue();
                                Context contextRequireContext = eVar.requireContext();
                                contextRequireContext.getClass();
                                dVar.h(contextRequireContext, jLongValue, am.h.VIEW_ONLY);
                            }
                        }
                        break;
                    } else if (mVar3 != null && (connectionDisplayName = mVar3.getConnectionDisplayName()) != null) {
                        Context contextRequireContext2 = eVar.requireContext();
                        contextRequireContext2.getClass();
                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar5 = eVar.f30448a;
                        mVar5.getClass();
                        int badgeId = mVar5.getBadgeId();
                        com.garmin.android.apps.connectmobile.badges.service.model.m mVar6 = eVar.f30448a;
                        mVar6.getClass();
                        dVar.e(contextRequireContext2, badgeId, mVar6.getBadgeEarnedNumber(), connectionDisplayName);
                        break;
                    }
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.badges.redesign.e.a aVar = com.garmin.android.apps.connectmobile.badges.redesign.e.f30447q;
                Context context = eVar.getContext();
                BadgeDetailsActivity.a aVar2 = BadgeDetailsActivity.f30322l;
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar7 = eVar.f30448a;
                mVar7.getClass();
                int badgeId2 = mVar7.getBadgeId();
                aVar2.getClass();
                Intent intentA = BadgeDetailsActivity.a.a(badgeId2, context);
                context.getClass();
                context.startActivity(intentA);
                break;
        }
    }
}
