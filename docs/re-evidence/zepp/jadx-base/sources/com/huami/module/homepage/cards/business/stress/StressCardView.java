package com.huami.module.homepage.cards.business.stress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.databinding.HomepageItemCardStressBinding;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.VectorDrawablePathColorHelper;
import com.huami.stress_service.StressEntry;
import com.huami.stress_service.StressResourceService;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J9\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006$"}, d2 = {"Lcom/huami/module/homepage/cards/business/stress/StressCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "stressValue", "", "stressText", "", "stressUpdateTime", "color", "", "setStressParam", "(Ljava/lang/Integer;Ljava/lang/String;JI)V", "setStressDrawable", "value", "Lkotlin/Pair;", "a", "b", "", "isL66Device", "Lcom/huami/stress_service/StressEntry;", "stressEntry", "setStressView", "Lcom/huami/module/homepage/databinding/HomepageItemCardStressBinding;", "Lcom/huami/module/homepage/databinding/HomepageItemCardStressBinding;", "binding", "Lcom/huami/stress_service/StressResourceService;", "Lcom/huami/stress_service/StressResourceService;", "stressResourceService", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class StressCardView extends ConstraintLayout {

    @Deprecated
    public static final int HIGH = 80;

    @Deprecated
    public static final int HIGH_END = 100;

    @Deprecated
    public static final int HIGH_MIFIT = 81;

    @Deprecated
    public static final int MEDIUM = 60;

    @Deprecated
    public static final int MEDIUM_MIFIT = 51;

    @Deprecated
    public static final int NORMAL = 40;

    @Deprecated
    public static final int NORMAL_MIFIT = 26;

    @Deprecated
    public static final int RELAXED_START = 0;

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardStressBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final StressResourceService stressResourceService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"com/huami/module/homepage/cards/business/stress/StressCardView$a", "", "", "HIGH", LogUtil.I, "HIGH_END", "HIGH_MIFIT", "MEDIUM", "MEDIUM_MIFIT", "NORMAL", "NORMAL_MIFIT", "RELAXED_START", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public StressCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public StressCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StressCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final Pair<String, Integer> a(int value) {
        if (value >= 0 && value < 40) {
            return TuplesKt.to(ViewExtKt.getString(this, R.string.homepage_item_card_stress_level_relax), Integer.valueOf(R.color.s15));
        }
        if (40 <= value && value < 60) {
            return TuplesKt.to(ViewExtKt.getString(this, R.string.homepage_item_card_stress_level_normal), Integer.valueOf(R.color.s20));
        }
        if (60 <= value && value < 80) {
            return TuplesKt.to(ViewExtKt.getString(this, R.string.homepage_item_card_stress_level_medium), Integer.valueOf(R.color.s33));
        }
        return 80 <= value && value <= 100 ? TuplesKt.to(ViewExtKt.getString(this, R.string.homepage_item_card_stress_level_high), Integer.valueOf(R.color.s51)) : TuplesKt.to("", Integer.valueOf(R.color.s15));
    }

    private final Pair<String, Integer> b(int value) {
        if (value >= 0 && value < 26) {
            return TuplesKt.to(ViewExtKt.getString(this, R.string.homepage_item_card_stress_level_relax), Integer.valueOf(R.color.s15));
        }
        if (26 <= value && value < 51) {
            return TuplesKt.to(ViewExtKt.getString(this, R.string.stress_level_normal_new), Integer.valueOf(R.color.s20));
        }
        if (51 <= value && value < 81) {
            return TuplesKt.to(ViewExtKt.getString(this, R.string.stress_level_medium_new), Integer.valueOf(R.color.s33));
        }
        return 81 <= value && value <= 100 ? TuplesKt.to(ViewExtKt.getString(this, R.string.stress_level_high_new), Integer.valueOf(R.color.s51)) : TuplesKt.to("", Integer.valueOf(R.color.s15));
    }

    public static /* synthetic */ void c(StressCardView stressCardView, Integer num, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = R.color.s15;
        }
        stressCardView.setStressParam(num, str2, j2, i);
    }

    private final void setStressDrawable(@ColorInt int color) {
        this.binding.pressureScaleIv.setImageDrawable(VectorDrawablePathColorHelper.setPartPathColor$default(VectorDrawablePathColorHelper.setPartPathColor$default(new VectorDrawablePathColorHelper(getContext(), R.drawable.ic_stress_scale), "stress_angle", color, false, 4, null).setPartPathColor("stress_angle", color, true), "stress_line", color, false, 4, null).create());
    }

    private final void setStressParam(Integer stressValue, String stressText, long stressUpdateTime, @ColorRes int color) {
        HomepageItemCardStressBinding homepageItemCardStressBinding = this.binding;
        if (stressValue == null || stressValue.intValue() == 0) {
            ViewExtKt.setVisible(homepageItemCardStressBinding.pressureMask, true);
            ViewExtKt.setVisible(homepageItemCardStressBinding.pressureNoneIv, true);
            homepageItemCardStressBinding.pressureValue.setVisibility(8);
            homepageItemCardStressBinding.pressureDesc.setVisibility(8);
            CardTitleBarView.setFirstTime$default(homepageItemCardStressBinding.pressureBar, 0L, 1, null);
            return;
        }
        ViewExtKt.setVisible(homepageItemCardStressBinding.pressureMask, false);
        ViewExtKt.setVisible(homepageItemCardStressBinding.pressureNoneIv, false);
        homepageItemCardStressBinding.pressureValue.setVisibility(0);
        homepageItemCardStressBinding.pressureDesc.setVisibility(0);
        homepageItemCardStressBinding.pressureValue.setText(I18nKt.i18n(stressValue.intValue()));
        homepageItemCardStressBinding.pressureDesc.setText(stressText);
        homepageItemCardStressBinding.pressureBar.setFirstTime(stressUpdateTime);
        setStressDrawable(ViewExtKt.loadColor(this, color));
    }

    public final void setStressView(boolean isL66Device, @Nullable StressEntry stressEntry) {
        String stressStatusText;
        if (stressEntry == null) {
            c(this, null, null, 0L, 0, 15, null);
            return;
        }
        Pair<String, Integer> pairB = isL66Device ? b(stressEntry.getValue()) : a(stressEntry.getValue());
        String strComponent1 = pairB.component1();
        int iIntValue = pairB.component2().intValue();
        Integer numValueOf = Integer.valueOf(stressEntry.getValue());
        StressResourceService stressResourceService = this.stressResourceService;
        setStressParam(numValueOf, (stressResourceService == null || (stressStatusText = stressResourceService.getStressStatusText(getContext(), stressEntry.getValue())) == null) ? strComponent1 : stressStatusText, stressEntry.getLatestTime(), iIntValue);
    }

    @JvmOverloads
    public StressCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardStressBinding.inflate(LayoutInflater.from(context), this, true);
        this.stressResourceService = ServiceManager.INSTANCE.getStressResourceService();
    }
}
