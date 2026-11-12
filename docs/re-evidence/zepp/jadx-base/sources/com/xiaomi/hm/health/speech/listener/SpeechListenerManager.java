package com.xiaomi.hm.health.speech.listener;

import android.content.Context;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;
import com.xiaomi.hm.health.speech.nlp.BaseSpeechNlp;
import com.xiaomi.hm.health.speech.nlp.SpeechNlpFactory;
import com.xiaomi.hm.health.utils.RecordUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class SpeechListenerManager {
    private SpeechListener a;
    private BaseSpeechNlp b;
    private List<SpeechListener> c;

    public class a implements SpeechListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.speech.listener.SpeechListener
        public void speechAnswerEntity(Context context, Object baseAnswerEntity) {
            if (baseAnswerEntity instanceof SpeechResult) {
                SpeechListenerManager.this.b.distribute(context, (SpeechResult) baseAnswerEntity);
            }
        }

        @Override // com.xiaomi.hm.health.speech.listener.SpeechListener
        public void speechAsrDesc(String asrDesc) {
        }

        @Override // com.xiaomi.hm.health.speech.listener.SpeechListener
        public void speechDetectionEndInVadMode(Context context) {
            RecordUtils.getInstance(context).speechEngineVadModeDetectionNotify();
        }

        @Override // com.xiaomi.hm.health.speech.listener.SpeechListener
        public void speechError(Context context) {
            RecordUtils.getInstance(context).speechErrorNotify();
        }

        @Override // com.xiaomi.hm.health.speech.listener.SpeechListener
        public void speechManualRequestEnd(Context context) {
            RecordUtils.getInstance(context).speechManualRequestSuccessNotify();
        }

        @Override // com.xiaomi.hm.health.speech.listener.SpeechListener
        public void speechPartialAsrDesc(String partialAsrDesc) {
        }
    }

    public static class b {
        private static final SpeechListenerManager a = new SpeechListenerManager();

        private b() {
        }
    }

    private SpeechListenerManager() {
        this.a = new a();
        this.b = SpeechNlpFactory.createSpeechNlp(AiEnginePlatform.XIAOMI);
        this.c = new ArrayList();
    }

    public static SpeechListenerManager getInstance() {
        return b.a;
    }

    public void addSpeechListener(SpeechListener listener) {
        if (listener != null) {
            this.c.add(listener);
        }
    }

    public void clear() {
        this.c.clear();
    }

    public void initDefaultSpeechListener() {
        this.c.add(this.a);
    }

    public void notifySpeechAnswer(Context context, Object answerEntity) {
        Iterator<SpeechListener> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().speechAnswerEntity(context, answerEntity);
        }
    }

    public void notifySpeechAsrResult(String asrDesc) {
        Iterator<SpeechListener> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().speechAsrDesc(asrDesc);
        }
    }

    public void notifySpeechAsrSpeechPartialDesc(String partialAsrDesc) {
        Iterator<SpeechListener> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().speechPartialAsrDesc(partialAsrDesc);
        }
    }

    public void notifySpeechError(Context context) {
        Iterator<SpeechListener> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().speechError(context);
        }
    }

    public void notifySpeechManualRequestEnd(Context context) {
        Iterator<SpeechListener> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().speechManualRequestEnd(context);
        }
    }

    public void notifySpeechVadDetectionEnd(Context context) {
        Iterator<SpeechListener> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().speechDetectionEndInVadMode(context);
        }
    }

    public void removeSpeechListener(SpeechListener listener) {
        if (listener != null) {
            this.c.remove(listener);
        }
    }
}
