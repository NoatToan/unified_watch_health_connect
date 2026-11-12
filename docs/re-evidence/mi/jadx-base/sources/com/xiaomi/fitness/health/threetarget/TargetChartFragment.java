package com.xiaomi.fitness.health.threetarget;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerItem;
import com.fitness.banner.export.IBanner;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.base.BaseDataFragment;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.threetarget.TargetChartFragment;
import com.xiaomi.fitness.health.threetarget.adpter.MedalListAdapter;
import com.xiaomi.fitness.health.threetarget.adpter.ViewPagerAdapter;
import com.xiaomi.fitness.health.threetarget.model.DataSourceModel;
import com.xiaomi.fitness.health.threetarget.model.TargetDetailModel;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetPermissionGuidePreference;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener;
import com.xiaomi.fitness.health.threetarget.view.TargetItemChartView;
import com.xiaomi.fitness.health.threetarget.view.VideoPreviewView;
import com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport.RecordViewModel;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.c0j;
import defpackage.ecf;
import defpackage.iji;
import defpackage.jui;
import defpackage.kha;
import defpackage.ogj;
import defpackage.pni;
import defpackage.y0p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u0002:\u0002\u009a\u0001B\b¢\u0006\u0005\b\u0099\u0001\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0005J#\u0010\u000e\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b#\u0010\"J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010\u0005J-\u00100\u001a\u00020/2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020-H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0003H\u0016¢\u0006\u0004\b8\u0010\u0005J\u000f\u00109\u001a\u00020\u0003H\u0014¢\u0006\u0004\b9\u0010\u0005J\u0019\u0010<\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b>\u0010=J\u0019\u0010?\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b?\u0010=J\u0019\u0010@\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b@\u0010=J\u0019\u0010A\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bA\u0010=J\u0019\u0010B\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bB\u0010=J)\u0010F\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0016¢\u0006\u0004\bF\u0010GJ#\u0010I\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010H\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010V\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010WR\u0018\u0010]\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010jR\u0016\u0010l\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bl\u0010jR\u0016\u0010m\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010jR \u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010oR \u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010oR \u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010oR\u001c\u0010v\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010dR\u0018\u0010|\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R'\u0010\u007f\u001a\u00020~8\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010\u0012R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001d\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010wR\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001d\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010wR\u0017\u0010\u0094\u0001\u001a\u00020:8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0014\u0010\u0098\u0001\u001a\u00020K8F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009b\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/TargetChartFragment;", "Lcom/xiaomi/fitness/health/threetarget/BaseTargetChartFragment;", "Lcom/xiaomi/fitness/health/threetarget/view/IPlayerEventListener;", "", "initView", "()V", "initVideoView", "bindReportRecord", "initData", "bindReport", "", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "newWeekDataMap", "fillWeekReportMap", "(Ljava/util/Map;)V", "report", "bindSelectedDayRainbow", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;)V", "refreshUIData", "", "getDataStatus", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;)Z", "initBanner", "getDataSourceList", "selectReport", "bindSelectedChartDaySummary", "fillWeekChartRecordMap", "monday", "refreshTargetWeekChartRecord", "(Lorg/joda/time/LocalDate;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;)V", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "getStandChartRecord", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMHIntensityChartRecord", "", "getValidDaysThisWeek", "()I", "initRecycler", "initMedalRecycle", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "clearLastSelectedWeekData", "", "fileName", "onInit", "(Ljava/lang/String;)V", "onReset", "onStopped", "onPlayed", "onPaused", "onFinished", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, VibrateModeSetFragment.MAX, "onProgress", "(Ljava/lang/String;JJ)V", "msg", "onError", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkha;", "_binding", "Lkha;", "Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "threeTargetView", "Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "getThreeTargetView", "()Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "setThreeTargetView", "(Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerBottom", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerBottom", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerBottom", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerMedal", "dataSourceView", "Landroid/view/View;", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "medalTitleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "Landroid/widget/LinearLayout;", "medalView", "Landroid/widget/LinearLayout;", "Lcom/xiaomi/fitness/sport/RecordViewModel;", "recordViewModel", "Lcom/xiaomi/fitness/sport/RecordViewModel;", "Lcom/xiaomi/fitness/health/threetarget/view/TargetItemChartView;", "mStepCharView", "Lcom/xiaomi/fitness/health/threetarget/view/TargetItemChartView;", "mCalCharView", "mStandCharView", "mMHIntensityCharView", "weekReportMap", "Ljava/util/Map;", "weekStepRecordMap", "weekCalRecordMap", "weekStandRecordMap", "weekIntensityRecordMap", "", "Lcom/xiaomi/fitness/health/threetarget/model/DataSourceModel;", "mDataSourceModelList", "Ljava/util/List;", "Lcom/xiaomi/fitness/health/threetarget/view/VideoPreviewView;", "mVideoView", "Lcom/xiaomi/fitness/health/threetarget/view/VideoPreviewView;", "targetView", "mSaveData", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mDailyGoalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getMDailyGoalReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "setMDailyGoalReport", "Ly0p;", "mDetailAdapter", "Ly0p;", "Lcom/xiaomi/fitness/health/threetarget/model/TargetDetailModel;", "mDetailList", "Lcom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter;", "mDetailMedalAdapter", "Lcom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter;", "Lecf$a$a;", "mDetailMedalList", "chinaRegion", "Ljava/lang/String;", "getBinding", "()Lkha;", "binding", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTargetChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetChartFragment.kt\ncom/xiaomi/fitness/health/threetarget/TargetChartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,645:1\n1557#2:646\n1628#2,2:647\n295#2,2:649\n1630#2:651\n1863#2,2:654\n1187#2,2:666\n1261#2,4:668\n216#3,2:652\n54#4,3:656\n24#4:659\n59#4,6:660\n*S KotlinDebug\n*F\n+ 1 TargetChartFragment.kt\ncom/xiaomi/fitness/health/threetarget/TargetChartFragment\n*L\n358#1:646\n358#1:647,2\n360#1:649,2\n358#1:651\n463#1:654,2\n577#1:666,2\n577#1:668,4\n445#1:652,2\n398#1:656,3\n398#1:659\n398#1:660,6\n*E\n"})
public final class TargetChartFragment extends Hilt_TargetChartFragment implements IPlayerEventListener {

    @NotNull
    public static final String TAG = "TargetChartFragment";

    @Nullable
    private kha _binding;

    @Nullable
    private View dataSourceView;
    private TargetItemChartView mCalCharView;

    @Nullable
    private DailyGoalReport mDailyGoalReport;

    @Nullable
    private y0p mDetailAdapter;

    @Nullable
    private MedalListAdapter mDetailMedalAdapter;
    private TargetItemChartView mMHIntensityCharView;

    @Nullable
    private LocalDate mSaveData;
    private TargetItemChartView mStandCharView;
    private TargetItemChartView mStepCharView;
    public UserInfoManager mUserInfoManager;

    @Nullable
    private VideoPreviewView mVideoView;

    @Nullable
    private DataTitleSimpleView medalTitleView;

    @Nullable
    private LinearLayout medalView;

    @Nullable
    private RecordViewModel recordViewModel;
    public RecyclerView recyclerBottom;
    private RecyclerView recyclerMedal;

    @Nullable
    private LinearLayout targetView;
    public ThreeTargetView threeTargetView;

    @NotNull
    private final Map<LocalDate, DailyGoalReport> weekReportMap = new LinkedHashMap();

    @NotNull
    private final Map<LocalDate, GoalItem> weekStepRecordMap = new LinkedHashMap();

    @NotNull
    private final Map<LocalDate, GoalItem> weekCalRecordMap = new LinkedHashMap();

    @NotNull
    private final Map<LocalDate, GoalItem> weekStandRecordMap = new LinkedHashMap();

    @NotNull
    private final Map<LocalDate, GoalItem> weekIntensityRecordMap = new LinkedHashMap();

    @NotNull
    private List<DataSourceModel> mDataSourceModelList = new ArrayList();

    @NotNull
    private final List<TargetDetailModel> mDetailList = new ArrayList();

    @NotNull
    private final List<ecf.a.C0923a> mDetailMedalList = new ArrayList();

    @NotNull
    private final String chinaRegion = "cn";

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.TargetChartFragment$getDataSourceList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.TargetChartFragment$getDataSourceList$1", f = "TargetChartFragment.kt", i = {}, l = {412}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DailyGoalReport $report;
        Object L$0;
        int label;
        final /* synthetic */ TargetChartFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DailyGoalReport dailyGoalReport, TargetChartFragment targetChartFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$report = dailyGoalReport;
            this.this$0 = targetChartFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$report, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (RainbowExKt.checkHasData(this.$report)) {
                    MutableLiveData<List<String>> sidModeList = this.this$0.getMRegularTargetViewModel().getSidModeList();
                    ThreeTargetViewModel threeTargetViewModel = (ThreeTargetViewModel) ((BaseDataFragment) this.this$0).basicDataViewModel;
                    DailyGoalReport mDailyGoalReport = this.this$0.getMDailyGoalReport();
                    Intrinsics.checkNotNull(mDailyGoalReport);
                    this.L$0 = sidModeList;
                    this.label = 1;
                    Object theDataSource = threeTargetViewModel.getTheDataSource(mDailyGoalReport, this);
                    if (theDataSource == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = sidModeList;
                    obj = theDataSource;
                } else {
                    View view = this.this$0.dataSourceView;
                    if (view != null) {
                        view.setVisibility(4);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.TargetChartFragment$getMHIntensityChartRecord$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.TargetChartFragment$getMHIntensityChartRecord$2", f = "TargetChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTargetChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetChartFragment.kt\ncom/xiaomi/fitness/health/threetarget/TargetChartFragment$getMHIntensityChartRecord$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,645:1\n1863#2,2:646\n*S KotlinDebug\n*F\n+ 1 TargetChartFragment.kt\ncom/xiaomi/fitness/health/threetarget/TargetChartFragment$getMHIntensityChartRecord$2\n*L\n505#1:646,2\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<LocalDate, GoalItem>>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TargetChartFragment.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (TargetChartFragment.this.weekIntensityRecordMap.size() < TargetChartFragment.this.getValidDaysThisWeek()) {
                List<DailyMHStrengthReport> mHIntensityWeekReportList = TargetChartFragment.access$getMViewModel(TargetChartFragment.this).getMHIntensityWeekReportList(TargetChartFragment.this.getStartTime());
                Logger.i("TargetChartFragment", "MHIntensity size(" + mHIntensityWeekReportList.size() + ")-" + TargetChartFragment.this.getStartTime());
                TargetChartFragment targetChartFragment = TargetChartFragment.this;
                for (DailyMHStrengthReport dailyMHStrengthReport : mHIntensityWeekReportList) {
                    Intrinsics.checkNotNull(dailyMHStrengthReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport");
                    LocalDate localDate = new LocalDate(dailyMHStrengthReport.getTime() * ((long) 1000));
                    if (!targetChartFragment.weekIntensityRecordMap.containsKey(localDate)) {
                        targetChartFragment.weekIntensityRecordMap.put(localDate, new GoalItem(4, 0, dailyMHStrengthReport.getDuration()));
                    }
                }
            }
            return TargetChartFragment.this.weekIntensityRecordMap;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<LocalDate, GoalItem>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.TargetChartFragment$getStandChartRecord$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.TargetChartFragment$getStandChartRecord$2", f = "TargetChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTargetChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetChartFragment.kt\ncom/xiaomi/fitness/health/threetarget/TargetChartFragment$getStandChartRecord$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,645:1\n1863#2,2:646\n*S KotlinDebug\n*F\n+ 1 TargetChartFragment.kt\ncom/xiaomi/fitness/health/threetarget/TargetChartFragment$getStandChartRecord$2\n*L\n485#1:646,2\n*E\n"})
    public static final class C25522 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<LocalDate, GoalItem>>, Object> {
        int label;

        public C25522(Continuation<? super C25522> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TargetChartFragment.this.new C25522(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (TargetChartFragment.this.weekStandRecordMap.size() < TargetChartFragment.this.getValidDaysThisWeek()) {
                List<DailyStandReport> standWeekReportList = TargetChartFragment.access$getMViewModel(TargetChartFragment.this).getStandWeekReportList(TargetChartFragment.this.getStartTime());
                Logger.i("TargetChartFragment", "stand size(" + standWeekReportList.size() + ")-" + TargetChartFragment.this.getStartTime());
                TargetChartFragment targetChartFragment = TargetChartFragment.this;
                for (DailyStandReport dailyStandReport : standWeekReportList) {
                    Intrinsics.checkNotNull(dailyStandReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport");
                    LocalDate localDate = new LocalDate(dailyStandReport.getTime() * ((long) 1000));
                    if (!targetChartFragment.weekStandRecordMap.containsKey(localDate)) {
                        targetChartFragment.weekStandRecordMap.put(localDate, new GoalItem(3, 0, dailyStandReport.getStandCount()));
                    }
                }
            }
            return TargetChartFragment.this.weekStandRecordMap;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<LocalDate, GoalItem>> continuation) {
            return ((C25522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.threetarget.TargetChartFragment$refreshTargetWeekChartRecord$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.threetarget.TargetChartFragment$refreshTargetWeekChartRecord$2", f = "TargetChartFragment.kt", i = {}, l = {471, 473}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25552 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $containStandChartView;
        final /* synthetic */ LocalDate $monday;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ TargetChartFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25552(Ref.BooleanRef booleanRef, TargetChartFragment targetChartFragment, LocalDate localDate, Continuation<? super C25552> continuation) {
            super(2, continuation);
            this.$containStandChartView = booleanRef;
            this.this$0 = targetChartFragment;
            this.$monday = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25552(this.$containStandChartView, this.this$0, this.$monday, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TargetItemChartView targetItemChartView;
            LocalDate localDate;
            LocalDate localDate2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                targetItemChartView = null;
                if (this.$containStandChartView.element) {
                    TargetItemChartView targetItemChartView2 = this.this$0.mStandCharView;
                    if (targetItemChartView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mStandCharView");
                    } else {
                        targetItemChartView = targetItemChartView2;
                    }
                    LocalDate localDate3 = this.$monday;
                    TargetChartFragment targetChartFragment = this.this$0;
                    this.L$0 = targetItemChartView;
                    this.L$1 = localDate3;
                    this.label = 1;
                    Object standChartRecord = targetChartFragment.getStandChartRecord(this);
                    if (standChartRecord == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    localDate2 = localDate3;
                    obj = standChartRecord;
                    LocalDate mSelectDate = this.this$0.mSelectDate;
                    Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
                    targetItemChartView.showChartRecord(localDate2, (Map) obj, mSelectDate);
                } else {
                    TargetItemChartView targetItemChartView3 = this.this$0.mMHIntensityCharView;
                    if (targetItemChartView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMHIntensityCharView");
                    } else {
                        targetItemChartView = targetItemChartView3;
                    }
                    LocalDate localDate4 = this.$monday;
                    TargetChartFragment targetChartFragment2 = this.this$0;
                    this.L$0 = targetItemChartView;
                    this.L$1 = localDate4;
                    this.label = 2;
                    Object mHIntensityChartRecord = targetChartFragment2.getMHIntensityChartRecord(this);
                    if (mHIntensityChartRecord == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    localDate = localDate4;
                    obj = mHIntensityChartRecord;
                    LocalDate mSelectDate2 = this.this$0.mSelectDate;
                    Intrinsics.checkNotNullExpressionValue(mSelectDate2, "mSelectDate");
                    targetItemChartView.showChartRecord(localDate, (Map) obj, mSelectDate2);
                }
            } else if (i == 1) {
                localDate2 = (LocalDate) this.L$1;
                targetItemChartView = (TargetItemChartView) this.L$0;
                ResultKt.throwOnFailure(obj);
                LocalDate mSelectDate3 = this.this$0.mSelectDate;
                Intrinsics.checkNotNullExpressionValue(mSelectDate3, "mSelectDate");
                targetItemChartView.showChartRecord(localDate2, (Map) obj, mSelectDate3);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                localDate = (LocalDate) this.L$1;
                targetItemChartView = (TargetItemChartView) this.L$0;
                ResultKt.throwOnFailure(obj);
                LocalDate mSelectDate4 = this.this$0.mSelectDate;
                Intrinsics.checkNotNullExpressionValue(mSelectDate4, "mSelectDate");
                targetItemChartView.showChartRecord(localDate, (Map) obj, mSelectDate4);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ThreeTargetViewModel access$getMViewModel(TargetChartFragment targetChartFragment) {
        return (ThreeTargetViewModel) targetChartFragment.getMViewModel();
    }

    private final void bindReport() {
        getMRegularTargetViewModel().getSidModeList().observe(getViewLifecycleOwner(), new TargetChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h0p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TargetChartFragment.bindReport$lambda$1(this.f19550a, (List) obj);
            }
        }));
        getMRegularTargetViewModel().getMWeekMapDataList().observe(getViewLifecycleOwner(), new TargetChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i0p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TargetChartFragment.bindReport$lambda$2(this.f20653a, (List) obj);
            }
        }));
        getLiveDataLastWeekSummary().observe(getViewLifecycleOwner(), new TargetChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j0p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TargetChartFragment.bindReport$lambda$3(this.f22310a, (Pair) obj);
            }
        }));
        getMRegularTargetViewModel().getCurrentSelectedDate().observe(getViewLifecycleOwner(), new TargetChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k0p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TargetChartFragment.bindReport$lambda$4(this.f23310a, (LocalDate) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReport$lambda$1(TargetChartFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list == null || list.size() <= 1) {
            View view = this$0.dataSourceView;
            if (view != null) {
                view.setVisibility(4);
            }
        } else {
            this$0.mDataSourceModelList.clear();
            List<DataSourceModel> dataSourceModelList = this$0.getMRegularTargetViewModel().getDataSourceModelList(list);
            this$0.mDataSourceModelList = dataSourceModelList;
            if (dataSourceModelList.size() > 1) {
                View view2 = this$0.dataSourceView;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            } else {
                View view3 = this$0.dataSourceView;
                if (view3 != null) {
                    view3.setVisibility(4);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReport$lambda$2(TargetChartFragment this$0, List list) {
        LocalDate localDateTimestampToLocalDate;
        DailyGoalReport dailyGoalReport;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DailyGoalReport dailyGoalReport2 = (DailyGoalReport) it.next();
                long startTime = this$0.getStartTime();
                long endTime = this$0.getEndTime();
                long time = dailyGoalReport2.getTime();
                if (startTime <= time && time < endTime && ((dailyGoalReport = this$0.weekReportMap.get((localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyGoalReport2.getTime())))) == null || !Intrinsics.areEqual(dailyGoalReport, dailyGoalReport2))) {
                    linkedHashMap.put(localDateTimestampToLocalDate, dailyGoalReport2);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this$0.fillWeekReportMap(linkedHashMap);
            this$0.fillWeekChartRecordMap();
            this$0.refreshUIData();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReport$lambda$3(TargetChartFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iIntValue = ((Number) pair.getFirst()).intValue();
        TargetItemChartView targetItemChartView = null;
        if (iIntValue == 1) {
            TargetItemChartView targetItemChartView2 = this$0.mStepCharView;
            if (targetItemChartView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStepCharView");
            } else {
                targetItemChartView = targetItemChartView2;
            }
            targetItemChartView.showRightLastWeekSummary(((Number) pair.getSecond()).intValue());
        } else if (iIntValue == 2) {
            TargetItemChartView targetItemChartView3 = this$0.mCalCharView;
            if (targetItemChartView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalCharView");
            } else {
                targetItemChartView = targetItemChartView3;
            }
            targetItemChartView.showRightLastWeekSummary(((Number) pair.getSecond()).intValue());
        } else if (iIntValue == 3) {
            TargetItemChartView targetItemChartView4 = this$0.mStandCharView;
            if (targetItemChartView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStandCharView");
            } else {
                targetItemChartView = targetItemChartView4;
            }
            targetItemChartView.showRightLastWeekSummary(((Number) pair.getSecond()).intValue());
        } else if (iIntValue == 4) {
            TargetItemChartView targetItemChartView5 = this$0.mMHIntensityCharView;
            if (targetItemChartView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMHIntensityCharView");
            } else {
                targetItemChartView = targetItemChartView5;
            }
            targetItemChartView.showRightLastWeekSummary(((Number) pair.getSecond()).intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReport$lambda$4(TargetChartFragment this$0, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Intrinsics.areEqual(this$0.mSelectDate, localDate)) {
            int iAbs = 959 - Math.abs(Weeks.weeksBetween(TimeDateUtil.getWeekMonday(this$0.getMTodayLocalDate()), TimeDateUtil.getWeekMonday(localDate)).getWeeks());
            ViewPager2 mViewPager = this$0.getMViewPager();
            if (mViewPager != null) {
                mViewPager.k(iAbs, false);
            }
        }
        this$0.mSelectDate = localDate;
        this$0.refreshUIData();
        return Unit.INSTANCE;
    }

    private final void bindReportRecord() {
        bindReport();
    }

    private final void bindSelectedChartDaySummary(DailyGoalReport selectReport) {
        for (GoalItem goalItem : selectReport.goalList()) {
            TargetItemChartView targetItemChartView = null;
            if (RainbowExKt.isSTepTarget(goalItem)) {
                TargetItemChartView targetItemChartView2 = this.mStepCharView;
                if (targetItemChartView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStepCharView");
                } else {
                    targetItemChartView = targetItemChartView2;
                }
                targetItemChartView.showLeftDaySummary(goalItem.getAchievedValue());
            } else if (RainbowExKt.isCalorieTarget(goalItem)) {
                TargetItemChartView targetItemChartView3 = this.mCalCharView;
                if (targetItemChartView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCalCharView");
                } else {
                    targetItemChartView = targetItemChartView3;
                }
                targetItemChartView.showLeftDaySummary(goalItem.getAchievedValue());
            } else if (RainbowExKt.isStandTarget(goalItem)) {
                TargetItemChartView targetItemChartView4 = this.mStandCharView;
                if (targetItemChartView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStandCharView");
                    targetItemChartView4 = null;
                }
                targetItemChartView4.setVisibility(0);
                TargetItemChartView targetItemChartView5 = this.mStandCharView;
                if (targetItemChartView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStandCharView");
                    targetItemChartView5 = null;
                }
                targetItemChartView5.showLeftDaySummary(goalItem.getAchievedValue());
                TargetItemChartView targetItemChartView6 = this.mMHIntensityCharView;
                if (targetItemChartView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMHIntensityCharView");
                } else {
                    targetItemChartView = targetItemChartView6;
                }
                targetItemChartView.setVisibility(8);
            } else if (RainbowExKt.isMHIntensityTarget(goalItem)) {
                TargetItemChartView targetItemChartView7 = this.mMHIntensityCharView;
                if (targetItemChartView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMHIntensityCharView");
                    targetItemChartView7 = null;
                }
                targetItemChartView7.setVisibility(0);
                TargetItemChartView targetItemChartView8 = this.mMHIntensityCharView;
                if (targetItemChartView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMHIntensityCharView");
                    targetItemChartView8 = null;
                }
                targetItemChartView8.showLeftDaySummary(goalItem.getAchievedValue());
                TargetItemChartView targetItemChartView9 = this.mStandCharView;
                if (targetItemChartView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStandCharView");
                } else {
                    targetItemChartView = targetItemChartView9;
                }
                targetItemChartView.setVisibility(8);
            }
        }
    }

    private final void bindSelectedDayRainbow(DailyGoalReport report) {
        List<GoalItem> listGoalList = report.goalList();
        this.mDetailList.clear();
        Iterator<GoalItem> it = listGoalList.iterator();
        while (it.hasNext()) {
            this.mDetailList.add(RainbowExKt.createDetailModel(it.next()));
        }
        y0p y0pVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(y0pVar);
        y0pVar.notifyDataSetChanged();
        getThreeTargetView().x(report, true);
        getThreeTargetView().g();
        getThreeTargetView().k();
    }

    private final void fillWeekChartRecordMap() {
        this.weekStepRecordMap.clear();
        this.weekCalRecordMap.clear();
        this.weekStandRecordMap.clear();
        this.weekIntensityRecordMap.clear();
        for (Map.Entry<LocalDate, DailyGoalReport> entry : this.weekReportMap.entrySet()) {
            for (GoalItem goalItem : entry.getValue().goalList()) {
                if (RainbowExKt.isSTepTarget(goalItem)) {
                    this.weekStepRecordMap.put(entry.getKey(), goalItem);
                } else if (RainbowExKt.isCalorieTarget(goalItem)) {
                    this.weekCalRecordMap.put(entry.getKey(), goalItem);
                } else if (RainbowExKt.isStandTarget(goalItem)) {
                    this.weekStandRecordMap.put(entry.getKey(), goalItem);
                } else if (RainbowExKt.isMHIntensityTarget(goalItem)) {
                    this.weekIntensityRecordMap.put(entry.getKey(), goalItem);
                }
            }
        }
    }

    private final void fillWeekReportMap(Map<LocalDate, DailyGoalReport> newWeekDataMap) {
        Logger.i("TargetChartFragment", "fillWeekReportMap:old size(" + this.weekReportMap.size() + "),new size(" + newWeekDataMap.size() + ") ");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(getStartTime());
        for (int i = 0; i < 7; i++) {
            LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(i);
            DailyGoalReport dailyGoalReport = newWeekDataMap.get(localDatePlusDays);
            DailyGoalReport dailyGoalReport2 = this.weekReportMap.get(localDatePlusDays);
            if (dailyGoalReport == null && dailyGoalReport2 != null) {
                Logger.i("TargetChartFragment", "fillWeekReportMap: not changed report(" + localDatePlusDays + ")");
                newWeekDataMap.put(localDatePlusDays, dailyGoalReport2);
            }
        }
        this.weekReportMap.clear();
        this.weekReportMap.putAll(newWeekDataMap);
    }

    private final void getDataSourceList(DailyGoalReport report) {
        ScopeExtKt.scopeLife$default((Fragment) this, (Lifecycle.Event) null, (CoroutineDispatcher) null, (Function2) new AnonymousClass1(report, this, null), 3, (Object) null);
    }

    private final boolean getDataStatus(DailyGoalReport report) {
        if (!(!report.goalList().isEmpty())) {
            return false;
        }
        for (GoalItem goalItem : report.goalList()) {
            if (goalItem.getAchievedValue() < goalItem.getGoalValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getMHIntensityChartRecord(Continuation<? super Map<LocalDate, GoalItem>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getStandChartRecord(Continuation<? super Map<LocalDate, GoalItem>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C25522(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getValidDaysThisWeek() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNull(localDateNow);
        if (ExtUtilKt.getMills(localDateNow) / ((long) 1000) < getEndTime()) {
            return localDateNow.getDayOfWeek();
        }
        return 7;
    }

    private final void initBanner() {
        getMRegularTargetViewModel().queryBannerDetailLiveData();
        getMRegularTargetViewModel().getBannerDataList().observe(getViewLifecycleOwner(), new TargetChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o0p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TargetChartFragment.initBanner$lambda$9(this.f28625a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initBanner$lambda$9(TargetChartFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        if (!list.isEmpty()) {
            final BannerItem bannerItem = (BannerItem) list.get(0);
            TextView ivBannerTitle = this$0.getBinding().C;
            Intrinsics.checkNotNullExpressionValue(ivBannerTitle, "ivBannerTitle");
            ViewExtKt.setVisible(ivBannerTitle, true);
            AppCompatImageView ivBanner = this$0.getBinding().B;
            Intrinsics.checkNotNullExpressionValue(ivBanner, "ivBanner");
            ViewExtKt.setVisible(ivBanner, true);
            AppCompatImageView ivBanner2 = this$0.getBinding().B;
            Intrinsics.checkNotNullExpressionValue(ivBanner2, "ivBanner");
            String iconHead = bannerItem.getIconHead();
            ImageLoader imageLoader = Coil.imageLoader(ivBanner2.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(ivBanner2.getContext()).data(iconHead).target(ivBanner2);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(16)));
            imageLoader.enqueue(builderTarget.build());
            this$0.getBinding().B.setOnClickListener(new View.OnClickListener() { // from class: l0p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TargetChartFragment.initBanner$lambda$9$lambda$8(bannerItem, view);
                }
            });
            BannerExtKt.getINSTANCE(IBanner.INSTANCE).onTrackBannerV1ClickOrExpose(bannerItem, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBanner$lambda$9$lambda$8(BannerItem bannerItem, View view) {
        Intrinsics.checkNotNullParameter(bannerItem, "$bannerItem");
        BannerExtKt.getINSTANCE(IBanner.INSTANCE).onBannerV1Click(bannerItem);
    }

    private final void initData() {
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        setMRegularTargetViewModel((DataRegularTargetViewModel) new ViewModelProvider(mActivity).get(DataRegularTargetViewModel.class));
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        this.recordViewModel = (RecordViewModel) new ViewModelProvider(mActivity2).get(RecordViewModel.class);
    }

    private final void initMedalRecycle() {
        if (AppUtil.INSTANCE.isPlayChannel() || !Intrinsics.areEqual(this.chinaRegion, RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion())) {
            LinearLayout linearLayout = this.medalView;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        DataTitleSimpleView dataTitleSimpleView = this.medalTitleView;
        if (dataTitleSimpleView != null) {
            dataTitleSimpleView.bindData(pni.N3, getString(c0j.rm));
        }
        DataTitleSimpleView dataTitleSimpleView2 = this.medalTitleView;
        if (dataTitleSimpleView2 != null) {
            dataTitleSimpleView2.showRightArrow();
        }
        LinearLayout linearLayout2 = this.medalView;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: m0p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TargetChartFragment.initMedalRecycle$lambda$12(this.f25632a, view);
                }
            });
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMActivity(), 0, false);
        RecyclerView recyclerView = this.recyclerMedal;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerMedal");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<ecf.a.C0923a> list = this.mDetailMedalList;
        RecyclerView recyclerView3 = this.recyclerMedal;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerMedal");
            recyclerView3 = null;
        }
        this.mDetailMedalAdapter = new MedalListAdapter(fragmentActivityRequireActivity, contextRequireContext, list, recyclerView3);
        RecyclerView recyclerView4 = this.recyclerMedal;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerMedal");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.setAdapter(this.mDetailMedalAdapter);
        getMRegularTargetViewModel().m465getMedalDataList();
        getMRegularTargetViewModel().getMedalDataList().observe(getViewLifecycleOwner(), new TargetChartFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: n0p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TargetChartFragment.initMedalRecycle$lambda$15(this.f27420a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMedalRecycle$lambda$12(TargetChartFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tip", "56.48.1.1.31239");
        linkedHashMap.put("name", "activity_page_achievement");
        linkedHashMap.put("btn_id", "000000");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.toMap(linkedHashMap));
        MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        medalManagerExtKt.goToMedalListActivity(fragmentActivityRequireActivity, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initMedalRecycle$lambda$15(TargetChartFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ecf.a aVar = (ecf.a) it.next();
            if (aVar.c == 5 && aVar.f16487a.size() >= 5) {
                List<ecf.a.C0923a> listSubList = aVar.f16487a.subList(0, 5);
                final List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{listSubList.get(4).o, listSubList.get(0).o, listSubList.get(1).o, listSubList.get(3).o, listSubList.get(2).o});
                Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(listListOf);
                final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                for (IndexedValue indexedValue : iterableWithIndex) {
                    Pair pair = TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(listSubList, new Comparator() { // from class: com.xiaomi.fitness.health.threetarget.TargetChartFragment$initMedalRecycle$lambda$15$$inlined$compareBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        Integer num;
                        Integer num2;
                        ecf.a.C0923a c0923a = (ecf.a.C0923a) t;
                        ecf.a.C0923a c0923a2 = (ecf.a.C0923a) t2;
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf((c0923a.t >= 1 && (num = (Integer) linkedHashMap.get(c0923a.o)) != null) ? num.intValue() : listListOf.size()), Integer.valueOf((c0923a2.t >= 1 && (num2 = (Integer) linkedHashMap.get(c0923a2.o)) != null) ? num2.intValue() : listListOf.size()));
                    }
                });
                if (!listSortedWith.isEmpty()) {
                    this$0.mDetailMedalList.clear();
                    this$0.mDetailMedalList.addAll(listSortedWith);
                }
            }
        }
        if (this$0.mDetailMedalList.size() > 0) {
            LinearLayout linearLayout = this$0.medalView;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            MedalListAdapter medalListAdapter = this$0.mDetailMedalAdapter;
            if (medalListAdapter != null) {
                medalListAdapter.notifyDataSetChanged();
            }
        } else {
            LinearLayout linearLayout2 = this$0.medalView;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    private final void initRecycler() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 9);
        getRecyclerBottom().setLayoutManager(gridLayoutManager);
        this.mDetailAdapter = new y0p(getMActivity(), this.mDetailList, jui.A6);
        getRecyclerBottom().setAdapter(this.mDetailAdapter);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.health.threetarget.TargetChartFragment.initRecycler.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                y0p y0pVar = TargetChartFragment.this.mDetailAdapter;
                Intrinsics.checkNotNull(y0pVar);
                return y0pVar.k(position);
            }
        });
    }

    private final void initVideoView() {
        VideoPreviewView videoPreviewView = this.mVideoView;
        if (videoPreviewView != null) {
            videoPreviewView.setZOrderOnTop(true);
        }
        VideoPreviewView videoPreviewView2 = this.mVideoView;
        if (videoPreviewView2 != null) {
            videoPreviewView2.setPLayerEventListener(this);
        }
        VideoPreviewView videoPreviewView3 = this.mVideoView;
        if (videoPreviewView3 != null) {
            videoPreviewView3.setLoop(false);
        }
    }

    private final void initView() {
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ThreeTargetPermissionGuidePreference threeTargetPermissionGuidePreference = ThreeTargetPermissionGuidePreference.INSTANCE;
        if (!timeUtils.isSameDay(jCurrentTimeMillis, threeTargetPermissionGuidePreference.getFIRST_TIME_SHOW_TIMESTAMP()) && threeTargetPermissionGuidePreference.getSHOW_COUNT() == 1) {
            threeTargetPermissionGuidePreference.setSHOW_COUNT(0);
        }
        initData();
        initRecycler();
        initMedalRecycle();
        View view = this.dataSourceView;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: p0p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TargetChartFragment.initView$lambda$0(this.f29880a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(TargetChartFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new ThreeTargetSourceDialog.Builder(this$0.mDataSourceModelList).setDialogTitle(c0j.dm).setPositiveText(c0j.common_known).create();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tip", "56.48.0.1.31235");
        linkedHashMap.put("name", "activity_page_main_source");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.toMap(linkedHashMap));
        commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
    }

    private final void refreshTargetWeekChartRecord(LocalDate monday, DailyGoalReport selectReport) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (GoalItem goalItem : selectReport.goalList()) {
            if (RainbowExKt.isStandTarget(goalItem)) {
                booleanRef.element = true;
            }
            if (RainbowExKt.isMHIntensityTarget(goalItem)) {
                booleanRef.element = false;
            }
        }
        TargetItemChartView targetItemChartView = this.mStepCharView;
        if (targetItemChartView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStepCharView");
            targetItemChartView = null;
        }
        Map<LocalDate, GoalItem> map = this.weekStepRecordMap;
        LocalDate mSelectDate = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
        targetItemChartView.showChartRecord(monday, map, mSelectDate);
        TargetItemChartView targetItemChartView2 = this.mCalCharView;
        if (targetItemChartView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalCharView");
            targetItemChartView2 = null;
        }
        Map<LocalDate, GoalItem> map2 = this.weekCalRecordMap;
        LocalDate mSelectDate2 = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate2, "mSelectDate");
        targetItemChartView2.showChartRecord(monday, map2, mSelectDate2);
        ScopeExtKt.scopeLife$default((Fragment) this, (Lifecycle.Event) null, (CoroutineDispatcher) null, (Function2) new C25552(booleanRef, this, monday, null), 3, (Object) null);
    }

    private final void refreshUIData() {
        List<DallyGoalItem> regularGoalList;
        Object next;
        DailyGoalReport dailyGoalReport = this.weekReportMap.get(this.mSelectDate);
        if (dailyGoalReport == null) {
            Logger.w("TargetChartFragment", "refreshUIData: mSelectDate(" + this.mSelectDate + ")), report is empty " + this.weekReportMap);
            this.mDailyGoalReport = dailyGoalReport;
            return;
        }
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(getStartTime());
        boolean dataStatus = getDataStatus(dailyGoalReport);
        LocalDate mSelectDate = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
        if (TimeDateUtil.isToday(mSelectDate) && ThreeTargetPermissionGuidePreference.INSTANCE.getSHOW_COUNT() == 0 && dataStatus && !UIUtils.INSTANCE.isTablet()) {
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            Intrinsics.checkNotNullExpressionValue(mActivity.getAssets(), "getAssets(...)");
            if (dailyGoalReport.containsStanding()) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                if (UIUtils.isNightMode(contextRequireContext)) {
                    VideoPreviewView videoPreviewView = this.mVideoView;
                    if (videoPreviewView != null) {
                        videoPreviewView.play(TargetDetailModel.VIDEO_THREE_TARGET_STAND_NIGHT_PROGRESS);
                    }
                } else {
                    VideoPreviewView videoPreviewView2 = this.mVideoView;
                    if (videoPreviewView2 != null) {
                        videoPreviewView2.play(TargetDetailModel.VIDEO_THREE_TARGET_STAND_PROGRESS);
                    }
                }
            } else {
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                if (UIUtils.isNightMode(contextRequireContext2)) {
                    VideoPreviewView videoPreviewView3 = this.mVideoView;
                    if (videoPreviewView3 != null) {
                        videoPreviewView3.play(TargetDetailModel.VIDEO_THREE_TARGET_MH_NIGHT_PROGRESS);
                    }
                } else {
                    VideoPreviewView videoPreviewView4 = this.mVideoView;
                    if (videoPreviewView4 != null) {
                        videoPreviewView4.play(TargetDetailModel.VIDEO_THREE_TARGET_MH_PROGRESS);
                    }
                }
            }
            LinearLayout linearLayout = this.targetView;
            if (linearLayout != null) {
                linearLayout.setVisibility(4);
            }
            getRecyclerBottom().setVisibility(4);
            VideoPreviewView videoPreviewView5 = this.mVideoView;
            if (videoPreviewView5 != null) {
                videoPreviewView5.setVisibility(0);
            }
        } else {
            getRecyclerBottom().setVisibility(0);
            LinearLayout linearLayout2 = this.targetView;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        }
        DailyGoalReport dailyGoalReport2 = this.mDailyGoalReport;
        if (dailyGoalReport2 == null || !Intrinsics.areEqual(dailyGoalReport2, dailyGoalReport)) {
            this.mDailyGoalReport = dailyGoalReport;
            bindSelectedDayRainbow(dailyGoalReport);
            bindSelectedChartDaySummary(dailyGoalReport);
            refreshTargetWeekChartRecord(localDateTimestampToLocalDate, dailyGoalReport);
            getDataSourceList(dailyGoalReport);
            return;
        }
        LocalDate mSelectDate2 = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate2, "mSelectDate");
        if (!TimeDateUtil.isToday(mSelectDate2) || (regularGoalList = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null).getRegularGoalList()) == null) {
            return;
        }
        List<GoalItem> listGoalList = dailyGoalReport.goalList();
        List<DallyGoalItem> list = regularGoalList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DallyGoalItem dallyGoalItem : list) {
            Iterator<T> it = listGoalList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((GoalItem) next).getType() != dallyGoalItem.getField());
            GoalItem goalItem = (GoalItem) next;
            arrayList.add(new GoalItem(dallyGoalItem.getField(), dallyGoalItem.getTarget(), goalItem != null ? goalItem.getAchievedValue() : 0));
        }
        if (!arrayList.isEmpty()) {
            this.mDetailList.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.mDetailList.add(RainbowExKt.createDetailModel((GoalItem) it2.next()));
            }
            y0p y0pVar = this.mDetailAdapter;
            if (y0pVar != null) {
                y0pVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.xiaomi.fitness.health.threetarget.BaseTargetChartFragment
    public void clearLastSelectedWeekData() {
        super.clearLastSelectedWeekData();
        this.weekReportMap.clear();
    }

    @NotNull
    public final kha getBinding() {
        kha khaVar = this._binding;
        Intrinsics.checkNotNull(khaVar);
        return khaVar;
    }

    @Nullable
    public final DailyGoalReport getMDailyGoalReport() {
        return this.mDailyGoalReport;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @NotNull
    public final RecyclerView getRecyclerBottom() {
        RecyclerView recyclerView = this.recyclerBottom;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerBottom");
        return null;
    }

    @NotNull
    public final ThreeTargetView getThreeTargetView() {
        ThreeTargetView threeTargetView = this.threeTargetView;
        if (threeTargetView != null) {
            return threeTargetView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("threeTargetView");
        return null;
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener
    public void onError(@Nullable String fileName, @Nullable String msg) {
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener
    public void onFinished(@Nullable String fileName) {
        LinearLayout linearLayout = this.targetView;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (UIUtils.isNightMode(contextRequireContext)) {
            VideoPreviewView videoPreviewView = this.mVideoView;
            if (videoPreviewView != null) {
                videoPreviewView.setBackgroundColor(ExtUtilsKt.getColor(iji.A3));
            }
            VideoPreviewView videoPreviewView2 = this.mVideoView;
            if (videoPreviewView2 != null) {
                videoPreviewView2.setVisibility(8);
            }
        } else {
            VideoPreviewView videoPreviewView3 = this.mVideoView;
            if (videoPreviewView3 != null) {
                videoPreviewView3.setBackgroundColor(ExtUtilsKt.getColor(iji.d3));
            }
        }
        VideoPreviewView videoPreviewView4 = this.mVideoView;
        if (videoPreviewView4 != null) {
            videoPreviewView4.setZOrderOnTop(false);
        }
        VideoPreviewView videoPreviewView5 = this.mVideoView;
        if (videoPreviewView5 != null) {
            videoPreviewView5.setZOrderMediaOverlay(false);
        }
        ThreeTargetPermissionGuidePreference threeTargetPermissionGuidePreference = ThreeTargetPermissionGuidePreference.INSTANCE;
        threeTargetPermissionGuidePreference.setFIRST_TIME_SHOW_TIMESTAMP(System.currentTimeMillis());
        threeTargetPermissionGuidePreference.setSHOW_COUNT(1);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = kha.A0(inflater, container, false);
        setMViewPager(getBinding().Q);
        this.dataSourceView = getBinding().H;
        setThreeTargetView(getBinding().P);
        setRecyclerBottom(getBinding().L);
        this.mStepCharView = getBinding().G;
        this.mCalCharView = getBinding().D;
        this.mStandCharView = getBinding().F;
        this.mMHIntensityCharView = getBinding().E;
        this.recyclerMedal = getBinding().I;
        this.medalTitleView = getBinding().J;
        this.medalView = getBinding().K;
        this.mVideoView = getBinding().O;
        this.targetView = getBinding().N;
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener
    public void onInit(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener
    public void onPaused(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener
    public void onPlayed(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener
    public void onProgress(@Nullable String fileName, long progress, long max) {
        y0p y0pVar;
        if (progress >= 1300 && (y0pVar = this.mDetailAdapter) != null && !y0pVar.l() && ThreeTargetPermissionGuidePreference.INSTANCE.getSHOW_COUNT() == 0) {
            y0p y0pVar2 = this.mDetailAdapter;
            if (y0pVar2 != null) {
                y0pVar2.o();
            }
            y0p y0pVar3 = this.mDetailAdapter;
            if (y0pVar3 != null) {
                y0pVar3.notifyDataSetChanged();
            }
            getRecyclerBottom().setVisibility(0);
        }
        if (ThreeTargetPermissionGuidePreference.INSTANCE.getSHOW_COUNT() == 0) {
            VideoPreviewView videoPreviewView = this.mVideoView;
            if (videoPreviewView != null) {
                videoPreviewView.setBackgroundColor(ExtUtilsKt.getColor(iji.A3));
                return;
            }
            return;
        }
        VideoPreviewView videoPreviewView2 = this.mVideoView;
        if (videoPreviewView2 != null) {
            videoPreviewView2.setVisibility(8);
        }
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener
    public void onReset(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.health.threetarget.BaseTargetChartFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LocalDate mSelectDate = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
        getDataOnSelectDate(mSelectDate);
        if (!Intrinsics.areEqual(getMRegularTargetViewModel().getCurrentSelectedDate().getValue(), this.mSelectDate) || this.weekReportMap.isEmpty()) {
            getMRegularTargetViewModel().setMCurrentWeekPosition(Days.daysBetween(TimeDateUtil.getWeekMonday(this.mSelectDate), this.mSelectDate).getDays());
            getMRegularTargetViewModel().getCurrentSelectedDate().postValue(this.mSelectDate);
            bindReportRecord();
        } else {
            refreshUIData();
        }
        getBinding().A.invalidate();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable("saved_date", this.mSelectDate);
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.IPlayerEventListener
    public void onStopped(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        getBundle();
        initView();
        initBanner();
        initVideoView();
        VideoPreviewView videoPreviewView = this.mVideoView;
        if (videoPreviewView != null) {
            videoPreviewView.setZOrderOnTop(true);
        }
        VideoPreviewView videoPreviewView2 = this.mVideoView;
        if (videoPreviewView2 != null) {
            videoPreviewView2.setZOrderMediaOverlay(true);
        }
        getRecyclerBottom().invalidate();
        final int days = Days.daysBetween(TimeDateUtil.getWeekMonday(getMTodayLocalDate()), getMTodayLocalDate()).getDays();
        if (getMRegularTargetViewModel().getMCurrentWeekPosition() == -1) {
            getMRegularTargetViewModel().setMCurrentWeekPosition(days);
        }
        LocalDate mTodayLocalDate = (LocalDate) (savedInstanceState != null ? savedInstanceState.getSerializable("saved_date") : null);
        if (mTodayLocalDate == null) {
            mTodayLocalDate = getMTodayLocalDate();
        }
        this.mSaveData = mTodayLocalDate;
        ViewPager2 mViewPager = getMViewPager();
        if (mViewPager != null) {
            mViewPager.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.health.threetarget.TargetChartFragment.onViewCreated.1
                @Override // androidx.viewpager2.widget.ViewPager2.i
                public void onPageSelected(int position) {
                    super.onPageSelected(position);
                    LocalDate weekMonday = TimeDateUtil.getWeekMonday(TargetChartFragment.this.getMTodayLocalDate().minusWeeks(959 - position));
                    TargetChartFragment.this.getMRegularTargetViewModel().getMCurrentWeekPosition();
                    TargetChartFragment targetChartFragment = TargetChartFragment.this;
                    targetChartFragment.mSelectDate = weekMonday.plusDays(targetChartFragment.getMRegularTargetViewModel().getMCurrentWeekPosition());
                    if (TargetChartFragment.this.mSelectDate.compareTo((ogj) LocalDate.now()) > 0) {
                        TargetChartFragment.this.mSelectDate = LocalDate.now();
                        TargetChartFragment.this.getMRegularTargetViewModel().setMCurrentWeekPosition(days);
                    }
                    if (Intrinsics.areEqual(TargetChartFragment.this.getMRegularTargetViewModel().getCurrentSelectedDate().getValue(), TargetChartFragment.this.mSelectDate)) {
                        return;
                    }
                    TargetChartFragment.this.getMRegularTargetViewModel().getCurrentSelectedDate().postValue(TargetChartFragment.this.mSelectDate);
                    TargetChartFragment targetChartFragment2 = TargetChartFragment.this;
                    LocalDate mSelectDate = targetChartFragment2.mSelectDate;
                    Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
                    targetChartFragment2.getDataOnSelectDate(mSelectDate);
                }
            });
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(fragmentActivityRequireActivity, ThreeTargetWeekFragment.class);
        ViewPager2 mViewPager2 = getMViewPager();
        if (mViewPager2 != null) {
            mViewPager2.setAdapter(viewPagerAdapter);
        }
        int iAbs = 959 - Math.abs(Weeks.weeksBetween(TimeDateUtil.getWeekMonday(this.mSaveData), TimeDateUtil.getWeekMonday(this.mSelectDate)).getWeeks());
        if (this.mSaveData != null) {
            getMRegularTargetViewModel().getCurrentSelectedDate().postValue(this.mSelectDate);
            LocalDate mSelectDate = this.mSelectDate;
            Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
            getDataOnSelectDate(mSelectDate);
        }
        ViewPager2 mViewPager3 = getMViewPager();
        if (mViewPager3 != null) {
            mViewPager3.k(iAbs, false);
        }
    }

    public final void setMDailyGoalReport(@Nullable DailyGoalReport dailyGoalReport) {
        this.mDailyGoalReport = dailyGoalReport;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setRecyclerBottom(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerBottom = recyclerView;
    }

    public final void setThreeTargetView(@NotNull ThreeTargetView threeTargetView) {
        Intrinsics.checkNotNullParameter(threeTargetView, "<set-?>");
        this.threeTargetView = threeTargetView;
    }
}
