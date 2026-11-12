package com.huami.module.homepage.cards.business.femalehealth;

import android.graphics.Typeface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/huami/module/homepage/cards/business/femalehealth/CircleParam;", "", "", "component1", "component2", "", "component3", "", "component4", "Landroid/graphics/Typeface;", "component5", "circleColor", "textColor", "text", "outstanding", "typeface", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getCircleColor", "()I", "b", "getTextColor", "c", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "Z", "getOutstanding", "()Z", "e", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "<init>", "(IILjava/lang/String;ZLandroid/graphics/Typeface;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CircleParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int circleColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int textColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean outstanding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Typeface typeface;

    public CircleParam(int i, int i2, @NotNull String str, boolean z, @Nullable Typeface typeface) {
        this.circleColor = i;
        this.textColor = i2;
        this.text = str;
        this.outstanding = z;
        this.typeface = typeface;
    }

    public static /* synthetic */ CircleParam copy$default(CircleParam circleParam, int i, int i2, String str, boolean z, Typeface typeface, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = circleParam.circleColor;
        }
        if ((i3 & 2) != 0) {
            i2 = circleParam.textColor;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = circleParam.text;
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            z = circleParam.outstanding;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            typeface = circleParam.typeface;
        }
        return circleParam.copy(i, i4, str2, z2, typeface);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCircleColor() {
        return this.circleColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getOutstanding() {
        return this.outstanding;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @NotNull
    public final CircleParam copy(int circleColor, int textColor, @NotNull String text, boolean outstanding, @Nullable Typeface typeface) {
        return new CircleParam(circleColor, textColor, text, outstanding, typeface);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CircleParam)) {
            return false;
        }
        CircleParam circleParam = (CircleParam) other;
        return this.circleColor == circleParam.circleColor && this.textColor == circleParam.textColor && Intrinsics.areEqual(this.text, circleParam.text) && this.outstanding == circleParam.outstanding && Intrinsics.areEqual(this.typeface, circleParam.typeface);
    }

    public final int getCircleColor() {
        return this.circleColor;
    }

    public final boolean getOutstanding() {
        return this.outstanding;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final Typeface getTypeface() {
        return this.typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((this.circleColor * 31) + this.textColor) * 31) + this.text.hashCode()) * 31;
        boolean z = this.outstanding;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        Typeface typeface = this.typeface;
        return i + (typeface == null ? 0 : typeface.hashCode());
    }

    @NotNull
    public String toString() {
        return "CircleParam(circleColor=" + this.circleColor + ", textColor=" + this.textColor + ", text=" + this.text + ", outstanding=" + this.outstanding + ", typeface=" + this.typeface + ")";
    }
}
