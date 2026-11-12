package com.xiaomi.hm.health.share;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.timepicker.TimeModel;
import com.huami.lib.ShareType;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.v2.RequestMultiplePermissionCallback;
import com.huami.lib.v2.SharePermissionManager;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.text.UnitTextView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ContextExtKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.SharePanel;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.AvatarManager;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.share.HMShareActivity;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.view.ShareItemView;
import com.xiaomi.hm.health.webapi.RankWebAPI;
import com.xiaomi.mipush.sdk.Constants;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class HMShareActivity extends BaseFragmentActivity implements PreShareListener, View.OnClickListener {
    private static final String A = "type";
    private static final String B = "data";
    private static final String C = "source";
    private static final int D = 3;
    private static final int E = 100;
    public static final int SOURCE_DETAIL = 0;
    public static final int SOURCE_HOME = 2;
    public static final int SOURCE_STATISTICS = 1;
    public static final int TYPE_CONTINUE_ACHIEVE = 9;
    public static final int TYPE_DAILY_SLEEP = 1;
    public static final int TYPE_DAILY_STEP_BAND = 4;
    public static final int TYPE_MINE_STANDARDS = 12;
    public static final int TYPE_MONTHLY_SLEEP = 3;
    public static final int TYPE_MONTHLY_STEP = 7;
    public static final int TYPE_WEEKLY_SLEEP = 2;
    public static final int TYPE_WEEKLY_STEP = 6;
    public static final int TYPE_WEIGHT = 8;
    private static final String z = HMShareActivity.class.getSimpleName();
    private ImageView c;
    private TextView d;
    private ImageView e;
    private View f;
    private View g;
    private View h;
    private Button i;
    private TextView j;
    private TextView k;
    private ImageView l;
    private View m;
    private ToggleButton n;
    private View p;
    private UnitTextView q;
    private ShareItemView r;
    private ShareItemView s;
    private ShareItemView t;
    private TextView u;
    private TextView v;
    private Object w;
    private SharePanel y;
    private final Context a = this;
    private int b = 0;
    private boolean o = false;
    private final boolean x = Language.isEnglish();

    public class a extends RequestMultiplePermissionCallback {
        public a() {
        }

        @Override // com.huami.lib.v2.RequestMultiplePermissionCallback
        public void onPermissionGranted(@NonNull List<String> permissions) {
            HMShareActivity.this.L();
        }
    }

    public class b implements RankWebAPI.OnRankHandler {
        public final /* synthetic */ ShareContinue a;

        public b(final ShareContinue val$shareContinue) {
            this.a = val$shareContinue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(String str) {
            return "failed log : " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(int i) {
            return "rank : " + i;
        }

        @Override // com.xiaomi.hm.health.webapi.RankWebAPI.OnRankHandler
        public void onFailed(final String log) {
            HMLog.debug(HMShareActivity.z, new Function0() { // from class: com.xiaomi.hm.health.share.b
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMShareActivity.b.c(log);
                }
            });
        }

        @Override // com.xiaomi.hm.health.webapi.RankWebAPI.OnRankHandler
        public void onRank(final int rank) {
            HMLog.debug(HMShareActivity.z, new Function0() { // from class: com.xiaomi.hm.health.share.a
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMShareActivity.b.d(rank);
                }
            });
            if (rank > 1) {
                if (TextUtils.isEmpty(this.a.text)) {
                    HMShareActivity.this.k.setText(HMShareActivity.this.getResources().getQuantityString(R.plurals.share_step_rank, rank, Integer.valueOf(rank)));
                    return;
                }
                HMShareActivity.this.k.setText(HMShareActivity.this.getResources().getQuantityString(R.plurals.share_step_rank, rank, Integer.valueOf(rank)) + " , " + this.a.text);
                return;
            }
            if (TextUtils.isEmpty(this.a.text)) {
                HMShareActivity.this.k.setText(HMShareActivity.this.getString(R.string.share_continue_rank));
                return;
            }
            HMShareActivity.this.k.setText(HMShareActivity.this.getString(R.string.share_continue_rank) + " , " + this.a.text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A(ShareWeight shareWeight) {
        return "weight compareValue : " + shareWeight.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
        layoutParams.setMarginEnd(layoutParams.rightMargin - ((int) this.q.getLastUnitWidth()));
        this.l.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C(ShareContent shareContent) {
        return "bitmapUrl = " + shareContent.bitmapUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(CompoundButton compoundButton, boolean z2) {
        M(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E(Parcelable parcelable) {
        return "data: " + parcelable.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.g.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        if (this.b == 8) {
            this.n.setVisibility(8);
        }
        this.y.onSharePrepared(v());
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        this.g.setVisibility(4);
        if (this.b == 8) {
            this.n.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String G() {
        return "on start, data : " + this.w.toString();
    }

    private void H(@ColorRes int background) {
        this.f.setBackgroundColor(ContextCompat.getColor(this, background));
    }

    private void I(ShareContinue shareContinue) {
        RankWebAPI.getContinueRank(shareContinue.days, shareContinue.b, shareContinue.c, new b(shareContinue));
    }

    private void J(ShareSleep sleep) {
        Calendar.getInstance().setTimeInMillis(sleep.time);
        if (HMKeeper.getCompareSleepRate() < 1) {
            TextView textView = this.k;
            StringBuilder sb = new StringBuilder();
            sb.append(this.x ? " " : "");
            sb.append(getString(R.string.sleep_3_goal_title_99));
            textView.append(sb.toString());
        }
    }

    private void K(ShareStep step) {
        String string;
        Calendar.getInstance().setTimeInMillis(step.time);
        int compareStepRate = HMKeeper.getCompareStepRate();
        if (compareStepRate < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(TimeUtils.formatDate_y(BraceletApp.getContext(), Calendar.getInstance().getTime()));
            sb.append(this.x ? " " : "");
            sb.append(getString(R.string.share_continue_rank));
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(TimeUtils.formatDate_y(BraceletApp.getContext(), Calendar.getInstance().getTime()));
            sb2.append(this.x ? " " : "");
            sb2.append(getResources().getQuantityString(R.plurals.share_step_rank, compareStepRate, Integer.valueOf(compareStepRate)));
            string = sb2.toString();
        }
        this.k.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        this.h.setVisibility(0);
    }

    private void M(boolean isShow) {
        if (isShow) {
            this.m.setVisibility(4);
            this.p.setVisibility(0);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.WEIGHT_HIDE_NUM).setValue("show"));
        } else {
            this.m.setVisibility(8);
            this.p.setVisibility(8);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.WEIGHT_HIDE_NUM).setValue("hide"));
        }
    }

    private void initView() {
        this.f = findViewById(R.id.content_layout);
        this.i = (Button) findViewById(R.id.back_button);
        findViewById(R.id.title_bar_back).setOnClickListener(this);
        this.g = findViewById(R.id.share_logo);
        this.h = findViewById(R.id.share_pane_container);
        this.c = (ImageView) findViewById(R.id.share_icon);
        this.d = (TextView) findViewById(R.id.share_username);
        this.e = (ImageView) findViewById(R.id.share_achieve_mark_view);
        this.j = (TextView) findViewById(R.id.share_value_title);
        this.k = (TextView) findViewById(R.id.share_value_date);
        this.l = (ImageView) findViewById(R.id.share_weight_icon);
        this.p = findViewById(R.id.share_detail_layout);
        this.m = findViewById(R.id.share_divider_line);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.share_hidden_icon);
        this.n = toggleButton;
        toggleButton.setCompoundDrawables(ContextExtKt.loadDrawable(this.a, R.drawable.share_weight_icon_selector, R.color.s20, Integer.valueOf(Utils.dip2px(this, 20.0f))), null, null, null);
        this.n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: df3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.a.D(compoundButton, z2);
            }
        });
        UnitTextView unitTextView = (UnitTextView) findViewById(R.id.unit_text);
        this.q = unitTextView;
        unitTextView.setCenterByFirst(true);
        this.r = (ShareItemView) findViewById(R.id.first_item);
        this.s = (ShareItemView) findViewById(R.id.second_item);
        this.t = (ShareItemView) findViewById(R.id.third_item);
        this.u = (TextView) findViewById(R.id.continue_start);
        this.v = (TextView) findViewById(R.id.continue_stop);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.title_bar_back);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.topMargin = ViewUtils.getStatusBarHeight(this.a);
        frameLayout.setLayoutParams(layoutParams);
    }

    public static void launch(Context context, int type, int source, final Parcelable data) {
        Intent intent = new Intent(context, (Class<?>) HMShareActivity.class);
        intent.putExtra("type", type);
        intent.putExtra("source", source);
        intent.putExtra("data", data);
        HMLog.debug(z, new Function0() { // from class: gf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMShareActivity.E(data);
            }
        });
        context.startActivity(intent);
    }

    private void m(int type) {
        if (type == 6) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SHARE_WEEK_STEP_VIEW_NUM));
            return;
        }
        if (type == 7) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SHARE_MONTH_STEP_VIEW_NUM));
            return;
        }
        if (type == 2) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SHARE_WEEK_SLEEP_VIEW_NUM));
            return;
        }
        if (type == 3) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SHARE_MONTH_SLEEP_VIEW_NUM));
        } else if (type == 9) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SHARE_STANDARD_VIEW_NUM));
        } else if (type == 8) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SHARE_WEIGHT_VIEW_NUM));
        }
    }

    private void n(ShareContinue data) {
        findViewById(R.id.continue_layout).setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.continue_dot_line);
        M(false);
        this.j.setText(data.title);
        this.q.setValue(data.days, getString(R.string.unit_day));
        if (data.b.equals(data.c)) {
            textView.setTextSize(14.0f);
            textView.setText(data.b);
            this.u.setVisibility(8);
            this.v.setVisibility(8);
        } else {
            this.u.setVisibility(0);
            this.v.setVisibility(0);
            textView.setTextSize(18.0f);
            textView.setText(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            this.u.setText(data.b);
            this.v.setText(data.c);
        }
        if (data.days >= 3 && TextUtils.equals(data.title, getString(R.string.share_continue))) {
            I(data);
        }
        if (data.days == 0) {
            findViewById(R.id.continue_dot_line).setVisibility(4);
            this.u.setText("");
            this.v.setText("");
        }
    }

    private void o(ShareSleep info, boolean isToday) {
        if (isToday) {
            this.j.setTypeface(HomeUtils.getMaisonTypeface());
            int i = Integer.parseInt(info.sleepDurationHour);
            int i2 = Integer.parseInt(info.sleepDurationMin);
            if ((i > 0 || i2 > 0) && z(info.time)) {
                J(info);
            }
        }
        this.j.setText(info.valueTitle);
        this.q.setValues(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(info.sleepScore)), "");
        this.k.setText(info.date);
        this.r.bind(R.drawable.icon_share_sleeptime_s3, getString(isToday ? R.string.share_start_sleep : R.string.share_day_start_sleep), info.start, info.startUnit);
        this.s.bind(R.drawable.icon_share_wakeup_s3, getString(isToday ? R.string.share_stop_sleep : R.string.share_day_stop_sleep), info.stop, info.stopUnit);
        int i3 = Integer.parseInt(info.sleepDeepHour);
        int i4 = R.string.share_deep_sleep;
        if (i3 > 0) {
            ShareItemView shareItemView = this.t;
            if (!isToday) {
                i4 = R.string.share_day_deep_sleep;
            }
            shareItemView.bind(R.drawable.icon_share_deepsleep_s3, getString(i4), info.sleepDeepHour, getString(R.string.unit_hour), u(info.sleepDeepMin), getString(R.string.unit_min));
            return;
        }
        ShareItemView shareItemView2 = this.t;
        if (!isToday) {
            i4 = R.string.share_day_deep_sleep;
        }
        shareItemView2.bind(R.drawable.icon_share_deepsleep_s3, getString(i4), u(info.sleepDeepMin), getString(R.string.unit_min_long));
    }

    private void p(ShareStep info, boolean isToday) {
        if (info != null) {
            this.j.setText(info.d);
            this.q.setValues(Utils.formatDecimalNoSeparator(info.step), getString(R.string.unit_step));
            this.k.setText(info.date);
            if (isToday && info.step > 0) {
                if (!TextUtils.isEmpty(info.c)) {
                    this.e.setVisibility(0);
                }
                if (TimeUtils.isToday(info.time)) {
                    K(info);
                }
            }
            String string = getString(isToday ? R.string.share_step_active : R.string.share_step_active_tal);
            String string2 = getString(R.string.unit_hour);
            String string3 = getString(R.string.unit_min);
            String string4 = getString(R.string.unit_min_long);
            if (Integer.parseInt(info.a) <= 0) {
                this.r.bind(R.drawable.icon_share_time_s3, string, u(info.b), string4);
            } else if (isToday || Integer.parseInt(info.a) < 100) {
                this.r.bind(R.drawable.icon_share_time_s3, string, info.a, string2, u(info.b), string3);
            } else {
                this.r.bind(R.drawable.icon_share_time_s3, string, info.a, string2);
            }
            this.s.bind(R.drawable.icon_share_mileage_s3, getString(isToday ? R.string.share_step_distance : R.string.share_step_distance_tal), info.distance, info.distanceUnit);
            this.t.bind(R.drawable.icon_share_calories_s3, getString(isToday ? R.string.share_step_cal : R.string.share_step_cal_tal), Utils.formatDecimal(info.cal), this.a.getString(R.string.unit_calorie));
        }
    }

    private void q() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        String avatarPath = hMPersonInfo.getUserInfo().getAvatarPath();
        String avatar = hMPersonInfo.getUserInfo().getAvatar();
        String nickname = hMPersonInfo.getUserInfo().getNickname();
        this.d.setText(nickname);
        AvatarManager.updateAvatarUI(this, this.c, avatarPath, avatar, nickname);
    }

    private void r(final ShareWeight info) throws ParseException {
        this.l.setVisibility(0);
        this.j.setText(info.b);
        this.k.setText(info.c);
        HMLog.debug(z, new Function0() { // from class: jf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMShareActivity.A(info);
            }
        });
        float weightStringToFloat = HMWeightUtils.parseWeightStringToFloat(info.d);
        String weightValueStringForDisplay = HMWeightUtils.getWeightValueStringForDisplay(Math.abs(weightStringToFloat), BFCallback.getUnitManager().getWeightUnit());
        if (weightStringToFloat >= 0.0f) {
            this.q.setValues(weightValueStringForDisplay, info.a);
            this.l.setImageDrawable(ContextExtKt.loadDrawable(this, R.drawable.ic_rise_20, R.color.s1, null));
        } else {
            this.q.setValue(weightValueStringForDisplay, info.a);
            this.l.setImageDrawable(ContextExtKt.loadDrawable(this, R.drawable.ic_drop_20, R.color.s1, null));
        }
        t(info);
    }

    private void s(ShareWeight weight) {
        UserInfos userInfosLoad = HMDaoManager.getInstance().getDaoSession().getUserInfosDao().load("" + weight.userid);
        if (userInfosLoad != null) {
            String avatarPath = userInfosLoad.getAvatarPath();
            String avatarUrl = userInfosLoad.getAvatarUrl();
            String name = userInfosLoad.getName();
            String str = name != null ? name : "";
            this.d.setText(str);
            AvatarManager.updateAvatarUI(this, this.c, avatarPath, avatarUrl, str);
        }
    }

    private void t(ShareWeight info) {
        if (!this.o) {
            this.q.post(new Runnable() { // from class: ef3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.B();
                }
            });
            this.o = true;
        }
        this.n.setVisibility(0);
        View viewFindViewById = findViewById(R.id.weight_item_value);
        this.r.bind(R.drawable.icon_share_weight_s3, getString(R.string.share_weight_current_value), info.weightValue, info.a);
        if (TextUtils.isEmpty(info.bodyFat)) {
            this.s.bind(R.drawable.icon_share_bmi_s3, getString(R.string.share_weight_bmi), TextUtils.isEmpty(info.bmi) ? "--" : info.bmi);
        } else {
            this.s.bind(R.drawable.icon_share_fat_s3, getString(R.string.share_weight_bodyfat), info.bodyFat, "");
        }
        if (TextUtils.isEmpty(info.e)) {
            this.t.bind(R.drawable.icon_share_figure_s3, getString(R.string.share_weight_figure), "--");
            return;
        }
        this.t.setVisibility(8);
        if (this.b == 8) {
            findViewById(R.id.weight_item).setVisibility(8);
        } else {
            findViewById(R.id.weight_item).setVisibility(0);
        }
        if (GlobalConfig.get().isBuildMidong()) {
            ((UnitTextView) viewFindViewById).setValue(info.e);
            return;
        }
        TextView textView = (TextView) viewFindViewById;
        if (this.x) {
            textView.setTextSize(2, 16.0f);
        }
        textView.setText(info.e);
    }

    public static Drawable tintDrawable(Drawable drawable, ColorStateList colors) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(drawableWrap, colors);
        return drawableWrap;
    }

    private String u(String min) {
        if (min.length() != 1 || min.charAt(0) <= '0' || min.charAt(0) > '9') {
            return min;
        }
        return "0" + min;
    }

    private ShareContent v() {
        final ShareContent shareContent = new ShareContent();
        shareContent.content = w();
        shareContent.title = getString(R.string.app_name);
        shareContent.topic = getString(R.string.share_topic);
        shareContent.bitmapUrl = Utils.captureViewShare(this.f, this);
        HMLog.debug(SportAnalytics.Params.VALUE_SHARE, new Function0() { // from class: hf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMShareActivity.C(shareContent);
            }
        });
        return shareContent;
    }

    private String w() {
        int i = this.b;
        return (i == 1 || i == 2 || i == 3 || i == 8) ? "" : getString(R.string.share_content);
    }

    private void x() {
        this.g.setVisibility(0);
        this.h.setVisibility(8);
    }

    private void y() {
        if (findViewById(R.id.share_pane_container) == null) {
            return;
        }
        this.y = new SharePanel();
        Bundle bundle = new Bundle();
        if (RainbowUtils.isDarkMode(this)) {
            bundle.putInt(SharePanel.ARG_BG_COLOR, ContextCompat.getColor(this, R.color.s38));
        } else {
            bundle.putInt(SharePanel.ARG_BG_COLOR, ContextCompat.getColor(this, R.color.s4));
        }
        bundle.putBoolean("share_type", true);
        this.y.setArguments(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.share_pane_container, this.y);
        this.y.setShareListener(this);
        fragmentTransactionBeginTransaction.commit();
    }

    private boolean z(long time) {
        return TimeUtils.isToday(time);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (v.getId() == R.id.title_bar_back) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_layout);
        StatusBarUtil.setStatusColor(this, true, !RainbowUtils.isDarkMode(this), 0);
        initView();
        if (RainbowUtils.isDarkMode(this)) {
            findViewById(R.id.share_bar_bg).setVisibility(8);
            H(R.color.s10);
        } else {
            findViewById(R.id.share_bar_bg).setVisibility(0);
            H(R.color.s38);
        }
        y();
        this.b = getIntent().getIntExtra("type", 0);
        this.w = getIntent().getParcelableExtra("data");
        SharePermissionManager.requestSharePermission(this, ShareType.BASE, new a());
    }

    @Override // com.huami.widget.share.PreShareListener
    public void onPreShare(int shareType) {
        runOnUiThread(new Runnable() { // from class: ff3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (SharePermissionManager.hasSharePermission(this)) {
            L();
        } else {
            x();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() throws ParseException {
        super.onStart();
        HMLog.debug(z, new Function0() { // from class: if3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.G();
            }
        });
        int i = this.b;
        if (i == 4) {
            if (this.w instanceof ShareStep) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((ShareStep) this.w).time);
                if (new SportDay(calendar).isToday() && SportDataManager.getInstance().shouldCover()) {
                    ((ShareStep) this.w).step = SportDataManager.getInstance().getTodayStepInfo().getStepsCount();
                    ((ShareStep) this.w).distance = UnitManager.getInstance().formatValue(SportDataManager.getInstance().getTodayStepInfo().getDistance());
                    ((ShareStep) this.w).cal = String.valueOf(SportDataManager.getInstance().getTodayStepInfo().getCalories());
                    ((ShareStep) this.w).distanceUnit = UnitManager.getInstance().getUnit(SportDataManager.getInstance().getTodayStepInfo().getDistance());
                }
                p((ShareStep) this.w, true);
            }
        } else if (i == 6 || i == 7) {
            Object obj = this.w;
            if (obj instanceof ShareStep) {
                p((ShareStep) obj, false);
            }
        } else if (i == 1) {
            Object obj2 = this.w;
            if (obj2 instanceof ShareSleep) {
                o((ShareSleep) obj2, true);
            }
        } else if (i == 2 || i == 3) {
            Object obj3 = this.w;
            if (obj3 instanceof ShareSleep) {
                o((ShareSleep) obj3, false);
            }
        } else if (i == 8) {
            Object obj4 = this.w;
            if (obj4 instanceof ShareWeight) {
                r((ShareWeight) obj4);
            }
        } else if (i == 9) {
            Object obj5 = this.w;
            if (obj5 instanceof ShareContinue) {
                n((ShareContinue) obj5);
            }
        } else if (i == 12) {
            Object obj6 = this.w;
            if (obj6 instanceof ShareContinue) {
                n((ShareContinue) obj6);
            }
        }
        if (this.b == 8) {
            Object obj7 = this.w;
            if (obj7 instanceof ShareWeight) {
                s((ShareWeight) obj7);
            }
        } else {
            q();
        }
        m(this.b);
    }
}
