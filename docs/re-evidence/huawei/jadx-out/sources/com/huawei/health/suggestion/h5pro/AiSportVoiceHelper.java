package com.huawei.health.suggestion.h5pro;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.suggestion.h5pro.h5params.SpeakParams;
import com.huawei.health.suggestion.ui.fitness.helper.FitnessRunAudioScenarioId;
import com.huawei.health.suggestion.ui.fitness.helper.MediaHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import defpackage.pqj;
import defpackage.pqk;
import defpackage.xkf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AiSportVoiceHelper {
    private static final int BEAT_CHANGE_TYPE = 0;
    private static final int GUIDE_CHANGE_TYPE = 1;
    private static final int INVALID_INPUT = -1;
    private static final String TAG = "AISportVoiceHelper";
    private static volatile AiSportVoiceHelper sInstance;
    private String mGender = AudioConstant.WOMAN;
    private MediaHelper mGuideHelper = new MediaHelper();
    private MediaHelper mCompletenessHelper = new MediaHelper();
    private MediaHelper mBackgroundHelper = new MediaHelper();
    private MediaHelper mBeatHelper = new MediaHelper();
    private MediaHelper mVoiceChangeHelper = new MediaHelper();
    private float mGuideVolume = 1.0f;
    private float mBackgroundVolume = 1.0f;
    private float mBeatVolume = 1.0f;
    private AiSportH5Cbk mLastCbk = null;
    private int mCurrent = 1;
    private String mType = "";
    private boolean isGuidePause = false;

    private boolean judgeVolume(float f) {
        return f >= 0.0f && f <= 1.0f;
    }

    public static AiSportVoiceHelper getInstance() {
        if (sInstance == null) {
            synchronized (AiSportVoiceHelper.class) {
                if (sInstance == null) {
                    sInstance = new AiSportVoiceHelper();
                }
            }
        }
        return sInstance;
    }

    private AiSportVoiceHelper() {
    }

    public void setHelperType(String str) {
        this.mType = str;
        LogUtil.a(TAG, "setType: ", str);
        setType(this.mBackgroundHelper);
        setType(this.mGuideHelper);
        setType(this.mBeatHelper);
        setType(this.mVoiceChangeHelper);
    }

    private void setType(MediaHelper mediaHelper) {
        if (mediaHelper != null) {
            mediaHelper.b(this.mType);
        }
    }

    private void releasePlayer(MediaPlayer mediaPlayer) {
        LogUtil.a(TAG, "releasePlayer");
        if (mediaPlayer == null) {
            LogUtil.j(TAG, "releasePlayer null");
            return;
        }
        mediaPlayer.pause();
        mediaPlayer.stop();
        mediaPlayer.setOnCompletionListener(null);
        mediaPlayer.setOnPreparedListener(null);
    }

    public void playByScene(String str, String str2, SpeakParams speakParams, AiSportH5Cbk aiSportH5Cbk) {
        LogUtil.a(TAG, "language: ", str, " sceneCode: ", str2, " actionNameUrl: ", speakParams.getActionNameUrl(), " groups: ", Integer.valueOf(speakParams.getGroupNum()), " repeats: ", Integer.valueOf(speakParams.getRepeats()));
        FitnessRunAudioScenarioId fitnessRunAudioScenarioId = null;
        for (FitnessRunAudioScenarioId fitnessRunAudioScenarioId2 : FitnessRunAudioScenarioId.values()) {
            if (fitnessRunAudioScenarioId2.getId().equals(str2)) {
                fitnessRunAudioScenarioId = fitnessRunAudioScenarioId2;
            }
        }
        if (fitnessRunAudioScenarioId == null) {
            LogUtil.a(TAG, "playByScene scenarioId error");
            return;
        }
        if (!isDefaultLang(str)) {
            LogUtil.a(TAG, "play MultilingualAudio");
            playVoicesPath(fitnessRunAudioScenarioId, speakParams, aiSportH5Cbk);
            return;
        }
        List<String> audioList = getAudioList(fitnessRunAudioScenarioId, speakParams);
        LogUtil.a(TAG, "play zh-cn or en voiceList: ", audioList);
        if (isPlayOtherAudio(fitnessRunAudioScenarioId, aiSportH5Cbk)) {
            return;
        }
        this.mCurrent = 1;
        this.isGuidePause = false;
        if (this.mGuideHelper == null) {
            LogUtil.a(TAG, "guiderHelper is null");
            MediaHelper mediaHelper = new MediaHelper();
            this.mGuideHelper = mediaHelper;
            setType(mediaHelper);
        }
        if (this.mGuideHelper.o()) {
            this.mLastCbk.onSuccess(0);
            releasePlayer(this.mGuideHelper.s());
            LogUtil.a(TAG, "playByScene releasePlayer");
        }
        this.mLastCbk = aiSportH5Cbk;
        this.mGuideHelper.c(audioList);
        this.mGuideHelper.a(false);
        this.mGuideHelper.b(false);
        if (handleAudioFocus(BaseApplication.b(), true)) {
            this.mGuideHelper.start();
        }
        setOnCompletionListener(this.mGuideHelper, aiSportH5Cbk);
        setOnErrorListener(this.mGuideHelper, aiSportH5Cbk);
    }

    private boolean isDefaultLang(String str) {
        return "zh-cn".equals(str) || "en".equals(str) || !pqj.b().b(BaseApplication.b(), SingleDailyMomentContent.COURSE_TYPE);
    }

    private boolean isPlayOtherAudio(FitnessRunAudioScenarioId fitnessRunAudioScenarioId, AiSportH5Cbk aiSportH5Cbk) {
        if (FitnessRunAudioScenarioId.SEC_DI_AUDIO.getId().equals(fitnessRunAudioScenarioId.getId()) || FitnessRunAudioScenarioId.REP_DI_AUDIO.getId().equals(fitnessRunAudioScenarioId.getId())) {
            LogUtil.a(TAG, "play di audio");
            if (this.mBeatHelper == null) {
                MediaHelper mediaHelper = new MediaHelper();
                this.mBeatHelper = mediaHelper;
                setType(mediaHelper);
            }
            playOtherAudio(fitnessRunAudioScenarioId, this.mBeatHelper, aiSportH5Cbk);
            return true;
        }
        if (!FitnessRunAudioScenarioId.PERFECT.getId().equals(fitnessRunAudioScenarioId.getId()) && !FitnessRunAudioScenarioId.GREAT.getId().equals(fitnessRunAudioScenarioId.getId()) && !FitnessRunAudioScenarioId.EXCELLENT.getId().equals(fitnessRunAudioScenarioId.getId())) {
            return false;
        }
        LogUtil.a(TAG, "play completeness audio");
        if (this.mCompletenessHelper == null) {
            MediaHelper mediaHelper2 = new MediaHelper();
            this.mCompletenessHelper = mediaHelper2;
            setType(mediaHelper2);
        }
        playOtherAudio(fitnessRunAudioScenarioId, this.mCompletenessHelper, aiSportH5Cbk);
        return true;
    }

    private void playOtherAudio(FitnessRunAudioScenarioId fitnessRunAudioScenarioId, final MediaHelper mediaHelper, final AiSportH5Cbk aiSportH5Cbk) {
        if (mediaHelper.o()) {
            aiSportH5Cbk.onSuccess(0);
            releasePlayer(mediaHelper.s());
        }
        mediaHelper.setSdSources(xkf.b(AudioConstant.AUDIO_LIST.get(fitnessRunAudioScenarioId), this.mGender, this.mType, AudioConstant.AUDIO));
        mediaHelper.b(false);
        mediaHelper.a(false);
        if (handleAudioFocus(BaseApplication.b(), true)) {
            mediaHelper.start();
        }
        mediaHelper.s().setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.huawei.health.suggestion.h5pro.AiSportVoiceHelper$$ExternalSyntheticLambda4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.f$0.m1216x8ed5b772(aiSportH5Cbk, mediaHelper, mediaPlayer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$playOtherAudio$0$com-huawei-health-suggestion-h5pro-AiSportVoiceHelper, reason: not valid java name */
    /* synthetic */ void m1216x8ed5b772(AiSportH5Cbk aiSportH5Cbk, MediaHelper mediaHelper, MediaPlayer mediaPlayer) {
        LogUtil.a(TAG, "playOtherAudio end");
        aiSportH5Cbk.onSuccess(0);
        releasePlayer(mediaHelper.s());
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.AiSportVoiceHelper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$health$suggestion$ui$fitness$helper$FitnessRunAudioScenarioId;

        static {
            int[] iArr = new int[FitnessRunAudioScenarioId.values().length];
            $SwitchMap$com$huawei$health$suggestion$ui$fitness$helper$FitnessRunAudioScenarioId = iArr;
            try {
                iArr[FitnessRunAudioScenarioId.FIRST_ACTION_RUN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$health$suggestion$ui$fitness$helper$FitnessRunAudioScenarioId[FitnessRunAudioScenarioId.PRE_MOTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$health$suggestion$ui$fitness$helper$FitnessRunAudioScenarioId[FitnessRunAudioScenarioId.NEXT_MOTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$huawei$health$suggestion$ui$fitness$helper$FitnessRunAudioScenarioId[FitnessRunAudioScenarioId.LAST_MOTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$huawei$health$suggestion$ui$fitness$helper$FitnessRunAudioScenarioId[FitnessRunAudioScenarioId.N_GROUP_N_SEC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$huawei$health$suggestion$ui$fitness$helper$FitnessRunAudioScenarioId[FitnessRunAudioScenarioId.N_GROUP_N_REP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private List<String> getAudioList(FitnessRunAudioScenarioId fitnessRunAudioScenarioId, SpeakParams speakParams) {
        ArrayList arrayList = new ArrayList();
        switch (AnonymousClass1.$SwitchMap$com$huawei$health$suggestion$ui$fitness$helper$FitnessRunAudioScenarioId[fitnessRunAudioScenarioId.ordinal()]) {
            case 1:
                arrayList.add(xkf.b("E002", this.mGender, this.mType, AudioConstant.AUDIO));
                arrayList.add(xkf.c(speakParams.getActionNameUrl()));
                break;
            case 2:
                arrayList.add(xkf.b("E205", this.mGender, this.mType, AudioConstant.AUDIO));
                arrayList.add(xkf.c(speakParams.getActionNameUrl()));
                break;
            case 3:
                arrayList.add(xkf.b("E019", this.mGender, this.mType, AudioConstant.AUDIO));
                arrayList.add(xkf.c(speakParams.getActionNameUrl()));
                break;
            case 4:
                arrayList.add(xkf.b("E065", this.mGender, this.mType, AudioConstant.AUDIO));
                arrayList.add(xkf.c(speakParams.getActionNameUrl()));
                break;
            case 5:
                arrayList.addAll(splitGroup(speakParams.getGroupNum()));
                arrayList.addAll(this.mGuideHelper.d(speakParams.getRepeats()));
                arrayList.add(xkf.b("C003", this.mGender, this.mType, AudioConstant.AUDIO));
                break;
            case 6:
                arrayList.addAll(splitGroup(speakParams.getGroupNum()));
                arrayList.addAll(this.mGuideHelper.d(speakParams.getRepeats()));
                arrayList.add(xkf.b("C030", this.mGender, this.mType, AudioConstant.AUDIO));
                break;
            default:
                arrayList.add(xkf.b(AudioConstant.AUDIO_LIST.get(fitnessRunAudioScenarioId), this.mGender, this.mType, AudioConstant.AUDIO));
                break;
        }
        return arrayList;
    }

    private List<String> splitGroup(int i) {
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8").contains(String.valueOf(i))) {
            arrayList.add(xkf.b("B" + (i + 152), this.mGender, this.mType, AudioConstant.AUDIO));
            return arrayList;
        }
        arrayList.addAll(this.mGuideHelper.d(i));
        arrayList.add(xkf.b("C001", this.mGender, this.mType, AudioConstant.AUDIO));
        return arrayList;
    }

    private void playVoicesPath(FitnessRunAudioScenarioId fitnessRunAudioScenarioId, SpeakParams speakParams, AiSportH5Cbk aiSportH5Cbk) {
        if (fitnessRunAudioScenarioId == null || speakParams == null) {
            LogUtil.j(TAG, "playVoicesPath() scenarioId or motion is null");
            return;
        }
        pqk pqkVar = new pqk();
        if (speakParams.getRepeats() != -1 && speakParams.getGroupNum() != -1) {
            pqkVar.a(speakParams.getActionNameUrl());
            pqkVar.e(Integer.valueOf(speakParams.getGroupNum()));
            pqkVar.e(Integer.valueOf(speakParams.getRepeats()));
        }
        ArrayList arrayList = new ArrayList(pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), pqkVar));
        if (this.mGuideHelper.o()) {
            this.mGuideHelper.n();
        }
        setOnCompletionListener(this.mGuideHelper, aiSportH5Cbk);
        this.mGuideHelper.c(arrayList);
        if (handleAudioFocus(BaseApplication.b(), true)) {
            this.mGuideHelper.start();
        }
    }

    public void playByUrl(String str, final AiSportH5Cbk aiSportH5Cbk) {
        LogUtil.a(TAG, "play by url: ", str);
        if (this.mGuideHelper == null) {
            MediaHelper mediaHelper = new MediaHelper();
            this.mGuideHelper = mediaHelper;
            setType(mediaHelper);
        }
        final MediaPlayer mediaPlayerS = this.mGuideHelper.s();
        if (this.mGuideHelper.o()) {
            LogUtil.a(TAG, "playByUrl releasePlayer");
            this.mLastCbk.onSuccess(0);
            releasePlayer(mediaPlayerS);
        }
        this.mLastCbk = aiSportH5Cbk;
        try {
            this.mGuideHelper.n();
            mediaPlayerS.setDataSource(str);
            mediaPlayerS.prepareAsync();
            this.mGuideHelper.b(false);
            this.mGuideHelper.a(false);
            mediaPlayerS.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.huawei.health.suggestion.h5pro.AiSportVoiceHelper$$ExternalSyntheticLambda1
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    this.f$0.m1214xdaa49b63(aiSportH5Cbk, mediaPlayer);
                }
            });
            mediaPlayerS.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.huawei.health.suggestion.h5pro.AiSportVoiceHelper$$ExternalSyntheticLambda2
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f$0.m1215x3f8f0a4(mediaPlayerS, mediaPlayer);
                }
            });
        } catch (IOException unused) {
            LogUtil.a(TAG, "player IOException");
        } catch (IllegalStateException unused2) {
            LogUtil.a(TAG, "player IllegalStateException");
        }
    }

    /* JADX INFO: renamed from: lambda$playByUrl$1$com-huawei-health-suggestion-h5pro-AiSportVoiceHelper, reason: not valid java name */
    /* synthetic */ void m1214xdaa49b63(AiSportH5Cbk aiSportH5Cbk, MediaPlayer mediaPlayer) {
        this.mGuideHelper.n();
        aiSportH5Cbk.onSuccess(0);
        LogUtil.a(TAG, "playByUrl end");
    }

    /* JADX INFO: renamed from: lambda$playByUrl$2$com-huawei-health-suggestion-h5pro-AiSportVoiceHelper, reason: not valid java name */
    /* synthetic */ void m1215x3f8f0a4(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2) {
        if (handleAudioFocus(BaseApplication.b(), true)) {
            mediaPlayer.start();
        }
    }

    public void playOrPauseBeat(boolean z) {
        LogUtil.a(TAG, "Enter playOrPauseBeat play: ", Boolean.valueOf(z));
        if (this.mBeatHelper == null) {
            MediaHelper mediaHelper = new MediaHelper();
            this.mBeatHelper = mediaHelper;
            setType(mediaHelper);
        }
        if (z) {
            if (this.mBeatHelper.o() || !handleAudioFocus(BaseApplication.b(), true)) {
                return;
            }
            this.mBeatHelper.videoContinue();
            return;
        }
        this.mBeatHelper.pause();
    }

    public void playOrPauseGuide(boolean z) {
        LogUtil.a(TAG, "Enter playOrPauseGuide play: ", Boolean.valueOf(z));
        if (this.mGuideHelper == null) {
            MediaHelper mediaHelper = new MediaHelper();
            this.mGuideHelper = mediaHelper;
            setType(mediaHelper);
        }
        if (z) {
            if (!this.mGuideHelper.o() && handleAudioFocus(BaseApplication.b(), true)) {
                this.mGuideHelper.videoContinue();
            }
            this.isGuidePause = false;
            return;
        }
        this.mGuideHelper.pause();
        this.isGuidePause = true;
    }

    public void playOrPauseBackground(boolean z) {
        LogUtil.a(TAG, "Enter playOrPauseBackground play: ", Boolean.valueOf(z));
        if (this.mBackgroundHelper == null) {
            MediaHelper mediaHelper = new MediaHelper();
            this.mBackgroundHelper = mediaHelper;
            setType(mediaHelper);
        }
        if (z) {
            if (this.mBackgroundHelper.k() == 0) {
                LogUtil.a(TAG, "set background music resource");
                this.mBackgroundHelper.d(AudioConstant.BACKGROUND_MUSIC_CODE);
                this.mBackgroundHelper.a(true);
                this.mBackgroundHelper.b(this.mBackgroundVolume);
                if (handleAudioFocus(BaseApplication.b(), true)) {
                    this.mBackgroundHelper.start();
                }
            }
            if (this.mBackgroundHelper.o() || !handleAudioFocus(BaseApplication.b(), true)) {
                return;
            }
            this.mBackgroundHelper.videoContinue();
            return;
        }
        this.mBackgroundHelper.pause();
    }

    public void abandonAudioFocus() {
        if (this.mBackgroundHelper.o() || this.mBeatHelper.o() || this.mGuideHelper.o() || this.mVoiceChangeHelper.o()) {
            return;
        }
        LogUtil.a(TAG, "abandon audio focus: ", Boolean.valueOf(handleAudioFocus(BaseApplication.b(), false)));
    }

    private boolean handleAudioFocus(Context context, boolean z) {
        boolean z2 = false;
        if (context == null) {
            LogUtil.e(TAG, "context is null.");
            return false;
        }
        if (context.getSystemService("audio") instanceof AudioManager) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (!z ? audioManager.abandonAudioFocus(null) == 1 : audioManager.requestAudioFocus(null, 3, 2) == 1) {
                z2 = true;
            }
        }
        LogUtil.d(TAG, "handleAudioFocus bMute=", Boolean.valueOf(z), " result=", Boolean.valueOf(z2));
        return z2;
    }

    private void setOnCompletionListener(final MediaHelper mediaHelper, final AiSportH5Cbk aiSportH5Cbk) {
        LogUtil.a(TAG, "setOnCompletionListener");
        mediaHelper.s().setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.huawei.health.suggestion.h5pro.AiSportVoiceHelper$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.f$0.m1217x1c64b52(mediaHelper, aiSportH5Cbk, mediaPlayer);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setOnCompletionListener$3$com-huawei-health-suggestion-h5pro-AiSportVoiceHelper, reason: not valid java name */
    /* synthetic */ void m1217x1c64b52(MediaHelper mediaHelper, AiSportH5Cbk aiSportH5Cbk, MediaPlayer mediaPlayer) {
        LogUtil.a(TAG, "now audio: ", mediaHelper.f(), " current: ", Integer.valueOf(this.mCurrent), " sourceNum: ", Integer.valueOf(mediaHelper.k()));
        if (mediaHelper.k() == 0) {
            LogUtil.e(TAG, "audioList size is 0");
            return;
        }
        if (this.mCurrent == mediaHelper.k()) {
            aiSportH5Cbk.onSuccess(0);
            LogUtil.a(TAG, "play end");
        } else {
            mediaHelper.next();
            if (this.isGuidePause) {
                mediaHelper.pause();
            }
            this.mCurrent++;
        }
    }

    private void setOnErrorListener(MediaHelper mediaHelper, final AiSportH5Cbk aiSportH5Cbk) {
        mediaHelper.s().setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.huawei.health.suggestion.h5pro.AiSportVoiceHelper$$ExternalSyntheticLambda5
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return AiSportVoiceHelper.lambda$setOnErrorListener$4(aiSportH5Cbk, mediaPlayer, i, i2);
            }
        });
    }

    static /* synthetic */ boolean lambda$setOnErrorListener$4(AiSportH5Cbk aiSportH5Cbk, MediaPlayer mediaPlayer, int i, int i2) {
        LogUtil.e(TAG, "MediaHelper error what: ", Integer.valueOf(i), " extra: ", Integer.valueOf(i2));
        aiSportH5Cbk.onSuccess(0);
        return true;
    }

    public JSONObject getAllVolume() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("counter", this.mBeatVolume);
            jSONObject.put("guider", this.mGuideVolume);
            jSONObject.put(WatchFaceProvider.BACKGROUND_LABEL, this.mBackgroundVolume);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.a(TAG, "json put catch JSONException");
            return jSONObject;
        }
    }

    public void setBeatVolume(float f) {
        if (f == this.mBeatVolume) {
            return;
        }
        LogUtil.a(TAG, "setBeatVolume");
        if (!judgeVolume(f)) {
            f = this.mBeatVolume;
        }
        this.mBeatVolume = f;
        this.mBeatHelper.b(f);
        showChangeVoice(0, this.mBeatVolume);
    }

    public void setGuideVolume(float f) {
        if (f == this.mGuideVolume) {
            return;
        }
        LogUtil.a(TAG, "setGuideVolume");
        if (!judgeVolume(f)) {
            f = this.mGuideVolume;
        }
        this.mGuideVolume = f;
        this.mGuideHelper.b(f);
        showChangeVoice(1, this.mGuideVolume);
    }

    public void setBackgroundVolume(float f) {
        if (f == this.mBackgroundVolume) {
            return;
        }
        LogUtil.a(TAG, "setBackgroundVolume");
        if (!judgeVolume(f)) {
            f = this.mBackgroundVolume;
        }
        this.mBackgroundVolume = f;
        this.mBackgroundHelper.b(f);
    }

    private void showChangeVoice(int i, float f) {
        if (this.mVoiceChangeHelper == null) {
            MediaHelper mediaHelper = new MediaHelper();
            this.mVoiceChangeHelper = mediaHelper;
            setType(mediaHelper);
        }
        this.mVoiceChangeHelper.b(false);
        this.mVoiceChangeHelper.a(false);
        if (i == 0) {
            this.mVoiceChangeHelper.b(f);
            this.mVoiceChangeHelper.setSdSources(xkf.b("B001", this.mGender, this.mType, AudioConstant.AUDIO));
            this.mVoiceChangeHelper.a(false);
            this.mVoiceChangeHelper.b(false);
            this.mVoiceChangeHelper.start();
        } else if (i != 1) {
            LogUtil.a(TAG, "showChangeVoice error type");
        } else {
            this.mVoiceChangeHelper.b(f);
            this.mVoiceChangeHelper.setSdSources(xkf.b(AudioConstant.GUIDE_VOLUME_CHANGE_HINT_CODE, this.mGender, this.mType, AudioConstant.AUDIO));
            this.mVoiceChangeHelper.a(false);
            this.mVoiceChangeHelper.b(false);
            this.mVoiceChangeHelper.start();
        }
        LogUtil.a(TAG, "showChangeVoice current audio: ", this.mVoiceChangeHelper.f());
    }

    public static void clearAll() {
        LogUtil.a(TAG, "clearAll");
        if (sInstance == null) {
            LogUtil.a(TAG, "sInstance is null");
        } else {
            getInstance().stopAll();
        }
    }

    public void stopAll() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.AiSportVoiceHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1218x4858afa2();
            }
        });
        releaseHelper(this.mBeatHelper);
        this.mBeatHelper = null;
        this.mBeatVolume = 1.0f;
        releaseHelper(this.mGuideHelper);
        this.mGuideHelper = null;
        this.mGuideVolume = 1.0f;
        releaseHelper(this.mBackgroundHelper);
        this.mBackgroundHelper = null;
        this.mBackgroundVolume = 1.0f;
        releaseHelper(this.mVoiceChangeHelper);
        this.mVoiceChangeHelper = null;
        releaseHelper(this.mCompletenessHelper);
        this.mCompletenessHelper = null;
        this.mLastCbk = null;
    }

    /* JADX INFO: renamed from: lambda$stopAll$5$com-huawei-health-suggestion-h5pro-AiSportVoiceHelper, reason: not valid java name */
    /* synthetic */ void m1218x4858afa2() {
        LogUtil.a(TAG, "stopAll abandon audio focus: ", Boolean.valueOf(handleAudioFocus(BaseApplication.b(), false)));
    }

    private void releaseHelper(MediaHelper mediaHelper) {
        if (mediaHelper != null) {
            releasePlayer(mediaHelper.s());
            mediaHelper.release();
        } else {
            LogUtil.j(TAG, "releaseHelper null");
        }
    }

    private void setGender(int i) {
        this.mGuideHelper.c(i);
        this.mBeatHelper.c(i);
        this.mVoiceChangeHelper.c(i);
        this.mBackgroundHelper.c(i);
        this.mGender = i == 1 ? AudioConstant.WOMAN : "M";
    }
}
