package com.huami.bluetooth.profile.ecf.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/Sn;", "", "", "toString", "Lcom/huami/bluetooth/profile/ecf/data/SnType;", "component1", "component2", "type", "sn", "copy", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/ecf/data/SnType;", "getType", "()Lcom/huami/bluetooth/profile/ecf/data/SnType;", "b", "Ljava/lang/String;", "getSn", "()Ljava/lang/String;", "<init>", "(Lcom/huami/bluetooth/profile/ecf/data/SnType;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Sn {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SnType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String sn;

    public Sn(@NotNull SnType snType, @NotNull String str) {
        this.type = snType;
        this.sn = str;
    }

    public static /* synthetic */ Sn copy$default(Sn sn, SnType snType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            snType = sn.type;
        }
        if ((i & 2) != 0) {
            str = sn.sn;
        }
        return sn.copy(snType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SnType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final Sn copy(@NotNull SnType type, @NotNull String sn) {
        return new Sn(type, sn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sn)) {
            return false;
        }
        Sn sn = (Sn) other;
        return Intrinsics.areEqual(this.type, sn.type) && Intrinsics.areEqual(this.sn, sn.sn);
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final SnType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.sn.hashCode();
    }

    @NotNull
    public String toString() {
        return ((int) this.type.getValue()) + ": " + this.sn;
    }
}
