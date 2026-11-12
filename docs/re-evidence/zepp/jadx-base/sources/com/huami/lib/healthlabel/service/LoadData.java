package com.huami.lib.healthlabel.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/lib/healthlabel/service/LoadData;", "", "", "component1", "", "Lcom/huami/lib/healthlabel/service/MixLabel;", "component2", "loadFromDb", "datas", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getLoadFromDb", "()Z", "b", "Ljava/util/List;", "getDatas", "()Ljava/util/List;", "<init>", "(ZLjava/util/List;)V", "healthLabel-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoadData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean loadFromDb;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<MixLabel> datas;

    public LoadData(boolean z, @NotNull List<MixLabel> list) {
        this.loadFromDb = z;
        this.datas = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadData copy$default(LoadData loadData, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loadData.loadFromDb;
        }
        if ((i & 2) != 0) {
            list = loadData.datas;
        }
        return loadData.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLoadFromDb() {
        return this.loadFromDb;
    }

    @NotNull
    public final List<MixLabel> component2() {
        return this.datas;
    }

    @NotNull
    public final LoadData copy(boolean loadFromDb, @NotNull List<MixLabel> datas) {
        return new LoadData(loadFromDb, datas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadData)) {
            return false;
        }
        LoadData loadData = (LoadData) other;
        return this.loadFromDb == loadData.loadFromDb && Intrinsics.areEqual(this.datas, loadData.datas);
    }

    @NotNull
    public final List<MixLabel> getDatas() {
        return this.datas;
    }

    public final boolean getLoadFromDb() {
        return this.loadFromDb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.loadFromDb;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.datas.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadData(loadFromDb=" + this.loadFromDb + ", datas=" + this.datas + ')';
    }
}
