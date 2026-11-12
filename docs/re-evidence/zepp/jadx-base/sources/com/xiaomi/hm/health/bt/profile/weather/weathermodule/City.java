package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001R\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "Ljava/io/Serializable;", "", "toByteArray", "", "toString", "", "other", "", "equals", "", "hashCode", "component1", "component2", "locationKey", "name", "copy", "a", "Ljava/lang/String;", "getLocationKey", "()Ljava/lang/String;", "b", "getName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class City implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String locationKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String name;

    public City(@NotNull String str, @NotNull String str2) {
        this.locationKey = str;
        this.name = str2;
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
    public final byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = this.locationKey;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        String str2 = this.name;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str2.getBytes(charset));
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public String toString() {
        return "City[locationKey:" + this.locationKey + ", name: " + this.name + JsonLexerKt.END_LIST;
    }
}
