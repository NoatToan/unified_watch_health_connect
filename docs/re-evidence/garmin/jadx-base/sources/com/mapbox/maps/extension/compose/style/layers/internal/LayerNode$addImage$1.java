package com.mapbox.maps.extension.compose.style.layers.internal;

import com.mapbox.bindgen.None;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.compose.style.StyleImage;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/MapboxStyleManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class LayerNode$addImage$1 extends w implements l<MapboxStyleManager, Unit> {
    final /* synthetic */ StyleImage $styleImage;
    final /* synthetic */ LayerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerNode$addImage$1(StyleImage styleImage, LayerNode layerNode) {
        super(1);
        this.$styleImage = styleImage;
        this.this$0 = layerNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(StyleImage styleImage, String str) {
        styleImage.getClass();
        str.getClass();
        MapboxLogger.logW("LayerNode", "Failed to add style image " + styleImage + ": " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(LayerNode layerNode, StyleImage styleImage, None none) {
        layerNode.getClass();
        styleImage.getClass();
        none.getClass();
        layerNode.addedImages.add(styleImage.getImageId());
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        String imageId = this.$styleImage.getImageId();
        Float scale = this.$styleImage.getScale();
        mapboxStyleManager.addStyleImage(imageId, scale != null ? scale.floatValue() : mapboxStyleManager.getPixelRatio(), this.$styleImage.getImage(), this.$styleImage.getSdf(), this.$styleImage.getStretchX(), this.$styleImage.getStretchY(), this.$styleImage.getContent()).onError(new a(this.$styleImage, 0)).onValue(new b(this.this$0, this.$styleImage, 0));
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(MapboxStyleManager mapboxStyleManager) {
        invoke2(mapboxStyleManager);
        return Unit.INSTANCE;
    }
}
