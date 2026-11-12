package com.xiaomi.hm.health.healthdata.core.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B?\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b2\u00103BS\b\u0017\u0012\u0006\u00104\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\rHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\rHÆ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001J\t\u0010\u001a\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0019\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0014\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0015\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u0019\u0010\u0017\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dto/PSpo2Dto;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "timeStamp", "deviceSource", "deviceId", "sn", "spo2", "appName", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimeStamp", "()J", "getTimeStamp$annotations", "()V", "b", LogUtil.I, "getDeviceSource", "()I", "c", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getSn", "e", "getSpo2", "f", "getAppName", "<init>", "(JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class PSpo2Dto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int spo2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dto/PSpo2Dto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/healthdata/core/dto/PSpo2Dto;", "serializer", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PSpo2Dto> serializer() {
            return PSpo2Dto$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PSpo2Dto(int i, @SerialName("timestamp") long j, int i2, String str, String str2, int i3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (17 != (i & 17)) {
            PluginExceptionsKt.throwMissingFieldException(i, 17, PSpo2Dto$$serializer.INSTANCE.getDescriptor());
        }
        this.timeStamp = j;
        if ((i & 2) == 0) {
            this.deviceSource = -1;
        } else {
            this.deviceSource = i2;
        }
        if ((i & 4) == 0) {
            this.deviceId = "";
        } else {
            this.deviceId = str;
        }
        if ((i & 8) == 0) {
            this.sn = "";
        } else {
            this.sn = str2;
        }
        this.spo2 = i3;
        if ((i & 32) == 0) {
            this.appName = "com.huami.midong";
        } else {
            this.appName = str3;
        }
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimeStamp$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull PSpo2Dto self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.timeStamp);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.deviceSource != -1) {
            output.encodeIntElement(serialDesc, 1, self.deviceSource);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.deviceId, "")) {
            output.encodeStringElement(serialDesc, 2, self.deviceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.sn, "")) {
            output.encodeStringElement(serialDesc, 3, self.sn);
        }
        output.encodeIntElement(serialDesc, 4, self.spo2);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.appName, "com.huami.midong")) {
            output.encodeStringElement(serialDesc, 5, self.appName);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSpo2() {
        return this.spo2;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final PSpo2Dto copy(long timeStamp, int deviceSource, @NotNull String deviceId, @NotNull String sn, int spo2, @NotNull String appName) {
        return new PSpo2Dto(timeStamp, deviceSource, deviceId, sn, spo2, appName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PSpo2Dto)) {
            return false;
        }
        PSpo2Dto pSpo2Dto = (PSpo2Dto) other;
        return this.timeStamp == pSpo2Dto.timeStamp && this.deviceSource == pSpo2Dto.deviceSource && Intrinsics.areEqual(this.deviceId, pSpo2Dto.deviceId) && Intrinsics.areEqual(this.sn, pSpo2Dto.sn) && this.spo2 == pSpo2Dto.spo2 && Intrinsics.areEqual(this.appName, pSpo2Dto.appName);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((((((((b.a(this.timeStamp) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.spo2) * 31) + this.appName.hashCode();
    }

    @NotNull
    public String toString() {
        return "PSpo2Dto(timeStamp=" + this.timeStamp + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", spo2=" + this.spo2 + ", appName=" + this.appName + ")";
    }

    public PSpo2Dto(long j, int i, @NotNull String str, @NotNull String str2, int i2, @NotNull String str3) {
        this.timeStamp = j;
        this.deviceSource = i;
        this.deviceId = str;
        this.sn = str2;
        this.spo2 = i2;
        this.appName = str3;
    }

    public /* synthetic */ PSpo2Dto(long j, int i, String str, String str2, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, i2, (i3 & 32) != 0 ? "com.huami.midong" : str3);
    }
}
