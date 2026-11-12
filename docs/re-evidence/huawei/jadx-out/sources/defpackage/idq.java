package defpackage;

import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.TargetConfig;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes9.dex */
public class idq extends idm {
    public idq(IFitRunVoiceContentConstructor iFitRunVoiceContentConstructor) {
        super(iFitRunVoiceContentConstructor);
    }

    @Override // defpackage.idm, com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public void initStatusUtil(TargetConfig targetConfig) {
        if (this.e == null) {
            LogUtil.j("Suggestion_RelativeHeartRateGuider", "initStatusUtil failed with null mHeartZoneConf.");
            return;
        }
        int valueL = (int) targetConfig.getValueL();
        int valueH = (int) targetConfig.getValueH();
        int iJ = CommonUtil.j(targetConfig.getId());
        this.mStatusUtil = new ifr(ifk.c(this.e, iJ, valueL, true), ifk.c(this.e, iJ, valueH, false), ifr.a());
    }

    @Override // defpackage.idm, com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public String getTag() {
        return "Suggestion_RelativeHeartRateGuider";
    }
}
