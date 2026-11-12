package com.xiaomi.fitness.aivs.base;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.example.aivs.export.AivsEnvEntry;
import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.AivsHelperExtKt;
import com.google.gson.Gson;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.ai.android.capability.ErrorCapability;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.helper.PrivacySettingsHelper;
import com.xiaomi.ai.android.helper.WakeUpGuideHelper;
import com.xiaomi.ai.android.track.TraceConstants;
import com.xiaomi.ai.android.utils.DeviceUtils;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.aivs.bluetooth.BluetoothAivsService;
import com.xiaomi.fitness.aivs.bluetooth.SpeechSynthesizerCapabilityImpl;
import com.xiaomi.fitness.aivs.capability.ConnectionCapabilityImpl;
import com.xiaomi.fitness.aivs.capability.ErrorCapabilityImpl;
import com.xiaomi.fitness.aivs.huami.HuamiAivsService;
import com.xiaomi.fitness.aivs.request.AivsRequest;
import com.xiaomi.fitness.aivs.request.model.AiSuggestionParams;
import com.xiaomi.fitness.aivs.request.model.AiSuggestionResp;
import com.xiaomi.fitness.aivs.request.model.DeviceBean;
import com.xiaomi.fitness.aivs.request.model.Suggestion;
import com.xiaomi.fitness.aivs.request.model.UserCredentialsIssuedTokenResp;
import com.xiaomi.fitness.aivs.util.AivsPreferenceSupport;
import com.xiaomi.fitness.aivs.util.SyncEngineStatusHelper;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.sport_eco.SportConstants;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.bqe;
import defpackage.e01;
import defpackage.h4b;
import defpackage.jug;
import defpackage.tya;
import defpackage.vya;
import defpackage.wpe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 ¸\u00012\u00020\u0001:\u0006¸\u0001¹\u0001º\u0001B\u0010\u0012\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0005\b·\u0001\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eJ0\u0010\u0017\u001a\u00020\u00022!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u00022%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0004J1\u0010\"\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\f2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0002H\u0014¢\u0006\u0004\b,\u0010\u0004J\r\u0010-\u001a\u00020\u0002¢\u0006\u0004\b-\u0010\u0004J\r\u0010.\u001a\u00020\u0002¢\u0006\u0004\b.\u0010\u0004J\u0015\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b6\u00101J\u000f\u00107\u001a\u00020\u0005H$¢\u0006\u0004\b7\u0010\tJ\u0011\u00109\u001a\u0004\u0018\u000108H&¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\f¢\u0006\u0004\b;\u0010\u000eJ\u000f\u0010<\u001a\u00020\u0002H\u0016¢\u0006\u0004\b<\u0010\u0004J\u0017\u0010>\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020=H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0002H&¢\u0006\u0004\bC\u0010\u0004J\u0017\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020DH&¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH&¢\u0006\u0004\bJ\u0010KJ\u0011\u0010M\u001a\u0004\u0018\u00010LH&¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0002H\u0016¢\u0006\u0004\bO\u0010\u0004J\u000f\u0010P\u001a\u00020\fH&¢\u0006\u0004\bP\u0010\u000eJ\u0017\u0010R\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\fH&¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00022\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u0002¢\u0006\u0004\bX\u0010\u0004R\u0017\u0010(\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010Y\u001a\u0004\bZ\u0010\tR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010_\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010Y\u001a\u0004\bf\u0010\t\"\u0004\bg\u00101R\"\u0010h\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010Y\u001a\u0004\bi\u0010\t\"\u0004\bj\u00101R\"\u0010k\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010Y\u001a\u0004\bl\u0010\t\"\u0004\bm\u00101R\u0016\u0010n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010YR\u0016\u0010o\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010YR\"\u0010p\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010Y\u001a\u0004\bq\u0010\t\"\u0004\br\u00101R\"\u0010s\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010Y\u001a\u0004\bt\u0010\t\"\u0004\bu\u00101R\"\u0010v\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\"\u0010|\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u000e\"\u0004\b\u007f\u0010SR&\u0010\u0080\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010}\u001a\u0005\b\u0081\u0001\u0010\u000e\"\u0005\b\u0082\u0001\u0010SR*\u0010\u0083\u0001\u001a\u0004\u0018\u00010I8F@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010K\"\u0006\b\u0086\u0001\u0010\u0087\u0001R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u008e\u0001\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010N\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R+\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R+\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010\u009a\u0001\u001a\u0006\b \u0001\u0010\u009c\u0001\"\u0006\b¡\u0001\u0010\u009e\u0001R\u001d\u0010£\u0001\u001a\u00030¢\u00018\u0006¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R'\u0010E\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bE\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R;\u0010±\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00050¯\u0001j\t\u0012\u0004\u0012\u00020\u0005`°\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001¨\u0006»\u0001"}, d2 = {"Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "", "", "initAivsDeviceOauth", "()V", "", "refreshToken", "(Ljava/lang/String;)Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getWakeUpGuide", "resetFirstAsrReceived", "", "isEngineIdle", "()Z", "isEngineReady", "isNlpEdgeEngineReady", "isNlpEdgeEngineIdle", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "callback", "startAivsService", "(Lkotlin/jvm/functions/Function1;)V", "initEngine", "releaseEngine", "interrupt", "", "var1", "", "var2", "var3", "var4", "postData", "([BIIZ)Z", "Lcom/xiaomi/ai/api/common/Event;", "event", "postEvent", "(Lcom/xiaomi/ai/api/common/Event;)Z", "did", "data", "receiveAudioData", "(Ljava/lang/String;[B)V", "buildConfig", "startTrace", "finishTrace", SportConstants.KEY_TIMESTAMP, "traceTimeStamps", "(Ljava/lang/String;)V", "Lcom/xiaomi/ai/api/SpeechRecognizer$RecognizeResultItem;", "recognizeResult", "doAsrFinalTrace", "(Lcom/xiaomi/ai/api/SpeechRecognizer$RecognizeResultItem;Ljava/lang/String;)V", "doAsrFirstTrace", "getUserAgent", "Lcom/xiaomi/ai/api/Settings$ClientInfo;", "createClientInfo", "()Lcom/xiaomi/ai/api/Settings$ClientInfo;", "shouldRequestContactPermission", "initNlpEdge", "Lcom/xiaomi/ai/android/helper/PrivacySettingsHelper$PrivacySettingsCallback;", "getPrivacySettings", "(Lcom/xiaomi/ai/android/helper/PrivacySettingsHelper$PrivacySettingsCallback;)V", "checked", "setPrivacySettings", "(ZLcom/xiaomi/ai/android/helper/PrivacySettingsHelper$PrivacySettingsCallback;)V", "cleanInstructions", "Landroid/os/Handler;", "handler", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "createInstructionCapability", "(Landroid/os/Handler;)Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "createSpeechRecognizerManager", "()Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;", "createSpeechSynthesizerCapability", "()Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;", "stopAudioInput", "getTtsMode", "ttsMode", "setTtsMode", "(Z)V", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "onStartSession", "(Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)V", "restart", "Ljava/lang/String;", "getDid", "Lcom/xiaomi/ai/android/core/Engine;", "mEngine", "Lcom/xiaomi/ai/android/core/Engine;", "Le01;", "mAivsConfig", "Le01;", "getMAivsConfig", "()Le01;", "setMAivsConfig", "(Le01;)V", "mModel", "getMModel", "setMModel", "mDeviceId", "getMDeviceId", "setMDeviceId", "mClientId", "getMClientId", "setMClientId", "mClientSecret", "mRedirectUrl", "mVid", "getMVid", "setMVid", "mPid", "getMPid", "setMPid", "mCapability", "I", "getMCapability", "()I", "setMCapability", "(I)V", "firstAsrPartialReceived", "Z", "getFirstAsrPartialReceived", "setFirstAsrPartialReceived", "firstAsrPartialTextReceived", "getFirstAsrPartialTextReceived", "setFirstAsrPartialTextReceived", "mSpeechRecognizerManager", "Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "getMSpeechRecognizerManager", "setMSpeechRecognizerManager", "(Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;)V", "mInstructionCapability", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "getMInstructionCapability", "()Lcom/xiaomi/ai/android/capability/InstructionCapability;", "setMInstructionCapability", "(Lcom/xiaomi/ai/android/capability/InstructionCapability;)V", "mSpeechSynthesizerCapability", "Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;", "getMSpeechSynthesizerCapability", "setMSpeechSynthesizerCapability", "(Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;)V", "Lcom/xiaomi/ai/android/capability/ErrorCapability;", "mErrorCapability", "Lcom/xiaomi/ai/android/capability/ErrorCapability;", "Lcom/xiaomi/ai/android/capability/ConnectionCapability;", "mConnectionCapability", "Lcom/xiaomi/ai/android/capability/ConnectionCapability;", "mEngineStartStatus", "Ljava/lang/Integer;", "getMEngineStartStatus", "()Ljava/lang/Integer;", "setMEngineStartStatus", "(Ljava/lang/Integer;)V", "mNlpEngineStartStatus", "getMNlpEngineStartStatus", "setMNlpEngineStartStatus", "Lcom/xiaomi/fitness/aivs/request/AivsRequest;", "aivsRequest", "Lcom/xiaomi/fitness/aivs/request/AivsRequest;", "getAivsRequest", "()Lcom/xiaomi/fitness/aivs/request/AivsRequest;", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "suggestList", "Ljava/util/ArrayList;", "getSuggestList", "()Ljava/util/ArrayList;", "setSuggestList", "(Ljava/util/ArrayList;)V", "<init>", "Companion", "AivsRequestInterface", "AivsHandler", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseAivsService {
    public static final int DIALOG_FINISH_INSTRUCTION = 3;
    public static final int END_OF_SPEECH_DETECTED = 1;
    public static final int ENGINE_STATUS_IDLE = 0;
    public static final int ENGINE_STATUS_INITIALIZING = 1;
    public static final int ENGINE_STATUS_READY = 2;
    public static final int ERROR_OCCUR = -1;
    public static final int INIT_TYPE_BLUETOOTH = 101;
    public static final int INIT_TYPE_HUAMI = 100;
    public static final int MAX_ASR_TEXT_LENGTH = 50;
    public static final int MAX_PACKAGE_LENGTH = 3072;
    public static final int MAX_TEXT_LENGTH = 300;
    public static final int MAX_WEATHER_TEXT_LENGTH = 100;
    public static final int RECEIVE_INSTRUCTION = 2;

    @NotNull
    public static final String TAG = "AivsService";

    @NotNull
    private final AivsRequest aivsRequest;

    @NotNull
    private final String did;
    private boolean firstAsrPartialReceived;
    private boolean firstAsrPartialTextReceived;

    @NotNull
    private Handler handler;

    @NotNull
    private final HandlerThread handlerThread;

    @Nullable
    private e01 mAivsConfig;
    private int mCapability;

    @NotNull
    private String mClientId;

    @NotNull
    private String mClientSecret;

    @Nullable
    private ConnectionCapability mConnectionCapability;

    @NotNull
    private String mDeviceId;

    @Nullable
    private Engine mEngine;

    @Nullable
    private volatile Integer mEngineStartStatus;

    @Nullable
    private ErrorCapability mErrorCapability;

    @Nullable
    private InstructionCapability mInstructionCapability;

    @NotNull
    private String mModel;

    @Nullable
    private volatile Integer mNlpEngineStartStatus;

    @NotNull
    private String mPid;

    @NotNull
    private String mRedirectUrl;

    @Nullable
    private BaseAivsSpeechRecognizerManager mSpeechRecognizerManager;

    @Nullable
    private SpeechSynthesizerCapability mSpeechSynthesizerCapability;

    @NotNull
    private String mVid;

    @NotNull
    private ArrayList<String> suggestList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, BaseAivsService> aivsServiceMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/aivs/base/BaseAivsService$AivsHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "<init>", "(Lcom/xiaomi/fitness/aivs/base/BaseAivsService;Landroid/os/Looper;)V", "isReInited", "", "()Z", "setReInited", "(Z)V", "handleMessage", "", "msg", "Landroid/os/Message;", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AivsHandler extends Handler {
        private boolean isReInited;
        final /* synthetic */ BaseAivsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AivsHandler(@NotNull BaseAivsService baseAivsService, Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.this$0 = baseAivsService;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            int i = msg.what;
            if (i != -1) {
                if (i != 1) {
                    return;
                }
                this.this$0.stopAudioInput();
                return;
            }
            Logger.e(BaseAivsService.TAG, "error code:" + msg.obj);
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue == 401 || iIntValue == 40010006) {
                AivsPreferenceSupport.INSTANCE.setAivsAccessToken(this.this$0.getDid(), this.this$0.getMClientId(), null);
                if (!this.isReInited) {
                    BaseAivsService.initEngine$default(this.this$0, null, 1, null);
                    this.isReInited = true;
                }
            }
            BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this.this$0.getMSpeechRecognizerManager();
            if (mSpeechRecognizerManager != null) {
                mSpeechRecognizerManager.sendAivsError(iIntValue);
            }
            this.this$0.stopAudioInput();
            BaseAivsSpeechRecognizerManager mSpeechRecognizerManager2 = this.this$0.getMSpeechRecognizerManager();
            if (mSpeechRecognizerManager2 != null) {
                mSpeechRecognizerManager2.dialogFinish();
            }
        }

        /* JADX INFO: renamed from: isReInited, reason: from getter */
        public final boolean getIsReInited() {
            return this.isReInited;
        }

        public final void setReInited(boolean z) {
            this.isReInited = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/aivs/base/BaseAivsService$AivsRequestInterface;", "", "getAivsRequest", "Lcom/xiaomi/fitness/aivs/request/AivsRequest;", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AivsRequestInterface {
        @NotNull
        AivsRequest getAivsRequest();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/aivs/base/BaseAivsService$Companion;", "", "<init>", "()V", "TAG", "", "ENGINE_STATUS_IDLE", "", "ENGINE_STATUS_INITIALIZING", "ENGINE_STATUS_READY", "MAX_TEXT_LENGTH", "MAX_PACKAGE_LENGTH", "MAX_ASR_TEXT_LENGTH", "MAX_WEATHER_TEXT_LENGTH", "ERROR_OCCUR", "END_OF_SPEECH_DETECTED", "RECEIVE_INSTRUCTION", "DIALOG_FINISH_INSTRUCTION", "INIT_TYPE_HUAMI", "INIT_TYPE_BLUETOOTH", "aivsServiceMap", "", "Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "getAivsServiceMap", "()Ljava/util/Map;", "getAivsService", "did", "initType", "removeAivsService", "", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BaseAivsService getAivsService(@NotNull String did, int initType) {
            Intrinsics.checkNotNullParameter(did, "did");
            BaseAivsService huamiAivsService = getAivsServiceMap().get(did);
            if (huamiAivsService == null) {
                huamiAivsService = initType == 100 ? new HuamiAivsService(did) : new BluetoothAivsService(did);
                getAivsServiceMap().put(did, huamiAivsService);
            }
            return huamiAivsService;
        }

        @NotNull
        public final Map<String, BaseAivsService> getAivsServiceMap() {
            return BaseAivsService.aivsServiceMap;
        }

        public final void removeAivsService(@NotNull String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            BaseAivsService baseAivsServiceRemove = getAivsServiceMap().remove(did);
            if (baseAivsServiceRemove != null) {
                baseAivsServiceRemove.releaseEngine();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.aivs.base.BaseAivsService$initNlpEdge$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aivs.base.BaseAivsService$initNlpEdge$1", f = "BaseAivsService.kt", i = {}, l = {557}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.aivs.base.BaseAivsService$initNlpEdge$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.aivs.base.BaseAivsService$initNlpEdge$1$1", f = "BaseAivsService.kt", i = {}, l = {554}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03811 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            public C03811(Continuation<? super C03811> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03811 c03811 = new C03811(continuation);
                c03811.L$0 = obj;
                return c03811;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(new jug(AppUtil.getApp()).f(false));
                    this.label = 1;
                    if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
                return ((C03811) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.aivs.base.BaseAivsService$initNlpEdge$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "flowCollector", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.aivs.base.BaseAivsService$initNlpEdge$1$2", f = "BaseAivsService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.d(BaseAivsService.TAG, "nlg edge init failed error " + ((Throwable) this.L$0).getMessage());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }
        }

        public C18191(Continuation<? super C18191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseAivsService.this.new C18191(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.flow(new C03811(null)), new AnonymousClass2(null));
                final BaseAivsService baseAivsService = BaseAivsService.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.aivs.base.BaseAivsService.initNlpEdge.1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        baseAivsService.setMNlpEngineStartStatus(Boxing.boxInt(z ? 2 : 0));
                        if (z) {
                            Logger.e(BaseAivsService.TAG, "nlp edge init success");
                        } else {
                            Logger.e(BaseAivsService.TAG, "nlp edge init fail");
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowM2416catch.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00f3, please report this as an issue */
    public BaseAivsService(@NotNull String did) {
        String deviceId;
        Unit unit;
        Intrinsics.checkNotNullParameter(did, "did");
        this.did = did;
        this.mModel = "";
        this.mDeviceId = "";
        this.mClientId = "0";
        this.mClientSecret = "";
        this.mRedirectUrl = "";
        this.mVid = "";
        this.mPid = "";
        this.mEngineStartStatus = 0;
        this.mNlpEngineStartStatus = 0;
        this.aivsRequest = ((AivsRequestInterface) EntryPointAccessors.fromApplication(AppUtil.getApp(), AivsRequestInterface.class)).getAivsRequest();
        HandlerThread handlerThread = new HandlerThread("aivs");
        this.handlerThread = handlerThread;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            Logger.i(TAG, "init BaseAivsService error did:" + did);
        } else {
            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                deviceId = wearableDeviceModel.getDid();
            } else {
                deviceId = DeviceUtils.getDeviceId(AppUtil.getApp());
                Intrinsics.checkNotNull(deviceId);
            }
            this.mDeviceId = deviceId;
            AivsPreferenceSupport.INSTANCE.setDeviceId(did, deviceId);
            this.mModel = DeviceModelExtKt.getModel(wearableDeviceModel);
            Product.XiaoAi xiaoAi = DeviceModelExtKt.getXiaoAi(wearableDeviceModel);
            Logger.i(TAG, "init BaseAivsService did:" + did + " model.xiaoai is " + xiaoAi);
            if (xiaoAi != null) {
                String clientId = xiaoAi.getClientId();
                this.mClientId = clientId != null ? clientId : "0";
                String clientSecret = xiaoAi.getClientSecret();
                this.mClientSecret = clientSecret == null ? "" : clientSecret;
                String redirectUrl = xiaoAi.getRedirectUrl();
                this.mRedirectUrl = redirectUrl == null ? "" : redirectUrl;
                this.mCapability = (DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(wearableDeviceModel.getDid()) & 256) != 0 ? xiaoAi.getCapability_bigmodel() > 0 ? xiaoAi.getCapability_bigmodel() : xiaoAi.getCapability() : xiaoAi.getCapability();
                String mVid = xiaoAi.getMVid();
                this.mVid = mVid == null ? "" : mVid;
                String mPid = xiaoAi.getMPid();
                this.mPid = mPid != null ? mPid : "";
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                Logger.i(TAG, "init BaseAivsService error did:" + did);
            }
        }
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
        this.handler = new AivsHandler(this, looper);
        this.suggestList = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getToken() {
        String access_token;
        Logger.i(TAG, "getToken");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.aivsRequest.getUserCredentialsToken(Long.parseLong(this.mClientId), this.mClientSecret, Long.parseLong(userId), this.mDeviceId, new Function1<UserCredentialsIssuedTokenResp, Unit>() { // from class: com.xiaomi.fitness.aivs.base.BaseAivsService.getToken.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(UserCredentialsIssuedTokenResp userCredentialsIssuedTokenResp) {
                invoke2(userCredentialsIssuedTokenResp);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(UserCredentialsIssuedTokenResp tokenResp) {
                Intrinsics.checkNotNullParameter(tokenResp, "tokenResp");
                Logger.i(BaseAivsService.TAG, "getToken success " + tokenResp);
                objectRef.element = tokenResp;
                countDownLatch.countDown();
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.aivs.base.BaseAivsService.getToken.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UserCredentialsIssuedTokenResp userCredentialsIssuedTokenResp = (UserCredentialsIssuedTokenResp) objectRef.element;
        if (!TextUtils.isEmpty(userCredentialsIssuedTokenResp != null ? userCredentialsIssuedTokenResp.getAccess_token() : null)) {
            AivsPreferenceSupport.INSTANCE.setAivsAccessToken(this.did, this.mClientId, new Gson().toJson(objectRef.element));
        }
        UserCredentialsIssuedTokenResp userCredentialsIssuedTokenResp2 = (UserCredentialsIssuedTokenResp) objectRef.element;
        return (userCredentialsIssuedTokenResp2 == null || (access_token = userCredentialsIssuedTokenResp2.getAccess_token()) == null) ? "" : access_token;
    }

    private final void getWakeUpGuide() {
        Engine engine = this.mEngine;
        if (engine != null) {
            WakeUpGuideHelper wakeUpGuideHelper = new WakeUpGuideHelper(engine);
            String str = this.mClientId;
            String deviceId = DeviceUtils.getDeviceId(AppUtil.getApp());
            Intrinsics.checkNotNullExpressionValue(deviceId, "getDeviceId(...)");
            DeviceBean deviceBean = new DeviceBean(str, deviceId);
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String packageName = AppUtil.getApp().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            String strC = h4b.c(new AiSuggestionParams(string, deviceBean, packageName, (int) AppUtil.getVersionCode(), "negative_screen&&xiaoai_icon", ""));
            Intrinsics.checkNotNullExpressionValue(strC, "toJsonString(...)");
            Logger.d(TAG, "wakeup guide requestJson:" + strC);
            wakeUpGuideHelper.getWakeUpGuideInfo(strC, new WakeUpGuideHelper.WakeUpGuideCallback() { // from class: com.xiaomi.fitness.aivs.base.BaseAivsService.getWakeUpGuide.1
                @Override // com.xiaomi.ai.android.helper.WakeUpGuideHelper.WakeUpGuideCallback
                public void onError(String s) {
                    Intrinsics.checkNotNullParameter(s, "s");
                    Logger.d(BaseAivsService.TAG, "wakeup guide onError:" + s);
                }

                @Override // com.xiaomi.ai.android.helper.WakeUpGuideHelper.WakeUpGuideCallback
                public void onSuccess(String s) {
                    Intrinsics.checkNotNullParameter(s, "s");
                    Logger.d(BaseAivsService.TAG, "wakeup guide onSuccess:" + s);
                    Object objD = h4b.d(s, AiSuggestionResp.class);
                    Intrinsics.checkNotNullExpressionValue(objD, "toObject(...)");
                    AiSuggestionResp aiSuggestionResp = (AiSuggestionResp) objD;
                    if (aiSuggestionResp.getStatus().getCode() == 200 && (!aiSuggestionResp.getAnswer().getSuggestions().isEmpty())) {
                        BaseAivsService.this.getSuggestList().clear();
                        Iterator<Suggestion> it = aiSuggestionResp.getAnswer().getSuggestions().iterator();
                        while (it.hasNext()) {
                            BaseAivsService.this.getSuggestList().add(it.next().getQuery());
                        }
                        Logger.d("wakeup guide success :" + BaseAivsService.this.getSuggestList(), new Object[0]);
                    }
                }
            });
        }
    }

    private final void initAivsDeviceOauth() {
        Logger.i(TAG, "initAivsDeviceOauth " + this.mClientId + " " + this.mClientSecret);
        e01 e01Var = this.mAivsConfig;
        if (e01Var != null) {
            e01Var.o("auth.client_id", this.mClientId);
        }
        e01 e01Var2 = this.mAivsConfig;
        if (e01Var2 != null) {
            e01Var2.o("auth.oauth.client_secret", this.mClientSecret);
        }
        e01 e01Var3 = this.mAivsConfig;
        if (e01Var3 != null) {
            e01Var3.m("auth.req_token_mode", 1);
        }
        Engine engineCreate = Engine.create(AppUtil.getApp(), this.mAivsConfig, createClientInfo(), 1);
        this.mEngine = engineCreate;
        if (engineCreate != null) {
            engineCreate.registerCapability(new AuthCapability() { // from class: com.xiaomi.fitness.aivs.base.BaseAivsService.initAivsDeviceOauth.1
                @Override // com.xiaomi.ai.android.capability.AuthCapability
                public String onGetToken(int authType, boolean forceRefresh) {
                    UserCredentialsIssuedTokenResp userCredentialsIssuedTokenResp;
                    String aivsAccessToken = AivsPreferenceSupport.INSTANCE.getAivsAccessToken(BaseAivsService.this.getDid(), BaseAivsService.this.getMClientId());
                    Logger.i(BaseAivsService.TAG, "onGetToken mModel:" + BaseAivsService.this.getMModel() + " did:" + BaseAivsService.this.getDid() + " mClientId:" + BaseAivsService.this.getMClientId() + " aivsAccessToken:" + aivsAccessToken + " authType:" + authType + " forceRefresh:" + forceRefresh);
                    if (aivsAccessToken != null) {
                        try {
                            userCredentialsIssuedTokenResp = (UserCredentialsIssuedTokenResp) new Gson().fromJson(aivsAccessToken, UserCredentialsIssuedTokenResp.class);
                        } catch (Exception e) {
                            e.printStackTrace();
                            userCredentialsIssuedTokenResp = null;
                        }
                        if (userCredentialsIssuedTokenResp != null && !TextUtils.isEmpty(userCredentialsIssuedTokenResp.getAccess_token()) && !forceRefresh) {
                            return userCredentialsIssuedTokenResp.getAccess_token();
                        }
                        if (userCredentialsIssuedTokenResp != null && !TextUtils.isEmpty(userCredentialsIssuedTokenResp.getRefresh_token()) && forceRefresh) {
                            return BaseAivsService.this.refreshToken(userCredentialsIssuedTokenResp.getRefresh_token());
                        }
                    }
                    return BaseAivsService.this.getToken();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initEngine$default(BaseAivsService baseAivsService, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initEngine");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        baseAivsService.initEngine(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEngine$lambda$4(final BaseAivsService this$0, Function1 function1) {
        final boolean zStart;
        Engine engine;
        String authorization;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Engine engine2 = this$0.mEngine;
            zStart = engine2 != null ? engine2.start() : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (zStart) {
            if (this$0 instanceof HuamiAivsService) {
                this$0.getWakeUpGuide();
            }
            wpe.n(AppUtil.INSTANCE.isDevChannel() ? 3 : 2);
            wpe.m(new bqe() { // from class: com.xiaomi.fitness.aivs.base.BaseAivsService$initEngine$1$1
                @Override // defpackage.bqe
                public void d(String p0, String p1) {
                    if (AppUtil.INSTANCE.isDevChannel()) {
                        if (p0 == null) {
                            p0 = "AivsSdkLog";
                        }
                        Logger.i(p0, "from debug: " + p1);
                    }
                }

                @Override // defpackage.bqe
                public void e(String p0, String p1) {
                    if (p0 == null) {
                        p0 = "AivsSdkLog";
                    }
                    if (p1 == null) {
                        p1 = "";
                    }
                    Logger.e(p0, p1);
                }

                @Override // defpackage.bqe
                public void i(String p0, String p1) {
                    if (p0 == null) {
                        p0 = "AivsSdkLog";
                    }
                    if (p1 == null) {
                        p1 = "";
                    }
                    Logger.i(p0, p1);
                }

                @Override // defpackage.bqe
                public void w(String p0, String p1) {
                    if (p0 == null) {
                        p0 = "AivsSdkLog";
                    }
                    if (p1 == null) {
                        p1 = "";
                    }
                    Logger.w(p0, p1);
                }
            });
        } else {
            Engine engine3 = this$0.mEngine;
            if (engine3 != null) {
                engine3.release();
            }
            this$0.mEngine = null;
            Logger.e(TAG, "Engine start failed, retry");
        }
        this$0.mEngineStartStatus = Integer.valueOf(zStart ? 2 : 0);
        SyncEngineStatusHelper syncEngineStatusHelper = SyncEngineStatusHelper.INSTANCE;
        Integer num = this$0.mEngineStartStatus;
        syncEngineStatusHelper.postEngineStatus(num != null ? num.intValue() : 0);
        Logger.d(TAG, "initEngine: " + zStart);
        if (zStart && (engine = this$0.mEngine) != null && (authorization = engine.getAuthorization()) != null && authorization.length() != 0) {
            AivsPreferenceSupport aivsPreferenceSupport = AivsPreferenceSupport.INSTANCE;
            String str = this$0.did;
            String authorization2 = engine.getAuthorization();
            Intrinsics.checkNotNullExpressionValue(authorization2, "getAuthorization(...)");
            aivsPreferenceSupport.setAuthorization(str, authorization2);
        }
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(zStart));
        }
        this$0.handler.post(new Runnable() { // from class: f22
            @Override // java.lang.Runnable
            public final void run() {
                BaseAivsService.initEngine$lambda$4$lambda$3(this.f17311a, zStart);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEngine$lambda$4$lambda$3(BaseAivsService this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = this$0.getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager != null) {
            mSpeechRecognizerManager.onEngineReady(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String refreshToken(String refreshToken) {
        String access_token;
        Logger.i(TAG, "refreshToken");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.aivsRequest.refreshUserCredentialsToken(Long.parseLong(this.mClientId), this.mClientSecret, this.mRedirectUrl, refreshToken, new Function1<UserCredentialsIssuedTokenResp, Unit>() { // from class: com.xiaomi.fitness.aivs.base.BaseAivsService.refreshToken.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(UserCredentialsIssuedTokenResp userCredentialsIssuedTokenResp) {
                invoke2(userCredentialsIssuedTokenResp);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(UserCredentialsIssuedTokenResp resp) {
                Intrinsics.checkNotNullParameter(resp, "resp");
                Logger.i(BaseAivsService.TAG, "refreshToken success:" + resp);
                objectRef.element = resp;
                countDownLatch.countDown();
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.aivs.base.BaseAivsService.refreshToken.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UserCredentialsIssuedTokenResp userCredentialsIssuedTokenResp = (UserCredentialsIssuedTokenResp) objectRef.element;
        if (!TextUtils.isEmpty(userCredentialsIssuedTokenResp != null ? userCredentialsIssuedTokenResp.getAccess_token() : null)) {
            AivsPreferenceSupport.INSTANCE.setAivsAccessToken(this.did, this.mClientId, new Gson().toJson(objectRef.element));
        }
        UserCredentialsIssuedTokenResp userCredentialsIssuedTokenResp2 = (UserCredentialsIssuedTokenResp) objectRef.element;
        return (userCredentialsIssuedTokenResp2 == null || (access_token = userCredentialsIssuedTokenResp2.getAccess_token()) == null) ? getToken() : access_token;
    }

    public void buildConfig() {
        e01 e01Var = new e01();
        AivsEnvEntry aivsEnv = AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).getAivsEnv();
        int type = aivsEnv.getType();
        if (!AppUtil.INSTANCE.isDevChannel()) {
            aivsEnv = AivsEnvEntry.INSTANCE.getENV_PRODUCTION();
            type = 0;
        }
        Logger.i(TAG, "aivs envConfig:" + type + " aivsEnv:" + aivsEnv);
        e01Var.m("aivs.env", type);
        e01Var.m("asr.vad_type", 1);
        e01Var.m("connection.keep_alive_type", 1);
        e01Var.o("connection.user_agent", getUserAgent());
        e01Var.l("connection.enable_lite_crypt", false);
        e01Var.m("connection.channel_type", 0);
        e01Var.l("tts.enable_internal_player", false);
        e01Var.m("connection.max_keep_alive_time", 60);
        this.mAivsConfig = e01Var;
    }

    public abstract void cleanInstructions();

    @Nullable
    public abstract Settings.ClientInfo createClientInfo();

    @NotNull
    public abstract InstructionCapability createInstructionCapability(@NotNull Handler handler);

    @NotNull
    public abstract BaseAivsSpeechRecognizerManager createSpeechRecognizerManager();

    @Nullable
    public abstract SpeechSynthesizerCapability createSpeechSynthesizerCapability();

    public final void doAsrFinalTrace(@Nullable SpeechRecognizer.RecognizeResultItem recognizeResult, @NotNull String result) {
        Optional<Long> endOffset;
        Engine engine;
        Optional<Long> beginOffset;
        Engine engine2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (isEngineReady()) {
            Engine engine3 = this.mEngine;
            if (engine3 != null) {
                engine3.traceTimeStamps(TraceConstants.TimeStamp.ASR.RECV_FINAL);
            }
            Engine engine4 = this.mEngine;
            if (engine4 != null) {
                engine4.traceTimeStamps(TraceConstants.TimeStamp.ASR.FINAL_SIZE, result.length());
            }
            if (recognizeResult != null && (beginOffset = recognizeResult.getBeginOffset()) != null && beginOffset.c() && (engine2 = this.mEngine) != null) {
                Long lB = recognizeResult.getBeginOffset().b();
                Intrinsics.checkNotNullExpressionValue(lB, "get(...)");
                engine2.traceTimeStamps(TraceConstants.TimeStamp.ASR.START_TALKING_OFFSET, lB.longValue());
            }
            if (recognizeResult == null || (endOffset = recognizeResult.getEndOffset()) == null || !endOffset.c() || (engine = this.mEngine) == null) {
                return;
            }
            Long lB2 = recognizeResult.getEndOffset().b();
            Intrinsics.checkNotNullExpressionValue(lB2, "get(...)");
            engine.traceTimeStamps(TraceConstants.TimeStamp.ASR.FINISH_TALKING_OFFSET, lB2.longValue());
        }
    }

    public final void doAsrFirstTrace(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (isEngineReady()) {
            if (!this.firstAsrPartialReceived) {
                Engine engine = this.mEngine;
                if (engine != null) {
                    engine.traceTimeStamps(TraceConstants.TimeStamp.ASR.RECV_FIRST_PARTIAL);
                }
                this.firstAsrPartialReceived = true;
            }
            if (TextUtils.isEmpty(result) || this.firstAsrPartialTextReceived) {
                return;
            }
            Engine engine2 = this.mEngine;
            if (engine2 != null) {
                engine2.traceTimeStamps(TraceConstants.TimeStamp.ASR.RECV_FIRST_TEXT);
            }
            this.firstAsrPartialTextReceived = true;
        }
    }

    public final void finishTrace() {
        Engine engine;
        if (!isEngineReady() || (engine = this.mEngine) == null) {
            return;
        }
        engine.finishTrace();
    }

    @NotNull
    public final AivsRequest getAivsRequest() {
        return this.aivsRequest;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final boolean getFirstAsrPartialReceived() {
        return this.firstAsrPartialReceived;
    }

    public final boolean getFirstAsrPartialTextReceived() {
        return this.firstAsrPartialTextReceived;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Nullable
    public final e01 getMAivsConfig() {
        return this.mAivsConfig;
    }

    public final int getMCapability() {
        return this.mCapability;
    }

    @NotNull
    public final String getMClientId() {
        return this.mClientId;
    }

    @NotNull
    public final String getMDeviceId() {
        return this.mDeviceId;
    }

    @Nullable
    public final Integer getMEngineStartStatus() {
        return this.mEngineStartStatus;
    }

    @Nullable
    public final InstructionCapability getMInstructionCapability() {
        return this.mInstructionCapability;
    }

    @NotNull
    public final String getMModel() {
        return this.mModel;
    }

    @Nullable
    public final Integer getMNlpEngineStartStatus() {
        return this.mNlpEngineStartStatus;
    }

    @NotNull
    public final String getMPid() {
        return this.mPid;
    }

    @Nullable
    public final BaseAivsSpeechRecognizerManager getMSpeechRecognizerManager() {
        if (this.mSpeechRecognizerManager == null) {
            this.mSpeechRecognizerManager = createSpeechRecognizerManager();
        }
        return this.mSpeechRecognizerManager;
    }

    @Nullable
    public final SpeechSynthesizerCapability getMSpeechSynthesizerCapability() {
        return this.mSpeechSynthesizerCapability;
    }

    @NotNull
    public final String getMVid() {
        return this.mVid;
    }

    public void getPrivacySettings(@NotNull PrivacySettingsHelper.PrivacySettingsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Engine engine = this.mEngine;
        if (engine != null) {
            new PrivacySettingsHelper(engine).getPrivacySettings(callback);
        } else {
            callback.onError("engine is null");
        }
    }

    @NotNull
    public ArrayList<String> getSuggestList() {
        return this.suggestList;
    }

    public abstract boolean getTtsMode();

    @NotNull
    public abstract String getUserAgent();

    public final void initEngine(@Nullable final Function1<? super Boolean, Unit> callback) {
        Engine engine;
        Integer num = this.mEngineStartStatus;
        if ((num != null && num.intValue() == 1) || this.mClientId.length() == 0) {
            return;
        }
        Engine engine2 = this.mEngine;
        if (engine2 != null) {
            if (engine2 != null) {
                engine2.release();
            }
            this.mEngine = null;
        }
        this.mEngineStartStatus = 1;
        tya.b(new vya());
        buildConfig();
        initNlpEdge();
        initAivsDeviceOauth();
        if (this.mConnectionCapability == null) {
            this.mConnectionCapability = new ConnectionCapabilityImpl(this.mModel);
        }
        if (this.mErrorCapability == null) {
            this.mErrorCapability = new ErrorCapabilityImpl(this.handler, this.mModel);
        }
        if (this.mInstructionCapability == null) {
            this.mInstructionCapability = createInstructionCapability(this.handler);
        }
        if (this.mSpeechSynthesizerCapability == null) {
            this.mSpeechSynthesizerCapability = createSpeechSynthesizerCapability();
        }
        Engine engine3 = this.mEngine;
        if (engine3 != null) {
            engine3.registerCapability(this.mConnectionCapability);
        }
        Engine engine4 = this.mEngine;
        if (engine4 != null) {
            engine4.registerCapability(this.mErrorCapability);
        }
        Engine engine5 = this.mEngine;
        if (engine5 != null) {
            engine5.registerCapability(this.mInstructionCapability);
        }
        SpeechSynthesizerCapability speechSynthesizerCapability = this.mSpeechSynthesizerCapability;
        if (speechSynthesizerCapability != null && (engine = this.mEngine) != null) {
            engine.registerCapability(speechSynthesizerCapability);
        }
        new Thread(new Runnable() { // from class: g22
            @Override // java.lang.Runnable
            public final void run() {
                BaseAivsService.initEngine$lambda$4(this.f18484a, callback);
            }
        }).start();
    }

    public void initNlpEdge() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(this.did);
        if (wearableDeviceModel == null || com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isDual(wearableDeviceModel)) {
            Integer num = this.mNlpEngineStartStatus;
            if (num != null && num.intValue() == 1) {
                return;
            }
            this.mNlpEngineStartStatus = 1;
            AnyExtKt.io$default(null, new C18191(null), 1, null);
        }
    }

    public final void interrupt() {
        Engine engine = this.mEngine;
        if (engine != null) {
            engine.interrupt();
        }
    }

    public boolean isEngineIdle() {
        Integer num = this.mEngineStartStatus;
        return num != null && num.intValue() == 0;
    }

    public boolean isEngineReady() {
        Integer num = this.mEngineStartStatus;
        return num != null && num.intValue() == 2;
    }

    public final boolean isNlpEdgeEngineIdle() {
        Integer num = this.mNlpEngineStartStatus;
        return num != null && num.intValue() == 0;
    }

    public final boolean isNlpEdgeEngineReady() {
        Integer num = this.mNlpEngineStartStatus;
        return num != null && num.intValue() == 2;
    }

    public void onStartSession(@NotNull VoiceConfig voiceConfig) {
        Intrinsics.checkNotNullParameter(voiceConfig, "voiceConfig");
    }

    public boolean postData(@Nullable byte[] var1, int var2, int var3, boolean var4) {
        Engine engine = this.mEngine;
        if (engine != null) {
            return engine.postData(var1, var2, var3, var4);
        }
        return false;
    }

    public boolean postEvent(@NotNull Event<?> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Engine engine = this.mEngine;
        if (engine != null) {
            return engine.postEvent(event);
        }
        return false;
    }

    public final void receiveAudioData(@NotNull String did, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(data, "data");
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager != null) {
            mSpeechRecognizerManager.receiveAudioData(did, data);
        }
    }

    public void releaseEngine() {
        Logger.i(TAG, "releaseEngine " + this.did);
        Engine engine = this.mEngine;
        if (engine != null) {
            engine.release();
        }
        SpeechSynthesizerCapability speechSynthesizerCapability = this.mSpeechSynthesizerCapability;
        SpeechSynthesizerCapabilityImpl speechSynthesizerCapabilityImpl = speechSynthesizerCapability instanceof SpeechSynthesizerCapabilityImpl ? (SpeechSynthesizerCapabilityImpl) speechSynthesizerCapability : null;
        if (speechSynthesizerCapabilityImpl != null) {
            speechSynthesizerCapabilityImpl.release();
        }
        this.mEngine = null;
        this.mAivsConfig = null;
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager != null) {
            mSpeechRecognizerManager.dialogFinish();
        }
        this.mEngineStartStatus = 0;
        SyncEngineStatusHelper syncEngineStatusHelper = SyncEngineStatusHelper.INSTANCE;
        Integer num = this.mEngineStartStatus;
        syncEngineStatusHelper.postEngineStatus(num != null ? num.intValue() : 0);
        this.handlerThread.quit();
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void resetFirstAsrReceived() {
        this.firstAsrPartialReceived = false;
        this.firstAsrPartialTextReceived = false;
    }

    public final void restart() {
        Engine engine = this.mEngine;
        if (engine != null) {
            engine.restart();
        }
    }

    public final void setFirstAsrPartialReceived(boolean z) {
        this.firstAsrPartialReceived = z;
    }

    public final void setFirstAsrPartialTextReceived(boolean z) {
        this.firstAsrPartialTextReceived = z;
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    public final void setMAivsConfig(@Nullable e01 e01Var) {
        this.mAivsConfig = e01Var;
    }

    public final void setMCapability(int i) {
        this.mCapability = i;
    }

    public final void setMClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mClientId = str;
    }

    public final void setMDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mDeviceId = str;
    }

    public final void setMEngineStartStatus(@Nullable Integer num) {
        this.mEngineStartStatus = num;
    }

    public final void setMInstructionCapability(@Nullable InstructionCapability instructionCapability) {
        this.mInstructionCapability = instructionCapability;
    }

    public final void setMModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mModel = str;
    }

    public final void setMNlpEngineStartStatus(@Nullable Integer num) {
        this.mNlpEngineStartStatus = num;
    }

    public final void setMPid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mPid = str;
    }

    public final void setMSpeechRecognizerManager(@Nullable BaseAivsSpeechRecognizerManager baseAivsSpeechRecognizerManager) {
        this.mSpeechRecognizerManager = baseAivsSpeechRecognizerManager;
    }

    public final void setMSpeechSynthesizerCapability(@Nullable SpeechSynthesizerCapability speechSynthesizerCapability) {
        this.mSpeechSynthesizerCapability = speechSynthesizerCapability;
    }

    public final void setMVid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mVid = str;
    }

    public void setPrivacySettings(boolean checked, @NotNull PrivacySettingsHelper.PrivacySettingsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Engine engine = this.mEngine;
        if (engine == null) {
            callback.onError("engine is null");
            return;
        }
        PrivacySettingsHelper privacySettingsHelper = new PrivacySettingsHelper(engine);
        HashMap map = new HashMap();
        map.put("speech_recognition", Boolean.valueOf(checked));
        privacySettingsHelper.uploadPrivacySettings(map, callback);
    }

    public void setSuggestList(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.suggestList = arrayList;
    }

    public abstract void setTtsMode(boolean ttsMode);

    public final boolean shouldRequestContactPermission() {
        return PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.READ_CONTACTS"});
    }

    public final void startAivsService(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isEngineIdle()) {
            initEngine(callback);
        }
    }

    public final void startTrace() {
        Engine engine;
        if (!isEngineReady() || (engine = this.mEngine) == null) {
            return;
        }
        engine.startTrace();
    }

    public void stopAudioInput() {
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager != null) {
            mSpeechRecognizerManager.stopAudioInput();
        }
    }

    public final void traceTimeStamps(@NotNull String timeStamp) {
        Engine engine;
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        if (!isEngineReady() || (engine = this.mEngine) == null) {
            return;
        }
        engine.traceTimeStamps(timeStamp);
    }
}
