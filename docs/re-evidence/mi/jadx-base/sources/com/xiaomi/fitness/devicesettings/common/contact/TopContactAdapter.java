package com.xiaomi.fitness.devicesettings.common.contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.common.contact.TopContactAdapter;
import defpackage.eui;
import defpackage.fli;
import defpackage.zqi;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000267B%\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b4\u00105J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0014R\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$TopContactViewHolder;", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$TopContactViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$TopContactViewHolder;I)V", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "dataList", "updateDataList", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$OnItemClickListener;", "getListener", "()Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$OnItemClickListener;", "setListener", "(Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$OnItemClickListener;)V", "", "isEditMode", "Z", "()Z", "setEditMode", "(Z)V", "isDragging", "setDragging", "Landroidx/recyclerview/widget/l$h;", "itemTouchHelperCallback", "Landroidx/recyclerview/widget/l$h;", "getItemTouchHelperCallback", "()Landroidx/recyclerview/widget/l$h;", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$OnItemClickListener;)V", "TopContactViewHolder", "OnItemClickListener", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TopContactAdapter extends RecyclerView.Adapter<TopContactViewHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<ContactBean> dataList;
    private boolean isDragging;
    private boolean isEditMode;

    @NotNull
    private final l.h itemTouchHelperCallback;

    @NotNull
    private OnItemClickListener listener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$OnItemClickListener;", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "contactBean", "", "onItemSelect", "(Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;)V", "", "position", "onItemDelete", "(I)V", "", "onLongClick", "(Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;)Z", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onDrag", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public interface OnItemClickListener {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onDrag(@NotNull OnItemClickListener onItemClickListener, @NotNull RecyclerView.d0 holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
            }

            public static void onItemDelete(@NotNull OnItemClickListener onItemClickListener, int i) {
            }

            public static void onItemSelect(@NotNull OnItemClickListener onItemClickListener, @NotNull ContactBean contactBean) {
                Intrinsics.checkNotNullParameter(contactBean, "contactBean");
            }

            public static boolean onLongClick(@NotNull OnItemClickListener onItemClickListener, @NotNull ContactBean contactBean) {
                Intrinsics.checkNotNullParameter(contactBean, "contactBean");
                return false;
            }
        }

        void onDrag(@NotNull RecyclerView.d0 holder);

        void onItemDelete(int position);

        void onItemSelect(@NotNull ContactBean contactBean);

        boolean onLongClick(@NotNull ContactBean contactBean);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter$TopContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "contactBean", "", "bindData", "(Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;)V", "Landroid/widget/TextView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "phoneView", "getPhoneView", "setPhoneView", "Landroid/widget/ImageView;", "dragView", "Landroid/widget/ImageView;", "getDragView", "()Landroid/widget/ImageView;", "setDragView", "(Landroid/widget/ImageView;)V", "deleteView", "getDeleteView", "setDeleteView", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TopContactViewHolder extends RecyclerView.d0 {

        @Nullable
        private ImageView deleteView;

        @Nullable
        private ImageView dragView;

        @Nullable
        private TextView nameView;

        @Nullable
        private TextView phoneView;
        final /* synthetic */ TopContactAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopContactViewHolder(@NotNull TopContactAdapter topContactAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = topContactAdapter;
            this.nameView = (TextView) itemView.findViewById(zqi.C5);
            this.phoneView = (TextView) itemView.findViewById(zqi.q6);
            this.dragView = (ImageView) itemView.findViewById(zqi.s2);
            this.deleteView = (ImageView) itemView.findViewById(zqi.a1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(TopContactAdapter this$0, ContactBean contactBean, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(contactBean, "$contactBean");
            this$0.getDataList().remove(contactBean);
            this$0.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean bindData$lambda$1(TopContactAdapter this$0, TopContactViewHolder this$1, View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (motionEvent.getAction() == 0) {
                this$0.getListener().onDrag(this$1);
            }
            return true;
        }

        public final void bindData(@NotNull final ContactBean contactBean) {
            Intrinsics.checkNotNullParameter(contactBean, "contactBean");
            TextView textView = this.nameView;
            if (textView != null) {
                textView.setText(contactBean.getName());
            }
            TextView textView2 = this.phoneView;
            if (textView2 != null) {
                textView2.setText(contactBean.getPhone());
            }
            if (this.this$0.getIsEditMode()) {
                ImageView imageView = this.deleteView;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = this.dragView;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            } else {
                ImageView imageView3 = this.deleteView;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                ImageView imageView4 = this.dragView;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
            }
            TextView textView3 = this.nameView;
            ViewGroup.LayoutParams layoutParams = textView3 != null ? textView3.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            float dimension = ApplicationExtKt.getApplication().getResources().getDimension(fli.c);
            if (this.this$0.getIsEditMode()) {
                float dimension2 = ApplicationExtKt.getApplication().getResources().getDimension(fli.d);
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(ExtUtilsKt.getDp(10), (int) dimension, (int) dimension2, 0);
                }
            } else {
                float dimension3 = ApplicationExtKt.getApplication().getResources().getDimension(fli.e);
                if (marginLayoutParams != null) {
                    int i = (int) dimension3;
                    marginLayoutParams.setMargins(i, (int) dimension, i, 0);
                }
            }
            ImageView imageView5 = this.deleteView;
            if (imageView5 != null) {
                final TopContactAdapter topContactAdapter = this.this$0;
                imageView5.setOnClickListener(new View.OnClickListener() { // from class: wip
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TopContactAdapter.TopContactViewHolder.bindData$lambda$0(topContactAdapter, contactBean, view);
                    }
                });
            }
            ImageView imageView6 = this.dragView;
            if (imageView6 != null) {
                final TopContactAdapter topContactAdapter2 = this.this$0;
                imageView6.setOnTouchListener(new View.OnTouchListener() { // from class: xip
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return TopContactAdapter.TopContactViewHolder.bindData$lambda$1(topContactAdapter2, this, view, motionEvent);
                    }
                });
            }
        }

        @Nullable
        public final ImageView getDeleteView() {
            return this.deleteView;
        }

        @Nullable
        public final ImageView getDragView() {
            return this.dragView;
        }

        @Nullable
        public final TextView getNameView() {
            return this.nameView;
        }

        @Nullable
        public final TextView getPhoneView() {
            return this.phoneView;
        }

        public final void setDeleteView(@Nullable ImageView imageView) {
            this.deleteView = imageView;
        }

        public final void setDragView(@Nullable ImageView imageView) {
            this.dragView = imageView;
        }

        public final void setNameView(@Nullable TextView textView) {
            this.nameView = textView;
        }

        public final void setPhoneView(@Nullable TextView textView) {
            this.phoneView = textView;
        }
    }

    public TopContactAdapter(@NotNull Context context, @NotNull List<ContactBean> dataList, @NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.dataList = dataList;
        this.listener = listener;
        this.itemTouchHelperCallback = new l.h() { // from class: com.xiaomi.fitness.devicesettings.common.contact.TopContactAdapter$itemTouchHelperCallback$1
            {
                super(3, 0);
            }

            @Override // androidx.recyclerview.widget.l.h, androidx.recyclerview.widget.l.e
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                return this.this$0.getIsEditMode() ? super.getMovementFlags(recyclerView, viewHolder) : l.e.makeMovementFlags(0, 0);
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, RecyclerView.d0 target) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Intrinsics.checkNotNullParameter(target, "target");
                if (!this.this$0.getIsEditMode()) {
                    return false;
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = target.getAdapterPosition();
                Collections.swap(this.this$0.getDataList(), adapterPosition, adapterPosition2);
                if (recyclerView.isComputingLayout()) {
                    return true;
                }
                this.this$0.notifyItemMoved(adapterPosition, adapterPosition2);
                return true;
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSelectedChanged(RecyclerView.d0 viewHolder, int actionState) {
                super.onSelectedChanged(viewHolder, actionState);
                this.this$0.setDragging(actionState != 0);
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSwiped(RecyclerView.d0 viewHolder, int direction) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(TopContactAdapter this$0, ContactBean contactBean, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contactBean, "$contactBean");
        this$0.listener.onItemSelect(contactBean);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<ContactBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @NotNull
    public final l.h getItemTouchHelperCallback() {
        return this.itemTouchHelperCallback;
    }

    @NotNull
    public final OnItemClickListener getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: isDragging, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    /* JADX INFO: renamed from: isEditMode, reason: from getter */
    public final boolean getIsEditMode() {
        return this.isEditMode;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<ContactBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setDragging(boolean z) {
        this.isDragging = z;
    }

    public final void setEditMode(boolean z) {
        this.isEditMode = z;
    }

    public final void setListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "<set-?>");
        this.listener = onItemClickListener;
    }

    public final void updateDataList(@NotNull List<ContactBean> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TopContactViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ContactBean contactBean = this.dataList.get(position);
        holder.bindData(contactBean);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: vip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopContactAdapter.onBindViewHolder$lambda$0(this.f36935a, contactBean, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TopContactViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(eui.f1, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new TopContactViewHolder(this, viewInflate);
    }
}
