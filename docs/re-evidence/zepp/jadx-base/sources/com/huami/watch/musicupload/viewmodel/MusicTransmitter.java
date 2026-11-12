package com.huami.watch.musicupload.viewmodel;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.adapter.FileInfo;
import com.huami.watch.musicupload.adapter.FileType;
import com.huami.watch.musicupload.fragment.MusicConstant;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.MediaMetadataUtil;
import com.huami.watch.util.StorageUtil;
import com.huami.watch.wififtp.FtpCommand;
import com.huami.watch.wififtp.FtpController;
import com.huami.watch.wififtp.IOnFtpCommandListener;
import com.tekartik.sqflite.Constant;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugins.firebase.crashlytics.Constants;
import it.sauronsoftware.ftp4j.FTPFile;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 a2\u00020\u0001:\u00060bcdefB\u001f\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010^\u001a\u00020\u0001¢\u0006\u0004\b_\u0010`J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001e\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fJ\u0010\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0011J\u000e\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\nJ\u0014\u0010,\u001a\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0*J\u0010\u0010.\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0011J\u0006\u0010/\u001a\u00020\u0011J\u0013\u00100\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u000e\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u00103\u001a\u00020\u0006J\u0013\u00104\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b4\u00101J\u001b\u00105\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u000e\u00108\u001a\u00020\u00112\u0006\u00107\u001a\u00020\bJ\u001b\u00109\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b9\u00106J\u0006\u0010:\u001a\u00020\u0004R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010<R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010?R\u0016\u0010/\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0016\u0010D\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010CR\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010CR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010FR\u0016\u0010I\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010LR\u001a\u0010P\u001a\u00060NR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010OR\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010HR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "", "progress", "", hl.k, "", "filePath", "Lcom/huami/watch/musicupload/viewmodel/TransformTask;", "f", "e", "Ljava/io/File;", "file", "c", "task", "", "i", com.loc.z.j, "h", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/wififtp/FtpController$IFTPErrorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFtpExceptionListener", SessionDescription.p, "setMusicInfoLimitation", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCompleteListener;", "setTransformCompleteListener", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$IFtpErrorListener;", "setErrorListener", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCallback;", "callback", "registerCallback", "unRegisterCallback", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformInterceptor;", "interceptor", "setInterceptor", "ignore", "ignoreUploadedFile", "toAdd", "addTask", "", "toAdds", "addTasks", SnoreListFragment.TYPE_UPLOAD, "startTransform", "isTransferring", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeTask", "removeAll", "b", "l", "(Lcom/huami/watch/musicupload/viewmodel/TransformTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote", "createAndGo2Directory", "g", "getLastUploadFailedCount", "", "Ljava/util/List;", "callbacks", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "tasks", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Z", "needStop", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformInterceptor;", "Lcom/huami/watch/musicupload/viewmodel/TransformTask;", "currentTask", LogUtil.I, "musicInfoCharLimitation", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCompleteListener;", "completeListener", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$IFtpErrorListener;", "cmdErrorListener", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$FtpCmdListener;", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$FtpCmdListener;", "ftpCmdListener", "failedUploadCount", "Landroid/content/Context;", "m", "Landroid/content/Context;", "appContext", "Lcom/huami/watch/wififtp/FtpController;", GoogleApiAvailabilityLight.b, "Lcom/huami/watch/wififtp/FtpController;", "ftpController", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "scope", "<init>", "(Landroid/content/Context;Lcom/huami/watch/wififtp/FtpController;Lkotlinx/coroutines/CoroutineScope;)V", "r", "FtpCmdListener", "IFtpErrorListener", "ITransformCallback", "ITransformCompleteListener", "ITransformInterceptor", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class MusicTransmitter implements CoroutineScope {
    private static final String p = "MusicFtpUploader";
    private static final int q = 5;

    @NotNull
    private static final a r = new a(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean needStop;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean ignoreUploadedFile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ITransformInterceptor interceptor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TransformTask currentTask;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ITransformCompleteListener completeListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private IFtpErrorListener cmdErrorListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final FtpCmdListener ftpCmdListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int failedUploadCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final FtpController ftpController;
    private final /* synthetic */ CoroutineScope o;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<ITransformCallback> callbacks = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConcurrentLinkedQueue<TransformTask> tasks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AtomicBoolean isTransferring = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int musicInfoCharLimitation = 31;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¨\u0006\r"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$FtpCmdListener;", "Lcom/huami/watch/wififtp/IOnFtpCommandListener;", "Lcom/huami/watch/wififtp/FtpCommand;", Constant.h, "", "onSend", "onReply", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "onParseError", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class FtpCmdListener implements IOnFtpCommandListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "parse cmd exception: " + this.a;
            }
        }

        public FtpCmdListener() {
        }

        @Override // com.huami.watch.wififtp.IOnFtpCommandListener
        public void onParseError(@NotNull Exception exception) {
            a unused = MusicTransmitter.r;
            HMLog.info(MusicTransmitter.p, new a(exception));
        }

        @Override // com.huami.watch.wififtp.IOnFtpCommandListener
        public void onReply(@NotNull FtpCommand cmd) {
            if (cmd.getCode() != 452) {
                if (cmd.getCode() == 451) {
                    MusicTransmitter.this.ftpController.setSmallerSendBufferSize();
                }
            } else {
                IFtpErrorListener iFtpErrorListener = MusicTransmitter.this.cmdErrorListener;
                if (iFtpErrorListener != null) {
                    iFtpErrorListener.onError(cmd.getCode());
                }
            }
        }

        @Override // com.huami.watch.wififtp.IOnFtpCommandListener
        public void onSend(@NotNull FtpCommand cmd) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$IFtpErrorListener;", "", "", Constants.EXCEPTION, "", "onError", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface IFtpErrorListener {
        void onError(int exception);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCallback;", "", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "", "progress", "", "onProgressChanged", "onTransferFinish", "onTransferError", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface ITransformCallback {
        void onProgressChanged(@NotNull FileInfo fileInfo, int progress);

        void onTransferError(@NotNull FileInfo fileInfo);

        void onTransferFinish(@NotNull FileInfo fileInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformCompleteListener;", "", "", "onStart", "onComplete", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface ITransformCompleteListener {
        void onComplete();

        void onStart();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¨\u0006\b"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$ITransformInterceptor;", "", "Lcom/huami/watch/wififtp/FtpController;", "ftpController", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "", "needIntercept", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface ITransformInterceptor {
        @WorkerThread
        boolean needIntercept(@NotNull FtpController ftpController, @NotNull FileInfo fileInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/watch/musicupload/viewmodel/MusicTransmitter$a", "", "", "MAX_RETRY_COUNT", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;
        public final /* synthetic */ FileInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(File file, FileInfo fileInfo) {
            super(0);
            this.a = file;
            this.b = fileInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start upload meta info: " + this.a.getName() + " of " + this.b.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "trigger download";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ FileInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(FileInfo fileInfo) {
            super(0);
            this.a = fileInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start upload meta info of " + this.a.getName() + " failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "transfer task is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ FileInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(FileInfo fileInfo) {
            super(0);
            this.a = fileInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start upload " + this.a.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ FileInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FileInfo fileInfo) {
            super(0);
            this.a = fileInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start download " + this.a.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d0 extends Lambda implements Function0<String> {
        public final /* synthetic */ FileInfo a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(FileInfo fileInfo, boolean z) {
            super(0);
            this.a = fileInfo;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "finish upload " + this.a.getName() + " result: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ FileInfo a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FileInfo fileInfo, boolean z) {
            super(0);
            this.a = fileInfo;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "finish download " + this.a.getName() + " result: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082@"}, d2 = {"Lkotlin/coroutines/Continuation;", "", "continuation", "", "checkToTriggerUpload"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicTransmitter", f = "MusicTransmitter.kt", i = {0}, l = {GlMapUtil.DEVICE_DISPLAY_DPI_HIGH}, m = "checkToTriggerUpload", n = {"this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return MusicTransmitter.this.b(this);
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
            return "trigger upload";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "transfer task is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/TransformTask;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lcom/huami/watch/musicupload/viewmodel/TransformTask;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function1<TransformTask, CharSequence> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(TransformTask transformTask) {
                return transformTask.getFileInfo().getName();
            }
        }

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start to upload, tasks: " + CollectionsKt___CollectionsKt.joinToString$default(MusicTransmitter.this.tasks, ";", null, null, 0, null, a.a, 30, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "exit upload as ftp disconnected";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "finish all task";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "already in path: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "创建目录失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save meta info result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082@"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/TransformTask;", "task", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "ignoreFileTask"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicTransmitter", f = "MusicTransmitter.kt", i = {0, 0}, l = {449}, m = "ignoreFileTask", n = {"this", "task"}, s = {"L$0", "L$1"})
    public static final class o extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return MusicTransmitter.this.g(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ FileInfo a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(FileInfo fileInfo, String str) {
            super(0);
            this.a = fileInfo;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "trans file name: " + this.a.getName() + ", size: " + this.a.getSize() + " and all file is " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lit/sauronsoftware/ftp4j/FTPFile;", "it", "", "a", "(Lit/sauronsoftware/ftp4j/FTPFile;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 4, 1})
    public static final class q extends Lambda implements Function1<FTPFile, CharSequence> {
        public static final q a = new q();

        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull FTPFile fTPFile) {
            return "{name: " + fTPFile.getName() + " size: " + fTPFile.getSize() + '}';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ TransformTask a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(TransformTask transformTask) {
            super(0);
            this.a = transformTask;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "task need retry: " + this.a.getNeedRetry() + "; retry time: " + this.a.getRetryTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onTransferred error: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicTransmitter$removeAll$1", f = "MusicTransmitter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public t(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicTransmitter.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (MusicTransmitter.this.isTransferring.get()) {
                MusicTransmitter.this.needStop = true;
                Iterator it2 = MusicTransmitter.this.tasks.iterator();
                while (it2.hasNext()) {
                    ((TransformTask) it2.next()).setState(1);
                }
                MusicTransmitter.this.ftpController.abortCurrentDownload();
            } else {
                MusicTransmitter.this.tasks.clear();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicTransmitter$removeTask$1", f = "MusicTransmitter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ FileInfo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(FileInfo fileInfo, Continuation continuation) {
            super(2, continuation);
            this.c = fileInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicTransmitter.this.new u(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TransformTask transformTaskF = MusicTransmitter.this.f(this.c.getPath());
            Pair<String, String> currentDownload = MusicTransmitter.this.ftpController.getCurrentDownload();
            if (transformTaskF != null) {
                transformTaskF.setState(1);
            }
            if (Intrinsics.areEqual(currentDownload.getFirst(), this.c.getPath())) {
                MusicTransmitter.this.ftpController.abortCurrentDownload();
            } else {
                Iterator it2 = MusicTransmitter.this.tasks.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((TransformTask) it2.next()).getFileInfo().getPath(), this.c.getPath())) {
                        it2.remove();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start transform upload: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicTransmitter$startTransform$2", f = "MusicTransmitter.kt", i = {}, l = {218, 220}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z, Continuation continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MusicTransmitter.this.new w(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.c) {
                    MusicTransmitter musicTransmitter = MusicTransmitter.this;
                    this.a = 1;
                    if (musicTransmitter.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    MusicTransmitter musicTransmitter2 = MusicTransmitter.this;
                    this.a = 2;
                    if (musicTransmitter2.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082@"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/TransformTask;", "task", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "uploadFileInternal"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.MusicTransmitter", f = "MusicTransmitter.kt", i = {0, 0, 0}, l = {356}, m = "uploadFileInternal", n = {"this", "task", "fileInfo"}, s = {"L$0", "L$1", "L$2"})
    public static final class x extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;
        public Object f;

        public x(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return MusicTransmitter.this.l(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "go to " + this.a + " result " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class z extends Lambda implements Function0<String> {
        public final /* synthetic */ FileInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(FileInfo fileInfo) {
            super(0);
            this.a = fileInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ignore file: " + this.a.getName();
        }
    }

    public MusicTransmitter(@NotNull Context context, @NotNull FtpController ftpController, @NotNull CoroutineScope coroutineScope) {
        this.o = coroutineScope;
        this.appContext = context;
        this.ftpController = ftpController;
        FtpCmdListener ftpCmdListener = new FtpCmdListener();
        this.ftpCmdListener = ftpCmdListener;
        ftpController.setCmdListener(ftpCmdListener);
        ftpController.setTransferListener(new FtpController.ITransferListener() { // from class: com.huami.watch.musicupload.viewmodel.MusicTransmitter.1

            /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicTransmitter$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String str) {
                    super(0);
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onAborted " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicTransmitter$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onAborted error: " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicTransmitter$1$c */
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
                    return "onCompleted " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicTransmitter$1$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "on complete error: " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicTransmitter$1$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class e extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(String str) {
                    super(0);
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onFailed " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicTransmitter$1$f */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class f extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onFailed error: " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicTransmitter$1$g */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class g extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(String str) {
                    super(0);
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onStarted " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.MusicTransmitter$1$h */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class h extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onStarted error: " + this.a;
                }
            }

            @Override // com.huami.watch.wififtp.FtpController.ITransferListener
            public void onAborted(@NotNull String fromPath, @NotNull String toPath) {
                a unused = MusicTransmitter.r;
                HMLog.info(MusicTransmitter.p, new a(fromPath));
                TransformTask transformTaskF = MusicTransmitter.this.f(fromPath);
                if (transformTaskF != null) {
                    transformTaskF.setState(1);
                    FileInfo fileInfo = transformTaskF.getFileInfo();
                    Iterator it2 = MusicTransmitter.this.callbacks.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((ITransformCallback) it2.next()).onTransferError(fileInfo);
                        } catch (Exception e2) {
                            a unused2 = MusicTransmitter.r;
                            HMLog.info(MusicTransmitter.p, new b(e2));
                        }
                    }
                }
            }

            @Override // com.huami.watch.wififtp.FtpController.ITransferListener
            public void onCompleted(@NotNull String fromPath, @NotNull String toPath) {
                a unused = MusicTransmitter.r;
                HMLog.info(MusicTransmitter.p, new c(fromPath));
                TransformTask transformTaskF = MusicTransmitter.this.f(fromPath);
                if (transformTaskF != null) {
                    transformTaskF.resetRetry();
                    transformTaskF.setState(2);
                    FileInfo fileInfo = transformTaskF.getFileInfo();
                    Iterator it2 = MusicTransmitter.this.callbacks.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((ITransformCallback) it2.next()).onTransferFinish(fileInfo);
                        } catch (Exception e2) {
                            a unused2 = MusicTransmitter.r;
                            HMLog.info(MusicTransmitter.p, new d(e2));
                        }
                    }
                }
            }

            @Override // com.huami.watch.wififtp.FtpController.ITransferListener
            public void onFailed(@NotNull String fromPath, @NotNull String toPath) {
                a unused = MusicTransmitter.r;
                HMLog.info(MusicTransmitter.p, new e(fromPath));
                TransformTask transformTaskE = MusicTransmitter.this.e(fromPath);
                if (transformTaskE != null) {
                    int retryTime = transformTaskE.getRetryTime();
                    a unused2 = MusicTransmitter.r;
                    transformTaskE.setNeedRetry(retryTime < 5);
                    if (transformTaskE.getNeedRetry()) {
                        return;
                    }
                    transformTaskE.setState(4);
                    FileInfo fileInfo = transformTaskE.getFileInfo();
                    Iterator it2 = MusicTransmitter.this.callbacks.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((ITransformCallback) it2.next()).onTransferError(fileInfo);
                        } catch (Exception e2) {
                            a unused3 = MusicTransmitter.r;
                            HMLog.info(MusicTransmitter.p, new f(e2));
                        }
                    }
                }
            }

            @Override // com.huami.watch.wififtp.FtpController.ITransferListener
            public void onStarted(@NotNull String fromPath, @NotNull String toPath) {
                FileInfo fileInfo;
                a unused = MusicTransmitter.r;
                HMLog.info(MusicTransmitter.p, new g(fromPath));
                TransformTask transformTaskF = MusicTransmitter.this.f(fromPath);
                if (transformTaskF == null || (fileInfo = transformTaskF.getFileInfo()) == null) {
                    return;
                }
                transformTaskF.setTransfored(0L);
                Iterator it2 = MusicTransmitter.this.callbacks.iterator();
                while (it2.hasNext()) {
                    try {
                        ((ITransformCallback) it2.next()).onProgressChanged(fileInfo, 0);
                    } catch (Exception e2) {
                        a unused2 = MusicTransmitter.r;
                        HMLog.info(MusicTransmitter.p, new h(e2));
                    }
                }
            }

            @Override // com.huami.watch.wififtp.FtpController.ITransferListener
            public void onTransferred(@NotNull String fromPath, @NotNull String toPath, int length) {
                FileInfo fileInfo;
                TransformTask transformTaskF = MusicTransmitter.this.f(fromPath);
                if (transformTaskF == null || (fileInfo = transformTaskF.getFileInfo()) == null) {
                    return;
                }
                transformTaskF.setTransfored(transformTaskF.getTransfored() + ((long) length));
                long j2 = 100;
                long transfored = (transformTaskF.getTransfored() * j2) / fileInfo.getSize();
                MusicTransmitter.this.k(fileInfo, transfored <= j2 ? (int) transfored : 100);
            }
        });
    }

    private final TransformTask c(File file) {
        String name = file.getName();
        return new TransformTask(new FileInfo(file.getAbsolutePath(), name, file.length(), FileType.File), name, true, null, 0L, 24, null);
    }

    private final File d(FileInfo fileInfo) {
        MediaMetadataUtil.MediaMetadataInfo mediaMetadataInfo = new MediaMetadataUtil.MediaMetadataInfo(null, null, null, 0L, 15, null);
        mediaMetadataInfo.setFileSize(fileInfo.getSize());
        File file = new File(fileInfo.getPath());
        MediaMetadataUtil.Companion companion = MediaMetadataUtil.INSTANCE;
        MediaMetadataUtil.MediaMetadataInfo mediaMetadataInfoRetrieve = companion.retrieve(file);
        if (this.musicInfoCharLimitation > 0) {
            mediaMetadataInfo.setTitle(companion.truncateString(mediaMetadataInfoRetrieve.getTitle(), this.musicInfoCharLimitation));
            mediaMetadataInfo.setAlbum(companion.truncateString(mediaMetadataInfoRetrieve.getAlbum(), this.musicInfoCharLimitation));
            mediaMetadataInfo.setArtist(companion.truncateString(mediaMetadataInfoRetrieve.getArtist(), this.musicInfoCharLimitation));
        } else {
            mediaMetadataInfo.setTitle(mediaMetadataInfoRetrieve.getTitle());
            mediaMetadataInfo.setAlbum(mediaMetadataInfoRetrieve.getAlbum());
            mediaMetadataInfo.setArtist(mediaMetadataInfoRetrieve.getArtist());
        }
        File externalDataFile = StorageUtil.getExternalDataFile(this.appContext, file.getName() + HMServerDef.RESPONSE_FORMAT);
        String json = new Gson().toJson(mediaMetadataInfo);
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(json, "null cannot be cast to non-null type java.lang.String");
        HMLog.info(p, new n(FilesUtil.saveSafe(json.getBytes(charset), externalDataFile)));
        return externalDataFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransformTask e(String filePath) {
        List<TransformTask> additionTasks;
        FileInfo fileInfo;
        TransformTask transformTask = this.currentTask;
        if (Intrinsics.areEqual((transformTask == null || (fileInfo = transformTask.getFileInfo()) == null) ? null : fileInfo.getPath(), filePath)) {
            return this.currentTask;
        }
        TransformTask transformTask2 = this.currentTask;
        if (transformTask2 == null || (additionTasks = transformTask2.getAdditionTasks()) == null) {
            return null;
        }
        boolean z2 = false;
        if (!additionTasks.isEmpty()) {
            Iterator<T> it2 = additionTasks.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((TransformTask) it2.next()).getFileInfo().getPath(), filePath)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            return this.currentTask;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransformTask f(String filePath) {
        FileInfo fileInfo;
        TransformTask transformTask = this.currentTask;
        if (Intrinsics.areEqual((transformTask == null || (fileInfo = transformTask.getFileInfo()) == null) ? null : fileInfo.getPath(), filePath)) {
            return this.currentTask;
        }
        return null;
    }

    private final boolean h(FileInfo fileInfo) {
        boolean z2 = false;
        if (!this.ignoreUploadedFile) {
            return false;
        }
        FTPFile[] fTPFileArrListFile = this.ftpController.listFile();
        for (FTPFile fTPFile : fTPFileArrListFile) {
            if (Intrinsics.areEqual(fTPFile.getName(), fileInfo.getName()) && fTPFile.getSize() == fileInfo.getSize()) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            HMLog.info(p, new p(fileInfo, ArraysKt___ArraysKt.joinToString$default(fTPFileArrListFile, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, q.a, 30, (Object) null)));
        }
        return z2;
    }

    private final boolean i(TransformTask task) {
        if (task == null) {
            return false;
        }
        HMLog.info(p, new r(task));
        return task.getNeedRetry() && task.getRetryTime() < 5;
    }

    private final void j(TransformTask task) {
        FtpController.ITransferListener transferListener = this.ftpController.getTransferListener();
        if (transferListener != null) {
            transferListener.onFailed(task.getFileInfo().getPath(), task.getToPath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(FileInfo fileInfo, int progress) {
        Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            try {
                ((ITransformCallback) it2.next()).onProgressChanged(fileInfo, progress);
            } catch (Exception e2) {
                HMLog.info(p, new s(e2));
            }
        }
    }

    public static /* synthetic */ void startTransform$default(MusicTransmitter musicTransmitter, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        musicTransmitter.startTransform(z2);
    }

    public final /* synthetic */ Object a(Continuation<? super Unit> continuation) {
        this.needStop = false;
        HMLog.info(p, b.a);
        if (this.tasks.isEmpty()) {
            HMLog.info(p, c.a);
            return Unit.INSTANCE;
        }
        if (this.isTransferring.compareAndSet(false, true)) {
            ITransformCompleteListener iTransformCompleteListener = this.completeListener;
            if (iTransformCompleteListener != null) {
                iTransformCompleteListener.onStart();
            }
            while ((!this.tasks.isEmpty()) && !this.needStop) {
                TransformTask transformTaskPoll = this.tasks.poll();
                if (transformTaskPoll != null) {
                    this.currentTask = transformTaskPoll;
                    if (transformTaskPoll.getState() == 1 || transformTaskPoll.getState() == 2) {
                        this.currentTask = null;
                    } else {
                        transformTaskPoll.setState(3);
                        FileInfo fileInfo = transformTaskPoll.getFileInfo();
                        String path = fileInfo.getPath();
                        HMLog.info(p, new d(fileInfo));
                        HMLog.info(p, new e(fileInfo, this.ftpController.downloadFile(path, transformTaskPoll.getToPath())));
                        transformTaskPoll.setState(2);
                    }
                }
            }
            this.currentTask = null;
            this.isTransferring.set(false);
            ITransformCompleteListener iTransformCompleteListener2 = this.completeListener;
            if (iTransformCompleteListener2 != null) {
                iTransformCompleteListener2.onComplete();
            }
        }
        return Unit.INSTANCE;
    }

    public final void addTask(@NotNull TransformTask toAdd) {
        TransformTask transformTaskF = f(toAdd.getFileInfo().getPath());
        if (transformTaskF != null) {
            toAdd = transformTaskF;
        }
        if (toAdd.getState() == 3) {
            return;
        }
        toAdd.resetRetry();
        if (toAdd.getState() != 0) {
            toAdd.setState(0);
        }
        if (this.tasks.contains(toAdd)) {
            return;
        }
        this.tasks.add(toAdd);
    }

    public final void addTasks(@NotNull List<TransformTask> toAdds) {
        Iterator<T> it2 = toAdds.iterator();
        while (it2.hasNext()) {
            addTask((TransformTask) it2.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object b(Continuation<? super Unit> continuation) {
        f fVar;
        MusicTransmitter musicTransmitter;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.b = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar.b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.needStop = false;
            HMLog.info(p, g.a);
            if (this.tasks.isEmpty()) {
                HMLog.info(p, h.a);
                return Unit.INSTANCE;
            }
            if (this.isTransferring.compareAndSet(false, true)) {
                this.failedUploadCount = 0;
                HMLog.info(p, new i());
                ITransformCompleteListener iTransformCompleteListener = this.completeListener;
                if (iTransformCompleteListener != null) {
                    iTransformCompleteListener.onStart();
                }
                musicTransmitter = this;
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        musicTransmitter = (MusicTransmitter) fVar.d;
        ResultKt.throwOnFailure(obj);
        while ((!musicTransmitter.tasks.isEmpty()) && !musicTransmitter.needStop) {
            if (!musicTransmitter.ftpController.isConnected()) {
                HMLog.info(p, j.a);
                break;
            }
            TransformTask transformTaskPoll = musicTransmitter.tasks.poll();
            if (transformTaskPoll != null) {
                fVar.d = musicTransmitter;
                fVar.b = 1;
                if (musicTransmitter.l(transformTaskPoll, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        HMLog.info(p, k.a);
        musicTransmitter.currentTask = null;
        musicTransmitter.isTransferring.set(false);
        ITransformCompleteListener iTransformCompleteListener2 = musicTransmitter.completeListener;
        if (iTransformCompleteListener2 != null) {
            iTransformCompleteListener2.onComplete();
        }
        return Unit.INSTANCE;
    }

    public final boolean createAndGo2Directory(@NotNull String remote) {
        String strSubstring = remote.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) remote, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, (Object) null) + 1);
        String currentPath = this.ftpController.getCurrentPath();
        if (currentPath == null) {
            currentPath = "";
        }
        if (MusicConstant.INSTANCE.isPathEquals(currentPath, strSubstring)) {
            HMLog.info(p, new l(currentPath));
            return true;
        }
        this.ftpController.openDir(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        if (kotlin.text.m.equals(strSubstring, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, true) || this.ftpController.openDir(strSubstring)) {
            return true;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strSubstring, new String[]{FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE}, false, 0, 6, (Object) null);
        boolean z2 = true;
        int i2 = 0;
        while (z2) {
            String str = (String) listSplit$default.get(i2);
            i2++;
            boolean zOpenDir = this.ftpController.openDir(str);
            if (zOpenDir) {
                z2 = zOpenDir;
            } else {
                z2 = this.ftpController.createDir(str) && this.ftpController.openDir(str);
            }
            HMLog.info(p, m.a);
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object g(TransformTask transformTask, Continuation<? super Unit> continuation) {
        o oVar;
        MusicTransmitter musicTransmitter;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.b = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        Object obj = oVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = oVar.b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            transformTask.setState(2);
            FtpController.ITransferListener transferListener = this.ftpController.getTransferListener();
            if (transferListener != null) {
                transferListener.onStarted(transformTask.getFileInfo().getPath(), "");
            }
            oVar.d = this;
            oVar.e = transformTask;
            oVar.b = 1;
            if (DelayKt.delay(300L, oVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            musicTransmitter = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transformTask = (TransformTask) oVar.e;
            musicTransmitter = (MusicTransmitter) oVar.d;
            ResultKt.throwOnFailure(obj);
        }
        musicTransmitter.k(transformTask.getFileInfo(), 100);
        FtpController.ITransferListener transferListener2 = musicTransmitter.ftpController.getTransferListener();
        if (transferListener2 != null) {
            transferListener2.onCompleted(transformTask.getFileInfo().getPath(), "");
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.o.getCoroutineContext();
    }

    /* JADX INFO: renamed from: getLastUploadFailedCount, reason: from getter */
    public final int getFailedUploadCount() {
        return this.failedUploadCount;
    }

    public final void ignoreUploadedFile(boolean ignore) {
        this.ignoreUploadedFile = ignore;
    }

    public final boolean isTransferring() {
        return this.isTransferring.get();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0112 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0121 -> B:54:0x0123). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final /* synthetic */ java.lang.Object l(com.huami.watch.musicupload.viewmodel.TransformTask r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.watch.musicupload.viewmodel.MusicTransmitter.l(com.huami.watch.musicupload.viewmodel.TransformTask, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void registerCallback(@NotNull ITransformCallback callback) {
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    public final void removeAll() {
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new t(null), 2, null);
    }

    public final void removeTask(@NotNull FileInfo fileInfo) {
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new u(fileInfo, null), 2, null);
    }

    public final void setErrorListener(@Nullable IFtpErrorListener listener) {
        this.cmdErrorListener = listener;
    }

    public final void setFtpExceptionListener(@NotNull FtpController.IFTPErrorListener listener) {
        this.ftpController.setErrorListener(listener);
    }

    public final void setInterceptor(@Nullable ITransformInterceptor interceptor) {
        this.interceptor = interceptor;
    }

    public final void setMusicInfoLimitation(int length) {
        this.musicInfoCharLimitation = length;
    }

    public final void setTransformCompleteListener(@Nullable ITransformCompleteListener listener) {
        this.completeListener = listener;
    }

    public final void startTransform(boolean upload) {
        HMLog.info(p, new v(upload));
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new w(upload, null), 2, null);
    }

    public final void unRegisterCallback(@NotNull ITransformCallback callback) {
        this.callbacks.remove(callback);
    }
}
