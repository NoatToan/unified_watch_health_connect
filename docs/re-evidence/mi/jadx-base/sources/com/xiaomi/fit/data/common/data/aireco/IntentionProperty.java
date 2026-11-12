package com.xiaomi.fit.data.common.data.aireco;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionProperty;", "", "<init>", "()V", "intentId", "", "getIntentId", "()Ljava/lang/String;", "setIntentId", "(Ljava/lang/String;)V", "category", "getCategory", "setCategory", "subCategory", "getSubCategory", "setSubCategory", "name", "getName", "setName", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentionProperty {

    @NotNull
    private String intentId = "";

    @NotNull
    private String category = "sports";

    @NotNull
    private String subCategory = "mi_health";

    @NotNull
    private String name = "";

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getIntentId() {
        return this.intentId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSubCategory() {
        return this.subCategory;
    }

    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    public final void setIntentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.intentId = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setSubCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subCategory = str;
    }
}
