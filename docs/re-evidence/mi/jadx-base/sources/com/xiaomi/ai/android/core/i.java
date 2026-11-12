package com.xiaomi.ai.android.core;

import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Execution;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import defpackage.e01;
import defpackage.f01;
import defpackage.gns;
import defpackage.gt3;
import defpackage.wpe;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f10898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.xiaomi.ai.android.core.e f10899b;
    private int c;
    private int d;
    private int e;
    private Map<String, c> f;
    private Map<String, ScheduledFuture<?>> g;
    private ScheduledFuture<?> h;
    private String i;

    public enum b {
        DIALOG_START("DIALOG_START"),
        ASR_RESULT_RECEIVING("ASR_RESULT_RECEIVING"),
        ASR_STREAM_FINISH("ASR_STREAM_FINISH"),
        ASR_RESULT_FINISH("ASR_RESULT_FINISH"),
        TTS_START("TTS_START"),
        TTS_DATA_RECEIVING("TTS_DATA_RECEIVING"),
        TTS_FINISH("TTS_FINISH"),
        DIALOG_FINISH("DIALOG_FINISH");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10901a;

        b(String str) {
            this.f10901a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f10901a;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10903b;
        public boolean c;
        public boolean d;
        public boolean e;
        public b f;
        public int g;
        public int h;

        /* JADX WARN: Multi-variable type inference failed */
        public c(i iVar, Event event) {
            this.f10902a = event.getId();
            this.f10903b = event.getFullName();
            System.currentTimeMillis();
            this.c = true;
            this.d = true;
            this.e = false;
            List<Context> contexts = event.getContexts();
            this.f = AIApiConstants.SpeechSynthesizer.Synthesize.equals(event.getFullName()) ? b.TTS_START : b.DIALOG_START;
            for (Context context : contexts) {
                if (context.getFullName().equals(AIApiConstants.Execution.RequestControl)) {
                    Execution.RequestControl requestControl = (Execution.RequestControl) context.getPayload();
                    if (requestControl.getDisabled() == null) {
                        wpe.e("TimeoutManager", "Execution.RequestControl:disable option not set");
                        return;
                    }
                    for (Execution.RequestControlType requestControlType : requestControl.getDisabled()) {
                        if (!requestControlType.equals(Execution.RequestControlType.NLP) && requestControlType.equals(Execution.RequestControlType.TTS)) {
                            this.d = false;
                        }
                    }
                    return;
                }
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.f10899b.i().b("connection.enable_client_ping")) {
                i.this.f10899b.p().a();
            }
            gt3 gt3VarE = i.this.f10899b.e();
            if (gt3VarE == null || !gt3VarE.isConnected()) {
                return;
            }
            wpe.k("TimeoutManager", "KeepAliveCheckRunnable: stop channel");
            gt3VarE.stop();
            i.this.f10899b.r().b(false);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10906b;
        public String c;
        public b d;

        public e(c cVar) {
            this.c = cVar.f10902a;
            this.d = cVar.f;
            this.f10905a = cVar.g;
            this.f10906b = cVar.h;
            wpe.b("TimeoutManager", "TimeoutCheckRunnable: init at: " + this.d + ", asrMidResultCount:" + this.f10905a + ",ttsPackCount:" + this.f10906b + ", eventId:" + this.c);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            c cVar = (c) i.this.f.get(this.c);
            if (cVar == null) {
                wpe.h("TimeoutManager", "TimeoutCheckRunnable:dialogStatus is null, eventId:" + this.c);
                return;
            }
            if (this.d.equals(cVar.f) && this.f10905a == cVar.g && this.f10906b == cVar.h) {
                if (cVar.d || cVar.c) {
                    i = (AIApiConstants.Nlp.Request.equals(cVar.f10903b) || this.d.ordinal() >= b.TTS_START.ordinal()) ? StdStatuses.TTS_TIME_OUT : StdStatuses.ASR_TIME_OUT;
                } else {
                    i = StdStatuses.NLP_TIME_OUT;
                }
                i.this.f10899b.k().obtainMessage(3, new f01(i, "timeout at stage:" + this.d, cVar.f10902a)).sendToTarget();
                wpe.e("TimeoutManager", "timeout detected:" + cVar.f10902a + ", stage:" + cVar.f);
            }
        }
    }

    public i(com.xiaomi.ai.android.core.e eVar) {
        this.f10899b = eVar;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new gns("TimeoutManager", 5));
        this.f10898a = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        e01 e01VarI = this.f10899b.i();
        this.c = e01VarI.f("asr.recv_timeout", 5);
        this.d = e01VarI.f("tts.recv_timeout", 5);
        this.e = e01VarI.f("asr.duplex_timeout", 5);
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
    }

    private void e() {
        int iE = this.f10899b.i().e("connection.max_keep_alive_time");
        synchronized (this) {
            try {
                ScheduledFuture<?> scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    this.h = this.f10898a.schedule(new d(), iE, TimeUnit.SECONDS);
                    wpe.b("TimeoutManager", "updateKeepAlive");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        Iterator<c> it = this.f.values().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f.clear();
        synchronized (this) {
            try {
                ScheduledFuture<?> scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    this.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        int iE = this.f10899b.i().e("connection.max_keep_alive_time");
        synchronized (this) {
            try {
                ScheduledFuture<?> scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                this.h = this.f10898a.schedule(new d(), iE, TimeUnit.SECONDS);
                wpe.b("TimeoutManager", "startKeepAlive");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        e();
        String str = this.i;
        if (str == null) {
            wpe.b("TimeoutManager", "updateStat():mPcmEventId is null");
            return;
        }
        c cVar = this.f.get(str);
        if (cVar == null) {
            wpe.b("TimeoutManager", "updateStat():mDialogStatus is null,mPcmEventId=" + this.i);
            return;
        }
        a(cVar);
        cVar.f = b.TTS_DATA_RECEIVING;
        cVar.h++;
        b(cVar);
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.h != null) {
                    wpe.b("TimeoutManager", "cancelKeepAlive");
                    this.h.cancel(true);
                    this.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        Iterator<c> it = this.f.values().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f.clear();
    }

    private void a(c cVar) {
        ScheduledFuture<?> scheduledFuture = this.g.get(cVar.f10902a);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            wpe.b("TimeoutManager", "cancel task at stat:" + cVar.f);
            this.g.remove(cVar.f10902a);
        }
    }

    private void b(c cVar) {
        int i;
        a(cVar);
        if (cVar.e) {
            i = this.e;
            wpe.b("TimeoutManager", "startScheduleTask: duplex timeout is " + i);
        } else {
            i = (AIApiConstants.Nlp.Request.equals(cVar.f10903b) || cVar.f.ordinal() >= b.TTS_START.ordinal()) ? this.d : this.c;
        }
        this.g.put(cVar.f10902a, this.f10898a.schedule(new e(cVar), i, TimeUnit.SECONDS));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(Event event) {
        StringBuilder sb;
        if (!AIApiConstants.System.ClientPing.equals(event.getFullName())) {
            e();
        }
        c cVar = this.f.get(event.getId());
        String fullName = event.getFullName();
        fullName.hashCode();
        byte b2 = -1;
        switch (fullName.hashCode()) {
            case -1718068525:
                if (fullName.equals(AIApiConstants.Nlp.Request)) {
                    b2 = 0;
                }
                break;
            case -580016453:
                if (fullName.equals(AIApiConstants.SpeechRecognizer.DuplexRecognizeStarted)) {
                    b2 = 1;
                }
                break;
            case 861363398:
                if (fullName.equals(AIApiConstants.SpeechRecognizer.Recognize)) {
                    b2 = 2;
                }
                break;
            case 1343087634:
                if (fullName.equals(AIApiConstants.SpeechSynthesizer.Synthesize)) {
                    b2 = 3;
                }
                break;
            case 1503863160:
                if (fullName.equals(AIApiConstants.SpeechRecognizer.DuplexRecognizeFinished)) {
                    b2 = 4;
                }
                break;
            case 1866615416:
                if (fullName.equals(AIApiConstants.SpeechRecognizer.RecognizeStreamFinished)) {
                    b2 = 5;
                }
                break;
        }
        switch (b2) {
            case 0:
                cVar = new c(event);
                cVar.c = false;
                this.f.put(event.getId(), cVar);
                b(cVar);
                break;
            case 1:
                cVar = new c(event);
                cVar.d = false;
                cVar.e = true;
                this.f.put(event.getId(), cVar);
                b(cVar);
                break;
            case 2:
            case 3:
                cVar = new c(event);
                this.f.put(event.getId(), cVar);
                b(cVar);
                break;
            case 4:
                if (cVar != null) {
                    a(cVar);
                    wpe.b("TimeoutManager", "updateStat: duplex dialog finish, remove timer");
                } else {
                    sb = new StringBuilder();
                    sb.append("record:dialogStatus is null, eventId=");
                    sb.append(event.getId());
                    wpe.h("TimeoutManager", sb.toString());
                }
                break;
            case 5:
                if (cVar != null) {
                    a(cVar);
                    cVar.f = b.ASR_STREAM_FINISH;
                    b(cVar);
                } else {
                    sb = new StringBuilder();
                    sb.append("record:dialogStatus is null, eventId=");
                    sb.append(event.getId());
                    wpe.h("TimeoutManager", sb.toString());
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(Instruction instruction) {
        StringBuilder sb;
        e();
        Optional<String> dialogId = instruction.getDialogId();
        if (dialogId == null) {
            wpe.e("TimeoutManager", "updateStat:dialogId is null," + instruction.getFullName());
        }
        if (dialogId.c()) {
            String strB = dialogId.b();
            c cVar = this.f.get(strB);
            if (cVar == null) {
                Optional<String> transactionId = instruction.getHeader().getTransactionId();
                if (transactionId != null && transactionId.c()) {
                    cVar = this.f.get(transactionId.b());
                }
                if (cVar == null) {
                    wpe.h("TimeoutManager", "updateStat(Instruction instruction):dialogStatus is null, eventId=" + strB);
                    return;
                }
            }
            if (cVar.e) {
                if (AIApiConstants.SpeechRecognizer.RecognizeResult.equals(instruction.getFullName())) {
                    a(cVar);
                    cVar.f = b.ASR_RESULT_RECEIVING;
                    cVar.g++;
                    wpe.b("TimeoutManager", "updateStat: update duplex timeout status");
                    b(cVar);
                    return;
                }
                if (AIApiConstants.Dialog.Finish.equals(instruction.getFullName())) {
                    cVar.g = 0;
                    return;
                }
                if (AIApiConstants.Dialog.ExitContinuousDialog.equals(instruction.getFullName())) {
                    a(cVar);
                    this.f.remove(cVar.f10902a);
                    wpe.h("TimeoutManager", "updateStat: duplex dialog exit, remove timer " + cVar.f10902a);
                    return;
                }
                return;
            }
            String fullName = instruction.getFullName();
            fullName.hashCode();
            switch (fullName) {
                case "SpeechSynthesizer.Speak":
                    a(cVar);
                    cVar.f = b.TTS_START;
                    this.i = cVar.f10902a;
                    b(cVar);
                    break;
                case "System.Heartbeat":
                    b(cVar);
                    break;
                case "Dialog.Finish":
                    cVar.f = b.DIALOG_FINISH;
                    a(cVar);
                    this.f.remove(cVar.f10902a);
                    sb = new StringBuilder();
                    sb.append("dialog finish, remove : ");
                    sb.append(cVar.f10902a);
                    wpe.b("TimeoutManager", sb.toString());
                    break;
                case "SpeechSynthesizer.FinishSpeakStream":
                    a(cVar);
                    cVar.f = b.TTS_FINISH;
                    sb = new StringBuilder();
                    sb.append("dialog finish at :");
                    sb.append(cVar.f);
                    wpe.b("TimeoutManager", sb.toString());
                    break;
                case "SpeechRecognizer.RecognizeResult":
                    a(cVar);
                    if (((SpeechRecognizer.RecognizeResult) instruction.getPayload()).isFinal()) {
                        cVar.f = b.ASR_RESULT_FINISH;
                        if (!cVar.d) {
                        }
                    } else {
                        cVar.f = b.ASR_RESULT_RECEIVING;
                        cVar.g++;
                    }
                    b(cVar);
                    break;
            }
        }
    }
}
