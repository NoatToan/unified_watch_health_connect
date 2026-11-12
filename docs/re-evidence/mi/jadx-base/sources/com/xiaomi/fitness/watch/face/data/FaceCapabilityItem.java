package com.xiaomi.fitness.watch.face.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceCapabilityItem;", "", "name", "", "type", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getName", "()Ljava/lang/String;", "getType", "()I", "getValue", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceCapabilityItem {

    @NotNull
    private final String name;
    private final int type;

    @NotNull
    private final List<String> value;

    public FaceCapabilityItem(@NotNull String name, int i, @NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.type = i;
        this.value = value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceCapabilityItem copy$default(FaceCapabilityItem faceCapabilityItem, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = faceCapabilityItem.name;
        }
        if ((i2 & 2) != 0) {
            i = faceCapabilityItem.type;
        }
        if ((i2 & 4) != 0) {
            list = faceCapabilityItem.value;
        }
        return faceCapabilityItem.copy(str, i, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final List<String> component3() {
        return this.value;
    }

    @NotNull
    public final FaceCapabilityItem copy(@NotNull String name, int type, @NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new FaceCapabilityItem(name, type, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceCapabilityItem)) {
            return false;
        }
        FaceCapabilityItem faceCapabilityItem = (FaceCapabilityItem) other;
        return Intrinsics.areEqual(this.name, faceCapabilityItem.name) && this.type == faceCapabilityItem.type && Intrinsics.areEqual(this.value, faceCapabilityItem.value);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final List<String> getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.type)) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceCapabilityItem(name=" + this.name + ", type=" + this.type + ", value=" + this.value + ")";
    }
}
