package com.xiaomi.ai.android.core;

import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.SpeechWakeup;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import defpackage.bf8;
import defpackage.wpe;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Event> f10892b = new ConcurrentHashMap();
    private String c;
    private Set<String> d;
    private Set<String> e;

    public f(e eVar) {
        new ConcurrentHashMap();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f10891a = eVar;
        this.d.add(AIApiConstants.SpeechRecognizer.Cancel);
        this.d.add(AIApiConstants.System.Ack);
        this.d.add(AIApiConstants.Settings.GlobalConfig);
        this.d.add(AIApiConstants.General.ContextUpdate);
        this.d.add(AIApiConstants.System.ClientPing);
        this.d.add(AIApiConstants.Nlp.UploadDialogState);
        this.e.add(AIApiConstants.General.Push);
    }

    public String a() {
        return this.c;
    }

    public void b() {
        StringBuilder sb;
        String str;
        Iterator<Map.Entry<String, Event>> it = this.f10892b.entrySet().iterator();
        while (it.hasNext()) {
            Event value = it.next().getValue();
            if (AIApiConstants.General.UpdateGlobalContexts.equals(value.getFullName())) {
                sb = new StringBuilder();
                str = "interrupt: UpdateGlobalContexts has no response yet, eventId=";
            } else {
                Event eventBuildEvent = APIUtils.buildEvent(new SpeechRecognizer.Cancel(), null, value.getId());
                this.f10891a.s().obtainMessage(2, new bf8(eventBuildEvent, eventBuildEvent.toString())).sendToTarget();
                sb = new StringBuilder();
                str = "interrupt: cancel eventId=";
            }
            sb.append(str);
            sb.append(value.getId());
            wpe.h("EventManager", sb.toString());
            it.remove();
        }
    }

    public void c() {
        wpe.h("EventManager", "release: recorded event count=" + this.f10892b.size());
        this.f10892b.clear();
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean b(Event event) {
        if (!AIApiConstants.SpeechWakeup.Wakeup.equals(event.getFullName())) {
            return false;
        }
        SpeechWakeup.Wakeup wakeup = (SpeechWakeup.Wakeup) event.getPayload();
        return wakeup.isRecognizeFollowed() != null && wakeup.isRecognizeFollowed().c() && wakeup.isRecognizeFollowed().b().booleanValue();
    }

    public boolean a(Event event) {
        return AIApiConstants.SpeechRecognizer.Recognize.equals(event.getFullName()) || AIApiConstants.SpeechSynthesizer.Synthesize.equals(event.getFullName()) || AIApiConstants.Nlp.Request.equals(event.getFullName()) || AIApiConstants.SpeechRecognizer.DuplexRecognizeStarted.equals(event.getFullName()) || "Internal".equals(event.getNamespace()) || b(event);
    }

    public void c(Event event) {
        if (!this.d.contains(event.getFullName())) {
            this.f10892b.put(event.getId(), event);
        }
        if (a(event)) {
            this.c = event.getId();
        }
    }

    public boolean a(Instruction instruction) {
        String strB;
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null) {
            wpe.e("EventManager", "process:dialogId is null," + instruction.getFullName());
            return true;
        }
        if (!dialogId.c() || this.e.contains(instruction.getFullName())) {
            return true;
        }
        Optional<String> transactionId = instruction.getHeader().getTransactionId();
        if (transactionId == null || !transactionId.c()) {
            strB = dialogId.b();
        } else {
            strB = transactionId.b();
            wpe.b("EventManager", "process: with TransactionId: " + strB);
        }
        if (this.f10892b.get(strB) == null) {
            wpe.k("EventManager", "process: not found for instruction " + instruction.getFullName() + "," + strB);
            return false;
        }
        if (AIApiConstants.Dialog.Finish.equals(instruction.getFullName()) && dialogId.b().equals(strB)) {
            wpe.h("EventManager", "process: remove eventKey=" + strB);
            this.f10892b.remove(strB);
            String str = this.c;
            if (str != null && str.equals(strB)) {
                this.c = null;
            }
        }
        return true;
    }

    public boolean a(String str) {
        return str != null && this.f10892b.containsKey(str);
    }
}
