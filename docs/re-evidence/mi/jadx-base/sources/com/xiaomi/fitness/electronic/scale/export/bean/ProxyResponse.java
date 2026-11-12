package com.xiaomi.fitness.electronic.scale.export.bean;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0013J4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/ProxyResponse;", "T", "Ljava/io/Serializable;", "code", "", "message", "", "result", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/xiaomi/fitness/electronic/scale/export/bean/ProxyResponse;", "equals", "", "other", "", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProxyResponse<T> implements Serializable {
    private int code;

    @NotNull
    private String message;

    @Nullable
    private T result;

    public ProxyResponse() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProxyResponse copy$default(ProxyResponse proxyResponse, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = proxyResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = proxyResponse.message;
        }
        if ((i2 & 4) != 0) {
            obj = proxyResponse.result;
        }
        return proxyResponse.copy(i, str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final T component3() {
        return this.result;
    }

    @NotNull
    public final ProxyResponse<T> copy(int code, @NotNull String message, @Nullable T result) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ProxyResponse<>(code, message, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProxyResponse)) {
            return false;
        }
        ProxyResponse proxyResponse = (ProxyResponse) other;
        return this.code == proxyResponse.code && Intrinsics.areEqual(this.message, proxyResponse.message) && Intrinsics.areEqual(this.result, proxyResponse.result);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final T getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31;
        T t = this.result;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setResult(@Nullable T t) {
        this.result = t;
    }

    @NotNull
    public String toString() {
        return "ProxyResponse(code=" + this.code + ", message=" + this.message + ", result=" + this.result + ")";
    }

    public ProxyResponse(int i, @NotNull String message, @Nullable T t) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
        this.result = t;
    }

    public /* synthetic */ ProxyResponse(int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : obj);
    }
}
