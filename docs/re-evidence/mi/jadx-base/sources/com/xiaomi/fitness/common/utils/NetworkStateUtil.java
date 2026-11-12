package com.xiaomi.fitness.common.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import com.example.statistics.export.OneTrackConstant;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tJ+\u0010\u0016\u001a\u00020\r2#\b\u0001\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bJ+\u0010\u0018\u001a\u00020\r2#\b\u0001\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bJ\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0006\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/common/utils/NetworkStateUtil;", "", "<init>", "()V", "mNetworkState", "Lcom/xiaomi/fitness/common/utils/NetworkStateUtil$NetworkState;", "mOnConnectChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isConnect", "", "mAccessNetworkEnable", "mHasValidNetworkState", "mNetworkChangeReceiver", "Landroid/content/BroadcastReceiver;", "setAccessNetworkStateEnable", "cnt", "Landroid/content/Context;", "enable", "registerConnectChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterConnectChangeListener", "attach", "getStateInfo", "updateNetworkState", "context", "needRetry", "startRetryTask", "onConnectChange", "connected", "NetworkState", "Companion", "NetworkCallbackImpl", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkStateUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NO_NETWORK = "NA";

    @Nullable
    private static volatile NetworkStateUtil instance;
    private boolean mAccessNetworkEnable;
    private volatile boolean mHasValidNetworkState;

    @NotNull
    private final BroadcastReceiver mNetworkChangeReceiver;

    @NotNull
    private final NetworkState mNetworkState;

    @NotNull
    private final CopyOnWriteArrayList<Function1<Boolean, Unit>> mOnConnectChangeCallbacks;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/common/utils/NetworkStateUtil$Companion;", "", "<init>", "()V", "NO_NETWORK", "", "instance", "Lcom/xiaomi/fitness/common/utils/NetworkStateUtil;", "getInstance", "ctx", "Landroid/content/Context;", "parseNetworkType", "networkInfo", "Landroid/net/NetworkInfo;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String parseNetworkType(NetworkInfo networkInfo) {
            if (networkInfo.isConnected()) {
                if (networkInfo.getType() == 1) {
                    return NetworkUtils.NETWORK_TYPE_WIFI;
                }
                if (networkInfo.getType() == 0) {
                    switch (networkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return NetworkUtils.NETWORK_TYPE_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return NetworkUtils.NETWORK_TYPE_3G;
                        case 13:
                            return NetworkUtils.NETWORK_TYPE_4G;
                        default:
                            String subtypeName = networkInfo.getSubtypeName();
                            Intrinsics.checkNotNullExpressionValue(subtypeName, "getSubtypeName(...)");
                            return (StringsKt__StringsJVMKt.equals("TD-SCDMA", subtypeName, true) || StringsKt__StringsJVMKt.equals("WCDMA", subtypeName, true) || StringsKt__StringsJVMKt.equals("CDMA2000", subtypeName, true)) ? NetworkUtils.NETWORK_TYPE_3G : subtypeName;
                    }
                }
            }
            return NetworkStateUtil.NO_NETWORK;
        }

        @NotNull
        public final NetworkStateUtil getInstance(@NotNull Context ctx) {
            NetworkStateUtil networkStateUtil;
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            if (NetworkStateUtil.instance != null) {
                NetworkStateUtil networkStateUtil2 = NetworkStateUtil.instance;
                Intrinsics.checkNotNull(networkStateUtil2);
                return networkStateUtil2;
            }
            synchronized (this) {
                try {
                    if (NetworkStateUtil.instance == null) {
                        NetworkStateUtil.instance = new NetworkStateUtil(null).attach(ctx);
                    }
                    networkStateUtil = NetworkStateUtil.instance;
                    Intrinsics.checkNotNull(networkStateUtil);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return networkStateUtil;
        }
    }

    @RequiresApi(21)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/common/utils/NetworkStateUtil$NetworkCallbackImpl;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkCallbackImpl extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/common/utils/NetworkStateUtil$NetworkState;", "", "<init>", "()V", "type", "", "desc", "", "state", "getType", "getDesc", "getState", "isConnected", "", "()Z", "isWifiConnected", "updateState", "", "setDisconnected", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNetworkStateUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkStateUtil.kt\ncom/xiaomi/fitness/common/utils/NetworkStateUtil$NetworkState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
    public static final class NetworkState {
        public static final int STATE_CONNECTED = 2;
        public static final int STATE_CONNECTING = 1;
        public static final int STATE_NONE = 0;

        @Nullable
        private String desc;
        private int state;
        private int type;

        @Nullable
        public final String getDesc() {
            String str;
            synchronized (this) {
                str = this.desc;
            }
            return str;
        }

        public final int getState() {
            int i;
            synchronized (this) {
                i = this.state;
            }
            return i;
        }

        public final int getType() {
            int i;
            synchronized (this) {
                i = this.type;
            }
            return i;
        }

        public final boolean isConnected() {
            boolean z;
            synchronized (this) {
                z = this.state == 2;
            }
            return z;
        }

        public final boolean isWifiConnected() {
            boolean z;
            synchronized (this) {
                z = this.type == 1;
            }
            return z;
        }

        public final void setDisconnected() {
            updateState(-1, 0, NetworkStateUtil.NO_NETWORK);
        }

        public final void updateState(int type, int state, @Nullable String desc) {
            synchronized (this) {
                this.type = type;
                this.state = state;
                this.desc = desc;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkInfo.State.values().length];
            try {
                iArr[NetworkInfo.State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkInfo.State.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.utils.NetworkStateUtil$onConnectChange$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.common.utils.NetworkStateUtil$onConnectChange$1", f = "NetworkStateUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $connected;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$connected = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NetworkStateUtil.this.new AnonymousClass1(this.$connected, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator it = NetworkStateUtil.this.mOnConnectChangeCallbacks.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                ((Function1) it.next()).invoke2(Boxing.boxBoolean(this.$connected));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ NetworkStateUtil(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkStateUtil attach(Context cnt) {
        ApplicationExtKt.getSafeContext(cnt).registerReceiver(this.mNetworkChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        return this;
    }

    private final void onConnectChange(boolean connected) {
        AnyExtKt.main$default(null, new AnonymousClass1(connected, null), 1, null);
    }

    private final void startRetryTask(final Context context) {
        ExecutorHelper.runInBackground(new Runnable() { // from class: okg
            @Override // java.lang.Runnable
            public final void run() {
                NetworkStateUtil.startRetryTask$lambda$0(this.f29251a, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRetryTask$lambda$0(NetworkStateUtil this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        SystemClock.sleep(500L);
        this$0.updateNetworkState(context, false);
        if (this$0.mNetworkState.isConnected()) {
            return;
        }
        SystemClock.sleep(1500L);
        this$0.updateNetworkState(context, false);
    }

    private final void updateNetworkState(Context context, boolean needRetry) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        if (connectivityManager == null) {
            return;
        }
        try {
            boolean zIsConnected = this.mNetworkState.isConnected();
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            int i = 1;
            if (activeNetworkInfo != null) {
                NetworkInfo.State state = activeNetworkInfo.getState();
                Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
                String networkType = INSTANCE.parseNetworkType(activeNetworkInfo);
                int type = activeNetworkInfo.getType();
                int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i2 == 1) {
                    this.mHasValidNetworkState = true;
                } else if (i2 != 2) {
                    this.mHasValidNetworkState = true;
                    i = 0;
                } else {
                    i = 2;
                }
                this.mNetworkState.updateState(type, i, networkType);
            } else {
                this.mNetworkState.setDisconnected();
                this.mHasValidNetworkState = true;
            }
            boolean zIsConnected2 = this.mNetworkState.isConnected();
            if (zIsConnected2 != zIsConnected) {
                onConnectChange(zIsConnected2);
            }
        } catch (Exception unused) {
            this.mHasValidNetworkState = false;
        }
    }

    public static /* synthetic */ void updateNetworkState$default(NetworkStateUtil networkStateUtil, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        networkStateUtil.updateNetworkState(context, z);
    }

    @NotNull
    public final NetworkState getStateInfo(@NotNull Context cnt) {
        Intrinsics.checkNotNullParameter(cnt, "cnt");
        if (!this.mAccessNetworkEnable || this.mHasValidNetworkState) {
            return this.mNetworkState;
        }
        updateNetworkState$default(this, cnt, false, 2, null);
        return this.mNetworkState;
    }

    public final void registerConnectChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnConnectChangeCallbacks.add(listener);
    }

    public final void setAccessNetworkStateEnable(@NotNull Context cnt, boolean enable) {
        Intrinsics.checkNotNullParameter(cnt, "cnt");
        if (!this.mAccessNetworkEnable && enable) {
            updateNetworkState$default(this, cnt, false, 2, null);
        }
        this.mAccessNetworkEnable = enable;
    }

    public final void unregisterConnectChangeListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnConnectChangeCallbacks.remove(listener);
    }

    private NetworkStateUtil() {
        this.mNetworkState = new NetworkState();
        this.mOnConnectChangeCallbacks = new CopyOnWriteArrayList<>();
        this.mAccessNetworkEnable = true;
        this.mNetworkChangeReceiver = new NetworkStateUtil$mNetworkChangeReceiver$1(this);
    }
}
