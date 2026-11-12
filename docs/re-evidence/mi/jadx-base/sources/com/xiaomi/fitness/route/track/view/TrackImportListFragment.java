package com.xiaomi.fitness.route.track.view;

import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.decoration.LinearItemSpace;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.route.export.track.FailRoutes;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.export.track.RouteValue;
import com.xiaomi.fitness.route.track.TrackListFragmentOperator;
import com.xiaomi.fitness.route.track.TrackWearReceiver;
import com.xiaomi.fitness.route.track.view.TrackImportListFragment;
import com.xiaomi.fitness.route.track.view.UiResultData;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.av6;
import defpackage.bvi;
import defpackage.doi;
import defpackage.im9;
import defpackage.m2g;
import defpackage.mv1;
import defpackage.vri;
import defpackage.x0j;
import defpackage.yxi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u0000 r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001rB\u0007¢\u0006\u0004\bq\u0010\u000fJ\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ%\u0010\"\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u000fJ!\u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010,\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b,\u0010\tJ\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u000fJ\u000f\u0010.\u001a\u00020\u0007H\u0014¢\u0006\u0004\b.\u0010\u000fJ\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\u000fJ\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u0010\u000fJ\u000f\u00101\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u0010\u000fJ\u000f\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010\u000fJ\u000f\u00103\u001a\u00020 H\u0016¢\u0006\u0004\b3\u00104J+\u00107\u001a\u00020\u00072\u001a\u00106\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000705H\u0016¢\u0006\u0004\b7\u00108J5\u0010:\u001a\u00020\u00072$\u00106\u001a \u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000709H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010\u000fJ\r\u0010=\u001a\u00020\u0007¢\u0006\u0004\b=\u0010\u000fR\u0018\u0010>\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R,\u0010@\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0007\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR6\u0010B\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0007\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR(\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00140D8\u0006¢\u0006\f\n\u0004\bS\u0010G\u001a\u0004\bT\u0010IR\u0016\u0010U\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0016\u0010X\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010GR\u001c\u0010\\\u001a\b\u0012\u0002\b\u0003\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010YR\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010YR\u0018\u0010i\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010k\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackImportListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM;", "Lm2g;", "Lcom/xiaomi/fitness/route/track/TrackListFragmentOperator;", "Landroid/content/Intent;", "receivedIntent", "", "handleIntent", "(Landroid/content/Intent;)V", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "doParserHandleIntent", "(Landroid/net/Uri;)V", "configToDeviceTrack", "()V", "getData", "openFile", "doParserFile", "refreshSelectList", "", "routeId", "refreshDistributeState", "(Ljava/lang/String;)V", "", "delNum", "showDelDialog", "(I)V", "showNotSupport", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$RouteData;", "it", "", "morePage", "onDataOK", "(Lcom/xiaomi/fitness/baseui/recyclerview/StateData;Z)V", "initView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "setIntent", "initProgress", "setListener", "onDestroyView", LifecycleConstantKt.ON_DESTROY, "onEndViewClick", "onStartViewClick", "onBackPressed", "()Z", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setStartViewRefreshListener", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function3;", "setEndViewRefreshListener", "(Lkotlin/jvm/functions/Function3;)V", "requestEndView", "resetMainAdapter", "intent", "Landroid/content/Intent;", "startViewRefreshListener", "Lkotlin/jvm/functions/Function2;", "endViewRefreshListener", "Lkotlin/jvm/functions/Function3;", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "routeList", "Ljava/util/List;", "getRouteList", "()Ljava/util/List;", "setRouteList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter;", "adapter", "Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter;)V", "deleteRouteIds", "getDeleteRouteIds", "trackName", "Ljava/lang/String;", "filePath", "firstPage", "Z", "routerIdsInDevice", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "progressDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Landroid/widget/TextView;", "progressText", "Landroid/widget/TextView;", "Landroid/widget/ProgressBar;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Landroid/widget/ProgressBar;", "isCanDismissTrackListLoading", "", "preLoadTime", "J", "mIsFromDeviceLib", "endViewId", "Ljava/lang/Integer;", "selectView", "Landroid/view/View;", "getSelectView", "()Landroid/view/View;", "setSelectView", "(Landroid/view/View;)V", "<init>", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTrackImportListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackImportListFragment.kt\ncom/xiaomi/fitness/route/track/view/TrackImportListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,639:1\n1863#2,2:640\n1755#2,3:642\n1755#2,3:646\n1863#2,2:649\n1863#2,2:651\n774#2:653\n865#2,2:654\n1863#2,2:656\n774#2:658\n865#2,2:659\n774#2:661\n865#2,2:662\n1863#2,2:664\n774#2:666\n865#2,2:667\n1863#2,2:669\n1#3:645\n*S KotlinDebug\n*F\n+ 1 TrackImportListFragment.kt\ncom/xiaomi/fitness/route/track/view/TrackImportListFragment\n*L\n178#1:640,2\n250#1:642,3\n517#1:646,3\n578#1:649,2\n587#1:651,2\n280#1:653\n280#1:654,2\n281#1:656,2\n297#1:658\n297#1:659,2\n419#1:661\n419#1:662,2\n420#1:664,2\n421#1:666\n421#1:667,2\n421#1:669,2\n*E\n"})
public final class TrackImportListFragment extends Hilt_TrackImportListFragment<MyTrackLibraryVM, m2g> implements TrackListFragmentOperator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "TrackImportListFragment";

    @Nullable
    private static Pair<byte[], Recorder> dataPair;
    private static int pageState;
    public MyTrackLibraryAdapter adapter;

    @NotNull
    private final List<String> deleteRouteIds;

    @Nullable
    private Integer endViewId;

    @Nullable
    private Function3<? super View, ? super Integer, ? super Integer, Unit> endViewRefreshListener;

    @NotNull
    private String filePath;
    private boolean firstPage;

    @Nullable
    private Intent intent;
    private boolean isCanDismissTrackListLoading;
    private boolean mIsFromDeviceLib;
    private long preLoadTime;
    private ProgressBar progress;

    @Nullable
    private CommonDialog<?> progressDialog;
    private TextView progressText;

    @NotNull
    private List<Route> routeList;

    @Nullable
    private List<String> routerIdsInDevice;

    @Nullable
    private View selectView;

    @Nullable
    private Function2<? super View, ? super Integer, Unit> startViewRefreshListener;

    @NotNull
    private String trackName;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackImportListFragment$Companion;", "", "<init>", "()V", "TAG", "", "pageState", "", "getPageState", "()I", "setPageState", "(I)V", "dataPair", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "getDataPair", "()Lkotlin/Pair;", "setDataPair", "(Lkotlin/Pair;)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Pair<byte[], Recorder> getDataPair() {
            return TrackImportListFragment.dataPair;
        }

        public final int getPageState() {
            return TrackImportListFragment.pageState;
        }

        public final void setDataPair(@Nullable Pair<byte[], Recorder> pair) {
            TrackImportListFragment.dataPair = pair;
        }

        public final void setPageState(int i) {
            TrackImportListFragment.pageState = i;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackImportListFragment$onDataOK$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackImportListFragment$onDataOK$1", f = "TrackImportListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackImportListFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrackImportListFragment.this.refreshSelectList();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.TrackImportListFragment$setListener$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xiaomi/fitness/route/track/view/TrackImportListFragment$setListener$7", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView$LoadListener;", "loadMore", "", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass7 implements MoreRecyclerView.LoadListener {
        public AnonymousClass7() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit loadMore$lambda$0(TrackImportListFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            MoreRecyclerView.setStatus$default(TrackImportListFragment.access$getMBinding(this$0).D, TrackImportListFragment.access$getMViewModel(this$0).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
        public void loadMore() {
            FitnessLogUtils.i(TrackImportListFragment.TAG, "load more , getTrackList");
            MyTrackLibraryVM myTrackLibraryVMAccess$getMViewModel = TrackImportListFragment.access$getMViewModel(TrackImportListFragment.this);
            final TrackImportListFragment trackImportListFragment = TrackImportListFragment.this;
            MyTrackLibraryVM.getTrackList$default(myTrackLibraryVMAccess$getMViewModel, false, 0, null, false, new Function0() { // from class: lnp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TrackImportListFragment.AnonymousClass7.loadMore$lambda$0(trackImportListFragment);
                }
            }, 15, null);
        }
    }

    public TrackImportListFragment() {
        super(bvi.d, mv1.f27240a);
        this.routeList = new ArrayList();
        this.deleteRouteIds = new ArrayList();
        this.trackName = "";
        this.filePath = "";
        this.isCanDismissTrackListLoading = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ m2g access$getMBinding(TrackImportListFragment trackImportListFragment) {
        return (m2g) trackImportListFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ MyTrackLibraryVM access$getMViewModel(TrackImportListFragment trackImportListFragment) {
        return (MyTrackLibraryVM) trackImportListFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void configToDeviceTrack() {
        String[] stringArrayExtra;
        Intent intent = this.intent;
        this.routerIdsInDevice = (intent == null || (stringArrayExtra = intent.getStringArrayExtra(MyTrackLibraryActivity.ROUTE_IDS)) == null) ? null : ArraysKt___ArraysKt.toMutableList(stringArrayExtra);
        Intent intent2 = this.intent;
        boolean booleanExtra = intent2 != null ? intent2.getBooleanExtra(MyTrackLibraryActivity.isFromDeviceLib, false) : false;
        this.mIsFromDeviceLib = booleanExtra;
        if (booleanExtra) {
            pageState = 2;
            ((m2g) getMBinding()).A.setText(getResources().getText(x0j.L));
            this.endViewId = null;
            List<String> list = this.routerIdsInDevice;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    FitnessLogUtils.i(TAG, "设备上routerIds：" + ((String) it.next()));
                }
            }
        } else {
            this.endViewId = Integer.valueOf(doi.f15743b);
        }
        requestEndView();
        getAdapter().setDeviceTrack(this.routerIdsInDevice);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void doParserFile(Uri uri) {
        MyTrackLibraryVM myTrackLibraryVM = (MyTrackLibraryVM) getMViewModel();
        String str = this.filePath;
        String str2 = this.trackName;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        myTrackLibraryVM.parserFile(uri, str, str2, fragmentActivityRequireActivity);
    }

    private final void doParserHandleIntent(Uri uri) {
        this.trackName = "";
        this.filePath = "";
        ParserHelper parserHelper = ParserHelper.INSTANCE;
        ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        String trackName = parserHelper.getTrackName(uri, contentResolver);
        this.trackName = trackName;
        String strD = im9.D(trackName);
        this.filePath = strD;
        im9.y(strD);
        im9.u(this.trackName, uri);
        doParserFile(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getData() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        FitnessLogUtils.i(TAG, "getData getTrackList()");
        MyTrackLibraryVM.getTrackList$default((MyTrackLibraryVM) getMViewModel(), false, 0, null, false, new Function0() { // from class: anp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrackImportListFragment.getData$lambda$1(this.f3291a);
            }
        }, 15, null);
        LiveDataBus.INSTANCE.get().with(TrackDetailActivity.UPLOAD_SUCCESS, Integer.TYPE).observe(getViewLifecycleOwner(), new TrackImportListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bnp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackImportListFragment.getData$lambda$4(this.f4406a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getData$lambda$1(TrackImportListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MoreRecyclerView.setStatus$default(((m2g) this$0.getMBinding()).D, ((MyTrackLibraryVM) this$0.getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getData$lambda$4(final TrackImportListFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((m2g) this$0.getMBinding()).getRoot().postDelayed(new Runnable() { // from class: inp
            @Override // java.lang.Runnable
            public final void run() {
                TrackImportListFragment.getData$lambda$4$lambda$3(this.f21325a);
            }
        }, 1000L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getData$lambda$4$lambda$3(final TrackImportListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, "routeList size : " + this$0.routeList.size());
        this$0.firstPage = true;
        FitnessLogUtils.i(TAG, "getData getTrackList() refresh");
        MyTrackLibraryVM.getTrackList$default((MyTrackLibraryVM) this$0.getMViewModel(), false, 0, "", false, new Function0() { // from class: ymp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrackImportListFragment.getData$lambda$4$lambda$3$lambda$2(this.f40337a);
            }
        }, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getData$lambda$4$lambda$3$lambda$2(TrackImportListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MoreRecyclerView.setStatus$default(((m2g) this$0.getMBinding()).D, ((MyTrackLibraryVM) this$0.getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        return Unit.INSTANCE;
    }

    private final void handleIntent(Intent receivedIntent) {
        if (receivedIntent == null) {
            return;
        }
        this.intent = receivedIntent;
        Logger.d(TAG, "handleIntent");
        String action = receivedIntent.getAction();
        String type = receivedIntent.getType();
        if ((!Intrinsics.areEqual("android.intent.action.SEND", action) && !Intrinsics.areEqual("android.intent.action.VIEW", action)) || type == null) {
            if (Intrinsics.areEqual("android.intent.action.VIEW", receivedIntent.getAction())) {
                Uri data = receivedIntent.getData();
                if (data == null || type == null) {
                    Logger.i(TAG, "本地文件使用App打开异常");
                    return;
                }
                ParserHelper parserHelper = ParserHelper.INSTANCE;
                ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                String fileNameFromUri = parserHelper.getFileNameFromUri(data, contentResolver);
                if (!parserHelper.isSupportedParserFile(fileNameFromUri != null ? fileNameFromUri : "")) {
                    Logger.i(TAG, "parser file is not support");
                    showNotSupport();
                    finish();
                }
                doParserHandleIntent(data);
                return;
            }
            return;
        }
        this.isCanDismissTrackListLoading = false;
        Uri data2 = receivedIntent.getData();
        if (data2 == null || data2.getPath() == null) {
            Logger.i(TAG, "分享文件文件到App异常");
            showNotSupport();
            finish();
            return;
        }
        Logger.i(TAG, "uri path = " + data2.getPath());
        ParserHelper parserHelper2 = ParserHelper.INSTANCE;
        ContentResolver contentResolver2 = ApplicationExtKt.getApplication().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
        String fileNameFromUri2 = parserHelper2.getFileNameFromUri(data2, contentResolver2);
        boolean zIsSupportedParserFile = parserHelper2.isSupportedParserFile(fileNameFromUri2 != null ? fileNameFromUri2 : "");
        if (!Intrinsics.areEqual(type, HTTP.PLAIN_TEXT_TYPE) && !Intrinsics.areEqual(type, "application/gpx+xml") && !Intrinsics.areEqual(type, "application/vnd.google-earth.kml+xml") && !Intrinsics.areEqual(type, "application/kml") && !Intrinsics.areEqual(type, "application/vnd.garmin.tcx+xml")) {
            String path = data2.getPath();
            Intrinsics.checkNotNull(path);
            if (!StringsKt__StringsJVMKt.endsWith$default(path, ".gpx", false, 2, null)) {
                String path2 = data2.getPath();
                Intrinsics.checkNotNull(path2);
                if (!StringsKt__StringsJVMKt.endsWith$default(path2, ".kml", false, 2, null)) {
                    String path3 = data2.getPath();
                    Intrinsics.checkNotNull(path3);
                    if (!StringsKt__StringsJVMKt.endsWith$default(path3, ".tcx", false, 2, null) && !zIsSupportedParserFile) {
                        showNotSupport();
                        Logger.i(TAG, "parser file is not support receivedIntent type is " + receivedIntent.getType());
                        finish();
                        return;
                    }
                }
            }
        }
        doParserHandleIntent(data2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setActionBarDisplayable(false);
        Function2<? super View, ? super Integer, Unit> function2 = this.startViewRefreshListener;
        if (function2 != null) {
            function2.invoke(null, Integer.valueOf(doi.f15744k));
        }
        hideBack();
        setActionBarExpandState(0);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        setAdapter(new MyTrackLibraryAdapter(contextRequireContext));
        getAdapter().setRefreshSelectList(new Function0() { // from class: jnp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrackImportListFragment.initView$lambda$28(this.f22955a);
            }
        });
        MoreRecyclerView moreRecyclerView = ((m2g) getMBinding()).D;
        moreRecyclerView.setAdapter(getAdapter());
        moreRecyclerView.addItemDecoration(new LinearItemSpace(ExtUtilsKt.getDp(7), false, false, 2, null));
        LiveDataBus.INSTANCE.get().with(TrackEditNameActivity.EDIT_NAME, String.class).observe(getViewLifecycleOwner(), new TrackImportListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: knp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackImportListFragment.initView$lambda$30(this.f24027a, (String) obj);
            }
        }));
        configToDeviceTrack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$28(TrackImportListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshSelectList();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$30(TrackImportListFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.routeList.isEmpty()) {
            return Unit.INSTANCE;
        }
        RouteValue routeValue = (RouteValue) new Gson().fromJson(this$0.routeList.get(this$0.getAdapter().getGoDetailPosition()).getValue(), RouteValue.class);
        routeValue.setAlias(str);
        this$0.routeList.get(this$0.getAdapter().getGoDetailPosition()).setValue(new Gson().toJson(routeValue));
        this$0.getAdapter().notifyItemChanged(this$0.getAdapter().getGoDetailPosition());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(StateData<MyTrackLibraryVM.RouteData> it, boolean morePage) {
        FitnessLogUtils.i(TAG, "viewStates: onDataOK");
        if (this.isCanDismissTrackListLoading) {
            dismissDialog();
        }
        showContent();
        ConstraintLayout noDataView = ((m2g) getMBinding()).B.B;
        Intrinsics.checkNotNullExpressionValue(noDataView, "noDataView");
        ViewExtKt.gone(noDataView);
        MoreRecyclerView.setStatus$default(((m2g) getMBinding()).D, ((MyTrackLibraryVM) getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        if (this.firstPage) {
            this.routeList.clear();
            this.firstPage = false;
        }
        List<Route> list = this.routeList;
        List<Route> feeds = it.f11668a.getFeeds();
        Intrinsics.checkNotNull(feeds);
        list.addAll(feeds);
        List<Route> list2 = this.routeList;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Route route : list2) {
                if (route.isDelSelected() == null || Intrinsics.areEqual(route.isDelSelected(), Boolean.FALSE)) {
                    break;
                }
            }
        }
        getAdapter().setData(this.routeList);
        if (((MyTrackLibraryVM) getMViewModel()).getIsFirstPageData() || pageState != 3) {
            return;
        }
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    private final void openFile() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        Intent intentCreateChooser = Intent.createChooser(intent, "选择文件上传");
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        startForActivityResult(intentCreateChooser, new Function2() { // from class: wmp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TrackImportListFragment.openFile$lambda$6(this.f38153a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openFile$lambda$6(TrackImportListFragment this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (intent == null) {
            return Unit.INSTANCE;
        }
        this$0.trackName = "";
        this$0.filePath = "";
        Uri data = intent.getData();
        if (data != null) {
            Logger.i(TAG, "open file uri:" + data);
            ParserHelper parserHelper = ParserHelper.INSTANCE;
            ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            String trackName = parserHelper.getTrackName(data, contentResolver);
            this$0.trackName = trackName;
            String strD = im9.D(trackName);
            this$0.filePath = strD;
            im9.y(strD);
            im9.u(this$0.trackName, data);
            this$0.doParserFile(data);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshDistributeState(String routeId) {
        Object next;
        FitnessLogUtils.d(TAG, "refreshDistributeState , routeId:" + routeId);
        List<String> list = this.routerIdsInDevice;
        if (list != null && routeId.length() > 0) {
            Iterator<T> it = this.routeList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((Route) next).getRoute_id(), routeId));
            Route route = (Route) next;
            if (route != null) {
                route.setToDeviceSelected(false);
            }
            list.add(routeId);
        }
        final MyTrackLibraryAdapter adapter = getAdapter();
        adapter.setDeviceTrack(this.routerIdsInDevice);
        ((m2g) getMBinding()).getRoot().post(new Runnable() { // from class: zmp
            @Override // java.lang.Runnable
            public final void run() {
                TrackImportListFragment.refreshDistributeState$lambda$26$lambda$25(adapter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshDistributeState$lambda$26$lambda$25(MyTrackLibraryAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshSelectList() {
        List<Route> list = this.routeList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route : list) {
                if (route.isDelSelected() == null || Intrinsics.areEqual(route.isDelSelected(), Boolean.FALSE)) {
                    pageState = 1;
                    Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.endViewRefreshListener;
                    if (function3 != null) {
                        function3.invoke(null, Integer.valueOf(doi.c), Integer.valueOf(x0j.W));
                    }
                    this.endViewId = Integer.valueOf(doi.c);
                    return;
                }
            }
        }
        pageState = 3;
        Function3<? super View, ? super Integer, ? super Integer, Unit> function4 = this.endViewRefreshListener;
        if (function4 != null) {
            function4.invoke(null, Integer.valueOf(doi.d), Integer.valueOf(x0j.X));
        }
        this.endViewId = Integer.valueOf(doi.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$13(TrackImportListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = pageState;
        if (i == 0) {
            this$0.openFile();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                List<Route> list = this$0.routeList;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Route) obj).isToDeviceSelected()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    ToastUtil.showShortToast(x0j.E);
                    return;
                }
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                    ToastUtil.showLongToast(x0j.d);
                    return;
                }
                if (this$0.progressDialog == null) {
                    this$0.initProgress();
                }
                CommonDialog<?> commonDialog = this$0.progressDialog;
                if (commonDialog != null) {
                    commonDialog.showIfNeed(this$0.getParentFragmentManager());
                }
                ((MyTrackLibraryVM) this$0.getMViewModel()).toDeviceTrack(arrayList);
                return;
            }
            if (i != 3) {
                return;
            }
        }
        this$0.deleteRouteIds.clear();
        List<Route> list2 = this$0.routeList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            Boolean boolIsDelSelected = ((Route) obj2).isDelSelected();
            if (boolIsDelSelected != null && boolIsDelSelected.booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this$0.deleteRouteIds.add(((Route) it.next()).getRoute_id());
        }
        int size = this$0.deleteRouteIds.size();
        if (size == 0) {
            ToastUtil.showShortToast(x0j.E);
        } else {
            this$0.showDelDialog(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$15(final TrackImportListFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.preLoadTime < 1000) {
            return Unit.INSTANCE;
        }
        this$0.preLoadTime = System.currentTimeMillis();
        this$0.dismissDialogForce();
        if (pair == null) {
            ToastUtil.showShortToast(x0j.q);
            return Unit.INSTANCE;
        }
        Logger.i(TAG, "recorderData recorder: " + pair.getSecond() + ",recorder name:" + ((Recorder) pair.getSecond()).getName() + ",recorder md5:" + ((Recorder) pair.getSecond()).getMd5());
        try {
            dataPair = pair;
            MapDynamicUtils.INSTANCE.checkSoLoaded(null, new Function2() { // from class: xmp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TrackImportListFragment.setListener$lambda$15$lambda$14(this.f39273a, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
            return Unit.INSTANCE;
        } catch (Exception e) {
            Logger.d(TAG, "recorderFile operator exception:" + e.getMessage());
            this$0.showNotSupport();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$15$lambda$14(TrackImportListFragment this$0, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            AnyExtKt.main$default(null, new TrackImportListFragment$setListener$3$1$1(this$0, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$16(TrackImportListFragment this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "supportState: " + stateData);
        if (stateData.h()) {
            this$0.showNotSupport();
            this$0.isCanDismissTrackListLoading = true;
            this$0.dismissDialogForce();
        } else if (stateData.i()) {
            String string = this$0.getString(x0j.i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            PageState.DefaultImpls.showLoading$default(this$0, string, 0, false, 6, null);
        } else if (stateData.k()) {
            this$0.isCanDismissTrackListLoading = true;
            this$0.dismissDialogForce();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$17(TrackImportListFragment this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = !((MyTrackLibraryVM.RouteData) stateData.f11668a).getFirstPage();
        if (this$0.isCanDismissTrackListLoading) {
            this$0.dismissDialog();
        }
        if (stateData.g()) {
            FitnessLogUtils.i(TAG, "viewStates: isEmpty");
            if (z) {
                MoreRecyclerView.setStatus$default(((m2g) this$0.getMBinding()).D, Status.DONE, false, 2, null);
            } else {
                ConstraintLayout noDataView = ((m2g) this$0.getMBinding()).B.B;
                Intrinsics.checkNotNullExpressionValue(noDataView, "noDataView");
                ViewExtKt.visible(noDataView);
            }
            if (this$0.getAdapter().getMList().isEmpty() && pageState == 2) {
                Button importFile = ((m2g) this$0.getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(importFile, "importFile");
                ViewExtKt.gone(importFile);
            }
        } else if (stateData.h()) {
            FitnessLogUtils.i(TAG, "viewStates: isError");
            if (z) {
                MoreRecyclerView.setStatus$default(((m2g) this$0.getMBinding()).D, Status.FAIL, false, 2, null);
            } else {
                this$0.showError();
            }
        } else if (stateData.j()) {
            FitnessLogUtils.i(TAG, "viewStates: isNoNet");
            if (z) {
                MoreRecyclerView.setStatus$default(((m2g) this$0.getMBinding()).D, Status.FAIL, false, 2, null);
            }
            if (z) {
                MoreRecyclerView.setStatus$default(((m2g) this$0.getMBinding()).D, Status.FAIL, false, 2, null);
            } else {
                this$0.showNoNetwork();
            }
        } else if (stateData.k()) {
            Intrinsics.checkNotNull(stateData);
            this$0.onDataOK(stateData, z);
        } else if (stateData.i()) {
            FitnessLogUtils.i(TAG, "viewStates: isLoading");
            if (z) {
                MoreRecyclerView.setStatus$default(((m2g) this$0.getMBinding()).D, Status.LOADING, false, 2, null);
            } else {
                String string = this$0.getString(x0j.i);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                PageState.DefaultImpls.showLoading$default(this$0, string, 0, false, 6, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$22(TrackImportListFragment this$0, FailRoutes failRoutes) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<String> failRoutes2 = failRoutes.getFailRoutes();
        if (failRoutes2 == null || !failRoutes2.isEmpty()) {
            ToastUtil.showShortToast(x0j.m);
        } else {
            ToastUtil.showShortToast(x0j.l);
        }
        List<Route> list = this$0.routeList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Route route = (Route) obj;
            List<String> failRoutes3 = failRoutes.getFailRoutes();
            if (failRoutes3 != null && failRoutes3.contains(route.getRoute_id())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this$0.deleteRouteIds.remove(((Route) it.next()).getRoute_id());
        }
        List<Route> list2 = this$0.routeList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (this$0.deleteRouteIds.contains(((Route) obj2).getRoute_id())) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this$0.routeList.remove((Route) it2.next());
        }
        this$0.getAdapter().setData(this$0.routeList);
        if (this$0.routeList.isEmpty()) {
            ConstraintLayout noDataView = ((m2g) this$0.getMBinding()).B.B;
            Intrinsics.checkNotNullExpressionValue(noDataView, "noDataView");
            ViewExtKt.visible(noDataView);
            this$0.onStartViewClick();
        } else {
            ConstraintLayout noDataView2 = ((m2g) this$0.getMBinding()).B.B;
            Intrinsics.checkNotNullExpressionValue(noDataView2, "noDataView");
            ViewExtKt.gone(noDataView2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$8(TrackImportListFragment this$0, UiResultData uiResultData) {
        CommonDialog<?> commonDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String error = uiResultData.getError();
        if (error != null && error.length() > 0) {
            ToastUtil.showLongToast(uiResultData.getError());
        }
        FitnessLogUtils.i(TAG, "percentage:" + uiResultData);
        ProgressBar progressBar = this$0.progress;
        TextView textView = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BroadcastsKt.SILENT_PUSHING_PROGRESS);
            progressBar = null;
        }
        progressBar.setProgress(uiResultData.getPercentage());
        TextView textView2 = this$0.progressText;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressText");
        } else {
            textView = textView2;
        }
        textView.setText(uiResultData.getPercentage() + "%");
        if (uiResultData.getPercentage() == 100) {
            ToastUtil.showLongToast(this$0.getString(x0j.P));
        }
        this$0.refreshDistributeState(uiResultData.getRouteId());
        if (uiResultData.isComplete() && (commonDialog = this$0.progressDialog) != null) {
            commonDialog.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    private final void showDelDialog(int delNum) {
        CommonDialog commonDialogCreate = new CommonDialog.c("Track").setDialogTitle(x0j.n).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getResources().getQuantityString(yxi.f40669a, delNum, Integer.valueOf(delNum)))).setNegativeText(x0j.f38547a).setPositiveText(x0j.f38548b).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.route.track.view.TrackImportListFragment.showDelDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    if (NetUtil.INSTANCE.getNetWorkState(AppUtil.getApp()) == -1) {
                        ToastUtil.showShortToast(x0j.common_network_error_retry_later);
                        return;
                    }
                    MyTrackLibraryVM myTrackLibraryVMAccess$getMViewModel = TrackImportListFragment.access$getMViewModel(TrackImportListFragment.this);
                    List listDistinct = CollectionsKt___CollectionsKt.distinct(TrackImportListFragment.this.getDeleteRouteIds());
                    Intrinsics.checkNotNull(listDistinct, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                    myTrackLibraryVMAccess$getMViewModel.deleteTrackRoute(TypeIntrinsics.asMutableList(listDistinct));
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showNotSupport() {
        ToastUtil.INSTANCE.showToast(x0j.j);
    }

    @NotNull
    public final MyTrackLibraryAdapter getAdapter() {
        MyTrackLibraryAdapter myTrackLibraryAdapter = this.adapter;
        if (myTrackLibraryAdapter != null) {
            return myTrackLibraryAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final List<String> getDeleteRouteIds() {
        return this.deleteRouteIds;
    }

    @NotNull
    public final List<Route> getRouteList() {
        return this.routeList;
    }

    @Nullable
    public final View getSelectView() {
        return this.selectView;
    }

    public final void initProgress() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(bvi.l, (ViewGroup) null);
        this.progressText = (TextView) viewInflate.findViewById(vri.F);
        this.progress = (ProgressBar) viewInflate.findViewById(vri.D);
        this.progressDialog = new CommonDialog.c("TrackProgress").setCustomView(viewInflate).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        onStartViewClick();
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        pageState = 0;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        LiveDataBus.INSTANCE.get().with(TrackDetailActivity.UPLOAD_SUCCESS, Integer.TYPE).removeObservers(getViewLifecycleOwner());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void onEndViewClick() {
        int i = pageState;
        int i2 = (i != 0 && i == 1) ? 3 : 1;
        pageState = i2;
        if (i2 == 1) {
            Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.endViewRefreshListener;
            if (function3 != null) {
                function3.invoke(null, Integer.valueOf(doi.c), Integer.valueOf(x0j.W));
            }
            this.endViewId = Integer.valueOf(doi.c);
            Iterator<T> it = this.routeList.iterator();
            while (it.hasNext()) {
                ((Route) it.next()).setDelSelected(Boolean.FALSE);
            }
            ((m2g) getMBinding()).A.setText(getString(x0j.I));
            Function2<? super View, ? super Integer, Unit> function2 = this.startViewRefreshListener;
            if (function2 != null) {
                function2.invoke(null, Integer.valueOf(doi.f15742a));
            }
        } else if (i2 == 3) {
            Function3<? super View, ? super Integer, ? super Integer, Unit> function4 = this.endViewRefreshListener;
            if (function4 != null) {
                function4.invoke(null, Integer.valueOf(doi.d), Integer.valueOf(x0j.X));
            }
            this.endViewId = Integer.valueOf(doi.d);
            Iterator<T> it2 = this.routeList.iterator();
            while (it2.hasNext()) {
                ((Route) it2.next()).setDelSelected(Boolean.TRUE);
            }
            ((m2g) getMBinding()).A.setText(getString(x0j.I));
        } else {
            Function3<? super View, ? super Integer, ? super Integer, Unit> function5 = this.endViewRefreshListener;
            if (function5 != null) {
                function5.invoke(null, Integer.valueOf(doi.f15743b), Integer.valueOf(x0j.n));
            }
            this.endViewId = Integer.valueOf(doi.f15743b);
            ((m2g) getMBinding()).A.setText(getString(x0j.f38550r));
        }
        getAdapter().notifyDataSetChanged();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Intent intent = this.intent;
        if (intent != null) {
            handleIntent(intent);
            this.intent = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void onStartViewClick() {
        int i = pageState;
        if (i == 0 || i == 2) {
            finish();
            return;
        }
        Function2<? super View, ? super Integer, Unit> function2 = this.startViewRefreshListener;
        if (function2 != null) {
            function2.invoke(null, Integer.valueOf(doi.f15744k));
        }
        Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.endViewRefreshListener;
        if (function3 != null) {
            function3.invoke(null, Integer.valueOf(doi.f15743b), Integer.valueOf(x0j.n));
        }
        this.endViewId = Integer.valueOf(doi.f15743b);
        ((m2g) getMBinding()).A.setText(getString(x0j.f38550r));
        pageState = 0;
        getAdapter().notifyDataSetChanged();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        resetMainAdapter();
        initView();
        getData();
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void requestEndView() {
        if (this.mIsFromDeviceLib) {
            Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.endViewRefreshListener;
            if (function3 != null) {
                function3.invoke(null, null, null);
                return;
            }
            return;
        }
        Function3<? super View, ? super Integer, ? super Integer, Unit> function4 = this.endViewRefreshListener;
        if (function4 != null) {
            function4.invoke(null, this.endViewId, null);
        }
    }

    public final void resetMainAdapter() {
        Map<Integer, TrackListFragmentOperator> fragmentMaps;
        if (getMActivity() instanceof MyTrackLibraryActivity) {
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity, "null cannot be cast to non-null type com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity");
            TrackListFragmentAdapter fragmentAdapter = ((MyTrackLibraryActivity) mActivity).getFragmentAdapter();
            if (fragmentAdapter == null || (fragmentMaps = fragmentAdapter.getFragmentMaps()) == null) {
                return;
            }
            fragmentMaps.put(2, this);
        }
    }

    public final void setAdapter(@NotNull MyTrackLibraryAdapter myTrackLibraryAdapter) {
        Intrinsics.checkNotNullParameter(myTrackLibraryAdapter, "<set-?>");
        this.adapter = myTrackLibraryAdapter;
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void setEndViewRefreshListener(@NotNull Function3<? super View, ? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.endViewRefreshListener = listener;
    }

    public final void setIntent(@Nullable Intent receivedIntent) {
        this.intent = receivedIntent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        TrackWearReceiver.INSTANCE.get();
        ((MyTrackLibraryVM) getMViewModel()).getInstallPercentage().observe(getViewLifecycleOwner(), new TrackImportListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cnp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackImportListFragment.setListener$lambda$8(this.f5583a, (UiResultData) obj);
            }
        }));
        ((m2g) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: dnp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackImportListFragment.setListener$lambda$13(this.f15727a, view);
            }
        });
        ((MyTrackLibraryVM) getMViewModel()).getRecorderData().observe(getViewLifecycleOwner(), new TrackImportListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: enp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackImportListFragment.setListener$lambda$15(this.f16850a, (Pair) obj);
            }
        }));
        ((MyTrackLibraryVM) getMViewModel()).getParserState().observe(getViewLifecycleOwner(), new TrackImportListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fnp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackImportListFragment.setListener$lambda$16(this.f17966a, (StateData) obj);
            }
        }));
        ((MyTrackLibraryVM) getMViewModel()).getViewStates().observe(getViewLifecycleOwner(), new TrackImportListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gnp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackImportListFragment.setListener$lambda$17(this.f19166a, (StateData) obj);
            }
        }));
        ((MyTrackLibraryVM) getMViewModel()).getFailRoutes().observe(getViewLifecycleOwner(), new TrackImportListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hnp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TrackImportListFragment.setListener$lambda$22(this.f20268a, (FailRoutes) obj);
            }
        }));
        ((m2g) getMBinding()).D.setLoadListener(new AnonymousClass7());
    }

    public final void setRouteList(@NotNull List<Route> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.routeList = list;
    }

    public final void setSelectView(@Nullable View view) {
        this.selectView = view;
    }

    @Override // com.xiaomi.fitness.route.track.TrackListFragmentOperator
    public void setStartViewRefreshListener(@NotNull Function2<? super View, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.startViewRefreshListener = listener;
    }
}
