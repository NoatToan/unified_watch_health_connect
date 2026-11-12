package com.huami.module.homepage.cards.business.healthstate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.cardui.BackgroundTextView;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.CornerDirection;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.databinding.HomepageItemCardHealhStateBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u001e\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/huami/module/homepage/cards/business/healthstate/HealthStateCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "bloodPressure", "", "setBloodPressure", "bloodSugar", "setBloodSugar", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "setCenterVertical", "initView", "updateView", "", "calibrationExpired", "updateBloodPressureState", "Lcom/huami/module/homepage/databinding/HomepageItemCardHealhStateBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardHealhStateBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HealthStateCardView extends ConstraintLayout {

    @Deprecated
    @NotNull
    public static final String LANGUAGE_RU = "ru";

    @Deprecated
    public static final float LANGUAGE_RU_TITLE_SIZE = 14.0f;

    @Deprecated
    public static final float VERTICAL_BIAS_HALF = 0.5f;

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardHealhStateBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"com/huami/module/homepage/cards/business/healthstate/HealthStateCardView$a", "", "", "LANGUAGE_RU", "Ljava/lang/String;", "", "LANGUAGE_RU_TITLE_SIZE", "F", "VERTICAL_BIAS_HALF", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_BLOODPRESSURE_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(HealthStateCardView.this.getContext(), !ServiceManager.INSTANCE.getBloodPressureService().supportDeviceMeasure() ? "detail/DataDetailBaseNewActivity" : "bloodpressure/BloodPressureActivity", new Pair[]{TuplesKt.to("data_type", "blood_pressure")}, null, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_BLOODGLUCOSE_C, new Pair[0]);
            RouterHelperKt.executeRoute$default(HealthStateCardView.this.getContext(), "detail/DataDetailBaseNewActivity", new Pair[]{TuplesKt.to("data_type", RouterHelper.DATA_TYPE_BLOOD_SUGAR)}, null, 8, null);
        }
    }

    @JvmOverloads
    public HealthStateCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HealthStateCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HealthStateCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void a(HealthStateCardView healthStateCardView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        healthStateCardView.setBloodPressure(str);
    }

    public static /* synthetic */ void b(HealthStateCardView healthStateCardView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        healthStateCardView.setBloodSugar(str);
    }

    private final void setBloodPressure(String bloodPressure) {
        HomepageItemCardHealhStateBinding homepageItemCardHealhStateBinding = this.binding;
        if (bloodPressure != null) {
            homepageItemCardHealhStateBinding.bloodPressureValue.setText(bloodPressure);
            BackgroundTextView.setBackgroundCornerDirection$default(homepageItemCardHealhStateBinding.bloodPressureMask, CornerDirection.NONE, 0, 0.0d, 6, null);
            homepageItemCardHealhStateBinding.bloodPressureTitle.setText("");
        } else {
            BackgroundTextView.setBackgroundCornerDirection$default(homepageItemCardHealhStateBinding.bloodPressureMask, CornerDirection.LEFT, 0, 0.0d, 6, null);
            homepageItemCardHealhStateBinding.bloodPressureValue.setText("");
            homepageItemCardHealhStateBinding.bloodPressureTitle.setText(getContext().getString(R.string.homepage_item_card_blood_pressure_none));
            if (HomeUtils.isChineseLanguage()) {
                setCenterVertical(homepageItemCardHealhStateBinding.bloodPressureTitle);
            }
        }
    }

    private final void setBloodSugar(String bloodSugar) {
        HomepageItemCardHealhStateBinding homepageItemCardHealhStateBinding = this.binding;
        if (bloodSugar != null) {
            homepageItemCardHealhStateBinding.bloodSugarValue.setText(bloodSugar);
            BackgroundTextView.setBackgroundCornerDirection$default(homepageItemCardHealhStateBinding.bloodSugarMask, CornerDirection.NONE, 0, 0.0d, 6, null);
            homepageItemCardHealhStateBinding.bloodSugarTitle.setText("");
        } else {
            BackgroundTextView.setBackgroundCornerDirection$default(homepageItemCardHealhStateBinding.bloodSugarMask, CornerDirection.RIGHT, 0, 0.0d, 6, null);
            homepageItemCardHealhStateBinding.bloodSugarValue.setText("");
            homepageItemCardHealhStateBinding.bloodSugarTitle.setText(getContext().getString(R.string.homepage_item_card_blood_sugar_none));
            if (HomeUtils.isChineseLanguage()) {
                setCenterVertical(homepageItemCardHealhStateBinding.bloodSugarTitle);
            }
        }
    }

    private final void setCenterVertical(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.verticalBias = 0.5f;
        Unit unit = Unit.INSTANCE;
        view.setLayoutParams(layoutParams2);
    }

    public static /* synthetic */ void updateView$default(HealthStateCardView healthStateCardView, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        healthStateCardView.updateView(str, str2);
    }

    public final void initView() {
        ExteranelKt.setOnClickWithPolicyListener(this.binding.bloodPressureMask, new b());
        ExteranelKt.setOnClickWithPolicyListener(this.binding.bloodSugarMask, new c());
        if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), LANGUAGE_RU)) {
            this.binding.signsStateTitle.setTitleTextSize(14.0f);
        }
        updateView$default(this, null, null, 3, null);
    }

    public final void updateBloodPressureState(boolean calibrationExpired) {
        if (!calibrationExpired) {
            this.binding.signsStateTitle.setTitleText(ViewExtKt.getString(this, R.string.homepage_item_card_blood_pressure));
        } else {
            CardTitleBarView.setTitleTextWithIcon$default(this.binding.signsStateTitle, ViewExtKt.getString(this, R.string.homepage_item_card_blood_pressure), ViewExtKt.loadDrawable(this, R.drawable.ic_alert_20, R.color.s30, Integer.valueOf(NumberExtKt.getDp(16))), null, 4, null);
        }
    }

    public final void updateView(@Nullable String bloodPressure, @Nullable String bloodSugar) {
        setBloodPressure(bloodPressure);
        setBloodSugar(bloodSugar);
    }

    @JvmOverloads
    public HealthStateCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardHealhStateBinding.inflate(LayoutInflater.from(context), this, true);
    }
}
