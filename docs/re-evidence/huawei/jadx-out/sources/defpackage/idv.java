package defpackage;

import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider;
import com.huawei.pluginfitnessadvice.TargetConfig;

/* JADX INFO: loaded from: classes9.dex */
public class idv extends BaseIntensityVoiceGuider {
    public idv(IFitRunVoiceContentConstructor iFitRunVoiceContentConstructor) {
        super(iFitRunVoiceContentConstructor);
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public void initStatusUtil(TargetConfig targetConfig) {
        float valueL = ((float) targetConfig.getValueL()) / 1000.0f;
        float valueH = ((float) targetConfig.getValueH()) / 1000.0f;
        if (valueL > 0.0f && valueH > 0.0f) {
            valueL = ped.c(1000.0f / valueL);
            valueH = ped.c(1000.0f / valueH);
        }
        this.mStatusUtil = new ifr(valueH, valueL, ifr.b());
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public String getTag() {
        return "Suggestion_IntensityPaceGuider";
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastUpperLimit() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getPaceZoneUpperLimit());
        }
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastLowerLimit() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getPaceZoneLowerLimit());
        }
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastNormal() {
        if (this.mVoiceContentConstructor != null) {
            playSound(this.mVoiceContentConstructor.getNormalPace());
        }
    }
}
