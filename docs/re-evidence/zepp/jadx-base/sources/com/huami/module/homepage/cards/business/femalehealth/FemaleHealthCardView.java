package com.huami.module.homepage.cards.business.femalehealth;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.fhservice.ZeppCalendarStatus;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardFemaleHealthBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\f\u0010\u000e\u001a\u00020\u0006*\u00020\u000bH\u0002J\f\u0010\u000f\u001a\u00020\u0006*\u00020\u000bH\u0002J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010&\u001a\u00020\u0002*\u00020\u000b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010%¨\u0006."}, d2 = {"Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "show", "", "f", "", "state", "h", "(Ljava/lang/Integer;)V", "", "Lcom/huami/fhservice/ZeppCalendarStatus;", "list", "g", "a", "c", "status", "Lkotlin/Pair;", "", "Landroid/graphics/Typeface;", "b", "", "date", GoogleApiAvailabilityLight.a, "Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthEntry;", "data", "updateFemaleHealthData", "Lcom/huami/module/homepage/databinding/HomepageItemCardFemaleHealthBinding;", "Lcom/huami/module/homepage/databinding/HomepageItemCardFemaleHealthBinding;", "binding", LogUtil.I, "safeGray", "forecastPink", "periodRed", "e", "pregnantGreen", "ovulationGreen", "(Lcom/huami/fhservice/ZeppCalendarStatus;)Z", "isToday", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthCardView extends ConstraintLayout {

    @Deprecated
    public static final double COLOR_ALPHA = 0.4d;

    @Deprecated
    public static final int MAX_DATA_LIMIT = 5;

    @NotNull
    private static final b g = new b(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardFemaleHealthBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int safeGray;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int forecastPink;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int periodRed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int pregnantGreen;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int ovulationGreen;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_WOMENSHEALTH_C, new Pair[0]);
            if (HomeUtils.isMifitApp()) {
                RouterHelperKt.executeRoute(this.a, RouterHelper.FEMALE_HEALTH_PATH_MIFIT, new Pair[0], "fh_interceptor_first_login");
            } else {
                RouterHelperKt.executeRoute$default(this.a, RouterHelper.FEMALE_HEALTH_PATH, new Pair[0], null, 8, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/business/femalehealth/FemaleHealthCardView$b", "", "", "COLOR_ALPHA", LogUtil.D, "", "MAX_DATA_LIMIT", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public FemaleHealthCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public FemaleHealthCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FemaleHealthCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int a(ZeppCalendarStatus zeppCalendarStatus) {
        Integer status = zeppCalendarStatus.getStatus();
        if (status != null && status.intValue() == 3) {
            return this.ovulationGreen;
        }
        if (status != null && status.intValue() == 5) {
            return this.pregnantGreen;
        }
        if (status != null && status.intValue() == 2) {
            return this.forecastPink;
        }
        return (status != null && status.intValue() == 4) ? this.periodRed : this.safeGray;
    }

    private final Pair<String, Typeface> b(ZeppCalendarStatus status) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, status.getYear());
        calendar.set(2, status.getMonth() - 1);
        calendar.set(5, status.getDay());
        return d(calendar.getTimeInMillis());
    }

    private final int c(ZeppCalendarStatus zeppCalendarStatus) {
        Integer status = zeppCalendarStatus.getStatus();
        if (status != null && status.intValue() == 3) {
            return ViewExtKt.loadColor(this, e(zeppCalendarStatus) ? R.color.s4 : R.color.s1);
        }
        if (status != null && status.intValue() == 4) {
            return ViewExtKt.loadColor(this, R.color.s4);
        }
        if (status != null && status.intValue() == 2) {
            return ViewExtKt.loadColor(this, HomeUtils.isMifitApp() ? R.color.s38 : R.color.s1);
        }
        return ViewExtKt.loadColor(this, R.color.s1);
    }

    private final Pair<String, Typeface> d(long date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
        if (TimeExtKt.isToday(calendar.getTimeInMillis())) {
            return TuplesKt.to(getContext().getString(R.string.homepage_item_card_today_simple), null);
        }
        return TuplesKt.to(new SimpleDateFormat(calendar.get(5) < 10 ? GoogleApiAvailabilityLight.a : "dd", Locale.getDefault()).format(calendar.getTime()), HomeUtils.getMaisonTypeface());
    }

    private final boolean e(ZeppCalendarStatus zeppCalendarStatus) {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) == zeppCalendarStatus.getYear() && calendar.get(2) + 1 == zeppCalendarStatus.getMonth() && calendar.get(5) == zeppCalendarStatus.getDay();
    }

    private final void f(boolean show) {
        this.binding.femaleHealthList.setVisibility(show ? 0 : 8);
        this.binding.femaleHealthContent.setVisibility(show ? 0 : 8);
        this.binding.femaleHealthLevel.setVisibility(show ? 0 : 8);
        this.binding.homepageFemaleHealthNoneGroup.setVisibility(show ? 8 : 0);
    }

    private final void g(List<ZeppCalendarStatus> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ZeppCalendarStatus zeppCalendarStatus : list) {
            Pair<String, Typeface> pairB = b(zeppCalendarStatus);
            arrayList.add(new CircleParam(a(zeppCalendarStatus), c(zeppCalendarStatus), pairB.component1(), e(zeppCalendarStatus), pairB.component2()));
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (i < 5) {
                arrayList2.add(obj);
            }
            i = i2;
        }
        this.binding.femaleHealthList.setCircleParam(arrayList2);
    }

    private final void h(Integer state) {
        int i;
        if (state == null) {
            i = R.string.homepage_female_health_today_none_data;
        } else if (state.intValue() == 1) {
            i = R.string.homepage_female_health_save_level;
        } else if (state.intValue() == 2) {
            i = R.string.homepage_female_health_forecast_level;
        } else if (state.intValue() == 3) {
            i = R.string.homepage_female_health_ovulation_level;
        } else if (state.intValue() == 4) {
            i = R.string.homepage_female_health_sanitary_level;
        } else {
            i = state.intValue() == 5 ? R.string.homepage_female_health_pregnancy_level : R.string.homepage_female_health_today_none_data;
        }
        this.binding.femaleHealthLevel.setText(i == 0 ? "" : getContext().getString(i));
    }

    public final void updateFemaleHealthData(@NotNull FemaleHealthEntry data) {
        h(data.getState());
        this.binding.femaleHealthContent.setText(data.getContent());
        g(data.getCalendarState());
        f(data.getHasData());
    }

    @JvmOverloads
    public FemaleHealthCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HomepageItemCardFemaleHealthBinding homepageItemCardFemaleHealthBindingInflate = HomepageItemCardFemaleHealthBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = homepageItemCardFemaleHealthBindingInflate;
        this.safeGray = ViewExtKt.loadColor(this, R.color.s4);
        int i2 = R.color.s51;
        this.forecastPink = NumberExtKt.addAlpha(ViewExtKt.loadColor(this, i2), 0.4d);
        this.periodRed = ViewExtKt.loadColor(this, i2);
        int i3 = R.color.s23;
        this.pregnantGreen = NumberExtKt.addAlpha(ViewExtKt.loadColor(this, i3), 0.4d);
        this.ovulationGreen = ViewExtKt.loadColor(this, i3);
        ExteranelKt.setOnClickWithPolicyListener(homepageItemCardFemaleHealthBindingInflate.getRoot(), new a(context));
        homepageItemCardFemaleHealthBindingInflate.femaleHealthList.setVisibility(8);
        homepageItemCardFemaleHealthBindingInflate.homepageFemaleHealthNoneGroup.setVisibility(0);
    }
}
