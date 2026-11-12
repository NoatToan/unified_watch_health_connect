package com.xiaomi.fitness.watch.face.viewmodel;

import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.adapter.FaceCategoryAdapter;
import com.xiaomi.fitness.watch.face.adapter.FaceCategoryHolder;
import com.xiaomi.fitness.watch.face.data.FaceAllTabInfo;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel;
import defpackage.eu6;
import defpackage.ovi;
import defpackage.tv1;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0006\u00100\u001a\u00020-J\u0018\u00101\u001a\u00020-2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eRU\u0010\u001f\u001aD\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110&¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180(0!j\b\u0012\u0004\u0012\u00020\u0018` ¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceCategoryViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "faceApiRequest", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequest", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequest", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "pageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;", "getPageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "pageLiveData$delegate", "Lkotlin/Lazy;", "faceCategoryAdapter", "Lcom/xiaomi/fitness/watch/face/adapter/FaceCategoryAdapter;", "getFaceCategoryAdapter", "()Lcom/xiaomi/fitness/watch/face/adapter/FaceCategoryAdapter;", "faceCategoryAdapter$delegate", "categoryBindings", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Lcom/xiaomi/fitness/watch/face/data/FaceAllTabInfo;", "getCategoryBindings", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "items", "Landroidx/databinding/ObservableArrayList;", "getItems", "()Landroidx/databinding/ObservableArrayList;", "viewHolder", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "getViewHolder", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "loadData", "requestCategoryList", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "firmwareVersion", "", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceCategoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceCategoryViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceCategoryViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n*L\n1#1,101:1\n27#2,5:102\n*S KotlinDebug\n*F\n+ 1 FaceCategoryViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceCategoryViewModel\n*L\n40#1:102,5\n*E\n"})
public final class FaceCategoryViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "FaceCategoryViewModel";

    @NotNull
    private final ItemBinding<FaceAllTabInfo> categoryBindings;
    public FaceApiRequestV2 faceApiRequest;

    @NotNull
    private final ObservableArrayList<FaceAllTabInfo> items;

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<FaceAllTabInfo>> viewHolder;

    /* JADX INFO: renamed from: pageLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pageLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ao8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceCategoryViewModel.pageLiveData_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: faceCategoryAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy faceCategoryAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bo8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceCategoryViewModel.faceCategoryAdapter_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel$requestCategoryList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel$requestCategoryList$1", f = "FaceCategoryViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFaceCategoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceCategoryViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceCategoryViewModel$requestCategoryList$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n37#2:102\n36#2,3:103\n*S KotlinDebug\n*F\n+ 1 FaceCategoryViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceCategoryViewModel$requestCategoryList$1\n*L\n80#1:102\n80#1:103,3\n*E\n"})
    public static final class C34101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $device;
        final /* synthetic */ String $firmwareVersion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34101(WearableDeviceModel wearableDeviceModel, String str, Continuation<? super C34101> continuation) {
            super(2, continuation);
            this.$device = wearableDeviceModel;
            this.$firmwareVersion = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FaceCategoryViewModel faceCategoryViewModel, List list) {
            String string = Arrays.toString(list.toArray(new FaceAllTabInfo[0]));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.i(FaceCategoryViewModel.TAG, "requestCategoryList success: " + string);
            if (list.isEmpty()) {
                faceCategoryViewModel.getPageLiveData().postValue(StateData.Status.EMPTY);
            } else {
                faceCategoryViewModel.getPageLiveData().postValue(StateData.Status.SUCCESS);
            }
            AnyExtKt.main$default(null, new FaceCategoryViewModel$requestCategoryList$1$1$1(faceCategoryViewModel, list, null), 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(FaceCategoryViewModel faceCategoryViewModel, ApiException apiException) {
            Logger.i(FaceCategoryViewModel.TAG, "requestCategoryList fail: " + apiException);
            faceCategoryViewModel.getPageLiveData().postValue(StateData.Status.ERROR);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceCategoryViewModel.this.new C34101(this.$device, this.$firmwareVersion, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiRequestV2 faceApiRequest = FaceCategoryViewModel.this.getFaceApiRequest();
                String model = DeviceModelExtKt.getModel(this.$device);
                String str = this.$firmwareVersion;
                final FaceCategoryViewModel faceCategoryViewModel = FaceCategoryViewModel.this;
                Function1<? super List<FaceAllTabInfo>, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceCategoryViewModel.C34101.invokeSuspend$lambda$0(faceCategoryViewModel, (List) obj2);
                    }
                };
                final FaceCategoryViewModel faceCategoryViewModel2 = FaceCategoryViewModel.this;
                Function1<? super ApiException, Unit> function2 = new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceCategoryViewModel.C34101.invokeSuspend$lambda$1(faceCategoryViewModel2, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (faceApiRequest.getFaceTabAll(model, str, 3, function1, function2, this) == coroutine_suspended) {
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
            return ((C34101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceCategoryViewModel() {
        final Function3 function3 = new Function3() { // from class: co8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FaceCategoryViewModel.categoryBindings$lambda$2((ItemBinding) obj, ((Integer) obj2).intValue(), (FaceAllTabInfo) obj3);
            }
        };
        this.categoryBindings = ItemBinding.INSTANCE.of(new OnItemBind<FaceAllTabInfo>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<FaceAllTabInfo> itemBinding, int position, FaceAllTabInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.items = new ObservableArrayList<>();
        this.viewHolder = new Function2() { // from class: do8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceCategoryViewModel.viewHolder$lambda$3((View) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit categoryBindings$lambda$2(ItemBinding itemBinding, int i, FaceAllTabInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(tv1.f35071b, ovi.s0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceCategoryAdapter faceCategoryAdapter_delegate$lambda$1() {
        return new FaceCategoryAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData pageLiveData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestCategoryList(WearableDeviceModel device, String firmwareVersion) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C34101(device, firmwareVersion, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceCategoryHolder viewHolder$lambda$3(View view, int i) {
        Intrinsics.checkNotNull(view);
        return new FaceCategoryHolder(view);
    }

    @NotNull
    public final ItemBinding<FaceAllTabInfo> getCategoryBindings() {
        return this.categoryBindings;
    }

    @NotNull
    public final FaceApiRequestV2 getFaceApiRequest() {
        FaceApiRequestV2 faceApiRequestV2 = this.faceApiRequest;
        if (faceApiRequestV2 != null) {
            return faceApiRequestV2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faceApiRequest");
        return null;
    }

    @NotNull
    public final FaceCategoryAdapter getFaceCategoryAdapter() {
        return (FaceCategoryAdapter) this.faceCategoryAdapter.getValue();
    }

    @NotNull
    public final ObservableArrayList<FaceAllTabInfo> getItems() {
        return this.items;
    }

    @NotNull
    public final MutableLiveData<StateData.Status> getPageLiveData() {
        return (MutableLiveData) this.pageLiveData.getValue();
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<FaceAllTabInfo>> getViewHolder() {
        return this.viewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadData() {
        T t;
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        getPageLiveData().postValue(StateData.Status.LOADING);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
        if (firmwareVersion == null) {
            t = firmwareVersion;
            t = "";
        }
        t = firmwareVersion;
        objectRef.element = t;
        if (((CharSequence) t).length() > 0) {
            requestCategoryList(wearableDeviceModel, (String) objectRef.element);
        } else {
            Logger.i(TAG, "requestCategoryList no firmware version");
            wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel.loadData.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i(FaceCategoryViewModel.TAG, "requestCategoryList no firmware version again");
                    this.requestCategoryList(wearableDeviceModel, objectRef.element);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    T t2;
                    String firmwareVersion2;
                    Ref.ObjectRef<String> objectRef2 = objectRef;
                    if (result == null || (firmwareVersion2 = result.getFirmwareVersion()) == null) {
                        t2 = firmwareVersion2;
                        t2 = "";
                    }
                    t2 = firmwareVersion2;
                    objectRef2.element = t2;
                    this.requestCategoryList(wearableDeviceModel, objectRef.element);
                }
            });
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        getFaceCategoryAdapter().setLifecycle(owner.getLifecycle());
    }

    public final void setFaceApiRequest(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequest = faceApiRequestV2;
    }
}
