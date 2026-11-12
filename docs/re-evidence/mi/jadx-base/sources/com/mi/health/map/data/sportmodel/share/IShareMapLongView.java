package com.mi.health.map.data.sportmodel.share;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&JH\u0010\t\u001a\u00020\u00032>\b\u0002\u0010\u0006\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/mi/health/map/data/sportmodel/share/IShareMapLongView;", "", "createMapViewBitmap", "", "bitmap", "Landroid/graphics/Bitmap;", "callback", "Lkotlin/Function2;", "Landroid/net/Uri;", "createCommonBitmap", "Lkotlin/ParameterName;", "name", "commonBitmapUri", "commonBitmap", "setStatueTextWhite", "isBlack", "", "map-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IShareMapLongView {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void createCommonBitmap$default(IShareMapLongView iShareMapLongView, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createCommonBitmap");
            }
            if ((i & 1) != 0) {
                function2 = null;
            }
            iShareMapLongView.createCommonBitmap(function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void createMapViewBitmap$default(IShareMapLongView iShareMapLongView, Bitmap bitmap, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createMapViewBitmap");
            }
            if ((i & 2) != 0) {
                function2 = null;
            }
            iShareMapLongView.createMapViewBitmap(bitmap, function2);
        }
    }

    void createCommonBitmap(@Nullable Function2<? super Uri, ? super Bitmap, Unit> callback);

    void createMapViewBitmap(@Nullable Bitmap bitmap, @Nullable Function2<? super Uri, ? super Bitmap, Unit> callback);

    void setStatueTextWhite(boolean isBlack);
}
