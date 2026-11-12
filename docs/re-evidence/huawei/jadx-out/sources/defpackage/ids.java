package defpackage;

import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.pluginfitnessadvice.TargetConfig;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class ids extends idm {
    private UserInfomation d;

    public ids(IFitRunVoiceContentConstructor iFitRunVoiceContentConstructor) {
        super(iFitRunVoiceContentConstructor);
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.d("Suggestion_IntensityMaf180Guider", "init : userProfileMgrApi is null.");
        } else {
            this.d = userProfileMgrApi.getUserInfo();
        }
    }

    @Override // defpackage.idm, com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public void initStatusUtil(TargetConfig targetConfig) {
        int valueH = (int) targetConfig.getValueH();
        int valueL = (int) targetConfig.getValueL();
        this.mStatusUtil = new ifr((valueH - valueL) - this.d.getAgeOrDefaultValue(), (valueH + valueL) - this.d.getAgeOrDefaultValue(), ifr.a());
    }

    @Override // defpackage.idm, com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public String getTag() {
        return "Suggestion_IntensityMaf180Guider";
    }
}
