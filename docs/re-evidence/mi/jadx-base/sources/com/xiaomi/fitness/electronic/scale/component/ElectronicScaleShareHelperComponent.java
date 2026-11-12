package com.xiaomi.fitness.electronic.scale.component;

import android.app.Application;
import android.os.Handler;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.electronic.scale.component.ElectronicScaleShareHelperComponent;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ShareAccount;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleShareHelperImpl;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import defpackage.qal;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/component/ElectronicScaleShareHelperComponent;", "", "<init>", "()V", "checkSharedScale", "", "app", "Landroid/app/Application;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = ElectronicScaleShareHelperImpl.TAG)
public final class ElectronicScaleShareHelperComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSharedScale$lambda$1() {
        qal.a("ElectronicScaleShareHelper checkSharedScale");
        ElectronicScaleShareHelperExtKt.getInstance(ElectronicScaleShareHelper.INSTANCE).checkSharedScale(new Function1() { // from class: q58
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ElectronicScaleShareHelperComponent.checkSharedScale$lambda$1$lambda$0((ShareAccount) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit checkSharedScale$lambda$1$lambda$0(ShareAccount it) {
        String bigIcon;
        Intrinsics.checkNotNullParameter(it, "it");
        EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductByModel(it.getModel());
        if (ecoProduct == null) {
            qal.b("ElectronicScaleShareHelper, productByModel == null");
            return Unit.INSTANCE;
        }
        if (ecoProduct.getBigIcon() == null) {
            bigIcon = "";
        } else {
            bigIcon = ecoProduct.getBigIcon();
            Intrinsics.checkNotNull(bigIcon);
        }
        MainExtKt.getInstance(MainHelper.INSTANCE).showDeviceShareDialog(it.getUserId(), it.getShareUserId(), it.getShareId(), bigIcon);
        return Unit.INSTANCE;
    }

    @ComponentTask(notEarlierThan = 10, notLaterThan = 11, onMainThread = true)
    public final void checkSharedScale(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            new Handler(app.getMainLooper()).postDelayed(new Runnable() { // from class: r58
                @Override // java.lang.Runnable
                public final void run() {
                    ElectronicScaleShareHelperComponent.checkSharedScale$lambda$1();
                }
            }, TimeUnit.SECONDS.toMillis(3L));
        }
    }
}
