package com.huami.bloodoxygen.ui.vo;

import android.graphics.Color;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\n\u0010\u0015R\u001d\u0010\u001f\u001a\u00020\u000e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "", "", "component1", "component2", "component3", "component4", "showAddEntrance", "showJapaneseHint", "showCardShadow", "isMifitStyle", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getShowAddEntrance", "()Z", "b", "getShowJapaneseHint", "c", "getShowCardShadow", GoogleApiAvailabilityLight.a, "e", "Lkotlin/Lazy;", "getMifitThemeColor", "()I", "mifitThemeColor", "<init>", "(ZZZZ)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DetailUIConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean showAddEntrance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean showJapaneseHint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean showCardShadow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isMifitStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mifitThemeColor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return Color.parseColor("#12B779");
        }
    }

    public DetailUIConfig() {
        this(false, false, false, false, 15, null);
    }

    public DetailUIConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.showAddEntrance = z;
        this.showJapaneseHint = z2;
        this.showCardShadow = z3;
        this.isMifitStyle = z4;
        this.mifitThemeColor = LazyKt__LazyJVMKt.lazy(a.a);
    }

    public static /* synthetic */ DetailUIConfig copy$default(DetailUIConfig detailUIConfig, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = detailUIConfig.showAddEntrance;
        }
        if ((i & 2) != 0) {
            z2 = detailUIConfig.showJapaneseHint;
        }
        if ((i & 4) != 0) {
            z3 = detailUIConfig.showCardShadow;
        }
        if ((i & 8) != 0) {
            z4 = detailUIConfig.isMifitStyle;
        }
        return detailUIConfig.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowAddEntrance() {
        return this.showAddEntrance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowJapaneseHint() {
        return this.showJapaneseHint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowCardShadow() {
        return this.showCardShadow;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMifitStyle() {
        return this.isMifitStyle;
    }

    @NotNull
    public final DetailUIConfig copy(boolean showAddEntrance, boolean showJapaneseHint, boolean showCardShadow, boolean isMifitStyle) {
        return new DetailUIConfig(showAddEntrance, showJapaneseHint, showCardShadow, isMifitStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailUIConfig)) {
            return false;
        }
        DetailUIConfig detailUIConfig = (DetailUIConfig) other;
        return this.showAddEntrance == detailUIConfig.showAddEntrance && this.showJapaneseHint == detailUIConfig.showJapaneseHint && this.showCardShadow == detailUIConfig.showCardShadow && this.isMifitStyle == detailUIConfig.isMifitStyle;
    }

    public final int getMifitThemeColor() {
        return ((Number) this.mifitThemeColor.getValue()).intValue();
    }

    public final boolean getShowAddEntrance() {
        return this.showAddEntrance;
    }

    public final boolean getShowCardShadow() {
        return this.showCardShadow;
    }

    public final boolean getShowJapaneseHint() {
        return this.showJapaneseHint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z = this.showAddEntrance;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.showJapaneseHint;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.showCardShadow;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.isMifitStyle;
        return i3 + (z4 ? 1 : z4);
    }

    public final boolean isMifitStyle() {
        return this.isMifitStyle;
    }

    @NotNull
    public String toString() {
        return "DetailUIConfig(showAddEntrance=" + this.showAddEntrance + ", showJapaneseHint=" + this.showJapaneseHint + ", showCardShadow=" + this.showCardShadow + ", isMifitStyle=" + this.isMifitStyle + ")";
    }

    public /* synthetic */ DetailUIConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
