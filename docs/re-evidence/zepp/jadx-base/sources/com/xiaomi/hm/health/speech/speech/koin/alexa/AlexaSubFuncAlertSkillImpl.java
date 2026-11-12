package com.xiaomi.hm.health.speech.speech.koin.alexa;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.koin.common.NewBleAlertSkillImpl;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.command.TTSTextCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\b\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\r\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u0013\u0010\u0011\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\tJ\u0013\u0010\u0013\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ#\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\tJ\u0013\u0010\u0015\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0013\u0010\u0016\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bR\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/speech/speech/koin/alexa/AlexaSubFuncAlertSkillImpl;", "Lcom/huami/ai/koin/common/NewBleAlertSkillImpl;", "", "text", "", "r", "", "token", "closeAlarm", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAlarm", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openAlarm", "deleteAlarm", "closeReminder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryReminder", "openReminder", "deleteReminder", "openTimer", "deleteTimer", "closeTimer", "queryTimer", "Landroid/content/Context;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "e", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlexaSubFuncAlertSkillImpl extends NewBleAlertSkillImpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig voiceConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "do Alarm and Reminder tips";
        }
    }

    public AlexaSubFuncAlertSkillImpl(@NotNull Context context, @NotNull HMBaseDevice hMBaseDevice, @NotNull VoiceConfig voiceConfig) {
        super(hMBaseDevice, voiceConfig);
        this.context = context;
        this.baseDevice = hMBaseDevice;
        this.voiceConfig = voiceConfig;
    }

    private final boolean r(String text) {
        LogcatKt.debug$default(Logcat.INSTANCE, null, a.a, 1, null);
        return DeviceUtilsKt.sendCommand$default(this.baseDevice, new TTSTextCommand(text), null, 2, null);
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object closeAlarm(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return this.voiceConfig.getVersion() < 3 ? openAlarm(continuation) : super.closeAlarm(list, continuation);
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object closeReminder(@Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(r(this.context.getString(R.string.xiaoai_alarm_process)));
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object closeTimer(@NotNull Continuation<? super Boolean> continuation) {
        return openTimer(continuation);
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object deleteAlarm(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return VoiceConfigFuncKt.supportDeleteAlert(this.voiceConfig) ? super.deleteAlarm(list, continuation) : Boxing.boxBoolean(r(this.context.getString(R.string.xiaoai_alarm_process)));
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object deleteReminder(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return (!VoiceConfigFuncKt.supportDeleteAlert(this.voiceConfig) || this.voiceConfig.getVersion() < 3) ? Boxing.boxBoolean(r(this.context.getString(R.string.xiaoai_alarm_process))) : super.deleteReminder(list, continuation);
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object deleteTimer(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return (!VoiceConfigFuncKt.supportDeleteAlert(this.voiceConfig) || this.voiceConfig.getVersion() < 3) ? openTimer(continuation) : super.deleteTimer(list, continuation);
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object openAlarm(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(16, null, 2, null)), null, 2, null));
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object openReminder(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(r(this.context.getString(R.string.xiaoai_alarm_process)));
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object openTimer(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(11, new OpenAppContent.CountdownParameter(0, Boxing.boxInt(0), Boxing.boxInt(0), Boxing.boxInt(0)))), null, 2, null));
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object queryAlarm(@NotNull Continuation<? super Boolean> continuation) {
        return openAlarm(continuation);
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object queryReminder(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(r(this.context.getString(R.string.xiaoai_alarm_process)));
    }

    @Override // com.huami.ai.koin.common.NewBleAlertSkillImpl, com.huami.ai.skill.AlertSkill
    @Nullable
    public Object queryTimer(@NotNull Continuation<? super Boolean> continuation) {
        return openTimer(continuation);
    }
}
