package com.mi.fitness.checkupdate.export;

import android.content.Context;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001a\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u000fH&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000fH&J\b\u0010\u001b\u001a\u00020\u000fH&¨\u0006\u001c"}, d2 = {"Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "", "checkUpdate", "", "onResult", "Lkotlin/Function1;", "Ljava/io/Serializable;", "Lkotlin/ParameterName;", "name", "result", "handleCheckUpdateResult", "context", "Landroid/content/Context;", "setHasPendingCheckUpdate", "hasPendingCheckUpdate", "", "checkHasPendingCheckUpdate", "manualUpgrade", "filePath", "", "isSilentUpgrade", "supportSilentUpgrade", "stopMass", "cancelMass", "setSilentDownloadOnlyWifi", "did", "isOpen", "isCurrentDeviceSupportSilent", "checkupdate-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CheckUpdateManager {
    void cancelMass();

    void checkHasPendingCheckUpdate();

    void checkUpdate(@NotNull Function1<? super Serializable, Unit> onResult);

    void handleCheckUpdateResult(@Nullable Context context, @NotNull Serializable result);

    boolean isCurrentDeviceSupportSilent();

    void manualUpgrade(@NotNull Context context, @NotNull String filePath, boolean isSilentUpgrade);

    void setHasPendingCheckUpdate(boolean hasPendingCheckUpdate);

    void setSilentDownloadOnlyWifi(@NotNull String did, boolean isOpen);

    void stopMass();

    boolean supportSilentUpgrade();
}
