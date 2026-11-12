package com.huami.sky.ui.setting;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R?\u0010\u0013\u001a%\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/ui/setting/SettingItemType;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/sky/ui/setting/DeviceNavigation;", "a", "Lkotlin/Lazy;", "getDeviceNavigation", "()Lcom/huami/sky/ui/setting/DeviceNavigation;", "deviceNavigation", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sky/ui/setting/SkySettingNavigation;", "b", "Lkotlin/jvm/functions/Function1;", "getNavigation", "()Lkotlin/jvm/functions/Function1;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "()V", "Lcom/huami/sky/ui/setting/PlaySettingItem;", "Lcom/huami/sky/ui/setting/AlarmItem;", "Lcom/huami/sky/ui/setting/UserFeedBackItem;", "Lcom/huami/sky/ui/setting/ScientificDescItem;", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class SettingItemType implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceNavigation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Function1<Context, Unit> navigation;

    /* JADX WARN: Multi-variable type inference failed */
    private SettingItemType() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceNavigation = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceNavigation>() { // from class: com.huami.sky.ui.setting.SettingItemType$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.ui.setting.DeviceNavigation, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceNavigation invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceNavigation.class), qualifier, objArr);
            }
        });
    }

    public /* synthetic */ SettingItemType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final DeviceNavigation getDeviceNavigation() {
        return (DeviceNavigation) this.deviceNavigation.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public Function1<Context, Unit> getNavigation() {
        return this.navigation;
    }
}
