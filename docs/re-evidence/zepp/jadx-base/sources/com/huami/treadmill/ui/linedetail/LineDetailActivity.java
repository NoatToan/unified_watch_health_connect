package com.huami.treadmill.ui.linedetail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.gson.reflect.TypeToken;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.data.BoltRunnerData;
import com.huami.treadmill.data.BoltSportState;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.StringGenderTuple;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.TdPromotionLine;
import com.huami.treadmill.data.TdRankingItem;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ext.AutoNestedScrollView;
import com.huami.treadmill.ext.AutoViewPager;
import com.huami.treadmill.ext.DrawableExKt;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.component.CollapsibleTextView;
import com.huami.treadmill.ui.component.HorizontalAvatar;
import com.huami.treadmill.ui.linedetail.LineDetailActivity;
import com.huami.treadmill.ui.running.LineRunningActivity;
import com.huami.treadmill.ui.running.LineStartupActivity;
import com.huami.treadmill.util.DataFormatter;
import com.huami.treadmill.util.DensityUtils;
import com.huami.treadmill.util.TimeUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.huami.widget.typeface.TypefaceTextView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u001e\u0010\u0010\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/huami/treadmill/ui/linedetail/LineDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "u", "", "msg", LogUtil.I, "initView", "v", "z", "K", "", "Lcom/huami/treadmill/data/TdRankingItem;", "data", "", "index", "B", "J", "F", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "t", "C", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/treadmill/ui/linedetail/LineDetailViewModel;", "x", "Lcom/huami/treadmill/ui/linedetail/LineDetailViewModel;", "viewModel", "", "y", "mLineId", "mLineTime", "", "mLineDistance", "Ljava/lang/String;", "mLineName", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment;", LogUtil.D, "Lcom/huami/android/design/dialog/AlertDialogFragment;", "connectFailedDialog", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LineDetailActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String LINE_AREA = "line_area";

    @NotNull
    public static final String LINE_DISTANCE = "line_distance";

    @NotNull
    public static final String LINE_ICON = "line_icon";

    @NotNull
    public static final String LINE_ID = "line_id";

    @NotNull
    public static final String LINE_INTRODUCTION = "line_introduction";

    @NotNull
    public static final String LINE_MAN = "line_man";

    @NotNull
    public static final String LINE_NAME = "line_name";

    @NotNull
    public static final String LINE_TIME = "line_time";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float mLineDistance;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private String mLineName = "";

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment connectFailedDialog;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private LineDetailViewModel viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private long mLineId;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private long mLineTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJN\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/huami/treadmill/ui/linedetail/LineDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "id", "time", "", "icon", "name", "introduction", BaseDeviceStatusActivity.KEY_AREA, "", "distance", "", "man", "", "startMe", "LINE_AREA", "Ljava/lang/String;", "LINE_DISTANCE", "LINE_ICON", "LINE_ID", "LINE_INTRODUCTION", "LINE_MAN", "LINE_NAME", "LINE_TIME", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, long id, long time, @NotNull String icon, @NotNull String name, @NotNull String introduction, @NotNull String area, float distance, int man) {
            Intent intent = new Intent(context, (Class<?>) LineDetailActivity.class);
            intent.putExtra("line_id", id);
            intent.putExtra("line_time", time);
            intent.putExtra(LineDetailActivity.LINE_ICON, icon);
            intent.putExtra("line_name", name);
            intent.putExtra(LineDetailActivity.LINE_INTRODUCTION, introduction);
            intent.putExtra(LineDetailActivity.LINE_AREA, area);
            intent.putExtra("line_distance", distance);
            intent.putExtra(LineDetailActivity.LINE_MAN, man);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
            if (!companion.getInstance().hasBoundBolt()) {
                LineDetailActivity.this.C();
            } else {
                if (companion.getInstance().isConnectedBolt()) {
                    LineDetailActivity.this.J();
                    return;
                }
                companion.getInstance().connectBolt();
                LineDetailActivity lineDetailActivity = LineDetailActivity.this;
                lineDetailActivity.I(lineDetailActivity.getString(R.string.td_connecting));
            }
        }
    }

    private final boolean A() {
        AlertDialogFragment alertDialogFragment = this.connectFailedDialog;
        if (alertDialogFragment != null) {
            if (alertDialogFragment != null && alertDialogFragment.isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(List<TdRankingItem> data, int index) {
        if (data.size() > 0) {
            findViewById(R.id.me_rank).setVisibility(0);
            for (TdRankingItem tdRankingItem : data) {
                String userId = tdRankingItem.getUserId();
                ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
                BoltRunnerData runnerData = companion.getInstance().getRunnerData();
                String avatarUrl = null;
                if (TextUtils.equals(userId, runnerData == null ? null : runnerData.getUid())) {
                    int i = R.id.me_rank;
                    ((TypefaceTextView) findViewById(i).findViewById(R.id.name)).setText(getString(R.string.td_line_detail_me));
                    ((TypefaceTextView) findViewById(i).findViewById(R.id.td_rank)).setText(String.valueOf(tdRankingItem.getRank()));
                    if (index == 0) {
                        View viewFindViewById = findViewById(i);
                        int i2 = R.id.time_or_count;
                        ((TypefaceTextView) viewFindViewById.findViewById(i2)).setTextColor(ContextCompat.getColor(this, R.color.cl_8d8d8d));
                        if (Build.VERSION.SDK_INT >= 24) {
                            ((TypefaceTextView) findViewById(i).findViewById(i2)).setText(Html.fromHtml(getResources().getQuantityString(R.plurals.td_count_format, tdRankingItem.getValue(), Integer.valueOf(tdRankingItem.getValue())), 0));
                        } else {
                            ((TypefaceTextView) findViewById(i).findViewById(i2)).setText(Html.fromHtml(getResources().getQuantityString(R.plurals.td_count_format, tdRankingItem.getValue(), Integer.valueOf(tdRankingItem.getValue()))));
                        }
                    } else if (index == 1) {
                        View viewFindViewById2 = findViewById(i);
                        int i3 = R.id.time_or_count;
                        ((TypefaceTextView) viewFindViewById2.findViewById(i3)).setText(TimeUtils.INSTANCE.getTimeString(Integer.valueOf(tdRankingItem.getValue() / 1000)));
                        ((TypefaceTextView) findViewById(i).findViewById(i3)).setTextColor(ContextCompat.getColor(this, R.color.cl_ff5353));
                    }
                    View viewFindViewById3 = findViewById(i);
                    int i4 = R.id.icon;
                    Glide.with((ImageView) viewFindViewById3.findViewById(i4)).load(tdRankingItem.getIcon()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into((ImageView) findViewById(i).findViewById(i4));
                    return;
                }
                int i5 = R.id.me_rank;
                ((TypefaceTextView) findViewById(i5).findViewById(R.id.name)).setText(getString(R.string.td_line_detail_me));
                ((TypefaceTextView) findViewById(i5).findViewById(R.id.td_rank)).setText("--");
                if (index == 0) {
                    View viewFindViewById4 = findViewById(i5);
                    int i6 = R.id.time_or_count;
                    ((TypefaceTextView) viewFindViewById4.findViewById(i6)).setTextColor(ContextCompat.getColor(this, R.color.s2));
                    if (Build.VERSION.SDK_INT >= 24) {
                        ((TypefaceTextView) findViewById(i5).findViewById(i6)).setText(Html.fromHtml(getString(R.string.td_count_format_default, new Object[]{"--"}), 0));
                    } else {
                        ((TypefaceTextView) findViewById(i5).findViewById(i6)).setText(Html.fromHtml(getString(R.string.td_count_format_default, new Object[]{"--"})));
                    }
                } else if (index == 1) {
                    View viewFindViewById5 = findViewById(i5);
                    int i7 = R.id.time_or_count;
                    ((TypefaceTextView) viewFindViewById5.findViewById(i7)).setText("00:00:00");
                    ((TypefaceTextView) findViewById(i5).findViewById(i7)).setTextColor(ContextCompat.getColor(this, R.color.cl_ff5353));
                }
                View viewFindViewById6 = findViewById(i5);
                int i8 = R.id.icon;
                RequestManager requestManagerWith = Glide.with((ImageView) viewFindViewById6.findViewById(i8));
                BoltRunnerData runnerData2 = companion.getInstance().getRunnerData();
                if (runnerData2 != null) {
                    avatarUrl = runnerData2.getAvatarUrl();
                }
                requestManagerWith.load(avatarUrl).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into((ImageView) findViewById(i5).findViewById(i8));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        new AlertDialogFragment.Builder(getApplicationContext()).setCancelable(true).setTitle(R.string.td_line_detail_unbind_info).setNegativeButton(getString(R.string.td_line_detail_unbind_go), new DialogInterface.OnClickListener() { // from class: km4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LineDetailActivity.D(this.a, dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.td_line_detail_unbind_ok), new DialogInterface.OnClickListener() { // from class: lm4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LineDetailActivity.E(dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(LineDetailActivity lineDetailActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        if (companion.getInstance().isOverSea()) {
            companion.getInstance().launchWeb(lineDetailActivity, "https://en.amazfit.com/airrun.html");
        } else {
            companion.getInstance().launchWeb(lineDetailActivity, "https://cn.amazfit.com/airrun.html");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        AlertDialogFragment alertDialogFragment;
        if (this.connectFailedDialog == null) {
            this.connectFailedDialog = new AlertDialogFragment.Builder(getApplicationContext()).setCancelable(true).setTitle(R.string.td_bolt_connect_failed).setMessage(R.string.td_bolt_connect_failed_content).setNegativeButton(getString(R.string.td_exit), new DialogInterface.OnClickListener() { // from class: im4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LineDetailActivity.G(this.a, dialogInterface, i);
                }
            }).setPositiveButton(getString(R.string.td_retry), new DialogInterface.OnClickListener() { // from class: jm4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LineDetailActivity.H(this.a, dialogInterface, i);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.connectFailedDialog;
        if (!((alertDialogFragment2 == null || alertDialogFragment2.isShowing()) ? false : true) || (alertDialogFragment = this.connectFailedDialog) == null) {
            return;
        }
        alertDialogFragment.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(LineDetailActivity lineDetailActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        lineDetailActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(LineDetailActivity lineDetailActivity, DialogInterface dialogInterface, int i) {
        ProxyTreadmill.INSTANCE.getInstance().connectBolt();
        lineDetailActivity.I(lineDetailActivity.getString(R.string.td_connecting));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        if (this.mLoadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(this);
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (((loadingDialog3 == null || loadingDialog3.isShowing()) ? false : true) && (loadingDialog2 = this.mLoadingDialog) != null) {
            loadingDialog2.show();
        }
        LoadingDialog loadingDialog4 = this.mLoadingDialog;
        if (loadingDialog4 != null) {
            loadingDialog4.setCancelable(false);
        }
        if (TextUtils.isEmpty(msg) || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.setMessage(msg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        if (companion.getInstance().getSportState() == BoltSportState.RUNNING || companion.getInstance().getSportState() == BoltSportState.PAUSED) {
            LineRunningActivity.INSTANCE.startMe(getApplicationContext(), true, this.mLineId, this.mLineTime, 0L, this.mLineDistance, this.mLineName);
        } else {
            LineStartupActivity.INSTANCE.startMe(getApplicationContext(), this.mLineId, this.mLineTime, this.mLineDistance, this.mLineName);
        }
    }

    private final void K() {
        LineDetailViewModel lineDetailViewModel = this.viewModel;
        Objects.requireNonNull(lineDetailViewModel);
        lineDetailViewModel.getMeDiligentRank().observe(this, new Observer() { // from class: pm4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LineDetailActivity.L(this.a, (List) obj);
            }
        });
        ((AutoViewPager) findViewById(R.id.view_pager)).addOnPageChangeListener(new LineDetailActivity$upDataUserView$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(LineDetailActivity lineDetailActivity, List list) {
        lineDetailActivity.B(list, 0);
    }

    private final void initView() {
        LineDetailViewModel lineDetailViewModel = this.viewModel;
        Objects.requireNonNull(lineDetailViewModel);
        Objects.requireNonNull(lineDetailViewModel);
        lineDetailViewModel.getLineDetail().observe(this, new Observer() { // from class: nm4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LineDetailActivity.x(this.a, (Items) obj);
            }
        });
        this.mLineId = getIntent().getLongExtra("line_id", 0L);
        long longExtra = getIntent().getLongExtra("line_time", 0L);
        this.mLineTime = longExtra;
        LineDetailViewModel lineDetailViewModel2 = this.viewModel;
        Objects.requireNonNull(lineDetailViewModel2);
        lineDetailViewModel2.getLineDetail(this.mLineId, longExtra, 0L);
        String stringExtra = getIntent().getStringExtra(LINE_ICON);
        this.mLineName = getIntent().getStringExtra("line_name");
        String stringExtra2 = getIntent().getStringExtra(LINE_INTRODUCTION);
        String stringExtra3 = getIntent().getStringExtra(LINE_AREA);
        this.mLineDistance = getIntent().getFloatExtra("line_distance", 0.0f);
        int intExtra = getIntent().getIntExtra(LINE_MAN, 0);
        if (TextUtils.isEmpty(stringExtra)) {
            LineDetailViewModel lineDetailViewModel3 = this.viewModel;
            Objects.requireNonNull(lineDetailViewModel3);
            lineDetailViewModel3.getPromotionLineDetail().observe(this, new Observer() { // from class: om4
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    LineDetailActivity.y(this.a, (TdPromotionLine) obj);
                }
            });
        }
        LineDetailViewModel lineDetailViewModel4 = this.viewModel;
        Objects.requireNonNull(lineDetailViewModel4);
        lineDetailViewModel4.getPromotionLinesDetail(this.mLineId);
        int i = R.id.detail_line_bg;
        Glide.with((ImageView) findViewById(i)).load(stringExtra).apply(TdmillConfig.INSTANCE.getGldieSharedOptions()).into((ImageView) findViewById(i));
        ((TextView) findViewById(R.id.bar_title)).setText(this.mLineName);
        ((TextView) findViewById(R.id.line_title)).setText(this.mLineName);
        ((CollapsibleTextView) findViewById(R.id.line_introduction)).setText(stringExtra2);
        ((TextView) findViewById(R.id.line_area)).setText(stringExtra3);
        if (RunnerData.getRunner().isMetric()) {
            TypefaceTextView typefaceTextView = (TypefaceTextView) findViewById(R.id.line_dis);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            typefaceTextView.setText(String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(new BigDecimal(String.valueOf(this.mLineDistance)).setScale(2, 1).floatValue())}, 1)));
            ((TextView) findViewById(R.id.line_dis_unit)).setText(getString(R.string.td_running_kilometer));
        } else {
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) findViewById(R.id.line_dis);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            typefaceTextView2.setText(String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(new BigDecimal(DataFormatter.INSTANCE.formatKMDisToMI(this.mLineDistance)).setScale(2, 1).floatValue())}, 1)));
            ((TextView) findViewById(R.id.line_dis_unit)).setText(getString(R.string.td_unit_mile));
        }
        ((TextView) findViewById(R.id.line_run_number)).setText(getApplicationContext().getResources().getQuantityString(R.plurals.tdmill_run_man_upgrade, intExtra, Integer.valueOf(intExtra)));
        ((AutoNestedScrollView) findViewById(R.id.auto_nsv)).setOnScrollListener(new AutoNestedScrollView.OnScrollListener() { // from class: com.huami.treadmill.ui.linedetail.LineDetailActivity.initView.4
            @Override // com.huami.treadmill.ext.AutoNestedScrollView.OnScrollListener
            public void onScroll(int scrollY) {
                Drawable drawableTint;
                float f = scrollY;
                DensityUtils densityUtils = DensityUtils.INSTANCE;
                float fDip2px = f > ((float) densityUtils.dip2px(LineDetailActivity.this, 333.0f)) ? 1.0f : f / densityUtils.dip2px(LineDetailActivity.this, 333.0f);
                int i2 = (int) (255 * fDip2px);
                ((ConstraintLayout) LineDetailActivity.this.findViewById(R.id.action_bar)).setBackgroundColor(Color.argb(i2, 255, 255, 255));
                ((TextView) LineDetailActivity.this.findViewById(R.id.bar_title)).setTextColor(Color.argb(i2, 0, 0, 0));
                LineDetailActivity.this.findViewById(R.id.status_bar).setBackgroundColor(Color.argb(i2, 255, 255, 255));
                Drawable drawable = ContextCompat.getDrawable(LineDetailActivity.this, R.drawable.td_left_arrow_back);
                if (drawable == null) {
                    drawableTint = null;
                } else {
                    drawableTint = DrawableExKt.tint(drawable, ArgbEvaluatorCompat.getInstance().evaluate((float) Math.pow(fDip2px, 3), (Integer) (-1), (Integer) (-16777216)).intValue());
                }
                ((ImageView) LineDetailActivity.this.findViewById(R.id.bar_back)).setImageDrawable(drawableTint);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void u() {
        ViewExtKt.smartClick$default((Button) findViewById(R.id.start_run), 0L, new a(), 1, null);
        ProxyTreadmill.INSTANCE.getInstance().setConnectedListener(new LineDetailActivity$initClick$2(this));
    }

    private final void v() {
        setStyle(BaseTitleActivity.STYLE.NONE, 0, true);
        ((ImageView) findViewById(R.id.bar_back)).setOnClickListener(new View.OnClickListener() { // from class: mm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LineDetailActivity.w(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(LineDetailActivity lineDetailActivity, View view) {
        lineDetailActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(LineDetailActivity lineDetailActivity, Items items) {
        ArrayList arrayList = new ArrayList();
        for (TdLineDetail tdLineDetail : items.getItems()) {
            String lineDetailAvatar = tdLineDetail.getLineDetailAvatar();
            if (!(lineDetailAvatar == null || lineDetailAvatar.length() == 0)) {
                arrayList.add(tdLineDetail.getLineDetailAvatar());
            }
        }
        ((HorizontalAvatar) lineDetailActivity.findViewById(R.id.horizontal_avatar)).addAvatas(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(LineDetailActivity lineDetailActivity, TdPromotionLine tdPromotionLine) {
        StringGenderTuple stringGenderTuple = (StringGenderTuple) HMHttpUtils.getGson().fromJson(tdPromotionLine.getRunLineDetailIcon(), new TypeToken<StringGenderTuple>() { // from class: com.huami.treadmill.ui.linedetail.LineDetailActivity$initView$3$typeTuple$1
        }.getType());
        BoltRunnerData runnerData = ProxyTreadmill.INSTANCE.getInstance().getRunnerData();
        boolean z = false;
        if (runnerData != null && runnerData.getGender() == 1) {
            z = true;
        }
        String female = null;
        if (z) {
            if (stringGenderTuple != null) {
                female = stringGenderTuple.getMale();
            }
        } else if (stringGenderTuple != null) {
            female = stringGenderTuple.getFemale();
        }
        int i = R.id.detail_line_bg;
        Glide.with((ImageView) lineDetailActivity.findViewById(i)).load(female).apply(TdmillConfig.INSTANCE.getGldieSharedOptions()).into((ImageView) lineDetailActivity.findViewById(i));
        ((CollapsibleTextView) lineDetailActivity.findViewById(R.id.line_introduction)).setText(tdPromotionLine.getRunLineIntroduction());
    }

    private final void z() {
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(getString(R.string.td_diligent_ranking), getString(R.string.td_speed_ranking));
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setScrollPivotX(0.5f);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new LineDetailActivity$initViewPager$1(this, listMutableListOf));
        int i = R.id.tab_layout;
        ((MagicIndicator) findViewById(i)).setNavigator(commonNavigator);
        MagicIndicator magicIndicator = (MagicIndicator) findViewById(i);
        int i2 = R.id.view_pager;
        ViewPagerHelper.bind(magicIndicator, (AutoViewPager) findViewById(i2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(DiligentRankFragment.INSTANCE.newInstance(this.mLineId));
        arrayList.add(SpeedRankFragment.INSTANCE.newInstance(this.mLineId));
        ((AutoViewPager) findViewById(i2)).setAdapter(new FragmentsPageAdapter(getSupportFragmentManager(), arrayList));
        ((AutoViewPager) findViewById(i2)).setOffscreenPageLimit(arrayList.size());
        K();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_detail);
        this.viewModel = (LineDetailViewModel) AppCompatActivityExtKt.obtainViewModel(this, LineDetailViewModel.class);
        v();
        initView();
        z();
        u();
    }
}
