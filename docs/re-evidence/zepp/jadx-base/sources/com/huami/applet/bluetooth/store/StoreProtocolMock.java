package com.huami.applet.bluetooth.store;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u001c\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/applet/bluetooth/store/StoreProtocolMock;", "Lcom/huami/applet/bluetooth/store/StoreProtocol;", "Lcom/huami/applet/bluetooth/store/Callback;", "", "callback", "", "getInstalledApps", "", "size", "haveInstallationConditions", "path", "", "installCompanionApp", "appId", "uninstallApp", "Lkotlin/Function1;", "result", "setUninstallListener", "", "byteArray", "dispatchResult", "clearContainer", "Lcom/huami/applet/bluetooth/store/StoreProtocolImpl;", "a", "Lcom/huami/applet/bluetooth/store/StoreProtocolImpl;", "getStoreProtocolImpl", "()Lcom/huami/applet/bluetooth/store/StoreProtocolImpl;", "storeProtocolImpl", "<init>", "(Lcom/huami/applet/bluetooth/store/StoreProtocolImpl;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class StoreProtocolMock implements StoreProtocol {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final StoreProtocolImpl storeProtocolImpl;

    public StoreProtocolMock(@NotNull StoreProtocolImpl storeProtocolImpl) {
        this.storeProtocolImpl = storeProtocolImpl;
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void clearContainer() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void dispatchResult(@NotNull byte[] byteArray) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void getInstalledApps(@NotNull Callback<String> callback) {
        callback.success("2F5A-1.0;3F6A-2.0;");
    }

    @NotNull
    public final StoreProtocolImpl getStoreProtocolImpl() {
        return this.storeProtocolImpl;
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void haveInstallationConditions(int size, @NotNull Callback<Integer> callback) {
        callback.success(1);
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public boolean installCompanionApp(@NotNull String path) {
        return true;
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void setUninstallListener(@NotNull Function1<? super Integer, Unit> result) {
        result.invoke(1000);
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void uninstallApp(int appId, @NotNull Callback<Integer> callback) {
        callback.success(1);
    }
}
