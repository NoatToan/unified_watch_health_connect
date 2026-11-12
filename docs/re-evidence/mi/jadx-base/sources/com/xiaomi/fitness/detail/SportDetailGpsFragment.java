package com.xiaomi.fitness.detail;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.mi.health.map.data.GpsValues;
import com.mi.health.map.data.sportmodel.view.MapStyleSetting;
import com.mi.health.map.data.util.SportReportMapPreference;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.detail.SportDetailGpsFragment;
import com.xiaomi.fitness.detail.inner.SportDetailInnerFragment;
import com.xiaomi.fitness.detail.model.SportReportDivingPointItem;
import com.xiaomi.fitness.detail.util.SportDetailHelper;
import com.xiaomi.fitness.detail.util.SportRecordConstants;
import com.xiaomi.fitness.detail.view.SportMapPlayStyleDialog;
import com.xiaomi.fitness.detail.view.SportMapStyleDialog;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.util.SportPathViewUtil;
import com.xiaomi.fitness.util.SportRecordUtil;
import com.xiaomi.fitness.util.TestUtil;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.bsi;
import defpackage.dki;
import defpackage.fea;
import defpackage.j1j;
import defpackage.o5o;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 N2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bM\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J)\u0010\f\u001a\u00020\u00022\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J-\u0010$\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b$\u0010%J9\u0010+\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&2\u001e\u0010*\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u0002\u0018\u00010(H\u0016¢\u0006\u0004\b+\u0010,JM\u00101\u001a\u00020\u00022<\u0010*\u001a8\u0012\u0015\u0012\u0013\u0018\u00010)¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0002\u0018\u00010(H\u0016¢\u0006\u0004\b1\u00102JK\u00103\u001a\u00020\u00022:\u0010*\u001a6\u0012\u0015\u0012\u0013\u0018\u00010)¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00020(H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0002H\u0014¢\u0006\u0004\b4\u0010\u0004JK\u00105\u001a\u00020\u00022:\u0010*\u001a6\u0012\u0015\u0012\u0013\u0018\u00010)¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00020(H\u0016¢\u0006\u0004\b5\u00102R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/detail/SportDetailGpsFragment;", "Lcom/xiaomi/fitness/detail/SportDetailFragment;", "", "createMapDialog", "()V", "createMapPlayDialog", "getData", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "resultMap", "insertIntegerPoint", "(Ljava/util/Map;)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "bindGpsValues", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onLowMemory", "onDestroyView", LifecycleConstantKt.ON_DESTROY, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Landroid/net/Uri;", "callback", "createMapViewBitmap", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/ParameterName;", "name", "longPicUri", "longPicBitmap", "createCommonBitmap", "(Lkotlin/jvm/functions/Function2;)V", "createShareBitmap", "resetUIDisplay", "generateLongShareBitmapIfNeed", "noPathView", "Landroid/view/View;", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "fragmentInner", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "Lfea;", "_binding", "Lfea;", "Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "mapStyleSetting", "Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/detail/view/SportMapStyleDialog;", "sportMapDialog", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/detail/view/SportMapPlayStyleDialog;", "sportMapPlayDialog", "", "showDivingGPS", "Z", "getMBinding", "()Lfea;", "mBinding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailGpsFragment extends SportDetailFragment {

    @NotNull
    public static final String DETAIL_FRAGMENT_TAG = "SportDetailInnerFragment";

    @Nullable
    private fea _binding;

    @Nullable
    private SportDetailInnerFragment fragmentInner;

    @Nullable
    private MapStyleSetting mapStyleSetting;
    private View noPathView;
    private boolean showDivingGPS;

    @Nullable
    private WeakReference<SportMapStyleDialog> sportMapDialog;

    @Nullable
    private WeakReference<SportMapPlayStyleDialog> sportMapPlayDialog;

    private final void bindGpsValues(final SportBasicReport sportValues) {
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        Intrinsics.checkNotNull(detailViewModel);
        detailViewModel.getGpsValuesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ggn
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailGpsFragment.bindGpsValues$lambda$17(this.f18963a, sportValues, (GpsValues) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void bindGpsValues$lambda$17(final SportDetailGpsFragment this$0, SportBasicReport sportValues, GpsValues gpsValues) {
        SportPathMapView sportPathView;
        LinearLayout imgSportTrace;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sportValues, "$sportValues");
        Float fValueOf = Float.valueOf(80.0f);
        View view = null;
        View view2 = null;
        if (gpsValues == null) {
            ImageView imgLocation = this$0.getImgLocation();
            if (imgLocation != null) {
                imgLocation.setVisibility(8);
            }
            ImageView imgMapDialog = this$0.getImgMapDialog();
            if (imgMapDialog != null) {
                imgMapDialog.setVisibility(8);
            }
            SportPathMapView sportPathView2 = this$0.getSportPathView();
            if (sportPathView2 != null) {
                sportPathView2.showEmptyView();
            }
            this$0.setMarginViewHeight(Boolean.FALSE);
            SportPathMapView sportPathView3 = this$0.getSportPathView();
            if (sportPathView3 != null) {
                ExtUtilsKt.setVisible(sportPathView3, false);
            }
            View view3 = this$0.noPathView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noPathView");
            } else {
                view2 = view3;
            }
            ExtUtilsKt.setVisible(view2, true);
            this$0.getMapScrollView().setMarginHeight(this$0.getMBinding().W.getHeight() - ExtUtilsKt.getDp(fValueOf));
            return;
        }
        this$0.setMGpsValues(gpsValues);
        if (!GpsValues.validGpsValue(this$0.getMGpsValues()) || this$0.getMBasicReport() == null) {
            this$0.setMarginViewHeight(Boolean.FALSE);
            ImageView imgLocation2 = this$0.getImgLocation();
            if (imgLocation2 != null) {
                imgLocation2.setVisibility(8);
            }
            ImageView imgMapDialog2 = this$0.getImgMapDialog();
            if (imgMapDialog2 != null) {
                imgMapDialog2.setVisibility(8);
            }
            SportPathMapView sportPathView4 = this$0.getSportPathView();
            if (sportPathView4 != null) {
                ExtUtilsKt.setVisible(sportPathView4, false);
            }
            View view4 = this$0.noPathView;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noPathView");
            } else {
                view = view4;
            }
            ExtUtilsKt.setVisible(view, true);
            this$0.getMapScrollView().setMarginHeight(this$0.getMBinding().W.getHeight() - ExtUtilsKt.getDp(fValueOf));
            SportPathMapView sportPathView5 = this$0.getSportPathView();
            if (sportPathView5 != null) {
                sportPathView5.showEmptyView();
                return;
            }
            return;
        }
        this$0.setMarginViewHeight(Boolean.TRUE);
        LinearLayout imgSportTrace2 = this$0.getImgSportTrace();
        if (imgSportTrace2 != null) {
            ViewExtKt.setVisible(imgSportTrace2, this$0.supportSportTraceSelect());
        }
        if (this$0.supportSportTraceSelect() && (imgSportTrace = this$0.getImgSportTrace()) != null) {
            ViewExtKt.clickWithTrigger$default(imgSportTrace, 0L, new Function1() { // from class: jgn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailGpsFragment.bindGpsValues$lambda$17$lambda$16(this.f22775a, (LinearLayout) obj);
                }
            }, 1, null);
        }
        SportPathMapView sportPathView6 = this$0.getSportPathView();
        if (sportPathView6 != null) {
            ExtUtilsKt.setVisible(sportPathView6, true);
        }
        View view5 = this$0.noPathView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noPathView");
            view5 = null;
        }
        ExtUtilsKt.setVisible(view5, false);
        if (!AppUtil.INSTANCE.isPlayChannel() && (sportPathView = this$0.getSportPathView()) != null) {
            Resources resources = AppUtil.getApp().getResources();
            SportPathViewUtil sportPathViewUtil = SportPathViewUtil.INSTANCE;
            SportPathMapView sportPathView7 = this$0.getSportPathView();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, sportPathViewUtil.getTraceStyleResModelByIndex(sportPathView7 != null ? sportPathView7.getMMapEditIndex() : 0, true));
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
            Resources resources2 = AppUtil.getApp().getResources();
            SportPathMapView sportPathView8 = this$0.getSportPathView();
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(resources2, sportPathViewUtil.getTraceStyleResModelByIndex(sportPathView8 != null ? sportPathView8.getMMapEditIndex() : 0, false));
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(...)");
            sportPathView.setInitMarkBitmap(bitmapDecodeResource, bitmapDecodeResource2);
        }
        SportPathMapView sportPathView9 = this$0.getSportPathView();
        if (sportPathView9 != null) {
            SportPathMapView.bindData$default(sportPathView9, sportValues, this$0.getMGpsValues(), 0, 4, null);
        }
        o5o o5oVarE = o5o.e();
        SportBasicReport mBasicReport = this$0.getMBasicReport();
        Intrinsics.checkNotNull(mBasicReport);
        o5oVarE.k(mBasicReport.getTimeStamp(), this$0.getMGpsValues());
        this$0.getMapScrollView().setMarginHeight((DisplayUtil.getScreenHeight() / 2) + ExtUtilsKt.getDp(Float.valueOf(20.0f)));
        View videoMarginView = this$0.getMBinding().d0;
        Intrinsics.checkNotNullExpressionValue(videoMarginView, "videoMarginView");
        ViewExtKt.setHeight(videoMarginView, (DisplayUtil.getScreenHeight() / 2) + ExtUtilsKt.getDp(Float.valueOf(20.0f)));
        TestUtil testUtil = TestUtil.INSTANCE;
        GpsValues mGpsValues = this$0.getMGpsValues();
        List<Location> list = mGpsValues != null ? mGpsValues.locationList : null;
        Intrinsics.checkNotNull(list);
        testUtil.putGpsValues(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindGpsValues$lambda$17$lambda$16(SportDetailGpsFragment this$0, LinearLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36902");
        pairArr[1] = TuplesKt.to("name", "btn_video_track");
        pairArr[2] = TuplesKt.to("type_str", String.valueOf(this$0.getSportTitle().getText()));
        SportBasicReport mBasicReport = this$0.getMBasicReport();
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(mBasicReport != null ? Integer.valueOf(mBasicReport.getSportType()) : null));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        this$0.intentToShareVideo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCommonBitmap$lambda$21(SportDetailGpsFragment this$0, Function2 function2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinearLayout recordDetailContent = this$0.getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(recordDetailContent, "recordDetailContent");
        Bitmap bitmapLoadBitmapFromView = ShareUtil.loadBitmapFromView((View) recordDetailContent, BaseFragmentExtKt.getColor(this$0, dki.n0), 0);
        SportShareBottomView shareBottomView = this$0.getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(shareBottomView, "shareBottomView");
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(shareBottomView, BaseFragmentExtKt.getColor(this$0, dki.n0), 0, 4, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLoadBitmapFromView.getWidth(), bitmapLoadBitmapFromView.getHeight() + bitmapLoadBitmapFromView$default.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(BaseFragmentExtKt.getColor(this$0, dki.n0));
        canvas.drawBitmap(bitmapLoadBitmapFromView, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapLoadBitmapFromView$default, 0.0f, bitmapLoadBitmapFromView.getHeight(), (Paint) null);
        Uri uriSaveImgToTempWithCustomizedName = ShareUtil.INSTANCE.saveImgToTempWithCustomizedName(bitmapCreateBitmap, SportReportShareExtKt.DEFAULT_SPORT_SHARE_FILE_NAME);
        Logger.i("SportDetailFragment", "createCommonBitmap uri=" + uriSaveImgToTempWithCustomizedName);
        if (function2 != null) {
            function2.invoke(uriSaveImgToTempWithCustomizedName, bitmapCreateBitmap);
        }
    }

    private final void createMapDialog() {
        String mapStyle;
        SportBasicReport mBasicReport = getMBasicReport();
        boolean z = !(mBasicReport != null && mBasicReport.getProtoType() == 25);
        SportDetailHelper.Companion companion = SportDetailHelper.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportDetailHelper singleHolder = companion.getInstance(fragmentActivityRequireActivity);
        MapStyleSetting mapStyleSetting = this.mapStyleSetting;
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView == null || (mapStyle = sportPathView.getMapStyle()) == null) {
            mapStyle = "";
        }
        SportPathMapView sportPathView2 = getSportPathView();
        WeakReference<SportMapStyleDialog> weakReference = new WeakReference<>(singleHolder.createSportMapStyleDialog(mapStyleSetting, mapStyle, sportPathView2 != null ? sportPathView2.getMMapEditIndex() : 0, Boolean.valueOf(z)));
        this.sportMapDialog = weakReference;
        SportMapStyleDialog sportMapStyleDialog = weakReference.get();
        if (sportMapStyleDialog != null) {
        }
    }

    private final void createMapPlayDialog() {
        SportDetailHelper.Companion companion = SportDetailHelper.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        WeakReference<SportMapPlayStyleDialog> weakReference = new WeakReference<>(SportDetailHelper.createSportMapPlayStyleDialog$default(companion.getInstance(fragmentActivityRequireActivity), this.mapStyleSetting, null, 2, null));
        this.sportMapPlayDialog = weakReference;
        SportMapPlayStyleDialog sportMapPlayStyleDialog = weakReference.get();
        if (sportMapPlayStyleDialog != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMapViewBitmap$lambda$20(SportDetailGpsFragment this$0, Bitmap bitmap, Function2 function2) {
        int height;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setRecordDetailContentBgBitmap();
        LinearLayout recordDetailContent = this$0.getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(recordDetailContent, "recordDetailContent");
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(recordDetailContent, 0, 0, 6, null);
        if (bitmap == null) {
            height = 0;
        } else {
            View view = this$0.noPathView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noPathView");
                view = null;
            }
            height = ExtUtilsKt.isVisible(view) ? this$0.getMBinding().W.getHeight() - ExtUtilsKt.getDp(Float.valueOf(80.0f)) : SportRecordUtil.INSTANCE.getMapMarginViewHeightWithStatueBar();
        }
        SportShareBottomView shareBottomView = this$0.getMBinding().R;
        Intrinsics.checkNotNullExpressionValue(shareBottomView, "shareBottomView");
        Bitmap bitmapLoadBitmapFromView$default2 = ShareUtil.loadBitmapFromView$default(shareBottomView, BaseFragmentExtKt.getColor(this$0, dki.b1), 0, 4, null);
        Logger.i("SportDetailFragment", "createMapViewBitmap addHeight=" + height + " shareBottomBitmap.height=" + bitmapLoadBitmapFromView$default2.getHeight() + " scrollBitmap=" + bitmapLoadBitmapFromView$default.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLoadBitmapFromView$default.getWidth(), bitmapLoadBitmapFromView$default.getHeight() + height + bitmapLoadBitmapFromView$default2.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Logger.i("thisCreateCommonBitmap  height: " + bitmapCreateBitmap.getHeight() + " rowBytes : " + bitmapCreateBitmap.getRowBytes() + " allocationByteCount: " + bitmapCreateBitmap.getAllocationByteCount(), new Object[0]);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(BaseFragmentExtKt.getColor(this$0, dki.n0));
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        canvas.drawBitmap(bitmapLoadBitmapFromView$default, 0.0f, height, (Paint) null);
        canvas.drawBitmap(bitmapLoadBitmapFromView$default2, 0.0f, bitmapLoadBitmapFromView$default.getHeight() + height, (Paint) null);
        Uri uriSaveImgToTempWithCustomizedName = ShareUtil.INSTANCE.saveImgToTempWithCustomizedName(bitmapCreateBitmap, SportReportShareExtKt.DEFAULT_SPORT_SHARE_FILE_NAME);
        Logger.i("SportDetailFragment", "createMapViewBitmap uri=" + uriSaveImgToTempWithCustomizedName);
        if (function2 != null) {
            function2.invoke(uriSaveImgToTempWithCustomizedName, bitmapCreateBitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateLongShareBitmapIfNeed$lambda$22(Function2 callback, Uri uri, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(uri, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateLongShareBitmapIfNeed$lambda$23(Function2 callback, Uri uri, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(uri, bitmap);
        return Unit.INSTANCE;
    }

    private final void getData() {
        MutableLiveData<SportReportDivingPointItem> sportsReportDivingPointInfo;
        MutableLiveData<List<Double>> divingInGpsValues;
        MutableLiveData<List<Double>> divingOutGpsValues;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        final SportBasicReport mBasicReport = getMBasicReport();
        if (mBasicReport != null) {
            SportRecordDetailViewModel detailViewModel = getDetailViewModel();
            if (detailViewModel != null) {
                detailViewModel.getGPSAndRecordData(mBasicReport);
            }
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 != null && (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) != null) {
                recordDetailMaps.observe(getViewLifecycleOwner(), new SportDetailGpsFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sfn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailGpsFragment.getData$lambda$14$lambda$5(this.f33594a, mBasicReport, (Map) obj);
                    }
                }));
            }
            SportBasicReport mBasicReport2 = getMBasicReport();
            if (mBasicReport2 != null && mBasicReport2.getProtoType() == 25) {
                getMBinding().E.setText(getString(j1j.Aa));
                getMBinding().C.setVisibility(0);
            }
            SportRecordDetailViewModel detailViewModel3 = getDetailViewModel();
            if (detailViewModel3 != null && (divingOutGpsValues = detailViewModel3.getDivingOutGpsValues()) != null) {
                divingOutGpsValues.observe(getViewLifecycleOwner(), new SportDetailGpsFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tfn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailGpsFragment.getData$lambda$14$lambda$6(mBasicReport, this, (List) obj);
                    }
                }));
            }
            SportRecordDetailViewModel detailViewModel4 = getDetailViewModel();
            if (detailViewModel4 != null && (divingInGpsValues = detailViewModel4.getDivingInGpsValues()) != null) {
                divingInGpsValues.observe(getViewLifecycleOwner(), new SportDetailGpsFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ufn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailGpsFragment.getData$lambda$14$lambda$7(mBasicReport, this, (List) obj);
                    }
                }));
            }
            SportRecordDetailViewModel detailViewModel5 = getDetailViewModel();
            if (detailViewModel5 != null && (sportsReportDivingPointInfo = detailViewModel5.getSportsReportDivingPointInfo()) != null) {
                sportsReportDivingPointInfo.observe(getViewLifecycleOwner(), new SportDetailGpsFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vfn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailGpsFragment.getData$lambda$14$lambda$8(mBasicReport, this, (SportReportDivingPointItem) obj);
                    }
                }));
            }
            SportDetailInnerFragment.Companion companion = SportDetailInnerFragment.INSTANCE;
            Bundle bundleCreateIntentBundle = companion.createIntentBundle(getMBasicReport(), getSportDataType(), getShowFeedback());
            if (getRouteData() != null) {
                bundleCreateIntentBundle.putSerializable(SportBasicReportKt.getROUTE_KEY(), getRouteData());
            }
            int i = bsi.S;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            this.fragmentInner = companion.switchSportDetailFragment(i, SportDetailInnerFragment.class, "SportDetailInnerFragment", bundleCreateIntentBundle, childFragmentManager);
            SportPathMapView sportPathView = getSportPathView();
            if (sportPathView != null) {
                sportPathView.setVisibility(0);
            }
            SportPathMapView sportPathView2 = getSportPathView();
            if (sportPathView2 != null) {
                sportPathView2.setIShareMapView(this);
            }
            bindGpsValues(mBasicReport);
            ImageView imgLocation = getImgLocation();
            if (imgLocation != null) {
                ViewExtKt.clickWithTrigger$default(imgLocation, 0L, new Function1() { // from class: wfn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailGpsFragment.getData$lambda$14$lambda$9(this.f37926a, (ImageView) obj);
                    }
                }, 1, null);
            }
            ImageView imgMapDialog = getImgMapDialog();
            if (imgMapDialog != null) {
                ViewExtKt.clickWithTrigger$default(imgMapDialog, 0L, new Function1() { // from class: xfn
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportDetailGpsFragment.getData$lambda$14$lambda$12(this.f39079a, (ImageView) obj);
                    }
                }, 1, null);
            }
            ViewExtKt.clickWithTrigger$default(getMBinding().b0, 0L, new Function1() { // from class: yfn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailGpsFragment.getData$lambda$14$lambda$13(this.f40137a, (AppCompatTextView) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getData$lambda$14$lambda$12(SportDetailGpsFragment this$0, ImageView it) {
        SportMapStyleDialog sportMapStyleDialog;
        Boolean mShowMailPoint;
        String mMapStyle;
        SportMapPlayStyleDialog sportMapPlayStyleDialog;
        Boolean mShowMailPoint2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        boolean zBooleanValue = false;
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36902");
        int i = 1;
        pairArr[1] = TuplesKt.to("name", "change_map");
        pairArr[2] = TuplesKt.to("type_str", String.valueOf(this$0.getSportTitle().getText()));
        SportBasicReport mBasicReport = this$0.getMBasicReport();
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(mBasicReport != null ? Integer.valueOf(mBasicReport.getSportType()) : null));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        String str = "";
        if (AppUtil.INSTANCE.isPlayChannel()) {
            if (this$0.sportMapPlayDialog == null) {
                this$0.createMapPlayDialog();
            }
            WeakReference<SportMapPlayStyleDialog> weakReference = this$0.sportMapPlayDialog;
            if (weakReference != null && (sportMapPlayStyleDialog = weakReference.get()) != null && !sportMapPlayStyleDialog.isShowing()) {
                SportPathMapView sportPathView = this$0.getSportPathView();
                if (Intrinsics.areEqual(sportPathView != null ? sportPathView.getMMapStyle() : null, "-1")) {
                    i = 0;
                } else {
                    SportPathMapView sportPathView2 = this$0.getSportPathView();
                    if (Intrinsics.areEqual(sportPathView2 != null ? sportPathView2.getMMapStyle() : null, "")) {
                        i = 2;
                    }
                }
                sportMapPlayStyleDialog.setMapStyle(i);
                SportPathMapView sportPathView3 = this$0.getSportPathView();
                if (sportPathView3 != null && (mShowMailPoint2 = sportPathView3.getMShowMailPoint()) != null) {
                    zBooleanValue = mShowMailPoint2.booleanValue();
                }
                sportMapPlayStyleDialog.setSwitchStatue(zBooleanValue);
                sportMapPlayStyleDialog.showIfNeed(this$0.getChildFragmentManager());
            }
        } else {
            if (this$0.sportMapDialog == null) {
                this$0.createMapDialog();
            }
            WeakReference<SportMapStyleDialog> weakReference2 = this$0.sportMapDialog;
            if (weakReference2 != null && (sportMapStyleDialog = weakReference2.get()) != null && !sportMapStyleDialog.isShowing()) {
                SportPathMapView sportPathView4 = this$0.getSportPathView();
                if (sportPathView4 != null && (mMapStyle = sportPathView4.getMMapStyle()) != null) {
                    str = mMapStyle;
                }
                sportMapStyleDialog.setMapStyle(str);
                SportPathMapView sportPathView5 = this$0.getSportPathView();
                sportMapStyleDialog.setMapEditIndex(sportPathView5 != null ? sportPathView5.getMMapEditIndex() : 0);
                SportPathMapView sportPathView6 = this$0.getSportPathView();
                sportMapStyleDialog.setSwitchStatue((sportPathView6 == null || (mShowMailPoint = sportPathView6.getMShowMailPoint()) == null) ? false : mShowMailPoint.booleanValue());
                SportPathMapView sportPathView7 = this$0.getSportPathView();
                sportMapStyleDialog.setColorSwitchStatue(sportPathView7 != null ? sportPathView7.getMShowPathColor() : false);
                sportMapStyleDialog.showIfNeed(this$0.getChildFragmentManager());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getData$lambda$14$lambda$13(SportDetailGpsFragment this$0, AppCompatTextView it) {
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
    public static final Unit getData$lambda$14$lambda$5(SportDetailGpsFragment this$0, SportBasicReport basicReport, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(basicReport, "$basicReport");
        Logger.d("SportDetailFragment", "recordDetailMaps observe invoke!!");
        Intrinsics.checkNotNull(map);
        this$0.insertIntegerPoint(map);
        SportDetailGpsFragmentKt.processRecordData(map, basicReport);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getData$lambda$14$lambda$6(SportBasicReport basicReport, SportDetailGpsFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(basicReport, "$basicReport");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (basicReport.getProtoType() == 25) {
            if (list == null) {
                ImageView imgLocation = this$0.getImgLocation();
                if (imgLocation != null) {
                    imgLocation.setVisibility(8);
                }
                ImageView imgMapDialog = this$0.getImgMapDialog();
                if (imgMapDialog != null) {
                    imgMapDialog.setVisibility(8);
                }
                SportPathMapView sportPathView = this$0.getSportPathView();
                if (sportPathView != null) {
                    sportPathView.showEmptyView();
                }
                this$0.setMarginViewHeight(Boolean.FALSE);
                SportPathMapView sportPathView2 = this$0.getSportPathView();
                if (sportPathView2 != null) {
                    ExtUtilsKt.setVisible(sportPathView2, false);
                }
                View view = this$0.noPathView;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("noPathView");
                    view = null;
                }
                ExtUtilsKt.setVisible(view, true);
                this$0.getMBinding().a0.setText(this$0.requireContext().getString(j1j.T1));
                this$0.getMBinding().b0.setVisibility(8);
                this$0.getMBinding().C.setVisibility(8);
                this$0.getMapScrollView().setMarginHeight(this$0.getMBinding().W.getHeight() - ExtUtilsKt.getDp(Float.valueOf(80.0f)));
                return Unit.INSTANCE;
            }
            this$0.showDivingGPS = true;
            SportPathMapView sportPathView3 = this$0.getSportPathView();
            if (sportPathView3 != null) {
                sportPathView3.showEndMarker((List<Double>) list);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getData$lambda$14$lambda$7(SportBasicReport basicReport, SportDetailGpsFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(basicReport, "$basicReport");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (basicReport.getProtoType() == 25) {
            if (list == null) {
                ImageView imgLocation = this$0.getImgLocation();
                if (imgLocation != null) {
                    imgLocation.setVisibility(8);
                }
                ImageView imgMapDialog = this$0.getImgMapDialog();
                if (imgMapDialog != null) {
                    imgMapDialog.setVisibility(8);
                }
                SportPathMapView sportPathView = this$0.getSportPathView();
                if (sportPathView != null) {
                    sportPathView.showEmptyView();
                }
                this$0.setMarginViewHeight(Boolean.FALSE);
                SportPathMapView sportPathView2 = this$0.getSportPathView();
                if (sportPathView2 != null) {
                    ExtUtilsKt.setVisible(sportPathView2, false);
                }
                View view = this$0.noPathView;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("noPathView");
                    view = null;
                }
                ExtUtilsKt.setVisible(view, true);
                this$0.getMBinding().a0.setText(this$0.requireContext().getString(j1j.T1));
                this$0.getMBinding().b0.setVisibility(8);
                this$0.getMBinding().C.setVisibility(8);
                this$0.getMapScrollView().setMarginHeight(this$0.getMBinding().W.getHeight() - ExtUtilsKt.getDp(Float.valueOf(80.0f)));
                return Unit.INSTANCE;
            }
            this$0.showDivingGPS = true;
            SportPathMapView sportPathView3 = this$0.getSportPathView();
            if (sportPathView3 != null) {
                sportPathView3.showStartMarker((List<Double>) list);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getData$lambda$14$lambda$8(SportBasicReport basicReport, SportDetailGpsFragment this$0, SportReportDivingPointItem sportReportDivingPointItem) {
        Intrinsics.checkNotNullParameter(basicReport, "$basicReport");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (basicReport.getProtoType() == 25) {
            if ((sportReportDivingPointItem != null ? sportReportDivingPointItem.getDivingName() : null) == null || sportReportDivingPointItem.getDivingName().length() <= 0) {
                this$0.getMBinding().E.setText(this$0.getString(j1j.Aa));
                this$0.getMBinding().C.setVisibility(0);
            } else {
                this$0.getMBinding().E.setText(sportReportDivingPointItem.getDivingName());
                this$0.getMBinding().C.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getData$lambda$14$lambda$9(SportDetailGpsFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36902");
        pairArr[1] = TuplesKt.to("name", "btn_map_center");
        pairArr[2] = TuplesKt.to("type_str", String.valueOf(this$0.getSportTitle().getText()));
        SportBasicReport mBasicReport = this$0.getMBasicReport();
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(mBasicReport != null ? Integer.valueOf(mBasicReport.getSportType()) : null));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.locationPath();
        }
        return Unit.INSTANCE;
    }

    private final void insertIntegerPoint(final Map<SportRecordKey, List<Object>> resultMap) {
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        Intrinsics.checkNotNull(detailViewModel);
        detailViewModel.getGpsValuesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: hgn
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDetailGpsFragment.insertIntegerPoint$lambda$15(this.f20053a, resultMap, (GpsValues) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIntegerPoint$lambda$15(SportDetailGpsFragment this$0, Map resultMap, GpsValues gpsValues) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resultMap, "$resultMap");
        if (gpsValues == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = this$0.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new SportDetailGpsFragment$insertIntegerPoint$1$1(gpsValues, resultMap, this$0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SportDetailGpsFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.showMailsPoints(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SportDetailGpsFragment this$0, String style, String name) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(name, "name");
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.setCustomMapStyleWithLocalResource(style, name);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SportDetailGpsFragment this$0, List styleList, int i) {
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
    public static final Unit onViewCreated$lambda$3(SportDetailGpsFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.loadMapStyle(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(SportDetailGpsFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportPathMapView sportPathView = this$0.getSportPathView();
        if (sportPathView != null) {
            sportPathView.showColorPace(z);
        }
        return Unit.INSTANCE;
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void createCommonBitmap(@Nullable final Function2<? super Uri, ? super Bitmap, Unit> callback) {
        boolean z;
        SportDetailInnerFragment sportDetailInnerFragment;
        SportBasicReport mBasicReport;
        Integer trainingExperience;
        MutableLiveData<Boolean> showExpandViewFlag;
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        if (detailViewModel != null && (showExpandViewFlag = detailViewModel.getShowExpandViewFlag()) != null) {
            showExpandViewFlag.postValue(Boolean.FALSE);
        }
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
        getMBinding().Q.post(new Runnable() { // from class: ign
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailGpsFragment.createCommonBitmap$lambda$21(this.f21118a, callback);
            }
        });
    }

    @Override // com.mi.health.map.data.sportmodel.share.IShareMapLongView
    public void createMapViewBitmap(@Nullable final Bitmap bitmap, @Nullable final Function2<? super Uri, ? super Bitmap, Unit> callback) {
        SportDetailInnerFragment sportDetailInnerFragment;
        SportDetailInnerFragment sportDetailInnerFragment2;
        SportBasicReport mBasicReport;
        Integer trainingExperience;
        SportBasicReport mBasicReport2;
        Integer trainingExperience2;
        MutableLiveData<Boolean> showExpandViewFlag;
        View view = this.noPathView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noPathView");
            view = null;
        }
        if (ExtUtilsKt.isVisible(view)) {
            View view2 = this.noPathView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noPathView");
                view2 = null;
            }
            bitmap = ShareUtil.loadBitmapFromView$default(view2, 0, 0, 6, null);
        }
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        if (detailViewModel != null && (showExpandViewFlag = detailViewModel.getShowExpandViewFlag()) != null) {
            showExpandViewFlag.postValue(Boolean.FALSE);
        }
        SportBasicReport mBasicReport3 = getMBasicReport();
        if (((mBasicReport3 != null ? mBasicReport3.getTrainingExperience() : null) == null || ((mBasicReport2 = getMBasicReport()) != null && (trainingExperience2 = mBasicReport2.getTrainingExperience()) != null && trainingExperience2.intValue() == 0)) && (sportDetailInnerFragment = this.fragmentInner) != null) {
            sportDetailInnerFragment.setTrainingExperienceVisibility(8);
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
            SportBasicReport mBasicReport4 = getMBasicReport();
            if (((mBasicReport4 != null ? mBasicReport4.getTrainingExperience() : null) == null || ((mBasicReport = getMBasicReport()) != null && (trainingExperience = mBasicReport.getTrainingExperience()) != null && trainingExperience.intValue() == 0)) && (sportDetailInnerFragment2 = this.fragmentInner) != null) {
                sportDetailInnerFragment2.getTrainingExperienceHeight();
            }
        }
        getMBinding().Q.post(new Runnable() { // from class: rfn
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailGpsFragment.createMapViewBitmap$lambda$20(this.f32501a, bitmap, callback);
            }
        });
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
        if ((!GpsValues.validGpsValue(getMGpsValues()) || getMBasicReport() == null) && !this.showDivingGPS) {
            Logger.i("SportDetailFragment", "intentToShareLongPic no gps path");
            createCommonBitmap(new Function2() { // from class: agn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportDetailGpsFragment.generateLongShareBitmapIfNeed$lambda$23(callback, (Uri) obj, (Bitmap) obj2);
                }
            });
        } else {
            Logger.i("SportDetailFragment", "intentToShareLongPic has gps path");
            createShareBitmap(new Function2() { // from class: zfn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportDetailGpsFragment.generateLongShareBitmapIfNeed$lambda$22(callback, (Uri) obj, (Bitmap) obj2);
                }
            });
        }
    }

    @NotNull
    public final fea getMBinding() {
        fea feaVar = this._binding;
        Intrinsics.checkNotNull(feaVar);
        return feaVar;
    }

    @Override // com.xiaomi.fitness.detail.SportDetailFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.onDestroy();
        }
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
        this._binding = fea.A0(inflater, container, false);
        setSportPathView(getMBinding().U);
        this.noPathView = getMBinding().O;
        setImgBack(getMBinding().H);
        setImgShare(getMBinding().L);
        setImgDelete(getMBinding().I);
        setImgLocation(getMBinding().K);
        setImgMapDialog(getMBinding().J);
        setSportTitle(getMBinding().Y);
        setMarginView(getMBinding().N);
        setShareBottomView(getMBinding().R);
        setBasicInfoView(getMBinding().V);
        setRecordDetailContent(getMBinding().Q);
        setMapScrollView(getMBinding().M);
        setOutContainer(getMBinding().P);
        setSportShareLongView(getMBinding().X);
        setImgSportTrace(getMBinding().Z);
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
        MutableLiveData<Boolean> showExpandViewFlag;
        super.onResume();
        SportPathMapView sportPathView = getSportPathView();
        if (sportPathView != null) {
            sportPathView.onResume();
        }
        SportRecordDetailViewModel detailViewModel = getDetailViewModel();
        if (detailViewModel == null || (showExpandViewFlag = detailViewModel.getShowExpandViewFlag()) == null) {
            return;
        }
        showExpandViewFlag.postValue(Boolean.TRUE);
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
        this.mapStyleSetting = new MapStyleSetting(new Function1() { // from class: bgn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailGpsFragment.onViewCreated$lambda$0(this.f4189a, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: cgn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportDetailGpsFragment.onViewCreated$lambda$1(this.f5314a, (String) obj, (String) obj2);
            }
        }, new Function2() { // from class: dgn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportDetailGpsFragment.onViewCreated$lambda$2(this.f15515a, (List) obj, ((Integer) obj2).intValue());
            }
        }, new Function1() { // from class: egn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailGpsFragment.onViewCreated$lambda$3(this.f16625a, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: fgn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailGpsFragment.onViewCreated$lambda$4(this.f17769a, ((Boolean) obj).booleanValue());
            }
        });
        SportPathMapView sportPathView2 = getSportPathView();
        if (sportPathView2 != null) {
            sportPathView2.setMapStyleSetting(this.mapStyleSetting);
        }
        TextPaint paint = getMBinding().b0.getPaint();
        paint.setFlags(8);
        paint.setAntiAlias(true);
        if (AppUtil.INSTANCE.isPlayChannel()) {
            createMapPlayDialog();
        } else {
            createMapDialog();
        }
        getData();
        SportPathMapView sportPathView3 = getSportPathView();
        if (sportPathView3 != null) {
            SportReportMapPreference sportReportMapPreference = SportReportMapPreference.INSTANCE;
            sportPathView3.setCustomMapStyleWithLocalResource(sportReportMapPreference.getSPORT_SHOW_MAP_STYLE_ID(), sportReportMapPreference.getSPORT_SHOW_MAP_STYLE_NAME());
        }
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
