package com.xiaomi.fitness.sport.view.route;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.mi.health.sport.RunningRouteListMap;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.sport.route.detail.model.CityRouteCount;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport.service.SportDataStoreManagerKt;
import com.xiaomi.fitness.sport.sporttab.SupportCityManager;
import com.xiaomi.fitness.sport.view.route.RunningRouteListActivity;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport.view.route.ext.RunningRouteExtKt;
import com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM;
import com.xiaomi.fitness.sport_export.RouteConstantsKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.a4i;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.gak;
import defpackage.nuf;
import defpackage.o7h;
import defpackage.oyi;
import defpackage.pwi;
import defpackage.rbd;
import defpackage.xr5;
import defpackage.xri;
import defpackage.zn0;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 `2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001`B\u0007¢\u0006\u0004\b_\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001bH\u0014¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0006J/\u0010+\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000e2\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[¨\u0006a"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/RunningRouteListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "Lzn0;", "", "setListener", "()V", "startLocation", "initTitles", "", "shouldShowCreateNotice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCreateNoticeShown", "showCreateNotice", "", "exceptionType", "showExceptionIcon", "(I)V", "category", "resetCache", "getData", "(IZ)V", "aiOpen", "checkCreateEntry", "(Z)V", "initViews", "addTabLayout", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "outState", "onSaveInstanceState", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", AccountInteractActivity.KEY_REQUEST_CODE, "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter;", "mAdapter", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter;", "setMAdapter", "(Lcom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter;)V", "Lcom/mi/health/sport/RunningRouteListMap$LocationData;", "locationData", "Lcom/mi/health/sport/RunningRouteListMap$LocationData;", "getLocationData", "()Lcom/mi/health/sport/RunningRouteListMap$LocationData;", "setLocationData", "(Lcom/mi/health/sport/RunningRouteListMap$LocationData;)V", "Lcom/amap/api/maps/model/LatLng;", "currentSelectLatLng", "Lcom/amap/api/maps/model/LatLng;", "getCurrentSelectLatLng", "()Lcom/amap/api/maps/model/LatLng;", "setCurrentSelectLatLng", "(Lcom/amap/api/maps/model/LatLng;)V", "showListContent", "Z", "curExceptionState", "I", "isBottomCardShow", "La4i;", "popupMenu", "La4i;", "Landroidx/cardview/widget/CardView;", "createRouteCardView", "Landroidx/cardview/widget/CardView;", "getCreateRouteCardView", "()Landroidx/cardview/widget/CardView;", "setCreateRouteCardView", "(Landroidx/cardview/widget/CardView;)V", "", "Lcom/mi/health/sport/RunningRouteListMap$MarkerModel;", "markerList", "Ljava/util/List;", "getMarkerList", "()Ljava/util/List;", "Lcom/google/android/material/tabs/TabLayout$d;", "tablayoutSelectListener", "Lcom/google/android/material/tabs/TabLayout$d;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRunningRouteListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteListActivity.kt\ncom/xiaomi/fitness/sport/view/route/RunningRouteListActivity\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,621:1\n53#2:622\n55#2:626\n50#3:623\n55#3:625\n107#4:624\n1557#5:627\n1628#5,3:628\n1863#5,2:631\n54#6,3:633\n24#6:636\n59#6,6:637\n*S KotlinDebug\n*F\n+ 1 RunningRouteListActivity.kt\ncom/xiaomi/fitness/sport/view/route/RunningRouteListActivity\n*L\n270#1:622\n270#1:626\n270#1:623\n270#1:625\n270#1:624\n164#1:627\n164#1:628,3\n215#1:631,2\n542#1:633,3\n542#1:636\n542#1:637,6\n*E\n"})
public final class RunningRouteListActivity extends Hilt_RunningRouteListActivity<RunningRouteListVM, zn0> {
    public static final int EXCEPTION_HAS_DATA = -1;
    public static final int EXCEPTION_NO_DATA = 1;
    public static final int EXCEPTION_NO_NETWORK = 0;
    public static final int EXCEPTION_NO_PEIMISSION = 2;
    public static final int HIGHEST_HEAT = 1;

    @NotNull
    public static final String KEY_ITEM_DATA = "key_item_data";
    public static final int NEAREST = 0;

    @NotNull
    public static final String TAG = "RunningRouteListActivity";

    @NotNull
    public static final String URL_RUNNING_ROUTE_GUIDE = "https://watch.iot.mi.com/libai/index.html#/article?id=604";
    public CardView createRouteCardView;

    @Nullable
    private LatLng currentSelectLatLng;

    @Nullable
    private RunningRouteListMap.LocationData locationData;
    public RunningRouteListAdapter mAdapter;

    @Nullable
    private a4i popupMenu;
    private boolean showListContent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Preferences.Key<Boolean> HAS_SHOWN_CREATE_NOTICE = PreferencesKeys.booleanKey("RunningRouteListActivityHasShownCreateNotice");
    private int curExceptionState = -1;
    private boolean isBottomCardShow = true;

    @NotNull
    private final List<RunningRouteListMap.MarkerModel> markerList = new ArrayList();

    @NotNull
    private final TabLayout.d tablayoutSelectListener = new TabLayout.d() { // from class: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$tablayoutSelectListener$1
        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.g tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.g tab) {
            Integer numValueOf = tab != null ? Integer.valueOf(tab.g()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                RunningRouteListActivity.getData$default(this.this$0, 0, false, 2, null);
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                RunningRouteListActivity.getData$default(this.this$0, 1, false, 2, null);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.g tab) {
        }
    };

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/RunningRouteListActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_ITEM_DATA", "NEAREST", "", "HIGHEST_HEAT", "URL_RUNNING_ROUTE_GUIDE", "EXCEPTION_NO_NETWORK", "EXCEPTION_NO_DATA", "EXCEPTION_NO_PEIMISSION", "EXCEPTION_HAS_DATA", "HAS_SHOWN_CREATE_NOTICE", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getHAS_SHOWN_CREATE_NOTICE", "()Landroidx/datastore/preferences/core/Preferences$Key;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Preferences.Key<Boolean> getHAS_SHOWN_CREATE_NOTICE() {
            return RunningRouteListActivity.HAS_SHOWN_CREATE_NOTICE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$checkCreateEntry$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$checkCreateEntry$1", f = "RunningRouteListActivity.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteListActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RunningRouteListActivity runningRouteListActivity = RunningRouteListActivity.this;
                this.label = 1;
                if (runningRouteListActivity.showCreateNotice(this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$setCreateNoticeShown$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$setCreateNoticeShown$2", f = "RunningRouteListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(RunningRouteListActivity.INSTANCE.getHAS_SHOWN_CREATE_NOTICE(), Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$showCreateNotice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.RunningRouteListActivity", f = "RunningRouteListActivity.kt", i = {0, 0, 0}, l = {289, 290}, m = "showCreateNotice", n = {"this", "createNotice", "createNoticeCard"}, s = {"L$0", "L$1", "L$2"})
    public static final class C30451 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C30451(Continuation<? super C30451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunningRouteListActivity.this.showCreateNotice(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$showCreateNotice$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$showCreateNotice$2", f = "RunningRouteListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30462 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ View $createNotice;
        final /* synthetic */ CardView $createNoticeCard;
        int label;
        final /* synthetic */ RunningRouteListActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30462(View view, CardView cardView, RunningRouteListActivity runningRouteListActivity, Continuation<? super C30462> continuation) {
            super(2, continuation);
            this.$createNotice = view;
            this.$createNoticeCard = cardView;
            this.this$0 = runningRouteListActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(View view, RunningRouteListActivity runningRouteListActivity, View view2) {
            view.setVisibility(8);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(runningRouteListActivity), null, null, new RunningRouteListActivity$showCreateNotice$2$1$1(runningRouteListActivity, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(View view, RunningRouteListActivity runningRouteListActivity) {
            view.setVisibility(8);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(runningRouteListActivity), null, null, new RunningRouteListActivity$showCreateNotice$2$2$1(runningRouteListActivity, null), 3, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30462(this.$createNotice, this.$createNoticeCard, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$createNotice.setVisibility(0);
            this.$createNotice.requestLayout();
            CardView cardView = this.$createNoticeCard;
            Intrinsics.checkNotNull(cardView);
            ViewExtKt.preventParentHorizontalOverflow(cardView, ExtUtilsKt.getDp(Boxing.boxInt(1)));
            final View view = this.$createNotice;
            final RunningRouteListActivity runningRouteListActivity = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.route.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RunningRouteListActivity.C30462.invokeSuspend$lambda$0(view, runningRouteListActivity, view2);
                }
            });
            final View view2 = this.$createNotice;
            final RunningRouteListActivity runningRouteListActivity2 = this.this$0;
            return Boxing.boxBoolean(view2.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.sport.view.route.m
                @Override // java.lang.Runnable
                public final void run() {
                    RunningRouteListActivity.C30462.invokeSuspend$lambda$1(view2, runningRouteListActivity2);
                }
            }, 3000L));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C30462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addTabLayout() {
        TabLayout.g gVarA = ((zn0) getMBinding()).I.A();
        Intrinsics.checkNotNullExpressionValue(gVarA, "newTab(...)");
        gVarA.u(c1j.J2);
        gVarA.i.setPadding(0, 0, 0, 0);
        ((zn0) getMBinding()).I.c(gVarA);
        TabLayout.g gVarA2 = ((zn0) getMBinding()).I.A();
        Intrinsics.checkNotNullExpressionValue(gVarA2, "newTab(...)");
        gVarA2.u(c1j.N1);
        gVarA2.i.setPadding(ExtUtilsKt.getDp(40), 0, ExtUtilsKt.getDp(40), 0);
        ((zn0) getMBinding()).I.c(gVarA2);
        ((zn0) getMBinding()).I.addOnTabSelectedListener(this.tablayoutSelectListener);
    }

    private final void checkCreateEntry(boolean aiOpen) {
        if (!aiOpen) {
            ViewExtKt.gone(getCreateRouteCardView());
        } else {
            ViewExtKt.visible(getCreateRouteCardView());
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getData(int category, boolean resetCache) {
        if (this.currentSelectLatLng == null) {
            RunningRouteListMap.LocationData locationData = this.locationData;
            if (locationData != null) {
                ((RunningRouteListVM) getMViewModel()).getRouteList(category, locationData.getLongitude(), locationData.getLatitude(), (16 & 8) != 0 ? false : resetCache, (16 & 16) != 0 ? 0 : 0);
                return;
            }
            return;
        }
        RunningRouteListVM runningRouteListVM = (RunningRouteListVM) getMViewModel();
        LatLng latLng = this.currentSelectLatLng;
        Intrinsics.checkNotNull(latLng);
        double d = latLng.longitude;
        LatLng latLng2 = this.currentSelectLatLng;
        Intrinsics.checkNotNull(latLng2);
        runningRouteListVM.getRouteList(category, d, latLng2.latitude, (16 & 8) != 0 ? false : resetCache, (16 & 16) != 0 ? 0 : 0);
    }

    public static /* synthetic */ void getData$default(RunningRouteListActivity runningRouteListActivity, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        runningRouteListActivity.getData(i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTitles() {
        setCreateRouteCardView((CardView) findViewById(xri.n7));
        View viewFindViewById = findViewById(xri.C3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CardView cardView = (CardView) viewFindViewById;
        View viewFindViewById2 = findViewById(xri.A3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        a4i a4iVar = new a4i(this, viewFindViewById2);
        this.popupMenu = a4iVar;
        a4iVar.f(pwi.f30858a);
        a4i a4iVar2 = this.popupMenu;
        if (a4iVar2 != null) {
            a4iVar2.setOnMenuItemClickListener(new a4i.c() { // from class: v3l
                @Override // a4i.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return RunningRouteListActivity.initTitles$lambda$9(this.f36445a, menuItem);
                }
            });
        }
        nuf.f(getCreateRouteCardView());
        checkCreateEntry(SupportCityManager.INSTANCE.isAIOpen());
        getCreateRouteCardView().setOnClickListener(new View.OnClickListener() { // from class: w3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteListActivity.initTitles$lambda$10(this.f37517a, view);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() { // from class: x3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteListActivity.initTitles$lambda$11(this.f38653a, view);
            }
        });
        ((zn0) getMBinding()).K.A.setOnClickListener(new View.OnClickListener() { // from class: y3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteListActivity.initTitles$lambda$12(this.f39756a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitles$lambda$10(RunningRouteListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity.INSTANCE.start(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitles$lambda$11(RunningRouteListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a4i a4iVar = this$0.popupMenu;
        if (a4iVar != null) {
            a4iVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitles$lambda$12(RunningRouteListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initTitles$lambda$9(RunningRouteListActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == xri.L7) {
            TrackApiKt.getInstance(TrackApi.INSTANCE).startTrackLibPage();
            return true;
        }
        if (itemId == xri.l2) {
            this$0.startActivity(new Intent(this$0, (Class<?>) RunningRouteHistoryActivity.class));
            return true;
        }
        if (itemId != xri.e4) {
            return true;
        }
        WebViewUtilKt.startWebView$default("https://watch.iot.mi.com/libai/index.html#/article?id=604", null, false, false, null, false, null, false, 254, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    private final void initViews() {
        setActionBarDisplayable(false);
        ((zn0) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: t3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteListActivity.initViews$lambda$16(this.f34270a, view);
            }
        });
        if (!NetworkUtils.isNetworkConnected(this)) {
            showExceptionIcon(0);
            return;
        }
        if (!LocationExtKt.supportsOutdoorSportPositionService(this) || !PermissionExtKt.isPermissionGranted(this, "android.permission.ACCESS_FINE_LOCATION")) {
            showExceptionIcon(2);
            return;
        }
        RecyclerView recyclerView = ((zn0) getMBinding()).G;
        setMAdapter(new RunningRouteListAdapter(this));
        recyclerView.setAdapter(getMAdapter());
        recyclerView.addItemDecoration(new gak(ExtUtilsKt.getDp(Double.valueOf(6.66d))));
        final BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(((zn0) getMBinding()).J);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorB, "from(...)");
        bottomSheetBehaviorB.setState(3);
        bottomSheetBehaviorB.W(0);
        bottomSheetBehaviorB.s(new BottomSheetBehavior.f() { // from class: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity.initViews.3
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }
        });
        nuf.f(((zn0) getMBinding()).H.I);
        ((zn0) getMBinding()).H.I.setOnClickListener(new View.OnClickListener() { // from class: e4l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteListActivity.initViews$lambda$18(bottomSheetBehaviorB, view);
            }
        });
        nuf.f(((zn0) getMBinding()).H.C);
        ((zn0) getMBinding()).H.C.setOnClickListener(new View.OnClickListener() { // from class: g4l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteListActivity.initViews$lambda$20(this.f18588a, view);
            }
        });
        ((zn0) getMBinding()).D.setDismissBottomCard(new Function0() { // from class: h4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteListActivity.initViews$lambda$21(this.f19687a);
            }
        });
        ((zn0) getMBinding()).D.setShowBottomCard(new Function0() { // from class: i4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteListActivity.initViews$lambda$22(this.f20781a);
            }
        });
        nuf.f(((zn0) getMBinding()).H.A);
        ((zn0) getMBinding()).H.A.setOnClickListener(new View.OnClickListener() { // from class: j4l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteListActivity.initViews$lambda$26(this.f22414a, view);
            }
        });
        MutableLiveData<RunningRouteListMap.MarkerModel> routeSelectLiveData = ((zn0) getMBinding()).D.getRouteSelectLiveData();
        if (routeSelectLiveData != null) {
            routeSelectLiveData.observe(this, new RunningRouteListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k4l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningRouteListActivity.initViews$lambda$28(this.f23442a, (RunningRouteListMap.MarkerModel) obj);
                }
            }));
        }
        ((zn0) getMBinding()).D.getLocationData().observe(this, new RunningRouteListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l4l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningRouteListActivity.initViews$lambda$30(this.f24665a, (RunningRouteListMap.LocationData) obj);
            }
        }));
        ((RunningRouteListVM) getMViewModel()).getCityRoutes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$16(final RunningRouteListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!PermissionExtKt.isPermissionGranted(this$0, "android.permission.ACCESS_FINE_LOCATION")) {
            androidx.core.app.a.v(this$0, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, Math.abs(-2));
        }
        if (LocationExtKt.supportsOutdoorSportPositionService(this$0)) {
            return;
        }
        RunningRouteExtKt.routeCheckPermission(new Function0() { // from class: b4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteListActivity.initViews$lambda$16$lambda$15(this.f3796a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViews$lambda$16$lambda$15(RunningRouteListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onResume();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$18(BottomSheetBehavior behavior, View view) {
        Intrinsics.checkNotNullParameter(behavior, "$behavior");
        behavior.setState(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$20(final RunningRouteListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RunningRouteExtKt.routeCheckPermission(new Function0() { // from class: a4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteListActivity.initViews$lambda$20$lambda$19(this.f612a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViews$lambda$20$lambda$19(RunningRouteListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((zn0) this$0.getMBinding()).D.startLocation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViews$lambda$21(RunningRouteListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isBottomCardShow = false;
        ((zn0) this$0.getMBinding()).H.F.c0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViews$lambda$22(RunningRouteListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isBottomCardShow = true;
        ((zn0) this$0.getMBinding()).H.F.e0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initViews$lambda$26(RunningRouteListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isBottomCardShow) {
            MutableLiveData<RunningRouteListMap.MarkerModel> routeSelectLiveData = ((zn0) this$0.getMBinding()).D.getRouteSelectLiveData();
            RunningRouteListMap.MarkerModel value = routeSelectLiveData != null ? routeSelectLiveData.getValue() : null;
            Bundle bundle = new Bundle();
            if (value != null) {
                value.getRouteId();
                bundle.putInt("route_id", value.getRouteId());
            }
            if (value != null && value.getTraceFileUrl() != null) {
                bundle.putString(RouteConstantsKt.KEY_TRACE_FILE_URL, value.getTraceFileUrl());
            }
            SportRouterKt.startRouteDetailActivity(this$0, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViews$lambda$28(RunningRouteListActivity this$0, RunningRouteListMap.MarkerModel markerModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView routeIcon = ((zn0) this$0.getMBinding()).H.E;
        Intrinsics.checkNotNullExpressionValue(routeIcon, "routeIcon");
        String icon = markerModel.getIcon();
        ImageLoader imageLoader = Coil.imageLoader(routeIcon.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(routeIcon.getContext()).data(icon).target(routeIcon);
        builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(15)));
        imageLoader.enqueue(builderTarget.build());
        ((zn0) this$0.getMBinding()).H.D.setText(markerModel.getTitleName());
        ((zn0) this$0.getMBinding()).H.G.setText(AppUtil.getApp().getResources().getQuantityString(zxi.i, (int) markerModel.getLength(), Double.valueOf(markerModel.getLength())));
        RunningRouteListMap.LocationData locationData = this$0.locationData;
        Intrinsics.checkNotNull(locationData);
        double latitude = locationData.getLatitude();
        RunningRouteListMap.LocationData locationData2 = this$0.locationData;
        Intrinsics.checkNotNull(locationData2);
        double dCalculateLineDistance = ((double) AMapUtils.calculateLineDistance(new LatLng(latitude, locationData2.getLongitude()), new LatLng(markerModel.getLatitude(), markerModel.getLongitude()))) / ((double) 1000);
        ((zn0) this$0.getMBinding()).H.K.setText(AppUtil.getApp().getResources().getQuantityString(zxi.m, (int) dCalculateLineDistance, xr5.d(2, dCalculateLineDistance)));
        TextView routeType = ((zn0) this$0.getMBinding()).H.H;
        Intrinsics.checkNotNullExpressionValue(routeType, "routeType");
        RouteDetailExtKt.showRouteTypeTag(routeType, Integer.valueOf(markerModel.getCategory()));
        ((zn0) this$0.getMBinding()).H.B.setText(" | " + AppUtil.getApp().getResources().getQuantityString(zxi.f41782k, markerModel.getHeat(), Integer.valueOf(markerModel.getHeat())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViews$lambda$30(final RunningRouteListActivity this$0, RunningRouteListMap.LocationData locationData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (locationData == null) {
            return Unit.INSTANCE;
        }
        FitnessLogUtils.i(TAG, "it:" + locationData);
        this$0.locationData = locationData;
        getData$default(this$0, 0, false, 2, null);
        ((RunningRouteListVM) this$0.getMViewModel()).recheckSupportCity(locationData.getCityCode()).observe(this$0, new RunningRouteListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z3l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningRouteListActivity.initViews$lambda$30$lambda$29(this.f40843a, (RunningRouteSupportCityBean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViews$lambda$30$lambda$29(RunningRouteListActivity this$0, RunningRouteSupportCityBean runningRouteSupportCityBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = false;
        if (runningRouteSupportCityBean != null && runningRouteSupportCityBean.getAiOpen()) {
            z = true;
        }
        this$0.checkCreateEntry(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat onCreate$lambda$1(RunningRouteListActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.g());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        ((zn0) this$0.getMBinding()).K.getRoot().setPaddingRelative(0, rbdVarF.f32379b, 0, 0);
        return WindowInsetsCompat.f2098b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(RunningRouteListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setCreateNoticeShown(Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(SportDataStoreManagerKt.getSportDataStore(this), new AnonymousClass2(null), continuation);
        return objEdit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setListener() {
        MutableLiveData<RunningRouteListBean> routeListLiveData = ((RunningRouteListVM) getMViewModel()).getRouteListLiveData();
        if (routeListLiveData != null) {
            routeListLiveData.observe(this, new RunningRouteListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d4l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningRouteListActivity.setListener$lambda$4(this.f15081a, (RunningRouteListBean) obj);
                }
            }));
        }
        ((zn0) getMBinding()).D.setOnCameraChangeListener(new Function1() { // from class: f4l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningRouteListActivity.setListener$lambda$7(this.f17395a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$4(RunningRouteListActivity this$0, RunningRouteListBean runningRouteListBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<RouteInfo> route_Info_list = runningRouteListBean != null ? runningRouteListBean.getRoute_Info_list() : null;
        this$0.showListContent = !(route_Info_list == null || route_Info_list.isEmpty());
        CoordinatorLayout listContent = ((zn0) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(listContent, "listContent");
        ViewExtKt.setVisible(listContent, this$0.showListContent);
        RelativeLayout detailCard = ((zn0) this$0.getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(detailCard, "detailCard");
        ViewExtKt.setVisible(detailCard, this$0.showListContent);
        if (!this$0.showListContent || runningRouteListBean == null) {
            this$0.showExceptionIcon(1);
        } else {
            if (runningRouteListBean.getRoute_Info_list() == null || this$0.locationData == null) {
                return Unit.INSTANCE;
            }
            RunningRouteListAdapter mAdapter = this$0.getMAdapter();
            List<RouteInfo> route_Info_list2 = runningRouteListBean.getRoute_Info_list();
            RunningRouteListMap.LocationData locationData = this$0.locationData;
            Intrinsics.checkNotNull(locationData);
            mAdapter.setData(route_Info_list2, locationData);
            this$0.markerList.clear();
            List<RouteInfo> route_Info_list3 = runningRouteListBean.getRoute_Info_list();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(route_Info_list3, 10));
            for (RouteInfo routeInfo : route_Info_list3) {
                List<RunningRouteListMap.MarkerModel> list = this$0.markerList;
                String quantityString = AppUtil.getApp().getResources().getQuantityString(oyi.common_unit_kilometer_desc_new, (int) routeInfo.getLength(), Double.valueOf(routeInfo.getLength()));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                arrayList.add(Boolean.valueOf(list.add(new RunningRouteListMap.MarkerModel(quantityString, routeInfo.getKmlFile(), routeInfo.getId(), routeInfo.getStartPoint().getLongitude(), routeInfo.getStartPoint().getLatitude(), routeInfo.getIcon(), routeInfo.getLength(), routeInfo.getDistance(), routeInfo.getCategory(), routeInfo.getName(), routeInfo.getKmlFile(), routeInfo.getHeat(), ((RunningRouteListVM) this$0.getMViewModel()).formatSuffix(routeInfo.getKmlFile(), null)))));
            }
            if (!runningRouteListBean.getRoute_Info_list().isEmpty()) {
                ImageView routeIcon = ((zn0) this$0.getMBinding()).H.E;
                Intrinsics.checkNotNullExpressionValue(routeIcon, "routeIcon");
                TextView name = ((zn0) this$0.getMBinding()).H.D;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                TextView routeLength = ((zn0) this$0.getMBinding()).H.G;
                Intrinsics.checkNotNullExpressionValue(routeLength, "routeLength");
                TextView startPointDis = ((zn0) this$0.getMBinding()).H.K;
                Intrinsics.checkNotNullExpressionValue(startPointDis, "startPointDis");
                TextView routeType = ((zn0) this$0.getMBinding()).H.H;
                Intrinsics.checkNotNullExpressionValue(routeType, "routeType");
                RunningRouteExtKt.bindRouteItemData(routeIcon, name, routeLength, startPointDis, routeType, runningRouteListBean.getRoute_Info_list().get(0));
            }
            RecyclerView.o layoutManager = ((zn0) this$0.getMBinding()).G.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
            ((zn0) this$0.getMBinding()).D.setMarkers(this$0.markerList);
            this$0.showExceptionIcon(-1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$7(final RunningRouteListActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((zn0) this$0.getMBinding()).D.clearMap();
        ((zn0) this$0.getMBinding()).D.getMap().clear();
        if (z) {
            if (!this$0.markerList.isEmpty()) {
                ((zn0) this$0.getMBinding()).D.setMarkers(this$0.markerList);
            }
        } else if (!((RunningRouteListVM) this$0.getMViewModel()).getCityRoutesList().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CityRouteCount cityRouteCount : ((RunningRouteListVM) this$0.getMViewModel()).getCityRoutesList()) {
                arrayList.add(new LatLng(cityRouteCount.getLatitude(), cityRouteCount.getLongitude()));
                arrayList2.add(cityRouteCount.getRouteNums());
            }
            ((zn0) this$0.getMBinding()).D.setCityMarker(arrayList, arrayList2, new Function1() { // from class: u3l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningRouteListActivity.setListener$lambda$7$lambda$6(this.f35342a, (LatLng) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$7$lambda$6(RunningRouteListActivity this$0, LatLng latLng) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this$0.currentSelectLatLng = latLng;
        this$0.getData(0, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shouldShowCreateNotice(Continuation<? super Boolean> continuation) {
        final Flow<Preferences> data = SportDataStoreManagerKt.getSportDataStore(this).getData();
        return FlowKt.first(new Flow<Boolean>() { // from class: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$shouldShowCreateNotice$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$shouldShowCreateNotice$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RunningRouteListActivity.kt\ncom/xiaomi/fitness/sport/view/route/RunningRouteListActivity\n*L\n1#1,222:1\n54#2:223\n271#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$shouldShowCreateNotice$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.RunningRouteListActivity$shouldShowCreateNotice$$inlined$map$1$2", f = "RunningRouteListActivity.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean bool = (Boolean) ((Preferences) obj).get(RunningRouteListActivity.HAS_SHOWN_CREATE_NOTICE);
                        Boolean boolBoxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showCreateNotice(Continuation<? super Unit> continuation) {
        C30451 c30451;
        CardView cardView;
        RunningRouteListActivity runningRouteListActivity;
        View view;
        if (continuation instanceof C30451) {
            c30451 = (C30451) continuation;
            int i = c30451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30451.label = i - Integer.MIN_VALUE;
            } else {
                c30451 = new C30451(continuation);
            }
        } else {
            c30451 = new C30451(continuation);
        }
        Object obj = c30451.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c30451.label;
        if (i2 != 0) {
            if (i2 == 1) {
                cardView = (CardView) c30451.L$2;
                view = (View) c30451.L$1;
                runningRouteListActivity = (RunningRouteListActivity) c30451.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        View viewFindViewById = findViewById(xri.E0);
        cardView = (CardView) findViewById(xri.F0);
        c30451.L$0 = this;
        c30451.L$1 = viewFindViewById;
        c30451.L$2 = cardView;
        c30451.label = 1;
        Object objShouldShowCreateNotice = shouldShowCreateNotice(c30451);
        if (objShouldShowCreateNotice == coroutine_suspended) {
            return coroutine_suspended;
        }
        runningRouteListActivity = this;
        view = viewFindViewById;
        obj = objShouldShowCreateNotice;
        if (!((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        C30462 c30462 = new C30462(view, cardView, runningRouteListActivity, null);
        c30451.L$0 = null;
        c30451.L$1 = null;
        c30451.L$2 = null;
        c30451.label = 2;
        if (BuildersKt.withContext(main, c30462, c30451) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showExceptionIcon(int exceptionType) {
        Logger.d(TAG, "showExceptionIcon exceptionType=" + exceptionType);
        this.curExceptionState = exceptionType;
        Button goOpenPermissions = ((zn0) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(goOpenPermissions, "goOpenPermissions");
        ViewExtKt.gone(goOpenPermissions);
        if (exceptionType == 0) {
            CoordinatorLayout listContent = ((zn0) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(listContent, "listContent");
            ViewExtKt.gone(listContent);
            ConstraintLayout notActivatedGroup = ((zn0) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(notActivatedGroup, "notActivatedGroup");
            ViewExtKt.visible(notActivatedGroup);
            ((zn0) getMBinding()).F.setText(c1j.H);
            ((zn0) getMBinding()).F.setCompoundDrawablesWithIntrinsicBounds(0, eoi.K, 0, 0);
            return;
        }
        if (exceptionType == 1) {
            ConstraintLayout notActivatedGroup2 = ((zn0) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(notActivatedGroup2, "notActivatedGroup");
            ViewExtKt.visible(notActivatedGroup2);
            CoordinatorLayout listContent2 = ((zn0) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(listContent2, "listContent");
            ViewExtKt.gone(listContent2);
            ((zn0) getMBinding()).F.setText(c1j.q4);
            ((zn0) getMBinding()).F.setCompoundDrawablesWithIntrinsicBounds(0, eoi.f0, 0, 0);
            return;
        }
        if (exceptionType != 2) {
            ConstraintLayout notActivatedGroup3 = ((zn0) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(notActivatedGroup3, "notActivatedGroup");
            ViewExtKt.gone(notActivatedGroup3);
            CoordinatorLayout listContent3 = ((zn0) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(listContent3, "listContent");
            ViewExtKt.visible(listContent3);
            LinearLayoutCompat tablayoutLl = ((zn0) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(tablayoutLl, "tablayoutLl");
            ViewExtKt.visible(tablayoutLl);
            return;
        }
        ConstraintLayout notActivatedGroup4 = ((zn0) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(notActivatedGroup4, "notActivatedGroup");
        ViewExtKt.visible(notActivatedGroup4);
        CoordinatorLayout listContent4 = ((zn0) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(listContent4, "listContent");
        ViewExtKt.gone(listContent4);
        LinearLayoutCompat tablayoutLl2 = ((zn0) getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(tablayoutLl2, "tablayoutLl");
        ViewExtKt.gone(tablayoutLl2);
        Button goOpenPermissions2 = ((zn0) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(goOpenPermissions2, "goOpenPermissions");
        ViewExtKt.visible(goOpenPermissions2);
        ((zn0) getMBinding()).F.setText(c1j.a3);
        ((zn0) getMBinding()).F.setCompoundDrawablesWithIntrinsicBounds(0, eoi.f0, 0, 0);
    }

    private final void startLocation() {
        RunningRouteExtKt.routeCheckPermission(new Function0() { // from class: c4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteListActivity.startLocation$lambda$8(this.f4918a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startLocation$lambda$8(RunningRouteListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((zn0) this$0.getMBinding()).D.startLocation();
        return Unit.INSTANCE;
    }

    @NotNull
    public final CardView getCreateRouteCardView() {
        CardView cardView = this.createRouteCardView;
        if (cardView != null) {
            return cardView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createRouteCardView");
        return null;
    }

    @Nullable
    public final LatLng getCurrentSelectLatLng() {
        return this.currentSelectLatLng;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.i;
    }

    @Nullable
    public final RunningRouteListMap.LocationData getLocationData() {
        return this.locationData;
    }

    @NotNull
    public final RunningRouteListAdapter getMAdapter() {
        RunningRouteListAdapter runningRouteListAdapter = this.mAdapter;
        if (runningRouteListAdapter != null) {
            return runningRouteListAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    @NotNull
    public final List<RunningRouteListMap.MarkerModel> getMarkerList() {
        return this.markerList;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.route.Hilt_RunningRouteListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        super.onCreate(savedInstanceState);
        ((zn0) getMBinding()).D.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
        } else {
            Window window = getWindow();
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        androidx.core.view.c.H0(getWindow().getDecorView(), new o7h() { // from class: m4l
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return RunningRouteListActivity.onCreate$lambda$1(this.f25747a, view, windowInsetsCompat);
            }
        });
        initTitles();
        initViews();
        setListener();
        addTabLayout();
        ((zn0) getMBinding()).getRoot().post(new Runnable() { // from class: n4l
            @Override // java.lang.Runnable
            public final void run() {
                RunningRouteListActivity.onCreate$lambda$2(this.f27545a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.route.Hilt_RunningRouteListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((zn0) getMBinding()).D.onDestroy();
        ((zn0) getMBinding()).I.removeOnTabSelectedListener(this.tablayoutSelectListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ((zn0) getMBinding()).D.onLowMemory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((zn0) getMBinding()).D.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Math.abs(-2)) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                onResume();
            } else {
                SystemSetting.INSTANCE.goToSetting(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(TAG, "onResume1");
        a4i a4iVar = this.popupMenu;
        if (a4iVar != null) {
            a4iVar.c();
        }
        ((zn0) getMBinding()).D.onResume();
        if (LocationExtKt.supportsOutdoorSportPositionService(this) && PermissionExtKt.isPermissionGranted(this, "android.permission.ACCESS_FINE_LOCATION") && this.curExceptionState != -1) {
            Logger.i(TAG, "onResume2 permission check pass");
            initViews();
            ((zn0) getMBinding()).D.startLocation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ((zn0) getMBinding()).D.onSaveInstanceState(outState);
    }

    public final void setCreateRouteCardView(@NotNull CardView cardView) {
        Intrinsics.checkNotNullParameter(cardView, "<set-?>");
        this.createRouteCardView = cardView;
    }

    public final void setCurrentSelectLatLng(@Nullable LatLng latLng) {
        this.currentSelectLatLng = latLng;
    }

    public final void setLocationData(@Nullable RunningRouteListMap.LocationData locationData) {
        this.locationData = locationData;
    }

    public final void setMAdapter(@NotNull RunningRouteListAdapter runningRouteListAdapter) {
        Intrinsics.checkNotNullParameter(runningRouteListAdapter, "<set-?>");
        this.mAdapter = runningRouteListAdapter;
    }
}
