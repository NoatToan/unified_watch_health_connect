package com.xiaomi.hm.health.running;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.ui.view.BloodOxygenStatisticsView;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.BarStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Index;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.lib.view.quickadapter.MultiTypeDelegate;
import com.huami.message.ui.base.ext.BasicTypeExKt;
import com.huami.message.ui.base.ext.ViewExKt;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.ui.utils.SportRecordAssembleUtil;
import com.huami.passport.Configs;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.watch.companion.ui.activity.SportItemSortActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.running.EnergyItemAdapter;
import com.xiaomi.hm.health.running.calori.CaloriActivity;
import com.xiaomi.hm.health.running.calori.SportFilterType;
import com.xiaomi.hm.health.ui.sportfitness.model.HistoryRecordSection;
import com.xiaomi.hm.health.ui.sportfitness.view.ExerciseXAxisView;
import defpackage.nc4;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002LMB\u0017\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010C\u001a\u00020\u0013¢\u0006\u0004\bJ\u0010KJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\fH\u0002J$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J(\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J*\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\"\u0010!\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0013H\u0002J\u0016\u0010#\u001a\u00020\b*\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0002J,\u0010&\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0$H\u0002J\u0018\u0010)\u001a\n (*\u0004\u0018\u00010'0'2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0002J\u001c\u00100\u001a\u00020/2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0$H\u0002J4\u00108\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u0002032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010:\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u000eH\u0002J\u0018\u0010<\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0002H\u0014J\u0010\u0010>\u001a\u00020=2\b\b\u0002\u0010\u0019\u001a\u00020\u000eR\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010@R\u0016\u0010C\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010BR\u001d\u0010E\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010H¨\u0006N"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyItemAdapter;", "Lcom/huami/lib/view/quickadapter/BaseQuickAdapter;", "", "Lcom/huami/lib/view/quickadapter/BaseViewHolder;", "Lcom/huami/lib/view/quickadapter/MultiTypeDelegate;", "t", "holder", "record", "", GoogleApiAvailabilityLight.b, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sport/service/model/HistoryRecord;", "Lkotlin/Pair;", "", "", "v", "C", SportItemSortActivity.KEY_SPORT_NAME, "", "needInfo", "x", "B", "nameRes", "w", "section", "o", "m", "Landroid/view/View;", "xAxisView", "", "mMax", "visible", "E", "str", LogUtil.D, "", "chartData", "y", "Lcom/huami/chart/provider/RenderConfig;", "kotlin.jvm.PlatformType", "u", "Landroid/view/ViewGroup;", "chartArea", "Lcom/huami/chart/provider/DrawConfig;", SOAP.XMLNS, "data", "Lcom/huami/chart/data/ChartDataList;", "r", "Lcom/huami/chart/chart/HMChart;", "chart", "Landroid/widget/TextView;", "title", "mainData", "desc", "slideContainer", com.google.android.exoplayer2.text.ttml.b.r, "position", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "item", "convert", "", "calculatedWidth", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", CaloriActivity.ARG_FILTER_TYPE, "Z", CaloriActivity.ARG_LAST_PAGE, "Lkotlin/Lazy;", TdmillHmFragment.ARG_IS_METRIC, "()Z", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "timeCache", "<init>", "(Lcom/xiaomi/hm/health/running/calori/SportFilterType;Z)V", "Companion", "ViewSlideWrapper", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EnergyItemAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {
    private static final int E = 10;
    private static final int F = 11;
    private static final int G = 12;
    private static final int H = 7;
    private static final int I = 24;
    private static final float J = 48.0f;
    private static final float K = 10.0f;
    private static final float L = 0.0f;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final SportFilterType filterType;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final boolean lastPage;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy isMetric;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<Long> timeCache;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportFilterType.values().length];
            iArr[SportFilterType.DAY.ordinal()] = 1;
            iArr[SportFilterType.WEEK.ordinal()] = 2;
            iArr[SportFilterType.MONTH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return UnitManager.getInstance().isMetric();
        }
    }

    public EnergyItemAdapter(@NotNull SportFilterType sportFilterType, boolean z) {
        super((List) null);
        this.filterType = sportFilterType;
        this.lastPage = z;
        this.isMetric = LazyKt__LazyJVMKt.lazy(a.a);
        setMultiTypeDelegate(t());
        this.timeCache = new SparseArray<>();
    }

    private final boolean A(int position) {
        return position == getData().size() - 1;
    }

    private final Pair<Integer, String> B(HistoryRecord record, Context context) {
        String strW;
        int i = SportDeviceUtils.isWorkoutSportSource(record.getSource().intValue()) ? R.string.sports_type_work_out : R.string.sports_type_free_training;
        SportRecordAssembleUtil sportRecordAssembleUtil = SportRecordAssembleUtil.INSTANCE;
        int i2 = sportRecordAssembleUtil.getSportIconColorAndName(record.getType().intValue(), record.getSource().intValue(), record.getSportMode())[0];
        Integer type = record.getType();
        if (type != null && type.intValue() == 8) {
            strW = SportDeviceUtils.isCategoryForHaydn(record.getSource().intValue()) ? w(context, R.string.sport_index_run, record, true) : w(context, R.string.runnings_sport_type_treadmill, record, true);
        } else if (type != null && type.intValue() == 16) {
            strW = w(context, i, record, false);
        } else {
            if (((((((((((((((((((((((((((((((((((((((((((((((((((((((type != null && type.intValue() == 1) || (type != null && type.intValue() == 192)) || (type != null && type.intValue() == 25)) || (type != null && type.intValue() == 14)) || (type != null && type.intValue() == 15)) || (type != null && type.intValue() == 2001)) || (type != null && type.intValue() == 13)) || (type != null && type.intValue() == 18)) || (type != null && type.intValue() == 26)) || (type != null && type.intValue() == 6)) || (type != null && type.intValue() == 7)) || (type != null && type.intValue() == 9)) || (type != null && type.intValue() == 2002)) || (type != null && type.intValue() == 11)) || (type != null && type.intValue() == 22)) || (type != null && type.intValue() == 23)) || (type != null && type.intValue() == 24)) || (type != null && type.intValue() == 40)) || (type != null && type.intValue() == 42)) || (type != null && type.intValue() == 43)) || (type != null && type.intValue() == 44)) || (type != null && type.intValue() == 105)) || (type != null && type.intValue() == 46)) || (type != null && type.intValue() == 47)) || (type != null && type.intValue() == 48)) || (type != null && type.intValue() == 62)) || (type != null && type.intValue() == 63)) || (type != null && type.intValue() == 65)) || (type != null && type.intValue() == 66)) || (type != null && type.intValue() == 67)) || (type != null && type.intValue() == 68)) || (type != null && type.intValue() == 69)) || (type != null && type.intValue() == 82)) || (type != null && type.intValue() == 90)) || (type != null && type.intValue() == 94)) || (type != null && type.intValue() == 110)) || (type != null && type.intValue() == 121)) || (type != null && type.intValue() == 106)) || (type != null && type.intValue() == 123)) || (type != null && type.intValue() == 124)) || (type != null && type.intValue() == 125)) || (type != null && type.intValue() == 126)) || (type != null && type.intValue() == 127)) || (type != null && type.intValue() == 128)) || (type != null && type.intValue() == 131)) || (type != null && type.intValue() == 132)) || (type != null && type.intValue() == 190)) || (type != null && type.intValue() == 136)) || (type != null && type.intValue() == 137)) || (type != null && type.intValue() == 138)) || (type != null && type.intValue() == 139)) || (type != null && type.intValue() == 140)) || (type != null && type.intValue() == 141)) || (type != null && type.intValue() == 142)) || (type != null && type.intValue() == 178)) {
                strW = w(context, sportRecordAssembleUtil.getSportIconColorAndName(record.getType().intValue(), record.getSource().intValue(), record.getSportMode())[2], record, true);
            } else {
                strW = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((type != null && type.intValue() == 10) || (type != null && type.intValue() == 12)) || (type != null && type.intValue() == 17)) || (type != null && type.intValue() == 21)) || (type != null && type.intValue() == 41)) || (type != null && type.intValue() == 45)) || (type != null && type.intValue() == 49)) || (type != null && type.intValue() == 50)) || (type != null && type.intValue() == 51)) || (type != null && type.intValue() == 52)) || (type != null && type.intValue() == 53)) || (type != null && type.intValue() == 54)) || (type != null && type.intValue() == 55)) || (type != null && type.intValue() == 57)) || (type != null && type.intValue() == 58)) || (type != null && type.intValue() == 59)) || (type != null && type.intValue() == 60)) || (type != null && type.intValue() == 61)) || (type != null && type.intValue() == 64)) || (type != null && type.intValue() == 70)) || (type != null && type.intValue() == 71)) || (type != null && type.intValue() == 72)) || (type != null && type.intValue() == 73)) || (type != null && type.intValue() == 74)) || (type != null && type.intValue() == 75)) || (type != null && type.intValue() == 76)) || (type != null && type.intValue() == 77)) || (type != null && type.intValue() == 78)) || (type != null && type.intValue() == 79)) || (type != null && type.intValue() == 80)) || (type != null && type.intValue() == 81)) || (type != null && type.intValue() == 83)) || (type != null && type.intValue() == 84)) || (type != null && type.intValue() == 85)) || (type != null && type.intValue() == 86)) || (type != null && type.intValue() == 87)) || (type != null && type.intValue() == 88)) || (type != null && type.intValue() == 89)) || (type != null && type.intValue() == 91)) || (type != null && type.intValue() == 92)) || (type != null && type.intValue() == 93)) || (type != null && type.intValue() == 95)) || (type != null && type.intValue() == 96)) || (type != null && type.intValue() == 97)) || (type != null && type.intValue() == 98)) || (type != null && type.intValue() == 99)) || (type != null && type.intValue() == 100)) || (type != null && type.intValue() == 101)) || (type != null && type.intValue() == 102)) || (type != null && type.intValue() == 103)) || (type != null && type.intValue() == 104)) || (type != null && type.intValue() == 108)) || (type != null && type.intValue() == 109)) || (type != null && type.intValue() == 111)) || (type != null && type.intValue() == 112)) || (type != null && type.intValue() == 113)) || (type != null && type.intValue() == 114)) || (type != null && type.intValue() == 115)) || (type != null && type.intValue() == 116)) || (type != null && type.intValue() == 117)) || (type != null && type.intValue() == 118)) || (type != null && type.intValue() == 119)) || (type != null && type.intValue() == 120)) || (type != null && type.intValue() == 122)) || (type != null && type.intValue() == 129)) || (type != null && type.intValue() == 130)) || (type != null && type.intValue() == 133)) || (type != null && type.intValue() == 189)) || (type != null && type.intValue() == 143)) || (type != null && type.intValue() == 144)) || (type != null && type.intValue() == 145)) || (type != null && type.intValue() == 146)) || (type != null && type.intValue() == 147)) || (type != null && type.intValue() == 148)) || (type != null && type.intValue() == 149)) || (type != null && type.intValue() == 150)) || (type != null && type.intValue() == 151)) || (type != null && type.intValue() == 152)) || (type != null && type.intValue() == 153)) || (type != null && type.intValue() == 154)) || (type != null && type.intValue() == 155)) || (type != null && type.intValue() == 156)) || (type != null && type.intValue() == 157)) || (type != null && type.intValue() == 158)) || (type != null && type.intValue() == 159)) || (type != null && type.intValue() == 160)) || (type != null && type.intValue() == 161)) || (type != null && type.intValue() == 162)) || (type != null && type.intValue() == 163)) || (type != null && type.intValue() == 164)) || (type != null && type.intValue() == 165)) || (type != null && type.intValue() == 166)) || (type != null && type.intValue() == 167)) || (type != null && type.intValue() == 168)) || (type != null && type.intValue() == 169)) || (type != null && type.intValue() == 170)) || (type != null && type.intValue() == 171)) || (type != null && type.intValue() == 172)) || (type != null && type.intValue() == 173)) || (type != null && type.intValue() == 174)) || (type != null && type.intValue() == 175)) || (type != null && type.intValue() == 176)) || (type != null && type.intValue() == 177)) || (type != null && type.intValue() == 179)) || (type != null && type.intValue() == 180)) || (type != null && type.intValue() == 181)) || (type != null && type.intValue() == 182)) || (type != null && type.intValue() == 183)) || (type != null && type.intValue() == 184)) || (type != null && type.intValue() == 185)) || (type != null && type.intValue() == 186)) || (type != null && type.intValue() == 187)) || (type != null && type.intValue() == 188) ? w(context, sportRecordAssembleUtil.getSportIconColorAndName(record.getType().intValue(), record.getSource().intValue(), record.getSportMode())[2], record, false) : w(context, R.string.running_sports_type_running, record, true);
            }
        }
        return TuplesKt.to(Integer.valueOf(i2), strW);
    }

    private final Pair<Integer, String> C(HistoryRecord record, Context context) {
        int i;
        String[] stringArray = this.mContext.getResources().getStringArray(R.array.timeline_type);
        int mode = record.getMode();
        if (mode == 2 || mode == 3) {
            i = R.drawable.ic_rw_30;
        } else if (mode != 4) {
            i = mode != 7 ? R.drawable.ic_walk_30 : R.drawable.ic_free_training_30;
        } else {
            i = R.drawable.ic_run_30;
        }
        return TuplesKt.to(Integer.valueOf(i), x(context, stringArray[mode], record, true));
    }

    private final void D(View view, String str) {
        if (str == null || str.length() == 0) {
            view.setVisibility(4);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(str);
        }
        view.setVisibility(0);
    }

    private final void E(View xAxisView, long mMax, boolean visible) {
        if (xAxisView == null) {
            return;
        }
        ViewExKt.setVisible(xAxisView.findViewById(R.id.sport_energy_x_axis), visible);
        ViewExKt.setVisible(xAxisView.findViewById(R.id.sport_energy_no_data), !visible);
        if (!visible) {
            D(xAxisView.findViewById(R.id.first_value), "");
            D(xAxisView.findViewById(R.id.sec_value), "");
            D(xAxisView.findViewById(R.id.tri_value), "");
            D(xAxisView.findViewById(R.id.mid_value), "");
            D(xAxisView.findViewById(R.id.bottom_value), "");
            D(xAxisView.findViewById(R.id.first_line), "");
            D(xAxisView.findViewById(R.id.sec_line), "");
            D(xAxisView.findViewById(R.id.tri_line), "");
            D(xAxisView.findViewById(R.id.bottom_line), "");
            D(xAxisView.findViewById(R.id.mid_line), "");
            return;
        }
        D(xAxisView.findViewById(R.id.bottom_value), BasicTypeExKt.i18String(0));
        long j = 3;
        if (mMax % j == 0) {
            long j2 = mMax / j;
            D(xAxisView.findViewById(R.id.first_value), BasicTypeExKt.i18String(j * j2));
            D(xAxisView.findViewById(R.id.sec_value), BasicTypeExKt.i18String(((long) 2) * j2));
            D(xAxisView.findViewById(R.id.tri_value), BasicTypeExKt.i18String(j2));
            D(xAxisView.findViewById(R.id.first_line), "1");
            D(xAxisView.findViewById(R.id.sec_line), "1");
            D(xAxisView.findViewById(R.id.tri_line), "1");
            D(xAxisView.findViewById(R.id.mid_value), "");
            D(xAxisView.findViewById(R.id.mid_line), "");
            return;
        }
        long j3 = 2;
        long j4 = mMax % j3 == 0 ? mMax / j3 : (mMax + 1) / j3;
        D(xAxisView.findViewById(R.id.sec_value), "");
        D(xAxisView.findViewById(R.id.tri_value), "");
        D(xAxisView.findViewById(R.id.sec_line), "");
        D(xAxisView.findViewById(R.id.tri_line), "");
        D(xAxisView.findViewById(R.id.first_value), BasicTypeExKt.i18String(j3 * j4));
        D(xAxisView.findViewById(R.id.mid_value), BasicTypeExKt.i18String(j4));
        D(xAxisView.findViewById(R.id.first_line), "1");
        D(xAxisView.findViewById(R.id.mid_line), "1");
    }

    public static /* synthetic */ float calculatedWidth$default(EnergyItemAdapter energyItemAdapter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 23;
        }
        return energyItemAdapter.calculatedWidth(i);
    }

    private final boolean isMetric() {
        return ((Boolean) this.isMetric.getValue()).booleanValue();
    }

    private final void m(BaseViewHolder holder, Object section) {
        boolean z;
        Triple triple;
        boolean z2;
        Context context = holder.itemView.getContext();
        HistoryRecordHeader historyRecordHeader = (HistoryRecordHeader) section;
        List<Object> data = getData();
        int i = 0;
        if (!(data instanceof Collection) || !data.isEmpty()) {
            Iterator<T> it2 = data.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                Object next = it2.next();
                if ((next instanceof HistoryRecord) || ((next instanceof HistoryRecordHeader) && ((HistoryRecordHeader) next).getCal() > 0)) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        y(context, holder, historyRecordHeader.getData());
        ExerciseXAxisView exerciseXAxisView = (ExerciseXAxisView) holder.getView(R.id.sport_energy_x_axis);
        E(holder.itemView, HistoryRecordHeaderKt.max(historyRecordHeader), z);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.filterType.ordinal()];
        if (i2 == 2) {
            exerciseXAxisView.setWeekBorder(historyRecordHeader.getStartTime(), historyRecordHeader.getEndTime());
            HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
            triple = new Triple(Integer.valueOf(R.string.sport_energy_avg_title), Long.valueOf(historyRecordHeader.getCal()), context.getString(R.string.sport_energy_time_range, healthDataTimeUtils.formatTimeYMD(historyRecordHeader.getStartTime()), healthDataTimeUtils.formatTimeYMD(historyRecordHeader.getEndTime())));
        } else if (i2 != 3) {
            exerciseXAxisView.setDayBorder();
            String timeYMD = HealthDataTimeUtils.INSTANCE.formatTimeYMD(historyRecordHeader.getStartTime());
            triple = z ? new Triple(Integer.valueOf(R.string.calorie_activity_cal), Long.valueOf(historyRecordHeader.getCal()), timeYMD) : new Triple(Integer.valueOf(R.string.calorie_activity_cal), 0L, timeYMD);
        } else {
            exerciseXAxisView.setMonthBorder(historyRecordHeader.getStartTime(), 10.0f);
            triple = new Triple(Integer.valueOf(R.string.sport_energy_avg_title), Long.valueOf(historyRecordHeader.getCal()), HealthDataTimeUtils.INSTANCE.formatTimeYM(historyRecordHeader.getStartTime()));
        }
        holder.setText(R.id.sport_energy_title, ((Number) triple.getFirst()).intValue());
        if (((Number) triple.getSecond()).longValue() > 0) {
            holder.setText(R.id.sport_energy_main_data, BasicTypeExKt.i18String(((Number) triple.getSecond()).longValue()));
        }
        holder.setText(R.id.sport_energy_desc, (CharSequence) triple.getThird());
        List<Object> data2 = getData();
        if (!(data2 instanceof Collection) || !data2.isEmpty()) {
            Iterator<T> it3 = data2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z2 = false;
                    break;
                } else if (it3.next() instanceof HistoryRecord) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        holder.getView(R.id.main_activity_title).setVisibility(z2 ? 0 : 8);
        holder.setVisible(R.id.sport_energy_title, z);
        holder.setVisible(R.id.sport_energy_data_unit, z);
        LinearLayout footerLayout = getFooterLayout();
        View viewFindViewById = footerLayout == null ? null : footerLayout.findViewById(R.id.card_status_dividing_line);
        if (viewFindViewById != null) {
            boolean z3 = !GlobalConfig.get().isBuildMidong() && getData().size() == 1;
            if (z3) {
                i = 8;
            } else if (z3) {
                throw new NoWhenBranchMatchedException();
            }
            viewFindViewById.setVisibility(i);
        }
        if (!GlobalConfig.get().isBuildMidong() || getData().size() <= 1) {
            return;
        }
        holder.setVisible(R.id.divider, true);
    }

    private final void n(BaseViewHolder holder, Object record) {
        Context context = holder.itemView.getContext();
        HistoryRecord historyRecord = (HistoryRecord) record;
        Pair<Integer, String> pairV = v(context, historyRecord);
        Drawable drawable = ContextCompat.getDrawable(context, pairV.getFirst().intValue());
        ImageView imageView = (ImageView) holder.getView(R.id.energy_record_icon);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        holder.setImageDrawable(R.id.energy_record_icon, drawable);
        if (historyRecord.isTraining() || historyRecord.isStep()) {
            TintUtils.tintDrawable(imageView, ContextCompat.getColor(this.mContext, R.color.s20));
        } else {
            TintUtils.tintDrawable(imageView, ContextCompat.getColor(this.mContext, SportRecordAssembleUtil.INSTANCE.getSportIconColorAndName(historyRecord.getType().intValue(), historyRecord.getSource().intValue(), historyRecord.getSportMode())[1]));
        }
        imageView.setBackground(TintUtils.tintDrawable(ContextCompat.getDrawable(this.mContext, R.drawable.shape_sport_bg), ContextCompat.getColor(context, R.color.s4)));
        holder.setText(R.id.energy_record_title, pairV.getSecond());
        holder.setText(R.id.energy_record_desc, DataFormatter.getConsumeTime(historyRecord.getConsumeTime()));
        int consumeCal = (int) historyRecord.getConsumeCal();
        int i = 0;
        holder.setText(R.id.energy_record_cal, context.getResources().getQuantityString(R.plurals.with_kcal, consumeCal, Integer.valueOf(consumeCal)));
        holder.setText(R.id.energy_record_start, TimeUtils.formatTime(context, historyRecord.getBeginTimeInMilli()));
        View view = holder.getView(R.id.energy_divider);
        boolean zA = A(holder.getAdapterPosition());
        if (zA) {
            i = 8;
        } else if (zA) {
            throw new NoWhenBranchMatchedException();
        }
        view.setVisibility(i);
    }

    private final void o(BaseViewHolder holder, Object section) {
        String string;
        Context context = holder.itemView.getContext();
        long j = ((HistoryRecordSection) section).recordStartTime;
        int i = WhenMappings.$EnumSwitchMapping$0[this.filterType.ordinal()];
        if (i == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            String time = TimeUtils.formatTime(context, calendar.getTime());
            calendar.add(11, 1);
            string = context.getString(R.string.sport_energy_time_range, time, TimeUtils.formatTime(context, calendar.getTime()));
        } else if (i != 2) {
            string = TimeUtils.formatDate_no_y(context, j, false);
        } else {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j);
            Integer numValueOf = Integer.valueOf(calendar2.get(7) - 2);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            string = context.getString(R.string.sport_energy_record_title, context.getResources().getStringArray(R.array.weeks)[numValueOf == null ? 6 : numValueOf.intValue()], TimeUtils.formatDate_no_y(context, j, false));
        }
        holder.setText(R.id.energy_section_title, string);
    }

    private final void p(final HMChart chart, final TextView title, final TextView mainData, final TextView desc, View slideContainer) {
        final ViewSlideWrapper viewSlideWrapper = slideContainer != null ? new ViewSlideWrapper(slideContainer, 0.0f, 0.0f, 6, null) : null;
        final Triple triple = new Triple(title.getText(), mainData.getText(), desc.getText());
        chart.registerTouchListener(new ITouchListener() { // from class: com.xiaomi.hm.health.running.EnergyItemAdapter$chartTouchTask$1
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index i) {
                if (i.getDataIndex() == -1) {
                    return;
                }
                EnergyItemAdapter.ViewSlideWrapper viewSlideWrapper2 = viewSlideWrapper;
                if (viewSlideWrapper2 != null) {
                    viewSlideWrapper2.slide(i.getCenterX());
                }
                ChartData dataByPositionIndex = chart.getChartDataManager().getDataByPositionIndex(i.getPosiIndex().getIndex());
                if (dataByPositionIndex != null) {
                    Long l = (Long) this.timeCache.get(dataByPositionIndex.getIndex());
                    if (this.filterType == SportFilterType.DAY) {
                        String time = TimeUtils.formatTime(this.mContext, l.longValue(), true);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(l.longValue());
                        calendar.add(11, 1);
                        String time2 = TimeUtils.formatTime(this.mContext, calendar.getTime(), true);
                        desc.setText(HealthDataTimeUtils.INSTANCE.formatTimeYMD(l.longValue()) + " " + this.mContext.getString(R.string.sport_energy_time_range, time, time2));
                        title.setText(this.mContext.getString(R.string.common_total));
                    } else if (this.filterType == SportFilterType.WEEK) {
                        title.setText(this.mContext.getString(R.string.common_total));
                        desc.setText(HealthDataTimeUtils.INSTANCE.formatTimeYMD(l.longValue()));
                    } else {
                        title.setText(this.mContext.getString(R.string.common_total));
                        desc.setText(HealthDataTimeUtils.INSTANCE.formatTimeYMD(l.longValue()));
                    }
                    if (((long) dataByPositionIndex.getSumValue()) == 0) {
                        mainData.setText(BloodOxygenStatisticsView.INVALID);
                    } else {
                        mainData.setText(String.valueOf((long) dataByPositionIndex.getSumValue()));
                    }
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index i) {
                TextView textView = title;
                CharSequence first = triple.getFirst();
                if (first == null) {
                    first = null;
                }
                textView.setText(first);
                TextView textView2 = mainData;
                CharSequence second = triple.getSecond();
                if (second == null) {
                    second = null;
                }
                textView2.setText(second);
                TextView textView3 = desc;
                CharSequence third = triple.getThird();
                textView3.setText(third != null ? third : null);
                EnergyItemAdapter.ViewSlideWrapper viewSlideWrapper2 = viewSlideWrapper;
                if (viewSlideWrapper2 == null) {
                    return;
                }
                viewSlideWrapper2.reset();
            }
        });
    }

    public static /* synthetic */ void q(EnergyItemAdapter energyItemAdapter, HMChart hMChart, TextView textView, TextView textView2, TextView textView3, View view, int i, Object obj) {
        if ((i & 16) != 0) {
            view = null;
        }
        energyItemAdapter.p(hMChart, textView, textView2, textView3, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartDataList r(Map<Long, Long> data) {
        int actualMaximum;
        SparseArray sparseArray = new SparseArray();
        Calendar calendar = Calendar.getInstance();
        Iterator<Map.Entry<Long, Long>> it2 = data.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<Long, Long> next = it2.next();
            calendar.setTimeInMillis(next.getKey().longValue());
            int i = WhenMappings.$EnumSwitchMapping$0[this.filterType.ordinal()];
            int iIntValue = 7;
            if (i != 2) {
                iIntValue = i != 3 ? calendar.get(11) : calendar.get(5);
            } else {
                Integer numValueOf = Integer.valueOf(calendar.get(7));
                if (numValueOf.intValue() == 1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = Integer.valueOf(numValueOf.intValue() - 1).intValue();
                }
            }
            int i2 = iIntValue - 1;
            this.timeCache.put(i2, next.getKey());
            ChartData chartData = new ChartData(i2, next.getValue().longValue());
            sparseArray.put(chartData.getIndex(), chartData);
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setMinValue(0.0f);
        chartDataList.setStart(0);
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.filterType.ordinal()];
        if (i3 != 2) {
            actualMaximum = i3 != 3 ? 23 : calendar.getActualMaximum(5) - 1;
        } else {
            actualMaximum = 6;
        }
        chartDataList.setEnd(actualMaximum);
        return chartDataList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig s(ViewGroup chartArea) {
        float fCalculatedWidth;
        int i = WhenMappings.$EnumSwitchMapping$0[this.filterType.ordinal()];
        if (i != 2) {
            fCalculatedWidth = i != 3 ? calculatedWidth$default(this, 0, 1, null) : calculatedWidth(30);
        } else {
            fCalculatedWidth = calculatedWidth(6);
        }
        float f = fCalculatedWidth / 2;
        float f2 = 0.0f + f;
        return new DrawConfig.Builder(this.mContext).setCanvasHeight(chartArea.getMeasuredHeight()).setCanvasWidth(chartArea.getMeasuredWidth()).setDataMarginTop(ChartUtil.dp2px(this.mContext, 2.0f)).setDataMarginLeft(ChartUtil.dp2px(this.mContext, f2)).setDataMarginRight(ChartUtil.dp2px(this.mContext, f2)).setDataWidth(ChartUtil.dp2px(this.mContext, f * 2)).create();
    }

    private final MultiTypeDelegate<Object> t() {
        MultiTypeDelegate<Object> multiTypeDelegate = new MultiTypeDelegate<Object>() { // from class: com.xiaomi.hm.health.running.EnergyItemAdapter$createMultiTypeDelegate$1
            @Override // com.huami.lib.view.quickadapter.MultiTypeDelegate
            public int getItemType(@NotNull Object item) {
                if (item instanceof HistoryRecordSection) {
                    return 11;
                }
                return item instanceof HistoryRecordHeader ? 12 : 10;
            }
        };
        multiTypeDelegate.registerItemType(10, R.layout.item_energy_record_view);
        multiTypeDelegate.registerItemType(11, R.layout.item_energy_section_view);
        multiTypeDelegate.registerItemType(12, R.layout.header_sport_energy_view);
        return multiTypeDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig u(Context context) {
        return new RenderConfig.Builder().setBarStyle(new BarStyle.Builder(this.mContext).setBarStyle(2).setInteractiveSlide(true).setInteractiveUpCancel(true).setHighlightContrast(128).setFingerUpHighlightCancel(true).setBarColors(new HMColor[]{new HMColor(ContextCompat.getColor(context, R.color.s51), ContextCompat.getColor(context, R.color.s51))}).setInteractiveType(2).setInteractiveLineWidth(ChartUtil.sp2px(context, 2.0f)).setInteractiveLineColor(ContextCompat.getColor(context, R.color.s3)).create()).create();
    }

    private final Pair<Integer, String> v(Context context, HistoryRecord record) {
        if (!record.isTraining()) {
            return record.isStep() ? C(record, context) : B(record, context);
        }
        Integer numValueOf = Integer.valueOf(R.drawable.ic_sporttype_train);
        String trainingName = record.getTrainingName();
        String trainingName2 = null;
        if (record.isCourseTraining()) {
            trainingName = null;
        }
        if (trainingName != null) {
            int trainingNo = record.getTrainingNo();
            trainingName2 = context.getString(R.string.sport_energy_record_title, trainingName, context.getResources().getQuantityString(R.plurals.how_many_times, trainingNo, Integer.valueOf(trainingNo)));
        }
        if (trainingName2 == null) {
            trainingName2 = record.getTrainingName();
        }
        return TuplesKt.to(numValueOf, trainingName2);
    }

    private final String w(Context context, @StringRes int nameRes, HistoryRecord record, boolean needInfo) {
        String string = context.getString(nameRes);
        String str = needInfo ? string : null;
        if (str == null) {
            return string;
        }
        String[] formatDisAndUnit = DataFormatter.getFormatDisAndUnit(record.getDistance().intValue(), record.getType().intValue(), isMetric(), new boolean[0]);
        String string2 = context.getString(R.string.sport_energy_record_title, str, context.getString(R.string.sport_energy_record_info, formatDisAndUnit[0], context.getString(Integer.parseInt(formatDisAndUnit[1]))));
        return string2 == null ? string : string2;
    }

    private final String x(Context context, String sportName, HistoryRecord record, boolean needInfo) {
        Object obj = needInfo ? sportName : null;
        if (obj == null) {
            return sportName;
        }
        String[] formatDisAndUnit = DataFormatter.getFormatDisAndUnit(record.getDistance().intValue(), record.getType().intValue(), isMetric(), new boolean[0]);
        String string = context.getString(R.string.sport_energy_record_title, obj, context.getString(R.string.sport_energy_record_info, formatDisAndUnit[0], context.getString(Integer.parseInt(formatDisAndUnit[1]))));
        return string == null ? sportName : string;
    }

    private final void y(final Context context, BaseViewHolder holder, final Map<Long, Long> chartData) {
        boolean z;
        List<Object> data = getData();
        if (!(data instanceof Collection) || !data.isEmpty()) {
            Iterator<T> it2 = data.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                Object next = it2.next();
                if ((next instanceof HistoryRecord) || (next instanceof HistoryRecordHeader)) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        final ViewGroup viewGroup = (ViewGroup) holder.getView(R.id.sport_energy_chart_area);
        viewGroup.setVisibility(z ? 0 : 4);
        if (z) {
            final ChartProvider chartProvider = new ChartProvider(context);
            chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.xiaomi.hm.health.running.EnergyItemAdapter$initChartView$1
                @Override // com.huami.chart.chart.IChartProvider
                /* JADX INFO: renamed from: getChartContainer, reason: from getter */
                public ViewGroup getC() {
                    return viewGroup;
                }

                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                public ChartDataList getChartDataList() {
                    return this.a.r(chartData);
                }

                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                public DrawConfig getDrawConfig() {
                    return this.a.s(viewGroup);
                }

                @Override // com.huami.chart.chart.IChartProvider
                public RenderConfig getRenderConfig() {
                    return this.a.u(context);
                }
            }, true, false);
            final View view = holder.getView(R.id.sport_energy_container);
            final TextView textView = (TextView) holder.getView(R.id.sport_energy_title);
            final TextView textView2 = (TextView) holder.getView(R.id.sport_energy_main_data);
            final TextView textView3 = (TextView) holder.getView(R.id.sport_energy_desc);
            viewGroup.post(new Runnable() { // from class: ml1
                @Override // java.lang.Runnable
                public final void run() {
                    EnergyItemAdapter.z(this.a, chartProvider, textView, textView2, textView3, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(EnergyItemAdapter energyItemAdapter, ChartProvider chartProvider, TextView textView, TextView textView2, TextView textView3, View view) {
        energyItemAdapter.p(chartProvider.getChart(), textView, textView2, textView3, view);
    }

    public final float calculatedWidth(int section) {
        Object systemService = this.mContext.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return (displayMetrics.widthPixels / displayMetrics.density) / (section * 2.0f);
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder holder, @NotNull Object item) {
        switch (holder.getItemViewType()) {
            case 10:
                n(holder, item);
                break;
            case 11:
                o(holder, item);
                break;
            case 12:
                m(holder, item);
                break;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyItemAdapter$ViewSlideWrapper;", "", "", "centerX", "", "slide", Configs.Params.RESET, "Landroid/view/View;", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "b", "F", "leftBoundaryX", "c", "rightBoundaryX", "<init>", "(Lcom/xiaomi/hm/health/running/EnergyItemAdapter;Landroid/view/View;FF)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class ViewSlideWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final View view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float leftBoundaryX;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float rightBoundaryX;

        public ViewSlideWrapper(View view, float f, float f2) {
            this.view = view;
            this.leftBoundaryX = f;
            this.rightBoundaryX = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(ViewSlideWrapper viewSlideWrapper) {
            viewSlideWrapper.view.setBackgroundResource(R.color.s38);
            viewSlideWrapper.view.setTranslationX(0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ViewSlideWrapper viewSlideWrapper, float f) {
            viewSlideWrapper.view.setBackgroundResource(R.drawable.bg_calori_grey);
            float left = f - ((viewSlideWrapper.view.getLeft() + viewSlideWrapper.view.getRight()) / 2.0f);
            if (viewSlideWrapper.view.getLeft() + left < viewSlideWrapper.leftBoundaryX) {
                left -= (viewSlideWrapper.view.getLeft() + left) - viewSlideWrapper.leftBoundaryX;
            }
            if (viewSlideWrapper.view.getRight() + left > viewSlideWrapper.rightBoundaryX) {
                left -= (viewSlideWrapper.view.getRight() + left) - viewSlideWrapper.rightBoundaryX;
            }
            viewSlideWrapper.view.setTranslationX(left);
        }

        public final void reset() {
            this.view.post(new Runnable() { // from class: nl1
                @Override // java.lang.Runnable
                public final void run() {
                    EnergyItemAdapter.ViewSlideWrapper.c(this.a);
                }
            });
        }

        public final void slide(final float centerX) {
            this.view.post(new Runnable() { // from class: ol1
                @Override // java.lang.Runnable
                public final void run() {
                    EnergyItemAdapter.ViewSlideWrapper.d(this.a, centerX);
                }
            });
        }

        public /* synthetic */ ViewSlideWrapper(View view, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? view.getResources().getDisplayMetrics().widthPixels : f2);
        }
    }
}
