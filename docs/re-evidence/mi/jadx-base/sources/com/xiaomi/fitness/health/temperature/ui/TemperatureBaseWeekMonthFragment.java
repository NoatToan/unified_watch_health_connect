package com.xiaomi.fitness.health.temperature.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.TemperatureEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.valueformatter.TempTrendHighLightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.TempTrendYValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.temperature.TemperatureViewModel;
import com.xiaomi.fitness.health.temperature.ui.TemperatureBaseWeekMonthFragment;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.TemperatureDataUtil;
import defpackage.a52;
import defpackage.arr;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.hak;
import defpackage.k3p;
import defpackage.opo;
import defpackage.pni;
import defpackage.q02;
import defpackage.qpo;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.vx5;
import defpackage.xcm;
import defpackage.yfe;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 ®\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002®\u0001B\b¢\u0006\u0005\b\u00ad\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010R\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010,\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R$\u0010U\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010,\u001a\u0004\bV\u0010.\"\u0004\bW\u00100R$\u0010Y\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010`\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010g\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010m\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010Z\u001a\u0004\bn\u0010\\\"\u0004\bo\u0010^R$\u0010q\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010w\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010r\u001a\u0004\bx\u0010t\"\u0004\by\u0010vR$\u0010z\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010r\u001a\u0004\b{\u0010t\"\u0004\b|\u0010vR\u001e\u0010~\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR \u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010NR\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010AR\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R(\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010,\u001a\u0005\b\u008c\u0001\u0010.\"\u0005\b\u008d\u0001\u00100R(\u0010\u0091\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0005\u0012\u00030\u0090\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0094\u0001R,\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010¡\u0001\u001a\u000b\u0012\u0005\u0012\u00030 \u0001\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010NR(\u0010¢\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¢\u0001\u0010,\u001a\u0005\b£\u0001\u0010.\"\u0005\b¤\u0001\u00100R\u0018\u0010¨\u0001\u001a\u00030¥\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018$X¤\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/ui/TemperatureBaseWeekMonthFragment;", "Lcom/xiaomi/fitness/health/temperature/TemperatureViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewOnReportChanged", "refreshDetailCard", "refreshDataTitle", "refreshBarChart", "initView", "initUnderstandCard", "initDetailRecyclerView", "updateRecyclerDetailLayoutManager", "initBarChartRecyclerView", "initBundle", "initTrendChartRecyclerView", "refreshView", "initViewBinding", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "buildEntries", "()Ljava/util/List;", "Lorg/joda/time/LocalDate;", "currentLocalDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "dailyTempReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getBarChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setBarChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Ls02;", "itemDecoration", "Ls02;", "Lvnq;", "La52;", "yAxis", "Lvnq;", "Lvqr;", "xAxis", "Lvqr;", "Lr02;", "barChartAttrs", "Lr02;", "Lcom/xiaomi/fitness/health/temperature/ui/TemperatureDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/health/temperature/ui/TemperatureDataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/health/temperature/ui/TemperatureDataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/health/temperature/ui/TemperatureDataTitleView;)V", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barChartEntries", "Ljava/util/List;", "Lq02;", "barChartAdapter", "Lq02;", "viewSpace", "getViewSpace", "setViewSpace", "tempTrendLayout", "getTempTrendLayout", "setTempTrendLayout", "Landroid/widget/LinearLayout;", "emptyView", "Landroid/widget/LinearLayout;", "getEmptyView", "()Landroid/widget/LinearLayout;", "setEmptyView", "(Landroid/widget/LinearLayout;)V", "Landroid/widget/FrameLayout;", "trendChartView", "Landroid/widget/FrameLayout;", "getTrendChartView", "()Landroid/widget/FrameLayout;", "setTrendChartView", "(Landroid/widget/FrameLayout;)V", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "getLineChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "setLineChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;)V", "tempTrendTitleLayout", "getTempTrendTitleLayout", "setTempTrendTitleLayout", "Landroid/widget/TextView;", "tempTrendSymbolView", "Landroid/widget/TextView;", "getTempTrendSymbolView", "()Landroid/widget/TextView;", "setTempTrendSymbolView", "(Landroid/widget/TextView;)V", "tempTrendDiffView", "getTempTrendDiffView", "setTempTrendDiffView", "tempTrendDescView", "getTempTrendDescView", "setTempTrendDescView", "Lufe;", "mLineChartAdapter", "Lufe;", "mChartEntries", "Lyfe;", "mItemDecoration", "Lyfe;", "Lrtr;", "mYAxis", "Lrtr;", "mXAxis", "Lvfe;", "lineChartAttrs", "Lvfe;", "trendViewSpace", "getTrendViewSpace", "setTrendViewSpace", "Ljava/util/TreeMap;", "", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "recordMap", "Ljava/util/TreeMap;", "leftTime", "Ljava/lang/Long;", "rightTime", "Landroidx/recyclerview/widget/RecyclerView;", "detailRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getDetailRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setDetailRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "detailAdapter", "Lopo;", "Lqpo;", "dataDetailList", "understandCard", "getUnderstandCard", "setUnderstandCard", "", "getViewTag", "()Ljava/lang/String;", CloudContract.COL_VIEW_TAG, "", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTemperatureBaseWeekMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureBaseWeekMonthFragment.kt\ncom/xiaomi/fitness/health/temperature/ui/TemperatureBaseWeekMonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,524:1\n1863#2,2:525\n1863#2,2:527\n*S KotlinDebug\n*F\n+ 1 TemperatureBaseWeekMonthFragment.kt\ncom/xiaomi/fitness/health/temperature/ui/TemperatureBaseWeekMonthFragment\n*L\n171#1:525,2\n182#1:527,2\n*E\n"})
public abstract class TemperatureBaseWeekMonthFragment<VM extends TemperatureViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "TemperatureWm";

    @Nullable
    private q02<RecyclerBarEntry> barChartAdapter;

    @Nullable
    private r02 barChartAttrs;

    @Nullable
    private List<RecyclerBarEntry> barChartEntries;

    @Nullable
    private BarChartRecyclerView barChartRecyclerView;

    @Nullable
    private View containerView;

    @Nullable
    private LocalDate currentLocalDate;

    @Nullable
    private DailyTempReport dailyTempReport;

    @Nullable
    private List<qpo> dataDetailList;

    @Nullable
    private TemperatureDataTitleView dataTitleView;

    @Nullable
    private opo detailAdapter;

    @Nullable
    private RecyclerView detailRecyclerView;

    @Nullable
    private LinearLayout emptyView;

    @Nullable
    private s02 itemDecoration;

    @Nullable
    private Long leftTime;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @NotNull
    private TreeMap<Long, TemperatureTrendItem> recordMap;

    @Nullable
    private Long rightTime;

    @Nullable
    private TextView tempTrendDescView;

    @Nullable
    private TextView tempTrendDiffView;

    @Nullable
    private View tempTrendLayout;

    @Nullable
    private TextView tempTrendSymbolView;

    @Nullable
    private LinearLayout tempTrendTitleLayout;

    @Nullable
    private FrameLayout trendChartView;

    @Nullable
    private View trendViewSpace;

    @Nullable
    private View understandCard;

    @Nullable
    private View viewSpace;

    @Nullable
    private vqr xAxis;

    @Nullable
    private vnq<a52> yAxis;

    public TemperatureBaseWeekMonthFragment() {
        final Function2 function2 = new Function2() { // from class: s2p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(TemperatureBaseWeekMonthFragment.recordMap$lambda$0(((Long) obj).longValue(), ((Long) obj2).longValue()));
            }
        };
        this.recordMap = new TreeMap<>(new Comparator() { // from class: t2p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TemperatureBaseWeekMonthFragment.recordMap$lambda$1(function2, obj, obj2);
            }
        });
    }

    private final String getViewTag() {
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition != 0) {
            return fragmentPosition != 1 ? "months" : "weeks";
        }
        return "days";
    }

    private final void initBarChartRecyclerView() {
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.barChartAttrs = (r02) barChartRecyclerView.mAttrs;
        this.barChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.barChartAttrs);
        vnq<a52> vnqVar = new vnq<>(this.barChartAttrs);
        this.yAxis = vnqVar;
        Intrinsics.checkNotNull(vnqVar);
        vnqVar.setValueFormatter(new vx5(1));
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        vnq<a52> vnqVar2 = this.yAxis;
        Intrinsics.checkNotNull(vnqVar2);
        temperatureDataUtil.updateTempYAxis(vnqVar2, null, null, null);
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        vqr vqrVar = new vqr(r02Var, r02Var.c);
        this.xAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        vqrVar.setValueFormatter(barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition()));
        this.itemDecoration = new s02(this.yAxis, this.xAxis, this.barChartAttrs);
        k3p k3pVar = new k3p(getMActivity(), false);
        s02 s02Var = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(k3pVar);
        BarChartRecyclerView barChartRecyclerView2 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var2 = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView2.addItemDecoration(s02Var2);
        this.barChartAdapter = new q02<>(getMActivity(), this.barChartEntries, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, k3pVar);
        BarChartRecyclerView barChartRecyclerView3 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.barChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.barChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.temperature.ui.TemperatureBaseWeekMonthFragment$initBarChartRecyclerView$itemGestureListener$1
            final /* synthetic */ TemperatureBaseWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    TemperatureDataTitleView dataTitleView = this.this$0.getDataTitleView();
                    if (dataTitleView != null) {
                        dataTitleView.c(false);
                        return;
                    }
                    return;
                }
                TemperatureDataTitleView dataTitleView2 = this.this$0.getDataTitleView();
                if (dataTitleView2 != null) {
                    dataTitleView2.c(true);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    private final void initBundle() {
        LocalDate firstDayOfMonth;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            firstDayOfMonth = getFragmentPosition() == 1 ? TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(iIntValue)) : TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(iIntValue));
            if (firstDayOfMonth == null) {
                if (getFragmentPosition() == 1) {
                    firstDayOfMonth = TimeDateUtil.getWeekMonday(LocalDate.now());
                } else {
                    firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
                }
            }
        } else if (getFragmentPosition() == 1) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(LocalDate.now());
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
        }
        this.currentLocalDate = firstDayOfMonth;
    }

    private final void initDetailRecyclerView() {
        this.dataDetailList = new ArrayList();
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.detailRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.detailAdapter = new opo(getMActivity(), this.dataDetailList, getString(c0j.K6), pni.H3);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.detailRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.detailAdapter);
        RecyclerView recyclerView3 = this.detailRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initTrendChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.lineChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        vfeVar.a0 = true;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.lineChartAttrs);
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        rtr rtrVarF = rtr.f(vfeVar2, 60.0f, 3);
        this.mYAxis = rtrVarF;
        Intrinsics.checkNotNull(rtrVarF);
        rtrVarF.setValueFormatter(new TempTrendYValueFormatter());
        rtr rtrVar = this.mYAxis;
        if (rtrVar != null) {
            rtrVar.f = 5;
        }
        vfe vfeVar3 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar3);
        vqr vqrVar = new vqr(vfeVar3, vfeVar3.c, new arr(getContext()));
        this.mXAxis = vqrVar;
        this.mItemDecoration = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        TempTrendHighLightMarkValueFormatter tempTrendHighLightMarkValueFormatter = new TempTrendHighLightMarkValueFormatter(getMActivity());
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(tempTrendHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        lineChartRecyclerView2.addItemDecoration(yfeVar2);
        this.mLineChartAdapter = new ufe<>(getActivity(), this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, tempTrendHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.lineChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.temperature.ui.TemperatureBaseWeekMonthFragment$initTrendChartRecyclerView$itemGestureListener$1
            private boolean isRightScrollInner;
            final /* synthetic */ TemperatureBaseWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    LinearLayout tempTrendTitleLayout = this.this$0.getTempTrendTitleLayout();
                    if (tempTrendTitleLayout != null) {
                        ViewExtKt.visible(tempTrendTitleLayout);
                        return;
                    }
                    return;
                }
                LinearLayout tempTrendTitleLayout2 = this.this$0.getTempTrendTitleLayout();
                if (tempTrendTitleLayout2 != null) {
                    ExtUtilKt.invisible(tempTrendTitleLayout2);
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                this.isRightScrollInner = dx < 0;
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.lineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: u2p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TemperatureBaseWeekMonthFragment.initUnderstandCard$lambda$6(this.f35317a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$6(TemperatureBaseWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandTemperatureFragment.class, null);
    }

    private final void initView() {
        initBarChartRecyclerView();
        initDetailRecyclerView();
        initUnderstandCard();
        initTrendChartRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int recordMap$lambda$0(long j, long j2) {
        return Intrinsics.compare(j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int recordMap$lambda$1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void refreshBarChart() {
        DailyTempReport dailyTempReport = this.dailyTempReport;
        if (dailyTempReport == null) {
            LocalDate localDate = this.currentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyTempReport = new DailyTempReport(TimeDateUtil.changZeroOfTheDay(localDate), getViewTag());
        }
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        List<TemperatureEntry> listFillWeekMonthBarEntries = temperatureDataUtil.fillWeekMonthBarEntries(dailyTempReport, r02Var, getFragmentPosition() == 1);
        List<RecyclerBarEntry> list = this.barChartEntries;
        if (list != null) {
            list.clear();
        }
        List<RecyclerBarEntry> list2 = this.barChartEntries;
        if (list2 != null) {
            list2.addAll(listFillWeekMonthBarEntries);
        }
        vnq<a52> vnqVar = this.yAxis;
        Intrinsics.checkNotNull(vnqVar);
        temperatureDataUtil.updateTempYAxis(vnqVar, dailyTempReport.getBodyTempRecords(), dailyTempReport.getSkinTempRecords(), listFillWeekMonthBarEntries);
        s02 s02Var = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.yAxis);
        q02<RecyclerBarEntry> q02Var = this.barChartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.setYAxis(this.yAxis);
        q02<RecyclerBarEntry> q02Var2 = this.barChartAdapter;
        if (q02Var2 != null) {
            q02Var2.notifyDataSetChanged();
        }
    }

    private final void refreshDataTitle() {
        DailyTempReport dailyTempReport = this.dailyTempReport;
        if (dailyTempReport == null) {
            View view = this.viewSpace;
            if (view != null) {
                ViewExtKt.setVisible(view, false);
            }
            TemperatureDataTitleView temperatureDataTitleView = this.dataTitleView;
            if (temperatureDataTitleView != null) {
                temperatureDataTitleView.d(getString(c0j.L6));
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(dailyTempReport);
        float avgBodyTemp = dailyTempReport.getAvgBodyTemp();
        DailyTempReport dailyTempReport2 = this.dailyTempReport;
        Intrinsics.checkNotNull(dailyTempReport2);
        float avgSkinTemp = dailyTempReport2.getAvgSkinTemp();
        String string = getFragmentPosition() == 1 ? getString(c0j.un) : getString(c0j.mn);
        Intrinsics.checkNotNull(string);
        boolean z = avgBodyTemp > 0.0f;
        boolean z2 = avgSkinTemp > 0.0f;
        if (!z && !z2) {
            View view2 = this.viewSpace;
            if (view2 != null) {
                ViewExtKt.setVisible(view2, false);
            }
            TemperatureDataTitleView temperatureDataTitleView2 = this.dataTitleView;
            if (temperatureDataTitleView2 != null) {
                temperatureDataTitleView2.d(getString(c0j.L6));
                return;
            }
            return;
        }
        View view3 = this.viewSpace;
        if (view3 != null) {
            ViewExtKt.setVisible(view3, true);
        }
        TemperatureDataTitleView temperatureDataTitleView3 = this.dataTitleView;
        if (temperatureDataTitleView3 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArr = new Object[2];
            objArr[0] = avgBodyTemp > 0.0f ? TemperatureDataUtil.INSTANCE.formatTemperature(avgBodyTemp) : "--";
            objArr[1] = getString(c0j.hn);
            String str = String.format("%s%s", Arrays.copyOf(objArr, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            temperatureDataTitleView3.a(z, string, str);
        }
        TemperatureDataTitleView temperatureDataTitleView4 = this.dataTitleView;
        if (temperatureDataTitleView4 != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] objArr2 = new Object[2];
            objArr2[0] = avgSkinTemp > 0.0f ? TemperatureDataUtil.INSTANCE.formatTemperature(avgSkinTemp) : "--";
            objArr2[1] = getString(c0j.hn);
            String str2 = String.format("%s%s", Arrays.copyOf(objArr2, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            temperatureDataTitleView4.b(z2, string, str2);
        }
    }

    private final void refreshDetailCard() {
        if (this.dailyTempReport == null) {
            RecyclerView recyclerView = this.detailRecyclerView;
            if (recyclerView != null) {
                ViewExtKt.setVisible(recyclerView, false);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.detailRecyclerView;
        if (recyclerView2 != null) {
            ViewExtKt.setVisible(recyclerView2, true);
        }
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DailyTempReport dailyTempReport = this.dailyTempReport;
        Intrinsics.checkNotNull(dailyTempReport);
        List<qpo> listCreateSummaryViewModelList = temperatureDataUtil.createSummaryViewModelList(contextRequireContext, dailyTempReport);
        if (ArrayUtils.isEmpty(listCreateSummaryViewModelList)) {
            RecyclerView recyclerView3 = this.detailRecyclerView;
            if (recyclerView3 != null) {
                ViewExtKt.setVisible(recyclerView3, false);
                return;
            }
            return;
        }
        List<qpo> list = this.dataDetailList;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<qpo> list2 = this.dataDetailList;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateSummaryViewModelList);
        opo opoVar = this.detailAdapter;
        Intrinsics.checkNotNull(opoVar);
        DailyTempReport dailyTempReport2 = this.dailyTempReport;
        Intrinsics.checkNotNull(dailyTempReport2);
        opoVar.setHeaderViewTitle(qpo.a(dailyTempReport2.getTag()));
        opo opoVar2 = this.detailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }

    private final void refreshView() {
        List<MaxMinEntry> list = this.mChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<MaxMinEntry> listBuildEntries = buildEntries();
        List<MaxMinEntry> list2 = this.mChartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listBuildEntries);
        TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
        float fMax = Math.max(Math.abs(temperatureDataUtil.getTempTrendMaxValue(this.mChartEntries)), Math.abs(temperatureDataUtil.getTempTrendMinValue(this.mChartEntries)));
        float f = 10;
        float fCeil = ((float) Math.ceil((0.1f + fMax) * f)) / f;
        if (fMax < 0.3d) {
            fCeil = 0.3f;
        }
        float f2 = -fCeil;
        Logger.i(TAG, "yMax:" + fCeil + ", yMin:" + f2);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtr rtrVarK = rtrVar.k(this.mYAxis, fCeil, f2);
        this.mYAxis = rtrVarK;
        Intrinsics.checkNotNull(rtrVarK);
        rtrVarK.d(4, 10);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vfeVar.E = fCeil;
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        vfeVar2.F = f2;
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar);
        ufeVar.setYAxis(this.mYAxis);
        TempTrendHighLightMarkValueFormatter tempTrendHighLightMarkValueFormatter = new TempTrendHighLightMarkValueFormatter(getMActivity());
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setHighLightValueFormatter(tempTrendHighLightMarkValueFormatter);
        ufe<MaxMinEntry> ufeVar2 = this.mLineChartAdapter;
        if (ufeVar2 != null) {
            ufeVar2.setValueFormatter(tempTrendHighLightMarkValueFormatter);
        }
        ufe<MaxMinEntry> ufeVar3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar3);
        ufeVar3.notifyDataSetChanged();
    }

    private final void refreshViewOnReportChanged() {
        DailyTempReport dailyTempReport = this.dailyTempReport;
        Logger.i(TAG, "refresh TemperatureReport .. " + (dailyTempReport != null ? dailyTempReport.toString() : null));
        refreshBarChart();
        refreshDataTitle();
        refreshDetailCard();
    }

    private final void requestData() {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        this.dailyTempReport = null;
        LocalDate localDate = this.currentLocalDate;
        Intrinsics.checkNotNull(localDate);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDate);
        Logger.i(TAG, "start request device data.." + this.currentLocalDate + "/params start:" + jChangZeroOfTheDay);
        getMViewModel().triggerFetchFitnessReport(ITemperatureRepository.class, getViewTag(), jChangZeroOfTheDay, 0, 0, "").observe(getViewLifecycleOwner(), new TemperatureBaseWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q2p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TemperatureBaseWeekMonthFragment.requestData$lambda$2(this.f31026a, (List) obj);
            }
        }));
        getMViewModel().getTemperatureTrendData().observe(getViewLifecycleOwner(), new TemperatureBaseWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: r2p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TemperatureBaseWeekMonthFragment.requestData$lambda$5(this.f32123a, (List) obj);
            }
        }));
        if (!CurseManager.INSTANCE.getInstance().supportMenstrualPredict()) {
            View view = this.tempTrendLayout;
            if (view != null) {
                ViewExtKt.setVisible(view, false);
                return;
            }
            return;
        }
        if (getFragmentPosition() == 1) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(this.currentLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(this.currentLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        getMViewModel().queryTemperatureTrend(TimeDateUtil.changZeroOfTheDay(firstDayOfMonth), TimeDateUtil.changZeroOfTheDay(localDatePlusMonths));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$2(TemperatureBaseWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.dailyTempReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyTempReport) {
                this$0.dailyTempReport = (DailyTempReport) dailyBasicReport;
            }
        }
        this$0.refreshViewOnReportChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$5(TemperatureBaseWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list.isEmpty()) {
            LinearLayout linearLayout = this$0.emptyView;
            if (linearLayout != null) {
                ViewExtKt.setVisible(linearLayout, true);
            }
            FrameLayout frameLayout = this$0.trendChartView;
            if (frameLayout != null) {
                ViewExtKt.setVisible(frameLayout, false);
            }
        } else {
            LinearLayout linearLayout2 = this$0.emptyView;
            if (linearLayout2 != null) {
                ViewExtKt.setVisible(linearLayout2, false);
            }
            FrameLayout frameLayout2 = this$0.trendChartView;
            if (frameLayout2 != null) {
                ViewExtKt.setVisible(frameLayout2, true);
            }
            Intrinsics.checkNotNull(list);
            List<TemperatureTrendItem> list2 = list;
            for (TemperatureTrendItem temperatureTrendItem : list2) {
                this$0.recordMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(temperatureTrendItem.getTime())), temperatureTrendItem);
            }
            this$0.leftTime = this$0.recordMap.firstKey();
            this$0.rightTime = this$0.recordMap.lastKey();
            Long l = this$0.leftTime;
            Intrinsics.checkNotNull(l);
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(l.longValue());
            Long l2 = this$0.rightTime;
            Intrinsics.checkNotNull(l2);
            Logger.i(TAG, "temperatureTrendData leftTime:" + localDateTimestampToLocalDate + "/rightTime" + TimeDateUtil.timestampToLocalDate(l2.longValue()));
            Iterator it = list2.iterator();
            float diffTemp = 0.0f;
            while (it.hasNext()) {
                diffTemp += ((TemperatureTrendItem) it.next()).getDiffTemp();
            }
            Logger.i(TAG, "temperatureTrendData totalDiff:" + diffTemp);
            String str = new DecimalFormat("#.##").format(Float.valueOf(diffTemp == 0.0f ? 0.0f : diffTemp / list.size()));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            float f = Float.parseFloat(str);
            if (f < 0.0f) {
                TextView textView = this$0.tempTrendSymbolView;
                if (textView != null) {
                    textView.setText("-");
                }
            } else {
                TextView textView2 = this$0.tempTrendSymbolView;
                if (textView2 != null) {
                    textView2.setText(Marker.ANY_NON_NULL_MARKER);
                }
            }
            TextView textView3 = this$0.tempTrendDiffView;
            if (textView3 != null) {
                textView3.setText(Math.abs(f) + "°C");
            }
            TextView textView4 = this$0.tempTrendDescView;
            if (textView4 != null) {
                textView4.setText(this$0.getString(this$0.getFragmentPosition() == 1 ? c0j.an : c0j.Zm));
            }
            this$0.refreshView();
        }
        return Unit.INSTANCE;
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.detailAdapter == null || (recyclerView = this.detailRecyclerView) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.detailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
    }

    @NotNull
    public final List<MaxMinEntry> buildEntries() {
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition == 1) {
            LocalDate weekMonday = TimeDateUtil.getWeekMonday(this.currentLocalDate);
            LocalDate localDatePlusWeeks = weekMonday.plusWeeks(1);
            TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
            TreeMap<Long, TemperatureTrendItem> treeMap = this.recordMap;
            Intrinsics.checkNotNull(localDatePlusWeeks);
            vfe vfeVar = this.lineChartAttrs;
            Intrinsics.checkNotNull(vfeVar);
            return temperatureDataUtil.createTempTrendData(treeMap, weekMonday, localDatePlusWeeks, true, vfeVar);
        }
        if (fragmentPosition != 2) {
            List<MaxMinEntry> listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return listEmptyList;
        }
        LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(this.currentLocalDate);
        LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        TemperatureDataUtil temperatureDataUtil2 = TemperatureDataUtil.INSTANCE;
        TreeMap<Long, TemperatureTrendItem> treeMap2 = this.recordMap;
        Intrinsics.checkNotNull(localDatePlusMonths);
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        return temperatureDataUtil2.createTempTrendData(treeMap2, firstDayOfMonth, localDatePlusMonths, false, vfeVar2);
    }

    @Nullable
    public final BarChartRecyclerView getBarChartRecyclerView() {
        return this.barChartRecyclerView;
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final TemperatureDataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    @Nullable
    public final RecyclerView getDetailRecyclerView() {
        return this.detailRecyclerView;
    }

    @Nullable
    public final LinearLayout getEmptyView() {
        return this.emptyView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final LineChartRecyclerView getLineChartRecyclerView() {
        return this.lineChartRecyclerView;
    }

    @Nullable
    public final TextView getTempTrendDescView() {
        return this.tempTrendDescView;
    }

    @Nullable
    public final TextView getTempTrendDiffView() {
        return this.tempTrendDiffView;
    }

    @Nullable
    public final View getTempTrendLayout() {
        return this.tempTrendLayout;
    }

    @Nullable
    public final TextView getTempTrendSymbolView() {
        return this.tempTrendSymbolView;
    }

    @Nullable
    public final LinearLayout getTempTrendTitleLayout() {
        return this.tempTrendTitleLayout;
    }

    @Nullable
    public final FrameLayout getTrendChartView() {
        return this.trendChartView;
    }

    @Nullable
    public final View getTrendViewSpace() {
        return this.trendViewSpace;
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    @Nullable
    public final View getViewSpace() {
        return this.viewSpace;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        initViewBinding();
        initView();
        requestData();
    }

    public final void setBarChartRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.barChartRecyclerView = barChartRecyclerView;
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable TemperatureDataTitleView temperatureDataTitleView) {
        this.dataTitleView = temperatureDataTitleView;
    }

    public final void setDetailRecyclerView(@Nullable RecyclerView recyclerView) {
        this.detailRecyclerView = recyclerView;
    }

    public final void setEmptyView(@Nullable LinearLayout linearLayout) {
        this.emptyView = linearLayout;
    }

    public final void setLineChartRecyclerView(@Nullable LineChartRecyclerView lineChartRecyclerView) {
        this.lineChartRecyclerView = lineChartRecyclerView;
    }

    public final void setTempTrendDescView(@Nullable TextView textView) {
        this.tempTrendDescView = textView;
    }

    public final void setTempTrendDiffView(@Nullable TextView textView) {
        this.tempTrendDiffView = textView;
    }

    public final void setTempTrendLayout(@Nullable View view) {
        this.tempTrendLayout = view;
    }

    public final void setTempTrendSymbolView(@Nullable TextView textView) {
        this.tempTrendSymbolView = textView;
    }

    public final void setTempTrendTitleLayout(@Nullable LinearLayout linearLayout) {
        this.tempTrendTitleLayout = linearLayout;
    }

    public final void setTrendChartView(@Nullable FrameLayout frameLayout) {
        this.trendChartView = frameLayout;
    }

    public final void setTrendViewSpace(@Nullable View view) {
        this.trendViewSpace = view;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }

    public final void setViewSpace(@Nullable View view) {
        this.viewSpace = view;
    }
}
