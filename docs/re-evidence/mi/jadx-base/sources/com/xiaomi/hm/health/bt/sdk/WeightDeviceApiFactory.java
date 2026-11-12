package com.xiaomi.hm.health.bt.sdk;

import android.content.Context;
import com.xiaomi.smarthome.homeroom.model.Home;
import defpackage.bys;
import defpackage.fx;
import defpackage.ovs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/WeightDeviceApiFactory;", "", "()V", "getWeightDeviceApi", "Lcom/xiaomi/hm/health/bt/sdk/IWeightDeviceApi;", "ctx", "Landroid/content/Context;", Home.JSON_KEY_ADDRESS, "", "isBfs", "", "btData_wearRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class WeightDeviceApiFactory {
    @NotNull
    public final IWeightDeviceApi getWeightDeviceApi(@NotNull Context ctx, @NotNull String address, boolean isBfs) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(address, "address");
        bys ovsVar = isBfs ? new ovs(ctx, address) : new bys(ctx, address);
        ovsVar.B(false);
        ovsVar.x(false);
        return new fx(ovsVar);
    }
}
