package com.xiaomi.fitness.watch.face.adapter;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceFeedCommonItemViewHolder;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.watch.face.helper.ImageLoadUtil;
import com.xiaomi.onetrack.OneTrack;
import defpackage.iki;
import defpackage.j39;
import defpackage.p1j;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceFeedCommonItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "wrapper", "", "bindData", "(ILcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onClick", "(Lkotlin/jvm/functions/Function1;)V", CervicalMucusRecord.Appearance.CLEAR, "()V", "", "showWatchFacePrice", "Z", "Lj39;", "binding", "Lj39;", "<init>", "(ZLj39;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceFeedCommonItemViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceFeedCommonItemViewHolder.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceFeedCommonItemViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,98:1\n326#2,2:99\n328#2,2:109\n326#2,2:111\n328#2,2:121\n193#3,8:101\n193#3,8:113\n*S KotlinDebug\n*F\n+ 1 FaceFeedCommonItemViewHolder.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceFeedCommonItemViewHolder\n*L\n31#1:99,2\n31#1:109,2\n52#1:111,2\n52#1:121,2\n32#1:101,8\n53#1:113,8\n*E\n"})
public final class FaceFeedCommonItemViewHolder extends RecyclerView.d0 {

    @NotNull
    private final j39 binding;
    private final boolean showWatchFacePrice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceFeedCommonItemViewHolder(boolean z, @NotNull j39 binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.showWatchFacePrice = z;
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$3(Function1 listener, FaceFeedCommonItemViewHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        listener.invoke2(Integer.valueOf(this$0.getBindingAdapterPosition()));
    }

    public final void bindData(int position, @NotNull DeviceFaceMarketListItemWrapper wrapper) {
        int dp;
        int dp2;
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        FaceData feedWatchFaceListItem = wrapper.getFeedWatchFaceListItem();
        if (feedWatchFaceListItem == null) {
            return;
        }
        j39 j39Var = this.binding;
        View root = j39Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, 0, marginLayoutParams.bottomMargin);
        root.setLayoutParams(marginLayoutParams);
        int currentType = FaceSizeConstant.INSTANCE.getCurrentType();
        if (currentType == 1 || currentType == 2) {
            dp = ExtUtilsKt.getDp(Double.valueOf(113.3d));
        } else if (currentType != 3) {
            dp = currentType != 4 ? 0 : ExtUtilsKt.getDp(120);
        } else {
            dp = ExtUtilsKt.getDp(Double.valueOf(133.3d));
        }
        if (currentType == 1) {
            dp2 = ExtUtilsKt.getDp(20);
        } else if (currentType == 2) {
            dp2 = ExtUtilsKt.getDp(Double.valueOf(20.7d));
        } else if (currentType != 3) {
            dp2 = currentType != 4 ? 0 : ExtUtilsKt.getDp(Double.valueOf(17.3d));
        } else {
            dp2 = ExtUtilsKt.getDp(Double.valueOf(10.7d));
        }
        int i = (FaceIcon.INFO_WIDTH * dp) / FaceIcon.INFO_HEIGHT;
        int i2 = (int) ((dp * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_HEIGHT);
        ImageLoadUtil imageLoadUtil = ImageLoadUtil.INSTANCE;
        ImageView mImageView = this.binding.B;
        Intrinsics.checkNotNullExpressionValue(mImageView, "mImageView");
        ImageLoadUtil.load$default(imageLoadUtil, mImageView, feedWatchFaceListItem.getIcon(), i, dp, i2, null, 32, null);
        ImageView mImageView2 = j39Var.B;
        Intrinsics.checkNotNullExpressionValue(mImageView2, "mImageView");
        ViewGroup.LayoutParams layoutParams2 = mImageView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, dp2, marginLayoutParams2.rightMargin, dp2);
        mImageView2.setLayoutParams(marginLayoutParams2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(ExtUtilsKt.getDp(2), ApplicationExtKt.getApplication().getColor(iki.g));
        gradientDrawable.setCornerRadius(((ExtUtilsKt.getDp(124) * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_HEIGHT) + ExtUtilsKt.getDp(4));
        gradientDrawable.setBounds(0, 0, i, dp);
        this.binding.B.setBackground(gradientDrawable);
        this.binding.C.setText(feedWatchFaceListItem.getDisplay_name());
        TextView size = this.binding.E;
        Intrinsics.checkNotNullExpressionValue(size, "size");
        ViewExtKt.visible(size);
        if (!this.showWatchFacePrice) {
            TextView size2 = this.binding.E;
            Intrinsics.checkNotNullExpressionValue(size2, "size");
            ViewExtKt.gone(size2);
        } else if (feedWatchFaceListItem.isPurchaseFace()) {
            this.binding.E.setText(ResourceExtKt.getString(p1j.r0, Float.valueOf(feedWatchFaceListItem.getPrice() / 100.0f)));
        } else {
            this.binding.E.setText(ResourceExtKt.getString(p1j.m));
        }
        j39Var.B.setTag(FaceOneTrackUtil.buildTrackContent$default(FaceOneTrackUtil.INSTANCE, feedWatchFaceListItem.getId(), "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.0.0.0.39956"), TuplesKt.to("name", "watchface_single"), TuplesKt.to("asset_id", feedWatchFaceListItem.getId()), TuplesKt.to(OneTrack.Param.ASSET_NAME, feedWatchFaceListItem.getDisplay_name()), TuplesKt.to(FaceDetailFragment.PAGE_NAME, ResourceExtKt.getString(p1j.h0)), TuplesKt.to("source", 13), TuplesKt.to("watchface_position_id", Integer.valueOf(position + 1))), 0.0f, 8, null));
    }

    public final void clear() {
        this.binding.B.setImageDrawable(null);
    }

    public final void onClick(@NotNull final Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: sw8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceFeedCommonItemViewHolder.onClick$lambda$3(listener, this, view);
            }
        });
    }
}
