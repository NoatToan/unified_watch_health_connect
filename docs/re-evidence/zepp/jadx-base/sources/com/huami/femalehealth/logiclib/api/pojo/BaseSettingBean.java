package com.huami.femalehealth.logiclib.api.pojo;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.loc.z;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bW\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 t2\u00020\u0001:\u0002utB£\u0001\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bn\u0010oB·\u0001\b\u0017\u0012\u0006\u0010p\u001a\u00020\u0019\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010r\u001a\u0004\u0018\u00010q¢\u0006\u0004\bn\u0010sJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000bJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0015HÆ\u0003J¬\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b*\u0010+J\t\u0010,\u001a\u00020\u0015HÖ\u0001J\t\u0010-\u001a\u00020\u0019HÖ\u0001J\u0013\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b5\u00106\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u00104R*\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u00101\u0012\u0004\b:\u00106\u001a\u0004\b8\u0010\u000b\"\u0004\b9\u00104R*\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b@\u00106\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010?R*\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bA\u00101\u0012\u0004\bD\u00106\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u00104R*\u0010!\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bE\u00101\u0012\u0004\bH\u00106\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u00104R*\u0010\"\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u00101\u0012\u0004\bL\u00106\u001a\u0004\bJ\u0010\u000b\"\u0004\bK\u00104R*\u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bM\u00101\u0012\u0004\bP\u00106\u001a\u0004\bN\u0010\u000b\"\u0004\bO\u00104R*\u0010$\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010<\u0012\u0004\bT\u00106\u001a\u0004\bR\u0010\u000f\"\u0004\bS\u0010?R*\u0010%\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\b[\u00106\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR*\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\\\u00101\u0012\u0004\b_\u00106\u001a\u0004\b]\u0010\u000b\"\u0004\b^\u00104R*\u0010'\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b`\u00101\u0012\u0004\bc\u00106\u001a\u0004\ba\u0010\u000b\"\u0004\bb\u00104R*\u0010(\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bd\u0010e\u0012\u0004\bi\u00106\u001a\u0004\bf\u0010\u001b\"\u0004\bg\u0010hR*\u0010)\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bj\u0010V\u0012\u0004\bm\u00106\u001a\u0004\bk\u0010X\"\u0004\bl\u0010Z¨\u0006v"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/BaseSettingBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "()Ljava/lang/Long;", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "component8", "", "component9", "component10", "component11", "", "component12", "()Ljava/lang/Integer;", "component13", "appBeforeMenstruationPush", "appBeforeOvulationPush", "appPush", "estimatedMenstrualDays", "firstTime", "hardwareBeforeMenstruationPush", "hardwareBeforeOvulationPush", "hardwarePush", "id", "intelligentPrediction", "lastMenstrualTime", "menstrualCycle", "userId", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huami/femalehealth/logiclib/api/pojo/BaseSettingBean;", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/Long;", "getAppBeforeMenstruationPush", "setAppBeforeMenstruationPush", "(Ljava/lang/Long;)V", "getAppBeforeMenstruationPush$annotations", "()V", "b", "getAppBeforeOvulationPush", "setAppBeforeOvulationPush", "getAppBeforeOvulationPush$annotations", "c", "Ljava/lang/Boolean;", "getAppPush", "setAppPush", "(Ljava/lang/Boolean;)V", "getAppPush$annotations", GoogleApiAvailabilityLight.a, "getEstimatedMenstrualDays", "setEstimatedMenstrualDays", "getEstimatedMenstrualDays$annotations", "e", "getFirstTime", "setFirstTime", "getFirstTime$annotations", "f", "getHardwareBeforeMenstruationPush", "setHardwareBeforeMenstruationPush", "getHardwareBeforeMenstruationPush$annotations", "g", "getHardwareBeforeOvulationPush", "setHardwareBeforeOvulationPush", "getHardwareBeforeOvulationPush$annotations", "h", "getHardwarePush", "setHardwarePush", "getHardwarePush$annotations", "i", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "getId$annotations", z.j, "getIntelligentPrediction", "setIntelligentPrediction", "getIntelligentPrediction$annotations", hl.k, "getLastMenstrualTime", "setLastMenstrualTime", "getLastMenstrualTime$annotations", "l", "Ljava/lang/Integer;", "getMenstrualCycle", "setMenstrualCycle", "(Ljava/lang/Integer;)V", "getMenstrualCycle$annotations", "m", "getUserId", "setUserId", "getUserId$annotations", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "logiclib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class BaseSettingBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Long appBeforeMenstruationPush;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Long appBeforeOvulationPush;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean appPush;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Long estimatedMenstrualDays;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Long firstTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Long hardwareBeforeMenstruationPush;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private Long hardwareBeforeOvulationPush;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean hardwarePush;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private String id;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private Long intelligentPrediction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private Long lastMenstrualTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer menstrualCycle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/BaseSettingBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/femalehealth/logiclib/api/pojo/BaseSettingBean;", "serializer", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<BaseSettingBean> serializer() {
            return BaseSettingBean$$serializer.INSTANCE;
        }
    }

    public BaseSettingBean() {
        this((Long) null, (Long) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Boolean) null, (String) null, (Long) null, (Long) null, (Integer) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BaseSettingBean(int i, @SerialName("appBeforeMenstruationPush") Long l, @SerialName("appBeforeOvulationPush") Long l2, @SerialName("appPush") Boolean bool, @SerialName("estimatedMenstrualDays") Long l3, @SerialName("firstTime") Long l4, @SerialName("hardwareBeforeMenstruationPush") Long l5, @SerialName("hardwareBeforeOvulationPush") Long l6, @SerialName("hardwarePush") Boolean bool2, @SerialName("id") String str, @SerialName("intelligentPrediction") Long l7, @SerialName("lastMenstrualTime") Long l8, @SerialName("menstrualCycle") Integer num, @SerialName("userId") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, BaseSettingBean$$serializer.INSTANCE.getDescriptor());
        }
        this.appBeforeMenstruationPush = (i & 1) == 0 ? 0L : l;
        this.appBeforeOvulationPush = (i & 2) == 0 ? 0L : l2;
        this.appPush = (i & 4) == 0 ? Boolean.TRUE : bool;
        this.estimatedMenstrualDays = (i & 8) == 0 ? 0L : l3;
        this.firstTime = (i & 16) == 0 ? 0L : l4;
        this.hardwareBeforeMenstruationPush = (i & 32) == 0 ? 0L : l5;
        this.hardwareBeforeOvulationPush = (i & 64) == 0 ? 0L : l6;
        this.hardwarePush = (i & 128) == 0 ? Boolean.TRUE : bool2;
        if ((i & 256) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.intelligentPrediction = (i & 512) == 0 ? 0L : l7;
        this.lastMenstrualTime = (i & 1024) == 0 ? 0L : l8;
        this.menstrualCycle = (i & 2048) == 0 ? 0 : num;
        if ((i & 4096) == 0) {
            this.userId = null;
        } else {
            this.userId = str2;
        }
    }

    @SerialName("appBeforeMenstruationPush")
    public static /* synthetic */ void getAppBeforeMenstruationPush$annotations() {
    }

    @SerialName("appBeforeOvulationPush")
    public static /* synthetic */ void getAppBeforeOvulationPush$annotations() {
    }

    @SerialName("appPush")
    public static /* synthetic */ void getAppPush$annotations() {
    }

    @SerialName("estimatedMenstrualDays")
    public static /* synthetic */ void getEstimatedMenstrualDays$annotations() {
    }

    @SerialName("firstTime")
    public static /* synthetic */ void getFirstTime$annotations() {
    }

    @SerialName("hardwareBeforeMenstruationPush")
    public static /* synthetic */ void getHardwareBeforeMenstruationPush$annotations() {
    }

    @SerialName("hardwareBeforeOvulationPush")
    public static /* synthetic */ void getHardwareBeforeOvulationPush$annotations() {
    }

    @SerialName("hardwarePush")
    public static /* synthetic */ void getHardwarePush$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("intelligentPrediction")
    public static /* synthetic */ void getIntelligentPrediction$annotations() {
    }

    @SerialName("lastMenstrualTime")
    public static /* synthetic */ void getLastMenstrualTime$annotations() {
    }

    @SerialName("menstrualCycle")
    public static /* synthetic */ void getMenstrualCycle$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull BaseSettingBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Integer num;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || (l = self.appBeforeMenstruationPush) == null || l.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.appBeforeMenstruationPush);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (l2 = self.appBeforeOvulationPush) == null || l2.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.appBeforeOvulationPush);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.appPush, Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.appPush);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || (l3 = self.estimatedMenstrualDays) == null || l3.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.estimatedMenstrualDays);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || (l4 = self.firstTime) == null || l4.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 4, LongSerializer.INSTANCE, self.firstTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || (l5 = self.hardwareBeforeMenstruationPush) == null || l5.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.hardwareBeforeMenstruationPush);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || (l6 = self.hardwareBeforeOvulationPush) == null || l6.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 6, LongSerializer.INSTANCE, self.hardwareBeforeOvulationPush);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.hardwarePush, Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.hardwarePush);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || (l7 = self.intelligentPrediction) == null || l7.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 9, LongSerializer.INSTANCE, self.intelligentPrediction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || (l8 = self.lastMenstrualTime) == null || l8.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 10, LongSerializer.INSTANCE, self.lastMenstrualTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || (num = self.menstrualCycle) == null || num.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.menstrualCycle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.userId != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.userId);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getAppBeforeMenstruationPush() {
        return this.appBeforeMenstruationPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getIntelligentPrediction() {
        return this.intelligentPrediction;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getLastMenstrualTime() {
        return this.lastMenstrualTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getMenstrualCycle() {
        return this.menstrualCycle;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getAppBeforeOvulationPush() {
        return this.appBeforeOvulationPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getAppPush() {
        return this.appPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getEstimatedMenstrualDays() {
        return this.estimatedMenstrualDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getFirstTime() {
        return this.firstTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getHardwareBeforeMenstruationPush() {
        return this.hardwareBeforeMenstruationPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getHardwareBeforeOvulationPush() {
        return this.hardwareBeforeOvulationPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getHardwarePush() {
        return this.hardwarePush;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final BaseSettingBean copy(@Nullable Long appBeforeMenstruationPush, @Nullable Long appBeforeOvulationPush, @Nullable Boolean appPush, @Nullable Long estimatedMenstrualDays, @Nullable Long firstTime, @Nullable Long hardwareBeforeMenstruationPush, @Nullable Long hardwareBeforeOvulationPush, @Nullable Boolean hardwarePush, @Nullable String id, @Nullable Long intelligentPrediction, @Nullable Long lastMenstrualTime, @Nullable Integer menstrualCycle, @Nullable String userId) {
        return new BaseSettingBean(appBeforeMenstruationPush, appBeforeOvulationPush, appPush, estimatedMenstrualDays, firstTime, hardwareBeforeMenstruationPush, hardwareBeforeOvulationPush, hardwarePush, id, intelligentPrediction, lastMenstrualTime, menstrualCycle, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseSettingBean)) {
            return false;
        }
        BaseSettingBean baseSettingBean = (BaseSettingBean) other;
        return Intrinsics.areEqual(this.appBeforeMenstruationPush, baseSettingBean.appBeforeMenstruationPush) && Intrinsics.areEqual(this.appBeforeOvulationPush, baseSettingBean.appBeforeOvulationPush) && Intrinsics.areEqual(this.appPush, baseSettingBean.appPush) && Intrinsics.areEqual(this.estimatedMenstrualDays, baseSettingBean.estimatedMenstrualDays) && Intrinsics.areEqual(this.firstTime, baseSettingBean.firstTime) && Intrinsics.areEqual(this.hardwareBeforeMenstruationPush, baseSettingBean.hardwareBeforeMenstruationPush) && Intrinsics.areEqual(this.hardwareBeforeOvulationPush, baseSettingBean.hardwareBeforeOvulationPush) && Intrinsics.areEqual(this.hardwarePush, baseSettingBean.hardwarePush) && Intrinsics.areEqual(this.id, baseSettingBean.id) && Intrinsics.areEqual(this.intelligentPrediction, baseSettingBean.intelligentPrediction) && Intrinsics.areEqual(this.lastMenstrualTime, baseSettingBean.lastMenstrualTime) && Intrinsics.areEqual(this.menstrualCycle, baseSettingBean.menstrualCycle) && Intrinsics.areEqual(this.userId, baseSettingBean.userId);
    }

    @Nullable
    public final Long getAppBeforeMenstruationPush() {
        return this.appBeforeMenstruationPush;
    }

    @Nullable
    public final Long getAppBeforeOvulationPush() {
        return this.appBeforeOvulationPush;
    }

    @Nullable
    public final Boolean getAppPush() {
        return this.appPush;
    }

    @Nullable
    public final Long getEstimatedMenstrualDays() {
        return this.estimatedMenstrualDays;
    }

    @Nullable
    public final Long getFirstTime() {
        return this.firstTime;
    }

    @Nullable
    public final Long getHardwareBeforeMenstruationPush() {
        return this.hardwareBeforeMenstruationPush;
    }

    @Nullable
    public final Long getHardwareBeforeOvulationPush() {
        return this.hardwareBeforeOvulationPush;
    }

    @Nullable
    public final Boolean getHardwarePush() {
        return this.hardwarePush;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getIntelligentPrediction() {
        return this.intelligentPrediction;
    }

    @Nullable
    public final Long getLastMenstrualTime() {
        return this.lastMenstrualTime;
    }

    @Nullable
    public final Integer getMenstrualCycle() {
        return this.menstrualCycle;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Long l = this.appBeforeMenstruationPush;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.appBeforeOvulationPush;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.appPush;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l3 = this.estimatedMenstrualDays;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.firstTime;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.hardwareBeforeMenstruationPush;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.hardwareBeforeOvulationPush;
        int iHashCode7 = (iHashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool2 = this.hardwarePush;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.id;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.intelligentPrediction;
        int iHashCode10 = (iHashCode9 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.lastMenstrualTime;
        int iHashCode11 = (iHashCode10 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Integer num = this.menstrualCycle;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.userId;
        return iHashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAppBeforeMenstruationPush(@Nullable Long l) {
        this.appBeforeMenstruationPush = l;
    }

    public final void setAppBeforeOvulationPush(@Nullable Long l) {
        this.appBeforeOvulationPush = l;
    }

    public final void setAppPush(@Nullable Boolean bool) {
        this.appPush = bool;
    }

    public final void setEstimatedMenstrualDays(@Nullable Long l) {
        this.estimatedMenstrualDays = l;
    }

    public final void setFirstTime(@Nullable Long l) {
        this.firstTime = l;
    }

    public final void setHardwareBeforeMenstruationPush(@Nullable Long l) {
        this.hardwareBeforeMenstruationPush = l;
    }

    public final void setHardwareBeforeOvulationPush(@Nullable Long l) {
        this.hardwareBeforeOvulationPush = l;
    }

    public final void setHardwarePush(@Nullable Boolean bool) {
        this.hardwarePush = bool;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setIntelligentPrediction(@Nullable Long l) {
        this.intelligentPrediction = l;
    }

    public final void setLastMenstrualTime(@Nullable Long l) {
        this.lastMenstrualTime = l;
    }

    public final void setMenstrualCycle(@Nullable Integer num) {
        this.menstrualCycle = num;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "BaseSettingBean(appBeforeMenstruationPush=" + this.appBeforeMenstruationPush + ", appBeforeOvulationPush=" + this.appBeforeOvulationPush + ", appPush=" + this.appPush + ", estimatedMenstrualDays=" + this.estimatedMenstrualDays + ", firstTime=" + this.firstTime + ", hardwareBeforeMenstruationPush=" + this.hardwareBeforeMenstruationPush + ", hardwareBeforeOvulationPush=" + this.hardwareBeforeOvulationPush + ", hardwarePush=" + this.hardwarePush + ", id=" + ((Object) this.id) + ", intelligentPrediction=" + this.intelligentPrediction + ", lastMenstrualTime=" + this.lastMenstrualTime + ", menstrualCycle=" + this.menstrualCycle + ", userId=" + ((Object) this.userId) + ')';
    }

    public BaseSettingBean(@Nullable Long l, @Nullable Long l2, @Nullable Boolean bool, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6, @Nullable Boolean bool2, @Nullable String str, @Nullable Long l7, @Nullable Long l8, @Nullable Integer num, @Nullable String str2) {
        this.appBeforeMenstruationPush = l;
        this.appBeforeOvulationPush = l2;
        this.appPush = bool;
        this.estimatedMenstrualDays = l3;
        this.firstTime = l4;
        this.hardwareBeforeMenstruationPush = l5;
        this.hardwareBeforeOvulationPush = l6;
        this.hardwarePush = bool2;
        this.id = str;
        this.intelligentPrediction = l7;
        this.lastMenstrualTime = l8;
        this.menstrualCycle = num;
        this.userId = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseSettingBean(Long l, Long l2, Boolean bool, Long l3, Long l4, Long l5, Long l6, Boolean bool2, String str, Long l7, Long l8, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l9 = 0L;
        this((i & 1) != 0 ? l9 : l, (i & 2) != 0 ? l9 : l2, (i & 4) != 0 ? Boolean.TRUE : bool, (i & 8) != 0 ? l9 : l3, (i & 16) != 0 ? l9 : l4, (i & 32) != 0 ? l9 : l5, (i & 64) != 0 ? l9 : l6, (i & 128) != 0 ? Boolean.TRUE : bool2, (i & 256) != 0 ? null : str, (i & 512) != 0 ? l9 : l7, (i & 1024) == 0 ? l8 : 0L, (i & 2048) != 0 ? 0 : num, (i & 4096) == 0 ? str2 : null);
    }
}
