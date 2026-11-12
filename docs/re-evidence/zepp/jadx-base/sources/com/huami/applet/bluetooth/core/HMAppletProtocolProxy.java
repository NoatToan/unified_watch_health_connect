package com.huami.applet.bluetooth.core;

import com.huami.applet.ConstantKt;
import com.huami.applet.extension.BooleanExt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\u001d\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0096\u0001J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u0016\u0010\u0014\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/applet/bluetooth/core/HMAppletProtocolProxy;", "Lcom/huami/applet/bluetooth/core/HMAppletProtocol;", "Lcom/huami/applet/bluetooth/core/FileInfo;", "fileInfo", "Lcom/huami/applet/bluetooth/core/ReceiveListener;", "receiveListener", "", "addReceiveFileListener", "Lkotlin/Function1;", "", "messageListener", "onMessage", "Lcom/huami/applet/bluetooth/core/PushListener;", "pushListener", "pushFileToDevice", "msg", "", "sendMessage", "a", "Lcom/huami/applet/bluetooth/core/HMAppletProtocol;", "hmAppletProtocol", "<init>", "(Lcom/huami/applet/bluetooth/core/HMAppletProtocol;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class HMAppletProtocolProxy implements HMAppletProtocol {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMAppletProtocol hmAppletProtocol;

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
            return Intrinsics.stringPlus("Message消息发送成功：", UtilsKt.byteToHexString(this.a));
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
            return Intrinsics.stringPlus("Message消息发送失败：", UtilsKt.byteToHexString(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("消息发送失败：", UtilsKt.byteToHexString(this.a));
        }
    }

    public HMAppletProtocolProxy(@NotNull HMAppletProtocol hMAppletProtocol) {
        this.hmAppletProtocol = hMAppletProtocol;
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void addReceiveFileListener(@NotNull FileInfo fileInfo, @NotNull ReceiveListener receiveListener) {
        this.hmAppletProtocol.addReceiveFileListener(fileInfo, receiveListener);
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void onMessage(@NotNull Function1<? super byte[], Unit> messageListener) {
        this.hmAppletProtocol.onMessage(messageListener);
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public void pushFileToDevice(@NotNull FileInfo fileInfo, @NotNull PushListener pushListener) {
        this.hmAppletProtocol.pushFileToDevice(fileInfo, pushListener);
    }

    @Override // com.huami.applet.bluetooth.core.HMAppletProtocol
    public boolean sendMessage(@NotNull byte[] msg) {
        Object objM3845constructorimpl;
        BooleanExt withData;
        long jNanoTime = System.nanoTime();
        try {
            Result.Companion companion = Result.Companion;
            boolean zSendMessage = this.hmAppletProtocol.sendMessage(msg);
            if (zSendMessage) {
                HMLog.info(ConstantKt.TAG_MESSAGE, new a(msg));
                withData = new WithData(Unit.INSTANCE);
            } else {
                withData = Otherwise.INSTANCE;
            }
            if (withData instanceof Otherwise) {
                HMLog.warn$default(ConstantKt.TAG_MESSAGE, null, new b(msg), 2, null);
            } else {
                if (!(withData instanceof WithData)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((WithData) withData).getData();
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(zSendMessage));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default(ConstantKt.TAG_MESSAGE, null, new c(msg), 2, null);
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        boolean zBooleanValue = ((Boolean) objM3845constructorimpl).booleanValue();
        HMLog.info(ConstantKt.TAG_APPLET, new UtilsKt.AnonymousClass1("bluetooth-sendMessage", System.nanoTime() - jNanoTime));
        return zBooleanValue;
    }
}
