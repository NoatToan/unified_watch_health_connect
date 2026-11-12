package com.xiaomi.fitness.sport.utils;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.c1j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/MijiaHelper;", "", "<init>", "()V", "TAG", "", "goMijia", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "isInstallMijia", "", "doGoMijia", "installed", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MijiaHelper {

    @NotNull
    public static final MijiaHelper INSTANCE = new MijiaHelper();

    @NotNull
    private static final String TAG = "MijiaHelper";

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.utils.MijiaHelper$goMijia$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.utils.MijiaHelper$goMijia$1", f = "MijiaHelper.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    MijiaHelper$goMijia$1$result$1 mijiaHelper$goMijia$1$result$1 = new MijiaHelper$goMijia$1$result$1(null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, mijiaHelper$goMijia$1$result$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Logger.i(MijiaHelper.TAG, "has installed mijia: " + zBooleanValue);
                MijiaHelper.INSTANCE.doGoMijia(zBooleanValue, this.$deviceModel);
            } catch (Exception e) {
                Logger.i(MijiaHelper.TAG, "error: " + e.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private MijiaHelper() {
    }

    public final void doGoMijia(boolean installed, @NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intent intent = new Intent();
        String model = DeviceModelExtKt.getModel(deviceModel);
        String did = deviceModel.getDid();
        if (installed) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("mihome://home.mi.com/device/%s?did=%s", Arrays.copyOf(new Object[]{model, did}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            intent.setData(Uri.parse(str));
        } else {
            intent.setData(Uri.parse("market://details?id=com.xiaomi.smarthome"));
        }
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        ApplicationExtKt.getApplication().startActivity(intent);
    }

    public final void goMijia(@Nullable WearableDeviceModel deviceModel) {
        if (deviceModel == null || !deviceModel.getIsDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(c1j.j);
        } else {
            ScopeExtKt.scope$default(null, new AnonymousClass1(deviceModel, null), 1, null);
        }
    }

    public final boolean isInstallMijia() {
        List<PackageInfo> installedPackages = ApplicationExtKt.getApplication().getPackageManager().getInstalledPackages(0);
        Intrinsics.checkNotNullExpressionValue(installedPackages, "getInstalledPackages(...)");
        Iterator<PackageInfo> it = installedPackages.iterator();
        while (it.hasNext()) {
            String packageName = it.next().packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = packageName.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, "com.xiaomi.smarthome")) {
                return true;
            }
        }
        return false;
    }
}
