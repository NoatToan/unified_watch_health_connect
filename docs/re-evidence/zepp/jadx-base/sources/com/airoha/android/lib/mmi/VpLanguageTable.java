package com.airoha.android.lib.mmi;

import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepoImpl;
import com.huami.nfc.applet.ConstantKt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class VpLanguageTable {
    public static Map<String, String> vpTable = new a();

    public static class a extends HashMap<String, String> {
        public a() {
            put("0404", "zh-TW");
            put("0409", AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE);
            put("0412", "KR");
            put(ConstantKt.APP_CODE_DA_LIAN, "JP");
        }
    }
}
