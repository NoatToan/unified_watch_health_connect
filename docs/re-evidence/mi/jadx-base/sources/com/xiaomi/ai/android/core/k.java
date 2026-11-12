package com.xiaomi.ai.android.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.f01;
import defpackage.klp;
import defpackage.nnp;
import defpackage.wpe;
import defpackage.yrs;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerThread f10909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f10910b;
    private e c;
    private nnp d;
    private com.xiaomi.ai.android.track.d e;
    private Map<String, klp> f = new ConcurrentHashMap();
    private Set<String> g = new CopyOnWriteArraySet();
    private Map<String, Long> h = new ConcurrentHashMap();
    private Map<String, Long> i = new ConcurrentHashMap();
    private Set<String> j = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10911k = 0;
    private boolean l = false;
    private long m = 0;
    private boolean n = false;
    private String o;
    private String p;

    public class a implements com.xiaomi.ai.android.track.b.d {
        public a() {
        }

        @Override // com.xiaomi.ai.android.track.b.d
        public void a() {
            wpe.b("TrackManager", "onTrackFinish");
            if (k.this.g == null || k.this.g.size() <= 0) {
                return;
            }
            Iterator it = k.this.g.iterator();
            while (it.hasNext()) {
                k.this.f.remove((String) it.next());
            }
            k.this.g.clear();
        }

        @Override // com.xiaomi.ai.android.track.b.d
        public void onError(f01 f01Var) {
        }
    }

    public class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                k.this.a(((Boolean) message.obj).booleanValue());
            } else if (i == 1) {
                k.this.b();
            } else if (i == 2) {
                k.this.a((c4h) message.obj);
            } else if (i == 3) {
                k.this.a((String) message.obj);
            } else if (i == 4) {
                k.this.c();
            } else if (i == 5) {
                k.this.d();
            }
            return true;
        }
    }

    public k(e eVar) {
        this.c = eVar;
        com.xiaomi.ai.android.track.a aVar = new com.xiaomi.ai.android.track.a(eVar);
        this.d = aVar;
        this.e = new com.xiaomi.ai.android.track.d(this.c, aVar, new a());
        if (this.c.i().b("track.enable")) {
            HandlerThread handlerThread = new HandlerThread("TrackThread");
            this.f10909a = handlerThread;
            handlerThread.start();
            this.f10910b = new Handler(this.f10909a.getLooper(), new b());
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a(false);
        this.e = null;
        this.f10910b.removeCallbacksAndMessages(null);
        this.f10909a.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        nnp nnpVar = this.d;
        if (nnpVar instanceof com.xiaomi.ai.android.track.a) {
            ((com.xiaomi.ai.android.track.a) nnpVar).b();
        }
    }

    public nnp a() {
        return this.d;
    }

    public void e() {
        if (NetworkUtils.isNetworkAvailable(this.c.j())) {
            this.f10910b.obtainMessage(1).sendToTarget();
        }
    }

    public void f() {
        if (this.c.i().b("track.enable")) {
            this.f10910b.obtainMessage(5).sendToTarget();
        }
    }

    public void g() {
        if (this.c.i().b("track.enable")) {
            wpe.h("TrackManager", "release:remain track data num:" + this.d.getTrackDataNum());
            this.f10910b.obtainMessage(4).sendToTarget();
        }
    }

    public void h() {
        if (this.c.i().b("track.enable")) {
            String strA = this.c.m().a();
            if (yrs.b(strA)) {
                return;
            }
            b(strA);
        }
    }

    public void i() {
        if (this.c.i().b("track.enable")) {
            String strA = this.c.m().a();
            if (yrs.b(strA)) {
                return;
            }
            c(strA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.xiaomi.ai.android.track.d dVar = this.e;
        if (dVar != null) {
            dVar.g();
        }
    }

    public void f(Instruction instruction) {
        if (this.c.i().b("track.enable")) {
            b(instruction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c4h c4hVar) {
        klp klpVarCreateTrackData;
        String strL = c4hVar.T("eventId").l();
        if (yrs.b(strL)) {
            wpe.h("TrackManager", "mergeAppData: eventId is not set, create new trackData");
            klpVarCreateTrackData = this.d.createTrackData();
        } else {
            klp klpVarCreateTrackData2 = this.f.get(strL);
            if (klpVarCreateTrackData2 == null) {
                wpe.k("TrackManager", "mergeAppData: eventId:" + strL + " is not existed");
                klpVarCreateTrackData2 = this.d.createTrackData();
                klpVarCreateTrackData2.h("request.id", strL);
            }
            klpVarCreateTrackData = klpVarCreateTrackData2;
            klpVarCreateTrackData.b();
        }
        klpVarCreateTrackData.f(c4hVar);
        wpe.b("TrackManager", "mergeAppData:" + c4hVar.toString());
        a(true);
    }

    public void b(c4h c4hVar) {
        if (this.c.i().b("track.enable")) {
            this.f10910b.obtainMessage(2, c4hVar).sendToTarget();
        }
    }

    public void c(Event event) {
        klp klpVar;
        long jCurrentTimeMillis;
        String str;
        String id = event.getId();
        wpe.b("TrackManager", id);
        if (yrs.b(id) || (klpVar = this.f.get(id)) == null) {
            return;
        }
        if (AIApiConstants.SpeechRecognizer.Recognize.equals(event.getFullName())) {
            jCurrentTimeMillis = System.currentTimeMillis();
            str = "v5.sdk.asr.send.recognizer.recognize.out";
        } else if (AIApiConstants.SpeechRecognizer.RecognizeStreamFinished.equals(event.getFullName())) {
            jCurrentTimeMillis = System.currentTimeMillis();
            str = "v5.sdk.asr.send.recognizer.recognizefinished.out";
        } else if (AIApiConstants.General.ContextUpdate.equals(event.getFullName())) {
            this.n = true;
            return;
        } else {
            if (!AIApiConstants.Nlp.Request.equals(event.getFullName())) {
                return;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            str = "v5.sdk.nlp.request.out";
        }
        klpVar.i(str, jCurrentTimeMillis);
    }

    public void d(Instruction instruction) {
        if (this.c.i().b("track.enable")) {
            a(instruction);
        }
    }

    public void e(Instruction instruction) {
        if (this.c.i().b("track.enable")) {
            c(instruction);
        }
    }

    private void c(Instruction instruction) {
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null || !dialogId.c()) {
            return;
        }
        klp klpVar = this.f.get(dialogId.b());
        wpe.b("TrackManager", "handle InstructionCall: " + instruction.getFullName() + ", " + ((Object) dialogId.b()));
        if (klpVar == null) {
            return;
        }
        String fullName = instruction.getFullName();
        fullName.hashCode();
        if (fullName.equals(AIApiConstants.SpeechRecognizer.RecognizeResult) && klpVar.d("v5.sdk.asr.recv.first.partial.call") == 0) {
            klpVar.i("v5.sdk.asr.recv.first.partial.call", System.currentTimeMillis());
        }
    }

    public void b(Event event) {
        if (this.c.i().b("track.enable")) {
            wpe.f("TrackManager", "trackEvent:" + event.getId() + "," + event.getFullName(), false);
            a(event);
        }
    }

    public void d(String str) {
        klp klpVar;
        if (!this.c.i().b("track.enable") || str == null || (klpVar = this.f.get(str)) == null) {
            return;
        }
        if (klpVar.d("v5.sdk.wakeup.send.first.binary.in") != 0 && klpVar.d("v5.sdk.asr.send.recognizer.recognize.out") == 0) {
            if (klpVar.d("v5.sdk.wakeup.send.first.binary.out") == 0) {
                klpVar.i("v5.sdk.wakeup.send.first.binary.out", System.currentTimeMillis());
                return;
            } else {
                klpVar.i("v5.sdk.wakeup.send.last.binary.out", System.currentTimeMillis());
                return;
            }
        }
        if (klpVar.d("v5.sdk.asr.send.first.binary.out") == 0) {
            klpVar.i("v5.sdk.asr.send.first.binary.out", System.currentTimeMillis());
        } else {
            klpVar.i("v5.sdk.asr.send.last.binary.out", System.currentTimeMillis());
        }
        if (this.m == 0) {
            this.m = System.currentTimeMillis();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.m;
        this.m = System.currentTimeMillis();
        String str2 = this.n ? "v5.sdk.asr.send.binary.include.event.interval.out" : "v5.sdk.asr.send.binary.exclude.event.interval.out";
        if (jCurrentTimeMillis > klpVar.d(str2)) {
            klpVar.i(str2, jCurrentTimeMillis);
        }
        this.n = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(Instruction instruction) {
        klp klpVar;
        long jCurrentTimeMillis;
        String str;
        Long l;
        Long l2;
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null || !dialogId.c()) {
            return;
        }
        Optional<String> transactionId = instruction.getHeader().getTransactionId();
        if (transactionId == null || !transactionId.c()) {
            klpVar = this.f.get(dialogId.b());
        } else if (this.j.contains(transactionId.b())) {
            klpVar = this.f.get(transactionId.b());
            wpe.b("TrackManager", "the first instructions group, " + ((Object) dialogId.b()));
        } else {
            klpVar = this.f.get(dialogId.b());
            if (klpVar == null) {
                wpe.b("TrackManager", "the first asr result of other instructions group, " + ((Object) dialogId.b()));
                klpVar = new klp(this.d);
                this.f.put(dialogId.b(), klpVar);
                a(instruction, klpVar);
            }
        }
        wpe.f("TrackManager", "handleInstruction0: " + instruction.getFullName() + ", " + ((Object) dialogId.b()), false);
        if (klpVar == null) {
            return;
        }
        String fullName = instruction.getFullName();
        fullName.hashCode();
        switch (fullName) {
            case "System.TruncationNotification":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.asr.recv.system.truncationnotification.in";
                break;
            case "Nlp.FinishAnswer":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.nlp.recv.finishanswer.in";
                break;
            case "SpeechSynthesizer.Speak":
                SpeechSynthesizer.Speak speak = (SpeechSynthesizer.Speak) instruction.getPayload();
                if (speak == null || !speak.getUrl().c()) {
                    str = "v5.sdk.nlp.recv.speak.stream.in";
                    if (klpVar.d("v5.sdk.nlp.recv.speak.stream.in") != 0) {
                        return;
                    }
                } else {
                    str = "v5.sdk.nlp.recv.speak.url.in";
                    if (klpVar.d("v5.sdk.nlp.recv.speak.url.in") != 0) {
                        return;
                    }
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                break;
            case "Dialog.Finish":
                klpVar.i("v5.sdk.dialog.finish.in", System.currentTimeMillis());
                if (transactionId == null || !transactionId.c()) {
                    return;
                }
                this.j.remove(transactionId.b());
                wpe.b("TrackManager", "remove transactionId from the duplex track set, " + ((Object) dialogId.b()));
                return;
            case "SpeechSynthesizer.FinishSpeakStream":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.tts.recv.synthesizer.finishspeakstream.in";
                break;
            case "Nlp.StartAnswer":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.nlp.recv.startanswer.in";
                break;
            case "SpeechRecognizer.RecognizeResult":
                SpeechRecognizer.RecognizeResult recognizeResult = (SpeechRecognizer.RecognizeResult) instruction.getPayload();
                List<SpeechRecognizer.RecognizeResultItem> results = recognizeResult.getResults();
                if (results.size() > 0) {
                    SpeechRecognizer.RecognizeResultItem recognizeResultItem = results.get(0);
                    String text = recognizeResultItem.getText();
                    if (recognizeResultItem.isNlpRequest().c() && recognizeResultItem.isNlpRequest().b().booleanValue()) {
                        klpVar.i("v5.sdk.asr.recv.last.partial.for.nlp.in", System.currentTimeMillis());
                        if (!yrs.b(text)) {
                            this.o = text;
                        }
                    }
                    if (klpVar.d("v5.sdk.asr.recv.first.partial.in") == 0) {
                        klpVar.i("v5.sdk.asr.recv.first.partial.in", System.currentTimeMillis());
                    }
                    if (!yrs.b(text)) {
                        if (this.h.get(text) == null) {
                            this.h.put(text, Long.valueOf(System.currentTimeMillis()));
                        }
                        if (klpVar.d("v5.sdk.asr.recv.first.text.in") == 0) {
                            klpVar.i("v5.sdk.asr.recv.first.text.in", System.currentTimeMillis());
                        }
                    }
                    if (!recognizeResult.isFinal()) {
                        return;
                    }
                    klpVar.i("v5.sdk.asr.recv.final.in", System.currentTimeMillis());
                    Optional<Long> beginOffset = recognizeResultItem.getBeginOffset();
                    if (beginOffset.c()) {
                        klpVar.i("v5.sdk.asr.start.talking.offset", beginOffset.b().longValue());
                    }
                    Optional<Long> endOffset = recognizeResultItem.getEndOffset();
                    if (endOffset.c()) {
                        klpVar.i("v5.sdk.asr.finish.talking.offset", endOffset.b().longValue());
                    }
                    klpVar.i("v5.sdk.asr.final.size", recognizeResultItem.getText().length());
                    if (this.h.size() <= 0) {
                        return;
                    }
                    if (!yrs.b(this.o) && (l2 = this.h.get(this.o)) != null) {
                        klpVar.i("v5.sdk.asr.recv.speak.finish.in", l2.longValue());
                    }
                    if (yrs.b(text) || (l = this.h.get(text)) == null) {
                        return;
                    }
                    jCurrentTimeMillis = l.longValue();
                    str = "v5.sdk.asr.recv.final.speak.finish.in";
                    break;
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        klpVar.i(str, jCurrentTimeMillis);
    }

    private void c(String str) {
        klp klpVar;
        if (yrs.b(str) || (klpVar = this.f.get(str)) == null || klpVar.d("v5.sdk.tts.recv.first.binary.out") != 0) {
            return;
        }
        wpe.f("TrackManager", "handleTtsStreamInQueue: " + str, false);
        klpVar.i("v5.sdk.tts.recv.first.binary.out", System.currentTimeMillis());
    }

    private void b(String str) {
        klp klpVar;
        if (yrs.b(str) || (klpVar = this.f.get(str)) == null || klpVar.d("v5.sdk.tts.recv.first.binary.in") != 0) {
            return;
        }
        wpe.f("TrackManager", "handleTtsStream: " + str, false);
        klpVar.i("v5.sdk.tts.recv.first.binary.in", System.currentTimeMillis());
    }

    private void a(Event event) {
        if (this.c.m().a(event)) {
            klp klpVar = this.f.get(event.getId());
            if (klpVar == null) {
                klpVar = new klp(this.d);
                this.f.put(event.getId(), klpVar);
            }
            a(event, klpVar);
            this.f10910b.sendMessageDelayed(this.f10910b.obtainMessage(3, event.getId()), this.c.i().e("track.max_wait_time") * 1000);
            return;
        }
        if (!AIApiConstants.SpeechRecognizer.RecognizeStreamFinished.equals(event.getFullName())) {
            if (AIApiConstants.General.ContextUpdate.equals(event.getFullName())) {
                this.l = true;
            }
        } else {
            klp klpVar2 = this.f.get(event.getId());
            if (klpVar2 != null) {
                klpVar2.i("v5.sdk.asr.send.recognizer.recognizefinished.in", System.currentTimeMillis());
            }
        }
    }

    public void b(String str, boolean z) {
        if (!this.c.i().b("track.enable") || str == null) {
            return;
        }
        a(str, z);
    }

    private void a(Event event, klp klpVar) {
        String networkType = NetworkUtils.getNetworkType(this.c.j());
        klpVar.h("network", networkType);
        if (NetworkUtils.NETWORK_TYPE_WIFI.equals(networkType)) {
            klpVar.g("network.wifi.signal.level", NetworkUtils.getWifiLevel(this.c.j()));
        } else {
            klpVar.h("network.data.carrier.type", NetworkUtils.getCurrentCarrierType(this.c.j()));
        }
        klpVar.h("request.id", event.getId());
        if (AIApiConstants.SpeechRecognizer.Recognize.equals(event.getFullName())) {
            klpVar.h("request.cmd", "ASR");
            klpVar.i("v5.sdk.asr.send.recognizer.recognize.in", System.currentTimeMillis());
            this.f10911k = 0L;
            this.m = 0L;
            this.l = false;
            this.n = false;
            this.h.clear();
            this.i.clear();
            this.o = null;
            this.p = null;
            return;
        }
        if (AIApiConstants.SpeechRecognizer.DuplexRecognizeStarted.equals(event.getFullName())) {
            klpVar.h("request.cmd", "ASR");
            klpVar.i("v5.sdk.asr.send.recognizer.recognize.in", System.currentTimeMillis());
            this.j.add(event.getId());
        } else if (AIApiConstants.Nlp.Request.equals(event.getFullName())) {
            klpVar.h("request.cmd", "NLP");
            klpVar.i("v5.sdk.nlp.request.in", System.currentTimeMillis());
        } else if (AIApiConstants.SpeechSynthesizer.Synthesize.equals(event.getFullName())) {
            klpVar.h("request.cmd", "TTS");
        }
    }

    public void b(boolean z) {
        synchronized (k.class) {
            if (!this.c.i().b("track.enable")) {
                wpe.k("TrackManager", "postTrackInfo: track not enable");
                return;
            }
            wpe.h("TrackManager", "postTrackInfo " + z);
            this.f10910b.obtainMessage(0, Boolean.valueOf(z)).sendToTarget();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Instruction instruction) {
        long jCurrentTimeMillis;
        String str;
        Long l;
        Long l2;
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null || !dialogId.c()) {
            return;
        }
        klp klpVar = this.f.get(dialogId.b());
        Optional<String> transactionId = instruction.getHeader().getTransactionId();
        wpe.b("TrackManager", "handleInstruction: " + instruction.getFullName() + ", " + ((Object) dialogId.b()));
        if (klpVar == null) {
            if (transactionId == null || !transactionId.c()) {
                return;
            }
            klpVar = this.f.get(transactionId.b());
            if (klpVar == null) {
                wpe.b("TrackManager", "no track data for duplex dialog: " + transactionId.b());
                return;
            }
            wpe.b("TrackManager", transactionId.b() + " has track data");
        }
        String fullName = instruction.getFullName();
        fullName.hashCode();
        switch (fullName) {
            case "System.TruncationNotification":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.asr.recv.system.truncationnotification.out";
                break;
            case "Nlp.FinishAnswer":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.nlp.recv.finishanswer.out";
                break;
            case "SpeechSynthesizer.Speak":
                SpeechSynthesizer.Speak speak = (SpeechSynthesizer.Speak) instruction.getPayload();
                if (speak == null || !speak.getUrl().c()) {
                    str = "v5.sdk.nlp.recv.speak.stream.out";
                    if (klpVar.d("v5.sdk.nlp.recv.speak.stream.out") != 0) {
                        return;
                    }
                } else {
                    str = "v5.sdk.nlp.recv.speak.url.out";
                    if (klpVar.d("v5.sdk.nlp.recv.speak.url.out") != 0) {
                        return;
                    }
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                break;
            case "Dialog.Finish":
                klpVar.i("v5.sdk.dialog.finish.out", System.currentTimeMillis());
                if (transactionId == null || !transactionId.c()) {
                    return;
                }
                klpVar.h("request.id", dialogId.b());
                klpVar.h("transaction.id", transactionId.b());
                klpVar.b();
                return;
            case "SpeechSynthesizer.FinishSpeakStream":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.tts.recv.synthesizer.finishspeakstream.out";
                break;
            case "Nlp.StartAnswer":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.nlp.recv.startanswer.out";
                break;
            case "SpeechRecognizer.RecognizeResult":
                SpeechRecognizer.RecognizeResult recognizeResult = (SpeechRecognizer.RecognizeResult) instruction.getPayload();
                List<SpeechRecognizer.RecognizeResultItem> results = recognizeResult.getResults();
                if (results.size() > 0) {
                    SpeechRecognizer.RecognizeResultItem recognizeResultItem = results.get(0);
                    String text = recognizeResultItem.getText();
                    if (recognizeResultItem.isNlpRequest().c() && recognizeResultItem.isNlpRequest().b().booleanValue()) {
                        klpVar.i("v5.sdk.asr.recv.last.partial.for.nlp.out", System.currentTimeMillis());
                        if (!yrs.b(text)) {
                            this.p = text;
                        }
                    }
                    if (klpVar.d("v5.sdk.asr.recv.first.partial.out") == 0) {
                        klpVar.i("v5.sdk.asr.recv.first.partial.out", System.currentTimeMillis());
                    }
                    if (!yrs.b(text)) {
                        if (this.i.get(text) == null) {
                            this.i.put(text, Long.valueOf(System.currentTimeMillis()));
                        }
                        if (klpVar.d("v5.sdk.asr.recv.first.text.out") == 0) {
                            klpVar.i("v5.sdk.asr.recv.first.text.out", System.currentTimeMillis());
                        }
                    }
                    if (!recognizeResult.isFinal()) {
                        return;
                    }
                    klpVar.i("v5.sdk.asr.recv.final.out", System.currentTimeMillis());
                    if (this.i.size() <= 0) {
                        return;
                    }
                    if (!yrs.b(this.p) && (l2 = this.i.get(this.p)) != null) {
                        klpVar.i("v5.sdk.asr.recv.speak.finish.out", l2.longValue());
                    }
                    if (yrs.b(text) || (l = this.i.get(text)) == null) {
                        return;
                    }
                    jCurrentTimeMillis = l.longValue();
                    str = "v5.sdk.asr.recv.final.speak.finish.out";
                    break;
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        klpVar.i(str, jCurrentTimeMillis);
    }

    private void a(Instruction instruction, klp klpVar) {
        String networkType = NetworkUtils.getNetworkType(this.c.j());
        klpVar.h("network", networkType);
        if (NetworkUtils.NETWORK_TYPE_WIFI.equals(networkType)) {
            klpVar.g("network.wifi.signal.level", NetworkUtils.getWifiLevel(this.c.j()));
        } else {
            klpVar.h("network.data.carrier.type", NetworkUtils.getCurrentCarrierType(this.c.j()));
        }
        Optional<String> transactionId = instruction.getHeader().getTransactionId();
        klpVar.h("request.id", instruction.getDialogId().b());
        klpVar.h("transaction.id", transactionId.b());
        klpVar.h("request.cmd", "ASR");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (yrs.b(str)) {
            return;
        }
        klp klpVar = this.f.get(str);
        if (klpVar == null) {
            wpe.h("TrackManager", "checkAppData: " + str + " has been tracked");
            return;
        }
        klpVar.b();
        this.g.add(str);
        wpe.h("TrackManager", "checkAppData: force post track, " + str);
        b(true);
    }

    public void a(String str, long j) {
        klp klpVar;
        if (!this.c.i().b("track.enable") || str == null || (klpVar = this.f.get(str)) == null || klpVar.d("v5.sdk.asr.send.recognizer.recognize.out") == 0) {
            return;
        }
        if (j > 0 && j > klpVar.d("v5.sdk.asr.send.binary.max.delay")) {
            klpVar.i("v5.sdk.asr.send.binary.max.delay", j);
        }
        if (klpVar.d("v5.sdk.asr.send.first.binary.succ") == 0) {
            klpVar.i("v5.sdk.asr.send.first.binary.succ", System.currentTimeMillis());
        } else {
            klpVar.i("v5.sdk.asr.send.last.binary.succ", System.currentTimeMillis());
        }
    }

    private void a(String str, boolean z) {
        klp klpVar;
        long jCurrentTimeMillis;
        if (yrs.b(str) || (klpVar = this.f.get(str)) == null) {
            return;
        }
        if (klpVar.d("v5.sdk.asr.send.recognizer.recognize.in") == 0) {
            String str2 = "v5.sdk.wakeup.send.first.binary.in";
            if (klpVar.d("v5.sdk.wakeup.send.first.binary.in") == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                str2 = "v5.sdk.wakeup.send.last.binary.in";
            }
            klpVar.i(str2, jCurrentTimeMillis);
            return;
        }
        if (klpVar.d("v5.sdk.asr.send.first.binary.in") == 0) {
            klpVar.i("v5.sdk.asr.send.first.binary.in", System.currentTimeMillis());
        } else {
            klpVar.i("v5.sdk.asr.send.last.binary.in", System.currentTimeMillis());
        }
        if (z) {
            return;
        }
        if (this.f10911k == 0) {
            this.f10911k = System.currentTimeMillis();
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f10911k;
        this.f10911k = System.currentTimeMillis();
        String str3 = this.l ? "v5.sdk.asr.send.binary.include.event.interval.in" : "v5.sdk.asr.send.binary.exclude.event.interval.in";
        if (jCurrentTimeMillis2 > klpVar.d(str3)) {
            klpVar.i(str3, jCurrentTimeMillis2);
        }
        this.l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        com.xiaomi.ai.android.track.d dVar = this.e;
        if (dVar != null) {
            dVar.a(z);
        }
    }
}
