package com.huami.module.homepage.cards.business.pai;

import androidx.annotation.ColorInt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0003\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016¨\u0006#"}, d2 = {"Lcom/huami/module/homepage/cards/business/pai/StraightGraphParam;", "", "", "component1", "", "component2", "", "component3", "component4", "index", "value", "text", "color", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "F", "getValue", "()F", "c", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getColor", "<init>", "(IFLjava/lang/String;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StraightGraphParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int color;

    public StraightGraphParam(int i, float f, @NotNull String str, @ColorInt int i2) {
        this.index = i;
        this.value = f;
        this.text = str;
        this.color = i2;
    }

    public static /* synthetic */ StraightGraphParam copy$default(StraightGraphParam straightGraphParam, int i, float f, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = straightGraphParam.index;
        }
        if ((i3 & 2) != 0) {
            f = straightGraphParam.value;
        }
        if ((i3 & 4) != 0) {
            str = straightGraphParam.text;
        }
        if ((i3 & 8) != 0) {
            i2 = straightGraphParam.color;
        }
        return straightGraphParam.copy(i, f, str, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final StraightGraphParam copy(int index, float value, @NotNull String text, @ColorInt int color) {
        return new StraightGraphParam(index, value, text, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StraightGraphParam)) {
            return false;
        }
        StraightGraphParam straightGraphParam = (StraightGraphParam) other;
        return this.index == straightGraphParam.index && Intrinsics.areEqual((Object) Float.valueOf(this.value), (Object) Float.valueOf(straightGraphParam.value)) && Intrinsics.areEqual(this.text, straightGraphParam.text) && this.color == straightGraphParam.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.index * 31) + Float.floatToIntBits(this.value)) * 31) + this.text.hashCode()) * 31) + this.color;
    }

    @NotNull
    public String toString() {
        return "StraightGraphParam(index=" + this.index + ", value=" + this.value + ", text=" + this.text + ", color=" + this.color + ")";
    }
}
