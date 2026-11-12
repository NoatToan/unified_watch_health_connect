package com.huawei.health.marketing.views.audition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.trade.TradeViewApi;
import com.huawei.trade.datatype.TradeViewInfo;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.bottomsheet.HealthBottomSheet;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.commonui.flowlayout.textviewbuilder.SearchTagTextViewBuilder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet;
import defpackage.gay;
import defpackage.irz;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qle;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.Services;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class AuditionActivity extends Activity implements View.OnClickListener, AuditionPlayerListener, HealthSeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f8441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f8442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f8443c;
    private HealthTextView d;
    private HealthTextView e;
    private String f;
    private HealthTextView g;
    private Map<String, String> h;
    private HealthBottomSheet i;
    private HealthTextView j;
    private HealthFlowLayout k;
    private Context l;
    private boolean m = false;
    private c n = new c(this);
    private HealthSeekBar o;
    private FrameLayout p;
    private SingleGridContent q;
    private View r;

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
    }

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
    }

    public static class c extends BaseHandler<AuditionActivity> {
        c(AuditionActivity auditionActivity) {
            super(auditionActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AuditionActivity auditionActivity, Message message) {
            if (message.what == 1) {
                int iB = gay.a().b();
                auditionActivity.o.setProgress(iB);
                auditionActivity.f8441a.setText(auditionActivity.a(iB));
                sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.audio_preview_layout);
        this.l = this;
        i();
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("AuditionActivity", "intent is null, finish AuditionLayout page");
            finish();
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("resource_bi_map");
        if (serializableExtra instanceof Map) {
            this.h = (Map) serializableExtra;
        }
        this.m = intent.getBooleanExtra("is_vip_expired", false);
        SingleGridContent singleGridContent = (SingleGridContent) intent.getParcelableExtra("audition_content");
        this.q = singleGridContent;
        if (singleGridContent == null) {
            LogUtil.j("AuditionActivity", "mSingleGridContent is null");
            finish();
        }
    }

    private void h() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(this.q.getAuditionLink());
        gay.a().b(this);
        gay.a().c(this.q.getDynamicDataId(), arrayList);
    }

    private void i() {
        HealthBottomSheet healthBottomSheet = (HealthBottomSheet) findViewById(R.id.sliding_layout);
        this.i = healthBottomSheet;
        healthBottomSheet.setIndicateSafeInsetsEnabled(true);
        this.i.setForceShowIndicateEnabled(false);
        this.i.setSheetHeight(0);
        this.f8442b = (ImageView) findViewById(R.id.audition_icon);
        this.f8443c = (ImageView) findViewById(R.id.audition_play_control_btn);
        this.g = (HealthTextView) findViewById(R.id.audition_title);
        this.d = (HealthTextView) findViewById(R.id.audition_flag);
        this.e = (HealthTextView) findViewById(R.id.audition_detail);
        this.k = (HealthFlowLayout) findViewById(R.id.audition_description);
        this.f8441a = (HealthTextView) findViewById(R.id.audition_played_time);
        this.j = (HealthTextView) findViewById(R.id.audition_total_time);
        this.o = (HealthSeekBar) findViewById(R.id.audition_seek_bar);
        this.p = (FrameLayout) findViewById(R.id.audition_vip_layout);
        this.o.setTouchable(true);
        this.o.setOnSeekBarChangeListener(this);
        this.f8443c.setOnClickListener(this);
        this.i.b(new HwBottomSheet.SheetSlideListener() { // from class: com.huawei.health.marketing.views.audition.AuditionActivity.5
            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetSlide(View view, float f) {
            }

            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetStateChanged(View view, HwBottomSheet.SheetState sheetState, HwBottomSheet.SheetState sheetState2) {
                if (sheetState2 == HwBottomSheet.SheetState.COLLAPSED || sheetState2 == HwBottomSheet.SheetState.HIDDEN) {
                    AuditionActivity.this.c(2);
                    AuditionActivity.this.finish();
                }
            }
        });
        findViewById(R.id.content).setOnClickListener(this);
        findViewById(R.id.drag_content).setOnClickListener(this);
    }

    private void d() {
        f();
        if (!TextUtils.isEmpty(this.q.getAuditionDetailUrl())) {
            qqf.a(this.q.getAuditionDetailUrl(), this.f8442b, this.l.getResources().getDimensionPixelOffset(R.dimen.iconCornerRadius));
        }
        this.g.setText(this.q.getTheme());
        if (!TextUtils.isEmpty(this.q.getAuditionDetail())) {
            this.e.setText(this.q.getAuditionDetail());
            this.e.setVisibility(0);
        }
        j();
        this.p.removeAllViews();
        int i = R.color.clover_petal_middle_end;
        int i2 = R.drawable.audition_paid_progressbar_bg;
        if (this.q.getVip() == 1) {
            this.p.setMinimumHeight(getResources().getDimensionPixelOffset(R.dimen.health_common_88dp));
            i = R.color.vip_product_card_border_color_2;
            StringBuilder sb = new StringBuilder("#/PayPopup?payResourceType=");
            sb.append(TextUtils.equals(this.f, "SleepingSeries") ? 7 : 4);
            sb.append("&benefitName=");
            sb.append(this.q.getTheme());
            this.r = ((VipApi) Services.b("vip", VipApi.class)).getVipPayView(this, "", sb.toString(), a());
            i2 = R.drawable.audition_vip_progressbar_bg;
        } else {
            this.p.setMinimumHeight(getResources().getDimensionPixelOffset(R.dimen.health_common_56dp));
            TradeViewInfo tradeViewInfo = new TradeViewInfo(this.q.getDynamicDataId(), 12, "");
            tradeViewInfo.setTrigResName(this.q.getTheme());
            tradeViewInfo.setBiParams(this.h);
            this.r = ((TradeViewApi) Services.b("TradeService", TradeViewApi.class)).getTradeView(this, tradeViewInfo);
        }
        this.p.addView(this.r);
        e(i);
        this.o.setProgressDrawable(this.l.getResources().getDrawable(i2));
        this.f8443c.setBackground(qqf.c(this.l.getDrawable(R.drawable.sport_icon_bg), this.l.getColor(i)));
        this.f8443c.setImageDrawable(qqf.c(this.l.getDrawable(R.mipmap.audition_player_play), this.l.getColor(R.color.healthTintColorPrimaryDark)));
    }

    private void j() {
        SearchTagTextViewBuilder searchTagTextViewBuilder = new SearchTagTextViewBuilder(BaseApplication.getContext());
        if (qrs.v()) {
            this.k.setTagHeight(qrs.d(this.l, 30.0f));
        } else {
            this.k.setTagHeight(qrs.d(this.l, 16.0f));
        }
        searchTagTextViewBuilder.a(R.dimen.textSizeCaption1).d(R.color.textColorSecondary).e(R.string.textFontFamilyRegular).c(R.drawable.label_round_rect_gray);
        this.k.setTextViewBuilder(searchTagTextViewBuilder);
        if (!njy.e(this.q.getAuditionLabel())) {
            this.k.d(c(this.q.getAuditionLabel()), false);
            this.k.setVisibility(0);
        } else {
            this.k.setVisibility(8);
        }
    }

    private void f() {
        String extend = this.q.getExtend();
        if (TextUtils.isEmpty(extend) || !extend.contains("category")) {
            LogUtil.j("AuditionActivity", "parseCategory extentStr is empty");
        } else {
            this.f = extend.substring(8);
        }
    }

    private void e(int i) {
        if (TextUtils.isEmpty(this.q.getCorner())) {
            LogUtil.j("AuditionActivity", "showFlagBtn mSingleGridContent corner is empty");
            this.d.setVisibility(8);
            return;
        }
        int color = ContextCompat.getColor(BaseApplication.getContext(), i);
        try {
            float fD = qrs.d(BaseApplication.getContext(), 4.0f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(fD);
            gradientDrawable.setColor(color);
            this.d.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("AuditionActivity", "IllegalArgumentException");
        }
        this.d.setVisibility(0);
        this.d.setText(this.q.getCorner());
    }

    private Map<String, Object> a() {
        HashMap map = new HashMap(16);
        Map<String, String> map2 = this.h;
        if (map2 == null) {
            return map;
        }
        map.putAll(map2);
        return map;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        LogUtil.a("AuditionActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (this.r == null) {
            d();
            ThreadPoolManager.c().execute(new Runnable() { // from class: gaq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34835b.b();
                }
            });
        } else {
            n();
        }
    }

    public /* synthetic */ void b() {
        h();
        c(0);
        e();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.i.getSheetState() == HwBottomSheet.SheetState.EXPANDED) {
            g();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(500)) {
            LogUtil.j("AuditionActivity", "onClick() view click too fast.");
            return;
        }
        int id = view.getId();
        if (id == R.id.audition_play_control_btn) {
            gay.a().d();
            return;
        }
        if (id == R.id.content) {
            c(3);
            g();
        } else if (id == R.id.drag_content) {
            LogUtil.a("AuditionActivity", "drag_content clicked");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ObserverManagerUtil.e("MARKETING_AUDITION_BTN_REFRESH", Integer.valueOf(R.drawable.ic_player_playback), Integer.valueOf(this.q.getIsPay()));
        gay.a().h();
        gay.a().b((AuditionPlayerListener) null);
        this.n.removeMessages(1);
        ObserverManagerUtil.a("MARKETING_AUDITION_BTN_REFRESH");
        finish();
    }

    private ArrayList<qle> c(List<String> list) {
        ArrayList<qle> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new qle(i, list.get(i), 1));
        }
        return arrayList;
    }

    @Override // com.huawei.health.marketing.views.audition.AuditionPlayerListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.o.setProgress(0);
        int duration = mediaPlayer.getDuration();
        this.o.setMax(duration);
        this.j.setText(a(duration));
        this.n.sendEmptyMessageDelayed(1, 1000L);
    }

    @Override // com.huawei.health.marketing.views.audition.AuditionPlayerListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f8443c.setImageDrawable(qqf.c(this.l.getDrawable(R.mipmap.audition_player_pause), this.l.getColor(R.color.healthTintColorPrimaryDark)));
        ObserverManagerUtil.e("MARKETING_AUDITION_BTN_REFRESH", Integer.valueOf(R.drawable.ic_player_playback));
        this.n.removeMessages(1);
    }

    @Override // com.huawei.health.marketing.views.audition.AuditionPlayerListener
    public void onPlayerPause() {
        this.f8443c.setImageDrawable(qqf.c(this.l.getDrawable(R.mipmap.audition_player_pause), this.l.getColor(R.color.healthTintColorPrimaryDark)));
        ObserverManagerUtil.e("MARKETING_AUDITION_BTN_REFRESH", Integer.valueOf(R.drawable.ic_player_playback));
        this.n.removeMessages(1);
        e();
    }

    @Override // com.huawei.health.marketing.views.audition.AuditionPlayerListener
    public void onPlayerStart() {
        this.f8443c.setImageDrawable(qqf.c(this.l.getDrawable(R.mipmap.audition_player_play), this.l.getColor(R.color.healthTintColorPrimaryDark)));
        ObserverManagerUtil.e("MARKETING_AUDITION_BTN_REFRESH", Integer.valueOf(R.drawable.hiad_linked_video_pause));
        this.n.sendEmptyMessage(1);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i) {
        return new SimpleDateFormat("mm:ss").format(new Date(i));
    }

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
        gay.a().d(healthSeekBar.getProgress());
        c(1);
    }

    private void n() {
        if (this.q.getVip() == 2) {
            LogUtil.a("AuditionActivity", "refreshView tradeview");
            ((TradeViewApi) Services.b("TradeService", TradeViewApi.class)).refreshView(this.r);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gas
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34836b.c();
                }
            });
        }
    }

    public /* synthetic */ void c() {
        LogUtil.a("AuditionActivity", "updateVipStatus");
        ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("audioId", this.q.getDynamicDataId());
        map.put("audioName", this.q.getTheme());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MARKETING_AUDITION.value(), map, 0);
    }

    private void e() {
        String str = this.f;
        if (str != null && !TextUtils.equals(str, "SleepAudio")) {
            LogUtil.j("AuditionActivity", "audioPlayBiEvent not sleep audio");
            return;
        }
        HashMap map = new HashMap();
        map.put("name", this.q.getTheme());
        map.put("click", 1);
        map.put("from", "4");
        map.put("audioId", this.q.getDynamicDataId());
        map.put("BIType", 2);
        map.put("status", Integer.valueOf(gay.a().e() ? 1 : 0));
        map.put("vipMode", Integer.valueOf(this.q.getVip()));
        map.put("resourceLabel", this.q.getAuditionLabel());
        map.put("isSeries", true);
        map.put("isAuditoryClip", true);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SLEEP_RECORD_1090095.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HashMap map = new HashMap();
        map.put("type", 4);
        map.put("from", 5);
        map.put("name", this.q.getTheme());
        map.put("payResourceType", Integer.valueOf(TextUtils.equals(this.f, "SleepingSeries") ? 7 : 4));
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            map.putAll(marketRouterApi.getLastMarketSource());
        }
        Map<String, String> map2 = this.h;
        if (map2 != null) {
            map.put("resourcePositionId", map2.get(WebViewHelp.BI_KEY_PULL_FROM));
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("AuditionActivity", "onActivityResult requestCode=", Integer.valueOf(i), " resultCode=", Integer.valueOf(i2));
        if (i != 0) {
            LogUtil.j("AuditionActivity", "onActivityResult return");
            return;
        }
        int intExtra = intent != null ? intent.getIntExtra("shoppingResult", -1) : -1;
        LogUtil.a("AuditionActivity", "shoppingResult:", Integer.valueOf(intExtra));
        if (intExtra == 0) {
            LogUtil.a("AuditionActivity", "shoppingResult success.");
            this.q.setIsPay(1);
            g();
            return;
        }
        LogUtil.j("AuditionActivity", "shoppingResult fail. resultCode = ", Integer.valueOf(intExtra));
    }

    static class e implements VipCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<AuditionActivity> f8445c;

        e(AuditionActivity auditionActivity) {
            this.f8445c = new WeakReference<>(auditionActivity);
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onSuccess(Object obj) {
            String strValue;
            if (obj == null) {
                LogUtil.j("AuditionActivity", "getVipInfo onSuccess result is null");
                return;
            }
            AuditionActivity auditionActivity = this.f8445c.get();
            if (auditionActivity == null || auditionActivity.isFinishing() || auditionActivity.isDestroyed()) {
                LogUtil.j("AuditionActivity", "AuditionActivity is null");
                return;
            }
            if (obj instanceof UserMemberInfo) {
                UserMemberInfo userMemberInfo = (UserMemberInfo) obj;
                LogUtil.d("AuditionActivity", "getVipInfo mUserMemberInfo = ", userMemberInfo.toString());
                if (userMemberInfo.getMemberFlag() != 1 || irz.d(userMemberInfo)) {
                    return;
                }
                if (auditionActivity.m) {
                    strValue = AnalyticsValue.VIP_RENEWAL_PAY_SUCCESS_EVENT.value();
                } else {
                    strValue = AnalyticsValue.VIP_PAY_SUCCESS_EVENT.value();
                }
                auditionActivity.a(strValue);
                LogUtil.a("AuditionActivity", "vip course, your are vip, close audition page");
                auditionActivity.g();
            }
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onFailure(int i, String str) {
            LogUtil.j("AuditionActivity", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
