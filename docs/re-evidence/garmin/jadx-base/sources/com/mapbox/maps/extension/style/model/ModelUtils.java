package com.mapbox.maps.extension.style.model;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0007\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "modelId", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl$Builder;", "", "block", "Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl;", ModelSourceWrapper.TYPE, "(Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl;", "Lcom/mapbox/maps/MapboxStyleManager;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleModelExtension;", "addModel", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/extension/style/StyleContract$StyleModelExtension;)V", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ModelUtils {
    @MapboxExperimental
    public static final void addModel(MapboxStyleManager mapboxStyleManager, StyleContract.StyleModelExtension styleModelExtension) {
        mapboxStyleManager.getClass();
        styleModelExtension.getClass();
        styleModelExtension.bindTo(mapboxStyleManager);
    }

    @MapboxExperimental
    public static final ModelExtensionImpl model(String str, l<? super ModelExtensionImpl.Builder, Unit> lVar) {
        str.getClass();
        lVar.getClass();
        ModelExtensionImpl.Builder builder = new ModelExtensionImpl.Builder(str);
        lVar.invoke(builder);
        return builder.build();
    }
}
