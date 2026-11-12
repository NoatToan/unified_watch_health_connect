package com.xiaomi.fitness.training_plan_export.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/Question;", "", "id", "", "key", "", "titleRes", "descRes", "options", "", "Lcom/xiaomi/fitness/training_plan_export/model/QuestionOption;", "<init>", "(ILjava/lang/String;IILjava/util/List;)V", "getId", "()I", "getKey", "()Ljava/lang/String;", "getTitleRes", "getDescRes", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Question {
    private final int descRes;
    private final int id;

    @NotNull
    private final String key;

    @NotNull
    private final List<QuestionOption> options;
    private final int titleRes;

    public Question(int i, @NotNull String key, int i2, int i3, @NotNull List<QuestionOption> options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        this.id = i;
        this.key = key;
        this.titleRes = i2;
        this.descRes = i3;
        this.options = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Question copy$default(Question question, int i, String str, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = question.id;
        }
        if ((i4 & 2) != 0) {
            str = question.key;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            i2 = question.titleRes;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = question.descRes;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            list = question.options;
        }
        return question.copy(i, str2, i5, i6, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDescRes() {
        return this.descRes;
    }

    @NotNull
    public final List<QuestionOption> component5() {
        return this.options;
    }

    @NotNull
    public final Question copy(int id, @NotNull String key, int titleRes, int descRes, @NotNull List<QuestionOption> options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Question(id, key, titleRes, descRes, options);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Question)) {
            return false;
        }
        Question question = (Question) other;
        return this.id == question.id && Intrinsics.areEqual(this.key, question.key) && this.titleRes == question.titleRes && this.descRes == question.descRes && Intrinsics.areEqual(this.options, question.options);
    }

    public final int getDescRes() {
        return this.descRes;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final List<QuestionOption> getOptions() {
        return this.options;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.key.hashCode()) * 31) + Integer.hashCode(this.titleRes)) * 31) + Integer.hashCode(this.descRes)) * 31) + this.options.hashCode();
    }

    @NotNull
    public String toString() {
        return "Question(id=" + this.id + ", key=" + this.key + ", titleRes=" + this.titleRes + ", descRes=" + this.descRes + ", options=" + this.options + ")";
    }
}
