package com.xiaomi.hm.health.healthdata.api.pojo;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 k2\u00020\u0001:\u0002lkB¯\u0001\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010,\u001a\u00020\t¢\u0006\u0004\be\u0010fB¯\u0001\b\u0017\u0012\u0006\u0010g\u001a\u00020\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010(\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010\t\u0012\b\u0010i\u001a\u0004\u0018\u00010h¢\u0006\u0004\be\u0010jJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J¸\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010,\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b-\u0010.J\t\u0010/\u001a\u00020\tHÖ\u0001J\t\u00100\u001a\u00020\u0011HÖ\u0001J\u0013\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u001e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010 \u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R\u0019\u0010!\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u0019\u0010\"\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b@\u00105\u001a\u0004\bA\u00107R\u001b\u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u00107R*\u0010$\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bI\u0010J\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010HR$\u0010%\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010\u0013\"\u0004\bM\u0010HR$\u0010&\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010\u0017\"\u0004\bQ\u0010RR$\u0010'\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010E\u001a\u0004\bT\u0010\u0013\"\u0004\bU\u0010HR$\u0010(\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u00105\u001a\u0004\bW\u00107\"\u0004\bX\u0010YR$\u0010)\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010E\u001a\u0004\b[\u0010\u0013\"\u0004\b\\\u0010HR$\u0010*\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u00105\u001a\u0004\b^\u00107\"\u0004\b_\u0010YR$\u0010+\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u00105\u001a\u0004\ba\u00107\"\u0004\bb\u0010YR\u0019\u0010,\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\bc\u00105\u001a\u0004\bd\u00107¨\u0006m"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Integer;", "component8", "", "component9", "()Ljava/lang/Float;", "component10", "component11", "component12", "component13", "component14", "component15", "eventType", "lastUpdateTime", "subType", "timestamp", "userId", "extra", "odTimes", HMFwOnlineAnalyticsKt.COST, "odi", "deviceSource", "date", "valid", "deviceId", "sn", "appName", "copy", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "b", "J", "getLastUpdateTime", "()J", "c", "getSubType", GoogleApiAvailabilityLight.a, "getTimestamp", "e", "getUserId", "f", "getExtra", "g", "Ljava/lang/Integer;", "getOdTimes", "setOdTimes", "(Ljava/lang/Integer;)V", "getOdTimes$annotations", "()V", "h", "getCost", "setCost", "i", "Ljava/lang/Float;", "getOdi", "setOdi", "(Ljava/lang/Float;)V", z.j, "getDeviceSource", "setDeviceSource", hl.k, "getDate", "setDate", "(Ljava/lang/String;)V", "l", "getValid", "setValid", "m", "getDeviceId", "setDeviceId", GoogleApiAvailabilityLight.b, "getSn", "setSn", "o", "getAppName", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class UserEventsItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long lastUpdateTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String extra;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer odTimes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer cost;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private Float odi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer deviceSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private String date;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer valid;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private String deviceId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private String sn;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem;", "serializer", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<UserEventsItem> serializer() {
            return UserEventsItem$$serializer.INSTANCE;
        }
    }

    public UserEventsItem() {
        this((String) null, 0L, (String) null, 0L, (String) null, (String) null, (Integer) null, (Integer) null, (Float) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ UserEventsItem(int i, String str, long j, String str2, long j2, String str3, String str4, @SerialName("odiNum") Integer num, Integer num2, Float f, Integer num3, String str5, Integer num4, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, UserEventsItem$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.eventType = "";
        } else {
            this.eventType = str;
        }
        if ((i & 2) == 0) {
            this.lastUpdateTime = 0L;
        } else {
            this.lastUpdateTime = j;
        }
        if ((i & 4) == 0) {
            this.subType = "";
        } else {
            this.subType = str2;
        }
        this.timestamp = (i & 8) != 0 ? j2 : 0L;
        if ((i & 16) == 0) {
            this.userId = "";
        } else {
            this.userId = str3;
        }
        if ((i & 32) == 0) {
            this.extra = null;
        } else {
            this.extra = str4;
        }
        if ((i & 64) == 0) {
            this.odTimes = null;
        } else {
            this.odTimes = num;
        }
        if ((i & 128) == 0) {
            this.cost = null;
        } else {
            this.cost = num2;
        }
        if ((i & 256) == 0) {
            this.odi = null;
        } else {
            this.odi = f;
        }
        if ((i & 512) == 0) {
            this.deviceSource = null;
        } else {
            this.deviceSource = num3;
        }
        if ((i & 1024) == 0) {
            this.date = null;
        } else {
            this.date = str5;
        }
        if ((i & 2048) == 0) {
            this.valid = null;
        } else {
            this.valid = num4;
        }
        if ((i & 4096) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = str6;
        }
        if ((i & 8192) == 0) {
            this.sn = null;
        } else {
            this.sn = str7;
        }
        this.appName = (i & 16384) == 0 ? "com.huami.midong" : str8;
    }

    @SerialName("odiNum")
    public static /* synthetic */ void getOdTimes$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull UserEventsItem self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.eventType, "")) {
            output.encodeStringElement(serialDesc, 0, self.eventType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.lastUpdateTime != 0) {
            output.encodeLongElement(serialDesc, 1, self.lastUpdateTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.subType, "")) {
            output.encodeStringElement(serialDesc, 2, self.subType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.timestamp != 0) {
            output.encodeLongElement(serialDesc, 3, self.timestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.userId, "")) {
            output.encodeStringElement(serialDesc, 4, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.extra != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.extra);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.odTimes != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.odTimes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.cost != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.cost);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.odi != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, FloatSerializer.INSTANCE, self.odi);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.deviceSource != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.deviceSource);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.date != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.date);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.valid != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.valid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.deviceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.deviceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.sn != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.sn);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || !Intrinsics.areEqual(self.appName, "com.huami.midong")) {
            output.encodeStringElement(serialDesc, 14, self.appName);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getValid() {
        return this.valid;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getOdTimes() {
        return this.odTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getCost() {
        return this.cost;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Float getOdi() {
        return this.odi;
    }

    @NotNull
    public final UserEventsItem copy(@NotNull String eventType, long lastUpdateTime, @NotNull String subType, long timestamp, @NotNull String userId, @Nullable String extra, @Nullable Integer odTimes, @Nullable Integer cost, @Nullable Float odi, @Nullable Integer deviceSource, @Nullable String date, @Nullable Integer valid, @Nullable String deviceId, @Nullable String sn, @NotNull String appName) {
        return new UserEventsItem(eventType, lastUpdateTime, subType, timestamp, userId, extra, odTimes, cost, odi, deviceSource, date, valid, deviceId, sn, appName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEventsItem)) {
            return false;
        }
        UserEventsItem userEventsItem = (UserEventsItem) other;
        return Intrinsics.areEqual(this.eventType, userEventsItem.eventType) && this.lastUpdateTime == userEventsItem.lastUpdateTime && Intrinsics.areEqual(this.subType, userEventsItem.subType) && this.timestamp == userEventsItem.timestamp && Intrinsics.areEqual(this.userId, userEventsItem.userId) && Intrinsics.areEqual(this.extra, userEventsItem.extra) && Intrinsics.areEqual(this.odTimes, userEventsItem.odTimes) && Intrinsics.areEqual(this.cost, userEventsItem.cost) && Intrinsics.areEqual((Object) this.odi, (Object) userEventsItem.odi) && Intrinsics.areEqual(this.deviceSource, userEventsItem.deviceSource) && Intrinsics.areEqual(this.date, userEventsItem.date) && Intrinsics.areEqual(this.valid, userEventsItem.valid) && Intrinsics.areEqual(this.deviceId, userEventsItem.deviceId) && Intrinsics.areEqual(this.sn, userEventsItem.sn) && Intrinsics.areEqual(this.appName, userEventsItem.appName);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final Integer getCost() {
        return this.cost;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Nullable
    public final Integer getOdTimes() {
        return this.odTimes;
    }

    @Nullable
    public final Float getOdi() {
        return this.odi;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final Integer getValid() {
        return this.valid;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.eventType.hashCode() * 31) + b.a(this.lastUpdateTime)) * 31) + this.subType.hashCode()) * 31) + b.a(this.timestamp)) * 31) + this.userId.hashCode()) * 31;
        String str = this.extra;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.odTimes;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cost;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.odi;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num3 = this.deviceSource;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.date;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.valid;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.deviceId;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sn;
        return ((iHashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.appName.hashCode();
    }

    public final void setCost(@Nullable Integer num) {
        this.cost = num;
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setDeviceId(@Nullable String str) {
        this.deviceId = str;
    }

    public final void setDeviceSource(@Nullable Integer num) {
        this.deviceSource = num;
    }

    public final void setOdTimes(@Nullable Integer num) {
        this.odTimes = num;
    }

    public final void setOdi(@Nullable Float f) {
        this.odi = f;
    }

    public final void setSn(@Nullable String str) {
        this.sn = str;
    }

    public final void setValid(@Nullable Integer num) {
        this.valid = num;
    }

    @NotNull
    public String toString() {
        return "UserEventsItem(eventType=" + this.eventType + ", lastUpdateTime=" + this.lastUpdateTime + ", subType=" + this.subType + ", timestamp=" + this.timestamp + ", userId=" + this.userId + ", extra=" + this.extra + ", odTimes=" + this.odTimes + ", cost=" + this.cost + ", odi=" + this.odi + ", deviceSource=" + this.deviceSource + ", date=" + this.date + ", valid=" + this.valid + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", appName=" + this.appName + ")";
    }

    public UserEventsItem(@NotNull String str, long j, @NotNull String str2, long j2, @NotNull String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f, @Nullable Integer num3, @Nullable String str5, @Nullable Integer num4, @Nullable String str6, @Nullable String str7, @NotNull String str8) {
        this.eventType = str;
        this.lastUpdateTime = j;
        this.subType = str2;
        this.timestamp = j2;
        this.userId = str3;
        this.extra = str4;
        this.odTimes = num;
        this.cost = num2;
        this.odi = f;
        this.deviceSource = num3;
        this.date = str5;
        this.valid = num4;
        this.deviceId = str6;
        this.sn = str7;
        this.appName = str8;
    }

    public /* synthetic */ UserEventsItem(String str, long j, String str2, long j2, String str3, String str4, Integer num, Integer num2, Float f, Integer num3, String str5, Integer num4, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? j2 : 0L, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? "com.huami.midong" : str8);
    }
}
