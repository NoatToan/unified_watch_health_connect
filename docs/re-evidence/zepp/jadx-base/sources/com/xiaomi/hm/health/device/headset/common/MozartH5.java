package com.xiaomi.hm.health.device.headset.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/common/MozartH5;", "", "", "component1", "component2", "playUrl", "faqUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPlayUrl", "()Ljava/lang/String;", "b", "getFaqUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MozartH5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String playUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String faqUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public MozartH5() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public MozartH5(@Nullable String str, @Nullable String str2) {
        this.playUrl = str;
        this.faqUrl = str2;
    }

    public static /* synthetic */ MozartH5 copy$default(MozartH5 mozartH5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mozartH5.playUrl;
        }
        if ((i & 2) != 0) {
            str2 = mozartH5.faqUrl;
        }
        return mozartH5.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlayUrl() {
        return this.playUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    @NotNull
    public final MozartH5 copy(@Nullable String playUrl, @Nullable String faqUrl) {
        return new MozartH5(playUrl, faqUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MozartH5)) {
            return false;
        }
        MozartH5 mozartH5 = (MozartH5) other;
        return Intrinsics.areEqual(this.playUrl, mozartH5.playUrl) && Intrinsics.areEqual(this.faqUrl, mozartH5.faqUrl);
    }

    @Nullable
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    @Nullable
    public final String getPlayUrl() {
        return this.playUrl;
    }

    public int hashCode() {
        String str = this.playUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.faqUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MozartH5(playUrl=" + this.playUrl + ", faqUrl=" + this.faqUrl + ")";
    }

    public /* synthetic */ MozartH5(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
