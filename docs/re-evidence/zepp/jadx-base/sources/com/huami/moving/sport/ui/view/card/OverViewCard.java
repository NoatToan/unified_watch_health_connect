package com.huami.moving.sport.ui.view.card;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.activity.SportDetailPageActivity;
import com.huami.moving.sport.ui.common.SportDataDisplayItem;
import com.huami.moving.sport.ui.view.card.OverViewCard;
import com.huami.moving.sport.ui.view.dialog.NoGPSTipFragment;
import com.huami.moving.ui.sport.in.VerifyDistanceFragment;
import com.huami.moving.ui.utils.BitmapUtils;
import com.huami.moving.ui.utils.RunnerPeripheralInfo;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.m;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0084\u0001B#\u0012\u0006\u0010|\u001a\u00020{\u0012\b\u0010~\u001a\u0004\u0018\u00010}\u0012\u0006\u0010\u007f\u001a\u00020\b¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001B\u001d\b\u0016\u0012\u0006\u0010|\u001a\u00020{\u0012\b\u0010~\u001a\u0004\u0018\u00010}¢\u0006\u0006\b\u0080\u0001\u0010\u0082\u0001B\u0013\b\u0016\u0012\u0006\u0010|\u001a\u00020{¢\u0006\u0006\b\u0080\u0001\u0010\u0083\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0014\u0010\u0016\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u001c\u0010\u001a\u001a\u00020\u00062\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017J\u001c\u0010\u001b\u001a\u00020\u00062\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017J@\u0010$\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%J\u000e\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\nR\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0016\u00109\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0016\u0010;\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010C\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00106R\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00106R\u0016\u0010F\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00106R\u0016\u0010H\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0016\u0010K\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010O\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010JR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u00100R\u0016\u0010V\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020\f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0016\u0010]\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010XR$\u0010e\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010k\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u00106R\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bt\u0010>R\u0016\u0010v\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00106R\u0016\u0010x\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u00106R\u0016\u0010z\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u00100¨\u0006\u0085\u0001"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/OverViewCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/huami/moving/ui/utils/RunnerPeripheralInfo;", "info", "Landroid/widget/ImageView;", ViewHierarchyConstants.VIEW_KEY, "", GoogleApiAvailabilityLight.b, "", "navFrom", "", "f", "", "input", TdmillHmFragment.ARG_IS_METRIC, "g", "type", SportDetailPageActivity.HAS_TRACK, "m", "", "Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter$DeviceItem;", "items", "setDevice", "Lkotlin/Function1;", "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMoreClickListener", "setIvFoldClickListener", "Lcom/huami/moving/sport/ui/view/card/CardInfoAdapter;", "adapter", "", "startTimeString", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackrecord", "Landroidx/fragment/app/FragmentManager;", "manager", "setData", "Lcom/huami/moving/sport/ui/common/SportDataDisplayItem;", "mainData", "updateMainData", "isFold", "updateIvFold", "a", "Z", "opened", "b", "showMoreInfo", "c", "Landroid/widget/ImageView;", "overViewAvatar", GoogleApiAvailabilityLight.a, "overViewAvatarNoGPS", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "overViewNickname", "overViewNicknameNoGPS", "overViewStartTime", "h", "overViewStartTimeNoGPS", "Landroidx/recyclerview/widget/RecyclerView;", "i", "Landroidx/recyclerview/widget/RecyclerView;", "overViewInfo", z.j, "overViewMainValue", hl.k, "overViewMainValueNoGPS", "l", "overViewMainUnit", "overViewMainUnitNoGPS", "Landroid/view/View;", "overViewInfoMore", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "clUserInfo", b.r, "clUserInfoNoGps", DTransferConstants.SEARCH_KEY, "cardOverContainer", "r", "Lcom/huami/moving/ui/utils/RunnerPeripheralInfo;", SOAP.XMLNS, "ivDistanceVerify", "t", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecord", "u", LogUtil.D, "KM_CONVERT_TO_M", "v", "currentDistance", "w", "originDistance", "Lcom/huami/moving/sport/ui/view/card/OverViewCard$VerifyDistanceListener;", "x", "Lcom/huami/moving/sport/ui/view/card/OverViewCard$VerifyDistanceListener;", "getDistanceListener", "()Lcom/huami/moving/sport/ui/view/card/OverViewCard$VerifyDistanceListener;", "setDistanceListener", "(Lcom/huami/moving/sport/ui/view/card/OverViewCard$VerifyDistanceListener;)V", "distanceListener", "Landroid/widget/RelativeLayout;", "y", "Landroid/widget/RelativeLayout;", "rlNoGPSTip", "z", "tvNoGPSTip", "Lcom/huami/moving/sport/ui/view/dialog/NoGPSTipFragment;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/moving/sport/ui/view/dialog/NoGPSTipFragment;", "noGPSTipFragment", "Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter;", "B", "Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter;", "deviceAdapter", "C", "deviceContainer", "overViewSlow", "E", "overViewFast", "F", "ivFold", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "VerifyDistanceListener", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class OverViewCard extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private NoGPSTipFragment noGPSTipFragment;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private DeviceSourceAdapter deviceAdapter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private RecyclerView deviceContainer;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private TextView overViewSlow;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private TextView overViewFast;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private ImageView ivFold;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean opened;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean showMoreInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private ImageView overViewAvatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private ImageView overViewAvatarNoGPS;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private TextView overViewNickname;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private TextView overViewNicknameNoGPS;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private TextView overViewStartTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private TextView overViewStartTimeNoGPS;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private RecyclerView overViewInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private TextView overViewMainValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private TextView overViewMainValueNoGPS;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private TextView overViewMainUnit;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private TextView overViewMainUnitNoGPS;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private View overViewInfoMore;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private ConstraintLayout clUserInfo;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private ConstraintLayout clUserInfoNoGps;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private ConstraintLayout cardOverContainer;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private RunnerPeripheralInfo info;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private ImageView ivDistanceVerify;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Trackrecord trackRecord;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final double KM_CONVERT_TO_M;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private double currentDistance;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private double originDistance;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private VerifyDistanceListener distanceListener;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private RelativeLayout rlNoGPSTip;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private TextView tvNoGPSTip;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/OverViewCard$VerifyDistanceListener;", "", "", "distance", "", "onVerifyDistanceUpdate", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public interface VerifyDistanceListener {
        void onVerifyDistanceUpdate(double distance);
    }

    public OverViewCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KM_CONVERT_TO_M = 1000.0d;
        LayoutInflater.from(context).inflate(R.layout.card_over_new_view, this);
        this.info = RunnerPeripheralInfo.getInstance();
        this.overViewAvatar = (ImageView) findViewById(R.id.over_view_avatar);
        this.overViewAvatarNoGPS = (ImageView) findViewById(R.id.over_view_avatar_no_gps);
        this.overViewNickname = (TextView) findViewById(R.id.over_view_nickname);
        this.overViewNicknameNoGPS = (TextView) findViewById(R.id.over_view_nickname_no_gps);
        this.overViewStartTime = (TextView) findViewById(R.id.over_view_start_time);
        this.overViewStartTimeNoGPS = (TextView) findViewById(R.id.over_view_start_time_no_gps);
        this.overViewInfo = (RecyclerView) findViewById(R.id.over_view_info);
        this.overViewMainValue = (TextView) findViewById(R.id.over_view_main_value);
        this.overViewMainValueNoGPS = (TextView) findViewById(R.id.over_view_main_value_no_gps);
        this.overViewMainUnit = (TextView) findViewById(R.id.over_view_main_unit);
        this.overViewMainUnitNoGPS = (TextView) findViewById(R.id.over_view_main_unit_no_gps);
        this.overViewInfoMore = findViewById(R.id.over_view_info_more);
        this.clUserInfo = (ConstraintLayout) findViewById(R.id.cl_user_info);
        this.clUserInfoNoGps = (ConstraintLayout) findViewById(R.id.cl_user_info_no_gps);
        this.ivDistanceVerify = (ImageView) findViewById(R.id.iv_distance_verify);
        this.rlNoGPSTip = (RelativeLayout) findViewById(R.id.rl_sport_head_no_map);
        this.tvNoGPSTip = (TextView) findViewById(R.id.sport_head_no_map);
        this.cardOverContainer = (ConstraintLayout) findViewById(R.id.card_over_container);
        this.deviceAdapter = new DeviceSourceAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.over_view_data_source);
        this.deviceContainer = recyclerView;
        Objects.requireNonNull(recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        this.overViewSlow = (TextView) findViewById(R.id.over_view_slow);
        this.overViewFast = (TextView) findViewById(R.id.over_view_fast);
        ImageView imageView = (ImageView) findViewById(R.id.iv_logo);
        if (!Utils.isMidong()) {
            imageView.setImageResource(R.drawable.water_mark_life_small);
        }
        this.ivFold = (ImageView) findViewById(R.id.iv_fold);
        if (RainbowUtils.isDarkMode(context)) {
            this.overViewSlow.setBackgroundColor(Color.parseColor("#272829"));
            this.overViewFast.setBackgroundColor(Color.parseColor("#272829"));
        } else {
            this.overViewSlow.setBackgroundColor(Color.parseColor("#F6F7F8"));
            this.overViewFast.setBackgroundColor(Color.parseColor("#F6F7F8"));
        }
    }

    private final boolean f(int navFrom) {
        if (navFrom == 1) {
            Trackrecord trackrecord = this.trackRecord;
            Objects.requireNonNull(trackrecord);
            Integer distance = trackrecord.getDistance();
            if ((distance != null ? Float.valueOf(distance.intValue()) : null).floatValue() <= 100.0f) {
                return false;
            }
        } else {
            if (navFrom != 2) {
                return false;
            }
            Trackrecord trackrecord2 = this.trackRecord;
            Objects.requireNonNull(trackrecord2);
            Integer source = trackrecord2.getSource();
            if (!((((((((((source != null && source.intValue() == 3) || (source != null && source.intValue() == 6)) || (source != null && source.intValue() == 7)) || (source != null && source.intValue() == 8)) || (source != null && source.intValue() == 9)) || (source != null && source.intValue() == 124)) || (source != null && source.intValue() == 125)) || (source != null && source.intValue() == 131)) || (source != null && source.intValue() == 149)) || (source != null && source.intValue() == 801))) {
                return false;
            }
            Trackrecord trackrecord3 = this.trackRecord;
            Objects.requireNonNull(trackrecord3);
            Integer distance2 = trackrecord3.getDistance();
            if ((distance2 != null ? Float.valueOf(distance2.intValue()) : null).floatValue() <= 100.0f) {
                return false;
            }
            Trackrecord trackrecord4 = this.trackRecord;
            Objects.requireNonNull(trackrecord4);
            Integer indoorRunCalibrated = trackrecord4.getIndoorRunCalibrated();
            if ((indoorRunCalibrated == null ? 0 : indoorRunCalibrated.intValue()) != 0) {
                return false;
            }
        }
        return true;
    }

    private final double g(double input, boolean isMetric) {
        Double dValueOf = Double.valueOf(input);
        dValueOf.doubleValue();
        if (Boolean.valueOf(isMetric).booleanValue()) {
            dValueOf = null;
        }
        this.currentDistance = dValueOf == null ? input : Double.valueOf(dValueOf.doubleValue() / 0.6213712d).doubleValue();
        this.overViewMainValueNoGPS.setText(NumberFormatter.formatDouble2StringByLocale(input, 2, new int[0]));
        Double dValueOf2 = Double.valueOf(input);
        dValueOf2.doubleValue();
        if (!isMetric) {
            dValueOf2 = null;
        }
        double dDoubleValue = new BigDecimal(String.valueOf(dValueOf2 == null ? input * 1.609344d : dValueOf2.doubleValue())).multiply(BigDecimal.valueOf(this.KM_CONVERT_TO_M)).doubleValue();
        Double dValueOf3 = Double.valueOf(dDoubleValue);
        dValueOf3.doubleValue();
        Double d = isMetric ? dValueOf3 : null;
        return d == null ? dDoubleValue + ((double) 1) : d.doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final OverViewCard overViewCard, final boolean z, FragmentManager fragmentManager, View view) {
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_ADJUSTING_CLICK));
        VerifyDistanceFragment verifyDistanceFragmentNewInstance = VerifyDistanceFragment.newInstance(overViewCard.originDistance, overViewCard.currentDistance, z);
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.setTransition(4099);
        verifyDistanceFragmentNewInstance.show(fragmentTransactionBeginTransaction, "vdf");
        verifyDistanceFragmentNewInstance.setOnVerifyListener(new VerifyDistanceFragment.OnVerifyListener() { // from class: rn5
            @Override // com.huami.moving.ui.sport.in.VerifyDistanceFragment.OnVerifyListener
            public final void onVerify(double d) {
                OverViewCard.i(this.a, z, d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(OverViewCard overViewCard, boolean z, double d) {
        VerifyDistanceListener distanceListener = overViewCard.getDistanceListener();
        if (distanceListener == null) {
            return;
        }
        distanceListener.onVerifyDistanceUpdate(overViewCard.g(d, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(OverViewCard overViewCard, FragmentManager fragmentManager, View view) {
        NoGPSTipFragment noGPSTipFragment = overViewCard.noGPSTipFragment;
        boolean z = false;
        if (noGPSTipFragment != null && noGPSTipFragment.isVisible()) {
            z = true;
        }
        if (z) {
            return;
        }
        if (overViewCard.noGPSTipFragment == null) {
            overViewCard.noGPSTipFragment = new NoGPSTipFragment();
        }
        NoGPSTipFragment noGPSTipFragment2 = overViewCard.noGPSTipFragment;
        if (noGPSTipFragment2 == null) {
            return;
        }
        noGPSTipFragment2.showAllowingStateLoss(fragmentManager, "OverViewCard");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Function1 function1, View view) {
        function1.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Function1 function1, View view) {
        function1.invoke(view);
    }

    private final boolean m(int type, boolean hasTrack) {
        return SportTypeIdentifier.isOutdoorSportType(type) && !hasTrack;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    private final void n(RunnerPeripheralInfo info, ImageView view) {
        String avatarUrl;
        String avatarPath = info.getAvatarPath();
        if (avatarPath != null) {
            if (!new File(avatarPath).exists()) {
                avatarPath = null;
            }
            if (avatarPath == null) {
                avatarPath = null;
            } else {
                BitmapUtils.displayRoundImage(getContext(), avatarPath, view);
            }
        } else {
            avatarPath = null;
        }
        if (avatarPath != null || (avatarUrl = info.getAvatarUrl()) == null) {
            return;
        }
        String str = m.isBlank(avatarUrl) ? null : avatarUrl;
        if (str == null) {
            return;
        }
        BitmapUtils.displayRoundImage(getContext(), str, view);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final VerifyDistanceListener getDistanceListener() {
        return this.distanceListener;
    }

    public final void setData(boolean hasTrack, @NotNull CardInfoAdapter adapter, @Nullable String startTimeString, @NotNull Trackrecord trackrecord, int navFrom, final boolean isMetric, @NotNull final FragmentManager manager) {
        this.trackRecord = trackrecord;
        if (hasTrack) {
            this.clUserInfoNoGps.setVisibility(8);
            this.clUserInfo.setVisibility(0);
            this.overViewAvatar.setVisibility(0);
            n(this.info, this.overViewAvatar);
            TextView textView = this.overViewNickname;
            String name = this.info.getName();
            textView.setText(name != null ? name : "");
            ViewGroup.LayoutParams layoutParams = this.cardOverContainer.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = (int) ViewUtils.dp2px(getContext(), 8.0f);
            this.cardOverContainer.setLayoutParams(layoutParams2);
        } else {
            this.clUserInfo.setVisibility(8);
            this.clUserInfoNoGps.setVisibility(0);
            this.overViewAvatar.setVisibility(8);
            n(this.info, this.overViewAvatarNoGPS);
            TextView textView2 = this.overViewNicknameNoGPS;
            String name2 = this.info.getName();
            textView2.setText(name2 != null ? name2 : "");
        }
        Trackrecord trackrecord2 = this.trackRecord;
        Objects.requireNonNull(trackrecord2);
        if (m(trackrecord2.getType().intValue(), hasTrack)) {
            this.rlNoGPSTip.setVisibility(0);
            this.tvNoGPSTip.setOnClickListener(new View.OnClickListener() { // from class: nn5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OverViewCard.j(this.a, manager, view);
                }
            });
        }
        Trackrecord trackrecord3 = this.trackRecord;
        Objects.requireNonNull(trackrecord3);
        Integer type = trackrecord3.getType();
        if (type != null && type.intValue() == 8 && f(navFrom)) {
            ImageView imageView = this.ivDistanceVerify;
            Trackrecord trackrecord4 = this.trackRecord;
            Objects.requireNonNull(trackrecord4);
            double dIntValue = ((double) trackrecord4.getDistance().intValue()) / this.KM_CONVERT_TO_M;
            this.originDistance = dIntValue;
            this.currentDistance = dIntValue;
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: on5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OverViewCard.h(this.a, isMetric, manager, view);
                }
            });
        }
        this.overViewStartTime.setText(startTimeString);
        this.overViewStartTimeNoGPS.setText(startTimeString);
        this.overViewInfo.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.overViewInfo.setNestedScrollingEnabled(false);
        this.overViewInfo.setAdapter(adapter);
    }

    public final void setDevice(@NotNull List<DeviceSourceAdapter.DeviceItem> items) {
        RecyclerView recyclerView = this.deviceContainer;
        Objects.requireNonNull(recyclerView);
        recyclerView.setLayoutManager(items.size() > 1 ? new LinearLayoutManager(getContext()) : new GridLayoutManager(getContext(), 2));
        this.deviceAdapter.setItems(items);
        RecyclerView recyclerView2 = this.deviceContainer;
        Objects.requireNonNull(recyclerView2);
        recyclerView2.setAdapter(this.deviceAdapter);
    }

    public final void setDistanceListener(@Nullable VerifyDistanceListener verifyDistanceListener) {
        this.distanceListener = verifyDistanceListener;
    }

    public final void setIvFoldClickListener(@Nullable final Function1<? super View, Unit> listener) {
        this.ivFold.setOnClickListener(listener == null ? null : new View.OnClickListener() { // from class: qn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverViewCard.k(listener, view);
            }
        });
    }

    public final void setMoreClickListener(@Nullable final Function1<? super View, Unit> listener) {
        this.overViewInfoMore.setOnClickListener(listener == null ? null : new View.OnClickListener() { // from class: pn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverViewCard.l(listener, view);
            }
        });
    }

    public final void updateIvFold(boolean isFold) {
        if (isFold) {
            this.ivFold.setImageResource(R.drawable.ic_expand_less_20);
        } else {
            this.ivFold.setImageResource(R.drawable.ic_expand_more_20);
        }
    }

    public final void updateMainData(@NotNull SportDataDisplayItem mainData) {
        this.overViewMainValue.setText(mainData.getValue());
        this.overViewMainValueNoGPS.setText(mainData.getValue());
        this.overViewMainUnit.setText(mainData.getUnit());
        this.overViewMainUnitNoGPS.setText(mainData.getUnit());
    }

    public OverViewCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverViewCard(@NotNull Context context) {
        this(context, null);
    }
}
