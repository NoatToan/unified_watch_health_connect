package com.huawei.health.sportservice.manager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hau;
import defpackage.izn;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.VOICE_MANAGER)
public class CrossJumpVoiceManager extends BaseSportExamVoiceManager implements ManagerComponent {
    private static final long INTERVAL_TIME_FIVE = 5000;
    private static final long INTERVAL_TIME_ONE = 1000;
    private static final int MSG_START_PLAY_SCORE = 1;
    private static final String SOUND_SUCCESS_ACTION = "SOUND_SUCCESS_ACTION";
    private static final String TAG = "SportService_CrossJumpVoiceManager";
    private long mDuration;
    private boolean mIsPlayLastTime;
    private int mStatus;
    private hau mSportCallbackOption = new hau();
    private final Handler mHandler = new StatusVoiceHandler(Looper.getMainLooper(), this);
    private boolean mIsStopSport = false;
    private boolean mIsStartSport = false;
    private long mLeaveScreenTime = 0;

    @Override // com.huawei.health.sportservice.manager.BaseSportExamVoiceManager, com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        super.onPreSport();
        loadDownSound();
        ArrayList arrayList = new ArrayList(5);
        arrayList.add("SPORT_EXAM_SCORE");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("STATUS_CODE_DATA");
        arrayList.add("AI_SPORT_UI_UPDATE_SIGNAL");
        arrayList.add("CROSS_JUMP_GROUP_DATA");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.CrossJumpVoiceManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1183xc9b7f4df(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-CrossJumpVoiceManager, reason: not valid java name */
    /* synthetic */ void m1183xc9b7f4df(List list, Map map) {
        if (njy.e(list) || map == null) {
            LogUtil.j(TAG, "SportDataNotify failed");
            return;
        }
        if (list.contains("STATUS_CODE_DATA")) {
            this.mStatus = izn.e(map.get("STATUS_CODE_DATA"));
            playErrorVoice();
        }
        if (list.contains("TIME_ONE_SECOND_DURATION")) {
            if (map.get("TIME_ONE_SECOND_DURATION") != null) {
                this.mDuration = ((Long) map.get("TIME_ONE_SECOND_DURATION")).longValue();
            }
            playLastTimeVoice();
        }
        if (list.contains("SPORT_EXAM_SCORE")) {
            if (izn.e(map.get("SPORT_EXAM_SCORE")) == 0) {
                return;
            }
            if (this.mSoundEffectManager != null) {
                this.mSoundEffectManager.a("SOUND_SUCCESS_ACTION");
            }
        }
        if (list.contains("AI_SPORT_UI_UPDATE_SIGNAL")) {
            playOverTimeJumpVoice(izn.e(map.get("AI_SPORT_UI_UPDATE_SIGNAL")));
        }
        if (list.contains("CROSS_JUMP_GROUP_DATA")) {
            int iE = izn.e(map.get("CROSS_JUMP_GROUP_DATA"));
            Message messageObtainMessage = this.mHandler.obtainMessage(1);
            messageObtainMessage.obj = Integer.valueOf(iE);
            this.mHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.health.sportservice.manager.BaseSportExamVoiceManager
    public String getLogTag() {
        return TAG;
    }

    private void playLastTimeVoice() {
        if (this.mDuration < 110000 || this.mIsPlayLastTime) {
            return;
        }
        speakNativeVoice("L305");
        this.mIsPlayLastTime = true;
    }

    private void playOverTimeJumpVoice(int i) {
        if (i == 8) {
            speakNativeVoice("L301");
        } else if (i == 3) {
            speakNativeVoice("L115");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playJumpGroupVoice(int i) {
        if (i == 3) {
            speakNativeVoice("L117");
        } else if (i == 6) {
            speakNativeVoice("L115");
        } else if (i == 8) {
            speakNativeVoice("L302");
        }
    }

    private void playErrorVoice() {
        if (this.mIsStopSport || !this.mIsStartSport) {
            return;
        }
        if (isLeaveScreen()) {
            playLeaveScreenVoice();
            return;
        }
        this.mLeaveScreenTime = 0L;
        int i = this.mStatus;
        if (i == -4003) {
            speakNativeVoice("L304");
        } else {
            if (i != -4002) {
                return;
            }
            speakNativeVoice("L303");
        }
    }

    private void playLeaveScreenVoice() {
        if (this.mLeaveScreenTime == 0 || System.currentTimeMillis() - this.mLeaveScreenTime > 5000) {
            this.mLeaveScreenTime = System.currentTimeMillis();
            speakNativeVoice("L104");
        }
    }

    private boolean isLeaveScreen() {
        int i = this.mStatus;
        return i == -3 || i == -2 || i == -1;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.mIsStartSport = true;
        LogUtil.a(TAG, "onStartSport");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.mIsStopSport = true;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        super.onResumeSport();
        speakNativeVoice("L307");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        super.onPauseSport();
    }

    @Override // com.huawei.health.sportservice.manager.BaseSportExamVoiceManager, com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        super.destroy();
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    static class StatusVoiceHandler extends BaseHandler<CrossJumpVoiceManager> {
        StatusVoiceHandler(Looper looper, CrossJumpVoiceManager crossJumpVoiceManager) {
            super(looper, crossJumpVoiceManager);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(CrossJumpVoiceManager crossJumpVoiceManager, Message message) {
            if (message == null) {
                LogUtil.j(CrossJumpVoiceManager.TAG, "handleMessage message is null");
            } else if (message.what == 1) {
                crossJumpVoiceManager.playJumpGroupVoice(((Integer) message.obj).intValue());
            }
        }
    }
}
