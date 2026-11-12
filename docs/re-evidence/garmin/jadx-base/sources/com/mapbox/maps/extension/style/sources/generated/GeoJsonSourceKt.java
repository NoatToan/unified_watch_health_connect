package com.mapbox.maps.extension.style.sources.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"", TtmlNode.ATTR_ID, "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "geoJsonSource", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource$Builder;", "", "block", "(Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GeoJsonSourceKt {
    public static final GeoJsonSource geoJsonSource(String str, l<? super GeoJsonSource.Builder, Unit> lVar) {
        str.getClass();
        lVar.getClass();
        GeoJsonSource.Builder builder = new GeoJsonSource.Builder(str);
        lVar.invoke(builder);
        return builder.build();
    }

    public static final GeoJsonSource geoJsonSource(String str) {
        str.getClass();
        return new GeoJsonSource.Builder(str).build();
    }
}
