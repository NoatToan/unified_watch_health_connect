package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.sleep.rhythm.SleepDayRhythmMonitorEntranceHolder;
import com.xiaomi.fitness.health.sleep.ui.SleepHealthBannerCardSetLayout;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import defpackage.hce;
import defpackage.nuf;
import defpackage.qxi;
import defpackage.tbe;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepHealthBannerCardSetLayout;", "Landroid/widget/LinearLayout;", "", "currentPosition", "", "setSleepHealthBanner", "(Ljava/lang/Integer;)V", "", "visible", "Lkotlin/Function0;", "clickListener", "updateSleepInterfereVisibility", "(ZLkotlin/jvm/functions/Function0;)V", "Ltbe;", "binding", "Ltbe;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepDayRhythmMonitorEntranceHolder;", "sleepDayRhythmMonitorEntranceHolder", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepDayRhythmMonitorEntranceHolder;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepHealthBannerCardSetLayout extends LinearLayout {

    @NotNull
    private final tbe binding;

    @Nullable
    private SleepDayRhythmMonitorEntranceHolder sleepDayRhythmMonitorEntranceHolder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepHealthBannerCardSetLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setSleepHealthBanner$default(SleepHealthBannerCardSetLayout sleepHealthBannerCardSetLayout, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        sleepHealthBannerCardSetLayout.setSleepHealthBanner(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setSleepHealthBanner$lambda$0(WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.contains$default((CharSequence) it.getModel(), (CharSequence) "miwear.watch.n66cn", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) it.getModel(), (CharSequence) "miwear.watch.n66nfc", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) it.getModel(), (CharSequence) "mijia.watch.n62s", false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSleepHealthBanner$lambda$1(SleepHealthBannerCardSetLayout this$0, ConstraintLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        healthPageExtKt.goToHealthVisitDoctorPage(context, 78);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateSleepInterfereVisibility$default(SleepHealthBannerCardSetLayout sleepHealthBannerCardSetLayout, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        sleepHealthBannerCardSetLayout.updateSleepInterfereVisibility(z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSleepInterfereVisibility$lambda$2(Function0 function0, ConstraintLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSleepHealthBanner(@Nullable Integer currentPosition) {
        WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: pmm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepHealthBannerCardSetLayout.setSleepHealthBanner$lambda$0((WearableProduct) obj));
            }
        });
        if (AppUtil.INSTANCE.isPlayChannel()) {
            LinearLayout healthSleepBannerCardSet = this.binding.D;
            Intrinsics.checkNotNullExpressionValue(healthSleepBannerCardSet, "healthSleepBannerCardSet");
            ExtUtilKt.gone(healthSleepBannerCardSet);
            return;
        }
        ViewExtKt.clickWithTrigger$default(this.binding.E, 0L, new Function1() { // from class: qmm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepHealthBannerCardSetLayout.setSleepHealthBanner$lambda$1(this.f31664a, (ConstraintLayout) obj);
            }
        }, 1, null);
        nuf.f(this.binding.E);
        HealthBannerCardSetView healthBannerCardSet = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(healthBannerCardSet, "healthBannerCardSet");
        PingAnHealthExtKt.bindOneBanner(healthBannerCardSet, 7);
        LinearLayout healthSleepBannerCardSet2 = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(healthSleepBannerCardSet2, "healthSleepBannerCardSet");
        ExtUtilKt.visible(healthSleepBannerCardSet2);
        if (wearableProduct == null) {
            ConstraintLayout healthSleepResearchLayoutSet = this.binding.J;
            Intrinsics.checkNotNullExpressionValue(healthSleepResearchLayoutSet, "healthSleepResearchLayoutSet");
            ExtUtilKt.gone(healthSleepResearchLayoutSet);
            return;
        }
        ConstraintLayout healthSleepResearchLayoutSet2 = this.binding.J;
        Intrinsics.checkNotNullExpressionValue(healthSleepResearchLayoutSet2, "healthSleepResearchLayoutSet");
        ExtUtilKt.visible(healthSleepResearchLayoutSet2);
        hce cardSleepRhythmMonitorEntrance = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(cardSleepRhythmMonitorEntrance, "cardSleepRhythmMonitorEntrance");
        this.sleepDayRhythmMonitorEntranceHolder = new SleepDayRhythmMonitorEntranceHolder(cardSleepRhythmMonitorEntrance);
        this.binding.A.getRoot().setTag(SleepTrackHelper.INSTANCE.getSleepRhythmCardExposeContent(currentPosition != null ? currentPosition.intValue() : 0));
        Unit unit = Unit.INSTANCE;
    }

    public final void updateSleepInterfereVisibility(boolean visible, @Nullable final Function0<Unit> clickListener) {
        this.binding.K.A.setVisibility(visible ? 0 : 8);
        if (visible) {
            this.binding.K.F.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.B0, 21, 21));
            ViewExtKt.clickWithTrigger$default(this.binding.K.A, 0L, new Function1() { // from class: omm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepHealthBannerCardSetLayout.updateSleepInterfereVisibility$lambda$2(clickListener, (ConstraintLayout) obj);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepHealthBannerCardSetLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SleepHealthBannerCardSetLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepHealthBannerCardSetLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        tbe tbeVarA0 = tbe.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(tbeVarA0, "inflate(...)");
        this.binding = tbeVarA0;
    }
}
