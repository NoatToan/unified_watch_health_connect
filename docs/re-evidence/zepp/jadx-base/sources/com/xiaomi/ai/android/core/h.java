package com.xiaomi.ai.android.core;

import android.os.Build;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Execution;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.common.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class h {
    private ScheduledThreadPoolExecutor a;
    private com.xiaomi.ai.android.core.d b;
    private int c;
    private int d;
    private Map<String, b> e;
    private Map<String, ScheduledFuture<?>> f;
    private ScheduledFuture<?> g;
    private String h;

    public enum a {
        DIALOG_START("DIALOG_START"),
        ASR_RESULT_RECEIVING("ASR_RESULT_RECEIVING"),
        ASR_STREAM_FINISH("ASR_STREAM_FINISH"),
        ASR_RESULT_FINISH("ASR_RESULT_FINISH"),
        TTS_START("TTS_START"),
        TTS_DATA_RECEIVING("TTS_DATA_RECEIVING"),
        TTS_FINISH("TTS_FINISH"),
        DIALOG_FINISH("DIALOG_FINISH");

        private String i;

        a(String str) {
            this.i = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.i;
        }
    }

    public final class b {
        public String a;
        public String b;
        public long c;
        public boolean d;
        public boolean e;
        public boolean f;
        public a g;
        public int h;
        public int i;

        /* JADX WARN: Multi-variable type inference failed */
        private b(Event event) {
            this.a = event.getId();
            this.b = event.getFullName();
            this.c = System.currentTimeMillis() / 1000;
            this.d = true;
            this.f = true;
            this.e = true;
            List<Context> contexts = event.getContexts();
            this.g = AIApiConstants.SpeechSynthesizer.Synthesize.equals(event.getFullName()) ? a.TTS_START : a.DIALOG_START;
            for (Context context : contexts) {
                if (context.getFullName().equals(AIApiConstants.Execution.RequestControl)) {
                    Execution.RequestControl requestControl = (Execution.RequestControl) context.getPayload();
                    if (requestControl.getDisabled() == null) {
                        Logger.d("TimeoutManager", "Execution.RequestControl:disable option not set");
                        return;
                    }
                    for (Execution.RequestControlType requestControlType : requestControl.getDisabled()) {
                        if (requestControlType.equals(Execution.RequestControlType.NLP)) {
                            this.e = false;
                        } else if (requestControlType.equals(Execution.RequestControlType.TTS)) {
                            this.f = false;
                        }
                    }
                    return;
                }
            }
        }
    }

    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.xiaomi.ai.core.a aVarG = h.this.b.g();
            if (aVarG == null || !aVarG.isConnected()) {
                return;
            }
            Logger.c("TimeoutManager", "KeepAliveCheckRunnable: stop channel");
            aVarG.stop();
            h.this.b.j().a(false);
        }
    }

    public class d implements Runnable {
        private int b;
        private int c;
        private String d;
        private a e;

        public d(b bVar) {
            this.d = bVar.a;
            this.e = bVar.g;
            this.b = bVar.h;
            this.c = bVar.i;
            Logger.a("TimeoutManager", "TimeoutCheckRunnable: init at: " + this.e + ", asrMidResultCount:" + this.b + ",ttsPackCount:" + this.c + ", eventId:" + this.d);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            b bVar = (b) h.this.e.get(this.d);
            if (bVar == null) {
                Logger.b("TimeoutManager", "TimeoutCheckRunnable:dialogStatus is null, eventId:" + this.d);
                return;
            }
            if (this.e.equals(bVar.g) && this.b == bVar.h && this.c == bVar.i) {
                if (bVar.f || bVar.d) {
                    i = (AIApiConstants.Nlp.Request.equals(bVar.b) || this.e.ordinal() >= a.TTS_START.ordinal()) ? StdStatuses.TTS_TIME_OUT : StdStatuses.ASR_TIME_OUT;
                } else {
                    i = StdStatuses.NLP_TIME_OUT;
                }
                h.this.b.d().obtainMessage(3, new AivsError(i, "timeout at stage:" + this.e, bVar.a)).sendToTarget();
                Logger.d("TimeoutManager", "timeout detected:" + bVar.a + ", stage:" + bVar.g);
            }
        }
    }

    public h(com.xiaomi.ai.android.core.d dVar) {
        this.b = dVar;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.a = scheduledThreadPoolExecutor;
        if (Build.VERSION.SDK_INT >= 21) {
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        }
        AivsConfig aivsConfigB = this.b.b();
        this.c = aivsConfigB.getInt(AivsConfig.Asr.RECV_TIMEOUT, 5);
        this.d = aivsConfigB.getInt(AivsConfig.Tts.RECV_TIMEOUT, 5);
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
    }

    private void a(b bVar) {
        ScheduledFuture<?> scheduledFuture = this.f.get(bVar.a);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            Logger.a("TimeoutManager", "cancel task at stat:" + bVar.g);
            this.f.remove(bVar.a);
        }
    }

    private void b(b bVar) {
        a(bVar);
        this.f.put(bVar.a, this.a.schedule(new d(bVar), (AIApiConstants.Nlp.Request.equals(bVar.b) || bVar.g.ordinal() >= a.TTS_START.ordinal()) ? this.d : this.c, TimeUnit.SECONDS));
    }

    private void f() {
        int i = this.b.b().getInt(AivsConfig.Connection.MAX_KEEP_ALIVE_TIME);
        synchronized (this) {
            ScheduledFuture<?> scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.g = this.a.schedule(new c(), i, TimeUnit.SECONDS);
                Logger.a("TimeoutManager", "updateKeepAlive");
            }
        }
    }

    public void a() {
        f();
        String str = this.h;
        if (str == null) {
            Logger.a("TimeoutManager", "updateStat():mPcmEventId is null");
            return;
        }
        b bVar = this.e.get(str);
        if (bVar == null) {
            Logger.a("TimeoutManager", "updateStat():mDialogStatus is null,mPcmEventId=" + this.h);
            return;
        }
        a(bVar);
        bVar.g = a.TTS_DATA_RECEIVING;
        bVar.i++;
        b(bVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(Event event) {
        f();
        b bVar = this.e.get(event.getId());
        String fullName = event.getFullName();
        fullName.hashCode();
        byte b2 = -1;
        switch (fullName.hashCode()) {
            case -1718068525:
                if (fullName.equals(AIApiConstants.Nlp.Request)) {
                    b2 = 0;
                }
                break;
            case 861363398:
                if (fullName.equals(AIApiConstants.SpeechRecognizer.Recognize)) {
                    b2 = 1;
                }
                break;
            case 1343087634:
                if (fullName.equals(AIApiConstants.SpeechSynthesizer.Synthesize)) {
                    b2 = 2;
                }
                break;
            case 1866615416:
                if (fullName.equals(AIApiConstants.SpeechRecognizer.RecognizeStreamFinished)) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
                bVar = new b(event);
                bVar.d = false;
                this.e.put(event.getId(), bVar);
                b(bVar);
                break;
            case 1:
            case 2:
                bVar = new b(event);
                this.e.put(event.getId(), bVar);
                b(bVar);
                break;
            case 3:
                if (bVar != null) {
                    a(bVar);
                    bVar.g = a.ASR_STREAM_FINISH;
                    b(bVar);
                } else {
                    Logger.b("TimeoutManager", "record:dialogStatus is null, eventId=" + event.getId());
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(Instruction instruction) {
        StringBuilder sb;
        f();
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null) {
            Logger.d("TimeoutManager", "updateStat:dialogId is null," + instruction.getFullName());
        }
        if (dialogId.isPresent()) {
            String str = dialogId.get();
            b bVar = this.e.get(str);
            if (bVar == null) {
                Logger.b("TimeoutManager", "updateStat(Instruction instruction):dialogStatus is null, eventId=" + str);
                return;
            }
            String fullName = instruction.getFullName();
            fullName.hashCode();
            switch (fullName) {
                case "SpeechSynthesizer.Speak":
                    a(bVar);
                    bVar.g = a.TTS_START;
                    this.h = bVar.a;
                    b(bVar);
                    break;
                case "System.Heartbeat":
                    b(bVar);
                    break;
                case "Dialog.Finish":
                    bVar.g = a.DIALOG_FINISH;
                    a(bVar);
                    this.e.remove(bVar.a);
                    sb = new StringBuilder();
                    sb.append("dialog finish, remove : ");
                    sb.append(bVar.a);
                    Logger.a("TimeoutManager", sb.toString());
                    break;
                case "SpeechSynthesizer.FinishSpeakStream":
                    a(bVar);
                    bVar.g = a.TTS_FINISH;
                    sb = new StringBuilder();
                    sb.append("dialog finish at :");
                    sb.append(bVar.g);
                    Logger.a("TimeoutManager", sb.toString());
                    break;
                case "SpeechRecognizer.RecognizeResult":
                    a(bVar);
                    if (((SpeechRecognizer.RecognizeResult) instruction.getPayload()).isFinal()) {
                        bVar.g = a.ASR_RESULT_FINISH;
                        if (!bVar.f) {
                        }
                    } else {
                        bVar.g = a.ASR_RESULT_RECEIVING;
                        bVar.h++;
                    }
                    b(bVar);
                    break;
            }
        }
    }

    public void b() {
        Iterator<b> it2 = this.e.values().iterator();
        while (it2.hasNext()) {
            a(it2.next());
        }
        this.e.clear();
    }

    public void c() {
        Iterator<b> it2 = this.e.values().iterator();
        while (it2.hasNext()) {
            a(it2.next());
        }
        this.e.clear();
        synchronized (this) {
            ScheduledFuture<?> scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.g = null;
            }
        }
    }

    public void d() {
        int i = this.b.b().getInt(AivsConfig.Connection.MAX_KEEP_ALIVE_TIME);
        synchronized (this) {
            ScheduledFuture<?> scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.g = this.a.schedule(new c(), i, TimeUnit.SECONDS);
            Logger.a("TimeoutManager", "startKeepAlive");
        }
    }

    public void e() {
        synchronized (this) {
            if (this.g != null) {
                Logger.a("TimeoutManager", "cancelKeepAlive");
                this.g.cancel(true);
                this.g = null;
            }
        }
    }
}
