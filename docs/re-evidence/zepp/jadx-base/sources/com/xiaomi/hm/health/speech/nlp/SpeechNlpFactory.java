package com.xiaomi.hm.health.speech.nlp;

import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;

/* JADX INFO: loaded from: classes21.dex */
public class SpeechNlpFactory {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AiEnginePlatform.values().length];
            a = iArr;
            try {
                iArr[AiEnginePlatform.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AiEnginePlatform.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static BaseSpeechNlp createSpeechNlp(AiEnginePlatform aiEnginePlatform) {
        if (a.a[aiEnginePlatform.ordinal()] != 1) {
            return null;
        }
        return XiaoMiXiaoAiSpeechNlp.getInstance();
    }
}
