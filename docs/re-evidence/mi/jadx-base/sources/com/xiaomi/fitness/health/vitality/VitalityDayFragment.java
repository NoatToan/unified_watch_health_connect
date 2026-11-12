package com.xiaomi.fitness.health.vitality;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.api.repository.IVitalityRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVitalityReport;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.HealthMonitorManager;
import com.xiaomi.fitness.devicesettings.export.HrSettingHelperExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.vitality.VitalityDayFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.VitalityDataUtil;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.g1r;
import defpackage.h1r;
import defpackage.hak;
import defpackage.ijh;
import defpackage.pni;
import defpackage.qxi;
import defpackage.r02;
import defpackage.s1r;
import defpackage.sz6;
import defpackage.uz6;
import defpackage.vma;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 ~2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001~B\u0007¢\u0006\u0004\b}\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J!\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u0006J/\u0010&\u001a\u0004\u0018\u00010%2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u0006J!\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0014¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\u0006R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010f\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020b0e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u0010o\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010@R\"\u0010q\u001a\u00020p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010|\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{¨\u0006\u007f"}, d2 = {"Lcom/xiaomi/fitness/health/vitality/VitalityDayFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "Lcom/xiaomi/fitness/health/vitality/VitalityViewModel;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "", "initDeviceCard", "()V", "initVitalityBarChartCard", "initDistributeCard", "updateRecyclerDistributeLayoutManager", "refreshVitalityReport", "refreshViewIfNeed", "refreshVitalityBarChartCard", "Lcom/xiaomi/fitness/health/vitality/VitalityEntry;", "today", "", "selectTime", "refreshDistributeCard", "(Lcom/xiaomi/fitness/health/vitality/VitalityEntry;J)V", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "deviceList", "onDeviceListChanged", "(Ljava/util/List;)V", "cleanDataList", "initOpenHrCheck", "", "maxYValue", "getMaxY", "(I)I", "onVisible", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_STOP, "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "displayData", "scrollToCurrentCycle", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "vitalityBarChartRecycler", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lg1r;", "vitalityBarChartAdapter", "Lg1r;", "Lh1r;", "vitalityBarItemDecoration", "Lh1r;", "Lr02;", "vitalityBarChartAttrs", "Lr02;", "", "vitalityBarEntries", "Ljava/util/List;", "Lvnq;", "vitalityBarYAxis", "Lvnq;", "Lvqr;", "vitalityBarXAxis", "Lvqr;", "Lcom/xiaomi/fitness/view/DataTitleView;", "vitalityBarDataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "deviceListView", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "", "", "mDeviceSidSet", "Ljava/util/Set;", "Landroid/widget/LinearLayout;", "layoutOpenHrCheck", "Landroid/widget/LinearLayout;", "Lcom/xiaomi/fitness/health/vitality/VitalityProgressView;", "vitalityProgressView", "Lcom/xiaomi/fitness/health/vitality/VitalityProgressView;", "understandCard", "Landroid/view/View;", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "switchButton", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "mSid", "Ljava/lang/String;", "mCurrentSid", "Lvma;", "_binding", "Lvma;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;", "mVitalityReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;", "", "mSidReportMap", "Ljava/util/Map;", "Landroidx/recyclerview/widget/RecyclerView;", "mDistributeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lsz6;", "mDistributeAdapter", "Lsz6;", "Luz6;", "mDistributeData", "", "hrConfigFlag", "Z", "getHrConfigFlag", "()Z", "setHrConfigFlag", "(Z)V", "getBinding", "()Lvma;", "binding", "getBundle", "()Lkotlin/Unit;", SdkContants.KEY_BUNDLE, "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVitalityDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VitalityDayFragment.kt\ncom/xiaomi/fitness/health/vitality/VitalityDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,475:1\n1863#2,2:476\n1863#2,2:478\n1863#2,2:480\n*S KotlinDebug\n*F\n+ 1 VitalityDayFragment.kt\ncom/xiaomi/fitness/health/vitality/VitalityDayFragment\n*L\n374#1:476,2\n379#1:478,2\n247#1:480,2\n*E\n"})
public final class VitalityDayFragment extends Hilt_VitalityDayFragment<VitalityViewModel, RecyclerBarEntry> {

    @NotNull
    public static final String TAG = "MiHealth";

    @Nullable
    private vma _binding;

    @Nullable
    private SportsDeviceListView deviceListView;
    private boolean hrConfigFlag;

    @Nullable
    private LinearLayout layoutOpenHrCheck;

    @Nullable
    private String mCurrentSid;

    @Nullable
    private sz6 mDistributeAdapter;

    @Nullable
    private List<uz6> mDistributeData;

    @Nullable
    private RecyclerView mDistributeRecyclerView;

    @Nullable
    private String mSid;

    @Nullable
    private DailyVitalityReport mVitalityReport;

    @Nullable
    private SwitchButton switchButton;

    @Nullable
    private View understandCard;

    @Nullable
    private g1r vitalityBarChartAdapter;

    @Nullable
    private r02 vitalityBarChartAttrs;

    @Nullable
    private BarChartRecyclerView vitalityBarChartRecycler;

    @Nullable
    private DataTitleView vitalityBarDataTitleView;

    @Nullable
    private List<VitalityEntry> vitalityBarEntries;

    @Nullable
    private h1r vitalityBarItemDecoration;

    @Nullable
    private vqr vitalityBarXAxis;

    @Nullable
    private vnq<?> vitalityBarYAxis;

    @Nullable
    private VitalityProgressView vitalityProgressView;

    @NotNull
    private Set<String> mDeviceSidSet = new HashSet();

    @NotNull
    private Map<String, DailyVitalityReport> mSidReportMap = new HashMap();

    private final void cleanDataList() {
        this.mVitalityReport = null;
        List<VitalityEntry> list = this.vitalityBarEntries;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (list.size() > 0) {
                List<VitalityEntry> list2 = this.vitalityBarEntries;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                g1r g1rVar = this.vitalityBarChartAdapter;
                Intrinsics.checkNotNull(g1rVar);
                g1rVar.notifyDataSetChanged();
            }
        }
        this.mSidReportMap.clear();
    }

    private final vma getBinding() {
        vma vmaVar = this._binding;
        Intrinsics.checkNotNull(vmaVar);
        return vmaVar;
    }

    private final Unit getBundle() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mSelectDate = (LocalDate) arguments.getSerializable("local_date");
            String string = arguments.getString("did");
            this.mSid = string;
            Logger.i("MiHealth", "vitality fragment from bundle sid" + string);
            if (this.mSelectDate == null) {
                this.mSelectDate = LocalDate.now();
            }
        } else {
            this.mSelectDate = LocalDate.now();
        }
        return Unit.INSTANCE;
    }

    private final int getMaxY(int maxYValue) {
        if (maxYValue < 100) {
            return 100;
        }
        int i = maxYValue % 100;
        return (maxYValue + ((2 - ((i / 10) % 2)) * 10)) - (i % 10);
    }

    private final void initDeviceCard() {
        SportsDeviceListView sportsDeviceListView = this.deviceListView;
        if (sportsDeviceListView != null) {
            sportsDeviceListView.refreshIcon(pni.X1);
        }
        SportsDeviceListView sportsDeviceListView2 = this.deviceListView;
        if (sportsDeviceListView2 != null) {
            sportsDeviceListView2.setDeviceSelectedListener(new SportsDeviceListView.DeviceSelectedListener() { // from class: com.xiaomi.fitness.health.vitality.VitalityDayFragment.initDeviceCard.1
                @Override // com.xiaomi.fitness.common.devicelist.SportsDeviceListView.DeviceSelectedListener
                public void deviceSelected(String did, boolean isClick) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    VitalityDayFragment.this.mSid = did;
                    Logger.i("MiHealth", "Vitality-数据源切换:" + did);
                    VitalityDayFragment.this.refreshViewIfNeed();
                }
            });
        }
    }

    private final void initDistributeCard() {
        this.mDistributeData = new ArrayList();
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new sz6(getMActivity(), this.mDistributeData, 9);
        updateRecyclerDistributeLayoutManager();
        RecyclerView recyclerView2 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initOpenHrCheck() {
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "vitality")) {
            LinearLayout linearLayout = this.layoutOpenHrCheck;
            Intrinsics.checkNotNull(linearLayout);
            ViewExtKt.setVisible(linearLayout, false);
        } else {
            ((VitalityViewModel) getMViewModel()).queryShowHrOpenGuideLiveData().observe(getViewLifecycleOwner(), new VitalityDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l1r
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return VitalityDayFragment.initOpenHrCheck$lambda$7(this.f24535a, (Boolean) obj);
                }
            }));
            this.mCurrentSid = wearableDeviceModel.getDid();
            SwitchButton switchButton = this.switchButton;
            Intrinsics.checkNotNull(switchButton);
            switchButton.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: m1r
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    VitalityDayFragment.initOpenHrCheck$lambda$10(this.f25657a, wearableDeviceModel, z, iSwitchButton);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOpenHrCheck$lambda$10(final VitalityDayFragment this$0, final WearableDeviceModel wearableDeviceModel, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCurrentSid == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(c0j.f4801r);
            this$0.getBinding().F.setChecked(false);
        } else {
            HealthMonitorManager hrSettingHelperExtKt = HrSettingHelperExtKt.getInstance(HealthMonitorManager.INSTANCE);
            String str = this$0.mCurrentSid;
            Intrinsics.checkNotNull(str);
            hrSettingHelperExtKt.hrOpenContinuous(str, new Function0() { // from class: j1r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VitalityDayFragment.initOpenHrCheck$lambda$10$lambda$8(this.f22337a, z);
                }
            }, new Function1() { // from class: k1r
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return VitalityDayFragment.initOpenHrCheck$lambda$10$lambda$9(wearableDeviceModel, this$0, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initOpenHrCheck$lambda$10$lambda$8(VitalityDayFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showShortToast(c0j.common_set_success);
        Logger.d("MiHealth", "it success");
        LinearLayout linearLayout = this$0.layoutOpenHrCheck;
        Intrinsics.checkNotNull(linearLayout);
        ViewExtKt.setVisible(linearLayout, !z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initOpenHrCheck$lambda$10$lambda$9(WearableDeviceModel wearableDeviceModel, VitalityDayFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(c0j.common_hint_unkonwn_error);
        } else {
            ToastUtil.showShortToast(c0j.f4801r);
        }
        Logger.i("MiHealth", "it.errorCode is " + i);
        this$0.getBinding().F.setChecked(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initOpenHrCheck$lambda$7(VitalityDayFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinearLayout linearLayout = this$0.layoutOpenHrCheck;
        Intrinsics.checkNotNull(linearLayout);
        ViewExtKt.setVisible(linearLayout, bool != null && bool.booleanValue());
        return Unit.INSTANCE;
    }

    private final void initVitalityBarChartCard() {
        this.vitalityBarEntries = new ArrayList();
        BarChartRecyclerView barChartRecyclerView = this.vitalityBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.vitalityBarChartAttrs = r02Var;
        this.vitalityBarYAxis = vnq.p(r02Var, 100.0f, 1);
        BarChartRecyclerView barChartRecyclerView2 = this.vitalityBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        r02 r02Var2 = (r02) barChartRecyclerView2.mAttrs;
        this.vitalityBarChartAttrs = r02Var2;
        Intrinsics.checkNotNull(r02Var2);
        int i = r02Var2.c;
        ijh ijhVar = new ijh();
        vqr vqrVar = new vqr(this.vitalityBarChartAttrs, i, ijhVar);
        this.vitalityBarXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(ijhVar);
        this.vitalityBarItemDecoration = new h1r(this.vitalityBarYAxis, this.vitalityBarXAxis, this.vitalityBarChartAttrs);
        s1r s1rVar = new s1r(getMActivity());
        h1r h1rVar = this.vitalityBarItemDecoration;
        Intrinsics.checkNotNull(h1rVar);
        h1rVar.setHighLightValueFormatter(s1rVar);
        this.vitalityBarChartAdapter = new g1r(getMActivity(), this.vitalityBarEntries, this.vitalityBarChartRecycler, this.vitalityBarXAxis, this.vitalityBarChartAttrs, s1rVar);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.vitalityBarChartAttrs);
        BarChartRecyclerView barChartRecyclerView3 = this.vitalityBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView4 = this.vitalityBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        h1r h1rVar2 = this.vitalityBarItemDecoration;
        Intrinsics.checkNotNull(h1rVar2);
        barChartRecyclerView4.addItemDecoration(h1rVar2);
        BarChartRecyclerView barChartRecyclerView5 = this.vitalityBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setAdapter(this.vitalityBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView6 = this.vitalityBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.setNestedScrollingEnabled(false);
        this.mItemGestureListener = new hak(getActivity(), this.vitalityBarChartRecycler, new xcm() { // from class: com.xiaomi.fitness.health.vitality.VitalityDayFragment.initVitalityBarChartCard.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = VitalityDayFragment.this.vitalityBarDataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = VitalityDayFragment.this.vitalityBarDataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView7 = this.vitalityBarChartRecycler;
        Intrinsics.checkNotNull(barChartRecyclerView7);
        barChartRecyclerView7.addOnItemTouchListener(this.mItemGestureListener);
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
    public static final void onViewCreated$lambda$0(VitalityDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandVitalityFragment.class, null);
    }

    @SuppressLint({"StringFormatMatches"})
    private final void refreshDistributeCard(VitalityEntry today, long selectTime) {
        String quantityString;
        Resources resources;
        sz6 sz6Var;
        if (today != null && today.getDailyVitality() == 0 && (sz6Var = this.mDistributeAdapter) != null) {
            sz6Var.i = true;
        }
        VitalityUtil vitalityUtil = VitalityUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<uz6> listCreateDistributeModelList = vitalityUtil.createDistributeModelList(contextRequireContext, today);
        if (today != null) {
            selectTime = today.timestamp;
        }
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(selectTime);
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null) {
            quantityString = null;
        } else {
            int i = qxi.B1;
            int dailyVitality = today != null ? today.getDailyVitality() : 0;
            Object[] objArr = new Object[2];
            objArr[0] = dateMMddFormat;
            objArr[1] = Integer.valueOf(today != null ? today.getDailyVitality() : 0);
            quantityString = resources.getQuantityString(i, dailyVitality, objArr);
        }
        sz6 sz6Var2 = this.mDistributeAdapter;
        Intrinsics.checkNotNull(sz6Var2);
        sz6Var2.m(quantityString);
        DistributeDataUtil.setPositionOfList(listCreateDistributeModelList);
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setVisibility(0);
        List<uz6> list = this.mDistributeData;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<uz6> list2 = this.mDistributeData;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateDistributeModelList);
        sz6 sz6Var3 = this.mDistributeAdapter;
        Intrinsics.checkNotNull(sz6Var3);
        sz6Var3.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshViewIfNeed() {
        DailyVitalityReport dailyVitalityReport = this.mSidReportMap.isEmpty() ? null : this.mSidReportMap.get(this.mSid);
        this.mVitalityReport = dailyVitalityReport;
        Logger.i("MiHealth", "current sid " + this.mSid + ",refreshViewIfNeed VitalityReport ..  " + (dailyVitalityReport != null ? dailyVitalityReport.toString() : null));
        DataTitleView dataTitleView = this.vitalityBarDataTitleView;
        if (dataTitleView != null) {
            dataTitleView.setVisibility(0);
        }
        refreshVitalityBarChartCard();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0110  */
    private final void refreshVitalityBarChartCard() {
        List<VitalityEntry> listCreateVitalityOf7Days = VitalityDataUtil.INSTANCE.createVitalityOf7Days(this.mVitalityReport, this.mSelectDate);
        Iterator<VitalityEntry> it = listCreateVitalityOf7Days.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().getTotalVitality());
        }
        int maxY = getMaxY(iMax);
        Logger.i("MiHealth", "VitalityMaxYValue" + maxY);
        List<VitalityEntry> list = this.vitalityBarEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<VitalityEntry> list2 = this.vitalityBarEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateVitalityOf7Days);
        vnq<?> vnqVar = this.vitalityBarYAxis;
        Intrinsics.checkNotNull(vnqVar);
        vnqVar.mAxisMaximum = maxY;
        g1r g1rVar = this.vitalityBarChartAdapter;
        Intrinsics.checkNotNull(g1rVar);
        g1rVar.setYAxis(this.vitalityBarYAxis);
        g1r g1rVar2 = this.vitalityBarChartAdapter;
        Intrinsics.checkNotNull(g1rVar2);
        g1rVar2.notifyDataSetChanged();
        if (this.mVitalityReport == null) {
            DataTitleView dataTitleView = this.vitalityBarDataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getString(c0j.L6));
            }
            LocalDate mSelectDate = this.mSelectDate;
            Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
            if (TimeDateUtil.isToday(mSelectDate)) {
                VitalityProgressView vitalityProgressView = this.vitalityProgressView;
                if (vitalityProgressView != null) {
                    vitalityProgressView.bindHeadEmptyData();
                }
            } else {
                VitalityProgressView vitalityProgressView2 = this.vitalityProgressView;
                if (vitalityProgressView2 != null) {
                    vitalityProgressView2.setVisibility(8);
                }
            }
            LocalDate mSelectDate2 = this.mSelectDate;
            Intrinsics.checkNotNullExpressionValue(mSelectDate2, "mSelectDate");
            refreshDistributeCard(null, TimeDateUtil.localDateToTimestamp(mSelectDate2));
            sz6 sz6Var = this.mDistributeAdapter;
            if (sz6Var != null) {
                sz6Var.i = true;
                return;
            }
            return;
        }
        VitalityEntry vitalityEntry = listCreateVitalityOf7Days.get(0);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i("MiHealth", "vitality current select sid " + this.mSid + ";current did " + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null));
        String str = this.mSid;
        if (str == null) {
            RecyclerView recyclerView = this.mDistributeRecyclerView;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            VitalityProgressView vitalityProgressView3 = this.vitalityProgressView;
            Intrinsics.checkNotNull(vitalityProgressView3);
            ViewExtKt.setVisible(vitalityProgressView3, false);
        } else {
            if (str.equals(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null)) {
                RecyclerView recyclerView2 = this.mDistributeRecyclerView;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                VitalityProgressView vitalityProgressView4 = this.vitalityProgressView;
                Intrinsics.checkNotNull(vitalityProgressView4);
                vitalityProgressView4.updateVitalityGoalData(listCreateVitalityOf7Days.get(0));
            } else {
                RecyclerView recyclerView3 = this.mDistributeRecyclerView;
                Intrinsics.checkNotNull(recyclerView3);
                recyclerView3.setVisibility(8);
                VitalityProgressView vitalityProgressView5 = this.vitalityProgressView;
                Intrinsics.checkNotNull(vitalityProgressView5);
                ViewExtKt.setVisible(vitalityProgressView5, false);
            }
        }
        refreshDistributeCard(listCreateVitalityOf7Days.get(0), listCreateVitalityOf7Days.get(0).timestamp);
        VitalityProgressView vitalityProgressView6 = this.vitalityProgressView;
        Intrinsics.checkNotNull(vitalityProgressView6);
        vitalityProgressView6.updateVitalityGoalData(listCreateVitalityOf7Days.get(0));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{String.valueOf(vitalityEntry.getTotalVitality()), getString(c0j.ro)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        int totalVitality = vitalityEntry.getTotalVitality();
        DailyVitalityReport dailyVitalityReport = this.mVitalityReport;
        Intrinsics.checkNotNull(dailyVitalityReport);
        String weekDateStr = HealthUtil.getWeekDateStr(TimeDateUtil.timestampToLocalDate(dailyVitalityReport.getTime()));
        DataTitleView dataTitleView2 = this.vitalityBarDataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), str2, String.valueOf(totalVitality), weekDateStr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshVitalityReport() {
        cleanDataList();
        final LocalDate localDateMinusDays = this.mSelectDate.minusDays(6);
        LocalDate localDatePlusDays = this.mSelectDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Intrinsics.checkNotNull(localDateMinusDays);
        final long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
        final LiveData<List<FitnessDeviceItem>> liveDataQueryDeviceList = ((VitalityViewModel) getMViewModel()).queryDeviceList(jChangZeroOfTheDay2, jChangZeroOfTheDay);
        Logger.i("MiHealth", "refreshVitalityReport request params" + this.mSelectDate + "/" + jChangZeroOfTheDay + "/" + jChangZeroOfTheDay2);
        liveDataQueryDeviceList.observe(getViewLifecycleOwner(), new VitalityDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o1r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VitalityDayFragment.refreshVitalityReport$lambda$4(this.f28654a, liveDataQueryDeviceList, localDateMinusDays, jChangZeroOfTheDay2, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit refreshVitalityReport$lambda$4(final VitalityDayFragment this$0, LiveData queryDeviceLiveData, LocalDate localDate, long j, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queryDeviceLiveData, "$queryDeviceLiveData");
        if (list == null || !(!list.isEmpty())) {
            Logger.i("MiHealth", "vitality fragment , queryDeviceList null");
            this$0.onDeviceListChanged(null);
            this$0.refreshViewIfNeed();
        } else {
            if (TextUtils.isEmpty(this$0.mSid)) {
                this$0.mSid = ((FitnessDeviceItem) list.get(0)).getSid();
            }
            this$0.onDeviceListChanged(list);
            for (final String str : this$0.mDeviceSidSet) {
                Logger.i("MiHealth", "vitality...queryDeviceList result size:" + list.size() + "start triggerFetchFitnessReport:" + localDate + "/sid:" + str);
                final LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = ((VitalityViewModel) this$0.getMViewModel()).triggerFetchFitnessReport(IVitalityRepository.class, "weeks", j, 0, 0, str);
                liveDataTriggerFetchFitnessReport.observe(this$0.getViewLifecycleOwner(), new VitalityDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: n1r
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return VitalityDayFragment.refreshVitalityReport$lambda$4$lambda$3$lambda$2$lambda$1(this.f27451a, str, liveDataTriggerFetchFitnessReport, (List) obj);
                    }
                }));
            }
        }
        queryDeviceLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshVitalityReport$lambda$4$lambda$3$lambda$2$lambda$1(VitalityDayFragment this$0, String it, LiveData vitalityReportLiveData, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(vitalityReportLiveData, "$vitalityReportLiveData");
        if (!ArrayUtils.isEmpty(list)) {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyVitalityReport) {
                this$0.mSidReportMap.put(it, (DailyVitalityReport) dailyBasicReport);
            }
        }
        this$0.refreshViewIfNeed();
        vitalityReportLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    private final void updateRecyclerDistributeLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDistributeAdapter == null || (recyclerView = this.mDistributeRecyclerView) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        sz6 sz6Var = this.mDistributeAdapter;
        Intrinsics.checkNotNull(sz6Var);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, sz6Var));
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void displayData() {
    }

    public final boolean getHrConfigFlag() {
        return this.hrConfigFlag;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDistributeLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = vma.A0(inflater, container, false);
        this.vitalityBarChartRecycler = getBinding().K;
        this.vitalityBarDataTitleView = getBinding().A;
        this.vitalityProgressView = getBinding().J;
        this.layoutOpenHrCheck = getBinding().D;
        this.understandCard = getBinding().I;
        this.deviceListView = getBinding().B;
        this.mDistributeRecyclerView = getBinding().E;
        this.switchButton = getBinding().F;
        return getBinding().getRoot();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        HrSettingHelperExtKt.getInstance(HealthMonitorManager.INSTANCE).clearOld();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBundle();
        View view2 = this.understandCard;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: p1r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    VitalityDayFragment.onViewCreated$lambda$0(this.f29921a, view3);
                }
            });
        }
        initDeviceCard();
        initOpenHrCheck();
        initVitalityBarChartCard();
        initDistributeCard();
        refreshVitalityReport();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        setStatusBarFontBlack(true);
        getBundle();
        refreshVitalityReport();
        ((VitalityViewModel) getMViewModel()).requestShowHrOpenEnable();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void scrollToCurrentCycle() {
    }

    public final void setHrConfigFlag(boolean z) {
        this.hrConfigFlag = z;
    }
}
