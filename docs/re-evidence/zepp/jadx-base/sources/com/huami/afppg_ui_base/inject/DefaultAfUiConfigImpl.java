package com.huami.afppg_ui_base.inject;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/afppg_ui_base/inject/DefaultAfUiConfigImpl;", "Lcom/huami/afppg_ui_base/inject/PpgUiConfig;", "", "getAppName", "", "deviceSource", "", "isMedicalSource", "<init>", "()V", "afppg-ui-base_release"}, k = 1, mv = {1, 4, 0})
public final class DefaultAfUiConfigImpl implements PpgUiConfig {
    @Override // com.huami.afppg_ui_base.inject.PpgUiConfig
    @NotNull
    public String getAppName() {
        return "";
    }

    @Override // com.huami.afppg_ui_base.inject.PpgUiConfig
    public boolean isMedicalSource(int deviceSource) {
        return false;
    }
}
