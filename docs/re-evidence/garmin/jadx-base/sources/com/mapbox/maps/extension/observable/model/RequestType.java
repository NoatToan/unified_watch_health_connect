package com.mapbox.maps.extension.observable.model;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@e
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/observable/model/RequestType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNKNOWN", "STYLE", "SOURCE", "TILE", "GLYPHS", "SPRITE_IMAGE", "SPRITE_JSON", "IMAGE", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum RequestType {
    UNKNOWN(PrivacyUpdateRequestError.UNKNOWN),
    STYLE(TtmlNode.TAG_STYLE),
    SOURCE("source"),
    TILE("tile"),
    GLYPHS("glyphs"),
    SPRITE_IMAGE("sprite-image"),
    SPRITE_JSON("sprite-json"),
    IMAGE("image");

    private final String value;

    RequestType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
