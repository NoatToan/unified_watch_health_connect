package com.xiaomi.hm.health.device.watchskinstore.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.watchskinstore.adapter.SelectMoreColorAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&'B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/adapter/SelectMoreColorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/watchskinstore/adapter/SelectMoreColorAdapter$SelectMoreColorHolder;", "", "", "data", "", "setNewData", "size", "setSize", "Lcom/xiaomi/hm/health/device/watchskinstore/adapter/SelectMoreColorAdapter$OnItemClickListener;", "mOnItemClickListener", "setOnItemClickListener", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemCount", "a", LogUtil.I, "layoutResId", "b", "Ljava/util/List;", "mData", "c", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/watchskinstore/adapter/SelectMoreColorAdapter$OnItemClickListener;", "e", "getMoreColorSelectPosition", "()I", "setMoreColorSelectPosition", "(I)V", "moreColorSelectPosition", "<init>", "(ILjava/util/List;)V", "OnItemClickListener", "SelectMoreColorHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SelectMoreColorAdapter extends RecyclerView.Adapter<SelectMoreColorHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int layoutResId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private List<Integer> mData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private OnItemClickListener mOnItemClickListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int moreColorSelectPosition;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/adapter/SelectMoreColorAdapter$OnItemClickListener;", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "position", "", "onItemClick", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnItemClickListener {
        void onItemClick(@NotNull RecyclerView.Adapter<?> adapter, @NotNull View view, int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/adapter/SelectMoreColorAdapter$SelectMoreColorHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getSelectImage", "()Landroid/widget/ImageView;", "selectImage", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/watchskinstore/adapter/SelectMoreColorAdapter;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class SelectMoreColorHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ImageView selectImage;

        public SelectMoreColorHolder(View view) {
            super(view);
            this.selectImage = (ImageView) view.findViewById(R.id.selected_img);
        }

        @NotNull
        public final ImageView getSelectImage() {
            return this.selectImage;
        }
    }

    public SelectMoreColorAdapter(int i, @Nullable List<Integer> list) {
        this.layoutResId = i;
        this.mData = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SelectMoreColorAdapter selectMoreColorAdapter, SelectMoreColorHolder selectMoreColorHolder, int i, View view) {
        selectMoreColorAdapter.mOnItemClickListener.onItemClick(selectMoreColorAdapter, selectMoreColorHolder.itemView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        List<Integer> list = this.mData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int getMoreColorSelectPosition() {
        return this.moreColorSelectPosition;
    }

    public final void setMoreColorSelectPosition(int i) {
        this.moreColorSelectPosition = i;
    }

    public final void setNewData(@Nullable List<Integer> data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        this.mData = data;
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public final void setSize(int size) {
        this.size = size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final SelectMoreColorHolder holder, final int position) {
        holder.itemView.setBackgroundColor(this.mData.get(position).intValue());
        holder.getSelectImage().setVisibility(position == this.moreColorSelectPosition ? 0 : 8);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: vm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectMoreColorAdapter.b(this.a, holder, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SelectMoreColorHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.layoutResId, parent, false);
        int i = this.size;
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        return new SelectMoreColorHolder(viewInflate);
    }
}
