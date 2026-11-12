package com.mapbox.maps.extension.style.sources.generated;

import android.os.Handler;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class GeoJsonSource$workerHandler$2 extends w implements a<Handler> {
    public static final GeoJsonSource$workerHandler$2 INSTANCE = new GeoJsonSource$workerHandler$2();

    public GeoJsonSource$workerHandler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Handler invoke() {
        return new Handler(GeoJsonSource.INSTANCE.getWorkerThread$extension_style_release().getLooper());
    }
}
