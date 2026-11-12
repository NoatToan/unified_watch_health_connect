package com.xiaomi.ai.android.b;

import android.text.TextUtils;
import com.xiaomi.ai.android.core.e;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.General;
import com.xiaomi.ai.api.Internal;
import com.xiaomi.ai.api.Nlp;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.api.common.InstructionHeader;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.intent.dialog;
import com.xiaomi.ai.local.interfaces.InstructionService;
import com.xiaomi.ai.local.interfaces.LocalEventRequest;
import com.xiaomi.ai.local.interfaces.LocalEventRequestPayload;
import com.xiaomi.ai.local.interfaces.LocalEventRequestProps;
import com.xiaomi.ai.local.interfaces.LocalEventResponse;
import com.xiaomi.ai.local.interfaces.LocalEventResponsePayload;
import com.xiaomi.ai.local.interfaces.LocalExecutor;
import com.xiaomi.ai.local.interfaces.LocalSkillRequest;
import com.xiaomi.ai.local.interfaces.LocalSkillRequestPayload;
import com.xiaomi.ai.local.interfaces.LocalSkillRequestProps;
import com.xiaomi.ai.local.interfaces.LocalSkillResponsePayload;
import com.xiaomi.common.Optional;
import defpackage.dcd;
import defpackage.wpe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f10863a;
    private String e;
    private final LocalExecutor g;
    private boolean i;
    private boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10865k;
    private boolean l;
    private String m;
    private final Set<String> n;
    private final Set<String> o;
    private final Set<String> p;
    private final Set<String> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10866r;
    private boolean s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f10864b = new a(true);
    private final a c = new a(false);
    private final List<Instruction<? extends InstructionPayload>> d = new ArrayList();
    private final LinkedList<byte[]> f = new LinkedList<>();
    private final c h = new c();

    public b(e eVar, LocalExecutor localExecutor) {
        HashSet hashSet = new HashSet();
        this.n = hashSet;
        HashSet hashSet2 = new HashSet();
        this.o = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.p = hashSet3;
        this.q = new HashSet();
        this.f10866r = false;
        this.s = false;
        this.f10863a = eVar;
        this.g = localExecutor;
        hashSet.add(AIApiConstants.SpeechRecognizer.Cancel);
        hashSet.add(AIApiConstants.System.Ack);
        hashSet.add(AIApiConstants.Settings.GlobalConfig);
        hashSet.add(AIApiConstants.System.ClientPing);
        hashSet.add(AIApiConstants.Nlp.UploadDialogState);
        hashSet.add(AIApiConstants.General.UpdateGlobalContexts);
        hashSet.add(AIApiConstants.General.ContextUpdate);
        hashSet2.add(AIApiConstants.SpeechRecognizer.RecognizeStreamFinished);
        hashSet2.add(AIApiConstants.SpeechRecognizer.DuplexRecognizeFinished);
        hashSet3.add(AIApiConstants.SpeechRecognizer.StopCapture);
        hashSet3.add(AIApiConstants.General.Push);
        hashSet3.add(AIApiConstants.System.Pong);
        hashSet3.add(AIApiConstants.System.Heartbeat);
        hashSet3.add(AIApiConstants.Nlp.EventACK);
        localExecutor.setInstructionService(new InstructionService() { // from class: z8s
        });
    }

    private List<Context<ContextPayload>> b() {
        List<Context<ContextPayload>> listA = this.f10864b.a(this.c);
        if (this.h.c() != null) {
            listA.add(this.h.c());
        }
        wpe.b("Interceptor", "getContextList:" + listA);
        return listA;
    }

    private void c() {
        if (this.l) {
            wpe.h("Interceptor", "prepare to upload OfflineSession");
            Nlp.OfflineSession offlineSessionB = this.h.b();
            if (offlineSessionB.getData() == null || offlineSessionB.getData().isEmpty()) {
                return;
            }
            Nlp.OfflineSessionItemInfo offlineSessionItemInfo = offlineSessionB.getData().get(0);
            if (offlineSessionItemInfo.getDialogStates().c()) {
                if (offlineSessionItemInfo.getDialogStates().b().isEmpty()) {
                    wpe.h("Interceptor", "updateDuplexContext: no dialog state");
                    return;
                }
                General.ContextUpdate contextUpdate = new General.ContextUpdate();
                contextUpdate.setEnableIncrementalUpdate(true);
                ArrayList arrayList = new ArrayList();
                offlineSessionB.setClientTimestamp(System.currentTimeMillis());
                arrayList.add(APIUtils.buildContext(offlineSessionB));
                this.f10863a.postEvent(APIUtils.buildEvent(contextUpdate, arrayList, this.m));
            }
        }
    }

    private void d() {
        if (!this.f10865k) {
            wpe.b("Interceptor", "uploadDialogState: dialog state not changed");
            return;
        }
        Nlp.UploadDialogState uploadDialogStateA = this.h.a();
        wpe.h("Interceptor", "prepare to upload uploadDialogState " + uploadDialogStateA);
        if (uploadDialogStateA != null) {
            this.f10863a.postEvent(APIUtils.buildEvent(uploadDialogStateA));
        }
        this.f10865k = false;
    }

    private LocalSkillResponsePayload a(String str) {
        LocalSkillRequest localSkillRequest = new LocalSkillRequest();
        LocalSkillRequestProps localSkillRequestProps = new LocalSkillRequestProps();
        localSkillRequestProps.setRequestId(str);
        localSkillRequestProps.setClientInfo(this.f10863a.h());
        localSkillRequestProps.setContexts(b());
        LocalSkillRequestProps.DeviceInfo deviceInfo = new LocalSkillRequestProps.DeviceInfo();
        deviceInfo.setAppId(this.f10863a.i().i("auth.client_id"));
        deviceInfo.setUserAgent(this.f10863a.i().i("connection.user_agent"));
        localSkillRequestProps.setDeviceInfo(Optional.d(deviceInfo));
        localSkillRequest.setProps(localSkillRequestProps);
        LocalSkillRequestPayload localSkillRequestPayload = new LocalSkillRequestPayload();
        localSkillRequestPayload.setDialogState(Optional.d(new dialog.DialogState()));
        localSkillRequestPayload.setQuery(this.e);
        localSkillRequestPayload.setInstructions(this.d);
        String strI = this.f10863a.i().i("locale.lang");
        if (!TextUtils.isEmpty(strI)) {
            wpe.b("Interceptor", "set lang " + strI);
            localSkillRequestPayload.setLocale(Optional.d(strI));
        }
        localSkillRequest.setPayload(localSkillRequestPayload);
        try {
            return this.g.process(localSkillRequest).getPayload();
        } catch (Exception e) {
            wpe.e("Interceptor", "local executor execute failed: " + wpe.o(e));
            LocalSkillResponsePayload localSkillResponsePayload = new LocalSkillResponsePayload();
            localSkillResponsePayload.setInstructions(this.d);
            Boolean bool = Boolean.FALSE;
            localSkillResponsePayload.setTtsChanged(bool);
            localSkillResponsePayload.setDialogStateChanged(bool);
            return localSkillResponsePayload;
        }
    }

    private void b(final Event event) {
        String str;
        wpe.h("Interceptor", "processInternalEvent: " + event.getId());
        LocalEventRequest localEventRequest = new LocalEventRequest();
        LocalEventRequestPayload localEventRequestPayload = new LocalEventRequestPayload();
        LocalEventRequestProps localEventRequestProps = new LocalEventRequestProps();
        localEventRequestPayload.setEvent(event);
        String strI = this.f10863a.i().i("locale.lang");
        if (!TextUtils.isEmpty(strI)) {
            localEventRequestPayload.setLocale(Optional.d(strI));
        }
        Nlp.UploadDialogState uploadDialogStateA = this.h.a();
        if (uploadDialogStateA != null) {
            if (uploadDialogStateA.getDialogStates() == null || uploadDialogStateA.getDialogStates().isEmpty()) {
                str = "dialogState is empty";
            } else {
                wpe.h("Interceptor", "processInternalEvent: get dialog state from session:" + uploadDialogStateA);
                localEventRequestPayload.setDialogState(Optional.d(uploadDialogStateA.getDialogStates().get(0)));
            }
            localEventRequestProps.setRequestId(event.getId());
            localEventRequestProps.setClientInfo(this.f10863a.h());
            localEventRequestProps.setContexts(b());
            localEventRequest.setPayload(localEventRequestPayload);
            localEventRequest.setProps(localEventRequestProps);
            this.g.eventAsyncProcess(localEventRequest, new Consumer() { // from class: y8s
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f39940a.a(event, (LocalEventResponse) obj);
                }
            });
        }
        str = "dialogState == null";
        wpe.h("Interceptor", str);
        localEventRequestProps.setRequestId(event.getId());
        localEventRequestProps.setClientInfo(this.f10863a.h());
        localEventRequestProps.setContexts(b());
        localEventRequest.setPayload(localEventRequestPayload);
        localEventRequest.setProps(localEventRequestProps);
        this.g.eventAsyncProcess(localEventRequest, new Consumer() { // from class: y8s
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f39940a.a(event, (LocalEventResponse) obj);
            }
        });
    }

    private void a() {
        wpe.b("Interceptor", "clearStats");
        this.d.clear();
        this.f.clear();
        wpe.b("Interceptor", "clearStats done");
        this.i = false;
        this.j = false;
        this.f10865k = false;
        this.s = false;
        this.f10866r = false;
    }

    private /* synthetic */ void b(Instruction instruction) {
        wpe.b("Interceptor", "pushInstructions:" + instruction);
        a(instruction, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Event event, LocalEventResponse localEventResponse) {
        wpe.h("Interceptor", "eventAsyncProcess: requestId=" + localEventResponse.getRequestId() + ", stdStatus=" + localEventResponse.getStdStatus());
        LocalEventResponsePayload payload = localEventResponse.getPayload();
        dialog.DialogState dialogState = payload.getDialogState().c() ? (dialog.DialogState) payload.getDialogState().b() : null;
        this.f10865k = payload.getDialogStateChanged().booleanValue();
        this.h.a(event.getId(), payload.getInstructions(), dialogState, this.f10865k);
        synchronized (this) {
            try {
                if (this.f10866r) {
                    wpe.b("Interceptor", "processInternalEvent: ignore result for during request");
                } else {
                    Iterator it = payload.getInstructions().iterator();
                    while (it.hasNext()) {
                        a((Instruction) it.next(), false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f10865k) {
            d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void a(Instruction instruction) {
        if (this.g == null) {
            wpe.e("Interceptor", "interceptInstruction: mLocalExecutor is not set");
            a(instruction, false);
            return;
        }
        if (!instruction.getDialogId().c()) {
            a(instruction, false);
            return;
        }
        String strB = instruction.getDialogId().b();
        if (!this.q.contains(strB)) {
            Optional<String> transactionId = instruction.getHeader().getTransactionId();
            if (!transactionId.c() || !this.q.contains(transactionId.b())) {
                wpe.b("Interceptor", "interceptInstruction: skip unknown instruction: " + instruction);
                a(instruction, false);
                this.s = true;
                return;
            }
        }
        this.s = false;
        if (this.p.contains(instruction.getFullName())) {
            wpe.b("Interceptor", "interceptInstruction: skip " + instruction.getFullName() + ", " + strB);
            a(instruction, false);
            return;
        }
        wpe.b("Interceptor", "interceptInstruction:" + instruction.getFullName() + ", " + strB);
        if (this.i) {
            if (this.j && AIApiConstants.SpeechSynthesizer.FinishSpeakStream.equals(instruction.getFullName())) {
                wpe.h("Interceptor", "ignore FinishSpeakStream because tts changed");
                return;
            }
            wpe.b("Interceptor", "interceptInstruction: forward " + instruction.getFullName() + ", " + strB);
            a(instruction, false);
            return;
        }
        if (AIApiConstants.SpeechRecognizer.RecognizeResult.equals(instruction.getFullName())) {
            SpeechRecognizer.RecognizeResult recognizeResult = (SpeechRecognizer.RecognizeResult) instruction.getPayload();
            if (recognizeResult.isFinal() && !recognizeResult.getResults().isEmpty()) {
                this.e = recognizeResult.getResults().get(0).getText();
            }
            a(instruction, false);
            return;
        }
        this.d.add(instruction);
        if (AIApiConstants.Nlp.FinishAnswer.equals(instruction.getFullName()) || AIApiConstants.Dialog.Finish.equals(instruction.getFullName())) {
            this.i = true;
            wpe.h("Interceptor", "start to process instructions with local executor, " + strB);
            LocalSkillResponsePayload localSkillResponsePayloadA = a(strB);
            dialog.DialogState dialogState = localSkillResponsePayloadA.getDialogState().c() ? (dialog.DialogState) localSkillResponsePayloadA.getDialogState().b() : null;
            this.f10865k = localSkillResponsePayloadA.getDialogStateChanged().booleanValue();
            this.h.a(strB, localSkillResponsePayloadA.getInstructions(), dialogState, this.f10865k);
            boolean zBooleanValue = localSkillResponsePayloadA.getTtsChanged().booleanValue();
            this.j = zBooleanValue;
            if (!zBooleanValue) {
                for (Instruction instruction2 : localSkillResponsePayloadA.getInstructions()) {
                    if (AIApiConstants.Internal.OfflineExecution.equals(instruction2.getFullName())) {
                        Internal.OfflineExecution offlineExecution = (Internal.OfflineExecution) instruction2.getPayload();
                        if (offlineExecution.getTtsChanged().c()) {
                            this.j = offlineExecution.getTtsChanged().b().isTtsChanged();
                            wpe.h("Interceptor", "get mTtsChanged=" + this.j + " from Internal.OfflineExecution");
                        }
                    }
                }
            }
            wpe.h("Interceptor", "end to process instructions with local executor, mTtsChanged=" + this.j);
            for (Instruction instruction3 : localSkillResponsePayloadA.getInstructions()) {
                wpe.h("Interceptor", "interceptInstruction: dispatch local executor result " + instruction3.getFullName());
                if (AIApiConstants.SpeechSynthesizer.Speak.equals(instruction3.getFullName())) {
                    a(instruction3, this.j);
                    if (!this.j) {
                        while (!this.f.isEmpty()) {
                            byte[] bArrPoll = this.f.poll();
                            wpe.h("Interceptor", "interceptInstruction: process tts, size=" + bArrPoll.length);
                            this.f10863a.f().a(bArrPoll);
                        }
                    }
                } else if (this.j && AIApiConstants.SpeechSynthesizer.FinishSpeakStream.equals(instruction3.getFullName())) {
                    wpe.h("Interceptor", "ignore FinishSpeakStream because tts changed");
                } else {
                    a(instruction3, this.j);
                }
            }
            wpe.h("Interceptor", "clear tts and instruction");
            this.f.clear();
            this.d.clear();
        }
    }

    private void a(Instruction instruction, boolean z) {
        if (AIApiConstants.Dialog.Finish.equals(instruction.getFullName())) {
            InstructionHeader header = instruction.getHeader();
            if (header.getIsOffline() != null && header.getIsOffline().c() && header.getIsOffline().b().booleanValue()) {
                c();
            } else {
                d();
            }
            a();
        }
        this.f10863a.f().a(new dcd(instruction, instruction.toString()), z);
    }

    public synchronized void a(byte[] bArr) {
        if (this.g != null && !this.s) {
            if (!this.i) {
                wpe.b("Interceptor", "interceptTts: cache tts, size=" + bArr.length);
                this.f.add(bArr);
                return;
            }
            wpe.b("Interceptor", "interceptTts: forward tts, mTtsChanged=" + this.j);
            if (!this.j) {
                this.f10863a.f().a(bArr);
            }
            return;
        }
        wpe.e("Interceptor", "interceptTts: mLocalExecutor is not set or mUnsupportedRequest=" + this.s);
        this.f10863a.f().a(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized boolean a(Event event) {
        Set<String> set;
        if (this.g == null) {
            wpe.e("Interceptor", "interceptEvent: mLocalExecutor is not set");
            return false;
        }
        if ("Internal".equals(event.getNamespace())) {
            try {
                b(event);
            } catch (Exception unused) {
                wpe.h("Interceptor", "interceptEvent: failed " + event.getFullName());
            }
            return true;
        }
        if (this.o.contains(event.getFullName())) {
            wpe.b("Interceptor", "interceptEvent: end of dialog " + event.getFullName() + ", " + event.getId());
            return false;
        }
        this.f10864b.a((Event<?>) event);
        this.c.a((Event<?>) event);
        this.h.a(event);
        if (this.n.contains(event.getFullName())) {
            wpe.b("Interceptor", "interceptEvent: forward " + event.getFullName() + ", " + event.getId());
            return false;
        }
        wpe.b("Interceptor", "interceptEvent: intercept " + event.getFullName() + ", " + event.getId());
        if (AIApiConstants.Nlp.Request.equals(event.getFullName())) {
            this.e = ((Nlp.Request) event.getPayload()).getQuery();
        }
        if (AIApiConstants.Nlp.Request.equals(event.getFullName()) || AIApiConstants.SpeechRecognizer.Recognize.equals(event.getFullName()) || AIApiConstants.SpeechRecognizer.DuplexRecognizeStarted.equals(event.getFullName())) {
            if (AIApiConstants.SpeechRecognizer.DuplexRecognizeStarted.equals(event.getFullName())) {
                this.l = true;
                this.m = event.getId();
                set = this.q;
            } else {
                this.l = false;
                Context contextC = this.h.c();
                if (contextC != null) {
                    wpe.b("Interceptor", "add session context: " + contextC);
                    event.addContext(contextC);
                }
                if (AIApiConstants.SpeechRecognizer.Recognize.equals(event.getFullName())) {
                    set = this.q;
                }
                this.q.add(event.getId());
                a();
                this.f10866r = true;
            }
            set.clear();
            this.q.add(event.getId());
            a();
            this.f10866r = true;
        }
        return false;
    }
}
