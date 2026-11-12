package com.xiaomi.hm.health.speech.aiengine;

import android.content.Context;
import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;

/* JADX INFO: loaded from: classes21.dex */
public class AiSpeechEngineFactory {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AiEnginePlatform.values().length];
            a = iArr;
            try {
                iArr[AiEnginePlatform.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static BaseAiSpeechEngine createAiSpeechEngine(Context context, AiEnginePlatform aiEnginePlatform) {
        if (a.a[aiEnginePlatform.ordinal()] != 1) {
            return null;
        }
        return XiaoMiAiSpeechEngineWrapper.getInstance(context);
    }
}
