package com.huami.bluetooth.profile.channel.module.connect;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.ConnectParam;
import defpackage.d4;
import defpackage.g5;
import defpackage.g7;
import defpackage.hh;
import defpackage.j5;
import defpackage.le;
import defpackage.nl;
import defpackage.nq;
import defpackage.ol;
import defpackage.qq;
import defpackage.r3;
import defpackage.sd;
import defpackage.t5t;
import defpackage.wj;
import defpackage.y2;
import defpackage.zbt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/ConnectModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "byteArray", "", "onNotify", "([B)V", "connectParamChanged", "data", "onPing", "init", "()V", "Lhh;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerConnectParamListener", "(Lhh;)V", "unregisterConnectParamListener", "Lol;", "Lf5;", "queryConnectParam", "()Lol;", "Lsd;", "type", "Lzbt;", "registerEventListener", "(Lsd;Lzbt;)V", "", "connectParamListener", "Ljava/util/List;", "", "tag", "Ljava/lang/String;", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 21)
public final class ConnectModule extends com.huami.bluetooth.profile.channel.module.a {

    @NotNull
    private final List<hh> connectParamListener;

    @NotNull
    private final g7 handler;

    @NotNull
    private wj listener;

    @NotNull
    private final String tag;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr) {
            super(0);
            this.t = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Connect param is null from raw data(" + y2.c(this.t) + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<byte[], Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ConnectModule.this.onNotify(it);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/huami/bluetooth/profile/channel/module/connect/ConnectModule$c", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return ArraysKt___ArraysKt.first(byteArray) == ArraysKt___ArraysKt.first(g5.b.f18605b.getF34884a()) || ArraysKt___ArraysKt.first(byteArray) == ArraysKt___ArraysKt.first(g5.c.f18606b.getF34884a());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/huami/bluetooth/profile/channel/module/connect/ConnectModule$d", "Lqq;", "Lnl;", "request", "", com.xiaomi.onetrack.api.b.I, "", "predict", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements qq {
        @Override // defpackage.qq
        public boolean predict(@NotNull nl request, @NotNull byte[] response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return ArraysKt___ArraysKt.first(response) == ArraysKt___ArraysKt.first(g5.b.f18605b.getF34884a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.connectParamListener = new ArrayList();
        this.listener = new wj(sd.VDevice, new WeakReference(new zbt() { // from class: be4
            @Override // defpackage.zbt
            public final void a(q1t q1tVar) {
                t5t.d(a.TAG, "Not register listener");
            }
        }));
        this.handler = new g7(new b(), new c());
        this.tag = "ConnectModule";
    }

    private final void connectParamChanged(byte[] byteArray) {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(new j5().decode(byteArray));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        ConnectParam connectParam = (ConnectParam) objM886constructorimpl;
        if (connectParam == null) {
            le.c(this.tag, new a(byteArray));
            return;
        }
        Iterator<T> it = this.connectParamListener.iterator();
        while (it.hasNext()) {
            ((hh) it.next()).a(connectParam);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNotify(byte[] byteArray) {
        byte bFirst = ArraysKt___ArraysKt.first(byteArray);
        if (bFirst == ArraysKt___ArraysKt.first(g5.b.f18605b.getF34884a())) {
            connectParamChanged(byteArray);
            return;
        }
        if (bFirst == ArraysKt___ArraysKt.first(g5.c.f18606b.getF34884a())) {
            onPing(byteArray);
            return;
        }
        t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "Could not handle message:" + y2.c(byteArray));
    }

    private final void onPing(byte[] data) {
        t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "Handle ping event");
        this.listener.a();
        t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "Send pong result:" + com.huami.bluetooth.profile.channel.module.a.syncSendData$default(this, g5.d.f18607b.getF34884a(), 0, 2, null));
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        unregisterDeviceRequestHandler(this.handler);
        registerDeviceRequestHandler(this.handler);
    }

    @NotNull
    public final ol<ConnectParam> queryConnectParam() {
        return new j5().a(sendRequest(new nl(g5.e.f18608b, new d(), 0L, null, false, 28, null)));
    }

    public final void registerConnectParamListener(@NotNull hh listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.connectParamListener.add(listener);
    }

    public final void registerEventListener(@NotNull sd type, @NotNull zbt listener) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = new wj(type, new WeakReference(listener));
    }

    public final void unregisterConnectParamListener(@NotNull hh listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.connectParamListener.remove(listener);
    }
}
