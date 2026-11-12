package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.service.mi.entity.BaseResponse;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.ltg;
import defpackage.na4;
import defpackage.o4h;
import defpackage.rvf;
import defpackage.ssg;
import defpackage.tyo;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u00020\u00042\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0014\u001a\u00020\u00042\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/BanCardSplashViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lkotlin/Function2;", "", "", "clearSuc", "clearSE", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "needUpdateCrc", "checkCRSCode", "(Lkotlin/jvm/functions/Function1;)V", "setSeSuc", "checkCRSStatus", "callback", "checkPreAccountData", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BanCardSplashViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel$checkCRSCode$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel$checkCRSCode$1", f = "BanCardSplashViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ Function1<Boolean, Unit> $needUpdateCrc;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Boolean, Unit> function1, HuamiApiCaller huamiApiCaller, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$needUpdateCrc = function1;
            this.$huamiApiCaller = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$needUpdateCrc, this.$huamiApiCaller, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                BanCardSplashViewModel$checkCRSCode$1$updateCrc$1 banCardSplashViewModel$checkCRSCode$1$updateCrc$1 = new BanCardSplashViewModel$checkCRSCode$1$updateCrc$1(this.$huamiApiCaller, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, banCardSplashViewModel$checkCRSCode$1$updateCrc$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$needUpdateCrc.invoke2(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel$checkCRSStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel$checkCRSStatus$1", f = "BanCardSplashViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ Function1<Boolean, Unit> $setSeSuc;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel$checkCRSStatus$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel$checkCRSStatus$1$1", f = "BanCardSplashViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HuamiApiCaller $huamiApiCaller;
            final /* synthetic */ Function1<Boolean, Unit> $setSeSuc;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06641(Function1<? super Boolean, Unit> function1, HuamiApiCaller huamiApiCaller, Continuation<? super C06641> continuation) {
                super(2, continuation);
                this.$setSeSuc = function1;
                this.$huamiApiCaller = huamiApiCaller;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(Function1 function1, HuamiApiCaller huamiApiCaller, Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean z = false;
                if (!((Boolean) obj).booleanValue()) {
                    if (huamiApiCaller != null && huamiApiCaller.setPasswordInteraction()) {
                        z = true;
                    }
                    function1.invoke2(Boolean.valueOf(z));
                    return;
                }
                if (!rvf.i().isStatusOK()) {
                    function1.invoke2(Boolean.FALSE);
                    return;
                }
                if (huamiApiCaller != null && huamiApiCaller.setPasswordInteraction()) {
                    z = true;
                }
                function1.invoke2(Boolean.valueOf(z));
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06641(this.$setSeSuc, this.$huamiApiCaller, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Exception {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ltg ltgVarC = ltg.c();
                final Function1<Boolean, Unit> function1 = this.$setSeSuc;
                final HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
                ltgVarC.checkCRSStatus(new ssg.b() { // from class: com.xiaomi.fitness.nfc.ui.a
                    @Override // ssg.b
                    public final void onResult(Object obj2) {
                        BanCardSplashViewModel.C26731.C06641.invokeSuspend$lambda$0(function1, huamiApiCaller, obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26731(Function1<? super Boolean, Unit> function1, HuamiApiCaller huamiApiCaller, Continuation<? super C26731> continuation) {
            super(2, continuation);
            this.$setSeSuc = function1;
            this.$huamiApiCaller = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26731(this.$setSeSuc, this.$huamiApiCaller, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06641 c06641 = new C06641(this.$setSeSuc, this.$huamiApiCaller, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06641, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPreAccountData$lambda$5(v4h emitter) throws NfcException {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        vqg.d("checkPreAccountData pre");
        BaseResponse baseResponseB = new rvf().b();
        vqg.d("checkUserBind code:" + baseResponseB.getResultCode() + "  msg:" + baseResponseB.getMsg());
        if (!baseResponseB.isStatusOK()) {
            throw new NfcException(NfcUtils.getMasterErrorMsg(baseResponseB.getResultCode(), baseResponseB.getSpErrors()));
        }
        BaseResponse baseResponseP = new rvf().p();
        vqg.d("syncSe code:" + baseResponseP.getResultCode() + "  msg:" + baseResponseP.getMsg());
        if (!baseResponseP.isStatusOK()) {
            throw new NfcException(NfcUtils.getMasterErrorMsg(baseResponseP.getResultCode(), baseResponseP.getSpErrors()));
        }
        emitter.onNext(Boolean.TRUE);
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPreAccountData$lambda$6(Function2 callback, Boolean bool) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNull(bool);
        callback.invoke(bool, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPreAccountData$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPreAccountData$lambda$8(Function2 callback, Throwable th) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        vqg.c("checkPreAccountData", th);
        callback.invoke(Boolean.FALSE, th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPreAccountData$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearSE$lambda$0(v4h emitter) throws NfcException {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        BaseResponse baseResponseD = new rvf().d();
        vqg.d("clearSE  msg = " + baseResponseD.getMsg() + "  code = " + baseResponseD.getResultCode() + "  spErrors = " + baseResponseD.getSpErrors());
        if (!baseResponseD.isStatusOK()) {
            throw new NfcException(NfcUtils.getMasterErrorMsg(baseResponseD.getResultCode(), baseResponseD.getSpErrors()));
        }
        emitter.onNext(Boolean.TRUE);
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearSE$lambda$1(Function2 clearSuc, Boolean bool) {
        Intrinsics.checkNotNullParameter(clearSuc, "$clearSuc");
        Intrinsics.checkNotNull(bool);
        clearSuc.invoke(bool, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearSE$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearSE$lambda$3(Function2 clearSuc, Throwable th) {
        Intrinsics.checkNotNullParameter(clearSuc, "$clearSuc");
        vqg.c("clearSE", th);
        clearSuc.invoke(Boolean.FALSE, th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearSE$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void checkCRSCode(@NotNull Function1<? super Boolean, Unit> needUpdateCrc) {
        Intrinsics.checkNotNullParameter(needUpdateCrc, "needUpdateCrc");
        if (getMDeviceModel() == null) {
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(needUpdateCrc, deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(mDeviceModel)), null), 3, null);
    }

    public final void checkCRSStatus(@NotNull Function1<? super Boolean, Unit> setSeSuc) {
        Intrinsics.checkNotNullParameter(setSeSuc, "setSeSuc");
        if (getMDeviceModel() == null) {
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26731(setSeSuc, deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(mDeviceModel)), null), 3, null);
    }

    public final void checkPreAccountData(@NotNull final Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        o4h o4hVarH = o4h.f(new j5h() { // from class: sx1
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws NfcException {
                BanCardSplashViewModel.checkPreAccountData$lambda$5(v4hVar);
            }
        }).S(tyo.c).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: tx1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BanCardSplashViewModel.checkPreAccountData$lambda$6(callback, (Boolean) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: ux1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BanCardSplashViewModel.checkPreAccountData$lambda$7(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: vx1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BanCardSplashViewModel.checkPreAccountData$lambda$8(callback, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: wx1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BanCardSplashViewModel.checkPreAccountData$lambda$9(function2, obj);
            }
        }));
    }

    public final void clearSE(@NotNull final Function2<? super Boolean, ? super String, Unit> clearSuc) {
        Intrinsics.checkNotNullParameter(clearSuc, "clearSuc");
        o4h o4hVarH = o4h.f(new j5h() { // from class: xx1
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws NfcException {
                BanCardSplashViewModel.clearSE$lambda$0(v4hVar);
            }
        }).S(tyo.c).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: yx1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BanCardSplashViewModel.clearSE$lambda$1(clearSuc, (Boolean) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: zx1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BanCardSplashViewModel.clearSE$lambda$2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ay1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BanCardSplashViewModel.clearSE$lambda$3(clearSuc, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: by1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BanCardSplashViewModel.clearSE$lambda$4(function2, obj);
            }
        }));
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }
}
