package com.xiaomi.fitness.health.hrm;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.distribute.DailyHrDistribute;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.AbnormalDataUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.DayRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.RateHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.hrm.HrmDayWeekMonthFragment;
import com.xiaomi.fitness.health.hrm.HrmViewModel;
import com.xiaomi.fitness.health.sleep.ui.SleepHrmDetailFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.heartrate.export.HeartrateExportExtKt;
import com.xiaomi.fitness.heartrate.export.HeartrateMeasurer;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.HrmDataUtil;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import com.xiaomi.fitness.widget.distribute.HrmDistribute;
import com.xiaomi.fitness.widget.view.CardStyleSetView;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.cx;
import defpackage.hak;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.sf2;
import defpackage.sz6;
import defpackage.ubj;
import defpackage.uz6;
import defpackage.vqr;
import defpackage.xcm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 ²\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002²\u0001B\b¢\u0006\u0005\b±\u0001\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ5\u0010$\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ!\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J+\u00106\u001a\u0002052\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102012\f\u00104\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H&¢\u0006\u0004\b8\u0010\bR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR \u0010e\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR$\u0010h\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010n\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010u\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001e\u0010}\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010fR%\u0010~\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010v\u001a\u0004\b\u007f\u0010x\"\u0005\b\u0080\u0001\u0010zR\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R!\u0010\u0085\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010fR(\u0010\u0086\u0001\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010v\u001a\u0005\b\u0087\u0001\u0010x\"\u0005\b\u0088\u0001\u0010zR\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010|R \u0010\u008a\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010fR \u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010fR(\u0010\u008c\u0001\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010v\u001a\u0005\b\u008d\u0001\u0010x\"\u0005\b\u008e\u0001\u0010zR\u001a\u0010\u008f\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010|R \u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010fR \u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010fR(\u0010\u0092\u0001\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010v\u001a\u0005\b\u0093\u0001\u0010x\"\u0005\b\u0094\u0001\u0010zR\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010|R \u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010fR \u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010fR\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R,\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R,\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R)\u0010ª\u0001\u001a\u0012\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030©\u000101\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0019\u0010¬\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0017\u0010°\u0001\u001a\u00020\u00118$X¤\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001¨\u0006³\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrmDayWeekMonthFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewIfNeed", "refreshAbnormalFibCard", "refreshAbnormalHighHrmCard", "refreshPhoneRecordCard", "refreshDistributeCard", "refreshAbnormalLowHrmCard", "refreshDetailCard", "refreshBarChart", "", "position", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "hrmReport", "", "getTitleDesc", "(ILcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)Ljava/lang/String;", "getTitleHrValue", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)I", "initView", "initAbnormalFibCard", "initAbnormalHighHrmCard", "initAbnormalLowHrmCard", "", "Lqpo;", "adapterList", "srcList", "Lopo;", "adapter", "setAbnormalFold", "(Ljava/util/List;Ljava/util/List;Lopo;)V", "initDetailCard", "initDistributeCard", "initBarChart", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "list1", "list2", "", "areListsEqual", "(Ljava/util/List;Ljava/util/List;)Z", "initViewBinding", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "recyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lr02;", "mBarChartAttrs", "Lr02;", "Ls02;", "mItemDecoration", "Ls02;", "Lubj;", "Lsf2;", "mBarChartAdapter", "Lubj;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "displayNumber", "I", "mEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/widget/view/CardStyleSetView;", "hrmPhoneRecordCard", "Lcom/xiaomi/fitness/widget/view/CardStyleSetView;", "getHrmPhoneRecordCard", "()Lcom/xiaomi/fitness/widget/view/CardStyleSetView;", "setHrmPhoneRecordCard", "(Lcom/xiaomi/fitness/widget/view/CardStyleSetView;)V", "oneTrackReportData", "Ljava/lang/String;", "getOneTrackReportData", "()Ljava/lang/String;", "setOneTrackReportData", "(Ljava/lang/String;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mRateDetailAdapter", "Lopo;", "mDataListRateDetail", "recyclerRateDistribute", "getRecyclerRateDistribute", "setRecyclerRateDistribute", "Lsz6;", "mDistributeAdapter", "Lsz6;", "Luz6;", "mDataListDistribute", "lowHrmRecycler", "getLowHrmRecycler", "setLowHrmRecycler", "lowHrmAdapter", "lowHrmDataAdapterList", "lowHrmDataSrcList", "highHrmRecycler", "getHighHrmRecycler", "setHighHrmRecycler", "highHrmAdapter", "highHrmDataAdapterList", "highHrmDataSrcList", "abnormalFibRecycler", "getAbnormalFibRecycler", "setAbnormalFibRecycler", "abnormalFibAdapter", "abnormalFibDataAdapterList", "abnormalFibDataSrcList", "mDailyHrmReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "Lcom/xiaomi/fitness/view/CardUnderstandView;", "mUnderstandView", "Lcom/xiaomi/fitness/view/CardUnderstandView;", "getMUnderstandView", "()Lcom/xiaomi/fitness/view/CardUnderstandView;", "setMUnderstandView", "(Lcom/xiaomi/fitness/view/CardUnderstandView;)V", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "getHealthBannerCardSetView", "()Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "setHealthBannerCardSetView", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;)V", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "reportLiveData", "Landroidx/lifecycle/LiveData;", "autoFoldAbnormalRecycler", "Z", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class HrmDayWeekMonthFragment<VM extends HrmViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:hrm";

    @Nullable
    private opo abnormalFibAdapter;

    @Nullable
    private List<qpo> abnormalFibDataAdapterList;

    @Nullable
    private List<qpo> abnormalFibDataSrcList;

    @Nullable
    private RecyclerView abnormalFibRecycler;

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;
    private int displayNumber;

    @Nullable
    private HealthBannerCardSetView healthBannerCardSetView;

    @Nullable
    private opo highHrmAdapter;

    @Nullable
    private List<qpo> highHrmDataAdapterList;

    @Nullable
    private List<qpo> highHrmDataSrcList;

    @Nullable
    private RecyclerView highHrmRecycler;

    @Nullable
    private CardStyleSetView hrmPhoneRecordCard;

    @Nullable
    private opo lowHrmAdapter;

    @Nullable
    private List<qpo> lowHrmDataAdapterList;

    @Nullable
    private List<qpo> lowHrmDataSrcList;

    @Nullable
    private RecyclerView lowHrmRecycler;

    @Nullable
    private ubj<sf2> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DailyHrReport mDailyHrmReport;

    @Nullable
    private List<uz6> mDataListDistribute;

    @Nullable
    private List<qpo> mDataListRateDetail;

    @Nullable
    private sz6 mDistributeAdapter;

    @Nullable
    private List<SegmentBarEntry> mEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private opo mRateDetailAdapter;

    @Nullable
    private CardUnderstandView mUnderstandView;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private RecyclerView recyclerRateDistribute;

    @Nullable
    private BarChartRecyclerView recyclerView;

    @Nullable
    private LiveData<List<DailyBasicReport>> reportLiveData;

    @Nullable
    private onq valueFormatter;

    @NotNull
    private String oneTrackReportData = "0";
    private boolean autoFoldAbnormalRecycler = true;

    private final String getTitleDesc(int position, DailyHrReport hrmReport) {
        if (position == 0) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            if (TimeDateUtil.isSameLocalDate(localDateNow, TimeDateUtil.timestampToLocalDate(hrmReport.getTime()))) {
                HrItem latestHrRecord = hrmReport.getLatestHrRecord();
                if (latestHrRecord == null) {
                    return "";
                }
                return TimeDateUtil.getDateMMddFormat(latestHrRecord.getTime()) + " " + TimeDateUtil.getDateHHmm24Format(latestHrRecord.getTime());
            }
        }
        Intrinsics.checkNotNull(hrmReport);
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(hrmReport.getTime());
        if (position == 0) {
            return TimeDateUtil.getDateYYYYMMddLocalFormat(localDateTimestampToLocalDate);
        }
        if (position != 1) {
            return position != 2 ? "" : TimeDateUtil.getDateYYYYMMLocalFormat(localDateTimestampToLocalDate);
        }
        return HealthUtil.getWeekDateStr(localDateTimestampToLocalDate);
    }

    private final int getTitleHrValue(DailyHrReport hrmReport) {
        if (getFragmentPosition() == 0) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            if (TimeDateUtil.isSameLocalDate(localDateNow, TimeDateUtil.timestampToLocalDate(hrmReport.getTime()))) {
                HrItem latestHrRecord = hrmReport.getLatestHrRecord();
                if ((latestHrRecord != null ? Integer.valueOf(latestHrRecord.getHr()) : null) == null) {
                    return 0;
                }
                HrItem latestHrRecord2 = hrmReport.getLatestHrRecord();
                Integer numValueOf = latestHrRecord2 != null ? Integer.valueOf(latestHrRecord2.getHr()) : null;
                Intrinsics.checkNotNull(numValueOf);
                return numValueOf.intValue();
            }
        }
        hrmReport.getAvgHr();
        return hrmReport.getAvgHr();
    }

    private final void initAbnormalFibCard() {
        if (getFragmentPosition() != 0) {
            return;
        }
        this.abnormalFibDataAdapterList = new ArrayList();
        this.abnormalFibDataSrcList = new ArrayList();
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.abnormalFibRecycler;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(bl5Var);
        }
        this.abnormalFibAdapter = new opo(getMActivity(), this.abnormalFibDataAdapterList, c0j.c9, pni.q0);
        RecyclerView recyclerView2 = this.abnormalFibRecycler;
        if (recyclerView2 != null) {
            HealthUtil healthUtil = HealthUtil.INSTANCE;
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            opo opoVar = this.abnormalFibAdapter;
            Intrinsics.checkNotNull(opoVar);
            recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
        }
        opo opoVar2 = this.abnormalFibAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.setOnItemClickListener(new opo.e(this) { // from class: com.xiaomi.fitness.health.hrm.HrmDayWeekMonthFragment.initAbnormalFibCard.1
            final /* synthetic */ HrmDayWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // opo.e
            public void onBottomClick(boolean fold) {
                if (fold) {
                    List list = ((HrmDayWeekMonthFragment) this.this$0).abnormalFibDataAdapterList;
                    if (list != null) {
                        list.clear();
                    }
                    List list2 = ((HrmDayWeekMonthFragment) this.this$0).abnormalFibDataAdapterList;
                    if (list2 != null) {
                        List list3 = ((HrmDayWeekMonthFragment) this.this$0).abnormalFibDataSrcList;
                        Intrinsics.checkNotNull(list3);
                        list2.addAll(list3);
                    }
                    opo opoVar3 = ((HrmDayWeekMonthFragment) this.this$0).abnormalFibAdapter;
                    Intrinsics.checkNotNull(opoVar3);
                    opoVar3.p(c0j.E4, false);
                } else {
                    HrmDayWeekMonthFragment<VM, VDB> hrmDayWeekMonthFragment = this.this$0;
                    List list4 = ((HrmDayWeekMonthFragment) hrmDayWeekMonthFragment).abnormalFibDataAdapterList;
                    Intrinsics.checkNotNull(list4);
                    List list5 = ((HrmDayWeekMonthFragment) this.this$0).abnormalFibDataSrcList;
                    Intrinsics.checkNotNull(list5);
                    hrmDayWeekMonthFragment.setAbnormalFold(list4, list5, ((HrmDayWeekMonthFragment) this.this$0).abnormalFibAdapter);
                }
                opo opoVar4 = ((HrmDayWeekMonthFragment) this.this$0).abnormalFibAdapter;
                Intrinsics.checkNotNull(opoVar4);
                opoVar4.notifyDataChanged();
            }

            @Override // opo.e
            public void onClick(qpo model, int position) {
            }

            @Override // opo.e
            public /* bridge */ /* synthetic */ void onHeaderClick() {
                super.onHeaderClick();
            }
        });
        RecyclerView recyclerView3 = this.abnormalFibRecycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.abnormalFibAdapter);
        }
        RecyclerView recyclerView4 = this.abnormalFibRecycler;
        if (recyclerView4 != null) {
            recyclerView4.setHasFixedSize(true);
        }
    }

    private final void initAbnormalHighHrmCard() {
        if (getFragmentPosition() != 0) {
            return;
        }
        this.highHrmDataAdapterList = new ArrayList();
        this.highHrmDataSrcList = new ArrayList();
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.highHrmRecycler;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(bl5Var);
        }
        this.highHrmAdapter = new opo(getMActivity(), this.highHrmDataAdapterList, c0j.a9, pni.q0);
        RecyclerView recyclerView2 = this.highHrmRecycler;
        if (recyclerView2 != null) {
            HealthUtil healthUtil = HealthUtil.INSTANCE;
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            opo opoVar = this.highHrmAdapter;
            Intrinsics.checkNotNull(opoVar);
            recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
        }
        opo opoVar2 = this.highHrmAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.setOnItemClickListener(new opo.e(this) { // from class: com.xiaomi.fitness.health.hrm.HrmDayWeekMonthFragment.initAbnormalHighHrmCard.1
            final /* synthetic */ HrmDayWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // opo.e
            public void onBottomClick(boolean fold) {
                if (fold) {
                    List list = ((HrmDayWeekMonthFragment) this.this$0).highHrmDataAdapterList;
                    if (list != null) {
                        list.clear();
                    }
                    List list2 = ((HrmDayWeekMonthFragment) this.this$0).highHrmDataAdapterList;
                    if (list2 != null) {
                        List list3 = ((HrmDayWeekMonthFragment) this.this$0).highHrmDataSrcList;
                        Intrinsics.checkNotNull(list3);
                        list2.addAll(list3);
                    }
                    opo opoVar3 = ((HrmDayWeekMonthFragment) this.this$0).highHrmAdapter;
                    Intrinsics.checkNotNull(opoVar3);
                    opoVar3.p(c0j.E4, false);
                } else {
                    HrmDayWeekMonthFragment<VM, VDB> hrmDayWeekMonthFragment = this.this$0;
                    List list4 = ((HrmDayWeekMonthFragment) hrmDayWeekMonthFragment).highHrmDataAdapterList;
                    Intrinsics.checkNotNull(list4);
                    List list5 = ((HrmDayWeekMonthFragment) this.this$0).highHrmDataSrcList;
                    Intrinsics.checkNotNull(list5);
                    hrmDayWeekMonthFragment.setAbnormalFold(list4, list5, ((HrmDayWeekMonthFragment) this.this$0).highHrmAdapter);
                }
                opo opoVar4 = ((HrmDayWeekMonthFragment) this.this$0).highHrmAdapter;
                Intrinsics.checkNotNull(opoVar4);
                opoVar4.notifyDataChanged();
            }

            @Override // opo.e
            public void onClick(qpo model, int position) {
                if (model instanceof cx) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("abnormal_item", ((cx) model).b());
                    bundle.putInt("type", 1);
                    BaseFragmentExKt.gotoPage(this.this$0, HrmAbnormalChartFragment.class, bundle);
                }
            }

            @Override // opo.e
            public /* bridge */ /* synthetic */ void onHeaderClick() {
                super.onHeaderClick();
            }
        });
        RecyclerView recyclerView3 = this.highHrmRecycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.highHrmAdapter);
        }
        RecyclerView recyclerView4 = this.highHrmRecycler;
        if (recyclerView4 != null) {
            recyclerView4.setHasFixedSize(true);
        }
    }

    private final void initAbnormalLowHrmCard() {
        if (getFragmentPosition() != 0) {
            return;
        }
        this.lowHrmDataAdapterList = new ArrayList();
        this.lowHrmDataSrcList = new ArrayList();
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.lowHrmRecycler;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(bl5Var);
        }
        this.lowHrmAdapter = new opo(getMActivity(), this.lowHrmDataAdapterList, c0j.b9, pni.q0);
        RecyclerView recyclerView2 = this.lowHrmRecycler;
        if (recyclerView2 != null) {
            HealthUtil healthUtil = HealthUtil.INSTANCE;
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            opo opoVar = this.lowHrmAdapter;
            Intrinsics.checkNotNull(opoVar);
            recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
        }
        opo opoVar2 = this.lowHrmAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.setOnItemClickListener(new opo.e(this) { // from class: com.xiaomi.fitness.health.hrm.HrmDayWeekMonthFragment.initAbnormalLowHrmCard.1
            final /* synthetic */ HrmDayWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // opo.e
            public void onBottomClick(boolean fold) {
                if (fold) {
                    List list = ((HrmDayWeekMonthFragment) this.this$0).lowHrmDataAdapterList;
                    if (list != null) {
                        list.clear();
                    }
                    List list2 = ((HrmDayWeekMonthFragment) this.this$0).lowHrmDataAdapterList;
                    if (list2 != null) {
                        List list3 = ((HrmDayWeekMonthFragment) this.this$0).lowHrmDataSrcList;
                        Intrinsics.checkNotNull(list3);
                        list2.addAll(list3);
                    }
                    opo opoVar3 = ((HrmDayWeekMonthFragment) this.this$0).lowHrmAdapter;
                    Intrinsics.checkNotNull(opoVar3);
                    opoVar3.p(c0j.E4, false);
                } else {
                    HrmDayWeekMonthFragment<VM, VDB> hrmDayWeekMonthFragment = this.this$0;
                    List list4 = ((HrmDayWeekMonthFragment) hrmDayWeekMonthFragment).lowHrmDataAdapterList;
                    Intrinsics.checkNotNull(list4);
                    List list5 = ((HrmDayWeekMonthFragment) this.this$0).lowHrmDataSrcList;
                    Intrinsics.checkNotNull(list5);
                    hrmDayWeekMonthFragment.setAbnormalFold(list4, list5, ((HrmDayWeekMonthFragment) this.this$0).lowHrmAdapter);
                }
                opo opoVar4 = ((HrmDayWeekMonthFragment) this.this$0).lowHrmAdapter;
                Intrinsics.checkNotNull(opoVar4);
                opoVar4.notifyDataChanged();
            }

            @Override // opo.e
            public void onClick(qpo model, int position) {
                if (model instanceof cx) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("abnormal_item", ((cx) model).b());
                    bundle.putInt("type", 0);
                    BaseFragmentExKt.gotoPage(this.this$0, HrmAbnormalChartFragment.class, bundle);
                }
            }

            @Override // opo.e
            public /* bridge */ /* synthetic */ void onHeaderClick() {
                super.onHeaderClick();
            }
        });
        RecyclerView recyclerView3 = this.lowHrmRecycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.lowHrmAdapter);
        }
        RecyclerView recyclerView4 = this.lowHrmRecycler;
        if (recyclerView4 != null) {
            recyclerView4.setHasFixedSize(true);
        }
    }

    private final void initBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        this.displayNumber = r02Var.c;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition());
        this.mEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = new rtr(this.mBarChartAttrs);
        vqr vqrVar = new vqr(this.mBarChartAttrs, this.displayNumber, this.valueFormatter);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(this.valueFormatter);
        this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
        onq dayRateHighLightMarkValueFormatter = getFragmentPosition() == 0 ? new DayRateHighLightMarkValueFormatter(0) : new RateHighLightMarkValueFormatter(0);
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(dayRateHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView2 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var2 = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView2.addItemDecoration(s02Var2);
        this.mBarChartAdapter = new ubj<>(getActivity(), this.mEntries, this.recyclerView, this.mXAxis, this.mBarChartAttrs, dayRateHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView3 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.recyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.hrm.HrmDayWeekMonthFragment$initBarChart$itemGestureListener$1
            final /* synthetic */ HrmDayWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.getDataTitleView();
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.getDataTitleView();
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    private final void initBundle() {
        int fragmentPosition;
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int fragmentPosition2 = getFragmentPosition();
            if (fragmentPosition2 != 0) {
                localDateNow = fragmentPosition2 != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(iIntValue)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(iIntValue));
            } else {
                localDateNow = LocalDate.now().minusDays(iIntValue);
            }
            if (localDateNow == null) {
                fragmentPosition = getFragmentPosition();
                if (fragmentPosition != 0) {
                    localDateNow = LocalDate.now();
                } else if (fragmentPosition != 1) {
                    localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
                } else {
                    localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
                }
            }
        } else {
            fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateNow = LocalDate.now();
            } else if (fragmentPosition != 1) {
                localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
            } else {
                localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
            }
        }
        this.mCurrentLocalDate = localDateNow;
        if (localDateNow == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initDetailCard() {
        this.mDataListRateDetail = new ArrayList();
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        opo opoVar = new opo(getMActivity(), this.mDataListRateDetail, c0j.I6, pni.B3);
        this.mRateDetailAdapter = opoVar;
        Intrinsics.checkNotNull(opoVar);
        opoVar.setOnItemClickListener(new opo.e() { // from class: sdc
            @Override // opo.e
            public final void onClick(qpo qpoVar, int i) {
                HrmDayWeekMonthFragment.initDetailCard$lambda$6(this.f33534a, qpoVar, i);
            }
        });
        RecyclerView recyclerView2 = this.recyclerDetail;
        if (recyclerView2 != null) {
            HealthUtil healthUtil = HealthUtil.INSTANCE;
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            opo opoVar2 = this.mRateDetailAdapter;
            Intrinsics.checkNotNull(opoVar2);
            recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar2));
        }
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mRateDetailAdapter);
        RecyclerView recyclerView4 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDetailCard$lambda$6(HrmDayWeekMonthFragment this$0, qpo qpoVar, int i) {
        Integer stepAvgHr;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(qpoVar);
        if (qpoVar.g) {
            int i2 = qpoVar.j;
            int iIntValue = 0;
            if (i2 == 1) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("local_date", this$0.mCurrentLocalDate);
                bundle.putInt("type", 0);
                bundle.putInt("origin", this$0.getFragmentPosition());
                BaseFragmentExKt.gotoPage(this$0, HrmRestingFragment.class, bundle);
                return;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                DailyHrReport dailyHrReport = this$0.mDailyHrmReport;
                bundle2.putSerializable("report", dailyHrReport != null ? dailyHrReport.getSleepReport() : null);
                DailyHrReport dailyHrReport2 = this$0.mDailyHrmReport;
                bundle2.putSerializable("record_list", (Serializable) (dailyHrReport2 != null ? dailyHrReport2.getSleepAvgHrRecords() : null));
                HealthUtil.INSTANCE.gotoPage(this$0.getContext(), SleepHrmDetailFragment.class, bundle2, null);
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("report", this$0.mCurrentLocalDate);
            DailyHrReport dailyHrReport3 = this$0.mDailyHrmReport;
            bundle3.putSerializable("record_list", (Serializable) (dailyHrReport3 != null ? dailyHrReport3.getStepHrRecords() : null));
            DailyHrReport dailyHrReport4 = this$0.mDailyHrmReport;
            if (dailyHrReport4 != null && (stepAvgHr = dailyHrReport4.getStepAvgHr()) != null) {
                iIntValue = stepAvgHr.intValue();
            }
            bundle3.putInt(StepHrmDetailFragment.KEY_AVG_HR, iIntValue);
            HealthUtil.INSTANCE.gotoPage(this$0.getContext(), StepHrmDetailFragment.class, bundle3, null);
        }
    }

    private final void initDistributeCard() {
        this.mDataListDistribute = new ArrayList();
        bl5 bl5Var = new bl5();
        RecyclerView recyclerView = this.recyclerRateDistribute;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new sz6(getMActivity(), this.mDataListDistribute, 3);
        RecyclerView recyclerView2 = this.recyclerRateDistribute;
        if (recyclerView2 != null) {
            HealthUtil healthUtil = HealthUtil.INSTANCE;
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            sz6 sz6Var = this.mDistributeAdapter;
            Intrinsics.checkNotNull(sz6Var);
            recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, sz6Var));
        }
        RecyclerView recyclerView3 = this.recyclerRateDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDistributeAdapter);
        sz6 sz6Var2 = this.mDistributeAdapter;
        Intrinsics.checkNotNull(sz6Var2);
        sz6Var2.k(false);
        RecyclerView recyclerView4 = this.recyclerRateDistribute;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initView() {
        initBarChart();
        initDetailCard();
        initAbnormalLowHrmCard();
        initAbnormalHighHrmCard();
        initAbnormalFibCard();
        initDistributeCard();
        CardUnderstandView cardUnderstandView = this.mUnderstandView;
        if (cardUnderstandView != null) {
            ViewExtKt.clickWithTrigger$default(cardUnderstandView, 0L, new Function1() { // from class: qdc
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HrmDayWeekMonthFragment.initView$lambda$5(this.f31407a, (CardUnderstandView) obj);
                }
            }, 1, null);
        }
        HealthBannerCardSetView healthBannerCardSetView = this.healthBannerCardSetView;
        if (healthBannerCardSetView != null) {
            PingAnHealthExtKt.bindOneBanner(healthBannerCardSetView, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$5(HrmDayWeekMonthFragment this$0, CardUnderstandView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandHrmUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.e9), false, false, null, false, null, false, 252, null);
        return Unit.INSTANCE;
    }

    private final void refreshAbnormalFibCard() {
        DailyHrReport dailyHrReport;
        if (AppUtil.INSTANCE.isPlayChannel()) {
            RecyclerView recyclerView = this.abnormalFibRecycler;
            if (recyclerView != null) {
                ViewExtKt.setVisible(recyclerView, false);
                return;
            }
            return;
        }
        if (getFragmentPosition() == 0 && (dailyHrReport = this.mDailyHrmReport) != null) {
            Intrinsics.checkNotNull(dailyHrReport);
            if (!ArrayUtils.isEmpty(dailyHrReport.getAbnormalFibRecords())) {
                AbnormalDataUtil abnormalDataUtil = AbnormalDataUtil.INSTANCE;
                DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport2);
                List<AbnormalFibItem> abnormalFibRecords = dailyHrReport2.getAbnormalFibRecords();
                Intrinsics.checkNotNull(abnormalFibRecords);
                List<qpo> listCreateAbnormalFibModel = abnormalDataUtil.createAbnormalFibModel(abnormalFibRecords);
                int size = listCreateAbnormalFibModel.size();
                if (size == 0) {
                    RecyclerView recyclerView2 = this.abnormalFibRecycler;
                    if (recyclerView2 != null) {
                        ViewExtKt.setVisible(recyclerView2, false);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView3 = this.abnormalFibRecycler;
                if (recyclerView3 != null) {
                    ViewExtKt.setVisible(recyclerView3, true);
                }
                List<qpo> list = this.abnormalFibDataSrcList;
                if (list != null) {
                    list.clear();
                }
                List<qpo> list2 = this.abnormalFibDataSrcList;
                if (list2 != null) {
                    list2.addAll(listCreateAbnormalFibModel);
                }
                if (size >= 10) {
                    List<qpo> list3 = this.abnormalFibDataAdapterList;
                    Intrinsics.checkNotNull(list3);
                    List<qpo> list4 = this.abnormalFibDataSrcList;
                    Intrinsics.checkNotNull(list4);
                    setAbnormalFold(list3, list4, this.abnormalFibAdapter);
                } else {
                    List<qpo> list5 = this.abnormalFibDataAdapterList;
                    if (list5 != null) {
                        list5.clear();
                    }
                    List<qpo> list6 = this.abnormalFibDataAdapterList;
                    if (list6 != null) {
                        List<qpo> list7 = this.abnormalFibDataSrcList;
                        Intrinsics.checkNotNull(list7);
                        list6.addAll(list7);
                    }
                    opo opoVar = this.abnormalFibAdapter;
                    if (opoVar != null) {
                        opoVar.hideFooterFold();
                    }
                }
                opo opoVar2 = this.abnormalFibAdapter;
                if (opoVar2 != null) {
                    opoVar2.notifyDataChanged();
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView4 = this.abnormalFibRecycler;
        if (recyclerView4 != null) {
            ViewExtKt.setVisible(recyclerView4, false);
        }
    }

    private final void refreshAbnormalHighHrmCard() {
        DailyHrReport dailyHrReport;
        if (getFragmentPosition() == 0 && (dailyHrReport = this.mDailyHrmReport) != null) {
            Intrinsics.checkNotNull(dailyHrReport);
            if (!ArrayUtils.isEmpty(dailyHrReport.getAbnormalHrHighRecords())) {
                AbnormalDataUtil abnormalDataUtil = AbnormalDataUtil.INSTANCE;
                DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport2);
                List<SegmentItem> abnormalHrHighRecords = dailyHrReport2.getAbnormalHrHighRecords();
                Intrinsics.checkNotNull(abnormalHrHighRecords);
                String quantityString = getResources().getQuantityString(qxi.common_unit_heart_rate, 1);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                List<cx> listCreateAbnormalSummaryViewModel = abnormalDataUtil.createAbnormalSummaryViewModel(abnormalHrHighRecords, quantityString, true);
                int size = listCreateAbnormalSummaryViewModel.size();
                if (size == 0) {
                    RecyclerView recyclerView = this.highHrmRecycler;
                    if (recyclerView != null) {
                        ViewExtKt.setVisible(recyclerView, false);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.highHrmRecycler;
                if (recyclerView2 != null) {
                    ViewExtKt.setVisible(recyclerView2, true);
                }
                List<qpo> list = this.highHrmDataSrcList;
                if (list != null) {
                    list.clear();
                }
                List<qpo> list2 = this.highHrmDataSrcList;
                if (list2 != null) {
                    list2.addAll(listCreateAbnormalSummaryViewModel);
                }
                if (size >= 10) {
                    List<qpo> list3 = this.highHrmDataAdapterList;
                    Intrinsics.checkNotNull(list3);
                    List<qpo> list4 = this.highHrmDataSrcList;
                    Intrinsics.checkNotNull(list4);
                    setAbnormalFold(list3, list4, this.highHrmAdapter);
                } else {
                    List<qpo> list5 = this.highHrmDataAdapterList;
                    if (list5 != null) {
                        list5.clear();
                    }
                    List<qpo> list6 = this.highHrmDataAdapterList;
                    if (list6 != null) {
                        List<qpo> list7 = this.highHrmDataSrcList;
                        Intrinsics.checkNotNull(list7);
                        list6.addAll(list7);
                    }
                    opo opoVar = this.highHrmAdapter;
                    if (opoVar != null) {
                        opoVar.hideFooterFold();
                    }
                }
                opo opoVar2 = this.highHrmAdapter;
                if (opoVar2 != null) {
                    opoVar2.notifyDataChanged();
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView3 = this.highHrmRecycler;
        if (recyclerView3 != null) {
            ViewExtKt.setVisible(recyclerView3, false);
        }
    }

    private final void refreshAbnormalLowHrmCard() {
        DailyHrReport dailyHrReport;
        if (getFragmentPosition() == 0 && (dailyHrReport = this.mDailyHrmReport) != null) {
            Intrinsics.checkNotNull(dailyHrReport);
            if (!ArrayUtils.isEmpty(dailyHrReport.getAbnormalHrLowRecords())) {
                AbnormalDataUtil abnormalDataUtil = AbnormalDataUtil.INSTANCE;
                DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport2);
                List<SegmentItem> abnormalHrLowRecords = dailyHrReport2.getAbnormalHrLowRecords();
                Intrinsics.checkNotNull(abnormalHrLowRecords);
                String quantityString = getResources().getQuantityString(qxi.common_unit_heart_rate, 1);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                List<cx> listCreateAbnormalSummaryViewModel = abnormalDataUtil.createAbnormalSummaryViewModel(abnormalHrLowRecords, quantityString, true);
                int size = listCreateAbnormalSummaryViewModel.size();
                if (size == 0) {
                    RecyclerView recyclerView = this.lowHrmRecycler;
                    if (recyclerView != null) {
                        ViewExtKt.setVisible(recyclerView, false);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.lowHrmRecycler;
                if (recyclerView2 != null) {
                    ViewExtKt.setVisible(recyclerView2, true);
                }
                List<qpo> list = this.lowHrmDataSrcList;
                if (list != null) {
                    list.clear();
                }
                List<qpo> list2 = this.lowHrmDataSrcList;
                if (list2 != null) {
                    list2.addAll(listCreateAbnormalSummaryViewModel);
                }
                Logger.d("MiHealth:hrm", "refresh low hr!!");
                if (size < 10) {
                    List<qpo> list3 = this.lowHrmDataAdapterList;
                    if (list3 != null) {
                        list3.clear();
                    }
                    List<qpo> list4 = this.lowHrmDataAdapterList;
                    if (list4 != null) {
                        List<qpo> list5 = this.lowHrmDataSrcList;
                        Intrinsics.checkNotNull(list5);
                        list4.addAll(list5);
                    }
                    opo opoVar = this.lowHrmAdapter;
                    if (opoVar != null) {
                        opoVar.hideFooterFold();
                    }
                } else if (this.autoFoldAbnormalRecycler) {
                    List<qpo> list6 = this.lowHrmDataAdapterList;
                    Intrinsics.checkNotNull(list6);
                    List<qpo> list7 = this.lowHrmDataSrcList;
                    Intrinsics.checkNotNull(list7);
                    setAbnormalFold(list6, list7, this.lowHrmAdapter);
                    this.autoFoldAbnormalRecycler = false;
                } else {
                    opo opoVar2 = this.lowHrmAdapter;
                    if (opoVar2 == null || !opoVar2.k()) {
                        List<qpo> list8 = this.lowHrmDataAdapterList;
                        if (list8 != null) {
                            list8.clear();
                        }
                        List<qpo> list9 = this.lowHrmDataAdapterList;
                        if (list9 != null) {
                            List<qpo> list10 = this.lowHrmDataSrcList;
                            Intrinsics.checkNotNull(list10);
                            list9.addAll(list10);
                        }
                        opo opoVar3 = this.lowHrmAdapter;
                        if (opoVar3 != null) {
                            opoVar3.p(c0j.E4, false);
                        }
                    } else {
                        List<qpo> list11 = this.lowHrmDataAdapterList;
                        Intrinsics.checkNotNull(list11);
                        List<qpo> list12 = this.lowHrmDataSrcList;
                        Intrinsics.checkNotNull(list12);
                        setAbnormalFold(list11, list12, this.lowHrmAdapter);
                    }
                }
                opo opoVar4 = this.lowHrmAdapter;
                if (opoVar4 != null) {
                    opoVar4.notifyDataChanged();
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView3 = this.lowHrmRecycler;
        if (recyclerView3 != null) {
            ViewExtKt.setVisible(recyclerView3, false);
        }
    }

    private final void refreshBarChart() {
        List<SegmentBarEntry> listFillDaySegmentBarEntry;
        DailyHrReport dailyHrReport = this.mDailyHrmReport;
        if (dailyHrReport == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyHrReport = new DailyHrReport(TimeDateUtil.changZeroOfTheDay(localDate), BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()));
        }
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition == 0) {
            HrmDataUtil hrmDataUtil = HrmDataUtil.INSTANCE;
            r02 r02Var = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            listFillDaySegmentBarEntry = hrmDataUtil.fillDaySegmentBarEntry(r02Var, dailyHrReport);
        } else if (fragmentPosition == 1) {
            HrmDataUtil hrmDataUtil2 = HrmDataUtil.INSTANCE;
            r02 r02Var2 = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var2);
            listFillDaySegmentBarEntry = hrmDataUtil2.createWeekEntries2(dailyHrReport, r02Var2);
        } else if (fragmentPosition != 2) {
            listFillDaySegmentBarEntry = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listFillDaySegmentBarEntry, "emptyList(...)");
        } else {
            HrmDataUtil hrmDataUtil3 = HrmDataUtil.INSTANCE;
            r02 r02Var3 = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var3);
            listFillDaySegmentBarEntry = hrmDataUtil3.createMonthEntries2(dailyHrReport, r02Var3);
        }
        if (this.mDailyHrmReport != null) {
            int fragmentPosition2 = getFragmentPosition();
            DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
            Intrinsics.checkNotNull(dailyHrReport2);
            String titleDesc = getTitleDesc(fragmentPosition2, dailyHrReport2);
            DailyHrReport dailyHrReport3 = this.mDailyHrmReport;
            Intrinsics.checkNotNull(dailyHrReport3);
            int titleHrValue = getTitleHrValue(dailyHrReport3);
            String quantityString = requireContext().getResources().getQuantityString(qxi.common_unit_heart_rate_desc2, titleHrValue, Integer.valueOf(titleHrValue));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            String strValueOf = String.valueOf(titleHrValue);
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.a(requireContext(), quantityString, strValueOf, titleDesc);
            }
        } else {
            DataTitleView dataTitleView2 = this.dataTitleView;
            if (dataTitleView2 != null) {
                dataTitleView2.c(getString(c0j.L6));
            }
        }
        List<SegmentBarEntry> list = this.mEntries;
        if (list != null && !list.isEmpty()) {
            List<SegmentBarEntry> list2 = this.mEntries;
            Intrinsics.checkNotNull(list2);
            List<? extends SegmentBarEntry> list3 = CollectionsKt___CollectionsKt.toList(list2);
            if (listFillDaySegmentBarEntry.isEmpty() || areListsEqual(list3, listFillDaySegmentBarEntry)) {
                return;
            }
        }
        List<SegmentBarEntry> list4 = this.mEntries;
        Intrinsics.checkNotNull(list4);
        list4.clear();
        List<SegmentBarEntry> list5 = this.mEntries;
        Intrinsics.checkNotNull(list5);
        list5.addAll(listFillDaySegmentBarEntry);
        float theMaxNumber = RecyclerBarEntry.INSTANCE.getTheMaxNumber(listFillDaySegmentBarEntry);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.mYAxis = rtrVar.l(this.mYAxis, theMaxNumber);
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.mYAxis);
        ubj<sf2> ubjVar = this.mBarChartAdapter;
        Intrinsics.checkNotNull(ubjVar);
        ubjVar.setYAxis(this.mYAxis);
        ubj<sf2> ubjVar2 = this.mBarChartAdapter;
        Intrinsics.checkNotNull(ubjVar2);
        ubjVar2.notifyDataSetChanged();
        DataTitleView dataTitleView3 = this.dataTitleView;
        if (dataTitleView3 != null) {
            dataTitleView3.setVisibility(0);
        }
        List<SegmentBarEntry> list6 = this.mEntries;
        if (list6 == null || list6.isEmpty()) {
            this.oneTrackReportData = "0";
        } else {
            this.oneTrackReportData = "1";
        }
    }

    private final void refreshDetailCard() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        VM mViewModel = getMViewModel();
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        mViewModel.triggerFetchFitnessReport(ISleepRepository.class, "days", TimeDateUtil.changZeroOfTheDay(localDate), 1, 0, "").observe(getViewLifecycleOwner(), new HrmDayWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rdc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrmDayWeekMonthFragment.refreshDetailCard$lambda$3(objectRef, this, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport] */
    public static final Unit refreshDetailCard$lambda$3(Ref.ObjectRef allDaySleepReport, HrmDayWeekMonthFragment this$0, List list) {
        SleepSegmentReport sleepSegmentReport;
        Intrinsics.checkNotNullParameter(allDaySleepReport, "$allDaySleepReport");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            allDaySleepReport.element = null;
        } else {
            Intrinsics.checkNotNull(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ?? r0 = (DailyBasicReport) it.next();
                if (r0 instanceof AllDaySleepReport) {
                    long time = ((AllDaySleepReport) r0).getTime();
                    LocalDate localDate = this$0.mCurrentLocalDate;
                    Intrinsics.checkNotNull(localDate);
                    if (time == TimeDateUtil.changZeroOfTheDay(localDate)) {
                        allDaySleepReport.element = r0;
                    }
                }
            }
        }
        DailyHrReport dailyHrReport = this$0.mDailyHrmReport;
        if (dailyHrReport != null) {
            AllDaySleepReport allDaySleepReport2 = (AllDaySleepReport) allDaySleepReport.element;
            dailyHrReport.setSleepAvgHr(allDaySleepReport2 != null ? allDaySleepReport2.getAvgHr() : null);
        }
        AllDaySleepReport allDaySleepReport3 = (AllDaySleepReport) allDaySleepReport.element;
        List<SleepSegmentReport> sleepSegments = allDaySleepReport3 != null ? allDaySleepReport3.getSleepSegments() : null;
        if (sleepSegments != null) {
            List<SleepSegmentReport> listFilterAndSortSleepLong = SleepExtKt.filterAndSortSleepLong(sleepSegments);
            List<SleepSegmentReport> list2 = listFilterAndSortSleepLong;
            if (list2 == null || list2.isEmpty()) {
                sleepSegmentReport = null;
            } else {
                sleepSegmentReport = (SleepSegmentReport) CollectionsKt___CollectionsKt.last((List) listFilterAndSortSleepLong);
            }
        } else {
            sleepSegmentReport = null;
        }
        DailyHrReport dailyHrReport2 = this$0.mDailyHrmReport;
        if (dailyHrReport2 != null) {
            dailyHrReport2.setSleepAvgHrRecords(sleepSegmentReport != null ? sleepSegmentReport.getHrRecords() : null);
        }
        DailyHrReport dailyHrReport3 = this$0.mDailyHrmReport;
        if (dailyHrReport3 != null) {
            dailyHrReport3.setSleepReport(sleepSegmentReport);
        }
        if (this$0.mDailyHrmReport != null) {
            HrmDataUtil hrmDataUtil = HrmDataUtil.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            DailyHrReport dailyHrReport4 = this$0.mDailyHrmReport;
            Intrinsics.checkNotNull(dailyHrReport4);
            List listCreateDetailModelList$default = HrmDataUtil.createDetailModelList$default(hrmDataUtil, fragmentActivityRequireActivity, dailyHrReport4, false, 4, null);
            if (!listCreateDetailModelList$default.isEmpty()) {
                RecyclerView recyclerView = this$0.recyclerDetail;
                Intrinsics.checkNotNull(recyclerView);
                recyclerView.setVisibility(0);
                List<qpo> list3 = this$0.mDataListRateDetail;
                Intrinsics.checkNotNull(list3);
                list3.clear();
                List<qpo> list4 = this$0.mDataListRateDetail;
                Intrinsics.checkNotNull(list4);
                list4.addAll(listCreateDetailModelList$default);
                opo opoVar = this$0.mRateDetailAdapter;
                Intrinsics.checkNotNull(opoVar);
                DailyHrReport dailyHrReport5 = this$0.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport5);
                opoVar.setHeaderViewTitle(qpo.a(dailyHrReport5.getTag()));
                opo opoVar2 = this$0.mRateDetailAdapter;
                Intrinsics.checkNotNull(opoVar2);
                opoVar2.notifyDataChanged();
            } else {
                RecyclerView recyclerView2 = this$0.recyclerDetail;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(8);
            }
        } else {
            RecyclerView recyclerView3 = this$0.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView3);
            recyclerView3.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    private final void refreshDistributeCard() {
        DailyHrReport dailyHrReport = this.mDailyHrmReport;
        if (dailyHrReport != null) {
            Intrinsics.checkNotNull(dailyHrReport);
            if (dailyHrReport.getHrDistribute() != null) {
                DailyHrReport dailyHrReport2 = this.mDailyHrmReport;
                Intrinsics.checkNotNull(dailyHrReport2);
                DailyHrDistribute hrDistribute = dailyHrReport2.getHrDistribute();
                Intrinsics.checkNotNull(hrDistribute);
                HrmDistribute hrmDistribute = new HrmDistribute(hrDistribute.getWarmUp(), hrDistribute.getFatBurn(), hrDistribute.getAerobic(), hrDistribute.getAnaerobic(), hrDistribute.getExtreme());
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                List<uz6> listCreateDistributeModelListForHrFragment = DistributeDataUtil.createDistributeModelListForHrFragment(fragmentActivityRequireActivity, hrmDistribute);
                List<uz6> list = listCreateDistributeModelListForHrFragment;
                if (!(!list.isEmpty())) {
                    RecyclerView recyclerView = this.recyclerRateDistribute;
                    Intrinsics.checkNotNull(recyclerView);
                    recyclerView.setVisibility(8);
                    return;
                }
                DistributeDataUtil.setPositionOfList(listCreateDistributeModelListForHrFragment);
                RecyclerView recyclerView2 = this.recyclerRateDistribute;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<uz6> list2 = this.mDataListDistribute;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                List<uz6> list3 = this.mDataListDistribute;
                Intrinsics.checkNotNull(list3);
                list3.addAll(list);
                sz6 sz6Var = this.mDistributeAdapter;
                Intrinsics.checkNotNull(sz6Var);
                sz6Var.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerRateDistribute;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void refreshPhoneRecordCard() {
        final HeartrateMeasurer heartrateExportExtKt = HeartrateExportExtKt.getInstance(HeartrateMeasurer.INSTANCE);
        LocalDate localDate = this.mCurrentLocalDate;
        if (localDate != null) {
            Intrinsics.checkNotNull(localDate);
            if (TimeDateUtil.isToday(localDate) && getFragmentPosition() == 0 && heartrateExportExtKt != null && heartrateExportExtKt.isEnableDetect()) {
                CardStyleSetView cardStyleSetView = this.hrmPhoneRecordCard;
                if (cardStyleSetView != null) {
                    ViewExtKt.visible(cardStyleSetView);
                }
                CardStyleSetView cardStyleSetView2 = this.hrmPhoneRecordCard;
                if (cardStyleSetView2 != null) {
                    ViewExtKt.clickWithTrigger$default(cardStyleSetView2, 0L, new Function1() { // from class: pdc
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return HrmDayWeekMonthFragment.refreshPhoneRecordCard$lambda$2(this.f30289a, heartrateExportExtKt, (CardStyleSetView) obj);
                        }
                    }, 1, null);
                    return;
                }
                return;
            }
        }
        CardStyleSetView cardStyleSetView3 = this.hrmPhoneRecordCard;
        if (cardStyleSetView3 != null) {
            ExtUtilKt.gone(cardStyleSetView3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshPhoneRecordCard$lambda$2(HrmDayWeekMonthFragment this$0, HeartrateMeasurer heartrateMeasurer, CardStyleSetView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = this$0.getContext();
        if (context != null) {
            context.startActivity(heartrateMeasurer.launchIntent(context));
        }
        return Unit.INSTANCE;
    }

    private final void refreshViewIfNeed() {
        DailyHrReport dailyHrReport = this.mDailyHrmReport;
        Logger.i("MiHealth:hrm", "refreshViewIfNeed:" + (dailyHrReport != null ? dailyHrReport.toString() : null));
        refreshBarChart();
        refreshPhoneRecordCard();
        refreshDetailCard();
        refreshAbnormalLowHrmCard();
        refreshAbnormalHighHrmCard();
        refreshAbnormalFibCard();
        refreshDistributeCard();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = getMViewModel().triggerFetchFitnessReport(IHeartRateRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "");
        this.reportLiveData = liveDataTriggerFetchFitnessReport;
        if (liveDataTriggerFetchFitnessReport != null) {
            liveDataTriggerFetchFitnessReport.observe(getViewLifecycleOwner(), new HrmDayWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: odc
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HrmDayWeekMonthFragment.requestData$lambda$0(this.f29035a, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(HrmDayWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.mDailyHrmReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyHrReport) {
                this$0.mDailyHrmReport = (DailyHrReport) dailyBasicReport;
            }
        }
        this$0.refreshViewIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAbnormalFold(List<qpo> adapterList, List<qpo> srcList, opo adapter) {
        adapterList.clear();
        int size = srcList.size();
        if (size >= 2) {
            adapterList.addAll(srcList.subList(0, 2));
        } else if (size == 1) {
            adapterList.addAll(srcList.subList(0, 1));
        } else {
            adapterList.addAll(srcList);
        }
        Intrinsics.checkNotNull(adapter);
        adapter.p(c0j.F4, true);
    }

    public final boolean areListsEqual(@NotNull List<? extends SegmentBarEntry> list1, @NotNull List<? extends SegmentBarEntry> list2) {
        SegmentBarEntry segmentBarEntry;
        Intrinsics.checkNotNullParameter(list1, "list1");
        Intrinsics.checkNotNullParameter(list2, "list2");
        if (list1.size() != list2.size()) {
            return false;
        }
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            SegmentBarEntry segmentBarEntry2 = list1.get(i);
            if (segmentBarEntry2 == null || segmentBarEntry2.getMinValue() != list2.get(i).getMinValue() || (segmentBarEntry = list1.get(i)) == null || segmentBarEntry.getMaxValue() != list2.get(i).getMaxValue()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final RecyclerView getAbnormalFibRecycler() {
        return this.abnormalFibRecycler;
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final DataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final HealthBannerCardSetView getHealthBannerCardSetView() {
        return this.healthBannerCardSetView;
    }

    @Nullable
    public final RecyclerView getHighHrmRecycler() {
        return this.highHrmRecycler;
    }

    @Nullable
    public final CardStyleSetView getHrmPhoneRecordCard() {
        return this.hrmPhoneRecordCard;
    }

    @Nullable
    public final RecyclerView getLowHrmRecycler() {
        return this.lowHrmRecycler;
    }

    @Nullable
    public final CardUnderstandView getMUnderstandView() {
        return this.mUnderstandView;
    }

    @NotNull
    public final String getOneTrackReportData() {
        return this.oneTrackReportData;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final RecyclerView getRecyclerRateDistribute() {
        return this.recyclerRateDistribute;
    }

    @Nullable
    public final BarChartRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public abstract void initViewBinding();

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
        Logger.i("MiHealth:hrm", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initViewBinding();
        initView();
        requestData();
    }

    public final void setAbnormalFibRecycler(@Nullable RecyclerView recyclerView) {
        this.abnormalFibRecycler = recyclerView;
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setHealthBannerCardSetView(@Nullable HealthBannerCardSetView healthBannerCardSetView) {
        this.healthBannerCardSetView = healthBannerCardSetView;
    }

    public final void setHighHrmRecycler(@Nullable RecyclerView recyclerView) {
        this.highHrmRecycler = recyclerView;
    }

    public final void setHrmPhoneRecordCard(@Nullable CardStyleSetView cardStyleSetView) {
        this.hrmPhoneRecordCard = cardStyleSetView;
    }

    public final void setLowHrmRecycler(@Nullable RecyclerView recyclerView) {
        this.lowHrmRecycler = recyclerView;
    }

    public final void setMUnderstandView(@Nullable CardUnderstandView cardUnderstandView) {
        this.mUnderstandView = cardUnderstandView;
    }

    public final void setOneTrackReportData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oneTrackReportData = str;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRecyclerRateDistribute(@Nullable RecyclerView recyclerView) {
        this.recyclerRateDistribute = recyclerView;
    }

    public final void setRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.recyclerView = barChartRecyclerView;
    }
}
