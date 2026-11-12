package com.xiaomi.fitness.electronic.scale.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import defpackage.f4b;
import defpackage.ld8;
import defpackage.lx7;
import defpackage.qal;
import defpackage.rw7;
import defpackage.sw7;
import defpackage.u7r;
import defpackage.vw7;
import defpackage.ww7;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/ScaleUtil;", "", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entries", "", "getTheMaxNumber", "(Ljava/util/List;)F", "", "did", "Lrw7;", "data", "", "saveData", "(Ljava/lang/String;Lrw7;)V", "", "success", "", "errorCode", "sendDataChangedBroadcast", "(ZLjava/lang/Integer;)V", "Lu7r;", "packet", "handleMainWeightProduce", "(Ljava/lang/String;Lu7r;)Z", "handleBackgroundUploadBodyComposition", "(Ljava/lang/String;Lu7r;)V", "curVersion", "isUpdateSuccess", "(Ljava/lang/String;Ljava/lang/Integer;)Z", "TAG", "Ljava/lang/String;", "isInWeight", "Z", "()Z", "setInWeight", "(Z)V", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ScaleUtil {

    @NotNull
    public static final ScaleUtil INSTANCE = new ScaleUtil();

    @NotNull
    private static final String TAG = "ScaleUtil";
    private static boolean isInWeight;

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.util.ScaleUtil$saveData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.util.ScaleUtil$saveData$2", f = "ScaleUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.util.ScaleUtil$saveData$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.util.ScaleUtil$saveData$4", f = "ScaleUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(continuation);
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
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private ScaleUtil() {
    }

    @JvmStatic
    public static final float getTheMaxNumber(@Nullable List<? extends RecyclerBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return 0.0f;
        }
        float y = entries.get(0).getY();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            y = Math.max(y, entries.get(i).getY());
        }
        return y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackgroundUploadBodyComposition$lambda$0(ClaimRecord record) {
        Intrinsics.checkNotNullParameter(record, "$record");
        Logger.i(TAG, "handleUploadBodyComposition data success " + f4b.c(record));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0366  */
    private final void saveData(String did, rw7 data) {
        String sn;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!EightDeviceSyncImpl.INSTANCE.isBodyCompositionHasZk(data)) {
            WeightResult weightResultBodyCompositionToWeightResult = WeightResult.INSTANCE.bodyCompositionToWeightResult(data, String.valueOf(data.d.c), data.f / 10, did, jCurrentTimeMillis);
            VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
            virtualAccount.setDid(did);
            virtualAccount.setModel("yunmai.scales.ms3001");
            virtualAccount.setAccountId(data.d.c);
            virtualAccount.setUid(data.c.c);
            virtualAccount.setDel(false);
            virtualAccount.setIcon("");
            virtualAccount.setName("");
            virtualAccount.setAccountId(data.d.c);
            if (data.d.c == 0) {
                i = 1;
                virtualAccount.setType(1);
            } else {
                i = 1;
                virtualAccount.setType(2);
            }
            virtualAccount.setBodyComposition(f4b.c(weightResultBodyCompositionToWeightResult));
            virtualAccount.setCreateTime(jCurrentTimeMillis);
            virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(jCurrentTimeMillis, "yyyyMMdd"));
            Logger.i(TAG, "saveData() virtualId : " + virtualAccount.getAccountId() + " ====== createDate : " + virtualAccount.getCreateDate());
            VirtualAccountHelper.insertVirtualAccount$default(VirtualAccountHelper.INSTANCE, virtualAccount, new Function0() { // from class: kbl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScaleUtil.saveData$lambda$1();
                }
            }, null, 4, null);
            if (virtualAccount.getType() == i) {
                WeightInfoUtil.INSTANCE.recordWeight(did, FitnessDateUtils.getCurrentTZOffsetInSec(), jCurrentTimeMillis, weightResultBodyCompositionToWeightResult);
                AnyExtKt.main$default(null, new AnonymousClass2(null), i, null);
                return;
            }
            return;
        }
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        float f = 10;
        float f2 = data.f / f;
        int i2 = data.f32963k;
        lx7 lx7Var = data.j;
        float f3 = lx7Var.c / f;
        float f4 = lx7Var.o / f;
        float f5 = lx7Var.d / f;
        float f6 = lx7Var.f / f;
        float f7 = lx7Var.i / f;
        float f8 = lx7Var.e / f;
        float f9 = lx7Var.g / f;
        float f10 = lx7Var.j / f;
        float f11 = lx7Var.m / f;
        float f12 = lx7Var.u / f;
        float f13 = lx7Var.v / f;
        float f14 = lx7Var.w / f;
        float f15 = lx7Var.x / f;
        float f16 = lx7Var.y / f;
        float f17 = lx7Var.J / f;
        float f18 = lx7Var.K / f;
        float f19 = lx7Var.L / f;
        float f20 = lx7Var.M / f;
        float f21 = lx7Var.N / f;
        float f22 = lx7Var.h;
        short s = (short) (((short) lx7Var.l) / 10);
        byte b2 = (byte) (lx7Var.f25514k / 10);
        byte b3 = (byte) (lx7Var.n / 10);
        float f23 = lx7Var.q / f;
        float f24 = lx7Var.s / f;
        int i3 = lx7Var.t;
        short s2 = (short) (((short) lx7Var.E) / 10);
        short s3 = (short) (((short) lx7Var.F) / 10);
        short s4 = (short) (((short) lx7Var.G) / 10);
        short s5 = (short) (((short) lx7Var.H) / 10);
        short s6 = (short) (((short) lx7Var.I) / 10);
        short s7 = (short) (((short) lx7Var.T) / 10);
        short s8 = (short) (((short) lx7Var.U) / 10);
        short s9 = (short) (((short) lx7Var.V) / 10);
        short s10 = (short) (((short) lx7Var.W) / 10);
        short s11 = (short) (((short) lx7Var.X) / 10);
        short s12 = (short) (((short) lx7Var.p) / 10);
        short s13 = (short) (((short) lx7Var.f25515r) / 10);
        byte b4 = (byte) (lx7Var.Y / 10);
        byte b5 = (byte) (lx7Var.Z / 10);
        byte b6 = (byte) (lx7Var.a0 / 10);
        byte b7 = (byte) (lx7Var.b0 / 10);
        byte b8 = (byte) (lx7Var.c0 / 10);
        byte b9 = (byte) (lx7Var.d0 / 10);
        float f25 = ((short) lx7Var.e0) / f;
        float f26 = ((short) lx7Var.g0) / f;
        float f27 = ((short) lx7Var.f0) / f;
        sw7 sw7Var = data.h;
        Integer numValueOf = sw7Var != null ? Integer.valueOf(sw7Var.c) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        sw7 sw7Var2 = data.h;
        Integer numValueOf2 = sw7Var2 != null ? Integer.valueOf(sw7Var2.d) : null;
        Intrinsics.checkNotNull(numValueOf2);
        int iIntValue2 = numValueOf2.intValue();
        sw7 sw7Var3 = data.h;
        Integer numValueOf3 = sw7Var3 != null ? Integer.valueOf(sw7Var3.e) : null;
        Intrinsics.checkNotNull(numValueOf3);
        int iIntValue3 = numValueOf3.intValue();
        sw7 sw7Var4 = data.h;
        Integer numValueOf4 = sw7Var4 != null ? Integer.valueOf(sw7Var4.f) : null;
        Intrinsics.checkNotNull(numValueOf4);
        int iIntValue4 = numValueOf4.intValue();
        sw7 sw7Var5 = data.h;
        Integer numValueOf5 = sw7Var5 != null ? Integer.valueOf(sw7Var5.g) : null;
        Intrinsics.checkNotNull(numValueOf5);
        int iIntValue5 = numValueOf5.intValue();
        sw7 sw7Var6 = data.h;
        Integer numValueOf6 = sw7Var6 != null ? Integer.valueOf(sw7Var6.h) : null;
        Intrinsics.checkNotNull(numValueOf6);
        int iIntValue6 = numValueOf6.intValue();
        sw7 sw7Var7 = data.i;
        Integer numValueOf7 = sw7Var7 != null ? Integer.valueOf(sw7Var7.c) : null;
        Intrinsics.checkNotNull(numValueOf7);
        int iIntValue7 = numValueOf7.intValue();
        sw7 sw7Var8 = data.i;
        Integer numValueOf8 = sw7Var8 != null ? Integer.valueOf(sw7Var8.d) : null;
        Intrinsics.checkNotNull(numValueOf8);
        int iIntValue8 = numValueOf8.intValue();
        sw7 sw7Var9 = data.i;
        Integer numValueOf9 = sw7Var9 != null ? Integer.valueOf(sw7Var9.e) : null;
        Intrinsics.checkNotNull(numValueOf9);
        int iIntValue9 = numValueOf9.intValue();
        sw7 sw7Var10 = data.i;
        Integer numValueOf10 = sw7Var10 != null ? Integer.valueOf(sw7Var10.f) : null;
        Intrinsics.checkNotNull(numValueOf10);
        int iIntValue10 = numValueOf10.intValue();
        sw7 sw7Var11 = data.i;
        Integer numValueOf11 = sw7Var11 != null ? Integer.valueOf(sw7Var11.g) : null;
        Intrinsics.checkNotNull(numValueOf11);
        int iIntValue11 = numValueOf11.intValue();
        sw7 sw7Var12 = data.i;
        Integer numValueOf12 = sw7Var12 != null ? Integer.valueOf(sw7Var12.h) : null;
        Intrinsics.checkNotNull(numValueOf12);
        int iIntValue12 = numValueOf12.intValue();
        String strValueOf = String.valueOf(data.d.c);
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
        final WeightResult weightResult = new WeightResult(1, userId, f2, i2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, s, b2, b3, f23, f24, i3, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, b4, b5, b6, b7, b8, b9, f25, f26, f27, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, iIntValue12, strValueOf, sn, jCurrentTimeMillis);
        VirtualAccount virtualAccount2 = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        virtualAccount2.setDid(did);
        virtualAccount2.setModel("yunmai.scales.ms3001");
        MiAccountManager.Companion companion2 = MiAccountManager.INSTANCE;
        virtualAccount2.setUid(Long.parseLong(companion2.getInstance().getMiId()));
        virtualAccount2.setAccountId(data.d.c);
        if (data.d.c == 0) {
            virtualAccount2.setType(1);
        } else {
            virtualAccount2.setType(2);
        }
        virtualAccount2.setDel(false);
        virtualAccount2.setIcon(companion2.getInstance().getAvatarAddress());
        virtualAccount2.setName(companion2.getInstance().getNickName());
        virtualAccount2.setBodyComposition(f4b.c(weightResult));
        virtualAccount2.setCreateTime(jCurrentTimeMillis);
        virtualAccount2.setCreateDate(DateUtil.INSTANCE.getDateToString(jCurrentTimeMillis, "yyyyMMdd"));
        Logger.i(TAG, "saveData() currentTimeMillis ：" + jCurrentTimeMillis + " uid : " + virtualAccount2.getUid() + " ====== createDate : " + virtualAccount2.getCreateDate());
        WeightManager.saveBodyMakeUpData$default(WeightManager.INSTANCE.getInstance(), virtualAccount2, null, new Function0() { // from class: lbl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScaleUtil.saveData$lambda$4(weightResult);
            }
        }, 2, null);
        if (virtualAccount2.getType() == 1) {
            WeightInfoUtil.INSTANCE.recordWeight(did, FitnessDateUtils.getCurrentTZOffsetInSec(), jCurrentTimeMillis, weightResult);
            AnyExtKt.main$default(null, new AnonymousClass4(null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveData$lambda$1() {
        Logger.i(TAG, "saveData() virtual user success");
        ld8.c().l(new ScaleEventBusIds.RefreshWeightResultData());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveData$lambda$4(WeightResult weightResult) {
        Intrinsics.checkNotNullParameter(weightResult, "$weightResult");
        Logger.i(TAG, "saveData() success" + f4b.c(weightResult));
        ld8.c().l(new ScaleEventBusIds.RefreshWeightResultData());
        return Unit.INSTANCE;
    }

    public final void handleBackgroundUploadBodyComposition(@NotNull String did, @Nullable u7r packet) {
        rw7 rw7VarP;
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "handleUploadBodyComposition = " + packet);
        if (packet != null) {
            ww7 ww7VarT = packet.t();
            Integer numValueOf = (ww7VarT == null || (rw7VarP = ww7VarT.p()) == null) ? null : Integer.valueOf(rw7VarP.f);
            Intrinsics.checkNotNull(numValueOf);
            if (numValueOf.intValue() >= 1) {
                ww7 ww7VarT2 = packet.t();
                rw7 rw7VarP2 = ww7VarT2 != null ? ww7VarT2.p() : null;
                Integer numValueOf2 = rw7VarP2 != null ? Integer.valueOf(rw7VarP2.f) : null;
                Intrinsics.checkNotNull(numValueOf2);
                float fIntValue = numValueOf2.intValue() / 10;
                int i = packet.t().p().e;
                if (i == 0) {
                    saveData(did, rw7VarP2);
                    return;
                }
                if (i == 1 || i == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i2 = rw7VarP2.f32963k;
                    sw7 sw7Var = rw7VarP2.h;
                    int i3 = sw7Var.c;
                    int i4 = sw7Var.d;
                    int i5 = sw7Var.e;
                    int i6 = sw7Var.f;
                    int i7 = sw7Var.g;
                    int i8 = sw7Var.h;
                    sw7 sw7Var2 = rw7VarP2.i;
                    final ClaimRecord claimRecord = new ClaimRecord(did, null, fIntValue, null, false, jCurrentTimeMillis, i2, i3, i4, i5, i6, i7, i8, sw7Var2.c, sw7Var2.d, sw7Var2.e, sw7Var2.f, sw7Var2.g, sw7Var2.h, 0, false, 524314, null);
                    ClaimRecordHelper.INSTANCE.insertClaimRecord(claimRecord, new Function0() { // from class: mbl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ScaleUtil.handleBackgroundUploadBodyComposition$lambda$0(claimRecord);
                        }
                    });
                }
            }
        }
    }

    public final boolean handleMainWeightProduce(@NotNull String did, @Nullable u7r packet) {
        vw7 vw7VarW;
        vw7 vw7VarW2;
        vw7 vw7VarW3;
        vw7 vw7VarW4;
        Intrinsics.checkNotNullParameter(did, "did");
        if (packet == null) {
            return false;
        }
        ScalePageUtil scalePageUtil = ScalePageUtil.INSTANCE;
        if (scalePageUtil.getWEIGHT_ACTIVITY_IS_START()) {
            return false;
        }
        scalePageUtil.setWEIGHT_ACTIVITY_IS_START(true);
        Bundle bundle = new Bundle();
        ww7 ww7VarT = packet.t();
        Integer numValueOf = null;
        Integer numValueOf2 = (ww7VarT == null || (vw7VarW4 = ww7VarT.w()) == null) ? null : Integer.valueOf(vw7VarW4.d);
        Intrinsics.checkNotNull(numValueOf2);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_UNIT_KEY, numValueOf2.intValue());
        ww7 ww7VarT2 = packet.t();
        Integer numValueOf3 = (ww7VarT2 == null || (vw7VarW3 = ww7VarT2.w()) == null) ? null : Integer.valueOf(vw7VarW3.c);
        Intrinsics.checkNotNull(numValueOf3);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_WEIGHT_KEY, numValueOf3.intValue());
        ww7 ww7VarT3 = packet.t();
        Integer numValueOf4 = (ww7VarT3 == null || (vw7VarW2 = ww7VarT3.w()) == null) ? null : Integer.valueOf(vw7VarW2.e);
        Intrinsics.checkNotNull(numValueOf4);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_LOCK_KEY, numValueOf4.intValue());
        ww7 ww7VarT4 = packet.t();
        if (ww7VarT4 != null && (vw7VarW = ww7VarT4.w()) != null) {
            numValueOf = Integer.valueOf(vw7VarW.f);
        }
        Intrinsics.checkNotNull(numValueOf);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_MATCH_NUM_KEY, numValueOf.intValue());
        bundle.putString(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_DID_KEY, did);
        Logger.i(TAG, "handleMainWeightProduce startWeightActivity");
        Context applicationContext = AppUtil.getApp().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ElectronicScaleManagerExtKt.launchToElectronicWeightActivity(applicationContext, bundle, did);
        return true;
    }

    public final boolean isInWeight() {
        return isInWeight;
    }

    public final boolean isUpdateSuccess(@NotNull String did, @Nullable Integer curVersion) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = ElectronicScalePreference.SCALE_LAST_FIRMWARE_VERSION_KEY + did;
        int i = ElectronicScalePreference.getInt(str, -1);
        Logger.i(TAG, "lastVersion : " + i);
        Logger.i(TAG, "curVersion : " + curVersion);
        if (curVersion == null) {
            return false;
        }
        ElectronicScalePreference.putInt(str, curVersion.intValue());
        return i != -1 && curVersion.intValue() > i;
    }

    public final void sendDataChangedBroadcast(boolean success, @Nullable Integer errorCode) {
        qal.c("sendDataChangedBroadcast, success = " + success);
        Intent intent = new Intent("recent_data_changed_broadcast");
        intent.putExtra(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON, FitnessDataConstants.REASON_SERVER_SYNC);
        intent.putExtra(FitnessDataConstants.EXTRA_BOOLEAN_RESULT, success);
        if (!success && errorCode != null) {
            intent.putExtra("error_code", errorCode.intValue());
        }
        intent.setPackage(ApplicationExtKt.getApplication().getPackageName());
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    public final void setInWeight(boolean z) {
        isInWeight = z;
    }
}
