package com.xiaomi.fitness.electronic.scale.util;

import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import defpackage.f4b;
import defpackage.qal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/WeightInfoUtil;", "", "<init>", "()V", "getDateToString", "", "milSecond", "", "pattern", "parseDate", "Ljava/util/Date;", "strDate", "getFormatFloat", "", "data", "getAge", "", "birthDay", "recordWeight", "", "did", "zoneOffsetInSec", "currentTimeMillis", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightItemToVirtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "userId", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "weightResultToWeightItem", "pullRecordWhenConnected", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeightInfoUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightInfoUtil.kt\ncom/xiaomi/fitness/electronic/scale/util/WeightInfoUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,354:1\n1#2:355\n*E\n"})
public final class WeightInfoUtil {

    @NotNull
    public static final WeightInfoUtil INSTANCE = new WeightInfoUtil();

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil$recordWeight$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil$recordWeight$1", f = "WeightInfoUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ Ref.ObjectRef<WeightItem> $weightItem;
        final /* synthetic */ int $zoneOffsetInSec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<WeightItem> objectRef, String str, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$weightItem = objectRef;
            this.$did = str;
            this.$zoneOffsetInSec = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$weightItem, this.$did, this.$zoneOffsetInSec, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            qal.c("recordWeight() only weight weightItem : " + this.$weightItem.element);
            qal.c("recordWeight() only weight recordFlag : " + FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).recordWeight(this.$did, this.$zoneOffsetInSec, this.$weightItem.element));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil$recordWeight$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil$recordWeight$2", f = "WeightInfoUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $currentTimeMillis;
        final /* synthetic */ String $did;
        final /* synthetic */ Ref.ObjectRef<WeightItem> $weightItem;
        final /* synthetic */ WeightResult $weightResult;
        final /* synthetic */ int $zoneOffsetInSec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<WeightItem> objectRef, String str, int i, long j, WeightResult weightResult, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$weightItem = objectRef;
            this.$did = str;
            this.$zoneOffsetInSec = i;
            this.$currentTimeMillis = j;
            this.$weightResult = weightResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$weightItem, this.$did, this.$zoneOffsetInSec, this.$currentTimeMillis, this.$weightResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            qal.c("recordWeight() weightItem : " + this.$weightItem.element);
            FitnessDataRecorder.Companion companion = FitnessDataRecorder.INSTANCE;
            qal.c("recordWeight() recordFlag : " + FitnessDataExtKt.getInstance(companion).recordWeight(this.$did, this.$zoneOffsetInSec, this.$weightItem.element));
            HrItem hrItem = new HrItem(this.$currentTimeMillis / ((long) 1000), this.$weightResult.getHeartRate());
            qal.c("recordWeight() heartItem : " + hrItem);
            qal.c("recordWeight() heartRecordFlag : " + FitnessDataExtKt.getInstance(companion).recordManualHr(this.$did, this.$zoneOffsetInSec, hrItem));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private WeightInfoUtil() {
    }

    public final int getAge(@NotNull String strDate) {
        Intrinsics.checkNotNullParameter(strDate, "strDate");
        return getAge(parseDate(strDate));
    }

    @Nullable
    public final String getDateToString(long milSecond, @Nullable String pattern) {
        return new SimpleDateFormat(pattern).format(new Date(milSecond));
    }

    public final float getFormatFloat(float data) {
        if (Float.isNaN(data)) {
            Logger.e("data is NaN", new Object[0]);
            return 0.0f;
        }
        String str = new DecimalFormat(".0").format(Float.valueOf(data));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return Float.parseFloat(str);
    }

    @NotNull
    public final Date parseDate(@NotNull String strDate) throws ParseException {
        Intrinsics.checkNotNullParameter(strDate, "strDate");
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
        return date;
    }

    public final void pullRecordWhenConnected() {
        ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE).pullRecord(true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, com.xiaomi.fit.fitness.export.data.item.WeightItem] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.xiaomi.fit.fitness.export.data.item.WeightItem] */
    public final void recordWeight(@NotNull String did, int zoneOffsetInSec, long currentTimeMillis, @NotNull WeightResult weightResult) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        if (weightResult.getMeasuringImpedance1() == 0 || weightResult.getMeasuringImpedance2() == 0 || weightResult.getMeasuringImpedance3() == 0 || weightResult.getMeasuringImpedance4() == 0 || weightResult.getMeasuringImpedance5() == 0 || weightResult.getMeasuringImpedance6() == 0 || weightResult.getMeasuringImpedance7() == 0 || weightResult.getMeasuringImpedance8() == 0 || weightResult.getMeasuringImpedance9() == 0 || weightResult.getMeasuringImpedance10() == 0 || weightResult.getMeasuringImpedance11() == 0 || weightResult.getMeasuringImpedance12() == 0 || weightResult.getBfp() == 0.0f) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new WeightItem(currentTimeMillis / ((long) 1000), getFormatFloat(weightResult.getWeight()), null);
            AnyExtKt.io$default(null, new AnonymousClass1(objectRef, did, zoneOffsetInSec, null), 1, null);
            return;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ?? weightItem = new WeightItem(currentTimeMillis / ((long) 1000), getFormatFloat(weightResult.getWeight()), Float.valueOf(getFormatFloat(weightResult.getBmi())));
        objectRef2.element = weightItem;
        weightItem.setBodyFatRate(Float.valueOf(getFormatFloat(weightResult.getBfp())));
        ((WeightItem) objectRef2.element).setMoistureRate(Float.valueOf(getFormatFloat(weightResult.getBwp())));
        ((WeightItem) objectRef2.element).setBoneSaltMass(Float.valueOf(getFormatFloat(weightResult.getBmc())));
        float f = 100;
        ((WeightItem) objectRef2.element).setBoneSaltRate(Float.valueOf(getFormatFloat((weightResult.getBmc() * f) / weightResult.getWeight())));
        ((WeightItem) objectRef2.element).setBasalMetabolism(Integer.valueOf((int) getFormatFloat(weightResult.getBmr())));
        ((WeightItem) objectRef2.element).setMuscleRate(Float.valueOf(getFormatFloat((weightResult.getSlm() * f) / weightResult.getWeight())));
        ((WeightItem) objectRef2.element).setProteinRate(Float.valueOf(getFormatFloat((weightResult.getPm() * f) / weightResult.getWeight())));
        ((WeightItem) objectRef2.element).setVisceralFat(Float.valueOf(weightResult.getVfr()));
        ((WeightItem) objectRef2.element).setBodyMoistureMass(Float.valueOf(getFormatFloat(weightResult.getBwm())));
        ((WeightItem) objectRef2.element).setProteinMass(Float.valueOf(getFormatFloat(weightResult.getPm())));
        ((WeightItem) objectRef2.element).setFatMass(Float.valueOf(getFormatFloat(weightResult.getBfm())));
        ((WeightItem) objectRef2.element).setMuscleMass(Float.valueOf(getFormatFloat(weightResult.getSlm())));
        ((WeightItem) objectRef2.element).setLimbsSkeletalMuscleIndex(Float.valueOf(getFormatFloat(weightResult.getLimBmi())));
        ((WeightItem) objectRef2.element).setLeftUpperLimbMuscleMass(Float.valueOf(getFormatFloat(weightResult.getLam())));
        ((WeightItem) objectRef2.element).setRightUpperLimbMuscleMass(Float.valueOf(getFormatFloat(weightResult.getRam())));
        ((WeightItem) objectRef2.element).setTrunkMuscleMass(Float.valueOf(getFormatFloat(weightResult.getTm())));
        ((WeightItem) objectRef2.element).setLeftLowerLimbMuscleMass(Float.valueOf(getFormatFloat(weightResult.getLlm())));
        ((WeightItem) objectRef2.element).setRightLowerLimbMuscleMass(Float.valueOf(getFormatFloat(weightResult.getRlm())));
        ((WeightItem) objectRef2.element).setUpperLimbMuscleBalance(Integer.valueOf(weightResult.getEoma()));
        ((WeightItem) objectRef2.element).setLowerLimbMuscleBalance(Integer.valueOf(weightResult.getEoml()));
        ((WeightItem) objectRef2.element).setLimbsMuscleBalance(Integer.valueOf(weightResult.getEomb()));
        ((WeightItem) objectRef2.element).setLeftUpperLimbFatMass(Float.valueOf(getFormatFloat(weightResult.getLafm())));
        ((WeightItem) objectRef2.element).setRightUpperLimbFatMass(Float.valueOf(getFormatFloat(weightResult.getRafm())));
        ((WeightItem) objectRef2.element).setTrunkFatMass(Float.valueOf(getFormatFloat(weightResult.getTfm())));
        ((WeightItem) objectRef2.element).setLeftLowerLimbFatMass(Float.valueOf(getFormatFloat(weightResult.getLlfm())));
        ((WeightItem) objectRef2.element).setRightLowerLimbFatMass(Float.valueOf(getFormatFloat(weightResult.getRlfm())));
        ((WeightItem) objectRef2.element).setUpperLimbFatBalance(Integer.valueOf(weightResult.getEofa()));
        ((WeightItem) objectRef2.element).setLowerLimbFatBalance(Integer.valueOf(weightResult.getEofl()));
        ((WeightItem) objectRef2.element).setLimbsFatBalance(Integer.valueOf(weightResult.getEofb()));
        ((WeightItem) objectRef2.element).setSomatotype(Integer.valueOf(weightResult.getBt()));
        ((WeightItem) objectRef2.element).setBodyShape(Integer.valueOf(weightResult.getBs()));
        ((WeightItem) objectRef2.element).setWhr(Float.valueOf(getFormatFloat(weightResult.getWhr())));
        ((WeightItem) objectRef2.element).setBmp(Integer.valueOf(weightResult.getHeartRate()));
        ((WeightItem) objectRef2.element).setBodyScore(Integer.valueOf(weightResult.getSbc()));
        ((WeightItem) objectRef2.element).setBodyAge(Integer.valueOf(weightResult.getMa()));
        ((WeightItem) objectRef2.element).setStandardWeight(Integer.valueOf((int) getFormatFloat(weightResult.getSbw())));
        ((WeightItem) objectRef2.element).setRecommendedCaloriesIntake(Integer.valueOf(weightResult.getCin()));
        ((WeightItem) objectRef2.element).setFatControl(Float.valueOf(getFormatFloat(weightResult.getFControl())));
        ((WeightItem) objectRef2.element).setWeightControl(Float.valueOf(getFormatFloat(weightResult.getWControl())));
        ((WeightItem) objectRef2.element).setMuscleControl(Float.valueOf(getFormatFloat(weightResult.getMControl())));
        ((WeightItem) objectRef2.element).setLeftUpperLimbFatLevel(Integer.valueOf(weightResult.getLafms()));
        ((WeightItem) objectRef2.element).setRightUpperLimbFatLevel(Integer.valueOf(weightResult.getRafms()));
        ((WeightItem) objectRef2.element).setTrunkFatLevel(Integer.valueOf(weightResult.getTfms()));
        ((WeightItem) objectRef2.element).setLeftLowerLimbFatLevel(Integer.valueOf(weightResult.getLlfms()));
        ((WeightItem) objectRef2.element).setRightLowerLimbFatLevel(Integer.valueOf(weightResult.getRlfms()));
        ((WeightItem) objectRef2.element).setLeftUpperLimbMuscleLevel(Integer.valueOf(weightResult.getLams()));
        ((WeightItem) objectRef2.element).setRightUpperLimbMuscleLevel(Integer.valueOf(weightResult.getRams()));
        ((WeightItem) objectRef2.element).setTrunkMuscleLevel(Integer.valueOf(weightResult.getTms()));
        ((WeightItem) objectRef2.element).setLeftLowerLimbMuscleLevel(Integer.valueOf(weightResult.getLlms()));
        ((WeightItem) objectRef2.element).setRightLowerLimbMuscleLevel(Integer.valueOf(weightResult.getRlms()));
        AnyExtKt.io$default(null, new AnonymousClass2(objectRef2, did, zoneOffsetInSec, currentTimeMillis, weightResult, null), 1, null);
    }

    @NotNull
    public final VirtualAccount weightItemToVirtualAccount(@NotNull String userId, @NotNull WeightItem weightItem) {
        float fIntValue;
        short sFloatValue;
        byte bIntValue;
        byte bIntValue2;
        byte bIntValue3;
        byte bIntValue4;
        byte bIntValue5;
        byte bIntValue6;
        short sIntValue;
        short sIntValue2;
        int iIntValue;
        byte bIntValue7;
        byte bIntValue8;
        int iIntValue2;
        short sIntValue3;
        short sIntValue4;
        short sIntValue5;
        short sIntValue6;
        short sIntValue7;
        short sIntValue8;
        short sIntValue9;
        short sIntValue10;
        short sIntValue11;
        Float whr;
        Float rightLowerLimbFatMass;
        Float leftLowerLimbFatMass;
        Float trunkFatMass;
        Float rightUpperLimbFatMass;
        Float leftUpperLimbFatMass;
        Float rightLowerLimbMuscleMass;
        Float leftLowerLimbMuscleMass;
        Float trunkMuscleMass;
        Float rightUpperLimbMuscleMass;
        Float leftUpperLimbMuscleMass;
        Float limbsSkeletalMuscleIndex;
        Float muscleMass;
        Float fatMass;
        Float proteinMass;
        Float bodyMoistureMass;
        Float boneSaltMass;
        Float moistureRate;
        Float bodyFatRate;
        Float bmi;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        WeightResult weightResult = new WeightResult(0, null, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (short) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0L, -1, -1, 3, null);
        weightResult.setWeight(weightItem.getWeight());
        float fIntValue2 = 0.0f;
        weightResult.setBmi((weightItem.getBmi() == null || (bmi = weightItem.getBmi()) == null) ? 0.0f : bmi.floatValue());
        weightResult.setBfp((weightItem.getBodyFatRate() == null || (bodyFatRate = weightItem.getBodyFatRate()) == null) ? 0.0f : bodyFatRate.floatValue());
        weightResult.setBwp((weightItem.getMoistureRate() == null || (moistureRate = weightItem.getMoistureRate()) == null) ? 0.0f : moistureRate.floatValue());
        weightResult.setBmc((weightItem.getBoneSaltMass() == null || (boneSaltMass = weightItem.getBoneSaltMass()) == null) ? 0.0f : boneSaltMass.floatValue());
        if (weightItem.getBasalMetabolism() != null) {
            Integer basalMetabolism = weightItem.getBasalMetabolism();
            Intrinsics.checkNotNull(basalMetabolism);
            fIntValue = basalMetabolism.intValue();
        } else {
            fIntValue = 0.0f;
        }
        weightResult.setBmr(fIntValue);
        short sIntValue12 = 0;
        if (weightItem.getVisceralFat() != null) {
            Float visceralFat = weightItem.getVisceralFat();
            Intrinsics.checkNotNull(visceralFat);
            sFloatValue = (short) visceralFat.floatValue();
        } else {
            sFloatValue = 0;
        }
        weightResult.setVfr(sFloatValue);
        weightResult.setBwm((weightItem.getBodyMoistureMass() == null || (bodyMoistureMass = weightItem.getBodyMoistureMass()) == null) ? 0.0f : bodyMoistureMass.floatValue());
        weightResult.setPm((weightItem.getProteinMass() == null || (proteinMass = weightItem.getProteinMass()) == null) ? 0.0f : proteinMass.floatValue());
        weightResult.setBfm((weightItem.getFatMass() == null || (fatMass = weightItem.getFatMass()) == null) ? 0.0f : fatMass.floatValue());
        weightResult.setSlm((weightItem.getMuscleMass() == null || (muscleMass = weightItem.getMuscleMass()) == null) ? 0.0f : muscleMass.floatValue());
        weightResult.setLimBmi((weightItem.getLimbsSkeletalMuscleIndex() == null || (limbsSkeletalMuscleIndex = weightItem.getLimbsSkeletalMuscleIndex()) == null) ? 0.0f : limbsSkeletalMuscleIndex.floatValue());
        weightResult.setLam((weightItem.getLeftUpperLimbMuscleMass() == null || (leftUpperLimbMuscleMass = weightItem.getLeftUpperLimbMuscleMass()) == null) ? 0.0f : leftUpperLimbMuscleMass.floatValue());
        weightResult.setRam((weightItem.getRightUpperLimbMuscleMass() == null || (rightUpperLimbMuscleMass = weightItem.getRightUpperLimbMuscleMass()) == null) ? 0.0f : rightUpperLimbMuscleMass.floatValue());
        weightResult.setTm((weightItem.getTrunkMuscleMass() == null || (trunkMuscleMass = weightItem.getTrunkMuscleMass()) == null) ? 0.0f : trunkMuscleMass.floatValue());
        weightResult.setLlm((weightItem.getLeftLowerLimbMuscleMass() == null || (leftLowerLimbMuscleMass = weightItem.getLeftLowerLimbMuscleMass()) == null) ? 0.0f : leftLowerLimbMuscleMass.floatValue());
        weightResult.setRlm((weightItem.getRightLowerLimbMuscleMass() == null || (rightLowerLimbMuscleMass = weightItem.getRightLowerLimbMuscleMass()) == null) ? 0.0f : rightLowerLimbMuscleMass.floatValue());
        if (weightItem.getUpperLimbMuscleBalance() != null) {
            Integer upperLimbMuscleBalance = weightItem.getUpperLimbMuscleBalance();
            Intrinsics.checkNotNull(upperLimbMuscleBalance);
            bIntValue = (byte) upperLimbMuscleBalance.intValue();
        } else {
            bIntValue = 0;
        }
        weightResult.setEoma(bIntValue);
        if (weightItem.getLowerLimbMuscleBalance() != null) {
            Integer lowerLimbMuscleBalance = weightItem.getLowerLimbMuscleBalance();
            Intrinsics.checkNotNull(lowerLimbMuscleBalance);
            bIntValue2 = (byte) lowerLimbMuscleBalance.intValue();
        } else {
            bIntValue2 = 0;
        }
        weightResult.setEoml(bIntValue2);
        if (weightItem.getLimbsMuscleBalance() != null) {
            Integer limbsMuscleBalance = weightItem.getLimbsMuscleBalance();
            Intrinsics.checkNotNull(limbsMuscleBalance);
            bIntValue3 = (byte) limbsMuscleBalance.intValue();
        } else {
            bIntValue3 = 0;
        }
        weightResult.setEomb(bIntValue3);
        weightResult.setLafm((weightItem.getLeftUpperLimbFatMass() == null || (leftUpperLimbFatMass = weightItem.getLeftUpperLimbFatMass()) == null) ? 0.0f : leftUpperLimbFatMass.floatValue());
        weightResult.setRafm((weightItem.getRightUpperLimbFatMass() == null || (rightUpperLimbFatMass = weightItem.getRightUpperLimbFatMass()) == null) ? 0.0f : rightUpperLimbFatMass.floatValue());
        weightResult.setTfm((weightItem.getTrunkFatMass() == null || (trunkFatMass = weightItem.getTrunkFatMass()) == null) ? 0.0f : trunkFatMass.floatValue());
        weightResult.setLlfm((weightItem.getLeftLowerLimbFatMass() == null || (leftLowerLimbFatMass = weightItem.getLeftLowerLimbFatMass()) == null) ? 0.0f : leftLowerLimbFatMass.floatValue());
        weightResult.setRlfm((weightItem.getRightLowerLimbFatMass() == null || (rightLowerLimbFatMass = weightItem.getRightLowerLimbFatMass()) == null) ? 0.0f : rightLowerLimbFatMass.floatValue());
        if (weightItem.getUpperLimbFatBalance() != null) {
            Integer upperLimbFatBalance = weightItem.getUpperLimbFatBalance();
            Intrinsics.checkNotNull(upperLimbFatBalance);
            bIntValue4 = (byte) upperLimbFatBalance.intValue();
        } else {
            bIntValue4 = 0;
        }
        weightResult.setEofa(bIntValue4);
        if (weightItem.getLowerLimbFatBalance() != null) {
            Integer lowerLimbFatBalance = weightItem.getLowerLimbFatBalance();
            Intrinsics.checkNotNull(lowerLimbFatBalance);
            bIntValue5 = (byte) lowerLimbFatBalance.intValue();
        } else {
            bIntValue5 = 0;
        }
        weightResult.setEofl(bIntValue5);
        if (weightItem.getLimbsFatBalance() != null) {
            Integer limbsFatBalance = weightItem.getLimbsFatBalance();
            Intrinsics.checkNotNull(limbsFatBalance);
            bIntValue6 = (byte) limbsFatBalance.intValue();
        } else {
            bIntValue6 = 0;
        }
        weightResult.setEofb(bIntValue6);
        if (weightItem.getSomatotype() != null) {
            Integer somatotype = weightItem.getSomatotype();
            Intrinsics.checkNotNull(somatotype);
            sIntValue = (short) somatotype.intValue();
        } else {
            sIntValue = 0;
        }
        weightResult.setBt(sIntValue);
        if (weightItem.getBodyShape() != null) {
            Integer bodyShape = weightItem.getBodyShape();
            Intrinsics.checkNotNull(bodyShape);
            sIntValue2 = (short) bodyShape.intValue();
        } else {
            sIntValue2 = 0;
        }
        weightResult.setBs(sIntValue2);
        weightResult.setWhr((weightItem.getWhr() == null || (whr = weightItem.getWhr()) == null) ? 0.0f : whr.floatValue());
        if (weightItem.getBmp() != null) {
            Integer bmp = weightItem.getBmp();
            Intrinsics.checkNotNull(bmp);
            iIntValue = bmp.intValue();
        } else {
            iIntValue = 0;
        }
        weightResult.setHeartRate(iIntValue);
        if (weightItem.getBodyScore() != null) {
            Integer bodyScore = weightItem.getBodyScore();
            Intrinsics.checkNotNull(bodyScore);
            bIntValue7 = (byte) bodyScore.intValue();
        } else {
            bIntValue7 = 0;
        }
        weightResult.setSbc(bIntValue7);
        if (weightItem.getBodyAge() != null) {
            Integer bodyAge = weightItem.getBodyAge();
            Intrinsics.checkNotNull(bodyAge);
            bIntValue8 = (byte) bodyAge.intValue();
        } else {
            bIntValue8 = 0;
        }
        weightResult.setMa(bIntValue8);
        if (weightItem.getStandardWeight() != null) {
            Integer standardWeight = weightItem.getStandardWeight();
            Intrinsics.checkNotNull(standardWeight);
            fIntValue2 = standardWeight.intValue();
        }
        weightResult.setSbw(fIntValue2);
        if (weightItem.getRecommendedCaloriesIntake() != null) {
            Integer recommendedCaloriesIntake = weightItem.getRecommendedCaloriesIntake();
            Intrinsics.checkNotNull(recommendedCaloriesIntake);
            iIntValue2 = recommendedCaloriesIntake.intValue();
        } else {
            iIntValue2 = 0;
        }
        weightResult.setCin(iIntValue2);
        weightResult.setUserId(userId);
        weightResult.setTime(weightItem.getTime() * ((long) 1000));
        if (weightItem.getLeftUpperLimbFatLevel() != null) {
            Integer leftUpperLimbFatLevel = weightItem.getLeftUpperLimbFatLevel();
            Intrinsics.checkNotNull(leftUpperLimbFatLevel);
            sIntValue3 = (short) leftUpperLimbFatLevel.intValue();
        } else {
            sIntValue3 = 0;
        }
        weightResult.setLafms(sIntValue3);
        if (weightItem.getRightUpperLimbFatLevel() != null) {
            Integer rightUpperLimbFatLevel = weightItem.getRightUpperLimbFatLevel();
            Intrinsics.checkNotNull(rightUpperLimbFatLevel);
            sIntValue4 = (short) rightUpperLimbFatLevel.intValue();
        } else {
            sIntValue4 = 0;
        }
        weightResult.setRafms(sIntValue4);
        if (weightItem.getTrunkFatLevel() != null) {
            Integer trunkFatLevel = weightItem.getTrunkFatLevel();
            Intrinsics.checkNotNull(trunkFatLevel);
            sIntValue5 = (short) trunkFatLevel.intValue();
        } else {
            sIntValue5 = 0;
        }
        weightResult.setTfms(sIntValue5);
        if (weightItem.getLeftLowerLimbFatLevel() != null) {
            Integer leftLowerLimbFatLevel = weightItem.getLeftLowerLimbFatLevel();
            Intrinsics.checkNotNull(leftLowerLimbFatLevel);
            sIntValue6 = (short) leftLowerLimbFatLevel.intValue();
        } else {
            sIntValue6 = 0;
        }
        weightResult.setLlfms(sIntValue6);
        if (weightItem.getRightLowerLimbFatLevel() != null) {
            Integer rightLowerLimbFatLevel = weightItem.getRightLowerLimbFatLevel();
            Intrinsics.checkNotNull(rightLowerLimbFatLevel);
            sIntValue7 = (short) rightLowerLimbFatLevel.intValue();
        } else {
            sIntValue7 = 0;
        }
        weightResult.setRlfms(sIntValue7);
        if (weightItem.getLeftUpperLimbMuscleLevel() != null) {
            Integer leftUpperLimbMuscleLevel = weightItem.getLeftUpperLimbMuscleLevel();
            Intrinsics.checkNotNull(leftUpperLimbMuscleLevel);
            sIntValue8 = (short) leftUpperLimbMuscleLevel.intValue();
        } else {
            sIntValue8 = 0;
        }
        weightResult.setLams(sIntValue8);
        if (weightItem.getRightUpperLimbMuscleLevel() != null) {
            Integer rightUpperLimbMuscleLevel = weightItem.getRightUpperLimbMuscleLevel();
            Intrinsics.checkNotNull(rightUpperLimbMuscleLevel);
            sIntValue9 = (short) rightUpperLimbMuscleLevel.intValue();
        } else {
            sIntValue9 = 0;
        }
        weightResult.setRams(sIntValue9);
        if (weightItem.getTrunkMuscleLevel() != null) {
            Integer trunkMuscleLevel = weightItem.getTrunkMuscleLevel();
            Intrinsics.checkNotNull(trunkMuscleLevel);
            sIntValue10 = (short) trunkMuscleLevel.intValue();
        } else {
            sIntValue10 = 0;
        }
        weightResult.setTms(sIntValue10);
        if (weightItem.getLeftLowerLimbMuscleLevel() != null) {
            Integer leftLowerLimbMuscleLevel = weightItem.getLeftLowerLimbMuscleLevel();
            Intrinsics.checkNotNull(leftLowerLimbMuscleLevel);
            sIntValue11 = (short) leftLowerLimbMuscleLevel.intValue();
        } else {
            sIntValue11 = 0;
        }
        weightResult.setLlms(sIntValue11);
        if (weightItem.getRightLowerLimbMuscleLevel() != null) {
            Integer rightLowerLimbMuscleLevel = weightItem.getRightLowerLimbMuscleLevel();
            Intrinsics.checkNotNull(rightLowerLimbMuscleLevel);
            sIntValue12 = (short) rightLowerLimbMuscleLevel.intValue();
        }
        weightResult.setRlms(sIntValue12);
        virtualAccount.setBodyComposition(f4b.c(weightResult));
        return virtualAccount;
    }

    @NotNull
    public final WeightItem weightResultToWeightItem(@NotNull WeightResult weightResult) {
        Intrinsics.checkNotNullParameter(weightResult, "weightResult");
        if (weightResult.getMeasuringImpedance1() == 0 || weightResult.getMeasuringImpedance2() == 0 || weightResult.getMeasuringImpedance3() == 0 || weightResult.getMeasuringImpedance4() == 0 || weightResult.getMeasuringImpedance5() == 0 || weightResult.getMeasuringImpedance6() == 0 || weightResult.getMeasuringImpedance7() == 0 || weightResult.getMeasuringImpedance8() == 0 || weightResult.getMeasuringImpedance9() == 0 || weightResult.getMeasuringImpedance10() == 0 || weightResult.getMeasuringImpedance11() == 0 || weightResult.getMeasuringImpedance12() == 0 || weightResult.getBfp() == 0.0f) {
            WeightItem weightItem = new WeightItem(weightResult.getTime() / ((long) 1000), getFormatFloat(weightResult.getWeight()), null);
            qal.c("recordWeight() only weight weightItem : " + weightItem);
            return weightItem;
        }
        WeightItem weightItem2 = new WeightItem(weightResult.getTime() / ((long) 1000), getFormatFloat(weightResult.getWeight()), Float.valueOf(getFormatFloat(weightResult.getBmi())));
        weightItem2.setBodyFatRate(Float.valueOf(getFormatFloat(weightResult.getBfp())));
        weightItem2.setMoistureRate(Float.valueOf(getFormatFloat(weightResult.getBwp())));
        weightItem2.setBoneSaltMass(Float.valueOf(getFormatFloat(weightResult.getBmc())));
        float f = 100;
        weightItem2.setBoneSaltRate(Float.valueOf(getFormatFloat((weightResult.getBmc() * f) / weightResult.getWeight())));
        weightItem2.setBasalMetabolism(Integer.valueOf((int) getFormatFloat(weightResult.getBmr())));
        weightItem2.setMuscleRate(Float.valueOf(getFormatFloat((weightResult.getSlm() * f) / weightResult.getWeight())));
        weightItem2.setProteinRate(Float.valueOf(getFormatFloat((weightResult.getPm() * f) / weightResult.getWeight())));
        weightItem2.setVisceralFat(Float.valueOf(weightResult.getVfr()));
        weightItem2.setBodyMoistureMass(Float.valueOf(getFormatFloat(weightResult.getBwm())));
        weightItem2.setProteinMass(Float.valueOf(getFormatFloat(weightResult.getPm())));
        weightItem2.setFatMass(Float.valueOf(getFormatFloat(weightResult.getBfm())));
        weightItem2.setMuscleMass(Float.valueOf(getFormatFloat(weightResult.getSlm())));
        weightItem2.setLimbsSkeletalMuscleIndex(Float.valueOf(getFormatFloat(weightResult.getLimBmi())));
        weightItem2.setLeftUpperLimbMuscleMass(Float.valueOf(getFormatFloat(weightResult.getLam())));
        weightItem2.setRightUpperLimbMuscleMass(Float.valueOf(getFormatFloat(weightResult.getRam())));
        weightItem2.setTrunkMuscleMass(Float.valueOf(getFormatFloat(weightResult.getTm())));
        weightItem2.setLeftLowerLimbMuscleMass(Float.valueOf(getFormatFloat(weightResult.getLlm())));
        weightItem2.setRightLowerLimbMuscleMass(Float.valueOf(getFormatFloat(weightResult.getRlm())));
        weightItem2.setUpperLimbMuscleBalance(Integer.valueOf(weightResult.getEoma()));
        weightItem2.setLowerLimbMuscleBalance(Integer.valueOf(weightResult.getEoml()));
        weightItem2.setLimbsMuscleBalance(Integer.valueOf(weightResult.getEomb()));
        weightItem2.setLeftUpperLimbFatMass(Float.valueOf(getFormatFloat(weightResult.getLafm())));
        weightItem2.setRightUpperLimbFatMass(Float.valueOf(getFormatFloat(weightResult.getRafm())));
        weightItem2.setTrunkFatMass(Float.valueOf(getFormatFloat(weightResult.getTfm())));
        weightItem2.setLeftLowerLimbFatMass(Float.valueOf(getFormatFloat(weightResult.getLlfm())));
        weightItem2.setRightLowerLimbFatMass(Float.valueOf(getFormatFloat(weightResult.getRlfm())));
        weightItem2.setUpperLimbFatBalance(Integer.valueOf(weightResult.getEofa()));
        weightItem2.setLowerLimbFatBalance(Integer.valueOf(weightResult.getEofl()));
        weightItem2.setLimbsFatBalance(Integer.valueOf(weightResult.getEofb()));
        weightItem2.setSomatotype(Integer.valueOf(weightResult.getBt()));
        weightItem2.setBodyShape(Integer.valueOf(weightResult.getBs()));
        weightItem2.setWhr(Float.valueOf(getFormatFloat(weightResult.getWhr())));
        weightItem2.setBmp(Integer.valueOf(weightResult.getHeartRate()));
        weightItem2.setBodyScore(Integer.valueOf(weightResult.getSbc()));
        weightItem2.setBodyAge(Integer.valueOf(weightResult.getMa()));
        weightItem2.setStandardWeight(Integer.valueOf((int) getFormatFloat(weightResult.getSbw())));
        weightItem2.setRecommendedCaloriesIntake(Integer.valueOf(weightResult.getCin()));
        weightItem2.setFatControl(Float.valueOf(getFormatFloat(weightResult.getFControl())));
        weightItem2.setWeightControl(Float.valueOf(getFormatFloat(weightResult.getWControl())));
        weightItem2.setMuscleControl(Float.valueOf(getFormatFloat(weightResult.getMControl())));
        weightItem2.setLeftUpperLimbFatLevel(Integer.valueOf(weightResult.getLafms()));
        weightItem2.setRightUpperLimbFatLevel(Integer.valueOf(weightResult.getRafms()));
        weightItem2.setTrunkFatLevel(Integer.valueOf(weightResult.getTfms()));
        weightItem2.setLeftLowerLimbFatLevel(Integer.valueOf(weightResult.getLlfms()));
        weightItem2.setRightLowerLimbFatLevel(Integer.valueOf(weightResult.getRlfms()));
        weightItem2.setLeftUpperLimbMuscleLevel(Integer.valueOf(weightResult.getLams()));
        weightItem2.setRightUpperLimbMuscleLevel(Integer.valueOf(weightResult.getRams()));
        weightItem2.setTrunkMuscleLevel(Integer.valueOf(weightResult.getTms()));
        weightItem2.setLeftLowerLimbMuscleLevel(Integer.valueOf(weightResult.getLlms()));
        weightItem2.setRightLowerLimbMuscleLevel(Integer.valueOf(weightResult.getRlms()));
        qal.c("weightResultToWeightItem() weightItem : " + weightItem2);
        return weightItem2;
    }

    public final int getAge(@Nullable Date birthDay) {
        Calendar calendar = Calendar.getInstance();
        if (!(!calendar.before(birthDay))) {
            throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!".toString());
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTime(birthDay);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        int i7 = i - i4;
        if (i2 <= i5) {
            return (i2 != i5 || i3 < i6) ? i7 - 1 : i7;
        }
        return i7;
    }
}
