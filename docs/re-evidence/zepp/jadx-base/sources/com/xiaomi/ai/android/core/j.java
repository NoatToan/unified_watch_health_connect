package com.xiaomi.ai.android.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.track.TrackData;
import com.xiaomi.common.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes18.dex */
public class j {
    private HandlerThread a;
    private Handler b;
    private d c;
    private com.xiaomi.ai.track.a d;
    private com.xiaomi.ai.android.track.d e;
    private Map<String, TrackData> f = new ConcurrentHashMap();
    private Set<String> g = new CopyOnWriteArraySet();

    public j(d dVar) {
        this.c = dVar;
        this.d = new com.xiaomi.ai.android.track.a(dVar);
        this.e = new com.xiaomi.ai.android.track.d(this.c, this.d, new com.xiaomi.ai.android.track.b.c() { // from class: com.xiaomi.ai.android.core.j.1
            @Override // com.xiaomi.ai.android.track.b.c
            public void a() {
                Logger.a("TrackManager", "onTrackFinish");
                if (j.this.g == null || j.this.g.size() <= 0) {
                    return;
                }
                Iterator it2 = j.this.g.iterator();
                while (it2.hasNext()) {
                    j.this.f.remove((String) it2.next());
                }
                j.this.g.clear();
            }

            @Override // com.xiaomi.ai.android.track.b.c
            public void a(AivsError aivsError) {
            }
        });
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            HandlerThread handlerThread = new HandlerThread("TrackThread");
            this.a = handlerThread;
            handlerThread.start();
            this.b = new Handler(this.a.getLooper(), new Handler.Callback() { // from class: com.xiaomi.ai.android.core.j.2
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    int i = message.what;
                    if (i == 0) {
                        j.this.b(((Boolean) message.obj).booleanValue());
                    } else if (i == 1) {
                        j.this.h();
                    } else if (i == 2) {
                        j.this.b((ObjectNode) message.obj);
                    } else if (i == 3) {
                        j.this.d((String) message.obj);
                    } else if (i == 4) {
                        j.this.g();
                    } else if (i == 5) {
                        j.this.i();
                    }
                    return true;
                }
            });
            a();
        }
    }

    private void a(Event event, TrackData trackData) {
        String str;
        String strC = NetworkUtils.c(this.c.a());
        trackData.set("network", strC);
        if ("WIFI".equals(strC)) {
            trackData.set("network.wifi.signal.level", NetworkUtils.e(this.c.a()));
        } else {
            int iD = NetworkUtils.d(this.c.a());
            if (iD != Integer.MAX_VALUE) {
                trackData.set("network.dbm", iD);
            }
            trackData.set("network.data.carrier.type", NetworkUtils.f(this.c.a()));
        }
        trackData.set("request.id", event.getId());
        if (AIApiConstants.SpeechRecognizer.Recognize.equals(event.getFullName())) {
            trackData.set("request.cmd", "ASR");
            trackData.setTimestamp("v5.sdk.asr.send.recognizer.recognize.in", System.currentTimeMillis());
            return;
        }
        if (AIApiConstants.Nlp.Request.equals(event.getFullName())) {
            str = "NLP";
        } else if (!AIApiConstants.SpeechSynthesizer.Synthesize.equals(event.getFullName())) {
            return;
        } else {
            str = "TTS";
        }
        trackData.set("request.cmd", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ObjectNode objectNode) {
        TrackData trackDataA;
        String strAsText = objectNode.path(DbUtils.Const.Columns.Event.EVENT_ID).asText();
        if (com.xiaomi.ai.b.f.a(strAsText)) {
            Logger.b("TrackManager", "mergeAppData: eventId is not set, create new trackData");
            trackDataA = this.d.a();
        } else {
            TrackData trackDataA2 = this.f.get(strAsText);
            if (trackDataA2 == null) {
                Logger.c("TrackManager", "mergeAppData: eventId:" + strAsText + " is not existed");
                trackDataA2 = this.d.a();
                trackDataA2.set("request.id", strAsText);
            }
            trackDataA = trackDataA2;
            trackDataA.finishTrack();
        }
        trackDataA.mergeAppData(objectNode);
        Logger.a("TrackManager", "mergeAppData:" + objectNode.toString());
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        this.e.a(z);
    }

    private void c(Event event) {
        TrackData trackData;
        if (!this.c.e().b(event)) {
            if (!AIApiConstants.SpeechRecognizer.RecognizeStreamFinished.equals(event.getFullName()) || (trackData = this.f.get(event.getId())) == null) {
                return;
            }
            trackData.setTimestamp("v5.sdk.asr.send.recognizer.recognizefinished.in", System.currentTimeMillis());
            return;
        }
        TrackData trackData2 = this.f.get(event.getId());
        if (trackData2 == null) {
            trackData2 = new TrackData(this.d);
            this.f.put(event.getId(), trackData2);
        }
        a(event, trackData2);
        this.b.sendMessageDelayed(this.b.obtainMessage(3, event.getId()), this.c.b().getInt(AivsConfig.Track.MAX_WAIT_TIME) * 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(Instruction instruction) {
        long jCurrentTimeMillis;
        String str;
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null || !dialogId.isPresent()) {
            return;
        }
        TrackData trackData = this.f.get(dialogId.get());
        Logger.a("TrackManager", "handleInstruction: " + instruction.getFullName() + ", " + ((Object) dialogId.get()));
        if (trackData == null) {
            return;
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
                if (speak == null || !speak.getUrl().isPresent()) {
                    str = "v5.sdk.nlp.recv.speak.stream.out";
                    if (trackData.getTimestamp("v5.sdk.nlp.recv.speak.stream.out") != 0) {
                        return;
                    }
                } else {
                    str = "v5.sdk.nlp.recv.speak.url.out";
                    if (trackData.getTimestamp("v5.sdk.nlp.recv.speak.url.out") != 0) {
                        return;
                    }
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                break;
            case "Dialog.Finish":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.dialog.finish.out";
                break;
            case "SpeechSynthesizer.FinishSpeakStream":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.tts.recv.synthesizer.finishspeakstream.out";
                break;
            case "Nlp.StartAnswer":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.nlp.recv.startanswer.out";
                break;
            case "SpeechRecognizer.RecognizeResult":
                if (!((SpeechRecognizer.RecognizeResult) instruction.getPayload()).isFinal()) {
                    if (trackData.getTimestamp("v5.sdk.asr.recv.first.partial.out") == 0) {
                        trackData.setTimestamp("v5.sdk.asr.recv.first.partial.out", System.currentTimeMillis());
                    }
                    if (trackData.getTimestamp("v5.sdk.asr.recv.first.text.out") == 0) {
                        List<SpeechRecognizer.RecognizeResultItem> results = ((SpeechRecognizer.RecognizeResult) instruction.getPayload()).getResults();
                        if (results.size() <= 0 || com.xiaomi.ai.b.f.a(results.get(0).getText())) {
                            return;
                        }
                        trackData.setTimestamp("v5.sdk.asr.recv.first.text.out", System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.asr.recv.final.out";
                break;
                break;
            default:
                return;
        }
        trackData.setTimestamp(str, jCurrentTimeMillis);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(Instruction instruction) {
        long jCurrentTimeMillis;
        String str;
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null || !dialogId.isPresent()) {
            return;
        }
        TrackData trackData = this.f.get(dialogId.get());
        Logger.a("TrackManager", "handleInstruction0: " + instruction.getFullName() + ", " + ((Object) dialogId.get()), false);
        if (trackData == null) {
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
                if (speak == null || !speak.getUrl().isPresent()) {
                    str = "v5.sdk.nlp.recv.speak.stream.in";
                    if (trackData.getTimestamp("v5.sdk.nlp.recv.speak.stream.in") != 0) {
                        return;
                    }
                } else {
                    str = "v5.sdk.nlp.recv.speak.url.in";
                    if (trackData.getTimestamp("v5.sdk.nlp.recv.speak.url.in") != 0) {
                        return;
                    }
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                break;
            case "Dialog.Finish":
                jCurrentTimeMillis = System.currentTimeMillis();
                str = "v5.sdk.dialog.finish.in";
                break;
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
                if (!recognizeResult.isFinal()) {
                    if (trackData.getTimestamp("v5.sdk.asr.recv.first.partial.in") == 0) {
                        trackData.setTimestamp("v5.sdk.asr.recv.first.partial.in", System.currentTimeMillis());
                    }
                    if (trackData.getTimestamp("v5.sdk.asr.recv.first.text.in") == 0) {
                        List<SpeechRecognizer.RecognizeResultItem> results = ((SpeechRecognizer.RecognizeResult) instruction.getPayload()).getResults();
                        if (results.size() <= 0 || com.xiaomi.ai.b.f.a(results.get(0).getText())) {
                            return;
                        }
                        trackData.setTimestamp("v5.sdk.asr.recv.first.text.in", System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                trackData.setTimestamp("v5.sdk.asr.recv.final.in", System.currentTimeMillis());
                List<SpeechRecognizer.RecognizeResultItem> results2 = recognizeResult.getResults();
                if (results2.size() <= 0) {
                    return;
                }
                SpeechRecognizer.RecognizeResultItem recognizeResultItem = results2.get(0);
                Optional<Long> beginOffset = recognizeResultItem.getBeginOffset();
                if (beginOffset.isPresent()) {
                    trackData.setTimestamp("v5.sdk.asr.start.talking.offset", beginOffset.get().longValue());
                }
                Optional<Long> endOffset = recognizeResultItem.getEndOffset();
                if (endOffset.isPresent()) {
                    trackData.setTimestamp("v5.sdk.asr.finish.talking.offset", endOffset.get().longValue());
                }
                jCurrentTimeMillis = recognizeResultItem.getText().length();
                str = "v5.sdk.asr.final.size";
                break;
                break;
            default:
                return;
        }
        trackData.setTimestamp(str, jCurrentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (com.xiaomi.ai.b.f.a(str)) {
            return;
        }
        TrackData trackData = this.f.get(str);
        if (trackData == null) {
            Logger.b("TrackManager", "checkAppData: " + str + " has been tracked");
            return;
        }
        trackData.finishTrack();
        this.g.add(str);
        Logger.b("TrackManager", "checkAppData: force post track, " + str);
        a(true);
    }

    private void e(String str) {
        TrackData trackData;
        String str2;
        long jCurrentTimeMillis;
        String str3;
        if (com.xiaomi.ai.b.f.a(str) || (trackData = this.f.get(str)) == null) {
            return;
        }
        if (trackData.getTimestamp("v5.sdk.asr.send.recognizer.recognize.in") == 0) {
            str2 = "v5.sdk.wakeup.send.first.binary.in";
            if (trackData.getTimestamp("v5.sdk.wakeup.send.first.binary.in") != 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                str3 = "v5.sdk.wakeup.send.last.binary.in";
                trackData.setTimestamp(str3, jCurrentTimeMillis);
                return;
            }
            trackData.setTimestamp(str2, System.currentTimeMillis());
        }
        str2 = "v5.sdk.asr.send.first.binary.in";
        if (trackData.getTimestamp("v5.sdk.asr.send.first.binary.in") != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            str3 = "v5.sdk.asr.send.last.binary.in";
            trackData.setTimestamp(str3, jCurrentTimeMillis);
            return;
        }
        trackData.setTimestamp(str2, System.currentTimeMillis());
    }

    private void f(String str) {
        TrackData trackData;
        if (com.xiaomi.ai.b.f.a(str) || (trackData = this.f.get(str)) == null || trackData.getTimestamp("v5.sdk.tts.recv.first.binary.in") != 0) {
            return;
        }
        Logger.a("TrackManager", "handleTtsStream: " + str, false);
        trackData.setTimestamp("v5.sdk.tts.recv.first.binary.in", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        b(false);
        this.e = null;
        this.b.removeCallbacksAndMessages(null);
        this.a.quit();
    }

    private void g(String str) {
        TrackData trackData;
        if (com.xiaomi.ai.b.f.a(str) || (trackData = this.f.get(str)) == null || trackData.getTimestamp("v5.sdk.tts.recv.first.binary.out") != 0) {
            return;
        }
        Logger.a("TrackManager", "handleTtsStreamInQueue: " + str, false);
        trackData.setTimestamp("v5.sdk.tts.recv.first.binary.out", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        com.xiaomi.ai.track.a aVar = this.d;
        if (aVar instanceof com.xiaomi.ai.android.track.a) {
            ((com.xiaomi.ai.android.track.a) aVar).b();
        }
    }

    public void a() {
        if (NetworkUtils.a(this.c.a())) {
            this.b.obtainMessage(1).sendToTarget();
        }
    }

    public void a(ObjectNode objectNode) {
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            this.b.obtainMessage(2, objectNode).sendToTarget();
        }
    }

    public void a(Event event) {
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            Logger.a("TrackManager", "trackEvent:" + event.getId() + "," + event.getFullName(), false);
            c(event);
        }
    }

    public void a(Instruction instruction) {
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            c(instruction);
        }
    }

    public void a(String str) {
        if (!this.c.b().getBoolean(AivsConfig.Track.ENABLE) || str == null) {
            return;
        }
        e(str);
    }

    public void a(boolean z) {
        synchronized (j.class) {
            if (!this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
                Logger.c("TrackManager", "postTrackInfo: track not enable");
                return;
            }
            Logger.b("TrackManager", "postTrackInfo " + z);
            this.b.obtainMessage(0, Boolean.valueOf(z)).sendToTarget();
        }
    }

    public void b() {
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            this.b.obtainMessage(5).sendToTarget();
        }
    }

    public void b(Event event) {
        TrackData trackData;
        long jCurrentTimeMillis;
        String str;
        String id = event.getId();
        Logger.a("TrackManager", id);
        if (com.xiaomi.ai.b.f.a(id) || (trackData = this.f.get(id)) == null) {
            return;
        }
        if (AIApiConstants.SpeechRecognizer.Recognize.equals(event.getFullName())) {
            jCurrentTimeMillis = System.currentTimeMillis();
            str = "v5.sdk.asr.send.recognizer.recognize.out";
        } else {
            if (AIApiConstants.Nlp.Request.equals(event.getFullName()) || !AIApiConstants.SpeechRecognizer.RecognizeStreamFinished.equals(event.getFullName())) {
                return;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            str = "v5.sdk.asr.send.recognizer.recognizefinished.out";
        }
        trackData.setTimestamp(str, jCurrentTimeMillis);
    }

    public void b(Instruction instruction) {
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            d(instruction);
        }
    }

    public void b(String str) {
        TrackData trackData;
        String str2;
        long jCurrentTimeMillis;
        String str3;
        if (!this.c.b().getBoolean(AivsConfig.Track.ENABLE) || str == null || (trackData = this.f.get(str)) == null) {
            return;
        }
        if (trackData.getTimestamp("v5.sdk.wakeup.send.first.binary.in") == 0 || trackData.getTimestamp("v5.sdk.asr.send.recognizer.recognize.out") != 0) {
            str2 = "v5.sdk.asr.send.first.binary.out";
            if (trackData.getTimestamp("v5.sdk.asr.send.first.binary.out") != 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                str3 = "v5.sdk.asr.send.last.binary.out";
                trackData.setTimestamp(str3, jCurrentTimeMillis);
                return;
            }
            trackData.setTimestamp(str2, System.currentTimeMillis());
        }
        str2 = "v5.sdk.wakeup.send.first.binary.out";
        if (trackData.getTimestamp("v5.sdk.wakeup.send.first.binary.out") != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            str3 = "v5.sdk.wakeup.send.last.binary.out";
            trackData.setTimestamp(str3, jCurrentTimeMillis);
            return;
        }
        trackData.setTimestamp(str2, System.currentTimeMillis());
    }

    public void c() {
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            Logger.b("TrackManager", "release:remain track data num:" + this.d.d());
            this.b.obtainMessage(4).sendToTarget();
        }
    }

    public void c(String str) {
        TrackData trackData;
        if (!this.c.b().getBoolean(AivsConfig.Track.ENABLE) || str == null || (trackData = this.f.get(str)) == null) {
            return;
        }
        if (trackData.getTimestamp("v5.sdk.asr.send.recognizer.recognize.out") == 0 || trackData.getTimestamp("v5.sdk.asr.send.first.binary.succ") != 0) {
            trackData.setTimestamp("v5.sdk.asr.send.last.binary.succ", System.currentTimeMillis());
        } else {
            trackData.setTimestamp("v5.sdk.asr.send.first.binary.succ", System.currentTimeMillis());
        }
    }

    public void d() {
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            String strC = this.c.e().c();
            if (com.xiaomi.ai.b.f.a(strC)) {
                return;
            }
            f(strC);
        }
    }

    public void e() {
        if (this.c.b().getBoolean(AivsConfig.Track.ENABLE)) {
            String strC = this.c.e().c();
            if (com.xiaomi.ai.b.f.a(strC)) {
                return;
            }
            g(strC);
        }
    }

    public com.xiaomi.ai.track.a f() {
        return this.d;
    }
}
