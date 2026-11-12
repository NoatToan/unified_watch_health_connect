package com.huami.moving.maps;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0002H&J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0011"}, d2 = {"Lcom/huami/moving/maps/IMarker;", "", "", "remove", "Landroid/location/Location;", "location", "updateLocation", "Lcom/huami/moving/maps/IInfoWindow;", "infoWindow", "showInfoWindow", "refreshInfoWindow", "Lcom/huami/moving/maps/OnInfoWindowClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnInfoWindowClickListener", "Landroid/graphics/Bitmap;", "icon", "updateIcon", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface IMarker {
    void refreshInfoWindow();

    void remove();

    void setOnInfoWindowClickListener(@Nullable OnInfoWindowClickListener listener);

    void showInfoWindow(@NotNull IInfoWindow infoWindow);

    void updateIcon(@NotNull Bitmap icon);

    void updateLocation(@NotNull Location location);
}
