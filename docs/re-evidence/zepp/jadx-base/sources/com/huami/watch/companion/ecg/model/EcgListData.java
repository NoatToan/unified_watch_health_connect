package com.huami.watch.companion.ecg.model;

import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/watch/companion/ecg/model/EcgListData;", "", "Lcom/huami/ecg/core/db/entity/EcgData;", "component1", "Lcom/huami/ecg/core/db/entity/EcgTag;", "component2", EcgAnalyticsManagerKt.ECG, "tag", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/ecg/core/db/entity/EcgData;", "getEcg", "()Lcom/huami/ecg/core/db/entity/EcgData;", "b", "Lcom/huami/ecg/core/db/entity/EcgTag;", "getTag", "()Lcom/huami/ecg/core/db/entity/EcgTag;", "<init>", "(Lcom/huami/ecg/core/db/entity/EcgData;Lcom/huami/ecg/core/db/entity/EcgTag;)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EcgListData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final EcgData ecg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final EcgTag tag;

    public EcgListData(@NotNull EcgData ecgData, @Nullable EcgTag ecgTag) {
        this.ecg = ecgData;
        this.tag = ecgTag;
    }

    public static /* synthetic */ EcgListData copy$default(EcgListData ecgListData, EcgData ecgData, EcgTag ecgTag, int i, Object obj) {
        if ((i & 1) != 0) {
            ecgData = ecgListData.ecg;
        }
        if ((i & 2) != 0) {
            ecgTag = ecgListData.tag;
        }
        return ecgListData.copy(ecgData, ecgTag);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EcgData getEcg() {
        return this.ecg;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EcgTag getTag() {
        return this.tag;
    }

    @NotNull
    public final EcgListData copy(@NotNull EcgData ecg, @Nullable EcgTag tag) {
        return new EcgListData(ecg, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgListData)) {
            return false;
        }
        EcgListData ecgListData = (EcgListData) other;
        return Intrinsics.areEqual(this.ecg, ecgListData.ecg) && Intrinsics.areEqual(this.tag, ecgListData.tag);
    }

    @NotNull
    public final EcgData getEcg() {
        return this.ecg;
    }

    @Nullable
    public final EcgTag getTag() {
        return this.tag;
    }

    public int hashCode() {
        int iHashCode = this.ecg.hashCode() * 31;
        EcgTag ecgTag = this.tag;
        return iHashCode + (ecgTag == null ? 0 : ecgTag.hashCode());
    }

    @NotNull
    public String toString() {
        return "EcgListData(ecg=" + this.ecg + ", tag=" + this.tag + ')';
    }
}
