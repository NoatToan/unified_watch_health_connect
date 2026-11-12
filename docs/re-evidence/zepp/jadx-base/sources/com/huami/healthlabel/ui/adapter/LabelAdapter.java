package com.huami.healthlabel.ui.adapter;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.huami.healthlabel.R;
import com.huami.healthlabel.ui.custom.LabelTextView;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.ViewExtKt;
import com.huami.lib.healthlabel.service.MixLabel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\u001b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/huami/healthlabel/ui/adapter/LabelAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/huami/lib/healthlabel/service/MixLabel;", "Lcom/huami/healthlabel/ui/adapter/LabelViewHolder;", "", "position", "Lcom/huami/healthlabel/ui/custom/LabelTextView;", "labelText", "", "a", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "onBindViewHolder", "Lcom/huami/healthlabel/ui/adapter/LabelAdapter$ItemListener;", "Lcom/huami/healthlabel/ui/adapter/LabelAdapter$ItemListener;", "itemClickListener", "", "b", "Z", "itemCanClick", "<init>", "(Lcom/huami/healthlabel/ui/adapter/LabelAdapter$ItemListener;Z)V", "DiffCallback", "ItemListener", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class LabelAdapter extends ListAdapter<MixLabel, LabelViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final ItemListener itemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean itemCanClick;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/healthlabel/ui/adapter/LabelAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huami/lib/healthlabel/service/MixLabel;", "oldItem", "newItem", "", "areItemsTheSame", "areContentsTheSame", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final class DiffCallback extends DiffUtil.ItemCallback<MixLabel> {

        @NotNull
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull MixLabel oldItem, @NotNull MixLabel newItem) {
            return oldItem.getClickCount() == newItem.getClickCount() && Intrinsics.areEqual(oldItem.getLabelText(), newItem.getLabelText()) && Intrinsics.areEqual(oldItem.getLabelColor(), newItem.getLabelColor()) && oldItem.getSort() == newItem.getSort();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull MixLabel oldItem, @NotNull MixLabel newItem) {
            return Intrinsics.areEqual(oldItem.getLabelText(), newItem.getLabelText());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/healthlabel/ui/adapter/LabelAdapter$ItemListener;", "", "", "position", "", "onItemClick", "onItemLongClick", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public interface ItemListener {
        void onItemClick(int position);

        void onItemLongClick(int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LabelTextView a;
        public final /* synthetic */ LabelAdapter b;
        public final /* synthetic */ int c;
        public final /* synthetic */ LabelViewHolder d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LabelTextView labelTextView, LabelAdapter labelAdapter, int i, LabelViewHolder labelViewHolder) {
            super(0);
            this.a = labelTextView;
            this.b = labelAdapter;
            this.c = i;
            this.d = labelViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (!UtilsKt.isNetworkConnect(this.a.getContext())) {
                UtilsKt.toast(R.string.health_label_network_error);
                return;
            }
            ItemListener itemListener = this.b.itemClickListener;
            if (itemListener != null) {
                itemListener.onItemClick(this.c);
            }
            this.b.a(this.c, this.d.getLabelText());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ItemListener itemListener = LabelAdapter.this.itemClickListener;
            if (itemListener == null) {
                return;
            }
            itemListener.onItemLongClick(this.b);
        }
    }

    public /* synthetic */ LabelAdapter(ItemListener itemListener, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(itemListener, (i & 2) != 0 ? true : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int position, LabelTextView labelText) {
        MixLabel item = getItem(position);
        labelText.setCount(item.getClickCount());
        ViewExtKt.setShape(labelText, Integer.valueOf(Color.parseColor(item.getBackgroundColor())));
    }

    public LabelAdapter(@Nullable ItemListener itemListener, boolean z) {
        super(DiffCallback.INSTANCE);
        this.itemClickListener = itemListener;
        this.itemCanClick = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull LabelViewHolder holder, int position) {
        MixLabel item = getItem(position);
        if (item == null) {
            return;
        }
        LabelTextView labelText = holder.getLabelText();
        labelText.setTextWithCount(item.getLabelText(), item.getClickCount(), item.getClickCount() > 0 ? -1 : Color.parseColor(ColorExtKt.getTextColorChange(item.getLabelColor())), Color.parseColor(item.getClickCount() > 0 ? item.getBackgroundColor() : "#13ffffff"));
        labelText.click(new a(labelText, this, position, holder));
        labelText.longClick(new b(position));
        labelText.setEnableClick(this.itemCanClick);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public LabelViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return LabelViewHolder.INSTANCE.create(parent);
    }
}
