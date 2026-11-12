package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleepassistant.apilib.utils.WebConst;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(indices = {@Index(unique = true, value = {"trainingId"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\"\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/training/db/po/TodayTraining;", "", "", "component1", "component2", "trainingId", "tagId", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTrainingId", "()J", "b", "getTagId", "c", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(JJ)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TodayTraining {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long trainingId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long tagId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public TodayTraining(long j, long j2) {
        this.trainingId = j;
        this.tagId = j2;
    }

    public static /* synthetic */ TodayTraining copy$default(TodayTraining todayTraining, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = todayTraining.trainingId;
        }
        if ((i & 2) != 0) {
            j2 = todayTraining.tagId;
        }
        return todayTraining.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTrainingId() {
        return this.trainingId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTagId() {
        return this.tagId;
    }

    @NotNull
    public final TodayTraining copy(long trainingId, long tagId) {
        return new TodayTraining(trainingId, tagId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TodayTraining)) {
            return false;
        }
        TodayTraining todayTraining = (TodayTraining) other;
        return this.trainingId == todayTraining.trainingId && this.tagId == todayTraining.tagId;
    }

    public final int getId() {
        return this.id;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public final long getTrainingId() {
        return this.trainingId;
    }

    public int hashCode() {
        return (b.a(this.trainingId) * 31) + b.a(this.tagId);
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "TodayTraining(trainingId=" + this.trainingId + ", tagId=" + this.tagId + ')';
    }
}
