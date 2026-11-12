package com.huami.sky.lib.repo.settings;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;", "", "", "minutes", "", "setPlayDuration", "Lkotlinx/coroutines/flow/Flow;", "getPlayDuration", "", "isSmartClose", "setSmartPLayClose", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface IPlaySettingRepo {
    @NotNull
    Flow<Integer> getPlayDuration();

    @NotNull
    Flow<Boolean> isSmartClose();

    void setPlayDuration(int minutes);

    void setSmartPLayClose(boolean isSmartClose);
}
