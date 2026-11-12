package com.xiaomi.fitness.devicesettings.common.eventremind;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventRemindViewModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem;
import defpackage.eu6;
import defpackage.ld8;
import defpackage.m28;
import defpackage.wzi;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001eJ\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u0006\u0010 \u001a\u00020\u001aJ\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010$\u001a\u00020\u001aJ\u0014\u0010%\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u0016\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR'\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventRemindViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "eventMinderModel", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;", "getEventMinderModel", "()Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;", "modelLivaData", "Landroidx/lifecycle/MutableLiveData;", "deleteState", "", "getDeleteState", "()Landroidx/lifecycle/MutableLiveData;", "addOrUpdateState", "getAddOrUpdateState", "eventRemindRange", "Lkotlin/Pair;", "", "getEventRemindRange", "()Lkotlin/Pair;", "eventRemindRange$delegate", "Lkotlin/Lazy;", "observerModel", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "getCurrentModel", "updateModel", "attach", "savedInstanceState", "Landroid/os/Bundle;", "getDatas", "deleteEventMinders", "minderItems", "", "Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;", "addOrUpdateEventMinder", "mindItem", "isAdd", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventRemindViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "EventRemindViewModel";

    @Nullable
    private WearableDeviceModel deviceModel;

    @NotNull
    private final MutableLiveData<EventMinderModel> modelLivaData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> deleteState = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> addOrUpdateState = new MutableLiveData<>();

    /* JADX INFO: renamed from: eventRemindRange$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eventRemindRange = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pe8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EventRemindViewModel.eventRemindRange_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.eventremind.EventRemindViewModel$deleteEventMinders$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.eventremind.EventRemindViewModel$deleteEventMinders$1", f = "EventRemindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<EventReMinderItem> $minderItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends EventReMinderItem> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$minderItems = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventRemindViewModel.this.new AnonymousClass1(this.$minderItems, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventMinderModel eventMinderModel = EventRemindViewModel.this.getEventMinderModel();
            WearableDeviceModel wearableDeviceModel = EventRemindViewModel.this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            List<EventReMinderItem> list = this.$minderItems;
            final EventRemindViewModel eventRemindViewModel = EventRemindViewModel.this;
            eventMinderModel.deleteEventMinderItems(wearableDeviceModel, list, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventRemindViewModel.deleteEventMinders.1.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    eventRemindViewModel.getDeleteState().postValue(Boolean.FALSE);
                    ToastUtil.showShortToast(wzi.common_delete_failure);
                }

                @Override // defpackage.eu6
                public /* bridge */ /* synthetic */ void onResult(Boolean bool) {
                    onResult(bool.booleanValue());
                }

                public void onResult(boolean result) {
                    eventRemindViewModel.getDeleteState().postValue(Boolean.valueOf(result));
                    if (result) {
                        ToastUtil.showShortToast(wzi.common_delete_success);
                    } else {
                        ToastUtil.showShortToast(wzi.common_delete_failure);
                    }
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.eventremind.EventRemindViewModel$getDatas$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.eventremind.EventRemindViewModel$getDatas$1", f = "EventRemindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C21331(Continuation<? super C21331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventRemindViewModel.this.new C21331(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventMinderModel eventMinderModel = EventRemindViewModel.this.getEventMinderModel();
            WearableDeviceModel wearableDeviceModel = EventRemindViewModel.this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            final EventRemindViewModel eventRemindViewModel = EventRemindViewModel.this;
            eventMinderModel.getEventMinders(wearableDeviceModel, new eu6<EventMinderModel>() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventRemindViewModel.getDatas.1.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    eventRemindViewModel.modelLivaData.postValue(null);
                }

                @Override // defpackage.eu6
                public void onResult(EventMinderModel result) {
                    eventRemindViewModel.modelLivaData.postValue(result);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair eventRemindRange_delegate$lambda$0() {
        return EventMinderUtil.INSTANCE.createRemindDateRange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventMinderModel getEventMinderModel() {
        return EventMinderUtil.INSTANCE.getEventMinderModel();
    }

    public final void addOrUpdateEventMinder(@NotNull EventReMinderItem mindItem, boolean isAdd) {
        Intrinsics.checkNotNullParameter(mindItem, "mindItem");
        eu6<Boolean> eu6Var = new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventRemindViewModel$addOrUpdateEventMinder$callback$1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                Logger.e(EventRemindViewModel.TAG, "addOrUpdateEventMinder error:" + errorCode);
                this.this$0.getAddOrUpdateState().postValue(null);
                ToastUtil.showShortToast(wzi.B1);
            }

            @Override // defpackage.eu6
            public void onResult(Boolean result) {
                Logger.d(EventRemindViewModel.TAG, "addOrUpdateEventMinder onResult:" + result);
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(result, bool)) {
                    ld8.c().l(new m28());
                    this.this$0.getAddOrUpdateState().postValue(bool);
                } else {
                    this.this$0.getAddOrUpdateState().postValue(null);
                    ToastUtil.showShortToast(wzi.B1);
                }
            }
        };
        if (isAdd) {
            EventMinderModel eventMinderModel = getEventMinderModel();
            WearableDeviceModel wearableDeviceModel = this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            eventMinderModel.addEventMinder(wearableDeviceModel, mindItem, eu6Var);
            return;
        }
        EventMinderModel eventMinderModel2 = getEventMinderModel();
        WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel2);
        eventMinderModel2.updateEventMinder(wearableDeviceModel2, mindItem, eu6Var);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void deleteEventMinders(@NotNull List<? extends EventReMinderItem> minderItems) {
        Intrinsics.checkNotNullParameter(minderItems, "minderItems");
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(minderItems, null));
    }

    @NotNull
    public final MutableLiveData<Boolean> getAddOrUpdateState() {
        return this.addOrUpdateState;
    }

    @Nullable
    public final EventMinderModel getCurrentModel() {
        return this.modelLivaData.getValue();
    }

    public final void getDatas() {
        ScopeExtKt.scope(Dispatchers.getIO(), new C21331(null));
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteState() {
        return this.deleteState;
    }

    @NotNull
    public final Pair<Long, Long> getEventRemindRange() {
        return (Pair) this.eventRemindRange.getValue();
    }

    public final void observerModel(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<EventMinderModel> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.modelLivaData.observe(lifecycleOwner, observer);
    }

    public final void updateModel() {
        this.modelLivaData.setValue(getEventMinderModel());
    }
}
