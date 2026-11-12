package com.xiaomi.fitness.connect.export;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/connect/export/IEcoBindResultListener;", "", "onBindSuccess", "", "bindType", "", "mac", "", "did", "onBindFail", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IEcoBindResultListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onBindFail(@NotNull IEcoBindResultListener iEcoBindResultListener, @NotNull String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
        }
    }

    void onBindFail(@NotNull String mac);

    void onBindSuccess(int bindType, @NotNull String mac, @NotNull String did);
}
