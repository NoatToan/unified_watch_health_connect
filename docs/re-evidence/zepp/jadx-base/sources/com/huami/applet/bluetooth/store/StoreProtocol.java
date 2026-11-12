package com.huami.applet.bluetooth.store;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H&J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\u001c\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000fH&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0005H&¨\u0006\u0016"}, d2 = {"Lcom/huami/applet/bluetooth/store/StoreProtocol;", "", "Lcom/huami/applet/bluetooth/store/Callback;", "", "callback", "", "getInstalledApps", "", "size", "haveInstallationConditions", "path", "", "installCompanionApp", "appId", "uninstallApp", "Lkotlin/Function1;", "result", "setUninstallListener", "", "byteArray", "dispatchResult", "clearContainer", "applet_release"}, k = 1, mv = {1, 5, 1})
public interface StoreProtocol {
    void clearContainer();

    void dispatchResult(@NotNull byte[] byteArray);

    void getInstalledApps(@NotNull Callback<String> callback);

    void haveInstallationConditions(int size, @NotNull Callback<Integer> callback);

    boolean installCompanionApp(@NotNull String path);

    void setUninstallListener(@NotNull Function1<? super Integer, Unit> result);

    void uninstallApp(int appId, @NotNull Callback<Integer> callback);
}
