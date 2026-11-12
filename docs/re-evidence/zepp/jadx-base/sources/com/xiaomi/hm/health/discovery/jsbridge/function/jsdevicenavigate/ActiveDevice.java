package com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate;

import android.content.Context;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import com.xiaomi.hm.health.push.Type;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001d\u0010\u0016\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/jsdevicenavigate/ActiveDevice;", "Lcom/xiaomi/hm/health/discovery/jsbridge/function/jsdevicenavigate/IJsDeviceNavigate;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "data", "Lcom/xiaomi/hm/health/databases/model/Device;", "c", "position", "", "match", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Type.JUMP_MESSAGE, "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "b", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ActiveDevice implements IJsDeviceNavigate, KoinComponentAdapter {

    @NotNull
    private static final String c = "ActiveDevice";

    @NotNull
    private static final String d = "mac";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getUnUsedDevice fail: " + this.a;
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
            return "toActiveDevice null!";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActiveDevice() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceRepositoryApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryApi>() { // from class: com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate.ActiveDevice$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceRepositoryApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate.ActiveDevice$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceXNavigator invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceRepositoryApi a() {
        return (DeviceRepositoryApi) this.deviceRepositoryApi.getValue();
    }

    private final DeviceXNavigator b() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    private final Device c(String data) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String string = new JSONObject(data).getString("mac");
            Device deviceFindDeviceByAddress = a().findDeviceByAddress(string.toLowerCase(Locale.getDefault()));
            if (deviceFindDeviceByAddress == null) {
                deviceFindDeviceByAddress = a().findBoundDeviceByAddress(string.toUpperCase(Locale.getDefault()));
            }
            objM3845constructorimpl = Result.m3845constructorimpl(deviceFindDeviceByAddress);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(c, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Device) objM3845constructorimpl;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate.IJsDeviceNavigate
    public void jump(@NotNull Context context, @NotNull String position, @Nullable String data) {
        Device deviceC = c(data);
        if (deviceC == null) {
            HMLog.error$default(c, null, null, b.a, 6, null);
        } else {
            b().navigateToUnused(context, deviceC);
        }
    }

    @Override // com.xiaomi.hm.health.discovery.jsbridge.function.jsdevicenavigate.IJsDeviceNavigate
    public boolean match(@NotNull String position) {
        return Pattern.matches(NavigateContent.APP_GOTO_ACTIVE_DEVICE, position);
    }
}
