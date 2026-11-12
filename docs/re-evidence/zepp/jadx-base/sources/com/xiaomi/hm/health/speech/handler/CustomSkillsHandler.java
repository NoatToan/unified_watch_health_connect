package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import com.huami.tools.log.HMLog;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.OpenContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.speech.constant.BandSeriesDeviceSkill;
import com.xiaomi.hm.health.speech.entity.PayLoad;
import com.xiaomi.hm.health.speech.utils.DeviceSupportSkillFilterUtils;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;

/* JADX INFO: loaded from: classes21.dex */
public class CustomSkillsHandler extends BaseDomainHandler {
    public static final String TAG = "CustomSkillHandler";
    private PayLoad c;
    private BandSeriesDeviceSkill d;
    private DefaultDeviceSkillHandler e;
    private HMSpeechInfo f;
    private OpenContent g;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BandSeriesDeviceSkill.values().length];
            a = iArr;
            try {
                iArr[BandSeriesDeviceSkill.NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BandSeriesDeviceSkill.DND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[BandSeriesDeviceSkill.STOPWATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[BandSeriesDeviceSkill.INDOOR_RUN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[BandSeriesDeviceSkill.OUTDOOR_RUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[BandSeriesDeviceSkill.CYCLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[BandSeriesDeviceSkill.WALKING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[BandSeriesDeviceSkill.SWIMMING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[BandSeriesDeviceSkill.TRAINING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[BandSeriesDeviceSkill.OPEN_ALIPAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[BandSeriesDeviceSkill.MUSIC_CONTROL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[BandSeriesDeviceSkill.CARD_PACK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[BandSeriesDeviceSkill.WATCH_FACE_SETTING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[BandSeriesDeviceSkill.BRIGHTNESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[BandSeriesDeviceSkill.FIND_PHONE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[BandSeriesDeviceSkill.DEVICE_MUTE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[BandSeriesDeviceSkill.ACTIVITY_STATUS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[BandSeriesDeviceSkill.HEART_RATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public CustomSkillsHandler(Context context) {
        super(context);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void handleDomainEvent() {
        BandSeriesDeviceSkill bandSeriesDeviceSkill;
        if (this.c == null || (bandSeriesDeviceSkill = this.d) == BandSeriesDeviceSkill.DEFAULT_SKILL) {
            this.e.handleDomainEvent();
            return;
        }
        switch (a.a[bandSeriesDeviceSkill.ordinal()]) {
            case 1:
                this.g = new OpenContent((byte) 6);
                break;
            case 2:
                this.g = new OpenContent((byte) 7);
                break;
            case 3:
                this.g = new OpenContent((byte) 10);
                break;
            case 4:
                this.g = new OpenContent((byte) 4, OpenContent.SUB_SPORT_INDOOR);
                break;
            case 5:
                this.g = new OpenContent((byte) 4, OpenContent.SUB_SPORT_OUTDOOR);
                break;
            case 6:
                this.g = new OpenContent((byte) 4, OpenContent.SUB_SPORT_RIDE);
                break;
            case 7:
                this.g = new OpenContent((byte) 4, OpenContent.SUB_SPORT_WALK);
                break;
            case 8:
                this.g = new OpenContent((byte) 4, OpenContent.SUB_SPORT_SWIM_POOL);
                break;
            case 9:
                this.g = new OpenContent((byte) 4, OpenContent.SUB_SPORT_EXERCISE);
                break;
            case 10:
                this.g = new OpenContent((byte) 0);
                break;
            case 11:
                this.g = new OpenContent((byte) 9);
                break;
            case 12:
                this.g = new OpenContent((byte) 1);
                break;
            case 13:
                this.g = new OpenContent((byte) 14);
                break;
            case 14:
                this.g = new OpenContent((byte) 15);
                break;
            case 15:
                this.g = new OpenContent((byte) 12);
                break;
            case 16:
                this.g = new OpenContent((byte) 13);
                break;
            case 17:
                this.g = new OpenContent((byte) 2);
                break;
            case 18:
                this.g = new OpenContent((byte) 3);
                break;
            default:
                this.g = null;
                break;
        }
        if (this.g != null) {
            this.f = new HMSpeechInfo(getId(), SpeechType.OPEN, this.g);
        }
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void pushInfoToDevice(HMMiLiProDevice hmMiLiProDevice) {
        if (this.c == null || this.d == BandSeriesDeviceSkill.DEFAULT_SKILL) {
            this.e.pushInfoToDevice(hmMiLiProDevice);
            return;
        }
        HMSpeechInfo hMSpeechInfo = this.f;
        if (hMSpeechInfo != null) {
            hmMiLiProDevice.sendSpeechInfoSync(hMSpeechInfo);
        }
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void resolveSpeechResult(SpeechResult speechResult) {
        HMLog.d(TAG, speechResult.getContent(), new Object[0]);
        PayLoad responseContentJsonStrToDevicePayLoad = JsonParseUtils.parseResponseContentJsonStrToDevicePayLoad(speechResult.getContent());
        this.c = responseContentJsonStrToDevicePayLoad;
        if (responseContentJsonStrToDevicePayLoad != null) {
            this.d = BandSeriesDeviceSkill.getDeviceSkillByDeviceSkillDesc(responseContentJsonStrToDevicePayLoad.getIntent());
            if (!DeviceSupportSkillFilterUtils.isSpecifiedSkillInDeviceSupportSkillCollection(this.d, (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI))) {
                this.d = BandSeriesDeviceSkill.DEFAULT_SKILL;
            }
        }
        if (this.c == null || this.d == BandSeriesDeviceSkill.DEFAULT_SKILL) {
            DefaultDeviceSkillHandler defaultDeviceSkillHandler = new DefaultDeviceSkillHandler(this.context);
            this.e = defaultDeviceSkillHandler;
            defaultDeviceSkillHandler.resolveSpeechResult(speechResult);
        }
    }
}
