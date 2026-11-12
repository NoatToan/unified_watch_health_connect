package com.huami.ai.speech.simplify.register.config;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.thirdbind.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/ai/speech/simplify/register/config/SpeechAuthSetting;", "", "Lcom/huami/ai/speech/simplify/register/config/AlexaSetting;", "a", "Lcom/huami/ai/speech/simplify/register/config/AlexaSetting;", "getAlexaSetting", "()Lcom/huami/ai/speech/simplify/register/config/AlexaSetting;", "alexaSetting", "<init>", "(Lcom/huami/ai/speech/simplify/register/config/AlexaSetting;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechAuthSetting {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(a.h)
    @NotNull
    private final AlexaSetting alexaSetting;

    public SpeechAuthSetting(@NotNull AlexaSetting alexaSetting) {
        this.alexaSetting = alexaSetting;
    }

    @NotNull
    public final AlexaSetting getAlexaSetting() {
        return this.alexaSetting;
    }
}
