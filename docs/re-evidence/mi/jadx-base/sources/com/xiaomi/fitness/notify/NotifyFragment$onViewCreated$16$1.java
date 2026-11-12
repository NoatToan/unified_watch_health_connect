package com.xiaomi.fitness.notify;

import android.widget.LinearLayout;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import defpackage.q0j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyFragment$onViewCreated$16$1", f = "NotifyFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NotifyFragment$onViewCreated$16$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $allEnable;
    final /* synthetic */ int $isNotifyStatusOnScreenLockEnable;
    final /* synthetic */ int $isOnlyWear;
    final /* synthetic */ boolean $notifyEnabled;
    final /* synthetic */ int $screenOnNewNotification;
    int label;
    final /* synthetic */ NotifyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyFragment$onViewCreated$16$1(NotifyFragment notifyFragment, boolean z, int i, boolean z2, int i2, int i3, Continuation<? super NotifyFragment$onViewCreated$16$1> continuation) {
        super(2, continuation);
        this.this$0 = notifyFragment;
        this.$notifyEnabled = z;
        this.$isOnlyWear = i;
        this.$allEnable = z2;
        this.$screenOnNewNotification = i2;
        this.$isNotifyStatusOnScreenLockEnable = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotifyFragment$onViewCreated$16$1(this.this$0, this.$notifyEnabled, this.$isOnlyWear, this.$allEnable, this.$screenOnNewNotification, this.$isNotifyStatusOnScreenLockEnable, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WearableDeviceModel mDeviceModel;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WearableDeviceModel mDeviceModel2 = NotifyFragment.access$getMViewModel(this.this$0).getMDeviceModel();
        if ((mDeviceModel2 != null && DeviceModelExtKt.isHuaMi(mDeviceModel2) && this.this$0.isUBoxUI) || this.$notifyEnabled) {
            NotifyFragment.access$getMBinding(this.this$0).H.setSwitch(true);
            NotifyFragment.access$getMBinding(this.this$0).H.setSubtitle(q0j.v);
            NotifyFragment.access$getMBinding(this.this$0).Q.setVisibility(0);
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView = NotifyFragment.access$getMBinding(this.this$0).J;
            WearableDeviceModel mDeviceModel3 = NotifyFragment.access$getMViewModel(this.this$0).getMDeviceModel();
            switchButtonTwoLineTextView.setVisibility((mDeviceModel3 == null || !DeviceModelExtKt.isWearOS(mDeviceModel3)) ? 0 : 8);
            WearableDeviceModel mDeviceModel4 = NotifyFragment.access$getMViewModel(this.this$0).getMDeviceModel();
            if ((mDeviceModel4 == null || !DeviceModelExtKt.isSupportFeature(mDeviceModel4, "notification_action")) && ((mDeviceModel = NotifyFragment.access$getMViewModel(this.this$0).getMDeviceModel()) == null || !DeviceModelExtKt.isL66(mDeviceModel))) {
                NotifyFragment.access$getMBinding(this.this$0).G.setVisibility(8);
            } else {
                NotifyFragment.access$getMBinding(this.this$0).G.setVisibility(0);
            }
            LinearLayout openNotificationTypeView = NotifyFragment.access$getMBinding(this.this$0).L;
            Intrinsics.checkNotNullExpressionValue(openNotificationTypeView, "openNotificationTypeView");
            ViewExtKt.visible(openNotificationTypeView);
            if (NotifyFragment.access$getMViewModel(this.this$0).getIsSupportOnlyWear()) {
                SwitchButtonTwoLineTextView onlyWearButton = NotifyFragment.access$getMBinding(this.this$0).K;
                Intrinsics.checkNotNullExpressionValue(onlyWearButton, "onlyWearButton");
                ViewExtKt.visible(onlyWearButton);
                NotifyFragment.access$getMBinding(this.this$0).K.setSwitch(this.$isOnlyWear == 1);
            } else {
                SwitchButtonTwoLineTextView onlyWearButton2 = NotifyFragment.access$getMBinding(this.this$0).K;
                Intrinsics.checkNotNullExpressionValue(onlyWearButton2, "onlyWearButton");
                ViewExtKt.gone(onlyWearButton2);
            }
            if (this.$allEnable) {
                this.this$0.hideLoading();
                RecyclerView appList = NotifyFragment.access$getMBinding(this.this$0).A;
                Intrinsics.checkNotNullExpressionValue(appList, "appList");
                ViewExtKt.gone(appList);
            } else {
                this.this$0.setDefaultApp();
                RecyclerView appList2 = NotifyFragment.access$getMBinding(this.this$0).A;
                Intrinsics.checkNotNullExpressionValue(appList2, "appList");
                ViewExtKt.visible(appList2);
            }
        } else {
            this.this$0.hideLoading();
            NotifyFragment.access$getMBinding(this.this$0).H.setSwitch(false);
            NotifyFragment.access$getMBinding(this.this$0).H.setSubtitle(q0j.t);
            NotifyFragment.access$getMBinding(this.this$0).Q.setVisibility(8);
            NotifyFragment.access$getMBinding(this.this$0).J.setVisibility(8);
            NotifyFragment.access$getMBinding(this.this$0).G.setVisibility(8);
            NotifyFragment.access$getMBinding(this.this$0).K.setSwitch(this.$isOnlyWear == 1);
            LinearLayout openNotificationTypeView2 = NotifyFragment.access$getMBinding(this.this$0).L;
            Intrinsics.checkNotNullExpressionValue(openNotificationTypeView2, "openNotificationTypeView");
            ViewExtKt.gone(openNotificationTypeView2);
            SwitchButtonTwoLineTextView onlyWearButton3 = NotifyFragment.access$getMBinding(this.this$0).K;
            Intrinsics.checkNotNullExpressionValue(onlyWearButton3, "onlyWearButton");
            ViewExtKt.gone(onlyWearButton3);
            RecyclerView appList3 = NotifyFragment.access$getMBinding(this.this$0).A;
            Intrinsics.checkNotNullExpressionValue(appList3, "appList");
            ViewExtKt.gone(appList3);
        }
        NotifyFragment.access$getMViewModel(this.this$0).setAllNotifyEnable(this.$allEnable, true);
        NotifyFragment.access$getMBinding(this.this$0).G.setSwitch(this.$screenOnNewNotification == 1);
        NotifyFragment.access$getMBinding(this.this$0).J.setSwitch(this.$isNotifyStatusOnScreenLockEnable == 1);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotifyFragment$onViewCreated$16$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
