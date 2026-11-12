package com.xiaomi.fitness.login.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u001d\b\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0019J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/login/widget/CommonItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "leftMargin", "I", "rightMargin", "dividerHeight", "", "mIsShowBottomDivider", "Z", "isShowBottomDivider", "<init>", "(IIIZ)V", "value", "(IZ)V", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CommonItemDecoration extends RecyclerView.n {
    private final int dividerHeight;
    private final int leftMargin;
    private boolean mIsShowBottomDivider;
    private final int rightMargin;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CommonItemDecoration() {
        this(0, (boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int iC = state.c() - 1;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (this.mIsShowBottomDivider || childAdapterPosition < iC) {
            outRect.set(this.leftMargin, 0, this.rightMargin, this.dividerHeight);
        } else {
            outRect.set(this.leftMargin, 0, this.rightMargin, 0);
        }
    }

    @JvmOverloads
    public CommonItemDecoration(int i) {
        this(i, false, 2, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public CommonItemDecoration(int i, int i2, int i3) {
        this(i, i2, i3, false, 8, null);
    }

    public /* synthetic */ CommonItemDecoration(int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? true : z);
    }

    @JvmOverloads
    public CommonItemDecoration(int i, int i2, int i3, boolean z) {
        this.leftMargin = i;
        this.rightMargin = i2;
        this.dividerHeight = i3;
        this.mIsShowBottomDivider = z;
    }

    public /* synthetic */ CommonItemDecoration(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z);
    }

    @JvmOverloads
    public CommonItemDecoration(int i, boolean z) {
        this(i, i, i, z);
    }
}
