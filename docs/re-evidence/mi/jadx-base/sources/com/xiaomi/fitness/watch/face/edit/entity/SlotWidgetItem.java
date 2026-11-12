package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/SlotWidgetItem;", "", "ref", "", "<init>", "(Ljava/lang/String;)V", "getRef", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotWidgetItem {

    @Nullable
    private final String ref;

    public SlotWidgetItem(@Nullable String str) {
        this.ref = str;
    }

    public static /* synthetic */ SlotWidgetItem copy$default(SlotWidgetItem slotWidgetItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotWidgetItem.ref;
        }
        return slotWidgetItem.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    @NotNull
    public final SlotWidgetItem copy(@Nullable String ref) {
        return new SlotWidgetItem(ref);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SlotWidgetItem) && Intrinsics.areEqual(this.ref, ((SlotWidgetItem) other).ref);
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    public int hashCode() {
        String str = this.ref;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "SlotWidgetItem(ref=" + this.ref + ")";
    }
}
