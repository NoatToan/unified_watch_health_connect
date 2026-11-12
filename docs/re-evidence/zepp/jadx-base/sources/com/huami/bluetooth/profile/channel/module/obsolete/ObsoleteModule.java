package com.huami.bluetooth.profile.channel.module.obsolete;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 144)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u00020\f8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteApi;", "c", "", PointCategory.INIT, "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerListener", "g", "Lkotlin/jvm/functions/Function1;", "", "h", LogUtil.I, "getModule", "()I", "module", "i", "Lkotlin/Lazy;", "getObsoleteApi", "()Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteApi;", "obsoleteApi", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ObsoleteModule extends BaseModule {
    public static final int modelId = 144;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private Function1<? super ChannelResponse, Unit> listener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int module;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy obsoleteApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            ObsoleteModule.this.listener.invoke(channelResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ObsoleteApi> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObsoleteApi invoke() {
            return ObsoleteModule.this.c();
        }
    }

    public ObsoleteModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.listener = b.a;
        this.module = 144;
        this.obsoleteApi = LazyKt__LazyJVMKt.lazy(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ObsoleteApi c() {
        return new ObsoleteApiImpl(this);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return this.module;
    }

    @NotNull
    public final ObsoleteApi getObsoleteApi() {
        return (ObsoleteApi) this.obsoleteApi.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, 144, false, new a(), 2, null);
    }

    public final void registerListener(@NotNull Function1<? super ChannelResponse, Unit> listener) {
        this.listener = listener;
    }
}
