package com.xiaomi.hm.health.share;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.ShareType;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.v2.RequestMultiplePermissionCallback;
import com.huami.lib.v2.SharePermissionManager;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.text.UnitTextView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.ktx.ContextExtKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.SharePanel;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.manager.AvatarManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.share.HMShareBodyFatActivity;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.view.ShareItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class HMShareBodyFatActivity extends BaseFragmentActivity implements PreShareListener {
    private static final String I = "HMShareBodyFatActivity";
    private static final int J = 7;
    private static final String K = "type";
    private static final String L = "data";
    private static final String M = "source";
    private static final String N = "uid";
    private static final String O = "time";
    private static final String P = "change";
    public static final int SOURCE_DETAIL = 0;
    public static final int TYPE_BODY_FAT = 11;
    private ListView A;
    private ListView B;
    private ListView C;
    private RelativeLayout D;
    private RecyclerView E;
    private String F;
    private View G;
    private SharePanel H;
    private boolean c;
    private ImageView d;
    private TextView e;
    private ScrollView f;
    private View g;
    private ImageView h;
    private View i;
    private Button j;
    private TextView k;
    private TextView l;
    private View m;
    private ToggleButton n;
    private View p;
    private UnitTextView q;
    private ShareItemView r;
    private ShareItemView s;
    private ShareItemView t;
    private Object u;
    private RelativeLayout v;
    private RelativeLayout w;
    private TextView x;
    private TextView y;
    private TextView z;
    private final Context a = this;
    private int b = 0;
    private boolean o = false;

    public class MyAdapter extends BaseAdapter {
        private final Context a;
        private final List<ScoreParamsObject> b;

        public class a {
            public ImageView a;
            public TextView b;
            public UnitTextView c;
            public TextView d;
            public View e;
            public RelativeLayout f;

            public a() {
            }
        }

        public MyAdapter(Context context, List<ScoreParamsObject> list) {
            this.a = context;
            this.b = list;
        }

        private void a(ScoreParamsObject paramsObject, ImageView view, int statusColor) {
            switch (paramsObject.getWfType()) {
                case 0:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_bmi_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 1:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_basal_metabolism_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 2:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_body_fat_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 3:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_bone_mass_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 4:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_visceral_fat_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 5:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_water_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 6:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_muscle_mass_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 7:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_protein_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 10:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_sfp_24), ColorStateList.valueOf(statusColor)));
                    break;
                case 11:
                    view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_skeletal_muscle_24), ColorStateList.valueOf(statusColor)));
                    break;
            }
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int groupPosition, View convertView, ViewGroup parent) {
            a aVar;
            if (convertView == null) {
                convertView = LayoutInflater.from(this.a).inflate(R.layout.score_parent_item_share_bf, parent, false);
                aVar = new a();
                aVar.a = (ImageView) convertView.findViewById(R.id.bf_score_ll_pre);
                aVar.b = (TextView) convertView.findViewById(R.id.params_name_tv);
                aVar.c = (UnitTextView) convertView.findViewById(R.id.params_value_tv);
                aVar.d = (TextView) convertView.findViewById(R.id.content_state_tv);
                aVar.f = (RelativeLayout) convertView.findViewById(R.id.container);
                aVar.e = convertView.findViewById(R.id.divider_bottom);
                convertView.setTag(aVar);
            } else {
                aVar = (a) convertView.getTag();
            }
            aVar.f.setLayoutParams(new AbsListView.LayoutParams(-1, Utils.dip2px(HMShareBodyFatActivity.this.a, 58.0f)));
            aVar.b.setText(String.valueOf(this.b.get(groupPosition).getParamsName()));
            aVar.d.setText(this.b.get(groupPosition).getLevel());
            String paramsValue = this.b.get(groupPosition).getParamsValue();
            if (TextUtils.isEmpty(this.b.get(groupPosition).getUnitValue())) {
                aVar.c.setValue(paramsValue, "");
            } else {
                aVar.c.setValue(paramsValue, this.b.get(groupPosition).getUnitValue());
            }
            ScoreParamsObject scoreParamsObject = this.b.get(groupPosition);
            if (scoreParamsObject.getType() == 1) {
                a(scoreParamsObject, aVar.a, HMShareBodyFatActivity.this.a.getResources().getColor(R.color.p3));
            } else if (scoreParamsObject.getType() == 2) {
                a(scoreParamsObject, aVar.a, HMShareBodyFatActivity.this.a.getResources().getColor(R.color.s33));
            } else if (scoreParamsObject.getType() == 0) {
                a(scoreParamsObject, aVar.a, HMShareBodyFatActivity.this.a.getResources().getColor(R.color.s20));
                if (groupPosition == this.b.size() - 1) {
                    aVar.e.setVisibility(8);
                }
            }
            return convertView;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int position) {
            return false;
        }
    }

    public class a extends RequestMultiplePermissionCallback {
        public a() {
        }

        @Override // com.huami.lib.v2.RequestMultiplePermissionCallback
        public void onPermissionGranted(@NonNull List<String> permissions) {
            HMShareBodyFatActivity.this.O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(CompoundButton compoundButton, boolean z) {
        P(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(RelativeLayout relativeLayout, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = {0, 0};
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        relativeLayout.getLocationOnScreen(iArr);
        ViewGroup.LayoutParams layoutParams2 = this.G.getLayoutParams();
        layoutParams2.height = (((Utils.getScreenHeight() - Utils.getBarHeight()) - layoutParams.height) - iArr[1]) - ((int) ViewUtils.dp2px(this, 76.0f));
        this.G.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D(Parcelable parcelable) {
        return "data: " + parcelable.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E(List list) {
        return "notStandardMap size = " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F(List list) {
        return "needAttentionMap size = " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G(List list) {
        return "healthList size = " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        this.g.setVisibility(0);
        this.h.setAlpha(0.2f);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.n.setVisibility(8);
        this.H.onSharePrepared(v());
        this.i.setVisibility(0);
        this.j.setVisibility(0);
        this.g.setVisibility(4);
        this.n.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String I() {
        return "on start, data : " + this.u.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J(List list) {
        return "list size = " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K(List list) {
        return "scoreGrade =  , not_stand size = " + ((List) list.get(0)).size();
    }

    private void L(List<List<ScoreParamsObject>> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                final List<ScoreParamsObject> list2 = list.get(i);
                HMLog.debug(I, new Function0() { // from class: lf3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMShareBodyFatActivity.E(list2);
                    }
                });
                if (list2.size() == 0) {
                    this.x.setVisibility(8);
                    this.B.setVisibility(8);
                    new RelativeLayout.LayoutParams(-2, -2).addRule(3, R.id.need_attention_rl);
                } else {
                    this.x.setVisibility(0);
                    this.B.setVisibility(0);
                    this.x.setText(getResources().getQuantityString(R.plurals.bodyfat_3_not_up_to_standard, list2.size(), Integer.valueOf(list2.size())));
                    this.B.setAdapter((ListAdapter) new MyAdapter(this.a, list2));
                    setListViewHeightBasedOnChildren(this.B);
                }
            } else if (i == 1) {
                final List<ScoreParamsObject> list3 = list.get(i);
                HMLog.debug(I, new Function0() { // from class: mf3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMShareBodyFatActivity.F(list3);
                    }
                });
                if (list3.size() == 0) {
                    this.y.setVisibility(8);
                    this.A.setVisibility(8);
                } else {
                    this.y.setVisibility(0);
                    this.A.setVisibility(0);
                    this.y.setText(getResources().getQuantityString(R.plurals.bodyfat_3_need_attention, list3.size(), Integer.valueOf(list3.size())));
                    this.A.setAdapter((ListAdapter) new MyAdapter(this.a, list3));
                    setListViewHeightBasedOnChildren(this.A);
                }
            } else if (i == 2) {
                final List<ScoreParamsObject> list4 = list.get(i);
                HMLog.debug(I, new Function0() { // from class: tf3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMShareBodyFatActivity.G(list4);
                    }
                });
                if (list4.size() == 0) {
                    this.z.setVisibility(8);
                    this.C.setVisibility(8);
                } else {
                    this.z.setVisibility(0);
                    this.C.setVisibility(0);
                    if (list4.size() == 7) {
                        this.z.setText(R.string.bf3_all_standard);
                    } else {
                        this.z.setText(getResources().getQuantityString(R.plurals.bodyfat_3_health, list4.size(), Integer.valueOf(list4.size())));
                    }
                    this.C.setAdapter((ListAdapter) new MyAdapter(this.a, list4));
                    setListViewHeightBasedOnChildren(this.C);
                }
            }
        }
    }

    private void M(@ColorRes int background) {
        int color = ContextCompat.getColor(this, background);
        this.f.setBackgroundColor(color);
        ((RelativeLayout) findViewById(R.id.root_layout)).setBackgroundColor(color);
        ((RelativeLayout) findViewById(R.id.content_base)).setBackgroundColor(color);
    }

    private void N(UserInfos userInfos, long timestamp) {
        final List<List<ScoreParamsObject>> scoreShowInfos = BodyParamsUtils.getScoreShowInfos(this.a, userInfos, timestamp);
        String str = I;
        HMLog.debug(str, new Function0() { // from class: uf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMShareBodyFatActivity.J(scoreShowInfos);
            }
        });
        HMLog.debug(str, new Function0() { // from class: vf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMShareBodyFatActivity.K(scoreShowInfos);
            }
        });
        if (this.c) {
            this.w.setVisibility(8);
            this.D.setVisibility(0);
            u(scoreShowInfos);
        } else {
            this.w.setVisibility(0);
            this.D.setVisibility(8);
            L(scoreShowInfos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.g.setVisibility(8);
        this.i.setVisibility(0);
    }

    private void P(boolean isShow) {
        if (isShow) {
            this.m.setVisibility(4);
            if (!this.c) {
                this.p.setVisibility(0);
            }
            if (GlobalConfig.get().isBuildMidong()) {
                this.G.setVisibility(8);
            }
            this.v.setVisibility(0);
            this.f.postInvalidate();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.WEIGHT_HIDE_NUM).setValue("show"));
            return;
        }
        this.m.setVisibility(8);
        if (GlobalConfig.get().isBuildMidong()) {
            this.p.setVisibility(4);
            this.G.setVisibility(0);
        } else {
            this.p.setVisibility(8);
        }
        this.v.setVisibility(8);
        this.f.postInvalidate();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.WEIGHT_HIDE_NUM).setValue("hide"));
    }

    @SuppressLint({"SetTextI18n"})
    private void initView() {
        this.f = (ScrollView) findViewById(R.id.scroll_base);
        this.j = (Button) findViewById(R.id.back_button);
        findViewById(R.id.title_bar_back).setOnClickListener(new View.OnClickListener() { // from class: kf3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.A(view);
            }
        });
        this.g = findViewById(R.id.share_logo);
        this.h = (ImageView) findViewById(R.id.tv_logo);
        this.i = findViewById(R.id.share_pane_container);
        this.d = (ImageView) findViewById(R.id.share_icon);
        this.e = (TextView) findViewById(R.id.share_username);
        this.k = (TextView) findViewById(R.id.share_value_title);
        this.l = (TextView) findViewById(R.id.share_value_date);
        TextView textView = (TextView) findViewById(R.id.share_value_date_change);
        this.p = findViewById(R.id.share_detail_layout);
        if (this.c) {
            Object obj = this.u;
            if (obj instanceof ShareWeight) {
                ShareWeight shareWeight = (ShareWeight) obj;
                textView.setText(shareWeight.weightValue + shareWeight.a);
            }
            this.p.setVisibility(4);
        } else {
            textView.setText(this.F);
            this.p.setVisibility(0);
        }
        this.m = findViewById(R.id.share_divider_line);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.share_hidden_icon);
        this.n = toggleButton;
        toggleButton.setCompoundDrawables(ContextExtKt.loadDrawable(this.a, R.drawable.share_weight_icon_selector, R.color.s20, Integer.valueOf(Utils.dip2px(this, 20.0f))), null, null, null);
        this.n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: of3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.B(compoundButton, z);
            }
        });
        UnitTextView unitTextView = (UnitTextView) findViewById(R.id.unit_text);
        this.q = unitTextView;
        unitTextView.setCenterByFirst(true);
        this.r = (ShareItemView) findViewById(R.id.first_item);
        this.s = (ShareItemView) findViewById(R.id.second_item);
        this.t = (ShareItemView) findViewById(R.id.third_item);
        this.v = (RelativeLayout) findViewById(R.id.reach_goal_layout);
        this.w = (RelativeLayout) findViewById(R.id.part_rl);
        this.x = (TextView) findViewById(R.id.unreach_goal_title);
        this.y = (TextView) findViewById(R.id.focus_goal_title);
        this.z = (TextView) findViewById(R.id.reach_goal_title);
        this.A = (ListView) findViewById(R.id.focus_goal_list);
        this.B = (ListView) findViewById(R.id.unreach_goal_list);
        this.C = (ListView) findViewById(R.id.reach_goal_list);
        this.D = (RelativeLayout) findViewById(R.id.all_rl);
        this.E = (RecyclerView) findViewById(R.id.all_param_rv);
        int statusBarHeight = ViewUtils.getStatusBarHeight(this.a);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.title_bar_back);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.topMargin = statusBarHeight;
        frameLayout.setLayoutParams(layoutParams);
        this.G = findViewById(R.id.filler);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.weight_item);
        relativeLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nf3
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.C(relativeLayout, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public static void launch(Context context, int type, int source, final Parcelable data, long uid, long time, String change) {
        Intent intent = new Intent(context, (Class<?>) HMShareBodyFatActivity.class);
        intent.putExtra("type", type);
        intent.putExtra("source", source);
        intent.putExtra("data", data);
        intent.putExtra("uid", uid);
        intent.putExtra("time", time);
        intent.putExtra(P, change);
        HMLog.debug(I, new Function0() { // from class: qf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMShareBodyFatActivity.D(data);
            }
        });
        context.startActivity(intent);
    }

    private void q(ShareWeight info) {
        this.k.setText(info.b);
        this.l.setText(info.c);
        this.q.setValues(String.valueOf(info.g), "");
        t(info);
    }

    private void r() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        String avatarPath = hMPersonInfo.getUserInfo().getAvatarPath();
        String avatar = hMPersonInfo.getUserInfo().getAvatar();
        String nickname = hMPersonInfo.getUserInfo().getNickname();
        this.e.setText(nickname);
        AvatarManager.updateAvatarUI(this, this.d, avatarPath, avatar, nickname);
    }

    private void s(ShareWeight weight) {
        UserInfos userInfosLoad = HMDaoManager.getInstance().getDaoSession().getUserInfosDao().load("" + weight.userid);
        String avatarPath = userInfosLoad.getAvatarPath();
        String avatarUrl = userInfosLoad.getAvatarUrl();
        String name = userInfosLoad.getName();
        if (String.valueOf(-3L).equals(userInfosLoad.getUserId())) {
            this.e.setText(R.string.guest);
        } else {
            this.e.setText(name);
        }
        AvatarManager.updateAvatarUI(this, this.d, avatarPath, avatarUrl, name);
    }

    private void t(ShareWeight info) {
        if (!this.o) {
            this.o = true;
        }
        this.n.setVisibility(0);
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
        findViewById(R.id.weight_item).setVisibility(0);
        if (GlobalConfig.get().isBuildMidong()) {
            ((UnitTextView) findViewById(R.id.weight_item_value)).setValue(info.e);
            return;
        }
        TextView textView = (TextView) findViewById(R.id.weight_item_value);
        if (Language.isEnglish()) {
            textView.setTextSize(2, 16.0f);
        }
        textView.setText(info.e);
    }

    private void u(List<List<ScoreParamsObject>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<ScoreParamsObject>> it2 = list.iterator();
        while (it2.hasNext()) {
            for (ScoreParamsObject scoreParamsObject : it2.next()) {
                if (scoreParamsObject.getWfType() != 8 && scoreParamsObject.getWfType() != 9) {
                    arrayList.add(scoreParamsObject);
                }
            }
        }
        this.E.setLayoutManager(new LinearLayoutManager(this.a, 1, false));
        this.E.setAdapter(new ShareBodyFatAdapter(this.a, arrayList));
    }

    private ShareContent v() {
        final ShareContent shareContent = new ShareContent();
        shareContent.content = "";
        shareContent.title = getString(R.string.app_name);
        shareContent.topic = getString(R.string.share_topic);
        shareContent.bitmapUrl = captureViewShare(this.f, this);
        HMLog.debug(SportAnalytics.Params.VALUE_SHARE, new Function0() { // from class: rf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMShareBodyFatActivity.z(shareContent);
            }
        });
        return shareContent;
    }

    private void w() {
        this.g.setVisibility(0);
        this.i.setVisibility(8);
    }

    private void x() {
        if (findViewById(R.id.share_pane_container) == null) {
            return;
        }
        this.H = new SharePanel();
        Bundle bundle = new Bundle();
        if (RainbowUtils.isDarkMode(this)) {
            bundle.putInt(SharePanel.ARG_BG_COLOR, ContextCompat.getColor(this, R.color.s38));
        } else {
            bundle.putInt(SharePanel.ARG_BG_COLOR, ContextCompat.getColor(this, R.color.s4));
        }
        bundle.putBoolean("share_type", true);
        this.H.setArguments(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.share_pane_container, this.H);
        this.H.setShareListener(this);
        fragmentTransactionBeginTransaction.commit();
    }

    private boolean y(int age) {
        return age > 6 && age < 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z(ShareContent shareContent) {
        return "bitmapUrl = " + shareContent.bitmapUrl;
    }

    public String captureViewShare(ScrollView realView, Context context) throws Throwable {
        String absolutePath = FileUtils.getShareImagePath(context).getAbsolutePath();
        Bitmap bitmapByView = getBitmapByView(realView);
        boolean zSaveBitmapToFile = Utils.saveBitmapToFile(absolutePath, bitmapByView, 100);
        if (!bitmapByView.isRecycled()) {
            bitmapByView.recycle();
        }
        return zSaveBitmapToFile ? absolutePath : "";
    }

    public Bitmap getBitmapByView(ScrollView realView) {
        int height = 0;
        for (int i = 0; i < realView.getChildCount(); i++) {
            height += realView.getChildAt(i).getHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(realView.getWidth(), height, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        realView.draw(canvas);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_layout_body_fat);
        StatusBarUtil.setStatusColor(this, true, !RainbowUtils.isDarkMode(this), 0);
        this.b = getIntent().getIntExtra("type", 0);
        this.u = getIntent().getParcelableExtra("data");
        long longExtra = getIntent().getLongExtra("uid", 0L);
        long longExtra2 = getIntent().getLongExtra("time", 0L);
        this.F = getIntent().getStringExtra(P);
        UserInfos info = UserInfoManager.getManager().getInfo(longExtra);
        this.c = y(HMUserInfo.getAgeByDate(info.getBirthday()));
        initView();
        if (RainbowUtils.isDarkMode(this)) {
            findViewById(R.id.share_bar_bg).setVisibility(8);
            M(R.color.s10);
        } else {
            findViewById(R.id.share_bar_bg).setVisibility(0);
            M(R.color.s38);
        }
        x();
        N(info, longExtra2);
        SharePermissionManager.requestSharePermission(this, ShareType.BODY_FAT, new a());
    }

    @Override // com.huami.widget.share.PreShareListener
    public void onPreShare(int shareType) {
        runOnUiThread(new Runnable() { // from class: pf3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (SharePermissionManager.hasSharePermission(this)) {
            O();
        } else {
            w();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        HMLog.debug(I, new Function0() { // from class: sf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.I();
            }
        });
        if (this.b == 11) {
            Object obj = this.u;
            if (obj instanceof ShareWeight) {
                q((ShareWeight) obj);
                s((ShareWeight) this.u);
            }
        } else {
            r();
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SHARE_BODYFAT_VIEW_NUM));
    }

    public void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int measuredHeight = 0;
        for (int i = 0; i < adapter.getCount(); i++) {
            View view = adapter.getView(i, null, listView);
            view.measure(0, 0);
            measuredHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = measuredHeight + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
    }
}
