package com.huami.sky.lib.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/huami/sky/lib/entity/AssetInfo;", "", "", "component1", "", "component2", "component3", "component4", "component5", "buttonText", "tipType", "label", "text", "createAt", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getButtonText", "()Ljava/lang/String;", LogUtil.I, "getTipType", "()I", "getLabel", "getText", "getCreateAt", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AssetInfo {

    @SerializedName("button_text")
    @NotNull
    private final String buttonText;

    @SerializedName("create_at")
    @NotNull
    private final String createAt;

    @NotNull
    private final String label;

    @NotNull
    private final String text;

    @SerializedName("tip_type")
    private final int tipType;

    public AssetInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.buttonText = str;
        this.tipType = i;
        this.label = str2;
        this.text = str3;
        this.createAt = str4;
    }

    public static /* synthetic */ AssetInfo copy$default(AssetInfo assetInfo, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = assetInfo.buttonText;
        }
        if ((i2 & 2) != 0) {
            i = assetInfo.tipType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = assetInfo.label;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = assetInfo.text;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = assetInfo.createAt;
        }
        return assetInfo.copy(str, i3, str5, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTipType() {
        return this.tipType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreateAt() {
        return this.createAt;
    }

    @NotNull
    public final AssetInfo copy(@NotNull String buttonText, int tipType, @NotNull String label, @NotNull String text, @NotNull String createAt) {
        return new AssetInfo(buttonText, tipType, label, text, createAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetInfo)) {
            return false;
        }
        AssetInfo assetInfo = (AssetInfo) other;
        return Intrinsics.areEqual(this.buttonText, assetInfo.buttonText) && this.tipType == assetInfo.tipType && Intrinsics.areEqual(this.label, assetInfo.label) && Intrinsics.areEqual(this.text, assetInfo.text) && Intrinsics.areEqual(this.createAt, assetInfo.createAt);
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final String getCreateAt() {
        return this.createAt;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getTipType() {
        return this.tipType;
    }

    public int hashCode() {
        return (((((((this.buttonText.hashCode() * 31) + this.tipType) * 31) + this.label.hashCode()) * 31) + this.text.hashCode()) * 31) + this.createAt.hashCode();
    }

    @NotNull
    public String toString() {
        return "AssetInfo(buttonText=" + this.buttonText + ", tipType=" + this.tipType + ", label=" + this.label + ", text=" + this.text + ", createAt=" + this.createAt + ")";
    }
}
