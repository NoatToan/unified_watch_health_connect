package com.xiaomi.wearable.huami_export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/wearable/huami_export/HuamiDeviceManager;", "", "getDefaultLang", "", "getHuaMiLanguageStrByTag", "", "language", "", "huami-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HuamiDeviceManager {
    void getDefaultLang();

    @NotNull
    String getHuaMiLanguageStrByTag(int language);
}
