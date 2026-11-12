package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
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
import com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.util.UserHelper;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.dx7;
import defpackage.f4b;
import defpackage.fx7;
import defpackage.jx7;
import defpackage.kx7;
import defpackage.lx7;
import defpackage.qal;
import defpackage.rw7;
import defpackage.sw7;
import defpackage.u7r;
import defpackage.ww7;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010%\n\u0002\b\r\u0018\u0000 T2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\bR\u0010SJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJa\u0010*\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u0019R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00106\u001a\u0004\b:\u00108\"\u0004\b;\u0010\u0019R\"\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00106\u001a\u0004\bC\u00108\"\u0004\bD\u0010\u0019R\"\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010=\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR.\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010O\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010=\u001a\u0004\bP\u0010?\"\u0004\bQ\u0010A¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/WeightViewModel;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "", "did", "", "weight", "unit", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSyncCallback", "", "updateBaseWeight", "(Ljava/lang/String;IILcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnVirtualAccountListener;", "onVirtualAccountListener", "getAllVirtualAccount", "(Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnVirtualAccountListener;)V", "", "virtualId", "getVirtualAccountByVirtualId", "(Ljava/lang/String;JLcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnVirtualAccountListener;)V", "initVirtualAccount", "(Ljava/lang/String;)V", "", "syncBaseWeight", "(Ljava/lang/String;FI)V", "deviceId", "updateVirtualUserToDevice", "(JLjava/lang/String;FILcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "model", "Lrw7;", "bodyComposition", "userType", "url", "nickName", "Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;", "syncWeightRecordCallback", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;", "onAddToDbListener", "addBodyCompositionToDbNew", "(Ljava/lang/String;Ljava/lang/String;FLrw7;JILjava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;)V", "", "uIdList", "matchByCloud", "(FLjava/lang/String;Ljava/util/List;)I", "getMatchByCloud", "(FLjava/lang/String;)I", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "getVirtualUserByLocal", "(Ljava/lang/String;J)Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "getNickName", "setNickName", "sex", "I", "getSex", "()I", "setSex", "(I)V", "birthday", "getBirthday", "setBirthday", "height", "getHeight", "setHeight", "", "mapVirtualAccount", "Ljava/util/Map;", "getMapVirtualAccount", "()Ljava/util/Map;", "setMapVirtualAccount", "(Ljava/util/Map;)V", "virtualUserCount", "getVirtualUserCount", "setVirtualUserCount", "<init>", "()V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeightViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightViewModel.kt\ncom/xiaomi/fitness/electronic/scale/WeightViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,388:1\n1863#2,2:389\n1863#2,2:391\n1863#2,2:393\n1863#2,2:395\n1863#2,2:397\n1863#2,2:399\n*S KotlinDebug\n*F\n+ 1 WeightViewModel.kt\ncom/xiaomi/fitness/electronic/scale/WeightViewModel\n*L\n345#1:389,2\n365#1:391,2\n380#1:393,2\n62#1:395,2\n103#1:397,2\n129#1:399,2\n*E\n"})
public final class WeightViewModel extends ElectronicScaleBaseViewModel {

    @NotNull
    public static final String TAG = "EightWeightViewModel";
    public static final int VERSION = 1;

    @Nullable
    private String birthday;
    private int height;

    @Nullable
    private String nickName;
    private int virtualUserCount;

    @Nullable
    private String type = WeightActivity.WEIGHT_TYPE_NORMAL;
    private int sex = 1;

    @NotNull
    private Map<Long, VirtualAccount> mapVirtualAccount = new LinkedHashMap();

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.WeightViewModel$addBodyCompositionToDbNew$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.WeightViewModel$addBodyCompositionToDbNew$2", f = "WeightViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addBodyCompositionToDbNew$lambda$11(ElectronicScaleBaseViewModel.OnAddToDbListener onAddToDbListener, WeightResult weightResult) {
        Intrinsics.checkNotNullParameter(onAddToDbListener, "$onAddToDbListener");
        Intrinsics.checkNotNullParameter(weightResult, "$weightResult");
        onAddToDbListener.onSuccess();
        Logger.i(TAG, "addBodyCompositionToDbForVirtualUser success" + f4b.c(weightResult));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllVirtualAccount$lambda$1(WeightViewModel this$0, ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "$onVirtualAccountListener");
        Intrinsics.checkNotNullParameter(it, "it");
        List<VirtualAccount> list = (List) it.getResult();
        if (list != null) {
            for (VirtualAccount virtualAccount : list) {
                this$0.mapVirtualAccount.put(Long.valueOf(virtualAccount.getAccountId()), virtualAccount);
                onVirtualAccountListener.onVirtualAccount(virtualAccount);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllVirtualAccount$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "initVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    public static final Unit getVirtualAccountByVirtualId$lambda$4(ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener, WeightViewModel this$0, long j, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "$onVirtualAccountListener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<VirtualAccount> list = (List) it.getResult();
        if (list != null) {
            boolean z = false;
            for (VirtualAccount virtualAccount : list) {
                Logger.i(TAG, "handleWeight getVirtualAccount it " + virtualAccount);
                this$0.mapVirtualAccount.put(Long.valueOf(virtualAccount.getAccountId()), virtualAccount);
                if (virtualAccount.getAccountId() == j) {
                    onVirtualAccountListener.onVirtualAccount(virtualAccount);
                    z = true;
                }
            }
            if (!z) {
                onVirtualAccountListener.onNoVirtualAccount();
            }
        } else {
            onVirtualAccountListener.onNoVirtualAccount();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVirtualAccountByVirtualId$lambda$5(ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener, ApiException it) {
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "$onVirtualAccountListener");
        Intrinsics.checkNotNullParameter(it, "it");
        onVirtualAccountListener.onFailed();
        Logger.i(TAG, "getVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVirtualAccount$lambda$7(WeightViewModel this$0, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<VirtualAccount> list = (List) it.getResult();
        if (list != null) {
            for (VirtualAccount virtualAccount : list) {
                this$0.mapVirtualAccount.put(Long.valueOf(virtualAccount.getAccountId()), virtualAccount);
            }
        }
        List list2 = (List) it.getResult();
        Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        this$0.virtualUserCount = numValueOf.intValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVirtualAccount$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "initVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    private final void updateBaseWeight(String did, int weight, int unit, OnEcoSyncCallback onSyncCallback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 7;
        ww7 ww7Var = new ww7();
        dx7 dx7Var = new dx7();
        dx7Var.c = weight;
        dx7Var.d = unit;
        ww7Var.E(dx7Var);
        u7rVar.D(ww7Var);
        Logger.i(TAG, " updateBaseWeight send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 2000);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0281  */
    public final void addBodyCompositionToDbNew(@NotNull String did, @NotNull String model, float weight, @NotNull rw7 bodyComposition, long virtualId, int userType, @NotNull String url, @NotNull String nickName, @Nullable SyncWeightRecordCallback syncWeightRecordCallback, @NotNull final ElectronicScaleBaseViewModel.OnAddToDbListener onAddToDbListener) {
        String sn;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(bodyComposition, "bodyComposition");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(onAddToDbListener, "onAddToDbListener");
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        int i = bodyComposition.f32963k;
        lx7 lx7Var = bodyComposition.j;
        float f = 10;
        float f2 = lx7Var.c / f;
        float f3 = lx7Var.o / f;
        float f4 = lx7Var.d / f;
        float f5 = lx7Var.f / f;
        float f6 = lx7Var.i / f;
        float f7 = lx7Var.e / f;
        float f8 = lx7Var.g / f;
        float f9 = lx7Var.j / f;
        float f10 = lx7Var.m / f;
        float f11 = lx7Var.u / f;
        float f12 = lx7Var.v / f;
        float f13 = lx7Var.w / f;
        float f14 = lx7Var.x / f;
        float f15 = lx7Var.y / f;
        float f16 = lx7Var.J / f;
        float f17 = lx7Var.K / f;
        float f18 = lx7Var.L / f;
        float f19 = lx7Var.M / f;
        float f20 = lx7Var.N / f;
        float f21 = lx7Var.h;
        short s = (short) (((short) lx7Var.l) / 10);
        byte b2 = (byte) (lx7Var.f25514k / 10);
        byte b3 = (byte) (lx7Var.n / 10);
        float f22 = lx7Var.q / f;
        float f23 = lx7Var.s / f;
        int i2 = lx7Var.t;
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
        float f24 = ((short) lx7Var.e0) / f;
        float f25 = ((short) lx7Var.g0) / f;
        float f26 = ((short) lx7Var.f0) / f;
        sw7 sw7Var = bodyComposition.h;
        Integer numValueOf = sw7Var != null ? Integer.valueOf(sw7Var.c) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        sw7 sw7Var2 = bodyComposition.h;
        Integer numValueOf2 = sw7Var2 != null ? Integer.valueOf(sw7Var2.d) : null;
        Intrinsics.checkNotNull(numValueOf2);
        int iIntValue2 = numValueOf2.intValue();
        sw7 sw7Var3 = bodyComposition.h;
        Integer numValueOf3 = sw7Var3 != null ? Integer.valueOf(sw7Var3.e) : null;
        Intrinsics.checkNotNull(numValueOf3);
        int iIntValue3 = numValueOf3.intValue();
        sw7 sw7Var4 = bodyComposition.h;
        Integer numValueOf4 = sw7Var4 != null ? Integer.valueOf(sw7Var4.f) : null;
        Intrinsics.checkNotNull(numValueOf4);
        int iIntValue4 = numValueOf4.intValue();
        sw7 sw7Var5 = bodyComposition.h;
        Integer numValueOf5 = sw7Var5 != null ? Integer.valueOf(sw7Var5.g) : null;
        Intrinsics.checkNotNull(numValueOf5);
        int iIntValue5 = numValueOf5.intValue();
        sw7 sw7Var6 = bodyComposition.h;
        Integer numValueOf6 = sw7Var6 != null ? Integer.valueOf(sw7Var6.h) : null;
        Intrinsics.checkNotNull(numValueOf6);
        int iIntValue6 = numValueOf6.intValue();
        sw7 sw7Var7 = bodyComposition.i;
        Integer numValueOf7 = sw7Var7 != null ? Integer.valueOf(sw7Var7.c) : null;
        Intrinsics.checkNotNull(numValueOf7);
        int iIntValue7 = numValueOf7.intValue();
        sw7 sw7Var8 = bodyComposition.i;
        Integer numValueOf8 = sw7Var8 != null ? Integer.valueOf(sw7Var8.d) : null;
        Intrinsics.checkNotNull(numValueOf8);
        int iIntValue8 = numValueOf8.intValue();
        sw7 sw7Var9 = bodyComposition.i;
        Integer numValueOf9 = sw7Var9 != null ? Integer.valueOf(sw7Var9.e) : null;
        Intrinsics.checkNotNull(numValueOf9);
        int iIntValue9 = numValueOf9.intValue();
        sw7 sw7Var10 = bodyComposition.i;
        Integer numValueOf10 = sw7Var10 != null ? Integer.valueOf(sw7Var10.f) : null;
        Intrinsics.checkNotNull(numValueOf10);
        int iIntValue10 = numValueOf10.intValue();
        sw7 sw7Var11 = bodyComposition.i;
        Integer numValueOf11 = sw7Var11 != null ? Integer.valueOf(sw7Var11.g) : null;
        Intrinsics.checkNotNull(numValueOf11);
        int iIntValue11 = numValueOf11.intValue();
        sw7 sw7Var12 = bodyComposition.i;
        Integer numValueOf12 = sw7Var12 != null ? Integer.valueOf(sw7Var12.h) : null;
        Intrinsics.checkNotNull(numValueOf12);
        int iIntValue12 = numValueOf12.intValue();
        String strValueOf = String.valueOf(virtualId);
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
        final WeightResult weightResult = new WeightResult(1, userId, weight, i, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, s, b2, b3, f22, f23, i2, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, b4, b5, b6, b7, b8, b9, f24, f25, f26, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, iIntValue12, strValueOf, sn, System.currentTimeMillis());
        VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        virtualAccount.setAccountId(virtualId);
        virtualAccount.setDid(did);
        virtualAccount.setModel(model);
        virtualAccount.setUid(Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId()));
        virtualAccount.setType(userType);
        virtualAccount.setDel(false);
        virtualAccount.setIcon(url);
        virtualAccount.setName(nickName);
        virtualAccount.setBodyComposition(f4b.c(weightResult));
        long jCurrentTimeMillis = System.currentTimeMillis();
        virtualAccount.setCreateTime(jCurrentTimeMillis);
        virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(jCurrentTimeMillis, "yyyyMMdd"));
        qal.c("addBodyCompositionToDbForVirtualUser() uid : " + virtualAccount.getUid() + " ====== createDate : " + virtualAccount.getCreateDate());
        String strC = f4b.c(weightResult);
        StringBuilder sb = new StringBuilder();
        sb.append("addBodyCompositionToDbForVirtualUser ");
        sb.append(strC);
        Logger.i(TAG, sb.toString());
        WeightManager.INSTANCE.getInstance().saveBodyMakeUpData(virtualAccount, syncWeightRecordCallback, new Function0() { // from class: ihr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightViewModel.addBodyCompositionToDbNew$lambda$11(onAddToDbListener, weightResult);
            }
        });
        if (virtualAccount.getType() == 1) {
            WeightInfoUtil.INSTANCE.recordWeight(did, FitnessDateUtils.getCurrentTZOffsetInSec(), jCurrentTimeMillis, weightResult);
            AnyExtKt.main$default(null, new AnonymousClass2(null), 1, null);
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getAllVirtualAccount(@NotNull String did, @NotNull final ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "onVirtualAccountListener");
        new ScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new Function1() { // from class: fhr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightViewModel.getAllVirtualAccount$lambda$1(this.f17796a, onVirtualAccountListener, (ProxyResponse) obj);
            }
        }, new Function1() { // from class: hhr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightViewModel.getAllVirtualAccount$lambda$2((ApiException) obj);
            }
        });
    }

    @Nullable
    public final String getBirthday() {
        return this.birthday;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final Map<Long, VirtualAccount> getMapVirtualAccount() {
        return this.mapVirtualAccount;
    }

    public final int getMatchByCloud(float weight, @NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator<T> it = UserHelper.INSTANCE.getVirtualUserFromSp(did).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Math.abs(((VirtualAccount) it.next()).getWeightTarget() - weight) <= 2.0f) {
                i++;
            }
        }
        return Math.abs(MiAccountManager.INSTANCE.getInstance().getWeight() - weight) <= 2.0f ? i + 1 : i;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final int getSex() {
        return this.sex;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void getVirtualAccountByVirtualId(@NotNull String did, final long virtualId, @NotNull final ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "onVirtualAccountListener");
        Logger.i(TAG, "handleWeight getVirtualAccount virtualId " + virtualId);
        if (this.mapVirtualAccount.get(Long.valueOf(virtualId)) != null) {
            VirtualAccount virtualAccount = this.mapVirtualAccount.get(Long.valueOf(virtualId));
            Intrinsics.checkNotNull(virtualAccount);
            Logger.i(TAG, "handleWeight getVirtualAccount mapVirtualAccount " + virtualAccount);
            VirtualAccount virtualAccount2 = this.mapVirtualAccount.get(Long.valueOf(virtualId));
            Intrinsics.checkNotNull(virtualAccount2);
            onVirtualAccountListener.onVirtualAccount(virtualAccount2);
            return;
        }
        VirtualAccount virtualUserByLocal = getVirtualUserByLocal(did, virtualId);
        if (virtualUserByLocal == null) {
            new ScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new Function1() { // from class: jhr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeightViewModel.getVirtualAccountByVirtualId$lambda$4(onVirtualAccountListener, this, virtualId, (ProxyResponse) obj);
                }
            }, new Function1() { // from class: khr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeightViewModel.getVirtualAccountByVirtualId$lambda$5(onVirtualAccountListener, (ApiException) obj);
                }
            });
            return;
        }
        Logger.i(TAG, "handleWeight getVirtualAccount localVirtualAccount " + virtualUserByLocal);
        onVirtualAccountListener.onVirtualAccount(virtualUserByLocal);
    }

    @Nullable
    public final VirtualAccount getVirtualUserByLocal(@NotNull String did, long virtualId) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "getVirtualUserByLocal virtualId : " + virtualId + " ");
        for (VirtualAccount virtualAccount : UserHelper.INSTANCE.getVirtualUserFromSp(did)) {
            if (virtualId == virtualAccount.getAccountId()) {
                return virtualAccount;
            }
        }
        return null;
    }

    public final int getVirtualUserCount() {
        return this.virtualUserCount;
    }

    public final void initVirtualAccount(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        new ScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new Function1() { // from class: lhr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightViewModel.initVirtualAccount$lambda$7(this.f25087a, (ProxyResponse) obj);
            }
        }, new Function1() { // from class: mhr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightViewModel.initVirtualAccount$lambda$8((ApiException) obj);
            }
        });
    }

    public final int matchByCloud(float weight, @NotNull String did, @NotNull List<String> uIdList) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(uIdList, "uIdList");
        Logger.i(TAG, "matchByCloud weight : " + weight + " ");
        int i = 0;
        for (VirtualAccount virtualAccount : UserHelper.INSTANCE.getVirtualUserFromSp(did)) {
            float weightTarget = virtualAccount.getWeightTarget();
            Logger.i(TAG, "matchByCloud virtual user accountId : " + virtualAccount.getAccountId() + " , weight : " + virtualAccount.getWeightTarget() + " ");
            if (Math.abs(weightTarget - weight) <= 2.0f) {
                i++;
                uIdList.add(String.valueOf(virtualAccount.getAccountId()));
            }
        }
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        float weight2 = companion.getInstance().getWeight();
        Logger.i(TAG, "matchByCloud mainWeight : " + weight2 + " ");
        if (Math.abs(weight2 - weight) > 2.0f) {
            return i;
        }
        int i2 = i + 1;
        uIdList.add(companion.getInstance().getMiId());
        return i2;
    }

    public final void setBirthday(@Nullable String str) {
        this.birthday = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMapVirtualAccount(@NotNull Map<Long, VirtualAccount> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.mapVirtualAccount = map;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setVirtualUserCount(int i) {
        this.virtualUserCount = i;
    }

    public final void syncBaseWeight(@NotNull String did, float weight, int unit) {
        Intrinsics.checkNotNullParameter(did, "did");
        updateBaseWeight(did, (int) (weight * 10), unit, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.WeightViewModel.syncBaseWeight.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.e(WeightViewModel.TAG, "syncBaseWeight error  did : " + did2 + " , type : " + type + " , code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i(WeightViewModel.TAG, "syncBaseWeight success  did : " + did2 + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
            }
        });
    }

    public final void updateVirtualUserToDevice(long virtualId, @NotNull String deviceId, float weight, int unit, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId());
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = virtualId;
        fx7Var.d = kx7Var;
        fx7Var.g = 0;
        fx7Var.f = 0;
        fx7Var.e = 1;
        fx7Var.h = 0;
        fx7Var.i = (int) (WeightManager.INSTANCE.getInstance().convertToKg(weight, unit) * 10);
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(TAG, "syncVirtualUser addOrUpdateVirtualUserToDevice pack: " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }
}
