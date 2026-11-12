package com.xiaomi.hm.health.speech.speech.simplify;

import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageUtilsKt;
import com.huami.ai.speech.simplify.inject.AppType;
import com.huami.ai.speech.simplify.inject.SwitchConfig;
import com.xiaomi.hm.health.BuildConfig;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/speech/speech/simplify/SwitchConfigImpl;", "Lcom/huami/ai/speech/simplify/inject/SwitchConfig;", "Lcom/huami/ai/speech/simplify/inject/AppType;", "a", "Lcom/huami/ai/speech/simplify/inject/AppType;", "getAppType", "()Lcom/huami/ai/speech/simplify/inject/AppType;", "appType", "", "getAppProductId", "()Ljava/lang/String;", "appProductId", "", "getProductEnv", "()Z", "productEnv", "getSaveAudio", "saveAudio", "getSupportMultiLanguage", "supportMultiLanguage", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SwitchConfigImpl implements SwitchConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppType appType = AppType.ZEPP;

    @Override // com.huami.ai.speech.simplify.inject.SwitchConfig
    @NotNull
    public String getAppProductId() {
        if (StringsKt__StringsKt.contains((CharSequence) BuildConfig.FLAVOR, (CharSequence) "midong", true)) {
            return "alexa_amazfitwatch_product_id";
        }
        if (StringsKt__StringsKt.contains((CharSequence) BuildConfig.FLAVOR, (CharSequence) "amazfit", true)) {
            return "Amazfit";
        }
        throw new IllegalArgumentException("get Alexa product,but flavor:midongPlay is not support");
    }

    @Override // com.huami.ai.speech.simplify.inject.SwitchConfig
    @NotNull
    public AppType getAppType() {
        return this.appType;
    }

    @Override // com.huami.ai.speech.simplify.inject.SwitchConfig
    public boolean getProductEnv() {
        return true;
    }

    @Override // com.huami.ai.speech.simplify.inject.SwitchConfig
    public boolean getSaveAudio() {
        return false;
    }

    @Override // com.huami.ai.speech.simplify.inject.SwitchConfig
    public boolean getSupportMultiLanguage() {
        return AlexaLanguageUtilsKt.supportAlexaMultilingual();
    }
}
