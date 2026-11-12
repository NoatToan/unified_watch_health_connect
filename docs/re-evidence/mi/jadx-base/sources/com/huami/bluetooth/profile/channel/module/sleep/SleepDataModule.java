package com.huami.bluetooth.profile.channel.module.sleep;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.d4;
import defpackage.ls;
import defpackage.ns;
import defpackage.r3;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/SleepDataModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lls;", "loadApi", "", "init", "Lns;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lns;", "api", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 50)
public final class SleepDataModule extends com.huami.bluetooth.profile.channel.module.a {

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lns;", PluginDeviceInfo.FMODEL, "()Lns;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<ns> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ns invoke() {
            return new ns(SleepDataModule.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepDataModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.api = LazyKt__LazyJVMKt.lazy(new a());
        init();
    }

    private final ns getApi() {
        return (ns) this.api.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        getApi().initCallback$bluetooth_release();
    }

    @NotNull
    public final ls loadApi() {
        return getApi();
    }
}
