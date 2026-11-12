package com.huami.ai.speech.simplify.engine;

import com.huami.ai.speech.api.engine.Engine;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/ai/speech/simplify/engine/SpeechEngineFactory;", "", "", Constants.JSON_FEATURE, "", "deviceName", "Lcom/huami/ai/speech/api/engine/Engine;", "speechEngine", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public interface SpeechEngineFactory {
    @NotNull
    Engine speechEngine(int feature, @Nullable String deviceName);
}
