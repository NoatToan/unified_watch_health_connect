package com.xiaomi.fitness.devicesettings.huami.shortcut;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.devicesettings.huami.shortcut.ShortcutListAdapter;
import defpackage.sk6;
import defpackage.snd;
import defpackage.w9e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006()*+,'B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J2\u0010\n\u001a\u00020\b2#\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R3\u0010#\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$ViewHolder;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemIconClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", "getCurrentMutableList", "()Ljava/util/List;", "list", "submitList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$ViewHolder;I)V", "getItemViewType", "(I)I", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Landroidx/recyclerview/widget/l;", "mCurrentMutableList", "Ljava/util/List;", "mItemIconClickListener", "Lkotlin/jvm/functions/Function1;", "<init>", "(Landroidx/recyclerview/widget/l;)V", "Companion", "ItemViewHolder", "HideItemViewHolder", "LabelViewHolder", "ViewHolder", "DiffCallback", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShortcutListAdapter extends p<ShortcutListItem, ViewHolder> {
    private static final int VIEW_TYPE_INVISIBLE_ITEM = 2;
    private static final int VIEW_TYPE_LABEL_ITEM = 3;
    private static final int VIEW_TYPE_VISIBLE_ITEM = 1;

    @NotNull
    private final l itemTouchHelper;

    @Nullable
    private List<ShortcutListItem> mCurrentMutableList;

    @Nullable
    private Function1<? super ShortcutListItem, Unit> mItemIconClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;)Z", "areContentsTheSame", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<ShortcutListItem> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull ShortcutListItem oldItem, @NotNull ShortcutListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (newItem.isDragging()) {
                return true;
            }
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull ShortcutListItem oldItem, @NotNull ShortcutListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getSubType() == newItem.getSubType();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$HideItemViewHolder;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$ViewHolder;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "data", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;)V", "Lw9e;", "mViewBinding", "Lw9e;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter;Lw9e;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HideItemViewHolder extends ViewHolder {

        @NotNull
        private final w9e mViewBinding;
        final /* synthetic */ ShortcutListAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        public HideItemViewHolder(@NotNull ShortcutListAdapter shortcutListAdapter, w9e mViewBinding) {
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            this.this$0 = shortcutListAdapter;
            View root = mViewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.mViewBinding = mViewBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(ShortcutListAdapter this$0, ShortcutListItem data, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(data, "$data");
            Function1 function1 = this$0.mItemIconClickListener;
            if (function1 != null) {
                function1.invoke2(data);
            }
        }

        @Override // com.xiaomi.fitness.devicesettings.huami.shortcut.ShortcutListAdapter.ViewHolder
        public void bind(@NotNull final ShortcutListItem data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.mViewBinding.B.setText(data.getName());
            this.mViewBinding.A.setImageResource(data.getIcon());
            if (data.isAlwaysShown()) {
                this.mViewBinding.A.setOnClickListener(null);
                return;
            }
            ImageView imageView = this.mViewBinding.A;
            final ShortcutListAdapter shortcutListAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: zam
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortcutListAdapter.HideItemViewHolder.bind$lambda$0(shortcutListAdapter, data, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$ItemViewHolder;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$ViewHolder;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "data", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;)V", "Lsk6;", "mViewBinding", "Lsk6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter;Lsk6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ItemViewHolder extends ViewHolder {

        @NotNull
        private final sk6 mViewBinding;
        final /* synthetic */ ShortcutListAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        public ItemViewHolder(@NotNull ShortcutListAdapter shortcutListAdapter, sk6 mViewBinding) {
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            this.this$0 = shortcutListAdapter;
            View root = mViewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.mViewBinding = mViewBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(ShortcutListAdapter this$0, ShortcutListItem data, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(data, "$data");
            Function1 function1 = this$0.mItemIconClickListener;
            if (function1 != null) {
                function1.invoke2(data);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean bind$lambda$1(ShortcutListAdapter this$0, ItemViewHolder this$1, View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (motionEvent.getAction() != 0) {
                return false;
            }
            this$0.itemTouchHelper.x(this$1);
            return false;
        }

        @Override // com.xiaomi.fitness.devicesettings.huami.shortcut.ShortcutListAdapter.ViewHolder
        @SuppressLint({"ClickableViewAccessibility"})
        public void bind(@NotNull final ShortcutListItem data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.mViewBinding.B.setText(data.getName());
            this.mViewBinding.A.setImageResource(data.getIcon());
            if (data.isAlwaysShown()) {
                this.mViewBinding.A.setOnClickListener(null);
            } else {
                ImageView imageView = this.mViewBinding.A;
                final ShortcutListAdapter shortcutListAdapter = this.this$0;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: abm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShortcutListAdapter.ItemViewHolder.bind$lambda$0(shortcutListAdapter, data, view);
                    }
                });
            }
            this.mViewBinding.C.setVisibility(data.getDragIconVisibility());
            if ((!data.isDragging() && !data.getEnable()) || data.isAlwaysShown()) {
                this.mViewBinding.C.setVisibility(8);
                this.mViewBinding.C.setOnTouchListener(null);
            } else {
                this.mViewBinding.C.setVisibility(0);
                ImageView imageView2 = this.mViewBinding.C;
                final ShortcutListAdapter shortcutListAdapter2 = this.this$0;
                imageView2.setOnTouchListener(new View.OnTouchListener() { // from class: bbm
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return ShortcutListAdapter.ItemViewHolder.bind$lambda$1(shortcutListAdapter2, this, view, motionEvent);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$LabelViewHolder;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$ViewHolder;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "data", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;)V", "Lsnd;", "mViewBinding", "Lsnd;", "<init>", "(Lsnd;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class LabelViewHolder extends ViewHolder {

        @NotNull
        private final snd mViewBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        public LabelViewHolder(@NotNull snd mViewBinding) {
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            View root = mViewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.mViewBinding = mViewBinding;
        }

        @Override // com.xiaomi.fitness.devicesettings.huami.shortcut.ShortcutListAdapter.ViewHolder
        public void bind(@NotNull ShortcutListItem data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.mViewBinding.A.setText(data.getName());
            this.mViewBinding.B.setVisibility(data.getEnable() ? 8 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "data", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static abstract class ViewHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        public abstract void bind(@NotNull ShortcutListItem data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutListAdapter(@NotNull l itemTouchHelper) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        this.itemTouchHelper = itemTouchHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$0(ShortcutListAdapter this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCurrentMutableList != list) {
            this$0.mCurrentMutableList = list;
        }
    }

    @Nullable
    public final List<ShortcutListItem> getCurrentMutableList() {
        return this.mCurrentMutableList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ShortcutListItem item = getItem(position);
        if (item.getType() == 1) {
            return 3;
        }
        return (item.getEnable() || item.isDragging()) ? 1 : 2;
    }

    public final void setOnItemIconClickListener(@Nullable Function1<? super ShortcutListItem, Unit> listener) {
        this.mItemIconClickListener = listener;
    }

    @Override // androidx.recyclerview.widget.p
    public void submitList(@Nullable final List<ShortcutListItem> list) {
        super.submitList(list, new Runnable() { // from class: yam
            @Override // java.lang.Runnable
            public final void run() {
                ShortcutListAdapter.submitList$lambda$0(this.f39992a, list);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ShortcutListItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 1) {
            sk6 sk6VarA0 = sk6.A0(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(sk6VarA0, "inflate(...)");
            return new ItemViewHolder(this, sk6VarA0);
        }
        if (viewType == 2) {
            w9e w9eVarA0 = w9e.A0(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(w9eVarA0, "inflate(...)");
            return new HideItemViewHolder(this, w9eVarA0);
        }
        if (viewType == 3) {
            snd sndVarA0 = snd.A0(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(sndVarA0, "inflate(...)");
            return new LabelViewHolder(sndVarA0);
        }
        throw new IllegalArgumentException("unknown item type:" + viewType);
    }
}
