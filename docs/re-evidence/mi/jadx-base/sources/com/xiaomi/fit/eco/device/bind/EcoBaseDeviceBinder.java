package com.xiaomi.fit.eco.device.bind;

import com.xiaomi.eco.api.p;
import com.xiaomi.fit.eco.device.EcoDeviceFactory;
import com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveKt;
import com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoInstanceExtKt;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDataTrackerKt;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.asc;
import defpackage.bv7;
import defpackage.ch7;
import defpackage.cv7;
import defpackage.ms7;
import defpackage.sh7;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\ba\u0010bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b!\u0010\u0010J\u0019\u0010\"\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010#\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0094@¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0004¢\u0006\u0004\b(\u0010)J\u0010\u0010%\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b%\u0010$J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010+J!\u0010.\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u0010/J1\u00103\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010/R\u001a\u00107\u001a\u0002068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010<\u001a\u0004\bF\u0010>\"\u0004\bG\u0010\u0010R\"\u0010H\u001a\u00020'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bH\u0010)\"\u0004\bJ\u0010KR\"\u0010L\u001a\u00020'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bL\u0010I\u001a\u0004\bM\u0010)\"\u0004\bN\u0010KR\u0016\u0010O\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010IR\"\u0010P\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010\u0010R\u001b\u0010X\u001a\u00020S8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\"\u0010Y\u001a\u00020'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010I\u001a\u0004\bY\u0010)\"\u0004\bZ\u0010KR\"\u0010[\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lcom/xiaomi/fit/eco/device/bind/EcoBaseDeviceBinder;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceBinder;", "Lcom/xiaomi/eco/api/p$b;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "", "reportDeviceActive", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "", "mac", "Lms7;", "getDeviceModelByMac", "(Ljava/lang/String;)Lms7;", "did", "onReportActive", "(Ljava/lang/String;)V", "Lsh7;", "callback", "bind", "(Lsh7;)V", "", "code", "message", "onBindFailure", "(ILjava/lang/String;)V", "model", "sn", "appDeviceId", "", "appToken", "onLocalBindSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V", "onBindSuccess", "rebind", "revokeAuthorization", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbind", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isDeviceConnect", "()Z", "onConnected", "()V", "onDisconnected", BroadcastsKt.SILENT_PUSHING_CANCEL, "onConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "onConnectSuccess", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;Ljava/lang/String;II)V", "onDisconnect", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "mDeviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "getMDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lasc;", "mEcoApiCall", "Lasc;", "getMEcoApiCall", "()Lasc;", "setMEcoApiCall", "(Lasc;)V", "getSn", "setSn", "isBindSuccess", "Z", "setBindSuccess", "(Z)V", "reportBindStatus", "getReportBindStatus", "setReportBindStatus", "isRebind", "mDid", "getMDid", "setMDid", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "mEcoDeviceManager$delegate", "Lkotlin/Lazy;", "getMEcoDeviceManager", "()Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "mEcoDeviceManager", "isServiceConnected", "setServiceConnected", "bindCount", "I", "getBindCount", "()I", "setBindCount", "(I)V", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class EcoBaseDeviceBinder implements EcoDeviceBinder, p.b, OnEcoDeviceStatusListener {

    @NotNull
    private final String TAG;
    private int bindCount;
    private boolean isBindSuccess;
    private boolean isRebind;
    private boolean isServiceConnected;

    @NotNull
    private final EcoDeviceInfo mDeviceInfo;

    @NotNull
    private String mDid;
    protected asc mEcoApiCall;

    /* JADX INFO: renamed from: mEcoDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcoDeviceManager;
    private boolean reportBindStatus;

    @Nullable
    private String sn;

    /* JADX INFO: renamed from: com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder$revokeAuthorization$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder", f = "EcoBaseDeviceBinder.kt", i = {0}, l = {309, 310}, m = "revokeAuthorization$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class C15371 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C15371(Continuation<? super C15371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoBaseDeviceBinder.revokeAuthorization$suspendImpl(EcoBaseDeviceBinder.this, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder$unbind$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder", f = "EcoBaseDeviceBinder.kt", i = {0}, l = {325, 333}, m = "unbind$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoBaseDeviceBinder.unbind$suspendImpl(EcoBaseDeviceBinder.this, this);
        }
    }

    public EcoBaseDeviceBinder(@NotNull EcoDeviceInfo mDeviceInfo) {
        Intrinsics.checkNotNullParameter(mDeviceInfo, "mDeviceInfo");
        this.mDeviceInfo = mDeviceInfo;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.TAG = simpleName;
        this.mDid = "";
        this.mEcoDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xf7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcoBaseDeviceBinder.mEcoDeviceManager_delegate$lambda$0();
            }
        });
    }

    private final ms7 getDeviceModelByMac(final String mac) {
        return getMEcoDeviceManager().findDeviceModel(new Function1() { // from class: yf7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(EcoBaseDeviceBinder.getDeviceModelByMac$lambda$3(mac, (ms7) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeviceModelByMac$lambda$3(String mac, ms7 it) {
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(EcoDeviceModelExtKt.getMac(it), mac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceManagerRemoteImpl mEcoDeviceManager_delegate$lambda$0() {
        return EcoInstanceExtKt.getInstance(EcoDeviceManagerRemoteImpl.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindSuccess$lambda$1(EcoBaseDeviceBinder this$0, String mac, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("requestDeviceList success " + it.size());
        ms7 deviceModelByMac = this$0.getDeviceModelByMac(mac);
        if (deviceModelByMac != null) {
            com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("requestDeviceList with mac " + mac + " , did " + deviceModelByMac.getDid());
        }
        this$0.getMEcoDeviceManager().notifyDeviceBind(this$0.mDid, this$0.isRebind);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindSuccess$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("requestDeviceList with exception " + it.getMessage());
        it.printStackTrace();
        return Unit.INSTANCE;
    }

    private final void onReportActive(String did) {
        EcoDeviceModel ecoDeviceModel;
        Logger.i(this.TAG, "onReportActive: did = " + did + ", binderDid = " + this.mDid + ", bindSuccess = " + this.isBindSuccess + ", report = " + this.reportBindStatus);
        if (!Intrinsics.areEqual(this.mDid, did) || !this.isBindSuccess || this.reportBindStatus || (ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did)) == null) {
            return;
        }
        reportDeviceActive(ecoDeviceModel);
        this.reportBindStatus = true;
    }

    private final void reportDeviceActive(EcoDeviceModel deviceModel) {
        Logger.i(this.TAG, "reportDeviceActive() called with: deviceModel = " + EcoDeviceModelExtKt.getFirmwareVersion(deviceModel));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object revokeAuthorization$suspendImpl(EcoBaseDeviceBinder ecoBaseDeviceBinder, Continuation<? super Integer> continuation) {
        C15371 c15371;
        if (continuation instanceof C15371) {
            c15371 = (C15371) continuation;
            int i = c15371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15371.label = i - Integer.MIN_VALUE;
            } else {
                c15371 = ecoBaseDeviceBinder.new C15371(continuation);
            }
        } else {
            c15371 = ecoBaseDeviceBinder.new C15371(continuation);
        }
        Object objRevoke = c15371.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15371.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ecoBaseDeviceBinder = (EcoBaseDeviceBinder) c15371.L$0;
                ResultKt.throwOnFailure(objRevoke);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRevoke);
            }
        }
        ResultKt.throwOnFailure(objRevoke);
        EcoDeviceRequest ecoDeviceRequest = new EcoDeviceRequest();
        String did = ecoBaseDeviceBinder.mDeviceInfo.getDid();
        c15371.L$0 = ecoBaseDeviceBinder;
        c15371.label = 1;
        objRevoke = ecoDeviceRequest.revoke(did, c15371);
        if (objRevoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        int iIntValue = ((Number) objRevoke).intValue();
        c15371.L$0 = null;
        c15371.label = 2;
        objRevoke = ecoBaseDeviceBinder.unbind(iIntValue, c15371);
        return objRevoke == coroutine_suspended ? coroutine_suspended : objRevoke;
    }

    public static /* synthetic */ Object unbind$suspendImpl(EcoBaseDeviceBinder ecoBaseDeviceBinder, int i, Continuation<? super Integer> continuation) {
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(ecoBaseDeviceBinder);
        return Boxing.boxInt(i);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder
    public void bind(@Nullable final sh7 callback) {
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        if (userId.length() == 0) {
            com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.loge$default("device binder userId is null, return", null, 2, null);
            return;
        }
        Logger.i(this.TAG, "mEcoApiCall isInitialized " + (this.mEcoApiCall != null));
        if (this.mEcoApiCall == null) {
            com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.loge$default("device binder api call not isInitialized", null, 2, null);
            return;
        }
        EcoBindDataTrackerKt.reportBindStart();
        this.reportBindStatus = false;
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this);
        asc mEcoApiCall = getMEcoApiCall();
        String oob = this.mDeviceInfo.getOob();
        String shareId = this.mDeviceInfo.getShareId();
        String shareUserId = this.mDeviceInfo.getShareUserId();
        String shareDid = this.mDeviceInfo.getShareDid();
        String shareModel = this.mDeviceInfo.getShareModel();
        String oob2 = this.mDeviceInfo.getOob();
        mEcoApiCall.c(userId, oob, shareId, shareUserId, shareDid, shareModel, !(oob2 == null || oob2.length() == 0), new ch7() { // from class: com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder.bind.1
            @Override // defpackage.gsc
            public void dismissButtonConfirmDialog() {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder local device confirm dismiss");
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.dismissPairingCode();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.dv7
            public void dismissOOB() {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder dismissOOB");
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.dismissPairingCode();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.ch7
            public void onBindFailure(int code, String message) {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder bind failure, code:" + code + ">>message:" + message);
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.onBindFailure(code);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                EcoBaseDeviceBinder ecoBaseDeviceBinder = this;
                if (message == null) {
                    message = "";
                }
                ecoBaseDeviceBinder.onBindFailure(code, message);
            }

            @Override // defpackage.ch7
            public void onBindSuccess(String model, String did, String mac, String sn) {
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(did, "did");
                Intrinsics.checkNotNullParameter(mac, "mac");
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder bind success, model:" + model + ">>did:" + did + ">>mac:" + mac + ">>" + sn);
                this.setSn(sn);
                EcoBaseDeviceBinder ecoBaseDeviceBinder = this;
                String upperCase = mac.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                ecoBaseDeviceBinder.onBindSuccess(upperCase);
                this.setBindSuccess(true);
                this.setMDid(did);
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.onBindSuccess(did);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.mj7
            public void onBondFailure(int status) {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder bond failure");
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.onPairingFailure(status);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.onBindFailure(status, "bond failure");
            }

            @Override // defpackage.mj7
            public void onBondSuccess() {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder bond success");
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.onPairingSuccess(null);
                    }
                    sh7 sh7Var2 = callback;
                    if (sh7Var2 != null) {
                        sh7Var2.dismissPairingCode();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.nj7
            public void onConnectFailure(int status) {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder connect failure");
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.onConnectFailure(status);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.onBindFailure(10, "connect failure");
            }

            @Override // defpackage.nj7
            public void onConnectSuccess() {
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.onConnectSuccess();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.fu7
            public void onLocalBindSuccess(String model, String did, String mac, String sn, String appDeviceId, byte[] appToken) {
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(did, "did");
                Intrinsics.checkNotNullParameter(mac, "mac");
                Intrinsics.checkNotNullParameter(appDeviceId, "appDeviceId");
                Intrinsics.checkNotNullParameter(appToken, "appToken");
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder bind local success");
                try {
                    this.setSn(sn);
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.dismissPairingCode();
                    }
                    this.setBindSuccess(true);
                    this.setMDid(did);
                    this.onLocalBindSuccess(model, did, mac, sn, appDeviceId, appToken);
                    sh7 sh7Var2 = callback;
                    if (sh7Var2 != null) {
                        sh7Var2.onBindSuccess(did);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.mj7
            public /* bridge */ /* synthetic */ void onRemoveFailure(int i) {
                super.onRemoveFailure(i);
            }

            @Override // defpackage.mj7
            public /* bridge */ /* synthetic */ void onRemoveSuccess() {
                super.onRemoveSuccess();
            }

            @Override // defpackage.gsc
            public void showButtonConfirmDialog() {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder local device confirm show");
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.showPairingCode("", null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.dv7
            public void showOOB(String code, final cv7 listener) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(listener, "listener");
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("device binder showOOB:" + code + ", safeCallback=" + callback);
                try {
                    sh7 sh7Var = callback;
                    if (sh7Var != null) {
                        sh7Var.showPairingCode(code, new bv7.a() { // from class: com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder$bind$1$showOOB$1
                            @Override // defpackage.bv7
                            public void onCanceled() {
                                listener.onCanceled();
                            }

                            @Override // defpackage.bv7
                            public void onConfirm() {
                                listener.onConfirm();
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder
    public void cancel() {
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi(this.TAG, "device binder cancel bind");
        String model = this.mDeviceInfo.getModel();
        int i = this.bindCount + 1;
        this.bindCount = i;
        Product product = this.mDeviceInfo.getProduct();
        EcoBindDataTrackerKt.reportBindFinish(false, model, "", 10000, "", i, product != null ? product.getType() : 0);
        if (this.mEcoApiCall != null) {
            getMEcoApiCall().destroy();
        }
    }

    public final int getBindCount() {
        return this.bindCount;
    }

    @NotNull
    public final EcoDeviceInfo getMDeviceInfo() {
        return this.mDeviceInfo;
    }

    @NotNull
    public final String getMDid() {
        return this.mDid;
    }

    @NotNull
    public final asc getMEcoApiCall() {
        asc ascVar = this.mEcoApiCall;
        if (ascVar != null) {
            return ascVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEcoApiCall");
        return null;
    }

    @NotNull
    public final EcoDeviceManagerInternalRemote getMEcoDeviceManager() {
        return (EcoDeviceManagerInternalRemote) this.mEcoDeviceManager.getValue();
    }

    public final boolean getReportBindStatus() {
        return this.reportBindStatus;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: isBindSuccess, reason: from getter */
    public final boolean getIsBindSuccess() {
        return this.isBindSuccess;
    }

    public final boolean isDeviceConnect() {
        return getMEcoDeviceManager().isConnected(this.mDeviceInfo.getDid());
    }

    /* JADX INFO: renamed from: isServiceConnected, reason: from getter */
    public final boolean getIsServiceConnected() {
        return this.isServiceConnected;
    }

    public final void onBindFailure(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String model = this.mDeviceInfo.getModel();
        int i = this.bindCount + 1;
        this.bindCount = i;
        Product product = this.mDeviceInfo.getProduct();
        EcoBindDataTrackerKt.reportBindFinish(false, model, "", code, message, i, product != null ? product.getType() : 0);
    }

    public final void onBindSuccess(@NotNull final String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        String model = this.mDeviceInfo.getModel();
        int i = this.bindCount + 1;
        this.bindCount = i;
        Product product = this.mDeviceInfo.getProduct();
        EcoBindDataTrackerKt.reportBindFinish(true, model, "", 0, "", i, product != null ? product.getType() : 0);
        this.bindCount = 0;
        EcoDeviceFactory.INSTANCE.removeDeviceBinder(mac);
        ms7 deviceModelByMac = getDeviceModelByMac(mac);
        if (deviceModelByMac != null) {
            deviceModelByMac.onBindSuccess(this.isRebind);
        }
        getMEcoDeviceManager().requestDeviceList(new Function1() { // from class: vf7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBaseDeviceBinder.onBindSuccess$lambda$1(this.f36839a, mac, (List) obj);
            }
        }, new Function1() { // from class: wf7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBaseDeviceBinder.onBindSuccess$lambda$2((ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(this.TAG, "onConnectFailure() report device active did = " + did + ", errorCode = " + errorCode + ", retryTimes = " + retryTimes);
        onReportActive(did);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        String str = this.TAG;
        String str2 = this.mDid;
        boolean z = this.isBindSuccess;
        boolean z2 = this.reportBindStatus;
        Logger.i(str, "onConnectSuccess: " + str2 + ", did = " + did + ", isbindsuccess = " + z + ", report = " + z2 + ", dm = " + EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did == null ? "" : did));
        onReportActive(did);
    }

    @Override // com.xiaomi.eco.api.p.b
    public void onConnected() {
        this.isServiceConnected = true;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.eco.api.p.b
    public void onDisconnected() {
        this.isServiceConnected = false;
    }

    public void onLocalBindSuccess(@NotNull String model, @NotNull String did, @NotNull String mac, @Nullable String sn, @NotNull String appDeviceId, @NotNull byte[] appToken) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(appDeviceId, "appDeviceId");
        Intrinsics.checkNotNullParameter(appToken, "appToken");
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(model);
        if (localDeviceModel != null) {
            EcoDeviceManagerExtKt.reportDeviceActive(localDeviceModel, DeviceActiveKt.ACTIVE_ACTIVATION);
        }
        String model2 = this.mDeviceInfo.getModel();
        String firmwareVersion = this.mDeviceInfo.getFirmwareVersion();
        if (firmwareVersion == null) {
            firmwareVersion = "";
        }
        String str = firmwareVersion;
        int i = this.bindCount + 1;
        this.bindCount = i;
        Product product = this.mDeviceInfo.getProduct();
        EcoBindDataTrackerKt.reportBindFinish(true, model2, str, 0, "", i, product != null ? product.getType() : 0);
        this.bindCount = 0;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder
    public void rebind(@Nullable sh7 callback) {
        this.isRebind = true;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder
    @Nullable
    public Object revokeAuthorization(@NotNull Continuation<? super Integer> continuation) {
        return revokeAuthorization$suspendImpl(this, continuation);
    }

    public final void setBindCount(int i) {
        this.bindCount = i;
    }

    public final void setBindSuccess(boolean z) {
        this.isBindSuccess = z;
    }

    public final void setMDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mDid = str;
    }

    public final void setMEcoApiCall(@NotNull asc ascVar) {
        Intrinsics.checkNotNullParameter(ascVar, "<set-?>");
        this.mEcoApiCall = ascVar;
    }

    public final void setReportBindStatus(boolean z) {
        this.reportBindStatus = z;
    }

    public final void setServiceConnected(boolean z) {
        this.isServiceConnected = z;
    }

    public final void setSn(@Nullable String str) {
        this.sn = str;
    }

    @Nullable
    public Object unbind(int i, @NotNull Continuation<? super Integer> continuation) {
        return unbind$suspendImpl(this, i, continuation);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder
    @Nullable
    public Object unbind(@NotNull Continuation<? super Integer> continuation) {
        return unbind$suspendImpl(this, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object unbind$suspendImpl(EcoBaseDeviceBinder ecoBaseDeviceBinder, Continuation<? super Integer> continuation) {
        AnonymousClass2 anonymousClass2;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = ecoBaseDeviceBinder.new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = ecoBaseDeviceBinder.new AnonymousClass2(continuation);
        }
        Object objUnbind = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ecoBaseDeviceBinder = (EcoBaseDeviceBinder) anonymousClass2.L$0;
                ResultKt.throwOnFailure(objUnbind);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUnbind);
            }
        }
        ResultKt.throwOnFailure(objUnbind);
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi(ecoBaseDeviceBinder.TAG, "device binder unbind request");
        ElectronicScaleRequest electronicScaleRequestExtKt = ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE);
        String did = ecoBaseDeviceBinder.mDeviceInfo.getDid();
        String mac = ecoBaseDeviceBinder.mDeviceInfo.getMac();
        Intrinsics.checkNotNull(mac);
        T t = ecoBaseDeviceBinder.mDeviceInfo.device;
        Intrinsics.checkNotNull(t);
        Device.Detail detail = ((EcoDevice) t).getDetail();
        Intrinsics.checkNotNull(detail);
        String token = detail.getToken();
        Intrinsics.checkNotNull(token);
        anonymousClass2.L$0 = ecoBaseDeviceBinder;
        anonymousClass2.label = 1;
        objUnbind = electronicScaleRequestExtKt.unbind(did, mac, token, anonymousClass2);
        if (objUnbind == coroutine_suspended) {
            return coroutine_suspended;
        }
        int iIntValue = ((Number) objUnbind).intValue();
        if (iIntValue == -2 || iIntValue == -1 || iIntValue == 0) {
            ElectronicScaleCMDHelper.DefaultImpls.restoreFactory$default(ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE), ecoBaseDeviceBinder.mDeviceInfo.getDid(), null, 2, null);
        }
        String model = ecoBaseDeviceBinder.mDeviceInfo.getModel();
        String firmwareVersion = ecoBaseDeviceBinder.mDeviceInfo.getFirmwareVersion();
        if (firmwareVersion == null) {
            firmwareVersion = "";
        }
        EcoBindDataTrackerKt.reportUnbind(model, firmwareVersion);
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 2;
        objUnbind = ecoBaseDeviceBinder.unbind(iIntValue, anonymousClass2);
        return objUnbind == coroutine_suspended ? coroutine_suspended : objUnbind;
    }
}
