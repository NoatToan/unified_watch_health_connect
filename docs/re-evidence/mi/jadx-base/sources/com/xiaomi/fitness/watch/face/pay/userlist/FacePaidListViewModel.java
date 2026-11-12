package com.xiaomi.fitness.watch.face.pay.userlist;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListViewModel;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.request.FacePaidListResponse;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListModel;", "<init>", "()V", "faceApiRequestV2", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequestV2", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequestV2", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "nextKey", "", "paidFaceList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListViewModel$PaidFaceData;", "getPaidFaceList", "()Landroidx/lifecycle/MutableLiveData;", "paidFaceList$delegate", "Lkotlin/Lazy;", "", "TAG", "getTAG", "()Ljava/lang/String;", "PaidFaceData", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FacePaidListViewModel extends BaseViewModel<FacePaidListModel> {
    public FaceApiRequestV2 faceApiRequestV2;

    @Nullable
    private String nextKey;

    @Nullable
    private final WearableDeviceModel deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    /* JADX INFO: renamed from: paidFaceList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy paidFaceList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s49
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FacePaidListViewModel.paidFaceList_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListViewModel$PaidFaceData;", "", "list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "hasNext", "", "<init>", "(Ljava/util/List;Z)V", "getList", "()Ljava/util/List;", "getHasNext", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaidFaceData {
        private final boolean hasNext;

        @NotNull
        private final List<FaceData> list;

        public PaidFaceData(@NotNull List<FaceData> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.hasNext = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaidFaceData copy$default(PaidFaceData paidFaceData, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = paidFaceData.list;
            }
            if ((i & 2) != 0) {
                z = paidFaceData.hasNext;
            }
            return paidFaceData.copy(list, z);
        }

        @NotNull
        public final List<FaceData> component1() {
            return this.list;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasNext() {
            return this.hasNext;
        }

        @NotNull
        public final PaidFaceData copy(@NotNull List<FaceData> list, boolean hasNext) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new PaidFaceData(list, hasNext);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaidFaceData)) {
                return false;
            }
            PaidFaceData paidFaceData = (PaidFaceData) other;
            return Intrinsics.areEqual(this.list, paidFaceData.list) && this.hasNext == paidFaceData.hasNext;
        }

        public final boolean getHasNext() {
            return this.hasNext;
        }

        @NotNull
        public final List<FaceData> getList() {
            return this.list;
        }

        public int hashCode() {
            return (this.list.hashCode() * 31) + Boolean.hashCode(this.hasNext);
        }

        @NotNull
        public String toString() {
            return "PaidFaceData(list=" + this.list + ", hasNext=" + this.hasNext + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListViewModel$getPaidFaceList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListViewModel$getPaidFaceList$1", f = "FacePaidListViewModel.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FacePaidListViewModel facePaidListViewModel, FacePaidListResponse facePaidListResponse) {
            facePaidListViewModel.nextKey = facePaidListResponse.getNext_key();
            if (facePaidListResponse.getUser_watchface_list() != null) {
                Logger.i(facePaidListViewModel.getTAG(), "getPaidFaceList success: " + facePaidListResponse.getUser_watchface_list().size());
                MutableLiveData<PaidFaceData> paidFaceList = facePaidListViewModel.getPaidFaceList();
                List<FaceData> user_watchface_list = facePaidListResponse.getUser_watchface_list();
                String str = facePaidListViewModel.nextKey;
                paidFaceList.postValue(new PaidFaceData(user_watchface_list, !(str == null || str.length() == 0)));
            } else {
                Logger.i(facePaidListViewModel.getTAG(), "getPaidFaceList fail: list == null");
                facePaidListViewModel.getPaidFaceList().postValue(new PaidFaceData(CollectionsKt__CollectionsKt.emptyList(), false));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(FacePaidListViewModel facePaidListViewModel, ApiException apiException) {
            Logger.i(facePaidListViewModel.getTAG(), "getPaidFaceList fail: " + apiException);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FacePaidListViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String model;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiRequestV2 faceApiRequestV2 = FacePaidListViewModel.this.getFaceApiRequestV2();
                WearableDeviceModel wearableDeviceModel = FacePaidListViewModel.this.deviceModel;
                String str = (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) ? "" : model;
                String str2 = FacePaidListViewModel.this.nextKey;
                String str3 = str2 == null ? "" : str2;
                final FacePaidListViewModel facePaidListViewModel = FacePaidListViewModel.this;
                Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.watch.face.pay.userlist.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FacePaidListViewModel.AnonymousClass1.invokeSuspend$lambda$0(facePaidListViewModel, (FacePaidListResponse) obj2);
                    }
                };
                final FacePaidListViewModel facePaidListViewModel2 = FacePaidListViewModel.this;
                Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.watch.face.pay.userlist.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FacePaidListViewModel.AnonymousClass1.invokeSuspend$lambda$1(facePaidListViewModel2, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (FaceApiRequestV2.getPaidFaceList$default(faceApiRequestV2, str, str3, 0, function1, function2, this, 4, null) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData paidFaceList_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @NotNull
    public final FaceApiRequestV2 getFaceApiRequestV2() {
        FaceApiRequestV2 faceApiRequestV2 = this.faceApiRequestV2;
        if (faceApiRequestV2 != null) {
            return faceApiRequestV2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faceApiRequestV2");
        return null;
    }

    @NotNull
    public final MutableLiveData<PaidFaceData> getPaidFaceList() {
        return (MutableLiveData) this.paidFaceList.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FacePaidListViewModel";
    }

    public final void setFaceApiRequestV2(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequestV2 = faceApiRequestV2;
    }

    /* JADX INFO: renamed from: getPaidFaceList, reason: collision with other method in class */
    public final void m658getPaidFaceList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}
