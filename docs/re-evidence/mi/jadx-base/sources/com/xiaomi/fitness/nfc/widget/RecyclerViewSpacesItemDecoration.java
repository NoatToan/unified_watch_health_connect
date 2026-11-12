package com.xiaomi.fitness.nfc.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.pli;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\"\u0010\u001a\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/nfc/widget/RecyclerViewSpacesItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "top", "I", "getTop", "()I", "setTop", "(I)V", "left", "getLeft", "setLeft", "bottom", "getBottom", "setBottom", TSMAuthContants.PARAM_KEY_RIGHT, "getRight", "setRight", "<init>", "(IIII)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecyclerViewSpacesItemDecoration extends RecyclerView.n {
    private int bottom;
    private int left;
    private int right;
    private int top;

    public RecyclerViewSpacesItemDecoration() {
        this(0, 0, 0, 0, 15, null);
    }

    public final int getBottom() {
        return this.bottom;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        int dp;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int dimension = ExtUtilsKt.getDimension(pli.p);
        int dimension2 = ExtUtilsKt.getDimension(pli.f);
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        if (settingsPropertiesUtil.isFolded(AppUtil.getApp())) {
            this.left = dimension;
            this.right = dimension;
        } else if (parent.getChildAdapterPosition(view) % 2 == 0) {
            this.left = dimension;
            this.right = dimension2;
        } else {
            this.right = dimension;
            this.left = dimension2;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (uIUtils.isTablet() && uIUtils.isLandscape(ApplicationExtKt.getApplication())) {
            dp = ExtUtilsKt.getDp(Float.valueOf(16.0f));
        } else {
            dp = settingsPropertiesUtil.isFoldDisplayAndNotFolded() ? ExtUtilsKt.getDp(Float.valueOf(26.0f)) : ExtUtilsKt.getDimension(pli.p);
        }
        outRect.top = this.top;
        outRect.bottom = this.bottom;
        outRect.left = dp;
        outRect.right = dp;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public final void setBottom(int i) {
        this.bottom = i;
    }

    public final void setLeft(int i) {
        this.left = i;
    }

    public final void setRight(int i) {
        this.right = i;
    }

    public final void setTop(int i) {
        this.top = i;
    }

    public /* synthetic */ RecyclerViewSpacesItemDecoration(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? ExtUtilsKt.getDimension(pli.p) : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? ExtUtilsKt.getDimension(pli.p) : i4);
    }

    public RecyclerViewSpacesItemDecoration(int i, int i2, int i3, int i4) {
        this.top = i;
        this.left = i2;
        this.bottom = i3;
        this.right = i4;
    }
}
