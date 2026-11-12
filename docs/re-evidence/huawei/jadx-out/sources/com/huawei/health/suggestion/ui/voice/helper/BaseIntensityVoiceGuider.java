package com.huawei.health.suggestion.ui.voice.helper;

import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.pluginfitnessadvice.TargetConfig;
import defpackage.gcn;
import defpackage.hcu;
import defpackage.ifr;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseIntensityVoiceGuider implements IntensityVoiceGuider {
    protected ifr mStatusUtil;
    protected IFitRunVoiceContentConstructor mVoiceContentConstructor;

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void broadcastNo() {
    }

    protected abstract String getTag();

    protected abstract void initStatusUtil(TargetConfig targetConfig);

    public BaseIntensityVoiceGuider(IFitRunVoiceContentConstructor iFitRunVoiceContentConstructor) {
        this.mVoiceContentConstructor = iFitRunVoiceContentConstructor;
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void guide(TargetConfig targetConfig, float f) {
        if (targetConfig == null) {
            return;
        }
        if (this.mStatusUtil == null) {
            LogUtil.d(getTag(), "guide with init StatusUtil.");
            initStatusUtil(targetConfig);
        }
        ifr ifrVar = this.mStatusUtil;
        if (ifrVar == null) {
            LogUtil.d(getTag(), "guide failed with StatusUtil is null.");
            return;
        }
        ifrVar.e(f);
        int iE = this.mStatusUtil.e();
        if (iE == 1) {
            broadcastLowerLimit();
            return;
        }
        if (iE == 2) {
            broadcastUpperLimit();
        } else if (iE == 3) {
            broadcastNormal();
        } else {
            if (iE != 4) {
                return;
            }
            broadcastNo();
        }
    }

    protected void playSound(Object obj) {
        playSound(obj, null);
    }

    protected void playSound(Object obj, String str) {
        if (UnitUtil.f() || !gcn.c().getVoiceEnable()) {
            return;
        }
        if (obj == null) {
            LogUtil.c(getTag(), "playSound sound == null");
        } else {
            hcu.b().c(obj, str);
        }
    }

    @Override // com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider
    public void reset() {
        this.mStatusUtil = null;
    }
}
