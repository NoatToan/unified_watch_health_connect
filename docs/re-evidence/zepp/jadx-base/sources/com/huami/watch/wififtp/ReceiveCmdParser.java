package com.huami.watch.wififtp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.log.HMLog;
import it.sauronsoftware.ftp4j.FTPCommunicationListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/watch/wififtp/ReceiveCmdParser;", "Lit/sauronsoftware/ftp4j/FTPCommunicationListener;", "", "p0", "", "sent", "received", "Lcom/huami/watch/wififtp/IOnFtpCommandListener;", "a", "Lcom/huami/watch/wififtp/IOnFtpCommandListener;", "getListener", "()Lcom/huami/watch/wififtp/IOnFtpCommandListener;", "setListener", "(Lcom/huami/watch/wififtp/IOnFtpCommandListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", GoogleApiAvailabilityLight.a, "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class ReceiveCmdParser implements FTPCommunicationListener {
    private static final int b = 3;
    private static final String c = "ReceiveCmdParser";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private IOnFtpCommandListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/watch/wififtp/ReceiveCmdParser$a", "", "", "REPLY_CODE_LEN", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ftp receive cmd: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ftp send cmd: " + this.a;
        }
    }

    @Nullable
    public final IOnFtpCommandListener getListener() {
        return this.listener;
    }

    @Override // it.sauronsoftware.ftp4j.FTPCommunicationListener
    public void received(@Nullable String p0) {
        HMLog.info(c, new b(p0));
        int length = p0 != null ? p0.length() : 0;
        if (p0 == null || length < 3) {
            IOnFtpCommandListener iOnFtpCommandListener = this.listener;
            if (iOnFtpCommandListener != null) {
                iOnFtpCommandListener.onParseError(new MalformedServerReplyException("Truncated server reply: " + p0));
                return;
            }
            return;
        }
        try {
            int i = Integer.parseInt(p0.subSequence(0, 3).toString());
            IOnFtpCommandListener iOnFtpCommandListener2 = this.listener;
            if (iOnFtpCommandListener2 != null) {
                iOnFtpCommandListener2.onReply(new FtpCommand(i, p0, false, 4, null));
            }
        } catch (Exception unused) {
            IOnFtpCommandListener iOnFtpCommandListener3 = this.listener;
            if (iOnFtpCommandListener3 != null) {
                iOnFtpCommandListener3.onParseError(new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + p0));
            }
        }
    }

    @Override // it.sauronsoftware.ftp4j.FTPCommunicationListener
    public void sent(@Nullable String p0) {
        HMLog.info(c, new c(p0));
        if (p0 != null) {
            IOnFtpCommandListener iOnFtpCommandListener = this.listener;
            if (iOnFtpCommandListener != null) {
                iOnFtpCommandListener.onSend(new FtpCommand(p0));
                return;
            }
            return;
        }
        IOnFtpCommandListener iOnFtpCommandListener2 = this.listener;
        if (iOnFtpCommandListener2 != null) {
            iOnFtpCommandListener2.onParseError(new MalformedServerReplyException("Truncated server send: " + p0));
        }
    }

    public final void setListener(@Nullable IOnFtpCommandListener iOnFtpCommandListener) {
        this.listener = iOnFtpCommandListener;
    }
}
