package com.xiaomi.fitness.watch.face.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fitness.baseui.extension.ViewGroupExtendKt;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.data.FaceAllTabInfo;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceCategoryDimension;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.d9e;
import defpackage.tv1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceCategoryHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Ld9e;", "Lcom/xiaomi/fitness/watch/face/data/FaceAllTabInfo;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindView", "(Ld9e;Lcom/xiaomi/fitness/watch/face/data/FaceAllTabInfo;)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceCategoryHolder extends BaseBindingViewHolder<d9e, FaceAllTabInfo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceCategoryHolder(@NotNull View view) {
        super(tv1.f35071b, view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder
    public void bindView(@NotNull d9e d9eVar, @NotNull FaceAllTabInfo t) {
        Intrinsics.checkNotNullParameter(d9eVar, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
        d9eVar.B.setText(t.getTabName());
        List<FaceData> list = t.getList();
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        d9eVar.C.setImageDrawable(null);
        FaceInfoView preview1 = d9eVar.C;
        Intrinsics.checkNotNullExpressionValue(preview1, "preview1");
        ViewExtKt.gone(preview1);
        d9eVar.D.setImageDrawable(null);
        FaceInfoView preview2 = d9eVar.D;
        Intrinsics.checkNotNullExpressionValue(preview2, "preview2");
        ViewExtKt.gone(preview2);
        d9eVar.E.setImageDrawable(null);
        FaceInfoView preview3 = d9eVar.E;
        Intrinsics.checkNotNullExpressionValue(preview3, "preview3");
        ViewExtKt.gone(preview3);
        if (!list.isEmpty()) {
            FaceSizeConstant faceSizeConstant = FaceSizeConstant.INSTANCE;
            FaceCategoryDimension faceCategoryDimension$default = FaceSizeConstant.getFaceCategoryDimension$default(faceSizeConstant, 0, 1, null);
            FaceInfoView preview4 = d9eVar.C;
            Intrinsics.checkNotNullExpressionValue(preview4, "preview1");
            ViewExtKt.visible(preview4);
            ViewGroup.LayoutParams layoutParams = d9eVar.C.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                ViewGroupExtendKt.setMarginRelative(marginLayoutParams, 0, ExtUtilsKt.getDp(20), ExtUtilsKt.getDp(Float.valueOf(faceCategoryDimension$default.getMarginEnd())), ExtUtilsKt.getDp(20));
            }
            FaceManager faceManager = FaceManager.INSTANCE;
            String icon = list.get(0).getIcon();
            FaceInfoView preview5 = d9eVar.C;
            Intrinsics.checkNotNullExpressionValue(preview5, "preview1");
            faceManager.loadFaceUrl(icon, preview5, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : FaceIcon.TYPE_MARKET_CATEGORY_ITEM, (4092 & 1024) != 0 ? 0 : faceSizeConstant.getCurrentType(), (4092 & 2048) != 0 ? null : getLifecycle());
            if (list.size() > 1) {
                FaceInfoView preview6 = d9eVar.D;
                Intrinsics.checkNotNullExpressionValue(preview6, "preview2");
                ViewExtKt.visible(preview6);
                ViewGroup.LayoutParams layoutParams2 = d9eVar.D.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    ViewGroupExtendKt.setMarginRelative(marginLayoutParams2, 0, 0, ExtUtilsKt.getDp(Float.valueOf(faceCategoryDimension$default.getMargin())), 0);
                }
                String icon2 = list.get(1).getIcon();
                FaceInfoView preview7 = d9eVar.D;
                Intrinsics.checkNotNullExpressionValue(preview7, "preview2");
                faceManager.loadFaceUrl(icon2, preview7, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : FaceIcon.TYPE_MARKET_CATEGORY_ITEM, (4092 & 1024) != 0 ? 0 : faceSizeConstant.getCurrentType(), (4092 & 2048) != 0 ? null : getLifecycle());
                if (list.size() > 2) {
                    FaceInfoView preview8 = d9eVar.E;
                    Intrinsics.checkNotNullExpressionValue(preview8, "preview3");
                    ViewExtKt.visible(preview8);
                    ViewGroup.LayoutParams layoutParams3 = d9eVar.E.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams3 != null) {
                        ViewGroupExtendKt.setMarginRelative(marginLayoutParams3, 0, 0, ExtUtilsKt.getDp(Float.valueOf(faceCategoryDimension$default.getMargin())), 0);
                    }
                    String icon3 = list.get(2).getIcon();
                    FaceInfoView preview9 = d9eVar.E;
                    Intrinsics.checkNotNullExpressionValue(preview9, "preview3");
                    faceManager.loadFaceUrl(icon3, preview9, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : FaceIcon.TYPE_MARKET_CATEGORY_ITEM, (4092 & 1024) != 0 ? 0 : faceSizeConstant.getCurrentType(), (4092 & 2048) != 0 ? null : getLifecycle());
                }
            }
        }
    }
}
