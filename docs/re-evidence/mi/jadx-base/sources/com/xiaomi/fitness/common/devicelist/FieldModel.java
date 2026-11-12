package com.xiaomi.fitness.common.devicelist;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u000e\u0018\u00002\u00020\u0001B+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/common/devicelist/FieldModel;", "", "tag", "", "key", "nextKey", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "getKey", "setKey", "NextKey", "getNextKey", "()Ljava/util/List;", "setNextKey", "(Ljava/util/List;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FieldModel {

    @Nullable
    private List<Byte> NextKey;

    @NotNull
    private String key;

    @Nullable
    private String tag;

    public FieldModel(@Nullable String str, @NotNull String key, @Nullable List<Byte> list) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.tag = str;
        this.NextKey = list;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final List<Byte> getNextKey() {
        return this.NextKey;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setNextKey(@Nullable List<Byte> list) {
        this.NextKey = list;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }
}
