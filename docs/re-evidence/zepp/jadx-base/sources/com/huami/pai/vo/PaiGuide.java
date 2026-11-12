package com.huami.pai.vo;

import com.alipay.sdk.m.x.d;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J+\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/pai/vo/PaiGuide;", "", "", "component1", "component2", "", "component3", "title", "desc", "illustrationId", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "b", "getDesc", "setDesc", "c", LogUtil.I, "getIllustrationId", "()I", "setIllustrationId", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PaiGuide {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String desc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int illustrationId;

    public PaiGuide() {
        this(null, null, 0, 7, null);
    }

    public PaiGuide(@Nullable String str, @Nullable String str2, int i) {
        this.title = str;
        this.desc = str2;
        this.illustrationId = i;
    }

    public static /* synthetic */ PaiGuide copy$default(PaiGuide paiGuide, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paiGuide.title;
        }
        if ((i2 & 2) != 0) {
            str2 = paiGuide.desc;
        }
        if ((i2 & 4) != 0) {
            i = paiGuide.illustrationId;
        }
        return paiGuide.copy(str, str2, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIllustrationId() {
        return this.illustrationId;
    }

    @NotNull
    public final PaiGuide copy(@Nullable String title, @Nullable String desc, int illustrationId) {
        return new PaiGuide(title, desc, illustrationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaiGuide)) {
            return false;
        }
        PaiGuide paiGuide = (PaiGuide) other;
        return Intrinsics.areEqual(this.title, paiGuide.title) && Intrinsics.areEqual(this.desc, paiGuide.desc) && this.illustrationId == paiGuide.illustrationId;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final int getIllustrationId() {
        return this.illustrationId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.illustrationId;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setIllustrationId(int i) {
        this.illustrationId = i;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "PaiGuide(title=" + this.title + ", desc=" + this.desc + ", illustrationId=" + this.illustrationId + ")";
    }

    public /* synthetic */ PaiGuide(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
