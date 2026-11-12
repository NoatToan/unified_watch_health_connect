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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 q2\u00020\u0001:\u0002rqB\u0089\u0001\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010#\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010\f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010&\u001a\u0004\u0018\u00010\f\u0012\b\u0010'\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bk\u0010lB·\u0001\b\u0017\u0012\u0006\u0010m\u001a\u00020+\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\f\u0012\b\u0010o\u001a\u0004\u0018\u00010n¢\u0006\u0004\bk\u0010pJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000eJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000eJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000eJ¬\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020+HÖ\u0001J\u0013\u0010.\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u00106\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u00100\u0012\u0004\b:\u00106\u001a\u0004\b8\u00102\"\u0004\b9\u00104R*\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b@\u00106\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010?R*\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bA\u0010<\u0012\u0004\bD\u00106\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010?R*\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bE\u0010<\u0012\u0004\bH\u00106\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010?R*\u0010 \u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u0010<\u0012\u0004\bL\u00106\u001a\u0004\bJ\u0010\u000e\"\u0004\bK\u0010?R*\u0010!\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bM\u0010<\u0012\u0004\bP\u00106\u001a\u0004\bN\u0010\u000e\"\u0004\bO\u0010?R*\u0010\"\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bV\u00106\u001a\u0004\bS\u0010\u0015\"\u0004\bT\u0010UR*\u0010#\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bW\u0010<\u0012\u0004\bZ\u00106\u001a\u0004\bX\u0010\u000e\"\u0004\bY\u0010?R*\u0010$\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b[\u0010<\u0012\u0004\b^\u00106\u001a\u0004\b\\\u0010\u000e\"\u0004\b]\u0010?R*\u0010%\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b_\u0010R\u0012\u0004\bb\u00106\u001a\u0004\b`\u0010\u0015\"\u0004\ba\u0010UR*\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bc\u0010<\u0012\u0004\bf\u00106\u001a\u0004\bd\u0010\u000e\"\u0004\be\u0010?R*\u0010'\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bg\u0010<\u0012\u0004\bj\u00106\u001a\u0004\bh\u0010\u000e\"\u0004\bi\u0010?¨\u0006s"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "component7", "", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "component12", "component13", "id", "userId", "firstTime", "estimatedMenstrualDays", "menstrualCycle", "lastMenstrualTime", "intelligentPrediction", "appPush", "appBeforeMenstruationPush", "appBeforeOvulationPush", "hardwarePush", "hardwareBeforeMenstruationPush", "hardwareBeforeOvulationPush", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean;", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "getId$annotations", "()V", "b", "getUserId", "setUserId", "getUserId$annotations", "c", "Ljava/lang/Long;", "getFirstTime", "setFirstTime", "(Ljava/lang/Long;)V", "getFirstTime$annotations", GoogleApiAvailabilityLight.a, "getEstimatedMenstrualDays", "setEstimatedMenstrualDays", "getEstimatedMenstrualDays$annotations", "e", "getMenstrualCycle", "setMenstrualCycle", "getMenstrualCycle$annotations", "f", "getLastMenstrualTime", "setLastMenstrualTime", "getLastMenstrualTime$annotations", "g", "getIntelligentPrediction", "setIntelligentPrediction", "getIntelligentPrediction$annotations", "h", "Ljava/lang/Boolean;", "getAppPush", "setAppPush", "(Ljava/lang/Boolean;)V", "getAppPush$annotations", "i", "getAppBeforeMenstruationPush", "setAppBeforeMenstruationPush", "getAppBeforeMenstruationPush$annotations", z.j, "getAppBeforeOvulationPush", "setAppBeforeOvulationPush", "getAppBeforeOvulationPush$annotations", hl.k, "getHardwarePush", "setHardwarePush", "getHardwarePush$annotations", "l", "getHardwareBeforeMenstruationPush", "setHardwareBeforeMenstruationPush", "getHardwareBeforeMenstruationPush$annotations", "m", "getHardwareBeforeOvulationPush", "setHardwareBeforeOvulationPush", "getHardwareBeforeOvulationPush$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "logiclib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class FirstUseInfoBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Long firstTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Long estimatedMenstrualDays;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Long menstrualCycle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Long lastMenstrualTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private Long intelligentPrediction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean appPush;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private Long appBeforeMenstruationPush;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private Long appBeforeOvulationPush;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean hardwarePush;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private Long hardwareBeforeMenstruationPush;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private Long hardwareBeforeOvulationPush;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean;", "serializer", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<FirstUseInfoBean> serializer() {
            return FirstUseInfoBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FirstUseInfoBean(int i, @SerialName("id") String str, @SerialName("userId") String str2, @SerialName("firstTime") Long l, @SerialName("estimatedMenstrualDays") Long l2, @SerialName("menstrualCycle") Long l3, @SerialName("lastMenstrualTime") Long l4, @SerialName("intelligentPrediction") Long l5, @SerialName("appPush") Boolean bool, @SerialName("appBeforeMenstruationPush") Long l6, @SerialName("appBeforeOvulationPush") Long l7, @SerialName("hardwarePush") Boolean bool2, @SerialName("hardwareBeforeMenstruationPush") Long l8, @SerialName("hardwareBeforeOvulationPush") Long l9, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8191, FirstUseInfoBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.userId = str2;
        this.firstTime = l;
        this.estimatedMenstrualDays = l2;
        this.menstrualCycle = l3;
        this.lastMenstrualTime = l4;
        this.intelligentPrediction = l5;
        this.appPush = bool;
        this.appBeforeMenstruationPush = l6;
        this.appBeforeOvulationPush = l7;
        this.hardwarePush = bool2;
        this.hardwareBeforeMenstruationPush = l8;
        this.hardwareBeforeOvulationPush = l9;
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
    public static final void write$Self(@NotNull FirstUseInfoBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.userId);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, longSerializer, self.firstTime);
        output.encodeNullableSerializableElement(serialDesc, 3, longSerializer, self.estimatedMenstrualDays);
        output.encodeNullableSerializableElement(serialDesc, 4, longSerializer, self.menstrualCycle);
        output.encodeNullableSerializableElement(serialDesc, 5, longSerializer, self.lastMenstrualTime);
        output.encodeNullableSerializableElement(serialDesc, 6, longSerializer, self.intelligentPrediction);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 7, booleanSerializer, self.appPush);
        output.encodeNullableSerializableElement(serialDesc, 8, longSerializer, self.appBeforeMenstruationPush);
        output.encodeNullableSerializableElement(serialDesc, 9, longSerializer, self.appBeforeOvulationPush);
        output.encodeNullableSerializableElement(serialDesc, 10, booleanSerializer, self.hardwarePush);
        output.encodeNullableSerializableElement(serialDesc, 11, longSerializer, self.hardwareBeforeMenstruationPush);
        output.encodeNullableSerializableElement(serialDesc, 12, longSerializer, self.hardwareBeforeOvulationPush);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getAppBeforeOvulationPush() {
        return this.appBeforeOvulationPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getHardwarePush() {
        return this.hardwarePush;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getHardwareBeforeMenstruationPush() {
        return this.hardwareBeforeMenstruationPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getHardwareBeforeOvulationPush() {
        return this.hardwareBeforeOvulationPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getFirstTime() {
        return this.firstTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getEstimatedMenstrualDays() {
        return this.estimatedMenstrualDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getMenstrualCycle() {
        return this.menstrualCycle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getLastMenstrualTime() {
        return this.lastMenstrualTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getIntelligentPrediction() {
        return this.intelligentPrediction;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getAppPush() {
        return this.appPush;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getAppBeforeMenstruationPush() {
        return this.appBeforeMenstruationPush;
    }

    @NotNull
    public final FirstUseInfoBean copy(@Nullable String id, @Nullable String userId, @Nullable Long firstTime, @Nullable Long estimatedMenstrualDays, @Nullable Long menstrualCycle, @Nullable Long lastMenstrualTime, @Nullable Long intelligentPrediction, @Nullable Boolean appPush, @Nullable Long appBeforeMenstruationPush, @Nullable Long appBeforeOvulationPush, @Nullable Boolean hardwarePush, @Nullable Long hardwareBeforeMenstruationPush, @Nullable Long hardwareBeforeOvulationPush) {
        return new FirstUseInfoBean(id, userId, firstTime, estimatedMenstrualDays, menstrualCycle, lastMenstrualTime, intelligentPrediction, appPush, appBeforeMenstruationPush, appBeforeOvulationPush, hardwarePush, hardwareBeforeMenstruationPush, hardwareBeforeOvulationPush);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstUseInfoBean)) {
            return false;
        }
        FirstUseInfoBean firstUseInfoBean = (FirstUseInfoBean) other;
        return Intrinsics.areEqual(this.id, firstUseInfoBean.id) && Intrinsics.areEqual(this.userId, firstUseInfoBean.userId) && Intrinsics.areEqual(this.firstTime, firstUseInfoBean.firstTime) && Intrinsics.areEqual(this.estimatedMenstrualDays, firstUseInfoBean.estimatedMenstrualDays) && Intrinsics.areEqual(this.menstrualCycle, firstUseInfoBean.menstrualCycle) && Intrinsics.areEqual(this.lastMenstrualTime, firstUseInfoBean.lastMenstrualTime) && Intrinsics.areEqual(this.intelligentPrediction, firstUseInfoBean.intelligentPrediction) && Intrinsics.areEqual(this.appPush, firstUseInfoBean.appPush) && Intrinsics.areEqual(this.appBeforeMenstruationPush, firstUseInfoBean.appBeforeMenstruationPush) && Intrinsics.areEqual(this.appBeforeOvulationPush, firstUseInfoBean.appBeforeOvulationPush) && Intrinsics.areEqual(this.hardwarePush, firstUseInfoBean.hardwarePush) && Intrinsics.areEqual(this.hardwareBeforeMenstruationPush, firstUseInfoBean.hardwareBeforeMenstruationPush) && Intrinsics.areEqual(this.hardwareBeforeOvulationPush, firstUseInfoBean.hardwareBeforeOvulationPush);
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
    public final Long getMenstrualCycle() {
        return this.menstrualCycle;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.firstTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.estimatedMenstrualDays;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.menstrualCycle;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.lastMenstrualTime;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.intelligentPrediction;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool = this.appPush;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l6 = this.appBeforeMenstruationPush;
        int iHashCode9 = (iHashCode8 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.appBeforeOvulationPush;
        int iHashCode10 = (iHashCode9 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Boolean bool2 = this.hardwarePush;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l8 = this.hardwareBeforeMenstruationPush;
        int iHashCode12 = (iHashCode11 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.hardwareBeforeOvulationPush;
        return iHashCode12 + (l9 != null ? l9.hashCode() : 0);
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

    public final void setMenstrualCycle(@Nullable Long l) {
        this.menstrualCycle = l;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "FirstUseInfoBean(id=" + ((Object) this.id) + ", userId=" + ((Object) this.userId) + ", firstTime=" + this.firstTime + ", estimatedMenstrualDays=" + this.estimatedMenstrualDays + ", menstrualCycle=" + this.menstrualCycle + ", lastMenstrualTime=" + this.lastMenstrualTime + ", intelligentPrediction=" + this.intelligentPrediction + ", appPush=" + this.appPush + ", appBeforeMenstruationPush=" + this.appBeforeMenstruationPush + ", appBeforeOvulationPush=" + this.appBeforeOvulationPush + ", hardwarePush=" + this.hardwarePush + ", hardwareBeforeMenstruationPush=" + this.hardwareBeforeMenstruationPush + ", hardwareBeforeOvulationPush=" + this.hardwareBeforeOvulationPush + ')';
    }

    public FirstUseInfoBean(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Boolean bool, @Nullable Long l6, @Nullable Long l7, @Nullable Boolean bool2, @Nullable Long l8, @Nullable Long l9) {
        this.id = str;
        this.userId = str2;
        this.firstTime = l;
        this.estimatedMenstrualDays = l2;
        this.menstrualCycle = l3;
        this.lastMenstrualTime = l4;
        this.intelligentPrediction = l5;
        this.appPush = bool;
        this.appBeforeMenstruationPush = l6;
        this.appBeforeOvulationPush = l7;
        this.hardwarePush = bool2;
        this.hardwareBeforeMenstruationPush = l8;
        this.hardwareBeforeOvulationPush = l9;
    }
}
