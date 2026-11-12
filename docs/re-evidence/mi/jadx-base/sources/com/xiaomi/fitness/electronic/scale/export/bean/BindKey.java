package com.xiaomi.fitness.electronic.scale.export.bean;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/BindKey;", "Ljava/io/Serializable;", "bindKey", "", "<init>", "(Ljava/lang/String;)V", "getBindKey", "()Ljava/lang/String;", "setBindKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BindKey implements Serializable {

    @NotNull
    private String bindKey;

    /* JADX WARN: Multi-variable type inference failed */
    public BindKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BindKey copy$default(BindKey bindKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindKey.bindKey;
        }
        return bindKey.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBindKey() {
        return this.bindKey;
    }

    @NotNull
    public final BindKey copy(@NotNull String bindKey) {
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        return new BindKey(bindKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BindKey) && Intrinsics.areEqual(this.bindKey, ((BindKey) other).bindKey);
    }

    @NotNull
    public final String getBindKey() {
        return this.bindKey;
    }

    public int hashCode() {
        return this.bindKey.hashCode();
    }

    public final void setBindKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindKey = str;
    }

    @NotNull
    public String toString() {
        return "BindKey(bindKey=" + this.bindKey + ")";
    }

    public BindKey(@NotNull String bindKey) {
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        this.bindKey = bindKey;
    }

    public /* synthetic */ BindKey(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
