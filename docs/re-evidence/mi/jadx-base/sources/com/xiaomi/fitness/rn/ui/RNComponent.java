package com.xiaomi.fitness.rn.ui;

import android.app.Application;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.RNSDK;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat;
import com.xiaomi.fitness.rn.ui.RNComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/rn/ui/RNComponent;", "", "<init>", "()V", "initSDKOnCreate", "", "application", "Landroid/app/Application;", "initOnActivityCrate", "ui_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "RN-UI")
public final class RNComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initOnActivityCrate$lambda$1() {
        DeviceManager.DefaultImpls.requestDeviceList$default(RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE), null, new Function1() { // from class: z6j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNComponent.initOnActivityCrate$lambda$1$lambda$0((ApiException) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initOnActivityCrate$lambda$1$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb = new StringBuilder();
        sb.append("initOnActivityCrate: ");
        sb.append(it);
        return Unit.INSTANCE;
    }

    @ComponentTask(multiProcess = false, notEarlierThan = 11, notLaterThan = 11)
    public final void initOnActivityCrate() {
        MiJiaSDKCompat.Companion companion = MiJiaSDKCompat.INSTANCE;
        companion.getInstance().init();
        companion.getInstance().setInitListener(new Function0() { // from class: y6j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RNComponent.initOnActivityCrate$lambda$1();
            }
        });
    }

    @ComponentTask(multiProcess = false, notLaterThan = 4)
    public final void initSDKOnCreate(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        RNSDK.INSTANCE.init(application);
    }
}
