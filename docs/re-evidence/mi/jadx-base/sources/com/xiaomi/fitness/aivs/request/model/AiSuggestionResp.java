package com.xiaomi.fitness.aivs.request.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/AiSuggestionResp;", "", "answer", "Lcom/xiaomi/fitness/aivs/request/model/Answer;", "status", "Lcom/xiaomi/fitness/aivs/request/model/Status;", "<init>", "(Lcom/xiaomi/fitness/aivs/request/model/Answer;Lcom/xiaomi/fitness/aivs/request/model/Status;)V", "getAnswer", "()Lcom/xiaomi/fitness/aivs/request/model/Answer;", "getStatus", "()Lcom/xiaomi/fitness/aivs/request/model/Status;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AiSuggestionResp {

    @NotNull
    private final Answer answer;

    @NotNull
    private final Status status;

    public AiSuggestionResp(@NotNull Answer answer, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(status, "status");
        this.answer = answer;
        this.status = status;
    }

    public static /* synthetic */ AiSuggestionResp copy$default(AiSuggestionResp aiSuggestionResp, Answer answer, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            answer = aiSuggestionResp.answer;
        }
        if ((i & 2) != 0) {
            status = aiSuggestionResp.status;
        }
        return aiSuggestionResp.copy(answer, status);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Answer getAnswer() {
        return this.answer;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final AiSuggestionResp copy(@NotNull Answer answer, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AiSuggestionResp(answer, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSuggestionResp)) {
            return false;
        }
        AiSuggestionResp aiSuggestionResp = (AiSuggestionResp) other;
        return Intrinsics.areEqual(this.answer, aiSuggestionResp.answer) && Intrinsics.areEqual(this.status, aiSuggestionResp.status);
    }

    @NotNull
    public final Answer getAnswer() {
        return this.answer;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.answer.hashCode() * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "AiSuggestionResp(answer=" + this.answer + ", status=" + this.status + ")";
    }
}
