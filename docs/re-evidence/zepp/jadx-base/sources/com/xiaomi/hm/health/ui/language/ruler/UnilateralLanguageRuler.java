package com.xiaomi.hm.health.ui.language.ruler;

import com.xiaomi.hm.health.bt.model.HMLanguage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralLanguageRuler;", "Lcom/xiaomi/hm/health/ui/language/ruler/BaseLangRuler;", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "getRulerLanguage", "", "flag", "", "setBindFlag", "hmLanguage", "setLanguage", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface UnilateralLanguageRuler extends BaseLangRuler {
    @Nullable
    HMLanguage getRulerLanguage();

    void setBindFlag(boolean flag);

    void setLanguage(@NotNull HMLanguage hmLanguage);
}
