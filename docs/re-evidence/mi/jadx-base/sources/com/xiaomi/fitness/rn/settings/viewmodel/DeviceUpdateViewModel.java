package com.xiaomi.fitness.rn.settings.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.smarthome.core.device.SmartDeviceInfo;
import com.smarthome.core.ota.SDKBleOtaPresenter;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.extetions.RNLogKt;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat;
import com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.f23;
import defpackage.i0d;
import defpackage.v0j;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB\u0007¢\u0006\u0004\bQ\u0010\u000fJ\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u000fJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u000fJ\u0019\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b5\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u0016R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u0002040?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010BR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u0002040?8\u0006¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\bC\u0010BR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010BR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0006¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010BR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u0002040?8\u0006¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bH\u0010BR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u0002040?8\u0006¢\u0006\f\n\u0004\bI\u0010A\u001a\u0004\bI\u0010BR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130?8\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bJ\u0010BR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0006¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\bL\u0010BR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0006¢\u0006\f\n\u0004\bM\u0010A\u001a\u0004\bN\u0010BR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0006¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bP\u0010B¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/viewmodel/DeviceUpdateViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Li0d;", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "did", "", "initTest", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "init", "(Landroid/app/Activity;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "checkBleUpdate", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "showProgress", "(I)V", "currentVersion", "Lcom/xiaomi/smarthome/device/api/BleMeshFirmwareUpdateInfo;", "updateInfo", "checkBleUpdateInfo", "(Ljava/lang/String;Lcom/xiaomi/smarthome/device/api/BleMeshFirmwareUpdateInfo;)V", "buttonClick", "startUpdate", "code", "onUpgradeFail", "onUpgrading", "onInstalling", "onCheckFail", "onSuccess", "msg", "showLog", "(Ljava/lang/String;)V", "mActivity", "Landroid/app/Activity;", "getMActivity", "()Landroid/app/Activity;", "setMActivity", "(Landroid/app/Activity;)V", "Lcom/smarthome/core/ota/SDKBleOtaPresenter;", "mPresenter", "Lcom/smarthome/core/ota/SDKBleOtaPresenter;", "getMPresenter", "()Lcom/smarthome/core/ota/SDKBleOtaPresenter;", "setMPresenter", "(Lcom/smarthome/core/ota/SDKBleOtaPresenter;)V", "", "isCanBack", "Z", "()Z", "setCanBack", "(Z)V", "status", "I", "getStatus", "()I", "setStatus", "Landroidx/lifecycle/MutableLiveData;", "isCanUpdate", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "isLogInfoShow", "currentVersionTxt", "getCurrentVersionTxt", "changeLog", "getChangeLog", "isButtonShow", "isProgressShow", "getProgress", "progressStr", "getProgressStr", "progressTxt", "getProgressTxt", "buttonTxt", "getButtonTxt", "<init>", "Companion", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceUpdateViewModel extends AbsViewModel implements i0d {
    public static final int sStatusCheckUpdate = 0;
    public static final int sStatusDone = 2;
    public static final int sStatusNoUpdate = 3;
    public static final int sStatusUpdate = 1;

    @NotNull
    public static final String sTag = "DeviceUpdateViewModel";

    @NotNull
    private final MutableLiveData<String> buttonTxt;

    @NotNull
    private final MutableLiveData<String> changeLog;

    @NotNull
    private final MutableLiveData<String> currentVersionTxt;

    @NotNull
    private final MutableLiveData<Boolean> isButtonShow;
    private boolean isCanBack = true;

    @NotNull
    private final MutableLiveData<Boolean> isCanUpdate;

    @NotNull
    private final MutableLiveData<Boolean> isLogInfoShow;

    @NotNull
    private final MutableLiveData<Boolean> isProgressShow;
    public Activity mActivity;
    public SDKBleOtaPresenter mPresenter;

    @NotNull
    private final MutableLiveData<Integer> progress;

    @NotNull
    private final MutableLiveData<String> progressStr;

    @NotNull
    private final MutableLiveData<String> progressTxt;
    private int status;

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$onCheckFail$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$onCheckFail$1", f = "DeviceUpdateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ToastUtil.INSTANCE.showToast(v0j.f);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$onSuccess$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$onSuccess$2", f = "DeviceUpdateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceUpdateViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceUpdateViewModel.this.setCanBack(true);
            ToastUtil.INSTANCE.showToast(v0j.m);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$onUpgradeFail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$onUpgradeFail$1", f = "DeviceUpdateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $code;
        int label;
        final /* synthetic */ DeviceUpdateViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28851(int i, DeviceUpdateViewModel deviceUpdateViewModel, Continuation<? super C28851> continuation) {
            super(2, continuation);
            this.$code = i;
            this.this$0 = deviceUpdateViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28851(this.$code, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$code == -508) {
                ToastUtil.INSTANCE.showToast(v0j.h);
            } else {
                ToastUtil.INSTANCE.showToast(v0j.g);
            }
            this.this$0.setCanBack(true);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$onUpgrading$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel$onUpgrading$1", f = "DeviceUpdateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C28861(Continuation<? super C28861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceUpdateViewModel.this.new C28861(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceUpdateViewModel.this.setCanBack(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DeviceUpdateViewModel() {
        Boolean bool = Boolean.FALSE;
        this.isCanUpdate = new MutableLiveData<>(bool);
        this.isLogInfoShow = new MutableLiveData<>(bool);
        this.currentVersionTxt = new MutableLiveData<>("");
        this.changeLog = new MutableLiveData<>("");
        this.isButtonShow = new MutableLiveData<>(bool);
        this.isProgressShow = new MutableLiveData<>(bool);
        this.progress = new MutableLiveData<>(0);
        this.progressStr = new MutableLiveData<>();
        this.progressTxt = new MutableLiveData<>(ResourceExtKt.getString(v0j.j));
        this.buttonTxt = new MutableLiveData<>(ResourceExtKt.getString(v0j.s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTest$lambda$0(String did, DeviceUpdateViewModel this$0, Activity activity, List deviceList) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        AnyExtKt.main$default(null, new DeviceUpdateViewModel$initTest$1$1(deviceList, did, this$0, activity, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTest$lambda$1(ApiException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        AnyExtKt.main$default(null, new DeviceUpdateViewModel$initTest$2$1(null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSuccess$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void buttonClick() {
        int i = this.status;
        if (i == 0) {
            checkBleUpdate();
            return;
        }
        if (i == 1) {
            this.isCanBack = false;
            startUpdate();
        } else if (i == 2 || i == 3) {
            getMActivity().finish();
        }
    }

    public final void checkBleUpdate() {
        getMPresenter().checkBleUpdate();
    }

    @Override // defpackage.i0d
    public void checkBleUpdateInfo(@Nullable String currentVersion, @Nullable BleMeshFirmwareUpdateInfo updateInfo) {
        String latestVersion;
        RNLogKt.logi(sTag, "checkBleUpdateInfo: " + (updateInfo != null ? updateInfo.getLatestVersion() : null) + " " + currentVersion);
        if (f23.d(updateInfo != null ? updateInfo.getLatestVersion() : null, currentVersion) > 0) {
            this.status = 1;
            MutableLiveData<Boolean> mutableLiveData = this.isLogInfoShow;
            Boolean bool = Boolean.TRUE;
            mutableLiveData.postValue(bool);
            this.changeLog.postValue(updateInfo != null ? updateInfo.changeLog : null);
            this.isCanUpdate.postValue(bool);
            this.isButtonShow.postValue(bool);
            this.isProgressShow.postValue(Boolean.FALSE);
        } else {
            this.status = 3;
            this.isButtonShow.postValue(Boolean.TRUE);
            this.buttonTxt.postValue(ResourceExtKt.getString(v0j.c));
            this.isCanUpdate.postValue(Boolean.FALSE);
        }
        if (updateInfo == null || (latestVersion = updateInfo.getLatestVersion()) == null) {
            return;
        }
        this.currentVersionTxt.postValue(latestVersion);
    }

    @NotNull
    public final MutableLiveData<String> getButtonTxt() {
        return this.buttonTxt;
    }

    @NotNull
    public final MutableLiveData<String> getChangeLog() {
        return this.changeLog;
    }

    @Override // defpackage.i0d
    @NotNull
    public Context getContext() {
        Context applicationContext = getMActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @NotNull
    public final MutableLiveData<String> getCurrentVersionTxt() {
        return this.currentVersionTxt;
    }

    @NotNull
    public final Activity getMActivity() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return activity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        return null;
    }

    @NotNull
    public final SDKBleOtaPresenter getMPresenter() {
        SDKBleOtaPresenter sDKBleOtaPresenter = this.mPresenter;
        if (sDKBleOtaPresenter != null) {
            return sDKBleOtaPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        return null;
    }

    @NotNull
    public final MutableLiveData<Integer> getProgress() {
        return this.progress;
    }

    @NotNull
    public final MutableLiveData<String> getProgressStr() {
        return this.progressStr;
    }

    @NotNull
    public final MutableLiveData<String> getProgressTxt() {
        return this.progressTxt;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void init(@NotNull Activity activity, @NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        setMActivity(activity);
        SmartDeviceInfo smartDeviceInfo = new SmartDeviceInfo(null, null, null, 0, null, null, null, null, null, null, 1023, null);
        smartDeviceInfo.setDid(deviceModel.getDid());
        smartDeviceInfo.setName(DeviceModelExtKt.getName(deviceModel));
        smartDeviceInfo.setModel(DeviceModelExtKt.getModel(deviceModel));
        smartDeviceInfo.setMac(DeviceModelExtKt.getMac(deviceModel));
        smartDeviceInfo.setExtraJson("{\"isSetPincode\":0,\"pincodeType\":0,\"fw_version\":\"2.1.1_0046\",\"mcu_version\":\"0067\",\"isSubGroup\":false,\"showGroupMember\":false,\"split\":{},\"is_health\":1}");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        setMPresenter(new SDKBleOtaPresenter(applicationContext, this, 4, smartDeviceInfo));
    }

    public final void initTest(@NotNull final Activity activity, @NotNull final String did) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        setMActivity(activity);
        MiJiaSDKCompat.INSTANCE.getInstance().getBoundDeviceList(new Function1() { // from class: ju6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceUpdateViewModel.initTest$lambda$0(did, this, activity, (List) obj);
            }
        }, new Function1() { // from class: ku6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceUpdateViewModel.initTest$lambda$1((ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Boolean> isButtonShow() {
        return this.isButtonShow;
    }

    /* JADX INFO: renamed from: isCanBack, reason: from getter */
    public final boolean getIsCanBack() {
        return this.isCanBack;
    }

    @NotNull
    public final MutableLiveData<Boolean> isCanUpdate() {
        return this.isCanUpdate;
    }

    @NotNull
    public final MutableLiveData<Boolean> isLogInfoShow() {
        return this.isLogInfoShow;
    }

    @NotNull
    public final MutableLiveData<Boolean> isProgressShow() {
        return this.isProgressShow;
    }

    @Override // defpackage.i0d
    public void onCheckFail(int code) {
        this.isProgressShow.postValue(Boolean.FALSE);
        this.isButtonShow.postValue(Boolean.TRUE);
        this.buttonTxt.postValue(ResourceExtKt.getString(v0j.common_retry));
        RNLogKt.logi(sTag, "onCheckFail: " + code);
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    @Override // defpackage.i0d
    public void onInstalling() {
        this.isProgressShow.postValue(Boolean.TRUE);
        this.isButtonShow.postValue(Boolean.FALSE);
        RNLogKt.logi(sTag, "onInstalling");
        this.progressTxt.postValue(ResourceExtKt.getString(v0j.f36351k));
    }

    @Override // defpackage.i0d
    public void onSuccess() {
        DeviceManager.DefaultImpls.requestDeviceList$default(RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE), null, new Function1() { // from class: lu6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceUpdateViewModel.onSuccess$lambda$3((ApiException) obj);
            }
        }, 1, null);
        RNLogKt.logi(sTag, "onSuccess");
        this.status = 2;
        MutableLiveData<Boolean> mutableLiveData = this.isCanUpdate;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        this.isLogInfoShow.postValue(bool);
        this.isProgressShow.postValue(bool);
        this.isButtonShow.postValue(Boolean.TRUE);
        this.buttonTxt.postValue(ResourceExtKt.getString(v0j.common_complete));
        AnyExtKt.main$default(null, new AnonymousClass2(null), 1, null);
    }

    @Override // defpackage.i0d
    public void onUpgradeFail(int code) {
        RNLogKt.logi(sTag, "onUpgradeFail: " + code);
        this.isProgressShow.postValue(Boolean.FALSE);
        this.isButtonShow.postValue(Boolean.TRUE);
        this.buttonTxt.postValue(ResourceExtKt.getString(v0j.common_retry));
        AnyExtKt.main$default(null, new C28851(code, this, null), 1, null);
    }

    @Override // defpackage.i0d
    public void onUpgrading() {
        AnyExtKt.main$default(null, new C28861(null), 1, null);
        this.isProgressShow.postValue(Boolean.TRUE);
        this.isButtonShow.postValue(Boolean.FALSE);
        this.progressTxt.postValue(ResourceExtKt.getString(v0j.j));
        RNLogKt.logi(sTag, "onUpgrading");
        this.status = 1;
    }

    public final void setCanBack(boolean z) {
        this.isCanBack = z;
    }

    public final void setMActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<set-?>");
        this.mActivity = activity;
    }

    public final void setMPresenter(@NotNull SDKBleOtaPresenter sDKBleOtaPresenter) {
        Intrinsics.checkNotNullParameter(sDKBleOtaPresenter, "<set-?>");
        this.mPresenter = sDKBleOtaPresenter;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @Override // defpackage.i0d
    public void showLog(@Nullable String msg) {
        RNLogKt.logi(sTag, "showLog: " + msg);
    }

    @Override // defpackage.i0d
    public void showProgress(int progress) {
        this.isProgressShow.postValue(Boolean.TRUE);
        this.progressStr.postValue(ResourceExtKt.getString(v0j.common_percent_join_str, Integer.valueOf(progress)));
        this.progress.postValue(Integer.valueOf(progress));
        RNLogKt.logi(sTag, "showProgress: " + progress);
    }

    public final void startUpdate() {
        getMPresenter().startUpgrade();
    }
}
