package com.huami.applet;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.huami.applet.event.HMBleDeviceEvent;
import com.huami.applet.extension.BooleanExt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import com.huami.applet.jsengine.AppleManager;
import com.huami.applet.jslog.JsLog;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/huami/applet/CompanionService;", "Landroid/app/Service;", "", "b", "onCreate", "Landroid/content/Intent;", "intent", "", DataCacher.j, "startId", "onStartCommand", "Landroid/os/IBinder;", "onBind", "onDestroy", "Lcom/huami/applet/event/HMBleDeviceEvent;", "event", "onEventMainThread", "Lcom/huami/applet/jsengine/AppleManager;", "a", "Lkotlin/Lazy;", "()Lcom/huami/applet/jsengine/AppleManager;", "appleManager", "<init>", "()V", "Companion", "ServiceBinder", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class CompanionService extends Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy appleManager = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/applet/CompanionService$Companion;", "", "", "serviceIsRunning", "isRunning", "Z", "()Z", "setRunning", "(Z)V", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("服务启动参数：isRunning:");
                sb.append(CompanionService.INSTANCE.isRunning());
                sb.append(",userId:");
                AppletConfig.Companion companion = AppletConfig.INSTANCE;
                sb.append((Object) companion.getUserId());
                sb.append(",hmBaseDevice:");
                sb.append(companion.getHmBaseDevice());
                return sb.toString();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isRunning() {
            return CompanionService.b;
        }

        public final boolean serviceIsRunning() {
            HMLog.info(ConstantKt.TAG_APPLET, a.a);
            if (isRunning()) {
                AppletConfig.Companion companion = AppletConfig.INSTANCE;
                if (companion.getUserId() != null && companion.getHmBaseDevice() != null) {
                    return true;
                }
            }
            return false;
        }

        public final void setRunning(boolean z) {
            CompanionService.b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/applet/CompanionService$ServiceBinder;", "Landroid/os/Binder;", "", "appleManagerStart", "<init>", "(Lcom/huami/applet/CompanionService;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public final class ServiceBinder extends Binder {
        public ServiceBinder() {
        }

        public final void appleManagerStart() {
            CompanionService.this.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/applet/jsengine/AppleManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AppleManager> {

        /* JADX INFO: renamed from: com.huami.applet.CompanionService$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0287a extends Lambda implements Function0<String> {
            public static final C0287a a = new C0287a();

            public C0287a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "伴生服务开始启动";
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppleManager invoke() {
            HMLog.info(ConstantKt.TAG_APPLET, C0287a.a);
            return new AppleManager(CompanionService.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "伴生服务关闭成功";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "伴生服务开始初始化：flags:" + this.a + ",startId:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "进行startAppleManager";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "CompanionService异常启动，蓝牙接收器禁止绑定";
        }
    }

    private final AppleManager a() {
        return (AppleManager) this.appleManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        BooleanExt withData;
        HMLog.info(ConstantKt.TAG_APPLET, d.a);
        if (INSTANCE.serviceIsRunning()) {
            a().start();
            withData = new WithData(Unit.INSTANCE);
        } else {
            withData = Otherwise.INSTANCE;
        }
        if (withData instanceof Otherwise) {
            HMLog.error$default(ConstantKt.TAG_APPLET, "200700003", null, e.a, 4, null);
        } else {
            if (!(withData instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((WithData) withData).getData();
        }
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        return new ServiceBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        b = true;
        UtilsKt.printLibInfo();
        b();
        EventBus.getDefault().register(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        b = false;
        a().destroy();
        EventBus.getDefault().unregister(this);
        HMLog.info(ConstantKt.TAG_APPLET, b.a);
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull HMBleDeviceEvent event) {
        AppletConfig.INSTANCE.setHmBleDeviceEvent(event);
        if (event.isDisconnected()) {
            JsLog.cleanJsLog();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        HMLog.info(ConstantKt.TAG_APPLET, new c(flags, startId));
        b();
        return 1;
    }
}
