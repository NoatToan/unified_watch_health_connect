package com.mapbox.maps.extension.style.image;

import android.graphics.Bitmap;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.Image;
import com.mapbox.maps.ImageContent;
import com.mapbox.maps.ImageStretches;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxStyleManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a<\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeNinePatchChunk", "Lcom/mapbox/maps/extension/style/image/NinePatchImage;", "bitmap", "Landroid/graphics/Bitmap;", "addImage9Patch", "Lcom/mapbox/bindgen/Expected;", "", "Lcom/mapbox/bindgen/None;", "Lcom/mapbox/maps/MapboxStyleManager;", "imageId", "scale", "", "sdf", "", "parse9PatchBitmap", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class NinePatchUtils {
    public static final Expected<String, None> addImage9Patch(MapboxStyleManager mapboxStyleManager, String str, Bitmap bitmap, float f14, boolean z14) {
        mapboxStyleManager.getClass();
        str.getClass();
        bitmap.getClass();
        NinePatchImage ninePatchImageDecodeNinePatchChunk = decodeNinePatchChunk(bitmap);
        return mapboxStyleManager.addStyleImage(str, f14, ninePatchImageDecodeNinePatchChunk.getInternalImage(), z14, ninePatchImageDecodeNinePatchChunk.getStretchX(), ninePatchImageDecodeNinePatchChunk.getStretchY(), ninePatchImageDecodeNinePatchChunk.getImageContent());
    }

    public static /* synthetic */ Expected addImage9Patch$default(MapboxStyleManager mapboxStyleManager, String str, Bitmap bitmap, float f14, boolean z14, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            f14 = mapboxStyleManager.getPixelRatio();
        }
        if ((i14 & 8) != 0) {
            z14 = false;
        }
        return addImage9Patch(mapboxStyleManager, str, bitmap, f14, z14);
    }

    @MapboxDelicateApi
    private static final NinePatchImage decodeNinePatchChunk(Bitmap bitmap) {
        List list;
        List list2;
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        if (ninePatchChunk == null) {
            h.s("Given bitmap must be a 9-patch drawable (.9.png)!");
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
        byteBufferOrder.get();
        byte b14 = byteBufferOrder.get();
        byte b15 = byteBufferOrder.get();
        byteBufferOrder.get();
        byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        int i14 = byteBufferOrder.getInt();
        int i15 = byteBufferOrder.getInt();
        int i16 = byteBufferOrder.getInt();
        int i17 = byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        ArrayList arrayList = new ArrayList();
        for (int i18 = 0; i18 < b14; i18++) {
            arrayList.add(Integer.valueOf(byteBufferOrder.getInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i19 = 0; i19 < b15; i19++) {
            arrayList2.add(Integer.valueOf(byteBufferOrder.getInt()));
        }
        Image mapboxImage = ExtensionUtils.toMapboxImage(bitmap);
        ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(Float.valueOf(((Number) it.next()).intValue()));
        }
        Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            ArrayList arrayList4 = new ArrayList();
            Object next = it3.next();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                arrayList4.add(new ImageStretches(((Number) next).floatValue(), ((Number) next2).floatValue()));
                next = next2;
            }
            list = arrayList4;
        } else {
            list = j0.f134944a;
        }
        ArrayList arrayList5 = new ArrayList(y.r(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList5.add(Float.valueOf(((Number) it4.next()).intValue()));
        }
        Iterator it5 = arrayList5.iterator();
        if (it5.hasNext()) {
            ArrayList arrayList6 = new ArrayList();
            Object next3 = it5.next();
            while (it5.hasNext()) {
                Object next4 = it5.next();
                arrayList6.add(new ImageStretches(((Number) next3).floatValue(), ((Number) next4).floatValue()));
                next3 = next4;
            }
            list2 = arrayList6;
        } else {
            list2 = j0.f134944a;
        }
        return new NinePatchImage(mapboxImage, list, list2, new ImageContent(i14, i16, bitmap.getWidth() - i15, bitmap.getHeight() - i17));
    }

    public static final NinePatchImage parse9PatchBitmap(Bitmap bitmap) {
        bitmap.getClass();
        return decodeNinePatchChunk(bitmap);
    }

    public static final Expected<String, None> addImage9Patch(MapboxStyleManager mapboxStyleManager, String str, Bitmap bitmap, float f14) {
        mapboxStyleManager.getClass();
        str.getClass();
        bitmap.getClass();
        return addImage9Patch$default(mapboxStyleManager, str, bitmap, f14, false, 8, null);
    }

    public static final Expected<String, None> addImage9Patch(MapboxStyleManager mapboxStyleManager, String str, Bitmap bitmap) {
        mapboxStyleManager.getClass();
        str.getClass();
        bitmap.getClass();
        return addImage9Patch$default(mapboxStyleManager, str, bitmap, 0.0f, false, 12, null);
    }
}
