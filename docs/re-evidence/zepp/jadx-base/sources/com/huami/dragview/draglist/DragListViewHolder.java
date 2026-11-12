package com.huami.dragview.draglist;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.dragview.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/dragview/draglist/DragListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/dragview/draglist/DragEntry;", "dragEntry", "", "bind", "Landroid/view/View;", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/recyclerview/widget/ItemTouchHelper;", "b", "Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelper", "<init>", "(Landroid/view/View;Landroidx/recyclerview/widget/ItemTouchHelper;)V", "Companion", "dragview_release"}, k = 1, mv = {1, 4, 0})
public final class DragListViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ItemTouchHelper itemTouchHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/huami/dragview/draglist/DragListViewHolder$Companion;", "", "", "viewType", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelper", "Lcom/huami/dragview/draglist/DragListViewHolder;", "create", "<init>", "()V", "dragview_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final DragListViewHolder create(int viewType, @NotNull ViewGroup parent, @NotNull ItemTouchHelper itemTouchHelper) {
            View viewInflate;
            int i = R.layout.dragview_activity_drag_item_data;
            if (viewType == i) {
                viewInflate = LayoutInflater.from(parent.getContext()).inflate(i, parent, false);
            } else {
                int i2 = R.layout.dragview_activity_drag_item_title;
                viewInflate = viewType == i2 ? LayoutInflater.from(parent.getContext()).inflate(i2, parent, false) : LayoutInflater.from(parent.getContext()).inflate(R.layout.dragview_activity_drag_item_empty, parent, false);
            }
            return new DragListViewHolder(viewInflate, itemTouchHelper);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onLongClick", "(Landroid/view/View;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a implements View.OnLongClickListener {
        public final /* synthetic */ DragEntry b;

        public a(DragEntry dragEntry) {
            this.b = dragEntry;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            if (this.b.getCanDrag()) {
                view.setBackgroundResource(R.drawable.dragview_drag_item_normal);
                DragListViewHolder.this.view.findViewById(R.id.dragview_drag_item_line).setVisibility(8);
                DragListViewHolder.this.itemTouchHelper.startDrag(DragListViewHolder.this);
                return true;
            }
            String cannotDragTips = DragListAdapter.INSTANCE.getCannotDragTips();
            if (cannotDragTips != null) {
                DragListAdapterKt.centerToast(DragListViewHolder.this.view.getContext(), cannotDragTips);
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onLongClick", "(Landroid/view/View;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b implements View.OnLongClickListener {
        public static final b a = new b();

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return false;
        }
    }

    public DragListViewHolder(@NotNull View view, @NotNull ItemTouchHelper itemTouchHelper) {
        super(view);
        this.view = view;
        this.itemTouchHelper = itemTouchHelper;
    }

    public final void bind(@NotNull DragEntry dragEntry) {
        Integer iconTint;
        int id = this.view.getId();
        if (id != R.id.dragview_drag_item) {
            if (id != R.id.dragview_drag_title) {
                ((TextView) this.view.findViewById(R.id.dragview_drag_item_not_show_empty)).setText(dragEntry.getTitle());
                return;
            } else {
                ((TextView) this.view.findViewById(R.id.dragview_drag_item_title)).setText(dragEntry.getTitle());
                this.view.setOnLongClickListener(b.a);
                return;
            }
        }
        this.view.setBackgroundResource(dragEntry.getBackground());
        ImageView imageView = (ImageView) this.view.findViewById(R.id.dragview_drag_item_icon);
        imageView.setBackgroundResource(dragEntry.getIcon());
        if (dragEntry.getIconTint() != null && ((iconTint = dragEntry.getIconTint()) == null || iconTint.intValue() != 0)) {
            imageView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), dragEntry.getIconTint().intValue())));
        }
        ((TextView) this.view.findViewById(R.id.dragview_drag_item_title)).setText(dragEntry.getTitle());
        this.view.findViewById(R.id.dragview_drag_item_line).setVisibility(dragEntry.getShowItemLine() ? 0 : 8);
        this.view.setOnLongClickListener(new a(dragEntry));
    }
}
