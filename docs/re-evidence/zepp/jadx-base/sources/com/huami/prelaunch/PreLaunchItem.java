package com.huami.prelaunch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/prelaunch/PreLaunchItem;", "", "", "isOn", "", "toString", "component1", "component2", "component3", "type", "desc", "value", "copy", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "getDesc", "c", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "prelaunch_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class PreLaunchItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String value;

    public PreLaunchItem(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.type = str;
        this.desc = str2;
        this.value = str3;
    }

    public static /* synthetic */ PreLaunchItem copy$default(PreLaunchItem preLaunchItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preLaunchItem.type;
        }
        if ((i & 2) != 0) {
            str2 = preLaunchItem.desc;
        }
        if ((i & 4) != 0) {
            str3 = preLaunchItem.value;
        }
        return preLaunchItem.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final PreLaunchItem copy(@NotNull String type, @NotNull String desc, @NotNull String value) {
        return new PreLaunchItem(type, desc, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreLaunchItem)) {
            return false;
        }
        PreLaunchItem preLaunchItem = (PreLaunchItem) other;
        return Intrinsics.areEqual(this.type, preLaunchItem.type) && Intrinsics.areEqual(this.desc, preLaunchItem.desc) && Intrinsics.areEqual(this.value, preLaunchItem.value);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.value;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isOn() {
        return Intrinsics.areEqual(this.type, "ENTRY") && Intrinsics.areEqual(this.value, "on");
    }

    @NotNull
    public String toString() {
        return "PreLaunchItem: \ntype: " + this.type + ", \ndesc: " + this.desc + ", \nvalue: " + this.value;
    }
}
