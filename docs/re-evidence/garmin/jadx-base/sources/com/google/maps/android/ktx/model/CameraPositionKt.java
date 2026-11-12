package com.google.maps.android.ktx.model;

import com.google.android.gms.maps.model.CameraPosition;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/CameraPosition$Builder;", "", "optionsActions", "Lcom/google/android/gms/maps/model/CameraPosition;", "cameraPosition", "(Le23/l;)Lcom/google/android/gms/maps/model/CameraPosition;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CameraPositionKt {
    public static final CameraPosition cameraPosition(l<? super CameraPosition.Builder, Unit> lVar) {
        lVar.getClass();
        CameraPosition.Builder builder = new CameraPosition.Builder();
        lVar.invoke(builder);
        CameraPosition cameraPositionBuild = builder.build();
        cameraPositionBuild.getClass();
        return cameraPositionBuild;
    }
}
