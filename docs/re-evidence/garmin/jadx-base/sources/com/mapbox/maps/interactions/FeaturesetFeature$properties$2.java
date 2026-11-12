package com.mapbox.maps.interactions;

import com.google.gson.JsonObject;
import e23.a;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "FS", "Lcom/mapbox/maps/interactions/FeatureState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class FeaturesetFeature$properties$2 extends w implements a<JSONObject> {
    final /* synthetic */ FeaturesetFeature<FS> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturesetFeature$properties$2(FeaturesetFeature<FS> featuresetFeature) {
        super(0);
        this.this$0 = featuresetFeature;
    }

    @Override // e23.a
    public final JSONObject invoke() {
        JsonObject jsonObjectProperties = this.this$0.getOriginalFeature().properties();
        return jsonObjectProperties != null ? new JSONObject(jsonObjectProperties.toString()) : new JSONObject();
    }
}
