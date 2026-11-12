package com.xiaomi.fitness.aivs.request.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/Answer;", "", "card_type", "", "cloudControl", "Lcom/xiaomi/fitness/aivs/request/model/CloudControl;", "exp_id", "suggestions", "", "Lcom/xiaomi/fitness/aivs/request/model/Suggestion;", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fitness/aivs/request/model/CloudControl;Ljava/lang/String;Ljava/util/List;)V", "getCard_type", "()Ljava/lang/String;", "getCloudControl", "()Lcom/xiaomi/fitness/aivs/request/model/CloudControl;", "getExp_id", "getSuggestions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Answer {

    @NotNull
    private final String card_type;

    @NotNull
    private final CloudControl cloudControl;

    @NotNull
    private final String exp_id;

    @NotNull
    private final List<Suggestion> suggestions;

    public Answer(@NotNull String card_type, @NotNull CloudControl cloudControl, @NotNull String exp_id, @NotNull List<Suggestion> suggestions) {
        Intrinsics.checkNotNullParameter(card_type, "card_type");
        Intrinsics.checkNotNullParameter(cloudControl, "cloudControl");
        Intrinsics.checkNotNullParameter(exp_id, "exp_id");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.card_type = card_type;
        this.cloudControl = cloudControl;
        this.exp_id = exp_id;
        this.suggestions = suggestions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Answer copy$default(Answer answer, String str, CloudControl cloudControl, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = answer.card_type;
        }
        if ((i & 2) != 0) {
            cloudControl = answer.cloudControl;
        }
        if ((i & 4) != 0) {
            str2 = answer.exp_id;
        }
        if ((i & 8) != 0) {
            list = answer.suggestions;
        }
        return answer.copy(str, cloudControl, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCard_type() {
        return this.card_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CloudControl getCloudControl() {
        return this.cloudControl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExp_id() {
        return this.exp_id;
    }

    @NotNull
    public final List<Suggestion> component4() {
        return this.suggestions;
    }

    @NotNull
    public final Answer copy(@NotNull String card_type, @NotNull CloudControl cloudControl, @NotNull String exp_id, @NotNull List<Suggestion> suggestions) {
        Intrinsics.checkNotNullParameter(card_type, "card_type");
        Intrinsics.checkNotNullParameter(cloudControl, "cloudControl");
        Intrinsics.checkNotNullParameter(exp_id, "exp_id");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new Answer(card_type, cloudControl, exp_id, suggestions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Answer)) {
            return false;
        }
        Answer answer = (Answer) other;
        return Intrinsics.areEqual(this.card_type, answer.card_type) && Intrinsics.areEqual(this.cloudControl, answer.cloudControl) && Intrinsics.areEqual(this.exp_id, answer.exp_id) && Intrinsics.areEqual(this.suggestions, answer.suggestions);
    }

    @NotNull
    public final String getCard_type() {
        return this.card_type;
    }

    @NotNull
    public final CloudControl getCloudControl() {
        return this.cloudControl;
    }

    @NotNull
    public final String getExp_id() {
        return this.exp_id;
    }

    @NotNull
    public final List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        return (((((this.card_type.hashCode() * 31) + this.cloudControl.hashCode()) * 31) + this.exp_id.hashCode()) * 31) + this.suggestions.hashCode();
    }

    @NotNull
    public String toString() {
        return "Answer(card_type=" + this.card_type + ", cloudControl=" + this.cloudControl + ", exp_id=" + this.exp_id + ", suggestions=" + this.suggestions + ")";
    }
}
