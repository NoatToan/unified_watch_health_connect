package com.xiaomi.fitness.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.service.ConnectorCore;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\b\b*\u0002=C\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\bH\u0010 J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014J:\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\f2#\u0010\u001b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0004\b\u0005\u0010\u001cJ:\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00022#\u0010\u001b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0004\b\u0005\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\u000eH\u0000¢\u0006\u0004\b!\u0010 J\u0017\u0010%\u001a\u00020$2\b\b\u0002\u0010#\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010'R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R$\u00103\u001a\u00020$2\u0006\u00102\u001a\u00020$8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/service/ConnectorCore;", "", "Lcom/xiaomi/fitness/service/BinderRequest;", "binderRequest", "Landroid/os/IBinder;", "getBinder", "(Lcom/xiaomi/fitness/service/BinderRequest;)Landroid/os/IBinder;", "Landroid/content/Context;", "context", "", "action", "pn", "", "type", "", "init", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/content/ServiceConnection;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addServiceConnectListener", "(Landroid/content/ServiceConnection;)V", "removeServiceConnectListener", "binderCode", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "binder", "block", "(ILkotlin/jvm/functions/Function1;)V", "request", "(Lcom/xiaomi/fitness/service/BinderRequest;Lkotlin/jvm/functions/Function1;)V", "unbindService", "()V", "unbindRemoteService$service_release", "unbindRemoteService", "bindReason", "", "bindPoolService", "(Ljava/lang/String;)Z", "(I)Landroid/os/IBinder;", "mContext", "Landroid/content/Context;", "mAction", "Ljava/lang/String;", "mPackageName", "mVersion", "I", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mConnections", "Ljava/util/concurrent/CopyOnWriteArrayList;", "value", "isConnected", "Z", "isConnected$service_release", "()Z", "Lcom/xiaomi/fitness/service/a;", "mBinderPool", "Lcom/xiaomi/fitness/service/a;", "Landroid/content/ComponentName;", "mComponentName", "Landroid/content/ComponentName;", "com/xiaomi/fitness/service/ConnectorCore$mBinderDeathRecipient$2$1", "mBinderDeathRecipient$delegate", "Lkotlin/Lazy;", "getMBinderDeathRecipient", "()Lcom/xiaomi/fitness/service/ConnectorCore$mBinderDeathRecipient$2$1;", "mBinderDeathRecipient", "com/xiaomi/fitness/service/ConnectorCore$mConnection$2$1", "mConnection$delegate", "getMConnection", "()Lcom/xiaomi/fitness/service/ConnectorCore$mConnection$2$1;", "mConnection", "<init>", "Companion", "service_release"}, k = 1, mv = {2, 0, 0})
public final class ConnectorCore {

    @NotNull
    private static final String FROM_AFTER_LAUNCH = "from_after_launch";

    @NotNull
    private static final String FROM_DIED = "from_died";

    @NotNull
    public static final String FROM_START = "from_start";

    @NotNull
    private static final String TAG = "ConnectorCore";
    private volatile boolean isConnected;
    private String mAction;

    /* JADX INFO: renamed from: mBinderDeathRecipient$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mBinderDeathRecipient;

    @Nullable
    private a mBinderPool;

    @Nullable
    private ComponentName mComponentName;

    /* JADX INFO: renamed from: mConnection$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mConnection;

    @NotNull
    private final CopyOnWriteArrayList<ServiceConnection> mConnections = new CopyOnWriteArrayList<>();
    private Context mContext;
    private String mPackageName;
    private int mVersion;

    public ConnectorCore() {
        if (ServiceConnector.INSTANCE.isServer()) {
            this.isConnected = true;
        }
        this.mBinderDeathRecipient = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ef4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectorCore.mBinderDeathRecipient_delegate$lambda$0(this.f16582a);
            }
        });
        this.mConnection = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ff4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectorCore.mConnection_delegate$lambda$1(this.f17728a);
            }
        });
    }

    public static /* synthetic */ boolean bindPoolService$default(ConnectorCore connectorCore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = FROM_START;
        }
        return connectorCore.bindPoolService(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectorCore$mBinderDeathRecipient$2$1 getMBinderDeathRecipient() {
        return (ConnectorCore$mBinderDeathRecipient$2$1) this.mBinderDeathRecipient.getValue();
    }

    private final ConnectorCore$mConnection$2$1 getMConnection() {
        return (ConnectorCore$mConnection$2$1) this.mConnection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.service.ConnectorCore$mBinderDeathRecipient$2$1] */
    public static final ConnectorCore$mBinderDeathRecipient$2$1 mBinderDeathRecipient_delegate$lambda$0(final ConnectorCore this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new IBinder.DeathRecipient() { // from class: com.xiaomi.fitness.service.ConnectorCore$mBinderDeathRecipient$2$1
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                IBinder iBinderAsBinder;
                Logger.i("binder died", new Object[0]);
                a aVar = this.this$0.mBinderPool;
                if (aVar != null && (iBinderAsBinder = aVar.asBinder()) != null) {
                    iBinderAsBinder.unlinkToDeath(this, 1);
                }
                this.this$0.isConnected = false;
                CopyOnWriteArrayList copyOnWriteArrayList = this.this$0.mConnections;
                ConnectorCore connectorCore = this.this$0;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(connectorCore.mComponentName);
                }
                this.this$0.mBinderPool = null;
                this.this$0.mComponentName = null;
                this.this$0.unbindRemoteService$service_release();
                this.this$0.bindPoolService("from_died");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.service.ConnectorCore$mConnection$2$1] */
    public static final ConnectorCore$mConnection$2$1 mConnection_delegate$lambda$1(final ConnectorCore this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new ServiceConnection() { // from class: com.xiaomi.fitness.service.ConnectorCore$mConnection$2$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                Logger.i("device service has been connected.", new Object[0]);
                this.this$0.mBinderPool = a.AbstractBinderC0734a.asInterface(service);
                this.this$0.isConnected = true;
                this.this$0.mComponentName = name;
                try {
                    a aVar = this.this$0.mBinderPool;
                    Intrinsics.checkNotNull(aVar);
                    aVar.asBinder().linkToDeath(this.this$0.getMBinderDeathRecipient(), 1);
                } catch (RemoteException e) {
                    Logger.i("link to death error " + e, new Object[0]);
                    e.printStackTrace();
                }
                Iterator it = this.this$0.mConnections.iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(name, service);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                Logger.i("device service has been disconnected", new Object[0]);
                this.this$0.isConnected = false;
                Iterator it = this.this$0.mConnections.iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(name);
                }
            }
        };
    }

    public final void addServiceConnectListener(@NotNull ServiceConnection listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.isConnected) {
            ComponentName componentName = this.mComponentName;
            a aVar = this.mBinderPool;
            listener.onServiceConnected(componentName, aVar != null ? aVar.asBinder() : null);
        }
        if (this.mConnections.contains(listener)) {
            return;
        }
        this.mConnections.add(listener);
    }

    public final boolean bindPoolService(@NotNull String bindReason) {
        Intrinsics.checkNotNullParameter(bindReason, "bindReason");
        Intent intent = new Intent();
        String str = this.mPackageName;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPackageName");
            str = null;
        }
        intent.setPackage(str);
        String str3 = this.mAction;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAction");
            str3 = null;
        }
        intent.setAction(str3);
        intent.putExtra("version", 0);
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        boolean zBindService = context.bindService(intent, getMConnection(), 65);
        String str4 = this.mAction;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAction");
        } else {
            str2 = str4;
        }
        Logger.i(TAG, "bindPoolService: " + bindReason + ", action: " + str2 + ", bind service " + zBindService);
        return zBindService;
    }

    public final void getBinder(int binderCode, @NotNull Function1<? super IBinder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        getBinder(new BinderRequest(0, binderCode), block);
    }

    public final void init(@NotNull Context context, @NotNull String action, @NotNull String pn, int type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(pn, "pn");
        this.mContext = context;
        this.mAction = action;
        this.mPackageName = pn;
    }

    /* JADX INFO: renamed from: isConnected$service_release, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public final void removeServiceConnectListener(@Nullable ServiceConnection listener) {
        this.mConnections.remove(listener);
    }

    public final void unbindRemoteService$service_release() {
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        context.unbindService(getMConnection());
    }

    public final void unbindService() {
        this.mConnections.clear();
        unbindRemoteService$service_release();
    }

    public final void getBinder(@NotNull final BinderRequest request, @NotNull final Function1<? super IBinder, Unit> block) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(block, "block");
        if (ServiceConnector.INSTANCE.isServer()) {
            DefaultBinderPool defaultBinderPoolKt = DefaultBinderPoolKt.getInstance(DefaultBinderPool.INSTANCE);
            Logger.i("create instance(" + request.getBinderCode() + ") in same process", new Object[0]);
            block.invoke2(defaultBinderPoolKt.queryBinder(request));
            return;
        }
        Logger.d(TAG, "getBinder(" + request.getBinderCode() + ") in none device process, process connected:" + this.isConnected);
        addServiceConnectListener(new ServiceConnection() { // from class: com.xiaomi.fitness.service.ConnectorCore.getBinder.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                Logger.i("create instance(" + request.getBinderCode() + ") on service connected", new Object[0]);
                block.invoke2(this.getBinder(request));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                Logger.i("service disconnected", new Object[0]);
            }
        });
    }

    @Nullable
    public final IBinder getBinder(int binderCode) {
        return getBinder(new BinderRequest(0, binderCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBinder getBinder(BinderRequest binderRequest) {
        try {
            a aVar = this.mBinderPool;
            if (aVar == null) {
                Logger.e("mBinderPool is null", new Object[0]);
                return null;
            }
            Intrinsics.checkNotNull(aVar);
            return aVar.queryBinder(binderRequest);
        } catch (RemoteException e) {
            Logger.e("get binder exception", e);
            return null;
        }
    }
}
