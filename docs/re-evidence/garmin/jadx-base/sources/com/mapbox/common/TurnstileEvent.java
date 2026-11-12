package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TurnstileEvent implements Serializable {
    private final UserSKUIdentifier skuId;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TurnstileEvent(UserSKUIdentifier userSKUIdentifier) {
        this.skuId = userSKUIdentifier;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.skuId, ((TurnstileEvent) obj).skuId);
    }

    public UserSKUIdentifier getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return Objects.hash(this.skuId);
    }

    public String toString() {
        return "[skuId: " + RecordUtils.fieldToString(this.skuId) + "]";
    }
}
