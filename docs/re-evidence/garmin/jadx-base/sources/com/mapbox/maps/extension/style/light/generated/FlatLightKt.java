package com.mapbox.maps.extension.style.light.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", TtmlNode.ATTR_ID, "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/light/generated/FlatLightDslReceiver;", "", "block", "Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "flatLight", "(Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class FlatLightKt {
    public static final FlatLight flatLight(String str, l<? super FlatLightDslReceiver, Unit> lVar) {
        str.getClass();
        lVar.getClass();
        FlatLight flatLight = new FlatLight(str);
        lVar.invoke(flatLight);
        return flatLight;
    }

    public static /* synthetic */ FlatLight flatLight$default(String str, l lVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = "flat";
        }
        return flatLight(str, lVar);
    }
}
