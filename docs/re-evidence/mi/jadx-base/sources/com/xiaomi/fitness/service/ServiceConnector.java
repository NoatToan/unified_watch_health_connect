package com.xiaomi.fitness.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.service.ServiceConnector;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006J\u001a\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006J,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0006J,\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0006J \u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J3\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00062#\u0010\u001d\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\t0\u001eJ\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u0006J\u0012\u0010&\u001a\u00020\t2\n\u0010'\u001a\u00020(\"\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/service/ServiceConnector;", "", "<init>", "()V", "mConnectors", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/xiaomi/fitness/service/ConnectorCore;", "addServiceConnectListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/ServiceConnection;", "code", "removeServiceConnectListener", "bindPoolService", "", "context", "Landroid/content/Context;", "action", "", "packageName", "type", "bindServiceWithLaunchIfNeeded", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "bindDefaultService", "getType", "getBinder", "binderCode", "block", "Lkotlin/Function1;", "Landroid/os/IBinder;", "Lkotlin/ParameterName;", "name", "binder", "getConnectorCoreByCode", "getConnectorCore", "isConnected", "unbindService", "types", "", "Companion", "service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServiceConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceConnector.kt\ncom/xiaomi/fitness/service/ServiceConnector\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,128:1\n13423#2,2:129\n*S KotlinDebug\n*F\n+ 1 ServiceConnector.kt\ncom/xiaomi/fitness/service/ServiceConnector\n*L\n123#1:129,2\n*E\n"})
public final class ServiceConnector {
    private static final int SIZE = 16;

    @NotNull
    private static final String TAG = "ServiceConnector";
    private static boolean isServer;

    @NotNull
    private final ConcurrentHashMap<Integer, ConnectorCore> mConnectors = new ConcurrentHashMap<>(16);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ServiceConnector> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: fyl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ServiceConnector.instance_delegate$lambda$2();
        }
    });

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072#\u0010\u0016\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00140\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/service/ServiceConnector$Companion;", "", "<init>", "()V", "TAG", "", "SIZE", "", "isServer", "", "()Z", "setServer", "(Z)V", "instance", "Lcom/xiaomi/fitness/service/ServiceConnector;", "getInstance", "()Lcom/xiaomi/fitness/service/ServiceConnector;", "instance$delegate", "Lkotlin/Lazy;", "getBinder", "", "binderCode", "block", "Lkotlin/Function1;", "Landroid/os/IBinder;", "Lkotlin/ParameterName;", "name", "binder", "service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void getBinder(int binderCode, @NotNull Function1<? super IBinder, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Logger.d(ServiceConnector.TAG, "get Binder with binderCode(" + binderCode + ")");
            getInstance().getBinder(binderCode, block);
        }

        @NotNull
        public final ServiceConnector getInstance() {
            return (ServiceConnector) ServiceConnector.instance$delegate.getValue();
        }

        public final boolean isServer() {
            return ServiceConnector.isServer;
        }

        public final void setServer(boolean z) {
            ServiceConnector.isServer = z;
        }
    }

    public static /* synthetic */ void addServiceConnectListener$default(ServiceConnector serviceConnector, ServiceConnection serviceConnection, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        serviceConnector.addServiceConnectListener(serviceConnection, i);
    }

    public static /* synthetic */ void bindDefaultService$default(ServiceConnector serviceConnector, Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        serviceConnector.bindDefaultService(context, str, i);
    }

    public static /* synthetic */ boolean bindPoolService$default(ServiceConnector serviceConnector, Context context, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return serviceConnector.bindPoolService(context, str, str2, i);
    }

    public static /* synthetic */ void bindServiceWithLaunchIfNeeded$default(ServiceConnector serviceConnector, FragmentActivity fragmentActivity, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        serviceConnector.bindServiceWithLaunchIfNeeded(fragmentActivity, str, str2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindServiceWithLaunchIfNeeded$lambda$0(ServiceConnector this$0, FragmentActivity activity, String action, Ref.ObjectRef pn, int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(action, "$action");
        Intrinsics.checkNotNullParameter(pn, "$pn");
        Logger.i(TAG, "bind server after launch activity");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this$0.bindPoolService(applicationContext, action, (String) pn.element, i);
        return Unit.INSTANCE;
    }

    private final synchronized ConnectorCore getConnectorCore(int type) {
        ConnectorCore connectorCore;
        connectorCore = this.mConnectors.get(Integer.valueOf(type));
        if (connectorCore == null) {
            Logger.i(TAG, "Cannot find ConnectorCore with type(" + type + "), construct it");
            connectorCore = new ConnectorCore();
            this.mConnectors.put(Integer.valueOf(type), connectorCore);
        }
        return connectorCore;
    }

    private final ConnectorCore getConnectorCoreByCode(int binderCode) {
        return getConnectorCore(getType(binderCode));
    }

    private final int getType(int code) {
        if (code < 100000) {
            return code / 1000;
        }
        throw new ArithmeticException("Code cannot exceed 100000");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServiceConnector instance_delegate$lambda$2() {
        return new ServiceConnector();
    }

    public static /* synthetic */ boolean isConnected$default(ServiceConnector serviceConnector, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return serviceConnector.isConnected(i);
    }

    public static /* synthetic */ void removeServiceConnectListener$default(ServiceConnector serviceConnector, ServiceConnection serviceConnection, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        serviceConnector.removeServiceConnectListener(serviceConnection, i);
    }

    public final void addServiceConnectListener(@NotNull ServiceConnection listener, int code) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getConnectorCoreByCode(code).addServiceConnectListener(listener);
    }

    public final void bindDefaultService(@NotNull Context context, @NotNull String packageName, int type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        bindPoolService(context, "mi.intent.action.DEFAULT", packageName, type);
    }

    public final boolean bindPoolService(@NotNull Context context, @NotNull String action, @Nullable String packageName, int type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        if (packageName == null || packageName.length() == 0) {
            packageName = context.getPackageName();
        }
        ConnectorCore connectorCore = getConnectorCore(type);
        if (connectorCore.getIsConnected()) {
            return true;
        }
        Intrinsics.checkNotNull(packageName);
        connectorCore.init(context, action, packageName, type);
        return ConnectorCore.bindPoolService$default(connectorCore, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.String] */
    public final void bindServiceWithLaunchIfNeeded(@NotNull final FragmentActivity activity, @NotNull final String action, @Nullable String packageName, final int type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(action, "action");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = packageName;
        String str = packageName;
        if (str == null || str.length() == 0) {
            objectRef.element = activity.getPackageName();
        }
        Intent intent = new Intent();
        T t = objectRef.element;
        Intrinsics.checkNotNull(t);
        intent.setComponent(new ComponentName((String) t, JumpActivity.class.getName()));
        if (activity instanceof ActivityForServiceLauncher) {
            ((ActivityForServiceLauncher) activity).startForActivityResult(intent, new Function2() { // from class: gyl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ServiceConnector.bindServiceWithLaunchIfNeeded$lambda$0(this.f19469a, activity, action, objectRef, type, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        }
    }

    public final void getBinder(int binderCode, @NotNull Function1<? super IBinder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        getConnectorCoreByCode(binderCode).getBinder(binderCode, block);
    }

    public final boolean isConnected(int type) {
        return getConnectorCore(type).getIsConnected();
    }

    public final void removeServiceConnectListener(@Nullable ServiceConnection listener, int code) {
        getConnectorCoreByCode(code).removeServiceConnectListener(listener);
    }

    public final void unbindService(@NotNull int... types) {
        Intrinsics.checkNotNullParameter(types, "types");
        for (int i : types) {
            ConnectorCore connectorCoreRemove = this.mConnectors.remove(Integer.valueOf(i));
            if (connectorCoreRemove != null) {
                connectorCoreRemove.unbindService();
            }
        }
    }
}
