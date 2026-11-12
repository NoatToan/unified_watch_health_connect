package com.xiaomi.fitness.about;

import android.text.TextUtils;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel;
import com.xiaomi.fitness.about.adapter.DeviceDualAuthorizationAdapter;
import com.xiaomi.fitness.about.bean.RnDeviceInfo;
import com.xiaomi.fitness.about.setting.DeviceDualAuthorizationActivity;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import defpackage.vv1;
import defpackage.yti;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u0016J\b\u0010%\u001a\u00020\u001fH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/about/DeviceDualAuthorizationViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/about/DeviceDualAuthorizationModel;", "<init>", "()V", "items", "Landroidx/databinding/ObservableArrayList;", "Lcom/xiaomi/fitness/about/bean/RnDeviceInfo;", "getItems", "()Landroidx/databinding/ObservableArrayList;", "adapter", "Lcom/xiaomi/fitness/about/adapter/DeviceDualAuthorizationAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/about/adapter/DeviceDualAuthorizationAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "dualAuthorizationSwitch", "Landroidx/lifecycle/MutableLiveData;", "", "getDualAuthorizationSwitch", "()Landroidx/lifecycle/MutableLiveData;", "setDualAuthorizationSwitch", "(Landroidx/lifecycle/MutableLiveData;)V", "deviceIsEmpty", "getDeviceIsEmpty", "setDeviceIsEmpty", "getCommonConfig", "", "setCommonConfig", "value", "", "updateDeviceList", "isRefresh", "updateDeviceItems", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceDualAuthorizationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDualAuthorizationViewModel.kt\ncom/xiaomi/fitness/about/DeviceDualAuthorizationViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n*L\n1#1,96:1\n27#2,5:97\n*S KotlinDebug\n*F\n+ 1 DeviceDualAuthorizationViewModel.kt\ncom/xiaomi/fitness/about/DeviceDualAuthorizationViewModel\n*L\n32#1:97,5\n*E\n"})
public final class DeviceDualAuthorizationViewModel extends BaseViewModel<DeviceDualAuthorizationModel> {

    @NotNull
    private MutableLiveData<Boolean> deviceIsEmpty;

    @NotNull
    private MutableLiveData<Boolean> dualAuthorizationSwitch;

    @NotNull
    private final ItemBinding<RnDeviceInfo> itemBinding;

    @NotNull
    private final ObservableArrayList<RnDeviceInfo> items = new ObservableArrayList<>();

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z36
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceDualAuthorizationViewModel.adapter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel$updateDeviceItems$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel$updateDeviceItems$1", f = "DeviceDualAuthorizationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDeviceDualAuthorizationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDualAuthorizationViewModel.kt\ncom/xiaomi/fitness/about/DeviceDualAuthorizationViewModel$updateDeviceItems$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 DeviceDualAuthorizationViewModel.kt\ncom/xiaomi/fitness/about/DeviceDualAuthorizationViewModel$updateDeviceItems$1\n*L\n84#1:97,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceDualAuthorizationViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceDualAuthorizationViewModel.this.getItems().clear();
            Iterable<RNDeviceModel> deviceModels = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModels();
            DeviceDualAuthorizationViewModel deviceDualAuthorizationViewModel = DeviceDualAuthorizationViewModel.this;
            for (RNDeviceModel rNDeviceModel : deviceModels) {
                if (!Intrinsics.areEqual(DeviceModelExtKt.getModel(rNDeviceModel), "yunmai.scales.ms3001")) {
                    RnDeviceInfo rnDeviceInfo = new RnDeviceInfo();
                    rnDeviceInfo.setBigPreview(DeviceModelExtKt.getDeviceIconUrl(rNDeviceModel, 3));
                    rnDeviceInfo.setName(DeviceModelExtKt.getName(rNDeviceModel));
                    deviceDualAuthorizationViewModel.getItems().add(rnDeviceInfo);
                }
            }
            DeviceDualAuthorizationViewModel.this.getDeviceIsEmpty().setValue(Boxing.boxBoolean(DeviceDualAuthorizationViewModel.this.getItems().size() == 0));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel$updateDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel$updateDeviceList$1", f = "DeviceDualAuthorizationViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17191(Continuation<? super C17191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceDualAuthorizationViewModel.this.new C17191(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DeviceDualAuthorizationModel mModel = DeviceDualAuthorizationViewModel.this.getMModel();
                    this.label = 1;
                    if (mModel.refreshRNDevices(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DeviceDualAuthorizationViewModel.this.updateDeviceItems();
            } catch (Exception e) {
                Logger.e(DeviceDualAuthorizationActivity.TAG, "update device list error", e.toString(), new Object[0]);
                DeviceDualAuthorizationViewModel.this.updateDeviceItems();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DeviceDualAuthorizationViewModel() {
        final Function3 function3 = new Function3() { // from class: a46
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DeviceDualAuthorizationViewModel.itemBinding$lambda$1((ItemBinding) obj, ((Integer) obj2).intValue(), (RnDeviceInfo) obj3);
            }
        };
        this.itemBinding = ItemBinding.INSTANCE.of(new OnItemBind<RnDeviceInfo>() { // from class: com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<RnDeviceInfo> itemBinding, int position, RnDeviceInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.dualAuthorizationSwitch = new MutableLiveData<>();
        this.deviceIsEmpty = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDualAuthorizationAdapter adapter_delegate$lambda$0() {
        return new DeviceDualAuthorizationAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCommonConfig$lambda$2(DeviceDualAuthorizationViewModel this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "switch");
        Logger.i(DeviceDualAuthorizationActivity.TAG, "getCommonConfig onSuccess " + str);
        this$0.dualAuthorizationSwitch.setValue(Boolean.valueOf(TextUtils.isEmpty(str) || Intrinsics.areEqual(str, "0")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCommonConfig$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(DeviceDualAuthorizationActivity.TAG, "getCommonConfig onFail " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemBinding$lambda$1(ItemBinding itemBinding, int i, RnDeviceInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(vv1.f37254b, yti.i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCommonConfig$lambda$4(DeviceDualAuthorizationViewModel this$0, String value, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(value, "$value");
        Logger.i(DeviceDualAuthorizationActivity.TAG, "setCommonConfig onSuccess " + z);
        this$0.dualAuthorizationSwitch.setValue(Boolean.valueOf(Intrinsics.areEqual(value, "0")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCommonConfig$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(DeviceDualAuthorizationActivity.TAG, "setCommonConfig onFail " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDeviceItems() {
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    public static /* synthetic */ void updateDeviceList$default(DeviceDualAuthorizationViewModel deviceDualAuthorizationViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        deviceDualAuthorizationViewModel.updateDeviceList(z);
    }

    @NotNull
    public final DeviceDualAuthorizationAdapter getAdapter() {
        return (DeviceDualAuthorizationAdapter) this.adapter.getValue();
    }

    public final void getCommonConfig() {
        getMModel().getCommonConfig(new Function1() { // from class: x36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceDualAuthorizationViewModel.getCommonConfig$lambda$2(this.f38635a, (String) obj);
            }
        }, new Function1() { // from class: y36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceDualAuthorizationViewModel.getCommonConfig$lambda$3((ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeviceIsEmpty() {
        return this.deviceIsEmpty;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDualAuthorizationSwitch() {
        return this.dualAuthorizationSwitch;
    }

    @NotNull
    public final ItemBinding<RnDeviceInfo> getItemBinding() {
        return this.itemBinding;
    }

    @NotNull
    public final ObservableArrayList<RnDeviceInfo> getItems() {
        return this.items;
    }

    public final void setCommonConfig(@NotNull final String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getMModel().setCommonConfig(value, new Function1() { // from class: b46
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceDualAuthorizationViewModel.setCommonConfig$lambda$4(this.f3779a, value, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: c46
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceDualAuthorizationViewModel.setCommonConfig$lambda$5((ApiException) obj);
            }
        });
    }

    public final void setDeviceIsEmpty(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.deviceIsEmpty = mutableLiveData;
    }

    public final void setDualAuthorizationSwitch(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.dualAuthorizationSwitch = mutableLiveData;
    }

    public final void updateDeviceList(boolean isRefresh) {
        if (isRefresh) {
            AnyExtKt.io$default(null, new C17191(null), 1, null);
        } else {
            updateDeviceItems();
        }
    }
}
