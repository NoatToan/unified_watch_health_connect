package com.xiaomi.hm.health.play.card.intelligence;

import android.content.Context;
import android.widget.TextView;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.amap.api.mapcore.util.hl;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.PlayCardCommonLayoutBinding;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneDeviceLifeCycle;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/CallAlertCardRender;", "Lcom/xiaomi/hm/health/play/card/intelligence/SimpleCardRender;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "", "setCommonData", "setDeviceData", "onClear", "", hl.k, "Ljava/lang/Boolean;", "isPhoneOn", "com/xiaomi/hm/health/play/card/intelligence/CallAlertCardRender$observer$2$1", "l", "Lkotlin/Lazy;", "i", "()Lcom/xiaomi/hm/health/play/card/intelligence/CallAlertCardRender$observer$2$1;", "observer", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CallAlertCardRender extends SimpleCardRender {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Boolean isPhoneOn;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy observer;

    public CallAlertCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.observer = LazyKt__LazyJVMKt.lazy(new Function0<CallAlertCardRender$observer$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.play.card.intelligence.CallAlertCardRender$observer$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.play.card.intelligence.CallAlertCardRender$observer$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                final CallAlertCardRender callAlertCardRender = this.a;
                return new LifecycleObserver() { // from class: com.xiaomi.hm.health.play.card.intelligence.CallAlertCardRender$observer$2.1
                    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                    public final void onResume() {
                        callAlertCardRender.isPhoneOn = HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(20) ? Boolean.valueOf(BtPhoneDeviceLifeCycle.INSTANCE.isBtPhoneEnable()) : Boolean.valueOf(HMPersonInfo.getInstance().getMiliConfig().isInComingCallEnabled());
                        callAlertCardRender.updateUi();
                    }
                };
            }
        });
        lifecycleOwner.getLifecycle().addObserver(i());
    }

    private final CallAlertCardRender$observer$2.AnonymousClass1 i() {
        return (CallAlertCardRender$observer$2.AnonymousClass1) this.observer.getValue();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender, com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        getLifecycleOwner().getLifecycle().removeObserver(i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.intelligence.SimpleCardRender, com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams) {
        super.setCommonData(context, uiParams);
        Integer toolNameRes = uiParams.getPlayTool().getToolNameRes();
        if (toolNameRes == null) {
            return;
        }
        ((PlayCardCommonLayoutBinding) getBinding()).llTitle.tvName.setText(toolNameRes.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.intelligence.SimpleCardRender, com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull Context context, @NotNull CardUiData uiParams) {
        Boolean bool = this.isPhoneOn;
        if (bool == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i = zBooleanValue ? R.string.alert_enable : R.string.alarm_off;
        int i2 = zBooleanValue ? R.string.play_tool_phone_on : R.string.play_tool_phone_off;
        TextView textView = ((PlayCardCommonLayoutBinding) getBinding()).tvDesc;
        if (uiParams.getPlayTool().isLongCard()) {
            i = i2;
        }
        textView.setText(i);
    }
}
