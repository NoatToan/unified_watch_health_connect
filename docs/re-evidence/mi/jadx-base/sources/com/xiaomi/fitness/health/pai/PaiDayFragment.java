package com.xiaomi.fitness.health.pai;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.api.repository.IPaiRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.PaiEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.DayRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.pai.PaiDayFragment;
import com.xiaomi.fitness.health.pai.view.PaiLimitGridView;
import com.xiaomi.fitness.health.pai.view.PaiProgressView;
import com.xiaomi.fitness.statistics.OneTrackReportAspect;
import com.xiaomi.fitness.statistics.export.annotation.OneTrackReport;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.HrmDataUtil;
import com.xiaomi.fitness.util.PaiDataUtil;
import com.xiaomi.fitness.util.UrlConstants;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.mi_connect_sdk.api.AppDiscType;
import defpackage.c0j;
import defpackage.hak;
import defpackage.ijh;
import defpackage.jaa;
import defpackage.lih;
import defpackage.nrd;
import defpackage.pni;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.s69;
import defpackage.sf2;
import defpackage.ubj;
import defpackage.uih;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u0000 q2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001qB\u0007¢\u0006\u0004\bp\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\"\u0010\u0006R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010%R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010+R\u0018\u0010B\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010.R\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00108R\u0018\u0010I\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010;R\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\"\u0010h\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020d0g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006r"}, d2 = {"Lcom/xiaomi/fitness/health/pai/PaiDayFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "Lcom/xiaomi/fitness/health/pai/PaiViewModel;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "", "initDeviceCard", "()V", "initPaiBarChartCard", "initLineChartCard", "refreshPaiReport", "refreshViewIfNeed", "refreshPaiBarChartCard", "refreshHrmLineChartCard", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "deviceList", "onDeviceListChanged", "(Ljava/util/List;)V", "cleanDataList", "onVisible", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "displayData", "scrollToCurrentCycle", "onInvisible", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "paiBarChartRecycler", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Llih;", "paiBarChartAdapter", "Llih;", "Ls02;", "paiBarItemDecoration", "Ls02;", "Lr02;", "paiBarChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/PaiEntry;", "paiBarEntries", "Ljava/util/List;", "Lvnq;", "paiBarYAxis", "Lvnq;", "Lvqr;", "paiBarXAxis", "Lvqr;", "Lcom/xiaomi/fitness/view/DataTitleView;", "paiBarDataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "hrmChartRecycler", "Lubj;", "Lsf2;", "hrmChartAdapter", "Lubj;", "hrmChartItemDecoration", "hrmChartAttrs", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "hrmChartEntries", "Lrtr;", "hrmChartYAxis", "Lrtr;", "hrmChartXAxis", "hrmDataTitleView", "Landroid/widget/TextView;", "tvTodayPaiCount", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/health/pai/view/PaiLimitGridView;", "paiLimitGridView", "Lcom/xiaomi/fitness/health/pai/view/PaiLimitGridView;", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "deviceListView", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "", "", "mDeviceSidSet", "Ljava/util/Set;", "Landroid/widget/LinearLayout;", "layoutOpenHrCheck", "Landroid/widget/LinearLayout;", "Lcom/xiaomi/fitness/health/pai/view/PaiProgressView;", "paiProgressView", "Lcom/xiaomi/fitness/health/pai/view/PaiProgressView;", "understandCard", "Landroid/view/View;", "mSid", "Ljava/lang/String;", "Ljaa;", "_binding", "Ljaa;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "mPaiReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "", "mSidReportMap", "Ljava/util/Map;", "getBinding", "()Ljaa;", "binding", "getBundle", "()Lkotlin/Unit;", SdkContants.KEY_BUNDLE, "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPaiDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaiDayFragment.kt\ncom/xiaomi/fitness/health/pai/PaiDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,457:1\n1863#2,2:458\n1863#2,2:460\n1863#2,2:462\n*S KotlinDebug\n*F\n+ 1 PaiDayFragment.kt\ncom/xiaomi/fitness/health/pai/PaiDayFragment\n*L\n393#1:458,2\n398#1:460,2\n261#1:462,2\n*E\n"})
public final class PaiDayFragment extends Hilt_PaiDayFragment<PaiViewModel, RecyclerBarEntry> {

    @NotNull
    public static final String TAG = "MiHealth";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    @Nullable
    private jaa _binding;

    @Nullable
    private SportsDeviceListView deviceListView;

    @Nullable
    private ubj<sf2> hrmChartAdapter;

    @Nullable
    private r02 hrmChartAttrs;

    @Nullable
    private List<SegmentBarEntry> hrmChartEntries;

    @Nullable
    private s02 hrmChartItemDecoration;

    @Nullable
    private BarChartRecyclerView hrmChartRecycler;

    @Nullable
    private vqr hrmChartXAxis;

    @Nullable
    private rtr hrmChartYAxis;

    @Nullable
    private DataTitleView hrmDataTitleView;

    @Nullable
    private LinearLayout layoutOpenHrCheck;

    @Nullable
    private DailyPaiReport mPaiReport;

    @Nullable
    private String mSid;

    @Nullable
    private lih paiBarChartAdapter;

    @Nullable
    private r02 paiBarChartAttrs;

    @Nullable
    private BarChartRecyclerView paiBarChartRecycler;

    @Nullable
    private DataTitleView paiBarDataTitleView;

    @Nullable
    private List<PaiEntry> paiBarEntries;

    @Nullable
    private s02 paiBarItemDecoration;

    @Nullable
    private vqr paiBarXAxis;

    @Nullable
    private vnq<?> paiBarYAxis;

    @Nullable
    private PaiLimitGridView paiLimitGridView;

    @Nullable
    private PaiProgressView paiProgressView;

    @Nullable
    private TextView tvTodayPaiCount;

    @Nullable
    private View understandCard;

    @NotNull
    private Set<String> mDeviceSidSet = new HashSet();

    @NotNull
    private Map<String, DailyPaiReport> mSidReportMap = new HashMap();

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("PaiDayFragment.kt", PaiDayFragment.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("4", "onInvisible", "com.xiaomi.fitness.health.pai.PaiDayFragment", "", "", "", "void"), AppDiscType.MC_DISC_TYPE_DEFAULT);
    }

    private final void cleanDataList() {
        this.mPaiReport = null;
        List<PaiEntry> list = this.paiBarEntries;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (list.size() > 0) {
                List<PaiEntry> list2 = this.paiBarEntries;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                lih lihVar = this.paiBarChartAdapter;
                Intrinsics.checkNotNull(lihVar);
                lihVar.notifyDataSetChanged();
            }
        }
        List<SegmentBarEntry> list3 = this.hrmChartEntries;
        if (list3 != null) {
            Intrinsics.checkNotNull(list3);
            if (list3.size() > 0) {
                List<SegmentBarEntry> list4 = this.hrmChartEntries;
                Intrinsics.checkNotNull(list4);
                list4.clear();
                ubj<sf2> ubjVar = this.hrmChartAdapter;
                Intrinsics.checkNotNull(ubjVar);
                ubjVar.notifyDataSetChanged();
            }
        }
        this.mSidReportMap.clear();
    }

    private final jaa getBinding() {
        jaa jaaVar = this._binding;
        Intrinsics.checkNotNull(jaaVar);
        return jaaVar;
    }

    private final Unit getBundle() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mSelectDate = (LocalDate) arguments.getSerializable("local_date");
            String string = arguments.getString("did");
            this.mSid = string;
            Logger.i("MiHealth", "pai fragment from bundle sid" + string);
            if (this.mSelectDate == null) {
                this.mSelectDate = LocalDate.now();
            }
        } else {
            this.mSelectDate = LocalDate.now();
        }
        return Unit.INSTANCE;
    }

    private final void initDeviceCard() {
        SportsDeviceListView sportsDeviceListView = this.deviceListView;
        if (sportsDeviceListView != null) {
            sportsDeviceListView.refreshIcon(pni.X1);
        }
        SportsDeviceListView sportsDeviceListView2 = this.deviceListView;
        if (sportsDeviceListView2 != null) {
            sportsDeviceListView2.setDeviceSelectedListener(new SportsDeviceListView.DeviceSelectedListener() { // from class: com.xiaomi.fitness.health.pai.PaiDayFragment.initDeviceCard.1
                @Override // com.xiaomi.fitness.common.devicelist.SportsDeviceListView.DeviceSelectedListener
                public void deviceSelected(String did, boolean isClick) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    PaiDayFragment.this.mSid = did;
                    Logger.i("MiHealth", "Pai-数据源切换:" + did);
                    PaiDayFragment.this.refreshViewIfNeed();
                }
            });
        }
    }

    private final void initLineChartCard() {
        this.hrmChartEntries = new ArrayList();
        BarChartRecyclerView barChartRecyclerView = this.hrmChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.hrmChartAttrs = r02Var;
        this.hrmChartYAxis = vnq.o(r02Var, 200.0f);
        r02 r02Var2 = this.hrmChartAttrs;
        Intrinsics.checkNotNull(r02Var2);
        vqr vqrVar = new vqr(r02Var2, r02Var2.c, new xqr());
        this.hrmChartXAxis = vqrVar;
        s02 s02Var = new s02(this.hrmChartYAxis, vqrVar, this.hrmChartAttrs);
        this.hrmChartItemDecoration = s02Var;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.hrmChartYAxis);
        s02 s02Var2 = this.hrmChartItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        s02Var2.setHighLightValueFormatter(new DayRateHighLightMarkValueFormatter(0));
        BarChartRecyclerView barChartRecyclerView2 = this.hrmChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var3 = this.hrmChartItemDecoration;
        Intrinsics.checkNotNull(s02Var3);
        barChartRecyclerView2.addItemDecoration(s02Var3);
        this.hrmChartAdapter = new ubj<>(getActivity(), this.hrmChartEntries, this.hrmChartRecycler, this.hrmChartXAxis, this.hrmChartAttrs);
        BarChartRecyclerView barChartRecyclerView3 = this.hrmChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.hrmChartAdapter);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.hrmChartAttrs);
        BarChartRecyclerView barChartRecyclerView4 = this.hrmChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.hrmChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.hrmChartRecycler, new xcm() { // from class: com.xiaomi.fitness.health.pai.PaiDayFragment$initLineChartCard$gestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.hrmDataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.hrmDataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.hrmChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initPaiBarChartCard() {
        this.paiBarEntries = new ArrayList();
        BarChartRecyclerView barChartRecyclerView = this.paiBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.paiBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        int i = r02Var.c;
        ijh ijhVar = new ijh();
        this.paiBarYAxis = vnq.p(this.paiBarChartAttrs, 100.0f, 5);
        vqr vqrVar = new vqr(this.paiBarChartAttrs, i, ijhVar);
        this.paiBarXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(ijhVar);
        this.paiBarItemDecoration = new s02(this.paiBarYAxis, this.paiBarXAxis, this.paiBarChartAttrs);
        uih uihVar = new uih(getMActivity());
        s02 s02Var = this.paiBarItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(uihVar);
        this.paiBarChartAdapter = new lih(getMActivity(), this.paiBarEntries, this.paiBarChartRecycler, this.paiBarXAxis, this.paiBarChartAttrs, uihVar);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.paiBarChartAttrs);
        BarChartRecyclerView barChartRecyclerView2 = this.paiBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        barChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView3 = this.paiBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        s02 s02Var2 = this.paiBarItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView3.addItemDecoration(s02Var2);
        BarChartRecyclerView barChartRecyclerView4 = this.paiBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setAdapter(this.paiBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView5 = this.paiBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        this.mItemGestureListener = new hak(getActivity(), this.paiBarChartRecycler, new xcm() { // from class: com.xiaomi.fitness.health.pai.PaiDayFragment.initPaiBarChartCard.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = PaiDayFragment.this.paiBarDataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = PaiDayFragment.this.paiBarDataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.paiBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(this.mItemGestureListener);
    }

    private final void onDeviceListChanged(List<FitnessDeviceItem> deviceList) {
        this.mDeviceSidSet.clear();
        if (deviceList != null) {
            Iterator<T> it = deviceList.iterator();
            while (it.hasNext()) {
                this.mDeviceSidSet.add(((FitnessDeviceItem) it.next()).getSid());
            }
        }
        if (!CollectionsKt___CollectionsKt.contains(this.mDeviceSidSet, this.mSid)) {
            this.mSid = null;
            for (String str : this.mDeviceSidSet) {
                if (this.mSid == null) {
                    this.mSid = str;
                }
            }
        }
        SportsDeviceListView sportsDeviceListView = this.deviceListView;
        if (sportsDeviceListView != null) {
            sportsDeviceListView.updateDeviceSet(this.mDeviceSidSet);
        }
        if (!(!this.mDeviceSidSet.isEmpty())) {
            SportsDeviceListView sportsDeviceListView2 = this.deviceListView;
            if (sportsDeviceListView2 != null) {
                ViewExtKt.setVisible(sportsDeviceListView2, false);
                return;
            }
            return;
        }
        SportsDeviceListView sportsDeviceListView3 = this.deviceListView;
        if (sportsDeviceListView3 != null) {
            sportsDeviceListView3.refreshCurrentSid(this.mSid);
        }
        SportsDeviceListView sportsDeviceListView4 = this.deviceListView;
        if (sportsDeviceListView4 != null) {
            ViewExtKt.setVisible(sportsDeviceListView4, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(PaiDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String aboutPaiUrl = UrlConstants.INSTANCE.getAboutPaiUrl();
        Logger.i("MiHealth", "about pai url is " + aboutPaiUrl);
        WebViewUtilKt.startWebView$default(aboutPaiUrl, this$0.getString(c0j.cb), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(PaiDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        settingsPageUtil.gotoHeartRatePage(contextRequireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(PaiDayFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinearLayout linearLayout = this$0.layoutOpenHrCheck;
        Intrinsics.checkNotNull(linearLayout);
        ViewExtKt.setVisible(linearLayout, bool != null && bool.booleanValue());
        return Unit.INSTANCE;
    }

    private final void refreshHrmLineChartCard() {
        float highZonePai;
        float mediumZonePai;
        float lowZonePai;
        List<SegmentBarEntry> list = this.hrmChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        DailyPaiReport dailyPaiReport = this.mPaiReport;
        DailyHrReport hrReport = dailyPaiReport != null ? dailyPaiReport.getHrReport() : null;
        DailyPaiReport dailyPaiReport2 = this.mPaiReport;
        float pai = 0.0f;
        if ((dailyPaiReport2 != null ? Float.valueOf(dailyPaiReport2.getHighZonePai()) : null) == null) {
            highZonePai = 0.0f;
        } else {
            DailyPaiReport dailyPaiReport3 = this.mPaiReport;
            Intrinsics.checkNotNull(dailyPaiReport3);
            highZonePai = dailyPaiReport3.getHighZonePai();
        }
        DailyPaiReport dailyPaiReport4 = this.mPaiReport;
        if ((dailyPaiReport4 != null ? Float.valueOf(dailyPaiReport4.getMediumZonePai()) : null) == null) {
            mediumZonePai = 0.0f;
        } else {
            DailyPaiReport dailyPaiReport5 = this.mPaiReport;
            Intrinsics.checkNotNull(dailyPaiReport5);
            mediumZonePai = dailyPaiReport5.getMediumZonePai();
        }
        DailyPaiReport dailyPaiReport6 = this.mPaiReport;
        if ((dailyPaiReport6 != null ? Float.valueOf(dailyPaiReport6.getLowZonePai()) : null) == null) {
            lowZonePai = 0.0f;
        } else {
            DailyPaiReport dailyPaiReport7 = this.mPaiReport;
            Intrinsics.checkNotNull(dailyPaiReport7);
            lowZonePai = dailyPaiReport7.getLowZonePai();
        }
        if (hrReport == null) {
            LocalDate mSelectDate = this.mSelectDate;
            Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
            hrReport = new DailyHrReport(TimeDateUtil.localDateToTimestamp(mSelectDate), "days");
        }
        HrmDataUtil hrmDataUtil = HrmDataUtil.INSTANCE;
        r02 r02Var = this.hrmChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        List<SegmentBarEntry> listFillDaySegmentBarEntry = hrmDataUtil.fillDaySegmentBarEntry(r02Var, hrReport);
        float theMaxNumber = RecyclerBarEntry.INSTANCE.getTheMaxNumber(listFillDaySegmentBarEntry);
        rtr rtrVar = this.hrmChartYAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.hrmChartYAxis = rtrVar.l(this.hrmChartYAxis, theMaxNumber);
        s02 s02Var = this.hrmChartItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.hrmChartYAxis);
        ubj<sf2> ubjVar = this.hrmChartAdapter;
        Intrinsics.checkNotNull(ubjVar);
        ubjVar.setYAxis(this.hrmChartYAxis);
        List<SegmentBarEntry> list2 = this.hrmChartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listFillDaySegmentBarEntry);
        ubj<sf2> ubjVar2 = this.hrmChartAdapter;
        Intrinsics.checkNotNull(ubjVar2);
        ubjVar2.notifyDataSetChanged();
        DailyPaiReport dailyPaiReport8 = this.mPaiReport;
        if ((dailyPaiReport8 != null ? Float.valueOf(dailyPaiReport8.getPai()) : null) != null) {
            DailyPaiReport dailyPaiReport9 = this.mPaiReport;
            Intrinsics.checkNotNull(dailyPaiReport9);
            pai = dailyPaiReport9.getPai();
        }
        PaiLimitGridView paiLimitGridView = this.paiLimitGridView;
        Intrinsics.checkNotNull(paiLimitGridView);
        paiLimitGridView.a(pai, highZonePai, mediumZonePai, lowZonePai);
        LocalDate localDate = this.mSelectDate;
        Intrinsics.checkNotNull(localDate);
        String string = getString(c0j.Wa, TimeDateUtil.getDateMMddFormat(localDate), String.valueOf((int) pai));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextView textView = this.tvTodayPaiCount;
        Intrinsics.checkNotNull(textView);
        textView.setText(string);
        TextView textView2 = this.tvTodayPaiCount;
        Intrinsics.checkNotNull(textView2);
        int iIntValue = 0;
        textView2.setVisibility(0);
        if (hrReport.getLatestHrRecord() == null) {
            DataTitleView dataTitleView = this.hrmDataTitleView;
            Intrinsics.checkNotNull(dataTitleView);
            dataTitleView.c(getString(c0j.L6));
            return;
        }
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(hrReport.getTime() * ((long) 1000));
        HrItem latestHrRecord = hrReport.getLatestHrRecord();
        if ((latestHrRecord != null ? Integer.valueOf(latestHrRecord.getHr()) : null) != null) {
            HrItem latestHrRecord2 = hrReport.getLatestHrRecord();
            Integer numValueOf = latestHrRecord2 != null ? Integer.valueOf(latestHrRecord2.getHr()) : null;
            Intrinsics.checkNotNull(numValueOf);
            iIntValue = numValueOf.intValue();
        }
        String strValueOf = String.valueOf(iIntValue);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strValueOf, requireContext().getResources().getQuantityString(qxi.common_unit_heart_rate, iIntValue)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        DataTitleView dataTitleView2 = this.hrmDataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), str, strValueOf, dateYYYYMMddLocalFormat);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c1  */
    private final void refreshPaiBarChartCard() {
        List<PaiEntry> list = this.paiBarEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<PaiEntry> listCreatePaiOf7Days = PaiDataUtil.INSTANCE.createPaiOf7Days(this.mPaiReport, this.mSelectDate);
        float theMaxNumber = HealthUtil.getTheMaxNumber(listCreatePaiOf7Days);
        this.paiBarYAxis = vnq.p(this.paiBarChartAttrs, theMaxNumber > 100.0f ? 100.0f + ((((int) (theMaxNumber - 100)) / 100) * 100) + 100 : 100.0f, 5);
        s02 s02Var = this.paiBarItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.paiBarYAxis);
        lih lihVar = this.paiBarChartAdapter;
        Intrinsics.checkNotNull(lihVar);
        lihVar.setYAxis(this.paiBarYAxis);
        List<PaiEntry> list2 = this.paiBarEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreatePaiOf7Days);
        lih lihVar2 = this.paiBarChartAdapter;
        Intrinsics.checkNotNull(lihVar2);
        lihVar2.notifyDataSetChanged();
        DailyPaiReport dailyPaiReport = this.mPaiReport;
        if (dailyPaiReport != null) {
            Intrinsics.checkNotNull(dailyPaiReport);
            if (!ArrayUtils.isEmpty(dailyPaiReport.getPaiList())) {
                PaiEntry paiEntry = listCreatePaiOf7Days.get(0);
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                Logger.i("MiHealth", "pai current select sid " + this.mSid + ";current did " + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null));
                String str = this.mSid;
                if (str == null) {
                    PaiProgressView paiProgressView = this.paiProgressView;
                    Intrinsics.checkNotNull(paiProgressView);
                    ViewExtKt.setVisible(paiProgressView, false);
                } else {
                    if (str.equals(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null)) {
                        PaiProgressView paiProgressView2 = this.paiProgressView;
                        Intrinsics.checkNotNull(paiProgressView2);
                        paiProgressView2.b(paiEntry);
                    } else {
                        PaiProgressView paiProgressView3 = this.paiProgressView;
                        Intrinsics.checkNotNull(paiProgressView3);
                        ViewExtKt.setVisible(paiProgressView3, false);
                    }
                }
                int i = (int) paiEntry.f11759b;
                String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(paiEntry.timestamp * ((long) 1000));
                DataTitleView dataTitleView = this.paiBarDataTitleView;
                if (dataTitleView != null) {
                    dataTitleView.a(requireContext(), String.valueOf(i), String.valueOf(i), dateYYYYMMddLocalFormat);
                    return;
                }
                return;
            }
        }
        DataTitleView dataTitleView2 = this.paiBarDataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.c(getString(c0j.L6));
        }
        PaiProgressView paiProgressView4 = this.paiProgressView;
        Intrinsics.checkNotNull(paiProgressView4);
        ViewExtKt.setVisible(paiProgressView4, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshPaiReport() {
        cleanDataList();
        final LocalDate localDateMinusDays = this.mSelectDate.minusDays(6);
        LocalDate localDatePlusDays = this.mSelectDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Intrinsics.checkNotNull(localDateMinusDays);
        final long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
        final LiveData<List<FitnessDeviceItem>> liveDataQueryDeviceList = ((PaiViewModel) getMViewModel()).queryDeviceList(jChangZeroOfTheDay2, jChangZeroOfTheDay);
        Logger.i("MiHealth", "refreshPaiReport request params" + this.mSelectDate + "/" + jChangZeroOfTheDay + "/" + jChangZeroOfTheDay2);
        liveDataQueryDeviceList.observe(getViewLifecycleOwner(), new PaiDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rih
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaiDayFragment.refreshPaiReport$lambda$6(this.f32570a, liveDataQueryDeviceList, localDateMinusDays, jChangZeroOfTheDay2, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit refreshPaiReport$lambda$6(final PaiDayFragment this$0, LiveData queryDeviceLiveData, LocalDate localDate, long j, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queryDeviceLiveData, "$queryDeviceLiveData");
        if (list == null || !(!list.isEmpty())) {
            Logger.i("MiHealth", "pai fragment , queryDeviceList null");
            this$0.onDeviceListChanged(null);
            this$0.refreshViewIfNeed();
        } else {
            if (TextUtils.isEmpty(this$0.mSid)) {
                this$0.mSid = ((FitnessDeviceItem) list.get(0)).getSid();
            }
            this$0.onDeviceListChanged(list);
            for (final String str : this$0.mDeviceSidSet) {
                if (str != null) {
                    Logger.i("MiHealth", "pai...queryDeviceList result size:" + list.size() + "start triggerFetchFitnessReport:" + localDate + "/sid:" + str);
                    final LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = ((PaiViewModel) this$0.getMViewModel()).triggerFetchFitnessReport(IPaiRepository.class, "weeks", j, 0, 0, str);
                    liveDataTriggerFetchFitnessReport.observe(this$0.getViewLifecycleOwner(), new PaiDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sih
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PaiDayFragment.refreshPaiReport$lambda$6$lambda$5$lambda$4$lambda$3(this.f33677a, str, liveDataTriggerFetchFitnessReport, (List) obj);
                        }
                    }));
                }
            }
        }
        queryDeviceLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshPaiReport$lambda$6$lambda$5$lambda$4$lambda$3(PaiDayFragment this$0, String it, LiveData paiReportLiveData, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(paiReportLiveData, "$paiReportLiveData");
        if (!ArrayUtils.isEmpty(list)) {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyPaiReport) {
                this$0.mSidReportMap.put(it, (DailyPaiReport) dailyBasicReport);
            }
        }
        this$0.refreshViewIfNeed();
        paiReportLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshViewIfNeed() {
        DailyPaiReport dailyPaiReport = this.mSidReportMap.isEmpty() ? null : this.mSidReportMap.get(this.mSid);
        this.mPaiReport = dailyPaiReport;
        Logger.i("MiHealth", "current sid " + this.mSid + ",refreshViewIfNeed PaiReport ..  " + (dailyPaiReport != null ? dailyPaiReport.toString() : null));
        refreshPaiBarChartCard();
        refreshHrmLineChartCard();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void displayData() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = jaa.A0(inflater, container, false);
        this.paiBarChartRecycler = getBinding().J;
        this.paiBarDataTitleView = getBinding().A;
        this.paiProgressView = getBinding().I;
        this.layoutOpenHrCheck = getBinding().F;
        this.understandCard = getBinding().N;
        this.deviceListView = getBinding().B;
        this.hrmChartRecycler = getBinding().K;
        this.hrmDataTitleView = getBinding().C;
        this.tvTodayPaiCount = getBinding().M;
        this.paiLimitGridView = getBinding().H;
        return getBinding().getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    @OneTrackReport(args = {"name", "PAI_detail_page", "title", "PAI"}, tip = "56.4.5.1.21797")
    public void onInvisible() throws Throwable {
        OneTrackReportAspect oneTrackReportAspectAspectOf;
        Annotation annotation;
        nrd nrdVarB = s69.b(ajc$tjp_0, this, this);
        try {
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797");
            Object[] objArr = new Object[6];
            objArr[0] = "name";
            objArr[1] = "PAI_detail_page";
            objArr[2] = "title";
            objArr[3] = "PAI";
            objArr[4] = "data";
            objArr[5] = this.mPaiReport == null ? "0" : "1";
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            super.onInvisible();
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            Annotation annotation2 = ajc$anno$0;
            if (annotation2 == null) {
                Method declaredMethod = PaiDayFragment.class.getDeclaredMethod("onInvisible", new Class[0]);
            }
        } finally {
            oneTrackReportAspectAspectOf = OneTrackReportAspect.aspectOf();
            annotation = ajc$anno$0;
            if (annotation == null) {
                annotation = PaiDayFragment.class.getDeclaredMethod("onInvisible", new Class[0]).getAnnotation(OneTrackReport.class);
                ajc$anno$0 = annotation;
            }
            oneTrackReportAspectAspectOf.oneTrackReportPageView(nrdVarB, (OneTrackReport) annotation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBundle();
        View view2 = this.understandCard;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: oih
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    PaiDayFragment.onViewCreated$lambda$0(this.f29200a, view3);
                }
            });
        }
        LinearLayout linearLayout = this.layoutOpenHrCheck;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: pih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaiDayFragment.onViewCreated$lambda$1(this.f30430a, view3);
            }
        });
        initPaiBarChartCard();
        initLineChartCard();
        initDeviceCard();
        refreshPaiReport();
        ((PaiViewModel) getMViewModel()).queryShowHrOpenGuideLiveData().observe(getViewLifecycleOwner(), new PaiDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qih
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaiDayFragment.onViewCreated$lambda$2(this.f31547a, (Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        setStatusBarFontBlack(true);
        getBundle();
        refreshPaiReport();
        ((PaiViewModel) getMViewModel()).requestShowHrOpenEnable();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void scrollToCurrentCycle() {
    }
}
