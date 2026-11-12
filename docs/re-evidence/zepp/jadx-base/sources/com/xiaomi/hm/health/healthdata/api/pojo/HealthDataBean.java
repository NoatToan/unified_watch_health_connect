package com.xiaomi.hm.health.healthdata.api.pojo;

import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.fitness.data.Field;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
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
import kotlinx.serialization.internal.StringSerializer;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\bb\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 }2\u00020\u0001:\u0002~}Bý\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bv\u0010wB\u0095\u0002\b\u0017\u0012\u0006\u0010y\u001a\u00020x\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\\\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010p\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\t\u0012\b\u0010{\u001a\u0004\u0018\u00010z¢\u0006\u0004\bv\u0010|J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001d\u0010\rR*\u0010%\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010\u000b\u0012\u0004\b$\u0010\u000f\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010#R*\u0010*\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b&\u0010\u000b\u0012\u0004\b)\u0010\u000f\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010#R*\u0010/\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010\u000b\u0012\u0004\b.\u0010\u000f\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010#R*\u00104\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u0010\u000b\u0012\u0004\b3\u0010\u000f\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010#R*\u00109\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010\u000b\u0012\u0004\b8\u0010\u000f\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010#R*\u0010>\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010\u000b\u0012\u0004\b=\u0010\u000f\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010#R*\u0010C\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b?\u0010\u000b\u0012\u0004\bB\u0010\u000f\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010#R*\u0010H\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bD\u0010\u000b\u0012\u0004\bG\u0010\u000f\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010#R*\u0010M\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u0010\u000b\u0012\u0004\bL\u0010\u000f\u001a\u0004\bJ\u0010\r\"\u0004\bK\u0010#R*\u0010R\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010\u000b\u0012\u0004\bQ\u0010\u000f\u001a\u0004\bO\u0010\r\"\u0004\bP\u0010#R*\u0010W\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010\u000b\u0012\u0004\bV\u0010\u000f\u001a\u0004\bT\u0010\r\"\u0004\bU\u0010#R*\u0010\\\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bX\u0010\u000b\u0012\u0004\b[\u0010\u000f\u001a\u0004\bY\u0010\r\"\u0004\bZ\u0010#R*\u0010a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b]\u0010\u000b\u0012\u0004\b`\u0010\u000f\u001a\u0004\b^\u0010\r\"\u0004\b_\u0010#R*\u0010f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bb\u0010\u000b\u0012\u0004\be\u0010\u000f\u001a\u0004\bc\u0010\r\"\u0004\bd\u0010#R*\u0010k\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bg\u0010\u000b\u0012\u0004\bj\u0010\u000f\u001a\u0004\bh\u0010\r\"\u0004\bi\u0010#R*\u0010p\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bl\u0010\u000b\u0012\u0004\bo\u0010\u000f\u001a\u0004\bm\u0010\r\"\u0004\bn\u0010#R*\u0010u\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bq\u0010\u000b\u0012\u0004\bt\u0010\u000f\u001a\u0004\br\u0010\r\"\u0004\bs\u0010#¨\u0006\u007f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "a", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "getEventType$annotations", "()V", "eventType", "b", "getSubType", "getSubType$annotations", "subType", "", "c", "J", "getTime", "()J", "getTime$annotations", "time", GoogleApiAvailabilityLight.a, "getUserId", "getUserId$annotations", "userId", "e", "getChest", "setChest", "(Ljava/lang/String;)V", "getChest$annotations", "chest", "f", "getWaist", "setWaist", "getWaist$annotations", "waist", "g", "getHip", "setHip", "getHip$annotations", "hip", "h", "getArm", "setArm", "getArm$annotations", "arm", "i", "getThigh", "setThigh", "getThigh$annotations", "thigh", z.j, "getCalf", "setCalf", "getCalf$annotations", "calf", hl.k, "getBody_fat", "setBody_fat", "getBody_fat$annotations", BFConstant.TYPE_BODY_FAT_AD, "l", "getBmi", "setBmi", "getBmi$annotations", "bmi", "m", "getMuscle", "setMuscle", "getMuscle$annotations", "muscle", GoogleApiAvailabilityLight.b, "getWater", "setWater", "getWater$annotations", "water", "o", "getProtein", "setProtein", "getProtein$annotations", Field.NUTRIENT_PROTEIN, b.r, "getBasal_metabolism", "setBasal_metabolism", "getBasal_metabolism$annotations", "basal_metabolism", DTransferConstants.SEARCH_KEY, "getVisceral_fat", "setVisceral_fat", "getVisceral_fat$annotations", "visceral_fat", "r", "getBone", "setBone", "getBone$annotations", "bone", SOAP.XMLNS, "getTemperature", "setTemperature", "getTemperature$annotations", "temperature", "t", "getBlood_sugar", "setBlood_sugar", "getBlood_sugar$annotations", RouterHelper.DATA_TYPE_BLOOD_SUGAR, "u", "getBlood_pressure", "setBlood_pressure", "getBlood_pressure$annotations", "blood_pressure", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final class HealthDataBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String subType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long time;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String chest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String waist;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String hip;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String arm;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String thigh;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String calf;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String body_fat;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String bmi;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private String muscle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private String water;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private String protein;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private String basal_metabolism;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private String visceral_fat;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private String bone;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private String temperature;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    private String blood_sugar;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    private String blood_pressure;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataBean;", "serializer", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<HealthDataBean> serializer() {
            return HealthDataBean$$serializer.INSTANCE;
        }
    }

    public HealthDataBean() {
        this((String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ HealthDataBean(int i, @SerialName("eventType") String str, @SerialName("subType") String str2, @SerialName("timestamp") long j, @SerialName("userId") String str3, @SerialName("chest_value") String str4, @SerialName("waist_value") String str5, @SerialName("hip_value") String str6, @SerialName(Personalization.EXTERNAL_ARM_VALUE_PARAM) String str7, @SerialName("thigh_value") String str8, @SerialName("calf_value") String str9, @SerialName("body_fat_value") String str10, @SerialName("bmi_value") String str11, @SerialName("muscle_value") String str12, @SerialName("water_value") String str13, @SerialName("protein_value") String str14, @SerialName("basal_metabolism_value") String str15, @SerialName("visceral_fat_value") String str16, @SerialName("bone_value") String str17, @SerialName("temperature_value") String str18, @SerialName("blood_sugar_value") String str19, @SerialName("blood_pressure_value") String str20, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, HealthDataBean$$serializer.INSTANCE.getDescriptor());
        }
        this.eventType = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.subType = null;
        } else {
            this.subType = str2;
        }
        this.time = (i & 4) == 0 ? 0L : j;
        this.userId = (i & 8) == 0 ? HMPersonInfo.getInstance().getUserInfo().getUserid() : str3;
        if ((i & 16) == 0) {
            this.chest = null;
        } else {
            this.chest = str4;
        }
        if ((i & 32) == 0) {
            this.waist = null;
        } else {
            this.waist = str5;
        }
        if ((i & 64) == 0) {
            this.hip = null;
        } else {
            this.hip = str6;
        }
        if ((i & 128) == 0) {
            this.arm = null;
        } else {
            this.arm = str7;
        }
        if ((i & 256) == 0) {
            this.thigh = null;
        } else {
            this.thigh = str8;
        }
        if ((i & 512) == 0) {
            this.calf = null;
        } else {
            this.calf = str9;
        }
        if ((i & 1024) == 0) {
            this.body_fat = null;
        } else {
            this.body_fat = str10;
        }
        if ((i & 2048) == 0) {
            this.bmi = null;
        } else {
            this.bmi = str11;
        }
        if ((i & 4096) == 0) {
            this.muscle = null;
        } else {
            this.muscle = str12;
        }
        if ((i & 8192) == 0) {
            this.water = null;
        } else {
            this.water = str13;
        }
        if ((i & 16384) == 0) {
            this.protein = null;
        } else {
            this.protein = str14;
        }
        if ((32768 & i) == 0) {
            this.basal_metabolism = null;
        } else {
            this.basal_metabolism = str15;
        }
        if ((65536 & i) == 0) {
            this.visceral_fat = null;
        } else {
            this.visceral_fat = str16;
        }
        if ((131072 & i) == 0) {
            this.bone = null;
        } else {
            this.bone = str17;
        }
        if ((262144 & i) == 0) {
            this.temperature = null;
        } else {
            this.temperature = str18;
        }
        if ((524288 & i) == 0) {
            this.blood_sugar = null;
        } else {
            this.blood_sugar = str19;
        }
        if ((i & 1048576) == 0) {
            this.blood_pressure = null;
        } else {
            this.blood_pressure = str20;
        }
    }

    @SerialName(Personalization.EXTERNAL_ARM_VALUE_PARAM)
    public static /* synthetic */ void getArm$annotations() {
    }

    @SerialName("basal_metabolism_value")
    public static /* synthetic */ void getBasal_metabolism$annotations() {
    }

    @SerialName("blood_pressure_value")
    public static /* synthetic */ void getBlood_pressure$annotations() {
    }

    @SerialName("blood_sugar_value")
    public static /* synthetic */ void getBlood_sugar$annotations() {
    }

    @SerialName("bmi_value")
    public static /* synthetic */ void getBmi$annotations() {
    }

    @SerialName("body_fat_value")
    public static /* synthetic */ void getBody_fat$annotations() {
    }

    @SerialName("bone_value")
    public static /* synthetic */ void getBone$annotations() {
    }

    @SerialName("calf_value")
    public static /* synthetic */ void getCalf$annotations() {
    }

    @SerialName("chest_value")
    public static /* synthetic */ void getChest$annotations() {
    }

    @SerialName("eventType")
    public static /* synthetic */ void getEventType$annotations() {
    }

    @SerialName("hip_value")
    public static /* synthetic */ void getHip$annotations() {
    }

    @SerialName("muscle_value")
    public static /* synthetic */ void getMuscle$annotations() {
    }

    @SerialName("protein_value")
    public static /* synthetic */ void getProtein$annotations() {
    }

    @SerialName("subType")
    public static /* synthetic */ void getSubType$annotations() {
    }

    @SerialName("temperature_value")
    public static /* synthetic */ void getTemperature$annotations() {
    }

    @SerialName("thigh_value")
    public static /* synthetic */ void getThigh$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTime$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @SerialName("visceral_fat_value")
    public static /* synthetic */ void getVisceral_fat$annotations() {
    }

    @SerialName("waist_value")
    public static /* synthetic */ void getWaist$annotations() {
    }

    @SerialName("water_value")
    public static /* synthetic */ void getWater$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull HealthDataBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.eventType, "")) {
            output.encodeStringElement(serialDesc, 0, self.eventType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.time != 0) {
            output.encodeLongElement(serialDesc, 2, self.time);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.userId, HMPersonInfo.getInstance().getUserInfo().getUserid())) {
            output.encodeStringElement(serialDesc, 3, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.chest != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.chest);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.waist != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.waist);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.hip != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.hip);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.arm != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.arm);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.thigh != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.thigh);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.calf != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.calf);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.body_fat != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.body_fat);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.bmi != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.bmi);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.muscle != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.muscle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.water != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.water);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.protein != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.protein);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.basal_metabolism != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.basal_metabolism);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.visceral_fat != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.visceral_fat);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.bone != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.bone);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.temperature != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, self.temperature);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.blood_sugar != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.blood_sugar);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.blood_pressure != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, StringSerializer.INSTANCE, self.blood_pressure);
        }
    }

    @Nullable
    public final String getArm() {
        return this.arm;
    }

    @Nullable
    public final String getBasal_metabolism() {
        return this.basal_metabolism;
    }

    @Nullable
    public final String getBlood_pressure() {
        return this.blood_pressure;
    }

    @Nullable
    public final String getBlood_sugar() {
        return this.blood_sugar;
    }

    @Nullable
    public final String getBmi() {
        return this.bmi;
    }

    @Nullable
    public final String getBody_fat() {
        return this.body_fat;
    }

    @Nullable
    public final String getBone() {
        return this.bone;
    }

    @Nullable
    public final String getCalf() {
        return this.calf;
    }

    @Nullable
    public final String getChest() {
        return this.chest;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getHip() {
        return this.hip;
    }

    @Nullable
    public final String getMuscle() {
        return this.muscle;
    }

    @Nullable
    public final String getProtein() {
        return this.protein;
    }

    @Nullable
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    public final String getTemperature() {
        return this.temperature;
    }

    @Nullable
    public final String getThigh() {
        return this.thigh;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getVisceral_fat() {
        return this.visceral_fat;
    }

    @Nullable
    public final String getWaist() {
        return this.waist;
    }

    @Nullable
    public final String getWater() {
        return this.water;
    }

    public final void setArm(@Nullable String str) {
        this.arm = str;
    }

    public final void setBasal_metabolism(@Nullable String str) {
        this.basal_metabolism = str;
    }

    public final void setBlood_pressure(@Nullable String str) {
        this.blood_pressure = str;
    }

    public final void setBlood_sugar(@Nullable String str) {
        this.blood_sugar = str;
    }

    public final void setBmi(@Nullable String str) {
        this.bmi = str;
    }

    public final void setBody_fat(@Nullable String str) {
        this.body_fat = str;
    }

    public final void setBone(@Nullable String str) {
        this.bone = str;
    }

    public final void setCalf(@Nullable String str) {
        this.calf = str;
    }

    public final void setChest(@Nullable String str) {
        this.chest = str;
    }

    public final void setHip(@Nullable String str) {
        this.hip = str;
    }

    public final void setMuscle(@Nullable String str) {
        this.muscle = str;
    }

    public final void setProtein(@Nullable String str) {
        this.protein = str;
    }

    public final void setTemperature(@Nullable String str) {
        this.temperature = str;
    }

    public final void setThigh(@Nullable String str) {
        this.thigh = str;
    }

    public final void setVisceral_fat(@Nullable String str) {
        this.visceral_fat = str;
    }

    public final void setWaist(@Nullable String str) {
        this.waist = str;
    }

    public final void setWater(@Nullable String str) {
        this.water = str;
    }

    public HealthDataBean(@NotNull String str, @Nullable String str2, long j, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20) {
        this.eventType = str;
        this.subType = str2;
        this.time = j;
        this.userId = str3;
        this.chest = str4;
        this.waist = str5;
        this.hip = str6;
        this.arm = str7;
        this.thigh = str8;
        this.calf = str9;
        this.body_fat = str10;
        this.bmi = str11;
        this.muscle = str12;
        this.water = str13;
        this.protein = str14;
        this.basal_metabolism = str15;
        this.visceral_fat = str16;
        this.bone = str17;
        this.temperature = str18;
        this.blood_sugar = str19;
        this.blood_pressure = str20;
    }

    public /* synthetic */ HealthDataBean(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? HMPersonInfo.getInstance().getUserInfo().getUserid() : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? null : str20);
    }
}
