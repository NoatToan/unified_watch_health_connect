package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepLandTitleAdapter;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#$\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter$DetailTitleViewHolder;", "<init>", "()V", "mDataText", "", "", "mDataDrawable", "mDataNotSelectDrawable", "clickStatusList", "", "", "enableClickList", "titleItemClickListener", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter$OnTitleItemClickListener;", "getTitleItemClickListener", "()Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter$OnTitleItemClickListener;", "setTitleItemClickListener", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter$OnTitleItemClickListener;)V", "getClickStatusList", "setEnableClickList", "", "list", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "checkTheClickNotValid", "setOnTitleItemClickListener", "OnTitleItemClickListener", "Companion", "DetailTitleViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepLandTitleAdapter extends RecyclerView.Adapter<DetailTitleViewHolder> {
    public static final int disableClickStatus = 3;
    public static final int enableClickGone = 2;
    public static final int enableClickVisible = 1;
    public static final int showAwakeChart = 3;
    public static final int showDeepChart = 0;
    public static final int showHrmChart = 4;
    public static final int showLightChart = 1;
    public static final int showRemChart = 2;
    public static final int showSpo2Chart = 5;

    @NotNull
    private List<Boolean> clickStatusList;

    @NotNull
    private List<Integer> enableClickList;

    @Nullable
    private OnTitleItemClickListener titleItemClickListener;

    @NotNull
    private List<Integer> mDataText = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(c0j.cf), Integer.valueOf(c0j.lk), Integer.valueOf(c0j.Nf), Integer.valueOf(c0j.Dk), Integer.valueOf(c0j.k7), Integer.valueOf(c0j.ch)});

    @NotNull
    private List<Integer> mDataDrawable = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(pni.c3), Integer.valueOf(pni.g3), Integer.valueOf(pni.i3), Integer.valueOf(pni.Z2), Integer.valueOf(pni.e3), Integer.valueOf(pni.k3)});

    @NotNull
    private List<Integer> mDataNotSelectDrawable = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(pni.b3), Integer.valueOf(pni.f3), Integer.valueOf(pni.h3), Integer.valueOf(pni.Y2), Integer.valueOf(pni.d3), Integer.valueOf(pni.j3)});

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter$DetailTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/LinearLayout;", "itemView", "Landroid/widget/LinearLayout;", "getItemView", "()Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DetailTitleViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView imageView;

        @NotNull
        private final LinearLayout itemView;

        @NotNull
        private final TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailTitleViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(eri.u3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.itemView = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = view.findViewById(eri.s3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.imageView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(eri.t3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.textView = (TextView) viewFindViewById3;
        }

        @NotNull
        public final ImageView getImageView() {
            return this.imageView;
        }

        @NotNull
        public final LinearLayout getItemView() {
            return this.itemView;
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepLandTitleAdapter$OnTitleItemClickListener;", "", "onClick", "", "position", "", "changeStatus", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTitleItemClickListener {
        void onClick(int position, boolean changeStatus);
    }

    public SleepLandTitleAdapter() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        this.clickStatusList = CollectionsKt__CollectionsKt.mutableListOf(bool, bool, bool, bool, bool2, bool2);
        this.enableClickList = CollectionsKt__CollectionsKt.mutableListOf(1, 1, 1, 1, 1, 1);
    }

    private final boolean checkTheClickNotValid(int position) {
        for (int i = 0; i < 4; i++) {
            if (i != position && this.clickStatusList.get(i).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(SleepLandTitleAdapter this$0, int i, DetailTitleViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (this$0.enableClickList.get(i).intValue() == 3) {
            if (i == 2) {
                ToastUtil.showToast(AppUtil.getApp().getString(c0j.dh));
                return;
            } else {
                if (i != 5) {
                    return;
                }
                ToastUtil.showToast(AppUtil.getApp().getString(c0j.eh));
                return;
            }
        }
        if (this$0.clickStatusList.get(i).booleanValue() && this$0.checkTheClickNotValid(i)) {
            return;
        }
        List<Boolean> list = this$0.clickStatusList;
        list.set(i, Boolean.valueOf(!list.get(i).booleanValue()));
        if (this$0.clickStatusList.get(i).booleanValue()) {
            holder.getImageView().setBackground(AppUtil.getApp().getDrawable(this$0.mDataDrawable.get(i).intValue()));
        } else {
            holder.getImageView().setBackground(AppUtil.getApp().getDrawable(this$0.mDataNotSelectDrawable.get(i).intValue()));
        }
        OnTitleItemClickListener onTitleItemClickListener = this$0.titleItemClickListener;
        if (onTitleItemClickListener != null) {
            onTitleItemClickListener.onClick(i, this$0.clickStatusList.get(i).booleanValue());
        }
    }

    @NotNull
    public final List<Boolean> getClickStatusList() {
        return this.clickStatusList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataText.size();
    }

    @Nullable
    public final OnTitleItemClickListener getTitleItemClickListener() {
        return this.titleItemClickListener;
    }

    public final void setEnableClickList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.enableClickList = list;
    }

    public final void setOnTitleItemClickListener(@NotNull OnTitleItemClickListener OnTitleItemClickListener2) {
        Intrinsics.checkNotNullParameter(OnTitleItemClickListener2, "OnTitleItemClickListener");
        this.titleItemClickListener = OnTitleItemClickListener2;
    }

    public final void setTitleItemClickListener(@Nullable OnTitleItemClickListener onTitleItemClickListener) {
        this.titleItemClickListener = onTitleItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final DetailTitleViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getImageView().setBackground(this.clickStatusList.get(position).booleanValue() ? AppUtil.getApp().getDrawable(this.mDataDrawable.get(position).intValue()) : AppUtil.getApp().getDrawable(this.mDataNotSelectDrawable.get(position).intValue()));
        holder.getTextView().setText(AppUtil.getApp().getText(this.mDataText.get(position).intValue()));
        int iIntValue = this.enableClickList.get(position).intValue();
        if (iIntValue == 1) {
            holder.getItemView().setVisibility(0);
        } else if (iIntValue == 2) {
            this.clickStatusList.set(position, Boolean.FALSE);
            holder.getItemView().setVisibility(8);
            holder.getItemView().getLayoutParams().width = 0;
        } else if (iIntValue == 3) {
            this.clickStatusList.set(position, Boolean.FALSE);
            holder.getImageView().setBackground(AppUtil.getApp().getDrawable(pni.a3));
            holder.getTextView().setAlpha(0.3f);
        }
        holder.getItemView().setOnClickListener(new View.OnClickListener() { // from class: wpm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepLandTitleAdapter.onBindViewHolder$lambda$0(this.f38224a, position, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DetailTitleViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.D7, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new DetailTitleViewHolder(viewInflate);
    }
}
