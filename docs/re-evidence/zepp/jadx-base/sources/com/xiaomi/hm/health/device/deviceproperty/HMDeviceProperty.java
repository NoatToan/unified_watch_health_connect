package com.xiaomi.hm.health.device.deviceproperty;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0013J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceproperty/HMDeviceProperty;", "", "", "toJsonString", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "component1", Constants.JSON_FEATURE, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "getFeature", "()Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "setFeature", "(Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)V", "<init>", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMDeviceProperty {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Feature feature;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceproperty/HMDeviceProperty$Companion;", "", "", "propertyStr", "Lcom/xiaomi/hm/health/device/deviceproperty/HMDeviceProperty;", "fromJsonString", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "fromJsonString: " + this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final HMDeviceProperty fromJsonString(@Nullable String propertyStr) {
            int i = 1;
            HMDeviceProperty hMDeviceProperty = new HMDeviceProperty(null, i, 0 == true ? 1 : 0);
            if (propertyStr != null && !m.isBlank(propertyStr)) {
                i = 0;
            }
            if (i != 0) {
                return hMDeviceProperty;
            }
            try {
                hMDeviceProperty.setFeature(HMDevicePropertyCacheKt.fromPropertyString(new JSONObject(propertyStr).optString(Constants.JSON_FEATURE)));
            } catch (Exception e) {
                HMLog.info("HMDeviceProperty", new a(e));
            }
            return hMDeviceProperty;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toJsonString: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMDeviceProperty() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HMDeviceProperty(@Nullable Feature feature) {
        this.feature = feature;
    }

    public static /* synthetic */ HMDeviceProperty copy$default(HMDeviceProperty hMDeviceProperty, Feature feature, int i, Object obj) {
        if ((i & 1) != 0) {
            feature = hMDeviceProperty.feature;
        }
        return hMDeviceProperty.copy(feature);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Feature getFeature() {
        return this.feature;
    }

    @NotNull
    public final HMDeviceProperty copy(@Nullable Feature feature) {
        return new HMDeviceProperty(feature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HMDeviceProperty) && Intrinsics.areEqual(this.feature, ((HMDeviceProperty) other).feature);
    }

    @Nullable
    public final Feature getFeature() {
        return this.feature;
    }

    public int hashCode() {
        Feature feature = this.feature;
        if (feature == null) {
            return 0;
        }
        return feature.hashCode();
    }

    public final void setFeature(@Nullable Feature feature) {
        this.feature = feature;
    }

    @Nullable
    public final String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            Feature feature = this.feature;
            if (feature != null) {
                jSONObject.put(Constants.JSON_FEATURE, HMDevicePropertyKt.toPropertyString(feature));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            HMLog.info("HMDeviceProperty", new a(e));
            return null;
        }
    }

    @NotNull
    public String toString() {
        return "HMDeviceProperty(feature=" + this.feature + ")";
    }

    public /* synthetic */ HMDeviceProperty(Feature feature, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : feature);
    }
}
