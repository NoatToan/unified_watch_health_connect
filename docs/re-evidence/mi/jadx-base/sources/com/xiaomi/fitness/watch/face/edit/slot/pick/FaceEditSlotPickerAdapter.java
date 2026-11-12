package com.xiaomi.fitness.watch.face.edit.slot.pick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.edit.entity.EditWidget;
import com.xiaomi.fitness.watch.face.edit.slot.pick.FaceEditSlotPickerAdapter;
import defpackage.d29;
import defpackage.f29;
import defpackage.iki;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()'B\u0007¢\u0006\u0004\b%\u0010&J%\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bj\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/slot/pick/FaceEditSlotPickerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/EditWidget;", "list", "", "current", "", "setList", "(Ljava/util/List;I)V", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/watch/face/edit/slot/pick/OnWidgetSelectListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnWidgetSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "widgetList", "Ljava/util/List;", "onWidgetSelectListener", "Lkotlin/jvm/functions/Function1;", "currentWidget", "Ljava/lang/String;", "<init>", "()V", "Companion", "FaceEditSlotPickerItemHolder", "FaceEditSlotPickerLabelHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditSlotPickerAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int SLOT_PICKER_ITEM = 2;
    public static final int SLOT_PICKER_LABEL = 1;

    @Nullable
    private Function1<? super String, Unit> onWidgetSelectListener;

    @NotNull
    private final List<EditWidget> widgetList = new ArrayList();

    @NotNull
    private String currentWidget = "";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/slot/pick/FaceEditSlotPickerAdapter$FaceEditSlotPickerItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/watch/face/edit/entity/EditWidget;", "widget", "", "bindData", "(Lcom/xiaomi/fitness/watch/face/edit/entity/EditWidget;)V", "onClick", "Ld29;", "binding", "Ld29;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/slot/pick/FaceEditSlotPickerAdapter;Ld29;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceEditSlotPickerItemHolder extends RecyclerView.d0 {

        @NotNull
        private final d29 binding;
        final /* synthetic */ FaceEditSlotPickerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditSlotPickerItemHolder(@NotNull FaceEditSlotPickerAdapter faceEditSlotPickerAdapter, d29 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditSlotPickerAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(FaceEditSlotPickerAdapter this$0, EditWidget widget, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(widget, "$widget");
            Function1 function1 = this$0.onWidgetSelectListener;
            if (function1 != null) {
                function1.invoke2(widget.getWidgetName());
            }
        }

        public final void bindData(@NotNull EditWidget widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            if (Intrinsics.areEqual(widget.getWidgetName(), this.this$0.currentWidget)) {
                this.binding.getRoot().setBackgroundColor(ExtUtilsKt.getColor(iki.common_dialog_list_item_selected_bg_color));
                this.binding.B.setTextColor(ExtUtilsKt.getColor(iki.e));
                ImageView arrow = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(arrow, "arrow");
                ViewExtKt.visible(arrow);
            } else {
                this.binding.getRoot().setBackgroundColor(ExtUtilsKt.getColor(iki.d));
                this.binding.B.setTextColor(ExtUtilsKt.getColor(iki.n));
                ImageView arrow2 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(arrow2, "arrow");
                ViewExtKt.invisible(arrow2);
            }
            this.binding.B.setText(widget.getWidgetName());
        }

        public final void onClick(@NotNull final EditWidget widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            View root = this.binding.getRoot();
            final FaceEditSlotPickerAdapter faceEditSlotPickerAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: lv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditSlotPickerAdapter.FaceEditSlotPickerItemHolder.onClick$lambda$0(faceEditSlotPickerAdapter, widget, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/slot/pick/FaceEditSlotPickerAdapter$FaceEditSlotPickerLabelHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/watch/face/edit/entity/EditWidget;", "widget", "", "bindText", "(Lcom/xiaomi/fitness/watch/face/edit/entity/EditWidget;)V", "Lf29;", "binding", "Lf29;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/slot/pick/FaceEditSlotPickerAdapter;Lf29;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceEditSlotPickerLabelHolder extends RecyclerView.d0 {

        @NotNull
        private final f29 binding;
        final /* synthetic */ FaceEditSlotPickerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditSlotPickerLabelHolder(@NotNull FaceEditSlotPickerAdapter faceEditSlotPickerAdapter, f29 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditSlotPickerAdapter;
            this.binding = binding;
        }

        public final void bindText(@NotNull EditWidget widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            this.binding.A.setText(FaceEditSlotNameHelper.INSTANCE.getGroupName(widget.getGroupName()));
        }
    }

    public static /* synthetic */ void setList$default(FaceEditSlotPickerAdapter faceEditSlotPickerAdapter, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        faceEditSlotPickerAdapter.setList(list, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.widgetList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return !Intrinsics.areEqual(this.widgetList.get(position).getWidgetName(), "") ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        EditWidget editWidget = this.widgetList.get(position);
        if (holder instanceof FaceEditSlotPickerItemHolder) {
            FaceEditSlotPickerItemHolder faceEditSlotPickerItemHolder = (FaceEditSlotPickerItemHolder) holder;
            faceEditSlotPickerItemHolder.bindData(editWidget);
            faceEditSlotPickerItemHolder.onClick(editWidget);
        } else if (holder instanceof FaceEditSlotPickerLabelHolder) {
            ((FaceEditSlotPickerLabelHolder) holder).bindText(editWidget);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            f29 f29VarA0 = f29.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(f29VarA0, "inflate(...)");
            return new FaceEditSlotPickerLabelHolder(this, f29VarA0);
        }
        d29 d29VarA0 = d29.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(d29VarA0, "inflate(...)");
        return new FaceEditSlotPickerItemHolder(this, d29VarA0);
    }

    public final void setList(@NotNull List<EditWidget> list, int current) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.widgetList.clear();
        this.currentWidget = list.get(current).getWidgetName();
        Iterator<EditWidget> it = list.iterator();
        while (it.hasNext()) {
            this.widgetList.add(it.next());
        }
        notifyDataSetChanged();
    }

    public final void setOnWidgetSelectListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onWidgetSelectListener = listener;
    }
}
