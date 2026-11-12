package com.huawei.ui.main.stories.soical.member;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.operationbundle.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.fcn;
import defpackage.irz;
import defpackage.qhu;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class MemberMoreServiceProvider extends BaseKnitDataProvider {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        ThreadPoolManager.c().execute(new d(sectionBean));
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<SectionBean> f28899a;

        d(SectionBean sectionBean) {
            this.f28899a = new WeakReference<>(sectionBean);
        }

        @Override // java.lang.Runnable
        public void run() {
            VipApi vipApi = (VipApi) Services.b("vip", VipApi.class);
            if (vipApi == null) {
                LogUtil.j("MemberMoreServiceProvider", "refreshVipStateData VipApi is null");
            } else {
                vipApi.getVipTransferBenefits(new VipCallback() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.4
                    @Override // com.huawei.health.vip.api.VipCallback
                    public void onSuccess(Object obj) {
                        LogUtil.a("MemberMoreServiceProvider", "getVipTransferBenefits onSuccess");
                        if (obj instanceof List) {
                            d.this.c(BaseApplication.getContext(), ((List) obj).size() > 0);
                        } else {
                            d.this.c(BaseApplication.getContext(), false);
                        }
                    }

                    @Override // com.huawei.health.vip.api.VipCallback
                    public void onFailure(int i, String str) {
                        LogUtil.a("MemberMoreServiceProvider", "getVipTransferBenefits onFailure");
                        d.this.c(BaseApplication.getContext(), false);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(final Context context, final boolean z) {
            UserMemberInfo userMemberInfoA = irz.a();
            final boolean z2 = userMemberInfoA == null || userMemberInfoA.getNowTime() <= userMemberInfoA.getExpireTime();
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.5
                @Override // java.lang.Runnable
                public void run() {
                    SectionBean sectionBean = (SectionBean) d.this.f28899a.get();
                    if (sectionBean == null) {
                        LogUtil.j("MemberMoreServiceProvider", "SectionBean is null when setData. Return.");
                        return;
                    }
                    HashMap map = new HashMap();
                    if (sectionBean.h() == 411) {
                        d.this.e(context, map, z, z2);
                    } else if (sectionBean.h() == 412) {
                        d.this.a(context, map);
                    } else {
                        LogUtil.a("MemberMoreServiceProvider", "invalid page id return!");
                        return;
                    }
                    sectionBean.c((Object) map);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(final Context context, Map<String, Object> map) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(context.getResources().getString(R.string.IDS_hw_personal_cetenr_help_customer_service));
            arrayList.add(context.getResources().getString(R.string.IDS_vip_redeem_membership_code));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new AnonymousClass3(context));
            arrayList2.add(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    fcn.b();
                    if (!LoginInit.getInstance(context).isBrowseMode()) {
                        d.this.e("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&pName=com.huawei.health&path=MembersExchange&urlType=4");
                    } else {
                        LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.2.3
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj) {
                                LogUtil.a("MemberMoreServiceProvider", "no login go login");
                            }
                        }, "");
                    }
                }
            });
            map.put("LEFT_ICON_TEXT", arrayList);
            map.put("CLICK_EVENT_LISTENER", arrayList2);
            map.put("ITEM_TITLE", context.getResources().getString(R.string.IDS_vip_more_service));
            if (LanguageUtil.ba(context)) {
                i = R.drawable.common_ui_arrow_left;
            } else {
                i = R.drawable.common_ui_arrow_right;
            }
            map.put("RIGHT_ICON_IMAGE", Integer.valueOf(i));
            map.put(CommonConstant.RETKEY.STATUS, 1);
        }

        /* JADX INFO: renamed from: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider$d$3, reason: invalid class name */
        class AnonymousClass3 implements View.OnClickListener {
            final /* synthetic */ Context d;

            AnonymousClass3(Context context) {
                this.d = context;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GRSManager.c(this.d).d("helpCustomerUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.3.5
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(final String str) {
                        if (TextUtils.isEmpty(str)) {
                            LogUtil.j("MemberMoreServiceProvider", "obtainTipsUrlDomain urlDomain is empty");
                        } else {
                            final boolean z = qhu.a(AnonymousClass3.this.d) || d.this.b(AnonymousClass3.this.d);
                            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.3.5.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    int i;
                                    fcn.r();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("url", MemberMoreServiceProvider.c(str, "#/help?cid=11069"));
                                    if (z) {
                                        i = R.string.IDS_hw_personal_cetenr_help_customer_service;
                                    } else {
                                        i = R.string.IDS_hwh_health_vo2max_help;
                                    }
                                    bundle.putInt("title", i);
                                    AppRouter.c("/PluginOperation/WebViewActivity").d(bundle).b(AnonymousClass3.this.d);
                                }
                            });
                        }
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i) {
                        LogUtil.j("MemberMoreServiceProvider", "obtainTipsUrlDomain onCallBackFail");
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(final Context context, Map<String, Object> map, boolean z, boolean z2) {
            int i;
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(context.getResources().getString(R.string.IDS_vip_auto_renew_management));
            }
            arrayList.add(context.getResources().getString(R.string.IDS_hw_personal_cetenr_help_customer_service));
            arrayList.add(context.getResources().getString(R.string.IDS_vip_redeem_membership_code));
            if (z) {
                arrayList.add(context.getResources().getString(R.string.IDS_vip_conversion));
            }
            ArrayList arrayList2 = new ArrayList();
            if (z2) {
                arrayList2.add(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        fcn.h();
                        if (!LoginInit.getInstance(context).isBrowseMode()) {
                            d.this.e("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&pName=com.huawei.health&path=CustomRenewal&urlType=4");
                        } else {
                            LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.1.4
                                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                                /* JADX INFO: renamed from: onResponse */
                                public void a(int i2, Object obj) {
                                    LogUtil.a("MemberMoreServiceProvider", "no login go login");
                                }
                            }, "");
                        }
                    }
                });
            }
            arrayList2.add(new AnonymousClass7(context));
            arrayList2.add(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (!LoginInit.getInstance(context).isBrowseMode()) {
                        d.this.e("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&pName=com.huawei.health&path=MembersExchange&urlType=4");
                    } else {
                        LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.10.3
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj) {
                                LogUtil.a("MemberMoreServiceProvider", "no login go login");
                            }
                        }, "");
                    }
                }
            });
            if (z) {
                arrayList2.add(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.9
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        d.this.e("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&urlType=4&pName=com.huawei.health&path=VipTransfer");
                    }
                });
            }
            map.put("LEFT_ICON_TEXT", arrayList);
            map.put("CLICK_EVENT_LISTENER", arrayList2);
            map.put("ITEM_TITLE", context.getResources().getString(R.string.IDS_vip_more_service));
            if (LanguageUtil.ba(context)) {
                i = R.drawable.common_ui_arrow_left;
            } else {
                i = R.drawable.common_ui_arrow_right;
            }
            map.put("RIGHT_ICON_IMAGE", Integer.valueOf(i));
            map.put(CommonConstant.RETKEY.STATUS, 2);
        }

        /* JADX INFO: renamed from: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider$d$7, reason: invalid class name */
        class AnonymousClass7 implements View.OnClickListener {
            final /* synthetic */ Context d;

            AnonymousClass7(Context context) {
                this.d = context;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GRSManager.c(this.d).d("helpCustomerUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.7.5
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(final String str) {
                        if (TextUtils.isEmpty(str)) {
                            LogUtil.j("MemberMoreServiceProvider", "obtainTipsUrlDomain urlDomain is empty");
                        } else {
                            final boolean z = qhu.a(AnonymousClass7.this.d) || d.this.b(AnonymousClass7.this.d);
                            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.soical.member.MemberMoreServiceProvider.d.7.5.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    int i;
                                    fcn.o();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("url", MemberMoreServiceProvider.c(str, "#/help?cid=11069"));
                                    if (z) {
                                        i = R.string.IDS_hw_personal_cetenr_help_customer_service;
                                    } else {
                                        i = R.string.IDS_hwh_health_vo2max_help;
                                    }
                                    bundle.putInt("title", i);
                                    AppRouter.c("/PluginOperation/WebViewActivity").d(bundle).b(AnonymousClass7.this.d);
                                }
                            });
                        }
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i) {
                        LogUtil.j("MemberMoreServiceProvider", "obtainTipsUrlDomain onCallBackFail");
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(Context context) {
            if (context != null) {
                return LanguageUtil.ag(context) && "JP".equals(LoginInit.getInstance(context).getAccountInfo(1010));
            }
            LogUtil.j("MemberMoreServiceProvider", "isShowJapanCustomer() context is null");
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(String str) {
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(str);
            }
        }
    }

    public static String c(String str, String str2) {
        String str3;
        health.compact.a.util.LogUtil.a("MemberMoreServiceProvider", "getHelpCustomerUrl");
        if (CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) == 1) {
            Locale locale = Locale.ENGLISH;
            String strA = a();
            if (str2 == null) {
                str2 = "";
            }
            str3 = String.format(locale, "/hwtips/help/health_help_all/%s/index.html%s", strA, str2);
        } else {
            str3 = String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=health_help_all", e());
        }
        String str4 = str + str3;
        health.compact.a.util.LogUtil.e("MemberMoreServiceProvider", "getHelpCustomerUrl: url -> ", str4);
        return str4;
    }

    private static String a() {
        String str;
        String strA = LanguageUtil.a(BaseApplication.getContext().getResources().getConfiguration().locale);
        if ("ZH".equalsIgnoreCase(strA) || "BO".equalsIgnoreCase(strA) || "UG".equalsIgnoreCase(strA)) {
            str = "zh-CN";
        } else {
            str = "en-US";
        }
        health.compact.a.util.LogUtil.e("MemberMoreServiceProvider", "getDomesticLanguageTag: languageTag -> ", str);
        return str;
    }

    private static String e() {
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        String str = configuration.locale.getLanguage() + Constants.LINK + configuration.locale.getCountry();
        health.compact.a.util.LogUtil.e("MemberMoreServiceProvider", "getLanguageTag: currentLanguageTag -> ", str);
        return str;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        map.putAll((Map) obj);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
    }
}
