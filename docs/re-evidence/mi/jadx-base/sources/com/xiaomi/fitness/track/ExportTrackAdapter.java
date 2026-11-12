package com.xiaomi.fitness.track;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.track.ExportTrackAdapter;
import defpackage.bsi;
import defpackage.ivi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J'\u0010\u001e\u001a\u00020\u001a2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010 j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u001f¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/track/ExportTrackAdapter$FileDataHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "list", "", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "selectedItem", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/track/ExportTrackAdapter$OnCheckedChangeListener;", "currentItem", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "getItemCount", "setData", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Ljava/util/ArrayList;)V", "isAnyItemSelected", "", "setOnCheckedChangeListener", "FileDataHolder", "OnCheckedChangeListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportTrackAdapter extends RecyclerView.Adapter<FileDataHolder> {

    @NotNull
    private final Context context;

    @Nullable
    private ExportTrackSupportTypeData currentItem;
    private final LayoutInflater inflater;
    private List<? extends ExportTrackSupportTypeData> list;

    @Nullable
    private OnCheckedChangeListener listener;
    private int selectedItem;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0010\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001f\u0010\u0017\u001a\n \n*\u0004\u0018\u00010\u00160\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackAdapter$FileDataHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "typeData", "", "position", "", "bind", "(Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;I)V", "Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "Landroid/widget/TextView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "infoView", "getInfoView", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/track/ExportTrackAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FileDataHolder extends RecyclerView.d0 {
        private final CheckBox checkbox;
        private final ImageView icon;
        private final TextView infoView;
        private final TextView nameView;
        final /* synthetic */ ExportTrackAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileDataHolder(@NotNull ExportTrackAdapter exportTrackAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = exportTrackAdapter;
            this.checkbox = (CheckBox) itemView.findViewById(bsi.G);
            this.nameView = (TextView) itemView.findViewById(bsi.I4);
            this.infoView = (TextView) itemView.findViewById(bsi.T2);
            this.icon = (ImageView) itemView.findViewById(bsi.p2);
        }

        public final void bind(@NotNull ExportTrackSupportTypeData typeData, int position) {
            Intrinsics.checkNotNullParameter(typeData, "typeData");
            this.nameView.setText(typeData.getTitle());
            this.infoView.setText(typeData.getDesc());
            this.icon.setImageResource(typeData.getIcon());
            this.checkbox.setSelected(position == this.this$0.selectedItem);
        }

        public final CheckBox getCheckbox() {
            return this.checkbox;
        }

        public final ImageView getIcon() {
            return this.icon;
        }

        public final TextView getInfoView() {
            return this.infoView;
        }

        public final TextView getNameView() {
            return this.nameView;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackAdapter$OnCheckedChangeListener;", "", "onCheckedChange", "", "currentItem", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCheckedChangeListener {
        void onCheckedChange(@Nullable ExportTrackSupportTypeData currentItem);
    }

    public ExportTrackAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.selectedItem = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ExportTrackAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = this$0.selectedItem;
        List<? extends ExportTrackSupportTypeData> list = null;
        if (i2 == i) {
            this$0.selectedItem = -1;
            this$0.currentItem = null;
        } else {
            this$0.selectedItem = i;
            this$0.notifyItemChanged(i2);
            List<? extends ExportTrackSupportTypeData> list2 = this$0.list;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("list");
            } else {
                list = list2;
            }
            this$0.currentItem = list.get(i);
        }
        this$0.notifyItemChanged(i);
        OnCheckedChangeListener onCheckedChangeListener = this$0.listener;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChange(this$0.currentItem);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<? extends ExportTrackSupportTypeData> list = this.list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            list = null;
        }
        return list.size();
    }

    public final boolean isAnyItemSelected() {
        return this.selectedItem != -1;
    }

    public final void setData(@Nullable ArrayList<ExportTrackSupportTypeData> list) {
        if (list == null) {
            return;
        }
        this.list = list;
        this.selectedItem = 0;
        this.currentItem = list.get(0);
        notifyItemChanged(this.selectedItem);
        notifyDataSetChanged();
    }

    public final void setOnCheckedChangeListener(@NotNull OnCheckedChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FileDataHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<? extends ExportTrackSupportTypeData> list = this.list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            list = null;
        }
        holder.bind(list.get(position), position);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: wj8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportTrackAdapter.onBindViewHolder$lambda$0(this.f38023a, position, view);
            }
        };
        holder.itemView.setOnClickListener(onClickListener);
        holder.getCheckbox().setOnClickListener(onClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FileDataHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.inflater.inflate(ivi.m0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new FileDataHolder(this, viewInflate);
    }
}
