package com.huami.moving.maps;

import androidx.exifinterface.media.ExifInterface;
import com.huami.moving.maps.IMapInfoWindowClickListenerDelegate.ClickableMarker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0003:\u0001\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate;", "Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate$ClickableMarker;", ExifInterface.GPS_DIRECTION_TRUE, "", "marker", "", "addMarker", "(Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate$ClickableMarker;)V", "removeMarker", "ClickableMarker", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface IMapInfoWindowClickListenerDelegate<T extends ClickableMarker> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate$ClickableMarker;", "Lcom/huami/moving/maps/IMarker;", "", "onInfoWindowClicked", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface ClickableMarker extends IMarker {
        void onInfoWindowClicked();
    }

    void addMarker(@NotNull T marker);

    void removeMarker(@NotNull T marker);
}
