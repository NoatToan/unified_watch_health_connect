package defpackage;

import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider;
import com.huawei.pluginfitnessadvice.TargetConfig;

/* JADX INFO: loaded from: classes9.dex */
public class idr extends BaseIntensityVoiceGuider {
    public idr(IFitRunVoiceContentConstructor iFitRunVoiceContentConstructor) {
        super(iFitRunVoiceContentConstructor);
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public void initStatusUtil(TargetConfig targetConfig) {
        this.mStatusUtil = new ifr((float) targetConfig.getValueL(), (float) targetConfig.getValueH(), ifr.c());
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public String getTag() {
        return "Suggestion_IntensityStepRateGuider";
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastUpperLimit() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getStepRateUpperLimit());
        }
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastLowerLimit() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getStepRateLowerLimit());
        }
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastNormal() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getNormalStepRate());
        }
    }
}
