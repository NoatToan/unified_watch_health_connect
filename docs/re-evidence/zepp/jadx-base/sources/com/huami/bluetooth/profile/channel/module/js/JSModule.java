package com.huami.bluetooth.profile.channel.module.js;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.PassPredict;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 160)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/js/JSModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "byteArray", "", "c", "Lcom/huami/bluetooth/profile/channel/module/js/MessageListener;", "messageListener", "registerMessageListener", "g", "Lcom/huami/bluetooth/profile/channel/module/js/MessageListener;", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class JSModule extends BaseModule {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private MessageListener messageListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(JSModule jSModule) {
            super(1, jSModule, JSModule.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((JSModule) this.receiver).c(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    public JSModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        registerDeviceRequestHandler(new DeviceRequestHandler(new a(this), PassPredict.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(byte[] byteArray) {
        MessageListener messageListener = this.messageListener;
        if (messageListener == null) {
            return;
        }
        messageListener.onMessage(byteArray);
    }

    public final void registerMessageListener(@NotNull MessageListener messageListener) {
        this.messageListener = messageListener;
    }
}
