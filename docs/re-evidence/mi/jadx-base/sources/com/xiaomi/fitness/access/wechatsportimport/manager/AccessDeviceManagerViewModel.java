package com.xiaomi.fitness.access.wechatsportimport.manager;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.google.gson.JsonArray;
import com.miui.tsmclient.entity.CardInfo;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.fitness.ShareConfigs;
import com.xiaomi.fitness.access.bean.DeviceModelsInfo;
import com.xiaomi.fitness.access.request.AccessRequest;
import com.xiaomi.fitness.access.request.MiscModel;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import defpackage.aui;
import defpackage.mzi;
import defpackage.xv1;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0016J\u001c\u0010L\u001a\u00020C2\u0006\u0010M\u001a\u00020\r2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00180OJ\u0006\u0010S\u001a\u00020CJ\u000e\u0010T\u001a\u00020CH\u0082@¢\u0006\u0002\u0010UJ\u001e\u0010V\u001a\u00020C2\u0006\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010YJ\u0006\u0010Z\u001a\u00020CJ\u0006\u0010[\u001a\u00020CJ\u000e\u0010\\\u001a\u00020C2\u0006\u0010]\u001a\u00020\u0005J\u0012\u0010^\u001a\u00020C2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R0\u0010!\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180$j\b\u0012\u0004\u0012\u00020\u0018`#0\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R \u00102\u001a\b\u0012\u0004\u0012\u0002030*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010,\"\u0004\b5\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R \u00109\u001a\b\u0012\u0004\u0012\u00020:0\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b;\u0010(R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010P\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010I\"\u0004\bR\u0010K¨\u0006a"}, d2 = {"Lcom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "WECHAT_APPID", "getWECHAT_APPID", "WECHAT_USERID", "getWECHAT_USERID", "MINI_PROGRAM_TYPE", "", "getMINI_PROGRAM_TYPE", "()I", "adapter", "Lcom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerListAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "deviceModelItemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Lcom/xiaomi/fitness/access/bean/DeviceModelsInfo;", "getDeviceModelItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "viewHolderFactory", "Lkotlin/Function2;", "Landroid/view/View;", "Lcom/xiaomi/fitness/access/wechatsportimport/manager/AddAccessDeviceManagerViewHolder;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "deviceModelsItems", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getDeviceModelsItems", "()Landroidx/lifecycle/MutableLiveData;", "setDeviceModelsItems", "(Landroidx/lifecycle/MutableLiveData;)V", "deviceModelDataItems", "Landroidx/databinding/ObservableArrayList;", "getDeviceModelDataItems", "()Landroidx/databinding/ObservableArrayList;", "setDeviceModelDataItems", "(Landroidx/databinding/ObservableArrayList;)V", "tempDeviceModleDataList", "getTempDeviceModleDataList", "setTempDeviceModleDataList", "deviceModleListFromAllModels", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModleListFromAllModels", "setDeviceModleListFromAllModels", "deviceInfoUnBindWechat", "getDeviceInfoUnBindWechat", "setDeviceInfoUnBindWechat", "isDeleteDeviceFromWechat", "", "setDeleteDeviceFromWechat", "mAccessRequest", "Lcom/xiaomi/fitness/access/request/AccessRequest;", "getMAccessRequest", "()Lcom/xiaomi/fitness/access/request/AccessRequest;", "setMAccessRequest", "(Lcom/xiaomi/fitness/access/request/AccessRequest;)V", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "scopeNetLife", "Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "getScopeNetLife", "()Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "setScopeNetLife", "(Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;)V", "handleDeviceAddOrDeleteToWechat", "position", "deviceModelItems", "", "scopeNetLifeGetDeviceProductLst", "getScopeNetLifeGetDeviceProductLst", "setScopeNetLifeGetDeviceProductLst", "getDeviceModelList", "getDeviceProductList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceBindStatusHandle", "index", "deviceManagerListAllModels", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAddDeviceModelItem", "clearAllDevicesList", "deleteDeviceFromWechat", "did", "attach", "savedInstanceState", "Landroid/os/Bundle;", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessDeviceManagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessDeviceManagerViewModel.kt\ncom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,280:1\n27#2,5:281\n1863#3,2:286\n*S KotlinDebug\n*F\n+ 1 AccessDeviceManagerViewModel.kt\ncom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerViewModel\n*L\n49#1:281,5\n148#1:286,2\n*E\n"})
public final class AccessDeviceManagerViewModel extends AbsViewModel {
    private final int MINI_PROGRAM_TYPE;

    @NotNull
    private final String TAG = "AccessDeviceManagerViewModel";

    @NotNull
    private final String WECHAT_APPID = ShareConfigs.appID;

    @NotNull
    private final String WECHAT_USERID = "gh_471f5f7b25a9";

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l40
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccessDeviceManagerViewModel.adapter_delegate$lambda$0();
        }
    });

    @NotNull
    private MutableLiveData<DeviceModelsInfo> deviceInfoUnBindWechat;

    @NotNull
    private ObservableArrayList<DeviceModelsInfo> deviceModelDataItems;

    @NotNull
    private final ItemBinding<DeviceModelsInfo> deviceModelItemBinding;

    @NotNull
    private MutableLiveData<ArrayList<DeviceModelsInfo>> deviceModelsItems;

    @NotNull
    private ObservableArrayList<WearableDeviceModel> deviceModleListFromAllModels;

    @NotNull
    private MutableLiveData<Boolean> isDeleteDeviceFromWechat;
    public AccessRequest mAccessRequest;

    @Nullable
    private NetCoroutineScope scopeNetLife;

    @Nullable
    private NetCoroutineScope scopeNetLifeGetDeviceProductLst;

    @NotNull
    private ObservableArrayList<DeviceModelsInfo> tempDeviceModleDataList;

    @NotNull
    private final Function2<View, Integer, AddAccessDeviceManagerViewHolder> viewHolderFactory;

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$deleteDeviceFromWechat$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$deleteDeviceFromWechat$1", f = "AccessDeviceManagerViewModel.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessDeviceManagerViewModel.this.new AnonymousClass1(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessRequest mAccessRequest = AccessDeviceManagerViewModel.this.getMAccessRequest();
                String str = this.$did;
                this.label = 1;
                obj = mAccessRequest.getDeviceBindStatus(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MiscModel.BindStatus bindStatus = (MiscModel.BindStatus) obj;
            Logger.i(AccessDeviceManagerViewModel.this.getTAG(), "returnBindStatus is " + bindStatus);
            Integer num = bindStatus.bindStatus;
            if (num != null && num.intValue() == 1) {
                IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(ApplicationExtKt.getApplication(), AccessDeviceManagerViewModel.this.getWECHAT_APPID());
                Intrinsics.checkNotNullExpressionValue(iwxapiCreateWXAPI, "createWXAPI(...)");
                iwxapiCreateWXAPI.registerApp(AccessDeviceManagerViewModel.this.getWECHAT_APPID());
                WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
                req.userName = AccessDeviceManagerViewModel.this.getWECHAT_USERID();
                JsonArray jsonArray = new JsonArray();
                jsonArray.add(bindStatus.iLinkImSdkId);
                req.path = "pages/delete-devices/delete-devices?from=wxsport&&sdkIdList=" + jsonArray;
                Logger.i(AccessDeviceManagerViewModel.this.getTAG(), "req.path is " + req.path);
                req.miniprogramType = AccessDeviceManagerViewModel.this.getMINI_PROGRAM_TYPE();
                Logger.i(AccessDeviceManagerViewModel.this.getTAG(), "deleteDeviceFromWechat req.path is " + req.path + " req.userName is " + req.userName + "appId is " + AccessDeviceManagerViewModel.this.getWECHAT_APPID() + " miniprogramType is " + req.miniprogramType);
                iwxapiCreateWXAPI.sendReq(req);
                AccessDeviceManagerViewModel.this.isDeleteDeviceFromWechat().setValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$getDeviceBindStatusHandle$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel", f = "AccessDeviceManagerViewModel.kt", i = {0, 0}, l = {192}, m = "getDeviceBindStatusHandle", n = {"this", "deviceManagerFromAllmodel"}, s = {"L$0", "L$1"})
    public static final class C17541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C17541(Continuation<? super C17541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessDeviceManagerViewModel.this.getDeviceBindStatusHandle(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$getDeviceModelList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$getDeviceModelList$1", f = "AccessDeviceManagerViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17551(Continuation<? super C17551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessDeviceManagerViewModel.this.new C17551(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessDeviceManagerViewModel accessDeviceManagerViewModel = AccessDeviceManagerViewModel.this;
                this.label = 1;
                if (accessDeviceManagerViewModel.getDeviceProductList(this) == coroutine_suspended) {
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
            return ((C17551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$getDeviceProductList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel", f = "AccessDeviceManagerViewModel.kt", i = {0, 1, 1, 1}, l = {142, 169}, m = "getDeviceProductList", n = {"this", "this", "deviceManagerListAllModels", "index"}, s = {"L$0", "L$0", "I$0", "I$1"})
    public static final class C17561 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C17561(Continuation<? super C17561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessDeviceManagerViewModel.this.getDeviceProductList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$handleAddDeviceModelItem$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$handleAddDeviceModelItem$1", f = "AccessDeviceManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17571(Continuation<? super C17571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessDeviceManagerViewModel.this.new C17571(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator<DeviceModelsInfo> it = AccessDeviceManagerViewModel.this.getTempDeviceModleDataList().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                AccessDeviceManagerViewModel.this.getDeviceModelDataItems().add(it.next());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$handleDeviceAddOrDeleteToWechat$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$handleDeviceAddOrDeleteToWechat$1", f = "AccessDeviceManagerViewModel.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DeviceModelsInfo $currentDevice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17581(DeviceModelsInfo deviceModelsInfo, Continuation<? super C17581> continuation) {
            super(2, continuation);
            this.$currentDevice = deviceModelsInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(AccessDeviceManagerViewModel accessDeviceManagerViewModel, MiscModel.DeviceTicket deviceTicket) {
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(ApplicationExtKt.getApplication(), accessDeviceManagerViewModel.getWECHAT_APPID());
            Intrinsics.checkNotNullExpressionValue(iwxapiCreateWXAPI, "createWXAPI(...)");
            iwxapiCreateWXAPI.registerApp(accessDeviceManagerViewModel.getWECHAT_APPID());
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = accessDeviceManagerViewModel.getWECHAT_USERID();
            req.path = "pages/discover-new/discover-new?from=wxsport&&ticket=" + deviceTicket.ticket;
            Logger.i(accessDeviceManagerViewModel.getTAG(), "req.path is " + req.path);
            req.miniprogramType = accessDeviceManagerViewModel.getMINI_PROGRAM_TYPE();
            Logger.i(accessDeviceManagerViewModel.getTAG(), "handleDeviceAddOrDeleteToWechat req.path is " + req.path + " req.userName is " + req.userName + "appId is " + accessDeviceManagerViewModel.getWECHAT_APPID() + " miniprogramType is " + req.miniprogramType);
            iwxapiCreateWXAPI.sendReq(req);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(AccessDeviceManagerViewModel accessDeviceManagerViewModel, ApiException apiException) {
            Logger.d(accessDeviceManagerViewModel.getTAG(), "get device ticket error " + apiException.getErrorCode());
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessDeviceManagerViewModel.this.new C17581(this.$currentDevice, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessRequest mAccessRequest = AccessDeviceManagerViewModel.this.getMAccessRequest();
                String did = this.$currentDevice.getDid();
                this.label = 1;
                obj = mAccessRequest.getDeviceBindStatus(did, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Integer num = ((MiscModel.BindStatus) obj).bindStatus;
            if (num != null && num.intValue() == 0) {
                AccessRequest mAccessRequest2 = AccessDeviceManagerViewModel.this.getMAccessRequest();
                String did2 = this.$currentDevice.getDid();
                final AccessDeviceManagerViewModel accessDeviceManagerViewModel = AccessDeviceManagerViewModel.this;
                Function1<? super MiscModel.DeviceTicket, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.access.wechatsportimport.manager.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return AccessDeviceManagerViewModel.C17581.invokeSuspend$lambda$0(accessDeviceManagerViewModel, (MiscModel.DeviceTicket) obj2);
                    }
                };
                final AccessDeviceManagerViewModel accessDeviceManagerViewModel2 = AccessDeviceManagerViewModel.this;
                mAccessRequest2.getDeviceTicket(did2, function1, new Function1() { // from class: com.xiaomi.fitness.access.wechatsportimport.manager.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return AccessDeviceManagerViewModel.C17581.invokeSuspend$lambda$1(accessDeviceManagerViewModel2, (ApiException) obj2);
                    }
                });
            } else {
                AccessDeviceManagerViewModel.this.getDeviceInfoUnBindWechat().setValue(this.$currentDevice);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AccessDeviceManagerViewModel() {
        final Function3 function3 = new Function3() { // from class: m40
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AccessDeviceManagerViewModel.deviceModelItemBinding$lambda$1((ItemBinding) obj, ((Integer) obj2).intValue(), (DeviceModelsInfo) obj3);
            }
        };
        this.deviceModelItemBinding = ItemBinding.INSTANCE.of(new OnItemBind<DeviceModelsInfo>() { // from class: com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<DeviceModelsInfo> itemBinding, int position, DeviceModelsInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        }).bindExtra(xv1.c, this);
        this.viewHolderFactory = new Function2() { // from class: n40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccessDeviceManagerViewModel.viewHolderFactory$lambda$2((View) obj, ((Integer) obj2).intValue());
            }
        };
        this.deviceModelsItems = new MutableLiveData<>();
        this.deviceModelDataItems = new ObservableArrayList<>();
        this.tempDeviceModleDataList = new ObservableArrayList<>();
        this.deviceModleListFromAllModels = new ObservableArrayList<>();
        this.deviceInfoUnBindWechat = new MutableLiveData<>();
        this.isDeleteDeviceFromWechat = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessDeviceManagerListAdapter adapter_delegate$lambda$0() {
        return new AccessDeviceManagerListAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteDeviceFromWechat$lambda$7(AccessDeviceManagerViewModel this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(this$0.TAG, "get device binder status " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceModelItemBinding$lambda$1(ItemBinding itemBinding, int i, DeviceModelsInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(xv1.f39497b, aui.g);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getDeviceBindStatusHandle(int i, int i2, Continuation<? super Unit> continuation) {
        C17541 c17541;
        AccessDeviceManagerViewModel accessDeviceManagerViewModel;
        WearableDeviceModel wearableDeviceModel;
        if (continuation instanceof C17541) {
            c17541 = (C17541) continuation;
            int i3 = c17541.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c17541.label = i3 - Integer.MIN_VALUE;
            } else {
                c17541 = new C17541(continuation);
            }
        } else {
            c17541 = new C17541(continuation);
        }
        Object obj = c17541.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c17541.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel2 = this.deviceModleListFromAllModels.get(i);
            Logger.e(this.TAG, "getDeviceBindStatusHandle index is " + i + " deviceManagerListAllModels is " + i2);
            AccessRequest mAccessRequest = getMAccessRequest();
            String did = wearableDeviceModel2.getDid();
            c17541.L$0 = this;
            c17541.L$1 = wearableDeviceModel2;
            c17541.label = 1;
            Object deviceBindStatus = mAccessRequest.getDeviceBindStatus(did, c17541);
            if (deviceBindStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
            accessDeviceManagerViewModel = this;
            obj = deviceBindStatus;
            wearableDeviceModel = wearableDeviceModel2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wearableDeviceModel = (WearableDeviceModel) c17541.L$1;
            accessDeviceManagerViewModel = (AccessDeviceManagerViewModel) c17541.L$0;
            ResultKt.throwOnFailure(obj);
        }
        MiscModel.BindStatus bindStatus = (MiscModel.BindStatus) obj;
        String str = accessDeviceManagerViewModel.TAG;
        Intrinsics.checkNotNull(wearableDeviceModel);
        String name = DeviceModelExtKt.getName(wearableDeviceModel);
        String did2 = wearableDeviceModel.getDid();
        Intrinsics.checkNotNull(wearableDeviceModel);
        String deviceIconUrl = DeviceModelExtKt.getDeviceIconUrl(wearableDeviceModel, 2);
        Integer num = bindStatus.bindStatus;
        int size = accessDeviceManagerViewModel.deviceModelDataItems.size();
        ArrayList<DeviceModelsInfo> value = accessDeviceManagerViewModel.deviceModelsItems.getValue();
        Logger.e(str, "Device Modles List From All Models " + bindStatus + " name is " + name + " did is " + did2 + " icon is " + deviceIconUrl + " bindStatus is " + num + "mDeviceModleDataList is " + size + " is " + (value != null ? Boxing.boxInt(value.size()) : null));
        Integer num2 = bindStatus.bindStatus;
        String string = (num2 != null && num2.intValue() == 1) ? ResourceExtKt.getString(mzi.f27379a) : ResourceExtKt.getString(mzi.J);
        String did3 = wearableDeviceModel.getDid();
        Intrinsics.checkNotNull(wearableDeviceModel);
        String name2 = DeviceModelExtKt.getName(wearableDeviceModel);
        Intrinsics.checkNotNull(wearableDeviceModel);
        DeviceModelsInfo deviceModelsInfo = new DeviceModelsInfo(did3, name2, DeviceModelExtKt.getBigIcon(wearableDeviceModel), string);
        ObservableArrayList<DeviceModelsInfo> observableArrayList = accessDeviceManagerViewModel.tempDeviceModleDataList;
        if (observableArrayList != null) {
            Boxing.boxBoolean(observableArrayList.add(deviceModelsInfo));
        }
        Logger.e(accessDeviceManagerViewModel.TAG, "tempDeviceModleDataList is " + accessDeviceManagerViewModel.tempDeviceModleDataList.size());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceModelList$lambda$4(AccessDeviceManagerViewModel this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.deviceModelsItems.postValue(null);
        this$0.clearAllDevicesList();
        Logger.e(this$0.TAG, "getDevicesBindStatus", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0136  */
    /* JADX WARN: Code duplicated, block: B:39:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x012f -> B:34:0x0132). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getDeviceProductList(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel.getDeviceProductList(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeviceAddOrDeleteToWechat$lambda$3(AccessDeviceManagerViewModel this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(this$0.TAG, "get device binder status " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddAccessDeviceManagerViewHolder viewHolderFactory$lambda$2(View view, int i) {
        if (i == aui.g) {
            Intrinsics.checkNotNull(view);
            return new AddAccessDeviceManagerViewHolder(view);
        }
        Intrinsics.checkNotNull(view);
        return new AddAccessDeviceManagerViewHolder(view);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void clearAllDevicesList() {
        this.deviceModleListFromAllModels.clear();
        this.tempDeviceModleDataList.clear();
    }

    public final void deleteDeviceFromWechat(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(did, null), 1, null).m503catch(new Function2() { // from class: k40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccessDeviceManagerViewModel.deleteDeviceFromWechat$lambda$7(this.f23408a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @NotNull
    public final AccessDeviceManagerListAdapter getAdapter() {
        return (AccessDeviceManagerListAdapter) this.adapter.getValue();
    }

    @NotNull
    public final MutableLiveData<DeviceModelsInfo> getDeviceInfoUnBindWechat() {
        return this.deviceInfoUnBindWechat;
    }

    @NotNull
    public final ObservableArrayList<DeviceModelsInfo> getDeviceModelDataItems() {
        return this.deviceModelDataItems;
    }

    @NotNull
    public final ItemBinding<DeviceModelsInfo> getDeviceModelItemBinding() {
        return this.deviceModelItemBinding;
    }

    public final void getDeviceModelList() {
        Logger.i(this.TAG, "getDeviceModelList");
        clearAllDevicesList();
        NetCoroutineScope netCoroutineScope = this.scopeNetLifeGetDeviceProductLst;
        if (netCoroutineScope != null) {
            AndroidScope.cancel$default(netCoroutineScope, null, 1, null);
        }
        NetCoroutineScope netCoroutineScopeScopeNetLife$default = ScopeExtKt.scopeNetLife$default(this, null, new C17551(null), 1, null);
        this.scopeNetLifeGetDeviceProductLst = netCoroutineScopeScopeNetLife$default;
        if (netCoroutineScopeScopeNetLife$default != null) {
            netCoroutineScopeScopeNetLife$default.m503catch(new Function2() { // from class: j40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccessDeviceManagerViewModel.getDeviceModelList$lambda$4(this.f22393a, (AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    @NotNull
    public final MutableLiveData<ArrayList<DeviceModelsInfo>> getDeviceModelsItems() {
        return this.deviceModelsItems;
    }

    @NotNull
    public final ObservableArrayList<WearableDeviceModel> getDeviceModleListFromAllModels() {
        return this.deviceModleListFromAllModels;
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

    public final int getMINI_PROGRAM_TYPE() {
        return this.MINI_PROGRAM_TYPE;
    }

    @Nullable
    public final NetCoroutineScope getScopeNetLife() {
        return this.scopeNetLife;
    }

    @Nullable
    public final NetCoroutineScope getScopeNetLifeGetDeviceProductLst() {
        return this.scopeNetLifeGetDeviceProductLst;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final ObservableArrayList<DeviceModelsInfo> getTempDeviceModleDataList() {
        return this.tempDeviceModleDataList;
    }

    @NotNull
    public final Function2<View, Integer, AddAccessDeviceManagerViewHolder> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    @NotNull
    public final String getWECHAT_APPID() {
        return this.WECHAT_APPID;
    }

    @NotNull
    public final String getWECHAT_USERID() {
        return this.WECHAT_USERID;
    }

    public final void handleAddDeviceModelItem() {
        this.deviceModelDataItems.clear();
        this.deviceModelsItems.postValue(this.tempDeviceModleDataList);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new C17571(null), 2, null);
        Logger.e(this.TAG, "userIndicatorsItems size is " + this.deviceModelDataItems.size() + " userIndicatorsItems is " + this.deviceModelsItems + " deviceModleDataList is " + this.deviceModelDataItems.size());
    }

    public final void handleDeviceAddOrDeleteToWechat(int position, @NotNull List<DeviceModelsInfo> deviceModelItems) {
        Intrinsics.checkNotNullParameter(deviceModelItems, "deviceModelItems");
        if (deviceModelItems.isEmpty() || position >= deviceModelItems.size()) {
            return;
        }
        DeviceModelsInfo deviceModelsInfo = deviceModelItems.get(position);
        NetCoroutineScope netCoroutineScope = this.scopeNetLife;
        if (netCoroutineScope != null) {
            AndroidScope.cancel$default(netCoroutineScope, null, 1, null);
        }
        NetCoroutineScope netCoroutineScopeScopeNetLife$default = ScopeExtKt.scopeNetLife$default(this, null, new C17581(deviceModelsInfo, null), 1, null);
        this.scopeNetLife = netCoroutineScopeScopeNetLife$default;
        if (netCoroutineScopeScopeNetLife$default != null) {
            netCoroutineScopeScopeNetLife$default.m503catch(new Function2() { // from class: i40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccessDeviceManagerViewModel.handleDeviceAddOrDeleteToWechat$lambda$3(this.f20754a, (AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> isDeleteDeviceFromWechat() {
        return this.isDeleteDeviceFromWechat;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
    }

    public final void setDeleteDeviceFromWechat(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isDeleteDeviceFromWechat = mutableLiveData;
    }

    public final void setDeviceInfoUnBindWechat(@NotNull MutableLiveData<DeviceModelsInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.deviceInfoUnBindWechat = mutableLiveData;
    }

    public final void setDeviceModelDataItems(@NotNull ObservableArrayList<DeviceModelsInfo> observableArrayList) {
        Intrinsics.checkNotNullParameter(observableArrayList, "<set-?>");
        this.deviceModelDataItems = observableArrayList;
    }

    public final void setDeviceModelsItems(@NotNull MutableLiveData<ArrayList<DeviceModelsInfo>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.deviceModelsItems = mutableLiveData;
    }

    public final void setDeviceModleListFromAllModels(@NotNull ObservableArrayList<WearableDeviceModel> observableArrayList) {
        Intrinsics.checkNotNullParameter(observableArrayList, "<set-?>");
        this.deviceModleListFromAllModels = observableArrayList;
    }

    public final void setMAccessRequest(@NotNull AccessRequest accessRequest) {
        Intrinsics.checkNotNullParameter(accessRequest, "<set-?>");
        this.mAccessRequest = accessRequest;
    }

    public final void setScopeNetLife(@Nullable NetCoroutineScope netCoroutineScope) {
        this.scopeNetLife = netCoroutineScope;
    }

    public final void setScopeNetLifeGetDeviceProductLst(@Nullable NetCoroutineScope netCoroutineScope) {
        this.scopeNetLifeGetDeviceProductLst = netCoroutineScope;
    }

    public final void setTempDeviceModleDataList(@NotNull ObservableArrayList<DeviceModelsInfo> observableArrayList) {
        Intrinsics.checkNotNullParameter(observableArrayList, "<set-?>");
        this.tempDeviceModleDataList = observableArrayList;
    }
}
