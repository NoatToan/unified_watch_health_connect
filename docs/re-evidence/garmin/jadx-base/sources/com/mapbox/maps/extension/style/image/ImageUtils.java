package com.mapbox.maps.extension.style.image;

import android.graphics.Bitmap;
import com.mapbox.maps.Image;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import e23.l;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\t2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\n\u001a3\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"", "imageId", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl$Builder;", "", "block", "Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl;", "image", "(Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl;", "Lcom/mapbox/maps/Image;", "(Ljava/lang/String;Lcom/mapbox/maps/Image;Le23/l;)Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl;", "Landroid/graphics/Bitmap;", "bitmap", "(Ljava/lang/String;Landroid/graphics/Bitmap;Le23/l;)Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl;", "Lcom/mapbox/maps/MapboxStyleManager;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleImageExtension;", "addImage", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/extension/style/StyleContract$StyleImageExtension;)V", "Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl$Builder;", "Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl;", "image9Patch", "(Ljava/lang/String;Landroid/graphics/Bitmap;Le23/l;)Lcom/mapbox/maps/extension/style/image/ImageNinePatchExtensionImpl;", "addImage9Patch", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ImageUtils {
    public static final void addImage(MapboxStyleManager mapboxStyleManager, StyleContract.StyleImageExtension styleImageExtension) {
        mapboxStyleManager.getClass();
        styleImageExtension.getClass();
        styleImageExtension.bindTo(mapboxStyleManager);
    }

    public static final void addImage9Patch(MapboxStyleManager mapboxStyleManager, StyleContract.StyleImageExtension styleImageExtension) {
        mapboxStyleManager.getClass();
        styleImageExtension.getClass();
        styleImageExtension.bindTo(mapboxStyleManager);
    }

    public static final ImageExtensionImpl image(String str, Image image, l<? super ImageExtensionImpl.Builder, Unit> lVar) {
        str.getClass();
        image.getClass();
        lVar.getClass();
        ImageExtensionImpl.Builder builder = new ImageExtensionImpl.Builder(str, image);
        lVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ ImageExtensionImpl image$default(String str, Image image, l lVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        return image(str, image, (l<? super ImageExtensionImpl.Builder, Unit>) lVar);
    }

    public static final ImageNinePatchExtensionImpl image9Patch(String str, Bitmap bitmap, l<? super ImageNinePatchExtensionImpl.Builder, Unit> lVar) {
        str.getClass();
        bitmap.getClass();
        if (lVar != null) {
            ImageNinePatchExtensionImpl.Builder builder = new ImageNinePatchExtensionImpl.Builder(str, bitmap);
            lVar.invoke(builder);
            ImageNinePatchExtensionImpl imageNinePatchExtensionImplBuild = builder.build();
            if (imageNinePatchExtensionImplBuild != null) {
                return imageNinePatchExtensionImplBuild;
            }
        }
        return new ImageNinePatchExtensionImpl.Builder(str, bitmap).build();
    }

    public static /* synthetic */ ImageNinePatchExtensionImpl image9Patch$default(String str, Bitmap bitmap, l lVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            lVar = null;
        }
        return image9Patch(str, bitmap, lVar);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.style.image.ImageUtils$image$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<ImageExtensionImpl.Builder, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ImageExtensionImpl.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ImageExtensionImpl.Builder builder) {
            builder.getClass();
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.style.image.ImageUtils$image$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/image/ImageExtensionImpl$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements l<ImageExtensionImpl.Builder, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ImageExtensionImpl.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ImageExtensionImpl.Builder builder) {
            builder.getClass();
        }
    }

    public static /* synthetic */ ImageExtensionImpl image$default(String str, Bitmap bitmap, l lVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            lVar = AnonymousClass2.INSTANCE;
        }
        return image(str, bitmap, (l<? super ImageExtensionImpl.Builder, Unit>) lVar);
    }

    @e
    public static final ImageExtensionImpl image(String str, l<? super ImageExtensionImpl.Builder, Unit> lVar) {
        str.getClass();
        lVar.getClass();
        ImageExtensionImpl.Builder builder = new ImageExtensionImpl.Builder(str);
        lVar.invoke(builder);
        return builder.build();
    }

    public static final ImageExtensionImpl image(String str, Bitmap bitmap, l<? super ImageExtensionImpl.Builder, Unit> lVar) {
        str.getClass();
        bitmap.getClass();
        lVar.getClass();
        ImageExtensionImpl.Builder builder = new ImageExtensionImpl.Builder(str, bitmap);
        lVar.invoke(builder);
        return builder.build();
    }

    public static final ImageNinePatchExtensionImpl image9Patch(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        return image9Patch$default(str, bitmap, null, 4, null);
    }
}
