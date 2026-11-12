package com.mapbox.maps.extension.compose.style;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/IdGenerator;", "", "()V", "LAYER_ID_PREFIX", "", "LIGHT_ID_PREFIX", "SOURCE_ID_PREFIX", "generateRandomId", "prefix", "generateRandomLayerId", "layerType", "generateRandomLightId", "lightType", "generateRandomSourceId", "sourceType", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IdGenerator {
    public static final int $stable = 0;
    public static final IdGenerator INSTANCE = new IdGenerator();
    private static final String LAYER_ID_PREFIX = "COMPOSE_LAYER_ID_";
    private static final String LIGHT_ID_PREFIX = "COMPOSE_LIGHT_ID_";
    private static final String SOURCE_ID_PREFIX = "COMPOSE_SOURCE_ID_";

    private IdGenerator() {
    }

    private final String generateRandomId(String prefix) {
        return prefix + '_' + UUID.randomUUID();
    }

    public final String generateRandomLayerId(String layerType) {
        layerType.getClass();
        return generateRandomId(LAYER_ID_PREFIX.concat(layerType));
    }

    public final String generateRandomLightId(String lightType) {
        lightType.getClass();
        return generateRandomId(LIGHT_ID_PREFIX.concat(lightType));
    }

    public final String generateRandomSourceId(String sourceType) {
        sourceType.getClass();
        return generateRandomId(SOURCE_ID_PREFIX.concat(sourceType));
    }
}
