package com.xiaomi.fitness.route.track.view;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Lifecycle;
import com.amap.api.maps.AMap;
import com.amap.api.maps.model.LatLng;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mi.health.map.data.sportmodel.view.MapStyleSetting;
import com.mi.health.sport.TrackShareRoutineView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.RecorderPoint;
import com.xiaomi.fitness.route.export.track.TrackDetailData;
import com.xiaomi.fitness.route.track.ext.Report;
import com.xiaomi.fitness.route.track.utils.SportDetailHelper;
import com.xiaomi.fitness.route.track.utils.SportMapStyleDialog;
import com.xiaomi.fitness.route.track.utils.SportRecordDataUtil;
import com.xiaomi.fitness.route.track.utils.SportRecordListModel;
import com.xiaomi.fitness.route.track.view.TrackDetailActivity;
import com.xiaomi.fitness.route.track.viewmodel.Status;
import com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM;
import com.xiaomi.fitness.track.ExportTrackActivityKt;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.trail.export.track.TrackData;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.mi_connect_sdk.BuildConfig;
import defpackage.bvi;
import defpackage.bxa;
import defpackage.d3g;
import defpackage.doi;
import defpackage.rz5;
import defpackage.vri;
import defpackage.x0j;
import defpackage.xr5;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u0091\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0091\u0001B\b¢\u0006\u0005\b\u0090\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J;\u0010,\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u0010\u0006JE\u00109\u001a\u00020\u00042\u0006\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0006\u0010\"\u001a\u00020!2\u0006\u00106\u001a\u00020\n2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000407H\u0003¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010;H\u0014¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010\u0006J)\u0010C\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010BH\u0014¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0004H\u0014¢\u0006\u0004\bE\u0010\u0006J\u000f\u0010F\u001a\u00020\u0004H\u0014¢\u0006\u0004\bF\u0010\u0006J\u000f\u0010G\u001a\u00020\u0004H\u0014¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010\u0006R\u0017\u0010I\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u00100R\"\u0010Q\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010X\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R(\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010f\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010 R$\u0010k\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001e\u0010s\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\"\u0010v\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\"\u0010|\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010}\u001a\u0004\b|\u0010\u001b\"\u0004\b~\u0010\u007fR&\u0010\u0080\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010}\u001a\u0005\b\u0080\u0001\u0010\u001b\"\u0005\b\u0081\u0001\u0010\u007fR&\u0010\u0082\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010}\u001a\u0005\b\u0083\u0001\u0010\u001b\"\u0005\b\u0084\u0001\u0010\u007fR&\u0010\u0085\u0001\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010J\u001a\u0005\b\u0086\u0001\u0010L\"\u0005\b\u0087\u0001\u0010$R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008c\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/route/track/viewmodel/TrackDetailVM;", "Ld3g;", "", "setListener", "()V", "resultFinish", "Landroid/view/View;", "v", "", "bg", "xoff", "yoff", "showPopupWindow", "(Landroid/view/View;III)V", "createMapDialog", "Landroid/graphics/Bitmap;", "buildBitmap", "()Landroid/graphics/Bitmap;", "initData", "Landroid/widget/TextView;", "editView", "showEditNameView", "(Landroid/widget/TextView;)V", "", "isSupportTrack", "()Z", "setTrackNameCanEdit", "Lcom/xiaomi/fitness/route/export/track/TrackDetailData;", "data", "buildEditRouteBean", "(Lcom/xiaomi/fitness/route/export/track/TrackDetailData;)V", "", "name", "rebuildByteArrayName", "(Ljava/lang/String;)V", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "pair", "bothTime", "routeFrom", StepsInfo.KEY_DISTANCE, "buildData", "(Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "recorder", "setChart", "(Lcom/xiaomi/fitness/route/export/track/Recorder;)V", "initView", "id", "routerSize", "Ljava/io/File;", "file", "distance", "Lkotlin/Function0;", "transferFinish", "preInstallTrackFile", "(Ljava/lang/String;ILjava/io/File;Ljava/lang/String;ILkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", "SOURCE", "Ljava/lang/String;", "getSOURCE", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "getRecorder", "()Lcom/xiaomi/fitness/route/export/track/Recorder;", "setRecorder", "dataByteArray", "[B", "getDataByteArray", "()[B", "setDataByteArray", "([B)V", "Lcom/xiaomi/fitness/route/track/view/EditRouteBean;", "editRouteBean", "Lcom/xiaomi/fitness/route/track/view/EditRouteBean;", "getEditRouteBean", "()Lcom/xiaomi/fitness/route/track/view/EditRouteBean;", "setEditRouteBean", "(Lcom/xiaomi/fitness/route/track/view/EditRouteBean;)V", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "mapList", "Ljava/util/List;", "getMapList", "()Ljava/util/List;", "setMapList", "(Ljava/util/List;)V", "routeDetail", "Lcom/xiaomi/fitness/route/export/track/TrackDetailData;", "getRouteDetail", "()Lcom/xiaomi/fitness/route/export/track/TrackDetailData;", "setRouteDetail", "fromPage", "Ljava/lang/Integer;", "getFromPage", "()Ljava/lang/Integer;", "setFromPage", "(Ljava/lang/Integer;)V", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/route/track/utils/SportMapStyleDialog;", "sportMapDialog", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/route/track/ext/Report;", "report", "Lcom/xiaomi/fitness/route/track/ext/Report;", "getReport", "()Lcom/xiaomi/fitness/route/track/ext/Report;", "setReport", "(Lcom/xiaomi/fitness/route/track/ext/Report;)V", "isLogin", "Z", "setLogin", "(Z)V", "isCanEditName", "setCanEditName", "hasUpdateToServer", "getHasUpdateToServer", "setHasUpdateToServer", "transformedRouteId", "getTransformedRouteId", "setTransformedRouteId", "Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "mapStyleSetting", "Lcom/mi/health/map/data/sportmodel/view/MapStyleSetting;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrackDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackDetailActivity.kt\ncom/xiaomi/fitness/route/track/view/TrackDetailActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,746:1\n1863#2,2:747\n1863#2,2:749\n1863#2,2:751\n1863#2,2:753\n*S KotlinDebug\n*F\n+ 1 TrackDetailActivity.kt\ncom/xiaomi/fitness/route/track/view/TrackDetailActivity\n*L\n313#1:747,2\n556#1:749,2\n207#1:751,2\n221#1:753,2\n*E\n"})
public final class TrackDetailActivity extends Hilt_TrackDetailActivity<TrackDetailVM, d3g> {
    public static final int EDIT_RESULT_CODE = 1;

    @NotNull
    public static final String EDIT_RESULT_PARAM_NAME = "name";

    @NotNull
    public static final String FILE_EXT = "FILE_EXT";

    @NotNull
    public static final String FROM_PAGE = "FROM_PAGE";

    @NotNull
    public static final String ROUTE_DETAIL = "ROUTE_DETAIL";

    @NotNull
    public static final String ROUTE_URL = "ROUTE_URL";

    @NotNull
    public static final String TAG = "TrackDetailActivity";

    @NotNull
    public static final String UPLOAD_SUCCESS = "UPLOAD_SUCCESS";

    @NotNull
    private final String SOURCE;
    public byte[] dataByteArray;

    @Nullable
    private EditRouteBean editRouteBean;

    @Nullable
    private Integer fromPage;
    private boolean hasUpdateToServer;
    private boolean isCanEditName;
    private boolean isLogin;
    public List<CommonTrackData> mapList;

    @Nullable
    private MapStyleSetting mapStyleSetting;

    @Nullable
    private Recorder recorder;
    public Report report;

    @Nullable
    private TrackDetailData routeDetail;

    @Nullable
    private WeakReference<SportMapStyleDialog> sportMapDialog;

    @NotNull
    private String transformedRouteId;

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1", f = "TrackDetailActivity.kt", i = {}, l = {404}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTrackDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackDetailActivity.kt\ncom/xiaomi/fitness/route/track/view/TrackDetailActivity$initData$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,746:1\n39#2,6:747\n39#2,6:753\n*S KotlinDebug\n*F\n+ 1 TrackDetailActivity.kt\ncom/xiaomi/fitness/route/track/view/TrackDetailActivity$initData$1\n*L\n380#1:747,6\n386#1:753,6\n*E\n"})
    public static final class C29081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackDetailActivity$initData$1$1", f = "TrackDetailActivity.kt", i = {0}, l = {BuildConfig.MiConnectVersionBuild, 378}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        public static final class C07211 extends SuspendLambda implements Function2<FlowCollector<? super byte[]>, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TrackDetailActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07211(TrackDetailActivity trackDetailActivity, Continuation<? super C07211> continuation) {
                super(2, continuation);
                this.this$0 = trackDetailActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07211 c07211 = new C07211(this.this$0, continuation);
                c07211.L$0 = obj;
                return c07211;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                TrackDetailActivity$initData$1$1$byteArr$1 trackDetailActivity$initData$1$1$byteArr$1 = new TrackDetailActivity$initData$1$1$byteArr$1(this.this$0, null);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = BuildersKt.withContext(io2, trackDetailActivity$initData$1$1$byteArr$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byte[] bArr = (byte[]) obj;
                TrackDetailActivity trackDetailActivity = this.this$0;
                TextView trackName = TrackDetailActivity.access$getMBinding(trackDetailActivity).g0;
                Intrinsics.checkNotNullExpressionValue(trackName, "trackName");
                trackDetailActivity.setTrackNameCanEdit(trackName);
                if (bArr == null) {
                    ToastUtil.showShortToast(this.this$0.getString(x0j.common_network_error_retry_later));
                    this.this$0.hideLoading();
                } else {
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(bArr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super byte[]> flowCollector, Continuation<? super Unit> continuation) {
                return ((C07211) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C29081(Continuation<? super C29081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackDetailActivity.this.new C29081(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowOn = FlowKt.flowOn(FlowKt.flow(new TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$2(FlowKt.flow(new TrackDetailActivity$initData$1$invokeSuspend$$inlined$transform$1(FlowKt.flow(new C07211(TrackDetailActivity.this, null)), null, TrackDetailActivity.this)), null, TrackDetailActivity.this)), Dispatchers.getIO());
                final TrackDetailActivity trackDetailActivity = TrackDetailActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.route.track.view.TrackDetailActivity.initData.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Pair<byte[], Recorder>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Pair<byte[], Recorder> pair, Continuation<? super Unit> continuation) {
                        String uploadTimeStr;
                        String source;
                        String source2;
                        TrackDetailActivity trackDetailActivity2 = trackDetailActivity;
                        TextView trackName = TrackDetailActivity.access$getMBinding(trackDetailActivity2).g0;
                        Intrinsics.checkNotNullExpressionValue(trackName, "trackName");
                        trackDetailActivity2.setTrackNameCanEdit(trackName);
                        String string = trackDetailActivity.getString(x0j.H);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        try {
                            TrackDetailData routeDetail = trackDetailActivity.getRouteDetail();
                            if (routeDetail == null || (source2 = routeDetail.getSource()) == null || Integer.parseInt(source2) != 2) {
                                TrackDetailData routeDetail2 = trackDetailActivity.getRouteDetail();
                                string = (routeDetail2 == null || (source = routeDetail2.getSource()) == null || Integer.parseInt(source) != 3) ? trackDetailActivity.getString(x0j.G) : trackDetailActivity.getString(x0j.F);
                            } else {
                                string = trackDetailActivity.getString(x0j.H);
                            }
                        } catch (Exception e) {
                            FitnessLogUtils.i(TrackDetailActivity.TAG, "exception:" + e);
                        }
                        TrackDetailActivity trackDetailActivity3 = trackDetailActivity;
                        TrackDetailData routeDetail3 = trackDetailActivity3.getRouteDetail();
                        if (routeDetail3 == null || (uploadTimeStr = routeDetail3.getUploadTimeStr()) == null) {
                            uploadTimeStr = "--";
                        }
                        if (string == null) {
                            string = "--";
                        }
                        trackDetailActivity3.buildData(pair, uploadTimeStr, string, MyTrackLibExtKt.getTrackDis(trackDetailActivity));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowOn.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TrackDetailActivity() {
        String string = AppUtil.getApp().getString(x0j.G);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.SOURCE = string;
        this.isLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
        this.isCanEditName = true;
        this.transformedRouteId = "";
        this.mapStyleSetting = new MapStyleSetting(new Function1() { // from class: vlp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackDetailActivity.mapStyleSetting$lambda$19(((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: wlp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TrackDetailActivity.mapStyleSetting$lambda$20((String) obj, (String) obj2);
            }
        }, null, new Function1() { // from class: xlp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackDetailActivity.mapStyleSetting$lambda$21(this.f39248a, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: zlp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackDetailActivity.mapStyleSetting$lambda$22(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ d3g access$getMBinding(TrackDetailActivity trackDetailActivity) {
        return (d3g) trackDetailActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Bitmap buildBitmap() {
        AMap map = ((d3g) getMBinding()).f0.getMMapView().getMap();
        ArrayList arrayList = new ArrayList();
        for (CommonTrackData commonTrackData : getMapList()) {
            Point screenLocation = map.getProjection().toScreenLocation(new LatLng(commonTrackData.getLatitude(), commonTrackData.getLongitude()));
            Location location = new Location();
            location.longitude = screenLocation.x;
            location.latitude = screenLocation.y;
            location.flagSegment = commonTrackData.getFlagSegment();
            ListExtKt.add(arrayList, location);
        }
        Path path = new Path();
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            Location location2 = (Location) arrayList.get(i2);
            if (i2 == i + 1) {
                path.moveTo((float) location2.longitude, (float) location2.latitude);
            } else {
                path.lineTo((float) location2.longitude, (float) location2.latitude);
            }
            if (location2.flagSegment) {
                i = i2;
            }
        }
        ((d3g) getMBinding()).P.setPath(path);
        TrackShareRoutineView trackShareRoutineView = ((d3g) getMBinding()).P;
        TrackShareRoutineView routineView = ((d3g) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(routineView, "routineView");
        return trackShareRoutineView.createBitmap(routineView, ((d3g) getMBinding()).P.getWidth(), ((d3g) getMBinding()).P.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void buildData(Pair<byte[], Recorder> pair, String bothTime, String routeFrom, String dis) {
        String strValueOf;
        String strValueOf2;
        dismissDialog();
        this.recorder = pair.getSecond();
        setDataByteArray(pair.getFirst());
        Recorder recorder = this.recorder;
        Intrinsics.checkNotNull(recorder);
        String nameStr = recorder.getNameStr();
        String str = bothTime + " | " + routeFrom;
        Recorder recorder2 = this.recorder;
        Intrinsics.checkNotNull(recorder2);
        String duration = recorder2.getDuration();
        String string = getString(x0j.C);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(x0j.B);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Recorder recorder3 = this.recorder;
        Intrinsics.checkNotNull(recorder3);
        if (recorder3.isEleEnable()) {
            Recorder recorder4 = this.recorder;
            Intrinsics.checkNotNull(recorder4);
            strValueOf = String.valueOf((int) recorder4.getCumulativeIncrease());
        } else {
            strValueOf = "--";
        }
        String string3 = getString(x0j.D);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        Recorder recorder5 = this.recorder;
        Intrinsics.checkNotNull(recorder5);
        if (recorder5.isEleEnable()) {
            Recorder recorder6 = this.recorder;
            Intrinsics.checkNotNull(recorder6);
            strValueOf2 = String.valueOf((int) recorder6.getCumulativeDecrease());
        } else {
            strValueOf2 = "--";
        }
        String string4 = getString(x0j.A);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        setReport(new Report(nameStr, str, duration, string, dis, string2, strValueOf, string3, strValueOf2, string4));
        EditRouteBean editRouteBean = this.editRouteBean;
        if (editRouteBean != null) {
            editRouteBean.setRouteName(getReport().getName());
        }
        ((d3g) getMBinding()).A0(getReport());
        FitnessLogUtils.i(TAG, "buildData render binding ui routeName = " + getReport().getName());
        setMapList(new ArrayList());
        Recorder recorder7 = this.recorder;
        Intrinsics.checkNotNull(recorder7);
        List<RecorderPoint> originalPointList = recorder7.getOriginalPointList();
        if (originalPointList != null) {
            for (RecorderPoint recorderPoint : originalPointList) {
                double[] dArrC = bxa.c(recorderPoint.getOriginalLat(), recorderPoint.getOriginalLon());
                ListExtKt.add(getMapList(), new CommonTrackData(dArrC[0], dArrC[1], 0.0d, null, recorderPoint.getFlagSegment(), 12, null));
            }
        }
        ((d3g) getMBinding()).f0.setLocationList(getMapList());
        Recorder recorder8 = this.recorder;
        Intrinsics.checkNotNull(recorder8);
        setChart(recorder8);
    }

    private final void buildEditRouteBean(TrackDetailData data) {
        FitnessLogUtils.i(TAG, "buildEditRouteBean :" + data);
        HashMap map = new HashMap();
        map.put("alias", data.getAlias());
        map.put("source", data.getSource());
        map.put("suffix", data.getSuffix());
        map.put(StepsInfo.KEY_DISTANCE, data.getDis());
        map.put("uploadTime", String.valueOf(data.getUploadTime()));
        this.editRouteBean = new EditRouteBean(data.getAlias(), data.getRouteId(), data.getUploadTime(), map);
    }

    private final void createMapDialog() {
        WeakReference<SportMapStyleDialog> weakReference = new WeakReference<>(SportDetailHelper.createSportMapStyleDialog$default(SportDetailHelper.INSTANCE.getInstance(this), this.mapStyleSetting, null, 2, null));
        this.sportMapDialog = weakReference;
        SportMapStyleDialog sportMapStyleDialog = weakReference.get();
        if (sportMapStyleDialog != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        Recorder second;
        TrackDetailData trackDetailData = (TrackDetailData) getIntent().getSerializableExtra(ROUTE_DETAIL);
        this.routeDetail = trackDetailData;
        int dis = 0;
        boolean z = trackDetailData == null;
        this.fromPage = Integer.valueOf(getIntent().getIntExtra(FROM_PAGE, 0));
        TextView trackName = ((d3g) getMBinding()).g0;
        Intrinsics.checkNotNullExpressionValue(trackName, "trackName");
        showEditNameView(trackName);
        FitnessLogUtils.i(TAG, "route: " + this.routeDetail);
        if (!z) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
            TextView trackName2 = ((d3g) getMBinding()).g0;
            Intrinsics.checkNotNullExpressionValue(trackName2, "trackName");
            setTrackNameCanEdit(trackName2);
            TrackDetailData trackDetailData2 = this.routeDetail;
            Intrinsics.checkNotNull(trackDetailData2);
            buildEditRouteBean(trackDetailData2);
            ((d3g) getMBinding()).N.setText(getString(x0j.L));
            ScopeExtKt.scopeLife$default(this, (Lifecycle.Event) null, (CoroutineDispatcher) null, new C29081(null), 3, (Object) null);
            return;
        }
        TrackImportListFragment.Companion companion = TrackImportListFragment.INSTANCE;
        Pair<byte[], Recorder> dataPair = companion.getDataPair();
        Intrinsics.checkNotNull(dataPair);
        String str = this.SOURCE;
        Pair<byte[], Recorder> dataPair2 = companion.getDataPair();
        if (dataPair2 != null && (second = dataPair2.getSecond()) != null) {
            dis = second.getDis();
        }
        buildData(dataPair, "--", str, xr5.d(2, ((double) dis) / ((double) 1000)).toString());
        ((d3g) getMBinding()).N.setText(getString(x0j.K));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        FitnessLogUtils.i(TAG, "initView");
        setActionBarDisplayable(false);
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(((d3g) getMBinding()).K);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorB, "from(...)");
        ViewGroup.LayoutParams layoutParams = ((d3g) getMBinding()).f0.getLayoutParams();
        UIUtils uIUtils = UIUtils.INSTANCE;
        layoutParams.height = uIUtils.getScreenHeight(AppUtil.getApp()) / 2;
        ((d3g) getMBinding()).f0.setLayoutParams(layoutParams);
        bottomSheetBehaviorB.W(uIUtils.getScreenHeight(AppUtil.getApp()) - (((d3g) getMBinding()).f0.getLayoutParams().height - ExtUtilsKt.getDp(80)));
    }

    private final boolean isSupportTrack() {
        String did;
        String did2;
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
            if ((deviceManagerExtKt2.getDeviceCapabilityV2(str) & 4) == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapStyleSetting$lambda$19(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapStyleSetting$lambda$20(String style, String name) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(name, "name");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit mapStyleSetting$lambda$21(TrackDetailActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d3g) this$0.getMBinding()).f0.loadMapStyle(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapStyleSetting$lambda$22(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    private final void preInstallTrackFile(final String id, int routerSize, final File file, String name, int distance, final Function0<Unit> transferFinish) {
        ((d3g) getMBinding()).O.getRoot().setVisibility(0);
        ((TrackDetailVM) getMViewModel()).installTrack(id, routerSize, file, name, distance, new Function3() { // from class: ylp
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TrackDetailActivity.preInstallTrackFile$lambda$34(this.f40308a, id, file, transferFinish, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit preInstallTrackFile$lambda$34(final TrackDetailActivity this$0, final String id, File file, final Function0 transferFinish, boolean z, final int i, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(id, "$id");
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(transferFinish, "$transferFinish");
        FitnessLogUtils.i(TAG, "installTrack: " + z + " " + i + " " + num);
        if (z) {
            ((TrackDetailVM) this$0.getMViewModel()).doInstallTrack(id, file, num, new Function3() { // from class: nlp
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TrackDetailActivity.preInstallTrackFile$lambda$34$lambda$33(this.f28050a, transferFinish, i, id, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
                }
            });
        } else {
            ((d3g) this$0.getMBinding()).O.getRoot().setVisibility(8);
            transferFinish.invoke();
            TrackApiKt.getInstance(TrackApi.INSTANCE).showTrackErrorToast(i);
            FitnessLogUtils.i(TAG, "code : " + i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit preInstallTrackFile$lambda$34$lambda$33(TrackDetailActivity this$0, Function0 transferFinish, int i, String id, boolean z, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(transferFinish, "$transferFinish");
        Intrinsics.checkNotNullParameter(id, "$id");
        if (z) {
            FitnessLogUtils.i(TAG, "result2:" + num);
            ProgressBar progressBar = ((d3g) this$0.getMBinding()).O.A;
            Intrinsics.checkNotNull(num);
            progressBar.setProgress(num.intValue());
            ((d3g) this$0.getMBinding()).O.B.setText(num + "%");
            ((d3g) this$0.getMBinding()).O.getRoot().setVisibility(8);
            transferFinish.invoke();
            if (num.intValue() == 100) {
                String string = this$0.getString(x0j.Q);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(this$0, string);
                this$0.transformedRouteId = id;
            }
        } else {
            ((d3g) this$0.getMBinding()).O.getRoot().setVisibility(8);
            transferFinish.invoke();
            FitnessLogUtils.i(TAG, "code : " + i);
        }
        return Unit.INSTANCE;
    }

    private final void rebuildByteArrayName(String name) {
        byte[] bytes = name.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrCopyOf = Arrays.copyOf(bytes, 60);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        if (getDataByteArray() == null) {
            return;
        }
        int length = bArrCopyOf.length + 10;
        int i = 11;
        if (11 > length) {
            return;
        }
        while (true) {
            getDataByteArray()[i] = bArrCopyOf[i - 11];
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void resultFinish() {
        if (this.transformedRouteId.length() > 0) {
            Intent intent = new Intent();
            intent.putExtra("route_id", this.transformedRouteId);
            setResult(-1, intent);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setChart(Recorder recorder) {
        List<RecorderPoint> pointList;
        ArrayList arrayList = new ArrayList();
        if (!recorder.isEleEnable() || ((pointList = recorder.getPointList()) != null && pointList.isEmpty())) {
            LinearLayout chartLl = ((d3g) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(chartLl, "chartLl");
            ViewExtKt.invisible(chartLl);
            NestedScrollView mScrollView = ((d3g) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(mScrollView, "mScrollView");
            ViewExtKt.gone(mScrollView);
            ConstraintLayout noEleSportReport = ((d3g) getMBinding()).M.A;
            Intrinsics.checkNotNullExpressionValue(noEleSportReport, "noEleSportReport");
            ViewExtKt.visible(noEleSportReport);
            TextView trackName2 = ((d3g) getMBinding()).M.O;
            Intrinsics.checkNotNullExpressionValue(trackName2, "trackName2");
            showEditNameView(trackName2);
            TextView trackName3 = ((d3g) getMBinding()).M.O;
            Intrinsics.checkNotNullExpressionValue(trackName3, "trackName2");
            setTrackNameCanEdit(trackName3);
            return;
        }
        List<RecorderPoint> pointList2 = recorder.getPointList();
        Iterable<IndexedValue> iterableWithIndex = pointList2 != null ? CollectionsKt___CollectionsKt.withIndex(pointList2) : null;
        Intrinsics.checkNotNull(iterableWithIndex);
        for (IndexedValue indexedValue : iterableWithIndex) {
            int iComponent1 = indexedValue.component1();
            RecorderPoint recorderPoint = (RecorderPoint) indexedValue.component2();
            if (recorderPoint.getEle() != -100000.0d) {
                ListExtKt.add(arrayList, new SportRecordItem(iComponent1, iComponent1 + 1, Double.valueOf(recorderPoint.getEle()), iComponent1, 0, 16, null));
            }
        }
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(arrayList);
        CustomLineChart customLineChart = ((d3g) getMBinding()).B;
        customLineChart.setChartKey(SportRecordKey.Height);
        CustomLineChart.bindData$default(customLineChart, sportRecordListModelCreateEntryListInner.getSportRecordList(), LineDataSet.Mode.LINEAR, 0.0f, null, 0, 28, null);
        customLineChart.getXAxis().setEnabled(false);
        SportDetailItemView.bindData$default(((d3g) getMBinding()).F, new rz5(getString(x0j.f38549k), xr5.f(recorder.getAveAltitude())), false, 2, null);
        rz5 rz5Var = new rz5(getString(x0j.v), xr5.f(recorder.getMaxAltitude()));
        CustomLineChart.setLimitLine$default(((d3g) getMBinding()).B, recorder.getAveAltitude(), "", 0.0f, 0.0f, 8, null);
        SportDetailItemView.bindData$default(((d3g) getMBinding()).G, rz5Var, false, 2, null);
        ((d3g) getMBinding()).E.bindData(doi.l, getString(x0j.J));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void setListener() {
        Integer num;
        String did;
        String did2;
        if (this.routeDetail != null) {
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
                if ((deviceManagerExtKt2.getDeviceCapabilityV2(str) & 4) == 0) {
                    ((d3g) getMBinding()).N.setVisibility(8);
                } else {
                    num = this.fromPage;
                    if (num == null && num.intValue() == 1) {
                        ((d3g) getMBinding()).N.setVisibility(8);
                    } else {
                        ((d3g) getMBinding()).N.setVisibility(0);
                    }
                }
            } else {
                num = this.fromPage;
                if (num == null) {
                    ((d3g) getMBinding()).N.setVisibility(0);
                } else {
                    ((d3g) getMBinding()).N.setVisibility(8);
                }
            }
        } else {
            num = this.fromPage;
            if (num == null) {
                ((d3g) getMBinding()).N.setVisibility(0);
            } else {
                ((d3g) getMBinding()).N.setVisibility(8);
            }
        }
        ((d3g) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: bmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$1(this.f4374a, view);
            }
        });
        ((TrackDetailVM) getMViewModel()).isUpload().observe(this, new TrackDetailActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gmp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackDetailActivity.setListener$lambda$2(this.f19140a, (Status) obj);
            }
        }));
        ((d3g) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: hmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$4(this.f20244a, view);
            }
        });
        ((d3g) getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: imp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$8(this.f21304a, view);
            }
        });
        ((d3g) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: olp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$9(this.f29280a, view);
            }
        });
        ((d3g) getMBinding()).a0.setOnClickListener(new View.OnClickListener() { // from class: plp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$10(this.f30528a, view);
            }
        });
        ((d3g) getMBinding()).U.setOnClickListener(new View.OnClickListener() { // from class: qlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$11(this.f31641a, view);
            }
        });
        ((d3g) getMBinding()).d0.setOnClickListener(new View.OnClickListener() { // from class: rlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$12(this.f32689a, view);
            }
        });
        ((d3g) getMBinding()).X.setOnClickListener(new View.OnClickListener() { // from class: slp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$13(this.f33768a, view);
            }
        });
        ((d3g) getMBinding()).M.J.setOnClickListener(new View.OnClickListener() { // from class: tlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$14(this.f34836a, view);
            }
        });
        ((d3g) getMBinding()).M.D.setOnClickListener(new View.OnClickListener() { // from class: cmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$15(this.f5489a, view);
            }
        });
        ((d3g) getMBinding()).M.M.setOnClickListener(new View.OnClickListener() { // from class: dmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$16(this.f15699a, view);
            }
        });
        ((d3g) getMBinding()).M.G.setOnClickListener(new View.OnClickListener() { // from class: emp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.setListener$lambda$17(this.f16819a, view);
            }
        });
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: fmp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackDetailActivity.setListener$lambda$18(this.f17936a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$1(final TrackDetailActivity this$0, View view) {
        String nameStr;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.routeDetail == null && !this$0.hasUpdateToServer) {
            NetUtil netUtil = NetUtil.INSTANCE;
            Application application = this$0.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            if (!netUtil.getNetWorkAvailable(application)) {
                ToastUtil.showShortToast(x0j.common_network_error_retry_later);
                return;
            } else if (!this$0.isLogin) {
                ToastUtil.showShortToast(x0j.Y);
                return;
            } else {
                PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
                ((TrackDetailVM) this$0.getMViewModel()).uploadTrack(this$0.recorder, this$0.buildBitmap());
                return;
            }
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(x0j.d);
            return;
        }
        Recorder recorder = this$0.recorder;
        if (recorder == null) {
            return;
        }
        byte[] name = recorder != null ? recorder.getName() : null;
        Recorder recorder2 = this$0.recorder;
        FitnessLogUtils.i(TAG, "transform route to device name:" + name + ",md5:" + (recorder2 != null ? recorder2.getMd5() : null));
        ((d3g) this$0.getMBinding()).N.setClickable(false);
        ParserHelper parserHelper = ParserHelper.INSTANCE;
        Application app = AppUtil.getApp();
        byte[] dataByteArray = this$0.getDataByteArray();
        Recorder recorder3 = this$0.recorder;
        if (recorder3 == null || (nameStr = recorder3.getNameStr()) == null) {
            nameStr = "";
        }
        File fileWriteByteArrayToDownload = parserHelper.writeByteArrayToDownload(app, dataByteArray, nameStr);
        Recorder recorder4 = this$0.recorder;
        Intrinsics.checkNotNull(recorder4);
        String md5Str = recorder4.getMd5Str();
        int length = (int) fileWriteByteArrayToDownload.length();
        Recorder recorder5 = this$0.recorder;
        Intrinsics.checkNotNull(recorder5);
        String nameStr2 = recorder5.getNameStr();
        Recorder recorder6 = this$0.recorder;
        Intrinsics.checkNotNull(recorder6);
        this$0.preInstallTrackFile(md5Str, length, fileWriteByteArrayToDownload, nameStr2, recorder6.getDis(), new Function0() { // from class: amp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrackDetailActivity.setListener$lambda$1$lambda$0(this.f1222a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$1$lambda$0(TrackDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d3g) this$0.getMBinding()).N.setClickable(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$10(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupWindow(view, doi.g, ExtUtilsKt.getDp(Float.valueOf(-20.0f)), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$11(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupWindow(view, doi.i, ExtUtilsKt.getDp(Float.valueOf(-150.0f)), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$12(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupWindow(view, doi.f, ExtUtilsKt.getDp(Float.valueOf(-20.0f)), ExtUtilsKt.getDp(-80));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$13(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupWindow(view, doi.h, ExtUtilsKt.getDp(-120), ExtUtilsKt.getDp(-80));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$14(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupWindow(view, doi.g, ExtUtilsKt.getDp(Float.valueOf(-20.0f)), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$15(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupWindow(view, doi.i, ExtUtilsKt.getDp(Float.valueOf(-150.0f)), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$16(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupWindow(view, doi.f, ExtUtilsKt.getDp(Float.valueOf(-20.0f)), ExtUtilsKt.getDp(-80));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$17(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupWindow(view, doi.h, ExtUtilsKt.getDp(-120), ExtUtilsKt.getDp(-80));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$18(TrackDetailActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isLogin = z;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$2(TrackDetailActivity this$0, Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        if (status.getSuccess()) {
            ToastUtil.showShortToast(this$0.getString(x0j.R));
            TextView trackName = ((d3g) this$0.getMBinding()).g0;
            Intrinsics.checkNotNullExpressionValue(trackName, "trackName");
            this$0.setTrackNameCanEdit(trackName);
            LiveDataBus.INSTANCE.get().with(UPLOAD_SUCCESS, Integer.TYPE).postValue(0);
            if (this$0.transformedRouteId.length() > 0) {
                Intent intent = new Intent();
                intent.putExtra("route_id", this$0.transformedRouteId);
                this$0.setResult(-1, intent);
            }
            this$0.hasUpdateToServer = true;
            if (this$0.isSupportTrack()) {
                Button operateBtn = ((d3g) this$0.getMBinding()).N;
                Intrinsics.checkNotNullExpressionValue(operateBtn, "operateBtn");
                ViewExtKt.visible(operateBtn);
                ((d3g) this$0.getMBinding()).N.setText(this$0.getString(x0j.L));
            } else {
                Button operateBtn2 = ((d3g) this$0.getMBinding()).N;
                Intrinsics.checkNotNullExpressionValue(operateBtn2, "operateBtn");
                ViewExtKt.gone(operateBtn2);
            }
        } else {
            TrackApiKt.getInstance(TrackApi.INSTANCE).showTrackServerErrorToast(status.getCode());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$4(TrackDetailActivity this$0, View view) {
        SportMapStyleDialog sportMapStyleDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.createMapDialog();
        WeakReference<SportMapStyleDialog> weakReference = this$0.sportMapDialog;
        if (weakReference == null || (sportMapStyleDialog = weakReference.get()) == null) {
            return;
        }
        Integer mMapStyle = ((d3g) this$0.getMBinding()).f0.getMMapStyle();
        sportMapStyleDialog.setMapStyle(mMapStyle != null ? mMapStyle.intValue() : 1);
        sportMapStyleDialog.showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(TrackDetailActivity this$0, View view) {
        List<RecorderPoint> originalPointList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBasicReport sportBasicReport = new SportBasicReport(null);
        ArrayList<CommonTrackData> arrayList = new ArrayList();
        Recorder recorder = this$0.recorder;
        if (recorder != null && (originalPointList = recorder.getOriginalPointList()) != null) {
            for (RecorderPoint recorderPoint : originalPointList) {
                arrayList.add(new CommonTrackData(recorderPoint.getOriginalLat(), recorderPoint.getOriginalLon(), recorderPoint.getEle(), 0L, false, 16, null));
            }
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("sport_report", sportBasicReport);
        Recorder recorder2 = this$0.recorder;
        bundle.putString(ExportTrackActivityKt.TRACKS_NAME, recorder2 != null ? recorder2.getNameStr() : null);
        bundle.putBoolean(ExportTrackActivityKt.TRACKS_HAS_GPS, true);
        ArrayList arrayList2 = new ArrayList();
        for (CommonTrackData commonTrackData : arrayList) {
            arrayList2.add(new TrackData(commonTrackData.getLatitude(), commonTrackData.getLongitude(), commonTrackData.getElevation(), commonTrackData.getTime()));
        }
        SportRecordApiKt.setTrackList(arrayList2);
        SportRecordApiKt.getSportRecordApi().goExportTrackActivity(this$0, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$9(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resultFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTrackNameCanEdit(TextView editView) {
        Integer num = this.fromPage;
        if (num != null && num.intValue() == 1) {
            editView.setClickable(false);
            editView.setOnClickListener(null);
        } else {
            editView.setClickable(true);
            editView.setOnClickListener(new View.OnClickListener() { // from class: ulp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrackDetailActivity.setTrackNameCanEdit$lambda$27(this.f35916a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTrackNameCanEdit$lambda$27(TrackDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, "EditRouteBean:" + this$0.editRouteBean);
        Intent intent = new Intent(this$0, (Class<?>) TrackEditNameActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(TrackEditNameActivity.ROUTE_DATA, this$0.editRouteBean);
        intent.putExtras(bundle);
        this$0.startActivityForResult(intent, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showEditNameView(TextView editView) {
        String did;
        Integer num = this.fromPage;
        if ((num != null && num.intValue() == 1) || this.routeDetail == null) {
            editView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            ((d3g) getMBinding()).N.setVisibility(8);
            return;
        }
        editView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, doi.j, 0);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        if ((deviceManagerExtKt.getDeviceCapability(did) & 134217728) != 0) {
            ((d3g) getMBinding()).N.setVisibility(0);
        }
    }

    private final void showPopupWindow(View v, int bg, int xoff, int yoff) {
        View viewInflate = LayoutInflater.from(this).inflate(bvi.f4643k, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(vri.C)).setBackgroundResource(bg);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
        popupWindow.setTouchable(true);
        popupWindow.showAsDropDown(v, xoff, yoff);
    }

    @NotNull
    public final byte[] getDataByteArray() {
        byte[] bArr = this.dataByteArray;
        if (bArr != null) {
            return bArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataByteArray");
        return null;
    }

    @Nullable
    public final EditRouteBean getEditRouteBean() {
        return this.editRouteBean;
    }

    @Nullable
    public final Integer getFromPage() {
        return this.fromPage;
    }

    public final boolean getHasUpdateToServer() {
        return this.hasUpdateToServer;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return bvi.g;
    }

    @NotNull
    public final List<CommonTrackData> getMapList() {
        List<CommonTrackData> list = this.mapList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapList");
        return null;
    }

    @Nullable
    public final Recorder getRecorder() {
        return this.recorder;
    }

    @NotNull
    public final Report getReport() {
        Report report = this.report;
        if (report != null) {
            return report;
        }
        Intrinsics.throwUninitializedPropertyAccessException("report");
        return null;
    }

    @Nullable
    public final TrackDetailData getRouteDetail() {
        return this.routeDetail;
    }

    @NotNull
    public final String getSOURCE() {
        return this.SOURCE;
    }

    @NotNull
    public final String getTransformedRouteId() {
        return this.transformedRouteId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX INFO: renamed from: isCanEditName, reason: from getter */
    public final boolean getIsCanEditName() {
        return this.isCanEditName;
    }

    /* JADX INFO: renamed from: isLogin, reason: from getter */
    public final boolean getIsLogin() {
        return this.isLogin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            String stringExtra = data != null ? data.getStringExtra("name") : null;
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return;
            }
            FitnessLogUtils.i(TAG, "onActivityResult   name = " + stringExtra + ",editRoutBean = " + this.editRouteBean + " , isCanEditName:" + this.isCanEditName);
            if (this.isCanEditName) {
                ((d3g) getMBinding()).g0.setText(stringExtra);
            }
            ((d3g) getMBinding()).M.O.setText(stringExtra);
            EditRouteBean editRouteBean = this.editRouteBean;
            if (editRouteBean != null) {
                editRouteBean.setRouteName(stringExtra);
            }
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.setNameStr(stringExtra);
            }
            rebuildByteArrayName(stringExtra);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        resultFinish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.route.track.view.Hilt_TrackDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((d3g) getMBinding()).f0.onCreate(savedInstanceState);
        initView();
        initData();
        setListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.route.track.view.Hilt_TrackDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FitnessLogUtils.i(TAG, LifecycleConstantKt.ON_DESTROY);
        ((d3g) getMBinding()).f0.onDestroy();
        this.isCanEditName = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ((d3g) getMBinding()).f0.onLowMemory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((d3g) getMBinding()).f0.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((d3g) getMBinding()).f0.onResume();
    }

    public final void setCanEditName(boolean z) {
        this.isCanEditName = z;
    }

    public final void setDataByteArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.dataByteArray = bArr;
    }

    public final void setEditRouteBean(@Nullable EditRouteBean editRouteBean) {
        this.editRouteBean = editRouteBean;
    }

    public final void setFromPage(@Nullable Integer num) {
        this.fromPage = num;
    }

    public final void setHasUpdateToServer(boolean z) {
        this.hasUpdateToServer = z;
    }

    public final void setLogin(boolean z) {
        this.isLogin = z;
    }

    public final void setMapList(@NotNull List<CommonTrackData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mapList = list;
    }

    public final void setRecorder(@Nullable Recorder recorder) {
        this.recorder = recorder;
    }

    public final void setReport(@NotNull Report report) {
        Intrinsics.checkNotNullParameter(report, "<set-?>");
        this.report = report;
    }

    public final void setRouteDetail(@Nullable TrackDetailData trackDetailData) {
        this.routeDetail = trackDetailData;
    }

    public final void setTransformedRouteId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transformedRouteId = str;
    }
}
