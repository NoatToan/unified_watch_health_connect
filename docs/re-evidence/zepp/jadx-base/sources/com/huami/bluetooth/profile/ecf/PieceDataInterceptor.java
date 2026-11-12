package com.huami.bluetooth.profile.ecf;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/PieceDataInterceptor;", "", "", "data", "", "type", "", "preHandlePieceData", "postHandlePieceData", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface PieceDataInterceptor {
    boolean postHandlePieceData(@NotNull byte[] data, int type);

    boolean preHandlePieceData(@NotNull byte[] data, int type);
}
