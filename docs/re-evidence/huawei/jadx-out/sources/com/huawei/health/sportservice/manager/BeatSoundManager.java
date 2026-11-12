package com.huawei.health.sportservice.manager;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.model.SportBeat;
import defpackage.jwz;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.BEAT_SOUND_MANAGER)
public class BeatSoundManager implements ManagerComponent, SportLifecycle {
    private static final String TAG = "SportService_BeatSoundManager";
    private jwz sportBeatPlayer;

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        if (SportParamsType.SPORT_BEAT_CHANGE.equals(sportParamsType) && (obj instanceof SportBeat)) {
            SportBeat sportBeat = (SportBeat) obj;
            ReleaseLogUtil.d(TAG, sportBeat);
            if (this.sportBeatPlayer == null) {
                this.sportBeatPlayer = new jwz(sportBeat);
                if (BaseSportManager.getInstance().getStatus() == 1 && sportBeat.isOpen()) {
                    this.sportBeatPlayer.g();
                    return;
                }
                return;
            }
            if (sportBeat.getPlayStatus() == 2) {
                this.sportBeatPlayer.i();
                return;
            }
            if (sportBeat.getPlayStatus() == 1) {
                this.sportBeatPlayer.c(sportBeat);
                return;
            }
            this.sportBeatPlayer.i();
            this.sportBeatPlayer.c(sportBeat);
            if (sportBeat.isOpen()) {
                this.sportBeatPlayer.g();
            }
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public boolean supportParas(SportParamsType sportParamsType) {
        return SportParamsType.SPORT_BEAT_CHANGE.equals(sportParamsType);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        jwz jwzVar = this.sportBeatPlayer;
        if (jwzVar == null || !jwzVar.d()) {
            return;
        }
        this.sportBeatPlayer.g();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        jwz jwzVar = this.sportBeatPlayer;
        if (jwzVar != null) {
            jwzVar.i();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        jwz jwzVar = this.sportBeatPlayer;
        if (jwzVar == null || !jwzVar.d()) {
            return;
        }
        this.sportBeatPlayer.f();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        jwz jwzVar = this.sportBeatPlayer;
        if (jwzVar != null) {
            jwzVar.j();
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        jwz jwzVar = this.sportBeatPlayer;
        if (jwzVar != null) {
            jwzVar.e();
        }
    }
}
