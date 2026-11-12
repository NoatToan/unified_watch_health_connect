package com.xiaomi.hm.health.play.card.health;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.databinding.LayoutToolBreatheTrainingBinding;
import com.xiaomi.hm.health.play.analytic.HealthStateEventKt;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.health.BreatheTrainingRender;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/play/card/health/BreatheTrainingRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolBreatheTrainingBinding;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "", "setUiData", "onCardClick", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BreatheTrainingRender extends AbstractCardRender<LayoutToolBreatheTrainingBinding> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context context, View view) {
        HealthStateEventKt.recordEvent(HealthStateEventKt.HEALTH_C, HealthStateEventKt.SLEEP_PRANA);
        Navigator.INSTANCE.startBreatheTraining(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, View view) {
        HealthStateEventKt.recordEvent(HealthStateEventKt.HEALTH_C, HealthStateEventKt.STRESS_PRANA);
        Navigator.INSTANCE.startBreatheTraining(context, 2);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        getBinding().toolBreatheTrainingSleep.setOnClickListener(new View.OnClickListener() { // from class: s70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BreatheTrainingRender.g(context, view);
            }
        });
        getBinding().toolBreatheTrainingStress.setOnClickListener(new View.OnClickListener() { // from class: r70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BreatheTrainingRender.h(context, view);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolBreatheTrainingBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolBreatheTrainingBinding.inflate(inflater, rootView, true);
    }
}
