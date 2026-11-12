package com.xiaomi.hm.health.play.card.intelligence;

import android.content.Context;
import android.widget.TextView;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.amap.api.mapcore.util.hl;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.data.AppsNotificationRepo;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databinding.PlayCardCommonLayoutBinding;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.di.PlayKoinModuleKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/AppNotifyCardRender;", "Lcom/xiaomi/hm/health/play/card/intelligence/SimpleCardRender;", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "", hl.k, "", z.j, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "setDeviceData", "onClear", "com/xiaomi/hm/health/play/card/intelligence/AppNotifyCardRender$observer$2$1", "Lkotlin/Lazy;", "i", "()Lcom/xiaomi/hm/health/play/card/intelligence/AppNotifyCardRender$observer$2$1;", "observer", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppNotifyCardRender extends SimpleCardRender {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy observer;

    public AppNotifyCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.observer = LazyKt__LazyJVMKt.lazy(new Function0<AppNotifyCardRender$observer$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.play.card.intelligence.AppNotifyCardRender$observer$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.play.card.intelligence.AppNotifyCardRender$observer$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                final AppNotifyCardRender appNotifyCardRender = this.a;
                return new LifecycleObserver() { // from class: com.xiaomi.hm.health.play.card.intelligence.AppNotifyCardRender$observer$2.1
                    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                    public final void onResume() {
                        HMDeviceType majorDeviceType = PlayKoinModuleKt.getMajorDeviceType();
                        HMDeviceType hMDeviceType = HMDeviceType.MILI;
                        if (majorDeviceType == hMDeviceType) {
                            NotificationManager.getInstance().getAppsRepo().setCurrentDeviceType(hMDeviceType);
                            appNotifyCardRender.updateUi();
                        }
                    }
                };
            }
        });
        lifecycleOwner.getLifecycle().addObserver(i());
    }

    private final AppNotifyCardRender$observer$2.AnonymousClass1 i() {
        return (AppNotifyCardRender$observer$2.AnonymousClass1) this.observer.getValue();
    }

    private final boolean j() {
        return AppsNotificationRepo.isNotificationOn$default(NotificationManager.getInstance().getAppsRepo(), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k(CardUiData uiParams) {
        ((PlayCardCommonLayoutBinding) getBinding()).tvDesc.setText(uiParams.getPlayTool().isLongCard() ? R.string.tool_app_alert_tips : R.string.play_tool_notify_short);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender, com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        getLifecycleOwner().getLifecycle().removeObserver(i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.intelligence.SimpleCardRender, com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (PlayKoinModuleKt.getMajorDeviceType() == HMDeviceType.WATCH) {
            k(uiParams);
            return;
        }
        boolean zJ = j();
        int i = zJ ? R.string.alert_enable : R.string.alarm_off;
        int i2 = zJ ? R.string.play_tool_notify_on : R.string.play_tool_notify_off;
        TextView textView = ((PlayCardCommonLayoutBinding) getBinding()).tvDesc;
        if (uiParams.getPlayTool().isLongCard()) {
            i = i2;
        }
        textView.setText(i);
    }
}
