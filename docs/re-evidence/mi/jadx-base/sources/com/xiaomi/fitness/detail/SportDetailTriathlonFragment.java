package com.xiaomi.fitness.detail;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.material.tabs.TabLayout;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.mi.health.map.data.GpsValues;
import com.mi.health.map.data.sportmodel.view.MapStyleSetting;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.detail.SportDetailTriathlonFragment;
import com.xiaomi.fitness.detail.inner.SportDetailInnerFragment;
import com.xiaomi.fitness.detail.recycler.SportDetailInnerAdapter;
import com.xiaomi.fitness.detail.util.SportDetailHelper;
import com.xiaomi.fitness.detail.util.SportRecordConstants;
import com.xiaomi.fitness.detail.video.share.util.SportTraceConstants;
import com.xiaomi.fitness.detail.view.SportMapStyleDialog;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.view.ShareLogoContainer;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import com.xiaomi.fitness.util.ConsistencyEventUtils;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordUtil;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.a5o;
import defpackage.aha;
import defpackage.b5o;
import defpackage.ben;
import defpackage.bsi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.o5o;
import defpackage.s2j;
import defpackage.v1q;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 r2\u00020\u0001:\u0001rB\u0007¢\u0006\u0004\bq\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J5\u0010\r\u001a\u00020\u00022$\u0010\f\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0014\u001a\u00020\u00022$\u0010\u0013\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J-\u0010,\u001a\u00020+2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u0010\u0004J\u0017\u00101\u001a\u00020\u00022\u0006\u00100\u001a\u00020)H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u0010\u0004J!\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010+¢\u0006\u0004\b8\u00109JK\u0010A\u001a\u00020\u00022:\u0010@\u001a6\u0012\u0015\u0012\u0013\u0018\u00010;¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(>\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00020:H\u0016¢\u0006\u0004\bA\u0010BJ9\u0010D\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010\"2\u001e\u0010@\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u0002\u0018\u00010:H\u0016¢\u0006\u0004\bD\u0010EJ/\u0010F\u001a\u00020\u00022\u001e\u0010@\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u0002\u0018\u00010:H\u0016¢\u0006\u0004\bF\u0010BJ-\u0010G\u001a\u00020\u00022\u001c\u0010@\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u00020:H\u0016¢\u0006\u0004\bG\u0010BJ\u000f\u0010H\u001a\u00020\u0002H\u0014¢\u0006\u0004\bH\u0010\u0004R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00160I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010LR,\u0010T\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010LR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001f0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010LR\u0016\u0010V\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010Y\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0011\u0010p\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/detail/SportDetailTriathlonFragment;", "Lcom/xiaomi/fitness/detail/SportDetailFragment;", "", "createMapDialog", "()V", "loadSportData", "initTriathlonInfoRecycler", "", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "sportRecordDataObjectMap", "bindTriathlonTypeData", "(Ljava/util/Map;)V", "bindTriathlonInfoData", "sportNum", "addTriathlonInfoItem", "(I)V", "dataObjectMap", "addTriathlonTypeItem", "(Ljava/util/Map;Ljava/lang/Integer;)V", "Lb5o;", "triathlonModelList", "initTopLayout", "(Ljava/util/List;)V", "initViewPagerAllViews", "", "", "createTableNames", "(Ljava/util/List;)[Ljava/lang/String;", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "createDetailInnerFragments", "(Ljava/util/List;)Ljava/util/List;", "Landroid/graphics/Bitmap;", "createContentBgBitmap", "()Landroid/graphics/Bitmap;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onLowMemory", "onDestroyView", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "updateHeight", "(Landroid/view/View;)V", "Lkotlin/Function2;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "longPicUri", "longPicBitmap", "callback", "generateLongShareBitmapIfNeed", "(Lkotlin/jvm/functions/Function2;)V", "bitmap", "createMapViewBitmap", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "createCommonBitmap", "createShareBitmap", "resetUIDisplay", "", "Lv1q;", "mTriathlonInfoList", "Ljava/util/List;", "La5o;", "mTriathlonInfoAdapter$delegate", "Lkotlin/Lazy;", "getMTriathlonInfoAdapter", "()La5o;", "mTriathlonInfoAdapter", "mTriathlonTypeList", "mSportDetailMapList", "fragmentList", "noPathView", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerTriathlonInfo", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerTriathlonInfo", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerTriathlonInfo", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Lcom/google/android/material/tabs/TabLayout;", "mTabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Laha;", "_binding", "Laha;", "Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "mapStyleSetting", "Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog;", "sportMapDialog", "Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog;", "getMBinding", "()Laha;", "mBinding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailTriathlonFragment extends SportDetailFragment {

    @NotNull
    public static final String TAG = "SportDetailTriathlonFragment";

    @Nullable
    private aha _binding;
    private TabLayout mTabLayout;

    @Nullable
    private MapStyleSetting mapStyleSetting;
    private View noPathView;

    @Nullable
    private RecyclerView recyclerTriathlonInfo;

    @Nullable
    private SportMapStyleDialog sportMapDialog;
    private ViewPager2 viewPager;

    @NotNull
    private final List<v1q> mTriathlonInfoList = new ArrayList();

    /* JADX INFO: renamed from: mTriathlonInfoAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTriathlonInfoAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gkn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportDetailTriathlonFragment.mTriathlonInfoAdapter_delegate$lambda$0(this.f19089a);
        }
    });

    @NotNull
    private final List<b5o> mTriathlonTypeList = new ArrayList();

    @NotNull
    private final List<Map<SportRecordKey, List<Object>>> mSportDetailMapList = new ArrayList();

    @NotNull
    private final List<SportDetailInnerFragment> fragmentList = new ArrayList();

    private final void addTriathlonInfoItem(int sportNum) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        if (sportNum == 0) {
            String strC = lp5.c(24);
            SportBasicReport mBasicReport = getMBasicReport();
            SportBasicReport openSwimmingReport = mBasicReport != null ? mBasicReport.getOpenSwimmingReport() : null;
            if ((openSwimmingReport != null ? openSwimmingReport.getDistance() : null) == null) {
                iIntValue = 0;
            } else {
                Integer distance = openSwimmingReport.getDistance();
                Intrinsics.checkNotNull(distance);
                iIntValue = distance.intValue();
            }
            this.mTriathlonInfoList.add(new v1q(strC, iIntValue, (openSwimmingReport != null ? Integer.valueOf(openSwimmingReport.getDuration()) : null) != null ? openSwimmingReport.getDuration() : 0));
            return;
        }
        if (sportNum == 1) {
            String strC2 = lp5.c(26);
            SportBasicReport mBasicReport2 = getMBasicReport();
            SportBasicReport outdoorRidingReport = mBasicReport2 != null ? mBasicReport2.getOutdoorRidingReport() : null;
            if ((outdoorRidingReport != null ? outdoorRidingReport.getDistance() : null) == null) {
                iIntValue2 = 0;
            } else {
                Integer distance2 = outdoorRidingReport.getDistance();
                Intrinsics.checkNotNull(distance2);
                iIntValue2 = distance2.intValue();
            }
            this.mTriathlonInfoList.add(new v1q(strC2, iIntValue2, (outdoorRidingReport != null ? Integer.valueOf(outdoorRidingReport.getDuration()) : null) != null ? outdoorRidingReport.getDuration() : 0));
            return;
        }
        if (sportNum != 2) {
            return;
        }
        String strC3 = lp5.c(22);
        SportBasicReport mBasicReport3 = getMBasicReport();
        SportBasicReport outdoorRunningReport = mBasicReport3 != null ? mBasicReport3.getOutdoorRunningReport() : null;
        if ((outdoorRunningReport != null ? outdoorRunningReport.getDistance() : null) == null) {
            iIntValue3 = 0;
        } else {
            Integer distance3 = outdoorRunningReport.getDistance();
            Intrinsics.checkNotNull(distance3);
            iIntValue3 = distance3.intValue();
        }
        this.mTriathlonInfoList.add(new v1q(strC3, iIntValue3, (outdoorRunningReport != null ? Integer.valueOf(outdoorRunningReport.getDuration()) : null) != null ? outdoorRunningReport.getDuration() : 0));
    }

    private final void addTriathlonTypeItem(Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>> dataObjectMap, Integer sportNum) {
        Map<SportRecordKey, List<Object>> map;
        MutableLiveData<List<SportBehaviorModel>> triathlonRunBehaviorLiveData;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps;
        MutableLiveData<List<SportBehaviorModel>> triathlonRidBehaviorLiveData;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRidMaps;
        MutableLiveData<List<SportBehaviorModel>> triathlonSwimBehaviorLiveData;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonSwimMaps;
        if (sportNum != null && sportNum.intValue() == 0) {
            Map<SportRecordKey, List<Object>> map2 = (Map) dataObjectMap.get(10);
            if (map2 != null) {
                this.mTriathlonTypeList.add(new b5o(lp5.c(24), hoi.a0, 24, sportNum.intValue(), false));
                this.mSportDetailMapList.add(map2);
                SportRecordDetailViewModel detailViewModel = getDetailViewModel();
                if (detailViewModel != null && (triathlonSwimMaps = detailViewModel.getTriathlonSwimMaps()) != null) {
                    triathlonSwimMaps.postValue(map2);
                }
                SportBasicReport mBasicReport = getMBasicReport();
                List<SportBehaviorModel> listB = ben.b(mBasicReport != null ? mBasicReport.getOpenSwimmingReport() : null);
                SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
                if (detailViewModel2 != null && (triathlonSwimBehaviorLiveData = detailViewModel2.getTriathlonSwimBehaviorLiveData()) != null) {
                    triathlonSwimBehaviorLiveData.postValue(listB);
                }
            }
        } else if (sportNum != null && sportNum.intValue() == 1) {
            Map<SportRecordKey, List<Object>> map3 = (Map) dataObjectMap.get(6);
            if (map3 != null) {
                this.mTriathlonTypeList.add(new b5o(lp5.c(26), hoi.Y, 26, sportNum.intValue(), false));
                this.mSportDetailMapList.add(map3);
                SportRecordDetailViewModel detailViewModel3 = getDetailViewModel();
                if (detailViewModel3 != null && (triathlonRidMaps = detailViewModel3.getTriathlonRidMaps()) != null) {
                    triathlonRidMaps.postValue(map3);
                }
                SportBasicReport mBasicReport2 = getMBasicReport();
                List<SportBehaviorModel> listB2 = ben.b(mBasicReport2 != null ? mBasicReport2.getOutdoorRidingReport() : null);
                SportRecordDetailViewModel detailViewModel4 = getDetailViewModel();
                if (detailViewModel4 != null && (triathlonRidBehaviorLiveData = detailViewModel4.getTriathlonRidBehaviorLiveData()) != null) {
                    triathlonRidBehaviorLiveData.postValue(listB2);
                }
            }
        } else if (sportNum != null && sportNum.intValue() == 2 && (map = (Map) dataObjectMap.get(1)) != null) {
            this.mTriathlonTypeList.add(new b5o(lp5.c(22), hoi.Z, 22, sportNum.intValue(), false));
            this.mSportDetailMapList.add(map);
            SportRecordDetailViewModel detailViewModel5 = getDetailViewModel();
            if (detailViewModel5 != null && (triathlonRunMaps = detailViewModel5.getTriathlonRunMaps()) != null) {
                triathlonRunMaps.postValue(map);
            }
            SportBasicReport mBasicReport3 = getMBasicReport();
            List<SportBehaviorModel> listB3 = ben.b(mBasicReport3 != null ? mBasicReport3.getOutdoorRunningReport() : null);
            SportRecordDetailViewModel detailViewModel6 = getDetailViewModel();
            if (detailViewModel6 != null && (triathlonRunBehaviorLiveData = detailViewModel6.getTriathlonRunBehaviorLiveData()) != null) {
                triathlonRunBehaviorLiveData.postValue(listB3);
            }
        }
        o5o.e().s(this.mSportDetailMapList);
    }

    private final void bindTriathlonInfoData() {
        int iIntValue;
        int iIntValue2;
        this.mTriathlonInfoList.clear();
        if (getMBasicReport() != null) {
            SportBasicReport mBasicReport = getMBasicReport();
            if ((mBasicReport != null ? mBasicReport.getFirstSport() : null) != null) {
                SportBasicReport mBasicReport2 = getMBasicReport();
                Integer firstSport = mBasicReport2 != null ? mBasicReport2.getFirstSport() : null;
                Intrinsics.checkNotNull(firstSport);
                addTriathlonInfoItem(firstSport.intValue());
            }
            SportBasicReport mBasicReport3 = getMBasicReport();
            if ((mBasicReport3 != null ? mBasicReport3.getSecondSport() : null) != null) {
                SportBasicReport mBasicReport4 = getMBasicReport();
                if ((mBasicReport4 != null ? mBasicReport4.getChangeItemADuration() : null) == null) {
                    iIntValue2 = 0;
                } else {
                    SportBasicReport mBasicReport5 = getMBasicReport();
                    Integer changeItemADuration = mBasicReport5 != null ? mBasicReport5.getChangeItemADuration() : null;
                    Intrinsics.checkNotNull(changeItemADuration);
                    iIntValue2 = changeItemADuration.intValue();
                }
                this.mTriathlonInfoList.add(new v1q(getString(j1j.x9), -1, iIntValue2));
                SportBasicReport mBasicReport6 = getMBasicReport();
                Integer secondSport = mBasicReport6 != null ? mBasicReport6.getSecondSport() : null;
                Intrinsics.checkNotNull(secondSport);
                addTriathlonInfoItem(secondSport.intValue());
            }
            SportBasicReport mBasicReport7 = getMBasicReport();
            if ((mBasicReport7 != null ? mBasicReport7.getThirdSport() : null) != null) {
                SportBasicReport mBasicReport8 = getMBasicReport();
                if ((mBasicReport8 != null ? mBasicReport8.getChangeItemBDuration() : null) == null) {
                    iIntValue = 0;
                } else {
                    SportBasicReport mBasicReport9 = getMBasicReport();
                    Integer changeItemBDuration = mBasicReport9 != null ? mBasicReport9.getChangeItemBDuration() : null;
                    Intrinsics.checkNotNull(changeItemBDuration);
                    iIntValue = changeItemBDuration.intValue();
                }
                this.mTriathlonInfoList.add(new v1q(getString(j1j.y9), -1, iIntValue));
                SportBasicReport mBasicReport10 = getMBasicReport();
                Integer thirdSport = mBasicReport10 != null ? mBasicReport10.getThirdSport() : null;
                Intrinsics.checkNotNull(thirdSport);
                addTriathlonInfoItem(thirdSport.intValue());
            }
        }
        if (this.mTriathlonInfoList.size() > 0) {
            RecyclerView recyclerView = this.recyclerTriathlonInfo;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            getMTriathlonInfoAdapter().notifyDataChanged();
            ConsistencyEventUtils.INSTANCE.reportCardInfo(getMBasicReport(), "triathlon_segment_detail", (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null);
        }
    }

    private final void bindTriathlonTypeData(Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>> sportRecordDataObjectMap) {
        this.mTriathlonTypeList.clear();
        this.mSportDetailMapList.clear();
        if (getMBasicReport() != null) {
            SportRecordUtil sportRecordUtil = SportRecordUtil.INSTANCE;
            SportBasicReport mBasicReport = getMBasicReport();
            Intrinsics.checkNotNull(mBasicReport);
            sportRecordUtil.computeTriathlonPaceAndSpeed(sportRecordDataObjectMap, mBasicReport);
            SportBasicReport mBasicReport2 = getMBasicReport();
            addTriathlonTypeItem(sportRecordDataObjectMap, mBasicReport2 != null ? mBasicReport2.getFirstSport() : null);
            SportBasicReport mBasicReport3 = getMBasicReport();
            addTriathlonTypeItem(sportRecordDataObjectMap, mBasicReport3 != null ? mBasicReport3.getSecondSport() : null);
            SportBasicReport mBasicReport4 = getMBasicReport();
            addTriathlonTypeItem(sportRecordDataObjectMap, mBasicReport4 != null ? mBasicReport4.getThirdSport() : null);
        }
    }

    private final Bitmap createContentBgBitmap() {
        ViewGroup.LayoutParams layoutParams = getMBinding().B.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).height = (DisplayUtil.getScreenHeight() / 2) + DisplayUtil.dip2px(100.0f);
        getMBinding().B.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{BaseFragmentExtKt.getColor(this, dki.n0), BaseFragmentExtKt.getColor(this, dki.n0)}));
        View contentBgView = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(contentBgView, "contentBgView");
        return ShareUtil.loadBitmapFromView$default(contentBgView, 0, 0, 6, null);
    }

    private final List<SportDetailInnerFragment> createDetailInnerFragments(List<? extends b5o> triathlonModelList) {
        int size = triathlonModelList.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Bundle bundleCreateIntentBundle = SportDetailInnerFragment.INSTANCE.createIntentBundle(getMBasicReport(), getSportDataType(), getShowFeedback());
            b5o b5oVar = triathlonModelList.get(i);
            SportDetailInnerFragment sportDetailInnerFragment = new SportDetailInnerFragment();
            bundleCreateIntentBundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, b5oVar.d);
            sportDetailInnerFragment.setArguments(bundleCreateIntentBundle);
            arrayList.add(sportDetailInnerFragment);
        }
        return arrayList;
    }

    private final void createMapDialog() {
        SportDetailHelper.Companion companion = SportDetailHelper.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportMapStyleDialog sportMapStyleDialogCreateSportMapStyleDialog$default = SportDetailHelper.createSportMapStyleDialog$default(companion.getInstance(fragmentActivityRequireActivity), this.mapStyleSetting, null, 0, Boolean.FALSE, 6, null);
        this.sportMapDialog = sportMapStyleDialogCreateSportMapStyleDialog$default;
        if (sportMapStyleDialogCreateSportMapStyleDialog$default != null) {
        }
    }

    private final String[] createTableNames(List<? extends b5o> triathlonModelList) {
        int size = triathlonModelList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = triathlonModelList.get(i).c;
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateLongShareBitmapIfNeed$lambda$18(Function2 callback, Uri uri, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(uri, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateLongShareBitmapIfNeed$lambda$19(Function2 callback, Uri uri, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(uri, bitmap);
        return Unit.INSTANCE;
    }

    private final a5o getMTriathlonInfoAdapter() {
        return (a5o) this.mTriathlonInfoAdapter.getValue();
    }

    private final void initTopLayout(List<? extends b5o> triathlonModelList) {
        ViewGroup viewGroup = null;
        if (triathlonModelList.isEmpty()) {
            TabLayout tabLayout = this.mTabLayout;
            if (tabLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            } else {
                viewGroup = tabLayout;
            }
            viewGroup.setVisibility(8);
            return;
        }
        final String[] strArrCreateTableNames = createTableNames(triathlonModelList);
        this.fragmentList.clear();
        this.fragmentList.addAll(createDetailInnerFragments(triathlonModelList));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportDetailInnerAdapter sportDetailInnerAdapter = new SportDetailInnerAdapter(fragmentActivityRequireActivity, this.fragmentList);
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        viewPager2.setAdapter(sportDetailInnerAdapter);
        TabLayout tabLayout2 = this.mTabLayout;
        if (tabLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            tabLayout2 = null;
        }
        tabLayout2.addOnTabSelectedListener(new TabLayout.d() { // from class: com.xiaomi.fitness.detail.SportDetailTriathlonFragment.initTopLayout.1
            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabReselected(TabLayout.g tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabSelected(TabLayout.g tab) {
                View viewE;
                if ((tab != null ? tab.e() : null) == null && tab != null) {
                    tab.o(ivi.p1);
                }
                TextView textView = (tab == null || (viewE = tab.e()) == null) ? null : (TextView) viewE.findViewById(bsi.p7);
                if (textView != null) {
                    textView.setTextAppearance(s2j.f33210b);
                }
                if (textView != null) {
                    String[] strArr = strArrCreateTableNames;
                    Integer numValueOf = tab != null ? Integer.valueOf(tab.g()) : null;
                    Intrinsics.checkNotNull(numValueOf);
                    textView.setText(strArr[numValueOf.intValue()]);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabUnselected(TabLayout.g tab) {
                View viewE;
                if ((tab != null ? tab.e() : null) == null && tab != null) {
                    tab.o(ivi.o1);
                }
                TextView textView = (tab == null || (viewE = tab.e()) == null) ? null : (TextView) viewE.findViewById(bsi.p7);
                if (textView != null) {
                    textView.setTextAppearance(s2j.c);
                }
                if (textView != null) {
                    String[] strArr = strArrCreateTableNames;
                    Integer numValueOf = tab != null ? Integer.valueOf(tab.g()) : null;
                    Intrinsics.checkNotNull(numValueOf);
                    textView.setText(strArr[numValueOf.intValue()]);
                }
            }
        });
        TabLayout tabLayout3 = this.mTabLayout;
        if (tabLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayout");
            tabLayout3 = null;
        }
        ViewPager2 viewPager3 = this.viewPager;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager3 = null;
        }
        new com.google.android.material.tabs.b(tabLayout3, viewPager3, new com.google.android.material.tabs.b.InterfaceC0219b() { // from class: lkn
            @Override // com.google.android.material.tabs.b.InterfaceC0219b
            public final void a(TabLayout.g gVar, int i) {
                SportDetailTriathlonFragment.initTopLayout$lambda$15(strArrCreateTableNames, gVar, i);
            }
        }).a();
        ViewPager2 viewPager4 = this.viewPager;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager4 = null;
        }
        viewPager4.setOffscreenPageLimit(2);
        initViewPagerAllViews();
        ViewPager2 viewPager5 = this.viewPager;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        } else {
            viewGroup = viewPager5;
        }
        View childAt = viewGroup.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) childAt).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTopLayout$lambda$15(String[] mTitles, TabLayout.g tab, int i) {
        Intrinsics.checkNotNullParameter(mTitles, "$mTitles");
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i < mTitles.length) {
            tab.v(mTitles[i]);
        }
    }

    private final void initTriathlonInfoRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMActivity());
        RecyclerView recyclerView = this.recyclerTriathlonInfo;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.recyclerTriathlonInfo;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(getMTriathlonInfoAdapter());
        }
    }

    private final void initViewPagerAllViews() {
        ViewPager2 viewPager2 = null;
        if (this.fragmentList.size() > 0) {
            ViewPager2 viewPager3 = this.viewPager;
            if (viewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager3 = null;
            }
            viewPager3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.detail.SportDetailTriathlonFragment.initViewPagerAllViews.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ViewTreeObserver viewTreeObserver;
                    if (((SportDetailInnerFragment) SportDetailTriathlonFragment.this.fragmentList.get(0)).getView() != null) {
                        View view = ((SportDetailInnerFragment) SportDetailTriathlonFragment.this.fragmentList.get(0)).getView();
                        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                            final SportDetailTriathlonFragment sportDetailTriathlonFragment = SportDetailTriathlonFragment.this;
                            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.detail.SportDetailTriathlonFragment$initViewPagerAllViews$1$onGlobalLayout$1
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public void onGlobalLayout() {
                                    ViewTreeObserver viewTreeObserver2;
                                    SportDetailTriathlonFragment sportDetailTriathlonFragment2 = sportDetailTriathlonFragment;
                                    sportDetailTriathlonFragment2.updateHeight(((SportDetailInnerFragment) sportDetailTriathlonFragment2.fragmentList.get(0)).getView());
                                    View view2 = ((SportDetailInnerFragment) sportDetailTriathlonFragment.fragmentList.get(0)).getView();
                                    if (view2 == null || (viewTreeObserver2 = view2.getViewTreeObserver()) == null) {
                                        return;
                                    }
                                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                                }
                            });
                        }
                        ViewPager2 viewPager4 = SportDetailTriathlonFragment.this.viewPager;
                        if (viewPager4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                            viewPager4 = null;
                        }
                        viewPager4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        ViewPager2 viewPager4 = this.viewPager;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        } else {
            viewPager2 = viewPager4;
        }
        viewPager2.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.detail.SportDetailTriathlonFragment.initViewPagerAllViews.2
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
                if (state == 0) {
                    SportDetailTriathlonFragment sportDetailTriathlonFragment = SportDetailTriathlonFragment.this;
                    sportDetailTriathlonFragment.updateHeight(((SportDetailInnerFragment) sportDetailTriathlonFragment.fragmentList.get(intRef.element)).getView());
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                intRef.element = position;
            }
        });
    }

    private final void loadSportData() {
        MutableLiveData<GpsValues> gpsValuesLiveData;
        MutableLiveData<Map<Integer, Map<SportRecordKey, List<Object>>>> recordTriathlonDetailMaps;
        SportRecordDetailViewModel detailViewModel;
        if (getMBasicReport() != null && getIsPrepared() && supportGpsSport() && (detailViewModel = getDetailViewModel()) != null) {
            detailViewModel.getGPSAndRecordData(getMBasicReport());
        }
        initTriathlonInfoRecycler();
        setMarginViewHeight(Boolean.FALSE);
        if (getMBasicReport() != null && getIsPrepared() && supportGpsSport()) {
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 != null && (recordTriathlonDetailMaps = detailViewModel2.getRecordTriathlonDetailMaps()) != null) {
                recordTriathlonDetailMaps.observe(requireActivity(), new SportDetailTriathlonFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: okn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailTriathlonFragment.loadSportData$lambda$14$lambda$8(this.f29260a, (Map) obj);
                    }
                }));
            }
            SportRecordDetailViewModel detailViewModel3 = getDetailViewModel();
            if (detailViewModel3 != null && (gpsValuesLiveData = detailViewModel3.getGpsValuesLiveData()) != null) {
                gpsValuesLiveData.observe(requireActivity(), new SportDetailTriathlonFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pkn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailTriathlonFragment.loadSportData$lambda$14$lambda$10(this.f30507a, (GpsValues) obj);
                    }
                }));
            }
            ImageView imgLocation = getImgLocation();
            if (imgLocation != null) {
                ViewExtKt.clickWithTrigger$default(imgLocation, 0L, new Function1() { // from class: qkn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailTriathlonFragment.loadSportData$lambda$14$lambda$11(this.f31609a, (ImageView) obj);
                    }
                }, 1, null);
            }
            ImageView imgMapDialog = getImgMapDialog();
            if (imgMapDialog != null) {
                ViewExtKt.clickWithTrigger$default(imgMapDialog, 0L, new Function1() { // from class: rkn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailTriathlonFragment.loadSportData$lambda$14$lambda$13(this.f32644a, (ImageView) obj);
                    }
                }, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    public static final Unit loadSportData$lambda$14$lambda$10(final SportDetailTriathlonFragment this$0, GpsValues gpsValues) {
        boolean z;
        LinearLayout imgSportTrace;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isInvalid()) {
            this$0.setMGpsValues(gpsValues);
            SportPathMapView sportPathView = this$0.getSportPathView();
            if (sportPathView != null) {
                sportPathView.setIShareMapView(this$0);
            }
            View view = null;
            if (GpsValues.validGpsValue(this$0.getMGpsValues())) {
                Logger.d("SportDetailFragment", "validGpsValue path");
                if (AppUtil.INSTANCE.isPlayChannel()) {
                    z = false;
                } else {
                    SportRecordDetailViewModel detailViewModel = this$0.getDetailViewModel();
                    Intrinsics.checkNotNull(detailViewModel);
                    if (detailViewModel.supportGpsSport(this$0.getMBasicReport()) && GpsValues.validGpsValue(this$0.getMGpsValues())) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                this$0.setGpsPathValid(z);
                LinearLayout imgSportTrace2 = this$0.getImgSportTrace();
                if (imgSportTrace2 != null) {
                    ViewExtKt.setVisible(imgSportTrace2, this$0.supportSportTraceSelect());
                }
                if (this$0.supportSportTraceSelect() && (imgSportTrace = this$0.getImgSportTrace()) != null) {
                    ViewExtKt.clickWithTrigger$default(imgSportTrace, 0L, new Function1() { // from class: nkn
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SportDetailTriathlonFragment.loadSportData$lambda$14$lambda$10$lambda$9(this.f28021a, (LinearLayout) obj);
                        }
                    }, 1, null);
                }
                SportPathMapView sportPathView2 = this$0.getSportPathView();
                if (sportPathView2 != null) {
                    SportBasicReport mBasicReport = this$0.getMBasicReport();
                    Intrinsics.checkNotNull(mBasicReport);
                    SportPathMapView.bindData$default(sportPathView2, mBasicReport, this$0.getMGpsValues(), 0, 4, null);
                }
                o5o o5oVarE = o5o.e();
                SportBasicReport mBasicReport2 = this$0.getMBasicReport();
                Intrinsics.checkNotNull(mBasicReport2);
                o5oVarE.k(mBasicReport2.getTimeStamp(), this$0.getMGpsValues());
                View view2 = this$0.noPathView;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("noPathView");
                } else {
                    view = view2;
                }
                ViewExtKt.gone(view);
                SportPathMapView sportPathView3 = this$0.getSportPathView();
                if (sportPathView3 != null) {
                    ViewExtKt.visible(sportPathView3);
                }
                this$0.setMarginViewHeight(Boolean.TRUE);
            } else {
                Logger.d("SportDetailFragment", "validGpsValue no path");
                ImageView imgLocation = this$0.getImgLocation();
                if (imgLocation != null) {
                    imgLocation.setVisibility(8);
                }
                ImageView imgMapDialog = this$0.getImgMapDialog();
                if (imgMapDialog != null) {
                    imgMapDialog.setVisibility(8);
                }
                SportPathMapView sportPathView4 = this$0.getSportPathView();
                if (sportPathView4 != null) {
                    sportPathView4.showEmptyView();
                }
                View view3 = this$0.noPathView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("noPathView");
                } else {
                    view = view3;
                }
                ViewExtKt.visible(view);
                SportPathMapView sportPathView5 = this$0.getSportPathView();
                if (sportPathView5 != null) {
                    ViewExtKt.gone(sportPathView5);
                }
                this$0.setMarginViewHeight(Boolean.FALSE);
            }
            this$0.getMapScrollView().setMarginHeight(ExtUtilsKt.getDp(Float.valueOf(400.0f)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSportData$lambda$14$lambda$10$lambda$9(SportDetailTriathlonFragment this$0, LinearLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.intentToShareVideo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSportData$lambda$14$lambda$11(SportDetailTriathlonFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.locationPath();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSportData$lambda$14$lambda$13(SportDetailTriathlonFragment this$0, ImageView it) {
        Boolean mShowMailPoint;
        String mMapStyle;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        boolean zBooleanValue = false;
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36902");
        pairArr[1] = TuplesKt.to("name", "change_map");
        pairArr[2] = TuplesKt.to("type_str", String.valueOf(this$0.getSportTitle().getText()));
        SportBasicReport mBasicReport = this$0.getMBasicReport();
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(mBasicReport != null ? Integer.valueOf(mBasicReport.getSportType()) : null));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        if (this$0.sportMapDialog == null) {
            this$0.createMapDialog();
        }
        SportMapStyleDialog sportMapStyleDialog = this$0.sportMapDialog;
        if (sportMapStyleDialog != null) {
            if (!sportMapStyleDialog.isShowing()) {
                SportPathMapView sportPathView = this$0.getSportPathView();
                if (sportPathView == null || (mMapStyle = sportPathView.getMMapStyle()) == null) {
                    mMapStyle = "";
                }
                sportMapStyleDialog.setMapStyle(mMapStyle);
            }
            SportPathMapView sportPathView2 = this$0.getSportPathView();
            if (sportPathView2 != null && (mShowMailPoint = sportPathView2.getMShowMailPoint()) != null) {
                zBooleanValue = mShowMailPoint.booleanValue();
            }
            sportMapStyleDialog.setSwitchStatue(zBooleanValue);
            sportMapStyleDialog.showIfNeed(this$0.requireActivity().getSupportFragmentManager());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSportData$lambda$14$lambda$8(SportDetailTriathlonFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isInvalid()) {
            Intrinsics.checkNotNull(map);
            this$0.bindTriathlonTypeData(map);
            this$0.bindTriathlonInfoData();
            this$0.initTopLayout(this$0.mTriathlonTypeList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a5o mTriathlonInfoAdapter_delegate$lambda$0(SportDetailTriathlonFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new a5o(this$0.getMActivity(), this$0.mTriathlonInfoList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SportDetailTriathlonFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.showMailsPoints(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SportDetailTriathlonFragment this$0, String style, String name) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(name, "name");
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.setCurrentMapStyle(style);
        }
        SportPathMapView sportPathView2 = this$0.getSportPathView();
        if (sportPathView2 != null) {
            sportPathView2.setCurrentMapStyleName(name);
        }
        SportPathMapView sportPathView3 = this$0.getSportPathView();
        if (sportPathView3 != null) {
            sportPathView3.setCustomMapStyleWithLocalResource(style, name);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(SportDetailTriathlonFragment this$0, List styleList, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(styleList, "styleList");
        if (styleList.size() >= 2) {
            SportPathMapView sportPathView = this$0.getSportPathView();
            if (sportPathView != null) {
                sportPathView.setChoiceIndex(i);
            }
            SportPathMapView sportPathView2 = this$0.getSportPathView();
            if (sportPathView2 != null) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), ((Number) styleList.get(0)).intValue());
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
                sportPathView2.setMark(bitmapDecodeResource, true);
            }
            SportPathMapView sportPathView3 = this$0.getSportPathView();
            if (sportPathView3 != null) {
                Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), ((Number) styleList.get(1)).intValue());
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(...)");
                sportPathView3.setMark(bitmapDecodeResource2, false);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(SportDetailTriathlonFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.loadMapStyle(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(SportDetailTriathlonFragment this$0, AppCompatTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36902");
        pairArr[1] = TuplesKt.to("name", "btn_no_track");
        pairArr[2] = TuplesKt.to("type_str", String.valueOf(this$0.getSportTitle().getText()));
        SportBasicReport mBasicReport = this$0.getMBasicReport();
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(mBasicReport != null ? Integer.valueOf(mBasicReport.getSportType()) : null));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        WebViewUtilKt.startWebView$default(SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "missing_tracks"), null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHeight$lambda$17(View view, SportDetailTriathlonFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewPager2 viewPager2 = this$0.viewPager;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        if (viewPager2.getLayoutParams().height != view.getMeasuredHeight()) {
            ViewPager2 viewPager4 = this$0.viewPager;
            if (viewPager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager4 = null;
            }
            ViewPager2 viewPager5 = this$0.viewPager;
            if (viewPager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            } else {
                viewPager3 = viewPager5;
            }
            ViewGroup.LayoutParams layoutParams = viewPager3.getLayoutParams();
            layoutParams.height = view.getMeasuredHeight();
            viewPager4.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void createCommonBitmap(@Nullable Function2<? super Uri, ? super Bitmap, Unit> callback) {
        SportDetailTriathlonFragment sportDetailTriathlonFragment = this;
        int size = sportDetailTriathlonFragment.fragmentList.size();
        int defBorderMargin = DisplayUtil.INSTANCE.getDefBorderMargin();
        int i = 0;
        int shareHeight = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SportDetailInnerFragment sportDetailInnerFragment = sportDetailTriathlonFragment.fragmentList.get(i2);
            sportDetailInnerFragment.createShareBitmap();
            shareHeight += sportDetailInnerFragment.getShareHeight() + defBorderMargin;
        }
        ViewPager2 viewPager2 = sportDetailTriathlonFragment.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        int width = viewPager2.getWidth();
        int i3 = defBorderMargin * 2;
        float f = ((width - i3) * 1.0f) / width;
        SportShareBottomView shareBottomView = getShareBottomView();
        Intrinsics.checkNotNull(shareBottomView);
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(shareBottomView, 0, 0, 6, null);
        int height = shareHeight + bitmapLoadBitmapFromView$default.getHeight();
        SportRecordBasicInfoView sportRecordBasic = getMBinding().U;
        Intrinsics.checkNotNullExpressionValue(sportRecordBasic, "sportRecordBasic");
        Bitmap bitmapLoadBitmapFromView$default2 = ShareUtil.loadBitmapFromView$default(sportRecordBasic, 0, 0, 6, null);
        int height2 = height + ((int) (bitmapLoadBitmapFromView$default2.getHeight() * f));
        RecyclerView recyclerView = sportDetailTriathlonFragment.recyclerTriathlonInfo;
        Intrinsics.checkNotNull(recyclerView);
        Bitmap bitmapLoadBitmapFromView$default3 = ShareUtil.loadBitmapFromView$default(recyclerView, 0, 0, 6, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height2 + ((int) (bitmapLoadBitmapFromView$default3.getHeight() * f)) + defBorderMargin, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(x44.a(dki.n0));
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        float f2 = defBorderMargin;
        matrix.postTranslate(f2, 0);
        canvas.drawBitmap(bitmapLoadBitmapFromView$default2, matrix, null);
        int height3 = ((int) (bitmapLoadBitmapFromView$default2.getHeight() * f)) + defBorderMargin;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f, f);
        matrix2.postTranslate(f2, height3);
        canvas.drawBitmap(bitmapLoadBitmapFromView$default3, matrix2, null);
        int height4 = height3 + bitmapLoadBitmapFromView$default3.getHeight() + defBorderMargin;
        int i4 = 0;
        while (i4 < size) {
            List<Bitmap> shareBitmapList = sportDetailTriathlonFragment.fragmentList.get(i4).getShareBitmapList();
            int size2 = shareBitmapList.size();
            while (i < size2) {
                Bitmap bitmap = shareBitmapList.get(i);
                int i5 = i == 0 ? defBorderMargin / 2 : defBorderMargin;
                Matrix matrix3 = new Matrix();
                matrix3.setScale(f, f);
                matrix3.postTranslate(f2, height4);
                canvas.drawBitmap(bitmap, matrix3, null);
                height4 += ((int) (bitmap.getHeight() * f)) + i5;
                i++;
                size = size;
            }
            i4++;
            sportDetailTriathlonFragment = this;
            i = 0;
        }
        canvas.drawBitmap(bitmapLoadBitmapFromView$default, 0.0f, height4 - i3, (Paint) null);
        Uri uriSaveImgToTempWithCustomizedName = ShareUtil.INSTANCE.saveImgToTempWithCustomizedName(bitmapCreateBitmap, SportReportShareExtKt.DEFAULT_SPORT_SHARE_FILE_NAME);
        if (callback != null) {
            callback.invoke(uriSaveImgToTempWithCustomizedName, bitmapCreateBitmap);
        }
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void createMapViewBitmap(@Nullable Bitmap bitmap, @Nullable Function2<? super Uri, ? super Bitmap, Unit> callback) {
        SportDetailTriathlonFragment sportDetailTriathlonFragment = this;
        int size = sportDetailTriathlonFragment.fragmentList.size();
        int mapMarginViewHeightWithStatueBar = bitmap == null ? 0 : SportRecordUtil.INSTANCE.getMapMarginViewHeightWithStatueBar();
        int defBorderMargin = DisplayUtil.INSTANCE.getDefBorderMargin();
        ViewPager2 viewPager2 = sportDetailTriathlonFragment.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        int width = viewPager2.getWidth();
        int i = defBorderMargin * 2;
        float f = ((width - i) * 1.0f) / width;
        int shareHeight = mapMarginViewHeightWithStatueBar;
        for (int i2 = 0; i2 < size; i2++) {
            SportDetailInnerFragment sportDetailInnerFragment = sportDetailTriathlonFragment.fragmentList.get(i2);
            sportDetailInnerFragment.createShareBitmap();
            shareHeight += ((int) (sportDetailInnerFragment.getShareHeight() * f)) + defBorderMargin;
        }
        ShareLogoContainer shareLogo = getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(shareLogo, "shareLogo");
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(shareLogo, 0, 0, 6, null);
        Bitmap bitmapLoadBitmapFromView$default2 = ShareUtil.loadBitmapFromView$default(getShareBottomView(), 0, 0, 6, null);
        int height = shareHeight + bitmapLoadBitmapFromView$default2.getHeight();
        SportRecordBasicInfoView sportRecordBasic = getMBinding().U;
        Intrinsics.checkNotNullExpressionValue(sportRecordBasic, "sportRecordBasic");
        Bitmap bitmapLoadBitmapFromView$default3 = ShareUtil.loadBitmapFromView$default(sportRecordBasic, 0, 0, 6, null);
        int height2 = height + ((int) (bitmapLoadBitmapFromView$default3.getHeight() * f));
        RecyclerView recyclerView = sportDetailTriathlonFragment.recyclerTriathlonInfo;
        Intrinsics.checkNotNull(recyclerView);
        Bitmap bitmapLoadBitmapFromView$default4 = ShareUtil.loadBitmapFromView$default(recyclerView, 0, 0, 6, null);
        int height3 = height2 + ((int) (bitmapLoadBitmapFromView$default4.getHeight() * f)) + defBorderMargin;
        Bitmap bitmapCreateContentBgBitmap = createContentBgBitmap();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(x44.a(dki.n0));
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        SportDetailFragment.Companion companion = SportDetailFragment.INSTANCE;
        canvas.drawBitmap(bitmapCreateContentBgBitmap, 0.0f, mapMarginViewHeightWithStatueBar - companion.getContentTopMargin(), (Paint) null);
        float f2 = defBorderMargin;
        canvas.drawBitmap(bitmapLoadBitmapFromView$default, f2, f2, (Paint) null);
        int contentTopMargin = mapMarginViewHeightWithStatueBar - companion.getContentTopMargin();
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        matrix.postTranslate(0.0f, contentTopMargin);
        canvas.drawBitmap(bitmapLoadBitmapFromView$default3, matrix, null);
        int height4 = mapMarginViewHeightWithStatueBar + ((int) ((bitmapLoadBitmapFromView$default3.getHeight() * f) - companion.getContentTopMargin())) + defBorderMargin;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f, f);
        matrix2.postTranslate(f2, height4);
        canvas.drawBitmap(bitmapLoadBitmapFromView$default4, matrix2, null);
        int height5 = height4 + ((int) (bitmapLoadBitmapFromView$default4.getHeight() * f)) + defBorderMargin;
        int i3 = 0;
        while (i3 < size) {
            List<Bitmap> shareBitmapList = sportDetailTriathlonFragment.fragmentList.get(i3).getShareBitmapList();
            int size2 = shareBitmapList.size();
            int i4 = 0;
            while (i4 < size2) {
                Bitmap bitmap2 = shareBitmapList.get(i4);
                int i5 = i4 == 0 ? defBorderMargin / 2 : defBorderMargin;
                Matrix matrix3 = new Matrix();
                matrix3.setScale(f, f);
                matrix3.postTranslate(f2, height5);
                canvas.drawBitmap(bitmap2, matrix3, null);
                height5 += ((int) (bitmap2.getHeight() * f)) + i5;
                i4++;
            }
            i3++;
            sportDetailTriathlonFragment = this;
        }
        canvas.drawBitmap(bitmapLoadBitmapFromView$default2, 0.0f, height5 - i, (Paint) null);
        Uri uriSaveImgToTempWithCustomizedName = ShareUtil.INSTANCE.saveImgToTempWithCustomizedName(bitmapCreateBitmap, SportReportShareExtKt.DEFAULT_SPORT_SHARE_FILE_NAME);
        if (callback != null) {
            callback.invoke(uriSaveImgToTempWithCustomizedName, bitmapCreateBitmap);
        }
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment
    public void createShareBitmap(@NotNull Function2<? super Uri, ? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.createShareBitmap(callback);
        }
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment
    public void generateLongShareBitmapIfNeed(@NotNull final Function2<? super Uri, ? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!GpsValues.validGpsValue(getMGpsValues()) || getMBasicReport() == null) {
            Logger.i(TAG, "intentToShareLongPic no gps path");
            createCommonBitmap(new Function2() { // from class: tkn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportDetailTriathlonFragment.generateLongShareBitmapIfNeed$lambda$19(callback, (Uri) obj, (Bitmap) obj2);
                }
            });
        } else {
            Logger.i(TAG, "intentToShareLongPic has gps path");
            createShareBitmap(new Function2() { // from class: skn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportDetailTriathlonFragment.generateLongShareBitmapIfNeed$lambda$18(callback, (Uri) obj, (Bitmap) obj2);
                }
            });
        }
    }

    @NotNull
    public final aha getMBinding() {
        aha ahaVar = this._binding;
        Intrinsics.checkNotNull(ahaVar);
        return ahaVar;
    }

    @Nullable
    public final RecyclerView getRecyclerTriathlonInfo() {
        return this.recyclerTriathlonInfo;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.onDestroy();
        }
        this.sportMapDialog = null;
        SportDetailHelper.Companion companion = SportDetailHelper.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        companion.getInstance(fragmentActivityRequireActivity).setDialogNull();
        super.onDestroyView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = aha.A0(inflater, container, false);
        setSportPathView(getMBinding().T);
        this.noPathView = getMBinding().M;
        setImgBack(getMBinding().E);
        setImgShare(getMBinding().I);
        setImgDelete(getMBinding().F);
        setImgLocation(getMBinding().H);
        setImgMapDialog(getMBinding().G);
        setSportTitle(getMBinding().X);
        setMarginView(getMBinding().L);
        setShareBottomView(getMBinding().Q);
        setBasicInfoView(getMBinding().U);
        setRecordDetailContent(getMBinding().O);
        setMapScrollView(getMBinding().K);
        setOutContainer(getMBinding().N);
        setSportShareLongView(getMBinding().W);
        this.recyclerTriathlonInfo = getMBinding().P;
        this.viewPager = getMBinding().c0;
        this.mTabLayout = getMBinding().J;
        setImgSportTrace(getMBinding().Y);
        View root = getMBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.onLowMemory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.onPause();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.onSaveInstanceState(outState);
        }
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.onCreate(savedInstanceState);
        }
        this.mapStyleSetting = new MapStyleSetting(new Function1() { // from class: ukn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailTriathlonFragment.onViewCreated$lambda$1(this.f35891a, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: vkn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportDetailTriathlonFragment.onViewCreated$lambda$2(this.f36984a, (String) obj, (String) obj2);
            }
        }, new Function2() { // from class: hkn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportDetailTriathlonFragment.onViewCreated$lambda$3(this.f20172a, (List) obj, ((Integer) obj2).intValue());
            }
        }, new Function1() { // from class: ikn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailTriathlonFragment.onViewCreated$lambda$4(this.f21259a, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: jkn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailTriathlonFragment.onViewCreated$lambda$5(((Boolean) obj).booleanValue());
            }
        });
        SportPathMapView sportPathView2 = getSportPathView();
        if (sportPathView2 != null) {
            sportPathView2.setMapStyleSetting(this.mapStyleSetting);
        }
        createMapDialog();
        loadSportData();
        ViewExtKt.clickWithTrigger$default(getMBinding().a0, 0L, new Function1() { // from class: kkn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailTriathlonFragment.onViewCreated$lambda$6(this.f23954a, (AppCompatTextView) obj);
            }
        }, 1, null);
        SportPathMapView sportPathView3 = getSportPathView();
        if (sportPathView3 != null) {
            sportPathView3.setCustomMapStyleWithLocalResource(SportTraceConstants.MAP_STYLE_RES_ID_BIAOZHUN, SportTraceConstants.MAP_STYLE_NAME_BIAOZHUN);
        }
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment
    public void resetUIDisplay() {
    }

    public final void setRecyclerTriathlonInfo(@Nullable RecyclerView recyclerView) {
        this.recyclerTriathlonInfo = recyclerView;
    }

    public final void updateHeight(@Nullable final View view) {
        if (view != null) {
            view.post(new Runnable() { // from class: mkn
                @Override // java.lang.Runnable
                public final void run() {
                    SportDetailTriathlonFragment.updateHeight$lambda$17(view, this);
                }
            });
        }
    }
}
