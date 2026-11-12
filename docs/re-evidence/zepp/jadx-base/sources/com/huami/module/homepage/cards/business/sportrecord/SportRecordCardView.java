package com.huami.module.homepage.cards.business.sportrecord;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.business.sportrecord.SportRecordCardView;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardSportRecordBinding;
import com.huami.module.homepage.databinding.HomepageItemCardSportRecordInnerBinding;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ContextExtKt;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\f\u001a\u00020\n*\u00020\bH\u0002J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/huami/module/homepage/cards/business/sportrecord/SportRecordCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "isWeek", "", GoogleApiAvailabilityLight.a, "", "seconds", "", "c", "f", "", "sportCount", "sportTimes", "updateSportCountAndTimes", "", "Lcom/huami/sport/service/model/HistoryRecord;", "records", "updateCurrentSportRecord", "Lcom/huami/module/homepage/databinding/HomepageItemCardSportRecordBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardSportRecordBinding;", "viewBinding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SportRecordCardView extends ConstraintLayout {

    @NotNull
    private static final a b = new a(null);

    @Deprecated
    @NotNull
    private static final String c = "totaltimes";

    @Deprecated
    @NotNull
    private static final String d = "totalduration";

    @Deprecated
    @NotNull
    private static final String e = "firstrecord";

    @Deprecated
    @NotNull
    private static final String f = "secondrecord";

    @Deprecated
    @NotNull
    private static final String g = "more";

    @Deprecated
    @NotNull
    private static final String h = "pos";

    @Deprecated
    private static final float i = 6.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private HomepageItemCardSportRecordBinding viewBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"com/huami/module/homepage/cards/business/sportrecord/SportRecordCardView$a", "", "", "BACK_RADIUS", "F", "", "CLICK_KEY", "Ljava/lang/String;", "FIRST_RECORD", "MORE", "SECOND_RECORD", "TOTAL_DURATION", "TOTAL_TIMES", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ View a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, boolean z) {
            super(0);
            this.a = view;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String str;
            int id = this.a.getId();
            if (id == R.id.sport_count_last_7_days) {
                str = SportRecordCardView.c;
            } else if (id == R.id.sport_duration_last_7_days) {
                str = SportRecordCardView.d;
            } else {
                str = id == R.id.view_more ? SportRecordCardView.g : null;
            }
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_EXERCISERECORD_C, TuplesKt.to("pos", str));
            Context context = this.a.getContext();
            Pair[] pairArr = new Pair[1];
            pairArr[0] = TuplesKt.to("type", this.b ? "week" : "all");
            RouterHelperKt.executeRoute$default(context, RouterHelper.EXERCISE_HISTORY, pairArr, null, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ HistoryRecord b;
        public final /* synthetic */ SportRecordCardView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, HistoryRecord historyRecord, SportRecordCardView sportRecordCardView) {
            super(0);
            this.a = i;
            this.b = historyRecord;
            this.c = sportRecordCardView;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeAnalytics homeAnalytics = HomeAnalytics.INDEX_CARDS_EXERCISERECORD_C;
            Pair[] pairArr = new Pair[1];
            pairArr[0] = TuplesKt.to("pos", this.a == 0 ? SportRecordCardView.e : SportRecordCardView.f);
            StatusAnalyticsKt.recordEvent(homeAnalytics, pairArr);
            this.b.setCf("sportcard");
            ((ISportRecord) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ISportRecord.class), null, null)).goToSportDetail(this.b, this.c.getContext());
        }
    }

    @JvmOverloads
    public SportRecordCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SportRecordCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SportRecordCardView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SportRecordCardView sportRecordCardView) {
        ViewExtKt.setShape(sportRecordCardView.viewBinding.middleBg, 6.0f, Integer.valueOf(NumberExtKt.addAlpha(ViewExtKt.loadColor(sportRecordCardView, R.color.s4), 0.6d)));
    }

    private final String c(long seconds) {
        if (seconds < 0) {
            return "00:00:00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar calendar = simpleDateFormat.getCalendar();
        calendar.setTimeInMillis(1000 * seconds);
        int i2 = calendar.get(11) + (((int) (seconds / 86400)) * 24);
        int i3 = calendar.get(12);
        int i4 = calendar.get(13);
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        sb.append(String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
        sb.append(JsonLexerKt.COLON);
        sb.append(String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
        sb.append(JsonLexerKt.COLON);
        sb.append(String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)));
        return sb.toString();
    }

    private final void d(View view, boolean isWeek) {
        ExteranelKt.setOnClickWithPolicyListener(view, new b(view, isWeek));
    }

    public static /* synthetic */ void e(SportRecordCardView sportRecordCardView, View view, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        sportRecordCardView.d(view, z);
    }

    private final String f(long j) {
        if (j <= 0) {
            return "";
        }
        if (TimeExtKt.isToday(j)) {
            return HMDataFormatKt.getFormatTime$default(j, HMPattern.HOUR24_MINUTE_SECOND, (Locale) null, 2, (Object) null);
        }
        if (TimeExtKt.isInThisYear(j)) {
            return HMDataFormatKt.getFormatTime$default(j, HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
        }
        return HomeUtils.isChineseLanguage() ? HMDataFormatKt.getFormatTime$default(j, HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null) : HMDataFormatKt.getFormatTime$default(j, HMPattern.YEAR_ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
    }

    public final void updateCurrentSportRecord(@Nullable List<? extends HistoryRecord> records) {
        int dp;
        String quantityString;
        HomepageItemCardSportRecordBinding homepageItemCardSportRecordBinding = this.viewBinding;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new HomepageItemCardSportRecordInnerBinding[]{homepageItemCardSportRecordBinding.sportRecord1, homepageItemCardSportRecordBinding.sportRecord2});
        Iterator it2 = listListOf.iterator();
        while (it2.hasNext()) {
            ((HomepageItemCardSportRecordInnerBinding) it2.next()).getRoot().setVisibility(8);
        }
        Iterator it3 = listListOf.iterator();
        int i2 = 0;
        while (true) {
            String str = "";
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            HomepageItemCardSportRecordInnerBinding homepageItemCardSportRecordInnerBinding = (HomepageItemCardSportRecordInnerBinding) next;
            HistoryRecord historyRecord = records == null ? null : (HistoryRecord) CollectionsKt.getOrNull(records, i2);
            if (historyRecord != null) {
                ExteranelKt.setOnClickWithPolicyListener(homepageItemCardSportRecordInnerBinding.getRoot(), new c(i2, historyRecord, this));
                homepageItemCardSportRecordInnerBinding.getRoot().setVisibility(0);
                homepageItemCardSportRecordInnerBinding.sportIcon.setImageResource(historyRecord.getIconResId());
                TintUtils.tintDrawable(homepageItemCardSportRecordInnerBinding.sportIcon, ViewExtKt.loadColor(this, historyRecord.getIconColorId()));
                homepageItemCardSportRecordInnerBinding.time.setText(f(historyRecord.getBeginTimeInMilli()));
                String trainingName = historyRecord.getTrainingName();
                if (trainingName == null || trainingName.length() == 0) {
                    homepageItemCardSportRecordInnerBinding.name.setText(historyRecord.getNameResString());
                } else {
                    homepageItemCardSportRecordInnerBinding.name.setText(historyRecord.getTrainingName());
                }
                homepageItemCardSportRecordInnerBinding.sportDuration.setText(c(historyRecord.getConsumeTime()));
                TextView textView = homepageItemCardSportRecordInnerBinding.subData;
                textView.setText(historyRecord.getSubDataValue());
                if (isRtl()) {
                    textView.setCompoundDrawables(null, null, ContextExtKt.loadDrawable(textView.getContext(), historyRecord.getSubDataIconResId(), R.color.s2, Integer.valueOf(NumberExtKt.getDp(14))), null);
                } else {
                    textView.setCompoundDrawables(ContextExtKt.loadDrawable(textView.getContext(), historyRecord.getSubDataIconResId(), R.color.s2, Integer.valueOf(NumberExtKt.getDp(14))), null, null, null);
                }
                TextView textView2 = homepageItemCardSportRecordInnerBinding.distance;
                if (historyRecord.getTitleDataUnitResId() > 0) {
                    if (historyRecord.isTraining()) {
                        quantityString = ContextExtKt.getQuantityString(getContext(), historyRecord.getTitleDataUnitResId(), historyRecord.getTrainingNo());
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        quantityString = String.format(Locale.getDefault(), "%s %s", Arrays.copyOf(new Object[]{StringsKt__StringsKt.trim(historyRecord.getTitleDataValue()).toString(), StringsKt__StringsKt.trim(getContext().getString(historyRecord.getTitleDataUnitResId())).toString()}, 2));
                    }
                    str = quantityString;
                }
                textView2.setText(str);
                TextView textView3 = homepageItemCardSportRecordInnerBinding.name;
                CharSequence text = homepageItemCardSportRecordInnerBinding.distance.getText();
                if (text == null || text.length() == 0) {
                    dp = NumberExtKt.getDp(165);
                } else {
                    dp = Resources.getSystem().getDisplayMetrics().density > 2.75f ? NumberExtKt.getDp(130) : NumberExtKt.getDp(140);
                }
                textView3.setMaxWidth(dp);
            }
            i2 = i3;
        }
        boolean z = records != null && (records.isEmpty() ^ true);
        AppCompatTextView appCompatTextView = this.viewBinding.middleBg;
        appCompatTextView.setClickable(!z);
        appCompatTextView.setText(z ? "" : ViewExtKt.getString(appCompatTextView, R.string.homepage_item_card_sport_record_none));
        HomepageItemCardSportRecordBinding homepageItemCardSportRecordBinding2 = this.viewBinding;
        Iterator it4 = CollectionsKt__CollectionsKt.listOf((Object[]) new View[]{homepageItemCardSportRecordBinding2.sportCountLast7Days, homepageItemCardSportRecordBinding2.sportDurationLast7Days, homepageItemCardSportRecordBinding2.sportCountLast7DaysTip, homepageItemCardSportRecordBinding2.sportDurationLast7DaysTip, homepageItemCardSportRecordBinding2.viewMore, homepageItemCardSportRecordBinding2.middleLine}).iterator();
        while (it4.hasNext()) {
            ((View) it4.next()).setVisibility(z ? 0 : 8);
        }
    }

    public final void updateSportCountAndTimes(int sportCount, long sportTimes) {
        TextView textView = this.viewBinding.sportCountLast7Days;
        HMSpannable hMSpannable = new HMSpannable();
        String strI18n = I18nKt.i18n(sportCount);
        Typeface maisonTypeface = HomeUtils.getMaisonTypeface();
        int i2 = R.color.s1;
        HMSpannable.append$default(hMSpannable, strI18n, Integer.valueOf(ViewExtKt.loadColor(this, i2)), 30, false, null, maisonTypeface, null, 88, null);
        if (HomeUtils.isChineseLanguage()) {
            HMSpannable.append$default(hMSpannable.addSpaceBlank(), getContext().getString(R.string.homepage_item_card_times), null, null, false, null, null, null, 126, null);
        }
        Unit unit = Unit.INSTANCE;
        textView.setText(hMSpannable.build());
        this.viewBinding.sportDurationLast7Days.setText(HMSpannable.append$default(HMSpannable.append$default(new HMSpannable(), I18nKt.i18n((int) (TimeUnit.SECONDS.toMinutes(sportTimes) + ((long) (sportTimes % ((long) 60) > 30 ? 1 : 0)))), Integer.valueOf(ViewExtKt.loadColor(this, i2)), 30, false, null, HomeUtils.getMaisonTypeface(), null, 88, null).addSpaceBlank(), getContext().getString(R.string.homepage_item_card_unit_minute), null, null, false, null, null, null, 126, null).build());
    }

    @JvmOverloads
    public SportRecordCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        HomepageItemCardSportRecordBinding homepageItemCardSportRecordBindingInflate = HomepageItemCardSportRecordBinding.inflate(LayoutInflater.from(context), this, true);
        this.viewBinding = homepageItemCardSportRecordBindingInflate;
        e(this, homepageItemCardSportRecordBindingInflate.sportCountLast7Days, false, 2, null);
        e(this, homepageItemCardSportRecordBindingInflate.sportCountLast7DaysTip, false, 2, null);
        e(this, homepageItemCardSportRecordBindingInflate.sportDurationLast7Days, false, 2, null);
        e(this, homepageItemCardSportRecordBindingInflate.sportDurationLast7DaysTip, false, 2, null);
        d(homepageItemCardSportRecordBindingInflate.viewMore, false);
        d(homepageItemCardSportRecordBindingInflate.middleBg, false);
        if (!HomeUtils.isChineseLanguage()) {
            HomepageItemCardSportRecordBinding homepageItemCardSportRecordBinding = this.viewBinding;
            ViewGroup.LayoutParams layoutParams = homepageItemCardSportRecordBinding.middleBg.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = NumberExtKt.getDp(85);
            homepageItemCardSportRecordBinding.middleBg.setLayoutParams(layoutParams2);
        }
        post(new Runnable() { // from class: sb7
            @Override // java.lang.Runnable
            public final void run() {
                SportRecordCardView.b(this.a);
            }
        });
    }
}
