package com.mapbox.maps.extension.style.terrain.generated;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "sourceId", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/terrain/generated/TerrainDslReceiver;", "", "block", "Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "terrain", "(Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TerrainKt {
    public static final Terrain terrain(String str, l<? super TerrainDslReceiver, Unit> lVar) {
        str.getClass();
        if (lVar == null) {
            return new Terrain(str);
        }
        Terrain terrain = new Terrain(str);
        lVar.invoke(terrain);
        return terrain;
    }

    public static /* synthetic */ Terrain terrain$default(String str, l lVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            lVar = null;
        }
        return terrain(str, lVar);
    }

    public static final Terrain terrain(String str) {
        str.getClass();
        return terrain$default(str, null, 2, null);
    }
}
