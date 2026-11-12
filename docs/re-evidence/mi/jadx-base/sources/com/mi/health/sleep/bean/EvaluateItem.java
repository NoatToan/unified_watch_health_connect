package com.mi.health.sleep.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/mi/health/sleep/bean/EvaluateItem;", "", "id", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EvaluateItem {
    private final int id;

    @NotNull
    private final String name;

    public EvaluateItem(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
    }

    public static /* synthetic */ EvaluateItem copy$default(EvaluateItem evaluateItem, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = evaluateItem.id;
        }
        if ((i2 & 2) != 0) {
            str = evaluateItem.name;
        }
        return evaluateItem.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final EvaluateItem copy(int id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new EvaluateItem(id, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvaluateItem)) {
            return false;
        }
        EvaluateItem evaluateItem = (EvaluateItem) other;
        return this.id == evaluateItem.id && Intrinsics.areEqual(this.name, evaluateItem.name);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "EvaluateItem(id=" + this.id + ", name=" + this.name + ")";
    }
}
