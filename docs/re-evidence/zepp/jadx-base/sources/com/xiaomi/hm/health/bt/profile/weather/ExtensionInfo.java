package com.xiaomi.hm.health.bt.profile.weather;

import com.alipay.sdk.m.n.a;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,BC\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u0011\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0012\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u0013\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001d¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/ExtensionInfo;", "Ljava/io/Serializable;", "", "toString", "", "toByteArray", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "uvi", "humidity", "windLevel", "windDirection", "pm25", "pm10", "copy", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getUvi", "()I", "b", "getHumidity", "c", "getWindLevel", GoogleApiAvailabilityLight.a, "F", "getWindDirection", "()F", "e", "getPm25", "f", "getPm10", "<init>", "(IIIFII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ExtensionInfo implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int uvi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int humidity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int windLevel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float windDirection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int pm25;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int pm10;

    public ExtensionInfo() {
        this(0, 0, 0, 0.0f, 0, 0, 63, null);
    }

    public ExtensionInfo(int i, int i2, int i3, float f, int i4, int i5) {
        this.uvi = i;
        this.humidity = i2;
        this.windLevel = i3;
        this.windDirection = f;
        this.pm25 = i4;
        this.pm10 = i5;
    }

    public static /* synthetic */ ExtensionInfo copy$default(ExtensionInfo extensionInfo, int i, int i2, int i3, float f, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = extensionInfo.uvi;
        }
        if ((i6 & 2) != 0) {
            i2 = extensionInfo.humidity;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = extensionInfo.windLevel;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            f = extensionInfo.windDirection;
        }
        float f2 = f;
        if ((i6 & 16) != 0) {
            i4 = extensionInfo.pm25;
        }
        int i9 = i4;
        if ((i6 & 32) != 0) {
            i5 = extensionInfo.pm10;
        }
        return extensionInfo.copy(i, i7, i8, f2, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUvi() {
        return this.uvi;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHumidity() {
        return this.humidity;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWindLevel() {
        return this.windLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWindDirection() {
        return this.windDirection;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPm25() {
        return this.pm25;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPm10() {
        return this.pm10;
    }

    @NotNull
    public final ExtensionInfo copy(int uvi, int humidity, int windLevel, float windDirection, int pm25, int pm10) {
        return new ExtensionInfo(uvi, humidity, windLevel, windDirection, pm25, pm10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtensionInfo)) {
            return false;
        }
        ExtensionInfo extensionInfo = (ExtensionInfo) other;
        return this.uvi == extensionInfo.uvi && this.humidity == extensionInfo.humidity && this.windLevel == extensionInfo.windLevel && Intrinsics.areEqual((Object) Float.valueOf(this.windDirection), (Object) Float.valueOf(extensionInfo.windDirection)) && this.pm25 == extensionInfo.pm25 && this.pm10 == extensionInfo.pm10;
    }

    public final int getHumidity() {
        return this.humidity;
    }

    public final int getPm10() {
        return this.pm10;
    }

    public final int getPm25() {
        return this.pm25;
    }

    public final int getUvi() {
        return this.uvi;
    }

    public final float getWindDirection() {
        return this.windDirection;
    }

    public final int getWindLevel() {
        return this.windLevel;
    }

    public int hashCode() {
        return (((((((((this.uvi * 31) + this.humidity) * 31) + this.windLevel) * 31) + Float.floatToIntBits(this.windDirection)) * 31) + this.pm25) * 31) + this.pm10;
    }

    @Nullable
    public final byte[] toByteArray() throws IOException {
        int i = 0;
        int i2 = this.uvi != -1 ? 1 : 0;
        if (this.humidity != -1) {
            i2 += 2;
        }
        if (this.windLevel != -1) {
            i2 += 4;
        }
        if (!(this.windDirection == -1.0f)) {
            i2 += 8;
        }
        if (this.pm25 != -1) {
            i2 += 16;
        }
        if (this.pm10 != -1) {
            i2 += 32;
        }
        if (i2 == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(a.g);
            byteArrayOutputStream.write(GattUtils.intToBytes(i2));
            while (true) {
                int i3 = i + 1;
                if (((i2 >> i) & 1) == 1) {
                    if (i == 0) {
                        byteArrayOutputStream.write(GattUtils.numberToBytes(this.uvi, 1));
                    } else if (i == 1) {
                        byteArrayOutputStream.write(GattUtils.numberToBytes(this.humidity, 1));
                    } else if (i == 2) {
                        byteArrayOutputStream.write(GattUtils.numberToBytes(this.windLevel, 1));
                    } else if (i == 3) {
                        byteArrayOutputStream.write(GattUtils.numberToBytes((long) (this.windDirection * 10), 2));
                    } else if (i == 4) {
                        byteArrayOutputStream.write(GattUtils.numberToBytes(this.pm25, 2));
                    } else if (i == 5) {
                        byteArrayOutputStream.write(GattUtils.numberToBytes(this.pm10, 2));
                    }
                }
                if (i3 >= 6) {
                    return byteArrayOutputStream.toByteArray();
                }
                i = i3;
            }
        } catch (Exception e) {
            Debug.fi("ExtensionInfo", Intrinsics.stringPlus("exception: ", e));
            return null;
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @NotNull
    public String toString() {
        return "\n            ExtensionInfo[\n            uvi: " + this.uvi + ", \n            humidity: " + this.humidity + ", \n            windLevel: " + this.windLevel + ", \n            windDirection: " + this.windDirection + ",\n            pm25: " + this.pm25 + ",\n            pm10: " + this.pm10 + JsonLexerKt.END_LIST;
    }

    public /* synthetic */ ExtensionInfo(int i, int i2, int i3, float f, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? -1 : i, (i6 & 2) != 0 ? -1 : i2, (i6 & 4) != 0 ? -1 : i3, (i6 & 8) != 0 ? -1.0f : f, (i6 & 16) != 0 ? -1 : i4, (i6 & 32) != 0 ? -1 : i5);
    }
}
