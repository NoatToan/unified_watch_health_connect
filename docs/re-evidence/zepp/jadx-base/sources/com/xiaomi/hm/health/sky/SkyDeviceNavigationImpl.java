package com.xiaomi.hm.health.sky;

import android.content.Context;
import android.content.Intent;
import com.huami.assistant.ui.activity.AlarmListActivity;
import com.huami.sky.ui.setting.AlarmItem;
import com.huami.sky.ui.setting.DeviceNavigation;
import com.huami.sky.ui.setting.SettingItemType;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.ui.smartplay.HuamiOSAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u000e\u001a/\u0012\u0004\u0012\u00020\u0006\u0012#\u0012!\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007j\u0002`\r\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\u0012\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/sky/SkyDeviceNavigationImpl;", "Lcom/huami/sky/ui/setting/DeviceNavigation;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/sky/ui/setting/SettingItemType;", "itemType", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sky/ui/setting/SkySettingNavigation;", "getTitleAndNavigationByItemType", "a", "Lkotlin/Lazy;", "()Landroid/content/Context;", "appContext", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SkyDeviceNavigationImpl implements DeviceNavigation, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy appContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Context, Unit> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceType hMDeviceType) {
            super(1);
            this.a = hMDeviceType;
        }

        public final void a(@NotNull Context context) {
            HMDeviceType hMDeviceType = this.a;
            if (hMDeviceType != HMDeviceType.MILI) {
                if (hMDeviceType == HMDeviceType.WATCH) {
                    context.startActivity(new Intent(context, (Class<?>) AlarmListActivity.class));
                }
            } else if (AlarmClockManager.isSupportAlarmModule()) {
                HuamiOSAlarmActivity.navigation2Alarm(context, true);
            } else {
                MiBandAlarmActivity.navigation2Alarm(context, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkyDeviceNavigationImpl() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.appContext = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<Context>() { // from class: com.xiaomi.hm.health.sky.SkyDeviceNavigationImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Context getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), qualifier, objArr);
            }
        });
    }

    private final Context a() {
        return (Context) this.appContext.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.sky.ui.setting.DeviceNavigation
    @Nullable
    public Pair<String, Function1<Context, Unit>> getTitleAndNavigationByItemType(@NotNull SettingItemType itemType) {
        HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
        if (Intrinsics.areEqual(itemType, AlarmItem.INSTANCE)) {
            return TuplesKt.to(a().getString(R.string.setting_app_alarm), new a(majorDeviceType));
        }
        return null;
    }
}
