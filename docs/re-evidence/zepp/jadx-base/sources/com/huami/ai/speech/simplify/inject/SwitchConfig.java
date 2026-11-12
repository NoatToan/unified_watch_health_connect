package com.huami.ai.speech.simplify.inject;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\r\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "", "", "getProductEnv", "()Z", "productEnv", "getSaveAudio", "saveAudio", "getSupportMultiLanguage", "supportMultiLanguage", "", "getAppProductId", "()Ljava/lang/String;", "appProductId", "Lcom/huami/ai/speech/simplify/inject/AppType;", "getAppType", "()Lcom/huami/ai/speech/simplify/inject/AppType;", "appType", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public interface SwitchConfig {
    @NotNull
    String getAppProductId();

    @NotNull
    AppType getAppType();

    boolean getProductEnv();

    boolean getSaveAudio();

    boolean getSupportMultiLanguage();
}
