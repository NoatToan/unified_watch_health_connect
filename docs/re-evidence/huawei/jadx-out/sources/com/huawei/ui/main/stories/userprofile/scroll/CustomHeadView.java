package com.huawei.ui.main.stories.userprofile.scroll;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.core.content.ContextCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.up.model.UserInfomation;
import defpackage.fxl;
import defpackage.irz;
import defpackage.lmf;
import defpackage.lod;
import defpackage.lrd;
import defpackage.njy;
import defpackage.oru;
import defpackage.osa;
import defpackage.osb;
import defpackage.oun;
import defpackage.paq;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.wsg;
import defpackage.wsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes19.dex */
public class CustomHeadView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29061a;
    private ImageView aa;
    private ImageView ab;
    private ViewFlipper ac;
    private FrameLayout ad;
    private HealthTextView ae;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f29062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29063c;
    private HealthTextView d;
    private HealthButton e;
    private HealthTextView f;
    private ImageView g;
    private View h;
    private HealthTextView i;
    private boolean j;
    private HealthTextView k;
    private HealthTextView l;
    private PersonalLevelProgress m;
    private HealthTextView n;
    private HealthTextView o;
    private ExecutorService p;
    private View q;
    private View r;
    private LinearLayout s;
    private View t;
    private ImageView u;
    private String v;
    private HealthTextView w;
    private HealthTextView x;
    private ImageView y;
    private HealthTextView z;

    public CustomHeadView(Context context) {
        super(context);
        this.g = null;
        this.f29063c = null;
        this.f29061a = -1;
        this.j = false;
        a(context);
    }

    public CustomHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = null;
        this.f29063c = null;
        this.f29061a = -1;
        this.j = false;
        a(context);
    }

    public CustomHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = null;
        this.f29063c = null;
        this.f29061a = -1;
        this.j = false;
        a(context);
    }

    private void a(Context context) {
        this.f29063c = context;
        View viewA = qre.a(context, R.layout.personal_center_head_info_card, this);
        if (viewA == null) {
            LogUtil.e("CustomHeadView", "init NotFoundException.");
        } else {
            b(viewA);
        }
    }

    private void b(View view) {
        this.f29062b = (LinearLayout) view.findViewById(R.id.gone_layout);
        this.g = (ImageView) view.findViewById(R.id.account_head_picture);
        if (qqs.e(this.f29063c) || (BaseActivity.isFlyme() && qrs.x(this.f29063c))) {
            this.g.getBackground().setAlpha(51);
        }
        this.d = (HealthTextView) view.findViewById(R.id.account_nickname);
        this.s = (LinearLayout) view.findViewById(R.id.level_progress_layout);
        this.n = (HealthTextView) view.findViewById(R.id.personal_level_desc);
        this.k = (HealthTextView) view.findViewById(R.id.personal_level_growth_cn);
        this.l = (HealthTextView) view.findViewById(R.id.personal_level_growth_other);
        this.m = (PersonalLevelProgress) view.findViewById(R.id.personal_level_progress);
        this.h = findViewById(R.id.user_profile_mycal_layout);
        this.q = findViewById(R.id.rank_view);
        this.r = findViewById(R.id.rank_divider);
        this.w = (HealthTextView) findViewById(R.id.user_profile_mycal_num);
        this.f = (HealthTextView) findViewById(R.id.kaka_to_be_collected_text);
        this.x = (HealthTextView) findViewById(R.id.user_profile_user_rank_text);
        this.u = (ImageView) findViewById(R.id.user_profile_user_rank_img);
        this.y = (ImageView) findViewById(R.id.rank_red_point);
        this.ad = (FrameLayout) findViewById(R.id.vip_layout);
        this.aa = (ImageView) findViewById(R.id.vip_card_wavy_image);
        this.ab = (ImageView) findViewById(R.id.vip_state_icon);
        this.ae = (HealthTextView) findViewById(R.id.vip_text);
        this.z = (HealthTextView) findViewById(R.id.vip_description);
        this.ac = (ViewFlipper) findViewById(R.id.vip_inbox_layout);
        this.t = findViewById(R.id.vip_top_stroke);
        if (qrs.v()) {
            ((HealthButton) findViewById(R.id.goto_vip_center)).setVisibility(8);
            HealthButton healthButton = (HealthButton) findViewById(R.id.goto_vip_center_large);
            this.e = healthButton;
            healthButton.setVisibility(0);
            qrs.a(this.ae);
        } else {
            ((HealthButton) findViewById(R.id.goto_vip_center_large)).setVisibility(8);
            this.e = (HealthButton) findViewById(R.id.goto_vip_center);
        }
        this.i = (HealthTextView) findViewById(R.id.kaka_content_text);
        this.o = (HealthTextView) findViewById(R.id.level_content_text);
        if (!irz.j() || CommonUtil.ca()) {
            this.ad.setVisibility(8);
            this.ab.setVisibility(8);
        }
        this.z.setText(this.f29063c.getString(R.string.IDS_user_member_not_vip_tip));
        c();
    }

    public void setOnClickListener(Context context, View.OnClickListener onClickListener) {
        this.f29063c = context;
        this.j = LoginInit.getInstance(context).isBrowseMode();
        Context context2 = this.f29063c;
        if (context2 instanceof BaseActivity) {
            if (CommonUtil.z(context2)) {
                this.g.setOnClickListener(qji.b(onClickListener, (BaseActivity) this.f29063c, true, ""));
                this.d.setOnClickListener(qji.b(onClickListener, (BaseActivity) this.f29063c, true, ""));
            } else {
                this.g.setOnClickListener(onClickListener);
                this.d.setOnClickListener(onClickListener);
            }
            this.h.setOnClickListener(qji.b(this, (BaseActivity) this.f29063c, true, ""));
            this.q.setOnClickListener(qji.b(this, (BaseActivity) this.f29063c, true, ""));
            this.ab.setOnClickListener(qji.b(this, (BaseActivity) this.f29063c, true, ""));
            this.e.setOnClickListener(qji.b(this, (BaseActivity) this.f29063c, true, ""));
            this.ad.setOnClickListener(qji.b(this, (BaseActivity) this.f29063c, true, ""));
            this.s.setOnClickListener(qji.b(this, (BaseActivity) this.f29063c, true, ""));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.e(view)) {
            LogUtil.a("CustomHeadView", "click too fast");
            return;
        }
        if (view == this.q || view == this.s) {
            wsg.a(this.f29063c, 1);
            return;
        }
        if (view == this.h) {
            wsg.b(this.f29063c);
            oru.a(this.f29063c).c(this.f29063c);
            int visibility = this.f.getVisibility();
            HashMap map = new HashMap();
            map.put("click", 1);
            map.put("status", Integer.valueOf(visibility != 0 ? 0 : 1));
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_MINE_MY_KAKA_2040011.value(), map, 0);
            HashMap map2 = new HashMap();
            map2.put("from", "0");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_KAKA_1100007.value(), map2, 0);
            return;
        }
        FrameLayout frameLayout = this.ad;
        if (view == frameLayout || view == this.e || view == this.ab) {
            if (view == frameLayout && this.ac.getVisibility() == 0) {
                return;
            }
            e(view == this.ab ? 2 : 1);
            return;
        }
        LogUtil.j("CustomHeadView", "unknow click");
    }

    public void setHeadImageByResourceId(int i) {
        this.g.setImageResource(i);
    }

    public void setHeadImageByBitmap(Bitmap bitmap) {
        this.g.setImageBitmap(bitmap);
    }

    public void setHeadPictureView(UserInfomation userInfomation) {
        String strC = wsp.c(userInfomation);
        if (!TextUtils.isEmpty(strC) && !"default".equals(strC)) {
            Bitmap bitmapA = qqf.a(this.f29063c, strC);
            if (bitmapA != null) {
                this.g.setImageBitmap(bitmapA);
                return;
            } else {
                e(userInfomation);
                LogUtil.a("CustomHeadView", "setHeadPictureView() btimap is null");
                return;
            }
        }
        LogUtil.a("CustomHeadView", "setHeadPictureView()! headImgPath is null! ");
        setHeadImageByResourceId(R.mipmap.ic_personal_head);
    }

    public void setAccountNickName(String str) {
        LogUtil.a("CustomHeadView", "setAccountNickName name:", str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.v, str)) {
            return;
        }
        this.v = str;
        this.d.setText(str);
    }

    public void a(int i, boolean z) {
        int iG = paq.g(i);
        LogUtil.a("CustomHeadView", "enter updateUserRank(): level = ", Integer.valueOf(i), ", levelType = ", Integer.valueOf(iG));
        try {
            int iMin = Math.min(20, i);
            this.x.setText(this.f29063c.getResources().getString(R.string.IDS_plugin_achievement_level_value_string, Integer.valueOf(iMin)));
            lrd.b(this.q, qre.a(R.string.accessibility_level, Integer.valueOf(iMin)));
        } catch (IllegalFormatConversionException | MissingFormatArgumentException unused) {
            LogUtil.e("CustomHeadView", "string format exception");
        }
        this.u.setImageResource(paq.b(iG));
        this.y.setVisibility(z ? 0 : 8);
        this.n.setText(paq.d(iG));
        c(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0044  */
    private void c(int i) {
        int iD;
        String str;
        int iC;
        int iG = paq.g(i);
        String strE = osa.e(BaseApplication.getContext(), "levelTypeData");
        LogUtil.a("CustomHeadView", "refreshLevelFromSp levelDataStr = ", strE);
        if (TextUtils.isEmpty(strE)) {
            iD = 0;
        } else {
            ArrayList<String> arrayListC = paq.c(strE);
            if (arrayListC.size() >= 2) {
                iD = oun.d(arrayListC.get(1));
                LogUtil.a("CustomHeadView", "LevelType refreshLevelFromSp userGrowthValue = ", Integer.valueOf(iD));
            } else {
                iD = 0;
            }
        }
        int iN = paq.n(iG);
        if (LanguageUtil.z(this.f29063c) || LanguageUtil.br(this.f29063c) || LanguageUtil.bs(this.f29063c)) {
            str = UnitUtil.e(iN, 1, 0) + " / " + UnitUtil.e(iD, 1, 0);
        } else {
            str = UnitUtil.e(iD, 1, 0) + " / " + UnitUtil.e(iN, 1, 0);
        }
        try {
            String string = this.f29063c.getResources().getString(R.string.IDS_level_lock_dec, str);
            this.k.setText(string);
            this.l.setText(string);
        } catch (IllegalFormatConversionException | MissingFormatArgumentException unused) {
            LogUtil.e("CustomHeadView", "string format exception");
        }
        if (!LanguageUtil.f(this.f29063c)) {
            this.l.setVisibility(0);
            this.k.setVisibility(8);
        } else {
            this.l.setVisibility(8);
            this.k.setVisibility(0);
        }
        if (iG < 7) {
            iC = paq.c((iG * 3) + 1);
        } else {
            iC = paq.c(20);
        }
        this.m.e(i, Math.min((((double) iD) * 1.0d) / ((double) iC), 1.0d));
    }

    public void b(int i) {
        this.f.setVisibility(i);
    }

    public void d(String str) {
        this.w.setText(str);
        HealthTextView healthTextView = this.f;
        if (healthTextView != null && healthTextView.getVisibility() == 0) {
            CharSequence text = this.f.getText();
            if (!TextUtils.isEmpty(text)) {
                str = str + "," + ((Object) text);
            }
        }
        lrd.b(this.h, str + "," + qre.f(R.string.IDS_hwh_me_achieve_kaka));
    }

    public void d(int i) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.head_layout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (i == 0) {
            layoutParams.topMargin = this.f29063c.getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        } else {
            layoutParams.topMargin = 0;
        }
        linearLayout.setLayoutParams(layoutParams);
        this.f29062b.setVisibility(i);
        this.s.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final Bitmap bitmap) {
        this.d.post(new Runnable() { // from class: com.huawei.ui.main.stories.userprofile.scroll.CustomHeadView.3
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmapC = CustomHeadView.this.c(bitmap, 200);
                if (bitmapC == null) {
                    LogUtil.j("CustomHeadView", "resize triggered bitmap fail!");
                } else {
                    CustomHeadView.this.g.setImageBitmap(qqf.a(bitmapC));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap c(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, 1.0f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= i || height >= i) {
            matrix.setScale(0.5f, 0.5f);
            width /= 2;
            height /= 2;
        }
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private void e(UserInfomation userInfomation) {
        String strA = wsp.a(userInfomation);
        if (strA == null) {
            LogUtil.j("CustomHeadView", "it's so terrible, as missing the headImage url, we can do nothing!");
            return;
        }
        if (this.p == null) {
            this.p = Executors.newSingleThreadExecutor();
        }
        ExecutorService executorService = this.p;
        if (executorService.submit(new b(strA, executorService, this)).isDone()) {
            LogUtil.a("CustomHeadView", "ImgRequestRunnable submit isDone");
        }
    }

    private void c() {
        if (LanguageUtil.ao(this.f29063c)) {
            this.i.setTextSize(0, qrs.d(this.f29063c, 12.0f));
            this.o.setTextSize(0, qrs.d(this.f29063c, 12.0f));
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<CustomHeadView> f29067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f29068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ExecutorService f29069c;

        b(String str, ExecutorService executorService, CustomHeadView customHeadView) {
            this.f29068b = str;
            this.f29069c = executorService;
            this.f29067a = new WeakReference<>(customHeadView);
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomHeadView customHeadView = this.f29067a.get();
            if (customHeadView == null) {
                return;
            }
            Bitmap bitmapC = qqf.c(customHeadView.f29063c, this.f29068b);
            if (bitmapC != null) {
                customHeadView.e(bitmapC);
                LogUtil.a("CustomHeadView", "get remote head img success send message to update ui");
                if (this.f29069c.submit(new a(customHeadView.f29063c, bitmapC)).isDone()) {
                    LogUtil.a("CustomHeadView", "ImgSaveRunnable submit isDone");
                    return;
                }
                return;
            }
            LogUtil.j("CustomHeadView", "it's overwhelmingly horrible, we can even get the head image from nowhere!");
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f29066a;
        private Bitmap d;

        a(Context context, Bitmap bitmap) {
            this.f29066a = new WeakReference<>(context);
            this.d = bitmap;
        }

        private boolean b() {
            Context context = this.f29066a.get();
            if (context == null) {
                return false;
            }
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
            if (TextUtils.isEmpty(accountInfo)) {
                LogUtil.j("CustomHeadView", "it's strange that we get img bitmap, unkowning the userid ");
                return false;
            }
            if (lod.b(context, accountInfo, this.d) != null) {
                return true;
            }
            LogUtil.e("CustomHeadView", "triggered request success but keeping behavior fail!");
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.a("CustomHeadView", "enter triggred img to save runnable");
            LogUtil.a("CustomHeadView", "Finally,the triggered header img is cached successfully? ", Boolean.valueOf(b()));
        }
    }

    public boolean e() {
        String strE = osa.e(this.f29063c, "kakaLastCheckInTime");
        LogUtil.a("CustomHeadView", "lastTime = ", strE);
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        return osb.a(strE);
    }

    public void c(boolean z, boolean z2) {
        if (this.ad == null || this.r == null) {
            LogUtil.j("CustomHeadView", "showItems page not init");
            return;
        }
        int i = z ? 8 : 0;
        this.h.setVisibility(i);
        this.i.setVisibility(i);
        this.q.setVisibility(0);
        this.r.setVisibility(i);
        if (!z2 || CommonUtil.ca() || z) {
            this.ad.setVisibility(8);
            this.ab.setVisibility(8);
        } else {
            this.ad.setVisibility(0);
            this.ab.setVisibility(0);
        }
    }

    public boolean d(UserMemberInfo userMemberInfo) {
        boolean zIsBrowseMode = LoginInit.getInstance(this.f29063c).isBrowseMode();
        this.j = zIsBrowseMode;
        if (zIsBrowseMode) {
            LogUtil.j("CustomHeadView", "updateVipInfo is browseMode");
            b((List<DeviceBenefits>) null);
        }
        String string = this.f29063c.getString(R.string.IDS_user_member_not_vip_tip);
        String string2 = this.f29063c.getString(R.string.IDS_user_vip_learn_privilege);
        boolean z = false;
        if (userMemberInfo == null) {
            LogUtil.j("CustomHeadView", "mUserMemberInfo is null");
        } else {
            ReleaseLogUtil.c("R_CustomHeadView", "mUserMemberInfo type = ", Integer.valueOf(userMemberInfo.getMemberFlag()));
            this.f29061a = userMemberInfo.getMemberFlag();
            int memberFlag = userMemberInfo.getMemberFlag();
            if (memberFlag == -1) {
                string = this.f29063c.getString(R.string.IDS_user_member_not_vip_tip);
                string2 = this.f29063c.getString(R.string.IDS_user_vip_learn_privilege);
            } else if (memberFlag != 1) {
                LogUtil.j("CustomHeadView", "mUserMemberInfo error type");
            } else if (userMemberInfo.getExpireTime() >= userMemberInfo.getNowTime()) {
                string = e(userMemberInfo);
                string2 = this.f29063c.getString(R.string.IDS_user_vip_center);
                z = true;
            } else {
                string = this.f29063c.getString(R.string.IDS_user_vip_expired);
                this.f29061a = 3;
                string2 = this.f29063c.getString(R.string.IDS_user_vip_renew);
            }
        }
        a(string, z, string2);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_AWARD), accountInfo + "key_is_vip", z);
        return z;
    }

    private void a(String str, boolean z, String str2) {
        this.z.setText(str);
        this.e.setText(str2);
        if (z) {
            this.ae.setTextColor(ContextCompat.getColor(this.f29063c, R.color.vip_member_card_subtitle_text_color));
            this.z.setTextColor(ContextCompat.getColor(this.f29063c, R.color.vip_member_card_subtitle_text_color));
            this.ab.setImageResource(R.mipmap.ic_me_vip_top);
            lrd.b(this.ab, qre.f(R.string.accessibility_is_vip));
            d(this.aa, R.mipmap.personal_vip_light_wavy);
            this.ad.setBackgroundResource(R.drawable.personal_vip_light_bg);
            this.t.setVisibility(0);
            return;
        }
        this.ae.setTextColor(ContextCompat.getColor(this.f29063c, R.color.me_non_vip_title_color));
        this.z.setTextColor(ContextCompat.getColor(this.f29063c, R.color.common_black_60alpha));
        this.ab.setImageResource(R.mipmap.ic_me_non_vip_top);
        lrd.b(this.ab, qre.f(R.string.accessibility_is_not_vip));
        d(this.aa, R.mipmap.personal_vip_gray_wavy);
        this.ad.setBackgroundResource(R.drawable.personal_vip_gray_bg);
        this.t.setVisibility(8);
    }

    private void d(ImageView imageView, int i) {
        if (LanguageUtil.ba(this.f29063c)) {
            Drawable drawable = ContextCompat.getDrawable(this.f29063c, i);
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        imageView.setImageResource(i);
    }

    private String e(UserMemberInfo userMemberInfo) {
        String string;
        int iC = fxl.c(userMemberInfo.getNowTime(), userMemberInfo.getExpireTime());
        LogUtil.a("CustomHeadView", "getVipDescContent getAutoRenew = ", Integer.valueOf(userMemberInfo.getAutoRenew()));
        LogUtil.a("CustomHeadView", "getVipDescContent remainDay = ", Integer.valueOf(iC));
        if (userMemberInfo.getAutoRenew() == 1 || iC > 7) {
            string = this.f29063c.getString(R.string.IDS_user_member_vip, qrk.c(userMemberInfo.getExpireTime()));
        } else if (iC >= 1) {
            string = this.f29063c.getResources().getQuantityString(R.plurals.IDS_user_vip_des_will_expire, iC, UnitUtil.e(iC, 1, 0));
        } else {
            string = this.f29063c.getString(R.string.IDS_vip_des_will_expire_today, DateFormatUtil.d(userMemberInfo.getExpireTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE));
        }
        LogUtil.a("CustomHeadView", "getVipDescContent = ", string);
        return string;
    }

    private void e(int i) {
        if (this.j) {
            LogUtil.j("CustomHeadView", "is browseMode");
            this.j = LoginInit.getInstance(this.f29063c).isBrowseMode();
        } else {
            irz.d(this.f29063c, "from=" + i);
        }
    }

    public void b(List<DeviceBenefits> list) {
        if (this.j && list != null) {
            LogUtil.j("CustomHeadView", "refreshVipDescriptionInfo is browseMode");
            list.clear();
        }
        LogUtil.a("CustomHeadView", "refreshVipDescriptionInfo");
        if (njy.b(list)) {
            LogUtil.a("CustomHeadView", "refreshVipDescriptionInfo mDeviceBenefitInfos = ", Integer.valueOf(list.size()));
            List<LinearLayout> listA = irz.a(this.f29063c, list, true);
            LogUtil.a("CustomHeadView", "refreshVipDescriptionInfo deviceBenefitViewList = ", Integer.valueOf(listA.size()));
            if (njy.b(listA)) {
                d(listA);
                this.z.setVisibility(8);
                this.ac.setVisibility(0);
                return;
            } else {
                this.ac.setVisibility(8);
                this.z.setVisibility(0);
                return;
            }
        }
        this.ac.setVisibility(8);
        this.z.setVisibility(0);
    }

    private void d(List<LinearLayout> list) {
        this.ac.stopFlipping();
        this.ac.removeAllViews();
        Iterator<LinearLayout> it = list.iterator();
        while (it.hasNext()) {
            this.ac.addView(it.next());
        }
        if (list.size() > 1) {
            this.ac.startFlipping();
        }
    }
}
