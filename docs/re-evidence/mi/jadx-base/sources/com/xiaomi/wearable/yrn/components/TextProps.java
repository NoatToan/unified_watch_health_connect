package com.xiaomi.wearable.yrn.components;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/wearable/yrn/components/TextProps;", "", MediaStoreUtil.MediaInfo.SIZE, "", "color", "margin", "Lcom/xiaomi/wearable/yrn/components/MarginProps;", "padding", "Lcom/xiaomi/wearable/yrn/components/PaddingProps;", "<init>", "(ILjava/lang/Integer;Lcom/xiaomi/wearable/yrn/components/MarginProps;Lcom/xiaomi/wearable/yrn/components/PaddingProps;)V", "getSize", "()I", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMargin", "()Lcom/xiaomi/wearable/yrn/components/MarginProps;", "getPadding", "()Lcom/xiaomi/wearable/yrn/components/PaddingProps;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Integer;Lcom/xiaomi/wearable/yrn/components/MarginProps;Lcom/xiaomi/wearable/yrn/components/PaddingProps;)Lcom/xiaomi/wearable/yrn/components/TextProps;", "equals", "", "other", "hashCode", "toString", "", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextProps {

    @Nullable
    private final Integer color;

    @Nullable
    private final MarginProps margin;

    @Nullable
    private final PaddingProps padding;
    private final int size;

    public TextProps(int i, @Nullable Integer num, @Nullable MarginProps marginProps, @Nullable PaddingProps paddingProps) {
        this.size = i;
        this.color = num;
        this.margin = marginProps;
        this.padding = paddingProps;
    }

    public static /* synthetic */ TextProps copy$default(TextProps textProps, int i, Integer num, MarginProps marginProps, PaddingProps paddingProps, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textProps.size;
        }
        if ((i2 & 2) != 0) {
            num = textProps.color;
        }
        if ((i2 & 4) != 0) {
            marginProps = textProps.margin;
        }
        if ((i2 & 8) != 0) {
            paddingProps = textProps.padding;
        }
        return textProps.copy(i, num, marginProps, paddingProps);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarginProps getMargin() {
        return this.margin;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaddingProps getPadding() {
        return this.padding;
    }

    @NotNull
    public final TextProps copy(int size, @Nullable Integer color, @Nullable MarginProps margin, @Nullable PaddingProps padding) {
        return new TextProps(size, color, margin, padding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextProps)) {
            return false;
        }
        TextProps textProps = (TextProps) other;
        return this.size == textProps.size && Intrinsics.areEqual(this.color, textProps.color) && Intrinsics.areEqual(this.margin, textProps.margin) && Intrinsics.areEqual(this.padding, textProps.padding);
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final MarginProps getMargin() {
        return this.margin;
    }

    @Nullable
    public final PaddingProps getPadding() {
        return this.padding;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.size) * 31;
        Integer num = this.color;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        MarginProps marginProps = this.margin;
        int iHashCode3 = (iHashCode2 + (marginProps == null ? 0 : marginProps.hashCode())) * 31;
        PaddingProps paddingProps = this.padding;
        return iHashCode3 + (paddingProps != null ? paddingProps.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TextProps(size=" + this.size + ", color=" + this.color + ", margin=" + this.margin + ", padding=" + this.padding + ")";
    }
}
