package com.xiaomi.fitness.watch.face.adapter;

import android.view.ViewGroup;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.extension.ViewGroupExtendKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.data.FaceListCommonTab;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import com.xiaomi.fitness.watch.face.export.exportview.FaceMarketPhotoDimension;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import defpackage.h9e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceFeedAlbumItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/watch/face/data/FaceListCommonTab;", "data", "", "bindData", "(Lcom/xiaomi/fitness/watch/face/data/FaceListCommonTab;)V", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lh9e;", "binding", "Lh9e;", "<init>", "(Lh9e;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceFeedAlbumItemViewHolder extends RecyclerView.d0 {

    @NotNull
    private final h9e binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceFeedAlbumItemViewHolder(@NotNull h9e binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bindData(@Nullable FaceListCommonTab data) {
        h9e h9eVar = this.binding;
        h9eVar.D.setText(data != null ? data.getTabName() : null);
        Intrinsics.checkNotNull(data);
        List<FaceData> list = data.getList();
        if (!list.isEmpty()) {
            FaceSizeConstant faceSizeConstant = FaceSizeConstant.INSTANCE;
            FaceMarketPhotoDimension faceMarketPhotoDimension$default = FaceSizeConstant.getFaceMarketPhotoDimension$default(faceSizeConstant, 0, 1, null);
            FaceInfoView preview3 = h9eVar.C;
            Intrinsics.checkNotNullExpressionValue(preview3, "preview3");
            ViewExtKt.visible(preview3);
            ViewGroup.LayoutParams layoutParams = h9eVar.C.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                ViewGroupExtendKt.setMarginRelative(marginLayoutParams, 0, ExtUtilsKt.getDp(Float.valueOf(faceMarketPhotoDimension$default.getMarginTop())), ExtUtilsKt.getDp(Float.valueOf(faceMarketPhotoDimension$default.getMarginEnd())), ExtUtilsKt.getDp(Float.valueOf(faceMarketPhotoDimension$default.getMarginBottom())));
            }
            FaceManager faceManager = FaceManager.INSTANCE;
            String icon = list.get(0).getIcon();
            FaceInfoView preview4 = h9eVar.C;
            Intrinsics.checkNotNullExpressionValue(preview4, "preview3");
            faceManager.loadFaceUrl(icon, preview4, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : FaceIcon.TYPE_MARKET_PHOTO_ITEM, (4092 & 1024) != 0 ? 0 : faceSizeConstant.getCurrentType(), (4092 & 2048) != 0 ? null : null);
            if (list.size() > 1) {
                FaceInfoView preview2 = h9eVar.B;
                Intrinsics.checkNotNullExpressionValue(preview2, "preview2");
                ViewExtKt.visible(preview2);
                ViewGroup.LayoutParams layoutParams2 = h9eVar.B.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    ViewGroupExtendKt.setMarginRelative(marginLayoutParams2, 0, ExtUtilsKt.getDp(Float.valueOf(faceMarketPhotoDimension$default.getMarginTop())), ExtUtilsKt.getDp(Float.valueOf(faceMarketPhotoDimension$default.getMargin())), 0);
                }
                String icon2 = list.get(1).getIcon();
                FaceInfoView preview5 = h9eVar.B;
                Intrinsics.checkNotNullExpressionValue(preview5, "preview2");
                faceManager.loadFaceUrl(icon2, preview5, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : FaceIcon.TYPE_MARKET_PHOTO_ITEM, (4092 & 1024) != 0 ? 0 : faceSizeConstant.getCurrentType(), (4092 & 2048) != 0 ? null : null);
                if (list.size() > 2) {
                    FaceInfoView preview1 = h9eVar.A;
                    Intrinsics.checkNotNullExpressionValue(preview1, "preview1");
                    ViewExtKt.visible(preview1);
                    ViewGroup.LayoutParams layoutParams3 = h9eVar.A.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams3 != null) {
                        ViewGroupExtendKt.setMarginRelative(marginLayoutParams3, 0, ExtUtilsKt.getDp(Float.valueOf(faceMarketPhotoDimension$default.getMarginTop())), ExtUtilsKt.getDp(Float.valueOf(faceMarketPhotoDimension$default.getMargin())), 0);
                    }
                    String icon3 = list.get(2).getIcon();
                    FaceInfoView preview6 = h9eVar.A;
                    Intrinsics.checkNotNullExpressionValue(preview6, "preview1");
                    faceManager.loadFaceUrl(icon3, preview6, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : FaceIcon.TYPE_MARKET_PHOTO_ITEM, (4092 & 1024) != 0 ? 0 : faceSizeConstant.getCurrentType(), (4092 & 2048) != 0 ? null : null);
                }
            }
        }
    }

    public final void clear() {
        h9e h9eVar = this.binding;
        h9eVar.A.setImageDrawable(null);
        h9eVar.B.setImageDrawable(null);
        h9eVar.C.setImageDrawable(null);
    }
}
