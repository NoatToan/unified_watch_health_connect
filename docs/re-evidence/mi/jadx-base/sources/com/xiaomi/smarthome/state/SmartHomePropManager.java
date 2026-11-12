package com.xiaomi.smarthome.state;

import android.util.Log;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.process.CacheData;
import com.xiaomi.process.ProcessDataShareManager;
import com.xiaomi.smarthome.IReadyCallback;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.devicesubscribe.OnSubscribeListener;
import com.xiaomi.smarthome.library.common.util.CommonUtil;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.newui.utils.DeviceUtils;
import com.xiaomi.smarthome.state.SmartHomePropManager;
import com.xiaomi.smarthome.utils.UpdateWatcher;
import com.xiaomi.smarthome.utils.Watcher;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003:\u00011B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016J4\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u001f\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u001f\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001c\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001c\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\"\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\"2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\"\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\"2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010#\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001a\u0010#\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u001e\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016J.\u0010(\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ6\u0010(\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ.\u0010(\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ6\u0010(\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ$\u0010)\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010*\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\nJ\u0010\u0010.\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u0010/\u001a\u00020\u000fJ\u0010\u00100\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\nR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/xiaomi/smarthome/state/SmartHomePropManager;", "Lcom/xiaomi/smarthome/IReadyCallback;", "Lcom/xiaomi/smarthome/devicesubscribe/OnSubscribeListener;", "Lcom/xiaomi/smarthome/utils/Watcher;", "Lcom/xiaomi/process/CacheData;", "()V", "mShare", "Lcom/xiaomi/smarthome/state/IStateHolder;", "mStateChangedListener", "Ljava/util/ArrayList;", "Lcom/xiaomi/smarthome/state/OnStateChangedListener;", "readyWatcher", "Lcom/xiaomi/smarthome/utils/UpdateWatcher;", "", PrivacyAgreeModel.TYPE_ACCEPT, "", "stringObjectMap", "dispatchStateChanged", "did", "", "prop", "value", "", "time", "", "type", "", "getProp", "Lcom/xiaomi/smarthome/state/ValueEntry;", "device", "Lcom/xiaomi/smarthome/device/Device;", "getPropTimeMillis", "getPropValue", "getPropsMap", "", "getRequestTimeMillis", "isReadyListener", "autoRequest", "", "runnable", "notifyPropChangedListener", "onReceive", "model", "Lorg/json/JSONArray;", "registerStateChangedListener", e.f13808a, "removePropMap", "savePropsCache", "unregisterStateChangedListener", "Companion", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SmartHomePropManager implements IReadyCallback, OnSubscribeListener, Watcher<CacheData> {

    @NotNull
    public static final String TAG = "SmartHomePropManager";
    public static final byte TYPE_FAIL_ACCESS = -5;
    public static final byte TYPE_FAIL_NODEVICE = -3;
    public static final byte TYPE_FAIL_OFFLINE = -1;
    public static final byte TYPE_FAIL_PARAM = -4;
    public static final byte TYPE_FAIL_TIMEOUT = -2;
    public static final byte TYPE_GET = 5;
    public static final byte TYPE_PUSH = 4;
    public static final byte TYPE_SET_FAIL = 3;
    public static final byte TYPE_SET_REQUEST = 1;
    public static final byte TYPE_SET_SUCCESS = 2;

    @Nullable
    private IStateHolder mShare;

    @NotNull
    private final ArrayList<OnStateChangedListener> mStateChangedListener;

    @NotNull
    private final UpdateWatcher<Integer> readyWatcher;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SmartHomePropManager> ins$delegate = LazyKt__LazyJVMKt.lazy(new Function0<SmartHomePropManager>() { // from class: com.xiaomi.smarthome.state.SmartHomePropManager$Companion$ins$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SmartHomePropManager invoke() {
            return new SmartHomePropManager(null);
        }
    });

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/smarthome/state/SmartHomePropManager$Companion;", "", "()V", "TAG", "", "TYPE_FAIL_ACCESS", "", "TYPE_FAIL_NODEVICE", "TYPE_FAIL_OFFLINE", "TYPE_FAIL_PARAM", "TYPE_FAIL_TIMEOUT", "TYPE_GET", "TYPE_PUSH", "TYPE_SET_FAIL", "TYPE_SET_REQUEST", "TYPE_SET_SUCCESS", "ins", "Lcom/xiaomi/smarthome/state/SmartHomePropManager;", "getIns", "()Lcom/xiaomi/smarthome/state/SmartHomePropManager;", "ins$delegate", "Lkotlin/Lazy;", "getErrorCode", "fail", "", "getInstance", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SmartHomePropManager getIns() {
            return (SmartHomePropManager) SmartHomePropManager.ins$delegate.getValue();
        }

        @JvmStatic
        public final byte getErrorCode(int fail) {
            switch (fail) {
                case -704083036:
                    return (byte) -2;
                case -704042011:
                    return (byte) -1;
                case -704042001:
                    return (byte) -3;
                case -704030023:
                case -704030013:
                    return (byte) -5;
                case -704002000:
                    return (byte) -4;
                default:
                    return (byte) 3;
            }
        }

        @JvmStatic
        @NotNull
        public final SmartHomePropManager getInstance() {
            return getIns();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.smarthome.state.SmartHomePropManager$accept$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J6\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/xiaomi/smarthome/state/SmartHomePropManager$accept$1", "Lcom/xiaomi/smarthome/state/OnStateChangedListener$Stub;", "onStateChanged", "", "did", "", "prop", "value", "", "time", "", "type", "", "onTimeChanged", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends OnStateChangedListener.Stub {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onStateChanged$lambda-0, reason: not valid java name */
        public static final void m848onStateChanged$lambda0(SmartHomePropManager this$0, String str, String str2, Object obj, long j, byte b2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.dispatchStateChanged(str, str2, obj, j, b2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onTimeChanged$lambda-1, reason: not valid java name */
        public static final void m849onTimeChanged$lambda1(SmartHomePropManager this$0, String str, String str2, Object obj, long j, byte b2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int size = this$0.mStateChangedListener.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                Object obj2 = this$0.mStateChangedListener.get(size);
                Intrinsics.checkNotNullExpressionValue(obj2, "mStateChangedListener[i]");
                ((OnStateChangedListener) obj2).onTimeChanged(str, str2, obj, j, b2);
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        }

        @Override // com.xiaomi.smarthome.state.OnStateChangedListener
        public void onStateChanged(@Nullable final String did, @Nullable final String prop, @Nullable final Object value, final long time, final byte type) {
            final SmartHomePropManager smartHomePropManager = SmartHomePropManager.this;
            CommonUtil.runMainThread(new Runnable() { // from class: r2n
                @Override // java.lang.Runnable
                public final void run() {
                    SmartHomePropManager.AnonymousClass1.m848onStateChanged$lambda0(smartHomePropManager, did, prop, value, time, type);
                }
            });
        }

        @Override // com.xiaomi.smarthome.state.OnStateChangedListener
        public void onTimeChanged(@Nullable final String did, @Nullable final String prop, @Nullable final Object value, final long time, final byte type) {
            final SmartHomePropManager smartHomePropManager = SmartHomePropManager.this;
            CommonUtil.runMainThread(new Runnable() { // from class: q2n
                @Override // java.lang.Runnable
                public final void run() {
                    SmartHomePropManager.AnonymousClass1.m849onTimeChanged$lambda1(smartHomePropManager, did, prop, value, time, type);
                }
            });
        }
    }

    public /* synthetic */ SmartHomePropManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m846_init_$lambda3(final SmartHomePropManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.xiaomi.smarthome.state.SmartHomePropManager$1$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.this$0.savePropsCache();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accept$lambda-0, reason: not valid java name */
    public static final void m847accept$lambda0(SmartHomePropManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            IStateHolder iStateHolder = this$0.mShare;
            if (iStateHolder != null) {
                iStateHolder.loadPropsFromLocal();
            }
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.CARD, "SmartHomePropManager.loadPropsFromLocal", Log.getStackTraceString(e));
        }
        this$0.readyWatcher.dispatchUpdateAndClear(0);
    }

    @JvmStatic
    public static final byte getErrorCode(int i) {
        return INSTANCE.getErrorCode(i);
    }

    @JvmStatic
    @NotNull
    public static final SmartHomePropManager getInstance() {
        return INSTANCE.getInstance();
    }

    public final void dispatchStateChanged(@Nullable String did, @Nullable String prop, @Nullable Object value, long time, byte type) {
        int size = this.mStateChangedListener.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            OnStateChangedListener onStateChangedListener = this.mStateChangedListener.get(size);
            Intrinsics.checkNotNullExpressionValue(onStateChangedListener, "mStateChangedListener[i]");
            onStateChangedListener.onStateChanged(did, prop, value, time, type);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    @Nullable
    public final ValueEntry getProp(@Nullable String did, @Nullable String prop) {
        try {
            IStateHolder iStateHolder = this.mShare;
            if (iStateHolder == null) {
                return null;
            }
            return iStateHolder.getProp(did, prop);
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.CARD, "SmartHomePropManager.getProp", Log.getStackTraceString(e));
            return null;
        }
    }

    public final long getPropTimeMillis(@Nullable Device device, @Nullable String prop) {
        return getPropTimeMillis(DeviceUtils.getSpecDid(device), prop);
    }

    @Nullable
    public final Object getPropValue(@Nullable Device device, @Nullable String prop) {
        ValueEntry prop2 = getProp(device, prop);
        if (prop2 == null) {
            return null;
        }
        return prop2.getValue();
    }

    @Nullable
    public final Map<String, ValueEntry> getPropsMap(@Nullable String did) {
        try {
            IStateHolder iStateHolder = this.mShare;
            if (iStateHolder == null) {
                return null;
            }
            return iStateHolder.getPropsMap(did);
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.CARD, "SmartHomePropManager.getPropsMap", Log.getStackTraceString(e));
            return null;
        }
    }

    public final long getRequestTimeMillis(@Nullable Device device, @Nullable String prop) {
        return getRequestTimeMillis(DeviceUtils.getSpecDid(device), prop);
    }

    @Override // com.xiaomi.smarthome.IReadyCallback
    public void isReadyListener(boolean autoRequest, @NotNull Watcher<Integer> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (this.mShare == null) {
            this.readyWatcher.registUpdateListener(runnable);
        } else {
            runnable.accept(0);
        }
    }

    @Nullable
    public final Object notifyPropChangedListener(@Nullable String did, @Nullable String prop, @Nullable Object value, long time, byte type) {
        try {
            IStateHolder iStateHolder = this.mShare;
            if (iStateHolder == null) {
                return null;
            }
            return iStateHolder.notifyPropChangedListener(did, prop, value, time, type);
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.CARD, "SmartHomePropManager.notifyPropChangedListener", Log.getStackTraceString(e));
            return null;
        }
    }

    @Override // com.xiaomi.smarthome.devicesubscribe.OnSubscribeListener
    public void onReceive(@Nullable String did, @Nullable String model, @NotNull JSONArray prop) {
        Intrinsics.checkNotNullParameter(prop, "prop");
        int length = prop.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            JSONObject jSONObjectOptJSONObject = prop.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && !jSONObjectOptJSONObject.isNull("key")) {
                Object objOpt = jSONObjectOptJSONObject.opt("value");
                String key = jSONObjectOptJSONObject.optString("key");
                long jOptLong = jSONObjectOptJSONObject.optLong("time", 0L);
                try {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    if (!StringsKt__StringsJVMKt.startsWith$default(key, "event.", false, 2, null) && (objOpt instanceof JSONArray) && ((JSONArray) objOpt).length() > 0) {
                        objOpt = ((JSONArray) objOpt).get(0);
                    }
                } catch (JSONException e) {
                    MiJiaLog.writeLogOnAll(LogType.CARD, TAG, Intrinsics.stringPlus("onSubscribedValueChanged error：", Log.getStackTraceString(e)));
                }
                notifyPropChangedListener(did, key, objOpt, jOptLong, (byte) 4);
            }
            i = i2;
        }
    }

    public final void registerStateChangedListener(@Nullable OnStateChangedListener l) {
        synchronized (this) {
            if (l != null) {
                try {
                    if (!this.mStateChangedListener.contains(l)) {
                        this.mStateChangedListener.add(l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removePropMap(@Nullable String did) {
        try {
            IStateHolder iStateHolder = this.mShare;
            if (iStateHolder == null) {
                return;
            }
            iStateHolder.removePropMap(did);
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.CARD, "SmartHomePropManager.removePropMap", Log.getStackTraceString(e));
        }
    }

    public final void savePropsCache() {
        try {
            IStateHolder iStateHolder = this.mShare;
            if (iStateHolder == null) {
                return;
            }
            iStateHolder.savePropsCache();
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.CARD, "SmartHomePropManager.savePropsCache", Log.getStackTraceString(e));
        }
    }

    public final void unregisterStateChangedListener(@Nullable OnStateChangedListener l) {
        synchronized (this) {
            this.mStateChangedListener.remove(l);
        }
    }

    private SmartHomePropManager() {
        this.readyWatcher = new UpdateWatcher<>();
        this.mStateChangedListener = new ArrayList<>();
        ProcessDataShareManager.INSTANCE.getInstance().registUpdateListener(this);
        CommonUtil.runMainThread(new Runnable() { // from class: p2n
            @Override // java.lang.Runnable
            public final void run() {
                SmartHomePropManager.m846_init_$lambda3(this.f29940a);
            }
        });
    }

    @Override // com.xiaomi.smarthome.utils.Watcher
    public void accept(@Nullable CacheData stringObjectMap) {
        IStateHolder iStateHolder = (IStateHolder) ProcessDataShareManager.INSTANCE.getInstance().select(IStateHolder.class);
        this.mShare = iStateHolder;
        if (iStateHolder != null) {
            try {
                iStateHolder.registerStateChangedListener(new AnonymousClass1());
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.CARD, "SmartHomePropManager.registerStateChangedListener", Log.getStackTraceString(e));
            }
        }
        CommonUtil.runOnThread(GlobalHandlerManager.getInstance().getGlobalWorkerHandler(), new Runnable() { // from class: o2n
            @Override // java.lang.Runnable
            public final void run() {
                SmartHomePropManager.m847accept$lambda0(this.f28680a);
            }
        });
        LogType logType = LogType.CARD;
        IStateHolder iStateHolder2 = this.mShare;
        MiJiaLog.writeLogOnAll(logType, TAG, Intrinsics.stringPlus("SmartHomePropManager.accept ", iStateHolder2 == null ? null : iStateHolder2.toString()));
    }

    public final long getPropTimeMillis(@Nullable String did, @Nullable String prop) {
        ValueEntry prop2 = getProp(did, prop);
        if (prop2 == null) {
            return 0L;
        }
        return prop2.time;
    }

    public final long getRequestTimeMillis(@Nullable String did, @Nullable String prop) {
        ValueEntry prop2 = getProp(did, prop);
        if (prop2 == null) {
            return 0L;
        }
        return prop2.requestTime;
    }

    @Nullable
    public final ValueEntry getProp(@Nullable Device device, @Nullable String prop) {
        return getProp(DeviceUtils.getSpecDid(device), prop);
    }

    @Nullable
    public final Object getPropValue(@Nullable String did, @Nullable String prop) {
        ValueEntry prop2 = getProp(did, prop);
        if (prop2 == null) {
            return null;
        }
        return prop2.getValue();
    }

    @Nullable
    public final Map<String, ValueEntry> getPropsMap(@Nullable Device device) {
        return getPropsMap(DeviceUtils.getSpecDid(device));
    }

    @Nullable
    public final Object notifyPropChangedListener(@Nullable Device device, @Nullable String prop, @Nullable Object value, byte type) {
        return notifyPropChangedListener(DeviceUtils.getSpecDid(device), prop, value, type);
    }

    @Nullable
    public final Object notifyPropChangedListener(@Nullable String did, @Nullable String prop, @Nullable Object value, byte type) {
        return notifyPropChangedListener(did, prop, value, 0L, type);
    }

    @Nullable
    public final Object notifyPropChangedListener(@Nullable Device device, @Nullable String prop, @Nullable Object value, long time, byte type) {
        return notifyPropChangedListener(DeviceUtils.getSpecDid(device), prop, value, time, type);
    }
}
