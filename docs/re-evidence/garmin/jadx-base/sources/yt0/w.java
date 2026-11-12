package yt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyt0/w;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.p f199611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.i f199612b;

    public final void a() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVarB;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = this.f199611a;
        if (pVar != null) {
            com.garmin.android.apps.connectmobile.badges.service.model.i iVar = this.f199612b;
            if (iVar != null) {
                gVarB = iVar.b(pVar != null ? pVar.getBadgeKey() : null);
            } else {
                gVarB = null;
            }
            pVar.e1(gVarB);
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar2 = this.f199611a;
        if (pVar2 != null) {
            com.garmin.android.apps.connectmobile.badges.service.model.i iVar2 = this.f199612b;
            pVar2.h1(iVar2 != null ? iVar2.f30586b : null);
        }
    }
}
