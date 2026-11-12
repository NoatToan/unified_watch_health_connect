package com.xiaomi.hm.health.play.card.sport;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databinding.PlayCardSportLayoutBinding;
import com.xiaomi.hm.health.dataprocess.HeartRateInfo;
import com.xiaomi.hm.health.eventbus.EventUnitChanged;
import com.xiaomi.hm.health.healthdata.ext.DrawableExKt;
import com.xiaomi.hm.health.play.bean.SportDataBean;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.DataNotifiers;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import com.xiaomi.hm.health.play.card.sport.SportCardBaseRender;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001OB\u000f\u0012\u0006\u00105\u001a\u000200¢\u0006\u0004\bM\u0010NJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!J\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\rJ\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!J\u0010\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020\rJ\u0006\u0010)\u001a\u00020\rJ$\u0010+\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0*2\u0006\u0010\u0007\u001a\u00020\u0006H&J\"\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0*2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010-\u001a\u00020\bH&J\u0018\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010/\u001a\u00020\bH\u0016R\u0019\u00105\u001a\u0002008\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010;\u001a\u0002068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R%\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0<8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060<8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0016\u0010J\u001a\u00020\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010I¨\u0006P"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/SportCardBaseRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardSportLayoutBinding;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/bean/SportDataBean;", "data", "", "o", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", GoogleApiAvailabilityLight.b, "", "days", "m", "", "isTodayData", "l", "color", hl.k, "initData", "setUiData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "onCardClick", "distance", "dataType", "", "formatDistance", "", "pace", "convertToPaceMultiplyKilo", "time", "formatTime", "convertToSpeed", "avgHr", "formatAvgHr", "getDistanceUnit", "Lkotlin/Triple;", "convertToShowData", "getDataDesc", "showTodayUi", "showHasHistoryData", "onClear", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/xiaomi/hm/health/play/card/sport/ISportDataManager;", "h", "Lkotlin/Lazy;", "getSportDataManagerIml", "()Lcom/xiaomi/hm/health/play/card/sport/ISportDataManager;", "sportDataManagerIml", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/eventbus/EventUnitChanged;", "i", "getUnitLiveData", "()Landroidx/lifecycle/LiveData;", "unitLiveData", "Landroid/graphics/drawable/Drawable;", z.j, "Landroid/graphics/drawable/Drawable;", "iconSvg", "getSportLiveData", "sportLiveData", "getIconColor", "()I", "iconColor", "getCardBg", "cardBg", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class SportCardBaseRender extends AbstractCardRender<PlayCardSportLayoutBinding> implements KoinComponent {

    @NotNull
    private static final String k = "SportCardBaseRender";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportDataManagerIml;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy unitLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Drawable iconSvg;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ CardUiData a;
        public final /* synthetic */ SportDataBean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CardUiData cardUiData, SportDataBean sportDataBean) {
            super(0);
            this.a = cardUiData;
            this.b = sportDataBean;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getPlayTool().getTool().name() + ": getSportData:  " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ EventUnitChanged a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventUnitChanged eventUnitChanged) {
            super(0);
            this.a = eventUnitChanged;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "unit has changed:  " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/eventbus/EventUnitChanged;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LiveData<EventUnitChanged>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<EventUnitChanged> invoke() {
            return InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getUnitNotifier());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportCardBaseRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sportDataManagerIml = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ISportDataManager>() { // from class: com.xiaomi.hm.health.play.card.sport.SportCardBaseRender$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.play.card.sport.ISportDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ISportDataManager invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(ISportDataManager.class), qualifier, objArr);
            }
        });
        this.unitLiveData = LazyKt__LazyJVMKt.lazy(c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SportCardBaseRender sportCardBaseRender, Context context, CardUiData cardUiData, View view) {
        sportCardBaseRender.onCardClick(context, cardUiData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SportCardBaseRender sportCardBaseRender, CardUiData cardUiData, SportDataBean sportDataBean) {
        HMLog.info(k, new a(cardUiData, sportDataBean));
        sportCardBaseRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SportCardBaseRender sportCardBaseRender, EventUnitChanged eventUnitChanged) {
        if (eventUnitChanged == null) {
            return;
        }
        HMLog.info(k, new b(eventUnitChanged));
        sportCardBaseRender.updateUi();
    }

    private final void k(int color) {
        Drawable drawable = this.iconSvg;
        if (drawable != null) {
            DrawableExKt.tint(drawable, color);
        }
        getBinding().sportIcon.setImageDrawable(this.iconSvg);
    }

    private final void l(Context context, boolean isTodayData) {
        if (isTodayData) {
            ExtensionsKt.visible(getBinding().groupTodayDetail);
            getBinding().getRoot().setBackgroundResource(getCardBg());
            k(Color.parseColor("#ffffff"));
            getBinding().sportTitle.setTextColor(ContextCompat.getColor(context, R.color.s5));
            getBinding().sportDesc.setTextColor(Color.parseColor("#80ffffff"));
            getBinding().sportJump.setBackgroundColor(Color.parseColor("#4DFFFFFF"));
            getBinding().sportJump.setTextColor(ContextCompat.getColor(context, R.color.s5));
            TextViewCompat.setTextAppearance(getBinding().sportJump, 2132017626);
            return;
        }
        ExtensionsKt.gone(getBinding().groupTodayDetail);
        getBinding().getRoot().setBackgroundColor(0);
        k(getIconColor());
        getBinding().sportTitle.setTextColor(ContextCompat.getColor(context, R.color.s1));
        getBinding().sportDesc.setTextColor(ContextCompat.getColor(context, R.color.s2));
        getBinding().sportJump.setBackgroundColor(ContextCompat.getColor(context, R.color.s4));
        getBinding().sportJump.setTextColor(ContextCompat.getColor(context, R.color.s1));
        TextViewCompat.setTextAppearance(getBinding().sportJump, 2132017627);
    }

    private final void m(Context context, int days) {
        l(context, false);
        showHasHistoryData(context, days);
    }

    private final void n(Context context, CardUiData uiParams) {
        l(context, false);
        getBinding().sportDesc.setText(uiParams.getPlayTool().getSubLongTitleRes());
    }

    private final void o(Context context, SportDataBean data) {
        l(context, true);
        showTodayUi();
        Triple<Integer, Integer, Integer> dataDesc = getDataDesc(data);
        Triple<String, String, String> tripleConvertToShowData = convertToShowData(data);
        PlayCardSportLayoutBinding binding = getBinding();
        binding.tvDistance.setText(dataDesc.getFirst().intValue());
        binding.tvPace.setText(dataDesc.getSecond().intValue());
        binding.tvTime.setText(dataDesc.getThird().intValue());
        binding.tvDistanceValue.setText(tripleConvertToShowData.getFirst());
        binding.tvPaceValue.setText(tripleConvertToShowData.getSecond());
        binding.tvTimeValue.setText(tripleConvertToShowData.getThird());
    }

    @NotNull
    public final String convertToPaceMultiplyKilo(float pace) {
        return DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(pace, RunnerData.getRunner().isMetric()));
    }

    @NotNull
    public abstract Triple<String, String, String> convertToShowData(@NotNull SportDataBean data);

    @NotNull
    public final String convertToSpeed(float pace) {
        return RunDataConversion.paceConvertToSpeed(pace, RunnerData.getRunner().isMetric());
    }

    @Nullable
    public final String formatAvgHr(int avgHr) {
        if (HeartRateInfo.isHRValueValid(avgHr)) {
            return String.valueOf(avgHr);
        }
        Context mContext = getMContext();
        if (mContext == null) {
            return null;
        }
        return mContext.getString(R.string.hr_empty_data);
    }

    @Nullable
    public final String formatDistance(int distance, int dataType) {
        return (String) ArraysKt.firstOrNull(DataFormatter.getFormatDisAndUnit(distance, dataType, RunnerData.getRunner().isMetric(), new boolean[0]));
    }

    @NotNull
    public final String formatTime(int time) {
        return DataFormatter.getConsumeTime(time);
    }

    public abstract int getCardBg();

    @NotNull
    public abstract Triple<Integer, Integer, Integer> getDataDesc(@NotNull SportDataBean data);

    public final int getDistanceUnit() {
        return RunnerData.getRunner().isMetric() ? R.string.unit_km : R.string.unit_mile;
    }

    public abstract int getIconColor();

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final ISportDataManager getSportDataManagerIml() {
        return (ISportDataManager) this.sportDataManagerIml.getValue();
    }

    @NotNull
    public abstract LiveData<SportDataBean> getSportLiveData();

    @NotNull
    public final LiveData<EventUnitChanged> getUnitLiveData() {
        return (LiveData) this.unitLiveData.getValue();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull final Context context, @NotNull final CardUiData uiParams) {
        Integer toolNameRes = uiParams.getPlayTool().getToolNameRes();
        if (toolNameRes != null) {
            getBinding().sportTitle.setText(toolNameRes.intValue());
        }
        Button button = getBinding().sportJump;
        button.setText(uiParams.getPlayTool().getSubTitleRes());
        button.setOnClickListener(new View.OnClickListener() { // from class: u77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportCardBaseRender.h(this.a, context, uiParams, view);
            }
        });
        this.iconSvg = ContextCompat.getDrawable(context, uiParams.getPlayTool().getToolIconRes().intValue());
        getSportLiveData().observe(this.lifecycleOwner, new Observer() { // from class: w77
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportCardBaseRender.i(this.a, uiParams, (SportDataBean) obj);
            }
        });
        getUnitLiveData().observe(this.lifecycleOwner, new Observer() { // from class: v77
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportCardBaseRender.j(this.a, (EventUnitChanged) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded() || PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        }
        super.onCardClick(context, uiParams);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        getSportLiveData().removeObservers(this.lifecycleOwner);
        getUnitLiveData().removeObservers(this.lifecycleOwner);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull Context context, @NotNull CardUiData uiParams) {
        Unit unit;
        SportDataBean value = getSportLiveData().getValue();
        if (value == null) {
            unit = null;
        } else {
            if (TimeUtils.isToday(value.getTrackId() * ((long) 1000))) {
                o(context, value);
            } else {
                m(context, value.getDaysCount());
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            n(context, uiParams);
        }
    }

    public abstract void showHasHistoryData(@NotNull Context context, int days);

    public abstract void showTodayUi();

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardSportLayoutBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardSportLayoutBinding.inflate(inflater, rootView, true);
    }
}
