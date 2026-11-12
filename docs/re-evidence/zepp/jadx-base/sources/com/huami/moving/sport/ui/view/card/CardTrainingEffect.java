package com.huami.moving.sport.ui.view.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.HMSpeedDialChart;
import com.huami.moving.sport.ui.R;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.math.BigDecimal;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 D2\u00020\u0001:\u0001DB!\u0012\u0006\u0010<\u001a\u00020;\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\u0006\u0010?\u001a\u00020\u000b¢\u0006\u0004\b@\u0010AB\u001b\b\u0016\u0012\u0006\u0010<\u001a\u00020;\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b@\u0010BB\u0011\b\u0016\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b@\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bR\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010&\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\"\u0010*\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010.\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\"\u00102\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\"\u00106\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\"\u0010:\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001b\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001f¨\u0006E"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/CardTrainingEffect;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackrecord", "", GoogleApiAvailabilityLight.a, "c", "", "te", "", "b", "", "a", "type", "e", "showType", "showView", "Ljava/lang/String;", "TAG", "Lcom/huami/chart/chart/HMSpeedDialChart;", "Lcom/huami/chart/chart/HMSpeedDialChart;", "getMChartAerobic", "()Lcom/huami/chart/chart/HMSpeedDialChart;", "setMChartAerobic", "(Lcom/huami/chart/chart/HMSpeedDialChart;)V", "mChartAerobic", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "getMAerobicScore", "()Landroid/widget/TextView;", "setMAerobicScore", "(Landroid/widget/TextView;)V", "mAerobicScore", "getMAerobicState", "setMAerobicState", "mAerobicState", "getMChartAnaerobic", "setMChartAnaerobic", "mChartAnaerobic", "f", "getMAnaerobicScore", "setMAnaerobicScore", "mAnaerobicScore", "g", "getMAnaerobicState", "setMAnaerobicState", "mAnaerobicState", "h", "getMLine", "setMLine", "mLine", "i", "getMTvAerobic", "setMTvAerobic", "mTvAerobic", z.j, "getMTAvaerobic", "setMTAvaerobic", "mTAvaerobic", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CardTrainingEffect extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int k = 1;
    private static int l = 2;
    private static int m = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private HMSpeedDialChart mChartAerobic;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private TextView mAerobicScore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private TextView mAerobicState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private HMSpeedDialChart mChartAnaerobic;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private TextView mAnaerobicScore;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private TextView mAnaerobicState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private TextView mLine;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private TextView mTvAerobic;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private TextView mTAvaerobic;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/CardTrainingEffect$Companion;", "", "", "SHOW_ET", LogUtil.I, "getSHOW_ET", "()I", "SHOW_TE_ANAEROBIC", "getSHOW_TE_ANAEROBIC", "setSHOW_TE_ANAEROBIC", "(I)V", "SHOW_TWO_VIEW", "getSHOW_TWO_VIEW", "setSHOW_TWO_VIEW", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSHOW_ET() {
            return CardTrainingEffect.k;
        }

        public final int getSHOW_TE_ANAEROBIC() {
            return CardTrainingEffect.l;
        }

        public final int getSHOW_TWO_VIEW() {
            return CardTrainingEffect.m;
        }

        public final void setSHOW_TE_ANAEROBIC(int i) {
            CardTrainingEffect.l = i;
        }

        public final void setSHOW_TWO_VIEW(int i) {
            CardTrainingEffect.m = i;
        }
    }

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
            return "showTEView " + (this.a.element / 5.0f);
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
            return "showTEView " + (this.a.element / 5.0f);
        }
    }

    public CardTrainingEffect(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "CardTrainingEffect";
        LayoutInflater.from(context).inflate(R.layout.moving_ui_card_training_effect, this);
        this.mChartAerobic = (HMSpeedDialChart) findViewById(R.id.chart_aerobic);
        this.mAerobicScore = (TextView) findViewById(R.id.tv_aerobic_score);
        this.mAerobicState = (TextView) findViewById(R.id.tv_aerobic_state);
        this.mChartAnaerobic = (HMSpeedDialChart) findViewById(R.id.chart_anaerobic);
        this.mAnaerobicScore = (TextView) findViewById(R.id.tv_anaerobic_score);
        this.mAnaerobicState = (TextView) findViewById(R.id.tv_anaerobic_state);
        this.mLine = (TextView) findViewById(R.id.line);
        this.mTvAerobic = (TextView) findViewById(R.id.tv_aerobic);
        this.mTAvaerobic = (TextView) findViewById(R.id.tv_anaerobic);
    }

    private final int a(float te) {
        if (0.0f <= te && te <= 0.9f) {
            return ContextCompat.getColor(getContext(), R.color.s15);
        }
        if (1.0f <= te && te <= 1.9f) {
            return ContextCompat.getColor(getContext(), R.color.s20);
        }
        if (2.0f <= te && te <= 2.9f) {
            return ContextCompat.getColor(getContext(), R.color.s33);
        }
        if (3.0f <= te && te <= 3.9f) {
            return ContextCompat.getColor(getContext(), R.color.s30);
        }
        return 4.0f <= te && te <= 4.9f ? ContextCompat.getColor(getContext(), R.color.p3) : ContextCompat.getColor(getContext(), R.color.p3);
    }

    private final String b(float te) {
        if (0.0f <= te && te <= 0.9f) {
            return getContext().getString(R.string.moving_ui_no_effect);
        }
        if (1.0f <= te && te <= 1.9f) {
            return getContext().getString(R.string.moving_ui_weak);
        }
        if (2.0f <= te && te <= 2.9f) {
            return getContext().getString(R.string.moving_ui_moderate);
        }
        if (3.0f <= te && te <= 3.9f) {
            return getContext().getString(R.string.moving_ui_good);
        }
        return 4.0f <= te && te <= 4.9f ? getContext().getString(R.string.moving_ui_excellent) : getContext().getString(R.string.moving_ui_overweight);
    }

    private final void c(Trackrecord trackrecord) {
        HMSpeedDialChart hMSpeedDialChart = this.mChartAnaerobic;
        if (hMSpeedDialChart == null) {
            return;
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Integer teAnaerobicValue = trackrecord.getTeAnaerobicValue();
        floatRef.element = (teAnaerobicValue == null ? -1 : teAnaerobicValue.intValue()) / 10.0f;
        float fFloatValue = new BigDecimal(floatRef.element).setScale(1, 4).floatValue();
        floatRef.element = fFloatValue;
        if (fFloatValue >= 0.0f) {
            HMLog.info(this.TAG, new a(floatRef));
            hMSpeedDialChart.refresh(floatRef.element / 5.0f);
        }
        getMAnaerobicScore().setText(String.valueOf(floatRef.element));
        getMAnaerobicState().setText(b(floatRef.element));
        getMAnaerobicState().setTextColor(a(floatRef.element));
    }

    private final void d(Trackrecord trackrecord) {
        HMSpeedDialChart hMSpeedDialChart = this.mChartAerobic;
        if (hMSpeedDialChart == null) {
            return;
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Integer teValue = trackrecord.getTeValue();
        floatRef.element = (teValue == null ? -1 : teValue.intValue()) / 10.0f;
        float fFloatValue = new BigDecimal(floatRef.element).setScale(1, 4).floatValue();
        floatRef.element = fFloatValue;
        if (fFloatValue >= 0.0f) {
            HMLog.info(this.TAG, new b(floatRef));
            hMSpeedDialChart.refresh(floatRef.element / 5.0f);
        }
        getMAerobicScore().setText(String.valueOf(floatRef.element));
        getMAerobicState().setText(b(floatRef.element));
        getMAerobicState().setTextColor(a(floatRef.element));
    }

    private final void e(int type) {
        if (type == k) {
            ViewGroup.LayoutParams layoutParams = this.mChartAerobic.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.endToEnd = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.setMarginEnd((int) ViewUtils.dp2px(getContext(), 108.0f));
            layoutParams2.setMarginStart((int) ViewUtils.dp2px(getContext(), 108.0f));
            this.mChartAerobic.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.mTvAerobic.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.endToEnd = 0;
            layoutParams4.startToStart = 0;
            this.mTvAerobic.setLayoutParams(layoutParams4);
            this.mTvAerobic.setVisibility(0);
            this.mChartAerobic.setVisibility(0);
            this.mChartAerobic.setVisibility(0);
            this.mAerobicScore.setVisibility(0);
            this.mAerobicState.setVisibility(0);
            return;
        }
        if (type != l) {
            this.mTvAerobic.setVisibility(0);
            this.mChartAerobic.setVisibility(0);
            this.mChartAerobic.setVisibility(0);
            this.mAerobicScore.setVisibility(0);
            this.mAerobicState.setVisibility(0);
            this.mLine.setVisibility(0);
            this.mTAvaerobic.setVisibility(0);
            this.mChartAnaerobic.setVisibility(0);
            this.mAnaerobicScore.setVisibility(0);
            this.mAnaerobicState.setVisibility(0);
            return;
        }
        ViewGroup.LayoutParams layoutParams5 = this.mChartAnaerobic.getLayoutParams();
        Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        layoutParams6.endToEnd = 0;
        layoutParams6.startToStart = 0;
        layoutParams6.setMarginEnd((int) ViewUtils.dp2px(getContext(), 108.0f));
        layoutParams6.setMarginStart((int) ViewUtils.dp2px(getContext(), 108.0f));
        this.mChartAnaerobic.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.mTAvaerobic.getLayoutParams();
        Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        layoutParams8.endToEnd = 0;
        layoutParams8.startToStart = 0;
        layoutParams8.setMarginEnd((int) ViewUtils.dp2px(getContext(), 108.0f));
        layoutParams8.setMarginStart((int) ViewUtils.dp2px(getContext(), 108.0f));
        this.mTAvaerobic.setLayoutParams(layoutParams8);
        this.mTAvaerobic.setVisibility(0);
        this.mChartAnaerobic.setVisibility(0);
        this.mAnaerobicScore.setVisibility(0);
        this.mAnaerobicState.setVisibility(0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final TextView getMAerobicScore() {
        return this.mAerobicScore;
    }

    @NotNull
    public final TextView getMAerobicState() {
        return this.mAerobicState;
    }

    @NotNull
    public final TextView getMAnaerobicScore() {
        return this.mAnaerobicScore;
    }

    @NotNull
    public final TextView getMAnaerobicState() {
        return this.mAnaerobicState;
    }

    @NotNull
    public final HMSpeedDialChart getMChartAerobic() {
        return this.mChartAerobic;
    }

    @NotNull
    public final HMSpeedDialChart getMChartAnaerobic() {
        return this.mChartAnaerobic;
    }

    @NotNull
    public final TextView getMLine() {
        return this.mLine;
    }

    @NotNull
    public final TextView getMTAvaerobic() {
        return this.mTAvaerobic;
    }

    @NotNull
    public final TextView getMTvAerobic() {
        return this.mTvAerobic;
    }

    public final void setMAerobicScore(@NotNull TextView textView) {
        this.mAerobicScore = textView;
    }

    public final void setMAerobicState(@NotNull TextView textView) {
        this.mAerobicState = textView;
    }

    public final void setMAnaerobicScore(@NotNull TextView textView) {
        this.mAnaerobicScore = textView;
    }

    public final void setMAnaerobicState(@NotNull TextView textView) {
        this.mAnaerobicState = textView;
    }

    public final void setMChartAerobic(@NotNull HMSpeedDialChart hMSpeedDialChart) {
        this.mChartAerobic = hMSpeedDialChart;
    }

    public final void setMChartAnaerobic(@NotNull HMSpeedDialChart hMSpeedDialChart) {
        this.mChartAnaerobic = hMSpeedDialChart;
    }

    public final void setMLine(@NotNull TextView textView) {
        this.mLine = textView;
    }

    public final void setMTAvaerobic(@NotNull TextView textView) {
        this.mTAvaerobic = textView;
    }

    public final void setMTvAerobic(@NotNull TextView textView) {
        this.mTvAerobic = textView;
    }

    public final void showView(@NotNull Trackrecord trackrecord, int showType) {
        if (showType == k) {
            d(trackrecord);
        } else if (showType == l) {
            c(trackrecord);
        } else {
            d(trackrecord);
            c(trackrecord);
        }
        e(showType);
    }

    public CardTrainingEffect(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardTrainingEffect(@NotNull Context context) {
        this(context, null);
    }
}
