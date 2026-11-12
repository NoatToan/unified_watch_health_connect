package com.xiaomi.fitness.aivs.huami;

import android.os.Handler;
import android.text.TextUtils;
import com.miui.tsmclient.util.ServiceUtils;
import com.xiaomi.accountsdk.account.config.SystemAdStatus;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.android.track.TraceConstants;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Alerts;
import com.xiaomi.ai.api.BrightnessController;
import com.xiaomi.ai.api.CustomDirective;
import com.xiaomi.ai.api.Launcher;
import com.xiaomi.ai.api.NFC;
import com.xiaomi.ai.api.Speaker;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.Sys;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.UIController;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager;
import com.xiaomi.fitness.aivs.util.AivsLog;
import com.xiaomi.fitness.aivs.util.AivsMusicControl;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.hm.health.bt.sdk.voice.Image;
import com.xiaomi.hm.health.bt.sdk.voice.ImageSource;
import com.xiaomi.hm.health.bt.sdk.voice.QuietMode;
import com.xiaomi.hm.health.bt.sdk.voice.WeatherItem;
import defpackage.pzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\u0014\u0010\u0015\u001a\u00020\u00162\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u001a\u0010\u0017\u001a\u00020\u00132\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0019H\u0002J\u0014\u0010\u001a\u001a\u00020\u00162\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u0014\u0010\u001d\u001a\u00020\u00162\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u001a\u0010\u001f\u001a\u00020\u00162\u0010\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0002J\u0014\u0010!\u001a\u00020\u00162\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0011H\u0002J\u0014\u0010$\u001a\u00020\u00162\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u0014\u0010%\u001a\u00020\u00162\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u0014\u0010&\u001a\u00020\u00162\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\b\u0010'\u001a\u0004\u0018\u00010(J\u0006\u0010)\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/aivs/huami/HuamiInstructionCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "handler", "Landroid/os/Handler;", "aivsService", "Lcom/xiaomi/fitness/aivs/huami/HuamiAivsService;", "<init>", "(Landroid/os/Handler;Lcom/xiaomi/fitness/aivs/huami/HuamiAivsService;)V", "getHandler", "()Landroid/os/Handler;", "getAivsService", "()Lcom/xiaomi/fitness/aivs/huami/HuamiAivsService;", "mInstructions", "", "Lcom/xiaomi/ai/api/common/Instruction;", "aiToastMap", "", "", ServiceUtils.EXTRA_PROCESS, "", "instruction", "processDialogFinish", "", "shouldClearTTS", "instructions", "", "processSpeechRecognizer", "sendUnsupport", "stopAudioInput", "sendAivsInstruction", "getIsSupportMedia", "sendAivsInstructions", "aivsInstructionList", "processSpeaker", "sendVoiceCaption", "text", "sendDeliverAlertInstruction", "sendSetAlertInstruction", "sendWeatherInstruction", "getHuamiDevice", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "clearInstructions", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuamiInstructionCapabilityImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiInstructionCapabilityImpl.kt\ncom/xiaomi/fitness/aivs/huami/HuamiInstructionCapabilityImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,602:1\n1567#2:603\n1598#2,4:604\n2669#2,7:608\n*S KotlinDebug\n*F\n+ 1 HuamiInstructionCapabilityImpl.kt\ncom/xiaomi/fitness/aivs/huami/HuamiInstructionCapabilityImpl\n*L\n284#1:603\n284#1:604,4\n291#1:608,7\n*E\n"})
public final class HuamiInstructionCapabilityImpl extends InstructionCapability {

    @NotNull
    private final Map<String, Instruction<?>> aiToastMap;

    @NotNull
    private final HuamiAivsService aivsService;

    @NotNull
    private final Handler handler;

    @NotNull
    private final List<Instruction<?>> mInstructions;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UIController.NavigateOp.values().length];
            try {
                iArr[UIController.NavigateOp.EXIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIController.NavigateOp.HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UIController.NavigateOp.BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Sys.PowerOp.values().length];
            try {
                iArr2[Sys.PowerOp.REBOOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Sys.PowerOp.SHUTDOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public HuamiInstructionCapabilityImpl(@NotNull Handler handler, @NotNull HuamiAivsService aivsService) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(aivsService, "aivsService");
        this.handler = handler;
        this.aivsService = aivsService;
        this.mInstructions = new ArrayList();
        this.aiToastMap = new LinkedHashMap();
    }

    private final boolean getIsSupportMedia() {
        return true;
    }

    private final void processDialogFinish(Instruction<?> instruction) {
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager;
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager2 = this.aivsService.getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager2 == null || !mSpeechRecognizerManager2.hasSession()) {
            this.mInstructions.clear();
            return;
        }
        this.mInstructions.add(instruction);
        int size = this.mInstructions.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(this.mInstructions.get(i).getFullName(), AIApiConstants.SpeechRecognizer.ExpectSpeech)) {
                z = true;
            }
        }
        if (shouldClearTTS(this.mInstructions)) {
            Iterator<Instruction<?>> it = this.mInstructions.iterator();
            while (it.hasNext()) {
                Instruction<?> next = it.next();
                if (Intrinsics.areEqual(next.getFullName(), AIApiConstants.Template.Toast) || Intrinsics.areEqual(next.getFullName(), AIApiConstants.Template.General)) {
                    it.remove();
                }
            }
        }
        sendAivsInstructions(this.mInstructions);
        this.mInstructions.clear();
        if (z || (mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager()) == null) {
            return;
        }
        mSpeechRecognizerManager.dialogFinish();
    }

    private final void processSpeaker(Instruction<?> instruction) {
        boolean isSupportMedia = getIsSupportMedia();
        String fullName = instruction.getFullName();
        if (Intrinsics.areEqual(fullName, AIApiConstants.Speaker.AdjustVolume)) {
            Object payload = instruction.getPayload();
            Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Speaker.AdjustVolume");
            Speaker.AdjustVolume adjustVolume = (Speaker.AdjustVolume) payload;
            if (isSupportMedia) {
                Logger.d(BaseAivsService.TAG, "AdjustVolume mediaErrorType:" + AivsMusicControl.INSTANCE.onAivsAdjustVolume(adjustVolume.getVolumeDelta() >= 0));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(fullName, AIApiConstants.Speaker.SetVolume)) {
            Object payload2 = instruction.getPayload();
            Intrinsics.checkNotNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Speaker.SetVolume");
            Speaker.SetVolume setVolume = (Speaker.SetVolume) payload2;
            if (isSupportMedia) {
                Logger.d(BaseAivsService.TAG, "AdjustVolume mediaErrorType:" + AivsMusicControl.INSTANCE.onAivsSetVolume(setVolume.getVolume(), setVolume.getUnit() == Speaker.UnitDef.PERCENT));
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void processSpeechRecognizer(Instruction<?> instruction) {
        String fullName = instruction.getFullName();
        if (fullName != null) {
            int iHashCode = fullName.hashCode();
            if (iHashCode != 1327948931) {
                if (iHashCode != 1631722339) {
                    if (iHashCode == 1963775772 && fullName.equals(AIApiConstants.SpeechRecognizer.StopCapture)) {
                        this.handler.obtainMessage(1).sendToTarget();
                        sendAivsInstruction(instruction);
                        return;
                    }
                } else if (fullName.equals(AIApiConstants.SpeechRecognizer.ExpectSpeech)) {
                    this.mInstructions.add(instruction);
                    Object payload = instruction.getPayload();
                    Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechRecognizer.ExpectSpeech");
                    SpeechRecognizer.ExpectSpeech expectSpeech = (SpeechRecognizer.ExpectSpeech) payload;
                    BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager();
                    if (mSpeechRecognizerManager != null) {
                        mSpeechRecognizerManager.startExpectSpeech(expectSpeech.getPostBack().c() ? expectSpeech.getPostBack().b() : null);
                        return;
                    }
                    return;
                }
            } else if (fullName.equals(AIApiConstants.SpeechRecognizer.RecognizeResult)) {
                Object payload2 = instruction.getPayload();
                Intrinsics.checkNotNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechRecognizer.RecognizeResult");
                SpeechRecognizer.RecognizeResult recognizeResult = (SpeechRecognizer.RecognizeResult) payload2;
                List<SpeechRecognizer.RecognizeResultItem> results = recognizeResult.getResults();
                Logger.d(BaseAivsService.TAG, "RecognizeResult isFinal:" + recognizeResult.isFinal());
                String str = "";
                if (results != null) {
                    for (SpeechRecognizer.RecognizeResultItem recognizeResultItem : results) {
                        String text = recognizeResultItem.getText();
                        Logger.d(BaseAivsService.TAG, "RecognizeResultL:" + recognizeResultItem.getText());
                        str = text;
                    }
                }
                if (recognizeResult.isFinal()) {
                    this.handler.obtainMessage(1).sendToTarget();
                    this.aivsService.doAsrFinalTrace(results.size() > 0 ? results.get(0) : null, str);
                } else {
                    this.aivsService.doAsrFirstTrace(str);
                }
                sendAivsInstruction(instruction);
                return;
            }
        }
        Logger.d(BaseAivsService.TAG, "processSpeechRecognizer: unhandled name:" + fullName);
    }

    private final void sendAivsInstruction(Instruction<?> instruction) {
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager == null || !mSpeechRecognizerManager.hasSession()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(instruction);
        sendAivsInstructions(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:344:0x03c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0675 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void sendAivsInstructions(List<Instruction<?>> aivsInstructionList) {
        HuamiApiCaller huamiDevice;
        HuamiApiCaller huamiDevice2;
        HuamiApiCaller huamiDevice3;
        HuamiApiCaller huamiDevice4;
        HuamiApiCaller huamiDevice5;
        HuamiApiCaller huamiDevice6;
        int i;
        HuamiApiCaller huamiDevice7;
        HuamiApiCaller huamiDevice8;
        Object payload;
        HuamiApiCaller huamiDevice9;
        HuamiApiCaller huamiDevice10;
        HuamiApiCaller huamiDevice11;
        HuamiApiCaller huamiDevice12;
        HuamiApiCaller huamiDevice13;
        Logger.i(BaseAivsService.TAG, "sendAivsInstructions:instructionSize = " + aivsInstructionList.size());
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager();
        if ((mSpeechRecognizerManager == null || mSpeechRecognizerManager.hasSession()) && getHuamiDevice() != null) {
            for (Instruction<?> instruction : aivsInstructionList) {
                AivsLog aivsLog = AivsLog.INSTANCE;
                String fullName = instruction.getFullName();
                Intrinsics.checkNotNullExpressionValue(fullName, "getFullName(...)");
                aivsLog.log(instruction, fullName);
                String fullName2 = instruction.getFullName();
                if (fullName2 != null) {
                    int i2 = 0;
                    switch (fullName2.hashCode()) {
                        case -2108961186:
                            if (fullName2.equals(AIApiConstants.Alerts.DeliverAlertIntention)) {
                                sendDeliverAlertInstruction(instruction);
                            }
                            break;
                        case -1954408854:
                            if (fullName2.equals(AIApiConstants.PlaybackController.Next) && (huamiDevice = getHuamiDevice()) != null) {
                                huamiDevice.sendVoiceMusicNext();
                            }
                            break;
                        case -1954343253:
                            if (fullName2.equals(AIApiConstants.PlaybackController.Play)) {
                                huamiDevice8 = getHuamiDevice();
                                if (huamiDevice8 != null) {
                                    huamiDevice8.sendVoiceMusicPlay();
                                }
                            }
                            break;
                        case -1954337366:
                            if (fullName2.equals(AIApiConstants.PlaybackController.Prev) && (huamiDevice2 = getHuamiDevice()) != null) {
                                huamiDevice2.sendVoiceMusicPREV();
                            }
                            break;
                        case -1836500200:
                            if (fullName2.equals(AIApiConstants.System.SetProperty)) {
                                Object payload2 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Sys.SetProperty");
                                Sys.SetProperty setProperty = (Sys.SetProperty) payload2;
                                if (Intrinsics.areEqual(setProperty.getName(), "QUIET_MODE")) {
                                    String value = setProperty.getValue();
                                    if (value != null) {
                                        int iHashCode = value.hashCode();
                                        if (iHashCode != -1836143820) {
                                            if (iHashCode != -81302455) {
                                                if (iHashCode != 2527) {
                                                    if (iHashCode == 78159 && value.equals(SystemAdStatus.SYSTEM_AD_OFF) && (huamiDevice3 = getHuamiDevice()) != null) {
                                                        huamiDevice3.sendVoiceQuietModeCommand(QuietMode.OFF);
                                                    }
                                                } else if (value.equals(SystemAdStatus.SYSTEM_AD_ON) && (huamiDevice4 = getHuamiDevice()) != null) {
                                                    huamiDevice4.sendVoiceQuietModeCommand(QuietMode.ON);
                                                }
                                            } else if (value.equals("NO_OPERATION") && (huamiDevice5 = getHuamiDevice()) != null) {
                                                huamiDevice5.sendVoiceQuietModeCommand(QuietMode.NO_OPERATION);
                                            }
                                        } else if (value.equals("SWITCH") && (huamiDevice6 = getHuamiDevice()) != null) {
                                            huamiDevice6.sendVoiceQuietModeCommand(QuietMode.SWITCH);
                                        }
                                    }
                                } else if (!Intrinsics.areEqual(setProperty.getName(), "MUTE_MODE")) {
                                    continue;
                                } else {
                                    if (!getIsSupportMedia()) {
                                        return;
                                    }
                                    String value2 = setProperty.getValue();
                                    if (value2 != null) {
                                        int iHashCode2 = value2.hashCode();
                                        if (iHashCode2 != -1836143820) {
                                            if (iHashCode2 != 2527) {
                                                if (iHashCode2 == 78159 && value2.equals(SystemAdStatus.SYSTEM_AD_OFF)) {
                                                    Logger.d(BaseAivsService.TAG, "mediaErrorType:" + AivsMusicControl.INSTANCE.onAivsSetMute(false));
                                                }
                                            } else if (value2.equals(SystemAdStatus.SYSTEM_AD_ON)) {
                                                Logger.d(BaseAivsService.TAG, "mediaErrorType:" + AivsMusicControl.INSTANCE.onAivsSetMute(true));
                                            }
                                        } else if (value2.equals("SWITCH")) {
                                            Logger.d(BaseAivsService.TAG, "mediaErrorType:" + AivsMusicControl.INSTANCE.onAivsSetMute(true));
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                            break;
                        case -1616270202:
                            if (fullName2.equals(AIApiConstants.System.Power)) {
                                Object payload3 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload3, "null cannot be cast to non-null type com.xiaomi.ai.api.Sys.Power");
                                Sys.Power power = (Sys.Power) payload3;
                                Logger.i(BaseAivsService.TAG, "System.Power.Operation " + power.getOperation());
                                Sys.PowerOp operation = power.getOperation();
                                i = operation != null ? WhenMappings.$EnumSwitchMapping$1[operation.ordinal()] : -1;
                                if (i == 1) {
                                    HuamiApiCaller huamiDevice14 = getHuamiDevice();
                                    if (huamiDevice14 != null) {
                                        huamiDevice14.sendVoiceRebootCommand();
                                    }
                                } else if (i == 2 && (huamiDevice7 = getHuamiDevice()) != null) {
                                    huamiDevice7.sendVoiceShutdownCommand();
                                }
                            }
                            break;
                        case -1603244712:
                            if (fullName2.equals(AIApiConstants.Speaker.AdjustVolume)) {
                                processSpeaker(instruction);
                            }
                            break;
                        case -1487063953:
                            if (fullName2.equals(AIApiConstants.UIController.Navigate)) {
                                Object payload4 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload4, "null cannot be cast to non-null type com.xiaomi.ai.api.UIController.Navigate");
                                UIController.Navigate navigate = (UIController.Navigate) payload4;
                                Logger.i("Navigate", String.valueOf(navigate.getOperation()));
                                UIController.NavigateOp operation2 = navigate.getOperation();
                                i = operation2 != null ? WhenMappings.$EnumSwitchMapping$0[operation2.ordinal()] : -1;
                                if (i == 1 || i == 2 || i == 3) {
                                    HuamiApiCaller huamiDevice15 = getHuamiDevice();
                                    if (huamiDevice15 != null) {
                                        huamiDevice15.sendVoiceNavigateToMainPageCommand();
                                    }
                                }
                            }
                            break;
                        case -1234733648:
                            if (fullName2.equals(AIApiConstants.PlaybackController.ContinuePlaying)) {
                                huamiDevice8 = getHuamiDevice();
                                if (huamiDevice8 != null) {
                                    huamiDevice8.sendVoiceMusicPlay();
                                }
                            }
                            break;
                        case -865793226:
                            if (fullName2.equals(AIApiConstants.CustomDirective.ExecuteDeviceSkill)) {
                                Object payload5 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload5, "null cannot be cast to non-null type com.xiaomi.ai.api.CustomDirective.ExecuteDeviceSkill");
                                CustomDirective.ExecuteDeviceSkill executeDeviceSkill = (CustomDirective.ExecuteDeviceSkill) payload5;
                                HuamiApiCaller huamiDevice16 = getHuamiDevice();
                                if (huamiDevice16 != null) {
                                    huamiDevice16.sendVoiceExeCustomSkillCommand(executeDeviceSkill.getDirective().w("intent").l());
                                }
                            }
                            break;
                        case -795955311:
                            if (fullName2.equals(AIApiConstants.Alerts.SetAlert)) {
                                sendSetAlertInstruction(instruction);
                            }
                            break;
                        case -554195084:
                            if (fullName2.equals(AIApiConstants.Template.General)) {
                                Object payload6 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload6, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.General");
                                String text = ((Template.General) payload6).getText();
                                if (this.aiToastMap.containsKey(instruction.getDialogId().toString())) {
                                    Instruction<?> instruction2 = this.aiToastMap.get(instruction.getDialogId().toString());
                                    payload = instruction2 != null ? instruction2.getPayload() : null;
                                    Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Toast");
                                    String text2 = ((Template.Toast) payload).getText();
                                    if (!TextUtils.isEmpty(text2) && !Intrinsics.areEqual(text2, text)) {
                                        text = text2 + text;
                                    }
                                }
                                Intrinsics.checkNotNull(text);
                                sendVoiceCaption(text);
                            }
                            break;
                        case -455407265:
                            if (fullName2.equals(AIApiConstants.PlaybackController.Pause) && (huamiDevice9 = getHuamiDevice()) != null) {
                                huamiDevice9.sendVoiceMusicPause();
                            }
                            break;
                        case -328103177:
                            if (fullName2.equals(AIApiConstants.WearableController.ControlDeviceState)) {
                                huamiDevice13 = getHuamiDevice();
                                if (huamiDevice13 != null) {
                                    huamiDevice13.sendVoiceWearableCommand(instruction.toString());
                                }
                            }
                            break;
                        case 67886326:
                            if (fullName2.equals(AIApiConstants.Template.PlayInfo)) {
                                Object payload7 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload7, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.PlayInfo");
                                Template.PlayInfo playInfo = (Template.PlayInfo) payload7;
                                if (playInfo.getItems().size() > 0) {
                                    Template.PlayInfoItem playInfoItem = playInfo.getItems().get(0);
                                    sendVoiceCaption(StringsKt__IndentKt.trimIndent("\n                            " + playInfoItem.getTitle().getMainTitle() + "\n                            " + playInfoItem.getTitle().getSubTitle() + "\n                            " + (playInfoItem.getText().c() ? playInfoItem.getText().b() : "") + "\n                            "));
                                }
                            }
                            break;
                        case 274747385:
                            if (fullName2.equals(AIApiConstants.Dialog.Finish) && instruction.getDialogId().c() && !TextUtils.isEmpty(instruction.getDialogId().toString())) {
                                this.aiToastMap.clear();
                            }
                            break;
                        case 304115208:
                            if (fullName2.equals(AIApiConstants.Template.DeviceList)) {
                                Object payload8 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload8, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.DeviceList");
                                List<Template.DeviceItem> items = ((Template.DeviceList) payload8).getItems();
                                Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
                                List<Template.DeviceItem> list = items;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                for (Object obj : list) {
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    }
                                    Template.DeviceItem deviceItem = (Template.DeviceItem) obj;
                                    String str = i3 + "." + deviceItem.getTitle().getMainTitle();
                                    String subTitle = deviceItem.getTitle().getSubTitle();
                                    if (subTitle != null && subTitle.length() != 0) {
                                        str = str + "\n" + deviceItem.getTitle().getSubTitle();
                                    }
                                    arrayList.add(str);
                                    i2 = i3;
                                }
                                Iterator it = arrayList.iterator();
                                if (!it.hasNext()) {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                                Object next = it.next();
                                while (it.hasNext()) {
                                    next = ((String) next) + "\n" + ((String) it.next());
                                }
                                String str2 = (String) next;
                                if (this.aiToastMap.containsKey(instruction.getDialogId().toString())) {
                                    Instruction<?> instruction3 = this.aiToastMap.get(instruction.getDialogId().toString());
                                    payload = instruction3 != null ? instruction3.getPayload() : null;
                                    Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Toast");
                                    String text3 = ((Template.Toast) payload).getText();
                                    if (!TextUtils.isEmpty(text3) && !Intrinsics.areEqual(text3, str2)) {
                                        str2 = text3 + str2;
                                    }
                                }
                                sendVoiceCaption(str2);
                            } else {
                                continue;
                            }
                            break;
                        case 307164744:
                            if (fullName2.equals(AIApiConstants.WearableController.PropertyResults)) {
                                huamiDevice13 = getHuamiDevice();
                                if (huamiDevice13 != null) {
                                    huamiDevice13.sendVoiceWearableCommand(instruction.toString());
                                }
                            }
                            break;
                        case 574842803:
                            if (fullName2.equals(AIApiConstants.Template.Toast)) {
                                Object payload9 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload9, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Toast");
                                String text4 = ((Template.Toast) payload9).getText();
                                Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                                sendVoiceCaption(text4);
                            }
                            break;
                        case 749393536:
                            if (fullName2.equals(AIApiConstants.Template.Weather)) {
                                sendWeatherInstruction(instruction);
                            }
                            break;
                        case 1002051676:
                            if (fullName2.equals(AIApiConstants.WearableController.Execute)) {
                                huamiDevice13 = getHuamiDevice();
                                if (huamiDevice13 != null) {
                                    huamiDevice13.sendVoiceWearableCommand(instruction.toString());
                                }
                            }
                            break;
                        case 1029794369:
                            if (fullName2.equals(AIApiConstants.BrightnessController.AdjustBrightness)) {
                                Object payload10 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload10, "null cannot be cast to non-null type com.xiaomi.ai.api.BrightnessController.AdjustBrightness");
                                BrightnessController.AdjustBrightness adjustBrightness = (BrightnessController.AdjustBrightness) payload10;
                                HuamiApiCaller huamiDevice17 = getHuamiDevice();
                                if (huamiDevice17 != null) {
                                    huamiDevice17.sendVoiceDeltaBrightnessCommand(adjustBrightness.getBrightnessDelta());
                                }
                            }
                            break;
                        case 1080131871:
                            if (fullName2.equals(AIApiConstants.NFC.TurnOn)) {
                                Object payload11 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload11, "null cannot be cast to non-null type com.xiaomi.ai.api.NFC.TurnOn");
                                NFC.TurnOn turnOn = (NFC.TurnOn) payload11;
                                HuamiApiCaller huamiDevice18 = getHuamiDevice();
                                if (huamiDevice18 != null) {
                                    huamiDevice18.sendVoiceNfcCommand(turnOn.getCard().getId());
                                }
                            }
                            break;
                        case 1125080429:
                            if (fullName2.equals(AIApiConstants.WearableController.Switch)) {
                                huamiDevice13 = getHuamiDevice();
                                if (huamiDevice13 != null) {
                                    huamiDevice13.sendVoiceWearableCommand(instruction.toString());
                                }
                            }
                            break;
                        case 1327948931:
                            if (fullName2.equals(AIApiConstants.SpeechRecognizer.RecognizeResult)) {
                                Object payload12 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload12, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechRecognizer.RecognizeResult");
                                SpeechRecognizer.RecognizeResult recognizeResult = (SpeechRecognizer.RecognizeResult) payload12;
                                for (SpeechRecognizer.RecognizeResultItem recognizeResultItem : recognizeResult.getResults()) {
                                    if (!TextUtils.isEmpty(recognizeResultItem.getText())) {
                                        String text5 = recognizeResultItem.getText();
                                        if (text5.length() > 50) {
                                            Intrinsics.checkNotNull(text5);
                                            text5 = text5.substring(0, 50);
                                            Intrinsics.checkNotNullExpressionValue(text5, "substring(...)");
                                        }
                                        HuamiApiCaller huamiDevice19 = getHuamiDevice();
                                        if (huamiDevice19 != null) {
                                            huamiDevice19.sendVoiceQuerySpeechText(text5, recognizeResult.isFinal());
                                        }
                                    } else if (recognizeResult.isFinal() && (huamiDevice10 = getHuamiDevice()) != null) {
                                        huamiDevice10.sendVoiceAsrNoContent();
                                    }
                                }
                            }
                            break;
                        case 1388751090:
                            if (fullName2.equals(AIApiConstants.BrightnessController.SetBrightness)) {
                                Object payload13 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload13, "null cannot be cast to non-null type com.xiaomi.ai.api.BrightnessController.SetBrightness");
                                BrightnessController.SetBrightness setBrightness = (BrightnessController.SetBrightness) payload13;
                                HuamiApiCaller huamiDevice20 = getHuamiDevice();
                                if (huamiDevice20 != null) {
                                    huamiDevice20.sendVoicePercentBrightnessCommand(setBrightness.getBrightness());
                                }
                            }
                            break;
                        case 1631722339:
                            if (fullName2.equals(AIApiConstants.SpeechRecognizer.ExpectSpeech) && (huamiDevice11 = getHuamiDevice()) != null) {
                                huamiDevice11.continueVoiceCommand();
                            }
                            break;
                        case 1760728224:
                            if (fullName2.equals(AIApiConstants.Launcher.LaunchApp)) {
                                Object payload14 = instruction.getPayload();
                                Intrinsics.checkNotNull(payload14, "null cannot be cast to non-null type com.xiaomi.ai.api.Launcher.LaunchApp");
                                if (Intrinsics.areEqual(((Launcher.LaunchApp) payload14).getIntent().b().getPkgName(), "watch.findphone") && (huamiDevice12 = getHuamiDevice()) != null) {
                                    huamiDevice12.sendVoiceFindPhoneCommand();
                                }
                            }
                            break;
                        case 1808506541:
                            if (fullName2.equals(AIApiConstants.Speaker.SetVolume)) {
                                processSpeaker(instruction);
                            }
                            break;
                        case 1867583617:
                            if (fullName2.equals(AIApiConstants.WearableController.CheckStatus)) {
                                huamiDevice13 = getHuamiDevice();
                                if (huamiDevice13 != null) {
                                    huamiDevice13.sendVoiceWearableCommand(instruction.toString());
                                }
                            }
                            break;
                        case 1963775772:
                            if (fullName2.equals(AIApiConstants.SpeechRecognizer.StopCapture)) {
                                stopAudioInput();
                            }
                            break;
                        case 2095632830:
                            if (fullName2.equals(AIApiConstants.WearableController.SetProperty)) {
                                huamiDevice13 = getHuamiDevice();
                                if (huamiDevice13 != null) {
                                    huamiDevice13.sendVoiceWearableCommand(instruction.toString());
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                }
            }
        }
    }

    private final void sendDeliverAlertInstruction(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.DeliverAlertIntention");
        Alerts.DeliverAlertIntention deliverAlertIntention = (Alerts.DeliverAlertIntention) payload;
        int id = deliverAlertIntention.getType().getId();
        int id2 = deliverAlertIntention.getOperation().getId();
        if (id == Alerts.AlertType.ALARM.getId()) {
            if (id2 == Alerts.AlertOperation.QUERY.getId()) {
                HuamiApiCaller huamiDevice = getHuamiDevice();
                if (huamiDevice != null) {
                    huamiDevice.sendVoiceQueryAlarmCommand();
                    return;
                }
                return;
            }
            if (id2 == Alerts.AlertOperation.CLOSE.getId()) {
                HuamiApiCaller huamiDevice2 = getHuamiDevice();
                if (huamiDevice2 != null) {
                    huamiDevice2.sendVoiceCloseAlarmCommand();
                    return;
                }
                return;
            }
            if (id2 == Alerts.AlertOperation.OPEN.getId()) {
                HuamiApiCaller huamiDevice3 = getHuamiDevice();
                if (huamiDevice3 != null) {
                    huamiDevice3.sendVoiceOpenAlarmCommand();
                    return;
                }
                return;
            }
            HuamiApiCaller huamiDevice4 = getHuamiDevice();
            if (huamiDevice4 != null) {
                huamiDevice4.sendVoiceDeleteAlarmCommand(AppUtil.getApp().getString(pzi.f30936a));
                return;
            }
            return;
        }
        if (id != Alerts.AlertType.REMINDER.getId()) {
            if (id == Alerts.AlertType.TIMER.getId()) {
                if (id2 == Alerts.AlertOperation.DELETE.getId()) {
                    HuamiApiCaller huamiDevice5 = getHuamiDevice();
                    if (huamiDevice5 != null) {
                        huamiDevice5.sendVoiceDeleteTimerCommand();
                        return;
                    }
                    return;
                }
                HuamiApiCaller huamiDevice6 = getHuamiDevice();
                if (huamiDevice6 != null) {
                    huamiDevice6.sendVoiceOpenTimerCommand();
                    return;
                }
                return;
            }
            return;
        }
        if (id2 == Alerts.AlertOperation.QUERY.getId()) {
            HuamiApiCaller huamiDevice7 = getHuamiDevice();
            if (huamiDevice7 != null) {
                huamiDevice7.sendVoiceQueryReminderCommand(AppUtil.getApp().getString(pzi.f30936a));
                return;
            }
            return;
        }
        if (id2 == Alerts.AlertOperation.DELETE.getId()) {
            HuamiApiCaller huamiDevice8 = getHuamiDevice();
            if (huamiDevice8 != null) {
                huamiDevice8.sendVoiceDeleteReminderCommand(AppUtil.getApp().getString(pzi.f30936a));
                return;
            }
            return;
        }
        if (id2 == Alerts.AlertOperation.CLOSE.getId()) {
            HuamiApiCaller huamiDevice9 = getHuamiDevice();
            if (huamiDevice9 != null) {
                huamiDevice9.sendVoiceCloseReminderCommand(AppUtil.getApp().getString(pzi.f30936a));
                return;
            }
            return;
        }
        HuamiApiCaller huamiDevice10 = getHuamiDevice();
        if (huamiDevice10 != null) {
            huamiDevice10.sendVoiceOpenReminderCommand(AppUtil.getApp().getString(pzi.f30936a));
        }
    }

    private final void sendSetAlertInstruction(Instruction<?> instruction) {
        HuamiApiCaller huamiDevice;
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.SetAlert");
        Alerts.SetAlert setAlert = (Alerts.SetAlert) payload;
        int id = setAlert.getType().getId();
        String id2 = setAlert.getId();
        String datetime = setAlert.getDatetime();
        String strB = setAlert.getCircleExtra().c() ? setAlert.getCircleExtra().b() : "";
        int id3 = setAlert.getCircle().c() ? setAlert.getCircle().b().getId() : -1;
        String strB2 = setAlert.getEvent().c() ? setAlert.getEvent().b() : "";
        String strB3 = setAlert.getOffset().c() ? setAlert.getOffset().b() : "";
        if (id == Alerts.AlertType.ALARM.getId()) {
            HuamiApiCaller huamiDevice2 = getHuamiDevice();
            if (huamiDevice2 != null) {
                huamiDevice2.sendVoiceSetAlarmCommand(id2, datetime, strB, id3);
                return;
            }
            return;
        }
        if (id == Alerts.AlertType.REMINDER.getId()) {
            HuamiApiCaller huamiDevice3 = getHuamiDevice();
            if (huamiDevice3 != null) {
                huamiDevice3.sendVoiceSetReminderCommand(id2, datetime, strB, strB2, id3);
                return;
            }
            return;
        }
        if (id != Alerts.AlertType.TIMER.getId() || (huamiDevice = getHuamiDevice()) == null) {
            return;
        }
        huamiDevice.sendVoiceSetTimerCommand(strB3, AppUtil.getApp().getString(pzi.f30937b));
    }

    private final void sendUnsupport() {
        HuamiApiCaller huamiDevice = getHuamiDevice();
        if (huamiDevice != null) {
            huamiDevice.sendVoiceNotSupportCommand();
        }
    }

    private final void sendVoiceCaption(String text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (text.length() > 300) {
            text = text.substring(0, 300);
            Intrinsics.checkNotNullExpressionValue(text, "substring(...)");
        }
        HuamiApiCaller huamiDevice = getHuamiDevice();
        if (huamiDevice != null) {
            huamiDevice.sendVoiceCaption(text);
        }
    }

    private final void sendWeatherInstruction(Instruction<?> instruction) {
        Object payload = instruction.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Weather");
        ArrayList arrayList = new ArrayList();
        for (Template.WeatherItem weatherItem : ((Template.Weather) payload).getWeather()) {
            WeatherItem weatherItem2 = new WeatherItem();
            weatherItem2.setDate(weatherItem.getDate());
            weatherItem2.setLocation(weatherItem.getLocation());
            if (weatherItem.getAqi().c()) {
                weatherItem2.setAqi(weatherItem.getAqi().b());
            }
            if (weatherItem.getCurrentTemperature().c()) {
                weatherItem2.setcTemperature(weatherItem.getCurrentTemperature().b());
            }
            if (weatherItem.getHighTemperature().c()) {
                weatherItem2.sethTemperature(weatherItem.getHighTemperature().b());
            }
            if (weatherItem.getLowTemperature().c()) {
                weatherItem2.setlTemperature(weatherItem.getLowTemperature().b());
            }
            if (instruction.getDialogId().c() && this.aiToastMap.containsKey(instruction.getDialogId().toString())) {
                Instruction<?> instruction2 = this.aiToastMap.get(instruction.getDialogId().toString());
                Object payload2 = instruction2 != null ? instruction2.getPayload() : null;
                Intrinsics.checkNotNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Toast");
                String text = ((Template.Toast) payload2).getText();
                if (text.length() > 100) {
                    Intrinsics.checkNotNull(text);
                    text = text.substring(0, 100);
                    Intrinsics.checkNotNullExpressionValue(text, "substring(...)");
                }
                weatherItem2.setDescription(text);
            }
            if (weatherItem.getIcon().c()) {
                Image image = new Image();
                if (weatherItem.getIcon().c()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Template.ImageSource imageSource : weatherItem.getIcon().b().getSources()) {
                        ImageSource imageSource2 = new ImageSource();
                        imageSource2.setUrl(imageSource.getUrl());
                        if (imageSource.getBgUrl().c()) {
                            imageSource2.setDarkBackgroundUrl(imageSource.getBgUrl().b());
                        }
                        if (imageSource.getHeight().c()) {
                            imageSource2.setHeightPixels(imageSource.getHeight().b().intValue());
                        }
                        if (imageSource.getWidth().c()) {
                            imageSource2.setWidthPixels(imageSource.getWidth().b().intValue());
                        }
                        if (imageSource.getSize().c()) {
                            imageSource2.setSize(imageSource.getSize().b());
                        }
                        arrayList2.add(imageSource2);
                    }
                    image.setSources(arrayList2);
                }
                image.setContentDescription(weatherItem.getIcon().b().getDescription());
                weatherItem2.setImage(image);
                arrayList.add(weatherItem2);
            }
        }
        HuamiApiCaller huamiDevice = getHuamiDevice();
        if (huamiDevice != null) {
            huamiDevice.sendVoiceWeatherForecastCommand(arrayList);
        }
    }

    private final boolean shouldClearTTS(List<? extends Instruction<?>> instructions) {
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AIApiConstants.Alerts.SetAlert);
        arrayList.add(AIApiConstants.CustomDirective.ExecuteDeviceSkill);
        arrayList.add(AIApiConstants.Template.Weather);
        boolean z = false;
        for (Instruction<?> instruction : instructions) {
            if (arrayList.contains(instruction.getFullName())) {
                z = true;
            }
            if (Intrinsics.areEqual(instruction.getNamespace(), AIApiConstants.PlaybackController.NAME)) {
                z = true;
            }
            if (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Template.Toast) && (mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager()) != null && mSpeechRecognizerManager.hasSession() && instruction.getDialogId().c()) {
                this.aiToastMap.put(instruction.getDialogId().toString(), instruction);
            }
        }
        return z;
    }

    private final void stopAudioInput() {
        if (getHuamiDevice() != null) {
            HuamiApiCaller huamiDevice = getHuamiDevice();
            if (huamiDevice != null) {
                huamiDevice.stopVoiceCommand();
            }
            BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this.aivsService.getMSpeechRecognizerManager();
            if (mSpeechRecognizerManager != null) {
                mSpeechRecognizerManager.stopAudioInput();
            }
        }
    }

    public final void clearInstructions() {
        this.mInstructions.clear();
    }

    @NotNull
    public final HuamiAivsService getAivsService() {
        return this.aivsService;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Nullable
    public final HuamiApiCaller getHuamiDevice() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(this.aivsService.getDid());
        if (wearableDeviceModel == null) {
            return null;
        }
        return DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x023b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        String fullName;
        String fullName2;
        String fullName3;
        int iHashCode;
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Logger.d(BaseAivsService.TAG, "Instruction:" + instruction.getFullName() + "|DialogId:" + instruction.getDialogId() + "|Id:" + instruction.getId());
        String namespace = instruction.getNamespace();
        if (namespace != null) {
            switch (namespace.hashCode()) {
                case -1803461041:
                    if (!namespace.equals(AIApiConstants.System.NAME) || (fullName = instruction.getFullName()) == null) {
                        instruction = null;
                    } else {
                        int iHashCode2 = fullName.hashCode();
                        if (iHashCode2 != -1836500200) {
                            if (iHashCode2 != -1616270202) {
                                if (iHashCode2 == -788476173 && fullName.equals(AIApiConstants.System.TruncationNotification)) {
                                    this.handler.obtainMessage(1, instruction.getDialogId().b()).sendToTarget();
                                    sendAivsInstruction(instruction);
                                }
                                break;
                            } else if (!fullName.equals(AIApiConstants.System.Power)) {
                            }
                            instruction = null;
                        } else if (!fullName.equals(AIApiConstants.System.SetProperty)) {
                            instruction = null;
                        }
                    }
                    break;
                case -1715388939:
                    if (!namespace.equals(AIApiConstants.WearableController.NAME)) {
                        instruction = null;
                    }
                    break;
                case -1610407600:
                    if (!namespace.equals(AIApiConstants.UIController.NAME)) {
                        instruction = null;
                    }
                    break;
                case -1350041530:
                    if (namespace.equals(AIApiConstants.SpeechRecognizer.NAME)) {
                        processSpeechRecognizer(instruction);
                    }
                    instruction = null;
                    break;
                case -1342606400:
                    if (!namespace.equals(AIApiConstants.Launcher.NAME) || !Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Launcher.LaunchApp)) {
                        instruction = null;
                    }
                    break;
                case -1256902502:
                    if (namespace.equals(AIApiConstants.Template.NAME) && (fullName2 = instruction.getFullName()) != null) {
                        switch (fullName2.hashCode()) {
                            case -554195084:
                                if (!fullName2.equals(AIApiConstants.Template.General)) {
                                    instruction = null;
                                }
                                break;
                            case -178370:
                                if (!fullName2.equals(AIApiConstants.Template.General2)) {
                                    instruction = null;
                                }
                                break;
                            case 67886326:
                                if (!fullName2.equals(AIApiConstants.Template.PlayInfo)) {
                                    instruction = null;
                                }
                                break;
                            case 218381244:
                                if (!fullName2.equals(AIApiConstants.Template.SwitchPanel)) {
                                    instruction = null;
                                }
                                break;
                            case 304115208:
                                if (!fullName2.equals(AIApiConstants.Template.DeviceList)) {
                                    instruction = null;
                                }
                                break;
                            case 567293217:
                                if (!fullName2.equals(AIApiConstants.Template.Lists)) {
                                    instruction = null;
                                }
                                break;
                            case 574842803:
                                if (!fullName2.equals(AIApiConstants.Template.Toast)) {
                                    instruction = null;
                                }
                                break;
                            case 749393536:
                                if (!fullName2.equals(AIApiConstants.Template.Weather)) {
                                    instruction = null;
                                }
                                break;
                            case 887890554:
                                if (!fullName2.equals(AIApiConstants.Template.SwitchPanelList)) {
                                    instruction = null;
                                }
                                break;
                            default:
                                instruction = null;
                                break;
                        }
                    } else {
                        instruction = null;
                        break;
                    }
                    break;
                case -1072845520:
                    if (!namespace.equals(AIApiConstants.Application.NAME) || !Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Application.Operate)) {
                        instruction = null;
                    }
                    break;
                case -674418963:
                    if (!namespace.equals(AIApiConstants.BrightnessController.NAME)) {
                        instruction = null;
                    }
                    break;
                case -343869473:
                    if (!namespace.equals(AIApiConstants.Speaker.NAME)) {
                        instruction = null;
                    }
                    break;
                case 77195:
                    if (!namespace.equals("NFC")) {
                        instruction = null;
                    }
                    break;
                case 78418:
                    if (namespace.equals(AIApiConstants.Nlp.NAME)) {
                        if (Intrinsics.areEqual(AIApiConstants.Nlp.StartAnswer, instruction.getFullName())) {
                            this.aivsService.traceTimeStamps(TraceConstants.TimeStamp.NLP.RECV_STARTANSWER);
                        } else if (Intrinsics.areEqual(AIApiConstants.Nlp.FinishAnswer, instruction.getFullName())) {
                            this.aivsService.traceTimeStamps(TraceConstants.TimeStamp.NLP.RECV_FINISHANSWER);
                        }
                    }
                    instruction = null;
                    break;
                case 249637943:
                    if (!namespace.equals(AIApiConstants.PlaybackController.NAME)) {
                        instruction = null;
                    }
                    break;
                case 816161726:
                    if (!namespace.equals(AIApiConstants.CustomDirective.NAME)) {
                        instruction = null;
                    }
                    break;
                case 1963757239:
                    if (!namespace.equals(AIApiConstants.Alerts.NAME) || (fullName3 = instruction.getFullName()) == null || ((iHashCode = fullName3.hashCode()) == -2108961186 ? !fullName3.equals(AIApiConstants.Alerts.DeliverAlertIntention) : !(iHashCode == -1663923229 ? fullName3.equals(AIApiConstants.Alerts.StopAlert) : iHashCode == -795955311 && fullName3.equals(AIApiConstants.Alerts.SetAlert)))) {
                        instruction = null;
                    }
                    break;
                case 2021675814:
                    if (namespace.equals(AIApiConstants.SpeechSynthesizer.NAME) && Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.SpeechSynthesizer.Speak)) {
                        sendAivsInstruction(instruction);
                    }
                    instruction = null;
                    break;
                case 2046749032:
                    if (namespace.equals(AIApiConstants.Dialog.NAME)) {
                        if (Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.Dialog.Finish)) {
                            processDialogFinish(instruction);
                        }
                    }
                    instruction = null;
                    break;
                default:
                    instruction = null;
                    break;
            }
            return true;
        }
        instruction = null;
        if (instruction != null) {
            this.mInstructions.add(instruction);
        }
        return true;
    }
}
