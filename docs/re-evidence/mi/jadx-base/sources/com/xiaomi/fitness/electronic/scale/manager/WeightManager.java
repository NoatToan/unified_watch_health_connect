package com.xiaomi.fitness.electronic.scale.manager;

import chipsea.bias.v432.CSBiasAPI;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.WeightViewModel;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import defpackage.f4b;
import defpackage.fx7;
import defpackage.gx7;
import defpackage.jx7;
import defpackage.kx7;
import defpackage.ld8;
import defpackage.lx7;
import defpackage.qal;
import defpackage.sw7;
import defpackage.u7r;
import defpackage.v45;
import defpackage.ww7;
import defpackage.zzi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 @2\u00020\u0001:\u0001@B\t\b\u0007¢\u0006\u0004\b>\u0010?Ji\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b!\u0010\"J\u0093\u0001\u0010,\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-JM\u00104\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00132\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201¢\u0006\u0004\b4\u00105JO\u00108\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00107\u001a\u0002062\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b<\u0010;J\u001d\u0010<\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/manager/WeightManager;", "", "", "did", "model", "userId", "", "virtualId", "icon", "nickName", "", "weight", "createTime", "sn", "Lkotlin/Function0;", "", "callBack", "saveVirtualUserBodyMakeUpData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;FJLjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "bfp", Column.ACCOUNT_ID, "userWeight", "userHeight", "userType", "userSex", "userAge", "sendBodyCompositionToDevice", "(Ljava/lang/String;IJIIIII)V", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;", "syncWeightRecordCallback", "saveBodyMakeUpData", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;Lkotlin/jvm/functions/Function0;)V", "heartRate", "sex", "age", "height", "", "current_measuring_impedance", "time", "", "toDevice", "getBodyMakeUpData", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IIIFF[IJLjava/lang/String;Z)Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "unit", "Llx7;", "usrBia", "Lsw7;", "lfRes", "hfRes", "generateVirtualUserFromResult", "(Ljava/lang/String;Ljava/lang/String;IFILlx7;Lsw7;Lsw7;)Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;", "onAddToDbListener", "addVirtualAccountWeightRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;FLcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;J)V", "convertToKg", "(FI)F", "kgConvertOther", "(II)I", "<init>", "()V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<WeightManager> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: dgr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WeightManager.instance_delegate$lambda$7();
        }
    });
    private static final int WEIGHT_UNIT_KG = 1;
    private static final int WEIGHT_UNIT_LB = 2;
    private static final int WEIGHT_UNIT_JIN = 3;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/manager/WeightManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/electronic/scale/manager/WeightManager;", "getInstance", "()Lcom/xiaomi/fitness/electronic/scale/manager/WeightManager;", "instance$delegate", "Lkotlin/Lazy;", "WEIGHT_UNIT_KG", "", "getWEIGHT_UNIT_KG", "()I", "WEIGHT_UNIT_LB", "getWEIGHT_UNIT_LB", "WEIGHT_UNIT_JIN", "getWEIGHT_UNIT_JIN", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WeightManager getInstance() {
            return (WeightManager) WeightManager.instance$delegate.getValue();
        }

        public final int getWEIGHT_UNIT_JIN() {
            return WeightManager.WEIGHT_UNIT_JIN;
        }

        public final int getWEIGHT_UNIT_KG() {
            return WeightManager.WEIGHT_UNIT_KG;
        }

        public final int getWEIGHT_UNIT_LB() {
            return WeightManager.WEIGHT_UNIT_LB;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.manager.WeightManager$getBodyMakeUpData$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.manager.WeightManager$getBodyMakeUpData$3", f = "WeightManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScaleUtil.INSTANCE.sendDataChangedBroadcast(true, Boxing.boxInt(0));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addVirtualAccountWeightRecord$lambda$6(ElectronicScaleBaseViewModel.OnAddToDbListener onAddToDbListener) {
        Intrinsics.checkNotNullParameter(onAddToDbListener, "$onAddToDbListener");
        Logger.i(WeightViewModel.TAG, "addVirtualAccountWeightRecord success");
        onAddToDbListener.onSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeightManager instance_delegate$lambda$7() {
        return new WeightManager();
    }

    public static /* synthetic */ void saveBodyMakeUpData$default(WeightManager weightManager, VirtualAccount virtualAccount, SyncWeightRecordCallback syncWeightRecordCallback, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            syncWeightRecordCallback = null;
        }
        weightManager.saveBodyMakeUpData(virtualAccount, syncWeightRecordCallback, function0);
    }

    private final void saveVirtualUserBodyMakeUpData(String did, String model, String userId, long virtualId, String icon, String nickName, float weight, long createTime, String sn, Function0<Unit> callBack) {
        WeightResult weightResult = new WeightResult(1, userId, weight, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (short) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, String.valueOf(virtualId), sn, 0L, -8, Integer.MAX_VALUE, 2, null);
        VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        virtualAccount.setDid(did);
        virtualAccount.setModel(model);
        virtualAccount.setAccountId(virtualId);
        virtualAccount.setUid(Long.parseLong(userId));
        virtualAccount.setDel(false);
        virtualAccount.setIcon(icon == null ? "" : icon);
        virtualAccount.setName(nickName != null ? nickName : "");
        virtualAccount.setType(2);
        virtualAccount.setBodyComposition(f4b.c(weightResult));
        virtualAccount.setCreateTime(createTime);
        virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(createTime, "yyyyMMdd"));
        qal.c("saveVirtualUserBodyMakeUpData() virtualId : " + virtualAccount.getAccountId() + " ====== createDate : " + virtualAccount.getCreateDate());
        VirtualAccountHelper.insertVirtualAccount$default(VirtualAccountHelper.INSTANCE, virtualAccount, callBack, null, 4, null);
    }

    private final void sendBodyCompositionToDevice(String did, int bfp, long accountId, int userWeight, int userHeight, int userType, int userSex, int userAge) {
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 19;
        ww7 ww7Var = new ww7();
        gx7 gx7Var = new gx7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId());
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = accountId;
        fx7Var.d = kx7Var;
        fx7Var.i = userWeight;
        fx7Var.h = userHeight;
        fx7Var.e = userType;
        fx7Var.f = userSex;
        fx7Var.g = userAge;
        gx7Var.c = fx7Var;
        gx7Var.d = bfp;
        ww7Var.G(gx7Var);
        u7rVar.D(ww7Var);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.manager.WeightManager.sendBodyCompositionToDevice.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i("sendBodyCompositionToDevice error code " + code, new Object[0]);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i("sendBodyCompositionToDevice success", new Object[0]);
            }
        }, 2000);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    public final void addVirtualAccountWeightRecord(@NotNull String did, @NotNull String model, @NotNull String icon, long virtualId, @NotNull String nickName, float weight, @NotNull final ElectronicScaleBaseViewModel.OnAddToDbListener onAddToDbListener, long createTime) {
        String sn;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(onAddToDbListener, "onAddToDbListener");
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
            sn = "0";
        } else {
            EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
            sn = (ecoDeviceModel2 == null || (deviceInfo2 = ecoDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo2.getSn();
            if (sn == null) {
                sn = "0";
            }
        }
        saveVirtualUserBodyMakeUpData(did, model, userId, virtualId, icon, nickName, weight, createTime, sn, new Function0() { // from class: egr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightManager.addVirtualAccountWeightRecord$lambda$6(onAddToDbListener);
            }
        });
    }

    public final float convertToKg(float weight, int unit) {
        if (unit == 2) {
            return WeightInfoUtil.INSTANCE.getFormatFloat((float) (((double) weight) * 0.454d));
        }
        return unit == 3 ? WeightInfoUtil.INSTANCE.getFormatFloat((float) (((double) weight) * 0.5d)) : WeightInfoUtil.INSTANCE.getFormatFloat(weight);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x01b3  */
    @NotNull
    public final VirtualAccount generateVirtualUserFromResult(@NotNull String userId, @NotNull String did, int heartRate, float weight, int unit, @NotNull lx7 usrBia, @NotNull sw7 lfRes, @NotNull sw7 hfRes) {
        String sn;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(usrBia, "usrBia");
        Intrinsics.checkNotNullParameter(lfRes, "lfRes");
        Intrinsics.checkNotNullParameter(hfRes, "hfRes");
        float fConvertToKg = convertToKg(weight, unit);
        float f = 10;
        float f2 = usrBia.c / f;
        float f3 = usrBia.o / f;
        float f4 = usrBia.d / f;
        float f5 = usrBia.f / f;
        float f6 = usrBia.i / f;
        float f7 = usrBia.e / f;
        float f8 = usrBia.g / f;
        float f9 = usrBia.j / f;
        float f10 = usrBia.m / f;
        float f11 = usrBia.u / f;
        float f12 = usrBia.v / f;
        float f13 = usrBia.w / f;
        float f14 = usrBia.x / f;
        float f15 = usrBia.y / f;
        float f16 = usrBia.J / f;
        float f17 = usrBia.K / f;
        float f18 = usrBia.L / f;
        float f19 = usrBia.M / f;
        float f20 = usrBia.N / f;
        float f21 = usrBia.h;
        short s = (short) (((short) usrBia.l) / 10);
        byte b2 = (byte) (usrBia.f25514k / 10);
        byte b3 = (byte) (usrBia.n / 10);
        float f22 = usrBia.q / f;
        float f23 = usrBia.s / f;
        int i = usrBia.t;
        short s2 = (short) (((short) usrBia.E) / 10);
        short s3 = (short) (((short) usrBia.F) / 10);
        short s4 = (short) (((short) usrBia.G) / 10);
        short s5 = (short) (((short) usrBia.H) / 10);
        short s6 = (short) (((short) usrBia.I) / 10);
        short s7 = (short) (((short) usrBia.T) / 10);
        short s8 = (short) (((short) usrBia.U) / 10);
        short s9 = (short) (((short) usrBia.V) / 10);
        short s10 = (short) (((short) usrBia.W) / 10);
        short s11 = (short) (((short) usrBia.X) / 10);
        short s12 = (short) (((short) usrBia.p) / 10);
        short s13 = (short) (((short) usrBia.f25515r) / 10);
        byte b4 = (byte) (usrBia.Y / 10);
        byte b5 = (byte) (usrBia.Z / 10);
        byte b6 = (byte) (usrBia.a0 / 10);
        byte b7 = (byte) (usrBia.b0 / 10);
        byte b8 = (byte) (usrBia.c0 / 10);
        byte b9 = (byte) (usrBia.d0 / 10);
        float f24 = ((short) usrBia.e0) / f;
        float f25 = ((short) usrBia.g0) / f;
        float f26 = ((short) usrBia.f0) / f;
        int i2 = lfRes.c;
        int i3 = lfRes.d;
        int i4 = lfRes.e;
        int i5 = lfRes.f;
        int i6 = lfRes.g;
        int i7 = lfRes.h;
        int i8 = hfRes.c;
        int i9 = hfRes.d;
        int i10 = hfRes.e;
        int i11 = hfRes.f;
        int i12 = hfRes.g;
        int i13 = hfRes.h;
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
            sn = "0";
        } else {
            EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
            sn = (ecoDeviceModel2 == null || (deviceInfo2 = ecoDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo2.getSn();
            if (sn == null) {
                sn = "0";
            }
        }
        WeightResult weightResult = new WeightResult(1, userId, fConvertToKg, heartRate, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, s, b2, b3, f22, f23, i, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, b4, b5, b6, b7, b8, b9, f24, f25, f26, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, "0", sn, 0L, 0, 0, 2, null);
        VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        virtualAccount.setAccountId(0L);
        MiAccountManager.Companion companion2 = MiAccountManager.INSTANCE;
        virtualAccount.setUid(Long.parseLong(companion2.getInstance().getMiId()));
        virtualAccount.setType(1);
        virtualAccount.setDel(false);
        virtualAccount.setIcon(companion2.getInstance().getAvatarAddress());
        virtualAccount.setName(companion2.getInstance().getNickName());
        virtualAccount.setBodyComposition(f4b.c(weightResult));
        virtualAccount.setCreateTime(System.currentTimeMillis());
        DateUtil dateUtil = DateUtil.INSTANCE;
        long createTime = virtualAccount.getCreateTime();
        String string = ApplicationExtKt.getApplication().getString(zzi.d);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        virtualAccount.setCreateDate(dateUtil.getDateToString(createTime, string));
        qal.c("addBodyCompositionToDb() uid : " + virtualAccount.getUid() + "====== createDate : " + virtualAccount.getCreateDate());
        String strC = f4b.c(weightResult);
        StringBuilder sb = new StringBuilder();
        sb.append("handleWeight addBodyCompositionToDb ");
        sb.append(strC);
        Logger.i(WeightViewModel.TAG, sb.toString());
        return virtualAccount;
    }

    @NotNull
    public final VirtualAccount getBodyMakeUpData(@NotNull String did, @NotNull String model, int userType, @NotNull String userId, @Nullable Long virtualId, @Nullable String icon, @Nullable String nickName, int heartRate, int sex, int age, float height, float weight, @NotNull int[] current_measuring_impedance, long time, @NotNull String sn, boolean toDevice) {
        int i;
        boolean z;
        long j;
        WeightResult weightResult;
        int i2;
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(current_measuring_impedance, "current_measuring_impedance");
        Intrinsics.checkNotNullParameter(sn, "sn");
        CSBiasAPI.CSBiasV432Resp cSBiasV432RespA = v45.a(sex, age, height, weight, current_measuring_impedance);
        qal.c("getBodyMakeUpData() calc result:  " + cSBiasV432RespA + " type : " + userType);
        CSBiasAPI.CSBiasDataV432 cSBiasDataV432 = cSBiasV432RespA.data;
        if (cSBiasDataV432 == null || cSBiasDataV432.out_bfp == 0.0f) {
            i = 1;
            z = false;
            j = time;
            qal.c("getBodyMakeUpData() failed");
            ld8.c().l(new ScaleEventBusIds.OnBodyCompositionSDKMeasureEvent(false));
            weightResult = new WeightResult(1, userId, weight, heartRate, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (short) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, String.valueOf(virtualId), sn, time, -16, Integer.MAX_VALUE, 0, null);
        } else {
            qal.c("getBodyMakeUpData() success");
            ld8.c().l(new ScaleEventBusIds.OnBodyCompositionSDKMeasureEvent(true));
            if (toDevice) {
                if (virtualId == null || virtualId.longValue() == 0) {
                    EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
                    i2 = (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.isOwner()) ? 0 : 2;
                } else {
                    i2 = 1;
                }
                float f = 10;
                sendBodyCompositionToDevice(did, (int) (cSBiasDataV432.out_bfp * f), virtualId != null ? virtualId.longValue() : 0L, (int) (weight * f), (int) height, i2, sex, age);
            }
            j = time;
            z = false;
            i = 1;
            weightResult = new WeightResult(1, userId, weight, heartRate, cSBiasDataV432.out_bfp, cSBiasDataV432.out_bmi, cSBiasDataV432.out_slm, cSBiasDataV432.out_bmc, cSBiasDataV432.out_bwm, cSBiasDataV432.out_bwp, cSBiasDataV432.out_pm, cSBiasDataV432.out_bfm, cSBiasDataV432.out_limbmi, cSBiasDataV432.out_lam, cSBiasDataV432.out_ram, cSBiasDataV432.out_llm, cSBiasDataV432.out_rlm, cSBiasDataV432.out_tm, cSBiasDataV432.out_lafm, cSBiasDataV432.out_rafm, cSBiasDataV432.out_llfm, cSBiasDataV432.out_rlfm, cSBiasDataV432.out_tfm, cSBiasDataV432.out_bmr, (short) cSBiasDataV432.out_vfr, (byte) cSBiasDataV432.out_ma, (byte) cSBiasDataV432.out_sbc, cSBiasDataV432.out_sbw, cSBiasDataV432.out_whr, cSBiasDataV432.out_cin, (short) cSBiasDataV432.out_lam_s, (short) cSBiasDataV432.out_ram_s, (short) cSBiasDataV432.out_llm_s, (short) cSBiasDataV432.out_rlm_s, (short) cSBiasDataV432.out_tm_s, (short) cSBiasDataV432.out_lafm_s, (short) cSBiasDataV432.out_rafm_s, (short) cSBiasDataV432.out_llfm_s, (short) cSBiasDataV432.out_rlfm_s, (short) cSBiasDataV432.out_tfm_s, (short) cSBiasDataV432.out_bt, (short) cSBiasDataV432.out_bs, (byte) cSBiasDataV432.out_eoma, (byte) cSBiasDataV432.out_eoml, (byte) cSBiasDataV432.out_eomb, (byte) cSBiasDataV432.out_eofa, (byte) cSBiasDataV432.out_eofl, (byte) cSBiasDataV432.out_eofb, cSBiasDataV432.out_wc, cSBiasDataV432.out_mc, cSBiasDataV432.out_fc, current_measuring_impedance[0], current_measuring_impedance[1], current_measuring_impedance[2], current_measuring_impedance[3], current_measuring_impedance[4], current_measuring_impedance[5], current_measuring_impedance[6], current_measuring_impedance[7], current_measuring_impedance[8], current_measuring_impedance[9], current_measuring_impedance[10], current_measuring_impedance[11], String.valueOf(virtualId), sn, time);
        }
        VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        Intrinsics.checkNotNull(virtualId);
        virtualAccount.setAccountId(virtualId.longValue());
        virtualAccount.setDid(did);
        virtualAccount.setModel(model);
        virtualAccount.setUid(Long.parseLong(userId));
        virtualAccount.setType(userType);
        virtualAccount.setDel(z);
        Intrinsics.checkNotNull(icon);
        virtualAccount.setIcon(icon);
        Intrinsics.checkNotNull(nickName);
        virtualAccount.setName(nickName);
        virtualAccount.setBodyComposition(f4b.c(weightResult));
        virtualAccount.setCreateTime(j);
        virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(j, "yyyyMMdd"));
        qal.c("getBodyMakeUpData() uid : " + virtualAccount.getUid() + " ====== virtualAccount : " + f4b.c(virtualAccount));
        if (virtualAccount.getType() == i) {
            WeightInfoUtil.INSTANCE.recordWeight(did, FitnessDateUtils.getCurrentTZOffsetInSec(), time, weightResult);
            AnyExtKt.main$default(null, new AnonymousClass3(null), i, null);
        }
        return virtualAccount;
    }

    public final float kgConvertOther(float weight, int unit) {
        if (unit == 2) {
            return WeightInfoUtil.INSTANCE.getFormatFloat((weight * 22046) / 10000);
        }
        return unit == 3 ? WeightInfoUtil.INSTANCE.getFormatFloat((float) (((double) weight) / 0.5d)) : WeightInfoUtil.INSTANCE.getFormatFloat(weight);
    }

    public final void saveBodyMakeUpData(@NotNull VirtualAccount virtualAccount, @Nullable SyncWeightRecordCallback syncWeightRecordCallback, @NotNull Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        VirtualAccountHelper.INSTANCE.insertVirtualAccount(virtualAccount, callBack, syncWeightRecordCallback);
    }

    public final int kgConvertOther(int weight, int unit) {
        if (unit == 2) {
            return (weight * 22046) / 10000;
        }
        return unit == 3 ? (int) (((double) weight) / 0.5d) : weight;
    }
}
