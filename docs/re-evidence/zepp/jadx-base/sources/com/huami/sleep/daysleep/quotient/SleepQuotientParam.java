package com.huami.sleep.daysleep.quotient;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0004\bF\u0010GJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013HÆ\u0003J\u009c\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\u0002HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\tR\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010(R\u0019\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u001b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010(R-\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "", "", "component1", "Landroid/graphics/drawable/Drawable;", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "", "component6", "component7", "component8", "Lkotlin/Function2;", "Landroid/content/Context;", "", "component9", "Lkotlin/Function1;", "component10", "name", "nameDrawable", "refInfo", "value", "valueWithUnit", "needDetection", "trendDrawableRes", "trendInfo", "navigateToIntro", "navigateToDetect", "copy", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZILjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroid/graphics/drawable/Drawable;", "getNameDrawable", "()Landroid/graphics/drawable/Drawable;", "c", "getRefInfo", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getValue", "e", "getValueWithUnit", "f", "Z", "getNeedDetection", "()Z", "g", LogUtil.I, "getTrendDrawableRes", "()I", "h", "getTrendInfo", "i", "Lkotlin/jvm/functions/Function2;", "getNavigateToIntro", "()Lkotlin/jvm/functions/Function2;", z.j, "Lkotlin/jvm/functions/Function1;", "getNavigateToDetect", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZILjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepQuotientParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Drawable nameDrawable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String refInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String valueWithUnit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean needDetection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int trendDrawableRes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String trendInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Function2<Context, SleepQuotientParam, Unit> navigateToIntro;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final Function1<Context, Unit> navigateToDetect;

    /* JADX WARN: Multi-variable type inference failed */
    public SleepQuotientParam(@NotNull String str, @Nullable Drawable drawable, @NotNull String str2, @Nullable Integer num, @NotNull String str3, boolean z, int i, @Nullable String str4, @Nullable Function2<? super Context, ? super SleepQuotientParam, Unit> function2, @Nullable Function1<? super Context, Unit> function1) {
        this.name = str;
        this.nameDrawable = drawable;
        this.refInfo = str2;
        this.value = num;
        this.valueWithUnit = str3;
        this.needDetection = z;
        this.trendDrawableRes = i;
        this.trendInfo = str4;
        this.navigateToIntro = function2;
        this.navigateToDetect = function1;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Function1<Context, Unit> component10() {
        return this.navigateToDetect;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getNameDrawable() {
        return this.nameDrawable;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefInfo() {
        return this.refInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValueWithUnit() {
        return this.valueWithUnit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNeedDetection() {
        return this.needDetection;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTrendDrawableRes() {
        return this.trendDrawableRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTrendInfo() {
        return this.trendInfo;
    }

    @Nullable
    public final Function2<Context, SleepQuotientParam, Unit> component9() {
        return this.navigateToIntro;
    }

    @NotNull
    public final SleepQuotientParam copy(@NotNull String name, @Nullable Drawable nameDrawable, @NotNull String refInfo, @Nullable Integer value, @NotNull String valueWithUnit, boolean needDetection, int trendDrawableRes, @Nullable String trendInfo, @Nullable Function2<? super Context, ? super SleepQuotientParam, Unit> navigateToIntro, @Nullable Function1<? super Context, Unit> navigateToDetect) {
        return new SleepQuotientParam(name, nameDrawable, refInfo, value, valueWithUnit, needDetection, trendDrawableRes, trendInfo, navigateToIntro, navigateToDetect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepQuotientParam)) {
            return false;
        }
        SleepQuotientParam sleepQuotientParam = (SleepQuotientParam) other;
        return Intrinsics.areEqual(this.name, sleepQuotientParam.name) && Intrinsics.areEqual(this.nameDrawable, sleepQuotientParam.nameDrawable) && Intrinsics.areEqual(this.refInfo, sleepQuotientParam.refInfo) && Intrinsics.areEqual(this.value, sleepQuotientParam.value) && Intrinsics.areEqual(this.valueWithUnit, sleepQuotientParam.valueWithUnit) && this.needDetection == sleepQuotientParam.needDetection && this.trendDrawableRes == sleepQuotientParam.trendDrawableRes && Intrinsics.areEqual(this.trendInfo, sleepQuotientParam.trendInfo) && Intrinsics.areEqual(this.navigateToIntro, sleepQuotientParam.navigateToIntro) && Intrinsics.areEqual(this.navigateToDetect, sleepQuotientParam.navigateToDetect);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Drawable getNameDrawable() {
        return this.nameDrawable;
    }

    @Nullable
    public final Function1<Context, Unit> getNavigateToDetect() {
        return this.navigateToDetect;
    }

    @Nullable
    public final Function2<Context, SleepQuotientParam, Unit> getNavigateToIntro() {
        return this.navigateToIntro;
    }

    public final boolean getNeedDetection() {
        return this.needDetection;
    }

    @NotNull
    public final String getRefInfo() {
        return this.refInfo;
    }

    public final int getTrendDrawableRes() {
        return this.trendDrawableRes;
    }

    @Nullable
    public final String getTrendInfo() {
        return this.trendInfo;
    }

    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    @NotNull
    public final String getValueWithUnit() {
        return this.valueWithUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Drawable drawable = this.nameDrawable;
        int iHashCode2 = (((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.refInfo.hashCode()) * 31;
        Integer num = this.value;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.valueWithUnit.hashCode()) * 31;
        boolean z = this.needDetection;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (((iHashCode3 + r1) * 31) + this.trendDrawableRes) * 31;
        String str = this.trendInfo;
        int iHashCode4 = (i + (str == null ? 0 : str.hashCode())) * 31;
        Function2<Context, SleepQuotientParam, Unit> function2 = this.navigateToIntro;
        int iHashCode5 = (iHashCode4 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1<Context, Unit> function1 = this.navigateToDetect;
        return iHashCode5 + (function1 != null ? function1.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SleepQuotientParam(name=" + this.name + ", nameDrawable=" + this.nameDrawable + ", refInfo=" + this.refInfo + ", value=" + this.value + ", valueWithUnit=" + this.valueWithUnit + ", needDetection=" + this.needDetection + ", trendDrawableRes=" + this.trendDrawableRes + ", trendInfo=" + this.trendInfo + ", navigateToIntro=" + this.navigateToIntro + ", navigateToDetect=" + this.navigateToDetect + ")";
    }

    public /* synthetic */ SleepQuotientParam(String str, Drawable drawable, String str2, Integer num, String str3, boolean z, int i, String str4, Function2 function2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, drawable, str2, num, str3, z, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : function2, (i2 & 512) != 0 ? null : function1);
    }
}
