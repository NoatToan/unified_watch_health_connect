package com.huami.module.homepage.cards.business.sleepbreath;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.cardui.CardTitleBarView;
import com.huami.module.homepage.cards.cardui.PiecewiseLineView;
import com.huami.module.homepage.cards.helper.ChartRenderHelper;
import com.huami.module.homepage.cards.helper.CurveChartPoint;
import com.huami.module.homepage.cards.helper.CurveGraphParam;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageItemCardBreathEqualityBinding;
import com.huami.module.homepage.databinding.HomepageItemCardBreathEqualityI18nBinding;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.sleep.service.SleepBreathWearHintCode;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.e;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\fB'\b\u0007\u0012\u0006\u0010V\u001a\u00020U\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010W\u0012\b\b\u0002\u0010Y\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010[J\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tJ0\u0010\u001b\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0016\u0010)\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0018\u0010+\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010 R\u0016\u00107\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010 R\u0016\u00109\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010 R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010B\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010AR\u0016\u0010J\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010AR\u0019\u0010P\u001a\u00020K8\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010A¨\u0006]"}, d2 = {"Lcom/huami/module/homepage/cards/business/sleepbreath/SleepBreathCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/huami/sleep/service/SleepBreathWearHintCode;", FirebaseAnalytics.Param.LEVEL, "Lkotlin/Pair;", "", "", "", "a", "", "show", "", "b", "", "lastTime", EcgData.TIMESTAMP_SERVER_UPDATED, "(Ljava/lang/Long;)V", "breathScore", "updateState", "(Lcom/huami/sleep/service/SleepBreathWearHintCode;Ljava/lang/Integer;)V", "hasBreathData", "updateViewShowState", "Ljava/util/Date;", "breathStartTime", "breathEndTime", "Lcom/huami/module/homepage/cards/helper/CurveChartPoint;", "curveChartPoint", "updateBreathChartView", "Lcom/huami/module/homepage/cards/cardui/CardTitleBarView;", "Lcom/huami/module/homepage/cards/cardui/CardTitleBarView;", "breathBar", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "stateScoreView", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "stateIconView", GoogleApiAvailabilityLight.a, "stateTextView", "e", "stateDescView", "f", "descUnderScoreView", "Lcom/huami/module/homepage/cards/cardui/PiecewiseLineView;", "g", "Lcom/huami/module/homepage/cards/cardui/PiecewiseLineView;", "piecewiseView", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "chartView", "i", "startTimeView", z.j, "endTimeView", hl.k, "noneDataView", "Landroid/view/View;", "l", "Landroid/view/View;", "lineRightView", "m", "detailView", GoogleApiAvailabilityLight.b, LogUtil.I, "green", "o", "yellow", com.google.android.exoplayer2.text.ttml.b.r, "orange", DTransferConstants.SEARCH_KEY, "red", "r", "gray", "Landroidx/viewbinding/ViewBinding;", SOAP.XMLNS, "Landroidx/viewbinding/ViewBinding;", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "binding", "t", "J", "breathUpdateTime", "u", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "v", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SleepBreathCardView extends ConstraintLayout {

    @Deprecated
    public static final int BREATH_BAD = 80;

    @Deprecated
    public static final int BREATH_GOOD = 100;

    @Deprecated
    public static final int BREATH_KEEP_FOCUS = 90;

    @Deprecated
    public static final int MAX_VALUE = 8;

    @NotNull
    private static final b v = new b(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private CardTitleBarView breathBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TextView stateScoreView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ImageView stateIconView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private TextView stateTextView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private TextView stateDescView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private TextView descUnderScoreView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private PiecewiseLineView piecewiseView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private FrameLayout chartView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private TextView startTimeView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private TextView endTimeView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private TextView noneDataView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private View lineRightView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private View detailView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int green;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int yellow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int orange;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int red;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int gray;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final ViewBinding binding;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long breathUpdateTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int breathScore;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepBreathWearHintCode.values().length];
            iArr[SleepBreathWearHintCode.NORMAL.ordinal()] = 1;
            iArr[SleepBreathWearHintCode.NORMAL_DEFICIENT.ordinal()] = 2;
            iArr[SleepBreathWearHintCode.LOW.ordinal()] = 3;
            iArr[SleepBreathWearHintCode.MEDIUM.ordinal()] = 4;
            iArr[SleepBreathWearHintCode.HIGH.ordinal()] = 5;
            iArr[SleepBreathWearHintCode.DATA_DEFICIENT.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ SleepBreathCardView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, SleepBreathCardView sleepBreathCardView) {
            super(0);
            this.a = context;
            this.b = sleepBreathCardView;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_CARDS_SLEEP_BREATH_QUALITY_C, new Pair[0]);
            if (HomeUtils.isMifitApp()) {
                RouterHelperKt.executeRoute$default(this.a, RouterHelper.SLEEP_BREATH_PATH, new Pair[]{TuplesKt.to("sleep_breath", Boolean.TRUE), TuplesKt.to("key_date", Long.valueOf(this.b.breathUpdateTime)), TuplesKt.to("key_score", Integer.valueOf(this.b.breathScore))}, null, 8, null);
            } else {
                RouterHelperKt.executeRoute$default(this.a, RouterHelper.SLEEP_BREATH_PATH, new Pair[]{TuplesKt.to("user_id", HMPersonInfo.getInstance().getUserInfo().getUserid()), TuplesKt.to("time", Long.valueOf(this.b.breathUpdateTime))}, null, 8, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/business/sleepbreath/SleepBreathCardView$b", "", "", "BREATH_BAD", LogUtil.I, "BREATH_GOOD", "BREATH_KEEP_FOCUS", "MAX_VALUE", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public SleepBreathCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepBreathCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepBreathCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final Pair<Float, List<Integer>> a(SleepBreathWearHintCode level) {
        int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 1 || i == 2) {
            return TuplesKt.to(Float.valueOf(1.0f), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.green), Integer.valueOf(this.gray), Integer.valueOf(this.gray), Integer.valueOf(this.gray)}));
        }
        if (i == 3) {
            return TuplesKt.to(Float.valueOf(3.0f), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.gray), Integer.valueOf(this.yellow), Integer.valueOf(this.gray), Integer.valueOf(this.gray)}));
        }
        if (i != 4) {
            return i != 5 ? TuplesKt.to(Float.valueOf(0.0f), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.gray), Integer.valueOf(this.gray), Integer.valueOf(this.gray), Integer.valueOf(this.gray)})) : TuplesKt.to(Float.valueOf(7.0f), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.gray), Integer.valueOf(this.gray), Integer.valueOf(this.gray), Integer.valueOf(this.red)}));
        }
        return TuplesKt.to(Float.valueOf(5.0f), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.gray), Integer.valueOf(this.gray), Integer.valueOf(this.orange), Integer.valueOf(this.gray)}));
    }

    private final void b(boolean show) {
        if (!show) {
            if (this.detailView.getVisibility() == 0) {
                this.breathBar.getExpandButton().performClick();
            }
        }
        this.breathBar.getExpandButton().setVisibility(show ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBreathChartView$default(SleepBreathCardView sleepBreathCardView, Date date, Date date2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        if ((i & 2) != 0) {
            date2 = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        sleepBreathCardView.updateBreathChartView(date, date2, list);
    }

    @NotNull
    public final ViewBinding getBinding() {
        return this.binding;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    public final void updateBreathChartView(@Nullable Date breathStartTime, @Nullable Date breathEndTime, @Nullable List<CurveChartPoint> curveChartPoint) {
        boolean z;
        String str;
        List<CurveChartPoint> list;
        String str2;
        if (curveChartPoint != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(curveChartPoint, 10));
            Iterator<T> it2 = curveChartPoint.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf(((CurveChartPoint) it2.next()).getValue()));
            }
            if (CollectionsKt___CollectionsKt.sumOfFloat(arrayList) > 0.0f) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        b(z);
        if (z) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            TextView textView = this.startTimeView;
            String str3 = "--";
            if (breathStartTime == null || (str = simpleDateFormat.format(breathStartTime)) == null) {
                str = "--";
            }
            textView.setText(str);
            TextView textView2 = this.endTimeView;
            if (breathEndTime != null && (str2 = simpleDateFormat.format(breathEndTime)) != null) {
                str3 = str2;
            }
            textView2.setText(str3);
            Float fValueOf = null;
            List<CurveChartPoint> list2 = (curveChartPoint != null && (curveChartPoint.isEmpty() ^ true)) ? curveChartPoint : null;
            if (list2 == null) {
                IntRange intRange = new IntRange(0, 6);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                Iterator<Integer> it3 = intRange.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new CurveChartPoint(((IntIterator) it3).nextInt(), 0.0f));
                }
                list = arrayList2;
            } else {
                list = list2;
            }
            if (curveChartPoint != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(curveChartPoint, 10));
                Iterator<T> it4 = curveChartPoint.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Float.valueOf(((CurveChartPoint) it4.next()).getValue()));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (((Number) obj).floatValue() > 0.0f) {
                        arrayList4.add(obj);
                    }
                }
                if (!(!arrayList4.isEmpty())) {
                    arrayList4 = null;
                }
                if (arrayList4 != null) {
                    fValueOf = Float.valueOf((float) CollectionsKt___CollectionsKt.averageOfFloat(arrayList4));
                }
            }
            int iLoadColor = ViewExtKt.loadColor(this, R.color.s15);
            ChartRenderHelper.INSTANCE.renderCurveChart(this.chartView, new CurveGraphParam(list, iLoadColor, NumberExtKt.addAlpha(iLoadColor, 0.5d), 0, 0, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iLoadColor), Integer.valueOf(ViewExtKt.loadColor(this, R.color.s17))}), false, null, null, null, fValueOf == null ? CollectionsKt__CollectionsKt.emptyList() : e.listOf(fValueOf), null, 7, Integer.valueOf(NumberExtKt.getDp(55)), null, Float.valueOf(0.0f), 19344, null));
        }
    }

    public final void updateState(@Nullable SleepBreathWearHintCode level, @Nullable Integer breathScore) {
        String string;
        String string2;
        if (level == null || breathScore == null) {
            return;
        }
        this.breathScore = breathScore.intValue();
        TextView textView = this.stateTextView;
        switch (WhenMappings.$EnumSwitchMapping$0[level.ordinal()]) {
            case 1:
            case 2:
                string = getContext().getString(R.string.homepage_item_card_normal);
                break;
            case 3:
                string = getContext().getString(R.string.homepage_item_card_low_risk);
                break;
            case 4:
                string = getContext().getString(R.string.homepage_item_card_middle_risk);
                break;
            case 5:
                string = getContext().getString(R.string.homepage_item_card_high_risk);
                break;
            case 6:
                string = getContext().getString(R.string.homepage_item_card_no_enough_data);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        textView.setText(string);
        ImageView imageView = this.stateIconView;
        if (imageView != null) {
            imageView.setImageResource(level == SleepBreathWearHintCode.NORMAL ? R.drawable.item_card_sleep_smile : R.drawable.item_card_upset);
        }
        Pair<Float, List<Integer>> pairA = a(level);
        PiecewiseLineView piecewiseColor = this.piecewiseView.setValue(pairA.component1().floatValue()).setPiecewiseColor(pairA.component2());
        SleepBreathWearHintCode sleepBreathWearHintCode = SleepBreathWearHintCode.DATA_DEFICIENT;
        piecewiseColor.setShowIndicator(level != sleepBreathWearHintCode).refresh();
        if ((level == sleepBreathWearHintCode || level == SleepBreathWearHintCode.NORMAL_DEFICIENT) ? false : true) {
            this.stateDescView.setVisibility(8);
            TextView textView2 = this.stateScoreView;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.stateScoreView;
            if (textView3 != null) {
                textView3.setText(getContext().getString(R.string.homepage_item_card_score_x, breathScore));
            }
            TextView textView4 = this.descUnderScoreView;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            TextView textView5 = this.descUnderScoreView;
            if (textView5 == null) {
                return;
            }
            int iIntValue = breathScore.intValue();
            if (iIntValue >= 0 && iIntValue < 80) {
                string2 = getContext().getString(R.string.homepage_item_card_ask_medical);
            } else {
                if (80 <= iIntValue && iIntValue < 90) {
                    string2 = getContext().getString(R.string.homepage_item_card_keep_focus);
                } else {
                    string2 = 90 <= iIntValue && iIntValue <= 100 ? getContext().getString(R.string.homepage_item_card_keep_on) : "";
                }
            }
            textView5.setText(string2);
            return;
        }
        TextView textView6 = this.stateScoreView;
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        TextView textView7 = this.descUnderScoreView;
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
        this.stateDescView.setVisibility(0);
        this.stateDescView.setText(getContext().getString(R.string.homepage_item_card_no_enough_data_tip));
        if (breathScore.intValue() < 90) {
            this.stateTextView.setText(getContext().getString(R.string.homepage_item_card_no_enough_data));
            ImageView imageView2 = this.stateIconView;
            if (imageView2 == null) {
                return;
            }
            imageView2.setImageResource(R.drawable.item_card_upset);
            return;
        }
        this.stateTextView.setText(getContext().getString(R.string.homepage_item_card_normal));
        ImageView imageView3 = this.stateIconView;
        if (imageView3 == null) {
            return;
        }
        imageView3.setImageResource(R.drawable.item_card_sleep_smile);
    }

    public final void updateTime(@Nullable Long lastTime) {
        if (lastTime != null) {
            this.breathUpdateTime = lastTime.longValue();
        }
        this.breathBar.setFirstTime(lastTime == null ? 0L : lastTime.longValue());
    }

    public final void updateViewShowState(boolean hasBreathData) {
        this.breathBar.getExpandButton().setVisibility(hasBreathData ? 0 : 8);
        ImageView imageView = this.stateIconView;
        if (imageView != null) {
            imageView.setVisibility(hasBreathData ? 0 : 4);
        }
        this.stateTextView.setVisibility(hasBreathData ? 0 : 8);
        View view = this.lineRightView;
        if (view != null) {
            view.setVisibility(hasBreathData ? 0 : 8);
        }
        if (!hasBreathData) {
            this.stateDescView.setVisibility(8);
            TextView textView = this.stateScoreView;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.descUnderScoreView;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        this.noneDataView.setVisibility(hasBreathData ? 8 : 0);
        PiecewiseLineView piecewiseLineView = this.piecewiseView;
        ViewGroup.LayoutParams layoutParams = piecewiseLineView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (hasBreathData) {
            layoutParams2.topToBottom = HomeUtils.isChineseLanguage() ? R.id.icon : R.id.desc;
            layoutParams2.bottomToBottom = -1;
            layoutParams2.setMargins(0, NumberExtKt.getDp(15), 0, 0);
        } else {
            layoutParams2.topToBottom = -1;
            layoutParams2.bottomToBottom = R.id.no_sleep_breath_data;
            layoutParams2.setMargins(0, 0, 0, NumberExtKt.getDp(19));
        }
        Unit unit = Unit.INSTANCE;
        piecewiseLineView.setLayoutParams(layoutParams2);
    }

    @JvmOverloads
    public SleepBreathCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ViewBinding viewBinding;
        super(context, attributeSet, i);
        this.green = ViewExtKt.loadColor(this, R.color.s20);
        this.yellow = ViewExtKt.loadColor(this, R.color.s34);
        this.orange = ViewExtKt.loadColor(this, R.color.s31);
        this.red = ViewExtKt.loadColor(this, R.color.p3);
        int iLoadColor = ViewExtKt.loadColor(this, R.color.s4);
        this.gray = iLoadColor;
        if (HomeUtils.isChineseLanguage()) {
            HomepageItemCardBreathEqualityBinding homepageItemCardBreathEqualityBindingInflate = HomepageItemCardBreathEqualityBinding.inflate(LayoutInflater.from(context), this, true);
            this.breathBar = homepageItemCardBreathEqualityBindingInflate.sleepBreathBar;
            this.stateScoreView = homepageItemCardBreathEqualityBindingInflate.score;
            this.stateIconView = homepageItemCardBreathEqualityBindingInflate.icon;
            this.stateTextView = homepageItemCardBreathEqualityBindingInflate.state;
            this.stateDescView = homepageItemCardBreathEqualityBindingInflate.desc;
            this.descUnderScoreView = homepageItemCardBreathEqualityBindingInflate.descUnderScore;
            this.piecewiseView = homepageItemCardBreathEqualityBindingInflate.stateBar;
            this.chartView = homepageItemCardBreathEqualityBindingInflate.chartContainer;
            this.startTimeView = homepageItemCardBreathEqualityBindingInflate.startTime;
            this.endTimeView = homepageItemCardBreathEqualityBindingInflate.endTime;
            this.noneDataView = homepageItemCardBreathEqualityBindingInflate.noSleepBreathData;
            this.lineRightView = homepageItemCardBreathEqualityBindingInflate.lineRightOfState;
            this.detailView = homepageItemCardBreathEqualityBindingInflate.detail;
            Unit unit = Unit.INSTANCE;
            viewBinding = homepageItemCardBreathEqualityBindingInflate;
        } else {
            HomepageItemCardBreathEqualityI18nBinding homepageItemCardBreathEqualityI18nBindingInflate = HomepageItemCardBreathEqualityI18nBinding.inflate(LayoutInflater.from(context), this, true);
            this.breathBar = homepageItemCardBreathEqualityI18nBindingInflate.sleepBreathBar;
            this.stateTextView = homepageItemCardBreathEqualityI18nBindingInflate.state;
            this.stateDescView = homepageItemCardBreathEqualityI18nBindingInflate.desc;
            this.piecewiseView = homepageItemCardBreathEqualityI18nBindingInflate.stateBar;
            this.chartView = homepageItemCardBreathEqualityI18nBindingInflate.chartContainer;
            this.startTimeView = homepageItemCardBreathEqualityI18nBindingInflate.startTime;
            this.endTimeView = homepageItemCardBreathEqualityI18nBindingInflate.endTime;
            this.noneDataView = homepageItemCardBreathEqualityI18nBindingInflate.noSleepBreathData;
            this.detailView = homepageItemCardBreathEqualityI18nBindingInflate.detail;
            Unit unit2 = Unit.INSTANCE;
            viewBinding = homepageItemCardBreathEqualityI18nBindingInflate;
        }
        this.binding = viewBinding;
        this.breathUpdateTime = System.currentTimeMillis();
        this.piecewiseView.setPiecewiseColor(iLoadColor, iLoadColor, iLoadColor, iLoadColor).setMaxValue(8).setShowIndicator(false).refresh();
        ExteranelKt.setOnClickWithPolicyListener(viewBinding.getRoot(), new a(context, this));
    }
}
