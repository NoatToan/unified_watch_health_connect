package defpackage;

import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.pluginfitnessadvice.TargetConfig;

/* JADX INFO: loaded from: classes9.dex */
public class idm extends BaseIntensityVoiceGuider {
    protected HeartZoneConf e;

    public idm(IFitRunVoiceContentConstructor iFitRunVoiceContentConstructor) {
        super(iFitRunVoiceContentConstructor);
    }

    public void a(HeartZoneConf heartZoneConf) {
        this.e = heartZoneConf;
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider, com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void guide(TargetConfig targetConfig, float f) {
        if (ifk.e((int) f)) {
            super.guide(targetConfig, f);
        }
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public void initStatusUtil(TargetConfig targetConfig) {
        this.mStatusUtil = new ifr((int) targetConfig.getValueL(), (int) targetConfig.getValueH(), ifr.a());
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public String getTag() {
        return "Suggestion_AbsoluteHeartRateGuider";
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastUpperLimit() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getAbsoluteUpperLimit());
        }
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastLowerLimit() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getAbsoluteLowerLimit());
        }
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastNormal() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getNormalHeartRate());
        }
    }
}
