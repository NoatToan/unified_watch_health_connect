package com.xiaomi.fitness.notify.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BgInfo;", "", "type", "", "picBg", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPicBg", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BgInfo;", "equals", "", "other", "hashCode", "toString", "notify-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusNotificationParamV2BgInfo {

    @Nullable
    private final String picBg;

    @Nullable
    private final Integer type;

    public FocusNotificationParamV2BgInfo(@Nullable Integer num, @Nullable String str) {
        this.type = num;
        this.picBg = str;
    }

    public static /* synthetic */ FocusNotificationParamV2BgInfo copy$default(FocusNotificationParamV2BgInfo focusNotificationParamV2BgInfo, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = focusNotificationParamV2BgInfo.type;
        }
        if ((i & 2) != 0) {
            str = focusNotificationParamV2BgInfo.picBg;
        }
        return focusNotificationParamV2BgInfo.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPicBg() {
        return this.picBg;
    }

    @NotNull
    public final FocusNotificationParamV2BgInfo copy(@Nullable Integer type, @Nullable String picBg) {
        return new FocusNotificationParamV2BgInfo(type, picBg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusNotificationParamV2BgInfo)) {
            return false;
        }
        FocusNotificationParamV2BgInfo focusNotificationParamV2BgInfo = (FocusNotificationParamV2BgInfo) other;
        return Intrinsics.areEqual(this.type, focusNotificationParamV2BgInfo.type) && Intrinsics.areEqual(this.picBg, focusNotificationParamV2BgInfo.picBg);
    }

    @Nullable
    public final String getPicBg() {
        return this.picBg;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.picBg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FocusNotificationParamV2BgInfo(type=" + this.type + ", picBg=" + this.picBg + ")";
    }
}
