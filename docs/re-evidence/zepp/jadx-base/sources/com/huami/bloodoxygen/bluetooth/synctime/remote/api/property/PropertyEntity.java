package com.huami.bloodoxygen.bluetooth.synctime.remote.api.property;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/PropertyEntity;", "", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/Properties;", "component1", Configs.Params.PROPERTIES, "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/Properties;", "getProperties", "()Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/Properties;", "setProperties", "(Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/Properties;)V", "<init>", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PropertyEntity {

    @SerializedName(Configs.Params.PROPERTIES)
    @NotNull
    private Properties properties;

    public PropertyEntity(@NotNull Properties properties) {
        this.properties = properties;
    }

    public static /* synthetic */ PropertyEntity copy$default(PropertyEntity propertyEntity, Properties properties, int i, Object obj) {
        if ((i & 1) != 0) {
            properties = propertyEntity.properties;
        }
        return propertyEntity.copy(properties);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Properties getProperties() {
        return this.properties;
    }

    @NotNull
    public final PropertyEntity copy(@NotNull Properties properties) {
        return new PropertyEntity(properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PropertyEntity) && Intrinsics.areEqual(this.properties, ((PropertyEntity) other).properties);
    }

    @NotNull
    public final Properties getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    public final void setProperties(@NotNull Properties properties) {
        this.properties = properties;
    }

    @NotNull
    public String toString() {
        return "PropertyEntity(properties=" + this.properties + ")";
    }
}
