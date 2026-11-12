package com.huami.watch.wififtp;

import android.os.Build;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.netty.util.internal.StringUtil;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferListener;
import it.sauronsoftware.ftp4j.FTPFile;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 W2\u00020\u0001:\u0004WXY\u0003B\u000f\u0012\u0006\u0010T\u001a\u00020\u0001¢\u0006\u0004\bU\u0010VJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005JG\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J'\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\bJ\b\u0010#\u001a\u0004\u0018\u00010\bJ\u0006\u0010$\u001a\u00020\u0010J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b'\u0010(J\u0016\u0010+\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bJ\u000e\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\bJ\u000e\u0010-\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010.\u001a\u00020\u0010J\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0/J\u0006\u00101\u001a\u00020\u0010R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u001a\u00108\u001a\u000605R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010H\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010R\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, d2 = {"Lcom/huami/watch/wififtp/FtpController;", "Lkotlinx/coroutines/CoroutineScope;", "", "a", "setSmallerSendBufferSize", "Lcom/huami/watch/wififtp/IOnFtpCommandListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCmdListener", "", "server", "", "port", "retryCount", "", "perDelayMilli", "charset", "", WifiSetActivity.KEY_CONNECT, "(Ljava/lang/String;IIJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendQuitCommand", ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "userName", "password", "login", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "path", "openDir", "name", "createDir", "subDirName", "openSubDir", "getCurrentPath", "back", "", "Lit/sauronsoftware/ftp4j/FTPFile;", "listFile", "()[Lit/sauronsoftware/ftp4j/FTPFile;", "fromPath", "toPath", "downloadFile", "uploadFile", "deleteFile", "abortCurrentDownload", "Lkotlin/Pair;", "getCurrentDownload", "isConnected", "Lit/sauronsoftware/ftp4j/FTPClient;", "Lit/sauronsoftware/ftp4j/FTPClient;", "ftp", "Lcom/huami/watch/wififtp/FtpController$a;", "b", "Lcom/huami/watch/wififtp/FtpController$a;", "innerTransferListener", "Lcom/huami/watch/wififtp/FtpController$ITransferListener;", "c", "Lcom/huami/watch/wififtp/FtpController$ITransferListener;", "getTransferListener", "()Lcom/huami/watch/wififtp/FtpController$ITransferListener;", "setTransferListener", "(Lcom/huami/watch/wififtp/FtpController$ITransferListener;)V", "transferListener", "Lcom/huami/watch/wififtp/FtpController$IFTPErrorListener;", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/wififtp/FtpController$IFTPErrorListener;", "getErrorListener", "()Lcom/huami/watch/wififtp/FtpController$IFTPErrorListener;", "setErrorListener", "(Lcom/huami/watch/wififtp/FtpController$IFTPErrorListener;)V", "errorListener", "Lcom/huami/watch/wififtp/ReceiveCmdParser;", "e", "Lcom/huami/watch/wififtp/ReceiveCmdParser;", "cmdListener", "f", "Lkotlin/Pair;", "currentTransferFilePath", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "scope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Companion", "IFTPErrorListener", "ITransferListener", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class FtpController implements CoroutineScope {
    private static final String h = "FtpController";
    private static final String i = "192.168.43.1";
    private static final int j = 5210;
    private static final String k = "anonymous";
    private static final String l = "";
    private static final int m = 3;
    private static final long n = 1000;
    private static final long o = 4000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FTPClient ftp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final a innerTransferListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ITransferListener transferListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private IFTPErrorListener errorListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ReceiveCmdParser cmdListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Pair<String, String> currentTransferFilePath;
    private final /* synthetic */ CoroutineScope g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/huami/watch/wififtp/FtpController$IFTPErrorListener;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "onError", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface IFTPErrorListener {
        void onError(@NotNull Exception e);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/watch/wififtp/FtpController$ITransferListener;", "", "", "fromPath", "toPath", "", "onStarted", "", SessionDescription.p, "onTransferred", "onCompleted", "onFailed", "onAborted", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface ITransferListener {
        void onAborted(@NotNull String fromPath, @NotNull String toPath);

        void onCompleted(@NotNull String fromPath, @NotNull String toPath);

        void onFailed(@NotNull String fromPath, @NotNull String toPath);

        void onStarted(@NotNull String fromPath, @NotNull String toPath);

        void onTransferred(@NotNull String fromPath, @NotNull String toPath, int length);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"com/huami/watch/wififtp/FtpController$a", "Lit/sauronsoftware/ftp4j/FTPDataTransferListener;", "", SnoreMonitorActivity.PAGE_STARTED, "", SessionDescription.p, "transferred", com.squareup.picasso.u.D, "failed", "aborted", "", "a", "J", "transPrintTime", "<init>", "(Lcom/huami/watch/wififtp/FtpController;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class a implements FTPDataTransferListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long transPrintTime;

        /* JADX INFO: renamed from: com.huami.watch.wififtp.FtpController$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0678a extends Lambda implements Function0<String> {
            public C0678a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "transfer " + FtpController.this.currentTransferFilePath + " aborted";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "transfer " + FtpController.this.currentTransferFilePath + " completed";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "transfer " + FtpController.this.currentTransferFilePath + " failed";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class d extends Lambda implements Function0<String> {
            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "transfer " + FtpController.this.currentTransferFilePath + " start";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(int i) {
                super(0);
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "transferred " + FtpController.this.currentTransferFilePath + StringUtil.SPACE + this.b;
            }
        }

        public a() {
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void aborted() {
            HMLog.info(FtpController.h, new C0678a());
            String str = (String) FtpController.this.currentTransferFilePath.getFirst();
            String str2 = (String) FtpController.this.currentTransferFilePath.getSecond();
            FtpController.this.currentTransferFilePath = new Pair("", "");
            ITransferListener transferListener = FtpController.this.getTransferListener();
            if (transferListener != null) {
                transferListener.onAborted(str, str2);
            }
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void completed() {
            HMLog.info(FtpController.h, new b());
            String str = (String) FtpController.this.currentTransferFilePath.getFirst();
            String str2 = (String) FtpController.this.currentTransferFilePath.getSecond();
            FtpController.this.currentTransferFilePath = new Pair("", "");
            ITransferListener transferListener = FtpController.this.getTransferListener();
            if (transferListener != null) {
                transferListener.onCompleted(str, str2);
            }
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void failed() {
            HMLog.info(FtpController.h, new c());
            String str = (String) FtpController.this.currentTransferFilePath.getFirst();
            String str2 = (String) FtpController.this.currentTransferFilePath.getSecond();
            FtpController.this.currentTransferFilePath = new Pair("", "");
            ITransferListener transferListener = FtpController.this.getTransferListener();
            if (transferListener != null) {
                transferListener.onFailed(str, str2);
            }
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void started() {
            HMLog.info(FtpController.h, new d());
            ITransferListener transferListener = FtpController.this.getTransferListener();
            if (transferListener != null) {
                transferListener.onStarted((String) FtpController.this.currentTransferFilePath.getFirst(), (String) FtpController.this.currentTransferFilePath.getSecond());
            }
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void transferred(int length) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.transPrintTime > 1000) {
                HMLog.info(FtpController.h, new e(length));
                this.transPrintTime = jCurrentTimeMillis;
            }
            ITransferListener transferListener = FtpController.this.getTransferListener();
            if (transferListener != null) {
                transferListener.onTransferred((String) FtpController.this.currentTransferFilePath.getFirst(), (String) FtpController.this.currentTransferFilePath.getSecond(), length);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "open ftp path: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "abortCurrentDownload: " + FtpController.this.currentTransferFilePath;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "change dir failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "abortCurrentDownload failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "open sub dir failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "go up";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ NetworkInterface b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str, NetworkInterface networkInterface, boolean z) {
            super(0);
            this.a = str;
            this.b = networkInterface;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "check ip " + this.a + "; name: " + this.b.getName() + "; is vpn: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "go up failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "check local ip fail. " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@"}, d2 = {"", "server", "", "port", "retryCount", "", "perDelayMilli", "charset", "Lkotlin/coroutines/Continuation;", "", "continuation", "", WifiSetActivity.KEY_CONNECT}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.FtpController", f = "FtpController.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {65, 68}, m = WifiSetActivity.KEY_CONNECT, n = {"this", "server", "charset", "port", "perDelayMilli", "i", "this", "server", "charset", "port", "perDelayMilli"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "L$0", "L$1", "L$2", "I$0", "J$0"})
    public static final class f extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;
        public Object f;
        public int g;
        public int h;
        public int i;
        public long j;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return FtpController.this.connect(null, 0, 0, 0L, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "upload " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "FTP client is available";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str, Exception exc) {
            super(0);
            this.a = str;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadFile " + this.a + " failed: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "connect to " + this.a + " on " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadFile " + this.a + " success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "connect failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "abruptlyCloseCommunication failed " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "create dir: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "create dir failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, Exception exc) {
            super(0);
            this.a = str;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete file: " + this.a + " failed: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ftp disconnect success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ftp dis connect failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "download " + this.a + " to " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Exception c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2, Exception exc) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "download " + this.a + " to " + this.b + " failed: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "download " + this.a + " success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "open sub dir failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class u extends Lambda implements Function0<String> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "list dir files";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "list dir files failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ftp login failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class x extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "abruptlyCloseCommunication failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@"}, d2 = {"", "userName", "password", "", "retryCount", "", "perDelayMilli", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "login"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.FtpController", f = "FtpController.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {154, 157}, m = "login", n = {"this", "userName", "password", "perDelayMilli", "i", "this", "userName", "password", "perDelayMilli"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class y extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;
        public Object f;
        public long g;
        public int h;
        public int i;

        public y(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return FtpController.this.login(null, null, 0, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class z extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ftp log out failed: " + this.a;
        }
    }

    public FtpController(@NotNull CoroutineScope coroutineScope) {
        this.g = coroutineScope;
        FTPClient fTPClient = new FTPClient();
        this.ftp = fTPClient;
        this.innerTransferListener = new a();
        ReceiveCmdParser receiveCmdParser = new ReceiveCmdParser();
        this.cmdListener = receiveCmdParser;
        this.currentTransferFilePath = new Pair<>("", "");
        fTPClient.setAutoNoopTimeout(o);
        fTPClient.getConnector().setCloseTimeout(15);
        fTPClient.getConnector().setConnectionTimeout(15);
        fTPClient.getConnector().setReadTimeout(15);
        if (Build.VERSION.SDK_INT <= 25) {
            setSmallerSendBufferSize();
        }
        fTPClient.addCommunicationListener(receiveCmdParser);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    private final void a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                        String string = inetAddressNextElement.getHostAddress().toString();
                        boolean z2 = true;
                        if (networkInterfaceNextElement.isUp()) {
                            String name = networkInterfaceNextElement.getName();
                            if (!(StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "tun", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "ppp", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "pptp", false, 2, (Object) null))) {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        HMLog.info(h, new d0(string, networkInterfaceNextElement, z2));
                    }
                }
            }
        } catch (Exception e2) {
            HMLog.info(h, new e0(e2));
        }
    }

    public static /* synthetic */ Object login$default(FtpController ftpController, String str, String str2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "anonymous";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        return ftpController.login(str, str2, continuation);
    }

    public final boolean abortCurrentDownload() {
        HMLog.info(h, new b());
        try {
            this.ftp.abortCurrentDataTransfer(true);
            return true;
        } catch (Exception e2) {
            HMLog.info(h, new c(e2));
            return false;
        }
    }

    public final boolean back() {
        HMLog.info(h, d.a);
        try {
            this.ftp.changeDirectoryUp();
            return true;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new e(e2));
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0086  */
    /* JADX WARN: Code duplicated, block: B:21:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cc -> B:13:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object connect(@org.jetbrains.annotations.NotNull java.lang.String r18, int r19, int r20, long r21, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.watch.wififtp.FtpController.connect(java.lang.String, int, int, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean createDir(@NotNull String name) {
        HMLog.info(h, new k(name));
        try {
            this.ftp.createDirectory(name);
            return true;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new l(e2));
            return false;
        }
    }

    public final boolean deleteFile(@NotNull String path) {
        HMLog.info(h, new m(path));
        try {
            this.ftp.deleteFile(path);
            return true;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new n(path, e2));
            return false;
        }
    }

    @WorkerThread
    public final boolean disconnect(boolean sendQuitCommand) {
        try {
            this.ftp.abortCurrentDataTransfer(false);
            this.ftp.disconnect(sendQuitCommand);
            HMLog.info(h, o.a);
            return true;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new p(e2));
            return false;
        }
    }

    public final boolean downloadFile(@NotNull String fromPath, @NotNull String toPath) {
        HMLog.info(h, new q(fromPath, toPath));
        try {
            this.currentTransferFilePath = new Pair<>(fromPath, toPath);
            this.ftp.download(fromPath, new File(toPath), this.innerTransferListener);
            HMLog.info(h, new s(fromPath));
            return true;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            this.innerTransferListener.failed();
            HMLog.info(h, new r(fromPath, toPath, e2));
            return false;
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.g.getCoroutineContext();
    }

    @NotNull
    public final Pair<String, String> getCurrentDownload() {
        return this.currentTransferFilePath;
    }

    @Nullable
    public final String getCurrentPath() {
        try {
            String strCurrentDirectory = this.ftp.currentDirectory();
            String str = File.separator;
            if (kotlin.text.m.endsWith$default(strCurrentDirectory, str, false, 2, null)) {
                return strCurrentDirectory;
            }
            return strCurrentDirectory + str;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new t(e2));
            return null;
        }
    }

    @Nullable
    public final IFTPErrorListener getErrorListener() {
        return this.errorListener;
    }

    @Nullable
    public final ITransferListener getTransferListener() {
        return this.transferListener;
    }

    public final boolean isConnected() {
        return this.ftp.isConnected();
    }

    @NotNull
    public final FTPFile[] listFile() {
        HMLog.info(h, u.a);
        try {
            return this.ftp.list();
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new v(e2));
            return new FTPFile[0];
        }
    }

    @Nullable
    public final Object login(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        boolean z2;
        try {
            this.ftp.login(str, str2);
            z2 = true;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new w(e2));
            if (this.ftp.isConnected()) {
                try {
                    this.ftp.abruptlyCloseCommunication();
                } catch (Exception e3) {
                    IFTPErrorListener iFTPErrorListener2 = this.errorListener;
                    if (iFTPErrorListener2 != null) {
                        iFTPErrorListener2.onError(e3);
                    }
                    HMLog.info(h, new x(e3));
                }
            }
            z2 = false;
        }
        if (z2) {
            openDir(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        }
        return Boxing.boxBoolean(z2);
    }

    @Nullable
    public final Object logout(@NotNull Continuation<? super Boolean> continuation) {
        try {
            this.ftp.logout();
            return Boxing.boxBoolean(true);
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new z(e2));
            return Boxing.boxBoolean(false);
        }
    }

    public final boolean openDir(@NotNull String path) {
        HMLog.info(h, new a0(path));
        try {
            this.ftp.changeDirectory(path);
            return true;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new b0(e2));
            return false;
        }
    }

    public final boolean openSubDir(@NotNull String subDirName) {
        String str;
        try {
            String strCurrentDirectory = this.ftp.currentDirectory();
            String str2 = File.separator;
            if (kotlin.text.m.endsWith$default(strCurrentDirectory, str2, false, 2, null)) {
                str = strCurrentDirectory + subDirName;
            } else {
                str = strCurrentDirectory + str2 + subDirName;
            }
            return openDir(str);
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new c0(e2));
            return false;
        }
    }

    public final void setCmdListener(@NotNull IOnFtpCommandListener listener) {
        this.cmdListener.setListener(listener);
    }

    public final void setErrorListener(@Nullable IFTPErrorListener iFTPErrorListener) {
        this.errorListener = iFTPErrorListener;
    }

    public final void setSmallerSendBufferSize() {
        this.ftp.setDataSendBufferSize(2048);
    }

    public final void setTransferListener(@Nullable ITransferListener iTransferListener) {
        this.transferListener = iTransferListener;
    }

    public final boolean uploadFile(@NotNull String fromPath) {
        HMLog.info(h, new f0(fromPath));
        try {
            this.currentTransferFilePath = new Pair<>(fromPath, "");
            this.ftp.upload(new File(fromPath), this.innerTransferListener);
            HMLog.info(h, new h0(fromPath));
            return true;
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            this.innerTransferListener.failed();
            HMLog.info(h, new g0(fromPath, e2));
            return false;
        }
    }

    public static /* synthetic */ Object connect$default(FtpController ftpController, String str, int i2, String str2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = "192.168.43.1";
        }
        if ((i3 & 2) != 0) {
            i2 = 5210;
        }
        if ((i3 & 4) != 0) {
            str2 = null;
        }
        return ftpController.connect(str, i2, str2, continuation);
    }

    public static /* synthetic */ Object login$default(FtpController ftpController, String str, String str2, int i2, long j2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = "anonymous";
        }
        String str3 = str;
        if ((i3 & 2) != 0) {
            str2 = "";
        }
        String str4 = str2;
        int i4 = (i3 & 4) != 0 ? 3 : i2;
        if ((i3 & 8) != 0) {
            j2 = 1000;
        }
        return ftpController.login(str3, str4, i4, j2, continuation);
    }

    @Nullable
    public final Object connect(@NotNull String str, int i2, @Nullable String str2, @NotNull Continuation<? super Boolean> continuation) {
        if (this.ftp.isConnected()) {
            HMLog.info(h, g.a);
            return Boxing.boxBoolean(true);
        }
        a();
        try {
            HMLog.info(h, new h(str, i2));
            if (i2 > 0) {
                this.ftp.connect(str, i2);
            } else {
                this.ftp.connect(str);
            }
            this.ftp.setType(2);
            if (str2 != null) {
                this.ftp.setCharset(str2);
            }
            return Boxing.boxBoolean(true);
        } catch (Exception e2) {
            IFTPErrorListener iFTPErrorListener = this.errorListener;
            if (iFTPErrorListener != null) {
                iFTPErrorListener.onError(e2);
            }
            HMLog.info(h, new i(e2));
            if (this.ftp.isConnected()) {
                try {
                    this.ftp.abruptlyCloseCommunication();
                } catch (Exception e3) {
                    IFTPErrorListener iFTPErrorListener2 = this.errorListener;
                    if (iFTPErrorListener2 != null) {
                        iFTPErrorListener2.onError(e3);
                    }
                    HMLog.info(h, new j(e3));
                }
            }
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bb -> B:13:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, int r19, long r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.watch.wififtp.FtpController.login(java.lang.String, java.lang.String, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
