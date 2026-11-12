package com.huami.step.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/step/model/StepGameResponse;", "", "", "component1", "", "component2", "", "component3", "code", "body", "error", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getCode", "()I", "b", "Ljava/lang/String;", "getBody", "()Ljava/lang/String;", "c", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "step_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StepGameResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Throwable error;

    public StepGameResponse(int i, @Nullable String str, @Nullable Throwable th) {
        this.code = i;
        this.body = str;
        this.error = th;
    }

    public static /* synthetic */ StepGameResponse copy$default(StepGameResponse stepGameResponse, int i, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stepGameResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = stepGameResponse.body;
        }
        if ((i2 & 4) != 0) {
            th = stepGameResponse.error;
        }
        return stepGameResponse.copy(i, str, th);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    @NotNull
    public final StepGameResponse copy(int code, @Nullable String body, @Nullable Throwable error) {
        return new StepGameResponse(code, body, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepGameResponse)) {
            return false;
        }
        StepGameResponse stepGameResponse = (StepGameResponse) other;
        return this.code == stepGameResponse.code && Intrinsics.areEqual(this.body, stepGameResponse.body) && Intrinsics.areEqual(this.error, stepGameResponse.error);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Throwable getError() {
        return this.error;
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.body;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StepGameResponse(code=" + this.code + ", body=" + this.body + ", error=" + this.error + ")";
    }

    public /* synthetic */ StepGameResponse(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }
}
