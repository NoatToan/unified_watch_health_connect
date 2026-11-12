package com.huawei.health.sportservice.manager;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.manager.voice.BaseSoundEffectManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hau;
import defpackage.jau;
import defpackage.jax;
import defpackage.jcm;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.VOICE_MANAGER)
public abstract class BaseSportExamVoiceManager implements ManagerComponent {
    public static final String SOUND_SUCCESS_ACTION = "SOUND_SUCCESS_ACTION";
    private static final String TAG = "SportService_BaseSportExamVoiceManager";
    private int mPreStartSportLastCode;
    protected BaseSoundEffectManager mSoundEffectManager;
    private hau mSportCallbackOption = new hau();

    public abstract String getLogTag();

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void init() {
        jau.c().j(getLogTag());
        this.mSoundEffectManager = new BaseSoundEffectManager(BaseApplication.getContext());
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("STATUS_CODE_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.BaseSportExamVoiceManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1177x7446e933(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-BaseSportExamVoiceManager, reason: not valid java name */
    /* synthetic */ void m1177x7446e933(List list, Map map) {
        if (njy.e(list) || map == null) {
            LogUtil.j(getLogTag(), "SportDataNotify failed");
            return;
        }
        if (list.contains("STATUS_CODE_DATA")) {
            Object obj = map.get("STATUS_CODE_DATA");
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.mPreStartSportLastCode != iIntValue) {
                    preSportVoice(iIntValue);
                }
                this.mPreStartSportLastCode = iIntValue;
            }
        }
    }

    private void preSportVoice(int i) {
        if (i == -11) {
            speakNativeVoice("keep_one_person");
        } else {
            if (i != -10) {
                return;
            }
            speakNativeVoice("keep_light");
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        jau.c().h(getLogTag());
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    public void speakNativeVoice(String str) {
        LogUtil.a(getLogTag(), "speakNativeVoice() voice: ", str);
        String strB = jcm.b().b(str, "mp3", "zh-CN");
        jau.c().b("assert" + strB);
    }

    public void loadDownSound() {
        jax jaxVar = new jax(SOUND_SUCCESS_ACTION, 0, jcm.b().b("S001", "ogg", "zh-CN"));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(jaxVar);
        BaseSoundEffectManager baseSoundEffectManager = this.mSoundEffectManager;
        if (baseSoundEffectManager != null) {
            baseSoundEffectManager.e(arrayList);
        }
    }
}
