package defpackage;

import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.TargetConfig;

/* JADX INFO: loaded from: classes9.dex */
public class idt extends idv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gzf f37520a;

    public idt(IFitRunVoiceContentConstructor iFitRunVoiceContentConstructor) {
        super(iFitRunVoiceContentConstructor);
    }

    public void c(gzf gzfVar) {
        this.f37520a = gzfVar;
    }

    @Override // defpackage.idv, com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public void initStatusUtil(TargetConfig targetConfig) {
        gzf gzfVar = this.f37520a;
        if (gzfVar == null) {
            LogUtil.j(getTag(), "initStatusUtil failed with mPaceZoneConfig is null.");
            return;
        }
        float fB = gzfVar.b((int) targetConfig.getValueL(), true);
        float fB2 = this.f37520a.b((int) targetConfig.getValueL(), false);
        if (fB > 0.0f && fB2 > 0.0f) {
            fB = ped.c(1000.0f / fB);
            fB2 = ped.c(1000.0f / fB2);
        }
        this.mStatusUtil = new ifr(fB2, fB, ifr.b());
    }

    @Override // defpackage.idv, com.huawei.health.suggestion.ui.voice.helper.BaseIntensityVoiceGuider
    public String getTag() {
        return "Suggestion_IntensityPaceZoneGuider";
    }
}
