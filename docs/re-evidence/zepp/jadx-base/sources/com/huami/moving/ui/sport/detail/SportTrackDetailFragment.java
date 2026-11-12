package com.huami.moving.ui.sport.detail;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.maps.track.GPSSportTrackLoader;
import com.huami.moving.maps.track.OnChangeListenerImp;
import com.huami.moving.ui.event.EventHeatMapRadioButton;
import com.huami.moving.ui.offcut.SportPromotionPosition;
import com.huami.moving.ui.sport.detail.SportTrackDetailFragment;
import com.huami.moving.ui.utils.BitmapUtils;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.moving.ui.utils.TriathlonChildSportUtil;
import com.huami.moving.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0003z{3B\u0007¢\u0006\u0004\bx\u0010yJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J&\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\u0006\u0010(\u001a\u00020\u0005J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u001fH\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0015H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0012\u0010.\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0006\u00100\u001a\u00020/J\b\u00101\u001a\u0004\u0018\u00010/R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R(\u0010<\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010I\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010ER\u0018\u0010K\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010>R\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010MR\u0016\u0010T\u001a\u00020R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0016\u0010[\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010WR\u0016\u0010\\\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010WR\u0016\u0010^\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010WR\u0016\u0010`\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010WR\u0016\u0010b\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010WR\u001d\u0010f\u001a\u00020c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010d\u001a\u0004\bJ\u0010eR\u0016\u0010g\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010WR\u0016\u0010h\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0018\u0010k\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010jR\u0016\u0010o\u001a\u00020l8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006|"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/moving/maps/track/GPSSportTrackLoader$TrackLoadCallback;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", z.j, "", "getLayout", "l", "u", GoogleApiAvailabilityLight.b, com.google.android.exoplayer2.text.ttml.b.r, "w", "i", "type", "t", "v", "", "value", "g", "Landroid/content/Context;", "getAttechActivity", "whenMapLoaded", "path", "whenContourTrackCreated", "whenTrackDataLoaded", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/huami/moving/ui/event/EventHeatMapRadioButton;", "event", "onEventMainThread", "onPause", "onResume", "onDestroy", "destroyMap", "outState", "onSaveInstanceState", DbUtils.Const.Table.CONTEXT, "onAttach", "onDetach", "onActivityCreated", "Landroid/graphics/Bitmap;", "getMapFlagBitmap", "getMarkedFlagBitmap", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "attachActivity", "Lcom/huami/moving/maps/track/GPSSportTrackLoader;", "<set-?>", "b", "Lcom/huami/moving/maps/track/GPSSportTrackLoader;", "getTrackLoader", "()Lcom/huami/moving/maps/track/GPSSportTrackLoader;", "trackLoader", "c", "Landroid/view/View;", SportAnalytics.ParamValue.MapButtonType.MAP, "", GoogleApiAvailabilityLight.a, "J", "trackId", "e", LogUtil.I, "deviceSource", "f", "sportType", "realSportType", "h", "mRunningInfoContainer", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "mapFlag", "markedFlag", hl.k, "satellite", "Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment$a;", "Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment$a;", "mHandler", "", "m", "Z", "mIsMarked", "mIsMask", "o", "mIsSatellite", "mIsMetric", DTransferConstants.SEARCH_KEY, "useAmap", "r", "fromRunning", SOAP.XMLNS, "isOverSea", "Lcom/huami/moving/ui/offcut/SportPromotionPosition;", "Lkotlin/Lazy;", "()Lcom/huami/moving/ui/offcut/SportPromotionPosition;", "sportPromotion", "mSupportHeatMap", "mHalfStartTime", "Landroid/widget/RadioGroup;", "Landroid/widget/RadioGroup;", "mMileStoneGroup", "", "x", "[I", "sportTypes", "Lcom/huami/widget/typeface/TypefaceTextView;", "y", "Lcom/huami/widget/typeface/TypefaceTextView;", "line_detail_tips", "Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment$TrackActionCallback;", "z", "Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment$TrackActionCallback;", "trackActionCallback", "<init>", "()V", "Companion", "TrackActionCallback", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportTrackDetailFragment extends Fragment implements GPSSportTrackLoader.TrackLoadCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Activity attachActivity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private GPSSportTrackLoader trackLoader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private View map;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long trackId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int deviceSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int sportType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int realSportType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private View mRunningInfoContainer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private ImageView mapFlag;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ImageView markedFlag;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private ImageView satellite;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final a mHandler = new a();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean mIsMarked;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean mIsMask;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean mIsSatellite;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean mIsMetric;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean useAmap;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean fromRunning;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isOverSea;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportPromotion;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean mSupportHeatMap;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int mHalfStartTime;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private RadioGroup mMileStoneGroup;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final int[] sportTypes;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private TypefaceTextView line_detail_tips;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private TrackActionCallback trackActionCallback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String A = "RunningTrackFragment";
    private static final int B = 1;
    private static final int C = 2;
    private static final int D = 3;

    @NotNull
    private static final String E = "args_from_running";

    @NotNull
    private static final String F = "args_over_sea";

    @NotNull
    private static final String G = "args_use_amap";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001c\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment$Companion;", "", "Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment;", "newInstance", "", "sportType", "", "isSupportHeatMap", "", "ARGS_FROM_RUNNING", "Ljava/lang/String;", "getARGS_FROM_RUNNING", "()Ljava/lang/String;", "ARGS_OVER_SEA", "getARGS_OVER_SEA", "ARGS_USE_AMAP", "getARGS_USE_AMAP", "CONTOUR_TRACK_LOADED", LogUtil.I, "START_PACE_DETAIL", "TAG", "TRACK_DATA_LOADED", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getARGS_FROM_RUNNING() {
            return SportTrackDetailFragment.E;
        }

        @NotNull
        public final String getARGS_OVER_SEA() {
            return SportTrackDetailFragment.F;
        }

        @NotNull
        public final String getARGS_USE_AMAP() {
            return SportTrackDetailFragment.G;
        }

        public final boolean isSupportHeatMap(int sportType) {
            return sportType == 18 || sportType == 82 || sportType == 90 || sportType == 121;
        }

        @NotNull
        public final SportTrackDetailFragment newInstance() {
            return new SportTrackDetailFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportTrackDetailFragment$TrackActionCallback;", "", "", "onTrackDataLoaded", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface TrackActionCallback {
        void onTrackDataLoaded();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/huami/moving/ui/sport/detail/SportTrackDetailFragment$a", "Landroid/os/Handler;", "Landroid/os/Message;", "message", "", "handleMessage", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            int i = message.what;
            if (i != SportTrackDetailFragment.B) {
                if (i == SportTrackDetailFragment.C) {
                    return;
                }
                int unused = SportTrackDetailFragment.D;
            } else {
                Object obj = message.obj;
                if (obj != null) {
                    boolean z = obj instanceof String;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            View view = SportTrackDetailFragment.this.map;
            Objects.requireNonNull(view);
            int height = view.getHeight();
            View view2 = SportTrackDetailFragment.this.map;
            Objects.requireNonNull(view2);
            return "whenMapLoaded - height: " + height + ", width: " + view2.getWidth();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportTrackDetailFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sportPromotion = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SportPromotionPosition>() { // from class: com.huami.moving.ui.sport.detail.SportTrackDetailFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.moving.ui.offcut.SportPromotionPosition, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SportPromotionPosition invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(SportPromotionPosition.class), qualifier, objArr);
            }
        });
        this.mHalfStartTime = -1;
        this.sportTypes = new int[]{100, 101, 102};
    }

    private final void g(String value) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", String.valueOf(this.trackId));
        linkedHashMap.put("pos", value);
        linkedHashMap.put("sportstype", String.valueOf(this.sportType));
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.SPORT_DETAIL_MAP_C).putExtras(linkedHashMap).setAnonymous(!Utils.isChinaUser()));
    }

    private final int getLayout() {
        return !this.useAmap ? R.layout.fragment_sport_detail_map_google : R.layout.fragment_sport_detail_map_gaode;
    }

    private final SportPromotionPosition h() {
        return (SportPromotionPosition) this.sportPromotion.getValue();
    }

    private final void i() {
        if (INSTANCE.isSupportHeatMap(this.sportType)) {
            ImageView imageView = this.mapFlag;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.markedFlag;
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(4);
        }
    }

    private final void j(View view) {
        View viewFindViewById;
        if (view == null || (viewFindViewById = view.findViewById(R.id.loactionFlag)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: rd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportTrackDetailFragment.k(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SportTrackDetailFragment sportTrackDetailFragment, View view) {
        GPSSportTrackLoader trackLoader = sportTrackDetailFragment.getTrackLoader();
        if (trackLoader != null) {
            trackLoader.resetLoaction();
        }
        sportTrackDetailFragment.g("position");
    }

    private final void l(View view) {
        View viewFindViewById = view.findViewById(R.id.mapFlag);
        Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        this.mapFlag = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: sd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportTrackDetailFragment.m(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SportTrackDetailFragment sportTrackDetailFragment, View view) {
        GPSSportTrackLoader trackLoader = sportTrackDetailFragment.getTrackLoader();
        if (trackLoader == null) {
            return;
        }
        sportTrackDetailFragment.mIsMask = !sportTrackDetailFragment.mIsMask;
        sportTrackDetailFragment.u();
        trackLoader.addMaskOverlay(sportTrackDetailFragment.mIsMask);
    }

    private final void n(View view) {
        View viewFindViewById = view.findViewById(R.id.markedFlag);
        Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        this.markedFlag = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: qd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportTrackDetailFragment.o(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SportTrackDetailFragment sportTrackDetailFragment, View view) {
        sportTrackDetailFragment.mIsMarked = !sportTrackDetailFragment.mIsMarked;
        sportTrackDetailFragment.v();
        GPSSportTrackLoader trackLoader = sportTrackDetailFragment.getTrackLoader();
        if (trackLoader == null) {
            return;
        }
        trackLoader.setMarked(sportTrackDetailFragment.mIsMarked);
    }

    private final void p(View view) {
        View viewFindViewById = view.findViewById(R.id.satelliteFlag);
        Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.satellite = (ImageView) viewFindViewById;
        this.mIsSatellite = SportUIKeeper.getMapSatelliteTypeEnable(getContext()).booleanValue();
        w();
        ImageView imageView = this.satellite;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: pd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportTrackDetailFragment.q(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SportTrackDetailFragment sportTrackDetailFragment, View view) {
        GPSSportTrackLoader trackLoader = sportTrackDetailFragment.getTrackLoader();
        if (trackLoader == null) {
            return;
        }
        sportTrackDetailFragment.mIsSatellite = !sportTrackDetailFragment.mIsSatellite;
        SportUIKeeper.setMapSatelliteTypeEnable(sportTrackDetailFragment.getContext(), sportTrackDetailFragment.mIsSatellite);
        sportTrackDetailFragment.w();
        trackLoader.setMapViewMode(sportTrackDetailFragment.mIsSatellite ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final SportTrackDetailFragment sportTrackDetailFragment) {
        int i = sportTrackDetailFragment.sportType;
        if (i == 2001 || i == 2002) {
            View view = sportTrackDetailFragment.map;
            Objects.requireNonNull(view);
            view.post(new Runnable() { // from class: td7
                @Override // java.lang.Runnable
                public final void run() {
                    SportTrackDetailFragment.s(this.a);
                }
            });
        } else {
            if (sportTrackDetailFragment.getTrackLoader().isShutdown()) {
                return;
            }
            GPSSportTrackLoader trackLoader = sportTrackDetailFragment.getTrackLoader();
            long j = sportTrackDetailFragment.trackId;
            int i2 = sportTrackDetailFragment.deviceSource;
            int i3 = sportTrackDetailFragment.realSportType;
            View view2 = sportTrackDetailFragment.map;
            Objects.requireNonNull(view2);
            int width = view2.getWidth();
            View view3 = sportTrackDetailFragment.map;
            Objects.requireNonNull(view3);
            trackLoader.startSingleTrackInMap(j, i2, i3, width, view3.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SportTrackDetailFragment sportTrackDetailFragment) {
        long[][] jArrAnaChildSport = TriathlonChildSportUtil.anaChildSport(TrackRecordManager.getInstance().getTrackRecordById(sportTrackDetailFragment.trackId, sportTrackDetailFragment.deviceSource).getChildListData());
        GPSSportTrackLoader trackLoader = sportTrackDetailFragment.getTrackLoader();
        long j = sportTrackDetailFragment.trackId;
        int i = sportTrackDetailFragment.deviceSource;
        int i2 = sportTrackDetailFragment.sportType;
        View view = sportTrackDetailFragment.map;
        Objects.requireNonNull(view);
        int width = view.getWidth();
        View view2 = sportTrackDetailFragment.map;
        Objects.requireNonNull(view2);
        trackLoader.startComplexTrackInMap(j, i, i2, width, view2.getHeight(), jArrAnaChildSport);
    }

    private final void t(int type) {
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader != null) {
            gPSSportTrackLoader.setHeatmapType(type);
        }
        SportUIKeeper.putMapMileStoneFlag(type, getContext());
    }

    private final void u() {
        ImageView imageView = this.mapFlag;
        if (imageView != null) {
            imageView.setImageResource(this.mIsMask ? R.drawable.ic_hide_20_s5 : R.drawable.ic_appear_20_s5);
        }
        g("background");
    }

    private final void v() {
        if (this.mIsMetric) {
            ImageView imageView = this.markedFlag;
            if (imageView != null) {
                imageView.setImageResource(this.mIsMarked ? R.drawable.ic_km_display_20_s5 : R.drawable.ic_km_hide_20_s5);
            }
        } else {
            ImageView imageView2 = this.markedFlag;
            if (imageView2 != null) {
                imageView2.setImageResource(this.mIsMarked ? R.drawable.ic_mi_display_20_s5 : R.drawable.ic_mi_hide_20_s5);
            }
        }
        g(SportAnalytics.ParamValue.MapButtonType.KM);
    }

    private final void w() {
        ImageView imageView = this.satellite;
        if (imageView != null) {
            imageView.setImageResource(this.mIsSatellite ? R.drawable.ic_satellite_display_20_s5 : R.drawable.ic_satellite_hide_20_s5);
        }
        g(SportAnalytics.ParamValue.MapButtonType.MAP);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void destroyMap() {
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader == null) {
            return;
        }
        gPSSportTrackLoader.unregisterListener();
        gPSSportTrackLoader.destroyMap();
        gPSSportTrackLoader.destroy();
    }

    @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackLoadCallback
    @Nullable
    public Context getAttechActivity() {
        return this.attachActivity;
    }

    @NotNull
    public final Bitmap getMapFlagBitmap() {
        return BitmapUtils.getViewBitmap(this.mapFlag);
    }

    @Nullable
    public final Bitmap getMarkedFlagBitmap() {
        ImageView imageView = this.markedFlag;
        Integer numValueOf = imageView == null ? null : Integer.valueOf(imageView.getVisibility());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return BitmapUtils.getViewBitmap(this.markedFlag);
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return BitmapUtils.getUnViewBitmap(this.markedFlag);
        }
        return null;
    }

    @Nullable
    public final GPSSportTrackLoader getTrackLoader() {
        return this.trackLoader;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.attachActivity = getActivity();
        this.mIsMetric = RunnerData.getRunner().isMetric();
        u();
        v();
        GPSSportTrackLoader gPSSportTrackLoader = new GPSSportTrackLoader(this, Build.VERSION.SDK_INT < 21 ? getFragmentManager() : getChildFragmentManager(), savedInstanceState, this.useAmap);
        this.trackLoader = gPSSportTrackLoader;
        gPSSportTrackLoader.setIsMarked(this.mIsMarked);
        View view = this.map;
        Objects.requireNonNull(view);
        view.post(new Runnable() { // from class: ud7
            @Override // java.lang.Runnable
            public final void run() {
                SportTrackDetailFragment.r(this.a);
            }
        });
        GPSSportTrackLoader gPSSportTrackLoader2 = this.trackLoader;
        if (gPSSportTrackLoader2 == null) {
            return;
        }
        gPSSportTrackLoader2.setOnChangeListener(new OnChangeListenerImp(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        this.trackActionCallback = componentRequireActivity instanceof TrackActionCallback ? (TrackActionCallback) componentRequireActivity : null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.trackId = arguments.getLong("trackId", 0L);
            this.deviceSource = arguments.getInt("deviceSource");
            this.sportType = arguments.getInt("sportType");
            this.useAmap = arguments.getBoolean(G);
            this.fromRunning = arguments.getBoolean(E);
            this.isOverSea = arguments.getBoolean(F);
        }
        int i = this.sportType;
        this.realSportType = i;
        if (SportTypeIdentifier.isSubSport(i)) {
            this.sportType -= 1000;
        }
        View viewInflate = inflater.inflate(getLayout(), container, false);
        l(viewInflate);
        n(viewInflate);
        p(viewInflate);
        i();
        j(viewInflate);
        this.map = viewInflate.findViewById(R.id.map);
        TypefaceTextView typefaceTextView = (TypefaceTextView) viewInflate.findViewById(R.id.line_map_tip);
        this.line_detail_tips = typefaceTextView;
        if (typefaceTextView != null) {
            typefaceTextView.setText(getString(R.string.td_sport_detail_tips));
        }
        if (this.realSportType == 26) {
            TypefaceTextView typefaceTextView2 = this.line_detail_tips;
            if (typefaceTextView2 != null) {
                typefaceTextView2.setVisibility(0);
            }
        } else {
            TypefaceTextView typefaceTextView3 = this.line_detail_tips;
            if (typefaceTextView3 != null) {
                typefaceTextView3.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_logo);
        if (!Utils.isMidong()) {
            imageView.setImageResource(R.drawable.water_mark_life);
        }
        EventBus.getDefault().register(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        destroyMap();
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.trackActionCallback = null;
    }

    public final void onEventMainThread(@NotNull EventHeatMapRadioButton event) {
        Integer type = event.getType();
        if (type == null) {
            return;
        }
        t(type.intValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader == null) {
            return;
        }
        gPSSportTrackLoader.pauseMap();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader == null) {
            return;
        }
        gPSSportTrackLoader.resumeMap();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        GPSSportTrackLoader gPSSportTrackLoader = this.trackLoader;
        if (gPSSportTrackLoader == null) {
            return;
        }
        gPSSportTrackLoader.saveInstanceStateMap(outState);
    }

    @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackLoadCallback
    public void whenContourTrackCreated(@NotNull String path) {
        Message messageObtainMessage = this.mHandler.obtainMessage(B);
        messageObtainMessage.obj = path;
        this.mHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackLoadCallback
    public void whenMapLoaded() {
        GPSSportTrackLoader gPSSportTrackLoader;
        if (this.fromRunning && !this.isOverSea && (gPSSportTrackLoader = this.trackLoader) != null) {
            h().updateSportTrackDetailEndMarker(getContext(), gPSSportTrackLoader.getGPSSolution());
        }
        GPSSportTrackLoader gPSSportTrackLoader2 = this.trackLoader;
        if (gPSSportTrackLoader2 != null) {
            HMLog.info(A, new b());
            View view = this.map;
            Objects.requireNonNull(view);
            gPSSportTrackLoader2.setMapHeight(view.getHeight());
            View view2 = this.map;
            Objects.requireNonNull(view2);
            gPSSportTrackLoader2.setMapWidth(view2.getWidth());
        }
        GPSSportTrackLoader gPSSportTrackLoader3 = this.trackLoader;
        if (gPSSportTrackLoader3 == null) {
            return;
        }
        gPSSportTrackLoader3.setMapViewMode(this.mIsSatellite ? 2 : 1);
    }

    @Override // com.huami.moving.maps.track.GPSSportTrackLoader.TrackLoadCallback
    public void whenTrackDataLoaded() {
        TrackActionCallback trackActionCallback = this.trackActionCallback;
        if (trackActionCallback != null) {
            trackActionCallback.onTrackDataLoaded();
        }
        this.mHandler.sendEmptyMessage(C);
    }
}
