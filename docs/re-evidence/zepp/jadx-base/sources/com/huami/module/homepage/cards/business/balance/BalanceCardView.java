package com.huami.module.homepage.cards.business.balance;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.health.bodymeasurements.bodyfat_service.BalanceEntry;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.business.balance.BalanceCardView;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardBalanceBinding;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u000e¢\u0006\u0004\b/\u00100J\u001b\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J \u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0002J1\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0003J\u0006\u0010\u0015\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0014\u0010\u001b\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0016\u0010$\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!¨\u00061"}, d2 = {"Lcom/huami/module/homepage/cards/business/balance/BalanceCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "canAnalyze", "", z.j, "(Ljava/lang/Boolean;)V", "", "timeMills", "h", "", "keepTime", "timeUnit", GoogleApiAvailabilityLight.a, "", FirebaseAnalytics.Param.LEVEL, "levelDescription", "f", "(Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/huami/module/homepage/cards/business/balance/BalanceCardView;", "index", "c", "initView", "Lcom/huami/health/bodymeasurements/bodyfat_service/BalanceEntry;", "balanceEntry", "setBalanceView", "", "levels", "setAllLevel", "Lcom/huami/module/homepage/databinding/HomepageItemCardBalanceBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardBalanceBinding;", "binding", "b", LogUtil.I, "redColor", "orangeColor", "yellowColor", "e", "grassGreenColor", "greenColor", "g", "maxValue", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class BalanceCardView extends ConstraintLayout {

    @NotNull
    private static final a h = new a(null);

    @Deprecated
    private static final int i = 10;

    @Deprecated
    private static final float j = 3.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardBalanceBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int redColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int orangeColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int yellowColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int grassGreenColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int greenColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int maxValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/business/balance/BalanceCardView$a", "", "", "DEFAULT_VALUE", "F", "", "MAX_VALUE", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public BalanceCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BalanceCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BalanceCardView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, View view) {
        StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_BALANCE_C, new Pair[0]);
        RouterHelperKt.executeRoute$default(context, RouterHelper.BALANCE_PATH, new Pair[0], null, 8, null);
    }

    @ColorInt
    private final int c(int index) {
        if (index == 0) {
            return this.greenColor;
        }
        if (index == 1) {
            return this.grassGreenColor;
        }
        if (index != 2) {
            return index != 3 ? this.redColor : this.orangeColor;
        }
        return this.yellowColor;
    }

    private final BalanceCardView d(String keepTime, String timeUnit) {
        HomepageItemCardBalanceBinding homepageItemCardBalanceBinding = this.binding;
        TextView textView = homepageItemCardBalanceBinding.balanceKeepTime;
        if (keepTime == null) {
            keepTime = null;
        } else {
            try {
                keepTime = I18nKt.i18n$default(Float.parseFloat(keepTime), 0, 1, null);
            } catch (Exception unused) {
            }
        }
        if (keepTime == null) {
            keepTime = "";
        }
        textView.setText(keepTime);
        TextView textView2 = homepageItemCardBalanceBinding.balanceKeepTimeUnit;
        if (timeUnit == null) {
            timeUnit = "";
        }
        textView2.setText(timeUnit);
        return this;
    }

    public static /* synthetic */ BalanceCardView e(BalanceCardView balanceCardView, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return balanceCardView.d(str, str2);
    }

    private final BalanceCardView f(Integer level, String levelDescription, boolean canAnalyze) {
        SpannableStringBuilder spannableStringBuilderBuild;
        if (!canAnalyze) {
            this.binding.balanceState.setShowIndicator(false).refresh();
            this.binding.balanceDescription.setText(ViewExtKt.getString(this, R.string.homepage_item_card_bmi_unable_to_analyze));
            return this;
        }
        if (level != null) {
            this.binding.balanceState.setValue(this.maxValue - ((level.intValue() * 2.0f) + 1)).setShowIndicator(true).refresh();
        }
        TextView textView = this.binding.balanceDescription;
        CharSequence charSequence = "";
        if (levelDescription != null && (spannableStringBuilderBuild = HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), ViewExtKt.getString(this, R.string.homepage_item_card_balance_level), null, null, false, null, null, null, 126, null).addSpaceBlank(), levelDescription, null, 18, false, null, null, null, 122, null).build()) != null) {
            charSequence = spannableStringBuilderBuild;
        }
        textView.setText(charSequence);
        return this;
    }

    public static /* synthetic */ BalanceCardView g(BalanceCardView balanceCardView, Integer num, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return balanceCardView.f(num, str, z);
    }

    private final BalanceCardView h(long timeMills) {
        this.binding.balanceBar.setFirstTime(timeMills);
        return this;
    }

    public static /* synthetic */ BalanceCardView i(BalanceCardView balanceCardView, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        return balanceCardView.h(j2);
    }

    private final void j(Boolean canAnalyze) {
        boolean z = canAnalyze == null || !canAnalyze.booleanValue();
        HomepageItemCardBalanceBinding homepageItemCardBalanceBinding = this.binding;
        ViewExtKt.setVisible(homepageItemCardBalanceBinding.balanceMask, z);
        homepageItemCardBalanceBinding.balanceMask.setText(Intrinsics.areEqual(canAnalyze, Boolean.FALSE) ? "" : ViewExtKt.getString(this, R.string.homepage_female_health_none_data));
        homepageItemCardBalanceBinding.balanceState.setShowIndicator(true ^ z).refresh();
    }

    public static /* synthetic */ void k(BalanceCardView balanceCardView, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        balanceCardView.j(bool);
    }

    public final void initView() {
        this.binding.balanceState.setMaxValue(this.maxValue).setPiecewiseColor(this.greenColor, this.grassGreenColor, this.yellowColor, this.orangeColor, this.redColor).setValue(3.0f).setShowIndicator(false).refresh();
        setBalanceView(null);
    }

    @NotNull
    public final BalanceCardView setAllLevel(@NotNull List<String> levels) {
        List listReversed = CollectionsKt___CollectionsKt.reversed(levels);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listReversed, 10));
        int i2 = 0;
        for (Object obj : listReversed) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to((String) obj, Integer.valueOf(c(i2))));
            i2 = i3;
        }
        this.maxValue = arrayList.size() * 2;
        this.binding.balanceState.setPiecewiseTextAndColor(arrayList).setMaxValue(this.maxValue).setShowIndicator(true).refresh();
        return this;
    }

    public final void setBalanceView(@Nullable BalanceEntry balanceEntry) {
        if (balanceEntry != null) {
            j(Boolean.valueOf(balanceEntry.getCanAnalyze()));
            h(balanceEntry.getUpdateTime());
            d(balanceEntry.getBalanceKeepTime(), balanceEntry.getBalanceKeepTimeUnit());
            f(Integer.valueOf(balanceEntry.getCurrentBalanceState()), balanceEntry.getBalanceKeepDescription(), balanceEntry.getCanAnalyze());
            return;
        }
        j(Boolean.TRUE);
        i(this, 0L, 1, null);
        e(this, null, null, 3, null);
        g(this, null, null, false, 7, null);
    }

    @JvmOverloads
    public BalanceCardView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        HomepageItemCardBalanceBinding homepageItemCardBalanceBindingInflate = HomepageItemCardBalanceBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = homepageItemCardBalanceBindingInflate;
        this.redColor = ViewExtKt.loadColor(this, R.color.s51);
        this.orangeColor = ViewExtKt.loadColor(this, R.color.s31);
        this.yellowColor = ViewExtKt.loadColor(this, R.color.s33);
        this.grassGreenColor = ViewExtKt.loadColor(this, R.color.s22);
        this.greenColor = ViewExtKt.loadColor(this, R.color.s20);
        this.maxValue = 10;
        homepageItemCardBalanceBindingInflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: mm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BalanceCardView.b(context, view);
            }
        });
    }
}
