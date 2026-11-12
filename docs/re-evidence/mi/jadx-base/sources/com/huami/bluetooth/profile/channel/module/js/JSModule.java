package com.huami.bluetooth.profile.channel.module.js;

import defpackage.d4;
import defpackage.g7;
import defpackage.ll;
import defpackage.qo;
import defpackage.r3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/js/JSModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "byteArray", "", "onNotify", "Lll;", "messageListener", "registerMessageListener", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 160)
public final class JSModule extends com.huami.bluetooth.profile.channel.module.a {

    @Nullable
    private ll messageListener;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, JSModule.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((JSModule) this.receiver).onNotify(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        registerDeviceRequestHandler(new g7(new a(this), qo.f31685a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNotify(byte[] byteArray) {
        ll llVar = this.messageListener;
        if (llVar != null) {
            llVar.a(byteArray);
        }
    }

    public final void registerMessageListener(@NotNull ll messageListener) {
        Intrinsics.checkNotNullParameter(messageListener, "messageListener");
        this.messageListener = messageListener;
    }
}
