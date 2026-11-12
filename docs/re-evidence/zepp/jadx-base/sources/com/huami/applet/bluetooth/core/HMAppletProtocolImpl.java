package com.huami.applet.bluetooth.core;

import com.huami.applet.AppletConfig;
import com.huami.applet.ConstantKt;
import com.huami.applet.utils.UtilsKt;
import com.huami.bluetooth.profile.channel.module.js.JSAppMessageApi;
import com.huami.bluetooth.profile.channel.module.js.MessageListener;
import com.huami.bluetooth.profile.channel.module.js.MessageTransferManager;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/huami/applet/bluetooth/core/HMAppletProtocolImpl;", "Lcom/huami/applet/bluetooth/core/HMAppletProtocol;", "", "msg", "", "sendMessage", "Lkotlin/Function1;", "", "messageListener", "onMessage", "Lcom/huami/applet/bluetooth/core/FileInfo;", "fileInfo", "Lcom/huami/applet/bluetooth/core/PushListener;", "pushListener", "pushFileToDevice", "Lcom/huami/applet/bluetooth/core/ReceiveListener;", "receiveListener", "addReceiveFileListener", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class HMAppletProtocolImpl implements HMAppletProtocol {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "MessageTransferManager loadApi失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "绑定Message通道的onMessage方法失败";
        }
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void addReceiveFileListener(@NotNull FileInfo fileInfo, @NotNull ReceiveListener receiveListener) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void onMessage(@NotNull final Function1<? super byte[], Unit> messageListener) {
        Object objM3845constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.Companion;
            JSAppMessageApi jSAppMessageApiLoadApi = new MessageTransferManager().loadApi(AppletConfig.INSTANCE.getHmBaseDevice());
            if (jSAppMessageApiLoadApi == null) {
                unit = null;
            } else {
                jSAppMessageApiLoadApi.onMessage(new MessageListener() { // from class: com.huami.applet.bluetooth.core.HMAppletProtocolImpl$onMessage$1$1$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ byte[] a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(byte[] bArr) {
                            super(0);
                            this.a = bArr;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return Intrinsics.stringPlus("接收到Message消息：", UtilsKt.byteToHexString(this.a));
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class b extends Lambda implements Function0<String> {
                        public final /* synthetic */ byte[] a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(byte[] bArr) {
                            super(0);
                            this.a = bArr;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return Intrinsics.stringPlus("onMessage内部处理byteArray异常：", UtilsKt.byteToHexString(this.a));
                        }
                    }

                    @Override // com.huami.bluetooth.profile.channel.module.js.MessageListener
                    public void onMessage(@NotNull byte[] byteArr) {
                        Object objM3845constructorimpl2;
                        Function1<byte[], Unit> function1 = messageListener;
                        try {
                            Result.Companion companion2 = Result.Companion;
                            HMLog.info(ConstantKt.TAG_MESSAGE, new a(byteArr));
                            function1.invoke(byteArr);
                            objM3845constructorimpl2 = Result.m3845constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.Companion;
                            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                        if (thM3848exceptionOrNullimpl != null) {
                            HMLog.warn(ConstantKt.TAG_MESSAGE, thM3848exceptionOrNullimpl, new b(byteArr));
                        }
                    }
                });
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                HMLog.error$default(ConstantKt.TAG_MESSAGE, ConstantKt.CODE_MESSAGE, null, a.a, 4, null);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error(ConstantKt.TAG_MESSAGE, ConstantKt.CODE_MESSAGE, thM3848exceptionOrNullimpl, b.a);
        }
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void pushFileToDevice(@NotNull FileInfo fileInfo, @NotNull PushListener pushListener) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public boolean sendMessage(@NotNull byte[] msg) throws Exception {
        JSAppMessageApi jSAppMessageApiLoadApi = new MessageTransferManager().loadApi(AppletConfig.INSTANCE.getHmBaseDevice());
        if (jSAppMessageApiLoadApi == null) {
            return false;
        }
        return jSAppMessageApiLoadApi.sendMessage(msg);
    }
}
