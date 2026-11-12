package com.mapbox.maps.coroutine;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class MapboxMapExtKt$cameraChangedEvents$1$cancelable$2 extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
    public MapboxMapExtKt$cameraChangedEvents$1$cancelable$2(Object obj) {
        super(0, obj, w.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((w) this.receiver).q(null);
    }

    @Override // e23.a
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
