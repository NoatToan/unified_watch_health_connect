package com.xiaomi.fitness.sport_eco.utils;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.utils.MijiaHelper;
import defpackage.bg4;
import defpackage.e1j;
import defpackage.j5h;
import defpackage.na4;
import defpackage.o4h;
import defpackage.v4h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/MijiaHelper;", "", "<init>", "()V", "TAG", "", "goMijia", "", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "isInstallMijia", "", "doGoMijia", "installed", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MijiaHelper {

    @NotNull
    public static final MijiaHelper INSTANCE = new MijiaHelper();

    @NotNull
    private static final String TAG = "MijiaHelper";

    private MijiaHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void goMijia$lambda$0(v4h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.onNext(Boolean.valueOf(INSTANCE.isInstallMijia()));
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goMijia$lambda$1(EcoDeviceModel ecoDeviceModel, Boolean bool) {
        Logger.i(TAG, "has installed mijia: " + bool);
        MijiaHelper mijiaHelper = INSTANCE;
        Intrinsics.checkNotNull(bool);
        mijiaHelper.doGoMijia(bool.booleanValue(), ecoDeviceModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void goMijia$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goMijia$lambda$3(Throwable th) {
        Logger.i(TAG, "error: " + th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void goMijia$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    public final void doGoMijia(boolean installed, @NotNull EcoDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intent intent = new Intent();
        String model = EcoDeviceModelExtKt.getModel(deviceModel);
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

    public final void goMijia(@Nullable final EcoDeviceModel deviceModel) {
        if (deviceModel == null || !deviceModel.getIsDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(e1j.f);
            return;
        }
        o4h o4hVarF = o4h.f(new j5h() { // from class: qxf
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                MijiaHelper.goMijia$lambda$0(v4hVar);
            }
        });
        final Function1 function1 = new Function1() { // from class: rxf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MijiaHelper.goMijia$lambda$1(deviceModel, (Boolean) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: sxf
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                MijiaHelper.goMijia$lambda$2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: txf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MijiaHelper.goMijia$lambda$3((Throwable) obj);
            }
        };
        new na4().a(o4hVarF.O(bg4Var, new bg4() { // from class: uxf
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                MijiaHelper.goMijia$lambda$4(function2, obj);
            }
        }));
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
