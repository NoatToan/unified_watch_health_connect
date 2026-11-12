package com.huawei.pluginachievement.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import com.huawei.pluginachievement.manager.model.CalorieExchange;
import com.huawei.pluginachievement.manager.model.GiftRecord;
import com.huawei.pluginachievement.manager.model.KakaCheckInReturnBody;
import com.huawei.pluginachievement.manager.model.KakaCheckinRecord;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.pluginachievement.ui.kakatask.AchieveKaKaTaskClickListener;
import com.huawei.pluginachievement.ui.kakatask.AchieveKaKaTaskRVAdapter;
import com.huawei.pluginachievement.ui.views.KakaCheckinView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.errortip.ErrorTipBar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.view.KakaClaimAnimation;
import defpackage.ddv;
import defpackage.lmf;
import defpackage.lsx;
import defpackage.njy;
import defpackage.oru;
import defpackage.osa;
import defpackage.osb;
import defpackage.osd;
import defpackage.osf;
import defpackage.osg;
import defpackage.otl;
import defpackage.otu;
import defpackage.oun;
import defpackage.out;
import defpackage.oxi;
import defpackage.oyp;
import defpackage.oyx;
import defpackage.ozs;
import defpackage.ozu;
import defpackage.pap;
import defpackage.paq;
import defpackage.pax;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class AchieveKaKaActivity extends BaseActivity implements View.OnClickListener, AchieveObserver, AchieveKaKaTaskClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AchieveKaKaTaskRVAdapter f22040a;
    private H5ProWebView aa;
    private Handler ab;
    private CustomTitleBar ac;
    private HealthSwitchButton ae;
    private HealthTextView ag;
    private oyp ah;
    private LinearLayout ai;
    private KakaCheckinView aj;
    private LinearLayout ak;
    private HealthTextView al;
    private LinearLayout am;
    private KakaClaimAnimation an;
    private RelativeLayout ao;
    private ViewFlipper ap;
    private LinearLayout aq;
    private LinearLayout ar;
    private LinearLayout as;
    private ErrorTipBar at;
    private LinearLayout av;
    private LinearLayout aw;
    private int ax;
    private otl ay;
    private long az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f22041b;
    private HealthScrollView bb;
    private LinearLayoutManager bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f22042c;
    private ImageView d;
    private HealthButton e;
    private HealthTextView f;
    private LinearLayout g;
    private KakaCheckInReturnBody i;
    private HealthTextView j;
    private LinearLayout k;
    private HealthTextView l;
    private int m;
    private Context n;
    private int p;
    private int q;
    private int r;
    private HealthTextView s;
    private ThreadPoolManager u;
    private LinearLayout w;
    private LinearLayout x;
    private LinearLayout y;
    private NoTitleCustomAlertDialog t = null;
    private boolean h = false;
    private ArrayList<ozs> be = new ArrayList<>(0);
    private ArrayList<ozs> ba = new ArrayList<>(0);
    private boolean v = false;
    private boolean ad = false;
    private boolean z = true;
    private Queue<GiftRecord> au = new LinkedList();
    private boolean af = true;
    private int o = 0;

    /* JADX INFO: loaded from: classes13.dex */
    static class b extends BaseHandler<AchieveKaKaActivity> {
        b(AchieveKaKaActivity achieveKaKaActivity) {
            super(achieveKaKaActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchieveKaKaActivity achieveKaKaActivity, Message message) {
            int i = message.what;
            if (i == 0) {
                achieveKaKaActivity.a(message.obj);
                achieveKaKaActivity.ai();
                return;
            }
            if (i == 5) {
                achieveKaKaActivity.c(message.obj + "");
                achieveKaKaActivity.d();
                return;
            }
            if (i == 11) {
                achieveKaKaActivity.f();
                return;
            }
            if (i == 1101) {
                achieveKaKaActivity.d();
                return;
            }
            if (i == 1104) {
                achieveKaKaActivity.e(((Integer) message.obj).intValue());
                return;
            }
            if (i == 27) {
                achieveKaKaActivity.z();
                return;
            }
            if (i == 28) {
                achieveKaKaActivity.a(message.obj);
                return;
            }
            if (i == 5005) {
                achieveKaKaActivity.ba = achieveKaKaActivity.f22040a.b(achieveKaKaActivity.be, achieveKaKaActivity.ax, achieveKaKaActivity.r);
                return;
            }
            if (i == 5006) {
                achieveKaKaActivity.aa();
                return;
            }
            switch (i) {
                case 1000:
                    achieveKaKaActivity.c(message.obj + "");
                    LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "ERROR_TIP :", message.obj);
                    break;
                case 1001:
                    achieveKaKaActivity.f(((Integer) message.obj).intValue());
                    break;
                case 1002:
                    if (message.obj instanceof Boolean) {
                        achieveKaKaActivity.b(((Boolean) message.obj).booleanValue());
                    }
                    break;
                default:
                    b(achieveKaKaActivity, message);
                    break;
            }
        }

        private void b(AchieveKaKaActivity achieveKaKaActivity, Message message) {
            int i = message.what;
            if (i != 11204) {
                switch (i) {
                    case 1106:
                        achieveKaKaActivity.ab.removeMessages(1106);
                        achieveKaKaActivity.ab.sendEmptyMessageDelayed(1106, 1000L);
                        break;
                    case ExceptionCode.CREATE_DOWNLOAD_FILE_FAILED /* 1107 */:
                        achieveKaKaActivity.aj();
                        break;
                    case 1108:
                        achieveKaKaActivity.ah.a((Activity) achieveKaKaActivity);
                        break;
                    default:
                        switch (i) {
                            case 11200:
                                if (message.obj instanceof KakaCheckInReturnBody) {
                                    achieveKaKaActivity.c((KakaCheckInReturnBody) message.obj);
                                }
                                break;
                            case 11201:
                                if (message.obj instanceof List) {
                                    achieveKaKaActivity.e((List<KakaCheckinRecord>) message.obj);
                                }
                                break;
                            case MLAsrConstants.ERR_NO_NETWORK /* 11202 */:
                                LogUtil.d("PLGACHIEVE_AchieveKaKaActivity", "updateGiftsView gift list.");
                                break;
                            default:
                                LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "handlerCheckInMsg message = ", Integer.valueOf(message.what));
                                break;
                        }
                        break;
                }
                return;
            }
            achieveKaKaActivity.b(message.obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            c(R.string.IDS_hwh_home_healthshop_unable_connect_server_tips);
        } else {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        if (this.p > 0) {
            this.ak.setVisibility(0);
            this.al.setText(this.n.getString(R.string.IDS_achievement_kk_delay_kaka, String.valueOf(this.p)));
            pap.e(0, 0);
            return;
        }
        this.ak.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "mCurrentKaka:", String.valueOf(obj));
        if (obj instanceof String) {
            String str = (String) obj;
            this.q = CommonUtil.j(str);
            this.s.setText(UnitUtil.e(CommonUtil.a(str), 1, 0));
        }
    }

    private void n() {
        if (otu.d(500)) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "goToLuck enter isFastClick!");
            return;
        }
        if (CommonUtil.ca()) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "isStoreDemoVersion true");
            return;
        }
        if (!osb.c(this.n)) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "showNetworkErrorDialog kakaConvert");
            e(1001, Integer.valueOf(R.string.IDS_hwh_home_group_network_disconnection));
        } else {
            b(8);
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "goToLuck enter");
            this.ah.a(this.n);
            pap.e(1, 0, this.q);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.transparent));
        setContentView(R.layout.achieve_kaka);
        ab();
        clearBackgroundDrawable();
        this.ab = new b(this);
        this.n = this;
        this.u = ThreadPoolManager.c();
        this.ah = new oyp(this.n, this.ab);
        s();
        p();
        ah();
        ac();
        g();
        this.ah.d();
        ad();
    }

    private void ab() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "isFromNotification getIntent is null");
        } else if (intent.getBooleanExtra(KakaConstants.KAKA_FROM_NOTIFICATION_KEY, false)) {
            HashMap map = new HashMap(2);
            map.put("from", "3");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_KAKA_1100007.value(), map, 0);
        }
    }

    private void p() {
        Typeface.create(Constants.FONT, 0);
        this.s = (HealthTextView) findViewById(R.id.cur_kaka_value);
        this.ao = (RelativeLayout) findViewById(R.id.kaka_text_layout);
        this.al = (HealthTextView) findViewById(R.id.kaka_delay_text);
        this.ak = (LinearLayout) findViewById(R.id.kaka_delay_layout);
        HealthScrollView healthScrollView = (HealthScrollView) findViewById(R.id.my_kaka_scrollview);
        this.bb = healthScrollView;
        healthScrollView.setScrollViewVerticalDirectionEvent(true);
        ScrollUtil.a(this.bb, getWindow().getDecorView(), 3032);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.kaka_lot_layout);
        linearLayout.setOnClickListener(this);
        findViewById(R.id.kaka_exchange_layout).setOnClickListener(this);
        this.ao.setOnClickListener(this);
        this.s.setTypeface(Typeface.createFromAsset(this.n.getAssets(), "font/HarmonyOS_Sans_Black_Italic.ttf"));
        this.s.setOnClickListener(this);
        this.g = (LinearLayout) findViewById(R.id.center_card_layout);
        this.am = (LinearLayout) findViewById(R.id.kaka_main_layout);
        af();
        this.ai = (LinearLayout) findViewById(R.id.kaka_checkin);
        this.y = (LinearLayout) findViewById(R.id.gifts_layout);
        if (CommonUtil.ca() || LoginInit.getInstance(this.n).isKidAccount()) {
            linearLayout.setVisibility(8);
        }
        this.f22042c = (HealthRecycleView) out.d(this, R.id.achieve_task_kaka_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        this.bc = linearLayoutManager;
        this.f22042c.setLayoutManager(linearLayoutManager);
        this.f22042c.setIsScroll(false);
        AchieveKaKaTaskRVAdapter achieveKaKaTaskRVAdapter = new AchieveKaKaTaskRVAdapter(this, this.be);
        this.f22040a = achieveKaKaTaskRVAdapter;
        achieveKaKaTaskRVAdapter.d(this);
        this.f22042c.setAdapter(this.f22040a);
        r();
        this.at = (ErrorTipBar) findViewById(R.id.network_error_bar);
        b(8);
        u();
    }

    private void b(int i) {
        this.at.setVisibility(i);
        if (this.am == null) {
            this.am = (LinearLayout) findViewById(R.id.kaka_main_layout);
        }
        ViewGroup.LayoutParams layoutParams = this.am.getLayoutParams();
        int iS = qrs.s(this.n) + qrs.d(this.n, 56.0f);
        if (i == 0) {
            iS += qrs.d(this.n, 48.0f);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int i2 = this.m;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i2, iS, i2, 0);
        }
        this.am.setLayoutParams(layoutParams);
    }

    private void r() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.kaka_titlebar);
        this.ac = customTitleBar;
        customTitleBar.setRightButtonVisibility(0);
        this.ac.setRightButtonDrawable(ContextCompat.getDrawable(this.n, R.mipmap.achieve_kaka_rule), qre.f(R.string.IDS_plugin_achievement_kk_kaka_rule));
        this.ac.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName(AchieveKaKaActivity.this.n, PersonalData.CLASS_NAME_PERSONAL_KAKA_DETAIL);
                Bundle bundle = new Bundle();
                bundle.putString(RemoteMessageConst.Notification.TAG, "rule");
                intent.putExtra(RemoteMessageConst.Notification.TAG, bundle);
                intent.putExtra("totalNum", AchieveKaKaActivity.this.q);
                lsx.c(intent, AchieveKaKaActivity.this.n);
            }
        });
        this.ac.setTitleText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_kk_mykaka));
        this.ac.setTitleTextColor(ContextCompat.getColor(this.n, R.color.emui_color_text_primary_translucent));
        this.ac.setLeftButtonDrawable(ContextCompat.getDrawable(this.n, R.mipmap.achieve_kaka_back), qre.f(R.string.IDS_apphelp_pwindows_back_button));
        this.ac.setRightSoftkeyVisibility(0);
        this.ac.setRightSoftkeyBackground(ContextCompat.getDrawable(this.n, R.mipmap.achieve_kaka_gift), qre.f(R.string.IDS_my_award_my_award));
        this.ac.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!otu.d(500)) {
                    AchieveKaKaActivity.this.ah.b();
                } else {
                    LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "openMyAwardPage enter isFastClick!");
                }
            }
        });
        this.ac.setTitleBarBackgroundColor(ContextCompat.getColor(this.n, R.color.transparent));
        if (CommonUtil.bd()) {
            return;
        }
        this.ac.setRightThirdKeyVisibility(0);
        this.ac.setRightThirdKeyBackground(ContextCompat.getDrawable(this.n, R.mipmap.kaka_v), qre.f(R.string.IDS_plugin_achievement_kaka_exchange_points));
        this.ac.setRightThirdKeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!osb.c(AchieveKaKaActivity.this.n)) {
                    AchieveKaKaActivity.this.e(1001, Integer.valueOf(R.string.IDS_hwh_home_group_network_disconnection));
                } else {
                    AchieveKaKaActivity.this.l();
                }
            }
        });
    }

    private void s() {
        this.ag = (HealthTextView) findViewById(R.id.kaka_checkin_days);
        this.ae = (HealthSwitchButton) findViewById(R.id.kaka_checkin_reminder_switch);
        this.aj = (KakaCheckinView) findViewById(R.id.kaka_checkin_layout);
        this.w = (LinearLayout) findViewById(R.id.kaka_to_prizes_more);
        this.x = (LinearLayout) findViewById(R.id.gift_layout);
        this.aw = (LinearLayout) findViewById(R.id.no_gift_layout);
        this.ap = (ViewFlipper) findViewById(R.id.message_layout);
        this.aq = (LinearLayout) View.inflate(this.n, R.layout.achieve_kaka_msg_item, null);
        this.as = (LinearLayout) View.inflate(this.n, R.layout.achieve_kaka_msg_item, null);
        this.ap.addView(this.aq);
        this.ap.addView(this.as);
        this.av = this.aq;
        this.w.setOnClickListener(this);
        this.ah.b(this.ae);
    }

    private int i() {
        int[] iArr = new int[2];
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            linearLayout.getLocationOnScreen(iArr);
        }
        return iArr[1];
    }

    private void x() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.kaka_checkin_success_dialog);
        if (viewStub == null) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "initCheckInSeccessLayout ViewStub is loaded fail.");
            return;
        }
        this.k = (LinearLayout) viewStub.inflate();
        this.j = (HealthTextView) findViewById(R.id.kaka_checkin_result_add);
        this.l = (HealthTextView) findViewById(R.id.kaka_checkin_result_days);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.close_dialog_btn);
        this.f = healthTextView;
        healthTextView.setOnClickListener(this);
    }

    private void y() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.achieve_kk_task_reload_layout);
        if (viewStub == null) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "initNetworkReloadLayout ViewStub is loaded fail.");
            return;
        }
        this.f22041b = (RelativeLayout) viewStub.inflate();
        ImageView imageView = (ImageView) out.d(this, R.id.achieve_kk_task_img_no_net_work);
        this.d = imageView;
        imageView.setOnClickListener(this);
        HealthButton healthButton = (HealthButton) out.d(this, R.id.btn_no_net_work);
        this.e = healthButton;
        healthButton.setOnClickListener(this);
    }

    private void w() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.kaka_convert_anim_layout);
        if (viewStub == null) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "initConvertAnimLayout ViewStub is loaded fail.");
        } else {
            this.an = (KakaClaimAnimation) viewStub.inflate();
        }
    }

    private void u() {
        ImageView imageView = (ImageView) findViewById(R.id.top_bg_view);
        if (qqs.e(this.n)) {
            imageView.setImageAlpha(200);
        }
        if (qrs.af(this.n)) {
            int i = qrs.i(this) + qrs.d((Context) this, 30.0f);
            int i2 = (qrs.i(this) * 924) / 1080;
            Bitmap bitmapC = qqf.c(qqf.a(ResourcesCompat.getDrawable(getResources(), R.mipmap.kaka_main_bg, null)), i, i2);
            int iMin = Math.min(qrs.i(this), bitmapC.getWidth());
            imageView.setImageBitmap(qqf.c(bitmapC, iMin, Math.min(i2, (iMin * i2) / i), 2));
        }
    }

    private void ac() {
        if (LanguageUtil.ba(this.n)) {
            this.aq.findViewById(R.id.kaka_message_icon).setBackground(qqz.e(this.n, R.mipmap.achieve_kaka_tips));
            this.as.findViewById(R.id.kaka_message_icon).setBackground(qqz.e(this.n, R.mipmap.achieve_kaka_tips));
            ((ImageView) findViewById(R.id.kaka_gift_more)).setImageDrawable(qqz.e(this.n, R.mipmap.achieve_kaka_more));
            this.ac.setLeftButtonDrawable(ContextCompat.getDrawable(this.n, R.drawable.ic_back_white_reverse), qre.f(R.string.accessibility_go_back));
            return;
        }
        this.ac.setLeftButtonDrawable(ContextCompat.getDrawable(this.n, R.drawable.ic_back_white), qre.f(R.string.accessibility_go_back));
    }

    private void af() {
        LinearLayout linearLayout = this.am;
        if (linearLayout == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "setCenterCardLayout() mCenterCardLayout is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        int iC = 0;
        if (qrs.af(this.n)) {
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.n, 0);
            iC = (int) (healthColumnSystem.c() + healthColumnSystem.f() + healthColumnSystem.b());
        }
        if (layoutParams2 != null) {
            this.m = iC;
            layoutParams2.leftMargin = iC;
            layoutParams2.rightMargin = iC;
            layoutParams2.topMargin = qrs.s(this.n) + qrs.d(this.n, 56.0f);
            this.am.setLayoutParams(layoutParams2);
        }
    }

    private void ah() {
        final float f = qqs.e(BaseApplication.getContext()) ? 0.8f : 1.0f;
        this.bb.setScrollViewListener(new ScrollViewListener() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.6
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
                AchieveKaKaActivity.this.c(healthScrollView);
                if (i2 <= 0) {
                    CustomTitleBar customTitleBar = AchieveKaKaActivity.this.ac;
                    float f2 = f;
                    customTitleBar.setBackgroundColor(Color.argb(0, (int) (255.0f * f2), (int) (159.0f * f2), (int) (f2 * 75.0f)));
                } else if (i2 <= 0 || i2 > 100) {
                    CustomTitleBar customTitleBar2 = AchieveKaKaActivity.this.ac;
                    float f3 = f;
                    customTitleBar2.setBackgroundColor(Color.argb(255, (int) (255.0f * f3), (int) (159.0f * f3), (int) (f3 * 75.0f)));
                } else {
                    CustomTitleBar customTitleBar3 = AchieveKaKaActivity.this.ac;
                    float f4 = f;
                    customTitleBar3.setBackgroundColor(Color.argb((int) ((i2 / 100.0f) * 255.0f), (int) (255.0f * f4), (int) (159.0f * f4), (int) (f4 * 75.0f)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthScrollView healthScrollView) {
        if (healthScrollView.getChildAt(healthScrollView.getChildCount() - 1).getBottom() - (healthScrollView.getHeight() + healthScrollView.getScrollY()) != 0 || otu.d(1000)) {
            return;
        }
        pap.e(10, 0, this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        String strE = osa.e(this.n, "kakaCheckedDays");
        d(TextUtils.isEmpty(strE) ? 0 : Integer.parseInt(strE));
        boolean zA = osb.a(osa.e(this.n, "kakaLastCheckInTime"));
        this.af = !zA;
        if (!zA || "".equals(j())) {
            this.ah.c();
        } else {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "today has checked in");
        }
    }

    private String j() {
        return osa.e(this.n, "kakaLastCheckInTime");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.ah == null) {
            this.ah = new oyp(this.n, this.ab);
        }
        if (this.u == null) {
            this.u = ThreadPoolManager.c();
        }
        this.u.execute(new Runnable() { // from class: oxh
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        });
        b(8);
        if (!osb.c(this)) {
            ae();
        } else {
            q();
            v();
            otu.b(this.n).g();
            this.ah.a();
            this.u.execute(new Runnable() { // from class: oxk
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a();
                }
            });
        }
        if (CommonUtil.ca()) {
            RelativeLayout relativeLayout = this.f22041b;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            this.f22042c.setVisibility(8);
        }
    }

    public /* synthetic */ void b() {
        ak();
        al();
        if (this.z) {
            m();
            this.z = false;
        }
    }

    public /* synthetic */ void a() {
        c();
        h();
        f();
    }

    private void al() {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            return;
        }
        marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(this.n).setPageId(290).build());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.ab.removeMessages(1106);
        this.ab.removeMessages(ExceptionCode.CREATE_DOWNLOAD_FILE_FAILED);
        this.au.clear();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "onConfigurationChanged enter");
        af();
    }

    private void ae() {
        if (this.f22041b == null) {
            y();
        }
        RelativeLayout relativeLayout = this.f22041b;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.ai.setVisibility(8);
        this.y.setVisibility(8);
        this.ap.setVisibility(8);
        this.f22042c.setVisibility(8);
    }

    private void q() {
        RelativeLayout relativeLayout = this.f22041b;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        this.ai.setVisibility(0);
        this.f22042c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "freshKakaTask");
        HashMap map = new HashMap(2);
        map.put(ParsedFieldTag.KAKA_TASK_SCENARIO, String.valueOf(0));
        otl otlVar = this.ay;
        if (otlVar != null) {
            List<osf> listD = otlVar.d(12, map);
            if (listD == null) {
                LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "freshKakaTask kakas == null");
                e(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, (Object) null);
                return;
            }
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "freshKakaTask kakas size = ", Integer.valueOf(listD.size()));
            ArrayList arrayList = new ArrayList(listD.size());
            osg osgVar = null;
            boolean z = true;
            for (osf osfVar : listD) {
                if (osfVar instanceof osg) {
                    osg osgVar2 = (osg) osfVar;
                    int iA = qrs.a(osgVar2.t());
                    if (osgVar2.ai() == 10004 && iA < 1) {
                        z = false;
                    }
                    if (osgVar2.ai() == 30008) {
                        osgVar = osgVar2;
                    } else if (osgVar2.ai() == 20007) {
                        otu.b(BaseApplication.getContext()).e(osgVar2);
                    } else {
                        LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "unknown task rule");
                    }
                    arrayList.add(osgVar2);
                }
            }
            if (!z) {
                LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "freshKakaTask: isFirstBindFinished = false");
                osa.b(this.n, "isFirstBindDeviceFinishedV2", "");
                if (osgVar != null) {
                    LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "freshKakaTask: remove normalBindTask");
                    arrayList.remove(osgVar);
                }
            }
            this.be = oyx.b(arrayList);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "mService is null");
        }
        e(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, (Object) null);
    }

    private void g() {
        this.ay = otl.b(getApplicationContext());
        otu.b(this.n).c();
        this.v = true;
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "getData()");
        this.ay.c((AchieveObserver) this);
        this.u.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.9
            @Override // java.lang.Runnable
            public void run() {
                if (AchieveKaKaActivity.this.ay != null) {
                    osf osfVarB = AchieveKaKaActivity.this.ay.b(5, new HashMap(2));
                    if (osfVarB instanceof AchieveInfo) {
                        AchieveInfo achieveInfo = (AchieveInfo) osfVarB;
                        AchieveKaKaActivity.this.az = achieveInfo.getSyncTimestamp();
                        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "getData mSyncTimestamp=", Long.valueOf(AchieveKaKaActivity.this.az));
                        AchieveKaKaActivity.this.e(0, String.valueOf(achieveInfo.getUserPoint()));
                    }
                }
                pap.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void e(int i, T t) {
        Handler handler = this.ab;
        if (handler == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "sendHandlerMessage handler is null!");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = t;
        handler.sendMessage(messageObtain);
    }

    private void m() {
        if (CommonUtil.ca()) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "gotoCalorieExchange isStoreDemoVersion calorie_not_enough.");
            return;
        }
        if (!osb.c(this.n)) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert Network is available");
            return;
        }
        int iK = k();
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert kakaValue ", Integer.valueOf(iK));
        if (iK >= 10) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert Today convert max!");
        } else {
            a(iK);
            pap.e(0, 0, o());
        }
    }

    private int o() {
        int i = this.q;
        if (i != 0) {
            return i;
        }
        String strE = osa.e(BaseApplication.getContext(), "_personalCenterStatus");
        if (!TextUtils.isEmpty(strE)) {
            ArrayList<String> arrayListC = paq.c(strE);
            if (arrayListC.size() > 0) {
                int iD = oun.d(arrayListC.get(0));
                LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "getPersonalTotalKaka num = ", Integer.valueOf(iD));
                return iD;
            }
        }
        return this.q;
    }

    private int k() {
        String strE = osa.e(this.n, "_achieve_exchange_datastr");
        if (!String.valueOf(new Timestamp(System.currentTimeMillis())).substring(0, 10).equals(strE)) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert dataStr is kua tian. ", strE);
            return 0;
        }
        return oxi.a(osa.e(this.n, "_achieve_exchange_num"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (qrs.r()) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.n, PersonalData.CLASS_NAME_PERSONAL_KAKA_EXCHANGE_POINT);
        this.n.startActivity(intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (R.id.kaka_lot_layout == id) {
            n();
            return;
        }
        if (R.id.achieve_kk_task_img_no_net_work == id) {
            ag();
            return;
        }
        if (R.id.btn_no_net_work == id) {
            CommonUtil.t(this.n);
            return;
        }
        if (R.id.kaka_text_layout == id || R.id.cur_kaka_value == id) {
            Intent intent = new Intent();
            intent.setClassName(this.n, PersonalData.CLASS_NAME_PERSONAL_KAKA_DETAIL);
            Bundle bundle = new Bundle();
            bundle.putString(RemoteMessageConst.Notification.TAG, JsbMapKeyNames.H5_TEXT_DETAIL);
            intent.putExtra(RemoteMessageConst.Notification.TAG, bundle);
            intent.putExtra("from", 0);
            intent.putExtra("totalNum", this.q);
            lsx.c(intent, this.n);
            return;
        }
        if (R.id.kaka_exchange_layout == id) {
            if (this.ar == null) {
                this.ar = (LinearLayout) findViewById(R.id.achieve_kaka_mall);
            }
            int[] iArr = new int[2];
            this.ar.getLocationOnScreen(iArr);
            int i = i();
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", String.format("kaka scrollToH5Mall: %s, %s", Integer.valueOf(iArr[1]), Integer.valueOf(i)));
            this.bb.smoothScrollTo(0, iArr[1] - i);
            pap.e(8, 0, this.q);
            return;
        }
        if (R.id.close_dialog_btn == id) {
            this.k.setVisibility(8);
            KakaCheckInReturnBody kakaCheckInReturnBody = this.i;
            if (kakaCheckInReturnBody != null && this.q < kakaCheckInReturnBody.getKakaSum()) {
                e(this.q, this.i.getKakaSum());
            }
            this.af = false;
            this.ah.a(this.ae);
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "onClick id:", Integer.valueOf(id));
    }

    private void ag() {
        if (osb.c(this)) {
            q();
            if (this.u == null) {
                this.u = ThreadPoolManager.c();
            }
            this.u.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.10
                @Override // java.lang.Runnable
                public void run() {
                    AchieveKaKaActivity.this.f();
                    AchieveKaKaActivity.this.h();
                    AchieveKaKaActivity.this.v();
                    if (!AchieveKaKaActivity.this.af) {
                        AchieveKaKaActivity.this.ah.d();
                    }
                    AchieveKaKaActivity.this.ah.a();
                }
            });
        }
    }

    private void a(int i) {
        PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(this.n).getAdapter();
        if (pluginAchieveAdapterJ != null) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "enter kakaConvert");
            pluginAchieveAdapterJ.getTotalCalorie(new c(i), this.n);
        }
        e();
    }

    /* JADX INFO: loaded from: classes13.dex */
    static class c implements AchieveCallback {
        private int e;

        c(int i) {
            this.e = i;
        }

        @Override // com.huawei.pluginachievement.impl.AchieveCallback
        public void onResponse(int i, Object obj) {
            if (obj == null) {
                LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert called by counterpartAdapter,but obj == null!");
                return;
            }
            int iS = pax.s(String.valueOf(obj));
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert curCalorie ", Integer.valueOf(iS));
            e(iS, this.e);
        }

        private void e(int i, int i2) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert()");
            HashMap map = new HashMap(2);
            int iA = a(i);
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert CalorieCard ", Integer.valueOf(iA), " kakaValue ", Integer.valueOf(i2));
            if ((iA / 1000) / 50 <= i2) {
                LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert not enough");
                return;
            }
            String strValueOf = String.valueOf(iA);
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert strCalorieValue ", strValueOf);
            map.put("calorie", strValueOf);
            otl.b(BaseApplication.getContext()).a(5, map);
        }

        private int a(int i) {
            return ((i + 500) / 1000) * 1000;
        }
    }

    private void e() {
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "enter kakaMsgId");
        PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(this.n).getAdapter();
        if (pluginAchieveAdapterJ != null) {
            String strE = osa.e(this, "_achieve_msg_id_kaka");
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "deleteMessage kakaMsgId=", strE);
            pluginAchieveAdapterJ.deleteMessage(strE);
            d("_achieve_flag", "flag");
            d("_achieve_calorie", (String) null);
            d("_achieve_msg_id_kaka", (String) null);
        }
    }

    private void d(String str, String str2) {
        osa.b(this.n, str, str2);
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "onDataChanged error=", Integer.valueOf(i));
        if (i == -1) {
            if (userAchieveWrapper != null && userAchieveWrapper.getContentType() == 12) {
                this.ad = true;
            }
            if (CommonUtil.ca() || !pap.b(userAchieveWrapper)) {
                return;
            }
            e(1002, true);
            return;
        }
        e(1002, false);
        this.ad = false;
        if (userAchieveWrapper == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "onDataChanged resultCode=", userAchieveWrapper.getResultCode(), " type= ", Integer.valueOf(userAchieveWrapper.getContentType()));
        if (!"0".equals(userAchieveWrapper.getResultCode())) {
            a(userAchieveWrapper);
            return;
        }
        if (userAchieveWrapper.getContentType() == 5) {
            d(userAchieveWrapper);
            return;
        }
        if (userAchieveWrapper.getContentType() == 0) {
            AchieveInfo achieveInfo = userAchieveWrapper.getAchieveInfo();
            if (achieveInfo != null) {
                this.az = achieveInfo.getSyncTimestamp();
                this.p = achieveInfo.getExpirationKaka();
                e(0, String.valueOf(achieveInfo.getUserPoint()));
                return;
            }
            return;
        }
        if (userAchieveWrapper.getContentType() == 12) {
            e(userAchieveWrapper);
            return;
        }
        if (userAchieveWrapper.getContentType() == 11) {
            e(11, (Object) null);
            otl otlVar = this.ay;
            if (otlVar == null || !this.v) {
                return;
            }
            this.v = false;
            otlVar.b((CountDownLatch) null);
            this.ay.e((CountDownLatch) null);
            return;
        }
        if (userAchieveWrapper.getContentType() == 27) {
            e(27, (Object) null);
        } else if (userAchieveWrapper.getContentType() == 28) {
            e(28, String.valueOf(i));
        } else {
            LogUtil.d("PLGACHIEVE_AchieveKaKaActivity", "onDataChanged content type:", Integer.valueOf(userAchieveWrapper.getContentType()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    private void a(UserAchieveWrapper userAchieveWrapper) {
        String string;
        String resultCode = userAchieveWrapper.getResultCode();
        resultCode.hashCode();
        switch (resultCode) {
            case "12030036":
                string = getString(R.string.IDS_plugin_achievement_code_vip_fail);
                break;
            case "1003":
                e(1108, "");
                string = null;
                break;
            case "10001":
                string = getString(R.string.IDS_plugin_achievement_code_unknown_error);
                break;
            case "10005":
                string = getString(R.string.IDS_plugin_achievement_code_auth_fail);
                break;
            case "10014":
                c(userAchieveWrapper);
                string = null;
                break;
            case "50002":
                string = getString(R.string.IDS_plugin_achievement_code_kaka_not_enough);
                break;
            case "50003":
                string = getString(R.string.IDS_plugin_achievement_code_not_sync);
                break;
            case "50010":
                LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "dealKakaExchangeError CODE_CALORIE_NOT_ENOUGH msg: ", resultCode);
                string = null;
                break;
            case "50011":
                an();
                string = getString(R.string.IDS_plugin_achievement_code_exchange_upper_limit);
                break;
            case "50012":
                string = getString(R.string.IDS_plugin_achievement_code_calorie_user_not_exsist);
                break;
            default:
                LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "unknow error:", resultCode);
                string = null;
                break;
        }
        if (string != null && userAchieveWrapper.getContentType() != 10) {
            e(1000, string);
        }
        if (userAchieveWrapper.getContentType() == 5) {
            e(1101, (Object) null);
        }
    }

    private void d(UserAchieveWrapper userAchieveWrapper) {
        CalorieExchange exchange = userAchieveWrapper.getExchange();
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert cloud exchangeKaka.");
        if (exchange != null) {
            e(5, getResources().getQuantityString(R.plurals.IDS_plugin_achievement_kk_convert_tip, exchange.getExchangeKakaNum(), Integer.valueOf(exchange.getExchangeKakaNum())));
            if (!this.af) {
                e(ExceptionCode.CHECK_FILE_HASH_FAILED, Integer.valueOf(exchange.getExchangeKakaNum()));
            }
            String strE = osa.e(this, "_achieve_exchange_datastr");
            String strSubstring = String.valueOf(new Timestamp(System.currentTimeMillis())).substring(0, 10);
            int exchangeKakaNum = exchange.getExchangeKakaNum();
            if (strSubstring.equals(strE)) {
                String strE2 = osa.e(this, "_achieve_exchange_num");
                int iA = (TextUtils.isEmpty(strE2) ? 0 : oxi.a(strE2)) + exchangeKakaNum;
                LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert cloud exchange sum =", Integer.valueOf(iA));
                d("_achieve_exchange_num", String.valueOf(iA));
                return;
            }
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kakaConvert cloud new exchange =", Integer.valueOf(exchangeKakaNum));
            d("_achieve_exchange_datastr", strSubstring);
            d("_achieve_exchange_num", String.valueOf(exchangeKakaNum));
        }
    }

    private void an() {
        d("_achieve_exchange_datastr", String.valueOf(new Timestamp(System.currentTimeMillis())).substring(0, 10));
        d("_achieve_exchange_num", String.valueOf(10));
    }

    private void e(UserAchieveWrapper userAchieveWrapper) {
        final osd osdVarAcquireKakaUpdateReturnBody = userAchieveWrapper.acquireKakaUpdateReturnBody();
        if (osdVarAcquireKakaUpdateReturnBody != null) {
            int iD = osdVarAcquireKakaUpdateReturnBody.d();
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "onDataChange UPDATE_TASK_STATUS RewardKaka=", Integer.valueOf(iD));
            if (iD > 0) {
                e(ExceptionCode.CHECK_FILE_HASH_FAILED, Integer.valueOf(iD));
                final int iB = osdVarAcquireKakaUpdateReturnBody.b();
                e(0, String.valueOf(iB));
                this.u.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.7
                    @Override // java.lang.Runnable
                    public void run() {
                        String strC = osdVarAcquireKakaUpdateReturnBody.c();
                        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "onDataChange UPDATE_TASK_STATUS taskIdTemp =", strC);
                        HashMap map = new HashMap(2);
                        map.put("taskId", strC);
                        osf osfVarB = otl.b(AchieveKaKaActivity.this.n.getApplicationContext()).b(12, map);
                        if (osfVarB instanceof osg) {
                            osg osgVar = (osg) osfVarB;
                            osgVar.i(0);
                            otu.b(AchieveKaKaActivity.this.n).a(osgVar, 2);
                            AchieveKaKaActivity.this.f();
                            otu.b(AchieveKaKaActivity.this.n.getApplicationContext()).b(iB);
                            if (osgVar.ai() == 30008) {
                                AchieveKaKaActivity.this.h();
                            }
                        }
                    }
                });
                return;
            }
            f();
        }
    }

    private void c(final UserAchieveWrapper userAchieveWrapper) {
        if (this.h) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.8
            @Override // java.lang.Runnable
            public void run() {
                AchieveKaKaActivity.this.b(userAchieveWrapper);
                AchieveKaKaActivity.this.h();
                AchieveKaKaActivity.this.h = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(UserAchieveWrapper userAchieveWrapper) {
        osd osdVarAcquireKakaUpdateReturnBody = userAchieveWrapper.acquireKakaUpdateReturnBody();
        if (osdVarAcquireKakaUpdateReturnBody != null) {
            String strC = osdVarAcquireKakaUpdateReturnBody.c();
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "retryToUpload=", strC);
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            HashMap map = new HashMap(2);
            map.put("taskId", strC);
            osf osfVarB = otl.b(this.n.getApplicationContext()).b(12, map);
            osg osgVar = osfVarB instanceof osg ? (osg) osfVarB : null;
            if (osgVar == null) {
                LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "retryToUpload kakaTaskInfo is null");
            } else if (osgVar.ai() == 30008) {
                LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "retryToUpload taskRule = ", Integer.valueOf(osgVar.ai()));
                d(strC);
            } else {
                otu.b(this.n.getApplicationContext()).d(osgVar, 1);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void d(String str) {
        PluginAchieveAdapter pluginAchieveAdapterJ = oru.a(this.n).getAdapter();
        String strE = osa.e(this.n, "bindDeviceProductId");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "refreshBindDeviceTaskStatusInCloud binderDeviceInfo is empty");
            return;
        }
        String[] strArrSplit = strE.split(",");
        JSONArray jSONArray = new JSONArray();
        String strC = HiDateUtil.c((String) null);
        try {
            for (String str2 : strArrSplit) {
                if (TextUtils.isEmpty(str2)) {
                    LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "refreshBindDeviceTaskStatusInCloud secret is empty");
                } else {
                    String strDecryptData = pluginAchieveAdapterJ.decryptData(str2, this.n);
                    LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "refreshBindDeviceTaskStatusInCloud secretDec == ", strDecryptData);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ParsedFieldTag.KAKA_TASK_UUID, str);
                    jSONObject.put("status", 1);
                    jSONObject.put("productId", strDecryptData);
                    jSONObject.put("timeZone", strC);
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timeZone", strC);
            jSONObject2.put(ParsedFieldTag.KAKA_TASKS, jSONArray);
            jSONObject2.put(ParsedFieldTag.KAKA_TASK_SCENARIO, 0);
            otl otlVar = this.ay;
            if (otlVar != null) {
                otlVar.e(12, jSONObject2);
            }
        } catch (JSONException e) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "JSONException", e.getMessage());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        otl otlVar = this.ay;
        if (otlVar != null) {
            otlVar.d(this);
        }
        if (this.n == null || isFinishing() || isDestroyed()) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "activity is finish");
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        otl otlVar = this.ay;
        if (otlVar != null) {
            otlVar.d(this);
        }
        Handler handler = this.ab;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.ab = null;
        }
        this.an = null;
        oyp oypVar = this.ah;
        if (oypVar != null) {
            oypVar.e();
        }
        ViewFlipper viewFlipper = this.ap;
        if (viewFlipper != null) {
            viewFlipper.removeAllViews();
            this.ap = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (this.an == null) {
            w();
        }
        KakaClaimAnimation kakaClaimAnimation = this.an;
        if (kakaClaimAnimation != null) {
            kakaClaimAnimation.e(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.ay == null) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "doRefresh() mService == null");
        } else {
            c();
        }
    }

    private void c() {
        HashMap map = new HashMap(2);
        map.put("timestamp", String.valueOf(this.az));
        map.put("countryCode", LoginInit.getInstance(this.n).getAccountInfo(1010));
        otl otlVar = this.ay;
        if (otlVar != null) {
            otlVar.a(0, map);
        }
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "doRefreshAchieve() mSyncTimestamp=", Long.valueOf(this.az));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        HashMap map = new HashMap(2);
        otl otlVar = this.ay;
        if (otlVar != null) {
            otlVar.a(11, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        qpx.e(this.n, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "kaka scrollToTask()");
        this.bb.smoothScrollTo(0, 500);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "showNetworkErrorDialog()");
        if (this.at == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "mNetworkErrorTipBar is null");
            return;
        }
        c(getString(i));
        RelativeLayout relativeLayout = this.f22041b;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "achieveKakaTaskReloadLayout is show");
            return;
        }
        this.at.setLeadBtnText(R.string.IDS_hwh_home_healthshop_setting_net_work);
        this.at.setTipText(i);
        this.at.setOnClicked(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommonUtil.t(AchieveKaKaActivity.this.n);
            }
        });
        if (this.at.getVisibility() != 0) {
            b(0);
        }
    }

    @Override // com.huawei.pluginachievement.ui.kakatask.AchieveKaKaTaskClickListener
    public void onTaskClick(String str, String str2, int i) {
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "onTaskClick code =", str, " taskId =", str2, "position =", Integer.valueOf(i));
        if ("4".equals(str)) {
            d(str2, i);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", "1");
        map.put("clickType", str);
        String strValue = AnalyticsValue.KAKA_TASK_1100021.value();
        if (njy.e(this.ba, i)) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "onTaskClick position is out of taskRecyclerViewDatas bounds,return");
            return;
        }
        ozu ozuVarE = this.ba.get(i).e();
        if (ozuVarE == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "onTaskClick achieveKaKaTask is null");
            return;
        }
        map.put("taskID", Integer.valueOf(ozuVarE.k()));
        map.put(ParsedFieldTag.TASK_NAME, ozuVarE.d());
        if (ozuVarE.o() == 0) {
            map.put("isVip", "false");
        } else {
            map.put("isVip", "true");
        }
        if ("0".equals(str)) {
            otu.b(this.n).a(ozuVarE, this.n);
            lmf.d().c(this.n, strValue, map, 0);
            return;
        }
        if ("1".equals(str)) {
            if (!osb.c(this)) {
                LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "showNetworkErrorDialog kakaConvert");
                e(1001, Integer.valueOf(R.string.IDS_hwh_home_group_network_disconnection));
                return;
            }
            osg osgVar = new osg();
            osgVar.b(str2);
            osgVar.n(0);
            otu.b(this.n).d(osgVar, 2);
            lmf.d().c(this.n, strValue, map, 0);
            return;
        }
        if ("3".equals(str)) {
            a(ozuVarE, i);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "task code:", str);
        }
    }

    private void d(String str, int i) {
        if ("0".equals(str)) {
            this.ax = i;
        } else if ("1".equals(str)) {
            this.r = i;
            pap.e(9, 0, this.q);
        } else {
            this.ax = 0;
            this.r = 0;
        }
        this.ba = this.f22040a.b(this.be, this.ax, this.r);
    }

    private void a(final ozu ozuVar, int i) {
        String string;
        if (njy.e(this.ba, i)) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "dealTaskFinished IndexOutOfBoundsException");
            return;
        }
        if (ozuVar.k() == 10001) {
            string = getString(R.string.IDS_contact_confirm_ios_btn);
        } else {
            string = getString(R.string.IDS_plugin_achievement_kaka_see);
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(ozuVar.b());
        builder.a(string, new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ozuVar.k() != 10001) {
                    otu.b(AchieveKaKaActivity.this.n).a(ozuVar, AchieveKaKaActivity.this.n);
                }
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.t = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(true);
        this.t.show();
    }

    private void t() {
        if (this.at != null) {
            b(8);
        }
    }

    private void c(int i) {
        if (this.at == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "handleNetworkError mNetworkErrorTipBar is null");
            this.ad = false;
            return;
        }
        RelativeLayout relativeLayout = this.f22041b;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "achieveKakaTaskReloadLayout is show");
            this.ad = false;
            return;
        }
        if (this.ad) {
            c(getString(i));
            this.ad = false;
        }
        this.at.setTipText(i);
        this.at.setLeadBtnText(-1);
        this.at.setOnClicked(null);
        if (this.at.getVisibility() != 0) {
            b(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(KakaCheckInReturnBody kakaCheckInReturnBody) {
        this.i = kakaCheckInReturnBody;
        this.ah.d();
        if (this.k == null) {
            x();
        }
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            String strE = UnitUtil.e(kakaCheckInReturnBody.getKaka(), 1, 0);
            this.j.setText(Marker.ANY_NON_NULL_MARKER + strE);
            this.l.setText(this.n.getResources().getQuantityString(R.plurals.IDS_achieve_kaka_to_sign_day, kakaCheckInReturnBody.getConDays(), UnitUtil.e((double) kakaCheckInReturnBody.getConDays(), 1, 0), strE));
        }
        d(kakaCheckInReturnBody.getConDays());
        String strReplaceAll = String.valueOf(new Timestamp(System.currentTimeMillis())).substring(0, 10).replaceAll(Constants.LINK, "");
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "CheckedIn:date  == " + strReplaceAll);
        d("kakaLastCheckInTime", strReplaceAll);
        d("kakaCheckedDays", String.valueOf(kakaCheckInReturnBody.getConDays()));
        HashMap map = new HashMap(2);
        map.put(KakaConstants.KAKA_CHACKIN_BI_PARAMS, this.ae.isChecked() ? "1" : "-1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.KAKA_CHECKED_IN_1100046.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<KakaCheckinRecord> list) {
        int iA = this.aj.a(list);
        if (iA > this.o) {
            d(iA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void b(T t) {
        if (t instanceof List) {
            this.au.addAll((List) t);
        }
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "startMessageAnimation mRedeemMessageQueue size = ", Integer.valueOf(this.au.size()));
        if (this.au.size() == 0) {
            this.ap.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout = this.f22041b;
        if (relativeLayout == null || relativeLayout.getVisibility() == 8) {
            this.ap.setVisibility(0);
            aj();
        } else {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "can not show messageFlipper");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        if (this.ap.getVisibility() == 8 && this.au.size() <= 0) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "updateMessageQueue message is empty");
            return;
        }
        GiftRecord giftRecordPoll = this.au.poll();
        while (giftRecordPoll == null && this.au.size() > 0) {
            giftRecordPoll = this.au.poll();
        }
        if (giftRecordPoll != null) {
            LinearLayout linearLayout = this.av;
            LinearLayout linearLayout2 = this.as;
            if (linearLayout == linearLayout2) {
                this.av = this.aq;
            } else {
                this.av = linearLayout2;
            }
            ((HealthTextView) this.av.findViewById(R.id.kaka_msg_text)).setText(getString(R.string.IDS_achieve_kaka_exchanged_user, new Object[]{giftRecordPoll.getNickName(), giftRecordPoll.getAwardName()}));
            this.ap.showNext();
            this.ab.removeMessages(ExceptionCode.CREATE_DOWNLOAD_FILE_FAILED);
            this.ab.sendEmptyMessageDelayed(ExceptionCode.CREATE_DOWNLOAD_FILE_FAILED, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            LogUtil.j("PLGACHIEVE_AchieveKaKaActivity", "updateMessageQueue message is empty");
        }
        if (this.au.size() == 1) {
            this.ah.a();
        }
    }

    private void d(int i) {
        this.o = i;
        String strE = UnitUtil.e(i, 1, 0);
        final SpannableString spannableString = new SpannableString(getResources().getString(R.string.IDS_achieve_kaka_checkin, getResources().getQuantityString(R.plurals.IDS_plugin_achievement_days, i, strE)));
        int iIndexOf = spannableString.toString().indexOf(strE);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.n, R.color.achieve_kaka_color_curkaka_value)), iIndexOf, strE.length() + iIndexOf, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(this.n.getResources().getDimensionPixelSize(qrs.a(3.1f) ? R.dimen.hw_achieve_medal_size_16 : R.dimen.textSizeSubTitle2)), iIndexOf, strE.length() + iIndexOf, 33);
        }
        runOnUiThread(new Runnable() { // from class: oxl
            @Override // java.lang.Runnable
            public final void run() {
                this.f44959a.e(spannableString);
            }
        });
    }

    public /* synthetic */ void e(SpannableString spannableString) {
        this.ag.setText(spannableString);
    }

    private void e(int i, int i2) {
        final int iMin = Math.min(Math.abs(i2 - i) * 50, 1000);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(iMin);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oxj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.d.b(iMin, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        this.q = i2;
    }

    public /* synthetic */ void b(int i, ValueAnimator valueAnimator) {
        String string = valueAnimator.getAnimatedValue().toString();
        try {
            if (valueAnimator.getDuration() == i) {
                string = String.valueOf(Math.max(Integer.parseInt(string), this.q));
            }
        } catch (NumberFormatException e) {
            LogUtil.e("PLGACHIEVE_AchieveKaKaActivity", "totalKakaTextStartAnimation: exception -> " + e.getMessage());
        }
        this.s.setText(UnitUtil.e(CommonUtil.a(string), 1, 0));
    }

    private void ad() {
        this.ar = (LinearLayout) findViewById(R.id.achieve_kaka_mall);
        this.aa = (H5ProWebView) findViewById(R.id.kaka_h5_pro_web_view);
        ddv.b().initH5Pro();
        H5ProClient.preLoadH5MiniProgram(this, KakaConstants.KAKA_H5_PACKAGE_NAME, new H5ProAppLoader.H5ProPreloadCbk() { // from class: com.huawei.pluginachievement.ui.AchieveKaKaActivity.3
            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onSuccess() {
                LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "loadKakaMallH5 preload success");
                AchieveKaKaActivity.this.e(FitnessStatusCodes.MISSING_BLE_PERMISSION, (Object) null);
            }

            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onFailure(int i, String str) {
                LogUtil.e("PLGACHIEVE_AchieveKaKaActivity", String.format("loadKakaMallH5 onFailure: errCode = %s, errMsg = %s", Integer.valueOf(i), str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        H5ProLaunchOption.Builder builderAddPath = new H5ProLaunchOption.Builder().addPath("#/mall");
        if (this.aa != null) {
            ddv.b().loadEmbeddedH5(this.aa, KakaConstants.KAKA_H5_PACKAGE_NAME, builderAddPath);
        }
    }

    private void ak() {
        LogUtil.a("PLGACHIEVE_AchieveKaKaActivity", "triggerRefreshKaKaMall");
        H5ProWebView h5ProWebView = this.aa;
        if (h5ProWebView != null) {
            h5ProWebView.execJs("if (typeof(window.refreshGift) === 'function') {window.refreshGift();}", null);
        }
    }
}
