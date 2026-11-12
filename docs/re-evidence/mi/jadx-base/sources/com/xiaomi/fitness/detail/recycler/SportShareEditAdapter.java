package com.xiaomi.fitness.detail.recycler;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.model.SportRecordShareModel;
import com.xiaomi.fitness.detail.recycler.SportShareEditAdapter;
import com.xiaomi.fitness.detail.view.StickerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.nuf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005-./01B\u000f\u0012\u0006\u0010 \u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "(Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$OnItemClickListener;)V", "", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "itemList", "bindListData", "(Ljava/util/List;)V", "getItemList", "()Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "onAttachedToRecyclerView", "editViewType", "I", "mItemList", "Ljava/util/List;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "mOnItemClickListener", "Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$OnItemClickListener;", "<init>", "(I)V", "Companion", "OnItemClickListener", "PatternStyleItemViewHolder", "PatternDrawableItemViewHolder", "PatternStickerItemViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportShareEditAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "PatternStyleAdapter";
    public static final int viewTypeLongImage = 1;
    public static final int viewTypeNormalImage = 2;
    public static final int viewTypeSticker = 4;
    public static final int viewTypeString = 3;
    private final int editViewType;

    @NotNull
    private List<SportRecordShareModel> mItemList = new ArrayList();

    @Nullable
    private OnItemClickListener mOnItemClickListener;
    public RecyclerView mRecyclerView;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$OnItemClickListener;", "", "onItemClick", "", "styleItem", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "position", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(@NotNull SportRecordShareModel styleItem, int position);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$PatternDrawableItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "styleItem", "", "position", "", "bindItem", "(Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;I)V", "", "selected", "setSelected", "(Z)V", "Landroid/widget/ImageView;", "styleIconIv", "Landroid/widget/ImageView;", "Landroid/view/View;", "editDrawableItem", "Landroid/view/View;", "Landroid/widget/RelativeLayout;", "customizeBtn", "Landroid/widget/RelativeLayout;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSportShareEditAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportShareEditAdapter.kt\ncom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$PatternDrawableItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,290:1\n54#2,3:291\n24#2:294\n59#2,6:295\n*S KotlinDebug\n*F\n+ 1 SportShareEditAdapter.kt\ncom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$PatternDrawableItemViewHolder\n*L\n190#1:291,3\n190#1:294\n190#1:295,6\n*E\n"})
    public final class PatternDrawableItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final RelativeLayout customizeBtn;

        @NotNull
        private final View editDrawableItem;

        @NotNull
        private final ImageView styleIconIv;
        final /* synthetic */ SportShareEditAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PatternDrawableItemViewHolder(@NotNull SportShareEditAdapter sportShareEditAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportShareEditAdapter;
            View viewFindViewById = itemView.findViewById(bsi.L1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.styleIconIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bsi.T1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.editDrawableItem = viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bsi.L0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.customizeBtn = (RelativeLayout) viewFindViewById3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$1(SportShareEditAdapter this$0, SportRecordShareModel styleItem, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(styleItem, "$styleItem");
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(styleItem, i);
        }

        public final void bindItem(@NotNull final SportRecordShareModel styleItem, final int position) {
            Intrinsics.checkNotNullParameter(styleItem, "styleItem");
            nuf.f(this.editDrawableItem);
            if (styleItem.getDrawableID() != null) {
                this.styleIconIv.setImageDrawable(ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), styleItem.getDrawableID().intValue()));
            }
            if (styleItem.getDrawableUri() != null) {
                ImageView imageView = this.styleIconIv;
                Uri drawableUri = styleItem.getDrawableUri();
                ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(drawableUri).target(imageView);
                builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(5)));
                imageLoader.enqueue(builderTarget.build());
            }
            if (position == 0) {
                ViewExtKt.gone(this.styleIconIv);
                ViewExtKt.visible(this.customizeBtn);
            } else {
                ViewExtKt.visible(this.styleIconIv);
                ViewExtKt.gone(this.customizeBtn);
            }
            setSelected(styleItem.isSelect());
            View view = this.editDrawableItem;
            final SportShareEditAdapter sportShareEditAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: n0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SportShareEditAdapter.PatternDrawableItemViewHolder.bindItem$lambda$1(sportShareEditAdapter, styleItem, position, view2);
                }
            });
        }

        public final void setSelected(boolean selected) {
            this.editDrawableItem.setBackground(ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), selected ? hoi.j0 : hoi.i0));
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$PatternStickerItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/graphics/drawable/BitmapDrawable;", "viewToDrawable", "(Landroid/view/View;)Landroid/graphics/drawable/BitmapDrawable;", "", "selected", "", "setSelected", "(Z)V", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "styleItem", "", "position", "bindItem", "(Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;I)V", "Landroid/widget/ImageView;", "styleIconIv", "Landroid/widget/ImageView;", "Landroid/widget/FrameLayout;", "editView", "Landroid/widget/FrameLayout;", "editDrawableItem", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PatternStickerItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View editDrawableItem;

        @NotNull
        private final FrameLayout editView;

        @NotNull
        private final ImageView styleIconIv;
        final /* synthetic */ SportShareEditAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PatternStickerItemViewHolder(@NotNull SportShareEditAdapter sportShareEditAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportShareEditAdapter;
            View viewFindViewById = itemView.findViewById(bsi.L1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.styleIconIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bsi.U1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.editView = (FrameLayout) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bsi.T1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.editDrawableItem = viewFindViewById3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$0(SportShareEditAdapter this$0, SportRecordShareModel styleItem, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(styleItem, "$styleItem");
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(styleItem, i);
        }

        private final void setSelected(boolean selected) {
            this.editDrawableItem.setBackground(ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), selected ? hoi.h0 : hoi.i0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BitmapDrawable viewToDrawable(View view) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            view.draw(new Canvas(bitmapCreateBitmap));
            return new BitmapDrawable(AppUtil.getApp().getResources(), bitmapCreateBitmap);
        }

        public final void bindItem(@NotNull final SportRecordShareModel styleItem, final int position) {
            Intrinsics.checkNotNullParameter(styleItem, "styleItem");
            if (styleItem.getWatermarkView() != null && styleItem.getViewDrawable() == null) {
                DisplayUtil displayUtil = DisplayUtil.INSTANCE;
                int iDip2pxF = (int) (displayUtil.dip2pxF(60.0f) * (UIUtils.INSTANCE.getScreenState() == 0 ? 1.2f : 1.0f));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDip2pxF, iDip2pxF);
                layoutParams.topMargin = (int) displayUtil.dip2pxF(5.0f);
                layoutParams.setMarginStart((int) displayUtil.dip2pxF(5.0f));
                StickerView watermarkView = styleItem.getWatermarkView();
                Intrinsics.checkNotNull(watermarkView);
                if (watermarkView.getParent() != null) {
                    ViewParent parent = watermarkView.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(watermarkView);
                }
                StickerView watermarkView2 = styleItem.getWatermarkView();
                Intrinsics.checkNotNull(watermarkView2);
                watermarkView2.setLayoutParams(layoutParams);
                this.editView.addView(styleItem.getWatermarkView());
                this.editView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.xiaomi.fitness.detail.recycler.SportShareEditAdapter$PatternStickerItemViewHolder$bindItem$1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        this.this$0.editView.getViewTreeObserver().removeOnPreDrawListener(this);
                        SportShareEditAdapter.PatternStickerItemViewHolder patternStickerItemViewHolder = this.this$0;
                        BitmapDrawable bitmapDrawableViewToDrawable = patternStickerItemViewHolder.viewToDrawable(patternStickerItemViewHolder.editView);
                        styleItem.setViewDrawable(bitmapDrawableViewToDrawable);
                        if (this.this$0.styleIconIv.getWidth() == 0) {
                            this.this$0.styleIconIv.setImageDrawable(bitmapDrawableViewToDrawable);
                        }
                        this.this$0.editView.setVisibility(8);
                        return true;
                    }
                });
            }
            if (styleItem.getViewDrawable() != null) {
                this.styleIconIv.setImageDrawable(styleItem.getViewDrawable());
            }
            setSelected(styleItem.isSelect());
            ImageView imageView = this.styleIconIv;
            final SportShareEditAdapter sportShareEditAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportShareEditAdapter.PatternStickerItemViewHolder.bindItem$lambda$0(sportShareEditAdapter, styleItem, position, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter$PatternStyleItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "styleItem", "", "position", "", "bindItem", "(Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;I)V", "", "selected", "setSelected", "(Z)V", "Landroid/widget/TextView;", "styleIconIv", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PatternStyleItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView styleIconIv;
        final /* synthetic */ SportShareEditAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PatternStyleItemViewHolder(@NotNull SportShareEditAdapter sportShareEditAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportShareEditAdapter;
            View viewFindViewById = itemView.findViewById(bsi.w3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.styleIconIv = (TextView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$0(SportShareEditAdapter this$0, SportRecordShareModel styleItem, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(styleItem, "$styleItem");
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(styleItem, i);
        }

        public final void bindItem(@NotNull final SportRecordShareModel styleItem, final int position) {
            Intrinsics.checkNotNullParameter(styleItem, "styleItem");
            this.styleIconIv.setText(styleItem.getEditString());
            setSelected(styleItem.isSelect());
            TextView textView = this.styleIconIv;
            final SportShareEditAdapter sportShareEditAdapter = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: p0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportShareEditAdapter.PatternStyleItemViewHolder.bindItem$lambda$0(sportShareEditAdapter, styleItem, position, view);
                }
            });
        }

        public final void setSelected(boolean selected) {
            this.styleIconIv.setBackground(ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), selected ? hoi.h0 : hoi.g0));
        }
    }

    public SportShareEditAdapter(int i) {
        this.editViewType = i;
    }

    public final void bindListData(@Nullable List<SportRecordShareModel> itemList) {
        List<SportRecordShareModel> list = itemList;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mItemList = itemList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        if (this.mItemList.isEmpty()) {
            return 0;
        }
        return this.mItemList.size();
    }

    @NotNull
    public final List<SportRecordShareModel> getItemList() {
        return this.mItemList;
    }

    @NotNull
    public final RecyclerView getMRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        setMRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof PatternStyleItemViewHolder) {
            holder.setIsRecyclable(false);
            ((PatternStyleItemViewHolder) holder).bindItem(this.mItemList.get(position), position);
        } else if (holder instanceof PatternDrawableItemViewHolder) {
            ((PatternDrawableItemViewHolder) holder).bindItem(this.mItemList.get(position), position);
        } else if (holder instanceof PatternStickerItemViewHolder) {
            ((PatternStickerItemViewHolder) holder).bindItem(this.mItemList.get(position), position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = this.editViewType;
        if (i == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.r2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new PatternDrawableItemViewHolder(this, viewInflate);
        }
        if (i == 2) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(ivi.t2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new PatternDrawableItemViewHolder(this, viewInflate2);
        }
        if (i == 3) {
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(ivi.s2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new PatternStyleItemViewHolder(this, viewInflate3);
        }
        if (i != 4) {
            View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(ivi.s2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate4, "inflate(...)");
            return new PatternStyleItemViewHolder(this, viewInflate4);
        }
        View viewInflate5 = LayoutInflater.from(parent.getContext()).inflate(ivi.u2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate5, "inflate(...)");
        return new PatternStickerItemViewHolder(this, viewInflate5);
    }

    public final void setMRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.mOnItemClickListener = onItemClickListener;
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        setMRecyclerView(recyclerView);
    }
}
