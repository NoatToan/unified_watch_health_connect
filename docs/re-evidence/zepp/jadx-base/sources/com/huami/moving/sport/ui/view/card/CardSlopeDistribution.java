package com.huami.moving.sport.ui.view.card;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.HMPieChart;
import com.huami.chart.data.ArcChartData;
import com.huami.chart.data.PieDataList;
import com.huami.moving.sport.ui.R;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.math.BigDecimal;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010$B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/CardSlopeDistribution;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackrecord", "", "showCyclingSlopeView", "", "a", "Ljava/lang/String;", "TAG", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "mTvUpHillTime", "c", "mTvFatGroundTime", GoogleApiAvailabilityLight.a, "mTvDownHillTime", "e", "mTvUpHillPercentage", "f", "mTvFatGroundPercentage", "g", "mTvDownHillPercentage", "Lcom/huami/chart/chart/HMPieChart;", "h", "Lcom/huami/chart/chart/HMPieChart;", "mSportSlopeDistribution", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CardSlopeDistribution extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TextView mTvUpHillTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextView mTvFatGroundTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private TextView mTvDownHillTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TextView mTvUpHillPercentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TextView mTvFatGroundPercentage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TextView mTvDownHillPercentage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private HMPieChart mSportSlopeDistribution;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.FloatRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.FloatRef floatRef) {
            super(0);
            this.a = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "  baseArc： " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.FloatRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.FloatRef floatRef) {
            super(0);
            this.a = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "downPercent  startArc： " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.FloatRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.FloatRef floatRef) {
            super(0);
            this.a = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "  startArc1： " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.FloatRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.FloatRef floatRef) {
            super(0);
            this.a = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "downPercent  startArc： " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.FloatRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.FloatRef floatRef) {
            super(0);
            this.a = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "  startArc2： " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.FloatRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref.FloatRef floatRef) {
            super(0);
            this.a = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "  startArc3： " + this.a.element;
        }
    }

    public CardSlopeDistribution(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "CardSlopeDistribution";
        LayoutInflater.from(context).inflate(R.layout.card_slope_distribution, this);
        this.mTvUpHillTime = (TextView) findViewById(R.id.tv_uphill_time);
        this.mTvFatGroundTime = (TextView) findViewById(R.id.tv_fat_ground_time);
        this.mTvDownHillTime = (TextView) findViewById(R.id.tv_downhill_time);
        this.mTvUpHillPercentage = (TextView) findViewById(R.id.tv_uphill_percent);
        this.mTvFatGroundPercentage = (TextView) findViewById(R.id.tv_fat_ground_percent);
        this.mTvDownHillPercentage = (TextView) findViewById(R.id.tv_downhill_percent);
        this.mSportSlopeDistribution = (HMPieChart) findViewById(R.id.sport_slope_distribution);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void showCyclingSlopeView(@NotNull Trackrecord trackrecord) {
        Integer costtime = trackrecord.getCosttime();
        int i = 0;
        int iIntValue = costtime == null ? 0 : costtime.intValue();
        Integer climbDisAscendTime = trackrecord.getClimbDisAscendTime();
        int iIntValue2 = climbDisAscendTime == null ? -1 : climbDisAscendTime.intValue();
        Integer climbDisDescendTime = trackrecord.getClimbDisDescendTime();
        int iIntValue3 = climbDisDescendTime != null ? climbDisDescendTime.intValue() : -1;
        int i2 = (iIntValue2 < 0 || iIntValue3 < 0) ? iIntValue : (iIntValue - iIntValue2) - iIntValue3;
        TextView textView = this.mTvUpHillTime;
        Objects.requireNonNull(textView);
        textView.setText(DataFormatter.getConsumeTime(iIntValue2));
        TextView textView2 = this.mTvDownHillTime;
        Objects.requireNonNull(textView2);
        textView2.setText(DataFormatter.getConsumeTime(iIntValue3));
        TextView textView3 = this.mTvFatGroundTime;
        Objects.requireNonNull(textView3);
        textView3.setText(DataFormatter.getConsumeTime(i2));
        int iIntValue4 = (iIntValue <= 0 || iIntValue2 <= 0) ? 0 : new BigDecimal((((double) iIntValue2) / ((double) iIntValue)) * ((double) 100)).setScale(0, 4).intValue();
        int iIntValue5 = (iIntValue <= 0 || iIntValue3 <= 0) ? 0 : new BigDecimal((((double) iIntValue3) / ((double) iIntValue)) * ((double) 100)).setScale(0, 4).intValue();
        int i3 = (100 - iIntValue4) - iIntValue5;
        int i4 = (1 > iIntValue4 || iIntValue4 > 99) ? 0 : 1;
        if (1 <= i3 && i3 <= 99) {
            i4++;
        }
        if (1 <= iIntValue5 && iIntValue5 <= 99) {
            i4++;
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 360 - (i4 * 4.0f);
        TextView textView4 = this.mTvUpHillPercentage;
        Objects.requireNonNull(textView4);
        Context context = getContext();
        int i5 = com.huami.moving.R.string.runningdetail_forefoot_ratio;
        textView4.setText(context.getString(i5, Integer.valueOf(iIntValue4)));
        TextView textView5 = this.mTvDownHillPercentage;
        Objects.requireNonNull(textView5);
        textView5.setText(getContext().getString(i5, Integer.valueOf(iIntValue5)));
        TextView textView6 = this.mTvFatGroundPercentage;
        Objects.requireNonNull(textView6);
        textView6.setText(getContext().getString(i5, Integer.valueOf(i3)));
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        HMPieChart hMPieChart = this.mSportSlopeDistribution;
        Objects.requireNonNull(hMPieChart);
        SparseArray sparseArray = new SparseArray();
        HMLog.info(this.TAG, new a(floatRef));
        if (iIntValue4 > 0) {
            i = 1;
            float f2 = iIntValue4;
            sparseArray.put(1, new ArcChartData(1, floatRef2.element, (floatRef.element * f2) / 100.0f, null, ContextCompat.getColor(getContext(), R.color.p3), 0, 40, null));
            floatRef2.element = ((floatRef.element * f2) / 100.0f) + 4.0f;
            HMLog.info(this.TAG, new b(floatRef2));
        }
        HMLog.info(this.TAG, new c(floatRef2));
        if (i3 > 0) {
            i++;
            float f3 = i3;
            sparseArray.put(i, new ArcChartData(i, floatRef2.element, (floatRef.element * f3) / 100.0f, null, ContextCompat.getColor(getContext(), R.color.s33), 0, 40, null));
            floatRef2.element = floatRef2.element + ((floatRef.element * f3) / 100.0f) + 4.0f;
            HMLog.info(this.TAG, new d(floatRef2));
        }
        HMLog.info(this.TAG, new e(floatRef2));
        if (iIntValue5 > 0) {
            int i6 = i + 1;
            sparseArray.put(i6, new ArcChartData(i6, floatRef2.element, (floatRef.element * iIntValue5) / 100.0f, null, ContextCompat.getColor(getContext(), R.color.s15), 0, 40, null));
        }
        HMLog.info(this.TAG, new f(floatRef2));
        Unit unit = Unit.INSTANCE;
        hMPieChart.refresh(new PieDataList(sparseArray));
    }

    public CardSlopeDistribution(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardSlopeDistribution(@NotNull Context context) {
        this(context, null);
    }
}
