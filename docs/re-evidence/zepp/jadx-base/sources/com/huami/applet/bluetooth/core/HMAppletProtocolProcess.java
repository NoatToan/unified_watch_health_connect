package com.huami.applet.bluetooth.core;

import android.os.RemoteException;
import com.huami.applet.AppletConfig;
import com.huami.applet.ConstantKt;
import com.huami.applet.IMessageListener;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/huami/applet/bluetooth/core/HMAppletProtocolProcess;", "Lcom/huami/applet/bluetooth/core/HMAppletProtocol;", "", "msg", "", "sendMessage", "Lkotlin/Function1;", "", "messageListener", "onMessage", "Lcom/huami/applet/bluetooth/core/FileInfo;", "fileInfo", "Lcom/huami/applet/bluetooth/core/PushListener;", "pushListener", "pushFileToDevice", "Lcom/huami/applet/bluetooth/core/ReceiveListener;", "receiveListener", "addReceiveFileListener", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class HMAppletProtocolProcess implements HMAppletProtocol {
    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void addReceiveFileListener(@NotNull FileInfo fileInfo, @NotNull ReceiveListener receiveListener) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void onMessage(@NotNull final Function1<? super byte[], Unit> messageListener) throws RemoteException {
        AppletConfig.INSTANCE.getMessageManager().registerListener(new IMessageListener.Stub() { // from class: com.huami.applet.bluetooth.core.HMAppletProtocolProcess.onMessage.1

            /* JADX INFO: renamed from: com.huami.applet.bluetooth.core.HMAppletProtocolProcess$onMessage$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "接收到的byteArray为null";
                }
            }

            @Override // com.huami.applet.IMessageListener
            public void onMessage(@Nullable byte[] byteArray) {
                Unit unit;
                if (byteArray == null) {
                    unit = null;
                } else {
                    messageListener.invoke(byteArray);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    HMLog.info(ConstantKt.TAG_MESSAGE, a.a);
                }
            }
        });
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void pushFileToDevice(@NotNull FileInfo fileInfo, @NotNull PushListener pushListener) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public boolean sendMessage(@NotNull byte[] msg) {
        return AppletConfig.INSTANCE.getMessageManager().sendMessage(msg);
    }
}
