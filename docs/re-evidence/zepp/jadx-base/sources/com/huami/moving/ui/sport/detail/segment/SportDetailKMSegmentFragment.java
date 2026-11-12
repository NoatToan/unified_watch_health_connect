package com.huami.moving.ui.sport.detail.segment;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.model.KilometreOrMileMarked;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.sport.detail.segment.SportDetailKMSegmentFragment;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.webapi.SportWebParams;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import defpackage.dz;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import kotlin.text.m;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001:\u0002JKB\u0007¢\u0006\u0004\bH\u0010IJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J&\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010+\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u00101R\u0016\u00103\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u00105R\u0016\u00108\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u0010(R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010(R\u0016\u0010E\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010(R\u0016\u0010G\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010(¨\u0006L"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailKMSegmentFragment;", "Landroidx/fragment/app/Fragment;", "", "initData", "Landroid/view/View;", "rootView", "initView", "", "trackId", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "trackData", "", TdmillHmFragment.ARG_IS_METRIC, "isFive", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailKMSegmentFragment$SpeedPaceResult;", GoogleApiAvailabilityLight.a, "b", "g", "", "marathon", "h", "", "baseDis", "", "Lcom/huami/mifit/sportlib/model/KilometreOrMileMarked;", "markedList", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "type", "showPace", "a", "J", LogUtil.I, "deviceSource", "c", "sportType", "Z", "e", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "myTrackData", "", LogUtil.D, "EXTRA_THRESHOLD", "PROGRESS_DELTA", "", "F", "MIN_RATIO", "i", "MAX_PACE_TIME", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", z.j, "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecord", hl.k, "Ljava/lang/String;", "jsonFullTime", "l", "jsonHalfTime", "m", "tagFullTime", GoogleApiAvailabilityLight.b, "tagHalfTime", "o", "showSwitchMinDis", "<init>", "()V", "RunningPace", "SpeedPaceResult", "moving_release"}, k = 1, mv = {1, 5, 1})
public class SportDetailKMSegmentFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long trackId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int deviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int sportType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ParsedSportDetailData myTrackData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Trackrecord trackRecord;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String jsonFullTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String jsonHalfTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int tagFullTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int tagHalfTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double EXTRA_THRESHOLD = 0.05d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int PROGRESS_DELTA = 500;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float MIN_RATIO = 0.07f;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int MAX_PACE_TIME = 1800;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int showSwitchMinDis = 5;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u0006%"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailKMSegmentFragment$RunningPace;", "", "", "toString", "a", "Ljava/lang/String;", "getKilometer", "()Ljava/lang/String;", "setKilometer", "(Ljava/lang/String;)V", "kilometer", "b", "getCostTime", "setCostTime", "costTime", "c", "getPace", "setPace", "pace", GoogleApiAvailabilityLight.a, "getSpeed", "setSpeed", "speed", "", "e", LogUtil.I, "getHr", "()I", "setHr", "(I)V", Constants.DATA_KEY_HR, "f", "getOriginalCostTime", "setOriginalCostTime", "originalCostTime", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RunningPace {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private String kilometer;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private String costTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private String pace;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        private String speed;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private int hr;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private int originalCostTime;

        @Nullable
        public final String getCostTime() {
            return this.costTime;
        }

        public final int getHr() {
            return this.hr;
        }

        @Nullable
        public final String getKilometer() {
            return this.kilometer;
        }

        public final int getOriginalCostTime() {
            return this.originalCostTime;
        }

        @Nullable
        public final String getPace() {
            return this.pace;
        }

        @Nullable
        public final String getSpeed() {
            return this.speed;
        }

        public final void setCostTime(@Nullable String str) {
            this.costTime = str;
        }

        public final void setHr(int i) {
            this.hr = i;
        }

        public final void setKilometer(@Nullable String str) {
            this.kilometer = str;
        }

        public final void setOriginalCostTime(int i) {
            this.originalCostTime = i;
        }

        public final void setPace(@Nullable String str) {
            this.pace = str;
        }

        public final void setSpeed(@Nullable String str) {
            this.speed = str;
        }

        @NotNull
        public String toString() {
            return "RunningPace [kilometer=" + this.kilometer + ", costTime=" + this.costTime + ", pace=" + this.pace + ", speed=" + this.speed + "]";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ6\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\t¨\u0006\""}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailKMSegmentFragment$SpeedPaceResult;", "", "", "Lcom/huami/moving/ui/sport/detail/segment/SportDetailKMSegmentFragment$RunningPace;", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "list", "stepSec", "minCostTime", "copy", "(Ljava/util/List;DLjava/lang/Integer;)Lcom/huami/moving/ui/sport/detail/segment/SportDetailKMSegmentFragment$SpeedPaceResult;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getList", "()Ljava/util/List;", "b", LogUtil.D, "getStepSec", "()D", "c", "Ljava/lang/Integer;", "getMinCostTime", "<init>", "(Ljava/util/List;DLjava/lang/Integer;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class SpeedPaceResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<RunningPace> list;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final double stepSec;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private final Integer minCostTime;

        public SpeedPaceResult(@NotNull List<RunningPace> list, double d, @Nullable Integer num) {
            this.list = list;
            this.stepSec = d;
            this.minCostTime = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SpeedPaceResult copy$default(SpeedPaceResult speedPaceResult, List list, double d, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                list = speedPaceResult.list;
            }
            if ((i & 2) != 0) {
                d = speedPaceResult.stepSec;
            }
            if ((i & 4) != 0) {
                num = speedPaceResult.minCostTime;
            }
            return speedPaceResult.copy(list, d, num);
        }

        @NotNull
        public final List<RunningPace> component1() {
            return this.list;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getStepSec() {
            return this.stepSec;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getMinCostTime() {
            return this.minCostTime;
        }

        @NotNull
        public final SpeedPaceResult copy(@NotNull List<RunningPace> list, double stepSec, @Nullable Integer minCostTime) {
            return new SpeedPaceResult(list, stepSec, minCostTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpeedPaceResult)) {
                return false;
            }
            SpeedPaceResult speedPaceResult = (SpeedPaceResult) other;
            return Intrinsics.areEqual(this.list, speedPaceResult.list) && Intrinsics.areEqual((Object) Double.valueOf(this.stepSec), (Object) Double.valueOf(speedPaceResult.stepSec)) && Intrinsics.areEqual(this.minCostTime, speedPaceResult.minCostTime);
        }

        @NotNull
        public final List<RunningPace> getList() {
            return this.list;
        }

        @Nullable
        public final Integer getMinCostTime() {
            return this.minCostTime;
        }

        public final double getStepSec() {
            return this.stepSec;
        }

        public int hashCode() {
            int iHashCode = ((this.list.hashCode() * 31) + dz.a(this.stepSec)) * 31;
            Integer num = this.minCostTime;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "SpeedPaceResult(list=" + this.list + ", stepSec=" + this.stepSec + ", minCostTime=" + this.minCostTime + ")";
        }
    }

    private final void b(View rootView) {
        String str;
        String str2;
        RadioGroup radioGroup = (RadioGroup) rootView.findViewById(R.id.segment_distance);
        boolean z = this.isMetric;
        List<KilometreOrMileMarked> mileMarkedList = null;
        if (z) {
            ParsedSportDetailData parsedSportDetailData = this.myTrackData;
            if (parsedSportDetailData != null) {
                mileMarkedList = parsedSportDetailData.getKmMarkedList();
            }
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            ParsedSportDetailData parsedSportDetailData2 = this.myTrackData;
            if (parsedSportDetailData2 != null) {
                mileMarkedList = parsedSportDetailData2.getMileMarkedList();
            }
        }
        int i = 0;
        int size = mileMarkedList == null || mileMarkedList.isEmpty() ? 0 : mileMarkedList.size();
        ParsedSportDetailData parsedSportDetailData3 = this.myTrackData;
        int totalDistance = parsedSportDetailData3 == null ? 0 : parsedSportDetailData3.getTotalDistance();
        int i2 = this.showSwitchMinDis;
        if (totalDistance < i2 * 1000 && size >= i2) {
            radioGroup.setVisibility(8);
            return;
        }
        int childCount = radioGroup.getChildCount();
        if (childCount > 0) {
            while (true) {
                int i3 = i + 1;
                if (i == 0) {
                    View childAt = radioGroup.getChildAt(i);
                    Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
                    ((RadioButton) childAt).setChecked(true);
                    View childAt2 = radioGroup.getChildAt(i);
                    Objects.requireNonNull(childAt2, "null cannot be cast to non-null type android.widget.RadioButton");
                    RadioButton radioButton = (RadioButton) childAt2;
                    boolean z2 = this.isMetric;
                    if (z2) {
                        str2 = "1" + requireContext().getString(R.string.segment_km_title);
                    } else {
                        if (z2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "1" + requireContext().getString(R.string.segment_mile_title);
                    }
                    radioButton.setText(str2);
                } else {
                    View childAt3 = radioGroup.getChildAt(i);
                    Objects.requireNonNull(childAt3, "null cannot be cast to non-null type android.widget.RadioButton");
                    RadioButton radioButton2 = (RadioButton) childAt3;
                    boolean z3 = this.isMetric;
                    if (z3) {
                        str = "5" + requireContext().getString(R.string.segment_km_title);
                    } else {
                        if (z3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "5" + requireContext().getString(R.string.segment_mile_title);
                    }
                    radioButton2.setText(str);
                }
                if (i3 < childCount) {
                    i = i3;
                }
            }
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: i87
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                SportDetailKMSegmentFragment.c(this.a, radioGroup2, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SportDetailKMSegmentFragment sportDetailKMSegmentFragment, RadioGroup radioGroup, int i) {
        if (i == R.id.one_distance) {
            View view = sportDetailKMSegmentFragment.getView();
            if (view == null) {
                return;
            }
            sportDetailKMSegmentFragment.g(false, view);
            return;
        }
        if (i == R.id.five_distance) {
            View view2 = sportDetailKMSegmentFragment.getView();
            if (view2 == null) {
                return;
            }
            sportDetailKMSegmentFragment.g(true, view2);
            return;
        }
        View view3 = sportDetailKMSegmentFragment.getView();
        if (view3 == null) {
            return;
        }
        sportDetailKMSegmentFragment.g(false, view3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0254  */
    /* JADX WARN: Code duplicated, block: B:103:0x0284  */
    /* JADX WARN: Code duplicated, block: B:104:0x0287  */
    /* JADX WARN: Code duplicated, block: B:106:0x028a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0293  */
    /* JADX WARN: Code duplicated, block: B:110:0x029e  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:122:0x02db  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:130:0x0302  */
    /* JADX WARN: Code duplicated, block: B:132:0x0308  */
    /* JADX WARN: Code duplicated, block: B:134:0x030e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0317  */
    /* JADX WARN: Code duplicated, block: B:139:0x0322 A[LOOP:1: B:139:0x0322->B:144:0x033b, LOOP_START, PHI: r2
      0x0322: PHI (r2v14 int) = (r2v13 int), (r2v19 int) binds: [B:138:0x0320, B:144:0x033b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x0338 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x033b A[LOOP:1: B:139:0x0322->B:144:0x033b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x034c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0335 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x033d A[EDGE_INSN: B:171:0x033d->B:145:0x033d BREAK  A[LOOP:1: B:139:0x0322->B:144:0x033b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01db  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0202  */
    /* JADX WARN: Code duplicated, block: B:86:0x020a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0221  */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:93:0x0239  */
    /* JADX WARN: Code duplicated, block: B:96:0x0247  */
    /* JADX WARN: Code duplicated, block: B:98:0x024f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0252 A[DONT_INVERT] */
    private final SpeedPaceResult d(long trackId, ParsedSportDetailData trackData, boolean isMetric, boolean isFive) {
        List<KilometreOrMileMarked> mileMarkedList;
        ArrayList arrayList;
        long j;
        long j2;
        double d;
        double d2;
        long costTime;
        SportDetailKMSegmentFragment sportDetailKMSegmentFragment;
        double d3;
        double totalDistance;
        int disIndex;
        double d4;
        int size;
        int i;
        double dDoubleValue;
        int i2;
        long j3;
        long j4;
        double avgPace;
        double dDoubleValue2;
        long j5;
        String kilometer;
        if (trackId == -1) {
            return new SpeedPaceResult(new ArrayList(0), 0.0d, 0);
        }
        ArrayList arrayList2 = new ArrayList();
        if (isMetric) {
            mileMarkedList = trackData.getKmMarkedList();
        } else {
            if (isMetric) {
                throw new NoWhenBranchMatchedException();
            }
            mileMarkedList = trackData.getMileMarkedList();
        }
        List<KilometreOrMileMarked> list = mileMarkedList;
        ArrayList arrayList3 = new ArrayList();
        int[] iArr = new int[list.size()];
        int i3 = 3600;
        try {
            Iterator<KilometreOrMileMarked> it2 = list.iterator();
            double d5 = 0.0d;
            d = 0.0d;
            d2 = 0.0d;
            costTime = 0;
            j2 = 0;
            int i4 = 0;
            while (it2.hasNext()) {
                try {
                    KilometreOrMileMarked next = it2.next();
                    RunningPace runningPace = new RunningPace();
                    runningPace.setKilometer(String.valueOf(next.getDisIndex()));
                    runningPace.setOriginalCostTime(next.getCostTime());
                    List<KilometreOrMileMarked> list2 = list;
                    double costTime2 = next.getCostTime();
                    d5 += costTime2;
                    ArrayList arrayList4 = arrayList2;
                    try {
                        runningPace.setPace(DataFormatter.formatTimeInSportFormForPace((long) costTime2));
                        double dDoubleValue3 = new BigDecimal(((double) i3) / costTime2).setScale(2, 4).doubleValue();
                        runningPace.setSpeed(NumberFormatter.formatDouble2String(dDoubleValue3, 2, new int[0]));
                        costTime += (long) next.getCostTime();
                        runningPace.setCostTime(DataFormatter.getConsumeTime(costTime));
                        list = list2;
                        try {
                            iArr[list.indexOf(next)] = next.getCostTime();
                            runningPace.setHr(next.getAvghr());
                            int hr = i4 + runningPace.getHr();
                            if (d < costTime2) {
                                d = costTime2;
                            }
                            if (d2 < dDoubleValue3) {
                                d2 = dDoubleValue3;
                            }
                            if (isFive) {
                                if (next.getDisIndex() < 5) {
                                    j2 = costTime;
                                }
                                if (next.getDisIndex() % 5 == 0) {
                                    double d6 = d5 / 5.0d;
                                    Iterator<KilometreOrMileMarked> it3 = it2;
                                    runningPace.setPace(DataFormatter.formatTimeInSportFormForPace((long) d6));
                                    runningPace.setSpeed(NumberFormatter.formatDouble2String(new BigDecimal(((double) DataTypeSource.MAX_PACE_SECOND_VALID) / d5).setScale(2, 4).doubleValue(), 2, new int[0]));
                                    runningPace.setHr((int) Math.ceil(hr / 5.0f));
                                    arrayList3.add(runningPace);
                                    arrayList = arrayList4;
                                    try {
                                        arrayList.add(Double.valueOf(d6));
                                        i3 = 3600;
                                        d5 = 0.0d;
                                        i4 = 0;
                                        arrayList2 = arrayList;
                                        it2 = it3;
                                        j2 = costTime;
                                        list = null;
                                    } catch (Exception e) {
                                        e = e;
                                        j = costTime;
                                        e.printStackTrace();
                                        costTime = j;
                                        Integer numMinOrNull = ArraysKt___ArraysKt.minOrNull(iArr);
                                        if (!list.isEmpty()) {
                                            sportDetailKMSegmentFragment = this;
                                            sportDetailKMSegmentFragment.tagFullTime = isMetric ? 42 : 26;
                                            sportDetailKMSegmentFragment.tagHalfTime = isMetric ? 21 : 13;
                                        } else {
                                            sportDetailKMSegmentFragment = this;
                                            sportDetailKMSegmentFragment.tagFullTime = isMetric ? 42 : 26;
                                            sportDetailKMSegmentFragment.tagHalfTime = isMetric ? 21 : 13;
                                        }
                                        d3 = sportDetailKMSegmentFragment.EXTRA_THRESHOLD;
                                        totalDistance = trackData.getTotalDistance() / 1000.0f;
                                        if (!isMetric) {
                                            totalDistance /= 1.609344d;
                                        }
                                        if (isFive) {
                                            if (!arrayList3.isEmpty()) {
                                                disIndex = 0;
                                            } else {
                                                disIndex = 0;
                                            }
                                        } else if (!list.isEmpty()) {
                                            disIndex = list.get(list.size() - 1).getDisIndex();
                                        } else {
                                            disIndex = 0;
                                        }
                                        d4 = NumberFormatter.format(totalDistance, 3, new int[0]) - ((double) disIndex);
                                        if (d4 >= d3) {
                                            RunningPace runningPace2 = new RunningPace();
                                            if (isFive) {
                                                i2 = disIndex + 5;
                                            } else {
                                                if (isFive) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                i2 = disIndex + 1;
                                            }
                                            runningPace2.setKilometer(SearchCriteria.LT + i2);
                                            runningPace2.setCostTime(DataFormatter.getConsumeTime((long) trackData.getTotalCostTime().intValue()));
                                            long jIntValue = (long) trackData.getTotalCostTime().intValue();
                                            if (!isFive) {
                                                j3 = costTime;
                                            } else {
                                                if (!isFive) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                j3 = j2;
                                            }
                                            j4 = jIntValue - j3;
                                            if (list.isEmpty()) {
                                                avgPace = trackData.getAvgPace() * 1000;
                                            } else {
                                                avgPace = j4 * (((double) 1) / d4);
                                            }
                                            if (d < avgPace) {
                                                d = avgPace;
                                            }
                                            runningPace2.setPace(DataFormatter.formatTimeInSportFormForPace((long) avgPace));
                                            dDoubleValue2 = avgPace > 0.0d ? new BigDecimal(((double) 3600) / avgPace).setScale(2, 4).doubleValue() : 0.0d;
                                            if (d2 < dDoubleValue2) {
                                                d2 = dDoubleValue2;
                                            }
                                            runningPace2.setSpeed(String.valueOf(dDoubleValue2));
                                            if (!isFive) {
                                                j5 = costTime + 1;
                                            } else {
                                                if (!isFive) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                j5 = j2 + 1;
                                            }
                                            runningPace2.setHr(trackData.calculateAvgHeartRate((int) j5, (int) j4));
                                            arrayList3.add(runningPace2);
                                            arrayList.add(Double.valueOf(avgPace));
                                        }
                                        if (d >= sportDetailKMSegmentFragment.MAX_PACE_TIME) {
                                            g.sort(arrayList);
                                            size = arrayList.size() - 1;
                                            if (size >= 0) {
                                                while (true) {
                                                    i = size - 1;
                                                    dDoubleValue = ((Number) arrayList.get(size)).doubleValue();
                                                    if (dDoubleValue < sportDetailKMSegmentFragment.MAX_PACE_TIME) {
                                                        d = dDoubleValue;
                                                        break;
                                                    }
                                                    if (i < 0) {
                                                        break;
                                                    }
                                                    size = i;
                                                }
                                            }
                                        }
                                        if (sportDetailKMSegmentFragment.showPace(trackData.getSportType().intValue())) {
                                            d2 = d;
                                        }
                                        return new SpeedPaceResult(arrayList3, d2 / ((double) sportDetailKMSegmentFragment.PROGRESS_DELTA), numMinOrNull);
                                    }
                                } else {
                                    i3 = 3600;
                                    list = list;
                                    i4 = hr;
                                    arrayList2 = arrayList4;
                                }
                            } else {
                                Iterator<KilometreOrMileMarked> it4 = it2;
                                if (!isFive) {
                                    arrayList4.add(Double.valueOf(costTime2));
                                    arrayList3.add(runningPace);
                                }
                                i3 = 3600;
                                arrayList2 = arrayList4;
                                it2 = it4;
                                i4 = hr;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            arrayList = arrayList4;
                            j = costTime;
                            e.printStackTrace();
                            costTime = j;
                            Integer numMinOrNull2 = ArraysKt___ArraysKt.minOrNull(iArr);
                            if (!list.isEmpty()) {
                                sportDetailKMSegmentFragment = this;
                                sportDetailKMSegmentFragment.tagFullTime = isMetric ? 42 : 26;
                                sportDetailKMSegmentFragment.tagHalfTime = isMetric ? 21 : 13;
                            } else {
                                sportDetailKMSegmentFragment = this;
                                sportDetailKMSegmentFragment.tagFullTime = isMetric ? 42 : 26;
                                sportDetailKMSegmentFragment.tagHalfTime = isMetric ? 21 : 13;
                            }
                            d3 = sportDetailKMSegmentFragment.EXTRA_THRESHOLD;
                            totalDistance = trackData.getTotalDistance() / 1000.0f;
                            if (!isMetric) {
                                totalDistance /= 1.609344d;
                            }
                            if (isFive) {
                                if (!arrayList3.isEmpty()) {
                                    disIndex = 0;
                                } else {
                                    disIndex = 0;
                                }
                            } else if (!list.isEmpty()) {
                                disIndex = list.get(list.size() - 1).getDisIndex();
                            } else {
                                disIndex = 0;
                            }
                            d4 = NumberFormatter.format(totalDistance, 3, new int[0]) - ((double) disIndex);
                            if (d4 >= d3) {
                                RunningPace runningPace3 = new RunningPace();
                                if (isFive) {
                                    i2 = disIndex + 5;
                                } else {
                                    if (isFive) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i2 = disIndex + 1;
                                }
                                runningPace3.setKilometer(SearchCriteria.LT + i2);
                                runningPace3.setCostTime(DataFormatter.getConsumeTime((long) trackData.getTotalCostTime().intValue()));
                                long jIntValue2 = (long) trackData.getTotalCostTime().intValue();
                                if (!isFive) {
                                    j3 = costTime;
                                } else {
                                    if (!isFive) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j3 = j2;
                                }
                                j4 = jIntValue2 - j3;
                                if (list.isEmpty()) {
                                    avgPace = trackData.getAvgPace() * 1000;
                                } else {
                                    avgPace = j4 * (((double) 1) / d4);
                                }
                                if (d < avgPace) {
                                    d = avgPace;
                                }
                                runningPace3.setPace(DataFormatter.formatTimeInSportFormForPace((long) avgPace));
                                if (avgPace > 0.0d) {
                                }
                                if (d2 < dDoubleValue2) {
                                    d2 = dDoubleValue2;
                                }
                                runningPace3.setSpeed(String.valueOf(dDoubleValue2));
                                if (!isFive) {
                                    j5 = costTime + 1;
                                } else {
                                    if (!isFive) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j5 = j2 + 1;
                                }
                                runningPace3.setHr(trackData.calculateAvgHeartRate((int) j5, (int) j4));
                                arrayList3.add(runningPace3);
                                arrayList.add(Double.valueOf(avgPace));
                            }
                            if (d >= sportDetailKMSegmentFragment.MAX_PACE_TIME) {
                                g.sort(arrayList);
                                size = arrayList.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        i = size - 1;
                                        dDoubleValue = ((Number) arrayList.get(size)).doubleValue();
                                        if (dDoubleValue < sportDetailKMSegmentFragment.MAX_PACE_TIME) {
                                            d = dDoubleValue;
                                            break;
                                        }
                                        if (i < 0) {
                                            break;
                                            break;
                                        }
                                        size = i;
                                    }
                                }
                            }
                            if (sportDetailKMSegmentFragment.showPace(trackData.getSportType().intValue())) {
                                d2 = d;
                            }
                            return new SpeedPaceResult(arrayList3, d2 / ((double) sportDetailKMSegmentFragment.PROGRESS_DELTA), numMinOrNull2);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        list = list2;
                    }
                } catch (Exception e4) {
                    e = e4;
                    arrayList = arrayList2;
                    list = list;
                }
            }
            arrayList = arrayList2;
            list = list;
        } catch (Exception e5) {
            e = e5;
            arrayList = arrayList2;
            list = list;
            j = 0;
            j2 = 0;
            d = 0.0d;
            d2 = 0.0d;
        }
        Integer numMinOrNull3 = ArraysKt___ArraysKt.minOrNull(iArr);
        if ((!list.isEmpty()) || list.get(list.size() - 1).getDisIndex() <= list.size()) {
            sportDetailKMSegmentFragment = this;
            sportDetailKMSegmentFragment.tagFullTime = isMetric ? 42 : 26;
            sportDetailKMSegmentFragment.tagHalfTime = isMetric ? 21 : 13;
        } else {
            sportDetailKMSegmentFragment = this;
            sportDetailKMSegmentFragment.tagFullTime = isMetric ? sportDetailKMSegmentFragment.f(42, list) : sportDetailKMSegmentFragment.f(26, list);
            sportDetailKMSegmentFragment.tagHalfTime = isMetric ? sportDetailKMSegmentFragment.f(21, list) : sportDetailKMSegmentFragment.f(13, list);
        }
        d3 = sportDetailKMSegmentFragment.EXTRA_THRESHOLD;
        totalDistance = trackData.getTotalDistance() / 1000.0f;
        if (!isMetric) {
            totalDistance /= 1.609344d;
        }
        if (isFive) {
            if ((!arrayList3.isEmpty()) || (kilometer = ((RunningPace) arrayList3.get(arrayList3.size() - 1)).getKilometer()) == null) {
                disIndex = 0;
            } else {
                disIndex = Integer.parseInt(kilometer);
            }
        } else if (!list.isEmpty()) {
            disIndex = list.get(list.size() - 1).getDisIndex();
        } else {
            disIndex = 0;
        }
        d4 = NumberFormatter.format(totalDistance, 3, new int[0]) - ((double) disIndex);
        if (d4 >= d3) {
            RunningPace runningPace4 = new RunningPace();
            if (isFive) {
                i2 = disIndex + 5;
            } else {
                if (isFive) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = disIndex + 1;
            }
            runningPace4.setKilometer(SearchCriteria.LT + i2);
            runningPace4.setCostTime(DataFormatter.getConsumeTime((long) trackData.getTotalCostTime().intValue()));
            long jIntValue3 = (long) trackData.getTotalCostTime().intValue();
            if (!isFive) {
                j3 = costTime;
            } else {
                if (!isFive) {
                    throw new NoWhenBranchMatchedException();
                }
                j3 = j2;
            }
            j4 = jIntValue3 - j3;
            if (list.isEmpty()) {
                avgPace = trackData.getAvgPace() * 1000;
            } else {
                avgPace = j4 * (((double) 1) / d4);
            }
            if (d < avgPace) {
                d = avgPace;
            }
            runningPace4.setPace(DataFormatter.formatTimeInSportFormForPace((long) avgPace));
            if (avgPace > 0.0d) {
            }
            if (d2 < dDoubleValue2) {
                d2 = dDoubleValue2;
            }
            runningPace4.setSpeed(String.valueOf(dDoubleValue2));
            if (!isFive) {
                j5 = costTime + 1;
            } else {
                if (!isFive) {
                    throw new NoWhenBranchMatchedException();
                }
                j5 = j2 + 1;
            }
            runningPace4.setHr(trackData.calculateAvgHeartRate((int) j5, (int) j4));
            arrayList3.add(runningPace4);
            arrayList.add(Double.valueOf(avgPace));
        }
        if (d >= sportDetailKMSegmentFragment.MAX_PACE_TIME) {
            g.sort(arrayList);
            size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    i = size - 1;
                    dDoubleValue = ((Number) arrayList.get(size)).doubleValue();
                    if (dDoubleValue < sportDetailKMSegmentFragment.MAX_PACE_TIME) {
                        d = dDoubleValue;
                        break;
                    }
                    if (i < 0) {
                        break;
                        break;
                    }
                    size = i;
                }
            }
        }
        if (sportDetailKMSegmentFragment.showPace(trackData.getSportType().intValue())) {
            d2 = d;
        }
        return new SpeedPaceResult(arrayList3, d2 / ((double) sportDetailKMSegmentFragment.PROGRESS_DELTA), numMinOrNull3);
    }

    public static /* synthetic */ SpeedPaceResult e(SportDetailKMSegmentFragment sportDetailKMSegmentFragment, long j, ParsedSportDetailData parsedSportDetailData, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            return sportDetailKMSegmentFragment.d(j, parsedSportDetailData, z, (i & 8) != 0 ? false : z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToSpeedPaceResult");
    }

    private final int f(int baseDis, List<KilometreOrMileMarked> markedList) {
        int disIndex = baseDis - markedList.get(0).getDisIndex();
        int disIndex2 = markedList.get(0).getDisIndex();
        for (KilometreOrMileMarked kilometreOrMileMarked : markedList) {
            int disIndex3 = baseDis - kilometreOrMileMarked.getDisIndex();
            if (disIndex3 >= 0 && disIndex3 < disIndex) {
                disIndex2 = kilometreOrMileMarked.getDisIndex();
                disIndex = disIndex3;
            }
        }
        return disIndex2;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x030e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0321  */
    /* JADX WARN: Code duplicated, block: B:91:0x032e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0331  */
    /* JADX WARN: Code duplicated, block: B:94:0x035e  */
    private final void g(boolean isFive, View rootView) {
        String string;
        boolean z;
        String string2;
        int i;
        String str;
        boolean z2;
        IntRange intRangeUntil;
        int first;
        int last;
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i2 = 1;
        boolean z3 = false;
        if (linearLayout.getChildCount() > 2 && (first = (intRangeUntil = e.until(0, linearLayout.getChildCount())).getFirst()) <= (last = intRangeUntil.getLast())) {
            while (true) {
                int i3 = last - 1;
                if (last > 1) {
                    linearLayout.removeViewAt(last);
                }
                if (last == first) {
                    break;
                } else {
                    last = i3;
                }
            }
        }
        TypefaceTextView typefaceTextView = (TypefaceTextView) linearLayout.findViewById(R.id.km_text_index);
        boolean z4 = this.isMetric;
        if (z4) {
            string = linearLayout.getContext().getString(R.string.segment_km_title);
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            string = linearLayout.getContext().getString(R.string.segment_mile_title);
        }
        typefaceTextView.setText(string);
        ParsedSportDetailData parsedSportDetailData = this.myTrackData;
        if (parsedSportDetailData == null) {
            return;
        }
        SpeedPaceResult speedPaceResultD = d(this.trackId, parsedSportDetailData, this.isMetric, isFive);
        List<RunningPace> listComponent1 = speedPaceResultD.component1();
        double stepSec = speedPaceResultD.getStepSec();
        Integer minCostTime = speedPaceResultD.getMinCostTime();
        if (!listComponent1.isEmpty()) {
            linearLayout.setVisibility(0);
        }
        Iterator<RunningPace> it2 = listComponent1.iterator();
        while (it2.hasNext()) {
            RunningPace next = it2.next();
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.fragment_running_detail_speedpace_item, (ViewGroup) rootView, z3);
            Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            int i4 = R.id.km_text;
            ((TypefaceTextView) relativeLayout.findViewById(i4)).setTag(next);
            int i5 = R.id.speed_min_text;
            ((TypefaceTextView) relativeLayout.findViewById(i5)).setText(next.getPace());
            ((TypefaceTextView) relativeLayout.findViewById(i4)).setText(next.getKilometer());
            int i6 = R.id.spendtime_text;
            ((TypefaceTextView) relativeLayout.findViewById(i6)).setText(next.getCostTime());
            ((TypefaceTextView) relativeLayout.findViewById(R.id.heart_rate_text)).setText(HeartRateConstant.isHRValueValid(next.getHr()) ? String.valueOf(next.getHr()) : getString(R.string.data_not_supported));
            TextView textView = (TextView) rootView.findViewById(R.id.tv_records);
            Resources resources = linearLayout.getResources();
            it2 = it2;
            int i7 = R.plurals.km_segment_records;
            int size = listComponent1.size();
            Object[] objArr = new Object[i2];
            objArr[0] = Integer.valueOf(listComponent1.size());
            textView.setText(resources.getQuantityString(i7, size, objArr));
            int originalCostTime = next.getOriginalCostTime();
            if (minCostTime != null && minCostTime.intValue() == originalCostTime) {
                ((RelativeLayout) relativeLayout.findViewById(R.id.rl_km_segment)).setBackgroundColor(ContextCompat.getColor(linearLayout.getContext(), R.color.s4));
                ((ImageView) relativeLayout.findViewById(R.id.iv_right_triangle)).setVisibility(0);
                Drawable drawable = ContextCompat.getDrawable(linearLayout.getContext(), R.drawable.running_detail_speedpace_progress_drawable_blue);
                if (drawable != null) {
                    drawable.setBounds(((ProgressBar) relativeLayout.findViewById(R.id.speed_progress)).getProgressDrawable().getBounds());
                }
                ((ProgressBar) relativeLayout.findViewById(R.id.speed_progress)).setProgressDrawable(drawable);
            }
            View viewInflate2 = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.fragment_km_segment_marathon_pb_item, (ViewGroup) rootView, false);
            if (showPace(parsedSportDetailData.getSportType().intValue())) {
                parsedSportDetailData = parsedSportDetailData;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) linearLayout.findViewById(R.id.pace_name_title);
                boolean z5 = this.isMetric;
                if (z5 == i2) {
                    int i8 = R.string.km_segment_pace_title;
                    Object[] objArr2 = new Object[i2];
                    z = false;
                    objArr2[0] = linearLayout.getContext().getString(R.string.segment_km_title);
                    string2 = getString(i8, objArr2);
                } else {
                    z = false;
                    if (z5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string2 = getString(R.string.km_segment_pace_title, linearLayout.getContext().getString(R.string.segment_mile_title));
                }
                typefaceTextView2.setText(string2);
                if (m.equals$default(next.getPace(), "--", z, 2, null)) {
                    ((TypefaceTextView) relativeLayout.findViewById(i6)).setText(DataFormatter.formatTimeInSportFormForPace(0L));
                } else {
                    double paceStr = DataFormatter.parsePaceStr(next.getPace());
                    i = (int) (paceStr / stepSec);
                    if (paceStr >= this.MAX_PACE_TIME) {
                        ((TypefaceTextView) relativeLayout.findViewById(i6)).setText(DataFormatter.formatTimeInSportFormForPace(0L));
                    } else {
                        ((TypefaceTextView) relativeLayout.findViewById(i6)).setText(next.getCostTime());
                    }
                }
                i = 0;
            } else {
                ((TypefaceTextView) linearLayout.findViewById(R.id.pace_name_title)).setText(R.string.runningdetail_tab_speed);
                String speed = next.getSpeed();
                double d = speed == null ? 0.0d : Double.parseDouble(speed);
                parsedSportDetailData = parsedSportDetailData;
                int i9 = (int) (d / stepSec);
                if (d < (this.isMetric ? 0.6d : 0.37282272d)) {
                    ((TypefaceTextView) relativeLayout.findViewById(i6)).setText(IdManager.DEFAULT_VERSION_NAME);
                    i9 = 0;
                } else {
                    ((TypefaceTextView) relativeLayout.findViewById(i6)).setText(next.getCostTime());
                }
                ((TypefaceTextView) relativeLayout.findViewById(i5)).setText(next.getSpeed());
                minCostTime = minCostTime;
                listComponent1 = listComponent1;
                i = i9;
            }
            float f = i;
            int i10 = this.PROGRESS_DELTA;
            float f2 = this.MIN_RATIO;
            if (f < i10 * f2) {
                i = (int) (i10 * f2);
            }
            ((ProgressBar) relativeLayout.findViewById(R.id.speed_progress)).setProgress(i);
            LinearLayout linearLayout2 = (LinearLayout) rootView;
            linearLayout2.addView(relativeLayout);
            if (m.equals$default(next.getKilometer(), String.valueOf(this.tagHalfTime), false, 2, null)) {
                String str2 = this.jsonHalfTime;
                if (!(str2 == null || str2.length() == 0)) {
                    ((TextView) viewInflate2.findViewById(R.id.marathon_tag)).setText(getString(R.string.km_segment_half_marathon, DataFormatter.getConsumeTime(Long.parseLong(this.jsonHalfTime))));
                    linearLayout2.addView(viewInflate2);
                } else if (m.equals$default(next.getKilometer(), String.valueOf(this.tagFullTime), false, 2, null)) {
                    str = this.jsonFullTime;
                    if (str != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        i2 = 1;
                        ((TextView) viewInflate2.findViewById(R.id.marathon_tag)).setText(getString(R.string.km_segment_full_marathon, DataFormatter.getConsumeTime(Long.parseLong(this.jsonFullTime))));
                        linearLayout2.addView(viewInflate2);
                    }
                }
                i2 = 1;
            } else if (m.equals$default(next.getKilometer(), String.valueOf(this.tagFullTime), false, 2, null)) {
                i2 = 1;
            } else {
                str = this.jsonFullTime;
                if (str != null || str.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = 1;
                } else {
                    i2 = 1;
                    ((TextView) viewInflate2.findViewById(R.id.marathon_tag)).setText(getString(R.string.km_segment_full_marathon, DataFormatter.getConsumeTime(Long.parseLong(this.jsonFullTime))));
                    linearLayout2.addView(viewInflate2);
                }
            }
            z3 = false;
        }
    }

    private final void h(String marathon) {
        try {
            JSONObject jSONObject = new JSONObject(marathon);
            if (jSONObject.has("half")) {
                this.jsonHalfTime = jSONObject.getJSONObject("half").getString("time");
            }
            if (jSONObject.has(MessengerShareContentUtility.WEBVIEW_RATIO_FULL)) {
                this.jsonFullTime = jSONObject.getJSONObject(MessengerShareContentUtility.WEBVIEW_RATIO_FULL).getString("time");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private final void initData() {
        ParsedSportDetailData trackData;
        if (this.trackId >= 0 && (trackData = TrackDataManager.getInstance().getTrackData(this.trackId, this.deviceSource, this.sportType)) != null) {
            this.myTrackData = trackData;
            Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(this.trackId, this.deviceSource);
            this.trackRecord = trackRecordById;
            if (trackRecordById == null) {
                return;
            }
            String marathon = trackRecordById.getMarathon();
            if (marathon == null || marathon.length() == 0) {
                return;
            }
            h(trackRecordById.getMarathon());
        }
    }

    private final void initView(View rootView) {
        g(false, rootView);
        b(rootView);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.trackId = arguments.getLong("trackid", -1L);
            this.deviceSource = arguments.getInt("source", -1);
            this.sportType = arguments.getInt("type", 1);
            this.isMetric = arguments.getBoolean(SportWebParams.PARAMA_METRIC, false);
        }
        return inflater.inflate(R.layout.fragment_sport_detail_km_segment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        initView(view);
    }

    public final boolean showPace(int type) {
        if (SportTypeIdentifier.isSubSport(type)) {
            type -= 1000;
        }
        return type == 1 || type == 110 || type == 131 || type == 192 || type == 7 || type == 8 || type == 25 || type == 26;
    }
}
