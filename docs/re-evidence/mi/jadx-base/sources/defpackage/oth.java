package defpackage;

import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;

/* JADX INFO: loaded from: classes10.dex */
public class oth extends ha2 implements yyc {
    public oth(jdn jdnVar, tm5 tm5Var) {
        super(jdnVar, tm5Var);
    }

    @Override // defpackage.yyc
    public void onLocationChanged(SportLocationResult sportLocationResult) {
        this.f19851a.onReceivePhoneLocationData(sportLocationResult);
    }
}
