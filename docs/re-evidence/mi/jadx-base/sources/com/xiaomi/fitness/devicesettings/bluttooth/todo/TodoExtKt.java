package com.xiaomi.fitness.devicesettings.bluttooth.todo;

import android.content.Intent;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSettingHelper;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSyncDeviceManager;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindFragment;
import defpackage.p14;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0015\u0010\u0011\u001a\u00020\u0005*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007\"\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, d2 = {"Lp14$c;", "reminderMark", "", "markReminderFromDevice", "(Lp14$c;)V", "", "checkDeviceSupportTodoEnable", "()Z", "", "DEVICE_CAPABILITY_SUPPORT_TODO", "I", "", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getShowEventReminderEntranceEnable", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "showEventReminderEntranceEnable", "getShowMiuiTodoEntranceEnable", "showMiuiTodoEntranceEnable", "getShowAppTodoRemindEntranceEnable", "showAppTodoRemindEntranceEnable", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class TodoExtKt {
    public static final int DEVICE_CAPABILITY_SUPPORT_TODO = 131072;

    @NotNull
    public static final String TAG = "DeviceTodoExt";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.todo.TodoExtKt$markReminderFromDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.todo.TodoExtKt$markReminderFromDevice$1", f = "TodoExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ p14.c $reminderMark;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p14.c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$reminderMark = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$reminderMark, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            p14.c cVar = this.$reminderMark;
            if (cVar.d == 1) {
                MiuiTodoSyncDeviceManager.INSTANCE.markMiuiTodoFromDevice(cVar);
            } else {
                Intent intent = new Intent(TodoRemindFragment.DEVICE_MARK_ACTION);
                intent.putExtra(TodoRemindFragment.EXTRA_TODO_ID, this.$reminderMark.c);
                intent.putExtra(TodoRemindFragment.EXTRA_TODO_SOURCE, this.$reminderMark.d);
                intent.putExtra(TodoRemindFragment.EXTRA_TODO_STATUS, this.$reminderMark.e);
                intent.putExtra(TodoRemindFragment.EXTRA_TODO_UPDATE_TIME, this.$reminderMark.f);
                ApplicationExtKt.getApplication().sendBroadcast(intent);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final boolean checkDeviceSupportTodoEnable() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            Logger.i(TAG, "checkDeviceSupportTodoEnable device model null");
            return false;
        }
        int deviceCapability = DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid());
        boolean z = (deviceCapability & 131072) == 131072;
        Logger.i(TAG, "deviceSupportCapability " + deviceCapability + ";device support todo: " + z);
        return z;
    }

    public static final boolean getShowAppTodoRemindEntranceEnable() {
        return checkDeviceSupportTodoEnable() && !MiuiTodoSettingHelper.INSTANCE.checkMiuiTodoSupportEnable(ApplicationExtKt.getApplication());
    }

    public static final boolean getShowEventReminderEntranceEnable(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.EVENT_REMIND) && !checkDeviceSupportTodoEnable();
    }

    public static final boolean getShowMiuiTodoEntranceEnable() {
        return checkDeviceSupportTodoEnable() && MiuiTodoSettingHelper.INSTANCE.checkMiuiTodoSupportEnable(ApplicationExtKt.getApplication());
    }

    public static final void markReminderFromDevice(@Nullable p14.c cVar) {
        Logger.i(TAG, "markReminderFromDevice " + cVar);
        if (cVar == null) {
            return;
        }
        AnyExtKt.io$default(null, new AnonymousClass1(cVar, null), 1, null);
    }
}
