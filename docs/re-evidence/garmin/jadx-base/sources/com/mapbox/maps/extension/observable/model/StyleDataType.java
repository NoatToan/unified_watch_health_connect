package com.mapbox.maps.extension.observable.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@e
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/observable/model/StyleDataType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STYLE", "SPRITE", "SOURCES", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum StyleDataType {
    STYLE(TtmlNode.TAG_STYLE),
    SPRITE("sprite"),
    SOURCES("sources");

    private final String value;

    StyleDataType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
