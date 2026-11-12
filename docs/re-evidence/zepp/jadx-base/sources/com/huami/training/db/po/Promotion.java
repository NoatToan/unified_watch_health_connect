package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.training.dto.PromotePlace;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(indices = {@Index(unique = true, value = {"promotePlace", "trainingId"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/training/db/po/Promotion;", "", "Lcom/huami/training/dto/PromotePlace;", "component1", "", "component2", "promotePlace", "trainingId", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/training/dto/PromotePlace;", "getPromotePlace", "()Lcom/huami/training/dto/PromotePlace;", "b", "J", "getTrainingId", "()J", "c", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(Lcom/huami/training/dto/PromotePlace;J)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Promotion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final PromotePlace promotePlace;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long trainingId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public Promotion(@NotNull PromotePlace promotePlace, long j) {
        this.promotePlace = promotePlace;
        this.trainingId = j;
    }

    public static /* synthetic */ Promotion copy$default(Promotion promotion, PromotePlace promotePlace, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            promotePlace = promotion.promotePlace;
        }
        if ((i & 2) != 0) {
            j = promotion.trainingId;
        }
        return promotion.copy(promotePlace, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PromotePlace getPromotePlace() {
        return this.promotePlace;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTrainingId() {
        return this.trainingId;
    }

    @NotNull
    public final Promotion copy(@NotNull PromotePlace promotePlace, long trainingId) {
        return new Promotion(promotePlace, trainingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) other;
        return this.promotePlace == promotion.promotePlace && this.trainingId == promotion.trainingId;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final PromotePlace getPromotePlace() {
        return this.promotePlace;
    }

    public final long getTrainingId() {
        return this.trainingId;
    }

    public int hashCode() {
        return (this.promotePlace.hashCode() * 31) + b.a(this.trainingId);
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "Promotion(promotePlace=" + this.promotePlace + ", trainingId=" + this.trainingId + ')';
    }
}
