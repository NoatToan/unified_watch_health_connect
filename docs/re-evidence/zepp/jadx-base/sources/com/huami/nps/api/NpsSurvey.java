package com.huami.nps.api;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J%\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/nps/api/NpsSurvey;", "", "", "component1", "", "Lcom/huami/nps/api/Questions;", "component2", "id", "questions", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getQuestions", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NpsSurvey {

    @NotNull
    private final String id;

    @Nullable
    private final List<Questions> questions;

    public NpsSurvey(@NotNull String str, @Nullable List<Questions> list) {
        this.id = str;
        this.questions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NpsSurvey copy$default(NpsSurvey npsSurvey, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = npsSurvey.id;
        }
        if ((i & 2) != 0) {
            list = npsSurvey.questions;
        }
        return npsSurvey.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<Questions> component2() {
        return this.questions;
    }

    @NotNull
    public final NpsSurvey copy(@NotNull String id, @Nullable List<Questions> questions) {
        return new NpsSurvey(id, questions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NpsSurvey)) {
            return false;
        }
        NpsSurvey npsSurvey = (NpsSurvey) other;
        return Intrinsics.areEqual(this.id, npsSurvey.id) && Intrinsics.areEqual(this.questions, npsSurvey.questions);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<Questions> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<Questions> list = this.questions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "NpsSurvey(id=" + this.id + ", questions=" + this.questions + ")";
    }
}
