package qr;

import java.util.List;
import java.util.Map;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ps.r f146389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f146390c;

    public /* synthetic */ o(ps.r rVar, t tVar) {
        this.f146388a = 1;
        this.f146389b = rVar;
        this.f146390c = tVar;
    }

    @Override // e23.a
    public final Object invoke() {
        String displayName;
        String profileImageUrlSmall;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        ps.a1 metadataDTO;
        ps.a1 metadataDTO2;
        List<ps.j> listD;
        int i14 = this.f146388a;
        ps.r rVar = this.f146389b;
        t tVar = this.f146390c;
        switch (i14) {
            case 0:
                int i15 = t.A2;
                ps.a2 userInfoDto = (rVar == null || (metadataDTO = rVar.getMetadataDTO()) == null) ? null : metadataDTO.getUserInfoDto();
                tVar.getClass();
                if (userInfoDto == null || (displayName = userInfoDto.getDisplayName()) == null) {
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", "Missing user display name, could not navigate to user profile");
                } else {
                    Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> value = tVar.v5().getValue();
                    Long userProfilePk = userInfoDto.getUserProfilePk();
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar = value.get(userProfilePk != null ? Integer.valueOf((int) userProfilePk.longValue()) : null);
                    if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlSmall = profileImageUrls.f46877f) == null) {
                        profileImageUrlSmall = userInfoDto.getProfileImageUrlSmall();
                    }
                    tVar.E4(new nr.w0.j1(profileImageUrlSmall, displayName, userInfoDto.getFullName()));
                }
                break;
            case 1:
                int i16 = t.A2;
                int size = (rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null || (listD = metadataDTO2.d()) == null) ? 0 : listD.size();
                int i17 = size < 10 ? 10 - size : 0;
                tVar.getClass();
                tVar.E4(new nr.w0.i0(i17));
                break;
            case 2:
                int i18 = t.A2;
                tVar.E4(new nr.w0.u0(rVar, tVar.k5().getValue()));
                break;
            default:
                int i19 = t.A2;
                tVar.E4(new nr.w0.o0(rVar != null ? rVar.h() : null, null));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(t tVar, ps.r rVar, int i14) {
        this.f146388a = i14;
        this.f146390c = tVar;
        this.f146389b = rVar;
    }
}
