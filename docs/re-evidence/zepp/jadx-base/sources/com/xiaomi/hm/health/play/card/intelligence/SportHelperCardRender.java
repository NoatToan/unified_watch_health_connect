package com.xiaomi.hm.health.play.card.intelligence;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.p008lifecycle.LifecycleOwner;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.intervalrun.ui.IntervalTrainingActivity;
import com.huami.watch.companion.ui.activity.SportSortV2Activity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databinding.PlayCardSportHelperBinding;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.intelligence.SportHelperCardRender;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/SportHelperCardRender;", "Lcom/xiaomi/hm/health/play/card/AbstractDeviceCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardSportHelperBinding;", "", "desc", "", "m", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "setCommonData", "setDeviceData", "onDeviceNotConnected", "onDeviceNotActive", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportHelperCardRender extends AbstractDeviceCardRender<PlayCardSportHelperBinding> {

    @NotNull
    private static final String k = "SportHelperCardRender";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device is null abort click";
        }
    }

    public SportHelperCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HMDeviceSource hMDeviceSource, CardUiData cardUiData, Context context, View view) {
        Unit unit;
        if (hMDeviceSource == HMDeviceSource.MILI_ANETO) {
            cardUiData.getPlayTool().getTool().open(context, hMDeviceSource);
            return;
        }
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null) {
            unit = null;
        } else {
            SportSortV2Activity.to(context, currentDevice.info().getHuamiModel(), DeviceUtil.isRomSupportHideSportItem(currentDevice));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            HMLog.error$default(k, null, null, a.a, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) IntervalTrainingActivity.class).addFlags(536870912));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(@StringRes int desc) {
        ExtensionsKt.gone(((PlayCardSportHelperBinding) getBinding()).tvSportData);
        ExtensionsKt.gone(((PlayCardSportHelperBinding) getBinding()).tvIntervalTraining);
        TextView textView = ((PlayCardSportHelperBinding) getBinding()).tvDesc;
        ExtensionsKt.visible(textView);
        textView.setText(desc);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotActive() {
        m(R.string.play_device_not_active);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotConnected() {
        m(R.string.training_playing_hr_exception_device_disconnect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams) {
        Integer toolNameRes = uiParams.getPlayTool().getToolNameRes();
        if (toolNameRes != null) {
            ((PlayCardSportHelperBinding) getBinding()).llTitle.tvName.setText(toolNameRes.intValue());
        }
        Integer toolIconRes = uiParams.getPlayTool().getToolIconRes();
        if (toolIconRes == null) {
            return;
        }
        ((PlayCardSportHelperBinding) getBinding()).llTitle.ivIcon.setImageResource(toolIconRes.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull final Context context, @NotNull final CardUiData uiParams) {
        final HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        ExtensionsKt.gone(((PlayCardSportHelperBinding) getBinding()).tvDesc);
        ExtensionsKt.visible(((PlayCardSportHelperBinding) getBinding()).tvSportData);
        if (boundDeviceSource == HMDeviceSource.MILI_ANETO) {
            ExtensionsKt.gone(((PlayCardSportHelperBinding) getBinding()).tvIntervalTraining);
        } else {
            ExtensionsKt.visible(((PlayCardSportHelperBinding) getBinding()).tvIntervalTraining);
        }
        ((PlayCardSportHelperBinding) getBinding()).tvSportData.setOnClickListener(new View.OnClickListener() { // from class: fa7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportHelperCardRender.k(boundDeviceSource, uiParams, context, view);
            }
        });
        ((PlayCardSportHelperBinding) getBinding()).tvIntervalTraining.setOnClickListener(new View.OnClickListener() { // from class: ea7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportHelperCardRender.l(context, view);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardSportHelperBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardSportHelperBinding.inflate(inflater, rootView, true);
    }
}
