package com.xiaomi.fitness.watch.face.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.data.FaceParam;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010 \u001a\u00020!J\u0014\u0010%\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070'J\u0006\u0010+\u001a\u00020\u0011R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u0017R!\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b)\u0010\u0017¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceMeViewModel;", "Lcom/xiaomi/fitness/watch/face/viewmodel/StateViewModel;", "", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "faceApiRequest", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequest", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequest", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "faceMeData", "Landroidx/lifecycle/MutableLiveData;", "getFaceMeData", "()Landroidx/lifecycle/MutableLiveData;", "faceMeData$delegate", "Lkotlin/Lazy;", "pageLiveData", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;", "getPageLiveData", "pageLiveData$delegate", Constants.KEY_REQUEST_DATA, "deviceModel", "needLoading", "", "deleteLiveData", "getDeleteLiveData", "deleteLiveData$delegate", "delete", "checkedIds", "Ljava/util/ArrayList;", "designerWhiteList", "getDesignerWhiteList", "designerWhiteList$delegate", "checkDesignerWhiteList", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceMeViewModel extends StateViewModel<List<? extends WatchFace>> {
    public FaceApiRequestV2 faceApiRequest;

    /* JADX INFO: renamed from: faceMeData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy faceMeData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: d49
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceMeViewModel.faceMeData_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: pageLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pageLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e49
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceMeViewModel.pageLiveData_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: deleteLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: f49
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceMeViewModel.deleteLiveData_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: designerWhiteList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy designerWhiteList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: g49
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceMeViewModel.designerWhiteList_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel$checkDesignerWhiteList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel$checkDesignerWhiteList$1", f = "FaceMeViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FaceMeViewModel faceMeViewModel, boolean z) {
            faceMeViewModel.getDesignerWhiteList().postValue(Boolean.valueOf(z));
            Logger.i(faceMeViewModel.getTAG(), "checkDesignerWhiteList support: " + z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(FaceMeViewModel faceMeViewModel, ApiException apiException) {
            Logger.i(faceMeViewModel.getTAG(), "checkDesignerWhiteList fail: " + apiException);
            faceMeViewModel.getDesignerWhiteList().postValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceMeViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiRequestV2 faceApiRequest = FaceMeViewModel.this.getFaceApiRequest();
                final FaceMeViewModel faceMeViewModel = FaceMeViewModel.this;
                Function1<? super Boolean, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.f
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceMeViewModel.AnonymousClass1.invokeSuspend$lambda$0(faceMeViewModel, ((Boolean) obj2).booleanValue());
                    }
                };
                final FaceMeViewModel faceMeViewModel2 = FaceMeViewModel.this;
                Function1<? super ApiException, Unit> function2 = new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.g
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceMeViewModel.AnonymousClass1.invokeSuspend$lambda$1(faceMeViewModel2, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (faceApiRequest.checkDesignerWhiteList(function1, function2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel$delete$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel$delete$1", f = "FaceMeViewModel.kt", i = {0}, l = {88, 97}, m = "invokeSuspend", n = {"checkedId"}, s = {"L$1"})
    public static final class C34271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<String> $checkedIds;
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ String $did;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ FaceMeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34271(ArrayList<String> arrayList, String str, WearableDeviceModel wearableDeviceModel, FaceMeViewModel faceMeViewModel, Continuation<? super C34271> continuation) {
            super(2, continuation);
            this.$checkedIds = arrayList;
            this.$did = str;
            this.$deviceModel = wearableDeviceModel;
            this.this$0 = faceMeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34271(this.$checkedIds, this.$did, this.$deviceModel, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003f  */
        /* JADX WARN: Code duplicated, block: B:15:0x0062 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0063  */
        /* JADX WARN: Code duplicated, block: B:19:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:21:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:30:0x00da  */
        /* JADX WARN: Code duplicated, block: B:33:0x010a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x010b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010b -> B:11:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel.C34271.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel$requestData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel$requestData$1", f = "FaceMeViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $deviceModel;
        final /* synthetic */ List<WatchFace> $faces;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34281(List<WatchFace> list, String str, Continuation<? super C34281> continuation) {
            super(2, continuation);
            this.$faces = list;
            this.$deviceModel = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceMeViewModel.this.new C34281(this.$faces, this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiRequestV2 faceApiRequest = FaceMeViewModel.this.getFaceApiRequest();
                FaceParam faceParamGenerateParam = FaceParam.generateParam(this.$faces, this.$deviceModel);
                Intrinsics.checkNotNullExpressionValue(faceParamGenerateParam, "generateParam(...)");
                final FaceMeViewModel faceMeViewModel = FaceMeViewModel.this;
                Function1<List<? extends FaceData>, Unit> function1 = new Function1<List<? extends FaceData>, Unit>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel.requestData.1.1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(List<? extends FaceData> list) {
                        invoke2((List<FaceData>) list);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(List<FaceData> t) {
                        Intrinsics.checkNotNullParameter(t, "t");
                        Logger.i(faceMeViewModel.getTAG(), "getFaceIcon success: " + t.size());
                        FaceManager faceManager = FaceManager.INSTANCE;
                        faceManager.setFaceInfo(t);
                        faceMeViewModel.getPageLiveData().postValue(StateData.Status.SUCCESS);
                        faceMeViewModel.getFaceMeData().postValue(faceManager.getLocalFace());
                    }
                };
                final FaceMeViewModel faceMeViewModel2 = FaceMeViewModel.this;
                final List<WatchFace> list = this.$faces;
                Function1<ApiException, Unit> function2 = new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel.requestData.1.2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                        invoke2(apiException);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(ApiException p1) {
                        Intrinsics.checkNotNullParameter(p1, "p1");
                        Logger.i(faceMeViewModel2.getTAG(), "WatchFace onFail: code = " + p1.getErrorCode() + "; msg = " + p1.getMessage());
                        faceMeViewModel2.getPageLiveData().postValue(StateData.Status.SUCCESS);
                        faceMeViewModel2.getFaceMeData().postValue(list);
                    }
                };
                this.label = 1;
                if (faceApiRequest.getFaceList(faceParamGenerateParam, function1, function2, this) == coroutine_suspended) {
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
            return ((C34281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData deleteLiveData_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData designerWhiteList_delegate$lambda$3() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData faceMeData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData pageLiveData_delegate$lambda$1() {
        return new MutableLiveData();
    }

    public static /* synthetic */ void requestData$default(FaceMeViewModel faceMeViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        faceMeViewModel.requestData(str, z);
    }

    @Override // com.xiaomi.fitness.watch.face.viewmodel.BaseStateViewModel, com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void checkDesignerWhiteList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void delete(@NotNull ArrayList<String> checkedIds) {
        Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        if (did != null) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new C34271(checkedIds, did, wearableDeviceModel, this, null), 3, null);
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteLiveData() {
        return (MutableLiveData) this.deleteLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDesignerWhiteList() {
        return (MutableLiveData) this.designerWhiteList.getValue();
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
    public final MutableLiveData<List<WatchFace>> getFaceMeData() {
        return (MutableLiveData) this.faceMeData.getValue();
    }

    @NotNull
    public final MutableLiveData<StateData.Status> getPageLiveData() {
        return (MutableLiveData) this.pageLiveData.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FaceMeViewModel";
    }

    public final void requestData(@Nullable String deviceModel, boolean needLoading) {
        if (deviceModel == null || deviceModel.length() == 0) {
            getPageLiveData().postValue(StateData.Status.ERROR);
            Logger.i(getTAG(), "WatchFace requestData: device model empty");
            return;
        }
        if (needLoading) {
            getPageLiveData().postValue(StateData.Status.LOADING);
        }
        List<WatchFace> localFace = FaceManager.INSTANCE.getLocalFace();
        if (localFace.isEmpty()) {
            getPageLiveData().postValue(StateData.Status.EMPTY);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C34281(localFace, deviceModel, null), 3, null);
        }
    }

    public final void setFaceApiRequest(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequest = faceApiRequestV2;
    }
}
