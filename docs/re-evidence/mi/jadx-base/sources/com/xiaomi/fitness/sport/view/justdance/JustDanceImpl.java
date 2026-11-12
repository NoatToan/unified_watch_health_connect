package com.xiaomi.fitness.sport.view.justdance;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.view.justdance.JustDanceImpl;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlSender;
import com.xiaomi.fitness.sport.view.justdance.launch.JDLaunchHelper;
import com.xiaomi.fitness.sport.view.justdance.launch.JustDanceLaunchActivity;
import com.xiaomi.fitness.sport_export.IJustDanceApi;
import com.xiaomi.onetrack.api.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/JustDanceImpl;", "Lcom/xiaomi/fitness/sport_export/IJustDanceApi;", "<init>", "()V", "gotoLaunchActivity", "", "context", "Landroid/content/Context;", "gotoControlActivity", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", DeviceInfo.Builder.PrivateDataKey.IP, "", b.F, "fromLaunch", "", "accessorySupportJustDance", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JustDanceImpl implements IJustDanceApi {
    private final void accessorySupportJustDance(FragmentActivity activity, boolean fromLaunch) {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) CollectionsKt___CollectionsKt.firstOrNull((List) DeviceManagerExtKt.getInstance(companion).getAccessoryDeviceModels());
        if (wearableDeviceModel == null) {
            JDLaunchHelper jDLaunchHelper = JDLaunchHelper.INSTANCE;
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            jDLaunchHelper.showUnSupportDialog(supportFragmentManager);
            return;
        }
        if (DeviceModelExtKt.supportJustDance(wearableDeviceModel)) {
            JDLaunchHelper.INSTANCE.showWearModeConflictDialog(wearableDeviceModel.getDid(), activity, DeviceManagerExtKt.getInstance(companion).getAccessoryMode(wearableDeviceModel.getDid()), fromLaunch);
        } else {
            JDLaunchHelper jDLaunchHelper2 = JDLaunchHelper.INSTANCE;
            FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            jDLaunchHelper2.showUnSupportDialog(supportFragmentManager2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoControlActivity$lambda$2(WearableDeviceModel wearableDeviceModel, FragmentActivity activity, boolean z, String ip, String port, int i) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(ip, "$ip");
        Intrinsics.checkNotNullParameter(port, "$port");
        if (i == 2) {
            JDLaunchHelper.INSTANCE.showWearModeConflictDialog(wearableDeviceModel.getDid(), activity, i, z);
            return Unit.INSTANCE;
        }
        Intent intent = new Intent();
        intent.setClass(activity, JustDanceControlActivity.class);
        intent.putExtra(JustDanceControlActivity.EXTRA_IP, ip);
        intent.putExtra(JustDanceControlActivity.EXTRA_PORT, port);
        intent.putExtra(JustDanceControlActivity.FROM_LAUNCH, z);
        activity.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport_export.IJustDanceApi
    public void gotoControlActivity(@NotNull final FragmentActivity activity, @NotNull final String ip, @NotNull final String port, final boolean fromLaunch) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(port, "port");
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            accessorySupportJustDance(activity, fromLaunch);
            return;
        }
        if (!DeviceModelExtKt.supportJustDance(wearableDeviceModel)) {
            accessorySupportJustDance(activity, fromLaunch);
            return;
        }
        if (wearableDeviceModel.getIsDeviceConnected()) {
            JustDanceControlSender.INSTANCE.getDeviceWearMode(new Function1() { // from class: xxd
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return JustDanceImpl.gotoControlActivity$lambda$2(wearableDeviceModel, activity, fromLaunch, ip, port, ((Integer) obj).intValue());
                }
            });
            return;
        }
        JDLaunchHelper jDLaunchHelper = JDLaunchHelper.INSTANCE;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        jDLaunchHelper.showUnSupportDialog(supportFragmentManager);
    }

    @Override // com.xiaomi.fitness.sport_export.IJustDanceApi
    public void gotoLaunchActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.setClass(context, JustDanceLaunchActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
