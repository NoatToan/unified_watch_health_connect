package com.mapbox.maps.extension.style.light;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.common.ValueUtilsKt;
import e23.a;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class Light$internalLightProperties$2 extends w implements a<HashMap<String, Value>> {
    final /* synthetic */ Light this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Light$internalLightProperties$2(Light light) {
        super(0);
        this.this$0 = light;
    }

    @Override // e23.a
    public final HashMap<String, Value> invoke() {
        HashMap<String, Value> map = new HashMap<>();
        Light light = this.this$0;
        map.put(TtmlNode.ATTR_ID, ValueUtilsKt.toValue(light.getLightId()));
        map.put(NotificationConstants.KEY_DATA_MIME_TYPE, ValueUtilsKt.toValue(light.getType$extension_style_release()));
        return map;
    }
}
