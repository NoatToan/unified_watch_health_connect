package com.huami.ai.speech.alexa;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/ai/speech/alexa/MultipartResponseResult;", "", "", "component1", "", "component2", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "component3", "isSuccess", "code", "multipartResponse", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", LogUtil.I, "getCode", "()I", "c", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "getMultipartResponse", "()Lcom/huami/ai/speech/alexa/MultipartResponse;", "<init>", "(ZILcom/huami/ai/speech/alexa/MultipartResponse;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MultipartResponseResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final MultipartResponse multipartResponse;

    public MultipartResponseResult(boolean z, int i, @NotNull MultipartResponse multipartResponse) {
        this.isSuccess = z;
        this.code = i;
        this.multipartResponse = multipartResponse;
    }

    public static /* synthetic */ MultipartResponseResult copy$default(MultipartResponseResult multipartResponseResult, boolean z, int i, MultipartResponse multipartResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = multipartResponseResult.isSuccess;
        }
        if ((i2 & 2) != 0) {
            i = multipartResponseResult.code;
        }
        if ((i2 & 4) != 0) {
            multipartResponse = multipartResponseResult.multipartResponse;
        }
        return multipartResponseResult.copy(z, i, multipartResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MultipartResponse getMultipartResponse() {
        return this.multipartResponse;
    }

    @NotNull
    public final MultipartResponseResult copy(boolean isSuccess, int code, @NotNull MultipartResponse multipartResponse) {
        return new MultipartResponseResult(isSuccess, code, multipartResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipartResponseResult)) {
            return false;
        }
        MultipartResponseResult multipartResponseResult = (MultipartResponseResult) other;
        return this.isSuccess == multipartResponseResult.isSuccess && this.code == multipartResponseResult.code && Intrinsics.areEqual(this.multipartResponse, multipartResponseResult.multipartResponse);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final MultipartResponse getMultipartResponse() {
        return this.multipartResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isSuccess;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.code) * 31) + this.multipartResponse.hashCode();
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "MultipartResponseResult(isSuccess=" + this.isSuccess + ", code=" + this.code + ", multipartResponse=" + this.multipartResponse + ')';
    }
}
