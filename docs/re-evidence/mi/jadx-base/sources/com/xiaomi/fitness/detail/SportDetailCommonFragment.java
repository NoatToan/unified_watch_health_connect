package com.xiaomi.fitness.detail;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.extension.ViewGroupExtendKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.SportDetailCommonFragment;
import com.xiaomi.fitness.detail.inner.SportDetailInnerFragment;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.bsi;
import defpackage.dki;
import defpackage.tli;
import defpackage.uda;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u0011J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0017\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u001e\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0011J/\u0010\u001b\u001a\u00020\r2\u001e\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/detail/SportDetailCommonFragment;", "Lcom/xiaomi/fitness/detail/SportDetailFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "name", "", "onTitleDecided", "(Ljava/lang/String;)V", LifecycleConstantKt.ON_START, "()V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Landroid/net/Uri;", "callback", "createMapViewBitmap", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "resetUIDisplay", LifecycleConstantKt.ON_RESUME, "createCommonBitmap", "(Lkotlin/jvm/functions/Function2;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/TextView;", "sportTimeTV", "Landroid/widget/TextView;", "txtSportName", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "fragmentInner", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "Luda;", "_binding", "Luda;", "getMBinding", "()Luda;", "mBinding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportDetailCommonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailCommonFragment.kt\ncom/xiaomi/fitness/detail/SportDetailCommonFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,192:1\n326#2,2:193\n338#2:195\n356#2:196\n365#2:197\n328#2,2:198\n326#2,2:200\n338#2:202\n356#2:203\n365#2:204\n328#2,2:205\n*S KotlinDebug\n*F\n+ 1 SportDetailCommonFragment.kt\ncom/xiaomi/fitness/detail/SportDetailCommonFragment\n*L\n84#1:193,2\n86#1:195\n88#1:196\n89#1:197\n84#1:198,2\n94#1:200,2\n96#1:202\n98#1:203\n99#1:204\n94#1:205,2\n*E\n"})
public final class SportDetailCommonFragment extends SportDetailFragment {

    @NotNull
    public static final String DETAIL_FRAGMENT_TAG = "SportDetailInnerFragment";

    @Nullable
    private uda _binding;

    @Nullable
    private SportDetailInnerFragment fragmentInner;
    private TextView sportTimeTV;
    private TextView txtSportName;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCommonBitmap$lambda$4(SportDetailCommonFragment this$0, Function2 function2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout outContainter = this$0.getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(outContainter, "outContainter");
        Bitmap bitmapLoadBitmapFromView = ShareUtil.loadBitmapFromView((View) outContainter, BaseFragmentExtKt.getColor(this$0, dki.n0), 0);
        SportShareBottomView shareBottomView = this$0.getMBinding().K;
        Intrinsics.checkNotNullExpressionValue(shareBottomView, "shareBottomView");
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(shareBottomView, BaseFragmentExtKt.getColor(this$0, dki.n0), 0, 4, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLoadBitmapFromView.getWidth(), bitmapLoadBitmapFromView.getHeight() + bitmapLoadBitmapFromView$default.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(BaseFragmentExtKt.getColor(this$0, dki.n0));
        canvas.drawBitmap(bitmapLoadBitmapFromView, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapLoadBitmapFromView$default, 0.0f, bitmapLoadBitmapFromView.getHeight(), (Paint) null);
        Uri uriSaveImgToTempWithCustomizedName = ShareUtil.INSTANCE.saveImgToTempWithCustomizedName(bitmapCreateBitmap, SportReportShareExtKt.DEFAULT_SPORT_SHARE_FILE_NAME);
        if (function2 != null) {
            function2.invoke(uriSaveImgToTempWithCustomizedName, bitmapCreateBitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3$lambda$2(SportBasicReport basicReport, Map map) {
        Intrinsics.checkNotNullParameter(basicReport, "$basicReport");
        Intrinsics.checkNotNull(map);
        SportDetailGpsFragmentKt.processRecordData(map, basicReport);
        return Unit.INSTANCE;
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void createCommonBitmap(@Nullable final Function2<? super Uri, ? super Bitmap, Unit> callback) {
        boolean z;
        SportDetailInnerFragment sportDetailInnerFragment;
        MutableLiveData<Boolean> showExpandViewFlag;
        SportBasicReport mBasicReport;
        Integer trainingExperience;
        SportBasicReport mBasicReport2 = getMBasicReport();
        if ((mBasicReport2 != null ? mBasicReport2.getTrainingExperience() : null) == null || !((mBasicReport = getMBasicReport()) == null || (trainingExperience = mBasicReport.getTrainingExperience()) == null || trainingExperience.intValue() != 0)) {
            SportDetailInnerFragment sportDetailInnerFragment2 = this.fragmentInner;
            if (sportDetailInnerFragment2 != null) {
                sportDetailInnerFragment2.setTrainingExperienceVisibility(8);
            }
            z = true;
        } else {
            z = false;
        }
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        if (detailViewModel != null && (showExpandViewFlag = detailViewModel.getShowExpandViewFlag()) != null) {
            showExpandViewFlag.postValue(Boolean.FALSE);
        }
        SportDetailInnerFragment sportDetailInnerFragment3 = this.fragmentInner;
        if (sportDetailInnerFragment3 != null) {
            sportDetailInnerFragment3.setPermissionViewVisibility(8);
        }
        SportDetailInnerFragment sportDetailInnerFragment4 = this.fragmentInner;
        if (sportDetailInnerFragment4 != null) {
            Intrinsics.checkNotNull(sportDetailInnerFragment4);
            sportDetailInnerFragment4.getFeedbackViewHeight();
            SportDetailInnerFragment sportDetailInnerFragment5 = this.fragmentInner;
            Intrinsics.checkNotNull(sportDetailInnerFragment5);
            sportDetailInnerFragment5.getPermissionViewHeight();
            if (z && (sportDetailInnerFragment = this.fragmentInner) != null) {
                sportDetailInnerFragment.getTrainingExperienceHeight();
            }
        }
        getMBinding().I.post(new Runnable() { // from class: gen
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailCommonFragment.createCommonBitmap$lambda$4(this.f18899a, callback);
            }
        });
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void createMapViewBitmap(@Nullable Bitmap bitmap, @Nullable Function2<? super Uri, ? super Bitmap, Unit> callback) {
        if (callback != null) {
            callback.invoke(null, null);
        }
    }

    @NotNull
    public final uda getMBinding() {
        uda udaVar = this._binding;
        Intrinsics.checkNotNull(udaVar);
        return udaVar;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = uda.A0(inflater, container, false);
        setImgBack(getMBinding().C);
        setImgShare(getMBinding().E);
        setImgDelete(getMBinding().D);
        setSportTitle(getMBinding().P);
        setMarginView(getMBinding().G);
        setReportAllRootView(getMBinding().J);
        setShareBottomView(getMBinding().K);
        setBasicInfoView(getMBinding().M);
        setRecordDetailContent(getMBinding().I);
        setMapScrollView(getMBinding().F);
        setOutContainer(getMBinding().H);
        setSportShareLongView(getMBinding().N);
        this.sportTimeTV = getMBinding().O;
        this.txtSportName = getMBinding().Q;
        setJustDanceViewPager(getMBinding().B);
        View root = getMBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        MutableLiveData<Boolean> showExpandViewFlag;
        super.onResume();
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        if (detailViewModel == null || (showExpandViewFlag = detailViewModel.getShowExpandViewFlag()) == null) {
            return;
        }
        showExpandViewFlag.postValue(Boolean.TRUE);
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment, androidx.fragment.app.Fragment
    public void onStart() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        super.onStart();
        final SportBasicReport mBasicReport = getMBasicReport();
        if (mBasicReport != null) {
            TextView textView = this.sportTimeTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportTimeTV");
                textView = null;
            }
            textView.setText(TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat(mBasicReport.getStartTime(), true));
            SportBasicReport mBasicReport2 = getMBasicReport();
            if (mBasicReport2 == null || mBasicReport2.getSportType() != 812) {
                LinearLayoutCompat reportAllRootView = getReportAllRootView();
                ViewGroup.LayoutParams layoutParams = reportAllRootView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                ViewGroup.LayoutParams layoutParams2 = getReportAllRootView().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i = marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0;
                int dp = ExtUtilsKt.getDp(Float.valueOf(180.0f));
                ViewGroup.LayoutParams layoutParams3 = getReportAllRootView().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i2 = marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0;
                ViewGroup.LayoutParams layoutParams4 = getReportAllRootView().getLayoutParams();
                marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                ViewGroupExtendKt.setMarginRelative(marginLayoutParams2, i, dp, i2, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                reportAllRootView.setLayoutParams(marginLayoutParams2);
            } else {
                ViewExtKt.gone(getMarginView());
                LinearLayoutCompat reportAllRootView2 = getReportAllRootView();
                ViewGroup.LayoutParams layoutParams5 = reportAllRootView2.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                ViewGroup.LayoutParams layoutParams6 = getReportAllRootView().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                int i3 = marginLayoutParams6 != null ? marginLayoutParams6.leftMargin : 0;
                int dp2 = ExtUtilsKt.getDp(Float.valueOf(120.0f));
                ViewGroup.LayoutParams layoutParams7 = getReportAllRootView().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                int i4 = marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0;
                ViewGroup.LayoutParams layoutParams8 = getReportAllRootView().getLayoutParams();
                marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                ViewGroupExtendKt.setMarginRelative(marginLayoutParams5, i3, dp2, i4, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                reportAllRootView2.setLayoutParams(marginLayoutParams5);
                getReportAllRootView().setTop(ExtUtilsKt.getDp(Float.valueOf(20.0f)));
            }
            SportRecordDetailViewModel detailViewModel = getDetailViewModel();
            if (detailViewModel != null) {
                detailViewModel.getSportData(mBasicReport);
            }
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 != null && (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) != null) {
                recordDetailMaps.observe(getViewLifecycleOwner(), new SportDetailCommonFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fen
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailCommonFragment.onStart$lambda$3$lambda$2(mBasicReport, (Map) obj);
                    }
                }));
            }
            SportDetailInnerFragment.Companion companion = SportDetailInnerFragment.INSTANCE;
            Bundle bundleCreateIntentBundle = companion.createIntentBundle(getMBasicReport(), getSportDataType(), getShowFeedback());
            if (getRouteData() != null) {
                bundleCreateIntentBundle.putSerializable(SportBasicReportKt.getROUTE_KEY(), getRouteData());
            }
            int i5 = bsi.S;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            this.fragmentInner = companion.switchSportDetailFragment(i5, SportDetailInnerFragment.class, "SportDetailInnerFragment", bundleCreateIntentBundle, childFragmentManager);
            int dimen = (int) BaseFragmentExtKt.getDimen(this, tli.i);
            getMBinding().I.setPadding(dimen, ExtUtilsKt.getDp(Float.valueOf(10.0f)), dimen, ExtUtilsKt.getDp(Float.valueOf(20.0f)));
            getMapScrollView().setMarginHeight(ExtUtilsKt.getDp(Float.valueOf(0.0f)));
        }
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment
    public void onTitleDecided(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TextView textView = this.txtSportName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtSportName");
            textView = null;
        }
        textView.setText(name);
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment
    public void resetUIDisplay() {
        if (this.fragmentInner == null || !getShowFeedback()) {
            return;
        }
        SportDetailInnerFragment sportDetailInnerFragment = this.fragmentInner;
        Intrinsics.checkNotNull(sportDetailInnerFragment);
        sportDetailInnerFragment.setFeedbackViewVisibility(0);
    }
}
