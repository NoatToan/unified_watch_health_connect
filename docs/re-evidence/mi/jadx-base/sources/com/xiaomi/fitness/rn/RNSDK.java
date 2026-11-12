package com.xiaomi.fitness.rn;

import android.app.Application;
import com.horcrux.svg.SvgPackage;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.rn.RNSDK;
import com.xiaomi.fitness.rn.api.HostApi;
import com.xiaomi.fitness.rn.api.LogInjectApi;
import com.xiaomi.fitness.rn.api.PermissionApi;
import com.xiaomi.fitness.rn.api.UiInjectApi;
import com.xiaomi.fitness.rn.sdk.RnPersistManager;
import com.xiaomi.smarthome.core.server.internal.account.MiJiaAccountManager;
import com.xiaomi.youpin.login.entity.account.LoginMiAccount;
import defpackage.lge;
import defpackage.mya;
import defpackage.n1i;
import defpackage.r7j;
import defpackage.wdj;
import defpackage.wuk;
import defpackage.x6j;
import defpackage.ydj;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/rn/RNSDK;", "", "<init>", "()V", "init", "", "app", "Landroid/app/Application;", "setDebug", "enable", "", DeviceInfo.Builder.PrivateDataKey.IP, "", "model", "packageName", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNSDK {

    @NotNull
    public static final RNSDK INSTANCE = new RNSDK();

    private RNSDK() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$0(boolean z) {
        if (!z) {
            RnPersistManager.INSTANCE.delAllSettingCacheData();
        }
        return Unit.INSTANCE;
    }

    public final void init(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        wuk.b bVar = new wuk.b();
        bVar.i(new HostApi());
        bVar.k(new PermissionApi());
        bVar.m(new UiInjectApi());
        bVar.j(new LogInjectApi());
        n1i.b().c(app, bVar);
        MiJiaAccountManager.getInstance().setMiAccount(new LoginMiAccount());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ydj());
        arrayList.add(new SvgPackage());
        arrayList.add(new r7j());
        arrayList.add(new wdj());
        arrayList.add(new x6j());
        arrayList.add(new mya());
        arrayList.add(new ReactNativeSDKPackage());
        arrayList.add(new lge());
        n1i.b().h(arrayList);
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: z8j
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RNSDK.init$lambda$0(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setDebug(boolean enable, @NotNull String ip, @NotNull String model, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        n1i.b().g(enable, ip, model, packageName);
    }
}
