package com.xiaomi.fitness.rn.modules;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.gson.annotations.SerializedName;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer;
import com.xiaomi.fit.fitness.eco.sync.export.di.EcoFitnessSyncExtKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import defpackage.h4b;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/rn/modules/MiWearDBModule;", "Lcom/xiaomi/fitness/rn/modules/BaseNativeModule;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "insertUserWeightToDatabaseFromPlugin", "", "json", "callback", "Lcom/facebook/react/bridge/Callback;", "deleteUserWeightFromDatabase", "did", "timeInMilli", "", "insertSportDataToDatabase", "params", "Lcom/facebook/react/bridge/ReadableMap;", "hexStringToByteArray", "", "hexString", "syncData", "data", "RnWeightBean", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiWearDBModule extends BaseNativeModule {

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.modules.MiWearDBModule$deleteUserWeightFromDatabase$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.modules.MiWearDBModule$deleteUserWeightFromDatabase$1", f = "MiWearDBModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ long $timeInMilli;
        int label;
        final /* synthetic */ MiWearDBModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, String str, MiWearDBModule miWearDBModule, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$timeInMilli = j;
            this.$did = str;
            this.this$0 = miWearDBModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$timeInMilli, this.$did, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeightItem weightItem = new WeightItem(this.$timeInMilli / ((long) 1000), 0.0f, Boxing.boxFloat(0.0f));
            weightItem.setSid(this.$did);
            boolean zDeleteWeight = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).deleteWeight(weightItem);
            Logger.i(String.valueOf(this.this$0.getName()), "deleteUserWeightFromDatabase(" + zDeleteWeight + "): " + weightItem);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.modules.MiWearDBModule$insertSportDataToDatabase$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.modules.MiWearDBModule$insertSportDataToDatabase$1", f = "MiWearDBModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ ReadableArray $dailyData;
        final /* synthetic */ String $did;
        final /* synthetic */ boolean $needJumpToReportPage;
        final /* synthetic */ String $recordDataString;
        final /* synthetic */ String $reportDataString;
        final /* synthetic */ int $sportType;
        final /* synthetic */ int $startTimestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28791(String str, String str2, String str3, ReadableArray readableArray, boolean z, int i, Callback callback, int i2, Continuation<? super C28791> continuation) {
            super(2, continuation);
            this.$reportDataString = str;
            this.$did = str2;
            this.$recordDataString = str3;
            this.$dailyData = readableArray;
            this.$needJumpToReportPage = z;
            this.$sportType = i;
            this.$callback = callback;
            this.$startTimestamp = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MiWearDBModule.this.new C28791(this.$reportDataString, this.$did, this.$recordDataString, this.$dailyData, this.$needJumpToReportPage, this.$sportType, this.$callback, this.$startTimestamp, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MiWearDBModule.this.syncData(this.$did, MiWearDBModule.this.hexStringToByteArray(this.$reportDataString));
            String str = this.$recordDataString;
            if (str != null && str.length() != 0) {
                MiWearDBModule.this.syncData(this.$did, MiWearDBModule.this.hexStringToByteArray(this.$recordDataString));
            }
            ReadableArray readableArray = this.$dailyData;
            if (readableArray != null && readableArray.size() > 0) {
                Iterator<Object> it = this.$dailyData.toArrayList().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    MiWearDBModule miWearDBModule = MiWearDBModule.this;
                    miWearDBModule.syncData(this.$did, miWearDBModule.hexStringToByteArray(next.toString()));
                }
            }
            EcoFitnessSyncer ecoFitnessSyncExtKt = EcoFitnessSyncExtKt.getInstance(EcoFitnessSyncer.INSTANCE);
            String str2 = this.$did;
            final MiWearDBModule miWearDBModule2 = MiWearDBModule.this;
            final boolean z = this.$needJumpToReportPage;
            final int i = this.$sportType;
            final Callback callback = this.$callback;
            final int i2 = this.$startTimestamp;
            ecoFitnessSyncExtKt.addSyncResultListener(str2, new EcoDeviceSyncCallback() { // from class: com.xiaomi.fitness.rn.modules.MiWearDBModule.insertSportDataToDatabase.1.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
                public void onSyncError(String did, int type, String errorInfo) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    Logger.i(miWearDBModule2.getName(), "onSyncError() did= (" + did + "),同步失败，errorInfo is ：" + errorInfo);
                    callback.invoke(Boolean.FALSE);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
                public void onSyncSuccess(String did, int type, Object result) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    Logger.i(miWearDBModule2.getName(), "syncData() did= (" + did + ") ,同步成功");
                    if (!z) {
                        callback.invoke(Boolean.TRUE);
                        return;
                    }
                    if (miWearDBModule2.getReactApplicationContext().getCurrentActivity() == null) {
                        Logger.i(miWearDBModule2.getName(), "syncData() reactApplicationContext.currentActivity == null");
                        return;
                    }
                    Logger.i(miWearDBModule2.getName(), "syncData() sportType = " + i);
                    AnyExtKt.main$default(null, new MiWearDBModule$insertSportDataToDatabase$1$1$onSyncSuccess$1(miWearDBModule2, did, i2, i, callback, null), 1, null);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.modules.MiWearDBModule$insertUserWeightToDatabaseFromPlugin$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.modules.MiWearDBModule$insertUserWeightToDatabaseFromPlugin$1", f = "MiWearDBModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ String $did;
        final /* synthetic */ WeightItem $weightItem;
        int label;
        final /* synthetic */ MiWearDBModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28801(String str, WeightItem weightItem, MiWearDBModule miWearDBModule, Callback callback, Continuation<? super C28801> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$weightItem = weightItem;
            this.this$0 = miWearDBModule;
            this.$callback = callback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28801(this.$did, this.$weightItem, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
            FitnessDataRecorder.Companion companion = FitnessDataRecorder.INSTANCE;
            boolean zRecordWeight = FitnessDataExtKt.getInstance(companion).recordWeight(this.$did, currentTZOffsetInSec, this.$weightItem);
            Logger.i(String.valueOf(this.this$0.getName()), "insertUserWeightToDatabaseFromPlugin(" + zRecordWeight + "): " + this.$weightItem);
            if (zRecordWeight) {
                HealthPageExtKt.getInstance(IHealthPage.INSTANCE).notifyWeightChanged();
                UserInformationManager.DefaultImpls.sendProfile$default(UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE), 0, this.$weightItem.getWeight(), null, null, null, null, null, null, 248, null);
            }
            Callback callback = this.$callback;
            if (callback != null) {
                callback.invoke(Boxing.boxBoolean(zRecordWeight));
            }
            Integer bmp = this.$weightItem.getBmp();
            if (bmp != null && bmp.intValue() > 0) {
                long time = this.$weightItem.getTime();
                Integer bmp2 = this.$weightItem.getBmp();
                Intrinsics.checkNotNull(bmp2);
                HrItem hrItem = new HrItem(time, bmp2.intValue());
                boolean zRecordManualHr = FitnessDataExtKt.getInstance(companion).recordManualHr(this.$did, currentTZOffsetInSec, hrItem);
                Logger.i(String.valueOf(this.this$0.getName()), "insertUserWeightToDatabaseFromPlugin(" + zRecordManualHr + "): " + hrItem);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiWearDBModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
    }

    @ReactMethod
    public final void deleteUserWeightFromDatabase(@NotNull String did, long timeInMilli) {
        Intrinsics.checkNotNullParameter(did, "did");
        AnyExtKt.io$default(null, new AnonymousClass1(timeInMilli, did, this, null), 1, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "MiWearDataBase";
    }

    @NotNull
    public final byte[] hexStringToByteArray(@NotNull String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String strSubstring = hexString.substring(i2, i2 + 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            bArr[i] = (byte) Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
        }
        return bArr;
    }

    @ReactMethod
    public final void insertSportDataToDatabase(@NotNull ReadableMap params, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strValueOf = String.valueOf(params.getString("did"));
        String strValueOf2 = String.valueOf(params.getString("reportDataString"));
        String strValueOf3 = String.valueOf(params.getString("recordDataString"));
        ReadableArray array = params.getArray("dailyData");
        int i = params.getInt("startTimestamp");
        boolean z = params.getBoolean("needJumpToReportPage");
        int i2 = params.hasKey(DailyRecordKey.sportType) ? params.getInt(DailyRecordKey.sportType) : 14;
        Logger.i(getName(), "insertSportDataToDatabase() " + i + " " + z + " " + i2);
        AnyExtKt.io$default(null, new C28791(strValueOf2, strValueOf, strValueOf3, array, z, i2, callback, i, null), 1, null);
    }

    @ReactMethod
    public final void insertUserWeightToDatabaseFromPlugin(@NotNull String json, @Nullable Callback callback) {
        RnWeightBean rnWeightBean;
        Intrinsics.checkNotNullParameter(json, "json");
        Logger.i(String.valueOf(getName()), "insertUserWeightToDatabaseFromPlugin:" + json);
        try {
            rnWeightBean = (RnWeightBean) h4b.d(json, RnWeightBean.class);
        } catch (Exception e) {
            Logger.i(String.valueOf(getName()), "insertUserWeightToDatabaseFromPlugin", e);
            rnWeightBean = null;
        }
        if (rnWeightBean == null) {
            Logger.i(String.valueOf(getName()), "insertUserWeightToDatabaseFromPlugin: parse error");
            if (callback != null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        String did = rnWeightBean.getDid();
        if (did == null || did.length() == 0) {
            Logger.i(String.valueOf(getName()), "insertUserWeightToDatabaseFromPlugin: did is null");
            if (callback != null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        WeightItem weightItem = new WeightItem(rnWeightBean.getTime(), rnWeightBean.getWeight(), Float.valueOf(rnWeightBean.getBmi()));
        weightItem.setBodyFatRate(rnWeightBean.getBfp());
        weightItem.setMoistureRate(rnWeightBean.getBwp());
        weightItem.setBoneSaltMass(rnWeightBean.getBmc());
        weightItem.setBoneSaltRate(rnWeightBean.getBmcp());
        String bmr = rnWeightBean.getBmr();
        weightItem.setBasalMetabolism(bmr != null ? Integer.valueOf(Integer.parseInt(bmr)) : null);
        weightItem.setProteinRate(rnWeightBean.getPp());
        String vfl = rnWeightBean.getVfl();
        weightItem.setVisceralFat(vfl != null ? Float.valueOf(Float.parseFloat(vfl)) : null);
        weightItem.setBodyMoistureMass(rnWeightBean.getBwm());
        weightItem.setProteinMass(rnWeightBean.getPm());
        weightItem.setFatMass(rnWeightBean.getBfm());
        weightItem.setMuscleMass(rnWeightBean.getSlm());
        weightItem.setMuscleRate(rnWeightBean.getSlp());
        weightItem.setWhr(rnWeightBean.getWhr());
        String heartRate = rnWeightBean.getHeartRate();
        weightItem.setBmp(heartRate != null ? Integer.valueOf(Integer.parseInt(heartRate)) : null);
        String bt = rnWeightBean.getBt();
        weightItem.setSomatotype(bt != null ? Integer.valueOf(Integer.parseInt(bt)) : null);
        String sbc = rnWeightBean.getSbc();
        weightItem.setBodyScore(sbc != null ? Integer.valueOf(Integer.parseInt(sbc)) : null);
        String ma = rnWeightBean.getMa();
        weightItem.setBodyAge(ma != null ? Integer.valueOf(Integer.parseInt(ma)) : null);
        weightItem.setStandardWeightV2(rnWeightBean.getSwt());
        weightItem.setFatControl(rnWeightBean.getFc());
        weightItem.setWeightControl(rnWeightBean.getWc());
        weightItem.setMuscleControl(rnWeightBean.getMc());
        weightItem.setSkeletalMuscleMass(rnWeightBean.getSmm());
        weightItem.setFatFreeBody(rnWeightBean.getFfm());
        Integer scoreStandardType = rnWeightBean.getScoreStandardType();
        weightItem.setScoreStandardType(Integer.valueOf(scoreStandardType != null ? scoreStandardType.intValue() : 1));
        weightItem.setBodyShape(rnWeightBean.getBs());
        weightItem.setRecommendedCaloriesIntake(rnWeightBean.getCin());
        weightItem.setLimbsSkeletalMuscleIndex(rnWeightBean.getLimbmi());
        weightItem.setLeftUpperLimbMuscleMass(rnWeightBean.getLam());
        weightItem.setRightUpperLimbMuscleMass(rnWeightBean.getRam());
        weightItem.setTrunkMuscleMass(rnWeightBean.getTm());
        weightItem.setLeftLowerLimbMuscleMass(rnWeightBean.getLlm());
        weightItem.setRightLowerLimbMuscleMass(rnWeightBean.getRlm());
        weightItem.setUpperLimbMuscleBalance(rnWeightBean.getEoma());
        weightItem.setLowerLimbMuscleBalance(rnWeightBean.getEoml());
        weightItem.setLimbsMuscleBalance(rnWeightBean.getEomb());
        weightItem.setLeftUpperLimbMuscleLevel(rnWeightBean.getLam_s());
        weightItem.setRightUpperLimbMuscleLevel(rnWeightBean.getRam_s());
        weightItem.setTrunkMuscleLevel(rnWeightBean.getTm_s());
        weightItem.setLeftLowerLimbMuscleLevel(rnWeightBean.getLlm_s());
        weightItem.setRightLowerLimbMuscleLevel(rnWeightBean.getRlm_s());
        weightItem.setLeftUpperLimbFatMass(rnWeightBean.getLarm());
        weightItem.setRightUpperLimbFatMass(rnWeightBean.getRafm());
        weightItem.setTrunkFatMass(rnWeightBean.getTfm());
        weightItem.setLeftLowerLimbFatMass(rnWeightBean.getLlfm());
        weightItem.setRightLowerLimbFatMass(rnWeightBean.getRlfm());
        weightItem.setUpperLimbFatBalance(rnWeightBean.getEofa());
        weightItem.setLowerLimbFatBalance(rnWeightBean.getEofl());
        weightItem.setLimbsFatBalance(rnWeightBean.getEofb());
        weightItem.setLeftUpperLimbFatLevel(rnWeightBean.getLarm_s());
        weightItem.setRightUpperLimbFatLevel(rnWeightBean.getRafm_s());
        weightItem.setTrunkFatLevel(rnWeightBean.getTfm_s());
        weightItem.setLeftLowerLimbFatLevel(rnWeightBean.getLlfm_s());
        weightItem.setRightLowerLimbFatLevel(rnWeightBean.getRlfm_s());
        AnyExtKt.io$default(null, new C28801(did, weightItem, this, callback, null), 1, null);
    }

    public final void syncData(@NotNull String did, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(data, "data");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        int length = data.length;
        byte[] bArr = new byte[7];
        byte[] bArr2 = new byte[length - 7];
        byteBufferOrder.clear();
        byteBufferOrder.get(bArr);
        byteBufferOrder.get(bArr2);
        Logger.i(getName(), "syncData received " + length);
        EcoFitnessSyncExtKt.getInstance(EcoFitnessSyncer.INSTANCE).syncData(did, bArr, bArr2);
    }

    @Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\b\n\u0003\bß\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010#¢\u0006\u0004\bA\u0010BJ\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010É\u0001\u001a\u00020\tHÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\tHÆ\u0003J\u0011\u0010Ì\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Í\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Î\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ï\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ð\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ñ\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ó\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ô\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Õ\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ö\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010×\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ù\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ú\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Û\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ü\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010Ý\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010â\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ã\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0011\u0010ä\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0012\u0010å\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010æ\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ç\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0011\u0010è\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010é\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010ê\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010ë\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010ì\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0012\u0010í\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010î\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ï\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ð\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ñ\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ò\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ó\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ô\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0011\u0010õ\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010ö\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010÷\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010ø\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010ù\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010XJ\u0012\u0010ú\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010û\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ü\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ý\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010þ\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0012\u0010ÿ\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001JÎ\u0005\u0010\u0080\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010#2\n\b\u0002\u00100\u001a\u0004\u0018\u00010#2\n\b\u0002\u00101\u001a\u0004\u0018\u00010#2\n\b\u0002\u00102\u001a\u0004\u0018\u00010#2\n\b\u0002\u00103\u001a\u0004\u0018\u00010#2\n\b\u0002\u00104\u001a\u0004\u0018\u00010#2\n\b\u0002\u00105\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0003\u0010\u0081\u0002J\u0017\u0010\u0082\u0002\u001a\u00030\u0083\u00022\n\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0085\u0002HÖ\u0003J\n\u0010\u0086\u0002\u001a\u00020#HÖ\u0001J\n\u0010\u0087\u0002\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010D\"\u0004\bH\u0010FR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010D\"\u0004\bT\u0010FR\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010P\"\u0004\bV\u0010RR\u001e\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001e\u0010\r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\b^\u0010X\"\u0004\b_\u0010ZR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\b`\u0010X\"\u0004\ba\u0010ZR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bb\u0010X\"\u0004\bc\u0010ZR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bd\u0010X\"\u0004\be\u0010ZR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bf\u0010X\"\u0004\bg\u0010ZR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bh\u0010X\"\u0004\bi\u0010ZR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bj\u0010X\"\u0004\bk\u0010ZR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bl\u0010X\"\u0004\bm\u0010ZR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bn\u0010X\"\u0004\bo\u0010ZR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bp\u0010X\"\u0004\bq\u0010ZR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010D\"\u0004\bs\u0010FR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bt\u0010X\"\u0004\bu\u0010ZR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bv\u0010X\"\u0004\bw\u0010ZR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bx\u0010X\"\u0004\by\u0010ZR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bz\u0010X\"\u0004\b{\u0010ZR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\b|\u0010X\"\u0004\b}\u0010ZR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010D\"\u0004\b\u007f\u0010FR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010D\"\u0005\b\u0081\u0001\u0010FR\u001e\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010D\"\u0005\b\u0083\u0001\u0010FR\u001e\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010D\"\u0005\b\u0085\u0001\u0010FR#\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R#\u0010$\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u0087\u0001\"\u0006\b\u008c\u0001\u0010\u0089\u0001R \u0010%\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b\u008d\u0001\u0010X\"\u0005\b\u008e\u0001\u0010ZR#\u0010&\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u008f\u0001\u0010\u0087\u0001\"\u0006\b\u0090\u0001\u0010\u0089\u0001R#\u0010'\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0091\u0001\u0010\u0087\u0001\"\u0006\b\u0092\u0001\u0010\u0089\u0001R#\u0010(\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0093\u0001\u0010\u0087\u0001\"\u0006\b\u0094\u0001\u0010\u0089\u0001R \u0010)\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b\u0095\u0001\u0010X\"\u0005\b\u0096\u0001\u0010ZR \u0010*\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b\u0097\u0001\u0010X\"\u0005\b\u0098\u0001\u0010ZR \u0010+\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b\u0099\u0001\u0010X\"\u0005\b\u009a\u0001\u0010ZR \u0010,\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b\u009b\u0001\u0010X\"\u0005\b\u009c\u0001\u0010ZR \u0010-\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b\u009d\u0001\u0010X\"\u0005\b\u009e\u0001\u0010ZR#\u0010.\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u009f\u0001\u0010\u0087\u0001\"\u0006\b \u0001\u0010\u0089\u0001R#\u0010/\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b¡\u0001\u0010\u0087\u0001\"\u0006\b¢\u0001\u0010\u0089\u0001R#\u00100\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b£\u0001\u0010\u0087\u0001\"\u0006\b¤\u0001\u0010\u0089\u0001R#\u00101\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b¥\u0001\u0010\u0087\u0001\"\u0006\b¦\u0001\u0010\u0089\u0001R#\u00102\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b§\u0001\u0010\u0087\u0001\"\u0006\b¨\u0001\u0010\u0089\u0001R#\u00103\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b©\u0001\u0010\u0087\u0001\"\u0006\bª\u0001\u0010\u0089\u0001R#\u00104\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b«\u0001\u0010\u0087\u0001\"\u0006\b¬\u0001\u0010\u0089\u0001R#\u00105\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u00ad\u0001\u0010\u0087\u0001\"\u0006\b®\u0001\u0010\u0089\u0001R \u00106\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b¯\u0001\u0010X\"\u0005\b°\u0001\u0010ZR \u00107\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b±\u0001\u0010X\"\u0005\b²\u0001\u0010ZR \u00108\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b³\u0001\u0010X\"\u0005\b´\u0001\u0010ZR \u00109\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\bµ\u0001\u0010X\"\u0005\b¶\u0001\u0010ZR \u0010:\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010[\u001a\u0005\b·\u0001\u0010X\"\u0005\b¸\u0001\u0010ZR#\u0010;\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b¹\u0001\u0010\u0087\u0001\"\u0006\bº\u0001\u0010\u0089\u0001R#\u0010<\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b»\u0001\u0010\u0087\u0001\"\u0006\b¼\u0001\u0010\u0089\u0001R#\u0010=\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b½\u0001\u0010\u0087\u0001\"\u0006\b¾\u0001\u0010\u0089\u0001R#\u0010>\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b¿\u0001\u0010\u0087\u0001\"\u0006\bÀ\u0001\u0010\u0089\u0001R#\u0010?\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\bÁ\u0001\u0010\u0087\u0001\"\u0006\bÂ\u0001\u0010\u0089\u0001R'\u0010@\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\bÃ\u0001\u0010\u0087\u0001\"\u0006\bÄ\u0001\u0010\u0089\u0001¨\u0006\u0088\u0002"}, d2 = {"Lcom/xiaomi/fitness/rn/modules/MiWearDBModule$RnWeightBean;", "Ljava/io/Serializable;", "did", "", "miid", "duid", "time", "", "weight", "", "heartRate", "bmi", "bfp", "slm", SleepInfo.KEY_SLEEP_INFO, "bmc", "bmcp", "bwm", "bwp", "pm", "pp", "bfm", "ffm", "smm", "vfl", "swt", "whr", "wc", "mc", "fc", "bmr", "bt", "ma", "sbc", "bs", "", "cin", "limbmi", "eofa", "eofl", "eofb", "larm", "rafm", "tfm", "llfm", "rlfm", "larm_s", "rafm_s", "tfm_s", "llfm_s", "rlfm_s", "eoma", "eoml", "eomb", "lam", "ram", "tm", "llm", "rlm", "lam_s", "ram_s", "tm_s", "llm_s", "rlm_s", "scoreStandardType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JFLjava/lang/String;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getMiid", "setMiid", "getDuid", "setDuid", "getTime", "()J", "setTime", "(J)V", "getWeight", "()F", "setWeight", "(F)V", "getHeartRate", "setHeartRate", "getBmi", "setBmi", "getBfp", "()Ljava/lang/Float;", "setBfp", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getSlm", "setSlm", "getSlp", "setSlp", "getBmc", "setBmc", "getBmcp", "setBmcp", "getBwm", "setBwm", "getBwp", "setBwp", "getPm", "setPm", "getPp", "setPp", "getBfm", "setBfm", "getFfm", "setFfm", "getSmm", "setSmm", "getVfl", "setVfl", "getSwt", "setSwt", "getWhr", "setWhr", "getWc", "setWc", "getMc", "setMc", "getFc", "setFc", "getBmr", "setBmr", "getBt", "setBt", "getMa", "setMa", "getSbc", "setSbc", "getBs", "()Ljava/lang/Integer;", "setBs", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCin", "setCin", "getLimbmi", "setLimbmi", "getEofa", "setEofa", "getEofl", "setEofl", "getEofb", "setEofb", "getLarm", "setLarm", "getRafm", "setRafm", "getTfm", "setTfm", "getLlfm", "setLlfm", "getRlfm", "setRlfm", "getLarm_s", "setLarm_s", "getRafm_s", "setRafm_s", "getTfm_s", "setTfm_s", "getLlfm_s", "setLlfm_s", "getRlfm_s", "setRlfm_s", "getEoma", "setEoma", "getEoml", "setEoml", "getEomb", "setEomb", "getLam", "setLam", "getRam", "setRam", "getTm", "setTm", "getLlm", "setLlm", "getRlm", "setRlm", "getLam_s", "setLam_s", "getRam_s", "setRam_s", "getTm_s", "setTm_s", "getLlm_s", "setLlm_s", "getRlm_s", "setRlm_s", "getScoreStandardType", "setScoreStandardType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JFLjava/lang/String;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fitness/rn/modules/MiWearDBModule$RnWeightBean;", "equals", "", "other", "", "hashCode", "toString", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RnWeightBean implements Serializable {

        @Nullable
        private Float bfm;

        @Nullable
        private Float bfp;

        @Nullable
        private Float bmc;

        @Nullable
        private Float bmcp;
        private float bmi;

        @Nullable
        private String bmr;

        @Nullable
        private Integer bs;

        @Nullable
        private String bt;

        @Nullable
        private Float bwm;

        @Nullable
        private Float bwp;

        @Nullable
        private Integer cin;

        @Nullable
        private String did;

        @Nullable
        private String duid;

        @Nullable
        private Integer eofa;

        @Nullable
        private Integer eofb;

        @Nullable
        private Integer eofl;

        @Nullable
        private Integer eoma;

        @Nullable
        private Integer eomb;

        @Nullable
        private Integer eoml;

        @Nullable
        private Float fc;

        @Nullable
        private Float ffm;

        @Nullable
        private String heartRate;

        @Nullable
        private Float lam;

        @Nullable
        private Integer lam_s;

        @Nullable
        private Float larm;

        @Nullable
        private Integer larm_s;

        @Nullable
        private Float limbmi;

        @Nullable
        private Float llfm;

        @Nullable
        private Integer llfm_s;

        @Nullable
        private Float llm;

        @Nullable
        private Integer llm_s;

        @Nullable
        private String ma;

        @Nullable
        private Float mc;

        @Nullable
        private String miid;

        @Nullable
        private Float pm;

        @Nullable
        private Float pp;

        @Nullable
        private Float rafm;

        @Nullable
        private Integer rafm_s;

        @Nullable
        private Float ram;

        @Nullable
        private Integer ram_s;

        @Nullable
        private Float rlfm;

        @Nullable
        private Integer rlfm_s;

        @Nullable
        private Float rlm;

        @Nullable
        private Integer rlm_s;

        @Nullable
        private String sbc;

        @SerializedName("score_standard_type")
        @Nullable
        private Integer scoreStandardType;

        @Nullable
        private Float slm;

        @Nullable
        private Float slp;

        @Nullable
        private Float smm;

        @Nullable
        private Float swt;

        @Nullable
        private Float tfm;

        @Nullable
        private Integer tfm_s;
        private long time;

        @Nullable
        private Float tm;

        @Nullable
        private Integer tm_s;

        @Nullable
        private String vfl;

        @Nullable
        private Float wc;
        private float weight;

        @Nullable
        private Float whr;

        public RnWeightBean(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, float f, @Nullable String str4, float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Float f6, @Nullable Float f7, @Nullable Float f8, @Nullable Float f9, @Nullable Float f10, @Nullable Float f11, @Nullable Float f12, @Nullable Float f13, @Nullable Float f14, @Nullable String str5, @Nullable Float f15, @Nullable Float f16, @Nullable Float f17, @Nullable Float f18, @Nullable Float f19, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f20, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Float f21, @Nullable Float f22, @Nullable Float f23, @Nullable Float f24, @Nullable Float f25, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Float f26, @Nullable Float f27, @Nullable Float f28, @Nullable Float f29, @Nullable Float f30, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19) {
            this.did = str;
            this.miid = str2;
            this.duid = str3;
            this.time = j;
            this.weight = f;
            this.heartRate = str4;
            this.bmi = f2;
            this.bfp = f3;
            this.slm = f4;
            this.slp = f5;
            this.bmc = f6;
            this.bmcp = f7;
            this.bwm = f8;
            this.bwp = f9;
            this.pm = f10;
            this.pp = f11;
            this.bfm = f12;
            this.ffm = f13;
            this.smm = f14;
            this.vfl = str5;
            this.swt = f15;
            this.whr = f16;
            this.wc = f17;
            this.mc = f18;
            this.fc = f19;
            this.bmr = str6;
            this.bt = str7;
            this.ma = str8;
            this.sbc = str9;
            this.bs = num;
            this.cin = num2;
            this.limbmi = f20;
            this.eofa = num3;
            this.eofl = num4;
            this.eofb = num5;
            this.larm = f21;
            this.rafm = f22;
            this.tfm = f23;
            this.llfm = f24;
            this.rlfm = f25;
            this.larm_s = num6;
            this.rafm_s = num7;
            this.tfm_s = num8;
            this.llfm_s = num9;
            this.rlfm_s = num10;
            this.eoma = num11;
            this.eoml = num12;
            this.eomb = num13;
            this.lam = f26;
            this.ram = f27;
            this.tm = f28;
            this.llm = f29;
            this.rlm = f30;
            this.lam_s = num14;
            this.ram_s = num15;
            this.tm_s = num16;
            this.llm_s = num17;
            this.rlm_s = num18;
            this.scoreStandardType = num19;
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDid() {
            return this.did;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Float getSlp() {
            return this.slp;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Float getBmc() {
            return this.bmc;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Float getBmcp() {
            return this.bmcp;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Float getBwm() {
            return this.bwm;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final Float getBwp() {
            return this.bwp;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final Float getPm() {
            return this.pm;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Float getPp() {
            return this.pp;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final Float getBfm() {
            return this.bfm;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final Float getFfm() {
            return this.ffm;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Float getSmm() {
            return this.smm;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMiid() {
            return this.miid;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getVfl() {
            return this.vfl;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Float getSwt() {
            return this.swt;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Float getWhr() {
            return this.whr;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final Float getWc() {
            return this.wc;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Float getMc() {
            return this.mc;
        }

        @Nullable
        /* JADX INFO: renamed from: component25, reason: from getter */
        public final Float getFc() {
            return this.fc;
        }

        @Nullable
        /* JADX INFO: renamed from: component26, reason: from getter */
        public final String getBmr() {
            return this.bmr;
        }

        @Nullable
        /* JADX INFO: renamed from: component27, reason: from getter */
        public final String getBt() {
            return this.bt;
        }

        @Nullable
        /* JADX INFO: renamed from: component28, reason: from getter */
        public final String getMa() {
            return this.ma;
        }

        @Nullable
        /* JADX INFO: renamed from: component29, reason: from getter */
        public final String getSbc() {
            return this.sbc;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDuid() {
            return this.duid;
        }

        @Nullable
        /* JADX INFO: renamed from: component30, reason: from getter */
        public final Integer getBs() {
            return this.bs;
        }

        @Nullable
        /* JADX INFO: renamed from: component31, reason: from getter */
        public final Integer getCin() {
            return this.cin;
        }

        @Nullable
        /* JADX INFO: renamed from: component32, reason: from getter */
        public final Float getLimbmi() {
            return this.limbmi;
        }

        @Nullable
        /* JADX INFO: renamed from: component33, reason: from getter */
        public final Integer getEofa() {
            return this.eofa;
        }

        @Nullable
        /* JADX INFO: renamed from: component34, reason: from getter */
        public final Integer getEofl() {
            return this.eofl;
        }

        @Nullable
        /* JADX INFO: renamed from: component35, reason: from getter */
        public final Integer getEofb() {
            return this.eofb;
        }

        @Nullable
        /* JADX INFO: renamed from: component36, reason: from getter */
        public final Float getLarm() {
            return this.larm;
        }

        @Nullable
        /* JADX INFO: renamed from: component37, reason: from getter */
        public final Float getRafm() {
            return this.rafm;
        }

        @Nullable
        /* JADX INFO: renamed from: component38, reason: from getter */
        public final Float getTfm() {
            return this.tfm;
        }

        @Nullable
        /* JADX INFO: renamed from: component39, reason: from getter */
        public final Float getLlfm() {
            return this.llfm;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @Nullable
        /* JADX INFO: renamed from: component40, reason: from getter */
        public final Float getRlfm() {
            return this.rlfm;
        }

        @Nullable
        /* JADX INFO: renamed from: component41, reason: from getter */
        public final Integer getLarm_s() {
            return this.larm_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component42, reason: from getter */
        public final Integer getRafm_s() {
            return this.rafm_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component43, reason: from getter */
        public final Integer getTfm_s() {
            return this.tfm_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component44, reason: from getter */
        public final Integer getLlfm_s() {
            return this.llfm_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component45, reason: from getter */
        public final Integer getRlfm_s() {
            return this.rlfm_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component46, reason: from getter */
        public final Integer getEoma() {
            return this.eoma;
        }

        @Nullable
        /* JADX INFO: renamed from: component47, reason: from getter */
        public final Integer getEoml() {
            return this.eoml;
        }

        @Nullable
        /* JADX INFO: renamed from: component48, reason: from getter */
        public final Integer getEomb() {
            return this.eomb;
        }

        @Nullable
        /* JADX INFO: renamed from: component49, reason: from getter */
        public final Float getLam() {
            return this.lam;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getWeight() {
            return this.weight;
        }

        @Nullable
        /* JADX INFO: renamed from: component50, reason: from getter */
        public final Float getRam() {
            return this.ram;
        }

        @Nullable
        /* JADX INFO: renamed from: component51, reason: from getter */
        public final Float getTm() {
            return this.tm;
        }

        @Nullable
        /* JADX INFO: renamed from: component52, reason: from getter */
        public final Float getLlm() {
            return this.llm;
        }

        @Nullable
        /* JADX INFO: renamed from: component53, reason: from getter */
        public final Float getRlm() {
            return this.rlm;
        }

        @Nullable
        /* JADX INFO: renamed from: component54, reason: from getter */
        public final Integer getLam_s() {
            return this.lam_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component55, reason: from getter */
        public final Integer getRam_s() {
            return this.ram_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component56, reason: from getter */
        public final Integer getTm_s() {
            return this.tm_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component57, reason: from getter */
        public final Integer getLlm_s() {
            return this.llm_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component58, reason: from getter */
        public final Integer getRlm_s() {
            return this.rlm_s;
        }

        @Nullable
        /* JADX INFO: renamed from: component59, reason: from getter */
        public final Integer getScoreStandardType() {
            return this.scoreStandardType;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getHeartRate() {
            return this.heartRate;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final float getBmi() {
            return this.bmi;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Float getBfp() {
            return this.bfp;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Float getSlm() {
            return this.slm;
        }

        @NotNull
        public final RnWeightBean copy(@Nullable String did, @Nullable String miid, @Nullable String duid, long time, float weight, @Nullable String heartRate, float bmi, @Nullable Float bfp, @Nullable Float slm, @Nullable Float slp, @Nullable Float bmc, @Nullable Float bmcp, @Nullable Float bwm, @Nullable Float bwp, @Nullable Float pm, @Nullable Float pp, @Nullable Float bfm, @Nullable Float ffm, @Nullable Float smm, @Nullable String vfl, @Nullable Float swt, @Nullable Float whr, @Nullable Float wc, @Nullable Float mc, @Nullable Float fc, @Nullable String bmr, @Nullable String bt, @Nullable String ma, @Nullable String sbc, @Nullable Integer bs, @Nullable Integer cin, @Nullable Float limbmi, @Nullable Integer eofa, @Nullable Integer eofl, @Nullable Integer eofb, @Nullable Float larm, @Nullable Float rafm, @Nullable Float tfm, @Nullable Float llfm, @Nullable Float rlfm, @Nullable Integer larm_s, @Nullable Integer rafm_s, @Nullable Integer tfm_s, @Nullable Integer llfm_s, @Nullable Integer rlfm_s, @Nullable Integer eoma, @Nullable Integer eoml, @Nullable Integer eomb, @Nullable Float lam, @Nullable Float ram, @Nullable Float tm, @Nullable Float llm, @Nullable Float rlm, @Nullable Integer lam_s, @Nullable Integer ram_s, @Nullable Integer tm_s, @Nullable Integer llm_s, @Nullable Integer rlm_s, @Nullable Integer scoreStandardType) {
            return new RnWeightBean(did, miid, duid, time, weight, heartRate, bmi, bfp, slm, slp, bmc, bmcp, bwm, bwp, pm, pp, bfm, ffm, smm, vfl, swt, whr, wc, mc, fc, bmr, bt, ma, sbc, bs, cin, limbmi, eofa, eofl, eofb, larm, rafm, tfm, llfm, rlfm, larm_s, rafm_s, tfm_s, llfm_s, rlfm_s, eoma, eoml, eomb, lam, ram, tm, llm, rlm, lam_s, ram_s, tm_s, llm_s, rlm_s, scoreStandardType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RnWeightBean)) {
                return false;
            }
            RnWeightBean rnWeightBean = (RnWeightBean) other;
            return Intrinsics.areEqual(this.did, rnWeightBean.did) && Intrinsics.areEqual(this.miid, rnWeightBean.miid) && Intrinsics.areEqual(this.duid, rnWeightBean.duid) && this.time == rnWeightBean.time && Float.compare(this.weight, rnWeightBean.weight) == 0 && Intrinsics.areEqual(this.heartRate, rnWeightBean.heartRate) && Float.compare(this.bmi, rnWeightBean.bmi) == 0 && Intrinsics.areEqual((Object) this.bfp, (Object) rnWeightBean.bfp) && Intrinsics.areEqual((Object) this.slm, (Object) rnWeightBean.slm) && Intrinsics.areEqual((Object) this.slp, (Object) rnWeightBean.slp) && Intrinsics.areEqual((Object) this.bmc, (Object) rnWeightBean.bmc) && Intrinsics.areEqual((Object) this.bmcp, (Object) rnWeightBean.bmcp) && Intrinsics.areEqual((Object) this.bwm, (Object) rnWeightBean.bwm) && Intrinsics.areEqual((Object) this.bwp, (Object) rnWeightBean.bwp) && Intrinsics.areEqual((Object) this.pm, (Object) rnWeightBean.pm) && Intrinsics.areEqual((Object) this.pp, (Object) rnWeightBean.pp) && Intrinsics.areEqual((Object) this.bfm, (Object) rnWeightBean.bfm) && Intrinsics.areEqual((Object) this.ffm, (Object) rnWeightBean.ffm) && Intrinsics.areEqual((Object) this.smm, (Object) rnWeightBean.smm) && Intrinsics.areEqual(this.vfl, rnWeightBean.vfl) && Intrinsics.areEqual((Object) this.swt, (Object) rnWeightBean.swt) && Intrinsics.areEqual((Object) this.whr, (Object) rnWeightBean.whr) && Intrinsics.areEqual((Object) this.wc, (Object) rnWeightBean.wc) && Intrinsics.areEqual((Object) this.mc, (Object) rnWeightBean.mc) && Intrinsics.areEqual((Object) this.fc, (Object) rnWeightBean.fc) && Intrinsics.areEqual(this.bmr, rnWeightBean.bmr) && Intrinsics.areEqual(this.bt, rnWeightBean.bt) && Intrinsics.areEqual(this.ma, rnWeightBean.ma) && Intrinsics.areEqual(this.sbc, rnWeightBean.sbc) && Intrinsics.areEqual(this.bs, rnWeightBean.bs) && Intrinsics.areEqual(this.cin, rnWeightBean.cin) && Intrinsics.areEqual((Object) this.limbmi, (Object) rnWeightBean.limbmi) && Intrinsics.areEqual(this.eofa, rnWeightBean.eofa) && Intrinsics.areEqual(this.eofl, rnWeightBean.eofl) && Intrinsics.areEqual(this.eofb, rnWeightBean.eofb) && Intrinsics.areEqual((Object) this.larm, (Object) rnWeightBean.larm) && Intrinsics.areEqual((Object) this.rafm, (Object) rnWeightBean.rafm) && Intrinsics.areEqual((Object) this.tfm, (Object) rnWeightBean.tfm) && Intrinsics.areEqual((Object) this.llfm, (Object) rnWeightBean.llfm) && Intrinsics.areEqual((Object) this.rlfm, (Object) rnWeightBean.rlfm) && Intrinsics.areEqual(this.larm_s, rnWeightBean.larm_s) && Intrinsics.areEqual(this.rafm_s, rnWeightBean.rafm_s) && Intrinsics.areEqual(this.tfm_s, rnWeightBean.tfm_s) && Intrinsics.areEqual(this.llfm_s, rnWeightBean.llfm_s) && Intrinsics.areEqual(this.rlfm_s, rnWeightBean.rlfm_s) && Intrinsics.areEqual(this.eoma, rnWeightBean.eoma) && Intrinsics.areEqual(this.eoml, rnWeightBean.eoml) && Intrinsics.areEqual(this.eomb, rnWeightBean.eomb) && Intrinsics.areEqual((Object) this.lam, (Object) rnWeightBean.lam) && Intrinsics.areEqual((Object) this.ram, (Object) rnWeightBean.ram) && Intrinsics.areEqual((Object) this.tm, (Object) rnWeightBean.tm) && Intrinsics.areEqual((Object) this.llm, (Object) rnWeightBean.llm) && Intrinsics.areEqual((Object) this.rlm, (Object) rnWeightBean.rlm) && Intrinsics.areEqual(this.lam_s, rnWeightBean.lam_s) && Intrinsics.areEqual(this.ram_s, rnWeightBean.ram_s) && Intrinsics.areEqual(this.tm_s, rnWeightBean.tm_s) && Intrinsics.areEqual(this.llm_s, rnWeightBean.llm_s) && Intrinsics.areEqual(this.rlm_s, rnWeightBean.rlm_s) && Intrinsics.areEqual(this.scoreStandardType, rnWeightBean.scoreStandardType);
        }

        @Nullable
        public final Float getBfm() {
            return this.bfm;
        }

        @Nullable
        public final Float getBfp() {
            return this.bfp;
        }

        @Nullable
        public final Float getBmc() {
            return this.bmc;
        }

        @Nullable
        public final Float getBmcp() {
            return this.bmcp;
        }

        public final float getBmi() {
            return this.bmi;
        }

        @Nullable
        public final String getBmr() {
            return this.bmr;
        }

        @Nullable
        public final Integer getBs() {
            return this.bs;
        }

        @Nullable
        public final String getBt() {
            return this.bt;
        }

        @Nullable
        public final Float getBwm() {
            return this.bwm;
        }

        @Nullable
        public final Float getBwp() {
            return this.bwp;
        }

        @Nullable
        public final Integer getCin() {
            return this.cin;
        }

        @Nullable
        public final String getDid() {
            return this.did;
        }

        @Nullable
        public final String getDuid() {
            return this.duid;
        }

        @Nullable
        public final Integer getEofa() {
            return this.eofa;
        }

        @Nullable
        public final Integer getEofb() {
            return this.eofb;
        }

        @Nullable
        public final Integer getEofl() {
            return this.eofl;
        }

        @Nullable
        public final Integer getEoma() {
            return this.eoma;
        }

        @Nullable
        public final Integer getEomb() {
            return this.eomb;
        }

        @Nullable
        public final Integer getEoml() {
            return this.eoml;
        }

        @Nullable
        public final Float getFc() {
            return this.fc;
        }

        @Nullable
        public final Float getFfm() {
            return this.ffm;
        }

        @Nullable
        public final String getHeartRate() {
            return this.heartRate;
        }

        @Nullable
        public final Float getLam() {
            return this.lam;
        }

        @Nullable
        public final Integer getLam_s() {
            return this.lam_s;
        }

        @Nullable
        public final Float getLarm() {
            return this.larm;
        }

        @Nullable
        public final Integer getLarm_s() {
            return this.larm_s;
        }

        @Nullable
        public final Float getLimbmi() {
            return this.limbmi;
        }

        @Nullable
        public final Float getLlfm() {
            return this.llfm;
        }

        @Nullable
        public final Integer getLlfm_s() {
            return this.llfm_s;
        }

        @Nullable
        public final Float getLlm() {
            return this.llm;
        }

        @Nullable
        public final Integer getLlm_s() {
            return this.llm_s;
        }

        @Nullable
        public final String getMa() {
            return this.ma;
        }

        @Nullable
        public final Float getMc() {
            return this.mc;
        }

        @Nullable
        public final String getMiid() {
            return this.miid;
        }

        @Nullable
        public final Float getPm() {
            return this.pm;
        }

        @Nullable
        public final Float getPp() {
            return this.pp;
        }

        @Nullable
        public final Float getRafm() {
            return this.rafm;
        }

        @Nullable
        public final Integer getRafm_s() {
            return this.rafm_s;
        }

        @Nullable
        public final Float getRam() {
            return this.ram;
        }

        @Nullable
        public final Integer getRam_s() {
            return this.ram_s;
        }

        @Nullable
        public final Float getRlfm() {
            return this.rlfm;
        }

        @Nullable
        public final Integer getRlfm_s() {
            return this.rlfm_s;
        }

        @Nullable
        public final Float getRlm() {
            return this.rlm;
        }

        @Nullable
        public final Integer getRlm_s() {
            return this.rlm_s;
        }

        @Nullable
        public final String getSbc() {
            return this.sbc;
        }

        @Nullable
        public final Integer getScoreStandardType() {
            return this.scoreStandardType;
        }

        @Nullable
        public final Float getSlm() {
            return this.slm;
        }

        @Nullable
        public final Float getSlp() {
            return this.slp;
        }

        @Nullable
        public final Float getSmm() {
            return this.smm;
        }

        @Nullable
        public final Float getSwt() {
            return this.swt;
        }

        @Nullable
        public final Float getTfm() {
            return this.tfm;
        }

        @Nullable
        public final Integer getTfm_s() {
            return this.tfm_s;
        }

        public final long getTime() {
            return this.time;
        }

        @Nullable
        public final Float getTm() {
            return this.tm;
        }

        @Nullable
        public final Integer getTm_s() {
            return this.tm_s;
        }

        @Nullable
        public final String getVfl() {
            return this.vfl;
        }

        @Nullable
        public final Float getWc() {
            return this.wc;
        }

        public final float getWeight() {
            return this.weight;
        }

        @Nullable
        public final Float getWhr() {
            return this.whr;
        }

        public int hashCode() {
            String str = this.did;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.miid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.duid;
            int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.time)) * 31) + Float.hashCode(this.weight)) * 31;
            String str4 = this.heartRate;
            int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Float.hashCode(this.bmi)) * 31;
            Float f = this.bfp;
            int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.slm;
            int iHashCode6 = (iHashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.slp;
            int iHashCode7 = (iHashCode6 + (f3 == null ? 0 : f3.hashCode())) * 31;
            Float f4 = this.bmc;
            int iHashCode8 = (iHashCode7 + (f4 == null ? 0 : f4.hashCode())) * 31;
            Float f5 = this.bmcp;
            int iHashCode9 = (iHashCode8 + (f5 == null ? 0 : f5.hashCode())) * 31;
            Float f6 = this.bwm;
            int iHashCode10 = (iHashCode9 + (f6 == null ? 0 : f6.hashCode())) * 31;
            Float f7 = this.bwp;
            int iHashCode11 = (iHashCode10 + (f7 == null ? 0 : f7.hashCode())) * 31;
            Float f8 = this.pm;
            int iHashCode12 = (iHashCode11 + (f8 == null ? 0 : f8.hashCode())) * 31;
            Float f9 = this.pp;
            int iHashCode13 = (iHashCode12 + (f9 == null ? 0 : f9.hashCode())) * 31;
            Float f10 = this.bfm;
            int iHashCode14 = (iHashCode13 + (f10 == null ? 0 : f10.hashCode())) * 31;
            Float f11 = this.ffm;
            int iHashCode15 = (iHashCode14 + (f11 == null ? 0 : f11.hashCode())) * 31;
            Float f12 = this.smm;
            int iHashCode16 = (iHashCode15 + (f12 == null ? 0 : f12.hashCode())) * 31;
            String str5 = this.vfl;
            int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Float f13 = this.swt;
            int iHashCode18 = (iHashCode17 + (f13 == null ? 0 : f13.hashCode())) * 31;
            Float f14 = this.whr;
            int iHashCode19 = (iHashCode18 + (f14 == null ? 0 : f14.hashCode())) * 31;
            Float f15 = this.wc;
            int iHashCode20 = (iHashCode19 + (f15 == null ? 0 : f15.hashCode())) * 31;
            Float f16 = this.mc;
            int iHashCode21 = (iHashCode20 + (f16 == null ? 0 : f16.hashCode())) * 31;
            Float f17 = this.fc;
            int iHashCode22 = (iHashCode21 + (f17 == null ? 0 : f17.hashCode())) * 31;
            String str6 = this.bmr;
            int iHashCode23 = (iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.bt;
            int iHashCode24 = (iHashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.ma;
            int iHashCode25 = (iHashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.sbc;
            int iHashCode26 = (iHashCode25 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num = this.bs;
            int iHashCode27 = (iHashCode26 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.cin;
            int iHashCode28 = (iHashCode27 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f18 = this.limbmi;
            int iHashCode29 = (iHashCode28 + (f18 == null ? 0 : f18.hashCode())) * 31;
            Integer num3 = this.eofa;
            int iHashCode30 = (iHashCode29 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.eofl;
            int iHashCode31 = (iHashCode30 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.eofb;
            int iHashCode32 = (iHashCode31 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Float f19 = this.larm;
            int iHashCode33 = (iHashCode32 + (f19 == null ? 0 : f19.hashCode())) * 31;
            Float f20 = this.rafm;
            int iHashCode34 = (iHashCode33 + (f20 == null ? 0 : f20.hashCode())) * 31;
            Float f21 = this.tfm;
            int iHashCode35 = (iHashCode34 + (f21 == null ? 0 : f21.hashCode())) * 31;
            Float f22 = this.llfm;
            int iHashCode36 = (iHashCode35 + (f22 == null ? 0 : f22.hashCode())) * 31;
            Float f23 = this.rlfm;
            int iHashCode37 = (iHashCode36 + (f23 == null ? 0 : f23.hashCode())) * 31;
            Integer num6 = this.larm_s;
            int iHashCode38 = (iHashCode37 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.rafm_s;
            int iHashCode39 = (iHashCode38 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.tfm_s;
            int iHashCode40 = (iHashCode39 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.llfm_s;
            int iHashCode41 = (iHashCode40 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.rlfm_s;
            int iHashCode42 = (iHashCode41 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Integer num11 = this.eoma;
            int iHashCode43 = (iHashCode42 + (num11 == null ? 0 : num11.hashCode())) * 31;
            Integer num12 = this.eoml;
            int iHashCode44 = (iHashCode43 + (num12 == null ? 0 : num12.hashCode())) * 31;
            Integer num13 = this.eomb;
            int iHashCode45 = (iHashCode44 + (num13 == null ? 0 : num13.hashCode())) * 31;
            Float f24 = this.lam;
            int iHashCode46 = (iHashCode45 + (f24 == null ? 0 : f24.hashCode())) * 31;
            Float f25 = this.ram;
            int iHashCode47 = (iHashCode46 + (f25 == null ? 0 : f25.hashCode())) * 31;
            Float f26 = this.tm;
            int iHashCode48 = (iHashCode47 + (f26 == null ? 0 : f26.hashCode())) * 31;
            Float f27 = this.llm;
            int iHashCode49 = (iHashCode48 + (f27 == null ? 0 : f27.hashCode())) * 31;
            Float f28 = this.rlm;
            int iHashCode50 = (iHashCode49 + (f28 == null ? 0 : f28.hashCode())) * 31;
            Integer num14 = this.lam_s;
            int iHashCode51 = (iHashCode50 + (num14 == null ? 0 : num14.hashCode())) * 31;
            Integer num15 = this.ram_s;
            int iHashCode52 = (iHashCode51 + (num15 == null ? 0 : num15.hashCode())) * 31;
            Integer num16 = this.tm_s;
            int iHashCode53 = (iHashCode52 + (num16 == null ? 0 : num16.hashCode())) * 31;
            Integer num17 = this.llm_s;
            int iHashCode54 = (iHashCode53 + (num17 == null ? 0 : num17.hashCode())) * 31;
            Integer num18 = this.rlm_s;
            int iHashCode55 = (iHashCode54 + (num18 == null ? 0 : num18.hashCode())) * 31;
            Integer num19 = this.scoreStandardType;
            return iHashCode55 + (num19 != null ? num19.hashCode() : 0);
        }

        public final void setBfm(@Nullable Float f) {
            this.bfm = f;
        }

        public final void setBfp(@Nullable Float f) {
            this.bfp = f;
        }

        public final void setBmc(@Nullable Float f) {
            this.bmc = f;
        }

        public final void setBmcp(@Nullable Float f) {
            this.bmcp = f;
        }

        public final void setBmi(float f) {
            this.bmi = f;
        }

        public final void setBmr(@Nullable String str) {
            this.bmr = str;
        }

        public final void setBs(@Nullable Integer num) {
            this.bs = num;
        }

        public final void setBt(@Nullable String str) {
            this.bt = str;
        }

        public final void setBwm(@Nullable Float f) {
            this.bwm = f;
        }

        public final void setBwp(@Nullable Float f) {
            this.bwp = f;
        }

        public final void setCin(@Nullable Integer num) {
            this.cin = num;
        }

        public final void setDid(@Nullable String str) {
            this.did = str;
        }

        public final void setDuid(@Nullable String str) {
            this.duid = str;
        }

        public final void setEofa(@Nullable Integer num) {
            this.eofa = num;
        }

        public final void setEofb(@Nullable Integer num) {
            this.eofb = num;
        }

        public final void setEofl(@Nullable Integer num) {
            this.eofl = num;
        }

        public final void setEoma(@Nullable Integer num) {
            this.eoma = num;
        }

        public final void setEomb(@Nullable Integer num) {
            this.eomb = num;
        }

        public final void setEoml(@Nullable Integer num) {
            this.eoml = num;
        }

        public final void setFc(@Nullable Float f) {
            this.fc = f;
        }

        public final void setFfm(@Nullable Float f) {
            this.ffm = f;
        }

        public final void setHeartRate(@Nullable String str) {
            this.heartRate = str;
        }

        public final void setLam(@Nullable Float f) {
            this.lam = f;
        }

        public final void setLam_s(@Nullable Integer num) {
            this.lam_s = num;
        }

        public final void setLarm(@Nullable Float f) {
            this.larm = f;
        }

        public final void setLarm_s(@Nullable Integer num) {
            this.larm_s = num;
        }

        public final void setLimbmi(@Nullable Float f) {
            this.limbmi = f;
        }

        public final void setLlfm(@Nullable Float f) {
            this.llfm = f;
        }

        public final void setLlfm_s(@Nullable Integer num) {
            this.llfm_s = num;
        }

        public final void setLlm(@Nullable Float f) {
            this.llm = f;
        }

        public final void setLlm_s(@Nullable Integer num) {
            this.llm_s = num;
        }

        public final void setMa(@Nullable String str) {
            this.ma = str;
        }

        public final void setMc(@Nullable Float f) {
            this.mc = f;
        }

        public final void setMiid(@Nullable String str) {
            this.miid = str;
        }

        public final void setPm(@Nullable Float f) {
            this.pm = f;
        }

        public final void setPp(@Nullable Float f) {
            this.pp = f;
        }

        public final void setRafm(@Nullable Float f) {
            this.rafm = f;
        }

        public final void setRafm_s(@Nullable Integer num) {
            this.rafm_s = num;
        }

        public final void setRam(@Nullable Float f) {
            this.ram = f;
        }

        public final void setRam_s(@Nullable Integer num) {
            this.ram_s = num;
        }

        public final void setRlfm(@Nullable Float f) {
            this.rlfm = f;
        }

        public final void setRlfm_s(@Nullable Integer num) {
            this.rlfm_s = num;
        }

        public final void setRlm(@Nullable Float f) {
            this.rlm = f;
        }

        public final void setRlm_s(@Nullable Integer num) {
            this.rlm_s = num;
        }

        public final void setSbc(@Nullable String str) {
            this.sbc = str;
        }

        public final void setScoreStandardType(@Nullable Integer num) {
            this.scoreStandardType = num;
        }

        public final void setSlm(@Nullable Float f) {
            this.slm = f;
        }

        public final void setSlp(@Nullable Float f) {
            this.slp = f;
        }

        public final void setSmm(@Nullable Float f) {
            this.smm = f;
        }

        public final void setSwt(@Nullable Float f) {
            this.swt = f;
        }

        public final void setTfm(@Nullable Float f) {
            this.tfm = f;
        }

        public final void setTfm_s(@Nullable Integer num) {
            this.tfm_s = num;
        }

        public final void setTime(long j) {
            this.time = j;
        }

        public final void setTm(@Nullable Float f) {
            this.tm = f;
        }

        public final void setTm_s(@Nullable Integer num) {
            this.tm_s = num;
        }

        public final void setVfl(@Nullable String str) {
            this.vfl = str;
        }

        public final void setWc(@Nullable Float f) {
            this.wc = f;
        }

        public final void setWeight(float f) {
            this.weight = f;
        }

        public final void setWhr(@Nullable Float f) {
            this.whr = f;
        }

        @NotNull
        public String toString() {
            return "RnWeightBean(did=" + this.did + ", miid=" + this.miid + ", duid=" + this.duid + ", time=" + this.time + ", weight=" + this.weight + ", heartRate=" + this.heartRate + ", bmi=" + this.bmi + ", bfp=" + this.bfp + ", slm=" + this.slm + ", slp=" + this.slp + ", bmc=" + this.bmc + ", bmcp=" + this.bmcp + ", bwm=" + this.bwm + ", bwp=" + this.bwp + ", pm=" + this.pm + ", pp=" + this.pp + ", bfm=" + this.bfm + ", ffm=" + this.ffm + ", smm=" + this.smm + ", vfl=" + this.vfl + ", swt=" + this.swt + ", whr=" + this.whr + ", wc=" + this.wc + ", mc=" + this.mc + ", fc=" + this.fc + ", bmr=" + this.bmr + ", bt=" + this.bt + ", ma=" + this.ma + ", sbc=" + this.sbc + ", bs=" + this.bs + ", cin=" + this.cin + ", limbmi=" + this.limbmi + ", eofa=" + this.eofa + ", eofl=" + this.eofl + ", eofb=" + this.eofb + ", larm=" + this.larm + ", rafm=" + this.rafm + ", tfm=" + this.tfm + ", llfm=" + this.llfm + ", rlfm=" + this.rlfm + ", larm_s=" + this.larm_s + ", rafm_s=" + this.rafm_s + ", tfm_s=" + this.tfm_s + ", llfm_s=" + this.llfm_s + ", rlfm_s=" + this.rlfm_s + ", eoma=" + this.eoma + ", eoml=" + this.eoml + ", eomb=" + this.eomb + ", lam=" + this.lam + ", ram=" + this.ram + ", tm=" + this.tm + ", llm=" + this.llm + ", rlm=" + this.rlm + ", lam_s=" + this.lam_s + ", ram_s=" + this.ram_s + ", tm_s=" + this.tm_s + ", llm_s=" + this.llm_s + ", rlm_s=" + this.rlm_s + ", scoreStandardType=" + this.scoreStandardType + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RnWeightBean(String str, String str2, String str3, long j, float f, String str4, float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, String str5, Float f15, Float f16, Float f17, Float f18, Float f19, String str6, String str7, String str8, String str9, Integer num, Integer num2, Float f20, Integer num3, Integer num4, Integer num5, Float f21, Float f22, Float f23, Float f24, Float f25, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Float f26, Float f27, Float f28, Float f29, Float f30, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            Float f31;
            int i3;
            String str10 = (i & 1) != 0 ? null : str;
            String str11 = (i & 2) != 0 ? null : str2;
            String str12 = (i & 4) != 0 ? null : str3;
            String str13 = (i & 32) != 0 ? null : str4;
            float f32 = (i & 64) != 0 ? 0.0f : f2;
            Float f33 = (i & 128) != 0 ? null : f3;
            Float f34 = (i & 256) != 0 ? null : f4;
            Float f35 = (i & 512) != 0 ? null : f5;
            Float f36 = (i & 1024) != 0 ? null : f6;
            Float f37 = (i & 2048) != 0 ? null : f7;
            Float f38 = (i & 4096) != 0 ? null : f8;
            Float f39 = (i & 8192) != 0 ? null : f9;
            Float f40 = (i & 16384) != 0 ? null : f10;
            Float f41 = (i & 32768) != 0 ? null : f11;
            Float f42 = (i & 65536) != 0 ? null : f12;
            Float f43 = (i & 131072) != 0 ? null : f13;
            Float f44 = (i & 262144) != 0 ? null : f14;
            String str14 = (i & 524288) != 0 ? null : str5;
            Float f45 = (i & EventRecurrence.TH) != 0 ? null : f15;
            Float f46 = (i & 2097152) != 0 ? null : f16;
            Float f47 = (i & 4194304) != 0 ? null : f17;
            Float f48 = (i & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0 ? null : f18;
            Float f49 = (i & 16777216) != 0 ? null : f19;
            String str15 = (i & 33554432) != 0 ? null : str6;
            String str16 = (i & 67108864) != 0 ? null : str7;
            String str17 = (i & 134217728) != 0 ? null : str8;
            String str18 = (i & 268435456) != 0 ? null : str9;
            Integer num20 = (i & 536870912) != 0 ? null : num;
            Integer num21 = (i & 1073741824) != 0 ? null : num2;
            Float f50 = (i & Integer.MIN_VALUE) != 0 ? null : f20;
            Integer num22 = (i2 & 1) != 0 ? null : num3;
            Integer num23 = (i2 & 2) != 0 ? null : num4;
            Integer num24 = (i2 & 4) != 0 ? null : num5;
            Float f51 = (i2 & 8) != 0 ? null : f21;
            Float f52 = (i2 & 16) != 0 ? null : f22;
            Float f53 = (i2 & 32) != 0 ? null : f23;
            Float f54 = (i2 & 64) != 0 ? null : f24;
            Float f55 = (i2 & 128) != 0 ? null : f25;
            Integer num25 = (i2 & 256) != 0 ? null : num6;
            Integer num26 = (i2 & 512) != 0 ? null : num7;
            Integer num27 = (i2 & 1024) != 0 ? null : num8;
            Integer num28 = (i2 & 2048) != 0 ? null : num9;
            Integer num29 = (i2 & 4096) != 0 ? null : num10;
            Integer num30 = (i2 & 8192) != 0 ? null : num11;
            Integer num31 = (i2 & 16384) != 0 ? null : num12;
            Integer num32 = (32768 & i2) != 0 ? null : num13;
            Float f56 = (65536 & i2) != 0 ? null : f26;
            Float f57 = (i2 & 131072) != 0 ? null : f27;
            if ((i2 & 262144) != 0) {
                i3 = 524288;
                f31 = null;
            } else {
                f31 = f28;
                i3 = 524288;
            }
            this(str10, str11, str12, j, f, str13, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, f43, f44, str14, f45, f46, f47, f48, f49, str15, str16, str17, str18, num20, num21, f50, num22, num23, num24, f51, f52, f53, f54, f55, num25, num26, num27, num28, num29, num30, num31, num32, f56, f57, f31, (i3 & i2) != 0 ? null : f29, (i2 & EventRecurrence.TH) != 0 ? null : f30, (i2 & 2097152) != 0 ? null : num14, (i2 & 4194304) != 0 ? null : num15, (8388608 & i2) != 0 ? null : num16, (16777216 & i2) != 0 ? null : num17, (33554432 & i2) != 0 ? null : num18, (i2 & 67108864) != 0 ? null : num19);
        }
    }
}
