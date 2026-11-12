package com.huami.module.homepage.cards.business.pai;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.GradientLineView;
import com.huami.module.homepage.databinding.HomepageItemCardPaiExtBinding;
import com.huami.module.homepage.databinding.HomepageItemCardPaiExtI18nBinding;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001\u0006B'\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006("}, d2 = {"Lcom/huami/module/homepage/cards/business/pai/PaiExtView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "source", "regex", "Landroid/text/SpannableString;", "a", "", "todayPai", "todayDesc", "nextGoalDesc", "regexValue", "", "updatePai", "currentValue", "updateLineProgress", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "todayView", "b", "nextGoalView", "Lcom/huami/module/homepage/cards/cardui/GradientLineView;", "c", "Lcom/huami/module/homepage/cards/cardui/GradientLineView;", "lineView", GoogleApiAvailabilityLight.a, LogUtil.I, "yellow", "e", "blue", "f", "green", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PaiExtView extends ConstraintLayout {

    @Deprecated
    public static final int MAX_PAI_LIMIT = 100;

    @Deprecated
    public static final int MAX_PAI_LIMIT_HALF = 50;

    @Deprecated
    public static final int PAI_VALUE_MAX = 120;

    @Deprecated
    public static final int PAI_VALUE_TEXT_SIZE = 20;

    @NotNull
    private static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private TextView todayView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private TextView nextGoalView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private GradientLineView lineView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int yellow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int blue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int green;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/business/pai/PaiExtView$a", "", "", "MAX_PAI_LIMIT", LogUtil.I, "MAX_PAI_LIMIT_HALF", "PAI_VALUE_MAX", "PAI_VALUE_TEXT_SIZE", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public PaiExtView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PaiExtView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PaiExtView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final SpannableString a(String source, String regex) {
        SpannableString spannableString = new SpannableString(source);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) source, regex, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return spannableString;
        }
        spannableString.setSpan(new AbsoluteSizeSpan(20, true), iIndexOf$default, regex.length() + iIndexOf$default, 34);
        Typeface maisonTypeface = HomeUtils.getMaisonTypeface();
        if (maisonTypeface != null) {
            spannableString.setSpan(new HMSpannable.FontSpan(maisonTypeface), iIndexOf$default, regex.length() + iIndexOf$default, 34);
        }
        return spannableString;
    }

    public final void updateLineProgress(int currentValue) {
        int i;
        GradientLineView value = this.lineView.setValue(currentValue > 100 ? 120 : currentValue);
        if (currentValue < 50) {
            i = this.yellow;
        } else {
            i = currentValue < 100 ? this.blue : this.green;
        }
        value.setDotColor(i).refresh();
    }

    public final void updatePai(int todayPai, @NotNull String todayDesc, @NotNull String nextGoalDesc, int regexValue) {
        TextView textView = this.todayView;
        if (textView != null) {
            textView.setText(a(todayDesc, I18nKt.i18n(todayPai)));
        }
        this.nextGoalView.setText(HomeUtils.isChineseLanguage() ? a(nextGoalDesc, I18nKt.i18n(regexValue)) : a(todayDesc, I18nKt.i18n(todayPai)));
    }

    @JvmOverloads
    public PaiExtView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int iLoadColor = ViewExtKt.loadColor(this, R.color.s33);
        this.yellow = iLoadColor;
        this.blue = ViewExtKt.loadColor(this, R.color.s15);
        int i2 = R.color.s20;
        this.green = ViewExtKt.loadColor(this, i2);
        if (HomeUtils.isChineseLanguage()) {
            HomepageItemCardPaiExtBinding homepageItemCardPaiExtBindingInflate = HomepageItemCardPaiExtBinding.inflate(LayoutInflater.from(context), this, true);
            this.todayView = homepageItemCardPaiExtBindingInflate.todayPai;
            this.nextGoalView = homepageItemCardPaiExtBindingInflate.paiNextGoal;
            this.lineView = homepageItemCardPaiExtBindingInflate.paiLine;
        } else {
            HomepageItemCardPaiExtI18nBinding homepageItemCardPaiExtI18nBindingInflate = HomepageItemCardPaiExtI18nBinding.inflate(LayoutInflater.from(context), this, true);
            this.nextGoalView = homepageItemCardPaiExtI18nBindingInflate.paiNextGoal;
            this.lineView = homepageItemCardPaiExtI18nBindingInflate.paiLine;
        }
        this.lineView.setGradientColor(ViewExtKt.loadColor(this, R.color.s34), ViewExtKt.loadColor(this, R.color.s22), ViewExtKt.loadColor(this, i2), ViewExtKt.loadColor(this, R.color.s14)).setMaxValue(120).setDotColor(iLoadColor).setDotColorKeepGradient(false).refresh();
    }
}
