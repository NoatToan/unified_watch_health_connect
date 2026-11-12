package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraOptions;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import t13.d;
import t13.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class MapboxMapExtKt$cameraForCoordinates$2$1 extends q implements l<CameraOptions, Unit> {
    public MapboxMapExtKt$cameraForCoordinates$2$1(Object obj) {
        super(1, obj, f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        d dVar = (d) this.receiver;
        int i14 = o13.q.f128596b;
        dVar.resumeWith(cameraOptions);
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
        invoke2(cameraOptions);
        return Unit.INSTANCE;
    }
}
