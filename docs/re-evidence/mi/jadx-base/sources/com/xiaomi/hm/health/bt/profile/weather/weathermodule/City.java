package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import android.text.TextUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "Ljava/io/Serializable;", "", "toByteArray", "", "toString", "", "other", "", "equals", "", "hashCode", "component1", "component2", "locationKey", "name", "copy", "Ljava/lang/String;", "getLocationKey", "()Ljava/lang/String;", "getName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class City implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final String locationKey;

    @NotNull
    private final String name;

    public City(@NotNull String locationKey, @NotNull String name) {
        Intrinsics.checkNotNullParameter(locationKey, "locationKey");
        Intrinsics.checkNotNullParameter(name, "name");
        this.locationKey = locationKey;
        this.name = name;
    }

    public static /* synthetic */ City copy$default(City city, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = city.locationKey;
        }
        if ((i & 2) != 0) {
            str2 = city.name;
        }
        return city.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLocationKey() {
        return this.locationKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final City copy(@NotNull String locationKey, @NotNull String name) {
        Intrinsics.checkNotNullParameter(locationKey, "locationKey");
        Intrinsics.checkNotNullParameter(name, "name");
        return new City(locationKey, name);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof City)) {
            return false;
        }
        City city = (City) other;
        return TextUtils.equals(city.locationKey, this.locationKey) && TextUtils.equals(city.name, this.name);
    }

    @NotNull
    public final String getLocationKey() {
        return this.locationKey;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.locationKey.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public final byte[] toByteArray() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = this.locationKey;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byte[] bytes2 = this.name.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes2);
        byteArrayOutputStream.write(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    @NotNull
    public String toString() {
        return "City[locationKey:" + this.locationKey + ", name: " + this.name + AbstractJsonLexerKt.END_LIST;
    }
}
