package com.mapbox.maps;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mapbox/maps/SnapshotterDestroyedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "()V", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SnapshotterDestroyedException extends IllegalStateException {
    public SnapshotterDestroyedException() {
        super("This snapshotter was already destroyed.");
    }
}
