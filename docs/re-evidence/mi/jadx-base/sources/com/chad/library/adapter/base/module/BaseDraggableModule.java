package com.chad.library.adapter.base.module;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import defpackage.d47;
import defpackage.dqi;
import defpackage.e47;
import defpackage.t8h;
import defpackage.w8h;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 m2\u00020\u0001:\u0001mB\u0017\u0012\u000e\u0010i\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030h¢\u0006\u0004\bk\u0010lJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010\u001aJ;\u0010)\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102R\"\u00103\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b3\u0010\u0014\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00104\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u00106R\"\u00109\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010[\u001a\u0004\u0018\u00010+8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010.R$\u0010`\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u00102R*\u0010f\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bf\u00104\u001a\u0004\bf\u0010\u0014\"\u0004\bg\u00106R\u001c\u0010i\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006n"}, d2 = {"Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "Le47;", "", "initItemTouch", "()V", "", "position", "", "inRange", "(I)Z", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "initView$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "initView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "attachToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "hasToggleView", "()Z", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "getViewHolderPosition", "(Landroidx/recyclerview/widget/RecyclerView$d0;)I", "onItemDragStart", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "source", "target", "onItemDragMoving", "(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "onItemDragEnd", "onItemSwipeStart", "onItemSwipeClear", "onItemSwiped", "Landroid/graphics/Canvas;", "canvas", "", "dX", "dY", "isCurrentlyActive", "onItemSwiping", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView$d0;FFZ)V", "Lt8h;", "onItemDragListener", "setOnItemDragListener", "(Lt8h;)V", "Lw8h;", "onItemSwipeListener", "setOnItemSwipeListener", "(Lw8h;)V", "isDragEnabled", "Z", "setDragEnabled", "(Z)V", "isSwipeEnabled", "setSwipeEnabled", "toggleViewId", "I", "getToggleViewId", "()I", "setToggleViewId", "(I)V", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Landroidx/recyclerview/widget/l;", "getItemTouchHelper", "()Landroidx/recyclerview/widget/l;", "setItemTouchHelper", "(Landroidx/recyclerview/widget/l;)V", "Ld47;", "itemTouchHelperCallback", "Ld47;", "getItemTouchHelperCallback", "()Ld47;", "setItemTouchHelperCallback", "(Ld47;)V", "Landroid/view/View$OnTouchListener;", "mOnToggleViewTouchListener", "Landroid/view/View$OnTouchListener;", "getMOnToggleViewTouchListener", "()Landroid/view/View$OnTouchListener;", "setMOnToggleViewTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Landroid/view/View$OnLongClickListener;", "mOnToggleViewLongClickListener", "Landroid/view/View$OnLongClickListener;", "getMOnToggleViewLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setMOnToggleViewLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "mOnItemDragListener", "Lt8h;", "getMOnItemDragListener", "()Lt8h;", "setMOnItemDragListener", "mOnItemSwipeListener", "Lw8h;", "getMOnItemSwipeListener", "()Lw8h;", "setMOnItemSwipeListener", "value", "isDragOnLongPressEnabled", "setDragOnLongPressEnabled", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public class BaseDraggableModule implements e47 {
    private static final int NO_TOGGLE_VIEW = 0;
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean isDragEnabled;
    private boolean isDragOnLongPressEnabled;
    private boolean isSwipeEnabled;

    @NotNull
    public l itemTouchHelper;

    @NotNull
    public d47 itemTouchHelperCallback;

    @Nullable
    private t8h mOnItemDragListener;

    @Nullable
    private w8h mOnItemSwipeListener;

    @Nullable
    private View.OnLongClickListener mOnToggleViewLongClickListener;

    @Nullable
    private View.OnTouchListener mOnToggleViewTouchListener;
    private int toggleViewId;

    public BaseDraggableModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        this.baseQuickAdapter = baseQuickAdapter;
        initItemTouch();
        this.isDragOnLongPressEnabled = true;
    }

    private final boolean inRange(int position) {
        return position >= 0 && position < this.baseQuickAdapter.getData().size();
    }

    private final void initItemTouch() {
        d47 d47Var = new d47(this);
        this.itemTouchHelperCallback = d47Var;
        this.itemTouchHelper = new l(d47Var);
    }

    public final void attachToRecyclerView(@NotNull RecyclerView recyclerView) {
        l lVar = this.itemTouchHelper;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelper");
        }
        lVar.d(recyclerView);
    }

    @NotNull
    public final l getItemTouchHelper() {
        l lVar = this.itemTouchHelper;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelper");
        }
        return lVar;
    }

    @NotNull
    public final d47 getItemTouchHelperCallback() {
        d47 d47Var = this.itemTouchHelperCallback;
        if (d47Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelperCallback");
        }
        return d47Var;
    }

    @Nullable
    public final t8h getMOnItemDragListener() {
        return null;
    }

    @Nullable
    public final w8h getMOnItemSwipeListener() {
        return null;
    }

    @Nullable
    public final View.OnLongClickListener getMOnToggleViewLongClickListener() {
        return this.mOnToggleViewLongClickListener;
    }

    @Nullable
    public final View.OnTouchListener getMOnToggleViewTouchListener() {
        return this.mOnToggleViewTouchListener;
    }

    public final int getToggleViewId() {
        return this.toggleViewId;
    }

    public final int getViewHolderPosition(@NotNull RecyclerView.d0 viewHolder) {
        return viewHolder.getAdapterPosition() - this.baseQuickAdapter.getHeaderLayoutCount();
    }

    public boolean hasToggleView() {
        return this.toggleViewId != 0;
    }

    public final void initView$com_github_CymChad_brvah(@NotNull BaseViewHolder holder) {
        View viewFindViewById;
        if (this.isDragEnabled && hasToggleView() && (viewFindViewById = holder.itemView.findViewById(this.toggleViewId)) != null) {
            viewFindViewById.setTag(dqi.c, holder);
            if (getIsDragOnLongPressEnabled()) {
                viewFindViewById.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            } else {
                viewFindViewById.setOnTouchListener(this.mOnToggleViewTouchListener);
            }
        }
    }

    /* JADX INFO: renamed from: isDragEnabled, reason: from getter */
    public final boolean getIsDragEnabled() {
        return this.isDragEnabled;
    }

    /* JADX INFO: renamed from: isDragOnLongPressEnabled, reason: from getter */
    public boolean getIsDragOnLongPressEnabled() {
        return this.isDragOnLongPressEnabled;
    }

    /* JADX INFO: renamed from: isSwipeEnabled, reason: from getter */
    public final boolean getIsSwipeEnabled() {
        return this.isSwipeEnabled;
    }

    public void onItemDragEnd(@NotNull RecyclerView.d0 viewHolder) {
    }

    public void onItemDragMoving(@NotNull RecyclerView.d0 source, @NotNull RecyclerView.d0 target) {
        int viewHolderPosition = getViewHolderPosition(source);
        int viewHolderPosition2 = getViewHolderPosition(target);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition >= viewHolderPosition2) {
                int i = viewHolderPosition2 + 1;
                if (viewHolderPosition >= i) {
                    while (true) {
                        Collections.swap(this.baseQuickAdapter.getData(), viewHolderPosition, viewHolderPosition - 1);
                        if (viewHolderPosition == i) {
                            break;
                        } else {
                            viewHolderPosition--;
                        }
                    }
                }
            } else {
                while (viewHolderPosition < viewHolderPosition2) {
                    int i2 = viewHolderPosition + 1;
                    Collections.swap(this.baseQuickAdapter.getData(), viewHolderPosition, i2);
                    viewHolderPosition = i2;
                }
            }
            this.baseQuickAdapter.notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
        }
    }

    public void onItemDragStart(@NotNull RecyclerView.d0 viewHolder) {
    }

    public void onItemSwipeClear(@NotNull RecyclerView.d0 viewHolder) {
    }

    public void onItemSwipeStart(@NotNull RecyclerView.d0 viewHolder) {
    }

    public void onItemSwiped(@NotNull RecyclerView.d0 viewHolder) {
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        if (inRange(viewHolderPosition)) {
            this.baseQuickAdapter.getData().remove(viewHolderPosition);
            this.baseQuickAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
        }
    }

    public void onItemSwiping(@Nullable Canvas canvas, @Nullable RecyclerView.d0 viewHolder, float dX, float dY, boolean isCurrentlyActive) {
    }

    public final void setDragEnabled(boolean z) {
        this.isDragEnabled = z;
    }

    public void setDragOnLongPressEnabled(boolean z) {
        this.isDragOnLongPressEnabled = z;
        if (z) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.module.BaseDraggableModule.isDragOnLongPressEnabled.1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    if (!BaseDraggableModule.this.getIsDragEnabled()) {
                        return true;
                    }
                    l itemTouchHelper = BaseDraggableModule.this.getItemTouchHelper();
                    Object tag = view.getTag(dqi.c);
                    if (tag == null) {
                        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
                    }
                    itemTouchHelper.x((RecyclerView.d0) tag);
                    return true;
                }
            };
        } else {
            this.mOnToggleViewTouchListener = new View.OnTouchListener() { // from class: com.chad.library.adapter.base.module.BaseDraggableModule.isDragOnLongPressEnabled.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent event) {
                    Intrinsics.checkExpressionValueIsNotNull(event, "event");
                    if (event.getAction() != 0 || BaseDraggableModule.this.getIsDragOnLongPressEnabled()) {
                        return false;
                    }
                    if (BaseDraggableModule.this.getIsDragEnabled()) {
                        l itemTouchHelper = BaseDraggableModule.this.getItemTouchHelper();
                        Object tag = view.getTag(dqi.c);
                        if (tag == null) {
                            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
                        }
                        itemTouchHelper.x((RecyclerView.d0) tag);
                    }
                    return true;
                }
            };
            this.mOnToggleViewLongClickListener = null;
        }
    }

    public final void setItemTouchHelper(@NotNull l lVar) {
        this.itemTouchHelper = lVar;
    }

    public final void setItemTouchHelperCallback(@NotNull d47 d47Var) {
        this.itemTouchHelperCallback = d47Var;
    }

    public final void setMOnItemDragListener(@Nullable t8h t8hVar) {
    }

    public final void setMOnItemSwipeListener(@Nullable w8h w8hVar) {
    }

    public final void setMOnToggleViewLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.mOnToggleViewLongClickListener = onLongClickListener;
    }

    public final void setMOnToggleViewTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        this.mOnToggleViewTouchListener = onTouchListener;
    }

    @Override // defpackage.e47
    public void setOnItemDragListener(@Nullable t8h onItemDragListener) {
    }

    @Override // defpackage.e47
    public void setOnItemSwipeListener(@Nullable w8h onItemSwipeListener) {
    }

    public final void setSwipeEnabled(boolean z) {
        this.isSwipeEnabled = z;
    }

    public final void setToggleViewId(int i) {
        this.toggleViewId = i;
    }
}
