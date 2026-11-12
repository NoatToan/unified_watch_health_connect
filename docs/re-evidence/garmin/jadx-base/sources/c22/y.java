package c22;

/* JADX INFO: loaded from: classes10.dex */
public final class y {
    public static final boolean a(q92.v vVar) {
        if (vVar != null) {
            f12.l.f68084a.getClass();
            f12.l lVarA = f12.l.a.a();
            lVarA.getClass();
            boolean zContains = lVarA.N().contains("ROLE_PARTIALLY_SUSPENDED");
            boolean z14 = vVar.f143784b == q92.y.OPT_OUT;
            q92.a aVar = vVar.f143787e;
            boolean z15 = aVar == q92.a.NOT_CONFIRMED;
            boolean z16 = aVar == q92.a.PASSWORD_CHECK_FAILED;
            boolean z17 = vVar.f143785c == q92.u.DEFAULT && aVar == q92.a.LOCATION_CHANGED;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.CONSENT;
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("shouldConfirmDataDelete -> accountPartiallySuspended[", "] optOutUser[", "] deleteNotConfirmed[", zContains, z14);
            kg.f.q("] passwordCheckFailed[", "] locationChangedToEU[", sbM, z15, z16);
            String strK = hb.a.k(sbM, z17, "]");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strK);
            if (!zContains && z14 && (z15 || z16 || z17)) {
                return true;
            }
        }
        return false;
    }
}
