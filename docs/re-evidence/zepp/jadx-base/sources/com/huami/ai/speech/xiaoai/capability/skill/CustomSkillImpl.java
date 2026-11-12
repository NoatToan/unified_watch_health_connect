package com.huami.ai.speech.xiaoai.capability.skill;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.BatterySkill;
import com.huami.ai.skill.CustomSkill;
import com.huami.ai.skill.SetBrightnessSkill;
import com.huami.ai.speech.xiaoai.capability.instruction.custom.CustomSkillIntentKt;
import com.xiaomi.ai.api.CustomDirective;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.hm.health.bt.profile.speech.ChatContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.OpenContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/CustomSkillImpl;", "Lcom/huami/ai/skill/CustomSkill;", "", "intent", "Lcom/xiaomi/hm/health/bt/profile/speech/SpeechContent;", "a", "Lcom/xiaomi/ai/api/common/InstructionPayload;", "payload", "", "b", "speechContent", "", "c", "exeCustomSkill", "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/ai/helper/DeviceSpeechID;", "Lcom/huami/ai/helper/DeviceSpeechID;", "deviceSpeechID", "Lcom/huami/ai/skill/SetBrightnessSkill;", "Lcom/huami/ai/skill/SetBrightnessSkill;", "setBrightnessSkill", "Lcom/huami/ai/skill/BatterySkill;", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/skill/BatterySkill;", "batterySkill", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;Lcom/huami/ai/helper/DeviceSpeechID;Lcom/huami/ai/skill/SetBrightnessSkill;Lcom/huami/ai/skill/BatterySkill;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class CustomSkillImpl implements CustomSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceSpeechID deviceSpeechID;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SetBrightnessSkill setBrightnessSkill;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final BatterySkill batterySkill;

    public CustomSkillImpl(@NotNull SpeechDevice speechDevice, @NotNull DeviceSpeechID deviceSpeechID, @NotNull SetBrightnessSkill setBrightnessSkill, @NotNull BatterySkill batterySkill) {
        this.baseDevice = speechDevice;
        this.deviceSpeechID = deviceSpeechID;
        this.setBrightnessSkill = setBrightnessSkill;
        this.batterySkill = batterySkill;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SpeechContent a(String intent) {
        switch (intent.hashCode()) {
            case -1427977986:
                if (intent.equals(CustomSkillIntentKt.INTENT_RUN_IN_DOOR)) {
                    return new OpenContent((byte) 4, OpenContent.SUB_SPORT_INDOOR);
                }
                return null;
            case -1352716943:
                if (intent.equals(CustomSkillIntentKt.INTENT_ALIPAY)) {
                    return new OpenContent((byte) 0);
                }
                return null;
            case -1188574446:
                if (intent.equals(CustomSkillIntentKt.INTENT_STOPWATCH)) {
                    return new OpenContent((byte) 10);
                }
                return null;
            case -659300434:
                if (intent.equals(CustomSkillIntentKt.INTENT_WALKING)) {
                    return new OpenContent((byte) 4, OpenContent.SUB_SPORT_WALK);
                }
                return null;
            case -550687144:
                if (intent.equals(CustomSkillIntentKt.INTENT_CYCLING)) {
                    return new OpenContent((byte) 4, OpenContent.SUB_SPORT_RIDE);
                }
                return null;
            case -240081106:
                if (intent.equals(CustomSkillIntentKt.INTENT_FIND_DEVICE)) {
                    return new OpenContent((byte) 12);
                }
                return null;
            case -219704108:
                if (intent.equals(CustomSkillIntentKt.INTENT_HEART_RATE)) {
                    return new OpenContent((byte) 3);
                }
                return null;
            case -72737103:
                if (intent.equals(CustomSkillIntentKt.INTENT_RUN_OUT_DOOR)) {
                    return new OpenContent((byte) 4, OpenContent.SUB_SPORT_OUTDOOR);
                }
                return null;
            case 41488702:
                if (intent.equals(CustomSkillIntentKt.INTENT_SMART_DND)) {
                    OpenContent openContent = new OpenContent((byte) 7);
                    openContent.setParam(new OpenContent.DndContent((byte) 2));
                    return openContent;
                }
                return null;
            case 133268601:
                if (intent.equals(CustomSkillIntentKt.INTENT_FACE_SETTING)) {
                    return new OpenContent((byte) 14);
                }
                return null;
            case 177164742:
                if (intent.equals(CustomSkillIntentKt.INTENT_NOTIFICATION)) {
                    return new OpenContent((byte) 6);
                }
                return null;
            case 621535048:
                if (intent.equals(CustomSkillIntentKt.INTENT_POLL_SWIM)) {
                    return new OpenContent((byte) 4, OpenContent.SUB_SPORT_SWIM_POOL);
                }
                return null;
            case 1041782728:
                if (intent.equals(CustomSkillIntentKt.INTENT_MUSIC_CONTROL)) {
                    return new OpenContent((byte) 9);
                }
                return null;
            case 1209493229:
                if (intent.equals(CustomSkillIntentKt.INTENT_CARD_PACK)) {
                    return new OpenContent((byte) 1);
                }
                return null;
            case 1276119258:
                if (intent.equals("training")) {
                    return new OpenContent((byte) 4, OpenContent.SUB_SPORT_EXERCISE);
                }
                return null;
            case 1410719847:
                if (intent.equals(CustomSkillIntentKt.INTENT_ACTIVITY_STATUS)) {
                    return new OpenContent((byte) 2);
                }
                return null;
            default:
                return null;
        }
    }

    private final boolean b(InstructionPayload payload) {
        ChatContent chatContent = new ChatContent();
        chatContent.setAnswer(((CustomDirective.ExecuteDeviceSkill) payload).getDirective().get("reply").get("text").asText());
        this.baseDevice.sendSpeechInfoSync(new HMSpeechInfo(this.deviceSpeechID.getId(), SpeechType.CHAT, chatContent));
        return true;
    }

    private final void c(SpeechContent speechContent) {
        HMSpeechInfo hMSpeechInfo;
        if (speechContent instanceof OpenContent) {
            hMSpeechInfo = new HMSpeechInfo(this.deviceSpeechID.getId(), SpeechType.OPEN, speechContent);
        } else {
            if (!(speechContent instanceof ChatContent)) {
                throw new RuntimeException("未处理的speech content");
            }
            hMSpeechInfo = new HMSpeechInfo(this.deviceSpeechID.getId(), SpeechType.CHAT, speechContent);
        }
        this.baseDevice.sendSpeechInfoSync(hMSpeechInfo);
    }

    @Override // com.huami.ai.skill.CustomSkill
    public boolean exeCustomSkill(@NotNull String intent, @NotNull InstructionPayload payload) {
        SpeechContent speechContentA = a(intent);
        if (speechContentA != null) {
            c(speechContentA);
            return true;
        }
        int iHashCode = intent.hashCode();
        if (iHashCode != -1501990932) {
            if (iHashCode != -974955688) {
                if (iHashCode == 738429010 && intent.equals(CustomSkillIntentKt.INTENT_BATTERY)) {
                    this.batterySkill.queryBatteryInfo(this.baseDevice.batteryInfo());
                    return true;
                }
            } else if (intent.equals(CustomSkillIntentKt.INTENT_STOP_FIND_DEVICE)) {
                return b(payload);
            }
        } else if (intent.equals(CustomSkillIntentKt.INTENT_OPEN_BRIGHTNESS)) {
            this.setBrightnessSkill.openBrightnessPage();
            return true;
        }
        return false;
    }
}
