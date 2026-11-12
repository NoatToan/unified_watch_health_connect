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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/training/db/po/LookAround;", "", "", "component1", "trainingId", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTrainingId", "()J", "b", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(J)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LookAround {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long trainingId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public LookAround(long j) {
        this.trainingId = j;
    }

    public static /* synthetic */ LookAround copy$default(LookAround lookAround, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lookAround.trainingId;
        }
        return lookAround.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTrainingId() {
        return this.trainingId;
    }

    @NotNull
    public final LookAround copy(long trainingId) {
        return new LookAround(trainingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LookAround) && this.trainingId == ((LookAround) other).trainingId;
    }

    public final int getId() {
        return this.id;
    }

    public final long getTrainingId() {
        return this.trainingId;
    }

    public int hashCode() {
        return b.a(this.trainingId);
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "LookAround(trainingId=" + this.trainingId + ')';
    }
}
