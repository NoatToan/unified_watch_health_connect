package com.xiaomi.fitness.habit.ui;

import android.app.Application;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.hli;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/TodayItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "", "todayCount", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)I", "top", "I", "getTop", "()I", "setTop", "(I)V", "left", "getLeft", "setLeft", "bottom", "getBottom", "setBottom", TSMAuthContants.PARAM_KEY_RIGHT, "getRight", "setRight", "<init>", "(IIII)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TodayItemDecoration extends RecyclerView.n {
    private int bottom;
    private int left;
    private int right;
    private int top;

    public TodayItemDecoration() {
        this(0, 0, 0, 0, 15, null);
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        int dimension;
        int dimension2;
        HabitTodayAdapter.Companion companion;
        int i;
        Application application;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemViewType(childAdapterPosition)) : null;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            dimension = ExtUtilsKt.getDimension(hli.c);
            dimension2 = ExtUtilsKt.getDimension(hli.f20216b);
            companion = HabitTodayAdapter.INSTANCE;
            int typeToday = companion.getTypeToday();
            if (numValueOf != null) {
                int typeRecommend = companion.getTypeRecommend();
                if (numValueOf == null) {
                    this.left = dimension;
                    this.right = dimension;
                } else {
                    i = todayCount(parent.getAdapter());
                    if (childAdapterPosition % 2 == ((i == 0 && i % 2 == 0) ? 1 : 0)) {
                        this.left = dimension;
                        this.right = dimension2;
                    } else {
                        this.left = dimension2;
                        this.right = dimension;
                    }
                }
            } else if (childAdapterPosition % 2 == 0) {
                this.left = dimension;
                this.right = dimension2;
            } else {
                this.left = dimension2;
                this.right = dimension;
            }
        } else {
            UIUtils uIUtils = UIUtils.INSTANCE;
            if (uIUtils.isTablet() && (application = ApplicationExtKt.getApplication()) != null && uIUtils.isLandscape(application)) {
                dimension = ExtUtilsKt.getDimension(hli.c);
                dimension2 = ExtUtilsKt.getDimension(hli.f20216b);
                companion = HabitTodayAdapter.INSTANCE;
                int typeToday2 = companion.getTypeToday();
                if (numValueOf != null || numValueOf.intValue() != typeToday2) {
                    int typeRecommend2 = companion.getTypeRecommend();
                    if (numValueOf == null && numValueOf.intValue() == typeRecommend2) {
                        i = todayCount(parent.getAdapter());
                        if (childAdapterPosition % 2 == ((i == 0 && i % 2 == 0) ? 1 : 0)) {
                            this.left = dimension;
                            this.right = dimension2;
                        } else {
                            this.left = dimension2;
                            this.right = dimension;
                        }
                    } else {
                        this.left = dimension;
                        this.right = dimension;
                    }
                } else if (childAdapterPosition % 2 == 0) {
                    this.left = dimension;
                    this.right = dimension2;
                } else {
                    this.left = dimension2;
                    this.right = dimension;
                }
            }
        }
        outRect.top = this.top;
        outRect.bottom = this.bottom;
        outRect.left = this.left;
        outRect.right = this.right;
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

    public final int todayCount(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter == null) {
            return 0;
        }
        int count = adapter.getCount();
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            if (adapter.getItemViewType(i2) == HabitTodayAdapter.INSTANCE.getTypeToday()) {
                i++;
            }
        }
        return i;
    }

    public /* synthetic */ TodayItemDecoration(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? ExtUtilsKt.getDp(Float.valueOf(16.0f)) : i, (i5 & 2) != 0 ? ExtUtilsKt.getDp(Float.valueOf(13.0f)) : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? ExtUtilsKt.getDp(Float.valueOf(13.0f)) : i4);
    }

    public TodayItemDecoration(int i, int i2, int i3, int i4) {
        this.top = i;
        this.left = i2;
        this.bottom = i3;
        this.right = i4;
    }
}
