package com.xiaomi.fitness.aivs.base;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import com.xiaomi.ai.api.Application;
import com.xiaomi.ai.api.Execution;
import com.xiaomi.ai.api.General;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.WearableController;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.fitness.aivs.util.AivsPreferenceSupport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.sync.export.di.SyncExportManager;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import defpackage.tya;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\t\b&\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0016J\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$H&J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0015H\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fH\u0002J\u001a\u0010+\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010/\u001a\u000200H\u0002J\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\f2\u0006\u00102\u001a\u000203H&J\u0018\u00104\u001a\u00020 2\u0006\u0010\"\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010$J\u0016\u00106\u001a\u00020 2\u0006\u0010\"\u001a\u00020\f2\u0006\u00102\u001a\u000203J\u0012\u00107\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u000e\u00108\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fJ\b\u00108\u001a\u00020 H\u0016J\u0018\u00109\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\f2\u0006\u00102\u001a\u000203H&J\b\u0010:\u001a\u000203H&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010.\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "", "aivsService", "Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "handler", "Landroid/os/Handler;", "<init>", "(Lcom/xiaomi/fitness/aivs/base/BaseAivsService;Landroid/os/Handler;)V", "getHandler", "()Landroid/os/Handler;", "mLock", "mEventId", "", "mEventSession", "Lcom/xiaomi/fitness/aivs/base/BaseEventSession;", "getMEventSession", "()Lcom/xiaomi/fitness/aivs/base/BaseEventSession;", "setMEventSession", "(Lcom/xiaomi/fitness/aivs/base/BaseEventSession;)V", "mNeedRenewSession", "", "", "getMNeedRenewSession", "()Ljava/util/Map;", "needPhoneContext", "getNeedPhoneContext", "()Z", "setNeedPhoneContext", "(Z)V", "hasSession", "getCurrentSessionDid", "dialogFinish", "", "receiveAudioData", "did", "data", "", "onEngineReady", "success", "sendAivsError", "errorCode", "", "startAudioInput", "startAsrTtsNlp", "postBack", "Lcom/xiaomi/ai/api/SpeechRecognizer$PostBack;", "xiaoAiPkgName", "getXiaoaiVersionCode", "", "createEventSession", "sessionId", "", "audioDataInput", "bytes", "prepareAudioInput", "startExpectSpeech", "stopAudioInput", "checkDid", "getCurrentSessionId", "Companion", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseAivsSpeechRecognizerManager {

    @NotNull
    public static final String TAG = "BaseAivsSpeechRecognizerManager";

    @NotNull
    private final BaseAivsService aivsService;

    @NotNull
    private final Handler handler;

    @Nullable
    private String mEventId;

    @Nullable
    private BaseEventSession mEventSession;

    @NotNull
    private final Object mLock;

    @NotNull
    private final Map<String, Boolean> mNeedRenewSession;
    private boolean needPhoneContext;

    @NotNull
    private final String xiaoAiPkgName;

    public BaseAivsSpeechRecognizerManager(@NotNull BaseAivsService aivsService, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(aivsService, "aivsService");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.aivsService = aivsService;
        this.handler = handler;
        this.mLock = new Object();
        this.mNeedRenewSession = new LinkedHashMap();
        this.xiaoAiPkgName = "com.miui.voiceassist";
    }

    private final long getXiaoaiVersionCode() {
        try {
            PackageInfo packageInfo = ApplicationExtKt.getApplication().getPackageManager().getPackageInfo(this.xiaoAiPkgName, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    private final boolean startAsrTtsNlp(String did, SpeechRecognizer.PostBack postBack) {
        boolean zAreEqual = Intrinsics.areEqual(this.mNeedRenewSession.remove(did), Boolean.TRUE);
        Settings.ClientInfo clientInfo = new Settings.ClientInfo();
        clientInfo.setMiotDid(did);
        Pair<Double, Double> gpsLocation = SyncExtKt.getInstance(SyncExportManager.INSTANCE).getGpsLocation();
        Logger.i(TAG, "gpsLocation " + gpsLocation);
        if (gpsLocation != null) {
            clientInfo.setLongitude(gpsLocation.getFirst().doubleValue());
            clientInfo.setLatitude(gpsLocation.getSecond().doubleValue());
        }
        General.RequestState requestState = new General.RequestState();
        requestState.setClientInfo(clientInfo);
        SpeechRecognizer.Recognize recognize = new SpeechRecognizer.Recognize();
        if (!zAreEqual && postBack != null) {
            recognize.setPostBack(postBack);
            Logger.d(TAG, "startAsrTtsNlp has postBack");
        }
        Event<?> eventBuildEvent = APIUtils.buildEvent(recognize);
        boolean ttsMode = this.aivsService.getTtsMode();
        if (!ttsMode) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(Execution.RequestControlType.TTS);
            Execution.RequestControl requestControl = new Execution.RequestControl();
            requestControl.setDisabled(linkedList);
            eventBuildEvent.addContext(APIUtils.buildContext(requestControl));
        }
        String toneId = AivsPreferenceSupport.INSTANCE.getToneId(did);
        if (toneId.length() > 0) {
            Logger.i(BaseAivsService.TAG, "setCurrentToneId:" + toneId);
            requestState.setTtsVendor(toneId);
            Application.State state = new Application.State();
            state.setCurrentToneId(toneId);
            eventBuildEvent.addContext(APIUtils.buildContext(state));
        }
        eventBuildEvent.addContext(APIUtils.buildContext(requestState));
        WearableController.ControlDeviceState controlDeviceState = new WearableController.ControlDeviceState();
        controlDeviceState.setPhone(new WearableController.ControlPhoneState(RomUtils.isXiaomi(), getXiaoaiVersionCode()));
        eventBuildEvent.addContext(APIUtils.buildContext(controlDeviceState));
        if (tya.a() != null && this.needPhoneContext) {
            Logger.d(TAG, "startSession with phoneLastAnswerContext");
            eventBuildEvent.addContext(tya.a());
        }
        if (zAreEqual) {
            eventBuildEvent.addContext(APIUtils.buildContext(new General.RenewSession()));
            Logger.d(TAG, "startAsrTtsNlp renewSession");
        }
        BaseAivsService baseAivsService = this.aivsService;
        Intrinsics.checkNotNull(eventBuildEvent);
        if (!baseAivsService.postEvent(eventBuildEvent)) {
            Logger.e(TAG, "startAsrTtsNlp: postEvent failed");
            return false;
        }
        String id = eventBuildEvent.getId();
        this.mEventId = id;
        Logger.i(TAG, "post start event id = " + id + " isTtsEnabled:" + ttsMode);
        return true;
    }

    private final void startAudioInput(String did) {
        BaseEventSession baseEventSession;
        this.aivsService.interrupt();
        Logger.i(TAG, "startAudioInput");
        if (!startAsrTtsNlp(did, null)) {
            sendAivsError(80);
            dialogFinish();
            return;
        }
        this.aivsService.startTrace();
        try {
            BaseEventSession baseEventSession2 = this.mEventSession;
            if (baseEventSession2 == null || baseEventSession2.isAlive() || (baseEventSession = this.mEventSession) == null) {
                return;
            }
            baseEventSession.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void audioDataInput(@NotNull String did, @Nullable byte[] bytes) {
        BaseEventSession baseEventSession;
        Intrinsics.checkNotNullParameter(did, "did");
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            sendAivsError(80);
            return;
        }
        synchronized (this) {
            try {
                BaseEventSession baseEventSession2 = this.mEventSession;
                if (baseEventSession2 != null) {
                    if (Intrinsics.areEqual(baseEventSession2 != null ? baseEventSession2.getDid() : null, did) && (baseEventSession = this.mEventSession) != null) {
                        baseEventSession.write(bytes);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean checkDid(@NotNull String did, byte sessionId);

    @NotNull
    public abstract BaseEventSession createEventSession(@NotNull String did, byte sessionId);

    public final void dialogFinish() {
        Logger.d(TAG, "dialogFinish");
        BaseEventSession baseEventSession = this.mEventSession;
        if (baseEventSession != null) {
            if (baseEventSession != null) {
                baseEventSession.finish();
            }
            this.mEventSession = null;
            this.aivsService.finishTrace();
            this.aivsService.resetFirstAsrReceived();
        }
    }

    @Nullable
    public String getCurrentSessionDid() {
        BaseEventSession baseEventSession;
        if (!hasSession() || (baseEventSession = this.mEventSession) == null) {
            return null;
        }
        return baseEventSession.getDid();
    }

    public abstract byte getCurrentSessionId();

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Nullable
    public final BaseEventSession getMEventSession() {
        return this.mEventSession;
    }

    @NotNull
    public final Map<String, Boolean> getMNeedRenewSession() {
        return this.mNeedRenewSession;
    }

    public final boolean getNeedPhoneContext() {
        return this.needPhoneContext;
    }

    public boolean hasSession() {
        BaseEventSession baseEventSession = this.mEventSession;
        return !(baseEventSession != null ? baseEventSession.getSessionFinished() : true);
    }

    public void onEngineReady(boolean success) {
        String did;
        synchronized (this.mLock) {
            if (hasSession()) {
                if (success) {
                    BaseEventSession baseEventSession = this.mEventSession;
                    if (baseEventSession != null && (did = baseEventSession.getDid()) != null) {
                        startAudioInput(did);
                    }
                    return;
                }
                sendAivsError(80);
                dialogFinish();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void prepareAudioInput(@NotNull String did, byte sessionId) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (checkDid(did, sessionId)) {
            BaseEventSession baseEventSession = this.mEventSession;
            if (baseEventSession != null) {
                if (baseEventSession != null) {
                    baseEventSession.finish();
                }
                this.mEventSession = null;
            }
            this.mEventSession = createEventSession(did, sessionId);
            this.aivsService.cleanInstructions();
            if (this.aivsService.isEngineIdle()) {
                BaseAivsService.initEngine$default(this.aivsService, null, 1, null);
            } else if (this.aivsService.isEngineReady()) {
                startAudioInput(did);
            }
        }
    }

    public abstract void receiveAudioData(@NotNull String did, @Nullable byte[] data);

    public abstract void sendAivsError(int errorCode);

    public final void setMEventSession(@Nullable BaseEventSession baseEventSession) {
        this.mEventSession = baseEventSession;
    }

    public final void setNeedPhoneContext(boolean z) {
        this.needPhoneContext = z;
    }

    public void startExpectSpeech(@Nullable SpeechRecognizer.PostBack postBack) {
        String did;
        BaseEventSession baseEventSession;
        BaseEventSession baseEventSession2 = this.mEventSession;
        if (baseEventSession2 == null || (did = baseEventSession2.getDid()) == null || (baseEventSession = this.mEventSession) == null) {
            return;
        }
        byte sessionId = baseEventSession.getSessionId();
        BaseEventSession baseEventSession3 = this.mEventSession;
        if (baseEventSession3 != null) {
            baseEventSession3.finish();
        }
        this.mEventSession = null;
        this.mEventSession = createEventSession(did, sessionId);
        Logger.i(TAG, "startExpectSpeech");
        if (!startAsrTtsNlp(did, postBack)) {
            sendAivsError(80);
            dialogFinish();
        } else {
            BaseEventSession baseEventSession4 = this.mEventSession;
            if (baseEventSession4 != null) {
                baseEventSession4.start();
            }
        }
    }

    public final void stopAudioInput(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        BaseEventSession baseEventSession = this.mEventSession;
        if (baseEventSession != null) {
            if (Intrinsics.areEqual(baseEventSession != null ? baseEventSession.getDid() : null, did)) {
                stopAudioInput();
            }
        }
    }

    public void stopAudioInput() {
        BaseEventSession baseEventSession = this.mEventSession;
        if (baseEventSession == null || baseEventSession == null || baseEventSession.getAudioInputStopped()) {
            return;
        }
        BaseEventSession baseEventSession2 = this.mEventSession;
        if (baseEventSession2 != null) {
            baseEventSession2.stopInput();
        }
        String str = this.mEventId;
        if (str == null || str.length() <= 0) {
            return;
        }
        Event<?> eventBuildEvent = APIUtils.buildEvent(new SpeechRecognizer.RecognizeStreamFinished(), null, this.mEventId);
        BaseAivsService baseAivsService = this.aivsService;
        Intrinsics.checkNotNull(eventBuildEvent);
        baseAivsService.postEvent(eventBuildEvent);
        Logger.i(TAG, "post RecognizeStreamFinished");
    }
}
