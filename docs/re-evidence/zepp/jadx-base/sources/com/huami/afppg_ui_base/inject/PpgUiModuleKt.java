package com.huami.afppg_ui_base.inject;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\"\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/huami/afppg_ui_base/inject/PpgUiConfig;", "config", "", "initConfig", "a", "Lcom/huami/afppg_ui_base/inject/PpgUiConfig;", "getUiConfig", "()Lcom/huami/afppg_ui_base/inject/PpgUiConfig;", "setUiConfig", "(Lcom/huami/afppg_ui_base/inject/PpgUiConfig;)V", "uiConfig", "afppg-ui-base_release"}, k = 2, mv = {1, 4, 0})
public final class PpgUiModuleKt {

    @NotNull
    private static PpgUiConfig a = new DefaultAfUiConfigImpl();

    @NotNull
    public static final PpgUiConfig getUiConfig() {
        return a;
    }

    public static final void initConfig(@NotNull PpgUiConfig ppgUiConfig) {
        a = ppgUiConfig;
    }

    public static final void setUiConfig(@NotNull PpgUiConfig ppgUiConfig) {
        a = ppgUiConfig;
    }
}
