package com.xiaomi.idm.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.idm.api.IDMBase;
import com.xiaomi.idm.constant.ResponseCode;
import com.xiaomi.idm.internal.Connection;
import com.xiaomi.idm.task.RecvBlockTask;
import com.xiaomi.idm.task.SendBlockTask;
import com.xiaomi.mi_connect_service.IMiConnect;
import com.xiaomi.wearable.CoreExtKt;
import defpackage.gpe;
import defpackage.xqc;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0010\u0018\u0000 `2\u00020\u0001:\u0001`B-\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b^\u0010_J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\u001f\u0010 \u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b>\u0010?R,\u0010B\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020A0@8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020D0@8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bE\u0010CR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010CR\u0014\u0010H\u001a\u00020G8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u0002018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bX\u0010+R\u0016\u0010]\u001a\u0004\u0018\u00010Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006a"}, d2 = {"Lcom/xiaomi/idm/api/IDMBase;", "", "", "clientId", CommonConstants.KEY_SERVICE_ID, "connectionId", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "unbindService", "()V", "Landroid/content/Intent;", "createMiConnectIntent", "()Landroid/content/Intent;", "Lcom/xiaomi/idm/internal/Connection;", "getConnection", "(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/idm/internal/Connection;", "", "connLevel", "addConnection", "(Ljava/lang/String;Ljava/lang/String;I)V", "removeConnection", "init", "", "serviceAvailable", "()Z", "tryStartASendBlockTask", "()Ljava/lang/Boolean;", "destroy", "Landroid/os/Looper;", "looper", "Ljava/lang/Runnable;", "runnable", "tryDoOnLooper", "(Landroid/os/Looper;Ljava/lang/Runnable;)V", "doDestroy", "agreed", "setPrivacyResult", "(Z)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "Lxqc;", "processCallback", "Lxqc;", "callbackLooper", "Landroid/os/Looper;", "Lcom/xiaomi/mi_connect_service/IMiConnect;", "_iMiConnect", "Lcom/xiaomi/mi_connect_service/IMiConnect;", "<set-?>", "serviceApiVersion", "I", "getServiceApiVersion", "()I", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lcom/xiaomi/idm/task/SendBlockTask;", "sendBlockTasks", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Ljava/util/concurrent/atomic/AtomicInteger;", "sendBlockMemoryUsage", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/util/Pair;", "seqBlockMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/idm/task/RecvBlockTask;", "recvBlockTasks", "connectionMap", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "Ljava/util/concurrent/atomic/AtomicLong;", "atomicLong", "Ljava/util/concurrent/atomic/AtomicLong;", "mShouldUnbind", "Z", "Landroid/content/ServiceConnection;", "mConnection", "Landroid/content/ServiceConnection;", "getIMiConnect", "()Lcom/xiaomi/mi_connect_service/IMiConnect;", "iMiConnect", "getNextRequestId", "nextRequestId", "", "getIdHash", "()[B", "idHash", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lxqc;Landroid/os/Looper;)V", "Companion", "IDMSdk_release"}, k = 1, mv = {1, 5, 1})
public class IDMBase {
    protected static final int MAX_SEND_BLOCK_MEMORY = 100000000;
    protected static final int MIN_AIDL_VERSION_SUPPORT_FIXED_SERVICE_ID = 10;
    protected static final int MIN_AIDL_VERSION_SUPPORT_OFFLINE_ACCOUNT = 14;
    protected static final int MIN_AIDL_VERSION_SUPPORT_OUT_OF_BAND_INFO = 11;
    protected static final int MIN_AIDL_VERSION_SUPPORT_REI_EVENT = 9;
    protected static final int MIN_AIDL_VERSION_SUPPORT_SCREEN_OFF_SCAN = 16;
    protected static final int MIN_AIDL_VERSION_SUPPORT_SEND_BLOCK = 14;
    protected static final int MIN_AIDL_VERSION_SUPPORT_SET_PRIVACY_RESULT = 15;
    protected static final int MIN_AIDL_VERSION_SUPPORT_UPDATE_SERVICE = 14;
    protected static final int MIN_CLASSTYPE_VALID_VALUE = 16;
    private static final int REQUIRED_MIN_VERSION = 6;

    @NotNull
    private static final String TAG = "IDMBase";

    @Nullable
    private IMiConnect _iMiConnect;

    @NotNull
    private final AtomicLong atomicLong;

    @Nullable
    private Looper callbackLooper;

    @NotNull
    private final String clientId;

    @NotNull
    private final ConcurrentHashMap<String, Connection> connectionMap;

    @NotNull
    private final Context context;

    @JvmField
    @NotNull
    protected final Handler handler;

    @Nullable
    private HandlerThread handlerThread;

    @NotNull
    private final ServiceConnection mConnection;

    @GuardedBy("this")
    private boolean mShouldUnbind;

    @NotNull
    private final xqc processCallback;

    @JvmField
    @NotNull
    protected final ConcurrentHashMap<String, RecvBlockTask> recvBlockTasks;

    @JvmField
    @NotNull
    protected AtomicInteger sendBlockMemoryUsage;

    @JvmField
    @NotNull
    protected final ConcurrentLinkedDeque<SendBlockTask> sendBlockTasks;

    @JvmField
    @NotNull
    protected final ConcurrentHashMap<String, Pair<String, String>> seqBlockMap;
    private int serviceApiVersion;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IDMBase(@NotNull Context context, @NotNull String clientId, @NotNull xqc processCallback) {
        this(context, clientId, processCallback, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(processCallback, "processCallback");
    }

    public static final /* synthetic */ xqc access$getProcessCallback$p(IDMBase iDMBase) {
        iDMBase.getClass();
        return null;
    }

    private final String connectionId(String clientId, String serviceId) {
        return Typography.less + clientId + ">+<" + serviceId + Typography.greater;
    }

    private final Intent createMiConnectIntent() {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.mi_connect_service.MiConnectService");
        intent.setComponent(new ComponentName(CoreExtKt.lyraPackageName, "com.xiaomi.mi_connect_service.MiConnectService"));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-9$lambda-8, reason: not valid java name */
    public static final void m662init$lambda9$lambda8(IDMBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        ResponseCode.MiConnectCode miConnectCode = ResponseCode.MiConnectCode.MI_CONNECT_DISCONNECTED;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: tryStartASendBlockTask$lambda-14$lambda-13, reason: not valid java name */
    public static final void m663tryStartASendBlockTask$lambda14$lambda13(SendBlockTask this_run) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        this_run.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unbindService() {
        Object objM886constructorimpl;
        synchronized (this) {
            try {
                this._iMiConnect = null;
                if (this.mShouldUnbind) {
                    try {
                        Result.Companion companion = Result.Companion;
                        this.context.unbindService(this.mConnection);
                        objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                    if (thM889exceptionOrNullimpl != null) {
                        gpe.c(TAG, Intrinsics.stringPlus("unbindService error: ", thM889exceptionOrNullimpl.getMessage()), new Object[0]);
                    }
                    this.mShouldUnbind = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @JvmName(name = "addConnection")
    public final void addConnection(@NotNull String clientId, @NotNull String serviceId, int connLevel) {
        Connection connectionPutIfAbsent;
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        String strConnectionId = connectionId(clientId, serviceId);
        ConcurrentHashMap<String, Connection> concurrentHashMap = this.connectionMap;
        Connection connection = concurrentHashMap.get(strConnectionId);
        if (connection == null && (connectionPutIfAbsent = concurrentHashMap.putIfAbsent(strConnectionId, (connection = new Connection(strConnectionId)))) != null) {
            connection = connectionPutIfAbsent;
        }
        Connection connection2 = connection;
        if (connLevel == 0) {
            connection2.setAutoChannelConnected(true);
            return;
        }
        if (connLevel == 1) {
            connection2.setBasicChannelConnected(true);
            return;
        }
        if (connLevel == 2) {
            connection2.setAdvanceChannelConnected(true);
            return;
        }
        if (connLevel == 3) {
            connection2.setAdvancedDirectChannelConnected(true);
            return;
        }
        gpe.i(TAG, "addConnection: connectLevel=" + connLevel + " not recognized", new Object[0]);
    }

    public final synchronized void destroy() {
        try {
            gpe.h(TAG, "destroy: [" + this.clientId + AbstractJsonLexerKt.END_LIST, new Object[0]);
            doDestroy();
            this.handler.removeCallbacksAndMessages(null);
            HandlerThread handlerThread = this.handlerThread;
            if (handlerThread != null && handlerThread.isAlive()) {
                handlerThread.quitSafely();
            }
            unbindService();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void doDestroy() {
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @JvmName(name = "getConnection")
    @Nullable
    public final Connection getConnection(@NotNull String clientId, @NotNull String serviceId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        return this.connectionMap.get(connectionId(clientId, serviceId));
    }

    @NotNull
    public final IMiConnect getIMiConnect() {
        IMiConnect iMiConnect = this._iMiConnect;
        if (iMiConnect == null) {
            gpe.c(TAG, "IMiConnect null calling", new Object[0]);
            return new IMiConnect.Default();
        }
        Intrinsics.checkNotNull(iMiConnect);
        return iMiConnect;
    }

    @Nullable
    public byte[] getIdHash() {
        gpe.a(TAG, "getIdHash", new Object[0]);
        if (!serviceAvailable()) {
            return null;
        }
        try {
            IMiConnect iMiConnect = this._iMiConnect;
            if (iMiConnect == null) {
                return null;
            }
            return iMiConnect.getIdHash();
        } catch (RemoteException e) {
            gpe.b(TAG, e.getMessage(), e);
            return null;
        }
    }

    @NotNull
    public final String getNextRequestId() {
        return String.valueOf(this.atomicLong.incrementAndGet());
    }

    public final int getServiceApiVersion() {
        return this.serviceApiVersion;
    }

    public final void init() {
        Object objM886constructorimpl;
        synchronized (this) {
            try {
                gpe.g((this.context.getApplicationInfo().flags & 2) != 0);
                gpe.f(TAG, "IDM SDK VERSION = 3.1.370.10", new Object[0]);
                Context context = this.context;
                try {
                    Result.Companion companion = Result.Companion;
                    Intent intentCreateMiConnectIntent = createMiConnectIntent();
                    context.startService(intentCreateMiConnectIntent);
                    this.mShouldUnbind = context.bindService(intentCreateMiConnectIntent, this.mConnection, 65);
                    objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                if (thM889exceptionOrNullimpl != null) {
                    gpe.b(TAG, thM889exceptionOrNullimpl.getMessage(), thM889exceptionOrNullimpl);
                }
                if (!this.mShouldUnbind) {
                    this.handler.post(new Runnable() { // from class: qqc
                        @Override // java.lang.Runnable
                        public final void run() {
                            IDMBase.m662init$lambda9$lambda8(this.f31744a);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @JvmName(name = "removeConnection")
    public final void removeConnection(@NotNull String clientId, @NotNull String serviceId, int connLevel) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        String strConnectionId = connectionId(clientId, serviceId);
        Connection connection = this.connectionMap.get(strConnectionId);
        if (connection == null) {
            connection = null;
        } else {
            if (connLevel == 0) {
                connection.setAutoChannelConnected(false);
            } else if (connLevel == 1) {
                connection.setBasicChannelConnected(false);
            } else if (connLevel == 2) {
                connection.setAdvanceChannelConnected(false);
            } else if (connLevel != 3) {
                gpe.i(TAG, "connectLevel=" + connLevel + " not recognized", new Object[0]);
            } else {
                connection.setAdvancedDirectChannelConnected(false);
            }
            if (!connection.getConnected()) {
                this.connectionMap.remove(strConnectionId);
            }
        }
        if (connection == null) {
            gpe.i(TAG, Intrinsics.stringPlus("removeConnection: could not found connection=", strConnectionId), new Object[0]);
        }
    }

    public final boolean serviceAvailable() {
        IBinder iBinderAsBinder;
        IMiConnect iMiConnect = this._iMiConnect;
        if (iMiConnect == null || (iBinderAsBinder = iMiConnect.asBinder()) == null) {
            return false;
        }
        return iBinderAsBinder.pingBinder();
    }

    public void setPrivacyResult(boolean agreed) {
        if (this.serviceApiVersion < 15) {
            gpe.a(TAG, "setPrivacyResult: exit with API " + this.serviceApiVersion + " < 15", new Object[0]);
            return;
        }
        if (!serviceAvailable()) {
            gpe.a(TAG, "setPrivacyResult: exit with service unavailable", new Object[0]);
            return;
        }
        try {
            IMiConnect iMiConnect = this._iMiConnect;
            if (iMiConnect == null) {
                return;
            }
            iMiConnect.setPrivacyResult(agreed);
        } catch (RemoteException e) {
            gpe.b(TAG, e.getMessage(), e);
        }
    }

    public final void tryDoOnLooper(@Nullable Looper looper, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if ((looper == null ? null : Boolean.valueOf(new Handler(looper).post(runnable))) == null) {
            runnable.run();
        }
    }

    @Nullable
    public final Boolean tryStartASendBlockTask() {
        final SendBlockTask sendBlockTaskPeekLast = this.sendBlockTasks.peekLast();
        if (sendBlockTaskPeekLast == null) {
            return null;
        }
        return Boolean.valueOf(this.handler.post(new Runnable() { // from class: rqc
            @Override // java.lang.Runnable
            public final void run() {
                IDMBase.m663tryStartASendBlockTask$lambda14$lambda13(sendBlockTaskPeekLast);
            }
        }));
    }

    @JvmOverloads
    public IDMBase(@NotNull Context context, @NotNull String clientId, @NotNull xqc processCallback, @Nullable Looper looper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(processCallback, "processCallback");
        this.context = context;
        this.clientId = clientId;
        this.callbackLooper = looper;
        this.serviceApiVersion = -1;
        this.sendBlockTasks = new ConcurrentLinkedDeque<SendBlockTask>() { // from class: com.xiaomi.idm.api.IDMBase$sendBlockTasks$1
            public /* bridge */ boolean contains(SendBlockTask sendBlockTask) {
                return super.contains((Object) sendBlockTask);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ boolean remove(SendBlockTask sendBlockTask) {
                return super.remove((Object) sendBlockTask);
            }

            @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque
            public void addFirst(@Nullable SendBlockTask e) {
                byte[] data;
                super.addFirst(e);
                if (e == null || (data = e.getData()) == null) {
                    return;
                }
                gpe.f("IDMBase", Intrinsics.stringPlus("sendBlock memory usage = ", Integer.valueOf(this.this$0.sendBlockMemoryUsage.addAndGet(data.length))), new Object[0]);
            }

            @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
            public final /* bridge */ boolean contains(Object obj) {
                if (obj == null || (obj instanceof SendBlockTask)) {
                    return contains((SendBlockTask) obj);
                }
                return false;
            }

            @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque
            @Nullable
            public SendBlockTask pollLast() {
                SendBlockTask sendBlockTask = (SendBlockTask) super.pollLast();
                if (sendBlockTask == null) {
                    return null;
                }
                gpe.f("IDMBase", Intrinsics.stringPlus("sendBlock memory usage = ", Integer.valueOf(this.this$0.sendBlockMemoryUsage.addAndGet(-sendBlockTask.getData().length))), new Object[0]);
                return sendBlockTask;
            }

            @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
            public final /* bridge */ boolean remove(Object obj) {
                if (obj == null || (obj instanceof SendBlockTask)) {
                    return remove((SendBlockTask) obj);
                }
                return false;
            }
        };
        this.sendBlockMemoryUsage = new AtomicInteger();
        this.seqBlockMap = new ConcurrentHashMap<>();
        this.recvBlockTasks = new ConcurrentHashMap<>();
        this.connectionMap = new ConcurrentHashMap<>();
        this.atomicLong = new AtomicLong(0L);
        if (this.callbackLooper == null) {
            HandlerThread handlerThread = new HandlerThread(Intrinsics.stringPlus(getClass().getSimpleName(), "-callback-thread"));
            this.handlerThread = handlerThread;
            Intrinsics.checkNotNull(handlerThread);
            handlerThread.start();
            HandlerThread handlerThread2 = this.handlerThread;
            Intrinsics.checkNotNull(handlerThread2);
            this.callbackLooper = handlerThread2.getLooper();
        }
        Looper looper2 = this.callbackLooper;
        Intrinsics.checkNotNull(looper2);
        this.handler = new Handler(looper2);
        this.mConnection = new IDMBase$mConnection$1(this);
    }

    public /* synthetic */ IDMBase(Context context, String str, xqc xqcVar, Looper looper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, xqcVar, (i & 8) != 0 ? null : looper);
    }
}
