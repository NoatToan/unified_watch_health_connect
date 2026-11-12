package com.xiaomi.hm.health.speech.speech.simplify;

import com.huami.ai.speech.simplify.inject.AccessCheck;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportAlexaKt;
import com.xiaomi.hm.health.speech.utils.EngineAccessCheckFucKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/speech/speech/simplify/AccessCheckImpl;", "Lcom/huami/ai/speech/simplify/inject/AccessCheck;", "", "isDeviceSupportAlexa", "isLoginCountrySupportAlexa", "isMiAiRegionAccess", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AccessCheckImpl implements AccessCheck {
    @Override // com.huami.ai.speech.simplify.inject.AccessCheck
    public boolean isDeviceSupportAlexa() {
        return CheckDeviceSupportAlexaKt.isDeviceSupportAlexa(BraceletApp.getContext());
    }

    @Override // com.huami.ai.speech.simplify.inject.AccessCheck
    public boolean isLoginCountrySupportAlexa() {
        return CheckDeviceSupportAlexaKt.isLoginCountrySupportAlexa(BraceletApp.getContext());
    }

    @Override // com.huami.ai.speech.simplify.inject.AccessCheck
    public boolean isMiAiRegionAccess() {
        return EngineAccessCheckFucKt.miAiRegionAccess();
    }
}
