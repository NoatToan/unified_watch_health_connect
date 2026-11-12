package com.xiaomi.fit.data.common.data.aireco;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionMamlInfo;", "", "<init>", "()V", "productId", "", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "mamlVersion", "", "getMamlVersion", "()I", "setMamlVersion", "(I)V", "mamlSize", "getMamlSize", "setMamlSize", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentionMamlInfo {
    private int mamlVersion;

    @NotNull
    private String productId = "";

    @NotNull
    private String mamlSize = "";

    @NotNull
    public final String getMamlSize() {
        return this.mamlSize;
    }

    public final int getMamlVersion() {
        return this.mamlVersion;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final void setMamlSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mamlSize = str;
    }

    public final void setMamlVersion(int i) {
        this.mamlVersion = i;
    }

    public final void setProductId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }
}
