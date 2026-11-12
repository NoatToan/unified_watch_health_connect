package com.huawei.health.marketing.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.marketing.views.MemberBannerCardLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.datatype.DeviceBenefits;
import defpackage.fxr;
import defpackage.irz;
import defpackage.njy;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class MemberBannerCardLayout extends SportBannerLayout {
    private Observer f;
    private MemberInfoCardView g;
    private List<LinearLayout> i;
    private d j;
    private int n;

    @Override // com.huawei.health.marketing.views.SportBannerLayout
    protected boolean getIsForceWholeScreen() {
        return true;
    }

    public MemberBannerCardLayout(Context context) {
        super(context);
        this.f = new b(this);
        this.i = new ArrayList();
        this.n = 2;
        ObserverManagerUtil.d(this.f, "REFRESH_MEMBER_INFO_CARD_VIEW");
        this.j = new d();
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.j, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void b(FrameLayout frameLayout) {
        LogUtil.a("MemberBannerCardLayout", "addMemberInfoView");
        View view = this.g;
        if (view != null) {
            frameLayout.removeView(view);
        }
        this.g = new MemberInfoCardView(this.e, this.i, this.n);
        setNeedExtraHeight(true);
        LogUtil.a("MemberBannerCardLayout", "addMemberInfoView getDeviceBenefits");
        fxr.b(new a(this));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        frameLayout.addView(this.g, layoutParams);
        setExtraCardHeight(getCardHeight());
    }

    @Override // com.huawei.health.marketing.views.SportBannerLayout
    protected void d() {
        b(this.h);
        ViewGroup.LayoutParams layoutParams = this.f8414a.getLayoutParams();
        this.f8414a.setFocusBoxColor(-1);
        this.f8414a.setFocusDotColor(-1);
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = getResources().getDimensionPixelSize(R.dimen.health_common_94dp);
            layoutParams2.gravity = 81;
            this.f8414a.setLayoutParams(layoutParams2);
            this.f8414a.bringToFront();
        }
        this.f8414a.bringToFront();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams3.height = -2;
        layoutParams3.setMargins(0, 0, 0, 0);
        this.h.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCardHeight() {
        MemberInfoCardView memberInfoCardView = this.g;
        if (memberInfoCardView == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = memberInfoCardView.getLayoutParams();
        this.g.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 0), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 0));
        return this.g.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MemberBannerCardLayout> f8348b;

        public a(MemberBannerCardLayout memberBannerCardLayout) {
            this.f8348b = new WeakReference<>(memberBannerCardLayout);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            MemberBannerCardLayout memberBannerCardLayout = this.f8348b.get();
            if (memberBannerCardLayout != null) {
                if (memberBannerCardLayout.g == null) {
                    LogUtil.j("MemberBannerCardLayout", "memberInfoView is null");
                    return;
                } else {
                    LogUtil.a("MemberBannerCardLayout", "GetVipInfoResponseCallback errorCode = ", Integer.valueOf(i));
                    d(i, obj, memberBannerCardLayout);
                    return;
                }
            }
            LogUtil.j("MemberBannerCardLayout", "MemberBannerCardLayout is null");
        }

        private void d(int i, Object obj, final MemberBannerCardLayout memberBannerCardLayout) {
            boolean zIsBrowseMode = LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode();
            memberBannerCardLayout.g.setMsgViewList(null);
            memberBannerCardLayout.i.clear();
            if (i == 0 && njy.b(obj, DeviceBenefits.class) && !zIsBrowseMode) {
                List list = (List) obj;
                LogUtil.a("MemberBannerCardLayout", "handleResultType deviceBenefitsList is ", list.toString());
                if (njy.b(list)) {
                    List<LinearLayout> listA = irz.a(memberBannerCardLayout.e, (List<DeviceBenefits>) list, false);
                    LogUtil.a("MemberBannerCardLayout", "handleResultType deviceBenefitViewList is ", listA);
                    if (njy.b(listA)) {
                        LogUtil.a("MemberBannerCardLayout", "handleResultType deviceBenefitViewList isNotEmpty");
                        memberBannerCardLayout.setNeedExtraHeight(true);
                        memberBannerCardLayout.g.setMsgViewList(listA);
                        memberBannerCardLayout.i.addAll(listA);
                        memberBannerCardLayout.n = 1;
                        HandlerExecutor.b(new AnonymousClass4(memberBannerCardLayout));
                        return;
                    }
                }
            }
            LogUtil.a("MemberBannerCardLayout", "handleResultType downcode");
            if (memberBannerCardLayout.n == 1) {
                LogUtil.a("MemberBannerCardLayout", "handleResultType showType change");
                memberBannerCardLayout.n = 2;
                memberBannerCardLayout.setNeedExtraHeight(false);
                memberBannerCardLayout.g.d = false;
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.marketing.views.MemberBannerCardLayout.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Handler handler = memberBannerCardLayout.g.f8353a;
                        Message messageObtainMessage = handler.obtainMessage();
                        messageObtainMessage.what = 11;
                        handler.sendMessage(messageObtainMessage);
                        memberBannerCardLayout.c();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: com.huawei.health.marketing.views.MemberBannerCardLayout$a$4, reason: invalid class name */
        public class AnonymousClass4 implements Runnable {
            final /* synthetic */ MemberBannerCardLayout e;

            AnonymousClass4(MemberBannerCardLayout memberBannerCardLayout) {
                this.e = memberBannerCardLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                Handler handler = this.e.g.f8353a;
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = 10;
                handler.sendMessage(messageObtainMessage);
                if (this.e.g.d) {
                    return;
                }
                final MemberBannerCardLayout memberBannerCardLayout = this.e;
                handler.post(new Runnable() { // from class: fzo
                    @Override // java.lang.Runnable
                    public final void run() {
                        MemberBannerCardLayout.a.AnonymousClass4.c(memberBannerCardLayout);
                    }
                });
            }

            public static /* synthetic */ void c(MemberBannerCardLayout memberBannerCardLayout) {
                memberBannerCardLayout.setExtraCardHeight(memberBannerCardLayout.getCardHeight());
                memberBannerCardLayout.c();
            }
        }
    }

    static class b implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<MemberBannerCardLayout> f8351c;

        public b(MemberBannerCardLayout memberBannerCardLayout) {
            this.f8351c = new WeakReference<>(memberBannerCardLayout);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            final MemberBannerCardLayout memberBannerCardLayout = this.f8351c.get();
            if (memberBannerCardLayout == null) {
                return;
            }
            LogUtil.a("MemberBannerCardLayout", "initMoreView now");
            int cardHeight = memberBannerCardLayout.getCardHeight();
            if (!memberBannerCardLayout.getNeedExtraHeight() || memberBannerCardLayout.getExtraCardHeight() != cardHeight) {
                LogUtil.a("MemberBannerCardLayout", "height change, layout.resetLayout");
                memberBannerCardLayout.setNeedExtraHeight(true);
                memberBannerCardLayout.setExtraCardHeight(cardHeight);
                memberBannerCardLayout.c();
            }
            LogUtil.a("MemberBannerCardLayout", "notify getDeviceBenefits");
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.marketing.views.MemberBannerCardLayout.b.2
                @Override // java.lang.Runnable
                public void run() {
                    fxr.b(new a(memberBannerCardLayout));
                }
            });
        }
    }

    static class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("MemberBannerCardLayout", "device connect state changed");
            ObserverManagerUtil.e("REFRESH_MEMBER_INFO_CARD_VIEW", true);
        }
    }

    @Override // com.huawei.health.marketing.views.SportBannerLayout, com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("MemberBannerCardLayout", "on destroy");
        ObserverManagerUtil.a(this.f, "REFRESH_MEMBER_INFO_CARD_VIEW");
        BaseApplication.getContext().unregisterReceiver(this.j);
        super.onDestroy();
    }

    @Override // com.huawei.health.marketing.views.SportBannerLayout, com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onActivityResult(int i, int i2, Intent intent) {
        MemberInfoCardView memberInfoCardView = this.g;
        if (memberInfoCardView != null) {
            memberInfoCardView.a(i, i2, intent);
        }
    }
}
