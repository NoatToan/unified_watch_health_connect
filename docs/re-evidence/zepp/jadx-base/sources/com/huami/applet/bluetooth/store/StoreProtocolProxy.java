package com.huami.applet.bluetooth.store;

import android.content.Context;
import com.huami.applet.AppletConfig;
import com.huami.applet.CompanionService;
import com.huami.applet.CompanionStarterKt;
import com.huami.applet.ConstantKt;
import com.huami.applet.applet_dependent_service.AppletDepService;
import com.huami.applet.extension.BooleanExt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import com.huami.applet.jsengine.exception.AppletException;
import com.huami.applet.utils.AppletDepServiceHelper;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u0007\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\t\u0010\b\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J\u001d\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0096\u0001J\u0016\u0010\u0014\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H\u0016J\u001e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H\u0016J\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H\u0016R\u0016\u0010\u001a\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/applet/bluetooth/store/StoreProtocolProxy;", "Lcom/huami/applet/bluetooth/store/StoreProtocol;", "Lcom/huami/applet/bluetooth/store/Callback;", "callback", "Lkotlin/Function0;", "", "invoke", "a", "clearContainer", "", "byteArray", "dispatchResult", "", "path", "", "installCompanionApp", "Lkotlin/Function1;", "", "result", "setUninstallListener", "getInstalledApps", "size", "haveInstallationConditions", "appId", "uninstallApp", "Lcom/huami/applet/bluetooth/store/StoreProtocol;", "storeProtocolImpl", "<init>", "(Lcom/huami/applet/bluetooth/store/StoreProtocol;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class StoreProtocolProxy implements StoreProtocol {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final StoreProtocol storeProtocolImpl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请先启动CompanionService或CompanionService启动异常";
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
            StringBuilder sb = new StringBuilder();
            sb.append("Restart companion service here! context:");
            AppletConfig.Companion companion = AppletConfig.INSTANCE;
            sb.append(companion.getAppContext());
            sb.append(", hmBaseDevice:");
            sb.append(companion.getHmBaseDevice());
            sb.append(", userId:");
            sb.append((Object) companion.getUserId());
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
            return Intrinsics.stringPlus("Restart companion service in js engine error:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Callback<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Callback<String> callback) {
            super(0);
            this.b = callback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StoreProtocolProxy.this.storeProtocolImpl.getInstalledApps(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int b;
        public final /* synthetic */ Callback<Integer> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Callback<Integer> callback) {
            super(0);
            this.b = i;
            this.c = callback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StoreProtocolProxy.this.storeProtocolImpl.haveInstallationConditions(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int b;
        public final /* synthetic */ Callback<Integer> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, Callback<Integer> callback) {
            super(0);
            this.b = i;
            this.c = callback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StoreProtocolProxy.this.storeProtocolImpl.uninstallApp(this.b, this.c);
        }
    }

    public StoreProtocolProxy(@NotNull StoreProtocol storeProtocol) {
        this.storeProtocolImpl = storeProtocol;
    }

    private final void a(Callback<?> callback, Function0<Unit> invoke) {
        BooleanExt withData;
        String userId;
        AppletDepService depService;
        Context contextObtainApplicationContext;
        if (CompanionService.INSTANCE.serviceIsRunning()) {
            invoke.invoke();
            withData = new WithData(Unit.INSTANCE);
        } else {
            withData = Otherwise.INSTANCE;
        }
        if (!(withData instanceof Otherwise)) {
            if (!(withData instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((WithData) withData).getData();
            return;
        }
        callback.failed(new AppletException("请先启动CompanionService!", 0, 2, null));
        HMLog.error$default(ConstantKt.TAG_APPLET, "200700003", null, a.a, 4, null);
        try {
            HMLog.error$default(ConstantKt.TAG_APPLET, null, null, b.a, 6, null);
            AppletConfig.Companion companion = AppletConfig.INSTANCE;
            HMBaseDevice hmBaseDevice = companion.getHmBaseDevice();
            if (hmBaseDevice != null && (userId = companion.getUserId()) != null && (depService = AppletDepServiceHelper.INSTANCE.getDepService()) != null && (contextObtainApplicationContext = depService.obtainApplicationContext()) != null) {
                CompanionStarterKt.startCompanionService$default(contextObtainApplicationContext, hmBaseDevice, userId, null, null, 24, null);
            }
        } catch (Exception e2) {
            HMLog.error$default(ConstantKt.TAG_APPLET, null, null, new c(e2), 6, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void clearContainer() {
        this.storeProtocolImpl.clearContainer();
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void dispatchResult(@NotNull byte[] byteArray) {
        this.storeProtocolImpl.dispatchResult(byteArray);
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void getInstalledApps(@NotNull Callback<String> callback) {
        a(callback, new d(callback));
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void haveInstallationConditions(int size, @NotNull Callback<Integer> callback) {
        a(callback, new e(size, callback));
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public boolean installCompanionApp(@NotNull String path) {
        return this.storeProtocolImpl.installCompanionApp(path);
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void setUninstallListener(@NotNull Function1<? super Integer, Unit> result) {
        this.storeProtocolImpl.setUninstallListener(result);
    }

    @Override // com.huami.applet.bluetooth.store.StoreProtocol
    public void uninstallApp(int appId, @NotNull Callback<Integer> callback) {
        a(callback, new f(appId, callback));
    }
}
