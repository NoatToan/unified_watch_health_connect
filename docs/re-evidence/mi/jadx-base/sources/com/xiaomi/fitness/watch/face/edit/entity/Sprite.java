package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/Sprite;", "", "name", "", "ref", "refExt", "interval", "", "repeatCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getName", "()Ljava/lang/String;", "getRef", "getRefExt", "getInterval", "()I", "getRepeatCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Sprite {
    private final int interval;

    @Nullable
    private final String name;

    @Nullable
    private final String ref;

    @Nullable
    private final String refExt;
    private final int repeatCount;

    public Sprite(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2) {
        this.name = str;
        this.ref = str2;
        this.refExt = str3;
        this.interval = i;
        this.repeatCount = i2;
    }

    public static /* synthetic */ Sprite copy$default(Sprite sprite, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sprite.name;
        }
        if ((i3 & 2) != 0) {
            str2 = sprite.ref;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = sprite.refExt;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = sprite.interval;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = sprite.repeatCount;
        }
        return sprite.copy(str, str4, str5, i4, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefExt() {
        return this.refExt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRepeatCount() {
        return this.repeatCount;
    }

    @NotNull
    public final Sprite copy(@Nullable String name, @Nullable String ref, @Nullable String refExt, int interval, int repeatCount) {
        return new Sprite(name, ref, refExt, interval, repeatCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sprite)) {
            return false;
        }
        Sprite sprite = (Sprite) other;
        return Intrinsics.areEqual(this.name, sprite.name) && Intrinsics.areEqual(this.ref, sprite.ref) && Intrinsics.areEqual(this.refExt, sprite.refExt) && this.interval == sprite.interval && this.repeatCount == sprite.repeatCount;
    }

    public final int getInterval() {
        return this.interval;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    public final String getRefExt() {
        return this.refExt;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ref;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refExt;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.interval)) * 31) + Integer.hashCode(this.repeatCount);
    }

    @NotNull
    public String toString() {
        return "Sprite(name=" + this.name + ", ref=" + this.ref + ", refExt=" + this.refExt + ", interval=" + this.interval + ", repeatCount=" + this.repeatCount + ")";
    }
}
