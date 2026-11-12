package com.huami.sleep.koin;

import androidx.p008lifecycle.LiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/huami/sleep/koin/IAppFunctions;", "", "", "isSupportMiliSleepHr", "Landroidx/lifecycle/LiveData;", "checkConfigChanged", "", "type", "getSmartAnalysis", "isSnoreShow", "isOsaEnable", "supportOsa", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IAppFunctions {
    @NotNull
    LiveData<Boolean> checkConfigChanged();

    boolean getSmartAnalysis(@NotNull String type);

    boolean isOsaEnable();

    boolean isSnoreShow();

    boolean isSupportMiliSleepHr();

    boolean supportOsa();
}
