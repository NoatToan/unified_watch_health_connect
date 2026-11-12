package com.huami.ai.speech.simplify.inject;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/ai/speech/simplify/inject/AccessCheck;", "", "", "isMiAiRegionAccess", "isLoginCountrySupportAlexa", "isDeviceSupportAlexa", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public interface AccessCheck {
    boolean isDeviceSupportAlexa();

    boolean isLoginCountrySupportAlexa();

    boolean isMiAiRegionAccess();
}
