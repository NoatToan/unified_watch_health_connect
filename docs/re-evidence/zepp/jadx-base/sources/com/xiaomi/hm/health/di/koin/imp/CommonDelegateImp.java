package com.xiaomi.hm.health.di.koin.imp;

import android.app.Activity;
import android.content.Context;
import com.huami.account.ICommonDelegate;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.httpkit.HttpKitHelper;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import com.xiaomi.hm.health.utils.Utils;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/CommonDelegateImp;", "Lcom/huami/account/ICommonDelegate;", "Lorg/koin/core/component/KoinComponent;", "", "key", "value", "", "setProperty", "defaultValue", "getProperty", "", "Lcom/xiaomi/hm/health/databases/model/HmProperty;", "list", "setProperties", "", "isForce", "postPropertyToServer", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/io/File;", "zipFile", "archiveDir", "", "type", "getBoundDeviceId", "getSyncedStatusProperty", "Landroid/app/Activity;", "getTopActivity", "initHttpConfig", "isForeground", "getChannelName", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceMangerApi", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CommonDelegateImp implements ICommonDelegate, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceMangerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonDelegateImp() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceMangerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.di.koin.imp.CommonDelegateImp$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceMangerApi.getValue();
    }

    @Override // com.huami.account.ICommonDelegate
    public boolean archiveDir(@NotNull Context context, @NotNull File zipFile) {
        return Utils.archiveDir(FileUtils.getLogRootDir(context), zipFile);
    }

    @Override // com.huami.account.ICommonDelegate
    @Nullable
    public String getBoundDeviceId(int type) {
        return a().getBoundDeviceId(HMDeviceType.fromValue(type));
    }

    @Override // com.huami.account.ICommonDelegate
    @NotNull
    public String getChannelName() {
        return HMConfig.Channel.name();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.account.ICommonDelegate
    @Nullable
    public String getProperty(@NotNull String key, @Nullable String defaultValue) {
        return HMPropertyUtil.getProperty(key, defaultValue);
    }

    @Override // com.huami.account.ICommonDelegate
    public int getSyncedStatusProperty() {
        return 1;
    }

    @Override // com.huami.account.ICommonDelegate
    @Nullable
    public Activity getTopActivity() {
        return BraceletForegroundCallBack.getTopActivity();
    }

    @Override // com.huami.account.ICommonDelegate
    public void initHttpConfig() {
        HttpKitHelper.INSTANCE.initHttp();
    }

    @Override // com.huami.account.ICommonDelegate
    public boolean isForeground() {
        return BraceletForegroundCallBack.getInstance().isForeground();
    }

    @Override // com.huami.account.ICommonDelegate
    public void postPropertyToServer(boolean isForce) {
        HMPropertyUtil.postPropertisToServer(isForce);
    }

    @Override // com.huami.account.ICommonDelegate
    public void setProperties(@NotNull List<? extends HmProperty> list) {
        HMPropertyUtil.setProperties(list);
    }

    @Override // com.huami.account.ICommonDelegate
    public void setProperty(@NotNull String key, @Nullable String value) {
        HMPropertyUtil.setProperty(key, value);
    }
}
