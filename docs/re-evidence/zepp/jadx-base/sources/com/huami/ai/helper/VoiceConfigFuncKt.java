package com.huami.ai.helper;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0002*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0000\u001a\u0012\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\u0000\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0000\u001a\f\u0010\u0014\u001a\u0004\u0018\u00010\u000e*\u00020\u0000\u001a\n\u0010\u0015\u001a\u00020\u000b*\u00020\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eH\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eH\u0002\"\u0016\u0010\u001e\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0016\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0016\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001f\"\u0016\u0010\"\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001f\"\u0016\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001f\"\u0016\u0010$\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001f\"\u0016\u0010%\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001f\"\u0016\u0010&\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001f\"\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f\"\u0016\u0010(\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)\"\u0016\u0010*\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010)\"\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010)¨\u0006,"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "checkAndReturnValidatedConfig", "", "needASR", "needTTSText", "needTTSAudio", "needNLP", "needGuide", "needSuggestion", "needNews", "needStartThirdMusicApp", "", "maxTTSTextSize", "", "", "unSupportTranslate", "maxCountDown", VoiceConfigFuncKt.MAX_ALARM_COUNT, "(Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)Ljava/lang/Integer;", VoiceConfigFuncKt.SUPPORT_DELETE_ALERT, VoiceConfigFuncKt.a, "ttsAudioSize", "name", "c", "defaultValue", "b", "option", GoogleApiAvailabilityLight.a, "Lcom/google/gson/JsonArray;", "a", "TRANSLATE", "Ljava/lang/String;", "COUNT_DOWN", "THIRD_MUSIC_APP", "TTS_TEXT_LIMIT", "NEWS", "SUGGESTION", "MAX_ALARM_COUNT", "SUPPORT_DELETE_ALERT", "ALEXA_LANGUAGE", "DEFAULT_MAX_TTS_SIZE", LogUtil.I, "DEFAULT_MAX_MINUTE", "DEFAULT_AUDIO_SIZE", "speech-skill_release"}, k = 2, mv = {1, 5, 1})
public final class VoiceConfigFuncKt {

    @NotNull
    public static final String COUNT_DOWN = "countdown";
    public static final int DEFAULT_MAX_MINUTE = 100;
    public static final int DEFAULT_MAX_TTS_SIZE = 200;

    @NotNull
    public static final String MAX_ALARM_COUNT = "maxAlarmCount";

    @NotNull
    public static final String NEWS = "news";

    @NotNull
    public static final String SUGGESTION = "suggestions";

    @NotNull
    public static final String SUPPORT_DELETE_ALERT = "supportDeleteAlert";

    @NotNull
    public static final String THIRD_MUSIC_APP = "thirdMusicApp";

    @NotNull
    public static final String TRANSLATE = "translate";

    @NotNull
    public static final String TTS_TEXT_LIMIT = "ttsTextLimit";

    @NotNull
    private static final String a = "alexaLanguage";
    private static final int b = 4096;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ StringBuilder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StringBuilder sb) {
            super(0);
            this.a = sb;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("un support translate:", this.a);
        }
    }

    private static final JsonArray a(VoiceConfig voiceConfig, String str) {
        JsonElement jsonElement;
        if (voiceConfig.getConfiguration() == null || (jsonElement = new JsonParser().parse(voiceConfig.getConfiguration()).getAsJsonObject().get(str)) == null) {
            return null;
        }
        return jsonElement.getAsJsonArray();
    }

    @Nullable
    public static final String alexaLanguage(@NotNull VoiceConfig voiceConfig) {
        JsonElement jsonElement;
        if (voiceConfig.getConfiguration() == null || (jsonElement = new JsonParser().parse(voiceConfig.getConfiguration()).getAsJsonObject().get(a)) == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    private static final int b(VoiceConfig voiceConfig, String str, int i) {
        JsonElement jsonElement;
        return (voiceConfig.getConfiguration() == null || (jsonElement = new JsonParser().parse(voiceConfig.getConfiguration()).getAsJsonObject().get(str)) == null) ? i : jsonElement.getAsInt();
    }

    private static final boolean c(VoiceConfig voiceConfig, String str) {
        if (voiceConfig.getConfiguration() == null) {
            return false;
        }
        JsonElement jsonElement = new JsonParser().parse(voiceConfig.getConfiguration()).getAsJsonObject().get(str);
        return (jsonElement == null ? 0 : jsonElement.getAsInt()) != 0;
    }

    @NotNull
    public static final VoiceConfig checkAndReturnValidatedConfig(@NotNull VoiceConfig voiceConfig) {
        Object objM3845constructorimpl;
        if (voiceConfig.getConfiguration() == null) {
            return voiceConfig;
        }
        if ((voiceConfig.getConfiguration().length() == 0) || m.isBlank(voiceConfig.getConfiguration())) {
            voiceConfig.setConfiguration(null);
            return voiceConfig;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new JsonParser().parse(voiceConfig.getConfiguration()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null && (thM3848exceptionOrNullimpl instanceof JsonSyntaxException)) {
            voiceConfig.setConfiguration(null);
        }
        return voiceConfig;
    }

    private static final boolean d(VoiceConfig voiceConfig, int i) {
        byte b2 = (byte) i;
        return ((byte) (voiceConfig.getOptions() & b2)) == b2;
    }

    @Nullable
    public static final Integer maxAlarmCount(@NotNull VoiceConfig voiceConfig) {
        JsonElement jsonElement;
        if (voiceConfig.getConfiguration() == null || (jsonElement = new JsonParser().parse(voiceConfig.getConfiguration()).getAsJsonObject().get(MAX_ALARM_COUNT)) == null) {
            return null;
        }
        return Integer.valueOf(jsonElement.getAsInt());
    }

    public static final int maxCountDown(@NotNull VoiceConfig voiceConfig) {
        return b(voiceConfig, "countdown", 100);
    }

    public static final int maxTTSTextSize(@NotNull VoiceConfig voiceConfig) {
        int iB = b(voiceConfig, TTS_TEXT_LIMIT, 200);
        if (iB == 0) {
            return Integer.MAX_VALUE;
        }
        return iB;
    }

    public static final boolean needASR(@NotNull VoiceConfig voiceConfig) {
        return d(voiceConfig, 1);
    }

    public static final boolean needGuide(@NotNull VoiceConfig voiceConfig) {
        return ((byte) (voiceConfig.getOptions() & 16)) == 16;
    }

    public static final boolean needNLP(@NotNull VoiceConfig voiceConfig) {
        return d(voiceConfig, 2);
    }

    public static final boolean needNews(@NotNull VoiceConfig voiceConfig) {
        return c(voiceConfig, NEWS);
    }

    public static final boolean needStartThirdMusicApp(@NotNull VoiceConfig voiceConfig) {
        return c(voiceConfig, THIRD_MUSIC_APP);
    }

    public static final boolean needSuggestion(@NotNull VoiceConfig voiceConfig) {
        return c(voiceConfig, "suggestions");
    }

    public static final boolean needTTSAudio(@NotNull VoiceConfig voiceConfig) {
        return d(voiceConfig, 8);
    }

    public static final boolean needTTSText(@NotNull VoiceConfig voiceConfig) {
        return d(voiceConfig, 4);
    }

    public static final boolean supportDeleteAlert(@NotNull VoiceConfig voiceConfig) {
        JsonElement jsonElement;
        return (voiceConfig.getConfiguration() == null || (jsonElement = new JsonParser().parse(voiceConfig.getConfiguration()).getAsJsonObject().get(SUPPORT_DELETE_ALERT)) == null || jsonElement.getAsInt() != 1) ? false : true;
    }

    public static final int ttsAudioSize(@NotNull VoiceConfig voiceConfig) {
        return b(voiceConfig, "audioSize", 4096);
    }

    @Nullable
    public static final List<String> unSupportTranslate(@NotNull VoiceConfig voiceConfig) {
        JsonArray jsonArrayA = a(voiceConfig, TRANSLATE);
        if (jsonArrayA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (JsonElement jsonElement : jsonArrayA) {
            arrayList.add(jsonElement.getAsString());
            sb.append(jsonElement.getAsString());
            sb.append(",");
        }
        HMLog.info("speech", new a(sb));
        return arrayList;
    }
}
