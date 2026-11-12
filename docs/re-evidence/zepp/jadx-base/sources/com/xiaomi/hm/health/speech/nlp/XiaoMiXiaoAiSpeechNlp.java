package com.xiaomi.hm.health.speech.nlp;

import android.content.Context;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;
import com.xiaomi.hm.health.speech.constant.XiaoMiPlatformDomain;
import com.xiaomi.hm.health.speech.handler.AlarmHandler;
import com.xiaomi.hm.health.speech.handler.BaseDomainHandler;
import com.xiaomi.hm.health.speech.handler.ChatHandler;
import com.xiaomi.hm.health.speech.handler.CustomSkillsHandler;
import com.xiaomi.hm.health.speech.handler.ReminderHandler;
import com.xiaomi.hm.health.speech.handler.SmartMiotHandler;

/* JADX INFO: loaded from: classes21.dex */
public class XiaoMiXiaoAiSpeechNlp extends BaseSpeechNlp {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[XiaoMiPlatformDomain.values().length];
            a = iArr;
            try {
                iArr[XiaoMiPlatformDomain.ALARM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[XiaoMiPlatformDomain.INTERNALPLATFORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[XiaoMiPlatformDomain.SMARTMIOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[XiaoMiPlatformDomain.REMINDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[XiaoMiPlatformDomain.WEATHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class b {
        private static final XiaoMiXiaoAiSpeechNlp a = new XiaoMiXiaoAiSpeechNlp();

        private b() {
        }
    }

    private XiaoMiXiaoAiSpeechNlp() {
    }

    public static XiaoMiXiaoAiSpeechNlp getInstance() {
        return b.a;
    }

    @Override // com.xiaomi.hm.health.speech.nlp.BaseSpeechNlp
    public void distribute(Context context, Object speechContent) {
        BaseDomainHandler alarmHandler;
        if (speechContent instanceof SpeechResult) {
            SpeechResult speechResult = (SpeechResult) speechContent;
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
            int i = a.a[XiaoMiPlatformDomain.findCorrespondDomainByDomainDesc(speechResult.getDomain()).ordinal()];
            if (i == 1) {
                alarmHandler = new AlarmHandler(context);
            } else if (i == 2) {
                alarmHandler = new CustomSkillsHandler(context);
            } else if (i == 3) {
                alarmHandler = new SmartMiotHandler(context);
            } else if (i != 4) {
                alarmHandler = i != 5 ? new ChatHandler(context) : new ChatHandler(context);
            } else {
                alarmHandler = new ReminderHandler(context);
            }
            alarmHandler.resolveSpeechResult(speechResult);
            alarmHandler.handleDomainEvent();
            alarmHandler.pushInfoToDevice(hMMiLiProDevice);
        }
    }

    @Override // com.xiaomi.hm.health.speech.nlp.BaseSpeechNlp
    public String getSpeechNlpName() {
        return AiEnginePlatform.XIAOMI.getEngineDesc();
    }
}
