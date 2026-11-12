package com.xiaomi.fitness.share.report;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.mi.health.map.data.GpsValues;
import com.mi.health.map.data.sportmodel.share.IShareMapLongView;
import com.mi.health.map.data.util.SportReportMapPreference;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.inner.SportDetailInnerFragment;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.share.report.CompactTraceCardFragment;
import com.xiaomi.wearable.gpsalgorithm.utils.SportRecordComputeUtil;
import defpackage.a5a;
import defpackage.bsi;
import defpackage.dki;
import defpackage.ivi;
import defpackage.lp5;
import defpackage.o5o;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001DB\u0007¢\u0006\u0004\bC\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0012\u001a\u00020\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0007J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0007J9\u0010'\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"2\u001e\u0010&\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u0005\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(JM\u0010-\u001a\u00020\u00052<\u0010&\u001a8\u0012\u0015\u0012\u0013\u0018\u00010%¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0018\u00010$H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0005¢\u0006\u0004\b3\u0010\u0007R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/share/report/CompactTraceCardFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "La5a;", "Lcom/mi/health/map/data/sportmodel/share/IShareMapLongView;", "", "getDataAndDrawCompactTraceCard", "()V", "bindGpsValues", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "resultMap", "insertIntegerPoint", "(Ljava/util/Map;)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "processRecordData", "(Ljava/util/Map;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onLowMemory", "onDestroyView", LifecycleConstantKt.ON_DESTROY, "Landroid/graphics/Bitmap;", "mapBitmap", "Lkotlin/Function2;", "Landroid/net/Uri;", "callback", "createMapViewBitmap", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/ParameterName;", "name", "commonBitmapUri", "commonBitmap", "createCommonBitmap", "(Lkotlin/jvm/functions/Function2;)V", "", "isBlack", "setStatueTextWhite", "(Z)V", "releaseMapResources", "Lcom/mi/health/data/sportmodel/view/SportPathMapView;", "sportPathView", "Lcom/mi/health/data/sportmodel/view/SportPathMapView;", "basicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "fragmentInner", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "Lcom/xiaomi/fitness/detail/view/SportRecordBasicInfoView;", "basicInfoView", "Lcom/xiaomi/fitness/detail/view/SportRecordBasicInfoView;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CompactTraceCardFragment extends BaseBindingFragment<SportRecordDetailViewModel, a5a> implements IShareMapLongView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CompactTraceCardFragment";

    @Nullable
    private SportRecordBasicInfoView basicInfoView;
    private SportBasicReport basicReport;

    @Nullable
    private SportDetailInnerFragment fragmentInner;

    @Nullable
    private SportPathMapView sportPathView;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/share/report/CompactTraceCardFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/share/report/CompactTraceCardFragment;", "sportBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CompactTraceCardFragment newInstance(@NotNull SportBasicReport sportBasicReport) {
            Intrinsics.checkNotNullParameter(sportBasicReport, "sportBasicReport");
            CompactTraceCardFragment compactTraceCardFragment = new CompactTraceCardFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("sport_report", sportBasicReport);
            compactTraceCardFragment.setArguments(bundle);
            return compactTraceCardFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindGpsValues() {
        ((SportRecordDetailViewModel) getMViewModel()).getRecordDetailMaps().observe(getViewLifecycleOwner(), new CompactTraceCardFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g94
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CompactTraceCardFragment.bindGpsValues$lambda$4(this.f18745a, (Map) obj);
            }
        }));
        ((SportRecordDetailViewModel) getMViewModel()).getGpsValuesLiveData().observe(getViewLifecycleOwner(), new CompactTraceCardFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h94
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CompactTraceCardFragment.bindGpsValues$lambda$5(this.f19823a, (GpsValues) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindGpsValues$lambda$4(CompactTraceCardFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("SportDetailFragment", "recordDetailMaps observe invoke!!");
        Intrinsics.checkNotNull(map);
        this$0.insertIntegerPoint(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindGpsValues$lambda$5(CompactTraceCardFragment this$0, GpsValues gpsValues) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportPathMapView sportPathMapView = this$0.sportPathView;
        SportBasicReport sportBasicReport = null;
        if (sportPathMapView != null) {
            SportBasicReport sportBasicReport2 = this$0.basicReport;
            if (sportBasicReport2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("basicReport");
                sportBasicReport2 = null;
            }
            sportPathMapView.bindData(sportBasicReport2, gpsValues, ExtUtilsKt.getDp(300));
        }
        SportPathMapView sportPathMapView2 = this$0.sportPathView;
        if (sportPathMapView2 != null) {
            sportPathMapView2.showMailsPoints(SportReportMapPreference.INSTANCE.getSPORT_SHOW_MAIL_POINTS());
        }
        o5o o5oVarE = o5o.e();
        SportBasicReport sportBasicReport3 = this$0.basicReport;
        if (sportBasicReport3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("basicReport");
        } else {
            sportBasicReport = sportBasicReport3;
        }
        o5oVarE.k(sportBasicReport.getTimeStamp(), gpsValues);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMapViewBitmap$lambda$11(CompactTraceCardFragment this$0, Bitmap bitmap, Function2 function2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinearLayout recordDetailContent = this$0.getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(recordDetailContent, "recordDetailContent");
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(recordDetailContent, 0, 0, 6, null);
        int height = bitmapLoadBitmapFromView$default.getHeight();
        int height2 = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLoadBitmapFromView$default.getWidth(), height2, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Logger.i(TAG, "createMapViewBitmap  basicCardBitmap height=" + bitmapLoadBitmapFromView$default.getHeight() + " ");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(BaseFragmentExtKt.getColor(this$0, dki.n0));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapLoadBitmapFromView$default, 0.0f, (((float) height2) - ((float) height)) - ((float) 20), (Paint) null);
        Uri uriSaveImgToTempWithCustomizedName = ShareUtil.INSTANCE.saveImgToTempWithCustomizedName(bitmapCreateBitmap, SportReportShareExtKt.COMPACT_TRACE_FILE_NAME);
        Logger.i(TAG, "createMapViewBitmap uri=" + uriSaveImgToTempWithCustomizedName);
        if (function2 != null) {
            function2.invoke(uriSaveImgToTempWithCustomizedName, bitmapCreateBitmap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getDataAndDrawCompactTraceCard() {
        SportRecordDetailViewModel sportRecordDetailViewModel = (SportRecordDetailViewModel) getMViewModel();
        SportBasicReport sportBasicReport = this.basicReport;
        SportBasicReport sportBasicReport2 = null;
        if (sportBasicReport == null) {
            Intrinsics.throwUninitializedPropertyAccessException("basicReport");
            sportBasicReport = null;
        }
        sportRecordDetailViewModel.getGPSAndRecordData(sportBasicReport);
        SportRecordDetailViewModel sportRecordDetailViewModel2 = (SportRecordDetailViewModel) getMViewModel();
        SportBasicReport sportBasicReport3 = this.basicReport;
        if (sportBasicReport3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("basicReport");
            sportBasicReport3 = null;
        }
        sportRecordDetailViewModel2.getCompactTraceBasicCardDataList(sportBasicReport3);
        ((SportRecordDetailViewModel) getMViewModel()).getRecordDetailMaps().observe(getViewLifecycleOwner(), new CompactTraceCardFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i94
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CompactTraceCardFragment.getDataAndDrawCompactTraceCard$lambda$3(this.f20899a, (Map) obj);
            }
        }));
        SportBasicReport sportBasicReport4 = this.basicReport;
        if (sportBasicReport4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("basicReport");
            sportBasicReport4 = null;
        }
        int iA = lp5.a(sportBasicReport4);
        SportDetailInnerFragment.Companion companion = SportDetailInnerFragment.INSTANCE;
        SportBasicReport sportBasicReport5 = this.basicReport;
        if (sportBasicReport5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("basicReport");
        } else {
            sportBasicReport2 = sportBasicReport5;
        }
        Bundle bundleCreateIntentBundle = companion.createIntentBundle(sportBasicReport2, iA, false);
        int i = bsi.S;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.fragmentInner = companion.switchSportDetailFragment(i, SportDetailInnerFragment.class, "SportDetailInnerFragment", bundleCreateIntentBundle, childFragmentManager);
        bindGpsValues();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDataAndDrawCompactTraceCard$lambda$3(CompactTraceCardFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "recordDetailMaps observe invoke!!");
        Intrinsics.checkNotNull(map);
        SportBasicReport sportBasicReport = this$0.basicReport;
        if (sportBasicReport == null) {
            Intrinsics.throwUninitializedPropertyAccessException("basicReport");
            sportBasicReport = null;
        }
        this$0.processRecordData(map, sportBasicReport);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void insertIntegerPoint(final Map<SportRecordKey, List<Object>> resultMap) {
        ((SportRecordDetailViewModel) getMViewModel()).getGpsValuesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: c94
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CompactTraceCardFragment.insertIntegerPoint$lambda$6(this.f5066a, resultMap, (GpsValues) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIntegerPoint$lambda$6(CompactTraceCardFragment this$0, Map resultMap, GpsValues gpsValues) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resultMap, "$resultMap");
        if (gpsValues == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new CompactTraceCardFragment$insertIntegerPoint$1$1(gpsValues, resultMap, this$0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CompactTraceCardFragment this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportRecordBasicInfoView sportRecordBasicInfoView = this$0.basicInfoView;
        if (sportRecordBasicInfoView != null) {
            sportRecordBasicInfoView.updateHeaderInfo(accountCoreInfo, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CompactTraceCardFragment this$0, String str, List infoList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(infoList, "infoList");
        Logger.d(TAG, "fresh observe infoList=" + infoList);
        SportRecordBasicInfoView sportRecordBasicInfoView = this$0.basicInfoView;
        if (sportRecordBasicInfoView != null) {
            SportBasicReport sportBasicReport = this$0.basicReport;
            if (sportBasicReport == null) {
                Intrinsics.throwUninitializedPropertyAccessException("basicReport");
                sportBasicReport = null;
            }
            SportRecordBasicInfoView.bindData$default(sportRecordBasicInfoView, sportBasicReport, infoList, str, false, false, 16, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(CompactTraceCardFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "recordDetailContent height=" + this$0.getMBinding().D.getHeight());
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void processRecordData(Map<SportRecordKey, List<Object>> resultMap, SportBasicReport mBasicReport) {
        List<Object> list;
        Float fValueOf;
        Float fValueOf2;
        List<Object> list2;
        List<Object> list3;
        List<Object> list4;
        SportRecordKey sportRecordKey = SportRecordKey.Pace;
        if (resultMap.containsKey(sportRecordKey) && (list4 = resultMap.get(sportRecordKey)) != null && FitnessSportTypeUtils.INSTANCE.supportSpeedSport(mBasicReport.getSportType())) {
            SportRecordKey sportRecordKey2 = SportRecordKey.Speed;
            if (!resultMap.containsKey(sportRecordKey2)) {
                resultMap.put(sportRecordKey2, SportRecordComputeUtil.INSTANCE.computeSpeedByPace(list4));
            }
        }
        SportRecordKey sportRecordKey3 = SportRecordKey.Distance;
        Float fValueOf3 = null;
        if (resultMap.containsKey(sportRecordKey3) && (list3 = resultMap.get(sportRecordKey3)) != null && FitnessSportTypeUtils.INSTANCE.supportSpeedSport(mBasicReport.getSportType())) {
            SportRecordKey sportRecordKey4 = SportRecordKey.Speed;
            if (!resultMap.containsKey(sportRecordKey4)) {
                resultMap.put(sportRecordKey4, SportRecordComputeUtil.INSTANCE.computeSpeed(list3, mBasicReport.getMaxSpeed(), null));
            }
        }
        SportRecordKey sportRecordKey5 = SportRecordKey.Step;
        if (resultMap.containsKey(sportRecordKey5)) {
            SportRecordKey sportRecordKey6 = SportRecordKey.StepsFrequency;
            if (!resultMap.containsKey(sportRecordKey6) && (list2 = resultMap.get(sportRecordKey5)) != null) {
                SportRecordComputeUtil sportRecordComputeUtil = SportRecordComputeUtil.INSTANCE;
                Integer maxCadence = mBasicReport.getMaxCadence();
                Float fValueOf4 = maxCadence != null ? Float.valueOf(maxCadence.intValue()) : null;
                Integer minCadence = mBasicReport.getMinCadence();
                resultMap.put(sportRecordKey6, sportRecordComputeUtil.computeFrequency(list2, fValueOf4, minCadence != null ? Float.valueOf(minCadence.intValue()) : null));
            }
        }
        SportRecordKey sportRecordKey7 = SportRecordKey.Count;
        if (resultMap.containsKey(sportRecordKey7)) {
            SportRecordKey sportRecordKey8 = SportRecordKey.Frequency;
            if (resultMap.containsKey(sportRecordKey8) || (list = resultMap.get(sportRecordKey7)) == null) {
                return;
            }
            int sportType = mBasicReport.getSportType();
            if (sportType == 6 || sportType == 7) {
                Integer maxCycleCadence = mBasicReport.getMaxCycleCadence();
                if (maxCycleCadence != null) {
                    fValueOf = Float.valueOf(maxCycleCadence.intValue());
                    fValueOf2 = fValueOf;
                } else {
                    fValueOf2 = null;
                }
            } else if (sportType == 9 || sportType == 10 || sportType == 13) {
                Integer maxStrokeFreq = mBasicReport.getMaxStrokeFreq();
                if (maxStrokeFreq != null) {
                    fValueOf = Float.valueOf(maxStrokeFreq.intValue());
                    fValueOf2 = fValueOf;
                } else {
                    fValueOf2 = null;
                }
            } else if (sportType != 14) {
                Integer maxCadence2 = mBasicReport.getMaxCadence();
                fValueOf2 = maxCadence2 != null ? Float.valueOf(maxCadence2.intValue()) : null;
                Integer minCadence2 = mBasicReport.getMinCadence();
                if (minCadence2 != null) {
                    fValueOf3 = Float.valueOf(minCadence2.intValue());
                }
            } else {
                Integer bestSkipFreq = mBasicReport.getBestSkipFreq();
                if (bestSkipFreq != null) {
                    fValueOf = Float.valueOf(bestSkipFreq.intValue());
                    fValueOf2 = fValueOf;
                } else {
                    fValueOf2 = null;
                }
            }
            resultMap.put(sportRecordKey8, SportRecordComputeUtil.INSTANCE.computeFrequency(list, fValueOf2, fValueOf3));
        }
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void createCommonBitmap(@Nullable Function2<? super Uri, ? super Bitmap, Unit> callback) {
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void createMapViewBitmap(@Nullable final Bitmap mapBitmap, @Nullable final Function2<? super Uri, ? super Bitmap, Unit> callback) {
        if (mapBitmap == null) {
            return;
        }
        getMBinding().D.post(new Runnable() { // from class: j94
            @Override // java.lang.Runnable
            public final void run() {
                CompactTraceCardFragment.createMapViewBitmap$lambda$11(this.f22549a, mapBitmap, callback);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.o;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        SportPathMapView sportPathMapView = this.sportPathView;
        if (sportPathMapView != null) {
            sportPathMapView.onDestroy();
        }
        super.onDestroy();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        SportPathMapView sportPathMapView = this.sportPathView;
        if (sportPathMapView != null) {
            sportPathMapView.onDestroy();
        }
        this.sportPathView = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        SportPathMapView sportPathMapView = this.sportPathView;
        if (sportPathMapView != null) {
            sportPathMapView.onLowMemory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SportPathMapView sportPathMapView = this.sportPathView;
        if (sportPathMapView != null) {
            sportPathMapView.onPause();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SportPathMapView sportPathMapView = this.sportPathView;
        if (sportPathMapView != null) {
            sportPathMapView.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        SportPathMapView sportPathMapView = this.sportPathView;
        if (sportPathMapView != null) {
            sportPathMapView.onSaveInstanceState(outState);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        SportBasicReport sportBasicReport = null;
        Serializable serializable = arguments != null ? arguments.getSerializable("sport_report") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportBasicReport");
        SportBasicReport sportBasicReport2 = (SportBasicReport) serializable;
        this.basicReport = sportBasicReport2;
        if (sportBasicReport2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("basicReport");
            sportBasicReport2 = null;
        }
        Logger.i(TAG, "onViewCreated sportReport=" + sportBasicReport2);
        setActionBarDisplayable(false);
        this.sportPathView = getMBinding().E;
        this.basicInfoView = getMBinding().F;
        SportPathMapView sportPathMapView = this.sportPathView;
        if (sportPathMapView != null) {
            sportPathMapView.onCreate(savedInstanceState);
        }
        SportPathMapView sportPathMapView2 = this.sportPathView;
        if (sportPathMapView2 != null) {
            sportPathMapView2.setAllGesturesEnabled(false);
        }
        SportPathMapView sportPathMapView3 = this.sportPathView;
        if (sportPathMapView3 != null) {
            sportPathMapView3.setIShareMapView(this);
        }
        SportPathMapView sportPathMapView4 = this.sportPathView;
        if (sportPathMapView4 != null) {
            sportPathMapView4.setTag(SportReportShareExtKt.TAG_DYNAMIC_TRACE_SPORT_PATH_VIEW);
        }
        SportBasicReport sportBasicReport3 = this.basicReport;
        if (sportBasicReport3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("basicReport");
        } else {
            sportBasicReport = sportBasicReport3;
        }
        final String strC = lp5.c(lp5.a(sportBasicReport));
        ((SportRecordDetailViewModel) getMViewModel()).m242getUserInfoLiveData();
        ((SportRecordDetailViewModel) getMViewModel()).getUserInfoLiveData().observe(getViewLifecycleOwner(), new CompactTraceCardFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d94
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CompactTraceCardFragment.onViewCreated$lambda$0(this.f15245a, (AccountCoreInfo) obj);
            }
        }));
        ((SportRecordDetailViewModel) getMViewModel()).getBasicItemInfoLiveData().observe(getViewLifecycleOwner(), new CompactTraceCardFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e94
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CompactTraceCardFragment.onViewCreated$lambda$1(this.f16404a, strC, (List) obj);
            }
        }));
        getDataAndDrawCompactTraceCard();
        getMBinding().D.post(new Runnable() { // from class: f94
            @Override // java.lang.Runnable
            public final void run() {
                CompactTraceCardFragment.onViewCreated$lambda$2(this.f17543a);
            }
        });
    }

    public final void releaseMapResources() {
        SportPathMapView sportPathMapView = this.sportPathView;
        if (sportPathMapView != null) {
            sportPathMapView.onDestroy();
        }
        this.sportPathView = null;
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void setStatueTextWhite(boolean isBlack) {
    }
}
