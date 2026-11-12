package com.xiaomi.fitness.mine;

import android.app.ActivityOptions;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.medal.export.data.Medal;
import com.xiaomi.fitness.medal.export.data.MineMedalItem;
import com.xiaomi.fitness.util.MineUtil;
import defpackage.lri;
import defpackage.nli;
import defpackage.rui;
import defpackage.zr3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001b\u001c\u001d\u001eB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/mine/MedalEntranceAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/medal/export/data/MineMedalItem;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/mine/MedalEntranceAdapter$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "(Lcom/xiaomi/fitness/mine/MedalEntranceAdapter$OnItemClickListener;)V", "Lcom/xiaomi/fitness/mine/MedalEntranceAdapter$OnItemClickListener;", "paddingHorizontalBetweenMedal", "I", "getColCountPerRow", "()I", "colCountPerRow", "<init>", "()V", "Companion", "MedalDiffCallback", "MedalEntranceViewHolder", "OnItemClickListener", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalEntranceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalEntranceAdapter.kt\ncom/xiaomi/fitness/mine/MedalEntranceAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,153:1\n54#2,3:154\n24#2:157\n57#2,6:158\n63#2,2:165\n54#2,3:167\n24#2:170\n59#2,6:171\n54#2,3:177\n24#2:180\n57#2,6:181\n63#2,2:188\n57#3:164\n57#3:187\n*S KotlinDebug\n*F\n+ 1 MedalEntranceAdapter.kt\ncom/xiaomi/fitness/mine/MedalEntranceAdapter\n*L\n91#1:154,3\n91#1:157\n91#1:158,6\n91#1:165,2\n98#1:167,3\n98#1:170\n98#1:171,6\n123#1:177,3\n123#1:180\n123#1:181,6\n123#1:188,2\n91#1:164\n123#1:187\n*E\n"})
public final class MedalEntranceAdapter extends p<MineMedalItem, RecyclerView.d0> {

    @NotNull
    public static final String TAG = "MedalEntranceAdapter";

    @Nullable
    private OnItemClickListener onItemClickListener;
    private final int paddingHorizontalBetweenMedal;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/mine/MedalEntranceAdapter$MedalDiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/medal/export/data/MineMedalItem;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/medal/export/data/MineMedalItem;Lcom/xiaomi/fitness/medal/export/data/MineMedalItem;)Z", "areContentsTheSame", "<init>", "()V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class MedalDiffCallback extends h.f<MineMedalItem> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull MineMedalItem oldItem, @NotNull MineMedalItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            Medal medal = oldItem.getMedal();
            String medalType = medal != null ? medal.getMedalType() : null;
            Medal medal2 = newItem.getMedal();
            return Intrinsics.areEqual(medalType, medal2 != null ? medal2.getMedalType() : null);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull MineMedalItem oldItem, @NotNull MineMedalItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getMedal(), newItem.getMedal());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/mine/MedalEntranceAdapter$MedalEntranceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "medalIconView", "Landroid/widget/ImageView;", "getMedalIconView", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "medalName", "Landroid/widget/TextView;", "getMedalName", "()Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/mine/MedalEntranceAdapter;Landroid/view/View;)V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MedalEntranceViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView medalIconView;

        @NotNull
        private final TextView medalName;
        final /* synthetic */ MedalEntranceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MedalEntranceViewHolder(@NotNull MedalEntranceAdapter medalEntranceAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = medalEntranceAdapter;
            View viewFindViewById = itemView.findViewById(lri.g0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.medalIconView = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(lri.j0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.medalName = (TextView) viewFindViewById2;
        }

        @NotNull
        public final ImageView getMedalIconView() {
            return this.medalIconView;
        }

        @NotNull
        public final TextView getMedalName() {
            return this.medalName;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/mine/MedalEntranceAdapter$OnItemClickListener;", "", "onClick", "", "medal", "Lcom/xiaomi/fitness/medal/export/data/Medal;", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull Medal medal);
    }

    public MedalEntranceAdapter() {
        super(new MedalDiffCallback());
        this.paddingHorizontalBetweenMedal = ExtUtilsKt.getDimension(nli.f28045a);
    }

    private final int getColCountPerRow() {
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 6;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        return (uIUtils.isTablet() && uIUtils.isLandscape(ApplicationExtKt.getApplication())) ? 6 : 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final MineMedalItem mineMedalItem = getCurrentList().get(position);
        if (holder instanceof MedalEntranceViewHolder) {
            int dp = ExtUtilsKt.getDp(Float.valueOf(60.0f));
            MedalEntranceViewHolder medalEntranceViewHolder = (MedalEntranceViewHolder) holder;
            medalEntranceViewHolder.getMedalIconView().getLayoutParams().width = dp;
            ViewGroup.LayoutParams layoutParams = medalEntranceViewHolder.getMedalIconView().getLayoutParams();
            MineUtil mineUtil = MineUtil.INSTANCE;
            Medal medal = mineMedalItem.getMedal();
            layoutParams.height = dp * ((int) mineUtil.getMedalImgRatio(medal != null ? medal.getMedalClass() : 2));
            int status = mineMedalItem.getStatus();
            if (status == 0) {
                ImageView medalIconView = medalEntranceViewHolder.getMedalIconView();
                Coil.imageLoader(medalIconView.getContext()).enqueue(new ImageRequest.Builder(medalIconView.getContext()).data(mineMedalItem.getDrawableRes()).target(medalIconView).build());
                ViewExtKt.visible(medalEntranceViewHolder.getMedalName());
                medalEntranceViewHolder.getMedalName().setText(mineMedalItem.getName());
            } else if (status == 1) {
                ImageView medalIconView2 = medalEntranceViewHolder.getMedalIconView();
                Medal medal2 = mineMedalItem.getMedal();
                Intrinsics.checkNotNull(medal2);
                Coil.imageLoader(medalIconView2.getContext()).enqueue(new ImageRequest.Builder(medalIconView2.getContext()).data(medal2.getIcon()).target(medalIconView2).build());
                ViewExtKt.visible(medalEntranceViewHolder.getMedalName());
                TextView medalName = medalEntranceViewHolder.getMedalName();
                Medal medal3 = mineMedalItem.getMedal();
                Intrinsics.checkNotNull(medal3);
                medalName.setText(medal3.getName());
            } else if (status == 2) {
                ImageView medalIconView3 = medalEntranceViewHolder.getMedalIconView();
                Coil.imageLoader(medalIconView3.getContext()).enqueue(new ImageRequest.Builder(medalIconView3.getContext()).data(mineMedalItem.getDrawableRes()).target(medalIconView3).build());
                ViewExtKt.gone(medalEntranceViewHolder.getMedalName());
            }
            new zr3(ApplicationExtKt.getApplication(), holder.itemView) { // from class: com.xiaomi.fitness.mine.MedalEntranceAdapter.onBindViewHolder.2
                @Override // defpackage.zr3
                public void onCardZoomTriggered(ActivityOptions activityOptions) {
                    if (MedalEntranceAdapter.this.onItemClickListener == null || mineMedalItem.getMedal() == null) {
                        return;
                    }
                    OnItemClickListener onItemClickListener = MedalEntranceAdapter.this.onItemClickListener;
                    Intrinsics.checkNotNull(onItemClickListener);
                    Medal medal4 = mineMedalItem.getMedal();
                    Intrinsics.checkNotNull(medal4);
                    onItemClickListener.onClick(medal4);
                    Logger.d(MedalEntranceAdapter.TAG, "setOnClickListener run");
                }
            }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(rui.s, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new MedalEntranceViewHolder(this, viewInflate);
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        if (onItemClickListener != null) {
            this.onItemClickListener = onItemClickListener;
        }
    }
}
