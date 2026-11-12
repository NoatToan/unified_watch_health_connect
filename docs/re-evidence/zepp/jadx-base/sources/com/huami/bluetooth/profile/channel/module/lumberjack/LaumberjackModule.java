package com.huami.bluetooth.profile.channel.module.lumberjack;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.lumberjack.impl.LaumberjackApiImpl;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 58)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/LaumberjackModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LaumberjackApi;", "loadApi", "", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackApiImpl;", "g", "Lkotlin/Lazy;", "c", "()Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackApiImpl;", "api", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LaumberjackModule extends BaseModule {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackApiImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LaumberjackApiImpl> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LaumberjackApiImpl invoke() {
            return new LaumberjackApiImpl(LaumberjackModule.this);
        }
    }

    public LaumberjackModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.api = LazyKt__LazyJVMKt.lazy(new a());
        init();
    }

    private final LaumberjackApiImpl c() {
        return (LaumberjackApiImpl) this.api.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        c().initCallback$bluetooth_release();
    }

    @NotNull
    public final LaumberjackApi loadApi() {
        return c();
    }
}
