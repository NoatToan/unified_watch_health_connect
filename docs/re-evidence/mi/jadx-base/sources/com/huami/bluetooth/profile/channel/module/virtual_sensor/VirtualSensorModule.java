package com.huami.bluetooth.profile.channel.module.virtual_sensor;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.C3621pl;
import defpackage.cw;
import defpackage.d4;
import defpackage.mj;
import defpackage.nl;
import defpackage.ow;
import defpackage.r3;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "queryVersion", "()Ljava/lang/Integer;", "version$delegate", "Lkotlin/Lazy;", "getVersion", "version", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 49)
public final class VirtualSensorModule extends a {
    public static final int VERSION_1 = 1;

    /* JADX INFO: renamed from: version$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return VirtualSensorModule.this.queryVersion();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualSensorModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.version = LazyKt__LazyJVMKt.lazy(new b());
    }

    @Nullable
    public final Integer getVersion() {
        return (Integer) this.version.getValue();
    }

    @Nullable
    public final Integer queryVersion() {
        return (Integer) C3621pl.a(new cw().a(sendRequest(new nl(ow.a.f29746a, mj.t, 0L, null, false, 28, null))));
    }
}
