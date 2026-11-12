package com.xiaomi.fitness.access;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.access.AccessManagerImpl;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import com.xiaomi.fitness.access.export.listener.OnDialogItemClickListener;
import com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity;
import com.xiaomi.fitness.access.health_connect.HealthConnectIntroductionActivity;
import com.xiaomi.fitness.access.health_connect.HealthConnectUtils;
import com.xiaomi.fitness.access.misport.MiSportImportActivity;
import com.xiaomi.fitness.access.permission.PermissionsWechat;
import com.xiaomi.fitness.access.preference.AccessPreference;
import com.xiaomi.fitness.access.request.AccessRequest;
import com.xiaomi.fitness.access.request.GetGoogleFitBindStatusResultModel;
import com.xiaomi.fitness.access.request.MiscModel;
import com.xiaomi.fitness.access.wechatsportimport.WechatDeviceActivity;
import com.xiaomi.fitness.access.wechatsportimport.WechatSportSettingsNoDevicesActivity;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerActivity;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import defpackage.mzi;
import java.util.List;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020!0+H\u0016J*\u0010,\u001a\u00020\u000b2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0\u00142\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0/H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0010\u00101\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u00102\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u00105\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/access/AccessManagerImpl;", "Lcom/xiaomi/fitness/access/export/AccessManager;", "<init>", "()V", "mAccessRequest", "Lcom/xiaomi/fitness/access/request/AccessRequest;", "getMAccessRequest", "()Lcom/xiaomi/fitness/access/request/AccessRequest;", "setMAccessRequest", "(Lcom/xiaomi/fitness/access/request/AccessRequest;)V", "gotoAccessActivity", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "gotoWechatActivity", "gotoAlipayActivity", "gotoStravaActivity", "gotoMiSportImportActivity", "getMiSportLastMigrateStatus", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatus;", "setMisportImportState", "state", "", "getMisportImportState", "gotoWechatAccessDeviceManagerActivity", "context", "Landroid/content/Context;", "goToWechatSportSettingsNoDeviceActivity", "goToWechatDeviceActivity", "getWechatSupportBindDeviceLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "goToGoogleFitActivity", "act", "goToSuuntoAccessActivity", "showPrivacyStorageDialog", "Landroidx/fragment/app/FragmentActivity;", "permissionDes", "clickListener", "Lcom/xiaomi/fitness/access/export/listener/OnDialogItemClickListener;", "getShowGoogleFitEntranceLiveData", "Landroidx/lifecycle/LiveData;", "getWechatBindStatus", "onSuccess", "onError", "Lkotlin/Function0;", "isHealthConnectSupported", "isHealthConnectInstalled", "isHealthConnectAuthed", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gotoHealthConnectIntroductionActivity", "gotoHealthConnectPermissionInfoActivity", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccessManagerImpl implements AccessManager {

    @NotNull
    public static final String TAG = "AccessManagerImpl";
    public AccessRequest mAccessRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessManagerImpl$getWechatSupportBindDeviceLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessManagerImpl$getWechatSupportBindDeviceLiveData$1", f = "AccessManagerImpl.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<MiscModel.ProductResult> $listProductList;
        final /* synthetic */ MutableLiveData<Boolean> $wechatSupportBindDevice;
        Object L$0;
        int label;
        final /* synthetic */ AccessManagerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<MiscModel.ProductResult> objectRef, AccessManagerImpl accessManagerImpl, MutableLiveData<Boolean> mutableLiveData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$listProductList = objectRef;
            this.this$0 = accessManagerImpl;
            this.$wechatSupportBindDevice = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$listProductList, this.this$0, this.$wechatSupportBindDevice, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<MiscModel.ProductResult> objectRef;
            T t;
            List<String> list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger.i(AccessManagerImpl.TAG, "getProductList request");
                Ref.ObjectRef<MiscModel.ProductResult> objectRef2 = this.$listProductList;
                AccessRequest mAccessRequest = this.this$0.getMAccessRequest();
                this.L$0 = objectRef2;
                this.label = 1;
                Object productList = mAccessRequest.getProductList(this);
                if (productList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t = productList;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
            }
            objectRef.element = t;
            for (T t2 : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels()) {
                MiscModel.ProductResult productResult = this.$listProductList.element;
                if (productResult != null && (list = productResult.productList) != null && list.contains(t2.getProduct().getModel())) {
                    Logger.i(AccessManagerImpl.TAG, "wechatSupportBindDevice is true");
                    this.$wechatSupportBindDevice.setValue(Boxing.boxBoolean(true));
                    break;
                }
            }
            if (!Intrinsics.areEqual(this.$wechatSupportBindDevice.getValue(), Boxing.boxBoolean(true))) {
                Logger.i(AccessManagerImpl.TAG, "wechatSupportBindDevice is false");
                this.$wechatSupportBindDevice.setValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMiSportLastMigrateStatus$lambda$0(Function1 success, MiSportData.MiSportStatus it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d("getMiSportLastMigrateStatus", new Object[0]);
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getShowGoogleFitEntranceLiveData$lambda$2(MutableLiveData showEntranceLiveData, GetGoogleFitBindStatusResultModel it) {
        Intrinsics.checkNotNullParameter(showEntranceLiveData, "$showEntranceLiveData");
        Intrinsics.checkNotNullParameter(it, "it");
        showEntranceLiveData.setValue(Boolean.valueOf(it.getShowEntrance()));
        Logger.i(TAG, "getShowGoogleFitEntranceLiveData success.showEntrance=" + it.getShowEntrance());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getShowGoogleFitEntranceLiveData$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getShowGoogleFitEntranceLiveData failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWechatBindStatus$lambda$4(Function1 onSuccess, MiscModel.WechatBindResult it) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(it, "it");
        boolean zIsBound = it.isBound();
        onSuccess.invoke2(Boolean.valueOf(zIsBound));
        Logger.i(TAG, "getWechatBindStatus success. isBound=" + zIsBound);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWechatBindStatus$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ToastExtKt.toast$default(ApplicationExtKt.getApplication(), mzi.z0, 0, 0, 0L, 14, null);
        Logger.i(TAG, "getWechatBindStatus failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWechatSupportBindDeviceLiveData$lambda$1(MutableLiveData wechatSupportBindDevice, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(wechatSupportBindDevice, "$wechatSupportBindDevice");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        wechatSupportBindDevice.setValue(Boolean.FALSE);
        Logger.d(TAG, "ApiException is " + it);
        return Unit.INSTANCE;
    }

    @NotNull
    public final AccessRequest getMAccessRequest() {
        AccessRequest accessRequest = this.mAccessRequest;
        if (accessRequest != null) {
            return accessRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccessRequest");
        return null;
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void getMiSportLastMigrateStatus(@NotNull final Function1<? super MiSportData.MiSportStatus, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        AccessRequest.getMiSportLastMigrateStatus$default(new AccessRequest(), new Function1() { // from class: z40
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessManagerImpl.getMiSportLastMigrateStatus$lambda$0(success, (MiSportData.MiSportStatus) obj);
            }
        }, null, 2, null);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public int getMisportImportState() {
        return AccessPreference.INSTANCE.getMisportImportState();
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    @NotNull
    public LiveData<Boolean> getShowGoogleFitEntranceLiveData() {
        final MutableLiveData mutableLiveData = new MutableLiveData(Boolean.FALSE);
        getMAccessRequest().getGoogleFitBindStatus(new Function1() { // from class: x40
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessManagerImpl.getShowGoogleFitEntranceLiveData$lambda$2(mutableLiveData, (GetGoogleFitBindStatusResultModel) obj);
            }
        }, new Function1() { // from class: y40
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessManagerImpl.getShowGoogleFitEntranceLiveData$lambda$3((ApiException) obj);
            }
        });
        return mutableLiveData;
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void getWechatBindStatus(@NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        AccessRequest.bindWechat$default(getMAccessRequest(), 0, new Function1() { // from class: b50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessManagerImpl.getWechatBindStatus$lambda$4(onSuccess, (MiscModel.WechatBindResult) obj);
            }
        }, new Function1() { // from class: c50
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessManagerImpl.getWechatBindStatus$lambda$5((ApiException) obj);
            }
        }, 1, null);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    @NotNull
    public MutableLiveData<Boolean> getWechatSupportBindDeviceLiveData(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(new Ref.ObjectRef(), this, mutableLiveData, null), 1, null).m503catch(new Function2() { // from class: a50
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccessManagerImpl.getWechatSupportBindDeviceLiveData$lambda$1(mutableLiveData, (AndroidScope) obj, (Throwable) obj2);
            }
        });
        return mutableLiveData;
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void goToGoogleFitActivity(@NotNull Activity act) {
        Intrinsics.checkNotNullParameter(act, "act");
        act.startActivity(new Intent(act, (Class<?>) GoogleFitAccessActivity.class));
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void goToSuuntoAccessActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) SuuntoAccessActivity.class));
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void goToWechatDeviceActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) WechatDeviceActivity.class));
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void goToWechatSportSettingsNoDeviceActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LaunchExtensionKt.startActivity$default(context, WechatSportSettingsNoDevicesActivity.class, (Function1) null, 2, (Object) null);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void gotoAccessActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, AccessActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void gotoAlipayActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, AlipayActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void gotoHealthConnectIntroductionActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HealthConnectIntroductionActivity.INSTANCE.launch(context);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void gotoHealthConnectPermissionInfoActivity(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HealthConnectAuthedPermissionsActivity.INSTANCE.launch(context);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void gotoMiSportImportActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, MiSportImportActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void gotoStravaActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, StravaAccessActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void gotoWechatAccessDeviceManagerActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LaunchExtensionKt.startActivity$default(context, AccessDeviceManagerActivity.class, (Function1) null, 2, (Object) null);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void gotoWechatActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, WechatActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    @Nullable
    public Object isHealthConnectAuthed(@NotNull Context context, @NotNull Continuation<? super Boolean> continuation) {
        return HealthConnectUtils.INSTANCE.hasHealthConnectAuthed(context, continuation);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public boolean isHealthConnectInstalled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return HealthConnectUtils.INSTANCE.isHealthConnectInstalled(context);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public boolean isHealthConnectSupported() {
        try {
            return Build.VERSION.SDK_INT >= 28;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void setMAccessRequest(@NotNull AccessRequest accessRequest) {
        Intrinsics.checkNotNullParameter(accessRequest, "<set-?>");
        this.mAccessRequest = accessRequest;
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void setMisportImportState(int state) {
        AccessPreference.INSTANCE.setMisportImportState(state);
    }

    @Override // com.xiaomi.fitness.access.export.AccessManager
    public void showPrivacyStorageDialog(@NotNull FragmentActivity activity, int permissionDes, @NotNull OnDialogItemClickListener clickListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        PermissionsWechat.INSTANCE.showPrivacyStorageDialog(activity, permissionDes, clickListener);
    }
}
