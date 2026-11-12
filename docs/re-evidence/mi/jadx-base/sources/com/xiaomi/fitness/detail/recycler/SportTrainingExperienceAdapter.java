package com.xiaomi.fitness.detail.recycler;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.recycler.SportTrainingExperienceAdapter;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.of1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\rR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter$ViewHolder;", "<init>", "()V", "itemClickListener", "Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter$OnItemClickListener;", "setDistributeItemClickListener", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "getDrawableByPosition", "Landroid/graphics/drawable/Drawable;", "getStringByPosition", "", "ViewHolder", "OnItemClickListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTrainingExperienceAdapter extends RecyclerView.Adapter<ViewHolder> {

    @Nullable
    private OnItemClickListener itemClickListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter$OnItemClickListener;", "", "onClick", "", "position", "", "textDesc", "", "drawable", "Landroid/graphics/drawable/Drawable;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(int position, @NotNull String textDesc, @Nullable Drawable drawable);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportTrainingExperienceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView imageView;

        @NotNull
        private final TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(bsi.r2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bsi.s7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.textView = (TextView) viewFindViewById2;
        }

        @NotNull
        public final ImageView getImageView() {
            return this.imageView;
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(SportTrainingExperienceAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnItemClickListener onItemClickListener = this$0.itemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(i, this$0.getStringByPosition(i), this$0.getDrawableByPosition(i));
        }
    }

    @Nullable
    public final Drawable getDrawableByPosition(int position) {
        if (position == 1) {
            return of1.b(AppUtil.getApp(), hoi.w0);
        }
        if (position == 2) {
            return of1.b(AppUtil.getApp(), hoi.v0);
        }
        if (position == 3) {
            return of1.b(AppUtil.getApp(), hoi.x0);
        }
        if (position != 4) {
            return position != 5 ? of1.b(AppUtil.getApp(), hoi.v0) : of1.b(AppUtil.getApp(), hoi.z0);
        }
        return of1.b(AppUtil.getApp(), hoi.y0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }

    @NotNull
    public final String getStringByPosition(int position) {
        if (position == 1) {
            String string = AppUtil.getApp().getString(j1j.y8);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (position == 2) {
            String string2 = AppUtil.getApp().getString(j1j.A8);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (position == 3) {
            String string3 = AppUtil.getApp().getString(j1j.x8);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (position == 4) {
            String string4 = AppUtil.getApp().getString(j1j.B8);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (position != 5) {
            String string5 = AppUtil.getApp().getString(j1j.A8);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        String string6 = AppUtil.getApp().getString(j1j.z8);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        return string6;
    }

    public final void setDistributeItemClickListener(@NotNull OnItemClickListener itemClickListener) {
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        this.itemClickListener = itemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final int i = position + 1;
        holder.getImageView().setBackground(getDrawableByPosition(i));
        holder.getTextView().setText(getStringByPosition(i));
        holder.getImageView().setOnClickListener(new View.OnClickListener() { // from class: z4o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportTrainingExperienceAdapter.onBindViewHolder$lambda$0(this.f40876a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.j0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(viewInflate);
    }
}
