package com.xiaomi.hm.health.bodyfat.utils;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010$\n\u0002\bl\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0016\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0016\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010\"\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010#\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0019\u0010)\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010,\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R%\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0-8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R%\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0-8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u0016\u00106\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0018R\u0016\u00107\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0018R\u0016\u00108\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0018R\u0016\u00109\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0018R%\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0-8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R%\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0-8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u00101R\u0016\u0010@\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0018R\u0019\u0010C\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010&\u001a\u0004\bB\u0010(R\u0016\u0010D\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0018R\u0016\u0010E\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0018R\u0016\u0010F\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0018R\u0019\u0010I\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010&\u001a\u0004\bH\u0010(R\u0019\u0010L\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010&\u001a\u0004\bK\u0010(R\u0016\u0010M\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\u0018R\u0016\u0010N\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010\u0018R\u0019\u0010Q\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010&\u001a\u0004\bP\u0010(R\u0019\u0010T\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010&\u001a\u0004\bS\u0010(R\u0019\u0010W\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010&\u001a\u0004\bV\u0010(R\u0019\u0010Z\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bX\u0010&\u001a\u0004\bY\u0010(R\u0019\u0010]\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b[\u0010&\u001a\u0004\b\\\u0010(R\u0019\u0010`\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b^\u0010&\u001a\u0004\b_\u0010(R\u0016\u0010a\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010\u0018R\u0016\u0010b\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010\u0018R\u0016\u0010c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010\u0004R\u0016\u0010d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bd\u0010\u0004R\u0016\u0010e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010\u0004R\u0016\u0010f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010\u0004R\u0016\u0010g\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bg\u0010\u0018R\u0016\u0010h\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bh\u0010\u0018R\u0016\u0010i\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bi\u0010\u0018R\u0019\u0010l\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bj\u0010&\u001a\u0004\bk\u0010(R\u0016\u0010m\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bm\u0010\u0018R\u0016\u0010n\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bn\u0010\u0018R\u0019\u0010q\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\bo\u0010&\u001a\u0004\bp\u0010(R\u0019\u0010t\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\br\u0010&\u001a\u0004\bs\u0010(R\u0016\u0010u\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bu\u0010\u0018R\u0016\u0010v\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010\u0018R%\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-8\u0006@\u0006¢\u0006\f\n\u0004\bw\u0010/\u001a\u0004\bx\u00101R%\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-8\u0006@\u0006¢\u0006\f\n\u0004\bz\u0010/\u001a\u0004\b{\u00101R\u0016\u0010}\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b}\u0010\u0018R\u0016\u0010~\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b~\u0010\u0018R\u0016\u0010\u007f\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u007f\u0010\u0018R\u0018\u0010\u0080\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0018R\u0018\u0010\u0081\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0018R\u0018\u0010\u0082\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0018R\u0018\u0010\u0083\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0018R\u0018\u0010\u0084\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0018R\u001c\u0010\u0087\u0001\u001a\u00020$8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010&\u001a\u0005\b\u0086\u0001\u0010(R\u001c\u0010\u008a\u0001\u001a\u00020$8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010&\u001a\u0005\b\u0089\u0001\u0010(R\u001c\u0010\u008d\u0001\u001a\u00020$8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010&\u001a\u0005\b\u008c\u0001\u0010(R\u001c\u0010\u0090\u0001\u001a\u00020$8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010&\u001a\u0005\b\u008f\u0001\u0010(R\u001c\u0010\u0093\u0001\u001a\u00020$8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010&\u001a\u0005\b\u0092\u0001\u0010(R\u001c\u0010\u0096\u0001\u001a\u00020$8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010&\u001a\u0005\b\u0095\u0001\u0010(¨\u0006\u0099\u0001"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/BodyParamsStandardData;", "", "", "AGE_6", LogUtil.I, "AGE_7", "AGE_9", "AGE_12", "AGE_13", "AGE_15", "AGE_16", "AGE_17", "AGE_18", "AGE_29", "AGE_30", "AGE_39", "AGE_40", "AGE_49", "AGE_50", "AGE_59", "AGE_60", "AGE_99", "", "BMI_VALUE_15", "F", "BMI_VALUE_14", "BODY_FAT_SCORE_1", "BODY_FAT_SCORE_2", "BODY_FAT_SCORE_3", "BODY_FAT_SCORE_5", "BODY_FAT_SCORE_9", "BODY_FAT_SCORE_10", "BODY_FAT_SCORE_15", "BODY_FAT_SCORE_20", "BODY_FAT_SCORE_30", "BMI_PRECISION", "", "a", "[F", "getBMI_STANDARD_ADULT_OVERSEA", "()[F", "BMI_STANDARD_ADULT_OVERSEA", "b", "getBMI_STANDARD_ADULT_ZH", "BMI_STANDARD_ADULT_ZH", "", "c", "Ljava/util/Map;", "getBMI_STANDARD_CHILD_MALE_ZH", "()Ljava/util/Map;", "BMI_STANDARD_CHILD_MALE_ZH", GoogleApiAvailabilityLight.a, "getBMI_STANDARD_CHILD_FEMALE_ZH", "BMI_STANDARD_CHILD_FEMALE_ZH", "BMI_MINI", "BMI_MAX", "BODY_FAT_PRECISION", "BODY_FAT_6", "e", "getBODY_FAT_STANDARD_MALE", "BODY_FAT_STANDARD_MALE", "f", "getBODY_FAT_STANDARD_FEMALE", "BODY_FAT_STANDARD_FEMALE", "VISCERAL_FAT_PRECISION", "g", "getVISCERAL_FAT_STANDARD", "VISCERAL_FAT_STANDARD", "VISCERAL_FAT_8", "VISCERAL_FAT_9", "SUBCUTANEOUS_FAT_PRECISION", "h", "getSUBCUTANEOUS_FAT_MALE_STANDARD", "SUBCUTANEOUS_FAT_MALE_STANDARD", "i", "getSUBCUTANEOUS_FAT_FEMALE_STANDARD", "SUBCUTANEOUS_FAT_FEMALE_STANDARD", "SUBCUTANEOUS_FAT_6", "MUSCLE_PRECISION", z.j, "getMUSCLE_MALE_159", "MUSCLE_MALE_159", hl.k, "getMUSCLE_MALE_160_169", "MUSCLE_MALE_160_169", "l", "getMUSCLE_MALE_170", "MUSCLE_MALE_170", "m", "getMUSCLE_FEMALE_159", "MUSCLE_FEMALE_159", GoogleApiAvailabilityLight.b, "getMUSCLE_FEMALE_160_169", "MUSCLE_FEMALE_160_169", "o", "getMUSCLE_FEMALE_170", "MUSCLE_FEMALE_170", "MUSCLE_5", "MUSCLE_float_9", "HEIGHT_159", "HEIGHT_160", "HEIGHT_169", "HEIGHT_170", "SKELETAL_MUSCLE_PRECISION", "SKELETAL_MUSCLE_5", "SKELETAL_MUSCLE_FLOAT_9", b.r, "getSKELETAL_MUSCLE_STANDARD", "SKELETAL_MUSCLE_STANDARD", "WATER_PRECISION", "WATER_5", DTransferConstants.SEARCH_KEY, "getWATER_MALE_STANDARD", "WATER_MALE_STANDARD", "r", "getWATER_FEMALE_STANDARD", "WATER_FEMALE_STANDARD", "BASIC_METABOLISM_PRECISION", "BASIC_METABOLISM_300", SOAP.XMLNS, "getBASIC_METABOLISM_MALE_STANDARD", "BASIC_METABOLISM_MALE_STANDARD", "t", "getBASIC_METABOLISM_FEMALE_STANDARD", "BASIC_METABOLISM_FEMALE_STANDARD", "BONE_MASS_WEIGHT_60", "BONE_MASS_WEIGHT_60_1", "BONE_MASS_WEIGHT_74_9", "BONE_MASS_WEIGHT_75", "BONE_MASS_WEIGHT_45", "BONE_MASS_WEIGHT_45_1", "BONE_MASS_PRECISION", "BONE_MASS_FLOAT_3", "u", "getBONE_MASS_MALE_60_STANDARD", "BONE_MASS_MALE_60_STANDARD", "v", "getBONE_MASS_MALE_74_9_STANDARD", "BONE_MASS_MALE_74_9_STANDARD", "w", "getBONE_MASS_MALE_75_STANDARD", "BONE_MASS_MALE_75_STANDARD", "x", "getBONE_MASS_FEMALE_45_STANDARD", "BONE_MASS_FEMALE_45_STANDARD", "y", "getBONE_MASS_FEMALE_60_STANDARD", "BONE_MASS_FEMALE_60_STANDARD", "z", "getBONE_MASS_FEMALE_60_1_STANDARD", "BONE_MASS_FEMALE_60_1_STANDARD", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyParamsStandardData {
    public static final int AGE_12 = 12;
    public static final int AGE_13 = 13;
    public static final int AGE_15 = 15;
    public static final int AGE_16 = 16;
    public static final int AGE_17 = 17;
    public static final int AGE_18 = 18;
    public static final int AGE_29 = 29;
    public static final int AGE_30 = 30;
    public static final int AGE_39 = 39;
    public static final int AGE_40 = 40;
    public static final int AGE_49 = 49;
    public static final int AGE_50 = 50;
    public static final int AGE_59 = 59;
    public static final int AGE_6 = 6;
    public static final int AGE_60 = 60;
    public static final int AGE_7 = 7;
    public static final int AGE_9 = 9;
    public static final int AGE_99 = 99;
    public static final float BASIC_METABOLISM_300 = 300.0f;
    public static final float BASIC_METABOLISM_PRECISION = 1.0f;
    public static final float BMI_MAX = 90.0f;
    public static final float BMI_MINI = 2.0f;
    public static final float BMI_PRECISION = 0.1f;
    public static final float BMI_VALUE_14 = 14.0f;
    public static final float BMI_VALUE_15 = 15.0f;
    public static final float BODY_FAT_6 = 6.0f;
    public static final float BODY_FAT_PRECISION = 0.1f;
    public static final float BODY_FAT_SCORE_1 = 1.0f;
    public static final float BODY_FAT_SCORE_10 = 10.0f;
    public static final float BODY_FAT_SCORE_15 = 15.0f;
    public static final float BODY_FAT_SCORE_2 = 2.0f;
    public static final float BODY_FAT_SCORE_20 = 20.0f;
    public static final float BODY_FAT_SCORE_3 = 3.0f;
    public static final float BODY_FAT_SCORE_30 = 30.0f;
    public static final float BODY_FAT_SCORE_5 = 5.0f;
    public static final float BODY_FAT_SCORE_9 = 9.0f;
    public static final float BONE_MASS_FLOAT_3 = 0.3f;
    public static final float BONE_MASS_PRECISION = 0.1f;
    public static final float BONE_MASS_WEIGHT_45 = 45.0f;
    public static final float BONE_MASS_WEIGHT_45_1 = 45.1f;
    public static final float BONE_MASS_WEIGHT_60 = 60.0f;
    public static final float BONE_MASS_WEIGHT_60_1 = 60.1f;
    public static final float BONE_MASS_WEIGHT_74_9 = 74.9f;
    public static final float BONE_MASS_WEIGHT_75 = 75.0f;
    public static final int HEIGHT_159 = 159;
    public static final int HEIGHT_160 = 160;
    public static final int HEIGHT_169 = 169;
    public static final int HEIGHT_170 = 170;
    public static final float MUSCLE_5 = 5.0f;
    public static final float MUSCLE_PRECISION = 0.1f;
    public static final float MUSCLE_float_9 = 0.9f;
    public static final float SKELETAL_MUSCLE_5 = 5.0f;
    public static final float SKELETAL_MUSCLE_FLOAT_9 = 0.9f;
    public static final float SKELETAL_MUSCLE_PRECISION = 0.1f;
    public static final float SUBCUTANEOUS_FAT_6 = 6.0f;
    public static final float SUBCUTANEOUS_FAT_PRECISION = 0.1f;
    public static final float VISCERAL_FAT_8 = 8.0f;
    public static final float VISCERAL_FAT_9 = 9.0f;
    public static final float VISCERAL_FAT_PRECISION = 1.0f;
    public static final float WATER_5 = 5.0f;
    public static final float WATER_PRECISION = 0.1f;

    @NotNull
    public static final BodyParamsStandardData INSTANCE = new BodyParamsStandardData();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final float[] BMI_STANDARD_ADULT_OVERSEA = {18.4f, 24.9f, 29.9f};

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final float[] BMI_STANDARD_ADULT_ZH = {18.4f, 23.9f, 27.9f};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Map<Integer, float[]> BMI_STANDARD_CHILD_MALE_ZH = r.mapOf(TuplesKt.to(7, new float[]{17.3f, 19.1f}), TuplesKt.to(8, new float[]{18.0f, 20.2f}), TuplesKt.to(9, new float[]{18.8f, 21.3f}), TuplesKt.to(10, new float[]{19.5f, 22.4f}), TuplesKt.to(11, new float[]{20.2f, 23.5f}), TuplesKt.to(12, new float[]{20.9f, 24.6f}), TuplesKt.to(13, new float[]{21.8f, 25.6f}), TuplesKt.to(14, new float[]{22.5f, 26.3f}), TuplesKt.to(15, new float[]{23.0f, 26.8f}), TuplesKt.to(16, new float[]{23.5f, 27.3f}), TuplesKt.to(17, new float[]{23.7f, 27.7f}));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Map<Integer, float[]> BMI_STANDARD_CHILD_FEMALE_ZH = r.mapOf(TuplesKt.to(7, new float[]{17.1f, 18.8f}), TuplesKt.to(8, new float[]{18.0f, 19.8f}), TuplesKt.to(9, new float[]{18.9f, 20.9f}), TuplesKt.to(10, new float[]{19.9f, 22.0f}), TuplesKt.to(11, new float[]{21.0f, 23.2f}), TuplesKt.to(12, new float[]{21.8f, 24.4f}), TuplesKt.to(13, new float[]{22.5f, 25.5f}), TuplesKt.to(14, new float[]{22.9f, 26.2f}), TuplesKt.to(15, new float[]{23.3f, 26.8f}), TuplesKt.to(16, new float[]{23.6f, 27.3f}), TuplesKt.to(17, new float[]{23.7f, 27.6f}));

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Map<Integer, float[]> BODY_FAT_STANDARD_MALE = r.mapOf(TuplesKt.to(13, new float[]{6.9f, 15.9f, 24.9f, 29.9f}), TuplesKt.to(14, new float[]{6.9f, 14.9f, 24.9f, 28.9f}), TuplesKt.to(15, new float[]{7.9f, 14.9f, 23.9f, 28.9f}), TuplesKt.to(16, new float[]{7.9f, 15.9f, 23.9f, 27.9f}), TuplesKt.to(17, new float[]{8.9f, 15.9f, 22.9f, 27.9f}), TuplesKt.to(39, new float[]{10.9f, 16.9f, 21.9f, 26.9f}), TuplesKt.to(59, new float[]{11.9f, 17.9f, 22.9f, 27.9f}), TuplesKt.to(99, new float[]{13.9f, 19.9f, 24.9f, 29.9f}));

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Map<Integer, float[]> BODY_FAT_STANDARD_FEMALE = r.mapOf(TuplesKt.to(6, new float[]{7.9f, 15.9f, 24.9f, 28.9f}), TuplesKt.to(7, new float[]{8.9f, 16.9f, 24.9f, 29.9f}), TuplesKt.to(8, new float[]{9.9f, 17.9f, 25.9f, 30.9f}), TuplesKt.to(9, new float[]{9.9f, 18.9f, 27.9f, 31.9f}), TuplesKt.to(10, new float[]{10.9f, 19.9f, 28.9f, 32.9f}), TuplesKt.to(11, new float[]{12.9f, 21.9f, 30.9f, 34.9f}), TuplesKt.to(12, new float[]{13.9f, 22.9f, 31.9f, 35.9f}), TuplesKt.to(13, new float[]{14.9f, 24.9f, 33.9f, 37.9f}), TuplesKt.to(14, new float[]{16.9f, 25.9f, 34.9f, 38.9f}), TuplesKt.to(15, new float[]{17.9f, 26.9f, 35.9f, 39.9f}), TuplesKt.to(16, new float[]{18.9f, 27.9f, 36.9f, 40.9f}), TuplesKt.to(17, new float[]{19.9f, 27.9f, 36.9f, 40.9f}), TuplesKt.to(39, new float[]{20.9f, 27.9f, 34.9f, 39.9f}), TuplesKt.to(59, new float[]{21.9f, 28.9f, 35.9f, 40.9f}), TuplesKt.to(99, new float[]{21.9f, 29.9f, 36.9f, 41.9f}));

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final float[] VISCERAL_FAT_STANDARD = {9.0f, 14.0f, 50.0f};

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final float[] SUBCUTANEOUS_FAT_MALE_STANDARD = {8.6f, 16.7f};

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final float[] SUBCUTANEOUS_FAT_FEMALE_STANDARD = {18.5f, 26.7f};

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final float[] MUSCLE_MALE_159 = {38.4f, 46.4f};

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final float[] MUSCLE_MALE_160_169 = {43.9f, 52.3f};

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final float[] MUSCLE_MALE_170 = {49.4f, 59.3f};

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final float[] MUSCLE_FEMALE_159 = {29.0f, 34.6f};

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final float[] MUSCLE_FEMALE_160_169 = {32.8f, 37.4f};

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private static final float[] MUSCLE_FEMALE_170 = {36.4f, 42.4f};

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private static final float[] SKELETAL_MUSCLE_STANDARD = {20.0f, 35.0f};

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private static final float[] WATER_MALE_STANDARD = {54.9f, 65.0f};

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private static final float[] WATER_FEMALE_STANDARD = {44.9f, 60.0f};

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private static final Map<Integer, Integer> BASIC_METABOLISM_MALE_STANDARD = r.mapOf(TuplesKt.to(12, 36), TuplesKt.to(15, 30), TuplesKt.to(17, 26), TuplesKt.to(29, 23), TuplesKt.to(49, 21), TuplesKt.to(50, 20));

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private static final Map<Integer, Integer> BASIC_METABOLISM_FEMALE_STANDARD = r.mapOf(TuplesKt.to(12, 34), TuplesKt.to(15, 29), TuplesKt.to(17, 24), TuplesKt.to(29, 22), TuplesKt.to(49, 20), TuplesKt.to(50, 19));

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private static final float[] BONE_MASS_MALE_60_STANDARD = {2.4f, 3.8f};

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private static final float[] BONE_MASS_MALE_74_9_STANDARD = {2.8f, 4.0f};

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private static final float[] BONE_MASS_MALE_75_STANDARD = {3.1f, 4.1f};

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private static final float[] BONE_MASS_FEMALE_45_STANDARD = {1.7f, 3.5f};

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private static final float[] BONE_MASS_FEMALE_60_STANDARD = {2.1f, 3.7f};

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private static final float[] BONE_MASS_FEMALE_60_1_STANDARD = {2.4f, 3.8f};

    private BodyParamsStandardData() {
    }

    @NotNull
    public final Map<Integer, Integer> getBASIC_METABOLISM_FEMALE_STANDARD() {
        return BASIC_METABOLISM_FEMALE_STANDARD;
    }

    @NotNull
    public final Map<Integer, Integer> getBASIC_METABOLISM_MALE_STANDARD() {
        return BASIC_METABOLISM_MALE_STANDARD;
    }

    @NotNull
    public final float[] getBMI_STANDARD_ADULT_OVERSEA() {
        return BMI_STANDARD_ADULT_OVERSEA;
    }

    @NotNull
    public final float[] getBMI_STANDARD_ADULT_ZH() {
        return BMI_STANDARD_ADULT_ZH;
    }

    @NotNull
    public final Map<Integer, float[]> getBMI_STANDARD_CHILD_FEMALE_ZH() {
        return BMI_STANDARD_CHILD_FEMALE_ZH;
    }

    @NotNull
    public final Map<Integer, float[]> getBMI_STANDARD_CHILD_MALE_ZH() {
        return BMI_STANDARD_CHILD_MALE_ZH;
    }

    @NotNull
    public final Map<Integer, float[]> getBODY_FAT_STANDARD_FEMALE() {
        return BODY_FAT_STANDARD_FEMALE;
    }

    @NotNull
    public final Map<Integer, float[]> getBODY_FAT_STANDARD_MALE() {
        return BODY_FAT_STANDARD_MALE;
    }

    @NotNull
    public final float[] getBONE_MASS_FEMALE_45_STANDARD() {
        return BONE_MASS_FEMALE_45_STANDARD;
    }

    @NotNull
    public final float[] getBONE_MASS_FEMALE_60_1_STANDARD() {
        return BONE_MASS_FEMALE_60_1_STANDARD;
    }

    @NotNull
    public final float[] getBONE_MASS_FEMALE_60_STANDARD() {
        return BONE_MASS_FEMALE_60_STANDARD;
    }

    @NotNull
    public final float[] getBONE_MASS_MALE_60_STANDARD() {
        return BONE_MASS_MALE_60_STANDARD;
    }

    @NotNull
    public final float[] getBONE_MASS_MALE_74_9_STANDARD() {
        return BONE_MASS_MALE_74_9_STANDARD;
    }

    @NotNull
    public final float[] getBONE_MASS_MALE_75_STANDARD() {
        return BONE_MASS_MALE_75_STANDARD;
    }

    @NotNull
    public final float[] getMUSCLE_FEMALE_159() {
        return MUSCLE_FEMALE_159;
    }

    @NotNull
    public final float[] getMUSCLE_FEMALE_160_169() {
        return MUSCLE_FEMALE_160_169;
    }

    @NotNull
    public final float[] getMUSCLE_FEMALE_170() {
        return MUSCLE_FEMALE_170;
    }

    @NotNull
    public final float[] getMUSCLE_MALE_159() {
        return MUSCLE_MALE_159;
    }

    @NotNull
    public final float[] getMUSCLE_MALE_160_169() {
        return MUSCLE_MALE_160_169;
    }

    @NotNull
    public final float[] getMUSCLE_MALE_170() {
        return MUSCLE_MALE_170;
    }

    @NotNull
    public final float[] getSKELETAL_MUSCLE_STANDARD() {
        return SKELETAL_MUSCLE_STANDARD;
    }

    @NotNull
    public final float[] getSUBCUTANEOUS_FAT_FEMALE_STANDARD() {
        return SUBCUTANEOUS_FAT_FEMALE_STANDARD;
    }

    @NotNull
    public final float[] getSUBCUTANEOUS_FAT_MALE_STANDARD() {
        return SUBCUTANEOUS_FAT_MALE_STANDARD;
    }

    @NotNull
    public final float[] getVISCERAL_FAT_STANDARD() {
        return VISCERAL_FAT_STANDARD;
    }

    @NotNull
    public final float[] getWATER_FEMALE_STANDARD() {
        return WATER_FEMALE_STANDARD;
    }

    @NotNull
    public final float[] getWATER_MALE_STANDARD() {
        return WATER_MALE_STANDARD;
    }
}
