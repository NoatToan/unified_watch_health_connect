package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.MemberTypeInfo;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Product;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btw;
import defpackage.fca;
import defpackage.fcn;
import defpackage.fxl;
import defpackage.irz;
import defpackage.njy;
import defpackage.peh;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class MemberInfoCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f8353a;
    private ImageView ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f8355c;
    public boolean d;
    private ImageView e;
    private boolean f;
    private ConstraintLayout g;
    private boolean h;
    private HealthTextView i;
    private HealthCardView j;
    private int k;
    private ViewFlipper l;
    private CopyOnWriteArrayList<LinearLayout> m;
    private LinearLayout n;
    private HealthTextView o;
    private final View.OnClickListener p;
    private List<LinearLayout> q;
    private Observer r;
    private List<Product> s;
    private final View.OnClickListener t;
    private HealthTextView u;
    private View v;
    private HealthTextView w;
    private final View.OnClickListener x;
    private Product y;

    static class e extends BaseHandler<MemberInfoCardView> {
        e(MemberInfoCardView memberInfoCardView) {
            super(memberInfoCardView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MemberInfoCardView memberInfoCardView, Message message) {
            if (memberInfoCardView == null || message == null) {
                LogUtil.j("MemberInfoCardView", "handleMessageWhenReferenceNotNull fragment or msg is null");
                return;
            }
            int i = message.what;
            if (i == 10) {
                memberInfoCardView.b((List<LinearLayout>) null);
            } else {
                if (i != 11) {
                    return;
                }
                memberInfoCardView.b(BaseApplication.b());
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.marketing.views.MemberInfoCardView$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnClickListener {
        AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!LoginInit.getInstance(MemberInfoCardView.this.f8355c).isBrowseMode()) {
                if (MemberInfoCardView.this.k == -1 || MemberInfoCardView.this.k == 5) {
                    fcn.e(2);
                } else {
                    fcn.b(2);
                }
                MemberInfoCardView.this.d();
                return;
            }
            LoginInit.getInstance(MemberInfoCardView.this.f8355c).browsingToLogin(new IBaseResponseCallback() { // from class: fzr
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.a("MemberInfoCardView", "isBrowseMode");
                }
            }, "");
        }
    }

    public MemberInfoCardView(Context context, List<LinearLayout> list, int i) {
        super(context);
        this.f8353a = new e(this);
        this.f8354b = true;
        this.m = new CopyOnWriteArrayList<>();
        this.q = new ArrayList();
        this.d = false;
        this.s = new CopyOnWriteArrayList();
        this.h = true;
        this.f = false;
        this.r = new d(this);
        this.t = new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fcn.b(2);
                MemberInfoCardView.this.c("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&pName=com.huawei.health&path=CustomRenewal&urlType=4");
            }
        };
        this.x = new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MemberInfoCardView.this.k == 4 || MemberInfoCardView.this.k == 5) {
                    fcn.e(2);
                } else {
                    fcn.b(2);
                }
                MemberInfoCardView.this.d();
            }
        };
        this.p = new AnonymousClass3();
        this.f8355c = context;
        b(context);
        if (njy.b(list) && i == 1) {
            b(list);
        }
    }

    public MemberInfoCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8353a = new e(this);
        this.f8354b = true;
        this.m = new CopyOnWriteArrayList<>();
        this.q = new ArrayList();
        this.d = false;
        this.s = new CopyOnWriteArrayList();
        this.h = true;
        this.f = false;
        this.r = new d(this);
        this.t = new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fcn.b(2);
                MemberInfoCardView.this.c("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&pName=com.huawei.health&path=CustomRenewal&urlType=4");
            }
        };
        this.x = new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MemberInfoCardView.this.k == 4 || MemberInfoCardView.this.k == 5) {
                    fcn.e(2);
                } else {
                    fcn.b(2);
                }
                MemberInfoCardView.this.d();
            }
        };
        this.p = new AnonymousClass3();
    }

    public MemberInfoCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8353a = new e(this);
        this.f8354b = true;
        this.m = new CopyOnWriteArrayList<>();
        this.q = new ArrayList();
        this.d = false;
        this.s = new CopyOnWriteArrayList();
        this.h = true;
        this.f = false;
        this.r = new d(this);
        this.t = new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fcn.b(2);
                MemberInfoCardView.this.c("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&pName=com.huawei.health&path=CustomRenewal&urlType=4");
            }
        };
        this.x = new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MemberInfoCardView.this.k == 4 || MemberInfoCardView.this.k == 5) {
                    fcn.e(2);
                } else {
                    fcn.b(2);
                }
                MemberInfoCardView.this.d();
            }
        };
        this.p = new AnonymousClass3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        Log.i("MemberInfoCardView", "initNormalView");
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (this.v == null) {
            this.v = layoutInflater.inflate(R.layout.member_card_msg_view_layout, this);
        }
        if (this.j == null) {
            this.j = (HealthCardView) this.v.findViewById(R.id.member_info_card_view);
        }
        if (this.g == null) {
            this.g = (ConstraintLayout) this.v.findViewById(R.id.member_info_card_layout);
        }
        if (this.n == null) {
            this.n = (LinearLayout) this.v.findViewById(R.id.member_info_card_content);
        }
        if (this.e == null) {
            this.e = (ImageView) this.v.findViewById(R.id.vip_card_wavy_image);
        }
        if (this.e.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.bottomMargin = qqp.a(this.f8355c, -6.0f);
            this.e.setLayoutParams(layoutParams);
        }
        a(context, this.n, this.j);
        if (this.l == null) {
            this.l = (ViewFlipper) this.v.findViewById(R.id.member_inbox_layout);
        }
        this.l.setVisibility(8);
        fcn.e(false);
        a();
    }

    private void a(Context context, LinearLayout linearLayout, HealthCardView healthCardView) {
        if (linearLayout == null || healthCardView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            layoutParams2.setMarginStart(qqp.b(this.f8355c) + ((Integer) safeRegionWidth.first).intValue());
            layoutParams2.setMarginEnd(qqp.b(this.f8355c) + ((Integer) safeRegionWidth.second).intValue());
            layoutParams2.height = -2;
            linearLayout.setLayoutParams(layoutParams2);
        }
        if (this.d) {
            e(linearLayout, healthCardView);
        } else {
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<LinearLayout> list) {
        Log.i("MemberInfoCardView", "initMsgView");
        this.d = true;
        LayoutInflater layoutInflater = (LayoutInflater) this.f8355c.getSystemService("layout_inflater");
        if (this.v == null) {
            this.v = layoutInflater.inflate(R.layout.member_card_msg_view_layout, this);
        }
        if (this.j == null) {
            this.j = (HealthCardView) this.v.findViewById(R.id.member_info_card_view);
        }
        if (this.n == null) {
            this.n = (LinearLayout) this.v.findViewById(R.id.member_info_card_content);
        }
        if (this.e == null) {
            this.e = (ImageView) this.v.findViewById(R.id.vip_card_wavy_image);
        }
        if (this.e.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.bottomMargin = qqp.a(this.f8355c, -14.0f);
            this.e.setLayoutParams(layoutParams);
        }
        this.n.setBackgroundResource(R.drawable.section_recommend_card_bg);
        if (this.g == null) {
            this.g = (ConstraintLayout) this.v.findViewById(R.id.member_info_card_layout);
        }
        e(this.n, this.j);
        if (this.l == null) {
            this.l = (ViewFlipper) this.v.findViewById(R.id.member_inbox_layout);
        }
        e(list);
    }

    private void e(LinearLayout linearLayout, HealthCardView healthCardView) {
        if (linearLayout == null || healthCardView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = -2;
            LogUtil.a("MemberInfoCardView", "refreshMsgCardLayout height", Integer.valueOf(layoutParams2.height));
            layoutParams2.setMargins(qqp.b(this.f8355c) + ((Integer) safeRegionWidth.first).intValue(), qqp.a(this.f8355c, 10.0f), qqp.b(this.f8355c) + ((Integer) safeRegionWidth.second).intValue(), 0);
            linearLayout.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = healthCardView.getLayoutParams();
        if (layoutParams3 instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.height = -2;
            LogUtil.a("MemberInfoCardView", "refreshNormalCardLayout cardView height", Integer.valueOf(layoutParams4.height));
            healthCardView.setLayoutParams(layoutParams4);
        }
        if (this.u == null) {
            this.u = (HealthTextView) this.v.findViewById(R.id.member_card_user_name);
        }
        a(this.u, 16, 10, 0, 0);
        if (this.ab == null) {
            this.ab = (ImageView) this.v.findViewById(R.id.member_card_vip_icon);
        }
        a(this.ab, 4, 6, 0, 0);
        if (this.w == null) {
            this.w = (HealthTextView) this.v.findViewById(R.id.member_card_subtitle);
        }
        a(this.w, 16, 2, 0, 10);
    }

    private boolean b() {
        int i = this.f8355c.getResources().getConfiguration().densityDpi;
        LogUtil.a("MemberInfoCardView", "nowDpi ", Integer.valueOf(i));
        return i > irz.b();
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        if (view == null) {
            LogUtil.j("MemberInfoCardView", "view is null when adjustMsgLayoutMargin.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(qqp.a(this.f8355c, i), qqp.a(this.f8355c, i2), qqp.a(this.f8355c, i3), qqp.a(this.f8355c, i4));
            view.setLayoutParams(layoutParams2);
        }
    }

    private void a() {
        this.u = (HealthTextView) this.v.findViewById(R.id.member_card_user_name);
        this.ab = (ImageView) this.v.findViewById(R.id.member_card_vip_icon);
        HealthTextView healthTextView = (HealthTextView) this.v.findViewById(R.id.member_card_subtitle);
        this.w = healthTextView;
        if (healthTextView != null && b()) {
            this.w.setMaxWidth(qqp.a(this.f8355c, 200.0f));
        }
        this.o = (HealthTextView) this.v.findViewById(R.id.member_card_renewal_manage_text);
        this.i = (HealthTextView) this.v.findViewById(R.id.member_card_button);
        qsp.b(this.o, this.t);
        if (this.f8354b) {
            ObserverManagerUtil.d(this.r, "MEMBER_TYPE_SELECTED");
            ObserverManagerUtil.d(this.r, "USER_MEMBER_INFO_UPDATE");
            this.f8354b = false;
        }
        this.v.setClickable(true);
        e();
    }

    public void e(List<LinearLayout> list) {
        LogUtil.a("MemberInfoCardView", "refreshVipDescriptionInfo");
        if (njy.b(list)) {
            a(list);
        } else if (njy.b(this.m)) {
            a(this.m);
        } else {
            this.l.setVisibility(8);
            LogUtil.a("MemberInfoCardView", "refreshVipDescriptionInfo mMsgViewList is empty");
        }
    }

    private void a(List<LinearLayout> list) {
        this.l.setVisibility(0);
        int i = this.k;
        fcn.e(1, (i == -1 || i == 5) ? 1 : 2);
        fcn.e(true);
        this.l.stopFlipping();
        this.l.removeAllViews();
        Iterator<LinearLayout> it = list.iterator();
        while (it.hasNext()) {
            this.l.addView(it.next());
        }
        if (list.size() > 1) {
            this.l.startFlipping();
        }
        if (b() && (this.l.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.height = qqp.a(this.f8355c, 24.0f);
            layoutParams.setMargins(0, 4, 0, 14);
            this.l.setLayoutParams(layoutParams);
        }
    }

    private void e() {
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LogUtil.a("MemberInfoCardView", "initData isBrowseMode");
            c();
        } else {
            f();
            h();
            j();
            i();
        }
    }

    public List<LinearLayout> getMsgViewList() {
        return this.m;
    }

    public void setMsgViewList(List<LinearLayout> list) {
        this.m.clear();
        if (njy.b(list)) {
            this.m.addAll(list);
        }
    }

    public void setIsMsgView(boolean z) {
        this.d = z;
    }

    public List<LinearLayout> getOuterMsgViewList() {
        return this.q;
    }

    public void setOuterMsgViewList(List<LinearLayout> list) {
        this.q = list;
    }

    private void j() {
        UserMemberInfo userMemberInfoA = irz.a();
        if (userMemberInfoA != null) {
            LogUtil.a("MemberInfoCardView", "refreshWithCachedMemberInfo");
            d(userMemberInfoA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ThreadPoolManager.c().execute(new h(this));
    }

    static class h implements Runnable {
        private WeakReference<MemberInfoCardView> e;

        h(MemberInfoCardView memberInfoCardView) {
            this.e = new WeakReference<>(memberInfoCardView);
        }

        @Override // java.lang.Runnable
        public void run() {
            VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
            if (vipApi == null) {
                LogUtil.a("MemberInfoCardView", "vipApi is null");
            } else {
                vipApi.getVipInfo(new VipCallback() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.h.5
                    @Override // com.huawei.health.vip.api.VipCallback
                    public void onSuccess(Object obj) {
                        MemberInfoCardView memberInfoCardView = (MemberInfoCardView) h.this.e.get();
                        if (memberInfoCardView == null || !(obj instanceof UserMemberInfo)) {
                            LogUtil.e("MemberInfoCardView", "result is not UserMemberInfo");
                        } else {
                            LogUtil.a("MemberInfoCardView", "getVipInfo refresh");
                            memberInfoCardView.d((UserMemberInfo) obj);
                        }
                    }

                    @Override // com.huawei.health.vip.api.VipCallback
                    public void onFailure(int i, String str) {
                        MemberInfoCardView memberInfoCardView = (MemberInfoCardView) h.this.e.get();
                        LogUtil.e("MemberInfoCardView", "getVipMemberInfo onFailure.");
                        if (memberInfoCardView == null || !LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
                            return;
                        }
                        LogUtil.a("MemberInfoCardView", "getVipMemberInfo isBrowseMode");
                        memberInfoCardView.c();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        UserMemberInfo userMemberInfo = new UserMemberInfo();
        userMemberInfo.setMemberFlag(-1);
        SharedPreferenceManager.e(this.f8355c, Integer.toString(10000), "USER_VIP_INFO_KEY", peh.c(userMemberInfo), new StorageParams());
        d(userMemberInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        final String accountInfo = LoginInit.getInstance(this.f8355c).getAccountInfo(1002);
        if (!TextUtils.isEmpty(accountInfo)) {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.1
                @Override // java.lang.Runnable
                public void run() {
                    qsp.b(MemberInfoCardView.this.u, accountInfo);
                }
            });
        }
        HiHealthManager.d(this.f8355c).fetchUserData(new c(this));
    }

    private int e(UserMemberInfo userMemberInfo) {
        if (userMemberInfo == null || userMemberInfo.getMemberFlag() == -1) {
            return -1;
        }
        long nowTime = userMemberInfo.getNowTime();
        long expireTime = userMemberInfo.getExpireTime();
        int autoRenew = userMemberInfo.getAutoRenew();
        int iC = fxl.c(nowTime, expireTime);
        if (nowTime > expireTime) {
            return btw.e() ? 4 : 5;
        }
        if (autoRenew == 1 && this.f) {
            return 1;
        }
        return iC <= 7 ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final UserMemberInfo userMemberInfo) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.4
                @Override // java.lang.Runnable
                public void run() {
                    MemberInfoCardView.this.d(userMemberInfo);
                }
            });
            return;
        }
        int iE = e(userMemberInfo);
        this.k = iE;
        LogUtil.a("MemberInfoCardView", "refreshLayout, status: ", Integer.valueOf(iE));
        a(iE);
        b(iE);
        e(userMemberInfo, iE);
        e(iE);
    }

    private void a(int i) {
        qsp.e(this.j, i == 4 ? R.drawable.personal_vip_gray_bg : R.drawable.personal_vip_light_bg);
    }

    private void b(int i) {
        int i2;
        LogUtil.a("MemberInfoCardView", "refreshUserNameLayout");
        if (Utils.i()) {
            qsp.e((TextView) this.u, R.string.IDS_member_life);
        }
        HealthTextView healthTextView = this.u;
        Context context = getContext();
        if (i == 4) {
            i2 = R.color.textColorPrimaryNoInverse;
        } else {
            i2 = R.color.vip_member_card_text_color;
        }
        qsp.c((TextView) healthTextView, ContextCompat.getColor(context, i2));
        if (i == 3 || i == 1 || i == 2) {
            qsp.c((View) this.ab, 0);
            qsp.e(this.ab, R.drawable.ic_member_card_vip_logo);
        }
    }

    private void e(UserMemberInfo userMemberInfo, int i) {
        int i2;
        HealthTextView healthTextView = this.w;
        Context context = getContext();
        if (i == 4) {
            i2 = R.color.common_black_60alpha;
        } else {
            i2 = R.color.vip_member_card_subtitle_text_color;
        }
        qsp.c((TextView) healthTextView, ContextCompat.getColor(context, i2));
        qsp.a(this.w, a(userMemberInfo, i), true);
    }

    private String a(UserMemberInfo userMemberInfo, int i) {
        if (userMemberInfo == null) {
            LogUtil.j("MemberInfoCardView", "getMemberCardSubtitle userMemberInfo is null");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.IDS_member_life));
        sb.append(" ");
        if (i == -1) {
            return getResources().getString(R.string.IDS_user_member_not_vip_subtitle);
        }
        if (i == 1 || i == 2) {
            sb.append(getResources().getString(R.string.IDS_vip_valid_until, DateFormatUtil.d(userMemberInfo.getExpireTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD)));
        } else {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    return "";
                }
                return getResources().getString(R.string.IDS_vip_expired_subtitle, e(userMemberInfo.getExpireTime()));
            }
            int iC = fxl.c(userMemberInfo.getNowTime(), userMemberInfo.getExpireTime());
            if (iC >= 1) {
                sb.append(getResources().getString(R.string.IDS_vip_expire_until, getResources().getQuantityString(R.plurals.IDS_health_weight_day_local, iC, String.valueOf(iC))));
            } else {
                return this.f8355c.getString(R.string.IDS_vip_des_will_expire_today, DateFormatUtil.d(userMemberInfo.getExpireTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE));
            }
        }
        return sb.toString();
    }

    private String e(long j) {
        return UnitUtil.a(new Date(j), 20);
    }

    private void e(int i) {
        if (i == 3 || i == 2 || i == 1) {
            qsp.b(this.i, getResources().getString(R.string.IDS_vip_renewal));
            qsp.b(this.i, this.x);
        } else if (i == 4 || i == 5) {
            qsp.b(this.i, getResources().getString(R.string.IDS_user_vip_renew));
            qsp.b(this.i, this.p);
        } else if (i == -1) {
            qsp.b(this.i, getResources().getString(R.string.IDS_vip_open_immediately));
            qsp.b(this.i, this.p);
        }
        qsp.c((View) this.i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ThreadPoolManager.c().execute(new b(this));
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MemberInfoCardView> f8363b;

        b(MemberInfoCardView memberInfoCardView) {
            this.f8363b = new WeakReference<>(memberInfoCardView);
        }

        @Override // java.lang.Runnable
        public void run() {
            ((VipApi) Services.b("vip", VipApi.class)).getVipType(new IBaseResponseCallback() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.b.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    List listC = MemberInfoCardView.c(obj);
                    if (njy.e(listC)) {
                        return;
                    }
                    PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
                    if (b.this.f8363b.get() != null && payApi != null) {
                        MemberInfoCardView memberInfoCardView = (MemberInfoCardView) b.this.f8363b.get();
                        memberInfoCardView.s.clear();
                        memberInfoCardView.s.addAll(listC);
                        List listC2 = MemberInfoCardView.c((List<Product>) memberInfoCardView.s);
                        payApi.getProductState(listC2.toString(), new a(listC2));
                        return;
                    }
                    LogUtil.j("MemberInfoCardView", "getProductState payApi is null.");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> c(List<Product> list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            for (Product product : list) {
                if (product != null && product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
                    arrayList.add(product.getProductId());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iIndexOf;
        LogUtil.a("MemberInfoCardView", "jumpTypeSelectActivity");
        if (qrs.r()) {
            LogUtil.a("MemberInfoCardView", "isFastClick");
            return;
        }
        if (this.y == null || njy.e(this.s)) {
            iIndexOf = 0;
        } else {
            for (Product product : this.s) {
                if (product != null && product.getProductId().equals(this.y.getProductId())) {
                    iIndexOf = this.s.indexOf(product);
                }
            }
            iIndexOf = 0;
        }
        AppRouter.c("/OperationBundle/MemberTypeSelectActivity").a("MEMBER_TYPE_SELECT_INDEX", iIndexOf).a(R.anim.fade_in, R.anim.fade_out).b(this.f8355c);
    }

    public void a(int i, int i2, Intent intent) {
        Product product;
        LogUtil.a("MemberInfoCardView", "onActivityResult resultCode: ", Integer.valueOf(i2));
        if (i != 10000) {
            return;
        }
        int intExtra = intent != null ? intent.getIntExtra("shoppingResult", -1) : -1;
        UserMemberInfo userMemberInfoA = irz.a();
        boolean z = userMemberInfoA == null || userMemberInfoA.getMemberFlag() == -1;
        if (intExtra != 0 || (product = this.y) == null) {
            return;
        }
        fcn.e(this.y.getProductName(), 1, fca.a(product) ? 2 : 3, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Product> c(Object obj) {
        if (!njy.b(obj, MemberTypeInfo.class)) {
            LogUtil.a("MemberInfoCardView", "objData not list of MemberTypeInfo");
            return null;
        }
        for (MemberTypeInfo memberTypeInfo : (List) obj) {
            if (memberTypeInfo != null && memberTypeInfo.getMemberType() == 1) {
                List<Product> products = memberTypeInfo.getProducts();
                if (!njy.e(products)) {
                    Collections.sort(products, new Comparator<Product>() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.7
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(Product product, Product product2) {
                            return product.getPriority() - product2.getPriority();
                        }
                    });
                    return products;
                }
            }
        }
        return null;
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f8362c;
        private WeakReference<MemberInfoCardView> e;

        private a(MemberInfoCardView memberInfoCardView, List<String> list) {
            this.e = new WeakReference<>(memberInfoCardView);
            this.f8362c = list;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("MemberInfoCardView", "MemberProductStateCallback onResponse: errorCode = ", Integer.valueOf(i), " objData = ", obj == null ? null : obj.toString());
            MemberInfoCardView memberInfoCardView = this.e.get();
            if (memberInfoCardView == null) {
                LogUtil.j("MemberInfoCardView", "onResponse: memberInfoCardView is null");
                return;
            }
            if (i != 0) {
                LogUtil.j("MemberInfoCardView", "getProductState FAIL.", Integer.valueOf(i));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject((String) obj);
                Iterator<String> it = this.f8362c.iterator();
                while (it.hasNext()) {
                    String strOptString = jSONObject.optString(it.next());
                    if (!TextUtils.isEmpty(strOptString) && strOptString.equals("3")) {
                        memberInfoCardView.f = true;
                        memberInfoCardView.d(irz.a());
                        return;
                    }
                }
            } catch (JSONException e) {
                LogUtil.j("MemberInfoCardView", "getProductState JSONException e.", e.getMessage());
            }
        }
    }

    static class c implements HiCommonListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<MemberInfoCardView> f8365a;

        public c(MemberInfoCardView memberInfoCardView) {
            this.f8365a = new WeakReference<>(memberInfoCardView);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            final MemberInfoCardView memberInfoCardView;
            WeakReference<MemberInfoCardView> weakReference = this.f8365a;
            if (weakReference == null || (memberInfoCardView = weakReference.get()) == null) {
                return;
            }
            if (!njy.b(obj, HiUserInfo.class)) {
                LogUtil.j("MemberInfoCardView", "getDataPlatformInfo data is null or error");
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("MemberInfoCardView", "getDataPlatformInfo userInfos is empty");
                return;
            }
            LogUtil.a("MemberInfoCardView", "fetchUserData onSuccess");
            final String name = ((HiUserInfo) list.get(0)).getName();
            if (TextUtils.isEmpty(name)) {
                LogUtil.j("MemberInfoCardView", "username is empty");
            } else {
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.marketing.views.MemberInfoCardView.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qsp.b(memberInfoCardView.u, name);
                    }
                });
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.a("MemberInfoCardView", "getDataPlatformInfo onFailure.");
        }
    }

    static class d implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<MemberInfoCardView> f8369a;

        public d(MemberInfoCardView memberInfoCardView) {
            this.f8369a = new WeakReference<>(memberInfoCardView);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            MemberInfoCardView memberInfoCardView = this.f8369a.get();
            if (TextUtils.equals(str, "MEMBER_TYPE_SELECTED") && objArr != null && memberInfoCardView != null && objArr.length > 0 && (objArr[0] instanceof Product)) {
                LogUtil.a("MemberInfoCardView", "selected product updated");
                memberInfoCardView.y = (Product) objArr[0];
            }
            if (!TextUtils.equals(str, "USER_MEMBER_INFO_UPDATE") || memberInfoCardView == null) {
                return;
            }
            d(memberInfoCardView, objArr);
            memberInfoCardView.f();
        }

        private void d(MemberInfoCardView memberInfoCardView, Object... objArr) {
            LogUtil.a("MemberInfoCardView", "user member info updated");
            memberInfoCardView.h();
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof UserMemberInfo) {
                    memberInfoCardView.d((UserMemberInfo) obj);
                    return;
                }
            }
            memberInfoCardView.i();
        }
    }
}
