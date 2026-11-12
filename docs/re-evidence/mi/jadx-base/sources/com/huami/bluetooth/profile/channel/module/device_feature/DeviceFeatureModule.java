package com.huami.bluetooth.profile.channel.module.device_feature;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import defpackage.d4;
import defpackage.fu;
import defpackage.nl;
import defpackage.ol;
import defpackage.qq;
import defpackage.r3;
import defpackage.x9;
import defpackage.y2;
import defpackage.y6;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/device_feature/DeviceFeatureModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "queryDeviceFeature", "com/huami/bluetooth/profile/channel/module/device_feature/DeviceFeatureModule$b", "featurePredict", "Lcom/huami/bluetooth/profile/channel/module/device_feature/DeviceFeatureModule$b;", "getFeature", "()Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", com.xiaomi.onetrack.api.b.n, "Lr3;", "channelApi", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 40)
public final class DeviceFeatureModule extends a {

    @NotNull
    private static final String tag = "DeviceFeatureModule";

    @NotNull
    private final b featurePredict;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/huami/bluetooth/profile/channel/module/device_feature/DeviceFeatureModule$b", "Lqq;", "Lnl;", "request", "", com.xiaomi.onetrack.api.b.I, "", "predict", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements qq {
        @Override // defpackage.qq
        public boolean predict(@NotNull nl request, @NotNull byte[] response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return ArraysKt___ArraysKt.first(response) == ArraysKt___ArraysKt.first(x9.b.f38873a.getF34884a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.featurePredict = new b();
    }

    @Nullable
    public final Feature getFeature() {
        return queryDeviceFeature();
    }

    @Nullable
    public final Feature queryDeviceFeature() {
        Object objM886constructorimpl;
        ol<byte[]> olVarSendRequest = sendRequest(new nl(x9.a.f38872a, this.featurePredict, 0L, null, false, 28, null));
        if (!(olVarSendRequest instanceof fu)) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(new y6().decode(y2.a((byte[]) ((fu) olVarSendRequest).a())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        return (Feature) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
    }
}
