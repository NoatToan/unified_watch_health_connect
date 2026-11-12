package com.huami.sleep.daysleep.tonality;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.sleep.R;
import com.huami.sleep.databinding.ItemSleepTonalityBinding;
import com.huami.sleep.daysleep.tonality.bean.SleepTonalityBean;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.view.UnitTextView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "改用fragment实现,见[SleepTonalityFragment]")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\n\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0014J\b\u0010\u0017\u001a\u00020\u0002H\u0014J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/SleepTonalityView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "a", "Lcom/huami/chart/data/ChartDataList;", "relaxChartDataList", "", "minRelaxScore", "maxRelaxScore", "intoSleepSignIndex", "e", "", "tonalityStartTime", "tonalityEndTime", "f", "playCount", GoogleApiAvailabilityLight.a, "listenCount", "c", "targetInt", "b", "visibility", "onWindowVisibilityChanged", "onAttachedToWindow", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "sleepTonalityBean", "fillData", LogUtil.I, "dotForEndSleepIndex", "Lcom/huami/sleep/databinding/ItemSleepTonalityBinding;", "Lcom/huami/sleep/databinding/ItemSleepTonalityBinding;", "itemSleepTonalityBinding", "Lcom/huami/sleep/daysleep/tonality/TonalityChartHelper;", "Lkotlin/Lazy;", "getTonalityChartHelper", "()Lcom/huami/sleep/daysleep/tonality/TonalityChartHelper;", "tonalityChartHelper", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTonalityView extends ConstraintLayout {
    public static final int DEFAULT_TONALITY_MAX_VALUE = 100;
    public static final int HANDLE_INTERVAL_SIZE = 5;
    public static final int MORE_DATA_LIMIT = 240;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final float h = 8.0f;
    private static final float i = 12.0f;
    private static final float j = 5.0f;
    private static final int k = -1;
    private static final int l = 127;
    private static final int m = 50;
    private static final int n = 10;

    @NotNull
    private static final String o = "https://api.huami.com/t/c166c";

    @NotNull
    private static final String p = "https://api.huami.com/t/05cca";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int dotForEndSleepIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ItemSleepTonalityBinding itemSleepTonalityBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy tonalityChartHelper;

    @NotNull
    private static final Integer[] d = {Integer.valueOf(R.color.s30), Integer.valueOf(R.color.p4), Integer.valueOf(R.color.s25), Integer.valueOf(R.color.s20), Integer.valueOf(R.color.s15)};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            KoinExtKt.getWebService().launch(new WebItem(SleepTonalityView.p));
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_TONALITY_QUESTION);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onAttachedToWindow";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onWindowVisibilityChanged visibility = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/TonalityChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<TonalityChartHelper> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TonalityChartHelper invoke() {
            return new TonalityChartHelper(this.a);
        }
    }

    @JvmOverloads
    public SleepTonalityView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepTonalityView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepTonalityView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? -1 : i2);
    }

    private final void a() {
        ViewExKt.smartClick$default(this.itemSleepTonalityBinding.tonalityQuestion, 0L, a.a, 1, null);
    }

    private final int b(int targetInt) {
        boolean z = false;
        if (targetInt >= 0 && targetInt < 50) {
            z = true;
        }
        if (z) {
            return (targetInt / 10) * 10;
        }
        return 50;
    }

    private final void c(int listenCount) {
        if (listenCount != -1) {
            UnitTextView unitTextView = this.itemSleepTonalityBinding.tonalityListenCount;
            String[] durationStr$default = TimeShowUtilsKt.getDurationStr$default(listenCount, getContext(), false, false, 6, null);
            unitTextView.setValues((String[]) Arrays.copyOf(durationStr$default, durationStr$default.length));
        }
    }

    private final void d(int playCount) {
        if (playCount != -1) {
            UnitTextView unitTextView = this.itemSleepTonalityBinding.tonalityPlayCount;
            String[] durationStr$default = TimeShowUtilsKt.getDurationStr$default(playCount, getContext(), false, false, 6, null);
            unitTextView.setValues((String[]) Arrays.copyOf(durationStr$default, durationStr$default.length));
        }
    }

    private final void e(ChartDataList relaxChartDataList, int minRelaxScore, int maxRelaxScore, int intoSleepSignIndex) {
        if (relaxChartDataList == null) {
            return;
        }
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        int i2 = (minRelaxScore + maxRelaxScore) / 2;
        sparseArray.put(0, new YAxisData(minRelaxScore, String.valueOf(minRelaxScore)));
        sparseArray.put(1, new YAxisData(i2, String.valueOf(i2)));
        sparseArray.put(2, new YAxisData(maxRelaxScore, String.valueOf(maxRelaxScore)));
        getTonalityChartHelper().drawSleepTonalityChart(this.itemSleepTonalityBinding.tonalityRelaxChart, relaxChartDataList, sparseArray, intoSleepSignIndex);
    }

    private final void f(long tonalityStartTime, long tonalityEndTime) {
        if (tonalityStartTime != -1) {
            this.itemSleepTonalityBinding.tonalityRelaxStartTime.setText(TimeUtils.formatTime(getContext(), tonalityStartTime));
        }
        if (tonalityEndTime != -1) {
            this.itemSleepTonalityBinding.tonalityRelaxEndTime.setText(TimeUtils.formatTime(getContext(), tonalityEndTime));
        }
    }

    private final TonalityChartHelper getTonalityChartHelper() {
        return (TonalityChartHelper) this.tonalityChartHelper.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void fillData(@NotNull SleepTonalityBean sleepTonalityBean) {
        this.dotForEndSleepIndex = sleepTonalityBean.getAwakeTimeIndex();
        SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SKY_SLEEP_TONALITY);
        if (sleepTonalityBean.getBeToday()) {
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_TONALITY_FEELING_EXPOSE, q.mapOf(TuplesKt.to("wakeup_time", String.valueOf(this.dotForEndSleepIndex))));
        }
        e(sleepTonalityBean.getRelaxChartDataList(), b(sleepTonalityBean.getRelaxMinScore()), 100, sleepTonalityBean.getMusicListenTimeCount() == 0 ? -1 : sleepTonalityBean.getIntoSleepSignIndex());
        f(sleepTonalityBean.getRelaxStartTimeMS(), sleepTonalityBean.getRelaxEndTimeMS());
        ViewExKt.setVisible(this.itemSleepTonalityBinding.tonalityDivide, sleepTonalityBean.getBeToday());
        ViewExKt.setVisible(this.itemSleepTonalityBinding.tonalityVocationGroup, sleepTonalityBean.getBeToday());
        ViewExKt.setVisible(this.itemSleepTonalityBinding.tonalityRatingGroup, sleepTonalityBean.getBeToday());
        LinearLayout linearLayout = this.itemSleepTonalityBinding.tonalityListenLinear;
        long relaxStartTimeMS = sleepTonalityBean.getRelaxStartTimeMS() + 1;
        long relaxEndTimeMS = sleepTonalityBean.getRelaxEndTimeMS();
        long intoSleepTime = sleepTonalityBean.getIntoSleepTime();
        ViewExKt.setVisible(linearLayout, relaxStartTimeMS <= intoSleepTime && intoSleepTime <= relaxEndTimeMS);
        View view = this.itemSleepTonalityBinding.tonalityInfoLinearDivide;
        long relaxStartTimeMS2 = sleepTonalityBean.getRelaxStartTimeMS() + 1;
        long relaxEndTimeMS2 = sleepTonalityBean.getRelaxEndTimeMS();
        long intoSleepTime2 = sleepTonalityBean.getIntoSleepTime();
        ViewExKt.setVisible(view, relaxStartTimeMS2 <= intoSleepTime2 && intoSleepTime2 <= relaxEndTimeMS2);
        d(sleepTonalityBean.getMusicPlayTimeCount());
        c(sleepTonalityBean.getMusicListenTimeCount());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HMLog.info("SleepTonalityView", b.a);
        a();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        HMLog.info("SleepTonalityView", new c(visibility));
    }

    @JvmOverloads
    public SleepTonalityView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.dotForEndSleepIndex = -1;
        this.itemSleepTonalityBinding = ItemSleepTonalityBinding.inflate(LayoutInflater.from(context), this, true);
        this.tonalityChartHelper = LazyKt__LazyJVMKt.lazy(new d(context));
    }
}
