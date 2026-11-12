package com.huawei.health.sportservice.manager.skip;

import android.text.TextUtils;
import defpackage.jau;
import defpackage.pqj;
import defpackage.pqk;
import java.util.HashMap;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.huawei.health.sportservice.manager.skip.SkipMultilingualVoiceContent, still in use, count: 1, list:
  (r0v0 com.huawei.health.sportservice.manager.skip.SkipMultilingualVoiceContent) from 0x0100: INVOKE (r0v0 com.huawei.health.sportservice.manager.skip.SkipMultilingualVoiceContent) VIRTUAL call: com.huawei.health.sportservice.manager.skip.SkipMultilingualVoiceContent.value():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:130)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes31.dex */
public final class SkipMultilingualVoiceContent {
    PLAY_AUDIO_DATA_SOURCE_ATTACHABLE_EQUIPMENT("S318"),
    PLAY_AUDIO_LAST_TEN_SECONDS("S319"),
    PLAY_AUDIO_GUIDANCE_TONE("S320"),
    PLAY_AUDIO_BODY_INSIDE_THE_SCREEN("S321"),
    PLAY_AUDIO_COME_ON("S332"),
    PLAY_AUDIO_IS_GOOD("S322"),
    PLAY_AUDIO_IT_IS_GOOD("S323"),
    PLAY_AUDIO_IS_GREAT("S324"),
    PLAY_AUDIO_IS_AWESOME("S325"),
    PLAY_AUDIO_IS_VERY_GOOD("S326"),
    PLAY_AUDIO_IS_VERY_GREAT("S327"),
    PLAY_AUDIO_IS_VERY_EXCELLENT("S327"),
    PLAY_AUDIO_IS_PERFECTION("S328"),
    PLAY_AUDIO_IS_INCREDIBLE("S329"),
    PLAY_AUDIO_IS_AMAZING("S330"),
    PLAY_AUDIO_CLOSER_TIP("S331"),
    EMPTY("S507"),
    HEART_RATE_TOO_FAST("S256"),
    SKIP_NUM("S509");

    private static final HashMap<String, String> TRANSLATION_MAP;
    private final String mId;

    public static SkipMultilingualVoiceContent valueOf(String str) {
        return (SkipMultilingualVoiceContent) Enum.valueOf(SkipMultilingualVoiceContent.class, str);
    }

    public static SkipMultilingualVoiceContent[] values() {
        return (SkipMultilingualVoiceContent[]) $VALUES.clone();
    }

    static {
        SkipMultilingualVoiceContent skipMultilingualVoiceContent = PLAY_AUDIO_IS_VERY_GREAT;
        HashMap<String, String> map = new HashMap<>();
        TRANSLATION_MAP = map;
        map.put("S003", skipMultilingualVoiceContent.value());
        map.put("L001", skipMultilingualVoiceContent.value());
        map.put("L002", skipMultilingualVoiceContent.value());
        map.put("L003", skipMultilingualVoiceContent.value());
        map.put("L004", skipMultilingualVoiceContent.value());
        map.put("L005", skipMultilingualVoiceContent.value());
        map.put("L006", skipMultilingualVoiceContent.value());
        map.put("L007", skipMultilingualVoiceContent.value());
        map.put("L008", skipMultilingualVoiceContent.value());
        map.put("L009", skipMultilingualVoiceContent.value());
        map.put("L010", skipMultilingualVoiceContent.value());
        map.put("L011", skipMultilingualVoiceContent.value());
        map.put("L012", skipMultilingualVoiceContent.value());
        map.put("L013", skipMultilingualVoiceContent.value());
        map.put("L014", skipMultilingualVoiceContent.value());
        map.put("L016", skipMultilingualVoiceContent.value());
    }

    private SkipMultilingualVoiceContent(String str) {
        super(str, i);
        this.mId = str;
    }

    public String value() {
        return this.mId;
    }

    public static String getTranslationMap(String str) {
        String str2 = TRANSLATION_MAP.get(str);
        return TextUtils.isEmpty(str2) ? EMPTY.value() : str2;
    }

    public static void playMultipleSourcesVoice(String str, pqk pqkVar) {
        List<String> scenarioAudioPaths = pqj.b().getScenarioAudioPaths(str, pqkVar);
        String[] strArr = new String[scenarioAudioPaths.size()];
        for (int i = 0; i < scenarioAudioPaths.size(); i++) {
            if (!TextUtils.isEmpty(scenarioAudioPaths.get(i))) {
                strArr[i] = scenarioAudioPaths.get(i);
            }
        }
        jau.c().d(strArr);
    }
}
