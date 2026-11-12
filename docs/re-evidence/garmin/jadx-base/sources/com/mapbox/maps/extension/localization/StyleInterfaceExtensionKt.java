package com.mapbox.maps.extension.localization;

import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import java.util.List;
import java.util.Locale;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"localizeLabels", "", "Lcom/mapbox/maps/MapboxStyleManager;", "locale", "Ljava/util/Locale;", "layerIds", "", "", "extension-localization_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleInterfaceExtensionKt {
    public static final void localizeLabels(MapboxStyleManager mapboxStyleManager, Locale locale, List<String> list) {
        mapboxStyleManager.getClass();
        locale.getClass();
        if (s.g(mapboxStyleManager.getStyleURI(), Style.STANDARD)) {
            f.n("Mapbox Standard style does not support client-side runtime localization. Consider using Mapbox internationalization capability instead: https://www.mapbox.com/blog/maps-internationalization-34-languages");
        } else {
            LocalizationKt.setMapLanguage(locale, mapboxStyleManager, list);
        }
    }

    public static /* synthetic */ void localizeLabels$default(MapboxStyleManager mapboxStyleManager, Locale locale, List list, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            list = null;
        }
        localizeLabels(mapboxStyleManager, locale, list);
    }

    public static final void localizeLabels(MapboxStyleManager mapboxStyleManager, Locale locale) {
        mapboxStyleManager.getClass();
        locale.getClass();
        localizeLabels$default(mapboxStyleManager, locale, null, 2, null);
    }
}
