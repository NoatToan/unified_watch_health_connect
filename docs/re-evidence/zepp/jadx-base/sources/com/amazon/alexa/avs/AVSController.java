package com.amazon.alexa.avs;

import com.amazon.alexa.avs.exception.DirectiveHandlingException;
import com.amazon.alexa.avs.http.AVSClient;
import com.amazon.alexa.avs.http.AVSClientFactory;
import com.amazon.alexa.avs.http.ParsingFailedHandler;
import com.amazon.alexa.avs.log.LogHelper;
import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import com.amazon.alexa.avs.message.request.RequestBody;
import com.amazon.alexa.avs.message.request.RequestFactory;
import com.amazon.alexa.avs.message.request.context.AlertsStatePayload;
import com.amazon.alexa.avs.message.request.context.NotificationsStatePayload;
import com.amazon.alexa.avs.message.request.settings.LocaleSetting;
import com.amazon.alexa.avs.message.response.Directive;
import com.amazon.alexa.avs.message.response.system.SetEndpoint;
import com.amazon.alexa.avs.message.response.templateruntime.CardHandler;
import com.amazon.alexa.avs.wakeword.WakeWordDetectedHandler;
import com.amazon.alexa.avs.wakeword.WakeWordIPC;
import com.amazon.alexa.avs.wakeword.WakeWordIPCFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class AVSController implements RecordingStateListener, AlertHandler, AlertEventListener, DirectiveDispatcher, AlexaSpeechListener, ParsingFailedHandler, UserActivityListener, WakeWordDetectedHandler {
    private static final String END_SOUND = "res/stop.mp3";
    private static final String ERROR_SOUND = "res/error.mp3";
    private static final String FORMAT = "AUDIO_L16_RATE_16000_CHANNELS_1";
    private static final long MILLISECONDS_PER_SECOND = 1000;
    private static final String START_SOUND = "res/start.mp3";
    private static final long USER_INACTIVITY_REPORT_PERIOD_HOURS = 1;
    private AVSClient avsClient;
    private final AVSClientFactory avsClientFactory;
    private CardHandler cardHandler;
    private BlockableDirectiveThread dependentDirectiveThread;
    private BlockingQueue<Directive> dependentQueue;
    private final DialogRequestIdAuthority dialogRequestIdAuthority;
    private final DirectiveEnqueuer directiveEnqueuer;
    private Set<ExpectSpeechListener> expectSpeechListeners;
    private BlockableDirectiveThread independentDirectiveThread;
    private BlockingQueue<Directive> independentQueue;
    private AtomicLong lastUserInteractionTimestampSeconds;
    private ResultListener listener;
    private ExpectStopCaptureListener stopCaptureHandler;
    private boolean wakeWordAgentEnabled;
    private WakeWordDetectedHandler wakeWordDetectedHandler;
    private static final String TAG = LogHelper.makeLogTag(AVSController.class);
    private static final SpeechProfile PROFILE = SpeechProfile.NEAR_FIELD;
    private static final Logger log = LoggerFactory.getLogger(AVSController.class);
    private final int WAKE_WORD_AGENT_PORT_NUMBER = 5123;
    private final int WAKE_WORD_RELEASE_TRIES = 5;
    private final int WAKE_WORD_RELEASE_RETRY_DELAY_MS = 1000;
    private boolean eventRunning = false;
    private ScheduledExecutorService scheduledExecutor = new ScheduledThreadPoolExecutor(1);
    private WakeWordIPC wakeWordIPC = null;
    private boolean acceptWakeWordEvents = true;
    private AVSAudioPlayer player = new AVSAudioPlayer();

    public class UserInactivityReport implements Runnable {
        private UserInactivityReport() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AVSController.this.sendRequest(RequestFactory.createSystemUserInactivityReportEvent((System.currentTimeMillis() / 1000) - AVSController.this.lastUserInteractionTimestampSeconds.get()));
        }
    }

    public AVSController(AVSClientFactory aVSClientFactory, DialogRequestIdAuthority dialogRequestIdAuthority, WakeWordIPCFactory wakeWordIPCFactory) throws Exception {
        this.wakeWordAgentEnabled = false;
        this.avsClientFactory = aVSClientFactory;
        this.wakeWordAgentEnabled = false;
        initializeMicrophone();
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        this.listener = new ResultListener() { // from class: com.amazon.alexa.avs.AVSController.1
            private boolean setLocaleCalled;

            private void sendSyncAndLocale() {
                if (countDownLatch.getCount() <= 0) {
                    try {
                        AVSController.log.info("Start sending SynchronizeStateEvent");
                        AVSController.this.sendSynchronizeStateEvent();
                        if (this.setLocaleCalled) {
                            return;
                        }
                        this.setLocaleCalled = true;
                    } catch (InterruptedException e) {
                        AVSController.log.error("Could not send SynchronizeState event", e);
                    }
                }
            }

            @Override // com.amazon.alexa.avs.ResultListener
            public void onFailure() {
                countDownLatch.countDown();
                sendSyncAndLocale();
            }

            @Override // com.amazon.alexa.avs.ResultListener
            public void onSuccess() {
                countDownLatch.countDown();
                sendSyncAndLocale();
            }
        };
        this.dialogRequestIdAuthority = dialogRequestIdAuthority;
        this.dependentQueue = new LinkedBlockingDeque();
        this.independentQueue = new LinkedBlockingDeque();
        DirectiveEnqueuer directiveEnqueuer = new DirectiveEnqueuer(dialogRequestIdAuthority, this.dependentQueue, this.independentQueue, this);
        this.directiveEnqueuer = directiveEnqueuer;
        this.avsClient = aVSClientFactory.getAVSClient(null, directiveEnqueuer, this, this.listener);
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.alexa.avs.AVSController.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AVSController.this.avsClient.shutdown();
            }
        });
        this.dependentDirectiveThread = new BlockableDirectiveThread(this.dependentQueue, this, "DependentDirectiveThread");
        this.independentDirectiveThread = new BlockableDirectiveThread(this.independentQueue, this, "IndependentDirectiveThread");
        this.lastUserInteractionTimestampSeconds = new AtomicLong(System.currentTimeMillis() / 1000);
        this.scheduledExecutor.scheduleAtFixedRate(new UserInactivityReport(), 1L, 1L, TimeUnit.HOURS);
    }

    private AlertsStatePayload getAlertState() {
        return new AlertsStatePayload(null, null);
    }

    private NotificationsStatePayload getNotificationState() {
        return new NotificationsStatePayload(false, false);
    }

    private void handleAlertsDirective(Directive directive) throws DirectiveHandlingException {
        directive.getName();
    }

    private void handleAudioPlayerDirective(Directive directive) throws DirectiveHandlingException {
        directive.getName();
    }

    private void handleNotificationsDirective(Directive directive) throws DirectiveHandlingException {
        directive.getName();
    }

    private void handleSetEndpoint(SetEndpoint setEndpoint) throws DirectiveHandlingException {
        try {
            if (new URL(setEndpoint.getEndpoint()).equals(this.avsClient.getHost())) {
                return;
            }
            this.avsClient.closeDownchannel();
            this.avsClient = this.avsClientFactory.getAVSClient(null, this.directiveEnqueuer, this, this.listener);
        } catch (MalformedURLException unused) {
            log.error("The SetEndpoint payload had a malformed URL");
            throw new DirectiveHandlingException(DirectiveHandlingException.ExceptionType.UNEXPECTED_INFORMATION_RECEIVED, "Received SetEndpoint directive with malformed url");
        } catch (Exception unused2) {
            log.error("Failed to set a new avs client.");
            throw new DirectiveHandlingException(DirectiveHandlingException.ExceptionType.INTERNAL_ERROR, "Error while creating avsClient");
        }
    }

    private void handleSpeakerDirective(Directive directive) throws DirectiveHandlingException {
        directive.getName();
    }

    private void handleSpeechRecognizerDirective(Directive directive) throws DirectiveHandlingException {
        String name = directive.getName();
        if (AVSAPIConstants.SpeechRecognizer.Directives.ExpectSpeech.NAME.equals(name)) {
            notifyExpectSpeechDirective();
        } else if (AVSAPIConstants.SpeechRecognizer.Directives.StopCapture.NAME.equals(name)) {
            this.stopCaptureHandler.onStopCaptureDirective();
        } else {
            throwUnsupportedOperationException(directive);
        }
    }

    private void handleSpeechSynthesizerDirective(Directive directive) throws DirectiveHandlingException {
        if (!AVSAPIConstants.SpeechSynthesizer.Directives.Speak.NAME.equals(directive.getName())) {
            throw new DirectiveHandlingException(DirectiveHandlingException.ExceptionType.UNSUPPORTED_OPERATION, "The device's speech synthesizer component cannot handle this directive.");
        }
    }

    private void handleSystemDirective(Directive directive) throws DirectiveHandlingException {
        String name = directive.getName();
        if (AVSAPIConstants.System.Directives.ResetUserInactivity.NAME.equals(name)) {
            onUserActivity();
        } else if (AVSAPIConstants.System.Directives.SetEndpoint.NAME.equals(name)) {
            handleSetEndpoint((SetEndpoint) directive.getPayload());
        } else {
            throwUnsupportedOperationException(directive);
        }
    }

    private void handleTemplateRuntimeDirective(Directive directive) throws DirectiveHandlingException {
        String name = directive.getName();
        if (this.cardHandler == null) {
            throwUnsupportedOperationException(directive);
        }
        if (AVSAPIConstants.TemplateRuntime.Directives.RenderTemplate.NAME.equals(name)) {
            return;
        }
        if (AVSAPIConstants.TemplateRuntime.Directives.RenderPlayerInfo.NAME.equals(name)) {
            this.cardHandler.renderPlayerInfo(directive.getRawMessage());
        } else {
            throwUnsupportedOperationException(directive);
        }
    }

    private void initializeMicrophone() {
    }

    private void notifyExpectSpeechDirective() {
        Iterator<ExpectSpeechListener> it2 = this.expectSpeechListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onExpectSpeechDirective();
        }
    }

    private void sendExceptionEncounteredEvent(String str, DirectiveHandlingException.ExceptionType exceptionType, Exception exc) {
        sendRequest(RequestFactory.createSystemExceptionEncounteredEvent(str, exceptionType, exc.getMessage(), this.player.getPlaybackState(), this.player.getSpeechState(), getAlertState(), this.player.getVolumeState()));
        LogHelper.e(TAG, exceptionType, " error handling directive: ", str, exc);
    }

    private void throwUnsupportedOperationException(Directive directive) throws DirectiveHandlingException {
        throw new DirectiveHandlingException(DirectiveHandlingException.ExceptionType.UNSUPPORTED_OPERATION, String.format("The device's %s component cannot handle the %s directive", directive.getNamespace(), directive.getName()));
    }

    @Override // com.amazon.alexa.avs.DirectiveDispatcher
    public synchronized void dispatch(Directive directive) {
        String namespace = directive.getNamespace();
        LogHelper.v(TAG, "Handling directive : ", namespace, directive.getName());
        this.dialogRequestIdAuthority.isCurrentDialogRequestId(directive.getDialogRequestId());
        try {
            if ("SpeechRecognizer".equals(namespace)) {
                handleSpeechRecognizerDirective(directive);
            } else if ("SpeechSynthesizer".equals(namespace)) {
                handleSpeechSynthesizerDirective(directive);
            } else if ("AudioPlayer".equals(namespace)) {
                handleAudioPlayerDirective(directive);
            } else if ("Alerts".equals(namespace)) {
                handleAlertsDirective(directive);
            } else if (AVSAPIConstants.Notifications.NAMESPACE.equals(namespace)) {
                handleNotificationsDirective(directive);
            } else if ("Speaker".equals(namespace)) {
                handleSpeakerDirective(directive);
            } else if ("System".equals(namespace)) {
                handleSystemDirective(directive);
            } else {
                if (!AVSAPIConstants.TemplateRuntime.NAMESPACE.equals(namespace)) {
                    throw new DirectiveHandlingException(DirectiveHandlingException.ExceptionType.UNSUPPORTED_OPERATION, "No device side component to handle the directive.");
                }
                handleTemplateRuntimeDirective(directive);
            }
        } catch (DirectiveHandlingException e) {
            sendExceptionEncounteredEvent(directive.getRawMessage(), e.getType(), e);
        } catch (Exception e2) {
            sendExceptionEncounteredEvent(directive.getRawMessage(), DirectiveHandlingException.ExceptionType.INTERNAL_ERROR, e2);
            throw e2;
        }
    }

    public boolean eventRunning() {
        return this.eventRunning;
    }

    public void init(ListenHandler listenHandler, CardHandler cardHandler) {
        this.stopCaptureHandler = listenHandler;
        this.expectSpeechListeners = new HashSet();
        this.wakeWordDetectedHandler = listenHandler;
        this.cardHandler = cardHandler;
    }

    public boolean isPlaying() {
        return false;
    }

    public boolean isSpeaking() {
        return false;
    }

    @Override // com.amazon.alexa.avs.AlertEventListener
    public void onAlertDelete(String str, boolean z) {
        sendRequest(RequestFactory.createAlertsDeleteAlertEvent(str, z));
    }

    @Override // com.amazon.alexa.avs.AlertEventListener
    public void onAlertSet(String str, boolean z) {
        sendRequest(RequestFactory.createAlertsSetAlertEvent(str, z));
    }

    @Override // com.amazon.alexa.avs.AlertEventListener
    public void onAlertStarted(String str) {
        sendRequest(RequestFactory.createAlertsAlertStartedEvent(str));
    }

    @Override // com.amazon.alexa.avs.AlertEventListener
    public void onAlertStopped(String str) {
        sendRequest(RequestFactory.createAlertsAlertStoppedEvent(str));
    }

    @Override // com.amazon.alexa.avs.AlexaSpeechListener
    public void onAlexaSpeechFinished() {
        log.debug("onAlexaSpeechFinished ", new Exception(""));
        this.dependentDirectiveThread.unblock();
    }

    @Override // com.amazon.alexa.avs.AlexaSpeechListener
    public void onAlexaSpeechStarted() {
        this.dependentDirectiveThread.block();
    }

    @Override // com.amazon.alexa.avs.http.ParsingFailedHandler
    public void onParsingFailed(int i, String str) {
    }

    @Override // com.amazon.alexa.avs.UserActivityListener
    public void onUserActivity() {
        this.lastUserInteractionTimestampSeconds.set(System.currentTimeMillis() / 1000);
    }

    @Override // com.amazon.alexa.avs.wakeword.WakeWordDetectedHandler
    public synchronized void onWakeWordDetected() {
        if (this.acceptWakeWordEvents) {
            this.wakeWordDetectedHandler.onWakeWordDetected();
        }
    }

    public void processingFinished() {
        LogHelper.d(TAG, "Speech processing finished. Dependent queue size : ", Integer.valueOf(this.dependentQueue.size()));
    }

    @Override // com.amazon.alexa.avs.RecordingStateListener
    public void recordingCompleted() {
    }

    @Override // com.amazon.alexa.avs.RecordingStateListener
    public void recordingStarted() {
    }

    public void sendAudioDataRequest(byte[] bArr) {
        this.avsClient.sendEvent(RequestFactory.createSpeechRecognizerRecognizeRequest(this.dialogRequestIdAuthority.createNewDialogRequestId(), PROFILE, FORMAT, null, null, null, null), bArr, (RequestListener) null);
    }

    public void sendRequest(RequestBody requestBody) {
        this.eventRunning = true;
        try {
            this.avsClient.sendEvent(requestBody);
        } catch (Exception e) {
            log.error("Failed to send request", e);
        }
        this.eventRunning = false;
    }

    public void sendSynchronizeStateEvent() throws InterruptedException {
        sendRequest(RequestFactory.createSystemSynchronizeStateEvent(this.player.getPlaybackState(), this.player.getSpeechState(), getAlertState(), this.player.getVolumeState(), getNotificationState()));
    }

    public void setLocale(Locale locale) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LocaleSetting(locale.toLanguageTag()));
        sendRequest(RequestFactory.createSettingsUpdatedEvent(arrayList));
    }

    @Override // com.amazon.alexa.avs.AlertHandler
    public void startAlert(String str) {
    }

    public void startHandlingDirectives() {
        this.dependentDirectiveThread.start();
        this.independentDirectiveThread.start();
    }

    public void startRecording(RecordingRMSListener recordingRMSListener, RequestListener requestListener, InputStream inputStream) {
        if (this.wakeWordAgentEnabled) {
            this.acceptWakeWordEvents = false;
            try {
                this.wakeWordIPC.sendCommand(WakeWordIPC.IPCCommand.IPC_PAUSE_WAKE_WORD_ENGINE);
            } catch (IOException unused) {
                log.warn("Could not send the IPC_PAUSE_WAKE_WORD_ENGINE command");
            }
        }
        try {
            RequestBody requestBodyCreateSpeechRecognizerRecognizeRequest = RequestFactory.createSpeechRecognizerRecognizeRequest(this.dialogRequestIdAuthority.createNewDialogRequestId(), PROFILE, FORMAT, this.player.getPlaybackState(), this.player.getSpeechState(), getAlertState(), this.player.getVolumeState());
            this.dependentQueue.clear();
            log.debug("#####avsClient send event#####");
            this.avsClient.sendEvent(requestBodyCreateSpeechRecognizerRecognizeRequest, inputStream, requestListener);
        } catch (Exception e) {
            requestListener.onRequestError(e);
        }
    }

    @Override // com.amazon.alexa.avs.AlertHandler
    public void stopAlert(String str) {
    }

    public void stopRecording() {
        if (this.wakeWordAgentEnabled) {
            try {
                this.wakeWordIPC.sendCommand(WakeWordIPC.IPCCommand.IPC_RESUME_WAKE_WORD_ENGINE);
            } catch (IOException e) {
                log.warn("could not send resume wake word engine command", e);
            }
            this.acceptWakeWordEvents = true;
        }
    }

    public void sendAudioDataRequest(InputStream inputStream) {
        this.avsClient.sendEvent(RequestFactory.createSpeechRecognizerRecognizeRequest(this.dialogRequestIdAuthority.createNewDialogRequestId(), PROFILE, FORMAT, null, null, null, null), inputStream, (RequestListener) null);
    }
}
