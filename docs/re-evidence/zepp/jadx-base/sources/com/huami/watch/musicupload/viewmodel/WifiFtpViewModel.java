package com.huami.watch.musicupload.viewmodel;

import android.app.Application;
import android.content.Context;
import android.net.Network;
import android.net.wifi.ScanResult;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.applet.AppletConfig;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.musicupload.ConnectStatus;
import com.huami.watch.musicupload.TransError;
import com.huami.watch.musicupload.fragment.MusicConstant;
import com.huami.watch.musicupload.fragment.MusicConstantKt;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.task.ITask;
import com.huami.watch.task.ResultNoMattersTask;
import com.huami.watch.task.TaskQueue;
import com.huami.watch.util.Event;
import com.huami.watch.wifi.IWifiConnectListener;
import com.huami.watch.wifi.IWifiScanListener;
import com.huami.watch.wifi.IWifiStatusListener;
import com.huami.watch.wifi.ScanObserver;
import com.huami.watch.wifi.Utils;
import com.huami.watch.wifi.WifiConnectionObserver;
import com.huami.watch.wifi.WifiSpirit;
import com.huami.watch.wifi.WifiStatusObserver;
import com.huami.watch.wififtp.FtpController;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ¡\u00012\u00020\u0001:\n?F9¢\u0001N&75ZB\u0013\u0012\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001d\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0006J\u0006\u0010#\u001a\u00020\u0006J\u0013\u0010$\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0006\u00100\u001a\u00020\u0006J\u0013\u00101\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b1\u0010%J=\u00105\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u00104\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b5\u00106J#\u00107\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b7\u00108J+\u00109\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000e\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0002J'\u0010?\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\u0006H\u0014R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010CR\u0019\u0010J\u001a\u00020E8\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010KR\u001a\u0010P\u001a\u00060MR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010S\u001a\u00060QR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010RR\u001a\u0010V\u001a\u00060TR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010UR\u0016\u0010X\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010_\u001a\u00060]R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010^R\u0016\u0010b\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010aR\u001a\u0010e\u001a\u00060cR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010dR\"\u00103\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010f\u001a\u0004\bk\u0010h\"\u0004\bl\u0010jR\u0016\u0010o\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR!\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0p8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010q\u001a\u0004\br\u0010sR$\u0010z\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0{0p8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010q\u001a\u0004\b|\u0010sR\u001f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00020p8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010q\u001a\u0004\b~\u0010sR\u001f\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u008a\u0001\u001a\u00030\u0085\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010WR\u001e\u0010\u0098\u0001\u001a\u00070\u0095\u0001R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010\u009c\u0001\u001a\u00070\u0099\u0001R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006£\u0001"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", TransportUri.ACTION_ADD, "", "status", "", GoogleApiAvailabilityLight.b, com.loc.z.j, "", "name", "password", com.google.android.exoplayer2.text.ttml.b.r, "i", "m", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "device", "setup", "getLastErrorMsg", "getLastFailedTaskCount", "updateWifiName", Status.PRE_CONNECT_STATE_CONNECTED, "setDeviceConnected", "Lcom/huami/watch/musicupload/viewmodel/TransformMode;", "mode", "establishConnection", "startWatchWifi", "stopWatchWifi", "startWatchFtp", "stopWatchFtp", "connectWatchWifi", "disconnectWatchWifi", "connectWatchFtp", "disconnectWatchFtp", "triggerEstablish", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/watch/musicupload/ConnectStatus;", "result", "o", "(Lcom/huami/watch/musicupload/ConnectStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/watch/musicupload/TransError;", "error", "sendTransferError", "(Lcom/huami/watch/musicupload/TransError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, hl.k, "enable", "wifiName", "force", "g", "(ZLjava/lang/String;Ljava/lang/String;Lcom/huami/watch/musicupload/viewmodel/TransformMode;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(ZLcom/huami/watch/musicupload/viewmodel/TransformMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "startManualWifiConnect", "server", "port", "a", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "Lcom/huami/watch/wifi/WifiSpirit;", "Lcom/huami/watch/wifi/WifiSpirit;", "wifiSpirit", "Lcom/huami/watch/wififtp/FtpController;", "b", "Lcom/huami/watch/wififtp/FtpController;", "getFtpController", "()Lcom/huami/watch/wififtp/FtpController;", "ftpController", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "wifiFtpDevice", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$e;", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$e;", "watchWifiListener", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$d;", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$d;", "watchFtpListener", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$g;", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$g;", "wifiScanListener", "Z", "startManualConnectWifi", "Lcom/huami/watch/wifi/WifiConnectionObserver;", "h", "Lcom/huami/watch/wifi/WifiConnectionObserver;", "wifiConnectObserver", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$f;", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$f;", "wifiConnectListener", "Lcom/huami/watch/wifi/WifiStatusObserver;", "Lcom/huami/watch/wifi/WifiStatusObserver;", "wifiStatusObserver", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$h;", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$h;", "wifiStatusListener", "Ljava/lang/String;", "getWifiName", "()Ljava/lang/String;", "setWifiName", "(Ljava/lang/String;)V", "getPassword", "setPassword", "l", LogUtil.I, "connectionStatus", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getEstablishResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "establishResultLiveData", "Lcom/huami/watch/musicupload/ConnectStatus;", "getCurrentConnectStatus", "()Lcom/huami/watch/musicupload/ConnectStatus;", "setCurrentConnectStatus", "(Lcom/huami/watch/musicupload/ConnectStatus;)V", "currentConnectStatus", "Lcom/huami/watch/util/Event;", "getTransferErrorLiveData", "transferErrorLiveData", "getRetryEstablishLiveData", "retryEstablishLiveData", "Ljava/util/concurrent/atomic/AtomicBoolean;", DTransferConstants.SEARCH_KEY, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEstablishConnection", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "r", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "getMusicTransform", "()Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter;", "musicTransform", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$IOperationLogger;", SOAP.XMLNS, "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$IOperationLogger;", "getOperationLogger", "()Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$IOperationLogger;", "setOperationLogger", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$IOperationLogger;)V", "operationLogger", "t", "currentConnect", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$b;", "u", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$b;", "ftpErrorListener", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$c;", "v", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$c;", "ftpExceptionListener", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "C", "IOperationLogger", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class WifiFtpViewModel extends AndroidViewModel {
    private static final int A = 8;
    private static final int B = 16;

    @NotNull
    private static final a C = new a(null);
    private static final String w = "WifiFtpViewModel";
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private WifiSpirit wifiSpirit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FtpController ftpController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private IWifiFtpDevice wifiFtpDevice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final e watchWifiListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final d watchFtpListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final g wifiScanListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean startManualConnectWifi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private WifiConnectionObserver wifiConnectObserver;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final f wifiConnectListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private WifiStatusObserver wifiStatusObserver;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final h wifiStatusListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int connectionStatus;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ConnectStatus> establishResultLiveData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private ConnectStatus currentConnectStatus;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Event<TransError>> transferErrorLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> retryEstablishLiveData;
    public String password;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean isEstablishConnection;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MusicTransmitter musicTransform;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private IOperationLogger operationLogger;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean currentConnect;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final b ftpErrorListener;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final c ftpExceptionListener;
    public String wifiName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel$IOperationLogger;", "", "", "operation", "", "logOperation", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface IOperationLogger {
        void logOperation(@NotNull String operation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpViewModel$a", "", "", "STATUS_CONNECT_TO_WATCH_FTP", LogUtil.I, "STATUS_CONNECT_TO_WATCH_WIFI", "STATUS_PHONE_WIFI_OPEN", "STATUS_WATCH_FTP_OPEN", "STATUS_WATCH_WIFI_OPEN", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "enable ftp return as status already is : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpViewModel$b", "Lcom/huami/watch/musicupload/viewmodel/MusicTransmitter$IFtpErrorListener;", "", Constants.EXCEPTION, "", "onError", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class b implements MusicTransmitter.IFtpErrorListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$FtpErrorListener$onError$1", f = "WifiFtpViewModel.kt", i = {}, l = {753}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return b.this.new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
                    TransError transError = TransError.WatchStorageNotEnough;
                    this.a = 1;
                    if (wifiFtpViewModel.sendTransferError(transError, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
        }

        @Override // com.huami.watch.musicupload.viewmodel.MusicTransmitter.IFtpErrorListener
        public void onError(int exception) {
            if (exception == 452) {
                kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(WifiFtpViewModel.this), Dispatchers.getIO(), null, new a(null), 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "try to set watch ftp enable: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016R*\u0010\f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpViewModel$c", "Lcom/huami/watch/wififtp/FtpController$IFTPErrorListener;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "onError", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "(Ljava/lang/Exception;)V", "lastException", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class c implements FtpController.IFTPErrorListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Exception lastException;

        public c() {
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getLastException() {
            return this.lastException;
        }

        public final void b(@Nullable Exception exc) {
            this.lastException = exc;
        }

        @Override // com.huami.watch.wififtp.FtpController.IFTPErrorListener
        public void onError(@NotNull Exception e) {
            this.lastException = e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(boolean z, boolean z2, boolean z3) {
            super(0);
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set ftp enable: " + this.a + "; return status: " + this.b + "; operation success: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpViewModel$d", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceFtpStatusListener;", "", "enable", "", "onFtpStatusChanged", "Lkotlinx/coroutines/channels/Channel;", "a", "Lkotlinx/coroutines/channels/Channel;", "()Lkotlinx/coroutines/channels/Channel;", "channel", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "waitChannelData", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class d implements IWifiFtpDevice.IDeviceFtpStatusListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Channel<Boolean> channel = ChannelKt.Channel(-1);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final AtomicBoolean waitChannelData = new AtomicBoolean(false);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "watch onFtpStatusChanged: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$WatchFtpStatusListener$onFtpStatusChanged$2", f = "WifiFtpViewModel.kt", i = {}, l = {673}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, Continuation continuation) {
                super(2, continuation);
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return d.this.new b(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Boolean> channelA = d.this.a();
                    Boolean boolBoxBoolean = Boxing.boxBoolean(this.c);
                    this.a = 1;
                    if (channelA.send(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d() {
        }

        @NotNull
        public final Channel<Boolean> a() {
            return this.channel;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicBoolean getWaitChannelData() {
            return this.waitChannelData;
        }

        @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice.IDeviceFtpStatusListener
        public void onFtpStatusChanged(boolean enable) {
            a unused = WifiFtpViewModel.C;
            HMLog.info(WifiFtpViewModel.w, new a(enable));
            String str = enable ? SnoreMonitorActivity.PAGE_STARTED : "stopped";
            IOperationLogger operationLogger = WifiFtpViewModel.this.getOperationLogger();
            if (operationLogger != null) {
                operationLogger.logOperation("watch ftp " + str);
            }
            if (this.waitChannelData.get()) {
                kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(WifiFtpViewModel.this), Dispatchers.getIO(), null, new b(enable, null), 2, null);
                return;
            }
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            a unused2 = WifiFtpViewModel.C;
            wifiFtpViewModel.n(enable, 2);
            if (enable) {
                return;
            }
            WifiFtpViewModel wifiFtpViewModel2 = WifiFtpViewModel.this;
            a unused3 = WifiFtpViewModel.C;
            wifiFtpViewModel2.n(false, 8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$enableWatchFtp$newStatus$1", f = "WifiFtpViewModel.kt", i = {}, l = {TypedValues.PositionType.TYPE_SIZE_PERCENT}, m = "invokeSuspend", n = {}, s = {})
    public static final class d0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public d0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new d0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<Boolean> channelA = WifiFtpViewModel.this.watchFtpListener.a();
                this.a = 1;
                obj = channelA.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpViewModel$e", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceWifiStatusListener;", "", "enable", "", "onWifiStatusChanged", "Lkotlinx/coroutines/channels/Channel;", "a", "Lkotlinx/coroutines/channels/Channel;", "()Lkotlinx/coroutines/channels/Channel;", "channel", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "waitChannelData", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class e implements IWifiFtpDevice.IDeviceWifiStatusListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Channel<Boolean> channel = ChannelKt.Channel(-1);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final AtomicBoolean waitChannelData = new AtomicBoolean(false);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "watch onWifiStatusChanged: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$WatchWifiStatusListener$onWifiStatusChanged$2", f = "WifiFtpViewModel.kt", i = {}, l = {652}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, Continuation continuation) {
                super(2, continuation);
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return e.this.new b(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Boolean> channelA = e.this.a();
                    Boolean boolBoxBoolean = Boxing.boxBoolean(this.c);
                    this.a = 1;
                    if (channelA.send(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public e() {
        }

        @NotNull
        public final Channel<Boolean> a() {
            return this.channel;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicBoolean getWaitChannelData() {
            return this.waitChannelData;
        }

        @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice.IDeviceWifiStatusListener
        public void onWifiStatusChanged(boolean enable) {
            a unused = WifiFtpViewModel.C;
            HMLog.info(WifiFtpViewModel.w, new a(enable));
            String str = enable ? SnoreMonitorActivity.PAGE_STARTED : "stopped";
            IOperationLogger operationLogger = WifiFtpViewModel.this.getOperationLogger();
            if (operationLogger != null) {
                operationLogger.logOperation("watch wifi " + str);
            }
            if (this.waitChannelData.get()) {
                kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(WifiFtpViewModel.this), Dispatchers.getIO(), null, new b(enable, null), 2, null);
                return;
            }
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            a unused2 = WifiFtpViewModel.C;
            wifiFtpViewModel.n(enable, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\u0082@"}, d2 = {"", "enable", "", "wifiName", "password", "Lcom/huami/watch/musicupload/viewmodel/TransformMode;", "mode", "force", "Lkotlin/coroutines/Continuation;", "continuation", "", "enableWatchWifi"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel", f = "WifiFtpViewModel.kt", i = {0, 0}, l = {449}, m = "enableWatchWifi", n = {"this", "enable"}, s = {"L$0", "Z$0"})
    public static final class e0 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public boolean e;

        public e0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WifiFtpViewModel.this.g(false, null, null, null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpViewModel$f", "Lcom/huami/watch/wifi/IWifiConnectListener;", "", "ssid", "", "a", "Landroid/net/Network;", "network", "b", "", "onConnectedTo", "onDisconnected", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class f implements IWifiConnectListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String b;
            public final /* synthetic */ Network c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Network network) {
                super(0);
                this.b = str;
                this.c = network;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "phone wifi onConnect to " + this.b + ", network: " + this.c + ", " + WifiFtpViewModel.this.startManualConnectWifi;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ Network b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Network network) {
                super(0);
                this.a = str;
                this.b = network;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onDisConnect to " + this.a + ", network: " + this.b;
            }
        }

        public f() {
        }

        private final boolean a(String ssid) {
            StringBuilder sb = new StringBuilder();
            sb.append('\"');
            sb.append(WifiFtpViewModel.this.getWifiName());
            sb.append('\"');
            return Intrinsics.areEqual(sb.toString(), ssid) || Intrinsics.areEqual(WifiFtpViewModel.this.getWifiName(), ssid);
        }

        private final boolean b(Network network) {
            return Intrinsics.areEqual(network, WifiFtpViewModel.this.wifiSpirit.getConnectedNet());
        }

        @Override // com.huami.watch.wifi.IWifiConnectListener
        public void onConnectedTo(@Nullable String ssid, @Nullable Network network) {
            a unused = WifiFtpViewModel.C;
            HMLog.info(WifiFtpViewModel.w, new a(ssid, network));
            IOperationLogger operationLogger = WifiFtpViewModel.this.getOperationLogger();
            if (operationLogger != null) {
                operationLogger.logOperation("connect to " + ssid);
            }
            if (WifiFtpViewModel.this.startManualConnectWifi && a(ssid)) {
                WifiFtpViewModel.this.i();
                return;
            }
            if (WifiFtpViewModel.this.startManualConnectWifi || b(network)) {
                return;
            }
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            boolean zA = a(ssid);
            a unused2 = WifiFtpViewModel.C;
            wifiFtpViewModel.n(zA, 4);
        }

        @Override // com.huami.watch.wifi.IWifiConnectListener
        public void onDisconnected(@Nullable String ssid, @Nullable Network network) {
            IOperationLogger operationLogger = WifiFtpViewModel.this.getOperationLogger();
            if (operationLogger != null) {
                operationLogger.logOperation("phone wifi disconnect " + ssid);
            }
            if (a(ssid)) {
                WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
                a unused = WifiFtpViewModel.C;
                wifiFtpViewModel.n(false, 4);
                WifiFtpViewModel wifiFtpViewModel2 = WifiFtpViewModel.this;
                a unused2 = WifiFtpViewModel.C;
                wifiFtpViewModel2.n(false, 8);
            }
            a unused3 = WifiFtpViewModel.C;
            HMLog.info(WifiFtpViewModel.w, new b(ssid, network));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "enable wifi return as status already is : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpViewModel$g", "Lcom/huami/watch/wifi/IWifiScanListener;", "", "onSuccess", "onFailed", "Lkotlinx/coroutines/channels/Channel;", "", "a", "Lkotlinx/coroutines/channels/Channel;", "()Lkotlinx/coroutines/channels/Channel;", "channel", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class g implements IWifiScanListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Channel<Boolean> channel = ChannelKt.Channel$default(0, 1, null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$WifiScanListener$onFailed$1", f = "WifiFtpViewModel.kt", i = {}, l = {694}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return g.this.new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Boolean> channelA = g.this.a();
                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                    this.a = 1;
                    if (channelA.send(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$WifiScanListener$onSuccess$1", f = "WifiFtpViewModel.kt", i = {}, l = {688}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return g.this.new b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Boolean> channelA = g.this.a();
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    this.a = 1;
                    if (channelA.send(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public g() {
        }

        @NotNull
        public final Channel<Boolean> a() {
            return this.channel;
        }

        @Override // com.huami.watch.wifi.IWifiScanListener
        public void onFailed() {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(WifiFtpViewModel.this), Dispatchers.getIO(), null, new a(null), 2, null);
        }

        @Override // com.huami.watch.wifi.IWifiScanListener
        public void onSuccess() {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(WifiFtpViewModel.this), Dispatchers.getIO(), null, new b(null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "try to set watch wifi enable: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpViewModel$h", "Lcom/huami/watch/wifi/IWifiStatusListener;", "", "onWifiEnable", "onWifiDisable", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class h implements IWifiStatusListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "on wifi disable";
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
                return "on wifi enable, " + WifiFtpViewModel.this.startManualConnectWifi;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$WifiStatusListener$onWifiEnable$2", f = "WifiFtpViewModel.kt", i = {}, l = {734}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public c(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return h.this.new c(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
                    this.a = 1;
                    if (wifiFtpViewModel.triggerEstablish(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public h() {
        }

        @Override // com.huami.watch.wifi.IWifiStatusListener
        public void onWifiDisable() {
            a unused = WifiFtpViewModel.C;
            HMLog.info(WifiFtpViewModel.w, a.a);
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            a unused2 = WifiFtpViewModel.C;
            wifiFtpViewModel.n(false, 16);
            WifiFtpViewModel wifiFtpViewModel2 = WifiFtpViewModel.this;
            a unused3 = WifiFtpViewModel.C;
            wifiFtpViewModel2.n(false, 4);
            WifiFtpViewModel wifiFtpViewModel3 = WifiFtpViewModel.this;
            a unused4 = WifiFtpViewModel.C;
            wifiFtpViewModel3.n(false, 8);
        }

        @Override // com.huami.watch.wifi.IWifiStatusListener
        public void onWifiEnable() {
            a unused = WifiFtpViewModel.C;
            HMLog.info(WifiFtpViewModel.w, new b());
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            a unused2 = WifiFtpViewModel.C;
            wifiFtpViewModel.n(true, 16);
            if (WifiFtpViewModel.this.startManualConnectWifi) {
                kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(WifiFtpViewModel.this), Dispatchers.getIO(), null, new c(null), 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(boolean z, boolean z2, boolean z3) {
            super(0);
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set watch wifi enabled: " + this.a + ", current status: " + this.b + "; operation success: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@"}, d2 = {"", "server", "", "port", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "connectToFtp"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel", f = "WifiFtpViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {TypedValues.MotionType.TYPE_PATHMOTION_ARC, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m = "connectToFtp", n = {"this", "server", "success", "retryCount", "port", "this", "server", "success", "retryCount", "port"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class i extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public int i;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WifiFtpViewModel.this.a(null, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$enableWatchWifi$newStatus$1", f = "WifiFtpViewModel.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
    public static final class i0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public i0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new i0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<Boolean> channelA = WifiFtpViewModel.this.watchWifiListener.a();
                this.a = 1;
                obj = channelA.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "try connect ftp and login time: " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j0 extends Lambda implements Function0<String> {
        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "establishConnection status: " + Integer.toString(WifiFtpViewModel.this.connectionStatus, kotlin.text.a.checkRadix(2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Ref.BooleanRef booleanRef, String str, int i) {
            super(0);
            this.a = booleanRef;
            this.b = str;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "connect to ftp result: " + this.a.element + ", server: " + this.b + ", port: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$establishConnection$2", f = "WifiFtpViewModel.kt", i = {}, l = {199, 203, 205, com.baseflow.permissionhandler.m.c, 211, FTPCodes.NAME_SYSTEM_TIME, 217, 221, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, FTPCodes.ENTER_PASSIVE_MODE, AppletConfig.DEFAULT_DEVICE_SOURCE, 232}, m = "invokeSuspend", n = {}, s = {})
    public static final class k0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ TransformMode c;
        public final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(TransformMode transformMode, Context context, Continuation continuation) {
            super(2, continuation);
            this.c = transformMode;
            this.d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new k0(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((k0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0095 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x009e  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00af  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ed A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:51:0x0103 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:54:0x0107  */
        /* JADX WARN: Code duplicated, block: B:56:0x0115 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x011e  */
        /* JADX WARN: Code duplicated, block: B:61:0x012c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:64:0x0130  */
        /* JADX WARN: Code duplicated, block: B:66:0x0141 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:69:0x014a  */
        /* JADX WARN: Code duplicated, block: B:71:0x0158 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:74:0x015c  */
        /* JADX WARN: Code duplicated, block: B:76:0x016a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WifiFtpViewModel wifiFtpViewModel;
            ConnectStatus connectStatus;
            WifiFtpViewModel wifiFtpViewModel2;
            ConnectStatus connectStatus2;
            WifiFtpViewModel wifiFtpViewModel3;
            ConnectStatus connectStatus3;
            WifiFtpViewModel wifiFtpViewModel4;
            ConnectStatus connectStatus4;
            WifiFtpViewModel wifiFtpViewModel5;
            ConnectStatus connectStatus5;
            WifiFtpViewModel wifiFtpViewModel6;
            ConnectStatus connectStatus6;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            switch (this.a) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    WifiFtpViewModel wifiFtpViewModel7 = WifiFtpViewModel.this;
                    a unused = WifiFtpViewModel.C;
                    if (!wifiFtpViewModel7.j(1)) {
                        WifiFtpViewModel wifiFtpViewModel8 = WifiFtpViewModel.this;
                        String wifiName = wifiFtpViewModel8.getWifiName();
                        String password = WifiFtpViewModel.this.getPassword();
                        TransformMode transformMode = this.c;
                        this.a = 1;
                        if (wifiFtpViewModel8.g(false, wifiName, password, transformMode, true, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        WifiFtpViewModel.this.updateWifiName();
                    }
                    WifiFtpViewModel wifiFtpViewModel9 = WifiFtpViewModel.this;
                    String wifiName2 = wifiFtpViewModel9.getWifiName();
                    String password2 = WifiFtpViewModel.this.getPassword();
                    TransformMode transformMode2 = this.c;
                    this.a = 2;
                    obj = WifiFtpViewModel.h(wifiFtpViewModel9, true, wifiName2, password2, transformMode2, false, this, 16, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel = WifiFtpViewModel.this;
                        connectStatus = ConnectStatus.EnableWatchWifiFailed;
                        this.a = 3;
                        if (wifiFtpViewModel.o(connectStatus, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel10 = WifiFtpViewModel.this;
                    Context context = this.d;
                    this.a = 4;
                    obj = wifiFtpViewModel10.e(context, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel2 = WifiFtpViewModel.this;
                        connectStatus2 = ConnectStatus.EnablePhoneWifiFailed;
                        this.a = 5;
                        if (wifiFtpViewModel2.o(connectStatus2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel11 = WifiFtpViewModel.this;
                    Context context2 = this.d;
                    String wifiName3 = wifiFtpViewModel11.getWifiName();
                    String password3 = WifiFtpViewModel.this.getPassword();
                    this.a = 6;
                    obj = wifiFtpViewModel11.c(context2, wifiName3, password3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel3 = WifiFtpViewModel.this;
                        connectStatus3 = ConnectStatus.ConnectWatchWifiFailed;
                        this.a = 7;
                        if (wifiFtpViewModel3.o(connectStatus3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel12 = WifiFtpViewModel.this;
                    TransformMode transformMode3 = this.c;
                    this.a = 8;
                    obj = wifiFtpViewModel12.f(true, transformMode3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel4 = WifiFtpViewModel.this;
                        connectStatus4 = ConnectStatus.EnableWatchFtpFailed;
                        this.a = 9;
                        if (wifiFtpViewModel4.o(connectStatus4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel13 = WifiFtpViewModel.this;
                    this.a = 10;
                    obj = WifiFtpViewModel.b(wifiFtpViewModel13, null, 0, this, 3, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel5 = WifiFtpViewModel.this;
                        connectStatus5 = ConnectStatus.Connected;
                        this.a = 12;
                        if (wifiFtpViewModel5.o(connectStatus5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    wifiFtpViewModel6 = WifiFtpViewModel.this;
                    connectStatus6 = ConnectStatus.ConnectWatchFtpFailed;
                    this.a = 11;
                    if (wifiFtpViewModel6.o(connectStatus6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    WifiFtpViewModel.this.updateWifiName();
                    WifiFtpViewModel wifiFtpViewModel14 = WifiFtpViewModel.this;
                    String wifiName4 = wifiFtpViewModel14.getWifiName();
                    String password4 = WifiFtpViewModel.this.getPassword();
                    TransformMode transformMode4 = this.c;
                    this.a = 2;
                    obj = WifiFtpViewModel.h(wifiFtpViewModel14, true, wifiName4, password4, transformMode4, false, this, 16, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel = WifiFtpViewModel.this;
                        connectStatus = ConnectStatus.EnableWatchWifiFailed;
                        this.a = 3;
                        if (wifiFtpViewModel.o(connectStatus, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel15 = WifiFtpViewModel.this;
                    Context context3 = this.d;
                    this.a = 4;
                    obj = wifiFtpViewModel15.e(context3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel2 = WifiFtpViewModel.this;
                        connectStatus2 = ConnectStatus.EnablePhoneWifiFailed;
                        this.a = 5;
                        if (wifiFtpViewModel2.o(connectStatus2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel16 = WifiFtpViewModel.this;
                    Context context4 = this.d;
                    String wifiName5 = wifiFtpViewModel16.getWifiName();
                    String password5 = WifiFtpViewModel.this.getPassword();
                    this.a = 6;
                    obj = wifiFtpViewModel16.c(context4, wifiName5, password5, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel3 = WifiFtpViewModel.this;
                        connectStatus3 = ConnectStatus.ConnectWatchWifiFailed;
                        this.a = 7;
                        if (wifiFtpViewModel3.o(connectStatus3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel17 = WifiFtpViewModel.this;
                    TransformMode transformMode5 = this.c;
                    this.a = 8;
                    obj = wifiFtpViewModel17.f(true, transformMode5, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel4 = WifiFtpViewModel.this;
                        connectStatus4 = ConnectStatus.EnableWatchFtpFailed;
                        this.a = 9;
                        if (wifiFtpViewModel4.o(connectStatus4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel18 = WifiFtpViewModel.this;
                    this.a = 10;
                    obj = WifiFtpViewModel.b(wifiFtpViewModel18, null, 0, this, 3, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel6 = WifiFtpViewModel.this;
                        connectStatus6 = ConnectStatus.ConnectWatchFtpFailed;
                        this.a = 11;
                        if (wifiFtpViewModel6.o(connectStatus6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    wifiFtpViewModel5 = WifiFtpViewModel.this;
                    connectStatus5 = ConnectStatus.Connected;
                    this.a = 12;
                    if (wifiFtpViewModel5.o(connectStatus5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel = WifiFtpViewModel.this;
                        connectStatus = ConnectStatus.EnableWatchWifiFailed;
                        this.a = 3;
                        if (wifiFtpViewModel.o(connectStatus, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel19 = WifiFtpViewModel.this;
                    Context context5 = this.d;
                    this.a = 4;
                    obj = wifiFtpViewModel19.e(context5, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel2 = WifiFtpViewModel.this;
                        connectStatus2 = ConnectStatus.EnablePhoneWifiFailed;
                        this.a = 5;
                        if (wifiFtpViewModel2.o(connectStatus2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel110 = WifiFtpViewModel.this;
                    Context context6 = this.d;
                    String wifiName6 = wifiFtpViewModel110.getWifiName();
                    String password6 = WifiFtpViewModel.this.getPassword();
                    this.a = 6;
                    obj = wifiFtpViewModel110.c(context6, wifiName6, password6, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel3 = WifiFtpViewModel.this;
                        connectStatus3 = ConnectStatus.ConnectWatchWifiFailed;
                        this.a = 7;
                        if (wifiFtpViewModel3.o(connectStatus3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel111 = WifiFtpViewModel.this;
                    TransformMode transformMode6 = this.c;
                    this.a = 8;
                    obj = wifiFtpViewModel111.f(true, transformMode6, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel4 = WifiFtpViewModel.this;
                        connectStatus4 = ConnectStatus.EnableWatchFtpFailed;
                        this.a = 9;
                        if (wifiFtpViewModel4.o(connectStatus4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel112 = WifiFtpViewModel.this;
                    this.a = 10;
                    obj = WifiFtpViewModel.b(wifiFtpViewModel112, null, 0, this, 3, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel6 = WifiFtpViewModel.this;
                        connectStatus6 = ConnectStatus.ConnectWatchFtpFailed;
                        this.a = 11;
                        if (wifiFtpViewModel6.o(connectStatus6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    wifiFtpViewModel5 = WifiFtpViewModel.this;
                    connectStatus5 = ConnectStatus.Connected;
                    this.a = 12;
                    if (wifiFtpViewModel5.o(connectStatus5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel2 = WifiFtpViewModel.this;
                        connectStatus2 = ConnectStatus.EnablePhoneWifiFailed;
                        this.a = 5;
                        if (wifiFtpViewModel2.o(connectStatus2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel113 = WifiFtpViewModel.this;
                    Context context7 = this.d;
                    String wifiName7 = wifiFtpViewModel113.getWifiName();
                    String password7 = WifiFtpViewModel.this.getPassword();
                    this.a = 6;
                    obj = wifiFtpViewModel113.c(context7, wifiName7, password7, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel3 = WifiFtpViewModel.this;
                        connectStatus3 = ConnectStatus.ConnectWatchWifiFailed;
                        this.a = 7;
                        if (wifiFtpViewModel3.o(connectStatus3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel114 = WifiFtpViewModel.this;
                    TransformMode transformMode7 = this.c;
                    this.a = 8;
                    obj = wifiFtpViewModel114.f(true, transformMode7, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel4 = WifiFtpViewModel.this;
                        connectStatus4 = ConnectStatus.EnableWatchFtpFailed;
                        this.a = 9;
                        if (wifiFtpViewModel4.o(connectStatus4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel115 = WifiFtpViewModel.this;
                    this.a = 10;
                    obj = WifiFtpViewModel.b(wifiFtpViewModel115, null, 0, this, 3, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel6 = WifiFtpViewModel.this;
                        connectStatus6 = ConnectStatus.ConnectWatchFtpFailed;
                        this.a = 11;
                        if (wifiFtpViewModel6.o(connectStatus6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    wifiFtpViewModel5 = WifiFtpViewModel.this;
                    connectStatus5 = ConnectStatus.Connected;
                    this.a = 12;
                    if (wifiFtpViewModel5.o(connectStatus5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel3 = WifiFtpViewModel.this;
                        connectStatus3 = ConnectStatus.ConnectWatchWifiFailed;
                        this.a = 7;
                        if (wifiFtpViewModel3.o(connectStatus3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel116 = WifiFtpViewModel.this;
                    TransformMode transformMode8 = this.c;
                    this.a = 8;
                    obj = wifiFtpViewModel116.f(true, transformMode8, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel4 = WifiFtpViewModel.this;
                        connectStatus4 = ConnectStatus.EnableWatchFtpFailed;
                        this.a = 9;
                        if (wifiFtpViewModel4.o(connectStatus4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel117 = WifiFtpViewModel.this;
                    this.a = 10;
                    obj = WifiFtpViewModel.b(wifiFtpViewModel117, null, 0, this, 3, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel6 = WifiFtpViewModel.this;
                        connectStatus6 = ConnectStatus.ConnectWatchFtpFailed;
                        this.a = 11;
                        if (wifiFtpViewModel6.o(connectStatus6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    wifiFtpViewModel5 = WifiFtpViewModel.this;
                    connectStatus5 = ConnectStatus.Connected;
                    this.a = 12;
                    if (wifiFtpViewModel5.o(connectStatus5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 8:
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel4 = WifiFtpViewModel.this;
                        connectStatus4 = ConnectStatus.EnableWatchFtpFailed;
                        this.a = 9;
                        if (wifiFtpViewModel4.o(connectStatus4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WifiFtpViewModel wifiFtpViewModel118 = WifiFtpViewModel.this;
                    this.a = 10;
                    obj = WifiFtpViewModel.b(wifiFtpViewModel118, null, 0, this, 3, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel6 = WifiFtpViewModel.this;
                        connectStatus6 = ConnectStatus.ConnectWatchFtpFailed;
                        this.a = 11;
                        if (wifiFtpViewModel6.o(connectStatus6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    wifiFtpViewModel5 = WifiFtpViewModel.this;
                    connectStatus5 = ConnectStatus.Connected;
                    this.a = 12;
                    if (wifiFtpViewModel5.o(connectStatus5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 9:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 10:
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        wifiFtpViewModel6 = WifiFtpViewModel.this;
                        connectStatus6 = ConnectStatus.ConnectWatchFtpFailed;
                        this.a = 11;
                        if (wifiFtpViewModel6.o(connectStatus6, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    wifiFtpViewModel5 = WifiFtpViewModel.this;
                    connectStatus5 = ConnectStatus.Connected;
                    this.a = 12;
                    if (wifiFtpViewModel5.o(connectStatus5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 11:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 12:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ftp login result: " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$handleManualWifiConnect$1", f = "WifiFtpViewModel.kt", i = {}, l = {571}, m = "invokeSuspend", n = {}, s = {})
    public static final class l0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public l0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new l0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((l0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
                this.a = 1;
                if (wifiFtpViewModel.triggerEstablish(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "wifiName", "password", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "connectToWatchWifi"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel", f = "WifiFtpViewModel.kt", i = {0, 0, 0, 0}, l = {540}, m = "connectToWatchWifi", n = {"this", "wifiName", "password", "scanObserver"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class m extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;
        public Object f;
        public Object g;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WifiFtpViewModel.this.c(null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$onCleared$1", f = "WifiFtpViewModel.kt", i = {}, l = {635}, m = "invokeSuspend", n = {}, s = {})
    public static final class m0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "start interruptConnection";
            }
        }

        public m0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new m0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a unused = WifiFtpViewModel.C;
                HMLog.info(WifiFtpViewModel.w, a.a);
                WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
                this.a = 1;
                if (wifiFtpViewModel.k(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "already connect to watch wifi";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class n0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "scaned wifi: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "scan operation success: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/wifi/ScanResult;", "it", "", "a", "(Landroid/net/wifi/ScanResult;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 4, 1})
    public static final class o0 extends Lambda implements Function1<ScanResult, CharSequence> {
        public static final o0 a = new o0();

        public o0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull ScanResult scanResult) {
            return scanResult.SSID;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "scan failed, and try to connect";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082@"}, d2 = {"Lcom/huami/watch/musicupload/ConnectStatus;", "result", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "sendEstablishResult"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel", f = "WifiFtpViewModel.kt", i = {0}, l = {339}, m = "sendEstablishResult", n = {"this"}, s = {"L$0"})
    public static final class p0 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;

        public p0(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WifiFtpViewModel.this.o(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$connectToWatchWifi$scanResult$1", f = "WifiFtpViewModel.kt", i = {}, l = {541}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public q(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<Boolean> channelA = WifiFtpViewModel.this.wifiScanListener.a();
                this.a = 1;
                obj = channelA.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class q0 extends Lambda implements Function0<String> {
        public final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(List list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "lack permissions: " + CollectionsKt___CollectionsKt.joinToString$default(this.a, ",", null, null, 0, null, null, 62, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$connectWatchFtp$1", f = "WifiFtpViewModel.kt", i = {}, l = {293, 295}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            this.a = 1;
            obj = WifiFtpViewModel.b(wifiFtpViewModel, null, 0, this, 3, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            WifiFtpViewModel wifiFtpViewModel2 = WifiFtpViewModel.this;
            ConnectStatus connectStatus = ConnectStatus.ConnectWatchFtpFailed;
            this.a = 2;
            if (wifiFtpViewModel2.o(connectStatus, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class r0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "connect to wifi result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$connectWatchWifi$1", f = "WifiFtpViewModel.kt", i = {}, l = {275, 277}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Context context, Continuation continuation) {
            super(2, continuation);
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new s(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            Context context = this.c;
            String wifiName = wifiFtpViewModel.getWifiName();
            String password = WifiFtpViewModel.this.getPassword();
            this.a = 1;
            obj = wifiFtpViewModel.c(context, wifiName, password, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                WifiFtpViewModel wifiFtpViewModel2 = WifiFtpViewModel.this;
                ConnectStatus connectStatus = ConnectStatus.ConnectWatchWifiFailed;
                this.a = 2;
                if (wifiFtpViewModel2.o(connectStatus, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class s0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startManualWifiConnect " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$disconnect$1", f = "WifiFtpViewModel.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "disConnect start and device connected: " + WifiFtpViewModel.this.currentConnect;
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
                return "disConnect end";
            }
        }

        public t(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a unused = WifiFtpViewModel.C;
                HMLog.info(WifiFtpViewModel.w, new a());
                WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
                this.a = 1;
                if (wifiFtpViewModel.k(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            a unused2 = WifiFtpViewModel.C;
            HMLog.info(WifiFtpViewModel.w, b.a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$startWatchFtp$1", f = "WifiFtpViewModel.kt", i = {}, l = {257, 259}, m = "invokeSuspend", n = {}, s = {})
    public static final class t0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ TransformMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(TransformMode transformMode, Continuation continuation) {
            super(2, continuation);
            this.c = transformMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new t0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((t0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            TransformMode transformMode = this.c;
            this.a = 1;
            obj = wifiFtpViewModel.f(true, transformMode, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                WifiFtpViewModel wifiFtpViewModel2 = WifiFtpViewModel.this;
                ConnectStatus connectStatus = ConnectStatus.EnableWatchFtpFailed;
                this.a = 2;
                if (wifiFtpViewModel2.o(connectStatus, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$disconnectWatchFtp$1", f = "WifiFtpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "disconnect ftp result: " + this.a;
            }
        }

        public u(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new u(continuation);
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
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            a unused = WifiFtpViewModel.C;
            if (wifiFtpViewModel.j(8)) {
                boolean zDisconnect = WifiFtpViewModel.this.getFtpController().disconnect(!WifiFtpViewModel.this.getMusicTransform().isTransferring());
                a unused2 = WifiFtpViewModel.C;
                HMLog.info(WifiFtpViewModel.w, new a(zDisconnect));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$startWatchWifi$1", f = "WifiFtpViewModel.kt", i = {}, l = {239, 241}, m = "invokeSuspend", n = {}, s = {})
    public static final class u0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ TransformMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(TransformMode transformMode, Continuation continuation) {
            super(2, continuation);
            this.c = transformMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new u0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((u0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            String wifiName = wifiFtpViewModel.getWifiName();
            String password = WifiFtpViewModel.this.getPassword();
            TransformMode transformMode = this.c;
            this.a = 1;
            obj = WifiFtpViewModel.h(wifiFtpViewModel, true, wifiName, password, transformMode, false, this, 16, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                WifiFtpViewModel wifiFtpViewModel2 = WifiFtpViewModel.this;
                ConnectStatus connectStatus = ConnectStatus.EnableWatchWifiFailed;
                this.a = 2;
                if (wifiFtpViewModel2.o(connectStatus, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$disconnectWatchWifi$1", f = "WifiFtpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "wifi disconnect result: " + this.a;
            }
        }

        public v(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            a unused = WifiFtpViewModel.C;
            if (wifiFtpViewModel.j(4)) {
                boolean zDisconnect = WifiFtpViewModel.this.wifiSpirit.disconnect(0L);
                a unused2 = WifiFtpViewModel.C;
                HMLog.info(WifiFtpViewModel.w, new a(zDisconnect));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$stopWatchFtp$1", f = "WifiFtpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class v0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "close watch ftp result: " + this.a;
            }
        }

        public v0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new v0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((v0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            a unused = WifiFtpViewModel.C;
            if (wifiFtpViewModel.j(2)) {
                boolean zEnableFtp$default = IWifiFtpDevice.DefaultImpls.enableFtp$default(WifiFtpViewModel.this.wifiFtpDevice, false, null, 2, null);
                a unused2 = WifiFtpViewModel.C;
                HMLog.info(WifiFtpViewModel.w, new a(zEnableFtp$default));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class w extends Lambda implements Function0<String> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "phone wifi already enable";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$stopWatchWifi$1", f = "WifiFtpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class w0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "close watch wifi result: " + this.a;
            }
        }

        public w0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiFtpViewModel.this.new w0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((w0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WifiFtpViewModel wifiFtpViewModel = WifiFtpViewModel.this;
            a unused = WifiFtpViewModel.C;
            if (wifiFtpViewModel.j(1)) {
                boolean zDisableWifi = WifiFtpViewModel.this.wifiFtpDevice.disableWifi();
                a unused2 = WifiFtpViewModel.C;
                HMLog.info(WifiFtpViewModel.w, new a(zDisableWifi));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class x extends Lambda implements Function0<String> {
        public static final x a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "try to enable phone wifi";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class x0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device address: " + this.b + "; wifi name: " + WifiFtpViewModel.this.getWifiName() + "; password: " + WifiFtpViewModel.this.getPassword();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "enable phone wifi result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0082@"}, d2 = {"", "enable", "Lcom/huami/watch/musicupload/viewmodel/TransformMode;", "mode", "Lkotlin/coroutines/Continuation;", "continuation", "", "enableWatchFtp"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.musicupload.viewmodel.WifiFtpViewModel", f = "WifiFtpViewModel.kt", i = {0, 0, 0}, l = {504}, m = "enableWatchFtp", n = {"this", "operation", "enable"}, s = {"L$0", "L$1", "Z$0"})
    public static final class z extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;
        public boolean f;

        public z(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return WifiFtpViewModel.this.f(false, null, this);
        }
    }

    public WifiFtpViewModel(@NotNull Application application) {
        super(application);
        FtpController ftpController = new FtpController(ViewModelKt.getViewModelScope(this));
        this.ftpController = ftpController;
        this.watchWifiListener = new e();
        this.watchFtpListener = new d();
        this.wifiScanListener = new g();
        this.wifiConnectListener = new f();
        this.wifiStatusListener = new h();
        this.establishResultLiveData = new MutableLiveData<>();
        this.transferErrorLiveData = new MutableLiveData<>();
        this.retryEstablishLiveData = new MutableLiveData<>();
        this.isEstablishConnection = new AtomicBoolean(false);
        this.musicTransform = new MusicTransmitter(application, ftpController, ViewModelKt.getViewModelScope(this));
        this.currentConnect = true;
        this.ftpErrorListener = new b();
        this.ftpExceptionListener = new c();
    }

    public static /* synthetic */ Object b(WifiFtpViewModel wifiFtpViewModel, String str, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = MusicConstant.FTP_SERVER;
        }
        if ((i3 & 2) != 0) {
            i2 = MusicConstant.FTP_PORT;
        }
        return wifiFtpViewModel.a(str, i2, continuation);
    }

    public static /* synthetic */ void establishConnection$default(WifiFtpViewModel wifiFtpViewModel, Context context, TransformMode transformMode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            transformMode = TransformMode.Music;
        }
        wifiFtpViewModel.establishConnection(context, transformMode);
    }

    public static /* synthetic */ Object h(WifiFtpViewModel wifiFtpViewModel, boolean z2, String str, String str2, TransformMode transformMode, boolean z3, Continuation continuation, int i2, Object obj) {
        return wifiFtpViewModel.g(z2, str, str2, transformMode, (i2 & 16) != 0 ? false : z3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        n(true, 4);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new l0(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(int status) {
        return (this.connectionStatus & status) == status;
    }

    private final void m() {
        HMLog.info(w, new n0(CollectionsKt___CollectionsKt.joinToString$default(this.wifiSpirit.getScanResult(), ";", null, null, 0, null, o0.a, 30, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(boolean add, int status) {
        this.connectionStatus = add ? this.connectionStatus | status : this.connectionStatus & (~status);
    }

    private final boolean p(String name, String password) {
        m();
        boolean zConnectTo = this.wifiSpirit.connectTo(name, password, 20000L, (8 & 8) != 0);
        HMLog.info(w, new r0(zConnectTo));
        return zConnectTo;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:45:0x014e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:48:0x0156  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x010c -> B:42:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0129 -> B:41:0x012a). Please report as a decompilation issue!!! */
    public final /* synthetic */ Object a(String str, int i2, Continuation<? super Boolean> continuation) {
        i iVar;
        WifiFtpViewModel wifiFtpViewModel;
        Object obj;
        Ref.IntRef intRef;
        Ref.BooleanRef booleanRef;
        i iVar2;
        String str2;
        int i3;
        String str3;
        Ref.BooleanRef booleanRef2;
        Ref.IntRef intRef2;
        int i4;
        Ref.BooleanRef booleanRef3;
        boolean z2;
        WifiFtpViewModel wifiFtpViewModel2;
        IOperationLogger iOperationLogger;
        IOperationLogger iOperationLogger2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i5 = iVar.b;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.b = i5 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objLogin = iVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = iVar.b;
        int i7 = 1;
        if (i6 == 0) {
            ResultKt.throwOnFailure(objLogin);
            IOperationLogger iOperationLogger3 = this.operationLogger;
            if (iOperationLogger3 != null) {
                iOperationLogger3.logOperation("start to connect to watch ftp");
            }
            if (j(8)) {
                IOperationLogger iOperationLogger4 = this.operationLogger;
                if (iOperationLogger4 != null) {
                    iOperationLogger4.logOperation("connect to watch ftp success");
                }
                return Boxing.boxBoolean(true);
            }
            Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
            booleanRef4.element = false;
            Ref.IntRef intRef3 = new Ref.IntRef();
            intRef3.element = 0;
            wifiFtpViewModel = this;
            obj = coroutine_suspended;
            intRef = intRef3;
            booleanRef = booleanRef4;
            iVar2 = iVar;
            str2 = str;
            i3 = i2;
            z2 = booleanRef.element;
            if (z2) {
            }
            wifiFtpViewModel2 = wifiFtpViewModel;
            wifiFtpViewModel2.n(z2, 8);
            if (booleanRef.element) {
                iOperationLogger2 = wifiFtpViewModel2.operationLogger;
                if (iOperationLogger2 != null) {
                    iOperationLogger2.logOperation("connect to watch ftp success");
                }
            } else {
                iOperationLogger = wifiFtpViewModel2.operationLogger;
                if (iOperationLogger != null) {
                    iOperationLogger.logOperation("connect to watch ftp failed!!");
                }
            }
            return Boxing.boxBoolean(booleanRef.element);
        }
        if (i6 == 1) {
            i4 = iVar.i;
            booleanRef = (Ref.BooleanRef) iVar.h;
            intRef2 = (Ref.IntRef) iVar.g;
            booleanRef2 = (Ref.BooleanRef) iVar.f;
            str3 = (String) iVar.e;
            wifiFtpViewModel = (WifiFtpViewModel) iVar.d;
            ResultKt.throwOnFailure(objLogin);
            booleanRef.element = ((Boolean) objLogin).booleanValue();
            HMLog.info(w, new k(booleanRef2, str3, i4));
            if (booleanRef2.element) {
                FtpController ftpController = wifiFtpViewModel.ftpController;
                iVar.d = wifiFtpViewModel;
                iVar.e = str3;
                iVar.f = booleanRef2;
                iVar.g = intRef2;
                iVar.h = booleanRef2;
                iVar.i = i4;
                iVar.b = 2;
                objLogin = ftpController.login(MusicConstant.FTP_USER_NAME, "", iVar);
                if (objLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef3 = booleanRef2;
            }
            intRef = intRef2;
            booleanRef = booleanRef2;
            str2 = str3;
            Object obj2 = coroutine_suspended;
            iVar2 = iVar;
            i3 = i4;
            obj = obj2;
            i7 = 1;
            z2 = booleanRef.element;
            if (!z2 || intRef.element >= 3) {
                wifiFtpViewModel2 = wifiFtpViewModel;
                wifiFtpViewModel2.n(z2, 8);
                if (booleanRef.element) {
                    iOperationLogger2 = wifiFtpViewModel2.operationLogger;
                    if (iOperationLogger2 != null) {
                        iOperationLogger2.logOperation("connect to watch ftp success");
                    }
                } else {
                    iOperationLogger = wifiFtpViewModel2.operationLogger;
                    if (iOperationLogger != null) {
                        iOperationLogger.logOperation("connect to watch ftp failed!!");
                    }
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
            HMLog.info(w, new j(intRef));
            intRef.element += i7;
            FtpController ftpController2 = wifiFtpViewModel.ftpController;
            iVar2.d = wifiFtpViewModel;
            iVar2.e = str2;
            iVar2.f = booleanRef;
            iVar2.g = intRef;
            iVar2.h = booleanRef;
            iVar2.i = i3;
            iVar2.b = i7;
            WifiFtpViewModel wifiFtpViewModel3 = wifiFtpViewModel;
            Ref.IntRef intRef4 = intRef;
            Object objConnect = ftpController2.connect((24 & 1) != 0 ? "192.168.43.1" : str2, (24 & 2) != 0 ? 5210 : i3, (24 & 4) != 0 ? 3 : 3, (24 & 8) != 0 ? 1000L : 0L, (24 & 16) != 0 ? null : null, iVar2);
            if (objConnect == obj) {
                return obj;
            }
            str3 = str2;
            wifiFtpViewModel = wifiFtpViewModel3;
            booleanRef2 = booleanRef;
            objLogin = objConnect;
            intRef2 = intRef4;
            Object obj3 = obj;
            i4 = i3;
            iVar = iVar2;
            coroutine_suspended = obj3;
            booleanRef.element = ((Boolean) objLogin).booleanValue();
            HMLog.info(w, new k(booleanRef2, str3, i4));
            if (booleanRef2.element) {
                FtpController ftpController3 = wifiFtpViewModel.ftpController;
                iVar.d = wifiFtpViewModel;
                iVar.e = str3;
                iVar.f = booleanRef2;
                iVar.g = intRef2;
                iVar.h = booleanRef2;
                iVar.i = i4;
                iVar.b = 2;
                objLogin = ftpController3.login(MusicConstant.FTP_USER_NAME, "", iVar);
                if (objLogin == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef3 = booleanRef2;
            }
            intRef = intRef2;
            booleanRef = booleanRef2;
            str2 = str3;
            Object obj4 = coroutine_suspended;
            iVar2 = iVar;
            i3 = i4;
            obj = obj4;
            i7 = 1;
            z2 = booleanRef.element;
            if (z2) {
            }
            wifiFtpViewModel2 = wifiFtpViewModel;
            wifiFtpViewModel2.n(z2, 8);
            if (booleanRef.element) {
                iOperationLogger2 = wifiFtpViewModel2.operationLogger;
                if (iOperationLogger2 != null) {
                    iOperationLogger2.logOperation("connect to watch ftp success");
                }
            } else {
                iOperationLogger = wifiFtpViewModel2.operationLogger;
                if (iOperationLogger != null) {
                    iOperationLogger.logOperation("connect to watch ftp failed!!");
                }
            }
            return Boxing.boxBoolean(booleanRef.element);
        }
        if (i6 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i4 = iVar.i;
        booleanRef3 = (Ref.BooleanRef) iVar.h;
        intRef2 = (Ref.IntRef) iVar.g;
        booleanRef2 = (Ref.BooleanRef) iVar.f;
        str3 = (String) iVar.e;
        wifiFtpViewModel = (WifiFtpViewModel) iVar.d;
        ResultKt.throwOnFailure(objLogin);
        booleanRef3.element = ((Boolean) objLogin).booleanValue();
        HMLog.info(w, new l(booleanRef2));
        intRef = intRef2;
        booleanRef = booleanRef2;
        str2 = str3;
        Object obj5 = coroutine_suspended;
        iVar2 = iVar;
        i3 = i4;
        obj = obj5;
        i7 = 1;
        z2 = booleanRef.element;
        if (z2) {
        }
        wifiFtpViewModel2 = wifiFtpViewModel;
        wifiFtpViewModel2.n(z2, 8);
        if (booleanRef.element) {
            iOperationLogger2 = wifiFtpViewModel2.operationLogger;
            if (iOperationLogger2 != null) {
                iOperationLogger2.logOperation("connect to watch ftp success");
            }
        } else {
            iOperationLogger = wifiFtpViewModel2.operationLogger;
            if (iOperationLogger != null) {
                iOperationLogger.logOperation("connect to watch ftp failed!!");
            }
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object c(Context context, String str, String str2, Continuation<? super Boolean> continuation) {
        m mVar;
        WifiFtpViewModel wifiFtpViewModel;
        ScanObserver scanObserver;
        ScanObserver scanObserver2;
        boolean zP;
        IOperationLogger iOperationLogger;
        IOperationLogger iOperationLogger2;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.b = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object obj = mVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            IOperationLogger iOperationLogger3 = this.operationLogger;
            if (iOperationLogger3 != null) {
                iOperationLogger3.logOperation("start to connect to watch wifi");
            }
            if (j(4)) {
                IOperationLogger iOperationLogger4 = this.operationLogger;
                if (iOperationLogger4 != null) {
                    iOperationLogger4.logOperation("connect to watch wifi success");
                }
                HMLog.info(w, n.a);
                return Boxing.boxBoolean(true);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                scanObserver = new ScanObserver(context, this.wifiScanListener);
                scanObserver.startObserve(5000L);
                if (this.wifiSpirit.tryToScan()) {
                    q qVar = new q(null);
                    mVar.d = this;
                    mVar.e = str;
                    mVar.f = str2;
                    mVar.g = scanObserver;
                    mVar.b = 1;
                    Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(5000L, qVar, mVar);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wifiFtpViewModel = this;
                    obj = objWithTimeoutOrNull;
                    scanObserver2 = scanObserver;
                } else {
                    HMLog.info(w, p.a);
                    wifiFtpViewModel = this;
                }
                scanObserver.stopObserve();
            } else {
                wifiFtpViewModel = this;
            }
            zP = wifiFtpViewModel.p(str, str2);
            if (zP) {
                iOperationLogger2 = wifiFtpViewModel.operationLogger;
                if (iOperationLogger2 != null) {
                    iOperationLogger2.logOperation("connect to watch wifi success");
                }
                wifiFtpViewModel.n(true, 4);
            } else {
                iOperationLogger = wifiFtpViewModel.operationLogger;
                if (iOperationLogger != null) {
                    iOperationLogger.logOperation("connect to watch wifi failed");
                }
            }
            return Boxing.boxBoolean(zP);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        scanObserver2 = (ScanObserver) mVar.g;
        str2 = (String) mVar.f;
        str = (String) mVar.e;
        wifiFtpViewModel = (WifiFtpViewModel) mVar.d;
        ResultKt.throwOnFailure(obj);
        HMLog.info(w, new o((Boolean) obj));
        scanObserver = scanObserver2;
        scanObserver.stopObserve();
        zP = wifiFtpViewModel.p(str, str2);
        if (zP) {
            iOperationLogger2 = wifiFtpViewModel.operationLogger;
            if (iOperationLogger2 != null) {
                iOperationLogger2.logOperation("connect to watch wifi success");
            }
            wifiFtpViewModel.n(true, 4);
        } else {
            iOperationLogger = wifiFtpViewModel.operationLogger;
            if (iOperationLogger != null) {
                iOperationLogger.logOperation("connect to watch wifi failed");
            }
        }
        return Boxing.boxBoolean(zP);
    }

    public final void connectWatchFtp() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new r(null), 2, null);
    }

    public final void connectWatchWifi(@NotNull Context context) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new s(context, null), 2, null);
    }

    public final void disconnect() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new t(null), 2, null);
    }

    public final void disconnectWatchFtp() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new u(null), 2, null);
    }

    public final void disconnectWatchWifi() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new v(null), 2, null);
    }

    public final /* synthetic */ Object e(Context context, Continuation<? super Boolean> continuation) {
        IOperationLogger iOperationLogger = this.operationLogger;
        if (iOperationLogger != null) {
            iOperationLogger.logOperation("start to enable phone wifi");
        }
        n(this.wifiSpirit.isWifiEnable(), 16);
        if (j(16)) {
            IOperationLogger iOperationLogger2 = this.operationLogger;
            if (iOperationLogger2 != null) {
                iOperationLogger2.logOperation("enable phone wifi success");
            }
            HMLog.info(w, w.a);
            return Boxing.boxBoolean(true);
        }
        HMLog.info(w, x.a);
        boolean zEnableWifi = this.wifiSpirit.enableWifi(context, true, 5000L);
        HMLog.info(w, new y(zEnableWifi));
        if (zEnableWifi) {
            IOperationLogger iOperationLogger3 = this.operationLogger;
            if (iOperationLogger3 != null) {
                iOperationLogger3.logOperation("enable phone wifi success");
            }
            n(true, 16);
        } else {
            IOperationLogger iOperationLogger4 = this.operationLogger;
            if (iOperationLogger4 != null) {
                iOperationLogger4.logOperation("enable phone wifi failed!!");
            }
        }
        return Boxing.boxBoolean(zEnableWifi);
    }

    public final void establishConnection(@NotNull Context context, @NotNull TransformMode mode) {
        HMLog.info(w, new j0());
        if (this.isEstablishConnection.compareAndSet(false, true)) {
            m();
            MusicConstantKt.put(this.retryEstablishLiveData, Boolean.FALSE);
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new k0(mode, context, null), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object f(boolean z2, TransformMode transformMode, Continuation<? super Boolean> continuation) {
        z zVar;
        WifiFtpViewModel wifiFtpViewModel;
        String str;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i2 = zVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.b = i2 - Integer.MIN_VALUE;
            } else {
                zVar = new z(continuation);
            }
        } else {
            zVar = new z(continuation);
        }
        Object obj = zVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = zVar.b;
        boolean z3 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = z2 ? "enable" : WatchFaceApi.CUSTOMIZABLE_DISABLE;
            IOperationLogger iOperationLogger = this.operationLogger;
            if (iOperationLogger != null) {
                iOperationLogger.logOperation("start to " + str2 + " watch ftp");
            }
            if ((z2 && j(2)) || (!z2 && !j(2))) {
                IOperationLogger iOperationLogger2 = this.operationLogger;
                if (iOperationLogger2 != null) {
                    iOperationLogger2.logOperation(str2 + " watch ftp success");
                }
                HMLog.info(w, new a0(z2));
                return Boxing.boxBoolean(true);
            }
            HMLog.info(w, new b0(z2));
            this.watchFtpListener.getWaitChannelData().set(true);
            if (!this.wifiFtpDevice.enableFtp(z2, transformMode)) {
                IOperationLogger iOperationLogger3 = this.operationLogger;
                if (iOperationLogger3 != null) {
                    iOperationLogger3.logOperation(str2 + " watch ftp failed");
                }
                this.watchFtpListener.getWaitChannelData().set(false);
                return Boxing.boxBoolean(false);
            }
            d0 d0Var = new d0(null);
            zVar.d = this;
            zVar.e = str2;
            zVar.f = z2;
            zVar.b = 1;
            Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, d0Var, zVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            wifiFtpViewModel = this;
            String str3 = str2;
            obj = objWithTimeoutOrNull;
            str = str3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = zVar.f;
            str = (String) zVar.e;
            wifiFtpViewModel = (WifiFtpViewModel) zVar.d;
            ResultKt.throwOnFailure(obj);
        }
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        wifiFtpViewModel.watchFtpListener.getWaitChannelData().set(false);
        if ((zBooleanValue && z2) || (!zBooleanValue && !z2)) {
            z3 = true;
        }
        if (z3) {
            IOperationLogger iOperationLogger4 = wifiFtpViewModel.operationLogger;
            if (iOperationLogger4 != null) {
                iOperationLogger4.logOperation(str + " watch ftp success");
            }
            wifiFtpViewModel.n(z2, 2);
        } else {
            IOperationLogger iOperationLogger5 = wifiFtpViewModel.operationLogger;
            if (iOperationLogger5 != null) {
                iOperationLogger5.logOperation(str + " watch ftp failed");
            }
        }
        HMLog.info(w, new c0(z2, zBooleanValue, z3));
        return Boxing.boxBoolean(z3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object g(boolean z2, String str, String str2, TransformMode transformMode, boolean z3, Continuation<? super Boolean> continuation) {
        e0 e0Var;
        WifiFtpViewModel wifiFtpViewModel;
        if (continuation instanceof e0) {
            e0Var = (e0) continuation;
            int i2 = e0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.b = i2 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(continuation);
            }
        } else {
            e0Var = new e0(continuation);
        }
        Object objWithTimeoutOrNull = e0Var.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = e0Var.b;
        boolean z4 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            IOperationLogger iOperationLogger = this.operationLogger;
            if (iOperationLogger != null) {
                iOperationLogger.logOperation("start to enable watch wifi, wifi name: " + str + ", password: " + str2);
            }
            if (((z2 && j(1)) || !(z2 || j(1))) && !z3) {
                IOperationLogger iOperationLogger2 = this.operationLogger;
                if (iOperationLogger2 != null) {
                    iOperationLogger2.logOperation("enable watch wifi success");
                }
                HMLog.info(w, new f0(z2));
                return Boxing.boxBoolean(true);
            }
            HMLog.info(w, new g0(z2));
            this.watchWifiListener.getWaitChannelData().set(true);
            if (!(z2 ? this.wifiFtpDevice.enableWifi(str, str2, transformMode) : this.wifiFtpDevice.disableWifi())) {
                IOperationLogger iOperationLogger3 = this.operationLogger;
                if (iOperationLogger3 != null) {
                    iOperationLogger3.logOperation("enable watch wifi failed!!");
                }
                this.watchWifiListener.getWaitChannelData().set(false);
                return Boxing.boxBoolean(false);
            }
            i0 i0Var = new i0(null);
            e0Var.d = this;
            e0Var.e = z2;
            e0Var.b = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, i0Var, e0Var);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            wifiFtpViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = e0Var.e;
            wifiFtpViewModel = (WifiFtpViewModel) e0Var.d;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
        }
        Boolean bool = (Boolean) objWithTimeoutOrNull;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        wifiFtpViewModel.watchWifiListener.getWaitChannelData().set(false);
        if ((zBooleanValue && z2) || (!zBooleanValue && !z2)) {
            z4 = true;
        }
        HMLog.info(w, new h0(z2, zBooleanValue, z4));
        if (z4) {
            IOperationLogger iOperationLogger4 = wifiFtpViewModel.operationLogger;
            if (iOperationLogger4 != null) {
                iOperationLogger4.logOperation("enable watch wifi success");
            }
            wifiFtpViewModel.n(z2, 1);
        } else {
            IOperationLogger iOperationLogger5 = wifiFtpViewModel.operationLogger;
            if (iOperationLogger5 != null) {
                iOperationLogger5.logOperation("enable watch wifi failed!!");
            }
        }
        return Boxing.boxBoolean(z4);
    }

    @Nullable
    public final ConnectStatus getCurrentConnectStatus() {
        return this.currentConnectStatus;
    }

    @NotNull
    public final MutableLiveData<ConnectStatus> getEstablishResultLiveData() {
        return this.establishResultLiveData;
    }

    @NotNull
    public final FtpController getFtpController() {
        return this.ftpController;
    }

    @NotNull
    public final String getLastErrorMsg() {
        String string;
        Exception lastException = this.ftpExceptionListener.getLastException();
        return (lastException == null || (string = lastException.toString()) == null) ? "unknown" : string;
    }

    public final int getLastFailedTaskCount() {
        return this.musicTransform.getFailedUploadCount();
    }

    @NotNull
    public final MusicTransmitter getMusicTransform() {
        return this.musicTransform;
    }

    @Nullable
    public final IOperationLogger getOperationLogger() {
        return this.operationLogger;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final MutableLiveData<Boolean> getRetryEstablishLiveData() {
        return this.retryEstablishLiveData;
    }

    @NotNull
    public final MutableLiveData<Event<TransError>> getTransferErrorLiveData() {
        return this.transferErrorLiveData;
    }

    @NotNull
    public final String getWifiName() {
        return this.wifiName;
    }

    @NotNull
    /* JADX INFO: renamed from: isEstablishConnection, reason: from getter */
    public final AtomicBoolean getIsEstablishConnection() {
        return this.isEstablishConnection;
    }

    public final /* synthetic */ Object k(Continuation<? super Unit> continuation) {
        ResultNoMattersTask resultNoMattersTask = new ResultNoMattersTask(new ITask() { // from class: com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$interruptConnection$disConnectFtpTask$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "start to disconnect ftp";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.BooleanRef a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Ref.BooleanRef booleanRef) {
                    super(0);
                    this.a = booleanRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "disconnect ftp result: " + this.a.element;
                }
            }

            @Override // com.huami.watch.task.ITask
            public boolean runTask() {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                WifiFtpViewModel wifiFtpViewModel = this.a;
                WifiFtpViewModel.a unused = WifiFtpViewModel.C;
                if (wifiFtpViewModel.j(8)) {
                    WifiFtpViewModel.a unused2 = WifiFtpViewModel.C;
                    HMLog.info("WifiFtpViewModel", a.a);
                    booleanRef.element = this.a.getFtpController().disconnect(true ^ this.a.getMusicTransform().isTransferring());
                    WifiFtpViewModel.a unused3 = WifiFtpViewModel.C;
                    HMLog.info("WifiFtpViewModel", new b(booleanRef));
                }
                return booleanRef.element;
            }
        });
        ResultNoMattersTask resultNoMattersTask2 = new ResultNoMattersTask(new ITask() { // from class: com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$interruptConnection$disableFtpTask$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.BooleanRef a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Ref.BooleanRef booleanRef) {
                    super(0);
                    this.a = booleanRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "close watch ftp result: " + this.a.element;
                }
            }

            @Override // com.huami.watch.task.ITask
            public boolean runTask() {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                WifiFtpViewModel wifiFtpViewModel = this.a;
                WifiFtpViewModel.a unused = WifiFtpViewModel.C;
                if (wifiFtpViewModel.j(2)) {
                    booleanRef.element = IWifiFtpDevice.DefaultImpls.enableFtp$default(this.a.wifiFtpDevice, false, null, 2, null);
                    WifiFtpViewModel.a unused2 = WifiFtpViewModel.C;
                    HMLog.info("WifiFtpViewModel", new a(booleanRef));
                    if (booleanRef.element) {
                        WifiFtpViewModel wifiFtpViewModel2 = this.a;
                        WifiFtpViewModel.a unused3 = WifiFtpViewModel.C;
                        wifiFtpViewModel2.n(false, 2);
                    }
                }
                return booleanRef.element;
            }
        });
        ResultNoMattersTask resultNoMattersTask3 = new ResultNoMattersTask(new ITask() { // from class: com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$interruptConnection$disconnectWifiTask$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.BooleanRef a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Ref.BooleanRef booleanRef) {
                    super(0);
                    this.a = booleanRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "wifi disconnect result: " + this.a.element;
                }
            }

            @Override // com.huami.watch.task.ITask
            public boolean runTask() {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                WifiFtpViewModel wifiFtpViewModel = this.a;
                WifiFtpViewModel.a unused = WifiFtpViewModel.C;
                if (wifiFtpViewModel.j(4)) {
                    booleanRef.element = this.a.wifiSpirit.disconnect(0L);
                    WifiFtpViewModel.a unused2 = WifiFtpViewModel.C;
                    HMLog.info("WifiFtpViewModel", new a(booleanRef));
                }
                return booleanRef.element;
            }
        });
        ResultNoMattersTask resultNoMattersTask4 = new ResultNoMattersTask(new ITask() { // from class: com.huami.watch.musicupload.viewmodel.WifiFtpViewModel$interruptConnection$closeWatchWifiTask$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.BooleanRef a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Ref.BooleanRef booleanRef) {
                    super(0);
                    this.a = booleanRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "close watch wifi result: " + this.a.element;
                }
            }

            @Override // com.huami.watch.task.ITask
            public boolean runTask() {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                WifiFtpViewModel wifiFtpViewModel = this.a;
                WifiFtpViewModel.a unused = WifiFtpViewModel.C;
                if (wifiFtpViewModel.j(1)) {
                    booleanRef.element = this.a.wifiFtpDevice.disableWifi();
                    WifiFtpViewModel.a unused2 = WifiFtpViewModel.C;
                    HMLog.info("WifiFtpViewModel", new a(booleanRef));
                    if (booleanRef.element) {
                        WifiFtpViewModel wifiFtpViewModel2 = this.a;
                        WifiFtpViewModel.a unused3 = WifiFtpViewModel.C;
                        wifiFtpViewModel2.n(false, 1);
                    }
                }
                return booleanRef.element;
            }
        });
        (this.musicTransform.isTransferring() ? TaskQueue.INSTANCE.of(resultNoMattersTask2, resultNoMattersTask3, resultNoMattersTask4, resultNoMattersTask) : TaskQueue.INSTANCE.of(resultNoMattersTask, resultNoMattersTask2, resultNoMattersTask3, resultNoMattersTask4)).runTasks();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object o(ConnectStatus connectStatus, Continuation<? super Unit> continuation) {
        p0 p0Var;
        WifiFtpViewModel wifiFtpViewModel;
        if (continuation instanceof p0) {
            p0Var = (p0) continuation;
            int i2 = p0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p0Var.b = i2 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(continuation);
            }
        } else {
            p0Var = new p0(continuation);
        }
        Object obj = p0Var.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = p0Var.b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.currentConnectStatus = connectStatus;
            MusicConstantKt.put(this.establishResultLiveData, connectStatus);
            p0Var.d = this;
            p0Var.b = 1;
            if (DelayKt.delay(200L, p0Var) == coroutine_suspended) {
                return coroutine_suspended;
            }
            wifiFtpViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wifiFtpViewModel = (WifiFtpViewModel) p0Var.d;
            ResultKt.throwOnFailure(obj);
        }
        MusicConstantKt.put(wifiFtpViewModel.establishResultLiveData, null);
        wifiFtpViewModel.isEstablishConnection.set(false);
        return Unit.INSTANCE;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.wifiConnectObserver.stopObserve();
        this.wifiStatusObserver.stopObserve();
        this.wifiFtpDevice.setWifiStatusListener(null);
        this.wifiFtpDevice.setFtpStatusListener(null);
        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.watchFtpListener.a(), (CancellationException) null, 1, (Object) null);
        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.watchWifiListener.a(), (CancellationException) null, 1, (Object) null);
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new m0(null), 2, null);
    }

    @Nullable
    public final Object sendTransferError(@NotNull TransError transError, @NotNull Continuation<? super Unit> continuation) {
        MusicConstantKt.put(this.transferErrorLiveData, new Event(transError));
        return Unit.INSTANCE;
    }

    public final void setCurrentConnectStatus(@Nullable ConnectStatus connectStatus) {
        this.currentConnectStatus = connectStatus;
    }

    public final void setDeviceConnected(boolean connected) {
        this.currentConnect = connected;
    }

    public final void setOperationLogger(@Nullable IOperationLogger iOperationLogger) {
        this.operationLogger = iOperationLogger;
    }

    public final void setPassword(@NotNull String str) {
        this.password = str;
    }

    public final void setWifiName(@NotNull String str) {
        this.wifiName = str;
    }

    public final void setup(@NotNull Context context, @NotNull IWifiFtpDevice device) {
        this.musicTransform.setErrorListener(this.ftpErrorListener);
        this.wifiSpirit = WifiSpirit.INSTANCE.get(context);
        this.wifiFtpDevice = device;
        device.setWifiStatusListener(this.watchWifiListener);
        this.wifiFtpDevice.setFtpStatusListener(this.watchFtpListener);
        updateWifiName();
        WifiConnectionObserver wifiConnectionObserver = new WifiConnectionObserver(context, this.wifiConnectListener);
        this.wifiConnectObserver = wifiConnectionObserver;
        wifiConnectionObserver.startObserve();
        WifiStatusObserver wifiStatusObserver = new WifiStatusObserver(context.getApplicationContext(), this.wifiStatusListener);
        this.wifiStatusObserver = wifiStatusObserver;
        wifiStatusObserver.persistentObserve();
        this.musicTransform.setMusicInfoLimitation(device.getMusicInfoMaxLength());
        this.musicTransform.setFtpExceptionListener(this.ftpExceptionListener);
        HMLog.info(w, new q0(Utils.INSTANCE.checkWifiRelatedPermission(context)));
    }

    public final void startManualWifiConnect(boolean start) {
        HMLog.info(w, new s0(start));
        this.startManualConnectWifi = start;
    }

    public final void startWatchFtp(@NotNull TransformMode mode) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new t0(mode, null), 3, null);
    }

    public final void startWatchWifi(@NotNull TransformMode mode) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new u0(mode, null), 2, null);
    }

    public final void stopWatchFtp() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new v0(null), 2, null);
    }

    public final void stopWatchWifi() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new w0(null), 2, null);
    }

    @Nullable
    public final Object triggerEstablish(@NotNull Continuation<? super Unit> continuation) {
        MusicConstantKt.put(this.retryEstablishLiveData, Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }

    public final void updateWifiName() {
        String address = this.wifiFtpDevice.getAddress();
        MusicConstant musicConstant = MusicConstant.INSTANCE;
        this.wifiName = musicConstant.getWifiName(musicConstant.randomPassword(4));
        this.password = musicConstant.randomPassword(8);
        IOperationLogger iOperationLogger = this.operationLogger;
        if (iOperationLogger != null) {
            iOperationLogger.logOperation("change wifi name: " + this.wifiName + "; password: " + this.password);
        }
        HMLog.info(w, new x0(address));
    }
}
