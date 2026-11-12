package com.huawei.ui.main.stories.discover.provider;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.BaseCardConstructor;
import com.huawei.health.marketing.datatype.RecommendCardBean;
import com.huawei.health.marketing.datatype.RecommendResourceInfo;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.fcn;
import defpackage.inr;
import defpackage.inz;
import defpackage.njy;
import defpackage.qom;
import defpackage.qqf;
import defpackage.tsc;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class MemberCardReader implements MemberBaseCardReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f26442b;
    protected MemberCardListener e;
    private String i;
    private String j;
    private List<RecommendResourceInfo> n;
    private String o;
    private List<Integer> p;
    private String s;
    private String t;
    protected boolean d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f26443c = false;
    protected int f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<Integer> f26441a = Arrays.asList(new Integer[3]);
    private boolean k = false;
    private boolean l = false;
    private boolean h = false;
    private inr m = new inr();
    private int g = -1;

    @Override // com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void queryLabel() {
    }

    public MemberCardReader(Context context) {
        LogUtil.b("VIPCard_", "MemberCardReader");
        if (context != null) {
            this.f26442b = context;
        } else {
            this.f26442b = BaseApplication.b();
        }
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void initCardReader(List<RecommendResourceInfo> list) {
        if (njy.b(list)) {
            LogUtil.b(i(), "recommendResources", list.toString());
            this.n = list;
        } else {
            LogUtil.d(i(), "recommendResources is empty");
        }
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void registerCardListener(MemberCardListener memberCardListener) {
        this.e = memberCardListener;
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void unRegisterListener() {
        this.e = null;
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void setOrder(int i) {
        this.f = i;
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void setDataChangeTrue() {
        LogUtil.b(i(), "setDataChangeTrue");
        this.d = true;
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void setPrivacyStatus(boolean z, boolean z2, inr inrVar) {
        this.l = z;
        this.h = z2;
        this.m = inrVar;
    }

    public boolean b() {
        return this.h;
    }

    public boolean j() {
        return this.l;
    }

    public int a() {
        return this.g;
    }

    public boolean c(String str) {
        inr inrVar = this.m;
        if (inrVar == null || njy.e(inrVar.e())) {
            LogUtil.d(i(), "mLabelsRsp is not set");
            return false;
        }
        for (inz inzVar : this.m.e()) {
            if (!TextUtils.isEmpty(str) && str.equals(inzVar.d())) {
                if (inzVar.c() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(List<Integer> list, MemberBaseCardReader memberBaseCardReader) {
        LogUtil.b(i(), "registerHealthDataStatus");
        HiHealthNativeApi.a(this.f26442b).subscribeHiHealthData(list, new e(memberBaseCardReader));
    }

    public void p() {
        if (njy.b(this.p)) {
            LogUtil.b(i(), "unSubscribeList is not empty");
            HiHealthNativeApi.a(this.f26442b).unSubscribeHiHealthData(this.p, new BaseCardConstructor.InnerHiUnSubscribeListener(i(), "isSuccess: "));
        }
    }

    public void t() {
        LogUtil.b(i(), "reset");
        this.o = null;
        this.t = null;
        this.k = false;
        this.d = false;
    }

    public RecommendResourceInfo d(String str) {
        for (RecommendResourceInfo recommendResourceInfo : this.n) {
            if (!TextUtils.isEmpty(recommendResourceInfo.getLabelScenario()) && !TextUtils.isEmpty(str) && h(recommendResourceInfo.getLabelScenario().trim()).contains(str)) {
                LogUtil.b(i(), "select label ", str);
                return recommendResourceInfo;
            }
        }
        LogUtil.e(i(), "no resources on cloud for card", this.i, " label=", str);
        return null;
    }

    private int g(String str) {
        for (int i = 0; i < this.n.size(); i++) {
            String labelScenario = this.n.get(i).getLabelScenario();
            if (!TextUtils.isEmpty(labelScenario) && !TextUtils.isEmpty(str) && labelScenario.trim().contains(str)) {
                List list = (List) HiJsonUtil.d(labelScenario.trim(), new TypeToken<ArrayList<String>>() { // from class: com.huawei.ui.main.stories.discover.provider.MemberCardReader.1
                }.getType());
                LogUtil.b(i(), "find index of ", str, "the list is ", list);
                int iIndexOf = list.indexOf(str);
                if (iIndexOf != -1) {
                    return iIndexOf;
                }
            }
        }
        LogUtil.e(i(), "no resources on cloud for card", this.i, " label=", str);
        return -1;
    }

    public boolean b(String str) {
        for (RecommendResourceInfo recommendResourceInfo : this.n) {
            if (!TextUtils.isEmpty(recommendResourceInfo.getLabelScenario()) && h(recommendResourceInfo.getLabelScenario().trim()).contains(str)) {
                LogUtil.b(i(), "select label ", str);
                return true;
            }
        }
        LogUtil.e(i(), "no resources on cloud for card", this.i, " label=", str);
        return false;
    }

    public void d(RecommendResourceInfo recommendResourceInfo, Integer num, SpannableString spannableString, Integer num2, qom qomVar) {
        if (m() && l()) {
            LogUtil.b(i(), "callback bean for card ", this.i);
            e(recommendResourceInfo);
            RecommendCardBean recommendCardBeanBuild = new RecommendCardBean.Builder().setBackGround(qqf.d(Uri.parse(recommendResourceInfo.getCoverPicture()))).setTitleColor(num).setTitle(recommendResourceInfo.getRecommendDescription()).setSubtitle(recommendResourceInfo.getResourceName()).setSubtitleDataLine(spannableString).setButtonColor(num2).setButtonText(recommendResourceInfo.getButtonDescription()).setCardId(this.i).setCardStatus(this.t).setResourceId(recommendResourceInfo.getResourceId()).setEventId(this.j).setClickSectionListener(qomVar).setLabelWeights(this.f26441a).setSceneShowArticles(d(recommendResourceInfo)).build();
            if (this.e == null || !njy.b(this.f26441a)) {
                return;
            }
            MemberCardListener memberCardListener = this.e;
            List<Integer> list = this.f26441a;
            memberCardListener.onResponse(list.get(list.size() - 1).intValue(), recommendCardBeanBuild);
            this.k = true;
            return;
        }
        LogUtil.d(i(), "cannot callback for card ", this.i, " mLabelName=", this.o, " mScenario", this.t, " mEventId", this.j);
    }

    public String d(RecommendResourceInfo recommendResourceInfo) {
        if (recommendResourceInfo == null) {
            LogUtil.d(i(), "tmpStrSceneShowAritcles is empty");
            return "";
        }
        String sceneShowArticles = recommendResourceInfo.getSceneShowArticles();
        String strC = c();
        LogUtil.b(i(), "tmpStrSceneShowAritcles:", sceneShowArticles);
        if (TextUtils.isEmpty(sceneShowArticles)) {
            LogUtil.d(i(), "tmpStrSceneShowAritcles is empty");
            return "";
        }
        if (sceneShowArticles.indexOf(strC) == -1) {
            LogUtil.d(i(), "tmpStrSceneShowAritcles.indexOf is -1");
            return "";
        }
        List<String> listH = h(sceneShowArticles);
        if (njy.e(listH)) {
            LogUtil.e(i(), "sceneShowAritclesList is empty");
            return "";
        }
        String strSubstring = listH.get(0);
        if (strSubstring.length() > strC.length() + 1) {
            strSubstring = strSubstring.substring(strC.length() + 1);
        }
        LogUtil.b(i(), "strSceneShowAritcles:", strSubstring);
        return strSubstring;
    }

    private List<String> h(String str) {
        ArrayList arrayList = new ArrayList();
        List<String> list = (List) HiJsonUtil.d(str.trim(), new TypeToken<ArrayList<String>>() { // from class: com.huawei.ui.main.stories.discover.provider.MemberCardReader.2
        }.getType());
        if (njy.e(list)) {
            return arrayList;
        }
        for (String str2 : list) {
            if (str2.contains(c())) {
                arrayList.add(str2);
            }
        }
        LogUtil.b(i(), "getParamContainCardId:", arrayList);
        return arrayList;
    }

    public void e(RecommendResourceInfo recommendResourceInfo) {
        q();
        int iG = g(f());
        String labelPriority = recommendResourceInfo.getLabelPriority();
        LogUtil.b(i(), "card:", c(), " labelPriority is ", labelPriority, "index is ", Integer.valueOf(iG));
        if (recommendResourceInfo == null || TextUtils.isEmpty(labelPriority)) {
            return;
        }
        List listAsList = Arrays.asList(labelPriority.substring(1, labelPriority.length() - 1).split(","));
        if (!njy.c(listAsList, iG)) {
            LogUtil.d(i(), "index is out of bounds");
            return;
        }
        String[] strArrSplit = ((String) listAsList.get(iG)).split(Constants.LINK);
        if (strArrSplit.length == 0) {
            LogUtil.d(i(), "cloud not set weight of labels");
            return;
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            this.f26441a.set(i, Integer.valueOf(CommonUtils.e(strArrSplit[i], -1)));
        }
    }

    private void q() {
        if (this.f26441a == null) {
            this.f26441a = Arrays.asList(new Integer[3]);
        }
        this.f26441a.set(0, -1);
        this.f26441a.set(1, -1);
        this.f26441a.set(2, tsc.f49602b.get(c()));
    }

    public List<Integer> g() {
        return this.f26441a;
    }

    public String e(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d(i(), "linkurl is empty");
            return "";
        }
        String str3 = "?";
        if (str.contains("?")) {
            str3 = "&";
        }
        String[] strArrSplit = str.split(str3);
        if (strArrSplit != null) {
            boolean z = false;
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                if (strArrSplit[i2].contains("pullfrom=")) {
                    strArrSplit[i2] = "pullfrom=" + this.i;
                } else if (strArrSplit[i2].contains("resourceId=")) {
                    strArrSplit[i2] = "resourceId=" + this.t;
                } else if (strArrSplit[i2].contains("resourceName=")) {
                    strArrSplit[i2] = "resourceName=" + str2;
                } else {
                    if (strArrSplit[i2].contains("pullOrder=")) {
                        strArrSplit[i2] = "pullOrder=" + String.valueOf(i + 1);
                    }
                }
                z = true;
            }
            if (z) {
                List listAsList = Arrays.asList(strArrSplit);
                LogUtil.b(i(), "hasBiWords, tmp=", listAsList.toString());
                return String.join(str3, listAsList);
            }
        }
        LogUtil.b(i(), "do not have bi words");
        return str + str3 + "pullfrom=" + this.i + str3 + "resourceName=" + str2 + str3 + "resourceId=" + this.t + str3 + "pullOrder=" + String.valueOf(i + 1);
    }

    protected boolean m() {
        return (TextUtils.isEmpty(this.o) || TextUtils.isEmpty(this.i) || TextUtils.isEmpty(this.t) || TextUtils.isEmpty(this.j)) ? false : true;
    }

    protected boolean l() {
        return njy.b(this.n) && this.e != null;
    }

    public String c() {
        return this.i;
    }

    public void a(String str) {
        this.i = str;
    }

    public String h() {
        return this.t;
    }

    public void f(String str) {
        this.t = str;
    }

    public String f() {
        return this.o;
    }

    public void i(String str) {
        this.o = str;
    }

    public String e() {
        return this.j;
    }

    public void e(String str) {
        this.j = str;
    }

    public boolean n() {
        return this.k;
    }

    public Context d() {
        return this.f26442b;
    }

    public boolean k() {
        return this.d;
    }

    public boolean o() {
        return this.f26443c;
    }

    public void b(boolean z) {
        int i = this.g;
        if (i == -1) {
            this.f26443c = true;
        } else {
            this.f26443c = i != z;
        }
        this.g = z ? 1 : 0;
    }

    public String i() {
        return this.s;
    }

    public void j(String str) {
        this.s = str;
    }

    protected void e(HiHealthData hiHealthData) {
        setDataChangeTrue();
    }

    public void c(int i, RecommendResourceInfo recommendResourceInfo) {
        LogUtil.b(i(), "BaseOnClickSectionListener position is ", Integer.valueOf(i));
        if (LoginInit.getInstance(this.f26442b).isBrowseMode()) {
            LoginInit.getInstance(this.f26442b).browsingToLogin(new IBaseResponseCallback() { // from class: tsh
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f49607a.d(i2, obj);
                }
            }, "");
        } else {
            e(i, recommendResourceInfo);
        }
    }

    public /* synthetic */ void d(int i, Object obj) {
        LogUtil.b(i(), "browsingToLogin onResponse errorCode : ", Integer.valueOf(i));
    }

    protected void e(int i, RecommendResourceInfo recommendResourceInfo) {
        if (recommendResourceInfo == null) {
            LogUtil.b(i(), "recommendResourceInfo is null");
            return;
        }
        fcn.b(BaseApplication.b(), 1, new RecommendCardBean.Builder().setCardId(c()).setCardStatus(h()).setResourceId(recommendResourceInfo.getResourceId()).setTitle(recommendResourceInfo.getRecommendDescription()).setButtonText(recommendResourceInfo.getButtonDescription()).setEventId(e()).build());
        String strE = e(recommendResourceInfo.getCoverLinkValue(), recommendResourceInfo.getRecommendDescription(), i);
        LogUtil.b(i(), "linkurl is ", strE);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(strE, new IBaseResponseCallback() { // from class: tse
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f49605c.e(i2, obj);
                }
            });
        }
    }

    public /* synthetic */ void e(int i, Object obj) {
        LogUtil.b(i(), " onlick errorCode ", Integer.valueOf(i));
    }

    static class e implements HiSubscribeListener {
        private WeakReference<MemberBaseCardReader> e;

        public e(MemberBaseCardReader memberBaseCardReader) {
            this.e = new WeakReference<>(memberBaseCardReader);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            WeakReference<MemberBaseCardReader> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.b("VIPCard_", "mWeakReference is null");
                return;
            }
            MemberBaseCardReader memberBaseCardReader = weakReference.get();
            if (memberBaseCardReader == null) {
                LogUtil.b("VIPCard_", "reader is null");
            } else if (njy.b(list) && (memberBaseCardReader instanceof MemberCardReader)) {
                MemberCardReader memberCardReader = (MemberCardReader) memberBaseCardReader;
                LogUtil.b(memberCardReader.i(), "mSubscribeSleepDataListener onResult");
                memberCardReader.p = list;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            WeakReference<MemberBaseCardReader> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.b("VIPCard_", "mWeakReference is null");
                return;
            }
            MemberBaseCardReader memberBaseCardReader = weakReference.get();
            if (memberBaseCardReader == null) {
                LogUtil.b("VIPCard_", "reader is null");
            } else if (memberBaseCardReader instanceof MemberCardReader) {
                MemberCardReader memberCardReader = (MemberCardReader) memberBaseCardReader;
                LogUtil.b(memberCardReader.i(), "value changed, and newValue is ", hiHealthData);
                memberCardReader.e(hiHealthData);
            }
        }
    }
}
