package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miot.rn.plugin.activity.PluginRNActivity;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.eco.api.EcoScalePreference;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel;
import com.xiaomi.fitness.eco.device.manager.ui.bind.RopeSkippingDevice;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.ari;
import defpackage.dw1;
import defpackage.fui;
import defpackage.pr7;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 62\u00020\u0001:\u000267B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0016J&\u0010,\u001a\u00020*2\u001e\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020*0.J\u0010\u0010/\u001a\u00020*2\b\b\u0002\u00100\u001a\u000201J\u0006\u00102\u001a\u00020*J\b\u00103\u001a\u00020*H\u0002J\u000e\u00104\u001a\u000201H\u0082@¢\u0006\u0002\u00105R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012RU\u0010\u0013\u001aD\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c0\u0015j\b\u0012\u0004\u0012\u00020\u0006`\u0014¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "items", "Landroidx/databinding/ObservableArrayList;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/RopeSkippingDevice;", "getItems", "()Landroidx/databinding/ObservableArrayList;", "adapter", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "viewHolderFactory", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "did", "", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "mCurrentDeviceDetail", "mOwner", "Landroidx/lifecycle/LifecycleOwner;", "onCreate", "", CardInfo.KEY_OWNER, "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function3;", "updateDeviceList", "isRefresh", "", "updateDeviceItems", "updateDeviceItemsOnMain", "refreshRNDevices", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "RopeSkippingDeviceItemViewHolder", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindRopeSkippingListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindRopeSkippingListViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n27#2,5:166\n314#3,11:171\n*S KotlinDebug\n*F\n+ 1 BindRopeSkippingListViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListViewModel\n*L\n50#1:166,5\n145#1:171,11\n*E\n"})
public final class BindRopeSkippingListViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "BindRopeSkippingListViewModel";

    @Nullable
    private String did;

    @NotNull
    private final ItemBinding<RopeSkippingDevice> itemBinding;

    @Nullable
    private RopeSkippingDevice mCurrentDeviceDetail;
    private LifecycleOwner mOwner;

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<RopeSkippingDevice>> viewHolderFactory;

    @NotNull
    private final ObservableArrayList<RopeSkippingDevice> items = new ObservableArrayList<>();

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gn2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BindRopeSkippingListViewModel.adapter_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListViewModel$RopeSkippingDeviceItemViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Lpr7;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/RopeSkippingDevice;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindView", "(Lpr7;Lcom/xiaomi/fitness/eco/device/manager/ui/bind/RopeSkippingDevice;)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class RopeSkippingDeviceItemViewHolder extends BaseBindingViewHolder<pr7, RopeSkippingDevice> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RopeSkippingDeviceItemViewHolder(@NotNull View view) {
            super(dw1.c, view);
            Intrinsics.checkNotNullParameter(view, "view");
        }

        @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder
        public void bindView(@NotNull pr7 pr7Var, @NotNull RopeSkippingDevice t) {
            Intrinsics.checkNotNullParameter(pr7Var, "<this>");
            Intrinsics.checkNotNullParameter(t, "t");
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel$updateDeviceItemsOnMain$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel$updateDeviceItemsOnMain$1", f = "BindRopeSkippingListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBindRopeSkippingListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindRopeSkippingListViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListViewModel$updateDeviceItemsOnMain$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1863#2,2:166\n*S KotlinDebug\n*F\n+ 1 BindRopeSkippingListViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/bind/BindRopeSkippingListViewModel$updateDeviceItemsOnMain$1\n*L\n113#1:166,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BindRopeSkippingListViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BindRopeSkippingListViewModel.this.getItems().clear();
            BindRopeSkippingListViewModel.this.mCurrentDeviceDetail = null;
            Iterable<RNDeviceModel> deviceModels = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModels();
            BindRopeSkippingListViewModel bindRopeSkippingListViewModel = BindRopeSkippingListViewModel.this;
            for (RNDeviceModel rNDeviceModel : deviceModels) {
                if (StringsKt__StringsJVMKt.startsWith$default(DeviceModelExtKt.getModel(rNDeviceModel), SportConstants.GYM_MODEL_YUN_MAI_JUMP2_PREFIX, false, 2, null)) {
                    RopeSkippingDevice ropeSkippingDevice = new RopeSkippingDevice();
                    ropeSkippingDevice.setDid(rNDeviceModel.getDid());
                    if (Intrinsics.areEqual(bindRopeSkippingListViewModel.getDid(), ropeSkippingDevice.getDid())) {
                        ropeSkippingDevice.setCurrent(true);
                    }
                    ropeSkippingDevice.setBigIcon(DeviceModelExtKt.getDeviceIconUrl(rNDeviceModel, 3));
                    ropeSkippingDevice.setName(DeviceModelExtKt.getName(rNDeviceModel));
                    ropeSkippingDevice.setDeviceType(3);
                    ropeSkippingDevice.setOwner(rNDeviceModel.isOwner());
                    RNDevice rNDevice = (RNDevice) rNDeviceModel.getDeviceInfo().device;
                    if (rNDevice != null) {
                        ropeSkippingDevice.setModel(rNDevice.getModel());
                        ropeSkippingDevice.setMac(rNDevice.getMac());
                    }
                    if (ropeSkippingDevice.getIsCurrent()) {
                        bindRopeSkippingListViewModel.mCurrentDeviceDetail = ropeSkippingDevice;
                    } else {
                        Boxing.boxBoolean(bindRopeSkippingListViewModel.getItems().add(ropeSkippingDevice));
                    }
                }
            }
            if (BindRopeSkippingListViewModel.this.mCurrentDeviceDetail != null) {
                BindRopeSkippingListViewModel.this.getItems().add(0, BindRopeSkippingListViewModel.this.mCurrentDeviceDetail);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel$updateDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel$updateDeviceList$1", f = "BindRopeSkippingListViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C22921(Continuation<? super C22921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BindRopeSkippingListViewModel.this.new C22921(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BindRopeSkippingListViewModel bindRopeSkippingListViewModel = BindRopeSkippingListViewModel.this;
                    this.label = 1;
                    if (bindRopeSkippingListViewModel.refreshRNDevices(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BindRopeSkippingListViewModel.this.updateDeviceItems();
            } catch (Exception e) {
                EcoDeviceModelExtKt.loge("update device list error", e);
                BindRopeSkippingListViewModel.this.updateDeviceItems();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BindRopeSkippingListViewModel() {
        final Function3 function3 = new Function3() { // from class: hn2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindRopeSkippingListViewModel.itemBinding$lambda$1((ItemBinding) obj, ((Integer) obj2).intValue(), (RopeSkippingDevice) obj3);
            }
        };
        this.itemBinding = ItemBinding.INSTANCE.of(new OnItemBind<RopeSkippingDevice>() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<RopeSkippingDevice> itemBinding, int position, RopeSkippingDevice item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.viewHolderFactory = new Function2() { // from class: in2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BindRopeSkippingListViewModel.viewHolderFactory$lambda$2((View) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BindRopeSkippingListAdapter adapter_delegate$lambda$0() {
        return new BindRopeSkippingListAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemBinding$lambda$1(ItemBinding itemBinding, int i, RopeSkippingDevice item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(dw1.c, fui.h);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshRNDevices(Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).requestDeviceList(new Function1<List<? extends RNDeviceModel>, Unit>() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel$refreshRNDevices$2$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(List<? extends RNDeviceModel> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends RNDeviceModel> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                cancellableContinuation.resume(Boolean.TRUE, new Function1<Throwable, Unit>() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel$refreshRNDevices$2$1.1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuation;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation2.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(new ApiException(it2))));
                    }
                });
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel$refreshRNDevices$2$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(it)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnItemClickListener$lambda$3(Function3 listener, RopeSkippingDevice device, int i, View itemView) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (itemView.getId() == ari.e) {
            AppManager.Companion companion = AppManager.INSTANCE;
            AppManager companion2 = companion.getInstance();
            int i2 = PluginRNActivity.o;
            Intrinsics.checkNotNullExpressionValue(PluginRNActivity.class, "forName(...)");
            companion2.killActivity(PluginRNActivity.class);
            RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).openPlugin(device.getDid());
            EcoScalePreference.putString(SportConstants.KEY_CURRENT_BIND_ROPE_SKIPPING + AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId(), device.getDid());
            AppManager companion3 = companion.getInstance();
            BindRopeSkippingListActivity.Companion companion4 = BindRopeSkippingListActivity.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(BindRopeSkippingListActivity.class, "forName(...)");
            companion3.killActivity(BindRopeSkippingListActivity.class);
        } else {
            listener.invoke(device, Integer.valueOf(i), itemView);
        }
        return Unit.INSTANCE;
    }

    private final void updateDeviceItemsOnMain() {
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    public static /* synthetic */ void updateDeviceList$default(BindRopeSkippingListViewModel bindRopeSkippingListViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bindRopeSkippingListViewModel.updateDeviceList(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RopeSkippingDeviceItemViewHolder viewHolderFactory$lambda$2(View view, int i) {
        Intrinsics.checkNotNull(view);
        return new RopeSkippingDeviceItemViewHolder(view);
    }

    @NotNull
    public final BindRopeSkippingListAdapter getAdapter() {
        return (BindRopeSkippingListAdapter) this.adapter.getValue();
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final ItemBinding<RopeSkippingDevice> getItemBinding() {
        return this.itemBinding;
    }

    @NotNull
    public final ObservableArrayList<RopeSkippingDevice> getItems() {
        return this.items;
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<RopeSkippingDevice>> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        this.mOwner = owner;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setOnItemClickListener(@NotNull final Function3<? super RopeSkippingDevice, ? super Integer, ? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAdapter().setOnChildClickListener(new Function3() { // from class: jn2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindRopeSkippingListViewModel.setOnItemClickListener$lambda$3(listener, (RopeSkippingDevice) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
    }

    public final void updateDeviceItems() {
        updateDeviceItemsOnMain();
    }

    public final void updateDeviceList(boolean isRefresh) {
        if (isRefresh) {
            AnyExtKt.io$default(null, new C22921(null), 1, null);
        } else {
            updateDeviceItems();
        }
    }
}
