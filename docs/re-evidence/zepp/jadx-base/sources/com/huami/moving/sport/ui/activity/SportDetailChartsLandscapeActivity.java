package com.huami.moving.sport.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.PointChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.interact.InteractiveManager;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.style.PointStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.activity.SportDetailChartsLandscapeActivity;
import com.huami.moving.sport.ui.view.chart.ChartFlagViewSlideWrapper;
import com.huami.moving.sport.ui.view.chart.dataprovider.AltiType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BaseDataProvider;
import com.huami.moving.sport.ui.view.chart.dataprovider.BaseType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BoatingFreType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BodyStatusType;
import com.huami.moving.sport.ui.view.chart.dataprovider.CadenceType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfAngleType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfBeatType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfUpDownTimeType;
import com.huami.moving.sport.ui.view.chart.dataprovider.HeartType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PaceType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PressureType;
import com.huami.moving.sport.ui.view.chart.dataprovider.RopeSkipingFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.SpeedType;
import com.huami.moving.sport.ui.view.chart.dataprovider.Spo2Type;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StrokeSpeedType;
import com.huami.moving.sport.ui.view.chart.dataprovider.common.ChartDataConverter;
import com.huami.moving.sport.ui.view.chart.overlying.OverlyingHelper;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.nc4;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000f\u0018\u0000 h2\u00020\u0001:\u0001hB\u0007¢\u0006\u0004\bf\u0010gJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u001c\u001a\u00020\u00142\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\n\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u000fH\u0002J\b\u0010%\u001a\u00020\u000fH\u0002J\u0016\u0010'\u001a\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0016\u0010*\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0019H\u0002J$\u00101\u001a\u0004\u0018\u0001002\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u000fH\u0002J\u0012\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102H\u0014J\u0014\u00106\u001a\u000205*\u0002052\b\b\u0001\u0010.\u001a\u00020-R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010AR\u0016\u0010C\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010>R\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010HR\u0016\u0010K\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010JR\u0016\u0010L\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010'R\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u0010O\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010QR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020D0S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010VR4\u0010Y\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00180S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010VR\"\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040Z8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010[R\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0Z8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010[R\"\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140Z8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010[R\"\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140Z8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010[¨\u0006i"}, d2 = {"Lcom/huami/moving/sport/ui/activity/SportDetailChartsLandscapeActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "type", "", "L", "", "v", "o", "chartType", b.r, "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "H", "K", "", "value", "x", DTransferConstants.SEARCH_KEY, "", "Lcom/huami/chart/data/ChartDataList;", SOAP.XMLNS, "()[Lcom/huami/chart/data/ChartDataList;", "t", "Lkotlin/Triple;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "triple", "M", "Lcom/huami/chart/provider/DrawConfig;", "r", "Lcom/huami/chart/provider/RenderConfig;", "u", "y", "z", "E", LogUtil.D, "B", "yAxisDatas", "F", "Lcom/huami/chart/data/XAxisData;", "xAxisDatas", "C", "Landroid/graphics/Typeface;", "typeface", "", "color", "textSize", "Landroid/graphics/Paint;", "G", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/graphics/drawable/Drawable;", "tint", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "chartLayout", "Landroid/content/Context;", "Landroid/content/Context;", "mContext", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "labelLayout", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "backIcon", "flagLayout", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "flagTextView", "Lcom/huami/chart/chart/ChartProvider;", "Lcom/huami/chart/chart/ChartProvider;", "mChartProvider", "Landroid/graphics/Paint;", "paint", "maxYLabelWidth", "maxXLabelWidth", LogUtil.I, "screenWidth", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "", "Landroid/widget/CheckBox;", "J", "Ljava/util/List;", "checkBoxes", "labelValueViews", "selectChartDataList", "", "Ljava/util/Map;", "chartCheckedMap", "N", "Z", "isOverLaying", "O", "chartSelectPointMap", "P", "zoomedPointChartMap", "Q", "zoomedMultilineChartMap", "<init>", "()V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailChartsLandscapeActivity extends BaseTitleActivity {
    public static final float HALF_ALPHA = 0.5f;
    public static final float MAIN_ALPHA = 1.0f;
    public static final float OVERLAY_ALPHA = 0.3f;
    public static final float POINT_8_ALPHA = 0.8f;
    public static final float QUARTER_ALPHA = 0.25f;

    @Nullable
    private static List<? extends ChartDataList> R = null;
    private static float S = 0.0f;
    private static float T = 0.0f;

    @NotNull
    public static final String TAG = "SportChartsLandscape";

    @Nullable
    private static float[] U;
    private static boolean V;
    private static int Y;
    public static ChartDataList baseChartData;
    public static BaseType baseChartType;
    public static SparseArray<XAxisData> baseXAxisData;
    public static SparseArray<YAxisData> baseYAxisData;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private AppCompatImageView backIcon;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private LinearLayout flagLayout;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private AppCompatTextView flagTextView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private ChartProvider mChartProvider;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private float maxYLabelWidth;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float maxXLabelWidth;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int screenWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    private Handler handler;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean isOverLaying;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private RelativeLayout chartLayout;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private Context mContext;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private LinearLayout labelLayout;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static long W = -1;
    private static int X = 1;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Paint paint = new Paint(1);

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final List<CheckBox> checkBoxes = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final List<AppCompatTextView> labelValueViews = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final List<Triple<BaseType, ChartDataList, SparseArray<YAxisData>>> selectChartDataList = new ArrayList();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private final Map<BaseType, Boolean> chartCheckedMap = new LinkedHashMap();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final Map<BaseType, Float> chartSelectPointMap = new LinkedHashMap();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    private final Map<BaseType, ChartDataList> zoomedPointChartMap = new LinkedHashMap();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    private final Map<BaseType, ChartDataList> zoomedMultilineChartMap = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bX\u0010YJJ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020-8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010/R\u0016\u0010M\u001a\u00020-8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010/R\u0016\u0010N\u001a\u00020-8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010/R\u0016\u0010O\u001a\u00020-8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010/R\u0016\u0010P\u001a\u00020-8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010/R\u0016\u0010R\u001a\u00020Q8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010GR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/huami/moving/sport/ui/activity/SportDetailChartsLandscapeActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseDataProvider;", "baseProvider", "Lcom/huami/chart/data/ChartDataList;", "baseList", "", "multiDataList", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "xaxisData", "Lcom/huami/chart/data/YAxisData;", "yaxisData", "", "show", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "baseChartType", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "getBaseChartType", "()Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "setBaseChartType", "(Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;)V", "baseXAxisData", "Landroid/util/SparseArray;", "getBaseXAxisData", "()Landroid/util/SparseArray;", "setBaseXAxisData", "(Landroid/util/SparseArray;)V", "baseYAxisData", "getBaseYAxisData", "setBaseYAxisData", "baseChartData", "Lcom/huami/chart/data/ChartDataList;", "getBaseChartData", "()Lcom/huami/chart/data/ChartDataList;", "setBaseChartData", "(Lcom/huami/chart/data/ChartDataList;)V", "baseMultiChartData", "Ljava/util/List;", "getBaseMultiChartData", "()Ljava/util/List;", "setBaseMultiChartData", "(Ljava/util/List;)V", "", "baseMaxValue", "F", "getBaseMaxValue", "()F", "setBaseMaxValue", "(F)V", "baseMinValue", "getBaseMinValue", "setBaseMinValue", "", "goalValues", "[F", "getGoalValues", "()[F", "setGoalValues", "([F)V", "", "showGoalLine", "Z", "getShowGoalLine", "()Z", "setShowGoalLine", "(Z)V", "", "samplingInterval", LogUtil.I, "getSamplingInterval", "()I", "setSamplingInterval", "(I)V", "HALF_ALPHA", "MAIN_ALPHA", "OVERLAY_ALPHA", "POINT_8_ALPHA", "QUARTER_ALPHA", "", "TAG", "Ljava/lang/String;", "sportType", "", "trackId", "J", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ChartDataList getBaseChartData() {
            ChartDataList chartDataList = SportDetailChartsLandscapeActivity.baseChartData;
            Objects.requireNonNull(chartDataList);
            return chartDataList;
        }

        @NotNull
        public final BaseType getBaseChartType() {
            BaseType baseType = SportDetailChartsLandscapeActivity.baseChartType;
            Objects.requireNonNull(baseType);
            return baseType;
        }

        public final float getBaseMaxValue() {
            return SportDetailChartsLandscapeActivity.S;
        }

        public final float getBaseMinValue() {
            return SportDetailChartsLandscapeActivity.T;
        }

        @Nullable
        public final List<ChartDataList> getBaseMultiChartData() {
            return SportDetailChartsLandscapeActivity.R;
        }

        @NotNull
        public final SparseArray<XAxisData> getBaseXAxisData() {
            SparseArray<XAxisData> sparseArray = SportDetailChartsLandscapeActivity.baseXAxisData;
            Objects.requireNonNull(sparseArray);
            return sparseArray;
        }

        @NotNull
        public final SparseArray<YAxisData> getBaseYAxisData() {
            SparseArray<YAxisData> sparseArray = SportDetailChartsLandscapeActivity.baseYAxisData;
            Objects.requireNonNull(sparseArray);
            return sparseArray;
        }

        @Nullable
        public final float[] getGoalValues() {
            return SportDetailChartsLandscapeActivity.U;
        }

        public final int getSamplingInterval() {
            return SportDetailChartsLandscapeActivity.Y;
        }

        public final boolean getShowGoalLine() {
            return SportDetailChartsLandscapeActivity.V;
        }

        public final void setBaseChartData(@NotNull ChartDataList chartDataList) {
            SportDetailChartsLandscapeActivity.baseChartData = chartDataList;
        }

        public final void setBaseChartType(@NotNull BaseType baseType) {
            SportDetailChartsLandscapeActivity.baseChartType = baseType;
        }

        public final void setBaseMaxValue(float f) {
            SportDetailChartsLandscapeActivity.S = f;
        }

        public final void setBaseMinValue(float f) {
            SportDetailChartsLandscapeActivity.T = f;
        }

        public final void setBaseMultiChartData(@Nullable List<? extends ChartDataList> list) {
            SportDetailChartsLandscapeActivity.R = list;
        }

        public final void setBaseXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
            SportDetailChartsLandscapeActivity.baseXAxisData = sparseArray;
        }

        public final void setBaseYAxisData(@NotNull SparseArray<YAxisData> sparseArray) {
            SportDetailChartsLandscapeActivity.baseYAxisData = sparseArray;
        }

        public final void setGoalValues(@Nullable float[] fArr) {
            SportDetailChartsLandscapeActivity.U = fArr;
        }

        public final void setSamplingInterval(int i) {
            SportDetailChartsLandscapeActivity.Y = i;
        }

        public final void setShowGoalLine(boolean z) {
            SportDetailChartsLandscapeActivity.V = z;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x003b  */
        public final void show(@NotNull Context context, @NotNull BaseDataProvider baseProvider, @NotNull ChartDataList baseList, @Nullable List<? extends ChartDataList> multiDataList, @NotNull SparseArray<XAxisData> xaxisData, @NotNull SparseArray<YAxisData> yaxisData) {
            boolean z;
            Intent intent = new Intent(context, (Class<?>) SportDetailChartsLandscapeActivity.class);
            setBaseXAxisData(xaxisData);
            setBaseYAxisData(yaxisData);
            setBaseChartType(baseProvider.getType());
            setSamplingInterval(baseProvider.getTrackData().getSamplingInterval());
            setBaseChartData(baseList);
            setBaseMultiChartData(multiDataList);
            setBaseMaxValue(baseProvider.getMMaxValue());
            setBaseMinValue(baseProvider.getMMinValue());
            float[] goalValues = baseProvider.getGoalValues();
            if (goalValues != null) {
                if (!(goalValues.length == 0)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            setGoalValues(z ? baseProvider.getGoalValues() : new float[]{baseProvider.getGoalValue()});
            setShowGoalLine(baseProvider.shouldDrawGoalLine());
            SportDetailChartsLandscapeActivity.W = baseProvider.getTrackData().getCurrentTrackId();
            SportDetailChartsLandscapeActivity.X = baseProvider.getTrackData().getSportType().intValue();
            context.startActivity(intent);
        }
    }

    private final String A(BaseType chartType) {
        if (chartType instanceof StepType) {
            return "stride";
        }
        if (chartType instanceof StepFreqType) {
            return "cadence";
        }
        if (chartType instanceof RopeSkipingFreqType) {
            return SportAnalytics.ParamValue.ChartType.CHART_ROPEFREQUENCY;
        }
        if (chartType instanceof BoatingFreType) {
            return SportAnalytics.ParamValue.ChartType.CHART_ROWINGRATE;
        }
        if (chartType instanceof Spo2Type) {
            return "spo2";
        }
        if (chartType instanceof HeartType) {
            return SportAnalytics.ParamValue.ChartType.CHART_HEARTRATE;
        }
        if (chartType instanceof PaceType) {
            return "pace";
        }
        if (chartType instanceof SpeedType) {
            return "speed";
        }
        if (chartType instanceof AltiType) {
            return "altitude";
        }
        return chartType instanceof StrokeSpeedType ? SportAnalytics.ParamValue.ChartType.CHART_STROKERATE : "";
    }

    private final float B() {
        return ChartUtil.dp2px(this, 13.4f);
    }

    private final float C(SparseArray<XAxisData> xAxisDatas) {
        int size = xAxisDatas.size();
        float f = 0.0f;
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                XAxisData xAxisData = xAxisDatas.get(i);
                if (xAxisData != null) {
                    String title = xAxisData.getTitle();
                    int color = getResources().getColor(R.color.white40);
                    Context context = this.mContext;
                    Objects.requireNonNull(context);
                    float fCalculateTextWidth = ChartUtil.calculateTextWidth(G(null, color, ChartUtil.sp2px(context, 12.0f)), title);
                    if (f < fCalculateTextWidth) {
                        f = fCalculateTextWidth;
                    }
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return f;
    }

    private final float D() {
        return B() + this.maxYLabelWidth + ChartUtil.dp2px(this, 7.3f);
    }

    private final float E() {
        return 0.0f;
    }

    private final float F(SparseArray<YAxisData> yAxisDatas) {
        int size = yAxisDatas.size();
        float f = 0.0f;
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                YAxisData yAxisData = yAxisDatas.get(i);
                if (yAxisData != null) {
                    float fCalculateTextWidth = ChartUtil.calculateTextWidth(G(TypefaceManager.get().getTypeface(this, Font.DIN_MED), getResources().getColor(R.color.white40), ChartUtil.sp2px(this, 13.3f)), yAxisData.getTitle());
                    if (f < fCalculateTextWidth) {
                        f = fCalculateTextWidth;
                    }
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return f;
    }

    private final Paint G(Typeface typeface, int color, float textSize) {
        this.paint.reset();
        this.paint.setAntiAlias(true);
        this.paint.setColor(color);
        this.paint.setTextSize(textSize);
        if (typeface != null) {
            this.paint.setTypeface(typeface);
        }
        return this.paint;
    }

    private final void H() {
        if (W == -1) {
            finish();
        }
        Context context = this.mContext;
        Objects.requireNonNull(context);
        this.mChartProvider = new ChartProvider(context, true);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(SportDetailChartsLandscapeActivity sportDetailChartsLandscapeActivity, View view) {
        sportDetailChartsLandscapeActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(SportDetailChartsLandscapeActivity sportDetailChartsLandscapeActivity) {
        sportDetailChartsLandscapeActivity.H();
    }

    private final void K() {
        HMChart chart;
        AppCompatTextView appCompatTextView = this.flagTextView;
        Objects.requireNonNull(appCompatTextView);
        final ChartFlagViewSlideWrapper chartFlagViewSlideWrapper = new ChartFlagViewSlideWrapper(appCompatTextView, 0.0f, 0.0f, 6, null);
        ChartProvider chartProvider = this.mChartProvider;
        if (chartProvider == null || (chart = chartProvider.getChart()) == null) {
            return;
        }
        chart.registerTouchListener(new ITouchListener() { // from class: com.huami.moving.sport.ui.activity.SportDetailChartsLandscapeActivity$registerTouch$1
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@Nullable Index touchIndex) {
                BaseIndex posiIndex;
                float currentDownX;
                HMChart chart2;
                InteractiveManager interactiveManager;
                Unit unit;
                Index pointLineCurrentDownIndex;
                int index = (touchIndex == null || (posiIndex = touchIndex.getPosiIndex()) == null) ? -1 : posiIndex.getIndex();
                ArrayList<Triple<BaseType, ChartDataList, SparseArray<YAxisData>>> chartsTypeList = OverlyingHelper.INSTANCE.getChartsTypeList();
                SportDetailChartsLandscapeActivity sportDetailChartsLandscapeActivity = this.a;
                Iterator<T> it2 = chartsTypeList.iterator();
                while (true) {
                    currentDownX = -1.0f;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Triple triple = (Triple) it2.next();
                    if (Intrinsics.areEqual(sportDetailChartsLandscapeActivity.chartCheckedMap.get(triple.getFirst()), Boolean.TRUE)) {
                        if (sportDetailChartsLandscapeActivity.zoomedMultilineChartMap.containsKey(triple.getFirst())) {
                            ChartProvider chartProvider2 = sportDetailChartsLandscapeActivity.mChartProvider;
                            pointLineCurrentDownIndex = ChartUtil.getMultiLineCurrentDownIndex(chartProvider2 != null ? chartProvider2.getChart() : null, (ChartDataList) sportDetailChartsLandscapeActivity.zoomedMultilineChartMap.get(triple.getFirst()));
                        } else if (sportDetailChartsLandscapeActivity.zoomedPointChartMap.containsKey(triple.getFirst())) {
                            ChartProvider chartProvider3 = sportDetailChartsLandscapeActivity.mChartProvider;
                            pointLineCurrentDownIndex = ChartUtil.getPointLineCurrentDownIndex(chartProvider3 != null ? chartProvider3.getChart() : null, (ChartDataList) sportDetailChartsLandscapeActivity.zoomedPointChartMap.get(triple.getFirst()));
                        } else {
                            pointLineCurrentDownIndex = touchIndex;
                        }
                        ChartData dataByDataIndex = ((ChartDataList) triple.getSecond()).getDataByDataIndex(pointLineCurrentDownIndex == null ? -1 : pointLineCurrentDownIndex.getDataIndex());
                        if (dataByDataIndex != null) {
                            sportDetailChartsLandscapeActivity.chartSelectPointMap.put(triple.getFirst(), Float.valueOf(dataByDataIndex.getValues()[0]));
                        } else {
                            Log.i(SportDetailChartsLandscapeActivity.TAG, "can't find dataValue for " + triple.getFirst());
                            sportDetailChartsLandscapeActivity.chartSelectPointMap.put(triple.getFirst(), Float.valueOf(-1.0f));
                        }
                    }
                }
                List list = this.a.checkBoxes;
                SportDetailChartsLandscapeActivity sportDetailChartsLandscapeActivity2 = this.a;
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    Object tag = ((CheckBox) obj).getTag();
                    Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.moving.sport.ui.view.chart.dataprovider.BaseType");
                    BaseType baseType = (BaseType) tag;
                    if (!Intrinsics.areEqual(sportDetailChartsLandscapeActivity2.chartCheckedMap.get(baseType), Boolean.TRUE)) {
                        ((AppCompatTextView) sportDetailChartsLandscapeActivity2.labelValueViews.get(i)).setText("");
                    } else if (sportDetailChartsLandscapeActivity2.chartSelectPointMap.containsKey(baseType)) {
                        Float f = (Float) sportDetailChartsLandscapeActivity2.chartSelectPointMap.get(baseType);
                        if (f == null) {
                            unit = null;
                        } else {
                            ((AppCompatTextView) sportDetailChartsLandscapeActivity2.labelValueViews.get(i)).setText(sportDetailChartsLandscapeActivity2.x(baseType, f.floatValue()));
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            Log.i(SportDetailChartsLandscapeActivity.TAG, "not Select type: " + baseType);
                        }
                    } else {
                        ((AppCompatTextView) sportDetailChartsLandscapeActivity2.labelValueViews.get(i)).setText("--");
                    }
                    i = i2;
                }
                if (index >= 0) {
                    long j = index;
                    DataFormatter.getConsumeTime(j);
                    AppCompatTextView appCompatTextView2 = this.a.flagTextView;
                    Objects.requireNonNull(appCompatTextView2);
                    appCompatTextView2.setText(DataFormatter.getConsumeTime(j));
                } else {
                    AppCompatTextView appCompatTextView3 = this.a.flagTextView;
                    Objects.requireNonNull(appCompatTextView3);
                    appCompatTextView3.setText("--");
                }
                AppCompatTextView appCompatTextView4 = this.a.flagTextView;
                Objects.requireNonNull(appCompatTextView4);
                appCompatTextView4.setVisibility(0);
                ChartProvider chartProvider4 = this.a.mChartProvider;
                if (chartProvider4 != null && (chart2 = chartProvider4.getChart()) != null && (interactiveManager = chart2.getInteractiveManager()) != null) {
                    currentDownX = interactiveManager.getCurrentDownX();
                }
                chartFlagViewSlideWrapper.slide(currentDownX);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index index) {
            }
        });
    }

    private final boolean L(BaseType type) {
        return (type instanceof PressureType) || (type instanceof GolfAngleType) || (type instanceof GolfUpDownTimeType) || (type instanceof GolfBeatType);
    }

    private final ChartDataList M(Triple<? extends BaseType, ? extends ChartDataList, ? extends SparseArray<YAxisData>> triple) {
        float value = triple.getThird().get(0).getValue();
        float value2 = triple.getThird().get(triple.getThird().size() - 1).getValue();
        Companion companion = INSTANCE;
        float value3 = companion.getBaseYAxisData().get(0).getValue();
        float value4 = companion.getBaseYAxisData().get(companion.getBaseYAxisData().size() - 1).getValue();
        if (value4 >= value3) {
            value3 = value4;
            value4 = value3;
        }
        float fAbs = Math.abs(value3 - value4) / Math.abs(value2 - value);
        ChartDataList second = triple.getSecond();
        SparseArray sparseArray = new SparseArray();
        for (Integer num : second.getDataKeyList()) {
            ChartData dataByPositionIndex = second.getDataByPositionIndex(num.intValue());
            Objects.requireNonNull(dataByPositionIndex, "null cannot be cast to non-null type com.huami.chart.data.ChartData");
            ChartData chartData = dataByPositionIndex;
            ChartData chartData2 = new ChartData(num.intValue(), ((triple.getFirst() instanceof PaceType) || (INSTANCE.getBaseChartType() instanceof PaceType)) ? value3 - ((chartData.getValues()[0] - (triple.getFirst() instanceof PaceType ? value2 : value)) * fAbs) : ((chartData.getValues()[0] - value) * fAbs) + value4);
            if (OverlyingHelper.INSTANCE.isPointStyleType(triple.getFirst())) {
                ChartDataConverter.getInstance().addChartExtend(chartData2, chartData.getValues(), triple.getFirst(), true, this);
            }
            sparseArray.put(num.intValue(), chartData2);
        }
        ChartDataList chartDataList = !OverlyingHelper.INSTANCE.isPointStyleType(triple.getFirst()) ? new ChartDataList(sparseArray) : new PointChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(INSTANCE.getBaseChartData().getEnd());
        return chartDataList;
    }

    private final void o() {
        if (W == -1) {
            finish();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", String.valueOf(W));
        linkedHashMap.put("sportstype", String.valueOf(X));
        linkedHashMap.put(SportAnalytics.ParamKey.CHART_TYPE, A(INSTANCE.getBaseChartType()));
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_CHART_WIDE_C).putExtras(linkedHashMap).setAnonymous(!Utils.isChinaUser()));
    }

    private final void p(BaseType chartType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", String.valueOf(W));
        linkedHashMap.put("sportstype", String.valueOf(X));
        linkedHashMap.put("tp", A(chartType));
        linkedHashMap.put("pos", A(INSTANCE.getBaseChartType()));
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.OVERLAY_C).putExtras(linkedHashMap).setAnonymous(!Utils.isChinaUser()));
    }

    private final void q() {
        Iterator<T> it2 = this.chartCheckedMap.values().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((Boolean) it2.next()).booleanValue()) {
                i++;
            }
        }
        this.isOverLaying = i >= 2;
        AppCompatTextView appCompatTextView = this.flagTextView;
        Objects.requireNonNull(appCompatTextView);
        appCompatTextView.setVisibility(4);
        ChartProvider chartProvider = this.mChartProvider;
        if (chartProvider != null) {
            chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.moving.sport.ui.activity.SportDetailChartsLandscapeActivity$createChart$2
                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                /* JADX INFO: renamed from: getChartContainer */
                public ViewGroup getA() {
                    RelativeLayout relativeLayout = this.a.chartLayout;
                    Objects.requireNonNull(relativeLayout);
                    return relativeLayout;
                }

                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                /* JADX INFO: renamed from: getChartDataList */
                public ChartDataList getB() {
                    Iterator<T> it3 = OverlyingHelper.INSTANCE.getChartsTypeList().iterator();
                    while (it3.hasNext()) {
                        Triple triple = (Triple) it3.next();
                        if (Intrinsics.areEqual(triple.getFirst(), SportDetailChartsLandscapeActivity.INSTANCE.getBaseChartType())) {
                            return (ChartDataList) triple.getSecond();
                        }
                    }
                    return SportDetailChartsLandscapeActivity.INSTANCE.getBaseChartData();
                }

                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                public DrawConfig getDrawConfig() {
                    return this.a.r();
                }

                @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
                @NotNull
                /* JADX INFO: renamed from: getMultiChartDataList */
                public ChartDataList[] getMultiList() {
                    return this.a.s();
                }

                @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
                @NotNull
                public ChartDataList[] getPointChartDataList() {
                    return this.a.t();
                }

                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                public RenderConfig getRenderConfig() {
                    return this.a.u();
                }
            }, true, false, false);
        }
        if (OverlyingHelper.INSTANCE.unSupportInteractiveType(INSTANCE.getBaseChartType())) {
            return;
        }
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig r() {
        DrawConfig.Builder builder = new DrawConfig.Builder(this);
        RelativeLayout relativeLayout = this.chartLayout;
        Objects.requireNonNull(relativeLayout);
        DrawConfig.Builder canvasWidth = builder.setCanvasWidth(relativeLayout.getMeasuredWidth());
        RelativeLayout relativeLayout2 = this.chartLayout;
        Objects.requireNonNull(relativeLayout2);
        DrawConfig.Builder dataMarginRight = canvasWidth.setCanvasHeight(relativeLayout2.getMeasuredHeight()).setDataMarginRight(z());
        Context context = this.mContext;
        Objects.requireNonNull(context);
        return dataMarginRight.setDataWidth(ChartUtil.dp2px(context, INSTANCE.getBaseChartType() instanceof PressureType ? 3.5f : 5.0f)).setDataMarginTop(ChartUtil.dp2px(this, 30.0f)).setDataMarginLeft(y()).setDataMarginBottom(ChartUtil.dp2px(this, 45.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartDataList[] s() {
        ArrayList arrayList = new ArrayList();
        List<? extends ChartDataList> list = R;
        if (list != null && (!list.isEmpty())) {
            arrayList.addAll(list);
        }
        this.zoomedMultilineChartMap.clear();
        Iterator<T> it2 = OverlyingHelper.INSTANCE.getChartsTypeList().iterator();
        while (it2.hasNext()) {
            Triple<? extends BaseType, ? extends ChartDataList, ? extends SparseArray<YAxisData>> triple = (Triple) it2.next();
            if (!OverlyingHelper.INSTANCE.isPointStyleType(triple.getFirst()) && !Intrinsics.areEqual(triple.getFirst(), INSTANCE.getBaseChartType()) && Intrinsics.areEqual(this.chartCheckedMap.get(triple.getFirst()), Boolean.TRUE)) {
                ChartDataList chartDataListM = M(triple);
                arrayList.add(chartDataListM);
                this.zoomedMultilineChartMap.put(triple.getFirst(), chartDataListM);
            }
        }
        Object[] array = arrayList.toArray(new ChartDataList[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (ChartDataList[]) array;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartDataList[] t() {
        ArrayList arrayList = new ArrayList();
        this.zoomedPointChartMap.clear();
        Iterator<T> it2 = OverlyingHelper.INSTANCE.getChartsTypeList().iterator();
        while (it2.hasNext()) {
            Triple<? extends BaseType, ? extends ChartDataList, ? extends SparseArray<YAxisData>> triple = (Triple) it2.next();
            OverlyingHelper.Companion companion = OverlyingHelper.INSTANCE;
            if (companion.isPointStyleType(triple.getFirst()) && !Intrinsics.areEqual(triple.getFirst(), INSTANCE.getBaseChartType()) && Intrinsics.areEqual(this.chartCheckedMap.get(triple.getFirst()), Boolean.TRUE)) {
                ChartDataList chartDataListM = M(triple);
                if (chartDataListM instanceof PointChartDataList) {
                    BaseType first = triple.getFirst();
                    Context context = this.mContext;
                    Objects.requireNonNull(context);
                    ((PointChartDataList) chartDataListM).setInteractivePointColor(companion.getColorByType(first, context, 0.3f));
                }
                arrayList.add(chartDataListM);
                this.zoomedPointChartMap.put(triple.getFirst(), chartDataListM);
            } else {
                Companion companion2 = INSTANCE;
                if (companion.isPointStyleType(companion2.getBaseChartType()) && Intrinsics.areEqual(triple.getFirst(), companion2.getBaseChartType())) {
                    arrayList.add(companion2.getBaseChartData());
                }
            }
        }
        Object[] array = arrayList.toArray(new ChartDataList[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (ChartDataList[]) array;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig u() {
        int i;
        int color = ContextCompat.getColor(this, R.color.p3);
        int[] iArr = {Color.parseColor("#CCFF5850"), Color.parseColor("#80FF5850"), Color.parseColor("#40FF5850"), 0};
        OverlyingHelper.Companion companion = OverlyingHelper.INSTANCE;
        Companion companion2 = INSTANCE;
        if (companion.isBaseChartMultiLineStyleType(companion2.getBaseChartType())) {
            iArr = new int[]{0, 0, 0, 0};
        } else if (!companion.isPointStyleType(companion2.getBaseChartType())) {
            color = companion.getColorByType(companion2.getBaseChartType(), this, 1.0f);
            iArr = new int[]{companion.getColorWithAlpha(0.8f, color), companion.getColorWithAlpha(0.5f, color), companion.getColorWithAlpha(0.25f, color), 0};
        }
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        if (companion2.getBaseChartType() instanceof Spo2Type) {
            sparseArray.put(0, new YAxisData(80.0f, "80%"));
            sparseArray.put(1, new YAxisData(90.0f, "90%"));
        }
        if (companion2.getBaseYAxisData().size() > 0) {
            this.maxYLabelWidth = F(companion2.getBaseYAxisData());
        }
        if (companion2.getBaseXAxisData().size() > 0) {
            this.maxXLabelWidth = C(companion2.getBaseXAxisData());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<? extends ChartDataList> list = R;
        if (list != null && (list.isEmpty() ^ true)) {
            arrayList.addAll(ArraysKt___ArraysKt.toList(companion.baseChartOtherMultilineColors(companion2.getBaseChartType(), this, 1.0f)));
            arrayList2.addAll(ArraysKt___ArraysKt.toList(companion.baseChartOtherMultilineColors(companion2.getBaseChartType(), this, 0.3f)));
        }
        int i2 = 0;
        for (Object obj : companion.getChartsTypeList()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Triple triple = (Triple) obj;
            if (!Intrinsics.areEqual(triple.getFirst(), INSTANCE.getBaseChartType())) {
                OverlyingHelper.Companion companion3 = OverlyingHelper.INSTANCE;
                if (!companion3.isPointStyleType((BaseType) triple.getFirst()) && Intrinsics.areEqual(this.chartCheckedMap.get(triple.getFirst()), Boolean.TRUE)) {
                    arrayList.add(Integer.valueOf(companion3.getColorByType((BaseType) triple.getFirst(), this, 0.3f)));
                    arrayList2.add(Integer.valueOf(companion3.getColorByType((BaseType) triple.getFirst(), this, 1.0f)));
                }
            }
            i2 = i3;
        }
        Companion companion4 = INSTANCE;
        if (companion4.getBaseChartType() instanceof HeartType) {
            int i4 = Y;
            i = i4 > 15 ? i4 * 2 : 30;
        } else if (companion4.getBaseChartType() instanceof BodyStatusType) {
            i = -1;
        } else {
            int i5 = Y;
            i = i5 > 3 ? i5 * 2 : 6;
        }
        boolean z = (companion4.getBaseChartType() instanceof GolfUpDownTimeType) || (companion4.getBaseChartType() instanceof GolfAngleType) || (companion4.getBaseChartType() instanceof GolfBeatType);
        RenderConfig.Builder builder = new RenderConfig.Builder();
        Context context = this.mContext;
        Objects.requireNonNull(context);
        AxisStyle.Builder xAxisMarginRight = new AxisStyle.Builder(context).setAxisStyle(32994).setZeroX(B() + this.maxYLabelWidth).setXAxisMarginLeft(D()).setXAxisMarginRight(E());
        Context context2 = this.mContext;
        Objects.requireNonNull(context2);
        AxisStyle.Builder zeroY = xAxisMarginRight.setZeroY(ChartUtil.dp2px(context2, 43.0f));
        Context context3 = this.mContext;
        Objects.requireNonNull(context3);
        AxisStyle.Builder yLabelMarginYAxis = zeroY.setYAxisMarginBottom(ChartUtil.dp2px(context3, 40.3f)).setYLabelMarginYAxis(0.0f);
        Context context4 = this.mContext;
        Objects.requireNonNull(context4);
        AxisStyle.Builder xLabelMarginTop = yLabelMarginYAxis.setXLabelMarginTop(ChartUtil.dp2px(context4, 6.0f));
        Context context5 = this.mContext;
        Objects.requireNonNull(context5);
        AxisStyle.Builder xLabelSize = xLabelMarginTop.setXLabelSize(ChartUtil.sp2px(context5, 12.0f));
        Context context6 = this.mContext;
        Objects.requireNonNull(context6);
        AxisStyle.Builder yLabelSize = xLabelSize.setYLabelSize(ChartUtil.sp2px(context6, 12.0f));
        Context context7 = this.mContext;
        Objects.requireNonNull(context7);
        AxisStyle.Builder xSubLabelSize = yLabelSize.setXSubLabelSize(ChartUtil.sp2px(context7, 10.0f));
        Resources resources = getResources();
        int i6 = R.color.s3;
        AxisStyle.Builder xLabelColor = xSubLabelSize.setYLabelColor(resources.getColor(i6)).setXLabelColor(getResources().getColor(i6));
        Resources resources2 = getResources();
        int i7 = R.color.s4;
        AxisStyle.Builder xAxisLineColor = xLabelColor.setXSubLabelColor(resources2.getColor(i7)).setXAxisLineColor(getResources().getColor(i7));
        Context context8 = this.mContext;
        Objects.requireNonNull(context8);
        AxisStyle.Builder xAxisLineWidth = xAxisLineColor.setXAxisLineWidth(ChartUtil.dp2px(context8, 0.66f));
        Context context9 = this.mContext;
        Objects.requireNonNull(context9);
        AxisStyle.Builder yAxisScaleLongDashColor = xAxisLineWidth.setXAxisScaleLineHeight(ChartUtil.dp2px(context9, 3.0f)).setXAxisScaleLineColor(getResources().getColor(i7)).setXAxisData(companion4.getBaseXAxisData()).setYAxisData(companion4.getBaseYAxisData()).setYAxisScaleDatas(sparseArray).setYAxisScaleLongDashColor(Color.parseColor("#8D8D8D"));
        Context context10 = this.mContext;
        Objects.requireNonNull(context10);
        RenderConfig.Builder axisStyle = builder.setAxisStyle(yAxisScaleLongDashColor.setYAxisScaleLineWidth(ChartUtil.dp2px(context10, 0.5f)).setYAxisRight(true).create());
        Context context11 = this.mContext;
        Objects.requireNonNull(context11);
        InteractiveLineStyle.Builder interactiveUpCancel = new InteractiveLineStyle.Builder(context11).setInteractiveLineStyle(32).setVerticalLineColor(Color.parseColor("#4C000000")).setInteractiveUpCancel(false);
        Context context12 = this.mContext;
        Objects.requireNonNull(context12);
        InteractiveLineStyle.Builder verticalLineWidth = interactiveUpCancel.setVerticalLineWidth(ChartUtil.dp2px(context12, 1.2f));
        Context context13 = this.mContext;
        Objects.requireNonNull(context13);
        InteractiveLineStyle.Builder intersectionPointSize = verticalLineWidth.setIntersectionPointSize(ChartUtil.dp2px(context13, 4.0f));
        Context context14 = this.mContext;
        Objects.requireNonNull(context14);
        InteractiveLineStyle.Builder pointShadowLayer = intersectionPointSize.setIntersectionPointBorder(ChartUtil.dp2px(context14, 2.0f)).setPointShadowLayer(5.0f, 0.0f, 0.0f, -7829368);
        OverlyingHelper.Companion companion5 = OverlyingHelper.INSTANCE;
        BaseType baseChartType2 = companion4.getBaseChartType();
        Context context15 = this.mContext;
        Objects.requireNonNull(context15);
        RenderConfig.Builder interactiveLineStyle = axisStyle.setInteractiveLineStyle(pointShadowLayer.setIntersectionPointColor(companion5.getColorByType(baseChartType2, context15, 1.0f)).create());
        Context context16 = this.mContext;
        Objects.requireNonNull(context16);
        MultiLineStyle.Builder lineColors = new MultiLineStyle.Builder(context16).setLineColors(CollectionsKt___CollectionsKt.toIntArray(arrayList));
        Context context17 = this.mContext;
        Objects.requireNonNull(context17);
        MultiLineStyle.Builder intersectionPointColor = lineColors.setLineWidth(ChartUtil.dp2px(context17, 2.0f)).setSinglePointSize(z ? 6.0f : 0.0f).showGapPoint(z).setLineStyle(4).setIntersectionPointColor(CollectionsKt___CollectionsKt.toIntArray(arrayList2));
        Context context18 = this.mContext;
        Objects.requireNonNull(context18);
        RenderConfig.Builder multiLineStyle = interactiveLineStyle.setMultiLineStyle(intersectionPointColor.setIntersectionPointBorderWidth(ChartUtil.dp2px(context18, 2.0f)).setIntersectionPointSize(10.0f).setDisconnectLineGap(i).create());
        float fDp2px = ChartUtil.dp2px(this, 1.2f);
        if (companion4.getBaseChartType() instanceof Spo2Type) {
            fDp2px = ChartUtil.dp2px(this, 4.0f);
        }
        if (companion4.getBaseChartType() instanceof PressureType) {
            Context context19 = this.mContext;
            Objects.requireNonNull(context19);
            multiLineStyle.setBarStyle(new BarStyle.Builder(context19).setBarStyle(2).create());
        } else {
            PointStyle.Builder pointColor = new PointStyle.Builder(this).setPointStyle(2).setPointSize(fDp2px).setPointColor(getResources().getColor(R.color.s20));
            BaseType baseChartType3 = companion4.getBaseChartType();
            Context context20 = this.mContext;
            Objects.requireNonNull(context20);
            multiLineStyle.setPointStyle(pointColor.setInteractivePointColor(companion5.getColorByType(baseChartType3, context20, 1.0f)).create());
            LineStyle.Builder builderShowGapPoint = new LineStyle.Builder(this).setLineStyle(4).setLineWidth(ChartUtil.dp2px(this, 2.0f)).setSinglePointSize(z ? 6.0f : 0.0f).showGapPoint(z);
            if (companion5.isPointStyleType(companion4.getBaseChartType())) {
                color = 0;
            }
            LineStyle.Builder lineColor = builderShowGapPoint.setLineColor(color);
            if (this.isOverLaying || companion5.isPointStyleType(companion4.getBaseChartType())) {
                iArr = null;
            }
            multiLineStyle.setLineStyle(lineColor.setShadowColors(iArr).setDisconnectLineGap(i).showGapPoint(true).setInteractiveUpCancel(true).create());
        }
        Context context21 = this.mContext;
        Objects.requireNonNull(context21);
        GoalLineStyle.Builder goalLineColor = new GoalLineStyle.Builder(context21).setGoalLineStyle((this.isOverLaying || !V) ? 1 : 2).setDashLineInterval(new float[]{12.0f, 7.0f}).setGoalLineColor(new int[]{getResources().getColor(R.color.black20)});
        Context context22 = this.mContext;
        Objects.requireNonNull(context22);
        multiLineStyle.setGoalLineStyle(goalLineColor.setGoalLineWidth(ChartUtil.dp2px(context22, 1.0f)).setGoalLineMarginStart(y()).setGoalLineMarginEnd(z()).setGoals(U).create());
        return multiLineStyle.create();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0082  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b4  */
    private final void v() {
        CheckBox checkBox;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        this.selectChartDataList.addAll(OverlyingHelper.INSTANCE.getChartsTypeList());
        Iterator<T> it2 = this.selectChartDataList.iterator();
        while (it2.hasNext()) {
            Triple triple = (Triple) it2.next();
            Companion companion = INSTANCE;
            if (L(companion.getBaseChartType())) {
                if (Intrinsics.areEqual(triple.getFirst(), companion.getBaseChartType())) {
                    View viewInflate = LayoutInflater.from(this).inflate(R.layout.moving_ui_sport_detail_charts_landscape_chart_item, (ViewGroup) null);
                    AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R.id.moving_ui_chart_select_value);
                    checkBox = (CheckBox) viewInflate.findViewById(R.id.moving_ui_chart_select_icon);
                    int colorByType = OverlyingHelper.INSTANCE.getColorByType((BaseType) triple.getFirst(), this, 1.0f);
                    Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(checkBox);
                    checkBox.setButtonDrawable(buttonDrawable != null ? tint(buttonDrawable, colorByType) : null);
                    checkBox.setText(((BaseType) triple.getFirst()).getName(this));
                    checkBox.setTag(triple.getFirst());
                    if (Intrinsics.areEqual(triple.getFirst(), companion.getBaseChartType())) {
                        checkBox.setChecked(true);
                        checkBox.setEnabled(false);
                    } else {
                        checkBox.setChecked(false);
                        checkBox.setEnabled(true);
                    }
                    this.chartCheckedMap.put((BaseType) triple.getFirst(), Boolean.valueOf(checkBox.isChecked()));
                    checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f87
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            SportDetailChartsLandscapeActivity.w(this.a, compoundButton, z);
                        }
                    });
                    this.checkBoxes.add(checkBox);
                    this.labelValueViews.add(appCompatTextView);
                    viewInflate.setLayoutParams(layoutParams);
                    LinearLayout linearLayout = this.labelLayout;
                    Objects.requireNonNull(linearLayout);
                    linearLayout.addView(viewInflate);
                }
            } else if (!L((BaseType) triple.getFirst())) {
                View viewInflate2 = LayoutInflater.from(this).inflate(R.layout.moving_ui_sport_detail_charts_landscape_chart_item, (ViewGroup) null);
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewInflate2.findViewById(R.id.moving_ui_chart_select_value);
                checkBox = (CheckBox) viewInflate2.findViewById(R.id.moving_ui_chart_select_icon);
                int colorByType2 = OverlyingHelper.INSTANCE.getColorByType((BaseType) triple.getFirst(), this, 1.0f);
                Drawable buttonDrawable2 = CompoundButtonCompat.getButtonDrawable(checkBox);
                checkBox.setButtonDrawable(buttonDrawable2 != null ? tint(buttonDrawable2, colorByType2) : null);
                checkBox.setText(((BaseType) triple.getFirst()).getName(this));
                checkBox.setTag(triple.getFirst());
                if (Intrinsics.areEqual(triple.getFirst(), companion.getBaseChartType())) {
                    checkBox.setChecked(true);
                    checkBox.setEnabled(false);
                } else {
                    checkBox.setChecked(false);
                    checkBox.setEnabled(true);
                }
                this.chartCheckedMap.put((BaseType) triple.getFirst(), Boolean.valueOf(checkBox.isChecked()));
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f87
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        SportDetailChartsLandscapeActivity.w(this.a, compoundButton, z);
                    }
                });
                this.checkBoxes.add(checkBox);
                this.labelValueViews.add(appCompatTextView2);
                viewInflate2.setLayoutParams(layoutParams);
                LinearLayout linearLayout2 = this.labelLayout;
                Objects.requireNonNull(linearLayout2);
                linearLayout2.addView(viewInflate2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SportDetailChartsLandscapeActivity sportDetailChartsLandscapeActivity, CompoundButton compoundButton, boolean z) {
        Object tag = compoundButton.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.moving.sport.ui.view.chart.dataprovider.BaseType");
        BaseType baseType = (BaseType) tag;
        sportDetailChartsLandscapeActivity.chartCheckedMap.put(baseType, Boolean.valueOf(z));
        sportDetailChartsLandscapeActivity.q();
        sportDetailChartsLandscapeActivity.p(baseType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String x(BaseType chartType, float value) {
        if (value == -1.0f) {
            return "--";
        }
        if (chartType instanceof HeartType ? true : chartType instanceof StepFreqType ? true : chartType instanceof Spo2Type ? true : chartType instanceof CadenceType ? true : chartType instanceof RopeSkipingFreqType ? true : chartType instanceof BoatingFreType ? true : chartType instanceof StrokeSpeedType ? true : chartType instanceof PressureType) {
            return new BigDecimal(String.valueOf(value)).setScale(0, 4).toString();
        }
        if (chartType instanceof StepType) {
            return new BigDecimal(String.valueOf(value * (RunnerData.getRunner().isMetric() ? 1.0f : 0.3937008f))).setScale(0, 4).toString();
        }
        if (chartType instanceof AltiType) {
            return String.valueOf((int) ((value * (RunnerData.getRunner().isMetric() ? 1.0f : 3.28084f)) / 100));
        }
        if (chartType instanceof PaceType) {
            return DataFormatter.formatTimeInSportFormForPace((long) value);
        }
        return chartType instanceof SpeedType ? new BigDecimal(String.valueOf(value)).setScale(2, 4).toString() : "$";
    }

    private final float y() {
        return B() + this.maxYLabelWidth + (this.maxXLabelWidth / 2);
    }

    private final float z() {
        return B() + (this.maxXLabelWidth / 2);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE);
        this.mContext = this;
        setContentView(R.layout.activity_sport_detail_charts_landscape);
        this.chartLayout = (RelativeLayout) findViewById(R.id.moving_ui_diagram_landscape_container);
        this.labelLayout = (LinearLayout) findViewById(R.id.moving_ui_diagram_landscape_chart_label_layout);
        this.backIcon = (AppCompatImageView) findViewById(R.id.moving_ui_diagram_landscape_chart_back_icon);
        this.flagLayout = (LinearLayout) findViewById(R.id.moving_ui_diagram_landscape_flag_layout);
        this.flagTextView = (AppCompatTextView) findViewById(R.id.moving_ui_diagram_landscape_flag_text);
        AppCompatImageView appCompatImageView = this.backIcon;
        Objects.requireNonNull(appCompatImageView);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: e87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailChartsLandscapeActivity.I(this.a, view);
            }
        });
        if (W == -1) {
            finish();
        }
        v();
        this.screenWidth = getResources().getDisplayMetrics().widthPixels;
        Handler handler = new Handler();
        this.handler = handler;
        handler.postDelayed(new Runnable() { // from class: g87
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailChartsLandscapeActivity.J(this.a);
            }
        }, 500L);
        o();
    }

    @NotNull
    public final Drawable tint(@NotNull Drawable drawable, @ColorInt int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(drawableWrap, i);
        return drawableWrap;
    }
}
