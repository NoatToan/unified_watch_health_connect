package com.xiaomi.fitness.devicesettings.di;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.common.extensions.HeartRateMonitorExtKt;
import com.xiaomi.fitness.devicesettings.di.HealthMonitorManagerImpl;
import com.xiaomi.fitness.devicesettings.export.HealthMonitorManager;
import com.xiaomi.onetrack.c.q;
import defpackage.ls9;
import defpackage.s7r;
import defpackage.ur9;
import defpackage.xc6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b2\u00103JI\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJY\u0010\u0011\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jc\u0010\u0017\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/HealthMonitorManagerImpl;", "Lcom/xiaomi/fitness/devicesettings/export/HealthMonitorManager;", "", "did", "method", "Lkotlin/Function1;", "Lls9;", "", "onSuccess", "", "onError", "readHrConfig", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", q.f13857a, "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "successCallback", "failureCallback", "setHrConfig", "(Ljava/lang/String;Ljava/lang/String;Lls9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ls7r;", "packet", "", "needResponse", "deviceApiCall", "(Ljava/lang/String;Ls7r;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "deepCopy", "(Lls9;)Lls9;", "loadHrOpenContinuous", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "hrOpenContinuous", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "clearOld", "()V", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "deviceContact", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "getDeviceContact", "()Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "setDeviceContact", "(Lcom/xiaomi/fitness/device/contact/export/DeviceContact;)V", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "readConfig", "Lls9;", "<init>", "(Lcom/xiaomi/fitness/device/contact/export/DeviceContact;Lcom/google/gson/Gson;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthMonitorManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthMonitorManagerImpl.kt\ncom/xiaomi/fitness/devicesettings/di/HealthMonitorManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
public final class HealthMonitorManagerImpl implements HealthMonitorManager {

    @NotNull
    private DeviceContact deviceContact;

    @NotNull
    private Gson gson;

    @Nullable
    private ls9 readConfig;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.di.HealthMonitorManagerImpl$deviceApiCall$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/devicesettings/di/HealthMonitorManagerImpl$deviceApiCall$1", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements OnSyncCallback {
        final /* synthetic */ Function1<Integer, Unit> $failureCallback;
        final /* synthetic */ String $method;
        final /* synthetic */ Function1<SyncResult, Unit> $successCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Function1<? super SyncResult, Unit> function1, Function1<? super Integer, Unit> function2) {
            this.$method = str;
            this.$successCallback = function1;
            this.$failureCallback = function2;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String did, int type, int code) {
            AnyExtKt.main$default(null, new HealthMonitorManagerImpl$deviceApiCall$1$onError$1(this.$method, type, code, this.$failureCallback, null), 1, null);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String did, int type, SyncResult result) {
            AnyExtKt.main$default(null, new HealthMonitorManagerImpl$deviceApiCall$1$onSuccess$1(result, this.$method, this.$successCallback, this, did, type, this.$failureCallback, null), 1, null);
        }
    }

    public HealthMonitorManagerImpl(@NotNull DeviceContact deviceContact, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(deviceContact, "deviceContact");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.deviceContact = deviceContact;
        this.gson = gson;
    }

    private final ls9 deepCopy(ls9 ls9Var) {
        Gson gson = this.gson;
        Object objFromJson = gson.fromJson(gson.toJson(ls9Var), (Class<Object>) ls9.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (ls9) objFromJson;
    }

    private final void deviceApiCall(String did, s7r packet, boolean needResponse, String method, Function1<? super SyncResult, Unit> successCallback, Function1<? super Integer, Unit> failureCallback) {
        DeviceContact.DefaultImpls.call$default(this.deviceContact, did, packet, needResponse, new AnonymousClass1(method, successCallback, failureCallback), 0, 16, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deviceApiCall$default(HealthMonitorManagerImpl healthMonitorManagerImpl, String str, s7r s7rVar, boolean z, String str2, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = "";
        }
        healthMonitorManagerImpl.deviceApiCall(str, s7rVar, z, str2, (i & 16) != 0 ? null : function1, (i & 32) != 0 ? null : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hrOpenContinuous$lambda$2(Function0 onSuccess, SyncResult it) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(it, "it");
        onSuccess.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Unit loadHrOpenContinuous$lambda$0(Function1 onSuccess, ls9 hrMonitor) {
        boolean z;
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(hrMonitor, "hrMonitor");
        if (hrMonitor.c == 0) {
            z = hrMonitor.d == 1;
        }
        onSuccess.invoke2(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private final void readHrConfig(String did, String method, final Function1<? super ls9, Unit> onSuccess, final Function1<? super Integer, Unit> onError) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 10;
        deviceApiCall(did, s7rVar, true, method, new Function1() { // from class: h0c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthMonitorManagerImpl.readHrConfig$lambda$6(this.f19535a, onSuccess, onError, (SyncResult) obj);
            }
        }, onError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readHrConfig$lambda$6(HealthMonitorManagerImpl this$0, Function1 onSuccess, Function1 function1, SyncResult syncResult) {
        ur9 ur9VarU;
        ls9 ls9VarZ;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(syncResult, "syncResult");
        s7r packet = syncResult.getPacket();
        if (packet != null && (ur9VarU = packet.u()) != null && (ls9VarZ = ur9VarU.z()) != null) {
            xc6.d("loadHrOpenContinuous " + ls9VarZ.c + " " + ls9VarZ.d);
            this$0.readConfig = ls9VarZ;
            onSuccess.invoke2(ls9VarZ);
            Unit unit = Unit.INSTANCE;
            xc6.d("loadHrOpenContinuous heartRateMonitor is null");
            if (function1 != null) {
                function1.invoke2(-1);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHrConfig(String did, String method, ls9 config, final Function1<? super SyncResult, Unit> successCallback, Function1<? super Integer, Unit> failureCallback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 11;
        ur9 ur9Var = new ur9();
        ur9Var.o0(config);
        s7rVar.S(ur9Var);
        deviceApiCall(did, s7rVar, true, method, new Function1() { // from class: j0c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthMonitorManagerImpl.setHrConfig$lambda$9(successCallback, (SyncResult) obj);
            }
        }, failureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHrConfig$lambda$9(Function1 function1, SyncResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function1 != null) {
            function1.invoke2(it);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.HealthMonitorManager
    public void clearOld() {
        this.readConfig = null;
    }

    @NotNull
    public final DeviceContact getDeviceContact() {
        return this.deviceContact;
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.HealthMonitorManager
    public void hrOpenContinuous(@NotNull String did, @NotNull final Function0<Unit> onSuccess, @Nullable Function1<? super Integer, Unit> onError) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        ls9 ls9Var = this.readConfig;
        if (ls9Var == null) {
            xc6.d("hrOpenContinuous readConfig is null");
            if (onError != null) {
                onError.invoke2(-1);
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(ls9Var);
        ls9 ls9VarDeepCopy = deepCopy(ls9Var);
        int i = ls9VarDeepCopy.c;
        boolean z = false;
        ls9VarDeepCopy.c = 0;
        ls9VarDeepCopy.d = 1;
        if (ls9VarDeepCopy.f && HeartRateMonitorExtKt.isWarningAvailable(ls9VarDeepCopy)) {
            z = true;
        }
        ls9VarDeepCopy.f = z;
        setHrConfig(did, "openContinuous", ls9VarDeepCopy, new Function1() { // from class: g0c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthMonitorManagerImpl.hrOpenContinuous$lambda$2(onSuccess, (SyncResult) obj);
            }
        }, onError);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.HealthMonitorManager
    public void loadHrOpenContinuous(@NotNull String did, @NotNull final Function1<? super Boolean, Unit> onSuccess, @Nullable Function1<? super Integer, Unit> onError) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        readHrConfig(did, "loadHrOpenContinuous", new Function1() { // from class: i0c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthMonitorManagerImpl.loadHrOpenContinuous$lambda$0(onSuccess, (ls9) obj);
            }
        }, onError);
    }

    public final void setDeviceContact(@NotNull DeviceContact deviceContact) {
        Intrinsics.checkNotNullParameter(deviceContact, "<set-?>");
        this.deviceContact = deviceContact;
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }
}
