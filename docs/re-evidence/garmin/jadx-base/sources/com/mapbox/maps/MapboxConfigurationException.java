package com.mapbox.maps;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/MapboxConfigurationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "message", "", "(Ljava/lang/String;)V", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxConfigurationException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxConfigurationException(String str) {
        super(str);
        str.getClass();
    }

    public MapboxConfigurationException() {
        super("Using MapView, MapSurface, Snapshotter or other Map components requires providing a valid access token when inflating or creating the map.\nProvide the token by either:\n  1. Creating a mapbox_access_token string resource.\n  2. Or programmatically calling `MapboxOptions.accessToken = <your_access_token>`.\nThe access token parameter is required when using a Mapbox service.\nPlease see https://www.mapbox.com/help/create-api-access-token/ to learn how to create one.\nMore information in this guide https://www.mapbox.com/help/first-steps-android-sdk/#access-tokens.");
    }
}
