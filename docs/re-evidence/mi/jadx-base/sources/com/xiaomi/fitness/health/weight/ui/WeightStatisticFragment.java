package com.xiaomi.fitness.health.weight.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.base.BaseDetailChildFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.WeightHighLightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.WeightPercentHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.WeightViewModel;
import com.xiaomi.fitness.health.weight.ui.WeightStatisticFragment;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.arr;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.eu3;
import defpackage.ffr;
import defpackage.hak;
import defpackage.nfr;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.rtr;
import defpackage.str;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vna;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yaa;
import defpackage.yfe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u0007¢\u0006\u0004\bz\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J)\u0010\u0013\u001a\u00020\u00032\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010(\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0014¢\u0006\u0004\b*\u0010\u0005J!\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0003H\u0014¢\u0006\u0004\b.\u0010\u0005J\u000f\u0010/\u001a\u00020\u0017H\u0014¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u00102\u001a\u00020%H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0003H\u0014¢\u0006\u0004\b5\u0010\u0005R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020R0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010BR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010BR$\u0010\\\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010V\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0018\u0010a\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR\u001e\u0010b\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010BR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\"\u0010o\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\u00110n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\"\u0010q\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0014\u0010y\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006|"}, d2 = {"Lcom/xiaomi/fitness/health/weight/ui/WeightStatisticFragment;", "Lcom/xiaomi/fitness/base/BaseDetailChildFragment;", "Lyaa;", "", "clearDataAndReRequestData", "()V", "requestWeightLatestData", "initDetailRecyclerView", "initMaxMinTitleRecyclerView", "", "isRightScroll", Constants.KEY_REQUEST_DATA, "(Z)V", "refreshView", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "map", "refreshDetailCard", "(Ljava/util/Map;)V", "", "yAxisMaximum", "", "formatWeightYMaxValue", "(F)I", "refreshVisibleEntries", "refreshTopSwitchView", "initChartRecyclerView", "dealIndexOnClick", "resultCode", "dealDialogResult", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "visible", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", "xAxisPosition", "()I", AccountInteractActivity.KEY_REQUEST_CODE, "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "onInvisible", "Lvna;", "_binding", "Lvna;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "chartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lufe;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mLineChartAdapter", "Lufe;", "", "mChartEntries", "Ljava/util/List;", "Lyfe;", "mItemDecoration", "Lyfe;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Landroid/widget/TextView;", "tvIndexSelect", "Landroid/widget/TextView;", "", "arrayIndexStringList", "Landroidx/recyclerview/widget/RecyclerView;", "maxMinRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lopo;", "mMaxMinTitleAdapter", "Lopo;", "Lqpo;", "mMaxMinTitleList", "recyclerWeightDetail", "getRecyclerWeightDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerWeightDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mDetailAdapter", "mDataListDetail", "Lcom/xiaomi/fitness/health/weight/WeightViewModel;", "weightViewModel", "Lcom/xiaomi/fitness/health/weight/WeightViewModel;", "typeIndex", "I", "currentBodyType", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "", "leftTime", "Ljava/lang/Long;", "rightTime", "Ljava/util/TreeMap;", "reportMap", "Ljava/util/TreeMap;", "reportData", "Ljava/lang/String;", "getReportData", "()Ljava/lang/String;", "setReportData", "(Ljava/lang/String;)V", "getBinding", "()Lvna;", "binding", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeightStatisticFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightStatisticFragment.kt\ncom/xiaomi/fitness/health/weight/ui/WeightStatisticFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n1863#2,2:448\n*S KotlinDebug\n*F\n+ 1 WeightStatisticFragment.kt\ncom/xiaomi/fitness/health/weight/ui/WeightStatisticFragment\n*L\n212#1:448,2\n*E\n"})
public final class WeightStatisticFragment extends BaseDetailChildFragment implements yaa {
    private static final int REQUEST_LENGTH = 9;
    private static final int REQ_CODE = 1;

    @NotNull
    public static final String TAG = "MiHealth:WeightStatistic";

    @Nullable
    private vna _binding;

    @Nullable
    private LineChartRecyclerView chartRecyclerView;

    @Nullable
    private Long leftTime;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private opo mMaxMinTitleAdapter;

    @Nullable
    private List<qpo> mMaxMinTitleList;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private RecyclerView maxMinRecyclerView;

    @Nullable
    private RecyclerView recyclerWeightDetail;

    @NotNull
    private String reportData;

    @NotNull
    private TreeMap<Long, WeightItem> reportMap;

    @Nullable
    private Long rightTime;

    @Nullable
    private TextView tvIndexSelect;
    private int typeIndex;

    @Nullable
    private WeightViewModel weightViewModel;

    @NotNull
    private List<String> arrayIndexStringList = new ArrayList();

    @NotNull
    private BodyComposition currentBodyType = BodyComposition.WEIGHT;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BodyComposition.values().length];
            try {
                iArr[BodyComposition.BODY_FAT_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BodyComposition.MUSCLE_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WeightStatisticFragment() {
        final Function2 function2 = new Function2() { // from class: mgr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(WeightStatisticFragment.reportMap$lambda$0(((Long) obj).longValue(), ((Long) obj2).longValue()));
            }
        };
        this.reportMap = new TreeMap<>(new Comparator() { // from class: ngr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return WeightStatisticFragment.reportMap$lambda$1(function2, obj, obj2);
            }
        });
        this.reportData = "0";
    }

    private final void clearDataAndReRequestData() {
        setMCurrentDate(LocalDate.now());
        this.reportMap.clear();
        LocalDate mCurrentDate = getMCurrentDate();
        Intrinsics.checkNotNull(mCurrentDate);
        LocalDate localDatePlusDays = mCurrentDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        Long lValueOf = Long.valueOf(TimeDateUtil.changZeroOfTheDay(TimeDateUtil.localDateToTimestamp(localDatePlusDays)));
        this.rightTime = lValueOf;
        this.leftTime = lValueOf;
        requestData(true);
    }

    private final void dealDialogResult(int resultCode) {
        BodyComposition bodyComposition;
        if (resultCode < 0) {
            return;
        }
        if (resultCode >= this.arrayIndexStringList.size()) {
            resultCode = 0;
        }
        this.typeIndex = resultCode;
        refreshTopSwitchView();
        int i = this.typeIndex;
        if (i == 0) {
            bodyComposition = BodyComposition.WEIGHT;
        } else if (i != 1) {
            bodyComposition = i != 2 ? BodyComposition.WEIGHT : BodyComposition.MUSCLE_RATE;
        } else {
            bodyComposition = BodyComposition.BODY_FAT_RATE;
        }
        this.currentBodyType = bodyComposition;
        clearDataAndReRequestData();
    }

    private final void dealIndexOnClick() {
        WeightTypeListDialog weightTypeListDialogCreate = new WeightTypeListDialog.b().create();
        Intrinsics.checkNotNullExpressionValue(weightTypeListDialogCreate, "create(...)");
        WeightTypeListDialog weightTypeListDialog = weightTypeListDialogCreate;
        weightTypeListDialog.updateData(this.arrayIndexStringList);
        weightTypeListDialog.setRequestCode(1);
        weightTypeListDialog.showIfNeed(getChildFragmentManager());
    }

    private final int formatWeightYMaxValue(float yAxisMaximum) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.currentBodyType.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? 60 : 45;
        } else {
            i = 30;
        }
        return yAxisMaximum < ((float) i) ? i : ((((int) yAxisMaximum) / 10) * 10) + 10;
    }

    private final vna getBinding() {
        vna vnaVar = this._binding;
        Intrinsics.checkNotNull(vnaVar);
        return vnaVar;
    }

    private final void initChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.lineChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        vfeVar.a0 = true;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.lineChartAttrs);
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        this.mYAxis = rtr.f(vfeVar2, 60.0f, 3);
        vfe vfeVar3 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar3);
        vqr vqrVar = new vqr(vfeVar3, vfeVar3.c, new arr(getContext()));
        this.mXAxis = vqrVar;
        this.mItemDecoration = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        WeightHighLightMarkValueFormatter weightHighLightMarkValueFormatter = new WeightHighLightMarkValueFormatter(getMActivity());
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(weightHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView2 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        lineChartRecyclerView2.addItemDecoration(yfeVar2);
        this.mLineChartAdapter = new ufe<>(getActivity(), this.mChartEntries, this.chartRecyclerView, this.mXAxis, this.lineChartAttrs, weightHighLightMarkValueFormatter);
        LineChartRecyclerView lineChartRecyclerView3 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.chartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.weight.ui.WeightStatisticFragment$initChartRecyclerView$itemGestureListener$1
            private boolean isRightScrollInner;

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    RecyclerView recyclerView = this.this$0.maxMinRecyclerView;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.this$0.maxMinRecyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(4);
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    if (!recyclerView.canScrollHorizontally(-1) && this.isRightScrollInner) {
                        this.this$0.requestData(!ExtUtilKt.isRTLDirection());
                    } else if (!recyclerView.canScrollHorizontally(1)) {
                        this.this$0.requestData(ExtUtilKt.isRTLDirection());
                    }
                    this.this$0.refreshVisibleEntries();
                }
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                this.isRightScrollInner = dx < 0;
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initDetailRecyclerView() {
        this.mDataListDetail = new ArrayList();
        RecyclerView recyclerView = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.op, pni.r2);
        RecyclerView recyclerView2 = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView2);
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
        RecyclerView recyclerView3 = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView4 = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initMaxMinTitleRecyclerView() {
        ArrayList arrayList = new ArrayList();
        this.mMaxMinTitleList = arrayList;
        Intrinsics.checkNotNull(arrayList);
        List<qpo> listE = ffr.e(requireContext(), this.typeIndex, "-", "-");
        Intrinsics.checkNotNullExpressionValue(listE, "createMaxMinTitleSummaryModel(...)");
        arrayList.addAll(listE);
        nfr nfrVar = new nfr(ExtUtilsKt.getDp(3));
        RecyclerView recyclerView = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(nfrVar);
        this.mMaxMinTitleAdapter = new opo(getMActivity(), this.mMaxMinTitleList);
        RecyclerView recyclerView2 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mMaxMinTitleAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView2.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
        RecyclerView recyclerView3 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mMaxMinTitleAdapter);
        RecyclerView recyclerView4 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInflateView$lambda$2(WeightStatisticFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dealIndexOnClick();
    }

    private final void refreshDetailCard(Map<BodyComposition, ? extends List<WeightItem>> map) {
        Logger.i(TAG, "refreshDetailCard map:" + map.size());
        if (map.isEmpty()) {
            RecyclerView recyclerView = this.recyclerWeightDetail;
            Intrinsics.checkNotNull(recyclerView);
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        List<qpo> listG = ffr.g(requireContext(), map);
        List<qpo> list = listG;
        if (ArrayUtils.isEmpty(list)) {
            RecyclerView recyclerView2 = this.recyclerWeightDetail;
            Intrinsics.checkNotNull(recyclerView2);
            ViewExtKt.setVisible(recyclerView2, false);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerWeightDetail;
        Intrinsics.checkNotNull(recyclerView3);
        ViewExtKt.setVisible(recyclerView3, true);
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.clear();
        List<qpo> list3 = this.mDataListDetail;
        Intrinsics.checkNotNull(list3);
        Intrinsics.checkNotNull(listG);
        list3.addAll(list);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        opoVar.notifyDataChanged();
    }

    private final void refreshTopSwitchView() {
        if (this.arrayIndexStringList.isEmpty()) {
            List<String> list = this.arrayIndexStringList;
            String string = getString(c0j.m4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            list.add(string);
            List<String> list2 = this.arrayIndexStringList;
            String string2 = getString(c0j.W2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            list2.add(string2);
            List<String> list3 = this.arrayIndexStringList;
            String string3 = getString(c0j.t3);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            list3.add(string3);
        }
        if (this.typeIndex < this.arrayIndexStringList.size()) {
            TextView textView = this.tvIndexSelect;
            Intrinsics.checkNotNull(textView);
            textView.setText(this.arrayIndexStringList.get(this.typeIndex));
        }
    }

    private final void refreshView() {
        List<MaxMinEntry> list = this.mChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<MaxMinEntry> listF = ffr.f(this.reportMap, this.currentBodyType);
        List<MaxMinEntry> list2 = this.mChartEntries;
        Intrinsics.checkNotNull(list2);
        Intrinsics.checkNotNull(listF);
        list2.addAll(listF);
        int weightYMaxValue = formatWeightYMaxValue(HealthUtil.getTheMaxNumber(this.mChartEntries));
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.mYAxis = rtrVar.m(this.mYAxis, weightYMaxValue, 3);
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        onq weightHighLightMarkValueFormatter = this.currentBodyType == BodyComposition.WEIGHT ? new WeightHighLightMarkValueFormatter(getMActivity()) : new WeightPercentHighLightMarkValueFormatter(getMActivity());
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setHighLightValueFormatter(weightHighLightMarkValueFormatter);
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        if (ufeVar != null) {
            ufeVar.setValueFormatter(weightHighLightMarkValueFormatter);
        }
        ufe<MaxMinEntry> ufeVar2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar2);
        ufeVar2.notifyDataSetChanged();
        RecyclerView recyclerView = this.maxMinRecyclerView;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: lgr
                @Override // java.lang.Runnable
                public final void run() {
                    WeightStatisticFragment.refreshView$lambda$6(this.f25056a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshView$lambda$6(WeightStatisticFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshVisibleEntries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshVisibleEntries() {
        long j;
        Float f;
        Float f2;
        long jChangZeroOfTheDay;
        String str;
        if (isInvalid()) {
            return;
        }
        str strVarJ = eu3.j(this.chartRecyclerView, 7);
        List<T> list = strVarJ.c;
        Logger.i(TAG, "refreshVisibleEntries visibleEntries size " + list.size());
        Float fValueOf = Float.valueOf(strVarJ.f33986b);
        Float fValueOf2 = Float.valueOf(strVarJ.f33985a);
        if (ArrayUtils.isEmpty(list)) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(TimeDateUtil.localDateToTimestamp(localDateNow));
            f2 = null;
            j = jChangZeroOfTheDay;
            f = null;
        } else {
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
            j = ((RecyclerBarEntry) obj).timestamp;
            Object obj2 = list.get(list.size() - 1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
            f = fValueOf;
            f2 = fValueOf2;
            jChangZeroOfTheDay = ((RecyclerBarEntry) obj2).timestamp;
        }
        Logger.i(TAG, "refreshVisibleEntries leftTime:" + TimeDateUtil.timestampToLocalDate(jChangZeroOfTheDay) + "/rightTime:" + TimeDateUtil.timestampToLocalDate(j) + "/minValue:" + f + "/maxValue:" + f2 + "/type" + this.typeIndex);
        String str2 = this.currentBodyType == BodyComposition.WEIGHT ? "%.2f" : "%.1f";
        String str3 = "-";
        if (f == null) {
            str = "-";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Locale.getDefault(), str2, Arrays.copyOf(new Object[]{f}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        if (f2 != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str3 = String.format(Locale.getDefault(), str2, Arrays.copyOf(new Object[]{f2}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        }
        List<qpo> list2 = this.mMaxMinTitleList;
        if (list2 != null) {
            list2.clear();
        }
        List<qpo> list3 = this.mMaxMinTitleList;
        if (list3 != null) {
            List<qpo> listE = ffr.e(requireContext(), this.typeIndex, str3, str);
            Intrinsics.checkNotNullExpressionValue(listE, "createMaxMinTitleSummaryModel(...)");
            list3.addAll(listE);
        }
        opo opoVar = this.mMaxMinTitleAdapter;
        if (opoVar != null) {
            opoVar.notifyDataChanged();
        }
        BaseDetailChildFragment.OnDateSelectChangedListener mSelectChangedListener = getMSelectChangedListener();
        if (mSelectChangedListener != null) {
            mSelectChangedListener.onSelectStartEndDateChanged(TimeDateUtil.timestampToLocalDate(jChangZeroOfTheDay), TimeDateUtil.timestampToLocalDate(j));
        }
        BaseDetailChildFragment.OnDateSelectChangedListener mSelectChangedListener2 = getMSelectChangedListener();
        if (mSelectChangedListener2 != null) {
            mSelectChangedListener2.onTitleBarJumpEnable(false);
        }
        setMCurrentDate(TimeDateUtil.timestampToLocalDate(j));
        RecyclerView recyclerView = this.maxMinRecyclerView;
        if (recyclerView != null) {
            ViewExtKt.setVisible(recyclerView, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reportMap$lambda$0(long j, long j2) {
        return Intrinsics.compare(j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reportMap$lambda$1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestData(boolean isRightScroll) {
        Long l;
        int i;
        int i2;
        if (isRightScroll) {
            l = this.leftTime;
            Intrinsics.checkNotNull(l);
            i2 = 9;
            i = 0;
        } else {
            l = this.rightTime;
            Intrinsics.checkNotNull(l);
            i = 9;
            i2 = 0;
        }
        Logger.i(TAG, "requestData isRightScroll:" + isRightScroll + "/requestTime:" + l + "/format time:" + TimeDateUtil.timestampToLocalDate(l.longValue()) + "/leftOffset:" + i2 + "/rightOffset:" + i + "/BodyComposition:" + this.currentBodyType);
        WeightViewModel weightViewModel = this.weightViewModel;
        Intrinsics.checkNotNull(weightViewModel);
        final LiveData<List<WeightItem>> liveDataQueryStatisticWeightRecord = weightViewModel.queryStatisticWeightRecord(l.longValue(), this.currentBodyType, i2, i);
        liveDataQueryStatisticWeightRecord.observe(getViewLifecycleOwner(), new WeightStatisticFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ogr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightStatisticFragment.requestData$lambda$5(this.f29156a, liveDataQueryStatisticWeightRecord, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$5(WeightStatisticFragment this$0, LiveData liveData, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(liveData, "$liveData");
        if (ArrayUtils.isEmpty(list)) {
            this$0.reportData = "1";
            Logger.i(TAG, "onReportChange result size is null");
            this$0.refreshView();
        } else {
            this$0.reportData = "0";
            Logger.i(TAG, "onReportChange result size:" + list.size());
            Intrinsics.checkNotNull(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                WeightItem weightItem = (WeightItem) it.next();
                Logger.i(TAG, "onReportChange item time:" + TimeDateUtil.timestampToLocalDate(weightItem.getTime()) + "record:" + weightItem);
                this$0.reportMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(weightItem.getTime())), weightItem);
            }
            this$0.leftTime = this$0.reportMap.lastKey();
            this$0.rightTime = this$0.reportMap.firstKey();
            Long l = this$0.leftTime;
            Intrinsics.checkNotNull(l);
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(l.longValue());
            Long l2 = this$0.rightTime;
            Intrinsics.checkNotNull(l2);
            Logger.i(TAG, "onReportChange leftTime:" + localDateTimestampToLocalDate + "/rightTime" + TimeDateUtil.timestampToLocalDate(l2.longValue()));
            this$0.refreshView();
        }
        liveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    private final void requestWeightLatestData() {
        WeightViewModel weightViewModel = this.weightViewModel;
        Intrinsics.checkNotNull(weightViewModel);
        final LiveData<Map<BodyComposition, List<WeightItem>>> liveDataQueryWeightLatestDetail = weightViewModel.queryWeightLatestDetail();
        liveDataQueryWeightLatestDetail.observe(getViewLifecycleOwner(), new WeightStatisticFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: kgr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightStatisticFragment.requestWeightLatestData$lambda$3(this.f23834a, liveDataQueryWeightLatestDetail, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWeightLatestData$lambda$3(WeightStatisticFragment this$0, LiveData queryWeightLatestDetail, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queryWeightLatestDetail, "$queryWeightLatestDetail");
        Intrinsics.checkNotNull(map);
        this$0.refreshDetailCard(map);
        queryWeightLatestDetail.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    @Nullable
    public final RecyclerView getRecyclerWeightDetail() {
        return this.recyclerWeightDetail;
    }

    @NotNull
    public final String getReportData() {
        return this.reportData;
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 1) {
            dealDialogResult(resultCode);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = vna.A0(inflater, container, false);
        this.recyclerWeightDetail = getBinding().B;
        this.chartRecyclerView = getBinding().A;
        this.tvIndexSelect = getBinding().C.D;
        this.maxMinRecyclerView = getBinding().D;
        TextView textView = this.tvIndexSelect;
        Intrinsics.checkNotNull(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: pgr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightStatisticFragment.onInflateView$lambda$2(this.f30384a, view);
            }
        });
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797"), "name", "weight_detail_page", "page_fragment", "statistics", "title", "体重", "data", this.reportData);
        super.onInvisible();
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.arrayIndexStringList.isEmpty()) {
            List<String> list = this.arrayIndexStringList;
            String string = getString(c0j.m4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            list.add(string);
            List<String> list2 = this.arrayIndexStringList;
            String string2 = getString(c0j.W2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            list2.add(string2);
            List<String> list3 = this.arrayIndexStringList;
            String string3 = getString(c0j.t3);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            list3.add(string3);
        }
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.weightViewModel = (WeightViewModel) new ViewModelProvider(mActivity).get(WeightViewModel.class);
        setActionBarDisplayable(false);
        initChartRecyclerView();
        initMaxMinTitleRecyclerView();
        initDetailRecyclerView();
        refreshTopSwitchView();
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        refreshVisibleEntries();
    }

    public final void setRecyclerWeightDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerWeightDetail = recyclerView;
    }

    public final void setReportData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reportData = str;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void visible() {
        super.visible();
        clearDataAndReRequestData();
        requestWeightLatestData();
    }

    @Override // com.xiaomi.fitness.base.BaseDetailChildFragment
    public int xAxisPosition() {
        return 1;
    }
}
