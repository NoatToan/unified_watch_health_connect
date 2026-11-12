package com.xiaomi.fitness.sport.view.route;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.mi.health.utils.AmapLocation;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity;
import com.xiaomi.fitness.sport.view.route.ext.RunningRouteExtKt;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel;
import com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_export.data.StartPoint;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.av6;
import defpackage.bxa;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.nuf;
import defpackage.o7h;
import defpackage.pz6;
import defpackage.r9n;
import defpackage.rbd;
import defpackage.xr5;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = SportRouterKt.CREATED_ROUTE_DETAIL)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 J2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001JB\u0007¢\u0006\u0004\bI\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u0006R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0018\u0010+\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\"RC\u0010C\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0;8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010E¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteDetailViewModel;", "Lr9n;", "", "initParams", "()V", "initView", "initData", "refresh", "initMap", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "routeInfo", "initRouteInfo", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "", "exceptionType", "showExceptionIcon", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "showIntroDialog", LifecycleConstantKt.ON_RESUME, "outState", "onSaveInstanceState", LifecycleConstantKt.ON_PAUSE, "onLowMemory", LifecycleConstantKt.ON_DESTROY, "Lcom/amap/api/maps/AMap;", "aMap", "Lcom/amap/api/maps/AMap;", "routeId", "I", "", "officialRoute", "Z", "", "fileSuffix", "Ljava/lang/String;", "trackName", "rotateAngle", "kmlFile", "", "distance", "Ljava/lang/Double;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "latLngList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "introDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/sport_export/data/StartPoint;", "startPoint", "Lcom/xiaomi/fitness/sport_export/data/StartPoint;", "mapCount", "Lkotlin/Pair;", "<set-?>", "locationNNetAvailable$delegate", "Lkotlin/properties/ReadWriteProperty;", "getLocationNNetAvailable", "()Lkotlin/Pair;", "setLocationNNetAvailable", "(Lkotlin/Pair;)V", "locationNNetAvailable", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCreateRouteDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteDetailActivity.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteDetailActivity\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,520:1\n33#2,3:521\n1863#3,2:524\n*S KotlinDebug\n*F\n+ 1 CreateRouteDetailActivity.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteDetailActivity\n*L\n135#1:521,3\n336#1:524,2\n*E\n"})
public final class CreateRouteDetailActivity extends Hilt_CreateRouteDetailActivity<CreateRouteDetailViewModel, r9n> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateRouteDetailActivity.class, "locationNNetAvailable", "getLocationNNetAvailable()Lkotlin/Pair;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_TRACK_OFFICIAL_ROUTE = "track_official_route";

    @NotNull
    public static final String KEY_TRACK_PATH = "track_path";

    @NotNull
    public static final String TAG = "CreateRouteDetailActivity";

    @Nullable
    private AMap aMap;

    @Nullable
    private Double distance;

    @Nullable
    private String fileSuffix;

    @Nullable
    private CommonDialog<DialogParams> introDialog;

    @Nullable
    private String kmlFile;

    @NotNull
    private ArrayList<CommonTrackData> latLngList = new ArrayList<>();

    /* JADX INFO: renamed from: locationNNetAvailable$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty locationNNetAvailable;
    private int mapCount;
    private boolean officialRoute;
    private int rotateAngle;
    private int routeId;

    @Nullable
    private StartPoint startPoint;

    @Nullable
    private String trackName;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteDetailActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_TRACK_PATH", "KEY_TRACK_OFFICIAL_ROUTE", StatConstants.PARAM_START, "", "context", "Landroid/content/Context;", "routeId", "", "trackPath", "officialRoute", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, int i, String str, boolean z, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str = "";
            }
            if ((i2 & 8) != 0) {
                z = false;
            }
            companion.start(context, i, str, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit start$lambda$0(Context context, int i, String trackPath, boolean z, boolean z2, Exception exc) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(trackPath, "$trackPath");
            if (z2) {
                AnyExtKt.main$default(null, new CreateRouteDetailActivity$Companion$start$1$1(context, i, trackPath, z, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        public final void start(@NotNull final Context context, final int routeId, @NotNull final String trackPath, final boolean officialRoute) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(trackPath, "trackPath");
            StringBuilder sb = new StringBuilder();
            sb.append("start  routeId:");
            sb.append(routeId);
            sb.append("  trackPath:");
            sb.append(trackPath);
            sb.append("  officialRoute:");
            sb.append(officialRoute);
            MapDynamicUtils.INSTANCE.checkSoLoaded(context instanceof FragmentActivity ? (FragmentActivity) context : null, new Function2() { // from class: s25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateRouteDetailActivity.Companion.start$lambda$0(context, routeId, trackPath, officialRoute, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
        }
    }

    public CreateRouteDetailActivity() {
        Delegates delegates = Delegates.INSTANCE;
        Boolean bool = Boolean.TRUE;
        final Pair pair = new Pair(bool, bool);
        this.locationNNetAvailable = new ObservableProperty<Pair<? extends Boolean, ? extends Boolean>>(pair) { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Pair<? extends Boolean, ? extends Boolean> oldValue, Pair<? extends Boolean, ? extends Boolean> newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                Pair<? extends Boolean, ? extends Boolean> pair2 = newValue;
                Pair<? extends Boolean, ? extends Boolean> pair3 = oldValue;
                Logger.i(CreateRouteDetailActivity.TAG, "locationNNetAvailable delegate old:" + pair3 + ",new:" + pair2);
                if ((pair3.getFirst().booleanValue() || !pair2.getFirst().booleanValue()) && (pair3.getSecond().booleanValue() || !pair2.getSecond().booleanValue())) {
                    return;
                }
                this.refresh();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CreateRouteDetailViewModel access$getMViewModel(CreateRouteDetailActivity createRouteDetailActivity) {
        return (CreateRouteDetailViewModel) createRouteDetailActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        refresh();
        ((CreateRouteDetailViewModel) getMViewModel()).getRouteInfoLiveData().observe(this, new CreateRouteDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p25
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CreateRouteDetailActivity.initData$lambda$13(this.f29927a, (Pair) obj);
            }
        }));
        ((CreateRouteDetailViewModel) getMViewModel()).getRouteTrackLiveData().observe(this, new CreateRouteDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q25
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CreateRouteDetailActivity.initData$lambda$15(this.f31011a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$13(CreateRouteDetailActivity this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (pair == null) {
            return Unit.INSTANCE;
        }
        RouteInfo routeInfo = (RouteInfo) pair.getFirst();
        this$0.fileSuffix = routeInfo.getFileSuffix();
        this$0.trackName = routeInfo.getName();
        this$0.startPoint = routeInfo.getStartPoint();
        this$0.rotateAngle = routeInfo.getRotateAngle();
        this$0.kmlFile = routeInfo.getKmlFile();
        this$0.distance = Double.valueOf(routeInfo.getLength() * ((double) 1000));
        this$0.initRouteInfo(routeInfo);
        String trackFilePath = ((CreateRouteDetailViewModel) this$0.getMViewModel()).getTrackFilePath();
        if (trackFilePath != null) {
            ((CreateRouteDetailViewModel) this$0.getMViewModel()).readTrackFile(trackFilePath, routeInfo.getFileSuffix());
        } else {
            ((CreateRouteDetailViewModel) this$0.getMViewModel()).getTraceRawData(routeInfo.getKmlFile(), routeInfo.getName(), routeInfo.getFileSuffix());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$15(CreateRouteDetailActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list == null) {
            return Unit.INSTANCE;
        }
        List<List<LatLng>> listConvertCommonTrackToLatLngs = RouteDetailExtKt.convertCommonTrackToLatLngs(list);
        AMap aMap = this$0.aMap;
        if (aMap != null) {
            RouteDetailExtKt.moveToPathAreaAndDrawTrace(aMap, listConvertCommonTrackToLatLngs, ExtUtilsKt.getDp(39), ExtUtilsKt.getDp(39), ExtUtilsKt.getDp(39), ExtUtilsKt.getDp(39), Float.valueOf(360 - this$0.rotateAngle));
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            CommonTrackData commonTrackData = (CommonTrackData) it.next();
            double[] dArrC = bxa.c(commonTrackData.getLatitude(), commonTrackData.getLongitude());
            if (commonTrackData.getFlagSegment()) {
                z = true;
            }
            this$0.latLngList.add(new CommonTrackData(dArrC[0], dArrC[1], 0.0d, null, commonTrackData.getFlagSegment(), 12, null));
        }
        if (z) {
            TextView routeIntro = ((r9n) this$0.getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(routeIntro, "routeIntro");
            ViewExtKt.setVisible(routeIntro, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initMap() {
        this.aMap = ((r9n) getMBinding()).H.getMMapView().getMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initParams() {
        this.routeId = getIntent().getIntExtra("route_id", 0);
        this.officialRoute = getIntent().getBooleanExtra(KEY_TRACK_OFFICIAL_ROUTE, false);
        String stringExtra = getIntent().getStringExtra(KEY_TRACK_PATH);
        if (stringExtra != null && stringExtra.length() != 0) {
            ((CreateRouteDetailViewModel) getMViewModel()).setTrackFilePath(stringExtra);
        }
        Logger.d(TAG, "initParams routeId=" + this.routeId + ",official=" + this.officialRoute);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void initRouteInfo(final RouteInfo routeInfo) {
        String did;
        boolean z;
        String did2;
        ((r9n) getMBinding()).R.setText(routeInfo.getName());
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.i, (int) routeInfo.getLength(), xr5.d(2, routeInfo.getLength()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        ((r9n) getMBinding()).Q.setText(quantityString);
        ((r9n) getMBinding()).N.setText(routeInfo.getStartPoint().getName());
        if (routeInfo.getRouteStatus() == 60) {
            ImageView verifyFailed = ((r9n) getMBinding()).V;
            Intrinsics.checkNotNullExpressionValue(verifyFailed, "verifyFailed");
            ViewExtKt.setVisible(verifyFailed, true);
            ((r9n) getMBinding()).T.setClickable(false);
            ((r9n) getMBinding()).T.setAlpha(0.5f);
            TextView routeIntro = ((r9n) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(routeIntro, "routeIntro");
            ViewExtKt.setVisible(routeIntro, false);
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        String str = "";
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        if ((deviceManagerExtKt.getDeviceCapability(did) & 134217728) == 0) {
            WearableDeviceManager deviceManagerExtKt2 = DeviceManagerExtKt.getInstance(companion);
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel2 != null && (did2 = wearableDeviceModel2.getDid()) != null) {
                str = did2;
            }
            if ((deviceManagerExtKt2.getDeviceCapabilityV2(str) & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (AppUtil.INSTANCE.isPlayChannel() || !z || routeInfo.isForbidTrans()) {
            ImageView toDeviceCard = ((r9n) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(toDeviceCard, "toDeviceCard");
            ViewExtKt.setVisible(toDeviceCard, false);
        } else {
            ImageView toDeviceCard2 = ((r9n) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(toDeviceCard2, "toDeviceCard");
            ViewExtKt.setVisible(toDeviceCard2, true);
        }
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        new AmapLocation().startLocation(new Function1() { // from class: i25
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CreateRouteDetailActivity.initRouteInfo$lambda$16(routeInfo, this, (Location) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRouteInfo$lambda$16(RouteInfo routeInfo, CreateRouteDetailActivity this$0, Location it) {
        Intrinsics.checkNotNullParameter(routeInfo, "$routeInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Pair<Double, Double> pairConvertFromGps84ToMars = RouteDetailExtKt.convertFromGps84ToMars(routeInfo.getStartPoint().getLatitude(), routeInfo.getStartPoint().getLongitude());
        int iCalculateLineDistance = (int) AMapUtils.calculateLineDistance(new LatLng(it.latitude, it.longitude), new LatLng(pairConvertFromGps84ToMars.getFirst().doubleValue(), pairConvertFromGps84ToMars.getSecond().doubleValue()));
        String strI = pz6.i(iCalculateLineDistance);
        ((r9n) this$0.getMBinding()).C.setText(ResourceExtKt.getString(c1j.h1, pz6.e(iCalculateLineDistance), strI));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((r9n) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: g25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteDetailActivity.initView$lambda$4(this.f18497a, view);
            }
        });
        ((r9n) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: j25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteDetailActivity.initView$lambda$5(this.f22347a, view);
            }
        });
        ((r9n) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: k25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteDetailActivity.initView$lambda$6(this.f23355a, view);
            }
        });
        nuf.f(((r9n) getMBinding()).G);
        nuf.f(((r9n) getMBinding()).B);
        nuf.f(((r9n) getMBinding()).E);
        ((r9n) getMBinding()).U.setOnClickListener(new View.OnClickListener() { // from class: l25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteDetailActivity.initView$lambda$7(this.f24560a, view);
            }
        });
        TextView routeIntro = ((r9n) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(routeIntro, "routeIntro");
        RouteDetailExtKt.listenOnClickWithPressEffect(routeIntro, new Function0() { // from class: m25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteDetailActivity.initView$lambda$8(this.f25671a);
            }
        });
        TextView startRunningBtn = ((r9n) getMBinding()).T;
        Intrinsics.checkNotNullExpressionValue(startRunningBtn, "startRunningBtn");
        RouteDetailExtKt.listenOnClickWithPressEffect(startRunningBtn, new Function0() { // from class: n25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteDetailActivity.initView$lambda$9(this.f27466a);
            }
        });
        ViewExtKt.clickWithTrigger$default(((r9n) getMBinding()).I, 0L, new Function1() { // from class: o25
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CreateRouteDetailActivity.initView$lambda$10(this.f28662a, (AppCompatTextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$10(CreateRouteDetailActivity this$0, AppCompatTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        StartPoint startPoint = this$0.startPoint;
        if (startPoint != null && startPoint != null) {
            Pair<Double, Double> pairConvertFromGps84ToMars = RouteDetailExtKt.convertFromGps84ToMars(startPoint.getLatitude(), startPoint.getLongitude());
            RouteDetailExtKt.showSelectMapDialogIfNeed(pairConvertFromGps84ToMars.getFirst().doubleValue(), pairConvertFromGps84ToMars.getSecond().doubleValue(), this$0);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(final CreateRouteDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RunningRouteExtKt.routeCheckPermission(new Function0() { // from class: h25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteDetailActivity.initView$lambda$4$lambda$3(this.f19600a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$4$lambda$3(CreateRouteDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((r9n) this$0.getMBinding()).H.moveCameraToCurrentLocation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(CreateRouteDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6(CreateRouteDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SystemSetting.INSTANCE.goToSetting(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7(final CreateRouteDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogAddDialogCallback = new CommonDialog.c("send_to_device_dialog").setDialogTitle(c1j.R3).setDialogDescription(c1j.Q3).setPositiveText(c1j.h).setNegativeText(c1j.f).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity$initView$4$sendToDeviceDialog$1
            @Override // defpackage.av6
            @SuppressLint({"SetTextI18n"})
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new CreateRouteDetailActivity$initView$4$sendToDeviceDialog$1$onDialogClick$1(this.this$0, CreateRouteDetailActivity.access$getMViewModel(this.this$0).getTrackFilePath(), null), 3, null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(commonDialogAddDialogCallback, "addDialogCallback(...)");
        commonDialogAddDialogCallback.show(this$0.getSupportFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$8(CreateRouteDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showIntroDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$9(CreateRouteDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RouteDetailExtKt.launchOutdoorRunning(this$0, this$0.kmlFile, SportBeanHelperExtKt.getSupportsSportBean() ? 1 : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat onCreate$lambda$2(CreateRouteDetailActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.g());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        ((r9n) this$0.getMBinding()).A.setPaddingRelative(0, rbdVarF.f32379b, 0, 0);
        return WindowInsetsCompat.f2098b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refresh() {
        ((CreateRouteDetailViewModel) getMViewModel()).getRouteDetailLiveData(this.routeId, this.officialRoute ? 2 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showExceptionIcon(int exceptionType) {
        Logger.d(CreateRouteActivity.TAG, "showExceptionIcon exceptionType=" + exceptionType);
        Button goOpenPermissions = ((r9n) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(goOpenPermissions, "goOpenPermissions");
        ViewExtKt.gone(goOpenPermissions);
        if (exceptionType == -3) {
            ConstraintLayout notActivatedGroup = ((r9n) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(notActivatedGroup, "notActivatedGroup");
            ViewExtKt.visible(notActivatedGroup);
            ((r9n) getMBinding()).K.setText(c1j.q4);
            ((r9n) getMBinding()).K.setCompoundDrawablesWithIntrinsicBounds(0, eoi.f0, 0, 0);
            return;
        }
        if (exceptionType == -2) {
            ConstraintLayout notActivatedGroup2 = ((r9n) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(notActivatedGroup2, "notActivatedGroup");
            ViewExtKt.visible(notActivatedGroup2);
            Button goOpenPermissions2 = ((r9n) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(goOpenPermissions2, "goOpenPermissions");
            ViewExtKt.visible(goOpenPermissions2);
            ((r9n) getMBinding()).K.setText(c1j.a3);
            ((r9n) getMBinding()).K.setCompoundDrawablesWithIntrinsicBounds(0, eoi.f0, 0, 0);
            return;
        }
        if (exceptionType != -1) {
            ConstraintLayout notActivatedGroup3 = ((r9n) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(notActivatedGroup3, "notActivatedGroup");
            ViewExtKt.gone(notActivatedGroup3);
        } else {
            ConstraintLayout notActivatedGroup4 = ((r9n) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(notActivatedGroup4, "notActivatedGroup");
            ViewExtKt.visible(notActivatedGroup4);
            ((r9n) getMBinding()).K.setText(c1j.H);
            ((r9n) getMBinding()).K.setCompoundDrawablesWithIntrinsicBounds(0, eoi.K, 0, 0);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.K;
    }

    @NotNull
    public final Pair<Boolean, Boolean> getLocationNNetAvailable() {
        return (Pair) this.locationNNetAvailable.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.route.Hilt_CreateRouteDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((r9n) getMBinding()).H.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
        } else {
            Window window = getWindow();
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        androidx.core.view.c.H0(getWindow().getDecorView(), new o7h() { // from class: r25
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return CreateRouteDetailActivity.onCreate$lambda$2(this.f32102a, view, windowInsetsCompat);
            }
        });
        setActionBarDisplayable(false);
        ((r9n) getMBinding()).H.onCreate(savedInstanceState);
        NetUtil netUtil = NetUtil.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (!netUtil.getNetWorkAvailable(applicationContext)) {
            ToastUtil.INSTANCE.showToast(c1j.common_hint_network_unavailable);
        }
        initParams();
        initData();
        initMap();
        initView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.route.Hilt_CreateRouteDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((r9n) getMBinding()).H.onDestroy();
        ((CreateRouteDetailViewModel) getMViewModel()).getRouteTrackLiveData().removeObservers(this);
        RouteBaseViewModel.deleteFiles$default((RouteBaseViewModel) getMViewModel(), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ((r9n) getMBinding()).H.onLowMemory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((r9n) getMBinding()).H.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((r9n) getMBinding()).H.onResume();
        boolean zIsNetworkConnected = NetworkUtils.isNetworkConnected(this);
        boolean zIsPermissionGranted = PermissionExtKt.isPermissionGranted(this, "android.permission.ACCESS_FINE_LOCATION");
        setLocationNNetAvailable(new Pair<>(Boolean.valueOf(zIsNetworkConnected), Boolean.valueOf(zIsPermissionGranted)));
        if (!zIsNetworkConnected) {
            showExceptionIcon(-1);
        } else if (zIsPermissionGranted) {
            showExceptionIcon(0);
        } else {
            showExceptionIcon(-2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ((r9n) getMBinding()).H.onSaveInstanceState(outState);
    }

    public final void setLocationNNetAvailable(@NotNull Pair<Boolean, Boolean> pair) {
        Intrinsics.checkNotNullParameter(pair, "<set-?>");
        this.locationNNetAvailable.setValue(this, $$delegatedProperties[0], pair);
    }

    public final void showIntroDialog() {
        if (this.introDialog == null) {
            View viewInflate = LayoutInflater.from(this).inflate(dvi.N0, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            CommonDialog<DialogParams> commonDialogCreate = new CommonDialog.c("CreateRouteDetail").setDialogTitle(c1j.D3).setCustomView(viewInflate).setCanceledOnTouchOutside(true).setPositiveText(c1j.O0).create();
            this.introDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity.showIntroDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        boolean supportsSportBean = SportBeanHelperExtKt.getSupportsSportBean();
                        CreateRouteDetailActivity createRouteDetailActivity = CreateRouteDetailActivity.this;
                        RouteDetailExtKt.launchOutdoorRunning(createRouteDetailActivity, createRouteDetailActivity.kmlFile, supportsSportBean ? 1 : 0);
                    }
                }
            });
        }
        CommonDialog<DialogParams> commonDialog = this.introDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getSupportFragmentManager());
    }
}
