package com.mapbox.maps.extension.style.sources;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.CustomGeometrySourceOptions;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", TtmlNode.ATTR_ID, "Lkotlin/Function1;", "Lcom/mapbox/maps/CustomGeometrySourceOptions$Builder;", "", "block", "Lcom/mapbox/maps/extension/style/sources/CustomGeometrySource;", "customGeometrySource", "(Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/sources/CustomGeometrySource;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CustomGeometrySourceKt {
    public static final CustomGeometrySource customGeometrySource(String str, l<? super CustomGeometrySourceOptions.Builder, Unit> lVar) {
        str.getClass();
        lVar.getClass();
        CustomGeometrySourceOptions.Builder builder = new CustomGeometrySourceOptions.Builder();
        lVar.invoke(builder);
        CustomGeometrySourceOptions customGeometrySourceOptionsBuild = builder.build();
        customGeometrySourceOptionsBuild.getClass();
        return new CustomGeometrySource(str, customGeometrySourceOptionsBuild);
    }
}
