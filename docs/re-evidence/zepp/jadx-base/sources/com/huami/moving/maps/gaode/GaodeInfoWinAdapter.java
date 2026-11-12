package com.huami.moving.maps.gaode;

import android.view.View;
import com.amap.api.maps.AMap;
import com.amap.api.maps.model.Marker;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/moving/maps/gaode/GaodeInfoWinAdapter;", "Lcom/amap/api/maps/AMap$InfoWindowAdapter;", "Lcom/amap/api/maps/model/Marker;", "marker", "Landroid/view/View;", "getInfoContents", "getInfoWindow", "a", "Landroid/view/View;", "infoView", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GaodeInfoWinAdapter implements AMap.InfoWindowAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final View infoView;

    public GaodeInfoWinAdapter(@NotNull View view) {
        this.infoView = view;
    }

    @Override // com.amap.api.maps.AMap.InfoWindowAdapter
    @Nullable
    public View getInfoContents(@Nullable Marker marker) {
        return this.infoView;
    }

    @Override // com.amap.api.maps.AMap.InfoWindowAdapter
    @Nullable
    public View getInfoWindow(@Nullable Marker marker) {
        return null;
    }
}
