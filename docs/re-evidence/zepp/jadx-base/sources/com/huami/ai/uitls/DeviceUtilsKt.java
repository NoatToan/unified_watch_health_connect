package com.huami.ai.uitls;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huami.bluetooth.profile.channel.module.voice.AiVoiceModule;
import com.huami.bluetooth.profile.channel.module.voice.LanguageSetting;
import com.huami.bluetooth.profile.channel.module.voice.VoiceModule;
import com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u001a*\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u001a2\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\f\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "command", "Lkotlin/Function1;", "", "", "result", "", "sendCommand", "sendCommandSync", "isSyncing", "a", "Lcom/huami/bluetooth/profile/channel/module/voice/LanguageSetting;", "deviceAlexaLanguageSettings", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "setDeviceAlexaLanguage", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceModule;", "getVoiceModuleByFeature", "speech-skill_release"}, k = 2, mv = {1, 5, 1})
public final class DeviceUtilsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Send command.But device disconnect or deviceInfo null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    private static final boolean a(HMBaseDevice hMBaseDevice, boolean z, VoiceCommand voiceCommand, Function1<? super Integer, Unit> function1) {
        VoiceModule voiceModuleByFeature = getVoiceModuleByFeature(hMBaseDevice);
        if (voiceModuleByFeature == null) {
            return false;
        }
        if (z) {
            voiceModuleByFeature.sendCommandSync(voiceCommand, function1);
            return true;
        }
        voiceModuleByFeature.sendCommand(voiceCommand, function1);
        return true;
    }

    public static /* synthetic */ boolean b(HMBaseDevice hMBaseDevice, boolean z, VoiceCommand voiceCommand, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = b.a;
        }
        return a(hMBaseDevice, z, voiceCommand, function1);
    }

    @Nullable
    public static final Object deviceAlexaLanguageSettings(@NotNull HMBaseDevice hMBaseDevice, @NotNull Continuation<? super LanguageSetting> continuation) {
        VoiceModule voiceModuleByFeature = getVoiceModuleByFeature(hMBaseDevice);
        if (voiceModuleByFeature == null) {
            return null;
        }
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        voiceModuleByFeature.getLanguageSetting(new HMCallback<LanguageSetting>() { // from class: com.huami.ai.uitls.DeviceUtilsKt$deviceAlexaLanguageSettings$2$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(@Nullable LanguageSetting t) {
                super.onFinish(t);
                Continuation<LanguageSetting> continuation2 = safeContinuation;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(t));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Nullable
    public static final VoiceModule getVoiceModuleByFeature(@NotNull HMBaseDevice hMBaseDevice) {
        if (hMBaseDevice.isConnected() && hMBaseDevice.getDeviceInfo() != null) {
            return hMBaseDevice.getDeviceInfo().getDeviceFeature().hasSw(17) ? (VoiceModule) hMBaseDevice.getChannelModule(AiVoiceModule.class) : (VoiceModule) hMBaseDevice.getChannelModule(VoiceModule.class);
        }
        HMLog.warn$default("speech", null, a.a, 2, null);
        return null;
    }

    public static final boolean sendCommand(@NotNull HMBaseDevice hMBaseDevice, @NotNull VoiceCommand voiceCommand, @Nullable Function1<? super Integer, Unit> function1) {
        return function1 == null ? b(hMBaseDevice, false, voiceCommand, null, 4, null) : a(hMBaseDevice, false, voiceCommand, function1);
    }

    public static /* synthetic */ boolean sendCommand$default(HMBaseDevice hMBaseDevice, VoiceCommand voiceCommand, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return sendCommand(hMBaseDevice, voiceCommand, function1);
    }

    public static final boolean sendCommandSync(@NotNull HMBaseDevice hMBaseDevice, @NotNull VoiceCommand voiceCommand, @Nullable Function1<? super Integer, Unit> function1) {
        return function1 == null ? b(hMBaseDevice, true, voiceCommand, null, 4, null) : a(hMBaseDevice, true, voiceCommand, function1);
    }

    public static /* synthetic */ boolean sendCommandSync$default(HMBaseDevice hMBaseDevice, VoiceCommand voiceCommand, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return sendCommandSync(hMBaseDevice, voiceCommand, function1);
    }

    @Nullable
    public static final Object setDeviceAlexaLanguage(@NotNull HMBaseDevice hMBaseDevice, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        VoiceModule voiceModuleByFeature = getVoiceModuleByFeature(hMBaseDevice);
        if (voiceModuleByFeature == null) {
            return Boxing.boxBoolean(false);
        }
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        voiceModuleByFeature.setLanguageSetting(new LanguageSetting(str, null, 2, null), new HMCallback<Integer>() { // from class: com.huami.ai.uitls.DeviceUtilsKt$setDeviceAlexaLanguage$2$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(@Nullable Integer t) {
                super.onFinish(t);
                Continuation<Boolean> continuation2 = safeContinuation;
                Boolean boolValueOf = Boolean.valueOf(t != null && t.intValue() == 1);
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(boolValueOf));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
