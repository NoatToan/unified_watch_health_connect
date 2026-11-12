package com.huawei.health.sportservice.manager;

import android.content.Context;
import android.content.Intent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicInteratorService;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.iyb;
import defpackage.jaa;
import defpackage.jaq;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.MUSIC_MANAGER)
public class MusicManager implements ManagerComponent {
    private static final String TAG = "SportService_MusicManager";
    private Context mContext;
    private int mSportType = 0;
    private jaq mTrackSharedPreferenceUtil;

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "onPreSport()");
        this.mContext = BaseApplication.getContext();
        this.mSportType = BaseSportManager.getInstance().getSportType();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onStartSport()");
        SportMusicInteratorService.d();
        if (BaseSportManager.getInstance().getDataSource() == 100) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "map_tracking_sport_type", Integer.toString(this.mSportType), new StorageParams());
            if (isSupportControlMusic()) {
                SportMusicController.c().e(this.mSportType);
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        LogUtil.a(TAG, "onResumeSport()");
        if (isSupportControlMusic()) {
            LogUtil.a(TAG, "onResumeSport() PLAY_MUSIC");
            SportMusicController.c().a(2, (String) null);
        }
    }

    private boolean isSupportControlMusic() {
        if (this.mTrackSharedPreferenceUtil == null) {
            this.mTrackSharedPreferenceUtil = new jaq(this.mContext, new StorageParams(), Integer.toString(20002));
        }
        if (!CommonUtil.bh() || !jaa.c(this.mContext) || this.mTrackSharedPreferenceUtil.h(this.mSportType) != 1) {
            return false;
        }
        int i = this.mSportType;
        return i == 264 || i == 283 || i == 259 || i == 265;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        LogUtil.a(TAG, "onPauseSport()");
        if (isSupportControlMusic()) {
            LogUtil.a(TAG, "onPauseSport() PAUSE_MUSIC");
            SportMusicController.c().a(1, (String) null);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        LogUtil.a(TAG, "onStopSport()");
        if (isSupportControlMusic()) {
            LogUtil.a(TAG, "onStopSport() PAUSE_MUSIC");
            SportMusicController.c().a(1, (String) null);
        }
        if (jaa.f(this.mContext)) {
            Intent intent = new Intent("action_stop_play_sport_music");
            intent.putExtra("stepRate", 0);
            iyb.a(this.mContext, intent);
        }
    }
}
