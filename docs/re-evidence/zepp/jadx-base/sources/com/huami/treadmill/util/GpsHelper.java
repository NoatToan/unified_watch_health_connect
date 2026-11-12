package com.huami.treadmill.util;

import android.graphics.Path;
import android.location.Location;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.ConstantKt;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.KilometreOrMileMarked;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.treadmill.data.BoltRunnerData;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.TdLineDetailRun;
import com.huami.treadmill.data.TdLineRuningRankItem;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b3\u0018\u0000 x2\u00020\u0001:\u0005xyz{|B\u0007¢\u0006\u0004\bv\u0010wJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J4\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J:\u0010%\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0002H\u0002J:\u0010,\u001a\u0004\u0018\u00010\u001d2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0002J(\u00101\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0002J\u0010\u00102\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0018H\u0002J8\u00109\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J\u000e\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020:J6\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010\u000e2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002JP\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u000e2\u0006\u00104\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010GJ\u001c\u0010M\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020J0IJ\u0016\u0010N\u001a\u00020\u00022\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010IJ&\u0010O\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018J\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010IR\u0016\u0010R\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010QR\u0016\u0010T\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010SR\u0016\u0010U\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010SR\u0016\u0010V\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010SR\u0016\u0010X\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u0016\u0010Y\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010SR\u0016\u0010Z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010SR\u0016\u0010[\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010WR\u0016\u0010\\\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010WR\u0016\u0010]\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010WR\u0016\u0010^\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010SR\u001c\u0010b\u001a\u00020\u00188\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010e\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b2\u0010S\u001a\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bf\u0010SR\u001c\u0010k\u001a\u00020\u00118\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bh\u0010W\u001a\u0004\bi\u0010jR\u001c\u0010n\u001a\u00020\u00188\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bl\u0010_\u001a\u0004\bm\u0010aR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00110I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010SR\u0016\u0010u\u001a\u00020\u00188\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bt\u0010_¨\u0006}"}, d2 = {"Lcom/huami/treadmill/util/GpsHelper;", "", "", ConstantKt.SAMPLE_WEBVIEW_NAME, "index", "flag", "", "l", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "lastPoint", "nowPoint", hl.k, "", "str", "", "Lcom/huami/treadmill/util/GpsHelper$PointLocation;", GoogleApiAvailabilityLight.a, "", "c", "a", "b", "", "trackId", "e", "", "maxLat", "minLat", "maxLon", "minLon", "", Constants.RATIO, "", z.j, GPXBasePoint.XML.ATTR_LAT, GPXBasePoint.XML.ATTR_LON, "factor", "margin", "i", "minlat", "minlon", "maxlat", "maxlon", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "h", "lat1", "lon1", "lat2", "lon2", "f", "m", "startPoint", "distance", "longitudeDelta", "latitudeDelta", "isLongitudeReverse", "isLatitudeReverse", "g", "Lcom/huami/treadmill/data/TdLineDetailRun;", "detail", "Lcom/huami/treadmill/util/GpsHelper$LoadData;", "getDetailRunLoadData", "list", "Lcom/huami/treadmill/util/GpsHelper$PointInfo;", "convertToCoordinateList", "Lcom/huami/treadmill/data/TdLineDetail;", "others", "lineDistance", "time", "speed", TdmillHmFragment.ARG_IS_METRIC, "Lcom/huami/treadmill/data/BoltRunnerData;", "runnerData", "", "Lcom/huami/treadmill/data/TdLineRuningRankItem;", "getRankList", "rankList", "getFilterRankList", "getRankMePos", "getDistance", "getSmoothTrack", "Lcom/huami/treadmill/util/GpsHelper$LoadData;", "data", LogUtil.I, "SAMPLE_VALUE", "mMaxSpeedIndex", "mMinSpeedIndex", "F", "mMaxPace", "mMaxPaceIndex", "mMinPaceIndex", "mMaxSpeed", "mMinSpeed", "mMinPace", "MAX_VALID_DATA", LogUtil.D, "getMASK_LAT_LON", "()D", "MASK_LAT_LON", "getRUNNING_VERSION_13", "()I", "RUNNING_VERSION_13", GoogleApiAvailabilityLight.b, "MAX_HEART", "o", "getMAX_VALID_PACE", "()F", "MAX_VALID_PACE", b.r, "getKM_PER_MILE", "KM_PER_MILE", DTransferConstants.SEARCH_KEY, "Ljava/util/List;", "speedList", "r", "mMaxAltiIndex", SOAP.XMLNS, "EARTH_RADIUS", "<init>", "()V", "Companion", "LoadData", "PathInfo", "PointInfo", "PointLocation", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class GpsHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static GpsHelper t;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mMaxSpeedIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mMinSpeedIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float mMaxPace;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mMaxPaceIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mMinPaceIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float mMaxSpeed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float mMinSpeed;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float mMinPace;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int mMaxAltiIndex;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LoadData data = new LoadData();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int SAMPLE_VALUE = 1000;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int MAX_VALID_DATA = 1000000;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final double MASK_LAT_LON = 181.0d;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int RUNNING_VERSION_13 = 13;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int MAX_HEART = 220;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float MAX_VALID_PACE = 1.8f;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final double KM_PER_MILE = 1.609344d;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final List<Float> speedList = new ArrayList();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final double EARTH_RADIUS = 6378137.0d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/huami/treadmill/util/GpsHelper$Companion;", "", "Lcom/huami/treadmill/util/GpsHelper;", "getInstance", "singleton", "Lcom/huami/treadmill/util/GpsHelper;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GpsHelper getInstance() {
            if (GpsHelper.t == null) {
                synchronized (GpsHelper.class) {
                    if (GpsHelper.t == null) {
                        Companion companion = GpsHelper.INSTANCE;
                        GpsHelper.t = new GpsHelper();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return GpsHelper.t;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R0\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010)\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/huami/treadmill/util/GpsHelper$LoadData;", "", "", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "a", "Ljava/util/List;", "getTrack", "()Ljava/util/List;", "setTrack", "(Ljava/util/List;)V", "track", "b", "getMarked", "setMarked", "marked", "c", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "getSouthWest", "()Lcom/huami/mifit/sportlib/model/GPSPoint;", "setSouthWest", "(Lcom/huami/mifit/sportlib/model/GPSPoint;)V", "southWest", GoogleApiAvailabilityLight.a, "getNorthEast", "setNorthEast", "northEast", "Landroid/util/SparseArray;", "e", "Landroid/util/SparseArray;", "getComplexTracks", "()Landroid/util/SparseArray;", "setComplexTracks", "(Landroid/util/SparseArray;)V", "complexTracks", "f", "getComplexMarks", "setComplexMarks", "complexMarks", "", "g", "Z", "isComplex", "()Z", "setComplex", "(Z)V", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class LoadData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private List<GPSPoint> track;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private List<GPSPoint> marked;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private GPSPoint southWest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private GPSPoint northEast;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private SparseArray<List<GPSPoint>> complexTracks;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private SparseArray<List<GPSPoint>> complexMarks;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private boolean isComplex;

        @Nullable
        public final SparseArray<List<GPSPoint>> getComplexMarks() {
            return this.complexMarks;
        }

        @Nullable
        public final SparseArray<List<GPSPoint>> getComplexTracks() {
            return this.complexTracks;
        }

        @Nullable
        public final List<GPSPoint> getMarked() {
            return this.marked;
        }

        @Nullable
        public final GPSPoint getNorthEast() {
            return this.northEast;
        }

        @Nullable
        public final GPSPoint getSouthWest() {
            return this.southWest;
        }

        @Nullable
        public final List<GPSPoint> getTrack() {
            return this.track;
        }

        /* JADX INFO: renamed from: isComplex, reason: from getter */
        public final boolean getIsComplex() {
            return this.isComplex;
        }

        public final void setComplex(boolean z) {
            this.isComplex = z;
        }

        public final void setComplexMarks(@Nullable SparseArray<List<GPSPoint>> sparseArray) {
            this.complexMarks = sparseArray;
        }

        public final void setComplexTracks(@Nullable SparseArray<List<GPSPoint>> sparseArray) {
            this.complexTracks = sparseArray;
        }

        public final void setMarked(@Nullable List<GPSPoint> list) {
            this.marked = list;
        }

        public final void setNorthEast(@Nullable GPSPoint gPSPoint) {
            this.northEast = gPSPoint;
        }

        public final void setSouthWest(@Nullable GPSPoint gPSPoint) {
            this.southWest = gPSPoint;
        }

        public final void setTrack(@Nullable List<GPSPoint> list) {
            this.track = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\u000b\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0013\u0010!\u001a\u00020\u001e8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/huami/treadmill/util/GpsHelper$PathInfo;", "", "Lcom/huami/treadmill/util/GpsHelper$PointInfo;", "item", "", "a", "", "xy", "", "isMaxOne", "b", "destroy", LogUtil.I, "mMinX", "mMinY", "c", "mMaxX", GoogleApiAvailabilityLight.a, "mMaxY", "", "Landroid/graphics/Path;", "e", "Ljava/util/List;", "mPahtList", "", "f", "F", "DEFAULT_WIDTH", "g", "BOUND_WIDTH", "", "getOriginWH", "()[I", "originWH", "getPathInfo", "()Ljava/util/List;", "pathInfo", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class PathInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int mMinX;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int mMinY;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int mMaxX;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int mMaxY;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private List<Path> mPahtList;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final float DEFAULT_WIDTH;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int BOUND_WIDTH;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/huami/treadmill/util/GpsHelper$PathInfo$Companion;", "", "", "Lcom/huami/treadmill/util/GpsHelper$PointInfo;", "pointList", "", "index", "Lcom/huami/treadmill/util/GpsHelper$PathInfo;", "createPathInfo", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final PathInfo createPathInfo(@NotNull List<PointInfo> pointList, int index) {
                PointInfo pointInfo = null;
                PathInfo pathInfo = new PathInfo(0 == true ? 1 : 0);
                ArrayList arrayList = new ArrayList();
                Path path = null;
                int i = 0;
                for (PointInfo pointInfo2 : pointList) {
                    if (i == index) {
                        break;
                    }
                    i++;
                    if (pointInfo == null) {
                        path = new Path();
                        path.moveTo(pointInfo2.getX(), pointInfo2.getY());
                        arrayList.add(path);
                        pointInfo = pointInfo2;
                    } else {
                        path.lineTo(pointInfo2.getX(), pointInfo2.getY());
                    }
                }
                pathInfo.mPahtList = arrayList;
                return pathInfo;
            }
        }

        private PathInfo() {
            this.mMinX = Integer.MAX_VALUE;
            this.mMinY = Integer.MAX_VALUE;
            this.mMaxX = Integer.MIN_VALUE;
            this.mMaxY = Integer.MIN_VALUE;
        }

        public /* synthetic */ PathInfo(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(PointInfo item) {
            if (this.mMinX >= item.getX()) {
                this.mMinX = b(item.getX(), false);
            }
            if (this.mMinY >= item.getY()) {
                this.mMinY = b(item.getY(), false);
            }
            if (this.mMaxX <= item.getX()) {
                this.mMaxX = b(item.getX(), true);
            }
            if (this.mMaxY <= item.getY()) {
                this.mMaxY = b(item.getY(), true);
            }
        }

        private final int b(int xy, boolean isMaxOne) {
            return isMaxOne ? Math.max(0, (int) (xy + this.DEFAULT_WIDTH)) + this.BOUND_WIDTH : (int) (xy - (this.DEFAULT_WIDTH + this.BOUND_WIDTH));
        }

        public final void destroy() {
            List<Path> list = this.mPahtList;
            if (list != null) {
                list.clear();
            }
        }

        @NotNull
        public final int[] getOriginWH() {
            return new int[]{this.mMaxX - this.mMinX, this.mMaxY - this.mMinY};
        }

        @Nullable
        public final List<Path> getPathInfo() {
            return this.mPahtList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0019\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/huami/treadmill/util/GpsHelper$PointInfo;", "", "Lorg/json/JSONObject;", "createJsonData", "", "getFlag", "getX", "getY", "a", ExifInterface.LATITUDE_SOUTH, "getMX", "()S", "setMX", "(S)V", "mX", "b", "getMY", "setMY", "mY", "c", "getMFlag", "setMFlag", "mFlag", "x", "y", "flag", "<init>", "(SSS)V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class PointInfo {

        @NotNull
        public static final String KEY_FLAG = "t";

        @NotNull
        public static final String KEY_H = "h";

        @NotNull
        public static final String KEY_V = "v";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private short mX;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private short mY;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private short mFlag;

        public PointInfo(short s, short s2, short s3) {
            this.mX = s;
            this.mY = s2;
            this.mFlag = s3;
        }

        @NotNull
        public final JSONObject createJsonData() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("h", (int) this.mX);
                jSONObject.put("v", (int) this.mY);
                jSONObject.put("t", (int) this.mFlag);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* JADX INFO: renamed from: getFlag, reason: from getter */
        public final short getMFlag() {
            return this.mFlag;
        }

        public final short getMFlag() {
            return this.mFlag;
        }

        public final short getMX() {
            return this.mX;
        }

        public final short getMY() {
            return this.mY;
        }

        public final short getX() {
            return this.mX;
        }

        public final short getY() {
            return this.mY;
        }

        public final void setMFlag(short s) {
            this.mFlag = s;
        }

        public final void setMX(short s) {
            this.mX = s;
        }

        public final void setMY(short s) {
            this.mY = s;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/treadmill/util/GpsHelper$PointLocation;", "", "", "toString", "", "a", "F", "getPointLatitude", "()F", "setPointLatitude", "(F)V", "pointLatitude", "b", "getPointLongitude", "setPointLongitude", "pointLongitude", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class PointLocation {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private float pointLatitude;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private float pointLongitude;

        public final float getPointLatitude() {
            return this.pointLatitude;
        }

        public final float getPointLongitude() {
            return this.pointLongitude;
        }

        public final void setPointLatitude(float f) {
            this.pointLatitude = f;
        }

        public final void setPointLongitude(float f) {
            this.pointLongitude = f;
        }

        @NotNull
        public String toString() {
            return "point latitude " + this.pointLatitude + " point longitude " + this.pointLongitude;
        }
    }

    private final List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                int length = str.length() - 1;
                int i = 0;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                Object[] array = StringsKt__StringsKt.split$default((CharSequence) str.subSequence(i2, length + 1).toString(), new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                int length2 = strArr.length - 1;
                if (length2 >= 0) {
                    int i3 = Integer.MIN_VALUE;
                    int i4 = Integer.MAX_VALUE;
                    while (true) {
                        int i5 = i + 1;
                        int i6 = (int) Float.parseFloat(strArr[i]);
                        arrayList.add(Integer.valueOf(i6));
                        if (RunUtils.isAltiValid(i6)) {
                            if (i6 > i3) {
                                this.mMaxAltiIndex = i;
                                i3 = i6;
                            }
                            if (i6 < i4) {
                                i4 = i6;
                            }
                        }
                        if (i5 > length2) {
                            break;
                        }
                        i = i5;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private final List<Integer> b(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                int length = str.length() - 1;
                int i = 0;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                Object[] array = StringsKt__StringsKt.split$default((CharSequence) str.subSequence(i2, length + 1).toString(), new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                int length2 = strArr.length;
                while (i < length2) {
                    String str2 = strArr[i];
                    i++;
                    arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private final List<Float> c(String str) {
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                int length = str.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                Object[] array = StringsKt__StringsKt.split$default((CharSequence) str.subSequence(i, length + 1).toString(), new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                int length2 = strArr.length - 1;
                float f3 = Float.MAX_VALUE;
                float f4 = Float.MIN_VALUE;
                float f5 = Float.MAX_VALUE;
                if (length2 >= 0) {
                    int i2 = 0;
                    float f6 = Float.MIN_VALUE;
                    f = Float.MIN_VALUE;
                    while (true) {
                        int i3 = i2 + 1;
                        float f7 = Float.parseFloat(strArr[i2]);
                        if (RunUtils.isPaceValid(f7)) {
                            f2 = (float) (3.6d / ((double) f7));
                            if (f2 > f6) {
                                this.mMaxSpeedIndex = i2;
                                f6 = f2;
                            }
                            if (f2 < f3) {
                                this.mMinSpeedIndex = i2;
                                f3 = f2;
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        this.speedList.add(Float.valueOf(f2));
                        float f8 = this.MAX_VALID_PACE;
                        if (f7 > f8) {
                            f7 = f8;
                        }
                        if (f7 > f && RunUtils.isPaceValid(f7)) {
                            this.mMaxPaceIndex = i2;
                            f = f7;
                        }
                        if (f7 < f5 && RunUtils.isPaceValid(f7)) {
                            this.mMinPaceIndex = i2;
                            f5 = f7;
                        }
                        arrayList.add(Float.valueOf(f7));
                        if (i3 > length2) {
                            break;
                        }
                        i2 = i3;
                    }
                    f4 = f6;
                } else {
                    f = Float.MIN_VALUE;
                }
                if (f4 >= 0.0f) {
                    this.mMaxSpeed = f4;
                }
                int i4 = this.MAX_VALID_DATA;
                if (f3 < i4) {
                    this.mMinSpeed = f3;
                }
                if (f >= 0.0f) {
                    this.mMaxPace = f;
                }
                if (f5 < i4) {
                    this.mMinPace = f5;
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private final List<PointLocation> d(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                int length = str.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                Object[] array = StringsKt__StringsKt.split$default((CharSequence) str.subSequence(i, length + 1).toString(), new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                int length2 = strArr.length;
                long j = 0;
                long j2 = 0;
                int i2 = 0;
                while (i2 < length2) {
                    String str2 = strArr[i2];
                    i2++;
                    Object[] array2 = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length == 0 || TextUtils.isEmpty(strArr2[0]) || TextUtils.isEmpty(strArr2[1])) {
                        PointLocation pointLocation = new PointLocation();
                        pointLocation.setPointLatitude(181.0f);
                        pointLocation.setPointLongitude(181.0f);
                        arrayList.add(pointLocation);
                    } else {
                        j += Long.parseLong(strArr2[0]);
                        j2 += Long.parseLong(strArr2[1]);
                        PointLocation pointLocation2 = new PointLocation();
                        pointLocation2.setPointLatitude(RunUtils.scaleFloat(j / 1.0E8f, 8));
                        pointLocation2.setPointLongitude(RunUtils.scaleFloat(j2 / 1.0E8f, 8));
                        arrayList.add(pointLocation2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private final List<Long> e(long trackId, String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                int length = str.length() - 1;
                int i = 0;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                Object[] array = StringsKt__StringsKt.split$default((CharSequence) str.subSequence(i2, length + 1).toString(), new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                int length2 = strArr.length;
                while (i < length2) {
                    String str2 = strArr[i];
                    i++;
                    trackId += (long) Integer.parseInt(str2);
                    arrayList.add(Long.valueOf(trackId));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private final float f(double lat1, double lon1, double lat2, double lon2) {
        float[] fArr = new float[1];
        Location.distanceBetween(lat1, lon1, lat2, lon2, fArr);
        return fArr[0];
    }

    private final GPSPoint g(GPSPoint startPoint, float distance, double longitudeDelta, double latitudeDelta, boolean isLongitudeReverse, boolean isLatitudeReverse) {
        GPSPoint gPSPointM3384clone = startPoint.m3384clone();
        double d = startPoint.mLatitude;
        double d2 = startPoint.mLongitude;
        if (isLongitudeReverse) {
            gPSPointM3384clone.mLongitude = d2 - (((double) distance) * longitudeDelta);
        } else {
            gPSPointM3384clone.mLongitude = d2 + (((double) distance) * longitudeDelta);
        }
        if (isLatitudeReverse) {
            gPSPointM3384clone.mLatitude = d - (((double) distance) * latitudeDelta);
        } else {
            gPSPointM3384clone.mLatitude = d + (((double) distance) * latitudeDelta);
        }
        return gPSPointM3384clone;
    }

    private final int[] h(double minlat, double minlon, double maxlat, double maxlon, int width, int height) {
        double dF = f(maxlat, maxlon, minlat, maxlon);
        double dF2 = f(minlat, minlon, minlat, maxlon);
        if (dF2 <= 5.0d) {
            return new int[]{1, width};
        }
        if (dF <= 5.0d) {
            return new int[]{width, 1};
        }
        return dF / dF2 < 1.0d ? new int[]{width, (int) ((dF * ((double) width)) / dF2)} : new int[]{(int) ((dF2 * ((double) height)) / dF), height};
    }

    private final int[] i(double lat, double lon, double minLon, double maxLat, double[] factor, int margin) {
        if (!(factor[0] > 0.0d && factor[1] > 0.0d)) {
            throw new IllegalArgumentException("getRealXY invalid factor".toString());
        }
        double d = 3600;
        return new int[]{((int) (((lon - minLon) * d) / factor[0])) + margin, ((int) (((maxLat - lat) * d) / factor[1])) + margin};
    }

    private final double[] j(double maxLat, double minLat, double maxLon, double minLon, int[] ratio) {
        if (!(ratio[0] > 0 && ratio[1] > 0)) {
            throw new IllegalArgumentException("getXYScaleFactor invalid ratio".toString());
        }
        double d = maxLon - minLon;
        double d2 = 3600;
        return new double[]{(d * d2) / ((double) ratio[0]), ((maxLat - minLat) * d2) / ((double) ratio[1])};
    }

    private final boolean k(GPSPoint lastPoint, GPSPoint nowPoint) {
        if (lastPoint == null || nowPoint == null) {
            return false;
        }
        float[] fArr = new float[1];
        Location.distanceBetween(nowPoint.mLatitude, nowPoint.mLongitude, lastPoint.mLatitude, lastPoint.mLongitude, fArr);
        return (lastPoint.getAttr() == 1 || lastPoint.getAttr() == 4) && nowPoint.getAttr() == 1 && fArr[0] > 200.0f;
    }

    private final boolean l(int sample, int index, int flag) {
        return (sample == 0 || index % sample == 0 || flag != 1) ? false : true;
    }

    private final double m(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    @Nullable
    public final List<PointInfo> convertToCoordinateList(@Nullable List<? extends GPSPoint> list, int width, int height, int margin) {
        double d = 2.147483647E9d;
        double d2 = -2.147483648E9d;
        double d3 = 2.147483647E9d;
        double d4 = -2.147483648E9d;
        for (GPSPoint gPSPoint : list) {
            double d5 = gPSPoint.mLatitude;
            if (d5 >= d4) {
                d4 = d5;
            }
            if (d5 <= d) {
                d = d5;
            }
            double d6 = gPSPoint.mLongitude;
            if (d6 >= d2) {
                d2 = d6;
            }
            if (d6 <= d3) {
                d3 = d6;
            }
        }
        int i = margin * 2;
        double[] dArrJ = j(d4, d, d2, d3, h(d, d3, d4, d2, width - i, height - i));
        if (dArrJ.length != 2) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (GPSPoint gPSPoint2 : list) {
            int[] iArrI = i(gPSPoint2.mLatitude, gPSPoint2.mLongitude, d3, d4, dArrJ, margin);
            arrayList.add(new PointInfo((short) iArrI[0], (short) iArrI[1], (short) 0));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01f1 A[LOOP:1: B:23:0x00f6->B:69:0x01f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ed A[EDGE_INSN: B:76:0x01ed->B:68:0x01ed BREAK  A[LOOP:1: B:23:0x00f6->B:69:0x01f1], SYNTHETIC] */
    @NotNull
    public final LoadData getDetailRunLoadData(@NotNull TdLineDetailRun detail) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int lineDetailRunVersion = detail.getLineDetailRunVersion();
        ArrayList<KilometreOrMileMarked> arrayList3 = new ArrayList();
        BoltRunnerData runnerData = ProxyTreadmill.INSTANCE.getInstance().getRunnerData();
        boolean zBooleanValue = (runnerData == null ? null : Boolean.valueOf(runnerData.isMetric())).booleanValue();
        for (KilometreOrMileMarked kilometreOrMileMarked : arrayList3) {
            GPSPoint gPSPoint = new GPSPoint();
            gPSPoint.mLongitude = kilometreOrMileMarked.getMarkedLongt();
            gPSPoint.mLatitude = kilometreOrMileMarked.getMarkedLat();
            gPSPoint.setIndex(kilometreOrMileMarked.getDisIndex() - 1);
            gPSPoint.setProviderType(1);
            gPSPoint.setVersion(lineDetailRunVersion);
            arrayList2.add(gPSPoint);
        }
        List<PointLocation> listD = d(detail.getLineDetailRunLongitudeLatitude());
        List<Float> listC = c(detail.getLineDetailRunPace());
        List<Long> listE = e(Long.parseLong(detail.getLineDetailRunTrackId()), detail.getLineDetailRunTime());
        List<Integer> listA = a(detail.getLineDetailRunAltitude());
        List<Integer> listB = b(detail.getLineDetailRunFlag());
        Integer numValueOf = listD == null ? null : Integer.valueOf(listD.size());
        int iIntValue = numValueOf.intValue() / this.SAMPLE_VALUE;
        float f = this.mMaxPace;
        float f2 = this.mMinPace;
        if (RunUtils.isMaxMinPaceValid(f, f2)) {
            if (!zBooleanValue) {
                f *= 1.609344f;
                f2 *= 1.609344f;
            }
            float f3 = 1;
            ProxyTreadmill.INSTANCE.getInstance().mapSetSpeedScope(new float[]{f3 / f, f3 / f2});
        } else {
            ProxyTreadmill.INSTANCE.getInstance().mapSetSpeedScope(new float[]{0.0f, 0.0f});
        }
        float f4 = -90.0f;
        float f5 = 90.0f;
        float f6 = -180.0f;
        float f7 = 180.0f;
        int iIntValue2 = numValueOf.intValue();
        if (iIntValue2 > 0) {
            GPSPoint gPSPoint2 = null;
            int i = 0;
            float f8 = -180.0f;
            float f9 = 180.0f;
            while (true) {
                int i2 = iIntValue2;
                i++;
                PointLocation pointLocation = listD.get(i);
                float pointLatitude = pointLocation.getPointLatitude();
                float pointLongitude = pointLocation.getPointLongitude();
                List<PointLocation> list = listD;
                double dIntValue = i < listA.size() ? listA.get(i).intValue() : 0.0d;
                int iIntValue3 = i < listB.size() ? listB.get(i).intValue() : 1;
                List<Integer> list2 = listA;
                List<Integer> list3 = listB;
                double pointLatitude2 = pointLocation.getPointLatitude();
                float pointLongitude2 = pointLocation.getPointLongitude();
                arrayList = arrayList;
                float f10 = f4;
                GPSPoint gPSPoint3 = new GPSPoint(pointLatitude2, pointLongitude2, dIntValue);
                float fFloatValue = listC.size() > i ? listC.get(i).floatValue() : 0.0f;
                float f11 = fFloatValue > 0.0f ? 1 / fFloatValue : 0.0f;
                gPSPoint3.setTime(listE.size() == numValueOf.intValue() ? listE.get(i).longValue() : 0L);
                gPSPoint3.setIndex(i);
                gPSPoint3.setVersion(lineDetailRunVersion);
                gPSPoint3.setAttr(iIntValue3);
                gPSPoint3.setProviderType(1);
                gPSPoint3.setSpeed(f11);
                if (!gPSPoint3.isMaskPoint()) {
                    if (k(gPSPoint2, gPSPoint3)) {
                        gPSPoint3.setAttr(4);
                    } else {
                        if (l(iIntValue, i, iIntValue3)) {
                            gPSPoint2 = gPSPoint3;
                        }
                        if (i >= i2) {
                            break;
                        }
                        iIntValue2 = i2;
                        listD = list;
                        listA = list2;
                        listB = list3;
                    }
                    f4 = pointLatitude > f10 ? pointLatitude : f10;
                    if (pointLatitude < f5) {
                        f5 = pointLatitude;
                    }
                    if (pointLongitude > f8) {
                        f8 = pointLongitude;
                    }
                    if (pointLongitude < f9) {
                        f9 = pointLongitude;
                    }
                    arrayList.add(gPSPoint3);
                    i2 = i2;
                    gPSPoint2 = gPSPoint3;
                    f8 = f8;
                    if (i >= i2) {
                        break;
                        break;
                    }
                    iIntValue2 = i2;
                    listD = list;
                    listA = list2;
                    listB = list3;
                }
                arrayList = arrayList;
                f8 = f8;
                f4 = f10;
                if (i >= i2) {
                    break;
                    break;
                }
                iIntValue2 = i2;
                listD = list;
                listA = list2;
                listB = list3;
            }
            f6 = f8;
            f7 = f9;
        }
        if (arrayList.size() == 0) {
            f4 = -f4;
            f5 = -f5;
            f6 = -f6;
            f7 = -f7;
        }
        this.data.setSouthWest(new GPSPoint(f5, f7));
        this.data.setNorthEast(new GPSPoint(f4, f6));
        this.data.getSouthWest().setProviderType(1);
        this.data.getNorthEast().setProviderType(1);
        this.data.setTrack(arrayList);
        this.data.setMarked(arrayList2);
        return this.data;
    }

    public final double getDistance(double lat1, double lon1, double lat2, double lon2) {
        double dM = m(lat1);
        double dM2 = m(lat2);
        double dM3 = m(lon1) - m(lon2);
        double d = 2;
        return d * Math.asin(Math.sqrt(Math.pow(Math.sin((dM - dM2) / d), 2.0d) + (Math.cos(dM) * Math.cos(dM2) * Math.pow(Math.sin(dM3 / d), 2.0d)))) * this.EARTH_RADIUS;
    }

    @Nullable
    public final List<TdLineRuningRankItem> getFilterRankList(@NotNull List<TdLineRuningRankItem> rankList) {
        ArrayList arrayList = new ArrayList();
        if (rankList.size() <= 5) {
            return rankList;
        }
        Iterator<TdLineRuningRankItem> it2 = rankList.iterator();
        int i = 0;
        while (it2.hasNext() && !it2.next().getRankIsMe()) {
            i++;
        }
        if (i >= 5) {
            arrayList.addAll(rankList.subList(0, 4));
            arrayList.add(rankList.get(i));
        } else {
            arrayList.addAll(rankList.subList(0, 5));
        }
        return arrayList;
    }

    public final double getKM_PER_MILE() {
        return this.KM_PER_MILE;
    }

    public final double getMASK_LAT_LON() {
        return this.MASK_LAT_LON;
    }

    public final float getMAX_VALID_PACE() {
        return this.MAX_VALID_PACE;
    }

    public final int getRUNNING_VERSION_13() {
        return this.RUNNING_VERSION_13;
    }

    @Nullable
    public final List<TdLineRuningRankItem> getRankList(@Nullable List<TdLineDetail> others, int distance, int lineDistance, int time, float speed, boolean isMetric, @Nullable BoltRunnerData runnerData) {
        int i;
        float f;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i2 = 4;
        int i3 = 2;
        if (!(others == null || others.isEmpty())) {
            for (TdLineDetail tdLineDetail : others) {
                TdLineRuningRankItem tdLineRuningRankItem = new TdLineRuningRankItem(null, null, null, null, 0.0f, false, 63, null);
                tdLineRuningRankItem.setRankUserId(tdLineDetail.getLineDetailUserId());
                tdLineRuningRankItem.setRankAvatar(tdLineDetail.getLineDetailAvatar());
                tdLineRuningRankItem.setRankName(tdLineDetail.getLineDetailNickName());
                tdLineRuningRankItem.setRankIsMe(z);
                TdLineDetailRun lineDetailRun = tdLineDetail.getLineDetailRun();
                List<Float> listC = c(lineDetailRun == null ? null : lineDetailRun.getLineDetailRunPace());
                float fFloatValue = 0.0f;
                Iterator<Float> it2 = listC.iterator();
                while (it2.hasNext()) {
                    fFloatValue += it2.next().floatValue();
                }
                double d = 3600;
                double size = d / ((double) ((fFloatValue / listC.size()) * 1000));
                if (!Double.isNaN(size)) {
                    tdLineRuningRankItem.setRankSpeed(Float.valueOf(new BigDecimal(size).setScale(i3, i2).floatValue()));
                    double d2 = ((size * ((double) time)) * ((double) 1000)) / d;
                    double d3 = lineDistance;
                    if (d2 >= d3) {
                        d2 = d3;
                    }
                    if (!isMetric) {
                        d2 *= 0.6213712d;
                    }
                    tdLineRuningRankItem.setRankDistance((float) (d2 / ((double) 1000.0f)));
                }
                arrayList.add(tdLineRuningRankItem);
                z = false;
                i2 = 4;
                i3 = 2;
            }
        }
        TdLineRuningRankItem tdLineRuningRankItem2 = new TdLineRuningRankItem(null, null, null, null, 0.0f, false, 63, null);
        tdLineRuningRankItem2.setRankUserId(runnerData == null ? null : runnerData.getUid());
        tdLineRuningRankItem2.setRankAvatar(runnerData == null ? null : runnerData.getAvatarUrl());
        tdLineRuningRankItem2.setRankName(runnerData == null ? null : runnerData.getName());
        tdLineRuningRankItem2.setRankIsMe(true);
        if (isMetric) {
            i = distance;
            f = speed;
        } else {
            i = (int) (((double) distance) * 0.6213712d);
            f = 0.6213712f * speed;
        }
        tdLineRuningRankItem2.setRankDistance(i / 1000.0f);
        tdLineRuningRankItem2.setRankSpeed(Float.valueOf(new BigDecimal(((double) f) * 3.6d).setScale(2, 4).floatValue()));
        arrayList.add(tdLineRuningRankItem2);
        return arrayList;
    }

    public final int getRankMePos(@Nullable List<TdLineRuningRankItem> rankList) {
        Iterator<TdLineRuningRankItem> it2 = rankList.iterator();
        int i = 1;
        while (it2.hasNext() && !it2.next().getRankIsMe()) {
            i++;
        }
        return i;
    }

    @Nullable
    public final List<GPSPoint> getSmoothTrack() {
        int i;
        GpsHelper gpsHelper = this;
        ArrayList arrayList = new ArrayList();
        List<GPSPoint> track = gpsHelper.data.getTrack();
        int iIntValue = (track == null ? null : Integer.valueOf(track.size())).intValue() - 1;
        if (iIntValue > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                List<GPSPoint> track2 = gpsHelper.data.getTrack();
                GPSPoint gPSPoint = track2 == null ? null : track2.get(i2);
                List<GPSPoint> track3 = gpsHelper.data.getTrack();
                GPSPoint gPSPoint2 = track3 == null ? null : track3.get(i4);
                int i5 = i3;
                GPSPoint gPSPoint3 = gPSPoint2;
                GPSPoint gPSPoint4 = gPSPoint;
                double distance = getDistance(gPSPoint.mLatitude, gPSPoint.mLongitude, gPSPoint2.mLatitude, gPSPoint2.mLongitude);
                if (distance <= 0.0d) {
                    i3 = i5;
                } else {
                    double dAbs = Math.abs((gPSPoint3.mLongitude - gPSPoint4.mLongitude) / distance);
                    double dAbs2 = Math.abs((gPSPoint3.mLatitude - gPSPoint4.mLatitude) / distance);
                    GPSPoint gPSPointM3384clone = gPSPoint4.m3384clone();
                    gPSPointM3384clone.setIndex(i5);
                    arrayList.add(gPSPointM3384clone);
                    int i6 = i5 + 1;
                    int i7 = 1;
                    while (true) {
                        int i8 = i7;
                        double d = dAbs;
                        i = i6;
                        GPSPoint gPSPointG = g(gPSPoint4, i7 * 2.5f, dAbs, dAbs2, gPSPoint4.mLongitude >= gPSPoint3.mLongitude, gPSPoint4.mLatitude >= gPSPoint3.mLatitude);
                        gPSPointG.setIndex(i);
                        double d2 = gPSPoint4.mLongitude;
                        double d3 = gPSPoint3.mLongitude;
                        if (d2 >= d3) {
                            if (gPSPointG.mLongitude <= d3) {
                                break;
                            }
                            arrayList.add(gPSPointG);
                            i6 = i + 1;
                            i7 = i8 + 1;
                            dAbs = d;
                        } else {
                            if (gPSPointG.mLongitude > d3) {
                                break;
                            }
                            arrayList.add(gPSPointG);
                            i6 = i + 1;
                            i7 = i8 + 1;
                            dAbs = d;
                        }
                    }
                    i3 = i;
                }
                if (i4 >= iIntValue) {
                    break;
                }
                gpsHelper = this;
                i2 = i4;
            }
        }
        return arrayList;
    }
}
