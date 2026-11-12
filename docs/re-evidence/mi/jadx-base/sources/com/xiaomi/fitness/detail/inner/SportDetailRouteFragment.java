package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.RouteReportData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailRouteFragment;
import com.xiaomi.fitness.detail.model.RouteInfo;
import com.xiaomi.fitness.detail.model.SportsReportOperationalRouteInfo;
import com.xiaomi.fitness.detail.view.SportRecordRunningRouteView;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.RunningRouteAccessExportExtKt;
import com.xiaomi.fitness.util.ConsistencyEventUtils;
import com.xiaomi.fitness.util.RunningRouteCardExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bsi;
import defpackage.j1j;
import defpackage.pfa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRouteFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lpfa;", "mViewBinding", "Lpfa;", "Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;", "routeData", "Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;", "<init>", "()V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailRouteFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailRouteFragment";
    private pfa mViewBinding;

    @Nullable
    private RouteReportData routeData;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailRouteFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "routeData", "Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable RouteReportData routeData, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            bundle.putSerializable(SportBasicReportKt.getROUTE_KEY(), routeData);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailRouteFragment.TAG, triathlonNum, sportType);
            int i = bsi.j0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailRouteFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            this.routeData = (RouteReportData) bundle.getSerializable(SportBasicReportKt.getROUTE_KEY());
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(final SportDetailRouteFragment this$0, final SportsReportOperationalRouteInfo sportsReportOperationalRouteInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("report request", "route = " + sportsReportOperationalRouteInfo + " , local routeData = " + this$0.routeData);
        pfa pfaVar = null;
        if (sportsReportOperationalRouteInfo == null) {
            RouteReportData routeReportData = this$0.routeData;
            if (routeReportData != null) {
                Intrinsics.checkNotNull(routeReportData);
                int state = routeReportData.getState();
                RouteReportData routeReportData2 = this$0.routeData;
                Intrinsics.checkNotNull(routeReportData2);
                int id = routeReportData2.getId();
                RouteReportData routeReportData3 = this$0.routeData;
                Intrinsics.checkNotNull(routeReportData3);
                String name = routeReportData3.getName();
                RouteReportData routeReportData4 = this$0.routeData;
                Intrinsics.checkNotNull(routeReportData4);
                String icon = routeReportData4.getIcon();
                RouteReportData routeReportData5 = this$0.routeData;
                Intrinsics.checkNotNull(routeReportData5);
                double dis = routeReportData5.getDis();
                RouteReportData routeReportData6 = this$0.routeData;
                Intrinsics.checkNotNull(routeReportData6);
                sportsReportOperationalRouteInfo = new SportsReportOperationalRouteInfo(state, new RouteInfo(id, name, icon, dis, routeReportData6.getRouteUrl(), 0));
            } else {
                sportsReportOperationalRouteInfo = null;
            }
        }
        if (sportsReportOperationalRouteInfo == null || sportsReportOperationalRouteInfo.getBindStatus() == 0) {
            pfa pfaVar2 = this$0.mViewBinding;
            if (pfaVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                pfaVar2 = null;
            }
            LinearLayout sportRecordRunningRouteLayout = pfaVar2.B;
            Intrinsics.checkNotNullExpressionValue(sportRecordRunningRouteLayout, "sportRecordRunningRouteLayout");
            ViewExtKt.gone(sportRecordRunningRouteLayout);
        } else {
            pfa pfaVar3 = this$0.mViewBinding;
            if (pfaVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                pfaVar3 = null;
            }
            LinearLayout sportRecordRunningRouteLayout2 = pfaVar3.B;
            Intrinsics.checkNotNullExpressionValue(sportRecordRunningRouteLayout2, "sportRecordRunningRouteLayout");
            ViewExtKt.visible(sportRecordRunningRouteLayout2);
            pfa pfaVar4 = this$0.mViewBinding;
            if (pfaVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                pfaVar4 = null;
            }
            pfaVar4.C.refreshRoute(sportsReportOperationalRouteInfo);
            ConsistencyEventUtils.INSTANCE.reportCardInfo(this$0.getMSportValues(), this$0.getCardName(), (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null);
        }
        pfa pfaVar5 = this$0.mViewBinding;
        if (pfaVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            pfaVar5 = null;
        }
        ViewExtKt.clickWithTrigger$default(pfaVar5.C, 0L, new Function1() { // from class: kin
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailRouteFragment.onViewCreated$lambda$3$lambda$0(this.f23893a, sportsReportOperationalRouteInfo, (SportRecordRunningRouteView) obj);
            }
        }, 1, null);
        FitnessPersistKey fitnessPersistKey = FitnessPersistKey.INSTANCE;
        SportBasicReport mBasicReport = this$0.getMBasicReport();
        SportReportKey sportReportKey = fitnessPersistKey.getSportReportKey(mBasicReport != null ? mBasicReport.getSportType() : 0);
        final String key = sportReportKey != null ? sportReportKey.getKey() : null;
        if (sportsReportOperationalRouteInfo != null && sportsReportOperationalRouteInfo.getBindStatus() == 3 && key != null && key.length() != 0) {
            pfa pfaVar6 = this$0.mViewBinding;
            if (pfaVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            } else {
                pfaVar = pfaVar6;
            }
            pfaVar.C.onJoinPunchingInBtnClick(new Function0() { // from class: lin
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportDetailRouteFragment.onViewCreated$lambda$3$lambda$2(this.f25107a, key, sportsReportOperationalRouteInfo);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$0(SportDetailRouteFragment this$0, SportsReportOperationalRouteInfo sportsReportOperationalRouteInfo, SportRecordRunningRouteView it) {
        RouteInfo routeInfo;
        RouteInfo routeInfo2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        RunningRouteCardExtKt.navigateToRouteDetailActivity(mActivity, (sportsReportOperationalRouteInfo == null || (routeInfo2 = sportsReportOperationalRouteInfo.getRouteInfo()) == null) ? 0 : routeInfo2.getId(), (sportsReportOperationalRouteInfo == null || (routeInfo = sportsReportOperationalRouteInfo.getRouteInfo()) == null) ? null : routeInfo.getFile());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(final SportDetailRouteFragment this$0, String str, final SportsReportOperationalRouteInfo sportsReportOperationalRouteInfo) {
        RouteInfo routeInfo;
        Integer score;
        RouteInfo routeInfo2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IRunningRouteApi instance = RunningRouteAccessExportExtKt.getINSTANCE(IRunningRouteApi.INSTANCE);
        SportBasicReport mBasicReport = this$0.getMBasicReport();
        String sid = mBasicReport != null ? mBasicReport.getSid() : null;
        SportBasicReport mBasicReport2 = this$0.getMBasicReport();
        long timeStamp = mBasicReport2 != null ? mBasicReport2.getTimeStamp() : 0L;
        int iIntValue = 0;
        int id = (sportsReportOperationalRouteInfo == null || (routeInfo2 = sportsReportOperationalRouteInfo.getRouteInfo()) == null) ? 0 : routeInfo2.getId();
        if (sportsReportOperationalRouteInfo != null && (routeInfo = sportsReportOperationalRouteInfo.getRouteInfo()) != null && (score = routeInfo.getScore()) != null) {
            iIntValue = score.intValue();
        }
        instance.getRouteClockInSuccessLiveData(sid, str, timeStamp, id, iIntValue).observe(this$0.getViewLifecycleOwner(), new SportDetailRouteFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: iin
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailRouteFragment.onViewCreated$lambda$3$lambda$2$lambda$1(this.f21179a, sportsReportOperationalRouteInfo, (Boolean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2$lambda$1(SportDetailRouteFragment this$0, SportsReportOperationalRouteInfo sportsReportOperationalRouteInfo, Boolean bool) {
        RouteInfo routeInfo;
        RouteInfo routeInfo2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            ToastExtKt.toast$default(ApplicationExtKt.getApplication(), j1j.v0, 0, 0, 0L, 14, null);
            FragmentActivity mActivity = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity);
            RunningRouteCardExtKt.navigateToRouteDetailActivity(mActivity, (sportsReportOperationalRouteInfo == null || (routeInfo2 = sportsReportOperationalRouteInfo.getRouteInfo()) == null) ? 0 : routeInfo2.getId(), (sportsReportOperationalRouteInfo == null || (routeInfo = sportsReportOperationalRouteInfo.getRouteInfo()) == null) ? null : routeInfo.getFile());
        } else {
            ToastExtKt.toast$default(ApplicationExtKt.getApplication(), j1j.H, 0, 0, 0L, 14, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "running_route";
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public boolean hasMaxMinAverage() {
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this.mViewBinding = pfa.A0(inflater, container, false);
        initParamsFromBundle(getArguments());
        pfa pfaVar = this.mViewBinding;
        if (pfaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            pfaVar = null;
        }
        View root = pfaVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        MutableLiveData<SportsReportOperationalRouteInfo> sportsReportOperationalRouteInfo;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setDetailViewModel((SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class));
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        if (detailViewModel == null || (sportsReportOperationalRouteInfo = detailViewModel.getSportsReportOperationalRouteInfo()) == null) {
            return;
        }
        sportsReportOperationalRouteInfo.observe(getViewLifecycleOwner(), new SportDetailRouteFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jin
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailRouteFragment.onViewCreated$lambda$3(this.f22845a, (SportsReportOperationalRouteInfo) obj);
            }
        }));
    }
}
