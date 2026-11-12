package com.xiaomi.fitness.electronic.scale.util;

import android.content.res.Resources;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.electronic.scale.data.WeightDataItem;
import com.xiaomi.fitness.electronic.scale.data.WeightEvaluateDetail;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.extensions.DataExtensionKt;
import defpackage.eji;
import defpackage.oxi;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MJ\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00052\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020QJ&\u0010R\u001a\b\u0012\u0004\u0012\u00020O0\u00052\u0006\u0010L\u001a\u00020M2\b\b\u0002\u0010S\u001a\u00020T2\u0006\u0010P\u001a\u00020QJ&\u0010U\u001a\u00020O2\u0006\u0010V\u001a\u00020\u00062\u0006\u0010W\u001a\u00020X2\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020QJ*\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010V\u001a\u00020\u00062\u0006\u0010[\u001a\u00020X2\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020QH\u0002J\u0018\u0010\\\u001a\u00020K2\u0006\u0010V\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u0006H\u0002J(\u0010^\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u00122\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020QH\u0002J\u0018\u0010_\u001a\u00020`2\u0006\u0010V\u001a\u00020\u00062\u0006\u0010[\u001a\u00020XH\u0002J\u0018\u0010a\u001a\u00020`2\b\b\u0002\u0010b\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u0012J\u0010\u0010c\u001a\u00020`2\u0006\u0010V\u001a\u00020\u0006H\u0002J\u0018\u0010d\u001a\u00020`2\u0006\u0010V\u001a\u00020\u00062\u0006\u0010L\u001a\u00020MH\u0002J&\u0010e\u001a\b\u0012\u0004\u0012\u00020f0\u00052\u0006\u0010V\u001a\u00020\u00062\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010g\u001a\u00020\b2\u0006\u0010V\u001a\u00020\u0006H\u0002J \u0010h\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\u00062\u0006\u0010L\u001a\u00020M2\u0006\u0010P\u001a\u00020QH\u0002J\u0018\u0010i\u001a\u00020\u00152\u0006\u0010j\u001a\u00020\u00062\u0006\u0010k\u001a\u00020KH\u0002J\u0010\u0010l\u001a\u00020\b2\u0006\u0010V\u001a\u00020\u0006H\u0002J\u001a\u0010m\u001a\u0004\u0018\u00010`2\u0006\u0010V\u001a\u00020\u00062\u0006\u0010n\u001a\u00020\u0006H\u0002J\u000e\u0010o\u001a\u00020\u00122\u0006\u0010p\u001a\u00020\u0012J\b\u0010q\u001a\u00020\u0012H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/WeightEvaluationHelper;", "", "<init>", "()V", "unSupportedEvaluationTypeList", "", "", "COMMON_TWO_SEGMENT_COLOR", "", "COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH", "getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH", "()[I", "COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD", "COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING", "COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS", "COMMON_THREE_SEGMENT_SHORT_DESC", "getCOMMON_THREE_SEGMENT_SHORT_DESC", "BMI_LEVEL_1", "", "BMI_LEVEL_2", "BMI_AXIS_VALUE", "", "BMI_SEGMENT_SHORT_DESC", "BMI_SEGMENT_DETAIL_DESC", "BODY_WATER_RATE_AXIS_VALUE_M", "BODY_WATER_RATE_AXIS_VALUE_F", "BODY_WATER_RATE_SHORT_DESC", "BODY_WATER_RATE_DETAIL_DESC", "FAT_RATE_AXIS_VALUE_AGE_18_39_M", "FAT_RATE_AXIS_VALUE_AGE_40_59_M", "FAT_RATE_AXIS_VALUE_AGE_60_M", "FAT_RATE_AXIS_VALUE_AGE_18_39_F", "FAT_RATE_AXIS_VALUE_AGE_40_59_F", "FAT_RATE_AXIS_VALUE_AGE_60_F", "FAT_RATE_SHORT_DESC", "FAT_RATE_DETAIL_DESC", "MUSCLE_RATE_AXIS_VALUE_M", "MUSCLE_RATE_AXIS_VALUE_F", "MUSCLE_RATE_DETAIL_DESC", "MUSCLE_MASS_HEIGHT_160_M", "MUSCLE_MASS_HEIGHT_160_170_M", "MUSCLE_MASS_HEIGHT_170_M", "MUSCLE_MASS_HEIGHT_150_F", "MUSCLE_MASS_HEIGHT_150_160_F", "MUSCLE_MASS_HEIGHT_160_F", "MUSCLE_MASS_DETAIL_DESC", "PROTEIN_RATE_AXIS_VALUE", "PROTEIN_RATE_DETAIL_DESC", "BONE_SALT_MASS_WEIGHT_BELOW_60_M", "BONE_SALT_MASS_WEIGHT_UP_60_M", "BONE_SALT_MASS_WEIGHT_45_F", "BONE_SALT_MASS_WEIGHT_45_60_F", "BONE_SALT_MASS_WEIGHT_60_F", "BONE_SALT_MASS_SHORT_DESC", "BONE_SALT_MASS_DETAIL_DESC", "VISCERAL_FAT_AXIS_VALUE", "VISCERAL_FAT_SEGMENT_SHORT_DESC", "VISCERAL_FAT_SEGMENT_DETAIL_DESC", "LIMB_SKELETAL_MUSCLE_AXIS_VALUE_M", "LIMB_SKELETAL_MUSCLE_AXIS_VALUE_F", "LIMB_SKELETAL_MUSCLE_SHORT_DESC", "LIMB_SKELETAL_MUSCLE_DETAIL_DESC", "BASAL_METABOLISM_AGE_29_M", "BASAL_METABOLISM_AGE_30_49_M", "BASAL_METABOLISM_AGE_50_69_M", "BASAL_METABOLISM_AGE_70_M", "BASAL_METABOLISM_AGE_29_F", "BASAL_METABOLISM_AGE_30_49_F", "BASAL_METABOLISM_AGE_50_69_F", "BASAL_METABOLISM_AGE_70_F", "WHR_AXIS_VALUE_M", "WHR_AXIS_VALUE_F", "WHR_SHORT_DESC", "WHR_DETAIL_DESC", "shouldHideEvaluationIndexCardBasedOnFields", "", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "createIndexEvaluationDataList", "Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "createBodyCompositionDataList", "filter", "Lcom/xiaomi/fitness/electronic/scale/util/WeightEvaluationHelper$FILTER;", "buildWeightDataByType", "type", "num", "", "buildEvaluationData", "Lcom/xiaomi/fitness/electronic/scale/data/WeightEvaluateDetail;", "value", "getNormalStatus", "shortDescResId", "getBodyEvaluationPosition", "formatWeightItemValue", "", "formatFloatValue", "scale", "getWeightItemName", "getWeightItemUnit", "getBodyIndexLevelItems", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "getAxisColorArray", "getAxisValueArray", "getFataRateAxisArray", "age", "isFemale", "getAxisShortDescArray", "getDetailDescByType", "position", "getSuggestedWeightByHeight", "height", "getRecommendBMI", "FILTER", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeightEvaluationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightEvaluationHelper.kt\ncom/xiaomi/fitness/electronic/scale/util/WeightEvaluationHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,702:1\n774#2:703\n865#2,2:704\n774#2:706\n865#2,2:707\n13517#3,3:709\n*S KotlinDebug\n*F\n+ 1 WeightEvaluationHelper.kt\ncom/xiaomi/fitness/electronic/scale/util/WeightEvaluationHelper\n*L\n363#1:703\n363#1:704,2\n367#1:706\n367#1:707,2\n583#1:709,3\n*E\n"})
public final class WeightEvaluationHelper {

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_29_F;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_29_M;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_30_49_F;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_30_49_M;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_50_69_F;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_50_69_M;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_70_F;

    @NotNull
    private static final float[] BASAL_METABOLISM_AGE_70_M;

    @NotNull
    private static final float[] BMI_AXIS_VALUE;
    private static final float BMI_LEVEL_1 = 18.5f;
    private static final float BMI_LEVEL_2 = 24.0f;

    @NotNull
    private static final int[] BMI_SEGMENT_DETAIL_DESC;

    @NotNull
    private static final int[] BMI_SEGMENT_SHORT_DESC;

    @NotNull
    private static final float[] BODY_WATER_RATE_AXIS_VALUE_F;

    @NotNull
    private static final float[] BODY_WATER_RATE_AXIS_VALUE_M;

    @NotNull
    private static final int[] BODY_WATER_RATE_DETAIL_DESC;

    @NotNull
    private static final int[] BODY_WATER_RATE_SHORT_DESC;

    @NotNull
    private static final int[] BONE_SALT_MASS_DETAIL_DESC;

    @NotNull
    private static final int[] BONE_SALT_MASS_SHORT_DESC;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_45_60_F;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_45_F;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_60_F;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_BELOW_60_M;

    @NotNull
    private static final float[] BONE_SALT_MASS_WEIGHT_UP_60_M;

    @NotNull
    private static final int[] COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING;

    @NotNull
    private static final int[] COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_SHORT_DESC;

    @NotNull
    private static final int[] COMMON_TWO_SEGMENT_COLOR;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_18_39_F;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_18_39_M;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_40_59_F;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_40_59_M;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_60_F;

    @NotNull
    private static final float[] FAT_RATE_AXIS_VALUE_AGE_60_M;

    @NotNull
    private static final int[] FAT_RATE_DETAIL_DESC;

    @NotNull
    private static final int[] FAT_RATE_SHORT_DESC;

    @NotNull
    private static final float[] LIMB_SKELETAL_MUSCLE_AXIS_VALUE_F;

    @NotNull
    private static final float[] LIMB_SKELETAL_MUSCLE_AXIS_VALUE_M;

    @NotNull
    private static final int[] LIMB_SKELETAL_MUSCLE_DETAIL_DESC;

    @NotNull
    private static final int[] LIMB_SKELETAL_MUSCLE_SHORT_DESC;

    @NotNull
    private static final int[] MUSCLE_MASS_DETAIL_DESC;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_150_160_F;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_150_F;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_160_170_M;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_160_F;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_160_M;

    @NotNull
    private static final float[] MUSCLE_MASS_HEIGHT_170_M;

    @NotNull
    private static final float[] MUSCLE_RATE_AXIS_VALUE_F;

    @NotNull
    private static final float[] MUSCLE_RATE_AXIS_VALUE_M;

    @NotNull
    private static final int[] MUSCLE_RATE_DETAIL_DESC;

    @NotNull
    private static final float[] PROTEIN_RATE_AXIS_VALUE;

    @NotNull
    private static final int[] PROTEIN_RATE_DETAIL_DESC;

    @NotNull
    private static final float[] VISCERAL_FAT_AXIS_VALUE;

    @NotNull
    private static final int[] VISCERAL_FAT_SEGMENT_DETAIL_DESC;

    @NotNull
    private static final int[] VISCERAL_FAT_SEGMENT_SHORT_DESC;

    @NotNull
    private static final float[] WHR_AXIS_VALUE_F;

    @NotNull
    private static final float[] WHR_AXIS_VALUE_M;

    @NotNull
    private static final int[] WHR_DETAIL_DESC;

    @NotNull
    private static final int[] WHR_SHORT_DESC;

    @NotNull
    public static final WeightEvaluationHelper INSTANCE = new WeightEvaluationHelper();

    @NotNull
    private static final List<Integer> unSupportedEvaluationTypeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{11, 6, 10});

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/WeightEvaluationHelper$FILTER;", "", "<init>", "(Ljava/lang/String;I)V", "ABNORMAL_DATA", "NORMAL_DATA", "NONE", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum FILTER {
        ABNORMAL_DATA,
        NORMAL_DATA,
        NONE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<FILTER> getEntries() {
            return $ENTRIES;
        }
    }

    static {
        int i = eji.p;
        int i2 = eji.q;
        COMMON_TWO_SEGMENT_COLOR = new int[]{i, i2};
        int i3 = eji.o;
        COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH = new int[]{i, i2, i3};
        COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD = new int[]{i, i2, eji.n};
        int i4 = eji.f16711r;
        COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING = new int[]{i, i2, i3, i4};
        COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS = new int[]{i2, i3, i4, eji.m};
        int i5 = zzi.J1;
        int i6 = zzi.L1;
        int i7 = zzi.H1;
        COMMON_THREE_SEGMENT_SHORT_DESC = new int[]{i5, i6, i7};
        BMI_AXIS_VALUE = new float[]{BMI_LEVEL_1, BMI_LEVEL_2, 28.0f};
        BMI_SEGMENT_SHORT_DESC = new int[]{zzi.E2, zzi.B2, zzi.D2, zzi.C2};
        BMI_SEGMENT_DETAIL_DESC = new int[]{zzi.p1, zzi.n1, zzi.m1, zzi.o1};
        BODY_WATER_RATE_AXIS_VALUE_M = new float[]{55.0f, 65.0f};
        BODY_WATER_RATE_AXIS_VALUE_F = new float[]{45.0f, 60.0f};
        int i8 = zzi.I1;
        int i9 = zzi.N1;
        BODY_WATER_RATE_SHORT_DESC = new int[]{i8, i9, zzi.F1};
        BODY_WATER_RATE_DETAIL_DESC = new int[]{zzi.y2, zzi.z2, zzi.x2};
        FAT_RATE_AXIS_VALUE_AGE_18_39_M = new float[]{10.0f, 21.0f, 26.0f};
        FAT_RATE_AXIS_VALUE_AGE_40_59_M = new float[]{11.0f, 22.0f, 27.0f};
        FAT_RATE_AXIS_VALUE_AGE_60_M = new float[]{13.0f, BMI_LEVEL_2, 29.0f};
        FAT_RATE_AXIS_VALUE_AGE_18_39_F = new float[]{20.0f, 34.0f, 39.0f};
        FAT_RATE_AXIS_VALUE_AGE_40_59_F = new float[]{21.0f, 35.0f, 40.0f};
        FAT_RATE_AXIS_VALUE_AGE_60_F = new float[]{22.0f, 36.0f, 41.0f};
        FAT_RATE_SHORT_DESC = new int[]{zzi.O1, i9, zzi.E1, zzi.M1};
        FAT_RATE_DETAIL_DESC = new int[]{zzi.A1, zzi.y1, zzi.x1, zzi.z1};
        MUSCLE_RATE_AXIS_VALUE_M = new float[]{66.0f, 91.0f};
        MUSCLE_RATE_AXIS_VALUE_F = new float[]{60.8f, 84.5f};
        MUSCLE_RATE_DETAIL_DESC = new int[]{zzi.W2, zzi.X2, zzi.V2};
        MUSCLE_MASS_HEIGHT_160_M = new float[]{38.5f, 46.5f};
        MUSCLE_MASS_HEIGHT_160_170_M = new float[]{44.0f, 52.4f};
        MUSCLE_MASS_HEIGHT_170_M = new float[]{49.4f, 59.4f};
        MUSCLE_MASS_HEIGHT_150_F = new float[]{29.1f, 34.7f};
        MUSCLE_MASS_HEIGHT_150_160_F = new float[]{32.9f, 37.5f};
        MUSCLE_MASS_HEIGHT_160_F = new float[]{36.5f, 42.5f};
        MUSCLE_MASS_DETAIL_DESC = new int[]{zzi.T2, zzi.U2, zzi.S2};
        PROTEIN_RATE_AXIS_VALUE = new float[]{16.0f, 20.0f};
        PROTEIN_RATE_DETAIL_DESC = new int[]{zzi.Y1, zzi.Z1, zzi.X1};
        BONE_SALT_MASS_WEIGHT_BELOW_60_M = new float[]{2.5f};
        BONE_SALT_MASS_WEIGHT_UP_60_M = new float[]{3.2f};
        BONE_SALT_MASS_WEIGHT_45_F = new float[]{1.8f};
        BONE_SALT_MASS_WEIGHT_45_60_F = new float[]{2.2f};
        BONE_SALT_MASS_WEIGHT_60_F = new float[]{2.5f};
        BONE_SALT_MASS_SHORT_DESC = new int[]{i8, i6};
        BONE_SALT_MASS_DETAIL_DESC = new int[]{zzi.u1, zzi.v1};
        VISCERAL_FAT_AXIS_VALUE = new float[]{4.5f, 9.5f, 14.5f};
        VISCERAL_FAT_SEGMENT_SHORT_DESC = new int[]{zzi.G1, zzi.P1, zzi.K1, zzi.D1};
        VISCERAL_FAT_SEGMENT_DETAIL_DESC = new int[]{zzi.t2, zzi.u2, zzi.s2, zzi.r2};
        LIMB_SKELETAL_MUSCLE_AXIS_VALUE_M = new float[]{7.1f, 8.6f};
        LIMB_SKELETAL_MUSCLE_AXIS_VALUE_F = new float[]{5.5f, 6.5f};
        LIMB_SKELETAL_MUSCLE_SHORT_DESC = new int[]{i5, i9, i7};
        LIMB_SKELETAL_MUSCLE_DETAIL_DESC = new int[]{zzi.O2, zzi.P2, zzi.N2};
        BASAL_METABOLISM_AGE_29_M = new float[]{1318.0f, 2325.0f};
        BASAL_METABOLISM_AGE_30_49_M = new float[]{1275.0f, 1725.0f};
        BASAL_METABOLISM_AGE_50_69_M = new float[]{1148.0f, 1553.0f};
        BASAL_METABOLISM_AGE_70_M = new float[]{1037.0f, 1403.0f};
        BASAL_METABOLISM_AGE_29_F = new float[]{1029.0f, 1392.0f};
        BASAL_METABOLISM_AGE_30_49_F = new float[]{995.0f, 1346.0f};
        BASAL_METABOLISM_AGE_50_69_F = new float[]{944.0f, 1277.0f};
        BASAL_METABOLISM_AGE_70_F = new float[]{859.0f, 1162.0f};
        WHR_AXIS_VALUE_M = new float[]{0.8f, 0.9f};
        WHR_AXIS_VALUE_F = new float[]{0.75f, 0.85f};
        WHR_SHORT_DESC = new int[]{i5, i6, zzi.C1};
        WHR_DETAIL_DESC = new int[]{zzi.w3, zzi.x3, zzi.v3};
    }

    private WeightEvaluationHelper() {
    }

    private final WeightEvaluateDetail buildEvaluationData(int type, Number value, WeightItem weightItem, VirtualAccount virtualAccount) {
        if (unSupportedEvaluationTypeList.contains(Integer.valueOf(type))) {
            return null;
        }
        List<LevelBarView.LevelItem> bodyIndexLevelItems = getBodyIndexLevelItems(type, weightItem, virtualAccount);
        if (bodyIndexLevelItems.isEmpty()) {
            return null;
        }
        int bodyEvaluationPosition = getBodyEvaluationPosition(type, value.floatValue(), weightItem, virtualAccount);
        int[] axisShortDescArray = getAxisShortDescArray(type);
        int i = (bodyEvaluationPosition < 0 || bodyEvaluationPosition >= axisShortDescArray.length) ? -1 : axisShortDescArray[bodyEvaluationPosition];
        return new WeightEvaluateDetail(bodyIndexLevelItems, i < 0 ? null : ResourceExtKt.getString(i), getDetailDescByType(type, bodyEvaluationPosition), bodyEvaluationPosition, i >= 0 ? Boolean.valueOf(!getNormalStatus(type, i)) : null);
    }

    public static /* synthetic */ List createBodyCompositionDataList$default(WeightEvaluationHelper weightEvaluationHelper, WeightItem weightItem, FILTER filter, VirtualAccount virtualAccount, int i, Object obj) {
        if ((i & 2) != 0) {
            filter = FILTER.NONE;
        }
        return weightEvaluationHelper.createBodyCompositionDataList(weightItem, filter, virtualAccount);
    }

    public static /* synthetic */ String formatFloatValue$default(WeightEvaluationHelper weightEvaluationHelper, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return weightEvaluationHelper.formatFloatValue(i, f);
    }

    private final String formatWeightItemValue(int type, Number value) {
        switch (type) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 15:
                return formatFloatValue(1, value.floatValue());
            case 10:
            default:
                return value.toString();
            case 14:
                return formatFloatValue(0, value.floatValue());
        }
    }

    private final int[] getAxisColorArray(int type) {
        switch (type) {
            case 0:
            case 1:
            case 2:
                return COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING;
            case 3:
            case 4:
            case 7:
            case 8:
            case 13:
            case 14:
            case 15:
                return COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
            case 5:
                return COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD;
            case 6:
            case 10:
            case 11:
            default:
                return new int[0];
            case 9:
                return COMMON_TWO_SEGMENT_COLOR;
            case 12:
                return COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS;
        }
    }

    private final int[] getAxisShortDescArray(int type) {
        switch (type) {
            case 0:
                return BMI_SEGMENT_SHORT_DESC;
            case 1:
            case 2:
                return FAT_RATE_SHORT_DESC;
            case 3:
            case 4:
                return COMMON_THREE_SEGMENT_SHORT_DESC;
            case 5:
                return BODY_WATER_RATE_SHORT_DESC;
            case 6:
            case 10:
            case 11:
            default:
                return new int[0];
            case 7:
            case 8:
                return COMMON_THREE_SEGMENT_SHORT_DESC;
            case 9:
                return BONE_SALT_MASS_SHORT_DESC;
            case 12:
                return VISCERAL_FAT_SEGMENT_SHORT_DESC;
            case 13:
                return LIMB_SKELETAL_MUSCLE_SHORT_DESC;
            case 14:
                return COMMON_THREE_SEGMENT_SHORT_DESC;
            case 15:
                return WHR_SHORT_DESC;
        }
    }

    private final float[] getAxisValueArray(int type, WeightItem weightItem, VirtualAccount virtualAccount) {
        boolean zIsFemale = DataExtensionKt.isFemale(virtualAccount.getSex());
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        int age = weightInfoUtil.getAge(dateToString);
        int height = virtualAccount.getHeight();
        int i = 0;
        switch (type) {
            case 0:
                return BMI_AXIS_VALUE;
            case 1:
                return getFataRateAxisArray(age, zIsFemale);
            case 2:
                float[] fataRateAxisArray = getFataRateAxisArray(age, zIsFemale);
                float[] fArrCopyOf = Arrays.copyOf(fataRateAxisArray, fataRateAxisArray.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
                int length = fArrCopyOf.length;
                int i2 = 0;
                while (i < length) {
                    fArrCopyOf[i2] = (fArrCopyOf[i] * weightItem.getWeight()) / 100;
                    i++;
                    i2++;
                }
                return fArrCopyOf;
            case 3:
                return zIsFemale ? MUSCLE_RATE_AXIS_VALUE_F : MUSCLE_RATE_AXIS_VALUE_M;
            case 4:
                if (zIsFemale) {
                    if (height < 150) {
                        return MUSCLE_MASS_HEIGHT_150_F;
                    }
                    return height < 160 ? MUSCLE_MASS_HEIGHT_150_160_F : MUSCLE_MASS_HEIGHT_160_F;
                }
                if (height < 160) {
                    return MUSCLE_MASS_HEIGHT_160_M;
                }
                return height < 170 ? MUSCLE_MASS_HEIGHT_160_170_M : MUSCLE_MASS_HEIGHT_170_M;
            case 5:
                return zIsFemale ? BODY_WATER_RATE_AXIS_VALUE_F : BODY_WATER_RATE_AXIS_VALUE_M;
            case 6:
            case 10:
            case 11:
            default:
                return new float[0];
            case 7:
                return PROTEIN_RATE_AXIS_VALUE;
            case 8:
                return new float[]{weightItem.getWeight() * 0.16f, weightItem.getWeight() * 0.2f};
            case 9:
                float weight = weightItem.getWeight();
                if (!zIsFemale) {
                    return weight < 60.0f ? BONE_SALT_MASS_WEIGHT_BELOW_60_M : BONE_SALT_MASS_WEIGHT_UP_60_M;
                }
                if (weight < 45.0f) {
                    return BONE_SALT_MASS_WEIGHT_45_F;
                }
                return weight < 60.0f ? BONE_SALT_MASS_WEIGHT_45_60_F : BONE_SALT_MASS_WEIGHT_60_F;
            case 12:
                return VISCERAL_FAT_AXIS_VALUE;
            case 13:
                return zIsFemale ? LIMB_SKELETAL_MUSCLE_AXIS_VALUE_F : LIMB_SKELETAL_MUSCLE_AXIS_VALUE_M;
            case 14:
                if (zIsFemale) {
                    if (age < 30) {
                        return BASAL_METABOLISM_AGE_29_F;
                    }
                    if (age < 50) {
                        return BASAL_METABOLISM_AGE_30_49_F;
                    }
                    return age < 70 ? BASAL_METABOLISM_AGE_50_69_F : BASAL_METABOLISM_AGE_70_F;
                }
                if (age < 30) {
                    return BASAL_METABOLISM_AGE_29_M;
                }
                if (age < 50) {
                    return BASAL_METABOLISM_AGE_30_49_M;
                }
                return age < 70 ? BASAL_METABOLISM_AGE_50_69_M : BASAL_METABOLISM_AGE_70_M;
            case 15:
                return zIsFemale ? WHR_AXIS_VALUE_F : WHR_AXIS_VALUE_M;
        }
    }

    private final int getBodyEvaluationPosition(int type, float value, WeightItem weightItem, VirtualAccount virtualAccount) {
        float[] axisValueArray = getAxisValueArray(type, weightItem, virtualAccount);
        if (axisValueArray.length == 0) {
            return -1;
        }
        int length = axisValueArray.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (value >= axisValueArray[i2]) {
                i = i2 + 1;
            }
        }
        return i;
    }

    private final List<LevelBarView.LevelItem> getBodyIndexLevelItems(int type, WeightItem weightItem, VirtualAccount virtualAccount) {
        String str;
        ArrayList arrayList = new ArrayList();
        float[] axisValueArray = getAxisValueArray(type, weightItem, virtualAccount);
        int[] axisColorArray = getAxisColorArray(type);
        int[] axisShortDescArray = getAxisShortDescArray(type);
        if (axisColorArray.length == axisShortDescArray.length && axisValueArray.length + 1 == axisColorArray.length) {
            int length = axisColorArray.length;
            for (int i = 0; i < length; i++) {
                int i2 = axisColorArray[i];
                int i3 = axisShortDescArray[i];
                if (i < 0 || i >= axisValueArray.length) {
                    str = "";
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str = String.format("%s%s", Arrays.copyOf(new Object[]{formatWeightItemValue(type, Float.valueOf(axisValueArray[i])), getWeightItemUnit(type, weightItem)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                }
                arrayList.add(new LevelBarView.LevelItem(i2, i3, str));
            }
        }
        return arrayList;
    }

    private final String getDetailDescByType(int type, int position) {
        int[] iArr;
        String string;
        int[] iArr2;
        switch (type) {
            case 0:
                iArr = BMI_SEGMENT_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 1:
            case 2:
                iArr = FAT_RATE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 3:
                iArr = MUSCLE_RATE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 4:
                iArr = MUSCLE_MASS_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 5:
                iArr = BODY_WATER_RATE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 6:
            case 10:
            case 11:
            default:
                string = null;
                iArr2 = null;
                break;
            case 7:
            case 8:
                iArr = PROTEIN_RATE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 9:
                iArr = BONE_SALT_MASS_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 12:
                iArr = VISCERAL_FAT_SEGMENT_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 13:
                iArr = LIMB_SKELETAL_MUSCLE_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
            case 14:
                string = ResourceExtKt.getString(zzi.l1);
                iArr2 = null;
                break;
            case 15:
                iArr = WHR_DETAIL_DESC;
                iArr2 = iArr;
                string = null;
                break;
        }
        if (string != null) {
            return string;
        }
        if (iArr2 == null || position < 0 || position >= iArr2.length) {
            return null;
        }
        return ResourceExtKt.getString(iArr2[position]);
    }

    private final float[] getFataRateAxisArray(int age, boolean isFemale) {
        if (age <= 39) {
            return isFemale ? FAT_RATE_AXIS_VALUE_AGE_18_39_F : FAT_RATE_AXIS_VALUE_AGE_18_39_M;
        }
        if (age < 60) {
            return isFemale ? FAT_RATE_AXIS_VALUE_AGE_40_59_F : FAT_RATE_AXIS_VALUE_AGE_40_59_M;
        }
        return isFemale ? FAT_RATE_AXIS_VALUE_AGE_60_F : FAT_RATE_AXIS_VALUE_AGE_60_M;
    }

    private final boolean getNormalStatus(int type, int shortDescResId) {
        switch (type) {
            case 0:
                if (shortDescResId != BMI_SEGMENT_SHORT_DESC[1]) {
                    return false;
                }
                break;
            case 1:
            case 2:
                if (shortDescResId != FAT_RATE_SHORT_DESC[1]) {
                    return false;
                }
                break;
            case 3:
            case 4:
            case 7:
            case 8:
            case 14:
                if (shortDescResId != COMMON_THREE_SEGMENT_SHORT_DESC[1]) {
                    return false;
                }
                break;
            case 5:
                if (shortDescResId == BODY_WATER_RATE_SHORT_DESC[0]) {
                    return false;
                }
                break;
            case 6:
            case 10:
            case 11:
            default:
                return false;
            case 9:
                if (shortDescResId != BONE_SALT_MASS_SHORT_DESC[1]) {
                    return false;
                }
                break;
            case 12:
                if (shortDescResId != VISCERAL_FAT_SEGMENT_SHORT_DESC[0]) {
                    return false;
                }
                break;
            case 13:
                if (shortDescResId != LIMB_SKELETAL_MUSCLE_SHORT_DESC[1]) {
                    return false;
                }
                break;
            case 15:
                if (shortDescResId != WHR_SHORT_DESC[1]) {
                    return false;
                }
                break;
        }
        return true;
    }

    private final float getRecommendBMI() {
        return 21.25f;
    }

    private final String getWeightItemName(int type) {
        switch (type) {
            case 0:
                return ResourceExtKt.getString(zzi.s1);
            case 1:
                return ResourceExtKt.getString(zzi.B1);
            case 2:
                return ResourceExtKt.getString(zzi.K2);
            case 3:
                return ResourceExtKt.getString(zzi.W1);
            case 4:
                return ResourceExtKt.getString(zzi.R2);
            case 5:
                return ResourceExtKt.getString(zzi.v2);
            case 6:
                return ResourceExtKt.getString(zzi.V1);
            case 7:
                return ResourceExtKt.getString(zzi.Z2);
            case 8:
                return ResourceExtKt.getString(zzi.a3);
            case 9:
                return ResourceExtKt.getString(zzi.t1);
            case 10:
                return ResourceExtKt.getString(zzi.G2);
            case 11:
                return ResourceExtKt.getString(zzi.t3);
            case 12:
                return ResourceExtKt.getString(zzi.q2);
            case 13:
                return ResourceExtKt.getString(zzi.Q2);
            case 14:
                return ResourceExtKt.getString(zzi.r1);
            case 15:
                return ResourceExtKt.getString(zzi.Y2);
            case 16:
                return ResourceExtKt.getString(zzi.q1);
            case 17:
                return ResourceExtKt.getString(zzi.b3);
            default:
                return "";
        }
    }

    private final String getWeightItemUnit(int type, WeightItem weightItem) {
        switch (type) {
            case 0:
            case 12:
            case 13:
            case 15:
            default:
                return "";
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
                return LocaleUtil.INSTANCE.isTR() ? "" : "%";
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                return ResourceExtKt.getString(zzi.u3);
            case 14:
            case 17:
                return "kcal";
            case 16:
                Resources resources = ApplicationExtKt.getApplication().getResources();
                int i = oxi.common_unit_year_old;
                Integer bodyAge = weightItem.getBodyAge();
                Intrinsics.checkNotNull(bodyAge);
                String quantityString = resources.getQuantityString(i, bodyAge.intValue());
                Intrinsics.checkNotNull(quantityString);
                return quantityString;
        }
    }

    @NotNull
    public final WeightDataItem buildWeightDataByType(int type, @NotNull Number num, @NotNull WeightItem weightItem, @NotNull VirtualAccount virtualAccount) {
        Boolean abnormal;
        Intrinsics.checkNotNullParameter(num, "num");
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        String weightItemValue = formatWeightItemValue(type, num);
        String weightItemName = getWeightItemName(type);
        String weightItemUnit = getWeightItemUnit(type, weightItem);
        WeightEvaluateDetail weightEvaluateDetailBuildEvaluationData = buildEvaluationData(type, num, weightItem, virtualAccount);
        return new WeightDataItem(Integer.valueOf(type), weightItemValue, weightItemUnit, weightItemName, (weightEvaluateDetailBuildEvaluationData == null || (abnormal = weightEvaluateDetailBuildEvaluationData.getAbnormal()) == null) ? false : abnormal.booleanValue(), weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getLevelItems() : null, weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getEvaluateShortDesc() : null, weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getEvaluateDetailDesc() : null, weightEvaluateDetailBuildEvaluationData != null ? weightEvaluateDetailBuildEvaluationData.getCurrentLevelPosition() : -1);
    }

    @NotNull
    public final List<WeightDataItem> createBodyCompositionDataList(@NotNull WeightItem weightItem, @NotNull FILTER filter, @NotNull VirtualAccount virtualAccount) {
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        ArrayList arrayList = new ArrayList();
        Integer bodyScore = weightItem.getBodyScore();
        if (bodyScore == null || bodyScore.intValue() <= 0) {
            Float bmi = weightItem.getBmi();
            float fFloatValue = bmi != null ? bmi.floatValue() : 0.0f;
            if (fFloatValue > 0.0f) {
                arrayList.add(buildWeightDataByType(0, Float.valueOf(fFloatValue), weightItem, virtualAccount));
            }
            int height = virtualAccount.getHeight();
            if (height > 0) {
                arrayList.add(buildWeightDataByType(11, Float.valueOf(getSuggestedWeightByHeight(height / 100.0f)), weightItem, virtualAccount));
            }
            Float bodyFatRate = weightItem.getBodyFatRate();
            float fFloatValue2 = bodyFatRate != null ? bodyFatRate.floatValue() : 0.0f;
            if (fFloatValue2 > 0.0f) {
                arrayList.add(buildWeightDataByType(1, Float.valueOf(fFloatValue2), weightItem, virtualAccount));
            }
        }
        Float fatMass = weightItem.getFatMass();
        float fFloatValue3 = fatMass != null ? fatMass.floatValue() : 0.0f;
        if (fFloatValue3 > 0.0f) {
            arrayList.add(buildWeightDataByType(2, Float.valueOf(fFloatValue3), weightItem, virtualAccount));
        }
        Float muscleRate = weightItem.getMuscleRate();
        float fFloatValue4 = muscleRate != null ? muscleRate.floatValue() : 0.0f;
        if (fFloatValue4 > 0.0f) {
            arrayList.add(buildWeightDataByType(3, Float.valueOf(fFloatValue4), weightItem, virtualAccount));
        }
        Float muscleMass = weightItem.getMuscleMass();
        float fFloatValue5 = muscleMass != null ? muscleMass.floatValue() : 0.0f;
        if (fFloatValue5 > 0.0f) {
            arrayList.add(buildWeightDataByType(4, Float.valueOf(fFloatValue5), weightItem, virtualAccount));
        }
        Float moistureRate = weightItem.getMoistureRate();
        float fFloatValue6 = moistureRate != null ? moistureRate.floatValue() : 0.0f;
        if (fFloatValue6 > 0.0f) {
            arrayList.add(buildWeightDataByType(5, Float.valueOf(fFloatValue6), weightItem, virtualAccount));
        }
        Float boneSaltMass = weightItem.getBoneSaltMass();
        float fFloatValue7 = boneSaltMass != null ? boneSaltMass.floatValue() : 0.0f;
        if (fFloatValue7 > 0.0f) {
            arrayList.add(buildWeightDataByType(9, Float.valueOf(fFloatValue7), weightItem, virtualAccount));
        }
        Float proteinRate = weightItem.getProteinRate();
        float fFloatValue8 = proteinRate != null ? proteinRate.floatValue() : 0.0f;
        if (fFloatValue8 > 0.0f) {
            arrayList.add(buildWeightDataByType(7, Float.valueOf(fFloatValue8), weightItem, virtualAccount));
        }
        Float proteinMass = weightItem.getProteinMass();
        float fFloatValue9 = proteinMass != null ? proteinMass.floatValue() : 0.0f;
        if (fFloatValue9 > 0.0f) {
            arrayList.add(buildWeightDataByType(8, Float.valueOf(fFloatValue9), weightItem, virtualAccount));
        }
        Float visceralFat = weightItem.getVisceralFat();
        float fFloatValue10 = visceralFat != null ? visceralFat.floatValue() : 0.0f;
        if (fFloatValue10 > 0.0f) {
            arrayList.add(buildWeightDataByType(12, Float.valueOf(fFloatValue10), weightItem, virtualAccount));
        }
        Integer basalMetabolism = weightItem.getBasalMetabolism();
        int iIntValue = basalMetabolism != null ? basalMetabolism.intValue() : 0;
        if (iIntValue > 0) {
            arrayList.add(buildWeightDataByType(14, Integer.valueOf(iIntValue), weightItem, virtualAccount));
        }
        if (filter == FILTER.ABNORMAL_DATA) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((WeightDataItem) obj).getItemAbnormal()) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        if (filter != FILTER.NORMAL_DATA) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((WeightDataItem) obj2).getItemAbnormal()) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    @NotNull
    public final List<WeightDataItem> createIndexEvaluationDataList(@NotNull WeightItem weightItem, @NotNull VirtualAccount virtualAccount) {
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        ArrayList arrayList = new ArrayList();
        Float whr = weightItem.getWhr();
        float fFloatValue = whr != null ? whr.floatValue() : 0.0f;
        if (fFloatValue > 0.0f) {
            arrayList.add(buildWeightDataByType(15, Float.valueOf(fFloatValue), weightItem, virtualAccount));
        }
        Float limbsSkeletalMuscleIndex = weightItem.getLimbsSkeletalMuscleIndex();
        float fFloatValue2 = limbsSkeletalMuscleIndex != null ? limbsSkeletalMuscleIndex.floatValue() : 0.0f;
        if (fFloatValue2 > 0.0f) {
            arrayList.add(buildWeightDataByType(13, Float.valueOf(fFloatValue2), weightItem, virtualAccount));
        }
        Integer bodyAge = weightItem.getBodyAge();
        int iIntValue = bodyAge != null ? bodyAge.intValue() : 0;
        if (iIntValue > 0) {
            arrayList.add(buildWeightDataByType(16, Integer.valueOf(iIntValue), weightItem, virtualAccount));
        }
        Integer recommendedCaloriesIntake = weightItem.getRecommendedCaloriesIntake();
        int iIntValue2 = recommendedCaloriesIntake != null ? recommendedCaloriesIntake.intValue() : 0;
        if (iIntValue2 > 0) {
            arrayList.add(buildWeightDataByType(17, Integer.valueOf(iIntValue2), weightItem, virtualAccount));
        }
        return arrayList;
    }

    @NotNull
    public final String formatFloatValue(int scale, float value) {
        if (scale == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(String.valueOf(value)))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (scale != 2) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.getDefault(), "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(String.valueOf(value)))}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(String.valueOf(value)))}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    @NotNull
    public final int[] getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH() {
        return COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
    }

    @NotNull
    public final int[] getCOMMON_THREE_SEGMENT_SHORT_DESC() {
        return COMMON_THREE_SEGMENT_SHORT_DESC;
    }

    public final float getSuggestedWeightByHeight(float height) {
        return height * height * getRecommendBMI();
    }

    public final boolean shouldHideEvaluationIndexCardBasedOnFields(@NotNull WeightItem weightItem) {
        Integer recommendedCaloriesIntake;
        Integer bodyAge;
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        return (weightItem.getLimbsSkeletalMuscleIndex() == null || Intrinsics.areEqual(weightItem.getLimbsSkeletalMuscleIndex(), 0.0f)) && (weightItem.getBodyAge() == null || ((bodyAge = weightItem.getBodyAge()) != null && bodyAge.intValue() == 0)) && (weightItem.getRecommendedCaloriesIntake() == null || ((recommendedCaloriesIntake = weightItem.getRecommendedCaloriesIntake()) != null && recommendedCaloriesIntake.intValue() == 0)) && (weightItem.getWhr() == null || Intrinsics.areEqual(weightItem.getWhr(), 0.0f)) && (weightItem.getSomatotype() == null);
    }
}
