package com.xiaomi.fitness.health.physicalstatus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.api.repository.IPhysicalStatusRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.PhysicalStatusChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.PhysicalStatusEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineDetailChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.HealthMonitorManager;
import com.xiaomi.fitness.devicesettings.export.HrSettingHelperExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.physicalstatus.PhysicalStatusDayFragment;
import com.xiaomi.fitness.health.vitality.VitalityProgressView;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.arr;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.gfe;
import defpackage.hak;
import defpackage.iji;
import defpackage.k47;
import defpackage.mvh;
import defpackage.ni4;
import defpackage.opo;
import defpackage.pni;
import defpackage.qaa;
import defpackage.qpo;
import defpackage.rtr;
import defpackage.sz6;
import defpackage.ufe;
import defpackage.uz6;
import defpackage.vfe;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u009d\u00012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u009d\u0001B\b¢\u0006\u0005\b\u009c\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0015\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006J/\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006J!\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0014¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0006R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020,\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010E\u001a\u0004\bR\u0010G\"\u0004\bS\u0010IR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020W\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00107R\u001e\u0010Z\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u00107R\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010w\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020s0v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010ER\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001e\u0010~\u001a\n\u0012\u0004\u0012\u00020}\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u00107R)\u0010\u0080\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0086\u0001\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010*R\u0018\u0010\u0087\u0001\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0087\u0001\u00104R\u001e\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020,058\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0088\u0001\u00107R\u0018\u0010\u0089\u0001\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010:R\u0018\u0010\u008a\u0001\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010=R\u001e\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010.R\u0018\u0010\u008c\u0001\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u008c\u0001\u00101R\u001a\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0090\u0001\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0090\u0001\u00104R\u001e\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020,058\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0091\u0001\u00107R\u0018\u0010\u0092\u0001\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010:R\u0018\u0010\u0093\u0001\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010=R\u001e\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010.R\u0018\u0010\u0095\u0001\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0095\u0001\u00101R\u0017\u0010\u0098\u0001\u001a\u00020p8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/physicalstatus/PhysicalStatusDayFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "Lcom/xiaomi/fitness/health/physicalstatus/PhysicalStatusViewModel;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "", "initDeviceCard", "()V", "initLineChartCard", "initCTLLineChartCard", "initATLLineChartCard", "initDistributeCard", "initDetailCard", "initLevelDescRecyclerview", "refreshDetailCard", "refreshPhysicalStatusReport", "refreshViewIfNeed", "refreshTitleView", "refreshPhysicalStatusCard", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "deviceList", "onDeviceListChanged", "(Ljava/util/List;)V", "cleanDataList", "onVisible", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_STOP, "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "displayData", "scrollToCurrentCycle", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mLineChartRecycler", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lufe;", "Lcom/xiaomi/fitness/chart/entrys/PhysicalStatusEntry;", "mLineChartAdapter", "Lufe;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/PhysicalStatusChartItemDecoration;", "mLineChartItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/PhysicalStatusChartItemDecoration;", "Lvfe;", "mLineChartAttrs", "Lvfe;", "", "mLineChartEntries", "Ljava/util/List;", "Lrtr;", "mLineChartYAxis", "Lrtr;", "Lvqr;", "mLineChartXAxis", "Lvqr;", "Lcom/xiaomi/fitness/view/DataTitleView;", "mDataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "mDataCTLTitleView", "mDataATLTitleView", "Landroidx/recyclerview/widget/RecyclerView;", "mCardRecyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getMCardRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setMCardRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "mLevelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "getMLevelBarView", "()Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "setMLevelBarView", "(Lcom/xiaomi/fitness/baseui/widget/LevelBarView;)V", "mLevelDescRecyclerView", "getMLevelDescRecyclerView", "setMLevelDescRecyclerView", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "mLevelItems", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "deviceListView", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView;", "", "", "mDeviceSidSet", "Ljava/util/Set;", "Landroid/widget/LinearLayout;", "layoutOpenHrCheck", "Landroid/widget/LinearLayout;", "Lcom/xiaomi/fitness/health/vitality/VitalityProgressView;", "vitalityProgressView", "Lcom/xiaomi/fitness/health/vitality/VitalityProgressView;", "understandCard", "Landroid/view/View;", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "switchButton", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "mSid", "Ljava/lang/String;", "mCurrentSid", "Lqaa;", "_binding", "Lqaa;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPhysicalStatusReport;", "mPhysicalStatusReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPhysicalStatusReport;", "", "mSidReportMap", "Ljava/util/Map;", "mDistributeRecyclerView", "Lsz6;", "mDistributeAdapter", "Lsz6;", "Luz6;", "mDistributeData", "", "hrConfigFlag", "Z", "getHrConfigFlag", "()Z", "setHrConfigFlag", "(Z)V", "lineChartCTLRecyclerView", "lineChartCTLLAttrs", "mCTLEntryList", "yCTLAxis", "xCTLAxis", "lineChartCTLAdapter", "lineCTLItemDecoration", "Lcom/xiaomi/fitness/chart/view/LineDetailChartRecyclerView;", "lineChartATLRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineDetailChartRecyclerView;", "lineChartATLLAttrs", "mATLEntryList", "yATLAxis", "xATLAxis", "lineChartATLAdapter", "lineATLItemDecoration", "getBinding", "()Lqaa;", "binding", "getBundle", "()Lkotlin/Unit;", SdkContants.KEY_BUNDLE, "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPhysicalStatusDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStatusDayFragment.kt\ncom/xiaomi/fitness/health/physicalstatus/PhysicalStatusDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,671:1\n1863#2,2:672\n1863#2,2:674\n1863#2,2:676\n*S KotlinDebug\n*F\n+ 1 PhysicalStatusDayFragment.kt\ncom/xiaomi/fitness/health/physicalstatus/PhysicalStatusDayFragment\n*L\n615#1:672,2\n620#1:674,2\n454#1:676,2\n*E\n"})
public final class PhysicalStatusDayFragment extends Hilt_PhysicalStatusDayFragment<PhysicalStatusViewModel, RecyclerBarEntry> {

    @NotNull
    public static final String TAG = "MiHealth";

    @Nullable
    private qaa _binding;

    @Nullable
    private SportsDeviceListView deviceListView;
    private boolean hrConfigFlag;

    @Nullable
    private LinearLayout layoutOpenHrCheck;
    private PhysicalStatusChartItemDecoration lineATLItemDecoration;
    private PhysicalStatusChartItemDecoration lineCTLItemDecoration;
    private ufe<PhysicalStatusEntry> lineChartATLAdapter;
    private vfe lineChartATLLAttrs;
    private LineDetailChartRecyclerView lineChartATLRecyclerView;
    private ufe<PhysicalStatusEntry> lineChartCTLAdapter;
    private vfe lineChartCTLLAttrs;
    private LineChartRecyclerView lineChartCTLRecyclerView;
    private List<PhysicalStatusEntry> mATLEntryList;
    private List<PhysicalStatusEntry> mCTLEntryList;

    @Nullable
    private RecyclerView mCardRecyclerDetail;

    @Nullable
    private String mCurrentSid;

    @Nullable
    private DataTitleView mDataATLTitleView;

    @Nullable
    private DataTitleView mDataCTLTitleView;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private DataTitleView mDataTitleView;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private sz6 mDistributeAdapter;

    @Nullable
    private List<uz6> mDistributeData;

    @Nullable
    private RecyclerView mDistributeRecyclerView;

    @Nullable
    private LevelBarView mLevelBarView;

    @Nullable
    private RecyclerView mLevelDescRecyclerView;

    @Nullable
    private List<? extends LevelBarView.LevelItem> mLevelItems;

    @Nullable
    private ufe<PhysicalStatusEntry> mLineChartAdapter;

    @Nullable
    private vfe mLineChartAttrs;

    @Nullable
    private List<PhysicalStatusEntry> mLineChartEntries;

    @Nullable
    private PhysicalStatusChartItemDecoration mLineChartItemDecoration;

    @Nullable
    private LineChartRecyclerView mLineChartRecycler;

    @Nullable
    private vqr mLineChartXAxis;

    @Nullable
    private rtr mLineChartYAxis;

    @Nullable
    private DailyPhysicalStatusReport mPhysicalStatusReport;

    @Nullable
    private String mSid;

    @Nullable
    private SwitchButton switchButton;

    @Nullable
    private View understandCard;

    @Nullable
    private VitalityProgressView vitalityProgressView;
    private vqr xATLAxis;
    private vqr xCTLAxis;
    private rtr yATLAxis;
    private rtr yCTLAxis;

    @NotNull
    private Set<String> mDeviceSidSet = new HashSet();

    @NotNull
    private Map<String, DailyPhysicalStatusReport> mSidReportMap = new HashMap();

    private final void cleanDataList() {
        this.mPhysicalStatusReport = null;
        List<PhysicalStatusEntry> list = this.mLineChartEntries;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (list.size() > 0) {
                List<PhysicalStatusEntry> list2 = this.mLineChartEntries;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                ufe<PhysicalStatusEntry> ufeVar = this.mLineChartAdapter;
                Intrinsics.checkNotNull(ufeVar);
                ufeVar.notifyDataSetChanged();
            }
        }
        this.mSidReportMap.clear();
    }

    private final qaa getBinding() {
        qaa qaaVar = this._binding;
        Intrinsics.checkNotNull(qaaVar);
        return qaaVar;
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

    private final void initATLLineChartCard() {
        List<PhysicalStatusEntry> list;
        LineDetailChartRecyclerView lineDetailChartRecyclerView;
        vqr vqrVar;
        vfe vfeVar;
        this.mATLEntryList = new ArrayList();
        LineDetailChartRecyclerView lineDetailChartRecyclerView2 = this.lineChartATLRecyclerView;
        LineDetailChartRecyclerView lineDetailChartRecyclerView3 = null;
        if (lineDetailChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLRecyclerView");
            lineDetailChartRecyclerView2 = null;
        }
        vfe vfeVar2 = (vfe) lineDetailChartRecyclerView2.mAttrs;
        this.lineChartATLLAttrs = vfeVar2;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLLAttrs");
            vfeVar2 = null;
        }
        rtr rtrVar = new rtr(vfeVar2);
        this.yATLAxis = rtrVar;
        rtrVar.f = 5;
        rtr rtrVar2 = this.yATLAxis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yATLAxis");
            rtrVar2 = null;
        }
        rtrVar2.mAxisMaximum = 300.0f;
        rtr rtrVar3 = this.yATLAxis;
        if (rtrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yATLAxis");
            rtrVar3 = null;
        }
        rtrVar3.mAxisMinimum = 0.0f;
        vfe vfeVar3 = this.lineChartATLLAttrs;
        if (vfeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLLAttrs");
            vfeVar3 = null;
        }
        int i = vfeVar3.c;
        arr arrVar = new arr(getContext());
        vfe vfeVar4 = this.lineChartATLLAttrs;
        if (vfeVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLLAttrs");
            vfeVar4 = null;
        }
        vqr vqrVar2 = new vqr(vfeVar4, i, arrVar);
        this.xATLAxis = vqrVar2;
        vqrVar2.setValueFormatter(arrVar);
        rtr rtrVar4 = this.yATLAxis;
        if (rtrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yATLAxis");
            rtrVar4 = null;
        }
        vqr vqrVar3 = this.xATLAxis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xATLAxis");
            vqrVar3 = null;
        }
        vfe vfeVar5 = this.lineChartATLLAttrs;
        if (vfeVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLLAttrs");
            vfeVar5 = null;
        }
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration = new PhysicalStatusChartItemDecoration(rtrVar4, vqrVar3, vfeVar5);
        this.lineATLItemDecoration = physicalStatusChartItemDecoration;
        physicalStatusChartItemDecoration.setBreakPointLine(Boolean.TRUE);
        mvh mvhVar = new mvh(getMActivity());
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration2 = this.lineATLItemDecoration;
        if (physicalStatusChartItemDecoration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineATLItemDecoration");
            physicalStatusChartItemDecoration2 = null;
        }
        physicalStatusChartItemDecoration2.setHighLightValueFormatter(mvhVar);
        FragmentActivity mActivity = getMActivity();
        List<PhysicalStatusEntry> list2 = this.mATLEntryList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mATLEntryList");
            list = null;
        } else {
            list = list2;
        }
        LineDetailChartRecyclerView lineDetailChartRecyclerView4 = this.lineChartATLRecyclerView;
        if (lineDetailChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLRecyclerView");
            lineDetailChartRecyclerView = null;
        } else {
            lineDetailChartRecyclerView = lineDetailChartRecyclerView4;
        }
        vqr vqrVar4 = this.xATLAxis;
        if (vqrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xATLAxis");
            vqrVar = null;
        } else {
            vqrVar = vqrVar4;
        }
        vfe vfeVar6 = this.lineChartATLLAttrs;
        if (vfeVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLLAttrs");
            vfeVar = null;
        } else {
            vfeVar = vfeVar6;
        }
        this.lineChartATLAdapter = new ufe<>(mActivity, list, lineDetailChartRecyclerView, vqrVar, vfeVar, mvhVar);
        FragmentActivity activity = getActivity();
        vfe vfeVar7 = this.lineChartATLLAttrs;
        if (vfeVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLLAttrs");
            vfeVar7 = null;
        }
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(activity, vfeVar7);
        LineDetailChartRecyclerView lineDetailChartRecyclerView5 = this.lineChartATLRecyclerView;
        if (lineDetailChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLRecyclerView");
            lineDetailChartRecyclerView5 = null;
        }
        lineDetailChartRecyclerView5.setLayoutManager(speedRatioLayoutManager);
        LineDetailChartRecyclerView lineDetailChartRecyclerView6 = this.lineChartATLRecyclerView;
        if (lineDetailChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLRecyclerView");
            lineDetailChartRecyclerView6 = null;
        }
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration3 = this.lineATLItemDecoration;
        if (physicalStatusChartItemDecoration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineATLItemDecoration");
            physicalStatusChartItemDecoration3 = null;
        }
        lineDetailChartRecyclerView6.addItemDecoration(physicalStatusChartItemDecoration3);
        LineDetailChartRecyclerView lineDetailChartRecyclerView7 = this.lineChartATLRecyclerView;
        if (lineDetailChartRecyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLRecyclerView");
            lineDetailChartRecyclerView7 = null;
        }
        ufe<PhysicalStatusEntry> ufeVar = this.lineChartATLAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLAdapter");
            ufeVar = null;
        }
        lineDetailChartRecyclerView7.setAdapter(ufeVar);
        LineDetailChartRecyclerView lineDetailChartRecyclerView8 = this.lineChartATLRecyclerView;
        if (lineDetailChartRecyclerView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLRecyclerView");
        } else {
            lineDetailChartRecyclerView3 = lineDetailChartRecyclerView8;
        }
        lineDetailChartRecyclerView3.setNestedScrollingEnabled(false);
    }

    private final void initCTLLineChartCard() {
        List<PhysicalStatusEntry> list;
        LineChartRecyclerView lineChartRecyclerView;
        vqr vqrVar;
        vfe vfeVar;
        this.mCTLEntryList = new ArrayList();
        LineChartRecyclerView lineChartRecyclerView2 = this.lineChartCTLRecyclerView;
        LineChartRecyclerView lineChartRecyclerView3 = null;
        if (lineChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLRecyclerView");
            lineChartRecyclerView2 = null;
        }
        vfe vfeVar2 = (vfe) lineChartRecyclerView2.mAttrs;
        this.lineChartCTLLAttrs = vfeVar2;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLLAttrs");
            vfeVar2 = null;
        }
        rtr rtrVar = new rtr(vfeVar2);
        this.yCTLAxis = rtrVar;
        rtrVar.f = 5;
        rtr rtrVar2 = this.yCTLAxis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yCTLAxis");
            rtrVar2 = null;
        }
        rtrVar2.mAxisMaximum = 300.0f;
        rtr rtrVar3 = this.yCTLAxis;
        if (rtrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yCTLAxis");
            rtrVar3 = null;
        }
        rtrVar3.mAxisMinimum = 0.0f;
        vfe vfeVar3 = this.lineChartCTLLAttrs;
        if (vfeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLLAttrs");
            vfeVar3 = null;
        }
        int i = vfeVar3.c;
        arr arrVar = new arr(getContext());
        vfe vfeVar4 = this.lineChartCTLLAttrs;
        if (vfeVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLLAttrs");
            vfeVar4 = null;
        }
        vqr vqrVar2 = new vqr(vfeVar4, i, arrVar);
        this.xCTLAxis = vqrVar2;
        vqrVar2.setValueFormatter(arrVar);
        rtr rtrVar4 = this.yCTLAxis;
        if (rtrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yCTLAxis");
            rtrVar4 = null;
        }
        vqr vqrVar3 = this.xCTLAxis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xCTLAxis");
            vqrVar3 = null;
        }
        vfe vfeVar5 = this.lineChartCTLLAttrs;
        if (vfeVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLLAttrs");
            vfeVar5 = null;
        }
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration = new PhysicalStatusChartItemDecoration(rtrVar4, vqrVar3, vfeVar5);
        this.lineCTLItemDecoration = physicalStatusChartItemDecoration;
        physicalStatusChartItemDecoration.setBreakPointLine(Boolean.TRUE);
        mvh mvhVar = new mvh(getMActivity());
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration2 = this.lineCTLItemDecoration;
        if (physicalStatusChartItemDecoration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineCTLItemDecoration");
            physicalStatusChartItemDecoration2 = null;
        }
        physicalStatusChartItemDecoration2.setHighLightValueFormatter(mvhVar);
        FragmentActivity mActivity = getMActivity();
        List<PhysicalStatusEntry> list2 = this.mCTLEntryList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCTLEntryList");
            list = null;
        } else {
            list = list2;
        }
        LineChartRecyclerView lineChartRecyclerView4 = this.lineChartCTLRecyclerView;
        if (lineChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLRecyclerView");
            lineChartRecyclerView = null;
        } else {
            lineChartRecyclerView = lineChartRecyclerView4;
        }
        vqr vqrVar4 = this.xCTLAxis;
        if (vqrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xCTLAxis");
            vqrVar = null;
        } else {
            vqrVar = vqrVar4;
        }
        vfe vfeVar6 = this.lineChartCTLLAttrs;
        if (vfeVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLLAttrs");
            vfeVar = null;
        } else {
            vfeVar = vfeVar6;
        }
        this.lineChartCTLAdapter = new ufe<>(mActivity, list, lineChartRecyclerView, vqrVar, vfeVar, mvhVar);
        FragmentActivity activity = getActivity();
        vfe vfeVar7 = this.lineChartCTLLAttrs;
        if (vfeVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLLAttrs");
            vfeVar7 = null;
        }
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(activity, vfeVar7);
        LineChartRecyclerView lineChartRecyclerView5 = this.lineChartCTLRecyclerView;
        if (lineChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLRecyclerView");
            lineChartRecyclerView5 = null;
        }
        lineChartRecyclerView5.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView6 = this.lineChartCTLRecyclerView;
        if (lineChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLRecyclerView");
            lineChartRecyclerView6 = null;
        }
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration3 = this.lineCTLItemDecoration;
        if (physicalStatusChartItemDecoration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineCTLItemDecoration");
            physicalStatusChartItemDecoration3 = null;
        }
        lineChartRecyclerView6.addItemDecoration(physicalStatusChartItemDecoration3);
        LineChartRecyclerView lineChartRecyclerView7 = this.lineChartCTLRecyclerView;
        if (lineChartRecyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLRecyclerView");
            lineChartRecyclerView7 = null;
        }
        ufe<PhysicalStatusEntry> ufeVar = this.lineChartCTLAdapter;
        if (ufeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLAdapter");
            ufeVar = null;
        }
        lineChartRecyclerView7.setAdapter(ufeVar);
        LineChartRecyclerView lineChartRecyclerView8 = this.lineChartCTLRecyclerView;
        if (lineChartRecyclerView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLRecyclerView");
            lineChartRecyclerView8 = null;
        }
        lineChartRecyclerView8.setNestedScrollingEnabled(false);
        FragmentActivity activity2 = getActivity();
        LineChartRecyclerView lineChartRecyclerView9 = this.lineChartCTLRecyclerView;
        if (lineChartRecyclerView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLRecyclerView");
            lineChartRecyclerView9 = null;
        }
        hak hakVar = new hak(activity2, lineChartRecyclerView9, new xcm() { // from class: com.xiaomi.fitness.health.physicalstatus.PhysicalStatusDayFragment$initCTLLineChartCard$mCTLItemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                DataTitleView dataTitleView;
                if (barEntry != null && barEntry.isSelected()) {
                    DataTitleView dataTitleView2 = this.this$0.mDataCTLTitleView;
                    if (dataTitleView2 != null) {
                        dataTitleView2.setVisibility(4);
                    }
                    DataTitleView dataTitleView3 = this.this$0.mDataATLTitleView;
                    if (dataTitleView3 != null) {
                        dataTitleView3.setVisibility(4);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView4 = this.this$0.mDataCTLTitleView;
                if (dataTitleView4 != null) {
                    dataTitleView4.setVisibility(0);
                }
                DataTitleView dataTitleView5 = this.this$0.mDataATLTitleView;
                if (dataTitleView5 == null || dataTitleView5.getVisibility() != 4 || (dataTitleView = this.this$0.mDataATLTitleView) == null) {
                    return;
                }
                dataTitleView.setVisibility(0);
            }
        });
        LineChartRecyclerView lineChartRecyclerView10 = this.lineChartCTLRecyclerView;
        if (lineChartRecyclerView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLRecyclerView");
        } else {
            lineChartRecyclerView3 = lineChartRecyclerView10;
        }
        lineChartRecyclerView3.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        this.mLevelItems = PhysicalStatusDataUtil.INSTANCE.getPhysicalStatusLevelList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.health.physicalstatus.PhysicalStatusDayFragment.initDetailCard.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                opo opoVar = PhysicalStatusDayFragment.this.mDetailAdapter;
                Intrinsics.checkNotNull(opoVar);
                return opoVar.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.mb, pni.m2);
        RecyclerView recyclerView3 = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView4 = this.mCardRecyclerDetail;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
        LevelBarView levelBarView = this.mLevelBarView;
        if (levelBarView != 0) {
            List<? extends LevelBarView.LevelItem> list = this.mLevelItems;
            Intrinsics.checkNotNull(list);
            levelBarView.setLevels(list);
        }
        initLevelDescRecyclerview();
    }

    private final void initDeviceCard() {
        SportsDeviceListView sportsDeviceListView = this.deviceListView;
        if (sportsDeviceListView != null) {
            sportsDeviceListView.refreshIcon(pni.N0);
        }
        SportsDeviceListView sportsDeviceListView2 = this.deviceListView;
        if (sportsDeviceListView2 != null) {
            sportsDeviceListView2.setDeviceSelectedListener(new SportsDeviceListView.DeviceSelectedListener() { // from class: com.xiaomi.fitness.health.physicalstatus.PhysicalStatusDayFragment.initDeviceCard.1
                @Override // com.xiaomi.fitness.common.devicelist.SportsDeviceListView.DeviceSelectedListener
                public void deviceSelected(String did, boolean isClick) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    PhysicalStatusDayFragment.this.mSid = did;
                    Logger.i("MiHealth", "Vitality-数据源切换:" + did);
                    PhysicalStatusDayFragment.this.refreshViewIfNeed();
                }
            });
        }
    }

    private final void initDistributeCard() {
        this.mDistributeData = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.health.physicalstatus.PhysicalStatusDayFragment.initDistributeCard.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                sz6 sz6Var = PhysicalStatusDayFragment.this.mDistributeAdapter;
                Intrinsics.checkNotNull(sz6Var);
                return sz6Var.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView2 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new sz6(getMActivity(), this.mDistributeData, 9);
        RecyclerView recyclerView3 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView4 = this.mDistributeRecyclerView;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initLevelDescRecyclerview() {
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int i = settingsPropertiesUtil.isExpand(contextRequireContext) ? 4 : 3;
        Context context = getContext();
        List<? extends LevelBarView.LevelItem> list = this.mLevelItems;
        Intrinsics.checkNotNull(list);
        gfe gfeVar = new gfe(context, list, i);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i);
        RecyclerView recyclerView = this.mLevelDescRecyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.mLevelDescRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true);
        }
        RecyclerView recyclerView3 = this.mLevelDescRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setNestedScrollingEnabled(false);
        }
        RecyclerView recyclerView4 = this.mLevelDescRecyclerView;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(gfeVar);
        }
        gfeVar.notifyDataSetChanged();
    }

    private final void initLineChartCard() {
        this.mLineChartEntries = new ArrayList();
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.mLineChartAttrs = vfeVar;
        rtr rtrVar = new rtr(vfeVar);
        this.mLineChartYAxis = rtrVar;
        rtrVar.f = 5;
        rtrVar.mAxisMaximum = 25.0f;
        rtrVar.mAxisMinimum = -35.0f;
        vfe vfeVar2 = this.mLineChartAttrs;
        if (vfeVar2 != null) {
            vfeVar2.x0 = true;
        }
        rtrVar.e(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(25.0f), Float.valueOf(15.0f), Float.valueOf(0.0f), Float.valueOf(-10.0f), Float.valueOf(-30.0f), Float.valueOf(-35.0f)}));
        vfe vfeVar3 = this.mLineChartAttrs;
        Intrinsics.checkNotNull(vfeVar3);
        int i = vfeVar3.c;
        arr arrVar = new arr(getContext());
        vqr vqrVar = new vqr(this.mLineChartAttrs, i, arrVar);
        this.mLineChartXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(arrVar);
        vfe vfeVar4 = this.mLineChartAttrs;
        Intrinsics.checkNotNull(vfeVar4);
        vfeVar4.I0 = 10.0f;
        rtr rtrVar2 = this.mLineChartYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        vqr vqrVar2 = this.mLineChartXAxis;
        Intrinsics.checkNotNull(vqrVar2);
        vfe vfeVar5 = this.mLineChartAttrs;
        Intrinsics.checkNotNull(vfeVar5);
        this.mLineChartItemDecoration = new PhysicalStatusChartItemDecoration(rtrVar2, vqrVar2, vfeVar5);
        mvh mvhVar = new mvh(getMActivity());
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration = this.mLineChartItemDecoration;
        Intrinsics.checkNotNull(physicalStatusChartItemDecoration);
        physicalStatusChartItemDecoration.setHighLightValueFormatter(mvhVar);
        this.mLineChartAdapter = new ufe<>(getMActivity(), this.mLineChartEntries, this.mLineChartRecycler, this.mLineChartXAxis, this.mLineChartAttrs, mvhVar);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mLineChartAttrs);
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration2 = this.mLineChartItemDecoration;
        if (physicalStatusChartItemDecoration2 != null) {
            physicalStatusChartItemDecoration2.setBreakPointLine(Boolean.TRUE);
        }
        LineChartRecyclerView lineChartRecyclerView2 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        lineChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView3 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        PhysicalStatusChartItemDecoration physicalStatusChartItemDecoration3 = this.mLineChartItemDecoration;
        Intrinsics.checkNotNull(physicalStatusChartItemDecoration3);
        lineChartRecyclerView3.addItemDecoration(physicalStatusChartItemDecoration3);
        LineChartRecyclerView lineChartRecyclerView4 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView5 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        this.mItemGestureListener = new hak(getActivity(), this.mLineChartRecycler, new xcm() { // from class: com.xiaomi.fitness.health.physicalstatus.PhysicalStatusDayFragment.initLineChartCard.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = PhysicalStatusDayFragment.this.mDataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = PhysicalStatusDayFragment.this.mDataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mLineChartRecycler;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(this.mItemGestureListener);
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
    public static final void onViewCreated$lambda$0(PhysicalStatusDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandPhysicalStatusUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.ob), false, false, null, false, null, false, 252, null);
    }

    private final void refreshDetailCard() {
        Integer physicalFitnessStatus;
        int physicalStatusLevel;
        PhysicalStatusItem latestPhysicalStatusItem;
        DailyPhysicalStatusReport dailyPhysicalStatusReport = this.mPhysicalStatusReport;
        if (dailyPhysicalStatusReport == null || (latestPhysicalStatusItem = dailyPhysicalStatusReport.getLatestPhysicalStatusItem()) == null) {
            physicalFitnessStatus = null;
            physicalStatusLevel = -1;
        } else {
            physicalFitnessStatus = latestPhysicalStatusItem.getPhysicalFitnessStatus();
            physicalStatusLevel = latestPhysicalStatusItem.getPhysicalStatusLevel();
        }
        LevelBarView levelBarView = this.mLevelBarView;
        if (levelBarView != null) {
            levelBarView.setLevel(physicalStatusLevel);
        }
        PhysicalStatusDataUtil physicalStatusDataUtil = PhysicalStatusDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<qpo> listCreateTodayPhysicalStatusSummaryModelList = physicalStatusDataUtil.createTodayPhysicalStatusSummaryModelList(contextRequireContext, physicalFitnessStatus, physicalStatusLevel);
        List<qpo> list = this.mDataListDetail;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateTodayPhysicalStatusSummaryModelList);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        opoVar.notifyDataChanged();
    }

    private final void refreshPhysicalStatusCard() {
        refreshTitleView();
        PhysicalStatusDataUtil physicalStatusDataUtil = PhysicalStatusDataUtil.INSTANCE;
        DailyPhysicalStatusReport dailyPhysicalStatusReport = this.mPhysicalStatusReport;
        LocalDate mSelectDate = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
        List<PhysicalStatusEntry> listCreateDayEntries$default = PhysicalStatusDataUtil.createDayEntries$default(physicalStatusDataUtil, dailyPhysicalStatusReport, mSelectDate, 0, 4, null);
        float fMax = 25.0f;
        float fMin = -35.0f;
        for (PhysicalStatusEntry physicalStatusEntry : listCreateDayEntries$default) {
            fMax = Math.max(fMax, physicalStatusEntry.getY());
            fMin = Math.min(fMin, physicalStatusEntry.getY());
        }
        if (fMin < -35.0f) {
            fMin--;
        }
        Iterator it = listCreateDayEntries$default.iterator();
        while (it.hasNext()) {
            ((PhysicalStatusEntry) it.next()).setEntryMinY(fMin);
        }
        Logger.i("MiHealth", "VitalityMaxYValue" + fMax + "  " + fMin);
        List<PhysicalStatusEntry> list = this.mLineChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<PhysicalStatusEntry> list2 = this.mLineChartEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateDayEntries$default);
        ufe<PhysicalStatusEntry> ufeVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar);
        ufeVar.notifyDataSetChanged();
        PhysicalStatusDataUtil physicalStatusDataUtil2 = PhysicalStatusDataUtil.INSTANCE;
        DailyPhysicalStatusReport dailyPhysicalStatusReport2 = this.mPhysicalStatusReport;
        LocalDate mSelectDate2 = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate2, "mSelectDate");
        List<PhysicalStatusEntry> listCreateDayEntries = physicalStatusDataUtil2.createDayEntries(dailyPhysicalStatusReport2, mSelectDate2, 1);
        float fMax2 = 0.0f;
        for (PhysicalStatusEntry physicalStatusEntry2 : listCreateDayEntries) {
            fMax2 = Math.max(fMax2, physicalStatusEntry2.getY());
            physicalStatusEntry2.setEntryMinY(-1.0f);
        }
        List<PhysicalStatusEntry> list3 = this.mCTLEntryList;
        ufe<PhysicalStatusEntry> ufeVar2 = null;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCTLEntryList");
            list3 = null;
        }
        list3.clear();
        List<PhysicalStatusEntry> list4 = this.mCTLEntryList;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCTLEntryList");
            list4 = null;
        }
        list4.addAll(listCreateDayEntries);
        List<PhysicalStatusEntry> list5 = this.mATLEntryList;
        if (list5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mATLEntryList");
            list5 = null;
        }
        list5.clear();
        PhysicalStatusDataUtil physicalStatusDataUtil3 = PhysicalStatusDataUtil.INSTANCE;
        DailyPhysicalStatusReport dailyPhysicalStatusReport3 = this.mPhysicalStatusReport;
        LocalDate mSelectDate3 = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate3, "mSelectDate");
        List<PhysicalStatusEntry> listCreateDayEntries2 = physicalStatusDataUtil3.createDayEntries(dailyPhysicalStatusReport3, mSelectDate3, 2);
        for (PhysicalStatusEntry physicalStatusEntry3 : listCreateDayEntries2) {
            fMax2 = Math.max(fMax2, physicalStatusEntry3.getY());
            physicalStatusEntry3.setEntryMinY(-1.0f);
        }
        float f = 100;
        float fMax3 = Math.max((fMax2 - (fMax2 % f)) + f, 300.0f);
        rtr rtrVar = this.yCTLAxis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yCTLAxis");
            rtrVar = null;
        }
        rtrVar.mAxisMaximum = fMax3;
        rtr rtrVar2 = this.yCTLAxis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yCTLAxis");
            rtrVar2 = null;
        }
        rtrVar2.setLabelCount(5);
        rtr rtrVar3 = this.yCTLAxis;
        if (rtrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yCTLAxis");
            rtrVar3 = null;
        }
        rtrVar3.f = 5;
        rtr rtrVar4 = this.yATLAxis;
        if (rtrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yATLAxis");
            rtrVar4 = null;
        }
        rtrVar4.mAxisMaximum = fMax3;
        rtr rtrVar5 = this.yATLAxis;
        if (rtrVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yATLAxis");
            rtrVar5 = null;
        }
        rtrVar5.setLabelCount(5);
        rtr rtrVar6 = this.yATLAxis;
        if (rtrVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yATLAxis");
            rtrVar6 = null;
        }
        rtrVar6.f = 5;
        List<PhysicalStatusEntry> list6 = this.mATLEntryList;
        if (list6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mATLEntryList");
            list6 = null;
        }
        list6.addAll(listCreateDayEntries2);
        rtr rtrVar7 = this.mLineChartYAxis;
        Intrinsics.checkNotNull(rtrVar7);
        rtrVar7.mAxisMaximum = fMax;
        rtr rtrVar8 = this.mLineChartYAxis;
        Intrinsics.checkNotNull(rtrVar8);
        rtrVar8.mAxisMinimum = fMin;
        rtr rtrVar9 = this.mLineChartYAxis;
        if (rtrVar9 != null) {
            Intrinsics.checkNotNull(rtrVar9);
            Float fValueOf = Float.valueOf(rtrVar9.mAxisMaximum);
            Float fValueOf2 = Float.valueOf(15.0f);
            Float fValueOf3 = Float.valueOf(0.0f);
            Float fValueOf4 = Float.valueOf(-10.0f);
            Float fValueOf5 = Float.valueOf(-30.0f);
            rtr rtrVar10 = this.mLineChartYAxis;
            Intrinsics.checkNotNull(rtrVar10);
            rtrVar9.e(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, Float.valueOf(rtrVar10.mAxisMinimum)}));
        }
        ufe<PhysicalStatusEntry> ufeVar3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar3);
        ufeVar3.setYAxis(this.mLineChartYAxis);
        ufe<PhysicalStatusEntry> ufeVar4 = this.lineChartCTLAdapter;
        if (ufeVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartCTLAdapter");
            ufeVar4 = null;
        }
        ufeVar4.notifyDataSetChanged();
        ufe<PhysicalStatusEntry> ufeVar5 = this.lineChartATLAdapter;
        if (ufeVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartATLAdapter");
        } else {
            ufeVar2 = ufeVar5;
        }
        ufeVar2.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshPhysicalStatusReport() {
        cleanDataList();
        final LocalDate localDateMinusDays = this.mSelectDate.minusDays(41);
        LocalDate localDatePlusDays = this.mSelectDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        final long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Intrinsics.checkNotNull(localDateMinusDays);
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
        final LiveData<List<FitnessDeviceItem>> liveDataQueryDeviceList = ((PhysicalStatusViewModel) getMViewModel()).queryDeviceList(jChangZeroOfTheDay2, jChangZeroOfTheDay);
        Logger.i("MiHealth", "refreshVitalityReport request params" + this.mSelectDate + "/" + jChangZeroOfTheDay + "/" + jChangZeroOfTheDay2);
        liveDataQueryDeviceList.observe(getViewLifecycleOwner(), new PhysicalStatusDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jvh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PhysicalStatusDayFragment.refreshPhysicalStatusReport$lambda$5(this.f23182a, liveDataQueryDeviceList, localDateMinusDays, jChangZeroOfTheDay, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit refreshPhysicalStatusReport$lambda$5(final PhysicalStatusDayFragment this$0, LiveData queryDeviceLiveData, LocalDate localDate, long j, List list) {
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
                final LiveData<List<DailyBasicReport>> liveDataTriggerFetchFitnessReport = ((PhysicalStatusViewModel) this$0.getMViewModel()).triggerFetchFitnessReport(IPhysicalStatusRepository.class, "days", j, 41, 0, str);
                liveDataTriggerFetchFitnessReport.observe(this$0.getViewLifecycleOwner(), new PhysicalStatusDayFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ivh
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return PhysicalStatusDayFragment.refreshPhysicalStatusReport$lambda$5$lambda$4$lambda$3$lambda$2(this.f22135a, str, liveDataTriggerFetchFitnessReport, (List) obj);
                    }
                }));
            }
        }
        queryDeviceLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshPhysicalStatusReport$lambda$5$lambda$4$lambda$3$lambda$2(PhysicalStatusDayFragment this$0, String it, LiveData physicalStatusReportLiveData, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(physicalStatusReportLiveData, "$physicalStatusReportLiveData");
        if (!ArrayUtils.isEmpty(list)) {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyPhysicalStatusReport) {
                this$0.mSidReportMap.put(it, (DailyPhysicalStatusReport) dailyBasicReport);
            }
        }
        this$0.refreshViewIfNeed();
        physicalStatusReportLiveData.removeObservers(this$0.getViewLifecycleOwner());
        return Unit.INSTANCE;
    }

    private final void refreshTitleView() {
        DataTitleView dataTitleView = this.mDataCTLTitleView;
        if (dataTitleView != null) {
            dataTitleView.setVisibility(0);
        }
        DataTitleView dataTitleView2 = this.mDataATLTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.setVisibility(0);
        }
        DailyPhysicalStatusReport dailyPhysicalStatusReport = this.mPhysicalStatusReport;
        if ((dailyPhysicalStatusReport != null ? dailyPhysicalStatusReport.getLatestPhysicalStatusItem() : null) == null) {
            DataTitleView dataTitleView3 = this.mDataTitleView;
            if (dataTitleView3 != null) {
                dataTitleView3.c(getString(c0j.L6));
            }
            DataTitleView dataTitleView4 = this.mDataCTLTitleView;
            if (dataTitleView4 != null) {
                dataTitleView4.c(getString(c0j.L6));
            }
            DataTitleView dataTitleView5 = this.mDataATLTitleView;
            if (dataTitleView5 != null) {
                dataTitleView5.setVisibility(8);
                return;
            }
            return;
        }
        DataTitleView dataTitleView6 = this.mDataATLTitleView;
        if (dataTitleView6 != null) {
            dataTitleView6.setVisibility(0);
        }
        DailyPhysicalStatusReport dailyPhysicalStatusReport2 = this.mPhysicalStatusReport;
        PhysicalStatusItem latestPhysicalStatusItem = dailyPhysicalStatusReport2 != null ? dailyPhysicalStatusReport2.getLatestPhysicalStatusItem() : null;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i("MiHealth", "vitality current select sid " + this.mSid + ";current did " + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[2];
        objArr[0] = latestPhysicalStatusItem != null ? latestPhysicalStatusItem.getPhysicalFitnessStatus() : null;
        PhysicalStatusDataUtil physicalStatusDataUtil = PhysicalStatusDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        objArr[1] = physicalStatusDataUtil.getPhysicalStatusTitle(contextRequireContext, latestPhysicalStatusItem != null ? latestPhysicalStatusItem.getPhysicalStatusLevel() : -1);
        String str = String.format("%s %s", Arrays.copyOf(objArr, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Integer physicalFitnessStatus = latestPhysicalStatusItem != null ? latestPhysicalStatusItem.getPhysicalFitnessStatus() : null;
        LocalDate mSelectDate = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
        String dateMMddFormat = TimeDateUtil.getDateMMddFormat(mSelectDate);
        DataTitleView dataTitleView7 = this.mDataTitleView;
        if (dataTitleView7 != null) {
            dataTitleView7.a(requireContext(), str, String.valueOf(physicalFitnessStatus), dateMMddFormat);
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = latestPhysicalStatusItem != null ? latestPhysicalStatusItem.getPhysicalFitnessLevel() : null;
        objArr2[1] = requireContext().getString(c0j.gb);
        String str2 = String.format("%s %s", Arrays.copyOf(objArr2, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        DataTitleView dataTitleView8 = this.mDataCTLTitleView;
        if (dataTitleView8 != null) {
            dataTitleView8.a(requireContext(), str2, String.valueOf(latestPhysicalStatusItem != null ? latestPhysicalStatusItem.getPhysicalFitnessLevel() : null), "");
        }
        Object[] objArr3 = new Object[2];
        objArr3[0] = latestPhysicalStatusItem != null ? latestPhysicalStatusItem.getFatigueLevel() : null;
        objArr3[1] = requireContext().getString(c0j.fb);
        String str3 = String.format("%s %s", Arrays.copyOf(objArr3, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        DataTitleView dataTitleView9 = this.mDataATLTitleView;
        if (dataTitleView9 != null) {
            dataTitleView9.a(requireContext(), str3, String.valueOf(latestPhysicalStatusItem != null ? latestPhysicalStatusItem.getFatigueLevel() : null), dateMMddFormat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshViewIfNeed() {
        DailyPhysicalStatusReport dailyPhysicalStatusReport = this.mSidReportMap.isEmpty() ? null : this.mSidReportMap.get(this.mSid);
        this.mPhysicalStatusReport = dailyPhysicalStatusReport;
        Logger.i("MiHealth", "current sid " + this.mSid + ",refreshViewIfNeed VitalityReport ..  " + (dailyPhysicalStatusReport != null ? dailyPhysicalStatusReport.toString() : null));
        DataTitleView dataTitleView = this.mDataTitleView;
        if (dataTitleView != null) {
            dataTitleView.setVisibility(0);
        }
        refreshPhysicalStatusCard();
        refreshDetailCard();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void displayData() {
    }

    public final boolean getHrConfigFlag() {
        return this.hrConfigFlag;
    }

    @Nullable
    public final RecyclerView getMCardRecyclerDetail() {
        return this.mCardRecyclerDetail;
    }

    @Nullable
    public final LevelBarView getMLevelBarView() {
        return this.mLevelBarView;
    }

    @Nullable
    public final RecyclerView getMLevelDescRecyclerView() {
        return this.mLevelDescRecyclerView;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = qaa.A0(inflater, container, false);
        this.mLineChartRecycler = getBinding().N;
        this.mDataTitleView = getBinding().C;
        this.mCardRecyclerDetail = getBinding().O;
        this.mLevelBarView = getBinding().H;
        this.mLevelDescRecyclerView = getBinding().I;
        this.lineChartCTLRecyclerView = getBinding().M;
        this.lineChartATLRecyclerView = getBinding().L;
        this.mDataCTLTitleView = getBinding().E;
        this.mDataATLTitleView = getBinding().D;
        this.deviceListView = getBinding().F;
        this.understandCard = getBinding().Q;
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
            view2.setOnClickListener(new View.OnClickListener() { // from class: kvh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    PhysicalStatusDayFragment.onViewCreated$lambda$0(this.f24338a, view3);
                }
            });
        }
        getBinding().B.bindData(pni.M0, requireContext().getString(c0j.lb));
        Drawable drawableE = ni4.e(requireContext(), pni.c);
        Drawable drawableE2 = ni4.e(requireContext(), pni.c);
        if (drawableE != null && drawableE2 != null) {
            k47.n(drawableE, requireContext().getResources().getColor(iji.G0));
            drawableE.setBounds(0, 0, drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight());
            getBinding().K.setCompoundDrawablesRelative(drawableE, null, null, null);
            k47.n(drawableE2, requireContext().getResources().getColor(iji.F0));
            drawableE2.setBounds(0, 0, drawableE2.getIntrinsicWidth(), drawableE2.getIntrinsicHeight());
            getBinding().J.setCompoundDrawablesRelative(drawableE2, null, null, null);
        }
        initLineChartCard();
        initCTLLineChartCard();
        initATLLineChartCard();
        initDetailCard();
        initDeviceCard();
        refreshPhysicalStatusReport();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        setStatusBarFontBlack(true);
        getBundle();
        refreshPhysicalStatusReport();
        ((PhysicalStatusViewModel) getMViewModel()).requestShowHrOpenEnable();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void scrollToCurrentCycle() {
    }

    public final void setHrConfigFlag(boolean z) {
        this.hrConfigFlag = z;
    }

    public final void setMCardRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.mCardRecyclerDetail = recyclerView;
    }

    public final void setMLevelBarView(@Nullable LevelBarView levelBarView) {
        this.mLevelBarView = levelBarView;
    }

    public final void setMLevelDescRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mLevelDescRecyclerView = recyclerView;
    }
}
